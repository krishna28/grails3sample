package com.sample.api


import grails.rest.*
import grails.converters.*

class CommentController extends RestfulController {
    static responseFormats = ['json', 'xml']
    CommentController() {
        super(Comment)
    }

     protected Comment queryForResource(java.io.Serializable id){
        def postId = params.PostId
        def postInstance = Post.where{
            id == postId
        }.find()
        def comment = Comment.where{
            id == id && post == postInstance
        }.find()
        comment
    }

    protected java.util.List<Comment> listAllResources(java.util.Map params){
       def postId = params.PostId
    	def post = Post.where{
    		id == postId
    	}.find()
    	def result = Comment.findAllByPost(post)
        result
    }
}
