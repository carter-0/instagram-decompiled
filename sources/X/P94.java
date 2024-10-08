package X;

import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

public final class P94 implements C74403PuJ {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ AnonymousClass74R A01;
    public final /* synthetic */ C3257073v A02;
    public final /* synthetic */ AnonymousClass776 A03;
    public final /* synthetic */ IgProgressImageView A04;
    public final /* synthetic */ DirectMessageIdentifier A05;
    public final /* synthetic */ boolean A06;

    public P94(AnonymousClass0iw r1, AnonymousClass74R r2, C3257073v r3, AnonymousClass776 r4, IgProgressImageView igProgressImageView, DirectMessageIdentifier directMessageIdentifier, boolean z) {
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = directMessageIdentifier;
        this.A04 = igProgressImageView;
        this.A03 = r4;
        this.A00 = r1;
        this.A06 = z;
    }

    public final void D55(String str, boolean z) {
        this.A02.A00 = null;
        AnonymousClass74R r2 = this.A01;
        DirectMessageIdentifier directMessageIdentifier = this.A05;
        IgProgressImageView igProgressImageView = this.A04;
        AnonymousClass74R.A01(this.A00, DbS.A0V(str), r2, this.A03, igProgressImageView, directMessageIdentifier, true, this.A06, false);
    }

    public final void onError(String str) {
        0f9 AEf = 0wj.A01.AEf("GenericXmaContentDefinition: Error while fetching avatar sticker from Instamadillo media store", 817892914);
        AEf.ABQ("error_message", str);
        AEf.report();
    }
}
