package X;

import java.util.Set;

public final class NSY extends 0ng {
    public final /* synthetic */ C254923tH A00;
    public final /* synthetic */ C67210Mk6 A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Set A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NSY(C254923tH r4, C67210Mk6 mk6, Boolean bool, Integer num, String str, String str2, Set set, boolean z) {
        super(681755983, 3, false, false);
        this.A07 = z;
        this.A01 = mk6;
        this.A06 = set;
        this.A03 = num;
        this.A00 = r4;
        this.A02 = bool;
        this.A04 = str;
        this.A05 = str2;
    }

    public final void run() {
        if (this.A07) {
            this.A01.A04 = true;
            return;
        }
        C67210Mk6 mk6 = this.A01;
        Integer num = AnonymousClass05K.A00;
        Set set = this.A06;
        mk6.A09(this.A00, this.A02, num, this.A03, this.A04, this.A05, set);
    }
}
