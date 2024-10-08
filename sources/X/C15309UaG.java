package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.UaG  reason: case insensitive filesystem */
public abstract class C15309UaG extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenOneTapOnboardingBaseFragment";
    public IgdsBottomButtonLayout A00;
    public IgRadioGroup A01;
    public boolean A02;
    public boolean A03 = true;
    public NestedScrollView A04;
    public C262204Co A05;
    public final ViewTreeObserver.OnPreDrawListener A06 = new WCE(this, 3);
    public final int[] A07 = new int[2];
    public final int[] A08 = new int[2];

    public final void configureActionBar(2da r5) {
        String A0m;
        0qQ.A0B(r5, 0);
        if (this instanceof C16009Umq) {
            C16009Umq umq = (C16009Umq) this;
            AnonymousClass0eM r2 = umq.A01;
            if (((C16061Uno) r2.getValue()).A01 == C16602Uxw.A04) {
                A0m = "";
            } else {
                A0m = C13991Tnr.A0d(umq, umq.getString(((C16061Uno) r2.getValue()).A01.A00), 2131964705);
            }
        } else {
            A0m = DbU.A0m(this, 2131970571);
        }
        r5.setTitle(A0m);
        Dbc.A0k(r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            r5 = 0
            X.0qQ.A0B(r14, r5)
            super.onViewCreated(r14, r15)
            r0 = 2131437274(0x7f0b26da, float:1.8496442E38)
            android.view.View r0 = r14.requireViewById(r0)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r13.A04 = r0
            r0 = 2131437276(0x7f0b26dc, float:1.8496446E38)
            android.widget.TextView r1 = X.DbU.A0G(r14, r0)
            r4 = r13
            boolean r2 = r13 instanceof X.C16009Umq
            if (r2 == 0) goto L_0x00f5
            r0 = 2131964846(0x7f1333ae, float:1.9566485E38)
            java.lang.String r0 = X.DbU.A0m(r13, r0)
        L_0x0025:
            r1.setText(r0)
            r0 = 2131437275(0x7f0b26db, float:1.8496444E38)
            android.widget.TextView r7 = X.DbU.A0G(r14, r0)
            if (r2 == 0) goto L_0x00ec
            r6 = r4
            X.Umq r6 = (X.C16009Umq) r6
            X.0eM r0 = r6.A01
            java.lang.Object r0 = r0.getValue()
            X.Uno r0 = (X.C16061Uno) r0
            X.Uxw r3 = r0.A01
            X.Uxw r1 = X.C16602Uxw.A06
            r0 = 2131964844(0x7f1333ac, float:1.9566481E38)
            if (r3 != r1) goto L_0x0048
            r0 = 2131964845(0x7f1333ad, float:1.9566483E38)
        L_0x0048:
            java.lang.String r0 = X.DbU.A0m(r6, r0)
        L_0x004c:
            r7.setText(r0)
            r0 = 2131437265(0x7f0b26d1, float:1.8496424E38)
            android.view.View r8 = r14.requireViewById(r0)
            com.instagram.ui.widget.radiogroup.IgRadioGroup r8 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r8
            X.Uy3[] r10 = X.C16607Uy3.values()
            int r9 = r10.length
            r7 = 0
        L_0x005e:
            if (r7 >= r9) goto L_0x0110
            r6 = r10[r7]
            androidx.fragment.app.FragmentActivity r0 = r13.requireActivity()
            X.U5O r3 = new X.U5O
            r3.<init>(r0)
            r3.setTag(r6)
            int r1 = X.DbU.A02(r6, r5)
            if (r2 == 0) goto L_0x00df
            if (r1 == r5) goto L_0x00db
            r0 = 1
            if (r1 != r0) goto L_0x0104
            r0 = 2131964839(0x7f1333a7, float:1.956647E38)
        L_0x007c:
            r3.setPrimaryText((int) r0)
            if (r2 == 0) goto L_0x00d8
            int r1 = X.DbU.A02(r6, r5)
            if (r1 == r5) goto L_0x00d4
            r0 = 1
            if (r1 != r0) goto L_0x00fe
            r0 = 2131964840(0x7f1333a8, float:1.9566473E38)
        L_0x008d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x00d8
            int r0 = r0.intValue()
        L_0x0097:
            r3.setSecondaryText((int) r0)
            r0 = 1
            r3.A04(r0)
            java.lang.Integer r0 = r6.A02
            if (r0 == 0) goto L_0x00c0
            int r0 = r0.intValue()
            java.lang.String r12 = X.DbU.A0m(r13, r0)
            X.U8d r1 = r13.A02()
            boolean r0 = r1 instanceof X.C16061Uno
            if (r0 == 0) goto L_0x00cf
            X.Uno r1 = (X.C16061Uno) r1
            com.instagram.common.session.UserSession r11 = r1.A00
        L_0x00b6:
            r1 = 49
            X.WBG r0 = new X.WBG
            r0.<init>(r1, r13, r6)
            r3.setActionLabel(r12, r11, r0)
        L_0x00c0:
            r1 = 6
            X.Wen r0 = new X.Wen
            r0.<init>(r1, r6, r3)
            r3.A9W(r0)
            r8.addView(r3)
            int r7 = r7 + 1
            goto L_0x005e
        L_0x00cf:
            X.Unp r1 = (X.C16062Unp) r1
            com.instagram.common.session.UserSession r11 = r1.A02
            goto L_0x00b6
        L_0x00d4:
            r0 = 2131964843(0x7f1333ab, float:1.956648E38)
            goto L_0x008d
        L_0x00d8:
            int r0 = r6.A01
            goto L_0x0097
        L_0x00db:
            r0 = 2131964841(0x7f1333a9, float:1.9566475E38)
            goto L_0x007c
        L_0x00df:
            if (r1 == r5) goto L_0x00e8
            r0 = 1
            if (r1 != r0) goto L_0x010a
            r0 = 2131964847(0x7f1333af, float:1.9566487E38)
            goto L_0x007c
        L_0x00e8:
            r0 = 2131964851(0x7f1333b3, float:1.9566495E38)
            goto L_0x007c
        L_0x00ec:
            r0 = 2131964710(0x7f133326, float:1.956621E38)
            java.lang.String r0 = X.DbU.A0m(r13, r0)
            goto L_0x004c
        L_0x00f5:
            r0 = 2131964711(0x7f133327, float:1.9566211E38)
            java.lang.String r0 = X.DbU.A0m(r13, r0)
            goto L_0x0025
        L_0x00fe:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0104:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x010a:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0110:
            r7 = 1
            X.Weu r0 = new X.Weu
            r0.<init>(r7, r13, r8)
            r8.A02 = r0
            r13.A01 = r8
            r0 = 2131437273(0x7f0b26d9, float:1.849644E38)
            android.view.View r0 = r14.requireViewById(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r0
            r13.A00 = r0
            if (r2 == 0) goto L_0x0148
            X.Umq r4 = (X.C16009Umq) r4
            X.W3L r3 = X.VK1.A00
            android.content.Context r2 = r4.requireContext()
            X.0eM r0 = r4.A01
            java.lang.Object r0 = r0.getValue()
            X.Uno r0 = (X.C16061Uno) r0
            com.instagram.common.session.UserSession r1 = r0.A00
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            android.text.SpannableStringBuilder r1 = r3.A08(r0, r2, r1)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r13.A00
            if (r0 == 0) goto L_0x0148
            r0.setFooterText(r1)
        L_0x0148:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r13.A00
            if (r2 == 0) goto L_0x0156
            r1 = 18
            X.WBA r0 = new X.WBA
            r0.<init>((java.lang.Object) r13, (int) r1)
            r2.setPrimaryActionOnClickListener(r0)
        L_0x0156:
            r0 = 2131435793(0x7f0b2111, float:1.8493438E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r14, r0)
            r0 = 2131428885(0x7f0b0615, float:1.8479427E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r14, r0)
            r0 = 2131428590(0x7f0b04ee, float:1.8478829E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r6, r0)
            X.U8d r0 = r13.A02()
            X.2Fk r2 = r0.A01
            X.07Z r1 = r13.getViewLifecycleOwner()
            X.J6m r0 = new X.J6m
            r0.<init>((int) r5, (java.lang.Object) r4, (java.lang.Object) r6, (java.lang.Object) r13)
            r4 = 10
            X.DbV.A1F(r1, r2, r0, r4)
            r0 = 48
            X.WBG.A01(r3, r0, r13, r6)
            X.U8d r1 = r13.A02()
            X.Vfp r0 = r1.A02
            java.lang.String r3 = r1.A00()
            X.0qQ.A0B(r3, r5)
            X.XB6 r2 = r0.A00
            java.lang.String r1 = "lead_gen_one_tap_setup"
            java.lang.String r0 = "one_tap_setup_impression"
            X.XB6.A02(r2, r3, r1, r0)
            X.U8d r1 = r13.A02()
            androidx.fragment.app.FragmentActivity r6 = r13.requireActivity()
            boolean r0 = r1 instanceof X.C16061Uno
            if (r0 == 0) goto L_0x01e7
            X.Uno r1 = (X.C16061Uno) r1
            com.instagram.leadgen.organic.model.LeadGenFormData r5 = r1.A02
            r5.A07 = r7
            r5.A09 = r7
            r0 = 2131964850(0x7f1333b2, float:1.9566493E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r6, r0)
            X.Uwe r2 = X.C16534Uwe.SHORT_ANSWER
            X.0sn r1 = X.0sn.A00
            com.instagram.leadgen.organic.model.LeadFormCustomQuestion r0 = new com.instagram.leadgen.organic.model.LeadFormCustomQuestion
            r0.<init>(r2, r3, r1)
            com.instagram.leadgen.organic.model.LeadFormCustomQuestion[] r0 = new com.instagram.leadgen.organic.model.LeadFormCustomQuestion[]{r0}
            java.util.ArrayList r0 = X.0sr.A1L(r0)
            r5.A06 = r0
        L_0x01c8:
            X.U8d r0 = r13.A02()
            X.2Fk r2 = r0.A00
            X.07Z r1 = r13.getViewLifecycleOwner()
            r0 = 23
            X.C20786Wyx.A00(r1, r2, r13, r0, r4)
            X.U8w r0 = r13.A01()
            X.2Fk r2 = r0.A00
            X.07Z r1 = r13.getViewLifecycleOwner()
            r0 = 24
            X.C20786Wyx.A00(r1, r2, r13, r0, r4)
            return
        L_0x01e7:
            X.Unp r1 = (X.C16062Unp) r1
            com.instagram.business.promote.model.PromoteData r3 = r1.A00
            X.Uxy r0 = X.C16604Uxy.A05
            X.GSY r2 = X.VEP.A00(r6, r0)
            X.Uxy r0 = X.C16604Uxy.A06
            X.GSY r1 = X.VEP.A00(r6, r0)
            X.Uxy r0 = X.C16604Uxy.A04
            X.GSY r0 = X.VEP.A00(r6, r0)
            X.GSY[] r0 = new X.GSY[]{r2, r1, r0}
            java.util.ArrayList r0 = X.0sr.A1M(r0)
            r3.A1s = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.A1t = r0
            goto L_0x01c8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15309UaG.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final boolean A00(C15309UaG uaG) {
        View findViewWithTag;
        NestedScrollView nestedScrollView;
        IgRadioGroup igRadioGroup = uaG.A01;
        if (igRadioGroup == null || (findViewWithTag = igRadioGroup.findViewWithTag(C16607Uy3.A05)) == null || (nestedScrollView = uaG.A04) == null) {
            return false;
        }
        int[] iArr = uaG.A07;
        findViewWithTag.getLocationInWindow(iArr);
        int[] iArr2 = uaG.A08;
        nestedScrollView.getLocationInWindow(iArr2);
        if (iArr2[1] + nestedScrollView.getHeight() >= iArr[1] + (findViewWithTag.getHeight() / 3)) {
            return true;
        }
        return false;
    }

    public final C14786U8w A01() {
        AnonymousClass0eM r0;
        if (this instanceof C16009Umq) {
            r0 = ((C16009Umq) this).A00;
        } else {
            r0 = ((C16008Ump) this).A00;
        }
        return (C14786U8w) r0.getValue();
    }

    public final C14767U8d A02() {
        AnonymousClass0eM r0;
        if (this instanceof C16009Umq) {
            r0 = ((C16009Umq) this).A01;
        } else {
            r0 = ((C16008Ump) this).A01;
        }
        return (C14767U8d) r0.getValue();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        C14767U8d A022 = A02();
        if (A022 instanceof C16061Uno) {
            return ((C16061Uno) A022).A00;
        }
        return ((C16062Unp) A022).A02;
    }

    public final boolean onBackPressed() {
        C14767U8d A022 = A02();
        C17778Vfp vfp = A022.A02;
        String A002 = A022.A00();
        0qQ.A0B(A002, 0);
        XB6.A01(vfp.A00, A002, "lead_gen_one_tap_setup", "cancel");
        C61060Jvy jvy = (C61060Jvy) A01().A00.A02();
        if (jvy != null && jvy.A03) {
            return true;
        }
        if (this instanceof C16009Umq) {
            C16009Umq umq = (C16009Umq) this;
            AnonymousClass0eM r2 = umq.A01;
            if (((C16061Uno) r2.getValue()).A01 == C16602Uxw.A06) {
                DbT.A1K(umq);
                return true;
            }
            C13990Tnq.A0y(umq.requireActivity(), ((C16061Uno) r2.getValue()).A00);
            return true;
        }
        DbT.A1I(this);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(400533822);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_one_tap_onboarding, viewGroup, false);
        AnonymousClass0fD.A09(-1580018227, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1126959184);
        super.onDestroyView();
        this.A01 = null;
        this.A00 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(1827762963, A022);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, androidx.fragment.app.Fragment, X.UaG] */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-32260684);
        C15309UaG.super.onStart();
        this.A05 = C20592WvV.A00(this, A01().A03, 23);
        AnonymousClass0fD.A09(1246211661, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(127534212);
        C15309UaG.super.onStop();
        this.A05 = JTQ.A0n(this.A05);
        AnonymousClass0fD.A09(-232926497, A022);
    }
}
