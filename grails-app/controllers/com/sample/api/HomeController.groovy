package com.sample.api


import grails.rest.*
import grails.converters.*


class HomeController {
	static responseFormats = ['json', 'xml']
	
    def index() {

     }

    def create(){
    	// println request.JSON.skills
    	// def user = new User(request.JSON)
    	// println params
        List<Skill> skills = []
    	// def skills = new Skill()
    	request.JSON.skills.each{item->
    		println "kkris " +item
    		def skill = new Skill(item)
    		skills.add(skill)
    	}
        def userType = new UserType()

          userType.userTypeEnum = UserTypeEnum.EMPLOYER

    	new User(username:"krishna singh",email:"searchg@gmail.com",password:"password",skills:skills,userType:userType).save(failOnError:true)
    	// user.save(failOnError:true)
        render "user created" 
    	}
    def getUser(){
    	// def user = User.get('59b0b9b617c36622acb8940a')
    	// println user
    	// def map = [:]
    	// map['user'] = [:]
    	// map['user'].name = "krishna"
    	// map['user']['skills'] = [:]
    	// map['user']['skills']['name'] = "AJavavj"

       respond User.findAll()
    }	

    def updateUser(){
    	def user = User.get("59acfa0e17c3662078cf23ab")
    	user.skills.addToCollection(new Skill(name:"jsp",yearsOfExp:23))
    	user.save(failOnError:true);
    	render "Updated"
    }

    def getUserDetail(){
       def user = User.get('59b0bad117c36622acb8940b')
       println user.userType.userTypeEnum
       println (user.userType.userTypeEnum == UserTypeEnum.EMPLOYER)
        respond user.userType
    }

    def createPost(){
        def user = User.get('59b0bad117c36622acb8940b')
        def post = new Post(title:"First Post",subTitle:"First sub post",isPosted:true,description:"Grialsd is an awesome framework");
        user.addToPosts(post);
        user.save()
        render "Great done"
    }


 
}
