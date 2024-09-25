def findlargestword(sen):
    word = sen.split(' ')
    
    largest_word = max(word, key = len)
    
    return largest_word

if __name__ == '__main__':
    sentence = "my name is vishal singh i am a learner"
    
    print(f"largest word in a sentence is '{findlargestword(sentence)}'")