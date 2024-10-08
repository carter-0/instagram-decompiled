package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.Map;

/* renamed from: X.GnK  reason: case insensitive filesystem */
public final class C53388GnK extends AnonymousClass0T0 {
    public final int A00 = 2;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53388GnK(java.lang.Long r12, java.util.Map r13, int r14) {
        /*
            r11 = this;
            r4 = r12
            r9 = r13
            r2 = 0
            r10 = 0
            r1 = r11
            r11.A00 = r10
            r0 = r14 & 1
            if (r0 == 0) goto L_0x000f
            X.0sm r9 = X.0Yt.A0E()
        L_0x000f:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x0014
            r4 = r2
        L_0x0014:
            r3 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r1.<init>((java.lang.Integer) r2, (java.lang.Integer) r3, (java.lang.Long) r4, (java.lang.Long) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.util.Map) r9, (boolean) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53388GnK.<init>(java.lang.Long, java.util.Map, int):void");
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C53388GnK) {
                    C53388GnK gnK = (C53388GnK) obj;
                    if (gnK.A00 == 0 && 0qQ.A0K(this.A01, gnK.A01) && this.A09 == gnK.A09 && 0qQ.A0K(this.A07, gnK.A07) && 0qQ.A0K(this.A02, gnK.A02) && 0qQ.A0K(this.A08, gnK.A08) && 0qQ.A0K(this.A06, gnK.A06) && 0qQ.A0K(this.A04, gnK.A04) && 0qQ.A0K(this.A05, gnK.A05)) {
                        obj2 = this.A03;
                        obj3 = gnK.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C53388GnK) {
                    C53388GnK gnK2 = (C53388GnK) obj;
                    if (gnK2.A00 == 1 && 0qQ.A0K(this.A06, gnK2.A06) && 0qQ.A0K(this.A07, gnK2.A07) && 0qQ.A0K(this.A08, gnK2.A08) && 0qQ.A0K(this.A05, gnK2.A05) && 0qQ.A0K(this.A01, gnK2.A01) && 0qQ.A0K(this.A02, gnK2.A02) && 0qQ.A0K(this.A03, gnK2.A03) && this.A09 == gnK2.A09) {
                        obj2 = this.A04;
                        obj3 = gnK2.A04;
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
                if (obj instanceof C53388GnK) {
                    C53388GnK gnK3 = (C53388GnK) obj;
                    if (gnK3.A00 == 2 && this.A09 == gnK3.A09 && 0qQ.A0K(this.A07, gnK3.A07) && 0qQ.A0K(this.A08, gnK3.A08) && 0qQ.A0K(this.A03, gnK3.A03) && 0qQ.A0K(this.A06, gnK3.A06) && 0qQ.A0K(this.A02, gnK3.A02) && 0qQ.A0K(this.A04, gnK3.A04) && 0qQ.A0K(this.A05, gnK3.A05)) {
                        obj2 = this.A01;
                        obj3 = gnK3.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092;
        int A0L;
        switch (this.A00) {
            case 0:
                A092 = (((((((((((AnonymousClass7TF.A09(this.A09, AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31;
                A0L = AnonymousClass7TE.A0L(this.A03);
                break;
            case 1:
                A0L = AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A08(this.A07, AnonymousClass7TE.A0O(this.A06))))))));
                A092 = AnonymousClass7TG.A0C(this.A04);
                break;
            default:
                int A052 = C51965G9l.A05(this.A09);
                A092 = (((AnonymousClass7TF.A07(this.A02, (((((AnonymousClass7TF.A08(this.A07, A052) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31;
                A0L = AnonymousClass7TE.A0L(this.A01);
                break;
        }
        return A092 + A0L;
    }

    public final String toString() {
        if (2 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UiState(isLoaded=");
        A1A.append(this.A09);
        A1A.append(", title=");
        A1A.append(this.A07);
        A1A.append(", username=");
        A1A.append(this.A08);
        A1A.append(", userProfilePictureUrl=");
        A1A.append(this.A03);
        A1A.append(", formattedCount=");
        A1A.append(this.A06);
        A1A.append(", thumbnailUrl=");
        A1A.append(this.A02);
        A1A.append(", usernameAttributionContentRes=");
        A1A.append(this.A04);
        A1A.append(", usernamePlaceholderContentRes=");
        A1A.append(this.A05);
        A1A.append(", isUsernameVerified=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }

    public C53388GnK(C56078HsR hsR, C56078HsR hsR2, ImageUrl imageUrl, ImageUrl imageUrl2, Boolean bool, String str, String str2, String str3, boolean z) {
        DbW.A1O(str, 2, imageUrl2);
        this.A09 = z;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = imageUrl;
        this.A06 = str3;
        this.A02 = imageUrl2;
        this.A04 = hsR;
        this.A05 = hsR2;
        this.A01 = bool;
    }

    public C53388GnK(NDK ndk, C63579KzS kzS, String str, String str2, String str3, C62320sa r7, C62320sa r8, 0sP r9, boolean z) {
        AnonymousClass7TF.A1C(str, 1, str3);
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A05 = ndk;
        this.A01 = r7;
        this.A02 = kzS;
        this.A03 = r9;
        this.A09 = z;
        this.A04 = r8;
    }

    public C53388GnK(Integer num, Integer num2, Long l, Long l2, String str, String str2, String str3, Map map, boolean z) {
        this.A01 = map;
        this.A09 = z;
        this.A07 = str;
        this.A02 = l;
        this.A08 = str2;
        this.A06 = str3;
        this.A04 = l2;
        this.A05 = num;
        this.A03 = num2;
    }
}
