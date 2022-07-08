package com.ll;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public void run() throws IOException {
        System.out.println("== 명언 SSG ==");

        Scanner sc = new Scanner(System.in);


        List<WiseSaying> wiseSayings = new ArrayList<>();
        int wiseSayingLastId = 0;

        outer:
        while (true) {
            System.out.print("명령) ");
            String cmd = sc.nextLine().trim();

            switch (cmd) {
                case "종료":
                    break outer;

                case "등록":
                    System.out.print("명언) ");
                    String maxim = sc.nextLine();
                    System.out.print("작가 ) ");
                    String author = sc.nextLine();

                    int id = ++wiseSayingLastId;
                    WiseSaying wiseSay = new WiseSaying(id, maxim, author);
                    wiseSayings.add(wiseSay);

                    System.out.printf("%d번 명언이 등록되었습니다\n", id);
                    break;

                case "목록":
                    System.out.println("번호 / 작가 / 명언");
                    System.out.println("-------------------");
                    for (int i = wiseSayings.size() - 1; i >= 0; i--) {
                        WiseSaying wiseSaying_ = wiseSayings.get(i);
                        System.out.printf("%d / %s / %s\n", wiseSaying_.id, wiseSaying_.maxim, wiseSaying_.author);
                    }
                    break;

                case "삭제":


                case "수정":




            }


        }

        sc.close();
    }
}
