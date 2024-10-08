package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AVy  reason: case insensitive filesystem */
public final class C40208AVy implements C13736Tg8 {
    public final /* synthetic */ 2Ld A00;

    public final void Dap(Boolean bool, Integer num, Throwable th) {
        0qQ.A0B(th, 0);
        2Ld r0 = this.A00;
        2Lu A002 = r0.A00();
        String str = r0.A02;
        if (str != null) {
            A002.A00(str, th);
        } else {
            0qQ.A0F("deviceKeyDER");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public C40208AVy(2Ld r1) {
        this.A00 = r1;
    }

    public final void Das(String str) {
        2Ld r6 = this.A00;
        2Lu A002 = r6.A00();
        String str2 = r6.A02;
        if (str2 != null) {
            String str3 = A002.A01;
            if (str3 != null) {
                0Aj A0e = AnonymousClass7TE.A0e(A002.A00, "client_register_trusteddevice_success");
                if (A0e.isSampled()) {
                    0bb r1 = new 0bb();
                    r1.A06("family_device_id", str3);
                    r1.A06("dev_pub_key", str2);
                    A0e.AAK(r1, "event_payload");
                    A0e.AAJ(AnonymousClass9NE.A00(), AnonymousClass2M6.A00);
                    A0e.AAJ("product_type", AnonymousClass2MT.A00);
                    A0e.AAJ("platform", "android");
                    A0e.A9F("actual_event_time", Long.valueOf(System.currentTimeMillis()));
                    A0e.Cgf();
                }
            }
            UserSession userSession = r6.A05;
            2O7 r3 = new 2O7(userSession);
            String str4 = userSession.A06;
            2OU r0 = r3.A00.A00;
            r3.A00 = new 2OJ(new 2OU(r0.A00, 094.A01(str4, r0.A01)));
            2O7.A00(r3);
            2O7 r32 = new 2O7(userSession);
            String str5 = r6.A02;
            if (str5 != null) {
                r32.A00 = new 2OJ(new 2OU(new 2OW(str5, AnonymousClass05K.A01), r32.A00.A00.A01));
                2O7.A00(r32);
                if (182.A06(0Tu.A06, userSession, 36328388168793409L)) {
                    C10501RtG rtG = new C10501RtG(r6.A04);
                    AnonymousClass2gB r4 = new AnonymousClass2gB();
                    SQB.A03(C9869Rii.A00(rtG.A01), new C11648Sdq(34, (Object) AnonymousClass7TE.A1C(), (Object) r4));
                    SUj.A0H(r4, new C11648Sdq(36, (Object) r6, (Object) rtG));
                    return;
                }
                return;
            }
        }
        0qQ.A0F("deviceKeyDER");
        throw AnonymousClass00P.createAndThrow();
    }
}
