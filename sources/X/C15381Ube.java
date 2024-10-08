package X;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Scene;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Ube  reason: case insensitive filesystem */
public final class C15381Ube extends AnonymousClass4DH implements C249763kK, AnonymousClass4DV, C232682uF, AnonymousClass4DR, C266514Zg, C227252iu, AnonymousClass0j6, AnonymousClass4DS, AnonymousClass4DT {
    public static final String __redex_internal_original_name = "HashtagPageFragment";
    public C54689HOu A00;
    public C227762js A01;
    public C321676uZ A02;
    public C320506sU A03;
    public 0wc A04;
    public GXC A05;
    public C14227TsA A06;
    public C14074TpO A07;
    public HAI A08;
    public C18586Vud A09;
    public X9Q A0A;
    public AnonymousClass36D A0B;
    public AnonymousClass2uE A0C;
    public VZZ A0D;
    public C18755Vzq A0E;
    public C15949UlK A0F;
    public UmI A0G;
    public C49659F0q A0H;
    public C18575VuR A0I;
    public C17586Vae A0J;
    public AnonymousClass357 A0K;
    public C231002qi A0L;
    public C230882qT A0M;
    public String A0N;
    public String A0O = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
    public boolean A0P = true;
    public 1Ng A0Q;
    public C16672Uz8 A0R;
    public C15694Uh0 A0S;
    public VW0 A0T;
    public WNH A0U;
    public String A0V;
    public String A0W;
    public boolean A0X;
    public final Handler A0Y = AnonymousClass7TF.A0D();
    public final C14005To7 A0Z = new C14005To7();
    public final C309546Yr A0a = new C309546Yr(true);
    public final WW4 A0b = new C15942UlC(this, 1);
    public final C18806W2y A0c = new C18806W2y();
    public final VO7 A0d;
    public final AnonymousClass32Q A0e = AnonymousClass32Q.A00;
    public final String A0f = "feed_hashtag";
    public final String A0g;
    public final AnonymousClass0eM A0h;
    public final AnonymousClass0eM A0i = C227642jf.A02(this);
    public final X3B A0j = new WNG(this);
    public final C267664bz A0k = new WNK(this, 0);
    public final C320326sC A0l;
    public final 1wn A0m = new WQU(this, 3);
    public final 1wn A0n = new WQU(this, 4);
    public final 1wn A0o = new WQU(this, 5);
    public final C61110lV A0p;
    public final C20949X6c A0q = new WVd(this);
    public final C20898X3p A0r = new WVg(this);
    public final C21052XBu A0s = new C19349WVq(this, 2);
    public final C20907X3y A0t = new C19355WVw(this, 1);
    public final JO7 A0u;
    public final X41 A0v = new WW5(this, 1);
    public final X47 A0w = new C72688PFs(this, 2);
    public final C289875eN A0x;
    public final C51930G7y A0y;
    public final C19735Wec A0z = new C19735Wec(this);
    public final VO8 A10 = new VO8(this);
    public final C17775Vfm A11;
    public final VO9 A12 = new VO9(this);
    public final VOA A13 = new VOA(this);
    public final VOB A14 = new VOB(this);
    public final WQW A15 = new WQW();
    public final C249383je A16 = new HC8(this, 2);
    public final AnonymousClass0eM A17;
    public final AnonymousClass0eM A18 = AnonymousClass1YB.A00(new MMJ(this, 19));

