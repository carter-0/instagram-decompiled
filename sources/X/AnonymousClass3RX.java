package X;

import android.content.Intent;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3RX  reason: invalid class name */
public final class AnonymousClass3RX {
    public final AnonymousClass3RT A00;
    public final AnonymousClass3RT A01;
    public final AnonymousClass3RT A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map A06;
    public final Set A07;
    public final Set A08;
    public final Set A09;
    public final AnonymousClass3RT A0A;
    public final AnonymousClass3RT A0B;
    public final Map A0C;

    public AnonymousClass3RX(AnonymousClass3RT r4, AnonymousClass3RT r5, AnonymousClass3RT r6, AnonymousClass3RT r7, AnonymousClass3RT r8, Map map, Map map2, Set set, Set set2, Set set3) {
        this.A05 = "com.facebook.services";
        this.A04 = "com.facebook.services.dev";
        this.A03 = "com.facebook.oxygen.services.fbns.PreloadedFbnsService";
        this.A08 = set2;
        this.A06 = map;
        this.A07 = set;
        this.A0C = map2;
        this.A0A = r4;
        this.A01 = r8;
        this.A0B = r7;
        this.A00 = r5;
        this.A02 = r6;
        this.A09 = set3;
    }

    public final C282425Da A00(Intent intent, C241913Rw r4) {
        AnonymousClass3RT r1 = this.A0A;
        if (r1.A00 != null) {
            AnonymousClass3RN r0 = (AnonymousClass3RN) ((AnonymousClass3RP) r1.A00()).A00.get(0);
            r0.getClass();
            r0.A01 = r4;
            r0.A00 = intent;
            return r0.A00();
        }
        throw new RuntimeException("IntentConfigProvider not bound in Fbns Config Manager");
    }

    public final C282425Da A01(Intent intent, C241913Rw r4) {
        AnonymousClass3RT r1 = this.A0A;
        if (r1.A00 != null) {
            AnonymousClass3RN r0 = (AnonymousClass3RN) ((AnonymousClass3RP) r1.A00()).A00.get(0);
            r0.getClass();
            r0.A01 = r4;
            r0.A00 = intent;
            return r0.A00();
        }
        throw new RuntimeException("IntentConfigProvider not bound in Fbns Config Manager");
    }

    public final AnonymousClass3RV A02() {
        AnonymousClass3RT r1 = this.A0B;
        if (r1.A00 != null) {
            return (AnonymousClass3RV) r1.A00();
        }
        throw new RuntimeException("mPreferencesManagerProvider not bound in Fbns Config Manager");
    }

    public AnonymousClass3RX() {
    }
}
