package X;

import android.view.View;

/* renamed from: X.4Gq  reason: invalid class name and case insensitive filesystem */
public abstract class C262954Gq {
    public static final void A00(View.OnClickListener onClickListener, C262864Gh r7, C262744Fv r8, C262904Gl r9, AnonymousClass3V9 r10) {
        0qQ.A0B(r7, 2);
        if (r8 == null) {
            r10.A0A();
            return;
        }
        AnonymousClass3W1 r4 = r8.A04;
        AnonymousClass3VA r2 = r8.A05;
        String str = r8.A07;
        AnonymousClass3W1 r5 = r10.A02;
        if (r5 != null) {
            r5.A0M(r10, Integer.valueOf(r10.A00), true);
        }
        r10.A00 = -1;
        r10.A02 = null;
        0qQ.A0B(r2, 0);
        r10.A03 = r2;
        r10.A0F(r8.A01);
        String str2 = r8.A06;
        AnonymousClass3V9.A07(r10);
        C247753gr r0 = r10.A06;
        if (r0 != null) {
            r0.A01.setContentDescription(str2);
        }
        r10.A0H(str);
        int i = r8.A00;
        0qQ.A0B(r4, 1);
        r10.A00 = i;
        r10.A02 = r4;
        r4.A0L(r10, Integer.valueOf(i), false);
        AnonymousClass47M A07 = r4.A07(i, r2.ordinal());
        if (r4.A2G || r4.A1z) {
            A07.A00 = AnonymousClass05K.A00;
        }
        A07.A02 = r8.A0H;
        A07.A06 = r8.A0F;
        if (r8.A0E) {
            A07.A00 = AnonymousClass05K.A0C;
            r10.A0E = true;
        }
        if (r8.A0G) {
            A07.A03 = true;
        }
        C247753gr r02 = r10.A06;
        if (r02 != null) {
            AnonymousClass0fU.A00(onClickListener, r02.A00);
        }
        r10.A05 = r9;
        r10.A0C();
        r10.A04 = r8;
        AnonymousClass3V9.A07(r10);
        C247753gr r3 = r10.A06;
        if (r3 != null) {
            ((0sL) r8.A02.A04).invoke(r3.A01, r7);
        }
        r10.A0D();
        if (r8.A03 != null) {
            ((C62320sa) r8.A02.A03).invoke();
        } else if (r8.A0A) {
            ((0sP) r8.A02.A05).invoke(r7.CFD());
        }
        if (r2 == AnonymousClass3VA.ICONIC_ENTRYPOINTS) {
            ((C62320sa) r8.A02.A02).invoke();
        }
        r10.A0B();
    }
}
