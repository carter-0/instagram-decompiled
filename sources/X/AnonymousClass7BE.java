package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7BE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7BE implements 0sP {
    public final /* synthetic */ C329067Hl A00;

    public /* synthetic */ AnonymousClass7BE(C329067Hl r1) {
        this.A00 = r1;
    }

    public final Object invoke(Object obj) {
        int i;
        Long l;
        C329067Hl r5 = this.A00;
        View view = (View) obj;
        UserSession userSession = r5.A1Z;
        if (182.A06(0Tu.A06, userSession, 36325742468871355L)) {
            AnonymousClass7IR r1 = r5.A1d;
            C254783t2 r7 = r5.A1z;
            XSV A01 = OP1.A01(r5.A0W);
            List A0I = C329067Hl.A0I(r5);
            boolean A0x = C329067Hl.A0x(r5);
            0qQ.A0B(r7, 0);
            0wc r2 = r1.A00;
            0Aj A002 = r2.A00(r2.A00, "direct_composer_tap");
            if (A002.isSampled()) {
                A002.AAJ("target", "camera");
                A002.A7p("is_e2ee", Boolean.valueOf(AnonymousClass6W3.A07(r7)));
                A002.A7p("is_reply_flow", Boolean.valueOf(A0x));
                A002.AAJ("open_thread_id", AnonymousClass4KK.A02(r7));
                A002.AAe("recipient_ids", A0I);
                A002.A8M(A01, "thread_type");
                A002.Cgf();
            }
        }
        2Er r22 = r5.A0W;
        if (r22 != null && C329067Hl.A00(r5) == 29) {
            C313756gx A003 = C313746gw.A00(userSession);
            2Er r0 = r5.A0W;
            if (r0 != null) {
                i = r0.AdN();
            } else {
                i = 0;
            }
            String C6C = r22.C6C();
            String C6k = r22.C6k();
            1Ln A0E = 1Ln.A0E(A003.A03);
            if (A0E.A00.isSampled()) {
                A0E.A0h(Long.valueOf(A003.A02));
                A0E.A0l("camera_rendered");
                A0E.A0k("tap");
                A0E.A0p("camera_icon");
                A0E.A0q("thread_view");
                A0E.A0o(C313746gw.A01(Integer.valueOf(i)));
                A0E.A0s(C6C);
                if (C6k != null) {
                    l = 00y.A0n(10, C6k);
                } else {
                    l = null;
                }
                A0E.A0i(l);
                A0E.Cgf();
            }
        }
        if (!C329067Hl.A13(r5, C67555Mpp.TRIGGER_CAMERA, new C40508AdH(view, r5))) {
            r5.A1i.A03(0nA.A0F(view), C329067Hl.A04(r5), (String) null, C329067Hl.A00(r5));
        } else {
            r5.A19();
            r5.A16();
        }
        C329067Hl.A0j(r5, false);
        return C60340gF.A00;
    }
}
