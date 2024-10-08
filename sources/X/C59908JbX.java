package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.JbX  reason: case insensitive filesystem */
public class C59908JbX {
    public final Context A00;

    public static void A06(0Aj r2, C59908JbX jbX) {
        r2.AAJ("connection", C61970qY.A08(jbX.A00));
    }

    public C59908JbX(Context context) {
        this.A00 = context;
    }

    public static void A02(0Aj r2, UserSession userSession, AnonymousClass3Q2 r4, C59907JbW jbW) {
        r2.AAJ("ingest_id", jbW.A0H());
        r2.AAJ("ingest_surface", C59906JbV.A01(userSession, r4));
    }

    public static void A03(0Aj r2, C59907JbW jbW) {
        r2.A7p(AnonymousClass000.A00(4913), Boolean.valueOf(jbW.A0J()));
    }

    public static void A04(0Aj r2, C59907JbW jbW, Long l, String str) {
        r2.A9F(str, l);
        r2.A9F(AnonymousClass000.A00(1576), jbW.A0B());
        r2.A9F(AnonymousClass000.A00(703), jbW.A0D());
    }

    public static void A05(0Aj r2, C59907JbW jbW, String str, String str2) {
        r2.AAJ(str, str2);
        r2.AAJ("media_type", C59909JbY.A00(C59906JbV.A00(jbW.A02)));
    }

    public Map A07() {
        Runtime runtime = Runtime.getRuntime();
        return 0Yt.A07(DbW.A1b("free_memory_bytes", String.valueOf(runtime.freeMemory() + (runtime.maxMemory() - runtime.totalMemory()))));
    }
}
