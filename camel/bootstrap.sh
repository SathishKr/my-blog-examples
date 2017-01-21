#!/bin/sh

yum -y update 

yum -y install vsftpd 

# make SELinux permissive for this trivial example
sudo setenforce 0

systemctl restart vsftpd

systemctl enable vsftpd

systemctl stop firewalld
systemctl disable firewalld