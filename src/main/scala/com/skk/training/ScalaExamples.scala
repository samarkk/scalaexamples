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
  /*
  Implement a check method, which takes a set of values of type T and a function
of type T => Boolean:
def check[T](xs: Seq[T])(pred: T => Boolean): Boolean = ???
The method must return true if and only if the pred function returns true
for all the values in xs without throwing an exception. Use the check
method as follows:
check(0 until 10)(40 / _ > 0)
The check method has a curried definition: instead of just one parameter
list, it has two of them. Curried definitions allow a nicer syntax when
calling the function, but are otherwise semantically equivalent to singleparameter
list definitions.
*/
def check[T](xs: Seq[T])(pred: T => Boolean): Boolean = try{ xs forall pred} catch{ case ex: Exception => false }
}
