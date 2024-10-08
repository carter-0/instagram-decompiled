package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.feed.widget.IgProgressImageViewProgressBar;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Tzb  reason: case insensitive filesystem */
public final class C14629Tzb implements C51923G7r {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public ImageView A0B;
    public TextView A0C;
    public IgFrameLayout A0D;
    public IgProgressImageViewProgressBar A0E;
    public Reel A0F;
    public C255773uh A0G;
    public C250973mM A0H;
    public ReelViewerConfig A0I;
    public AnonymousClass3BQ A0J;
    public 2bv A0K;
    public C16138UpP A0L;
    public C254123ry A0M;
    public C231922sd A0N;
    public ReelDashboardFragment A0O;
    public String A0P;
    public boolean A0Q;
    public final int A0R;
    public final View A0S;
    public final View A0T;
    public final View A0U;
    public final ViewStub A0V;
    public final ViewStub A0W;
    public final ViewStub A0X;
    public final ViewStub A0Y;
    public final ViewStub A0Z;
    public final ViewStub A0a;
    public final ViewStub A0b;
    public final ViewStub A0c;
    public final ViewStub A0d;
    public final ViewStub A0e;
    public final TextView A0f;
    public final C71662eb A0g;
    public final C238133Ar A0h;
    public final C17526VZf A0i;
    public final C14176TrF A0j;
    public final C46434Dew A0k;

