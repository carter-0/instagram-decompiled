package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.NYe  reason: case insensitive filesystem */
public final class C68820NYe extends AnonymousClass7FV implements AnonymousClass7FW {
    public final AnonymousClass7FE A00;
    public final CharSequence A01;
    public final Integer A02;
    public final AnonymousClass7FT A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68820NYe(AnonymousClass7FT r2, AnonymousClass7FE r3, CharSequence charSequence, Integer num) {
        super(r2);
        0qQ.A0B(charSequence, 1);
        this.A01 = charSequence;
        this.A02 = num;
        this.A00 = r3;
        this.A03 = r2;
    }

    public final boolean ARU() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68820NYe) {
                C68820NYe nYe = (C68820NYe) obj;
                if (!0qQ.A0K(this.A01, nYe.A01) || this.A02 != nYe.A02 || !0qQ.A0K(this.A00, nYe.A00) || !0qQ.A0K(this.A03, nYe.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0K = AnonymousClass7TE.A0K(this.A01);
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 0:
                str = "TAP";
                break;
            case 1:
                str = "TAP_AND_HOLD";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A07(this.A00, C51971G9r.A0F(str, intValue, A0K)));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("HiddenMessageContentViewModel(messageText=");
        A1A.append(this.A01);
        A1A.append(", revealAction=");
        switch (this.A02.intValue()) {
            case 0:
                str = "TAP";
                break;
            case 1:
                str = "TAP_AND_HOLD";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        A1A.append(str);
        A1A.append(", themeModel=");
        A1A.append(this.A00);
        A1A.append(", gestureDetectionModel=");
        return AnonymousClass7TG.A0n(this.A03, A1A);
    }
}
