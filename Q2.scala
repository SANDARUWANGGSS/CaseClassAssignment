package Assignment

object Q2 extends App
{
  val p1=Point(2,3)
  val p2=p1.move(2,4)
  println(p1)
  println(p2)
  case class Point(a:Int,b:Int)
  {
    def x:Int=a
    def y:Int=b 
    def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  }
}