package X;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class OTA {
    public File A00;
    public final AtomicBoolean A01 = JTQ.A0k();

    public OTA(File file) {
        this.A00 = file;
    }

    public static final Object A00(String str, C62320sa r2) {
        try {
            return r2.invoke();
        } catch (IOException e) {
            0KC.A0F("IgMsysLogcatDumper", 002.A0R("Failed to ", str), e);
            return null;
        }
    }
}
