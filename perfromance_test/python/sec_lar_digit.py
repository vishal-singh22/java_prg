def sec_lar_dig(num):
    max = 0
    max_sec = 0

    while num:
        r = num%10 
        if(max < r):
            max_sec = max
            max = r
        elif r > max_sec and r != max:
            max_sec= r

        num = num//10
    return max_sec


n = int(input("enter the value you want: "))
print(sec_lar_dig(n))
       