package instagram.features.feed.fragment;

import X.0Tu;
import X.0bH;
import X.0jB;
import X.0mp;
import X.0qQ;
import X.11Z;
import X.14i;
import X.182;
import X.1CE;
import X.1G0;
import X.1G7;
import X.1L2;
import X.1NM;
import X.1NS;
import X.1NY;
import X.1Ng;
import X.1OP;
import X.1Xj;
import X.1Xl;
import X.1wY;
import X.1wn;
import X.2EG;
import X.2dZ;
import X.2el;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0j6;
import X.AnonymousClass0wW;
import X.AnonymousClass1L1;
import X.AnonymousClass1NR;
import X.AnonymousClass1Nd;
import X.AnonymousClass1O8;
import X.AnonymousClass1O9;
import X.AnonymousClass1YB;
import X.AnonymousClass2ZP;
import X.AnonymousClass2l3;
import X.AnonymousClass2oD;
import X.AnonymousClass2rW;
import X.AnonymousClass2xS;
import X.AnonymousClass332;
import X.AnonymousClass36D;
import X.AnonymousClass3AR;
import X.AnonymousClass3AS;
import X.AnonymousClass3DT;
import X.AnonymousClass3KD;
import X.AnonymousClass3KG;
import X.AnonymousClass3KN;
import X.AnonymousClass3KQ;
import X.AnonymousClass3OA;
import X.AnonymousClass3WS;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass4DT;
import X.AnonymousClass4DU;
import X.AnonymousClass4DV;
import X.AnonymousClass4M3;
import X.AnonymousClass4Z5;
import X.AnonymousClass4Zh;
import X.AnonymousClass57N;
import X.AnonymousClass57T;
import X.AnonymousClass818;
import X.AnonymousClass9LY;
import X.C14005To7;
import X.C18654Vw9;
import X.C22338Xzn;
import X.C227252iu;
import X.C227282ix;
import X.C227332j2;
import X.C227642jf;
import X.C227762js;
import X.C227812jx;
import X.C228092km;
import X.C228102kn;
import X.C228362lW;
import X.C229122ms;
import X.C229132mt;
import X.C229382nI;
import X.C230882qT;
import X.C231002qi;
import X.C231272rL;
import X.C232682uF;
import X.C233292vT;
import X.C233812wV;
import X.C234422xq;
import X.C2355030c;
import X.C2355930l;
import X.C2370436c;
import X.C2370736f;
import X.C2370836g;
import X.C2372036s;
import X.C238123Aq;
import X.C238133Ar;
import X.C238143As;
import X.C240053Jk;
import X.C240063Jl;
import X.C240083Jn;
import X.C246353eS;
import X.C249383je;
import X.C249763kK;
import X.C252223ol;
import X.C266514Zg;
import X.C271774jZ;
import X.C271794jb;
import X.C278474ww;
import X.C324466zK;
import X.C324636ze;
import X.C52470GTw;
import X.C52484GUm;
import X.C52761GcE;
import X.C54771HSd;
import X.C55499Hih;
import X.C56821IDs;
import X.C57066INg;
import X.C57067INh;
import X.C57073INn;
import X.C57075INp;
import X.C59722JVg;
import X.C61110lV;
import X.C64546Ldn;
import X.C66986MgK;
import X.EEQ;
import X.FWN;
import X.GAQ;
import X.GAR;
import X.GMC;
import X.GTW;
import X.GU0;
import X.GUI;
import X.GUJ;
import X.GUK;
import X.GUL;
import X.GUM;
import X.HCA;
import X.HDB;
import X.JRI;
import X.Q02;
import X.Q03;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.List;
import java.util.UUID;

public final class ContextualFeedFragment extends C227812jx implements C249763kK, C229122ms, C61110lV, AnonymousClass4DV, C232682uF, AnonymousClass4DR, C266514Zg, C229132mt, C227252iu, AnonymousClass0j6, AnonymousClass4DS, AnonymousClass4DT, C227282ix, C252223ol, AnonymousClass4Zh, C227332j2, C233292vT {
    public int A00 = -1;
    public int A01;
    public int A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public C227762js A06;
    public C22338Xzn A07;
    public C18654Vw9 A08;
    public 0jB A09;
    public JRI A0A;
    public GAR A0B;
    public AnonymousClass36D A0C;
    public C55499Hih A0D;
    public C228362lW A0E;
    public 1Xl A0F;
    public GAQ A0G;
    public C324466zK A0H;
    public UserDetailFragment A0I;
    public C231002qi A0J;
    public C230882qT A0K;
    public C233812wV A0L;
    public AnonymousClass1L1 A0M;
    public HDB A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public List A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public int A0Y;
    public int A0Z;
    public int A0a = -1;
    public C240083Jn A0b;
    public 2dZ A0c;
    public C229382nI A0d;
    public C59722JVg A0e;
    public 1wn A0f;
    public 1wn A0g;
    public 1wn A0h;
    public 1wn A0i;
    public 1wn A0j;
    public AnonymousClass3KG A0k;
    public AnonymousClass3KQ A0l;
    public 2el A0m;
    public C52761GcE A0n;
    public AnonymousClass57N A0o;
    public C2355030c A0p;
    public EEQ A0q;
    public AnonymousClass332 A0r;
    public AnonymousClass2oD A0s;
    public ContextualFeedNetworkConfig A0t;
    public GMC A0u;
    public C234422xq A0v;
    public C2372036s A0w;
    public SearchContext A0x;
    public HCA A0y;
    public C52484GUm A0z;
    public Long A10;
    public String A11;
    public String A12;
    public String A13;
    public String A14;
    public String A15;
    public String A16;
    public String A17;
    public boolean A18;
    public boolean A19 = true;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public final GTW A1H = new GTW();
    public final String A1I = 1L2.A00().A00;
    public final AnonymousClass0eM A1J = AnonymousClass0eN.A01(new AnonymousClass9LY(this, 22));
    public final 1wn A1K = new GUJ(this);
    public final 1wn A1L = new GUM(this);
    public final 1wn A1M = new GUK(this);
    public final 1wn A1N = new GUI(this);
    public final C14005To7 A1O = new C14005To7();
    public final AnonymousClass57T A1P = new GUL(this);
    public final C249383je A1Q = new C52470GTw(this);
    public final C66986MgK A1R = new C66986MgK(this);
    public final AnonymousClass0eM A1S = AnonymousClass1YB.A00(new AnonymousClass9LY(this, 23));
    public final AnonymousClass0eM A1T = C227642jf.A02(this);
    public View mContextualFeedContainer;

    public final void CgO() {
        A03(this, false, false);
    }

    public final void D2K(IgImageView igImageView, 1Xl r9, int i, int i2, boolean z, boolean z2) {
        0qQ.A0B(r9, 0);
        0qQ.A0B(igImageView, 3);
        C271794jb r4 = new C271794jb(A00(this), r9);
        r4.A00 = i2;
        r4.A01 = i;
        1Xj BPf = r9.BPf();
        Q03 q03 = new Q03(this, A00(this), r4, this, 2EG.A1p);
        q03.A01(BPf);
        q03.A09 = i2;
        q03.A0B = i;
        q03.A00(igImageView, r4, BPf);
        if (r9 instanceof AnonymousClass3OA) {
            q03.A0O = (AnonymousClass3OA) r9;
        }
        new Q02(q03).A02();
    }

    public final void Dk4() {
    }

