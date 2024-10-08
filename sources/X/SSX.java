package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class SSX {
    public static final String A0Q = 002.A0R("KeepaliveManager", ".ACTION_INEXACT_ALARM.");
    public static final List A0R = Collections.unmodifiableList(new TSN(0));
    public static final String A0S = 002.A0R("KeepaliveManager", ".ACTION_BACKUP_ALARM.");
    public static final String A0T = 002.A0R("KeepaliveManager", ".ACTION_EXACT_ALARM.");
    public long A00;
    public long A01;
    public long A02 = -1;
    public boolean A03;
    public final int A04;
    public final long A05;
    public final AlarmManager A06;
    public final PendingIntent A07;
    public final PendingIntent A08;
    public final PendingIntent A09;
    public final BroadcastReceiver A0A;
    public final BroadcastReceiver A0B;
    public final BroadcastReceiver A0C;
    public final Context A0D;
    public final Handler A0E;
    public final RealtimeSinceBootClock A0F;
    public final AnonymousClass3RB A0G;
    public final SRZ A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final boolean A0M;
    public final 0bY A0N = new C12272SqR(this, 0);
    public final AtomicInteger A0O;
    public volatile Runnable A0P;

    private PendingIntent A00(Context context, Intent intent) {
        try {
            0Sy r1 = new 0Sy();
            r1.A0B(intent, context.getClassLoader());
            r1.A09();
            r1.A08 = this.A0N;
            return r1.A02(context, 0, 134217728);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public final synchronized void A03() {
        PendingIntent pendingIntent;
        if (this.A03) {
            this.A03 = false;
            PendingIntent pendingIntent2 = this.A09;
            if (pendingIntent2 != null) {
                this.A0G.A03(this.A06, pendingIntent2);
            }
            if (!this.A0M && (pendingIntent = this.A07) != null) {
                this.A0G.A03(this.A06, pendingIntent);
            }
            PendingIntent pendingIntent3 = this.A08;
            if (pendingIntent3 != null) {
                this.A0G.A03(this.A06, pendingIntent3);
            }
        }
        this.A00 = this.A05;
        this.A02 = -1;
    }

    public final synchronized void A04() {
        A03();
        if (this.A0P != null) {
            AnonymousClass3RB r2 = this.A0G;
            Context context = this.A0D;
            r2.A06(this.A0B, context);
            r2.A06(this.A0C, context);
            r2.A06(this.A0A, context);
        }
    }

    public final synchronized void A05() {
        PendingIntent pendingIntent;
        long j;
        PendingIntent pendingIntent2;
        long j2 = ((long) this.A0O.get()) * 1000;
        long j3 = this.A05;
        if (j2 >= j3) {
            Iterator it = A0R.iterator();
            while (true) {
                if (!it.hasNext()) {
                    j2 = j3;
                    break;
                }
                long longValue = ((Long) it.next()).longValue();
                if (j2 >= longValue) {
                    j2 = longValue;
                    break;
                }
            }
        }
        this.A00 = j2;
        this.A01 = SystemClock.elapsedRealtime() + j2;
        if (this.A03) {
            PendingIntent pendingIntent3 = this.A08;
            if (pendingIntent3 != null) {
                this.A0G.A03(this.A06, pendingIntent3);
            }
            if (!this.A0M && (pendingIntent2 = this.A07) != null) {
                this.A0G.A03(this.A06, pendingIntent2);
            }
        } else {
            this.A03 = true;
        }
        try {
            long j4 = this.A00;
            if (j4 < j3) {
                pendingIntent = this.A08;
                j = this.A01;
            } else {
                if (this.A02 != j4) {
                    this.A02 = j4;
                    PendingIntent pendingIntent4 = this.A09;
                    if (pendingIntent4 != null) {
                        this.A0G.A03(this.A06, pendingIntent4);
                    }
                    A02(pendingIntent4, this, this.A01);
                }
                if (!this.A0M) {
                    pendingIntent = this.A07;
                    j = this.A01 + 20000;
                }
            }
            A01(pendingIntent, this, j);
        } catch (Throwable unused) {
        }
    }

    public static void A01(PendingIntent pendingIntent, SSX ssx, long j) {
        String str;
        String str2;
        if (pendingIntent != null) {
            try {
                Context context = ssx.A0D;
                AlarmManager alarmManager = ssx.A06;
                if (!AnonymousClass0Am.A00(alarmManager, context)) {
                    A02(pendingIntent, ssx, j);
                } else if (ssx.A0M) {
                    alarmManager.setExactAndAllowWhileIdle(2, j, pendingIntent);
                } else {
                    alarmManager.setExact(2, j, pendingIntent);
                }
            } catch (SecurityException e) {
                e = e;
                str = "KeepaliveManager";
                str2 = "Failed to set alarm";
                0KC.A0G(str, str2, e);
            } catch (NullPointerException e2) {
                e = e2;
                str = "KeepaliveManager";
                str2 = "set alarm NullPointerException";
                0KC.A0G(str, str2, e);
            } catch (RuntimeException e3) {
                e = e3;
                if (e.getCause() instanceof DeadObjectException) {
                    str = "KeepaliveManager";
                    str2 = "set alarm DeadObjectException";
                    0KC.A0G(str, str2, e);
                }
                throw e;
            }
        }
    }

    public static void A02(PendingIntent pendingIntent, SSX ssx, long j) {
        String str;
        String str2;
        if (pendingIntent != null) {
            try {
                long j2 = j;
                if (ssx.A04 < 23 || !ssx.A0M) {
                    ssx.A06.set(2, j, pendingIntent);
                } else {
                    ssx.A0G.A02(ssx.A06, 2, j2, pendingIntent);
                }
            } catch (SecurityException e) {
                e = e;
                str = "KeepaliveManager";
                str2 = "Failed to set alarm";
                0KC.A0G(str, str2, e);
            } catch (NullPointerException e2) {
                e = e2;
                str = "KeepaliveManager";
                str2 = "set alarm NullPointerException";
                0KC.A0G(str, str2, e);
            } catch (RuntimeException e3) {
                e = e3;
                if (e.getCause() instanceof DeadObjectException) {
                    str = "KeepaliveManager";
                    str2 = "set alarm DeadObjectException";
                    0KC.A0G(str, str2, e);
                }
                throw e;
            }
        }
    }

    public SSX(Context context, Handler handler, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass3RB r6, C10936S1p s1p, SRZ srz, String str, AtomicInteger atomicInteger, long j) {
        this.A0D = context;
        this.A0L = str;
        this.A0M = C241833Rj.A02(context.getPackageName());
        this.A0O = atomicInteger;
        this.A05 = j;
        T9D A002 = s1p.A00(AlarmManager.class, "alarm");
        if (A002 instanceof C7860Qbk) {
            throw AnonymousClass7TE.A0w("Cannot acquire Alarm service");
        }
        this.A06 = (AlarmManager) A002.A01();
        this.A0F = realtimeSinceBootClock;
        this.A04 = Build.VERSION.SDK_INT;
        this.A0E = handler;
        this.A0G = r6;
        this.A0H = srz;
        this.A0B = new Q63(this, 7);
        StringBuilder A16 = Pxe.A16(A0T);
        Pxk.A0O(context, this.A0L, A16);
        String obj = A16.toString();
        this.A0J = obj;
        this.A08 = A00(context, Pxe.A0G(obj));
        this.A0C = new Q63(this, 8);
        StringBuilder A162 = Pxe.A16(A0Q);
        Pxk.A0O(context, this.A0L, A162);
        String obj2 = A162.toString();
        this.A0K = obj2;
        this.A09 = A00(context, Pxe.A0G(obj2));
        this.A0A = new Q63(this, 9);
        StringBuilder A163 = Pxe.A16(A0S);
        Pxk.A0O(context, this.A0L, A163);
        String obj3 = A163.toString();
        this.A0I = obj3;
        this.A07 = A00(context, Pxe.A0G(obj3));
    }
}
