package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8m8  reason: invalid class name and case insensitive filesystem */
public final class C364858m8 implements C364868m9 {
    public final /* synthetic */ AnonymousClass8KQ A00;

    public C364858m8(AnonymousClass8KQ r1) {
        this.A00 = r1;
    }

    public final void DGu(String str) {
        AnonymousClass8K4 r1 = this.A00.A00;
        AnonymousClass82Y r5 = r1.A0I.A02.A01;
        C357638Yz r0 = r5.A0X;
        if (r0 != null) {
            C279284yO r2 = (C279284yO) r0.A08.A00;
            if (r2 == AnonymousClass9QA.A00 || r2 == AnonymousClass80M.A00) {
                UserSession userSession = r1.A0D;
                C365928nu A002 = C365918nt.A00(userSession);
                String str2 = r2.A02;
                A002.A04(str, 002.A0R("camera_destination ", str2));
                if (r5.A0G != null) {
                    C365918nt.A00(userSession).A01(str);
                } else if (r5.A0D == AnonymousClass05K.A01) {
                    C365918nt.A00(userSession).A03(str, 002.A0R("camera_destination ", str2));
                }
            }
        }
    }

    public final void onFirstFrameRendered() {
        AnonymousClass8K4 r2 = this.A00.A00;
        r2.A0A.runOnUiThread(new C365308ms(r2));
    }
}
