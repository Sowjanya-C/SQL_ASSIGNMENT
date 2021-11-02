package com.sonata;
//To replace vowels with $ symbol
public class ReplaceVowels {

	public static void main(String[] args) {
		String str = "Java Vowel Replace Program Example";
		char ch[] = str.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			ch[i]='$';
		}
        for(int i=0; i<ch.length; i++)
        {
        	System.out.print(ch[i]);
        }
	}

}
