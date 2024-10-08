package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class S3T {
    public AlarmManager A00;
    public Context A01;
    public C241903Rv A02;
    public T9D A03 = C7860Qbk.A00;
    public AnonymousClass45J A04;
    public RealtimeSinceBootClock A05;
    public AnonymousClass3RB A06;
    public C10936S1p A07;
    public Map A08;
    public final 0bY A09 = new C12272SqR(this, 1);
    public final Map A0A = new ConcurrentHashMap();

    public final void A00(String str) {
        PendingIntent pendingIntent = (PendingIntent) this.A08.remove(str);
        if (pendingIntent != null) {
            this.A06.A03(this.A00, pendingIntent);
        }
        C13849TiS AR1 = this.A04.AR1();
        AR1.E5a(str, 120000);
        AR1.AIR("FbnsRegistrarRetry", "PreferencesManager failed to store Registration reset retry");
    }

    public S3T(Context context, C241903Rv r4, AnonymousClass3RV r5, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass3RB r7, C10936S1p s1p) {
        this.A01 = context;
        this.A07 = s1p;
        T9D A002 = s1p.A00(AlarmManager.class, "alarm");
        if (A002 instanceof C7860Qbk) {
            throw AnonymousClass7TE.A0w("Cannot acquire Alarm service");
        }
        this.A00 = (AlarmManager) A002.A01();
        this.A04 = r5.A00(context, "retry");
        this.A05 = realtimeSinceBootClock;
        this.A02 = r4;
        this.A06 = r7;
        this.A08 = AnonymousClass7TE.A1E();
    }
}
