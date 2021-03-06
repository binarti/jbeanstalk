package br.com.binarti.jbeanstalkc.protocol;

public enum BeanstalkCommandReason {

	OUT_OF_MEMORY, INTERNAL_ERROR, BAD_FORMAT, UNKNOWN_COMMAND, 
	NOT_FOUND, OK, USING, INSERTED, RESERVED, DEADLINE_SOON, TIMED_OUT,
	WATCHING, FOUND, DELETED, RELEASED, BURIED, TOUCHED, NOT_IGNORED;

}
