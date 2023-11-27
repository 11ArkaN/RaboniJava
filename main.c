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

int main() {

  char src[] = "Hello, world!";
  char dest[99];

  printf("src: %s\n", src);
  strncpyFor(dest, src, 4);
  printf("dest: %s\n", dest);
  strncpyWhile(dest, src, 4);
  printf("dest: %s\n", dest);
  strncpyDoWhile(dest, src, 4);
  printf("dest: %s\n", dest);
 return 0;
}
