package X;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: X.5hR  reason: invalid class name and case insensitive filesystem */
public abstract class C291515hR {
    public static C268454dQ A00;
    public static C268454dQ A01;
    public static C268454dQ A02;

    public static final C268454dQ A01(Context context, AnonymousClass5ZD r4) {
        C268454dQ r0;
        0qQ.A0B(context, 0);
        C303986Bo r2 = null;
        if (!0oh.A08()) {
            return null;
        }
        if (0qQ.A0K(r4, AnonymousClass5ZD.A03) || 0qQ.A0K(r4, AnonymousClass5ZD.A05)) {
            r0 = A02;
            if (r0 == null) {
                Typeface A022 = AnonymousClass0qo.A00(context).A02(0qm.A0r);
                if (A022 != null) {
                    r2 = C303946Bk.A00(A022);
                }
                A02 = r2;
                return r2;
            }
        } else if (0qQ.A0K(r4, AnonymousClass5ZD.A01)) {
            r0 = A00;
            if (r0 == null) {
                Typeface A023 = AnonymousClass0qo.A00(context).A02(0qm.A0p);
                if (A023 != null) {
                    r2 = C303946Bk.A00(A023);
                }
                A00 = r2;
                return r2;
            }
        } else {
            r0 = A01;
            if (r0 == null) {
                Typeface A024 = AnonymousClass0qo.A00(context).A02(0qm.A0q);
                if (A024 != null) {
                    r2 = C303946Bk.A00(A024);
                }
                A01 = r2;
                return r2;
            }
        }
        return r0;
    }

    public static final C286025Tq A00(Context context, C286025Tq r40, AnonymousClass5Z4 r41) {
        C286025Tq r1 = r40;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        AnonymousClass5Z4 r13 = r41;
        0qQ.A0B(r13, 2);
        if (!0oh.A08()) {
            return r1;
        }
        C303876Bd r12 = new C303876Bd(16);
        r12.A05(r1);
        0sn<C3022062b> r0 = r1.A03;
        if (r0 == null) {
            r0 = 0sn.A00;
        }
        for (C3022062b r11 : r0) {
            AnonymousClass5ZB r02 = (AnonymousClass5ZB) r11.A02;
            AnonymousClass5ZD r14 = r02.A08;
            AnonymousClass5ZD r29 = r14;
            if (r14 == null) {
                r14 = r13.A02.A08;
            }
            C268454dQ A012 = A01(context2, r14);
            AnonymousClass5ZA r10 = r02.A0C;
            long Aoz = r10.Aoz();
            long j = r02.A01;
            C291715hl r27 = r02.A06;
            C291725hm r28 = r02.A07;
            String str = r02.A0E;
            long j2 = r02.A02;
            C291735hn r24 = r02.A0A;
            C291745ho r23 = r02.A0D;
            C286155Ud r15 = r02.A09;
            long j3 = r02.A00;
            C291795ht r9 = r02.A0B;
            C291805hu r8 = r02.A03;
            C289645dx r16 = r02.A04;
            long Aoz2 = r10.Aoz();
            long j4 = AnonymousClass5RW.A01;
            if (Aoz != Aoz2) {
                r10 = AnonymousClass5Z8.A00(Aoz);
            }
            r12.A06(new AnonymousClass5ZB(r8, r16, A012, r27, r28, r29, r15, r24, r9, r10, r23, str, j, j2, j3), r11.A01, r11.A00);
        }
        return r12.A02();
    }
}
