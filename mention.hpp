#include <string.h>
#ifndef mention_h
#define mention_h

/*******************************************************************************
 * The purpose of this funciton is to define the class and functions necessary *
 * to be able to read an analyze mentions in twitter.                          *
 ******************************************************************************/

// Need to create class

class Mention {
    
private:
    std::string name; // Just the string that includes the user name.
    
public:
    //constructor
    Mention();
    Mention(char at, std::string n);
    
    //accessors and mutators
    void set_name(std::string n); // Function to set the mention
    void get_name();              // Fucntion to return mention w/o at sign
    void find_mention();
    
};


#endif
