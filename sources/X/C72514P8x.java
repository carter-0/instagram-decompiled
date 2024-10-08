package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.P8x  reason: case insensitive filesystem */
public final class C72514P8x implements AnonymousClass7X4 {
    public final /* synthetic */ NV3 A00;

    public C72514P8x(NV3 nv3) {
        this.A00 = nv3;
    }

    public final void DRe(2FW r11, MessageIdentifier messageIdentifier, String str, String str2, String str3, long j, boolean z) {
        NV3 nv3 = this.A00;
        AnonymousClass3U9 A0N = C66584MXp.A0N(nv3);
        if (A0N != null) {
            C67759MuF A0E = nv3.A0E();
            C67759MuF.A02(C67759MuF.A01(A0E), A0E, 14);
            if (messageIdentifier != null) {
                nv3.AE6("questions", "CREATED", messageIdentifier.A01, C71100Oca.A00(AnonymousClass7TE.A0l(nv3.A0S), A0N.C6a()), (String) null);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
