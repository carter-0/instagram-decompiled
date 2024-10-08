package X;

import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jvw  reason: case insensitive filesystem */
public final class C61058Jvw extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final int A06;

    public C61058Jvw(Integer num, String str, String str2, String str3) {
        this.A06 = 0;
        AnonymousClass7TG.A1U(str, str2, str3);
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A01 = num;
        this.A02 = null;
        this.A00 = null;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        C61058Jvw jvw;
        Object obj4;
        Object obj5;
        switch (this.A06) {
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61058Jvw) {
                    jvw = (C61058Jvw) obj;
                    if (jvw.A06 == 1 && 0qQ.A0K(this.A00, jvw.A00) && 0qQ.A0K(this.A02, jvw.A02) && 0qQ.A0K(this.A03, jvw.A03) && 0qQ.A0K(this.A04, jvw.A04)) {
                        obj4 = this.A05;
                        obj5 = jvw.A05;
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
                if (obj instanceof C61058Jvw) {
                    C61058Jvw jvw2 = (C61058Jvw) obj;
                    if (jvw2.A06 == 2 && 0qQ.A0K(this.A04, jvw2.A04) && 0qQ.A0K(this.A05, jvw2.A05) && 0qQ.A0K(this.A03, jvw2.A03) && 0qQ.A0K(this.A00, jvw2.A00) && 0qQ.A0K(this.A01, jvw2.A01)) {
                        obj2 = this.A02;
                        obj3 = jvw2.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 3:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61058Jvw) {
                    C61058Jvw jvw3 = (C61058Jvw) obj;
                    if (jvw3.A06 == 3 && 0qQ.A0K(this.A02, jvw3.A02) && 0qQ.A0K(this.A00, jvw3.A00) && 0qQ.A0K(this.A01, jvw3.A01) && 0qQ.A0K(this.A04, jvw3.A04) && 0qQ.A0K(this.A05, jvw3.A05)) {
                        obj2 = this.A03;
                        obj3 = jvw3.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 4:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61058Jvw) {
                    jvw = (C61058Jvw) obj;
                    if (jvw.A06 == 4 && 0qQ.A0K(this.A03, jvw.A03) && 0qQ.A0K(this.A05, jvw.A05) && 0qQ.A0K(this.A04, jvw.A04) && 0qQ.A0K(this.A02, jvw.A02)) {
                        obj4 = this.A00;
                        obj5 = jvw.A00;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 6:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61058Jvw) {
                    C61058Jvw jvw4 = (C61058Jvw) obj;
                    if (jvw4.A06 == 6 && 0qQ.A0K(this.A02, jvw4.A02) && 0qQ.A0K(this.A03, jvw4.A03) && 0qQ.A0K(this.A04, jvw4.A04) && 0qQ.A0K(this.A05, jvw4.A05) && 0qQ.A0K(this.A01, jvw4.A01)) {
                        obj2 = this.A00;
                        obj3 = jvw4.A00;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            default:
                return super.equals(obj);
        }
        if (!0qQ.A0K(obj4, obj5)) {
            return false;
        }
        obj2 = this.A01;
        obj3 = jvw.A01;
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00dc, code lost:
        r2 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00e1, code lost:
        return r2 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x008d, code lost:
        r2 = r0.hashCode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A06
            switch(r0) {
                case 1: goto L_0x000a;
                case 2: goto L_0x003b;
                case 3: goto L_0x0062;
                case 4: goto L_0x0092;
                case 5: goto L_0x0005;
                case 6: goto L_0x00b6;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r2 = super.hashCode()
            return r2
        L_0x000a:
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A04
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A05
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x00e0
        L_0x003b:
            java.lang.String r0 = r3.A04
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A05
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TE.A0L(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
            goto L_0x008d
        L_0x0062:
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A04
            int r0 = X.C41845B3m.A00(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A05
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A03
        L_0x008d:
            int r2 = r0.hashCode()
            goto L_0x00e0
        L_0x0092:
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A05
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A04
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A01
            goto L_0x00dc
        L_0x00b6:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A04
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A05
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TE.A0L(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
        L_0x00dc:
            int r2 = r0.hashCode()
        L_0x00e0:
            int r2 = r2 + r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61058Jvw.hashCode():int");
    }

    public C61058Jvw(MediaUploadMetadata mediaUploadMetadata, Boolean bool, String str, String str2, String str3) {
        this.A06 = 5;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = null;
        this.A00 = bool;
        this.A01 = mediaUploadMetadata;
    }

    public C61058Jvw(String str, String str2, String str3, String str4, Map map, Map map2) {
        this.A06 = 4;
        AnonymousClass7TG.A1U(str, str2, str3);
        AnonymousClass7TG.A1S(map, map2);
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A02 = str4;
        this.A00 = map;
        this.A01 = map2;
    }

    public C61058Jvw(ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, String str4) {
        this.A06 = 3;
        AnonymousClass7TG.A1S(str3, str4);
        this.A02 = str;
        this.A00 = imageUrl;
        this.A01 = imageUrl2;
        this.A04 = str2;
        this.A05 = str3;
        this.A03 = str4;
    }

    public C61058Jvw(Long l, Long l2, String str, String str2, String str3, String str4) {
        this.A06 = 2;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A00 = l;
        this.A01 = l2;
        this.A02 = str4;
    }

    public C61058Jvw(Float f, Integer num, String str, String str2, String str3, String str4) {
        this.A06 = 1;
        0qQ.A0B(str2, 3);
        this.A00 = f;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61058Jvw(Integer num, String str, String str2, String str3, String str4, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(num, str, str2, str3);
        this.A06 = 0;
    }

    public C61058Jvw() {
        this.A06 = 6;
        this.A06 = 6;
        C61037Jvb jvb = new C61037Jvb((String) null, 7, 18);
        this.A06 = 6;
        this.A02 = "";
        this.A03 = "";
        this.A04 = "";
        this.A05 = null;
        this.A01 = null;
        this.A00 = jvb;
    }
}
