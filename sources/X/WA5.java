package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.model.hashtag.Hashtag;

public final class WA5 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ C20953X6g A01;
    public final /* synthetic */ HashtagFollowButton A02;
    public final /* synthetic */ Hashtag A03;
    public final /* synthetic */ boolean A04;

    public WA5(AnonymousClass0iw r1, C20953X6g x6g, HashtagFollowButton hashtagFollowButton, Hashtag hashtag, boolean z) {
        this.A02 = hashtagFollowButton;
        this.A04 = z;
        this.A03 = hashtag;
        this.A00 = r1;
        this.A01 = x6g;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(777057186);
        if (this.A04) {
            HashtagFollowButton hashtagFollowButton = this.A02;
            Hashtag hashtag = this.A03;
            AnonymousClass0iw r8 = this.A00;
            C20953X6g x6g = this.A01;
            Context context = hashtagFollowButton.getContext();
            SpannableStringBuilder A0D = DbY.A0D(context, hashtag.getName(), 2131975858);
            C358248ab r2 = new C358248ab(context);
            FH6.A0B(A0D);
            r2.A0q(A0D);
            r2.A0Q(new C18835W4z(1, hashtagFollowButton, r8, hashtag, x6g), C358278ae.RED, 2131975854);
            r2.A0C(new W5U(hashtagFollowButton, 22));
            if (hashtag.Bh3() != null) {
                r2.A0n(hashtag.Bh3(), r8);
            }
            DbT.A1V(r2);
        } else {
            C18023Vjz vjz = new C18023Vjz(this.A03);
            vjz.A08 = C13988Tno.A0R();
            Hashtag A002 = vjz.A00();
            HashtagFollowButton hashtagFollowButton2 = this.A02;
            AnonymousClass0iw r1 = this.A00;
            C20953X6g x6g2 = this.A01;
            hashtagFollowButton2.A01(r1, x6g2, A002);
            x6g2.D2V(A002);
        }
        AnonymousClass0fD.A0C(858511348, A05);
    }
}
