package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.Toast;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar;
import com.instagram.creation.base.ui.mediatabbar.Tab;
import com.instagram.creation.toolbar.CreationToolbarView;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.pendingmedia.model.ClipInfo;

public final class K6A extends AnonymousClass4DH implements AnonymousClass4DR, 1wn, C66502MUg {
    public static final Tab A0W = new Tab(2131956795, 2);
    public static final Tab A0X = new Tab(2131962411, 0);
    public static final Tab A0Y = new Tab(2131975538, 1);
    public static final String __redex_internal_original_name = "VideoEditFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ImageView A06;
    public Toast A07;
    public JWG A08;
    public C273524mj A09;
    public MediaEditActionBar A0A;
    public LOy A0B;
    public CreationToolbarView A0C;
    public C60188Jh7 A0D;
    public C61347K3p A0E;
    public C63955LFb A0F;
    public C378379Po A0G;
    public LP1 A0H;
    public Integer A0I;
    public boolean A0J;
    public boolean A0K;
    public Bundle A0L;
    public VideoSession A0M;
    public FilterGroupModel A0N;
    public final AnonymousClass0eM A0O = C227642jf.A02(this);
    public final AnonymousClass0eM A0P = DbS.A0I(C66296MMf.A00(this, 45), C66296MMf.A00(this, 46), MMY.A00(this, (Object) null, 33), DbS.A0z(C60263JiK.class));
    public final Handler A0Q = new Handler();
    public final C64698LgT A0R = C64698LgT.A00(this, 58);
    public final C64683LgB A0S = new C64683LgB(this, 1);
    public final 1wn A0T = C64698LgT.A00(this, 57);
    public final 1wn A0U = C64698LgT.A00(this, 59);
    public final String A0V = "video_edit";

    public static final void A04(K6A k6a) {
        View view;
        if (k6a.A0E != null && (view = k6a.A01) != null) {
            view.setSelected(false);
            C61347K3p k3p = k6a.A0E;
            if (k3p != null) {
                k3p.A0C();
            }
            if (k3p != null) {
                Bundle bundle = k6a.A0L;
                if (bundle == null) {
                    0qQ.A0F("arguments");
                    throw AnonymousClass00P.createAndThrow();
                }
                k3p.onSaveInstanceState(bundle);
            }
            k6a.A0E = null;
        }
    }

    public final /* synthetic */ void Dq9(float f, float f2) {
    }

