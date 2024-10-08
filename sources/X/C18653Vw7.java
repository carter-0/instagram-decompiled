package X;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vw7  reason: case insensitive filesystem */
public final class C18653Vw7 {
    public float A00;
    public float A01 = 1.0f;
    public float A02;
    public float A03;
    public float A04;
    public Integer A05 = AnonymousClass05K.A00;
    public final int A06;
    public final int A07;
    public final Spannable A08;
    public final TextPaint A09;
    public final Integer A0A;
    public final BreakIterator A0B;
    public final List A0C = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18653Vw7(android.content.Context r15, android.text.Spannable r16, android.text.TextPaint r17, X.0rN r18, java.lang.Integer r19, int r20, boolean r21) {
        /*
            r14 = this;
            r5 = 1
            r0 = 3
            r4 = 2
            r3 = r16
            r2 = r19
            X.AnonymousClass7TF.A1E(r3, r0, r2)
            r14.<init>()
            r0 = r20
            r14.A07 = r0
            r14.A08 = r3
            r0 = r17
            r14.A09 = r0
            r14.A0A = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.A0C = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r14.A01 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r14.A05 = r0
            java.text.BreakIterator r1 = java.text.BreakIterator.getCharacterInstance()
            X.0qQ.A07(r1)
            r14.A0B = r1
            java.lang.String r0 = r3.toString()
            int r0 = X.0mp.A00(r0)
            r14.A06 = r0
            X.C13988Tno.A1P(r3, r1)
            int r0 = r2.intValue()
            r2 = 0
            if (r0 == r5) goto L_0x004f
            if (r0 == r2) goto L_0x0054
            if (r0 == r4) goto L_0x004f
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x004f:
            int r6 = r1.next()
            goto L_0x0058
        L_0x0054:
            int r6 = r1.last()
        L_0x0058:
            r3 = 0
            r1 = 0
        L_0x005a:
            r0 = -1
            r13 = r21
            if (r6 == r0) goto L_0x00c3
            android.text.Spannable r0 = r14.A08
            java.lang.CharSequence r10 = r0.subSequence(r1, r6)
            r0 = 66
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r10, r0)
            android.text.Spannable r10 = (android.text.Spannable) r10
            android.text.TextPaint r11 = r14.A09
            X.Vkc r8 = new X.Vkc
            r9 = r15
            r12 = r18
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.Integer r0 = r14.A0A
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x00bb
            if (r0 == r2) goto L_0x00bb
            if (r0 != r4) goto L_0x00bd
            android.text.TextPaint r7 = r14.A09
            android.text.Spannable r1 = r14.A08
            X.Vhy r0 = r8.A02
            android.text.DynamicLayout r0 = r0.A01
            int r0 = X.AnonymousClass6M0.A02(r0)
            float r1 = r7.measureText(r1, r2, r6)
            float r0 = (float) r0
            float r1 = r1 - r0
        L_0x0098:
            r8.A00 = r1
            java.util.List r0 = r14.A0C
            r0.add(r8)
            java.lang.Integer r0 = r14.A0A
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x00b3
            if (r0 == r2) goto L_0x00b1
            if (r0 == r4) goto L_0x00b1
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00b1:
            r1 = r6
            goto L_0x00b4
        L_0x00b3:
            r1 = 0
        L_0x00b4:
            java.text.BreakIterator r0 = r14.A0B
            int r6 = r0.next()
            goto L_0x005a
        L_0x00bb:
            r1 = 0
            goto L_0x0098
        L_0x00bd:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00c3:
            if (r21 == 0) goto L_0x00ff
            java.util.List r0 = r14.A0C
            java.lang.Object r0 = X.00k.A0L(r0)
            X.Vkc r0 = (X.C18054Vkc) r0
            if (r0 == 0) goto L_0x00d7
            X.Vhy r0 = r0.A02
            android.text.DynamicLayout r0 = r0.A01
            int r2 = X.AnonymousClass6M0.A02(r0)
        L_0x00d7:
            java.util.List r0 = r14.A0C
            int r4 = r0.size()
        L_0x00dd:
            if (r3 >= r4) goto L_0x00ff
            java.util.List r0 = r14.A0C
            java.lang.Object r1 = r0.get(r3)
            X.Vkc r1 = (X.C18054Vkc) r1
            java.util.List r0 = r14.A0C
            java.lang.Object r0 = r0.get(r3)
            X.Vkc r0 = (X.C18054Vkc) r0
            X.Vhy r0 = r0.A02
            android.text.DynamicLayout r0 = r0.A01
            int r0 = X.AnonymousClass6M0.A02(r0)
            int r0 = r2 - r0
            float r0 = (float) r0
            r1.A00 = r0
            int r3 = r3 + 1
            goto L_0x00dd
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18653Vw7.<init>(android.content.Context, android.text.Spannable, android.text.TextPaint, X.0rN, java.lang.Integer, int, boolean):void");
    }

    public static float A00(C18653Vw7 vw7) {
        if (vw7.A05.intValue() == 1) {
            return -(vw7.A03() / 2.0f);
        }
        return 0.0f;
    }

    public final void A04(Canvas canvas, int i) {
        float f;
        float f2;
        int i2;
        C17907Vhy vhy;
        int i3 = 0;
        int i4 = 0;
        if (0 < i) {
            this.A0C.size();
        }
        canvas.save();
        float f3 = 0.0f;
        float A002 = this.A03 + A00(this) + 0.0f;
        float f4 = this.A04;
        if (this.A05.intValue() == 1) {
            f3 = -(A01() / 2.0f);
        }
        canvas.translate(A002, f4 + f3 + this.A00);
        float f5 = this.A02;
        float f6 = -A00(this);
        if (this.A05.intValue() == 1) {
            f = -(A01() / 2.0f);
        } else {
            f = 0.0f;
        }
        canvas.rotate(f5, f6, -f);
        List list = this.A0C;
        C18054Vkc vkc = (C18054Vkc) 00k.A0O(list, 0);
        if (vkc == null || (vhy = (C17907Vhy) 00k.A0O(vkc.A04, 0)) == null) {
            f2 = 0.0f;
        } else {
            f2 = vhy.A03.getStrokeWidth();
        }
        C18054Vkc vkc2 = (C18054Vkc) 00k.A0O(list, 0);
        if (vkc2 != null) {
            i2 = vkc2.A02.A01.getHeight();
        } else {
            i2 = 0;
        }
        C18054Vkc vkc3 = (C18054Vkc) 00k.A0O(list, 0);
        if (vkc3 != null) {
            i4 = AnonymousClass6M0.A02(vkc3.A02.A01);
        }
        canvas.saveLayerAlpha(new RectF(((float) (-i4)) - f2, ((float) (-i2)) - f2, A03() + f2 + ((float) i4), A01() + f2 + ((float) i2)), (int) (255.0f * this.A01));
        int intValue = this.A0A.intValue();
        if (intValue == 1) {
            C18054Vkc vkc4 = (C18054Vkc) 00k.A0O(list, i);
            if (vkc4 != null) {
                vkc4.A01(canvas);
            }
            C18054Vkc vkc5 = (C18054Vkc) 00k.A0O(list, i);
            if (vkc5 != null) {
                canvas.save();
                canvas.translate(vkc5.A00, 0.0f);
                vkc5.A02.A01.draw(canvas);
                canvas.restore();
            }
        } else if (intValue == 0 || intValue == 2) {
            if (0 <= i) {
                int i5 = 0;
                while (true) {
                    C18054Vkc vkc6 = (C18054Vkc) 00k.A0O(list, i5);
                    if (vkc6 != null) {
                        vkc6.A01(canvas);
                    }
                    if (i5 == i) {
                        break;
                    }
                    i5++;
                }
            }
            if (intValue != 0 && intValue != 2) {
                throw new RuntimeException();
            } else if (0 <= i) {
                while (true) {
                    C18054Vkc vkc7 = (C18054Vkc) 00k.A0O(list, i3);
                    if (vkc7 != null) {
                        canvas.save();
                        canvas.translate(vkc7.A00, 0.0f);
                        vkc7.A02.A01.draw(canvas);
                        canvas.restore();
                    }
                    if (i3 == i) {
                        break;
                    }
                    i3++;
                }
            }
        } else {
            throw new RuntimeException();
        }
        canvas.restore();
        canvas.restore();
    }

    public final float A01() {
        C18054Vkc vkc = (C18054Vkc) 00k.A0O(this.A0C, 0);
        if (vkc != null) {
            return (float) vkc.A02.A01.getHeight();
        }
        return 0.0f;
    }

    public final float A02() {
        int intValue = this.A0A.intValue();
        if (intValue == 1 || intValue == 0) {
            C18054Vkc vkc = (C18054Vkc) 00k.A0L(this.A0C);
            if (vkc != null) {
                return vkc.A00();
            }
            return 0.0f;
        } else if (intValue == 2) {
            double d = 0.0d;
            for (C18054Vkc A002 : this.A0C) {
                d += (double) A002.A00();
            }
            return (float) d;
        } else {
            throw new RuntimeException();
        }
    }

    public final float A03() {
        int intValue = this.A0A.intValue();
        if (intValue == 1 || intValue == 0) {
            C18054Vkc vkc = (C18054Vkc) 00k.A0L(this.A0C);
            if (vkc != null) {
                return vkc.A02.A01.getLineRight(0);
            }
            return 0.0f;
        } else if (intValue == 2) {
            double d = 0.0d;
            for (C18054Vkc vkc2 : this.A0C) {
                d += (double) vkc2.A02.A01.getLineRight(0);
            }
            return (float) d;
        } else {
            throw new RuntimeException();
        }
    }
}
