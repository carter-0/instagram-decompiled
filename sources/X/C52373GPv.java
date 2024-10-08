package X;

import android.content.Context;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;
import com.instagram.android.R;

/* renamed from: X.GPv  reason: case insensitive filesystem */
public final class C52373GPv extends C251253mo {
    @Prop(optional = false, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public AnonymousClass6SH A00;
    @Prop(optional = false, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public C307786Rm A01;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public GY2 A02;

    public final boolean A0N() {
        return true;
    }

    public final boolean A0O() {
        return true;
    }

    public final boolean A0P() {
        return true;
    }

    public final boolean A0z() {
        return true;
    }

    public final boolean A10() {
        return true;
    }

    public final boolean A11() {
        return true;
    }

    public final boolean A16() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1.equals(r0) == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A18(X.C251263mp r5, boolean r6) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0042
            r2 = 0
            if (r5 == 0) goto L_0x001e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x001e
            X.GPv r5 = (X.C52373GPv) r5
            X.6Rm r1 = r4.A01
            X.6Rm r0 = r5.A01
            if (r1 == 0) goto L_0x001f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0022
        L_0x001e:
            return r2
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            return r2
        L_0x0022:
            X.6SH r1 = r4.A00
            X.6SH r0 = r5.A00
            if (r1 == 0) goto L_0x002f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0032
            return r2
        L_0x002f:
            if (r0 == 0) goto L_0x0032
            return r2
        L_0x0032:
            X.GY2 r1 = r4.A02
            X.GY2 r0 = r5.A02
            if (r1 == 0) goto L_0x003f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0042
            return r2
        L_0x003f:
            if (r0 == 0) goto L_0x0042
            return r2
        L_0x0042:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52373GPv.A18(X.3mp, boolean):boolean");
    }

    public C52373GPv() {
        super("BloksRenderComponent");
    }

    public final Integer A0G() {
        return AnonymousClass05K.A0C;
    }

    public final Object A0H(Context context) {
        return new C299015uR(context);
    }

    public final boolean A0T(C251263mp r4, C251263mp r5, 2TB r6, 2TB r7) {
        C307786Rm r0;
        AnonymousClass6SH r1;
        C52373GPv gPv = (C52373GPv) r4;
        C52373GPv gPv2 = (C52373GPv) r5;
        AnonymousClass6SH r2 = null;
        if (gPv2 == null) {
            r0 = null;
        } else {
            r0 = gPv2.A01;
        }
        if (gPv == null) {
            r1 = null;
        } else {
            r1 = gPv.A00;
        }
        if (gPv2 != null) {
            r2 = gPv2.A00;
        }
        if (C307476Qg.A0B(r0) || !Q06.A00(r1, r2)) {
            return true;
        }
        return false;
    }

    public final boolean A0V(2V1 r3, 2V1 r4) {
        Class<C299055uV> cls = C299055uV.class;
        if (r3.A05(cls) != null) {
            r3.A05(cls);
            r4.A05(cls);
            throw AnonymousClass7TE.A11("equals");
        } else if (r4.A05(cls) != null) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2Tq, java.lang.Object] */
    public final /* bridge */ /* synthetic */ C70672Tq A0d() {
        return new Object();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2TB, java.lang.Object] */
    public final /* bridge */ /* synthetic */ 2TB A0f() {
        return new Object();
    }

    public final void A0q(2V1 r16, C70672Tq r17, AnonymousClass2T3 r18, 2Tc r19, int i, int i2) {
        C307556Qo r0;
        C70672Tq r2 = r17;
        2V1 r3 = r16;
        AnonymousClass6SH r9 = this.A00;
        C307786Rm r10 = this.A01;
        C307996Sh r8 = C51969G9p.A0e(r3).A01.A00;
        if (r10 == null) {
            r0 = null;
        } else {
            r0 = (C307556Qo) r10.A01.get(R.id.bk_context_key_performance_logger);
        }
        int andIncrement = AnonymousClass6S8.A03.getAndIncrement();
        if (r0 != null) {
            r0.AT5(6, andIncrement);
            r0.AT0(6, andIncrement, "instance", andIncrement);
        }
        Context context = r3.A0C;
        C245603dB[] A002 = C307806Ro.A00(r10);
        if (C307476Qg.A0B(r10)) {
            r8 = null;
        }
        C308006Si r6 = C307996Sh.A04;
        AnonymousClass7TG.A1N(context, r9);
        C307996Sh A022 = r6.A02(context, r8, r9, r10, A002, -1, C244873bt.A00(i, i2));
        if (r0 != null) {
            r0.AT4(6, andIncrement);
        }
        C245663dH r1 = A022.A01;
        AnonymousClass2T3 r4 = r18;
        r4.A01 = r1.A01();
        r4.A00 = r1.A00();
        ((IIK) r2).A00 = A022;
    }

    public final void A0v(2V1 r3, C70672Tq r4, Object obj) {
        r3.A05.getClass();
        C299015uR r5 = (C299015uR) obj;
        r3.A05(C299055uV.class);
        r5.A00.post(r5.A01);
    }

    public final void A0w(2V1 r4, 2TB r5) {
        C54005Gxn gxn = (C54005Gxn) r5;
        C307786Rm r2 = this.A01;
        C55712Hm9 hm9 = new C55712Hm9(this.A02);
        C14299TtZ ttZ = new C14299TtZ(r2);
        gxn.A01 = hm9;
        gxn.A00 = ttZ;
    }

    public final void A0x(C70672Tq r2, C70672Tq r3) {
        IIK iik = (IIK) r2;
        IIK iik2 = (IIK) r3;
        iik.A00 = iik2.A00;
        iik.A01 = iik2.A01;
    }

    public final /* bridge */ /* synthetic */ C251263mp A0E() {
        return super.A0E();
    }

    public final void A0l(2V1 r4) {
        AnonymousClass07Y r2 = C51969G9p.A0e(r4).A00;
        Context context = r4.A0C;
        if (context instanceof AnonymousClass07Z) {
            ((AnonymousClass07Z) context).getLifecycle().A09(r2);
        }
    }

    public final void A0m(2V1 r4) {
        AnonymousClass07Y r2 = C51969G9p.A0e(r4).A00;
        Context context = r4.A0C;
        if (context instanceof AnonymousClass07Z) {
            ((AnonymousClass07Z) context).getLifecycle().A0A(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (r4.A01.A00() == r14.A00()) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0r(X.2V1 r12, X.C70672Tq r13, X.2Tc r14) {
        /*
            r11 = this;
            X.2TB r0 = X.C51969G9p.A0e(r12)
            X.Gxn r0 = (X.C54005Gxn) r0
            X.6SH r5 = r11.A00
            X.6Rm r6 = r11.A01
            X.Hm9 r0 = r0.A01
            X.IIK r13 = (X.IIK) r13
            X.6Sh r4 = r13.A00
            if (r4 == 0) goto L_0x005a
            X.3dH r0 = r4.A01
            int r1 = r0.A01()
            int r0 = r14.A05()
            if (r1 != r0) goto L_0x002a
            X.3dH r0 = r4.A01
            int r1 = r0.A00()
            int r0 = r14.A00()
            if (r1 == r0) goto L_0x0057
        L_0x002a:
            android.content.Context r3 = r12.A0C
            X.3dB[] r7 = X.C307806Ro.A00(r6)
            boolean r0 = X.C307476Qg.A0B(r6)
            if (r0 == 0) goto L_0x0037
            r4 = 0
        L_0x0037:
            int r0 = r14.A05()
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r0 = r14.A00()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r8 = -1
            X.6Si r2 = X.C307996Sh.A04
            X.AnonymousClass7TG.A1N(r3, r5)
            long r9 = X.C244873bt.A00(r1, r0)
            X.6Sh r4 = r2.A02(r3, r4, r5, r6, r7, r8, r9)
        L_0x0057:
            r13.A01 = r4
            return
        L_0x005a:
            X.6Sh r4 = r0.A00
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52373GPv.A0r(X.2V1, X.2Tq, X.2Tc):void");
    }

    public final void A0t(2V1 r5, C70672Tq r6, Object obj) {
        C299015uR r7 = (C299015uR) obj;
        r5.A05(C299055uV.class);
        C307996Sh r3 = ((IIK) r6).A01;
        C55712Hm9 hm9 = C51969G9p.A0e(r5).A01;
        r7.A00.removeCallbacks(r7.A01);
        synchronized (hm9.A02) {
            hm9.A00 = r3;
            GY2 gy2 = hm9.A01;
            if (gy2 != null) {
                gy2.A00(r3);
            }
        }
        r7.setRenderTree(r3.A01);
        r7.post(new C299075uX());
    }
}
