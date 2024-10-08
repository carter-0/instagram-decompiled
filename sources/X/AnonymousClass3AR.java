package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.3AR  reason: invalid class name */
public abstract class AnonymousClass3AR extends AnonymousClass3AS {
    public boolean A00 = true;

    public final boolean A0E(C241463Ph r9, C241463Ph r10, C249703kE r11) {
        int i;
        int i2;
        C249703kE r3 = r11;
        if (r9 == null || ((i = r9.A00) == (i2 = r10.A00) && r9.A01 == r10.A01)) {
            return A0R(r11);
        }
        return A0T(r3, i, r9.A01, i2, r10.A01);
    }

    public void A0M(C249703kE r1) {
    }

    public void A0N(C249703kE r1) {
    }

    public final void A0Q(C249703kE r3) {
        C328287Ef r0;
        if (this instanceof AnonymousClass4CN) {
            if (((AnonymousClass4CN) this).A01.remove(r3) != null) {
                r3.itemView.setTranslationY(0.0f);
            }
            if ((r3 instanceof C328287Ef) && (r0 = (C328287Ef) r3) != null) {
                r0.EI5();
            }
        } else if (this instanceof AnonymousClass4CS) {
            ((AnonymousClass4CS) this).A00.invoke();
        }
        A0C(r3);
    }

    public abstract boolean A0R(C249703kE r1);

