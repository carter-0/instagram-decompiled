package X;

import android.content.Context;
import android.text.Spannable;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.8bY  reason: invalid class name and case insensitive filesystem */
public abstract class C358838bY {
    public static final void A01(Context context, Spannable spannable, int i, int i2, int i3) {
        0qQ.A0B(context, 0);
        0qQ.A0B(spannable, 1);
        if (i < 0 || i2 < 0 || i >= i2) {
            int i4 = 0;
            C263324Kh.A05(spannable, C358848bZ.class);
            i = 0;
            if (spannable.length() == 0) {
                A02(context, spannable, 0, spannable.length(), i3);
            }
            AnonymousClass6MP[] r4 = (AnonymousClass6MP[]) C263324Kh.A06(spannable, AnonymousClass6MP.class);
            int length = r4.length;
            while (i4 < length) {
                AnonymousClass6MP r2 = r4[i4];
                int spanStart = spannable.getSpanStart(r2);
                int spanEnd = spannable.getSpanEnd(r2);
                r2.ESD(i3, i3);
                A02(context, spannable, spanStart, spanEnd, i3);
                if (i < spanStart) {
                    A02(context, spannable, i, spanStart, i3);
                }
                i4++;
                i = spanEnd;
            }
            i2 = spannable.length();
            if (i >= i2) {
                return;
            }
        }
        A02(context, spannable, i, i2, i3);
    }

    public static final void A02(Context context, Spannable spannable, int i, int i2, int i3) {
        C358868bb r8 = (C358868bb) C263324Kh.A00(spannable, C358868bb.class);
        if (r8 == null) {
            r8 = C358878bc.A01("classic", false, false, false, false);
        }
        for (AnonymousClass6MP r2 : (AnonymousClass6MP[]) C263324Kh.A06(spannable, AnonymousClass6MP.class)) {
            int spanStart = spannable.getSpanStart(r2);
            int spanEnd = spannable.getSpanEnd(r2);
            if (spanStart == i && spanEnd == i2) {
                r2.ESD(i3, i3);
                i3 = 0nH.A08(i3, 1.0f);
            }
        }
        0sC A00 = 0pe.A00(spannable.getSpans(i, i2, C358848bZ.class));
        while (A00.hasNext()) {
            C358848bZ r0 = (C358848bZ) A00.next();
            int spanStart2 = spannable.getSpanStart(r0);
            int spanEnd2 = spannable.getSpanEnd(r0);
            int spanFlags = spannable.getSpanFlags(r0);
            int i4 = r0.A05;
            spannable.removeSpan(r0);
            if (spanStart2 < i && spanEnd2 > i2) {
                C358888bd r22 = r8.A03;
                C358848bZ r1 = new C358848bZ(context, r22, i4);
                r0 = new C358848bZ(context, r22, i4);
                spannable.setSpan(r1, spanStart2, i, spanFlags);
            } else if (spanStart2 < i) {
                spannable.setSpan(r0, spanStart2, i, spanFlags);
            } else if (spanEnd2 <= i2) {
            }
            spannable.setSpan(r0, i2, spanEnd2, spanFlags);
        }
        spannable.setSpan(new C358848bZ(context, r8.A03, i3), i, i2, 18);
    }

    public static final void A03(Context context, Spannable spannable, int i, int i2, int i3, int i4) {
        Context context2 = context;
        0qQ.A0B(context, 0);
        Spannable spannable2 = spannable;
        0qQ.A0B(spannable, 1);
        int i5 = i3;
        int i6 = i4;
        if (i < 0 || i2 < 0 || i >= i2) {
            int i7 = 0;
            C263324Kh.A05(spannable, C358848bZ.class);
            i = 0;
            if (spannable.length() == 0) {
                A04(context2, spannable2, 0, spannable.length(), i5, i6);
            }
            AnonymousClass6MP[] r2 = (AnonymousClass6MP[]) C263324Kh.A06(spannable, AnonymousClass6MP.class);
            int length = r2.length;
            while (i7 < length) {
                AnonymousClass6MP r0 = r2[i7];
                int spanStart = spannable.getSpanStart(r0);
                int spanEnd = spannable.getSpanEnd(r0);
                A04(context2, spannable2, spanStart, spanEnd, i5, i6);
                if (i < spanStart) {
                    A04(context, spannable, i, spanStart, i3, i4);
                }
                i7++;
                i = spanEnd;
            }
            i2 = spannable.length();
            if (i >= i2) {
                return;
            }
        }
        A04(context, spannable, i, i2, i3, i4);
    }

    public static final void A04(Context context, Spannable spannable, int i, int i2, int i3, int i4) {
        int i5;
        C358868bb r8 = (C358868bb) C263324Kh.A00(spannable, C358868bb.class);
        if (r8 == null) {
            r8 = C358878bc.A01("classic", false, false, false, false);
        }
        C360708f1 r4 = r8.A04;
        for (AnonymousClass6MP r2 : (AnonymousClass6MP[]) C263324Kh.A06(spannable, AnonymousClass6MP.class)) {
            int spanStart = spannable.getSpanStart(r2);
            int spanEnd = spannable.getSpanEnd(r2);
            if (spanStart == i && spanEnd == i2) {
                r2.ESD(i3, i4);
            }
        }
        0sC A00 = 0pe.A00(spannable.getSpans(i, i2, C358848bZ.class));
        while (A00.hasNext()) {
            C358848bZ r0 = (C358848bZ) A00.next();
            int spanStart2 = spannable.getSpanStart(r0);
            int spanEnd2 = spannable.getSpanEnd(r0);
            int spanFlags = spannable.getSpanFlags(r0);
            int i6 = r0.A05;
            spannable.removeSpan(r0);
            if (spanStart2 < i && spanEnd2 > i2) {
                C358888bd r22 = r8.A03;
                C358848bZ r1 = new C358848bZ(context, r22, i6);
                r0 = new C358848bZ(context, r22, i6);
                spannable.setSpan(r1, spanStart2, i, spanFlags);
            } else if (spanStart2 < i) {
                spannable.setSpan(r0, spanStart2, i, spanFlags);
            } else if (spanEnd2 <= i2) {
            }
            spannable.setSpan(r0, i2, spanEnd2, spanFlags);
        }
        C306576Mr A002 = C358948bj.A00(spannable, i, i2);
        C358888bd r23 = r8.A03;
        if (A002 == C306576Mr.INVERTED || A002 == C306576Mr.INVERTED_OUTLINED) {
            i3 = i4;
        }
        C358848bZ r12 = new C358848bZ(context, r23, i3);
        if (r4 == null || !(r4 instanceof C360808fB)) {
            i5 = 18;
        } else {
            i5 = 16711698;
        }
        spannable.setSpan(r12, i, i2, i5);
    }

    public static final ArrayList A00(Spannable spannable) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (C358848bZ r0 : (C358848bZ[]) C263324Kh.A06(spannable, C358848bZ.class)) {
            hashSet.add(0nH.A0G(r0.A05));
        }
        arrayList.addAll(hashSet);
        return arrayList;
    }
}
