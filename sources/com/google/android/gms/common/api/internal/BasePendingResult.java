package com.google.android.gms.common.api.internal;

import X.AnonymousClass3Qk;
import X.AnonymousClass63S;
import X.AnonymousClass63X;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10266RpQ;
import X.C13633Tdz;
import X.C13634Te0;
import X.C3024063e;
import X.C50188FSu;
import X.C51965G9l;
import X.C71802Or3;
import X.C8369QpY;
import X.C8370QpZ;
import X.C8371Qpa;
import X.C8407Qtn;
import X.C8408Qto;
import X.C8409Qtp;
import X.C8410Qtq;
import X.C8432QuU;
import X.C8596Qxa;
import X.C9146RQx;
import X.Pxe;
import X.Pxf;
import android.os.Looper;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.safetynet.zza;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult extends C9146RQx {
    public static final ThreadLocal A0D = new ThreadLocal();
    public C13634Te0 A00;
    public Status A01;
    public boolean A02;
    public boolean A03 = false;
    public AnonymousClass63X A04;
    public boolean A05;
    public final C8432QuU A06;
    public final Object A07 = Pxe.A0p();
    public final WeakReference A08;
    public final ArrayList A09 = AnonymousClass7TE.A1C();
    public final CountDownLatch A0A = Pxf.A0y();
    public final AtomicReference A0B = new AtomicReference();
    public volatile boolean A0C;

    public static final AnonymousClass63X A00(BasePendingResult basePendingResult) {
        AnonymousClass63X r2;
        synchronized (basePendingResult.A07) {
            AnonymousClass3Qk.A09(!basePendingResult.A0C, "Result has already been consumed.");
            AnonymousClass3Qk.A09(AnonymousClass7TF.A1Q((basePendingResult.A0A.getCount() > 0 ? 1 : (basePendingResult.A0A.getCount() == 0 ? 0 : -1))), "Result is not ready.");
            r2 = basePendingResult.A04;
            basePendingResult.A04 = null;
            basePendingResult.A00 = null;
            basePendingResult.A0C = true;
        }
        C10266RpQ rpQ = (C10266RpQ) basePendingResult.A0B.getAndSet((Object) null);
        if (rpQ != null) {
            rpQ.A00.A01.remove(basePendingResult);
        }
        AnonymousClass3Qk.A02(r2);
        return r2;
    }

    private final void A01(AnonymousClass63X r6) {
        this.A04 = r6;
        this.A01 = r6.BzI();
        this.A0A.countDown();
        if (this.A02) {
            this.A00 = null;
        } else {
            C13634Te0 te0 = this.A00;
            if (te0 != null) {
                C8432QuU quU = this.A06;
                quU.removeMessages(2);
                AnonymousClass7TE.A1S(quU, Pxe.A0K(te0, A00(this)), 1);
            }
        }
        ArrayList arrayList = this.A09;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C13633Tdz) arrayList.get(i)).D52(this.A01);
        }
        arrayList.clear();
    }

    public final AnonymousClass63X A03(Status status) {
        if (!(this instanceof C8407Qtn)) {
            if (this instanceof C8371Qpa) {
                return ((C8371Qpa) this).A00;
            }
            if (!(this instanceof C8370QpZ)) {
                if (this instanceof C8596Qxa) {
                    return new C71802Or3(status, (zza) null);
                }
                if (this instanceof C8369QpY) {
                    return new LocationSettingsResult(status, (LocationSettingsStates) null);
                }
                if (!(this instanceof C8410Qtq) && !(this instanceof C8409Qtp) && (this instanceof C8408Qto)) {
                    return new C50188FSu((Credential) null, status);
                }
            }
        }
        return status;
    }

    public final void A04() {
        synchronized (this.A07) {
            if (!this.A02 && !this.A0C) {
                this.A02 = true;
                A01(A03(Status.A04));
            }
        }
    }

    public final void A05() {
        boolean z = true;
        if (!this.A03 && !AnonymousClass7TE.A1a(A0D.get())) {
            z = false;
        }
        this.A03 = z;
    }

    public final void A06(AnonymousClass63X r7) {
        synchronized (this.A07) {
            if (!this.A05 && !this.A02) {
                CountDownLatch countDownLatch = this.A0A;
                countDownLatch.getCount();
                AnonymousClass3Qk.A09(!AnonymousClass7TF.A1Q((countDownLatch.getCount() > 0 ? 1 : (countDownLatch.getCount() == 0 ? 0 : -1))), "Results have already been set");
                AnonymousClass3Qk.A09(!this.A0C, "Result has already been consumed");
                A01(r7);
            }
        }
    }

    public final void A07(C13634Te0 te0, TimeUnit timeUnit, long j) {
        synchronized (this.A07) {
            AnonymousClass3Qk.A09(!this.A0C, "Result has already been consumed.");
            if (!this.A02) {
                if (AnonymousClass7TF.A1Q((this.A0A.getCount() > 0 ? 1 : (this.A0A.getCount() == 0 ? 0 : -1)))) {
                    AnonymousClass7TE.A1S(this.A06, Pxe.A0K(te0, A00(this)), 1);
                } else {
                    this.A00 = te0;
                    C8432QuU quU = this.A06;
                    quU.sendMessageDelayed(quU.obtainMessage(2, this), timeUnit.toMillis(j));
                }
            }
        }
    }

    @Deprecated
    public final void A08(Status status) {
        synchronized (this.A07) {
            if (!AnonymousClass7TF.A1Q((this.A0A.getCount() > 0 ? 1 : (this.A0A.getCount() == 0 ? 0 : -1)))) {
                A06(A03(status));
                this.A05 = true;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.QuU, X.63e] */
    public BasePendingResult(AnonymousClass63S r3) {
        Looper mainLooper;
        if (r3 != null) {
            mainLooper = r3.A04();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.A06 = new C3024063e(mainLooper);
        this.A08 = C51965G9l.A0v(r3);
    }
}
