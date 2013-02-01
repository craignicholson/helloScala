import com.mongodb.casbah.Imports._

object Hi 
{ 
	def main(args: Array[String]) = println("Hi!") 

	//attempt to query mongo
	//http://stackoverflow.com/questions/11681365/scala-mongodb-how-to
  val mongoColl = MongoConnection()("casbah_test")("test_data")
  val user1 = MongoDBObject("user" -> "bwmcadams",
                          "email" -> "~~brendan~~<AT>10genDOTcom")
val user2 = MongoDBObject("user" -> "someOtherUser")
mongoColl += user1
mongoColl += user2
mongoColl.find()
// com.mongodb.casbah.MongoCursor =
// MongoCursor{Iterator[DBObject] with 2 objects.}

for { x <- mongoColl} yield x
/* Iterable[com.mongodb.DBObject] = List(
    { "_id" : { "$oid" : "4c3e2bec521142c87cc10fff"} ,
      "user" : "bwmcadams" ,
      "email" : "~~brendan~~<AT>10genDOTcom"},
     { "_id" : { "$oid" : "4c3e2bec521142c87dc10fff"} ,
      "user" : "someOtherUser"}
 ) */


val q = MongoDBObject("user" -> "someOtherUser")
val cursor = mongoColl.find(q)
// cursor: com.mongodb.casbah.MongoCursor =
//    MongoCursor{Iterator[DBObject] with 1 objects.}

val user = mongoColl.find()
// user: Option[com.mongodb.DBObject] =
/* Some({ "_id" : { "$oid" : "4c3e2bec521142c87dc10fff"} ,
        "user" : "someOtherUser"}) */

mongoColl.findOne(q).foreach { x =>
    // do some work if you found the user...
    println("Found a user! %s".format(x("user")))
}



}
