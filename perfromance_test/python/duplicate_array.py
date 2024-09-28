# copy data in another array without duplicates

def remove_duplicates(arr):
    
    arr2 =[]
    
    for i in arr:
        if i in arr2:
            pass
        else:
            arr2.append(i)
        
    return arr2


arr = [1,2,2,4,6,4,6,4,8,9,8]

print(remove_duplicates(arr))