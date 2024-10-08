package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Vae  reason: case insensitive filesystem */
public final class C17586Vae {
    public GWX A00;
    public final 2el A01;
    public final C14435TwJ A02;
    public final IPE A03;
    public final WU4 A04;
    public final Hashtag A05;

    public C17586Vae(AnonymousClass0iw r3, UserSession userSession, 2el r5, C59630JQy jQy, C56524Hzv hzv, Hashtag hashtag) {
        GWX gwx;
        C51972G9s.A1D(userSession, hashtag);
        this.A01 = r5;
        this.A05 = hashtag;
        this.A03 = new IPE(hzv, (C18383Vqj) null);
        this.A02 = new C14435TwJ(r3, userSession, new C19343WVk(this));
        this.A04 = new WU4(hzv);
        if (jQy != null) {
            gwx = new GWX(jQy);
        } else {
            gwx = null;
        }
        this.A00 = gwx;
    }
}
