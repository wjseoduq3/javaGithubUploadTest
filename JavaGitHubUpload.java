package helloworld240429;

public class JavaGitHubUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이클립스에서 깃허브 업로드 순서
		// 0. 깃허브 사이트에서 새로운 repository 생성 후 해당 repository의 url 복사
		// 1. 업로드하려는 프로젝트 폴더 마우스 오른쪽 버튼 메뉴에서 team->share project
		// 2. Use or.... 항목 체크->밑에 프로젝트 폴더 클릭->Create Repository 클릭->Finish
		// 3. Git Repository 창에 해당 프로젝트가 출력됨->프로젝트 폴더안에 remotes 폴더 찾기
		// 4. Remotes 폴더 마우스 오른쪽 버튼 메뉴에서 create remote 클릭
		// 5. remote 이름은 origin으로 유지하고 Create 클릭
		// 6. Change 버튼 클릭->복사해 놓은 해당 repository의 url 자동으로 입력됨
		//    (자동으로 입력되지 않은 경우는 다시 복사 후 맨 윗줄 URI란에 붙여넣기)
		//    -> github 계정과 토큰 확인(토큰이 입력되지 않았으면 계정 및 토큰 입력)->Finish
		// 7. 하단의 다른 버튼을 절대! 클릭하지 말고 save 버튼 클릭
		//    (다시 Reomotes 확인하면 origin 리모트가 생성되고 해당 깃허브 URL과 연동됨을 확인가능)
		// 8. Git Staging 탭으로 이동
		// 9. Unstaged Changes란에 깃허브로 업로드 되지 않은 파일들이 표시됨->
		//    한번에 모두 올리기 위해서 ++버튼 클릭->Staged Changes로 모두 이동됨
		//    (9번 단계로 왔을때 Unstaged Changes란에 아무것도 없으면 이미 git에서 commit이 된 상태임)
		// 10. commit 메시지 입력(반드시 입력해야함 아무것도 안쓰면 push안됨)
		//    (Author와 committer 본인 이메일 및 깃허브 계정 입력 확인)
		// 11. Commit and Push 클릭
		// 12. 혹시 next 버튼이 나오면 클릭->close버튼이 나오면 업로드 성공
		// 13. 깃허브 사이트로 가서 업로드 되었는지 새로고침으로 확인
		// 14. 만약 push가 안되었다고 생각되면 Git Repo의 프로젝트에 오른쪽 클릭하면
		// 	   push branch 'master'로 push
		// 15. full할 때는 14.에서 full


	}

}
