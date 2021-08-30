package Assignment
import scala.math.sqrt
object Q3 extends App
{
   val p1=Point(8,11)
   val p2=Point(2,3)  
   println(p1)
   println(p2)
   print("Distance Between Two Points : ")
   println(p2.distance(p1))

   
   case class Point(a:Int,b:Int)
    {
      def x:Int=a
      def y:Int=b 
      def distance(that:Point)=sqrt((this.x-that.x)*(this.x-that.x)+(this.y-that.y)*(this.y-that.y))
    } 
}