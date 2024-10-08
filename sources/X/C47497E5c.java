package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.E5c  reason: case insensitive filesystem */
public final class C47497E5c extends AnonymousClass4DH implements G9c {
    public static final String __redex_internal_original_name = "ResharedPostSheetFragment";
    public UserSession A00;
    public User A01;
    public C49437Evd A02;
    public FAJ A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public View A07;
    public View A08;
    public ShimmerFrameLayout A09;
    public C17675Vc6 A0A;
    public FollowButton A0B;
    public String A0C;
    public String A0D;
    public final View.OnClickListener A0E = new C50109FOz((Object) this, 33);
    public final 1P0 A0F = new C47685ECu(this, 5);
    public final 27S A0G = FX1.A00(this, 34);

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public static void A00(C47497E5c e5c) {
        e5c.A08.setVisibility(8);
        e5c.A09.setVisibility(8);
        if (!e5c.A05) {
            e5c.A09.setVisibility(0);
            e5c.A09.A02();
            return;
        }
        User user = e5c.A01;
        if (user != null && !e5c.A00.A06.equals(user.getId()) && e5c.A06) {
            e5c.A08.setVisibility(0);
            e5c.A0B.setTextSize(2, 14.0f);
            FollowButton followButton = e5c.A0B;
            followButton.A00 = 0;
            followButton.setTypeface((Typeface) null, 1);
            0nA.A0Z(e5c.A0B, 0);
            e5c.A0B.A0J.A03(e5c, e5c.A00, e5c.A01);
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.V3l, java.lang.Object] */
    public static void A01(C47497E5c e5c) {
        C47497E5c e5c2 = e5c;
        Context requireContext = e5c2.requireContext();
        UserSession userSession = e5c2.A00;
        C17675Vc6 vc6 = e5c2.A0A;
        FAJ faj = e5c2.A03;
        ImageUrl imageUrl = faj.A00;
        Integer num = AnonymousClass05K.A00;
        ? obj = new Object();
        obj.A02 = num;
        obj.A01 = imageUrl;
        obj.A00 = null;
        C19441WZp wZp = new C19441WZp(e5c2, 2);
        CharSequence charSequence = faj.A01;
        String str = faj.A02;
        C17028VFc.A00(requireContext, e5c2, userSession, new C17699VcU((Reel) null, wZp, obj, (X4O) null, (CharSequence) null, (CharSequence) null, charSequence, str, true, false, DbW.A1a(str)), vc6);
        Context requireContext2 = e5c2.requireContext();
        C49604EzN ezN = new C49604EzN(e5c2.A07);
        Integer num2 = AnonymousClass05K.A01;
        boolean equals = e5c2.A04.equals("igtv");
        Resources A052 = DbV.A05(e5c2);
        int i = 2131972286;
        if (equals) {
            i = 2131972287;
        }
        String string = A052.getString(i);
        View.OnClickListener onClickListener = e5c2.A0E;
        if (string == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (onClickListener != null) {
            C49159EqQ.A00(requireContext2, ezN, new EyP(onClickListener, num2, string));
            A00(e5c2);
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public static void A02(C47497E5c e5c) {
        if (e5c.A04.equals("igtv")) {
            C49437Evd evd = e5c.A02;
            if (evd != null) {
                String str = e5c.A0C;
                C310216ac r2 = evd.A00.A00;
                if (r2 != null) {
                    0qQ.A0B(str, 0);
                    r2.A06.A01(str, r2.A01);
                    return;
                }
                return;
            }
            return;
        }
        F3W A032 = IgFragmentFactoryImpl.A00().A03(e5c.A0C);
        A032.A0E = "story_sticker";
        A032.A0N = true;
        Bundle A002 = A032.A00();
        DbT.A1L(e5c, DbV.A0Y(e5c.requireActivity(), A002, e5c.A00, ModalActivity.class, "single_media_feed"));
    }

    public final Integer BkZ() {
        return AnonymousClass05K.A0D;
    }

    public final String getModuleName() {
        return C49092EpH.A00(this, this.A0D);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(286024259);
        C47497E5c.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        this.A0C = DbU.A0l(requireArguments, C273654mx.A00(1489));
        this.A04 = DbU.A0l(requireArguments, C273654mx.A00(1490));
        this.A0D = DbU.A0l(requireArguments, "args_previous_module_name");
        this.A03 = new FAJ();
        1OC A042 = C3724090s.A04(this.A00, this.A0C);
        A042.A00 = this.A0F;
        Dbb.A15(this, A042);
        AnonymousClass1Nd.A00(this.A00).A01(this.A0G, C2370836g.class);
        AnonymousClass0fD.A09(-314171349, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(743007257);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.reshared_post_sheet_fragment);
        AnonymousClass0fD.A09(-140281991, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1448260819);
        super.onDestroy();
        AnonymousClass1Nd.A00(this.A00).A02(this.A0G, C2370836g.class);
        AnonymousClass0fD.A09(-360355778, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1129020119);
        super.onResume();
        User user = this.A01;
        if (user != null) {
            if (!this.A06) {
                UserSession userSession = this.A00;
                0qQ.A0B(userSession, 0);
                if (DbV.A0i(userSession, user) == FollowStatus.A06) {
                    this.A06 = true;
                }
            }
            A00(this);
        }
        AnonymousClass0fD.A09(1666997463, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0A = new C17675Vc6(DbU.A0C(view, R.id.header_container));
        this.A08 = view.requireViewById(R.id.follow_button_container);
        view.requireViewById(R.id.profile_follow_button).setVisibility(0);
        this.A0B = (FollowButton) view.requireViewById(R.id.profile_follow_button);
        this.A09 = (ShimmerFrameLayout) view.requireViewById(R.id.follow_button_shimmer_container);
        this.A07 = view.requireViewById(R.id.bottomsheet_action_button_container);
        A01(this);
    }
}
