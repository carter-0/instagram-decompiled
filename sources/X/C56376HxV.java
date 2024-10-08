package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;

/* renamed from: X.HxV  reason: case insensitive filesystem */
public abstract class C56376HxV {
    public static final void A00(Activity activity, View view, UserSession userSession, C317556nS r18, String str, String str2, int i, boolean z) {
        r18.EcX(true);
        UserSession userSession2 = userSession;
        String str3 = str;
        C313746gw.A00(userSession2).A0V(str3, str2, C273654mx.A00(3248), (String) null, (String) null, i, z, false, false, false, false);
        1OC A06 = DirectThreadApi.A06(userSession2, str3, (String) null);
        A06.A00 = new H4T(activity, view, userSession, r18, str, str2, i);
        1ES.A03(A06);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x001d: MOVE  (r1v1 com.instagram.api.schemas.StoryJoinChatStatus) = (r18v0 com.instagram.api.schemas.StoryJoinChatStatus)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final void A01(android.view.View r16, androidx.fragment.app.FragmentActivity r17, com.instagram.api.schemas.StoryJoinChatStatus r18, com.instagram.common.session.UserSession r19, X.1Xj r20, X.AnonymousClass4DU r21, X.C317556nS r22, X.VQD r23, java.lang.String r24, java.lang.String r25, int r26) {
        /*
            r15 = 0
            r3 = 1
            r7 = r19
            r12 = r24
            X.AnonymousClass7TF.A1C(r7, r3, r12)
            X.IOe r0 = X.C54951HZh.A00(r7)
            java.util.HashSet r0 = r0.A00
            boolean r0 = r0.contains(r12)
            r5 = r17
            r2 = r23
            r14 = r26
            if (r0 != 0) goto L_0x0093
            com.instagram.api.schemas.StoryJoinChatStatus r0 = com.instagram.api.schemas.StoryJoinChatStatus.ACCEPTED
            r1 = r18
            if (r1 == r0) goto L_0x0093
            com.instagram.api.schemas.StoryJoinChatStatus r0 = com.instagram.api.schemas.StoryJoinChatStatus.CHAT_ENDED
            if (r1 == r0) goto L_0x0093
            X.0Tu r4 = X.0Tu.A05
            r0 = 2342158877552610932(0x20810517000d0e74, double:4.062082582117955E-152)
            boolean r0 = X.182.A06(r4, r7, r0)
            r19 = r22
            r4 = r25
            if (r0 == 0) goto L_0x0087
            X.0xa r1 = X.AnonymousClass7TE.A0q(r7)
            r0 = 264(0x108, float:3.7E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r15)
            if (r0 != 0) goto L_0x0087
            X.7Pr r1 = X.DbX.A0e(r7, r3)
            r0 = 1063675494(0x3f666666, float:0.9)
            r1.A03 = r0
            r1.A1O = r3
            X.IZp r15 = new X.IZp
            r18 = r7
            r20 = r2
            r21 = r12
            r22 = r4
            r23 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r1.A0U = r15
            X.7Pu r3 = r1.A00()
            X.E3d r2 = new X.E3d
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            X.C227642jf.A04(r1, r7)
            java.lang.String r0 = "thread_id"
            r1.putString(r0, r12)
            r0 = 5334(0x14d6, float:7.475E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putString(r0, r4)
            r2.setArguments(r1)
            r3.A02(r5, r2)
            return
        L_0x0087:
            r6 = r16
            r8 = r19
            r9 = r12
            r10 = r4
            r11 = r14
            r12 = r15
            A00(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0093:
            java.lang.Class<X.Ne1> r3 = X.C69064Ne1.class
            r1 = 37
            X.Pla r0 = new X.Pla
            r0.<init>(r7, r1)
            java.lang.Object r8 = r7.A01(r3, r0)
            X.Ne1 r8 = (X.C69064Ne1) r8
            java.lang.String r9 = r20.A2n()
            if (r9 == 0) goto L_0x00bb
            java.lang.String r10 = X.C51973G9u.A0k(r20)
            com.instagram.reels.chat.model.ChatStickerChannelType r0 = com.instagram.reels.chat.model.ChatStickerChannelType.BROADCAST
            java.lang.String r11 = r0.A00
            X.Wvo r13 = new X.Wvo
            r13.<init>(r2, r1)
            r6 = r21
            X.C48835Ekx.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x00bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56376HxV.A01(android.view.View, androidx.fragment.app.FragmentActivity, com.instagram.api.schemas.StoryJoinChatStatus, com.instagram.common.session.UserSession, X.1Xj, X.4DU, X.6nS, X.VQD, java.lang.String, java.lang.String, int):void");
    }
}
