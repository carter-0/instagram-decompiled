package X;

import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.CombinedClickableElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.5aW  reason: invalid class name and case insensitive filesystem */
public abstract class C287635aW {
    public static final Modifier A00(C287095Yz r13, C287605aT r14, Modifier modifier, C287625aV r16, String str, C62320sa r18, boolean z) {
        Modifier A02;
        C287085Yy r2;
        C287095Yz r22 = r13;
        C287605aT r3 = r14;
        C287625aV r4 = r16;
        String str2 = str;
        C62320sa r6 = r18;
        boolean z2 = z;
        if (r13 instanceof C287085Yy) {
            r2 = (C287085Yy) r22;
        } else if (r13 == null) {
            r2 = null;
        } else {
            if (r14 != null) {
                A02 = AnonymousClass5ZU.A00(r13, r14, Modifier.A00).Ezh(new ClickableElement((C287085Yy) null, r3, r4, str2, r6, z2));
            } else {
                A02 = C287435a8.A02(Modifier.A00, C287655aY.A00, new JH8(r22, r4, r6, str2, 0, z2));
            }
            return modifier.Ezh(A02);
        }
        A02 = new ClickableElement(r2, r3, r4, str2, r6, z2);
        return modifier.Ezh(A02);
    }

    public static final Modifier A02(C287095Yz r7, C287605aT r8, Modifier modifier, C62320sa r10) {
        return A00(r7, r8, modifier, (C287625aV) null, (String) null, r10, true);
    }

    public static final Modifier A03(C287095Yz r8, C287605aT r9, Modifier modifier, C62320sa r11) {
        return A01(r8, r9, modifier, (C287625aV) null, (C62320sa) null, (C62320sa) null, r11, true);
    }

    public static final Modifier A04(C287605aT r7, Modifier modifier, C62320sa r9) {
        return A00((C287095Yz) null, r7, modifier, (C287625aV) null, (String) null, r9, true);
    }

    public static final Modifier A06(Modifier modifier, C62320sa r3) {
        return A05(modifier, (C287625aV) null, (String) null, r3, true);
    }

    public static final Modifier A01(C287095Yz r19, C287605aT r20, Modifier modifier, C287625aV r22, C62320sa r23, C62320sa r24, C62320sa r25, boolean z) {
        Modifier A02;
        C287085Yy r2;
        C287095Yz r26 = r19;
        C287605aT r3 = r20;
        C287625aV r4 = r22;
        C62320sa r8 = r23;
        C62320sa r9 = r24;
        C62320sa r7 = r25;
        boolean z2 = z;
        if (r26 instanceof C287085Yy) {
            r2 = (C287085Yy) r26;
        } else if (r19 == null) {
            r2 = null;
        } else {
            C285245Qk r1 = Modifier.A00;
            if (r20 != null) {
                A02 = AnonymousClass5ZU.A00(r26, r3, r1).Ezh(new CombinedClickableElement((C287085Yy) null, r3, r4, (String) null, (String) null, r7, r8, r9, z2));
            } else {
                A02 = C287435a8.A02(r1, C287655aY.A00, new JHS(r26, r4, r7, r8, r9, (String) null, (String) null, 0, z2));
            }
            return modifier.Ezh(A02);
        }
        A02 = new CombinedClickableElement(r2, r3, r4, (String) null, (String) null, r7, r8, r9, z2);
        return modifier.Ezh(A02);
    }

    public static final Modifier A05(Modifier modifier, C287625aV r3, String str, C62320sa r5, boolean z) {
        return C287435a8.A02(modifier, C287655aY.A00, new C304936Fu(r3, str, r5, z));
    }
}
