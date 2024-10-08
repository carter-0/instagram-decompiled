package X;

import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import java.util.List;

/* renamed from: X.9Ie  reason: invalid class name and case insensitive filesystem */
public final class C376489Ie extends AnonymousClass0T0 {
    public Object A00;
    public boolean A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    public C376489Ie(C267324bN r3, C233462vl r4) {
        this.A02 = 0;
        this.A02 = 0;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = false;
        this.A00 = null;
    }

    public final boolean equals(Object obj) {
        switch (this.A02) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C376489Ie)) {
                    return false;
                }
                C376489Ie r3 = (C376489Ie) obj;
                if (r3.A02 == 0 && 0qQ.A0K(this.A03, r3.A03) && 0qQ.A0K(this.A04, r3.A04) && this.A01 == r3.A01 && this.A00 == r3.A00) {
                    return true;
                }
                return false;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C376489Ie)) {
                    return false;
                }
                C376489Ie r32 = (C376489Ie) obj;
                if (r32.A02 != 1 || !0qQ.A0K(this.A04, r32.A04) || !0qQ.A0K(this.A00, r32.A00) || this.A01 != r32.A01 || !0qQ.A0K(this.A03, r32.A03)) {
                    return false;
                }
                return true;
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C376489Ie)) {
                    return false;
                }
                C376489Ie r33 = (C376489Ie) obj;
                if (r33.A02 == 2 && this.A03 == r33.A03 && 0qQ.A0K(this.A00, r33.A00) && 0qQ.A0K(this.A04, r33.A04) && this.A01 == r33.A01) {
                    return true;
                }
                return false;
        }
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int i2;
        switch (this.A02) {
            case 0:
                int hashCode2 = this.A03.hashCode() * 31;
                Object obj = this.A04;
                i = 0;
                if (obj == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj.hashCode();
                }
                int i3 = (hashCode2 + hashCode) * 31;
                int i4 = 1237;
                if (this.A01) {
                    i4 = 1231;
                }
                i2 = (i3 + i4) * 31;
                Integer num = (Integer) this.A00;
                if (num != null) {
                    i = AnonymousClass93b.A01(num).hashCode() + num.intValue();
                    break;
                }
                break;
            case 1:
                int hashCode3 = ((this.A04.hashCode() * 31) + this.A00.hashCode()) * 31;
                int i5 = 1237;
                if (this.A01) {
                    i5 = 1231;
                }
                i = (hashCode3 + i5) * 31;
                i2 = this.A03.hashCode();
                break;
            default:
                i = ((((this.A03.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A04.hashCode()) * 31;
                i2 = 1237;
                if (this.A01) {
                    i2 = 1231;
                    break;
                }
                break;
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        switch (this.A02) {
            case 0:
                sb = new StringBuilder();
                sb.append("ClipsSponsoredContent(clipsItem=");
                sb.append(this.A03);
                sb.append(AnonymousClass000.A00(2017));
                sb.append(this.A04);
                sb.append(", isSyncFlowDelivered=");
                sb.append(this.A01);
                sb.append(", deliveredContext=");
                Integer num = (Integer) this.A00;
                if (num != null) {
                    str = AnonymousClass93b.A01(num);
                } else {
                    str = "null";
                }
                sb.append(str);
                break;
            case 2:
                sb = new StringBuilder();
                sb.append("OriginalAudioSubTypeAttributionModel(audioSubType=");
                sb.append(this.A03);
                sb.append(", originalAudioParts=");
                sb.append(this.A00);
                sb.append(", originalAudioPartsByFilter=");
                sb.append(this.A04);
                sb.append(", isAudioAutomaticallyAttributed=");
                sb.append(this.A01);
                break;
            default:
                return super.toString();
        }
        sb.append(')');
        return sb.toString();
    }

    public C376489Ie(OriginalAudioSubtype originalAudioSubtype, List list, List list2, boolean z) {
        this.A02 = 2;
        0qQ.A0B(originalAudioSubtype, 1);
        this.A03 = originalAudioSubtype;
        this.A00 = list;
        this.A04 = list2;
        this.A01 = z;
    }

    public C376489Ie(AnonymousClass7SD r3, C74536PwV pwV, MsysThreadSubtype msysThreadSubtype) {
        this.A02 = 1;
        this.A04 = msysThreadSubtype;
        this.A00 = r3;
        this.A01 = false;
        this.A03 = pwV;
    }
}
