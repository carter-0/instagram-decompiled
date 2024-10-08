package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.NKo  reason: case insensitive filesystem */
public abstract class C68495NKo extends MYR implements AnonymousClass4DS, C74313Psp {
    public static final String __redex_internal_original_name = "DirectCardGalleryFragment";
    public int A00;
    public int A01 = R.drawable.instagram_camera_outline_96;
    public int A02;
    public C252063oV A03;
    public ODX A04;
    public ODX A05;
    public C67759MuF A06;
    public OJa A07;
    public AnonymousClass9HC A08;
    public NIE A09;
    public AnonymousClass7L2 A0A;
    public P15 A0B;
    public AnonymousClass72Q A0C;
    public DirectThreadKey A0D;
    public C254743sy A0E;
    public Boolean A0F;
    public Boolean A0G = AnonymousClass7TE.A0u();
    public Integer A0H;
    public Integer A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public List A0M;
    public C71931OtF A0N;
    public List A0O = AnonymousClass7TE.A1C();
    public boolean A0P;
    public final C229122ms A0Q = new PRL(this, 1);
    public final String A0R = "DirectCardGalleryFragment.ITEM_ACTIONS_FRAGMENT_TAG";
    public final AnonymousClass0eM A0S = C227642jf.A02(this);
    public final 1wn A0T = C71932OtG.A00(this, 6);

