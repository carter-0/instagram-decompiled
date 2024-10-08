package X;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Pt  reason: invalid class name and case insensitive filesystem */
public final class C307346Pt extends FrameLayout {
    public List A00 = new ArrayList();
    public final C307326Pr A01;
    public final C58840Ae A02;
    public final AnonymousClass9I8 A03;
    public final C307336Ps A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C307346Pt(Context context, C307326Pr r3, C58840Ae r4, AnonymousClass9I8 r5, C307336Ps r6, List list) {
        super(context);
        0qQ.A0B(list, 2);
        this.A04 = r6;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
        A01((String) null, (String) null, list);
    }

    private final FrameLayout.LayoutParams A00(C53277GlP glP) {
        float f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        float f2 = glP.A00;
        layoutParams.setMarginStart(AnonymousClass1GB.A01(((float) getWidth()) * f2));
        Number number = (Number) glP.A03;
        if (number != null) {
            f2 = 1.0f - number.floatValue();
        }
        layoutParams.setMarginEnd(AnonymousClass1GB.A01(((float) getWidth()) * f2));
        layoutParams.topMargin = AnonymousClass1GB.A01(((float) getHeight()) * glP.A01);
        Number number2 = (Number) glP.A04;
        if (number2 != null) {
            f = 1.0f - number2.floatValue();
        } else {
            f = 0.0f;
        }
        layoutParams.bottomMargin = (int) (((float) getHeight()) * f);
        return layoutParams;
    }

    public final void A01(String str, String str2, List list) {
        List<C74220Pr7> list2 = this.A00;
        for (C74220Pr7 pr7 : list2) {
            removeView(((C68630NQj) pr7).A03);
        }
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass9JF r9 = (AnonymousClass9JF) it.next();
            Context context = getContext();
            0qQ.A07(context);
            AnonymousClass9I8 r8 = this.A03;
            C58840Ae r7 = this.A02;
            0qQ.A0B(r9, 1);
            0qQ.A0B(r8, 2);
            C68630NQj nQj = new C68630NQj(context, r7, r8, r9, str, str2);
            C307326Pr r0 = this.A01;
            if (r0 != null) {
                nQj.A01 = r0;
            }
            addView(nQj.A03, A00((C53277GlP) r9.A01));
            list2.add(nQj);
        }
        A02(false, 0.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(boolean r8, float r9) {
        /*
            r7 = this;
            java.util.List r0 = r7.A00
            java.util.Iterator r6 = r0.iterator()
        L_0x0006:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r5 = r6.next()
            X.Pr7 r5 = (X.C74220Pr7) r5
            X.NQj r5 = (X.C68630NQj) r5
            X.9JF r0 = r5.A06
            java.lang.Object r2 = r0.A03
            X.JVf r2 = (X.C59721JVf) r2
            if (r2 == 0) goto L_0x0046
            java.lang.Object r0 = r2.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0046
            long r0 = r0.longValue()
            float r4 = (float) r0
        L_0x0027:
            java.lang.Object r0 = r2.A00
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x004a
            long r0 = r0.longValue()
            float r3 = (float) r0
        L_0x0032:
            android.view.View r2 = r5.A03
            r1 = 0
            if (r8 != 0) goto L_0x0043
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0043
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0043
        L_0x003f:
            r2.setVisibility(r1)
            goto L_0x0006
        L_0x0043:
            r1 = 8
            goto L_0x003f
        L_0x0046:
            r4 = 0
            if (r2 == 0) goto L_0x004a
            goto L_0x0027
        L_0x004a:
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto L_0x0032
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C307346Pt.A02(boolean, float):void");
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            for (C74220Pr7 pr7 : this.A00) {
                C68630NQj nQj = (C68630NQj) pr7;
                nQj.A03.setLayoutParams(A00((C53277GlP) nQj.A06.A01));
            }
        }
    }
}
