# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Tasks C-J

## Task C:
### Directory: d287-javaframeworks2 > src > main > resources > templates > mainscreen.html

Line 14: Changed title from 'My Bicycle Shop' to 'FutureTech Computer Shop'

Line 19: Changed h1 heading from 'Shop' to 'FutureTech'

Line 21: Changed h2 heading from 'Parts' to 'Computer Parts'


## Task D:
### Directory: d287-javaframeworks2 > src > resources > templates
Created an HTML file called 'about.html'

Line 5: Changed < Title > to 'About Us!'

Line 8: Added a h2 heading with text that said 'About FutureTech -- Where Innovation Meets Excellence'

Line 10-16: Added paragraph tags with text describing the company and ensuring customer satisfaction

### Directory: d287-javaframeworks2 > src > resources > templates > mainscreen.html
Line 89: Added Link for about page

Directory: d287-javaframeworks2 > src > main > com.example.demo > controllers > MainScreenControllerr.java

Lines 56-58: Created a reference to the about page

## Task E:
### Directory: d287-java-frameworks > src > main > java > com.example.demo > bootstrap > BootStrapData.java

Lines 64-135 : Added 5 inhouse parts and 5 outsourced parts Saved them to the corresponding repository

Lines 142-158: Added 5 products and saved them to the product repository.

## Task F:
The “Buy Now” button is added to the product list. The button meets each of the given parameters, and the button is fully functional.

### Directory: d287-javaframeworks2 > src > main > resources > templates > mainstream.html

Line 83-84: Added a 'Buy Now' button on products table and gives pop up to confirm purchase

### Directory: d287-javaframeworks2 > src > main > resources > templates

Created HTML file titled 'purchaseConfirmation.html'

Line 5: Changed title to 'Purchase Confirmation'

Line 8: Added a h1 heading with the text 'Your purchase is successful'

Line 9: Added link to navigate back to home screen


Created HTML file titled 'purchaseError'

Line 5: Changed title to 'Purchase Error'

Line 8: Added h1 heading for error message stating 'There was an error with your purchase. Please confirm inventory and try again.'

Line 9: Added link to navigate back to home screen

### Directory: d287-java-frameworks > src > main > java > domain > Product.java

Line 109-117: Added boolean function to decrement inventory by one
    // public boolean buyProduct() {

        // if (this.inv >= 1 ) {

            this.inv--;

            return true;

        } else {

            return false; }}

### Directory: d287-java-frameworks2 > src > main > java > controllers > AddProductController

Line 176-186:

Line 176: Mapped buyproduct url

line 180: created boolean function for confirming purchase

Line 181: if statement for purchase confirmation or error

Line 184: Redirects user to 'purchaseConfirmation'

Line 186: Redirects user to 'purchaseError' if no confirmation


## Task G:

### Directory: d287-java-frameworks2 > src > main > resources > templates > mainscreen.html

Line 38: Added heading to table called 'Min Inventory'

Line 39: Added heading to table called 'Max Inventory'

Line 48: Added table data cell for minimum inventory

Line 49: Added a table data cell for maximum inventory

### Directory: d287-javaframeworks2 > src > main > java > domain > Part.java

Line 32: Added a pop up message if value is equal to 0

Line 33: Declare minimum variable

Line 34: Declare maximum variable

Line 96: Added code to set Minimum integer

Line 97: Added code to get the Minimum integer

Line 99: Added code to set the Maximum integer

Line 100: Added code to get the Maximum integer


### Directory: d287-javaframeworks2 > src > main > java > domain > InhousePart.java

Line 18: Added default values minimum

Line 19: Added default values for maximum

### Directory: d287-javaframeworks2 > src > main > java > domain > OutsourcedPart.java

Line 18: Added default values minimum

Line 19: Added default values for maximum

### Directory: InhousePartForm.html

Line 24: Adding additional text inputs for inventory for user to set (setting Minimum)

Line 25

Line 26: Adding additional text inputs for inventory for user to set (setting Maximum)

Line 30: Paragraph tags

Line 31: Code to check if any form of errors exist

Line 32: Code to list error in unordered list

Line 33: End division tags

Line 34: End paragraph tags

### Directory: OutsourcedPartForm.html

Line 25: Adding additional text inputs for inventory for user to set (setting Minimum)

Line 26: Displays errors for "inv" field

Line 27: Space for neatness

Line 28: Adding additional text inputs for inventory for user to set (setting Maximum)

Line 29: Repeats error display for "inv" field


### Directory: d287-java-frameworks2 > src > main > resources > application.properties

