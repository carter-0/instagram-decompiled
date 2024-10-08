package X;

/* renamed from: X.8c0  reason: invalid class name and case insensitive filesystem */
public final class C359098c0 {
    public final 0wc A00;

    public final void A03(int i) {
        long j = (long) i;
        Long valueOf = Long.valueOf(j);
        if (j > 0) {
            0wc r2 = this.A00;
            0Aj A002 = r2.A00(r2.A00, "ig_received_quicksnap_impression");
            if (A002.isSampled()) {
                A002.A9F("number_of_quicksnaps", valueOf);
                A002.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
                A002.Cgf();
            }
        }
    }

    public static final void A00(C391559tH r3, C359098c0 r4, String str) {
        Long l;
        0wc r2 = r4.A00;
        0Aj A002 = r2.A00(r2.A00, "ig_quicksnap_archive");
        if (A002.isSampled()) {
            A002.A8M(r3, "action_name");
            if (str != null) {
                l = 00y.A0n(10, str);
            } else {
                l = null;
            }
            A002.A9F("media_id", l);
            A002.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
            A002.Cgf();
        }
    }

    public static final void A01(C391569tI r3, C359098c0 r4, String str) {
        Long l;
        0wc r2 = r4.A00;
        0Aj A002 = r2.A00(r2.A00, "ig_quicksnap_creation");
        if (A002.isSampled()) {
            A002.A8M(r3, "action_name");
            if (str != null) {
                l = 00y.A0n(10, str);
            } else {
                l = null;
            }
            A002.A9F("media_id", l);
            A002.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
            A002.Cgf();
        }
    }

    public static final void A02(C69468NmC nmC, C359098c0 r4, String str) {
        Long l;
        0wc r2 = r4.A00;
        0Aj A002 = r2.A00(r2.A00, "ig_quicksnap_interaction");
        if (A002.isSampled()) {
            A002.A8M(nmC, "action_name");
            if (str != null) {
                l = 00y.A0n(10, str);
            } else {
                l = null;
            }
            A002.A9F("media_id", l);
            A002.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
            A002.Cgf();
        }
    }

    public C359098c0(0wc r1) {
        this.A00 = r1;
    }
}
