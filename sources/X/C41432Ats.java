package X;

import android.text.TextUtils;

/* renamed from: X.Ats  reason: case insensitive filesystem */
public final /* synthetic */ class C41432Ats implements C62320sa {
    public final /* synthetic */ C329067Hl A00;

    public /* synthetic */ C41432Ats(C329067Hl r1) {
        this.A00 = r1;
    }

    public final Object invoke() {
        2FW r4;
        C329067Hl r1 = this.A00;
        C329647Jr r2 = r1.A0e;
        if (r2 != null) {
            C331617Rr r3 = r1.A0Z;
            boolean A0x = C329067Hl.A0x(r1);
            C254933tI A04 = C329067Hl.A04(r1);
            if (A04 != null) {
                r4 = A04.A0F;
            } else {
                r4 = null;
            }
            boolean z = true;
            boolean z2 = !TextUtils.isEmpty(r1.A0b.A0Y.A00.trim());
            C70797OLs oLs = r1.A0g;
            if (oLs == null || !oLs.A00()) {
                z = false;
            }
            r2.A00(r3, r4, r1.A0b.A0Y.A00.trim(), A0x, z2, z, r1.A0b.A07());
        }
        return C60340gF.A00;
    }
}
