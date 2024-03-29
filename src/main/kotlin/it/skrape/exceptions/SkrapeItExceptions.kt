package it.skrape.exceptions


class ElementNotFoundException(selector: String): Exception("Could not find element \"$selector\"")

class DocumentNotParsable(documentToParse: String): Exception("Could not parse string \n\"$documentToParse\"")

class UnsupportedRequestOptionException(message:String): IllegalArgumentException(message)
