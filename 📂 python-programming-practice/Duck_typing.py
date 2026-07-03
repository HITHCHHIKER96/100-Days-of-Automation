# Duck Typing = Another way to achieve polymorphisms besides Inheritance Object must have the minimum
#               necessary attributes/methods "If it looks like a duck and quacks like a duck,
#               it must be a duck. "

class Animal:
    alive = True

class Dog(Animal):
    def speak(self):
        print("WOOF")

class Cat(Animal):
    def speak(self):
        print("MEOW")

animals = [Dog(), Cat()]

for i in animals:
    i.speak()