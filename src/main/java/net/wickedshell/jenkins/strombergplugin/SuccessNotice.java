package net.wickedshell.jenkins.strombergplugin;

/**
 * Created by stefan on 08/08/16.
 */
public enum SuccessNotice {

    EICHHOERNCHEN("Als Chef musst du gegen Überraschungen imprägniert sein, denn der Teufel ist ein Eichhörnchen! Ne und und und und als Chef musst DU das Eichhörnchen sein, das immer noch ein Paar Nüsse extra versteckt hat, dass die anderen Eichhörnchen die nicht finden damit die Ei äh.. verstehen sie?"),
    KARRIERELEITER("Das ist die erste Sprosse auf der Karriereleiter Ulf. Das ist pure Verantwortung und das ganze und wenn du das hinkriegst äh das ist äh sky das ist Limit sag ich mal!"),
    EINPACKEN("Ja also wer heutzutage was gegen Karriere fixierte Frauen hat, der kann im Management einpacken"),
    ERFAHRUNG("Ich bin ja quasi die perfekte Mischung aus jung, aber sehr erfahren. Gibt’s in der Form ja sonst nur auf dem Straßenstrich."),
    JESUS("Ich fühle mich wie Jesus am Ostersonntag. Den hatten auch schon alle abgeschrieben und dann nach drei Tagen, so’n richtiges Comeback, mit dem keiner gerechnet hatte."),
    BUSINESS("Business hab ich im Blut. Sowas kannste auch nicht lernen. Business ist ein Talent, wie Geigespielen – oder Brustgröße bei Frauen."),
    FRAUEN("Ich sag mal so: Frauen sind wie Zahnbürsten – nützlich, wichtig und so weiter. Aber man sollte ein und dieselbe nicht allzu lange ben… äh, haben."),
    FURZ("Wenn du hier als Chef ’nen Furz läßt, dann fordert der Betriebsrat gleich ne Lärmschutzwand!"),
    HIERARCHIE("Ich bin für klare Hierarchien. Gott hat ja auch nicht zu Moses gesagt: ‚Hier Moses, ich hab da mal was aufgeschrieben, was mir nicht so gut gefällt. Falls du Lust hast, schau doch da mal drüber.‘ Nein, da hieß es: Zack, 10 Gebote! Und wer nicht pariert kommt in die Hölle. Bums, aus, Nikolaus."),
    CHEF("Als Chef ist Sensibilität sehr wichtig. Gerade mit anders geschlechtlichen Mitarbeitern. Zum Beispiel Frauen."),
    BERNHARDINER("Ja aber so bin ich, Kreuzung aus Brad Pitt und St. Martin … wie so ein Büro-Bernhardiner..so knudlig, aber immer da, wenn Not am Mann ist..oder an der Frau… Kennen Sie diese Hunde? Die kommen dann so an, nur nicht mim Fässchen um Hals, sondern eben mit ner Akte."),
    KLETTE("Die Männer, die stammen vielleicht vom Affen ab, aber die Weiber mit Sicherheit von ner Klette."),
    STATIK("(Zu Erika) Ganz schön kleine Flügel für so n rießen Engel… Da würd ich die Wolke aber von der Statik her noch mal durchrechnen."),
    SCHNEEBALL("Als Chef bist du eigentlich ’ne Art Büro-Animateur. Ein Entertainer mit Schreibtisch. Ein Mitarbeiter oder eine Mitarbeiterin mit schlechter Laune ist wie ne Schneeflocke. Einer allein ist harmlos, n paar Dutzend sind schon n Schneeball. Wenn du dann nicht aufpasst, dann hast du ratzfatz ’ne Lawine in der Hütte"),
    GOTT("Ich mach’s wie der liebe Gott. Der lässt sich… der lässt sich auch nicht so oft blicken, hat aber trotzdem ein gutes Image.");

    private final String message;

    SuccessNotice(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
