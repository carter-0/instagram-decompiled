package X;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryTrendingPromptSubType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.6a2  reason: invalid class name */
public final class AnonymousClass6a2 implements C317286n1 {
    public C310016aI A00;
    public C314766io A01;
    public C314716ij A02;
    public C314796ir A03;
    public C314756in A04;
    public C314776ip A05;
    public C314786iq A06;
    public C313516gZ A07;
    public final C273384mU A08;
    public final C317116mk A09;
    public final WeakReference A0A;

    public final void ChR(C68206N5v n5v) {
        StoryTrendingPromptSubType storyTrendingPromptSubType;
        long j;
        C313516gZ r3 = this.A07;
        if (r3 == null) {
            0qQ.A0F("trendingPromptController");
            throw AnonymousClass00P.createAndThrow();
        }
        OTK otk = (OTK) r3.A08.getValue();
        StoryPromptTappableData storyPromptTappableData = n5v.A01;
        String str = storyPromptTappableData.A0M;
        int i = n5v.A00;
        BHW bhw = n5v.A02;
        if (bhw != null) {
            storyTrendingPromptSubType = bhw.A00;
        } else {
            storyTrendingPromptSubType = null;
        }
        String sessionId = r3.A05.A0E.getSessionId();
        String str2 = storyPromptTappableData.A0N;
        0qQ.A0B(str, 0);
        0qQ.A0B(sessionId, 3);
        String str3 = AnonymousClass1QI.A00.A02.A00;
        if (str3 != null) {
            0wc r2 = (0wc) otk.A02.getValue();
            0Aj A002 = r2.A00(r2.A00, "instagram_trending_prompts");
            A002.AAJ("nav_chain", str3);
            A002.AAJ("event_type", "trending_prompts_netego_prompt_impression");
            A002.AAJ(C66579MXk.A00(26), sessionId);
            A002.AAJ("feed_type", "trending");
            A002.AAJ(C66579MXk.A00(113), str);
            A002.AAJ(C66579MXk.A00(733), String.valueOf(storyTrendingPromptSubType));
            A002.AAJ("component_type", "story");
            A002.A9F(C66579MXk.A00(732), Long.valueOf((long) i));
            if (str2 != null) {
                j = 1;
            } else {
                j = 0;
            }
            A002.A9F(C66579MXk.A00(1013), Long.valueOf(j));
            A002.Cgf();
        }
    }

    public final void CtH(28D r4, C255773uh r5) {
        0qQ.A0B(r4, 1);
        AnonymousClass6Z5 r2 = (AnonymousClass6Z5) this.A09;
        C313056fm r0 = ((ReelViewerFragment) r2.A17).mViewPager;
        if (r0 != null && r0.isIdle()) {
            r2.CI6(r4, r5, (VWL) null, 2EG.A3e);
        }
    }

    public final void Cv4(C250973mM r3) {
        this.A09.DJD(r3, false);
    }

    public final void DF1(BHW bhw, Reel reel, XC0 xc0, List list, int i) {
    }

