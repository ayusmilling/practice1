
public class yoyo12 {
	public static void main(String []args) {
		int i = 0, j =0, k = 0;
		Block1:{
			for (i = 0; 1<100; i++) {
				for(j = 0; j<100;  j++) {
					for(k = 0; k<100;  k++) {
						if (i == 20 &&  j == 30 && k== 50)
							break Block1;
					}
				}
			}
		}
		System.out.println("�@�f����X�T��for�j��");
		System.out.println("���ɪ�i= " +  i +" ���ɪ�j=  "+ j +" ���ɪ�k = " + k );
	}
}
