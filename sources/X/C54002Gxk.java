package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;
import java.util.Map;

/* renamed from: X.Gxk  reason: case insensitive filesystem */
public final class C54002Gxk extends C251253mo {
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public Uri A00;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public 1U1 A01;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public Integer A02 = C55302HfV.A00;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public Object A03;

    public final boolean A0N() {
        return true;
    }

    public final boolean A0O() {
        return true;
    }

    public final boolean A0P() {
        return true;
    }

    public final void A0i(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, 2V1 r4, C70672Tq r5) {
        0qQ.A0B(accessibilityNodeInfoCompat, 2);
        accessibilityNodeInfoCompat.setClassName(C273654mx.A00(118));
    }

    public final void A0o(2V1 r5) {
        1TY r0 = null;
        r5.A05(ContextChain.class);
        Integer num = this.A02;
        A00(r5);
        Boolean A0u = AnonymousClass7TE.A0u();
        C226722hk.A02();
        C226722hk.A02();
        if (num == null) {
            num = AnonymousClass05K.A00;
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            synchronized (C226722hk.class) {
                AnonymousClass1Ts.A01.Bel();
            }
            r0 = AnonymousClass1TW.A00;
        } else if (intValue != 2) {
            C226722hk.A02();
        }
        2Vz r1 = r5.A05;
        r1.getClass();
        ((IIQ) r1.A05).A00 = r0;
        2Vz r02 = r5.A05;
        r02.getClass();
        ((IIQ) r02.A05).A01 = A0u;
    }

    public final void A0r(2V1 r8, C70672Tq r9, 2Tc r10) {
        int i;
        int i2;
        r8.A05(ContextChain.class);
        1U1 r1 = this.A01;
        r8.A05.getClass();
        boolean A1X = DbW.A1X(r10);
        if (r1 == null) {
            C226722hk.A02();
        }
        int A05 = r10.A05();
        int A002 = r10.A00();
        if (r10.A00) {
            i = r10.A02() + r10.A03();
            i2 = r10.A04() + r10.A01();
        } else {
            i = 0;
            i2 = 0;
        }
        Rect rect = new Rect(A1X ? 1 : 0, A1X, A05 - i, A002 - i2);
        C226722hk.A02();
        IIL iil = (IIL) r9;
        iil.A00 = rect;
        iil.A02 = null;
        iil.A01 = null;
    }

    public final boolean A12() {
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
            if (r4 == r5) goto L_0x005a
            r2 = 0
            if (r5 == 0) goto L_0x001e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x001e
            X.Gxk r5 = (X.C54002Gxk) r5
            java.lang.Object r1 = r4.A03
            java.lang.Object r0 = r5.A03
            if (r1 == 0) goto L_0x001f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0022
        L_0x001e:
            return r2
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            return r2
        L_0x0022:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = java.lang.Float.compare(r0, r0)
            if (r0 != 0) goto L_0x001e
            X.1U1 r1 = r4.A01
            X.1U1 r0 = r5.A01
            if (r1 == 0) goto L_0x0037
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003a
            return r2
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            return r2
        L_0x003a:
            java.lang.Integer r1 = r4.A02
            java.lang.Integer r0 = r5.A02
            if (r1 == 0) goto L_0x0047
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004a
            return r2
        L_0x0047:
            if (r0 == 0) goto L_0x004a
            return r2
        L_0x004a:
            android.net.Uri r1 = r4.A00
            android.net.Uri r0 = r5.A00
            if (r1 == 0) goto L_0x0057
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005a
            return r2
        L_0x0057:
            if (r0 == 0) goto L_0x005a
            return r2
        L_0x005a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54002Gxk.A18(X.3mp, boolean):boolean");
    }

    public final boolean AFh() {
        return true;
    }

    public final int E2z() {
        return 15;
    }

    public C54002Gxk() {
        super("FrescoVitoImage2");
    }

    public final Integer A0G() {
        return AnonymousClass05K.A01;
    }

    public final boolean A0T(C251263mp r7, C251263mp r8, 2TB r9, 2TB r10) {
        Uri uri;
        Uri uri2;
        1U1 r2;
        Float A0h;
        C54002Gxk gxk = (C54002Gxk) r7;
        C54002Gxk gxk2 = (C54002Gxk) r8;
        Float f = null;
        if (gxk == null) {
            uri = null;
        } else {
            uri = gxk.A00;
        }
        if (gxk2 == null) {
            uri2 = null;
        } else {
            uri2 = gxk2.A00;
        }
        1U1 r3 = null;
        if (gxk != null) {
            r3 = gxk.A01;
        }
        if (gxk2 == null) {
            r2 = null;
        } else {
            r2 = gxk2.A01;
        }
        if (gxk == null) {
            A0h = null;
        } else {
            A0h = C51967G9n.A0h();
        }
        if (gxk2 != null) {
            f = C51967G9n.A0h();
        }
        if (!02S.A00(uri, uri2) || !02S.A00(r3, r2) || !02S.A00(A0h, f)) {
            return true;
        }
        return false;
    }

    public final boolean A0V(2V1 r4, 2V1 r5) {
        Class<ContextChain> cls = ContextChain.class;
        if (r4.A05(cls) != null) {
            if (!r4.A05(cls).equals(r5.A05(cls))) {
                return false;
            }
            return true;
        } else if (r5.A05(cls) != null) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2Tq, java.lang.Object] */
    public final /* bridge */ /* synthetic */ C70672Tq A0d() {
        return new Object();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.57n] */
    public final /* bridge */ /* synthetic */ C2814157n A0e() {
        return new Object();
    }

