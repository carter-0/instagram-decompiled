package X;

import com.instagram.feed.widget.IgProgressImageView;

public final class IUD implements C246753fB {
    public final C231332rR A00;
    public final C246753fB A01;
    public final AnonymousClass2xS A02;

    public final void DPp(1Xj r2, IgProgressImageView igProgressImageView) {
        0qQ.A0B(r2, 0);
        this.A01.DPp(r2, igProgressImageView);
    }

    public IUD(C231332rR r1, C246753fB r2, AnonymousClass2xS r3) {
        AnonymousClass7TG.A1Q(r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void DKC(C240983Nk r3, 1Xj r4, AnonymousClass3W1 r5) {
        AnonymousClass7TG.A1O(r4, r5);
        r5.A0I(r3);
        if (r3.A02 != null && !this.A00.CRD() && r4.CeS()) {
            this.A02.A0F.A0D.sendEmptyMessage(0);
        }
    }
}
