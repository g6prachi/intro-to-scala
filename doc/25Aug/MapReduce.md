MapReduce

Hadoop MapReduce is a software framework for easily writing applications,
which process vast amounts of data in-parallel on large clusters.

It is a processing technique for distributed computing based on Java
Two tasks are there in this - Map and Reduce

Map stage − In this stage, we process the input data. 
The input file is passed to the mapper function line by line. 
It then processes the data and creates several small chunks of data.

The framework sorts the outputs of the maps, which are then input to the reduce tasks.

Reduce stage − Combination of the Shuffle stage and the Reduce stage. 
The Reducer processes the data that comes from the mapper. 
It then produces a new set of output, which is stored in the HDFS.

Computation takes place on nodes on local disks, to reduce network traffic

The framework takes the input as a set of <key, value> pairs; say, (k1, v1)
It then produces a set of <key, value> pairs as the output, of different types; say, (k2, v2)

Input and Output types of a MapReduce: 
(Input) <k1, v1> -> map <k2, v2> -> reduce -> <k3, v3> (Output)
