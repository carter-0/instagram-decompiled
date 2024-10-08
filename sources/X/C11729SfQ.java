package X;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.SfQ  reason: case insensitive filesystem */
public final class C11729SfQ implements C13684Tf1 {
    public final C11389SRd A00 = new C11389SRd();

    public final /* synthetic */ void reset() {
    }

    public final void E1l(C13507TbY tbY, C11115SAs sAs, byte[] bArr, int i, int i2) {
        C11270SIh A002;
        C11389SRd sRd = this.A00;
        sRd.A0Q(bArr, i2 + i);
        sRd.A0O(i);
        ArrayList A1C = AnonymousClass7TE.A1C();
        while (true) {
            int A06 = Pxe.A06(sRd);
            if (A06 > 0) {
                C11366SPh.A03(JTQ.A1P(A06, 8), "Incomplete Mp4Webvtt Top Level box header found.");
                int A01 = sRd.A01() - 8;
                if (sRd.A01() == 1987343459) {
                    CharSequence charSequence = null;
                    S3W s3w = null;
                    while (A01 > 0) {
                        C11366SPh.A03(JTQ.A1P(A01, 8), "Incomplete vtt cue box header found.");
                        int A012 = sRd.A01();
                        int A013 = sRd.A01();
                        int i3 = A012 - 8;
                        String A11 = Pxe.A11(AnonymousClass2RN.A05, sRd.A02, sRd.A01, i3);
                        sRd.A0P(i3);
                        A01 = (A01 - 8) - i3;
                        if (A013 == 1937011815) {
                            S3R s3r = new S3R();
                            C11415SSn.A04(s3r, A11);
                            s3w = s3r.A00();
                        } else if (A013 == 1885436268) {
                            charSequence = C11415SSn.A00((String) null, A11.trim(), Collections.emptyList());
                        }
                    }
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    if (s3w != null) {
                        s3w.A0E = charSequence;
                        A002 = s3w.A00();
                    } else {
                        S3R s3r2 = new S3R();
                        s3r2.A0A = charSequence;
                        A002 = s3r2.A00().A00();
                    }
                    A1C.add(A002);
                } else {
                    sRd.A0P(A01);
                }
            } else {
                tbY.accept(new C10513RtS(A1C, -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }
}
