package com.facebook.ffmpeg;

public class FFMpegBadDataException extends Exception {
    public FFMpegBadDataException(String str, Throwable th) {
        super(str, th);
    }

    public FFMpegBadDataException(String str) {
        super(str);
    }

    public FFMpegBadDataException(Throwable th) {
        super(th);
    }

    public FFMpegBadDataException() {
    }
}
