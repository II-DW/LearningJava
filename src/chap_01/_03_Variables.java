package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "고객";
        // name = "고객";
        int hour = 15;
        // hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A'; // >>"<< X
        name = "강백호"; // 값 업데이트

        System.out.println(name + "님의 평균 점수는 " +  score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true; // or boolean pass = false;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F; // float은 double만큼의 정밀한 데이터를 넣을 수 없음 (error) => 3.14F or 3.14f
        System.out.println(d);
        System.out.println(f);

        // int i = 1000000000000; (error), int의 범위를 벗어남.
        long l ;
        l = 1_000_000_000_000l; // 1000000000000 : int형 자료, 뒤에 l 또는 L 붙이면 long형 자료, 언더바(_) 붙여도 상관 X
        System.out.println(l);
    }
}
