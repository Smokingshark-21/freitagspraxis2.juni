fun main() {

    // Eine Liste mit Karten
    var kartenDeck: List<String> = listOf(
            "Herz Ass",
            "Herz König",
            "Herz Dame",
            "Herz Bube",
            "Karo Ass",
            "Karo König",
            "Karo Dame",
            "Karo Bube",
            "Pik Ass",
            "Pik König",
            "Pik Dame",
            "Pik Bube",
            "Kreuz Ass",
            "Kreuz König",
            "Kreuz Dame",
            "Kreuz Bube"
    )

    // Eine Map die jeder Karte einen Wert zuordnet
    var karteZuWert: Map<String, Int> = mapOf(
            "Herz Ass" to 1,
            "Herz König" to 5,
            "Herz Dame" to 4,
            "Herz Bube" to 3,
            "Karo Ass" to 1,
            "Karo König" to 5,
            "Karo Dame" to 4,
            "Karo Bube" to 3,
            "Pik Ass" to 1,
            "Pik König" to 5,
            "Pik Dame" to 4,
            "Pik Bube" to 3,
            "Kreuz Ass" to 1,
            "Kreuz König" to 5,
            "Kreuz Dame" to 4,
            "Kreuz Bube" to 3
    )

    // TODO: Aufgabe 1 - Kartenstapel mischen!

    var Kartenstapel: MutableList<String> = kartenDeck.toMutableList()

    Kartenstapel.shuffle()

    println(Kartenstapel)

    // TODO: Aufgabe 2 - Eine Karte ziehen!

    println(Kartenstapel.first())

    Kartenstapel.removeFirst()

    // TODO: Aufgabe 3 - Wert einer Karte ermitteln!

    val fKarte: String = Kartenstapel.first()

    println(karteZuWert[fKarte])

    // TODO: Aufgabe 4 - Karten für die Spieler ziehen!

    var spielerA: MutableList<String?> = mutableListOf()

    var spielerB: MutableList<String?> = mutableListOf()


    println("Spieler A zieht karte ${Kartenstapel.first()} und fügt sie seiner Hand hinzu")

    spielerA.add(Kartenstapel.first())

    Kartenstapel.removeFirst()

    println("Spieler A zieht karte ${Kartenstapel.first()} und fügt sie seiner Hand hinzu")

    spielerA.add(Kartenstapel.first())

    Kartenstapel.removeFirst()

    println("Spieler A zieht karte ${Kartenstapel.first()} und fügt sie seiner Hand hinzu")

    spielerA.add(Kartenstapel.first())

    Kartenstapel.removeFirst()


    println("Spieler B zieht karte ${Kartenstapel.first()} und fügt sie seiner Hand hinzu")

    spielerB.add(Kartenstapel.first())

    Kartenstapel.removeFirst()

    println("Spieler B zieht karte ${Kartenstapel.first()} und fügt sie seiner Hand hinzu")

    spielerB.add(Kartenstapel.first())

    Kartenstapel.removeFirst()

    println("Spieler B zieht karte ${Kartenstapel.first()} und fügt sie seiner Hand hinzu")

    spielerB.add(Kartenstapel.first())

    Kartenstapel.removeFirst()

    // TODO: Aufgabe 5 - Den Wert der Hände herausfinden!

    val a: String = spielerA[0]!!
    val b: String = spielerA[1]!!
    var c: String = spielerA[2]!!
    var summA: Int = karteZuWert[a]!! + karteZuWert[b]!! + karteZuWert[c]!!

    println("Spieler A Hat mit den Karten $spielerA so viele Punkte: ${summA} auf der Hand. ")
//--------------------------------------------------------------------------------------------------------------
//    spielerB

    val d: String = spielerB[0]!!
    val e: String = spielerB[1]!!
    var f: String = spielerB[2]!!
    var summB: Int = karteZuWert[d]!! + karteZuWert[e]!! + karteZuWert[f]!!

    println("Spieler B Hat mit den Karten $spielerB so viele Punkte: ${summB} auf der Hand. ")

    // TODO: Aufgabe 6 - Die Karte mit dem niedrigsten Wert abwerfen!


    var datenA: MutableMap<String, Int> = mutableMapOf(
            a to karteZuWert[a]!!,
            b to karteZuWert[b]!!,
            c to karteZuWert[c]!!

    )
    var datenB: MutableMap<String, Int> = mutableMapOf(
            d to karteZuWert[d]!!,
            e to karteZuWert[e]!!,
            f to karteZuWert[f]!!

    )

    var Alist: List<Int> = datenA.values.toList()
    var alist: List<String> = datenA.keys.toList()

    var min: Int = Alist.indexOf(Alist.min())
    var IK = alist[min]

    spielerA.remove(IK)

    spielerA.add(Kartenstapel.first())

    Kartenstapel.removeFirst()

    c = spielerA[2]!!
    summA = karteZuWert[a]!! + karteZuWert[b]!! + karteZuWert[c]!!

    println("Spieler A wirft die Nidrigste karte  weg und zieht einene neu karte jetzt beträgt das deck den wert: $summA")

//    Spieler B

    var Blist: List<Int> = datenA.values.toList()
    var blist: List<String> = datenA.keys.toList()

    var minb: Int = Blist.indexOf(Blist.min())
    var IKb = alist[min]

    spielerB.remove(IK)

    spielerB.add(Kartenstapel.first())

    Kartenstapel.removeFirst()

    f = spielerA[2]!!
    summB = karteZuWert[d]!! + karteZuWert[e]!! + karteZuWert[f]!!

    println("Spieler B wirft die Nidrigste karte  weg und zieht einene neu karte jetzt beträgt das deck den wert: $summB")


    // TODO: Aufgabe 7 - Fertiges Spiel implementieren!

    println("----------------------------------------")

    println("Geben sie den Namen von spieler 1 ein")

    var spieler1: String = readln()

    println("Geben sie den Namen von spieler 2 ein")

    var spieler2: String = readln()

//    New Kartenstapel gen

    var Kartenstapeln: MutableList<String> = kartenDeck.toMutableList()

    Kartenstapel.shuffle()

//    Oberste karte mit wert

    val Fkarte: String = Kartenstapeln.first()

    println(karteZuWert[Fkarte])

//    spieler1 und spieler2 ziehen 3 karten

    var spielerA1: MutableList<String?> = mutableListOf()

    var spielerB2: MutableList<String?> = mutableListOf()


    println("$spieler1 zieht karte ${Kartenstapeln.first()} und fügt sie seiner Hand hinzu")

    spielerA1.add(Kartenstapeln.first())

    Kartenstapeln.removeFirst()

    println("$spieler1 zieht karte ${Kartenstapeln.first()} und fügt sie seiner Hand hinzu")

    spielerA1.add(Kartenstapeln.first())

    Kartenstapeln.removeFirst()

    println("$spieler1 zieht karte ${Kartenstapeln.first()} und fügt sie seiner Hand hinzu")

    spielerA1.add(Kartenstapeln.first())

    Kartenstapeln.removeFirst()


    println("$spieler2 zieht karte ${Kartenstapeln.first()} und fügt sie seiner Hand hinzu")

    spielerB2.add(Kartenstapeln.first())

    Kartenstapeln.removeFirst()

    println("$spieler2 zieht karte ${Kartenstapeln.first()} und fügt sie seiner Hand hinzu")

    spielerB2.add(Kartenstapeln.first())

    Kartenstapeln.removeFirst()

    println("$spieler2 zieht karte ${Kartenstapeln.first()} und fügt sie seiner Hand hinzu")

    spielerB2.add(Kartenstapeln.first())

    Kartenstapeln.removeFirst()

//    Jede/r Spieler/in wirft nun die Karte mit dem niedrigsten Wert ab und zieht eine neue
    val a1: String = spielerA1[0]!!
    val b1: String = spielerA1[1]!!
    var c1: String = spielerA1[2]!!
    var summA1: Int = karteZuWert[a]!! + karteZuWert[b]!! + karteZuWert[c]!!

    val d1: String = spielerB2[0]!!
    val e1: String = spielerB2[1]!!
    var f1: String = spielerB2[2]!!
    var summB1: Int = karteZuWert[d]!! + karteZuWert[e]!! + karteZuWert[f]!!

    var datenA1: MutableMap<String, Int> = mutableMapOf(
            a1 to karteZuWert[a1]!!,
            b1 to karteZuWert[b1]!!,
            c1 to karteZuWert[c1]!!

    )
    var datenB1: MutableMap<String, Int> = mutableMapOf(
            d1 to karteZuWert[d1]!!,
            e1 to karteZuWert[e1]!!,
            f1 to karteZuWert[f1]!!

    )

    var Alist1: List<Int> = datenA1.values.toList()
    var alist1: List<String> = datenA1.keys.toList()

    var min1: Int = Alist1.indexOf(Alist1.min())
    var IK1 = alist1[min1]

    spielerA1.remove(IK1)

    spielerA1.add(Kartenstapeln.first())

    Kartenstapeln.removeFirst()

    c1 = spielerA1[2]!!
    summA1 = karteZuWert[a1]!! + karteZuWert[b1]!! + karteZuWert[c1]!!

    println("$spieler1 wirft die Nidrigste karte weg und zieht eine neu karte jetzt beträgt die Hand den wert: $summA1")

//    Spieler 2

    var Alist2: List<Int> = datenB1.values.toList()
    var alist2: List<String> = datenB1.keys.toList()

    var min2: Int = Alist2.indexOf(Alist2.min())
    var IK2 = alist2[min2]

    spielerB2.remove(IK2)

    spielerB2.add(Kartenstapeln.first())
    Kartenstapeln.removeFirst()
    f1 = spielerB2[2]!!
    summB1 = karteZuWert[d1]!! + karteZuWert[e1]!! + karteZuWert[f1]!!

    println("$spieler2 wirft die Nidrigste karte weg und zieht eine neu karte jetzt beträgt die Hand den wert: $summB1")

}
