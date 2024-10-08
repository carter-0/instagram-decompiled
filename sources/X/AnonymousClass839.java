package X;

import java.io.File;

/* renamed from: X.839  reason: invalid class name */
public final class AnonymousClass839 {
    public String A00;
    public final 1QU A01;
    public final 2Nn A02;

    public final File A00(String str) {
        File C4W;
        0qQ.A0B(str, 0);
        if (this.A00 != null) {
            C4W = new File(this.A02.A01(), this.A00);
        } else {
            C4W = this.A02.C4W();
        }
        C357818Zu.A00(C4W);
        return new File(C4W, 002.A0g("tts_audio_", str, ".mp3"));
    }

    public AnonymousClass839(2Nn r3) {
        this.A02 = r3;
        AnonymousClass1QT r1 = new AnonymousClass1QT();
        r1.A04 = 1CE.A02;
        r1.A03 = 1Fe.A03;
        this.A01 = r1.A00();
    }
}
