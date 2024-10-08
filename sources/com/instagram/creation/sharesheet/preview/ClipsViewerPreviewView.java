package com.instagram.creation.sharesheet.preview;

import X.0nA;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.DbX;
import X.DbY;
import X.JTP;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.follow.FollowButtonBase;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ClipsViewerPreviewView extends IgFrameLayout {
    public ViewGroup A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public final View A05;
    public final View A06;
    public final ViewGroup A07;
    public final ImageView A08;
    public final ImageView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final TextView A0E;
    public final IgImageView A0F;
    public final FollowButtonBase A0G;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClipsViewerPreviewView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00bc, code lost:
        if (r10.length() <= 0) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0040, code lost:
        if (r9.length() == 0) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0176, code lost:
        if (r0.size() <= 1) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0188, code lost:
        if (r4.A0K == null) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d0, code lost:
        if (r18 != false) goto L_0x01d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass0iw r35, com.instagram.common.session.UserSession r36, X.C293505kq r37, java.lang.String r38, java.lang.String r39, float r40, boolean r41) {
        /*
            r34 = this;
            r2 = 0
            r8 = 1
            r33 = r36
            r0 = r33
            X.0qQ.A0B(r0, r8)
            r3 = r34
            android.view.View r1 = r3.A06
            r0 = r40
            r1.setAlpha(r0)
            com.instagram.user.model.User r22 = X.AnonymousClass7TF.A0Q(r33)
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r3.A0F
            r5 = r35
            r0 = r22
            X.DbU.A1S(r5, r4, r0)
            android.widget.TextView r4 = r3.A0E
            X.DbU.A1H(r4, r0)
            com.instagram.user.follow.FollowButtonBase r0 = r3.A0G
            r0.A02()
            X.4at r6 = r0.A0J
            r4 = r33
            r0 = r22
            r6.A05(r4, r0)
            r13 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r9 = r38
            if (r38 == 0) goto L_0x0042
            int r0 = r9.length()
            r4 = 0
            if (r0 != 0) goto L_0x0043
        L_0x0042:
            r4 = 1
        L_0x0043:
            r6 = 8
            android.view.View r0 = r3.A05
            if (r4 == 0) goto L_0x0266
            r0.setVisibility(r6)
        L_0x004c:
            com.instagram.common.typedurl.ImageUrl r0 = r22.Bh3()
            com.instagram.common.typedurl.ImageUrl[] r0 = new com.instagram.common.typedurl.ImageUrl[]{r0}
            java.util.ArrayList r30 = X.0sr.A1M(r0)
            android.widget.ImageView r0 = r3.A09
            android.content.Context r15 = X.AnonymousClass7TE.A0S(r3)
            java.lang.String r29 = r5.getModuleName()
            android.content.res.Resources r5 = r3.getResources()
            r4 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r31 = r5.getDimensionPixelSize(r4)
            java.lang.Integer r26 = X.AnonymousClass05K.A00
            r25 = 0
            r24 = r15
            r27 = r25
            r28 = r25
            r32 = r2
            X.3b0 r4 = X.C244283aw.A05(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r0.setImageDrawable(r4)
            android.widget.TextView r9 = r3.A0C
            r4 = 2131964949(0x7f133415, float:1.9566694E38)
            java.lang.String r0 = r22.getUsername()
            X.Dbb.A0m(r5, r9, r0, r4)
            int r0 = X.2Yu.A0A(r15)
            X.DbT.A17(r15, r9, r0)
            java.util.Locale r9 = X.AnonymousClass1Q2.A02()
            android.widget.TextView r4 = r3.A0D
            java.text.NumberFormat r0 = java.text.NumberFormat.getInstance(r9)
            java.lang.String r0 = r0.format(r7)
            r4.setText(r0)
            android.widget.TextView r4 = r3.A0B
            java.text.NumberFormat r0 = java.text.NumberFormat.getInstance(r9)
            java.lang.String r0 = r0.format(r7)
            r4.setText(r0)
            r9 = r37
            java.lang.String r10 = r9.A0d
            if (r10 == 0) goto L_0x00be
            int r0 = r10.length()
            r4 = 1
            if (r0 > 0) goto L_0x00bf
        L_0x00be:
            r4 = 0
        L_0x00bf:
            java.lang.String r21 = "metaVerifiedLinkAttribution"
            java.lang.String r7 = "null cannot be cast to non-null type android.view.ViewGroup"
            android.view.ViewGroup r0 = r3.A02
            if (r4 == 0) goto L_0x025d
            if (r0 != 0) goto L_0x0258
            r0 = 2131436305(0x7f0b2311, float:1.8494477E38)
            android.view.View r0 = X.DbY.A0F(r1, r0)
            X.0qQ.A0C(r0, r7)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.A02 = r0
        L_0x00d7:
            android.view.ViewGroup r4 = r3.A02
            if (r4 == 0) goto L_0x0346
            r0 = 2131435130(0x7f0b1e7a, float:1.8492093E38)
            android.widget.TextView r0 = X.AnonymousClass7TG.A0R(r4, r0)
            r0.setText(r10)
            r20 = 1
        L_0x00e7:
            java.util.List r11 = r9.A0q
            java.lang.String r12 = "peopleTagView"
            if (r20 != 0) goto L_0x024f
            if (r11 == 0) goto L_0x024f
            boolean r0 = X.AnonymousClass7TE.A1b(r11)
            if (r0 != r8) goto L_0x024f
            android.view.ViewGroup r0 = r3.A04
            if (r0 != 0) goto L_0x024a
            r0 = 2131437577(0x7f0b2809, float:1.8497057E38)
            android.view.View r0 = X.DbY.A0F(r1, r0)
            X.0qQ.A0C(r0, r7)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.A04 = r0
        L_0x0107:
            android.view.ViewGroup r4 = r3.A04
            if (r4 == 0) goto L_0x02f4
            r0 = 2131435130(0x7f0b1e7a, float:1.8492093E38)
            android.widget.TextView r10 = X.AnonymousClass7TG.A0R(r4, r0)
            int r0 = r11.size()
            if (r0 != r8) goto L_0x0239
            java.lang.Object r0 = r11.get(r2)
            com.instagram.model.people.PeopleTag r0 = (com.instagram.model.people.PeopleTag) r0
            com.instagram.model.people.PeopleTag$UserInfo r0 = r0.A00
            java.lang.String r0 = r0.A04
        L_0x0122:
            X.0qQ.A07(r0)
            r10.setText(r0)
            r20 = 1
        L_0x012a:
            com.instagram.model.venue.LocationDict r10 = r9.A0L
            java.lang.String r12 = "locationView"
            if (r20 != 0) goto L_0x0230
            if (r10 == 0) goto L_0x0230
            android.view.ViewGroup r0 = r3.A01
            if (r0 != 0) goto L_0x022b
            r0 = 2131435654(0x7f0b2086, float:1.8493156E38)
            android.view.View r0 = X.DbY.A0F(r1, r0)
            X.0qQ.A0C(r0, r7)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.A01 = r0
        L_0x0144:
            android.view.ViewGroup r4 = r3.A01
            if (r4 == 0) goto L_0x02f4
            r0 = 2131435130(0x7f0b1e7a, float:1.8492093E38)
            android.widget.TextView r4 = X.AnonymousClass7TG.A0R(r4, r0)
            java.lang.String r0 = r10.A0K
            r4.setText(r0)
            r20 = 1
        L_0x0156:
            com.instagram.music.common.model.AudioOverlayTrack r6 = r9.A0N
            if (r6 == 0) goto L_0x015e
            com.instagram.music.common.model.MusicAssetModel r4 = r6.A08
            if (r4 != 0) goto L_0x016c
        L_0x015e:
            java.util.List r0 = r9.A0p
            if (r0 == 0) goto L_0x0228
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            if (r0 == 0) goto L_0x0228
            com.instagram.music.common.model.MusicAssetModel r4 = r0.A08
        L_0x016c:
            java.util.List r0 = r9.A0p
            if (r0 == 0) goto L_0x0178
            int r9 = r0.size()
            r19 = 1
            if (r9 > r8) goto L_0x017a
        L_0x0178:
            r19 = 0
        L_0x017a:
            if (r4 == 0) goto L_0x0225
            com.instagram.api.schemas.OriginalAudioSubtype r10 = r4.A01
        L_0x017e:
            com.instagram.api.schemas.OriginalAudioSubtype r9 = com.instagram.api.schemas.OriginalAudioSubtype.A06
            if (r10 != r9) goto L_0x018a
            if (r4 == 0) goto L_0x018a
            java.util.List r9 = r4.A0K
            r18 = 1
            if (r9 != 0) goto L_0x021b
        L_0x018a:
            r18 = 0
            if (r4 != 0) goto L_0x021b
            java.lang.String r9 = r22.getUsername()
            r10 = r39
            X.0eP r9 = X.AnonymousClass7TE.A1L(r10, r9)
        L_0x0198:
            java.lang.Object r10 = r9.A00
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r9.A01
            java.lang.String r9 = (java.lang.String) r9
            if (r10 == 0) goto L_0x0219
            boolean r11 = X.C51966G9m.A1X(r10)
            if (r11 != r8) goto L_0x0219
        L_0x01a8:
            java.lang.String r17 = "Required value was null."
            java.lang.String r21 = "musicAttribution"
            android.view.ViewGroup r8 = r3.A03
            if (r13 == 0) goto L_0x02fc
            if (r8 != 0) goto L_0x0215
            r8 = 2131436640(0x7f0b2460, float:1.8495156E38)
            android.view.View r8 = X.DbY.A0F(r1, r8)
            X.0qQ.A0C(r8, r7)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r3.A03 = r8
        L_0x01c0:
            android.view.ViewGroup r11 = r3.A03
            if (r11 == 0) goto L_0x0346
            r8 = 2131434047(0x7f0b1a3f, float:1.8489897E38)
            android.widget.ImageView r11 = X.DbX.A0J(r11, r8)
            if (r19 != 0) goto L_0x01d2
            r8 = 2131238578(0x7f081eb2, float:1.8093439E38)
            if (r18 == 0) goto L_0x01d5
        L_0x01d2:
            r8 = 2131238569(0x7f081ea9, float:1.809342E38)
        L_0x01d5:
            X.DbU.A13(r15, r11, r8)
            android.view.ViewGroup r11 = r3.A03
            if (r11 == 0) goto L_0x0346
            r8 = 2131435130(0x7f0b1e7a, float:1.8492093E38)
            android.widget.TextView r16 = X.DbU.A0G(r11, r8)
            if (r18 == 0) goto L_0x027d
            if (r4 == 0) goto L_0x0278
            java.util.List r13 = r4.A0K
            if (r13 == 0) goto L_0x0278
            android.text.SpannableStringBuilder r12 = X.C51965G9l.A0E()
            int r14 = r13.size()
            r11 = 0
        L_0x01f4:
            if (r11 >= r14) goto L_0x02e1
            java.lang.Object r8 = r13.get(r11)
            com.instagram.music.common.model.OriginalPartsAttributionModel r8 = (com.instagram.music.common.model.OriginalPartsAttributionModel) r8
            java.lang.String r10 = r8.A01
            java.lang.String r9 = r8.A02
            if (r11 <= 0) goto L_0x0207
            java.lang.String r8 = "  |  "
            r12.append(r8)
        L_0x0207:
            r12.append(r10)
            java.lang.String r8 = " • "
            r12.append(r8)
            r12.append(r9)
            int r11 = r11 + 1
            goto L_0x01f4
        L_0x0215:
            r8.setVisibility(r2)
            goto L_0x01c0
        L_0x0219:
            r13 = 0
            goto L_0x01a8
        L_0x021b:
            java.lang.String r10 = r4.A0D
            java.lang.String r9 = r4.A0I
            X.0eP r9 = X.AnonymousClass7TE.A1L(r10, r9)
            goto L_0x0198
        L_0x0225:
            r10 = 0
            goto L_0x017e
        L_0x0228:
            r4 = 0
            goto L_0x016c
        L_0x022b:
            r0.setVisibility(r2)
            goto L_0x0144
        L_0x0230:
            android.view.ViewGroup r0 = r3.A01
            if (r0 == 0) goto L_0x0156
            r0.setVisibility(r6)
            goto L_0x0156
        L_0x0239:
            r4 = 2131969342(0x7f13453e, float:1.9575604E38)
            int r0 = r11.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = X.DbW.A0h(r15, r0, r4)
            goto L_0x0122
        L_0x024a:
            r0.setVisibility(r2)
            goto L_0x0107
        L_0x024f:
            android.view.ViewGroup r0 = r3.A04
            if (r0 == 0) goto L_0x012a
            r0.setVisibility(r6)
            goto L_0x012a
        L_0x0258:
            r0.setVisibility(r2)
            goto L_0x00d7
        L_0x025d:
            if (r0 == 0) goto L_0x0262
            r0.setVisibility(r6)
        L_0x0262:
            r20 = 0
            goto L_0x00e7
        L_0x0266:
            r0.setVisibility(r2)
            android.widget.TextView r4 = r3.A0A
            r4.setText(r9)
            r4.setMaxLines(r8)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r0)
            goto L_0x004c
        L_0x0278:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x027d:
            if (r19 == 0) goto L_0x02cf
            if (r0 == 0) goto L_0x02ca
            android.text.SpannableStringBuilder r12 = X.C51965G9l.A0E()
            java.util.LinkedHashSet r14 = X.DbS.A0y()
            int r13 = r0.size()
            r11 = 0
        L_0x028e:
            if (r11 >= r13) goto L_0x02e1
            java.lang.Object r8 = r0.get(r11)
            com.instagram.music.common.model.AudioOverlayTrack r8 = (com.instagram.music.common.model.AudioOverlayTrack) r8
            com.instagram.music.common.model.MusicAssetModel r8 = r8.A08
            r9 = 0
            if (r8 == 0) goto L_0x02c8
            java.lang.String r10 = r8.A0D
        L_0x029d:
            java.lang.Object r8 = r0.get(r11)
            com.instagram.music.common.model.AudioOverlayTrack r8 = (com.instagram.music.common.model.AudioOverlayTrack) r8
            com.instagram.music.common.model.MusicAssetModel r8 = r8.A08
            if (r8 == 0) goto L_0x02a9
            java.lang.String r9 = r8.A0I
        L_0x02a9:
            java.lang.String r8 = X.002.A0R(r10, r9)
            boolean r8 = r14.add(r8)
            if (r8 == 0) goto L_0x02c5
            if (r11 <= 0) goto L_0x02ba
            java.lang.String r8 = "  |  "
            r12.append(r8)
        L_0x02ba:
            r12.append(r10)
            java.lang.String r8 = " • "
            r12.append(r8)
            r12.append(r9)
        L_0x02c5:
            int r11 = r11 + 1
            goto L_0x028e
        L_0x02c8:
            r10 = r9
            goto L_0x029d
        L_0x02ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x02cf:
            X.0qQ.A0A(r9)
            android.text.SpannableStringBuilder r12 = X.C51965G9l.A0E()
            r12.append(r10)
            java.lang.String r8 = " • "
            r12.append(r8)
            r12.append(r9)
        L_0x02e1:
            r8 = r16
            r8.setText(r12)
            if (r20 == 0) goto L_0x02ff
            android.view.ViewGroup r9 = r3.A03
            if (r9 == 0) goto L_0x0346
            int r8 = r3.getAttrDefaultWidth()
            X.0nA.A0f(r9, r8)
            goto L_0x02ff
        L_0x02f4:
            X.0qQ.A0F(r12)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02fc:
            X.AnonymousClass7TH.A0R(r8)
        L_0x02ff:
            r8 = 2131165248(0x7f070040, float:1.7944708E38)
            int r26 = r5.getDimensionPixelSize(r8)
            int r27 = X.JTP.A03(r5)
            r8 = 2131165200(0x7f070010, float:1.794461E38)
            int r28 = r5.getDimensionPixelSize(r8)
            int r29 = X.AnonymousClass7TE.A09(r15)
            int r30 = r5.getDimensionPixelSize(r8)
            r31 = -1
            X.GIH r5 = new X.GIH
            r23 = r5
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            if (r18 == 0) goto L_0x034e
            r0 = r33
            X.JYP.A01(r0, r4, r5)
        L_0x0329:
            android.widget.ImageView r0 = r3.A08
            r0.setImageDrawable(r5)
            if (r41 == 0) goto L_0x03ab
            android.view.ViewGroup r0 = r3.A00
            if (r0 != 0) goto L_0x03a8
            r0 = 2131430034(0x7f0b0a92, float:1.8481758E38)
            android.view.View r0 = X.DbY.A0F(r1, r0)
            X.0qQ.A0C(r0, r7)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.A00 = r0
            if (r0 != 0) goto L_0x03a8
            java.lang.String r21 = "clipsAttribution"
        L_0x0346:
            X.0qQ.A0F(r21)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x034e:
            if (r19 == 0) goto L_0x0384
            if (r0 == 0) goto L_0x03ac
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.LinkedHashSet r8 = X.DbS.A0y()
            java.util.Iterator r6 = r0.iterator()
        L_0x035e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0380
            java.lang.Object r4 = r6.next()
            com.instagram.music.common.model.AudioOverlayTrack r4 = (com.instagram.music.common.model.AudioOverlayTrack) r4
            java.lang.String r0 = r4.A0A
            if (r0 == 0) goto L_0x035e
            boolean r0 = r8.add(r0)
            if (r0 == 0) goto L_0x035e
            com.instagram.music.common.model.MusicAssetModel r0 = r4.A08
            if (r0 == 0) goto L_0x037e
            com.instagram.common.typedurl.ImageUrl r0 = r0.A03
        L_0x037a:
            r9.add(r0)
            goto L_0x035e
        L_0x037e:
            r0 = 0
            goto L_0x037a
        L_0x0380:
            X.JYP.A04(r5, r9)
            goto L_0x0329
        L_0x0384:
            if (r6 == 0) goto L_0x038e
            com.instagram.music.common.model.MusicAssetModel r4 = r6.A08
            if (r4 == 0) goto L_0x038e
            com.instagram.common.typedurl.ImageUrl r4 = r4.A03
            if (r4 != 0) goto L_0x03a4
        L_0x038e:
            if (r0 == 0) goto L_0x03a0
            java.lang.Object r0 = X.00k.A0O(r0, r2)
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            if (r0 == 0) goto L_0x03a0
            com.instagram.music.common.model.MusicAssetModel r0 = r0.A08
            if (r0 == 0) goto L_0x03a0
            com.instagram.common.typedurl.ImageUrl r4 = r0.A03
            if (r4 != 0) goto L_0x03a4
        L_0x03a0:
            com.instagram.common.typedurl.ImageUrl r4 = r22.Bh3()
        L_0x03a4:
            r5.A04(r4)
            goto L_0x0329
        L_0x03a8:
            r0.setVisibility(r2)
        L_0x03ab:
            return
        L_0x03ac:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.sharesheet.preview.ClipsViewerPreviewView.A00(X.0iw, com.instagram.common.session.UserSession, X.5kq, java.lang.String, java.lang.String, float, boolean):void");
    }

    private final int getAttrDefaultWidth() {
        return AnonymousClass7TE.A06((float) (0nA.A06(AnonymousClass7TE.A0S(this)) - (JTP.A03(getResources()) * 2)), 0.5f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsViewerPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View inflate = View.inflate(context, R.layout.layout_clips_viewer_media_info, this);
        this.A06 = inflate;
        this.A0F = DbX.A0b(inflate, R.id.profile_picture);
        this.A0E = AnonymousClass7TG.A0R(inflate, R.id.username);
        this.A0G = (FollowButtonBase) AnonymousClass7TF.A0F(inflate, R.id.user_follow_button);
        View A0F2 = DbY.A0F(inflate, R.id.like_row_stub);
        0qQ.A0C(A0F2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) A0F2;
        this.A07 = viewGroup;
        View A0F3 = DbY.A0F(viewGroup, R.id.like_row_like_count_facepile_stub);
        0qQ.A0C(A0F3, "null cannot be cast to non-null type android.widget.ImageView");
        this.A09 = (ImageView) A0F3;
        this.A0C = AnonymousClass7TG.A0R(viewGroup, R.id.like_row_textview_likes);
        this.A0D = AnonymousClass7TG.A0R(inflate, R.id.like_count);
        this.A0B = AnonymousClass7TG.A0R(inflate, R.id.comment_count);
        this.A05 = AnonymousClass7TF.A0G(inflate, R.id.video_caption_container);
        this.A0A = AnonymousClass7TG.A0R(inflate, R.id.video_caption);
        View A0F4 = DbY.A0F(inflate, R.id.music_album_art_stub);
        0qQ.A0C(A0F4, "null cannot be cast to non-null type android.widget.ImageView");
        this.A08 = (ImageView) A0F4;
    }

    public /* synthetic */ ClipsViewerPreviewView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClipsViewerPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
