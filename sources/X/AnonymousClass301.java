package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.301  reason: invalid class name */
public final class AnonymousClass301 extends C235412zs {
    public final boolean A00;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        if (r1 != r8.length()) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r12, X.C252093oY r13) {
        /*
            r11 = this;
            r0 = 0
            X.0qQ.A0B(r12, r0)
            r0 = 1
            X.0qQ.A0B(r13, r0)
            java.lang.Object r2 = r12.A03
            X.0qQ.A06(r2)
            r0 = r2
            X.1Xj r0 = (X.1Xj) r0
            X.59J r7 = r11.A02(r0)
            java.lang.Integer r1 = r13.CEk(r12)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x00e5
            java.lang.Object r0 = r12.A04
            X.3dY r0 = (X.C245833dY) r0
            X.3gp r0 = r0.A01
            java.lang.Integer r1 = r0.A0Z
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x00e5
            java.util.Map r0 = r11.A00
            java.lang.Object r1 = r0.get(r2)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x00e5
            r0 = 2131440163(0x7f0b3223, float:1.8502302E38)
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L_0x00e5
            boolean r0 = r1 instanceof com.instagram.ui.widget.textview.IgTextLayoutView
            if (r0 == 0) goto L_0x00e5
            com.instagram.ui.widget.textview.IgTextLayoutView r1 = (com.instagram.ui.widget.textview.IgTextLayoutView) r1
            java.lang.CharSequence r9 = r1.getTextForAccessibility()
            boolean r0 = r9 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x00df
            r8 = r9
            android.text.Spanned r8 = (android.text.Spanned) r8
            boolean r0 = r11.A00
            if (r0 == 0) goto L_0x00df
            int r1 = r8.length()
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r6 = 0
            java.lang.Object[] r5 = r8.getSpans(r6, r1, r0)
            if (r5 == 0) goto L_0x00df
            int r4 = r5.length
            if (r4 == 0) goto L_0x00df
            java.util.List r3 = r7.A0D
            if (r3 == 0) goto L_0x006e
            int r1 = r3.size()
            int r0 = r8.length()
            if (r1 == r0) goto L_0x0082
        L_0x006e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1 = 0
        L_0x0074:
            X.5oV r0 = new X.5oV
            r0.<init>()
            r3.add(r0)
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x0074
            r7.A0D = r3
        L_0x0082:
            r10 = r5[r6]
            java.lang.Object r2 = r3.get(r6)
            X.0bb r2 = (X.0bb) r2
            r0 = 0
            X.0qQ.A0B(r10, r0)
            boolean r0 = r10 instanceof X.C252973q0
            if (r0 == 0) goto L_0x00ca
            r0 = r10
            X.3q0 r0 = (X.C252973q0) r0
            int r0 = r0.A00
        L_0x0097:
            java.lang.String r1 = "#"
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r1 = X.002.A0R(r1, r0)
        L_0x00a1:
            X.0qQ.A0A(r1)
            java.lang.String r0 = "color"
            r2.A06(r0, r1)
            int r0 = r8.getSpanStart(r10)
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "start"
            r2.A05(r0, r1)
            int r0 = r8.getSpanEnd(r10)
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "end"
            r2.A05(r0, r1)
            int r6 = r6 + 1
            if (r6 >= r4) goto L_0x00df
            goto L_0x0082
        L_0x00ca:
            boolean r0 = r10 instanceof android.text.style.ForegroundColorSpan
            if (r0 == 0) goto L_0x00d6
            r0 = r10
            android.text.style.ForegroundColorSpan r0 = (android.text.style.ForegroundColorSpan) r0
            int r0 = r0.getForegroundColor()
            goto L_0x0097
        L_0x00d6:
            java.lang.Class r0 = r10.getClass()
            java.lang.String r1 = r0.getName()
            goto L_0x00a1
        L_0x00df:
            java.lang.String r0 = r9.toString()
            r7.A06 = r0
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass301.ATF(X.30Y, X.3oY):void");
    }

    public AnonymousClass301(UserSession userSession, Map map) {
        super(map);
        this.A00 = 182.A06(0Tu.A05, userSession, 2342153375698845734L);
    }
}
