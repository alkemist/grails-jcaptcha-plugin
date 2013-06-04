grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
		mavenLocal()
		mavenCentral()
		mavenRepo 'http://maven.jahia.org/maven2/'
	}

	dependencies {

		compile 'com.octo.captcha:jcaptcha-api:1.0'

		compile 'com.octo.captcha:jcaptcha:1.0', {
			excludes 'commons-collections', 'commons-logging', 'imaging', 'jcaptcha-api', 'jcaptcha-common-test', 'servlet-api'
		}

		compile 'com.jhlabs:imaging:01012005'
	}

	plugins {
		build ':release:2.2.1', ':rest-client-builder:1.0.3', {
			export = false
		}
	}
}
