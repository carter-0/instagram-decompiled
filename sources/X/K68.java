package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.reels.store.ReelStore;
import java.util.List;
import java.util.Set;

public final class K68 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, XBP, X3F, MRV, MRX {
    public static final String __redex_internal_original_name = "ManageHighlightsFragment";
    public HighlightReelTypeStr A00;
    public C64184LSr A01;
    public C62538KhU A02 = C62538KhU.SELECTED;
    public C252063oV A03;
    public AnonymousClass4UC A04;
    public C231002qi A05;
    public C16343UtG A06;
    public boolean A07;
    public boolean A08;
    public List A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final boolean A0F;

    public final void configureActionBar(2da r4) {
        C64184LSr lSr;
        Set keySet;
        0qQ.A0B(r4, 0);
        r4.Eom(2131963443);
        r4.Eu4(true);
        if (!AnonymousClass7TF.A1Z(this.A0A) || (lSr = this.A01) == null || (keySet = lSr.A05.keySet()) == null || !keySet.isEmpty()) {
            LYC.A01(r4, this, 36, 2131960992);
        } else {
            r4.AA6(2131960992);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: X.XBP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: X.07Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: X.0iw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r26, android.os.Bundle r27) {
        /*
            r25 = this;
            r2 = 0
            r3 = r26
            X.0qQ.A0B(r3, r2)
            r0 = r25
            r1 = r27
            super.onViewCreated(r3, r1)
            X.0hq r7 = r0.getChildFragmentManager()
            X.0qQ.A07(r7)
            r1 = 2131442431(0x7f0b3aff, float:1.8506902E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r3, r1)
            androidx.viewpager.widget.ViewPager r8 = (androidx.viewpager.widget.ViewPager) r8
            r1 = 2131432931(0x7f0b15e3, float:1.8487633E38)
            android.view.View r9 = X.AnonymousClass7TF.A0G(r3, r1)
            com.instagram.ui.widget.fixedtabbar.FixedTabBar r9 = (com.instagram.ui.widget.fixedtabbar.FixedTabBar) r9
            java.util.List r1 = r0.A09
            if (r1 != 0) goto L_0x0034
            java.lang.String r0 = "tabModes"
        L_0x002c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0034:
            r5 = 1
            X.UtG r6 = new X.UtG
            r13 = r5
            r10 = r0
            r11 = r1
            r12 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.A06 = r6
            r1 = 2131438901(0x7f0b2d35, float:1.8499742E38)
            X.3oV r1 = X.DbU.A0Y(r3, r1)
            r0.A03 = r1
            X.2qi r1 = r0.A05
            if (r1 != 0) goto L_0x0050
            java.lang.String r0 = "quickPromotionPresenter"
            goto L_0x002c
        L_0x0050:
            r1.Dh3()
            X.UtG r4 = r0.A06
            if (r4 == 0) goto L_0x005c
            X.KhU r1 = X.C62538KhU.SELECTED
            r4.A03(r1)
        L_0x005c:
            X.KhU r1 = X.C62538KhU.SELECTED
            r0.A02 = r1
            X.0eM r9 = r0.A0C
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r9)
            com.instagram.reels.store.ReelStore r4 = X.1OP.A05(r1)
            X.0eM r1 = r0.A0B
            java.lang.String r1 = X.DbS.A0t(r1)
            com.instagram.model.reels.Reel r4 = r4.A0M(r1)
            X.LSr r8 = r0.A01
            java.lang.String r15 = "Required value was null."
            if (r8 == 0) goto L_0x01ba
            java.util.Set r1 = r8.A06
            r1.add(r0)
            r8.A07(r4)
            r1 = 2131432189(0x7f0b12fd, float:1.8486128E38)
            android.view.ViewGroup r10 = X.DbX.A0I(r3, r1)
            if (r4 == 0) goto L_0x01b2
            com.instagram.model.reels.ReelType r6 = r4.A0P
            com.instagram.model.reels.ReelType r1 = com.instagram.model.reels.ReelType.A0b
            if (r6 == r1) goto L_0x0095
            com.instagram.model.reels.ReelType r1 = com.instagram.model.reels.ReelType.A0d
            if (r6 != r1) goto L_0x01b2
        L_0x0095:
            r7 = 1
        L_0x0096:
            com.instagram.api.schemas.HighlightReelTypeStr r6 = r0.A00
            com.instagram.api.schemas.HighlightReelTypeStr r1 = com.instagram.api.schemas.HighlightReelTypeStr.FAN_CLUB
            boolean r17 = X.AnonymousClass7TF.A1W(r6, r1)
            X.L8l r1 = r8.A00
            if (r1 == 0) goto L_0x01aa
            com.instagram.common.typedurl.ImageUrl r14 = r1.A02
        L_0x00a4:
            java.lang.String r12 = r8.A01
            r16 = r7 ^ 1
            boolean r11 = r0.A08
            X.0qQ.A0A(r14)
            X.0qQ.A0A(r12)
            r1 = 2
            X.0qQ.A0B(r12, r1)
            android.view.LayoutInflater r6 = X.DbX.A0F(r10, r2)
            r1 = 2131626634(0x7f0e0a8a, float:1.888051E38)
            android.view.View r8 = X.DbU.A09(r6, r10, r1, r2)
            X.JpA r1 = new X.JpA
            r1.<init>(r8)
            r8.setTag(r1)
            android.content.Context r7 = r0.requireContext()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r9)
            java.lang.Object r13 = r8.getTag()
            if (r13 == 0) goto L_0x01b5
            X.JpA r13 = (X.C60663JpA) r13
            X.AnonymousClass7TF.A1C(r6, r5, r13)
            com.instagram.common.ui.widget.imageview.CircularImageView r15 = r13.A05
            android.view.View r5 = r13.A00
            X.Jpp r1 = r13.A06
            X.0eM r1 = r1.A08
            java.lang.Object r1 = r1.getValue()
            X.JdE r1 = (X.C60005JdE) r1
            r18 = r7
            r19 = r5
            r20 = r0
            r21 = r6
            r22 = r14
            r23 = r1
            r24 = r15
            X.C63052Kqh.A00(r18, r19, r20, r21, r22, r23, r24)
            X.LSr r15 = X.C64184LSr.A00(r6)
            X.0qQ.A07(r15)
            android.widget.TextView r5 = r13.A04
            r6 = r11 ^ 1
            r14 = 8
            int r1 = X.DbW.A01(r6)
            r5.setVisibility(r1)
            java.util.Map r1 = r15.A05
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            r5.setEnabled(r1)
            android.view.View r5 = r13.A01
            r1 = 13
            X.LY8.A00(r5, r1, r0, r15)
            android.view.View r1 = r13.A02
            if (r16 == 0) goto L_0x0124
            r14 = 0
        L_0x0124:
            r1.setVisibility(r14)
            if (r16 == 0) goto L_0x0158
            r1.setVisibility(r2)
            if (r17 == 0) goto L_0x013e
            r2 = 2131238187(0x7f081d2b, float:1.8092646E38)
            r1 = 2131099928(0x7f060118, float:1.7812223E38)
            android.graphics.drawable.Drawable r5 = X.AnonymousClass4Ed.A01(r7, r2, r1)
            android.widget.EditText r2 = r13.A03
            r1 = 0
            r2.setCompoundDrawablesWithIntrinsicBounds(r5, r1, r1, r1)
        L_0x013e:
            android.widget.EditText r2 = r13.A03
            r2.setText(r12)
            X.JTR.A1F(r2)
            r2.setFocusable(r6)
            r2.setFocusableInTouchMode(r6)
            if (r11 == 0) goto L_0x01a1
            r1 = 1056964608(0x3f000000, float:0.5)
            r2.setAlpha(r1)
            r1 = 21
            X.LYC.A00(r2, r1, r7)
        L_0x0158:
            r10.addView(r8)
            android.content.Context r6 = r0.requireContext()
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r9)
            X.0gy r9 = X.AnonymousClass07i.A00(r0)
            r1 = 2131441299(0x7f0b3693, float:1.8504606E38)
            android.view.ViewStub r7 = X.DbU.A0D(r3, r1)
            X.FQx r5 = new X.FQx
            r8 = r0
            r10 = r0
            r12 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r1 = 2131432492(0x7f0b142c, float:1.8486743E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r3, r1)
            r1 = 37
            X.LYC.A00(r2, r1, r0)
            r1 = 2131432491(0x7f0b142b, float:1.848674E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r3, r1)
            X.07U r8 = X.07U.A05
            X.07Z r6 = r0.getViewLifecycleOwner()
            X.0xx r1 = X.AnonymousClass07a.A00(r6)
            r9 = 0
            r10 = 14
            X.JUk r3 = new X.JUk
            r5 = r0
            r7 = r2
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r10)
            X.AnonymousClass7TE.A1Z(r3, r1)
            return
        L_0x01a1:
            X.LWR r1 = new X.LWR
            r1.<init>(r2, r0)
            r2.addTextChangedListener(r1)
            goto L_0x0158
        L_0x01aa:
            java.lang.String r1 = ""
            com.instagram.common.typedurl.SimpleImageUrl r14 = X.DbS.A0V(r1)
            goto L_0x00a4
        L_0x01b2:
            r7 = 0
            goto L_0x0096
        L_0x01b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x01ba:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K68.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(K68 k68) {
        C64184LSr.A03(AnonymousClass7TE.A0l(k68.A0C));
        k68.A01 = null;
        if (!AnonymousClass7TF.A1Z(k68.A0A)) {
            synchronized (LNo.class) {
                if (LNo.A01 != null) {
                    LNo.A01 = null;
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ Fragment ALb(Object obj) {
        int A022 = DbU.A02((C62538KhU) obj, 0);
        if (A022 == 0) {
            C15386Ubl ubl = new C15386Ubl();
            ubl.setArguments(requireArguments());
            return ubl;
        } else if (A022 == 1) {
            Bundle requireArguments = requireArguments();
            requireArguments.putSerializable("edit_highlights_reel_id", DbS.A0t(this.A0B));
            requireArguments.putSerializable("highlight_management_source", (Ki3) this.A0D.getValue());
            requireArguments.putBoolean("hide_privacy_footer", true);
            Fragment A002 = LT8.A00(requireArguments, AnonymousClass7TE.A0l(this.A0C));
            0qQ.A0A(A002);
            return A002;
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public final /* bridge */ /* synthetic */ OIJ AN9(Object obj) {
        C62538KhU khU = (C62538KhU) obj;
        0qQ.A0B(khU, 0);
        return C18278Vot.A00(khU.A00);
    }

    public final /* bridge */ /* synthetic */ void DqK(Object obj) {
        C62538KhU khU;
        C62538KhU khU2 = (C62538KhU) obj;
        0qQ.A0B(khU2, 0);
        if (isResumed() && khU2 != (khU = this.A02)) {
            C16343UtG utG = this.A06;
            if (utG != null) {
                C21048XBp item = utG.getItem(utG.A00.indexOf(khU));
                0qQ.A07(item);
                String A002 = AnonymousClass000.A00(3649);
                0qQ.A0C(item, A002);
                item.DVy();
                this.A02 = khU2;
                C16343UtG utG2 = this.A06;
                if (utG2 != null) {
                    C21048XBp item2 = utG2.getItem(utG2.A00.indexOf(khU2));
                    0qQ.A07(item2);
                    0qQ.A0C(item2, A002);
                    item2.DW7();
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final String getModuleName() {
        int i;
        if (this.A02 == C62538KhU.SELECTED) {
            i = 594;
        } else {
            i = 1743;
        }
        return AnonymousClass000.A00(i);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public final boolean isContainerFragment() {
        return this.A0F;
    }

    public final boolean onBackPressed() {
        C64184LSr lSr;
        if (this.A07 || !AnonymousClass7TF.A1Z(this.A0A) || (lSr = this.A01) == null) {
            this.A07 = false;
            return false;
        }
        C63829L8k A042 = lSr.A04();
        if (!A042.A03.isEmpty() || !A042.A04.isEmpty() || A042.A02 || A042.A01 || A042.A00) {
            C358248ab A0U = DbW.A0U(this);
            A0U.A09(2131974696);
            A0U.A08(2131974693);
            A0U.A0H(LV3.A00(this, 9), 2131974694);
            Dba.A0t((DialogInterface.OnClickListener) null, A0U, 2131974695);
            return true;
        }
        A00(this);
        return false;
    }

    public K68() {
        0eO r4 = 0eO.A02;
        this.A0B = C51975G9x.A0r(this, "edit_highlights_reel_id", r4, 18);
        this.A0D = C51975G9x.A0r(this, "highlight_management_source", r4, 19);
        this.A0A = AnonymousClass0eN.A00(r4, new C58719IwS(AnonymousClass7TE.A0u(), this, C273654mx.A00(2300), 12));
        MME mme = new MME(this, 18);
        AnonymousClass0eM A002 = MME.A00(new MME(this, 15), r4, 16);
        this.A0E = DbS.A0I(new MME(A002, 17), mme, new MMZ(44, (Object) null, (Object) A002), DbS.A0z(C60162Jgh.class));
        this.A0C = C227642jf.A02(this);
        this.A0F = true;
    }

    public final void AAw(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A13 = Dbc.A13(str, i2);
            if (z) {
                if (!A13) {
                    break;
                }
                length--;
            } else if (!A13) {
                z = true;
            } else {
                i++;
            }
        }
        String A0c = Dba.A0c(str, length, i);
        if (A0c.length() == 0) {
            A0c = DbU.A0m(this, 2131963446);
        }
        C64184LSr.A00(AnonymousClass7TE.A0l(this.A0C)).A01 = A0c;
        Dbb.A0u(this);
    }

    public final void D8L() {
        requireActivity().setResult(-1);
        DbT.A1K(this);
    }

    public final void DQl() {
        Dbb.A0u(this);
    }

    public final void onCreate(Bundle bundle) {
        HighlightReelTypeStr highlightReelTypeStr;
        int A022 = AnonymousClass0fD.A02(-510116525);
        K68.super.onCreate(bundle);
        AnonymousClass0eM r5 = this.A0C;
        ReelStore A032 = ReelStore.A03(AnonymousClass7TE.A0l(r5));
        AnonymousClass0eM r3 = this.A0B;
        Reel A0M = A032.A0M(DbS.A0t(r3));
        if (A0M != null) {
            highlightReelTypeStr = A0M.A09;
        } else {
            highlightReelTypeStr = null;
        }
        this.A00 = highlightReelTypeStr;
        Reel A0M2 = ReelStore.A03(AnonymousClass7TE.A0l(r5)).A0M(DbS.A0t(r3));
        boolean z = true;
        if (A0M2 == null || !A0M2.A0l()) {
            z = false;
        }
        this.A08 = z;
        01N A1H = 0jo.A1H();
        A1H.add(C62538KhU.SELECTED);
        if (this.A00 != HighlightReelTypeStr.FAN_CLUB) {
            A1H.add(C62538KhU.ARCHIVE);
        }
        this.A09 = 0jo.A1I(A1H);
        C64184LSr.A03(AnonymousClass7TE.A0l(r5));
        this.A01 = C64184LSr.A00(AnonymousClass7TE.A0l(r5));
        1YN A002 = AnonymousClass2bO.A00();
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0P;
        AnonymousClass2bO.A00();
        this.A05 = A002.A01(this, this, A0l, 2bV.A05(new WZX(this, 1), new C50736Fhb(this, 0)), quickPromotionSlot);
        AnonymousClass0fD.A09(384228140, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2122518221);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.archive_tabbed_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1175930167, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-2051229930);
        super.onDestroyView();
        C64184LSr lSr = this.A01;
        if (lSr != null) {
            lSr.A06.remove(this);
        }
        this.A06 = null;
        AnonymousClass0fD.A09(2114966907, A022);
    }
}
