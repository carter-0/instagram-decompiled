package X;

import java.io.File;
import java.util.HashMap;

/* renamed from: X.LEm  reason: case insensitive filesystem */
public final class C63946LEm {
    public final AnonymousClass2Np A00;
    public final HashMap A01 = AnonymousClass7TE.A1E();

    public final File A00(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass2Np r4 = this.A00;
        File A0s = JTO.A0s(r4.C4W(), 002.A0g("sfx_audio_", str, ".mp3"));
        if (JTP.A0u(A0s).startsWith(JTP.A0u(r4.C4W()))) {
            if (!A0s.exists()) {
                A0s.createNewFile();
            }
            return A0s;
        }
        0wb.A01(0kg.A0B, "SFXAudioCache:getSfxFile", "illegal directory path provided while creating file");
        throw AnonymousClass7TF.A0W("illegal directory path provided while creating file - ", A0s.getCanonicalPath());
    }

    public final boolean A01(String str) {
        C381809cM r0;
        String str2;
        0qQ.A0B(str, 0);
        HashMap hashMap = this.A01;
        if (!hashMap.containsKey(str) || (r0 = (C381809cM) hashMap.get(str)) == null || (str2 = r0.A04) == null || !JTQ.A1Z(str2)) {
            return false;
        }
        return true;
    }

    public C63946LEm(AnonymousClass2Np r2) {
        this.A00 = r2;
    }
}
