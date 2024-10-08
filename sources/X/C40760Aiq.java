package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.Aiq  reason: case insensitive filesystem */
public final class C40760Aiq implements Runnable {
    public final /* synthetic */ C226952iF A00;

    public C40760Aiq(C226952iF r1) {
        this.A00 = r1;
    }

    public final void run() {
        Object C3s = this.A00.C3s();
        if (C3s != null) {
            C379439Tx r1 = (C379439Tx) C3s;
            C348257y9 r3 = (C348257y9) r1.A01.get();
            Medium medium = r1.A00;
            if (r3 != null && r3.CWP(medium)) {
                r3.DLY(medium, (String) null);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
