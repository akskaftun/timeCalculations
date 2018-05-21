values_for :listOfNumbers, [
	[1, 1, 1],
	[1, 4, 2, 3, 5, 1],
	[2, 5, 7, 23],
	[55, 66, 23, 31, 42],
	[43, 25, 57, 28, 93]
]

solution do |listOfNumbers|
	listOfNumbers.select { |number|
		number % 2 == 1
	}.map(&:to_s).join("\n")
end
uid :x78d123d244039acc093e4cc62ba408e2
