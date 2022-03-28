/* 2. Find factors using For loop */
function findFactorsV1(n) {
  const factors = [];
  for(let i=1; i<=n; i++){
    if(n % i == 0) {
      factors.push(i);
    }
  }
  return factors;
}

findFactorsV1(36)	// [1, 2, 3, 4, 6, 9, 12, 18, 36]

/* 3. Find factors - Optimized Method i <= N/i */
function findFactorsV2(n) {
  const factors = [];
  const sqrtN = Math.sqrt(n)
  for(let i=1; i<=sqrtN; i++){
    if(n % i == 0) {
      // i is always a factor of N
      factors.push(i);
  
      if (i != n/i) {
        // N/i is also a factor of N
        factors.push(n/i);
      }
    }
  }
  return factors;
}

findFactorsV1(36).sort((a, b) => a - b)	// [1, 2, 3, 4, 6, 9, 12, 18, 36]

/* Find factors using functional way */
const factors = (n) => 
  new Array(n)
  .fill(0)
  .map((_, index) => index+1)
  .filter((val) => n % val == 0)

factors(36)	// [1, 2, 3, 4, 6, 9, 12, 18, 36]
