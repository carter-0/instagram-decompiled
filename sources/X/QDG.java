package X;

import android.content.DialogInterface;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class QDG extends 2YL {
    public int A00 = 0;
    public int A01 = 0;
    public DialogInterface.OnClickListener A02;
    public C10504RtJ A03;
    public RLE A04;
    public SR5 A05;
    public C10714Rws A06;
    public C10505RtK A07;
    public AnonymousClass2Fj A08;
    public AnonymousClass2Fj A09;
    public AnonymousClass2Fj A0A;
    public AnonymousClass2Fj A0B;
    public AnonymousClass2Fj A0C;
    public AnonymousClass2Fj A0D;
    public AnonymousClass2Fj A0E;
    public AnonymousClass2Fj A0F;
    public CharSequence A0G;
    public Executor A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L = true;
    public boolean A0M;
    public boolean A0N;

    public final int A01() {
        C10714Rws rws = this.A06;
        if (rws == null) {
            return 0;
        }
        SR5 sr5 = this.A05;
        int i = rws.A00;
        if (i != 0) {
            return i;
        }
        if (sr5 != null) {
            return 15;
        }
        return 255;
    }

    public final void A02(int i) {
        AnonymousClass2Fj r1 = this.A0C;
        if (r1 == null) {
            r1 = JTO.A0K();
            this.A0C = r1;
        }
        A00(r1, Integer.valueOf(i));
    }

    public final void A03(CharSequence charSequence) {
        AnonymousClass2Fj r0 = this.A0B;
        if (r0 == null) {
            r0 = JTO.A0K();
            this.A0B = r0;
        }
        A00(r0, charSequence);
    }

    public final void A04(boolean z) {
        AnonymousClass2Fj r1 = this.A0F;
        if (r1 == null) {
            r1 = JTO.A0K();
            this.A0F = r1;
        }
        A00(r1, Boolean.valueOf(z));
    }

    public static void A00(AnonymousClass2Fj r2, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            r2.A0B(obj);
        } else {
            r2.A0A(obj);
        }
    }
}
