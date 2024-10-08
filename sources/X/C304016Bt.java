package X;

/* renamed from: X.6Bt  reason: invalid class name and case insensitive filesystem */
public final class C304016Bt {
    public C58840Ae A00;

    public final void A00(String str, String str2, String str3, String str4, String str5, int i) {
        C58840Ae r0 = this.A00;
        if (r0 != null) {
            1Ln A0K = 1Ln.A0K(r0);
            String A002 = MYa.A00(i);
            if (A0K.A00.isSampled()) {
                A0K.A0R("notif_id", str);
                A0K.A0R("message_id", str2);
                A0K.A0R("notif_event", A002);
                A0K.A0R("carrier", (String) null);
                A0K.A0R("channel", str4);
                A0K.A0R("notif_type", str3);
                A0K.A0R("extra_info", str5);
                A0K.Cgf();
                return;
            }
            return;
        }
        0qQ.A0F("logger");
        throw AnonymousClass00P.createAndThrow();
    }
}
