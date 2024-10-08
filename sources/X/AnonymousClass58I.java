package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import java.util.Random;

/* renamed from: X.58I  reason: invalid class name */
public final class AnonymousClass58I implements C61110lV, AnonymousClass0lh {
    public final long A00;
    public final 0wc A01;
    public final String A02;
    public final Random A03 = new Random();
    public final UserSession A04;

    private final boolean A00() {
        if (this.A03.nextInt(100) < 30) {
            return true;
        }
        return false;
    }

    public AnonymousClass58I(UserSession userSession) {
        this.A04 = userSession;
        0Tu r2 = 0Tu.A05;
        this.A00 = 182.A01(r2, userSession, 36597055553604314L);
        this.A02 = 182.A04(r2, userSession, 36878530530246847L);
        this.A01 = AnonymousClass0kN.A02(userSession);
    }

    public final void onAppBackgrounded() {
        String str;
        Boolean valueOf;
        Long valueOf2;
        Double valueOf3;
        String A0O;
        int A032 = AnonymousClass0fD.A03(1370859185);
        Random random = this.A03;
        if (((long) random.nextInt(100)) < this.A00) {
            0wc r2 = this.A01;
            0Aj A002 = r2.A00(r2.A00, "fa_double_logging_event");
            if (A002.isSampled()) {
                A002.AAJ("app_name", "Instagram");
                A002.AAJ("platform", "Android");
                A002.A9F("timestamp_ms", Long.valueOf(System.currentTimeMillis()));
                A002.A7p("boolean_property_1", Boolean.valueOf(A00()));
                A002.A9F("int_property_1", Long.valueOf((long) random.nextInt(IgNetworkConsentStorage.MAX_ENTRIES)));
                A002.A8D("float_property_1", Double.valueOf(random.nextDouble() * 1000.0d));
                int nextInt = random.nextInt(100);
                if (nextInt <= 58) {
                    str = "event_1";
                } else if (nextInt <= 74) {
                    str = "event_2";
                } else if (nextInt <= 81) {
                    str = "event_3";
                } else if (nextInt <= 93) {
                    str = "event_4";
                } else if (nextInt <= 98) {
                    str = "event_5";
                } else {
                    str = "event_6";
                }
                A002.AAJ("string_property_1", str);
                String str2 = null;
                if (A00()) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(A00());
                }
                A002.A7p("boolean_property_2", valueOf);
                if (A00()) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf((long) random.nextInt(IgNetworkConsentStorage.MAX_ENTRIES));
                }
                A002.A9F("int_property_2", valueOf2);
                if (A00()) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Double.valueOf(random.nextDouble() * 1000.0d);
                }
                A002.A8D("float_property_2", valueOf3);
                if (A00()) {
                    A0O = null;
                } else {
                    A0O = 002.A0O("random_string_", random.nextInt(100));
                }
                A002.AAJ("string_property_2", A0O);
                String str3 = this.A02;
                if (str3.length() != 0) {
                    str2 = str3;
                }
                A002.AAJ("tag", str2);
                A002.Cgf();
            }
        }
        AnonymousClass0fD.A0A(-1584791633, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-1082783096, AnonymousClass0fD.A03(1948557677));
    }

    public final void onSessionWillEnd() {
        14i.A06(this);
    }
}
