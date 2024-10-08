package X;

import java.io.File;
import java.io.IOException;
import java.util.List;

public final class L6K {
    public final String A00;
    public final String A01;
    public final List A02 = AnonymousClass7TE.A1C();

    public L6K(C63743L5b l5b) {
        String str;
        String str2;
        2Nn r7 = l5b.A00;
        String str3 = l5b.A01;
        if (str3 != null) {
            try {
                File A0s = JTO.A0s(r7.A01(), str3);
                A0s.mkdirs();
                str = JTO.A0s(A0s, 002.A0r("audio_", "_voice_message", ".pcm", System.currentTimeMillis())).getAbsolutePath();
            } catch (IOException unused) {
                str = AnonymousClass457.A0D("_voice_message", ".pcm");
            }
        } else {
            str = AnonymousClass457.A0D("_voice_message", ".pcm");
        }
        0qQ.A07(str);
        this.A00 = str;
        if (str3 != null) {
            try {
                File A0s2 = JTO.A0s(r7.A01(), str3);
                A0s2.mkdirs();
                File A0s3 = JTO.A0s(A0s2, "voiceover");
                A0s3.mkdirs();
                str2 = JTO.A0s(A0s3, 002.A0r("audio_", "_voice_message", ".wav", System.currentTimeMillis())).getAbsolutePath();
            } catch (IOException unused2) {
                str2 = AnonymousClass457.A0D("_voice_message", ".wav");
            }
        } else {
            str2 = AnonymousClass457.A0D("_voice_message", ".wav");
        }
        0qQ.A07(str2);
        this.A01 = str2;
    }
}
