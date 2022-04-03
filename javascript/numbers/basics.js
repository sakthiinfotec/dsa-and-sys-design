
/* Find if prime number or not */
function findPrime(number) {
  for(let i = 2; i<=Math.sqrt(number); i++) {
    if (number % i == 0) {
      console.log('NO');
      return;
    }
  }
  console.log('YES');
}


/*
Find if the number is perfect.

Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
*/
function sumDivisors(number) {
  let sum = 0;
  for(let i = 1; i<=number/2; i++) {
    if (number % i == 0) {
      sum+=i;
    }
  }
  console.log(sum == number ? 'YES' : 'NO');
}


/*
Find sum of all natural numbers from 1 to N

Constraints: 1 <= N <= 1000
Input: N
Output: Single integer number which is sum of all Natural numbers from 1 to N
*/
function sumNaturalNumber(n) {
  console.log((n * (n+1) / 2));
}

/*
Given a number A. Return square root of the number if it is perfect square otherwise return -1.
*/
function findSquareRoot(N){
  for (let i = 1; i <= N; i++) {
    if(i * i == N) {
      return i;
    }
  }
  return -1;
}
