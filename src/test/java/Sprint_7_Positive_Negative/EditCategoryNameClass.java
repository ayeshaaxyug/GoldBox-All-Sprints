package Sprint_7_Positive_Negative;

import genericUtility.JavaUtility;

public class EditCategoryNameClass {

	JavaUtility jUtil = new JavaUtility();
	// Private variable
	private String EditCategoryName;   // = "EditChains"+jUtil.getRandomNum();

    // Constructor
    public EditCategoryNameClass(String EditCategoryName) {
        this.EditCategoryName = EditCategoryName;
    }
    
    // Getter method to access the private variable
    public String getEditCategoryName() {
        return EditCategoryName;
    }
    
    
// // Create an instance of Person
//    EditCategoryNameClass e = new EditCategoryNameClass("John Doe");
//
// // Access the name variable using the getter method
//    String name = e.getEditCategoryName();
//
// // Print the name
//    System.out.println("The person's name is: " + name); // Output: The person's name is: John Doe
	
}
