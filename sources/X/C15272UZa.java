package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;
import java.util.List;

/* renamed from: X.UZa  reason: case insensitive filesystem */
public final class C15272UZa extends AnonymousClass4DH implements AnonymousClass4DS, AnonymousClass4DT, XBP {
    public static final String __redex_internal_original_name = "CompositeSerpTabbedFragment";
    public int A00 = 3;
    public int A01;
    public int A02 = -1;
    public long A03 = 750;
    public View A04;
    public C227762js A05;
    public 1Av A06;
    public C14437TwL A07;
    public C18582VuY A08;
    public C59830Ja5 A09;
    public C14436TwK A0A;
    public HCA A0B;
    public C14450TwY A0C;
    public C16294UsC A0D;
    public String A0E = "0";
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public C52570GXv A0U;
    public AnimatedHintsTextLayout A0V;
    public boolean A0W = true;
    public boolean A0X;
    public final List A0Y = 0sr.A1M(new Uy0[]{Uy0.FOR_YOU, Uy0.USERS, Uy0.HASHTAGS, Uy0.PLACES});
    public final AnonymousClass0eM A0Z = C227642jf.A02(this);
    public final AnonymousClass0eM A0a = C13998To0.A01(this, 1);

    public final /* bridge */ /* synthetic */ void DqK(Object obj) {
        0qQ.A0B(obj, 0);
        List list = this.A0Y;
        int indexOf = list.indexOf(obj);
        if (this.A0Q) {
            indexOf = C51966G9m.A06(list) - indexOf;
        }
        if (indexOf != -1) {
            if (this.A02 != -1) {
                2cc A002 = C71342cb.A00(DbT.A0X(this.A0Z));
                C16294UsC usC = this.A0D;
                if (usC == null) {
                    0qQ.A0F("tabbedFragmentController");
                    throw AnonymousClass00P.createAndThrow();
                }
                AnonymousClass4DH item = usC.getItem(this.A02);
                0qQ.A0C(item, C273654mx.A00(8));
                A002.A08(getActivity(), item);
                this.A02 = -1;
            }
            this.A01 = indexOf;
            A00();
            C71342cb.A00(DbT.A0X(this.A0Z)).A0C(A00());
            this.A02 = indexOf;
            if (A03().A02.isPlaying()) {
                A03().A02.EHu(false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r19) {
        /*
            r18 = this;
            r8 = 0
            r4 = r19
            X.0qQ.A0B(r4, r8)
            r5 = r18
            boolean r0 = r5.A0X
            r12 = 1
            r0 = r0 ^ 1
            r4.Eu4(r0)
            boolean r0 = r5.A0S
            if (r0 == 0) goto L_0x001d
            X.2dY r0 = X.2dZ.A0t
            X.2dZ r0 = r0.A04(r5)
            r0.Epe()
        L_0x001d:
            X.0eM r3 = r5.A0Z
            X.0lg r0 = X.AnonymousClass7TF.A0L(r3, r8)
            boolean r13 = X.C13988Tno.A1Y(r0)
            X.0lg r6 = X.AnonymousClass7TF.A0L(r3, r8)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330565716165303(0x811275000042b7, double:3.0389342781243527E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            r17 = r0 ^ 1
            boolean r0 = r5.A0X
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.ui.widget.searchedittext.SearchEditText"
            r6 = 0
            if (r0 == 0) goto L_0x00e6
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r7 = r5.A0V
            if (r7 == 0) goto L_0x00ab
            X.0lg r0 = X.AnonymousClass7TF.A0L(r3, r8)
            boolean r0 = X.C13988Tno.A1Y(r0)
            if (r0 == 0) goto L_0x00dd
            X.Vzf r6 = X.C18745Vzf.A00
            r10 = 0
            r9 = r8
            r14 = r13
            r15 = r8
            r16 = r8
            r6.A01(r7, r8, r9, r10, r12, r13, r14, r15, r16, r17)
        L_0x0059:
            r7.setVisibility(r8)
        L_0x005c:
            android.widget.EditText r6 = r7.getEditText()
            X.0qQ.A0C(r6, r1)
            com.instagram.ui.widget.searchedittext.SearchEditText r6 = (com.instagram.ui.widget.searchedittext.SearchEditText) r6
        L_0x0065:
            if (r6 == 0) goto L_0x00ab
            r6.setSearchIconEnabled(r12)
            java.lang.String r0 = r5.A0J
            if (r0 == 0) goto L_0x0108
            r6.setText(r0)
            r6.clearFocus()
            r6.setFocusable(r8)
            r6.setClearButtonEnabled(r8)
            r6.A04()
            X.0lg r0 = X.DbT.A0X(r3)
            X.4v0 r0 = X.AnonymousClass4v0.A00(r0)
            r6.addTextChangedListener(r0)
            r1 = 34
            X.WBD r0 = new X.WBD
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r6)
            X.AnonymousClass0fU.A00(r0, r6)
            r6.A08(r13)
            X.0lg r3 = X.AnonymousClass7TF.A0L(r3, r8)
            r0 = 36328319448333537(0x81106a00013ce1, double:3.037513729302549E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x00ab
            X.Wf7 r0 = new X.Wf7
            r0.<init>(r5, r6)
            r6.A07 = r0
        L_0x00ab:
            if (r13 == 0) goto L_0x00d5
            if (r6 == 0) goto L_0x00d5
            X.GXv r3 = r5.A0U
            java.lang.String r2 = "metaSearchViewpointHelper"
            if (r3 == 0) goto L_0x010d
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            java.lang.String r1 = r5.A04()
            java.lang.String r0 = r6.getSearchString()
            r3.A00(r6, r7, r1, r0)
            X.GXv r3 = r5.A0U
            if (r3 == 0) goto L_0x010d
            java.lang.String r2 = r5.A04()
            java.lang.String r1 = r6.getSearchString()
            java.lang.String r0 = r5.A0L
            if (r0 == 0) goto L_0x0105
            r3.A01(r7, r2, r1, r0)
        L_0x00d5:
            X.VuY r0 = r5.A08
            if (r0 == 0) goto L_0x010b
            r0.A01(r4)
            return
        L_0x00dd:
            android.content.Context r0 = r5.requireContext()
            X.C18745Vzf.A00(r0, r7)
            goto L_0x0059
        L_0x00e6:
            X.0lg r0 = X.AnonymousClass7TF.A0L(r3, r8)
            boolean r0 = X.C13988Tno.A1Y(r0)
            if (r0 == 0) goto L_0x00ff
            r9 = 0
            r6 = r4
            r7 = r8
            r11 = r8
            r14 = r13
            r15 = r8
            r16 = r8
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r7 = r6.ErP(r7, r8, r9, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x005c
        L_0x00ff:
            com.instagram.ui.widget.searchedittext.SearchEditText r6 = r4.ErO()
            goto L_0x0065
        L_0x0105:
            java.lang.String r2 = "serpSessionId"
            goto L_0x010d
        L_0x0108:
            java.lang.String r2 = "query"
            goto L_0x010d
        L_0x010b:
            java.lang.String r2 = "serpActionBarHelper"
        L_0x010d:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15272UZa.configureActionBar(X.2da):void");
    }

    public final String getModuleName() {
        return "serp";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.UtG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.Nh4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.Nh4} */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r19v0, types: [X.O32, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            r21 = this;
            r13 = 0
            r2 = r22
            X.0qQ.A0B(r2, r13)
            r10 = r21
            r0 = r23
            super.onViewCreated(r2, r0)
            r0 = 2131442428(0x7f0b3afc, float:1.8506896E38)
            android.view.View r8 = X.AnonymousClass7TE.A0b(r2, r0)
            androidx.viewpager.widget.ViewPager r8 = (androidx.viewpager.widget.ViewPager) r8
            r0 = 2131443846(0x7f0b4086, float:1.8509772E38)
            android.view.View r1 = r2.requireViewById(r0)
            r10.A04 = r1
            X.0qQ.A07(r1)
            boolean r0 = r10.CbJ()
            r5 = 0
            if (r0 != 0) goto L_0x0114
            android.content.Context r0 = r10.requireContext()
            int r0 = X.C66582MXn.A01(r0)
            r8.setPadding(r13, r0, r13, r13)
        L_0x0034:
            boolean r0 = r10.A0X
            if (r0 == 0) goto L_0x0048
            r0 = 2131435252(0x7f0b1ef4, float:1.849234E38)
            android.view.View r1 = X.DbY.A0F(r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.widget.edittext.AnimatedHintsTextLayout"
            X.0qQ.A0C(r1, r0)
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r1 = (com.instagram.ui.widget.edittext.AnimatedHintsTextLayout) r1
            r10.A0V = r1
        L_0x0048:
            r8.setOffscreenPageLimit(r13)
            r0 = 2131432931(0x7f0b15e3, float:1.8487633E38)
            android.view.View r9 = X.AnonymousClass7TF.A0G(r2, r0)
            com.instagram.ui.widget.fixedtabbar.FixedTabBar r9 = (com.instagram.ui.widget.fixedtabbar.FixedTabBar) r9
            X.0eM r4 = r10.A0Z
            X.0lg r6 = X.AnonymousClass7TF.A0L(r4, r13)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36318647182104929(0x81079e00031961, double:3.0313969491924876E-306)
            boolean r7 = X.182.A06(r3, r6, r0)
            if (r7 != 0) goto L_0x008b
            java.util.List r0 = r10.A0Y
            int r1 = r0.size()
            r0 = 6
            if (r1 < r0) goto L_0x008b
            X.0lg r6 = X.AnonymousClass7TF.A0L(r4, r13)
            r0 = 36318995074259755(0x8107ef00001b2b, double:3.031616957592049E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x008a
            r0 = 36318097426356084(0x81071e00041774, double:3.0310492814432293E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 == 0) goto L_0x008b
        L_0x008a:
            r5 = 1
        L_0x008b:
            r10.A0R = r5
            if (r5 == 0) goto L_0x00f0
            r0 = 8
            r9.setVisibility(r0)
            X.0hq r15 = r10.getChildFragmentManager()
            X.0qQ.A07(r15)
            r0 = 2131440753(0x7f0b3471, float:1.8503498E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r2, r0)
            com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
            java.util.List r11 = r10.A0Y
            X.O32 r19 = new X.O32
            r19.<init>()
            X.Nh4 r6 = new X.Nh4
            r14 = r6
            r16 = r8
            r17 = r0
            r18 = r10
            r20 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20)
        L_0x00b9:
            X.UsC r6 = (X.C16294UsC) r6
            r10.A0D = r6
            boolean r0 = r10.A0W
            if (r0 == 0) goto L_0x00ed
            android.os.Bundle r1 = r10.mArguments
            if (r1 == 0) goto L_0x00eb
            java.lang.String r0 = "composite_starting_tab_index"
            int r1 = r1.getInt(r0)
        L_0x00cb:
            X.UsC r0 = r10.A0D
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = "tabbedFragmentController"
        L_0x00d1:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d9:
            r0.setMode(r1)
            X.Uy0 r0 = X.Uy0.AUDIO
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x0145
            X.1Av r0 = r10.A06
            if (r0 != 0) goto L_0x0121
            java.lang.String r0 = "userPreferences"
            goto L_0x00d1
        L_0x00eb:
            r1 = 0
            goto L_0x00cb
        L_0x00ed:
            int r1 = r10.A01
            goto L_0x00cb
        L_0x00f0:
            if (r7 != 0) goto L_0x0101
            X.0lg r5 = X.AnonymousClass7TF.A0L(r4, r13)
            r0 = 36312269155795997(0x8101d10005041d, double:3.0273634596724685E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x0104
        L_0x0101:
            r0 = 1
            r9.A08 = r0
        L_0x0104:
            X.0hq r7 = r10.getChildFragmentManager()
            X.0qQ.A07(r7)
            java.util.List r11 = r10.A0Y
            r12 = 1
            X.UtG r6 = new X.UtG
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00b9
        L_0x0114:
            android.content.Context r0 = r10.requireContext()
            int r0 = X.AnonymousClass3D4.A00(r0)
            X.0nA.A0c(r1, r0)
            goto L_0x0034
        L_0x0121:
            X.0xa r1 = r0.A01
            java.lang.String r0 = "audio_global_search_tab_nux_count"
            int r1 = r1.getInt(r0, r13)
            r0 = 2
            if (r1 >= r0) goto L_0x0145
            X.0lg r4 = X.AnonymousClass7TF.A0L(r4, r13)
            r0 = 36312269155599387(0x8101d10002041b, double:3.0273634595481315E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0145
            X.WkS r3 = new X.WkS
            r3.<init>(r10)
            r0 = 500(0x1f4, double:2.47E-321)
            r2.postDelayed(r3, r0)
        L_0x0145:
            java.lang.Integer r0 = X.AnonymousClass05K.A08
            X.AnonymousClass2yJ.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15272UZa.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final C15286UZq A00() {
        C16294UsC usC = this.A0D;
        if (usC == null) {
            0qQ.A0F("tabbedFragmentController");
            throw AnonymousClass00P.createAndThrow();
        }
        C15286UZq A012 = usC.A01();
        0qQ.A0C(A012, "null cannot be cast to non-null type com.instagram.search.surface.fragment.CompositeSerpTabbedFragment.SerpChildFragment");
        return A012;
    }

    public final C227762js A01() {
        C227762js r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("scrollableNavigationHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C14437TwL A02() {
        C14437TwL twL = this.A07;
        if (twL != null) {
            return twL;
        }
        0qQ.A0F("searchNavigationController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C59830Ja5 A03() {
        C59830Ja5 ja5 = this.A09;
        if (ja5 != null) {
            return ja5;
        }
        0qQ.A0F("trackPreviewController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String A04() {
        String str = this.A0K;
        if (str != null) {
            return str;
        }
        0qQ.A0F("searchSessionId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ Fragment ALb(Object obj) {
        Bundle bundle;
        Fragment fragment;
        Uy0 uy0 = (Uy0) obj;
        0qQ.A0B(uy0, 0);
        C14398TvR.A00();
        switch (uy0.ordinal()) {
            case 0:
                bundle = this.mArguments;
                this.A0Z.getValue();
                fragment = new C16207UqW();
                break;
            case 1:
                bundle = this.mArguments;
                this.A0Z.getValue();
                fragment = new C16206UqV();
                break;
            case 2:
                bundle = this.mArguments;
                this.A0Z.getValue();
                fragment = new C16203UqS();
                break;
            case 3:
                bundle = this.mArguments;
                this.A0Z.getValue();
                fragment = new C16209UqY();
                break;
            case 4:
                bundle = this.mArguments;
                this.A0Z.getValue();
                fragment = new C16204UqT();
                break;
            case 5:
                bundle = this.mArguments;
                this.A0Z.getValue();
                fragment = new C16205UqU();
                break;
            case 6:
                bundle = this.mArguments;
                this.A0Z.getValue();
                fragment = new C16208UqX();
                break;
            default:
                throw new RuntimeException();
        }
        fragment.setArguments(bundle);
        return fragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        if (r1 < 7) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.OIJ AN9(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r20
            X.Uy0 r1 = (X.Uy0) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r3 = 0
            r16 = -1
            int r8 = r1.A01
            int r11 = r1.A00
            r2 = r19
            android.content.Context r1 = r2.getContext()
            r0 = 2130970309(0x7f0406c5, float:1.7549324E38)
            int r9 = X.2Yu.A0H(r1, r0)
            boolean r0 = r2.A0R
            if (r0 == 0) goto L_0x0039
            android.content.res.Resources r0 = X.DbV.A05(r2)
            java.lang.String r1 = r0.getString(r8)
            X.0eM r0 = X.0mp.A09
            if (r1 == 0) goto L_0x0036
            int r1 = r1.length()
            r0 = 7
            r16 = 2131165200(0x7f070010, float:1.794461E38)
            if (r1 >= r0) goto L_0x0039
        L_0x0036:
            r16 = 2131165293(0x7f07006d, float:1.79448E38)
        L_0x0039:
            r10 = -1
            X.OIJ r2 = new X.OIJ
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r17 = r10
            r18 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15272UZa.AN9(java.lang.Object):X.OIJ");
    }

    public final boolean CbJ() {
        return 182.A06(0Tu.A05, DbY.A0R(this.A0Z), 36317560555902293L);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0Z);
    }

    public final C227762js BD0() {
        return A01();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: X.0iw} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x019e, code lost:
        if (X.182.A06(r3, r9, 36318067361388382L) == false) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01d4, code lost:
        if (2 != r1) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0225, code lost:
        if (X.182.A06(r3, r4, 36317560556361051L) == false) goto L_0x0227;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = 1037359651(0x3dd4da23, float:0.10393169)
            int r12 = X.AnonymousClass0fD.A02(r0)
            r0 = r20
            X.0eM r7 = r0.A0Z
            X.1Av r1 = X.DbX.A0h(r7)
            r0.A06 = r1
            android.os.Bundle r2 = r0.requireArguments()
            r1 = 30
            java.lang.String r1 = X.C66579MXk.A00(r1)
            android.os.Parcelable r5 = r2.getParcelable(r1)
            com.instagram.model.hashtag.Hashtag r5 = (com.instagram.model.hashtag.Hashtag) r5
            java.lang.String r4 = "Required value was null."
            if (r5 == 0) goto L_0x02d5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "hashtag_"
            r3.append(r1)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r3 = X.AnonymousClass7TF.A0i(r1, r3)
            r1 = 0
            X.0qQ.A0B(r3, r1)
            r0.A0K = r3
            java.lang.String r8 = r5.getName()
            if (r8 == 0) goto L_0x0303
            X.0lg r5 = X.AnonymousClass7TF.A0L(r7, r1)
            X.0Tu r1 = X.0Tu.A05
            r3 = 36322718810974579(0x810b5200012973, double:3.033971863684788E-306)
            boolean r1 = X.182.A06(r1, r5, r3)
            if (r1 != 0) goto L_0x005a
            r1 = 35
            java.lang.String r8 = X.002.A0D(r8, r1)
        L_0x005a:
            r6 = 0
            X.0qQ.A0B(r8, r6)
            r0.A0J = r8
            java.lang.String r1 = "argument_prior_serp_session_id"
            java.lang.String r1 = r2.getString(r1)
            r0.A0I = r1
            java.lang.String r1 = "argument_prior_query_text"
            java.lang.String r1 = r2.getString(r1)
            r0.A0H = r1
            java.lang.String r1 = "argument_prior_module"
            java.lang.String r1 = r2.getString(r1)
            r0.A0G = r1
            java.lang.String r1 = "argument_new_search_session"
            boolean r1 = r2.getBoolean(r1)
            r0.A0T = r1
            java.lang.String r1 = "argument_entity_page_id"
            java.lang.String r1 = r2.getString(r1)
            r0.A0E = r1
            java.lang.String r1 = "serp_source"
            java.lang.String r1 = r2.getString(r1)
            r0.A0M = r1
            java.lang.String r1 = "hcm_serp_source"
            java.lang.String r1 = r2.getString(r1)
            r0.A0F = r1
            java.lang.String r1 = "HashtagFeedFragment.ARGUMENT_ENTRY_TRIGGER"
            r2.getString(r1)
            java.lang.String r1 = X.AnonymousClass7TF.A0b()
            X.0qQ.A0B(r1, r6)
            r0.A0L = r1
            X.0gy r16 = X.AnonymousClass07i.A00(r0)
            android.content.Context r15 = r0.requireContext()
            androidx.fragment.app.FragmentActivity r14 = r0.requireActivity()
            com.instagram.common.session.UserSession r18 = X.AnonymousClass7TE.A0l(r7)
            java.lang.String r1 = r0.A0J
            if (r1 == 0) goto L_0x02f0
            X.VuY r13 = new X.VuY
            r19 = r1
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.A08 = r13
            com.instagram.common.session.UserSession r9 = r13.A08
            X.0Tu r3 = X.0Tu.A05
            r1 = 36323234206985235(0x810bca00002c13, double:3.03429780219726E-306)
            boolean r1 = X.182.A06(r3, r9, r1)
            if (r1 == 0) goto L_0x00f7
            java.lang.String r10 = r13.A0A
            boolean r1 = X.C253063q9.A02(r10)
            if (r1 == 0) goto L_0x00f7
            r1 = 2
            X.Ufo r8 = new X.Ufo
            r8.<init>(r13, r1)
            android.content.Context r5 = r13.A05
            X.07i r4 = r13.A06
            X.0iw r1 = r13.A07
            X.2oy r2 = new X.2oy
            r2.<init>(r5, r4, r1, r9)
            r13.A02 = r2
            r1 = 1
            java.lang.String r1 = X.00R.A02(r10, r1)
            r2.A04(r8, r9, r1)
        L_0x00f7:
            X.TwY r1 = new X.TwY
            r1.<init>(r0)
            r0.A0C = r1
            java.lang.String r17 = r0.A04()
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r7)
            androidx.fragment.app.FragmentActivity r14 = r0.requireActivity()
            r10 = 0
            r18 = 112(0x70, float:1.57E-43)
            X.TwL r13 = new X.TwL
            r19 = r6
            r15 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.A07 = r13
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r7)
            r8 = 1
            X.0qQ.A0B(r2, r8)
            X.TwK r1 = new X.TwK
            r1.<init>(r10, r2, r10)
            r0.A0A = r1
            android.content.Context r13 = r0.requireContext()
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r7)
            android.content.Context r4 = r0.requireContext()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r7)
            X.2xu r1 = new X.2xu
            r1.<init>(r4, r2)
            java.lang.String r17 = "CompositeSerpTabbedFragment"
            boolean r18 = X.C234472xv.A02(r14)
            r15 = r10
            r16 = r1
            X.2xy r2 = X.C234472xv.A00(r13, r14, r15, r16, r17, r18)
            X.Ja5 r1 = new X.Ja5
            r1.<init>(r2)
            r0.A09 = r1
            java.util.List r5 = r0.A0Y
            X.Uy0 r4 = X.Uy0.AUDIO
            boolean r1 = r5.contains(r4)
            if (r1 != 0) goto L_0x01a5
            X.0lg r9 = X.AnonymousClass7TF.A0L(r7, r6)
            r1 = 36312269155861534(0x8101d10006041e, double:3.0273634597139143E-306)
            boolean r1 = X.182.A06(r3, r9, r1)
            if (r1 == 0) goto L_0x01a5
            X.0lg r9 = X.AnonymousClass7TF.A0L(r7, r6)
            r1 = 36593744132441567(0x8201d1000405df, double:3.205369368311884E-306)
            long r1 = X.182.A01(r3, r9, r1)
            int r9 = (int) r1
            r0.A00 = r9
            r5.add(r9, r4)
            X.0lg r9 = X.AnonymousClass7TF.A0L(r7, r6)
            r1 = 36318067361322845(0x8107170000175d, double:3.031030268195147E-306)
            boolean r9 = X.182.A06(r3, r9, r1)
            r0.A0O = r9
            X.0lg r9 = X.AnonymousClass7TF.A0L(r7, r6)
            boolean r1 = X.182.A06(r3, r9, r1)
            if (r1 == 0) goto L_0x01a0
            r1 = 36318067361388382(0x8107170001175e, double:3.0310302682365927E-306)
            boolean r2 = X.182.A06(r3, r9, r1)
            r1 = 1
            if (r2 != 0) goto L_0x01a1
        L_0x01a0:
            r1 = 0
        L_0x01a1:
            r0.A0N = r1
            r0.A0P = r8
        L_0x01a5:
            X.Uy0 r9 = X.Uy0.CLIPS
            boolean r1 = r5.contains(r9)
            r8 = 2
            if (r1 != 0) goto L_0x01d6
            X.0lg r11 = X.AnonymousClass7TF.A0L(r7, r6)
            r1 = 36318097426093937(0x81071e00001771, double:3.0310492812774465E-306)
            boolean r1 = X.182.A06(r3, r11, r1)
            if (r1 == 0) goto L_0x01d6
            X.0lg r11 = X.AnonymousClass7TF.A0L(r7, r6)
            r1 = 36318097426487158(0x81071e00061776, double:3.031049281526121E-306)
            boolean r1 = X.182.A06(r3, r11, r1)
            if (r1 == 0) goto L_0x029e
            int r1 = r5.size()
        L_0x01d0:
            r5.add(r1, r9)
            r9 = 3
            if (r8 == r1) goto L_0x01d7
        L_0x01d6:
            r9 = 2
        L_0x01d7:
            X.Uy0 r8 = X.Uy0.TOP
            boolean r1 = r5.contains(r8)
            if (r1 != 0) goto L_0x01f1
            X.0lg r4 = X.AnonymousClass7TF.A0L(r7, r6)
            r1 = 36318647181973855(0x81079e0001195f, double:3.031396949109596E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x01f1
            r5.add(r9, r8)
        L_0x01f1:
            int r1 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            android.content.Context r1 = r0.requireContext()
            X.2js r1 = X.C227752jr.A00(r1, r10, r6)
            r0.A05 = r1
            r1 = r21
            X.C15272UZa.super.onCreate(r1)
            android.content.Context r1 = r0.getContext()
            boolean r1 = X.0mk.A02(r1)
            r0.A0Q = r1
            X.0lg r4 = X.AnonymousClass7TF.A0L(r7, r6)
            r1 = 36317560555902293(0x8106a1000b1555, double:3.030709762406448E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0227
            r1 = 36317560556361051(0x8106a10012155b, double:3.0307097626965685E-306)
            boolean r2 = X.182.A06(r3, r4, r1)
            r1 = 1
            if (r2 != 0) goto L_0x0228
        L_0x0227:
            r1 = 0
        L_0x0228:
            r0.A0S = r1
            X.0lg r4 = X.AnonymousClass7TF.A0L(r7, r6)
            r1 = 36330737514988270(0x81129d000242ee, double:3.0390429243917753E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            r0.A0X = r1
            boolean r1 = r0.A0S
            if (r1 == 0) goto L_0x0280
            X.2dY r1 = X.2dZ.A0t
            X.2dZ r4 = r1.A04(r0)
            android.content.Context r8 = r0.requireContext()
            X.0lg r5 = X.AnonymousClass7TF.A0L(r7, r6)
            r1 = 37161985486225623(0x8406a1000e00d7, double:3.5647274885691945E-306)
            double r1 = X.182.A00(r3, r5, r1)
            android.graphics.drawable.GradientDrawable$Orientation r3 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            android.graphics.drawable.GradientDrawable r1 = X.GIZ.A00(r8, r3, r1)
            android.view.View r2 = r4.A0N
            r2.setBackground(r1)
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r7)
            androidx.fragment.app.FragmentActivity r14 = r0.requireActivity()
            android.view.View r1 = r4.A03
            android.view.View[] r1 = new android.view.View[]{r1, r2}
            java.util.List r17 = X.0sr.A1P(r1)
            X.2js r15 = r0.A01()
            int r18 = r4.AYI()
            X.HCA r13 = new X.HCA
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.A0B = r13
        L_0x0280:
            X.2el r4 = X.2el.A00()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r7)
            X.0eM r1 = r0.A0a
            java.lang.Object r2 = r1.getValue()
            X.0wc r2 = (X.0wc) r2
            X.GXv r1 = new X.GXv
            r1.<init>(r2, r3, r4)
            r0.A0U = r1
            r0 = 1614803595(0x603ff28b, float:5.532508E19)
            X.AnonymousClass0fD.A09(r0, r12)
            return
        L_0x029e:
            r1 = 36318097426618232(0x81071e00081778, double:3.031049281609013E-306)
            boolean r1 = X.182.A06(r3, r11, r1)
            if (r1 == 0) goto L_0x02bf
            X.Uy0 r4 = X.Uy0.HASHTAGS
        L_0x02ab:
            boolean r1 = r5.contains(r4)
            if (r1 != 0) goto L_0x02cd
            X.Uy0 r4 = X.Uy0.USERS
            boolean r1 = r5.contains(r4)
            if (r1 != 0) goto L_0x02cd
            int r1 = r5.size()
            goto L_0x01d0
        L_0x02bf:
            r1 = 36318097426552695(0x81071e00071777, double:3.031049281567567E-306)
            boolean r1 = X.182.A06(r3, r11, r1)
            if (r1 != 0) goto L_0x02ab
            X.Uy0 r4 = X.Uy0.USERS
            goto L_0x02ab
        L_0x02cd:
            int r1 = r5.indexOf(r4)
            int r1 = r1 + 1
            goto L_0x01d0
        L_0x02d5:
            java.lang.String r1 = "argument_search_session_id"
            java.lang.String r1 = r2.getString(r1)
            if (r1 == 0) goto L_0x02fa
            r0.A0K = r1
            java.lang.String r1 = "argument_search_string"
            java.lang.String r8 = r2.getString(r1)
            if (r8 != 0) goto L_0x005a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r4)
            r0 = -2071831031(0xffffffff84825e09, float:-3.064921E-36)
            goto L_0x030b
        L_0x02f0:
            java.lang.String r0 = "query"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x02fa:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r4)
            r0 = 1502869525(0x5993f815, float:5.2061988E15)
            goto L_0x030b
        L_0x0303:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r4)
            r0 = -649379257(0xffffffffd94b4247, float:-3.57576831E15)
        L_0x030b:
            X.AnonymousClass0fD.A09(r0, r12)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15272UZa.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2091742400);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_composite_search, false);
        AnonymousClass0fD.A09(-280735131, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-521044431);
        if (this.A02 != -1) {
            2cc A002 = C71342cb.A00(DbT.A0X(this.A0Z));
            C16294UsC usC = this.A0D;
            if (usC == null) {
                0qQ.A0F("tabbedFragmentController");
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass4DH item = usC.getItem(this.A02);
            0qQ.A0C(item, C273654mx.A00(8));
            A002.A08(getActivity(), item);
            this.A02 = -1;
        }
        super.onDestroy();
        AnonymousClass0fD.A09(815470436, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-506960923);
        this.A04 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(1830839544, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(364574091);
        super.onResume();
        if (!this.A0W) {
            A00();
        } else {
            C71342cb.A00(DbT.A0X(this.A0Z)).A0C(A00());
            C16294UsC usC = this.A0D;
            if (usC == null) {
                0qQ.A0F("tabbedFragmentController");
                throw AnonymousClass00P.createAndThrow();
            }
            Object A023 = usC.A02();
            0qQ.A0B(A023, 0);
            List list = this.A0Y;
            int indexOf = list.indexOf(A023);
            if (this.A0Q) {
                indexOf = C51966G9m.A06(list) - indexOf;
            }
            this.A02 = indexOf;
        }
        this.A0W = false;
        AnonymousClass0fD.A09(-1083273544, A022);
    }

    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        super.onSetUserVisibleHint(z, z2);
        if (!z && A03().A02.isPlaying()) {
            C13988Tno.A1K(A03());
        }
    }
}
