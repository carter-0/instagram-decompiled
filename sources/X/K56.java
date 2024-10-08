package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

public final class K56 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiAgentsHomeFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final String A08 = Pxd.A00(756);

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r21 == false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C53325GmB r17, X.C53299Gll r18, X.K56 r19, int r20, boolean r21) {
        /*
            r12 = 0
            r0 = r17
            r14 = r19
            if (r21 != 0) goto L_0x003a
            X.0eM r1 = r14.A00
            java.lang.Object r3 = r1.getValue()
            X.LRW r3 = (X.LRW) r3
            java.lang.String r6 = r0.A06
            X.Kp1 r2 = r0.A00
            java.lang.String r7 = r2.A01()
            java.lang.String r8 = r0.A05
            r1 = r18
            if (r18 == 0) goto L_0x0021
            java.lang.String r10 = r1.A03
            if (r10 != 0) goto L_0x0023
        L_0x0021:
            java.lang.String r10 = ""
        L_0x0023:
            if (r18 == 0) goto L_0x00ca
            int r1 = r1.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
        L_0x002b:
            com.instagram.api.schemas.IGAIAgentType r4 = r2.A00()
            java.lang.String r11 = r2.A02()
            java.lang.String r9 = "home"
            r13 = r20
            r3.A02(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x003a:
            java.lang.String r4 = r0.A02
            if (r4 == 0) goto L_0x0042
            r19 = r4
            if (r21 != 0) goto L_0x0044
        L_0x0042:
            r19 = r12
        L_0x0044:
            X.Kp1 r5 = r0.A00
            boolean r1 = r0.A0A
            if (r1 == 0) goto L_0x006e
            androidx.fragment.app.FragmentActivity r2 = r14.getActivity()
            if (r2 == 0) goto L_0x006d
            X.0eM r0 = r14.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r1 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r1.<init>(r0)
            java.lang.String r4 = r5.A03()
            X.0eM r0 = r14.A02
            java.lang.String r5 = X.DbS.A0t(r0)
            r8 = 1
            r3 = r14
            r6 = r12
            r7 = r19
            r1.A08(r2, r3, r4, r5, r6, r7, r8)
        L_0x006d:
            return
        L_0x006e:
            boolean r1 = r5 instanceof X.K0Y
            androidx.fragment.app.FragmentActivity r13 = r14.getActivity()
            if (r1 == 0) goto L_0x009d
            if (r13 == 0) goto L_0x006d
            X.0eM r1 = r14.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r12 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r12.<init>(r1)
            X.0eM r1 = r14.A02
            java.lang.String r16 = X.DbS.A0t(r1)
            X.K0Y r5 = (X.K0Y) r5
            java.lang.String r2 = r5.A00
            java.lang.String r1 = r0.A05
            java.lang.String r0 = r0.A03
            com.instagram.common.typedurl.SimpleImageUrl r15 = X.DbS.A0V(r0)
            r17 = r2
            r18 = r1
            r12.A04(r13, r14, r15, r16, r17, r18)
            return
        L_0x009d:
            if (r13 == 0) goto L_0x006d
            X.0eM r1 = r14.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r12 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r12.<init>(r1)
            java.lang.String r3 = r0.A05
            java.lang.String r1 = r0.A03
            com.instagram.common.typedurl.SimpleImageUrl r15 = X.DbS.A0V(r1)
            java.lang.String r2 = r0.A08
            java.lang.String r18 = r5.A03()
            X.0eM r1 = r14.A02
            java.lang.String r20 = X.DbS.A0t(r1)
            java.lang.String r0 = r0.A09
            r17 = r2
            r21 = r0
            r16 = r3
            r12.A06(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        L_0x00ca:
            r5 = r12
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K56.A00(X.GmB, X.Gll, X.K56, int, boolean):void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LRW lrw = (LRW) this.A00.getValue();
        String A0t = DbS.A0t(this.A02);
        if (A0t == null) {
            A0t = "unknown";
        }
        1Ln A002 = LRW.A00(lrw);
        if (DbT.A1Y(A002)) {
            A002.A0l("ai_home_screen_shown");
            A002.A0v(lrw.A02);
            JTU.A17(A002, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A0t);
        }
        C64831Lis lis = (C64831Lis) lrw.A03.getValue();
        long flowStartForMarker = C51965G9l.A0a(lis.A02).flowStartForMarker(895696558, PublicKeyCredentialControllerUtility.JSON_KEY_USER, true);
        lis.A00 = flowStartForMarker;
        C51803G2m g2m = new C51803G2m(lis, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A0t, 15);
        if (0 != flowStartForMarker) {
            g2m.invoke();
        }
    }

    public static final void A01(K56 k56) {
        String str;
        String A002 = AnonymousClass000.A00(2590);
        ((LRW) k56.A00.getValue()).A03(A002);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("AiStudioArgumentKeys.creation_entry_point", A002);
        A0a.putParcelable("utm_metadata", (UtmMetadata) k56.A06.getValue());
        AnonymousClass0eM r4 = k56.A04;
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        boolean A062 = 182.A06(AnonymousClass7TF.A0H(A0l), A0l, 36330204939305483L);
        0lg A0X = DbT.A0X(r4);
        Class<ModalActivity> cls = ModalActivity.class;
        FragmentActivity activity = k56.getActivity();
        if (A062) {
            str = "AI_CREATION_CUSTOM_AI";
        } else {
            str = "AI_CREATION_TEMPLATES";
        }
        AnonymousClass6W8 A032 = AnonymousClass6W8.A03(activity, A0a, A0X, cls, str);
        A032.A08();
        DbT.A1M(k56, A032);
    }

    public final String getModuleName() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public K56() {
        MM7 mm7 = new MM7(this, 18);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MM7(new MM7(this, 15), 16));
        this.A07 = DbS.A0I(new MM7(A002, 17), mm7, new MMZ(5, (Object) null, (Object) A002), DbS.A0z(C60243Ji0.class));
        this.A01 = MM7.A00(this, 11);
        this.A02 = MM7.A00(this, 12);
        this.A03 = MM7.A00(this, 13);
        this.A06 = AnonymousClass1YB.A00(new C66214MIv(this));
        this.A05 = AnonymousClass1YB.A00(C66231MJm.A00);
        this.A00 = MM7.A00(this, 10);
    }

    public final void configureActionBar(2da r5) {
        Dbb.A1I(r5);
        r5.Eom(2131952628);
        if (182.A06(0Tu.A05, DbT.A0X(this.A04), 36325145467499135L)) {
            AnonymousClass3JR A0K = DbS.A0K();
            A0K.A0K = DbV.A05(this).getString(2131952620);
            DbX.A19(new LYC((Object) this, 13), A0K, r5);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1305560069);
        K56.super.onCreate(bundle);
        JTO.A0U(this.A01).A06.markerStart(895683758);
        ((C60243Ji0) this.A07.getValue()).A00(DbS.A0t(this.A03));
        AnonymousClass0fD.A09(-1867536590, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2139142788);
        ComposeView A0H = DbV.A0H(this, new C59111J6t(this, 7), 339966549);
        AnonymousClass0fD.A09(1260259408, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(2112050079);
        super.onDestroy();
        C64831Lis lis = (C64831Lis) ((LRW) this.A00.getValue()).A03.getValue();
        MM7 mm7 = new MM7(lis, 47);
        if (0 != lis.A00) {
            mm7.invoke();
        }
        AnonymousClass7I6 A0U = JTO.A0U(this.A01);
        A0U.A06.markerEnd(895683758, JVT.A00(AnonymousClass05K.A0C));
        AnonymousClass0fD.A09(-1425090497, A022);
    }
}
