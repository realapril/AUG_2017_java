import java.util.Random;
import java.util.Scanner;

public class NO1_If_Random {
    public static void main(String[] args) {

        System.out.println("재수생 동생 일일 보모하기");
        System.out
                .println("재수 종합반 학원이 여름방학을 했다. 동생은 오늘 집에서 수능 시간표에 맞춰 공부를 하려 한다.\n 부모님은 동생의 성취를 이루는 것을 도울 것을 부탁하며 보상을 약속했다.");
        System.out.println("그러나 다 큰 성인을 돌보는 것은 쌍방에게 스트레스 받는 일이다. \n 나와 동생의 스트레스를 각각 100 미만으로 유지하고, 성취를 돕자.");
        System.out.println("부모님으로부터 용돈을 획득하고 가족 내 영향력을 상승시키자!\n");

        System.out.println("=====================현재 상태==========================");

        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c));

        System.out.println("=====================================================");

        // 선택지
        int sun;

        Scanner scan = new Scanner(System.in); // 문자 입력을 인자로 Scanner 생성


        System.out.println("아침 7시이다. 동생이 7시에 일어난다고 했던 것 같다. 깨워야할까?");

        // 키보드 문자 입력2

        System.out.println("선택지를 고르세요 ");
        System.out.println("1.깨운다");
        System.out.println("2.깨우지 않는다");

        sun = scan.nextInt();

        if (sun == 1) {
            System.out.println("동생이 일어났다. 아이고두야.\n 내스트레스+20, 동생 성취+10");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 20, b, c + 10));
            a = a + 20;
            c = c + 10;
            System.out.println("=====================================================");

            System.out.println("\n 일찍 일어났기 때문에 동생은 방에서 공부를 시작했다. 밥 먹기 전까지 하는 것 같다. 그런데..");

            int moon;

            System.out.println("내가 어떻게 해야 할까?");
            System.out.println("1.동생을 믿자. 놔둔다");
            System.out.println("2.어떤 과목을 공부하는지만 확인하고 나온다");
            System.out.println("3.옆에서 감시한다");

            moon = scan.nextInt();
            if (moon == 1) {
                System.out.println("동생은 아주 잘 잤다. \n 동생 성취-5");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c - 5));
                System.out.println("=====================================================");
                c = c - 5;

            } else if (moon == 2) {
                System.out.println("어젯밤 다 못푼 수학 문제를 한다고 한다. \n 동생 성취 +5");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c + 5));
                System.out.println("=====================================================");
                c = c + 5;
            } else if (moon == 3) {
                System.out.println("아침부터 감시한다고 동생이 화났다. 누군 감독하는게 즐거운줄 알아? \n 내 스트레스+15 동생 스트레스+15 동생 성취+10");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 15, b + 15, c + 10));
                System.out.println("=====================================================");
                a = a + 15;
                b = b + 15;
                c = c + 10;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");
                System.out.println("=====================================================");

                System.out.println("\n 일찍 일어났기 때문에 동생은 방에서 공부를 시작했다. 밥 먹기 전까지 하는 것 같다. 그런데..");

                System.out.println("내가 어떻게 해야 할까?");
                System.out.println("1.동생을 믿자. 놔둔다");
                System.out.println("2.어떤 과목을 공부하는지만 확인하고 나온다");
                System.out.println("3.옆에서 감시한다");

                moon = scan.nextInt();
                if (moon == 1) {
                    System.out.println("동생은 아주 잘 잤다. \n 동생 성취-5");
                    System.out.println("=====================현재 상태==========================");
                    System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c - 5));
                    System.out.println("=====================================================");
                    c = c - 5;

                } else if (moon == 2) {
                    System.out.println("어젯밤 다 못푼 수학 문제를 한다고 한다. \n 동생 성취 +5");
                    System.out.println("=====================현재 상태==========================");
                    System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c + 5));
                    System.out.println("=====================================================");
                    c = c + 5;
                } else if (moon == 3) {
                    System.out.println("아침부터 감시한다고 동생이 화났다. 누군 감독하는게 즐거운줄 알아? \n 내 스트레스+15 동생 스트레스+15 동생 성취+10");
                    System.out.println("=====================현재 상태==========================");
                    System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 15, b + 15, c + 10));
                    System.out.println("=====================================================");
                    a = a + 15;
                    b = b + 15;
                    c = c + 10;
                } else {
                    System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");

                }
            }

        } else if (sun == 2) {
            System.out.println("동생은 8시에 일어났다. 늦잠을 잤기 때문에 아침 공부를 하지 못했다.\n 동생 스트레스+10");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b + 10, c));
            System.out.println("=====================================================");
            b = b + 10;
        } else {
            System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");
            System.out.println("아침 7시이다. 동생이 7시에 일어난다고 했던 것 같다. 깨워야할까?");

            // 키보드 문자 입력2

            System.out.println("선택지를 고르세요 ");
            System.out.println("1.깨운다");
            System.out.println("2.깨우지 않는다");

            sun = scan.nextInt();

            if (sun == 1) {
                System.out.println("동생이 일어났다. 아이고두야.\n 내스트레스+20, 동생 성취+10");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 20, b, c + 10));
                a = a + 20;
                c = c + 10;
                System.out.println("=====================================================");

                System.out.println("\n 일찍 일어났기 때문에 동생은 방에서 공부를 시작했다. 밥 먹기 전까지 하는 것 같다. 그런데..");

                int moon;

                System.out.println("내가 어떻게 해야 할까?");
                System.out.println("1.동생을 믿자. 놔둔다");
                System.out.println("2.어떤 과목을 공부하는지만 확인하고 나온다");
                System.out.println("3.옆에서 감시한다");

                moon = scan.nextInt();
                if (moon == 1) {
                    System.out.println("동생은 아주 잘 잤다. \n 동생 성취-5");
                    System.out.println("=====================현재 상태==========================");
                    System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c - 5));
                    System.out.println("=====================================================");
                    c = c - 5;

                } else if (moon == 2) {
                    System.out.println("어젯밤 다 못푼 수학 문제를 한다고 한다. \n 동생 성취 +5");
                    System.out.println("=====================현재 상태==========================");
                    System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c + 5));
                    System.out.println("=====================================================");
                    c = c + 5;
                } else if (moon == 3) {
                    System.out.println("아침부터 감시한다고 동생이 화났다. 누군 감독하는게 즐거운줄 알아? \n 내 스트레스+15 동생 스트레스+15 동생 성취+10");
                    System.out.println("=====================현재 상태==========================");
                    System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 15, b + 15, c + 10));
                    System.out.println("=====================================================");
                    a = a + 15;
                    b = b + 15;
                    c = c + 10;
                } else {
                    System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");
                    System.out.println("=====================================================");

                    System.out.println("\n 일찍 일어났기 때문에 동생은 방에서 공부를 시작했다. 밥 먹기 전까지 하는 것 같다. 그런데..");

                    System.out.println("내가 어떻게 해야 할까?");
                    System.out.println("1.동생을 믿자. 놔둔다");
                    System.out.println("2.어떤 과목을 공부하는지만 확인하고 나온다");
                    System.out.println("3.옆에서 감시한다");

                    moon = scan.nextInt();
                    if (moon == 1) {
                        System.out.println("동생은 아주 잘 잤다. \n 동생 성취-5");
                        System.out.println("=====================현재 상태==========================");
                        System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c - 5));
                        System.out.println("=====================================================");
                        c = c - 5;

                    } else if (moon == 2) {
                        System.out.println("어젯밤 다 못푼 수학 문제를 한다고 한다. \n 동생 성취 +5");
                        System.out.println("=====================현재 상태==========================");
                        System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c + 5));
                        System.out.println("=====================================================");
                        c = c + 5;
                    } else if (moon == 3) {
                        System.out.println("아침부터 감시한다고 동생이 화났다. 누군 감독하는게 즐거운줄 알아? \n 내 스트레스+15 동생 스트레스+15 동생 성취+10");
                        System.out.println("=====================현재 상태==========================");
                        System.out
                                .println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 15, b + 15, c + 10));
                        System.out.println("=====================================================");
                        a = a + 15;
                        b = b + 15;
                        c = c + 10;
                    } else {
                        System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");

                    }
                }

            } else if (sun == 2) {
                System.out.println("동생은 8시에 일어났다. 늦잠을 잤기 때문에 아침 공부를 하지 못했다.\n 동생 스트레스+10");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b + 10, c));
                System.out.println("=====================================================");
                b = b + 10;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");
            }
        }
        // 기상 끝
        // 문자 입력을 인자로 Scanner 생성

        System.out.println("아침8시다. 아침 먹을 시간이다. 내가 밥을 차려줘야 할까?");

        // 키보드 문자 입력2

        System.out.println("선택지를 고르세요 ");
        System.out.println("1.밥을 챙겨준다");
        System.out.println("2.챙겨주지 않는다");

        sun = scan.nextInt();

        if (sun == 1) {
            System.out.println("밥을 먹으며 동생이 말했다. 오늘은 언어 공부를 하기 싫은 기분이야.\n 정보를 얻었다.");
            System.out.println("\n기분이 좋아보이는데 한번 더 말을 걸어볼까?");

            // 키보드 문자 입력2

            int moon;

            System.out.println("선택지를 고르세요 ");
            System.out.println("1.말을 건다");
            System.out.println("2.걸지 않는다");

            moon = scan.nextInt();
            if (moon == 1) {
                System.out.println("동생이 짜증나 보이는 얼굴로 말했다. 나는 수학의 신이다.\n 정보를 얻었다. 동생 스트레스+10");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b + 10, c));
                System.out.println("=====================================================");
                b = b + 10;
            } else if (moon == 2) {
                System.out.println("밥을 다 먹었다.");

            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");
                System.out.println("\n기분이 좋아보이는데 한번 더 말을 걸어볼까?");

                // 키보드 문자 입력2

                System.out.println("선택지를 고르세요 ");
                System.out.println("1.말을 건다");
                System.out.println("2.걸지 않는다");

                moon = scan.nextInt();
                if (moon == 1) {
                    System.out.println("동생이 짜증나 보이는 얼굴로 말했다. 나는 수학의 신이다.\n 정보를 얻었다. 동생 스트레스+10");
                    System.out.println("=====================현재 상태==========================");
                    System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b + 10, c));
                    System.out.println("=====================================================");
                    b = b + 10;
                } else if (moon == 2) {
                    System.out.println("밥을 다 먹었다.");

                } else {
                    System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");

                }
            }
        } else if (sun == 2) {
            System.out.println("동생은 챙겨먹기 귀찮다며 공부를 시작했다. 배고파서 공부가 안될거 같은데..\n 동생 성취-5 ");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c - 5));
            System.out.println("=====================================================");
            c = c - 5;
        } else {
            System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");
            System.out.println("아침8시다. 아침 먹을 시간이다. 내가 밥을 차려줘야 할까?");

            // 키보드 문자 입력2

            System.out.println("선택지를 고르세요 ");
            System.out.println("1.밥을 챙겨준다");
            System.out.println("2.챙겨주지 않는다");

            sun = scan.nextInt();

            if (sun == 1) {
                System.out.println("밥을 먹으며 동생이 말했다. 오늘은 언어 공부를 하기 싫은 기분이야.\n 정보를 얻었다.");
                System.out.println("\n기분이 좋아보이는데 한번 더 말을 걸어볼까?");

                // 키보드 문자 입력2

                int moon;

                System.out.println("선택지를 고르세요 ");
                System.out.println("1.말을 건다");
                System.out.println("2.걸지 않는다");

                moon = scan.nextInt();
                if (moon == 1) {
                    System.out.println("동생이 짜증나 보이는 얼굴로 말했다. 나는 수학의 신이다.\n 정보를 얻었다. 동생 스트레스+10");
                    System.out.println("=====================현재 상태==========================");
                    System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b + 10, c));
                    System.out.println("=====================================================");
                    b = b + 10;
                } else if (moon == 2) {
                    System.out.println("밥을 다 먹었다.");

                } else {
                    System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");
                    System.out.println("\n기분이 좋아보이는데 한번 더 말을 걸어볼까?");

                    // 키보드 문자 입력2

                    System.out.println("선택지를 고르세요 ");
                    System.out.println("1.말을 건다");
                    System.out.println("2.걸지 않는다");

                    moon = scan.nextInt();
                    if (moon == 1) {
                        System.out.println("동생이 짜증나 보이는 얼굴로 말했다. 나는 수학의 신이다.\n 정보를 얻었다. 동생 스트레스+10");
                        System.out.println("=====================현재 상태==========================");
                        System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b + 10, c));
                        System.out.println("=====================================================");
                        b = b + 10;
                    } else if (moon == 2) {
                        System.out.println("밥을 다 먹었다.");

                    } else {
                        System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");

                    }
                }
            } else if (sun == 2) {
                System.out.println("동생은 챙겨먹기 귀찮다며 공부를 시작했다. 배고파서 공부가 안될거 같은데..\n 동생 성취-5 ");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c - 5));
                System.out.println("=====================================================");
                c = c - 5;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");
                System.out.println("=====================================================");

            }
        }
        // 타선택지완료

        System.out.println("8:40시이다. 동생은 오늘 수능 시간표 순서와 시간에 맞춰 공부를 한다고 한다. 1교시는 언어를 공부할 시간이다.");

        // 키보드 문자 입력2

        System.out.println("책상앞에 동생이 앉았다. 내가 어떻게 해야 할까?");
        System.out.println("1.동생을 믿자. 놔둔다");
        System.out.println("2.이번 시간의 목표량만 확인한다");
        System.out.println("3.옆에서 감시한다");

        sun = scan.nextInt();

        if (sun == 1) {
            System.out.println("안읽힌다고 80분 동안 4지문만 풀었댄다. 얜 대체 뭐가문제지?\n 내 스트레스+10 동생 성취+3");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 10, b, c + 3));
            System.out.println("=====================================================");
            a = a + 10;
            c = c + 3;

        } else if (sun == 2) {
            System.out.println("모의고사 한세트를 풀었다. 정답율은...글쎄다\n 동생 성취+10");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c + 10));
            System.out.println("=====================================================");
            c = c + 10;
        } else if (sun == 3) {
            System.out.println("감시해야만 공부하는 제 동생 어쩌죠? \n 내 스트레스+15 동생 스트레스+10 동생 성취+20");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 15, b + 10, c + 20));
            System.out.println("=====================================================");
            a = a + 15;
            b = b + 10;
            c = c + 20;
        } else {
            System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");
            System.out.println("8:40시이다. 동생은 오늘 수능 시간표 순서와 시간에 맞춰 공부를 한다고 한다. 1교시는 언어를 공부할 시간이다.");

            // 키보드 문자 입력2

            System.out.println("책상앞에 동생이 앉았다. 내가 어떻게 해야 할까?");
            System.out.println("1.동생을 믿자. 놔둔다");
            System.out.println("2.이번 시간의 목표량만 확인한다");
            System.out.println("3.옆에서 감시한다");

            sun = scan.nextInt();

            if (sun == 1) {
                System.out.println("안읽힌다고 80분 동안 4지문만 풀었댄다. 얜 대체 뭐가문제지?\n 내 스트레스+10 동생 성취+3");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 10, b, c + 3));
                System.out.println("=====================================================");
                a = a + 10;
                c = c + 3;

            } else if (sun == 2) {
                System.out.println("모의고사 한세트를 풀었다. 정답율은...글쎄다\n 동생 성취+10");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c + 10));
                System.out.println("=====================================================");
                c = c + 10;
            } else if (sun == 3) {
                System.out.println("감시해야만 공부하는 제 동생 어쩌죠? \n 내 스트레스+15 동생 스트레스+10 동생 성취+20");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 15, b + 10, c + 20));
                System.out.println("=====================================================");
                a = a + 15;
                b = b + 10;
                c = c + 20;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");

            }
        }
        // 선택지외처리
        // 랜덤함수
        // 랜덤함수는 선택지외 처리가 안된다ㅠㅠ
        int x = 0;

        Random random = new Random();
        x = random.nextInt(10);

        if (x == 1 || x == 2 || x == 3 || x == 6) {
            System.out.println("특별이벤트 간식 발견! \n 간식을 누가 먹어야 할까? ");

            int star;
            System.out.println("선택지를 고르세요 ");
            System.out.println("1.나");
            System.out.println("2.동생");
            System.out.println("3.다음 기회로 미룬다");

            star = scan.nextInt();
            if (star == 1) {
                System.out.println("냠냠\n 내 스트레스-20");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a - 20, b, c));
                System.out.println("=====================================================");
                a = a - 20;
            } else if (star == 2) {
                System.out.println("동생이 먹었다. \n 동생스트레스 -20");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b - 20, c));
                System.out.println("=====================================================");
                b = b - 20;
            } else if (star == 3) {
                System.out.println("나중에 먹어야지");
                System.out.println("=====================================================");
            }
        }

        // 랜덤함수2

        int m = 0;

        Random random5 = new Random();
        m = random.nextInt(10);

        if (m == 2 || m == 7 || m == 8) {
            System.out.println("특별이벤트! 날이 너무 좋아서 \n 날이 너무 좋아서 동생은 지금 공부할 기분이 아닙니다. \n 동생스트레스+10 동생 성취-15 ");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b + 10, c - 15));
            System.out.println("=====================================================");
            b = b + 10;
            c = c - 15;
        } else {
        }
        if (a > 99 || b > 99) {
            System.out.println("화가 많은 집안! 서로 못하겠다고 탈주해버렸다. \n GAME OVER");
            return;
        } else {
        }
        // 1교시 쉬는시간
        System.out.println("쉬는 시간이 되었다. 나는 어떻게 해야할까?");
        System.out.println("1.혼자 놔둔다");
        System.out.println("2.잠깐 머리를 식히면서 놀라고 아이폰을 빌려준다");
        System.out.println("3.공부에는 체력이 중요하다. 운동을 시킨다");

        sun = scan.nextInt();

        if (sun == 1) {
            System.out.println("동생의 스트레스가 감소했다 \n 동생 스트레스-10");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b - 10, c));
            System.out.println("=====================================================");
            b = b - 10;
        } else if (sun == 2) {
            System.out.println("쉬는 시간이 끝나고 보니 폰에 이상한 앱이 잔뜩 깔려있다. 우웩\n 내 스트레스+10 동생 스트레스-15");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 10, b - 15, c));
            System.out.println("=====================================================");
            a = a + 10;
            b = b - 15;
        } else if (sun == 3) {
            System.out.println("동생은 가뜩이나 힘든데 더 힘들게 한다고 화를 냈다. 하지만 몸치인 동생이 운동하는걸 구경하는 것은 재밌었다.\n 내 스트레스-15 동생 스트레스+10");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a - 15, b + 10, c));
            System.out.println("=====================================================");
            a = a - 15;
            b = b + 10;
        } else {
            System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");
            System.out.println("쉬는 시간이 되었다. 나는 어떻게 해야할까?");
            System.out.println("1.혼자 놔둔다");
            System.out.println("2.잠깐 머리를 식히면서 놀라고 아이폰을 빌려준다");
            System.out.println("3.공부에는 체력이 중요하다. 운동을 시킨다");

            sun = scan.nextInt();

            if (sun == 1) {
                System.out.println("동생의 스트레스가 감소했다 \n 동생 스트레스-10");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b - 10, c));
                System.out.println("=====================================================");
                b = b - 10;
            } else if (sun == 2) {
                System.out.println("쉬는 시간이 끝나고 보니 폰에 이상한 앱이 잔뜩 깔려있다. 우웩\n 내 스트레스+10 동생 스트레스-15");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 10, b - 15, c));
                System.out.println("=====================================================");
                a = a + 10;
                b = b - 15;
            } else if (sun == 3) {
                System.out.println(
                        "동생은 가뜩이나 힘든데 더 힘들게 한다고 화를 냈다. 하지만 몸치인 동생이 운동하는걸 구경하는 것은 재밌었다.\n 내 스트레스-15 동생 스트레스+10 동생의 성취+5");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a - 15, b + 10, c + 5));
                System.out.println("=====================================================");
                a = a - 15;
                b = b + 10;
                c = c + 5;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");

            }
        }
        // 2교시 수리
        System.out.println("10:30이다. 2교시는 수리를 공부할 시간이다.");

        // 키보드 문자 입력2

        System.out.println("내가 어떻게 해야 할까?");
        System.out.println("1.동생을 믿자. 놔둔다");
        System.out.println("2.이번 시간의 목표량만 확인한다");
        System.out.println("3.옆에서 감시한다");

        sun = scan.nextInt();

        if (sun == 1) {
            System.out.println("내 동생이 수학의 신이었다! 혼자서도 잘한다. \n 동생 성취+20");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c + 20));
            System.out.println("=====================================================");
            c = c + 20;
        } else if (sun == 2) {
            System.out.println("혼자서 잘 하는 것 같다. 참견한다고 투덜대긴 했다.\n 동생 스트레스+5 동생 성취+15");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b + 5, c + 15));
            System.out.println("=====================================================");
            b = b + 5;
            c = c + 15;
        } else if (sun == 3) {
            System.out.println("자기는 혼자서도 잘하는데 옆에서 하라고 하니까 공부하기 싫어졌다고 한다. 어쩌라는 것인지?\n 내 스트레스+20 동생 스트레스+20 동생 성취-5");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 20, b + 20, c - 5));
            System.out.println("=====================================================");
            a = a + 20;
            b = b + 20;
            c = c - 5;
        }else {
            System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");
            System.out.println("10:30이다. 2교시는 수리를 공부할 시간이다.");

            // 키보드 문자 입력2

            System.out.println("내가 어떻게 해야 할까?");
            System.out.println("1.동생을 믿자. 놔둔다");
            System.out.println("2.이번 시간의 목표량만 확인한다");
            System.out.println("3.옆에서 감시한다");

            sun = scan.nextInt();

            if (sun == 1) {
                System.out.println("내 동생이 수학의 신이었다! 혼자서도 잘한다. \n 동생 성취+20");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c + 20));
                System.out.println("=====================================================");
                c = c + 20;
            } else if (sun == 2) {
                System.out.println("혼자서 잘 하는 것 같다. 참견한다고 투덜대긴 했다.\n 동생 스트레스+5 동생 성취+15");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b + 5, c + 15));
                System.out.println("=====================================================");
                b = b + 5;
                c = c + 15;
            } else if (sun == 3) {
                System.out.println("자기는 혼자서도 잘하는데 옆에서 하라고 하니까 공부하기 싫어졌다고 한다. 어쩌라는 것인지?\n 내 스트레스+20 동생 스트레스+20 동생 성취-5");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 20, b + 20, c - 5));
                System.out.println("=====================================================");
                a = a + 20;
                b = b + 20;
                c = c - 5;
            }else {
                System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");

            }
        }


        if (a > 99 || b > 99) {
            System.out.println("화가 많은 집안! 서로 못하겠다고 탈주해버렸다. \n GAME OVER");
            return;
        }
        // 랜덤함수

        int y = 0;

        Random random1 = new Random();
        y = random1.nextInt(10);

        if (y == 1 || y == 2 || y == 5 || y == 6) {
            System.out.println("특별이벤트 간식 발견! \n 간식을 누가 먹어야 할까? ");

            int star;
            System.out.println("선택지를 고르세요 ");
            System.out.println("1.나");
            System.out.println("2.동생");
            System.out.println("3.다음 기회로 미룬다");

            star = scan.nextInt();
            if (star == 1) {
                System.out.println("냠냠\n 내 스트레스-20");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a - 20, b, c));
                System.out.println("=====================================================");
                a = a - 20;
            } else if (star == 2) {
                System.out.println("동생이 먹었다. \n 동생스트레스 -20");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b - 20, c));
                System.out.println("=====================================================");
                b = b - 20;
            } else if (star == 3) {
                System.out.println("나중에 먹어야지");
                System.out.println("=====================================================");
            }
        } else {
        }

        // 랜덤함수2

        int n = 0;

        Random random6 = new Random();
        m = random.nextInt(10);

        if (n == 2 || n == 7 || n == 8) {
            System.out.println("특별이벤트! 날이 너무 좋아서 \n 날이 너무 좋아서 동생은 지금 공부할 기분이 아닙니다. \n 동생스트레스+10 동생 성취-15 ");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b + 10, c - 15));
            System.out.println("=====================================================");
            b = b + 10;
            c = c - 15;
        } else {
        }
        if (a > 99 || b > 99) {
            System.out.println("화가 많은 집안! 서로 못하겠다고 탈주해버렸다. \n GAME OVER");
            return;
        } else {
        }

        System.out.println("12:10다. 동생에게 점심을 해주기로 정했다.무엇을 할까?");

        // 키보드 문자 입력2

        System.out.println("선택지를 고르세요 ");
        System.out.println("1.귀찮다. 맛있고 살찌는 라면");
        System.out.println("2.냉동 피자");
        System.out.println("3.튀기는데 아주 덥고 짜증나지만 동생이 좋아하는 돈까스");

        sun = scan.nextInt();

        if (sun == 1) {
            System.out.println("동생은 의외로 다이어트중이었다고한다. 근데 다 먹었다. \n 동생 스트레스+10");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b + 10, c));
            System.out.println("=====================================================");
            b = b + 10;
        } else if (sun == 2) {
            System.out.println("먹으면서 동생이 말했다. 내가 미국인이었으면 좋겠다. 맨날 피자먹을 수 있고 펴엉생 외국어 공부를 안해도 되잖아.\n 정보를 얻었다.");
        } else if (sun == 3) {
            System.out.println(
                    "기분이 좋아진 동생이 말했다. 요새 냉동돈까스가 이렇게 맛있게 나오는건 모두 화학의 발전 덕분이지! 화학은 정말 대단해! \n 글쎄. 내 생각엔 내가 맛있게 튀겨서인것 같아. \n 정보를 얻었다. 내 스트레스+10 동생 스트레스-10");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b + -0, c - 10));
            System.out.println("=====================================================");
            b = b - 10;
            c = c - 10;
        } else {
            System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");
            System.out.println("12:10다. 동생에게 점심을 해주기로 정했다.집에 있는 메뉴는 현재 세 개뿐. 무엇을 할까?");

            // 키보드 문자 입력2

            System.out.println("선택지를 고르세요 ");
            System.out.println("1.귀찮다. 맛있고 살찌는 라면");
            System.out.println("2.냉동 피자");
            System.out.println("3.튀기는데 아주 덥고 짜증나지만 동생이 좋아하는 돈까스");

            sun = scan.nextInt();

            if (sun == 1) {
                System.out.println("동생은 의외로 다이어트중이었다고한다. 근데 다 먹었다. \n 동생 스트레스+10");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b + 10, c));
                System.out.println("=====================================================");
                b = b + 10;
            } else if (sun == 2) {
                System.out.println("먹으면서 동생이 말했다. 내가 미국인이었으면 좋겠다. 맨날 피자먹을 수 있고 펴엉생 외국어 공부를 안해도 되잖아.\n 정보를 얻었다.");
            } else if (sun == 3) {
                System.out.println(
                        "기분이 좋아진 동생이 말했다. 요새 냉동돈까스가 이렇게 맛있게 나오는건 모두 화학의 발전 덕분이지! 화학은 정말 대단해! \n 글쎄. 내 생각엔 내가 맛있게 튀겨서인것 같아. \n 정보를 얻었다. 내 스트레스+10 동생 스트레스-10");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b + -0, c - 10));
                System.out.println("=====================================================");
                b = b - 10;
                c = c - 10;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");

            }
        }

        if (a > 99 || b > 99) {
            System.out.println("화가 많은 집안! 서로 못하겠다고 탈주해버렸다. \n GAME OVER");
            return;
        } else {
        }

        System.out.println("13:10이다. 3교시는 외국어를 공부할 시간이다.");

        // 키보드 문자 입력2

        System.out.println("내가 어떻게 해야 할까?");
        System.out.println("1.동생을 믿자. 놔둔다");
        System.out.println("2.이번 시간의 목표량만 확인한다");
        System.out.println("3.옆에서 감시한다");

        sun = scan.nextInt();

        if (sun == 1) {
            System.out.println("세페이지정도 풀고는 배불러서 졸았다고 한다. 뭐? \n 내 스트레스+10 동생 성취+5");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 10, b, c + 5));
            System.out.println("=====================================================");
            a = a + 10;
            c = c + 5;
        } else if (sun == 2) {
            System.out.println("모의고사 한세트를 풀었다. 정답율은...글쎄다\n 동생 성취+10");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c + 10));
            System.out.println("=====================================================");
            c = c + 10;
        } else if (sun == 3) {
            System.out.println("감시해야만 공부하는 제 동생 어쩌죠? \n 내 스트레스+15 동생 스트레스+10 동생 성취+20");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 15, b + 10, c + 20));
            System.out.println("=====================================================");
            a = a + 15;
            b = b + 10;
            c = c + 20;
        } else {
            System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");
            System.out.println("=====================================================");
            System.out.println("13:10이다. 3교시는 외국어를 공부할 시간이다.");

            // 키보드 문자 입력2

            System.out.println("내가 어떻게 해야 할까?");
            System.out.println("1.동생을 믿자. 놔둔다");
            System.out.println("2.이번 시간의 목표량만 확인한다");
            System.out.println("3.옆에서 감시한다");

            sun = scan.nextInt();

            if (sun == 1) {
                System.out.println("세페이지정도 풀고는 배불러서 졸았다고 한다. 뭐? \n 내 스트레스+10 동생 성취+5");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 10, b, c + 5));
                System.out.println("=====================================================");
                a = a + 10;
                c = c + 5;
            } else if (sun == 2) {
                System.out.println("모의고사 한세트를 풀었다. 정답율은...글쎄다\n 동생 성취+10");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c + 10));
                System.out.println("=====================================================");
                c = c + 10;
            } else if (sun == 3) {
                System.out.println("감시해야만 공부하는 제 동생 어쩌죠? \n 내 스트레스+15 동생 스트레스+10 동생 성취+20");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 15, b + 10, c + 20));
                System.out.println("=====================================================");
                a = a + 15;
                b = b + 10;
                c = c + 20;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");

            }
        }
        // 랜덤함수

        int z = 0;

        Random random2 = new Random();
        z = random1.nextInt(10);

        if (z == 1 || z == 2 || z == 8 || z == 5) {
            System.out.println("특별이벤트 간식 발견! \n 간식을 누가 먹어야 할까? ");

            int star;
            System.out.println("선택지를 고르세요 ");
            System.out.println("1.나");
            System.out.println("2.동생");
            System.out.println("3.다음 기회로 미룬다");

            star = scan.nextInt();
            if (star == 1) {
                System.out.println("냠냠\n 내 스트레스-20");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a - 20, b, c));
                System.out.println("=====================================================");
                a = a - 20;
            } else if (star == 2) {
                System.out.println("동생이 먹었다. \n 동생스트레스 -20");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b - 20, c));
                System.out.println("=====================================================");
                b = b - 20;
            } else if (star == 3) {
                System.out.println("나중에 먹어야지");
                System.out.println("=====================================================");
            }
        } else {
        }
        // 랜덤함수2

        int o = 0;

        Random random7 = new Random();
        m = random.nextInt(10);

        if (o == 2 || o == 7 || o == 8) {
            System.out.println("특별이벤트! 날이 너무 좋아서 \n 날이 너무 좋아서 동생은 지금 공부할 기분이 아닙니다. \n 동생스트레스+10 동생 성취-15 ");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b + 10, c - 15));
            System.out.println("=====================================================");
            b = b + 10;
            c = c - 15;
        } else {
        }
        if (a > 99 || b > 99) {
            System.out.println("화가 많은 집안! 서로 못하겠다고 탈주해버렸다. \n GAME OVER");
            return;
        } else {
        }

        // 3교시 쉬는시간
        System.out.println("쉬는 시간이 되었다. 나는 어떻게 해야할까?");
        System.out.println("1.혼자 놔둔다");
        System.out.println("2.잠깐 머리를 식히면서 놀라고 아이폰을 빌려준다");
        System.out.println("3.공부에는 체력이 중요하다. 운동을 시킨다");

        sun = scan.nextInt();

        if (sun == 1) {
            System.out.println("동생의 스트레스가 감소했다 \n 동생 스트레스-10");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b - 10, c));
            System.out.println("=====================================================");
            b = b - 10;
        } else if (sun == 2) {
            System.out.println("쉬는 시간이 끝나고 보니 폰에 이상한 앱이 잔뜩 깔려있다. 우웩\n 내 스트레스+10 동생 스트레스-15");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 10, b - 15, c));
            System.out.println("=====================================================");
            a = a + 10;
            b = b - 15;
        } else if (sun == 3) {
            System.out.println(
                    "동생은 가뜩이나 힘든데 더 힘들게 한다고 화를 냈다. 하지만 몸치인 동생이 운동하는걸 구경하는 것은 재밌었다.\n 내 스트레스-15 동생 스트레스+10 동생의 성취+10");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a - 15, b + 10, c + 10));
            System.out.println("=====================================================");
            a = a - 15;
            b = b + 10;
            c = c + 10;
        } else {
            System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");
            System.out.println("쉬는 시간이 되었다. 나는 어떻게 해야할까?");
            System.out.println("1.혼자 놔둔다");
            System.out.println("2.잠깐 머리를 식히면서 놀라고 아이폰을 빌려준다");
            System.out.println("3.공부에는 체력이 중요하다. 운동을 시킨다");

            sun = scan.nextInt();

            if (sun == 1) {
                System.out.println("동생의 스트레스가 감소했다 \n 동생 스트레스-10");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b - 10, c));
                System.out.println("=====================================================");
                b = b - 10;
            } else if (sun == 2) {
                System.out.println("쉬는 시간이 끝나고 보니 폰에 이상한 앱이 잔뜩 깔려있다. 우웩\n 내 스트레스+10 동생 스트레스-15");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 10, b - 15, c));
                System.out.println("=====================================================");
                a = a + 10;
                b = b - 15;
            } else if (sun == 3) {
                System.out.println(
                        "동생은 가뜩이나 힘든데 더 힘들게 한다고 화를 냈다. 하지만 몸치인 동생이 운동하는걸 구경하는 것은 재밌었다.\n 내 스트레스-15 동생 스트레스+10");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a - 15, b + 10, c));
                System.out.println("=====================================================");
                a = a - 15;
                b = b + 10;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해 주십시오");

            }
        }
        System.out.println("14:20이다. 4교시는 탐구를 공부할 시간이다.");

        // 키보드 문자 입력2

        System.out.println("내가 어떻게 해야 할까?");
        System.out.println("1.동생을 믿자. 놔둔다");
        System.out.println("2.이번 시간의 목표량만 확인한다");
        System.out.println("3.옆에서 감시한다");

        sun = scan.nextInt();

        if (sun == 1) {
            System.out.println("화학을 좋아하더니 혼자서도 잘했다.\n 동생 성취+20");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b, c + 20));
            System.out.println("=====================================================");
            c = c + 20;

        } else if (sun == 2) {
            System.out.println("혼자서 잘 하는 것 같다. 참견한다고 투덜대긴 했다.\n 동생 스트레스+5 동생 성취+15");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b + 5, c + 15));
            System.out.println("=====================================================");
            b = b + 5;
            c = c + 15;
        } else if (sun == 3) {
            System.out.println("자기는 혼자서도 잘하는데 옆에서 하라고 하니까 공부하기 싫어졌다고 한다. 어쩌라는 것인지?\n 내 스트레스+20 동생 스트레스+20 동생 성취-5");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a + 20, b + 20, c - 5));
            System.out.println("=====================================================");
            a = a + 20;
            b = b + 20;
            c = c - 5;
        }
        if (a > 99 || b > 99) {
            System.out.println("화가 많은 집안! 서로 못하겠다고 탈주해버렸다. \n GAME OVER");
            return;
        }
        // 랜덤함수

        int w = 0;

        Random random3 = new Random();
        y = random1.nextInt(10);

        if (w == 1 || w == 2 || w == 5 || w == 8) {
            System.out.println("특별이벤트 간식 발견! \n 간식을 누가 먹어야 할까? ");

            int star;
            System.out.println("선택지를 고르세요 ");
            System.out.println("1.나");
            System.out.println("2.동생");
            System.out.println("3.다음 기회로 미룬다");

            star = scan.nextInt();
            if (star == 1) {
                System.out.println("냠냠\n 내 스트레스-20");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a - 20, b, c));
                System.out.println("=====================================================");
                a = a - 20;
            } else if (star == 2) {
                System.out.println("동생이 먹었다. \n 동생스트레스 -20");
                System.out.println("=====================현재 상태==========================");
                System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b - 20, c));
                System.out.println("=====================================================");
                b = b - 20;
            } else if (star == 3) {
                System.out.println("나중에 먹어야지");
                System.out.println("=====================================================");
            }
        } else {
        }

        // 랜덤함수2

        int p = 0;

        Random random8 = new Random();
        m = random.nextInt(10);

        if (p == 7 || p == 9 || p == 2 || p == 4) {
            System.out.println("특별이벤트! 날이 너무 좋아서 \n 날이 너무 좋아서 동생은 지금 공부할 기분이 아닙니다. \n 동생스트레스+10 동생 성취-15 ");
            System.out.println("=====================현재 상태==========================");
            System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b + 10, c - 15));
            b = b + 10;
            c = c - 15;
        } else {
        }
        if (a > 99 || b > 99) {
            System.out.println("화가 많은 집안! 서로 못하겠다고 탈주해버렸다. \n GAME OVER");
            return;
        } else {
        }

        System.out.println("=====================================================");

        System.out.println("\n오늘의 돌보기가 끝났다! 과연 나의 성과는?");
        System.out.println(String.format("나의 스트레스, 동생의스트레스, 동생의성취(%d, %d, %d)", a, b - 20, c));
        if (c >= 90) {
            System.out.println("오늘의 마스터! \n 놀라운 성과로 부모님의 인정을 받았다. 보상으로 용돈 10만원이 생겼다.");
        } else if (c >= 70) {
            System.out.println("집안의 조련사 \n 이정도면 나도 동생 조련사! 부모님이 기꺼이 보상인 용돈6만원을 주셨다.");
        } else if (c >= 50) {
            System.out.println("성실한 손윗사람\n 책임감 있게 동생을 돌본 것을 인정받았다. 부모님이 보상으로 4만원을 주셨다. ");
        } else if (c >= 20) {
            if (b > 80) {
                System.out.println("집안의 폭군\n 동생의 스트레스에 비해 성취의 상태가..? 부모님이 나의 인성을 의심하고 계신다.");
            } else {
                System.out.println("지옥의 가장 뜨거운 자리는 날로 먹으려는 사람에게 준비되어 있다.\n 부모님은 긴 설교 끝에 용돈 2만원을 주셨다.");
            }
        } else {
            System.out.println("나는 노예가 되지 않는다. 세상의 주인이 될것이다!\n 아무도 나에게 명령할 수 없고, 나도 다 큰 성인을 돌볼 필요는 없다하하");
        }

    }
}