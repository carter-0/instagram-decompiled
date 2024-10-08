package X;

import java.util.HashMap;

/* renamed from: X.FxV  reason: case insensitive filesystem */
public final class C51637FxV extends HashMap {
    public final int A00;
    public final Object A01;

    public C51637FxV(C376119Gp r5) {
        this.A00 = 3;
        this.A01 = r5;
        C376109Go r2 = r5.A01;
        put("user_name", r2.A00);
        put("profile_pic_url", r2.A01);
        put("resolver_type", "account_manager");
    }

    public C51637FxV(EyH eyH, int i) {
        String str;
        this.A00 = i;
        this.A01 = eyH;
        switch (i) {
            case 0:
                str = "open_help_center";
                break;
            case 1:
                str = "report_a_problem";
                break;
            default:
                str = "open_creator_support";
                break;
        }
        put("action", str);
    }
}
