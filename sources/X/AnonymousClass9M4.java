package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.layeredxma.LayeredXmaContentDefinition;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Collections;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9M4  reason: invalid class name */
public final class AnonymousClass9M4 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9M4(AnonymousClass7P7 r2, AnonymousClass0eM r3, int i) {
        super(0);
        this.A00 = i;
        this.A02 = r2;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AnonymousClass7P7 r1 = (AnonymousClass7P7) this.A02;
                UserSession userSession = r1.A07;
                C332807Wl r5 = r1.A08;
                AnonymousClass9HC r4 = r1.A09;
                AnonymousClass7BA r3 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r3, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visual.VisualContentViewHolder, com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r2 = r1.A06;
                0qQ.A0B(r3, 4);
                0qQ.A0B(r2, 5);
                return new AnonymousClass7BB(r3, new AnonymousClass7RW(r2, userSession, r5, r4), new AnonymousClass7RY(r2, userSession, r5, r4));
            case 1:
                AnonymousClass7P7 r12 = (AnonymousClass7P7) this.A02;
                UserSession userSession2 = r12.A07;
                C332807Wl r52 = r12.A08;
                AnonymousClass9HC r42 = r12.A09;
                AnonymousClass7BA r32 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r32, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visual.VisualContentViewHolder, com.instagram.direct.messagethread.visual.VisualContentViewHolder>");
                AnonymousClass0iw r22 = r12.A06;
                0qQ.A0B(r32, 4);
                0qQ.A0B(r22, 5);
                return new AnonymousClass7BB(r32, new AnonymousClass7RW(r22, userSession2, r52, r42), new AnonymousClass7RW(r22, userSession2, r52, r42));
            case 2:
                AnonymousClass7P7 r13 = (AnonymousClass7P7) this.A02;
                UserSession userSession3 = r13.A07;
                C332807Wl r53 = r13.A08;
                AnonymousClass9HC r43 = r13.A09;
                AnonymousClass7BA r33 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r33, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visual.VisualContentViewHolder, com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder>");
                AnonymousClass0iw r23 = r13.A06;
                0qQ.A0B(r33, 4);
                0qQ.A0B(r23, 5);
                return new AnonymousClass7BB(r33, new AnonymousClass7RW(r23, userSession3, r53, r43), C395119zF.A00(r23, userSession3, r53, r43));
            case 3:
                AnonymousClass7P7 r14 = (AnonymousClass7P7) this.A02;
                UserSession userSession4 = r14.A07;
                C332807Wl r54 = r14.A08;
                AnonymousClass9HC r44 = r14.A09;
                AnonymousClass7BA r34 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r34, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.quotedreply.expandabletext.ExpandableTextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r24 = r14.A06;
                0qQ.A0B(r34, 3);
                0qQ.A0B(r24, 4);
                return new AnonymousClass7BB(r34, new AnonymousClass7RY(r24, userSession4, r54, r44), new AnonymousClass749(userSession4, r54, r44));
            case 4:
                AnonymousClass7P7 r25 = (AnonymousClass7P7) this.A02;
                Context context = r25.A04;
                UserSession userSession5 = r25.A07;
                C332807Wl r7 = r25.A08;
                AnonymousClass9HC r8 = r25.A09;
                AnonymousClass7BA r15 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r15, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r55 = r25.A06;
                0qQ.A0B(r15, 4);
                0qQ.A0B(r55, 5);
                return new AnonymousClass7BB(r15, new AnonymousClass7RY(r55, userSession5, r7, r8), new AnonymousClass77K(context, r55, userSession5, r7, r8));
            case 5:
                PB5 pb5 = (PB5) ((AnonymousClass0eM) this.A02).getValue();
                AnonymousClass7DR r16 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0B(pb5, 1);
                0qQ.A0B(r16, 2);
                return new C327997Da(r16, pb5);
            case 6:
                AnonymousClass7P7 r17 = (AnonymousClass7P7) this.A02;
                UserSession userSession6 = r17.A07;
                C332807Wl r56 = r17.A08;
                AnonymousClass9HC r45 = r17.A09;
                AnonymousClass7BA r35 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r35, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder>");
                AnonymousClass0iw r26 = r17.A06;
                0qQ.A0B(r35, 4);
                0qQ.A0B(r26, 5);
                return new AnonymousClass7BB(r35, new AnonymousClass7RY(r26, userSession6, r56, r45), C395119zF.A00(r26, userSession6, r56, r45));
            case 7:
                AnonymousClass7P7 r18 = (AnonymousClass7P7) this.A02;
                C12794T7h t7h = new C12794T7h(r18.A05, r18.A07);
                AnonymousClass7DR r19 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0B(r19, 2);
                return new C327997Da(r19, t7h);
            case 8:
                AnonymousClass7P7 r10 = (AnonymousClass7P7) this.A02;
                UserSession userSession7 = r10.A07;
                C332807Wl r36 = r10.A08;
                AnonymousClass9HC r82 = r10.A09;
                AnonymousClass7DP r9 = (AnonymousClass7DP) ((AnonymousClass0eM) this.A01).getValue();
                AnonymousClass9HC r72 = r9.A02;
                AnonymousClass7D1 r6 = r9.A04;
                AnonymousClass7D9 r57 = r9.A03;
                AnonymousClass7D3 r27 = r9.A06;
                AnonymousClass7DI r110 = r9.A01;
                AnonymousClass9HC r182 = r72;
                AnonymousClass7DI r172 = r110;
                AnonymousClass7DQ r11 = new AnonymousClass7DQ((AnonymousClass7DO) null, (AnonymousClass7DK) null, (AnonymousClass7DC) null, r9.A00, (AnonymousClass7DE) null, r172, r182, (AnonymousClass7DJ) null, (AnonymousClass7DA) null, (AnonymousClass7DB) null, r57, (AnonymousClass7DF) null, r6, r9.A05, r27, (AnonymousClass7DG) null, (AnonymousClass7DD) null, (AnonymousClass7DM) null, (AnonymousClass7DH) null, (AnonymousClass7D8) null, (AnonymousClass7D4) null, (AnonymousClass7D6) null, (AnonymousClass7D7) null);
                AnonymousClass0iw r28 = r10.A06;
                0qQ.A0B(r28, 4);
                List singletonList = Collections.singletonList(C3259074q.A01(new P8G(r28, userSession7, r36), r36, r82));
                0qQ.A07(singletonList);
                return new C327997Da(r11, new PB2(r28, userSession7, r36, new AnonymousClass7DZ(singletonList)));
            case 9:
                AnonymousClass7P7 r111 = (AnonymousClass7P7) this.A02;
                UserSession userSession8 = r111.A07;
                C332807Wl r83 = r111.A08;
                AnonymousClass9HC r29 = r111.A09;
                AnonymousClass7Bn r37 = new AnonymousClass7Bn(((AnonymousClass7DP) ((AnonymousClass0eM) this.A01).getValue()).A04);
                AnonymousClass0iw r58 = r111.A06;
                0qQ.A0B(r58, 5);
                P8I p8i = new P8I(r83);
                C3266077l A012 = C3259074q.A01(p8i, r83, r29);
                C3266077l A013 = C3259074q.A01(C40463AcY.A00, r83, r29);
                List singletonList2 = Collections.singletonList(A012);
                0qQ.A07(singletonList2);
                return new C327997Da(r37, new C72566PAx(r58, userSession8, (C3256673q) r111.A0B.getValue(), r83, r83, p8i, (AnonymousClass7ZN) userSession8.A01(AnonymousClass7ZN.class, AnonymousClass7ZM.A00), new AnonymousClass7DZ(singletonList2), A013));
            case 10:
                AnonymousClass7P7 r112 = (AnonymousClass7P7) this.A02;
                return AnonymousClass77J.A00(r112.A04, r112.A06, r112.A07, (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue(), r112.A08, r112.A09);
            case 11:
                C72554PAl pAl = (C72554PAl) ((AnonymousClass0eM) this.A01).getValue();
                AnonymousClass7DR r113 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A02).getValue();
                0qQ.A0B(pAl, 1);
                0qQ.A0B(r113, 2);
                return new C327997Da(r113, pAl);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C72556PAn pAn = (C72556PAn) ((AnonymousClass0eM) this.A02).getValue();
                AnonymousClass7DR r114 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0B(pAn, 1);
                0qQ.A0B(r114, 2);
                return new C327997Da(r114, pAn);
            case 13:
                AnonymousClass7P7 r115 = (AnonymousClass7P7) this.A02;
                C332807Wl r59 = r115.A08;
                AnonymousClass9HC r210 = r115.A09;
                return new AnonymousClass74G((AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue(), new AnonymousClass749(r115.A07, r59, r210), AnonymousClass768.A00(r59, r210), AnonymousClass74E.class);
            case 14:
                AnonymousClass7P7 r116 = (AnonymousClass7P7) this.A02;
                C332807Wl r510 = r116.A08;
                AnonymousClass9HC r211 = r116.A09;
                return new AnonymousClass74G((AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue(), new AnonymousClass749(r116.A07, r510, r211), AnonymousClass768.A00(r510, r211), C68881NaI.class);
            case 15:
                AnonymousClass7P7 r117 = (AnonymousClass7P7) this.A02;
                C332807Wl r212 = r117.A08;
                AnonymousClass9HC r118 = r117.A09;
                AnonymousClass7BA r38 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r38, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.placeholder.PlaceholderContentViewHolder>");
                0qQ.A0B(r38, 2);
                return new AnonymousClass7BB(r38, AnonymousClass768.A00(r212, r118), (AnonymousClass7D2) null);
            case 16:
                AnonymousClass7P7 r119 = (AnonymousClass7P7) this.A02;
                Context context2 = r119.A04;
                UserSession userSession9 = r119.A07;
                C332807Wl r73 = r119.A08;
                AnonymousClass9HC r84 = r119.A09;
                AnonymousClass0iw r511 = r119.A06;
                AnonymousClass7BA r120 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r120, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                0qQ.A0B(r511, 4);
                0qQ.A0B(r120, 5);
                return new AnonymousClass7BB(r120, AnonymousClass768.A00(r73, r84), new AnonymousClass77K(context2, r511, userSession9, r73, r84));
            case 17:
                AnonymousClass7P7 r121 = (AnonymousClass7P7) this.A02;
                UserSession userSession10 = r121.A07;
                C332807Wl r512 = r121.A08;
                AnonymousClass9HC r46 = r121.A09;
                AnonymousClass7BA r39 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r39, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder>");
                AnonymousClass0iw r213 = r121.A06;
                0qQ.A0B(r39, 3);
                0qQ.A0B(r213, 4);
                return new AnonymousClass7BB(r39, AnonymousClass768.A00(r512, r46), C395119zF.A00(r213, userSession10, r512, r46));
            case EglBase14Impl.EGLExt_SDK_VERSION:
                C72552PAj pAj = (C72552PAj) ((AnonymousClass0eM) this.A02).getValue();
                AnonymousClass7DR r122 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0B(pAj, 1);
                0qQ.A0B(r122, 2);
                return new C327997Da(r122, pAj);
            case 19:
                AnonymousClass7P7 r123 = (AnonymousClass7P7) this.A02;
                C332807Wl r47 = r123.A08;
                AnonymousClass9HC r214 = r123.A09;
                PAX pax = new PAX(r47, r214);
                AnonymousClass7BA r124 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r124, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.placeholder.PlaceholderContentViewHolder>");
                0qQ.A0B(r124, 3);
                return new AnonymousClass7BB(r124, AnonymousClass768.A00(r47, r214), pax);
            case 20:
                AnonymousClass7P7 r125 = (AnonymousClass7P7) this.A02;
                C332807Wl r48 = r125.A08;
                AnonymousClass9HC r215 = r125.A09;
                AnonymousClass75T r310 = new AnonymousClass75T(r48, r215);
                AnonymousClass7BA r126 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r126, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.expiredplaceholder.ExpiredPlaceholderContentViewHolder>");
                0qQ.A0B(r126, 3);
                return new AnonymousClass7BB(r126, AnonymousClass768.A00(r48, r215), r310);
            case 21:
                AnonymousClass7P7 r127 = (AnonymousClass7P7) this.A02;
                UserSession userSession11 = r127.A07;
                AnonymousClass0iw r311 = r127.A06;
                C332807Wl r216 = r127.A08;
                AnonymousClass9HC r128 = r127.A09;
                AnonymousClass7RY r49 = new AnonymousClass7RY(r311, userSession11, r216, r128);
                AnonymousClass75T r312 = new AnonymousClass75T(r216, r128);
                AnonymousClass7BA r129 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r129, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.expiredplaceholder.ExpiredPlaceholderContentViewHolder>");
                0qQ.A0B(r129, 3);
                return new AnonymousClass7BB(r129, r49, r312);
            case 22:
                AnonymousClass7P7 r130 = (AnonymousClass7P7) this.A02;
                AnonymousClass75T r313 = new AnonymousClass75T(r130.A08, r130.A09);
                AnonymousClass7DR r131 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0B(r131, 2);
                return new C327997Da(r131, r313);
            case 23:
                return new AnonymousClass75O((AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue(), (C3266277n) null, (AnonymousClass78H) ((AnonymousClass0eM) this.A02).getValue(), AnonymousClass75S.class);
            case 24:
                AnonymousClass78H r314 = (AnonymousClass78H) ((AnonymousClass0eM) this.A02).getValue();
                AnonymousClass7DR r132 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0B(r314, 1);
                0qQ.A0B(r132, 2);
                return new C327997Da(r132, r314);
            case 25:
                AnonymousClass7P7 r133 = (AnonymousClass7P7) this.A02;
                UserSession userSession12 = r133.A07;
                C332807Wl r74 = r133.A08;
                AnonymousClass9HC r85 = r133.A09;
                AnonymousClass0iw r513 = r133.A06;
                AnonymousClass7BA r315 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r315, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.layeredxma.LayeredXmaContentViewHolder>");
                0qQ.A0B(r513, 3);
                0qQ.A0B(r315, 4);
                AnonymousClass768 A002 = AnonymousClass768.A00(r74, r85);
                return new C388959of(r315, new LayeredXmaContentDefinition(r513, userSession12, r74, r85, false), A002, C68855NZn.class);
            case 26:
                AnonymousClass7P7 r134 = (AnonymousClass7P7) this.A02;
                UserSession userSession13 = r134.A07;
                C332807Wl r75 = r134.A08;
                AnonymousClass9HC r86 = r134.A09;
                AnonymousClass0iw r514 = r134.A06;
                AnonymousClass7BA r316 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r316, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.layeredxma.LayeredXmaContentViewHolder>");
                0qQ.A0B(r514, 3);
                0qQ.A0B(r316, 4);
                AnonymousClass768 A003 = AnonymousClass768.A00(r75, r86);
                return new C388959of(r316, new LayeredXmaContentDefinition(r514, userSession13, r75, r86, false), A003, C68854NZm.class);
            case 27:
                AnonymousClass7P7 r135 = (AnonymousClass7P7) this.A02;
                C332807Wl r92 = r135.A08;
                AnonymousClass9HC r102 = r135.A09;
                AnonymousClass0iw r217 = r135.A06;
                AnonymousClass7DR r317 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0B(r217, 2);
                0qQ.A0B(r317, 3);
                boolean z = r102.A1X;
                return new C327997Da(r317, new C71500Olp(0sr.A1P(new AnonymousClass7DY[]{new C3266077l(new AnonymousClass7DX(r92), new AnonymousClass74P(r92, 1, 0, false), new C3265977k(r92, z), new AnonymousClass7DV(r92, z), r92, r102, (C3266177m) null, false), new PBF(r92)}), r217));
            case 28:
                AnonymousClass7P7 r218 = (AnonymousClass7P7) this.A02;
                UserSession userSession14 = r218.A07;
                C332807Wl r93 = r218.A08;
                AnonymousClass9HC r103 = r218.A09;
                AnonymousClass7DR r318 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0B(r318, 3);
                boolean z2 = r103.A1X;
                List singletonList3 = Collections.singletonList(new C3266077l(new AnonymousClass7DX(r93), new C72490P7z(userSession14), new C3265977k(r93, z2), new AnonymousClass7DV(r93, z2), r93, r103, (C3266177m) null, true));
                0qQ.A07(singletonList3);
                return new C327997Da(r318, new C71499Olo(singletonList3));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                AnonymousClass7P7 r136 = (AnonymousClass7P7) this.A02;
                C332807Wl r410 = r136.A08;
                AnonymousClass9HC r219 = r136.A09;
                AnonymousClass7DR r319 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                AnonymousClass0iw r137 = r136.A06;
                0qQ.A0B(r319, 2);
                0qQ.A0B(r137, 3);
                return new C327997Da(r319, new C72544PAb(r137, r410, r219));
            case 30:
                AnonymousClass7P7 r138 = (AnonymousClass7P7) this.A02;
                C332807Wl r515 = r138.A08;
                AnonymousClass9HC r411 = r138.A09;
                AnonymousClass0iw r220 = r138.A06;
                AnonymousClass7BA r320 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r320, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.magicmediaremix.MagicMediaRemixContentViewHolder>");
                0qQ.A0B(r220, 4);
                0qQ.A0B(r320, 5);
                return new AnonymousClass7BB(r320, AnonymousClass768.A00(r515, r411), new C72544PAb(r220, r515, r411));
            case 31:
                AnonymousClass7P7 r321 = (AnonymousClass7P7) this.A02;
                return new C327997Da((AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue(), AnonymousClass768.A00(r321.A08, r321.A09));
            case 32:
                AnonymousClass7P7 r139 = (AnonymousClass7P7) this.A02;
                C332807Wl r76 = r139.A08;
                AnonymousClass9HC r62 = r139.A09;
                AnonymousClass0iw r516 = r139.A06;
                AnonymousClass7BA r412 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r412, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.notesxma.NotesXmaContentViewHolder>");
                0qQ.A0B(r516, 2);
                0qQ.A0B(r412, 3);
                return new AnonymousClass7BB(r412, AnonymousClass768.A00(r76, r62), new C71500Olp(0sr.A1P(new AnonymousClass7DY[]{C3259074q.A00(new AnonymousClass7DX(r76), new AnonymousClass74P(r76, 1, 0, false), r76, r62), new PBH(r76)}), r516));
            case 33:
                AnonymousClass7P7 r140 = (AnonymousClass7P7) this.A02;
                C332807Wl r77 = r140.A08;
                AnonymousClass9HC r63 = r140.A09;
                AnonymousClass0iw r517 = r140.A06;
                AnonymousClass7BA r413 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r413, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.notesxma.NotesXmaContentViewHolder>");
                0qQ.A0B(r517, 2);
                0qQ.A0B(r413, 3);
                return new AnonymousClass7BB(r413, AnonymousClass768.A00(r77, r63), new C71500Olp(0sr.A1P(new AnonymousClass7DY[]{C3259074q.A00(new AnonymousClass7DX(r77), new AnonymousClass74P(r77, 1, 0, false), r77, r63), new PBG(r77)}), r517));
            case 34:
                AnonymousClass7P7 r141 = (AnonymousClass7P7) this.A02;
                UserSession userSession15 = r141.A07;
                C332807Wl r78 = r141.A08;
                AnonymousClass9HC r64 = r141.A09;
                AnonymousClass0iw r518 = r141.A06;
                AnonymousClass7BA r414 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r414, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder, com.instagram.direct.messagethread.notesxma.NotesXmaContentViewHolder>");
                0qQ.A0B(r518, 3);
                0qQ.A0B(r414, 4);
                return new AnonymousClass7BB(r414, C395119zF.A00(r518, userSession15, r78, r64), new C71500Olp(0sr.A1P(new AnonymousClass7DY[]{C3259074q.A00(new AnonymousClass7DX(r78), new AnonymousClass74P(r78, 1, 0, false), r78, r64), new PBE(r78)}), r518));
            case 35:
                AnonymousClass7P7 r142 = (AnonymousClass7P7) this.A02;
                UserSession userSession16 = r142.A07;
                C332807Wl r79 = r142.A08;
                AnonymousClass9HC r65 = r142.A09;
                AnonymousClass0iw r519 = r142.A06;
                AnonymousClass7BA r415 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r415, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.notesxma.NotesXmaContentViewHolder>");
                0qQ.A0B(r519, 3);
                0qQ.A0B(r415, 4);
                return new AnonymousClass7BB(r415, new AnonymousClass7RY(r519, userSession16, r79, r65), new C71500Olp(0sr.A1P(new AnonymousClass7DY[]{C3259074q.A00(new AnonymousClass7DX(r79), new AnonymousClass74P(r79, 1, 0, false), r79, r65), new PBI(r79)}), r519));
            case 36:
                AnonymousClass7P7 r143 = (AnonymousClass7P7) this.A02;
                C332807Wl r416 = r143.A08;
                AnonymousClass7DR r322 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                AnonymousClass9HC r221 = r143.A09;
                UserSession userSession17 = r143.A07;
                0qQ.A0B(r322, 1);
                return new C327997Da(r322, new AnonymousClass749(userSession17, r416, r221));
            case 37:
                AnonymousClass7P7 r144 = (AnonymousClass7P7) this.A02;
                UserSession userSession18 = r144.A07;
                C332807Wl r710 = r144.A08;
                AnonymousClass9HC r87 = r144.A09;
                AnonymousClass0iw r417 = r144.A06;
                AnonymousClass7BA r145 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r145, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.multimedia.MultiMediaContentViewHolder>");
                0qQ.A0B(r417, 3);
                0qQ.A0B(r145, 4);
                return new AnonymousClass7BB(r145, AnonymousClass768.A00(r710, r87), new PB6(r417, userSession18, (C3256673q) null, r710, r87, (AnonymousClass7ZF) null, (AnonymousClass7DY) null, true));
            case 38:
                AnonymousClass7P7 r146 = (AnonymousClass7P7) this.A02;
                UserSession userSession19 = r146.A07;
                C332807Wl r418 = r146.A08;
                AnonymousClass9HC r520 = r146.A09;
                AnonymousClass0iw r147 = r146.A06;
                AnonymousClass7BA r323 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r323, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.promptxma.PromptXmaMessageViewHolder>");
                return C70041NwJ.A00(r147, userSession19, r323, r418, r520, false);
            case 39:
                AnonymousClass7P7 r148 = (AnonymousClass7P7) this.A02;
                UserSession userSession20 = r148.A07;
                C332807Wl r419 = r148.A08;
                AnonymousClass9HC r521 = r148.A09;
                AnonymousClass0iw r149 = r148.A06;
                AnonymousClass7BA r324 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r324, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.promptxma.PromptXmaMessageViewHolder>");
                return C70041NwJ.A00(r149, userSession20, r324, r419, r521, true);
            case 40:
                AnonymousClass7P7 r150 = (AnonymousClass7P7) this.A02;
                C332807Wl r420 = r150.A08;
                AnonymousClass9HC r325 = r150.A09;
                AnonymousClass0iw r222 = r150.A06;
                AnonymousClass7BA r151 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r151, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.promptxma.ContextualReplyCardViewHolder>");
                return C70042NwK.A00(r222, r151, r420, r325);
            case Seq.NULL_REFNUM:
                AnonymousClass7P7 r152 = (AnonymousClass7P7) this.A02;
                UserSession userSession21 = r152.A07;
                C332807Wl r522 = r152.A08;
                AnonymousClass9HC r421 = r152.A09;
                AnonymousClass0iw r223 = r152.A06;
                AnonymousClass7BA r326 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r326, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.selfiereaction.SelfieReactionContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                0qQ.A0B(r223, 3);
                0qQ.A0B(r326, 4);
                return new AnonymousClass7BB(r326, AnonymousClass768.A00(r522, r421), new C72546PAd(r223, userSession21, r522, r421));
            case Seq.RefTracker.REF_OFFSET:
                AnonymousClass7P7 r153 = (AnonymousClass7P7) this.A02;
                UserSession userSession22 = r153.A07;
                Context context3 = r153.A04;
                C332807Wl r66 = r153.A08;
                AnonymousClass9HC r711 = r153.A09;
                AnonymousClass0iw r327 = r153.A06;
                AnonymousClass7BA r523 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r523, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.portraitxma.viewholders.PortraitXmaContentViewHolder>");
                return AnonymousClass74Z.A00(context3, r327, userSession22, r523, r66, r711);
            case 43:
                AnonymousClass7P7 r224 = (AnonymousClass7P7) this.A02;
                UserSession userSession23 = r224.A07;
                C332807Wl r524 = r224.A08;
                AnonymousClass9HC r154 = r224.A09;
                AnonymousClass7BA r422 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r422, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.storesticker.StoreStickerContentViewHolder>");
                AnonymousClass0iw r225 = r224.A06;
                0qQ.A0B(r422, 3);
                0qQ.A0B(r225, 4);
                return new AnonymousClass7BB(r422, AnonymousClass768.A00(r524, r154), new C72556PAn(r225, userSession23, r524, AnonymousClass7TG.A0d(r524, r154)));
            case 44:
                AnonymousClass7P7 r155 = (AnonymousClass7P7) this.A02;
                UserSession userSession24 = r155.A07;
                C332807Wl r525 = r155.A08;
                AnonymousClass9HC r423 = r155.A09;
                AnonymousClass7BA r328 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r328, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.storesticker.StoreStickerContentViewHolder, com.instagram.direct.messagethread.quotedreply.expandabletext.ExpandableTextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r226 = r155.A06;
                0qQ.A0B(r328, 3);
                0qQ.A0B(r226, 4);
                return new AnonymousClass7BB(r328, new C72556PAn(r226, userSession24, r525, AnonymousClass7TG.A0d(r525, r423)), new AnonymousClass749(userSession24, r525, r423));
            case 45:
                AnonymousClass7P7 r156 = (AnonymousClass7P7) this.A02;
                UserSession userSession25 = r156.A07;
                C332807Wl r424 = r156.A08;
                AnonymousClass9HC r227 = r156.A09;
                AnonymousClass7BA r329 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r329, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder, com.instagram.direct.messagethread.quotedreply.expandabletext.ExpandableTextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r157 = r156.A06;
                0qQ.A0B(r329, 3);
                0qQ.A0B(r157, 4);
                return new AnonymousClass7BB(r329, C395119zF.A00(r157, userSession25, r424, r227), new AnonymousClass749(userSession25, r424, r227));
            case 46:
                AnonymousClass7P7 r228 = (AnonymousClass7P7) this.A02;
                Context context4 = r228.A04;
                UserSession userSession26 = r228.A07;
                C332807Wl r712 = r228.A08;
                AnonymousClass9HC r88 = r228.A09;
                AnonymousClass7BA r158 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r158, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder, com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r526 = r228.A06;
                0qQ.A0B(r158, 4);
                0qQ.A0B(r526, 5);
                return new AnonymousClass7BB(r158, C395119zF.A00(r526, userSession26, r712, r88), new AnonymousClass77K(context4, r526, userSession26, r712, r88));
            case 47:
                AnonymousClass7P7 r159 = (AnonymousClass7P7) this.A02;
                UserSession userSession27 = r159.A07;
                C332807Wl r527 = r159.A08;
                AnonymousClass9HC r425 = r159.A09;
                AnonymousClass7BA r330 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r330, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder, com.instagram.direct.messagethread.visual.VisualContentViewHolder>");
                AnonymousClass0iw r229 = r159.A06;
                0qQ.A0B(r330, 3);
                0qQ.A0B(r229, 4);
                return new AnonymousClass7BB(r330, C395119zF.A00(r229, userSession27, r527, r425), new AnonymousClass7RW(r229, userSession27, r527, r425));
            case 48:
                AnonymousClass7P7 r160 = (AnonymousClass7P7) this.A02;
                UserSession userSession28 = r160.A07;
                C332807Wl r528 = r160.A08;
                AnonymousClass9HC r426 = r160.A09;
                AnonymousClass7BA r331 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r331, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder, com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r230 = r160.A06;
                0qQ.A0B(r331, 3);
                0qQ.A0B(r230, 4);
                return new AnonymousClass7BB(r331, C395119zF.A00(r230, userSession28, r528, r426), new AnonymousClass7RY(r230, userSession28, r528, r426));
            default:
                AnonymousClass7P7 r161 = (AnonymousClass7P7) this.A02;
                UserSession userSession29 = r161.A07;
                C332807Wl r529 = r161.A08;
                AnonymousClass9HC r427 = r161.A09;
                AnonymousClass7BA r332 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r332, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder, com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder>");
                AnonymousClass0iw r231 = r161.A06;
                0qQ.A0B(r332, 3);
                0qQ.A0B(r231, 4);
                return new AnonymousClass7BB(r332, C395119zF.A00(r231, userSession29, r529, r427), C395119zF.A00(r231, userSession29, r529, r427));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9M4(AnonymousClass0eM r2, AnonymousClass0eM r3, int i) {
        super(0);
        this.A00 = i;
        switch (i) {
            case 5:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 23:
            case 24:
                this.A02 = r2;
                this.A01 = r3;
                break;
            default:
                this.A01 = r2;
                this.A02 = r3;
                break;
        }
    }
}
