package X;

/* renamed from: X.9JH  reason: invalid class name */
public final class AnonymousClass9JH extends AnonymousClass0T0 {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;

    public AnonymousClass9JH(String str, String str2) {
        this.A04 = 2;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = null;
        this.A00 = null;
    }

    public final boolean equals(Object obj) {
        AnonymousClass9JH r3;
        String str;
        String str2;
        Object obj2;
        Object obj3;
        switch (this.A04) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9JH) {
                    AnonymousClass9JH r32 = (AnonymousClass9JH) obj;
                    if (r32.A04 == 0 && 0qQ.A0K(this.A03, r32.A03) && 0qQ.A0K(this.A02, r32.A02) && 0qQ.A0K(this.A00, r32.A00)) {
                        obj2 = this.A01;
                        obj3 = r32.A01;
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
                if (obj instanceof AnonymousClass9JH) {
                    r3 = (AnonymousClass9JH) obj;
                    if (r3.A04 == 1 && 0qQ.A0K(this.A03, r3.A03) && 0qQ.A0K(this.A01, r3.A01)) {
                        str = this.A02;
                        str2 = r3.A02;
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
                if (obj instanceof AnonymousClass9JH) {
                    r3 = (AnonymousClass9JH) obj;
                    if (r3.A04 == 2 && 0qQ.A0K(this.A02, r3.A02) && 0qQ.A0K(this.A01, r3.A01)) {
                        str = this.A03;
                        str2 = r3.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!0qQ.A0K(str, str2)) {
            return false;
        }
        obj2 = this.A00;
        obj3 = r3.A00;
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2;
        int i2;
        String str;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        switch (this.A04) {
            case 0:
                i = ((((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode()) * 31;
                String str2 = this.A01;
                if (str2 != null) {
                    hashCode3 = str2.hashCode();
                    break;
                } else {
                    hashCode3 = 0;
                    break;
                }
            case 1:
                String str3 = this.A03;
                i = 0;
                if (str3 == null) {
                    hashCode = 0;
                } else {
                    hashCode = str3.hashCode();
                }
                int i3 = hashCode * 31;
                String str4 = this.A01;
                if (str4 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str4.hashCode();
                }
                i2 = (i3 + hashCode2) * 31;
                str = this.A02;
                break;
            default:
                int hashCode6 = this.A02.hashCode() * 31;
                String str5 = this.A01;
                i = 0;
                if (str5 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = str5.hashCode();
                }
                i2 = (hashCode6 + hashCode5) * 31;
                str = this.A03;
                break;
        }
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        hashCode3 = (i2 + hashCode4) * 31;
        Object obj = this.A00;
        if (obj != null) {
            i = obj.hashCode();
        }
        return i + hashCode3;
    }

    public final String toString() {
        if (2 - this.A04 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("NewsfeedStoryInlineControlItem(actionType=");
        sb.append(this.A02);
        sb.append(", actionText=");
        sb.append(this.A01);
        sb.append(", confirmationText=");
        sb.append(this.A03);
        sb.append(", controls=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass9JH(String str, String str2, String str3, int i) {
        this.A04 = 1;
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        this.A04 = 1;
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JH(int i) {
        this("", (String) null);
        this.A04 = i;
        if (1 - i != 0) {
            this.A04 = 2;
            return;
        }
        this.A04 = 1;
        this.A04 = 1;
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
    }

    public AnonymousClass9JH(Q1l q1l, String str, String str2, String str3) {
        this.A04 = 0;
        0qQ.A0B(str, 1);
        this.A03 = str;
        this.A02 = str2;
        this.A00 = q1l;
        this.A01 = str3;
    }
}
