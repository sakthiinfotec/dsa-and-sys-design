/* Find factors of a given input N */
const factors = (n) => 
	new Array(n)
	.fill(0)
	.map((_, index) => index+1)
	.filter((val) => n % val == 0)

factors(36)	// [1, 2, 3, 4, 6, 9, 12, 18, 36]
