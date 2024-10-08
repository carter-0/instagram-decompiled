package X;

import android.content.Context;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.MediaSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class LPT {
    public static final void A00(Context context, UserSession userSession, JWG jwg, C3499682q r13, C267834cI r14, 1ua r15, String str, C62320sa r17, C62320sa r18, boolean z, boolean z2, boolean z3) {
        MediaUploadMetadata mediaUploadMetadata;
        String str2;
        DbW.A1N(userSession, 1, r15);
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator A0w = JTP.A0w(r13);
        while (A0w.hasNext()) {
            MediaSession A0Z = JTO.A0Z(A0w);
            AnonymousClass3Q2 A0N = JTQ.A0N(A0Z, r14);
            if (A0N != null) {
                A0N.A3Z = A0Z.B5g();
                if (A0Z.Bsu() == AnonymousClass05K.A01) {
                    A0N.A02 = r13.AAx();
                }
                A1C.add(A0N);
                String str3 = A0N.A30;
                if (str3 == null) {
                    str3 = "";
                }
                A1C2.add(str3);
            } else {
                0kD.A07(str, "albumMediaItem is null.", (Throwable) null);
                JW1.A00(userSession).A08("onAlbumRenderFinished(): albumMediaItem is null.");
            }
        }
        AnonymousClass3Q2 A03 = 28K.A00(userSession).A03(((JWE) r13).A01.A0C);
        boolean z4 = z3;
        if (A03 != null) {
            MediaUploadMetadata mediaUploadMetadata2 = A03.A13;
            ArrayList A0p = AnonymousClass7TF.A0p(A1C);
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                A0p.add(JTO.A0m(it).A13);
            }
            mediaUploadMetadata2.A00(AnonymousClass3QN.A00(A0p));
            MediaUploadMetadata mediaUploadMetadata3 = A03.A13;
            ArrayList A0p2 = AnonymousClass7TF.A0p(A1C);
            Iterator it2 = A1C.iterator();
            while (it2.hasNext()) {
                AnonymousClass3Q2 A0m = JTO.A0m(it2);
                String str4 = A0m.A13.A03;
                if (str4 == null || 00l.A0W(str4)) {
                    mediaUploadMetadata = (MediaUploadMetadata) C63518KyT.A00.get(A0m.A3L);
                    if (mediaUploadMetadata == null) {
                        str2 = null;
                        A0p2.add(str2);
                    }
                } else {
                    mediaUploadMetadata = A0m.A13;
                }
                str2 = mediaUploadMetadata.A03;
                A0p2.add(str2);
            }
            mediaUploadMetadata3.A03 = MediaUploadMetadata.A0C.A01(A0p2);
            A03.A0Q(System.currentTimeMillis());
            1ua.A03(A03, r15);
            A03.A5U = true;
            A03.A5S = true;
            Iterator it3 = A1C.iterator();
            boolean z5 = false;
            while (it3.hasNext()) {
                AnonymousClass3Q2 A0m2 = JTO.A0m(it3);
                A0m2.A3O = A03.A35;
                A0m2.A5U = true;
                A0m2.A5S = true;
                A0m2.A5R = true;
                if (!z5 && A0m2.A0y()) {
                    z5 = true;
                }
            }
            A03.A0k(A1C);
            r15.A05.A04();
            27p.A01(r15.A01).A1z(A03.A2e, false);
            if (z3 || 182.A06(0Tu.A05, userSession, 36321550580131335L)) {
                C59689JTv.A07(context, 2131961036);
            }
            if (z || z2) {
                r13.EK5(r14);
                List list = JWX.A00(userSession).A03;
                list.clear();
                list.addAll(A1C2);
            }
            A02(userSession, z4, false);
            r17.invoke();
            if (z2) {
                r17.invoke();
                return;
            }
            return;
        }
        JW1.A00(userSession).A08("onAlbumRenderFinished(): album does not exist.");
        C50017FJc fJc = new C50017FJc(0, (Object) r18, (Object) userSession, z4);
        if (jwg != null) {
            jwg.A0A(fJc, AnonymousClass05K.A0F);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        r1 = X.JWX.A00(r3).A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.instagram.common.session.UserSession r3, boolean r4, boolean r5) {
        /*
            r0 = 0
            X.0qQ.A0B(r3, r0)
            if (r4 != 0) goto L_0x002b
            if (r5 != 0) goto L_0x0015
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321550580065798(0x810a4200042606, double:3.0332330697539864E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x002b
        L_0x0015:
            X.JX9 r0 = X.JWX.A00(r3)
            java.util.List r1 = r0.A03
            java.lang.Object r0 = X.00k.A0L(r1)
            if (r0 == 0) goto L_0x002b
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            r1.clear()
            r1.addAll(r0)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LPT.A02(com.instagram.common.session.UserSession, boolean, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.instagram.modal.ModalActivity, android.app.Activity] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x002d: MOVE  (r1v2 X.2ZS) = (r1v1 X.2ZS)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final void A01(androidx.fragment.app.FragmentActivity r19, com.instagram.common.session.UserSession r20) {
        /*
            r2 = r19
            r3 = 1
            r1 = r20
            X.0qQ.A0B(r1, r3)
            if (r19 == 0) goto L_0x0019
            boolean r0 = r2 instanceof com.instagram.modal.ModalActivity
            if (r0 == 0) goto L_0x0019
            com.instagram.modal.ModalActivity r2 = (com.instagram.modal.ModalActivity) r2
            r0 = 9685(0x25d5, float:1.3572E-41)
            r2.setResult(r0)
            r2.finish()
        L_0x0018:
            return
        L_0x0019:
            X.2cc r0 = X.C71342cb.A00(r1)
            java.lang.String r0 = r0.A05
            if (r0 == 0) goto L_0x0018
            X.1QK r2 = X.1QK.valueOf(r0)
            X.2ZQ r1 = X.C71172bH.A00()
            boolean r0 = r1 instanceof X.2ZS
            if (r0 == 0) goto L_0x0018
            X.2ZS r1 = (X.2ZS) r1
            if (r1 == 0) goto L_0x0018
            X.C240073Jm.A00 = r3
            r1.Enh(r2)
            r5 = 0
            r0 = 945(0x3b1, float:1.324E-42)
            java.lang.String r8 = X.C273654mx.A00(r0)
            r19 = 0
            r18 = 0
            com.instagram.ui.swipenavigation.PositionConfig r4 = new com.instagram.ui.swipenavigation.PositionConfig
            r6 = r5
            r7 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r14 = r5
            r15 = r5
            r16 = r5
            r17 = r5
            r20 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1.FLD(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LPT.A01(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession):void");
    }
}
