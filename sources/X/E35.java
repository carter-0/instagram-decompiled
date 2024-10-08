package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerModel;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class E35 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EditFeaturedFragment";
    public JVM A00;
    public User A01;
    public List A02;
    public List A03 = AnonymousClass7TE.A1C();
    public E93 A04;
    public E97 A05;
    public List A06 = AnonymousClass7TE.A1C();
    public final C355568Qm A07 = new C355568Qm(new C46805Dlh(this));
    public final String A08 = "ig_fb_profile_link_integration";
    public final String A09 = "banner_id";
    public final String A0A = AnonymousClass000.A00(1130);
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C = C227642jf.A02(this);

    /* JADX WARNING: type inference failed for: r1v1, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131969971);
        DbX.A1A(FPC.A00(this, 32), DbV.A0K(), r3);
        C59904JbT.A01(FPC.A00(this, 33), r3, new Object());
    }

    public final String getModuleName() {
        return "profile_edit_featured";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x009f, code lost:
        if (X.182.A06(X.0Tu.A05, X.AnonymousClass7TF.A0L(r8, 0), 36328877794016924L) != false) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
            r15 = this;
            r7 = 0
            r1 = r16
            X.0qQ.A0B(r1, r7)
            r0 = r17
            super.onViewCreated(r1, r0)
            r0 = 2131432722(0x7f0b1512, float:1.848721E38)
            android.view.View r13 = X.AnonymousClass7TF.A0G(r1, r0)
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            r0 = 2131428381(0x7f0b041d, float:1.8478405E38)
            android.view.View r6 = X.AnonymousClass7TF.A0F(r1, r0)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r0 = 2131438375(0x7f0b2b27, float:1.8498675E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r1, r0)
            r0 = 2131438376(0x7f0b2b28, float:1.8498677E38)
            android.view.View r10 = X.AnonymousClass7TF.A0G(r1, r0)
            r0 = 2131438412(0x7f0b2b4c, float:1.849875E38)
            android.view.View r11 = X.AnonymousClass7TF.A0G(r1, r0)
            r0 = 2131438373(0x7f0b2b25, float:1.8498671E38)
            android.view.View r9 = X.AnonymousClass7TF.A0G(r1, r0)
            java.util.List r0 = r15.A03
            int r0 = r0.size()
            r4 = 1
            r12 = 0
            if (r0 > r4) goto L_0x0044
            r12 = 1
        L_0x0044:
            r15.requireContext()
            java.util.List r3 = r15.A03
            X.0eM r8 = r15.A0C
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r8)
            r0 = 41
            X.JG2 r1 = new X.JG2
            r1.<init>(r0, r13, r15)
            X.E97 r0 = new X.E97
            r0.<init>(r2, r3, r1)
            r15.A05 = r0
            android.content.Context r0 = r15.requireContext()
            X.DbU.A15(r0, r13, r4, r7)
            X.E97 r0 = r15.A05
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "featuredAdapter"
        L_0x006a:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0072:
            r13.setAdapter(r0)
            X.8Qm r0 = r15.A07
            r0.A0A(r13)
            java.util.List r0 = r15.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a1
            X.0lg r0 = X.AnonymousClass7TF.A0L(r8, r7)
            java.lang.Boolean r0 = X.C46452DfG.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00a1
            X.0lg r3 = X.AnonymousClass7TF.A0L(r8, r7)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328877794016924(0x8110ec00003e9c, double:3.037866829361001E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00d2
        L_0x00a1:
            r9.setVisibility(r7)
            r11.setVisibility(r7)
            r0 = 4
            r10.setVisibility(r0)
            r5.setVisibility(r0)
            r15.requireContext()
            java.util.List r2 = r15.A06
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r8)
            X.E93 r0 = new X.E93
            r0.<init>(r1, r15, r2)
            r15.A04 = r0
            android.content.Context r0 = r15.requireContext()
            X.DbU.A15(r0, r6, r4, r7)
            X.E93 r0 = r15.A04
            if (r0 != 0) goto L_0x00cc
            java.lang.String r0 = "availableAdapter"
            goto L_0x006a
        L_0x00cc:
            r6.setAdapter(r0)
            r15.A00()
        L_0x00d2:
            r0 = 2131969897(0x7f134769, float:1.957673E38)
            if (r12 == 0) goto L_0x00da
            r0 = 2131969896(0x7f134768, float:1.9576728E38)
        L_0x00da:
            r5.setText(r0)
            X.07U r14 = X.07U.A05
            X.07Z r12 = r15.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r12)
            r16 = 0
            r17 = 18
            X.MHL r11 = new X.MHL
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.AnonymousClass7TE.A1Z(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E35.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00() {
        View view;
        0lg A0X = DbT.A0X(this.A0C);
        0qQ.A0B(A0X, 0);
        if (C46452DfG.A00(A0X).booleanValue() && (view = this.mView) != null) {
            View A0F = AnonymousClass7TF.A0F(view, R.id.featured_list);
            View A0G = AnonymousClass7TF.A0G(view, R.id.profile_featured_banners_nullstate_title_text);
            View A0G2 = AnonymousClass7TF.A0G(view, R.id.profile_featured_banners_nullstate_body_text);
            View A0G3 = AnonymousClass7TF.A0G(view, R.id.available_list);
            View A0G4 = AnonymousClass7TF.A0G(view, R.id.profile_available_banners_nullstate_body_text);
            if (this.A03.isEmpty()) {
                Dba.A0y(A0F, A0G, A0G2, 8, 0);
            } else {
                Dba.A0y(A0F, A0G, A0G2, 0, 8);
            }
            if (this.A06.isEmpty()) {
                A0G3.setVisibility(8);
                A0G4.setVisibility(0);
                return;
            }
            A0G3.setVisibility(0);
            A0G4.setVisibility(8);
        }
    }

    public static final void A01(E35 e35) {
        E35 e352 = e35;
        C50671FgW fgW = new C50671FgW(e35);
        C3249970q r3 = C3249970q.A00;
        Context requireContext = e35.requireContext();
        AnonymousClass0eM r1 = e35.A0C;
        UserSession A0l = AnonymousClass7TE.A0l(r1);
        User user = e35.A01;
        if (user != null) {
            AnonymousClass4EU r12 = null;
            e35.A03 = 00k.A0U(r3.A05(requireContext, (AiStudioProfileBannerModel) ((C46765Dks) e35.A0B.getValue()).A02.getValue(), e352, A0l, fgW, user, true));
            Context requireContext2 = e35.requireContext();
            UserSession A0l2 = AnonymousClass7TE.A0l(r1);
            User user2 = e35.A01;
            if (user2 != null) {
                ArrayList A0q = AnonymousClass7TF.A0q(A0l2, 1);
                boolean z = false;
                if (0qQ.A0K(user2.A03.BvM(), false) && C46452DfG.A00(A0l2).booleanValue()) {
                    z = true;
                }
                AnonymousClass5Bm r13 = null;
                if (z) {
                    C253663rB BMx = user2.A03.BMx();
                    if (BMx != null) {
                        r12 = BMx.BMz();
                    }
                    A0q.add(new AnonymousClass73R(requireContext2, r12, A0l2, fgW, user2));
                }
                if (0qQ.A0K(user2.A03.BvN(), false) && C46452DfG.A00(A0l2).booleanValue()) {
                    C253663rB BMx2 = user2.A03.BMx();
                    if (BMx2 != null) {
                        r13 = BMx2.BMy();
                    }
                    A0q.add(new AnonymousClass73S(requireContext2, r13, fgW, user2));
                }
                if (182.A06(0Tu.A05, A0l2, 36328877794016924L)) {
                    A0q.add(new C50666FgR(requireContext2));
                }
                e352.A06 = 00k.A0U(A0q);
                e352.A02 = 00k.A0U(e352.A03);
                return;
            }
        }
        0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public E35() {
        C51763G0f g0f = new C51763G0f(this, 34);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51763G0f(new C51763G0f(this, 37), 38));
        this.A0B = DbS.A0I(new C51763G0f(A002, 39), g0f, new MJ4(24, (Object) null, A002), DbS.A0z(C46765Dks.class));
    }

    public static final void A02(E35 e35) {
        String str;
        A01(e35);
        E97 e97 = e35.A05;
        if (e97 == null) {
            str = "featuredAdapter";
        } else {
            List<Object> list = e35.A03;
            0qQ.A0B(list, 0);
            e97.clear();
            EAN ean = e97.A00;
            boolean z = true;
            if (list.size() > 1) {
                z = false;
            }
            ean.A00 = z;
            for (Object addModel : list) {
                e97.addModel(addModel, ean);
            }
            e97.notifyDataSetChanged();
            E93 e93 = e35.A04;
            if (e93 == null) {
                str = "availableAdapter";
            } else {
                List<Object> list2 = e35.A06;
                0qQ.A0B(list2, 0);
                e93.clear();
                for (Object addModel2 : list2) {
                    e93.addModel(addModel2, e93.A00);
                }
                e93.notifyDataSetChanged();
                e35.A00();
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1917520304);
        E35.super.onCreate(bundle);
        ((C46765Dks) this.A0B.getValue()).A00();
        0eE r0 = AnonymousClass0t1.A01;
        AnonymousClass0eM r1 = this.A0C;
        this.A01 = DbX.A0l(r0, r1);
        this.A00 = (JVM) C322306va.A00(AnonymousClass7TE.A0l(r1)).A01.A02();
        Dbc.A0p(this);
        A01(this);
        AnonymousClass0fD.A09(1483499922, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1723578529);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_featured, viewGroup, false);
        AnonymousClass0fD.A09(2041400049, A022);
        return inflate;
    }
}
