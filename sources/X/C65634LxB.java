package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.archive.intf.ArchivePendingUpload;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;

/* renamed from: X.LxB  reason: case insensitive filesystem */
public final class C65634LxB implements C311316cU {
    public final FragmentActivity A00;
    public final ArchivePendingUpload A01;
    public final UserSession A02;
    public final IngestSessionShim A03;
    public final IngestSessionShim A04;
    public final C61438K7n A05;
    public final C363008it A06;
    public final C62320sa A07;
    public final boolean A08;
    public final C2355930l A09;
    public final AnonymousClass3Q2 A0A;
    public final C351998Bg A0B;

    public C65634LxB(FragmentActivity fragmentActivity, ArchivePendingUpload archivePendingUpload, C2355930l r4, UserSession userSession, IngestSessionShim ingestSessionShim, IngestSessionShim ingestSessionShim2, C61438K7n k7n, AnonymousClass3Q2 r9, C351998Bg r10, C363008it r11, C62320sa r12, boolean z) {
        DbW.A1N(userSession, 1, archivePendingUpload);
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = ingestSessionShim;
        this.A04 = ingestSessionShim2;
        this.A01 = archivePendingUpload;
        this.A05 = k7n;
        this.A06 = r11;
        this.A0B = r10;
        this.A09 = r4;
        this.A08 = z;
        this.A0A = r9;
        this.A07 = r12;
    }

    public static final void A00(C368278sM r6, C65634LxB lxB) {
        String str;
        UserSession userSession = lxB.A02;
        AnonymousClass819 A002 = A1F.A00(C363018iu.A00(userSession), lxB.A06.A06());
        AnonymousClass818 r3 = AnonymousClass818.IG_STORY_SHARE_SHEET_SHARING_OPTIONS;
        AnonymousClass81A A0O = JTO.A0O();
        AnonymousClass3Q2 r0 = lxB.A0A;
        if (r0 != null) {
            str = r0.A0I();
        } else {
            str = null;
        }
        A0O.A06("waterfall_id", str);
        C368288sN.A00(r3, r6, A002, A0O, userSession);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0009: MOVE  (r5v1 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r5v0 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void A01() {
        /*
            r6 = this;
            X.K7n r2 = r6.A05
            androidx.fragment.app.Fragment r5 = r2.mParentFragment
            boolean r0 = r5 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            r1 = 0
            if (r0 == 0) goto L_0x002b
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r5 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r5
            if (r5 == 0) goto L_0x002b
            com.instagram.common.session.UserSession r4 = r6.A02
            boolean r0 = r2 instanceof X.C51906G7a
            if (r0 == 0) goto L_0x0014
            r1 = r2
        L_0x0014:
            r3 = 0
            r0 = 0
            X.E7Y r2 = X.C48941Emf.A00(r4, r1, r0, r0, r3)
            X.7Pu r1 = r5.A02
            if (r1 == 0) goto L_0x002b
            X.7Pr r0 = X.DbS.A0W(r4)
            r0.A1O = r3
            r0.A0U = r2
            r0.A0T = r2
            r1.A0F(r2, r0)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65634LxB.A01():void");
    }

    public final void A02(boolean z) {
        C2355930l r4 = this.A09;
        C61438K7n k7n = this.A05;
        C62574Ki7 ki7 = C62574Ki7.STORY_SHARE_SHEET;
        if (z) {
            this.A0B.A00();
        }
        r4.A00(k7n, ki7, 2002, false);
    }

    public final void Cx5(AnonymousClass818 r4, C255773uh r5) {
        A00(C368278sM.ACCEPT, this);
        this.A06.A05(true, "ig_story_composer");
    }

    public final void D7w(AnonymousClass818 r2, C255773uh r3) {
        A00(C368278sM.DECLINE, this);
    }

    public final void Dku(AnonymousClass818 r3, C255773uh r4) {
        A00(C368278sM.OTHER, this);
        this.A06.A04(true);
    }

    public final void DnK() {
        A00(C368278sM.OTHER, this);
        this.A06.A05(false, "ig_story_composer");
    }

    public final void DnS() {
        A00(C368278sM.ACCEPT, this);
        this.A06.A04(false);
    }
}
