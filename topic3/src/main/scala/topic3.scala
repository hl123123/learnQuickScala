/**
  *
  *
  * @author huanglin
  * @createTime 2018/1/16 下午11:31
  *
  **/
object topic3 {


    import scala.collection.mutable.ArrayBuffer
    import scala.collection.JavaConverters._
    import scala.collection.mutable.Buffer
    def main(args: Array[String]): Unit = {

      val command = ArrayBuffer("fsa","fdaff","fdsafds")
      val pb = new ProcessBuilder(bufferAsJavaList(command))

      val cmd : Buffer[String] = asScalaBuffer(pb.command())

      print(cmd)
    }



}
