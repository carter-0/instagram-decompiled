package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;

public final class I4X {
    public Integer A00;
    public final int A01;
    public final CdsBottomSheetDimmingBehaviour A02;
    public final C46626Di6 A03;
    public final Integer A04;
    public final C62320sa A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof I4X) {
                I4X i4x = (I4X) obj;
                if (!(this.A03 == i4x.A03 && this.A04 == i4x.A04 && this.A01 == i4x.A01 && 0qQ.A0K(this.A02, i4x.A02) && 0qQ.A0K(this.A05, i4x.A05) && this.A00 == i4x.A00 && this.A06 == i4x.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static I4X A00(C46626Di6 di6, Integer num, Integer num2, C62320sa r11, int i) {
        return new I4X(CdsBottomSheetDimmingBehaviour.Default.A00, di6, num, num2, r11, i, true);
    }

    public final int hashCode() {
        String str;
        int A0K = AnonymousClass7TE.A0K(this.A03);
        Integer num = this.A04;
        int A07 = AnonymousClass7TF.A07(this.A02, (AnonymousClass7TG.A0B(num, C46642DiN.A01(num), A0K) + this.A01) * 31);
        int i = 0;
        int A0C = (A07 + AnonymousClass7TG.A0C(this.A05)) * 31;
        Integer num2 = this.A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            switch (intValue) {
                case 1:
                    str = "FADE";
                    break;
                case 2:
                    str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                    break;
                default:
                    str = "DEFAULT";
                    break;
            }
            i = C51966G9m.A04(str, intValue);
        }
        return DbS.A06(this.A06, (A0C + i) * 31);
    }

    public I4X(CdsBottomSheetDimmingBehaviour cdsBottomSheetDimmingBehaviour, C46626Di6 di6, Integer num, Integer num2, C62320sa r5, int i, boolean z) {
        AnonymousClass7TG.A1O(di6, num);
        this.A03 = di6;
        this.A04 = num;
        this.A01 = i;
        this.A02 = cdsBottomSheetDimmingBehaviour;
        this.A05 = r5;
        this.A00 = num2;
        this.A06 = z;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BottomSheetContainerParams(bottomSheetMode=");
        A1A.append(this.A03);
        A1A.append(", darkModeConfig=");
        A1A.append(C46642DiN.A01(this.A04));
        A1A.append(AnonymousClass000.A00(2029));
        A1A.append(this.A01);
        A1A.append(", dimmingBehaviour=");
        A1A.append(this.A02);
        A1A.append(", backButtonOverride=");
        A1A.append(this.A05);
        A1A.append(", animationType=");
        Integer num = this.A00;
        if (num != null) {
            str = C46621Di1.A01(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", addToBackStack=");
        return G9t.A1C(A1A, this.A06);
    }

    public I4X() {
        this(CdsBottomSheetDimmingBehaviour.Default.A00, C46626Di6.FULL_SHEET, AnonymousClass05K.A0C, (Integer) null, (C62320sa) null, 48, true);
    }
}