    public final void A0J(View view) {
        String str;
        0qQ.A0B(view, 0);
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.primary_button);
        ODX odx = this.A04;
        String str2 = null;
        int i = 0;
        if (odx == null) {
            if (A0d != null) {
                A0d.setVisibility(8);
            }
        } else if (A0d != null) {
            A0d.setEnabled(odx.A02);
            A0d.setVisibility(0);
            ODX odx2 = this.A04;
            if (odx2 != null) {
                str = odx2.A00;
            } else {
                str = null;
            }
            A0d.setText(str);
            AnonymousClass0fU.A00(new NR6(this), A0d);
        }
        TextView A0d2 = AnonymousClass7TE.A0d(view, R.id.secondary_button);
        if (this.A05 == null) {
            if (A0d2 != null) {
                A0d2.setVisibility(8);
            }
        } else if (A0d2 != null) {
            A0d2.setVisibility(0);
            ODX odx3 = this.A05;
            if (odx3 != null) {
                str2 = odx3.A00;
            }
            A0d2.setText(str2);
            C71407Ok6.A00(A0d2, 51, this);
        }
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.recycler_view);
        if ((A0d != null && A0d.getVisibility() == 0) || (A0d2 != null && A0d2.getVisibility() == 0)) {
            i = DbV.A05(this).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        }
        0nA.A0X(A0G2, i);
    }

    public final void A0K(View view) {
        0qQ.A0B(view, 0);
        if (this.A0M != null) {
            C355148Ov r1 = new C355148Ov(requireContext(), AnonymousClass7TE.A0l(this.A0S), (Integer) null, false);
            List list = this.A0M;
            if (list != null) {
                r1.A02(list);
                if (r1.getContentView() != null) {
                    r1.showAsDropDown(view, 0, 0);
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void AE6(String str, String str2, String str3, String str4, String str5) {
        String str6 = str5;
        if (str5 == null) {
            Bundle bundle = this.mArguments;
            if (bundle != null) {
                str6 = bundle.getString("client_context");
            } else {
                str6 = null;
            }
        }
        C333527Zh.A00(AnonymousClass7TE.A0l(this.A0S)).A0K(A0G(), str, str2, str3, str4, str6);
    }

    public OID getRecyclerConfigBuilder() {
        return configBuilder(new C74184PqQ(this, 4));
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, X.NKo, androidx.fragment.app.Fragment, java.lang.Object, X.MYR] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            r2 = 0
            X.0qQ.A0B(r7, r2)
            super.onViewCreated(r7, r8)
            r6.A0J(r7)
            boolean r5 = r6 instanceof X.NV4
            if (r5 == 0) goto L_0x0083
            android.view.Window r0 = X.DbV.A0G(r6)
            android.view.View r3 = r0.getDecorView()
        L_0x0016:
            androidx.fragment.app.FragmentActivity r2 = r6.getActivity()
            r1 = 1
            X.Olh r0 = new X.Olh
            r0.<init>(r2, r1)
        L_0x0020:
            X.AnonymousClass03j.A00(r3, r0)
            android.content.Context r1 = r6.requireContext()
            r0 = 2131100482(0x7f060342, float:1.7813347E38)
            int r1 = r1.getColor(r0)
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            X.AnonymousClass2uJ.A04(r0, r1)
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            X.2db.A02(r0, r1)
            r0 = 2131429652(0x7f0b0914, float:1.8480983E38)
            X.3oV r0 = X.DbU.A0Y(r7, r0)
            r6.A03 = r0
            X.MuF r0 = r6.A0E()
            X.2Fk r2 = r0.A02
            r1 = 5
            X.PqQ r0 = new X.PqQ
            r0.<init>(r6, r1)
            r4 = 34
            X.Dba.A15(r6, r2, r0, r4)
            r0 = 2131439764(0x7f0b3094, float:1.8501492E38)
            android.view.View r3 = X.AnonymousClass7TF.A0F(r7, r0)
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r3 = (com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent) r3
            if (r5 != 0) goto L_0x0081
            boolean r0 = r6 instanceof X.NV5
            if (r0 != 0) goto L_0x0081
            r0 = 1
        L_0x0066:
            r3.setEnabled(r0)
            r1 = 1
            X.PRN r0 = new X.PRN
            r0.<init>(r6, r1)
            r3.A07 = r0
            X.MuF r0 = r6.A0E()
            X.2Fk r2 = r0.A03
            r1 = 2
            X.PqU r0 = new X.PqU
            r0.<init>((int) r1, (java.lang.Object) r7, (java.lang.Object) r3, (java.lang.Object) r6)
            X.Dba.A15(r6, r2, r0, r4)
            return
        L_0x0081:
            r0 = 0
            goto L_0x0066
        L_0x0083:
            boolean r1 = r6 instanceof X.NV7
            android.view.Window r0 = X.DbV.A0G(r6)
            android.view.View r3 = r0.getDecorView()
            if (r1 != 0) goto L_0x0016
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            X.Olh r0 = new X.Olh
            r0.<init>(r1, r2)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68495NKo.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static void A00(Intent intent, C68495NKo nKo, int i, int i2) {
        if (i == 5543 && i2 == -1 && intent != null && intent.getBooleanExtra("extra_response_added", false)) {
            nKo.A0E().A08();
        }
    }

    public final int A0C() {
        if (this instanceof NV3) {
            UserSession A0l = AnonymousClass7TE.A0l(this.A0S);
            return DbS.A04(AnonymousClass7TF.A0H(A0l), A0l, 36597987561442378L);
        } else if (this instanceof NV7) {
            return 1;
        } else {
            return -1;
        }
    }

    public final UserSession A0D() {
        return AnonymousClass7TE.A0l(this.A0S);
    }

    public final C67759MuF A0E() {
        C67759MuF muF = this.A06;
        if (muF != null) {
            return muF;
        }
        C51965G9l.A15();
        throw AnonymousClass00P.createAndThrow();
    }

    public final DirectThreadKey A0G() {
        DirectThreadKey directThreadKey = this.A0D;
        if (directThreadKey != null) {
            return directThreadKey;
        }
        0qQ.A0F("threadKey");
        throw AnonymousClass00P.createAndThrow();
    }

    public final ArrayList A0H(boolean z) {
        String str;
        boolean z2;
        Integer num;
        if (this instanceof NV4) {
            return OX8.A00(requireContext(), AnonymousClass7TE.A0l(this.A0S), this.A0F, C73739Pj0.A00, MYO.A01(this, 43), MYO.A01(this, 44), MYO.A01(this, 45), true, true);
        }
        if (this instanceof NV6) {
            NV6 nv6 = (NV6) this;
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (!0qQ.A0K(nv6.A04, "shared_stack")) {
                return A1C;
            }
            A1C.add(C71127OdQ.A04(nv6.requireContext(), AnonymousClass7TE.A0u(), (Integer) null, new C73656PhV(nv6, 4), 2131957531, R.drawable.instagram_delete_pano_outline_24));
            return A1C;
        } else if (this instanceof NV7) {
            Context requireContext = requireContext();
            UserSession A0l = AnonymousClass7TE.A0l(this.A0S);
            Boolean bool = this.A0F;
            C67759MuF A0E2 = A0E();
            0qQ.A0C(A0E2, "null cannot be cast to non-null type com.instagram.direct.fragment.cardgallery.model.DirectChallengesGalleryViewModel");
            return OX8.A00(requireContext, A0l, bool, C73738Piz.A00, MYO.A01(this, 33), MYO.A01(this, 34), MYO.A01(this, 35), A0E2.A0D(), false);
        } else {
            Bundle bundle = this.mArguments;
            Integer num2 = null;
            if (bundle != null) {
                str = bundle.getString("surface");
            } else {
                str = null;
            }
            boolean z3 = true;
            if (!AnonymousClass7TF.A1Y(this.A0F, true) || (!0qQ.A0K(str, "roll_call") && !0qQ.A0K(str, "add_yours") && !0qQ.A0K(str, "questions"))) {
                z2 = false;
            } else {
                z2 = true;
            }
            String str2 = A0E().A09.A00;
            if (str2 == null || !AnonymousClass9HV.A00(AnonymousClass7TE.A0l(this.A0S)).A00(C66580MXl.A0g(str2), 7) || (!0qQ.A0K(str, "add_yours") && !0qQ.A0K(str, "questions"))) {
                z3 = false;
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            if (0qQ.A0K(str, "roll_call") && z) {
                A1C2.add(C71127OdQ.A04(requireContext(), false, (Integer) null, MYO.A01(this, 27), 2131958576, R.drawable.instagram_edit_pano_outline_24));
            }
            if (z2 || z3) {
                Context requireContext2 = requireContext();
                if (0qQ.A0K(str, "roll_call")) {
                    num = C66581MXm.A0m(getContext());
                } else {
                    num = null;
                }
                A1C2.add(C71127OdQ.A04(requireContext2, false, num, MYO.A01(this, 28), 2131960643, R.drawable.instagram_delete_pano_outline_24));
            }
            if (!0qQ.A0K(this.A0F, false)) {
                return A1C2;
            }
            Context requireContext3 = requireContext();
            if (0qQ.A0K(str, "roll_call")) {
                num2 = C66581MXm.A0m(getContext());
            }
            A1C2.add(C71127OdQ.A04(requireContext3, false, num2, MYO.A01(this, 29), 2131972171, R.drawable.instagram_report_pano_outline_24));
            return A1C2;
        }
    }

    public final void A0I() {
        C252063oV r0 = this.A03;
        if (r0 != null) {
            View view = r0.getView();
            ImageView A0J2 = DbX.A0J(view, R.id.card_gallery_card_empty_state_icon);
            TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.card_gallery_card_empty_state_title);
            TextView A0R3 = AnonymousClass7TG.A0R(view, R.id.card_gallery_card_empty_state_subtitle);
            Integer num = this.A0I;
            if (num != null) {
                A0R2.setText(num.intValue());
            }
            Integer num2 = this.A0H;
            if (num2 != null) {
                A0R3.setText(num2.intValue());
            } else {
                A0R3.setVisibility(8);
            }
            A0J2.setImageResource(this.A01);
            C66581MXm.A1C(A0J2, requireContext().getColor(2Yu.A09(getContext())));
            view.setVisibility(0);
            return;
        }
        0qQ.A0F("emptyStateViewHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    public void A0L(2da r4) {
        List list = this.A0M;
        if (list != null && AnonymousClass7TE.A1b(list)) {
            AnonymousClass3JR A0K2 = DbS.A0K();
            A0K2.A06 = R.drawable.instagram_more_horizontal_outline_44;
            A0K2.A05 = 2131966734;
            DbX.A19(new C71407Ok6(this, 50), A0K2, r4);
        }
    }

    public final void configureActionBar(2da r6) {
        if (this instanceof NV4) {
            0qQ.A0B(r6, 0);
            OX8.A02(r6, MYO.A01(this, 41), new C74184PqQ(this, 8));
        } else if (this instanceof NV7) {
            0qQ.A0B(r6, 0);
            OX8.A02(r6, MYO.A01(this, 31), new C74184PqQ(this, 6));
            r6.ETg(R.layout.challenge_action_bar_timer, DbS.A02(requireContext(), 44), 0, true);
            View A0G2 = AnonymousClass7TF.A0G(((2dZ) r6).A0Q, R.id.countdown);
            A0G2.setVisibility(8);
            Dba.A15(getViewLifecycleOwner(), A0E().A03, new C74184PqQ(A0G2, 7), 35);
        } else {
            0qQ.A0B(r6, 0);
            int A032 = AnonymousClass7TF.A03(getContext(), R.attr.igds_color_primary_background);
            r6.setTitle("");
            F3V f3v = new F3V(AnonymousClass05K.A00);
            f3v.A01(A032);
            r6.ErJ(f3v.A00());
            A0L(r6);
            Dbc.A0k(r6);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2tE, java.lang.Object] */
    public Collection getDefinitions() {
        AnonymousClass7X4 r10;
        ? obj = new Object();
        AnonymousClass0eM r3 = this.A0S;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        UserSession A0l2 = AnonymousClass7TE.A0l(r3);
        C73459Pd1 pd1 = new C73459Pd1(this, 0);
        P15 p15 = this.A0B;
        if (p15 != null) {
            FragmentActivity requireActivity = requireActivity();
            UserSession A0l3 = AnonymousClass7TE.A0l(r3);
            DirectThreadKey A0G2 = A0G();
            C67759MuF A0E2 = A0E();
            C73459Pd1 pd12 = new C73459Pd1(this, 1);
            C72518P9b p9b = new C72518P9b(this, 0);
            C72537P9u p9u = new C72537P9u(this);
            if (this instanceof NV3) {
                r10 = new C72514P8x((NV3) this);
            } else if (this instanceof NV7) {
                r10 = new C72513P8w((NV7) this);
            } else {
                r10 = C72516P8z.A00;
            }
            return 0sr.A1P(new C232222tE[]{obj, new NOZ(A0l, new OLM(this, A0l2, new OIT(requireActivity, A0l3, this, A0E2, r10, p9b, p9u, A0G2, this.A0K, pd12), p15, pd1), new O6G(this), this.A0K, this.A0P), new C66610MYw(this.A0Q, R.layout.direct_empty_view)});
        }
        0qQ.A0F("reactionsListNavigator");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0S);
    }

    public final AnonymousClass3U9 A0F() {
        return C66584MXp.A0N(this);
    }

    /* JADX WARNING: type inference failed for: r1v47, types: [X.2kh] */
    /* JADX WARNING: type inference failed for: r16v6, types: [X.NNW] */
    /* JADX WARNING: type inference failed for: r16v7, types: [X.NNX] */
    /* JADX WARNING: type inference failed for: r16v8, types: [X.NNU] */
    /* JADX WARNING: type inference failed for: r16v9, types: [X.NNV] */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0241, code lost:
        if (r1 != true) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0094, code lost:
        if (X.182.A06(X.0Tu.A06, X.AnonymousClass7TE.A0l(r10), 36316448159175034L) != false) goto L_0x0096;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r31) {
        /*
            r30 = this;
            r0 = 1404694736(0x53b9f0d0, float:1.59721823E12)
            int r8 = X.AnonymousClass0fD.A02(r0)
            r0 = r30
            r1 = r31
            X.C68495NKo.super.onCreate(r1)
            android.os.Bundle r2 = r0.requireArguments()
            android.view.Window r1 = X.DbV.A0G(r0)
            r7 = 0
            X.04R.A00(r1, r7)
            java.lang.String r1 = "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY"
            X.3sy r1 = X.C67002Mga.A00(r2, r1)
            if (r1 == 0) goto L_0x0385
            r0.A0E = r1
            X.9HD r4 = X.AnonymousClass9HC.A1b
            X.0eM r10 = r0.A0S
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r10)
            android.os.Parcelable$Creator r1 = com.instagram.direct.capabilities.Capabilities.CREATOR
            X.0sn r9 = X.0sn.A00
            X.9HC r1 = X.C66581MXm.A0X(r3, r4, r9)
            r0.A08 = r1
            android.content.Context r3 = r0.requireContext()
            X.9HC r1 = r0.A08
            if (r1 == 0) goto L_0x0378
            X.7L2 r1 = X.C250563lf.A06(r3, r1)
            r0.A0A = r1
            X.3sy r1 = r0.A0E
            java.lang.String r11 = "unifiedThreadKey"
            r15 = 0
            if (r1 == 0) goto L_0x037d
            com.instagram.model.direct.DirectThreadKey r1 = X.C66647MaG.A03(r1)
            X.0qQ.A0B(r1, r7)
            r0.A0D = r1
            r1 = 105(0x69, float:1.47E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            int r1 = r2.getInt(r1)
            r0.A02 = r1
            java.lang.String r1 = "blocked_reactions_in_thread"
            java.util.ArrayList r1 = r2.getStringArrayList(r1)
            if (r1 != 0) goto L_0x006c
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
        L_0x006c:
            r0.A0O = r1
            java.lang.String r1 = "surface"
            java.lang.String r3 = r2.getString(r1)
            r0.A0K = r3
            java.lang.String r2 = "stacks"
            boolean r2 = X.0qQ.A0K(r3, r2)
            r6 = 1
            if (r2 == 0) goto L_0x0096
            int r3 = r0.A02
            r2 = 29
            if (r3 == r2) goto L_0x034a
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r10)
            X.0Tu r4 = X.0Tu.A06
            r2 = 36316448159175034(0x81059e0008117a, double:3.0300062782368674E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 == 0) goto L_0x034a
        L_0x0096:
            r0.A0P = r6
            android.content.Context r4 = r0.requireContext()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r10)
            X.72Q r2 = new X.72Q
            r2.<init>(r4, r3)
            r0.A0C = r2
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.OJa r2 = new X.OJa
            r2.<init>(r3)
            r0.A07 = r2
            boolean r2 = r0 instanceof X.NV3
            if (r2 == 0) goto L_0x018a
            android.content.res.Resources r17 = X.JTR.A0R(r0)
            com.instagram.common.session.UserSession r18 = X.AnonymousClass7TE.A0l(r10)
            com.instagram.model.direct.DirectThreadKey r22 = r0.A0G()
            android.os.Bundle r3 = r0.mArguments
            if (r3 == 0) goto L_0x0186
            java.lang.String r2 = "message_id"
            java.lang.String r23 = r3.getString(r2)
        L_0x00cc:
            android.os.Bundle r3 = r0.mArguments
            if (r3 == 0) goto L_0x0182
            java.lang.String r2 = "client_context"
            java.lang.String r24 = r3.getString(r2)
        L_0x00d6:
            java.lang.String r3 = "Required value was null."
            if (r24 == 0) goto L_0x0352
            android.os.Bundle r2 = r0.mArguments
            if (r2 == 0) goto L_0x017e
            java.lang.String r25 = X.C66580MXl.A0t(r2)
        L_0x00e2:
            android.os.Bundle r2 = r0.mArguments
            if (r2 == 0) goto L_0x034d
            java.lang.String r26 = r2.getString(r1)
            if (r26 == 0) goto L_0x034d
            X.72Q r4 = r0.A0C
            if (r4 == 0) goto L_0x036b
            X.9HC r3 = r0.A08
            if (r3 == 0) goto L_0x0378
            X.7L2 r2 = r0.A0A
            if (r2 == 0) goto L_0x037b
            X.NNV r1 = new X.NNV
            r19 = r3
            r20 = r2
            r21 = r4
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Class<X.NVE> r2 = X.NVE.class
        L_0x0107:
            X.2YL r12 = r1.create(r2)
            X.MuF r12 = (X.C67759MuF) r12
        L_0x010d:
            X.0qQ.A0B(r12, r7)
            r0.A06 = r12
            com.instagram.common.session.UserSession r18 = X.AnonymousClass7TE.A0l(r10)
            int r5 = r0.A02
            androidx.fragment.app.FragmentActivity r17 = r0.requireActivity()
            com.instagram.direct.capabilities.Capabilities r19 = X.C376189Gz.A00(r9)
            X.3sy r1 = r0.A0E
            if (r1 == 0) goto L_0x037d
            java.lang.String r22 = X.C66647MaG.A0A(r1)
            if (r22 != 0) goto L_0x012c
            java.lang.String r22 = ""
        L_0x012c:
            X.P9P r4 = new X.P9P
            r4.<init>(r0)
            X.7L2 r1 = r0.A0A
            if (r1 == 0) goto L_0x037b
            int r3 = r1.A01
            java.util.List r2 = r0.A0O
            X.P15 r1 = new X.P15
            r16 = r1
            r20 = r0
            r21 = r4
            r23 = r2
            r24 = r5
            r25 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0.A0B = r1
            X.MuF r3 = r0.A0E()
            X.2Ep r2 = X.C67759MuF.A01(r3)
            r1 = 12
            X.C67759MuF.A02(r2, r3, r1)
            android.os.Bundle r2 = r0.mArguments
            if (r2 == 0) goto L_0x0175
            java.lang.String r1 = "message_id"
            java.lang.String r4 = r2.getString(r1)
            if (r4 == 0) goto L_0x0175
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r10)
            r2 = 0
            r1 = 30
            X.MYO r1 = X.MYO.A01(r0, r1)
            X.OtF r15 = new X.OtF
            r15.<init>(r3, r2, r4, r1)
        L_0x0175:
            r0.A0N = r15
            r0 = -1990753597(0xffffffff895782c3, float:-2.5941167E-33)
            X.AnonymousClass0fD.A09(r0, r8)
            return
        L_0x017e:
            r25 = r15
            goto L_0x00e2
        L_0x0182:
            r24 = r15
            goto L_0x00d6
        L_0x0186:
            r23 = r15
            goto L_0x00cc
        L_0x018a:
            boolean r2 = r0 instanceof X.NV4
            if (r2 == 0) goto L_0x01db
            android.content.res.Resources r17 = X.JTR.A0R(r0)
            com.instagram.common.session.UserSession r18 = X.AnonymousClass7TE.A0l(r10)
            com.instagram.model.direct.DirectThreadKey r22 = r0.A0G()
            android.os.Bundle r2 = r0.mArguments
            if (r2 == 0) goto L_0x01d8
            java.lang.String r1 = "message_id"
            java.lang.String r23 = r2.getString(r1)
        L_0x01a4:
            android.os.Bundle r2 = r0.mArguments
            if (r2 == 0) goto L_0x0357
            java.lang.String r1 = "client_context"
            java.lang.String r24 = r2.getString(r1)
            if (r24 == 0) goto L_0x0357
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x01d5
            java.lang.String r25 = X.C66580MXl.A0t(r1)
        L_0x01b8:
            X.72Q r4 = r0.A0C
            if (r4 == 0) goto L_0x036b
            X.9HC r3 = r0.A08
            if (r3 == 0) goto L_0x0378
            X.7L2 r2 = r0.A0A
            if (r2 == 0) goto L_0x037b
            X.NNU r1 = new X.NNU
            r19 = r3
            r20 = r2
            r21 = r4
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Class<X.NVF> r2 = X.NVF.class
            goto L_0x0107
        L_0x01d5:
            r25 = r15
            goto L_0x01b8
        L_0x01d8:
            r23 = r15
            goto L_0x01a4
        L_0x01db:
            boolean r2 = r0 instanceof X.NV7
            if (r2 == 0) goto L_0x025d
            android.content.res.Resources r17 = X.JTR.A0R(r0)
            com.instagram.common.session.UserSession r18 = X.AnonymousClass7TE.A0l(r10)
            com.instagram.model.direct.DirectThreadKey r23 = r0.A0G()
            android.os.Bundle r3 = r0.mArguments
            r28 = 0
            if (r3 == 0) goto L_0x025a
            java.lang.String r2 = "message_id"
            java.lang.String r24 = r3.getString(r2)
        L_0x01f7:
            android.os.Bundle r3 = r0.mArguments
            if (r3 == 0) goto L_0x0203
            java.lang.String r2 = "client_context"
            java.lang.String r25 = r3.getString(r2)
            if (r25 != 0) goto L_0x0205
        L_0x0203:
            java.lang.String r25 = ""
        L_0x0205:
            android.os.Bundle r2 = r0.mArguments
            if (r2 == 0) goto L_0x0257
            java.lang.String r26 = X.C66580MXl.A0t(r2)
        L_0x020d:
            android.os.Bundle r2 = r0.mArguments
            if (r2 == 0) goto L_0x035c
            java.lang.String r27 = r2.getString(r1)
            if (r27 == 0) goto L_0x035c
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r10)
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r19 = X.C69911NuD.A00(r1)
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0229
            java.lang.String r2 = "source_image_urls"
            java.util.ArrayList r28 = r1.getParcelableArrayList(r2)
        L_0x0229:
            X.72Q r6 = r0.A0C
            if (r6 == 0) goto L_0x036b
            X.9HC r3 = r0.A08
            if (r3 == 0) goto L_0x0378
            X.7L2 r2 = r0.A0A
            if (r2 == 0) goto L_0x037b
            android.os.Bundle r5 = r0.mArguments
            r4 = 1
            if (r5 == 0) goto L_0x0243
            java.lang.String r1 = "challenge_gallery_no_redirect"
            boolean r1 = r5.getBoolean(r1)
            r5 = 1
            if (r1 == r4) goto L_0x0244
        L_0x0243:
            r5 = 0
        L_0x0244:
            r29 = r5 ^ 1
            X.NNX r1 = new X.NNX
            r20 = r3
            r21 = r2
            r22 = r6
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Class<X.NVG> r2 = X.NVG.class
            goto L_0x0107
        L_0x0257:
            r26 = r15
            goto L_0x020d
        L_0x025a:
            r24 = r15
            goto L_0x01f7
        L_0x025d:
            boolean r2 = r0 instanceof X.NV5
            if (r2 == 0) goto L_0x02d5
            android.content.res.Resources r13 = X.JTR.A0R(r0)
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r10)
            com.instagram.model.direct.DirectThreadKey r20 = r0.A0G()
            android.os.Bundle r3 = r0.mArguments
            r25 = 0
            if (r3 == 0) goto L_0x02d2
            java.lang.String r2 = "message_id"
            java.lang.String r21 = r3.getString(r2)
        L_0x0279:
            android.os.Bundle r3 = r0.mArguments
            if (r3 == 0) goto L_0x02cf
            java.lang.String r2 = "client_context"
            java.lang.String r22 = r3.getString(r2)
        L_0x0283:
            java.lang.String r3 = "Required value was null."
            if (r22 == 0) goto L_0x0366
            android.os.Bundle r2 = r0.mArguments
            if (r2 == 0) goto L_0x02cc
            java.lang.String r23 = X.C66580MXl.A0t(r2)
        L_0x028f:
            android.os.Bundle r2 = r0.mArguments
            if (r2 == 0) goto L_0x0361
            java.lang.String r24 = r2.getString(r1)
            if (r24 == 0) goto L_0x0361
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r10)
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r4 = X.C69911NuD.A00(r1)
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x02ab
            java.lang.String r2 = "source_image_urls"
            java.util.ArrayList r25 = r1.getParcelableArrayList(r2)
        L_0x02ab:
            X.72Q r3 = r0.A0C
            if (r3 == 0) goto L_0x036b
            X.9HC r2 = r0.A08
            if (r2 == 0) goto L_0x0378
            X.7L2 r1 = r0.A0A
            if (r1 == 0) goto L_0x037b
            r5 = 2
            X.AnonymousClass7TF.A1F(r14, r5, r4)
            X.NVD r12 = new X.NVD
            r17 = r2
            r18 = r1
            r19 = r3
            r26 = r15
            r16 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x010d
        L_0x02cc:
            r23 = r15
            goto L_0x028f
        L_0x02cf:
            r22 = r15
            goto L_0x0283
        L_0x02d2:
            r21 = r15
            goto L_0x0279
        L_0x02d5:
            android.content.res.Resources r17 = X.JTR.A0R(r0)
            com.instagram.common.session.UserSession r18 = X.AnonymousClass7TE.A0l(r10)
            com.instagram.model.direct.DirectThreadKey r22 = r0.A0G()
            android.os.Bundle r3 = r0.mArguments
            r28 = 0
            if (r3 == 0) goto L_0x0347
            java.lang.String r2 = "message_id"
            java.lang.String r23 = r3.getString(r2)
        L_0x02ed:
            android.os.Bundle r3 = r0.mArguments
            if (r3 == 0) goto L_0x0344
            java.lang.String r2 = "client_context"
            java.lang.String r24 = r3.getString(r2)
        L_0x02f7:
            java.lang.String r3 = "Required value was null."
            if (r24 == 0) goto L_0x0373
            android.os.Bundle r2 = r0.mArguments
            if (r2 == 0) goto L_0x0341
            java.lang.String r25 = X.C66580MXl.A0t(r2)
        L_0x0303:
            android.os.Bundle r2 = r0.mArguments
            if (r2 == 0) goto L_0x036e
            java.lang.String r26 = r2.getString(r1)
            if (r26 == 0) goto L_0x036e
            android.os.Bundle r2 = r0.mArguments
            if (r2 == 0) goto L_0x033e
            java.lang.String r1 = "source_image_urls"
            java.util.ArrayList r27 = r2.getParcelableArrayList(r1)
        L_0x0317:
            X.72Q r4 = r0.A0C
            if (r4 == 0) goto L_0x036b
            X.9HC r3 = r0.A08
            if (r3 == 0) goto L_0x0378
            X.7L2 r2 = r0.A0A
            if (r2 == 0) goto L_0x037b
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x032d
            java.lang.String r5 = "pending_video_cover_frame_file_paths"
            java.util.ArrayList r28 = r1.getStringArrayList(r5)
        L_0x032d:
            X.NNW r1 = new X.NNW
            r19 = r3
            r20 = r2
            r21 = r4
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Class<X.MuF> r2 = X.C67759MuF.class
            goto L_0x0107
        L_0x033e:
            r27 = r15
            goto L_0x0317
        L_0x0341:
            r25 = r15
            goto L_0x0303
        L_0x0344:
            r24 = r15
            goto L_0x02f7
        L_0x0347:
            r23 = r15
            goto L_0x02ed
        L_0x034a:
            r6 = 0
            goto L_0x0096
        L_0x034d:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r3)
            throw r1
        L_0x0352:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r3)
            throw r1
        L_0x0357:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x035c:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x0361:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r3)
            throw r1
        L_0x0366:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r3)
            throw r1
        L_0x036b:
            java.lang.String r11 = "remoteMediaHelper"
            goto L_0x037d
        L_0x036e:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r3)
            throw r1
        L_0x0373:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r3)
            throw r1
        L_0x0378:
            java.lang.String r11 = "experiments"
            goto L_0x037d
        L_0x037b:
            java.lang.String r11 = "threadTheme"
        L_0x037d:
            X.0qQ.A0F(r11)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0385:
            java.lang.IllegalArgumentException r1 = X.C66580MXl.A0p()
            r0 = -665238359(0xffffffffd85944a9, float:-9.5555567E14)
            X.AnonymousClass0fD.A09(r0, r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68495NKo.onCreate(android.os.Bundle):void");
    }

    public void onPause() {
        int A022 = AnonymousClass0fD.A02(-1272930999);
        C68495NKo.super.onPause();
        AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A0S)).A02(this.A0T, C71898Osg.class);
        C71931OtF otF = this.A0N;
        if (otF != null) {
            AnonymousClass1Nd.A00(otF.A00).A02(otF, 2Kb.class);
        }
        AnonymousClass0fD.A09(742685846, A022);
    }

    public void onResume() {
        int A022 = AnonymousClass0fD.A02(40697959);
        super.onResume();
        AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A0S)).A01(this.A0T, C71898Osg.class);
        C71931OtF otF = this.A0N;
        if (otF != null) {
            AnonymousClass1Nd.A00(otF.A00).A01(otF, 2Kb.class);
        }
        AnonymousClass0fD.A09(-1391894083, A022);
    }
}
