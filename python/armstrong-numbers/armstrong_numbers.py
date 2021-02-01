def is_armstrong_number(number):
    # purposefully attempted a solution without the use of strings (for fun)

    # count the number of digits
    numDigits = 1
    while (number//(10**numDigits)) > 0:
        numDigits += 1

    # calculate the sum to check against the original number
    numberSum = 0
    for curDigit in range(1, numDigits+1):
        val = number//(10**(curDigit-1))  # divide by power of ten; get the current digit as last digit in val
        val = val % 10  # modulo 10 to only have a single value remaining
        numberSum += val**numDigits

    # check if the number is an Armstrong number
    return number == numberSum