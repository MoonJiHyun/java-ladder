package nextstep.ladder;

import nextstep.ladder.model.Ladder;
import nextstep.ladder.model.Person;
import nextstep.ladder.view.LadderGameDrawer;

import java.util.List;
import java.util.Scanner;

public class LadderController {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        LadderGameDrawer.drawPeopleInputText();
        List<Person> people = LadderGame.makePeople(scanner.nextLine());

        LadderGameDrawer.drawHeightInputText();
        int height = Integer.valueOf(scanner.nextLine());

        Ladder ladder = LadderGame.makeLadder(people.size(), height);

        LadderGameDrawer.drawResult(people, ladder);
    }
}
