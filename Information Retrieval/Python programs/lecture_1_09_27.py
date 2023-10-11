import keyword
import math
def First():
    name="Saini"
    address="Bhaktapur"
    age=32
    have_job=True
    print(name,address,age,have_job)


def Second():
    a=10
    b=6
    print(f"a = {a}, b = {b}")
    print("a + b = ",a+b)
    print("a - b = ",a-b)
    print("a * b = ",a*b)
    print("a / b = ",format(a/b,".3f"))
    print("a/b: Quotient = ",math.floor(a/b))
    print("a mod b = ",a%b)
    print("a ^ b = ",a**b)
    print("SQRT(a*b) = ", format(math.sqrt(a*b),".3f"))


def Third():
    a=int(input("Enter a: "))
    b=int(input("Enter b: "))
    #EQUAL
    print("a==b ?? : ",a==b)
    #NOT EQUAL
    print("a!=b ?? : ",a!=b)

def bitwise():
    a=11
    b=9
    c=a&b
    d=a|b
    print(c,d)

def membership():
    x=5
    y=[1,2,3,4]
    z=[1,3,5,'a','b',"car",3.5,True]
    print("x in y : ",x in y)
    print("x in z : ",x in z)
    for zitem in z:
        print(zitem)

def idfinder():
    a="HI"
    b="HI"
    # b="HELLO"
    print(id(a))
    print(id(b))
    print(a is b)

def keyword_func():
    a=keyword.kwlist
    print(a)

    x=len(a)
    print("Number of keyword",x)

def typeof():
    a=100
    print(type(a))
    b=3.45
    print(type(b))
    c=10+3j
    print(type(c))
    stri="DL"
    print(type(stri))
    d=True
    print(type(d))
    print(bool(a==b))
    print(a==b)

def str_dataType():
    str="Hello Nabin Sir"
    print(str)
    print(str[0])
    print(str[6:])
    print(str[:7])
    print(str*2)
    print(str+", Regards Prisan")
    print(str[-1:])

def list_datatype():
    list_a=['xyz',34,1.27,"Cena",69.6]
    list_b=[44,"Saini"]
    print(list_a)
    print(list_a[0])
    print(list_a[0:])
    print(list_a[:3])

    print(list_b*2)
    print(list_b[-1])

def tuple_type():
    tup_a=(123,'Car',3.14,'8848m')
    print(tup_a[0])
    print(tup_a[0:3])
    print(tup_a[0::2])
    print(tup_a[::-1])



def main():
    # First()
    Second()
    # Third()
    # bitwise()
    # membership()
    # idfinder()
    # keyword_func()
    # typeof()
    # str_dataType()
    # list_datatype()
    # tuple_type()

if __name__=="__main__":
    main()