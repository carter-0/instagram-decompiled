package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.StoryLinkInfoDictIntf;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.LJg  reason: case insensitive filesystem */
public abstract class C64019LJg {
    public static final void A01(Activity activity, UserSession userSession, PromptStickerModel promptStickerModel, C62320sa r8, C62320sa r9) {
        String str;
        String str2;
        StoryPromptParticipationFrictionInfoDict Ban;
        String str3;
        StoryLinkInfoDictIntf Agg;
        StoryLinkInfoDictIntf Agg2;
        Bundle A0B = DbV.A0B(userSession, 1);
        StoryPromptParticipationFrictionInfoDict Ban2 = promptStickerModel.A00.Ban();
        String str4 = null;
        if (Ban2 == null || (str = Ban2.getTitle()) == null) {
            str = null;
        }
        A0B.putString("ARG_TITLE_TEXT", str);
        StoryPromptParticipationFrictionInfoDict Ban3 = promptStickerModel.A00.Ban();
        if (Ban3 == null || (str2 = Ban3.Age()) == null) {
            str2 = null;
        }
        A0B.putString("ARG_BODY_ONE_TEXT", str2);
        StoryPromptParticipationFrictionInfoDict Ban4 = promptStickerModel.A00.Ban();
        if ((Ban4 == null || (str3 = Ban4.Agf()) == null) && ((Ban = promptStickerModel.A00.Ban()) == null || (Agg = Ban.Agg()) == null || (str3 = Agg.BMs()) == null)) {
            str3 = null;
        }
        A0B.putString("ARG_BODY_TWO_TEXT", str3);
        StoryPromptParticipationFrictionInfoDict Ban5 = promptStickerModel.A00.Ban();
        if (!(Ban5 == null || (Agg2 = Ban5.Agg()) == null)) {
            str4 = Agg2.getUrl();
        }
        A0B.putString("ARG_IS_BODY_TWO_LINK_URL", str4);
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0g = activity.getString(2131954722);
        A0W.A0v = true;
        A0W.A1N = true;
        A0W.A0h = activity.getString(2131952263);
        A0W.A0L = new C64273LXz(r8, 36);
        A0W.A0w = true;
        C65745Lyz.A00(A0W, r9, 19);
        A0W.A1P = true;
        C331157Pu A00 = A0W.A00();
        Fragment fragment = new Fragment();
        fragment.setArguments(A0B);
        A00.A02(activity, fragment);
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0296  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.app.Activity r14, X.28D r15, X.AnonymousClass0iw r16, com.instagram.common.session.UserSession r17, X.C255773uh r18, X.C310016aI r19, X.C317766nn r20, X.C273384mU r21, com.instagram.reels.prompt.model.PromptStickerModel r22, X.C310416b1 r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.util.List r27) {
        /*
            r11 = r17
            boolean r1 = X.DbW.A1Y(r11)
            r4 = r25
            r3 = r26
            X.AnonymousClass7TG.A1S(r4, r3)
            android.os.Bundle r6 = X.DbY.A09(r11)
            java.lang.String r0 = "media_id"
            r5 = r24
            r6.putString(r0, r5)
            java.lang.String r0 = "tray_session_id"
            r6.putString(r0, r4)
            java.lang.String r2 = r16.getModuleName()
            java.lang.String r0 = "prior_module"
            r6.putString(r0, r2)
            java.lang.String r0 = "viewer_session_id"
            r6.putString(r0, r3)
            r13 = r22
            com.instagram.api.schemas.StoryPromptTappableData r2 = r13.A02()
            java.lang.String r0 = "prompt_sticker_model"
            r6.putParcelable(r0, r2)
            java.lang.String r0 = "camera_entry_point_type"
            r2 = r15
            r6.putSerializable(r0, r15)
            if (r27 == 0) goto L_0x0088
            boolean r0 = r27.isEmpty()
            if (r0 != 0) goto L_0x0088
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r27.iterator()
        L_0x0050:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r7 = r9.next()
            boolean r0 = r7 instanceof X.C40591Aef
            if (r0 == 0) goto L_0x0050
            r10.add(r7)
            goto L_0x0050
        L_0x0062:
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r10)
            java.util.Iterator r7 = r10.iterator()
        L_0x006a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r0 = r7.next()
            X.Aef r0 = (X.C40591Aef) r0
            com.instagram.api.schemas.StoryThenAndNowStickerDict r0 = r0.A00
            r9.add(r0)
            goto L_0x006a
        L_0x007c:
            r8.addAll(r9)
            r0 = 522(0x20a, float:7.31E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.putParcelableArrayList(r0, r8)
        L_0x0088:
            r8 = r23
            if (r23 == 0) goto L_0x00a4
            java.io.StringWriter r7 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r7)
            X.C14291TtP.A00(r0, r8)
            java.lang.String r7 = X.JTP.A0n(r0, r7)
            r0 = 372(0x174, float:5.21E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.putString(r0, r7)
        L_0x00a4:
            r9 = r18
            if (r18 == 0) goto L_0x00bd
            X.1Xj r0 = r9.A0b
            if (r0 == 0) goto L_0x00bd
            X.1Xy r0 = r0.A0C
            com.instagram.feed.media.CreativeConfigIntf r7 = r0.AsO()
            if (r7 == 0) goto L_0x00bd
            r0 = 371(0x173, float:5.2E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.putParcelable(r0, r7)
        L_0x00bd:
            r10 = r14
            boolean r0 = r14 instanceof X.AnonymousClass07g
            r7 = 0
            if (r0 == 0) goto L_0x00d9
            r8 = r10
            X.07g r8 = (X.AnonymousClass07g) r8
            if (r8 == 0) goto L_0x00d9
            X.6as r0 = new X.6as
            r0.<init>(r11)
            X.2YN r7 = X.JTO.A0L(r0, r8)
            java.lang.Class<com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel> r0 = com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel.class
            X.2YL r7 = r7.A00(r0)
            com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel r7 = (com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel) r7
        L_0x00d9:
            X.K7c r14 = new X.K7c
            r14.<init>()
            r14.setArguments(r6)
            if (r18 == 0) goto L_0x00e5
            r14.A01 = r9
        L_0x00e5:
            r12 = r21
            if (r21 == 0) goto L_0x00f4
            r0 = r12
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.3mM r0 = r0.A0a
            if (r0 == 0) goto L_0x00f4
            if (r7 == 0) goto L_0x019e
            r7.A01 = r0
        L_0x00f4:
            r0 = r20
            if (r20 == 0) goto L_0x00fa
            r14.A02 = r0
        L_0x00fa:
            boolean r0 = r13.A0D
            if (r0 == 0) goto L_0x0206
            if (r24 == 0) goto L_0x0206
            X.7Pr r7 = X.DbS.A0W(r11)
            com.instagram.api.schemas.StoryPromptTappableDataIntf r6 = r13.A00
            java.lang.String r6 = r6.getText()
            r7.A0d = r6
            r6 = 10
            r7.A0C = r6
            r7.A0T = r14
            r6 = 0
            r7.A1C = r6
            r7.A14 = r6
            com.instagram.api.schemas.StoryPromptType r6 = r13.A03()
            X.8hK r6 = X.AnonymousClass6XS.A01(r6)
            if (r6 == 0) goto L_0x0170
            com.instagram.api.schemas.CameraTool r6 = r6.A05
            if (r6 == 0) goto L_0x0170
            com.instagram.api.schemas.StoryPromptType r9 = r13.A03()
            com.instagram.api.schemas.StoryPromptType r8 = com.instagram.api.schemas.StoryPromptType.MAGIC_MOD_RESTYLE
            if (r9 != r8) goto L_0x01ab
            r8 = 2131965795(0x7f133763, float:1.956841E38)
            java.lang.String r8 = r10.getString(r8)
            r7.A0g = r8
            X.LXg r8 = new X.LXg
            r17 = r8
            r18 = r10
            r19 = r6
            r20 = r11
            r21 = r13
            r22 = r5
            r23 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r7.A0K = r8
            r8 = 2131965791(0x7f13375f, float:1.9568402E38)
            java.lang.String r8 = r10.getString(r8)
            r7.A0h = r8
            r22 = 2
        L_0x0156:
            X.LXc r8 = new X.LXc
            r17 = r8
            r21 = r5
            r17.<init>(r18, r19, r20, r21, r22)
            r7.A0L = r8
        L_0x0161:
            r6 = 20
            X.C65745Lyz.A00(r7, r12, r6)
            X.7Pu r6 = r7.A00()
            r6.A0Q(r1)
            r6.A02(r10, r14)
        L_0x0170:
            X.28D r1 = X.28D.A0G
            if (r2 == r1) goto L_0x019e
            X.LN4 r15 = new X.LN4
            r17 = r11
            r18 = r13
            r20 = r4
            r21 = r3
            r19 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x01a8
            com.instagram.api.schemas.StoryPromptType r0 = r13.A03()
            int r2 = r0.ordinal()
            r1 = 9
            r0 = 8
            if (r2 == r1) goto L_0x01a5
            if (r2 == r0) goto L_0x01a2
            r0 = 7
            if (r2 == r0) goto L_0x019f
            java.lang.String r1 = ""
        L_0x019a:
            r0 = 0
            X.LN4.A00(r15, r1, r0)
        L_0x019e:
            return
        L_0x019f:
            java.lang.String r1 = "magicmod_backdrop_prompt_click"
            goto L_0x019a
        L_0x01a2:
            java.lang.String r1 = "magicmod_wand_prompt_click"
            goto L_0x019a
        L_0x01a5:
            java.lang.String r1 = "magicmod_restyle_prompt_click"
            goto L_0x019a
        L_0x01a8:
            java.lang.String r1 = "sticker_tap"
            goto L_0x019a
        L_0x01ab:
            com.instagram.api.schemas.StoryPromptType r9 = r13.A03()
            com.instagram.api.schemas.StoryPromptType r8 = com.instagram.api.schemas.StoryPromptType.MAGIC_MOD_BACKDROP
            if (r9 != r8) goto L_0x01de
            r8 = 2131965748(0x7f133734, float:1.9568315E38)
            java.lang.String r8 = r10.getString(r8)
            r7.A0g = r8
            r23 = 2
            X.LXg r8 = new X.LXg
            r17 = r8
            r18 = r10
            r19 = r6
            r20 = r11
            r21 = r13
            r22 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r7.A0K = r8
            r8 = 2131965742(0x7f13372e, float:1.9568302E38)
            java.lang.String r8 = r10.getString(r8)
            r7.A0h = r8
            r22 = 3
            goto L_0x0156
        L_0x01de:
            com.instagram.api.schemas.StoryPromptType r9 = r13.A03()
            com.instagram.api.schemas.StoryPromptType r8 = com.instagram.api.schemas.StoryPromptType.MAGIC_MOD_ADD_YOURS_WITH_BACKDROP
            if (r9 != r8) goto L_0x0161
            r8 = 2131965740(0x7f13372c, float:1.9568298E38)
            java.lang.String r8 = r10.getString(r8)
            r7.A0g = r8
            r23 = 3
            X.LXg r8 = new X.LXg
            r17 = r8
            r18 = r10
            r19 = r6
            r20 = r11
            r21 = r13
            r22 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r7.A0K = r8
            goto L_0x0161
        L_0x0206:
            X.Lnw r15 = new X.Lnw
            r6 = r19
            r15.<init>(r6, r12, r13)
            X.7Pr r6 = X.DbS.A0W(r11)
            boolean r7 = r13.A0M()
            if (r7 == 0) goto L_0x0299
            r7 = 2131974530(0x7f135982, float:1.9586127E38)
        L_0x021a:
            java.lang.String r7 = r10.getString(r7)
        L_0x021e:
            r6.A0d = r7
            r6.A0T = r14
            X.FmC r7 = new X.FmC
            r17 = r7
            r18 = r1
            r19 = r10
            r20 = r16
            r21 = r11
            r22 = r12
            r17.<init>(r18, r19, r20, r21, r22)
            r6.A0U = r7
            boolean r7 = r13.A0M()
            r7 = r7 ^ 1
            r6.A1C = r7
            r6.A1P = r1
            boolean r7 = r13.A0I()
            if (r7 != 0) goto L_0x0296
            boolean r7 = r13.A0B
            if (r7 == 0) goto L_0x0296
            java.lang.Integer r22 = X.AnonymousClass05K.A01
        L_0x024b:
            int r7 = r13.A01
            if (r7 != 0) goto L_0x0287
            boolean r8 = r13.A0I()
            r7 = 2131970878(0x7f134b3e, float:1.957872E38)
            if (r8 == 0) goto L_0x025b
            r7 = 2131956909(0x7f1314ad, float:1.9550387E38)
        L_0x025b:
            java.lang.String r7 = r10.getString(r7)
            r6.A0g = r7
            int r7 = r22.intValue()
            if (r7 != r1) goto L_0x0270
            r7 = 2131966018(0x7f133842, float:1.9568862E38)
            java.lang.String r7 = r10.getString(r7)
            r6.A0h = r7
        L_0x0270:
            r9 = 3
            X.LXh r8 = new X.LXh
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r6.A0K = r8
            X.LXb r7 = new X.LXb
            r17 = r7
            r18 = r9
            r20 = r14
            r21 = r15
            r17.<init>(r18, r19, r20, r21, r22)
            r6.A0L = r7
        L_0x0287:
            X.7Pu r6 = r6.A00()
            r6.A0Q(r1)
            r6.A02(r10, r14)
            r15.Ckx()
            goto L_0x0170
        L_0x0296:
            java.lang.Integer r22 = X.AnonymousClass05K.A0C
            goto L_0x024b
        L_0x0299:
            if (r0 == 0) goto L_0x02a9
            r8 = 34
            com.instagram.api.schemas.StoryPromptTappableDataIntf r7 = r13.A00
            java.lang.String r7 = r7.getText()
            java.lang.String r7 = X.002.A0E(r7, r8, r8)
            goto L_0x021e
        L_0x02a9:
            boolean r7 = r13.A0I()
            if (r7 == 0) goto L_0x02b4
            r7 = 2131964135(0x7f1330e7, float:1.9565043E38)
            goto L_0x021a
        L_0x02b4:
            com.instagram.api.schemas.StoryPromptTappableDataIntf r7 = r13.A00
            java.lang.String r7 = r7.getText()
            goto L_0x021e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64019LJg.A00(android.app.Activity, X.28D, X.0iw, com.instagram.common.session.UserSession, X.3uh, X.6aI, X.6nn, X.4mU, com.instagram.reels.prompt.model.PromptStickerModel, X.6b1, java.lang.String, java.lang.String, java.lang.String, java.util.List):void");
    }
}
