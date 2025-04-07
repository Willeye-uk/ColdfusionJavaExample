<cfscript>

j = createObject('java',"ExampleJavaClass").init();
dump(j.getGreeting('Tom'));
dump(j.newBook(1));

</cfscript>