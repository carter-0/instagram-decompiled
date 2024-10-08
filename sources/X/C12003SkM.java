package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.SkM  reason: case insensitive filesystem */
public final class C12003SkM implements C13542TcE {
    public final int A00;
    public final Object A01;

    public C12003SkM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object ALD() {
        switch (this.A00) {
            case 0:
                C10526Rtf rtf = (C10526Rtf) this.A01;
                return new TLE(rtf.A01, rtf.A02);
            case 1:
                C10789RyB ryB = (C10789RyB) this.A01;
                TO7 to7 = ryB.A04;
                TO7 to72 = ryB.A05;
                TO7 to73 = ryB.A06;
                TO7 to74 = ryB.A03;
                return new C12005SkO(ryB.A00, ryB.A01, ryB.A02, to7, to72, to73, to74);
            default:
                try {
                    return new C12004SkN(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e) {
                    throw C41845B3m.A0j(e);
                }
        }
    }
}
