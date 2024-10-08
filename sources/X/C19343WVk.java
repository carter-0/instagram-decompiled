package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.WVk  reason: case insensitive filesystem */
public final class C19343WVk implements C20899X3q {
    public final /* synthetic */ C17586Vae A00;

    public C19343WVk(C17586Vae vae) {
        this.A00 = vae;
    }

    public final void ACr(1Ln r4) {
        String id;
        Hashtag hashtag = this.A00.A05;
        if (hashtag.getId() != null && ((id = hashtag.getId()) == null || id.length() == 0)) {
            r4.A0Q("hashtag_id", DbZ.A0d(hashtag.getId()));
        }
        C13990Tnq.A13(r4, hashtag);
        r4.A0R("hashtag_follow_status", C281965Ag.A02(hashtag));
    }
}