    public static final void A08(C15381Ube ube, String str, int i, boolean z, boolean z2) {
        C15381Ube ube2 = ube;
        C18575VuR vuR = ube.A0I;
        String str2 = "feedRequestController";
        if (vuR != null) {
            C16672Uz8 uz8 = vuR.A00;
            0qQ.A07(uz8);
            boolean z3 = z2;
            C15964Ulg ulg = new C15964Ulg(uz8, ube2, i, z, z3);
            String str3 = ube.A0W;
            if (z && str3 != null) {
                HAI hai = ube.A08;
                if (hai == null) {
                    str2 = "dataSource";
                } else {
                    C16672Uz8 uz82 = hai.A00;
                    C16672Uz8 uz83 = ube.A0R;
                    if (uz83 == null) {
                        str2 = "initialTab";
                    } else if (uz82 == uz83) {
                        C18575VuR vuR2 = ube.A0I;
                        if (vuR2 != null) {
                            vuR2.A01(ulg, str3, true, z3, ube.A0X);
                            return;
                        }
                    }
                }
            }
            C18575VuR vuR3 = ube.A0I;
            if (vuR3 != null) {
                vuR3.A01(ulg, str, z, z2, ube.A0X);
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CbJ() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r14v11, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        if (X.AnonymousClass7TF.A1Y(r1.A01.BWU(), true) != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e4, code lost:
        if (r14.length() == 0) goto L_0x00e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r33) {
        /*
            r32 = this;
            r6 = 0
            r7 = r33
            X.0qQ.A0B(r7, r6)
            r8 = r32
            r7.ErT(r8)
            r5 = 1
            r7.Eu4(r5)
            r10 = 0
            r7.EnO(r10)
            X.F0q r3 = r8.A0H
            if (r3 != 0) goto L_0x0021
            java.lang.String r0 = "actionBarHelper"
        L_0x0019:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0021:
            X.3JR r2 = new X.3JR
            r2.<init>()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A02(r0)
            r1 = 45
            X.FP1 r0 = new X.FP1
            r0.<init>(r3, r1)
            X.DbX.A19(r0, r2, r7)
            X.UlK r14 = r8.A0F
            if (r14 != 0) goto L_0x003c
            java.lang.String r0 = "actionBarController"
            goto L_0x0019
        L_0x003c:
            X.Vfm r0 = r14.A0I
            X.V3z r12 = r0.A00()
            X.Ube r4 = r0.A00
            java.lang.String r2 = r4.A0N
            if (r2 != 0) goto L_0x004b
            java.lang.String r0 = "_actionBarTitle"
            goto L_0x0019
        L_0x004b:
            X.Vt4 r0 = A01(r4)
            X.N3M r9 = r0.A00
            X.Vt4 r1 = A01(r4)
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x041f
            X.V3z r1 = r1.A06
            r11 = 1
            com.instagram.model.hashtag.Hashtag r0 = r1.A01
            java.lang.Boolean r0 = r0.BWU()
            if (r0 == 0) goto L_0x041f
            com.instagram.model.hashtag.Hashtag r0 = r1.A01
            java.lang.Boolean r0 = r0.BWU()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r5)
            if (r0 == 0) goto L_0x041f
        L_0x0070:
            if (r12 != 0) goto L_0x0091
            X.VSh r0 = r14.A0F
            r7.setTitle(r2)
            X.Vh9 r3 = r0.A01
            r1 = -1
        L_0x007a:
            r3.A00(r7, r1)
        L_0x007d:
            boolean r0 = r8.A0P
            if (r0 != 0) goto L_0x0090
            X.W2y r2 = r8.A0c
            r1 = 20643846(0x13b0006, float:3.4346492E-38)
            X.C18806W2y.A01(r2, r1, r5)
            java.lang.String r0 = "HEADER_FULLY_LOADED"
            X.C18806W2y.A05(r2, r0, r1)
            r8.A0P = r5
        L_0x0090:
            return
        L_0x0091:
            if (r9 == 0) goto L_0x0193
            X.VSh r11 = r14.A0F
            X.0wc r10 = r14.A07
            X.0iw r4 = r14.A06
            com.instagram.common.session.UserSession r3 = r14.A03
            androidx.fragment.app.Fragment r0 = r14.A00
            androidx.fragment.app.FragmentActivity r16 = r0.requireActivity()
            com.instagram.model.hashtag.Hashtag r12 = r12.A01
            X.WXf r13 = r14.A04
            r7.setTitle(r2)
            r0 = 2131625952(0x7f0e07e0, float:1.8879126E38)
            android.view.View r2 = r7.A7q(r0)
            r0 = 2131434707(0x7f0b1cd3, float:1.8491236E38)
            android.view.View r14 = r2.requireViewById(r0)
            r0 = 2131443373(0x7f0b3ead, float:1.8508812E38)
            android.view.View r1 = r2.requireViewById(r0)
            X.VXx r0 = new X.VXx
            r0.<init>(r2)
            r14.setTag(r0)
            java.lang.Object r0 = X.DbT.A0o(r14)
            X.VXx r0 = (X.C17494VXx) r0
            X.WVp r15 = new X.WVp
            r20 = r12
            r17 = r4
            r18 = r10
            r19 = r3
            r15.<init>(r16, r17, r18, r19, r20)
            X.0qQ.A0B(r0, r5)
            java.lang.String r14 = r9.A09
            if (r14 == 0) goto L_0x00e6
            int r3 = r14.length()
            r10 = 0
            if (r3 != 0) goto L_0x00e7
        L_0x00e6:
            r10 = 1
        L_0x00e7:
            r4 = 8
            android.widget.TextView r3 = r0.A01
            if (r10 == 0) goto L_0x018e
            r3.setVisibility(r4)
        L_0x00f0:
            java.lang.String r10 = r9.A04
            if (r10 == 0) goto L_0x0187
            int r3 = r10.length()
            if (r3 == 0) goto L_0x0187
            android.widget.TextView r3 = r0.A00
            X.C13990Tnq.A0v(r3, r10, r5)
        L_0x00ff:
            com.instagram.igds.components.button.IgdsButton r14 = r0.A03
            boolean r3 = r9.A0D
            if (r3 == 0) goto L_0x0184
            X.4lo r3 = X.C273014lo.PRIMARY
        L_0x0107:
            r14.setStyle(r3)
            java.lang.String r10 = r9.A03
            if (r10 == 0) goto L_0x017f
            int r3 = r10.length()
            if (r3 == 0) goto L_0x017f
            r14.setVisibility(r6)
            r14.setText((java.lang.String) r10)
            r3 = 10
            X.WBG r10 = new X.WBG
            r10.<init>(r3, r9, r15)
        L_0x0121:
            X.AnonymousClass0fU.A00(r10, r14)
            X.UBs r0 = r0.A02
            X.VBU.A00(r9, r15, r0)
            X.0qQ.A0B(r12, r6)
            boolean r0 = X.C281965Ag.A03(r12)
            if (r0 == 0) goto L_0x017b
            java.lang.Boolean r0 = r12.Ab5()
            if (r0 == 0) goto L_0x0142
            java.lang.Boolean r0 = r12.Ab5()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x017b
        L_0x0142:
            r1.setVisibility(r6)
            r0 = 2131443372(0x7f0b3eac, float:1.850881E38)
            android.widget.TextView r6 = X.DbU.A0G(r1, r0)
            android.content.Context r4 = r11.A00
            r3 = 2131975859(0x7f135eb3, float:1.9588822E38)
            java.lang.String r0 = r12.getName()
            X.DbX.A13(r4, r6, r0, r3)
            r0 = 37
            X.WB4.A00(r1, r11, r13, r12, r0)
        L_0x015d:
            android.content.Context r1 = r11.A00
            int r0 = X.0nA.A09(r1)
            int r3 = X.C13988Tno.A04(r0)
            int r1 = X.0nA.A08(r1)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            X.C13988Tno.A11(r2, r1, r0, r3)
            X.Vh9 r3 = r11.A01
            int r1 = r3.A01
            int r0 = r2.getMeasuredHeight()
            int r1 = r1 + r0
            goto L_0x007a
        L_0x017b:
            r1.setVisibility(r4)
            goto L_0x015d
        L_0x017f:
            r14.setVisibility(r4)
            r10 = 0
            goto L_0x0121
        L_0x0184:
            X.4lo r3 = X.C273014lo.PRIMARY_LINK
            goto L_0x0107
        L_0x0187:
            android.widget.TextView r3 = r0.A00
            r3.setVisibility(r4)
            goto L_0x00ff
        L_0x018e:
            X.C13990Tnq.A0v(r3, r14, r5)
            goto L_0x00f0
        L_0x0193:
            X.VVz r1 = r14.A00
            if (r1 != 0) goto L_0x01b6
            androidx.fragment.app.Fragment r0 = r14.A00
            android.content.Context r0 = r0.requireContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
            r1 = 2131625946(0x7f0e07da, float:1.8879114E38)
            android.view.ViewGroup r0 = r7.C7z()
            android.view.View r0 = r3.inflate(r1, r0, r6)
            r0.setOnClickListener(r10)
            X.VVz r1 = new X.VVz
            r1.<init>(r0)
            r14.A00 = r1
        L_0x01b6:
            android.view.View r0 = r1.A00
            r7.A7r(r0)
            if (r11 != 0) goto L_0x01db
            X.VSh r4 = r14.A0F
            X.Vud r3 = r14.A09
            X.VVz r1 = r14.A00
            X.2eb r0 = r1.A01
            r0.A02()
            X.2eb r0 = r1.A02
            r3.A01(r0)
            X.Vh9 r1 = r4.A01
            int r0 = r7.AYI()
            r1.A00(r7, r0)
            r7.setTitle(r2)
            goto L_0x007d
        L_0x01db:
            X.Vt4 r0 = A01(r4)
            X.Cux r0 = r0.A03
            if (r0 == 0) goto L_0x0409
            X.Vt4 r0 = A01(r4)
            X.Cux r0 = r0.A03
            java.lang.String r9 = r0.A00
        L_0x01eb:
            X.VSh r0 = r14.A0F
            r31 = r0
            androidx.fragment.app.Fragment r0 = r14.A00
            r23 = r0
            X.VjY r11 = r14.A0B
            com.instagram.common.session.UserSession r4 = r14.A03
            X.2uF r3 = r14.A0A
            X.WXf r1 = r14.A04
            X.Vud r0 = r14.A09
            r22 = r0
            X.UmI r0 = r14.A0G
            r24 = r0
            X.VO8 r0 = r14.A0H
            r21 = r0
            X.VVz r13 = r14.A00
            android.view.View$OnClickListener r0 = r14.A02
            r30 = r0
            r7.setTitle(r2)
            X.2eb r0 = r13.A01
            r0.A03(r6)
            android.view.View r0 = r0.A01()
            java.lang.Object r2 = r0.getTag()
            X.Waw r2 = (X.C19510Waw) r2
            if (r2 != 0) goto L_0x0229
            X.Waw r2 = new X.Waw
            r2.<init>(r0)
            r0.setTag(r2)
        L_0x0229:
            com.instagram.model.hashtag.Hashtag r0 = r12.A01
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            boolean r0 = X.C253833rU.A02(r0)
            if (r0 != 0) goto L_0x0402
            com.instagram.model.hashtag.Hashtag r0 = r12.A01
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
        L_0x023b:
            r15 = 8
            if (r0 != 0) goto L_0x03c8
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r0 = r2.A0B
            r0.setVisibility(r15)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r2.A0C
            r0.setVisibility(r15)
            com.instagram.common.ui.widget.imageview.CircularImageView r14 = r2.A06
            android.graphics.drawable.ColorDrawable r0 = r2.A01
            r14.setImageDrawable(r0)
        L_0x0250:
            android.widget.TextView r14 = r2.A05
            com.instagram.model.hashtag.Hashtag r0 = r12.A01
            java.lang.String r0 = r0.B7j()
            X.C18767W0m.A02(r14, r0)
            com.instagram.model.hashtag.Hashtag r15 = r12.A01
            java.lang.Boolean r0 = r15.Ab5()
            if (r0 == 0) goto L_0x03af
            java.lang.Boolean r0 = r15.Ab5()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x03af
            com.instagram.hashtag.ui.HashtagFollowButton r14 = r2.A0A
            r14.setVisibility(r6)
            java.lang.String r0 = r12.A03
            r14.A01 = r0
            r14.A01(r3, r1, r15)
            java.lang.Object r0 = r1.A01
            X.UlK r0 = (X.C15949UlK) r0
            X.2qT r15 = r0.A0K
            X.2bv r1 = r0.A0J
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.HASHTAG_FOLLOW_BUTTON
            r15.A00(r14, r0, r1)
        L_0x0286:
            android.view.View r0 = r2.A02
            android.content.Context r16 = r0.getContext()
            X.2eb r0 = r2.A08
            android.view.View r14 = r0.A01()
            X.0Tu r15 = X.0Tu.A05
            r0 = 36316791756034693(0x8105ee00001285, double:3.030223570274469E-306)
            boolean r0 = X.182.A06(r15, r4, r0)
            if (r0 == 0) goto L_0x02da
            r0 = 2131433777(0x7f0b1931, float:1.848935E38)
            android.widget.TextView r15 = X.DbU.A0G(r14, r0)
            r15.setVisibility(r6)
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "top_recent_posts"
            boolean r0 = r1.equals(r0)
            r1 = 2131963300(0x7f132da4, float:1.956335E38)
            if (r0 == 0) goto L_0x02b9
            r1 = 2131963294(0x7f132d9e, float:1.9563337E38)
        L_0x02b9:
            r0 = r16
            X.DbT.A18(r0, r15, r1)
            r0 = 2131432871(0x7f0b15a7, float:1.8487512E38)
            android.view.View r1 = r14.requireViewById(r0)
            r1.setVisibility(r6)
            r17 = 13
            X.WBF r0 = new X.WBF
            r18 = r4
            r19 = r2
            r20 = r16
            r16 = r0
            r16.<init>((int) r17, (java.lang.Object) r18, (java.lang.Object) r19, (java.lang.Object) r20, (java.lang.Object) r21)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x02da:
            X.2eb r1 = r13.A02
            r0 = r22
            r0.A01(r1)
            boolean r0 = r12.A05
            com.instagram.follow.chaining.FollowChainingButton r13 = r2.A09
            if (r0 == 0) goto L_0x03a9
            com.instagram.model.hashtag.Hashtag r0 = r12.A01
            X.0qQ.A0B(r0, r6)
            boolean r1 = X.C281965Ag.A03(r0)
            X.0qQ.A0B(r13, r6)
            X.6vv r0 = r11.A00
            r13.A01(r0, r1)
            r13.setVisibility(r6)
            r0 = 24
            X.WB9.A00(r13, r0, r11)
            r0 = r31
            android.content.Context r15 = r0.A00
            androidx.fragment.app.FragmentActivity r17 = r23.requireActivity()
            android.widget.FrameLayout r12 = r2.A04
            r1 = 0
            X.AnonymousClass7TG.A0w(r5, r4, r3, r12)
            r14 = 6
            r0 = r24
            X.0qQ.A0B(r0, r14)
            X.6vv r14 = r11.A00
            X.6vv r0 = X.C322496vv.Open
            if (r14 != r0) goto L_0x03a6
            X.ToV r11 = r11.A03
            java.util.List r0 = r11.A00
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x03a6
            int r0 = r12.getChildCount()
            if (r0 != 0) goto L_0x033d
            r18 = r15
            r19 = r13
            r20 = r12
            r21 = r6
            r22 = r6
            r23 = r6
            android.view.View r0 = X.C14033ToZ.A00(r18, r19, r20, r21, r22, r23)
            r12.addView(r0)
        L_0x033d:
            android.view.View r0 = r12.getChildAt(r6)
            java.lang.Object r0 = r0.getTag()
            r14 = 3665(0xe51, float:5.136E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r14)
            X.0qQ.A0C(r0, r14)
            X.Tqg r0 = (X.C14144Tqg) r0
            X.ToZ r14 = X.C14148Tqk.A00
            r18 = r3
            r19 = r10
            r20 = r4
            r21 = r24
            r22 = r11
            r23 = r0
            r24 = r10
            r25 = r10
            r26 = r10
            r27 = r10
            r28 = r6
            r29 = r6
            r16 = r10
            r14.A01(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x036f:
            r12.setVisibility(r1)
            r4 = 2131237308(0x7f0819bc, float:1.8090863E38)
            int r3 = X.2Yu.A07(r15)
            int r1 = X.2Yu.A07(r15)
            X.6rv r0 = new X.6rv
            r0.<init>(r4, r4, r3, r1)
            r13.setCustomButtonStyle(r0)
        L_0x0385:
            if (r9 == 0) goto L_0x039c
            X.2eb r2 = r2.A07
            android.view.View r1 = r2.A01()
            r0 = r30
            X.AnonymousClass0fU.A00(r0, r1)
            android.view.View r1 = r2.A01()
            r0 = 2131428604(0x7f0b04fc, float:1.8478857E38)
            X.DbX.A1E(r1, r9, r0)
        L_0x039c:
            r0 = r31
            X.Vh9 r3 = r0.A01
            int r1 = r7.AYI()
            goto L_0x007a
        L_0x03a6:
            r1 = 8
            goto L_0x036f
        L_0x03a9:
            r0 = 8
            r13.setVisibility(r0)
            goto L_0x0385
        L_0x03af:
            com.instagram.hashtag.ui.HashtagFollowButton r14 = r2.A0A
            r0 = 8
            r14.setVisibility(r0)
            java.lang.Object r0 = r1.A01
            X.UlK r0 = (X.C15949UlK) r0
            X.2qT r0 = r0.A0K
            com.instagram.quickpromotion.intf.QPTooltipAnchor r1 = com.instagram.quickpromotion.intf.QPTooltipAnchor.HASHTAG_FOLLOW_BUTTON
            X.0qQ.A0B(r1, r6)
            java.util.HashMap r0 = r0.A07
            r0.remove(r1)
            goto L_0x0286
        L_0x03c8:
            com.instagram.common.ui.widget.imageview.CircularImageView r14 = r2.A06
            com.instagram.model.hashtag.Hashtag r0 = r12.A01
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            boolean r0 = X.C253833rU.A02(r0)
            if (r0 != 0) goto L_0x03fc
            com.instagram.model.hashtag.Hashtag r0 = r12.A01
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
        L_0x03dc:
            r14.setUrl(r0, r3)
            com.instagram.model.hashtag.Hashtag r0 = r12.A01
            java.lang.String r0 = r0.getName()
            r14.setContentDescription(r0)
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r0 = r2.A0B
            r0.setVisibility(r15)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r2.A0C
            r0.setVisibility(r15)
            X.WBg r0 = new X.WBg
            r0.<init>(r6, r2, r12)
            r14.setOnLongClickListener(r0)
            goto L_0x0250
        L_0x03fc:
            com.instagram.common.typedurl.ImageUrl r0 = r12.A00
            if (r0 != 0) goto L_0x03dc
            r0 = 0
            goto L_0x03dc
        L_0x0402:
            com.instagram.common.typedurl.ImageUrl r0 = r12.A00
            if (r0 != 0) goto L_0x023b
            r0 = 0
            goto L_0x023b
        L_0x0409:
            X.Vt4 r0 = A01(r4)
            X.Csq r0 = r0.A02
            if (r0 == 0) goto L_0x041c
            android.content.Context r1 = r14.A01
            r0 = 2131962680(0x7f132b38, float:1.9562092E38)
            java.lang.String r9 = r1.getString(r0)
            goto L_0x01eb
        L_0x041c:
            r9 = r10
            goto L_0x01eb
        L_0x041f:
            r11 = 0
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15381Ube.configureActionBar(X.2da):void");
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C14074TpO tpO = this.A07;
        String str = "grid";
        if (tpO != null) {
            C18575VuR vuR = this.A0I;
            if (vuR == null) {
                str = "feedRequestController";
            } else {
                tpO.A05(view, C51973G9u.A1X(C18459Vs8.A00(vuR)));
                C14074TpO tpO2 = this.A07;
                if (tpO2 != null) {
                    DiscoveryRecyclerView discoveryRecyclerView = tpO2.A04;
                    if (discoveryRecyclerView != null) {
                        discoveryRecyclerView.setItemAnimator((AnonymousClass3AS) null);
                    }
                    C14074TpO tpO3 = this.A07;
                    if (tpO3 != null) {
                        tpO3.A06(this.A0z);
                        C15949UlK ulK = this.A0F;
                        if (ulK == null) {
                            str = "actionBarController";
                        } else {
                            ulK.A01.A06(ulK.A02, ulK.A05.getScrollingViewProxy(), ulK.A04.A00);
                            C18755Vzq vzq = this.A0E;
                            if (vzq == null) {
                                str = "useHashtagController";
                            } else {
                                FragmentActivity requireActivity = requireActivity();
                                C16672Uz8 uz8 = this.A0R;
                                if (uz8 == null) {
                                    str = "initialTab";
                                } else {
                                    ViewGroup A0C2 = DbU.A0C(view, R.id.use_in_camera_button_scene_root);
                                    vzq.A02 = A0C2;
                                    if (A0C2 != null) {
                                        2eS.A01(A0C2);
                                        if (182.A06(0Tu.A05, vzq.A04, 36326352353244903L)) {
                                            ViewGroup viewGroup = vzq.A02;
                                            if (viewGroup != null) {
                                                vzq.A01 = Scene.getSceneForLayout(viewGroup, R.layout.layout_use_in_camera_button_prism_with_text, requireActivity);
                                                ViewGroup viewGroup2 = vzq.A02;
                                                if (viewGroup2 != null) {
                                                    vzq.A00 = Scene.getSceneForLayout(viewGroup2, R.layout.layout_use_in_camera_button_prism_no_text, requireActivity);
                                                    DbU.A0C(view, R.id.refreshable_container).setClipChildren(false);
                                                    C18755Vzq.A00(vzq, AnonymousClass7TG.A1a(vzq, vzq.A06, C18755Vzq.A07, 0));
                                                }
                                            }
                                        } else {
                                            AnonymousClass7TG.A0R(view, R.id.use_in_camera_label).setText(2131976211);
                                            View A0G2 = AnonymousClass7TF.A0G(view, R.id.use_in_camera_button);
                                            ViewGroup viewGroup3 = vzq.A02;
                                            if (viewGroup3 != null) {
                                                vzq.A01 = new Scene(viewGroup3, A0G2);
                                                ViewGroup viewGroup4 = vzq.A02;
                                                if (viewGroup4 != null) {
                                                    vzq.A00 = Scene.getSceneForLayout(viewGroup4, R.layout.layout_use_in_camera_button_scrolling, requireActivity);
                                                }
                                            }
                                        }
                                        ViewGroup viewGroup5 = vzq.A02;
                                        if (viewGroup5 != null) {
                                            AnonymousClass0fU.A00(new ID0(21, (Object) requireActivity, (Object) this, (Object) vzq), viewGroup5);
                                            vzq.A01(uz8);
                                            C14227TsA tsA = this.A06;
                                            if (tsA == null) {
                                                str = "adapter";
                                            } else {
                                                C14227TsA.A00(tsA);
                                                1xC.A01.A02(this.A15, 1xG.class);
                                                1Ng r2 = this.A0Q;
                                                if (r2 == null) {
                                                    r2 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A0i));
                                                    this.A0Q = r2;
                                                    if (r2 == null) {
                                                        return;
                                                    }
                                                }
                                                r2.A01(this.A0m, C2370436c.class);
                                                r2.A01(this.A0o, C2370836g.class);
                                                r2.A01(this.A0n, C57066INg.class);
                                                return;
                                            }
                                        }
                                    }
                                    0qQ.A0F("useHashatagViewGroup");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final UserSession A00(C15381Ube ube) {
        return AnonymousClass7TE.A0l(ube.A0i);
    }

    public static final C18507Vt4 A01(C15381Ube ube) {
        return (C18507Vt4) ube.A17.getValue();
    }

    public static final void A04(C15381Ube ube) {
        C18806W2y w2y = ube.A0c;
        HAI hai = ube.A08;
        if (hai == null) {
            0qQ.A0F("dataSource");
            throw AnonymousClass00P.createAndThrow();
        }
        String obj = hai.A00.toString();
        0qQ.A0B(obj, 0);
        C18806W2y.A03(w2y, obj, 20643843);
        A08(ube, ube.A0O, 20643843, false, false);
    }

    public static final void A06(C15381Ube ube, int i) {
        VW0 vw0 = ube.A0T;
        if (vw0 == null) {
            0qQ.A0F("headerRequestController");
            throw AnonymousClass00P.createAndThrow();
        }
        vw0.A01.A04(new C15615Ufh(ube, i), vw0.A00, vw0.A02);
    }

    public static final void A07(C15381Ube ube, String str) {
        if (str != null) {
            FragmentActivity requireActivity = ube.requireActivity();
            String str2 = ube.A0f;
            AnonymousClass0eM r4 = ube.A0i;
            if (!FGU.A03(requireActivity, AnonymousClass7TE.A0l(r4), str, str2)) {
                Uri A092 = DbT.A09(str);
                14D A002 = 14D.A04.A00();
                if (A002 == null || A002.A00(AnonymousClass7TE.A0l(r4), str) == null) {
                    FHB.A04(requireActivity, AnonymousClass7TE.A0l(r4), 2EG.A1w, str, str2);
                    return;
                }
                Intent A042 = AnonymousClass14B.A03.A00().A04(requireActivity, A092);
                A042.putExtra(C66579MXk.A00(3), true);
                0kR.A0B(requireActivity, A042);
            }
        }
    }

    public final C227762js BD0() {
        C227762js r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("scrollableNavigationHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    public final 0jB E4k() {
        0jB r4 = new 0jB();
        C18766W0k.A03(r4, A01(this).A01);
        HAI hai = this.A08;
        if (hai == null) {
            0qQ.A0F("dataSource");
            throw AnonymousClass00P.createAndThrow();
        }
        C16672Uz8 uz8 = hai.A00;
        int A002 = hai.A01.A00(uz8);
        r4.A04(C298085sr.A00, uz8.toString());
        r4.A04(AnonymousClass5m1.A01, Long.valueOf((long) A002));
        C324636ze.A00(AnonymousClass7TE.A0l(this.A0i)).A00(r4);
        return r4;
    }

    public final void EKl() {
        C14074TpO tpO = this.A07;
        if (tpO == null) {
            C13988Tno.A0n();
            throw AnonymousClass00P.createAndThrow();
        } else {
            tpO.A03();
        }
    }

    public final String getModuleName() {
        return this.A0f;
    }

    public final C238133Ar getScrollingViewProxy() {
        C14074TpO tpO = this.A07;
        if (tpO == null) {
            C13988Tno.A0n();
            throw AnonymousClass00P.createAndThrow();
        }
        C238133Ar r0 = tpO.A06;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A18);
    }

    public final String getSessionId() {
        return this.A0g;
    }

    public final boolean onBackPressed() {
        AnonymousClass2uE r0 = this.A0C;
        if (r0 == null) {
            0qQ.A0F("peekMediaController");
            throw AnonymousClass00P.createAndThrow();
        } else if (r0.onBackPressed()) {
            return true;
        } else {
            List list = this.A15.A00;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    return false;
                }
                ((X3B) list.get(size)).DDP((String) null, true);
            }
        }
    }

    public C15381Ube() {
        0eO r5 = 0eO.A02;
        String A002 = C66579MXk.A00(30);
        this.A0h = AnonymousClass0eN.A00(r5, new C51804G2n((Object) this, A002, A002, 31));
        this.A17 = AnonymousClass1YB.A00(new MMJ(this, 18));
        this.A0g = AnonymousClass7TG.A0j();
        this.A0d = new VO7(this);
        this.A11 = new C17775Vfm(this);
        this.A0u = new WW0(this);
        this.A0l = new WP1(this);
        this.A0x = new C19360WWb(this, 2);
        this.A0p = new C19249WRi(this, 1);
        this.A0y = new C19387WXe(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0191  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C16672Uz8 r9, X.C17694VcP r10, X.C15381Ube r11, boolean r12, boolean r13) {
        /*
            X.Vt4 r0 = A01(r11)
            com.instagram.model.hashtag.Hashtag r0 = r0.A01
            X.0xF r1 = X.C18766W0k.A00(r0)
            X.VZZ r0 = r11.A0D
            if (r0 != 0) goto L_0x0018
            java.lang.String r8 = "gridAnalyticsDelegate"
        L_0x0010:
            X.0qQ.A0F(r8)
        L_0x0013:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0018:
            r0.A00 = r1
            r4 = r9
            if (r13 == 0) goto L_0x0030
            if (r12 == 0) goto L_0x0024
            X.Uz8 r4 = r10.A01
            X.0qQ.A0A(r4)
        L_0x0024:
            X.HAI r1 = r11.A08
            if (r1 != 0) goto L_0x002b
            java.lang.String r8 = "dataSource"
            goto L_0x0010
        L_0x002b:
            java.util.List r0 = r10.A08
            r1.A08(r0)
        L_0x0030:
            if (r9 == r4) goto L_0x0077
            r5 = 0
            X.HAI r0 = r11.A08
            java.lang.String r7 = "dataSource"
            if (r0 == 0) goto L_0x01c1
            r0.A05(r9)
            X.VuR r1 = r11.A0I
            java.lang.String r8 = "feedRequestController"
            if (r1 == 0) goto L_0x0010
            X.Vs8 r0 = X.C18575VuR.A00(r9, r1)
            java.util.Map r6 = r1.A06
            X.6z9 r3 = r0.A02
            java.util.List r2 = r0.A01
            java.lang.String r1 = r0.A00
            X.Vs8 r0 = new X.Vs8
            r0.<init>(r3, r1, r2)
            r6.put(r4, r0)
            X.VuR r3 = r11.A0I
            if (r3 == 0) goto L_0x0010
            java.util.Map r0 = r3.A06
            boolean r2 = r0.containsKey(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Invalid requestType: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r4, r0, r1)
            X.17k.A0H(r2, r0)
            r3.A00 = r4
            X.HAI r0 = r11.A08
            if (r0 == 0) goto L_0x01c1
            r0.A07(r4, r5)
        L_0x0077:
            X.UmI r1 = r11.A0G
            java.lang.String r8 = "followChainingDelegate"
            if (r1 == 0) goto L_0x0010
            X.Vt4 r0 = A01(r11)
            com.instagram.model.hashtag.Hashtag r0 = r0.A01
            r1.A00 = r0
            X.UmI r1 = r11.A0G
            if (r1 == 0) goto L_0x0010
            X.0jB r0 = r11.E4k()
            X.0xF r0 = r0.A00()
            X.6s1 r1 = r1.A00
            java.util.HashMap r0 = X.0j8.A03(r0)
            r1.A00 = r0
            java.lang.String r7 = "dataSource"
            if (r12 == 0) goto L_0x00b3
            X.HAI r0 = r11.A08
            if (r0 == 0) goto L_0x01c1
            r0.A05(r4)
            android.view.View r0 = r11.mView
            if (r0 == 0) goto L_0x00b3
            X.TpO r0 = r11.A07
            if (r0 != 0) goto L_0x00b0
            java.lang.String r8 = "grid"
            goto L_0x0010
        L_0x00b0:
            r0.A02()
        L_0x00b3:
            X.N3M r2 = r10.A03
            if (r12 == 0) goto L_0x00ca
            if (r2 == 0) goto L_0x00ca
            X.Uz8 r0 = X.C16672Uz8.TOP
            X.Vt4 r1 = A01(r11)
            if (r4 == r0) goto L_0x0127
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.util.Map r0 = r1.A07
            r0.put(r4, r2)
        L_0x00ca:
            X.Vt4 r0 = A01(r11)
            X.N3M r3 = r0.A00
            X.Vt4 r1 = A01(r11)
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.util.Map r0 = r1.A07
            java.lang.Object r2 = r0.get(r4)
            X.N3M r2 = (X.N3M) r2
            if (r3 != 0) goto L_0x0130
            if (r2 == 0) goto L_0x0130
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.WSq r0 = new X.WSq
            r0.<init>(r2)
            r1.add(r0)
            X.HAI r6 = r11.A08
            if (r6 == 0) goto L_0x01c1
            java.util.Map r5 = r6.A06
            java.util.List r3 = X.C66580MXl.A13(r4, r5)
            if (r3 != 0) goto L_0x0102
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0102:
            r3.clear()
            java.util.Iterator r2 = r1.iterator()
        L_0x0109:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x012a
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C232262tL
            if (r0 == 0) goto L_0x011b
            r3.add(r1)
            goto L_0x0109
        L_0x011b:
            boolean r0 = r1 instanceof X.C297005r0
            if (r0 == 0) goto L_0x0109
            X.5r0 r1 = (X.C297005r0) r1
            java.util.List r0 = r1.A02
            r3.addAll(r0)
            goto L_0x0109
        L_0x0127:
            r1.A00 = r2
            goto L_0x00ca
        L_0x012a:
            r5.put(r4, r3)
            r6.A04()
        L_0x0130:
            X.VZR r6 = r10.A04
            boolean r0 = r10.A0A
            if (r0 != 0) goto L_0x0187
            X.HAI r0 = r11.A08
            if (r0 == 0) goto L_0x01c1
            boolean r0 = X.C13991Tnr.A1Z(r4, r0)
            if (r0 == 0) goto L_0x0187
            java.util.List r0 = r10.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0187
            if (r6 == 0) goto L_0x0187
            X.HAI r5 = r11.A08
            if (r5 == 0) goto L_0x01c1
            android.content.Context r3 = r11.requireContext()
            X.72b r2 = new X.72b
            r2.<init>()
            java.lang.String r0 = r6.A04
            r2.A0D = r0
            java.lang.String r0 = r6.A03
            if (r0 == 0) goto L_0x01bd
            r2.A07 = r0
            java.lang.String r1 = r6.A02
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x017a
            r2.A0C = r1
            java.lang.String r1 = r6.A01
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x017a
            X.Wdx r0 = new X.Wdx
            r0.<init>(r3, r1)
            r2.A06 = r0
        L_0x017a:
            java.util.Map r0 = r5.A05
            r0.put(r4, r2)
        L_0x017f:
            X.TsA r0 = r11.A06
            if (r0 != 0) goto L_0x0191
            java.lang.String r8 = "adapter"
            goto L_0x0010
        L_0x0187:
            X.HAI r1 = r11.A08
            if (r1 == 0) goto L_0x01c1
            java.util.List r0 = r10.A07
            r1.A06(r4, r0)
            goto L_0x017f
        L_0x0191:
            X.C14227TsA.A00(r0)
            X.36D r0 = r11.A0B
            if (r0 != 0) goto L_0x019c
            java.lang.String r8 = "mediaUpdateListener"
            goto L_0x0010
        L_0x019c:
            r0.A00()
            X.Vt4 r0 = A01(r11)
            com.instagram.common.typedurl.ImageUrl r3 = r10.A00
            java.lang.String r2 = r10.A06
            X.V3z r1 = r0.A06
            com.instagram.common.typedurl.ImageUrl r0 = r1.A00
            if (r0 != 0) goto L_0x01b1
            r1.A00 = r3
            r1.A02 = r2
        L_0x01b1:
            java.util.List r5 = r10.A09
            if (r5 == 0) goto L_0x01f7
            X.Vud r6 = r11.A09
            if (r6 != 0) goto L_0x01c6
            java.lang.String r8 = "relatedItemController"
            goto L_0x0010
        L_0x01bd:
            java.lang.String r8 = "text"
            goto L_0x0010
        L_0x01c1:
            X.0qQ.A0F(r7)
            goto L_0x0013
        L_0x01c6:
            X.5tt r7 = r10.A05
            X.5tt r0 = r6.A02
            if (r0 == r7) goto L_0x01e6
            X.5tt r0 = X.C298705tt.WITH_IMAGE_AND_CONTEXT
            if (r7 != r0) goto L_0x0204
            X.Vgi r3 = r6.A0A
            X.0iw r2 = r6.A07
            com.instagram.common.session.UserSession r1 = r6.A09
            X.0xF r0 = r6.A08
            X.UlM r4 = new X.UlM
            r4.<init>(r2, r0, r1, r3)
        L_0x01dd:
            r6.A01 = r4
            androidx.recyclerview.widget.RecyclerView r0 = r6.A00
            if (r0 == 0) goto L_0x01e6
            X.C18586Vud.A00(r6)
        L_0x01e6:
            r6.A02 = r7
            r6.A03 = r5
            X.U9j r1 = r6.A01
            r5.clear()
            java.util.List r0 = r1.A04
            r0.addAll(r5)
            r1.notifyDataSetChanged()
        L_0x01f7:
            android.view.View r1 = r11.mView
            if (r1 == 0) goto L_0x0203
            X.Wjt r0 = new X.Wjt
            r0.<init>(r11)
            r1.post(r0)
        L_0x0203:
            return
        L_0x0204:
            X.Vgi r3 = r6.A0A
            X.0iw r2 = r6.A07
            com.instagram.common.session.UserSession r1 = r6.A09
            X.0xF r0 = r6.A08
            X.C51972G9s.A1B(r3, r0)
            X.UlL r4 = new X.UlL
            r4.<init>(r2, r0, r1, r3)
            goto L_0x01dd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15381Ube.A02(X.Uz8, X.VcP, X.Ube, boolean, boolean):void");
    }

    public static final void A03(C15381Ube ube) {
        if (ube.isResumed()) {
            Dbb.A0u(ube);
        }
    }

    public static final void A05(C15381Ube ube) {
        if (A01(ube).A02 != null) {
            C45235Csq csq = A01(ube).A02;
            if (csq != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("timezone_offset", String.valueOf(1G0.A00()));
                C46649DiU A042 = C46649DiU.A04(csq.A00, hashMap);
                AnonymousClass0eM r3 = ube.A0i;
                IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) AnonymousClass7TE.A0l(r3));
                igBloksScreenConfig.A0U = DbV.A05(ube).getString(2131962682);
                igBloksScreenConfig.A0l = true;
                AnonymousClass3M3 A022 = C49891FBs.A02(igBloksScreenConfig, A042);
                C309516Yo A0Q2 = DbU.A0Q(ube.requireActivity(), AnonymousClass7TE.A0l(r3));
                A0Q2.A0D(A022);
                A0Q2.A07 = ube.A0k;
                A0Q2.A04();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final Hashtag BCW() {
        return A01(this).A01;
    }

    public final 0jB E4l(1Xj r2) {
        return E4k();
    }

    public final 0jB E4x() {
        Hashtag hashtag = A01(this).A01;
        0jB r3 = new 0jB();
        String id = hashtag.getId();
        String name = hashtag.getName();
        if (!(id == null || id.length() == 0)) {
            r3.A0A("hashtag_id", id);
        }
        if (!(name == null || name.length() == 0)) {
            r3.A0A("hashtag_name", name);
        }
        C324636ze.A00(AnonymousClass7TE.A0l(this.A0i)).A00(r3);
        return r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v2, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v3, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v5, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v6, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v7, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v4, resolved type: X.2uF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v0, resolved type: X.4DV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v1, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: X.0iw} */
    /* JADX WARNING: type inference failed for: r33v2, types: [X.2s5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v20, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0039, code lost:
        if (r4 == null) goto L_0x003b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r57) {
        /*
            r56 = this;
            r0 = -890967256(0xffffffffcae4eb28, float:-7501204.0)
            int r22 = X.AnonymousClass0fD.A02(r0)
            r0 = r56
            r1 = r57
            X.C15381Ube.super.onCreate(r1)
            android.os.Bundle r3 = r0.requireArguments()
            java.lang.String r1 = "HashtagFeedFragment.ARGUMENT_PRELOAD_MEDIAS"
            java.lang.String r1 = r3.getString(r1)
            r0.A0W = r1
            r1 = 447(0x1bf, float:6.26E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r29 = r3.getString(r1)
            java.lang.String r2 = "Required value was null."
            if (r29 == 0) goto L_0x065d
            java.lang.String r1 = "HashtagFeedFragment.ARGUMENT_INITIAL_TAB"
            java.lang.String r5 = r3.getString(r1)
            r1 = 0
            if (r5 == 0) goto L_0x0088
            java.util.Map r4 = X.C16672Uz8.A01
            java.lang.Object r4 = r4.get(r5)
            X.Uz8 r4 = (X.C16672Uz8) r4
            if (r4 != 0) goto L_0x003d
        L_0x003b:
            X.Uz8 r4 = X.C16672Uz8.UNSPECIFIED
        L_0x003d:
            r0.A0R = r4
        L_0x003f:
            X.0eM r4 = r0.A0h
            java.lang.Object r27 = r4.getValue()
            r4 = r27
            com.instagram.model.hashtag.Hashtag r4 = (com.instagram.model.hashtag.Hashtag) r4
            r27 = r4
            java.lang.String r4 = "HashtagFeedFragment.ARGUMENT_MEDIA_TAP_ACTION_SOURCE"
            java.io.Serializable r4 = r3.getSerializable(r4)
            X.HOu r4 = (X.C54689HOu) r4
            r0.A00 = r4
            java.lang.String r4 = "HashtagFeedFragment.ARGUMENT_PIVOT_PAGE_ENTRY_POINT"
            java.io.Serializable r6 = r3.getSerializable(r4)
            X.8ZN r6 = (X.AnonymousClass8ZN) r6
            X.1L1 r4 = X.1L2.A00()
            java.lang.String r5 = r4.A00
            X.6sU r4 = new X.6sU
            r4.<init>(r6, r5)
            r0.A03 = r4
            X.W2y r6 = r0.A0c
            X.Uz8 r4 = r0.A0R
            java.lang.String r25 = "initialTab"
            if (r4 == 0) goto L_0x014d
            java.lang.String r5 = r4.toString()
            X.0qQ.A0B(r5, r1)
            r26 = 20643841(0x13b0001, float:3.4346478E-38)
            r4 = r26
            X.C18806W2y.A03(r6, r5, r4)
            java.util.Map r5 = r6.A00
            monitor-enter(r5)
            r24 = 20643846(0x13b0006, float:3.4346492E-38)
            goto L_0x00b6
        L_0x0088:
            r4 = 4601(0x11f9, float:6.447E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r4)
            r4 = r29
            boolean r4 = X.00l.A0d(r4, r5, r1)
            if (r4 == 0) goto L_0x003b
            X.0eM r4 = r0.A0i
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r4)
            X.0Tu r6 = X.0Tu.A05
            r4 = 2342159800969859719(0x208105ee00021287, double:4.062865561613639E-152)
            boolean r4 = X.182.A06(r6, r7, r4)
            if (r4 == 0) goto L_0x003b
            X.Uz8 r4 = X.C16672Uz8.CLIPS
            r0.A0R = r4
            java.lang.String r4 = "HashtagFeedFragment.ARGUMENT_INCLUDE_CHALLENGES"
            boolean r4 = r3.getBoolean(r4)
            r0.A0X = r4
            goto L_0x003f
        L_0x00b6:
            r4 = r24
            X.C18806W2y.A00(r6, r4)     // Catch:{ all -> 0x00bc }
            goto L_0x00bf
        L_0x00bc:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x00bf:
            monitor-exit(r5)
            X.0eM r4 = r0.A0i
            r55 = r4
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r55)
            X.0qQ.A0B(r7, r1)
            r5 = 31784980(0x1e50014, float:8.4121427E-38)
            java.lang.String r4 = "hashtag_page"
            X.6uZ r6 = new X.6uZ
            r6.<init>(r7, r4, r5)
            r0.A02 = r6
            java.lang.String r28 = "gridPerfLogger"
            android.content.Context r5 = r0.requireContext()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r55)
            X.2cc r4 = X.C71342cb.A00(r4)
            r6.A0O(r5, r4, r0, r0)
            X.6uZ r5 = r0.A02
            if (r5 == 0) goto L_0x0646
            java.lang.String r4 = r27.getId()
            r5.A0U(r4)
            java.lang.String r4 = "HashtagFeedFragment.ARGUMENT_ENTRY_TRIGGER"
            java.lang.String r4 = r3.getString(r4)
            if (r4 == 0) goto L_0x0654
            r0.A0V = r4
            r4 = 2293(0x8f5, float:3.213E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            java.lang.String r51 = r3.getString(r4)
            r4 = 2292(0x8f4, float:3.212E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            java.lang.String r52 = r3.getString(r4)
            android.content.Context r8 = r0.requireContext()
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r55)
            java.lang.String r11 = r0.A0g
            r23 = 1
            r12 = -1
            r10 = r0
            r14 = r1
            r15 = r23
            X.X9Q r4 = X.C16942VBu.A00(r8, r9, r10, r11, r12, r14, r15)
            r0.A0A = r4
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r55)
            X.0wc r4 = X.AnonymousClass0kN.A01(r0, r4)
            r0.A04 = r4
            java.lang.String r5 = r27.getName()
            java.lang.String r15 = ""
            if (r5 != 0) goto L_0x013c
            r5 = r15
        L_0x013c:
            r4 = 35
            java.lang.String r4 = X.002.A0D(r5, r4)
            r0.A0N = r4
            A00(r0)
            java.lang.String r4 = r0.A0N
            if (r4 != 0) goto L_0x0155
            java.lang.String r25 = "_actionBarTitle"
        L_0x014d:
            X.0qQ.A0F(r25)
        L_0x0150:
            X.00P r3 = X.AnonymousClass00P.createAndThrow()
            throw r3
        L_0x0155:
            com.instagram.common.session.UserSession r33 = X.AnonymousClass7TE.A0l(r55)
            X.G7y r5 = r0.A0y
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r55)
            X.ExC r36 = X.ORV.A00(r4, r1)
            X.0qQ.A07(r36)
            X.F0q r4 = new X.F0q
            r30 = r4
            r31 = r0
            r32 = r0
            r34 = r5
            r35 = r27
            r37 = r11
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)
            r0.A0H = r4
            android.content.Context r31 = r0.requireContext()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r55)
            X.0qQ.A0B(r7, r1)
            java.lang.Class<X.VQP> r5 = X.VQP.class
            r4 = 32
            X.Plp r6 = new X.Plp
            r6.<init>(r7, r4)
            java.lang.Object r6 = r7.A01(r5, r6)
            X.VQP r6 = (X.VQP) r6
            java.util.List r6 = r6.A00
            java.util.Iterator r12 = r6.iterator()
        L_0x019e:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x01be
            java.lang.Object r10 = r12.next()
            androidx.fragment.app.FragmentActivity r7 = r0.requireActivity()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r55)
            X.6z9 r9 = X.C51970G9q.A0g(r7, r0, r6)
            r7 = 0
            X.Vs8 r6 = new X.Vs8
            r6.<init>(r9, r7, r7)
            r8.put(r10, r6)
            goto L_0x019e
        L_0x01be:
            X.Vt4 r6 = A01(r0)
            com.instagram.model.hashtag.Hashtag r6 = r6.A01
            java.lang.String r34 = r6.getName()
            if (r34 == 0) goto L_0x0666
            com.instagram.common.session.UserSession r32 = X.AnonymousClass7TE.A0l(r55)
            X.Uz8 r7 = r0.A0R
            if (r7 == 0) goto L_0x014d
            r12 = 0
            X.VuR r6 = new X.VuR
            r30 = r6
            r33 = r7
            r35 = r12
            r36 = r8
            r30.<init>(r31, r32, r33, r34, r35, r36)
            r0.A0I = r6
            androidx.fragment.app.FragmentActivity r17 = r0.requireActivity()
            X.Vt4 r6 = A01(r0)
            com.instagram.model.hashtag.Hashtag r6 = r6.A01
            java.lang.String r21 = r6.getName()
            if (r21 == 0) goto L_0x064b
            X.0gy r18 = X.AnonymousClass07i.A00(r0)
            com.instagram.common.session.UserSession r20 = X.AnonymousClass7TE.A0l(r55)
            X.VW0 r2 = new X.VW0
            r16 = r2
            r19 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            r0.A0T = r2
            X.Vt4 r2 = A01(r0)
            com.instagram.model.hashtag.Hashtag r2 = r2.A01
            X.0xF r18 = X.C18766W0k.A00(r2)
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r55)
            X.WWF r2 = new X.WWF
            r2.<init>(r0, r1)
            X.Hzv r53 = new X.Hzv
            r6 = r53
            r7 = r0
            r9 = r2
            r10 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            com.instagram.common.session.UserSession r19 = X.AnonymousClass7TE.A0l(r55)
            X.X6c r6 = r0.A0q
            X.VZZ r2 = new X.VZZ
            r16 = r2
            r17 = r0
            r20 = r6
            r21 = r11
            r16.<init>(r17, r18, r19, r20, r21)
            r0.A0D = r2
            X.TpP r21 = new X.TpP
            r21.<init>()
            X.2el r20 = X.C51969G9p.A0k()
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r55)
            X.Uz8 r8 = r0.A0R
            if (r8 == 0) goto L_0x014d
            X.Wec r13 = r0.A0z
            android.content.res.Resources r6 = X.DbV.A05(r0)
            X.72b r7 = new X.72b
            r7.<init>()
            r2 = 2131231739(0x7f0803fb, float:1.8079568E38)
            r7.A02 = r2
            r2 = 2131968412(0x7f13419c, float:1.9573718E38)
            java.lang.String r2 = r6.getString(r2)
            r7.A0D = r2
            X.JO7 r6 = r0.A0u
            X.0qQ.A0B(r9, r1)
            X.Plp r2 = new X.Plp
            r2.<init>(r9, r4)
            java.lang.Object r2 = r9.A01(r5, r2)
            X.VQP r2 = (X.VQP) r2
            java.util.List r2 = r2.A00
            r4 = r9
            r5 = r8
            r8 = r13
            r9 = r2
            X.HAI r2 = X.HAI.A01(r4, r5, r6, r7, r8, r9)
            r0.A08 = r2
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r55)
            X.X9Q r9 = r0.A0A
            java.lang.String r28 = "videoPlayerManager"
            if (r9 == 0) goto L_0x0646
            X.WW4 r8 = r0.A0b
            X.X41 r7 = r0.A0v
            X.HAI r6 = r0.A08
            java.lang.String r25 = "dataSource"
            if (r6 == 0) goto L_0x014d
            r2 = 2
            X.0qQ.A0B(r10, r2)
            X.AnonymousClass7TG.A1S(r8, r7)
            r2 = 9
            android.content.Context r30 = X.DbT.A06(r0, r11, r2)
            X.2s4 r33 = new X.2s4
            r33.<init>()
            int r2 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r55)
            r2 = 23592976(0x1680010, float:4.2611715E-38)
            X.2nK r14 = new X.2nK
            r14.<init>(r5, r0, r4, r2)
            r31 = r0
            r32 = r10
            r34 = r21
            r35 = r8
            r36 = r6
            r37 = r7
            r38 = r9
            r39 = r0
            r40 = r12
            r41 = r11
            r42 = r1
            r43 = r1
            X.2tC r9 = X.C14370Tuz.A00(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            android.content.Context r31 = r0.requireContext()
            X.HAI r8 = r0.A08
            if (r8 == 0) goto L_0x014d
            com.instagram.common.session.UserSession r34 = X.AnonymousClass7TE.A0l(r55)
            androidx.fragment.app.FragmentActivity r10 = r0.requireActivity()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r55)
            X.VOB r5 = r0.A14
            X.VOA r4 = r0.A13
            X.UiW r2 = new X.UiW
            r2.<init>(r10, r6, r4, r5)
            r9.A01(r2)
            X.X3p r4 = r0.A0r
            X.Uhz r2 = new X.Uhz
            r2.<init>(r4)
            r9.A01(r2)
            X.Mmq r2 = new X.Mmq
            r2.<init>()
            r9.A01(r2)
            X.VO9 r5 = r0.A12
            X.X47 r4 = r0.A0w
            X.UiF r2 = new X.UiF
            r2.<init>(r4, r5)
            r9.A01(r2)
            com.instagram.common.session.UserSession r38 = X.AnonymousClass7TE.A0l(r55)
            X.HAI r5 = r0.A08
            if (r5 == 0) goto L_0x014d
            X.6sC r4 = r0.A0l
            X.NOe r2 = new X.NOe
            r35 = r2
            r36 = r4
            r37 = r0
            r39 = r5
            r40 = r7
            r35.<init>(r36, r37, r38, r39, r40)
            r9.A01(r2)
            X.TsA r2 = new X.TsA
            r30 = r2
            r32 = r0
            r33 = r9
            r35 = r8
            r36 = r12
            r37 = r12
            r38 = r12
            r39 = r12
            r40 = r13
            r41 = r23
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r0.A06 = r2
            X.Tvf r4 = X.C14411Tvf.ONE_BY_ONE
            X.TvF r2 = new X.TvF
            r2.<init>(r4)
            X.Uiv[] r5 = new X.C15812Uiv[]{r2}
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r55)
            X.TvE r4 = new X.TvE
            r4.<init>(r2)
            X.X3y r2 = r0.A0t
            r4.A01(r2)
            X.TsA r2 = r0.A06
            if (r2 != 0) goto L_0x0367
            java.lang.String r25 = "adapter"
            goto L_0x014d
        L_0x0367:
            r4.A06 = r2
            X.HAI r2 = r0.A08
            if (r2 == 0) goto L_0x014d
            r4.A08 = r2
            X.X9Q r2 = r0.A0A
            if (r2 == 0) goto L_0x0646
            r4.A0A = r2
            r4.A04 = r0
            X.32Q r2 = r0.A0e
            r4.A02(r2)
            r2 = r20
            r4.A00(r2)
            r4.A0P = r5
            X.TpO r2 = new X.TpO
            r2.<init>(r4)
            r0.A07 = r2
            androidx.fragment.app.FragmentActivity r31 = r0.requireActivity()
            X.0hq r33 = r0.getParentFragmentManager()
            com.instagram.common.session.UserSession r34 = X.AnonymousClass7TE.A0l(r55)
            X.TpO r2 = r0.A07
            java.lang.String r19 = "grid"
            if (r2 == 0) goto L_0x0641
            X.TsA r2 = r2.A0E
            X.2uE r4 = new X.2uE
            r30 = r4
            r35 = r12
            r36 = r0
            r37 = r2
            r39 = r1
            r40 = r23
            r41 = r1
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r0.A0C = r4
            X.5eN r2 = r0.A0x
            r4.EU9(r2)
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.2js r2 = X.C227752jr.A00(r2, r12, r1)
            r0.A01 = r2
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r55)
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.Vgi r5 = new X.Vgi
            r5.<init>(r2, r0, r4)
            androidx.fragment.app.FragmentActivity r31 = r0.requireActivity()
            com.instagram.common.session.UserSession r34 = X.AnonymousClass7TE.A0l(r55)
            X.0jB r2 = r0.E4k()
            X.0xF r33 = r2.A00()
            X.Vt4 r2 = A01(r0)
            com.instagram.model.hashtag.Hashtag r4 = r2.A01
            X.HAI r7 = r0.A08
            if (r7 == 0) goto L_0x014d
            X.Uz8 r2 = r7.A00
            java.lang.String r37 = r2.toString()
            X.Uz8 r6 = r7.A00
            X.VgA r2 = r7.A01
            int r38 = r2.A00(r6)
            X.Vud r2 = new X.Vud
            r30 = r2
            r35 = r5
            r36 = r4
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38)
            r0.A09 = r2
            X.1YN r7 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r55)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            com.instagram.quickpromotion.intf.QPTooltipAnchor r4 = com.instagram.quickpromotion.intf.QPTooltipAnchor.HASHTAG_FOLLOW_BUTTON
            X.WZb r2 = new X.WZb
            r2.<init>()
            r5.put(r4, r2)
            com.instagram.quickpromotion.intf.QPTooltipAnchor r4 = com.instagram.quickpromotion.intf.QPTooltipAnchor.DESTINATIONS_SUPPORT_BUTTON
            X.WZa r2 = new X.WZa
            r2.<init>()
            r5.put(r4, r2)
            X.2qT r2 = r7.A04(r6, r5)
            r0.A0M = r2
            X.1YN r5 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r55)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r10 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0U
            X.AnonymousClass2bO.A00()
            X.WZY r4 = new X.WZY
            r4.<init>(r0, r1)
            X.2qT r2 = r0.A0M
            java.lang.String r18 = "quickPromotionTooltipsController"
            if (r2 == 0) goto L_0x063c
            X.2bW r9 = X.2bV.A06(r4, r2)
            r6 = r0
            r7 = r0
            X.2qi r2 = r5.A01(r6, r7, r8, r9, r10)
            r0.A0L = r2
            android.content.Context r5 = r0.requireContext()
            X.0gy r4 = X.AnonymousClass07i.A00(r0)
            X.VOC r2 = new X.VOC
            r2.<init>(r0)
            X.VjY r13 = new X.VjY
            r13.<init>(r5, r4, r2)
            android.content.Context r31 = r0.requireContext()
            X.0gy r33 = X.AnonymousClass07i.A00(r0)
            com.instagram.common.session.UserSession r36 = X.AnonymousClass7TE.A0l(r55)
            X.Vt4 r2 = A01(r0)
            com.instagram.model.hashtag.Hashtag r2 = r2.A01
            java.lang.String r39 = r2.getId()
            if (r39 != 0) goto L_0x047b
            r39 = r15
        L_0x047b:
            X.0jB r2 = r0.E4k()
            X.0xF r35 = r2.A00()
            androidx.fragment.app.FragmentActivity r32 = r0.requireActivity()
            X.Vt4 r2 = A01(r0)
            com.instagram.model.hashtag.Hashtag r4 = r2.A01
            X.UmI r2 = new X.UmI
            r30 = r2
            r34 = r0
            r37 = r13
            r38 = r4
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r0.A0G = r2
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r55)
            X.Vt4 r2 = A01(r0)
            com.instagram.model.hashtag.Hashtag r4 = r2.A01
            X.Vzq r2 = new X.Vzq
            r2.<init>(r5, r4)
            r0.A0E = r2
            X.0hq r33 = r0.getParentFragmentManager()
            X.TpO r2 = r0.A07
            if (r2 == 0) goto L_0x0641
            X.2rO r2 = r2.A0B
            r36 = r2
            X.2js r12 = r0.A01
            java.lang.String r17 = "scrollableNavigationHelper"
            if (r12 == 0) goto L_0x0637
            com.instagram.common.session.UserSession r38 = X.AnonymousClass7TE.A0l(r55)
            X.Vud r10 = r0.A09
            if (r10 != 0) goto L_0x04cb
            java.lang.String r25 = "relatedItemController"
            goto L_0x014d
        L_0x04cb:
            X.Vfm r2 = r0.A11
            r45 = r2
            X.2qi r9 = r0.A0L
            java.lang.String r16 = "quickPromotionDelegate"
            if (r9 == 0) goto L_0x0632
            X.2qT r8 = r0.A0M
            if (r8 == 0) goto L_0x063c
            X.UmI r7 = r0.A0G
            if (r7 != 0) goto L_0x04e1
            java.lang.String r25 = "followChainingDelegate"
            goto L_0x014d
        L_0x04e1:
            X.VO8 r2 = r0.A10
            r44 = r2
            X.Vzq r6 = r0.A0E
            if (r6 != 0) goto L_0x04ed
            java.lang.String r25 = "useHashtagController"
            goto L_0x014d
        L_0x04ed:
            java.lang.String r5 = r0.A0V
            java.lang.String r28 = "entryTrigger"
            if (r5 == 0) goto L_0x0646
            X.4bz r15 = r0.A0k
            r2 = 33
            X.WB9 r4 = new X.WB9
            r4.<init>((java.lang.Object) r0, (int) r2)
            r11 = 3
            X.UlK r2 = new X.UlK
            r30 = r2
            r31 = r4
            r32 = r0
            r34 = r15
            r35 = r12
            r37 = r0
            r39 = r10
            r40 = r0
            r41 = r13
            r42 = r6
            r43 = r7
            r46 = r0
            r47 = r9
            r48 = r8
            r49 = r29
            r50 = r5
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            r0.A0F = r2
            X.TpO r6 = r0.A07
            if (r6 == 0) goto L_0x0641
            X.2js r5 = r0.A01
            if (r5 == 0) goto L_0x0637
            X.3je r4 = r0.A16
            X.3jg[] r2 = new X.C249403jg[]{r5, r14, r2, r4}
            r6.A09(r2)
            com.instagram.common.session.UserSession r50 = X.AnonymousClass7TE.A0l(r55)
            X.Vt4 r2 = A01(r0)
            com.instagram.model.hashtag.Hashtag r5 = r2.A01
            X.TpO r2 = r0.A07
            if (r2 == 0) goto L_0x0641
            X.JQy r4 = r2.A0D
            X.Vae r2 = new X.Vae
            r48 = r2
            r49 = r0
            r51 = r20
            r52 = r4
            r54 = r5
            r48.<init>(r49, r50, r51, r52, r53, r54)
            r0.A0J = r2
            android.content.Context r6 = r0.requireContext()
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r55)
            X.Wfd r4 = new X.Wfd
            r2 = r23
            r4.<init>(r0, r2)
            X.7Q8 r7 = new X.7Q8
            r7.<init>(r6, r5, r4)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r55)
            X.2wt r6 = new X.2wt
            r6.<init>(r0, r2, r0)
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r55)
            X.WWR r4 = new X.WWR
            r4.<init>(r0, r11)
            X.36D r2 = new X.36D
            r2.<init>(r5, r4, r1, r1)
            r0.A0B = r2
            X.2jd r2 = new X.2jd
            r2.<init>()
            X.2uE r1 = r0.A0C
            if (r1 != 0) goto L_0x0590
            java.lang.String r25 = "peekMediaController"
            goto L_0x014d
        L_0x0590:
            r2.A0E(r1)
            X.36D r1 = r0.A0B
            if (r1 != 0) goto L_0x059b
            java.lang.String r25 = "mediaUpdateListener"
            goto L_0x014d
        L_0x059b:
            r2.A0E(r1)
            X.2qT r1 = r0.A0M
            if (r1 == 0) goto L_0x063c
            r2.A0E(r1)
            r1 = r21
            r2.A0E(r1)
            r2.A0E(r7)
            r2.A0E(r6)
            r2.A0E(r14)
            X.TpO r1 = r0.A07
            if (r1 == 0) goto L_0x0641
            r0.registerLifecycleListenerSet(r2)
            java.lang.String r1 = "HashtagFeedFragment.ARGUMENT_SEARCH_QUERY_TEXT"
            java.lang.String r7 = r3.getString(r1)
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r55)
            java.lang.String r1 = r0.A0V
            if (r1 == 0) goto L_0x0646
            X.WNH r3 = new X.WNH
            r6 = r27
            r8 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A0U = r3
            X.WQW r1 = r0.A15
            java.util.List r2 = r1.A00
            r2.add(r3)
            X.X3B r1 = r0.A0j
            r2.add(r1)
            X.0lV r1 = r0.A0p
            X.14i.A05(r1)
            java.lang.String r4 = r0.A0O
            r3 = r26
            r2 = r23
            A08(r0, r4, r3, r2, r2)
            r1 = r24
            A06(r0, r1)
            X.2qi r1 = r0.A0L
            if (r1 == 0) goto L_0x0632
            r1.Dh3()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r55)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r1)
            r0.A0Q = r1
            android.content.Context r5 = r0.requireContext()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r55)
            X.HAI r3 = r0.A08
            if (r3 == 0) goto L_0x014d
            java.lang.String r1 = r0.A0f
            X.5r2 r2 = new X.5r2
            r2.<init>(r4, r5, r1)
            X.Uh0 r1 = new X.Uh0
            r5 = r1
            r6 = r0
            r7 = r4
            r8 = r2
            r9 = r3
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            r0.A0S = r1
            r0.registerLifecycleListener(r1)
            r1 = -460270018(0xffffffffe490d63e, float:-2.1374151E22)
            r0 = r22
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x0632:
            X.0qQ.A0F(r16)
            goto L_0x0150
        L_0x0637:
            X.0qQ.A0F(r17)
            goto L_0x0150
        L_0x063c:
            X.0qQ.A0F(r18)
            goto L_0x0150
        L_0x0641:
            X.0qQ.A0F(r19)
            goto L_0x0150
        L_0x0646:
            X.0qQ.A0F(r28)
            goto L_0x0150
        L_0x064b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r2)
            r1 = 1583697602(0x5e654ec2, float:4.13083935E18)
            goto L_0x066e
        L_0x0654:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r2)
            r1 = 773512004(0x2e1adb44, float:3.5210293E-11)
            goto L_0x066e
        L_0x065d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r2)
            r1 = -1545186785(0xffffffffa3e6521f, float:-2.497143E-17)
            goto L_0x066e
        L_0x0666:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r2)
            r1 = 1833326858(0x6d46590a, float:3.8366046E27)
        L_0x066e:
            r0 = r22
            X.AnonymousClass0fD.A09(r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15381Ube.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1876916992);
        0qQ.A0B(layoutInflater, 0);
        if (this.A07 == null) {
            C13988Tno.A0n();
            throw AnonymousClass00P.createAndThrow();
        }
        View inflate = layoutInflater.inflate(R.layout.layout_grid_recyclerview_wrapper, viewGroup, false);
        AnonymousClass0fD.A09(309415142, A022);
        return inflate;
    }

    public final void onDestroy() {
        String str;
        int A022 = AnonymousClass0fD.A02(543418706);
        super.onDestroy();
        WQW wqw = this.A15;
        1xC.A01.A03(wqw, 1xG.class);
        1Ng r3 = this.A0Q;
        if (r3 != null) {
            r3.A02(this.A0m, C2370436c.class);
            r3.A02(this.A0o, C2370836g.class);
            r3.A02(this.A0n, C57066INg.class);
        }
        WNH wnh = this.A0U;
        if (wnh == null) {
            str = "rapidFeedbackPresenter";
        } else {
            List list = wqw.A00;
            list.remove(wnh);
            list.remove(this.A0j);
            14i.A06(this.A0p);
            C18806W2y.A02(this.A0c, (String) null);
            C15694Uh0 uh0 = this.A0S;
            if (uh0 == null) {
                str = "gridPrefetchController";
            } else {
                unregisterLifecycleListener(uh0);
                AnonymousClass0fD.A09(1747853706, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-484653384);
        super.onDestroyView();
        C309546Yr r1 = this.A0a;
        Dialog dialog = r1.A00;
        if (dialog != null) {
            dialog.dismiss();
            r1.A00 = null;
        }
        C14074TpO tpO = this.A07;
        if (tpO == null) {
            C13988Tno.A0n();
            throw AnonymousClass00P.createAndThrow();
        }
        tpO.A01();
        AnonymousClass357 r12 = this.A0K;
        if (r12 != null) {
            View view = r12.A02;
            if (view != null) {
                view.setOnClickListener((View.OnClickListener) null);
            }
            r12.A02 = null;
            this.A0K = null;
        }
        AnonymousClass0fD.A09(604512660, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1845318138);
        C14074TpO tpO = this.A07;
        String str = "grid";
        if (tpO != null) {
            tpO.A0D.AGS();
            X9Q x9q = this.A0A;
            if (x9q == null) {
                str = "videoPlayerManager";
            } else {
                x9q.ECU();
                C15381Ube.super.onPause();
                C227762js r2 = this.A01;
                if (r2 == null) {
                    str = "scrollableNavigationHelper";
                } else {
                    C14074TpO tpO2 = this.A07;
                    if (tpO2 != null) {
                        C238133Ar r1 = tpO2.A06;
                        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                        r2.A09(r1);
                        AnonymousClass0fD.A09(-1404040112, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        String str;
        View view;
        int A022 = AnonymousClass0fD.A02(45358158);
        super.onResume();
        C15949UlK ulK = this.A0F;
        if (ulK == null) {
            str = "actionBarController";
        } else {
            ulK.A02();
            this.A0a.A03 = false;
            C14074TpO tpO = this.A07;
            if (tpO == null) {
                str = "grid";
            } else {
                tpO.A0D.EHL();
                C18755Vzq vzq = this.A0E;
                if (vzq == null) {
                    str = "useHashtagController";
                } else {
                    HAI hai = this.A08;
                    if (hai == null) {
                        str = "dataSource";
                    } else {
                        C16672Uz8 uz8 = hai.A00;
                        0qQ.A07(uz8);
                        vzq.A01(uz8);
                        AnonymousClass0eM r4 = this.A0i;
                        UserSession A0l2 = AnonymousClass7TE.A0l(r4);
                        0qQ.A0B(A0l2, 0);
                        Class<C15933Ul0> cls = C15933Ul0.class;
                        C20649Wwh wwh = C20649Wwh.A00;
                        String str2 = this.A0g;
                        0qQ.A0B(str2, 0);
                        if (((C17957Vip) A0l2.A01(cls, wwh)).A00.containsKey(str2)) {
                            UserSession A0l3 = AnonymousClass7TE.A0l(r4);
                            0qQ.A0B(A0l3, 0);
                            C17625VbH vbH = (C17625VbH) ((C17957Vip) A0l3.A01(cls, wwh)).A00.remove(str2);
                            if (vbH != null) {
                                C15937Ul4 ul4 = (C15937Ul4) vbH;
                                if (ul4.A04) {
                                    C18575VuR vuR = this.A0I;
                                    if (vuR == null) {
                                        str = "feedRequestController";
                                    } else {
                                        C16672Uz8 uz82 = ul4.A00;
                                        if (uz82 != null) {
                                            String str3 = ul4.A00;
                                            vuR.A06.put(uz82, new C18459Vs8(C18575VuR.A00(uz82, vuR).A02.A00(str3), ul4.A01, ul4.A03));
                                        }
                                        str = "tab";
                                    }
                                }
                                List list = ul4.A06;
                                if (AnonymousClass7TE.A1b(list)) {
                                    int size = list.size();
                                    int i = 0;
                                    while (i < size) {
                                        C17694VcP vcP = (C17694VcP) list.get(i);
                                        boolean A1a = AnonymousClass7TE.A1a(ul4.A05.get(i));
                                        C16672Uz8 uz83 = ul4.A00;
                                        if (uz83 != null) {
                                            A02(uz83, vcP, this, A1a, false);
                                            i++;
                                        } else {
                                            str = "tab";
                                        }
                                    }
                                }
                                String str4 = ul4.A02;
                                if (!(str4 == null || str4.length() == 0 || (view = this.mView) == null)) {
                                    view.post(new C20224WnO(ul4, this));
                                }
                            } else {
                                throw AnonymousClass7TE.A0y();
                            }
                        }
                        AnonymousClass0fD.A09(-1623127209, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
