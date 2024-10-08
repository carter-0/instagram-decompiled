package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.api.schemas.StoryLinkInfoDict;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8Wh  reason: invalid class name and case insensitive filesystem */
public final class C357058Wh {
    public boolean A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final C357048Wg A03;
    public final UserSession A04;
    public final 1vn A05;

    public C357058Wh(Fragment fragment, C357048Wg r3, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(fragment, 2);
        this.A04 = userSession;
        this.A03 = r3;
        this.A05 = 1vm.A01(userSession);
        this.A01 = fragment.requireContext();
        this.A02 = fragment.requireActivity();
    }

    public final void A04(AnonymousClass3Q2 r19, C62320sa r20) {
        AnonymousClass3Q2 r3 = r19;
        0qQ.A0B(r3, 0);
        2IV A002 = A00(this, r3, false);
        2IS r2 = new 2IS();
        2IS r1 = new 2IS();
        r2.A00(A002, "input");
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "ValidateNewIgMediaForAdsEligibilityQuery", r2.getParamsCopy(), r1.getParamsCopy(), BYR.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "validate_new_ig_media_for_ads_eligibility", new ArrayList());
        C62320sa r5 = r20;
        this.A05.ATL(new C40112ASa(r5), new FSH(this, r3, r5), pandoGraphQLRequest);
    }

    public final void A05(AnonymousClass3Q2 r18, C62320sa r19) {
        AnonymousClass3Q2 r1 = r18;
        0qQ.A0B(r1, 0);
        2IV A002 = A00(this, r1, true);
        2IS r2 = new 2IS();
        2IS r12 = new 2IS();
        r2.A00(A002, "input");
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "ValidateIGStoryMediaForBoostEligibilityQuery", r2.getParamsCopy(), r12.getParamsCopy(), BYM.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "validate_ig_story_media_for_boost_eligibility", new ArrayList());
        C62320sa r4 = r19;
        this.A05.ATL(new C40113ASb(r4), new FSD(this, r4), pandoGraphQLRequest);
    }

    public static final 2IV A00(C357058Wh r10, AnonymousClass3Q2 r11, boolean z) {
        String str;
        0sn arrayList;
        String str2;
        0sn singletonList;
        List list;
        ArrayList arrayList2;
        String str3;
        C272004jw r0;
        C272004jw r02;
        String str4;
        String str5;
        2IV r2 = new 2IV();
        r2.A09(r11.A1G.A00().toString(), "media_type");
        r2.A09(r10.A04.A06, AnonymousClass000.A00(3576));
        r2.A09(String.valueOf(r11.A0g), AnonymousClass000.A00(3565));
        r2.A07(Integer.valueOf(r11.A0H), AnonymousClass000.A00(703));
        r2.A07(Integer.valueOf(r11.A0G), AnonymousClass000.A00(1576));
        BrandedContentTag A08 = r11.A08();
        if (A08 != null) {
            str = A08.A01;
        } else {
            str = null;
        }
        r2.A09(str, "media_branded_content_sponsor_igid");
        boolean z2 = true;
        r2.A08("has_tappable_elements", Boolean.valueOf(!r11.A4b.isEmpty()));
        r2.A08(C273654mx.A00(296), Boolean.valueOf(!r11.A41.isEmpty()));
        boolean z3 = false;
        r2.A08("has_product_mention", false);
        r2.A08("has_seller_collections", false);
        r2.A08("has_pinned_products", false);
        C357048Wg r3 = r10.A03;
        if (r3 == C357048Wg.REEL) {
            z3 = true;
        }
        r2.A08(AnonymousClass000.A00(1524), Boolean.valueOf(z3));
        if (r3 != C357048Wg.STORY) {
            z2 = false;
        }
        r2.A08("is_story_media", Boolean.valueOf(z2));
        int ordinal = r3.ordinal();
        if (ordinal == 2 || ordinal == 0) {
            List<C273914nO> list2 = r11.A4Y;
            arrayList = new ArrayList();
            for (C273914nO r03 : list2) {
                List list3 = r03.A06;
                0qQ.A07(list3);
                018.A16(list3, arrayList);
            }
        } else {
            arrayList = 0sn.A00;
        }
        r2.A05("sticker_ids", arrayList);
        if ((ordinal == 2 || ordinal == 0) && (str2 = r11.A2o) != null) {
            singletonList = Collections.singletonList(str2);
            0qQ.A07(singletonList);
        } else {
            singletonList = 0sn.A00;
        }
        r2.A05("face_effect_ids", singletonList);
        UpcomingEventImpl upcomingEventImpl = r11.A1p;
        if (upcomingEventImpl == null || (str5 = upcomingEventImpl.A0B) == null) {
            list = 0sn.A00;
        } else {
            list = Collections.singletonList(str5);
            0qQ.A07(list);
        }
        r2.A05("upcoming_event_igids", list);
        int i = 0;
        if (ordinal == 2) {
            List<C266684aA> list4 = r11.A4J;
            if (list4 != null) {
                for (C266684aA r04 : list4) {
                    i += r04.A01;
                }
            }
        } else if (ordinal != 0) {
            for (AnonymousClass3Q2 r05 : r11.A0L()) {
                i += (int) r05.A0a;
            }
        } else {
            for (ClipInfo clipInfo : r11.A4G) {
                i += clipInfo.A05 - clipInfo.A07;
            }
        }
        r2.A07(Integer.valueOf(i), AnonymousClass000.A00(822));
        0sn r1 = r11.A4L;
        if (r1 == null) {
            r1 = 0sn.A00;
        }
        r2.A05("coauthor_producer_igids", r1);
        List<C255783ui> A012 = AnonymousClass497.A01(AnonymousClass3WT.MUSIC_OVERLAY, r11.A4b);
        if (A012 != null) {
            arrayList2 = new ArrayList();
            for (C255783ui r06 : A012) {
                MusicOverlayStickerModel musicOverlayStickerModel = r06.A0u;
                if (!(musicOverlayStickerModel == null || (str4 = musicOverlayStickerModel.A0T) == null)) {
                    arrayList2.add(str4);
                }
            }
        } else {
            arrayList2 = 0sn.A00;
        }
        r2.A05(AnonymousClass000.A00(2670), arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (C255783ui r7 : r11.A4b) {
            AnonymousClass0K0 r102 = GraphQlCallInput.A02;
            String str6 = null;
            0Df r8 = null;
            int ordinal2 = r7.A11.ordinal();
            String str7 = null;
            if (ordinal2 == 23) {
                User user = r7.A1B;
                if (user != null) {
                    str7 = user.getId();
                }
                str3 = "mentioned_user_igid";
                r8 = r102.A02();
                0Df.A00(r8, str7, str3);
            } else if (ordinal2 == 29) {
                C272024jy A0E = r7.A0E();
                if (A0E != null) {
                    String str8 = A0E.A0D;
                    String A002 = C66579MXk.A00(1041);
                    r8 = r102.A02();
                    0Df.A00(r8, str8, A002);
                    List list5 = A0E.A0F;
                    if (!(list5 == null || (r02 = (C272004jw) 00k.A0O(list5, 0)) == null)) {
                        str6 = r02.A02;
                    }
                    0Df.A00(r8, str6, "poll_option_a_text");
                    if (!(list5 == null || (r0 = (C272004jw) 00k.A0O(list5, 1)) == null)) {
                        str7 = r0.A02;
                    }
                    str3 = "poll_option_b_text";
                    0Df.A00(r8, str7, str3);
                }
            } else if (ordinal2 == 18) {
                StoryLinkInfoDict storyLinkInfoDict = r7.A0W;
                if (storyLinkInfoDict != null && (str6 = storyLinkInfoDict.A0A) == null) {
                    str6 = "";
                }
                String valueOf = String.valueOf(str6);
                r8 = r102.A02();
                0Df.A00(r8, valueOf, "link");
                StoryLinkInfoDict storyLinkInfoDict2 = r7.A0W;
                if (storyLinkInfoDict2 != null && (str7 = storyLinkInfoDict2.A09) == null) {
                    str7 = "";
                }
                str3 = AnonymousClass000.A00(1553);
                0Df.A00(r8, str7, str3);
            } else if (ordinal2 == 21) {
                String str9 = r7.A1a;
                r8 = r102.A02();
                0Df.A00(r8, str9, "feed_media_igid");
            }
            2IV r4 = new 2IV();
            r4.A09(r7.A11.A00, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            0Df.A00(r4.A02(), Double.valueOf((double) r7.A03), "x");
            0Df.A00(r4.A02(), Double.valueOf((double) r7.A04), "y");
            r4.A07(Integer.valueOf(r7.A09), "z");
            0Df.A00(r4.A02(), Double.valueOf((double) r7.A02), IgReactMediaPickerNativeModule.WIDTH);
            0Df.A00(r4.A02(), Double.valueOf((double) r7.A00), IgReactMediaPickerNativeModule.HEIGHT);
            0Df.A00(r4.A02(), Double.valueOf((double) r7.A01), "rotation");
            0Df A022 = r4.A02();
            if (r8 == null) {
                r8 = r102.A02();
            }
            A022.A0E(r8, "data");
            arrayList3.add(r4);
        }
        r2.A05("tappables", arrayList3);
        r2.A08("is_boost_ads_mode_enabled", Boolean.valueOf(z));
        return r2;
    }

    public final AnonymousClass3Q2 A03(CameraAREffect cameraAREffect, C3499482o r15, List list, List list2, List list3) {
        AnonymousClass3Q2 A012;
        List list4 = list3;
        0qQ.A0B(r15, 0);
        C365758nd A013 = r15.A01();
        int ordinal = A013.ordinal();
        String str = null;
        if (ordinal == 0) {
            C352218Cl A032 = r15.A01.A03();
            if (A032 != null) {
                if (cameraAREffect != null) {
                    str = cameraAREffect.A0K;
                }
                A012 = AnonymousClass9T3.A01(String.valueOf(System.nanoTime()));
                A012.A0H = A032.A09;
                A012.A0G = A032.A06;
                String A052 = A032.A05();
                if (A052 != null) {
                    str = A052;
                }
                A012.A2o = str;
            } else {
                throw new IllegalStateException("activeCapturedPhoto is null");
            }
        } else if (ordinal == 1) {
            C349307zv A042 = r15.A01.A04();
            if (A042 != null) {
                if (cameraAREffect != null) {
                    str = cameraAREffect.A0K;
                }
                C59796JYp jYp = null;
                A012 = AnonymousClass9T3.A02(String.valueOf(System.nanoTime()));
                A012.A0H = A042.A0K;
                A012.A0G = A042.A08;
                String A053 = A042.A05();
                if (A053 != null) {
                    str = A053;
                }
                A012.A2o = str;
                boolean A033 = Q0Y.A03(A042.A0k);
                int i = A042.A0K;
                int i2 = A042.A08;
                UserSession userSession = this.A04;
                if (A033) {
                    jYp = new C59796JYp(A042.A0k, 0, -3, true);
                }
                ArrayList A1M = 0sr.A1M(new ClipInfo[]{AnonymousClass9T4.A00(userSession, A042, jYp, i, i2)});
                0qQ.A0B(A1M, 0);
                A012.A4G = A1M;
            } else {
                throw new IllegalStateException("activeCapturedVideo is null");
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown media type: ");
            sb.append(A013);
            throw new UnsupportedOperationException(sb.toString());
        }
        A012.A4C = list;
        List list5 = list2;
        0qQ.A0B(list5, 0);
        A012.A4b = list5;
        if (list3 == null) {
            list4 = 0sn.A00;
        }
        0qQ.A0B(list4, 0);
        A012.A4Y = list4;
        return A012;
    }

    public static final String A01(C357058Wh r1, C357048Wg r2) {
        Context context;
        int i;
        int ordinal = r2.ordinal();
        if (ordinal != 2) {
            context = r1.A01;
            if (ordinal != 0) {
                i = 2131962327;
            } else {
                i = 2131974420;
            }
        } else {
            context = r1.A01;
            i = 2131971520;
        }
        String string = context.getString(i);
        0qQ.A07(string);
        return string;
    }

    public static final String A02(C357058Wh r1, C357048Wg r2) {
        Context context;
        int i;
        int ordinal = r2.ordinal();
        if (ordinal != 2) {
            context = r1.A01;
            if (ordinal != 0) {
                i = 2131962328;
            } else {
                i = 2131974421;
            }
        } else {
            context = r1.A01;
            i = 2131971521;
        }
        String string = context.getString(i);
        0qQ.A07(string);
        return string;
    }
}
