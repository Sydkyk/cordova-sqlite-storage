# Changes

## 0.7.1-common-dev

- Rename Windows C++ Database close function to closedb to resolve conflict for Windows Store certification
- REGEXP and pre-populated database support removed from this version branch
- Amazon Fire-OS support removed
- Fix conversion warnings in iOS version
- Fix to Windows "Universal" version to support big integers
- Implement database close and delete operations for Windows "Universal"
- Fix readTransaction to skip BEGIN/COMMIT/ROLLBACK