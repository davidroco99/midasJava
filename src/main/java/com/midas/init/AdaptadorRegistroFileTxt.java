package com.midas.init;

import java.io.File;

public class AdaptadorRegistroFileTxt {

    File logFile = new File(dbParams.get("logFileFolder") + "/logFile.txt");

    if (!logFile.exists () 
        ) {
        logFile.createNewFile();
        logger.addHandler(fh);
        logger.log(Level.INFO, messageText);

    }

}