Line 6: Changed name of persistent storage to "/src/main/resources/spring-boot-h2-db102"

### Directory: d287-java-frameworks2 > src > main > java > com.example.demo > domain > Part

Line 102: Defining validLimits method and checking inventory limits

Line 103: If Inventory is below minimum

Line 104: Setting minimum

Line 105: Else, if inventory is above maximum

Line 106: Set the maximum

### Directory: d287-java-frameworks2 > src > main > java > com.example.demo > service > InhousePartServiceImpl

Line 54: Called validLimits method on thePart object

### Directory: d287-java-frameworks2 > src > main > java > com.example.demo > service > OutsourcedPartServiceImpl

Line 52: Called validLimits method on thePart object

## Task H:
Validation is added for between or at the maximum and minimum fields. The validation includes each of the given parameters and the appropriate error messages. The validation is fully functional.

### Directory: d287-java-frameworks2 > src > main > java > com.example.demo > domain > Part

Line 20: Added validation between max and min fields

Line 21: Added validation between max and min fields

### Directory: d287-java-frameworks2 > src > main > java > com.example.demo > validators >  PartInventoryMinimumValidator.java

Line 1: Defines package for validator classes

Line 2: Imports Part class

Line 3: Import Spring's ApplicationContext

Line 4: Imports field injection annotation

Line 5: Imports Spring's application set

Line 6: Imports validation interfaces

Line 8: Declares PartInventoryMinimumValidator class

Line 10: Injects ApplicationContext

Line 12: Declares static ApplicationContext

Line 15-17: Initializing validator 

Line 20-22: Validates inventory exceeds minimum


### Directory: d287-java-frameworks2 > src > main > java > com.example.demo > validators > ValidPartInventoryMinimum.java 

Line 1: Package declaration

Line 2: Import Constraint interface

Line 3: Import Payload interface

Line 4: Import ElementType enum

Line 5: Import Retention annotation

Line 6: Import RetentionPolicy

Line 7: Import Target annotation

Line 9: Defines constraint, specifies validator

Line 10: Applies to class, interface, or enum

Line 11: Available at runtime

Line 12: Annotation declaration

Line 13: Default error message

Line 14: Validation groups

Line 15: Payload for clients

### Directory: d287-java-frameworks2 > src > main > java > com.example.demo > validators > PartInventoryValidator.java

Line 1: Package declaration

Line 2: Import Part class

Line 3: Import Autowired annotation

Line 4: Import ApplicationContext

Line 5: Import ConstraintValidator interface

Line 6: Import ConstraintValidatorContext

Line 8: Validator class

Line 9: Autowire ApplicationContext

Line 10: ApplicationContext instance

Line 12: Static ApplicationContext

Line 14: Initialize method override

Line 15: Initialization logic

Line 16: Call super

Line 19: isValid method override

Line 20: Validation logic

Line 21: Check inventory validity

### Directory: d287-java-frameworks2 > src > main > java > com.example.demo > validators > ValidPartInventory.java

Line 1: Defining package for validators

Line 2: Import Constraint annotation

Line 3: Import Payload interface

Line 4: Import ElementType for usage targeting

Line 5: Import Retention annotation

Line 6: Import RetentionPolicy for annotation lifecycle

Line 7: Import Target for annotation application scope

Line 9: Define constraint, link validator class

Line 10: Annotation applies to class/enum types

Line 11: Annotation retained at runtime

Line 12: Declare custom constraint annotation

Line 13: Default validation failure message

Line 14: Group related constraints (optional)

Line 15: Carry metadata via payload (optional)

## Task I:

### Directory: d287-java-frameworks2 > src > test > com.example.demo > domain > PartTest

Line 159: Define test method getMinimum().

Line 160: Initialize minimum to 5.

Line 161: Set minimum for partIn.

Line 162: Assert minimum equals partIn.getMinimum().

Line 163: Set minimum for partOut.

Line 164: Assert minimum equals partOut.getMinimum().

Line 165: Define test method getMaximum().

Line 166: Initialize maximum to 5.

Line 167: Set maximum for partIn.

Line 168: Assert maximum equals partIn.getMaximum().

Line 169: Set maximum for partOut.

Line 170: Assert maximum equals partOut.getMaximum().

## Task J:

DeletePartValidator: no usage, deleted

EnufPartsValidator: 1 usage, did NOT delete

PartInventoryMinimumValidator: 1 usage, did NOT delete

PartInventoryValidator: 1 usage, did NOT delete

PriceProductValidator:1 usage, did NOT delete
