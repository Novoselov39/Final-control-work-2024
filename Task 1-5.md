# Task 1

user@ubuntu-1:~/Animals$ cat > Pets

dog

cat

hamster

^C

user@ubuntu-1:~/Animals$ cat > Pack\ animals

horse

camel

monkey

^C

user@ubuntu-1:~/Animals$ cat Pets Pack\ animals >>Human\Friends

user@ubuntu-1:~/Animals$ ls

 HumanFriends  'Pack animals'   Pets

user@ubuntu-1:~/Animals$ cat HumanFriends

dog

cat

hamster

horse

camel

monkey

-----------

# Task 2

user@ubuntu-1:~/Animals$ mkdir task2

user@ubuntu-1:~/Animals$ mv HumanFriends task2/

user@ubuntu-1:~/Animals$ ls

'Pack animals'   Pets   task2

user@ubuntu-1:~/Animals$ cd task2/

user@ubuntu-1:~/Animals/task2$ ls

HumanFriends

user@ubuntu-1:~/Animals/task2$

----------

# Task  3

user@ubuntu-1:~/Animals/task2$ sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.23-1_all.deb

user@ubuntu-1:~/Animals/task2$ sudo dpkg -i mysql-apt-config_0.8.23-1_all.deb

user@ubuntu-1:~/Animals/task2$ sudo apt-get update

user@ubuntu-1:~/Animals/task2$ sudo apt-get install mysql-server

# Task 4

user@ubuntu-1:~/Animals/task2$ sudo wget https://download.docker.com/linux/ubuntu/dists/jammy/pool/stable/amd64/docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb

user@ubuntu-1:~/Animals/task2$ sudo dpkg -i docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb

user@ubuntu-1:~/Animals/task2$ sudo dpkg -r docker-ce-cli
