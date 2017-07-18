# jenabean
Automatically exported from code.google.com/p/jenabean

This fork is intended to develope a cersion which works with the latest Jena library from Apache instead of the HP old libraries.

Only **jenabaen** has been modified in the first commit (not **jps4jena** - but same could be done there too).

Commit comment describes what has been done. Basically, all tests ran successfully, 
more of the dependencies are now coming from Maven PON dependencies rather then the lib/ folder, one data file in the 
test data that was faulty - was fixed, and now Maven install does a clean smooth job.
