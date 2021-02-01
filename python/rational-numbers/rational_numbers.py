from __future__ import division

import math

class Rational:
    def __init__(self, numer, denom):
        """check if the denominator is 0"""
        if denom == 0:
            raise Exception("Denominator cannot be 0")

        """get the gcd for the numerator and denominator"""
        gcdVal = math.gcd(numer, denom)

        """check if the rational is negative or positive; if so always make the numerator negative"""
        finalSign = -1 if denom < 0 else 1
        self.numer = int(finalSign * numer/gcdVal)
        self.denom = int(finalSign * denom/gcdVal)

    def __eq__(self, other):
        return self.numer == other.numer and self.denom == other.denom

    def __repr__(self):
        return '{}/{}'.format(self.numer, self.denom)

    def __add__(self, other):
        newNumer = self.numer * other.denom + self.denom * other.numer
        newDenom = self.denom * other.denom
        return Rational(newNumer, newDenom)

    def __sub__(self, other):
        newNumer = self.numer * other.denom - self.denom * other.numer
        newDenom = self.denom * other.denom
        return Rational(newNumer, newDenom)

    def __mul__(self, other):
        newNumer = self.numer * other.numer
        newDenom = self.denom * other.denom
        return Rational(newNumer, newDenom)

    def __truediv__(self, other):
        """check that the division is valid"""
        if other.numer == 0:
            raise Exception("Cannot perform the division")
        newNumer = self.numer * other.denom
        newDenom = self.denom * other.numer
        return Rational(newNumer, newDenom)

    def __abs__(self):
        return Rational(self.numer if self.numer >= 0 else -self.numer,
                        self.denom if self.denom >= 0 else -self.denom)

    def __pow__(self, power):
        return Rational(self.numer**power, self.denom**power)

    def __rpow__(self, base):
        return base**(self.numer/self.denom)