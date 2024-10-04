package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Exception;




    public class ResourceNotFoundException extends RuntimeException {
        public ResourceNotFoundException() {
            super();
        }

        public ResourceNotFoundException(String message) {
            super(message);
        }

        public ResourceNotFoundException(String message, Throwable cause) {
            super(message, cause);
        }

        public ResourceNotFoundException(Throwable cause) {
            super(cause);
        }
    }

