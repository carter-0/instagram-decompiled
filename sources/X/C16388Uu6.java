package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Uu6  reason: case insensitive filesystem */
public final class C16388Uu6 extends R8U implements AnonymousClass4DS, C227272iw {
    public static final String __redex_internal_original_name = "LeadAdsFormContainerFragment";
    public IgFrameLayout A00;
    public SpinnerImageView A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;
    public final String A04;

    public final void Cv7(Integer num, float f) {
    }

    public final void Cyf() {
    }

    public final void D4O(Integer num) {
    }

    public final void DHB(Integer num) {
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        AnonymousClass4DS A0P = getChildFragmentManager().A0P(R.id.lead_form_container);
        if (A0P instanceof AnonymousClass4DS) {
            r4.Etr(true);
            A0P.configureActionBar(r4);
            return;
        }
        r4.Etr(false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0047: MOVE  (r1v2 X.2ZP) = (r1v1 X.2ZP)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            super.onViewCreated(r5, r6)
            r0 = 2131435641(0x7f0b2079, float:1.849313E38)
            android.view.View r0 = r5.findViewById(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = (com.instagram.ui.widget.spinner.SpinnerImageView) r0
            r4.A01 = r0
            r0 = 2131435285(0x7f0b1f15, float:1.8492408E38)
            android.view.View r0 = r5.findViewById(r0)
            com.instagram.common.ui.base.IgFrameLayout r0 = (com.instagram.common.ui.base.IgFrameLayout) r0
            r4.A00 = r0
            com.instagram.ui.widget.spinner.SpinnerImageView r2 = r4.A01
            if (r2 == 0) goto L_0x002b
            r1 = 39
            X.LY6 r0 = new X.LY6
            r0.<init>(r4, r1)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x002b:
            X.07U r3 = X.07U.A05
            X.07Z r2 = r4.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r2)
            r5 = 0
            r6 = 7
            X.MGh r1 = new X.MGh
            r1.<init>(r2, r3, r4, r5, r6)
            X.AnonymousClass7TE.A1Z(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            boolean r0 = r1 instanceof X.AnonymousClass2ZP
            if (r0 == 0) goto L_0x0050
            X.2ZP r1 = (X.AnonymousClass2ZP) r1
            if (r1 == 0) goto L_0x0050
            r0 = 8
            r1.Enj(r0)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16388Uu6.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public C16388Uu6() {
        C20696WxS wxS = new C20696WxS(this, 4);
        AnonymousClass0eM A002 = C20696WxS.A00(new C20696WxS(this, 1), 0eO.A02, 2);
        this.A03 = new C227862kA(new C20696WxS(A002, 3), wxS, new C73666Phf(38, (Object) null, A002), new 0Yh(LeadAdsPostClickEntryViewModel.class));
        this.A04 = "lead_ad_question_page";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000f: MOVE  (r2v1 X.2iw) = (r2v0 X.2iw)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final boolean COC() {
        /*
            r3 = this;
            X.0hq r1 = r3.getChildFragmentManager()
            r0 = 2131435285(0x7f0b1f15, float:1.8492408E38)
            androidx.fragment.app.Fragment r2 = r1.A0P(r0)
            boolean r0 = r2 instanceof X.C227272iw
            if (r0 == 0) goto L_0x001b
            X.2iw r2 = (X.C227272iw) r2
            r1 = 1
            if (r2 == 0) goto L_0x001b
            boolean r0 = r2.COC()
            if (r0 != r1) goto L_0x001b
            return r1
        L_0x001b:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16388Uu6.COC():boolean");
    }

    public final boolean onBackPressed() {
        AnonymousClass4DR A0P = getChildFragmentManager().A0P(R.id.lead_form_container);
        if (A0P instanceof AnonymousClass4DR) {
            return A0P.onBackPressed();
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(305345856);
        C16388Uu6.super.onCreate(bundle);
        Dbb.A1N(this);
        AnonymousClass0fD.A09(938760503, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(777898105);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_consumer_initialization_view, viewGroup, false);
        AnonymousClass0fD.A09(-433985182, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-588075035);
        super.onDestroyView();
        this.A01 = null;
        this.A00 = null;
        AnonymousClass0fD.A09(175260693, A022);
    }
}
