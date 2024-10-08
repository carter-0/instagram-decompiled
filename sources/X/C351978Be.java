package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8Be  reason: invalid class name and case insensitive filesystem */
public final class C351978Be {
    public final /* synthetic */ AnonymousClass8BA A00;

    public C351978Be(AnonymousClass8BA r1) {
        this.A00 = r1;
    }

    public static void A00(C351978Be r14, String str) {
        AnonymousClass8BA r3 = r14.A00;
        UserSession userSession = r3.A0v;
        0Tu r4 = 0Tu.A05;
        boolean z = false;
        if (182.A06(r4, userSession, 36318943534848774L) && 182.A06(r4, userSession, 36318943534914311L) && r3.A18.A3f) {
            C357638Yz r42 = r3.A0w;
            if (r42.A08.A00 == AnonymousClass9QA.A00 && !r42.A0V(C358088aL.A0o, C358088aL.A0p)) {
                C3499482o r1 = r3.A14;
                if (r1.A01.A0m.size() == 1 && C366908ps.A00(r1, ((AnonymousClass8ME) r3.A1g.get()).A17())) {
                    C41472AuW auW = new C41472AuW(r14, str);
                    C357068Wi r2 = (C357068Wi) r3.A1v.get();
                    if (r2 != null) {
                        StoryDraftsCreationViewModel storyDraftsCreationViewModel = r3.A1Q;
                        C3499582p r8 = r3.A13;
                        C366678pU A04 = r2.A08.A04();
                        Bitmap A05 = r2.A05();
                        TargetViewSizeProvider targetViewSizeProvider = r3.A0z;
                        Context context = r3.A0o.getContext();
                        CameraSpec A002 = r2.A0Q.A00();
                        if (r1.A01() == C365758nd.A07) {
                            z = true;
                        }
                        storyDraftsCreationViewModel.A01(context, A05, targetViewSizeProvider, r8, A002, A04, auW, false, z);
                        return;
                    }
                    return;
                }
            }
        }
        C357088Wk r12 = (C357088Wk) r3.A1x.get();
        if (r12 != null) {
            r12.A0G(str, (String) null);
        }
    }

