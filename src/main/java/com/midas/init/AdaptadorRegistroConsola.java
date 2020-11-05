package com.midas.init;

import java.util.logging.FileHandler;

public class AdaptadorRegistroConsola {

    FileHandler fh = new FileHandler(dbParams.get("logFileFolder") + "/logFile.txt");
    ConsoleHandler ch = new ConsoleHandler();

    logger.addHandler (ch);

    logger.log (Level.INFO, messageText);

}
