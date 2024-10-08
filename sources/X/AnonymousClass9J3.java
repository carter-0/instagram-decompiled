package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9J3  reason: invalid class name */
public final class AnonymousClass9J3 extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public boolean A04;
    public final int A05;
    public final Object A06;

    public AnonymousClass9J3(2PM r2, 2Eh r3, 2Eh r4, String str, boolean z) {
        this.A05 = 0;
        0qQ.A0B(r3, 4);
        0qQ.A0B(r4, 5);
        this.A00 = r2;
        this.A03 = str;
        this.A04 = z;
        this.A02 = r3;
        this.A01 = r4;
        this.A06 = new LinkedHashMap();
    }

    public final void A00(2Eh r3, String str, String str2, boolean z, boolean z2) {
        if (z2) {
            ((Map) this.A06).clear();
        }
        if (str.equals("all")) {
            this.A02 = r3;
            this.A04 = z;
            this.A03 = str2;
            return;
        }
        ((Map) this.A06).put(str, new C61077JwF(r3, str2, z));
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A05) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9J3) {
                    AnonymousClass9J3 r3 = (AnonymousClass9J3) obj;
                    if (r3.A05 == 0 && 0qQ.A0K(this.A00, r3.A00) && 0qQ.A0K(this.A03, r3.A03) && this.A04 == r3.A04 && 0qQ.A0K(this.A02, r3.A02)) {
                        obj2 = this.A01;
                        obj3 = r3.A01;
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
                if (!(obj instanceof AnonymousClass9J3)) {
                    return false;
                }
                AnonymousClass9J3 r32 = (AnonymousClass9J3) obj;
                if (r32.A05 != 1 || !0qQ.A0K(this.A03, r32.A03) || !0qQ.A0K(this.A00, r32.A00) || !0qQ.A0K(this.A06, r32.A06) || !0qQ.A0K(this.A02, r32.A02) || !0qQ.A0K(this.A01, r32.A01) || this.A04 != r32.A04) {
                    return false;
                }
                return true;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9J3) {
                    AnonymousClass9J3 r33 = (AnonymousClass9J3) obj;
                    if (r33.A05 == 2 && this.A04 == r33.A04 && 0qQ.A0K(this.A00, r33.A00) && 0qQ.A0K(this.A01, r33.A01) && 0qQ.A0K(this.A03, r33.A03) && 0qQ.A0K(this.A06, r33.A06)) {
                        obj2 = this.A02;
                        obj3 = r33.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        Object obj;
        int hashCode3;
        int i;
        switch (this.A05) {
            case 0:
                Object obj2 = this.A00;
                int i2 = 0;
                if (obj2 == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj2.hashCode();
                }
                int i3 = hashCode * 31;
                String str = this.A03;
                if (str != null) {
                    i2 = str.hashCode();
                }
                int i4 = (i3 + i2) * 31;
                int i5 = 1237;
                if (this.A04) {
                    i5 = 1231;
                }
                hashCode2 = (((i4 + i5) * 31) + this.A02.hashCode()) * 31;
                obj = this.A01;
                break;
            case 1:
                int hashCode4 = ((((((this.A03.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A02.hashCode()) * 31;
                Object obj3 = this.A01;
                if (obj3 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = obj3.hashCode();
                }
                hashCode2 = (hashCode4 + hashCode3) * 31;
                i = 1237;
                if (this.A04) {
                    i = 1231;
                    break;
                }
                break;
            default:
                int i6 = 1237;
                if (this.A04) {
                    i6 = 1231;
                }
                hashCode2 = ((((((((i6 * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A06.hashCode()) * 31;
                obj = this.A02;
                break;
        }
        i = obj.hashCode();
        return hashCode2 + i;
    }

    public final String toString() {
        if (this.A05 != 0) {
            return super.toString();
        }
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            AnonymousClass2PJ.A00(this, A0A);
            A0A.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            return super.toString();
        }
    }

    public AnonymousClass9J3(C274544oX r2, 1Xj r3, String str, AnonymousClass62P r5, AnonymousClass62P r6, boolean z) {
        this.A05 = 1;
        0qQ.A0B(str, 1);
        0qQ.A0B(r5, 3);
        0qQ.A0B(r6, 4);
        this.A03 = str;
        this.A00 = r3;
        this.A06 = r5;
        this.A02 = r6;
        this.A01 = r2;
        this.A04 = z;
    }

    public AnonymousClass9J3(AnonymousClass9IE r2, UserSession userSession, AnonymousClass3ZH r4, AnonymousClass3W1 r5, String str, boolean z) {
        this.A05 = 2;
        this.A04 = z;
        this.A00 = r4;
        this.A01 = r5;
        this.A03 = str;
        this.A06 = r2;
        this.A02 = userSession;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9J3(X.2PM r2, X.2Eh r3, X.2Eh r4, java.lang.String r5, kotlin.jvm.internal.DefaultConstructorMarker r6, int r7, int r8, boolean r9) {
        /*
            r1 = this;
            r6 = 0
            r1.A05 = r6
            r2 = 0
            X.2Ec r0 = X.C69942Ec.A00
            java.lang.Object r3 = r0.A00
            X.2Eh r3 = (X.2Eh) r3
            r4 = r3
            r5 = r2
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9J3.<init>(X.2PM, X.2Eh, X.2Eh, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker, int, int, boolean):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9J3() {
        /*
            r7 = this;
            r6 = 0
            r1 = r7
            r7.A05 = r6
            r2 = 0
            r7.A05 = r6
            X.2Ec r0 = X.C69942Ec.A00
            java.lang.Object r3 = r0.A00
            X.2Eh r3 = (X.2Eh) r3
            r4 = r3
            r5 = r2
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9J3.<init>():void");
    }
}
