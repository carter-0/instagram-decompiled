package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Jvv  reason: case insensitive filesystem */
public final class C61057Jvv extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03 = 3;
    public final Object A04;
    public final Object A05;

    public C61057Jvv(Map map) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        this.A03 = 2;
        0qQ.A0B(map, 5);
        this.A02 = false;
        this.A04 = A1H;
        this.A01 = A1C;
        this.A05 = A1C2;
        this.A00 = map;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C61057Jvv) || ((C61057Jvv) obj).A03 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        Object obj2;
        Object obj3;
        switch (this.A03) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!A00(0, obj)) {
                    return false;
                }
                C61057Jvv jvv = (C61057Jvv) obj;
                if (!0qQ.A0K(this.A04, jvv.A04) || !0qQ.A0K(this.A01, jvv.A01) || !0qQ.A0K(this.A00, jvv.A00) || !0qQ.A0K(this.A05, jvv.A05) || this.A02 != jvv.A02) {
                    return false;
                }
                return true;
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this == obj) {
                    return true;
                }
                if (A00(2, obj)) {
                    C61057Jvv jvv2 = (C61057Jvv) obj;
                    if (this.A02 == jvv2.A02 && 0qQ.A0K(this.A04, jvv2.A04) && 0qQ.A0K(this.A01, jvv2.A01) && 0qQ.A0K(this.A05, jvv2.A05)) {
                        obj2 = this.A00;
                        obj3 = jvv2.A00;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (!A00(4, obj)) {
                    return false;
                }
                C61057Jvv jvv3 = (C61057Jvv) obj;
                if (0qQ.A0K(this.A04, jvv3.A04)) {
                    obj2 = this.A05;
                    obj3 = jvv3.A05;
                    break;
                } else {
                    return false;
                }
        }
        if (!A00(i, obj)) {
            return false;
        }
        C61057Jvv jvv4 = (C61057Jvv) obj;
        if (!0qQ.A0K(this.A05, jvv4.A05) || !0qQ.A0K(this.A00, jvv4.A00) || this.A02 != jvv4.A02 || !0qQ.A0K(this.A01, jvv4.A01)) {
            return false;
        }
        obj2 = this.A04;
        obj3 = jvv4.A04;
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K;
        int i;
        Object obj;
        switch (this.A03) {
            case 0:
                A0K = (((((AnonymousClass7TE.A0K(this.A04) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A05)) * 31;
                i = 1237;
                if (this.A02) {
                    i = 1231;
                    break;
                }
                break;
            case 1:
                A0K = AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A05))));
                obj = this.A04;
                break;
            case 2:
                A0K = AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A04, C51965G9l.A05(this.A02))));
                obj = this.A00;
                break;
            case 3:
                i = (AnonymousClass7TF.A09(this.A02, (AnonymousClass7TE.A0K(this.A05) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31;
                A0K = AnonymousClass7TE.A0L(this.A04);
                break;
            default:
                A0K = AnonymousClass7TE.A0K(this.A04);
                i = AnonymousClass7TG.A0C(this.A05);
                break;
        }
        i = obj.hashCode();
        return i + A0K;
    }

    public final String toString() {
        if (2 - this.A03 != 0) {
            return super.toString();
        }
        String A0L = 002.A0L("hasView : ", 10, this.A02);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("tagsInfo : ");
        A1A.append(this.A04);
        String A0r = C51967G9n.A0r(A1A, 10);
        StringBuilder A1A2 = AnonymousClass7TE.A1A();
        A1A2.append("updatePercentages : ");
        A1A2.append(this.A01);
        String A0r2 = C51967G9n.A0r(A1A2, 10);
        StringBuilder A1A3 = AnonymousClass7TE.A1A();
        A1A3.append("updateTimes : ");
        A1A3.append(this.A05);
        String A0r3 = C51967G9n.A0r(A1A3, 10);
        StringBuilder A1A4 = AnonymousClass7TE.A1A();
        A1A4.append("extras : ");
        A1A4.append(this.A00);
        String A11 = 002.A11(A0L, A0r, A0r2, A0r3, C51967G9n.A0r(A1A4, 10));
        0qQ.A07(A11);
        return A11;
    }

    public C61057Jvv(CharSequence charSequence, Integer num) {
        0qQ.A0B(charSequence, 1);
        this.A04 = charSequence;
        this.A05 = num;
    }

    public C61057Jvv(C61074JwC jwC, C247273g4 r3, AnonymousClass3W1 r4, CharSequence charSequence, boolean z) {
        0qQ.A0B(charSequence, 1);
        this.A05 = charSequence;
        this.A00 = jwC;
        this.A02 = z;
        this.A01 = r3;
        this.A04 = r4;
    }

    public C61057Jvv(C39741A7h a7h, C2802350v r5, C310416b1 r6, C369458un r7, int i, boolean z) {
        a7h = (i & 2) != 0 ? null : a7h;
        r6 = (i & 4) != 0 ? null : r6;
        r7 = (i & 8) != 0 ? null : r7;
        this.A03 = 0;
        0qQ.A0B(r5, 1);
        this.A04 = r5;
        this.A01 = a7h;
        this.A00 = r6;
        this.A05 = r7;
        this.A02 = z;
    }

    public C61057Jvv(C266444Yx r2, Integer num, C62320sa r4, 0sP r5, boolean z) {
        this.A05 = r2;
        this.A00 = num;
        this.A02 = z;
        this.A01 = r5;
        this.A04 = r4;
    }

    public C61057Jvv(C266444Yx r8) {
        this(r8, (Integer) null, (C62320sa) null, (0sP) null, false);
    }
}
