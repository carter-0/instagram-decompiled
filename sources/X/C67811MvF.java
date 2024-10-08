package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MvF  reason: case insensitive filesystem */
public final class C67811MvF extends 2Rw {
    public RecyclerView A00;
    public AnonymousClass3UH A01 = new AnonymousClass3UH((AnonymousClass3UG) null);
    public final 1Ng A02;
    public final C229992ok A03;
    public final Context A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final C230022on A07;

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        this.A00 = recyclerView;
    }

    public final void onBindViewHolder(C249703kE r16, int i) {
        AnonymousClass3UL A002;
        TextView textView;
        String username;
        C249703kE r14 = r16;
        0qQ.A0B(r14, 0);
        AnonymousClass3UI A022 = this.A01.A02(i);
        if (A022 != null && (A002 = A022.A00()) != null) {
            User user = A002.A03;
            C68040Mz7 mz7 = (C68040Mz7) r14;
            FollowButton followButton = mz7.A08;
            followButton.A0A = true;
            if (user != null) {
                0xF r4 = new 0xF();
                0xF.A00(r4, true, "can_show_follow_back");
                0xF.A00(r4, Boolean.valueOf(user.A2A()), "following_current_user");
                String str = this.A01.A0C;
                if (!(str == null || str.length() == 0)) {
                    0xF.A00(r4, str, C273654mx.A00(161));
                }
                0xF.A00(r4, "profile", "format");
                0xF.A00(r4, this.A01.getId(), AnonymousClass000.A00(4143));
                C267064at r1 = followButton.A0J;
                r1.A0Q = false;
                r1.A07(new C69208NhO(1, A002, this));
                r1.A03 = r4;
                UserSession userSession = mz7.A05;
                AnonymousClass0iw r5 = this.A05;
                r1.A03(r5, userSession, user);
                String fullName = user.getFullName();
                if (fullName == null || fullName.length() == 0) {
                    textView = mz7.A04;
                    username = user.getUsername();
                } else {
                    textView = mz7.A04;
                    username = user.getFullName();
                }
                textView.setText(username);
                TextView textView2 = mz7.A03;
                textView2.setText(A002.A05);
                0Tu r42 = 0Tu.A06;
                int A042 = DbS.A04(r42, userSession, 36598051984444495L);
                if (A042 < 2) {
                    textView2.setMaxLines(A042);
                } else {
                    textView2.post(new PWY(r14));
                }
                AnonymousClass0fU.A00(new C71400Ojz(13, (Object) A002, (Object) this, (Object) mz7, (Object) r14), mz7.A01);
                C71399Ojy.A00(mz7.A06, A002, this, r14, 27);
                ExtendedImageUrl extendedImageUrl = A002.A01;
                CircularImageView circularImageView = mz7.A07;
                if (extendedImageUrl != null) {
                    circularImageView.setUrl(extendedImageUrl, r5);
                } else {
                    DbU.A1S(r5, circularImageView, user);
                }
                if (182.A06(r42, userSession, 36316577007931908L)) {
                    ImmutableList socialContextFacepileUsers = A002.getSocialContextFacepileUsers();
                    if (socialContextFacepileUsers == null || socialContextFacepileUsers.isEmpty()) {
                        textView2.setGravity(17);
                        mz7.A02.setVisibility(8);
                    } else {
                        textView2.setGravity(8388611);
                        ImageView imageView = mz7.A02;
                        Context context = mz7.A00;
                        imageView.setImageDrawable(C244283aw.A06(context, Float.valueOf(0.6f), Integer.valueOf(DbS.A02(context, 1)), (Integer) null, r5.getModuleName(), socialContextFacepileUsers, DbS.A02(context, 18)));
                        imageView.setVisibility(0);
                    }
                }
            }
            C230022on r12 = this.A07;
            r12.A00(this.A01, A002);
            r12.A00.A05(mz7.A01, r12.A01.A00(A002.getId()));
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        Context context = this.A04;
        return new C68040Mz7(context, DbU.A09(LayoutInflater.from(context), viewGroup, R.layout.immersive_suggested_users_layout, false), this.A06);
    }

    public final void A00(AnonymousClass3UH r6) {
        ArrayList arrayList;
        this.A01 = r6;
        AnonymousClass3UO r4 = AnonymousClass3UO.SUGGESTED_USER;
        List list = r6.A0P;
        if (list != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                if (((AnonymousClass3UI) next).A07 == r4) {
                    A1C.add(next);
                }
            }
            arrayList = 00k.A0U(A1C);
        } else {
            arrayList = null;
        }
        r6.A0P = arrayList;
        notifyDataSetChanged();
    }

    public C67811MvF(Context context, UserSession userSession, C229992ok r5, C230022on r6) {
        this.A04 = context;
        this.A06 = userSession;
        this.A03 = r5;
        this.A07 = r6;
        this.A05 = r5.AbT();
        this.A02 = AnonymousClass1Nd.A00(userSession);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(409398533);
        int A0H = C51971G9r.A0H(this.A01.A0P);
        AnonymousClass0fD.A0A(1026767955, A032);
        return A0H;
    }
}
