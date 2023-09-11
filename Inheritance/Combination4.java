//Case 4
//Multiple Inheritance
//not allowed
//allowed in c++ not in java

class demo
{
    int i;
    void fun()
    {}
}

class Hello extends demo
{
    int i;
    void fun()
    {}
}

class Marvellous extends Demo, Hello //Error
{

}
