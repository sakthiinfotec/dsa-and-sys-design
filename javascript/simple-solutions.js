/* Find factors of a given input N */
const factors = (n) => 
	new Array(n)
	.fill(0)
	.map((_, index) => index+1)
	.filter((val) => n % val == 0)