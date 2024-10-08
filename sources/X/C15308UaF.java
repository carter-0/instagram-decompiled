package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.form.IgFormField;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UaF  reason: case insensitive filesystem */
public abstract class C15308UaF extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenCustomQuestionBaseFragment";
    public View A00;
    public IgFormField A01;
    public IgFormField A02;
    public W0D A03;
    public C262204Co A04;
    public final List A05 = new ArrayList();

    public final void configureActionBar(2da r4) {
        boolean z;
        0qQ.A0B(r4, 0);
        C14772U8i A012 = A01();
        if (A012 instanceof C16049Unc) {
            z = ((C16049Unc) A012).A04;
        } else {
            z = ((C16050Und) A012).A05;
        }
        int i = 2131964800;
        if (z) {
            i = 2131964799;
        }
        C13992Tns.A0r(r4, i);
        W0D A002 = W0D.A00(this, r4);
        this.A03 = A002;
        A002.A02(new WBA((Object) this, 1));
        Boolean bool = (Boolean) A01().A01.A02();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            W0D w0d = this.A03;
            if (w0d != null) {
                w0d.A03(booleanValue);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x025a: MOVE  (r1v14 com.instagram.base.activity.BaseFragmentActivity) = (r1v13 com.instagram.base.activity.BaseFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            r10 = this;
            r2 = 0
            X.0qQ.A0B(r11, r2)
            super.onViewCreated(r11, r12)
            X.U8i r0 = r10.A01()
            X.2Fk r4 = r0.A03
            X.07Z r3 = r10.getViewLifecycleOwner()
            r1 = 10
            X.Wyx r0 = new X.Wyx
            r0.<init>(r10, r1)
            r8 = 7
            X.DbV.A1F(r3, r4, r0, r8)
            X.U8i r0 = r10.A01()
            X.2Fk r3 = r0.A01
            X.07Z r1 = r10.getViewLifecycleOwner()
            r0 = 11
            X.C20786Wyx.A00(r1, r3, r10, r0, r8)
            X.U8i r0 = r10.A01()
            java.util.List r0 = r0.A05
            java.util.Iterator r7 = r0.iterator()
            r6 = 0
        L_0x0036:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r5 = r7.next()
            int r4 = r6 + 1
            if (r6 < 0) goto L_0x01de
            X.2Fk r5 = (X.2Fk) r5
            X.07Z r3 = r10.getViewLifecycleOwner()
            r1 = 20
            X.Iwi r0 = new X.Iwi
            r0.<init>(r6, r1, r10)
            X.DbV.A1F(r3, r5, r0, r8)
            r6 = r4
            goto L_0x0036
        L_0x0056:
            X.U8i r0 = r10.A01()
            X.2Fk r1 = r0.A02
            X.07Z r0 = r10.getViewLifecycleOwner()
            r6 = 12
            X.C20786Wyx.A00(r0, r1, r10, r6, r8)
            r0 = 2131431205(0x7f0b0f25, float:1.8484133E38)
            com.instagram.igds.components.form.IgFormField r3 = X.DbT.A0d(r11, r0)
            r10.A01 = r3
            if (r3 == 0) goto L_0x0083
            X.U8i r1 = r10.A01()
            boolean r0 = r1 instanceof X.C16050Und
            if (r0 == 0) goto L_0x01db
            X.Und r1 = (X.C16050Und) r1
            boolean r0 = r1.A04
        L_0x007c:
            int r0 = X.DbW.A01(r0)
            r3.setVisibility(r0)
        L_0x0083:
            com.instagram.igds.components.form.IgFormField r1 = r10.A01
            if (r1 == 0) goto L_0x008f
            X.WBA r0 = new X.WBA
            r0.<init>((java.lang.Object) r10, (int) r2)
            r1.setInPickerMode(r0)
        L_0x008f:
            r0 = 2131431202(0x7f0b0f22, float:1.8484127E38)
            com.instagram.igds.components.form.IgFormField r3 = X.DbT.A0d(r11, r0)
            r10.A02 = r3
            if (r3 == 0) goto L_0x00f9
            r5 = 2131964804(0x7f133384, float:1.95664E38)
            r4 = 1
            X.U8i r1 = r10.A01()
            boolean r0 = r1 instanceof X.C16049Unc
            if (r0 == 0) goto L_0x01d5
            X.Unc r1 = (X.C16049Unc) r1
            int r0 = r1.A00
        L_0x00aa:
            int r0 = r0 + 1
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r0)
            java.lang.String r0 = r10.getString(r5, r0)
            r3.setLabelText(r0)
            r0 = 80
            r3.setMaxLength(r0)
            X.WXu r0 = new X.WXu
            r0.<init>(r10, r4)
            r3.setRuleChecker(r0)
            r0 = 49152(0xc000, float:6.8877E-41)
            r3.setInputType(r0)
            r1 = 9
            X.Wyx r0 = new X.Wyx
            r0.<init>(r10, r1)
            android.widget.EditText r0 = X.W7b.A00(r3, r0, r6)
            r0.requestFocus()
            X.U8i r0 = r10.A01()
            X.05G r0 = r0.A08
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.C51966G9m.A1X(r0)
            if (r0 == 0) goto L_0x00f9
            X.U8i r0 = r10.A01()
            X.05G r0 = r0.A08
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.setText(r0)
        L_0x00f9:
            r0 = 2131436615(0x7f0b2447, float:1.8495105E38)
            android.view.View r0 = r11.requireViewById(r0)
            r10.A00 = r0
            r0 = 2131436618(0x7f0b244a, float:1.8495111E38)
            android.widget.TextView r3 = X.DbU.A0G(r11, r0)
            X.U8i r1 = r10.A01()
            boolean r0 = r1 instanceof X.C16050Und
            if (r0 == 0) goto L_0x01d2
            X.Und r1 = (X.C16050Und) r1
            boolean r1 = r1.A04
        L_0x0115:
            r0 = 2131964808(0x7f133388, float:1.9566408E38)
            if (r1 == 0) goto L_0x011d
            r0 = 2131964809(0x7f133389, float:1.956641E38)
        L_0x011d:
            X.DbU.A1G(r3, r10, r0)
            r0 = 2131436617(0x7f0b2449, float:1.849511E38)
            android.widget.TextView r3 = X.DbU.A0G(r11, r0)
            X.U8i r1 = r10.A01()
            boolean r0 = r1 instanceof X.C16050Und
            if (r0 == 0) goto L_0x01cf
            X.Und r1 = (X.C16050Und) r1
            boolean r1 = r1.A04
        L_0x0133:
            r0 = 2131964805(0x7f133385, float:1.9566402E38)
            if (r1 == 0) goto L_0x013b
            r0 = 2131964806(0x7f133386, float:1.9566404E38)
        L_0x013b:
            X.DbU.A1G(r3, r10, r0)
            r0 = 2131435874(0x7f0b2162, float:1.8493602E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r0 = 2131435875(0x7f0b2163, float:1.8493605E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5 = 2
            r0 = 2131435876(0x7f0b2164, float:1.8493607E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131435877(0x7f0b2165, float:1.8493609E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 3
            java.lang.Integer[] r0 = new java.lang.Integer[]{r7, r3, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.Iterator r9 = r0.iterator()
            r7 = 0
        L_0x0169:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01e6
            java.lang.Object r0 = r9.next()
            int r8 = r7 + 1
            if (r7 < 0) goto L_0x01de
            int r0 = X.AnonymousClass7TE.A0M(r0)
            android.view.View r3 = X.AnonymousClass7TF.A0F(r11, r0)
            com.instagram.igds.components.form.IgFormField r3 = (com.instagram.igds.components.form.IgFormField) r3
            java.util.List r0 = r10.A05
            r0.add(r3)
            r1 = 2131964807(0x7f133387, float:1.9566406E38)
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r8)
            java.lang.String r0 = r10.getString(r1, r0)
            r3.setLabelText(r0)
            X.WXv r0 = new X.WXv
            r0.<init>(r10, r7, r2)
            r3.setRuleChecker(r0)
            X.U8i r0 = r10.A01()
            X.05G[] r0 = r0.A0A
            r0 = r0[r7]
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.setText(r0)
            r0 = 49152(0xc000, float:6.8877E-41)
            r3.setInputType(r0)
            r1 = 19
            X.Iwi r0 = new X.Iwi
            r0.<init>(r7, r1, r10)
            android.widget.EditText r3 = X.W7b.A00(r3, r0, r6)
            r1 = 6
            if (r7 >= r4) goto L_0x01c2
            r1 = 5
        L_0x01c2:
            X.WDE r0 = new X.WDE
            r0.<init>(r5, r10, r3)
            r3.setOnEditorActionListener(r0)
            r3.setImeOptions(r1)
            r7 = r8
            goto L_0x0169
        L_0x01cf:
            r1 = 0
            goto L_0x0133
        L_0x01d2:
            r1 = 0
            goto L_0x0115
        L_0x01d5:
            X.Und r1 = (X.C16050Und) r1
            int r0 = r1.A00
            goto L_0x00aa
        L_0x01db:
            r0 = 0
            goto L_0x007c
        L_0x01de:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01e6:
            r0 = 2131431201(0x7f0b0f21, float:1.8484125E38)
            android.view.View r3 = r11.requireViewById(r0)
            X.0qQ.A0A(r3)
            X.U8i r1 = r10.A01()
            boolean r0 = r1 instanceof X.C16049Unc
            if (r0 == 0) goto L_0x0262
            X.Unc r1 = (X.C16049Unc) r1
            boolean r0 = r1.A04
        L_0x01fc:
            int r0 = X.DbW.A01(r0)
            r3.setVisibility(r0)
            r0 = 68
            X.WB9.A00(r3, r0, r10)
            r3 = r10
            boolean r0 = r10 instanceof X.C16002Umj
            if (r0 == 0) goto L_0x0252
            X.Umj r3 = (X.C16002Umj) r3
            r0 = 2131431203(0x7f0b0f23, float:1.8484129E38)
            android.view.View r0 = r11.requireViewById(r0)
            r3.A00 = r0
            r0 = 2131431204(0x7f0b0f24, float:1.848413E38)
            android.view.View r0 = r11.requireViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r3.A01 = r0
            X.3E5 r1 = X.AnonymousClass3E4.A01(r3, r2, r2)
            r3.A02 = r1
            X.3ok r0 = r3.A03
            r1.A9Y(r0)
        L_0x022e:
            X.U8i r1 = r10.A01()
            X.05G r0 = r1.A09
            java.lang.Object r5 = r0.getValue()
            X.Uwe r4 = X.C16534Uwe.MULTIPLE_CHOICE
            X.VOI r0 = r1.A04
            java.lang.String r3 = r1.A00()
            X.0qQ.A0B(r3, r2)
            X.XB6 r2 = r0.A00
            java.lang.String r1 = "lead_gen_custom_question"
            if (r5 != r4) goto L_0x024f
            java.lang.String r0 = "custom_multiple_choice_question_screen_impression"
        L_0x024b:
            X.XB6.A02(r2, r3, r1, r0)
            return
        L_0x024f:
            java.lang.String r0 = "custom_short_answer_question_screen_impression"
            goto L_0x024b
        L_0x0252:
            androidx.fragment.app.FragmentActivity r1 = r10.requireActivity()
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x022e
            com.instagram.base.activity.BaseFragmentActivity r1 = (com.instagram.base.activity.BaseFragmentActivity) r1
            if (r1 == 0) goto L_0x022e
            r1.A0a()
            goto L_0x022e
        L_0x0262:
            X.Und r1 = (X.C16050Und) r1
            boolean r0 = r1.A05
            goto L_0x01fc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15308UaF.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(C61072JwA jwA, C17355VSi vSi, C15308UaF uaF) {
        int A0M = AnonymousClass7TE.A0M(jwA.A02);
        if (A0M == 1) {
            vSi.A01 = "confirmed";
        } else if (A0M == 2) {
            vSi.A01 = "error";
            vSi.A00 = uaF.getString(jwA.A01);
        } else if (A0M != 0) {
            throw new RuntimeException();
        }
    }

    public final C14772U8i A01() {
        AnonymousClass0eM r0;
        if (this instanceof C16002Umj) {
            r0 = ((C16002Umj) this).A04;
        } else {
            r0 = ((C16001Umi) this).A00;
        }
        return (C14772U8i) r0.getValue();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        C14772U8i A012 = A01();
        if (A012 instanceof C16049Unc) {
            return ((C16049Unc) A012).A01;
        }
        return ((C16050Und) A012).A02;
    }

    public final boolean onBackPressed() {
        C14772U8i A012 = A01();
        if (A012.A00) {
            VOI voi = A012.A04;
            String A002 = A012.A00();
            0qQ.A0B(A002, 0);
            XB6.A01(voi.A00, A002, "lead_gen_custom_question", "cancel");
        }
        A012.A00 = true;
        0nA.A0N(C13991Tnr.A06(this));
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1168684077);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_lead_gen_custom_question, viewGroup, false);
        AnonymousClass0fD.A09(-1787772570, A022);
        return inflate;
    }

    public void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1279013319);
        super.onDestroyView();
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
        this.A05.clear();
        AnonymousClass0fD.A09(1736587163, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-405417542);
        super.onResume();
        IgFormField igFormField = this.A02;
        if (igFormField != null) {
            igFormField.post(new C20034Wju(this));
        }
        AnonymousClass0fD.A09(-23182297, A022);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, androidx.fragment.app.Fragment, X.UaF] */
    public void onStart() {
        int A022 = AnonymousClass0fD.A02(-1700199599);
        C15308UaF.super.onStart();
        this.A04 = C20592WvV.A00(this, A01().A07, 15);
        AnonymousClass0fD.A09(-1338879988, A022);
    }

    public void onStop() {
        int A022 = AnonymousClass0fD.A02(-908425150);
        C15308UaF.super.onStop();
        this.A04 = JTQ.A0n(this.A04);
        AnonymousClass0fD.A09(1636808011, A022);
    }
}
