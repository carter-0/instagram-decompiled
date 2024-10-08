package X;

public final class LNN {
    public static final LNN A00 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.app.Activity r7, X.28D r8, com.instagram.api.schemas.CameraTool r9, com.instagram.common.session.UserSession r10, com.instagram.reels.prompt.model.PromptStickerModel r11, java.lang.String r12, java.lang.String r13) {
        /*
            r6 = this;
            r0 = 0
            X.AnonymousClass7TF.A1C(r10, r0, r9)
            r0 = 15
            int r1 = r9.ordinal()
            if (r1 == r0) goto L_0x00bf
            r0 = 115(0x73, float:1.61E-43)
            if (r1 == r0) goto L_0x00b9
            r0 = 4
            if (r1 != r0) goto L_0x006f
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329504859242656(0x81117e000040a0, double:3.038263387934743E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r10, r0)
        L_0x001e:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x006f
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "camera_entry_point"
            r2.putSerializable(r0, r8)
            r1 = 1
            r0 = 1386(0x56a, float:1.942E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r1)
            java.lang.String r1 = r9.toString()
            r0 = 1385(0x569, float:1.941E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r1)
            r0 = 614(0x266, float:8.6E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r12)
            if (r13 == 0) goto L_0x0058
            r0 = 1384(0x568, float:1.94E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r13)
        L_0x0058:
            if (r11 == 0) goto L_0x0067
            com.instagram.api.schemas.StoryPromptTappableData r0 = r11.A02()
            com.facebook.base.activity.parcel.OpaqueParcelable r1 = X.0B0.A00(r0)
            java.lang.String r0 = "prompt_sticker_model"
            r2.putParcelable(r0, r1)
        L_0x0067:
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "attribution_quick_camera_fragment"
            X.DbU.A0x(r7, r2, r10, r1, r0)
        L_0x006e:
            return
        L_0x006f:
            X.37D r0 = X.DbT.A0i(r7)
            X.7Pu r0 = X.C48943Emh.A00(r0)
            if (r0 == 0) goto L_0x00b7
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r5 = r0.A03
        L_0x007b:
            r4 = 0
            X.K7S r3 = new X.K7S
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            if (r11 == 0) goto L_0x0090
            com.instagram.api.schemas.StoryPromptTappableData r1 = r11.A02()
            java.lang.String r0 = "prompt_sticker_model"
            r2.putParcelable(r0, r1)
        L_0x0090:
            if (r12 == 0) goto L_0x0097
            java.lang.String r0 = "args_media_id"
            r2.putString(r0, r12)
        L_0x0097:
            X.AnonymousClass0Dg.A00(r2, r10)
            r3.setArguments(r2)
            r3.A00 = r4
            X.7Pr r1 = X.DbS.A0W(r10)
            r0 = 7
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r3, r0)
            r1.A0T = r3
            if (r5 == 0) goto L_0x00c5
            X.7Pu r0 = r5.A02
            if (r0 == 0) goto L_0x006e
            r0.A0F(r3, r1)
            return
        L_0x00b7:
            r5 = 0
            goto L_0x007b
        L_0x00b9:
            java.lang.Boolean r0 = X.C364768ly.A00(r10)
            goto L_0x001e
        L_0x00bf:
            java.lang.Boolean r0 = X.C364778lz.A00(r10)
            goto L_0x001e
        L_0x00c5:
            X.DbU.A0y(r7, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LNN.A00(android.app.Activity, X.28D, com.instagram.api.schemas.CameraTool, com.instagram.common.session.UserSession, com.instagram.reels.prompt.model.PromptStickerModel, java.lang.String, java.lang.String):void");
    }
}
