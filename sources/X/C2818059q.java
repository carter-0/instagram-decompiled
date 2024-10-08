package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.Map;

/* renamed from: X.59q  reason: invalid class name and case insensitive filesystem */
public final class C2818059q {
    public final C58840Ae A00;
    public final String A01 = C2818159r.A01();
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, C2818259s.A00);

    public final void A00(Exception exc, String str, String str2, Map map) {
        String str3;
        String message;
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "client_copy_autofillproof_fail");
        if (A002.isSampled()) {
            0bb r22 = new 0bb();
            r22.A03("legacy_key_migration_should_retry", false);
            r22.A03("cross_app_migration_should_retry", false);
            r22.A06("legacy_key_migration_status", str);
            r22.A06("cross_app_migration_status", str2);
            A002.AAJ(Py7.A01(21, 10, 17), this.A01);
            A002.A8M(2M7.A04, "product_type");
            A002.A8M(C2818559v.ANDROID, "platform");
            0qQ.A07(this.A02.getValue());
            A002.A9F(AnonymousClass000.A00(495), Long.valueOf(System.currentTimeMillis()));
            A002.AAK(r22, AnonymousClass000.A00(1317));
            A002.A9H("extra_data", map);
            String str4 = "";
            if (exc == null || ((str3 = exc.getMessage()) == null && (str3 = exc.toString()) == null)) {
                str3 = str4;
            }
            A002.AAJ(TraceFieldType.ErrorCode, str3);
            if (!(exc == null || ((message = exc.getMessage()) == null && (message = exc.toString()) == null))) {
                str4 = message;
            }
            A002.AAJ("error_message", str4);
            A002.Cgf();
        }
    }

    public C2818059q(C58840Ae r3) {
        this.A00 = r3;
    }
}
