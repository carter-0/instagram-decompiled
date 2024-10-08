package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* renamed from: X.UeT  reason: case insensitive filesystem */
public final class C15540UeT extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final X99 A03;
    public final X4C A04;

    public final int getViewTypeCount() {
        return 2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int i3;
        IgSimpleImageView igSimpleImageView;
        View.OnClickListener wb3;
        int i4;
        int A032 = AnonymousClass0fD.A03(515779323);
        C17674Vc5 vc5 = (C17674Vc5) obj;
        Integer A002 = C18214Vne.A00(vc5);
        Integer num = AnonymousClass05K.A00;
        if (A002 == num || A002 == AnonymousClass05K.A01) {
            Context context = this.A00;
            C17671Vc2 vc2 = (C17671Vc2) DbT.A0o(view);
            int A0M = AnonymousClass7TE.A0M(obj2);
            UserSession userSession = this.A02;
            AnonymousClass0iw r6 = this.A01;
            X99 x99 = this.A03;
            X4C x4c = this.A04;
            if (C18214Vne.A00(vc5) == num) {
                Hashtag hashtag = vc5.A00;
                hashtag.getClass();
                if (hashtag.Bh3() != null) {
                    vc2.A05.setUrl(hashtag.Bh3(), r6);
                }
                i3 = 0;
                vc2.A02.setText(0mp.A06("#%s", new Object[]{hashtag.getName()}));
                WB3.A00(vc2.A00, x99, hashtag, A0M, 3);
                ReelBrandingBadgeView reelBrandingBadgeView = vc2.A07;
                reelBrandingBadgeView.setIconDrawable((int) R.drawable.reel_hash_branding_icon);
                reelBrandingBadgeView.setVisibility(0);
                i2 = 8;
                vc2.A08.setVisibility(8);
                HashtagFollowButton hashtagFollowButton = vc2.A06;
                hashtagFollowButton.setVisibility(0);
                hashtagFollowButton.A01(r6, new C19389WXg(x99, A0M), hashtag);
            } else if (C18214Vne.A00(vc5) == AnonymousClass05K.A01) {
                User user = vc5.A02;
                user.getClass();
                DbU.A1S(r6, vc2.A05, user);
                DbU.A1H(vc2.A02, user);
                WB3.A00(vc2.A00, x99, user, A0M, 1);
                i2 = 8;
                vc2.A07.setVisibility(8);
                vc2.A06.setVisibility(8);
                FollowButton followButton = vc2.A08;
                i3 = 0;
                followButton.setVisibility(0);
                C267064at r1 = followButton.A0J;
                r1.A07(new C16362Utf(x99, A0M));
                r1.A03(r6, userSession, user);
            } else {
                String A003 = AnonymousClass000.A00(127);
                Integer A004 = C18214Vne.A00(vc5);
                A004.getClass();
                throw AnonymousClass7TF.A0W(A003, VEL.A00(A004));
            }
            TextView textView = vc2.A01;
            textView.setText(vc5.A05);
            textView.setVisibility(i3);
            if (AnonymousClass7TF.A0E(context).widthPixels <= 1000) {
                if (C18214Vne.A00(vc5) == num) {
                    i4 = 2131960865;
                } else if (C18214Vne.A00(vc5) == AnonymousClass05K.A01) {
                    i4 = 2131960866;
                } else {
                    String A005 = AnonymousClass000.A00(127);
                    Integer A006 = C18214Vne.A00(vc5);
                    A006.getClass();
                    throw AnonymousClass7TF.A0W(A005, VEL.A00(A006));
                }
                String string = context.getString(i4);
                vc2.A03.setVisibility(i2);
                igSimpleImageView = vc2.A04;
                igSimpleImageView.setVisibility(i3);
                wb3 = new WAD(context, x99, x4c, vc5, string, new CharSequence[]{string}, A0M);
            } else {
                vc2.A04.setVisibility(i2);
                igSimpleImageView = vc2.A03;
                igSimpleImageView.setVisibility(i3);
                wb3 = new WB3(A0M, 2, x99, vc5);
            }
            AnonymousClass0fU.A00(wb3, igSimpleImageView);
            AnonymousClass0fD.A0A(1516954681, A032);
            return;
        }
        String A007 = AnonymousClass000.A00(127);
        A002.getClass();
        IllegalArgumentException A0W = AnonymousClass7TF.A0W(A007, VEL.A00(A002));
        AnonymousClass0fD.A0A(-265003628, A032);
        throw A0W;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r4, Object obj, Object obj2) {
        int i;
        Integer A002 = C18214Vne.A00((C17674Vc5) obj);
        if (A002 == AnonymousClass05K.A00) {
            i = 0;
        } else if (A002 == AnonymousClass05K.A01) {
            i = 1;
        } else {
            String A003 = AnonymousClass000.A00(127);
            A002.getClass();
            throw AnonymousClass7TF.A0W(A003, VEL.A00(A002));
        }
        r4.A7U(i);
    }

    public C15540UeT(Context context, AnonymousClass0iw r2, UserSession userSession, X99 x99, X4C x4c) {
        this.A00 = context;
        this.A03 = x99;
        this.A02 = userSession;
        this.A01 = r2;
        this.A04 = x4c;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(-1387527727);
        if (i == 0 || i == 1) {
            View A08 = DbU.A08(LayoutInflater.from(this.A00), R.layout.row_recommended_user);
            A08.setTag(new C17671Vc2(A08));
            AnonymousClass0fD.A0A(-1553251795, A032);
            return A08;
        }
        IllegalArgumentException A0a = DbW.A0a("Unaccepted viewType InterestRecommendation: ", i);
        AnonymousClass0fD.A0A(1943421561, A032);
        throw A0a;
    }
}
