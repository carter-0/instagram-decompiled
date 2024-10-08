package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.android.R;
import com.instagram.modal.ModalActivity;
import java.io.Serializable;

public final class NV7 extends NV8 implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "DirectChallengeCardGalleryFragment";
    public String A00;
    public C69309NjA A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(MYO.A01(this, 38));

    public final String getModuleName() {
        return "direct_challenges_card_gallery_fragment";
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, X.NKo, X.NV8, X.NV7, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Serializable serializable;
        C69309NjA njA;
        View view2 = view;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A0I = 2131954929;
        this.A0H = 2131954928;
        this.A01 = R.drawable.instagram_camera_outline_96;
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = C66580MXl.A0t(bundle2)) == null) {
            str = "";
        }
        this.A00 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("prompts_entry_point");
        } else {
            serializable = null;
        }
        if (serializable instanceof C69309NjA) {
            njA = (C69309NjA) serializable;
        } else {
            njA = null;
        }
        this.A01 = njA;
        Bundle bundle4 = this.mArguments;
        if (bundle4 == null || !bundle4.getBoolean("challenge_gallery_no_redirect")) {
            C67759MuF A0E = A0E();
            0qQ.A0C(A0E, "null cannot be cast to non-null type com.instagram.direct.fragment.cardgallery.model.DirectChallengesGalleryViewModel");
            AnonymousClass7TE.A1Z(new C66929MfO(A0E.A03, view2, this, (AnonymousClass4D7) null, 11), DbW.A0E(this));
        } else {
            A03(view, this);
            A04(this);
        }
        C73568Pfp.A02(view, this, DbW.A0E(this), 3);
    }

    public static final void A05(NV7 nv7) {
        Bundle bundle = nv7.mArguments;
        if (bundle != null) {
            bundle.putString("surface", "challenge_winner");
        }
        Bundle bundle2 = nv7.mArguments;
        AnonymousClass6W8 A0b = DbS.A0b(nv7.getActivity(), bundle2, AnonymousClass7TE.A0l(nv7.A0S), ModalActivity.class, "direct_card_gallery");
        A0b.A00 = 1;
        A0b.A0H = false;
        A0b.A08 = true;
        A0b.A0J = ModalActivity.A08;
        DbT.A1M(nv7, A0b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0.A01() != true) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.ODX A01(X.NV7 r9) {
        /*
            X.MuF r7 = r9.A0E()
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.direct.fragment.cardgallery.model.DirectChallengesGalleryViewModel"
            X.0qQ.A0C(r7, r5)
            X.N3R r6 = X.C67759MuF.A00(r7)
            r2 = 0
            if (r6 == 0) goto L_0x0059
            X.GMQ r0 = r6.A01
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.A01()
            r8 = 1
            if (r0 == r3) goto L_0x001e
        L_0x001d:
            r8 = 0
        L_0x001e:
            X.3U9 r0 = X.C66584MXp.A0N(r9)
            if (r0 == 0) goto L_0x002f
            X.3S9 r0 = r0.A01
            X.3Te r0 = r0.A0s
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.A0I
            if (r0 != r3) goto L_0x002f
            r1 = 1
        L_0x002f:
            r4 = r1 ^ 1
            X.Nil r1 = r6.A03
            if (r1 == 0) goto L_0x0059
            X.Nil r0 = X.C69285Nil.LOADING
            if (r1 == r0) goto L_0x0059
            java.lang.Boolean r0 = r9.A0F
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x005a
            if (r8 != 0) goto L_0x005a
            r0 = 2131973441(0x7f135541, float:1.9583918E38)
            java.lang.String r1 = X.DbU.A0m(r9, r0)
            r0 = 37
        L_0x0050:
            X.MYO r0 = X.MYO.A01(r9, r0)
        L_0x0054:
            X.ODX r2 = new X.ODX
            r2.<init>(r1, r0, r3)
        L_0x0059:
            return r2
        L_0x005a:
            java.lang.Boolean r0 = r9.A0F
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x00c1
            if (r8 == 0) goto L_0x00c1
            java.util.List r0 = r6.A0C
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x00c1
            boolean r0 = r7.A0D()
            if (r0 != 0) goto L_0x00c1
            X.MuF r0 = r9.A0E()
            X.0qQ.A0C(r0, r5)
            X.NVG r0 = (X.NVG) r0
            X.0Ud r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.N4R r0 = (X.N4R) r0
            java.lang.Object r5 = r0.A02
            X.MuF r0 = r9.A0E()
            X.N3R r0 = X.C67759MuF.A00(r0)
            if (r0 == 0) goto L_0x00bf
            java.util.ArrayList r4 = r0.A0B
        L_0x0091:
            r3 = 0
            if (r4 == 0) goto L_0x00b6
            int r2 = r4.size()
            if (r2 == 0) goto L_0x00b7
            android.content.res.Resources r1 = X.DbV.A05(r9)
            r0 = 2131820603(0x7f11003b, float:1.9273926E38)
            java.lang.String r1 = X.DbY.A0d(r1, r2, r0)
        L_0x00a5:
            X.0qQ.A0A(r1)
            if (r2 <= 0) goto L_0x00af
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r5 == r0) goto L_0x00af
            r3 = 1
        L_0x00af:
            r0 = 13
            X.Plq r0 = X.C73915Plq.A00(r9, r4, r0)
            goto L_0x0054
        L_0x00b6:
            r2 = 0
        L_0x00b7:
            r0 = 2131954905(0x7f130cd9, float:1.9546322E38)
            java.lang.String r1 = r9.getString(r0)
            goto L_0x00a5
        L_0x00bf:
            r4 = 0
            goto L_0x0091
        L_0x00c1:
            if (r4 == 0) goto L_0x00d3
            r0 = 2131954934(0x7f130cf6, float:1.9546381E38)
            if (r8 == 0) goto L_0x00cb
            r0 = 2131954935(0x7f130cf7, float:1.9546383E38)
        L_0x00cb:
            java.lang.String r1 = X.DbU.A0m(r9, r0)
            r0 = 36
            goto L_0x0050
        L_0x00d3:
            boolean r0 = r6.A0G
            if (r0 != 0) goto L_0x0059
            if (r8 != 0) goto L_0x0059
            r0 = 2131954951(0x7f130d07, float:1.9546416E38)
            java.lang.String r1 = X.DbU.A0m(r9, r0)
            r0 = 32
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NV7.A01(X.NV7):X.ODX");
    }

    public static final String A02(NV7 nv7) {
        GMQ gmq;
        C67759MuF A0E = nv7.A0E();
        0qQ.A0C(A0E, "null cannot be cast to non-null type com.instagram.direct.fragment.cardgallery.model.DirectChallengesGalleryViewModel");
        N3R A002 = C67759MuF.A00(A0E);
        boolean z = true;
        if (A002 == null || (gmq = A002.A01) == null || !gmq.A01()) {
            z = false;
        }
        if (A0E.A0D()) {
            return "winners_chosen";
        }
        if (z) {
            return "ended";
        }
        return AppStateModule.APP_STATE_ACTIVE;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.NKo, X.NV7, java.lang.Object, X.MYR] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(android.view.View r4, X.NV7 r5) {
        /*
            r0 = 2131441592(0x7f0b37b8, float:1.85052E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r4, r0)
            X.MuF r0 = r5.A0E()
            X.2Fk r2 = r0.A03
            r0 = 3
            X.PqU r1 = new X.PqU
            r1.<init>((int) r0, (java.lang.Object) r4, (java.lang.Object) r3, (java.lang.Object) r5)
            r0 = 35
            X.Dba.A15(r5, r2, r1, r0)
            androidx.recyclerview.widget.RecyclerView r3 = r5.getRecyclerView()
            X.2t9 r2 = r5.getAdapter()
            r0 = 39
            X.MYO r1 = X.MYO.A01(r5, r0)
            X.Mvg r0 = new X.Mvg
            r0.<init>(r2, r1)
            r3.A15(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NV7.A03(android.view.View, X.NV7):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r5 != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.NV7 r15) {
        /*
            X.3U9 r4 = X.C66584MXp.A0N(r15)
            X.0eM r0 = r15.A02
            X.OyR r7 = X.C66580MXl.A0T(r0)
            java.lang.String r9 = X.C66580MXl.A0w(r15)
            com.instagram.model.direct.DirectThreadKey r0 = r15.A0G()
            java.lang.String r10 = r0.A01
            java.lang.String r3 = r15.A00
            r0 = 0
            if (r3 != 0) goto L_0x0023
            java.lang.String r0 = "challengeId"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0023:
            if (r4 == 0) goto L_0x008a
            int r1 = r4.AdN()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
        L_0x002d:
            X.0eM r1 = r15.A0S
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r2 = r1.A06
            int r1 = r15.A02
            if (r4 == 0) goto L_0x003d
            X.3S9 r0 = r4.A01
            X.3Te r0 = r0.A0s
        L_0x003d:
            java.lang.String r4 = X.C329997La.A00(r0, r2, r1)
            A02(r15)
            android.os.Bundle r1 = r15.mArguments
            r5 = 1
            if (r1 == 0) goto L_0x0088
            java.lang.String r0 = "challenge_gallery_no_redirect"
            boolean r0 = r1.getBoolean(r0)
            if (r0 != r5) goto L_0x0088
        L_0x0051:
            X.NjA r2 = r15.A01
            if (r2 == 0) goto L_0x0086
            int r1 = r2.ordinal()
            r0 = 6
            if (r1 != r0) goto L_0x0086
            X.Nmb r6 = X.C69493Nmb.MEMBER_PARTICIPATION_HUB
        L_0x005e:
            X.NjA r0 = X.C69309NjA.PARTICIPATION_HUB
            if (r2 != r0) goto L_0x007c
            java.lang.String r13 = "member_participation_hub_cta_button"
            if (r5 == 0) goto L_0x0083
        L_0x0066:
            java.lang.String r14 = "challenge_winners_chosen_sheet"
        L_0x0068:
            java.lang.String r0 = "user_type"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r4)
            java.lang.String r0 = "challenge_id"
            java.util.LinkedHashMap r15 = X.DbY.A0p(r0, r3, r1)
            java.lang.String r11 = "challenge_submissions_sheet_rendered"
            java.lang.String r12 = "tap"
            X.C72202OyR.A03(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x007c:
            if (r5 == 0) goto L_0x0081
            java.lang.String r13 = "see_all_entries_button"
            goto L_0x0066
        L_0x0081:
            java.lang.String r13 = "challenge_pill"
        L_0x0083:
            java.lang.String r14 = "thread_view"
            goto L_0x0068
        L_0x0086:
            r6 = 0
            goto L_0x005e
        L_0x0088:
            r5 = 0
            goto L_0x0051
        L_0x008a:
            r8 = r0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NV7.A04(X.NV7):void");
    }

    public static final void A06(NV7 nv7, boolean z) {
        Integer num;
        String str;
        String str2;
        AnonymousClass3U9 A0N = C66584MXp.A0N(nv7);
        C72202OyR A0T = C66580MXl.A0T(nv7.A02);
        String A0w = C66580MXl.A0w(nv7);
        String str3 = nv7.A0G().A01;
        C242243Te r0 = null;
        if (A0N != null) {
            num = Integer.valueOf(A0N.AdN());
        } else {
            num = null;
        }
        String str4 = AnonymousClass7TE.A0l(nv7.A0S).A06;
        int i = nv7.A02;
        if (A0N != null) {
            r0 = A0N.A01.A0s;
        }
        String A002 = C329997La.A00(r0, str4, i);
        if (z) {
            str = "see_winners_button";
            str2 = "challenge_submissions_sheet";
        } else {
            str = "challenge_pill";
            str2 = "thread_view";
        }
        C72202OyR.A03((C69493Nmb) null, A0T, num, A0w, str3, "challenge_winners_sheet_rendered", "tap", str, str2, AnonymousClass7TF.A0w("user_type", A002));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C68495NKo.A00(intent, this, i, i2);
    }

    public final boolean onBackPressed() {
        return A0M();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1159223435);
        super.onCreate(bundle);
        this.A04 = A01(this);
        AnonymousClass0fD.A09(2110736430, A022);
    }
}
