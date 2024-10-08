package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.41M  reason: invalid class name */
public final class AnonymousClass41M extends C252633pQ {
    public final UserSession A00;
    public final C248533i9 A01;
    public final 0Pl A02;
    public final String A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass41M(Context context, UserSession userSession, C248533i9 r4, 0Pl r5, String str, boolean z) {
        super(context);
        0qQ.A0B(context, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(userSession, 3);
        0qQ.A0B(r5, 4);
        0qQ.A0B(r4, 5);
        this.A03 = str;
        this.A00 = userSession;
        this.A02 = r5;
        this.A01 = r4;
        this.A04 = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v102, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v107, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v135, resolved type: X.0rm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(android.content.Context r25, X.C254023ro r26, X.C247673gj r27, X.AnonymousClass3W1 r28) {
        /*
            r24 = this;
            r0 = 0
            r11 = r25
            X.0qQ.A0B(r11, r0)
            r0 = 1
            r9 = r27
            X.0qQ.A0B(r9, r0)
            r1 = 2
            r23 = r28
            r0 = r23
            X.0qQ.A0B(r0, r1)
            r0 = 3
            r10 = r26
            X.0qQ.A0B(r10, r0)
            X.3Zv r0 = X.C243683Zu.A0E
            X.3Zu r13 = r0.A01(r11)
            r8 = 0
            r7 = 1
            r2 = 4
            X.0qQ.A0B(r13, r2)
            X.0rm r20 = new X.0rm
            r20.<init>()
            boolean r6 = r9.A07
            if (r6 != 0) goto L_0x004a
            X.9Ij r0 = r9.A00
            java.lang.Object r1 = r0.A06
            X.0sP r1 = (X.0sP) r1
            android.widget.TextView r0 = r10.A00()
            java.lang.Object r1 = r1.invoke(r0)
            r0 = r20
            r0.A00 = r1
            android.widget.TextView r1 = r10.A00()
            X.3aa r0 = X.C244063aa.DISCLAIMER
            X.C244083ac.A05(r1, r0)
        L_0x004a:
            X.3W1 r1 = r10.A01
            if (r1 == 0) goto L_0x0056
            r0 = r23
            if (r1 == r0) goto L_0x0056
            r0 = 0
            r1.A0M(r10, r0, r7)
        L_0x0056:
            r12 = r24
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x0061
            android.view.ViewGroup r0 = r10.A05
            X.2eQ.A04(r0, r2)
        L_0x0061:
            java.lang.String r0 = r9.A06
            r10.A04 = r0
            r0 = r23
            r10.A01 = r0
            android.view.ViewGroup r0 = r10.A05
            X.0nA.A0c(r0, r8)
            X.9Ij r5 = r9.A00
            java.lang.Object r0 = r5.A02
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r2 = r0.invoke(r11)
            X.3um r2 = (X.C255823um) r2
            boolean r0 = r2 instanceof X.C255853up
            r4 = 8
            if (r0 == 0) goto L_0x00b7
            com.instagram.feed.ui.text.BulletAwareTextView r1 = r10.A02
            if (r1 != 0) goto L_0x009d
            android.view.ViewStub r0 = r10.A06
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.ui.text.BulletAwareTextView"
            X.0qQ.A0C(r1, r0)
            com.instagram.feed.ui.text.BulletAwareTextView r1 = (com.instagram.feed.ui.text.BulletAwareTextView) r1
            r10.A02 = r1
            if (r1 != 0) goto L_0x009d
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x009d:
            X.3up r2 = (X.C255853up) r2
            java.lang.CharSequence r0 = r2.A00
            r1.setText(r0)
            r1.setVisibility(r8)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r0)
            X.IA1 r0 = new X.IA1
            r0.<init>(r9)
            X.AnonymousClass0fU.A00(r0, r1)
            goto L_0x00e5
        L_0x00b7:
            X.3ul r0 = X.C255813ul.A00
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x03f5
            if (r6 == 0) goto L_0x00c5
            com.instagram.feed.ui.text.BulletAwareTextView r0 = r10.A02
            if (r0 == 0) goto L_0x00e5
        L_0x00c5:
            com.instagram.feed.ui.text.BulletAwareTextView r1 = r10.A02
            if (r1 != 0) goto L_0x00e2
            android.view.ViewStub r0 = r10.A06
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.ui.text.BulletAwareTextView"
            X.0qQ.A0C(r1, r0)
            com.instagram.feed.ui.text.BulletAwareTextView r1 = (com.instagram.feed.ui.text.BulletAwareTextView) r1
            r10.A02 = r1
            if (r1 != 0) goto L_0x00e2
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00e2:
            r1.setVisibility(r4)
        L_0x00e5:
            java.lang.Object r0 = r5.A03
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r2 = r0.invoke(r11)
            X.3uo r2 = (X.C255843uo) r2
            boolean r0 = r2 instanceof X.C255863uq
            if (r0 == 0) goto L_0x03d2
            com.instagram.feed.ui.text.BulletAwareTextView r1 = r10.A01()
            X.3uq r2 = (X.C255863uq) r2
            java.lang.CharSequence r0 = r2.A00
            r1.setText(r0)
            com.instagram.feed.ui.text.BulletAwareTextView r1 = r10.A01()
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r0)
            com.instagram.feed.ui.text.BulletAwareTextView r0 = r10.A01()
            r0.setVisibility(r8)
        L_0x0110:
            X.3gi r3 = r9.A01
            X.41O r2 = r10.A09
            boolean r0 = r9.A09
            r19 = r0
            boolean r1 = r9.A08
            int r0 = r13.A06
            r22 = r0
            java.lang.Integer r18 = java.lang.Integer.valueOf(r22)
            r17 = 0
            X.0qQ.A0B(r3, r7)
            r0 = 2
            X.0qQ.A0B(r2, r0)
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x0296
            android.view.View r15 = r2.A00
            com.instagram.feed.ui.text.IgLikeTextView r13 = r2.A02
            X.3gh r0 = r3.A00
            X.0sP r14 = r0.A02
            android.content.Context r0 = r13.getContext()
            X.0qQ.A07(r0)
            java.lang.Object r14 = r14.invoke(r0)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            int r0 = r14.length()
            if (r0 != 0) goto L_0x028e
            r15.setVisibility(r4)
            r13.setVisibility(r4)
        L_0x0150:
            if (r19 != 0) goto L_0x027a
            if (r1 != 0) goto L_0x027a
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x027a
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x027a
        L_0x015c:
            android.view.View r1 = r2.A00
            r0 = r17
            X.0nA.A0T(r1, r0)
            X.3gT r2 = r9.A04
            boolean r0 = r2 instanceof X.C255883us
            if (r0 == 0) goto L_0x026b
            if (r6 == 0) goto L_0x0184
            java.lang.Object r1 = r5.A06
            X.0sP r1 = (X.0sP) r1
            android.widget.TextView r0 = r10.A00()
            java.lang.Object r1 = r1.invoke(r0)
            r0 = r20
            r0.A00 = r1
            android.widget.TextView r1 = r10.A00()
            X.3aa r0 = X.C244063aa.DISCLAIMER
            X.C244083ac.A05(r1, r0)
        L_0x0184:
            X.3us r2 = (X.C255883us) r2
            java.lang.CharSequence r0 = r2.A00
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r0)
            X.3a9 r1 = new X.3a9
            r1.<init>()
            int r0 = r3.length()
            r3.setSpan(r1, r8, r0, r8)
            android.widget.TextView r0 = r10.A00()
            r0.setText(r3)
            android.widget.TextView r2 = r10.A00()
            r1 = 2131954409(0x7f130ae9, float:1.9545316E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r3}
            java.lang.String r0 = r11.getString(r1, r0)
            r2.setContentDescription(r0)
            android.widget.TextView r2 = r10.A00()
            X.IB8 r1 = new X.IB8
            r0 = r20
            r1.<init>(r12, r9, r0)
            X.AnonymousClass0fU.A00(r1, r2)
            android.widget.TextView r0 = r10.A00()
            r0.setVisibility(r8)
            android.widget.TextView r1 = r10.A00()
            com.instagram.common.session.UserSession r0 = r12.A00
            int r0 = X.C55164HdG.A00(r0)
            r1.setMaxLines(r0)
        L_0x01d4:
            X.3gQ r1 = r9.A03
            boolean r0 = r1 instanceof X.C255893ut
            if (r0 == 0) goto L_0x0261
            X.3ut r1 = (X.C255893ut) r1
            java.lang.String r0 = r1.A00
            java.lang.String r0 = X.C270804hK.A00(r11, r0, r7)
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r0)
            X.3a9 r1 = new X.3a9
            r1.<init>()
            int r0 = r2.length()
            r2.setSpan(r1, r8, r0, r8)
            X.3oV r0 = r10.A08
            android.view.View r1 = r0.getView()
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.IAm r0 = new X.IAm
            r0.<init>(r12, r9)
            X.AnonymousClass0fU.A00(r0, r1)
            r1.setText(r2)
            r1.setVisibility(r8)
            X.3aa r0 = X.C244063aa.DISCLAIMER
            X.C244083ac.A05(r1, r0)
        L_0x020e:
            X.3gd r1 = r9.A02
            boolean r0 = r1 instanceof X.C255873ur
            if (r0 == 0) goto L_0x0257
            X.3ur r1 = (X.C255873ur) r1
            java.lang.CharSequence r0 = r1.A00
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r0)
            X.3a9 r1 = new X.3a9
            r1.<init>()
            int r0 = r2.length()
            r2.setSpan(r1, r8, r0, r8)
            android.widget.TextView r0 = r10.A00()
            r0.setText(r2)
            android.widget.TextView r1 = r10.A00()
            X.IAn r0 = new X.IAn
            r0.<init>(r12, r9)
            X.AnonymousClass0fU.A00(r0, r1)
            android.widget.TextView r0 = r10.A00()
            r0.setVisibility(r8)
            android.widget.TextView r1 = r10.A00()
            com.instagram.common.session.UserSession r0 = r12.A00
            int r0 = X.C55164HdG.A00(r0)
            r1.setMaxLines(r0)
        L_0x0250:
            r1 = 0
            r0 = r23
            r0.A0L(r10, r1, r7)
            return
        L_0x0257:
            boolean r0 = r1 instanceof X.C247603gc
            if (r0 != 0) goto L_0x0250
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0261:
            boolean r0 = r1 instanceof X.C247483gP
            if (r0 == 0) goto L_0x03e3
            X.3oV r0 = r10.A08
            r0.setVisibility(r4)
            goto L_0x020e
        L_0x026b:
            X.3gS r0 = X.C247513gS.A00
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x03e9
            android.widget.TextView r0 = r10.A00
            X.0nA.A0O(r0)
            goto L_0x01d4
        L_0x027a:
            boolean r3 = r3.A03
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            if (r3 == 0) goto L_0x0288
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
        L_0x0288:
            int r17 = r1.getDimensionPixelSize(r0)
            goto L_0x015c
        L_0x028e:
            r15.setVisibility(r8)
            r13.setText(r14)
            goto L_0x0354
        L_0x0296:
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0361
            X.3oV r0 = r2.A01
            r21 = r0
            android.view.View r0 = r21.getView()
            java.lang.Object r15 = r0.getTag()
            java.lang.String r13 = r3.A01
            X.3gh r0 = r3.A00
            r16 = r0
            X.0sP r14 = r0.A05
            android.view.View r0 = r21.getView()
            android.content.Context r0 = r0.getContext()
            X.0qQ.A07(r0)
            java.lang.Object r14 = r14.invoke(r0)
            android.graphics.drawable.Drawable r14 = (android.graphics.drawable.Drawable) r14
            boolean r0 = X.0qQ.A0K(r15, r13)
            if (r0 != 0) goto L_0x02f2
            android.view.View r0 = r21.getView()
            r0.setTag(r13)
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x02f2
            if (r14 == 0) goto L_0x02f2
            android.view.View r15 = r21.getView()
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r0 = 1065353216(0x3f800000, float:1.0)
            r15.setAlpha(r0)
            r15.setImageDrawable(r14)
            android.content.Context r13 = r15.getContext()
            r0 = 2130970273(0x7f0406a1, float:1.7549251E38)
            int r0 = X.2Yu.A0F(r13, r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r15.setImageTintList(r0)
        L_0x02f2:
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x0333
            if (r14 == 0) goto L_0x0333
            android.view.View r14 = r21.getView()
            android.content.Context r0 = r14.getContext()
            android.content.res.Resources r13 = r0.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r0 = r13.getDimensionPixelSize(r0)
            X.0nA.A0U(r14, r0)
            r0 = r21
            r0.setVisibility(r8)
        L_0x0313:
            android.view.View r14 = r2.A00
            com.instagram.feed.ui.text.IgLikeTextView r13 = r2.A02
            r0 = r16
            X.0sP r15 = r0.A06
            android.content.Context r0 = r13.getContext()
            X.0qQ.A07(r0)
            java.lang.Object r15 = r15.invoke(r0)
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            int r0 = r15.length()
            if (r0 != 0) goto L_0x0347
            r14.setVisibility(r4)
            goto L_0x0150
        L_0x0333:
            android.view.View r0 = r21.getView()
            X.0nA.A0d(r0, r8)
            android.view.View r0 = r21.getView()
            X.0nA.A0U(r0, r8)
            r0 = r21
            r0.setVisibility(r4)
            goto L_0x0313
        L_0x0347:
            r14.setVisibility(r8)
            r13.setText(r15)
            if (r18 == 0) goto L_0x0354
            r0 = r22
            r13.setTextColor(r0)
        L_0x0354:
            r13.setLongClickable(r8)
            r13.setVisibility(r8)
            r0 = 1065353216(0x3f800000, float:1.0)
            r13.setAlpha(r0)
            goto L_0x0150
        L_0x0361:
            X.3oV r0 = r2.A01
            r16 = r0
            if (r19 != 0) goto L_0x0388
            if (r1 != 0) goto L_0x0388
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0373
            boolean r0 = r16.CVM()
            if (r0 == 0) goto L_0x0381
        L_0x0373:
            android.view.View r0 = r16.getView()
            X.0nA.A0d(r0, r8)
            r13 = 8
        L_0x037c:
            r0 = r16
            r0.setVisibility(r13)
        L_0x0381:
            r0 = r18
            X.C255903uu.A01(r2, r3, r0)
            goto L_0x0150
        L_0x0388:
            if (r0 == 0) goto L_0x0381
            android.view.View r0 = r16.getView()
            android.content.Context r14 = r0.getContext()
            android.view.View r0 = r16.getView()
            java.lang.Object r0 = r0.getTag()
            java.lang.String r13 = r3.A01
            boolean r0 = X.0qQ.A0K(r13, r0)
            if (r0 != 0) goto L_0x03c1
            X.3gh r0 = r3.A00
            if (r1 == 0) goto L_0x03cf
            X.0sP r0 = r0.A07
        L_0x03a8:
            X.0qQ.A0A(r14)
            java.lang.Object r15 = r0.invoke(r14)
            android.graphics.drawable.Drawable r15 = (android.graphics.drawable.Drawable) r15
            android.view.View r0 = r16.getView()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageDrawable(r15)
            android.view.View r0 = r16.getView()
            r0.setTag(r13)
        L_0x03c1:
            android.view.View r13 = r16.getView()
            X.5ES r0 = new X.5ES
            r0.<init>(r14, r3, r1)
            X.AnonymousClass0fU.A00(r0, r13)
            r13 = 0
            goto L_0x037c
        L_0x03cf:
            X.0sP r0 = r0.A0A
            goto L_0x03a8
        L_0x03d2:
            X.3un r0 = X.C255833un.A00
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x03ef
            com.instagram.feed.ui.text.BulletAwareTextView r0 = r10.A03
            if (r0 == 0) goto L_0x0110
            r0.setVisibility(r4)
            goto L_0x0110
        L_0x03e3:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x03e9:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x03ef:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x03f5:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass41M.A06(android.content.Context, X.3ro, X.3gj, X.3W1):void");
    }
}
