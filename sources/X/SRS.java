package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

public final class SRS {
    public final Context A00;
    public final AnonymousClass3RV A01;
    public final AnonymousClass458 A02;

    public static AnonymousClass45J A00(SRS srs) {
        return Pxf.A0N(srs.A00, srs.A01, "fbns_state");
    }

    public static AnonymousClass45J A01(SRS srs) {
        return Pxf.A0N(srs.A00, srs.A01, AnonymousClass000.A00(1752));
    }

    public static boolean A02(AnonymousClass45J r3, SHZ shz, String str) {
        try {
            String A012 = shz.A01();
            C13849TiS AR1 = r3.AR1();
            AR1.E5e(str, A012);
            AR1.AIR("RegistrationState", "PreferencesManager failed to store RegistrationCacheEntry");
            return true;
        } catch (JSONException e) {
            0KC.A0G("RegistrationState", "RegistrationCacheEntry serialization failed", e);
            return false;
        }
    }

    public final String A03(String str) {
        S9L.A00(!TextUtils.isEmpty(str));
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference((Object) null);
        0qQ.A0B(str, 0);
        String string = ((AnonymousClass45I) A01(this)).getString(str, "");
        if (TextUtils.isEmpty(string)) {
            countDownLatch.countDown();
        } else {
            try {
                SHZ A002 = SHZ.A00(string);
                if (!A002.A04) {
                    long currentTimeMillis = System.currentTimeMillis();
                    atomicReference.set(A002.A03);
                    long longValue = A002.A00.longValue();
                    if (longValue + 86400000 < currentTimeMillis || longValue > currentTimeMillis) {
                        atomicReference.set((Object) null);
                    }
                }
                countDownLatch.countDown();
            } catch (JSONException e) {
                0KC.A0G("RegistrationState", "Parse failed", e);
                countDownLatch.countDown();
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            0KC.A0L("RegistrationState", "Waiting for latch was interrupted", e2, new Object[]{e2});
        }
        return (String) atomicReference.get();
    }

    public SRS(Context context, AnonymousClass3RV r6, AnonymousClass458 r7, AnonymousClass3RA r8) {
        this.A02 = r7;
        this.A00 = context;
        this.A01 = r6;
        AnonymousClass45J A002 = A00(this);
        String string = ((AnonymousClass45I) A002).getString("mqtt_version", "");
        String str = r8.A00;
        if (!string.equals(str)) {
            A05();
            C13849TiS AR1 = A002.AR1();
            AR1.E5e("mqtt_version", str);
            AR1.AIR("RegistrationState", "PreferencesManager failed to store current mqtt build number.");
        }
    }

    public final LinkedList A04() {
        CountDownLatch A0y = Pxf.A0y();
        LinkedList A1A = Pxe.A1A();
        Map all = ((AnonymousClass45I) A01(this)).getAll();
        LinkedList A1A2 = Pxe.A1A();
        Iterator A0u = AnonymousClass7TF.A0u(all);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            try {
                A1J.getKey();
                A1J.getValue();
                SHZ A002 = SHZ.A00(A1J.getValue().toString());
                if (!A002.A04) {
                    A1A2.add(A002);
                }
            } catch (JSONException e) {
                0KC.A0G("RegistrationState", "Parse failed", e);
            }
        }
        A1A.addAll(A1A2);
        A0y.countDown();
        try {
            A0y.await();
            return A1A;
        } catch (InterruptedException e2) {
            0KC.A0L("RegistrationState", "Waiting for latch was interrupted", e2, new Object[]{e2});
            return A1A;
        }
    }

    public final void A05() {
        AnonymousClass45J A012 = A01(this);
        AnonymousClass45I r4 = (AnonymousClass45I) A012;
        Map all = r4.getAll();
        C13849TiS AR1 = A012.AR1();
        Iterator A16 = DbV.A16(all);
        while (A16.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A16);
            0qQ.A0B(A18, 0);
            String string = r4.getString(A18, "");
            if (TextUtils.isEmpty(string)) {
                0KC.A0O("RegistrationState", "invalid value for %s", new Object[]{A18});
            } else {
                try {
                    SHZ A002 = SHZ.A00(string);
                    A002.A03 = "";
                    A002.A00 = C51968G9o.A0u();
                    try {
                        AR1.E5e(A18, A002.A01());
                    } catch (JSONException e) {
                        0KC.A0G("RegistrationState", "RegistrationCacheEntry serialization failed", e);
                    }
                } catch (JSONException e2) {
                    0KC.A0G("RegistrationState", "Parse failed", e2);
                    0KC.A0O("RegistrationState", "invalid value for %s", new Object[]{A18});
                }
            }
        }
        AR1.AIR("RegistrationState", "PreferencesManager failed to store RegistrationCacheEntry");
    }

    public final void A06(C13579Td4 td4, String str) {
        S9L.A00(!TextUtils.isEmpty(str));
        String string = ((AnonymousClass45I) A01(this)).getString(str, "");
        if (TextUtils.isEmpty(string)) {
            td4.Cvf((String) null);
            return;
        }
        try {
            td4.Cvf(SHZ.A00(string).A01);
        } catch (JSONException e) {
            0KC.A0G("RegistrationState", "Parse failed", e);
            td4.Cvf((String) null);
        }
    }
}
