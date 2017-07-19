# jenabean
Automatically exported from code.google.com/p/jenabean

This fork is intended to develope a new version which works with the latest Jena library from Apache instead of the HP old libraries.

Only **jenabaen** has been modified in the first commit (not **jps4jena** - but same could be done there too).

Commit comment describes what has been done. Basically, all tests ran successfully, 
more of the dependencies are now coming from Maven POM dependencies rather then the lib/ folder, one data file in the 
test data that was faulty - was fixed, and now Maven install does a clean smooth job.

the jenabean/bin folder holds the new jar *jenabean-apache-1.0.7.jar*

MavenPOMfile indicates the *il.ibm.com* organization id for this release.
This artifact is not yet deposited into the Maven repository.

The convertion work has been partially been supported by the EC H2020 project PSYMBIOSYS, grant #636804
