package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.P8w  reason: case insensitive filesystem */
public final class C72513P8w implements AnonymousClass7X4 {
    public final /* synthetic */ NV7 A00;

    public C72513P8w(NV7 nv7) {
        this.A00 = nv7;
    }

    public final void DRe(2FW r11, MessageIdentifier messageIdentifier, String str, String str2, String str3, long j, boolean z) {
        C242243Te r0;
        NV7 nv7 = this.A00;
        AnonymousClass3U9 A0N = C66584MXp.A0N(nv7);
        if (A0N != null && (r0 = A0N.A01.A0s) != null && r0.A0I) {
            C67759MuF A0E = nv7.A0E();
            C67759MuF.A02(C67759MuF.A01(A0E), A0E, 14);
            if (messageIdentifier != null) {
                nv7.AE6("challenges", "CREATED", messageIdentifier.A01, C71100Oca.A00(AnonymousClass7TE.A0l(nv7.A0S), A0N.C6a()), (String) null);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
