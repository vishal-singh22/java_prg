# reverse the sentence by word by word

def reverse_word(input):
    
    words = input.split(' ')

    return words[::-1]
sen = input("enter the sentence you want: ")

print(reverse_word(sen))
    
