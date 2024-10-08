package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.7t5  reason: invalid class name and case insensitive filesystem */
public final class C345197t5 {
    public C345747u1 A00;
    public C345757u2 A01;
    public C344767sO A02;
    public C361848gv A03;
    public C345547th A04;
    public C345237tA A05;
    public C340407lD A06;
    public final C345207t6 A07;
    public final C344337rh A08;
    public final int A09;
    public final C344647sC A0A;

    /* JADX WARNING: type inference failed for: r0v6, types: [X.7lD, java.lang.Object] */
    public final void A00() {
        C345757u2 r3 = this.A01;
        C345547th r2 = this.A04;
        if (r2 != null && r2.CKQ() && r3 != null) {
            View Bf9 = r2.Bf9();
            0qQ.A07(Bf9);
            C380729Zh r32 = (C380729Zh) r3;
            r32.A03 = Bf9;
            Bf9.setOnTouchListener(r32.A09);
            C345747u1 r33 = this.A00;
            if (r33 != null) {
                View Bf92 = r2.Bf9();
                C340407lD r1 = r33.A00;
                if (r1 == null) {
                    WeakReference weakReference = new WeakReference(Bf92);
                    ? obj = new Object();
                    obj.A00 = weakReference;
                    r33.A00 = obj;
                } else {
                    r1.A01(new WeakReference(Bf92));
                }
                C340407lD r34 = r33.A00;
                0qQ.A07(r34);
                C344767sO r22 = this.A02;
                if (r22 != null) {
                    C344767sO.A05(r22, new C371588ye(r34), (C345237tA) null);
                    this.A06 = r34;
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A01(C345177t3 r5, C345187t4 r6, C344767sO r7) {
        this.A02 = r7;
        if (r5 != null) {
            r7.A03 = r5;
        }
        if (r6 != null) {
            r7.A04 = r6;
        }
        C344647sC r3 = this.A0A;
        if (r3 != null) {
            Handler handler = r3.A01;
            if (handler.getLooper() != Looper.myLooper()) {
                handler.sendMessage(Message.obtain(r3.A04.A00, 4, r7));
            } else {
                C344647sC.A00(r7, r3);
            }
            r7.A08 = true;
            r7.A01 = this.A09;
        }
    }

    public C345197t5(C344647sC r2, int i) {
        this.A0A = r2;
        this.A09 = i;
        this.A07 = new C345207t6(this);
        this.A08 = new C345217t7(this);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.8gx] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.7tA] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.util.List r5) {
        /*
            r4 = this;
            java.util.Iterator r1 = r5.iterator()
        L_0x0004:
            boolean r0 = r1.hasNext()
            r3 = 0
            if (r0 == 0) goto L_0x0030
            java.lang.Object r2 = r1.next()
            X.8gx r2 = (X.C361868gx) r2
            boolean r0 = r2 instanceof X.C361848gv
            if (r0 == 0) goto L_0x0004
            r1 = r2
            X.8gv r1 = (X.C361848gv) r1
            boolean r0 = r2 instanceof X.C345237tA
            if (r0 == 0) goto L_0x001f
            X.7tA r2 = (X.C345237tA) r2
            r3 = r2
        L_0x001f:
            r0 = r3
            r3 = r1
        L_0x0021:
            r4.A03 = r3
            r4.A05 = r0
            X.7sO r2 = r4.A02
            if (r2 == 0) goto L_0x003e
            android.os.Handler r0 = r2.A02
            if (r0 != 0) goto L_0x0032
            r2.A07 = r5
            return
        L_0x0030:
            r0 = r3
            goto L_0x0021
        L_0x0032:
            r1 = 0
            r2.A07 = r1
            X.8gz r0 = new X.8gz
            r0.<init>(r5)
            X.C344767sO.A05(r2, r0, r1)
            return
        L_0x003e:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C345197t5.A02(java.util.List):void");
    }

    public C345197t5() {
        this((C344647sC) null, 0);
    }
}
