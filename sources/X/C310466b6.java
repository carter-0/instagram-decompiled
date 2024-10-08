package X;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf;
import com.instagram.api.schemas.StoryTemplateAssetDictIntf;
import com.instagram.api.schemas.StoryTemplateDictIntf;
import com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf;
import com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf;
import com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6b6  reason: invalid class name and case insensitive filesystem */
public final class C310466b6 {
    public CreativeConfigIntf A00;
    public PromptStickerModel A01;
    public C310416b1 A02;
    public String A03;
    public HashMap A04 = new HashMap();
    public boolean A05;
    public boolean A06;
    public final FragmentActivity A07;
    public final 28D A08;
    public final 1NW A09;
    public final UserSession A0A;
    public final C310496b9 A0B;
    public final Runnable A0C;
    public final Set A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final C62320sa A0G;
    public final C310486b8 A0H;
    public final C62320sa A0I;

    public C310466b6(FragmentActivity fragmentActivity, 28D r5, UserSession userSession, C62320sa r7, C62320sa r8) {
        0qQ.A0B(userSession, 2);
        this.A07 = fragmentActivity;
        this.A0A = userSession;
        this.A08 = r5;
        this.A0I = r7;
        this.A0G = r8;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            this.A09 = new 1NW(myLooper);
            this.A0C = new C310476b7(this);
            this.A0E = AnonymousClass1YB.A00(new AnonymousClass9LJ(this, 14));
            this.A0F = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LJ(this, 15));
            this.A0D = new LinkedHashSet();
            this.A0H = new C310486b8(this);
            this.A0B = new C310496b9(this);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A00(C310466b6 r3) {
        r3.A05 = true;
        r3.A06 = false;
        r3.A03 = null;
        r3.A0D.clear();
        FragmentActivity fragmentActivity = r3.A07;
        if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
            ((Dialog) r3.A0F.getValue()).dismiss();
            if (!r3.A05) {
                r3.A03((String) null, (String) null);
            }
        }
        C62320sa r0 = r3.A0I;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public static final void A01(C310466b6 r5) {
        ArrayList<String> arrayList;
        ImageInfo BGO;
        ExtendedImageUrl A052;
        StoryTemplateGiphyStickerImageDictIntf BFu;
        String url;
        FragmentActivity fragmentActivity = r5.A07;
        if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
            PromptStickerModel promptStickerModel = r5.A01;
            if (promptStickerModel == null) {
                0qQ.A0F("promptStickerModel");
                throw AnonymousClass00P.createAndThrow();
            }
            int A012 = AnonymousClass0nB.A01(fragmentActivity);
            StoryTemplateDictIntf C1M = promptStickerModel.A00.C1M();
            if (C1M != null) {
                arrayList = new ArrayList<>();
                List<StoryTemplateStaticOverlayDictIntf> C1I = C1M.C1I();
                if (C1I != null) {
                    for (StoryTemplateStaticOverlayDictIntf B9L : C1I) {
                        StoryTemplateGiphyStickerDictIntf B9L2 = B9L.B9L();
                        if (!(B9L2 == null || (BFu = B9L2.BFu()) == null || (url = BFu.getUrl()) == null)) {
                            arrayList.add(url);
                        }
                    }
                }
                StoryTemplateAssetDictIntf C4X = C1M.C4X();
                if (!(C4X == null || (BGO = C4X.BGO()) == null || (A052 = 1iI.A05(BGO, AnonymousClass05K.A01, Math.min(A012, 1080))) == null)) {
                    arrayList.add(A052.A0A);
                }
            } else {
                arrayList = 0sn.A00;
            }
            if (arrayList.isEmpty()) {
                ((Dialog) r5.A0F.getValue()).dismiss();
                A02(r5);
                return;
            }
            for (String simpleImageUrl : arrayList) {
                1OO A0J = 1NK.A00().A0J(new SimpleImageUrl(simpleImageUrl), "stories_template_share");
                A0J.A02(r5.A0H);
                A0J.A0I = false;
                A0J.A0M = false;
                C226952iF A002 = A0J.A00();
                r5.A0D.add(A002);
                1NK.A00().A0N(A002);
            }
        }
    }

    public static final void A02(C310466b6 r7) {
        String str;
        UserSession userSession = r7.A0A;
        Class<TransparentModalActivity> cls = TransparentModalActivity.class;
        Bundle bundle = new Bundle();
        PromptStickerModel promptStickerModel = r7.A01;
        if (promptStickerModel == null) {
            str = "promptStickerModel";
        } else {
            PromptStickerModel A042 = promptStickerModel.A04();
            A042.A08(AnonymousClass0t1.A01.A01(userSession));
            bundle.putParcelable("prompt_sticker_model", A042.A02());
            C310416b1 r6 = r7.A02;
            if (r6 == null) {
                str = "drawableConfig";
            } else {
                StringWriter stringWriter = new StringWriter();
                17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
                C14291TtP.A00(A0A2, r6);
                A0A2.close();
                bundle.putString("prompt_sticker_drawable_config", stringWriter.toString());
                CreativeConfigIntf creativeConfigIntf = r7.A00;
                if (creativeConfigIntf != null) {
                    bundle.putParcelable("prompt_sticker_creative_config", creativeConfigIntf);
                }
                bundle.putSerializable("camera_entry_point_type", r7.A08);
                String str2 = r7.A03;
                if (str2 != null) {
                    bundle.putString("key_preset_medium_file_path", str2);
                    r7.A03 = null;
                    bundle.putBoolean("prompt_sticker_skip_precap_with_opaque_pinned_gallery", r7.A06);
                    r7.A06 = false;
                }
                bundle.putSerializable("prompt_avatar_sticker_urls", r7.A04);
                FragmentActivity fragmentActivity = r7.A07;
                AnonymousClass6W8.A02(fragmentActivity, bundle, userSession, cls, "reel_stories_template_share").A0C(fragmentActivity);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A03(String str, String str2) {
        C310336ap r2 = new C310336ap();
        if (str == null) {
            str = this.A07.getResources().getString(2131974340);
            0qQ.A07(str);
        }
        r2.A0D = str;
        if (str2 == null) {
            str2 = this.A07.getResources().getString(2131974341);
            0qQ.A07(str2);
        }
        r2.A0I = str2;
        r2.A05();
        r2.A0H = "stories_template_share";
        1xC.A01.A00(new AnonymousClass3GP(r2.A00()));
    }

    public final void A04(CreativeConfigIntf creativeConfigIntf, PromptStickerModel promptStickerModel, C310416b1 r15, Map map) {
        boolean z;
        StoryTemplateAssetDictIntf C4X;
        StoryTemplateDictIntf C1M;
        StoryTemplateAssetDictIntf C4X2;
        StoryTemplateAssetDictIntf C4X3;
        StoryTemplateAssetDictIntf C4X4;
        ImageInfo Aew;
        ExtendedImageUrl A052;
        String str;
        Map map2 = map;
        0qQ.A0B(promptStickerModel, 0);
        this.A06 = false;
        this.A03 = null;
        this.A01 = promptStickerModel;
        if (r15 == null) {
            C39890ADo aDo = new C39890ADo();
            aDo.A0Q = false;
            r15 = new C310416b1(aDo);
        }
        this.A02 = r15;
        this.A00 = creativeConfigIntf;
        if (map != null) {
            this.A04 = (HashMap) map2;
        }
        StoryPromptFailureTooltipDictIntf Bho = promptStickerModel.A00.Bho();
        if (Bho != null) {
            String B29 = Bho.B29();
            if (B29 != null) {
                String B28 = Bho.B28();
                if (B28 != null) {
                    A05(B29, B28);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        UserSession userSession = this.A0A;
        if (!AHN.A03(userSession, promptStickerModel)) {
            A05((String) null, (String) null);
        } else if (!promptStickerModel.A0C) {
            StoryTemplateDictIntf C1M2 = promptStickerModel.A00.C1M();
            if (C1M2 != null) {
                List C1I = C1M2.C1I();
                if (C1I != null && (!(C1I instanceof Collection) || !C1I.isEmpty())) {
                    Iterator it = C1I.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((StoryTemplateStaticOverlayDictIntf) it.next()).B9L() != null) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                boolean z2 = false;
                if (C1M2.C4X() != null) {
                    z2 = true;
                }
                if (z || z2) {
                    0Tu r3 = 0Tu.A05;
                    if (182.A06(r3, userSession, 36319939967262517L)) {
                        this.A05 = false;
                        this.A0D.clear();
                        AnonymousClass0fN.A00((Dialog) this.A0F.getValue());
                        this.A09.postDelayed(this.A0C, TimeUnit.SECONDS.toMillis(182.A01(r3, userSession, 36601414944034989L)));
                        PromptStickerModel promptStickerModel2 = this.A01;
                        if (promptStickerModel2 != null) {
                            StoryTemplateDictIntf C1M3 = promptStickerModel2.A00.C1M();
                            if (C1M3 == null || (C4X3 = C1M3.C4X()) == null || C4X3.Aew() == null) {
                                PromptStickerModel promptStickerModel3 = this.A01;
                                if (promptStickerModel3 != null) {
                                    StoryTemplateDictIntf C1M4 = promptStickerModel3.A00.C1M();
                                    if (C1M4 != null && (C4X = C1M4.C4X()) != null && C4X.BGO() != null && (C1M = promptStickerModel3.A00.C1M()) != null && (C4X2 = C1M.C4X()) != null && 0qQ.A0K(C4X2.CZC(), true) && 182.A06(r3, userSession, 36327709563107973L)) {
                                        0nY.A00().ATE(new C386529kk(this));
                                        return;
                                    } else if (182.A06(r3, userSession, 36319939967262517L)) {
                                        A01(this);
                                        return;
                                    }
                                }
                            } else {
                                PromptStickerModel promptStickerModel4 = this.A01;
                                if (promptStickerModel4 != null) {
                                    FragmentActivity fragmentActivity = this.A07;
                                    int A012 = AnonymousClass0nB.A01(fragmentActivity);
                                    StoryTemplateDictIntf C1M5 = promptStickerModel4.A00.C1M();
                                    if (C1M5 == null || (C4X4 = C1M5.C4X()) == null || (Aew = C4X4.Aew()) == null || (A052 = 1iI.A05(Aew, AnonymousClass05K.A01, Math.min(A012, 1080))) == null || (str = A052.A0A) == null) {
                                        A00(this);
                                        return;
                                    }
                                    C290815g0 A032 = C59730JVo.A03(fragmentActivity, userSession, new C11211SFl(str, "stories_template_share", false, false, false));
                                    A032.A00 = this.A0B;
                                    1ES.A06(A032, 622413651, false);
                                    return;
                                }
                            }
                        }
                        0qQ.A0F("promptStickerModel");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            A02(this);
        }
    }

    public final void A05(String str, String str2) {
        C62320sa r0 = this.A0I;
        if (r0 != null) {
            r0.invoke();
        }
        A03(str, str2);
    }
}
