package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.E6n  reason: case insensitive filesystem */
public final class C47527E6n extends C227812jx implements AnonymousClass71G, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CommentLikesListFragment";
    public E9N A00;
    public String A01;
    public boolean A02;
    public AnonymousClass32A A03;
    public String A04;
    public final C47696EDf A05 = new C47696EDf(this, 49);
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final void D2y(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        String str;
        Reel reel2 = reel;
        GradientSpinnerAvatarView gradientSpinnerAvatarView2 = gradientSpinnerAvatarView;
        AnonymousClass7TG.A1N(reel, gradientSpinnerAvatarView);
        List A1I = AnonymousClass7TE.A1I(reel);
        AnonymousClass32A r3 = this.A03;
        if (r3 == null) {
            str = "reelViewerLauncher";
        } else {
            String str2 = this.A04;
            if (str2 == null) {
                str = "reelTraySessionId";
            } else {
                r3.A0C = str2;
                C50896Fkb.A00(getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), r3, this, 14);
                r3.A09(reel2, AnonymousClass3BQ.COMMENTS, gradientSpinnerAvatarView2, A1I, A1I, A1I);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DGM(User user, int i) {
    }

    public final void DRX(User user) {
    }

    public final void DwV(User user, int i) {
        0qQ.A0B(user, 0);
        AnonymousClass0eM r4 = this.A06;
        C46474Dfc A012 = C46548Dgp.A01(AnonymousClass7TE.A0l(r4), user.getId(), "comment_likes_user_row", "comment_likers");
        C309516Yo A0P = DbZ.A0P(this, r4);
        A0P.A0F = true;
        C46474Dfc.A03(A0P, AnonymousClass7TE.A0l(r4), C46447Df9.A02(), A012);
    }

    public final void DwW(View view, User user, int i) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void configureActionBar(2da r3) {
        DbW.A1C(r3, DbT.A06(this, r3, 0).getString(2131964955));
    }

    public final String getModuleName() {
        return "comment_likers";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, X.2ms] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1802067381);
        Bundle requireArguments = requireArguments();
        String A002 = AnonymousClass000.A00(893);
        if (requireArguments.containsKey(A002)) {
            String string = requireArguments().getString(A002, (String) null);
            this.A01 = string;
            if (string != null) {
                this.A04 = AnonymousClass7TF.A0b();
                AnonymousClass0eM r4 = this.A06;
                this.A03 = new AnonymousClass32A(this, AnonymousClass7TE.A0l(r4), DbV.A0f(this));
                super.onCreate(bundle);
                Context requireContext = requireContext();
                UserSession A0l = AnonymousClass7TE.A0l(r4);
                0qQ.A0B(A0l, 2);
                E9N e9n = new E9N(requireContext, (AnonymousClass4DH) null, (FAF) null, this, A0l, (C322776wO) null, new Object(), (G6X) null, this, (F1t) null, (C49423EvP) null, (C47522E6i) null, (C47522E6i) null, (C47522E6i) null, false, true, false, false, false, true, false, false, true);
                this.A00 = e9n;
                setAdapter(e9n);
                UserSession A0l2 = AnonymousClass7TE.A0l(r4);
                String str = this.A01;
                if (str != null) {
                    1OC A023 = FGQ.A02(A0l2, 0mp.A06(AnonymousClass000.A00(3551), new Object[]{str}), AnonymousClass000.A00(1204));
                    A023.A00 = this.A05;
                    schedule(A023);
                    AnonymousClass0fD.A09(1345745952, A022);
                    return;
                }
            }
            0qQ.A0F("commentId");
            throw AnonymousClass00P.createAndThrow();
        }
        IllegalStateException A0m = DbT.A0m();
        AnonymousClass0fD.A09(-2090414096, A022);
        throw A0m;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1573639842);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview_with_progress, viewGroup, false);
        AnonymousClass0fD.A09(-1679782029, A022);
        return inflate;
    }

    public final void onDestroy() {
        AnonymousClass7Q8 r0;
        int A022 = AnonymousClass0fD.A02(1986627310);
        E9N e9n = this.A00;
        if (!(e9n == null || (r0 = e9n.A06) == null)) {
            r0.A01();
        }
        super.onDestroy();
        AnonymousClass0fD.A09(1725942128, A022);
    }

    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        DbZ.A1D(recyclerView);
        recyclerView.A0S = true;
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1811866451);
        C47527E6n.super.onStart();
        if (this.A02) {
            E9N e9n = this.A00;
            if (e9n != null) {
                e9n.A0C = true;
            }
            DbY.A17(this, 2dZ.A0t, true);
            C46445Df7.A01(this, true);
        }
        AnonymousClass0fD.A09(418692530, A022);
    }
}
