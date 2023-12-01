#include <stdio.h>

void strncpyFor(char* dest, const char* src, const int count) {
  if (dest == 0|| src == 0) return;
  int i;
  for (i = 0; i < count && src[i] != '\0'; i++) {
    dest[i] = src[i];
  }
  if (i < count) dest[i] = '\0';
}

void strncpyWhile(char* dest, const char* src, const int count) {
  if (dest == 0|| src == 0) return;
  int i = 0;
  while (i < count && src[i] != '\0') {
    dest[i] = src[i];
    i++;
  }
  if (i < count) dest[i] = '\0';
}

void strncpyDoWhile(char* dest, const char* src, const int count) {
  if (dest == 0|| src == 0) return;
  int i = 0;
  do {
    dest[i] = src[i];
    i++;
  } while (i < count && src[i] != '\0');
  if (i < count) dest[i] = '\0';
}

int strncmpFor(const char* str1, const char* str2, const int liczba) {
  if (str1 == 0 || str2 == 0) return 0;
  for (int i = 0; i < liczba; i++) {
    if (str1[i] != str2[i]) return str1[i] - str2[i];
    if (str1[i] == '\0' || str2[i] == '\0') break;
  }
  // Return 0 if the strings are equal or no difference could be determined
  return 0;
}

int strncmpWhile(const char* str1, const char* str2, const int liczba) {
  if (str1 == 0 || str2 == 0) return 0;
  int i = 0;
  while (i < liczba) {
    if (str1[i] != str2[i]) return str1[i] - str2[i];
    if (str1[i] == '\0' || str2[i] == '\0') break;
    i++;
  }
  // Return 0 if the strings are equal or no difference could be determined
  return 0;
}

int strncmpDoWhile(const char* str1, const char* str2, const int liczba) {
  if (str1 == 0 || str2 == 0) return 0;
  int i = 0;
  do {
    if (str1[i] != str2[i]) return str1[i] - str2[i];
    if (str1[i] == '\0' || str2[i] == '\0') break;
    i++;
  } while (i < liczba);
  // Return 0 if the strings are equal or no difference could be determined
  return 0;
}

int main() {

  char src[] = "Hello, world!";
  char dest[99];
  // Wywołanie funkcji strncpy
  // Wyświetlenie wyniku
  printf("src: %s\n", src);
  strncpyFor(dest, src, 4);
  printf("dest: %s\n", dest);
  strncpyWhile(dest, src, 4);
  printf("dest: %s\n", dest);
  strncpyDoWhile(dest, src, 4);
  printf("dest: %s\n", dest);

  printf("\n");

  // Deklaracja i inicjalizacja zmiennych
  char str1[] = "Hello, 1";
  char str2[] = "Hello, 2";
  // Wywołanie funkcji strncmp
  const int result1 = strncmpFor(str1, str2, 8);
  const int result2 = strncmpWhile(str1, str2, 8);
  const int result3 = strncmpDoWhile(str1, str2, 8);
  // Wyświetlenie wyniku
  printf("str1: %s\n", str1);
  printf("str2: %s\n", str2);
  printf("result: %d\n", result1);
  printf("result: %d\n", result2);
  printf("result: %d\n", result3);

  return 0;
}
