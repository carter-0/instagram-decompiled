package X;

import android.content.Context;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ElectionAddYoursInfoDictIntf;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.api.schemas.StoryTemplateDictIntf;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.WvT  reason: case insensitive filesystem */
public final class C20590WvT extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20590WvT(Object obj, Object obj2, Object obj3, Object obj4, AnonymousClass4D7 r6, int i, boolean z) {
        super(2, r6);
        this.A01 = i;
        this.A02 = obj;
        this.A00 = obj2;
        this.A03 = obj3;
        this.A05 = z;
        this.A04 = obj4;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.WvT, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        Object obj5;
        int i;
        AnonymousClass4D7 r5 = r10;
        switch (this.A01) {
            case 0:
                obj2 = this.A02;
                obj3 = this.A00;
                obj4 = this.A03;
                z = this.A05;
                obj5 = this.A04;
                i = 0;
                break;
            case 1:
                C20590WvT wvT = new C20590WvT((C67732Mtl) this.A04, (L8U) this.A03, (UpcomingEvent) this.A02, r5, this.A05);
                wvT.A00 = obj;
                return wvT;
            default:
                obj4 = this.A03;
                z = this.A05;
                obj5 = this.A04;
                obj2 = this.A02;
                obj3 = this.A00;
                i = 2;
                break;
        }
        return new C20590WvT(obj2, obj3, obj4, obj5, r5, i, z);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        N4F n4f;
        AnonymousClass5B2 r7;
        StoryPromptTappableDataIntf Bhq;
        Object obj2;
        StoryPromptTappableData storyPromptTappableData;
        SubscriptionStickerDict subscriptionStickerDict;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        String str;
        switch (this.A01) {
            case 0:
                0eS.A00(obj);
                S8G.A00((Context) this.A00, (Bundle) this.A04, (Q8n) this.A03, (C270254gR) this.A02, this.A05);
                break;
            case 1:
                0eS.A00(obj);
                C262224Cq r6 = (C262224Cq) this.A00;
                C67732Mtl mtl = (C67732Mtl) this.A04;
                05G r2 = mtl.A04;
                boolean z = this.A05;
                do {
                    value = r2.getValue();
                    n4f = (N4F) value;
                } while (!r2.AIY(value, N4F.A00(n4f.A01, AnonymousClass05K.A0C, n4f.A03, n4f.A04, n4f.A00, z, n4f.A06)));
                mtl.A01.A03(new PRV(mtl, (UpcomingEvent) this.A02, z), (L8U) this.A03, r6);
                break;
            default:
                0eS.A00(obj);
                1Xj r12 = (1Xj) this.A03;
                Boolean valueOf = Boolean.valueOf(this.A05);
                List C0x = r12.A0C.C0x();
                if (!(C0x == null || C0x.size() != 1 || (Bhq = r7.Bhq()) == null)) {
                    C17946Vib AKQ = Bhq.AKQ();
                    AKQ.A0G = valueOf;
                    TreeUpdaterJNI treeUpdaterJNI6 = null;
                    C13989Tnp.A0y();
                    StoryPromptTappableDataIntf storyPromptTappableDataIntf = AKQ.A0S;
                    if (storyPromptTappableDataIntf instanceof ImmutablePandoStoryPromptTappableData) {
                        0eP[] r1 = new 0eP[28];
                        0eP r0 = new 0eP("background_color", AKQ.A0L);
                        StoryPromptDisablementState storyPromptDisablementState = AKQ.A03;
                        0qQ.A0B(storyPromptDisablementState, 0);
                        0eP r02 = new 0eP("disablement_state", storyPromptDisablementState.A00);
                        ElectionAddYoursInfoDictIntf electionAddYoursInfoDictIntf = AKQ.A01;
                        if (electionAddYoursInfoDictIntf != null) {
                            treeUpdaterJNI = electionAddYoursInfoDictIntf.FHC();
                        } else {
                            treeUpdaterJNI = null;
                        }
                        0eP r03 = new 0eP("election_add_yours_info", treeUpdaterJNI);
                        List list = AKQ.A0R;
                        ArrayList A0r = AnonymousClass7TG.A0r(list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C41846B3n.A1T(A0r, it);
                        }
                        0eP r04 = new 0eP("facepile_top_participants", A0r);
                        GenAIToolInfoDictIntf genAIToolInfoDictIntf = AKQ.A02;
                        if (genAIToolInfoDictIntf != null) {
                            treeUpdaterJNI2 = genAIToolInfoDictIntf.FHC();
                        } else {
                            treeUpdaterJNI2 = null;
                        }
                        0eP r05 = new 0eP(AnonymousClass000.A00(1383), treeUpdaterJNI2);
                        0eP r06 = new 0eP("has_participated", AKQ.A09);
                        0eP r07 = new 0eP(PublicKeyCredentialControllerUtility.JSON_KEY_ID, AKQ.A0M);
                        0eP r08 = new 0eP("is_before_and_after", AKQ.A0A);
                        0eP r09 = new 0eP("is_clips_v2_media", AKQ.A0B);
                        0eP r010 = new 0eP("is_created_from_add_yours_browsing", AKQ.A0C);
                        0eP r011 = new 0eP("is_from_add_yours_camera_tool", AKQ.A0D);
                        0eP r012 = new 0eP("is_icon_disabled", AKQ.A0E);
                        0eP r013 = new 0eP("is_original_prompt_media", AKQ.A0F);
                        0eP r014 = new 0eP("is_pinned_by_creator", AKQ.A0G);
                        0eP r015 = new 0eP("is_speakeasy", AKQ.A0H);
                        0eP r016 = new 0eP("is_story_trending_prompt", AKQ.A0I);
                        0eP r017 = new 0eP("is_trending_prompt", AKQ.A0J);
                        0eP r018 = new 0eP("is_viewer_original_author", AKQ.A0K);
                        0eP r019 = new 0eP("media_id", AKQ.A0N);
                        User user = AKQ.A08;
                        if (user != null) {
                            treeUpdaterJNI3 = user.A08();
                        } else {
                            treeUpdaterJNI3 = null;
                        }
                        0eP r020 = new 0eP("original_author", treeUpdaterJNI3);
                        0eP r021 = new 0eP("participant_count", Integer.valueOf(AKQ.A00));
                        StoryPromptParticipationFrictionInfoDict storyPromptParticipationFrictionInfoDict = AKQ.A05;
                        if (storyPromptParticipationFrictionInfoDict != null) {
                            treeUpdaterJNI4 = storyPromptParticipationFrictionInfoDict.FHC();
                        } else {
                            treeUpdaterJNI4 = null;
                        }
                        0eP r15 = new 0eP(C273654mx.A00(873), treeUpdaterJNI4);
                        StoryPromptFailureTooltipDictIntf storyPromptFailureTooltipDictIntf = AKQ.A04;
                        if (storyPromptFailureTooltipDictIntf != null) {
                            treeUpdaterJNI5 = storyPromptFailureTooltipDictIntf.FHC();
                        } else {
                            treeUpdaterJNI5 = null;
                        }
                        0eP r14 = new 0eP("prompt_failure_tooltip", treeUpdaterJNI5);
                        0eP r13 = new 0eP("prompt_style", AKQ.A0O);
                        StoryPromptType storyPromptType = AKQ.A06;
                        if (storyPromptType != null) {
                            str = storyPromptType.A00;
                        } else {
                            str = null;
                        }
                        0eP r11 = new 0eP("prompt_type", str);
                        0eP r10 = new 0eP("sticker_style_str", AKQ.A0P);
                        StoryTemplateDictIntf storyTemplateDictIntf = AKQ.A07;
                        if (storyTemplateDictIntf != null) {
                            treeUpdaterJNI6 = storyTemplateDictIntf.FHC();
                        }
                        System.arraycopy(new 0eP[]{r0, r02, r03, r04, r05, r06, r07, r08, r09, r010, r011, r012, r013, r014, r015, r016, r017, r018, r019, r020, r021, r15, r14, r13, r11, r10, new 0eP("story_template", treeUpdaterJNI6)}, 0, r1, 0, 27);
                        System.arraycopy(DbW.A1b("text", AKQ.A0Q), 0, r1, 27, 1);
                        obj2 = C41847B3o.A0o(storyPromptTappableDataIntf, r1);
                    } else {
                        obj2 = AKQ.A00();
                    }
                    1Xy r112 = r12.A0C;
                    C17743VdC AKR = (r7 = (AnonymousClass5B2) C0x.get(0)).AKR();
                    AKR.A01 = (StoryPromptTappableDataIntf) obj2;
                    1E9 r22 = new 1E9(new 1hu((UserSession) null), 6, false);
                    String str2 = AKR.A0G;
                    String str3 = AKR.A0H;
                    String str4 = AKR.A0I;
                    String str5 = AKR.A0J;
                    Float f = AKR.A03;
                    Float f2 = AKR.A04;
                    String str6 = AKR.A0K;
                    Integer num = AKR.A0B;
                    Integer num2 = AKR.A0C;
                    Integer num3 = AKR.A0D;
                    Integer num4 = AKR.A0E;
                    String str7 = AKR.A0L;
                    StoryPromptTappableDataIntf storyPromptTappableDataIntf2 = AKR.A01;
                    if (storyPromptTappableDataIntf2 != null) {
                        storyPromptTappableData = storyPromptTappableDataIntf2.FAr(r22);
                    } else {
                        storyPromptTappableData = null;
                    }
                    Float f3 = AKR.A05;
                    Float f4 = AKR.A06;
                    Integer num5 = AKR.A0F;
                    SubscriptionStickerDictIntf subscriptionStickerDictIntf = AKR.A02;
                    if (subscriptionStickerDictIntf != null) {
                        subscriptionStickerDict = subscriptionStickerDictIntf.FC2(r22);
                    } else {
                        subscriptionStickerDict = null;
                    }
                    Set singleton = Collections.singleton(new AnonymousClass5B1(AKR.A00, storyPromptTappableData, subscriptionStickerDict, f, f2, f3, f4, AKR.A07, AKR.A08, AKR.A09, AKR.A0A, num, num2, num3, num4, num5, str2, str3, str4, str5, str6, str7));
                    0qQ.A07(singleton);
                    r112.Emp(00k.A0a(singleton));
                }
                r12.AE7((0lg) this.A04);
                1P0 r16 = (1P0) this.A02;
                if (r16 != null) {
                    r16.onSuccess(this.A00);
                    break;
                }
                break;
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C20590WvT) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20590WvT(C67732Mtl mtl, L8U l8u, UpcomingEvent upcomingEvent, AnonymousClass4D7 r5, boolean z) {
        super(2, r5);
        this.A01 = 1;
        this.A04 = mtl;
        this.A03 = l8u;
        this.A05 = z;
        this.A02 = upcomingEvent;
    }
}
