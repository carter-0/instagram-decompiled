package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class NIW extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "FriendMapAudienceListFragment";
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(new C58179Inj(this, 49));
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;

    public final String getModuleName() {
        return "FriendMapCustomAudienceFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHE(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 30), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public NIW() {
        C73905Plg A002 = C73905Plg.A00(this, 3);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C73905Plg.A00(C73905Plg.A00(this, 0), 1));
        this.A02 = DbS.A0I(C73905Plg.A00(A003, 2), A002, new C58185Inp(13, (Object) null, A003), DbS.A0z(HBO.class));
        this.A01 = C227642jf.A02(this);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0009: MOVE  (r1v1 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r1v0 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void beforeOnDestroyView() {
        /*
            r2 = this;
            super.beforeOnDestroyView()
            androidx.fragment.app.Fragment r1 = r2.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x0015
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x0015
            X.7Pu r1 = r1.A02
            if (r1 == 0) goto L_0x0015
            r0 = 1
            r1.A0O(r0)
        L_0x0015:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NIW.beforeOnDestroyView():void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1694292652);
        ComposeView A0H = DbV.A0H(this, new C59341JFt(this, 19), -1565918644);
        AnonymousClass0fD.A09(1042241672, A022);
        return A0H;
    }
}
