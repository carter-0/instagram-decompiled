package X;

import android.net.Uri;
import android.util.Base64;

public final class SDI {
    public static final SRH A00;
    public static final SRH A01;
    public static final SRH A02;
    public static final SRH A03;
    public static final SRH A04;
    public static final SRH A05;
    public static final SRH A06;
    public static final SRH A07;
    public static final SRH A08;
    public static final SRH A09;
    public static final SRH A0A;
    public static final SRH A0B;
    public static final SRH A0C;

    static {
        Uri uri;
        synchronized (C9989Rkj.class) {
            0yf r2 = C9989Rkj.A00;
            uri = (Uri) r2.get("com.google.android.gms.auth_account");
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
                r2.put("com.google.android.gms.auth_account", uri);
            }
        }
        if ("".isEmpty()) {
            C10467Rsi rsi = new C10467Rsi(uri);
            Double valueOf = Double.valueOf(0.0d);
            A00 = new SRH(rsi, valueOf, "getTokenRefactor__account_data_service_sample_percentage");
            Boolean A0v = AnonymousClass7TE.A0v();
            A01 = new SRH(rsi, A0v, "getTokenRefactor__account_data_service_tokenAPI_usable");
            A02 = new SRH(rsi, 20L, "getTokenRefactor__account_manager_timeout_seconds");
            A03 = new SRH(rsi, C51971G9r.A0m(), "getTokenRefactor__android_id_shift");
            try {
                A04 = new C8417Qu8(rsi, C11140SBv.A00, C8423QuE.A00(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)));
                A05 = new SRH(rsi, A0v, "getTokenRefactor__chimera_get_token_evolved");
                A06 = new SRH(rsi, 20L, "getTokenRefactor__clear_token_timeout_seconds");
                A07 = new SRH(rsi, 20L, "getTokenRefactor__default_task_timeout_seconds");
                Boolean A0u = AnonymousClass7TE.A0u();
                A08 = new SRH(rsi, A0u, "getTokenRefactor__gaul_accounts_api_evolved");
                A09 = new SRH(rsi, A0u, "getTokenRefactor__gaul_token_api_evolved");
                A0A = new SRH(rsi, 120L, "getTokenRefactor__get_token_timeout_seconds");
                A0B = new SRH(rsi, A0v, "getTokenRefactor__gms_account_authenticator_evolved");
                A0C = new SRH(rsi, valueOf, "getTokenRefactor__gms_account_authenticator_sample_percentage");
            } catch (Exception e) {
                throw Pxe.A0e(e);
            }
        } else {
            throw AnonymousClass7TE.A0z("Cannot set GServices prefix and skip GServices");
        }
    }
}
