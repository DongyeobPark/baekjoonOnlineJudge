#!/bin/bash

if [ $# -gt 0 ]
then
    TEST_NUMBER="Q_"$1
    CLASS_DIR="./out/production/baekjoonOnlineJudge/"
    SRC_DIR="./src/"
    TEST_DIR="./src/test/"

    javac -d $CLASS_DIR $SRC_DIR$TEST_NUMBER.java

    if [ -f $CLASS_DIR$TEST_NUMBER.class ]
    then
        cat $TEST_DIR$TEST_NUMBER.txt;
        echo "";
        cd $CLASS_DIR;
        java $TEST_NUMBER < ../../../$TEST_DIR$TEST_NUMBER.txt;
        cd ../../../;
    else
        echo "파일이 없습니다.               "
    fi
else
    echo "파일 이름을 함께 입력해주세요.                 "
fi