    public final void A00(UserSession userSession, boolean z) {
        C255773uh r0 = this.A0G;
        r0.getClass();
        if (!r0.A1Y()) {
            this.A0U.setVisibility(DbW.A01(z ? 1 : 0));
            ImageView imageView = this.A0B;
            if (imageView != null) {
                Context context = imageView.getContext();
                int i = R.attr.igds_color_primary_icon;
                if (z) {
                    i = R.attr.igds_color_primary_button;
                }
                DbU.A14(imageView.getContext(), imageView, 2Yu.A0H(context, i));
                imageView.setActivated(z);
            }
            this.A0f.setActivated(!z);
            if (z) {
                C14625TzX.A05(this);
                0nA.A0N(this.A0h.CEd());
                return;
            }
            C14625TzX.A04(userSession, this.A0F, this.A0I, this.A0J, this, this.A0O);
        }
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [X.07Z, X.4DH] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14629Tzb(android.view.View r28, X.AnonymousClass4DH r29, X.AnonymousClass0iw r30, com.instagram.common.session.UserSession r31, instagram.features.stories.dashboard.fragment.ReelDashboardFragment r32, boolean r33, boolean r34) {
        /*
            r27 = this;
            r5 = r27
            r5.<init>()
            r0 = 2131431295(0x7f0b0f7f, float:1.8484315E38)
            r6 = r28
            android.view.View r0 = r6.requireViewById(r0)
            r5.A0S = r0
            r0 = 2131431400(0x7f0b0fe8, float:1.8484528E38)
            android.view.View r0 = r6.requireViewById(r0)
            r5.A0T = r0
            r0 = 2131443877(0x7f0b40a5, float:1.8509835E38)
            android.widget.TextView r10 = X.DbU.A0G(r6, r0)
            r5.A0f = r10
            r0 = r34
            r5.A0Q = r0
            X.0Tu r9 = X.0Tu.A05
            r0 = 36322521242413288(0x810b24000028e8, double:3.0338469205310826E-306)
            r13 = r31
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r9, r13, r0)
            boolean r0 = r0.booleanValue()
            android.content.Context r11 = r10.getContext()
            r7 = 2131240312(0x7f082578, float:1.8096956E38)
            if (r0 == 0) goto L_0x0043
            r7 = 2131240313(0x7f082579, float:1.8096958E38)
        L_0x0043:
            int r12 = X.2Yu.A07(r11)
            r1 = 2131099701(0x7f060035, float:1.7811763E38)
            android.graphics.Paint r0 = X.AnonymousClass3JT.A00
            r3 = 0
            X.0qQ.A0B(r11, r3)
            r4 = 1
            r0 = 16843518(0x10102fe, float:2.3695705E-38)
            int[] r8 = new int[]{r0}
            int[] r0 = new int[r3]
            r2 = 2
            int[] r7 = new int[]{r7, r7}
            int[] r1 = new int[]{r1, r12}
            int[][] r0 = new int[][]{r8, r0}
            android.graphics.drawable.StateListDrawable r0 = X.AnonymousClass3JT.A09(r11, r7, r1, r0)
            r8 = 0
            r10.setCompoundDrawablesWithIntrinsicBounds(r0, r8, r8, r8)
            r1 = 1082130432(0x40800000, float:4.0)
            android.util.DisplayMetrics r0 = X.C13988Tno.A0F(r6)
            float r0 = r0.density
            float r0 = r0 * r1
            int r0 = (int) r0
            r5.A0R = r0
            r0 = 2131438901(0x7f0b2d35, float:1.8499742E38)
            android.view.ViewStub r0 = X.DbU.A0D(r6, r0)
            r5.A0c = r0
            r0 = 2131437000(0x7f0b25c8, float:1.8495886E38)
            android.view.ViewStub r0 = X.DbU.A0D(r6, r0)
            r5.A0Z = r0
            r0 = 2131439979(0x7f0b316b, float:1.8501928E38)
            android.view.ViewStub r0 = X.DbU.A0D(r6, r0)
            r5.A0d = r0
            X.Dew r7 = new X.Dew
            r11 = r29
            r7.<init>(r11, r13, r5)
            r5.A0k = r7
            X.2el r14 = X.C51969G9p.A0k()
            r0 = 36311766644359944(0x81015c00010308, double:3.0270456694168574E-306)
            boolean r19 = X.182.A06(r9, r13, r0)
            r1 = r11
            X.4DU r1 = (X.AnonymousClass4DU) r1
            X.2ww r0 = new X.2ww
            r0.<init>(r13, r1, r8)
            X.6nA r15 = new X.6nA
            r20 = r15
            r21 = r0
            r22 = r13
            r23 = r14
            r24 = r1
            r25 = r8
            r26 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26)
            com.facebook.common.callercontext.CallerContext r0 = X.C14176TrF.A11
            android.content.Context r10 = r6.getContext()
            X.TrF r9 = new X.TrF
            r12 = r30
            r17 = r32
            r18 = r33
            r16 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r5.A0j = r9
            r0 = 2131436124(0x7f0b225c, float:1.849411E38)
            android.view.ViewStub r1 = X.DbU.A0D(r6, r0)
            if (r33 == 0) goto L_0x00eb
            r0 = 2131627147(0x7f0e0c8b, float:1.888155E38)
            r1.setLayoutResource(r0)
        L_0x00eb:
            android.view.View r0 = r1.inflate()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.3Ar r8 = X.C238103Ao.A00(r0)
            r5.A0h = r8
            if (r33 == 0) goto L_0x0102
            android.view.ViewGroup r0 = r8.CEd()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.DbV.A1B(r10, r0)
        L_0x0102:
            r8.ENw(r9)
            r8.AHq()
            r8.AAD(r7)
            android.view.ViewGroup r0 = r8.CEd()
            r0.setSaveFromParentEnabled(r3)
            X.2eX r1 = new X.2eX
            r1.<init>(r6)
            android.view.ViewGroup r0 = r8.CEd()
            r14.A06(r0, r1)
            r0 = 2131443471(0x7f0b3f0f, float:1.8509011E38)
            android.view.ViewStub r0 = X.DbU.A0D(r6, r0)
            r5.A0e = r0
            r0 = 2131431411(0x7f0b0ff3, float:1.848455E38)
            android.view.ViewStub r0 = X.DbU.A0D(r6, r0)
            r5.A0X = r0
            r0 = 2131434772(0x7f0b1d14, float:1.8491367E38)
            android.view.ViewStub r0 = X.DbU.A0D(r6, r0)
            r5.A0Y = r0
            r0 = 2131438652(0x7f0b2c3c, float:1.8499237E38)
            android.view.ViewStub r0 = X.DbU.A0D(r6, r0)
            r5.A0b = r0
            r0 = 2131434774(0x7f0b1d16, float:1.8491371E38)
            android.view.View r3 = r6.requireViewById(r0)
            r5.A0U = r3
            r0 = 2131430334(0x7f0b0bbe, float:1.8482366E38)
            android.view.ViewStub r0 = X.DbU.A0D(r6, r0)
            r5.A0W = r0
            r0 = 2131437286(0x7f0b26e6, float:1.8496466E38)
            android.view.ViewStub r0 = X.DbU.A0D(r6, r0)
            r5.A0a = r0
            r0 = 2131429509(0x7f0b0885, float:1.8480693E38)
            android.view.ViewStub r0 = X.DbU.A0D(r6, r0)
            r5.A0V = r0
            r0 = 2131431298(0x7f0b0f82, float:1.8484321E38)
            X.2eb r0 = X.DbY.A0S(r6, r0)
            r5.A0g = r0
            r0 = 2131429393(0x7f0b0811, float:1.8480457E38)
            android.view.ViewStub r1 = X.DbU.A0D(r6, r0)
            X.VZf r0 = new X.VZf
            r0.<init>(r1)
            r5.A0i = r0
            int r1 = X.C14625TzX.A0H
            int r0 = r1 + 1
            X.C14625TzX.A0H = r0
            if (r1 == 0) goto L_0x01ce
            if (r1 == r4) goto L_0x01ca
            if (r1 == r2) goto L_0x01c6
            r2 = 3
            if (r1 == r2) goto L_0x01b5
            r2 = 4
            if (r1 == r2) goto L_0x01a4
            r2 = 5
            java.lang.String r1 = "Setting id for Insights container ["
            java.lang.String r0 = "]"
            java.lang.String r1 = X.002.A0c(r1, r0, r2)
            java.lang.String r0 = "ReelDashboardListAdapter"
            X.0wb.A03(r0, r1)
            r0 = 2131441932(0x7f0b390c, float:1.850589E38)
        L_0x01a0:
            r3.setId(r0)
            return
        L_0x01a4:
            java.lang.String r1 = "Setting id for Insights container ["
            java.lang.String r0 = "]"
            java.lang.String r1 = X.002.A0c(r1, r0, r2)
            java.lang.String r0 = "ReelDashboardListAdapter"
            X.0wb.A03(r0, r1)
            r0 = 2131441931(0x7f0b390b, float:1.8505888E38)
            goto L_0x01a0
        L_0x01b5:
            java.lang.String r1 = "Setting id for Insights container ["
            java.lang.String r0 = "]"
            java.lang.String r1 = X.002.A0c(r1, r0, r2)
            java.lang.String r0 = "ReelDashboardListAdapter"
            X.0wb.A03(r0, r1)
            r0 = 2131441930(0x7f0b390a, float:1.8505886E38)
            goto L_0x01a0
        L_0x01c6:
            r0 = 2131441929(0x7f0b3909, float:1.8505883E38)
            goto L_0x01a0
        L_0x01ca:
            r0 = 2131441928(0x7f0b3908, float:1.8505881E38)
            goto L_0x01a0
        L_0x01ce:
            r0 = 2131441927(0x7f0b3907, float:1.850588E38)
            goto L_0x01a0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14629Tzb.<init>(android.view.View, X.4DH, X.0iw, com.instagram.common.session.UserSession, instagram.features.stories.dashboard.fragment.ReelDashboardFragment, boolean, boolean):void");
    }

    public final boolean CJz() {
        return !this.A0j.isEmpty();
    }

    public final void CgO() {
        ReelDashboardFragment reelDashboardFragment = this.A0O;
        reelDashboardFragment.getClass();
        String str = this.A0P;
        String str2 = this.A0k.A00;
        C255773uh r0 = this.A0G;
        r0.getClass();
        boolean z = r0.A0N;
        C255773uh r02 = this.A0G;
        r02.getClass();
        boolean A0q = r02.A0q();
        if (z) {
            ReelDashboardFragment.A08(new C19860Wgm(reelDashboardFragment, str), reelDashboardFragment, str, str2, false);
        } else {
            ReelDashboardFragment.A09(new C19862Wgo(reelDashboardFragment, str), reelDashboardFragment, str, str2, false, A0q, false);
        }
    }

    public final void DhN() {
        ReelDashboardFragment reelDashboardFragment;
        if (this.A0Q && (reelDashboardFragment = this.A0O) != null) {
            reelDashboardFragment.A0G();
        }
    }
}
