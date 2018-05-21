Narrative:
In order to search for CI documentation
As a QA
I want to perform a search for determinate subject

Scenario Outline: Success when searching for a specific CI.

Given I access the Google
When I search for [ci_name]
Then I should see the CI searched on top of the list

Examples:
| ci_name  |
| CircleCI |
| Jenkins  |