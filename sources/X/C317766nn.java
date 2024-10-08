package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.StoryMultiProductStickerLinkData;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetParams;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.shopping.reels.MultiProductSticker;
import com.instagram.model.venue.Venue;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.6nn  reason: invalid class name and case insensitive filesystem */
public abstract class C317766nn {
    public C310216ac A00;
    public AnonymousClass6a7 A01;
    public final String A02;

    public void A04(Activity activity) {
        C315656kI r2 = (C315656kI) this;
        C68479NJw nJw = new C68479NJw();
        C315656kI.A00(nJw, r2).A00().A02(activity, nJw);
        r2.A00 = true;
        AnonymousClass6a7 r0 = r2.A01;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void A05(Activity activity) {
        C255773uh Au5;
        1Xj r2;
        PromptStickerModel A0J;
        1Xj r3;
        C315656kI r5 = (C315656kI) this;
        C310216ac r0 = r5.A00;
        if (r0 != null && (Au5 = r0.A04.Au5()) != null && (r2 = Au5.A0b) != null) {
            PromptStickerModel A0J2 = Au5.A0J();
            if (A0J2 == null || A0J2.A03() != StoryPromptType.MAGIC_MOD_ADD_YOURS_WITH_BACKDROP) {
                String id = r2.getId();
                if (id != null) {
                    UserSession userSession = r5.A01;
                    0qQ.A0B(userSession, 0);
                    C54168H1n h1n = new C54168H1n();
                    Bundle bundle = new Bundle();
                    AnonymousClass0Dg.A00(bundle, userSession);
                    bundle.putString("args_media_id", id);
                    h1n.setArguments(bundle);
                    C315656kI.A00(h1n, r5).A00().A02(activity, h1n);
                    r5.A00 = true;
                    AnonymousClass6a7 r02 = r5.A01;
                    if (r02 != null) {
                        r02.A01();
                        return;
                    }
                    return;
                }
                return;
            }
            C273384mU r1 = r5.A00.A04;
            C255773uh Au52 = r1.Au5();
            if (Au52 != null && (A0J = Au52.A0J()) != null) {
                C255773uh Au53 = r1.Au5();
                if (Au53 != null) {
                    r3 = Au53.A0b;
                } else {
                    r3 = null;
                }
                ((ReelViewerFragment) r1).A1f.Dal(AnonymousClass8ZN.CLIPS_VIEWER_ATTRIBUTION_LINE, r3, A0J, (C310416b1) null, (List) null);
            }
        }
    }

    public void A06(Activity activity) {
        C315656kI r2 = (C315656kI) this;
        E5Z e5z = new E5Z();
        C315656kI.A00(e5z, r2).A00().A02(activity, e5z);
        r2.A00 = true;
        AnonymousClass6a7 r0 = r2.A01;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void A07(Activity activity) {
        C315656kI r2 = (C315656kI) this;
        UserSession userSession = r2.A01;
        0qQ.A0B(userSession, 1);
        C49093EpI.A00(activity, userSession);
        r2.A00 = true;
        AnonymousClass6a7 r0 = r2.A01;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void A08(Activity activity, Fragment fragment, AnonymousClass3HX r14, AnonymousClass3BQ r15) {
        C255773uh Au5;
        C315656kI r10 = (C315656kI) this;
        C310216ac r0 = r10.A00;
        if (r0 != null && (Au5 = r0.A04.Au5()) != null && Au5.A1c()) {
            E5R e5r = new E5R();
            UserSession userSession = r10.A01;
            C331127Pr r1 = new C331127Pr(userSession);
            r1.A0U = new C19685Wdn(Au5, r15, r10);
            C331157Pu A002 = r1.A00();
            e5r.A00 = new FON(activity, A002, Au5, r14, r15, r10);
            A002.A02(activity, e5r);
            C14164Tr2 tr2 = C14164Tr2.A00;
            0qQ.A0B(userSession, 0);
            0qQ.A0B(r15, 2);
            if (Au5.A1c()) {
                0wc A012 = AnonymousClass0kN.A01(tr2, userSession);
                String obj = UUID.randomUUID().toString();
                0qQ.A07(obj);
                0Aj A003 = A012.A00(A012.A00, "ig_story_standouts_eligible_bottom_sheet_impression");
                if (A003.isSampled()) {
                    A003.AAJ("tracking_token", obj);
                    A003.AAJ("reel_id_type", "superlativeReel");
                    A003.AAJ("reel_id", Au5.A0k);
                    A003.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, C14164Tr2.A00(r15).name());
                    A003.Cgf();
                }
            }
            r10.A00 = true;
            AnonymousClass6a7 r02 = r10.A01;
            if (r02 != null) {
                r02.A01();
            }
        }
    }

    public void A09(Activity activity, C66509MUn mUn, Integer num, String str) {
        C255773uh Au5;
        1Xj r0;
        String id;
        C315656kI r5 = (C315656kI) this;
        C310216ac r02 = r5.A00;
        if (r02 != null && (Au5 = r02.A04.Au5()) != null && (r0 = Au5.A0b) != null && (id = r0.getId()) != null) {
            UserSession userSession = r5.A01;
            0qQ.A0B(userSession, 0);
            CreationGenAIAttributionBottomSheetParams creationGenAIAttributionBottomSheetParams = new CreationGenAIAttributionBottomSheetParams(id, num, str);
            C61432K7h k7h = new C61432K7h();
            Bundle bundle = new Bundle();
            AnonymousClass0Dg.A00(bundle, userSession);
            bundle.putParcelable("arg_params", creationGenAIAttributionBottomSheetParams);
            k7h.setArguments(bundle);
            k7h.A01 = mUn;
            C315656kI.A00(k7h, r5).A00().A02(activity, k7h);
            r5.A00 = true;
            AnonymousClass6a7 r03 = r5.A01;
            if (r03 != null) {
                r03.A01();
            }
        }
    }

    public void A0A(Activity activity, AnonymousClass3BQ r7) {
        C255773uh Au5;
        C315656kI r4 = (C315656kI) this;
        C310216ac r0 = r4.A00;
        if (r0 != null && (Au5 = r0.A04.Au5()) != null && Au5.A1c()) {
            EQ0 eq0 = new EQ0();
            C315656kI.A00(eq0, r4).A00().A02(activity, eq0);
            C14164Tr2.A00.A04(r4.A01, r7, Au5.A0k);
            r4.A00 = true;
            AnonymousClass6a7 r02 = r4.A01;
            if (r02 != null) {
                r02.A01();
            }
        }
    }

    public void A0B(Context context, Activity activity) {
        C255773uh Au5;
        1Xj r4;
        C315656kI r3 = (C315656kI) this;
        C310216ac r0 = r3.A00;
        if (r0 != null && (Au5 = r0.A04.Au5()) != null && (r4 = Au5.A0b) != null && r4.getId() != null) {
            UserSession userSession = r3.A01;
            1Av A002 = 1Au.A00(userSession);
            boolean booleanValue = ((Boolean) A002.A32.CDM(A002, 1Av.A8a[328])).booleanValue();
            Context context2 = context;
            Activity activity2 = activity;
            if (booleanValue || !182.A06(0Tu.A05, userSession, 36323083883129677L)) {
                H1T A003 = C54901HXj.A00(userSession, r4.getId(), true);
                C331127Pr A004 = C315656kI.A00(A003, r3);
                A004.A0d = context.getString(2131957288);
                A004.A00().A02(activity, A003);
            } else {
                H0C.A03.A00(activity2, context2, userSession, r4.getId(), true);
            }
            r3.A00 = true;
            AnonymousClass6a7 r02 = r3.A01;
            if (r02 != null) {
                r02.A01();
            }
        }
    }

    public void A0E(Context context, C306106Ku r8) {
        String str;
        C255773uh Au5;
        1Xj r0;
        C315656kI r5 = (C315656kI) this;
        C310216ac r02 = r5.A00;
        if (r02 == null || (Au5 = r02.A04.Au5()) == null || (r0 = Au5.A0b) == null) {
            str = null;
        } else {
            str = r0.getId();
        }
        AnonymousClass4DH r3 = new AnonymousClass4DH();
        Bundle bundle = new Bundle();
        bundle.putString("reel_capture_type", r8.A00);
        bundle.putString("source_media_id", str);
        r3.setArguments(bundle);
        C315656kI.A01(context, r3, r5);
    }

    public void A0F(Context context, C255773uh r8) {
        C315656kI r5 = (C315656kI) this;
        C310216ac r0 = r5.A00;
        if (r0 != null) {
            String moduleName = r0.A02.getModuleName();
            String str = r8.A0j;
            0qQ.A0B(moduleName, 0);
            C47495E5a e5a = new C47495E5a();
            Bundle bundle = new Bundle();
            bundle.putString("args_previous_module_name", moduleName);
            bundle.putString("source_media_id", str);
            e5a.setArguments(bundle);
            C315656kI.A01(context, e5a, r5);
        }
    }

    public void A0G(Context context, C255773uh r12) {
        JSO CGF;
        C315656kI r8 = (C315656kI) this;
        1Xj r0 = r12.A0b;
        if (r0 != null && (CGF = r0.A0C.CGF()) != null) {
            UserSession userSession = r8.A01;
            String attributionTitle = CGF.getAttributionTitle();
            String attributionSubtitle = CGF.getAttributionSubtitle();
            String attributionIconUrl = CGF.getAttributionIconUrl();
            String attributionCtaText = CGF.getAttributionCtaText();
            String attributionCtaActionUrl = CGF.getAttributionCtaActionUrl();
            AnonymousClass4DH r2 = new AnonymousClass4DH();
            Bundle bundle = new Bundle();
            bundle.putString("args_attribution_title", attributionTitle);
            bundle.putString("args_attribution_subtitle", attributionSubtitle);
            bundle.putString("args_attribution_icon_url", attributionIconUrl);
            bundle.putString("args_attribution_cta_text", attributionCtaText);
            bundle.putString("args_attribution_cta_action_url", attributionCtaActionUrl);
            if (userSession != null) {
                AnonymousClass0Dg.A00(bundle, userSession);
            }
            r2.setArguments(bundle);
            C315656kI.A01(context, r2, r8);
        }
    }

    public void A0I(Context context, String str) {
        C315656kI r4 = (C315656kI) this;
        C310216ac r0 = r4.A00;
        if (r0 != null) {
            String moduleName = r0.A02.getModuleName();
            0qQ.A0B(moduleName, 0);
            H1U h1u = new H1U();
            Bundle bundle = new Bundle();
            bundle.putString("args_previous_module_name", moduleName);
            bundle.putString("args_media_id", str);
            h1u.setArguments(bundle);
            C315656kI.A01(context, h1u, r4);
        }
    }

    public void A0J(Context context, String str, String str2) {
        C315656kI r4 = (C315656kI) this;
        UserSession userSession = r4.A01;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 1);
        C15359UbB ubB = new C15359UbB();
        Bundle bundle = new Bundle();
        bundle.putString("args_user_name", str2);
        bundle.putString("args_previous_module_name", str);
        AnonymousClass0Dg.A00(bundle, userSession);
        ubB.setArguments(bundle);
        C315656kI.A01(context, ubB, r4);
    }

    public boolean A0N() {
        return 182.A06(0Tu.A05, ((C315656kI) this).A01, 36311186823774674L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008c, code lost:
        if (X.182.A06(X.0Tu.A05, r2, 36325351626453913L) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a3, code lost:
        if (X.182.A06(X.0Tu.A05, r2, 36325351626781598L) != false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(android.content.Context r23, X.C14015ToH r24, X.C250973mM r25, X.G6I r26, java.lang.String r27, java.lang.String r28, boolean r29, boolean r30) {
        /*
            r22 = this;
            java.lang.String r8 = "ig_stories_consumption"
            r5 = r22
            X.6kI r5 = (X.C315656kI) r5
            X.6ac r0 = r5.A00
            if (r0 == 0) goto L_0x00ca
            com.instagram.common.session.UserSession r2 = r5.A01
            r0 = r25
            X.3uh r4 = r0.A08(r2)
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r2)
            com.instagram.user.model.User r6 = r4.A0i
            r14 = 0
            r13 = 1
            r21 = 0
            if (r0 != r6) goto L_0x0022
            r21 = 1
        L_0x0022:
            r7 = r24
            java.lang.String r11 = r7.A04
            if (r11 == 0) goto L_0x00ca
            X.1Xj r3 = r4.A0b
            X.26t r0 = X.26G.A00(r2)
            X.6o6 r1 = new X.6o6
            r1.<init>(r0)
            com.instagram.avatars.store.AvatarStore r0 = X.25x.A00(r2)
            X.6o5 r10 = new X.6o5
            r10.<init>(r1, r0, r2)
            if (r3 == 0) goto L_0x0045
            boolean r0 = X.AnonymousClass6UA.A00(r2, r4)
            if (r0 == 0) goto L_0x0045
            r14 = 1
        L_0x0045:
            com.instagram.avatars.store.AvatarStore r9 = r10.A01
            boolean r0 = X.C317936o5.A02(r9)
            if (r0 != 0) goto L_0x010e
            com.instagram.common.session.UserSession r2 = r10.A02
            boolean r0 = X.C314866iy.A00(r2)
            if (r0 != 0) goto L_0x010e
            java.lang.String r1 = r7.A05
            X.5kA r0 = X.C293115kA.STYLE_2
            java.lang.String r0 = r0.toString()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x010e
            X.27E r0 = r9.A01
            boolean r0 = r0 instanceof X.C293135kC
            if (r0 == 0) goto L_0x008e
            boolean r0 = X.C317936o5.A00(r10)
            if (r0 != 0) goto L_0x008e
            X.6o6 r0 = r10.A00
            X.26t r0 = r0.A00
            X.0xa r12 = r0.A00
            java.lang.String r1 = "key_has_seen_avatar_convergence_stories_mimicry_upsell"
            r0 = 0
            boolean r1 = r12.getBoolean(r1, r0)
            if (r1 != 0) goto L_0x008e
            X.0qQ.A0B(r2, r0)
            X.0Tu r12 = X.0Tu.A05
            r0 = 36325351626453913(0x810db700093399, double:3.0356368667954156E-306)
            boolean r0 = X.182.A06(r12, r2, r0)
            if (r0 != 0) goto L_0x00a5
        L_0x008e:
            X.27E r0 = r9.A01
            boolean r0 = r0 instanceof X.C293135kC
            if (r0 != 0) goto L_0x010e
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.0Tu r12 = X.0Tu.A05
            r0 = 36325351626781598(0x810db7000e339e, double:3.035636867002645E-306)
            boolean r0 = X.182.A06(r12, r2, r0)
            if (r0 == 0) goto L_0x010e
        L_0x00a5:
            java.lang.String r0 = "mux_mimicry_bottom_sheet"
            X.DxO r7 = X.C69762Nrl.A00(r8, r0)
        L_0x00ab:
            X.7Pr r0 = X.C315656kI.A00(r7, r5)
            X.7Pu r6 = r0.A00()
            boolean r0 = r7 instanceof X.DxO
            if (r0 == 0) goto L_0x00cb
            r0 = r7
            X.DxO r0 = (X.DxO) r0
            r0.A00 = r6
        L_0x00bc:
            r0 = r23
            r6.A03(r0, r7)
            r5.A00 = r13
            X.6a7 r0 = r5.A01
            if (r0 == 0) goto L_0x00ca
            r0.A01()
        L_0x00ca:
            return
        L_0x00cb:
            boolean r0 = r7 instanceof X.K7D
            if (r0 == 0) goto L_0x0108
            X.3WT r0 = X.AnonymousClass3WT.AVATAR
            java.util.List r1 = r4.Bkd(r0)
            r0 = 0
            X.04u r2 = new X.04u
            r2.<init>(r0)
            if (r1 == 0) goto L_0x00f3
            java.util.Iterator r1 = r1.iterator()
        L_0x00e1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = r1.next()
            X.3ui r0 = (X.C255783ui) r0
            java.lang.String r0 = r0.A1n
            r2.add(r0)
            goto L_0x00e1
        L_0x00f3:
            r1 = r7
            X.K7D r1 = (X.K7D) r1
            r1.A03 = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.A0A = r0
            if (r3 == 0) goto L_0x00bc
            java.util.List r0 = r3.A3d()
            r1.A09 = r0
            goto L_0x00bc
        L_0x0108:
            r0 = r7
            X.DxF r0 = (X.DxF) r0
            r0.A08 = r6
            goto L_0x00bc
        L_0x010e:
            boolean r0 = X.C317936o5.A02(r9)
            if (r0 == 0) goto L_0x0141
            boolean r0 = X.C317936o5.A01(r9)
            if (r0 == 0) goto L_0x0141
            com.instagram.common.session.UserSession r0 = r10.A02
            boolean r0 = X.C314866iy.A00(r0)
            if (r0 == 0) goto L_0x0141
            java.lang.String r1 = r7.A05
            X.5kA r0 = X.C293115kA.STYLE_2
            java.lang.String r0 = r0.toString()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0141
            X.6o6 r0 = r10.A00
            X.26t r0 = r0.A00
            X.0xa r2 = r0.A00
            java.lang.String r1 = "key_has_seen_avatar_convergence_auto_migration_stories_mimicry_upsell"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x0141
            goto L_0x00a5
        L_0x0141:
            X.6ac r0 = r5.A00
            X.4DU r0 = r0.A02
            if (r14 == 0) goto L_0x01b3
            java.lang.String r10 = r0.getModuleName()
            java.lang.String r1 = r4.A0k
            java.lang.String r0 = r4.A0j
            if (r29 == 0) goto L_0x01b0
            java.lang.String r9 = "story_attribution"
        L_0x0153:
            r2 = 0
            X.0qQ.A0B(r10, r2)
            r2 = 3
            X.0qQ.A0B(r1, r2)
            X.K7D r7 = new X.K7D
            r7.<init>()
            java.lang.String r2 = "args_previous_module_name"
            X.0eP r14 = new X.0eP
            r14.<init>(r2, r10)
            r2 = 43
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.0eP r15 = new X.0eP
            r15.<init>(r2, r8)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r21)
            java.lang.String r2 = "args_is_viewing_self_story"
            X.0eP r8 = new X.0eP
            r8.<init>(r2, r10)
            java.lang.String r10 = "args_base_reel_id"
            X.0eP r2 = new X.0eP
            r2.<init>(r10, r1)
            java.lang.String r1 = "args_base_reel_item_id"
            X.0eP r10 = new X.0eP
            r10.<init>(r1, r0)
            java.lang.String r0 = "args_base_reel_owner"
            X.0eP r11 = new X.0eP
            r11.<init>(r0, r6)
            java.lang.String r1 = "args_entry_point"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r9)
            r18 = r10
            r19 = r11
            r20 = r0
            r16 = r8
            r17 = r2
            X.0eP[] r0 = new X.0eP[]{r14, r15, r16, r17, r18, r19, r20}
            android.os.Bundle r0 = X.Q21.A00(r0)
            r7.setArguments(r0)
            goto L_0x00ab
        L_0x01b0:
            java.lang.String r9 = "avatar_sticker_tap"
            goto L_0x0153
        L_0x01b3:
            java.lang.String r19 = r0.getModuleName()
            X.6ac r15 = r5.A00
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r30)
            java.lang.String r0 = r7.A07
            r14 = r26
            r17 = r28
            r18 = r11
            r20 = r0
            X.DxF r7 = X.C49091EpG.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C317766nn.A0C(android.content.Context, X.ToH, X.3mM, X.G6I, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: com.instagram.music.common.model.MusicOverlayStickerModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: com.instagram.ui.bottomsheet.mixed.model.AvatarMixedAttributionModel} */
    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: type inference failed for: r10v4, types: [com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel, com.instagram.ui.bottomsheet.mixed.model.CameraFormatMixedAttributionModel] */
    /* JADX WARNING: type inference failed for: r15v9 */
    /* JADX WARNING: type inference failed for: r15v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(android.content.Context r17, X.C312266e6 r18, X.C255773uh r19, X.C66408MQo r20, X.G6I r21, java.util.ArrayList r22) {
        /*
            r16 = this;
            r3 = r16
            X.6kI r3 = (X.C315656kI) r3
            com.instagram.common.session.UserSession r4 = r3.A01
            X.7Pr r1 = new X.7Pr
            r1.<init>(r4)
            X.4mX r0 = r3.A02
            r1.A0U = r0
            X.7Pu r2 = r1.A00()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r9 = r22.iterator()
        L_0x001c:
            boolean r0 = r9.hasNext()
            r7 = 1
            r8 = 29
            r15 = 0
            r11 = r17
            r1 = r19
            if (r0 == 0) goto L_0x018a
            java.lang.Object r6 = r9.next()
            com.instagram.reels.viewer.attribution.model.ReelAttributionModel r6 = (com.instagram.reels.viewer.attribution.model.ReelAttributionModel) r6
            com.instagram.model.reels.ReelHeaderAttributionType r0 = r6.A06
            int r7 = r0.ordinal()
            if (r7 == r8) goto L_0x00c9
            r0 = 15
            if (r7 == r0) goto L_0x0094
            r0 = 5
            if (r7 == r0) goto L_0x010b
            r0 = 2
            if (r7 != r0) goto L_0x001c
            X.ToH r0 = r6.A00
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = r6.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001c
            java.lang.String r7 = r6.A04     // Catch:{ IOException -> 0x001c }
            X.0c5 r0 = X.0c9.A04     // Catch:{ IOException -> 0x001c }
            X.0c9 r0 = r0.A01(r4, r7)     // Catch:{ IOException -> 0x001c }
            X.ToH r0 = X.C14014ToG.parseFromJson(r0)     // Catch:{ IOException -> 0x001c }
            r6.A00 = r0     // Catch:{ IOException -> 0x001c }
        L_0x005c:
            if (r0 == 0) goto L_0x001c
            java.lang.String r14 = r0.A04
            if (r14 == 0) goto L_0x001c
            java.lang.String r6 = r0.A06
            if (r6 == 0) goto L_0x0092
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0092
            com.instagram.common.typedurl.SimpleImageUrl r12 = new com.instagram.common.typedurl.SimpleImageUrl
            r12.<init>(r6)
        L_0x0071:
            com.instagram.user.model.User r0 = r1.A0i
            if (r0 == 0) goto L_0x0079
            java.lang.String r15 = r0.getId()
        L_0x0079:
            X.0Tu r6 = X.0Tu.A06
            r0 = 36324557056913560(0x810cfe00003098, double:3.0351343778186216E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 == 0) goto L_0x008f
            java.lang.Integer r13 = X.AnonymousClass05K.A01
        L_0x0088:
            com.instagram.ui.bottomsheet.mixed.model.AvatarMixedAttributionModel r10 = new com.instagram.ui.bottomsheet.mixed.model.AvatarMixedAttributionModel
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0155
        L_0x008f:
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            goto L_0x0088
        L_0x0092:
            r12 = r15
            goto L_0x0071
        L_0x0094:
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration r15 = r6.A01
            r15.getClass()
            r0 = 3
            X.0qQ.A0B(r4, r0)
            com.instagram.model.effect.AREffect r0 = r15.A04
            java.lang.String r7 = r0.A05()
            X.0qQ.A07(r7)
            java.lang.String r6 = r15.A06
            X.0qQ.A07(r6)
            com.instagram.model.effect.AREffect r0 = r15.A04
            com.instagram.common.typedurl.ImageUrl r1 = r0.A01()
            com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel$MixedAttributionType r0 = com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel.MixedAttributionType.EFFECT_ATTRIBUTION
            com.instagram.ui.bottomsheet.mixed.model.EffectsMixedAttributionModel r10 = new com.instagram.ui.bottomsheet.mixed.model.EffectsMixedAttributionModel
            r10.<init>(r1, r0, r7, r6)
            java.lang.Boolean r0 = X.C306096Kt.A00(r4)
            boolean r1 = r0.booleanValue()
            r0 = 2131231720(0x7f0803e8, float:1.8079529E38)
            if (r1 == 0) goto L_0x0103
            r0 = 2131238248(0x7f081d68, float:1.809277E38)
            goto L_0x0103
        L_0x00c9:
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r6.A03
            if (r0 != 0) goto L_0x00e3
            java.lang.String r0 = r6.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e4
            java.lang.String r1 = r6.A05     // Catch:{ IOException -> 0x00e4 }
            X.0c5 r0 = X.0c9.A04     // Catch:{ IOException -> 0x00e4 }
            X.0c9 r0 = r0.A01(r4, r1)     // Catch:{ IOException -> 0x00e4 }
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = X.C255673uX.parseFromJson(r0)     // Catch:{ IOException -> 0x00e4 }
            r6.A03 = r0     // Catch:{ IOException -> 0x00e4 }
        L_0x00e3:
            r15 = r0
        L_0x00e4:
            r15.getClass()
            java.lang.String r7 = r15.A0m
            java.lang.String r0 = ""
            if (r7 != 0) goto L_0x00ee
            r7 = r0
        L_0x00ee:
            java.lang.String r6 = r15.A0Y
            if (r6 != 0) goto L_0x00f3
            r6 = r0
        L_0x00f3:
            com.instagram.common.typedurl.ImageUrl r1 = r15.A04
            r0 = 3
            X.0qQ.A0B(r1, r0)
            com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel$MixedAttributionType r0 = com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel.MixedAttributionType.MUSIC_ATTRIBUTION
            com.instagram.ui.bottomsheet.mixed.model.MusicMixedAttributionModel r10 = new com.instagram.ui.bottomsheet.mixed.model.MusicMixedAttributionModel
            r10.<init>(r1, r0, r7, r6)
            r0 = 2131238579(0x7f081eb3, float:1.809344E38)
        L_0x0103:
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r0)
            r10.A00(r0, r15)
            goto L_0x0155
        L_0x010b:
            X.6Ku r1 = r6.A02
            r1.getClass()
            r0 = 3
            X.0qQ.A0B(r4, r0)
            com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel$MixedAttributionType r8 = com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel.MixedAttributionType.CAMERA_FORMAT_ATTRIBUTION
            X.6Ku r0 = X.C306106Ku.CLIPS
            if (r1 == r0) goto L_0x0176
            X.6Ku r0 = X.C306106Ku.CLIPS_V1
            if (r1 == r0) goto L_0x0176
            java.lang.String r7 = r1.A01(r11)
        L_0x0122:
            X.0qQ.A0A(r7)
            android.content.res.Resources r6 = r11.getResources()
            r0 = 2131951730(0x7f130072, float:1.9539883E38)
            java.lang.String r0 = r6.getString(r0)
            X.0qQ.A07(r0)
            com.instagram.ui.bottomsheet.mixed.model.CameraFormatMixedAttributionModel r10 = new com.instagram.ui.bottomsheet.mixed.model.CameraFormatMixedAttributionModel
            r10.<init>(r15, r8, r7, r0)
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = r1.A00()
            if (r0 == 0) goto L_0x0182
            int r0 = X.C347047wB.A00(r0)
            if (r0 <= 0) goto L_0x014a
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r0)
            r10.A00 = r0
        L_0x014a:
            int r0 = r1.ordinal()
            switch(r0) {
                case 2: goto L_0x015e;
                case 3: goto L_0x0162;
                case 4: goto L_0x015e;
                case 5: goto L_0x0166;
                case 6: goto L_0x0151;
                case 7: goto L_0x016a;
                case 8: goto L_0x015a;
                case 9: goto L_0x0151;
                case 10: goto L_0x016e;
                default: goto L_0x0151;
            }
        L_0x0151:
            r0 = 0
        L_0x0152:
            r10.A00(r0, r1)
        L_0x0155:
            r5.add(r10)
            goto L_0x001c
        L_0x015a:
            r0 = 2131239104(0x7f0820c0, float:1.8094506E38)
            goto L_0x0171
        L_0x015e:
            r0 = 2131240041(0x7f082469, float:1.8096406E38)
            goto L_0x0171
        L_0x0162:
            r0 = 2131237319(0x7f0819c7, float:1.8090885E38)
            goto L_0x0171
        L_0x0166:
            r0 = 2131231161(0x7f0801b9, float:1.8078395E38)
            goto L_0x0171
        L_0x016a:
            r0 = 2131238684(0x7f081f1c, float:1.8093654E38)
            goto L_0x0171
        L_0x016e:
            r0 = 2131238232(0x7f081d58, float:1.8092737E38)
        L_0x0171:
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r0)
            goto L_0x0152
        L_0x0176:
            android.content.res.Resources r6 = r11.getResources()
            r0 = 2131953214(0x7f13063e, float:1.9542893E38)
            java.lang.String r7 = r6.getString(r0)
            goto L_0x0122
        L_0x0182:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x018a:
            X.6ac r0 = r3.A00
            if (r0 == 0) goto L_0x019e
            X.4mU r0 = r0.A04
            X.3uh r0 = r0.Au5()
            if (r0 == 0) goto L_0x019e
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x019e
            java.lang.String r15 = r0.getId()
        L_0x019e:
            X.6ac r6 = r3.A00
            com.instagram.user.model.User r1 = r1.A0i
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r4)
            r4 = 0
            if (r1 != r0) goto L_0x01ac
            r4 = 1
        L_0x01ac:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "mixed_attribution_data"
            r1.putParcelableArrayList(r0, r5)
            java.lang.String r0 = "source_media_id"
            r1.putString(r0, r15)
            java.lang.String r0 = "is_self_story"
            r1.putBoolean(r0, r4)
            X.K7E r0 = new X.K7E
            r0.<init>()
            r0.setArguments(r1)
            r0.A01 = r2
            r0.A04 = r6
            r1 = r18
            r0.A00 = r1
            r1 = r20
            r0.A02 = r1
            r1 = r21
            r0.A03 = r1
            r2.A03(r11, r0)
            r3.A00 = r7
            X.6a7 r0 = r3.A01
            if (r0 == 0) goto L_0x01e4
            r0.A01()
        L_0x01e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C317766nn.A0D(android.content.Context, X.6e6, X.3uh, X.MQo, X.G6I, java.util.ArrayList):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (X.C315656kI) r11;
        r7 = r3.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(android.content.Context r12, X.C250973mM r13, java.lang.String r14, java.lang.String r15) {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.C315656kI
            if (r0 == 0) goto L_0x00cd
            r3 = r11
            X.6kI r3 = (X.C315656kI) r3
            com.instagram.common.session.UserSession r7 = r3.A01
            X.3uh r8 = r13.A08(r7)
            com.instagram.user.model.User r6 = r8.A0i
            if (r6 == 0) goto L_0x00cd
            X.6LR r0 = r8.A0G()
            r1 = 0
            r5 = 1
            if (r0 != 0) goto L_0x0060
            X.6ac r0 = r3.A00
            r10 = 0
            if (r0 == 0) goto L_0x00d8
            X.4mU r0 = r0.A04
            X.3uh r0 = r0.Au5()
            if (r0 == 0) goto L_0x0028
            X.1Xj r10 = r0.A0b
        L_0x0028:
            java.lang.String r4 = "ShoppingMoreProductsFragment"
            if (r10 == 0) goto L_0x00d2
            r0.getClass()
            java.lang.String r2 = r0.A0U(r7)
            if (r2 != 0) goto L_0x0037
            java.lang.String r2 = "ad ID is null"
        L_0x0037:
            X.6ac r0 = r3.A00
            if (r0 == 0) goto L_0x00ce
            X.4DU r0 = r0.A02
            java.lang.String r9 = r0.getModuleName()
        L_0x0041:
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r0 = "Ad ID is: %s"
            X.0KC.A0O(r4, r0, r2)
            java.lang.String r0 = r10.getId()
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Media ID is: %s"
            X.0KC.A0O(r4, r0, r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r9}
            java.lang.String r0 = "Module name is: %s"
            X.0KC.A0O(r4, r0, r2)
        L_0x0060:
            X.6LR r4 = r8.A0G()
            java.lang.String r0 = "Caption model shouldn't be null"
            X.17k.A07(r4, r0)
            if (r15 != 0) goto L_0x006f
            java.lang.String r15 = r4.A06
            if (r15 == 0) goto L_0x0076
        L_0x006f:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x0076
            r1 = 1
        L_0x0076:
            java.lang.String r0 = "Caption text shouldn't be null or empty"
            X.17k.A0G(r1, r0)
            r0 = 0
            X.0qQ.A0B(r15, r0)
            X.0qQ.A0B(r14, r5)
            X.UbC r2 = new X.UbC
            r2.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "args_caption_text"
            r1.putString(r0, r15)
            java.lang.String r0 = "args_previous_module_name"
            r1.putString(r0, r14)
            r2.setArguments(r1)
            r2.A02 = r8
            X.7Pr r1 = new X.7Pr
            r1.<init>(r7)
            java.lang.String r0 = r6.B8Q()
            r1.A0d = r0
            r1.A1G = r5
            r1.A0x = r5
            X.Wdd r0 = new X.Wdd
            r0.<init>(r3, r2)
            r1.A0T = r0
            X.Wdi r0 = new X.Wdi
            r0.<init>(r3)
            r1.A0U = r0
            X.7Pu r1 = r1.A00()
            X.VYw r0 = new X.VYw
            r0.<init>(r1, r13, r4, r3)
            r2.A03 = r0
            r1.A03(r12, r2)
            X.6a7 r0 = r3.A01
            if (r0 == 0) goto L_0x00cd
            r0.A01()
        L_0x00cd:
            return
        L_0x00ce:
            java.lang.String r9 = ""
            goto L_0x0041
        L_0x00d2:
            java.lang.String r0 = "item.getStoryAdCaption() is null but cannot get ad id because we cannot access media"
            X.0KC.A0C(r4, r0)
            goto L_0x0060
        L_0x00d8:
            r0 = r10
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C317766nn.A0H(android.content.Context, X.3mM, java.lang.String, java.lang.String):void");
    }

    public void A0K(FragmentActivity fragmentActivity, C250973mM r21, C255783ui r22) {
        C255773uh r1;
        1Xj r5;
        ArrayList A3K;
        Fragment e5d;
        C315656kI r6 = (C315656kI) this;
        C250973mM r8 = r21;
        C255783ui r7 = r22;
        17k.A0E(r6.A0Q(r8, r7));
        int ordinal = r7.A11.ordinal();
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (ordinal != 36) {
            if (ordinal != 23) {
                if (ordinal != 21) {
                    if (ordinal != 19) {
                        if (ordinal == 15 && r6.A00 != null) {
                            HashtagImpl hashtagImpl = r7.A0k;
                            hashtagImpl.getClass();
                            String moduleName = r6.A00.A02.getModuleName();
                            e5d = new C15362UbE();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("args_hashtag", hashtagImpl);
                            bundle.putString("args_previous_module_name", moduleName);
                            e5d.setArguments(bundle);
                            e5d.A07 = new VXN(r8, r7, r6);
                        } else {
                            return;
                        }
                    } else if (r6.A00 != null) {
                        Venue A09 = r7.A09();
                        A09.getClass();
                        String moduleName2 = r6.A00.A02.getModuleName();
                        e5d = new C15361UbD();
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("args_venue", A09);
                        bundle2.putString("args_previous_module_name", moduleName2);
                        e5d.setArguments(bundle2);
                        e5d.A03 = new VXM(r8, r7, r6);
                    } else {
                        return;
                    }
                } else if (r6.A00 != null && r7.A0m != null) {
                    String str = r7.A1a;
                    str.getClass();
                    String str2 = r7.A0m.A00;
                    String moduleName3 = r6.A00.A02.getModuleName();
                    e5d = new C47497E5c();
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("args_media_id", str);
                    bundle3.putString("args_media_type", str2);
                    bundle3.putString("args_previous_module_name", moduleName3);
                    e5d.setArguments(bundle3);
                    e5d.A02 = new C49437Evd(r6);
                } else {
                    return;
                }
            } else if (r6.A00 != null) {
                String str3 = r8.A0H.A0A(r6.A01, r8.A01).A0j.split("_")[0];
                User user = r7.A1B;
                user.getClass();
                String id = user.getId();
                String str4 = r7.A1g;
                String moduleName4 = r6.A00.A02.getModuleName();
                e5d = new C47498E5d();
                Bundle bundle4 = new Bundle();
                bundle4.putString("args_user_id", id);
                bundle4.putString("args_previous_module_name", moduleName4);
                bundle4.putString("args_display_type", str4);
                bundle4.putString("args_source_media_id", str3);
                e5d.setArguments(bundle4);
                e5d.A05 = new C49573Eyi(r8, r7, r6);
            } else {
                return;
            }
            C315656kI.A01(fragmentActivity2, e5d, r6);
            return;
        }
        C310216ac r0 = r6.A00;
        if (r0 != null) {
            r1 = r0.A04.Au5();
            if (r1 != null) {
                r5 = r1.A0b;
            }
            r5 = null;
        } else {
            r1 = null;
            r5 = null;
        }
        MultiProductSticker multiProductSticker = r7.A0n;
        if (r5 != null && multiProductSticker != null && !AnonymousClass4KJ.A00(multiProductSticker.A09)) {
            if (!C297785sK.A0e(r1)) {
                UserSession userSession = r6.A01;
                if (C55152Hd0.A00(userSession, r5, (String) null)) {
                    C46498Dg1 dg1 = new C46498Dg1(fragmentActivity2, userSession);
                    dg1.A08(fragmentActivity2.getString(2131973761, new Object[]{AnonymousClass0t1.A01.A01(userSession).getUsername()}));
                    dg1.A04(new W9u(fragmentActivity2, r8, r6), 2131973762);
                    int i = 2131973769;
                    if (r5.A5j()) {
                        i = 2131973768;
                    }
                    dg1.A02(new W9t(fragmentActivity2, r5, r6), i);
                    dg1.A03 = new WXm(r6);
                    new C49945FFy(dg1).A03(fragmentActivity2);
                    return;
                }
                C315656kI.A02(fragmentActivity2, r8, r6);
                C315656kI.A03(r5, r8, r7, (Product) null, r6, "shopping_sheet");
            } else if (r6.A00 != null && (A3K = r5.A3K(true)) != null && A3K.size() == 1 && r6.A00 != null) {
                Product product = (Product) A3K.get(0);
                2EG r16 = null;
                if (C297785sK.A0S(r5)) {
                    r16 = 2EG.A3Y;
                }
                C255773uh Au5 = r6.A00.A04.Au5();
                View findViewById = fragmentActivity2.findViewById(R.id.product_thumbnail_container);
                if (!(Au5 == null || findViewById == null)) {
                    C238833Dp.A00(r6.A01).A07(findViewById, C238863Ds.PRODUCT_TAG, new String[]{Au5.A0k}, 1);
                }
                UserSession userSession2 = r6.A01;
                String id2 = r5.getId();
                String moduleName5 = r6.A00.A02.getModuleName();
                0sn A0K = C231122qu.A0K(userSession2, r5);
                String A07 = C231122qu.A07(userSession2, r5);
                String A2v = r5.A2v();
                0qQ.A0B(userSession2, 1);
                0qQ.A0B(product, 2);
                0qQ.A0B(moduleName5, 5);
                String str5 = product.A0F;
                if (str5 != null) {
                    if (r16 == null) {
                        r16 = 2EG.A2u;
                    }
                    SUL sul = new SUL(fragmentActivity2, userSession2, r16, str5, false);
                    if (A0K == null) {
                        A0K = 0sn.A00;
                    }
                    sul.A0T = Collections.unmodifiableList(A0K);
                    sul.A0C(id2);
                    String str6 = product.A0H;
                    0qQ.A0B(str6, 0);
                    sul.A1L.A00.putString("TrackingInfo.ARG_PRODUCT_ID", str6);
                    sul.A0F((String) null);
                    sul.A0S = moduleName5;
                    sul.A0B(A07);
                    sul.A0D(A2v);
                    sul.A0A();
                    C315656kI.A03(r5, r8, r7, product, r6, "webclick");
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final boolean A0L() {
        if (this instanceof C315656kI) {
            return ((C315656kI) this).A00;
        }
        return false;
    }

    public boolean A0M() {
        return true;
    }

    public boolean A0O(Context context) {
        AnonymousClass37D A022 = AnonymousClass37D.A00.A02(context);
        if (A022 != null) {
            AnonymousClass37F r1 = (AnonymousClass37F) A022;
            if (!r1.A0g || r1.A0b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A0P(Context context) {
        AnonymousClass37D A022 = AnonymousClass37D.A00.A02(context);
        if (A022 == null) {
            return false;
        }
        AnonymousClass37F r1 = (AnonymousClass37F) A022;
        if ((!r1.A0g || r1.A0b || r1.A0a) && !r1.A0e) {
            return false;
        }
        return true;
    }

    public boolean A0Q(C250973mM r4, C255783ui r5) {
        Object obj;
        int ordinal = r5.A11.ordinal();
        if (ordinal == 36) {
            MultiProductSticker multiProductSticker = r5.A0n;
            multiProductSticker.getClass();
            List<StoryMultiProductStickerLinkData> list = multiProductSticker.A08;
            if (list == null) {
                return false;
            }
            for (StoryMultiProductStickerLinkData storyMultiProductStickerLinkData : list) {
                if (storyMultiProductStickerLinkData.BMu() == null) {
                    obj = null;
                } else {
                    obj = AnonymousClass47L.A01.get(storyMultiProductStickerLinkData.BMu().intValue());
                }
                if (obj == AnonymousClass47L.IG_DESTINATION_SHOPPING_SHEET) {
                    return true;
                }
            }
            return false;
        } else if (ordinal != 23) {
            return false;
        } else {
            String str = r5.A1g;
            if ("mention_professional_username".equals(str) || "mention_diversity_username".equals(str)) {
                return true;
            }
            return false;
        }
    }

    public C317766nn() {
        String obj = UUID.randomUUID().toString();
        this.A02 = obj;
        C315666kJ.A00.put(obj, this);
    }
}
