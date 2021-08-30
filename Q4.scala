package Assignment

object Q4 extends App
{
  val p1=Point(2,3)
  val p2=p1.invert()
  println(p1)
  print("Invert : ")
  println(p2)
  case class Point(a:Int,b:Int)
  {
    def x:Int=a
    def y:Int=b 
    def invert()=Point(this.y,this.x)
  }
}