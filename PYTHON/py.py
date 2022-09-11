# 세 정수를 입력받아 최댓값 구하기

print('세 정수의 최댓값을 구합니다.')
a = int(input('정수 A 값을 입력하세요. : '))
b = int(input('정수 b 값을 입력하세요. : '))
c = int(input('정수 c 값을 입력하세요. : '))

maximun = a
if b>maximun : maximun=b
if c>maximun : maximun=c

print('최댓값은',maximun,'입니다')