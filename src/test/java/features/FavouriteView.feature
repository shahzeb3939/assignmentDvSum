
  Feature: Add favourite view
    In order to favourite a view
    As a valid DvSum user
    User wants to favourite a view successfully

    Scenario: Favourite View
      Given User is in the DvSum Column Dictionary page
      When User favourites a view
      Then View should be added to favourite view