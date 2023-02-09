package ezen.shoppingmall;

public class ESM {
	public static void main(String[] args) {
		Cart myCart = new Cart(100);
		Album album = new Album(10, "Dynamite", 10000, "BTS");
		
		// 카트에 상품 담기
		myCart.addItem(album);
		
		Movie movie = new Movie(11, "아바타2", 15000, "제임스카메론", "김기정");
		myCart.addItem(movie);
		
		// 카트 상품 목록 조회
		Item[] myItems = myCart.getItems();
		for (int i = 0; i < myCart.getCount(); i++) {
//			System.out.println(myItems[i].getId() + "\t" + myItems[i].getName() + "\t" + myItems[i].getPrice());
			System.out.println(myItems[i]);
		}
		
		System.out.println("------ 검색 테스트 -------");
		
		// 카트 상품 검색
		String searchName = "Dynamite";
		Item searchItem = myCart.findByName(searchName);
		if(searchItem != null) {
//			System.out.println(searchItem.toString());
			System.out.println(searchItem);
			Album al = (Album)searchItem;
			System.out.println(al.getArtist());
		}else {
			System.out.println("검색된 상품이 없시유....");
		}
		
		System.out.println("------ 삭제 테스트 -------");
		if(myCart.removeItem("아바타2")) {
			System.out.println("정상 삭제하였습니다.");
		}else {
			System.out.println("삭제하고자 하는 상품이 존재하지 않습니다.");
		}
		
		// 삭제 후 상품목록 조회
		myItems = myCart.getItems();
		for (int i = 0; i < myCart.getCount(); i++) {
//			System.out.println(myItems[i].getId() + "\t" + myItems[i].getName() + "\t" + myItems[i].getPrice());
			System.out.println(myItems[i]);
		}
		
		// 카트 비우기 테스트
		myCart.removeAll();
		System.out.println(myCart.getCount());
		
	}

}