    public final void Dac(BHW bhw, PromptStickerModel promptStickerModel, int i) {
        C270084gA r0;
        0qQ.A0B(promptStickerModel, 0);
        C313516gZ r3 = this.A07;
        if (r3 == null) {
            0qQ.A0F("trendingPromptController");
            throw AnonymousClass00P.createAndThrow();
        }
        FragmentActivity fragmentActivity = r3.A00;
        UserSession userSession = r3.A02;
        C64135LPk.A00(fragmentActivity, 28D.A0E, userSession, promptStickerModel);
        C255773uh Au5 = r3.A06.Au5();
        if (!(Au5 == null || (r0 = Au5.A07) == null)) {
            String str = r0.A03.A08;
            if (str == null) {
                str = "";
            }
            String str2 = Au5.A0j;
            0qQ.A07(str2);
            AnonymousClass4DH r9 = r3.A01;
            String A002 = AnonymousClass000.A00(382);
            0wc A012 = AnonymousClass0kN.A01(r9, userSession);
            0Aj A003 = A012.A00(A012.A00, "instagram_netego_secondary_click");
            if (A003.isSampled()) {
                A003.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A002);
                A003.AAJ("action", "cta_secondary_click");
                A003.AAJ("container_module", r9.getModuleName());
                A003.A9F("ig_userid", Long.valueOf(Long.parseLong(userSession.A06)));
                A003.AAJ("netego_id", str2);
                A003.AAJ("tracking_token", str);
                A003.Cgf();
            }
        }
        OTK.A00((OTK) r3.A08.getValue(), "cta_tap");
    }

    public final void Dad(BHW bhw, PromptStickerModel promptStickerModel, int i) {
        PromptStickerModel promptStickerModel2 = promptStickerModel;
        0qQ.A0B(promptStickerModel2, 0);
        C313516gZ r0 = this.A07;
        if (r0 == null) {
            0qQ.A0F("trendingPromptController");
            throw AnonymousClass00P.createAndThrow();
        }
        C273384mU r10 = r0.A06;
        r10.EHS(false);
        r10.CLU();
        r10.EHY("tapped");
        C255773uh Au5 = r10.Au5();
        if (Au5 != null) {
            FragmentActivity fragmentActivity = r0.A00;
            AnonymousClass4DH r5 = r0.A01;
            UserSession userSession = r0.A02;
            C64019LJg.A00(fragmentActivity, 28D.A0F, r5, userSession, (C255773uh) null, (C310016aI) null, (C317766nn) null, r10, promptStickerModel2, (C310416b1) null, promptStickerModel2.A05(), r0.A07, r0.A05.A0E.getSessionId(), 0sn.A00);
            C270084gA r1 = Au5.A07;
            if (r1 != null) {
                String str = r1.A03.A08;
                if (str == null) {
                    str = "";
                }
                String A002 = AnonymousClass000.A00(382);
                String str2 = Au5.A0j;
                0qQ.A07(str2);
                AnonymousClass3PI.A05(r5, userSession, (Long) null, A002, str2, "cta_primary_click", str);
            }
        }
        OTK.A00((OTK) r0.A08.getValue(), "sticker_tap");
    }

    public final boolean DcE(C255783ui r2, int i, int i2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DpG(SparseArray sparseArray, View view, ImageUrl imageUrl, String str, String str2, int i, int i2) {
        C255773uh r4;
        0qQ.A0B(view, 5);
        0qQ.A0B(sparseArray, 6);
        C314716ij r3 = this.A02;
        if (r3 == null) {
            0qQ.A0F("suggestedUsersController");
            throw AnonymousClass00P.createAndThrow();
        }
        View Atm = r3.A04.Atm();
        if (Atm == null || !(Atm.getTag() instanceof C67602Mqa)) {
            r4 = null;
        } else {
            r4 = ((C67602Mqa) Atm.getTag()).A06;
        }
        C311676d4 r2 = r3.A06;
        ViewGroup viewGroup = ((C313046fl) r3.A05).A02;
        r2.A00(false, true);
        r2.A08 = str;
        r2.A07 = "reel_viewer_netego_suggested_user";
        r2.A00 = sparseArray;
        r2.A03 = null;
        r2.A02 = r4;
        r2.A04 = null;
        r2.A06 = null;
        r2.A01 = view;
        C55887Hp8 A002 = C56591I2v.A00(viewGroup, r2.A0A);
        A002.A02 = C54604HKn.A01;
        A002.A03 = Integer.valueOf(R.color.baseline_neutral_80);
        C275794rx r5 = new C275794rx(A002);
        r2.A05 = r5;
        r5.A03 = r2;
        C56591I2v.A02(r2.A09, imageUrl, r5, str2, 2131970049, false);
        r2.A05.A02(view, 0, i2, false);
        this.A08.EHY("tapped");
    }

    public final boolean Dq1(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent, 0);
        0qQ.A0B(motionEvent2, 1);
        return this.A09.Dq1(motionEvent, motionEvent2, f, f2);
    }

    public final void Ckc(C250973mM r7, String str, String str2, float f, float f2, int i) {
        C310016aI r0 = this.A00;
        if (r0 == null) {
            0qQ.A0F("reelViewerLogger");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A0P(r7, str2, f, f2, i);
        }
    }

    public final void CtE(C255773uh r2) {
        this.A09.CtE(r2);
    }

    public final void D4u(Context context, AnonymousClass0iw r12, float f, float f2) {
        C314776ip r3 = this.A05;
        if (r3 == null) {
            0qQ.A0F("shareCommentToStoryController");
            throw AnonymousClass00P.createAndThrow();
        }
        C275794rx r2 = r3.A00;
        if (r2 != null) {
            r2.A03(true);
            r3.A00 = null;
            return;
        }
        UserSession userSession = r3.A04;
        View view = r3.A03;
        C55887Hp8 A002 = C56591I2v.A00(view, userSession);
        A002.A02 = C54604HKn.A01;
        A002.A03 = Integer.valueOf(2Yu.A0H(r3.A02, R.attr.igds_color_creation_tools_grey_03));
        C275794rx r6 = new C275794rx(A002);
        r6.A03 = new C57420IaQ(context, r3);
        String string = context.getResources().getString(2131952390);
        0qQ.A07(string);
        C56591I2v.A02(r12, (ImageUrl) null, r6, string, 2131955877, false);
        r6.A02(view, ((int) f) - (view.getWidth() / 2), ((int) f2) - (view.getHeight() / 2), false);
        r3.A00 = r6;
        r3.A05.EHY("tapped");
    }

    public final void DA9(float f) {
        this.A09.DA9(f);
    }

    public final void DGJ() {
        this.A08.EHd();
    }

    public final void DGK(boolean z) {
        C314716ij r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("suggestedUsersController");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A06.A00(true, z);
        if (z) {
            this.A08.EHY("tapped");
        }
    }

    public final void DP2(float f, float f2) {
        this.A09.DP2(f, f2);
    }

    public final void DRI(View view, C255773uh r3, C250973mM r4) {
        this.A09.DRI(view, r3, r4);
    }

    public final void DS2(Context context, AnonymousClass0iw r15, C255773uh r16, float f, float f2) {
        String str;
        C275794rx r9;
        String str2;
        C314796ir r1 = this.A03;
        if (r1 != null) {
            UserSession userSession = r1.A04;
            C255773uh r12 = r16;
            String str3 = r12.A0j;
            0qQ.A07(str3);
            C270124gE r13 = r12.A0C;
            if (r13 != null) {
                str = r13.A07;
            } else {
                str = null;
            }
            AnonymousClass3PI.A05(r15, userSession, (Long) null, "meta_gallery_stories_netego", str3, "cta_primary_click", str);
            C314796ir r5 = this.A03;
            if (r5 != null) {
                if (r5.A00 != null) {
                    r5.A05.EHd();
                    r9 = null;
                    C275794rx r0 = r5.A00;
                    if (r0 != null) {
                        r0.A03(true);
                    }
                } else {
                    r5.A05.EHY("tapped");
                    UserSession userSession2 = r5.A04;
                    View view = r5.A02;
                    C55887Hp8 A002 = C56591I2v.A00(view, userSession2);
                    A002.A02 = C54604HKn.A01;
                    A002.A03 = Integer.valueOf(R.color.direct_light_mode_glyph_color_tertiary);
                    r9 = new C275794rx(A002);
                    r9.A03 = new C51010Fmx(r15, r5);
                    if (r13 == null || (str2 = r13.A06) == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    C56591I2v.A02(r15, (ImageUrl) null, r9, str2, 2131966449, false);
                    r9.A02(view, ((int) f) - (view.getWidth() / 2), ((int) f2) - (view.getHeight() / 2), false);
                }
                r5.A00 = r9;
                return;
            }
        }
        0qQ.A0F("metaGalleryNetegoController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DTo(C255773uh r3, C250973mM r4, C67602Mqa mqa, boolean z) {
        C273384mU r1 = this.A08;
        if (0qQ.A0K(((ReelViewerFragment) r1).A0a, r4) || z) {
            r1.D7R(r3, mqa);
            if (r3.A0f != null) {
                C306656Mz r12 = mqa.A0N;
                if (r12.A05 != null) {
                    View view = r12.A01;
                    if (view != null) {
                        view.setVisibility(0);
                        return;
                    }
                    throw new IllegalStateException("ad4ad view is null when it needs to be animated");
                }
                throw new IllegalStateException("reelItemState expected to be not null");
            }
        }
    }

    public final void Dcu(View view, AnonymousClass30Y r3) {
        C313516gZ r0 = this.A07;
        if (r0 == null) {
            0qQ.A0F("trendingPromptController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A04.A05(view, r3);
        }
    }

    public final void Dcv(View view, AnonymousClass30Y r3) {
        C314786iq r0 = this.A06;
        if (r0 == null) {
            0qQ.A0F("threadsInStoriesController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A05.A05(view, r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if ((r4.getTag() instanceof X.C67602Mqa) == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DpK(X.C250973mM r8) {
        /*
            r7 = this;
            X.6ij r6 = r7.A02
            java.lang.String r5 = "suggestedUsersController"
            if (r6 == 0) goto L_0x005a
            X.4mU r0 = r6.A04
            android.view.View r4 = r0.Atm()
            X.3uh r3 = r0.Au5()
            r2 = 0
            if (r4 == 0) goto L_0x001c
            java.lang.Object r0 = r4.getTag()
            boolean r0 = r0 instanceof X.C67602Mqa
            r1 = 1
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            if (r3 == 0) goto L_0x0026
            boolean r0 = r3.A1U()
            if (r0 == 0) goto L_0x0026
            r2 = 1
        L_0x0026:
            if (r1 == 0) goto L_0x0052
            if (r2 == 0) goto L_0x0052
            r4.getClass()
            java.lang.Object r4 = r4.getTag()
            r4.getClass()
            X.Mqa r4 = (X.C67602Mqa) r4
            X.6Yf r3 = r4.A08
            r3.getClass()
            boolean r0 = r3.A0s
            if (r0 != 0) goto L_0x0052
            boolean r0 = r3.A0g
            if (r0 != 0) goto L_0x0052
            com.instagram.common.session.UserSession r2 = r6.A02
            X.4D6 r1 = r6.A03
            X.3uh r0 = r4.A06
            r0.getClass()
            X.C314716ij.A00(r2, r1, r0, r3, r4)
            r0 = 1
            r3.A0g = r0
        L_0x0052:
            X.6ij r0 = r7.A02
            if (r0 == 0) goto L_0x005a
            r0.A03()
            return
        L_0x005a:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6a2.DpK(X.3mM):void");
    }

    public final void DpL() {
        C314716ij r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("suggestedUsersController");
            throw AnonymousClass00P.createAndThrow();
        }
        C310066aN r02 = r0.A07;
        C309516Yo r3 = new C309516Yo(r02.A00, r02.A02);
        r3.A0F = true;
        r3.A0B((Bundle) null, FC6.A00().A00().A01("su_in_stories", (String) null));
        r3.A04();
    }

    public final boolean Dps(float f, float f2) {
        return this.A09.Dps(f, f2);
    }

    public final boolean Dpu() {
        return this.A09.Dpu();
    }

    public final boolean Dpw() {
        return this.A09.Dpw();
    }

    public final void Dqb(float f, float f2) {
        this.A09.Dqb(f, f2);
    }

    public final void DrJ(Context context, AnonymousClass0iw r17, String str, float f, float f2, int i) {
        C314786iq r8 = this.A06;
        if (r8 == null) {
            0qQ.A0F("threadsInStoriesController");
            throw AnonymousClass00P.createAndThrow();
        }
        C275794rx r2 = r8.A00;
        if (r2 != null) {
            r2.A03(true);
            r8.A00 = null;
            return;
        }
        UserSession userSession = r8.A04;
        View view = r8.A03;
        C55887Hp8 A002 = C56591I2v.A00(view, userSession);
        A002.A02 = C54604HKn.A01;
        C275794rx r11 = new C275794rx(A002);
        Context context2 = context;
        AnonymousClass0iw r7 = r17;
        r11.A03 = new C57422IaS(context2, r7, r8, str, i);
        C273384mU r3 = r8.A06;
        C56591I2v.A01(view, r3.AuD(), r11);
        String string = context2.getResources().getString(2131976649);
        0qQ.A07(string);
        C56591I2v.A02(r7, (ImageUrl) null, r11, string, 2131955877, false);
        r11.A02(view, ((int) f) - (view.getWidth() / 2), ((int) f2) - (view.getHeight() / 2), false);
        r8.A00 = r11;
        r3.EHY("tapped");
    }

    public final void DrK(Context context, AnonymousClass0iw r9, UserSession userSession, C255773uh r11) {
        String str;
        Long l;
        List BPz;
        List BPz2;
        C314786iq r0 = this.A06;
        if (r0 == null) {
            0qQ.A0F("threadsInStoriesController");
            throw AnonymousClass00P.createAndThrow();
        }
        UserSession userSession2 = r0.A04;
        FragmentActivity fragmentActivity = r0.A02;
        0qQ.A0C(fragmentActivity, AnonymousClass000.A00(22));
        C49965FGy.A02(fragmentActivity, userSession2, "tisu");
        0wc A012 = AnonymousClass0kN.A01(r9, userSession);
        0Aj A002 = A012.A00(A012.A00, "ig_threads_in_stories_unit_header_tap");
        C270114gD r6 = r11.A0D;
        17k.A07(r6, "Threads in stories unit netego unit is missing Threads in stories unit model.");
        int i = 0;
        if (r6 == null || (BPz2 = r6.A00.BPz()) == null || BPz2.size() <= 1) {
            str = "one_media";
        } else {
            str = "three_media";
        }
        if (A002.isSampled()) {
            A002.AAJ("container_module", "ig_threads_in_stories_unit");
            17k.A07(r6, "Threads in stories unit netego unit is missing Threads in stories unit model.");
            if (!(r6 == null || (BPz = r6.A00.BPz()) == null)) {
                i = BPz.size();
            }
            A002.A8k("total_num_candidates", Integer.valueOf(i));
            Long l2 = null;
            A002.A8k("media_index", (Integer) null);
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            17k.A07(r6, "Threads in stories unit netego unit is missing Threads in stories unit model.");
            if (r6 != null) {
                String Bir = r6.A00.Bir();
                if (Bir == null) {
                    Bir = "";
                }
                l = 00y.A0n(10, Bir);
            } else {
                l = null;
            }
            A002.A9F("quick_promotion_id", l);
            17k.A07(r6, "Threads in stories unit netego unit is missing Threads in stories unit model.");
            if (r6 != null) {
                l2 = 00y.A0n(10, r6.getId());
            }
            A002.A9F("netego_id", l2);
            A002.AAJ("displayed_card_type", str);
            A002.Cgf();
        }
    }

    public final void DvB(boolean z) {
        this.A09.DvB(z);
    }

    public final void DzQ(C255773uh r2) {
        this.A09.DzQ(r2);
    }

    public final void DzS(C255773uh r2, C309426Yf r3, boolean z) {
        this.A09.DzS(r2, r3, z);
    }

    public AnonymousClass6a2(C273384mU r1, C317116mk r2, WeakReference weakReference) {
        this.A0A = weakReference;
        this.A09 = r2;
        this.A08 = r1;
    }
}
