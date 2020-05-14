Mappings
	Role
		1- Recruiter
		2- student / employee
		
Algorithm 
	NLP 
	

Upload Resume:
	1. Multipart the uploaded resume pdf file & store the data in hashmap.
	2. get the file item from hashmap and pass it to checkResume function.
	3. create new file named 'userid.pdf' and write all the file data we received
		in this function to temp.pdf.
	4. pass the new file name, i.e. 'userid', to the CallServer.call function to perform the operation on resume.
	5. in this function, make the connection with the server and pass the file name in the url & wait for the response.
	6. now in python, the system will get the pdf of resume.
	7. we have csv where we have all the data of Domain & it's keywords are stored.
	8. now we will retrieve the content of the file and get it into a dataframe.
	9. get all keyword and pass it to matcher to train. matcher gives id to the keywords, and add it to the model,
		and returns the trained model. this trained model then we pass to the phasematcher.
	10. all keywords then will be passed to the nltk_operation.py to perform NLP operations.
	11. first operation is tokanization. (bag of words)
		Tokenization is the process of tokenizing or splitting a string, text into a list of tokens. One can think of token
		as parts like a word is a token in a sentence, and a sentence is a token in a paragraph.
	12. next step is pos tagging. It is a process of converting a sentence to forms – list of words,
		list of tuples (where each tuple is having a form (word, tag)). The tag in case of is a part-of-speech tag,
		and signifies whether the word is a noun, adjective, verb, and so on.
		it marks noun, verb, adjective and adverb as 'n', 'v', 'a' and 'r'.
	13. third operation is stop word removal.
	14. final operation is lammitization. 
		Lemmatization is the process of grouping together the different inflected forms
		of a word so they can be analysed as a single item. (Ex: rocks->rock, better->good)
	15. now read the resume  as string and pass it to the phasematcher.
	16. phasematcher will match the words from the string with the keywords in the csv.
	17. phasematcher will return 3 values, (match_id, start_index, end_index)
		match_id is the id of keywords of our csv.
	18. from the data extracted, we will get the count of the domains, and keywords of skills.
		concat this data to a string and return the string to the java function.
	19. in java, read the response using BufferedReader and get it into a string.
	20. now split the domains and skills into a string array.
		remove the un-necessary characters from string.
	21. store the retrived information from the resume to database with respecting student/ employee id.
	22. pass the skills array & file name to the page, and render the graph on the page of skills and their score.
	
	
Classify Resume:
	1. get all applied candidates for the given job.
	2. get all skills required for the job.
	3. get all candidate's data who applied for the job.
	4. get the skills of the candidates.
	5. compare if required skills are available in candidate's profile or not.
	6. if the skill is available, then make addition of the score of candidate.
	7. repeat it for every skill required by job, for every student.
	8. then sort the list by descending order (max to min), & return the sorted hashmap.
	9. show the sorted list on the UI as 'Recommended Candidates'
	10. show other (All) candidate in other list below.
	

Skills Recommendation:
	1. get the skills of students,
		get all the jobs which required this skills,
		now get the list of all skills from the jobs,
		now remove skills of the student from the list,
		other remaining skills are the recommendation skills.
		
		
https://spacy.io/usage/spacy-101		