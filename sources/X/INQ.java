package X;

import com.instagram.model.mediasize.ExtendedImageUrl;

public final class INQ implements AnonymousClass3OS {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ ExtendedImageUrl A01;

    public INQ(1Xj r1, ExtendedImageUrl extendedImageUrl) {
        this.A01 = extendedImageUrl;
        this.A00 = r1;
    }

    public final void DJs(1NK r4) {
        0qQ.A0B(r4, 0);
        1OO A0J = r4.A0J(this.A01, "feed_timeline");
        A0J.A0I = false;
        A0J.A09 = this.A00.BTL();
        A0J.A01();
    }
}
