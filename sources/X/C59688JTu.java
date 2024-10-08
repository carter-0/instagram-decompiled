package X;

import java.util.concurrent.Callable;

/* renamed from: X.JTu  reason: case insensitive filesystem */
public final class C59688JTu extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59688JTu(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, AnonymousClass4D7 r7, int i, boolean z) {
        super(2, r7);
        this.A02 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A05 = obj3;
        this.A07 = z;
        this.A06 = obj4;
        this.A04 = obj5;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.JTu, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        boolean z;
        int i;
        AnonymousClass4D7 r7 = r13;
        switch (this.A02) {
            case 0:
                boolean z2 = this.A07;
                C59688JTu jTu = new C59688JTu((C251983oI) this.A05, (Callable) this.A04, r7, (02o) this.A03, (String[]) this.A06, z2);
                jTu.A01 = obj;
                return jTu;
            case 1:
                obj6 = this.A01;
                obj2 = this.A03;
                obj3 = this.A05;
                z = this.A07;
                obj4 = this.A06;
                obj5 = this.A04;
                i = 1;
                break;
            case 2:
                obj2 = this.A03;
                obj3 = this.A05;
                obj4 = this.A06;
                obj5 = this.A04;
                obj6 = this.A01;
                z = this.A07;
                i = 2;
                break;
            default:
                obj6 = this.A01;
                obj3 = this.A05;
                obj2 = this.A03;
                z = this.A07;
                obj5 = this.A04;
                obj4 = this.A06;
                i = 3;
                break;
        }
        return new C59688JTu(obj6, obj2, obj3, obj4, obj5, r7, i, z);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.JTu, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x012c, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x023b, code lost:
        if (r0 != r1) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x023d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x023e, code lost:
        X.0eS.A00(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            r5 = r24
            int r1 = r0.A02
            switch(r1) {
                case 0: goto L_0x01ab;
                case 1: goto L_0x0210;
                case 2: goto L_0x024b;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r3 = 1
            java.lang.String r9 = "userSession"
            if (r1 == 0) goto L_0x0192
            X.0eS.A00(r5)
        L_0x0015:
            X.3Ii r5 = (X.C239803Ii) r5
            java.lang.Object r2 = r0.A01
            X.6ZN r2 = (X.AnonymousClass6ZN) r2
            java.lang.Object r13 = r0.A05
            android.content.Context r13 = (android.content.Context) r13
            java.lang.Object r11 = r0.A03
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r6 = r0.A07
            java.lang.Object r12 = r0.A04
            X.LdC r12 = (X.C64510LdC) r12
            java.lang.Object r4 = r0.A06
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0189
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r7 = r5.A00
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            com.instagram.common.session.UserSession r5 = r2.A01
            if (r5 == 0) goto L_0x0243
            X.0Tu r3 = X.0Tu.A06
            r0 = 36323603574172981(0x810c2000002d35, double:3.0345313914941126E-306)
            boolean r5 = X.DbY.A1Y(r3, r5, r0)
            boolean r3 = X.AnonymousClass7TG.A1X(r7)
            java.lang.String r0 = X.AnonymousClass7TG.A0j()
            r1 = 642(0x282, float:9.0E-43)
            java.lang.String r15 = X.AnonymousClass000.A00(r1)
            if (r5 == 0) goto L_0x012d
            if (r3 == 0) goto L_0x012d
        L_0x0056:
            com.instagram.common.session.UserSession r1 = r2.A01
            if (r1 == 0) goto L_0x0243
            r14 = 0
            X.LRq.A02(r1, r15, r14)
            com.instagram.common.session.UserSession r1 = r2.A01
            if (r1 == 0) goto L_0x0243
            X.LRq.A01(r1, r15)
            android.widget.FrameLayout$LayoutParams r3 = X.JTR.A0Y()
            android.content.res.Resources r4 = r13.getResources()
            r1 = 2131165287(0x7f070067, float:1.7944787E38)
            int r6 = r4.getDimensionPixelSize(r1)
            android.content.res.Resources r4 = r13.getResources()
            r1 = 2131165204(0x7f070014, float:1.7944619E38)
            int r5 = r4.getDimensionPixelSize(r1)
            X.8ab r7 = X.DbS.A0X(r11)
            com.instagram.ui.widget.stackedavatar.StackedAvatarView r8 = new com.instagram.ui.widget.stackedavatar.StackedAvatarView
            r8.<init>(r13)
            int r1 = X.JTR.A09(r13)
            r8.A01 = r1
            int r1 = X.JTR.A08(r13)
            r8.A00 = r1
            r1 = 2131165232(0x7f070030, float:1.7944675E38)
            r8.A04(r13, r1)
            com.instagram.common.session.UserSession r1 = r2.A01
            if (r1 == 0) goto L_0x0243
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r1)
            com.instagram.common.typedurl.ImageUrl r4 = r1.Bh3()
            X.0iw r1 = r2.A0D
            r8.setBackAvatarUrl(r4, r1)
            r17 = 2131165230(0x7f07002e, float:1.7944671E38)
            r1 = 2131237505(0x7f081a81, float:1.8091262E38)
            android.graphics.drawable.Drawable r15 = r13.getDrawable(r1)
            r4 = 0
            r21 = 1528(0x5f8, float:2.141E-42)
            X.Jbk r12 = new X.Jbk
            r16 = r14
            r18 = r4
            r19 = r4
            r20 = r4
            r22 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r8.setFrontAvatarDrawable(r12)
            r8.setLayoutParams(r3)
            android.content.res.Resources r3 = r13.getResources()
            r1 = 2131165287(0x7f070067, float:1.7944787E38)
            int r1 = r3.getDimensionPixelSize(r1)
            r8.setPadding(r4, r1, r4, r4)
            r7.A0k(r8)
            r1 = 2131964390(0x7f1331e6, float:1.956556E38)
            r7.A09(r1)
            r1 = 2131964396(0x7f1331ec, float:1.9565572E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r13, r1)
            r1 = 2131964395(0x7f1331eb, float:1.956557E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r13, r1)
            r1 = 59
            X.LV0 r1 = X.LV0.A00(r13, r2, r1)
            r7.A0Z(r1, r3, r4)
            r4 = 2131964392(0x7f1331e8, float:1.9565564E38)
            r3 = 12
            X.LV1 r1 = new X.LV1
            r1.<init>((java.lang.String) r0, (java.lang.Object) r2, (int) r3)
            r7.A0I(r1, r4)
            r4 = 2131964393(0x7f1331e9, float:1.9565566E38)
            r3 = 13
            X.LV1 r1 = new X.LV1
            r1.<init>((java.lang.String) r0, (java.lang.Object) r2, (int) r3)
            r7.A0G(r1, r4)
            r4 = 2131964391(0x7f1331e7, float:1.9565562E38)
            r3 = 14
            X.LV1 r1 = new X.LV1
            r1.<init>((java.lang.String) r0, (java.lang.Object) r2, (int) r3)
            r7.A0H(r1, r4)
            com.instagram.igds.components.headline.IgdsHeadline r0 = r7.A0Z
            r0.setPadding(r6, r5, r6, r6)
            X.DbT.A1V(r7)
        L_0x012a:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x012d:
            com.instagram.common.session.UserSession r1 = r2.A01
            if (r1 == 0) goto L_0x0243
            X.LRq.A02(r1, r15, r0)
            if (r3 == 0) goto L_0x013a
            if (r5 == 0) goto L_0x013a
            goto L_0x0056
        L_0x013a:
            com.instagram.common.session.UserSession r5 = r2.A01
            if (r5 == 0) goto L_0x0243
            r1 = 20
            X.Phb r3 = new X.Phb
            r3.<init>(r5, r1)
            java.lang.Class<X.OyW> r1 = X.C72206OyW.class
            java.lang.Object r1 = r5.A01(r1, r3)
            X.OyW r1 = (X.C72206OyW) r1
            boolean r1 = r1.A00()
            if (r1 != 0) goto L_0x0171
            if (r6 != 0) goto L_0x0171
            com.instagram.common.session.UserSession r3 = r2.A01
            if (r3 == 0) goto L_0x0243
            r0 = 61
            X.LV2 r10 = X.LV2.A00(r4, r0)
            r1 = 5
            X.I9G r0 = new X.I9G
            r0.<init>(r1, r4, r2)
            java.lang.String r14 = "ig_stories_consumption"
            r16 = 2131956848(0x7f131470, float:1.9550263E38)
            r9 = r11
            r11 = r0
            r13 = r3
            X.C48368EdP.A00(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x012a
        L_0x0171:
            X.GUi r10 = X.C63556Kz5.A01
            com.instagram.common.session.UserSession r13 = r2.A01
            if (r13 == 0) goto L_0x0243
            r16 = 0
            java.lang.String r14 = "ig_stories_consumption"
            r20 = 0
            r17 = r0
            r18 = r16
            r19 = r16
            r21 = r20
            r10.A03(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x012a
        L_0x0189:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x012a
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0192:
            X.0eS.A00(r5)
            java.lang.Object r1 = r0.A01
            X.6ZN r1 = (X.AnonymousClass6ZN) r1
            com.instagram.common.session.UserSession r2 = r1.A01
            if (r2 == 0) goto L_0x0243
            com.instagram.avatars.graphql.InstantAvatarsGraphQLRepository r1 = new com.instagram.avatars.graphql.InstantAvatarsGraphQLRepository
            r1.<init>(r2)
            r0.A00 = r3
            java.lang.Object r5 = r1.A00(r0)
            if (r5 != r4) goto L_0x0015
            return r4
        L_0x01ab:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 != 0) goto L_0x023e
            X.0eS.A00(r5)
            java.lang.Object r6 = r0.A01
            X.4Cq r6 = (X.C262224Cq) r6
            r13 = 0
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.3Eu r12 = new X.3Eu
            r12.<init>(r4, r2)
            java.lang.Object r2 = r0.A06
            java.lang.String[] r2 = (java.lang.String[]) r2
            X.5qh r9 = new X.5qh
            r9.<init>(r12, r2)
            X.0gF r2 = X.C60340gF.A00
            r12.FIG(r2)
            X.4Cc r3 = r6.ArX()
            X.1t6 r2 = X.1t5.A02
            X.4Cb r2 = r3.get(r2)
            X.1t5 r2 = (X.1t5) r2
            if (r2 == 0) goto L_0x01e3
            X.4Cd r2 = r2.A01
            if (r2 != 0) goto L_0x01ef
        L_0x01e3:
            boolean r3 = r0.A07
            java.lang.Object r2 = r0.A05
            X.3oI r2 = (X.C251983oI) r2
            if (r3 == 0) goto L_0x020b
            X.4CZ r2 = X.C252763pf.A01(r2)
        L_0x01ef:
            X.1HR r8 = X.JTQ.A0o()
            java.lang.Object r10 = r0.A05
            java.lang.Object r11 = r0.A04
            r14 = 2
            X.JTw r7 = new X.JTw
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (X.AnonymousClass4D7) r13, (int) r14)
            X.1Eo.A03(r5, r2, r7, r6)
            java.lang.Object r2 = r0.A03
            X.02o r2 = (X.02o) r2
            r0.A00 = r4
            java.lang.Object r0 = X.0u9.A00(r0, r8, r2)
            goto L_0x023b
        L_0x020b:
            X.4CZ r2 = X.C252763pf.A00(r2)
            goto L_0x01ef
        L_0x0210:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 != 0) goto L_0x023e
            X.0eS.A00(r5)
            java.lang.Object r7 = r0.A01
            com.instagram.comments.mvvm.data.MediaCommentListRepository r7 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r7
            java.lang.Object r8 = r0.A03
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Object r5 = r0.A05
            java.util.Set r5 = (java.util.Set) r5
            boolean r4 = r0.A07
            java.lang.Object r3 = r0.A06
            X.0sJ r3 = (X.0sJ) r3
            java.lang.Object r2 = r0.A04
            X.0sa r2 = (X.C62320sa) r2
            r0.A00 = r6
            r9 = r5
            r10 = r0
            r11 = r2
            r12 = r3
            r13 = r4
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A07(r7, r8, r9, r10, r11, r12, r13)
        L_0x023b:
            if (r0 != r1) goto L_0x012a
            return r1
        L_0x023e:
            X.0eS.A00(r5)
            goto L_0x012a
        L_0x0243:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x024b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x027f
            X.0eS.A00(r5)
        L_0x0255:
            java.lang.Object r2 = r0.A03
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r2 = (com.instagram.settings2.core.viewmodel.SettingsScreenViewModel) r2
            java.lang.Object r1 = r0.A05
            X.XQw r1 = (X.C21251XQw) r1
            java.lang.Object r0 = r0.A06
            X.XRY r0 = (X.XRY) r0
            java.lang.String r4 = r0.name()
            X.AnonymousClass7TG.A1N(r1, r4)
            X.0eM r0 = r2.A0E
            java.lang.Object r0 = r0.getValue()
            X.LGF r0 = (X.LGF) r0
            int r3 = r1.hashCode()
            X.02m r2 = r0.A00
            r1 = 827064321(0x314c0001, float:2.968591E-9)
            java.lang.String r0 = "section_load_end"
            r2.markerPoint(r1, r3, r0, r4)
            return r5
        L_0x027f:
            X.0eS.A00(r5)
            java.lang.Object r2 = r0.A03
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r2 = (com.instagram.settings2.core.viewmodel.SettingsScreenViewModel) r2
            java.lang.Object r3 = r0.A05
            X.XQw r3 = (X.C21251XQw) r3
            java.lang.Object r7 = r0.A06
            X.XRY r7 = (X.XRY) r7
            java.lang.String r6 = r7.name()
            X.AnonymousClass7TG.A1N(r3, r6)
            X.0eM r2 = r2.A0E
            java.lang.Object r2 = r2.getValue()
            X.LGF r2 = (X.LGF) r2
            int r5 = r3.hashCode()
            X.02m r4 = r2.A00
            r3 = 827064321(0x314c0001, float:2.968591E-9)
            java.lang.String r2 = "section_load_begin"
            r4.markerPoint(r3, r5, r2, r6)
            java.lang.Object r5 = r0.A04
            X.I4T r5 = (X.I4T) r5
            X.GnX r3 = r5.A00(r7)
            java.lang.Object r4 = r0.A01
            com.instagram.settings2.core.session.SettingsSession r4 = (com.instagram.settings2.core.session.SettingsSession) r4
            boolean r2 = r0.A07
            r6 = 0
            r0.A00 = r8
            r7 = r0
            r8 = r2
            java.lang.Object r5 = com.instagram.settings2.core.viewmodel.UiStateKt.A00(r3, r4, r5, r6, r7, r8)
            if (r5 != r1) goto L_0x0255
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59688JTu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C59688JTu) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59688JTu(C251983oI r2, Callable callable, AnonymousClass4D7 r4, 02o r5, String[] strArr, boolean z) {
        super(2, r4);
        this.A02 = 0;
        this.A07 = z;
        this.A05 = r2;
        this.A03 = r5;
        this.A06 = strArr;
        this.A04 = callable;
    }
}
