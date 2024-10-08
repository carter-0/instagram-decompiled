package X;

import android.content.Context;
import android.view.View;
import androidx.activity.ComponentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.layeredxma.LayeredXmaContentDefinition;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9M3  reason: invalid class name */
public final class AnonymousClass9M3 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9M3(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int A0G;
        Object invoke;
        AnonymousClass07P r1;
        Object invoke2;
        switch (this.A00) {
            case 0:
                return new OT9((OJa) ((AnonymousClass0eM) this.A02).getValue(), (AnonymousClass0eK) this.A01);
            case 1:
                return new C329027Hh(((AnonymousClass9H6) this.A02).A01, (AnonymousClass0eK) this.A01);
            case 2:
                AnonymousClass9H6 r12 = (AnonymousClass9H6) this.A02;
                return new P9M(r12.A00.requireActivity(), r12.A01, (AnonymousClass0eK) this.A01);
            case 3:
                return new C3270979j((AnonymousClass7SM) this.A02, (AnonymousClass0eK) this.A01);
            case 4:
                AnonymousClass9H6 r13 = (AnonymousClass9H6) this.A02;
                return new C72494P8d(r13.A00.requireActivity(), r13.A01, (AnonymousClass7SM) this.A01);
            case 5:
                return new C40485Acu((C332907Wx) ((AnonymousClass0eM) this.A02).getValue(), new C73897PlY(this.A01, 23));
            case 6:
                return new C3259274s(((AnonymousClass9H6) this.A02).A01, new C41396AtI(this.A01, 12));
            case 7:
                return new C330957Ox((UserSession) this.A02, (Context) this.A01);
            case 8:
                C62320sa r0 = (C62320sa) this.A01;
                if (r0 == null || (invoke = r0.invoke()) == null) {
                    return ((ComponentActivity) this.A02).getDefaultViewModelCreationExtras();
                }
                return invoke;
            case 9:
                return new C2615049v((UserSession) this.A02, ((AnonymousClass0iw) this.A01).getModuleName());
            case 10:
                C273624mt r14 = (C273624mt) this.A02;
                if (C67057MhU.A01(C273624mt.A01(r14))) {
                    View requireViewById = ((View) this.A01).requireViewById(R.id.action_bar_container);
                    0qQ.A0A(requireViewById);
                    return requireViewById;
                }
                C66934MfT mfT = r14.A02;
                if (mfT != null) {
                    2dZ r02 = mfT.A00;
                    if (r02 != null) {
                        return r02.A0P;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                break;
            case 11:
                C66934MfT mfT2 = ((C273624mt) this.A02).A02;
                if (mfT2 != null) {
                    2dZ r03 = mfT2.A00;
                    if (r03 != null) {
                        A0G = r03.AYI();
                    } else {
                        A0G = 2Yu.A0G(((View) this.A01).getContext(), R.attr.actionBarHeight);
                    }
                    return Integer.valueOf(A0G);
                }
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C62320sa r04 = (C62320sa) this.A01;
                if (r04 != null && (invoke2 = r04.invoke()) != null) {
                    return invoke2;
                }
                AnonymousClass07g r15 = (AnonymousClass07g) ((AnonymousClass0eM) this.A02).getValue();
                if (!(r15 instanceof AnonymousClass07P) || (r1 = (AnonymousClass07P) r15) == null) {
                    return AnonymousClass2YP.A00;
                }
                return r1.getDefaultViewModelCreationExtras();
            case 13:
                AnonymousClass4AK r3 = (AnonymousClass4AK) this.A02;
                C3018660j.A01(r3.A01).A0H(C319726r6.BIRTHDAY_INDICATOR, (AnonymousClass4AS) this.A01);
                AnonymousClass4AF r05 = r3.A02;
                C69980NvK.A00(r05.A01, r05.A03);
                return C60340gF.A00;
            case 14:
                AnonymousClass7P7 r06 = (AnonymousClass7P7) this.A02;
                return new C327997Da((AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue(), new PAY(r06.A08, r06.A09));
            case 15:
                AnonymousClass7P7 r07 = (AnonymousClass7P7) this.A02;
                C332807Wl r4 = r07.A08;
                AnonymousClass9HC r2 = r07.A09;
                return new AnonymousClass7BB((AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue(), AnonymousClass768.A00(r4, r2), new AnonymousClass7RW(r07.A06, r07.A07, r4, r2));
            case 16:
                AnonymousClass7P7 r08 = (AnonymousClass7P7) this.A02;
                C332807Wl r42 = r08.A08;
                AnonymousClass9HC r22 = r08.A09;
                return new AnonymousClass7BB((AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue(), AnonymousClass768.A00(r42, r22), new AnonymousClass7RY(r08.A06, r08.A07, r42, r22));
            case 17:
                AnonymousClass7P7 r09 = (AnonymousClass7P7) this.A02;
                C332807Wl r43 = r09.A08;
                AnonymousClass9HC r23 = r09.A09;
                return new AnonymousClass7BB((AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue(), AnonymousClass768.A00(r43, r23), new C72549PAg(r09.A06, r09.A07, r43));
            case EglBase14Impl.EGLExt_SDK_VERSION:
                AnonymousClass7P7 r16 = (AnonymousClass7P7) this.A02;
                C332807Wl r5 = r16.A08;
                AnonymousClass9HC r44 = r16.A09;
                AnonymousClass7DR r32 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                UserSession userSession = r16.A07;
                AnonymousClass0iw r17 = r16.A06;
                0qQ.A0B(r32, 2);
                0qQ.A0B(r17, 4);
                return new C327997Da(r32, new AnonymousClass7RW(r17, userSession, r5, r44));
            case 19:
                AnonymousClass7P7 r010 = (AnonymousClass7P7) this.A02;
                UserSession userSession2 = r010.A07;
                AnonymousClass0iw r45 = r010.A06;
                C332807Wl r33 = r010.A08;
                AnonymousClass9HC r24 = r010.A09;
                AnonymousClass7DR r18 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0B(r45, 1);
                0qQ.A0B(r18, 4);
                return new C327997Da(r18, new AnonymousClass7RY(r45, userSession2, r33, r24));
            case 20:
                AnonymousClass7P7 r011 = (AnonymousClass7P7) this.A02;
                return new C388849oU((AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue(), new PAX(r011.A08, r011.A09), Na6.class);
            case 21:
                AnonymousClass7P7 r012 = (AnonymousClass7P7) this.A02;
                C72558PAp pAp = new C72558PAp(r012.A06, r012.A07, r012.A08, r012.A09);
                AnonymousClass7DR r19 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0B(r19, 2);
                return new C327997Da(r19, pAp);
            case 22:
                AnonymousClass7P7 r013 = (AnonymousClass7P7) this.A02;
                C72548PAf pAf = new C72548PAf(r013.A06, r013.A08, r013.A09);
                AnonymousClass7DR r110 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0B(r110, 2);
                return new C327997Da(r110, pAf);
            case 23:
                AnonymousClass7P7 r014 = (AnonymousClass7P7) this.A02;
                C72550PAh pAh = new C72550PAh(r014.A06, r014.A08, r014.A09);
                AnonymousClass7DR r111 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0B(r111, 2);
                return new C327997Da(r111, pAh);
            case 24:
                AnonymousClass7P7 r015 = (AnonymousClass7P7) this.A02;
                C72560PAr pAr = new C72560PAr(r015.A06, r015.A08, r015.A09);
                AnonymousClass7DR r112 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0B(r112, 2);
                return new C327997Da(r112, pAr);
            case 25:
                AnonymousClass7P7 r016 = (AnonymousClass7P7) this.A02;
                C332807Wl r25 = r016.A08;
                PB4 pb4 = new PB4(r016.A06, r016.A07, r25);
                AnonymousClass7DR r113 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0B(r113, 2);
                return new C327997Da(r113, pb4);
            case 26:
                AnonymousClass7P7 r017 = (AnonymousClass7P7) this.A02;
                return new C388849oU((AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue(), new PAX(r017.A08, r017.A09), Na5.class);
            case 27:
                AnonymousClass7P7 r114 = (AnonymousClass7P7) this.A02;
                return new C327997Da((AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue(), new C72543PAa(r114.A06, r114.A08, r114.A09));
            case 28:
                AnonymousClass7P7 r26 = (AnonymousClass7P7) this.A02;
                UserSession userSession3 = r26.A07;
                C332807Wl r6 = r26.A08;
                AnonymousClass9HC r7 = r26.A09;
                AnonymousClass7DR r115 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                AnonymousClass0iw r46 = r26.A06;
                0qQ.A0B(r115, 3);
                0qQ.A0B(r46, 4);
                return new C327997Da(r115, new LayeredXmaContentDefinition(r46, userSession3, r6, r7, false));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                AnonymousClass7P7 r018 = (AnonymousClass7P7) this.A02;
                UserSession userSession4 = r018.A07;
                C332807Wl r62 = r018.A08;
                AnonymousClass9HC r72 = r018.A09;
                AnonymousClass0iw r47 = r018.A06;
                AnonymousClass7BA r116 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r116, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.layeredxma.LayeredXmaContentViewHolder>");
                0qQ.A0B(r47, 3);
                0qQ.A0B(r116, 4);
                return new AnonymousClass7BB(r116, AnonymousClass768.A00(r62, r72), new LayeredXmaContentDefinition(r47, userSession4, r62, r72, true));
            case 30:
                AnonymousClass7P7 r019 = (AnonymousClass7P7) this.A02;
                return new C327997Da((AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue(), new PAV(r019.A08, r019.A09));
            case 31:
                AnonymousClass7P7 r117 = (AnonymousClass7P7) this.A02;
                Context context = r117.A04;
                UserSession userSession5 = r117.A07;
                AnonymousClass7Bn r63 = new AnonymousClass7Bn(((AnonymousClass7DP) ((AnonymousClass0eM) this.A01).getValue()).A04);
                C332807Wl r73 = r117.A08;
                AnonymousClass9HC r8 = r117.A09;
                return C70040NwI.A00(context, r117.A06, userSession5, (C3256673q) r117.A0B.getValue(), r63, r73, r8);
            case 32:
                AnonymousClass7P7 r020 = (AnonymousClass7P7) this.A02;
                C332807Wl r52 = r020.A08;
                AnonymousClass9HC r64 = r020.A09;
                return C70011Nvp.A00(r020.A03, r020.A06, r020.A07, (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue(), r52, r64);
            case 33:
                AnonymousClass7P7 r021 = (AnonymousClass7P7) this.A02;
                C72557PAo pAo = new C72557PAo(r021.A06, r021.A07, r021.A08, r021.A09);
                AnonymousClass7DR r118 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0B(r118, 2);
                return new C327997Da(r118, pAo);
            case 34:
                AnonymousClass7P7 r27 = (AnonymousClass7P7) this.A02;
                C332807Wl r74 = r27.A08;
                AnonymousClass9HC r82 = r27.A09;
                AnonymousClass7DR r119 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                AnonymousClass0iw r48 = r27.A06;
                UserSession userSession6 = r27.A07;
                0qQ.A0B(r119, 2);
                0qQ.A0B(r48, 3);
                return new C327997Da(r119, new PB6(r48, userSession6, (C3256673q) null, r74, r82, (AnonymousClass7ZF) null, (AnonymousClass7DY) null, false));
            case 35:
                AnonymousClass7P7 r120 = (AnonymousClass7P7) this.A02;
                UserSession userSession7 = r120.A07;
                C332807Wl r49 = r120.A08;
                AnonymousClass9HC r53 = r120.A09;
                return C70039NwH.A00(r120.A06, userSession7, (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue(), r49, r53, false);
            case 36:
                AnonymousClass7P7 r121 = (AnonymousClass7P7) this.A02;
                UserSession userSession8 = r121.A07;
                C332807Wl r410 = r121.A08;
                AnonymousClass9HC r54 = r121.A09;
                return C70039NwH.A00(r121.A06, userSession8, (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue(), r410, r54, true);
            case 37:
                AnonymousClass7P7 r122 = (AnonymousClass7P7) this.A02;
                return new C327997Da((AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue(), new C72545PAc(r122.A06, r122.A08, r122.A09));
            case 38:
                AnonymousClass7P7 r123 = (AnonymousClass7P7) this.A02;
                C332807Wl r65 = r123.A08;
                AnonymousClass9HC r75 = r123.A09;
                return C395169zK.A00(r123.A06, r123.A07, (C3256673q) r123.A0B.getValue(), new AnonymousClass7Bn(((AnonymousClass7DP) ((AnonymousClass0eM) this.A01).getValue()).A04), r65, r75);
            case 39:
                AnonymousClass7DR r34 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                C3258874o r124 = (C3258874o) ((AnonymousClass0eM) this.A02).getValue();
                0qQ.A0B(r34, 0);
                0qQ.A0B(r124, 1);
                return new C327997Da(r34, r124);
            case 40:
                AnonymousClass7P7 r28 = (AnonymousClass7P7) this.A02;
                Context context2 = r28.A04;
                UserSession userSession9 = r28.A07;
                C332807Wl r76 = r28.A08;
                AnonymousClass9HC r83 = r28.A09;
                AnonymousClass7BA r125 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r125, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.quotedreply.expandabletext.ExpandableTextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r55 = r28.A06;
                0qQ.A0B(r125, 4);
                0qQ.A0B(r55, 5);
                return new AnonymousClass7BB(r125, new AnonymousClass77K(context2, r55, userSession9, r76, r83), new AnonymousClass749(userSession9, r76, r83));
            case Seq.NULL_REFNUM:
                AnonymousClass7P7 r29 = (AnonymousClass7P7) this.A02;
                Context context3 = r29.A04;
                UserSession userSession10 = r29.A07;
                C332807Wl r77 = r29.A08;
                AnonymousClass9HC r84 = r29.A09;
                AnonymousClass7BA r126 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r126, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r56 = r29.A06;
                0qQ.A0B(r126, 4);
                0qQ.A0B(r56, 5);
                return new AnonymousClass7BB(r126, new AnonymousClass77K(context3, r56, userSession10, r77, r84), new AnonymousClass77K(context3, r56, userSession10, r77, r84));
            case Seq.RefTracker.REF_OFFSET:
                AnonymousClass7P7 r210 = (AnonymousClass7P7) this.A02;
                Context context4 = r210.A04;
                UserSession userSession11 = r210.A07;
                C332807Wl r78 = r210.A08;
                AnonymousClass9HC r85 = r210.A09;
                AnonymousClass7BA r127 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r127, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.visual.VisualContentViewHolder>");
                AnonymousClass0iw r57 = r210.A06;
                0qQ.A0B(r127, 4);
                0qQ.A0B(r57, 5);
                return new AnonymousClass7BB(r127, new AnonymousClass77K(context4, r57, userSession11, r78, r85), new AnonymousClass7RW(r57, userSession11, r78, r85));
            case 43:
                AnonymousClass7P7 r211 = (AnonymousClass7P7) this.A02;
                Context context5 = r211.A04;
                UserSession userSession12 = r211.A07;
                C332807Wl r79 = r211.A08;
                AnonymousClass9HC r86 = r211.A09;
                AnonymousClass7BA r128 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r128, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r58 = r211.A06;
                0qQ.A0B(r128, 4);
                0qQ.A0B(r58, 5);
                return new AnonymousClass7BB(r128, new AnonymousClass77K(context5, r58, userSession12, r79, r86), new AnonymousClass7RY(r58, userSession12, r79, r86));
            case 44:
                AnonymousClass7P7 r212 = (AnonymousClass7P7) this.A02;
                Context context6 = r212.A04;
                UserSession userSession13 = r212.A07;
                C332807Wl r710 = r212.A08;
                AnonymousClass9HC r87 = r212.A09;
                AnonymousClass7BA r129 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r129, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder>");
                AnonymousClass0iw r59 = r212.A06;
                0qQ.A0B(r129, 4);
                0qQ.A0B(r59, 5);
                return new AnonymousClass7BB(r129, new AnonymousClass77K(context6, r59, userSession13, r710, r87), C395119zF.A00(r59, userSession13, r710, r87));
            case 45:
                AnonymousClass7P7 r130 = (AnonymousClass7P7) this.A02;
                UserSession userSession14 = r130.A07;
                C332807Wl r510 = r130.A08;
                AnonymousClass9HC r411 = r130.A09;
                AnonymousClass7BA r35 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r35, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visual.VisualContentViewHolder, com.instagram.direct.messagethread.quotedreply.expandabletext.ExpandableTextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r213 = r130.A06;
                0qQ.A0B(r35, 3);
                0qQ.A0B(r213, 4);
                return new AnonymousClass7BB(r35, new AnonymousClass7RW(r213, userSession14, r510, r411), new AnonymousClass749(userSession14, r510, r411));
            case 46:
                AnonymousClass7P7 r214 = (AnonymousClass7P7) this.A02;
                Context context7 = r214.A04;
                UserSession userSession15 = r214.A07;
                C332807Wl r711 = r214.A08;
                AnonymousClass9HC r88 = r214.A09;
                AnonymousClass7BA r131 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r131, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visual.VisualContentViewHolder, com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r511 = r214.A06;
                0qQ.A0B(r131, 4);
                0qQ.A0B(r511, 5);
                return new AnonymousClass7BB(r131, new AnonymousClass7RW(r511, userSession15, r711, r88), new AnonymousClass77K(context7, r511, userSession15, r711, r88));
            case 47:
                AnonymousClass7P7 r022 = (AnonymousClass7P7) this.A02;
                return new C327997Da((AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue(), new PAW(r022.A08, r022.A09));
            case 48:
                AnonymousClass7P7 r132 = (AnonymousClass7P7) this.A02;
                UserSession userSession16 = r132.A07;
                C332807Wl r512 = r132.A08;
                AnonymousClass9HC r412 = r132.A09;
                AnonymousClass7BA r36 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r36, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.visual.VisualContentViewHolder>");
                AnonymousClass0iw r215 = r132.A06;
                0qQ.A0B(r36, 4);
                0qQ.A0B(r215, 5);
                return new AnonymousClass7BB(r36, new AnonymousClass7RY(r215, userSession16, r512, r412), new AnonymousClass7RW(r215, userSession16, r512, r412));
            default:
                AnonymousClass7P7 r133 = (AnonymousClass7P7) this.A02;
                UserSession userSession17 = r133.A07;
                C332807Wl r513 = r133.A08;
                AnonymousClass9HC r413 = r133.A09;
                AnonymousClass7BA r37 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r37, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r216 = r133.A06;
                0qQ.A0B(r37, 4);
                0qQ.A0B(r216, 5);
                return new AnonymousClass7BB(r37, new AnonymousClass7RY(r216, userSession17, r513, r413), new AnonymousClass7RY(r216, userSession17, r513, r413));
        }
        0qQ.A0F("actionBarController");
        throw AnonymousClass00P.createAndThrow();
    }
}
