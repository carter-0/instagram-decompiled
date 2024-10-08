package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.NJz  reason: case insensitive filesystem */
public final class C68482NJz extends AnonymousClass4DH implements C268594df, C74332Pt8, C329207Hz, C74568PxH {
    public static final String __redex_internal_original_name = "DirectUpsellTrayFragment";
    public FrameLayout A00;
    public LinearLayout A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public NestedScrollView A06;
    public JV5 A07;
    public UserSession A08;
    public DirectStickerSuggestionsController A09;
    public C70672OFt A0A;
    public OO7 A0B;
    public OO7 A0C;
    public OO7 A0D;
    public OO7 A0E;
    public C70987OVb A0F;
    public C329207Hz A0G;
    public AnonymousClass7M7 A0H;
    public O8Y A0I;
    public IgdsInlineSearchBox A0J;
    public Runnable A0K;
    public Runnable A0L;
    public Consumer A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public IgTextView A0Q;
    public AnonymousClass79Z A0R;
    public OO0 A0S;
    public OO0 A0T;
    public OO0 A0U;
    public AnonymousClass7L0 A0V;
    public OLS A0W;
    public String A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public final String A0b;
    public final AnonymousClass0eM A0c;
    public final AnonymousClass0eM A0d;
    public final AnonymousClass0eM A0e;
    public final O6Y A0f = new O6Y(this);
    public final C74451Pv6 A0g = new P3A(this);
    public final C74453Pv8 A0h = new P3D(this);
    public final AnonymousClass9HB A0i;
    public final String A0j;
    public final boolean A0k;

    public final void ADi(AnonymousClass7L0 r2) {
        0qQ.A0B(r2, 0);
        this.A0V = r2;
        A00();
    }

    public final int AqL() {
        return -1;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void CxP(C317966o8 r2) {
        0qQ.A0B(r2, 0);
        Runnable runnable = this.A0L;
        if (runnable != null) {
            runnable.run();
        }
        C329207Hz r0 = this.A0G;
        if (r0 != null) {
            r0.CxP(r2);
        }
        IgdsInlineSearchBox igdsInlineSearchBox = this.A0J;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A03();
        }
    }

    public final void Dhu(String str) {
        0qQ.A0B(str, 0);
        OO0 oo0 = this.A0U;
        if (oo0 != null) {
            oo0.A03(str);
        }
        OO0 oo02 = this.A0S;
        if (oo02 != null) {
            oo02.A03(str);
        }
        OO0 oo03 = this.A0T;
        if (oo03 != null) {
            oo03.A03(str);
        }
    }

