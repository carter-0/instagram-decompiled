package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;

public final class FZC implements MTS {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public FZC(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj4;
        this.A03 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void onFailure(Exception exc) {
        Activity activity;
        String str;
        switch (this.A00) {
            case 0:
                Activity activity2 = (Activity) this.A01;
                if (!activity2.isDestroyed()) {
                    Dialog dialog = (Dialog) this.A03;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    str = "unknown_error_occured";
                    activity = activity2;
                    break;
                } else {
                    return;
                }
            case 1:
                str = "startCreateStandaloneFundraiserStickerStory_unknown_error_occured";
                activity = (Context) this.A01;
                break;
            case 2:
                str = "shareVotingInfoCenterToStory_unknown_error_occured";
                activity = (Context) this.A01;
                break;
            default:
                02m r1 = 02m.A0p;
                0qQ.A07(r1);
                SNR.A01(r1, "media_background_generator_failure");
                ((Activity) this.A02).finish();
                return;
        }
        C59689JTv.A0C(activity, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r21) {
        /*
            r20 = this;
            r7 = r20
            r2 = r21
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0155;
                case 1: goto L_0x0080;
                case 2: goto L_0x003b;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.io.File r0 = X.Dba.A0T(r2)
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0029 }
            if (r0 == 0) goto L_0x0029
            java.lang.Object r3 = r7.A04
            X.SNR r3 = (X.SNR) r3
            r3.A02 = r0
            java.lang.Object r2 = r7.A01
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Object r1 = r7.A03
            X.0lg r1 = (X.0lg) r1
            java.lang.Object r0 = r7.A02
            android.app.Activity r0 = (android.app.Activity) r0
            X.SNR.A00(r0, r2, r1, r3)
            return
        L_0x0029:
            X.02m r1 = X.02m.A0p
            X.0qQ.A07(r1)
            java.lang.String r0 = "no_file_path"
            X.SNR.A01(r1, r0)
            java.lang.Object r0 = r7.A02
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x003b:
            java.io.File r2 = (java.io.File) r2
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.Object r1 = r7.A02
            android.graphics.RectF r1 = (android.graphics.RectF) r1
            r0 = 121(0x79, float:1.7E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putParcelable(r0, r1)
            java.lang.Object r1 = r7.A03
            android.graphics.RectF r1 = (android.graphics.RectF) r1
            r0 = 122(0x7a, float:1.71E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putParcelable(r0, r1)
            java.lang.String r1 = r2.getAbsolutePath()
            r0 = 120(0x78, float:1.68E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putString(r0, r1)
            r1 = 0
            r0 = 119(0x77, float:1.67E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putParcelable(r0, r1)
            java.lang.Object r2 = r7.A04
            X.0lg r2 = (X.0lg) r2
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            java.lang.Object r6 = r7.A01
            android.app.Activity r6 = (android.app.Activity) r6
            r0 = 931(0x3a3, float:1.305E-42)
            goto L_0x013f
        L_0x0080:
            java.io.File r2 = (java.io.File) r2
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.Object r1 = r7.A02
            X.28D r1 = (X.28D) r1
            r0 = 118(0x76, float:1.65E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putSerializable(r0, r1)
            r0 = 2433(0x981, float:3.41E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0149 }
            java.lang.String r1 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x0149 }
            r3.putString(r0, r1)     // Catch:{ IOException -> 0x0149 }
            r0 = 2434(0x982, float:3.411E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0149 }
            java.lang.Object r6 = r7.A03     // Catch:{ IOException -> 0x0149 }
            X.82j r6 = (X.C3499082j) r6     // Catch:{ IOException -> 0x0149 }
            java.io.StringWriter r5 = new java.io.StringWriter     // Catch:{ IOException -> 0x0149 }
            r5.<init>()     // Catch:{ IOException -> 0x0149 }
            X.17W r4 = X.AnonymousClass7TF.A0K(r5)     // Catch:{ IOException -> 0x0149 }
            java.lang.String r2 = r6.A09     // Catch:{ IOException -> 0x0149 }
            if (r2 == 0) goto L_0x00bc
            java.lang.String r0 = "title"
            r4.A0R(r0, r2)     // Catch:{ IOException -> 0x0149 }
        L_0x00bc:
            java.lang.String r2 = r6.A08     // Catch:{ IOException -> 0x0149 }
            if (r2 == 0) goto L_0x00c5
            java.lang.String r0 = "subtitle"
            r4.A0R(r0, r2)     // Catch:{ IOException -> 0x0149 }
        L_0x00c5:
            X.AE3 r0 = r6.A03     // Catch:{ IOException -> 0x0149 }
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = "fundraiser_creator"
            r4.A0q(r0)     // Catch:{ IOException -> 0x0149 }
            X.AE3 r0 = r6.A03     // Catch:{ IOException -> 0x0149 }
            X.ABS.A00(r4, r0)     // Catch:{ IOException -> 0x0149 }
        L_0x00d3:
            java.lang.String r2 = r6.A07     // Catch:{ IOException -> 0x0149 }
            if (r2 == 0) goto L_0x00dc
            java.lang.String r0 = "fundraiser_id"
            r4.A0R(r0, r2)     // Catch:{ IOException -> 0x0149 }
        L_0x00dc:
            com.instagram.model.fundraiser.NewFundraiserInfo r0 = r6.A01     // Catch:{ IOException -> 0x0149 }
            if (r0 == 0) goto L_0x00ee
            r0 = 713(0x2c9, float:9.99E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0149 }
            r4.A0q(r0)     // Catch:{ IOException -> 0x0149 }
            com.instagram.model.fundraiser.NewFundraiserInfo r0 = r6.A01     // Catch:{ IOException -> 0x0149 }
            X.C64130LPe.A01(r4, r0)     // Catch:{ IOException -> 0x0149 }
        L_0x00ee:
            java.lang.String r2 = r6.A04     // Catch:{ IOException -> 0x0149 }
            if (r2 == 0) goto L_0x00fb
            r0 = 1235(0x4d3, float:1.73E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0149 }
            r4.A0R(r0, r2)     // Catch:{ IOException -> 0x0149 }
        L_0x00fb:
            java.lang.String r2 = r6.A06     // Catch:{ IOException -> 0x0149 }
            if (r2 == 0) goto L_0x0104
            java.lang.String r0 = "description"
            r4.A0R(r0, r2)     // Catch:{ IOException -> 0x0149 }
        L_0x0104:
            X.AE3 r0 = r6.A02     // Catch:{ IOException -> 0x0149 }
            if (r0 == 0) goto L_0x0112
            java.lang.String r0 = "beneficiary"
            r4.A0q(r0)     // Catch:{ IOException -> 0x0149 }
            X.AE3 r0 = r6.A02     // Catch:{ IOException -> 0x0149 }
            X.ABS.A00(r4, r0)     // Catch:{ IOException -> 0x0149 }
        L_0x0112:
            java.lang.String r2 = r6.A05     // Catch:{ IOException -> 0x0149 }
            if (r2 == 0) goto L_0x011b
            java.lang.String r0 = "source"
            r4.A0R(r0, r2)     // Catch:{ IOException -> 0x0149 }
        L_0x011b:
            int r2 = r6.A00     // Catch:{ IOException -> 0x0149 }
            java.lang.String r0 = "cohosts_count"
            r4.A0P(r0, r2)     // Catch:{ IOException -> 0x0149 }
            java.lang.String r0 = X.AnonymousClass7TG.A0k(r4, r5)     // Catch:{ IOException -> 0x0149 }
            r3.putString(r1, r0)     // Catch:{ IOException -> 0x0149 }
            r0 = 2435(0x983, float:3.412E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0149 }
            r1 = 0
            r3.putParcelable(r0, r1)     // Catch:{ IOException -> 0x0149 }
            java.lang.Object r2 = r7.A04
            X.0lg r2 = (X.0lg) r2
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            java.lang.Object r6 = r7.A01
            android.app.Activity r6 = (android.app.Activity) r6
            r0 = 927(0x39f, float:1.299E-42)
        L_0x013f:
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.AnonymousClass6W8.A02(r6, r3, r2, r1, r0)
            goto L_0x0301
        L_0x0149:
            r0 = 1011(0x3f3, float:1.417E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "Could not json serialize model StandaloneFundraiserStickerModel."
            X.0wb.A03(r1, r0)
            return
        L_0x0155:
            java.io.File r2 = (java.io.File) r2
            r5 = 0
            X.0qQ.A0B(r2, r5)
            java.lang.String r4 = r2.getCanonicalPath()     // Catch:{ IOException -> 0x0160 }
            goto L_0x0164
        L_0x0160:
            java.lang.String r4 = r2.getAbsolutePath()
        L_0x0164:
            java.lang.Object r3 = r7.A04
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r6 = r7.A01
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.Object r2 = r7.A02
            com.instagram.direct.sharetostory.data.MessageShareStickerData r2 = (com.instagram.direct.sharetostory.data.MessageShareStickerData) r2
            X.0qQ.A0A(r4)
            r0 = 3
            X.0qQ.A0B(r4, r0)
            X.6gx r16 = X.C313746gw.A00(r3)
            int r0 = r2.A00
            r19 = r0
            java.lang.String r7 = r2.A0C
            java.lang.String r0 = r2.A0E
            r18 = r0
            java.lang.String r0 = r2.A0A
            r17 = r0
            java.lang.String r11 = r2.A08
            boolean r1 = r2.A0I
            boolean r15 = r2.A0K
            boolean r14 = r2.A0J
            java.lang.String r13 = r2.A0F
            java.lang.String r8 = r2.A09
            boolean r12 = r2.A0H
            X.1Ln r10 = X.DbT.A0J(r16)
            boolean r0 = X.DbT.A1Y(r10)
            if (r0 == 0) goto L_0x021f
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            if (r1 == 0) goto L_0x0358
            java.lang.String r1 = "True"
        L_0x01a9:
            java.lang.String r0 = "is_chat_creator"
            r9.put(r0, r1)
            if (r15 == 0) goto L_0x0354
            java.lang.String r1 = "True"
        L_0x01b2:
            r0 = 677(0x2a5, float:9.49E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.put(r0, r1)
            if (r14 == 0) goto L_0x0350
            java.lang.String r1 = "True"
        L_0x01bf:
            r0 = 1503(0x5df, float:2.106E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.put(r0, r1)
            java.lang.String r0 = "user_type"
            r9.put(r0, r13)
            if (r12 == 0) goto L_0x034c
            r0 = 1261(0x4ed, float:1.767E-42)
        L_0x01d1:
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "share_type"
            r9.put(r0, r1)
            r0 = r16
            X.DbW.A17(r10, r0)
            r0 = 1151(0x47f, float:1.613E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.DbV.A1M(r10, r0)
            r0 = 1133(0x46d, float:1.588E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r10.A0p(r0)
            java.lang.String r12 = "thread_view"
            r1 = r18
            r0 = r19
            java.lang.Long r0 = X.DbZ.A0b(r10, r12, r7, r1, r0)
            r10.A0i(r0)
            java.lang.String r0 = "SHARE_TO_STORY_SHORTCUT"
            boolean r0 = X.0qQ.A0K(r8, r0)
            if (r0 == 0) goto L_0x0348
            X.Nmb r1 = X.C69493Nmb.QUICK_SHARE
        L_0x0208:
            java.lang.String r0 = "entrypoint"
            r10.A0M(r1, r0)
            java.lang.String r1 = "item_id"
            r0 = r17
            r10.A0R(r1, r0)
            java.lang.String r0 = "client_context_id"
            r10.A0R(r0, r11)
            r10.A0w(r9)
            r10.Cgf()
        L_0x021f:
            boolean r11 = r2.A0G
            if (r11 == 0) goto L_0x02d2
            X.7I3 r1 = new X.7I3
            r1.<init>(r3)
            java.lang.String r10 = r2.A07
            r0 = 2
            X.0qQ.A0B(r8, r0)
            X.0wc r0 = r1.A01
            X.1Ln r9 = X.1Ln.A0J(r0)
            int r1 = r8.hashCode()
            r0 = -1312994764(0xffffffffb1bd4a34, float:-5.50906E-9)
            if (r1 == r0) goto L_0x033c
            r0 = -819194689(0xffffffffcf2c14bf, float:-2.88704077E9)
            if (r1 == r0) goto L_0x0330
            r0 = 495241351(0x1d84c887, float:3.514745E-21)
            if (r1 != r0) goto L_0x0275
            r0 = 251(0xfb, float:3.52E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0275
            java.lang.String r12 = "share_to_story_long_press_action"
        L_0x0255:
            boolean r0 = X.DbT.A1Y(r9)
            if (r0 == 0) goto L_0x0275
            r0 = 8
            r9.A0Z(r0)
            r9.A0X(r5)
            java.lang.String r0 = "selected_item"
            r9.A0R(r0, r12)
            java.lang.String r0 = "thread_id"
            r9.A0R(r0, r7)
            java.lang.String r0 = "agent_id"
            r9.A0R(r0, r10)
            r9.Cgf()
        L_0x0275:
            X.LTH r7 = new X.LTH
            r7.<init>(r3)
            com.instagram.api.schemas.IGAIAgentType r9 = r2.A02
            r0 = -1312994764(0xffffffffb1bd4a34, float:-5.50906E-9)
            if (r1 == r0) goto L_0x0314
            r0 = -819194689(0xffffffffcf2c14bf, float:-2.88704077E9)
            if (r1 == r0) goto L_0x0308
            r0 = 495241351(0x1d84c887, float:3.514745E-21)
            if (r1 != r0) goto L_0x02d2
            r0 = 251(0xfb, float:3.52E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x02d2
            boolean r0 = X.LTH.A05(r9)
            if (r0 == 0) goto L_0x02d2
            X.1Ln r7 = X.LTH.A00(r7)
            boolean r0 = X.DbT.A1Y(r7)
            if (r0 == 0) goto L_0x02d2
            java.lang.String r0 = "long_press_message_menu_share_to_story"
        L_0x02a9:
            r7.A0l(r0)
            r0 = 0
            if (r10 == 0) goto L_0x02b3
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r10)
        L_0x02b3:
            r7.A0j(r0)
            if (r9 == 0) goto L_0x02bc
            java.lang.String r1 = r9.A00
            if (r1 != 0) goto L_0x02be
        L_0x02bc:
            java.lang.String r1 = ""
        L_0x02be:
            java.lang.String r0 = "agent_type"
            X.0eP r5 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = "snippet_share"
            java.lang.String r0 = "content_type"
            java.util.LinkedHashMap r0 = X.DbY.A0p(r0, r1, r5)
            r7.A0x(r0)
            r7.Cgf()
        L_0x02d2:
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            if (r11 == 0) goto L_0x0305
            X.28D r1 = X.28D.A0K
        L_0x02da:
            r0 = 2458(0x99a, float:3.444E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.putSerializable(r0, r1)
            r0 = 2457(0x999, float:3.443E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.putString(r0, r4)
            r0 = 2459(0x99b, float:3.446E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.putParcelable(r0, r2)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            r0 = 3228(0xc9c, float:4.523E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.AnonymousClass6W8.A02(r6, r5, r3, r1, r0)
        L_0x0301:
            r0.A0C(r6)
            return
        L_0x0305:
            X.28D r1 = X.28D.A5J
            goto L_0x02da
        L_0x0308:
            java.lang.String r0 = "SHARE_SHEET"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x02d2
            r7.A07(r9, r10, r5)
            goto L_0x02d2
        L_0x0314:
            java.lang.String r0 = "SHARE_TO_STORY_SHORTCUT"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x02d2
            boolean r0 = X.LTH.A05(r9)
            if (r0 == 0) goto L_0x02d2
            X.1Ln r7 = X.LTH.A00(r7)
            boolean r0 = X.DbT.A1Y(r7)
            if (r0 == 0) goto L_0x02d2
            java.lang.String r0 = "message_shortcut_share_to_story"
            goto L_0x02a9
        L_0x0330:
            java.lang.String r0 = "SHARE_SHEET"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0275
            java.lang.String r12 = "share_to_story_share_sheet"
            goto L_0x0255
        L_0x033c:
            java.lang.String r0 = "SHARE_TO_STORY_SHORTCUT"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0275
            java.lang.String r12 = "share_to_story_shortcut"
            goto L_0x0255
        L_0x0348:
            X.Nmb r1 = X.C69493Nmb.MESSAGE_SHARE_SHEET
            goto L_0x0208
        L_0x034c:
            r0 = 648(0x288, float:9.08E-43)
            goto L_0x01d1
        L_0x0350:
            java.lang.String r1 = "False"
            goto L_0x01bf
        L_0x0354:
            java.lang.String r1 = "False"
            goto L_0x01b2
        L_0x0358:
            java.lang.String r1 = "False"
            goto L_0x01a9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FZC.onSuccess(java.lang.Object):void");
    }
}
