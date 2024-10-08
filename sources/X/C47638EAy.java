package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;
import java.util.HashSet;

/* renamed from: X.EAy  reason: case insensitive filesystem */
public final class C47638EAy extends C231632rz {
    public final Context A00;
    public final C51959G9f A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C49353EuH A04;
    public final C47171Drm A05;
    public final DdG A06;
    public final HashSet A07 = AnonymousClass7TE.A1F();

    public final int getViewTypeCount() {
        return 16;
    }

    public static View A00(ViewGroup viewGroup, C47638EAy eAy) {
        return LayoutInflater.from(eAy.A00).inflate(R.layout.profile_dense_multi_row_media, viewGroup, false);
    }

    public static void A01(View view, C51959G9f g9f, C283155Gi r3, int i, int i2) {
        AnonymousClass0fU.A00(new FPA(g9f, r3, i, i2), view);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.instagram.common.ui.widget.imageview.IgImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v53, resolved type: com.instagram.common.ui.widget.imageview.CircularImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v54, resolved type: com.instagram.ui.widget.stackedavatar.StackedAvatarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v48, resolved type: com.instagram.common.ui.widget.imageview.IgImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v15, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v39, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v40, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v234, resolved type: com.instagram.ui.widget.stackedavatar.StackedAvatarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v235, resolved type: com.instagram.ui.widget.stackedavatar.StackedAvatarView} */
    /* JADX WARNING: type inference failed for: r20v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r20v7, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r20v16, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r20v19, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r9v26, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r20v24, types: [android.view.View] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x065e, code lost:
        if (r5 == 150) goto L_0x0660;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0a5d, code lost:
        if (r4 != null) goto L_0x0a5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0a5f, code lost:
        r4.setVisibility(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0adc, code lost:
        X.FGO.A04(r18, r19, r20, r21, r22, r2, r24, r25, r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0b83, code lost:
        X.0qQ.A0B(r4, 0);
        X.AnonymousClass7TG.A1O(r9, r11);
        r8 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0b8c, code lost:
        if (r8 == null) goto L_0x0cad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0b90, code lost:
        if (r8.A05 != false) goto L_0x0cad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0b92, code lost:
        r5 = r8.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0b94, code lost:
        if (r5 == null) goto L_0x0d19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0b96, code lost:
        r5 = java.util.Collections.unmodifiableList(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0b9a, code lost:
        if (r5 == null) goto L_0x0d19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0b9c, code lost:
        r7 = (X.F3R) X.00k.A0J(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0ba2, code lost:
        if (r7 == null) goto L_0x0d19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0ba4, code lost:
        X.AnonymousClass7TE.A0d(r9.A01(), com.instagram.android.R.id.survey_question_text).setText(r7.A03);
        r5 = r7.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0bb6, code lost:
        if (r5 == null) goto L_0x0c16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0bb8, code lost:
        r6 = java.util.Collections.unmodifiableList(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0bbc, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0bbd, code lost:
        if (r6 == null) goto L_0x0c14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0bbf, code lost:
        r6 = (X.F36) X.00k.A0O(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0bc5, code lost:
        r18 = r8;
        r20 = r7;
        r21 = r4;
        r22 = r9;
        r23 = r11;
        r24 = r0;
        X.C49011Enn.A00(r18, r6, r20, r21, r22, r23, r24, com.instagram.android.R.id.survey_answer_button_1);
        r6 = r7.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0bdb, code lost:
        if (r6 == null) goto L_0x0bea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0bdd, code lost:
        r6 = java.util.Collections.unmodifiableList(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0be1, code lost:
        if (r6 == null) goto L_0x0bea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0be3, code lost:
        r5 = (X.F36) X.00k.A0O(r6, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0bea, code lost:
        X.C49011Enn.A00(r18, r5, r20, r21, r22, r23, r24, com.instagram.android.R.id.survey_answer_button_2);
        X.AnonymousClass0fU.A00(new X.C50106FOw(3, r0, r21, r22, r8, r7), r9.A01().findViewById(com.instagram.android.R.id.close_survey_button));
        r9.A03(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0c14, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0c16, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0cad, code lost:
        r9.A02();
        r11.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0d16, code lost:
        X.AnonymousClass0fU.A00(r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0d19, code lost:
        r7 = new android.util.TypedValue();
        r1.A00.getTheme().resolveAttribute(com.instagram.android.R.attr.backgroundDrawable, r7, true);
        r33.setBackgroundResource(r7.resourceId);
        r33.setOnLongClickListener(new X.FPY(2, r1, r17, r0));
        r2.DgM(r0, r3);
        X.AnonymousClass0fD.A0A(993249633, r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0d4a, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x032e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r35, android.view.View r36, java.lang.Object r37, java.lang.Object r38) {
        /*
            r34 = this;
            r17 = r38
            r0 = r37
            r1 = -419719563(0xffffffffe6fb9675, float:-5.940447E23)
            int r16 = X.AnonymousClass0fD.A03(r1)
            X.5Gi r0 = (X.C283155Gi) r0
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            r17 = r1
            r4 = 35
            r1 = r34
            r33 = r36
            r3 = r33
            r2 = r17
            X.FPH.A00(r3, r1, r2, r0, r4)
            switch(r35) {
                case 0: goto L_0x0033;
                case 1: goto L_0x01bf;
                case 2: goto L_0x0357;
                case 3: goto L_0x0413;
                case 4: goto L_0x04a8;
                case 5: goto L_0x04c8;
                case 6: goto L_0x054a;
                case 7: goto L_0x05c3;
                case 8: goto L_0x062f;
                case 9: goto L_0x07ad;
                case 10: goto L_0x0889;
                case 11: goto L_0x08bb;
                case 12: goto L_0x0a64;
                case 13: goto L_0x0b10;
                case 14: goto L_0x0cb4;
                case 15: goto L_0x0033;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.String r0 = "Unhandled view type"
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>(r0)
            r1 = -776618919(0xffffffffd1b5bc59, float:-9.7568629E10)
            r0 = r16
            X.AnonymousClass0fD.A0A(r1, r0)
            throw r2
        L_0x0033:
            android.content.Context r7 = r1.A00
            X.0iw r8 = r1.A02
            java.lang.Object r6 = X.DbT.A0o(r33)
            X.Fen r6 = (X.C50578Fen) r6
            int r3 = r17.intValue()
            X.DdG r2 = r1.A06
            com.instagram.model.reels.Reel r27 = r2.A00(r0)
            X.G9f r2 = r1.A01
            com.instagram.common.session.UserSession r4 = r1.A03
            X.Drm r11 = r1.A05
            X.FCH.A00(r8, r2, r6, r0, r3)
            boolean r5 = X.FCH.A02(r0)
            if (r5 == 0) goto L_0x01bb
            com.instagram.ui.widget.stackedavatar.StackedAvatarView r5 = r6.ByY()
        L_0x005a:
            android.widget.TextView r10 = r6.A05
            android.view.View r9 = r6.A04
            r24 = r11
            r25 = r0
            r26 = r3
            r18 = r7
            r19 = r9
            r20 = r5
            r21 = r10
            r22 = r4
            r23 = r2
            X.FGO.A04(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            com.instagram.common.typedurl.ImageUrl r5 = r0.A01()
            boolean r5 = X.C253833rU.A02(r5)
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x01b4
            com.instagram.common.typedurl.ImageUrl r11 = r0.A01()
            X.2eb r5 = r6.A0A
            android.view.View r10 = r5.A01()
            com.instagram.common.ui.widget.imageview.IgImageView r10 = (com.instagram.common.ui.widget.imageview.IgImageView) r10
            X.Exr r9 = new X.Exr
            r9.<init>(r3)
            X.EVf r5 = X.C48087EVf.END_IMAGE
            r9.A01 = r5
            r10.setUrl(r11, r8)
            android.content.res.Resources r8 = r10.getResources()
            r5 = 2131968352(0x7f134160, float:1.9573596E38)
            X.DbT.A1A(r8, r10, r5)
            r20 = 7
            X.FO5 r5 = new X.FO5
            r18 = r5
            r19 = r3
            r21 = r0
            r22 = r2
            r23 = r9
            r18.<init>(r19, r20, r21, r22, r23)
            X.AnonymousClass0fU.A00(r5, r10)
        L_0x00b5:
            X.5Gj r5 = r0.A04
            java.lang.Boolean r5 = r5.A0K
            if (r5 == 0) goto L_0x01ae
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x01ae
            X.2eb r8 = r6.A09
            boolean r5 = r8.A04()
            if (r5 == 0) goto L_0x00cd
            r5 = 0
            r8.A03(r5)
        L_0x00cd:
            android.view.View r5 = r6.A00
            if (r5 != 0) goto L_0x00d4
            X.C50578Fen.A00(r6)
        L_0x00d4:
            android.view.View r8 = r6.A00
            r8.getClass()
            boolean r5 = r0.A0F()
            r8.setSelected(r5)
            android.view.View r5 = r6.A00
            if (r5 != 0) goto L_0x00e7
            X.C50578Fen.A00(r6)
        L_0x00e7:
            android.view.View r8 = r6.A00
            r8.getClass()
            r11 = 8
            X.FO5 r5 = new X.FO5
            r9 = r5
            r10 = r3
            r12 = r6
            r13 = r0
            r14 = r2
            r9.<init>(r10, r11, r12, r13, r14)
            X.AnonymousClass0fU.A00(r5, r8)
            X.5Gj r5 = r0.A04
            java.lang.String r9 = r5.A06
            android.widget.TextView r5 = r6.A02
            if (r5 != 0) goto L_0x0106
            X.C50578Fen.A00(r6)
        L_0x0106:
            android.widget.TextView r8 = r6.A02
            r8.getClass()
            if (r9 != 0) goto L_0x0198
            r5 = 2131963839(0x7f132fbf, float:1.9564443E38)
            X.DbT.A18(r7, r8, r5)
            android.widget.TextView r5 = r6.A02
            if (r5 != 0) goto L_0x011a
            X.C50578Fen.A00(r6)
        L_0x011a:
            android.widget.TextView r8 = r6.A02
            r8.getClass()
            r5 = 16
        L_0x0121:
            A01(r8, r2, r0, r3, r5)
            X.5Gj r5 = r0.A04
            com.instagram.api.schemas.PrivateReplyStatus r8 = r5.A00
            if (r8 == 0) goto L_0x0171
            com.instagram.api.schemas.PrivateReplyStatus r5 = com.instagram.api.schemas.PrivateReplyStatus.A04
            if (r8 == r5) goto L_0x0171
            r5 = 0
            X.0qQ.A0B(r4, r5)
            com.instagram.user.model.User r5 = X.AnonymousClass7TF.A0Q(r4)
            boolean r5 = X.2Ek.A03(r5)
            if (r5 == 0) goto L_0x0171
            X.5Gj r5 = r0.A04
            com.instagram.api.schemas.PrivateReplyStatus r8 = r5.A00
            com.instagram.api.schemas.PrivateReplyStatus r5 = com.instagram.api.schemas.PrivateReplyStatus.A06
            if (r8 != r5) goto L_0x0192
            r8 = 2131963837(0x7f132fbd, float:1.9564439E38)
            r5 = 742(0x2e6, float:1.04E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r5)
        L_0x014d:
            android.widget.TextView r5 = r6.A01
            if (r5 != 0) goto L_0x0154
            X.C50578Fen.A00(r6)
        L_0x0154:
            android.widget.TextView r5 = r6.A01
            r5.getClass()
            X.DbT.A18(r7, r5, r8)
            android.widget.TextView r5 = r6.A01
            if (r5 != 0) goto L_0x0163
            X.C50578Fen.A00(r6)
        L_0x0163:
            android.widget.TextView r8 = r6.A01
            r8.getClass()
            r7 = 5
            X.FNn r5 = new X.FNn
            r5.<init>(r2, r0, r9, r7)
            X.AnonymousClass0fU.A00(r5, r8)
        L_0x0171:
            boolean r32 = X.FCH.A02(r0)
            X.2eb r5 = r6.A0B
            android.view.View r7 = r5.A01()
            com.instagram.ui.widget.gradientspinner.GradientSpinner r7 = (com.instagram.ui.widget.gradientspinner.GradientSpinner) r7
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = r6.A06
            r26 = r5
            r28 = r2
            r29 = r0
            r30 = r7
            r31 = r3
            X.FCH.A01(r26, r27, r28, r29, r30, r31, r32)
            X.2eb r9 = r6.A08
            X.2eb r11 = r6.A07
            goto L_0x0b83
        L_0x0192:
            r8 = 2131963836(0x7f132fbc, float:1.9564437E38)
            java.lang.String r9 = "private_reply_message"
            goto L_0x014d
        L_0x0198:
            r5 = 2131963842(0x7f132fc2, float:1.9564449E38)
            X.DbT.A18(r7, r8, r5)
            android.widget.TextView r5 = r6.A02
            if (r5 != 0) goto L_0x01a5
            X.C50578Fen.A00(r6)
        L_0x01a5:
            android.widget.TextView r8 = r6.A02
            r8.getClass()
            r5 = 17
            goto L_0x0121
        L_0x01ae:
            X.2eb r5 = r6.A09
            r5.A02()
            goto L_0x0171
        L_0x01b4:
            X.2eb r5 = r6.A0A
            r5.A02()
            goto L_0x00b5
        L_0x01bb:
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = r6.A06
            goto L_0x005a
        L_0x01bf:
            android.content.Context r2 = r1.A00
            r27 = r2
            X.0iw r14 = r1.A02
            java.lang.Object r13 = X.DbT.A0o(r33)
            X.F0s r13 = (X.C49661F0s) r13
            int r3 = r17.intValue()
            X.DdG r2 = r1.A06
            com.instagram.model.reels.Reel r19 = r2.A00(r0)
            X.G9f r2 = r1.A01
            com.instagram.common.session.UserSession r4 = r1.A03
            X.Drm r7 = r1.A05
            X.2eb r5 = r13.A03
            android.view.View r8 = r5.A01()
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r8 = (com.instagram.reels.ui.badge.ReelBrandingBadgeView) r8
            int r5 = r0.A00
            r6 = 192(0xc0, float:2.69E-43)
            if (r5 != r6) goto L_0x0338
            com.instagram.model.hashtag.HashtagImpl r5 = r0.A02()
            if (r5 == 0) goto L_0x0338
            X.5Gj r5 = r0.A04
            com.instagram.common.typedurl.ImageUrl r9 = r5.A01
            boolean r5 = X.C253833rU.A02(r9)
            if (r5 != 0) goto L_0x0338
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = r13.A02
            r5.setUrl(r9, r14)
            r5 = 0
            r8.setVisibility(r5)
            X.3Nl r5 = X.C240993Nl.HASHTAG
            r8.A03(r5)
        L_0x0207:
            X.Exr r8 = new X.Exr
            r8.<init>(r3)
            X.EVf r5 = X.C48087EVf.START_AVATAR
            r8.A01 = r5
            com.instagram.common.ui.widget.imageview.CircularImageView r9 = r13.A02
            r12 = 1
            X.FO5 r5 = new X.FO5
            r20 = r5
            r21 = r3
            r22 = r12
            r23 = r0
            r24 = r2
            r25 = r8
            r20.<init>(r21, r22, r23, r24, r25)
            X.AnonymousClass0fU.A00(r5, r9)
            X.C50110FPa.A00(r9, r2, r0, r3, r12)
            r8 = 0
            int r5 = r0.A00
            if (r5 != r6) goto L_0x032e
            com.instagram.model.hashtag.HashtagImpl r5 = r0.A02()
            if (r5 == 0) goto L_0x032e
            r5 = 0
        L_0x0236:
            r18 = r9
            r20 = r2
            r21 = r0
            r22 = r5
            r23 = r3
            r24 = r8
            X.FCH.A01(r18, r19, r20, r21, r22, r23, r24)
            android.widget.TextView r5 = r13.A01
            android.view.View r10 = r13.A00
            r24 = r7
            r25 = r0
            r26 = r3
            r18 = r27
            r19 = r10
            r20 = r9
            r21 = r5
            r22 = r4
            r23 = r2
            X.FGO.A04(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.2eb r5 = r13.A04
            android.view.View r7 = r5.A01()
            com.instagram.hashtag.ui.HashtagFollowButton r7 = (com.instagram.hashtag.ui.HashtagFollowButton) r7
            int r5 = r0.A00
            if (r5 != r6) goto L_0x0323
            com.instagram.model.hashtag.HashtagImpl r5 = r0.A02()
            if (r5 == 0) goto L_0x0323
            com.instagram.model.hashtag.HashtagImpl r6 = r0.A02()
            r6.getClass()
            r7.setVisibility(r8)
            r7.A01(r14, r2, r6)
            java.lang.String r5 = r6.getId()
            if (r5 == 0) goto L_0x028a
            java.lang.String r5 = r6.getId()
            r2.Ecc(r0, r5, r3)
        L_0x028a:
            X.2eb r5 = r13.A07
            android.view.View r15 = r5.A01()
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            r15.removeAllViews()
            X.5Gj r5 = r0.A04
            java.util.List r5 = r5.A0x
            if (r5 == 0) goto L_0x034e
            int r11 = r5.size()
            r10 = 0
        L_0x02a0:
            if (r10 >= r11) goto L_0x034e
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r27)
            r5 = 2131629148(0x7f0e145c, float:1.8885609E38)
            android.view.View r9 = X.DbU.A08(r6, r5)
            com.instagram.common.ui.widget.imageview.IgImageView r9 = (com.instagram.common.ui.widget.imageview.IgImageView) r9
            X.5Gj r5 = r0.A04
            java.util.List r5 = r5.A0x
            r5.getClass()
            java.lang.Object r5 = r5.get(r10)
            X.9Iu r5 = (X.C376649Iu) r5
            java.lang.Object r5 = r5.A00
            com.instagram.common.typedurl.ImageUrl r5 = (com.instagram.common.typedurl.ImageUrl) r5
            if (r5 == 0) goto L_0x02c5
            r9.setUrl(r5, r14)
        L_0x02c5:
            X.FO4 r5 = new X.FO4
            r18 = r5
            r19 = r2
            r20 = r10
            r21 = r0
            r22 = r3
            r23 = r12
            r18.<init>(r19, r20, r21, r22, r23)
            X.AnonymousClass0fU.A00(r5, r9)
            android.content.res.Resources r5 = r27.getResources()
            r6 = 2131165250(0x7f070042, float:1.7944712E38)
            float r7 = r5.getDimension(r6)
            r6 = 2131165253(0x7f070045, float:1.7944718E38)
            float r6 = r5.getDimension(r6)
            float r7 = r7 + r6
            android.util.DisplayMetrics r6 = r5.getDisplayMetrics()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r7 = r7 / r5
            android.graphics.RectF r5 = X.0nA.A01
            float r5 = android.util.TypedValue.applyDimension(r12, r7, r6)
            int r6 = (int) r5
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r6, r6)
            r9.setLayoutParams(r5)
            android.content.res.Resources r8 = r9.getResources()
            r7 = 2131968351(0x7f13415f, float:1.9573594E38)
            int r10 = r10 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            java.lang.String r5 = X.DbV.A0w(r8, r6, r5, r7)
            r9.setContentDescription(r5)
            r15.addView(r9)
            goto L_0x02a0
        L_0x0323:
            r5 = 0
            r10.setOnClickListener(r5)
            r5 = 8
            r7.setVisibility(r5)
            goto L_0x028a
        L_0x032e:
            X.2eb r5 = r13.A08
            android.view.View r5 = r5.A01()
            com.instagram.ui.widget.gradientspinner.GradientSpinner r5 = (com.instagram.ui.widget.gradientspinner.GradientSpinner) r5
            goto L_0x0236
        L_0x0338:
            X.5Gj r5 = r0.A04
            com.instagram.common.typedurl.ImageUrl r9 = r5.A0E
            boolean r5 = X.C253833rU.A02(r9)
            if (r5 != 0) goto L_0x0207
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = r13.A02
            r5.setUrl(r9, r14)
            r5 = 8
            r8.setVisibility(r5)
            goto L_0x0207
        L_0x034e:
            r4.getClass()
            X.2eb r9 = r13.A06
            X.2eb r11 = r13.A05
            goto L_0x0b83
        L_0x0357:
            android.content.Context r9 = r1.A00
            com.instagram.common.session.UserSession r4 = r1.A03
            X.0iw r12 = r1.A02
            java.lang.Object r8 = X.DbT.A0o(r33)
            X.Fej r8 = (X.C50574Fej) r8
            int r3 = r17.intValue()
            X.DdG r2 = r1.A06
            com.instagram.model.reels.Reel r19 = r2.A00(r0)
            X.G9f r2 = r1.A01
            X.Drm r7 = r1.A05
            X.FCH.A00(r12, r2, r8, r0, r3)
            com.instagram.user.model.User r11 = r0.A04()
            X.2eb r5 = r8.A03
            if (r11 == 0) goto L_0x040f
            android.view.View r10 = r5.A01()
            com.instagram.user.follow.FollowButtonBase r10 = (com.instagram.user.follow.FollowButtonBase) r10
            r5 = 0
            r10.setVisibility(r5)
            X.4at r6 = r10.A0J
            r5 = 0
            r6.A00 = r5
            X.3aK r5 = X.C243923aK.MEDIUM
            r10.setBaseStyle(r5)
            r6.A07(r2)
            r6.A03(r12, r4, r11)
            java.lang.String r5 = r11.getId()
            r2.Ecc(r0, r5, r3)
            X.C267154b3.A02(r10, r4, r5)
        L_0x03a0:
            com.instagram.user.model.User r5 = r0.A04()
            if (r5 == 0) goto L_0x03a9
            r5.B6o()
        L_0x03a9:
            X.2eb r5 = r8.A06
            r5.A02()
            X.Exr r10 = new X.Exr
            r10.<init>(r3)
            X.EVf r5 = X.C48087EVf.CONTAINER
            r10.A01 = r5
            android.view.View r6 = r8.A00
            r22 = 2
            X.FO5 r5 = new X.FO5
            r20 = r5
            r21 = r3
            r23 = r0
            r24 = r2
            r25 = r10
            r20.<init>(r21, r22, r23, r24, r25)
            X.AnonymousClass0fU.A00(r5, r6)
            boolean r24 = X.FCH.A02(r0)
            X.2eb r5 = r8.A07
            android.view.View r5 = r5.A01()
            com.instagram.ui.widget.gradientspinner.GradientSpinner r5 = (com.instagram.ui.widget.gradientspinner.GradientSpinner) r5
            com.instagram.common.ui.widget.imageview.CircularImageView r10 = r8.A02
            r18 = r10
            r20 = r2
            r21 = r0
            r22 = r5
            r23 = r3
            X.FCH.A01(r18, r19, r20, r21, r22, r23, r24)
            boolean r5 = X.FCH.A02(r0)
            if (r5 == 0) goto L_0x03f2
            com.instagram.ui.widget.stackedavatar.StackedAvatarView r10 = r8.ByY()
        L_0x03f2:
            android.widget.TextView r5 = r8.A01
            r24 = r7
            r25 = r0
            r26 = r3
            r18 = r9
            r19 = r6
            r20 = r10
            r21 = r5
            r22 = r4
            r23 = r2
            X.FGO.A04(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.2eb r9 = r8.A05
            X.2eb r11 = r8.A04
            goto L_0x0b83
        L_0x040f:
            r5.A02()
            goto L_0x03a0
        L_0x0413:
            android.content.Context r10 = r1.A00
            X.0iw r5 = r1.A02
            java.lang.Object r6 = X.DbT.A0o(r33)
            X.Fek r6 = (X.C50575Fek) r6
            int r3 = r17.intValue()
            X.DdG r2 = r1.A06
            com.instagram.model.reels.Reel r27 = r2.A00(r0)
            X.G9f r2 = r1.A01
            com.instagram.common.session.UserSession r4 = r1.A03
            X.Drm r9 = r1.A05
            X.FCH.A00(r5, r2, r6, r0, r3)
            boolean r5 = X.FCH.A02(r0)
            if (r5 == 0) goto L_0x04a5
            com.instagram.ui.widget.stackedavatar.StackedAvatarView r5 = r6.ByY()
        L_0x043a:
            android.widget.TextView r8 = r6.A01
            android.view.View r7 = r6.A00
            r24 = r9
            r25 = r0
            r26 = r3
            r18 = r10
            r19 = r7
            r20 = r5
            r21 = r8
            r22 = r4
            r23 = r2
            X.FGO.A04(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.DgL r5 = r0.A03()
            if (r5 != 0) goto L_0x045e
            r5 = 8
            A01(r7, r2, r0, r3, r5)
        L_0x045e:
            boolean r32 = X.FCH.A02(r0)
            X.2eb r5 = r6.A06
            android.view.View r7 = r5.A01()
            com.instagram.ui.widget.gradientspinner.GradientSpinner r7 = (com.instagram.ui.widget.gradientspinner.GradientSpinner) r7
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = r6.A02
            r26 = r5
            r28 = r2
            r29 = r0
            r30 = r7
            r31 = r3
            X.FCH.A01(r26, r27, r28, r29, r30, r31, r32)
            int r8 = r0.A00
            r7 = 583(0x247, float:8.17E-43)
            X.2eb r5 = r6.A07
            if (r8 != r7) goto L_0x049c
            r8 = 0
            r5.A03(r8)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            X.5Gj r5 = r0.A04
            java.lang.Boolean r5 = r5.A03
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x049f
            X.2eb r5 = r6.A03
            r5.A03(r8)
        L_0x0496:
            X.2eb r9 = r6.A05
            X.2eb r11 = r6.A04
            goto L_0x0b83
        L_0x049c:
            r5.A02()
        L_0x049f:
            X.2eb r5 = r6.A03
            r5.A02()
            goto L_0x0496
        L_0x04a5:
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = r6.A02
            goto L_0x043a
        L_0x04a8:
            X.0iw r7 = r1.A02
            java.lang.Object r6 = X.DbT.A0o(r33)
            X.EzP r6 = (X.C49606EzP) r6
            int r3 = r17.intValue()
            X.G9f r2 = r1.A01
            android.view.View r5 = r6.A00
            r4 = 14
            A01(r5, r2, r0, r3, r4)
            X.Fna r5 = new X.Fna
            r5.<init>(r0)
            r4 = 0
            X.C49164EqV.A00(r7, r6, r5, r4)
            goto L_0x0d19
        L_0x04c8:
            android.content.Context r12 = r1.A00
            X.0iw r11 = r1.A02
            java.lang.Object r10 = X.DbT.A0o(r33)
            X.Ez4 r10 = (X.Ez4) r10
            int r3 = r17.intValue()
            X.G9f r2 = r1.A01
            X.Drm r8 = r1.A05
            com.instagram.common.session.UserSession r7 = r1.A03
            com.instagram.common.ui.widget.imageview.CircularImageView r6 = r10.A02
            X.5Gj r4 = r0.A04
            com.instagram.common.typedurl.ImageUrl r4 = r4.A0E
            java.lang.String r5 = "ProfileImageURL"
            if (r4 != 0) goto L_0x04f7
            java.lang.String r4 = " is null"
            java.lang.String r5 = X.002.A0R(r5, r4)
            java.lang.String r4 = "NewsfeedStoryRowBinderDirectShare"
            X.0wb.A03(r4, r5)
            java.lang.String r4 = ""
            com.instagram.common.typedurl.SimpleImageUrl r4 = X.DbS.A0V(r4)
        L_0x04f7:
            r6.setUrl(r4, r11)
            r4 = 11
            A01(r6, r2, r0, r3, r4)
            r4 = 2
            X.C50110FPa.A00(r6, r2, r0, r3, r4)
            android.widget.TextView r4 = r10.A01
            android.view.View r9 = r10.A00
            r24 = r8
            r25 = r0
            r26 = r3
            r18 = r12
            r19 = r9
            r20 = r6
            r21 = r4
            r22 = r7
            r23 = r2
            X.FGO.A04(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            com.instagram.common.ui.widget.imageview.IgImageView r6 = r10.A03
            com.instagram.common.typedurl.ImageUrl r4 = r0.A01()
            java.lang.String r5 = "MediaImageURL"
            if (r4 != 0) goto L_0x0537
            java.lang.String r4 = " is null"
            java.lang.String r5 = X.002.A0R(r5, r4)
            java.lang.String r4 = "NewsfeedStoryRowBinderDirectShare"
            X.0wb.A03(r4, r5)
            java.lang.String r4 = ""
            com.instagram.common.typedurl.SimpleImageUrl r4 = X.DbS.A0V(r4)
        L_0x0537:
            r6.setUrl(r4, r11)
            r4 = 12
            X.FPA r5 = new X.FPA
            r5.<init>((X.C51959G9f) r2, (X.C283155Gi) r0, (int) r3, (int) r4)
            X.AnonymousClass0fU.A00(r5, r6)
            r4 = 3
            X.C50110FPa.A00(r6, r2, r0, r3, r4)
            goto L_0x0d16
        L_0x054a:
            android.content.Context r9 = r1.A00
            X.0iw r10 = r1.A02
            java.lang.Object r6 = X.DbT.A0o(r33)
            X.Ez3 r6 = (X.Ez3) r6
            int r3 = r17.intValue()
            X.G9f r2 = r1.A01
            X.Drm r8 = r1.A05
            com.instagram.common.session.UserSession r7 = r1.A03
            android.view.View r5 = r6.A00
            r4 = 10
            A01(r5, r2, r0, r3, r4)
            android.widget.TextView r5 = r6.A01
            X.JS9 r21 = X.JS9.A01
            r22 = r8
            r23 = r0
            r24 = r3
            r18 = r9
            r19 = r7
            r20 = r2
            android.text.SpannableStringBuilder r4 = X.FGO.A00(r18, r19, r20, r21, r22, r23, r24)
            r5.setText(r4)
            X.5Gj r4 = r0.A04
            java.lang.String r4 = r4.A0r
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r8 = 0
            r9 = 8
            android.widget.TextView r5 = r6.A02
            if (r4 != 0) goto L_0x05bb
            X.5Gj r4 = r0.A04
            java.lang.String r4 = r4.A0r
            r5.setText(r4)
            r5.setVisibility(r8)
        L_0x0595:
            com.instagram.common.typedurl.ImageUrl r7 = r0.A01()
            X.DgL r5 = r0.A03()
            java.lang.String r4 = "creator_suspected_bc_review"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x05bf
            if (r7 == 0) goto L_0x05bf
            com.instagram.common.ui.widget.imageview.IgImageView r6 = r6.A03
            r6.setUrl(r7, r10)
            android.content.res.Resources r5 = r6.getResources()
            r4 = 2131968352(0x7f134160, float:1.9573596E38)
            X.DbT.A1A(r5, r6, r4)
            r6.setVisibility(r8)
            goto L_0x0d19
        L_0x05bb:
            r5.setVisibility(r9)
            goto L_0x0595
        L_0x05bf:
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r6.A03
            goto L_0x0a5f
        L_0x05c3:
            android.content.Context r9 = r1.A00
            com.instagram.common.session.UserSession r8 = r1.A03
            X.0iw r10 = r1.A02
            java.lang.Object r6 = X.DbT.A0o(r33)
            X.Ez2 r6 = (X.Ez2) r6
            int r3 = r17.intValue()
            X.G9f r2 = r1.A01
            X.Drm r7 = r1.A05
            android.view.View r5 = r6.A00
            r20 = 3
            X.FO5 r4 = new X.FO5
            r18 = r4
            r19 = r3
            r21 = r8
            r22 = r0
            r23 = r2
            r18.<init>(r19, r20, r21, r22, r23)
            X.AnonymousClass0fU.A00(r4, r5)
            com.instagram.common.typedurl.ImageUrl r4 = r0.A01()
            if (r4 == 0) goto L_0x0628
            com.instagram.common.typedurl.ImageUrl r5 = r0.A01()
        L_0x05f7:
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r6.A03
            r4.setUrl(r5, r10)
            android.widget.TextView r5 = r6.A01
            X.JS9 r10 = X.JS9.A01
            r11 = r7
            r12 = r0
            r13 = r3
            r7 = r9
            r9 = r2
            android.text.SpannableStringBuilder r4 = X.FGO.A00(r7, r8, r9, r10, r11, r12, r13)
            r5.setText(r4)
            X.5Gj r4 = r0.A04
            java.lang.String r4 = r4.A0r
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            android.widget.TextView r5 = r6.A02
            if (r4 != 0) goto L_0x0625
            X.5Gj r4 = r0.A04
            java.lang.String r4 = r4.A0r
            r5.setText(r4)
            r4 = 0
        L_0x0620:
            r5.setVisibility(r4)
            goto L_0x0d19
        L_0x0625:
            r4 = 8
            goto L_0x0620
        L_0x0628:
            java.lang.String r4 = ""
            com.instagram.common.typedurl.SimpleImageUrl r5 = X.DbS.A0V(r4)
            goto L_0x05f7
        L_0x062f:
            com.instagram.common.session.UserSession r12 = r1.A03
            X.0iw r11 = r1.A02
            java.lang.Object r10 = X.DbT.A0o(r33)
            X.F0c r10 = (X.C49645F0c) r10
            int r3 = r17.intValue()
            X.G9f r2 = r1.A01
            X.Drm r4 = r1.A05
            r18 = r4
            android.view.View r4 = r10.A00
            r19 = r4
            android.content.Context r14 = r19.getContext()
            X.5Gj r4 = r0.A04
            com.instagram.common.typedurl.ImageUrl r4 = r4.A01
            if (r4 == 0) goto L_0x073c
            com.instagram.common.ui.widget.imageview.CircularImageView r13 = r10.A03
            r13.setUrl(r4, r11)
            int r5 = r0.A00
            r4 = 77
            if (r5 == r4) goto L_0x0660
            r4 = 150(0x96, float:2.1E-43)
            if (r5 != r4) goto L_0x0677
        L_0x0660:
            android.content.res.Resources r5 = r14.getResources()
            r4 = 2131165193(0x7f070009, float:1.7944596E38)
            int r4 = r5.getDimensionPixelSize(r4)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r4, r4)
            r4 = 0
            r5.setMargins(r4, r4, r4, r4)
            r13.setLayoutParams(r5)
        L_0x0677:
            int r4 = X.2Yu.A01(r14)
            android.graphics.ColorFilter r5 = X.AnonymousClass37O.A00(r4)
            android.graphics.drawable.Drawable r4 = r13.getDrawable()
            r9 = 159(0x9f, float:2.23E-43)
            if (r4 == 0) goto L_0x06a2
            int r6 = r0.A00
            r4 = 241(0xf1, float:3.38E-43)
            if (r6 == r4) goto L_0x06a2
            if (r6 == r9) goto L_0x06a2
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            X.5Gj r4 = r0.A04
            java.lang.Boolean r4 = r4.A0M
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x06a2
            android.graphics.drawable.Drawable r4 = r13.getDrawable()
            X.AnonymousClass7TG.A10(r5, r4)
        L_0x06a2:
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r10.A04
            boolean r4 = r0.A0G()
            r15 = 8
            r7 = 0
            int r4 = X.DbW.A01(r4)
            r5.setVisibility(r4)
            com.instagram.common.typedurl.ImageUrl r4 = r0.A01()
            X.2eb r8 = r10.A05
            if (r4 == 0) goto L_0x072e
            android.view.View r5 = r8.A01()
            com.instagram.common.ui.widget.imageview.IgImageView r5 = (com.instagram.common.ui.widget.imageview.IgImageView) r5
            com.instagram.common.typedurl.ImageUrl r4 = r0.A01()
            r5.setUrl(r4, r11)
            r5.setVisibility(r7)
            int r6 = r0.A00
            r4 = 219(0xdb, float:3.07E-43)
            if (r6 != r4) goto L_0x072b
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_END
        L_0x06d2:
            r5.setScaleType(r4)
        L_0x06d5:
            com.instagram.model.hashtag.HashtagImpl r6 = r0.A02()
            int r5 = r0.A00
            r4 = 192(0xc0, float:2.69E-43)
            if (r5 != r4) goto L_0x0723
            if (r6 == 0) goto L_0x0723
            java.lang.String r5 = r6.A0C
            if (r5 == 0) goto L_0x0723
            com.instagram.hashtag.ui.HashtagFollowButton r4 = r10.A06
            r4.setVisibility(r7)
            r4.A01(r11, r2, r6)
            r2.Ecc(r0, r5, r3)
        L_0x06f0:
            int r6 = r0.A00
            android.widget.ImageView r5 = r10.A01
            r4 = 370(0x172, float:5.18E-43)
            if (r6 == r4) goto L_0x071c
            r4 = 8
        L_0x06fa:
            r5.setVisibility(r4)
            int r5 = r0.A00
            if (r5 == r9) goto L_0x0705
            r4 = 459(0x1cb, float:6.43E-43)
            if (r5 != r4) goto L_0x078c
        L_0x0705:
            java.util.Map r6 = r0.A0D()
            if (r6 == 0) goto L_0x077c
            java.lang.String r4 = "lat"
            java.lang.String r5 = X.DbT.A11(r4, r6)
            java.lang.String r4 = "long"
            java.lang.String r4 = X.DbT.A11(r4, r6)
            if (r5 == 0) goto L_0x077c
            if (r4 == 0) goto L_0x077c
            goto L_0x0757
        L_0x071c:
            r4 = 61
            X.FP3.A00(r5, r4, r12)
            r4 = 0
            goto L_0x06fa
        L_0x0723:
            com.instagram.hashtag.ui.HashtagFollowButton r4 = r10.A06
            if (r4 == 0) goto L_0x06f0
            r4.setVisibility(r15)
            goto L_0x06f0
        L_0x072b:
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_CROP
            goto L_0x06d2
        L_0x072e:
            boolean r4 = r8.A04()
            if (r4 == 0) goto L_0x06d5
            android.view.View r4 = r8.A01()
            X.0nA.A0O(r4)
            goto L_0x06d5
        L_0x073c:
            android.content.res.Resources r6 = r14.getResources()
            com.instagram.common.ui.widget.imageview.CircularImageView r13 = r10.A03
            boolean r5 = r0.A0G()
            r4 = 2131239360(0x7f0821c0, float:1.8095025E38)
            if (r5 == 0) goto L_0x074e
            r4 = 2131237244(0x7f08197c, float:1.8090733E38)
        L_0x074e:
            android.graphics.drawable.Drawable r4 = r6.getDrawable(r4)
            r13.setImageDrawable(r4)
            goto L_0x0677
        L_0x0757:
            double r6 = java.lang.Double.parseDouble(r5)     // Catch:{ NumberFormatException -> 0x077c }
            double r4 = java.lang.Double.parseDouble(r4)     // Catch:{ NumberFormatException -> 0x077c }
            android.view.View r8 = r8.A01()
            com.instagram.common.ui.widget.imageview.IgImageView r8 = (com.instagram.common.ui.widget.imageview.IgImageView) r8
            java.lang.String r4 = X.DdU.A00(r14, r6, r4)
            X.DbV.A1P(r11, r8, r4)
            r4 = 13
            X.FPA r5 = new X.FPA
            r5.<init>((X.C51959G9f) r2, (X.C283155Gi) r0, (int) r3, (int) r4)
            android.graphics.RectF r4 = X.0nA.A01
            r4 = 0
            r8.setVisibility(r4)
            X.AnonymousClass0fU.A00(r5, r8)
        L_0x077c:
            r13.clearColorFilter()
            int r5 = r0.A00
            r4 = 2131240226(0x7f082522, float:1.8096781E38)
            if (r5 != r9) goto L_0x0789
            r4 = 2131239158(0x7f0820f6, float:1.8094615E38)
        L_0x0789:
            X.DbU.A13(r14, r13, r4)
        L_0x078c:
            int r5 = r0.A00
            r4 = 504(0x1f8, float:7.06E-43)
            if (r5 != r4) goto L_0x079b
            r13.clearColorFilter()
            r4 = 2131239158(0x7f0820f6, float:1.8094615E38)
            X.DbU.A13(r14, r13, r4)
        L_0x079b:
            android.widget.TextView r4 = r10.A02
            r24 = r18
            r25 = r0
            r26 = r3
            r18 = r14
            r20 = r13
            r21 = r4
            r22 = r12
            goto L_0x0adc
        L_0x07ad:
            X.0iw r7 = r1.A02
            java.lang.Object r6 = X.DbT.A0o(r33)
            X.Ez5 r6 = (X.Ez5) r6
            int r3 = r17.intValue()
            X.G9f r2 = r1.A01
            X.Drm r10 = r1.A05
            com.instagram.common.session.UserSession r9 = r1.A03
            android.view.View r11 = r6.A00
            android.content.Context r8 = r11.getContext()
            X.Exr r5 = new X.Exr
            r5.<init>(r3)
            X.EVf r4 = X.C48087EVf.CONTAINER
            r5.A01 = r4
            r20 = 4
            X.FO5 r4 = new X.FO5
            r18 = r4
            r19 = r3
            r21 = r0
            r22 = r2
            r23 = r5
            r18.<init>(r19, r20, r21, r22, r23)
            X.AnonymousClass0fU.A00(r4, r11)
            int r4 = X.2Yu.A01(r8)
            android.graphics.ColorFilter r11 = X.AnonymousClass37O.A00(r4)
            java.lang.String r4 = "coupon_offer_id"
            java.lang.String r4 = r0.A09(r4)
            if (r4 == 0) goto L_0x083c
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x083c
            android.widget.ImageView r5 = r6.A01
            r4 = 2131231467(0x7f0802eb, float:1.8079016E38)
        L_0x07fd:
            r5.setImageResource(r4)
            android.graphics.drawable.Drawable r4 = r5.getDrawable()
            r4.getClass()
            X.AnonymousClass7TG.A10(r11, r4)
            android.widget.TextView r5 = r6.A02
            X.JS9 r21 = X.JS9.A01
            r22 = r10
            r23 = r0
            r24 = r3
            r18 = r8
            r19 = r9
            r20 = r2
            android.text.SpannableStringBuilder r4 = X.FGO.A00(r18, r19, r20, r21, r22, r23, r24)
            r5.setText(r4)
            java.lang.String r4 = X.FGO.A01(r8, r10, r0)
            r5.setContentDescription(r4)
            com.instagram.common.typedurl.ImageUrl r4 = r0.A01()
            if (r4 != 0) goto L_0x086c
            X.5Gm r5 = r0.A05
            X.5Gm r4 = X.C283195Gm.INSIGHTS_ENTRY
            if (r5 != r4) goto L_0x086c
            int r5 = r0.A00
            r4 = 121(0x79, float:1.7E-43)
            if (r5 != r4) goto L_0x086c
            goto L_0x0d19
        L_0x083c:
            X.DgL r5 = X.C46518DgL.A2K
            X.DgL r4 = r0.A03()
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0866
            X.DgL r5 = X.C46518DgL.A09
            X.DgL r4 = r0.A03()
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0866
            X.DgL r5 = X.C46518DgL.A2M
            X.DgL r4 = r0.A03()
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0866
            android.widget.ImageView r5 = r6.A01
            r4 = 2131237832(0x7f081bc8, float:1.8091926E38)
            goto L_0x07fd
        L_0x0866:
            android.widget.ImageView r5 = r6.A01
            r4 = 2131239626(0x7f0822ca, float:1.8095564E38)
            goto L_0x07fd
        L_0x086c:
            com.instagram.common.typedurl.ImageUrl r4 = r0.A01()
            if (r4 == 0) goto L_0x087b
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r6.A03
            com.instagram.common.typedurl.ImageUrl r4 = r0.A01()
            r5.setUrl(r4, r7)
        L_0x087b:
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r6.A03
            android.content.res.Resources r5 = r8.getResources()
            r4 = 2131968352(0x7f134160, float:1.9573596E38)
            java.lang.String r4 = r5.getString(r4)
            goto L_0x08b6
        L_0x0889:
            android.content.Context r9 = r1.A00
            java.lang.Object r8 = X.DbT.A0o(r33)
            X.EwT r8 = (X.C49488EwT) r8
            int r3 = r17.intValue()
            X.G9f r2 = r1.A01
            X.Drm r7 = r1.A05
            com.instagram.common.session.UserSession r6 = r1.A03
            android.view.View r5 = r8.A00
            r4 = 9
            A01(r5, r2, r0, r3, r4)
            android.widget.TextView r8 = r8.A01
            X.JS9 r12 = X.JS9.A01
            r13 = r7
            r14 = r0
            r15 = r3
            r10 = r6
            r11 = r2
            android.text.SpannableStringBuilder r4 = X.FGO.A00(r9, r10, r11, r12, r13, r14, r15)
            r8.setText(r4)
            java.lang.String r4 = X.FGO.A01(r9, r7, r0)
        L_0x08b6:
            r8.setContentDescription(r4)
            goto L_0x0d19
        L_0x08bb:
            android.content.Context r11 = r1.A00
            java.lang.Object r8 = X.DbT.A0o(r33)
            X.Fel r8 = (X.C50576Fel) r8
            int r3 = r17.intValue()
            X.DdG r2 = r1.A06
            com.instagram.model.reels.Reel r27 = r2.A00(r0)
            X.G9f r2 = r1.A01
            X.0iw r5 = r1.A02
            X.Drm r10 = r1.A05
            com.instagram.common.session.UserSession r9 = r1.A03
            X.FCH.A00(r5, r2, r8, r0, r3)
            boolean r4 = X.FCH.A02(r0)
            if (r4 == 0) goto L_0x0a57
            com.instagram.ui.widget.stackedavatar.StackedAvatarView r4 = r8.ByY()
        L_0x08e2:
            android.widget.TextView r7 = r8.A03
            android.view.View r6 = r8.A01
            r24 = r10
            r25 = r0
            r26 = r3
            r18 = r11
            r19 = r6
            r20 = r4
            r21 = r7
            r22 = r9
            r23 = r2
            X.FGO.A04(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.2eb r4 = r8.A08
            android.view.View r13 = r4.A01()
            com.instagram.ui.widget.stackedmedia.StackedMediaView r13 = (com.instagram.ui.widget.stackedmedia.StackedMediaView) r13
            X.2eb r4 = r8.A06
            android.view.View r11 = r4.A01()
            com.instagram.common.ui.widget.imageview.IgImageView r11 = (com.instagram.common.ui.widget.imageview.IgImageView) r11
            X.Exr r10 = new X.Exr
            r10.<init>(r3)
            X.EVf r4 = X.C48087EVf.END_IMAGE
            r10.A01 = r4
            X.5Gj r4 = r0.A04
            java.util.List r9 = r4.A0x
            r4 = 1
            if (r9 == 0) goto L_0x0a54
            int r9 = r9.size()
            if (r9 <= r4) goto L_0x0a54
        L_0x0921:
            r9 = 8
            r12 = 0
            if (r4 == 0) goto L_0x09ac
            r13.setVisibility(r12)
            r11.setVisibility(r9)
            X.5Gj r4 = r0.A04
            java.util.List r4 = r4.A0x
            r4.getClass()
            java.lang.Object r4 = r4.get(r12)
            X.9Iu r4 = (X.C376649Iu) r4
            java.lang.Object r12 = r4.A00
            com.instagram.common.typedurl.ImageUrl r12 = (com.instagram.common.typedurl.ImageUrl) r12
            X.5Gj r4 = r0.A04
            java.util.List r11 = r4.A0x
            r11.getClass()
            r4 = 1
            java.lang.Object r4 = r11.get(r4)
            X.9Iu r4 = (X.C376649Iu) r4
            java.lang.Object r4 = r4.A00
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            r13.setUrls(r12, r4, r5)
            r24 = 2
            X.ICQ r4 = new X.ICQ
            r18 = r4
            r19 = r13
            r20 = r2
            r21 = r10
            r22 = r0
            r23 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24)
            X.AnonymousClass0fU.A00(r4, r13)
            r4 = 5
            X.C50110FPa.A00(r13, r2, r0, r3, r4)
        L_0x096c:
            r12 = 5
            X.FO5 r4 = new X.FO5
            r10 = r4
            r11 = r3
            r13 = r8
            r14 = r2
            r15 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            X.AnonymousClass0fU.A00(r4, r6)
            boolean r32 = X.FCH.A02(r0)
            X.2eb r4 = r8.A05
            android.view.View r5 = r4.A01()
            com.instagram.ui.widget.gradientspinner.GradientSpinner r5 = (com.instagram.ui.widget.gradientspinner.GradientSpinner) r5
            com.instagram.common.ui.widget.imageview.CircularImageView r4 = r8.A04
            r26 = r4
            r28 = r2
            r29 = r0
            r30 = r5
            r31 = r3
            X.FCH.A01(r26, r27, r28, r29, r30, r31, r32)
            X.5Gj r4 = r0.A04
            java.util.List r4 = r4.A0z
            if (r4 == 0) goto L_0x0a5b
            int r5 = r4.size()
            r4 = 2
            if (r5 != r4) goto L_0x0a5b
            X.Ft7 r4 = new X.Ft7
            r4.<init>(r8, r0)
            r7.post(r4)
            goto L_0x0d19
        L_0x09ac:
            X.5Gj r4 = r0.A04
            java.util.List r4 = r4.A0x
            r14 = 1
            if (r4 == 0) goto L_0x0a4c
            int r4 = r4.size()
            if (r4 != r14) goto L_0x0a4c
            r13.setVisibility(r9)
            r11.setVisibility(r12)
            com.instagram.common.typedurl.ImageUrl r4 = r0.A01()
            boolean r4 = X.C253833rU.A02(r4)
            if (r4 != 0) goto L_0x09eb
            com.instagram.common.typedurl.ImageUrl r4 = r0.A01()
            r11.setUrl(r4, r5)
        L_0x09d0:
            r24 = 3
            X.ICQ r4 = new X.ICQ
            r18 = r4
            r19 = r11
            r20 = r2
            r21 = r10
            r22 = r0
            r23 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24)
            X.AnonymousClass0fU.A00(r4, r11)
            r4 = 6
            X.C50110FPa.A00(r11, r2, r0, r3, r4)
            goto L_0x096c
        L_0x09eb:
            X.5Gj r4 = r0.A04
            java.util.List r4 = r4.A0x
            r4.getClass()
            java.lang.Object r4 = r4.get(r12)
            X.9Iu r4 = (X.C376649Iu) r4
            java.lang.Object r4 = r4.A00
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            if (r4 == 0) goto L_0x0a01
            r11.setUrl(r4, r5)
        L_0x0a01:
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            java.lang.String r4 = "Missing Image URL. story id: "
            r5.append(r4)
            java.lang.String r4 = r0.A09
            r5.append(r4)
            java.lang.String r4 = "; text: "
            r5.append(r4)
            X.5Gj r13 = r0.A04
            java.lang.String r4 = r13.A0o
            r5.append(r4)
            java.lang.String r4 = "; type: "
            r5.append(r4)
            X.5Gm r4 = r0.A05
            java.lang.String r4 = r4.name()
            r5.append(r4)
            java.lang.String r4 = "; story type: "
            r5.append(r4)
            int r4 = r0.A00
            r5.append(r4)
            java.lang.String r4 = "; media id: "
            r5.append(r4)
            java.util.List r4 = r13.A0x
            java.lang.Object r4 = r4.get(r12)
            X.9Iu r4 = (X.C376649Iu) r4
            java.lang.String r4 = r4.A01
            java.lang.String r5 = X.AnonymousClass7TF.A0l(r4, r5)
            java.lang.String r4 = "image_url_missing_newsfeed_story"
            X.0wb.A03(r4, r5)
            goto L_0x09d0
        L_0x0a4c:
            r13.setVisibility(r9)
            r11.setVisibility(r9)
            goto L_0x096c
        L_0x0a54:
            r4 = 0
            goto L_0x0921
        L_0x0a57:
            com.instagram.common.ui.widget.imageview.CircularImageView r4 = r8.A04
            goto L_0x08e2
        L_0x0a5b:
            com.instagram.ui.widget.pollresults.PollResultsView r4 = r8.A00
            if (r4 == 0) goto L_0x0d19
        L_0x0a5f:
            r4.setVisibility(r9)
            goto L_0x0d19
        L_0x0a64:
            android.content.Context r2 = r1.A00
            r18 = r2
            java.lang.Object r10 = X.DbT.A0o(r33)
            X.Fei r10 = (X.C50573Fei) r10
            int r3 = r17.intValue()
            X.0iw r13 = r1.A02
            X.G9f r2 = r1.A01
            X.Drm r9 = r1.A05
            com.instagram.common.session.UserSession r8 = r1.A03
            android.view.View r7 = r10.A00
            android.content.Context r5 = r7.getContext()
            com.instagram.common.ui.widget.imageview.CircularImageView r12 = r10.A02
            com.instagram.ui.widget.stackedavatar.StackedAvatarView r6 = r10.A03
            int r4 = X.2Yu.A0B(r5)
            android.graphics.ColorFilter r11 = X.DbV.A06(r5, r4)
            X.5Gj r4 = r0.A04
            com.instagram.common.typedurl.ImageUrl r15 = r4.A01
            r14 = 0
            r5 = 8
            if (r15 == 0) goto L_0x0ae6
            com.instagram.common.typedurl.ImageUrl r4 = r4.A0F
            boolean r4 = X.C253833rU.A02(r4)
            r4 = r4 ^ 1
            if (r4 != 0) goto L_0x0ae6
            r12.setUrl(r15, r13)
            r12.setVisibility(r14)
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            X.5Gj r4 = r0.A04
            java.lang.Boolean r4 = r4.A0M
            boolean r4 = r13.equals(r4)
            if (r4 == 0) goto L_0x0abb
            android.graphics.drawable.Drawable r4 = r12.getDrawable()
            r4.getClass()
            X.AnonymousClass7TG.A10(r11, r4)
        L_0x0abb:
            r6.setVisibility(r5)
        L_0x0abe:
            X.5Gj r4 = r0.A04
            com.instagram.common.typedurl.ImageUrl r4 = r4.A0F
            boolean r4 = X.C253833rU.A02(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0ae3
            com.instagram.ui.widget.stackedavatar.StackedAvatarView r5 = r10.A03
        L_0x0acc:
            android.widget.TextView r4 = r10.A01
            r24 = r9
            r25 = r0
            r26 = r3
            r19 = r7
            r20 = r5
            r21 = r4
            r22 = r8
        L_0x0adc:
            r23 = r2
            X.FGO.A04(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0d19
        L_0x0ae3:
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = r10.A02
            goto L_0x0acc
        L_0x0ae6:
            r12.setVisibility(r5)
            r6.setVisibility(r14)
            X.5Gj r4 = r0.A04
            com.instagram.common.typedurl.ImageUrl r5 = r4.A01
            com.instagram.common.typedurl.ImageUrl r4 = r4.A0F
            r6.setUrls(r5, r4, r13)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            X.5Gj r4 = r0.A04
            java.lang.Boolean r4 = r4.A0M
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0b04
            r6.setColorFilterOnFrontIcon(r11)
        L_0x0b04:
            android.content.Context r4 = r12.getContext()
            int r4 = X.2Yu.A00(r4)
            r6.setRingColor(r4)
            goto L_0x0abe
        L_0x0b10:
            android.content.Context r11 = r1.A00
            com.instagram.common.session.UserSession r4 = r1.A03
            X.0iw r9 = r1.A02
            java.lang.Object r8 = X.DbT.A0o(r33)
            X.Fem r8 = (X.C50577Fem) r8
            int r3 = r17.intValue()
            X.DdG r2 = r1.A06
            com.instagram.model.reels.Reel r27 = r2.A00(r0)
            X.G9f r2 = r1.A01
            X.Drm r10 = r1.A05
            X.FCH.A00(r9, r2, r8, r0, r3)
            boolean r5 = X.FCH.A02(r0)
            if (r5 == 0) goto L_0x0ca9
            com.instagram.ui.widget.stackedavatar.StackedAvatarView r5 = r8.ByY()
        L_0x0b37:
            android.widget.TextView r6 = r8.A03
            android.view.View r7 = r8.A02
            r24 = r10
            r25 = r0
            r26 = r3
            r18 = r11
            r19 = r7
            r20 = r5
            r21 = r6
            r22 = r4
            r23 = r2
            X.FGO.A04(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r32 = X.FCH.A02(r0)
            X.2eb r5 = r8.A08
            android.view.View r6 = r5.A01()
            com.instagram.ui.widget.gradientspinner.GradientSpinner r6 = (com.instagram.ui.widget.gradientspinner.GradientSpinner) r6
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = r8.A04
            r26 = r5
            r28 = r2
            r29 = r0
            r30 = r6
            r31 = r3
            X.FCH.A01(r26, r27, r28, r29, r30, r31, r32)
            com.instagram.user.model.User r10 = r0.A04()
            if (r10 != 0) goto L_0x0c18
            X.2eb r5 = r8.A05
            r5.A02()
            X.2eb r5 = r8.A09
            r5.A02()
        L_0x0b7b:
            r5 = 7
            A01(r7, r2, r0, r3, r5)
            X.2eb r9 = r8.A07
            X.2eb r11 = r8.A06
        L_0x0b83:
            r10 = 0
            X.0qQ.A0B(r4, r10)
            X.AnonymousClass7TG.A1O(r9, r11)
            X.FBa r8 = r0.A01
            if (r8 == 0) goto L_0x0cad
            boolean r5 = r8.A05
            if (r5 != 0) goto L_0x0cad
            java.util.List r5 = r8.A04
            if (r5 == 0) goto L_0x0d19
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)
            if (r5 == 0) goto L_0x0d19
            java.lang.Object r7 = X.00k.A0J(r5)
            X.F3R r7 = (X.F3R) r7
            if (r7 == 0) goto L_0x0d19
            android.view.View r6 = r9.A01()
            r5 = 2131442340(0x7f0b3aa4, float:1.8506717E38)
            android.widget.TextView r6 = X.AnonymousClass7TE.A0d(r6, r5)
            java.lang.String r5 = r7.A03
            r6.setText(r5)
            java.util.List r5 = r7.A05
            if (r5 == 0) goto L_0x0c16
            java.util.List r6 = java.util.Collections.unmodifiableList(r5)
        L_0x0bbc:
            r5 = 0
            if (r6 == 0) goto L_0x0c14
            java.lang.Object r6 = X.00k.A0O(r6, r10)
            X.F36 r6 = (X.F36) r6
        L_0x0bc5:
            r25 = 2131442321(0x7f0b3a91, float:1.8506679E38)
            r18 = r8
            r19 = r6
            r20 = r7
            r21 = r4
            r22 = r9
            r23 = r11
            r24 = r0
            X.C49011Enn.A00(r18, r19, r20, r21, r22, r23, r24, r25)
            java.util.List r6 = r7.A05
            if (r6 == 0) goto L_0x0bea
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)
            if (r6 == 0) goto L_0x0bea
            r5 = 1
            java.lang.Object r5 = X.00k.A0O(r6, r5)
            X.F36 r5 = (X.F36) r5
        L_0x0bea:
            r25 = 2131442322(0x7f0b3a92, float:1.850668E38)
            r19 = r5
            X.C49011Enn.A00(r18, r19, r20, r21, r22, r23, r24, r25)
            android.view.View r6 = r9.A01()
            r5 = 2131430342(0x7f0b0bc6, float:1.8482382E38)
            android.view.View r6 = r6.findViewById(r5)
            r19 = 3
            X.FOw r5 = new X.FOw
            r18 = r5
            r20 = r0
            r23 = r8
            r24 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24)
            X.AnonymousClass0fU.A00(r5, r6)
            r9.A03(r10)
            goto L_0x0d19
        L_0x0c14:
            r6 = r5
            goto L_0x0bc5
        L_0x0c16:
            r6 = 0
            goto L_0x0bbc
        L_0x0c18:
            boolean r5 = r10.A2D()
            r11 = 0
            X.2eb r6 = r8.A09
            if (r5 == 0) goto L_0x0c82
            r6.A03(r11)
            X.2eb r5 = r8.A05
            r5.A02()
            android.widget.TextView r5 = r8.A01
            if (r5 == 0) goto L_0x0c31
            android.view.View r5 = r8.A00
            if (r5 != 0) goto L_0x0c47
        L_0x0c31:
            android.view.View r6 = r6.A01()
            r5 = 2131440414(0x7f0b331e, float:1.850281E38)
            android.widget.TextView r5 = X.DbU.A0G(r6, r5)
            r8.A01 = r5
            r5 = 2131440420(0x7f0b3324, float:1.8502823E38)
            android.view.View r5 = r6.requireViewById(r5)
            r8.A00 = r5
        L_0x0c47:
            boolean r11 = r10.A1e()
            android.widget.TextView r6 = r8.A01
            r5 = 2131956481(0x7f131301, float:1.9549519E38)
            if (r11 == 0) goto L_0x0c55
            r5 = 2131972388(0x7f135124, float:1.9581782E38)
        L_0x0c55:
            r6.setText(r5)
            android.widget.TextView r6 = r8.A01
            r25 = 1
            X.FOx r5 = new X.FOx
            r18 = r5
            r19 = r9
            r20 = r4
            r21 = r2
            r22 = r0
            r23 = r10
            r24 = r3
            r18.<init>((X.AnonymousClass0iw) r19, (com.instagram.common.session.UserSession) r20, (X.C51959G9f) r21, (X.C283155Gi) r22, (com.instagram.user.model.User) r23, (int) r24, (int) r25)
            X.AnonymousClass0fU.A00(r5, r6)
            android.view.View r6 = r8.A00
            r25 = 2
            X.FOx r5 = new X.FOx
            r18 = r5
            r18.<init>((X.AnonymousClass0iw) r19, (com.instagram.common.session.UserSession) r20, (X.C51959G9f) r21, (X.C283155Gi) r22, (com.instagram.user.model.User) r23, (int) r24, (int) r25)
            X.AnonymousClass0fU.A00(r5, r6)
            goto L_0x0b7b
        L_0x0c82:
            r6.A02()
            X.2eb r5 = r8.A05
            r5.A03(r11)
            android.view.View r6 = r5.A01()
            com.instagram.user.follow.FollowButtonBase r6 = (com.instagram.user.follow.FollowButtonBase) r6
            X.3aK r5 = X.C243923aK.MEDIUM
            r6.setBaseStyle(r5)
            X.4at r6 = r6.A0J
            r5 = 0
            r6.A00 = r5
            r6.A07(r2)
            r6.A03(r9, r4, r10)
            java.lang.String r5 = r10.getId()
            r2.Ecc(r0, r5, r3)
            goto L_0x0b7b
        L_0x0ca9:
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = r8.A04
            goto L_0x0b37
        L_0x0cad:
            r9.A02()
            r11.A02()
            goto L_0x0d19
        L_0x0cb4:
            android.content.Context r12 = r1.A00
            java.lang.Object r9 = X.DbT.A0o(r33)
            X.EbP r9 = (X.C48244EbP) r9
            int r3 = r17.intValue()
            X.0iw r5 = r1.A02
            X.G9f r2 = r1.A01
            X.Drm r11 = r1.A05
            com.instagram.common.session.UserSession r10 = r1.A03
            X.5Gj r4 = r0.A04
            com.instagram.common.typedurl.ImageUrl r4 = r4.A01
            r8 = 0
            r7 = 8
            com.instagram.common.ui.widget.imageview.CircularImageView r6 = r9.A03
            if (r4 == 0) goto L_0x0d52
            r6.setUrl(r4, r5)
            r6.setVisibility(r8)
        L_0x0cd9:
            android.widget.TextView r5 = r9.A01
            android.view.View r4 = r9.A00
            r24 = r11
            r25 = r0
            r26 = r3
            r18 = r12
            r19 = r4
            r20 = r6
            r21 = r5
            r22 = r10
            r23 = r2
            X.FGO.A04(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.5Gj r5 = r0.A04
            X.JV7 r4 = r5.A0D
            if (r4 == 0) goto L_0x0d50
            java.lang.String r6 = r4.A02
        L_0x0cfa:
            X.0eM r4 = r5.A12
            java.lang.Object r5 = r4.getValue()
            android.widget.TextView r9 = r9.A02
            r9.setText(r6)
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 != 0) goto L_0x0d4b
            if (r5 == 0) goto L_0x0d4b
            r9.setVisibility(r8)
            r4 = 6
            X.FPA r5 = new X.FPA
            r5.<init>((X.C51959G9f) r2, (X.C283155Gi) r0, (int) r3, (int) r4)
        L_0x0d16:
            X.AnonymousClass0fU.A00(r5, r9)
        L_0x0d19:
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            android.content.Context r4 = r1.A00
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r5 = 2130968710(0x7f040086, float:1.7546081E38)
            r4 = 1
            r6.resolveAttribute(r5, r7, r4)
            int r5 = r7.resourceId
            r4 = r33
            r4.setBackgroundResource(r5)
            r6 = 2
            X.FPY r5 = new X.FPY
            r4 = r17
            r5.<init>(r6, r1, r4, r0)
            r1 = r33
            r1.setOnLongClickListener(r5)
            r2.DgM(r0, r3)
            r1 = 993249633(0x3b33c961, float:0.0027433264)
            r0 = r16
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0d4b:
            r9.setVisibility(r7)
            r5 = 0
            goto L_0x0d16
        L_0x0d50:
            r6 = 0
            goto L_0x0cfa
        L_0x0d52:
            r6.setVisibility(r7)
            goto L_0x0cd9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47638EAy.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        int i;
        C49009Enl enl = C49009Enl.$redex_init_class;
        switch (((C283155Gi) obj).A05.ordinal()) {
            case 0:
            case 10:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 13;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 7;
                break;
            case 9:
                i = 8;
                break;
            case 11:
                i = 9;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = 10;
                break;
            case 13:
                i = 11;
                break;
            case 14:
                i = 12;
                break;
            case 15:
                i = 14;
                break;
            case 16:
                i = 15;
                break;
            default:
                throw new IndexOutOfBoundsException("Unsupported item view type");
        }
        r3.A7U(i);
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        String str = ((C283155Gi) obj).A09;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r1 = r6.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getViewModelHash(int r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            r4 = this;
            X.5Gi r6 = (X.C283155Gi) r6
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == 0) goto L_0x0052
            r0 = 2
            if (r5 == r0) goto L_0x002f
            r0 = 4
            if (r5 != r0) goto L_0x005d
            X.5Gj r1 = r6.A04
            com.instagram.common.typedurl.ImageUrl r0 = r1.A0E
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r0.getUrl()
            int r2 = r0.hashCode()
            java.lang.Integer r0 = r1.A05
            int r0 = X.AnonymousClass7TG.A0A(r0)
        L_0x0021:
            int r2 = r2 * r0
        L_0x0022:
            X.5Gj r0 = r6.A04
            java.lang.String r0 = r0.A0o
            if (r2 != r3) goto L_0x002e
            if (r0 == 0) goto L_0x002e
            int r2 = r0.hashCode()
        L_0x002e:
            return r2
        L_0x002f:
            com.instagram.common.session.UserSession r1 = r4.A03
            com.instagram.user.model.User r0 = r6.A04()
            if (r0 == 0) goto L_0x0050
            com.instagram.user.model.FollowStatus r1 = X.DbV.A0i(r1, r0)
        L_0x003b:
            X.5Gj r0 = r6.A04
            com.instagram.common.typedurl.ImageUrl r0 = r0.A0E
            if (r0 == 0) goto L_0x005d
            if (r1 == 0) goto L_0x005d
            java.lang.String r0 = r0.getUrl()
            int r2 = r0.hashCode()
            int r0 = r1.hashCode()
            goto L_0x0021
        L_0x0050:
            r1 = 0
            goto L_0x003b
        L_0x0052:
            X.5Gj r0 = r6.A04
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x005d
            int r2 = r0.hashCode()
            goto L_0x0022
        L_0x005d:
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47638EAy.getViewModelHash(int, java.lang.Object, java.lang.Object):int");
    }

    public C47638EAy(Context context, AnonymousClass0iw r4, UserSession userSession, C51959G9f g9f, DdG ddG) {
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = r4;
        this.A01 = g9f;
        this.A04 = new C49353EuH(this);
        this.A06 = ddG;
        this.A05 = new C47171Drm(new C66217MIy(userSession, 29));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.Fei] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.EbP, java.lang.Object] */
    public final View createView(int i, ViewGroup viewGroup) {
        View view;
        int i2;
        int A032 = AnonymousClass0fD.A03(1853345349);
        switch (i) {
            case 0:
            case 15:
                view = A00(viewGroup, this);
                view.setTag(new C50578Fen(view));
                i2 = 2002873289;
                break;
            case 1:
                view = A00(viewGroup, this);
                view.setTag(new C49661F0s(view));
                i2 = 259522733;
                break;
            case 2:
                view = A00(viewGroup, this);
                view.setTag(new C50574Fej(view));
                i2 = 767813658;
                break;
            case 3:
                view = A00(viewGroup, this);
                view.setTag(new C50575Fek(view));
                i2 = 1435402158;
                break;
            case 4:
                view = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.row_group_follow_request);
                view.setTag(new C49606EzP(view));
                i2 = 1338263049;
                break;
            case 5:
                view = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.row_newsfeed_story_single_media);
                view.setTag(new Ez4(view));
                i2 = 830771668;
                break;
            case 6:
                view = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.row_newsfeed_story_copyright_video_removed);
                view.setTag(new Ez3(view));
                i2 = 1356274521;
                break;
            case 7:
                view = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.row_newsfeed_story_copyright_video_reinstated);
                view.setTag(new Ez2(view));
                i2 = 864059113;
                break;
            case 8:
                view = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.row_newsfeed_story_campaign_message);
                view.setTag(new C49645F0c(view));
                i2 = 20557044;
                break;
            case 9:
                view = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.row_newsfeed_story_insights_entry);
                view.setTag(new Ez5(view));
                i2 = -1657054813;
                break;
            case 10:
                view = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.row_newsfeed_story_canvas_preview);
                view.setTag(new C49488EwT(view));
                i2 = 1764012587;
                break;
            case 11:
                view = A00(viewGroup, this);
                view.setTag(new C50576Fel(view));
                i2 = 154328206;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                view = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.bundled_notification);
                ? obj = new Object();
                obj.A00 = view;
                obj.A02 = DbU.A0X(view, R.id.bundled_notification_imageview);
                obj.A03 = (StackedAvatarView) view.requireViewById(R.id.bundled_notification_stacked_avatar);
                obj.A01 = DbU.A0G(view, R.id.bundled_notification_row_text);
                view.setTag(obj);
                i2 = 1166479922;
                break;
            case 13:
                view = A00(viewGroup, this);
                view.setTag(new C50577Fem(view));
                i2 = 1224353313;
                break;
            case 14:
                view = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.row_icon_with_inline_button_view);
                ? obj2 = new Object();
                obj2.A00 = view;
                obj2.A03 = DbU.A0X(view, R.id.inline_button_notification_imageview);
                obj2.A01 = DbU.A0G(view, R.id.inline_button_notification_text);
                obj2.A02 = DbU.A0G(view, R.id.inline_button_notification_button);
                view.setTag(obj2);
                i2 = 2103079219;
                break;
            default:
                IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Unhandled view type");
                AnonymousClass0fD.A0A(-236688289, A032);
                throw indexOutOfBoundsException;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return view;
    }
}
