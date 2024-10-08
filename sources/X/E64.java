package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

public final class E64 extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "HallPassParticipantsListFragment";
    public RecyclerView A00;
    public AnonymousClass2t9 A01;
    public C2366734q A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09;
    public final C230222pE A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(1397);
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0072: MOVE  (r1v10 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r1v4 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r7, r0)
            super.onViewCreated(r7, r8)
            android.view.View r1 = r6.requireView()
            r0 = 2131433754(0x7f0b191a, float:1.8489303E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.DbT.A0I(r1, r0)
            r6.A00 = r0
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            X.2tC r3 = X.AnonymousClass2t9.A00(r0)
            X.0eM r0 = r6.A0G
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r1 = r6.requireContext()
            X.EHI r0 = new X.EHI
            r0.<init>(r1, r6, r2, r6)
            X.2t9 r0 = X.DbU.A0U(r3, r0)
            r6.A01 = r0
            androidx.recyclerview.widget.RecyclerView r3 = r6.A00
            if (r3 == 0) goto L_0x0045
            r3.setAdapter(r0)
            android.content.Context r2 = r6.requireContext()
            r1 = 3
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            r0.<init>(r2, r1)
            r3.setLayoutManager(r0)
        L_0x0045:
            android.view.View r1 = r6.requireView()
            r0 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.widget.TextView r3 = X.AnonymousClass7TG.A0R(r1, r0)
            android.view.View r1 = r6.requireView()
            r0 = 2131436533(0x7f0b23f5, float:1.849494E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r1, r0)
            java.lang.String r0 = r6.A05
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "hallPassName"
        L_0x0061:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0069:
            r3.setText(r0)
            androidx.fragment.app.Fragment r1 = r6.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x007f
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x007f
            X.7Pu r1 = r1.A02
            if (r1 == 0) goto L_0x007f
            r0 = 27
            X.FPF.A00(r2, r0, r1, r6)
        L_0x007f:
            android.view.View r1 = r6.requireView()
            r0 = 2131431078(0x7f0b0ea6, float:1.8483875E38)
            android.view.View r1 = X.AnonymousClass7TF.A0F(r1, r0)
            X.61u r1 = (X.C3021461u) r1
            r0 = 41
            X.FP1 r0 = X.FP1.A00(r6, r0)
            r1.setPrimaryActionOnClickListener(r0)
            r0 = 42
            X.FP1 r0 = X.FP1.A00(r6, r0)
            r1.setSecondaryActionOnClickListener(r0)
            X.0eM r4 = r6.A0B
            java.lang.Object r0 = r4.getValue()
            X.DkR r0 = (X.C46738DkR) r0
            X.2Fk r3 = r0.A00
            X.07Z r2 = r6.getViewLifecycleOwner()
            r0 = 5
            X.MPA r1 = new X.MPA
            r1.<init>(r6, r0)
            r0 = 61
            X.Dba.A15(r2, r3, r1, r0)
            X.2YL r5 = X.DbS.A0H(r4)
            java.lang.String r4 = r6.A04
            if (r4 != 0) goto L_0x00c2
            java.lang.String r0 = "hallPassId"
            goto L_0x0061
        L_0x00c2:
            X.6oS r3 = X.C318116oQ.A00(r5)
            r2 = 0
            r1 = 49
            X.MFW r0 = new X.MFW
            r0.<init>(r5, r4, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E64.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0G);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            return C2808154f.A05(recyclerView);
        }
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public E64() {
        MMJ mmj = new MMJ(this, 10);
        MMJ mmj2 = new MMJ(this, 13);
        0eO r2 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r2, new MMJ(mmj2, 14));
        this.A0B = DbS.A0I(new MMJ(A002, 15), mmj, new C58185Inp(38, (Object) null, A002), DbS.A0z(C46738DkR.class));
        this.A0E = AnonymousClass0eN.A00(r2, new MMJ(this, 12));
        this.A0C = AnonymousClass0eN.A00(r2, new MMJ(this, 11));
        this.A0A = new C50896Fkb(this, 5);
        this.A0F = AnonymousClass0eN.A00(r2, new MMJ(this, 16));
        this.A0D = AnonymousClass0eN.A00(r2, C51784G1t.A00);
        this.A09 = 0sn.A00;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1337839103);
        E64.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = C320236s2.A01(requireArguments, "hall_pass_id");
        this.A05 = C320236s2.A01(requireArguments, "hall_pass_name");
        this.A06 = requireArguments.getString("media_id");
        this.A07 = requireArguments.getString("media_owner_id");
        this.A08 = requireArguments.getString("view_session_id");
        requireArguments.getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        this.A02 = new C2366734q(this, AnonymousClass7TE.A0l(this.A0G));
        AnonymousClass0fD.A09(613800573, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(310636885);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_hall_pass_participants, false);
        AnonymousClass0fD.A09(-1122093480, A022);
        return A0D2;
    }
}
