package me.rerere.litesql.utils;

import me.rerere.litesql.LiteSQL;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

public class LogUtil {
    public static void info(LiteSQL liteSQL,String message){
        Logger logger = liteSQL.getLogger();
        logger.log(Level.INFO,String.format("(%s) %s",liteSQL.getName(),message));
    }
}
