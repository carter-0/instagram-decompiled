package X;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class GAX extends AnonymousClass0T0 {
    public final int A00 = 2;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public GAX(int i, int i2) {
        this((Integer) null, (Integer) null, (C62320sa) null, i, i2);
    }

    public final String A00() {
        String str;
        Rect rect = (Rect) this.A04;
        String A0R = 002.A0R("bounds:", 002.A0w("{l:", ", t:", ", r:", ", b:", '}', rect.left, rect.top, rect.right, rect.bottom));
        String A0O = 002.A0O("visibility:", this.A02);
        Number number = (Number) this.A03;
        if (number != null) {
            str = 002.A0O("lines:", number.intValue());
        } else {
            str = null;
        }
        List A1P = 0sr.A1P(new String[]{A0R, A0O, str});
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A1P) {
            String str2 = (String) next;
            if (!(str2 == null || str2.length() == 0)) {
                A1C.add(next);
            }
        }
        return 002.A0E(DbT.A0z(", ", A1C, (0sP) null), '{', '}');
    }

    public final String A01(Integer num) {
        C52505GVi gVi = (C52505GVi) this.A05;
        int ordinal = gVi.ordinal();
        if (ordinal == 0 || ordinal == 3 || ordinal == 4) {
            return AnonymousClass7TF.A0j(gVi.name());
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(AnonymousClass7TF.A0j(gVi.name()));
        A1A.append('_');
        return AnonymousClass7TF.A0i(num, A1A);
    }

    public final boolean equals(Object obj) {
        GAX gax;
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GAX)) {
                    return false;
                }
                GAX gax2 = (GAX) obj;
                if (gax2.A00 == 0 && 0qQ.A0K(this.A03, gax2.A03) && this.A02 == gax2.A02 && this.A05 == gax2.A05 && this.A04 == gax2.A04 && this.A01 == gax2.A01) {
                    return true;
                }
                return false;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GAX)) {
                    return false;
                }
                gax = (GAX) obj;
                if (!(gax.A00 == 1 && this.A05 == gax.A05 && this.A01 == gax.A01 && 0qQ.A0K(this.A04, gax.A04) && this.A02 == gax.A02)) {
                    return false;
                }
            case 2:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GAX)) {
                    return false;
                }
                gax = (GAX) obj;
                if (!(gax.A00 == 2 && this.A01 == gax.A01 && this.A02 == gax.A02 && 0qQ.A0K(this.A05, gax.A05) && 0qQ.A0K(this.A04, gax.A04))) {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof GAX) {
                    GAX gax3 = (GAX) obj;
                    if (gax3.A00 == 3 && this.A01 == gax3.A01 && this.A03 == gax3.A03 && this.A02 == gax3.A02 && 0qQ.A0K(this.A04, gax3.A04)) {
                        obj2 = this.A05;
                        obj3 = gax3.A05;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
        }
        obj2 = this.A03;
        obj3 = gax.A03;
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0063;
                case 1: goto L_0x0047;
                case 2: goto L_0x0025;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = r3.A01
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            int r0 = r3.A02
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A04
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r3.A05
        L_0x001f:
            int r1 = r0.hashCode()
        L_0x0023:
            int r2 = r2 + r1
            return r2
        L_0x0025:
            int r0 = r3.A01
            int r1 = r0 * 31
            int r0 = r3.A02
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A05
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A04
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A03
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0023
        L_0x0047:
            java.lang.Object r0 = r3.A05
            int r1 = X.AnonymousClass7TE.A0K(r0)
            int r0 = r3.A01
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A04
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            int r0 = r3.A02
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r3.A03
            if (r0 != 0) goto L_0x001f
            r1 = 0
            goto L_0x0023
        L_0x0063:
            java.lang.Object r0 = r3.A03
            int r1 = X.AnonymousClass7TE.A0K(r0)
            int r0 = r3.A02
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r3.A05
            int r1 = X.AnonymousClass7TE.A0M(r0)
            switch(r1) {
                case 1: goto L_0x0095;
                case 2: goto L_0x0098;
                default: goto L_0x0077;
            }
        L_0x0077:
            java.lang.String r0 = "CHARACTER"
        L_0x0079:
            int r2 = X.C51971G9r.A0F(r0, r1, r2)
            java.lang.Object r0 = r3.A04
            int r1 = X.AnonymousClass7TE.A0M(r0)
            switch(r1) {
                case 1: goto L_0x008f;
                case 2: goto L_0x0092;
                default: goto L_0x0086;
            }
        L_0x0086:
            java.lang.String r0 = "PREFIX"
        L_0x0088:
            int r2 = X.C51971G9r.A0F(r0, r1, r2)
            int r1 = r3.A01
            goto L_0x0023
        L_0x008f:
            java.lang.String r0 = "WORD_ANY_ORDER"
            goto L_0x0088
        L_0x0092:
            java.lang.String r0 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE"
            goto L_0x0088
        L_0x0095:
            java.lang.String r0 = "WORD"
            goto L_0x0079
        L_0x0098:
            java.lang.String r0 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE"
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GAX.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                sb = AnonymousClass7TE.A1A();
                sb.append("SaytOdData(candidates=");
                sb.append(this.A03);
                sb.append(", thresholdFrequency=");
                sb.append(this.A02);
                sb.append(", tokenizationStrategy=");
                Number number = (Number) this.A05;
                if (number != null) {
                    switch (number.intValue()) {
                        case 1:
                            str = "WORD";
                            break;
                        case 2:
                            str = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                            break;
                        default:
                            str = "CHARACTER";
                            break;
                    }
                } else {
                    str = "null";
                }
                sb.append(str);
                sb.append(", matchingStrategy=");
                Number number2 = (Number) this.A04;
                if (number2 != null) {
                    switch (number2.intValue()) {
                        case 1:
                            str2 = "WORD_ANY_ORDER";
                            break;
                        case 2:
                            str2 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                            break;
                        default:
                            str2 = "PREFIX";
                            break;
                    }
                } else {
                    str2 = "null";
                }
                sb.append(str2);
                sb.append(", minTokens=");
                sb.append(this.A01);
                break;
            case 1:
                sb = AnonymousClass7TE.A1A();
                sb.append("UiElementRenderingDebugInfo(uiElementType=");
                sb.append(this.A05);
                sb.append(", viewUniqueIdentifier=");
                sb.append(this.A01);
                sb.append(AnonymousClass000.A00(2042));
                sb.append(this.A04);
                sb.append(", visibility=");
                sb.append(this.A02);
                sb.append(AnonymousClass000.A00(2032));
                sb.append(this.A03);
                break;
            default:
                return super.toString();
        }
        return AnonymousClass7TG.A0p(sb);
    }

    public GAX(Integer num, Integer num2, List list, int i, int i2) {
        C51972G9s.A1D(num, num2);
        this.A03 = list;
        this.A02 = i;
        this.A05 = num;
        this.A04 = num2;
        this.A01 = i2;
    }

    public GAX(C2611948q r2, Long l, Set set, int i, int i2) {
        0qQ.A0B(r2, 2);
        this.A01 = i;
        this.A03 = r2;
        this.A02 = i2;
        this.A04 = l;
        this.A05 = set;
    }

    public GAX(Integer num, Integer num2, C62320sa r4, int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        this.A05 = num;
        this.A04 = r4;
        this.A03 = num2;
    }

    public GAX(Rect rect, C52505GVi gVi, Integer num, int i, int i2) {
        0qQ.A0B(gVi, 1);
        this.A05 = gVi;
        this.A01 = i;
        this.A04 = rect;
        this.A02 = i2;
        this.A03 = num;
    }
}
