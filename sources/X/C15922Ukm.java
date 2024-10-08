package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewTreeObserver;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Ukm  reason: case insensitive filesystem */
public final class C15922Ukm extends AnonymousClass91c {
    public final float A00;
    public final TimeInterpolator A01 = new OvershootInterpolator(1.0f);
    public final C360728f3 A02;
    public final ArrayList A03 = new ArrayList();
    public final ArrayList A04 = new ArrayList();

    public final void A0L(Spannable spannable) {
        0qQ.A0B(spannable, 0);
        super.A0L(new SpannableString(spannable));
        ArrayList arrayList = this.A04;
        arrayList.clear();
        ArrayList arrayList2 = this.A03;
        arrayList2.clear();
        if (spannable.length() != 0) {
            arrayList.addAll(03t.A0J(C263324Kh.A06(spannable, ViewTreeObserver.OnPreDrawListener.class)));
            arrayList2.addAll(03t.A0J(C263324Kh.A06(spannable, U2T.class)));
        }
    }

    public final void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, 0rN r16, float f, float f2, int i) {
        0qQ.A0B(canvas, 0);
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            canvas.save();
            if (A0W() != 0) {
                float A0W = ((float) (i % A0W())) / ((float) A0W());
                float A002 = A00(A0W);
                canvas.translate(0.0f, A002);
                Iterator A1G = AnonymousClass7TE.A1G(this.A04);
                while (A1G.hasNext()) {
                    ((ViewTreeObserver.OnPreDrawListener) AnonymousClass7TF.A0a(A1G)).onPreDraw();
                }
                ArrayList arrayList = this.A03;
                if (DbT.A1b(arrayList)) {
                    float A003 = A00(A0W - 0.01f);
                    float A004 = A00(A0W - 0.02f);
                    float A005 = A00(A0W - 0.03f);
                    float A006 = A00(A0W - 0.04f);
                    Iterator A1G2 = AnonymousClass7TE.A1G(arrayList);
                    while (A1G2.hasNext()) {
                        U2T u2t = (U2T) AnonymousClass7TF.A0a(A1G2);
                        u2t.A01 = A003 - A002;
                        u2t.A00 = A005 - A002;
                        u2t.A03 = A004 - A002;
                        u2t.A02 = A006 - A002;
                    }
                }
                staticLayout.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final int getDurationInMs() {
        return 5000;
    }

    public final float A0V() {
        return -this.A00;
    }

    public final C360728f3 A0X() {
        return this.A02;
    }

    public final void A0Y() {
        Spannable spannable = this.A0F;
        0qQ.A07(spannable);
        for (U2T u2t : (U2T[]) C263324Kh.A06(spannable, U2T.class)) {
            u2t.A01 = 0.0f;
            u2t.A00 = 0.0f;
            u2t.A03 = 0.0f;
            u2t.A02 = 0.0f;
        }
    }

    public C15922Ukm(Context context, int i) {
        super(context, i);
        RectF rectF = 0nA.A01;
        this.A00 = (-50.0f * AnonymousClass7TF.A0E(context).scaledDensity) + 0.5f;
        this.A02 = C360728f3.STRONG;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r6 >= 0.47500002f) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final float A00(float r6) {
        /*
            r5 = this;
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r3 = 1040187392(0x3e000000, float:0.125)
            r4 = 1033476506(0x3d99999a, float:0.075)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001c
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x001c
        L_0x0010:
            float r6 = r6 - r3
            float r6 = r6 / r4
            android.animation.TimeInterpolator r0 = r5.A01
            float r0 = r0.getInterpolation(r6)
            float r1 = r5.A00
            float r1 = r1 * r0
            return r1
        L_0x001c:
            r3 = 1049414861(0x3e8ccccd, float:0.275)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x002a
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x002a
        L_0x0027:
            float r1 = r5.A00
            return r1
        L_0x002a:
            r0 = 1051931444(0x3eb33334, float:0.35000002)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0044
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0044
        L_0x0037:
            float r6 = r6 - r3
            float r6 = r6 / r4
            android.animation.TimeInterpolator r0 = r5.A01
            float r0 = r0.getInterpolation(r6)
            float r1 = r5.A00
            float r2 = r2 - r0
            float r1 = r1 * r2
            return r1
        L_0x0044:
            r1 = 1057803469(0x3f0ccccd, float:0.55)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0053
            r3 = 1056125748(0x3ef33334, float:0.47500002)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0053
            goto L_0x0010
        L_0x0053:
            r3 = 1059061760(0x3f200000, float:0.625)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x005e
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x005e
            goto L_0x0027
        L_0x005e:
            r0 = 1060320051(0x3f333333, float:0.7)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x006a
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x006a
            goto L_0x0037
        L_0x006a:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15922Ukm.A00(float):float");
    }
}
