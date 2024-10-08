package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.SellerBadgeDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* renamed from: X.Ugt  reason: case insensitive filesystem */
public final class C15688Ugt extends C252233om {
    public View A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgTextView A03;
    public CircularImageView A04;
    public User A05;
    public User A06;
    public final View.OnClickListener A07 = new C64273LXz(this, 56);
    public final AnonymousClass0iw A08;
    public final UserSession A09;
    public final C18782W1i A0A;

    /* JADX WARNING: type inference failed for: r1v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void A00(2da r5, SellerBadgeDictIntf sellerBadgeDictIntf, User user) {
        ViewGroup viewGroup = ((2dZ) r5).A0O;
        View inflate = DbV.A0D(viewGroup).inflate(R.layout.pdp_action_bar_title, viewGroup, false);
        this.A00 = inflate;
        if (inflate != null) {
            this.A04 = (CircularImageView) inflate.findViewById(R.id.merchant_avatar);
            IgTextView A0X = JTO.A0X(inflate, R.id.action_bar_title);
            this.A01 = A0X;
            if (A0X != null) {
                2eQ.A03(A0X);
            }
            IgTextView A0X2 = JTO.A0X(inflate, R.id.merchant_title);
            this.A02 = A0X2;
            if (A0X2 != null) {
                2eS.A01(A0X2);
            }
            IgTextView igTextView = this.A02;
            if (igTextView != null) {
                AnonymousClass0fU.A00(this.A07, igTextView);
            }
            ? r1 = this.A04;
            if (r1 != 0) {
                AnonymousClass0fU.A00(this.A07, r1);
            }
            r5.ETh(inflate);
        }
        A01(sellerBadgeDictIntf, user);
    }

    public final void onDestroyView() {
        this.A00 = null;
        this.A04 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
    }

    public final void A01(SellerBadgeDictIntf sellerBadgeDictIntf, User user) {
        String str;
        boolean z;
        String name;
        this.A06 = user;
        this.A05 = user;
        ImageUrl imageUrl = null;
        if (user != null) {
            str = user.getUsername();
            z = user.isVerified();
            imageUrl = user.Bh3();
        } else {
            str = null;
            z = false;
        }
        IgTextView igTextView = this.A02;
        if (igTextView != null) {
            igTextView.setVisibility(0);
            AnonymousClass7TH.A0R(this.A01);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            if (z) {
                C244273av.A08(AnonymousClass7TE.A0S(igTextView), spannableStringBuilder, true);
            }
            igTextView.setText(spannableStringBuilder);
            igTextView.setContentDescription(str);
        }
        IgImageView igImageView = this.A04;
        if (igImageView != null) {
            if (imageUrl == null) {
                igImageView.setVisibility(8);
            } else {
                igImageView.setVisibility(0);
                igImageView.setUrl(imageUrl, this.A08);
                C13989Tnp.A0z(igImageView.getContext(), igImageView, str, 2131970055);
            }
        }
        IgTextView igTextView2 = null;
        if (!(sellerBadgeDictIntf == null || (name = sellerBadgeDictIntf.getName()) == null)) {
            if (182.A06(0Tu.A05, this.A09, 36313815343696131L)) {
                View view = this.A00;
                if (view != null) {
                    igTextView2 = JTO.A0X(view, R.id.seller_badge);
                }
                this.A03 = igTextView2;
                if (igTextView2 != null) {
                    igTextView2.setVisibility(0);
                    igTextView2.setText(name);
                    return;
                }
                return;
            }
        }
        AnonymousClass7TH.A0R(this.A03);
    }

    public C15688Ugt(AnonymousClass0iw r3, UserSession userSession, C18782W1i w1i) {
        AnonymousClass7TG.A1P(userSession, w1i);
        this.A09 = userSession;
        this.A08 = r3;
        this.A0A = w1i;
    }
}
