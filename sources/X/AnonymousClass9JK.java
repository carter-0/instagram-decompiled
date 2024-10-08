package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9JK  reason: invalid class name */
public final class AnonymousClass9JK extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public AnonymousClass9JK(C294645mn r8, String str) {
        this(r8, (String) null, (String) null, (String) null, str);
    }

    public final boolean equals(Object obj) {
        AnonymousClass9JK r3;
        Object obj2;
        Object obj3;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9JK) {
                    AnonymousClass9JK r32 = (AnonymousClass9JK) obj;
                    if (r32.A00 == 0 && 0qQ.A0K(this.A01, r32.A01) && 0qQ.A0K(this.A02, r32.A02) && 0qQ.A0K(this.A03, r32.A03) && 0qQ.A0K(this.A04, r32.A04)) {
                        str = this.A05;
                        str2 = r32.A05;
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
                if (obj instanceof AnonymousClass9JK) {
                    r3 = (AnonymousClass9JK) obj;
                    if (r3.A00 == 1 && 0qQ.A0K(this.A05, r3.A05)) {
                        obj2 = this.A01;
                        obj3 = r3.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 2:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9JK) {
                    r3 = (AnonymousClass9JK) obj;
                    if (r3.A00 == 2 && 0qQ.A0K(this.A01, r3.A01)) {
                        obj2 = this.A05;
                        obj3 = r3.A05;
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
                if (obj instanceof AnonymousClass9JK) {
                    AnonymousClass9JK r33 = (AnonymousClass9JK) obj;
                    if (r33.A00 == 3 && 0qQ.A0K(this.A04, r33.A04) && 0qQ.A0K(this.A02, r33.A02) && 0qQ.A0K(this.A01, r33.A01) && 0qQ.A0K(this.A05, r33.A05)) {
                        str = this.A03;
                        str2 = r33.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!0qQ.A0K(obj2, obj3) || !0qQ.A0K(this.A03, r3.A03) || !0qQ.A0K(this.A02, r3.A02)) {
            return false;
        }
        str = this.A04;
        str2 = r3.A04;
        if (!0qQ.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r0 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r2 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return r1 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c7, code lost:
        return r1 + r0.hashCode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0076;
                case 1: goto L_0x0043;
                case 2: goto L_0x009c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = r3.A04
            r2 = 0
            if (r0 != 0) goto L_0x003e
            r0 = 0
        L_0x000b:
            int r1 = r0 * 31
            java.lang.String r0 = r3.A02
            if (r0 != 0) goto L_0x0039
            r0 = 0
        L_0x0012:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            if (r0 != 0) goto L_0x0034
            r0 = 0
        L_0x001a:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A05
            if (r0 != 0) goto L_0x002f
            r0 = 0
        L_0x0022:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
        L_0x0027:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.hashCode()
        L_0x002d:
            int r1 = r1 + r2
            return r1
        L_0x002f:
            int r0 = r0.hashCode()
            goto L_0x0022
        L_0x0034:
            int r0 = r0.hashCode()
            goto L_0x001a
        L_0x0039:
            int r0 = r0.hashCode()
            goto L_0x0012
        L_0x003e:
            int r0 = r0.hashCode()
            goto L_0x000b
        L_0x0043:
            java.lang.String r0 = r3.A05
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            r2 = 0
            if (r0 != 0) goto L_0x0071
            r0 = 0
        L_0x0051:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            if (r0 != 0) goto L_0x006c
            r0 = 0
        L_0x0059:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
            if (r0 != 0) goto L_0x0067
            r0 = 0
        L_0x0061:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A04
            goto L_0x0027
        L_0x0067:
            int r0 = r0.hashCode()
            goto L_0x0061
        L_0x006c:
            int r0 = r0.hashCode()
            goto L_0x0059
        L_0x0071:
            int r0 = r0.hashCode()
            goto L_0x0051
        L_0x0076:
            java.lang.Object r0 = r3.A01
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.String r0 = r3.A02
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A04
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A05
            goto L_0x00c2
        L_0x009c:
            java.lang.Object r0 = r3.A01
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.String r0 = r3.A05
            r2 = 0
            if (r0 != 0) goto L_0x00cd
            r0 = 0
        L_0x00aa:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            if (r0 != 0) goto L_0x00c8
            r0 = 0
        L_0x00b2:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
            if (r0 == 0) goto L_0x00bd
            int r2 = r0.hashCode()
        L_0x00bd:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r0 = r3.A04
        L_0x00c2:
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
        L_0x00c8:
            int r0 = r0.hashCode()
            goto L_0x00b2
        L_0x00cd:
            int r0 = r0.hashCode()
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9JK.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        switch (this.A00) {
            case 0:
                sb = new StringBuilder();
                sb.append("CallerInfo(callerContext=");
                sb.append(this.A01);
                sb.append(", callerName=");
                sb.append(this.A02);
                sb.append(AnonymousClass000.A00(843));
                sb.append(this.A03);
                sb.append(", flow=");
                sb.append(this.A04);
                sb.append(", step=");
                str = this.A05;
                break;
            case 3:
                sb = new StringBuilder();
                sb.append("CommentViewState(id=");
                sb.append(this.A04);
                sb.append(C273654mx.A00(438));
                sb.append(this.A02);
                sb.append(C66579MXk.A00(81));
                sb.append(this.A01);
                sb.append(", username=");
                sb.append(this.A05);
                sb.append(", commentText=");
                str = this.A03;
                break;
            default:
                return super.toString();
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass9JK(ImageUrl imageUrl, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A02 = str2;
        this.A01 = imageUrl;
        this.A05 = str3;
        this.A03 = str4;
    }

    public AnonymousClass9JK(CallerContext callerContext, String str, String str2, String str3, String str4) {
        0qQ.A0B(str3, 4);
        this.A01 = callerContext;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
    }

    public AnonymousClass9JK(Boolean bool, String str, String str2, String str3, String str4) {
        0qQ.A0B(str, 1);
        this.A05 = str;
        this.A01 = bool;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = str4;
    }

    public AnonymousClass9JK(C294645mn r2, String str, String str2, String str3, String str4) {
        this.A01 = r2;
        this.A05 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = str4;
    }

    public AnonymousClass9JK() {
        this((Boolean) false, "", (String) null, (String) null, (String) null);
    }
}