    public final boolean Erf() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x026c, code lost:
        if (r0.A0O != false) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0272, code lost:
        if (A02() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0274, code lost:
        r4 = r0.A0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0282, code lost:
        if (X.AnonymousClass7TF.A1Z(((X.C314336i2) r4.getValue()).A09) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0284, code lost:
        r7 = X.07U.A05;
        r6 = getViewLifecycleOwner();
        X.AnonymousClass7TE.A1Z(new X.MHI(r6, r7, r0, (X.AnonymousClass4D7) null, 2), X.AnonymousClass07a.A00(r6));
        ((X.C314336i2) r4.getValue()).A02(X.C317846nw.CONVERGENCE_2_UPSELL_BANNER_STICKER_PACK);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02b6, code lost:
        throw X.AnonymousClass7TE.A0y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e7, code lost:
        if (r4 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010d, code lost:
        if (r4 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0110, code lost:
        r5.addView(r4);
        X.0nA.A0r(r2, new X.PVG(r2));
        r6 = r0.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011d, code lost:
        if (r6 == null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011f, code lost:
        r6.A02 = new X.C72722PHc(r0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0127, code lost:
        r8 = "userSession";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012b, code lost:
        if (r0.A0P == false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012d, code lost:
        r7 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012f, code lost:
        if (r7 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0131, code lost:
        r0.A09 = (com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController) r7.A01(com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController.class, new X.MMO(r7, 27));
        r7 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0144, code lost:
        if (r7 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0146, code lost:
        r6 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0148, code lost:
        if (r6 == null) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014a, code lost:
        r14 = X.AnonymousClass05K.A0N;
        r5 = r0.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014e, code lost:
        if (r5 != null) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0150, code lost:
        r5 = X.C73450Pcs.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0152, code lost:
        r0.A0E = new X.OO7(r6, r0, r7, r0, r14, r5);
        r4 = r0.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0161, code lost:
        if (r4 == null) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0163, code lost:
        r4 = r4.A03();
        r6 = (java.util.List) r4.A00;
        r5 = (X.AnonymousClass0r6) r4.A01;
        r4 = r0.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0171, code lost:
        if (r4 == null) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0173, code lost:
        r4.A04(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x017a, code lost:
        if (A03() == false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x017c, code lost:
        r12 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017e, code lost:
        if (r12 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0180, code lost:
        r5 = X.C376169Gw.A00;
        r4 = X.0sn.A00;
        r13 = r5.createWithAdditionalCapabilities(r4, r4);
        r14 = r0.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x018a, code lost:
        if (r14 == null) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x018c, code lost:
        r10 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x018e, code lost:
        if (r10 != null) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0190, code lost:
        r8 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0196, code lost:
        if (r0.A0Z != false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0198, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019c, code lost:
        if (r0.A0Y == false) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019e, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a0, code lost:
        r15 = r0.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a2, code lost:
        if (r15 != null) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a4, code lost:
        r8 = "initialSearchTerm";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a8, code lost:
        r0.A0F = new X.C70987OVb(r10, r0.A07, r12, r13, r14, r15, r16, A02(), A04());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01bb, code lost:
        if (r0.A0O == false) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01bd, code lost:
        r7 = r0.A0f;
        r6 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c1, code lost:
        if (r6 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c3, code lost:
        r0.A0A = new X.C70672OFt(getViewLifecycleOwner(), r6, r7);
        r6 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d0, code lost:
        if (r6 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d2, code lost:
        r5 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d4, code lost:
        if (r5 == null) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d6, code lost:
        r0.A0B = new X.OO7(r5, r0, r6, r0, X.AnonymousClass05K.A00, X.C73451Pct.A00);
        r6 = r0.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e8, code lost:
        if (r6 == null) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ea, code lost:
        X.AnonymousClass11O.A03(X.AnonymousClass07a.A00(r6.A01), new X.C61860pz(new X.MGY(r6, (X.AnonymousClass4D7) null, 25), ((com.instagram.stickersearch.AvatarStickerInteractor) r6.A04.getValue()).A03((X.C61082JwK) null, X.C317846nw.MIXED_AVATAR_STICKERS, X.C317866ny.DIRECT, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, false, false)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0217, code lost:
        r5 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0219, code lost:
        if (r5 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x021b, code lost:
        r4 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x021d, code lost:
        if (r4 == null) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x021f, code lost:
        r14 = X.AnonymousClass05K.A0C;
        r15 = X.C73451Pct.A00;
        r11 = r0;
        r13 = r0;
        r0.A0D = new X.OO7(r4, r11, r5, r13, r14, r15);
        r5 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0231, code lost:
        if (r5 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0233, code lost:
        r4 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0235, code lost:
        if (r4 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0237, code lost:
        r0.A0C = new X.OO7(r4, r11, r5, r13, X.AnonymousClass05K.A01, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0245, code lost:
        if (r0.A0N == false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0247, code lost:
        Dhu("");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x024c, code lost:
        r4 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x024e, code lost:
        if (r4 == null) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0250, code lost:
        r4.post(new X.PVH(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0258, code lost:
        r0.A0W = new X.OLS(requireContext(), r2);
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0268, code lost:
        if (r0.A0P != false) goto L_0x0274;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            r19 = this;
            r3 = 0
            r4 = r20
            X.0qQ.A0B(r4, r3)
            r0 = r19
            r1 = r21
            super.onViewCreated(r4, r1)
            r1 = 2131431774(0x7f0b115e, float:1.8485287E38)
            android.view.View r1 = r4.requireViewById(r1)
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r0.A06 = r1
            r1 = 2131441715(0x7f0b3833, float:1.850545E38)
            com.instagram.common.ui.base.IgTextView r1 = X.DbT.A0a(r4, r1)
            r0.A0Q = r1
            r1 = 2131431781(0x7f0b1165, float:1.84853E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r4, r1)
            r1 = 2131430734(0x7f0b0d4e, float:1.8483177E38)
            android.view.ViewGroup r5 = X.DbX.A0I(r4, r1)
            r5.removeAllViews()
            android.content.Context r4 = r0.requireContext()
            r1 = 0
            com.instagram.igds.components.search.IgdsInlineSearchBox r6 = new com.instagram.igds.components.search.IgdsInlineSearchBox
            r6.<init>(r4, r1, r3)
            r0.A0J = r6
            r4 = 2131960279(0x7f1321d7, float:1.9557222E38)
            r6.setHint((int) r4)
            android.content.Context r6 = r0.requireContext()
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r6)
            r0.A00 = r4
            android.content.Context r6 = r0.requireContext()
            r4 = 2131629467(0x7f0e159b, float:1.8886256E38)
            r8 = 2131629467(0x7f0e159b, float:1.8886256E38)
            android.view.View r4 = android.view.View.inflate(r6, r4, r1)
            java.lang.String r7 = "null cannot be cast to non-null type android.widget.LinearLayout"
            X.0qQ.A0C(r4, r7)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.A05 = r4
            android.content.Context r6 = r0.requireContext()
            r4 = 2131629468(0x7f0e159c, float:1.8886258E38)
            android.view.View r4 = android.view.View.inflate(r6, r4, r1)
            X.0qQ.A0C(r4, r7)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.A03 = r4
            android.content.Context r4 = r0.requireContext()
            android.view.View r4 = android.view.View.inflate(r4, r8, r1)
            X.0qQ.A0C(r4, r7)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.A01 = r4
            android.content.Context r4 = r0.requireContext()
            android.view.View r4 = android.view.View.inflate(r4, r8, r1)
            X.0qQ.A0C(r4, r7)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.A04 = r4
            android.content.Context r4 = r0.requireContext()
            android.view.View r4 = android.view.View.inflate(r4, r8, r1)
            X.0qQ.A0C(r4, r7)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.A02 = r4
            boolean r4 = r0.A0N
            java.lang.String r8 = "powerupsSection"
            r16 = r8
            if (r4 == 0) goto L_0x010b
            boolean r4 = r0.A04()
            java.lang.String r6 = "convergenceBannerSection"
            if (r4 == 0) goto L_0x00f3
            com.instagram.igds.components.search.IgdsInlineSearchBox r4 = r0.A0J
            r5.addView(r4)
            android.widget.FrameLayout r4 = r0.A00
            if (r4 == 0) goto L_0x0107
            r5.addView(r4)
            boolean r4 = r0.A0P
            if (r4 == 0) goto L_0x00cc
            android.widget.LinearLayout r4 = r0.A05
            if (r4 == 0) goto L_0x02ae
            r5.addView(r4)
        L_0x00cc:
            android.widget.LinearLayout r4 = r0.A03
            if (r4 == 0) goto L_0x00eb
            r5.addView(r4)
        L_0x00d3:
            boolean r4 = r0.A0O
            if (r4 == 0) goto L_0x00de
            android.widget.LinearLayout r4 = r0.A01
            if (r4 == 0) goto L_0x02aa
            r5.addView(r4)
        L_0x00de:
            android.widget.LinearLayout r4 = r0.A04
            if (r4 == 0) goto L_0x02a6
            r5.addView(r4)
            android.widget.LinearLayout r4 = r0.A02
            if (r4 != 0) goto L_0x0110
        L_0x00e9:
            java.lang.String r8 = "gifsSection"
        L_0x00eb:
            X.0qQ.A0F(r8)
        L_0x00ee:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00f3:
            android.widget.FrameLayout r4 = r0.A00
            if (r4 == 0) goto L_0x0107
            r5.addView(r4)
            android.widget.LinearLayout r4 = r0.A03
            if (r4 == 0) goto L_0x00eb
            r5.addView(r4)
            com.instagram.igds.components.search.IgdsInlineSearchBox r4 = r0.A0J
            r5.addView(r4)
            goto L_0x00d3
        L_0x0107:
            X.0qQ.A0F(r6)
            goto L_0x00ee
        L_0x010b:
            android.widget.LinearLayout r4 = r0.A03
            if (r4 != 0) goto L_0x0110
            goto L_0x00eb
        L_0x0110:
            r5.addView(r4)
            X.PVG r4 = new X.PVG
            r4.<init>(r2)
            X.0nA.A0r(r2, r4)
            com.instagram.igds.components.search.IgdsInlineSearchBox r6 = r0.A0J
            if (r6 == 0) goto L_0x0127
            r5 = 1
            X.PHc r4 = new X.PHc
            r4.<init>(r0, r5)
            r6.A02 = r4
        L_0x0127:
            boolean r4 = r0.A0P
            java.lang.String r8 = "userSession"
            if (r4 == 0) goto L_0x0176
            com.instagram.common.session.UserSession r7 = r0.A08
            if (r7 == 0) goto L_0x00eb
            java.lang.Class<com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController> r6 = com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController.class
            r5 = 27
            X.MMO r4 = new X.MMO
            r4.<init>(r7, r5)
            java.lang.Object r4 = r7.A01(r6, r4)
            com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r4 = (com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController) r4
            r0.A09 = r4
            com.instagram.common.session.UserSession r7 = r0.A08
            if (r7 == 0) goto L_0x00eb
            android.widget.LinearLayout r6 = r0.A05
            if (r6 == 0) goto L_0x02ae
            java.lang.Integer r14 = X.AnonymousClass05K.A0N
            java.util.function.Consumer r5 = r0.A0M
            if (r5 != 0) goto L_0x0152
            X.Pcs r5 = X.C73450Pcs.A00
        L_0x0152:
            X.OO7 r4 = new X.OO7
            r9 = r4
            r10 = r6
            r11 = r0
            r12 = r7
            r13 = r0
            r15 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.A0E = r4
            com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r4 = r0.A09
            if (r4 == 0) goto L_0x0176
            X.0eP r4 = r4.A03()
            java.lang.Object r6 = r4.A00
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r4.A01
            X.0r6 r5 = (X.AnonymousClass0r6) r5
            X.OO7 r4 = r0.A0E
            if (r4 == 0) goto L_0x0176
            r4.A04(r6, r5)
        L_0x0176:
            boolean r4 = r0.A03()
            if (r4 == 0) goto L_0x01b9
            com.instagram.common.session.UserSession r12 = r0.A08
            if (r12 == 0) goto L_0x00eb
            X.9Gw r5 = X.C376169Gw.A00
            X.0sn r4 = X.0sn.A00
            com.instagram.direct.capabilities.Capabilities r13 = r5.createWithAdditionalCapabilities(r4, r4)
            X.7M7 r14 = r0.A0H
            if (r14 == 0) goto L_0x02b2
            android.widget.LinearLayout r10 = r0.A03
            if (r10 != 0) goto L_0x0194
            r8 = r16
            goto L_0x00eb
        L_0x0194:
            boolean r4 = r0.A0Z
            if (r4 != 0) goto L_0x019e
            boolean r4 = r0.A0Y
            r16 = 0
            if (r4 == 0) goto L_0x01a0
        L_0x019e:
            r16 = 1
        L_0x01a0:
            java.lang.String r15 = r0.A0X
            if (r15 != 0) goto L_0x01a8
            java.lang.String r8 = "initialSearchTerm"
            goto L_0x00eb
        L_0x01a8:
            X.JV5 r11 = r0.A07
            boolean r17 = r0.A02()
            boolean r18 = r0.A04()
            X.OVb r9 = new X.OVb
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.A0F = r9
        L_0x01b9:
            boolean r4 = r0.A0O
            if (r4 == 0) goto L_0x0217
            X.O6Y r7 = r0.A0f
            com.instagram.common.session.UserSession r6 = r0.A08
            if (r6 == 0) goto L_0x00eb
            X.07Z r5 = r0.getViewLifecycleOwner()
            X.OFt r4 = new X.OFt
            r4.<init>(r5, r6, r7)
            r0.A0A = r4
            com.instagram.common.session.UserSession r6 = r0.A08
            if (r6 == 0) goto L_0x00eb
            android.widget.LinearLayout r5 = r0.A01
            if (r5 == 0) goto L_0x02aa
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            X.Pct r15 = X.C73451Pct.A00
            X.OO7 r4 = new X.OO7
            r9 = r4
            r10 = r5
            r11 = r0
            r12 = r6
            r13 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.A0B = r4
            X.OFt r6 = r0.A0A
            if (r6 == 0) goto L_0x0217
            X.0eM r4 = r6.A04
            java.lang.Object r9 = r4.getValue()
            com.instagram.stickersearch.AvatarStickerInteractor r9 = (com.instagram.stickersearch.AvatarStickerInteractor) r9
            X.6ny r12 = X.C317866ny.DIRECT
            X.6nw r11 = X.C317846nw.MIXED_AVATAR_STICKERS
            r10 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r3
            r17 = r3
            X.05E r5 = r9.A03(r10, r11, r12, r13, r14, r15, r16, r17)
            r4 = 25
            X.MGY r3 = new X.MGY
            r3.<init>(r6, r1, r4)
            X.0pz r4 = new X.0pz
            r4.<init>(r3, r5)
            X.07Z r3 = r6.A01
            X.0xx r3 = X.AnonymousClass07a.A00(r3)
            X.AnonymousClass11O.A03(r3, r4)
        L_0x0217:
            com.instagram.common.session.UserSession r5 = r0.A08
            if (r5 == 0) goto L_0x00eb
            android.widget.LinearLayout r4 = r0.A04
            if (r4 == 0) goto L_0x02a6
            java.lang.Integer r14 = X.AnonymousClass05K.A0C
            X.Pct r15 = X.C73451Pct.A00
            X.OO7 r3 = new X.OO7
            r9 = r3
            r10 = r4
            r11 = r0
            r12 = r5
            r13 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.A0D = r3
            com.instagram.common.session.UserSession r5 = r0.A08
            if (r5 == 0) goto L_0x00eb
            android.widget.LinearLayout r4 = r0.A02
            if (r4 == 0) goto L_0x00e9
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            X.OO7 r3 = new X.OO7
            r9 = r3
            r10 = r4
            r12 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.A0C = r3
            boolean r3 = r0.A0N
            if (r3 == 0) goto L_0x024c
            java.lang.String r3 = ""
            r0.Dhu(r3)
        L_0x024c:
            androidx.core.widget.NestedScrollView r4 = r0.A06
            if (r4 == 0) goto L_0x0258
            X.PVH r3 = new X.PVH
            r3.<init>(r0)
            r4.post(r3)
        L_0x0258:
            android.content.Context r4 = r0.requireContext()
            X.OLS r3 = new X.OLS
            r3.<init>(r4, r2)
            r0.A0W = r3
            r0.A00()
            boolean r2 = r0.A0P
            if (r2 != 0) goto L_0x0274
            boolean r2 = r0.A0O
            if (r2 != 0) goto L_0x0274
            boolean r2 = r0.A02()
            if (r2 == 0) goto L_0x02a5
        L_0x0274:
            X.0eM r4 = r0.A0c
            java.lang.Object r2 = r4.getValue()
            X.6i2 r2 = (X.C314336i2) r2
            X.0eM r2 = r2.A09
            boolean r2 = X.AnonymousClass7TF.A1Z(r2)
            if (r2 == 0) goto L_0x02a5
            X.07U r7 = X.07U.A05
            X.07Z r6 = r0.getViewLifecycleOwner()
            X.0xx r3 = X.AnonymousClass07a.A00(r6)
            r10 = 2
            X.MHI r2 = new X.MHI
            r5 = r2
            r8 = r0
            r9 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            X.AnonymousClass7TE.A1Z(r2, r3)
            java.lang.Object r1 = r4.getValue()
            X.6i2 r1 = (X.C314336i2) r1
            X.6nw r0 = X.C317846nw.CONVERGENCE_2_UPSELL_BANNER_STICKER_PACK
            r1.A02(r0)
        L_0x02a5:
            return
        L_0x02a6:
            java.lang.String r8 = "stickersSection"
            goto L_0x00eb
        L_0x02aa:
            java.lang.String r8 = "avatarStickersSection"
            goto L_0x00eb
        L_0x02ae:
            java.lang.String r8 = "suggestionItemSection"
            goto L_0x00eb
        L_0x02b2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68482NJz.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00() {
        String str;
        AnonymousClass7L0 r3 = this.A0V;
        if (this.mView != null && r3 != null) {
            AnonymousClass7TF.A0G(requireView(), R.id.direct_star_tab_root_container).getBackground().setColorFilter(r3.A09, PorterDuff.Mode.SRC);
            IgdsInlineSearchBox igdsInlineSearchBox = this.A0J;
            if (igdsInlineSearchBox != null) {
                igdsInlineSearchBox.A05(r3.A0E);
            }
            OO7 oo7 = this.A0E;
            if (oo7 != null) {
                oo7.A02.setTextColor(r3.A0C);
            }
            C70987OVb oVb = this.A0F;
            if (oVb != null) {
                TextView textView = oVb.A04;
                int i = r3.A0C;
                textView.setTextColor(i);
                oVb.A02.setTextColor(i);
            }
            OO7 oo72 = this.A0B;
            if (oo72 != null) {
                oo72.A02.setTextColor(r3.A0C);
            }
            OO7 oo73 = this.A0D;
            if (oo73 == null) {
                str = "stickerItemController";
            } else {
                TextView textView2 = oo73.A02;
                int i2 = r3.A0C;
                textView2.setTextColor(i2);
                OO7 oo74 = this.A0C;
                if (oo74 == null) {
                    str = "gifItemController";
                } else {
                    oo74.A02.setTextColor(i2);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A01(C68482NJz nJz, boolean z, boolean z2) {
        IgTextView igTextView;
        int i;
        if (nJz.A0P || nJz.A0a || !z || !z2) {
            igTextView = nJz.A0Q;
            if (igTextView != null) {
                i = 8;
            } else {
                return;
            }
        } else {
            igTextView = nJz.A0Q;
            if (igTextView != null) {
                i = 0;
            } else {
                return;
            }
        }
        igTextView.setVisibility(i);
    }

    private final boolean A03() {
        String str = this.A0X;
        if (str != null) {
            Pattern pattern = 0mp.A06;
            Matcher matcher = Patterns.WEB_URL.matcher(str);
            0qQ.A07(matcher);
            boolean find = matcher.find();
            if (this.A0a) {
                String str2 = this.A0X;
                if (str2 != null) {
                    if (!0mp.A0E(str2) && !find) {
                        String str3 = this.A0X;
                        if (str3 != null) {
                            if (str3.length() == 0) {
                                return false;
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        0qQ.A0F("initialSearchTerm");
        throw AnonymousClass00P.createAndThrow();
    }

    private final boolean A04() {
        UserSession userSession = this.A08;
        if (userSession != null) {
            0Tu r3 = 0Tu.A05;
            if (!DbY.A1Y(r3, userSession, 36322589961955618L)) {
                UserSession userSession2 = this.A08;
                if (userSession2 != null) {
                    if (!DbY.A1Y(r3, userSession2, 36322096040650683L)) {
                        UserSession userSession3 = this.A08;
                        if (userSession3 != null) {
                            if (DbY.A1Y(r3, userSession3, 36322096041371588L) || A02() || this.A0O) {
                                return true;
                            }
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    /* renamed from: CMx */
    public final float CoU() {
        if (this.A0N) {
            return 0.7f;
        }
        return 0.5f;
    }

    public final boolean CPc() {
        return this.A0k;
    }

    public final void DMN(C69319NjK njK, C68137N2b n2b) {
        Runnable runnable = this.A0K;
        if (runnable != null) {
            runnable.run();
        }
        C329207Hz r0 = this.A0G;
        if (r0 != null) {
            r0.DMN(njK, n2b);
        }
        IgdsInlineSearchBox igdsInlineSearchBox = this.A0J;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A03();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r0.length() == 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DMt() {
        /*
            r4 = this;
            X.OVb r0 = r4.A0F
            if (r0 == 0) goto L_0x0037
            boolean r0 = r4.A0N
            if (r0 == 0) goto L_0x0019
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r4.A0J
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = r0.getSearchString()
            if (r0 == 0) goto L_0x0019
            int r0 = r0.length()
            r3 = 0
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r3 = 1
        L_0x001a:
            X.JV5 r0 = r4.A07
            java.lang.Object r1 = r0.A00
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r0 = r0.A03
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            X.JV5 r2 = new X.JV5
            r2.<init>((java.util.List) r0, (java.util.Set) r1, (boolean) r3)
            X.OVb r1 = r4.A0F
            if (r1 == 0) goto L_0x0035
            X.JV5 r0 = r4.A07
            r1.A01(r0, r2)
        L_0x0035:
            r4.A07 = r2
        L_0x0037:
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r4.A0J
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = r0.getSearchString()
            if (r0 == 0) goto L_0x0047
            int r0 = r0.length()
            if (r0 != 0) goto L_0x005b
        L_0x0047:
            X.OO7 r0 = r4.A0E
            if (r0 == 0) goto L_0x004e
            r0.A01()
        L_0x004e:
            X.OO7 r1 = r4.A0B
            if (r1 == 0) goto L_0x005b
            X.OFt r0 = r4.A0A
            if (r0 == 0) goto L_0x005b
            java.util.ArrayList r0 = r0.A03
            r1.A02(r0)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68482NJz.DMt():void");
    }

    public final void DMu(int i) {
        IgdsInlineSearchBox igdsInlineSearchBox;
        if (this.A0F != null) {
            JV5 jv5 = this.A07;
            Set set = (Set) jv5.A00;
            List list = (List) jv5.A03;
            AnonymousClass7TF.A1H(set, list);
            JV5 jv52 = new JV5(list, set, false);
            C70987OVb oVb = this.A0F;
            if (oVb != null) {
                oVb.A01(this.A07, jv52);
            }
            this.A07 = jv52;
        }
        OO7 oo7 = this.A0E;
        if (oo7 != null) {
            oo7.A01.setVisibility(8);
        }
        OO7 oo72 = this.A0B;
        if (oo72 != null) {
            oo72.A01.setVisibility(8);
        }
        if (this.A0N && (igdsInlineSearchBox = this.A0J) != null) {
            igdsInlineSearchBox.post(new PVF(this));
        }
    }

    public final String getModuleName() {
        return this.A0j;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0e);
    }

    public final boolean isScrolledToTop() {
        NestedScrollView nestedScrollView = this.A06;
        if (nestedScrollView == null || nestedScrollView.getScrollY() != 0) {
            return false;
        }
        return true;
    }

    public final void onBottomSheetClosed() {
        UserSession userSession = this.A08;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        ((LD6) userSession.A01(LD6.class, new MMO(userSession, 14))).A00(NTG.A00);
        O8Y o8y = this.A0I;
        if (o8y != null) {
            C72655PEi pEi = o8y.A00;
            DirectStickerSuggestionsController directStickerSuggestionsController = pEi.A01;
            if (directStickerSuggestionsController != null) {
                directStickerSuggestionsController.A04 = AnonymousClass7TF.A0c();
            }
            pEi.A00.post(new PWJ(pEi));
            pEi.A02.A03.A01();
        }
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        OLS ols = this.A0W;
        if (ols == null) {
            0qQ.A0F("roundedCornerHelper");
            throw AnonymousClass00P.createAndThrow();
        } else {
            ols.A00(i);
        }
    }

    public C68482NJz() {
        C73923Pm3 pm3 = new C73923Pm3(this, 1);
        C73923Pm3 pm32 = new C73923Pm3(this, 3);
        0eO r4 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r4, new C73923Pm3(pm32, 4));
        this.A0d = DbS.A0I(new C73923Pm3(A002, 5), pm3, C73915Plq.A00(A002, (Object) null, 44), DbS.A0z(C53011Gh2.class));
        C73923Pm3 pm33 = new C73923Pm3(this, 0);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(r4, new C73923Pm3(new C73923Pm3(this, 6), 7));
        this.A0c = DbS.A0I(new C73923Pm3(A003, 8), pm33, C73915Plq.A00(A003, (Object) null, 45), DbS.A0z(C314336i2.class));
        this.A0i = new AnonymousClass9HB();
        this.A07 = new JV5((List) AnonymousClass7TE.A1C(), AnonymousClass5FV.A03, false);
        this.A0b = "ig_direct_thread";
        this.A0e = C227642jf.A02(this);
        this.A0j = __redex_internal_original_name;
        this.A0k = true;
    }

    private final boolean A02() {
        UserSession userSession;
        0Tu r2;
        long j;
        if (!A03()) {
            return false;
        }
        UserSession userSession2 = this.A08;
        String str = "userSession";
        if (userSession2 != null) {
            if (25x.A00(userSession2).A01.A00 != C299715vi.A00) {
                return false;
            }
            if (this.A0Y) {
                userSession = this.A08;
                if (userSession != null) {
                    r2 = 0Tu.A05;
                    j = 36320906334905284L;
                }
            } else {
                AnonymousClass79Z r0 = this.A0R;
                if (r0 == null) {
                    str = "avatarPowerupGating";
                } else {
                    userSession = r0.A00;
                    r2 = 0Tu.A05;
                    j = 36320060226412452L;
                }
            }
            return 182.A06(r2, userSession, j);
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, X.0iw, X.NJz, androidx.fragment.app.Fragment, java.lang.Object, X.4D6] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004d, code lost:
        if (X.DbY.A1Y(X.0Tu.A05, r2, 36322413868230829L) != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r0 = -1267493361(0xffffffffb473960f, float:-2.268573E-7)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r0 = r16
            X.C68482NJz.super.onCreate(r0)
            android.os.Bundle r1 = r15.requireArguments()
            com.instagram.common.session.UserSession r0 = X.DbX.A0U(r15)
            r15.A08 = r0
            java.lang.String r2 = "param_extra_initial_search_term"
            java.lang.String r0 = ""
            java.lang.String r0 = r1.getString(r2, r0)
            r15.A0X = r0
            java.lang.String r2 = "param_extra_is_msys_thread"
            boolean r0 = r1.containsKey(r2)
            r14 = 0
            if (r0 == 0) goto L_0x002f
            boolean r0 = r1.getBoolean(r2, r14)
            r15.A0Z = r0
        L_0x002f:
            java.lang.String r0 = "param_extra_armadillo_express"
            boolean r0 = r1.getBoolean(r0, r14)
            r15.A0Y = r0
            boolean r0 = r15.A0Z
            java.lang.String r8 = "userSession"
            if (r0 != 0) goto L_0x004f
            com.instagram.common.session.UserSession r2 = r15.A08
            if (r2 == 0) goto L_0x0143
            X.0Tu r0 = X.0Tu.A05
            r5 = 36322413868230829(0x810b0b000028ad, double:3.0337790166657344E-306)
            boolean r2 = X.DbY.A1Y(r0, r2, r5)
            r0 = 1
            if (r2 == 0) goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            r15.A0N = r0
            if (r0 == 0) goto L_0x009d
            boolean r2 = r15.A0Y
            boolean r0 = r15.A0Z
            com.instagram.api.schemas.GiphyRequestSurface r10 = com.instagram.api.schemas.GiphyRequestSurface.DIRECT
            if (r2 == 0) goto L_0x011b
            com.instagram.common.session.UserSession r7 = r15.A08
            if (r7 == 0) goto L_0x0143
            X.Pv6 r6 = r15.A0g
            r5 = 1
            r0 = 6
            X.0qQ.A0B(r6, r0)
            X.Khu r0 = X.C62564Khu.GIPHY_GIFS
            X.P3C r2 = new X.P3C
            r2.<init>(r15, r7, r0)
            X.NVf r0 = new X.NVf
            r0.<init>(r15, r6, r2, r5)
            r15.A0S = r0
            boolean r7 = r15.A0Z
            boolean r6 = r15.A0Y
            com.instagram.common.session.UserSession r5 = r15.A08
            if (r5 == 0) goto L_0x0143
            X.Pv8 r2 = r15.A0h
            r0 = 7
            X.0qQ.A0B(r2, r0)
            if (r7 != 0) goto L_0x0112
            if (r6 != 0) goto L_0x0112
            X.Khu r0 = X.C62564Khu.GIPHY_STICKERS
            java.util.List r13 = X.AnonymousClass7TE.A1I(r0)
            X.LqM r9 = new X.LqM
            r11 = r15
            r12 = r5
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x0094:
            X.Pv7 r9 = (X.C74452Pv7) r9
            X.NVg r0 = new X.NVg
            r0.<init>(r15, r9, r2)
            r15.A0T = r0
        L_0x009d:
            java.lang.String r0 = "param_extra_show_sticker_suggestions"
            boolean r0 = r1.getBoolean(r0, r14)
            r15.A0P = r0
            java.lang.String r0 = "param_extra_is_power_ups_enabled"
            boolean r0 = r1.getBoolean(r0, r14)
            r15.A0a = r0
            com.instagram.common.session.UserSession r5 = r15.A08
            if (r5 == 0) goto L_0x0143
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322589961890081(0x810b3400002921, double:3.0338903790049176E-306)
            boolean r0 = X.DbY.A1Y(r2, r5, r0)
            r15.A0O = r0
            com.instagram.common.session.UserSession r1 = r15.A08
            if (r1 == 0) goto L_0x0143
            X.79Z r0 = new X.79Z
            r0.<init>(r1)
            r15.A0R = r0
            boolean r0 = r15.A02()
            if (r0 == 0) goto L_0x010b
            com.instagram.common.session.UserSession r2 = r15.A08
            if (r2 == 0) goto L_0x0143
            r0 = 14
            X.MMO r1 = new X.MMO
            r1.<init>(r2, r0)
            java.lang.Class<X.LD6> r0 = X.LD6.class
            java.lang.Object r6 = r2.A01(r0, r1)
            X.LD6 r6 = (X.LD6) r6
            X.02m r1 = r6.A01
            r0 = 1064965959(0x3f7a1747, float:0.9769177)
            r1.markerStart(r0)
            r0 = 1
            r6.A00 = r0
            X.0eM r5 = r15.A0d
            java.lang.Object r0 = r5.getValue()
            X.Gh2 r0 = (X.C53011Gh2) r0
            X.2Fk r2 = r0.A00
            r0 = 2
            X.PqR r1 = new X.PqR
            r1.<init>((int) r0, (java.lang.Object) r6, (java.lang.Object) r15)
            r0 = 46
            X.Dba.A15(r15, r2, r1, r0)
            java.lang.Object r0 = r5.getValue()
            X.Gh2 r0 = (X.C53011Gh2) r0
            r0.A00()
        L_0x010b:
            r0 = 1619035754(0x6080866a, float:7.408965E19)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x0112:
            X.Khu r0 = X.C62564Khu.GIPHY_STICKERS
            X.P3C r9 = new X.P3C
            r9.<init>(r15, r5, r0)
            goto L_0x0094
        L_0x011b:
            com.instagram.common.session.UserSession r12 = r15.A08
            if (r12 == 0) goto L_0x0143
            if (r0 != 0) goto L_0x013c
            X.Khu r2 = X.C62564Khu.GIPHY_GIFS
            X.Khu r0 = X.C62564Khu.GIPHY_STICKERS
            X.Khu[] r0 = new X.C62564Khu[]{r2, r0}
            java.util.List r13 = X.0sr.A1P(r0)
            r11 = 0
            X.LqM r9 = new X.LqM
            r9.<init>(r10, r11, r12, r13, r14)
            X.NVh r0 = new X.NVh
            r0.<init>(r15, r15, r9)
            r15.A0U = r0
            goto L_0x009d
        L_0x013c:
            java.lang.String r0 = "This interactor supports only open threads"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0143:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68482NJz.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-854687926);
        0qQ.A0B(layoutInflater, 0);
        this.A0i.A02(viewGroup);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_star_tab, viewGroup, false);
        AnonymousClass0fD.A09(379629472, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1463125116);
        this.A0i.A01();
        super.onDestroyView();
        C70987OVb oVb = this.A0F;
        if (oVb != null) {
            AnonymousClass7M7 r0 = oVb.A0B;
            0u4.A00(r0.A02).remove(oVb.A09);
        }
        C70672OFt oFt = this.A0A;
        if (oFt != null) {
            oFt.A00 = null;
        }
        OO7 oo7 = this.A0E;
        if (oo7 != null) {
            C51970G9q.A1S(oo7.A00);
        }
        this.A06 = null;
        this.A0Q = null;
        this.A0J = null;
        AnonymousClass0fD.A09(1074586383, A022);
    }
}
