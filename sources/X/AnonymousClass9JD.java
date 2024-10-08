package X;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.9JD  reason: invalid class name */
public final class AnonymousClass9JD extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JD(AnonymousClass9IL r3) {
        this(r3, "", "", (List) 0sn.A00);
        this.A04 = 0;
    }

    public final boolean equals(Object obj) {
        AnonymousClass9JD r3;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean A0K;
        switch (this.A04) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9JD) {
                    r3 = (AnonymousClass9JD) obj;
                    if (r3.A04 == 0 && 0qQ.A0K(this.A01, r3.A01) && 0qQ.A0K(this.A03, r3.A03)) {
                        A0K = 0qQ.A0K(this.A02, r3.A02);
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9JD) {
                    r3 = (AnonymousClass9JD) obj;
                    if (r3.A04 == 1 && 0qQ.A0K(this.A01, r3.A01)) {
                        obj3 = this.A02;
                        obj2 = r3.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 2:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9JD) {
                    r3 = (AnonymousClass9JD) obj;
                    if (r3.A04 == 2 && 0qQ.A0K(this.A02, r3.A02)) {
                        obj3 = this.A01;
                        obj2 = r3.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9JD) {
                    r3 = (AnonymousClass9JD) obj;
                    if (r3.A04 == 3 && 0qQ.A0K(this.A03, r3.A03) && 0qQ.A0K(this.A02, r3.A02)) {
                        obj4 = this.A01;
                        obj5 = r3.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!0qQ.A0K(obj3, obj2)) {
            return false;
        }
        obj4 = this.A03;
        obj5 = r3.A03;
        A0K = 0qQ.A0K(obj4, obj5);
        if (!A0K || !0qQ.A0K(this.A00, r3.A00)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A04
            switch(r0) {
                case 0: goto L_0x0062;
                case 1: goto L_0x002b;
                case 2: goto L_0x003d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = r3.A03
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.String r0 = r3.A02
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            if (r0 != 0) goto L_0x0026
            r0 = 0
        L_0x001b:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
        L_0x0026:
            int r0 = r0.hashCode()
            goto L_0x001b
        L_0x002b:
            java.lang.Object r0 = r3.A01
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.String r0 = r3.A02
            r2 = 0
            if (r0 == 0) goto L_0x007f
            int r0 = r0.hashCode()
            goto L_0x004d
        L_0x003d:
            java.lang.String r0 = r3.A02
            r2 = 0
            if (r0 != 0) goto L_0x0081
            r0 = 0
        L_0x0043:
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            if (r0 == 0) goto L_0x007f
            int r0 = r0.hashCode()
        L_0x004d:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            if (r0 != 0) goto L_0x0075
            r0 = 0
        L_0x0055:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            if (r0 == 0) goto L_0x0060
            int r2 = r0.hashCode()
        L_0x0060:
            int r1 = r1 + r2
            return r1
        L_0x0062:
            java.lang.Object r0 = r3.A01
            r2 = 0
            if (r0 != 0) goto L_0x007a
            r0 = 0
        L_0x0068:
            int r1 = r0 * 31
            java.lang.String r0 = r3.A03
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
        L_0x0075:
            int r0 = r0.hashCode()
            goto L_0x0055
        L_0x007a:
            int r0 = r0.hashCode()
            goto L_0x0068
        L_0x007f:
            r0 = 0
            goto L_0x004d
        L_0x0081:
            int r0 = r0.hashCode()
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9JD.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        switch (this.A04) {
            case 1:
                sb = new StringBuilder();
                sb.append("DraftComment(text=");
                sb.append(this.A01);
                sb.append(", repliedToCommentPk=");
                sb.append(this.A02);
                sb.append(", repliedToParentCommentPk=");
                sb.append(this.A03);
                str = ", slideMentionModel=";
                break;
            case 3:
                sb = new StringBuilder();
                sb.append("SliderStickerUiState(mediaId=");
                sb.append(this.A03);
                sb.append(", deliveryClass=");
                sb.append(this.A02);
                sb.append(", reelInteractives=");
                sb.append(this.A01);
                str = ", actions=";
                break;
            default:
                return super.toString();
        }
        sb.append(str);
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass9JD(AnonymousClass9IE r2, String str, String str2, List list) {
        this.A04 = 3;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = list;
        this.A00 = r2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JD(Boolean bool, Long l, String str, String str2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Boolean) null, (Long) null, (String) null, (String) null);
        this.A04 = 2;
    }

    public AnonymousClass9JD(Boolean bool, Long l, String str, String str2) {
        this.A04 = 2;
        this.A02 = str;
        this.A01 = l;
        this.A03 = str2;
        this.A00 = bool;
    }

    public AnonymousClass9JD(AnonymousClass9IL r2, String str, String str2, List list) {
        this.A04 = 0;
        0qQ.A0B(str, 2);
        this.A01 = r2;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = list;
    }

    public AnonymousClass9JD(AnonymousClass7a4 r2, CharSequence charSequence, String str, String str2) {
        this.A04 = 1;
        this.A01 = charSequence;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = r2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JD() {
        this((Boolean) null, (Long) null, (String) null, (String) null);
        this.A04 = 2;
        this.A04 = 2;
    }
}
