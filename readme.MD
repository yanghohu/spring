Git 명령어 총정리집 (by 코딩알려주는 누나❤)


안녕하세요 여러분 :) 😊 코딩알려주는 누나 채널을 통해 오신분들 환영합니다! 제 자료가 git을 처음 공부하시는 분들께 항상 와서 들여다 볼 수 있는 유용한 자료가 되었으면 좋겠습니다!👍👍

본자료는 강의의 참조자료로📘 이 자료를 이해하시려면 강의를 먼저 보시는게 좋습니다.

강의 1탄 👩‍🏫: https://youtu.be/lelVripbt2M
강의 2탄 👩‍🏫: https://youtu.be/cwC8t9dno2s
Git 설치 & 환경설정 🔍
Git 설치하기 : https://git-scm.com/

설치 완료 후 Git bash 열기

git bash 에서 환경설정 하기

Step 1 : 유저이름 설정
git config --global user.name "your_name"


Step 2 : 유저 이메일 설정하기
git config --global user.email "your_email"
Github가입시 사용한 이메일을 써주세요!



Step 3 : 정보 확인하기
git config --list


Github에 처음 코드 업로드하기 🏋️‍♂️
초기화

git init
추가할 파일 더하기

git add .
.(점) 은 모든 파일이라는 뜻, 선택적으로 올리고 싶으면 add뒤에 파일 이름 붙여주면 됨 (예. git add index.html)

상태 확인 (선택사항)

git status
히스토리 만들기

git commit -m "first commit"
-m 은 메세지의 준말로 뒤에 “” 안에 주고싶은 히스토리 이름을 주면 됨 (즉, 구지 first commit일 필요가 없다는 뜻^^)

Github repository랑 내 로컬 프로젝트랑 연결

git remote add origin https://github.com/bitnaGithub/firstproject.git
이 명령어는 github에서 복사해서 붙여와야함 (유투브 강의 참조)

잘 연결됬는지 확인 (선택사항)

git remote -v
내가 연결한 주소값이 잘 뜨면 성공!🎇

Github로 올리기

git push origin master
master 자리에는 branch이름이 들어가면 됨 branch이름이 main라하면 git push origin main 이라고 써야함

Github에 계속 업데이트 하는법 🤹‍♂️
추가할 파일 더하기
git add .
히스토리 만들기
git commit -m "first commit"
Github로 올리기
git push origin master
내 컴퓨터에 소스코드를 업데이트를 하고 싶으면 이 세개의 스텝만 계속 반복하면 됨.

Github로 팀프로젝트 하는법 👨‍👩‍👧‍👦
Github에서 소스코드 다운로드

git clone 주소 폴더이름
주소는 깃허브에서 들고와야함
폴더이름은 선택사항이다 (즉 없어도됨) 폴더이름을 줄경우에는 그 폴더가 새로 생성이 되면서 그 안에 코드들이 다운로드가 되고, 폴더이름을 안줄경우엔 깃허브 프로젝트 이름으로 폴더가 자동으로 생기고 그안에 코드들이 다운로드된다.
Github에서 내 브렌치(branch)만들기

git checkout -b 브렌치이름
내 브렌치에 소스코드 업데이트하기

git add .
git commit -m "first commit"
git push origin 브렌치이름
마스터 브렌치에 소스 가져오기(pull)

git pull origin master
pull을 하기전에는 기존에 소스코드들을 commit을 먼저 해놔야 한다 (2탄 강의참조)

브렌치끼리 이동하는 법

git checkout 브렌치이름
강의에서 소개하진 않았지만 내가 내 브렌치에서 마스터 브렌치로 이동을 하고 싶거나 다른 브렌치로 이동하고싶으면 해당 명령어를 쓰면 된다

깃 명령어를 가장 잘 연습할수 있는 방법은 여러분이 친구끼리👨‍👩‍👧‍👧 한번 뭉쳐서 팀 프로젝트를 같이 해보는 겁니다! 한번 다같이 팀프로젝트를 해보면서 부딛히고 실수하고 깨져봐야 마음으로 느껴지실겁니다❤

여러분들의 무한한 발전을 위하여! 이 누나가 항상 응원하겠습니다🚀🚀


echo "# spring" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/yanghohu/spring.git
git push -u origin main