    public final void A01() {
        C279294yP r8;
        Object obj;
        AnonymousClass8BA r2 = this.A00;
        UserSession userSession = r2.A0v;
        27r A01 = 27p.A01(userSession);
        if (r2.A14.A01.A0g == C2801950r.FEED_POST) {
            r8 = C279294yP.FEED;
        } else {
            r8 = null;
        }
        Boolean valueOf = Boolean.valueOf(r2.A1D.A03.A0G);
        29Z r7 = A01.A0F;
        0wc r3 = r7.A01;
        0Aj A002 = r3.A00(r3.A00, "ig_camera_ui_tool_click");
        if (r7.A0P() && A002.isSampled()) {
            if (r8 == null) {
                r8 = r7.A0J();
            }
            A002.A8M(AnonymousClass80P.AR_EFFECT_BUTTON_TAP, "tool_type");
            A002.AAJ("legacy_falco_event_name", "IG_CAMERA_TAP_AR_EFFECT_BUTTON");
            AnonymousClass283 r4 = r7.A04;
            String str = r4.A0L;
            if (str == null) {
                str = "";
            }
            A002.AAJ("camera_session_id", str);
            A002.A8M(r8, "camera_destination");
            int i = 2;
            if (r4.A01 != 2) {
                i = 1;
            }
            A002.A8k("camera_position", Integer.valueOf(i));
            A002.A8M(r7.A0I(), "capture_type");
            A002.A8M(r4.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.A8k("event_type", 2);
            A002.A8M(r4.A0A, "media_type");
            A002.AAJ("module", 27x.A08.getModuleName());
            A002.A8M(C59725JVj.POST_CAPTURE, "surface");
            A002.A7p("ads_mode_boost_story_enabled", valueOf);
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.A7p("is_panavision", Boolean.valueOf(r4.A0W));
            A002.Cgf();
        }
        C3494680m r42 = r2.A0w.A08;
        boolean z = r42.A00 instanceof AnonymousClass80O;
        AnonymousClass80U r1 = r2.A1M;
        if (z) {
            obj = new Object();
        } else {
            obj = new Object();
        }
        r1.E3H(obj);
        if ((r42.A00 instanceof AnonymousClass9QA) && AnonymousClass0t1.A01.A01(userSession).A2L() && 182.A06(0Tu.A05, userSession, 36319145398246332L)) {
            boolean z2 = false;
            boolean z3 = false;
            if (System.currentTimeMillis() - 1Au.A00(userSession).A01.getLong("time_last_seen_boost_story_effects_toast", 0) > TimeUnit.HOURS.toMillis(24)) {
                z3 = true;
            }
            int i2 = 1Au.A00(userSession).A01.getInt("boost_story_effects_toast_view_count", 0);
            if (i2 < 3) {
                z2 = true;
            }
            if (z3 && z2) {
                C59689JTv.A08(r2.A0n, 2131961554, 1);
                1Av A003 = 1Au.A00(userSession);
                long currentTimeMillis = System.currentTimeMillis();
                0xY AR4 = A003.A01.AR4();
                AR4.E5c("time_last_seen_boost_story_effects_toast", currentTimeMillis);
                AR4.apply();
                0xY AR42 = 1Au.A00(userSession).A01.AR4();
                AR42.E5Z("boost_story_effects_toast_view_count", i2 + 1);
                AR42.apply();
                27p.A01(userSession).A1a((C279284yO) r42.A00);
            }
        }
    }

    public final void A02() {
        AnonymousClass8BA r2 = this.A00;
        AnonymousClass80U r3 = r2.A1M;
        if (r3.CZU()) {
            AnonymousClass82Y r1 = r2.A14.A01;
            if (!(r1.A02() == null || r1.A02().A09 == null)) {
                0xY AR4 = 1Au.A00(r2.A0v).A01.AR4();
                AR4.E5T("has_tapped_on_template_sticker_tooltip", true);
                AR4.apply();
            }
        }
        r3.E3H(new Object());
    }

    public final void A03() {
        AnonymousClass8BA r1 = this.A00;
        C3499482o r2 = r1.A14;
        if (r2.A0G()) {
            r1.A0o(false);
            return;
        }
        if (r2.A01.A0S) {
            UserSession userSession = r1.A0v;
            AnonymousClass0iw r22 = r1.A0u;
            String str = r1.A18.A2l;
            0qQ.A0B(userSession, 0);
            0qQ.A0B(r22, 1);
            C67000MgY.A00(r22, userSession, (Long) null, "selfie_reply_sound", "tap", "selfie_reply_post_capture", str, (Map) null);
        }
        r1.A11.A02();
    }

    public final void A04() {
        C357068Wi r0 = (C357068Wi) this.A00.A1v.get();
        if (r0 != null) {
            r0.A06();
        }
    }

    public final void A05() {
        AnonymousClass8ME r1 = (AnonymousClass8ME) this.A00.A1g.get();
        r1.A1F(r1.A10());
    }

    public final void A06() {
        B3f A002;
        AnonymousClass8BA r5 = this.A00;
        InteractiveDrawableContainer interactiveDrawableContainer = r5.A1s;
        ArrayList A0V = interactiveDrawableContainer.A0V(C354798Nk.class);
        0qQ.A0B(A0V, 0);
        Drawable drawable = (Drawable) 00k.A0J(A0V);
        if (!(drawable == null || r5.A1O.A08() || (A002 = InteractiveDrawableContainer.A00(drawable, interactiveDrawableContainer)) == null)) {
            C378669Qs r4 = (C378669Qs) A002;
            if (!r4.A0W) {
                AnimatorSet animatorSet = new AnimatorSet();
                float f = r4.A03;
                float f2 = -8.0f + f;
                ObjectAnimator duration = ObjectAnimator.ofFloat(r4, "rotateDelta", new float[]{f, f2, 8.0f + f, f2, f}).setDuration(600);
                0qQ.A07(duration);
                AnimatorSet.Builder play = animatorSet.play(duration);
                float f3 = r4.A04 * r4.A00;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(r4, "scaleFactor", new float[]{f3, f3 + 0.1f, f3}).setDuration(600);
                0qQ.A07(duration2);
                play.with(duration2);
                animatorSet.addListener(new AJJ(r4));
                animatorSet.addListener(new AJI(r4));
                animatorSet.start();
            }
        }
        if (((AnonymousClass8ME) r5.A1g.get()).A1U()) {
            LSX.A01(r5.A0n, ((NineSixteenLayoutConfigImpl) r5.A0z).A0G);
        }
    }

    public final void A07() {
        AnonymousClass8BA r3 = this.A00;
        AnonymousClass823 r2 = r3.A15;
        if (r2 != null) {
            r2.A00().A04(false);
            r2.A00().A01();
        }
        r3.A1s.A0w(new AWJ());
        ((AnonymousClass8O4) r3.A1c.get()).A0C();
    }

    public final void A08() {
        AnonymousClass2k4 r2;
        AnonymousClass8BA r9 = this.A00;
        UserSession userSession = r9.A0v;
        if (JWB.A01(userSession)) {
            r2 = AnonymousClass2k4.NIGHT;
        } else {
            r2 = AnonymousClass2k4.DEFAULT;
        }
        C331127Pr r1 = new C331127Pr(userSession);
        r1.A0a = true;
        r1.A03 = 0.9f;
        Activity activity = r9.A0n;
        r1.A0d = activity.getString(2131962901);
        r1.A0O = r2;
        r1.A0U = new C40643AgI(r9);
        C331157Pu A002 = r1.A00();
        int width = r9.A1s.getWidth();
        C40288AZd aZd = new C40288AZd((AnonymousClass8ME) r9.A1g.get(), A002);
        C40289AZe aZe = new C40289AZe(r9);
        C384949i9 r22 = new C384949i9();
        Bundle bundle = new Bundle();
        bundle.putInt("container_width", width);
        r22.setArguments(bundle);
        r22.A00 = aZd;
        r22.A01 = aZe;
        A002.A02(activity, r22);
        if (r9.A20) {
            C59847JaN A003 = JW1.A00(userSession);
            0wc r23 = A003.A0D;
            0Aj A004 = r23.A00(r23.A00, "ig_camera_start_gallery_session");
            A004.AAJ("camera_session_id", C360918fM.A00(A003.A0E).A00());
            A004.A8M(C279294yP.FEED, "camera_destination");
            A004.AAe("camera_tools", 0sn.A00);
            A004.AAJ("gallery_entry_point", "POST_CAPTURE_ACTION_BAR");
            A004.Cgf();
        }
    }

    public final void A09() {
        AnonymousClass8BA r3 = this.A00;
        C314676if r0 = r3.A1a;
        if (r0 != null) {
            C359318cb r2 = (C359318cb) r0.get();
            String A0L = r2.A0s.A0L();
            if (A0L != null) {
                C64169LRs.A03(r2.A0S, A0L);
                27p.A01(r2.A0b).A0e();
                return;
            }
        }
        AnonymousClass8QG r02 = (AnonymousClass8QG) r3.A1w.get();
        if (r02 != null) {
            r02.A06();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007c, code lost:
        if (X.1Au.A00(r5).A1h() == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007e, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x006c, code lost:
        if (r0 != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0072, code lost:
        if (r3 != false) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A() {
        /*
            r19 = this;
            r3 = r19
            X.8BA r1 = r3.A00
            com.instagram.common.session.UserSession r5 = r1.A0v
            X.27r r0 = X.27p.A01(r5)
            X.29R r2 = r0.A09
            X.0wc r0 = r2.A01
            X.1Ln r4 = X.1Ln.A08(r0)
            X.0Aj r0 = r4.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = "IG_CAMERA_ENTITY_TAP"
            r4.A0t(r0)
            java.lang.String r0 = "INVISIBLE_MENTIONS_USER_SELECTION_BUTTON"
            r4.A0r(r0)
            X.29R.A00(r4, r2)
            X.4yP r0 = X.C279294yP.STORY
            r4.A0a(r0)
            X.283 r2 = r2.A04
            X.28D r0 = r2.A09
            r4.A0b(r0)
            r4.A0T()
            r4.A0U()
            X.0iw r0 = X.27x.A08
            java.lang.String r0 = r0.getModuleName()
            r4.A0n(r0)
            X.28t r0 = r2.A0A
            r4.A0c(r0)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
            r4.A0u(r0)
            r4.Cgf()
        L_0x0053:
            X.8Oa r2 = X.AnonymousClass8OY.A00(r5)
            X.Aez r8 = new X.Aez
            r8.<init>(r3, r2)
            boolean r3 = X.2R8.A01(r5)
            X.82p r0 = r1.A13
            X.82o r0 = r0.A02
            boolean r0 = r0.A0F()
            if (r3 == 0) goto L_0x006e
            r16 = 1
            if (r0 == 0) goto L_0x0074
        L_0x006e:
            r16 = 0
            if (r0 != 0) goto L_0x00dc
            if (r3 == 0) goto L_0x007e
        L_0x0074:
            X.1Av r0 = X.1Au.A00(r5)
            boolean r0 = r0.A1h()
            if (r0 == 0) goto L_0x00dc
        L_0x007e:
            r17 = 1
        L_0x0080:
            X.82o r3 = r1.A14
            X.82Y r0 = r3.A01
            java.lang.String r11 = r0.A0F
            X.0qQ.A07(r11)
            X.6if r0 = r1.A1g
            java.lang.Object r0 = r0.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            java.util.List r13 = r0.B9U()
            java.util.HashMap r0 = r2.A00
            java.lang.Object r0 = r0.get(r11)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            if (r0 == 0) goto L_0x00ac
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r0)
            r14.removeAll(r13)
        L_0x00ac:
            android.app.Activity r1 = r1.A0n
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r2 = r0.A01(r1)
            if (r2 == 0) goto L_0x00db
            X.8nd r0 = r3.A01()
            java.lang.String r10 = r0.toString()
            X.EW0 r7 = X.EW0.INVISIBLE_MENTION_USER_SELECTION_BUTTON
            java.lang.String r9 = ""
            r15 = 0
            X.0qQ.A0B(r5, r15)
            r0 = 8
            X.0qQ.A0B(r10, r0)
            r6 = 0
            r18 = 1
            r12 = r6
            X.E5n r1 = X.C49097EpM.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.AgY r0 = new X.AgY
            r0.<init>()
            r2.A0M(r1, r0)
        L_0x00db:
            return
        L_0x00dc:
            r17 = 0
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351978Be.A0A():void");
    }

    public final void A0B() {
        AnonymousClass8BA r2 = this.A00;
        if (r2.A20 || ((AnonymousClass8ME) r2.A1g.get()).A0D != AnonymousClass05K.A00) {
            r2.A1M.E3H(new Object());
        }
    }

    public final void A0C(View view) {
        AnonymousClass8BA r3 = this.A00;
        if (r3.A11.A01() == AnonymousClass05K.A01) {
            r3.A1X.A00().A01(r3.A1s, view, C366978pz.A16);
        }
    }

    public final void A0D(View view) {
        AnonymousClass8BA r1 = this.A00;
        if (r1.A0w.A08.A00 instanceof AnonymousClass80O) {
            r1.A1X.A00().A01(r1.A1s, view, C366978pz.A0v);
        }
    }

    public final void A0E(C362088hK r3, Integer num) {
        AnonymousClass8BA.A0B(this.A00, r3, num, new Object());
    }

    public final void A0F(C352218Cl r23, boolean z) {
        int i;
        C352218Cl r1 = r23;
        String str = r1.A0f;
        String str2 = "";
        String str3 = str2;
        if (str != null) {
            str3 = str;
        }
        String str4 = r1.A0g;
        String str5 = str2;
        if (str4 != null) {
            str5 = str4;
        }
        String str6 = r1.A0l;
        String str7 = str2;
        if (str6 != null) {
            str7 = str6;
        }
        String str8 = r1.A0m;
        if (str8 != null) {
            str2 = str8;
        }
        AnonymousClass8BA r12 = this.A00;
        Application application = r12.A0n.getApplication();
        UserSession userSession = r12.A0v;
        0qQ.A0B(application, 0);
        0qQ.A0B(userSession, 1);
        if (z) {
            i = 876;
        } else {
            i = 2106;
        }
        String A002 = AnonymousClass000.A00(i);
        AnonymousClass19S A02 = AnonymousClass1HX.A02(1329138747, 3);
        TTB ttb = new TTB(application, userSession, str3, str5, A002, "IMAGINE", (AnonymousClass4D7) null, 2);
        19B r13 = 19B.A00;
        1Eo.A05(r13, ttb, A02);
        1Eo.A05(r13, new TTB(application, userSession, str7, str2, A002, "PROMPT_SUMMARIZATION", (AnonymousClass4D7) null, 2), AnonymousClass1HX.A02(1329138747, 3));
    }

    public final void A0G(String str, boolean z) {
        C357088Wk r0 = (C357088Wk) this.A00.A1x.get();
        if (r0 != null) {
            C357088Wk.A09(r0, str, z);
        }
    }
}
