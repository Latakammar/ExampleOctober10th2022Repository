package AssignmentOnPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeWebElements
{
    public ActitimeWebElements(WebDriver browse)
    {
    	PageFactory.initElements(browse,this);
    }
	
    //username text field
    private WebElement username;
    public WebElement getUsername()
    {
    	return username;
    }
    
    //password text field
    private WebElement pwd;
    public WebElement getPwd()
    {
    	return pwd;
    }
    //login button
    @FindBy(xpath="//div[text()='Login ']")
    private WebElement loginbutton;
    public WebElement getLoginButton()
    {
    	return loginbutton;
    }
    
    //users
    @FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a")
    private WebElement users;
    public WebElement getUsers()
    {
    	return users;
    }
    
  
  //addUsers
    @FindBy(xpath="//div[text()='Add User']")
    private WebElement addUsers;
    public WebElement getAddUser()
    {
    	return addUsers;
    }
    
    //firstname
    private WebElement firstName;
    public WebElement getFirstName()
    {
    	return firstName;
    }
    
    
  //lastName
    private WebElement lastName;
    public WebElement getLastName()
    {
    	return lastName;
    }
    
    //email
    private WebElement email;
    public WebElement getEmail()
    {
    	return email;
    }
    
    //username
    private WebElement userDataLightBox_usernameField;
    public WebElement getun()
    {
    	return userDataLightBox_usernameField;
    }
    //password
    private WebElement password;
    public WebElement getpassword()
    {
    	return password;
    }
    
    //passwordCopy
    private WebElement passwordCopy;
    public WebElement getPasswordCopy()
    {
    	return passwordCopy;
    }
    
  //createUser
    @FindBy(xpath="//span[text()='Create User']")
    private WebElement createUser;
    public WebElement getcreateUser()
    {
    	return createUser;
    }
    
  //clickOnabc      //----//span[text()='"+ln+", "+fn+"']
    @FindBy(xpath="//span[text()='abc, abc']")
    private WebElement clickOnabc;
    public WebElement getclickOnabc()
    {
    	return clickOnabc;
    }
  //clickOnuser1      //----//span[text()='"+ln+", "+fn+"']
    @FindBy(xpath="//span[text()='user1, user1']")
    private WebElement clickOnuser1;
    public WebElement getclickOnuser1()
    {
    	return clickOnuser1;
    }
  //clickOnuser2      //----//span[text()='"+ln+", "+fn+"']
    @FindBy(xpath="//span[text()='user2, user2']")
    private WebElement clickOnuser2;
    public WebElement getclickOnuser2()
    {
    	return clickOnuser2;
    }
  //clickOnuser3      //----//span[text()='"+ln+", "+fn+"']
    @FindBy(xpath="//span[text()='user3, user3']")
    private WebElement clickOnuser3;
    public WebElement getclickOnuser3()
    {
    	return clickOnuser3;
    }
    
    
    //userDataLightBox_deleteBtn
    
    private WebElement userDataLightBox_deleteBtn;
    public WebElement getdeleteUser()
    {
    	return userDataLightBox_deleteBtn;
    }
    //save changes
    @FindBy(xpath="//span[text()='Save Changes']")
    private WebElement saveChanges;
    public WebElement getsaveChanges()
    {
    	return saveChanges;
    }
    
    //logout
    @FindBy(linkText="Logout")
    private WebElement logout;
    public WebElement getLogoutButton()
    {
    	return logout;
    }
    
    ////span[text()='Start exploring actiTIME']
    @FindBy(xpath="//span[text()='Start exploring actiTIME']")
    private WebElement startExploringActiTime;
    public WebElement getstartExploringActiTime()
    {
    	return startExploringActiTime;
    }
    
    ////*[@id='topnav']/tbody/tr[1]/td[3]/a
    @FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[3]/a")
    private WebElement tasks;
    public WebElement gettasks()
    {
    	return tasks;
    }
    
    ////*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]
    @FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")
    private WebElement tasksaddnew;
    public WebElement gettasksaddnew()
    {
    	return tasksaddnew;
    }
    
    ///html/body/div[12]/div[1]
    @FindBy(xpath="/html/body/div[12]/div[1]")
    private WebElement newCustomer;
    public WebElement getnewCustomer()
    {
    	return newCustomer;
    }
    
    //customerLightBox_nameField
    private WebElement customerLightBox_nameField;
    public WebElement getcustomerLightBox_nameField()
    {
    	return customerLightBox_nameField;
    }
    
    //customerLightBox_descriptionField
    private WebElement customerLightBox_descriptionField;
    public WebElement getcustomerLightBox_descriptionField()
    {
    	return customerLightBox_descriptionField;
    }
    
    ////span[text()='Create Customer']
    @FindBy(xpath="//span[text()='Create Customer']")
    private WebElement createCustomerButton;
    public WebElement getcreateCustomerButton()
    {
    	return createCustomerButton;
    }
    
    ////*[@id="cpTreeBlock"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]
    @FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
    private WebElement customerSettings;
    public WebElement getcustomerSettings()
    {
    	return customerSettings;
    }
    
    ////div[text()='ACTIONS']
    @FindBy(xpath="//div[text()='ACTIONS']")
    private WebElement customerAction;
    public WebElement getcustomerAction()
    {
    	return customerAction;
    }
    
    ////div[text()='Delete']
    @FindBy(xpath="//div[text()='Delete']")
    private WebElement customerDelete;
    public WebElement getcustomerDelete()
    {
    	return customerDelete;
    }
    
    //customerPanel_deleteConfirm_submitTitle
    private WebElement customerPanel_deleteConfirm_submitTitle;
    public WebElement getcustomerPanel_deleteConfirm_submitTitle()
    {
    	return customerPanel_deleteConfirm_submitTitle;
    }
    ////*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[2]/input
    @FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[2]/input")
    private WebElement customerNameEdit;
    public WebElement getcustomerNameEdit()
    {
    	return customerNameEdit;
    }
    
    ////*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea
    @FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
    private WebElement customerDescEdit;
    public WebElement getcustomerDescEdit()
    {
    	return customerDescEdit;
    }
    
    ////*[@id='taskListBlock']/div[2]/div[1]/div[1]
    @FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[1]")
    private WebElement customerEditClose;
    public WebElement getcustomerEditClose()
    {
    	return customerEditClose;
    }
    
    ///html/body/div[12]/div[2]
    @FindBy(xpath="/html/body/div[12]/div[2]")
    private WebElement newProject;
    public WebElement getnewProject()
    {
    	return newProject;
    }
    
    //projectPopup_projectNameField 
    private WebElement projectPopup_projectNameField;
    public WebElement getprojectPopup_projectNameField()
    {
    	return projectPopup_projectNameField;
    }
    
    //projectPopup_projectDescriptionField
    private WebElement projectPopup_projectDescriptionField;
    public WebElement getprojectPopup_projectDescriptionField()
    {
    	return projectPopup_projectDescriptionField;
    }
    
    ////span[text()='Create Project']
    @FindBy(xpath="//span[text()='Create Project']")
    private WebElement createProject;
    public WebElement getcreateProject()
    {
    	return createProject;
    }
    
    ////*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]
    @FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
    private WebElement projectSettings;
    public WebElement getprojectSettings()
    {
    	return projectSettings;
    }
    
    ////*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea
    @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
    private WebElement projectDescription;
    public WebElement getprojectDescription()
    {
    	return projectDescription;
    }
    
    ////*[@id='taskListBlock']/div[4]/div[1]/div[1]
    @FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[1]")
    private WebElement projectWindowClose;
    public WebElement getprojectWindowClose()
    {
    	return projectWindowClose;
    }
    ////div[text()='Add New Task']
    @FindBy(xpath="//div[text()='Add New Task']")
    private WebElement addNewTask;
    public WebElement getaddNewTask()
    {
    	return addNewTask;
    }
    
    ///html/body/div[11]/div[1]
    @FindBy(xpath="/html/body/div[11]/div[1]")
    private WebElement createNewTask;
    public WebElement getcreateNewTask()
    {
    	return createNewTask;
    }
    ////*[@id="createTasksPopup_createTasksTableContainer"]/table/tbody/tr[1]/td[1]/input
    @FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
    private WebElement enterTaskName;
    public WebElement getenterTaskName()
    {
    	return enterTaskName;
    }
    ////*[@id='descriptionElement']/img
    @FindBy(xpath="//*[@id='descriptionElement']/img")
    private WebElement taskDescImg;
    public WebElement gettaskDescImg()
    {
    	return taskDescImg;
    }
    
  //editDescriptionPopupText
    private WebElement editDescriptionPopupText;
    public WebElement geteditDescriptionPopupText()
    {
    	return editDescriptionPopupText;
    }
    
    //scbutton
    private WebElement scbutton;
    public WebElement getscbutton()
    {
    	return scbutton;
    }
    ////button[text()='set deadline']
    @FindBy(xpath="//button[text()='set deadline']")
    private WebElement setDeadLine;
    public WebElement getsetDeadLine()
    {
    	return setDeadLine;
    }
    
    ////*[@id="ext-gen422"]/tbody/tr[2]/td/table/tbody/tr[3]/td[5]/a/em/span
    @FindBy(xpath="//*[@id=\"ext-gen422\"]/tbody/tr[2]/td/table/tbody/tr[3]/td[5]/a/em/span")
    private WebElement selectDateFromCalender;
    public WebElement getselectDateFromCalender()
    {
    	return selectDateFromCalender;
    }
    
    ////*[@id="createTasksPopup_commitBtn"]/div/span
    @FindBy(xpath="//*[@id=\"createTasksPopup_commitBtn\"]/div/span")
    private WebElement createTaskButton;
    public WebElement getcreateTaskButton()
    {
    	return createTaskButton;
    }
    
  
}
