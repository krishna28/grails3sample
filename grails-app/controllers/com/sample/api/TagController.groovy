package com.sample.api


import grails.rest.*
import grails.converters.*

class TagController extends RestfulController {
    static responseFormats = ['json', 'xml']
    TagController() {
        super(Tag)
    }
}
