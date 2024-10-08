package X;

import android.content.SharedPreferences;
import com.instagram.common.typedurl.ImageUrl;

public final class FGv {
    public static final EtY A00;
    public static final EtY A01;
    public static final EtZ A02;
    public static final 1QB A03;
    public static final 1QB A04;
    public static final 1QC A05;

    static {
        SharedPreferences sharedPreferences = C60960kU.A00.getSharedPreferences("unauthenticated", 0);
        0qQ.A0B(sharedPreferences, 1);
        0tX r2 = new 0tX(sharedPreferences, (String) null);
        A00 = new EtY(r2);
        A03 = new 1QB(r2, "last_log_in_token");
        A01 = new EtY(r2);
        A02 = new EtZ(r2);
        A05 = new 1QC(r2, "last_attempt_time_stamp");
        A04 = new 1QB(r2, "last_user_profile_photo_url");
    }

    public static synchronized int A00() {
        int A002;
        synchronized (FGv.class) {
            long currentTimeMillis = System.currentTimeMillis();
            0xa r7 = A05.A00;
            if (r7.getLong("last_attempt_time_stamp", 0) + 604800000 < currentTimeMillis || r7.getLong("last_attempt_time_stamp", 0) > currentTimeMillis) {
                0xY AR4 = A02.A00.AR4();
                AR4.E5Z("number_of_login_attempts", 0);
                AR4.apply();
            }
            A002 = DbT.A00(A02.A00, "number_of_login_attempts");
        }
        return A002;
    }

    public static synchronized String A01() {
        String string;
        synchronized (FGv.class) {
            string = A03.A00.getString("last_log_in_token", (String) null);
        }
        return string;
    }

    public static synchronized void A02() {
        0xY AR4;
        synchronized (FGv.class) {
            A05.A00(Long.valueOf(System.currentTimeMillis()));
            0xa r3 = A02.A00;
            int A002 = DbT.A00(r3, "number_of_login_attempts") + 1;
            if (Integer.valueOf(A002) == null) {
                AR4 = r3.AR4();
                AR4.ED3("number_of_login_attempts");
            } else {
                AR4 = r3.AR4();
                AR4.E5Z("number_of_login_attempts", A002);
            }
            AR4.apply();
        }
    }

    public static synchronized void A03(ImageUrl imageUrl, String str) {
        synchronized (FGv.class) {
            A03.A00(str);
            0xY AR4 = A00.A00.AR4();
            AR4.E5T("did_facebook_sso", true);
            AR4.apply();
            A04.A00(imageUrl.getUrl());
        }
    }

    public static synchronized void A04(String str) {
        synchronized (FGv.class) {
            A03.A00(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (A01() != null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean A05() {
        /*
            java.lang.Class<X.FGv> r2 = X.FGv.class
            monitor-enter(r2)
            X.EtY r0 = A00     // Catch:{ all -> 0x0019 }
            X.0xa r1 = r0.A00     // Catch:{ all -> 0x0019 }
            java.lang.String r0 = "did_facebook_sso"
            boolean r0 = X.DbT.A1a(r1, r0)     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0016
            java.lang.String r1 = A01()     // Catch:{ all -> 0x001b }
            r0 = 0
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            monitor-exit(r2)
            return r0
        L_0x0019:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001b }
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGv.A05():boolean");
    }

    public static synchronized boolean A06() {
        boolean A1a;
        synchronized (FGv.class) {
            A1a = DbT.A1a(A01.A00, "registration_push_sent_v2");
        }
        return A1a;
    }
}
