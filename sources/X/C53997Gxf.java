package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: X.Gxf  reason: case insensitive filesystem */
public final class C53997Gxf extends C251253mo {
    @Prop(optional = false, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public int A00;
    @Prop(optional = false, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public int A01;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public 1U1 A02;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public Object A03;
    @Prop(optional = true, resType = C54606HKp.A0A, varArg = "uri")
    @Comparable(type = 5)
    public List A04 = Collections.emptyList();
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A05 = true;

    public final boolean A0P() {
        return true;
    }

    public final boolean A11() {
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
            if (r4 == r5) goto L_0x0054
            r2 = 0
            if (r5 == 0) goto L_0x001e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x001e
            X.Gxf r5 = (X.C53997Gxf) r5
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
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x001e
            X.1U1 r1 = r4.A02
            X.1U1 r0 = r5.A02
            if (r1 == 0) goto L_0x0035
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0038
            return r2
        L_0x0035:
            if (r0 == 0) goto L_0x0038
            return r2
        L_0x0038:
            boolean r1 = r4.A05
            boolean r0 = r5.A05
            if (r1 != r0) goto L_0x001e
            int r1 = r4.A01
            int r0 = r5.A01
            if (r1 != r0) goto L_0x001e
            java.util.List r1 = r4.A04
            java.util.List r0 = r5.A04
            if (r1 == 0) goto L_0x0051
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0054
            return r2
        L_0x0051:
            if (r0 == 0) goto L_0x0054
            return r2
        L_0x0054:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53997Gxf.A18(X.3mp, boolean):boolean");
    }

    public C53997Gxf() {
        super("FrescoVitoSlideshowComponent");
    }

    public final Integer A0G() {
        return AnonymousClass05K.A01;
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

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2TB, java.lang.Object] */
    public final /* bridge */ /* synthetic */ 2TB A0f() {
        return new Object();
    }

    /* JADX WARNING: type inference failed for: r19v1, types: [java.lang.Object, X.0rk] */
    public final void A0t(2V1 r29, C70672Tq r30, Object obj) {
        2V1 r11 = r29;
        C54006Gxo A0e = C51969G9p.A0e(r11);
        C53220GkU gkU = (C53220GkU) obj;
        List list = this.A04;
        int i = this.A01;
        int i2 = this.A00;
        boolean z = this.A05;
        1U1 r15 = this.A02;
        Object obj2 = this.A03;
        ContextChain contextChain = (ContextChain) r11.A05(ContextChain.class);
        int i3 = A0e.A00;
        Timer timer = A0e.A01;
        boolean z2 = A0e.A02;
        AnonymousClass7TG.A1O(gkU, list);
        0qQ.A0B(timer, 12);
        1Tq A002 = C226722hk.A00();
        int i4 = gkU.A00 - 1;
        int length = gkU.A04.length;
        C226742hm r0 = (C226742hm) gkU.A02((i4 + length) % length);
        if (r0 != null) {
            A002.ECf(r0);
            C226742hm r02 = (C226742hm) gkU.A02(gkU.A00);
            if (r02 != null) {
                A002.ECf(r02);
                A002.ECf(gkU.A05());
                TimerTask timerTask = gkU.A01;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                gkU.A01 = null;
                UIU.A00(gkU);
                gkU.invalidateSelf();
                gkU.A00 = 0;
                gkU.A01 = i2;
                if (gkU.A03 == 1) {
                    gkU.A03 = 0;
                }
                Resources A0A = AnonymousClass7TF.A0A(r11.A0C);
                HSG.A00(A0A, (Uri) list.get(i3 % list.size()), contextChain, gkU, r15, obj2);
                gkU.A06();
                gkU.A03 = 2;
                for (int i5 = 0; i5 < gkU.A0C.length; i5++) {
                    int[] iArr = gkU.A08;
                    int i6 = 0;
                    if (gkU.A0A[i5]) {
                        i6 = 255;
                    }
                    iArr[i5] = i6;
                }
                gkU.invalidateSelf();
                int size = list.size();
                if (z) {
                    if (!z2) {
                        int i7 = (i3 + 1) % size;
                        HSG.A00(A0A, (Uri) list.get(i7), contextChain, gkU, r15, obj2);
                        2V1 r16 = r11;
                        C53220GkU gkU2 = gkU;
                        ContextChain contextChain2 = contextChain;
                        C58049Ikh ikh = new C58049Ikh(AnonymousClass7TF.A0D(), new C57988Ijh(contextChain2, gkU2, r15, r16, obj2, list, new Object(), i7, size));
                        gkU.A01 = ikh;
                        timer.scheduleAtFixedRate(ikh, (long) i, (long) (i + i2));
                    }
                } else if (z2) {
                    TimerTask timerTask2 = gkU.A01;
                    if (timerTask2 != null) {
                        timerTask2.cancel();
                    }
                    if (r11.A01 != null) {
                        r11.A0A(new C294145lv(C51968G9o.A1b(false), AnonymousClass972.MUTABLE_FLAG_MASK));
                    }
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void A0v(2V1 r5, C70672Tq r6, Object obj) {
        C53220GkU gkU = (C53220GkU) obj;
        AnonymousClass7TF.A1H(r5, gkU);
        1Tq A002 = C226722hk.A00();
        int i = gkU.A00 - 1;
        int length = gkU.A04.length;
        C226742hm r0 = (C226742hm) gkU.A02((i + length) % length);
        if (r0 != null) {
            A002.ECf(r0);
            C226742hm r02 = (C226742hm) gkU.A02(gkU.A00);
            if (r02 != null) {
                A002.ECf(r02);
                A002.ECf(gkU.A05());
                TimerTask timerTask = gkU.A01;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                gkU.A01 = null;
                UIU.A00(gkU);
                gkU.invalidateSelf();
                gkU.A00 = 0;
                if (r5.A01 != null) {
                    r5.A0A(new C294145lv(C51968G9o.A1b(false), AnonymousClass972.MUTABLE_FLAG_MASK));
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A0w(2V1 r3, 2TB r4) {
        C54006Gxo gxo = (C54006Gxo) r4;
        Timer timer = new Timer("Fresco Vito slideshow timer");
        gxo.A00 = 0;
        gxo.A01 = timer;
        gxo.A02 = false;
    }

    public final Object A0H(Context context) {
        return new UIU(new Drawable[]{C226722hk.A00().ALv(), C226722hk.A00().ALv(), C226722hk.A00().ALv()}, -1);
    }
}
