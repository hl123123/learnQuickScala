/**
  *
  *
  * @author huanglin
  * @createTime 2018/1/16 下午11:33
  *
  **/
object topic4 {


  import scala.collection.mutable.ArrayBuffer
  import scala.collection.JavaConverters._
  import scala.collection.mutable.Buffer
  def main(args: Array[String]): Unit = {
    val map = Map("zs"->30,"ls"->31,"ww"->32)
//    println(map("zs"))
    val value = map.getOrElse("li",90)
//    print(value)

    val t1 = map.withDefaultValue(6)
    println(t1)
    val t2 = t1.get("xx")
    println(t2)
    val t3 = map.withDefault(_.length)
    println(t3)
    val t4 = t3.get("xx")
    println(t4)

  }


}
