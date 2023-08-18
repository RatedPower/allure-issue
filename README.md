# Allure issue
What we have observed:
- If we use Allure gradle plugin 2.8.1, everything is fine.
- When we bump the plugin to 2.11.2, the test fails because mockito cannot mock Repository class
- If we use 2.11.2 and we downgrade jacoco to 0.8.8, it works again
- If we remove 	@jakarta.transaction.Transactional(value = jakarta.transaction.Transactional.TxType.REQUIRES_NEW) in Repository class it also works (this is not an option)
