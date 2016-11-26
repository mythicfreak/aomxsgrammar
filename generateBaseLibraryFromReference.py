

# set this to the location of the 'Java' reference source directory excluding the java package (i.e. the path should end in '/src/aom/scripting')
# (can be an abosulte or a relative path)
referenceDir = '../../workspace/AoMreference/src/aom/scripting/'


included = [
	'ui/console/AIDebug',
	'ui/console/Camera',
	'ui/console/Campaign',
	'ui/console/Chat',
	'ui/console/Cinematic',
	'ui/console/Console',
	'ui/console/Files',
	'ui/console/Gadget',
	'ui/console/Groups',
	'ui/console/Help',
	'ui/console/Lightning',
	'ui/console/Mode',
	'ui/console/Multiplayer',
	'ui/console/Selection',
	'ui/console/Terrain',
	'ui/console/Track',
	'ui/console/Unit',
	'xs/ai/ArtificialIntelligence',
	'xs/ai/Communication',
	'xs/ai/Economy',
	'xs/ai/EventHandler',
	'xs/ai/GodPower',
	'xs/ai/Military',
	'xs/ai/Plan',
	'xs/ai/Task',
	'xs/ai/Wall',
	'xs/kb/Action',
	'xs/kb/Area',
	'xs/kb/Army',
	'xs/kb/Base',
	'xs/kb/BuildingPlacement',
	'xs/kb/Escrow',
	'xs/kb/KnowledgeBase',
	'xs/kb/Path',
	'xs/kb/Player',
	'xs/kb/Progression',
	'xs/kb/Query',
	'xs/kb/Resource',
	'xs/kb/TargetSelector',
	'xs/kb/TechTree',
	'xs/kb/Unit',
	'xs/kb/UnitPick',
	'xs/rm/Area',
	'xs/rm/Connection',
	'xs/rm/Constraint',
	'xs/rm/Converter',
	'xs/rm/FairLoc',
	'xs/rm/ObjectDef',
	'xs/rm/Player',
	'xs/rm/RandomMap',
	'xs/rm/Trigger',
	'xs/tr/Campaign',
	'xs/tr/Chat',
	'xs/tr/Cinematic',
	'xs/tr/Multimedia',
	'xs/tr/Player',
	'xs/tr/QuestVar',
	'xs/tr/Selection',
	'xs/tr/Triggers',
	'xs/tr/Unit',
	'xs/tr/UserInterface',
	'xs/tr/VictoryConditions',
	'xs/xs/ExternalSubroutines',
	'xs/xs/Rule',
	'xs/xs/Vector',
]




import sys, os.path, re

folder = os.path.dirname(sys.argv[0])

for inc in included:
	file = os.path.join(folder, referenceDir, inc+'.java')
	
	with open(file) as java:
		t = java.read()
		t = re.sub('^(.|\n)*?class.*?\{', '', t)
		t = re.sub('private.*?\((.|\n)*?\}', '', t)
		t = re.sub('\}.*$', '', t)
		t = t.replace('public final', 'extern const')
		t = t.replace('public native ', '')
		t = re.sub('\\blong\\b', 'int', t)
		t = re.sub('\)\s*;', '){}', t)
		t = re.sub('vector (\w+)\s*([;,)])', 'vector \\1=vector(0,0,0)\\2', t)
		t = re.sub('string (\w+)\s*([;,)])', 'string \\1=""\\2', t)
		t = re.sub('(int|float|bool) (\w+)\s*([;,)])', '\\1 \\2=0\\3', t)
		t = re.sub('\\bactive=', 'active_=', t)
		t = re.sub('\\brunImmediately=', 'runImmediately_=', t)
		t = re.sub('\\bgroup=', 'group_=', t)
		t = t.replace('vector vector(float x=0, float y=0, float z=0){}', '')
		
		xsfile = os.path.join(folder, inc+'.xs')
		os.makedirs(os.path.dirname(xsfile),exist_ok=True)
		with open(xsfile, 'w') as xs:
			xs.write(t)

with open(os.path.join(folder, '__std__.xs'), 'w') as std:
	for inc in included:
		std.write('include "'+inc+'.xs";\n')

