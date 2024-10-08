package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.MvE  reason: case insensitive filesystem */
public final class C67810MvE extends 2Rw {
    public List A00 = 0sn.A00;
    public final FragmentActivity A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final ONF A04;
    public final Long A05;

    public C67810MvE(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, ONF onf, Long l) {
        0qQ.A0B(userSession, 2);
        this.A02 = r3;
        this.A03 = userSession;
        this.A01 = fragmentActivity;
        this.A04 = onf;
        this.A05 = l;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        return new C68018Myk(DbU.A09(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.direct_card_recs_from_friends, false));
    }

    public final void A00(int i, String str) {
        this.A04.A00(this.A05, DbS.A0j(i), "follow_user", this.A02.getModuleName(), str, (long) getItemCount());
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r6, int i) {
        User user;
        C68018Myk myk = (C68018Myk) r6;
        0qQ.A0B(myk, 0);
        C241283Op r0 = ((C241303Or) this.A00.get(i)).A06;
        if (r0 != null && (user = r0.A02) != null) {
            CircularImageView circularImageView = myk.A02;
            ImageUrl Bh3 = user.Bh3();
            AnonymousClass0iw r4 = this.A02;
            circularImageView.setUrl(Bh3, r4);
            myk.A01.setText(user.B8Q());
            String fullName = user.getFullName();
            if (fullName == null || fullName.length() == 0) {
                myk.A00.setVisibility(8);
            } else {
                IgTextView igTextView = myk.A00;
                DbU.A1H(igTextView, user);
                igTextView.setVisibility(0);
            }
            C267064at r2 = myk.A04.A0J;
            r2.A03(r4, this.A03, user);
            r2.A07(new C69208NhO(2, myk, this));
            C71399Ojy.A00(myk.A03, user, this, myk, 31);
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(486766869);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(993203307, A032);
        return size;
    }
}
