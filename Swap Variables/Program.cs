using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Monday_Questions
{
    class Program
    {
        static void Main(string[] args)
        {
            int A = 3;
            int B = 5;


            A = A + B;
            B = A - B;
            A = A - B;
            Console.WriteLine("A equals " + A); Console.WriteLine("B equals " + B);
            Console.ReadLine();
        }
    }
}
