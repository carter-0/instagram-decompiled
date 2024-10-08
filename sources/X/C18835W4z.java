package X;

import android.content.DialogInterface;

/* renamed from: X.W4z  reason: case insensitive filesystem */
public final class C18835W4z implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C18835W4z(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj4;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
    }

    /* JADX WARNING: type inference failed for: r0v38, types: [X.1qK, X.WQG, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0197, code lost:
        if (r0 != null) goto L_0x019b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r17, int r18) {
        /*
            r16 = this;
            r6 = r16
            int r0 = r6.A00
            r7 = r17
            switch(r0) {
                case 0: goto L_0x01f0;
                case 1: goto L_0x01ca;
                case 2: goto L_0x0137;
                case 3: goto L_0x010d;
                case 4: goto L_0x0083;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r5 = r6.A04
            X.0lg r5 = (X.0lg) r5
            java.lang.Object r0 = r6.A02
            X.4DH r0 = (X.AnonymousClass4DH) r0
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r5)
            java.lang.String r0 = "ig_cg_click_create_story_profile_dialog_prompt"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            r0 = 2405(0x965, float:3.37E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "source_name"
            r2.AAJ(r0, r1)
            r2.Cgf()
            X.28D r2 = X.28D.A2u
            java.lang.Object r0 = r6.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.Object r4 = r6.A01
            android.content.Context r4 = (android.content.Context) r4
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            X.WaN r0 = X.C14628Tza.A01(r4, r0, r1)
            X.87I r10 = X.AnonymousClass87I.FUNDRAISER
            X.8YF r13 = r0.A00
            java.lang.String r14 = ""
            r8 = 0
            X.8YE r7 = new X.8YE
            r9 = r8
            r11 = r8
            r12 = r8
            r15 = r8
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            X.87G r3 = new X.87G
            r3.<init>(r7)
            r0 = 574(0x23e, float:8.04E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0060 }
            java.lang.String r1 = X.D0Y.A00(r3)     // Catch:{ IOException -> 0x0060 }
            r6.putString(r0, r1)     // Catch:{ IOException -> 0x0060 }
            goto L_0x01b5
        L_0x0060:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 216(0xd8, float:3.03E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.append(r0)
            X.87I r0 = r3.A04
            if (r0 != 0) goto L_0x0075
            X.87I r0 = X.AnonymousClass87I.EMPTY
        L_0x0075:
            java.lang.String r1 = X.AnonymousClass7TF.A0i(r0, r1)
            r0 = 389(0x185, float:5.45E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0wb.A06(r0, r1, r2)
            return
        L_0x0083:
            X.0qQ.A0A(r7)
            java.lang.Object r8 = r6.A04
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            java.lang.Object r0 = r6.A02
            X.0iw r0 = (X.AnonymousClass0iw) r0
            java.lang.Object r5 = r6.A03
            X.Tva r5 = (X.C14407Tva) r5
            java.lang.Object r2 = r6.A01
            android.content.Context r2 = (android.content.Context) r2
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r8)
            java.lang.String r0 = "clear_search_history"
            X.0Aj r0 = X.AnonymousClass7TE.A0e(r1, r0)
            X.DbY.A1C(r0)
            r0.Cgf()
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r8)
            r4 = 1
            X.WQG r0 = new X.WQG
            r0.<init>()
            r0.A00 = r4
            r1.A00(r0)
            X.1pR r0 = X.1pR.A00
            if (r0 == 0) goto L_0x0211
            X.C14398TvR.A00()
            X.VWO r1 = new X.VWO
            r1.<init>(r2, r8, r5)
            r0 = 5
            X.Ufo r3 = new X.Ufo
            r3.<init>(r1, r4)
            int r1 = r5.ordinal()
            X.1NY r2 = X.AnonymousClass7TG.A0a(r8)
            if (r1 != r0) goto L_0x00ea
            java.lang.String r0 = "map/clear_recent_searches/"
            r2.A0A(r0)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r2.A0Q(r1, r0)
            r2.A0R = r4
        L_0x00df:
            X.1OC r0 = r2.A0M()
            r0.A00 = r3
            X.1ES.A03(r0)
            goto L_0x0211
        L_0x00ea:
            java.lang.String r0 = "fbsearch/clear_search_history/"
            r2.A0A(r0)
            if (r1 == r4) goto L_0x010a
            r0 = 2
            if (r1 == r0) goto L_0x0107
            r0 = 3
            if (r1 == r0) goto L_0x0104
            r0 = 4
            if (r1 == r0) goto L_0x0101
            r1 = 0
        L_0x00fb:
            java.lang.String r0 = "type"
            X.DbX.A1M(r2, r0, r1)
            goto L_0x00df
        L_0x0101:
            java.lang.String r1 = "audio"
            goto L_0x00fb
        L_0x0104:
            java.lang.String r1 = "place"
            goto L_0x00fb
        L_0x0107:
            java.lang.String r1 = "hashtag"
            goto L_0x00fb
        L_0x010a:
            java.lang.String r1 = "user"
            goto L_0x00fb
        L_0x010d:
            r0 = 0
            X.C18539Vtr.A00 = r0
            if (r17 == 0) goto L_0x0115
            r7.dismiss()
        L_0x0115:
            java.lang.Object r0 = r6.A01
            android.widget.NumberPicker r0 = (android.widget.NumberPicker) r0
            int r3 = r0.getValue()
            java.lang.Object r1 = r6.A04
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1
            java.lang.Object r0 = r6.A03
            android.widget.NumberPicker r0 = (android.widget.NumberPicker) r0
            int r0 = r0.getValue()
            r2 = r1[r0]
            java.lang.Object r1 = r6.A02
            X.0sL r1 = (X.0sL) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.invoke(r0, r2)
            return
        L_0x0137:
            java.lang.Object r7 = r6.A03
            X.3uh r7 = (X.C255773uh) r7
            if (r7 == 0) goto L_0x01c9
            java.lang.Object r4 = r6.A01
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r1 = r6.A02
            X.0hq r1 = (X.0hq) r1
            java.lang.Object r0 = r6.A04
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.W01 r3 = new X.W01
            r3.<init>(r4, r1, r0, r7)
            X.VOl r2 = new X.VOl
            r2.<init>(r4)
            com.instagram.common.session.UserSession r0 = r3.A02
            X.1NY r5 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "stories/prompt_stickers/delete_template/"
            r5.A0A(r0)
            X.3mL r6 = r7.A0e
            X.3mL r4 = X.C250963mL.MEDIA
            if (r6 != r4) goto L_0x01b2
            X.1Xj r0 = r7.A0b
            r0.getClass()
            java.lang.String r1 = r0.A2m()
        L_0x016d:
            r0 = 1054(0x41e, float:1.477E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r5.A9m(r0, r1)
            if (r6 != r4) goto L_0x0199
            X.1Xj r0 = r7.A0b
            r0.getClass()
            X.1Xy r0 = r0.A0C
            java.util.List r0 = r0.C0m()
            if (r0 == 0) goto L_0x0199
            java.lang.Object r0 = X.00k.A0J(r0)
            X.XB2 r0 = (X.XB2) r0
            if (r0 == 0) goto L_0x0199
            com.instagram.api.schemas.StoryMusicPickTappableDataIntf r0 = r0.BUv()
            if (r0 == 0) goto L_0x0199
            java.lang.String r0 = r0.getMediaId()
            if (r0 != 0) goto L_0x019b
        L_0x0199:
            java.lang.String r0 = ""
        L_0x019b:
            X.JTO.A1W(r5, r0)
            java.lang.Class<X.UXg> r1 = X.C15246UXg.class
            java.lang.Class<X.Vo3> r0 = X.C18236Vo3.class
            r5.A0Q(r1, r0)
            X.1OC r1 = X.DbW.A0K(r5)
            r0 = 17
            X.C15619Ufl.A00(r1, r2, r3, r0)
            X.1ES.A03(r1)
            return
        L_0x01b2:
            java.lang.String r1 = ""
            goto L_0x016d
        L_0x01b5:
            X.C13992Tns.A0Z(r6, r2)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r2 = com.instagram.modal.TransparentModalActivity.class
            r1 = r4
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "attribution_quick_camera_fragment"
            X.6W8 r0 = X.AnonymousClass6W8.A02(r1, r6, r5, r2, r0)
            r0.A07()
            r0.A0C(r4)
        L_0x01c9:
            return
        L_0x01ca:
            java.lang.Object r0 = r6.A04
            com.instagram.model.hashtag.Hashtag r0 = (com.instagram.model.hashtag.Hashtag) r0
            X.Vjz r1 = new X.Vjz
            r1.<init>(r0)
            java.lang.Integer r0 = X.C51967G9n.A0k()
            r1.A08 = r0
            com.instagram.model.hashtag.Hashtag r3 = r1.A00()
            java.lang.Object r2 = r6.A01
            com.instagram.hashtag.ui.HashtagFollowButton r2 = (com.instagram.hashtag.ui.HashtagFollowButton) r2
            java.lang.Object r1 = r6.A02
            X.0iw r1 = (X.AnonymousClass0iw) r1
            java.lang.Object r0 = r6.A03
            X.X6g r0 = (X.C20953X6g) r0
            r2.A01(r1, r0, r3)
            r0.D3G(r3)
            return
        L_0x01f0:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r5 = r6.A04
            X.VXt r5 = (X.C17490VXt) r5
            java.lang.Object r4 = r6.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r6.A02
            X.07i r3 = (X.AnonymousClass07i) r3
            java.lang.Object r2 = r6.A03
            X.VgE r2 = (X.C17801VgE) r2
            com.instagram.common.session.UserSession r0 = r5.A03
            X.1OC r1 = X.C18238Vo5.A01(r0, r2)
            r0 = 7
            X.C15619Ufl.A00(r1, r2, r5, r0)
            X.1ES.A00(r4, r3, r1)
        L_0x0211:
            r7.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18835W4z.onClick(android.content.DialogInterface, int):void");
    }
}
