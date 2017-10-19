

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.sample.api.SecUser'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.sample.api.SecUserSecRole'
grails.plugin.springsecurity.authority.className = 'com.sample.api.SecRole'
// grails.plugin.springsecurity.controllerAnnotations.staticRules = [
// 	[pattern: '/',               access: ['permitAll']],
// 	[pattern: '/error',          access: ['permitAll']],
// 	[pattern: '/index',          access: ['permitAll']],
// 	[pattern: '/index.gsp',      access: ['permitAll']],
// 	[pattern: '/shutdown',       access: ['permitAll']],
// 	[pattern: '/assets/**',      access: ['permitAll']],
// 	[pattern: '/**/js/**',       access: ['permitAll']],
// 	[pattern: '/**/css/**',      access: ['permitAll']],
// 	[pattern: '/**/images/**',   access: ['permitAll']],
// 	[pattern: '/**/favicon.ico', access: ['permitAll']]
// ]

// grails.plugin.springsecurity.filterChain.chainMap = [
// 	[pattern: '/assets/**',      filters: 'none'],
// 	[pattern: '/**/js/**',       filters: 'none'],
// 	[pattern: '/**/css/**',      filters: 'none'],
// 	[pattern: '/**/images/**',   filters: 'none'],
// 	[pattern: '/**/favicon.ico', filters: 'none'],
// 	[pattern: '/**',             filters: 'JOINED_FILTERS']
// ]

//rest configuration
// grails.plugin.springsecurity.rest.token.storage.useGorm = true // since using gorm for token storage
// grails.plugin.springsecurity.rest.token.generation.useSecureRandom = true

grails.plugin.springsecurity.useSecurityEventListener = true

grails.plugin.springsecurity.rest.token.storage.jwt.useSignedJwt = true
grails.plugin.springsecurity.rest.token.storage.jwt.secret ='qrD6h8K6S9503A06Y6Rfk21TErImPYqa'
grails.plugin.springsecurity.rest.token.storage.jwt.expiration = 3600
grails.plugin.springsecurity.rest.login.active = true
grails.plugin.springsecurity.rest.login.useJsonCredentials = true // can use json a request parameter
grails.plugin.springsecurity.rest.login.usernamePropertyName = 'username' // field of username parameter
grails.plugin.springsecurity.rest.login.passwordPropertyName = 'password' // field of pasword parameter
grails.plugin.springsecurity.rest.login.useRequestParamsCredential = true


grails.plugin.springsecurity.rest.logout.endpointUrl = '/api/logout'
grails.plugin.springsecurity.rest.login.endpointUrl = '/api/login'
grails.plugin.springsecurity.rest.login.failureStatusCode = 401
//token validate
grails.plugin.springsecurity.rest.token.validation.useBearerToken = true
grails.plugin.springsecurity.rest.token.validation.active=true
grails.plugin.springsecurity.rest.token.validation.endpointUrl='/api/validate'
//end of rest configuration

grails.plugin.springsecurity.logout.afterLogoutUrl = '/'
grails.plugin.springsecurity.logout.postOnly = false
grails.plugin.springsecurity.successHandler.defaultTargetUrl = '/home'
grails.plugin.springsecurity.successHandler.ajaxSuccessUrl = '/home'
grails.plugin.springsecurity.securityConfigType = 'InterceptUrlMap'
// grails.plugin.springsecurity.interceptUrlMap = [
//                [pattern: '/',               access: ['permitAll']],
//                [pattern: '/home/**',        access: ['ROLE_USER']],
//                [pattern: '/error',          access: ['permitAll']],
//                [pattern: '/index',          access: ['permitAll']],
//                [pattern: '/index.gsp',      access: ['permitAll']],
//                [pattern: '/shutdown',       access: ['permitAll']],
//                [pattern: '/assets/**',      access: ['permitAll']],
//                [pattern: '/**/js/**',       access: ['permitAll']],
//                [pattern: '/**/css/**',      access: ['permitAll']],
//                [pattern: '/**/images/**',   access: ['permitAll']],
//                [pattern: '/**/favicon.ico', access: ['permitAll']],
//                [pattern:  '/login/**', access:['IS_AUTHENTICATED_ANONYMOUSLY']],
//                [pattern: '/**',         access: ['IS_AUTHENTICATED_FULLY']],
// ]


grails.plugin.springsecurity.interceptUrlMap = [
		[pattern: '/',               access: ['permitAll']],
		[pattern: '/api/home/**',    access: ['ROLE_USER']],
		[pattern: '/api/user/**',    access: ['ROLE_USER']],
		[pattern: '/api/tag/**',     access: ['ROLE_USER']],
		[pattern: '/error',          access: ['permitAll']],
		[pattern: '/index',          access: ['permitAll']],
		[pattern: '/index.gsp',      access: ['permitAll']],
		[pattern: '/shutdown',       access: ['permitAll']],
		[pattern: '/assets/**',      access: ['permitAll']],
		[pattern: '/**/js/**',       access: ['permitAll']],
		[pattern: '/**/css/**',      access: ['permitAll']],
		[pattern: '/**/images/**',   access: ['permitAll']],
		[pattern: '/**/favicon.ico', access: ['permitAll']],
		[pattern:  '/login/**',      access:['IS_AUTHENTICATED_ANONYMOUSLY']],
		[pattern: '/**',             access: ['IS_AUTHENTICATED_FULLY']],
		[pattern: '/api/**',         access: ['IS_AUTHENTICATED_FULLY']]
]
