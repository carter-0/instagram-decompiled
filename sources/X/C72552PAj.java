package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.PAj  reason: case insensitive filesystem */
public final class C72552PAj implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final AnonymousClass7XR A01;
    public final AnonymousClass7DZ A02;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        PBQ pbq = new PBQ(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_reply_to_author_message, false));
        this.A02.A00(pbq);
        return pbq;
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        0qQ.A0B(r2, 0);
        this.A02.A01(r2);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r5, AnonymousClass7FW r6) {
        PBQ pbq = (PBQ) r5;
        NYU nyu = (NYU) r6;
        AnonymousClass7TG.A1N(pbq, nyu);
        AnonymousClass0iw r3 = this.A00;
        IgProgressImageView igProgressImageView = pbq.A01;
        igProgressImageView.setAspectRatio(nyu.A00);
        igProgressImageView.setExpiration(nyu.A01);
        ImageUrl imageUrl = nyu.A02;
        if (imageUrl != null) {
            igProgressImageView.setUrl(imageUrl, r3);
        } else {
            igProgressImageView.A04();
        }
        AnonymousClass7FE r0 = nyu.A03;
        IgImageView igImageView = igProgressImageView.getIgImageView();
        igImageView.setImageRendererAndReset(C3265577g.A05(igImageView, r0));
        this.A02.A02(pbq, nyu);
    }

    public C72552PAj(AnonymousClass0iw r3, AnonymousClass7XR r4, AnonymousClass9HC r5) {
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = new AnonymousClass7DZ(AnonymousClass7TE.A1I(C3259074q.A01(new P86(this), r4, r5)));
    }
}
