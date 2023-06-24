class ParenthesesExtractor:
    def __init__(self, num, input_string):
        self.n = int(num)
        self.s = list(input_string)
        self.stack = []
        self.cnt = 0
        self.ranges = []

    def extract_parentheses(self):
        for i in range(self.n):
            c = self.s[i]
            self.stack.append(c)
            if c == ')' and self.cnt >= 1:
                while True:
                    if self.stack.pop() == '(':
                        self.cnt-=1
                        break
            elif c == '(':
                self.cnt+=1
        print("".join(self.stack))


num = input()
input_string = input()
extractor = ParenthesesExtractor(num, input_string)
modified_string = extractor.extract_parentheses()