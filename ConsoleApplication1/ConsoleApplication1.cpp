#include <iostream>
using namespace std;
int n, nprot = 0;
int maxr(int numb);
int rsize(int numb, int prot);
void radix(int** rarr, int* arr, int prot);
int main()
{
	setlocale(LC_ALL, "Russian");
	int prot, i, * arr, ** rarr; //объявление массивов
	cout << "Размер: ";
	cin >> n;
	arr = new int[n];
	cout << "Элементы: ";
	for (i = 0; i < n; i++) //заполнение массива
	{
		cin >> arr[i];
	}
	rarr = new int* [n];
	for (i = 0; i < n; i++)
		rarr[i] = new int[n]; //инициализация доп массива

	for (i = 0; i < n; i++) {
		if (nprot < maxr(arr[i])) //поиск наибольшего разряда среди всех чисел
			nprot = maxr(arr[i]);
	}
	for (prot = 1; prot <= nprot; prot++) {

		radix(rarr, arr, prot); //вызов основной функции сортировки с передачей разряда от 1 до макс.

	}
	for (i = 0; i < n; i++) {
		cout << arr[i] << " "; //печать массива отсортированных чисел
	}
	return 0;
}
int maxr(int numb) //функция для возврата максимального разряда числа
{
	int max = 0;
	while (numb > 1)
	{
		numb /= 10;
		max++;
	}
	return max;
}
int rsize(int numb, int prot) //вовзрат числа по разряду 1-последний n-первый
{
	while (prot > 1)
	{
		numb /= 10;
		prot--;
	}
	return numb % 10;
}
void radix(int** rarr, int* arr, int prot)
{
	int* sarr, i, j, t = 0; //объявление доп переменных и массива
	sarr = new int[n];
	for (i = 0; i < n; i++)
		sarr[i] = 0; //инициализация массива
	for (i = 0; i < n; i++)
	{
		int a = rsize(arr[i], prot); //получение числа из заданного разряда

		rarr[sarr[a]][a] = arr[i]; //заполнение массива в соответвие с величиной разряда(массив заполняется в соотвествие с величиной разряда)

		sarr[a]++;
	}
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < sarr[i]; j++)
		{

			arr[t] = rarr[j][i]; //сохранение в изначальный массив чисел, отсортированных по текущему разряду

			t++;
		}
	}
}
