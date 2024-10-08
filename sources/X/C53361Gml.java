package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.List;

/* renamed from: X.Gml  reason: case insensitive filesystem */
public final class C53361Gml extends AnonymousClass0T0 {
    public final I12 A00;
    public final I12 A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final List A05;
    public final boolean A06;

    public static final C53361Gml A00(I12 i12, I12 i122, Integer num, Integer num2, Integer num3, List list, boolean z) {
        DbZ.A0t(0, num, list, num2);
        0qQ.A0B(num3, 6);
        return new C53361Gml(i12, i122, num, num2, num3, list, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53361Gml) {
                C53361Gml gml = (C53361Gml) obj;
                if (!(this.A03 == gml.A03 && 0qQ.A0K(this.A01, gml.A01) && 0qQ.A0K(this.A05, gml.A05) && this.A04 == gml.A04 && this.A06 == gml.A06 && 0qQ.A0K(this.A00, gml.A00) && this.A02 == gml.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        String str3;
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "GENERATED_IMAGE_SELECTION";
                break;
            case 2:
                str = "GENERATION_ERROR";
                break;
            default:
                str = "GENERATING";
                break;
        }
        int A07 = AnonymousClass7TF.A07(this.A05, (C51968G9o.A0F(str, intValue) + AnonymousClass7TG.A0C(this.A01)) * 31);
        int intValue2 = this.A04.intValue();
        if (1 != intValue2) {
            str2 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        } else {
            str2 = "MORE_RESULTS";
        }
        int A09 = (AnonymousClass7TF.A09(this.A06, C51971G9r.A0F(str2, intValue2, A07)) + AnonymousClass7TE.A0L(this.A00)) * 31;
        int intValue3 = this.A02.intValue();
        if (1 != intValue3) {
            str3 = "TOP";
        } else {
            str3 = "BOTH";
        }
        return A09 + C51966G9m.A04(str3, intValue3);
    }

    public C53361Gml(I12 i12, I12 i122, Integer num, Integer num2, Integer num3, List list, boolean z) {
        this.A03 = num;
        this.A01 = i12;
        this.A05 = list;
        this.A04 = num2;
        this.A06 = z;
        this.A00 = i122;
        this.A02 = num3;
    }
}
