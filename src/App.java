import classes.PingPong;
import classes.TiroAoAlvoOnline;
import classes.Videogame;
import classes.Xadrez;

public class App {
    public static void main(String[] args) throws Exception {
        Videogame xDevOne = new Videogame();
        xDevOne.ligar();
        xDevOne.jogar(new TiroAoAlvoOnline());
        xDevOne.fechar();
    }
}
