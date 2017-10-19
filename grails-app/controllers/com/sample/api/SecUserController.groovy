package com.sample.api


import grails.rest.*
import grails.converters.*

class SecUserController extends RestfulController {
    static responseFormats = ['json', 'xml']
    SecUserController() {
        super(SecUser)
    }
}
