def convert(number):
    retStr = ""

    """Check if the number has 3, 5, or 7 as factors"""
    if (number % 3) == 0:
        retStr += "Pling"
    if (number % 5) == 0:
        retStr += "Plang"
    if (number % 7) == 0:
        retStr += "Plong"

    """If the string is empty then 3, 5, and 7 are not factors"""
    if retStr == "":
        retStr = str(number)

    return retStr
