package kr.or.connect.guestbook.dao;

public class GuestDaoSqls {
	public static final String SELECT_PAGING = "SELECT id, name, content, regdate FROM guest ORDER BY id DESC limit :start, :limit";
	public static final String DELETE_BY_ID = "DELETE FROM guest WHERE id = :id";
	public static final String SELECT_COUNT = "SELECT count(*) FROM guest";
}
