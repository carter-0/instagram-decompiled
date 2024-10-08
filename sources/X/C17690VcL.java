package X;

import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VcL  reason: case insensitive filesystem */
public final class C17690VcL {
    public float A00;
    public float A01;
    public final StaticLayout A02;
    public final TextPaint A03;
    public final List A04 = new ArrayList();
    public final List A05;
    public final boolean A06;
    public final C358848bZ[] A07;
    public final Spannable A08;
    public final C306576Mr A09;
    public final AnonymousClass91R[] A0A;

    public C17690VcL(Spannable spannable, TextPaint textPaint, 0rN r14, boolean z) {
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i;
        int i2;
        0qQ.A0B(spannable, 1);
        this.A08 = spannable;
        boolean z2 = true;
        this.A03 = new TextPaint(1);
        this.A05 = new ArrayList();
        AnonymousClass91R[] r1 = null;
        C306576Mr A002 = C358948bj.A00(spannable, 0, spannable.length());
        this.A09 = A002;
        C306576Mr r2 = C306576Mr.OUTLINED;
        if (!(A002 == r2 || A002 == C306576Mr.INVERTED_OUTLINED)) {
            z2 = false;
        }
        this.A06 = z2;
        C358848bZ[] r5 = (C358848bZ[]) C263324Kh.A06(spannable, C358848bZ.class);
        for (C358848bZ r0 : r5) {
            textPaint.setColor(r0.A05);
        }
        this.A07 = r5;
        r1 = this.A06 ? (AnonymousClass91R[]) C263324Kh.A06(this.A08, AnonymousClass91R.class) : r1;
        this.A0A = r1;
        this.A03.set(textPaint);
        Spannable spannable2 = this.A08;
        TextPaint textPaint2 = this.A03;
        int i3 = r14.A00;
        if (z) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        float f = r14.A02;
        float f2 = r14.A01;
        this.A02 = new StaticLayout(spannable2, textPaint2, i3, alignment, f, f2, false);
        if (this.A06) {
            if (r1 != null) {
                List list = this.A05;
                C306576Mr r3 = this.A09;
                AnonymousClass91R r02 = r1[0];
                if (r3 == r2) {
                    i = r02.A02;
                } else {
                    i = r02.A01;
                }
                list.add(VBG.A00(textPaint, r02.A09.A02, i));
                AnonymousClass91R r4 = r1[0];
                Float f3 = r4.A09.A03;
                if (f3 != null) {
                    float floatValue = f3.floatValue();
                    List list2 = this.A05;
                    if (this.A09 == r2) {
                        i2 = r4.A01;
                    } else {
                        i2 = r4.A02;
                    }
                    list2.add(VBG.A00(textPaint, floatValue, i2));
                }
            }
            for (TextPaint textPaint3 : this.A05) {
                List list3 = this.A04;
                Spannable spannable3 = this.A08;
                int i4 = r14.A00;
                if (z) {
                    alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                }
                list3.add(new StaticLayout(spannable3, textPaint3, i4, alignment2, f, f2, false));
            }
        }
    }
}
