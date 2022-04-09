/*
1. Problem: Given N elements, count no. of elements having atleast 1 element greater than itself.

input: [-3, -2, 6, 8, 4, 8, 5]

Observations:
1. For max element, nothing greater than that
2. Find max element
3. Get count of the same
4. Return N - count
*/

/* 
 * Find max number from array of numbers 
 * TC: O(N)
 */
function findMax(arr) {
  const n = arr.length;
  let max = arr[0];
  for(let i=1; i<n; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
  }
  return max;
}

/* 
 * Find number of occurrence of max element
 * Tc: O(N)
 */
function findCountOfMaxElementsThanItself(arr) {
  let maxCount = 0, max = findMax(arr);
  const n = arr.length;
  for(let i=1; i<n; i++) {
    if (arr[i] == max) {
        maxCount++;      
    }
  }
  return n - maxCount;
}

const arr1 = [-3, -2, 6, 8, 4, 8, 5];
const result1 = findCountOfMaxElementsThanItself(arr1);
console.assert(result1 == 5, "max=8, count=2; Result 7(N) - 2 = 5");

const arr2 = [2, 3, 10, 7, 3, 2, 10, 8];
const result2 = findCountOfMaxElementsThanItself(arr2);
console.assert(result2 == 6, "max=10, count=2; Result (N = 8) - 2 = 6")


/*
 * Approach 2: 
 * Given array of N elements, count no. of elements having atleast 1 element greater than itself. 
 * Solution:
 *  1. For max elements, there will be nothing greater than that
 *  2. Find max element
 *  3. Get the count of the same
 *  4. Result: N - count of max
 *  TC: O(N)
 */
const arr = [-3, -2, 6, 8,4,8,5];
let max = arr[0], prevMax = arr[0], maxCount = 1, n = arr.length;
for (let i=1; i<arr.length; i++) {
  if(arr[i] > prevMax) {
    maxCount = 1;
    prevMax = arr[i];
    max = arr[i];
  } else if (max == arr[i]) {
    maxCount++;
  }
}

console.assert(n - maxCount == 5, "max=8, count=2; Result 7 - 2 = 5")


/*
 * Problem 2: Given array of N elements, check if there exists a pair i, j such that a[i] + a[j] == k && i != j, return type boolean 
 * Matrix: Iterate lower or upper part of matrix
 * TC: O(N^2)
 */

const arr = [3, -2, 1, 4, 3, 6, 8];
const k = 10;

function findPairSumK(arr, k) {
  const n = arr.length;
  for (let i=0; i<n; i++) {
    for (j=0; j<i; j++) {
      if (arr[i] + arr[j] == k)
        return true;
    }
  }
  return false;
}

console.assert(findPairSumK(arr, k) == true, 'Pair exists!')

/*
 * Problem 3: Reverse the given array of N elements
 * Solution: Use 2 pointer
 * TC: O(N)
 */
const arr = [3, -2, 1, 4, 3, 6, 8];
const k = 10;
let i = 0;
let j = arr.length - 1;
let tmp;
while (i < j) {
  tmp = arr[i];
  arr[i] = arr[j]
  arr[j] = tmp;
  
  i++;
  j--;
}

for (let el of arr) {
  console.log(el);
}

