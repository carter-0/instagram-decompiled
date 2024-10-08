package X;

/* renamed from: X.9MR  reason: invalid class name */
public final class AnonymousClass9MR extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MR(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
    }

    /* JADX WARNING: type inference failed for: r11v16, types: [X.3YT, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x09f7: MOVE  (r5v31 com.facebook.litho.LithoView) = (r5v30 com.facebook.litho.LithoView)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r24 = this;
            r0 = r24
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0075;
                case 1: goto L_0x009c;
                case 2: goto L_0x001c;
                case 3: goto L_0x014b;
                case 4: goto L_0x0169;
                case 5: goto L_0x018c;
                case 6: goto L_0x01ae;
                case 7: goto L_0x01cc;
                case 8: goto L_0x01ef;
                case 9: goto L_0x020d;
                case 10: goto L_0x0234;
                case 11: goto L_0x0278;
                case 12: goto L_0x02bc;
                case 13: goto L_0x0323;
                case 14: goto L_0x033f;
                case 15: goto L_0x0355;
                case 16: goto L_0x0374;
                case 17: goto L_0x038d;
                case 18: goto L_0x03ac;
                case 19: goto L_0x03cd;
                case 20: goto L_0x03f8;
                case 21: goto L_0x0417;
                case 22: goto L_0x0438;
                case 23: goto L_0x045a;
                case 24: goto L_0x04eb;
                case 25: goto L_0x0511;
                case 26: goto L_0x0530;
                case 27: goto L_0x054a;
                case 28: goto L_0x0576;
                case 29: goto L_0x064b;
                case 30: goto L_0x0660;
                case 31: goto L_0x0681;
                case 32: goto L_0x06ab;
                case 33: goto L_0x070c;
                case 34: goto L_0x0744;
                case 35: goto L_0x076e;
                case 36: goto L_0x078a;
                case 37: goto L_0x07a3;
                case 38: goto L_0x07ba;
                case 39: goto L_0x0854;
                case 40: goto L_0x08a9;
                case 41: goto L_0x0930;
                case 42: goto L_0x094b;
                case 43: goto L_0x0965;
                case 44: goto L_0x0982;
                case 45: goto L_0x099a;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A03
            X.3VA r2 = (X.AnonymousClass3VA) r2
            java.lang.Object r1 = r0.A02
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r0.A04
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            android.graphics.drawable.Drawable r6 = X.C243193Xt.A00(r3, r0, r1, r2)
        L_0x001b:
            return r6
        L_0x001c:
            java.lang.Object r1 = r0.A03
            X.ADt r1 = (X.C39892ADt) r1
            boolean r1 = r1.A01()
            r3 = 0
            if (r1 == 0) goto L_0x0a2e
            java.lang.Object r2 = r0.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 == r1) goto L_0x003e
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            if (r2 == r1) goto L_0x003e
            X.0eM r0 = X.ADu.A02
            java.lang.Object r0 = r0.getValue()
            X.ADu r0 = (X.ADu) r0
            android.graphics.Bitmap r6 = r0.A00
            r0.A00 = r3
            return r6
        L_0x003e:
            java.lang.Object r1 = r0.A04
            X.8L1 r1 = (X.AnonymousClass8L1) r1
            java.lang.Object r5 = r0.A01
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r2 = r1.A03
            r4 = 1048576000(0x3e800000, float:0.25)
            int r0 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x09c2 }
            float r0 = (float) r0     // Catch:{ OutOfMemoryError -> 0x09c2 }
            float r0 = r0 * r4
            int r1 = (int) r0     // Catch:{ OutOfMemoryError -> 0x09c2 }
            int r0 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x09c2 }
            float r0 = (float) r0     // Catch:{ OutOfMemoryError -> 0x09c2 }
            float r0 = r0 * r4
            int r0 = (int) r0     // Catch:{ OutOfMemoryError -> 0x09c2 }
            android.graphics.Bitmap r6 = r2.getBitmap(r1, r0)     // Catch:{ OutOfMemoryError -> 0x09c2 }
            if (r6 == 0) goto L_0x0a2e
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch:{ OutOfMemoryError -> 0x09c2 }
            r2.<init>(r6)     // Catch:{ OutOfMemoryError -> 0x09c2 }
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1 / r1
            r2.scale(r0, r0)     // Catch:{ OutOfMemoryError -> 0x09c2 }
            r0 = 0
            r2.scale(r1, r1)     // Catch:{ OutOfMemoryError -> 0x09c2 }
            r2.scale(r4, r4)     // Catch:{ OutOfMemoryError -> 0x09c2 }
            if (r5 == 0) goto L_0x001b
            goto L_0x09be
        L_0x0075:
            java.lang.Object r3 = r0.A03
            X.2V5 r3 = (X.2V5) r3
            if (r3 == 0) goto L_0x092d
            java.lang.Object r1 = r0.A01
            X.4um r1 = (X.C277274um) r1
            if (r1 == 0) goto L_0x008a
            X.4uo r1 = r1.A00
            if (r1 == 0) goto L_0x008a
            X.0sa r1 = r1.A00
            r1.invoke()
        L_0x008a:
            java.lang.Object r2 = r0.A04
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r1 = r2.A00
            if (r1 == 0) goto L_0x0097
            java.util.Set r0 = r3.A01
            r0.remove(r1)
        L_0x0097:
            r0 = 0
            r2.A00 = r0
            goto L_0x092d
        L_0x009c:
            java.lang.Object r6 = r0.A01
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0a23
            java.lang.Object r9 = r0.A04
            X.7hK r9 = (X.C338047hK) r9
            com.instagram.common.session.UserSession r10 = r9.A03
            X.0Tu r3 = X.0Tu.A05
            r1 = 36323032344177408(0x810b9b000a2b00, double:3.034170143344754E-306)
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0R(r3, r10, r1)
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0a23
            X.2S0 r1 = X.AnonymousClass2S0.A01
            r1.A06()
            java.lang.Object r8 = r0.A03
            X.3Y5 r8 = (X.AnonymousClass3Y5) r8
            X.2V1 r4 = r8.A05
            android.content.Context r7 = r4.A0C
            X.0qQ.A07(r7)
            java.util.List r5 = X.HX5.A00(r7, r6)
            X.7a7 r1 = r9.A01
            r3 = 1
            if (r1 == 0) goto L_0x00d7
            boolean r1 = r1.A0d
            r2 = 1
            if (r1 == r3) goto L_0x00d8
        L_0x00d7:
            r2 = 0
        L_0x00d8:
            r1 = 0
            X.8Ov r3 = new X.8Ov
            r3.<init>(r7, r10, r1, r2)
            r3.A02(r5)
            X.IEF r1 = new X.IEF
            r1.<init>(r9)
            r3.setOnDismissListener(r1)
            android.content.Context r1 = X.C243803a8.A00(r8)
            android.content.res.Resources r2 = r1.getResources()     // Catch:{ NotFoundException -> 0x00f8 }
            r1 = 2131165184(0x7f070000, float:1.7944578E38)
            int r7 = r2.getDimensionPixelSize(r1)     // Catch:{ NotFoundException -> 0x00f8 }
            goto L_0x00f9
        L_0x00f8:
            r7 = 0
        L_0x00f9:
            android.content.Context r8 = X.C243803a8.A00(r8)
            int r6 = r6.size()
            java.lang.Object r0 = r0.A02
            X.3Zt r0 = (X.C243673Zt) r0
            X.AnonymousClass2VL.A00()
            java.lang.Object r5 = r0.A00
            X.A63 r5 = (X.A63) r5
            r0 = 2
            X.0qQ.A0B(r5, r0)
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0147
            X.0qq r1 = X.AnonymousClass0qo.A00(r8)
            X.0qm r0 = X.0qm.A12
            android.graphics.Typeface r9 = r1.A02(r0)
            if (r9 == 0) goto L_0x0147
            android.content.res.Resources r1 = r8.getResources()     // Catch:{ NotFoundException -> 0x09d3 }
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r2 = r1.getDimensionPixelSize(r0)     // Catch:{ NotFoundException -> 0x09d3 }
            java.lang.String r10 = "Random Text"
            android.content.res.Resources r1 = r8.getResources()     // Catch:{ NotFoundException -> 0x09d3 }
            r0 = 2131165220(0x7f070024, float:1.794465E38)
            int r12 = r1.getDimensionPixelSize(r0)     // Catch:{ NotFoundException -> 0x09d3 }
            int r13 = X.AnonymousClass0nB.A01(r8)     // Catch:{ NotFoundException -> 0x09d3 }
            r11 = 1065353216(0x3f800000, float:1.0)
            int r1 = X.0mq.A01(r8, r9, r10, r11, r12, r13)     // Catch:{ NotFoundException -> 0x09d3 }
            int r0 = r2 * 2
            int r1 = r1 + r0
            goto L_0x09d5
        L_0x0147:
            r1 = 140(0x8c, float:1.96E-43)
            goto L_0x09d5
        L_0x014b:
            java.lang.Object r2 = r0.A04
            X.9H6 r2 = (X.AnonymousClass9H6) r2
            X.4DH r1 = r2.A00
            androidx.fragment.app.FragmentActivity r7 = r1.requireActivity()
            com.instagram.common.session.UserSession r8 = r2.A01
            java.lang.Object r11 = r0.A02
            X.4DU r11 = (X.AnonymousClass4DU) r11
            java.lang.Object r9 = r0.A01
            X.7Uf r9 = (X.C332247Uf) r9
            java.lang.Object r10 = r0.A03
            X.7SM r10 = (X.AnonymousClass7SM) r10
            X.IR6 r6 = new X.IR6
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x0169:
            java.lang.Object r1 = r0.A04
            X.9H6 r1 = (X.AnonymousClass9H6) r1
            X.4DH r1 = r1.A00
            androidx.fragment.app.FragmentActivity r7 = r1.requireActivity()
            java.lang.Object r2 = r0.A01
            r1 = 16
            X.PlY r9 = new X.PlY
            r9.<init>(r2, r1)
            java.lang.Object r10 = r0.A02
            X.0sa r10 = (X.C62320sa) r10
            java.lang.Object r11 = r0.A03
            X.0sa r11 = (X.C62320sa) r11
            X.02m r8 = X.02m.A0p
            X.77U r6 = new X.77U
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x018c:
            java.lang.Object r2 = r0.A02
            r1 = 17
            X.PlY r4 = new X.PlY
            r4.<init>(r2, r1)
            java.lang.Object r1 = r0.A04
            X.9H6 r1 = (X.AnonymousClass9H6) r1
            com.instagram.common.session.UserSession r3 = r1.A01
            java.lang.Object r2 = r0.A01
            X.0iw r2 = (X.AnonymousClass0iw) r2
            java.lang.Object r1 = r0.A03
            X.0eK r1 = (X.AnonymousClass0eK) r1
            X.A5J r0 = new X.A5J
            r0.<init>(r2, r3, r1)
            X.Acs r6 = new X.Acs
            r6.<init>(r0, r4)
            return r6
        L_0x01ae:
            java.lang.Object r1 = r0.A02
            X.0eM r1 = (X.AnonymousClass0eM) r1
            java.lang.Object r3 = r1.getValue()
            X.OT9 r3 = (X.OT9) r3
            java.lang.Object r2 = r0.A03
            X.7SM r2 = (X.AnonymousClass7SM) r2
            java.lang.Object r1 = r0.A01
            X.7TI r1 = (X.AnonymousClass7TI) r1
            java.lang.Object r0 = r0.A04
            X.9H6 r0 = (X.AnonymousClass9H6) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.P9k r6 = new X.P9k
            r6.<init>(r0, r1, r2, r3)
            return r6
        L_0x01cc:
            java.lang.Object r1 = r0.A04
            X.9H6 r1 = (X.AnonymousClass9H6) r1
            com.instagram.common.session.UserSession r9 = r1.A01
            X.4DH r1 = r1.A00
            androidx.fragment.app.FragmentActivity r8 = r1.requireActivity()
            java.lang.Object r7 = r0.A02
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            java.lang.Object r2 = r0.A01
            r1 = 19
            X.PlY r11 = new X.PlY
            r11.<init>(r2, r1)
            java.lang.Object r10 = r0.A03
            X.4mZ r10 = (X.C273434mZ) r10
            X.P9O r6 = new X.P9O
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x01ef:
            java.lang.Object r1 = r0.A04
            X.9H6 r1 = (X.AnonymousClass9H6) r1
            com.instagram.common.session.UserSession r8 = r1.A01
            X.4DH r1 = r1.A00
            androidx.fragment.app.FragmentActivity r7 = r1.requireActivity()
            java.lang.Object r9 = r0.A01
            X.0eK r9 = (X.AnonymousClass0eK) r9
            java.lang.Object r10 = r0.A03
            X.0eK r10 = (X.AnonymousClass0eK) r10
            java.lang.Object r11 = r0.A02
            X.0sa r11 = (X.C62320sa) r11
            X.Acq r6 = new X.Acq
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x020d:
            java.lang.Object r2 = r0.A04
            X.9H6 r2 = (X.AnonymousClass9H6) r2
            X.4DH r1 = r2.A00
            androidx.fragment.app.FragmentActivity r7 = r1.requireActivity()
            com.instagram.common.session.UserSession r9 = r2.A01
            java.lang.Object r8 = r0.A01
            X.0iw r8 = (X.AnonymousClass0iw) r8
            com.instagram.direct.capabilities.Capabilities r10 = r2.A02
            java.lang.Integer r12 = r2.A03
            java.lang.Object r11 = r0.A02
            X.54L r11 = (X.AnonymousClass54L) r11
            java.lang.Object r1 = r0.A03
            r0 = 22
            X.PlY r13 = new X.PlY
            r13.<init>(r1, r0)
            X.74l r6 = new X.74l
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r6
        L_0x0234:
            java.lang.Object r4 = r0.A04
            X.7P7 r4 = (X.AnonymousClass7P7) r4
            com.instagram.common.session.UserSession r5 = r4.A07
            X.7Wl r6 = r4.A08
            java.lang.Object r3 = r0.A03
            X.7ZX r3 = (X.AnonymousClass7ZX) r3
            X.9HC r7 = r4.A09
            java.lang.Object r1 = r0.A01
            X.0eM r1 = (X.AnonymousClass0eM) r1
            java.lang.Object r2 = r1.getValue()
            X.7BA r2 = (X.AnonymousClass7BA) r2
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>"
            X.0qQ.A0C(r2, r1)
            java.lang.Object r8 = r0.A02
            X.7Pg r8 = (X.C331037Pg) r8
            X.0iw r1 = r4.A06
            r9 = 0
            r0 = 3
            X.0qQ.A0B(r3, r0)
            r0 = 5
            X.0qQ.A0B(r2, r0)
            r0 = 6
            X.0qQ.A0B(r8, r0)
            r0 = 7
            X.0qQ.A0B(r1, r0)
            X.74o r4 = new X.74o
            r10 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.PB5 r0 = X.C395159zJ.A00(r5, r6, r3, r7)
            X.NZX r6 = new X.NZX
            r6.<init>(r2, r4, r0)
            return r6
        L_0x0278:
            java.lang.Object r1 = r0.A04
            X.7P7 r1 = (X.AnonymousClass7P7) r1
            com.instagram.common.session.UserSession r4 = r1.A07
            X.7Wl r5 = r1.A08
            X.9HC r6 = r1.A09
            java.lang.Object r7 = r0.A02
            X.7Pg r7 = (X.C331037Pg) r7
            java.lang.Object r3 = r0.A03
            X.7ZX r3 = (X.AnonymousClass7ZX) r3
            java.lang.Object r0 = r0.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r2 = r0.getValue()
            X.7BA r2 = (X.AnonymousClass7BA) r2
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>"
            X.0qQ.A0C(r2, r0)
            X.0iw r1 = r1.A06
            r8 = 0
            r0 = 3
            X.0qQ.A0B(r7, r0)
            r0 = 4
            X.0qQ.A0B(r3, r0)
            r0 = 5
            X.0qQ.A0B(r2, r0)
            r0 = 6
            X.0qQ.A0B(r1, r0)
            X.PB5 r0 = X.C395159zJ.A00(r4, r5, r3, r6)
            X.74o r3 = new X.74o
            r9 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.NZC r6 = new X.NZC
            r6.<init>(r2, r0, r3)
            return r6
        L_0x02bc:
            java.lang.Object r3 = r0.A03
            android.content.ContentValues r3 = (android.content.ContentValues) r3
            java.lang.Object r5 = r0.A04
            X.2PC r5 = (X.2PC) r5
            com.instagram.common.session.UserSession r1 = r5.A00
            java.lang.String r2 = r1.A06
            java.lang.String r1 = "user_id"
            r3.put(r1, r2)
            java.lang.Object r4 = r0.A02
            X.3U9 r4 = (X.AnonymousClass3U9) r4
            java.lang.String r2 = r4.C6C()
            java.lang.String r1 = "thread_id"
            r3.put(r1, r2)
            java.util.List r2 = r4.BRZ()
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0315
            r2 = 0
        L_0x02e5:
            java.lang.String r1 = "recipient_ids"
            r3.put(r1, r2)
            long r1 = r4.BKd()
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "last_activity_time"
            r3.put(r1, r2)
            boolean r1 = r4.isPending()
            r1 = r1 ^ 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "is_permitted"
            r3.put(r1, r2)
            java.lang.Object r0 = r0.A01
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0
            byte[] r1 = r5.A0A(r0, r4)
            java.lang.String r0 = "thread_info"
            r3.put(r0, r1)
            goto L_0x092d
        L_0x0315:
            java.util.ArrayList r2 = com.instagram.model.direct.DirectThreadKey.A00(r2)
            java.util.Collections.sort(r2)
            java.lang.String r1 = ","
            java.lang.String r2 = X.0mp.A05(r1, r2)
            goto L_0x02e5
        L_0x0323:
            java.lang.Object r10 = r0.A02
            X.1Xj r10 = (X.1Xj) r10
            java.lang.Object r12 = r0.A03
            X.3W1 r12 = (X.AnonymousClass3W1) r12
            java.lang.Object r1 = r0.A04
            X.3hI r1 = (X.C248023hI) r1
            com.instagram.common.session.UserSession r7 = r1.A00
            java.lang.Object r11 = r0.A01
            X.4DU r11 = (X.AnonymousClass4DU) r11
            X.3kK r13 = r1.A01
            r8 = 0
            X.3fK r6 = new X.3fK
            r9 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r6
        L_0x033f:
            java.lang.Object r3 = r0.A02
            X.2V5 r3 = (X.2V5) r3
            java.lang.Object r2 = r0.A03
            X.2V5 r2 = (X.2V5) r2
            java.lang.Object r1 = r0.A01
            X.2V5 r1 = (X.2V5) r1
            java.lang.Object r0 = r0.A04
            X.3jM r0 = (X.C249243jM) r0
            X.3jZ r6 = new X.3jZ
            r6.<init>(r3, r2, r1, r0)
            return r6
        L_0x0355:
            java.lang.Object r1 = r0.A04
            X.3Yc r1 = (X.C243273Yc) r1
            X.3Yb r1 = r1.A01
            X.B1X r3 = r1.BRF()
            java.lang.Object r2 = r0.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r0.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            java.lang.Object r0 = r0.A03
            X.0iw r0 = (X.AnonymousClass0iw) r0
            java.lang.String r0 = r0.getModuleName()
            r3.Dzj(r2, r1, r0)
            goto L_0x092d
        L_0x0374:
            java.lang.Object r3 = r0.A04
            X.2rz r3 = (X.C231632rz) r3
            java.lang.Object r1 = r0.A01
            X.2rv r1 = (X.C231592rv) r1
            int r2 = r1.ordinal()
            java.lang.Object r1 = r0.A02
            java.lang.Object r0 = r0.A03
            int r0 = r3.getViewModelHash(r2, r1, r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            return r6
        L_0x038d:
            java.lang.Object r1 = r0.A03
            X.33Z r1 = (X.AnonymousClass33Z) r1
            X.0eM r1 = r1.A0P
            java.lang.Object r3 = r1.getValue()
            X.3go r3 = (X.C247723go) r3
            java.lang.Object r1 = r0.A04
            X.33W r1 = (X.AnonymousClass33W) r1
            android.content.Context r2 = r1.A00
            java.lang.Object r1 = r0.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r0.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.9IP r6 = r3.A00(r2, r1, r0)
            return r6
        L_0x03ac:
            java.lang.Object r1 = r0.A03
            X.33Z r1 = (X.AnonymousClass33Z) r1
            X.0eM r1 = r1.A05
            java.lang.Object r4 = r1.getValue()
            X.HqX r4 = (X.C55966HqX) r4
            java.lang.Object r3 = r0.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r0.A02
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            java.lang.Object r0 = r0.A04
            X.33W r0 = (X.AnonymousClass33W) r0
            X.4DU r1 = r0.A08
            X.3kK r0 = r0.A0C
            X.3ha r6 = r4.A00(r3, r1, r2, r0)
            return r6
        L_0x03cd:
            java.lang.Object r5 = r0.A03
            X.33Z r5 = (X.AnonymousClass33Z) r5
            X.0eM r1 = r5.A0S
            java.lang.Object r4 = r1.getValue()
            X.3Yd r4 = (X.C243283Yd) r4
            java.lang.Object r3 = r0.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r0.A02
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            java.lang.Object r0 = r0.A04
            X.33W r0 = (X.AnonymousClass33W) r0
            X.4DU r1 = r0.A08
            X.0eM r0 = r5.A0d
            java.lang.Object r0 = r0.getValue()
            X.3fU r0 = (X.C246943fU) r0
            boolean r0 = r0.A02(r3, r1, r2)
            X.3gj r6 = r4.A01(r3, r1, r2, r0)
            return r6
        L_0x03f8:
            java.lang.Object r1 = r0.A03
            X.33Z r1 = (X.AnonymousClass33Z) r1
            X.0eM r1 = r1.A0d
            java.lang.Object r3 = r1.getValue()
            X.3fU r3 = (X.C246943fU) r3
            java.lang.Object r2 = r0.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r0.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            java.lang.Object r0 = r0.A04
            X.33W r0 = (X.AnonymousClass33W) r0
            X.4DU r0 = r0.A08
            X.9Ib r6 = r3.A01(r2, r0, r1)
            return r6
        L_0x0417:
            java.lang.Object r1 = r0.A03
            X.33Z r1 = (X.AnonymousClass33Z) r1
            X.0eM r1 = r1.A0Z
            java.lang.Object r4 = r1.getValue()
            X.3Wu r4 = (X.C242943Wu) r4
            java.lang.Object r3 = r0.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r0.A02
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            java.lang.Object r0 = r0.A04
            X.33W r0 = (X.AnonymousClass33W) r0
            android.content.Context r1 = r0.A00
            X.4DU r0 = r0.A08
            X.9IZ r6 = X.C242943Wu.A00(r1, r3, r0, r4, r2)
            return r6
        L_0x0438:
            java.lang.Object r1 = r0.A03
            X.33Z r1 = (X.AnonymousClass33Z) r1
            X.3Yc r2 = r1.A00()
            java.lang.Object r1 = r0.A04
            X.33W r1 = (X.AnonymousClass33W) r1
            android.content.Context r3 = r1.A00
            java.lang.Object r5 = r0.A01
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r7 = r0.A02
            X.3W1 r7 = (X.AnonymousClass3W1) r7
            X.4DU r6 = r1.A08
            X.3fY r4 = new X.3fY
            r4.<init>(r3)
            X.3gM r6 = r2.A02(r3, r4, r5, r6, r7)
            return r6
        L_0x045a:
            java.lang.Object r1 = r0.A03
            X.33Z r1 = (X.AnonymousClass33Z) r1
            X.0eM r1 = r1.A0e
            java.lang.Object r3 = r1.getValue()
            X.A4C r3 = (X.A4C) r3
            java.lang.Object r2 = r0.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r0.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            int r6 = r1.getPosition()
            java.lang.Object r0 = r0.A04
            X.33W r0 = (X.AnonymousClass33W) r0
            X.4DU r4 = r0.A08
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.1Xy r0 = r2.A0C
            X.3xj r0 = r0.AsQ()
            r15 = 0
            if (r0 == 0) goto L_0x04e9
            com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf r0 = r0.BwB()
            if (r0 == 0) goto L_0x04e9
            X.GVk r12 = X.B7C.A00(r0)
        L_0x048f:
            X.1Xy r0 = r2.A0C
            X.3xj r0 = r0.AsQ()
            if (r0 == 0) goto L_0x049b
            com.instagram.model.showreel.IgShowreelComposition r15 = r0.Bw9()
        L_0x049b:
            com.instagram.common.session.UserSession r0 = r3.A00
            X.3Ye r5 = new X.3Ye
            r5.<init>(r0)
            r0 = 643(0x283, float:9.01E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.9J3 r10 = r5.A00(r2, r4, r1, r0)
            r0 = 42
            X.Inr r7 = new X.Inr
            r7.<init>(r0, r3, r2)
            r0 = 18
            X.JGO r5 = new X.JGO
            r5.<init>((int) r6, (int) r0, (java.lang.Object) r2, (java.lang.Object) r1)
            r0 = 31
            X.J6H r9 = new X.J6H
            r9.<init>(r1, r0)
            r0 = 32
            X.Inz r6 = new X.Inz
            r6.<init>(r0, r2, r3, r1)
            r17 = 49
            X.IxG r8 = new X.IxG
            r16 = r8
            r18 = r2
            r19 = r3
            r20 = r1
            r21 = r4
            r16.<init>(r17, r18, r19, r20, r21)
            r4 = 4
            X.GnX r3 = new X.GnX
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.9Ij r6 = new X.9Ij
            r9 = r6
            r11 = r3
            r13 = r2
            r14 = r1
            r9.<init>((X.AnonymousClass9J3) r10, (X.C53400GnX) r11, (X.AnonymousClass6L7) r12, (X.1Xj) r13, (X.AnonymousClass3W1) r14, (com.instagram.model.showreel.IgShowreelComposition) r15)
            return r6
        L_0x04e9:
            r12 = r15
            goto L_0x048f
        L_0x04eb:
            java.lang.Object r1 = r0.A03
            X.33Z r1 = (X.AnonymousClass33Z) r1
            X.0eM r1 = r1.A0j
            java.lang.Object r1 = r1.getValue()
            X.3pt r1 = (X.C252903pt) r1
            java.lang.Object r4 = r0.A01
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r6 = r0.A02
            X.3W1 r6 = (X.AnonymousClass3W1) r6
            java.lang.Object r0 = r0.A04
            X.33W r0 = (X.AnonymousClass33W) r0
            android.content.Context r2 = r0.A00
            X.5DR r3 = new X.5DR
            r3.<init>(r2)
            X.4DU r5 = r0.A08
            X.9If r6 = r1.A01(r2, r3, r4, r5, r6)
            return r6
        L_0x0511:
            java.lang.Object r1 = r0.A03
            X.33Z r1 = (X.AnonymousClass33Z) r1
            X.0eM r1 = r1.A09
            java.lang.Object r3 = r1.getValue()
            X.3Yh r3 = (X.C243323Yh) r3
            java.lang.Object r1 = r0.A04
            X.33W r1 = (X.AnonymousClass33W) r1
            android.content.Context r2 = r1.A00
            java.lang.Object r1 = r0.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r0.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.JwM r6 = r3.A00(r2, r1, r0)
            return r6
        L_0x0530:
            java.lang.Object r5 = r0.A04
            X.33s r5 = (X.C2364333s) r5
            java.lang.Object r4 = r0.A01
            java.lang.Object r1 = r0.A02
            java.lang.Object r3 = r0.A03
            java.lang.Object r2 = r5.A01(r1)
            java.util.concurrent.ConcurrentHashMap r1 = r5.A01
            X.4Fd r0 = new X.4Fd
            r0.<init>(r2, r3)
            r1.put(r4, r0)
            goto L_0x092d
        L_0x054a:
            java.lang.Object r7 = r0.A01
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r9 = r0.A03
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            java.lang.Object r1 = r0.A04
            X.334 r1 = (X.AnonymousClass334) r1
            X.4DU r12 = r1.A04
            X.07Z r8 = r1.A00
            java.lang.Object r0 = r0.A02
            X.311 r0 = (X.AnonymousClass311) r0
            X.3ys r1 = r0.AZ8()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.A4B r10 = new X.A4B
            r10.<init>(r1)
            X.3yy r11 = new X.3yy
            r11.<init>()
            X.HFh r6 = new X.HFh
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x0576:
            java.lang.Object r6 = r0.A04
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            X.1Av r1 = X.1Au.A00(r6)
            X.0xa r1 = r1.A01
            X.0xY r2 = r1.AR4()
            r1 = 3234(0xca2, float:4.532E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4 = 1
            r2.E5T(r1, r4)
            r2.apply()
            r3 = 0
            java.lang.String r7 = X.C228022kf.A00(r3)
            java.lang.Object r2 = r0.A01
            X.0iw r2 = (X.AnonymousClass0iw) r2
            java.lang.Object r5 = r0.A02
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r0 = r0.A03
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            int r0 = r0.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.0qQ.A0B(r2, r4)
            X.0wc r0 = X.AnonymousClass0kN.A01(r2, r6)
            X.1Ln r4 = X.1Ln.A02(r0)
            X.0Aj r0 = r4.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x092d
            r6 = 0
            if (r5 == 0) goto L_0x05f3
            if (r1 == 0) goto L_0x05f3
            int r0 = r1.intValue()
            java.util.List r0 = X.I7Q.A01(r5, r0)
            if (r0 == 0) goto L_0x05f3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x05d7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x05f3
            java.lang.Object r0 = r2.next()
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            java.lang.String r1 = r0.A0H
            if (r1 == 0) goto L_0x05d7
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
            if (r0 == 0) goto L_0x05d7
            r3.add(r0)
            goto L_0x05d7
        L_0x05f3:
            java.lang.String r2 = "extra_ui"
            java.lang.String r1 = "wishlist_tagged_media_nux"
            X.0eP r0 = new X.0eP
            r0.<init>(r2, r1)
            java.util.Map r2 = X.0se.A0M(r0)
            r0 = 55
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A0R(r0, r7)
            X.V1Z r1 = X.V1Z.NUX_TOOLTIP
            r0 = 2595(0xa23, float:3.636E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A0M(r1, r0)
            X.V1X r1 = X.V1X.POSTS_FEED
            r0 = 2597(0xa25, float:3.639E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A0M(r1, r0)
            X.V1Y r1 = X.V1Y.TAGGED_MEDIA
            java.lang.String r0 = "analytics_module"
            r4.A0M(r1, r0)
            java.lang.String r1 = "instagram_wishlist_save_to_collections_nux_impression"
            r0 = 2979(0xba3, float:4.174E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.A0R(r0, r1)
            if (r5 == 0) goto L_0x0637
            java.lang.String r6 = r5.getId()
        L_0x0637:
            r4.A0m(r6)
            r0 = 746(0x2ea, float:1.045E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A0S(r0, r3)
            r4.A0x(r2)
            r4.Cgf()
            goto L_0x092d
        L_0x064b:
            java.lang.Object r3 = r0.A01
            X.3fJ r3 = (X.C246833fJ) r3
            java.lang.Object r2 = r0.A03
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r0.A04
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            java.lang.Object r0 = r0.A02
            X.4DU r0 = (X.AnonymousClass4DU) r0
            r3.DF5(r2, r0, r1)
            goto L_0x092d
        L_0x0660:
            X.3Xs r4 = X.C243173Xr.A04
            java.lang.Object r1 = r0.A04
            X.3Xr r1 = (X.C243173Xr) r1
            com.instagram.common.session.UserSession r3 = r1.A00
            java.lang.Object r2 = r0.A02
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r0.A03
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            java.lang.Object r0 = r0.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            java.lang.String r0 = r0.getModuleName()
            boolean r0 = r4.A01(r3, r2, r1, r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x0681:
            java.lang.Object r2 = r0.A04
            X.33e r2 = (X.C2362933e) r2
            X.33Z r1 = r2.A05
            X.0eM r1 = r1.A0K
            java.lang.Object r3 = r1.getValue()
            X.4U7 r3 = (X.AnonymousClass4U7) r3
            java.lang.Object r5 = r0.A01
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r7 = r0.A02
            X.3W1 r7 = (X.AnonymousClass3W1) r7
            java.lang.Object r0 = r0.A03
            android.view.View r0 = (android.view.View) r0
            android.content.Context r4 = r0.getContext()
            X.0qQ.A07(r4)
            X.2xS r8 = r2.A08
            X.4DU r6 = r2.A06
            X.4WX r6 = r3.A01(r4, r5, r6, r7, r8)
            return r6
        L_0x06ab:
            java.lang.Object r4 = r0.A04
            X.33e r4 = (X.C2362933e) r4
            X.33Z r1 = r4.A05
            X.0eM r1 = r1.A0E
            java.lang.Object r3 = r1.getValue()
            X.A6n r3 = (X.C39722A6n) r3
            java.lang.Object r8 = r0.A01
            X.1Xj r8 = (X.1Xj) r8
            java.lang.Object r11 = r0.A02
            X.3W1 r11 = (X.AnonymousClass3W1) r11
            X.0sL r1 = r4.A0D
            java.lang.Object r10 = r1.invoke(r8, r11)
            X.3YB r10 = (X.AnonymousClass3YB) r10
            X.2xS r2 = r4.A08
            java.lang.Object r0 = r0.A03
            android.view.View r0 = (android.view.View) r0
            android.content.Context r5 = r0.getContext()
            X.0qQ.A07(r5)
            X.4DU r9 = r4.A06
            java.lang.Integer r12 = r4.A0A
            X.57L r7 = r4.A03
            X.0xF r6 = r4.A01
            java.lang.String r13 = r4.A0B
            boolean r1 = r4.A0E
            X.3kK r0 = r4.A09
            X.AnonymousClass7TG.A1T(r8, r11, r10)
            X.3Wz r4 = r3.A02
            X.9Ib r4 = r4.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.3dW r12 = r3.A03
            r13 = r5
            r14 = r8
            r15 = r9
            r16 = r11
            r17 = r2
            X.3et r2 = r12.A00(r13, r14, r15, r16, r17)
            X.3Yi r6 = r3.A01
            r7 = r5
            r10 = r11
            r11 = r0
            r12 = r1
            X.3hT r1 = r6.A01(r7, r8, r9, r10, r11, r12)
            r0 = 41
            X.JwM r6 = new X.JwM
            r6.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r4, (java.lang.Object) r2)
            return r6
        L_0x070c:
            java.lang.Object r2 = r0.A04
            X.33e r2 = (X.C2362933e) r2
            X.33Z r1 = r2.A05
            X.0eM r1 = r1.A0D
            java.lang.Object r3 = r1.getValue()
            X.3Wz r3 = (X.C242993Wz) r3
            java.lang.Object r7 = r0.A01
            X.1Xj r7 = (X.1Xj) r7
            java.lang.Object r10 = r0.A02
            X.3W1 r10 = (X.AnonymousClass3W1) r10
            X.0sL r1 = r2.A0D
            java.lang.Object r9 = r1.invoke(r7, r10)
            X.3YB r9 = (X.AnonymousClass3YB) r9
            java.lang.Object r0 = r0.A03
            android.view.View r0 = (android.view.View) r0
            android.content.Context r4 = r0.getContext()
            X.0qQ.A07(r4)
            X.4DU r8 = r2.A06
            java.lang.Integer r11 = r2.A0A
            X.57L r6 = r2.A03
            X.0xF r5 = r2.A01
            java.lang.String r12 = r2.A0B
            X.9Ib r6 = r3.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r6
        L_0x0744:
            java.lang.Object r2 = r0.A04
            X.33e r2 = (X.C2362933e) r2
            X.33Z r1 = r2.A05
            X.0eM r1 = r1.A0a
            java.lang.Object r3 = r1.getValue()
            X.3dW r3 = (X.C245813dW) r3
            java.lang.Object r5 = r0.A01
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r7 = r0.A02
            X.3W1 r7 = (X.AnonymousClass3W1) r7
            X.2xS r8 = r2.A08
            java.lang.Object r0 = r0.A03
            android.view.View r0 = (android.view.View) r0
            android.content.Context r4 = r0.getContext()
            X.0qQ.A07(r4)
            X.4DU r6 = r2.A06
            X.3et r6 = r3.A00(r4, r5, r6, r7, r8)
            return r6
        L_0x076e:
            java.lang.Object r10 = r0.A02
            X.1Xj r10 = (X.1Xj) r10
            java.lang.Object r12 = r0.A03
            X.3W1 r12 = (X.AnonymousClass3W1) r12
            java.lang.Object r1 = r0.A04
            X.3dW r1 = (X.C245813dW) r1
            com.instagram.common.session.UserSession r7 = r1.A00
            java.lang.Object r11 = r0.A01
            X.4DU r11 = (X.AnonymousClass4DU) r11
            X.3kK r13 = r1.A03
            r8 = 0
            X.3fK r6 = new X.3fK
            r9 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r6
        L_0x078a:
            X.4jJ r4 = X.C271614jJ.A00
            java.lang.Object r1 = r0.A04
            X.3dW r1 = (X.C245813dW) r1
            com.instagram.common.session.UserSession r3 = r1.A00
            java.lang.Object r2 = r0.A02
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r0.A03
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            java.lang.Object r0 = r0.A01
            X.4DU r0 = (X.AnonymousClass4DU) r0
            X.50X r6 = r4.A00(r3, r2, r0, r1)
            return r6
        L_0x07a3:
            java.lang.Object r3 = r0.A02
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r0.A03
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            java.lang.Object r1 = r0.A04
            X.3dW r1 = (X.C245813dW) r1
            com.instagram.common.session.UserSession r1 = r1.A00
            java.lang.Object r0 = r0.A01
            X.4DU r0 = (X.AnonymousClass4DU) r0
            X.9J0 r6 = X.C262724Ft.A00(r1, r3, r0, r2)
            return r6
        L_0x07ba:
            java.lang.Object r1 = r0.A04
            X.3dW r1 = (X.C245813dW) r1
            X.0eM r1 = r1.A05
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r0.A02
            java.lang.Object r3 = r0.A03
            java.lang.Object r4 = r0.A01
            X.4DU r4 = (X.AnonymousClass4DU) r4
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            r0 = 2
            X.0qQ.A0B(r4, r0)
            X.2kQ r0 = X.C227942kP.A00(r4)
            r5 = 30
            X.9MR r6 = new X.9MR
            r7 = r5
            r8 = r3
            r9 = r2
            r10 = r1
            r11 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            r4 = 18
            X.9ME r7 = new X.9ME
            r7.<init>(r4, r0, r2, r1)
            X.3fm r8 = X.C247103fm.A00
            r4 = 28
            X.9Ls r9 = new X.9Ls
            r9.<init>(r4, r1, r2)
            r4 = 29
            X.9Ls r10 = new X.9Ls
            r10.<init>(r4, r1, r2)
            X.9Ls r11 = new X.9Ls
            r11.<init>(r5, r1, r2)
            r4 = 24
            X.9MC r14 = new X.9MC
            r14.<init>(r4, r2, r0, r1)
            r4 = 25
            X.9MC r15 = new X.9MC
            r15.<init>(r4, r2, r0, r1)
            r5 = 8
            X.9Lv r4 = new X.9Lv
            r4.<init>(r5, r1, r2)
            r18 = 10
            X.9MQ r17 = new X.9MQ
            r20 = r2
            r21 = r3
            r22 = r1
            r19 = r0
            r17.<init>(r18, r19, r20, r21, r22)
            r19 = 11
            X.9MQ r18 = new X.9MQ
            r20 = r0
            r21 = r2
            r22 = r3
            r23 = r1
            r18.<init>(r19, r20, r21, r22, r23)
            r0 = 26
            X.9Ls r12 = new X.9Ls
            r12.<init>(r0, r1, r2)
            r0 = 27
            X.9Ls r13 = new X.9Ls
            r13.<init>(r0, r1, r2)
            X.3fo r5 = new X.3fo
            r16 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = 20
            X.9IE r6 = new X.9IE
            r6.<init>((java.lang.Object) r5, (int) r0)
            return r6
        L_0x0854:
            java.lang.Object r1 = r0.A04
            X.3Wu r1 = (X.C242943Wu) r1
            java.lang.Object r6 = r0.A01
            X.1Xj r6 = (X.1Xj) r6
            java.lang.Object r7 = r0.A02
            X.3W1 r7 = (X.AnonymousClass3W1) r7
            java.lang.Object r2 = r0.A03
            X.4DU r2 = (X.AnonymousClass4DU) r2
            X.2kQ r3 = X.C227942kP.A00(r2)
            X.3kK r0 = r1.A03
            r10 = 0
            if (r0 == 0) goto L_0x08a7
            java.lang.String r9 = r0.getSessionId()
        L_0x0871:
            boolean r0 = r2 instanceof X.C232682uF
            if (r0 == 0) goto L_0x08a5
            X.2uF r2 = (X.C232682uF) r2
            X.0jB r0 = r2.E4l(r6)
            X.0xF r4 = r0.A00()
        L_0x087f:
            r0 = 3966(0xf7e, float:5.558E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            r7.A1V = r8
            com.instagram.common.session.UserSession r5 = r1.A00
            boolean r0 = r7.A0p()
            if (r0 == 0) goto L_0x08a3
            int r13 = r7.getPosition()
        L_0x0893:
            boolean r14 = r7.A2a
            r11 = r10
            r12 = r10
            X.I7O.A04(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.32i r1 = r1.A01
            X.3WA r0 = X.AnonymousClass3WA.ORGANIC_SHOW_LESS
            r1.DJB(r10, r6, r0, r7)
            goto L_0x092d
        L_0x08a3:
            r13 = -1
            goto L_0x0893
        L_0x08a5:
            r4 = r10
            goto L_0x087f
        L_0x08a7:
            r9 = r10
            goto L_0x0871
        L_0x08a9:
            java.lang.Object r1 = r0.A04
            X.3eL r1 = (X.C246293eL) r1
            com.instagram.common.session.UserSession r1 = r1.A00
            java.lang.Object r5 = r0.A02
            X.0iw r5 = (X.AnonymousClass0iw) r5
            java.lang.Object r3 = r0.A03
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r4 = r0.A01
            X.3W1 r4 = (X.AnonymousClass3W1) r4
            r0 = 1
            X.0qQ.A0B(r5, r0)
            r0 = 2
            X.0qQ.A0B(r3, r0)
            r0 = 3
            X.0qQ.A0B(r4, r0)
            X.0wc r2 = X.AnonymousClass0kN.A01(r5, r1)
            java.lang.String r1 = "ig_interest_pivot_impression"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x092d
            java.lang.String r1 = r5.getModuleName()
            java.lang.String r0 = "module"
            r2.AAJ(r0, r1)
            X.1Xy r0 = r3.A0C
            java.lang.String r1 = r0.BIl()
            if (r1 != 0) goto L_0x08ec
            java.lang.String r1 = ""
        L_0x08ec:
            java.lang.String r0 = "inventory_source"
            r2.AAJ(r0, r1)
            X.1Xy r0 = r3.A0C
            java.lang.String r1 = r0.getLoggingInfoToken()
            java.lang.String r0 = "ranking_info_token"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A0R
            r0 = 150(0x96, float:2.1E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.AAJ(r0, r1)
            int r0 = r4.A0W
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "recs_ix"
            r2.A9F(r0, r1)
            int r0 = r4.getPosition()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "m_ix"
            r2.A9F(r0, r1)
            java.lang.String r1 = r3.getId()
            java.lang.String r0 = "m_pk"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x092d:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0930:
            java.lang.Object r7 = r0.A01
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object r1 = r0.A04
            X.2rB r1 = (X.AnonymousClass2rB) r1
            com.instagram.common.session.UserSession r10 = r1.A00
            X.4DU r9 = r1.A01
            java.lang.Object r11 = r0.A02
            X.2or r11 = (X.C230062or) r11
            java.lang.Object r12 = r0.A03
            X.2os r12 = (X.C230072os) r12
            X.2sC r6 = new X.2sC
            r8 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x094b:
            java.lang.Object r1 = r0.A04
            X.2rB r1 = (X.AnonymousClass2rB) r1
            com.instagram.common.session.UserSession r10 = r1.A00
            java.lang.Object r7 = r0.A01
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r8 = r0.A02
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            X.4DU r9 = r1.A01
            java.lang.Object r11 = r0.A03
            X.2r9 r11 = (X.AnonymousClass2r9) r11
            X.2sM r6 = new X.2sM
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x0965:
            java.lang.Object r7 = r0.A01
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r1 = r0.A04
            X.2rB r1 = (X.AnonymousClass2rB) r1
            com.instagram.common.session.UserSession r9 = r1.A00
            X.4DU r8 = r1.A01
            java.lang.Object r10 = r0.A03
            X.2ql r10 = (X.C231032ql) r10
            java.lang.Object r0 = r0.A02
            X.2oF r0 = (X.C229792oF) r0
            java.lang.Integer r11 = r0.A00
            r12 = 0
            X.2tu r6 = new X.2tu
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x0982:
            java.lang.Object r1 = r0.A04
            X.2rB r1 = (X.AnonymousClass2rB) r1
            com.instagram.common.session.UserSession r3 = r1.A00
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.A02
            X.2os r1 = (X.C230072os) r1
            java.lang.Object r0 = r0.A03
            X.2r8 r0 = (X.AnonymousClass2r8) r0
            X.2sL r6 = new X.2sL
            r6.<init>(r2, r3, r0, r1)
            return r6
        L_0x099a:
            java.lang.Object r1 = r0.A04
            X.2rB r1 = (X.AnonymousClass2rB) r1
            com.instagram.common.session.UserSession r10 = r1.A00
            java.lang.Object r7 = r0.A01
            androidx.fragment.app.FragmentActivity r7 = (androidx.fragment.app.FragmentActivity) r7
            java.lang.Object r11 = r0.A03
            X.2os r11 = (X.C230072os) r11
            java.lang.Object r8 = r0.A02
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            r12 = 1
            r0 = 746(0x2ea, float:1.045E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0xG r9 = new X.0xG
            r9.<init>(r0)
            X.2sN r6 = new X.2sN
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x09be:
            r2.drawBitmap(r5, r0, r0, r3)     // Catch:{ OutOfMemoryError -> 0x09c2 }
            return r6
        L_0x09c2:
            r2 = move-exception
            java.lang.String r1 = "VideoSendingController"
            java.lang.String r0 = "#getScaledMediaScreenshot_OOM"
            java.lang.String r1 = X.002.A0R(r1, r0)
            X.0sm r0 = X.0Yt.A0E()
            X.0kD.A0I(r1, r2, r0)
            return r3
        L_0x09d3:
            r1 = 140(0x8c, float:1.96E-43)
        L_0x09d5:
            int r1 = r1 * r6
            int r0 = r5.A01
            int r2 = r5.A00
            int r0 = r0 + r2
            int r0 = r0 + r1
            int r1 = r0 + 150
            int r0 = r5.A02
            int r1 = r1 - r0
            if (r1 > 0) goto L_0x09e5
            int r1 = r2 / 2
        L_0x09e5:
            int r6 = -r1
            int r6 = r6 - r2
            X.3XH r0 = r4.A03
            if (r0 == 0) goto L_0x0a23
            X.2Sn r0 = r0.A02
            android.view.View r5 = r0.BUI()
            if (r5 == 0) goto L_0x0a23
            boolean r0 = r5 instanceof com.facebook.litho.LithoView
            if (r0 == 0) goto L_0x0a23
            com.facebook.litho.LithoView r5 = (com.facebook.litho.LithoView) r5
            X.2T4 r1 = r5.getMountedLayoutState()
            if (r1 == 0) goto L_0x0a23
            X.3mp r0 = r4.A01
            if (r0 == 0) goto L_0x0a23
            java.lang.String r4 = r4.A08()
            X.AnonymousClass2VL.A00()
            java.util.Map r0 = r1.A0U
            java.lang.Object r2 = r0.get(r4)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L_0x0a2f
            if (r2 == 0) goto L_0x0a2f
            int r1 = r2.left
            int r1 = r1 + r7
            int r0 = r2.bottom
            int r0 = r0 + r6
            r3.showAsDropDown(r5, r1, r0)
        L_0x0a23:
            r1 = 0
            X.Iom r0 = new X.Iom
            r0.<init>(r1)
            X.3dj r3 = new X.3dj
            r3.<init>(r0)
        L_0x0a2e:
            return r3
        L_0x0a2f:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.String r1 = "Cannot find a component with key "
            java.lang.String r0 = " to use as anchor."
            java.lang.String r1 = X.002.A0g(r1, r4, r0)
            java.lang.String r0 = "LithoTooltipController:InvalidKey"
            X.2W6.A01(r0, r2, r1)
            goto L_0x0a23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9MR.invoke():java.lang.Object");
    }
}
