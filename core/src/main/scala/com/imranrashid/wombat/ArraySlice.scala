package com.imranrashid.wombat

/**
 * Simple class to hold an array plus a set of offsets into the array.
 * Intentionally doesn't have apply, update, etc., since the whole point
 * of this class is to be directly accessing elements of the array
 */
class ArraySlice[T](
  var arr: Array[T],
  var start: Int,
  var end: Int
) {
  def reset(arr: Array[T], start: Int, end: Int) {
    this.arr = arr
    this.start = start
    this.end = end
  }
}
