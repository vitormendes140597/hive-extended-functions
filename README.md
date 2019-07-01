[![Hive Logo](https://upload.wikimedia.org/wikipedia/commons/b/bb/Apache_Hive_logo.svg)]

# Hive Useful User Defined Functions

## Available Functions

- Slice : Slice an Array


## Slice

Example :

- **Full Table**

| id | name   | pets                                                               |
|----|--------|--------------------------------------------------------------------|
| 1  | Vitor  | ['dog','cat','pig']                                                |
| 2  | Lucas  | ['dog','pig','cat','bee','horse']                                  |
| 3  | Marcos | ['horse','dolphin','cat','spider','frog',''bird','dog','flamingo'] |


SELECT **SLICE(pets,3) as pets** from animals

- **After slice using only 1 index**

| pets                                             |
|--------------------------------------------------|
| ['pig']                                          |
| ['cat','bee','horse']                            |
| ['cat','spider','frog',''bird','dog','flamingo'] |


SELECT **SLICE(pets,1,3) as pets** from animals

- **After slice using 2 indexes**

| pets                      |
|---------------------------|
| ['dog','cat','pig']       |
| ['dog','pig','cat']       |
| ['horse','dolphin','cat'] |
