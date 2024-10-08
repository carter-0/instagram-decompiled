package X;

import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Dlz  reason: case insensitive filesystem */
public final class C46823Dlz extends 2Rw {
    public List A00 = AnonymousClass7TE.A1C();
    public final AnonymousClass0iw A01;
    public final C47416E1k A02;

    public final void onBindViewHolder(C249703kE r11, int i) {
        0qQ.A0B(r11, 0);
        C61082JwK jwK = (C61082JwK) this.A00.get(i);
        C47025DpH dpH = (C47025DpH) r11;
        int i2 = 0;
        0qQ.A0B(jwK, 0);
        User user = (User) jwK.A00;
        IgTextView igTextView = dpH.A04;
        DbU.A1H(igTextView, user);
        boolean isVerified = user.isVerified();
        String username = user.getUsername();
        if (isVerified) {
            SpannableStringBuilder A0C = DbS.A0C(username);
            C244273av.A07(AnonymousClass7TE.A0S(igTextView), A0C, true);
            igTextView.setText(A0C);
        } else {
            igTextView.setText(username);
        }
        IgTextView igTextView2 = dpH.A05;
        igTextView2.setText(user.B8Q());
        IgImageView igImageView = dpH.A01;
        ImageUrl Bh3 = user.Bh3();
        C46823Dlz dlz = dpH.A06;
        igImageView.setUrl(Bh3, dlz.A01);
        boolean z = jwK.A01;
        ImageView imageView = dpH.A00;
        if (z) {
            imageView.setImageDrawable(C346697vb.A03(AnonymousClass7TE.A0S(dpH.A03), R.drawable.close_friends_star_small, 2));
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        FPG.A00(igTextView, 66, user, dlz);
        FPG.A00(igTextView2, 67, user, dlz);
        FPG.A00(igImageView, 68, user, dlz);
        FPG.A00(dpH.A02, 69, user, dlz);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C47025DpH((ViewGroup) DbW.A09(DbX.A0E(viewGroup), viewGroup, R.layout.birthday_center_user_item, false), this);
    }

    public C46823Dlz(AnonymousClass0iw r2, C47416E1k e1k) {
        this.A01 = r2;
        this.A02 = e1k;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(563238730);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-2142133776, A03);
        return size;
    }
}
