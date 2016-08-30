#!/bin/bash

if [ $# -gt 0 ]
then
    TEST_NUMBER="Q_"$1
    SRC_DIR="./out/production/baekjoonOnlineJudge/"
    TEST_DIR="./src/test/"

    if [ -f $SRC_DIR$TEST_NUMBER.class ]
    then
        cat $TEST_DIR$TEST_NUMBER.txt;
        cd $SRC_DIR;
        java $TEST_NUMBER < ../../../$TEST_DIR$TEST_NUMBER.txt;
        cd ../../../;
    else
        echo "파일이 없습니다.               "
    fi
else
    echo "파일 이름을 함께 입력해주세요.                 "
fi
