using System;

namespace Isogram
{
    class Program
    {
        static void Main(string[] args)
        {
            string str1 = Console.ReadLine();
            Console.WriteLine(IsIsogram(str1));
        }

        public static bool IsIsogram(string str)
        {
            str = str.ToLower();
            int len = str.Length;

            char[] arr = str.ToCharArray();

            Array.Sort(arr);
            for (int i = 0; i < len - 1; i++)
            {
                if (arr[i] == arr[i + 1])
                    return false;
            }
            return true;
        }

    }

}