    public final /* synthetic */ void DqB(Tab tab) {
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        K6A.super.onAttach(context);
        C273524mj requireActivity = requireActivity();
        0qQ.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.creation.base.provider.BaseCreationProvider");
        C273524mj r1 = requireActivity;
        this.A09 = r1;
        FilterGroupModel filterGroupModel = null;
        if (r1 == null) {
            0qQ.A0F("provider");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A08 = ((MediaCaptureActivity) r1).A07;
        VideoSession A042 = ((JWE) JTR.A0k(0mE.A01(context, C267844cJ.class))).A01.A04();
        this.A0M = A042;
        if (A042 != null) {
            filterGroupModel = A042.A0D;
        }
        this.A0N = filterGroupModel;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        int i;
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.A0L;
        if (bundle2 == null) {
            0qQ.A0F("arguments");
            throw AnonymousClass00P.createAndThrow();
        }
        bundle.putAll(bundle2);
        AnonymousClass3Q2 A0f = JTT.A0f(this);
        if (A0f == null) {
            0f9 AEf = 0wj.A01.AEf(__redex_internal_original_name, 817901174);
            AEf.ABQ(DialogModule.KEY_MESSAGE, "Getting pendingMedia failed");
            AEf.report();
            return;
        }
        AnonymousClass3QG r5 = A0f.A1i;
        if (r5 == null) {
            VideoSession videoSession = this.A0M;
            if (videoSession != null) {
                i = videoSession.A08;
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            i = r5.A01;
        }
        VideoSession videoSession2 = this.A0M;
        if (videoSession2 != null) {
            int i2 = videoSession2.A07;
            int i3 = videoSession2.A06;
            int i4 = videoSession2.A05;
            boolean z = videoSession2.A0L;
            r5.A01 = i;
            A0f.A05 = i2;
            ClipInfo clipInfo = A0f.A1N;
            clipInfo.A07 = i3;
            clipInfo.A05 = i4;
            A0f.A5F = z;
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            r21 = this;
            r13 = 0
            r3 = r22
            X.0qQ.A0B(r3, r13)
            r4 = r21
            r0 = r23
            super.onViewCreated(r3, r0)
            r4.A03 = r3
            android.content.Context r9 = r4.requireContext()
            X.0eM r5 = r4.A0O
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r5)
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r11 = r4.A0N
            X.0lg r6 = X.AnonymousClass7TF.A0L(r5, r13)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318183327668184(0x810732002217d8, double:3.031103605778898E-306)
            boolean r14 = X.182.A06(r2, r6, r0)
            r0 = 1353(0x549, float:1.896E-42)
            java.lang.String r12 = X.AnonymousClass000.A00(r0)
            X.9Po r8 = new X.9Po
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r4.A0G = r8
            android.content.Context r15 = r4.requireContext()
            com.instagram.common.session.UserSession r17 = X.AnonymousClass7TE.A0l(r5)
            X.9Po r6 = r4.A0G
            java.lang.String r12 = "Required value was null."
            if (r6 == 0) goto L_0x0463
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r1 = r4.A0N
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.82q r18 = X.JTU.A0L(r0)
            android.view.View r0 = r4.mView
            if (r0 == 0) goto L_0x045e
            X.LFb r14 = new X.LFb
            r19 = r6
            r20 = r1
            r16 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r4.A0F = r14
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.pendingmedia.model.PendingMediaProvider"
            X.0qQ.A0C(r1, r0)
            X.4cI r1 = (X.C267834cI) r1
            X.M3u r0 = new X.M3u
            r0.<init>(r4)
            r1.EBv(r0)
            boolean r0 = r4.A0J
            r6 = 8
            if (r0 == 0) goto L_0x040e
            X.9Po r1 = r4.A0G
            if (r1 == 0) goto L_0x0459
            X.JiK r0 = X.JTT.A0Q(r4)
            X.0qQ.A0B(r0, r13)
            r1.A05 = r0
            r0 = 2131430969(0x7f0b0e39, float:1.8483654E38)
            android.view.View r0 = r3.findViewById(r0)
            r4.A02 = r0
            r0 = 2131430984(0x7f0b0e48, float:1.8483684E38)
            android.view.View r0 = r3.findViewById(r0)
            r4.A05 = r0
            r0 = 2131430966(0x7f0b0e36, float:1.8483648E38)
            android.view.View r0 = r3.findViewById(r0)
            r4.A00 = r0
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            r0 = 2131429315(0x7f0b07c3, float:1.84803E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r7 = "null cannot be cast to non-null type android.view.View"
            X.0qQ.A0C(r0, r7)
            r0.setVisibility(r6)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            r0 = 2131429317(0x7f0b07c5, float:1.8480303E38)
            android.view.View r0 = r1.findViewById(r0)
            X.0qQ.A0C(r0, r7)
            r0.setVisibility(r6)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            r0 = 2131429314(0x7f0b07c2, float:1.8480297E38)
            android.view.View r0 = r1.findViewById(r0)
            X.0qQ.A0C(r0, r7)
            r0.setVisibility(r6)
            android.view.View r1 = r4.A02
            if (r1 == 0) goto L_0x0454
            r0 = 47
            X.LYD.A02(r1, r0, r4)
            android.view.View r0 = r4.A02
            boolean r0 = r0 instanceof com.instagram.igds.components.mediabutton.IgdsMediaButton
            if (r0 == 0) goto L_0x00ff
            X.0lg r7 = X.DbT.A0X(r5)
            r0 = 36328590031273412(0x8110a900013dc4, double:3.037684847043276E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00ff
            android.view.View r1 = r4.A02
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r1
            if (r1 == 0) goto L_0x00ff
            X.5pj r0 = X.C296235pj.CREATION_FLOW_BLUE
            r1.setButtonStyle(r0)
        L_0x00ff:
            X.3Q2 r9 = X.JTT.A0f(r4)
            r7 = 1
            if (r9 == 0) goto L_0x0404
            com.instagram.pendingmedia.model.ClipInfo r0 = r9.A1N
            X.0qQ.A0B(r0, r13)
            int r1 = r0.A03
            r0 = -1
            if (r1 != r0) goto L_0x0404
            android.view.View r0 = r4.A05
            if (r0 == 0) goto L_0x0117
            r0.setSelected(r13)
        L_0x0117:
            android.view.View r1 = r4.A05
            if (r1 == 0) goto L_0x0120
            r0 = 49
            X.LYD.A02(r1, r0, r4)
        L_0x0120:
            r10 = 0
        L_0x0121:
            android.view.View r0 = r4.A00
            if (r0 == 0) goto L_0x0128
            r0.setSelected(r13)
        L_0x0128:
            android.view.View r1 = r4.A00
            if (r1 == 0) goto L_0x0131
            r0 = 50
            X.LYD.A02(r1, r0, r4)
        L_0x0131:
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            r0 = 2131429316(0x7f0b07c4, float:1.8480301E38)
            android.view.View r8 = r1.findViewById(r0)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r4.A06 = r8
            if (r9 == 0) goto L_0x0159
            com.instagram.pendingmedia.model.ClipInfo r0 = r9.A1N
            if (r0 == 0) goto L_0x0159
            java.lang.String r1 = r0.A0E
            if (r1 == 0) goto L_0x0159
            java.lang.String r0 = "boomerang"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0159
            if (r8 == 0) goto L_0x0157
            r8.setVisibility(r6)
        L_0x0157:
            int r10 = r10 + 1
        L_0x0159:
            android.widget.ImageView r1 = r4.A06
            if (r1 == 0) goto L_0x0164
            if (r9 == 0) goto L_0x0401
            boolean r0 = r9.A5F
        L_0x0161:
            r1.setSelected(r0)
        L_0x0164:
            android.widget.ImageView r1 = r4.A06
            if (r1 == 0) goto L_0x016d
            r0 = 51
            X.LYD.A02(r1, r0, r4)
        L_0x016d:
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            r0 = 2131429292(0x7f0b07ac, float:1.8480253E38)
            android.view.View r0 = r1.findViewById(r0)
            X.0qQ.A07(r0)
            r0.setVisibility(r6)
            int r8 = r10 + 1
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            r9 = 2131430981(0x7f0b0e45, float:1.8483678E38)
            android.view.View r10 = r0.findViewById(r9)
            X.0qQ.A07(r10)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            int r1 = r10.getChildCount()
            int r1 = r1 - r7
            r0 = 2131442901(0x7f0b3cd5, float:1.8507855E38)
            if (r1 != r8) goto L_0x03f0
            X.DbT.A1F(r10, r0, r13)
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x019f:
            r10.setWeightSum(r1)
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x01bf
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.LRo r0 = X.C59953JcJ.A00(r0)
            r0.A09(r13)
            X.0nO r1 = X.0nY.A00()
            X.KIV r0 = new X.KIV
            r0.<init>(r4)
            r1.ATE(r0)
        L_0x01bf:
            X.0eM r8 = r4.A0P
            java.lang.Object r0 = r8.getValue()
            X.JiK r0 = (X.C60263JiK) r0
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x01ea
            X.0hq r1 = r4.getChildFragmentManager()
            r0 = 2131443705(0x7f0b3ff9, float:1.8509486E38)
            androidx.fragment.app.Fragment r1 = r1.A0P(r0)
            X.K3p r1 = (X.C61347K3p) r1
            if (r1 == 0) goto L_0x03e0
            r4.A0E = r1
            android.view.View r0 = r4.mView
            r1.A00 = r0
            X.9Po r0 = r4.A0G
            r1.A05 = r0
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r4.A0N
            r1.A06 = r0
        L_0x01ea:
            X.4mj r0 = r4.A09
            java.lang.String r11 = "provider"
            if (r0 == 0) goto L_0x044c
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r0 = r0.BQ1()
            r4.A0A = r0
            X.0lg r10 = X.DbT.A0X(r5)
            r0 = 36328590031207875(0x8110a900003dc3, double:3.0376848470018304E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x03d4
            X.KhI r1 = X.C62526KhI.BACK_CARROT
        L_0x0207:
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r0 = r4.A0A
            if (r0 == 0) goto L_0x020e
            r0.setupBackButton(r1)
        L_0x020e:
            boolean r0 = r4.A0J
            if (r0 == 0) goto L_0x03c1
            boolean r0 = r4.A0K
            if (r0 == 0) goto L_0x03c1
            r0 = 2131430974(0x7f0b0e3e, float:1.8483664E38)
            android.view.View r1 = r3.requireViewById(r0)
            r4.A04 = r1
            if (r1 == 0) goto L_0x0226
            r0 = 52
            X.LYD.A02(r1, r0, r4)
        L_0x0226:
            X.4mj r0 = r4.A09
            if (r0 == 0) goto L_0x044c
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r0 = r0.BQ1()
            android.view.View r0 = r0.A09
            r0.setVisibility(r6)
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            android.view.View r1 = r0.findViewById(r9)
            java.lang.String r0 = X.C273654mx.A00(r7)
            X.0qQ.A0C(r1, r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0 = 5
            r1.setGravity(r0)
            java.lang.Object r0 = r8.getValue()
            X.JiK r0 = (X.C60263JiK) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0267
            android.view.View r6 = r4.A04
            if (r6 == 0) goto L_0x0267
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            if (r1 == 0) goto L_0x0440
            X.2dQ r1 = (X.C71492dQ) r1
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.A03 = r0
            r6.setLayoutParams(r1)
        L_0x0267:
            java.lang.Object r0 = r8.getValue()
            X.JiK r0 = (X.C60263JiK) r0
            X.0Ud r6 = r0.A04
            r9 = 0
            r1 = 5
            X.MGY r0 = new X.MGY
            r0.<init>(r4, r9, r1)
            X.DbZ.A1C(r4, r0, r6)
            java.lang.Object r0 = r8.getValue()
            X.JiK r0 = (X.C60263JiK) r0
            X.0r6 r6 = r0.A01
            r1 = 6
            X.MGY r0 = new X.MGY
            r0.<init>(r4, r9, r1)
            X.DbZ.A1C(r4, r0, r6)
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.82q r0 = X.JTU.A0L(r0)
            X.36W r1 = X.JWE.A04(r0)
            X.36W r0 = X.AnonymousClass36W.PROFILE_PHOTO
            if (r1 == r0) goto L_0x02aa
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.82q r0 = X.JTU.A0L(r0)
            X.36W r1 = X.JWE.A04(r0)
            X.36W r0 = X.AnonymousClass36W.GROUP_PHOTO
            if (r1 != r0) goto L_0x02d1
        L_0x02aa:
            r0 = 2131428461(0x7f0b046d, float:1.8478567E38)
            android.view.View r9 = X.JTS.A0C(r3, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.PunchedOverlayView"
            X.0qQ.A0C(r9, r0)
            com.instagram.common.ui.widget.imageview.PunchedOverlayView r9 = (com.instagram.common.ui.widget.imageview.PunchedOverlayView) r9
            android.content.Context r6 = r4.requireContext()
            android.content.Context r1 = r4.requireContext()
            r0 = 2130970127(0x7f04060f, float:1.7548955E38)
            int r0 = X.JTP.A02(r1, r6, r0)
            r9.A01 = r0
            X.M3t r0 = new X.M3t
            r0.<init>(r9)
            r9.post(r0)
        L_0x02d1:
            r0 = 2131435998(0x7f0b21de, float:1.8493854E38)
            android.view.ViewGroup r10 = X.DbS.A0E(r3, r0)
            if (r10 == 0) goto L_0x0333
            X.1Av r1 = X.DbX.A0h(r5)
            X.0s0 r0 = r1.A3O
            X.0YZ[] r9 = X.1Av.A8a
            r6 = 480(0x1e0, float:6.73E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r1, r0, r9, r6)
            if (r0 != 0) goto L_0x0333
            X.0lg r11 = X.DbT.A0X(r5)
            r0 = 36328564261404079(0x8110a300003daf, double:3.037668550074143E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 == 0) goto L_0x0333
            android.view.LayoutInflater r1 = X.DbV.A0E(r4)
            r0 = 2131624077(0x7f0e008d, float:1.8875324E38)
            android.view.View r2 = r1.inflate(r0, r10, r13)
            r1 = 18
            X.LYm r0 = new X.LYm
            r0.<init>((android.view.View) r2, (int) r1)
            r2.setOnTouchListener(r0)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = -1
            r1.width = r0
            r1.height = r0
            r2.setLayoutParams(r1)
            r0 = 2131427961(0x7f0b0279, float:1.8477553E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r2, r0)
            r0 = 2131952871(0x7f1304e7, float:1.9542197E38)
            r1.setText(r0)
            r10.addView(r2)
            X.1Av r1 = X.DbX.A0h(r5)
            X.0s0 r0 = r1.A3O
            X.AnonymousClass7TF.A1J(r1, r0, r9, r6, r7)
        L_0x0333:
            java.lang.Object r0 = r8.getValue()
            X.JiK r0 = (X.C60263JiK) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x03c0
            r0 = 2131430973(0x7f0b0e3d, float:1.8483662E38)
            X.JTS.A0y(r3, r0)
            r0 = 2131430965(0x7f0b0e35, float:1.8483646E38)
            android.view.ViewStub r1 = X.JTR.A0X(r3, r0)
            r0 = 2131624691(0x7f0e02f3, float:1.8876569E38)
            android.view.View r1 = X.JTP.A0H(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.toolbar.CreationToolbarView"
            X.0qQ.A0C(r1, r0)
            com.instagram.creation.toolbar.CreationToolbarView r1 = (com.instagram.creation.toolbar.CreationToolbarView) r1
            r4.A0C = r1
            if (r1 == 0) goto L_0x0361
            r1.setVisibility(r13)
        L_0x0361:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r5)
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.82q r1 = X.JTU.A0L(r0)
            X.KCj r0 = new X.KCj
            r0.<init>(r2, r1)
            X.2YN r1 = X.JTO.A0L(r0, r4)
            java.lang.Class<X.Jh7> r0 = X.C60188Jh7.class
            X.2YL r3 = r1.A00(r0)
            X.Jh7 r3 = (X.C60188Jh7) r3
            r4.A0D = r3
            if (r3 == 0) goto L_0x03aa
            com.instagram.creation.toolbar.CreationToolbarView r0 = r4.A0C
            if (r0 == 0) goto L_0x0389
            r0.setViewModel(r3)
        L_0x0389:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r0 = 41
            X.C66296MMf.A01(r1, r3, r2, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            r0 = 42
            X.C66296MMf.A01(r1, r3, r2, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            r0 = 43
            X.C66296MMf.A01(r1, r3, r2, r0)
            X.05G r1 = r3.A05
        L_0x03a4:
            boolean r0 = X.JTP.A1b(r2, r1)
            if (r0 == 0) goto L_0x03a4
        L_0x03aa:
            X.Jh7 r0 = r4.A0D
            if (r0 == 0) goto L_0x03c0
            X.2Fk r3 = r0.A00
            X.07Z r2 = r4.getViewLifecycleOwner()
            r0 = 24
            X.MP9 r1 = new X.MP9
            r1.<init>(r4, r0)
            r0 = 19
            X.Dba.A15(r2, r3, r1, r0)
        L_0x03c0:
            return
        L_0x03c1:
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r9 = r4.A0A
            if (r9 == 0) goto L_0x0447
            boolean r6 = r4.A0K
            r0 = 53
            X.LYD r1 = X.LYD.A01(r4, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.JWN.A01(r1, r9, r0, r6)
            goto L_0x0267
        L_0x03d4:
            boolean r0 = r4.A0K
            if (r0 == 0) goto L_0x03dc
            X.KhI r1 = X.C62526KhI.CANCEL
            goto L_0x0207
        L_0x03dc:
            X.KhI r1 = X.C62526KhI.BACK
            goto L_0x0207
        L_0x03e0:
            java.lang.Object r0 = r8.getValue()
            X.JiK r0 = (X.C60263JiK) r0
            r0.A00()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            A05(r4, r0)
            goto L_0x01ea
        L_0x03f0:
            X.DbT.A1F(r10, r0, r6)
            int r8 = r8 + 1
            int r0 = r10.getChildCount()
            float r1 = (float) r0
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 + r0
            float r0 = (float) r8
            float r1 = r1 - r0
            goto L_0x019f
        L_0x0401:
            r0 = 0
            goto L_0x0161
        L_0x0404:
            android.view.View r0 = r4.A05
            if (r0 == 0) goto L_0x040b
            r0.setVisibility(r6)
        L_0x040b:
            r10 = 1
            goto L_0x0121
        L_0x040e:
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            r0 = 2131429315(0x7f0b07c3, float:1.84803E38)
            android.view.View r0 = r1.findViewById(r0)
            r4.A02 = r0
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            r0 = 2131429317(0x7f0b07c5, float:1.8480303E38)
            android.view.View r0 = r1.findViewById(r0)
            r4.A05 = r0
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            r0 = 2131429314(0x7f0b07c2, float:1.8480297E38)
            android.view.View r0 = r1.findViewById(r0)
            r4.A00 = r0
            android.view.View r1 = r4.A02
            if (r1 == 0) goto L_0x00ff
            r0 = 48
            X.LYD.A02(r1, r0, r4)
            goto L_0x00ff
        L_0x0440:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0447:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x044c:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0454:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x0459:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x045e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x0463:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6A.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final C61868KPh A00(K6A k6a) {
        String str;
        C378379Po r1 = k6a.A0G;
        if (r1 != null) {
            r1.A08 = AnonymousClass000.A00(3119);
            C59882Jb5.A01(AnonymousClass7TE.A0l(k6a.A0O), AnonymousClass05K.A0d);
            k6a.A0I = AnonymousClass05K.A0N;
            Bundle bundle = k6a.A0L;
            if (bundle == null) {
                str = "arguments";
            } else {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.putBoolean("VideoCoverFragmentBase.SAVE_AND_FINISH", false);
                C61868KPh kPh = new C61868KPh();
                kPh.A00 = k6a.mView;
                kPh.A05 = k6a.A0G;
                kPh.A06 = k6a.A0N;
                kPh.A07 = k6a.A0H;
                C63955LFb lFb = k6a.A0F;
                if (lFb == null) {
                    str = "videoPreviewController";
                } else {
                    kPh.A04 = lFb;
                    kPh.setArguments(bundle2);
                    return kPh;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final C61869KPi A01(K6A k6a) {
        String str;
        C378379Po r1 = k6a.A0G;
        if (r1 != null) {
            r1.A08 = AnonymousClass000.A00(1353);
            C59882Jb5.A01(AnonymousClass7TE.A0l(k6a.A0O), AnonymousClass05K.A0b);
            Bundle bundle = k6a.A0L;
            if (bundle == null) {
                str = "arguments";
            } else {
                Bundle bundle2 = new Bundle(bundle);
                C61869KPi kPi = new C61869KPi();
                kPi.A00 = k6a.mView;
                kPi.A05 = k6a.A0G;
                kPi.A06 = k6a.A0N;
                C273524mj r0 = k6a.A09;
                if (r0 == null) {
                    str = "provider";
                } else {
                    kPi.A02 = r0;
                    C63955LFb lFb = k6a.A0F;
                    if (lFb == null) {
                        str = "videoPreviewController";
                    } else {
                        kPi.A04 = lFb;
                        kPi.setArguments(bundle2);
                        return kPi;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final C61870KPj A02(K6A k6a) {
        String str;
        C378379Po r1 = k6a.A0G;
        if (r1 != null) {
            r1.A08 = AnonymousClass000.A00(3121);
            C59882Jb5.A01(AnonymousClass7TE.A0l(k6a.A0O), AnonymousClass05K.A0c);
            Bundle bundle = k6a.A0L;
            if (bundle == null) {
                str = "arguments";
            } else {
                Bundle bundle2 = new Bundle(bundle);
                C61870KPj kPj = new C61870KPj();
                kPj.A00 = k6a.mView;
                kPj.A05 = k6a.A0G;
                kPj.A06 = k6a.A0N;
                kPj.A07 = k6a.A0H;
                C63955LFb lFb = k6a.A0F;
                if (lFb == null) {
                    str = "videoPreviewController";
                } else {
                    kPj.A04 = lFb;
                    kPj.setArguments(bundle2);
                    return kPj;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A03(K6A k6a) {
        ViewParent parent;
        if (k6a.A0B == null && k6a.A0C != null) {
            UserSession A0l = AnonymousClass7TE.A0l(k6a.A0O);
            Context requireContext = k6a.requireContext();
            CreationToolbarView creationToolbarView = k6a.A0C;
            if (creationToolbarView == null || (parent = creationToolbarView.getParent()) == null) {
                throw AnonymousClass7TE.A0y();
            }
            k6a.A0B = new LOy(requireContext, (ViewGroup) parent, A0l);
        }
    }

    public static final void A05(K6A k6a, Integer num) {
        0s1 r2;
        int i;
        C61347K3p k3p;
        Integer num2 = k6a.A0I;
        if (num2 == null || num != num2) {
            Integer num3 = AnonymousClass05K.A0N;
            if (num != num3) {
                Integer num4 = AnonymousClass05K.A0C;
                if (num != num4) {
                    Integer num5 = AnonymousClass05K.A00;
                    if (num2 != num5 || k6a.A0E == null) {
                        A04(k6a);
                        k6a.A0I = num5;
                        View view = k6a.A02;
                        k6a.A01 = view;
                        if (view != null) {
                            view.setSelected(true);
                            k6a.A0E = A01(k6a);
                            r2 = DbW.A0C(k6a);
                            i = R.id.video_edit_fragment_container_front;
                            k3p = k6a.A0E;
                            if (k3p == null) {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        return;
                    }
                } else if (num2 != num4 || k6a.A0E == null) {
                    A04(k6a);
                    k6a.A0I = num4;
                    View view2 = k6a.A05;
                    k6a.A01 = view2;
                    if (view2 != null) {
                        view2.setSelected(true);
                        k6a.A0E = A02(k6a);
                        r2 = DbW.A0C(k6a);
                        i = R.id.video_edit_fragment_container_front;
                        k3p = k6a.A0E;
                        if (k3p == null) {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    return;
                }
                r2.A0A(k3p, i);
                r2.A00();
            } else if (num2 != num3 || k6a.A0E == null) {
                A04(k6a);
                View view3 = k6a.A00;
                k6a.A01 = view3;
                if (view3 != null) {
                    view3.setSelected(true);
                    k6a.A0E = A00(k6a);
                    0s1 A0C2 = DbW.A0C(k6a);
                    C61347K3p k3p2 = k6a.A0E;
                    if (k3p2 != null) {
                        A0C2.A0A(k3p2, R.id.video_edit_fragment_container_front);
                        A0C2.A00();
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }

    public final AnonymousClass3Q2 A06(Context context) {
        return 28K.A00(AnonymousClass7TE.A0l(this.A0O)).A03(JTR.A0k(context).E2M());
    }

    public final void DqA(Tab tab, Tab tab2) {
        View view;
        Tab tab3 = A0X;
        if (0qQ.A0K(tab2, tab3)) {
            if (tab != null && !tab.equals(tab3)) {
                27r A0g = C51971G9r.A0g(this.A0O);
                if (A0g.A0J() != null) {
                    27r.A08(C59725JVj.POST_CAPTURE, A0g, "FEED_COLOR_FILTER_CAROUSEL_TAP", false);
                }
            }
            view = this.A02;
        } else if (0qQ.A0K(tab2, A0Y)) {
            view = this.A05;
        } else if (0qQ.A0K(tab2, A0W)) {
            view = this.A00;
        } else {
            return;
        }
        if (view != null) {
            view.performClick();
        }
    }

    public final String getModuleName() {
        return this.A0V;
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0O);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
        if (r8 != r0) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r11 = this;
            X.K3p r1 = r11.A0E
            boolean r0 = r1 instanceof X.AnonymousClass4DR
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0013
            X.4DR r1 = (X.AnonymousClass4DR) r1
            if (r1 == 0) goto L_0x0013
            boolean r0 = r1.onBackPressed()
            if (r0 != r4) goto L_0x0013
            return r4
        L_0x0013:
            boolean r0 = r11.A0K
            r2 = 0
            X.3Q2 r6 = X.JTT.A0f(r11)
            if (r0 != 0) goto L_0x0076
            if (r6 == 0) goto L_0x0125
            boolean r0 = r6.A0r()
            if (r0 != 0) goto L_0x003c
            boolean r0 = X.C64188LSv.A04(r6)
            if (r0 != 0) goto L_0x003c
            X.JiK r1 = X.JTT.A0Q(r11)
            android.content.Context r0 = r11.requireContext()
            X.82q r0 = X.JTU.A0L(r0)
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0049
        L_0x003c:
            X.JWG r1 = r11.A08
            if (r1 == 0) goto L_0x0049
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            boolean r0 = r1.A0A(r2, r0)
            if (r0 != r4) goto L_0x0049
            return r4
        L_0x0049:
            java.lang.String r0 = r6.A3w
            if (r0 == 0) goto L_0x0050
            X.AnonymousClass457.A0F(r0)
        L_0x0050:
            androidx.fragment.app.FragmentActivity r0 = r11.requireActivity()
            X.82q r0 = X.JTU.A0L(r0)
            com.instagram.creation.base.VideoSession r1 = X.JWE.A03(r0)
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r1.A0E
            if (r0 == 0) goto L_0x0066
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r0 = r0.E1g()
            r1.A0D = r0
        L_0x0066:
            X.6SR r2 = X.AnonymousClass6SR.A01()
            X.0eM r0 = r11.A0O
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = "gallery"
            r2.A07(r1, r0, r4)
            return r3
        L_0x0076:
            if (r6 == 0) goto L_0x0125
            com.instagram.creation.base.VideoSession r0 = r11.A0M
            java.lang.String r10 = "Required value was null."
            if (r0 == 0) goto L_0x0120
            int r3 = r0.A08
            int r1 = r0.A07
            int r9 = r0.A06
            int r8 = r0.A05
            boolean r7 = r0.A0L
            X.3QG r0 = r6.A1i
            int r0 = r0.A01
            boolean r5 = X.JTQ.A1O(r0, r3)
            int r0 = r6.A05
            boolean r3 = X.JTQ.A1O(r0, r1)
            com.instagram.pendingmedia.model.ClipInfo r0 = r6.A1N
            int r1 = r0.A07
            int r0 = r0.A05
            if (r9 != r1) goto L_0x00a1
            r1 = 0
            if (r8 == r0) goto L_0x00a2
        L_0x00a1:
            r1 = 1
        L_0x00a2:
            boolean r0 = r6.A5F
            boolean r0 = X.JTQ.A1O(r0, r7)
            if (r5 != 0) goto L_0x00cf
            if (r3 != 0) goto L_0x00cf
            if (r1 != 0) goto L_0x00cf
            if (r0 != 0) goto L_0x00cf
            X.JiK r1 = X.JTT.A0Q(r11)
            android.content.Context r0 = r11.requireContext()
            X.82q r0 = X.JTU.A0L(r0)
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x00cf
            X.JWG r1 = r11.A08
            if (r1 == 0) goto L_0x00cf
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            boolean r0 = r1.A0A(r2, r0)
            if (r0 != r4) goto L_0x00cf
            return r4
        L_0x00cf:
            java.lang.String r0 = r6.A3w
            if (r0 == 0) goto L_0x00d6
            X.AnonymousClass457.A0F(r0)
        L_0x00d6:
            com.instagram.creation.base.VideoSession r0 = r11.A0M
            if (r0 == 0) goto L_0x011b
            int r7 = r0.A08
            int r5 = r0.A07
            int r3 = r0.A06
            int r2 = r0.A05
            boolean r1 = r0.A0L
            X.3QG r0 = r6.A1i
            r0.A01 = r7
            r6.A05 = r5
            com.instagram.pendingmedia.model.ClipInfo r0 = r6.A1N
            r0.A07 = r3
            r0.A05 = r2
            r6.A5F = r1
            android.content.Context r0 = r11.requireContext()
            X.82q r0 = X.JTU.A0L(r0)
            com.instagram.creation.base.VideoSession r1 = X.JWE.A03(r0)
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r1.A0E
            if (r0 == 0) goto L_0x0108
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r0 = r0.E1g()
            r1.A0D = r0
        L_0x0108:
            X.6SR r3 = X.AnonymousClass6SR.A01()
            X.0eM r2 = r11.A0O
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r0 = "edit_carousel"
            r3.A07(r1, r0, r4)
            X.C59888JbD.A02(r2)
            return r4
        L_0x011b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x0120:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x0125:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6A.onBackPressed():boolean");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-202443407);
        K6A.super.onCreate(bundle);
        Bundle A082 = DbY.A08(this);
        this.A0L = A082;
        if (bundle != null) {
            A082.putAll(bundle);
        }
        JWB.A00(this, DbT.A0X(this.A0O));
        Bundle bundle2 = this.A0L;
        if (bundle2 == null) {
            0qQ.A0F("arguments");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A0K = bundle2.getBoolean("VideoEditFragment.standalone_mode", false);
        this.A0J = JWN.A05(requireContext());
        AnonymousClass3Q2 A0f = JTT.A0f(this);
        VideoSession videoSession = this.A0M;
        if (videoSession != null) {
            videoSession.A00(A0f);
        }
        JWE.A03(JTU.A0L(requireActivity())).A0N.EK1();
        AnonymousClass0fD.A09(-1703419360, A022);
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return C63463KxS.A00(this, i2, z);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2030599075);
        0qQ.A0B(layoutInflater, 0);
        boolean z = this.A0J;
        int i = R.layout.fragment_video_edit_small;
        if (z) {
            i = R.layout.fragment_video_edit_v2;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        View findViewById = requireActivity().findViewById(R.id.creation_secondary_actions);
        0qQ.A07(findViewById);
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        viewGroup2.removeAllViews();
        layoutInflater.inflate(R.layout.action_bar_secondary_actions, viewGroup2);
        ViewStub A0X2 = JTR.A0X(viewGroup2, R.id.audio_button_stub);
        A0X2.setLayoutResource(R.layout.mute_audio_button);
        A0X2.inflate();
        DbX.A0R(this.A0O).A01(this, C59890JbF.class);
        AnonymousClass0fD.A09(-231072460, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1280004862);
        super.onDestroyView();
        DbX.A0R(this.A0O).A02(this, C59890JbF.class);
        this.A0Q.removeCallbacksAndMessages((Object) null);
        this.A03 = null;
        LP1 lp1 = this.A0H;
        if (lp1 != null) {
            lp1.A03 = null;
            lp1.A02 = null;
            lp1.A04 = null;
            try {
                lp1.A00.release();
            } catch (Exception unused) {
            }
            lp1.A08.removeCallbacksAndMessages((Object) null);
            lp1.A09.evictAll();
            lp1.A0A.evictAll();
        }
        this.A0H = null;
        this.A07 = null;
        this.A02 = null;
        this.A05 = null;
        this.A00 = null;
        this.A01 = null;
        this.A0G = null;
        this.A0C = null;
        AnonymousClass0fD.A09(915714600, A022);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(598594808);
        AnonymousClass0fD.A0A(-1092320867, AnonymousClass7TG.A0D(obj, 1741203282));
        AnonymousClass0fD.A0A(-1596339824, A032);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1326972093);
        K6A.super.onPause();
        C63955LFb lFb = this.A0F;
        if (lFb == null) {
            0qQ.A0F("videoPreviewController");
            throw AnonymousClass00P.createAndThrow();
        }
        C378369Pn r0 = lFb.A03;
        r0.A04();
        r0.A01();
        1Ng A0R2 = DbX.A0R(this.A0O);
        A0R2.A02(this.A0T, C64650Lfc.class);
        A0R2.A02(this.A0U, C64634LfM.class);
        A0R2.A02(this.A0S, C64651Lfd.class);
        A0R2.A02(this.A0R, C64633LfL.class);
        AnonymousClass0fD.A09(103562080, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1989012122);
        super.onResume();
        requireActivity().setRequestedOrientation(1);
        C63955LFb lFb = this.A0F;
        if (lFb == null) {
            0qQ.A0F("videoPreviewController");
            throw AnonymousClass00P.createAndThrow();
        }
        C378369Pn r0 = lFb.A03;
        r0.A04();
        r0.A03();
        1Ng A0R2 = DbX.A0R(this.A0O);
        A0R2.A01(this.A0T, C64650Lfc.class);
        A0R2.A01(this.A0U, C64634LfM.class);
        A0R2.A01(this.A0S, C64651Lfd.class);
        A0R2.A01(this.A0R, C64633LfL.class);
        AnonymousClass0fD.A09(1969535922, A022);
    }
}
