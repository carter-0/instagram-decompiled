package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.ui.swipenavigation.PositionConfig;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.E4h  reason: case insensitive filesystem */
public final class C47482E4h extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "InspirationHubFragment";
    public int A00;
    public C249403jg A01;
    public 2dZ A02;
    public C22338Xzn A03;
    public C18654Vw9 A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public int A0A;
    public C46383De2 A0B;
    public boolean A0C;
    public final AnonymousClass0eM A0D = C227642jf.A02(this);
    public final AnonymousClass0eM A0E;

    /* JADX WARNING: type inference failed for: r1v3, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r5) {
        String str;
        0qQ.A0B(r5, 0);
        if (this.A07) {
            str = requireContext().getString(2131970565);
        } else {
            str = "";
        }
        r5.setTitle(str);
        String str2 = this.A05;
        if (str2 != null) {
            if (str2.equals("onboarding_checklist")) {
                C59904JbT.A01(FP5.A00(this, 10), r5, new Object());
            }
            AnonymousClass3JR A0K = DbS.A0K();
            String str3 = this.A05;
            if (str3 != null) {
                boolean equals = str3.equals("ads_manager");
                int i = R.drawable.instagram_arrow_back_24;
                if (equals) {
                    i = R.drawable.instagram_x_pano_outline_24;
                }
                A0K.A01(i);
                DbX.A1A(FP5.A00(this, 11), A0K, r5);
                return;
            }
        }
        0qQ.A0F("entryPoint");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "inspiration_hub_fragment";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x001d: MOVE  (r1v2 com.instagram.base.activity.BaseFragmentActivity) = (r1v0 com.instagram.base.activity.BaseFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r7, r0)
            super.onViewCreated(r7, r8)
            r0 = 2131435641(0x7f0b2079, float:1.849313E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r7, r0)
            r0 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r7, r0)
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x0024
            com.instagram.base.activity.BaseFragmentActivity r1 = (com.instagram.base.activity.BaseFragmentActivity) r1
            if (r1 == 0) goto L_0x0024
            r1.A0a()
        L_0x0024:
            X.0eM r0 = r6.A0E
            java.lang.Object r0 = r0.getValue()
            X.Ggs r0 = (X.C53001Ggs) r0
            X.2Fk r2 = r0.A00
            X.07Z r1 = r6.getViewLifecycleOwner()
            r4 = 24
            X.IxG r3 = new X.IxG
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 51
            X.Dba.A16(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47482E4h.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A02(C47482E4h e4h) {
        String str;
        C47482E4h e4h2 = e4h;
        C22338Xzn xzn = e4h2.A03;
        if (xzn == null) {
            str = "logger";
        } else {
            xzn.A06("pro_inspiration_grid", "call_to_action", EX0.ORGANIC.toString(), (String) null);
            String str2 = e4h2.A05;
            if (str2 == null) {
                str = "entryPoint";
            } else {
                if (str2.equals("onboarding_checklist")) {
                    A04(e4h2, false);
                }
                Activity activity = e4h2.mParentFragment;
                boolean z = activity instanceof 2Zg;
                String A002 = AnonymousClass000.A00(51);
                if (!z) {
                    activity = e4h2.getRootActivity();
                }
                0qQ.A0C(activity, A002);
                ((2Zg) activity).FLD(new PositionConfig((AnonymousClass57C) null, new CameraConfiguration(C363138jC.A00, 0sl.A00), (AnonymousClass3QO) null, "inspiration_hub_create_post", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1.0f, 0, true));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A03(C47482E4h e4h) {
        String str;
        C22338Xzn xzn = e4h.A03;
        if (xzn == null) {
            str = "logger";
        } else {
            xzn.A06("pro_inspiration_grid", "call_to_action", EX0.PROMOTION.toString(), (String) null);
            String str2 = e4h.A05;
            str = "entryPoint";
            if (str2 != null) {
                if (str2.equals("onboarding_checklist")) {
                    A04(e4h, false);
                }
                1Yh A002 = C18138VmE.A00();
                UserSession A0l = AnonymousClass7TE.A0l(e4h.A0D);
                FragmentActivity requireActivity = e4h.requireActivity();
                String str3 = e4h.A05;
                if (str3 != null) {
                    A002.A09(requireActivity, A0l, str3);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A04(C47482E4h e4h, boolean z) {
        C46383De2 de2 = e4h.A0B;
        if (de2 == null) {
            0qQ.A0F("onboardingChecklistNetworkHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        de2.A01(new C54243H4m(2, e4h, z), AnonymousClass05K.A01);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public final boolean onBackPressed() {
        if (this.A0C) {
            C22338Xzn xzn = this.A03;
            if (xzn == null) {
                DbS.A12();
                throw AnonymousClass00P.createAndThrow();
            }
            xzn.A03("pro_inspiration_grid");
            this.A0C = false;
        }
        return false;
    }

    public C47482E4h() {
        C20694WxQ wxQ = new C20694WxQ(this, 24);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20694WxQ(new C20694WxQ(this, 21), 22));
        this.A0E = DbS.A0I(new C20694WxQ(A002, 23), wxQ, new C41566AwY(18, (Object) null, A002), DbS.A0z(C53001Ggs.class));
    }

    public static final void A00(EX0 ex0, C47482E4h e4h, 1Xj r15, String str, int i) {
        Context context;
        int i2;
        String string;
        ArrayList arrayList;
        C55982Hqn hqn;
        if (e4h.getActivity() != null) {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putBoolean("ContextualFeedFragment.ARGUMENT_SHOW_ACTION_BAR_WHEN_SCROLL_DOWN", true);
            A0a.putString(AnonymousClass000.A00(1792), ex0.toString());
            A0a.putString("call_to_action_button_text", str);
            String str2 = e4h.A05;
            if (str2 == null) {
                DbS.A16();
                throw AnonymousClass00P.createAndThrow();
            }
            DbS.A1B(A0a, str2);
            C309516Yo A0N = DbX.A0N(e4h.requireActivity(), e4h.A0D);
            if (e4h.A06 != null) {
                A0N.A06();
            }
            int ordinal = ex0.ordinal();
            if (ordinal == 1) {
                context = e4h.requireContext();
                i2 = 2131970567;
                string = context.getString(i2);
            } else if (ordinal != 0) {
                string = "";
            } else {
                context = e4h.requireContext();
                i2 = 2131970566;
                string = context.getString(i2);
            }
            String id = r15.getId();
            List list = (List) ((C53001Ggs) e4h.A0E.getValue()).A02.getValue();
            if (list == null || (hqn = (C55982Hqn) list.get(i)) == null) {
                arrayList = AnonymousClass7TE.A1C();
            } else {
                arrayList = AnonymousClass7TE.A1C();
                for (1Xj id2 : hqn.A04) {
                    String id3 = id2.getId();
                    if (id3 != null) {
                        arrayList.add(id3);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
            ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
            contextualFeedFragment.setArguments(C46424Del.A03(A0a, (ContextualFeedNetworkConfig) null, "BUSINESS_INSPIRATION_HUB", string, id, "feed_contextual_business_inspiration_hub", arrayList, false, false, true, true, false));
            Dba.A0w((Bundle) null, contextualFeedFragment, A0N);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r1 == null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.EX0 r3, X.C47482E4h r4, java.lang.String r5) {
        /*
            int r1 = r3.ordinal()
            r3 = 1
            java.lang.String r2 = "actionButtonHolder"
            if (r1 == r3) goto L_0x0018
            r0 = 0
            if (r1 != r0) goto L_0x0026
            X.Vw9 r1 = r4.A04
            if (r1 != 0) goto L_0x001d
        L_0x0010:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0018:
            X.Vw9 r1 = r4.A04
            if (r1 == 0) goto L_0x0010
            r3 = 0
        L_0x001d:
            X.FTn r0 = new X.FTn
            r0.<init>(r4, r3)
            X.C18165Vmf.A01(r0, r1, r5)
            return
        L_0x0026:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47482E4h.A01(X.EX0, X.E4h, java.lang.String):void");
    }

    public final void afterOnPause() {
        super.afterOnPause();
        if (this.A0C) {
            C22338Xzn xzn = this.A03;
            if (xzn == null) {
                DbS.A12();
                throw AnonymousClass00P.createAndThrow();
            } else {
                xzn.A04("pro_inspiration_grid");
                this.A0C = false;
            }
        }
        if (getRootActivity() instanceof AnonymousClass2ZP) {
            Activity rootActivity = getRootActivity();
            0qQ.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((AnonymousClass2ZP) rootActivity).Enj(this.A0A);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 1980130385(0x76066451, float:6.814477E32)
            int r3 = X.AnonymousClass0fD.A02(r0)
            X.C47482E4h.super.onCreate(r10)
            android.os.Bundle r7 = r9.mArguments
            if (r7 == 0) goto L_0x0086
            java.lang.String r0 = X.DbS.A0l(r7)
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "unknown"
        L_0x0016:
            r9.A05 = r0
            X.0eM r5 = r9.A0D
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.Xzn r0 = X.C319596qs.A02(r0)
            r9.A03 = r0
            java.lang.String r1 = r9.A05
            java.lang.String r8 = "entryPoint"
            if (r1 == 0) goto L_0x0109
            int r0 = r1.hashCode()
            r6 = 0
            switch(r0) {
                case -1600601123: goto L_0x00f0;
                case -1437908653: goto L_0x00ed;
                case -1008887324: goto L_0x00ea;
                case 812547870: goto L_0x00df;
                default: goto L_0x0032;
            }
        L_0x0032:
            java.lang.String r0 = "should_show_promotion_content"
            boolean r0 = r7.getBoolean(r0, r6)
        L_0x0038:
            r9.A09 = r0
            java.lang.String r0 = "media_id"
            java.lang.String r0 = r7.getString(r0)
            r9.A06 = r0
            java.lang.String r0 = "ARG_CHECKLIST_ITEM_COMPLETED"
            boolean r0 = r7.getBoolean(r0, r6)
            r9.A08 = r0
            X.0lg r4 = X.DbT.A0X(r5)
            java.lang.String r5 = r9.A05
            if (r5 == 0) goto L_0x0109
            X.0qQ.A0B(r4, r6)
            java.lang.String r0 = "onboarding_checklist"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00a6
            boolean r0 = X.C319126q5.A05(r4)
            if (r0 == 0) goto L_0x0070
            X.0Tu r2 = X.0Tu.A06
            r0 = 36315060884212689(0x81045b00000bd1, double:3.0291289599645725E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x0083
        L_0x0070:
            boolean r0 = X.C319126q5.A06(r4)
            if (r0 == 0) goto L_0x00a6
            X.0Tu r2 = X.0Tu.A06
            r0 = 36315065179179987(0x81045c00000bd3, double:3.029131676119186E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00a6
        L_0x0083:
            r0 = 1
        L_0x0084:
            r9.A07 = r0
        L_0x0086:
            X.0eM r0 = r9.A0D
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.De2 r0 = new X.De2
            r0.<init>(r1, r9)
            r9.A0B = r0
            X.2dY r1 = X.2dZ.A0t
            androidx.fragment.app.FragmentActivity r0 = r9.getActivity()
            X.2dZ r0 = r1.A03(r0)
            r9.A02 = r0
            r0 = 222942698(0xd49d5ea, float:6.2195397E-31)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x00a6:
            java.lang.String r0 = "pro_dash"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "deep_link"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00dd
        L_0x00b6:
            boolean r0 = X.C319126q5.A07(r4)
            if (r0 == 0) goto L_0x00c9
            X.0Tu r2 = X.0Tu.A06
            r0 = 2342158070097972178(0x2081045b00010bd2, double:4.0613979290787466E-152)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x0083
        L_0x00c9:
            boolean r0 = X.C319126q5.A06(r4)
            if (r0 == 0) goto L_0x00dd
            X.0Tu r2 = X.0Tu.A06
            r0 = 36315065179245524(0x81045c00010bd4, double:3.029131676160632E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00dd
            goto L_0x0083
        L_0x00dd:
            r0 = 0
            goto L_0x0084
        L_0x00df:
            java.lang.String r0 = "ads_manager"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0032
            r0 = 1
            goto L_0x0038
        L_0x00ea:
            java.lang.String r0 = "pro_dash"
            goto L_0x00f2
        L_0x00ed:
            java.lang.String r0 = "b2b_netego_see_all"
            goto L_0x00f2
        L_0x00f0:
            java.lang.String r0 = "b2b_netego"
        L_0x00f2:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0032
            X.0lg r4 = X.AnonymousClass7TF.A0L(r5, r6)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36312737306969336(0x81023e000104f8, double:3.0276595203595815E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            goto L_0x0038
        L_0x0109:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47482E4h.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-353299984);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_fragment, viewGroup, false);
        AnonymousClass0fD.A09(36711253, A022);
        return inflate;
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(638659075);
        super.onResume();
        if (!this.A0C) {
            C22338Xzn xzn = this.A03;
            if (xzn == null) {
                str = "logger";
            } else {
                String str2 = this.A05;
                if (str2 == null) {
                    str = "entryPoint";
                } else {
                    xzn.A05("pro_inspiration_grid", str2);
                    this.A0C = true;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        if (getRootActivity() instanceof AnonymousClass2ZP) {
            Activity rootActivity = getRootActivity();
            0qQ.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            this.A0A = ((AnonymousClass2ZP) rootActivity).C3p();
            Activity rootActivity2 = getRootActivity();
            0qQ.A0C(rootActivity2, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((AnonymousClass2ZP) rootActivity2).Enj(8);
        }
        AnonymousClass0fD.A09(-1868715099, A022);
    }
}
