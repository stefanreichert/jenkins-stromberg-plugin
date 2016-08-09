package net.wickedshell.jenkins.strombergplugin;

/**
 * Created by stefan on 08/08/16.
 */
public enum FailNotice {

    TOLLERANZ("Das Leben ist kein Ponnyhof, auch nicht bei ner Versicherung. Ich bin bestimmt toleranter, als die meisten hier in Führungsposition. Aber auch mein Fass hat Grenzen. Ja, wenn’s da stetig reintropft, dann is irgendwann der Boden raus, ist doch klar!"),
    SCHEISSE("Ich sag ja immer: die Scheiße ändert sich, aber die Fliegen bleiben gleich."),
    ACHTERBAHN("Büro ist wie Achterbahn fahren, ein ständiges Auf und Ab. Wenn man das 8 Stunden machen muß, TÄGLICH, dann kotzt man irgendwann."),
    PAPST("Ja, erst hat er rumgezickt wie der Papst im Puff, aber letztlich hat er doch noch zugesagt."),
    BLUMENTOPF("Ärger ist wie ein Blumentopf. Von je höher er kommt, desto eher tut er dem weh, der ihn auf dem Kopf kriegt."),
    TANGO("Meinem Vater ist ja auch das ein oder andere mal die Hand ausgerutscht. Also ein falsches Wort, da tanzte der Pantoffel aber Tango auf dem Hintern!"),
    KALKULATION("Das ist von unserer Seite so minimal kalkuliert, da würde selbst der geizigste Schotte feucht werden unterm Rock."),
    ARSCH("Man soll den Arsch nicht höher hängen als man scheißen kann."),
    KATZE("Wie so’ne Katze, wenn man denkt da ist Feierabend, dann hab ich immer noch so 5, 6 Leben in der Hinterhand"),
    LEBEN("Das Leben ist wie eine Taxifahrt, auch wenn man rumsitzt und wartet, tickt ja das Taxameter und…..DER Taxameter…weiß ich nich…und rumgesessen haben Sie ja viel in 40 Jahren Capitol"),
    HASE("Hätte hätte hätte….hätte der Hund nicht geschissen, hätte er den Hasen gekriegt."),
    PARKPLATZ("Das Leben ist wie unsere Parkplätze bei der Capitol: sehr kurz, sehr schmutzig, aber wenigstens umsonst"),
    SKLAVEN("Deshalb ist das Wichtigste, was du als Chef machen musst: Gute Laune… Machst du gute Laune, machen die Leute dir die Arbeit, so einfach ist das. Auf den Baumwollfeldern damals bei den Sklaven wurde ja auch immer gesungen."),
    SENSE("Oft ist ja viel früher Feierabend als man denkt… also jetzt nicht im Büo, sondern im Leben…daran denkt man ja oft gar nicht bei dem ganzen Alltags…äh scheiß..Auf einmal steht er vor einem, unser aller Vorgesetzter mit der großen Sense.");


    private final String message;

    FailNotice(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
