import urllib
import json

hashtag = raw_input("Enter the hashtag you want to find: ")
print "you entered ", hashtag

def searchTweets(query):
    i=1
    search = urllib.urlopen("http://search.twitter.com/search.json?q="+query)
    dict = json.loads(search.read())
    for result in dict["results"]: 
        print "*",result["text"],"\n"

searchTweets(hashtag+"&rpp=100")
raw_input("Enter any key to exist")

