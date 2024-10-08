package X;

import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.StoryTemplateDict;
import com.instagram.api.schemas.StoryTemplateDictIntf;
import com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel;
import com.instagram.feed.media.CreativeConfig;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;

/* renamed from: X.9r2  reason: invalid class name and case insensitive filesystem */
public final class C390289r2 extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelStoriesTemplateShareFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new MJ2(this, 13));
    public final AnonymousClass0eM A06 = new C227862kA(new MJ2(this, 14), new MJ2(this, 15), new MJ5(3, (Object) null, this), new 0Yh(StoriesTemplateParticipationViewModel.class));

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        AnonymousClass80H A012;
        MusicAttributionConfig musicAttributionConfig;
        CameraConfiguration cameraConfiguration;
        C306106Ku A032;
        GenAIToolInfoDict genAIToolInfoDict;
        StoryTemplateDictIntf C1M;
        StoryTemplateMusicStickerDictIntf BV3;
        ViewGroup viewGroup2 = viewGroup;
        RectF A0M = AnonymousClass7TG.A0M(this, viewGroup2);
        boolean A1V = AnonymousClass7TF.A1V(requireArguments().getString("key_imagine_medium_file_path"));
        UserSession A0k = AnonymousClass7TE.A0k(this);
        AnonymousClass0eM r7 = this.A05;
        PromptStickerModel promptStickerModel = (PromptStickerModel) r7.getValue();
        0qQ.A0B(promptStickerModel, 1);
        StoryTemplateDictIntf C1M2 = promptStickerModel.A00.C1M();
        boolean z = true;
        if (C1M2 == null || !AnonymousClass7TF.A1Y(C1M2.CSG(), true) || !182.A06(0Tu.A05, A0k, 36329049592708871L)) {
            z = false;
        }
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0F(A002, this);
        AnonymousClass80I r11 = AnonymousClass80H.A02;
        if (z) {
            EnumSet complementOf = EnumSet.complementOf(EnumSet.of(C358088aL.A0l, C358088aL.A04));
            0qQ.A07(complementOf);
            C279284yO[] r0 = {AnonymousClass9QA.A00, C3493880e.A00};
            0qQ.A0B(r0, 0);
            A012 = new AnonymousClass80H(complementOf, 03t.A0K(r0));
        } else {
            A012 = r11.A01(AnonymousClass7TE.A0k(this), AnonymousClass9QA.A00);
        }
        A012.getClass();
        A002.A0W = A012;
        AnonymousClass80D.A05(viewGroup2, A002, this, true);
        AnonymousClass80D.A07((28D) this.A01.getValue(), this, A002);
        C347087wF r10 = null;
        if (A1V) {
            A0M = null;
        }
        AnonymousClass80D.A02(A0M, (RectF) null, A002);
        AnonymousClass80D.A0A(A002);
        AnonymousClass80D.A0B(A002);
        A002.A3Q = true;
        A002.A38 = z;
        A002.A3A = z;
        PromptStickerModel promptStickerModel2 = (PromptStickerModel) r7.getValue();
        if (!z || promptStickerModel2 == null || (C1M = promptStickerModel2.A00.C1M()) == null || (BV3 = C1M.BV3()) == null) {
            musicAttributionConfig = null;
        } else {
            musicAttributionConfig = new MusicAttributionConfig(AHN.A00(BV3));
        }
        A002.A1N = musicAttributionConfig;
        this.A06.getValue();
        UserSession userSession = this.A00;
        0Tu r72 = 0Tu.A05;
        A002.A12 = new C3499382n((StoryTemplateDict) null, (PromptStickerModel) r7.getValue(), (C310416b1) AnonymousClass7TE.A14(this.A04), (HashMap) this.A00.getValue(), AnonymousClass0nB.A01(requireActivity()), AnonymousClass7TF.A0R(r72, userSession, 36319939968376645L).booleanValue(), AnonymousClass7TF.A1Z(this.A03));
        String string = requireArguments().getString(C273654mx.A00(2962));
        if (string != null) {
            AnonymousClass80D.A0E(A002, (AnonymousClass802) null, string);
            A002.A3y = true;
            A002.A3U = false;
            A002.A3t = false;
            A002.A3Y = true;
        }
        String string2 = requireArguments().getString("key_imagine_medium_file_path");
        if (string2 != null) {
            AnonymousClass80D.A0E(A002, (AnonymousClass802) null, string2);
            A002.A3y = true;
            int i = Build.VERSION.SDK_INT;
            Bundle requireArguments = requireArguments();
            if (i >= 33) {
                genAIToolInfoDict = (GenAIToolInfoDict) requireArguments.getParcelable("key_imagine_gen_ai_tool_info", GenAIToolInfoDict.class);
            } else {
                genAIToolInfoDict = (GenAIToolInfoDict) requireArguments.getParcelable("key_imagine_gen_ai_tool_info");
            }
            if (genAIToolInfoDict != null) {
                A002.A0I = genAIToolInfoDict;
            }
        }
        AnonymousClass0eM r4 = this.A02;
        CreativeConfig creativeConfig = (CreativeConfig) r4.getValue();
        if (creativeConfig != null) {
            UserSession A0k2 = AnonymousClass7TE.A0k(this);
            C347087wF[] r02 = C347077wE.A00;
            ArrayList A1C = AnonymousClass7TE.A1C();
            018.A18(A1C, r02);
            if (C284745Nt.A00(creativeConfig) != null && 00k.A0u(A1C, C284745Nt.A00(creativeConfig)) && 182.A06(r72, A0k2, 36326356648212202L)) {
                CreativeConfig creativeConfig2 = (CreativeConfig) r4.getValue();
                if (creativeConfig2 == null || (A032 = C284745Nt.A03(creativeConfig2)) == null) {
                    cameraConfiguration = null;
                } else {
                    cameraConfiguration = A032.A00();
                }
                A002.A0V = cameraConfiguration;
                CreativeConfig creativeConfig3 = (CreativeConfig) r4.getValue();
                if (creativeConfig3 != null) {
                    r10 = C284745Nt.A00(creativeConfig3);
                }
                A002.A0s = r10;
            }
        }
        return A002;
    }

    public final String getModuleName() {
        return "reel_prompt_template_share";
    }

    public C390289r2() {
        0eO r2 = 0eO.A02;
        this.A01 = AnonymousClass0eN.A00(r2, new MJ2(this, 9));
        this.A03 = AnonymousClass0eN.A00(r2, new MJ2(this, 11));
        this.A00 = AnonymousClass0eN.A00(r2, new MJ2(this, 8));
        this.A04 = AnonymousClass0eN.A01(new MJ2(this, 12));
        this.A02 = AnonymousClass0eN.A00(r2, new MJ2(this, 10));
    }
}
