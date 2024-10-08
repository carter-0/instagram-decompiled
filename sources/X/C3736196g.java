package X;

import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.96g  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3736196g implements C3736296h {
    public final FirebaseInstanceId A00;
    public final String A01;
    public final String A02;

    public C3736196g(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.A00 = firebaseInstanceId;
        this.A01 = str;
        this.A02 = str2;
    }

    public final Object Ezj(AnonymousClass9GD r13) {
        AnonymousClass9GD r4;
        FirebaseInstanceId firebaseInstanceId = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        String A022 = FirebaseInstanceId.A02();
        C3736096f A002 = FirebaseInstanceId.A00(str, str2);
        if (!firebaseInstanceId.A08(A002)) {
            C3737496t r0 = new C3737496t(A002.A01);
            AnonymousClass9GD r42 = new AnonymousClass9GD();
            r42.A0C(r0);
            return r42;
        }
        C3735796c r6 = firebaseInstanceId.A05;
        synchronized (r6) {
            Pair pair = new Pair(str, str2);
            Map map = r6.A00;
            r4 = (AnonymousClass9GD) map.get(pair);
            if (r4 == null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String.valueOf(String.valueOf(pair));
                }
                AnonymousClass96T r3 = firebaseInstanceId.A00;
                AnonymousClass9GD A023 = AnonymousClass96T.A00(new Bundle(), r3, A022, str, str2).A02(new AW0(r3), r3.A04);
                Executor executor = firebaseInstanceId.A07;
                AWC awc = new AWC(firebaseInstanceId, str, str2, A022);
                AnonymousClass9GD r32 = new AnonymousClass9GD();
                A023.A03.A00(new AW2(awc, r32, executor));
                AnonymousClass9GD.A01(A023);
                Executor executor2 = r6.A01;
                AW1 aw1 = new AW1(pair, r6);
                r4 = new AnonymousClass9GD();
                r32.A03.A00(new C3736396i(aw1, r4, executor2));
                AnonymousClass9GD.A01(r32);
                map.put(pair, r4);
            } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String.valueOf(String.valueOf(pair));
            }
        }
        return r4;
    }
}
