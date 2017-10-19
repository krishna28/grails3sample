package com.sample.api


import grails.rest.*
import grails.converters.*

class PostController extends RestfulController {
    static responseFormats = ['json', 'xml']
    PostController() {
        super(Post)
    }

    protected Post queryForResource(java.io.Serializable id){
        def userid = params.SecUserId
        def userins = SecUser.where{
            id == userid
        }.find()
        println "user is ${userins}"

        // println "user status ${user.equals(userins)}"
        def post = Post.where{
            id == id && user == userins
        }.find()
        post
    }
    protected java.util.List<Post> listAllResources(java.util.Map params){
    	println "krishna params are as follws " + params
       def userid = params.SecUserId
    	def user = SecUser.where{
    		id == userid
    	}.find()
    	def result = Post.findAllByUser(user)
        result
    }

    protected Post saveResource(Post resource) {
        println "respource is caklkled ${resource}"
        resource.save flush: true
    }

    // protected Integer countResources() {
    //     def userid = params.SecUserId
    //     def user = SecUser.where{
    //         id == userid
    //     }.find()
    //     def result = Post.findAllByUser(user)
    //     result.count()
    // }


    // protected Post getObjectToBind(){
    //     println "yes inside thge bind properties ${params}"
    //    println "yes inside thge bind properties ${request.JSON}"
    //     Post post = new Post()
    //     bindData(post, request.JSON, [exclude: ['user']])
    //     post
    // }
}
