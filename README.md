# courses-ReSTAPI
A ReST API created for CRUD operations on resources for various programming languages, frameworks and technologies.

Deployed the API on Heroku.

Operations you can perform:

`FOR TOPICS`

GET https://courses-api-spring.herokuapp.com/topics 
Gives you list of all topics

GET https://courses-api-spring.herokuapp.com/topics/{topicid}
Gives you the particular topic you have accessed

POST https://courses-api-spring.herokuapp.com/topics
Create a new topic

PUT https://courses-api-spring.herokuapp.com/topics/{topicid}
Update a topic with the given topicd

DELETE https://courses-api-spring.herokuapp.com/topics/{topicid}
Delete a topic with the given topicid

`FOR COURSES`

GET https://courses-api-spring.herokuapp.com/topics/{topicid}/courses
Gives you list of all courses for that topic

GET https://courses-api-spring.herokuapp.com/topics/{topicid}/courses/{coursesid}
Gives you the particular course you have accessed in that topic

POST https://courses-api-spring.herokuapp.com/topics/{topicid}/courses
Create a new course in that topic

PUT https://courses-api-spring.herokuapp.com/topics/{topicid}/courses/{courseid}
Update a course for the given courseid for a particular topic

DELETE https://courses-api-spring.herokuapp.com/topics/{topicid}/courses/{courseid}
Delete a course with the given courseid for a particular topic
