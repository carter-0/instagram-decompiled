package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.rti.common.time.RealtimeSinceBootClock;

/* renamed from: X.SIg  reason: case insensitive filesystem */
public final class C11269SIg {
    public static final String A0D = 002.A0R(C11269SIg.class.getCanonicalName(), ".ACTION_ALARM.");
    public boolean A00;
    public boolean A01;
    public final AlarmManager A02;
    public final PendingIntent A03;
    public final BroadcastReceiver A04;
    public final Context A05;
    public final Handler A06;
    public final AnonymousClass3RB A07;
    public final String A08;
    public final int A09;
    public final RealtimeSinceBootClock A0A;
    public final C13578Td3 A0B;
    public volatile Runnable A0C;

    public final synchronized void A00() {
        PendingIntent pendingIntent;
        if (this.A00 && (pendingIntent = this.A03) != null) {
            this.A00 = false;
            this.A07.A03(this.A02, pendingIntent);
        }
    }

    public final synchronized void A01() {
        synchronized (this) {
            if (!this.A01) {
                this.A01 = this.A07.A07(this.A04, this.A05, new IntentFilter(this.A08), this.A06, AnonymousClass7TE.A0u());
            }
            if (!this.A00) {
                long j = (long) ((this.A09 + 60) * IgNetworkConsentStorage.MAX_ENTRIES);
                PendingIntent pendingIntent = this.A03;
                if (pendingIntent != null) {
                    this.A00 = true;
                    try {
                        this.A07.A04(this.A05, this.A02, 2, SystemClock.elapsedRealtime() + j, pendingIntent);
                    } catch (Throwable th) {
                        this.A00 = false;
                        0KC.A0M("PingUnreceivedAlarm", "alarm_failed; intervalSec=%s", th, new Object[]{Long.valueOf(j / 1000)});
                    }
                }
            }
        }
        return;
    }

    public C11269SIg(Context context, Handler handler, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass3RB r7, C10936S1p s1p, C13578Td3 td3, String str) {
        PendingIntent pendingIntent;
        this.A05 = context;
        StringBuilder A16 = Pxe.A16(A0D);
        Pxk.A0O(context, str, A16);
        String obj = A16.toString();
        this.A08 = obj;
        T9D A002 = s1p.A00(AlarmManager.class, "alarm");
        if (A002 instanceof C7860Qbk) {
            throw AnonymousClass7TE.A0w("Cannot acquire Alarm service");
        }
        this.A02 = (AlarmManager) A002.A01();
        this.A0A = realtimeSinceBootClock;
        this.A06 = handler;
        this.A0B = td3;
        this.A07 = r7;
        this.A09 = 60;
        this.A04 = new Q63(this, 10);
        Intent A0G = Pxe.A0G(obj);
        Pxe.A1L(context, A0G);
        try {
            0Sy r2 = new 0Sy();
            r2.A0A(A0G);
            r2.A09();
            pendingIntent = r2.A02(context, 0, 134217728);
        } catch (SecurityException unused) {
            pendingIntent = null;
        }
        this.A03 = pendingIntent;
    }
}
