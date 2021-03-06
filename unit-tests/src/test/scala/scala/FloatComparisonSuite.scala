package scala

object FloatComparisonSuite extends tests.Suite {
  test("fcmp") {
    // These were code-generated on the JVM using:
    //
    // scala> val values = Seq(("0.0f", 0.0f),
    //                         ("-0.0f", -0.0f),
    //                         ("Float.MaxValue", Float.MaxValue),
    //                         ("Float.MinValue", Float.MinValue),
    //                         ("Float.NaN", Float.NaN),
    //                         ("42.0f", 42.0f),
    //                         ("-42.0f", -42.0f),
    //                         ("Float.PositiveInfinity", Float.PositiveInfinity),
    //                         ("Float.NegativeInfinity", Float.NegativeInfinity))
    //
    // scala> val ops = Seq(("<", (_: Float) < (_: Float)),
    //                      ("<=", (_: Float) <= (_: Float)),
    //                      (">", (_: Float) > (_: Float)),
    //                      (">=", (_: Float) >= (_: Float)),
    //                      ("==", (_: Float) == (_: Float)),
    //                      ("!=", (_: Float) != (_: Float)))
    //
    // scala> values.flatMap { case (s1, v1) =>
    //          values.flatMap { case (s2, v2) =>
    //            ops.map { case (op, f) =>
    //              s"assert(($s1 $op $s2) == ${f(v1, v2)})"
    //            }
    //          }
    //        }.foreach(println)
    assert((0.0f < 0.0f) == false)
    assert((0.0f <= 0.0f) == true)
    assert((0.0f > 0.0f) == false)
    assert((0.0f >= 0.0f) == true)
    assert((0.0f == 0.0f) == true)
    assert((0.0f != 0.0f) == false)
    assert((0.0f < -0.0f) == false)
    assert((0.0f <= -0.0f) == true)
    assert((0.0f > -0.0f) == false)
    assert((0.0f >= -0.0f) == true)
    assert((0.0f == -0.0f) == true)
    assert((0.0f != -0.0f) == false)
    assert((0.0f < Float.MaxValue) == true)
    assert((0.0f <= Float.MaxValue) == true)
    assert((0.0f > Float.MaxValue) == false)
    assert((0.0f >= Float.MaxValue) == false)
    assert((0.0f == Float.MaxValue) == false)
    assert((0.0f != Float.MaxValue) == true)
    assert((0.0f < Float.MinValue) == false)
    assert((0.0f <= Float.MinValue) == false)
    assert((0.0f > Float.MinValue) == true)
    assert((0.0f >= Float.MinValue) == true)
    assert((0.0f == Float.MinValue) == false)
    assert((0.0f != Float.MinValue) == true)
    assert((0.0f < Float.NaN) == false)
    assert((0.0f <= Float.NaN) == false)
    assert((0.0f > Float.NaN) == false)
    assert((0.0f >= Float.NaN) == false)
    assert((0.0f == Float.NaN) == false)
    assert((0.0f != Float.NaN) == true)
    assert((0.0f < 42.0f) == true)
    assert((0.0f <= 42.0f) == true)
    assert((0.0f > 42.0f) == false)
    assert((0.0f >= 42.0f) == false)
    assert((0.0f == 42.0f) == false)
    assert((0.0f != 42.0f) == true)
    assert((0.0f < -42.0f) == false)
    assert((0.0f <= -42.0f) == false)
    assert((0.0f > -42.0f) == true)
    assert((0.0f >= -42.0f) == true)
    assert((0.0f == -42.0f) == false)
    assert((0.0f != -42.0f) == true)
    assert((0.0f < Float.PositiveInfinity) == true)
    assert((0.0f <= Float.PositiveInfinity) == true)
    assert((0.0f > Float.PositiveInfinity) == false)
    assert((0.0f >= Float.PositiveInfinity) == false)
    assert((0.0f == Float.PositiveInfinity) == false)
    assert((0.0f != Float.PositiveInfinity) == true)
    assert((0.0f < Float.NegativeInfinity) == false)
    assert((0.0f <= Float.NegativeInfinity) == false)
    assert((0.0f > Float.NegativeInfinity) == true)
    assert((0.0f >= Float.NegativeInfinity) == true)
    assert((0.0f == Float.NegativeInfinity) == false)
    assert((0.0f != Float.NegativeInfinity) == true)
    assert((-0.0f < 0.0f) == false)
    assert((-0.0f <= 0.0f) == true)
    assert((-0.0f > 0.0f) == false)
    assert((-0.0f >= 0.0f) == true)
    assert((-0.0f == 0.0f) == true)
    assert((-0.0f != 0.0f) == false)
    assert((-0.0f < -0.0f) == false)
    assert((-0.0f <= -0.0f) == true)
    assert((-0.0f > -0.0f) == false)
    assert((-0.0f >= -0.0f) == true)
    assert((-0.0f == -0.0f) == true)
    assert((-0.0f != -0.0f) == false)
    assert((-0.0f < Float.MaxValue) == true)
    assert((-0.0f <= Float.MaxValue) == true)
    assert((-0.0f > Float.MaxValue) == false)
    assert((-0.0f >= Float.MaxValue) == false)
    assert((-0.0f == Float.MaxValue) == false)
    assert((-0.0f != Float.MaxValue) == true)
    assert((-0.0f < Float.MinValue) == false)
    assert((-0.0f <= Float.MinValue) == false)
    assert((-0.0f > Float.MinValue) == true)
    assert((-0.0f >= Float.MinValue) == true)
    assert((-0.0f == Float.MinValue) == false)
    assert((-0.0f != Float.MinValue) == true)
    assert((-0.0f < Float.NaN) == false)
    assert((-0.0f <= Float.NaN) == false)
    assert((-0.0f > Float.NaN) == false)
    assert((-0.0f >= Float.NaN) == false)
    assert((-0.0f == Float.NaN) == false)
    assert((-0.0f != Float.NaN) == true)
    assert((-0.0f < 42.0f) == true)
    assert((-0.0f <= 42.0f) == true)
    assert((-0.0f > 42.0f) == false)
    assert((-0.0f >= 42.0f) == false)
    assert((-0.0f == 42.0f) == false)
    assert((-0.0f != 42.0f) == true)
    assert((-0.0f < -42.0f) == false)
    assert((-0.0f <= -42.0f) == false)
    assert((-0.0f > -42.0f) == true)
    assert((-0.0f >= -42.0f) == true)
    assert((-0.0f == -42.0f) == false)
    assert((-0.0f != -42.0f) == true)
    assert((-0.0f < Float.PositiveInfinity) == true)
    assert((-0.0f <= Float.PositiveInfinity) == true)
    assert((-0.0f > Float.PositiveInfinity) == false)
    assert((-0.0f >= Float.PositiveInfinity) == false)
    assert((-0.0f == Float.PositiveInfinity) == false)
    assert((-0.0f != Float.PositiveInfinity) == true)
    assert((-0.0f < Float.NegativeInfinity) == false)
    assert((-0.0f <= Float.NegativeInfinity) == false)
    assert((-0.0f > Float.NegativeInfinity) == true)
    assert((-0.0f >= Float.NegativeInfinity) == true)
    assert((-0.0f == Float.NegativeInfinity) == false)
    assert((-0.0f != Float.NegativeInfinity) == true)
    assert((Float.MaxValue < 0.0f) == false)
    assert((Float.MaxValue <= 0.0f) == false)
    assert((Float.MaxValue > 0.0f) == true)
    assert((Float.MaxValue >= 0.0f) == true)
    assert((Float.MaxValue == 0.0f) == false)
    assert((Float.MaxValue != 0.0f) == true)
    assert((Float.MaxValue < -0.0f) == false)
    assert((Float.MaxValue <= -0.0f) == false)
    assert((Float.MaxValue > -0.0f) == true)
    assert((Float.MaxValue >= -0.0f) == true)
    assert((Float.MaxValue == -0.0f) == false)
    assert((Float.MaxValue != -0.0f) == true)
    assert((Float.MaxValue < Float.MaxValue) == false)
    assert((Float.MaxValue <= Float.MaxValue) == true)
    assert((Float.MaxValue > Float.MaxValue) == false)
    assert((Float.MaxValue >= Float.MaxValue) == true)
    assert((Float.MaxValue == Float.MaxValue) == true)
    assert((Float.MaxValue != Float.MaxValue) == false)
    assert((Float.MaxValue < Float.MinValue) == false)
    assert((Float.MaxValue <= Float.MinValue) == false)
    assert((Float.MaxValue > Float.MinValue) == true)
    assert((Float.MaxValue >= Float.MinValue) == true)
    assert((Float.MaxValue == Float.MinValue) == false)
    assert((Float.MaxValue != Float.MinValue) == true)
    assert((Float.MaxValue < Float.NaN) == false)
    assert((Float.MaxValue <= Float.NaN) == false)
    assert((Float.MaxValue > Float.NaN) == false)
    assert((Float.MaxValue >= Float.NaN) == false)
    assert((Float.MaxValue == Float.NaN) == false)
    assert((Float.MaxValue != Float.NaN) == true)
    assert((Float.MaxValue < 42.0f) == false)
    assert((Float.MaxValue <= 42.0f) == false)
    assert((Float.MaxValue > 42.0f) == true)
    assert((Float.MaxValue >= 42.0f) == true)
    assert((Float.MaxValue == 42.0f) == false)
    assert((Float.MaxValue != 42.0f) == true)
    assert((Float.MaxValue < -42.0f) == false)
    assert((Float.MaxValue <= -42.0f) == false)
    assert((Float.MaxValue > -42.0f) == true)
    assert((Float.MaxValue >= -42.0f) == true)
    assert((Float.MaxValue == -42.0f) == false)
    assert((Float.MaxValue != -42.0f) == true)
    assert((Float.MaxValue < Float.PositiveInfinity) == true)
    assert((Float.MaxValue <= Float.PositiveInfinity) == true)
    assert((Float.MaxValue > Float.PositiveInfinity) == false)
    assert((Float.MaxValue >= Float.PositiveInfinity) == false)
    assert((Float.MaxValue == Float.PositiveInfinity) == false)
    assert((Float.MaxValue != Float.PositiveInfinity) == true)
    assert((Float.MaxValue < Float.NegativeInfinity) == false)
    assert((Float.MaxValue <= Float.NegativeInfinity) == false)
    assert((Float.MaxValue > Float.NegativeInfinity) == true)
    assert((Float.MaxValue >= Float.NegativeInfinity) == true)
    assert((Float.MaxValue == Float.NegativeInfinity) == false)
    assert((Float.MaxValue != Float.NegativeInfinity) == true)
    assert((Float.MinValue < 0.0f) == true)
    assert((Float.MinValue <= 0.0f) == true)
    assert((Float.MinValue > 0.0f) == false)
    assert((Float.MinValue >= 0.0f) == false)
    assert((Float.MinValue == 0.0f) == false)
    assert((Float.MinValue != 0.0f) == true)
    assert((Float.MinValue < -0.0f) == true)
    assert((Float.MinValue <= -0.0f) == true)
    assert((Float.MinValue > -0.0f) == false)
    assert((Float.MinValue >= -0.0f) == false)
    assert((Float.MinValue == -0.0f) == false)
    assert((Float.MinValue != -0.0f) == true)
    assert((Float.MinValue < Float.MaxValue) == true)
    assert((Float.MinValue <= Float.MaxValue) == true)
    assert((Float.MinValue > Float.MaxValue) == false)
    assert((Float.MinValue >= Float.MaxValue) == false)
    assert((Float.MinValue == Float.MaxValue) == false)
    assert((Float.MinValue != Float.MaxValue) == true)
    assert((Float.MinValue < Float.MinValue) == false)
    assert((Float.MinValue <= Float.MinValue) == true)
    assert((Float.MinValue > Float.MinValue) == false)
    assert((Float.MinValue >= Float.MinValue) == true)
    assert((Float.MinValue == Float.MinValue) == true)
    assert((Float.MinValue != Float.MinValue) == false)
    assert((Float.MinValue < Float.NaN) == false)
    assert((Float.MinValue <= Float.NaN) == false)
    assert((Float.MinValue > Float.NaN) == false)
    assert((Float.MinValue >= Float.NaN) == false)
    assert((Float.MinValue == Float.NaN) == false)
    assert((Float.MinValue != Float.NaN) == true)
    assert((Float.MinValue < 42.0f) == true)
    assert((Float.MinValue <= 42.0f) == true)
    assert((Float.MinValue > 42.0f) == false)
    assert((Float.MinValue >= 42.0f) == false)
    assert((Float.MinValue == 42.0f) == false)
    assert((Float.MinValue != 42.0f) == true)
    assert((Float.MinValue < -42.0f) == true)
    assert((Float.MinValue <= -42.0f) == true)
    assert((Float.MinValue > -42.0f) == false)
    assert((Float.MinValue >= -42.0f) == false)
    assert((Float.MinValue == -42.0f) == false)
    assert((Float.MinValue != -42.0f) == true)
    assert((Float.MinValue < Float.PositiveInfinity) == true)
    assert((Float.MinValue <= Float.PositiveInfinity) == true)
    assert((Float.MinValue > Float.PositiveInfinity) == false)
    assert((Float.MinValue >= Float.PositiveInfinity) == false)
    assert((Float.MinValue == Float.PositiveInfinity) == false)
    assert((Float.MinValue != Float.PositiveInfinity) == true)
    assert((Float.MinValue < Float.NegativeInfinity) == false)
    assert((Float.MinValue <= Float.NegativeInfinity) == false)
    assert((Float.MinValue > Float.NegativeInfinity) == true)
    assert((Float.MinValue >= Float.NegativeInfinity) == true)
    assert((Float.MinValue == Float.NegativeInfinity) == false)
    assert((Float.MinValue != Float.NegativeInfinity) == true)
    assert((Float.NaN < 0.0f) == false)
    assert((Float.NaN <= 0.0f) == false)
    assert((Float.NaN > 0.0f) == false)
    assert((Float.NaN >= 0.0f) == false)
    assert((Float.NaN == 0.0f) == false)
    assert((Float.NaN != 0.0f) == true)
    assert((Float.NaN < -0.0f) == false)
    assert((Float.NaN <= -0.0f) == false)
    assert((Float.NaN > -0.0f) == false)
    assert((Float.NaN >= -0.0f) == false)
    assert((Float.NaN == -0.0f) == false)
    assert((Float.NaN != -0.0f) == true)
    assert((Float.NaN < Float.MaxValue) == false)
    assert((Float.NaN <= Float.MaxValue) == false)
    assert((Float.NaN > Float.MaxValue) == false)
    assert((Float.NaN >= Float.MaxValue) == false)
    assert((Float.NaN == Float.MaxValue) == false)
    assert((Float.NaN != Float.MaxValue) == true)
    assert((Float.NaN < Float.MinValue) == false)
    assert((Float.NaN <= Float.MinValue) == false)
    assert((Float.NaN > Float.MinValue) == false)
    assert((Float.NaN >= Float.MinValue) == false)
    assert((Float.NaN == Float.MinValue) == false)
    assert((Float.NaN != Float.MinValue) == true)
    assert((Float.NaN < Float.NaN) == false)
    assert((Float.NaN <= Float.NaN) == false)
    assert((Float.NaN > Float.NaN) == false)
    assert((Float.NaN >= Float.NaN) == false)
    assert((Float.NaN == Float.NaN) == false)
    assert((Float.NaN != Float.NaN) == true)
    assert((Float.NaN < 42.0f) == false)
    assert((Float.NaN <= 42.0f) == false)
    assert((Float.NaN > 42.0f) == false)
    assert((Float.NaN >= 42.0f) == false)
    assert((Float.NaN == 42.0f) == false)
    assert((Float.NaN != 42.0f) == true)
    assert((Float.NaN < -42.0f) == false)
    assert((Float.NaN <= -42.0f) == false)
    assert((Float.NaN > -42.0f) == false)
    assert((Float.NaN >= -42.0f) == false)
    assert((Float.NaN == -42.0f) == false)
    assert((Float.NaN != -42.0f) == true)
    assert((Float.NaN < Float.PositiveInfinity) == false)
    assert((Float.NaN <= Float.PositiveInfinity) == false)
    assert((Float.NaN > Float.PositiveInfinity) == false)
    assert((Float.NaN >= Float.PositiveInfinity) == false)
    assert((Float.NaN == Float.PositiveInfinity) == false)
    assert((Float.NaN != Float.PositiveInfinity) == true)
    assert((Float.NaN < Float.NegativeInfinity) == false)
    assert((Float.NaN <= Float.NegativeInfinity) == false)
    assert((Float.NaN > Float.NegativeInfinity) == false)
    assert((Float.NaN >= Float.NegativeInfinity) == false)
    assert((Float.NaN == Float.NegativeInfinity) == false)
    assert((Float.NaN != Float.NegativeInfinity) == true)
    assert((42.0f < 0.0f) == false)
    assert((42.0f <= 0.0f) == false)
    assert((42.0f > 0.0f) == true)
    assert((42.0f >= 0.0f) == true)
    assert((42.0f == 0.0f) == false)
    assert((42.0f != 0.0f) == true)
    assert((42.0f < -0.0f) == false)
    assert((42.0f <= -0.0f) == false)
    assert((42.0f > -0.0f) == true)
    assert((42.0f >= -0.0f) == true)
    assert((42.0f == -0.0f) == false)
    assert((42.0f != -0.0f) == true)
    assert((42.0f < Float.MaxValue) == true)
    assert((42.0f <= Float.MaxValue) == true)
    assert((42.0f > Float.MaxValue) == false)
    assert((42.0f >= Float.MaxValue) == false)
    assert((42.0f == Float.MaxValue) == false)
    assert((42.0f != Float.MaxValue) == true)
    assert((42.0f < Float.MinValue) == false)
    assert((42.0f <= Float.MinValue) == false)
    assert((42.0f > Float.MinValue) == true)
    assert((42.0f >= Float.MinValue) == true)
    assert((42.0f == Float.MinValue) == false)
    assert((42.0f != Float.MinValue) == true)
    assert((42.0f < Float.NaN) == false)
    assert((42.0f <= Float.NaN) == false)
    assert((42.0f > Float.NaN) == false)
    assert((42.0f >= Float.NaN) == false)
    assert((42.0f == Float.NaN) == false)
    assert((42.0f != Float.NaN) == true)
    assert((42.0f < 42.0f) == false)
    assert((42.0f <= 42.0f) == true)
    assert((42.0f > 42.0f) == false)
    assert((42.0f >= 42.0f) == true)
    assert((42.0f == 42.0f) == true)
    assert((42.0f != 42.0f) == false)
    assert((42.0f < -42.0f) == false)
    assert((42.0f <= -42.0f) == false)
    assert((42.0f > -42.0f) == true)
    assert((42.0f >= -42.0f) == true)
    assert((42.0f == -42.0f) == false)
    assert((42.0f != -42.0f) == true)
    assert((42.0f < Float.PositiveInfinity) == true)
    assert((42.0f <= Float.PositiveInfinity) == true)
    assert((42.0f > Float.PositiveInfinity) == false)
    assert((42.0f >= Float.PositiveInfinity) == false)
    assert((42.0f == Float.PositiveInfinity) == false)
    assert((42.0f != Float.PositiveInfinity) == true)
    assert((42.0f < Float.NegativeInfinity) == false)
    assert((42.0f <= Float.NegativeInfinity) == false)
    assert((42.0f > Float.NegativeInfinity) == true)
    assert((42.0f >= Float.NegativeInfinity) == true)
    assert((42.0f == Float.NegativeInfinity) == false)
    assert((42.0f != Float.NegativeInfinity) == true)
    assert((-42.0f < 0.0f) == true)
    assert((-42.0f <= 0.0f) == true)
    assert((-42.0f > 0.0f) == false)
    assert((-42.0f >= 0.0f) == false)
    assert((-42.0f == 0.0f) == false)
    assert((-42.0f != 0.0f) == true)
    assert((-42.0f < -0.0f) == true)
    assert((-42.0f <= -0.0f) == true)
    assert((-42.0f > -0.0f) == false)
    assert((-42.0f >= -0.0f) == false)
    assert((-42.0f == -0.0f) == false)
    assert((-42.0f != -0.0f) == true)
    assert((-42.0f < Float.MaxValue) == true)
    assert((-42.0f <= Float.MaxValue) == true)
    assert((-42.0f > Float.MaxValue) == false)
    assert((-42.0f >= Float.MaxValue) == false)
    assert((-42.0f == Float.MaxValue) == false)
    assert((-42.0f != Float.MaxValue) == true)
    assert((-42.0f < Float.MinValue) == false)
    assert((-42.0f <= Float.MinValue) == false)
    assert((-42.0f > Float.MinValue) == true)
    assert((-42.0f >= Float.MinValue) == true)
    assert((-42.0f == Float.MinValue) == false)
    assert((-42.0f != Float.MinValue) == true)
    assert((-42.0f < Float.NaN) == false)
    assert((-42.0f <= Float.NaN) == false)
    assert((-42.0f > Float.NaN) == false)
    assert((-42.0f >= Float.NaN) == false)
    assert((-42.0f == Float.NaN) == false)
    assert((-42.0f != Float.NaN) == true)
    assert((-42.0f < 42.0f) == true)
    assert((-42.0f <= 42.0f) == true)
    assert((-42.0f > 42.0f) == false)
    assert((-42.0f >= 42.0f) == false)
    assert((-42.0f == 42.0f) == false)
    assert((-42.0f != 42.0f) == true)
    assert((-42.0f < -42.0f) == false)
    assert((-42.0f <= -42.0f) == true)
    assert((-42.0f > -42.0f) == false)
    assert((-42.0f >= -42.0f) == true)
    assert((-42.0f == -42.0f) == true)
    assert((-42.0f != -42.0f) == false)
    assert((-42.0f < Float.PositiveInfinity) == true)
    assert((-42.0f <= Float.PositiveInfinity) == true)
    assert((-42.0f > Float.PositiveInfinity) == false)
    assert((-42.0f >= Float.PositiveInfinity) == false)
    assert((-42.0f == Float.PositiveInfinity) == false)
    assert((-42.0f != Float.PositiveInfinity) == true)
    assert((-42.0f < Float.NegativeInfinity) == false)
    assert((-42.0f <= Float.NegativeInfinity) == false)
    assert((-42.0f > Float.NegativeInfinity) == true)
    assert((-42.0f >= Float.NegativeInfinity) == true)
    assert((-42.0f == Float.NegativeInfinity) == false)
    assert((-42.0f != Float.NegativeInfinity) == true)
    assert((Float.PositiveInfinity < 0.0f) == false)
    assert((Float.PositiveInfinity <= 0.0f) == false)
    assert((Float.PositiveInfinity > 0.0f) == true)
    assert((Float.PositiveInfinity >= 0.0f) == true)
    assert((Float.PositiveInfinity == 0.0f) == false)
    assert((Float.PositiveInfinity != 0.0f) == true)
    assert((Float.PositiveInfinity < -0.0f) == false)
    assert((Float.PositiveInfinity <= -0.0f) == false)
    assert((Float.PositiveInfinity > -0.0f) == true)
    assert((Float.PositiveInfinity >= -0.0f) == true)
    assert((Float.PositiveInfinity == -0.0f) == false)
    assert((Float.PositiveInfinity != -0.0f) == true)
    assert((Float.PositiveInfinity < Float.MaxValue) == false)
    assert((Float.PositiveInfinity <= Float.MaxValue) == false)
    assert((Float.PositiveInfinity > Float.MaxValue) == true)
    assert((Float.PositiveInfinity >= Float.MaxValue) == true)
    assert((Float.PositiveInfinity == Float.MaxValue) == false)
    assert((Float.PositiveInfinity != Float.MaxValue) == true)
    assert((Float.PositiveInfinity < Float.MinValue) == false)
    assert((Float.PositiveInfinity <= Float.MinValue) == false)
    assert((Float.PositiveInfinity > Float.MinValue) == true)
    assert((Float.PositiveInfinity >= Float.MinValue) == true)
    assert((Float.PositiveInfinity == Float.MinValue) == false)
    assert((Float.PositiveInfinity != Float.MinValue) == true)
    assert((Float.PositiveInfinity < Float.NaN) == false)
    assert((Float.PositiveInfinity <= Float.NaN) == false)
    assert((Float.PositiveInfinity > Float.NaN) == false)
    assert((Float.PositiveInfinity >= Float.NaN) == false)
    assert((Float.PositiveInfinity == Float.NaN) == false)
    assert((Float.PositiveInfinity != Float.NaN) == true)
    assert((Float.PositiveInfinity < 42.0f) == false)
    assert((Float.PositiveInfinity <= 42.0f) == false)
    assert((Float.PositiveInfinity > 42.0f) == true)
    assert((Float.PositiveInfinity >= 42.0f) == true)
    assert((Float.PositiveInfinity == 42.0f) == false)
    assert((Float.PositiveInfinity != 42.0f) == true)
    assert((Float.PositiveInfinity < -42.0f) == false)
    assert((Float.PositiveInfinity <= -42.0f) == false)
    assert((Float.PositiveInfinity > -42.0f) == true)
    assert((Float.PositiveInfinity >= -42.0f) == true)
    assert((Float.PositiveInfinity == -42.0f) == false)
    assert((Float.PositiveInfinity != -42.0f) == true)
    assert((Float.PositiveInfinity < Float.PositiveInfinity) == false)
    assert((Float.PositiveInfinity <= Float.PositiveInfinity) == true)
    assert((Float.PositiveInfinity > Float.PositiveInfinity) == false)
    assert((Float.PositiveInfinity >= Float.PositiveInfinity) == true)
    assert((Float.PositiveInfinity == Float.PositiveInfinity) == true)
    assert((Float.PositiveInfinity != Float.PositiveInfinity) == false)
    assert((Float.PositiveInfinity < Float.NegativeInfinity) == false)
    assert((Float.PositiveInfinity <= Float.NegativeInfinity) == false)
    assert((Float.PositiveInfinity > Float.NegativeInfinity) == true)
    assert((Float.PositiveInfinity >= Float.NegativeInfinity) == true)
    assert((Float.PositiveInfinity == Float.NegativeInfinity) == false)
    assert((Float.PositiveInfinity != Float.NegativeInfinity) == true)
    assert((Float.NegativeInfinity < 0.0f) == true)
    assert((Float.NegativeInfinity <= 0.0f) == true)
    assert((Float.NegativeInfinity > 0.0f) == false)
    assert((Float.NegativeInfinity >= 0.0f) == false)
    assert((Float.NegativeInfinity == 0.0f) == false)
    assert((Float.NegativeInfinity != 0.0f) == true)
    assert((Float.NegativeInfinity < -0.0f) == true)
    assert((Float.NegativeInfinity <= -0.0f) == true)
    assert((Float.NegativeInfinity > -0.0f) == false)
    assert((Float.NegativeInfinity >= -0.0f) == false)
    assert((Float.NegativeInfinity == -0.0f) == false)
    assert((Float.NegativeInfinity != -0.0f) == true)
    assert((Float.NegativeInfinity < Float.MaxValue) == true)
    assert((Float.NegativeInfinity <= Float.MaxValue) == true)
    assert((Float.NegativeInfinity > Float.MaxValue) == false)
    assert((Float.NegativeInfinity >= Float.MaxValue) == false)
    assert((Float.NegativeInfinity == Float.MaxValue) == false)
    assert((Float.NegativeInfinity != Float.MaxValue) == true)
    assert((Float.NegativeInfinity < Float.MinValue) == true)
    assert((Float.NegativeInfinity <= Float.MinValue) == true)
    assert((Float.NegativeInfinity > Float.MinValue) == false)
    assert((Float.NegativeInfinity >= Float.MinValue) == false)
    assert((Float.NegativeInfinity == Float.MinValue) == false)
    assert((Float.NegativeInfinity != Float.MinValue) == true)
    assert((Float.NegativeInfinity < Float.NaN) == false)
    assert((Float.NegativeInfinity <= Float.NaN) == false)
    assert((Float.NegativeInfinity > Float.NaN) == false)
    assert((Float.NegativeInfinity >= Float.NaN) == false)
    assert((Float.NegativeInfinity == Float.NaN) == false)
    assert((Float.NegativeInfinity != Float.NaN) == true)
    assert((Float.NegativeInfinity < 42.0f) == true)
    assert((Float.NegativeInfinity <= 42.0f) == true)
    assert((Float.NegativeInfinity > 42.0f) == false)
    assert((Float.NegativeInfinity >= 42.0f) == false)
    assert((Float.NegativeInfinity == 42.0f) == false)
    assert((Float.NegativeInfinity != 42.0f) == true)
    assert((Float.NegativeInfinity < -42.0f) == true)
    assert((Float.NegativeInfinity <= -42.0f) == true)
    assert((Float.NegativeInfinity > -42.0f) == false)
    assert((Float.NegativeInfinity >= -42.0f) == false)
    assert((Float.NegativeInfinity == -42.0f) == false)
    assert((Float.NegativeInfinity != -42.0f) == true)
    assert((Float.NegativeInfinity < Float.PositiveInfinity) == true)
    assert((Float.NegativeInfinity <= Float.PositiveInfinity) == true)
    assert((Float.NegativeInfinity > Float.PositiveInfinity) == false)
    assert((Float.NegativeInfinity >= Float.PositiveInfinity) == false)
    assert((Float.NegativeInfinity == Float.PositiveInfinity) == false)
    assert((Float.NegativeInfinity != Float.PositiveInfinity) == true)
    assert((Float.NegativeInfinity < Float.NegativeInfinity) == false)
    assert((Float.NegativeInfinity <= Float.NegativeInfinity) == true)
    assert((Float.NegativeInfinity > Float.NegativeInfinity) == false)
    assert((Float.NegativeInfinity >= Float.NegativeInfinity) == true)
    assert((Float.NegativeInfinity == Float.NegativeInfinity) == true)
    assert((Float.NegativeInfinity != Float.NegativeInfinity) == false)
  }
}
