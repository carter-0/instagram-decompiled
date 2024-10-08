package X;

import android.content.Context;
import android.view.View;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.EDz  reason: case insensitive filesystem */
public final class C47716EDz extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new C67681MsJ(context);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0019: MOVE  (r10v1 com.instagram.common.session.UserSession) = (r10v0 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final /* bridge */ /* synthetic */ java.lang.Object A0K(android.view.View r20, X.C307786Rm r21, X.C276544tV r22, java.lang.Object r23) {
        /*
            r19 = this;
            r6 = r20
            X.MsJ r6 = (X.C67681MsJ) r6
            r7 = 0
            X.0qQ.A0B(r6, r7)
            r3 = 1
            r5 = r21
            r4 = r22
            X.AnonymousClass7TF.A1B(r5, r3, r4)
            X.0lg r10 = X.C308206Td.A0A(r5)
            boolean r0 = r10 instanceof com.instagram.common.session.UserSession
            r11 = 0
            if (r0 == 0) goto L_0x007c
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            if (r10 == 0) goto L_0x007c
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            java.lang.String r8 = r4.A0J()
            java.lang.String r1 = "Required value was null."
            if (r8 == 0) goto L_0x0082
            r0 = 44
            java.lang.String r0 = r4.A0K(r0)
            if (r0 == 0) goto L_0x007d
            com.instagram.user.model.User r2 = new com.instagram.user.model.User
            r2.<init>(r8, r0)
            java.lang.String r0 = r4.A0H()
            r2.A0u(r0)
            r8 = 45
            r0 = 0
            long r8 = r4.A04(r8, r0)
            java.lang.Long r9 = java.lang.Long.valueOf(r8)
            X.4Cl r8 = r2.A03
            r8.Eax(r9)
            r8 = 40
            long r8 = r4.A04(r8, r0)
            X.4Cl r1 = r2.A03
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r1.Ei2(r0)
            X.17i r1 = X.17h.A00(r10)
            java.lang.String r16 = "default"
            r0 = 42
            java.util.List r17 = r4.A0N(r0)
            X.0qQ.A07(r17)
            X.OHh r10 = new X.OHh
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r18 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            com.instagram.user.model.User r0 = r1.A01(r2, r3, r7)
            X.C70850OOe.A01(r10, r6, r5, r4, r0)
        L_0x007c:
            return r11
        L_0x007d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0082:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47716EDz.A0K(android.view.View, X.6Rm, X.4tV, java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r3, C276544tV r4, Object obj, Object obj2) {
        C67681MsJ msJ = (C67681MsJ) view;
        0qQ.A0B(msJ, 0);
        msJ.setRenderType(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        msJ.setOnClickListener((View.OnClickListener) null);
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public C47716EDz(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }
}
