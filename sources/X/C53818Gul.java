package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.Iterator;

/* renamed from: X.Gul  reason: case insensitive filesystem */
public final class C53818Gul extends C251343mx {
    public final int A00;
    public final C243573Zh A01;
    public final CharSequence A02;
    public final C62320sa A03;
    public final 0sP A04;
    public final 2WX A05;
    public final C62320sa A06;

    public final C251263mp A0X(AnonymousClass3Y5 r34) {
        AnonymousClass3Y5 r1 = r34;
        0qQ.A0B(r1, 0);
        int A002 = I61.A00(r1, HNO.A0m);
        int A003 = I61.A00(r1, HNO.A04);
        int A012 = I61.A01(r1, AnonymousClass05K.A0M);
        int A013 = I61.A01(r1, AnonymousClass05K.A0O);
        int A014 = I61.A01(r1, AnonymousClass05K.A0P);
        Object A004 = AnonymousClass3Zw.A00(r1, new TTX(this, r1, A002, A012, A003, 2), new Object[]{Integer.valueOf(A002), Integer.valueOf(A003)});
        0sP A015 = AnonymousClass3j0.A01(r1, C59097J6f.A01(this, 10));
        2WX r5 = this.A05;
        Integer num = AnonymousClass05K.A00;
        AnonymousClass9JS A0d = C51965G9l.A0d(num, A004, 4);
        2WX r20 = 2WX.A02;
        if (r5 == r20) {
            r5 = null;
        }
        2WX A0Z = C51971G9r.A0Z(C51971G9r.A0X(C51973G9u.A0Q(C51965G9l.A0X(r5, A0d), C51967G9n.A0S(0, C51965G9l.A07(A013)), 0, C51965G9l.A07(A014)), AnonymousClass05K.A0C, 1.0f, 1), num, A015, (String) null);
        CharSequence charSequence = this.A02;
        C56091Hse hse = (C56091Hse) AnonymousClass3Zw.A00(r1, C58708IwH.A01(this, 43), new Object[]{charSequence});
        C243573Zh r32 = this.A01;
        C243583Zi r17 = C243583Zi.SPACE_BETWEEN;
        2Wb A0K = C51973G9u.A0K(r1);
        Object A062 = A0K.A00.A06(C59535JNh.class);
        if (A062 != null) {
            C59535JNh jNh = (C59535JNh) A062;
            0qQ.A0B(charSequence, 0);
            0qQ.A0B(jNh, 1);
            SpannableStringBuilder A0C = DbS.A0C(charSequence);
            Integer num2 = I41.A00(jNh).EIj(AnonymousClass05K.A0u).A03;
            Iterator it = new 11S("#[\\p{L}\\p{Mn}\\p{Mc}\\p{Nd}_]{1,30}").A04(charSequence).iterator();
            while (it.hasNext()) {
                C291265gs r15 = (C291265gs) it.next();
                int intValue = num2.intValue();
                int i = 1;
                if (intValue == 0) {
                    i = 0;
                } else if (!(intValue == 1 || intValue == 2 || intValue == 3)) {
                    throw AnonymousClass7TE.A1K();
                }
                A0C.setSpan(new StyleSpan(i), r15.A01().A00, r15.A01().A01 + 1, 17);
            }
            Iterator A0M = C51976G9y.A0M(charSequence);
            while (A0M.hasNext()) {
                C56113Ht0 ht0 = (C56113Ht0) A0M.next();
                int i2 = ht0.A01;
                String str = ht0.A02;
                A0C.replace(i2, ht0.A00 + 1, str);
                int intValue2 = num2.intValue();
                int i3 = 1;
                if (intValue2 == 0) {
                    i3 = 0;
                } else if (!(intValue2 == 1 || intValue2 == 2 || intValue2 == 3)) {
                    throw AnonymousClass7TE.A1K();
                }
                A0C.setSpan(new StyleSpan(i3), i2, str.length() + i2, 17);
            }
            SpannableString valueOf = SpannableString.valueOf(A0C);
            Integer num3 = AnonymousClass05K.A0Y;
            HNO hno = HNO.A0Y;
            AnonymousClass90N r23 = AnonymousClass90N.TEXT_START;
            long A0B = C51969G9p.A0B();
            A0K.A00(new C53907GwD((2WX) null, r23, hno, valueOf, num3, 0, A0B, A0B));
            0sP r12 = this.A04;
            if (r12 != null) {
                AnonymousClass2VW r7 = hse.A00;
                String str2 = hse.A01;
                C58688Ivx A005 = C58688Ivx.A00(hse, r12, 35);
                C53854GvL gvL = new C53854GvL(C51971G9r.A0Y(C51972G9s.A0S(C51974G9v.A0M((2WX) null, num, 0, C51970G9q.A0K()), 0, C51970G9q.A0I()), AnonymousClass05K.A0D, str2, 4), HNN.A0X, (HNN) null, (Integer) null, Integer.valueOf(I61.A00(A0K, hno)), C244013aV.A0E(A0K, 2131966441), A005, 12, true);
                AnonymousClass56V.A00(gvL, r7);
                A0K.A00(gvL);
            }
            2Tp A0I = C243563Zg.A0I(A0K, r1, A0Z, r32, r17);
            Integer num4 = AnonymousClass05K.A01;
            return new C53775Gu4(A0I, r20, new C57550Icc(num4, num4, num4), this.A06, (C62320sa) null);
        }
        throw AnonymousClass7TE.A0y();
    }

    public C53818Gul(2WX r2, C243573Zh r3, CharSequence charSequence, C62320sa r5, C62320sa r6, 0sP r7, int i) {
        AnonymousClass7TG.A1R(r5, r6);
        0qQ.A0B(r2, 7);
        this.A00 = i;
        this.A02 = charSequence;
        this.A01 = r3;
        this.A03 = r5;
        this.A06 = r6;
        this.A04 = r7;
        this.A05 = r2;
    }
}
