package X;

import android.os.Handler;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.google.common.collect.ImmutableList;

public final class AQH implements AnonymousClass84Y {
    public final /* synthetic */ C371478yM A00;
    public final /* synthetic */ ARRequestAsset A01;
    public final /* synthetic */ C392139uH A02;
    public final /* synthetic */ C39831ABc A03;
    public final /* synthetic */ C352728Ep A04;

    public AQH(C371478yM r1, ARRequestAsset aRRequestAsset, C392139uH r3, C39831ABc aBc, C352728Ep r5) {
        this.A02 = r3;
        this.A01 = aRRequestAsset;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = aBc;
    }

    public final void DBW(C314366i5 r8) {
        ImmutableList of = ImmutableList.of(this.A01);
        C352728Ep r4 = this.A04;
        C371478yM r1 = this.A00;
        AnonymousClass7TF.A1H(of, r4);
        C314366i5.A00((Handler) null, r1, r8.A04, r8, r4, of, false);
    }
}
