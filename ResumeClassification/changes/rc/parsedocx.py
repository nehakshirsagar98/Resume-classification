import PyPDF2
import textract
import nltk
from nltk.tokenize import word_tokenize
from nltk.corpus import stopwords
import docx2txt
import docx    

def getText(filename):
    doc = docx.Document(filename)
    fullText = []
    for para in doc.paragraphs:
        fullText.append(para.text)
    return '\n'.join(fullText)

if __name__ == '__main__':
    filename='D:/work/resume/resume.docx';  #docx file name
    fullText=getText(filename)
    print (fullText)
