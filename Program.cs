using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Leap_Years
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Please enter a year: ");
            int year = Int32.Parse(Console.ReadLine());

            for(int i = year; i <= year+8; i++)
            {
                if (i % 4 == 0 && i % 400 != 0)
                {
                    Console.WriteLine(i + " is the next leap year.");
                    Console.ReadLine();
                }
            }
        }
    }
}
