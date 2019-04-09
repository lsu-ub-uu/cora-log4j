module se.uu.ub.cora.log4j {
	requires se.uu.ub.cora.logger;
	requires org.apache.logging.log4j;

	provides se.uu.ub.cora.logger.LoggerFactory with se.uu.ub.cora.log4j.Log4jLoggerFactory;
}