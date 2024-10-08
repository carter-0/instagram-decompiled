package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.8IL  reason: invalid class name */
public final class AnonymousClass8IL extends AnonymousClass0T0 implements AnonymousClass8IM {
    public final int A00;
    public final AnonymousClass8IJ A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8IL) {
                AnonymousClass8IL r5 = (AnonymousClass8IL) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && 0qQ.A0K(this.A03, r5.A03) && this.A04 == r5.A04 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean CbS() {
        return this.A04;
    }

    public final String getName() {
        return this.A03;
    }

    public final int hashCode() {
        int hashCode;
        String str;
        AnonymousClass8IJ r0 = this.A01;
        int i = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i2 = hashCode * 31;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "PROCESSING";
                break;
            case 2:
                str = "DONE";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        int hashCode2 = (i2 + str.hashCode() + intValue) * 31;
        String str2 = this.A03;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i3 = (hashCode2 + i) * 31;
        int i4 = 1237;
        if (this.A04) {
            i4 = 1231;
        }
        return ((i3 + i4) * 31) + this.A00;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("AudioFilterListItemModel(audioFilter=");
        sb.append(this.A01);
        sb.append(", filteringStatus=");
        Integer num = this.A02;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "PROCESSING";
                    break;
                case 2:
                    str = "DONE";
                    break;
                default:
                    str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                    break;
            }
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", name=");
        sb.append(this.A03);
        sb.append(C66579MXk.A00(47));
        sb.append(this.A04);
        sb.append(", itemType=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass8IL(AnonymousClass8IJ r1, Integer num, String str, int i, boolean z) {
        this.A01 = r1;
        this.A02 = num;
        this.A03 = str;
        this.A04 = z;
        this.A00 = i;
    }
}
