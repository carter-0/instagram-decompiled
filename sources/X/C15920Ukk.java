package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ukk  reason: case insensitive filesystem */
public final class C15920Ukk extends AnonymousClass91c {
    public final List A00 = new ArrayList();
    public final AccelerateDecelerateInterpolator A01 = new AccelerateDecelerateInterpolator();
    public final C360728f3 A02 = C360728f3.ELEGANT;
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();

    private final float A00(float f, int i, boolean z) {
        int min;
        float f2 = (float) i;
        List list = this.A00;
        0qQ.A0B(list, 0);
        U2U u2u = (U2U) 00k.A0J(list);
        float f3 = 0.0f;
        if (!(u2u == null || (min = Math.min(u2u.A05.size(), u2u.A06.size())) == 0)) {
            f3 = Math.min(((float) A0W()) * 0.2f, 1000.0f) / ((float) min);
        }
        float f4 = f2 * f3;
        int i2 = 0;
        if (z) {
            i2 = C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION;
        }
        float f5 = 0.0f + f4;
        float f6 = (float) i2;
        return 0mi.A02(f, f5 + f6, Math.min(((float) A0W()) * 0.2f, 1000.0f) + f6, 0.0f, 1.0f);
    }

    public final void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, 0rN r25, float f, float f2, int i) {
        float A022;
        float interpolation;
        float f3;
        Canvas canvas2 = canvas;
        boolean A1U = AnonymousClass7TF.A1U(0, canvas2, textPaint);
        C51972G9s.A1C(spannable, r25);
        canvas2.save();
        int A0W = A0W();
        int i2 = i % A0W;
        float max = Math.max(((float) (A0W() - 200)) - Math.min(((float) A0W()) * 0.2f, 1000.0f), 0.0f);
        for (U2U u2u : this.A00) {
            ArrayList arrayList = u2u.A05;
            ArrayList arrayList2 = u2u.A06;
            int min = Math.min(arrayList.size(), arrayList2.size());
            for (int i3 = 0; i3 < min; i3++) {
                C17901Vhs vhs = (C17901Vhs) arrayList.get(i3);
                C17901Vhs vhs2 = (C17901Vhs) arrayList2.get(i3);
                float f4 = (float) i2;
                int i4 = (f4 > max ? 1 : (f4 == max ? 0 : -1));
                AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = this.A01;
                if (i4 < 0) {
                    interpolation = accelerateDecelerateInterpolator.getInterpolation(A00(f4, i3, false));
                    f3 = accelerateDecelerateInterpolator.getInterpolation(A00(f4, i3, A1U));
                } else {
                    interpolation = accelerateDecelerateInterpolator.getInterpolation(0mi.A02(f4, max, (float) (A0W - 200), 1.0f, 0.0f));
                    f3 = interpolation;
                }
                vhs.A00 = interpolation;
                vhs2.A00 = f3;
            }
            u2u.onPreDraw();
            u2u.AQG(canvas2);
        }
        for (AnonymousClass91R r0 : this.A03) {
            r0.A04 = false;
        }
        List list = this.A04;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            List list2 = (List) list.get(i5);
            int size2 = list2.size();
            float min2 = Math.min(((float) A0W()) * 0.2f, 1000.0f);
            float f5 = ((float) i5) * (min2 / ((float) size));
            if (size2 > 0) {
                float f6 = (min2 - f5) / ((float) size2);
                int i6 = 0;
                do {
                    C17690VcL vcL = (C17690VcL) list2.get(i6);
                    float f7 = (float) i2;
                    float f8 = max - 250.0f;
                    if (f7 < f8) {
                        float f9 = (((float) (i6 + 1)) * f6) + 250.0f + f5;
                        A022 = 0mi.A02(f7, f9, 250.0f + f9, 0.0f, 255.0f);
                    } else {
                        A022 = 0mi.A02(f7, f8, max, 255.0f, 0.0f);
                    }
                    int i7 = (int) A022;
                    C358848bZ[] r1 = vcL.A07;
                    if (r1.length != 0) {
                        C358848bZ r12 = r1[0];
                        r12.A03 = Integer.valueOf(i7);
                        r12.A01 = 0.0f;
                        r12.A00 = 0.0f;
                        r12.A04 = !vcL.A06;
                    }
                    vcL.A03.setAlpha(i7);
                    for (Paint alpha : vcL.A05) {
                        alpha.setAlpha(i7);
                    }
                    canvas2.save();
                    canvas2.translate(vcL.A00, vcL.A01);
                    for (Layout draw : vcL.A04) {
                        draw.draw(canvas2);
                    }
                    vcL.A02.draw(canvas2);
                    canvas2.restore();
                    i6++;
                } while (i6 < size2);
            }
        }
        canvas2.restore();
    }

    public final int getDurationInMs() {
        return 5000;
    }

    public final void A0R() {
        StaticLayout staticLayout;
        float f;
        super.A0R();
        List list = this.A00;
        list.clear();
        List list2 = this.A03;
        list2.clear();
        List list3 = this.A04;
        list3.clear();
        Spannable spannable = this.A0F;
        0qQ.A07(spannable);
        if (spannable.length() != 0 && (staticLayout = this.A0G) != null) {
            TextPaint textPaint = this.A0b;
            0qQ.A07(textPaint);
            0rN A08 = A08();
            boolean A0O = A0O();
            U2U[] u2uArr = (U2U[]) C263324Kh.A06(spannable, U2U.class);
            Collections.addAll(list, Arrays.copyOf(u2uArr, u2uArr.length));
            AnonymousClass91R[] r1 = (AnonymousClass91R[]) C263324Kh.A06(spannable, AnonymousClass91R.class);
            Collections.addAll(list2, Arrays.copyOf(r1, r1.length));
            W10.A02(spannable, textPaint);
            textPaint.clearShadowLayer();
            int lineCount = staticLayout.getLineCount();
            for (int i = 0; i < lineCount; i++) {
                int lineStart = staticLayout.getLineStart(i);
                int lineEnd = staticLayout.getLineEnd(i);
                int lineTop = staticLayout.getLineTop(i);
                float lineLeft = staticLayout.getLineLeft(i);
                float lineRight = staticLayout.getLineRight(i) - lineLeft;
                CharSequence subSequence = spannable.subSequence(lineStart, lineEnd);
                if (!(subSequence == null || subSequence.length() == 0 || TextUtils.getTrimmedLength(subSequence) <= 0)) {
                    ArrayList arrayList = new ArrayList();
                    int length = subSequence.length();
                    float f2 = 0.0f;
                    int i2 = 0;
                    while (i2 < length) {
                        if (!C13988Tno.A1Z(subSequence, i2)) {
                            int i3 = i2 + 1;
                            while (i3 < length && !C13988Tno.A1Z(subSequence, i3)) {
                                i3++;
                            }
                            int i4 = i3;
                            while (i4 < length && C13988Tno.A1Z(subSequence, i4)) {
                                i4++;
                            }
                            if (i4 < length) {
                                i3 = i4;
                            }
                            CharSequence subSequence2 = subSequence.subSequence(i2, i3);
                            0qQ.A0C(subSequence2, C66579MXk.A00(66));
                            C17690VcL vcL = new C17690VcL((Spannable) subSequence2, textPaint, A08, A0O);
                            StaticLayout staticLayout2 = vcL.A02;
                            float A022 = (float) AnonymousClass6M0.A02(staticLayout2);
                            if (A0O) {
                                f = (((lineLeft - staticLayout2.getLineLeft(0)) + lineRight) - f2) - A022;
                            } else {
                                f = lineLeft + f2;
                            }
                            vcL.A00 = f;
                            vcL.A01 = (float) lineTop;
                            arrayList.add(vcL);
                            f2 += A022;
                            i2 = i3 - 1;
                        }
                        i2++;
                    }
                    list3.add(arrayList);
                }
            }
        }
    }

    public final C360728f3 A0X() {
        return this.A02;
    }

    public final void A0Y() {
        int i;
        Iterator it = this.A00.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            U2U u2u = (U2U) it.next();
            ArrayList arrayList = u2u.A05;
            ArrayList arrayList2 = u2u.A06;
            int min = Math.min(arrayList.size(), arrayList2.size());
            while (i < min) {
                ((C17901Vhs) arrayList.get(i)).A00 = 1.0f;
                ((C17901Vhs) arrayList2.get(i)).A00 = 1.0f;
                i++;
            }
        }
        Spannable spannable = this.A0F;
        0qQ.A07(spannable);
        if (spannable.length() != 0) {
            C358848bZ[] r3 = (C358848bZ[]) C263324Kh.A06(spannable, C358848bZ.class);
            int length = r3.length;
            while (i < length) {
                C358848bZ r1 = r3[i];
                r1.A03 = 255;
                r1.A00(r1.A02);
                i++;
            }
            C263324Kh.A05(spannable, U2W.class);
        }
    }

    public C15920Ukk(Context context, int i) {
        super(context, i);
    }
}
