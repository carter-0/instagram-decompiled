package X;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.45A  reason: invalid class name */
public abstract class AnonymousClass45A implements AnonymousClass45B {
    public 0QS A00;
    public final Context A01;
    public final AnonymousClass3RV A02;
    public final AnonymousClass452 A03;
    public final Integer A04;
    public volatile String A05;
    public volatile String A06;

    public final boolean A02(String str) {
        String[] strArr;
        if (str != null) {
            String A002 = AnonymousClass000.A00(3247);
            if (!str.startsWith(A002)) {
                str = 002.A0R(A002, str);
            }
            try {
                Uri A032 = 0cp.A03(str);
                if (this instanceof AnonymousClass4CQ) {
                    strArr = new String[]{AnonymousClass000.A00(1335), "workplace.com"};
                } else {
                    strArr = new String[]{AnonymousClass000.A00(1335), "workplace.com", "pushnotifs.com"};
                }
                for (String str2 : Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)))) {
                    String host = A032.getHost();
                    if (host != null) {
                        if (!host.equalsIgnoreCase(str2)) {
                            if (host.endsWith(002.A0R(".", str2))) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } catch (SecurityException unused) {
                return false;
            }
        }
        return true;
    }

    public final void A00() {
        if (!(this instanceof AnonymousClass4CQ) && this.A00 == null) {
            0QS r1 = new 0QS(new C59900bo[]{new AnonymousClass4C2(this)});
            this.A00 = r1;
            0DH.A02(r1, this.A01, (IntentFilter) r1.A00.get(0), (Handler) null, "com.facebook.permission.prod.FB_APP_COMMUNICATION", false);
        }
    }

    public final void A01() {
        String str;
        0QS r1 = this.A00;
        if (r1 != null) {
            try {
                this.A01.unregisterReceiver(r1);
            } catch (IllegalArgumentException e) {
                if (this instanceof AnonymousClass459) {
                    str = "ZeroRatingConnectionConfigOverrides";
                } else {
                    str = "WorkConnectionConfigOverrides";
                }
                0KC.A0I(str, Pxd.A00(61), e);
            }
            this.A00 = null;
        }
    }

    public final String AbR() {
        return this.A05;
    }

    public final String BUM() {
        return this.A06;
    }

    public AnonymousClass45A(Context context, AnonymousClass3RV r2, AnonymousClass452 r3, Integer num) {
        this.A01 = context;
        this.A03 = r3;
        this.A04 = num;
        this.A02 = r2;
    }
}
