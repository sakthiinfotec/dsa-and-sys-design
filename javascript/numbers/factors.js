/* Find factors of a given input N */
const factors = (n) => 
	new Array(n)
	.fill(0)
	.map((_, index) => index+1)
	.filter((val) => n % val == 0)

factors(36)	// [1, 2, 3, 4, 6, 9, 12, 18, 36]

/* 2. Find factors using For loop */
function findFactors(n) {
	const factors = [];
	for(let i=1; i<=n; i++){
		if(n % i == 0) {
			factors.push(i);
		}
	}
	return factors;
}
