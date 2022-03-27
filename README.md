# Chord-DHC
Distributed hash Table on a network (Chord)
We are gona use Socket Programming here
and Multithreading for the Server as it need to handle several clients
So the functions/actions that the client could do

Clent Functionality :
* join the network :- on joining the network the client would get his shares of key-value pairs accoriding to it's hash value.
* leave the network :- on leaving the network the keys that the client currently hold would be given to it's successor if not then to the main server.
* add key-value pair to the netowrk :- the client can add a new key-value pair to the newtork.
* get the value for a given key :- on providing a given key the newtork will give the value corrospondint to it if it exist's if not the it would tell the same.