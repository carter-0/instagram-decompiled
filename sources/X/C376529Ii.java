package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.user.model.User;

/* renamed from: X.9Ii  reason: invalid class name and case insensitive filesystem */
public final class C376529Ii extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C376529Ii(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.A00 = 0;
        0qQ.A0B(num4, 4);
        0qQ.A0B(num5, 5);
        this.A04 = num;
        this.A03 = num2;
        this.A05 = num3;
        this.A01 = num4;
        this.A02 = num5;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C376529Ii)) {
                    return false;
                }
                C376529Ii r3 = (C376529Ii) obj;
                if (r3.A00 == 0 && this.A04 == r3.A04 && this.A03 == r3.A03 && this.A05 == r3.A05 && this.A01 == r3.A01 && this.A02 == r3.A02) {
                    return true;
                }
                return false;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C376529Ii) {
                    C376529Ii r32 = (C376529Ii) obj;
                    if (r32.A00 == 1 && 0qQ.A0K(this.A05, r32.A05) && 0qQ.A0K(this.A04, r32.A04) && 0qQ.A0K(this.A02, r32.A02) && 0qQ.A0K(this.A01, r32.A01)) {
                        obj2 = this.A03;
                        obj3 = r32.A03;
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
                if (obj instanceof C376529Ii) {
                    C376529Ii r33 = (C376529Ii) obj;
                    if (r33.A00 == 2 && 0qQ.A0K(this.A02, r33.A02) && 0qQ.A0K(this.A03, r33.A03) && 0qQ.A0K(this.A05, r33.A05) && 0qQ.A0K(this.A04, r33.A04)) {
                        obj2 = this.A01;
                        obj3 = r33.A01;
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
                if (obj instanceof C376529Ii) {
                    C376529Ii r34 = (C376529Ii) obj;
                    if (r34.A00 == 3 && 0qQ.A0K(this.A04, r34.A04) && 0qQ.A0K(this.A01, r34.A01) && 0qQ.A0K(this.A05, r34.A05) && 0qQ.A0K(this.A03, r34.A03)) {
                        obj2 = this.A02;
                        obj3 = r34.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C376529Ii) {
                    C376529Ii r35 = (C376529Ii) obj;
                    if (r35.A00 == 4 && 0qQ.A0K(this.A01, r35.A01) && 0qQ.A0K(this.A02, r35.A02) && 0qQ.A0K(this.A03, r35.A03) && 0qQ.A0K(this.A04, r35.A04)) {
                        obj2 = this.A05;
                        obj3 = r35.A05;
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
        String str;
        String str2;
        String str3;
        String str4;
        int hashCode;
        String str5;
        int hashCode2;
        Object obj;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        switch (this.A00) {
            case 0:
                int intValue = ((Number) this.A04).intValue();
                if (1 != intValue) {
                    str = "CENTER_CROP";
                } else {
                    str = "CENTER";
                }
                int hashCode6 = (str.hashCode() + intValue) * 31;
                int intValue2 = ((Number) this.A03).intValue();
                if (1 != intValue2) {
                    str2 = "GREY";
                } else {
                    str2 = "MEDIA_AWARE_GRADIENT";
                }
                int hashCode7 = (hashCode6 + str2.hashCode() + intValue2) * 31;
                int intValue3 = ((Number) this.A05).intValue();
                if (1 != intValue3) {
                    str3 = "SQUARE";
                } else {
                    str3 = "PORTRAIT";
                }
                int hashCode8 = (hashCode7 + str3.hashCode() + intValue3) * 31;
                int intValue4 = ((Number) this.A01).intValue();
                if (1 != intValue4) {
                    str4 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                } else {
                    str4 = "BOUNCY";
                }
                hashCode = (hashCode8 + str4.hashCode() + intValue4) * 31;
                int intValue5 = ((Number) this.A02).intValue();
                if (1 != intValue5) {
                    str5 = "TEMPORARILY_SHOW_PREVIOUS_CONTENTS";
                } else {
                    str5 = "SHOW_BACKGROUND_PLACEHOLDER";
                }
                hashCode2 = str5.hashCode() + intValue5;
                break;
            case 1:
                hashCode = ((((((this.A05.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31;
                obj = this.A03;
                break;
            case 2:
                int hashCode9 = this.A02.hashCode() * 31;
                Object obj2 = this.A03;
                hashCode = 0;
                if (obj2 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = obj2.hashCode();
                }
                int i = (hashCode9 + hashCode3) * 31;
                Object obj3 = this.A05;
                if (obj3 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = obj3.hashCode();
                }
                int i2 = (i + hashCode4) * 31;
                Object obj4 = this.A04;
                if (obj4 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = obj4.hashCode();
                }
                hashCode2 = (i2 + hashCode5) * 31;
                Object obj5 = this.A01;
                if (obj5 != null) {
                    hashCode = obj5.hashCode();
                    break;
                }
                break;
            case 3:
                hashCode = ((((((this.A04.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A03.hashCode()) * 31;
                obj = this.A02;
                break;
            default:
                hashCode = ((((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31;
                obj = this.A05;
                break;
        }
        hashCode2 = obj.hashCode();
        return hashCode2 + hashCode;
    }

    public final String toString() {
        if (2 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("NewsfeedFollow(followUser=");
        sb.append(this.A02);
        sb.append(", following=");
        sb.append(this.A03);
        sb.append(", outgoing=");
        sb.append(this.A05);
        sb.append(", incomingRequest=");
        sb.append(this.A04);
        sb.append(", followBackEnabled=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C376529Ii(User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.A00 = 2;
        0qQ.A0B(user, 1);
        this.A02 = user;
        this.A03 = bool;
        this.A05 = bool2;
        this.A04 = bool3;
        this.A01 = bool4;
    }

    public C376529Ii(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
        this.A03 = obj5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C376529Ii(java.lang.Integer r8, java.lang.Integer r9, java.lang.Integer r10, java.lang.Integer r11, int r12) {
        /*
            r7 = this;
            r6 = r11
            r5 = 0
            r0 = 0
            r1 = r7
            r7.A00 = r0
            r0 = r12 & 8
            if (r0 == 0) goto L_0x000c
            java.lang.Integer r5 = X.AnonymousClass05K.A01
        L_0x000c:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r6 = X.AnonymousClass05K.A00
        L_0x0012:
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>((java.lang.Integer) r2, (java.lang.Integer) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (java.lang.Integer) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376529Ii.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, int):void");
    }
}