    public abstract boolean A0S(C249703kE r1);

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.V3u] */
    /* JADX WARNING: type inference failed for: r0v23, types: [java.lang.Object, X.V3u] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r2.BKr().equals(r2.BzG()) != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        if (r1 != 0) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0T(X.C249703kE r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            r3 = r7
            X.4CO r3 = (X.AnonymousClass4CO) r3
            boolean r0 = r3 instanceof X.AnonymousClass4CN
            if (r0 == 0) goto L_0x0053
            X.4CN r3 = (X.AnonymousClass4CN) r3
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x004b
            boolean r0 = r8 instanceof X.AnonymousClass7PS
            if (r0 != 0) goto L_0x004b
            java.util.Map r0 = r3.A01
            java.lang.Object r5 = r0.get(r8)
            X.V3u r5 = (X.C16737V3u) r5
            boolean r0 = r8 instanceof X.C328287Ef
            if (r0 == 0) goto L_0x0049
            r2 = r8
            X.7Ef r2 = (X.C328287Ef) r2
        L_0x0020:
            r6 = 0
            if (r2 == 0) goto L_0x0032
            X.3Us r1 = r2.BKr()
            X.3Us r0 = r2.BzG()
            boolean r0 = r1.equals(r0)
            r4 = 1
            if (r0 == 0) goto L_0x0033
        L_0x0032:
            r4 = 0
        L_0x0033:
            r1 = 0
            if (r10 != r12) goto L_0x0037
            r1 = 1
        L_0x0037:
            if (r5 == 0) goto L_0x0041
            int r0 = r5.A02
            if (r0 != r11) goto L_0x0041
            int r0 = r5.A03
            if (r0 == r12) goto L_0x0043
        L_0x0041:
            if (r1 == 0) goto L_0x0094
        L_0x0043:
            if (r4 != 0) goto L_0x0094
            r3.A0P(r8)
            return r6
        L_0x0049:
            r2 = 0
            goto L_0x0020
        L_0x004b:
            r3.A0P(r8)
            boolean r0 = r3.A00
            r6 = r0 ^ 1
            return r6
        L_0x0053:
            android.view.View r2 = r8.itemView
            float r0 = r2.getTranslationX()
            int r0 = (int) r0
            int r9 = r9 + r0
            android.view.View r0 = r8.itemView
            float r0 = r0.getTranslationY()
            int r0 = (int) r0
            int r10 = r10 + r0
            r3.A0Y(r8)
            int r0 = r11 - r9
            int r1 = r12 - r10
            if (r0 != 0) goto L_0x0073
            if (r1 != 0) goto L_0x007a
            r3.A0P(r8)
            r6 = 0
            return r6
        L_0x0073:
            int r0 = -r0
            float r0 = (float) r0
            r2.setTranslationX(r0)
            if (r1 == 0) goto L_0x007f
        L_0x007a:
            int r0 = -r1
            float r0 = (float) r0
            r2.setTranslationY(r0)
        L_0x007f:
            java.util.ArrayList r1 = r3.A08
            X.V3u r0 = new X.V3u
            r0.<init>()
            r0.A04 = r8
            r0.A00 = r9
            r0.A01 = r10
            r0.A02 = r11
            r0.A03 = r12
            r1.add(r0)
            goto L_0x00df
        L_0x0094:
            android.view.View r5 = r8.itemView
            float r0 = r5.getTranslationX()
            int r0 = (int) r0
            int r9 = r9 + r0
            android.view.View r0 = r8.itemView
            float r0 = r0.getTranslationY()
            int r0 = (int) r0
            int r10 = r10 + r0
            r3.A0Y(r8)
            boolean r4 = r8 instanceof X.C331027Pf
            int r0 = r11 - r9
            int r1 = r12 - r10
            if (r0 == 0) goto L_0x00b4
            int r0 = -r0
            float r0 = (float) r0
            r5.setTranslationX(r0)
        L_0x00b4:
            if (r1 == 0) goto L_0x00bd
            if (r4 != 0) goto L_0x00bd
            int r0 = -r1
            float r0 = (float) r0
            r5.setTranslationY(r0)
        L_0x00bd:
            java.util.ArrayList r1 = r3.A08
            X.V3u r0 = new X.V3u
            r0.<init>()
            r0.A04 = r8
            r0.A00 = r9
            r0.A01 = r10
            r0.A02 = r11
            r0.A03 = r12
            r1.add(r0)
            if (r2 == 0) goto L_0x00df
            X.3Us r0 = r2.BKr()
            X.3Us r1 = r0.A04()
            r0 = 0
            r3.A0b(r0, r8, r1, r2)
        L_0x00df:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AR.A0T(X.3kE, int, int, int, int):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [X.V4L, java.lang.Object] */
    public boolean A0U(C249703kE r13, C249703kE r14, int i, int i2, int i3, int i4) {
        AnonymousClass4CO r6 = (AnonymousClass4CO) this;
        C249703kE r7 = r13;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (r13 == r14) {
            return r6.A0T(r7, i5, i6, i7, i8);
        }
        float translationX = r13.itemView.getTranslationX();
        float translationY = r13.itemView.getTranslationY();
        float alpha = r13.itemView.getAlpha();
        r6.A0Y(r13);
        r13.itemView.setTranslationX(translationX);
        r13.itemView.setTranslationY(translationY);
        r13.itemView.setAlpha(alpha);
        r6.A0Y(r14);
        r14.itemView.setTranslationX((float) (-((int) (((float) (i3 - i)) - translationX))));
        r14.itemView.setTranslationY((float) (-((int) (((float) (i4 - i2)) - translationY))));
        r14.itemView.setAlpha(0.0f);
        ArrayList arrayList = r6.A07;
        ? obj = new Object();
        obj.A05 = r13;
        obj.A04 = r14;
        obj.A00 = i;
        obj.A01 = i6;
        obj.A02 = i7;
        obj.A03 = i8;
        arrayList.add(obj);
        return true;
    }

    public final boolean A0F(C241463Ph r10, C241463Ph r11, C249703kE r12) {
        int i;
        int i2;
        int i3 = r10.A00;
        int i4 = r10.A01;
        C249703kE r4 = r12;
        View view = r12.itemView;
        if (r11 == null) {
            i = view.getLeft();
            i2 = view.getTop();
        } else {
            i = r11.A00;
            i2 = r11.A01;
        }
        if (r12.isRemoved() || (i3 == i && i4 == i2)) {
            return A0S(r12);
        }
        view.layout(i, i2, view.getWidth() + i, view.getHeight() + i2);
        return A0T(r4, i3, i4, i, i2);
    }

    public final boolean A0G(C241463Ph r8, C241463Ph r9, C249703kE r10, C249703kE r11) {
        int i;
        int i2;
        int i3 = r8.A00;
        int i4 = r8.A01;
        C249703kE r2 = r11;
        if (r11.shouldIgnore()) {
            i2 = i4;
            i = i3;
        } else {
            i = r9.A00;
            i2 = r9.A01;
        }
        return A0U(r10, r2, i3, i4, i, i2);
    }

    public final void A0O(C249703kE r1) {
        A0M(r1);
        A0C(r1);
    }

    public final void A0P(C249703kE r1) {
        A0N(r1);
        A0C(r1);
    }
}
