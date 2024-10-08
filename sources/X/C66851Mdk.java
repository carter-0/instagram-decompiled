package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Mdk  reason: case insensitive filesystem */
public final class C66851Mdk extends AnonymousClass7FV implements AnonymousClass7FW {
    public final AnonymousClass7FT A00;
    public final AnonymousClass7FE A01;
    public final C271434iq A02;
    public final C331377Qt A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66851Mdk(AnonymousClass7FT r2, AnonymousClass7FE r3, C271434iq r4, C331377Qt r5, Integer num, Integer num2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(r2);
        DbW.A1O(num, 3, num2);
        this.A08 = z;
        this.A04 = num;
        this.A09 = z2;
        this.A0A = z3;
        this.A05 = num2;
        this.A03 = r5;
        this.A0C = z4;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A0D = z5;
        this.A0B = z6;
        this.A06 = str;
        this.A07 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66851Mdk) {
                C66851Mdk mdk = (C66851Mdk) obj;
                if (!(this.A08 == mdk.A08 && this.A04 == mdk.A04 && this.A09 == mdk.A09 && this.A0A == mdk.A0A && this.A05 == mdk.A05 && 0qQ.A0K(this.A03, mdk.A03) && this.A0C == mdk.A0C && 0qQ.A0K(this.A02, mdk.A02) && 0qQ.A0K(this.A01, mdk.A01) && 0qQ.A0K(this.A00, mdk.A00) && this.A0D == mdk.A0D && this.A0B == mdk.A0B && 0qQ.A0K(this.A06, mdk.A06) && 0qQ.A0K(this.A07, mdk.A07))) {
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
        int A012 = G9w.A01(C51965G9l.A05(this.A08));
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 0:
                str = "PLAY_VM_FROM_OTHERS";
                break;
            case 1:
                str = "REPLAY_VM_FROM_OTHERS";
                break;
            case 2:
                str = "REPLAY_VM_FROM_ME";
                break;
            case 3:
                str = "FAILED";
                break;
            case 4:
                str = "TOAST_SENDING_PHOTO";
                break;
            case 5:
                str = "TOAST_SENDING_VIDEO";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        int A092 = AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A09, C51971G9r.A0F(str, intValue, A012)));
        int intValue2 = this.A05.intValue();
        switch (intValue2) {
            case 0:
                str2 = "FAILED";
                break;
            case 1:
                str2 = "UPLOADED";
                break;
            default:
                str2 = "DEFAULT";
                break;
        }
        boolean z = this.A0C;
        return ((AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A09(z, (C51971G9r.A0F(str2, intValue2, A092) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31)))) + AnonymousClass7TG.A0E(this.A06)) * 31) + C41845B3m.A00(this.A07);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
