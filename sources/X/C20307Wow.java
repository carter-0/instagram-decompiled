package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.Wow  reason: case insensitive filesystem */
public final class C20307Wow implements Runnable {
    public final /* synthetic */ IgReactPurchaseExperienceBridgeModule A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C20307Wow(IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule, String str, String str2) {
        this.A00 = igReactPurchaseExperienceBridgeModule;
        this.A02 = str;
        this.A01 = str2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0033: MOVE  (r0v26 androidx.core.app.ComponentActivity) = (r3v4 androidx.core.app.ComponentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void run() {
        /*
            r8 = this;
            com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule r6 = r8.A00
            android.app.Activity r4 = r6.getCurrentActivity()
            r4.getClass()
            java.util.List r3 = r6.mProducts
            if (r3 != 0) goto L_0x0049
            java.lang.String r2 = r8.A02
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0049
            java.lang.String r1 = r8.A01
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0049
            android.os.Bundle r0 = X.DbU.A06(r4)
            com.instagram.common.session.UserSession r0 = X.DbS.A0U(r0)
            r6.mUserSession = r0
            X.WdC r6 = new X.WdC
            r6.<init>(r4, r0, r2, r1)
            android.app.Activity r3 = r6.A01
            boolean r0 = r3 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x0048
            r0 = r3
            androidx.core.app.ComponentActivity r0 = (androidx.core.app.ComponentActivity) r0
            if (r0 == 0) goto L_0x0048
            X.0gy r4 = X.AnonymousClass07i.A00(r0)
            com.instagram.common.session.UserSession r5 = r6.A02
            r7 = 0
            X.Wej r2 = new X.Wej
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = 1
            r0 = 0
            r2.A01(r1, r0)
        L_0x0048:
            return
        L_0x0049:
            com.instagram.common.session.UserSession r0 = r6.mUserSession
            if (r0 == 0) goto L_0x0048
            if (r3 == 0) goto L_0x0048
            android.app.Activity r0 = r6.getCurrentActivity()
            if (r0 == 0) goto L_0x0048
            java.util.List r0 = r6.mProducts
            boolean r0 = r0.isEmpty()
            r2 = 1
            r1 = r0 ^ 1
            r0 = 0
            X.02V.A07(r1, r0)
            java.util.List r0 = r6.mProducts
            int r0 = r0.size()
            if (r0 != r2) goto L_0x00a5
            X.QZK r0 = r6.getReactApplicationContext()
            int r1 = X.0nA.A09(r0)
            X.QZK r0 = r6.getReactApplicationContext()
            int r0 = X.0nA.A08(r0)
            float r3 = (float) r0
            float r2 = (float) r1
            r1 = 0
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r1, r3, r2, r3)
            int r0 = r0 * 2
            float r0 = (float) r0
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r1, r3, r2, r0)
            com.instagram.common.session.UserSession r3 = r6.mUserSession
            android.app.Activity r2 = r6.getCurrentActivity()
            java.util.List r0 = r6.mProducts
            java.lang.Object r1 = X.AnonymousClass7TE.A13(r0)
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            X.F2h r0 = new X.F2h
            r0.<init>(r2, r3, r1)
            r0.A01 = r5
            r0.A02 = r4
            r0.A00()
            return
        L_0x00a5:
            com.instagram.common.session.UserSession r0 = r6.mUserSession
            X.7Pr r2 = new X.7Pr
            r2.<init>(r0)
            X.QZK r1 = r6.getReactApplicationContext()
            r0 = 2131969824(0x7f134720, float:1.9576582E38)
            X.DbZ.A0z(r1, r2, r0)
            X.7Pu r5 = r2.A00()
            android.app.Activity r4 = r6.getCurrentActivity()
            X.3kF r0 = X.C249713kF.A00
            r0.A0T()
            java.util.List r0 = r6.mProducts
            com.instagram.shopping.fragment.postpurchase.ProductSharePickerFragment r3 = new com.instagram.shopping.fragment.postpurchase.ProductSharePickerFragment
            r3.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r0 = 3760(0xeb0, float:5.269E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putParcelableArrayList(r0, r1)
            r3.setArguments(r2)
            r5.A02(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20307Wow.run():void");
    }
}
