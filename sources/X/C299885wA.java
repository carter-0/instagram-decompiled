package X;

/* renamed from: X.5wA  reason: invalid class name and case insensitive filesystem */
public final class C299885wA {
    public final 0lg A00;

    public C299885wA(0lg r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public static final void A01(C299885wA r6, String str, String str2, String str3, String str4, int i) {
        0wc A02 = AnonymousClass0kN.A02(r6.A00);
        1Ln r3 = new 1Ln(A02.A00(A02.A00, "fx_access_control_list"), 155);
        if (r3.A00.isSampled()) {
            r3.A0l(str);
            r3.A0R("acl_error_message", str2);
            r3.A0R("caller_name", str3);
            r3.A0Q("acl_version", 2L);
            r3.A00.A8k("capability", Integer.valueOf(i));
            r3.A0R("caller_context", str4);
            r3.Cgf();
        }
    }

    public static final int A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        if (intValue == 3) {
            return 3;
        }
        return 4;
    }

    public C299885wA() {
    }
}
