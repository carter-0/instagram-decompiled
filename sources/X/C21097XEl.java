package X;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.XEl  reason: case insensitive filesystem */
public final class C21097XEl implements C341147mP {
    public long A00;
    public final XF0 A01;
    public final Handler A02;
    public final Runnable A03;
    public volatile Choreographer A04;
    public volatile C341127mN A05;
    public volatile Long A06;
    public volatile boolean A07;

    public final void DGm() {
        DGn((Long) null);
    }

    public final void stop() {
        this.A07 = true;
        this.A05 = null;
    }

    public static void A00(C21097XEl xEl) {
        if (xEl.A04 == null) {
            xEl.A02.post(xEl.A03);
        } else {
            xEl.A03.run();
        }
    }

    public final void DGn(Long l) {
        if (this.A06 != null) {
            A00(this);
            return;
        }
        C341127mN r0 = this.A05;
        if (r0 != null) {
            r0.EEt(l);
        }
    }

    public final void DGq() {
        if (this.A06 != null) {
            A00(this);
        }
    }

    public final void Env(Integer num) {
        Long valueOf;
        if (num == null) {
            valueOf = null;
        } else {
            int intValue = num.intValue();
            if (intValue > 0) {
                valueOf = Long.valueOf(TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS) / ((long) intValue));
            } else {
                throw AnonymousClass7TE.A0w("Target FPS must be greater than 0");
            }
        }
        this.A06 = valueOf;
    }

    public final void EwL(C341127mN r2) {
        this.A05 = r2;
        this.A07 = false;
    }

    public C21097XEl(Handler handler) {
        this.A07 = false;
        this.A03 = new XF1(this);
        this.A01 = new XF0(this);
        this.A02 = handler;
    }

    public C21097XEl() {
        this.A07 = false;
        this.A03 = new XF1(this);
        this.A01 = new XF0(this);
        this.A02 = AnonymousClass7TF.A0D();
    }
}
