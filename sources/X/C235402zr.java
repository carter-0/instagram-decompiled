package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.2zr  reason: invalid class name and case insensitive filesystem */
public final class C235402zr extends C235412zs {
    public final boolean A00;
    public final UserSession A01;

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cb, code lost:
        if (r1.getVisibility() != 0) goto L_0x00cd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r8, X.C252093oY r9) {
        /*
            r7 = this;
            r5 = 0
            X.0qQ.A0B(r8, r5)
            r4 = 1
            X.0qQ.A0B(r9, r4)
            java.lang.Object r2 = r8.A03
            X.0qQ.A06(r2)
            r0 = r2
            X.1Xj r0 = (X.1Xj) r0
            X.59J r3 = r7.A02(r0)
            java.lang.Integer r1 = r9.CEk(r8)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x008e
            java.util.Map r0 = r7.A00
            java.lang.Object r2 = r0.get(r2)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x008e
            float r1 = r9.CFe(r8)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x008e
            r0 = 2131440206(0x7f0b324e, float:1.8502389E38)
            android.view.View r1 = r2.findViewById(r0)
            boolean r0 = r1 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x00cf
            android.widget.TextView r1 = (android.widget.TextView) r1
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x004b
            int r0 = r1.getCurrentTextColor()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A06 = r0
        L_0x004b:
            java.lang.CharSequence r0 = r1.getText()
            java.lang.String r0 = r0.toString()
            r3.A0B = r0
        L_0x0055:
            r0 = 2131440862(0x7f0b34de, float:1.850372E38)
            android.view.View r6 = r2.findViewById(r0)
            r0 = 2131431274(0x7f0b0f6a, float:1.8484273E38)
            android.view.View r1 = r2.findViewById(r0)
            if (r6 == 0) goto L_0x00c4
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L_0x00c4
        L_0x006b:
            boolean r0 = r6 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x008f
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x0080
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r0 = r0.getCurrentTextColor()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A05 = r0
        L_0x0080:
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.CharSequence r0 = r6.getText()
            java.lang.String r0 = r0.toString()
            r3.A0C = r0
        L_0x008c:
            r3.A0I = r4
        L_0x008e:
            return
        L_0x008f:
            boolean r0 = r6 instanceof com.facebook.litho.ComponentHost
            if (r0 == 0) goto L_0x008c
            com.facebook.litho.ComponentHost r6 = (com.facebook.litho.ComponentHost) r6
            java.util.List r0 = r6.getTextContent()
            java.lang.Object r0 = X.00k.A0O(r0, r5)
            com.facebook.litho.TextContent r0 = (com.facebook.litho.TextContent) r0
            if (r0 == 0) goto L_0x008c
            java.util.List r0 = r0.getItems()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r1 = X.00k.A0O(r0, r5)
            X.5FD r1 = (X.AnonymousClass5FD) r1
            if (r1 == 0) goto L_0x008c
            java.lang.CharSequence r0 = r1.A06
            java.lang.String r0 = r0.toString()
            r3.A0C = r0
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x008c
            int r0 = r1.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A05 = r0
            goto L_0x008c
        L_0x00c4:
            if (r1 == 0) goto L_0x00cd
            int r0 = r1.getVisibility()
            r6 = r1
            if (r0 == 0) goto L_0x006b
        L_0x00cd:
            r6 = 0
            goto L_0x006b
        L_0x00cf:
            boolean r0 = r1 instanceof com.facebook.litho.ComponentHost
            if (r0 == 0) goto L_0x0055
            com.facebook.litho.ComponentHost r1 = (com.facebook.litho.ComponentHost) r1
            java.util.List r0 = r1.getTextContent()
            java.lang.Object r0 = X.00k.A0O(r0, r5)
            com.facebook.litho.TextContent r0 = (com.facebook.litho.TextContent) r0
            if (r0 == 0) goto L_0x0055
            java.util.List r0 = r0.getItems()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r1 = X.00k.A0O(r0, r5)
            X.5FD r1 = (X.AnonymousClass5FD) r1
            if (r1 == 0) goto L_0x0055
            java.lang.CharSequence r0 = r1.A06
            java.lang.String r0 = r0.toString()
            r3.A0B = r0
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x0055
            int r0 = r1.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A06 = r0
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C235402zr.ATF(X.30Y, X.3oY):void");
    }

    public C235402zr(UserSession userSession, Map map) {
        super(map);
        this.A01 = userSession;
        this.A00 = 182.A06(0Tu.A05, userSession, 2342153375698845734L);
    }
}
