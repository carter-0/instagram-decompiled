package X;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.blescan.BleScanOperation;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.3Sn  reason: invalid class name and case insensitive filesystem */
public final class C242073Sn {
    public S3S A00;
    public O5V A01;
    public C270934hd A02;
    public T77 A03;
    public C270924hc A04;
    public C270914hb A05;
    public C270964hg A06;
    public C276264sw A07;
    public C270944he A08;
    public ScheduledExecutorService A09;
    public ScheduledExecutorService A0A;
    public final Context A0B;
    public final AnonymousClass0eK A0C = new C242123Ss(this);
    public final AnonymousClass0eK A0D = new C242103Sq(this);
    public final AnonymousClass0eK A0E = new C242113Sr(this);
    public final UserSession A0F;
    public final C242093Sp A0G;

    public final synchronized C270924hc A02() {
        C270924hc r2;
        r2 = this.A04;
        if (r2 == null) {
            Context context = this.A0B;
            r2 = new C270924hc(context, (LocationManager) context.getSystemService("location"));
            this.A04 = r2;
        }
        return r2;
    }

    public final synchronized C270914hb A03() {
        C270914hb r0;
        if (Build.VERSION.SDK_INT >= 29) {
            r0 = this.A05;
            if (r0 == null) {
                Context context = this.A0B;
                synchronized (C270914hb.class) {
                    r0 = C270914hb.A04;
                    if (r0 == null) {
                        r0 = new C270914hb(context);
                        C270914hb.A04 = r0;
                    }
                }
                this.A05 = r0;
            }
        } else {
            r0 = null;
        }
        return r0;
    }

    public final synchronized C270964hg A04() {
        C270964hg r3;
        synchronized (this) {
            r3 = this.A06;
            if (r3 == null) {
                C270924hc A022 = A02();
                LocationManager locationManager = (LocationManager) this.A0B.getSystemService("location");
                C270934hd r6 = this.A02;
                if (r6 == null) {
                    r6 = new C270934hd(AnonymousClass0Gt.A00, RealtimeSinceBootClock.A00);
                    this.A02 = r6;
                }
                C242093Sp r9 = this.A0G;
                r3 = new C270964hg(locationManager, A022, r6, 02m.A0p, A08(), r9);
                this.A06 = r3;
            }
        }
        return r3;
    }

    public final AnonymousClass6UF A06() {
        O5V o5v;
        synchronized (this) {
            o5v = this.A01;
            if (o5v == null) {
                o5v = new O5V(AnonymousClass1DA.A00(this.A0B, new C13181TOn(A08())));
                this.A01 = o5v;
            }
        }
        return new AnonymousClass6UF(o5v, A07(), A09(), this.A0D, this.A0E, this.A0C);
    }

    public final synchronized C276264sw A07() {
        C276264sw r0;
        r0 = this.A07;
        if (r0 == null) {
            Context context = this.A0B;
            AnonymousClass0Gt r2 = AnonymousClass0Gt.A00;
            RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
            r0 = new C276264sw(context, r2, realtimeSinceBootClock, A03(), new C276244su(context), new C276254sv(r2, realtimeSinceBootClock), A09());
            this.A07 = r0;
        }
        return r0;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.4he, java.lang.Object] */
    public final synchronized C270944he A08() {
        C270944he r2;
        C270914hb A032 = A03();
        C270944he r22 = this.A08;
        r2 = r22;
        if (r22 == null) {
            UserSession userSession = this.A0F;
            ? obj = new Object();
            obj.A01 = AnonymousClass0kN.A01(new C270954hf(obj), userSession);
            obj.A00 = A032;
            this.A08 = obj;
            r2 = obj;
        }
        return r2;
    }

    public final synchronized ScheduledExecutorService A09() {
        1Ta r1;
        r1 = this.A09;
        if (r1 == null) {
            r1 = new 1Ta(new Handler(C64021Cb.A00()));
            this.A09 = r1;
        }
        return r1;
    }

    public final synchronized ScheduledExecutorService A0A() {
        1Ta r1;
        r1 = this.A0A;
        if (r1 == null) {
            r1 = new 1Ta(new Handler(Looper.getMainLooper()));
            this.A0A = r1;
        }
        return r1;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.RVb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v2, types: [X.RQN, java.lang.Object] */
    public final Q0H A05() {
        C59560Zm r0;
        RQN rqn;
        C273354mO r8;
        C270924hc A022 = A02();
        AnonymousClass0Gt r5 = AnonymousClass0Gt.A00;
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        ScheduledExecutorService A092 = A09();
        ScheduledExecutorService A0A2 = A0A();
        Context context = this.A0B;
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        C270964hg A042 = A04();
        synchronized (1x2.class) {
            1x2 r02 = 1x2.A06;
            if (r02 != null) {
                r0 = (C59560Zm) r02.A01.A03;
            } else {
                r0 = null;
            }
        }
        if (r0 != null) {
            01r r03 = r0.A00;
            ? obj = new Object();
            obj.A00 = (AnonymousClass0Xp) ((AnonymousClass0Bt) r03.get(0Xx.class));
            rqn = obj;
        } else {
            rqn = null;
        }
        ? obj2 = new Object();
        C270914hb A032 = A03();
        C270944he A082 = A08();
        C242093Sp r15 = this.A0G;
        if (Build.VERSION.SDK_INT >= 29) {
            r8 = C273354mO.A00(context);
        } else {
            r8 = null;
        }
        return new Q0H(locationManager, r5, realtimeSinceBootClock, A022, r8, A032, obj2, A042, 02m.A0p, rqn, A082, r15, A0A2, A092);
    }

    public C242073Sn(Context context, UserSession userSession) {
        this.A0B = context;
        this.A0F = userSession;
        this.A0G = new C242093Sp(userSession);
    }

    public static C242073Sn A00(Context context, UserSession userSession) {
        return (C242073Sn) userSession.A01(C242073Sn.class, new C242083So(context.getApplicationContext(), userSession));
    }

    public final BleScanOperation A01() {
        S3S s3s;
        T77 t77;
        ScheduledExecutorService A092 = A09();
        Context context = this.A0B;
        synchronized (this) {
            s3s = this.A00;
            if (s3s == null) {
                AnonymousClass0Gt r3 = AnonymousClass0Gt.A00;
                RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
                if (Build.VERSION.SDK_INT >= 29) {
                    t77 = this.A03;
                    if (t77 == null) {
                        t77 = new T77();
                        this.A03 = t77;
                    }
                } else {
                    t77 = null;
                }
                s3s = new S3S(r3, realtimeSinceBootClock, t77);
                this.A00 = s3s;
            }
        }
        return new BleScanOperation(context, s3s, A092);
    }
}
