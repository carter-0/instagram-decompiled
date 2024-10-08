package X;

import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import java.util.List;

public final class ERD extends LGS {
    public final String A00;
    public final AnonymousClass819 A01 = AnonymousClass819.BOTTOMSHEET_XAR_CCP_MIGRATION_REELS_V3;
    public final List A02;

    public final AnonymousClass9I7 A02(AnonymousClass818 r2, UserSession userSession, CXPNoticeStateRepository cXPNoticeStateRepository) {
        0qQ.A0B(cXPNoticeStateRepository, 2);
        2DQ A002 = 2DQ.A00("BOTTOMSHEET_XAR_CCP_MIGRATION_REELS_V3");
        0qQ.A07(A002);
        return cXPNoticeStateRepository.A00(A002);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000b: MOVE  (r4v1 X.4DH) = (r4v0 X.4DH)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final boolean A05(X.LBK r7) {
        /*
            r6 = this;
            r1 = 0
            X.FBQ r5 = r7.A09
            if (r5 == 0) goto L_0x0020
            androidx.fragment.app.Fragment r4 = r7.A02
            boolean r0 = r4 instanceof X.AnonymousClass4DH
            if (r0 == 0) goto L_0x0020
            X.4DH r4 = (X.AnonymousClass4DH) r4
            if (r4 == 0) goto L_0x0020
            com.instagram.common.session.UserSession r3 = r7.A05
            java.lang.String r2 = r6.A00
            X.818 r1 = r5.A01
            int r0 = r5.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C49912FEk.A00(r1, r4, r3, r0, r2)
            r0 = 1
            return r0
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ERD.A05(X.LBK):boolean");
    }

    public final AnonymousClass819 A01() {
        return this.A01;
    }

    public final String A03() {
        return "BOTTOMSHEET_XAR_CCP_MIGRATION_REELS_V3";
    }

    public final List A04() {
        return this.A02;
    }

    public ERD(List list, String str) {
        this.A02 = list;
        this.A00 = str;
    }
}
