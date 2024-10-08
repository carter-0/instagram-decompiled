package com.instagram.debug.devoptions.section.mcf;

public final class MediaCreationDebugException extends RuntimeException {
    public MediaCreationDebugException(String str, Throwable th) {
        super(str, th);
    }

    public MediaCreationDebugException(Throwable th) {
        super(th);
    }

    public MediaCreationDebugException(String str) {
        super(str);
    }

    public MediaCreationDebugException() {
    }
}
