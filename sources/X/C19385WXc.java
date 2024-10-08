package X;

import android.content.Context;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.WXc  reason: case insensitive filesystem */
public final class C19385WXc implements C230152p2 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ C59555JOb A02;

    public final void DIh(C268654dm r1, Hashtag hashtag) {
    }

    public final void DIi(AnonymousClass1XT r1, Hashtag hashtag) {
    }

    public final void DIk(C268654dm r5, Hashtag hashtag) {
        0qQ.A0B(hashtag, 0);
        1Xj r2 = this.A01;
        C18023Vjz vjz = new C18023Vjz(hashtag);
        Integer A0R = C13988Tno.A0R();
        vjz.A08 = A0R;
        vjz.A09 = A0R;
        r2.A0C.EX0(vjz.A00().FEY());
        C59689JTv.A01(this.A00, "unfollow_hashtag_error", 2131975860, 0);
    }

    public final void DIl(AnonymousClass1XT r4, Hashtag hashtag) {
        0qQ.A0B(hashtag, 0);
        1Xj r2 = this.A01;
        C18023Vjz vjz = new C18023Vjz(hashtag);
        vjz.A08 = 0;
        vjz.A09 = 0;
        r2.A0C.EX0(vjz.A00().FEY());
        this.A02.DJA(AnonymousClass3WA.MAIN_FEED_UNFOLLOW_HASHTAG);
    }

    public C19385WXc(Context context, 1Xj r2, C59555JOb jOb) {
        this.A01 = r2;
        this.A02 = jOb;
        this.A00 = context;
    }
}
