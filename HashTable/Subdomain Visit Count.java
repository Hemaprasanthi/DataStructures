class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        int value;
        String sint;
        HashMap<String, Integer> hs = new HashMap<>();
        List<String> ls = new ArrayList<>();
        
        for(String str: cpdomains)
        {
            // get the number
            sint = str.substring(0, str.indexOf(' ')); 
            //remove the number from the original string
            str =  str.substring(str.indexOf(' ')+1);
            // parse the value from string to int
            value = Integer.parseInt(sint); 
            // add the base string an its value to the hashmap
            hs.put(str, value);
            
            while(str.contains("."))
            {
                //remove a part of the string till "."
                str = str.substring(str.indexOf('.')+1);
                //update the hashmap
                if(hs.containsKey(str)) 
                    hs.put(str, hs.get(str)+value);
                else hs.put(str, value);
            }
        }
        //add the hashmap entries to the list
        for(String s: hs.keySet()){
            String make = hs.get(s) + " "+ s;
            ls.add(make);
        }        

        return ls;
    
    }
}