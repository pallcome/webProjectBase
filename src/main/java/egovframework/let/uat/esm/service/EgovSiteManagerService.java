package egovframework.let.uat.esm.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import egovframework.com.cmm.AbstractServiceImpl;

/**
 * 사이트관리자의 로그인 비밀번호를 변경 처리하는 비즈니스 구현 클래스
 * @author 공통서비스 개발팀
 * @since 2023.04.15
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일      수정자          수정내용
 *  -------    --------    ---------------------------
 *  2023.04.15  김일국          최초 생성
 *
 *  </pre>
 */
@Service("siteManagerService")
public class EgovSiteManagerService extends AbstractServiceImpl {
	/**
	 * 기존 비번과 비교하여 변경된 비밀번호를 저장한다.
	 * @param map데이터 String: login_id, old_password, new_password
	 * @return 성공시 1
	 */
	public Integer updateAdminPassword(Map<?, ?> map) {
		return sqlSession.update("siteManagerDAO.updateAdminPassword", map);
	}
}
