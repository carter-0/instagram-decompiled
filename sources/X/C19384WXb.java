package X;

import android.content.Context;
import android.widget.ImageView;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.WXb  reason: case insensitive filesystem */
public final class C19384WXb implements C230152p2 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C18582VuY A01;

    public C19384WXb(Context context, C18582VuY vuY) {
        this.A00 = context;
        this.A01 = vuY;
    }

    public final void DIh(C268654dm r5, Hashtag hashtag) {
        C18582VuY.A00(this.A01, false);
        C59689JTv.A01(this.A00, "follow_hashtag_error", 2131962556, 0);
    }

    public final void DIi(AnonymousClass1XT r4, Hashtag hashtag) {
        C59689JTv.A07(this.A00, 2131962609);
        C18582VuY vuY = this.A01;
        C18023Vjz vjz = new C18023Vjz(vuY.A03);
        vjz.A09 = C13988Tno.A0R();
        vuY.A03 = vjz.A00();
    }

    public final void DIk(C268654dm r4, Hashtag hashtag) {
        C18582VuY.A00(this.A01, true);
        C59689JTv.A0F(this.A00, "unfollow_hashtag_error", 2131975860);
    }

    public final void DIl(AnonymousClass1XT r5, Hashtag hashtag) {
        C18582VuY vuY = this.A01;
        if (!DbX.A1a(vuY.A03.Ab5())) {
            ImageView imageView = vuY.A00;
            if (imageView == null) {
                0qQ.A0F("followButton");
                throw AnonymousClass00P.createAndThrow();
            }
            imageView.setVisibility(8);
        }
        C59689JTv.A07(this.A00, 2131975495);
        C18023Vjz vjz = new C18023Vjz(vuY.A03);
        vjz.A09 = 0;
        vuY.A03 = vjz.A00();
    }
}
