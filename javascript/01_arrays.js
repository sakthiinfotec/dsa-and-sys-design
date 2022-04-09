/*
1. Problem: Given N elements, count no. of elements having atleast 1 element greater than itself.

input: [-3, -2, 6, 8, 4, 8, 5]

Observations:
1. For max elements, nothing greater than that
2. Find max element
3. Get count of the same
4. return N - count
*/

/* 
 * Find max number from array of numbers 
 * Tc: O(N)
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
console.assert(result2 == 6, "max=10, count=2; Result 8(N) - 2 = 6")


/*
 * Given array of N elements, count no. of elements having atleast 1 element greater than itself. 
 * Solution:
 *  1. For max elements, there will be nothing greater than that
 *  2. Find max element
 *  3. Get the count of the same
 *  4. Result: N - count of max
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

console.log(`Number of elements: ${n - maxCount}`)

