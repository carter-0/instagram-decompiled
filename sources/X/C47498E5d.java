package X;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.text.LinkTextView;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.E5d  reason: case insensitive filesystem */
public final class C47498E5d extends AnonymousClass4DH implements G9c {
    public static final String __redex_internal_original_name = "UserSheetFragment";
    public AnonymousClass07i A00;
    public UserSession A01;
    public Reel A02;
    public AnonymousClass6UX A03;
    public User A04;
    public C49573Eyi A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public ShimmerFrameLayout A0I;
    public ShimmerFrameLayout A0J;
    public LinkTextView A0K;
    public C17675Vc6 A0L;
    public VWA A0M;
    public FollowButton A0N;
    public final 1P0 A0O = new C47685ECu(this, 6);
    public final 27S A0P = FX1.A00(this, 35);
    public final C318716pP A0Q = new C50456Fc3(this);
    public final X4O A0R = new FkH(this);
    public final X1V A0S = new FkI(this);
    public final C330317Mh A0T = new C51020FnC(this, 5);

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    private void A00() {
        this.A0F.setVisibility(8);
        this.A0J.setVisibility(8);
        if (this.A04 == null && !this.A0A) {
            this.A0J.setVisibility(0);
            this.A0J.A02();
        } else if (!this.A01.A06.equals(this.A09) && this.A0B) {
            this.A0F.setVisibility(0);
            this.A0N.setTextSize(2, 14.0f);
            FollowButton followButton = this.A0N;
            followButton.A00 = 0;
            followButton.setTypeface((Typeface) null, 1);
            0nA.A0Z(this.A0N, 0);
            C267064at r2 = this.A0N.A0J;
            UserSession userSession = this.A01;
            User user = this.A04;
            user.getClass();
            r2.A03(this, userSession, user);
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.V3l, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v2, types: [X.V3l, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b6, code lost:
        if (r0.A0E != false) goto L_0x00b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C47498E5d r20) {
        /*
            r0 = r20
            com.instagram.user.model.User r1 = r0.A04
            android.content.Context r4 = r0.requireContext()
            com.instagram.common.session.UserSession r3 = r0.A01
            X.Vc6 r2 = r0.A0L
            if (r1 != 0) goto L_0x002f
            r6 = 0
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.V3l r8 = new X.V3l
            r8.<init>()
            r8.A02 = r1
            r8.A01 = r6
            r8.A00 = r6
            r14 = 0
            X.VcU r5 = new X.VcU
            r7 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r15 = r14
            r16 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.C17028VFc.A00(r4, r0, r3, r5, r2)
        L_0x002e:
            return
        L_0x002f:
            com.instagram.common.typedurl.ImageUrl r6 = r1.Bh3()
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            r14 = 0
            X.V3l r9 = new X.V3l
            r9.<init>()
            r9.A02 = r5
            r9.A01 = r6
            r9.A00 = r14
            X.FkG r8 = new X.FkG
            r8.<init>(r1, r0)
            android.content.Context r6 = r0.requireContext()
            java.lang.String r5 = r1.getUsername()
            android.text.SpannableStringBuilder r13 = X.DbS.A0C(r5)
            boolean r5 = r1.isVerified()
            if (r5 == 0) goto L_0x005c
            r5 = 1
            X.C244273av.A08(r6, r13, r5)
        L_0x005c:
            java.lang.String r5 = r1.getFullName()
            if (r5 == 0) goto L_0x0161
            android.text.SpannableStringBuilder r11 = X.DbS.A0C(r5)
        L_0x0066:
            android.content.Context r15 = r0.requireContext()
            com.instagram.common.session.UserSession r7 = r0.A01
            r5 = 2
            android.text.SpannableStringBuilder r17 = new android.text.SpannableStringBuilder
            r17.<init>()
            java.util.List r6 = r1.A0V()
            if (r6 == 0) goto L_0x009d
            java.util.List r6 = r1.A0V()
            X.0qQ.A0A(r6)
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x009d
            X.4Cl r6 = r1.A03
            java.lang.Integer r6 = r6.BVD()
            if (r6 == 0) goto L_0x009d
            android.content.res.Resources r16 = r15.getResources()
            X.0qQ.A0A(r7)
            r19 = r1
            r20 = r5
            r18 = r7
            X.C243483Yy.A02(r15, r16, r17, r18, r19, r20)
        L_0x009d:
            java.lang.String r12 = X.DbT.A10(r17)
            java.lang.String r6 = r1.getFullName()
            if (r6 == 0) goto L_0x015e
            android.text.SpannableStringBuilder r6 = X.DbS.A0C(r6)
        L_0x00ab:
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r15 = 0
            if (r6 == 0) goto L_0x00b8
            boolean r6 = r0.A0E
            r16 = 1
            if (r6 == 0) goto L_0x00ba
        L_0x00b8:
            r16 = 0
        L_0x00ba:
            com.instagram.model.reels.Reel r7 = r0.A02
            X.X4O r10 = r0.A0R
            X.VcU r6 = new X.VcU
            r17 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.C17028VFc.A00(r4, r0, r3, r6, r2)
            boolean r2 = r0.A0D
            if (r2 == 0) goto L_0x0109
            X.4Cl r2 = r1.A03
            com.instagram.api.schemas.SMBPartnerType r2 = r2.AyL()
            X.4os r7 = X.C324066yY.A00(r2, r1)
            if (r7 == 0) goto L_0x0109
            X.4Cl r2 = r1.A03
            com.instagram.api.schemas.SMBPartnerType r3 = r2.AyL()
            com.instagram.api.schemas.SMBPartnerType r2 = com.instagram.api.schemas.SMBPartnerType.GIFT_CARD
            if (r3 != r2) goto L_0x0133
            r2 = 2131954411(0x7f130aeb, float:1.954532E38)
            java.lang.String r2 = r0.getString(r2)
        L_0x00e9:
            android.content.Context r8 = r0.requireContext()
            android.view.View r3 = r0.A0H
            X.EzN r6 = new X.EzN
            r6.<init>(r3)
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            r3 = 9
            X.FOs r4 = new X.FOs
            r4.<init>((int) r3, (java.lang.Object) r7, (java.lang.Object) r1, (java.lang.Object) r0)
            java.lang.String r3 = "Required value was null."
            if (r2 == 0) goto L_0x019a
            X.EyP r3 = new X.EyP
            r3.<init>(r4, r5, r2)
            X.C49159EqQ.A00(r8, r6, r3)
        L_0x0109:
            r0.A00()
            com.instagram.feed.ui.text.LinkTextView r2 = r0.A0K
            r3 = 8
            r2.setVisibility(r3)
            com.facebook.shimmer.ShimmerFrameLayout r2 = r0.A0I
            r2.setVisibility(r3)
            com.instagram.user.model.User r2 = r0.A04
            java.lang.String r2 = r2.A0O()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0164
            boolean r2 = r0.A0E
            if (r2 != 0) goto L_0x0164
            com.facebook.shimmer.ShimmerFrameLayout r1 = r0.A0I
            r1.setVisibility(r15)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r0.A0I
            r0.A02()
            return
        L_0x0133:
            android.content.Context r6 = r0.requireContext()
            X.4Cl r2 = r1.A03
            com.instagram.api.schemas.SMBPartnerType r4 = r2.AyL()
            if (r4 != 0) goto L_0x0142
            java.lang.String r2 = ""
            goto L_0x00e9
        L_0x0142:
            int r3 = r4.ordinal()
            r2 = 6
            if (r3 == r2) goto L_0x015a
            r2 = 3
            if (r3 == r2) goto L_0x0156
            if (r3 != r5) goto L_0x019f
            r2 = 2131960991(0x7f13249f, float:1.9558666E38)
        L_0x0151:
            java.lang.String r2 = r6.getString(r2)
            goto L_0x00e9
        L_0x0156:
            r2 = 2131957624(0x7f131778, float:1.9551837E38)
            goto L_0x0151
        L_0x015a:
            r2 = 2131963077(0x7f132cc5, float:1.9562897E38)
            goto L_0x0151
        L_0x015e:
            r6 = 0
            goto L_0x00ab
        L_0x0161:
            r11 = 0
            goto L_0x0066
        L_0x0164:
            java.lang.String r2 = r1.A0O()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x002e
            com.instagram.feed.ui.text.LinkTextView r2 = r0.A0K
            r2.setVisibility(r15)
            java.lang.String r2 = r1.A0O()
            android.text.SpannableStringBuilder r5 = X.DbS.A0C(r2)
            android.content.Context r4 = r0.requireContext()
            com.instagram.common.session.UserSession r3 = r0.A01
            X.6pP r2 = r0.A0Q
            X.4Cl r1 = r1.A03
            X.3qt r1 = r1.Afr()
            if (r1 == 0) goto L_0x0198
            java.util.List r1 = r1.B1p()
        L_0x018f:
            X.C318726pQ.A01(r4, r5, r3, r2, r1)
            com.instagram.feed.ui.text.LinkTextView r0 = r0.A0K
            r0.setText(r5)
            return
        L_0x0198:
            r1 = 0
            goto L_0x018f
        L_0x019a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x019f:
            java.lang.UnsupportedOperationException r0 = X.DbZ.A0p(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47498E5d.A01(X.E5d):void");
    }

    public static void A02(C47498E5d e5d, String str) {
        C310216ac r2;
        C49573Eyi eyi = e5d.A05;
        if (!(eyi == null || (r2 = eyi.A02.A00) == null)) {
            r2.A01(eyi.A00, eyi.A01);
        }
        FragmentActivity requireActivity = e5d.requireActivity();
        UserSession userSession = e5d.A01;
        if (userSession != null) {
            AnonymousClass6W8 A0b = DbS.A0b(requireActivity, C46447Df9.A02().A01(userSession, C46548Dgp.A01(userSession, str, "reel_context_sheet_user", C49092EpH.A00(e5d, e5d.A06)).A04()), userSession, ModalActivity.class, "profile");
            A0b.A02 = e5d;
            A0b.A08();
            A0b.A0C(requireActivity);
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final Integer BkZ() {
        return AnonymousClass05K.A0G;
    }

    public final String getModuleName() {
        return C49092EpH.A00(this, this.A06);
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.E5d, X.07Z, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-743244049);
        C47498E5d.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = DbX.A0U(this);
        this.A09 = DbU.A0l(requireArguments, C273654mx.A00(235));
        this.A06 = DbU.A0l(requireArguments, "args_previous_module_name");
        this.A08 = requireArguments.getString(C273654mx.A00(1493));
        boolean equals = C273654mx.A00(814).equals(requireArguments.getString(C273654mx.A00(1486)));
        this.A0D = equals;
        this.A0C = equals;
        this.A04 = 17h.A00(this.A01).A02(this.A09);
        this.A07 = AnonymousClass7TF.A0b();
        this.A00 = AnonymousClass07i.A00(this);
        new AnonymousClass441(new C228602lw(requireContext(), this.A00)).A02(this.A01, this.A0T, this.A09);
        User user = this.A04;
        if (user != null) {
            UserSession userSession = this.A01;
            0qQ.A0B(userSession, 1);
            1OC A023 = C320126ro.A02(userSession, user.getId(), false);
            A023.A00 = new C47656EBq(1, this, user);
            1ES.A03(A023);
            this.A0A = false;
        }
        1OC A002 = 1OP.A00(this.A01, this.A09);
        A002.A00 = this.A0O;
        1ES.A00(requireContext(), this.A00, A002);
        this.A0E = false;
        AnonymousClass1Nd.A00(this.A01).A01(this.A0P, C2370836g.class);
        AnonymousClass0fD.A09(1898853515, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(734303477);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.user_sheet_fragment);
        AnonymousClass0fD.A09(512643370, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-367453883);
        super.onDestroy();
        AnonymousClass1Nd.A00(this.A01).A02(this.A0P, C2370836g.class);
        AnonymousClass0fD.A09(1340241043, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-582369704);
        super.onDestroyView();
        this.A03 = null;
        AnonymousClass0fD.A09(-1235288135, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-698989571);
        super.onResume();
        if (!this.A0B) {
            UserSession userSession = this.A01;
            User user = this.A04;
            user.getClass();
            0qQ.A0B(userSession, 0);
            if (DbV.A0i(userSession, user) == FollowStatus.A06) {
                this.A0B = true;
            }
        }
        A00();
        AnonymousClass0fD.A09(-23547177, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0L = new C17675Vc6(DbU.A0C(view, R.id.header_container));
        this.A0H = view.requireViewById(R.id.profile_support_button_container);
        this.A0F = view.requireViewById(R.id.follow_button_container);
        view.requireViewById(R.id.profile_follow_button).setVisibility(0);
        this.A0N = (FollowButton) view.requireViewById(R.id.profile_follow_button);
        this.A0J = (ShimmerFrameLayout) view.requireViewById(R.id.follow_button_shimmer_container);
        this.A0K = (LinkTextView) view.requireViewById(R.id.biography);
        this.A0I = (ShimmerFrameLayout) view.requireViewById(R.id.biography_shimmer_container);
        this.A0G = view.requireViewById(R.id.horizontal_divider);
        this.A0M = new VWA(DbU.A0C(view, R.id.media_preview_grid));
        A01(this);
    }
}
