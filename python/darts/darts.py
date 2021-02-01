def score(x, y):
    # calculate the distance (squared) from the centre
    dist = x**2 + y**2

    # determine how many points were earned
    if dist > 100:  # 10^2
        return 0
    elif dist > 25: # 5^2
        return 1
    elif dist > 1:
        return 5
    else:
        return 10
