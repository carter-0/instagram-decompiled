package X;

import java.util.Map;

/* renamed from: X.9IO  reason: invalid class name */
public final class AnonymousClass9IO extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    public AnonymousClass9IO(int i, Integer num, int i2, int i3) {
        this.A00 = 2;
        0qQ.A0B(num, 2);
        this.A01 = i;
        this.A03 = num;
        this.A02 = i2;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
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
                if (!(obj instanceof AnonymousClass9IO)) {
                    return false;
                }
                AnonymousClass9IO r3 = (AnonymousClass9IO) obj;
                if (r3.A00 == 2 && this.A01 == r3.A01 && this.A03 == r3.A03 && this.A02 == r3.A02) {
                    return true;
                }
                return false;
            default:
                return super.equals(obj);
        }
        if (!(obj instanceof AnonymousClass9IO)) {
            return false;
        }
        AnonymousClass9IO r32 = (AnonymousClass9IO) obj;
        if (r32.A00 == i && this.A01 == r32.A01 && this.A02 == r32.A02 && this.A03 == r32.A03) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                i = ((this.A01 * 31) + this.A02) * 31;
                i3 = ((Number) this.A03).intValue();
                if (1 == i3) {
                    str = "DURATION";
                    break;
                } else {
                    str = "CURRENT";
                    break;
                }
            case 1:
                i = ((this.A01 * 31) + this.A02) * 31;
                i3 = ((Number) this.A03).intValue();
                if (1 == i3) {
                    str = "THREAD_VIEW";
                    break;
                } else {
                    str = "INBOX";
                    break;
                }
            case 2:
                int i4 = this.A01 * 31;
                int intValue = ((Number) this.A03).intValue();
                switch (intValue) {
                    case 1:
                        str2 = "HIGH";
                        break;
                    case 2:
                        str2 = "NORMAL";
                        break;
                    case 3:
                        str2 = "LOW";
                        break;
                    default:
                        str2 = C66579MXk.A00(209);
                        break;
                }
                i = (i4 + str2.hashCode() + intValue) * 31;
                i2 = this.A02;
                break;
            default:
                return super.hashCode();
        }
        i2 = str.hashCode() + i3;
        return i + i2;
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        switch (this.A00) {
            case 0:
                sb = new StringBuilder();
                sb.append("ClipsTimelineEditorTimeViewState(currentTime=");
                sb.append(this.A01);
                sb.append(", duration=");
                sb.append(this.A02);
                sb.append(", activeTimeEntry=");
                Number number = (Number) this.A03;
                if (number == null) {
                    str = "null";
                } else if (1 - number.intValue() != 0) {
                    str = "CURRENT";
                } else {
                    str = "DURATION";
                }
                sb.append(str);
                break;
            case 3:
                sb = new StringBuilder();
                sb.append("SignalsMetadataInPayload(signalsCount=");
                sb.append(this.A01);
                sb.append(", signalCountMap=");
                sb.append(this.A03);
                sb.append(", signalsSizeInBytes=");
                sb.append(this.A02);
                break;
            default:
                return super.toString();
        }
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass9IO(Integer num, int i, int i2, int i3) {
        this.A00 = i3;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = num;
    }

    public AnonymousClass9IO(int i, int i2, Map map) {
        this.A00 = 3;
        this.A01 = i;
        this.A03 = map;
        this.A02 = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9IO(Integer num, int i, int i2) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? AnonymousClass05K.A0N : num, 0, 2);
        this.A00 = 2;
    }
}
