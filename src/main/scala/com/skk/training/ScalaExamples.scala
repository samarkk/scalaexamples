object ScalaExamples extends App{
  /*
  1. Implement a compose method with the following signature:
def compose[A, B, C]
(g: B => C, f: A => B): A => C = ???
This method must return a function h, which is the composition of the
functions f and g
*/
 def compose[A, B, C](g: B => C, f: A => B): A => C = (x:A) => g(f(x))
  /*
  Implement a fuse method with the following signature:
def fuse[A, B]
(a: Option[A], b: Option[B]): Option[(A, B)] = ???
The resulting Option object should contain a tuple of values from the
Option objects a and b, given that both a and b are non-empty. Use forcomprehensions
  */
 def fuse[A, B](a: Option[A], b: Option[B]): Option[(A, B)] = Option((a.get, b.get))
}
