package X;

/* renamed from: X.MMd  reason: case insensitive filesystem */
public final class C66294MMd extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66294MMd(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C66294MMd(obj, i));
    }

    public static 0t0 A01(Object obj, int i) {
        return AnonymousClass0eN.A01(new C66294MMd(obj, i));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0348: MOVE  (r1v15 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r1v13 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x046e;
                case 1: goto L_0x0467;
                case 2: goto L_0x0005;
                case 3: goto L_0x0457;
                case 4: goto L_0x043b;
                case 5: goto L_0x042a;
                case 6: goto L_0x03fb;
                case 7: goto L_0x03d7;
                case 8: goto L_0x03a4;
                case 9: goto L_0x0391;
                case 10: goto L_0x037c;
                case 11: goto L_0x0367;
                case 12: goto L_0x033e;
                case 13: goto L_0x02eb;
                case 14: goto L_0x029a;
                case 15: goto L_0x000c;
                case 16: goto L_0x0285;
                case 17: goto L_0x046e;
                case 18: goto L_0x0467;
                case 19: goto L_0x0005;
                case 20: goto L_0x0275;
                case 21: goto L_0x0267;
                case 22: goto L_0x025a;
                case 23: goto L_0x0248;
                case 24: goto L_0x022a;
                case 25: goto L_0x0219;
                case 26: goto L_0x01fc;
                case 27: goto L_0x01e6;
                case 28: goto L_0x01b6;
                case 29: goto L_0x01a9;
                case 30: goto L_0x0193;
                case 31: goto L_0x017e;
                case 32: goto L_0x0161;
                case 33: goto L_0x015a;
                case 34: goto L_0x046e;
                case 35: goto L_0x0467;
                case 36: goto L_0x0005;
                case 37: goto L_0x014a;
                case 38: goto L_0x00e6;
                case 39: goto L_0x00c8;
                case 40: goto L_0x00bb;
                case 41: goto L_0x00a5;
                case 42: goto L_0x009a;
                case 43: goto L_0x0085;
                case 44: goto L_0x0077;
                case 45: goto L_0x0069;
                case 46: goto L_0x0054;
                case 47: goto L_0x0046;
                case 48: goto L_0x0031;
                case 49: goto L_0x0025;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
            X.07f r4 = X.DbY.A0I(r0)
        L_0x000b:
            return r4
        L_0x000c:
            java.lang.Object r0 = r12.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 2356(0x934, float:3.301E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r4 = r1.getString(r0)
            if (r4 != 0) goto L_0x000b
            java.lang.String r0 = "Media id not found in fragment arguments"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0025:
            java.lang.Object r0 = r12.A01
            X.Vch r0 = (X.C17712Vch) r0
            android.view.View r0 = r0.A02
            X.VTH r4 = new X.VTH
            r4.<init>(r0)
            return r4
        L_0x0031:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            java.lang.Object r0 = r12.A01
            X.Vch r0 = (X.C17712Vch) r0
            android.view.View r1 = r0.A02
            r0 = 2131441199(0x7f0b362f, float:1.8504403E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.Us7 r4 = new X.Us7
            r4.<init>(r0)
            return r4
        L_0x0046:
            java.lang.Object r0 = r12.A01
            X.Vch r0 = (X.C17712Vch) r0
            android.view.View r1 = r0.A02
            r0 = 2131443727(0x7f0b400f, float:1.850953E38)
            android.view.View r4 = r1.requireViewById(r0)
            return r4
        L_0x0054:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            java.lang.Object r0 = r12.A01
            X.Vch r0 = (X.C17712Vch) r0
            android.view.View r1 = r0.A02
            r0 = 2131436167(0x7f0b2287, float:1.8494197E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.Us7 r4 = new X.Us7
            r4.<init>(r0)
            return r4
        L_0x0069:
            java.lang.Object r0 = r12.A01
            X.Vch r0 = (X.C17712Vch) r0
            android.view.View r1 = r0.A02
            r0 = 2131436000(0x7f0b21e0, float:1.8493858E38)
            android.view.View r4 = r1.requireViewById(r0)
            return r4
        L_0x0077:
            java.lang.Object r0 = r12.A01
            X.Vch r0 = (X.C17712Vch) r0
            android.view.View r1 = r0.A02
            r0 = 2131438981(0x7f0b2d85, float:1.8499904E38)
            android.view.View r4 = r1.requireViewById(r0)
            return r4
        L_0x0085:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            java.lang.Object r0 = r12.A01
            X.Vch r0 = (X.C17712Vch) r0
            android.view.View r1 = r0.A02
            r0 = 2131431400(0x7f0b0fe8, float:1.8484528E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.Us7 r4 = new X.Us7
            r4.<init>(r0)
            return r4
        L_0x009a:
            java.lang.Object r0 = r12.A01
            X.4mU r0 = (X.C273384mU) r0
            if (r0 == 0) goto L_0x0364
            r0.EHd()
            goto L_0x0364
        L_0x00a5:
            java.lang.Object r2 = r12.A01
            X.K7c r2 = (X.C61427K7c) r2
            X.0eM r0 = r2.A0H
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A0E
            com.instagram.reels.prompt.model.PromptStickerModel r0 = X.JTT.A0g(r0)
            X.KCx r4 = new X.KCx
            r4.<init>(r1, r0)
            return r4
        L_0x00bb:
            java.lang.Object r0 = r12.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "tray_session_id"
            java.lang.String r4 = X.C320236s2.A01(r1, r0)
            return r4
        L_0x00c8:
            java.lang.Object r1 = r12.A01
            X.K7c r1 = (X.C61427K7c) r1
            androidx.fragment.app.FragmentActivity r5 = r1.requireActivity()
            X.0eM r0 = r1.A0H
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            r0 = 38
            X.MMd r9 = new X.MMd
            r9.<init>(r1, r0)
            r8 = 0
            X.28D r6 = X.28D.A46
            X.6b6 r4 = new X.6b6
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x00e6:
            java.lang.Object r2 = r12.A01
            X.K7c r2 = (X.C61427K7c) r2
            X.3uh r1 = r2.A01
            if (r1 == 0) goto L_0x0364
            X.3WT r0 = X.AnonymousClass3WT.AVATAR
            java.util.List r0 = r1.Bkd(r0)
            if (r0 == 0) goto L_0x0364
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3ui r0 = (X.C255783ui) r0
            if (r0 == 0) goto L_0x0364
            X.ToH r5 = r0.A0C
            if (r5 == 0) goto L_0x0364
            X.37E r1 = X.AnonymousClass37D.A00
            android.content.Context r0 = r2.requireContext()
            X.37D r3 = r1.A02(r0)
            if (r3 == 0) goto L_0x0113
            r0 = 1
            X.37F r3 = (X.AnonymousClass37F) r3
            r3.A0m = r0
        L_0x0113:
            X.6nn r3 = r2.A02
            if (r3 == 0) goto L_0x0139
            android.content.Context r4 = r2.requireContext()
            X.0eM r0 = r2.A0I
            java.lang.Object r0 = r0.getValue()
            com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel r0 = (com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel) r0
            X.3mM r6 = r0.A01
            if (r6 == 0) goto L_0x0364
            X.Lw5 r7 = new X.Lw5
            r7.<init>(r2)
            r10 = 0
            r11 = 1
            java.lang.String r8 = "ig_stories_consumption"
            r0 = 79
            java.lang.String r9 = X.C273654mx.A00(r0)
            r3.A0C(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0139:
            android.content.Context r0 = r2.requireContext()
            X.37D r1 = r1.A02(r0)
            if (r1 == 0) goto L_0x0364
            r0 = 0
            X.37F r1 = (X.AnonymousClass37F) r1
            r1.A0m = r0
            goto L_0x0364
        L_0x014a:
            java.lang.Object r0 = r12.A01
            X.K7c r0 = (X.C61427K7c) r0
            X.0eM r0 = r0.A0H
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6as r4 = new X.6as
            r4.<init>(r0)
            return r4
        L_0x015a:
            java.lang.Object r0 = r12.A01
            X.07f r4 = X.C51971G9r.A0U(r0)
            return r4
        L_0x0161:
            java.lang.Object r6 = r12.A01
            X.K7c r6 = (X.C61427K7c) r6
            X.0hq r5 = r6.mFragmentManager
            X.3uh r4 = r6.A01
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            X.0eM r0 = r6.A0H
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            r1 = 2
            X.LUV r0 = new X.LUV
            r0.<init>(r1, r5, r6, r4)
            X.C63406KwS.A00(r3, r0, r6, r2, r4)
            goto L_0x0364
        L_0x017e:
            java.lang.Object r2 = r12.A01
            X.K7c r2 = (X.C61427K7c) r2
            X.0eM r0 = r2.A0H
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.328 r0 = new X.328
            r0.<init>(r2)
            X.32A r4 = new X.32A
            r4.<init>(r2, r1, r0)
            return r4
        L_0x0193:
            java.lang.Object r0 = r12.A01
            android.os.Bundle r2 = X.DbS.A0B(r0)
            java.lang.Class<com.instagram.api.schemas.StoryPromptTappableDataIntf> r1 = com.instagram.api.schemas.StoryPromptTappableDataIntf.class
            java.lang.String r0 = "prompt_sticker_model"
            android.os.Parcelable r0 = X.C320236s2.A00(r2, r1, r0)
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = (com.instagram.api.schemas.StoryPromptTappableDataIntf) r0
            com.instagram.reels.prompt.model.PromptStickerModel r4 = new com.instagram.reels.prompt.model.PromptStickerModel
            r4.<init>(r0)
            return r4
        L_0x01a9:
            java.lang.Object r0 = r12.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "media_id"
            java.lang.String r4 = r1.getString(r0)
            return r4
        L_0x01b6:
            java.lang.Object r5 = r12.A01
            X.K7c r5 = (X.C61427K7c) r5
            X.0eM r0 = r5.A0H
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r5.A0D
            java.lang.String r8 = X.DbS.A0t(r0)
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "tray_session_id"
            java.lang.String r9 = X.C320236s2.A01(r1, r0)
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "viewer_session_id"
            java.lang.String r10 = X.C320236s2.A01(r1, r0)
            X.0eM r0 = r5.A0E
            com.instagram.reels.prompt.model.PromptStickerModel r7 = X.JTT.A0g(r0)
            X.LN4 r4 = new X.LN4
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x01e6:
            java.lang.Object r0 = r12.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "camera_entry_point_type"
            java.io.Serializable r4 = r1.getSerializable(r0)
            r0 = 1626(0x65a, float:2.279E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r4, r0)
            return r4
        L_0x01fc:
            java.lang.Object r0 = r12.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 372(0x174, float:5.21E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0217
            X.16F r0 = X.16P.A00(r0)
            X.6b1 r4 = X.C14291TtP.parseFromJson(r0)
            return r4
        L_0x0217:
            r4 = 0
            return r4
        L_0x0219:
            java.lang.Object r0 = r12.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 371(0x173, float:5.2E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            android.os.Parcelable r4 = r1.getParcelable(r0)
            return r4
        L_0x022a:
            java.lang.Object r1 = r12.A01
            X.K7c r1 = (X.C61427K7c) r1
            androidx.fragment.app.FragmentActivity r5 = r1.requireActivity()
            X.2pE r7 = r1.A04
            androidx.recyclerview.widget.RecyclerView r6 = r1.A00
            if (r6 == 0) goto L_0x03d4
            X.0eM r0 = r1.A07
            java.lang.Object r8 = r0.getValue()
            X.JlI r8 = (X.C60425JlI) r8
            X.L2J r9 = r1.A06
            X.KWG r4 = new X.KWG
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x0248:
            java.lang.Object r2 = r12.A01
            X.K7c r2 = (X.C61427K7c) r2
            X.0eM r0 = r2.A0H
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.MU7 r0 = r2.A05
            X.JlI r4 = new X.JlI
            r4.<init>(r2, r1, r0)
            return r4
        L_0x025a:
            java.lang.Object r0 = r12.A01
            X.LN4 r0 = (X.LN4) r0
            com.instagram.common.session.UserSession r1 = r0.A02
            X.0iw r0 = r0.A01
            X.0wc r4 = X.AnonymousClass0kN.A01(r0, r1)
            return r4
        L_0x0267:
            java.lang.Object r0 = r12.A01
            X.3kE r0 = (X.C249703kE) r0
            android.view.View r1 = r0.itemView
            r0 = 2131442515(0x7f0b3b53, float:1.8507072E38)
            X.3oV r4 = X.DbU.A0Z(r1, r0)
            return r4
        L_0x0275:
            java.lang.Object r0 = r12.A01
            X.K7Q r0 = (X.K7Q) r0
            X.0eM r0 = r0.A06
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBz r4 = new X.KBz
            r4.<init>(r0)
            return r4
        L_0x0285:
            java.lang.Object r2 = r12.A01
            X.K7Q r2 = (X.K7Q) r2
            X.0eM r0 = r2.A06
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.328 r0 = new X.328
            r0.<init>(r2)
            X.32A r4 = new X.32A
            r4.<init>(r2, r1, r0)
            return r4
        L_0x029a:
            java.lang.Object r5 = r12.A01
            X.K7b r5 = (X.K7b) r5
            X.0eM r0 = r5.A0G
            X.0lg r2 = X.DbT.A0X(r0)
            X.0eM r0 = r5.A0C
            java.lang.Object r0 = r0.getValue()
            com.instagram.reels.musicpick.model.MusicPickStickerModel r0 = (com.instagram.reels.musicpick.model.MusicPickStickerModel) r0
            java.lang.String r7 = r0.A02
            X.JuR r0 = r5.A03
            r6 = 0
            if (r0 == 0) goto L_0x03f1
            com.instagram.api.schemas.MediaPromptPrefType r1 = r0.A01
            r4 = 0
            X.AnonymousClass7TF.A1H(r2, r7)
            r3 = 2
            X.0qQ.A0B(r1, r3)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r2)
            java.lang.String r0 = "stories/prompt_stickers/update_author_attribution/"
            r2.A0A(r0)
            java.lang.String r0 = "prompt_sticker_id"
            r2.A9m(r0, r7)
            com.instagram.api.schemas.MediaPromptPrefType r0 = com.instagram.api.schemas.MediaPromptPrefType.ON
            if (r1 != r0) goto L_0x02e8
            java.lang.String r1 = "off"
        L_0x02d1:
            java.lang.String r0 = "value"
            X.1OC r1 = X.JTU.A0H(r2, r0, r1, r4)
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x0330
            boolean r0 = r5.isAdded()
            if (r0 == 0) goto L_0x0330
            X.0hq r6 = r5.getParentFragmentManager()
            goto L_0x0330
        L_0x02e8:
            java.lang.String r1 = "on"
            goto L_0x02d1
        L_0x02eb:
            java.lang.Object r5 = r12.A01
            X.K7b r5 = (X.K7b) r5
            X.0eM r0 = r5.A0G
            X.0lg r2 = X.DbT.A0X(r0)
            X.0eM r0 = r5.A0C
            java.lang.Object r0 = r0.getValue()
            com.instagram.reels.musicpick.model.MusicPickStickerModel r0 = (com.instagram.reels.musicpick.model.MusicPickStickerModel) r0
            java.lang.String r4 = r0.A03
            X.JuR r0 = r5.A03
            r6 = 0
            if (r0 == 0) goto L_0x03f1
            com.instagram.api.schemas.MediaPromptPrefType r1 = r0.A00
            r3 = 0
            X.C51973G9u.A1E(r2, r4, r1)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r2)
            java.lang.String r0 = "stories/prompt_stickers/update_notification_settings/"
            X.C51968G9o.A1K(r2, r0, r4)
            com.instagram.api.schemas.MediaPromptPrefType r0 = com.instagram.api.schemas.MediaPromptPrefType.ON
            if (r1 != r0) goto L_0x033b
            java.lang.String r1 = "off"
        L_0x0319:
            java.lang.String r0 = "value"
            X.1OC r1 = X.JTU.A0H(r2, r0, r1, r3)
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x032f
            boolean r0 = r5.isAdded()
            if (r0 == 0) goto L_0x032f
            X.0hq r6 = r5.getParentFragmentManager()
        L_0x032f:
            r3 = 3
        L_0x0330:
            X.HDx r0 = new X.HDx
            r0.<init>(r6, r5, r3)
            r1.A00 = r0
            r5.schedule(r1)
            goto L_0x0364
        L_0x033b:
            java.lang.String r1 = "on"
            goto L_0x0319
        L_0x033e:
            java.lang.Object r4 = r12.A01
            X.K7b r4 = (X.K7b) r4
            androidx.fragment.app.Fragment r1 = r4.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x0351
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x0351
            X.7Pu r0 = r1.A02
            X.DbW.A1K(r0)
        L_0x0351:
            X.3uh r3 = r4.A02
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0hq r1 = r4.getParentFragmentManager()
            X.0eM r0 = r4.A0G
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.C17040VFo.A00(r2, r1, r0, r3)
        L_0x0364:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0367:
            java.lang.Object r2 = r12.A01
            X.K7b r2 = (X.K7b) r2
            X.0eM r0 = r2.A0G
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.328 r0 = new X.328
            r0.<init>(r2)
            X.32A r4 = new X.32A
            r4.<init>(r2, r1, r0)
            return r4
        L_0x037c:
            java.lang.Object r0 = r12.A01
            X.K7b r0 = (X.K7b) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.0eM r0 = r0.A0G
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            r0 = 0
            X.6bB r4 = new X.6bB
            r4.<init>(r2, r1, r0)
            return r4
        L_0x0391:
            java.lang.Object r0 = r12.A01
            android.os.Bundle r2 = X.DbS.A0B(r0)
            java.lang.Class<com.instagram.reels.musicpick.model.MusicPickStickerModel> r1 = com.instagram.reels.musicpick.model.MusicPickStickerModel.class
            r0 = 545(0x221, float:7.64E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            android.os.Parcelable r4 = X.C320236s2.A00(r2, r1, r0)
            return r4
        L_0x03a4:
            java.lang.Object r2 = r12.A01
            X.K7b r2 = (X.K7b) r2
            androidx.fragment.app.FragmentActivity r5 = r2.requireActivity()
            X.2pE r7 = r2.A05
            X.JuR r0 = r2.A03
            if (r0 == 0) goto L_0x03bf
            X.MWP r0 = r0.A02
            if (r0 == 0) goto L_0x03bf
            X.JxU r0 = (X.C61118JxU) r0
            com.instagram.api.schemas.StoryMusicPickAggregationVisibility r1 = r0.A00
            com.instagram.api.schemas.StoryMusicPickAggregationVisibility r0 = com.instagram.api.schemas.StoryMusicPickAggregationVisibility.VISIBLE
            r10 = 1
            if (r1 == r0) goto L_0x03c0
        L_0x03bf:
            r10 = 0
        L_0x03c0:
            androidx.recyclerview.widget.RecyclerView r6 = r2.A01
            if (r6 == 0) goto L_0x03d4
            X.0eM r0 = r2.A0A
            java.lang.Object r8 = r0.getValue()
            X.JlZ r8 = (X.C60441JlZ) r8
            X.L2H r9 = r2.A07
            X.KWH r4 = new X.KWH
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x03d4:
            java.lang.String r0 = "recyclerView"
            goto L_0x03f3
        L_0x03d7:
            java.lang.Object r5 = r12.A01
            X.K7b r5 = (X.K7b) r5
            X.0eM r0 = r5.A0G
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            X.MU7 r8 = r5.A08
            X.L2G r7 = r5.A06
            X.JuR r0 = r5.A03
            if (r0 == 0) goto L_0x03f1
            java.lang.String r9 = r0.A06
            X.JlZ r4 = new X.JlZ
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x03f1:
            java.lang.String r0 = "response"
        L_0x03f3:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03fb:
            java.lang.Object r3 = r12.A01
            X.9Wp r3 = (X.C380089Wp) r3
            android.content.res.Resources r1 = r3.A0B
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            int r2 = r1.getDimensionPixelSize(r0)
            r0 = 1061158912(0x3f400000, float:0.75)
            r1 = 0
            X.6KL r4 = X.AnonymousClass6KK.A00(r0, r2, r1)
            int r0 = r3.A04
            r4.setBounds(r1, r1, r0, r0)
            int r2 = r3.A05
            android.content.Context r1 = r3.A0A
            r0 = 2131099782(0x7f060086, float:1.7811927E38)
            int r1 = r1.getColor(r0)
            r4.A01 = r2
            android.graphics.Paint r0 = r4.A09
            r0.setColor(r1)
            r4.invalidateSelf()
            return r4
        L_0x042a:
            java.lang.Object r0 = r12.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 1491(0x5d3, float:2.09E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            android.os.Parcelable r4 = r1.getParcelable(r0)
            return r4
        L_0x043b:
            r0 = 3
            android.graphics.Paint r4 = X.AnonymousClass7TE.A0V(r0)
            java.lang.Object r1 = r12.A01
            X.9X0 r1 = (X.AnonymousClass9X0) r1
            int r0 = r1.A00
            float r3 = (float) r0
            android.content.Context r2 = r1.A02
            android.app.Activity r1 = r1.A01
            r0 = 2130970316(0x7f0406cc, float:1.7549339E38)
            int r1 = X.JTP.A02(r1, r2, r0)
            r0 = 0
            r4.setShadowLayer(r3, r0, r0, r1)
            return r4
        L_0x0457:
            java.lang.Object r0 = r12.A01
            X.K7U r0 = (X.K7U) r0
            X.0eM r0 = r0.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBy r4 = new X.KBy
            r4.<init>(r0)
            return r4
        L_0x0467:
            java.lang.Object r0 = r12.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x046e:
            java.lang.Object r4 = r12.A01
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66294MMd.invoke():java.lang.Object");
    }
}
