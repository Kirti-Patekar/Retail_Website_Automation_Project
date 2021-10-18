Feature: Retail website

  Background: 
    Given Admin is on Login page
    When Admin enter username and password
    And Admin clicks on Login button
    Then Verify if Admin is successfully logged in
    When click on menu
    When Admin clicks on Sales dropdown
    When Admin clicks on Return option
    Then Verify if Admin in on Product Return page

  @ReturnID
  Scenario Outline: Validate ReturnID field
    Given Admin is on Product Return Page
    When Admin enter valid input "<ValidReturnIDInput>" into ReturnID
    And Admin Clicks on filter button
    Then Verify if Admin is able to see record based on the given input "<ValidReturnIDInput>" in ReturnID
    When Admin enter invalid input "<InvalidReturnIDInput>" into ReturnID
    And Admin Clicks on filter button
    Then Verify if Admin is not able to see any record

    Examples: 
      | ValidReturnIDInput | InvalidReturnIDInput |
      |                380 | ABC                  |

  @OrderID
  Scenario Outline: Validate OrderID field
    Given Admin is on Product Return Page
    When Admin enter valid input "<ValidOrderIDInput>" into OrderID
    And Admin Clicks on filter button
    Then Verify if Admin is able to see record based on the given input "<ValidOrderIDInput>" in OrderID
    When Admin enter invalid input "<InvalidOrderIDInput>" into OrderID
    And Admin Clicks on filter button
    Then Verify if Admin is not able to see any record

    Examples: 
      | ValidOrderIDInput | InvalidOrderIDInput |
      |               450 | ABC                 |

  @CustomerName
  Scenario Outline: Validate CustomerName field
    Given Admin is on Product Return Page
    When Admin enter valid input "<ValidCustomerNameInput>" into CustomerName
    And Admin Clicks on filter button
    Then Verify if Admin is able to see record based on the given input "<ValidCustomerNameInput>" in CustomerName
    When Admin enter invalid input "<InvalidCustomerNameInput>" into CustomerName
    And Admin Clicks on filter button
    Then Verify if Admin is not able to see any record

    Examples: 
      | ValidCustomerNameInput | InvalidCustomerNameInput |
      | Vaibhavi Bagat         | +123ABC                  |

  @ProductName
  Scenario Outline: Validate ProductName field
    Given Admin is on Product Return Page
    When Admin enter valid input "<ValidProductNameInput>" into ProductName
    And Admin Clicks on filter button
    Then Verify if Admin is able to see record based on the given input "<ValidProductNameInput>" in ProductName
    When Admin enter invalid input "<InvalidProductNameInput>" into ProductName
    And Admin Clicks on filter button
    Then Verify if Admin is not able to see any record

    Examples: 
      | ValidProductNameInput | InvalidProductNameInput |
      | Laptop                | +123ABC                 |

  @ModelName
  Scenario Outline: Validate ModelName field
    Given Admin is on Product Return Page
    When Admin enter valid input "<ValidModelNameInput>" into ModelName
    And Admin Clicks on filter button
    Then Verify if Admin is able to see record based on the given input "<ValidModelNameInput>" in ModelName
    When Admin enter invalid input "<InvalidModelNameInput>" into ModelName
    And Admin Clicks on filter button
    Then Verify if Admin is not able to see any record

    Examples: 
      | ValidModelNameInput | InvalidModelNameInput |
      | AP001               | +123ABC               |

  @ReturnStatus
  Scenario Outline: Validate ReturnStatus field
    Given Admin is on Product Return Page
    When Admin select one option "<ValidReturnStatusInput>" from the ReturnStatus dropdown
    Then Verify if Admin is able to see selected option "<ValidReturnStatusInput>" in ReturnStatus
    And Admin Clicks on filter button
    Then Verify if Admin is able to see record based on the selected option "<ValidReturnStatusInput>" in ReturnStatus
    When Admin enters intial of "<ValidReturnStatusInput>"
    And Clicks on enter button
    Then Verify if Admin is able to see selected option "<ValidReturnStatusInput>" in ReturnStatus if initial letter is entered

    Examples: 
      | ValidReturnStatusInput | InvalidReturnStatusInput |
      | Pending                | +123ABC                  |

  @DateAdded
  Scenario Outline: Validate DateAdded field
    Given Admin is on Product Return Page
    When Admin enter invalid input "<InvalidDateInput>" in DateAdded field
    And Admin Clicks on filter button
    Then Verify if Admin is not able to see any record
    When Admin enter valid input "<ValidDateInput>" in DateAdded field
    And Admin Clicks on filter button
    Then Verify if Admin is able to see record based on the given input "<ValidDateInput>" in DateAdded field

    Examples: 
      | ValidDateInput | InvalidDateInput |
      | 2021-10-11     | ABcd             |

  @DateModified
  Scenario Outline: Validate DateModified field
    Given Admin is on Product Return Page
    When Admin enter invalid input "<InvalidDateInput>" in DateModified field
    And Admin Clicks on filter button
    Then Verify if Admin is not able to see any record
    When Admin enter valid input "<ValidDateInput>" in DateModified field
    And Admin Clicks on filter button
    Then Verify if Admin is able to see record based on the given input "<ValidDateInput>" in DateModified field

    Examples: 
      | ValidDateInput | InvalidDateInput |
      | 2021-10-11     | ABcd             |

  
  @Checkbox
  Scenario Outline: Verify checkbox
    Given Admin is on Product Return Page
    When Admin clicks on the checkbox of a row "<row>"
    Then Verify if the checkbox of row "<row>" is checked
    When Admin clicks on the checkbox of a row "<row>"
    Then Verify if the checkbox of row "<row>" is unchecked
    When Admin clicks on the checkbox of the table header
    Then Verify if the checkboxes in every row is checked

    Examples: 
      | row |
      |   7 |

  @TabelView
  Scenario Outline: Verify Tabel view
    Given Admin is on Product Return Page
    And Admin Clicks on filter button
    Then Verify if admin is able to see all columns "<column1>", "<column2>", "<column3>", "<column4>", "<column5>", "<column6>", "<column7>", "<column8>", "<column9>" and "<column10>" of the tabel
    When Admin clicks on table header column Return ID
    Then Verify if Return ID column get sorted in Ascending Order
    When Admin clicks on table header column Return ID
    Then Verify if Return ID column get sorted in Descending Order
    When Admin clicks on table header column Order ID
    Then Verify if Order ID column get sorted in Ascending Order
    When Admin clicks on table header column Order ID
    Then Verify if Order ID column get sorted in Descending Order
    When Admin clicks on table header column Customer
    Then Verify if Customer column get sorted in Ascending Order
    When Admin clicks on table header column Customer
    Then Verify if Customer column get sorted in Descending Order
    When Admin clicks on table header column Product
    Then Verify if Product column get sorted in Ascending Order
    When Admin clicks on table header column Product
    Then Verify if Product column get sorted in Descending Order
    When Admin clicks on table header column Model
    Then Verify if Model column get sorted in Ascending Order
    When Admin clicks on table header column Model
    Then Verify if Model column get sorted in Descending Order
    When Admin clicks on table header column Status
    Then Verify if Status column get sorted in Ascending Order
    When Admin clicks on table header column Status
    Then Verify if Status column get sorted in Descending Order
    When Admin clicks on table header column Date Added
    Then Verify if Date Added column get sorted in Ascending Order
    When Admin clicks on table header column Date Added
    Then Verify if Date Added column get sorted in Descending Order
    When Admin clicks on table header column Date Modified
    Then Verify if Date Modified column get sorted in Ascending Order
    When Admin clicks on table header column Date Modified
    Then Verify if Date Modified column get sorted in Descending Order

    Examples: 
      | column1 | column2   | column3  | column4  | column5 | column6 | column7 | column8    | column9       | column10 |
      |         | Return ID | Order ID | Customer | Product | Model   | Status  | Date Added | Date Modified | Action   |

  @EditReturnProduct
  Scenario Outline: Validate EditReturnProduct field
    Given Admin is on Product Return Page
    When Admin clicks on edit option of a row "<row>"
    Then Verify if Admin is on Edit Product Return Page
    When Admin enter "<OrderID>","<FirstName>","<LastName>","<Email>","<Telephone>","<Product>","<Model>"
    And Admin clicks on save button
    Then Verify if admin is navigated to Product Return Page

    Examples: 
      | row | OrderID | FirstName | LastName | Email               | Telephone  | Product | Model  |
      |   5 |     678 | Alpha     | Bens     | alphabens@gmail.com | 0222789656 | Phone   | Pocof1 |
  
  @Pagination
  Scenario: Verify Pagination
    Given Admin is on Product Return Page
    Then Verify if their is pagination in the webpage
    Then Verify if their is pagination after every 25 records
