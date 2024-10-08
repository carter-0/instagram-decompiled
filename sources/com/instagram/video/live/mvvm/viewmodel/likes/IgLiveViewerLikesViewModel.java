package com.instagram.video.live.mvvm.viewmodel.likes;

import X.00k;
import X.0Tu;
import X.0qQ;
import X.0wc;
import X.182;
import X.AnonymousClass0r6;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C249513ju;
import X.C262204Co;
import X.C278264wZ;
import X.C310016aI;
import X.C317966o8;
import X.C318116oQ;
import X.C51966G9m;
import X.C51970G9q;
import X.C60244Ji1;
import X.C62175KbX;
import X.C63921LDa;
import X.JTO;
import X.L7E;
import X.LES;
import X.MGU;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.stickersearch.AvatarStickerInteractor;
import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class IgLiveViewerLikesViewModel extends C60244Ji1 {
    public static final String[] A0A = {"❤️", "😆", "😭", "🔥", "💯"};
    public static final String[] A0B = {"💯", "😆", "😭", "🔥", "❤️"};
    public C262204Co A00;
    public boolean A01;
    public final 0wc A02;
    public final C310016aI A03;
    public final AvatarStickerInteractor A04;
    public final AvatarStickerPreRenderInteractor A05;
    public final C63921LDa A06;
    public final LES A07;
    public final C249513ju A08;
    public final AnonymousClass0r6 A09;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ IgLiveViewerLikesViewModel(X.0wc r16, com.instagram.common.session.UserSession r17, X.C310016aI r18, X.L7J r19, com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository r20, X.C63921LDa r21, com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r22, X.C313816h4 r23, com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager r24, X.LES r25, X.C59720JVe r26) {
        /*
            r15 = this;
            r7 = 0
            r0 = 126(0x7e, float:1.77E-43)
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r3 = new com.instagram.stickersearch.AvatarStickerPreRenderInteractor
            r8 = r17
            r3.<init>(r7, r8, r0)
            r0 = 30
            com.instagram.stickersearch.AvatarStickerInteractor r1 = new com.instagram.stickersearch.AvatarStickerInteractor
            r1.<init>(r7, r8, r0)
            r0 = 1
            r11 = r20
            X.0qQ.A0B(r11, r0)
            r5 = r21
            r12 = r22
            r13 = r23
            r14 = r24
            r2 = r26
            X.C51974G9v.A1S(r12, r14, r13, r5, r2)
            r0 = 7
            r10 = r19
            X.C51969G9p.A1N(r8, r0, r10)
            r0 = 13
            r4 = r25
            X.0qQ.A0B(r4, r0)
            X.6go r9 = X.C313666go.VIEWER
            r6 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A06 = r5
            r0 = r16
            r15.A02 = r0
            r0 = r18
            r15.A03 = r0
            r15.A05 = r3
            r15.A04 = r1
            r15.A07 = r4
            X.1HR r0 = X.JTQ.A0o()
            r15.A08 = r0
            X.05Y r0 = X.0u9.A04(r0)
            r15.A09 = r0
            boolean r0 = X.C278264wZ.A01(r8)
            if (r0 == 0) goto L_0x007e
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321262817780958(0x8109ff000c24de, double:3.033051087726328E-306)
            boolean r0 = X.182.A06(r4, r8, r0)
            if (r0 != 0) goto L_0x007e
            com.instagram.common.session.UserSession r3 = r15.A02
            r0 = 36321262817322200(0x8109ff000524d8, double:3.0330510874362074E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 == 0) goto L_0x0094
            X.6nw r3 = X.C317846nw.LIVE_REACTIONS_STATIC_STICKER_PACK
        L_0x0075:
            X.6oS r1 = X.C318116oQ.A00(r15)
            r0 = 21
            X.C66169MGg.A01(r3, r15, r1, r0)
        L_0x007e:
            X.6oS r1 = X.C318116oQ.A00(r15)
            r0 = 18
            X.C66169MGg.A01(r11, r15, r1, r0)
            X.0pa r2 = r2.A00
            r1 = 19
            X.MGg r0 = new X.MGg
            r0.<init>(r15, r7, r1)
            X.JTS.A13(r15, r0, r2)
            return
        L_0x0094:
            X.6nw r3 = X.C317846nw.LIVE_REACTIONS_ANIMATED_STICKER_PACK
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel.<init>(X.0wc, com.instagram.common.session.UserSession, X.6aI, X.L7J, com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository, X.LDa, com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager, X.6h4, com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager, X.LES, X.JVe):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List A03(java.lang.String[] r8) {
        /*
            r7 = this;
            r5 = 5
            java.util.ArrayList r4 = X.DbS.A0v(r5)
            r3 = 0
        L_0x0006:
            r2 = r8[r3]
            r1 = 0
            int r0 = r2.hashCode()
            switch(r0) {
                case 377643: goto L_0x0081;
                case 1772562: goto L_0x0075;
                case 1772680: goto L_0x0069;
                case 1772905: goto L_0x005d;
                case 1772944: goto L_0x0051;
                case 2071717: goto L_0x0045;
                case 2072678: goto L_0x0039;
                case 2073639: goto L_0x002d;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.String r6 = "emojiToContentDescriptionRes: "
            java.lang.String r0 = " -> Unknown emoji unicode for accessibility"
            java.lang.String r6 = X.002.A0g(r6, r2, r0)
            java.lang.String r0 = "IgLiveViewerLikesViewModel"
            X.0wb.A03(r0, r6)
            r6 = 2131965325(0x7f13358d, float:1.9567457E38)
        L_0x0020:
            X.KbW r0 = new X.KbW
            r0.<init>(r1, r2, r6)
            r4.add(r0)
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x0006
            return r4
        L_0x002d:
            java.lang.String r0 = "3️⃣"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            r6 = 2131965323(0x7f13358b, float:1.9567453E38)
            goto L_0x0020
        L_0x0039:
            java.lang.String r0 = "2️⃣"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            r6 = 2131965324(0x7f13358c, float:1.9567455E38)
            goto L_0x0020
        L_0x0045:
            java.lang.String r0 = "1️⃣"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            r6 = 2131965322(0x7f13358a, float:1.956745E38)
            goto L_0x0020
        L_0x0051:
            java.lang.String r0 = "😭"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            r6 = 2131965318(0x7f133586, float:1.9567442E38)
            goto L_0x0020
        L_0x005d:
            java.lang.String r0 = "😆"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            r6 = 2131965321(0x7f133589, float:1.9567449E38)
            goto L_0x0020
        L_0x0069:
            java.lang.String r0 = "🔥"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            r6 = 2131965319(0x7f133587, float:1.9567445E38)
            goto L_0x0020
        L_0x0075:
            java.lang.String r0 = "💯"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            r6 = 2131965317(0x7f133585, float:1.956744E38)
            goto L_0x0020
        L_0x0081:
            java.lang.String r0 = "❤️"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0010
            r6 = 2131965320(0x7f133588, float:1.9567447E38)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel.A03(java.lang.String[]):java.util.List");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel r6, X.AnonymousClass4D7 r7) {
        /*
            r3 = 24
            boolean r0 = X.C66139MDr.A01(r3, r7)
            if (r0 == 0) goto L_0x0047
            r5 = r7
            X.MDr r5 = (X.C66139MDr) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0047
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r2) goto L_0x004d
            java.lang.Object r6 = r5.A01
            com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel r6 = (com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel) r6
            X.0eS.A00(r1)
        L_0x0029:
            X.LES r0 = r6.A07
            X.05G r0 = r0.A0P
            X.AnonymousClass7TF.A1O(r0, r3)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0033:
            X.0eS.A00(r1)
            r6.A01 = r3
            X.3ju r1 = r6.A08
            X.KeA r0 = X.C62338KeA.A00
            r5.A01 = r6
            r5.A00 = r2
            java.lang.Object r0 = r1.ELH(r0, r5)
            if (r0 != r4) goto L_0x0029
            return r4
        L_0x0047:
            X.MDr r5 = new X.MDr
            r5.<init>(r6, r7, r3)
            goto L_0x0016
        L_0x004d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel.A00(com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.JUN, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel r9, X.AnonymousClass4D7 r10, boolean r11) {
        /*
            r3 = 8
            boolean r0 = X.JUN.A00(r3, r10)
            if (r0 == 0) goto L_0x00c2
            r4 = r10
            X.JUN r4 = (X.JUN) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c2
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r8 = 1
            if (r0 == 0) goto L_0x00a5
            if (r0 != r8) goto L_0x00c9
            boolean r11 = r4.A04
            java.lang.Object r9 = r4.A01
            com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel r9 = (com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel) r9
            X.0eS.A00(r1)
        L_0x002a:
            if (r11 == 0) goto L_0x009f
            A04(r9)
        L_0x002f:
            X.LES r0 = r9.A07
            X.05G r0 = r0.A0P
            X.AnonymousClass7TF.A1O(r0, r8)
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r9.A05
            X.JvD r0 = X.JTQ.A0Q(r0)
            if (r0 == 0) goto L_0x009c
            X.6aI r7 = r9.A03
            if (r7 == 0) goto L_0x009c
            java.lang.String r6 = X.C61013JvD.A00(r0)
            java.lang.String r5 = r0.A09
            java.lang.String r4 = "viewer"
            com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository r0 = r9.A04
            X.0Ud r0 = r0.A06
            boolean r3 = X.JTS.A1a(r0)
            X.0qQ.A0B(r5, r8)
            X.0wc r1 = r7.A05
            java.lang.String r0 = "ig_live_reaction_picker_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x009c
            java.lang.Long r1 = X.DbV.A0q(r6)
            java.lang.String r0 = "a_pk"
            r2.A9F(r0, r1)
            long r0 = X.DbZ.A07(r6)
            X.JTQ.A10(r2, r0)
            X.6aJ r0 = r7.A0A
            java.lang.String r0 = r0.getModuleName()
            X.DbS.A1O(r2, r0)
            X.C51965G9l.A1I(r2, r5)
            X.JTO.A1R(r2, r4)
            java.lang.String r0 = ""
            X.C51965G9l.A1O(r2, r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.lang.String r0 = "current_guest_ids"
            r2.AAe(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "has_avatar_reactions"
            r2.A7p(r0, r1)
            r2.Cgf()
        L_0x009c:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x009f:
            X.4Co r0 = r9.A00
            X.C51970G9q.A1S(r0)
            goto L_0x002f
        L_0x00a5:
            X.0eS.A00(r1)
            r9.A01 = r8
            X.3ju r2 = r9.A08
            java.util.List r1 = r9.A06()
            X.Ke7 r0 = new X.Ke7
            r0.<init>(r1)
            r4.A01 = r9
            r4.A04 = r11
            r4.A00 = r8
            java.lang.Object r0 = r2.ELH(r0, r4)
            if (r0 != r3) goto L_0x002a
            return r3
        L_0x00c2:
            X.JUN r4 = new X.JUN
            r4.<init>(r9, r10, r3)
            goto L_0x0016
        L_0x00c9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel.A01(com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel, X.4D7, boolean):java.lang.Object");
    }

    public static final void A04(IgLiveViewerLikesViewModel igLiveViewerLikesViewModel) {
        C51970G9q.A1S(igLiveViewerLikesViewModel.A00);
        igLiveViewerLikesViewModel.A00 = C51966G9m.A1L(new MGU(igLiveViewerLikesViewModel, (AnonymousClass4D7) null, 7), C318116oQ.A00(igLiveViewerLikesViewModel));
    }

    public final List A06() {
        String[] strArr;
        List A032;
        List A022;
        List A17 = JTO.A17(this.A04.A06);
        if (AnonymousClass7TE.A1b(A17)) {
            UserSession userSession = this.A02;
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36321262817060053L)) {
                A032 = A02(A17);
                A022 = A03(A0B);
            } else if (182.A06(r2, userSession, 36321262817125590L)) {
                A032 = A03(A0B);
                A022 = A02(A17);
            } else {
                if (182.A06(r2, userSession, 36321262817191127L)) {
                    return A02(A17);
                }
                strArr = A0B;
            }
            return 00k.A0S(A022, A032);
        }
        if (!C278264wZ.A01(this.A02)) {
            strArr = A0A;
        }
        strArr = A0B;
        return A03(strArr);
    }

    public static final List A02(List list) {
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C317966o8 A0a = JTO.A0a(it);
            String str = A0a.A0a;
            0qQ.A07(str);
            String str2 = A0a.A0S;
            0qQ.A07(str2);
            ImageUrl imageUrl = A0a.A0H;
            0qQ.A07(imageUrl);
            String str3 = A0a.A0h;
            0qQ.A07(str3);
            String str4 = A0a.A0M;
            if (str4 == null) {
                str4 = "";
            }
            A0r.add(new C62175KbX((Drawable) null, imageUrl, (L7E) null, str, str2, str3, str4));
        }
        return A0r;
    }
}