    public final 0jB E4l(1Xj r4) {
        0qQ.A0B(r4, 0);
        0jB E4k = E4k();
        User A2A = r4.A2A(A00(this));
        if (A2A != null) {
            GU0.A00(E4k, A2A);
        }
        E4k.A04(C271774jZ.A1C, this.A1I);
        Long l = this.A10;
        if (l != null) {
            E4k.A04(C271774jZ.A8J, String.valueOf(l));
        }
        String str = this.A17;
        if (str != null) {
            E4k.A04(C271774jZ.A8K, str);
        }
        return E4k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ef, code lost:
        if ((r2 instanceof com.instagram.modal.ModalActivity) != false) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r9) {
        /*
            r8 = this;
            r3 = 0
            X.0qQ.A0B(r9, r3)
            X.0hq r4 = r8.mFragmentManager
            if (r4 == 0) goto L_0x00c9
            android.content.Context r0 = r8.requireContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenWidthDp
            java.lang.Integer r0 = X.AnonymousClass2YH.A00(r0)
            boolean r2 = X.2Y9.A02(r0)
            android.os.Bundle r1 = r8.requireArguments()
            java.lang.String r0 = "ContextualFeedFragment.ARGUMENT_CONTEXTUAL_FEED_MODE"
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r7 = "contextualFeedController"
            if (r2 == 0) goto L_0x00df
            java.lang.String r5 = "Favorites_Feed"
            boolean r0 = X.0qQ.A0K(r1, r5)
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "Following_Feed"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00df
        L_0x003c:
            r1 = 2131623991(0x7f0e0037, float:1.887515E38)
            com.instagram.common.session.UserSession r0 = A00(r8)
            android.view.View r3 = r9.ETj(r0, r1, r3, r3)
            r0 = 2131427555(0x7f0b00e3, float:1.847673E38)
            android.view.View r1 = r3.requireViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.FOo r0 = X.C50098FOo.A00
            X.AnonymousClass0fU.A00(r0, r1)
            r8.A05 = r1
            r0 = 2131427554(0x7f0b00e2, float:1.8476728E38)
            android.view.View r2 = r3.requireViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.String r6 = "Following_Feed"
            X.IBg r0 = new X.IBg
            r0.<init>(r8, r1, r6)
            X.AnonymousClass0fU.A00(r0, r2)
            r8.A04 = r2
            r0 = 2131427553(0x7f0b00e1, float:1.8476725E38)
            android.view.View r2 = r3.requireViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.IBg r0 = new X.IBg
            r0.<init>(r8, r1, r5)
            X.AnonymousClass0fU.A00(r0, r2)
            r8.A03 = r2
            android.content.Context r1 = r8.requireContext()
            android.content.Context r0 = r8.requireContext()
            int r0 = X.2Yu.A07(r0)
            int r4 = r1.getColor(r0)
            android.content.Context r1 = r8.requireContext()
            android.content.Context r0 = r8.requireContext()
            int r0 = X.2Yu.A08(r0)
            int r3 = r1.getColor(r0)
            java.lang.String r2 = r8.A0O
            boolean r0 = r6.equals(r2)
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x00ca
            android.widget.TextView r0 = r8.A04
            if (r0 == 0) goto L_0x0151
            r0.setTextColor(r4)
            android.widget.TextView r0 = r8.A03
            if (r0 == 0) goto L_0x014b
            r0.setTextColor(r3)
        L_0x00bb:
            android.widget.TextView r0 = r8.A05
            if (r0 == 0) goto L_0x0145
            r0.setTextColor(r3)
        L_0x00c2:
            X.GAR r0 = r8.A0B
            if (r0 == 0) goto L_0x0127
            r0.A0F(r9)
        L_0x00c9:
            return
        L_0x00ca:
            boolean r0 = r5.equals(r2)
            if (r0 == 0) goto L_0x00bb
            android.widget.TextView r0 = r8.A04
            if (r0 == 0) goto L_0x015d
            r0.setTextColor(r3)
            android.widget.TextView r0 = r8.A03
            if (r0 == 0) goto L_0x0157
            r0.setTextColor(r4)
            goto L_0x00bb
        L_0x00df:
            r9.ErT(r8)
            androidx.fragment.app.FragmentActivity r2 = r8.getActivity()
            int r0 = r4.A0M()
            if (r0 > 0) goto L_0x00f1
            boolean r1 = r2 instanceof com.instagram.modal.ModalActivity
            r0 = 0
            if (r1 == 0) goto L_0x00f2
        L_0x00f1:
            r0 = 1
        L_0x00f2:
            r9.Eu4(r0)
            android.os.Bundle r1 = r8.requireArguments()
            java.lang.String r0 = "ContextualFeedFragment.ARGUMENT_FEED_TITLE"
            java.lang.String r0 = r1.getString(r0)
            r9.setTitle(r0)
            android.os.Bundle r1 = r8.requireArguments()
            java.lang.String r0 = "ContextualFeedFragment.ARGUMENT_FEED_SUBTITLE"
            java.lang.String r0 = r1.getString(r0)
            r9.EnO(r0)
            X.GUG r0 = new X.GUG
            r0.<init>(r8)
            r9.Eoo(r0)
            X.GAR r0 = r8.A0B
            if (r0 == 0) goto L_0x0127
            boolean r0 = r0.A0e()
            if (r0 == 0) goto L_0x0132
            X.2dZ r0 = r8.A0c
            if (r0 != 0) goto L_0x012f
            java.lang.String r7 = "actionBarService"
        L_0x0127:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x012f:
            r0.Epe()
        L_0x0132:
            java.lang.String r0 = r8.A0T
            if (r0 == 0) goto L_0x00c2
            if (r2 == 0) goto L_0x00c2
            r1 = 2131960992(0x7f1324a0, float:1.9558668E38)
            X.ANE r0 = new X.ANE
            r0.<init>(r2)
            r9.AA9(r0, r1)
            goto L_0x00c2
        L_0x0145:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x014b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0151:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0157:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x015d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.feed.fragment.ContextualFeedFragment.configureActionBar(X.2da):void");
    }

    public final void onConfigurationChanged(Configuration configuration) {
        ViewTreeObserver viewTreeObserver;
        0qQ.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        View view = this.mView;
        if (!(view == null || (viewTreeObserver = view.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(new C56821IDs(view, this));
        }
        HDB hdb = this.A0N;
        if (hdb == null) {
            0qQ.A0F("adapter");
            throw AnonymousClass00P.createAndThrow();
        } else {
            hdb.notifyDataSetChangedSmart(configuration);
        }
    }

    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        UserSession A002 = A00(this);
        0qQ.A0B(A002, 0);
        if (182.A06(0Tu.A05, A002, 36323045228882703L)) {
            recyclerView.setItemAnimator((AnonymousClass3AS) null);
            return;
        }
        AnonymousClass3AS r1 = recyclerView.A0C;
        if (r1 instanceof AnonymousClass3AR) {
            ((AnonymousClass3AR) r1).A00 = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: X.2mt} */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0423, code lost:
        if ((r3.A03().size() - r5) <= ((java.lang.Number) r0.A1J.getValue()).intValue()) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0247, code lost:
        if (r3.A03().size() <= ((java.lang.Number) r0.A1J.getValue()).intValue()) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0249, code lost:
        ACw();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            r23 = this;
            r1 = 0
            r2 = r24
            X.0qQ.A0B(r2, r1)
            X.3Dj r4 = X.C238773Dj.A00
            r0 = r23
            com.instagram.common.session.UserSession r3 = A00(r0)
            java.util.List r9 = r4.A00(r2, r3)
            X.2el r7 = r0.A0m
            if (r7 != 0) goto L_0x0020
            java.lang.String r13 = "viewPointManager"
        L_0x0018:
            X.0qQ.A0F(r13)
        L_0x001b:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0020:
            X.3DZ r6 = X.AnonymousClass3DZ.A00(r0)
            r3 = 2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
            X.2dZ r3 = r0.A0c
            java.lang.String r12 = "actionBarService"
            if (r3 == 0) goto L_0x0474
            android.view.ViewGroup r4 = r3.A0P
            r8 = 1
            X.3Dk r3 = new X.3Dk
            r3.<init>(r4)
            r5.add(r3)
            X.2eo[] r3 = new X.AnonymousClass2eo[r1]
            java.lang.Object[] r3 = r9.toArray(r3)
            X.0tw.A00(r3, r5)
            int r3 = r5.size()
            X.2eo[] r3 = new X.AnonymousClass2eo[r3]
            java.lang.Object[] r3 = r5.toArray(r3)
            X.2eo[] r3 = (X.AnonymousClass2eo[]) r3
            r7.A07(r2, r6, r3)
            X.6zK r3 = r0.A0H
            if (r3 == 0) goto L_0x00b0
            X.1Xl r3 = r0.A0F
            if (r3 == 0) goto L_0x00b0
            android.view.View r10 = r0.mContextualFeedContainer
            java.lang.String r7 = "Required value was null."
            if (r10 == 0) goto L_0x0485
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            android.content.Context r4 = r0.requireContext()
            com.instagram.common.session.UserSession r3 = A00(r0)
            X.GTF r9 = new X.GTF
            r9.<init>(r4, r3, r0)
            com.instagram.common.session.UserSession r3 = A00(r0)
            X.GTH r11 = new X.GTH
            r11.<init>(r3, r0, r0)
            int r4 = r0.A02
            int r3 = r0.A01
            X.GTG r6 = new X.GTG
            r6.<init>(r4, r3)
            X.GTC r5 = X.GTF.A04
            android.content.Context r4 = r0.requireContext()
            com.instagram.common.session.UserSession r3 = A00(r0)
            android.view.View r5 = r5.A01(r4, r10, r3)
            java.lang.Object r4 = r5.getTag()
            if (r4 == 0) goto L_0x047f
            X.GTD r4 = (X.GTD) r4
            X.1Xl r3 = r0.A0F
            if (r3 == 0) goto L_0x0479
            X.Jw9 r3 = r11.A00(r3, r6)
            r9.A00(r3, r4)
            r10.addView(r5)
            r10.invalidate()
            X.6zK r3 = r0.A0H
            if (r3 == 0) goto L_0x00b0
            r3.A02(r5)
        L_0x00b0:
            boolean r3 = r0.A0X
            if (r3 == 0) goto L_0x012c
            com.instagram.common.session.UserSession r3 = A00(r0)
            X.Hic r7 = new X.Hic
            r7.<init>(r3)
            com.instagram.common.session.UserSession r6 = r7.A00
            X.0Tu r5 = X.0Tu.A05
            r3 = 36330604371002053(0x81127e000242c5, double:3.038958723598764E-306)
            boolean r6 = X.182.A06(r5, r6, r3)
            r3 = 22
            X.J6H r5 = new X.J6H
            r5.<init>(r7, r3)
            r3 = 18
            X.JwG r4 = new X.JwG
            r4.<init>((java.lang.Object) r5, (int) r3)
            r3 = 27
            X.JwK r7 = new X.JwK
            r7.<init>((int) r3, (java.lang.Object) r4, (boolean) r6)
            boolean r3 = r7.A01
            if (r3 == 0) goto L_0x012c
            r3 = 2131432737(0x7f0b1521, float:1.848724E38)
            android.view.View r3 = r2.requireViewById(r3)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.view.View r4 = r3.inflate()
            r4.setVisibility(r1)
            r3 = 2131436364(0x7f0b234c, float:1.8494596E38)
            android.view.View r6 = r4.requireViewById(r3)
            X.0qQ.A07(r6)
            com.facebook.litho.LithoView r6 = (com.facebook.litho.LithoView) r6
            X.GAR r4 = r0.A0B
            if (r4 == 0) goto L_0x046b
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            int r5 = r4.A04(r3)
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r4, r3)
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            r4.topMargin = r5
            r6.setLayoutParams(r4)
            X.Wvo r5 = new X.Wvo
            r5.<init>(r7, r8)
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            X.Gs2 r3 = new X.Gs2
            r3.<init>(r4, r5)
            r6.setComponentAsync(r3)
        L_0x012c:
            r3 = 2131439764(0x7f0b3094, float:1.8501492E38)
            android.view.View r5 = r2.requireViewById(r3)
            X.0qQ.A07(r5)
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r5 = (com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent) r5
            X.GAR r4 = r0.A0B
            if (r4 == 0) goto L_0x046b
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            int r3 = r4.A04(r3)
            r5.A02 = r3
            X.HDB r3 = r0.A0N
            java.lang.String r13 = "adapter"
            if (r3 == 0) goto L_0x0018
            r0.setAdapter(r3)
            X.HDB r3 = r0.A0N
            if (r3 == 0) goto L_0x0018
            X.2u0 r4 = r3.A02()
            if (r4 == 0) goto L_0x015e
            X.GTW r3 = r0.A1H
            r3.EBt(r4)
        L_0x015e:
            java.lang.String r4 = r0.A0O
            java.lang.String r3 = "BUSINESS_INSPIRATION_HUB"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x044f
            com.instagram.common.session.UserSession r3 = A00(r0)
            X.Xzn r3 = X.C319596qs.A02(r3)
            r0.A07 = r3
            X.UzE r3 = X.C16678UzE.FEED_CONTEXTUAL_INSPIRATION_HUB
            X.Vw9 r5 = new X.Vw9
            r5.<init>(r2, r3)
            r5.A01()
            java.lang.String r4 = r0.A0P
            X.FTo r3 = new X.FTo
            r3.<init>(r5, r0)
            X.C18165Vmf.A01(r3, r5, r4)
            r0.A08 = r5
        L_0x0188:
            java.lang.String r4 = r0.getModuleName()
            java.lang.String r3 = "feed_contextual_messaging_ad_inspiration"
            boolean r3 = X.0qQ.A0K(r4, r3)
            java.lang.String r11 = "_helper"
            java.lang.String r10 = "contextualFeedController"
            if (r3 == 0) goto L_0x0432
            boolean r3 = r0.A0X
            if (r3 == 0) goto L_0x0432
            X.2js r5 = r0.A06
            if (r5 == 0) goto L_0x046f
            X.3Ar r4 = r0.getScrollingViewProxy()
            X.HDB r3 = r0.A0N
            if (r3 == 0) goto L_0x0018
            r5.A06(r3, r4, r1)
        L_0x01ab:
            X.GAR r3 = r0.A0B
            if (r3 == 0) goto L_0x01f7
            boolean r3 = r3.A0R()
            X.3Ar r4 = r0.getScrollingViewProxy()
            X.3As r4 = (X.C238143As) r4
            if (r3 == 0) goto L_0x042b
            if (r4 == 0) goto L_0x01c5
            X.IgZ r3 = new X.IgZ
            r3.<init>(r0)
            r4.ErF(r3)
        L_0x01c5:
            r3 = r25
            super.onViewCreated(r2, r3)
            X.HDB r3 = r0.A0N
            if (r3 == 0) goto L_0x0018
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x01d7
            A02(r0)
        L_0x01d7:
            X.3Ar r4 = r0.getScrollingViewProxy()
            X.3je r3 = r0.A1Q
            r4.AAD(r3)
            X.GAR r3 = r0.A0B
            if (r3 == 0) goto L_0x01f7
            boolean r3 = r3.A0b()
            if (r3 == 0) goto L_0x0224
            X.3Ar r6 = r0.getScrollingViewProxy()
            com.instagram.common.session.UserSession r14 = A00(r0)
            X.HDB r5 = r0.A0N
            if (r5 != 0) goto L_0x01fc
            r10 = r13
        L_0x01f7:
            X.0qQ.A0F(r10)
            goto L_0x001b
        L_0x01fc:
            java.lang.Integer r18 = X.AnonymousClass05K.A01
            X.0eM r3 = r0.A1J
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r19 = r3.intValue()
            X.GAR r4 = r0.A0B
            if (r4 == 0) goto L_0x01f7
            boolean r3 = r4 instanceof X.C52767GcK
            if (r3 != 0) goto L_0x0427
            boolean r3 = r4 instanceof X.C54377HAs
            if (r3 != 0) goto L_0x0427
            r20 = 1
        L_0x0218:
            r17 = 0
            r15 = r0
            r16 = r5
            X.TsD r3 = X.C14293TtR.A00(r14, r15, r16, r17, r18, r19, r20)
            r6.AAD(r3)
        L_0x0224:
            X.GAR r3 = r0.A0B
            r15 = 0
            if (r3 == 0) goto L_0x01f7
            boolean r3 = r3.A0Z()
            if (r3 == 0) goto L_0x03bb
            X.HDB r3 = r0.A0N
            if (r3 == 0) goto L_0x0018
            java.util.List r3 = r3.A03()
            int r4 = r3.size()
            X.0eM r3 = r0.A1J
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r4 > r3) goto L_0x03bb
        L_0x0249:
            r0.ACw()
        L_0x024c:
            X.332 r4 = r0.A0r
            if (r4 == 0) goto L_0x0255
            X.GTW r3 = r0.A1H
            r3.EBt(r4)
        L_0x0255:
            boolean r3 = r0.CbJ()
            if (r3 == 0) goto L_0x02d0
            X.GTW r5 = r0.A1H
            X.2js r3 = r0.A06
            if (r3 == 0) goto L_0x046f
            r5.EBt(r3)
            X.GAR r3 = r0.A0B
            if (r3 == 0) goto L_0x01f7
            boolean r3 = r3.A0e()
            if (r3 == 0) goto L_0x02d0
            X.2dZ r9 = r0.A0c
            if (r9 == 0) goto L_0x0474
            android.content.Context r8 = r0.requireContext()
            com.instagram.common.session.UserSession r7 = A00(r0)
            X.0qQ.A0B(r7, r1)
            X.0Tu r6 = X.0Tu.A05
            r3 = 37161985486225623(0x8406a1000e00d7, double:3.5647274885691945E-306)
            double r3 = X.182.A00(r6, r7, r3)
            android.graphics.drawable.GradientDrawable$Orientation r6 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            android.graphics.drawable.GradientDrawable r4 = X.GIZ.A00(r8, r6, r3)
            android.view.View r3 = r9.A0N
            r3.setBackground(r4)
            com.instagram.common.session.UserSession r19 = A00(r0)
            androidx.fragment.app.FragmentActivity r17 = r0.requireActivity()
            X.2dZ r3 = r0.A0c
            if (r3 == 0) goto L_0x0474
            android.view.View r4 = r3.A03
            android.view.View r3 = r3.A0N
            android.view.View[] r3 = new android.view.View[]{r4, r3}
            java.util.List r20 = X.0sr.A1P(r3)
            X.2js r6 = r0.A06
            if (r6 == 0) goto L_0x046f
            X.GAR r4 = r0.A0B
            if (r4 == 0) goto L_0x01f7
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            int r21 = r4.A04(r3)
            X.HCA r4 = new X.HCA
            r16 = r4
            r18 = r6
            r22 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r5.EBt(r4)
            X.0h9 r3 = r0.mLifecycleRegistry
            r3.A09(r4)
            r0.A0y = r4
        L_0x02d0:
            com.instagram.common.session.UserSession r3 = A00(r0)
            X.1Ng r5 = X.AnonymousClass1Nd.A00(r3)
            java.lang.Class<X.3DT> r4 = X.AnonymousClass3DT.class
            X.1wn r3 = r0.A1L
            r5.A01(r3, r4)
            boolean r3 = r0.A1A
            if (r3 == 0) goto L_0x032a
            boolean r3 = r0.A1E
            com.instagram.common.session.UserSession r14 = A00(r0)
            android.content.Context r12 = r0.requireContext()
            X.2js r13 = r0.A06
            if (r3 == 0) goto L_0x0386
            if (r13 == 0) goto L_0x046f
            java.lang.String r5 = r0.getModuleName()
            X.GAR r4 = r0.A0B
            if (r4 == 0) goto L_0x01f7
            android.content.Context r3 = r0.requireContext()
            int r17 = r4.A04(r3)
            X.0qQ.A0B(r14, r1)
            r3 = 3
            X.0qQ.A0B(r5, r3)
            X.GcE r11 = new X.GcE
            r18 = r17
            r19 = r1
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0315:
            r0.A0n = r11
            X.3Ar r4 = r0.getScrollingViewProxy()
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RecyclerViewProxy<*>"
            X.0qQ.A0C(r4, r3)
            X.3Aq r4 = (X.C238123Aq) r4
            X.GcA r3 = new X.GcA
            r3.<init>(r0)
            r11.A05(r3, r15, r4)
        L_0x032a:
            X.GUm r5 = r0.A0z
            if (r5 == 0) goto L_0x0358
            X.0xi r4 = X.0tS.A4E
            android.content.Context r3 = r2.getContext()
            X.0qQ.A07(r3)
            X.0tS r3 = r4.A01(r3)
            boolean r3 = r3.A0T()
            if (r3 == 0) goto L_0x0358
            r3 = 2131441598(0x7f0b37be, float:1.8505212E38)
            android.view.View r2 = r2.requireViewById(r3)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            android.view.View r3 = r2.inflate()
            X.0qQ.A07(r3)
            X.VvI r2 = r5.A00
            if (r2 == 0) goto L_0x0358
            r2.A02(r3)
        L_0x0358:
            X.57N r5 = r0.A0o
            if (r5 == 0) goto L_0x0380
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            android.app.Application r4 = r2.getApplication()
            X.0qQ.A07(r4)
            com.instagram.common.session.UserSession r3 = A00(r0)
            X.Ghi r2 = new X.Ghi
            r2.<init>(r4, r3, r5)
            X.2YN r3 = new X.2YN
            r3.<init>(r2, r0)
            java.lang.Class<X.Jfg> r2 = X.C60100Jfg.class
            X.2YL r2 = r3.A00(r2)
            X.Jfg r2 = (X.C60100Jfg) r2
            X.C56585I2p.A00(r0, r2)
        L_0x0380:
            X.15Y r2 = X.15Y.A02
            X.14i.A04(r2, r0, r1, r1)
            return
        L_0x0386:
            if (r13 == 0) goto L_0x046f
            java.lang.String r5 = r0.getModuleName()
            X.GAR r3 = r0.A0B
            if (r3 == 0) goto L_0x01f7
            boolean r3 = r3.A0e()
            if (r3 == 0) goto L_0x03b8
            X.GAR r4 = r0.A0B
            if (r4 == 0) goto L_0x01f7
            android.content.Context r3 = r0.requireContext()
            int r17 = r4.A04(r3)
        L_0x03a2:
            X.0qQ.A0B(r14, r1)
            r3 = 3
            X.0qQ.A0B(r5, r3)
            int r18 = X.AnonymousClass3D4.A00(r12)
            X.GcE r11 = new X.GcE
            r19 = r1
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0315
        L_0x03b8:
            r17 = 0
            goto L_0x03a2
        L_0x03bb:
            java.lang.String r3 = r0.A0S
            if (r3 == 0) goto L_0x024c
            X.GAR r3 = r0.A0B
            if (r3 == 0) goto L_0x01f7
            boolean r3 = r3.A0Z()
            if (r3 == 0) goto L_0x024c
            java.lang.String r9 = r0.A0S
            if (r9 == 0) goto L_0x024c
            X.HDB r3 = r0.A0N
            if (r3 == 0) goto L_0x0018
            java.util.List r3 = r3.A03()
            r8 = 0
            java.util.Iterator r7 = r3.iterator()
            r6 = -1
            r5 = -1
        L_0x03dc:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0408
            java.lang.Object r3 = r7.next()
            int r4 = r8 + 1
            if (r8 >= 0) goto L_0x03ef
            X.0sr.A1T()
            goto L_0x001b
        L_0x03ef:
            X.1Xg r3 = (X.1Xg) r3
            X.1Xn r3 = r3.A05
            X.1Xj r3 = X.1Xi.A02(r3)
            if (r3 == 0) goto L_0x0406
            java.lang.String r3 = r3.getId()
        L_0x03fd:
            boolean r3 = X.0qQ.A0K(r3, r9)
            if (r3 == 0) goto L_0x0404
            r5 = r8
        L_0x0404:
            r8 = r4
            goto L_0x03dc
        L_0x0406:
            r3 = r15
            goto L_0x03fd
        L_0x0408:
            if (r5 == r6) goto L_0x024c
            X.HDB r3 = r0.A0N
            if (r3 == 0) goto L_0x0018
            java.util.List r3 = r3.A03()
            int r4 = r3.size()
            int r4 = r4 - r5
            X.0eM r3 = r0.A1J
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r4 > r3) goto L_0x024c
            goto L_0x0249
        L_0x0427:
            r20 = 0
            goto L_0x0218
        L_0x042b:
            if (r4 == 0) goto L_0x01c5
            r4.APL()
            goto L_0x01c5
        L_0x0432:
            X.2js r7 = r0.A06
            if (r7 == 0) goto L_0x046f
            X.3Ar r6 = r0.getScrollingViewProxy()
            X.HDB r5 = r0.A0N
            if (r5 == 0) goto L_0x0018
            X.GAR r4 = r0.A0B
            if (r4 == 0) goto L_0x01f7
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            int r3 = r4.A04(r3)
            r7.A06(r5, r6, r3)
            goto L_0x01ab
        L_0x044f:
            java.lang.String r3 = "SCHEDULED_CONTENT"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0188
            X.JVg r5 = r0.A0e
            if (r5 == 0) goto L_0x0188
            com.instagram.common.session.UserSession r3 = A00(r0)
            X.LPH r4 = new X.LPH
            r4.<init>(r5, r0, r3)
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            r4.A06(r3)
            goto L_0x0188
        L_0x046b:
            java.lang.String r10 = "contextualFeedController"
            goto L_0x01f7
        L_0x046f:
            X.0qQ.A0F(r11)
            goto L_0x001b
        L_0x0474:
            X.0qQ.A0F(r12)
            goto L_0x001b
        L_0x0479:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x047f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0485:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.feed.fragment.ContextualFeedFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final UserSession A00(ContextualFeedFragment contextualFeedFragment) {
        return (UserSession) contextualFeedFragment.A1T.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(instagram.features.feed.fragment.ContextualFeedFragment r9) {
        /*
            boolean r0 = r9.A19
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = r9.A0S
            r6 = 0
            if (r0 == 0) goto L_0x008c
            int r0 = r0.length()
            if (r0 == 0) goto L_0x008c
            r9.A19 = r6
            X.2js r1 = r9.A06
            if (r1 != 0) goto L_0x001f
            java.lang.String r0 = "_helper"
        L_0x0017:
            X.0qQ.A0F(r0)
        L_0x001a:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001f:
            r0 = 1
            X.C227762js.A01(r1, r0)
            X.3Ar r4 = r9.getScrollingViewProxy()
            java.lang.String r7 = r9.A0S
            if (r7 == 0) goto L_0x007b
            X.HDB r0 = r9.A0N
            java.lang.String r8 = "adapter"
            if (r0 == 0) goto L_0x007d
            int r5 = r0.getCount()
            r3 = 0
        L_0x0036:
            if (r3 >= r5) goto L_0x007b
            X.HDB r0 = r9.A0N
            if (r0 == 0) goto L_0x007d
            java.lang.Object r0 = r0.getItem(r3)
            boolean r0 = r0 instanceof X.1Xj
            if (r0 == 0) goto L_0x0078
            X.HDB r0 = r9.A0N
            if (r0 == 0) goto L_0x007d
            java.lang.Object r1 = r0.getItem(r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.media.Media"
            X.0qQ.A0C(r1, r0)
            X.1Xj r1 = (X.1Xj) r1
            java.lang.String r2 = r1.getId()
            if (r2 == 0) goto L_0x0078
            boolean r0 = r7.equals(r2)
            if (r0 != 0) goto L_0x006d
            java.lang.String r1 = X.AnonymousClass3VO.A02(r7)
            java.lang.String r0 = X.AnonymousClass3VO.A02(r2)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0078
        L_0x006d:
            boolean r0 = r9.A1A
            if (r0 != 0) goto L_0x0089
            X.GAR r1 = r9.A0B
            if (r1 != 0) goto L_0x0081
            java.lang.String r0 = "contextualFeedController"
            goto L_0x0017
        L_0x0078:
            int r3 = r3 + 1
            goto L_0x0036
        L_0x007b:
            r3 = 0
            goto L_0x006d
        L_0x007d:
            X.0qQ.A0F(r8)
            goto L_0x001a
        L_0x0081:
            androidx.fragment.app.FragmentActivity r0 = r9.requireActivity()
            int r6 = r1.A04(r0)
        L_0x0089:
            r4.Ejm(r3, r6)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.feed.fragment.ContextualFeedFragment.A02(instagram.features.feed.fragment.ContextualFeedFragment):void");
    }

    public static final void A03(ContextualFeedFragment contextualFeedFragment, boolean z, boolean z2) {
        ContextualFeedFragment contextualFeedFragment2 = contextualFeedFragment;
        GAR gar = contextualFeedFragment2.A0B;
        if (gar == null) {
            0qQ.A0F("contextualFeedController");
            throw AnonymousClass00P.createAndThrow();
        }
        gar.A0Q(z, z2);
        if (contextualFeedFragment2.A0q != null && z) {
            C228102kn A002 = C228092km.A00(A00(contextualFeedFragment2));
            if (!A002.A0H()) {
                Integer num = AnonymousClass05K.A0Y;
                Integer num2 = AnonymousClass05K.A1F;
                AnonymousClass1O8 r4 = new AnonymousClass1O8();
                UserSession userSession = A002.A07;
                AnonymousClass1O9 r3 = r4.A00;
                1OP r0 = 1OP.$redex_init_class;
                1NS r1 = new 1NS(new 0bH(userSession), AnonymousClass1NR.class);
                String obj = UUID.randomUUID().toString();
                String obj2 = UUID.randomUUID().toString();
                1NY r6 = new 1NY(userSession, 197);
                Integer num3 = AnonymousClass05K.A01;
                r6.A08(num3);
                r6.A0A("feed/reels_tray/");
                r6.A02 = r1;
                r6.A0A = "feed/reels_tray/_v1";
                r6.A07(num);
                r6.A00 = r3;
                r6.A9m("tray_session_id", obj);
                r6.A9m(TraceFieldType.RequestID, obj2);
                r6.A9m("reason", "following_feed");
                r6.A9m("timezone_offset", Long.toString(1G0.A00()));
                r6.A9m("is_following_feed", "true");
                r6.A06 = 1CE.A04;
                Pair A003 = C278474ww.A00(userSession);
                r6.A0G((String) A003.first, (String) A003.second);
                r6.A0T = true;
                if (182.A06(0Tu.A05, 1NM.A00(userSession).A00, 36318737376221603L)) {
                    r6.A0F("X-IG-Reel-Tray-Bandwidth-KBPS", 0mp.A06("%.0f", new Object[]{Double.valueOf(1G7.A00())}));
                }
                AnonymousClass4Z5 r7 = new AnonymousClass4Z5(r6.A0M(), num, num2, num3, obj2, obj, (List) null);
                r7.A00 = r3;
                A002.A06 = r4;
                C228102kn.A04(contextualFeedFragment2, (AnonymousClass2l3) null, r7, A002, num, num2);
                A002.A0G = true;
            }
        }
    }

    public final Hashtag BCW() {
        GAR gar = this.A0B;
        if (gar == null) {
            0qQ.A0F("contextualFeedController");
            throw AnonymousClass00P.createAndThrow();
        } else if (gar instanceof C266514Zg) {
            return ((C266514Zg) gar).BCW();
        } else {
            return null;
        }
    }

    public final C227762js BD0() {
        C227762js r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("_helper");
        throw AnonymousClass00P.createAndThrow();
    }

    public final Integer BQo() {
        return AnonymousClass05K.A00;
    }

    public final boolean CJz() {
        HDB hdb = this.A0N;
        if (hdb != null) {
            return !((AnonymousClass2rW) hdb.A00).A01.isEmpty();
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CKB() {
        GAR gar = this.A0B;
        if (gar != null) {
            return gar.A0S();
        }
        0qQ.A0F("contextualFeedController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CT5() {
        GAR gar = this.A0B;
        if (gar != null) {
            return gar.A0U();
        }
        0qQ.A0F("contextualFeedController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CbJ() {
        GAR gar = this.A0B;
        if (gar != null) {
            return gar.A0Y();
        }
        0qQ.A0F("contextualFeedController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final 0jB E4k() {
        0jB r2 = new 0jB();
        r2.A06(this.A1O.A00);
        0jB r1 = this.A09;
        GAR gar = this.A0B;
        if (gar == null) {
            0qQ.A0F("contextualFeedController");
            throw AnonymousClass00P.createAndThrow();
        }
        gar.A0G(r2);
        if (r1 != null) {
            r2.A06(r1);
        }
        C324636ze.A00(A00(this)).A00(r2);
        return r2;
    }

    public final 0jB E4x() {
        return this.A09;
    }

    public final void EKl() {
        if (this.mView != null) {
            getScrollingViewProxy().EKm(this);
        }
    }

    public final boolean Ez8() {
        return this.A1F;
    }

    public final void FHG(boolean z) {
        AnonymousClass332 r0 = this.A0r;
        if (z) {
            if (r0 != null) {
                r0.onResume();
            }
        } else if (r0 != null) {
            r0.onPause();
        }
    }

    public final String getModuleName() {
        return (String) this.A1S.getValue();
    }

    public final String getSessionId() {
        AnonymousClass1L1 r0 = this.A0M;
        if (r0 != null) {
            return r0.A00;
        }
        0qQ.A0F("sessionProvider");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean isLoading() {
        GAR gar = this.A0B;
        if (gar != null) {
            return gar.A0W();
        }
        0qQ.A0F("contextualFeedController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean isOrganicEligible() {
        GAR gar = this.A0B;
        if (gar == null) {
            0qQ.A0F("contextualFeedController");
            throw AnonymousClass00P.createAndThrow();
        } else if (!(gar instanceof AnonymousClass4DU) || ((AnonymousClass4DU) gar).isOrganicEligible()) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean isSponsoredEligible() {
        GAR gar = this.A0B;
        if (gar == null) {
            0qQ.A0F("contextualFeedController");
            throw AnonymousClass00P.createAndThrow();
        } else if (!(gar instanceof AnonymousClass4DU) || !((AnonymousClass4DU) gar).isSponsoredEligible()) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean onBackPressed() {
        Integer num;
        C22338Xzn xzn;
        GAR gar = this.A0B;
        if (gar != null) {
            gar.A0A();
            if ("BUSINESS_INSPIRATION_HUB".equals(this.A0O) && this.A18 && (xzn = this.A07) != null) {
                xzn.A03(AnonymousClass000.A00(745));
                this.A18 = false;
            }
            if (this.A0V || this.A0W) {
                GAR gar2 = this.A0B;
                if (gar2 != null) {
                    if (gar2.A0W()) {
                        C228362lW r2 = this.A0E;
                        if (r2 != null) {
                            String moduleName = getModuleName();
                            GAR gar3 = this.A0B;
                            if (gar3 != null) {
                                if (gar3.A0V()) {
                                    num = AnonymousClass05K.A00;
                                } else {
                                    num = AnonymousClass05K.A0C;
                                }
                                r2.A05((1Xj) null, num, moduleName, "BACK");
                                if (C54771HSd.A00(A00(this))) {
                                    C228362lW r22 = this.A0E;
                                    if (r22 != null) {
                                        r22.A05((1Xj) null, AnonymousClass05K.A0C, getModuleName(), "BACK");
                                    }
                                }
                            }
                        }
                        0qQ.A0F("feedMediaLoadingLogger");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            return false;
        }
        0qQ.A0F("contextualFeedController");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final Object A01(ContextualFeedFragment contextualFeedFragment) {
        if (contextualFeedFragment.isAdded() && !contextualFeedFragment.mDetached && contextualFeedFragment.mView != null) {
            C238133Ar scrollingViewProxy = contextualFeedFragment.getScrollingViewProxy();
            HDB hdb = contextualFeedFragment.A0N;
            if (hdb != null) {
                List A042 = hdb.A04();
                int B6L = scrollingViewProxy.B6L();
                int BLQ = scrollingViewProxy.BLQ();
                if (B6L >= 0 && BLQ >= 0) {
                    HDB hdb2 = contextualFeedFragment.A0N;
                    if (hdb2 != null) {
                        Object item = hdb2.getItem(B6L);
                        HDB hdb3 = contextualFeedFragment.A0N;
                        if (hdb3 != null) {
                            Object item2 = hdb3.getItem(BLQ);
                            0qQ.A0B(A042, 0);
                            int indexOf = A042.indexOf(item);
                            int indexOf2 = A042.indexOf(item2);
                            if (indexOf2 != indexOf) {
                                int i = indexOf2 - indexOf;
                                if (i <= 1) {
                                    if (i == 1) {
                                        int i2 = B6L;
                                        while (true) {
                                            HDB hdb4 = contextualFeedFragment.A0N;
                                            if (hdb4 == null) {
                                                break;
                                            } else if (hdb4.getItem(i2) == item) {
                                                i2++;
                                            } else {
                                                View AnC = scrollingViewProxy.AnC(i2 - B6L);
                                                0qQ.A07(AnC);
                                                View view = contextualFeedFragment.mView;
                                                if (view != null) {
                                                    if (AnC.getTop() - view.getTop() < view.getHeight() / 2) {
                                                        return item2;
                                                    }
                                                    return item;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    return A042.get((indexOf2 + indexOf) / 2);
                                }
                            } else {
                                return item;
                            }
                        }
                    }
                }
            }
            0qQ.A0F("adapter");
            throw AnonymousClass00P.createAndThrow();
        }
        return null;
    }

    public final void A04(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C2355930l r2 = new C2355930l(activity, A00(this));
            String moduleName = getModuleName();
            AnonymousClass1L1 r0 = this.A0M;
            if (r0 == null) {
                0qQ.A0F("sessionProvider");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r2.A04(moduleName, r0.A00, str);
            }
        }
    }

    public final void ACw() {
        if (!isLoading() && CKB()) {
            GAR gar = this.A0B;
            if (gar == null) {
                0qQ.A0F("contextualFeedController");
                throw AnonymousClass00P.createAndThrow();
            } else {
                gar.A09();
            }
        }
    }

    public final String BjP() {
        Object A012 = A01(this);
        if (A012 == null || !(A012 instanceof 1Xl)) {
            return null;
        }
        return ((1Xl) A012).BPf().A0C.getLoggingInfoToken();
    }

    public final boolean CWV() {
        if (CT5() || !isLoading()) {
            return true;
        }
        HDB hdb = this.A0N;
        if (hdb != null) {
            return !((AnonymousClass2rW) hdb.A00).A01.isEmpty();
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D0t(1Xj r5) {
        AnonymousClass332 r2;
        if (r5.A5G()) {
            UserSession A002 = A00(this);
            0qQ.A0B(A002, 0);
            if (182.A06(0Tu.A05, A002, 36323156897639330L) && (r2 = this.A0r) != null) {
                boolean A0B2 = AnonymousClass3WS.A0B(A00(this), r5.CEL());
                AnonymousClass4M3 r0 = r2.A05.A0G.A05;
                if (r0 != null) {
                    r0.EPC(A0B2);
                }
            }
        }
    }

    public final void Dk5(1Xj r6) {
        C246353eS.A05(this, C246353eS.A00(AnonymousClass818.IG_REEL_IN_FEED_OVERFLOW_MENU, new C64546Ldn(), A00(this), r6, AnonymousClass05K.A01), A00(this));
    }

    public final String getMediaId() {
        Object A012 = A01(this);
        if (A012 == null || !(A012 instanceof 1Xl)) {
            return null;
        }
        return ((1Xl) A012).BPf().getId();
    }

    public final AnonymousClass0wW getSession() {
        return A00(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r6 = (X.1Xj) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            super.onActivityResult(r10, r11, r12)
            r0 = 4921(0x1339, float:6.896E-42)
            if (r10 == r0) goto L_0x000b
            r0 = 4928(0x1340, float:6.906E-42)
            if (r10 != r0) goto L_0x0070
        L_0x000b:
            r5 = 1
            if (r11 == r5) goto L_0x0011
            r0 = 2
            if (r11 != r0) goto L_0x0070
        L_0x0011:
            if (r12 == 0) goto L_0x0070
            java.lang.String r0 = "ARG_MEDIA_ID"
            java.lang.String r8 = r12.getStringExtra(r0)
            if (r8 == 0) goto L_0x0070
            r7 = 0
            X.HDB r0 = r9.A0N
            java.lang.String r4 = "adapter"
            if (r0 == 0) goto L_0x0074
            int r3 = r0.getCount()
        L_0x0026:
            if (r7 >= r3) goto L_0x0070
            X.HDB r0 = r9.A0N
            if (r0 == 0) goto L_0x0074
            java.lang.Object r6 = r0.getItem(r7)
            boolean r0 = r6 instanceof X.1Xj
            if (r0 == 0) goto L_0x0071
            X.1Xj r6 = (X.1Xj) r6
            java.lang.String r2 = r6.getId()
            if (r2 == 0) goto L_0x0071
            boolean r0 = r8.equals(r2)
            if (r0 != 0) goto L_0x0050
            java.lang.String r1 = X.AnonymousClass3VO.A02(r8)
            java.lang.String r0 = X.AnonymousClass3VO.A02(r2)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0071
        L_0x0050:
            com.instagram.common.session.UserSession r4 = A00(r9)
            X.Ldn r3 = new X.Ldn
            r3.<init>()
            com.instagram.common.session.UserSession r1 = A00(r9)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.818 r0 = X.AnonymousClass818.IG_REEL_IN_FEED_OVERFLOW_MENU
            X.LAG r1 = X.C246353eS.A00(r0, r3, r1, r6, r2)
            android.content.Context r0 = r9.requireContext()
            if (r11 != r5) goto L_0x006d
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x006d:
            X.C246353eS.A03(r0, r1, r4, r2)
        L_0x0070:
            return
        L_0x0071:
            int r7 = r7 + 1
            goto L_0x0026
        L_0x0074:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.feed.fragment.ContextualFeedFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onAppBackgrounded() {
        Integer num;
        int A032 = AnonymousClass0fD.A03(-723799872);
        if (this.A0V || this.A0W) {
            GAR gar = this.A0B;
            if (gar != null) {
                if (gar.A0W()) {
                    C228362lW r2 = this.A0E;
                    if (r2 != null) {
                        String moduleName = getModuleName();
                        GAR gar2 = this.A0B;
                        if (gar2 != null) {
                            if (gar2.A0V()) {
                                num = AnonymousClass05K.A00;
                            } else {
                                num = AnonymousClass05K.A0C;
                            }
                            r2.A05((1Xj) null, num, moduleName, "APP_BACKGROUNDED");
                            if (C54771HSd.A00(A00(this))) {
                                C228362lW r22 = this.A0E;
                                if (r22 != null) {
                                    r22.A05((1Xj) null, AnonymousClass05K.A0C, getModuleName(), "APP_BACKGROUNDED");
                                }
                            }
                        }
                    }
                    0qQ.A0F("feedMediaLoadingLogger");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F("contextualFeedController");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A0A(1433020157, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-1336547195, AnonymousClass0fD.A03(-936869365));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: X.4LP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: X.GXr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v109, resolved type: X.IY1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: X.HAm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r65v0, resolved type: X.2ms} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v2, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v6, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v5, resolved type: X.4DJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v12, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v7, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v4, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v9, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v223, resolved type: X.GAR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v13, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v21, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v25, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v32, resolved type: instagram.features.feed.fragment.ContextualFeedFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: X.2kz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: X.GV1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: X.GV1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v12, resolved type: X.GV1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v203, resolved type: X.2un} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v287, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v288, resolved type: X.HAm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v41, resolved type: X.HAm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v13, resolved type: X.2un} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: X.GV1} */
    /* JADX WARNING: type inference failed for: r2v66, types: [X.3Jn] */
    /* JADX WARNING: type inference failed for: r2v81, types: [X.3on, X.2lU, X.GAQ] */
    /* JADX WARNING: type inference failed for: r2v103, types: [X.3kK, java.lang.Object, X.1L1] */
    /* JADX WARNING: type inference failed for: r17v3 */
    /* JADX WARNING: type inference failed for: r38v1, types: [X.07Z, X.2jx] */
    /* JADX WARNING: type inference failed for: r13v2, types: [X.2mN, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v16, types: [X.3mI, X.GV9] */
    /* JADX WARNING: type inference failed for: r13v4, types: [X.2mN, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v61, types: [X.2mN, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v73, types: [X.2mN, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v222 */
    /* JADX WARNING: type inference failed for: r2v189 */
    /* JADX WARNING: type inference failed for: r2v202 */
    /* JADX WARNING: type inference failed for: r36v27, types: [X.HAo] */
    /* JADX WARNING: type inference failed for: r36v28, types: [X.ToW] */
    /* JADX WARNING: type inference failed for: r36v29, types: [X.UlY] */
    /* JADX WARNING: type inference failed for: r36v30, types: [X.GcK] */
    /* JADX WARNING: type inference failed for: r36v31, types: [X.HAo] */
    /* JADX WARNING: type inference failed for: r36v32, types: [X.GcI] */
    /* JADX WARNING: type inference failed for: r36v33, types: [X.UlW] */
    /* JADX WARNING: type inference failed for: r36v34, types: [X.HAr] */
    /* JADX WARNING: type inference failed for: r36v35, types: [X.HAs] */
    /* JADX WARNING: type inference failed for: r36v36, types: [X.Mqn] */
    /* JADX WARNING: type inference failed for: r36v37, types: [X.HAq] */
    /* JADX WARNING: type inference failed for: r4v289 */
    /* JADX WARNING: type inference failed for: r36v38, types: [X.HKj] */
    /* JADX WARNING: type inference failed for: r36v39, types: [X.HAp] */
    /* JADX WARNING: type inference failed for: r36v40, types: [X.UlX] */
    /* JADX WARNING: type inference failed for: r2v204 */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x05b5, code lost:
        if (r4.equals(r7) == false) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x05b7, code lost:
        r36 = new X.C52767GcK(r1, r0, r6, r5, r17, r10, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0630, code lost:
        r8 = r4.equals(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0634, code lost:
        if (r8 == false) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0636, code lost:
        r36 = new X.C54373HAo(r0, r6, r5, r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0647, code lost:
        r4 = (X.GAR) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0649, code lost:
        r0.A0B = r4;
        r19 = "contextualFeedController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x064d, code lost:
        if (r4 == 0) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x064f, code lost:
        r4.A0B();
        r4 = new X.AnonymousClass2kR(requireContext(), A00(r0), r0);
        r37 = requireActivity();
        r7 = r0.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0667, code lost:
        if (r7 == null) goto L_0x1423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0669, code lost:
        r6 = r0.A0s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x066b, code lost:
        if (r6 != null) goto L_0x0675;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x066d, code lost:
        r18 = "inlineComposerDelegate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0675, code lost:
        r5 = r0.A0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0679, code lost:
        if (r5 == null) goto L_0x111b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x067b, code lost:
        r4 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x067d, code lost:
        if (r4 == null) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x067f, code lost:
        r55 = r4.A0f();
        r57 = r1.getBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_HIDE_UFI_BUTTONS");
        r4 = new X.C231612rx(r0, requireActivity());
        r8 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0694, code lost:
        if (r8 == null) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0696, code lost:
        r49 = r8.A07();
        X.0qQ.A07(r49);
        r38 = r0;
        r36 = new X.AnonymousClass2s3(r37, r38, r4, r5, (X.0xF) null, (X.AnonymousClass57L) null, r6, r4, r45, r0.A0x, r7, java.lang.Boolean.valueOf(r0.A1C), r49, (java.lang.Integer) null, "contextual_feed", "explore_unconnected", r0.A12, r0.A13, r55, true, r57);
        r6 = new X.AnonymousClass34R(A00(r0), (X.AnonymousClass34Q) null, getModuleName());
        r7 = new X.AnonymousClass34L(A00(r0), getModuleName());
        r5 = X.1wY.A00(A00(r0));
        r4 = getModuleName();
        X.0qQ.A08(X.1wY.A0F);
        r5.A07(r7, r6, r4);
        r4 = r0.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x06fe, code lost:
        if (r4 == null) goto L_0x0718;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0704, code lost:
        if (X.1sx.A0P(r4) == false) goto L_0x0718;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0706, code lost:
        r4 = X.C324456zJ.A00(requireContext());
        r0.A0H = r4;
        registerLifecycleListener(r4);
        r1.putBoolean("ContextualFeedFragment.ARGUMENTS_SHOULD_ADD_UNIVERSAL_CTA_GAP", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0718, code lost:
        r10 = r0.A0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x071a, code lost:
        if (r10 == null) goto L_0x111b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x071c, code lost:
        r54 = requireActivity();
        r8 = r0.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0722, code lost:
        if (r8 == null) goto L_0x1423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0724, code lost:
        r73 = r0.A1H;
        r7 = new X.GUQ(r0);
        r6 = new X.GUP(r0);
        r4 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0734, code lost:
        if (r4 == null) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0736, code lost:
        r70 = r4.A0f();
        r4 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x073c, code lost:
        if (r4 == null) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x073e, code lost:
        r71 = r4.A0T();
        r4 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0744, code lost:
        if (r4 == null) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0746, code lost:
        r61 = r4.A06();
        r67 = r4.A07();
        X.0qQ.A07(r67);
        r4 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0753, code lost:
        if (r4 == null) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0755, code lost:
        r4.A0X();
        r5 = X.GUR.A00(r1, r0, r54, r10, r36, r73, new X.C52460GTm(A00(r0), r0), r4, r7, r61, r6, r2, r0.A0x, r0, r8, r67, "contextual_feed", r0.A11, r70, r71, r0.A1B);
        r0.A0N = r5;
        r18 = "adapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x078f, code lost:
        if (r5 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0791, code lost:
        r4 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0793, code lost:
        if (r4 == null) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0795, code lost:
        r5.A0D(r4.A0c());
        r6 = A00(r0);
        X.0qQ.A0B(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x07ac, code lost:
        if (X.182.A06(r9, r6, 2342154346361258492L) == false) goto L_0x07c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x07ae, code lost:
        r4 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        A00(r0);
        r6 = X.02m.A0p;
        X.0qQ.A07(r6);
        r4 = new X.C2372036s(r6, getModuleName());
        r0.A0w = r4;
        r5 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x07c5, code lost:
        if (r5 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x07c7, code lost:
        r5.mViewLifecycleListener = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x07c9, code lost:
        r5 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x07cb, code lost:
        if (r5 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x07cd, code lost:
        r5.A06();
        r4 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x07d2, code lost:
        if (r4 == null) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x07d4, code lost:
        r5.A08(r4.A05());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x07e3, code lost:
        if ("Following_Feed".equals(r0.A0O) == false) goto L_0x0826;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x07e5, code lost:
        r6 = A00(r0);
        X.0qQ.A0B(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x07f5, code lost:
        if (X.182.A06(r9, r6, 36318857635306003L) == false) goto L_0x0826;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x07f7, code lost:
        r37 = requireContext();
        r7 = r0.A0m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x07fd, code lost:
        if (r7 == null) goto L_0x1437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x07ff, code lost:
        r6 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0801, code lost:
        if (r6 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0803, code lost:
        r36 = new X.EEQ(r37, r38, new X.0xG(getModuleName()), A00(r0), r7, (X.G72) r6, r73);
        r0.A0q = r36;
        registerLifecycleListener(r36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0826, code lost:
        r6 = A00(r0);
        r5 = getModuleName();
        X.0qQ.A0B(r6, 0);
        X.0qQ.A0B(r5, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x083c, code lost:
        if (r5.equals("feed_contextual_keyword") == false) goto L_0x084b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x083e, code lost:
        r22 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0849, code lost:
        if (X.182.A06(r9, r6, 36316997914465008L) != false) goto L_0x084d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x084b, code lost:
        r22 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x084f, code lost:
        if (r0.A0W == false) goto L_0x0c08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0851, code lost:
        r5 = A00(r0);
        r10 = getSessionId();
        r8 = getModuleName();
        r4 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x085f, code lost:
        if (r4 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0861, code lost:
        if (r2 == null) goto L_0x1453;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0863, code lost:
        r2 = (X.C233002un) r2;
        r12 = new X.C52482GUk();
        X.0qQ.A0B(r5, 0);
        X.0qQ.A0B(r10, 2);
        X.0qQ.A0B(r8, 3);
        X.0qQ.A0B(r2, 5);
        r7 = X.C54447HEb.A00;
        X.C52485GUn.A00(r7);
        r11 = X.1PG.A00(r5).A06(r7);
        X.0qQ.A07(r11);
        r10 = X.C55279Hf8.A00(r5, X.1PG.A00(r5).A03(r7), r0, r10, r8);
        X.0qQ.A0B(r10, 0);
        r2.A0B = r10;
        r8 = new X.IY8(r5, r4);
        r7 = new java.lang.Object();
        r35 = new X.HF1(r5, r7, r8, r10, r11, new X.C52489GUr());
        r13 = new X.HFF(r7, r11, r4);
        r4 = new X.C233642w5(X.C233632w4.A05);
        r4.A0G = r2;
        r4.A0K = r10;
        r4.A0L = r11;
        r4.A0J = r35;
        r4.A0N = r13;
        r4.A0H = r8;
        r4.A0E = r7;
        r4.A0P = r12;
        r4.A0R = new X.AnonymousClass2wB();
        r4.A0p = false;
        r2 = r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x08e3, code lost:
        r0.A0L = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x08e5, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x08e6, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x08e7, code lost:
        registerLifecycleListener(new X.AnonymousClass7Q8(requireContext(), A00(r0), new X.GUU(r0)));
        r4 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        r6 = X.C227752jr.A00(requireContext(), (java.lang.Float) null, false);
        r0.A06 = r6;
        r5 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x090c, code lost:
        if (r5 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x090e, code lost:
        r8 = new X.C234172xD(r0, r6, r73.A01, r5);
        r0.A0v = new X.C234422xq(requireContext(), A00(r0), r0, X.C234242xR.A00());
        r6 = new java.util.ArrayList();
        r4 = r0.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0931, code lost:
        if (r4 == null) goto L_0x1423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0935, code lost:
        if (r4.A00 == null) goto L_0x0c01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0937, code lost:
        r7 = A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x093b, code lost:
        if (r16 == false) goto L_0x0b88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x093d, code lost:
        r4 = r0.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x093f, code lost:
        if (r4 == null) goto L_0x1423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0941, code lost:
        r4 = r4.A00;
        X.0qQ.A0B(r7, 0);
        X.0qQ.A0B(r4, 1);
        r5 = X.AnonymousClass2y5.A00(r7, new X.C52496GUy(r7, r0, r4), X.C230432pc.PROFILE_FEED);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0954, code lost:
        r4 = new X.AnonymousClass2y7(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0959, code lost:
        r6.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x095c, code lost:
        if (r10 == null) goto L_0x0966;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x095e, code lost:
        r6.add(new X.GUH(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0966, code lost:
        if (r16 != false) goto L_0x0b53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0968, code lost:
        if (r22 != false) goto L_0x0b53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x096a, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x096c, code lost:
        r4 = r0.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x096e, code lost:
        if (r4 == null) goto L_0x097a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0970, code lost:
        r6.add(new X.C52495GUx(r4.A05));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x097a, code lost:
        r5 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x097c, code lost:
        if (r5 == null) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0980, code lost:
        if ((r5 instanceof X.C14030ToW) == false) goto L_0x0b4f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0982, code lost:
        r4 = ((X.C14030ToW) r5).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0986, code lost:
        if (r4 == null) goto L_0x0b4f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0988, code lost:
        r47 = r4.getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x098c, code lost:
        r35 = requireContext();
        r36 = requireActivity();
        r38 = A00(r0);
        r7 = r0.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x099a, code lost:
        if (r7 == null) goto L_0x1423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x099c, code lost:
        r5 = r0.A0m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x099e, code lost:
        if (r5 == null) goto L_0x1437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x09a0, code lost:
        r4 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x09a2, code lost:
        if (r4 == null) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x09a4, code lost:
        r42 = r4.A06();
        X.0qQ.A07(r42);
        r10 = r0.A0v;
        r4 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x09af, code lost:
        if (r4 == null) goto L_0x1346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x09b1, code lost:
        r6 = X.GU3.A00(r35, r36, r0, r38, r5, r0, r4, r42, (X.AnonymousClass2xS) null, (X.C228182kv) null, r10, r7, r47, r6);
        r11 = X.AnonymousClass2bO.A00();
        r10 = A00(r0);
        r7 = new java.util.HashMap();
        r7.put(com.instagram.quickpromotion.intf.QPTooltipAnchor.MEDIA_OPTIONS_ICON, new X.C230872qQ());
        r5 = r11.A04(r10, r7);
        r0.A0K = r5;
        r5.A00 = getActivity();
        r48 = X.AnonymousClass2bO.A00();
        r51 = A00(r0);
        r53 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0I;
        X.AnonymousClass2bO.A00();
        r5 = new X.GUV(r0);
        r4 = r0.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0a00, code lost:
        if (r4 == null) goto L_0x1341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0a02, code lost:
        r0.A0J = r48.A01(r0, r0, r51, X.2bV.A00((X.C230942qc) null, (X.AnonymousClass574) null, (X.AnonymousClass2qY) null, (X.AnonymousClass2bQ) null, (X.C230902qW) null, (X.AnonymousClass573) null, (X.C230972qf) null, (X.C71212bU) null, r5, (X.C71202bS) null, r4, (X.AnonymousClass575) null, (java.lang.Boolean) null), r53);
        r7 = r1.getString("shopping_session_id");
        r11 = A00(r0);
        r10 = getModuleName();
        X.0qQ.A0B(r11, 0);
        X.0qQ.A0B(r10, 1);
        r12 = X.182.A06(r9, r11, 36315829683883583L);
        r5 = X.182.A06(r9, r11, 36315829683949120L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0a54, code lost:
        if (r10.equals(r23) != false) goto L_0x0a5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0a5c, code lost:
        if (r10.equals("feed_contextual_group_profile") == false) goto L_0x0b0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0a5e, code lost:
        if (r12 != false) goto L_0x0a62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0a60, code lost:
        if (r5 == false) goto L_0x0b0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0a62, code lost:
        r5 = A00(r0);
        r4 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0a68, code lost:
        if (r4 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0a6a, code lost:
        r10 = new X.GAS(r5, r0, r4);
        r9 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0a71, code lost:
        if (r9 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0a73, code lost:
        r5 = r0.A1G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0a75, code lost:
        r0.A0p = new X.C2355030c(r0, r10, r0, r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0a90, code lost:
        if (X.AnonymousClass2o2.A06(A00(r0)) == false) goto L_0x0aa5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0a92, code lost:
        r10 = A00(r0);
        r0.A0o = new com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl(r0, r10, X.C54975Ha8.A00(r10), X.C314986jA.A00(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0aa5, code lost:
        r10 = r0.mFragmentManager;
        r9 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0aa9, code lost:
        if (r9 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0aab, code lost:
        r5 = new X.C2362232x(r0, r10, r9, r4);
        r5.A0C = r8;
        r4 = r0.A0m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0ab6, code lost:
        if (r4 == null) goto L_0x1437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0ab8, code lost:
        r5.A04 = r4;
        r5.A0H = r6;
        r5.A0G = null;
        r5.A0K = r0.A0v;
        r5.A0W = r7;
        r5.A0a = r16;
        r4 = r0.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0acc, code lost:
        if (r4 == null) goto L_0x1423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0ace, code lost:
        r5.A0R = r4;
        r8 = getModuleName();
        r6 = r8.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0adb, code lost:
        if (r6 == -600899844) goto L_0x0b00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0ae0, code lost:
        if (r6 == 339532540) goto L_0x0b02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0ae5, code lost:
        if (r6 != 1805942339) goto L_0x0b0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0aed, code lost:
        if (r8.equals("feed_contextual_self_profile") == false) goto L_0x0b0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0aef, code lost:
        r4 = 23599577;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0af2, code lost:
        r5.A00 = r4;
        r9 = A00(r0);
        r8 = r0.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0afa, code lost:
        if (r8 != null) goto L_0x1120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0afc, code lost:
        r18 = "quickPromotionDelegate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0b00, code lost:
        r23 = "feed_contextual_group_profile";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0b08, code lost:
        if (r8.equals(r23) != false) goto L_0x0aef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0b0a, code lost:
        r4 = 23594329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0b0e, code lost:
        r10 = A00(r0);
        r5 = getModuleName();
        X.0qQ.A0B(r10, 0);
        X.0qQ.A0B(r5, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0b22, code lost:
        if (r5.equals("feed_contextual_keyword") == false) goto L_0x0a88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0b2d, code lost:
        if (X.182.A06(r9, r10, 36316997914596082L) != false) goto L_0x0b3a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0b38, code lost:
        if (X.182.A06(r9, r10, 36316997914661619L) == false) goto L_0x0a88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0b3a, code lost:
        r5 = A00(r0);
        r4 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0b40, code lost:
        if (r4 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0b42, code lost:
        r10 = new X.C52759GcC(r5, r0, r4);
        r9 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0b49, code lost:
        if (r9 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0b4b, code lost:
        r5 = r0.A1G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0b4f, code lost:
        r47 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0b53, code lost:
        r5 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0b55, code lost:
        if (r5 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0b57, code lost:
        r6.add(new X.C52493GUv(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0b5f, code lost:
        if (r16 == false) goto L_0x0b85;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0b61, code lost:
        r11 = A00(r0);
        r10 = getModuleName();
        r4 = r0.A0t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0b6b, code lost:
        if (r4 == null) goto L_0x1474;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0b6d, code lost:
        r6.add(new X.C52494GUw(r11, r10, r28, r4.A04));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0b79, code lost:
        if (r22 == false) goto L_0x096c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0b7b, code lost:
        r6.add(new X.C52760GcD(r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0b85, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0b88, code lost:
        r5 = getModuleName();
        X.0qQ.A0B(r7, 0);
        X.0qQ.A0B(r5, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0b98, code lost:
        if (r5.equals("feed_contextual_ads_chain") == false) goto L_0x0bc4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0ba5, code lost:
        if (X.182.A06(X.0Tu.A06, r7, 36312887635019155L) == false) goto L_0x0bc4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0ba7, code lost:
        r7 = A00(r0);
        r4 = r0.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0bad, code lost:
        if (r4 == null) goto L_0x1423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0274, code lost:
        if (X.182.A06(r9, r2, 36315829683359289L) == false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0baf, code lost:
        r4 = r4.A00;
        X.0qQ.A0B(r7, 0);
        X.0qQ.A0B(r4, 1);
        r5 = X.AnonymousClass2y5.A00(r7, new X.C57353IYk(r7, r4), X.C230432pc.FEED);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0bc6, code lost:
        if (r0.A0V == false) goto L_0x0c01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0bc8, code lost:
        r12 = A00(r0);
        r11 = A00(r0);
        X.0qQ.A0B(r11, 0);
        r5 = X.182.A06(X.0Tu.A06, r11, 36321451795948934L);
        r4 = r0.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0be0, code lost:
        if (r4 == null) goto L_0x1423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0be2, code lost:
        r7 = r4.A00;
        X.0qQ.A0B(r12, 0);
        X.0qQ.A0B(r7, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0beb, code lost:
        if (r5 == false) goto L_0x0bfa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0bed, code lost:
        r5 = X.AnonymousClass2y5.A00(r12, new X.C57357IYo(r12, r0, r7), X.C230432pc.EXPLORE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0bfa, code lost:
        r5 = new X.AnonymousClass2wB();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0c01, code lost:
        r4 = new X.C15980Ulw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0c0a, code lost:
        if (r0.A0V == false) goto L_0x0ca0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0c0c, code lost:
        r5 = A00(r0);
        r10 = getSessionId();
        r8 = getModuleName();
        r4 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0c1a, code lost:
        if (r4 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0c1c, code lost:
        X.0qQ.A0C(r2, "null cannot be cast to non-null type com.instagram.adschaining.contextualfeed.fetch.AdsChainingFetcher<com.instagram.model.sponsored.DynamicInsertionAd<com.instagram.sponsored.asyncads.rules.gaprules.TargetPositionGapRules>>");
        r2 = (X.IY1) r2;
        r12 = new X.C52482GUk();
        X.0qQ.A0B(r5, 0);
        X.0qQ.A0B(r10, 2);
        X.0qQ.A0B(r8, 3);
        X.0qQ.A0B(r2, 5);
        r7 = X.C54447HEb.A00;
        X.C52485GUn.A00(r7);
        r11 = X.1PG.A00(r5).A06(r7);
        X.0qQ.A07(r11);
        r10 = X.C55279Hf8.A00(r5, X.1PG.A00(r5).A03(r7), r0, r10, r8);
        r2.A01 = r10;
        r8 = new X.IY8(r5, r4);
        r7 = new java.lang.Object();
        r35 = new X.HF1(r5, r7, r8, r10, r11, new X.C52489GUr());
        r13 = new X.HFF(r7, r11, r4);
        r4 = new X.C233642w5(X.C233632w4.A05);
        r4.A0G = r2;
        r4.A0K = r10;
        r4.A0L = r11;
        r4.A0J = r35;
        r4.A0N = r13;
        r4.A0H = r8;
        r4.A0E = r7;
        r4.A0P = r12;
        r4.A0R = new X.AnonymousClass2wB();
        r4.A0p = false;
        r2 = r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0ca0, code lost:
        if (r16 == false) goto L_0x0e85;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0ca2, code lost:
        r6 = X.AnonymousClass1Nd.A00(A00(r0));
        r2 = r0.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0cac, code lost:
        if (r2 == null) goto L_0x1423;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0cae, code lost:
        r6.A00(new X.C324016yT(r2.A00, A00(r0).A06));
        r40 = r1.getBoolean("ContextualFeedFragment.ARGUMENT_IS_HUNT_AND_PECK_ENTRY");
        r2 = r1.getParcelable("ContextualFeedFragment.ARGUMENT_NETWORK_CONFIG");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0cca, code lost:
        if (r2 == null) goto L_0x145e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0ccc, code lost:
        r2 = (com.instagram.feed.intf.ContextualFeedNetworkConfig) r2;
        r0.A0t = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0cd0, code lost:
        if (r2 == null) goto L_0x0e81;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0cd2, code lost:
        r8 = r2.A04;
        r7 = r1.getInt("ContextualFeedFragment.ARGUMENT_GRID_INDEX");
        r10 = new X.C52482GUk();
        r2 = new X.C52484GUm(requireContext(), r0);
        r0.A0z = r2;
        r2 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0cec, code lost:
        if (r2 == null) goto L_0x0e7d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0cee, code lost:
        r39 = r2.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0cf2, code lost:
        r2 = r0.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0cf4, code lost:
        if (r2 == null) goto L_0x0e79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0cfa, code lost:
        if (X.1sx.A0P(r2) == false) goto L_0x0e79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0cfc, code lost:
        r12 = X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0cfe, code lost:
        r4 = A00(r0);
        r2 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0d04, code lost:
        if (r2 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0d06, code lost:
        r6 = new X.C52481GUj(r4, r2, r8);
        r11 = r1.getString("ContextualFeedFragment.ARGUMENT_SEED_MEDIA_ID", "");
        r2 = A00(r0);
        r41 = requireContext();
        r35 = getSessionId();
        r38 = getModuleName();
        X.0qQ.A0A(r11);
        X.0qQ.A0B(r2, 0);
        X.0qQ.A0B(r35, 3);
        X.0qQ.A0B(r38, 4);
        X.0qQ.A0B(r11, 11);
        r13 = new X.C52483GUl(r8);
        X.C52485GUn.A00(r13);
        r37 = X.1PG.A00(r2).A06(r13);
        X.0qQ.A07(r37);
        r44 = X.1PG.A00(r2).A04(r13);
        X.0qQ.A07(r44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0d61, code lost:
        if (X.182.A06(r9, r2, 36315829686111826L) != false) goto L_0x0d66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0d63, code lost:
        r37.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0d66, code lost:
        r43 = X.1PG.A00(r2).A03(r13);
        r36 = X.C52488GUq.A00(r2, r43, r0, r35, r38, r7);
        r13 = new java.lang.Object();
        r40 = new X.C52490GUs(r41, r2, r43, r44, r6, r36, r37, r17, new X.C52491GUt(r12, r8, r11, r40), r38, r7);
        r46 = new X.C52489GUr();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0daa, code lost:
        if (X.C233832wY.A01(r2) == false) goto L_0x0db9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0dac, code lost:
        r47 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0db7, code lost:
        if (X.182.A06(r9, r2, 36319772463734388L) != false) goto L_0x0dbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0db9, code lost:
        r47 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0dbf, code lost:
        if (X.C228342lQ.A03(r2) == false) goto L_0x0dce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0dc1, code lost:
        r48 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0dcc, code lost:
        if (X.182.A06(r9, r2, 36312879042200937L) != false) goto L_0x0dd0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0dce, code lost:
        r48 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0dd4, code lost:
        if (X.C228342lQ.A05(r2) == false) goto L_0x0de3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0dd6, code lost:
        r49 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0de1, code lost:
        if (X.182.A06(r9, r2, 36312879042200937L) != false) goto L_0x0de5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0de3, code lost:
        r49 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0de5, code lost:
        r40 = new X.C52487GUp(r2, r13, r6, r36, r37, r46, r47, r48, r49);
        r11 = r37;
        r40 = new X.C308796Vq(r13, r6, r11, new X.C52492GUu(r13, r6, r11, r7), false, false, true);
        r11 = new X.C233642w5(new X.C233632w4(r6.BYj(), r7, r7, false));
        r11.A0G = r40;
        r11.A0K = r36;
        r11.A0L = r37;
        r11.A0J = r40;
        r11.A0N = r40;
        r11.A0H = r6;
        r11.A0E = r13;
        r11.A0P = r10;
        r11.A0F = r39;
        r11.A0R = new X.AnonymousClass2wB();
        r11.A0p = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0e4c, code lost:
        if (X.182.A06(r9, r2, 36315829686111826L) == false) goto L_0x0e61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0e4e, code lost:
        r11.A09 = X.C233682wC.A03;
        r11.A00 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0e5d, code lost:
        if (X.182.A06(r9, r2, 36315829686505045L) == false) goto L_0x0e61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0e5f, code lost:
        r11.A0k = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0e61, code lost:
        r2 = r11.A00();
        r0.A0L = r2;
        r2.A0C(r7);
        r2 = new X.AnonymousClass57V(A00(r0), r6, r8, getModuleName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0e79, code lost:
        r12 = X.AnonymousClass05K.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0e7d, code lost:
        r39 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0e81, code lost:
        r2 = null;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0e85, code lost:
        if (r22 == false) goto L_0x08e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0e87, code lost:
        r4 = r1.getParcelable("contextual_feed_config");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0e8f, code lost:
        if ((r4 instanceof com.instagram.search.surface.fragment.contextualfeed.SerpContextualFeedConfig) == false) goto L_0x1105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0e91, code lost:
        r0.A15 = ((com.instagram.search.surface.fragment.contextualfeed.SerpContextualFeedConfig) r4).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0e97, code lost:
        r12 = r0.A15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0e99, code lost:
        if (r12 == null) goto L_0x08e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0e9b, code lost:
        if (r15 == null) goto L_0x08e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0e9f, code lost:
        if (r0.A0S == null) goto L_0x08e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0ea1, code lost:
        r0.A0Z = r1.getInt(X.AnonymousClass000.A00(2183));
        r11 = r15.Bi3();
        r2 = r0.A0S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0eb3, code lost:
        if (r2 == null) goto L_0x1469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0eb5, code lost:
        r5 = X.1Xv.A06(r2);
        r10 = new X.C52482GUk();
        r2 = new X.C52484GUm(requireContext(), r0);
        r0.A0z = r2;
        r2 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0ecb, code lost:
        if (r2 == null) goto L_0x1101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0ecd, code lost:
        r38 = r2.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0ed1, code lost:
        r2 = A00(r0);
        r53 = requireContext();
        r13 = getSessionId();
        r37 = getModuleName();
        r6 = r0.A0Z;
        r4 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0ee5, code lost:
        if (r4 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0ee7, code lost:
        X.0qQ.A0B(r2, 0);
        X.0qQ.A0B(r13, 3);
        X.0qQ.A0B(r37, 4);
        X.0qQ.A0B(r5, 6);
        X.0qQ.A0B(r11, 7);
        r8 = X.C54448HEc.A00;
        X.C52485GUn.A00(r8);
        r55 = X.1PG.A00(r2).A03(r8);
        r36 = X.1PG.A00(r2).A06(r8);
        X.0qQ.A07(r36);
        r56 = X.1PG.A00(r2).A04(r8);
        X.0qQ.A07(r56);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0f23, code lost:
        if (r15.CcK() == false) goto L_0x1006;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0f25, code lost:
        r39 = new X.C233462vl((X.C67241sS) null, (X.C233492vo) null, (java.lang.String) null, -1, -1, 0, r6, 0, 16225, true, true, false, false);
        r39.A0B(r6);
        r39.A0A(-1);
        r8 = new X.C250933mI();
        r8.A0L = r15;
        r8.A00 = r39;
        r8.A0Z = r15.A2R();
        r7 = r15.A0C.getInjected();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0f63, code lost:
        if (r7 == null) goto L_0x10fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0f65, code lost:
        r7 = r7.BKL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0f69, code lost:
        r8.A0g = r7;
        r7 = r15.C9L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0f6f, code lost:
        if (r7 != null) goto L_0x0f73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0f71, code lost:
        r7 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0f73, code lost:
        r8.A0l = r7;
        r8.A0b = r15.A2S();
        r8.A0q = r15.A3k();
        r7 = r15.A0C.getInjected();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0f87, code lost:
        if (r7 == null) goto L_0x10fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0f89, code lost:
        r7 = r7.getCookies();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0f8d, code lost:
        r8.A00 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r7);
        r8.A0h = r15.A0C.BMq();
        r8.A0m = r15.A3P();
        r8.A0U = java.lang.Boolean.valueOf(r15.A60());
        r8.A0d = r15.A2V();
        r7 = r15.A0C.getInjected();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0fb7, code lost:
        if (r7 == null) goto L_0x10f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0fb9, code lost:
        r7 = r7.Ac5();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0fbd, code lost:
        if (r7 == null) goto L_0x10f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0fbf, code lost:
        r8.A0c = r7;
        r8.A0k = r15.A2r();
        r7 = r15.A0C.getInjected();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0fcd, code lost:
        if (r7 == null) goto L_0x10f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0fcf, code lost:
        r7 = r7.AYn();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0fd3, code lost:
        if (r7 == null) goto L_0x10f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0fd5, code lost:
        r8.A0Y = r7;
        r8.A0O = r15.A22();
        r8.A0a = r15.A0C.BZp();
        r8 = java.util.Collections.singletonList(r8.A01());
        X.0qQ.A07(r8);
        X.0qQ.A0C(r8, "null cannot be cast to non-null type kotlin.collections.MutableCollection<com.instagram.model.sponsored.DynamicInsertionAd<com.instagram.sponsored.asyncads.rules.gaprules.GapRules>>");
        r42 = X.0u4.A00(r8);
        r40 = X.AnonymousClass05K.A00;
        r36.A07(r40, r40, r42, r6, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x1006, code lost:
        r35 = X.C52488GUq.A00(r2, r55, r0, r13, r37, r6);
        r7 = new X.C52763GcG(r2, r15, r4, r6);
        r13 = new java.lang.Object();
        r52 = new X.C52490GUs(r53, r2, r55, r56, r7, r35, r36, r17, new X.C54599HKi(r12, r5, r11), r37, r6);
        r45 = new X.C52489GUr();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x1045, code lost:
        if (X.C233832wY.A01(r2) == false) goto L_0x1054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x1047, code lost:
        r46 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x1052, code lost:
        if (X.182.A06(r9, r2, 36319772463406703L) != false) goto L_0x1056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x1054, code lost:
        r46 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x105a, code lost:
        if (X.C228342lQ.A03(r2) == false) goto L_0x1069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x105c, code lost:
        r47 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x1067, code lost:
        if (X.182.A06(r9, r2, 36312879042397548L) != false) goto L_0x106b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x1069, code lost:
        r47 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x106f, code lost:
        if (X.C228342lQ.A05(r2) == false) goto L_0x107e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x1071, code lost:
        r48 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x107c, code lost:
        if (X.182.A06(r9, r2, 36312879042397548L) != false) goto L_0x1080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x107e, code lost:
        r48 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x1080, code lost:
        r39 = new X.C52487GUp(r2, r13, r7, r35, r36, r45, r46, r47, r48);
        r39 = new X.C308796Vq(r13, r7, r36, new X.C52764GcH(r15, r13, r7, r36, r6), false, false, true);
        r6 = new X.C233642w5(new X.C233632w4(r7.BYj(), r6, r6, false));
        r6.A0G = r52;
        r6.A0K = r35;
        r6.A0L = r36;
        r6.A0J = r39;
        r6.A0N = r39;
        r6.A0H = r7;
        r6.A0E = r13;
        r6.A0P = r10;
        r6.A0F = r38;
        r6.A0R = new X.AnonymousClass2wB();
        r6.A0p = false;
        r6.A0Y = r15.CcK();
        r4 = r6.A00();
        r0.A0L = r4;
        r4.A0C(r0.A0Z);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x10f5, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x10f8, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x10fb, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x10fe, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x1101, code lost:
        r38 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x1107, code lost:
        if ((r4 instanceof com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig) == false) goto L_0x0e97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x110d, code lost:
        if (((com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig) r4).A01 != null) goto L_0x0e97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x110f, code lost:
        r2 = new java.lang.IllegalStateException("Required value was null.");
        r1 = 1012877846;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x111b, code lost:
        X.0qQ.A0F("igBloksFragmentHost");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x1120, code lost:
        r6 = r0.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x1122, code lost:
        if (r6 == null) goto L_0x1341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x1124, code lost:
        r5.A0F = new X.C2356230o(r9, r8, r6);
        r5.A0P = r17;
        r5.A0Z = r1.getBoolean("ContextualFeedFragment.ARGUMENT_ELIGIBLE_FOR_SUBSCRIPTIONS_NUX", false);
        r5.A06 = r0.A0o;
        r5.A07 = r2;
        r5.A0O = r0.A0x;
        r5.A03 = r0;
        r1 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x1145, code lost:
        if (r1 == null) goto L_0x1346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x1147, code lost:
        r5.A0D = r1;
        r1 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x114b, code lost:
        if (r1 == null) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x114d, code lost:
        r1.A0L(r5);
        r1 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x1152, code lost:
        if (r1 == null) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x1158, code lost:
        if (r1.A0g() == false) goto L_0x115e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x115a, code lost:
        r5.A09 = r0.A1P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x115e, code lost:
        r2 = r0.A10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x1160, code lost:
        if (r2 == null) goto L_0x116a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x1168, code lost:
        if (r2.longValue() == -1) goto L_0x116c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x116a, code lost:
        r5.A0U = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x116c, code lost:
        r2 = r0.A17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x116e, code lost:
        if (r2 == null) goto L_0x1178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x1174, code lost:
        if (r2.length() == 0) goto L_0x1178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x1176, code lost:
        r5.A0X = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x1178, code lost:
        r1 = r0.A0p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x117a, code lost:
        if (r1 == null) goto L_0x117e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x117c, code lost:
        r5.A08 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x117e, code lost:
        r1 = r0.A0t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x1180, code lost:
        if (r1 == null) goto L_0x1186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x1182, code lost:
        r5.A0V = r1.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x1186, code lost:
        r2 = r5.A00();
        X.0qQ.A0C(r2, "null cannot be cast to non-null type com.instagram.feed.controller.FeedListController<instagram.features.feed.fragment.ContextualFeedFragment>");
        r0.A0r = r2;
        registerLifecycleListener(r2);
        r4 = new X.0jB();
        r4.A06(r0.A1O.A00);
        r2 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x11a2, code lost:
        if (r2 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x11a4, code lost:
        r2.A07(r4.A00());
        r1 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x11ad, code lost:
        if (r1 == null) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x11af, code lost:
        r5 = r0.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x11b1, code lost:
        if (r5 != null) goto L_0x11ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x11b3, code lost:
        r19 = "contextualFeedControllerDelegate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x11b5, code lost:
        X.0qQ.A0F(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x11ba, code lost:
        r6 = r0.A0U;
        r2 = A00(r0);
        r4 = r1.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x11c4, code lost:
        if (r4 == null) goto L_0x11cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x11c6, code lost:
        r1 = r4.isEmpty();
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x11ca, code lost:
        if (r1 == false) goto L_0x1204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x11cc, code lost:
        if (r6 == null) goto L_0x11f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x11d2, code lost:
        if (r6.isEmpty() != false) goto L_0x11f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x11d4, code lost:
        r2 = X.1E7.A00(r2);
        r4 = new java.util.ArrayList();
        r6 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x11e5, code lost:
        if (r6.hasNext() == false) goto L_0x1204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x11e7, code lost:
        r1 = r2.A02((java.lang.String) r6.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x11f1, code lost:
        if (r1 == null) goto L_0x11f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x11f3, code lost:
        r4.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x11f7, code lost:
        A03(r0, true, false);
        r2 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x11fc, code lost:
        if (r2 == null) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x11fe, code lost:
        r2.A0P(r0.A0U);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x1204, code lost:
        r5.A8o(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x1207, code lost:
        r1 = new X.AnonymousClass36D(A00(r0), new X.GUW(r0), false, true);
        r0.A0C = r1;
        registerLifecycleListener(r1);
        r2 = new X.C234042wt(r0, A00(r0), r0);
        r2.A05 = r7;
        r2.A04 = r0.A14;
        r1 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x122b, code lost:
        if (r1 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x122d, code lost:
        r2.A00 = r1;
        registerLifecycleListener(r2);
        r0.A0f = new X.C52474GUa(r0);
        r0.A0g = new X.GUX(r0);
        r0.A0j = new X.C52475GUb(r0);
        r0.A0h = new X.GUY(r0);
        r0.A0i = new X.GUZ(r0);
        r3 = A00(r0);
        X.0qQ.A0B(r3, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x1279, code lost:
        if (X.182.A06(X.0Tu.A06, ((X.AnonymousClass35H) X.AnonymousClass1YB.A00(new X.C377209Ky(r3, 4)).getValue()).A00, 36328654455913986L) == false) goto L_0x128a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x127b, code lost:
        X.AnonymousClass4KB.A00(requireActivity(), r0, A00(r0), getModuleName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x128a, code lost:
        r3 = X.AnonymousClass1Nd.A00(A00(r0));
        r2 = X.C57066INg.class;
        r1 = r0.A0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x1296, code lost:
        if (r1 != null) goto L_0x129c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x1298, code lost:
        r18 = "mediaHiddenEventListener";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x129c, code lost:
        r3.A01(r1, r2);
        r2 = X.C57067INh.class;
        r1 = r0.A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x12a3, code lost:
        if (r1 != null) goto L_0x12a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x12a5, code lost:
        r18 = "mediaStatusUpdateEventListener";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x12a9, code lost:
        r3.A01(r1, r2);
        r2 = X.FWN.class;
        r1 = r0.A0j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x12b0, code lost:
        if (r1 != null) goto L_0x12b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x12b2, code lost:
        r18 = "repostDeletedEventListener";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x12b6, code lost:
        r3.A01(r1, r2);
        r3.A01(r0.A1N, X.C2370736f.class);
        r3.A01(r0.A1M, X.C2370836g.class);
        r3.A01(r0.A1K, X.C2370436c.class);
        r2 = X.C57075INp.class;
        r1 = r0.A0h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x12d2, code lost:
        if (r1 != null) goto L_0x12d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x12d4, code lost:
        r18 = "openCarouselReviewMediaConfigureFinishEventIgEventListener";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x12d8, code lost:
        r3.A01(r1, r2);
        r2 = X.C57073INn.class;
        r1 = r0.A0i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x12df, code lost:
        if (r1 != null) goto L_0x12e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x12e1, code lost:
        r18 = "openCarouselReviewMediaConfigureStartEventIgEventListener";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x12e5, code lost:
        r3.A01(r1, r2);
        r1 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x12ea, code lost:
        if (r1 == null) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x12ec, code lost:
        r1.A0J(r3);
        r4 = r0.A0T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x12f1, code lost:
        if (r4 == null) goto L_0x132a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x12f3, code lost:
        r17 = requireContext();
        r19 = A00(r0);
        r3 = r0.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x12fd, code lost:
        if (r3 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x12ff, code lost:
        r2 = r0.A0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x1303, code lost:
        if (r2 != -1) goto L_0x133c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x1305, code lost:
        r22 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x1307, code lost:
        r16 = new X.GMC(r17, r0, r19, r3, (X.C52012GBj) null, r22, r4, (java.lang.String) null, (java.lang.String) null);
        r73.EBt(r16);
        registerLifecycleListener(r16);
        r16.A02(r15);
        r16.A03(true);
        r0.A0u = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x132a, code lost:
        r1 = r0.A0w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x132c, code lost:
        if (r1 == null) goto L_0x1333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x132e, code lost:
        r73.EBt(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x1333, code lost:
        X.AnonymousClass0fD.A09(1546001121, r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x133b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x133c, code lost:
        r22 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x1341, code lost:
        X.0qQ.A0F("quickPromotionTooltipsController");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x1453, code lost:
        r2 = new java.lang.IllegalStateException("Required value was null.");
        r1 = 1233009284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x145e, code lost:
        r2 = new java.lang.IllegalStateException("Required value was null.");
        r1 = -267816714;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x1469, code lost:
        r2 = new java.lang.IllegalStateException("Required value was null.");
        r1 = -1989733269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x1474, code lost:
        r2 = new java.lang.IllegalStateException("Required value was null.");
        r1 = 163028199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x147e, code lost:
        X.AnonymousClass0fD.A09(r1, r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x1483, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x1204, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:532:0x134b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0359  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r75) {
        /*
            r74 = this;
            r0 = 298823435(0x11cfaf0b, float:3.276672E-28)
            int r34 = X.AnonymousClass0fD.A02(r0)
            r0 = r74
            r1 = r75
            super.onCreate(r1)
            android.os.Bundle r1 = r0.requireArguments()
            com.instagram.common.session.UserSession r3 = A00(r0)
            android.content.Context r2 = r0.requireContext()
            X.3KG r2 = X.AnonymousClass3KF.A00(r2, r3)
            r0.A0k = r2
            java.lang.String r2 = "feed_contextual"
            r0.setModuleNameV2(r2)
            java.lang.String r3 = "ContextualFeedFragment.ARGUMENTS_SOURCE_MEDIA_ID"
            r32 = 0
            r2 = r32
            java.lang.String r2 = r1.getString(r3, r2)
            r0.A16 = r2
            if (r2 == 0) goto L_0x004c
            com.instagram.common.session.UserSession r5 = A00(r0)
            java.lang.String r4 = r0.A16
            r2 = 0
            X.0qQ.A0B(r5, r2)
            java.lang.String r2 = "fragment_argument_ad_retrieval_key"
            java.lang.String r3 = r1.getString(r2)
            r2 = 0
            if (r4 == 0) goto L_0x004a
            X.1Xl r2 = X.C324666zh.A00(r5, r3, r4)
        L_0x004a:
            r0.A0F = r2
        L_0x004c:
            java.lang.String r24 = "ContextualFeedFragment.ARGUMENT_PARENT_CAROUSEL_MEDIA_ID"
            r3 = r24
            r2 = r32
            java.lang.String r2 = r1.getString(r3, r2)
            r0.A12 = r2
            java.lang.String r3 = "ContextualFeedFragment.ARGUMENT_PARENT_CAROUSEL_MEDIA_THUMBNAIL_URL"
            r2 = r32
            java.lang.String r2 = r1.getString(r3, r2)
            r0.A13 = r2
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENTS_SOURCE_MEDIA_CAROUSEL_INDEX"
            r3 = 0
            int r2 = r1.getInt(r2, r3)
            r0.A01 = r2
            java.lang.String r4 = "ContextualFeedFragment.ARGUMENTS_SOURCE_MEDIA_POSITION"
            r33 = -1
            r2 = r33
            int r2 = r1.getInt(r4, r2)
            r0.A02 = r2
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_SHOULD_OPEN_CAROUSEL_INDEX_OF_TAGGED_PHOTO"
            boolean r2 = r1.getBoolean(r2)
            r0.A1B = r2
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_HOST_PROFILE_USER_ID"
            java.lang.String r2 = r1.getString(r2)
            r0.A11 = r2
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_MEDIA_ID_LIST"
            java.util.ArrayList r2 = r1.getStringArrayList(r2)
            r0.A0U = r2
            java.lang.String r22 = "ContextualFeedFragment.ARGUMENT_MEDIA_INITIAL_POSITION"
            r2 = r22
            java.lang.String r2 = r1.getString(r2)
            r0.A0S = r2
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_NAVIGATION_EVENT_EXTRA.V2"
            java.io.Serializable r2 = r1.getSerializable(r2)
            X.0jB r2 = (X.0jB) r2
            r0.A09 = r2
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_EDIT_IN_ACTION_BAR"
            boolean r2 = r1.getBoolean(r2)
            r0.A1D = r2
            java.lang.String r19 = "ContextualFeedFragment.ARGUMENT_CONTEXTUAL_FEED_MODE"
            r2 = r19
            java.lang.String r2 = r1.getString(r2)
            r0.A0O = r2
            java.lang.String r2 = "selected_content_type"
            java.lang.String r2 = r1.getString(r2)
            r0.A0R = r2
            java.lang.String r2 = "call_to_action_button_text"
            java.lang.String r2 = r1.getString(r2)
            r0.A0P = r2
            java.lang.String r2 = "entry_point"
            java.lang.String r2 = r1.getString(r2)
            r0.A0Q = r2
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_PRIOR_MODULE"
            java.lang.String r2 = r1.getString(r2)
            r0.A14 = r2
            java.lang.String r4 = "ContextualFeedFragment.ARGUMENT_CONTENT_SCHEDULING_ENTRY_POINT"
            java.lang.String r2 = "UNKNOWN"
            java.lang.String r2 = r1.getString(r4, r2)
            X.0qQ.A07(r2)
            X.JVg r2 = X.C59722JVg.valueOf(r2)
            r0.A0e = r2
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_BOOST_GUIDANCE_BAR"
            boolean r2 = r1.getBoolean(r2)
            r0.A1C = r2
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_TOP_STICKY_BANNER"
            boolean r2 = r1.getBoolean(r2)
            r0.A0X = r2
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_SET_PAGING"
            boolean r2 = r1.getBoolean(r2)
            r0.A1A = r2
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_RESHARE_TARGET"
            java.lang.String r2 = r1.getString(r2)
            r0.A0T = r2
            java.lang.String r4 = "ContextualFeedFragment.ARGUMENT_RESHARE_HUB_MEDIA_POSITION"
            r2 = r33
            int r2 = r1.getInt(r4, r2)
            r0.A0a = r2
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENTS_STARTING_CLIPS_MEDIA_ID"
            r20 = -1
            r4 = r20
            long r4 = r1.getLong(r2, r4)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r0.A10 = r2
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENTS_STARTING_CLIPS_RANKING_INFO_TOKEN"
            java.lang.String r2 = r1.getString(r2)
            r0.A17 = r2
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_SHOW_ACTION_BAR_WHEN_SCROLL_DOWN"
            boolean r2 = r1.getBoolean(r2)
            r0.A1E = r2
            java.lang.String r2 = "ContextualFeedFragment.SEARCH_CONTEXT"
            android.os.Parcelable r2 = r1.getParcelable(r2)
            com.instagram.search.common.analytics.SearchContext r2 = (com.instagram.search.common.analytics.SearchContext) r2
            r0.A0x = r2
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_SUPPORTS_OPAL_CREATION"
            boolean r2 = r1.getBoolean(r2)
            r0.A1F = r2
            X.2ej r4 = X.C71682ef.A00()
            r2 = r32
            X.2el r2 = X.C71682ef.A01(r2, r4)
            r0.A0m = r2
            com.instagram.common.session.UserSession r2 = A00(r0)
            X.0qQ.A0B(r2, r3)
            X.0Tu r9 = X.0Tu.A05
            r4 = 36312110242857887(0x8101ac0012039f, double:3.0272629624905167E-306)
            boolean r2 = X.182.A06(r9, r2, r4)
            r0.A1G = r2
            boolean r2 = r0.A1E
            if (r2 == 0) goto L_0x143c
            X.Gc8 r2 = new X.Gc8
            r2.<init>()
        L_0x016b:
            r0.A0b = r2
            com.instagram.common.session.UserSession r4 = A00(r0)
            X.2el r2 = r0.A0m
            java.lang.String r31 = "viewPointManager"
            if (r2 == 0) goto L_0x1437
            X.2nI r2 = X.C229382nI.A02(r0, r0, r4, r2)
            r0.A0d = r2
            X.1L2 r4 = X.AnonymousClass1L1.A01
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_SESSION_ID"
            java.lang.String r2 = r1.getString(r2)
            X.1L1 r2 = r4.A01(r2)
            r0.A0M = r2
            com.instagram.common.session.UserSession r4 = A00(r0)
            X.2oD r2 = new X.2oD
            r2.<init>(r0, r4, r0, r0)
            r0.A0s = r2
            X.0Pk r5 = X.0Pl.A0n
            android.content.Context r4 = r0.requireContext()
            com.instagram.common.session.UserSession r2 = A00(r0)
            X.0Pl r45 = r5.A00(r4, r2)
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_EXTRA_ANALYTICS"
            android.os.Bundle r4 = r1.getBundle(r2)
            if (r4 == 0) goto L_0x01b1
            X.To7 r2 = r0.A1O
            r2.A00(r4)
        L_0x01b1:
            com.instagram.common.session.UserSession r2 = A00(r0)
            X.1E8 r4 = X.1E7.A00(r2)
            java.lang.String r2 = r0.A0S
            X.1Xj r15 = r4.A02(r2)
            com.instagram.common.session.UserSession r2 = A00(r0)
            X.2lW r2 = X.AnonymousClass2lV.A00(r2)
            r0.A0E = r2
            java.lang.String r5 = r0.getModuleName()
            com.instagram.common.session.UserSession r4 = A00(r0)
            r2 = 1
            X.0qQ.A0B(r5, r2)
            r2 = 2
            X.0qQ.A0B(r4, r2)
            X.GAQ r2 = new X.GAQ
            r2.<init>(r5, r4, r15)
            r0.A0G = r2
            r0.registerLifecycleListener(r2)
            java.lang.String r4 = r0.getModuleName()
            X.GUN r2 = new X.GUN
            r2.<init>(r0)
            X.2qA r8 = X.C230732q9.A00(r2, r4)
            com.instagram.common.session.UserSession r7 = A00(r0)
            java.lang.Integer r6 = X.AnonymousClass05K.A1F
            X.2el r5 = r0.A0m
            if (r5 == 0) goto L_0x1437
            X.2qB r4 = new X.2qB
            r10 = r32
            r4.<init>(r10, r8, r10)
            X.57M r18 = new X.57M
            r2 = r18
            r2.<init>(r7, r5, r4, r6)
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_IS_NAVIGATION_FROM_FULL_AUDIENCE_MEDIA_GRID"
            boolean r10 = r1.getBoolean(r2)
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_TAB_ANALYTICS_NAME"
            java.lang.String r28 = r1.getString(r2)
            com.instagram.common.session.UserSession r2 = A00(r0)
            X.0qQ.A0B(r2, r3)
            r4 = 36315829685849679(0x81050e00260e4f, double:3.029615153215521E-306)
            boolean r2 = X.182.A06(r9, r2, r4)
            if (r2 != 0) goto L_0x142f
            r8 = 1
        L_0x0227:
            com.instagram.common.session.UserSession r2 = A00(r0)
            java.lang.String r6 = r0.getModuleName()
            java.lang.String r4 = "grid"
            r5 = r28
            boolean r7 = r4.equals(r5)
            X.0qQ.A0B(r2, r3)
            r4 = 1
            X.0qQ.A0B(r6, r4)
            java.lang.String r23 = "feed_contextual_profile"
            r4 = r23
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x0263
            java.lang.String r4 = "feed_contextual_group_profile"
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x0263
            r4 = 36315829686046289(0x81050e00290e51, double:3.0296151533398577E-306)
            boolean r4 = X.182.A06(r9, r2, r4)
            if (r4 == 0) goto L_0x0276
            java.lang.String r4 = "feed_contextual_self_profile"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0276
        L_0x0263:
            if (r10 == 0) goto L_0x0276
            if (r8 == 0) goto L_0x0276
            if (r7 == 0) goto L_0x0276
            r4 = 36315829683359289(0x81050e00000e39, double:3.029615151640588E-306)
            boolean r2 = X.182.A06(r9, r2, r4)
            r16 = 1
            if (r2 != 0) goto L_0x0278
        L_0x0276:
            r16 = 0
        L_0x0278:
            java.lang.String r2 = r0.getModuleName()
            java.lang.String r27 = "feed_contextual_ads_chain"
            r4 = r27
            boolean r2 = X.0qQ.A0K(r2, r4)
            r0.A0W = r2
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_IS_ADS_CHAINING_FEED_ACP_ENABLED"
            boolean r2 = r1.getBoolean(r2, r3)
            r0.A0V = r2
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_IS_ELIGIBLE_FOR_REALTIME_SIGNAL_REPORTING"
            boolean r2 = r1.getBoolean(r2)
            java.lang.String r30 = "sessionProvider"
            if (r2 == 0) goto L_0x138c
            com.instagram.common.session.UserSession r4 = A00(r0)
            X.1L1 r2 = r0.A0M
            if (r2 == 0) goto L_0x1423
            X.2kz r17 = X.C228202kx.A00(r4, r0, r2)
        L_0x02a4:
            boolean r2 = r0.A0W
            if (r2 == 0) goto L_0x1369
            android.content.Context r36 = r0.requireContext()
            com.instagram.common.session.UserSession r37 = A00(r0)
            com.instagram.common.session.UserSession r5 = A00(r0)
            X.1L1 r2 = r0.A0M
            if (r2 == 0) goto L_0x1423
            X.2pK r4 = new X.2pK
            r4.<init>(r0, r5, r0, r2)
            java.lang.Integer r40 = X.AnonymousClass05K.A01
            X.2un r2 = new X.2un
            r35 = r2
            r38 = r4
            r39 = r0
            r35.<init>(r36, r37, r38, r39, r40)
        L_0x02ca:
            X.2uo r2 = (X.C233012uo) r2
        L_0x02cc:
            if (r15 == 0) goto L_0x0327
            com.instagram.common.session.UserSession r4 = A00(r0)
            com.instagram.user.model.User r8 = r15.A2A(r4)
            if (r8 == 0) goto L_0x1352
            java.lang.String r5 = r8.getId()
            com.instagram.common.session.UserSession r4 = A00(r0)
            java.lang.String r4 = r4.A06
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 != 0) goto L_0x1352
            X.17M r5 = r8.A02
            X.17M r4 = X.17M.A06
            if (r5 == r4) goto L_0x1352
            X.3X1 r5 = r15.A1w()
            X.3X1 r4 = X.AnonymousClass3X1.PREVIEW
            if (r5 != r4) goto L_0x1352
            androidx.fragment.app.FragmentActivity r35 = r0.requireActivity()
            com.instagram.common.session.UserSession r7 = A00(r0)
            r6 = 1
            X.0qQ.A0B(r7, r6)
            X.6jB r4 = X.C314986jA.A00(r7)
            X.0xa r4 = r4.A01
            java.lang.String r5 = "is_content_preview_nux_in_contextual_feed_shown"
            boolean r10 = r4.getBoolean(r5, r3)
            if (r10 != 0) goto L_0x0327
            X.0xY r4 = r4.AR4()
            r4.E5T(r5, r6)
            r4.apply()
            r36 = r0
            r37 = r7
            r38 = r8
            r39 = r32
            r40 = r3
            X.C56585I2p.A02(r35, r36, r37, r38, r39, r40)
        L_0x0327:
            java.lang.String r4 = r0.getModuleName()
            boolean r4 = X.GUR.A01(r4)
            if (r4 == 0) goto L_0x134b
            X.GcO r4 = new X.GcO
            r4.<init>(r0)
        L_0x0336:
            X.JRI r4 = (X.JRI) r4
            r0.A0A = r4
            com.instagram.common.session.UserSession r6 = A00(r0)
            java.lang.String r13 = r0.getModuleName()
            java.util.List r7 = r0.A0U
            if (r7 != 0) goto L_0x034b
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x034b:
            X.JRI r5 = r0.A0A
            if (r5 != 0) goto L_0x0359
            java.lang.String r18 = "contextualFeedControllerDelegate"
        L_0x0351:
            X.0qQ.A0F(r18)
        L_0x0354:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0359:
            X.MgK r11 = r0.A1R
            X.1L1 r10 = r0.A0M
            if (r10 == 0) goto L_0x1423
            boolean r4 = r0.A1D
            r44 = r4
            java.lang.String r8 = r0.A0T
            if (r8 == 0) goto L_0x0671
            com.instagram.common.session.UserSession r4 = A00(r0)
            X.2Dm r4 = X.1bJ.A00(r4)
            X.2Dr r4 = (X.2Dr) r4
            X.3U9 r4 = r4.A0N(r8)
            if (r4 == 0) goto L_0x0671
            java.lang.String r43 = r4.C6f()
        L_0x037b:
            X.1Xl r4 = r0.A0F
            r25 = r4
            X.GAQ r8 = r0.A0G
            java.lang.String r29 = "feedMediaLoadingTracker"
            if (r8 == 0) goto L_0x1346
            r14 = 1
            X.0qQ.A0B(r6, r14)
            r4 = 3
            X.0qQ.A0B(r13, r4)
            r4 = 8
            X.0qQ.A0B(r11, r4)
            java.lang.String r12 = "Static"
            r4 = r19
            java.lang.String r4 = r1.getString(r4, r12)
            if (r4 == 0) goto L_0x03a7
            int r19 = r4.hashCode()
            java.lang.String r26 = "Required value was null."
            java.lang.String r35 = "ContextualFeedFragment.ARGUMENT_NETWORK_CONFIG"
            switch(r19) {
                case -1989729132: goto L_0x062a;
                case -1952846446: goto L_0x05f3;
                case -1932766292: goto L_0x05cd;
                case -1869393210: goto L_0x05af;
                case -1844162201: goto L_0x05ac;
                case -1808614770: goto L_0x05a6;
                case -1653122393: goto L_0x058b;
                case -1600522679: goto L_0x0566;
                case -1482336415: goto L_0x0440;
                case -1426359066: goto L_0x053d;
                case -1305914996: goto L_0x0506;
                case -816921555: goto L_0x04e7;
                case -605450736: goto L_0x04e3;
                case 2573360: goto L_0x04be;
                case 79658599: goto L_0x0492;
                case 226755807: goto L_0x047f;
                case 358397133: goto L_0x0444;
                case 535944908: goto L_0x043c;
                case 708324905: goto L_0x0438;
                case 1046563131: goto L_0x0434;
                case 1339223856: goto L_0x0409;
                case 1965687765: goto L_0x03e3;
                case 2067166384: goto L_0x03b3;
                default: goto L_0x03a7;
            }
        L_0x03a7:
            java.lang.String r0 = "Unsupported ContextualFeedMode:"
            java.lang.String r1 = X.002.A0R(r0, r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x03b3:
            r7 = 2170(0x87a, float:3.041E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x03a7
            r4 = r22
            java.lang.String r7 = X.C320236s2.A01(r1, r4)
            android.content.Context r37 = r0.requireContext()
            X.0gy r38 = X.AnonymousClass07i.A00(r0)
            r4 = 2
            X.0qQ.A0B(r7, r4)
            X.HAm r4 = new X.HAm
            r36 = r4
            r39 = r6
            r40 = r5
            r41 = r7
            r36.<init>(r37, r38, r39, r40, r41)
            X.0qQ.A0A(r4)
            goto L_0x0649
        L_0x03e3:
            java.lang.String r7 = "Location"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x03a7
            java.lang.String r4 = "contextual_feed_config"
            android.os.Parcelable r7 = r1.getParcelable(r4)
            r7.getClass()
            com.instagram.location.contextualfeed.intf.LocationContextualFeedConfig r7 = (com.instagram.location.contextualfeed.intf.LocationContextualFeedConfig) r7
            X.UlX r4 = new X.UlX
            r36 = r4
            r37 = r0
            r38 = r6
            r39 = r5
            r40 = r7
            r41 = r11
            r36.<init>(r37, r38, r39, r40, r41)
            goto L_0x0647
        L_0x0409:
            java.lang.String r7 = "Liked_Feed"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x03a7
            java.lang.Class<com.instagram.feed.intf.ContextualFeedNetworkConfig> r7 = com.instagram.feed.intf.ContextualFeedNetworkConfig.class
            r4 = r35
            android.os.Parcelable r7 = X.C320236s2.A00(r1, r7, r4)
            com.instagram.feed.intf.ContextualFeedNetworkConfig r7 = (com.instagram.feed.intf.ContextualFeedNetworkConfig) r7
            X.HAp r4 = new X.HAp
            android.content.Context r37 = r0.requireContext()
            X.0gy r38 = X.AnonymousClass07i.A00(r0)
            r36 = r4
            r39 = r6
            r40 = r5
            r41 = r7
            r42 = r43
            r36.<init>(r37, r38, r39, r40, r41, r42)
            goto L_0x0647
        L_0x0434:
            java.lang.String r7 = "Fan_Club_Feed"
            goto L_0x05b1
        L_0x0438:
            java.lang.String r7 = "Older_Feed"
            goto L_0x05b1
        L_0x043c:
            java.lang.String r7 = "Following_Feed"
            goto L_0x05b1
        L_0x0440:
            java.lang.String r8 = "BUSINESS_INSPIRATION_HUB"
            goto L_0x0630
        L_0x0444:
            r8 = 1260(0x4ec, float:1.766E-42)
            java.lang.String r8 = X.C273654mx.A00(r8)
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x03a7
            java.lang.String r4 = X.C53352Gmc.A03
            java.lang.String r4 = r1.getString(r4)
            if (r4 == 0) goto L_0x047c
            com.instagram.api.schemas.AdsAPIInstagramPosition r10 = X.V70.A00(r4)
        L_0x045c:
            java.lang.String r4 = X.C53352Gmc.A02
            java.lang.String r4 = r1.getString(r4)
            if (r10 == 0) goto L_0x0636
            X.Gmc r8 = new X.Gmc
            r8.<init>(r10, r4)
            X.HKj r4 = new X.HKj
            r36 = r4
            r37 = r0
            r38 = r6
            r39 = r5
            r40 = r8
            r41 = r7
            r36.<init>(r37, r38, r39, r40, r41)
            goto L_0x0647
        L_0x047c:
            r10 = r32
            goto L_0x045c
        L_0x047f:
            r8 = 2393(0x959, float:3.353E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r8)
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x03a7
            X.HAn r4 = new X.HAn
            r4.<init>(r0, r6, r5, r7)
            goto L_0x0647
        L_0x0492:
            java.lang.String r7 = "Saved"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x03a7
            java.lang.String r4 = "contextual_feed_config"
            android.os.Parcelable r7 = r1.getParcelable(r4)
            r7.getClass()
            com.instagram.save.contextualfeed.intf.SavedContextualFeedNetworkConfig r7 = (com.instagram.save.contextualfeed.intf.SavedContextualFeedNetworkConfig) r7
            java.lang.String r4 = "ContextualFeedFragment.ARGUMENT_FEED_TITLE"
            java.lang.String r42 = r1.getString(r4)
            X.HAq r4 = new X.HAq
            r36 = r4
            r37 = r0
            r38 = r0
            r39 = r6
            r40 = r5
            r41 = r7
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)
            goto L_0x0647
        L_0x04be:
            java.lang.String r7 = "Serp"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x03a7
            java.lang.Class<com.instagram.search.surface.fragment.contextualfeed.SerpContextualFeedConfig> r7 = com.instagram.search.surface.fragment.contextualfeed.SerpContextualFeedConfig.class
            java.lang.String r4 = "contextual_feed_config"
            android.os.Parcelable r7 = X.C320236s2.A00(r1, r7, r4)
            com.instagram.search.surface.fragment.contextualfeed.SerpContextualFeedConfig r7 = (com.instagram.search.surface.fragment.contextualfeed.SerpContextualFeedConfig) r7
            X.Mqn r4 = new X.Mqn
            r36 = r4
            r37 = r0
            r38 = r6
            r39 = r5
            r40 = r7
            r41 = r11
            r36.<init>(r37, r38, r39, r40, r41)
            goto L_0x0647
        L_0x04e3:
            java.lang.String r7 = "Throwback_Feed"
            goto L_0x05b1
        L_0x04e7:
            java.lang.String r7 = "ADS_CHAINING_FEED"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x03a7
            if (r2 == 0) goto L_0x1443
            X.HAs r4 = new X.HAs
            r36 = r4
            r37 = r1
            r38 = r6
            r39 = r5
            r40 = r8
            r41 = r2
            r42 = r13
            r36.<init>(r37, r38, r39, r40, r41, r42)
            goto L_0x0647
        L_0x0506:
            java.lang.String r8 = "open_carousel_review_page"
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x03a7
            r8 = r24
            r4 = r32
            java.lang.String r40 = r1.getString(r8, r4)
            r4 = 214(0xd6, float:3.0E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            boolean r43 = r1.getBoolean(r4, r3)
            r4 = 34
            java.lang.String r8 = X.C273654mx.A00(r4)
            r4 = r32
            java.lang.String r41 = r1.getString(r8, r4)
            X.HAr r4 = new X.HAr
            r36 = r4
            r37 = r0
            r38 = r6
            r39 = r5
            r42 = r7
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)
            goto L_0x0647
        L_0x053d:
            r7 = 2342(0x926, float:3.282E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x03a7
            java.lang.Class<com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig> r7 = com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig.class
            java.lang.String r4 = "contextual_feed_config"
            android.os.Parcelable r7 = X.C320236s2.A00(r1, r7, r4)
            com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig r7 = (com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig) r7
            X.UlW r4 = new X.UlW
            r36 = r4
            r37 = r0
            r38 = r6
            r39 = r5
            r40 = r7
            r41 = r11
            r36.<init>(r37, r38, r39, r40, r41)
            goto L_0x0647
        L_0x0566:
            r7 = 966(0x3c6, float:1.354E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x03a7
            X.GcI r4 = new X.GcI
            if (r2 == 0) goto L_0x144b
            r36 = r4
            r37 = r1
            r38 = r0
            r39 = r6
            r40 = r5
            r41 = r8
            r42 = r2
            r43 = r13
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)
            goto L_0x0647
        L_0x058b:
            java.lang.String r8 = "SCHEDULED_CONTENT"
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x03a7
            X.HAo r4 = new X.HAo
            r36 = r4
            r37 = r0
            r38 = r6
            r39 = r5
            r40 = r7
            r41 = r14
            r36.<init>(r37, r38, r39, r40, r41)
            goto L_0x0647
        L_0x05a6:
            boolean r8 = r4.equals(r12)
            goto L_0x0634
        L_0x05ac:
            java.lang.String r7 = "Ifr_Only_Feed"
            goto L_0x05b1
        L_0x05af:
            java.lang.String r7 = "Favorites_Feed"
        L_0x05b1:
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x03a7
            X.GcK r4 = new X.GcK
            r36 = r4
            r37 = r1
            r38 = r0
            r39 = r6
            r40 = r5
            r41 = r17
            r42 = r10
            r43 = r13
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)
            goto L_0x0647
        L_0x05cd:
            java.lang.String r7 = "Hashtag"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x03a7
            java.lang.Class<com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig> r7 = com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig.class
            java.lang.String r4 = "contextual_feed_config"
            android.os.Parcelable r7 = X.C320236s2.A00(r1, r7, r4)
            com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig r7 = (com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig) r7
            X.UlY r4 = new X.UlY
            r36 = r4
            r37 = r0
            r38 = r0
            r39 = r6
            r40 = r5
            r41 = r7
            r42 = r11
            r36.<init>(r37, r38, r39, r40, r41, r42)
            goto L_0x0647
        L_0x05f3:
            java.lang.String r7 = "User_Feed"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x03a7
            java.lang.Class<com.instagram.feed.intf.ContextualFeedNetworkConfig> r7 = com.instagram.feed.intf.ContextualFeedNetworkConfig.class
            r4 = r35
            android.os.Parcelable r12 = X.C320236s2.A00(r1, r7, r4)
            com.instagram.feed.intf.ContextualFeedNetworkConfig r12 = (com.instagram.feed.intf.ContextualFeedNetworkConfig) r12
            X.ToW r4 = new X.ToW
            android.content.Context r11 = r0.requireContext()
            X.0gy r10 = X.AnonymousClass07i.A00(r0)
            X.2lw r8 = new X.2lw
            r7 = r32
            r8.<init>(r11, r10, r7)
            r36 = r4
            r37 = r0
            r38 = r6
            r39 = r8
            r40 = r5
            r41 = r12
            r42 = r25
            r43 = r13
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44)
            goto L_0x0647
        L_0x062a:
            r8 = 875(0x36b, float:1.226E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r8)
        L_0x0630:
            boolean r8 = r4.equals(r8)
        L_0x0634:
            if (r8 == 0) goto L_0x03a7
        L_0x0636:
            X.HAo r4 = new X.HAo
            r36 = r4
            r37 = r0
            r38 = r6
            r39 = r5
            r40 = r7
            r41 = r3
            r36.<init>(r37, r38, r39, r40, r41)
        L_0x0647:
            X.GAR r4 = (X.GAR) r4
        L_0x0649:
            r0.A0B = r4
            java.lang.String r19 = "contextualFeedController"
            if (r4 == 0) goto L_0x11b5
            r4.A0B()
            com.instagram.common.session.UserSession r6 = A00(r0)
            android.content.Context r5 = r0.requireContext()
            X.2kR r25 = new X.2kR
            r4 = r25
            r4.<init>(r5, r6, r0)
            androidx.fragment.app.FragmentActivity r37 = r0.requireActivity()
            X.1L1 r7 = r0.A0M
            if (r7 == 0) goto L_0x1423
            X.2oD r6 = r0.A0s
            if (r6 != 0) goto L_0x0675
            java.lang.String r18 = "inlineComposerDelegate"
            goto L_0x0351
        L_0x0671:
            r43 = 0
            goto L_0x037b
        L_0x0675:
            X.2nI r5 = r0.A0d
            java.lang.String r12 = "igBloksFragmentHost"
            if (r5 == 0) goto L_0x111b
            X.GAR r4 = r0.A0B
            if (r4 == 0) goto L_0x11b5
            boolean r55 = r4.A0f()
            java.lang.String r4 = "ContextualFeedFragment.ARGUMENT_SHOULD_HIDE_UFI_BUTTONS"
            boolean r57 = r1.getBoolean(r4)
            androidx.fragment.app.FragmentActivity r8 = r0.requireActivity()
            X.2rx r4 = new X.2rx
            r4.<init>(r0, r8)
            X.GAR r8 = r0.A0B
            if (r8 == 0) goto L_0x11b5
            java.lang.Integer r49 = r8.A07()
            X.0qQ.A07(r49)
            java.lang.String r11 = r0.A12
            java.lang.String r10 = r0.A13
            boolean r8 = r0.A1C
            java.lang.Boolean r48 = java.lang.Boolean.valueOf(r8)
            com.instagram.search.common.analytics.SearchContext r8 = r0.A0x
            java.lang.String r51 = "contextual_feed"
            java.lang.String r52 = "explore_unconnected"
            X.2s3 r36 = new X.2s3
            r38 = r0
            r39 = r4
            r40 = r5
            r41 = r32
            r42 = r32
            r43 = r6
            r44 = r25
            r46 = r8
            r47 = r7
            r50 = r32
            r53 = r11
            r54 = r10
            r56 = r14
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            com.instagram.common.session.UserSession r7 = A00(r0)
            java.lang.String r5 = r0.getModuleName()
            X.34R r6 = new X.34R
            r4 = r32
            r6.<init>(r7, r4, r5)
            com.instagram.common.session.UserSession r5 = A00(r0)
            java.lang.String r4 = r0.getModuleName()
            X.34L r7 = new X.34L
            r7.<init>(r5, r4)
            com.instagram.common.session.UserSession r4 = A00(r0)
            X.1wY r5 = X.1wY.A00(r4)
            java.lang.String r4 = r0.getModuleName()
            java.lang.Integer r8 = X.1wY.A0F
            X.0qQ.A08(r8)
            r5.A07(r7, r6, r4)
            X.1Xl r4 = r0.A0F
            if (r4 == 0) goto L_0x0718
            boolean r4 = X.1sx.A0P(r4)
            if (r4 == 0) goto L_0x0718
            android.content.Context r4 = r0.requireContext()
            X.6zK r4 = X.C324456zJ.A00(r4)
            r0.A0H = r4
            r0.registerLifecycleListener(r4)
            java.lang.String r4 = "ContextualFeedFragment.ARGUMENTS_SHOULD_ADD_UNIVERSAL_CTA_GAP"
            r1.putBoolean(r4, r14)
        L_0x0718:
            X.2nI r10 = r0.A0d
            if (r10 == 0) goto L_0x111b
            androidx.fragment.app.FragmentActivity r54 = r0.requireActivity()
            X.1L1 r8 = r0.A0M
            if (r8 == 0) goto L_0x1423
            X.GTW r4 = r0.A1H
            r73 = r4
            X.GUQ r7 = new X.GUQ
            r7.<init>(r0)
            X.GUP r6 = new X.GUP
            r6.<init>(r0)
            X.GAR r4 = r0.A0B
            if (r4 == 0) goto L_0x11b5
            boolean r70 = r4.A0f()
            X.GAR r4 = r0.A0B
            if (r4 == 0) goto L_0x11b5
            boolean r71 = r4.A0T()
            X.GAR r4 = r0.A0B
            if (r4 == 0) goto L_0x11b5
            X.1sy r61 = r4.A06()
            java.lang.Integer r67 = r4.A07()
            X.0qQ.A07(r67)
            X.GAR r4 = r0.A0B
            if (r4 == 0) goto L_0x11b5
            r4.A0X()
            com.instagram.common.session.UserSession r5 = A00(r0)
            X.GTm r4 = new X.GTm
            r4.<init>(r5, r0)
            boolean r12 = r0.A1B
            java.lang.String r11 = r0.A11
            com.instagram.search.common.analytics.SearchContext r5 = r0.A0x
            r52 = r1
            r53 = r0
            r55 = r10
            r56 = r36
            r57 = r73
            r58 = r4
            r59 = r25
            r60 = r7
            r62 = r6
            r63 = r18
            r64 = r5
            r65 = r0
            r66 = r8
            r68 = r51
            r69 = r11
            r72 = r12
            X.HDB r5 = X.GUR.A00(r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)
            r0.A0N = r5
            java.lang.String r18 = "adapter"
            if (r5 == 0) goto L_0x0351
            X.GAR r4 = r0.A0B
            if (r4 == 0) goto L_0x11b5
            boolean r4 = r4.A0c()
            r5.A0D(r4)
            com.instagram.common.session.UserSession r6 = A00(r0)
            X.0qQ.A0B(r6, r3)
            r4 = 2342154346361258492(0x208100f8000001fc, double:4.058240516221262E-152)
            boolean r4 = X.182.A06(r9, r6, r4)
            if (r4 == 0) goto L_0x07c9
            int r4 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            A00(r0)
            X.02m r6 = X.02m.A0p
            X.0qQ.A07(r6)
            java.lang.String r5 = r0.getModuleName()
            X.36s r4 = new X.36s
            r4.<init>(r6, r5)
            r0.A0w = r4
            X.HDB r5 = r0.A0N
            if (r5 == 0) goto L_0x0351
            r5.mViewLifecycleListener = r4
        L_0x07c9:
            X.HDB r5 = r0.A0N
            if (r5 == 0) goto L_0x0351
            r5.A06()
            X.GAR r4 = r0.A0B
            if (r4 == 0) goto L_0x11b5
            X.HLd r4 = r4.A05()
            r5.A08(r4)
            java.lang.String r5 = r0.A0O
            java.lang.String r4 = "Following_Feed"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0826
            com.instagram.common.session.UserSession r6 = A00(r0)
            X.0qQ.A0B(r6, r3)
            r4 = 36318857635306003(0x8107cf00001a13, double:3.031530040644274E-306)
            boolean r4 = X.182.A06(r9, r6, r4)
            if (r4 == 0) goto L_0x0826
            android.content.Context r37 = r0.requireContext()
            X.2el r7 = r0.A0m
            if (r7 == 0) goto L_0x1437
            X.HDB r6 = r0.A0N
            if (r6 == 0) goto L_0x0351
            X.G72 r6 = (X.G72) r6
            com.instagram.common.session.UserSession r40 = A00(r0)
            java.lang.String r4 = r0.getModuleName()
            X.0xG r5 = new X.0xG
            r5.<init>(r4)
            X.EEQ r4 = new X.EEQ
            r36 = r4
            r39 = r5
            r41 = r7
            r42 = r6
            r43 = r73
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)
            r0.A0q = r4
            r0.registerLifecycleListener(r4)
        L_0x0826:
            com.instagram.common.session.UserSession r6 = A00(r0)
            java.lang.String r5 = r0.getModuleName()
            X.0qQ.A0B(r6, r3)
            X.0qQ.A0B(r5, r14)
            java.lang.String r24 = "feed_contextual_keyword"
            r4 = r24
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x084b
            r4 = 36316997914465008(0x81061e000012f0, double:3.030353945695934E-306)
            boolean r4 = X.182.A06(r9, r6, r4)
            r22 = 1
            if (r4 != 0) goto L_0x084d
        L_0x084b:
            r22 = 0
        L_0x084d:
            boolean r4 = r0.A0W
            if (r4 == 0) goto L_0x0c08
            com.instagram.common.session.UserSession r5 = A00(r0)
            java.lang.String r10 = r0.getSessionId()
            java.lang.String r8 = r0.getModuleName()
            X.HDB r4 = r0.A0N
            if (r4 == 0) goto L_0x0351
            if (r2 == 0) goto L_0x1453
            X.2un r2 = (X.C233002un) r2
            X.GUk r12 = new X.GUk
            r12.<init>()
            X.0qQ.A0B(r5, r3)
            r6 = 2
            X.0qQ.A0B(r10, r6)
            r6 = 3
            X.0qQ.A0B(r8, r6)
            r6 = 5
            X.0qQ.A0B(r2, r6)
            X.HEb r7 = X.C54447HEb.A00
            X.C52485GUn.A00(r7)
            X.1PG r6 = X.1PG.A00(r5)
            X.3kU r11 = r6.A06(r7)
            X.0qQ.A07(r11)
            X.1PG r6 = X.1PG.A00(r5)
            X.2vA r6 = r6.A03(r7)
            X.2vG r10 = X.C55279Hf8.A00(r5, r6, r0, r10, r8)
            X.0qQ.A0B(r10, r3)
            r2.A0B = r10
            X.IY8 r8 = new X.IY8
            r8.<init>(r5, r4)
            X.IXq r7 = new X.IXq
            r7.<init>()
            X.GUr r41 = new X.GUr
            r41.<init>()
            X.HF1 r6 = new X.HF1
            r35 = r6
            r36 = r5
            r37 = r7
            r38 = r8
            r39 = r10
            r40 = r11
            r35.<init>(r36, r37, r38, r39, r40, r41)
            X.HFF r13 = new X.HFF
            r13.<init>(r7, r11, r4)
            X.2w4 r5 = X.C233632w4.A05
            X.2w5 r4 = new X.2w5
            r4.<init>(r5)
            r4.A0G = r2
            r4.A0K = r10
            r4.A0L = r11
            r4.A0J = r6
            r4.A0N = r13
            r4.A0H = r8
            r4.A0E = r7
            r4.A0P = r12
            X.2wB r2 = new X.2wB
            r2.<init>()
            r4.A0R = r2
            r4.A0p = r3
            X.2wV r2 = r4.A00()
        L_0x08e3:
            r0.A0L = r2
        L_0x08e5:
            r10 = 0
        L_0x08e6:
            r2 = 0
        L_0x08e7:
            android.content.Context r7 = r0.requireContext()
            com.instagram.common.session.UserSession r6 = A00(r0)
            X.GUU r5 = new X.GUU
            r5.<init>(r0)
            X.7Q8 r4 = new X.7Q8
            r4.<init>(r7, r6, r5)
            r0.registerLifecycleListener(r4)
            int r4 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            android.content.Context r5 = r0.requireContext()
            r4 = r32
            X.2js r6 = X.C227752jr.A00(r5, r4, r3)
            r0.A06 = r6
            X.HDB r5 = r0.A0N
            if (r5 == 0) goto L_0x0351
            r4 = r73
            X.2ku r4 = r4.A01
            X.2xD r8 = new X.2xD
            r8.<init>(r0, r6, r4, r5)
            android.content.Context r7 = r0.requireContext()
            com.instagram.common.session.UserSession r6 = A00(r0)
            X.2xP r5 = X.C234242xR.A00()
            X.2xq r4 = new X.2xq
            r4.<init>(r7, r6, r0, r5)
            r0.A0v = r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.1L1 r4 = r0.A0M
            if (r4 == 0) goto L_0x1423
            java.lang.String r4 = r4.A00
            if (r4 == 0) goto L_0x0c01
            com.instagram.common.session.UserSession r7 = A00(r0)
            if (r16 == 0) goto L_0x0b88
            X.1L1 r4 = r0.A0M
            if (r4 == 0) goto L_0x1423
            java.lang.String r4 = r4.A00
            X.0qQ.A0B(r7, r3)
            X.0qQ.A0B(r4, r14)
            X.GUy r5 = new X.GUy
            r5.<init>(r7, r0, r4)
            X.2pc r4 = X.C230432pc.PROFILE_FEED
            X.2y6 r5 = X.AnonymousClass2y5.A00(r7, r5, r4)
        L_0x0954:
            X.2y7 r4 = new X.2y7
            r4.<init>(r5)
        L_0x0959:
            r6.add(r4)
            if (r10 == 0) goto L_0x0966
            X.GUH r4 = new X.GUH
            r4.<init>(r10)
            r6.add(r4)
        L_0x0966:
            if (r16 != 0) goto L_0x0b53
            if (r22 != 0) goto L_0x0b53
            r16 = 0
        L_0x096c:
            X.2wV r4 = r0.A0L
            if (r4 == 0) goto L_0x097a
            java.lang.String r5 = r4.A05
            X.GUx r4 = new X.GUx
            r4.<init>(r5)
            r6.add(r4)
        L_0x097a:
            X.GAR r5 = r0.A0B
            if (r5 == 0) goto L_0x11b5
            boolean r4 = r5 instanceof X.C14030ToW
            if (r4 == 0) goto L_0x0b4f
            X.ToW r5 = (X.C14030ToW) r5
            com.instagram.user.model.User r4 = r5.A01
            if (r4 == 0) goto L_0x0b4f
            java.lang.String r47 = r4.getId()
        L_0x098c:
            android.content.Context r35 = r0.requireContext()
            androidx.fragment.app.FragmentActivity r36 = r0.requireActivity()
            com.instagram.common.session.UserSession r38 = A00(r0)
            X.1L1 r7 = r0.A0M
            if (r7 == 0) goto L_0x1423
            X.2el r5 = r0.A0m
            if (r5 == 0) goto L_0x1437
            X.GAR r4 = r0.A0B
            if (r4 == 0) goto L_0x11b5
            X.1sy r42 = r4.A06()
            X.0qQ.A07(r42)
            X.2xq r10 = r0.A0v
            X.GAQ r4 = r0.A0G
            if (r4 == 0) goto L_0x1346
            r37 = r0
            r39 = r5
            r40 = r0
            r41 = r4
            r43 = r32
            r44 = r32
            r45 = r10
            r46 = r7
            r48 = r6
            X.30S r6 = X.GU3.A00(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            X.1YN r11 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r10 = A00(r0)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            com.instagram.quickpromotion.intf.QPTooltipAnchor r5 = com.instagram.quickpromotion.intf.QPTooltipAnchor.MEDIA_OPTIONS_ICON
            X.2qQ r4 = new X.2qQ
            r4.<init>()
            r7.put(r5, r4)
            X.2qT r5 = r11.A04(r10, r7)
            r0.A0K = r5
            java.lang.String r13 = "quickPromotionTooltipsController"
            androidx.fragment.app.FragmentActivity r4 = r0.getActivity()
            r5.A00 = r4
            X.1YN r48 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r51 = A00(r0)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r53 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0I
            X.AnonymousClass2bO.A00()
            X.GUV r5 = new X.GUV
            r5.<init>(r0)
            X.2qT r4 = r0.A0K
            if (r4 == 0) goto L_0x1341
            r35 = r32
            r36 = r32
            r37 = r32
            r38 = r32
            r39 = r32
            r40 = r32
            r41 = r32
            r42 = r32
            r43 = r5
            r45 = r4
            r46 = r32
            r47 = r32
            X.2bW r52 = X.2bV.A00(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r49 = r0
            r50 = r0
            X.2qi r4 = r48.A01(r49, r50, r51, r52, r53)
            r0.A0J = r4
            java.lang.String r4 = "shopping_session_id"
            java.lang.String r7 = r1.getString(r4)
            com.instagram.common.session.UserSession r11 = A00(r0)
            java.lang.String r10 = r0.getModuleName()
            X.0qQ.A0B(r11, r3)
            X.0qQ.A0B(r10, r14)
            r4 = 36315829683883583(0x81050e00080e3f, double:3.029615151972154E-306)
            boolean r12 = X.182.A06(r9, r11, r4)
            r4 = 36315829683949120(0x81050e00090e40, double:3.0296151520135996E-306)
            boolean r5 = X.182.A06(r9, r11, r4)
            r4 = r23
            boolean r4 = r10.equals(r4)
            if (r4 != 0) goto L_0x0a5e
            java.lang.String r4 = "feed_contextual_group_profile"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x0b0e
        L_0x0a5e:
            if (r12 != 0) goto L_0x0a62
            if (r5 == 0) goto L_0x0b0e
        L_0x0a62:
            com.instagram.common.session.UserSession r5 = A00(r0)
            X.HDB r4 = r0.A0N
            if (r4 == 0) goto L_0x0351
            X.GAS r10 = new X.GAS
            r10.<init>(r5, r0, r4)
            X.HDB r9 = r0.A0N
            if (r9 == 0) goto L_0x0351
            boolean r5 = r0.A1G
        L_0x0a75:
            X.30c r4 = new X.30c
            r35 = r4
            r36 = r0
            r37 = r10
            r38 = r0
            r39 = r9
            r40 = r5
            r35.<init>(r36, r37, r38, r39, r40)
            r0.A0p = r4
        L_0x0a88:
            com.instagram.common.session.UserSession r4 = A00(r0)
            boolean r4 = X.AnonymousClass2o2.A06(r4)
            if (r4 == 0) goto L_0x0aa5
            com.instagram.common.session.UserSession r10 = A00(r0)
            X.Lip r9 = X.C54975Ha8.A00(r10)
            X.6jB r5 = X.C314986jA.A00(r10)
            com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl r4 = new com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl
            r4.<init>(r0, r10, r9, r5)
            r0.A0o = r4
        L_0x0aa5:
            X.0hq r10 = r0.mFragmentManager
            X.HDB r9 = r0.A0N
            if (r9 == 0) goto L_0x0351
            X.32x r5 = new X.32x
            r4 = r25
            r5.<init>(r0, r10, r9, r4)
            r5.A0C = r8
            X.2el r4 = r0.A0m
            if (r4 == 0) goto L_0x1437
            r5.A04 = r4
            r5.A0H = r6
            r4 = r32
            r5.A0G = r4
            X.2xq r4 = r0.A0v
            r5.A0K = r4
            r5.A0W = r7
            r4 = r16
            r5.A0a = r4
            X.1L1 r4 = r0.A0M
            if (r4 == 0) goto L_0x1423
            r5.A0R = r4
            java.lang.String r8 = r0.getModuleName()
            int r6 = r8.hashCode()
            r4 = -600899844(0xffffffffdc2efefc, float:-1.97028017E17)
            if (r6 == r4) goto L_0x0b00
            r4 = 339532540(0x143cdafc, float:9.5347615E-27)
            if (r6 == r4) goto L_0x0b02
            r4 = 1805942339(0x6ba47e43, float:3.9772018E26)
            if (r6 != r4) goto L_0x0b0a
            java.lang.String r4 = "feed_contextual_self_profile"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x0b0a
        L_0x0aef:
            r4 = 23599577(0x16819d9, float:4.2630215E-38)
        L_0x0af2:
            r5.A00 = r4
            com.instagram.common.session.UserSession r9 = A00(r0)
            X.2qi r8 = r0.A0J
            if (r8 != 0) goto L_0x1120
            java.lang.String r18 = "quickPromotionDelegate"
            goto L_0x0351
        L_0x0b00:
            java.lang.String r23 = "feed_contextual_group_profile"
        L_0x0b02:
            r4 = r23
            boolean r4 = r8.equals(r4)
            if (r4 != 0) goto L_0x0aef
        L_0x0b0a:
            r4 = 23594329(0x1680559, float:4.2615507E-38)
            goto L_0x0af2
        L_0x0b0e:
            com.instagram.common.session.UserSession r10 = A00(r0)
            java.lang.String r5 = r0.getModuleName()
            X.0qQ.A0B(r10, r3)
            X.0qQ.A0B(r5, r14)
            r4 = r24
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0a88
            r4 = 36316997914596082(0x81061e000212f2, double:3.0303539457788256E-306)
            boolean r4 = X.182.A06(r9, r10, r4)
            if (r4 != 0) goto L_0x0b3a
            r4 = 36316997914661619(0x81061e000312f3, double:3.0303539458202714E-306)
            boolean r4 = X.182.A06(r9, r10, r4)
            if (r4 == 0) goto L_0x0a88
        L_0x0b3a:
            com.instagram.common.session.UserSession r5 = A00(r0)
            X.HDB r4 = r0.A0N
            if (r4 == 0) goto L_0x0351
            X.GcC r10 = new X.GcC
            r10.<init>(r5, r0, r4)
            X.HDB r9 = r0.A0N
            if (r9 == 0) goto L_0x0351
            boolean r5 = r0.A1G
            goto L_0x0a75
        L_0x0b4f:
            r47 = 0
            goto L_0x098c
        L_0x0b53:
            X.HDB r5 = r0.A0N
            if (r5 == 0) goto L_0x0351
            X.GUv r4 = new X.GUv
            r4.<init>(r5)
            r6.add(r4)
            if (r16 == 0) goto L_0x0b85
            com.instagram.common.session.UserSession r11 = A00(r0)
            java.lang.String r10 = r0.getModuleName()
            com.instagram.feed.intf.ContextualFeedNetworkConfig r4 = r0.A0t
            if (r4 == 0) goto L_0x1474
            java.lang.String r7 = r4.A04
            X.GUw r5 = new X.GUw
            r4 = r28
            r5.<init>(r11, r10, r4, r7)
            r6.add(r5)
        L_0x0b79:
            if (r22 == 0) goto L_0x096c
            X.GcD r4 = new X.GcD
            r4.<init>(r15)
            r6.add(r4)
            goto L_0x096c
        L_0x0b85:
            r16 = 0
            goto L_0x0b79
        L_0x0b88:
            java.lang.String r5 = r0.getModuleName()
            X.0qQ.A0B(r7, r3)
            X.0qQ.A0B(r5, r14)
            r4 = r27
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0bc4
            X.0Tu r11 = X.0Tu.A06
            r4 = 36312887635019155(0x81026100410593, double:3.0277545884236095E-306)
            boolean r4 = X.182.A06(r11, r7, r4)
            if (r4 == 0) goto L_0x0bc4
            com.instagram.common.session.UserSession r7 = A00(r0)
            X.1L1 r4 = r0.A0M
            if (r4 == 0) goto L_0x1423
            java.lang.String r4 = r4.A00
            X.0qQ.A0B(r7, r3)
            X.0qQ.A0B(r4, r14)
            X.IYk r5 = new X.IYk
            r5.<init>(r7, r4)
            X.2pc r4 = X.C230432pc.FEED
            X.2y6 r5 = X.AnonymousClass2y5.A00(r7, r5, r4)
            goto L_0x0954
        L_0x0bc4:
            boolean r4 = r0.A0V
            if (r4 == 0) goto L_0x0c01
            com.instagram.common.session.UserSession r12 = A00(r0)
            com.instagram.common.session.UserSession r11 = A00(r0)
            X.0qQ.A0B(r11, r3)
            X.0Tu r7 = X.0Tu.A06
            r4 = 36321451795948934(0x810a2b00062586, double:3.03317059828071E-306)
            boolean r5 = X.182.A06(r7, r11, r4)
            X.1L1 r4 = r0.A0M
            if (r4 == 0) goto L_0x1423
            java.lang.String r7 = r4.A00
            X.0qQ.A0B(r12, r3)
            r4 = 2
            X.0qQ.A0B(r7, r4)
            if (r5 == 0) goto L_0x0bfa
            X.IYo r5 = new X.IYo
            r5.<init>(r12, r0, r7)
            X.2pc r4 = X.C230432pc.EXPLORE
            X.2y6 r5 = X.AnonymousClass2y5.A00(r12, r5, r4)
            goto L_0x0954
        L_0x0bfa:
            X.2wB r5 = new X.2wB
            r5.<init>()
            goto L_0x0954
        L_0x0c01:
            X.Ulw r4 = new X.Ulw
            r4.<init>()
            goto L_0x0959
        L_0x0c08:
            boolean r4 = r0.A0V
            if (r4 == 0) goto L_0x0ca0
            com.instagram.common.session.UserSession r5 = A00(r0)
            java.lang.String r10 = r0.getSessionId()
            java.lang.String r8 = r0.getModuleName()
            X.HDB r4 = r0.A0N
            if (r4 == 0) goto L_0x0351
            java.lang.String r6 = "null cannot be cast to non-null type com.instagram.adschaining.contextualfeed.fetch.AdsChainingFetcher<com.instagram.model.sponsored.DynamicInsertionAd<com.instagram.sponsored.asyncads.rules.gaprules.TargetPositionGapRules>>"
            X.0qQ.A0C(r2, r6)
            X.IY1 r2 = (X.IY1) r2
            X.GUk r12 = new X.GUk
            r12.<init>()
            X.0qQ.A0B(r5, r3)
            r6 = 2
            X.0qQ.A0B(r10, r6)
            r6 = 3
            X.0qQ.A0B(r8, r6)
            r6 = 5
            X.0qQ.A0B(r2, r6)
            X.HEb r7 = X.C54447HEb.A00
            X.C52485GUn.A00(r7)
            X.1PG r6 = X.1PG.A00(r5)
            X.3kU r11 = r6.A06(r7)
            X.0qQ.A07(r11)
            X.1PG r6 = X.1PG.A00(r5)
            X.2vA r6 = r6.A03(r7)
            X.2vG r10 = X.C55279Hf8.A00(r5, r6, r0, r10, r8)
            r2.A01 = r10
            X.IY8 r8 = new X.IY8
            r8.<init>(r5, r4)
            X.IXq r7 = new X.IXq
            r7.<init>()
            X.GUr r41 = new X.GUr
            r41.<init>()
            X.HF1 r6 = new X.HF1
            r35 = r6
            r36 = r5
            r37 = r7
            r38 = r8
            r39 = r10
            r40 = r11
            r35.<init>(r36, r37, r38, r39, r40, r41)
            X.HFF r13 = new X.HFF
            r13.<init>(r7, r11, r4)
            X.2w4 r5 = X.C233632w4.A05
            X.2w5 r4 = new X.2w5
            r4.<init>(r5)
            r4.A0G = r2
            r4.A0K = r10
            r4.A0L = r11
            r4.A0J = r6
            r4.A0N = r13
            r4.A0H = r8
            r4.A0E = r7
            r4.A0P = r12
            X.2wB r2 = new X.2wB
            r2.<init>()
            r4.A0R = r2
            r4.A0p = r3
            X.2wV r2 = r4.A00()
            goto L_0x08e3
        L_0x0ca0:
            if (r16 == 0) goto L_0x0e85
            com.instagram.common.session.UserSession r2 = A00(r0)
            X.1Ng r6 = X.AnonymousClass1Nd.A00(r2)
            X.1L1 r2 = r0.A0M
            if (r2 == 0) goto L_0x1423
            java.lang.String r5 = r2.A00
            com.instagram.common.session.UserSession r2 = A00(r0)
            java.lang.String r4 = r2.A06
            X.6yT r2 = new X.6yT
            r2.<init>(r5, r4)
            r6.A00(r2)
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_IS_HUNT_AND_PECK_ENTRY"
            boolean r40 = r1.getBoolean(r2)
            r2 = r35
            android.os.Parcelable r2 = r1.getParcelable(r2)
            if (r2 == 0) goto L_0x145e
            com.instagram.feed.intf.ContextualFeedNetworkConfig r2 = (com.instagram.feed.intf.ContextualFeedNetworkConfig) r2
            r0.A0t = r2
            if (r2 == 0) goto L_0x0e81
            java.lang.String r8 = r2.A04
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_GRID_INDEX"
            int r7 = r1.getInt(r2)
            X.GUk r10 = new X.GUk
            r10.<init>()
            android.content.Context r4 = r0.requireContext()
            X.GUm r2 = new X.GUm
            r2.<init>(r4, r0)
            r0.A0z = r2
            X.VvI r2 = r2.A00
            if (r2 == 0) goto L_0x0e7d
            X.2vk r2 = r2.A0B
            r39 = r2
        L_0x0cf2:
            X.1Xl r2 = r0.A0F
            if (r2 == 0) goto L_0x0e79
            boolean r2 = X.1sx.A0P(r2)
            if (r2 == 0) goto L_0x0e79
            java.lang.Integer r12 = X.AnonymousClass05K.A00
        L_0x0cfe:
            com.instagram.common.session.UserSession r4 = A00(r0)
            X.HDB r2 = r0.A0N
            if (r2 == 0) goto L_0x0351
            X.GUj r6 = new X.GUj
            r6.<init>(r4, r2, r8)
            java.lang.String r4 = "ContextualFeedFragment.ARGUMENT_SEED_MEDIA_ID"
            java.lang.String r2 = ""
            java.lang.String r11 = r1.getString(r4, r2)
            com.instagram.common.session.UserSession r2 = A00(r0)
            android.content.Context r41 = r0.requireContext()
            java.lang.String r35 = r0.getSessionId()
            java.lang.String r38 = r0.getModuleName()
            X.0qQ.A0A(r11)
            X.0qQ.A0B(r2, r3)
            r5 = 3
            r4 = r35
            X.0qQ.A0B(r4, r5)
            r5 = 4
            r4 = r38
            X.0qQ.A0B(r4, r5)
            r4 = 11
            X.0qQ.A0B(r11, r4)
            X.GUl r13 = new X.GUl
            r13.<init>(r8)
            X.C52485GUn.A00(r13)
            X.1PG r4 = X.1PG.A00(r2)
            X.3kU r37 = r4.A06(r13)
            X.0qQ.A07(r37)
            X.1PG r4 = X.1PG.A00(r2)
            X.1PX r44 = r4.A04(r13)
            X.0qQ.A07(r44)
            r4 = 36315829686111826(0x81050e002a0e52, double:3.0296151533813035E-306)
            boolean r4 = X.182.A06(r9, r2, r4)
            if (r4 != 0) goto L_0x0d66
            r37.A04()
        L_0x0d66:
            X.1PG r4 = X.1PG.A00(r2)
            X.2vA r43 = r4.A03(r13)
            r45 = r2
            r46 = r43
            r47 = r0
            r48 = r35
            r49 = r38
            r50 = r7
            X.2vG r36 = X.C52488GUq.A00(r45, r46, r47, r48, r49, r50)
            X.50D r13 = new X.50D
            r13.<init>()
            X.GUt r5 = new X.GUt
            r4 = r40
            r5.<init>(r12, r8, r11, r4)
            X.GUs r35 = new X.GUs
            r40 = r35
            r42 = r2
            r45 = r6
            r46 = r36
            r47 = r37
            r48 = r17
            r49 = r5
            r50 = r38
            r51 = r7
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            X.GUr r46 = new X.GUr
            r46.<init>()
            boolean r4 = X.C233832wY.A01(r2)
            if (r4 == 0) goto L_0x0db9
            r4 = 36319772463734388(0x8108a400061e74, double:3.032108581826103E-306)
            boolean r4 = X.182.A06(r9, r2, r4)
            r47 = 1
            if (r4 != 0) goto L_0x0dbb
        L_0x0db9:
            r47 = 0
        L_0x0dbb:
            boolean r4 = X.C228342lQ.A03(r2)
            if (r4 == 0) goto L_0x0dce
            r4 = 36312879042200937(0x81025f00150569, double:3.027749154290768E-306)
            boolean r4 = X.182.A06(r9, r2, r4)
            r48 = 1
            if (r4 != 0) goto L_0x0dd0
        L_0x0dce:
            r48 = 0
        L_0x0dd0:
            boolean r4 = X.C228342lQ.A05(r2)
            if (r4 == 0) goto L_0x0de3
            r4 = 36312879042200937(0x81025f00150569, double:3.027749154290768E-306)
            boolean r4 = X.182.A06(r9, r2, r4)
            r49 = 1
            if (r4 != 0) goto L_0x0de5
        L_0x0de3:
            r49 = 0
        L_0x0de5:
            X.GUp r4 = new X.GUp
            r40 = r4
            r41 = r2
            r42 = r13
            r43 = r6
            r44 = r36
            r45 = r37
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49)
            X.GUu r5 = new X.GUu
            r11 = r37
            r5.<init>(r13, r6, r11, r7)
            X.6Vq r12 = new X.6Vq
            r40 = r12
            r41 = r13
            r42 = r6
            r43 = r11
            r44 = r5
            r45 = r3
            r46 = r3
            r47 = r14
            r40.<init>(r41, r42, r43, r44, r45, r46, r47)
            java.util.List r11 = r6.BYj()
            X.2w4 r5 = new X.2w4
            r5.<init>(r11, r7, r7, r3)
            X.2w5 r11 = new X.2w5
            r11.<init>(r5)
            r5 = r35
            r11.A0G = r5
            r5 = r36
            r11.A0K = r5
            r5 = r37
            r11.A0L = r5
            r11.A0J = r4
            r11.A0N = r12
            r11.A0H = r6
            r11.A0E = r13
            r11.A0P = r10
            r4 = r39
            r11.A0F = r4
            X.2wB r4 = new X.2wB
            r4.<init>()
            r11.A0R = r4
            r11.A0p = r3
            r4 = 36315829686111826(0x81050e002a0e52, double:3.0296151533813035E-306)
            boolean r4 = X.182.A06(r9, r2, r4)
            if (r4 == 0) goto L_0x0e61
            X.2wC r4 = X.C233682wC.A03
            r11.A09 = r4
            r11.A00 = r14
            r4 = 36315829686505045(0x81050e00300e55, double:3.029615153629977E-306)
            boolean r2 = X.182.A06(r9, r2, r4)
            if (r2 == 0) goto L_0x0e61
            r11.A0k = r14
        L_0x0e61:
            X.2wV r2 = r11.A00()
            r0.A0L = r2
            r2.A0C(r7)
            com.instagram.common.session.UserSession r5 = A00(r0)
            java.lang.String r4 = r0.getModuleName()
            X.57V r2 = new X.57V
            r2.<init>(r5, r6, r8, r4)
            goto L_0x08e7
        L_0x0e79:
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            goto L_0x0cfe
        L_0x0e7d:
            r39 = 0
            goto L_0x0cf2
        L_0x0e81:
            r2 = 0
            r10 = 0
            goto L_0x08e7
        L_0x0e85:
            if (r22 == 0) goto L_0x08e5
            java.lang.String r2 = "contextual_feed_config"
            android.os.Parcelable r4 = r1.getParcelable(r2)
            boolean r2 = r4 instanceof com.instagram.search.surface.fragment.contextualfeed.SerpContextualFeedConfig
            if (r2 == 0) goto L_0x1105
            com.instagram.search.surface.fragment.contextualfeed.SerpContextualFeedConfig r4 = (com.instagram.search.surface.fragment.contextualfeed.SerpContextualFeedConfig) r4
            java.lang.String r2 = r4.A00
            r0.A15 = r2
        L_0x0e97:
            java.lang.String r12 = r0.A15
            if (r12 == 0) goto L_0x08e5
            if (r15 == 0) goto L_0x08e5
            java.lang.String r2 = r0.A0S
            if (r2 == 0) goto L_0x08e5
            r2 = 2183(0x887, float:3.059E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            int r2 = r1.getInt(r2)
            r0.A0Z = r2
            java.lang.String r11 = r15.Bi3()
            java.lang.String r2 = r0.A0S
            if (r2 == 0) goto L_0x1469
            java.lang.String r5 = X.1Xv.A06(r2)
            X.GUk r10 = new X.GUk
            r10.<init>()
            android.content.Context r4 = r0.requireContext()
            X.GUm r2 = new X.GUm
            r2.<init>(r4, r0)
            r0.A0z = r2
            X.VvI r2 = r2.A00
            if (r2 == 0) goto L_0x1101
            X.2vk r2 = r2.A0B
            r38 = r2
        L_0x0ed1:
            com.instagram.common.session.UserSession r2 = A00(r0)
            android.content.Context r53 = r0.requireContext()
            java.lang.String r13 = r0.getSessionId()
            java.lang.String r37 = r0.getModuleName()
            int r6 = r0.A0Z
            X.HDB r4 = r0.A0N
            if (r4 == 0) goto L_0x0351
            X.0qQ.A0B(r2, r3)
            r7 = 3
            X.0qQ.A0B(r13, r7)
            r8 = 4
            r7 = r37
            X.0qQ.A0B(r7, r8)
            r7 = 6
            X.0qQ.A0B(r5, r7)
            r7 = 7
            X.0qQ.A0B(r11, r7)
            X.HEc r8 = X.C54448HEc.A00
            X.C52485GUn.A00(r8)
            X.1PG r7 = X.1PG.A00(r2)
            X.2vA r55 = r7.A03(r8)
            X.1PG r7 = X.1PG.A00(r2)
            X.3kU r36 = r7.A06(r8)
            X.0qQ.A07(r36)
            X.1PG r7 = X.1PG.A00(r2)
            X.1PX r56 = r7.A04(r8)
            X.0qQ.A07(r56)
            boolean r7 = r15.CcK()
            if (r7 == 0) goto L_0x1006
            r48 = 16225(0x3f61, float:2.2736E-41)
            X.2vl r7 = new X.2vl
            r39 = r7
            r40 = r32
            r41 = r32
            r42 = r32
            r43 = r33
            r44 = r33
            r45 = r3
            r46 = r6
            r47 = r3
            r49 = r14
            r50 = r14
            r51 = r3
            r52 = r3
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            r7.A0B(r6)
            r8 = r33
            r7.A0A(r8)
            X.GV9 r8 = new X.GV9
            r8.<init>()
            r8.A0L = r15
            r8.A00 = r7
            java.lang.String r7 = r15.A2R()
            r8.A0Z = r7
            X.1Xy r7 = r15.A0C
            X.3lZ r7 = r7.getInjected()
            if (r7 == 0) goto L_0x10fe
            java.lang.String r7 = r7.BKL()
        L_0x0f69:
            r8.A0g = r7
            java.lang.String r7 = r15.C9L()
            if (r7 != 0) goto L_0x0f73
            java.lang.String r7 = ""
        L_0x0f73:
            r8.A0l = r7
            java.lang.String r7 = r15.A2S()
            r8.A0b = r7
            java.util.List r7 = r15.A3k()
            r8.A0q = r7
            X.1Xy r7 = r15.A0C
            X.3lZ r7 = r7.getInjected()
            if (r7 == 0) goto L_0x10fb
            java.util.List r7 = r7.getCookies()
        L_0x0f8d:
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r7)
            r8.A00 = r7
            X.1Xy r7 = r15.A0C
            java.lang.String r7 = r7.BMq()
            r8.A0h = r7
            java.util.List r7 = r15.A3P()
            r8.A0m = r7
            boolean r7 = r15.A60()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8.A0U = r7
            java.lang.String r7 = r15.A2V()
            r8.A0d = r7
            X.1Xy r7 = r15.A0C
            X.3lZ r7 = r7.getInjected()
            if (r7 == 0) goto L_0x10f8
            java.lang.String r7 = r7.Ac5()
            if (r7 == 0) goto L_0x10f8
        L_0x0fbf:
            r8.A0c = r7
            java.lang.String r7 = r15.A2r()
            r8.A0k = r7
            X.1Xy r7 = r15.A0C
            X.3lZ r7 = r7.getInjected()
            if (r7 == 0) goto L_0x10f5
            java.lang.String r7 = r7.AYn()
            if (r7 == 0) goto L_0x10f5
        L_0x0fd5:
            r8.A0Y = r7
            X.3I2 r7 = r15.A22()
            r8.A0O = r7
            X.1Xy r7 = r15.A0C
            java.lang.String r7 = r7.BZp()
            r8.A0a = r7
            X.GV8 r7 = r8.A01()
            java.util.List r8 = java.util.Collections.singletonList(r7)
            X.0qQ.A07(r8)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.collections.MutableCollection<com.instagram.model.sponsored.DynamicInsertionAd<com.instagram.sponsored.asyncads.rules.gaprules.GapRules>>"
            X.0qQ.A0C(r8, r7)
            java.util.Collection r42 = X.0u4.A00(r8)
            java.lang.Integer r40 = X.AnonymousClass05K.A00
            r39 = r36
            r41 = r40
            r43 = r6
            r44 = r14
            r39.A07(r40, r41, r42, r43, r44)
        L_0x1006:
            r39 = r2
            r40 = r55
            r41 = r0
            r42 = r13
            r43 = r37
            r44 = r6
            X.2vG r35 = X.C52488GUq.A00(r39, r40, r41, r42, r43, r44)
            X.GcG r7 = new X.GcG
            r7.<init>(r2, r15, r4, r6)
            X.50D r13 = new X.50D
            r13.<init>()
            X.HKi r4 = new X.HKi
            r4.<init>(r12, r5, r11)
            X.GUs r8 = new X.GUs
            r52 = r8
            r54 = r2
            r57 = r7
            r58 = r35
            r59 = r36
            r60 = r17
            r61 = r4
            r62 = r37
            r63 = r6
            r52.<init>(r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)
            X.GUr r45 = new X.GUr
            r45.<init>()
            boolean r4 = X.C233832wY.A01(r2)
            if (r4 == 0) goto L_0x1054
            r4 = 36319772463406703(0x8108a400011e6f, double:3.0321085816188736E-306)
            boolean r4 = X.182.A06(r9, r2, r4)
            r46 = 1
            if (r4 != 0) goto L_0x1056
        L_0x1054:
            r46 = 0
        L_0x1056:
            boolean r4 = X.C228342lQ.A03(r2)
            if (r4 == 0) goto L_0x1069
            r4 = 36312879042397548(0x81025f0018056c, double:3.0277491544151056E-306)
            boolean r4 = X.182.A06(r9, r2, r4)
            r47 = 1
            if (r4 != 0) goto L_0x106b
        L_0x1069:
            r47 = 0
        L_0x106b:
            boolean r4 = X.C228342lQ.A05(r2)
            if (r4 == 0) goto L_0x107e
            r4 = 36312879042397548(0x81025f0018056c, double:3.0277491544151056E-306)
            boolean r4 = X.182.A06(r9, r2, r4)
            r48 = 1
            if (r4 != 0) goto L_0x1080
        L_0x107e:
            r48 = 0
        L_0x1080:
            X.GUp r4 = new X.GUp
            r39 = r4
            r40 = r2
            r41 = r13
            r42 = r7
            r43 = r35
            r44 = r36
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48)
            X.GcH r43 = new X.GcH
            r44 = r15
            r45 = r13
            r46 = r7
            r47 = r36
            r48 = r6
            r43.<init>(r44, r45, r46, r47, r48)
            X.6Vq r5 = new X.6Vq
            r39 = r5
            r40 = r13
            r41 = r7
            r42 = r36
            r44 = r3
            r45 = r3
            r46 = r14
            r39.<init>(r40, r41, r42, r43, r44, r45, r46)
            java.util.List r11 = r7.BYj()
            X.2w4 r2 = new X.2w4
            r2.<init>(r11, r6, r6, r3)
            X.2w5 r6 = new X.2w5
            r6.<init>(r2)
            r6.A0G = r8
            r2 = r35
            r6.A0K = r2
            r2 = r36
            r6.A0L = r2
            r6.A0J = r4
            r6.A0N = r5
            r6.A0H = r7
            r6.A0E = r13
            r6.A0P = r10
            r2 = r38
            r6.A0F = r2
            X.2wB r2 = new X.2wB
            r2.<init>()
            r6.A0R = r2
            r6.A0p = r3
            boolean r2 = r15.CcK()
            r6.A0Y = r2
            X.2wV r4 = r6.A00()
            r0.A0L = r4
            int r2 = r0.A0Z
            r4.A0C(r2)
            goto L_0x08e6
        L_0x10f5:
            r7 = 0
            goto L_0x0fd5
        L_0x10f8:
            r7 = 0
            goto L_0x0fbf
        L_0x10fb:
            r7 = 0
            goto L_0x0f8d
        L_0x10fe:
            r7 = 0
            goto L_0x0f69
        L_0x1101:
            r38 = 0
            goto L_0x0ed1
        L_0x1105:
            boolean r2 = r4 instanceof com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig
            if (r2 == 0) goto L_0x0e97
            com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig r4 = (com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig) r4
            com.instagram.model.keyword.Keyword r2 = r4.A01
            if (r2 != 0) goto L_0x0e97
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r0 = r26
            r2.<init>(r0)
            r1 = 1012877846(0x3c5f4a16, float:0.013628503)
            goto L_0x147e
        L_0x111b:
            X.0qQ.A0F(r12)
            goto L_0x0354
        L_0x1120:
            X.2qT r6 = r0.A0K
            if (r6 == 0) goto L_0x1341
            X.30o r4 = new X.30o
            r4.<init>(r9, r8, r6)
            r5.A0F = r4
            r4 = r17
            r5.A0P = r4
            java.lang.String r4 = "ContextualFeedFragment.ARGUMENT_ELIGIBLE_FOR_SUBSCRIPTIONS_NUX"
            boolean r1 = r1.getBoolean(r4, r3)
            r5.A0Z = r1
            X.57N r1 = r0.A0o
            r5.A06 = r1
            r5.A07 = r2
            com.instagram.search.common.analytics.SearchContext r1 = r0.A0x
            r5.A0O = r1
            r5.A03 = r0
            X.GAQ r1 = r0.A0G
            if (r1 == 0) goto L_0x1346
            r5.A0D = r1
            X.GAR r1 = r0.A0B
            if (r1 == 0) goto L_0x11b5
            r1.A0L(r5)
            X.GAR r1 = r0.A0B
            if (r1 == 0) goto L_0x11b5
            boolean r1 = r1.A0g()
            if (r1 == 0) goto L_0x115e
            X.57T r1 = r0.A1P
            r5.A09 = r1
        L_0x115e:
            java.lang.Long r2 = r0.A10
            if (r2 == 0) goto L_0x116a
            long r8 = r2.longValue()
            int r1 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x116c
        L_0x116a:
            r5.A0U = r2
        L_0x116c:
            java.lang.String r2 = r0.A17
            if (r2 == 0) goto L_0x1178
            int r1 = r2.length()
            if (r1 == 0) goto L_0x1178
            r5.A0X = r2
        L_0x1178:
            X.30c r1 = r0.A0p
            if (r1 == 0) goto L_0x117e
            r5.A08 = r1
        L_0x117e:
            com.instagram.feed.intf.ContextualFeedNetworkConfig r1 = r0.A0t
            if (r1 == 0) goto L_0x1186
            java.lang.String r1 = r1.A05
            r5.A0V = r1
        L_0x1186:
            X.332 r2 = r5.A00()
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.controller.FeedListController<instagram.features.feed.fragment.ContextualFeedFragment>"
            X.0qQ.A0C(r2, r1)
            r0.A0r = r2
            r0.registerLifecycleListener(r2)
            X.0jB r4 = new X.0jB
            r4.<init>()
            X.To7 r1 = r0.A1O
            X.0jB r1 = r1.A00
            r4.A06(r1)
            X.HDB r2 = r0.A0N
            if (r2 == 0) goto L_0x0351
            X.0xF r1 = r4.A00()
            r2.A07(r1)
            X.GAR r1 = r0.A0B
            if (r1 == 0) goto L_0x11b5
            X.JRI r5 = r0.A0A
            if (r5 != 0) goto L_0x11ba
            java.lang.String r19 = "contextualFeedControllerDelegate"
        L_0x11b5:
            X.0qQ.A0F(r19)
            goto L_0x0354
        L_0x11ba:
            java.util.List r6 = r0.A0U
            com.instagram.common.session.UserSession r2 = A00(r0)
            java.util.List r4 = r1.A08()
            if (r4 == 0) goto L_0x11cc
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x1204
        L_0x11cc:
            if (r6 == 0) goto L_0x11f7
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x11f7
            X.1E8 r2 = X.1E7.A00(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x11e1:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x1204
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            X.1Xj r1 = r2.A02(r1)
            if (r1 == 0) goto L_0x11f7
            r4.add(r1)
            goto L_0x11e1
        L_0x11f7:
            A03(r0, r14, r3)
            X.GAR r2 = r0.A0B
            if (r2 == 0) goto L_0x11b5
            java.util.List r1 = r0.A0U
            r2.A0P(r1)
            goto L_0x1207
        L_0x1204:
            r5.A8o(r4)
        L_0x1207:
            com.instagram.common.session.UserSession r4 = A00(r0)
            X.GUW r2 = new X.GUW
            r2.<init>(r0)
            X.36D r1 = new X.36D
            r1.<init>(r4, r2, r3, r14)
            r0.A0C = r1
            r0.registerLifecycleListener(r1)
            com.instagram.common.session.UserSession r1 = A00(r0)
            X.2wt r2 = new X.2wt
            r2.<init>(r0, r1, r0)
            r2.A05 = r7
            java.lang.String r1 = r0.A14
            r2.A04 = r1
            X.HDB r1 = r0.A0N
            if (r1 == 0) goto L_0x0351
            r2.A00 = r1
            r0.registerLifecycleListener(r2)
            X.GUa r1 = new X.GUa
            r1.<init>(r0)
            r0.A0f = r1
            X.GUX r1 = new X.GUX
            r1.<init>(r0)
            r0.A0g = r1
            X.GUb r1 = new X.GUb
            r1.<init>(r0)
            r0.A0j = r1
            X.GUY r1 = new X.GUY
            r1.<init>(r0)
            r0.A0h = r1
            X.GUZ r1 = new X.GUZ
            r1.<init>(r0)
            r0.A0i = r1
            com.instagram.common.session.UserSession r3 = A00(r0)
            X.0qQ.A0B(r3, r14)
            r2 = 4
            X.9Ky r1 = new X.9Ky
            r1.<init>(r3, r2)
            X.0eM r1 = X.AnonymousClass1YB.A00(r1)
            java.lang.Object r1 = r1.getValue()
            X.35H r1 = (X.AnonymousClass35H) r1
            com.instagram.common.session.UserSession r4 = r1.A00
            X.0Tu r3 = X.0Tu.A06
            r1 = 36328654455913986(0x8110b800033e02, double:3.0377255894453925E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x128a
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = A00(r0)
            java.lang.String r1 = r0.getModuleName()
            X.AnonymousClass4KB.A00(r3, r0, r2, r1)
        L_0x128a:
            com.instagram.common.session.UserSession r1 = A00(r0)
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.INg> r2 = X.C57066INg.class
            X.1wn r1 = r0.A0f
            if (r1 != 0) goto L_0x129c
            java.lang.String r18 = "mediaHiddenEventListener"
            goto L_0x0351
        L_0x129c:
            r3.A01(r1, r2)
            java.lang.Class<X.INh> r2 = X.C57067INh.class
            X.1wn r1 = r0.A0g
            if (r1 != 0) goto L_0x12a9
            java.lang.String r18 = "mediaStatusUpdateEventListener"
            goto L_0x0351
        L_0x12a9:
            r3.A01(r1, r2)
            java.lang.Class<X.FWN> r2 = X.FWN.class
            X.1wn r1 = r0.A0j
            if (r1 != 0) goto L_0x12b6
            java.lang.String r18 = "repostDeletedEventListener"
            goto L_0x0351
        L_0x12b6:
            r3.A01(r1, r2)
            java.lang.Class<X.36f> r2 = X.C2370736f.class
            X.1wn r1 = r0.A1N
            r3.A01(r1, r2)
            java.lang.Class<X.36g> r2 = X.C2370836g.class
            X.1wn r1 = r0.A1M
            r3.A01(r1, r2)
            java.lang.Class<X.36c> r2 = X.C2370436c.class
            X.1wn r1 = r0.A1K
            r3.A01(r1, r2)
            java.lang.Class<X.INp> r2 = X.C57075INp.class
            X.1wn r1 = r0.A0h
            if (r1 != 0) goto L_0x12d8
            java.lang.String r18 = "openCarouselReviewMediaConfigureFinishEventIgEventListener"
            goto L_0x0351
        L_0x12d8:
            r3.A01(r1, r2)
            java.lang.Class<X.INn> r2 = X.C57073INn.class
            X.1wn r1 = r0.A0i
            if (r1 != 0) goto L_0x12e5
            java.lang.String r18 = "openCarouselReviewMediaConfigureStartEventIgEventListener"
            goto L_0x0351
        L_0x12e5:
            r3.A01(r1, r2)
            X.GAR r1 = r0.A0B
            if (r1 == 0) goto L_0x11b5
            r1.A0J(r3)
            java.lang.String r4 = r0.A0T
            if (r4 == 0) goto L_0x132a
            android.content.Context r17 = r0.requireContext()
            com.instagram.common.session.UserSession r19 = A00(r0)
            X.HDB r3 = r0.A0N
            if (r3 == 0) goto L_0x0351
            int r2 = r0.A0a
            r1 = r33
            if (r2 != r1) goto L_0x133c
            r22 = r32
        L_0x1307:
            X.GMC r2 = new X.GMC
            r16 = r2
            r18 = r0
            r20 = r3
            r21 = r32
            r23 = r4
            r24 = r32
            r25 = r32
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = r73
            r1.EBt(r2)
            r0.registerLifecycleListener(r2)
            r2.A02(r15)
            r2.A03(r14)
            r0.A0u = r2
        L_0x132a:
            X.36s r1 = r0.A0w
            if (r1 == 0) goto L_0x1333
            r0 = r73
            r0.EBt(r1)
        L_0x1333:
            r1 = 1546001121(0x5c261ae1, float:1.87017599E17)
            r0 = r34
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x133c:
            java.lang.Integer r22 = java.lang.Integer.valueOf(r2)
            goto L_0x1307
        L_0x1341:
            X.0qQ.A0F(r13)
            goto L_0x0354
        L_0x1346:
            X.0qQ.A0F(r29)
            goto L_0x0354
        L_0x134b:
            X.GUO r4 = new X.GUO
            r4.<init>(r0)
            goto L_0x0336
        L_0x1352:
            X.1Xy r4 = r15.A0C
            X.DTn r4 = r4.B4x()
            if (r4 == 0) goto L_0x0327
            com.instagram.common.session.UserSession r6 = A00(r0)
            android.content.Context r5 = r0.requireContext()
            r4 = r32
            X.C17075VGx.A00(r5, r0, r6, r4)
            goto L_0x0327
        L_0x1369:
            boolean r2 = r0.A0V
            if (r2 == 0) goto L_0x1389
            com.instagram.common.session.UserSession r4 = A00(r0)
            X.Hih r2 = new X.Hih
            r2.<init>(r4, r0)
            r0.A0D = r2
            android.content.Context r5 = r0.requireContext()
            com.instagram.common.session.UserSession r4 = A00(r0)
            X.IY1 r2 = new X.IY1
            r6 = r17
            r2.<init>(r5, r4, r6, r0)
            goto L_0x02ca
        L_0x1389:
            r2 = 0
            goto L_0x02cc
        L_0x138c:
            if (r16 == 0) goto L_0x13fd
            com.instagram.common.session.UserSession r2 = A00(r0)
            X.0qQ.A0B(r2, r3)
            r4 = 36315829686242900(0x81050e002c0e54, double:3.029615153464195E-306)
            boolean r2 = X.182.A06(r9, r2, r4)
            if (r2 == 0) goto L_0x13fd
            com.instagram.common.session.UserSession r6 = A00(r0)
            java.lang.String r4 = r0.A1I
            X.0qQ.A0B(r6, r3)
            r2 = 2
            X.0qQ.A0B(r4, r2)
            X.1L1 r2 = new X.1L1
            r2.<init>()
            r2.A00 = r4
            X.1L5 r2 = X.1L0.A01(r6, r2)
            r4 = 36318140376487834(0x810728000b179a, double:3.0310764432794943E-306)
            boolean r41 = X.182.A06(r9, r6, r4)
            r4 = 36318140377012128(0x810728001317a0, double:3.03107644361106E-306)
            boolean r7 = X.182.A06(r9, r6, r4)
            r4 = 36318140377470886(0x810728001a17a6, double:3.0310764439011804E-306)
            boolean r43 = X.182.A06(r9, r6, r4)
            r4 = 17
            X.Iny r8 = new X.Iny
            r8.<init>(r4, r2, r6, r0)
            r4 = 47
            X.Iw1 r5 = new X.Iw1
            r5.<init>(r4, r2, r6)
            r10 = 40
            X.GL3 r4 = new X.GL3
            r4.<init>(r10, r2, r6, r7)
            X.GV1 r17 = new X.GV1
            r35 = r17
            r36 = r0
            r37 = r2
            r38 = r8
            r39 = r5
            r40 = r4
            r42 = r7
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43)
            goto L_0x02a4
        L_0x13fd:
            boolean r2 = r0.A0V
            if (r2 == 0) goto L_0x1428
            com.instagram.common.session.UserSession r7 = A00(r0)
            com.instagram.common.session.UserSession r6 = A00(r0)
            X.0qQ.A0B(r6, r3)
            X.0Tu r2 = X.0Tu.A06
            r4 = 36321451795948934(0x810a2b00062586, double:3.03317059828071E-306)
            boolean r4 = X.182.A06(r2, r6, r4)
            X.1L1 r2 = r0.A0M
            if (r2 == 0) goto L_0x1423
            java.lang.String r2 = r2.A00
            X.GXr r17 = X.GXW.A00(r7, r0, r2, r4)
            goto L_0x02a4
        L_0x1423:
            X.0qQ.A0F(r30)
            goto L_0x0354
        L_0x1428:
            X.4LP r17 = new X.4LP
            r17.<init>()
            goto L_0x02a4
        L_0x142f:
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_USER_ELIGIBLE_FOR_PROFILE_FEED_AD"
            boolean r8 = r1.getBoolean(r2)
            goto L_0x0227
        L_0x1437:
            X.0qQ.A0F(r31)
            goto L_0x0354
        L_0x143c:
            X.3Jn r2 = new X.3Jn
            r2.<init>()
            goto L_0x016b
        L_0x1443:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r26
            r1.<init>(r0)
            throw r1
        L_0x144b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r26
            r1.<init>(r0)
            throw r1
        L_0x1453:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r0 = r26
            r2.<init>(r0)
            r1 = 1233009284(0x497e3a84, float:1041320.25)
            goto L_0x147e
        L_0x145e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r0 = r26
            r2.<init>(r0)
            r1 = -267816714(0xfffffffff00970f6, float:-1.7014403E29)
            goto L_0x147e
        L_0x1469:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r0 = r26
            r2.<init>(r0)
            r1 = -1989733269(0xffffffff8967146b, float:-2.7815214E-33)
            goto L_0x147e
        L_0x1474:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r0 = r26
            r2.<init>(r0)
            r1 = 163028199(0x9b79ce7, float:4.4203198E-33)
        L_0x147e:
            r0 = r34
            X.AnonymousClass0fD.A09(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.feed.fragment.ContextualFeedFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-387926388);
        0qQ.A0B(layoutInflater, 0);
        this.A0c = 2dZ.A0t.A03(getActivity());
        View inflate = layoutInflater.inflate(R.layout.layout_context_feed_rv, viewGroup, false);
        this.mContextualFeedContainer = inflate.requireViewById(R.id.layout_listview_parent_container);
        AnonymousClass0fD.A09(-532709863, A022);
        return inflate;
    }

    public final void onDestroy() {
        String str;
        int A022 = AnonymousClass0fD.A02(535297363);
        super.onDestroy();
        GAQ gaq = this.A0G;
        if (gaq == null) {
            str = "feedMediaLoadingTracker";
        } else {
            unregisterLifecycleListener(gaq);
            1Ng A002 = AnonymousClass1Nd.A00(A00(this));
            Class<FWN> cls = FWN.class;
            1wn r0 = this.A0j;
            if (r0 == null) {
                str = "repostDeletedEventListener";
            } else {
                A002.A02(r0, cls);
                GAR gar = this.A0B;
                if (gar == null) {
                    str = "contextualFeedController";
                } else {
                    gar.A0K(A002);
                    GMC gmc = this.A0u;
                    if (gmc != null) {
                        unregisterLifecycleListener(gmc);
                    }
                    C233812wV r02 = this.A0L;
                    if (r02 != null) {
                        r02.A0B();
                    }
                    C324466zK r03 = this.A0H;
                    if (r03 != null) {
                        unregisterLifecycleListener(r03);
                    }
                    EEQ eeq = this.A0q;
                    if (eeq != null) {
                        unregisterLifecycleListener(eeq);
                    }
                    AnonymousClass0fD.A09(307552266, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        String str;
        C52761GcE gcE;
        int A022 = AnonymousClass0fD.A02(878555657);
        if (this.A0n != null) {
            C238143As r3 = (C238143As) getScrollingViewProxy();
            if ((r3 instanceof C238123Aq) && (gcE = this.A0n) != null) {
                gcE.A07((AnonymousClass2xS) null, (C238123Aq) r3);
            }
        }
        GTW gtw = this.A1H;
        gtw.A01.A00();
        1Ng A002 = AnonymousClass1Nd.A00(A00(this));
        Class<C57066INg> cls = C57066INg.class;
        1wn r0 = this.A0f;
        if (r0 == null) {
            str = "mediaHiddenEventListener";
        } else {
            A002.A02(r0, cls);
            Class<C57067INh> cls2 = C57067INh.class;
            1wn r02 = this.A0g;
            if (r02 == null) {
                str = "mediaStatusUpdateEventListener";
            } else {
                A002.A02(r02, cls2);
                A002.A02(this.A1N, C2370736f.class);
                A002.A02(this.A1M, C2370836g.class);
                A002.A02(this.A1K, C2370436c.class);
                A002.A02(this.A1L, AnonymousClass3DT.class);
                Class<C57075INp> cls3 = C57075INp.class;
                1wn r03 = this.A0h;
                if (r03 == null) {
                    str = "openCarouselReviewMediaConfigureFinishEventIgEventListener";
                } else {
                    A002.A02(r03, cls3);
                    Class<C57073INn> cls4 = C57073INn.class;
                    1wn r04 = this.A0i;
                    if (r04 == null) {
                        str = "openCarouselReviewMediaConfigureStartEventIgEventListener";
                    } else {
                        A002.A02(r04, cls4);
                        GAR gar = this.A0B;
                        str = "contextualFeedController";
                        if (gar != null) {
                            gar.A0K(A002);
                            HCA hca = this.A0y;
                            if (hca != null) {
                                gtw.FJ2(hca);
                                this.mLifecycleRegistry.A0A(hca);
                            }
                            GAR gar2 = this.A0B;
                            if (gar2 != null) {
                                gar2.A0C();
                                setAdapter((C231272rL) null);
                                super.onDestroyView();
                                1wY.A00(A00(this)).A08(getModuleName());
                                this.A05 = null;
                                this.A04 = null;
                                this.A03 = null;
                                14i.A07(this);
                                AnonymousClass0fD.A09(205156121, A022);
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onPause() {
        C22338Xzn xzn;
        String str;
        int A022 = AnonymousClass0fD.A02(918496419);
        ContextualFeedFragment.super.onPause();
        C240053Jk.A03.A02(getActivity(), A00(this));
        C227762js r5 = this.A06;
        if (r5 == null) {
            str = "_helper";
        } else {
            C238133Ar scrollingViewProxy = getScrollingViewProxy();
            int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            r5.A09(scrollingViewProxy);
            AnonymousClass3KD.A02 = null;
            1wY.A00(A00(this));
            11Z.A00();
            11Z.A00();
            GAR gar = this.A0B;
            if (gar == null) {
                str = "contextualFeedController";
            } else {
                gar.A0D();
                AnonymousClass3KG r1 = this.A0k;
                if (r1 != null) {
                    r1.A06(this.A0l);
                    r1.A04();
                    this.A0l = null;
                }
                if ("BUSINESS_INSPIRATION_HUB".equals(this.A0O)) {
                    C18654Vw9 vw9 = this.A08;
                    if (vw9 != null) {
                        vw9.A00.setVisibility(8);
                    }
                    if (getRootActivity() instanceof AnonymousClass2ZP) {
                        Activity rootActivity = getRootActivity();
                        0qQ.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
                        ((AnonymousClass2ZP) rootActivity).Enj(this.A0Y);
                    }
                    if (this.A18 && (xzn = this.A07) != null) {
                        xzn.A04(AnonymousClass000.A00(745));
                        this.A18 = false;
                    }
                }
                AnonymousClass0fD.A09(1913938326, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        ViewGroup viewGroup;
        C22338Xzn xzn;
        int A022 = AnonymousClass0fD.A02(908969903);
        super.onResume();
        C240053Jk.A03.A03(getActivity(), A00(this));
        GAR gar = this.A0B;
        String str = "contextualFeedController";
        AnonymousClass3KQ r6 = null;
        if (gar != null) {
            gar.A0E();
            if ("BUSINESS_INSPIRATION_HUB".equals(this.A0O)) {
                if (getRootActivity() instanceof AnonymousClass2ZP) {
                    Activity rootActivity = getRootActivity();
                    0qQ.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
                    this.A0Y = ((AnonymousClass2ZP) rootActivity).C3p();
                    Activity rootActivity2 = getRootActivity();
                    0qQ.A0C(rootActivity2, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
                    ((AnonymousClass2ZP) rootActivity2).Enj(8);
                }
                if (!this.A18 && (xzn = this.A07) != null) {
                    xzn.A05(AnonymousClass000.A00(745), (String) null);
                    this.A18 = true;
                }
                C18654Vw9 vw9 = this.A08;
                if (vw9 != null) {
                    vw9.A00.setVisibility(0);
                }
                C18654Vw9 vw92 = this.A08;
                if (vw92 != null) {
                    vw92.A05(false);
                }
            }
            C227762js r7 = this.A06;
            if (r7 == null) {
                str = "_helper";
            } else {
                GAR gar2 = this.A0B;
                if (gar2 != null) {
                    float A042 = (float) gar2.A04(requireActivity());
                    C240083Jn r4 = this.A0b;
                    GAR gar3 = this.A0B;
                    if (gar3 != null) {
                        boolean A0e2 = gar3.A0e();
                        2dZ r0 = this.A0c;
                        if (A0e2) {
                            if (r0 != null) {
                                viewGroup = r0.A0O;
                            }
                            0qQ.A0F("actionBarService");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        if (r0 != null) {
                            viewGroup = r0.A0P;
                        }
                        0qQ.A0F("actionBarService");
                        throw AnonymousClass00P.createAndThrow();
                        r7.A04(viewGroup, r4, A042);
                        1wY.A00(A00(this));
                        requireContext();
                        11Z.A00();
                        11Z.A00();
                        AnonymousClass3KG r02 = this.A0k;
                        if (r02 != null) {
                            r02.A03();
                        }
                        if (this.A0k != null) {
                            r6 = AnonymousClass3KG.A00(new AnonymousClass3KN(A00(this), this, this, this.A14));
                        }
                        this.A0l = r6;
                        AnonymousClass3KG r03 = this.A0k;
                        if (r03 != null) {
                            r03.A05(r6);
                        }
                        C240063Jl.A00(this, A00(this));
                        C229382nI r04 = this.A0d;
                        if (r04 == null) {
                            str = "igBloksFragmentHost";
                        } else {
                            AnonymousClass3KD.A02 = r04;
                            AnonymousClass0fD.A09(701201931, A022);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        super.onSetUserVisibleHint(z, z2);
        AnonymousClass332 r0 = this.A0r;
        if (!z) {
            if (r0 != null) {
                r0.onPause();
            }
        } else if (r0 != null) {
            r0.onResume();
        }
    }
}