    public final void A0q(2V1 r3, C70672Tq r4, AnonymousClass2T3 r5, 2Tc r6, int i, int i2) {
        0qQ.A0B(r5, 4);
        C253713rG.A01(r5, 1.0f, i, i2);
    }

    public final void A0s(2V1 r14, C70672Tq r15, Object obj) {
        C226742hm r8 = (C226742hm) obj;
        Object obj2 = this.A03;
        ContextChain contextChain = (ContextChain) r14.A05(ContextChain.class);
        C226732hl A002 = A00(r14);
        IIL iil = (IIL) r15;
        C226732hl r9 = iil.A02;
        2Vz r0 = r14.A05;
        r0.getClass();
        1TY r2 = ((IIQ) r0.A05).A00;
        1TY r1 = iil.A01;
        Rect rect = iil.A00;
        C51969G9p.A1N(r8, 1, rect);
        if (r9 == null) {
            r9 = A002;
        }
        1Tq A003 = C226722hk.A00();
        0qQ.A0A(r9);
        A003.AUi(rect, contextChain, (AnonymousClass6QN) null, (JLT) null, r8, r9, (C226702hi) null, (AnonymousClass579) null, obj2);
        if (r2 != null) {
            r2.A04();
        }
        if (r1 != null) {
            r1.A04();
        }
    }

    public final void A0t(2V1 r14, C70672Tq r15, Object obj) {
        C226742hm r8 = (C226742hm) obj;
        Object obj2 = this.A03;
        C226732hl A002 = A00(r14);
        IIL iil = (IIL) r15;
        C226732hl r9 = iil.A02;
        2Vz r0 = r14.A05;
        r0.getClass();
        1TY r2 = ((IIQ) r0.A05).A00;
        1TY r1 = iil.A01;
        Rect rect = iil.A00;
        ContextChain contextChain = (ContextChain) r14.A05(ContextChain.class);
        C51969G9p.A1N(r8, 1, rect);
        if (r9 == null) {
            r9 = A002;
        }
        r8.Edp(true);
        C226722hk.A02();
        C226722hk.A02();
        1Tq A003 = C226722hk.A00();
        0qQ.A0A(r9);
        A003.AUi(rect, contextChain, (AnonymousClass6QN) null, (JLT) null, r8, r9, (C226702hi) null, (AnonymousClass579) null, obj2);
        if (r2 != null) {
            r2.A04();
        }
        if (r1 != null) {
            r1.A04();
        }
    }

    public final void A0u(2V1 r4, C70672Tq r5, Object obj) {
        C226742hm r6 = (C226742hm) obj;
        2Vz r0 = r4.A05;
        r0.getClass();
        1TY r2 = ((IIQ) r0.A05).A00;
        1TY r1 = ((IIL) r5).A01;
        0qQ.A0B(r6, 1);
        C226722hk.A02();
        C226722hk.A00().ECa(r6);
        if (r2 != null) {
            r2.A04();
        }
        if (r1 != null) {
            r1.A04();
        }
    }

    public final void A0v(2V1 r4, C70672Tq r5, Object obj) {
        C226742hm r6 = (C226742hm) obj;
        2Vz r0 = r4.A05;
        r0.getClass();
        1TY r2 = ((IIQ) r0.A05).A00;
        1TY r1 = ((IIL) r5).A01;
        0qQ.A0B(r6, 1);
        C226722hk.A02();
        C226722hk.A00().ECM(r6);
        if (r2 != null) {
            r2.A04();
        }
        if (r1 != null) {
            r1.A04();
        }
    }

    public final void A0x(C70672Tq r2, C70672Tq r3) {
        IIL iil = (IIL) r2;
        IIL iil2 = (IIL) r3;
        iil.A01 = iil2.A01;
        iil.A02 = iil2.A02;
        iil.A00 = iil2.A00;
    }

    public final void A0y(C2814157n r2, C2814157n r3) {
        IIQ iiq = (IIQ) r2;
        IIQ iiq2 = (IIQ) r3;
        iiq.A01 = iiq2.A01;
        iiq.A00 = iiq2.A00;
    }

    private C226732hl A00(2V1 r10) {
        C226662he r0;
        String A08 = r10.A08();
        C56034Hrh hrh = new C56034Hrh(this.A00, this.A01, this.A03, A08);
        C226732hl r02 = (C226732hl) r10.A07(hrh, A08, 0);
        if (r02 != null) {
            return r02;
        }
        Uri uri = this.A00;
        1U1 r3 = this.A01;
        if (r3 == null) {
            C226722hk.A02();
        }
        C226722hk.A02();
        1TS A012 = C226722hk.A01();
        Resources A0A = AnonymousClass7TF.A0A(r10.A0C);
        if (uri != null) {
            r0 = AnonymousClass6QK.A00(uri, (Map) null);
        } else {
            r0 = AnonymousClass6QU.A00;
        }
        C226732hl A022 = A012.A02(A0A, r3, r0, false);
        r10.A0D(hrh, A022, A08, 0);
        return A022;
    }

    public final /* bridge */ /* synthetic */ C251263mp A0E() {
        return super.A0E();
    }

    public final Object A0H(Context context) {
        return C226722hk.A00().ALv();
    }
}
