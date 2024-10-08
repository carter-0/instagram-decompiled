package X;

/* renamed from: X.7RX  reason: invalid class name */
public final class AnonymousClass7RX implements AnonymousClass7DS {
    public final /* synthetic */ AnonymousClass7RW A00;

    public AnonymousClass7RX(AnonymousClass7RW r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.common.ui.text.TightTextView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
        r4.Cpe(r5, r6, r7, r8, r9, r10, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b8, code lost:
        r1.BSG();
        r6.A07.getLocationOnScreen(new int[2]);
        X.C59689JTv.A09(r3, r3.getString(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ca, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean DRa(android.view.MotionEvent r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r13 = this;
            r6 = r16
            r1 = r15
            X.Mdk r1 = (X.C66851Mdk) r1
            X.90a r6 = (X.C3722390a) r6
            X.7RW r5 = r13.A00
            X.0qQ.A0A(r1)
            X.0qQ.A0A(r6)
            X.7FE r0 = r1.A01
            boolean r0 = r0.A06
            r11 = 0
            if (r0 != 0) goto L_0x001f
            java.lang.Integer r2 = r1.A04
            int r0 = r2.intValue()
            switch(r0) {
                case 0: goto L_0x0071;
                case 1: goto L_0x002c;
                case 2: goto L_0x002c;
                case 3: goto L_0x0020;
                case 4: goto L_0x00ac;
                case 5: goto L_0x009f;
                default: goto L_0x001f;
            }
        L_0x001f:
            return r11
        L_0x0020:
            X.7XR r2 = r5.A02
            X.7Wz r2 = (X.C332927Wz) r2
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r1.BSG()
            r2.EuX(r0)
            goto L_0x008c
        L_0x002c:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r2 != r0) goto L_0x0048
            com.instagram.common.session.UserSession r4 = r5.A01
            X.0iw r2 = r5.A00
            java.lang.String r0 = "direct_self_replay_raven_tap"
            X.0xI r3 = X.0xI.A00(r2, r0)
            java.lang.String r2 = "entry_point"
            java.lang.String r0 = "Thread"
            r3.A0C(r2, r0)
            X.0xN r0 = X.C60510iO.A00(r4)
            r0.EFq(r3)
        L_0x0048:
            X.7XR r4 = r5.A02
            X.7XE r4 = (X.AnonymousClass7XE) r4
            com.instagram.model.direct.messageid.MessageIdentifier r7 = r1.BSG()
            r10 = 1
            android.widget.FrameLayout r0 = r6.A00
            android.graphics.RectF r5 = X.0nA.A0F(r0)
            X.7FT r0 = r1.A00
            X.Jw1 r0 = r0.A01
            if (r0 != 0) goto L_0x0060
            r8 = 0
        L_0x005e:
            r9 = 0
            goto L_0x0088
        L_0x0060:
            java.lang.Object r3 = r0.A03
            X.Pwl r3 = (X.C74552Pwl) r3
            int r2 = r0.A01
            java.lang.Object r1 = r0.A02
            com.instagram.direct.model.messaginguser.MessagingUser r1 = (com.instagram.direct.model.messaginguser.MessagingUser) r1
            X.OUE r0 = X.O4Y.A00
            com.google.common.collect.ImmutableList r8 = r0.A01(r1, r3, r2)
            goto L_0x005e
        L_0x0071:
            X.7XR r4 = r5.A02
            X.7XE r4 = (X.AnonymousClass7XE) r4
            com.instagram.model.direct.messageid.MessageIdentifier r7 = r1.BSG()
            android.widget.FrameLayout r0 = r6.A00
            android.graphics.RectF r5 = X.0nA.A0F(r0)
            X.7FT r0 = r1.A00
            X.Jw1 r0 = r0.A01
            if (r0 != 0) goto L_0x008e
            r8 = 0
        L_0x0086:
            r9 = 0
            r10 = r11
        L_0x0088:
            r12 = r11
            r4.Cpe(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x008c:
            r11 = 1
            return r11
        L_0x008e:
            java.lang.Object r3 = r0.A03
            X.Pwl r3 = (X.C74552Pwl) r3
            int r2 = r0.A01
            java.lang.Object r1 = r0.A02
            com.instagram.direct.model.messaginguser.MessagingUser r1 = (com.instagram.direct.model.messaginguser.MessagingUser) r1
            X.OUE r0 = X.O4Y.A00
            com.google.common.collect.ImmutableList r8 = r0.A01(r1, r3, r2)
            goto L_0x0086
        L_0x009f:
            android.widget.FrameLayout r0 = r6.A00
            android.content.Context r3 = r0.getContext()
            X.0qQ.A07(r3)
            r2 = 2131960708(0x7f132384, float:1.9558092E38)
            goto L_0x00b8
        L_0x00ac:
            android.widget.FrameLayout r0 = r6.A00
            android.content.Context r3 = r0.getContext()
            X.0qQ.A07(r3)
            r2 = 2131960707(0x7f132383, float:1.955809E38)
        L_0x00b8:
            r1.BSG()
            r0 = 2
            int[] r1 = new int[r0]
            com.instagram.common.ui.text.TightTextView r0 = r6.A07
            r0.getLocationOnScreen(r1)
            java.lang.String r0 = r3.getString(r2)
            X.C59689JTv.A09(r3, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RX.DRa(android.view.MotionEvent, java.lang.Object, java.lang.Object):boolean");
    }
}
