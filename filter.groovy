def json = new groovy.json.JsonSlurper().parseText(message.getBody(String))
def activeItems = json.items.findAll { it.status == "ACTIVE" }
message.setBody(new groovy.json.JsonBuilder([items: activeItems]).toString())
return message
