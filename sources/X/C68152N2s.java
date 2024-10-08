package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.N2s  reason: case insensitive filesystem */
public final class C68152N2s extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final C15048ULb A02;
    public final Integer A03;
    public final Integer A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68152N2s) {
                C68152N2s n2s = (C68152N2s) obj;
                if (!(this.A01 == n2s.A01 && 0qQ.A0K(this.A02, n2s.A02) && this.A03 == n2s.A03 && this.A05 == n2s.A05 && this.A04 == n2s.A04 && this.A00 == n2s.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A07 = AnonymousClass7TF.A07(this.A02, C51975G9x.A03(this.A01));
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "TOP";
                break;
            case 2:
                str = "LEFT";
                break;
            case 3:
                str = "BOTTOM";
                break;
            case 4:
                str = "RIGHT";
                break;
            case 5:
                str = "SCALE";
                break;
            case 6:
                str = "FADE";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        return ((AnonymousClass7TF.A09(this.A05, C51971G9r.A0F(str, intValue, A07) * 31) + LKY.A00(this.A04)) * 31) + this.A00;
    }

    public C68152N2s(C15048ULb uLb, Integer num, Integer num2, int i, long j, boolean z) {
        this.A01 = j;
        this.A02 = uLb;
        this.A03 = num;
        this.A05 = z;
        this.A04 = num2;
        this.A00 = i;
    }
}
