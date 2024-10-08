package com.instagram.debug.devoptions.section.newusernux;

import X.00k;
import X.0qQ;
import X.0sl;
import X.0xY;
import X.1Al;
import X.1An;
import X.2da;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C227642jf;
import X.C47938ENp;
import X.C48155EZx;
import X.DbW;
import X.DbX;
import X.EXD;
import X.Ez9;
import X.F39;
import X.FET;
import X.FRM;
import X.G6A;
import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public final class NuxSelectionFragment extends AnonymousClass4DH implements AnonymousClass4DS {
    public F39 currentState;
    public final FRM delegate = new Object();
    public FET factory;
    public C47938ENp logic;
    public final LinkedHashMap onboardingStepMap = AnonymousClass7TE.A1H();
    public final String preferenceKey = "selected_steps";
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);
    public final AnonymousClass0eM userSession$delegate = C227642jf.A02(this);

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, "Custom NUX Flow");
    }

    public String getModuleName() {
        return "nux_selection_fragment";
    }

    private final Set getSelectedSteps() {
        List A0x;
        String string = 1Al.A01(AnonymousClass7TE.A0l(this.userSession$delegate)).A04(1An.A10, getClass()).getString(this.preferenceKey, "");
        if (string == null || (A0x = DbX.A0x(string)) == null) {
            return 0sl.A00;
        }
        return 00k.A0k(A0x);
    }

    private final UserSession getUserSession() {
        return AnonymousClass7TE.A0l(this.userSession$delegate);
    }

    /* access modifiers changed from: private */
    public final void resetAllCheckBoxes(boolean z) {
        for (Object obj : this.onboardingStepMap.keySet()) {
            CompoundButton compoundButton = (CompoundButton) this.onboardingStepMap.get(obj);
            if (compoundButton != null) {
                compoundButton.setChecked(z);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void saveSelectedSteps(List list) {
        0xY AR4 = 1Al.A01(AnonymousClass7TE.A0l(this.userSession$delegate)).A04(1An.A10, getClass()).AR4();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1A.append(String.valueOf(((Ez9) it.next()).A00));
            A1A.append(",");
        }
        AR4.E5g(this.preferenceKey, A1A.toString());
        AR4.apply();
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.Ez9, java.lang.Object] */
    /* access modifiers changed from: private */
    public final List getSerializableSteps() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = this.onboardingStepMap.keySet().iterator();
        while (it.hasNext()) {
            C48155EZx eZx = (C48155EZx) AnonymousClass7TF.A0a(it);
            CompoundButton compoundButton = (CompoundButton) this.onboardingStepMap.get(eZx);
            if (compoundButton != null && compoundButton.isChecked()) {
                ? obj = new Object();
                obj.A00 = eZx;
                obj.A02 = null;
                obj.A03 = null;
                obj.A01 = null;
                A1C.add(obj);
            }
        }
        return A1C;
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1411279639);
        NuxSelectionFragment.super.onCreate(bundle);
        Context context = getContext();
        if (context != null) {
            FRM frm = this.delegate;
            frm.A01 = EXD.A03;
            frm.A02 = AnonymousClass05K.A00;
            frm.A00 = AnonymousClass7TE.A0l(this.session$delegate);
            this.factory = new FET(this.delegate);
            C47938ENp A01 = C47938ENp.A03.A01(context, AnonymousClass7TE.A0l(this.session$delegate), this.delegate, (G6A) null);
            this.logic = A01;
            this.currentState = A01.A01;
        }
        AnonymousClass0fD.A09(500663551, A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008f, code lost:
        if (X.FET.A00(r1, r14, (java.lang.String) null).A00() != true) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r19, android.view.ViewGroup r20, android.os.Bundle r21) {
        /*
            r18 = this;
            r0 = -1766146150(0xffffffff96babf9a, float:-3.0170838E-25)
            int r17 = X.AnonymousClass0fD.A02(r0)
            r12 = 0
            r2 = r19
            X.0qQ.A0B(r2, r12)
            r0 = 2131628065(0x7f0e1021, float:1.8883412E38)
            r1 = r20
            android.view.View r2 = r2.inflate(r0, r1, r12)
            r0 = 2131437267(0x7f0b26d3, float:1.8496428E38)
            android.view.ViewGroup r11 = X.DbX.A0I(r2, r0)
            r3 = r18
            android.content.Context r0 = r3.getContext()
            r10 = -1
            r9 = -2
            if (r0 == 0) goto L_0x0049
            com.instagram.common.ui.base.IgTextView r5 = new com.instagram.common.ui.base.IgTextView
            r5.<init>(r0)
            r0 = 2131957834(0x7f13184a, float:1.9552263E38)
            X.DbU.A1G(r5, r3, r0)
            r0 = 17
            r5.setGravity(r0)
            android.view.ViewGroup$MarginLayoutParams r4 = new android.view.ViewGroup$MarginLayoutParams
            r4.<init>(r9, r10)
            r1 = 10
            r0 = 15
            r4.setMargins(r12, r1, r12, r0)
            r5.setLayoutParams(r4)
            r11.addView(r5)
        L_0x0049:
            X.EZx[] r8 = X.C48155EZx.values()
            java.util.Set r16 = r3.getSelectedSteps()
            int r7 = r8.length
            r6 = 0
        L_0x0053:
            if (r6 >= r7) goto L_0x00bc
            r14 = r8[r6]
            X.EZx r0 = X.C48155EZx.UNKNOWN
            if (r14 == r0) goto L_0x00b9
            android.content.Context r0 = r3.getContext()
            android.widget.CheckBox r5 = new android.widget.CheckBox
            r5.<init>(r0)
            java.lang.String r13 = r14.toString()
            r5.setText(r13)
            java.util.LinkedHashMap r0 = r3.onboardingStepMap
            r0.put(r14, r5)
            r11.addView(r5)
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x00a8
            com.instagram.common.ui.base.IgTextView r15 = new com.instagram.common.ui.base.IgTextView
            r15.<init>(r0)
            X.FET r1 = r3.factory
            r4 = 1
            if (r1 == 0) goto L_0x0091
            r0 = 0
            X.F3l r0 = X.FET.A00(r1, r14, r0)
            boolean r1 = r0.A00()
            r0 = 2131957833(0x7f131849, float:1.9552261E38)
            if (r1 == r4) goto L_0x0094
        L_0x0091:
            r0 = 2131957835(0x7f13184b, float:1.9552265E38)
        L_0x0094:
            X.DbU.A1G(r15, r3, r0)
            android.view.ViewGroup$MarginLayoutParams r4 = new android.view.ViewGroup$MarginLayoutParams
            r4.<init>(r9, r10)
            r1 = 100
            r0 = 5
            r4.setMargins(r1, r12, r12, r0)
            r15.setLayoutParams(r4)
            r11.addView(r15)
        L_0x00a8:
            com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$3 r0 = new com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$3
            r0.<init>(r14)
            r5.setOnCheckedChangeListener(r0)
            r0 = r16
            boolean r0 = r0.contains(r13)
            r5.setChecked(r0)
        L_0x00b9:
            int r6 = r6 + 1
            goto L_0x0053
        L_0x00bc:
            r0 = 2131429943(0x7f0b0a37, float:1.8481573E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r2, r0)
            com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$4 r0 = new com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$4
            r0.<init>(r3)
            X.AnonymousClass0fU.A00(r0, r1)
            r0 = 2131440996(0x7f0b3564, float:1.8503991E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r2, r0)
            com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$5 r0 = new com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$5
            r0.<init>(r3)
            X.AnonymousClass0fU.A00(r0, r1)
            r0 = 2131435163(0x7f0b1e9b, float:1.849216E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r2, r0)
            com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$6 r0 = new com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$6
            r0.<init>(r3)
            X.AnonymousClass0fU.A00(r0, r1)
            r1 = -1202952627(0xffffffffb84c664d, float:-4.8732665E-5)
            r0 = r17
            X.AnonymousClass0fD.A09(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroy() {
        C47938ENp eNp;
        int A02 = AnonymousClass0fD.A02(253182256);
        super.onDestroy();
        saveSelectedSteps(getSerializableSteps());
        F39 f39 = this.currentState;
        if (!(f39 == null || (eNp = this.logic) == null)) {
            eNp.A02(f39, true);
        }
        FET.A02.clear();
        AnonymousClass0fD.A09(-1956248122, A02);
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}
