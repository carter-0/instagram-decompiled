package X;

import com.instagram.common.typedurl.ImageUrl;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.OsL  reason: case insensitive filesystem */
public final class C71877OsL implements C74383Pty {
    public final int A00;
    public final Object A01;

    public C71877OsL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DCq(String str, int i, String str2) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(str, 0);
                OVR.A00((OVR) this.A01, str, str2, i);
                return;
            case 1:
                0qQ.A0B(str, 1);
                0KC.A0C("Failed to load voice message from Armadillo Express store", str);
                ((AnonymousClass67Z) this.A01).A00();
                return;
            default:
                0qQ.A0B(str, 1);
                ((AnonymousClass4D7) this.A01).resumeWith((Object) null);
                return;
        }
    }

    public final void Dog(String str, boolean z) {
        0jG r2;
        switch (this.A00) {
            case 0:
                0qQ.A0B(str, 0);
                OVR ovr = (OVR) this.A01;
                boolean z2 = z;
                if (z && (r2 = ovr.A02) != null) {
                    r2.Cid(ovr.A07);
                }
                C227052iZ r4 = ovr.A00;
                if (r4 == null) {
                    r4 = ovr.A03.A03.A00();
                    ovr.A00 = r4;
                }
                try {
                    1zH r3 = ovr.A05;
                    0fA r22 = ovr.A01;
                    try {
                        String path = 0cp.A03(str).getPath();
                        if (path != null) {
                            File A0t = AnonymousClass7TE.A0t(path);
                            FileInputStream fileInputStream = new FileInputStream(A0t);
                            try {
                                C66950Mfj.A00(r22, r3, r4, fileInputStream, path, A0t.length());
                                fileInputStream.close();
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream.close();
                                throw th;
                            }
                        }
                        AnonymousClass2iL r42 = ovr.A04;
                        C227052iZ r5 = ovr.A00;
                        ImageUrl imageUrl = ovr.A07;
                        r42.A0D(r5, imageUrl.Aqe(), (String) null, -1, 0, true, z2);
                        0jG r1 = ovr.A02;
                        if (r1 != null) {
                            r1.Cij(imageUrl);
                        }
                        AnonymousClass0eM r12 = C71105Ocj.A05;
                        C71105Ocj.A02(C69851NtF.A00(ovr.A06), JTP.A0o(imageUrl), false);
                        ovr.A00 = null;
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (IOException | IllegalArgumentException | OutOfMemoryError | RuntimeException e) {
                    C227052iZ r13 = ovr.A00;
                    if (r13 != null) {
                        r13.A01();
                    }
                    0wb.A07("ArmadilloExpressImageLoaderImpl", e);
                    OVR.A00(ovr, e.toString(), "ArmadilloExpressImageLoaderImpl", 20003);
                    return;
                }
            case 1:
                0qQ.A0B(str, 0);
                C66581MXm.A1Q(this.A01, str);
                return;
            default:
                0qQ.A0B(str, 0);
                ((AnonymousClass4D7) this.A01).resumeWith(00l.A0F("file://", str));
                return;
        }
    }
}
