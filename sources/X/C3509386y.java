package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.86y  reason: invalid class name and case insensitive filesystem */
public abstract class C3509386y implements AnonymousClass85Y, C3509486z, C3493580b {
    public AnonymousClass87G A00;
    public AnonymousClass8S4 A01;
    public boolean A02 = true;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final View A07;
    public final 0hq A08;
    public final AnonymousClass07i A09;
    public final AnonymousClass4DH A0A;
    public final AnonymousClass0iw A0B;
    public final UserSession A0C;
    public final C71662eb A0D;
    public final TargetViewSizeProvider A0E;
    public final AnonymousClass87B A0F;
    public final AnonymousClass87H A0G;
    public final AnonymousClass876 A0H;
    public final AnonymousClass871 A0I;
    public final C3508086k A0J;
    public final AnonymousClass80U A0K;
    public final List A0L;
    public final Map A0M = new HashMap();
    public final boolean A0N;
    public final C3499982t A0O;

    public final void A03() {
        if (this.A05) {
            AnonymousClass876 r1 = this.A0H;
            AnonymousClass87G A022 = r1.A02(r1.A00);
            A022.getClass();
            if (!A01(A022)) {
                this.A0J.A00().EKh(0, false);
            }
        }
    }

    public final /* synthetic */ void onResume() {
    }

    public static AA8 A00(C3509386y r1) {
        AnonymousClass87G A012 = r1.A0H.A01();
        A012.getClass();
        return r1.A02(A012);
    }

    public static boolean A01(AnonymousClass87G r1) {
        AnonymousClass87I r12 = r1.A04;
        if (r12 == null) {
            r12 = AnonymousClass87I.EMPTY;
        }
        return r12.equals(AnonymousClass87I.TYPE);
    }

    public final AA8 A02(AnonymousClass87G r4) {
        Map map = this.A0M;
        AnonymousClass87I r0 = r4.A04;
        if (r0 == null) {
            r0 = AnonymousClass87I.EMPTY;
        }
        Object obj = map.get(r0);
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find controller for element of type ");
        AnonymousClass87I r02 = r4.A04;
        if (r02 == null) {
            r02 = AnonymousClass87I.EMPTY;
        }
        sb.append(r02);
        17k.A07(obj, sb.toString());
        return (AA8) ((C314676if) obj).get();
    }

    public final void A04() {
        if (this.A00 != null && !A0B()) {
            AnonymousClass876 r4 = this.A0H;
            List unmodifiableList = Collections.unmodifiableList(r4.A08);
            0qQ.A07(unmodifiableList);
            for (int i = 0; i < unmodifiableList.size(); i++) {
                AnonymousClass87I r1 = ((AnonymousClass87G) unmodifiableList.get(i)).A04;
                if (r1 == null) {
                    r1 = AnonymousClass87I.EMPTY;
                }
                AnonymousClass87I r0 = this.A00.A04;
                if (r0 == null) {
                    r0 = AnonymousClass87I.EMPTY;
                }
                if (r1 == r0) {
                    this.A0J.A00().EKh(i, this.A02);
                    r4.A03(i);
                    A07((AnonymousClass87G) unmodifiableList.get(i), this.A00);
                    return;
                }
            }
        }
    }

    public final void A06() {
        UserSession userSession = this.A0C;
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A05, userSession, 36327907132848936L)) {
            11Z.A02(new C40798AjU(this));
            return;
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A0F.A04;
        touchInterceptorFrameLayout.getClass();
        touchInterceptorFrameLayout.setVisibility(8);
    }

    public final void A07(AnonymousClass87G r9, AnonymousClass87G r10) {
        AnonymousClass8BE r0;
        List list;
        String str;
        List list2;
        DUJ duj;
        AnonymousClass8S4 r02 = this.A01;
        boolean A012 = A01(r9);
        AnonymousClass8BA r2 = r02.A03;
        AnonymousClass8ME r1 = (AnonymousClass8ME) r2.A1g.get();
        if (A012) {
            r0 = r2.A1K;
        } else {
            r0 = r2.A1L;
        }
        0qQ.A0B(r0, 0);
        r1.A07 = r0;
        r1.A1m.A0T = r0.CRa();
        if (A01(r9)) {
            if (!this.A03) {
                this.A01.A00();
            }
            AnonymousClass87B r3 = this.A0F;
            C315596kB.A08(new View[]{r3.A02, r3.A03}, true);
            AnonymousClass87D r03 = r3.A09;
            r03.A02();
            r03.A03();
        } else {
            AA8 A022 = A02(r9);
            A022.A0A(r9);
            if (r10 == null || !(A022 instanceof C387529mM)) {
                A022.A07();
            } else {
                C387529mM r7 = (C387529mM) A022;
                C42141BIw bIw = r10.A0C;
                if (bIw != null && (list = bIw.A00) != null && 00k.A0O(list, 0) != null) {
                    int size = r7.A04.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        String C4Z = ((DUJ) r7.A04.get(i)).C4Z();
                        C42141BIw bIw2 = r10.A0C;
                        if (bIw2 == null || (list2 = bIw2.A00) == null || (duj = (DUJ) 00k.A0O(list2, 0)) == null) {
                            str = null;
                        } else {
                            str = duj.C4Z();
                        }
                        if (0qQ.A0K(C4Z, str)) {
                            r7.A00 = i;
                            break;
                        }
                        i++;
                    }
                } else {
                    0kD.A07("CanvasTemplatesController", "Selected CanvasTemplatesController with an initialDialElement, but the initialDialElement does not contain an initial template", (Throwable) null);
                }
                r7.A0L();
            }
            this.A0F.A01(A022);
        }
        C355948Rz r22 = this.A01.A02;
        r22.A0P.A00().A0O(!r22.A0E.A0A());
        C355948Rz.A07(r22);
    }

    public final void A08(boolean z) {
        C279284yO r0;
        if (this instanceof AnonymousClass872) {
            this.A05 = false;
            if (z) {
                this.A0J.A00().hide();
                return;
            }
            return;
        }
        if (A0A()) {
            AnonymousClass87G A012 = this.A0H.A01();
            17k.A07(A012, "If a specific create mode was selected, the current dial element should not be null.");
            A02(A012).A0E(true);
        }
        this.A05 = false;
        if (z) {
            this.A0J.A00().hide();
        }
        C71662eb r1 = this.A0D;
        if (r1.A04()) {
            C315596kB.A08(new View[]{r1.A01()}, true);
        }
        AnonymousClass29Q r5 = 27p.A01(this.A0C).A07;
        0wc r2 = r5.A01;
        0Aj A002 = r2.A00(r2.A00, "ig_camera_end_session");
        if (A002.isSampled()) {
            A002.AAJ("entity", "CREATE_MODE");
            A002.AAJ("legacy_falco_event_name", "IG_CAMERA_END_CREATE_MODE_SESSION");
            AnonymousClass283 r3 = r5.A04;
            String str = r3.A0L;
            if (str == null) {
                str = "";
            }
            A002.AAJ("camera_session_id", str);
            int i = 2;
            if (r3.A01 != 2) {
                i = 1;
            }
            A002.A8k("camera_position", Integer.valueOf(i));
            C357638Yz r02 = r3.A0E;
            if (r02 == null || (r0 = (C279284yO) r02.A08.A00) == null) {
                r0 = AnonymousClass9QA.A00;
            }
            A002.A8M(r0.A00, "camera_destination");
            A002.A8M(r5.A0I(), "capture_type");
            A002.A8M(r3.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.A8k("event_type", 2);
            A002.A8M(r3.A0A, "media_type");
            A002.AAJ("module", 27x.A08.getModuleName());
            A002.A8M(C59725JVj.CREATE, "surface");
            A002.A9F("capture_format_index", 0L);
            A002.AAe("camera_tools_struct", r5.A0N(0));
            A002.AAJ("discovery_session_id", r3.A0O);
            A002.AAJ("search_session_id", r3.A0P);
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.AAJ("device_aspect_ratio_category", C254473sX.A00);
            A002.AAJ("device_fold_orientation", C254483sY.A00);
            A002.AAJ("device_fold_state", C254493sZ.A00);
            A002.A7p("device_is_in_multi_window_mode", C254503sa.A00);
            A002.Cgf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r5 == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(boolean r5) {
        /*
            r4 = this;
            X.87B r3 = r4.A0F
            boolean r2 = r4.A04
            android.view.View r1 = r3.A01
            if (r1 == 0) goto L_0x001f
            r0 = 8
            if (r5 == 0) goto L_0x000d
            r0 = 0
        L_0x000d:
            r1.setVisibility(r0)
            X.2eb r1 = r3.A08
            boolean r0 = r1.A04()
            if (r2 == 0) goto L_0x0020
            if (r0 == 0) goto L_0x001f
        L_0x001a:
            r0 = 8
        L_0x001c:
            r1.A03(r0)
        L_0x001f:
            return
        L_0x0020:
            if (r0 == 0) goto L_0x001f
            r0 = 0
            if (r5 != 0) goto L_0x001c
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3509386y.A09(boolean):void");
    }

    public final boolean A0A() {
        if (this.A05) {
            AnonymousClass87G A012 = this.A0H.A01();
            A012.getClass();
            if (A01(A012)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A0B() {
        if (this.A00 != null) {
            AnonymousClass876 r2 = this.A0H;
            if (r2.A01() != null) {
                AnonymousClass87I r1 = this.A00.A04;
                if (r1 == null) {
                    r1 = AnonymousClass87I.EMPTY;
                }
                AnonymousClass87I r0 = r2.A01().A04;
                if (r0 == null) {
                    r0 = AnonymousClass87I.EMPTY;
                }
                if (!r1.equals(r0)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean A76(Object obj, Object obj2) {
        if (obj != AnonymousClass80V.MEDIA_EDIT) {
            return true;
        }
        if (((obj2 instanceof AnonymousClass8SD) || (obj2 instanceof AnonymousClass8TY) || (obj2 instanceof AnonymousClass8TZ)) && A0A()) {
            return false;
        }
        if (!(obj2 instanceof AnonymousClass8T3)) {
            return true;
        }
        AnonymousClass876 r1 = this.A0H;
        if (r1.A01() == null || !A0A() || !A02(r1.A01()).A0I()) {
            return true;
        }
        return A02(r1.A01()).A0F();
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        AnonymousClass80V r6 = (AnonymousClass80V) obj2;
        switch (((AnonymousClass80V) obj).ordinal()) {
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
            case 30:
            case 56:
                this.A04 = false;
                if (r6 != AnonymousClass80V.MEDIA_EDIT) {
                    C71662eb r1 = this.A0F.A08;
                    if (r1.A04()) {
                        r1.A03(0);
                        break;
                    }
                }
                break;
        }
        switch (r6.ordinal()) {
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 25:
            case 27:
            case 30:
            case 56:
                this.A04 = true;
                C71662eb r12 = this.A0F.A08;
                if (r12.A04()) {
                    r12.A03(8);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void Dtk(Object obj) {
        if (((AnonymousClass80V) obj).ordinal() == 11) {
            AnonymousClass876 r1 = this.A0H;
            if (r1.A01() != null && A0A() && A02(r1.A01()).A0I()) {
                this.A0F.A09.A03();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void Dto(Object obj) {
        if (((AnonymousClass80V) obj).ordinal() == 11) {
            AnonymousClass876 r1 = this.A0H;
            if (r1.A01() == null || !A0A() || !A02(r1.A01()).A0I()) {
                this.A0K.E3H(new Object());
            }
        }
    }

    public final void onPause() {
        AnonymousClass87D r1 = this.A0F.A09;
        if (r1.A08) {
            r1.A03();
        }
    }

    public C3509386y(View view, AnonymousClass0iw r15, AnonymousClass3E6 r16, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass80D r18, C3508086k r19, AnonymousClass80U r20, C3499982t r21) {
        AnonymousClass874 r2;
        boolean z;
        OpenCarouselCaptureConfig openCarouselCaptureConfig;
        AnonymousClass80D r1 = r18;
        r1.A0M.getClass();
        Fragment fragment = r1.A0M;
        this.A0A = fragment;
        Context requireContext = fragment.requireContext();
        this.A06 = requireContext;
        this.A0B = r15;
        this.A0J = r19;
        this.A0I = new AnonymousClass870(this);
        UserSession userSession = r1.A0S;
        this.A0C = userSession;
        if (this instanceof AnonymousClass872) {
            r2 = new C3509987e((AnonymousClass872) this);
        } else {
            r2 = new AnonymousClass873(this);
        }
        this.A0H = new AnonymousClass876(requireContext, r15, userSession, r2);
        AnonymousClass80U r11 = r20;
        this.A0K = r11;
        ((AnonymousClass80T) r11).A01.A01(this, AnonymousClass80V.MEDIA_EDIT);
        r11.A7w(this);
        View view2 = view;
        this.A07 = view;
        this.A09 = AnonymousClass07i.A00(fragment);
        this.A08 = fragment.getParentFragmentManager();
        this.A0O = r21;
        C71662eb r9 = new C71662eb((ViewStub) view.findViewById(R.id.canvas_action_button_container_stub));
        this.A0D = r9;
        AnonymousClass87A r10 = new AnonymousClass87A(this);
        if (r1.A1I == null && r1.A1S == null && ((openCarouselCaptureConfig = r1.A0b) == null || openCarouselCaptureConfig.A02 == null)) {
            z = false;
        } else {
            z = true;
        }
        this.A0F = new AnonymousClass87B(requireContext, view2, r16, r9, r10, r11, z);
        this.A0N = r1.A17.A04;
        this.A0E = targetViewSizeProvider;
        this.A00 = r1.A0N;
        this.A0L = r1.A30;
        this.A0G = new AnonymousClass87H(this);
        Map map = this.A0M;
        map.put(AnonymousClass87I.POLL, C314666ie.A00(new AnonymousClass87J(this), new C314656id[0]));
        map.put(AnonymousClass87I.QUESTIONS, C314666ie.A00(new AnonymousClass87K(this), new C314656id[0]));
        map.put(AnonymousClass87I.QUIZ, C314666ie.A00(new AnonymousClass87L(this), new C314656id[0]));
        map.put(AnonymousClass87I.COUNTDOWN, C314666ie.A00(new AnonymousClass87M(this), new C314656id[0]));
        map.put(AnonymousClass87I.SHOUTOUT, C314666ie.A00(new AnonymousClass87N(this), new C314656id[0]));
        map.put(AnonymousClass87I.GIFS, C314666ie.A00(new AnonymousClass87O(this), new C314656id[0]));
        map.put(AnonymousClass87I.MEMORIES, C314666ie.A00(new AnonymousClass87P(this), new C314656id[0]));
        map.put(AnonymousClass87I.TEMPLATES, C314666ie.A00(new AnonymousClass87Q(this), new C314656id[0]));
        map.put(AnonymousClass87I.MENTIONS, C314666ie.A00(new AnonymousClass87R(this), new C314656id[0]));
        map.put(AnonymousClass87I.FUNDRAISER, C314666ie.A00(new AnonymousClass87S(this), new C314656id[0]));
        map.put(AnonymousClass87I.ELECTIONS, C314666ie.A00(new AnonymousClass87T(this), new C314656id[0]));
        map.put(AnonymousClass87I.SUPPORT_PERSONALIZED_ADS, C314666ie.A00(new AnonymousClass87U(this), new C314656id[0]));
        map.put(AnonymousClass87I.END_OF_YEAR, C314666ie.A00(new AnonymousClass87V(this), new C314656id[0]));
        map.put(AnonymousClass87I.BIRTHDAY_HIGHLIGHTS, C314666ie.A00(new AnonymousClass87W(this), new C314656id[0]));
        List list = this.A0L;
        if (list != null && !list.isEmpty()) {
            map.put(AnonymousClass87I.SUPERLATIVE, C314666ie.A00(new C41392AtE(this, list), new C314656id[0]));
        }
        map.put(AnonymousClass87I.QUICK_SNAP_AUDIENCE_MEMBER, C314666ie.A00(new AnonymousClass87X(), new C314656id[0]));
        map.put(AnonymousClass87I.QUICK_SNAP_CLOSE_FRIENDS_AUDIENCE, C314666ie.A00(new AnonymousClass87Y(), new C314656id[0]));
        map.put(AnonymousClass87I.QUICK_SNAP_AUDIENCE_SELECTOR_ENTRYPOINT, C314666ie.A00(new AnonymousClass87Z(), new C314656id[0]));
        map.put(AnonymousClass87I.TYPE, C314666ie.A00(new C3509587a(this), new C314656id[0]));
    }

    public final void A05() {
        Drawable drawable;
        AnonymousClass87H r2;
        if (A0A()) {
            AnonymousClass876 r22 = this.A0H;
            AnonymousClass87G A012 = r22.A01();
            17k.A07(A012, "If a specific create mode was selected, the current dial element should not be null.");
            AA8 A022 = A02(A012);
            ArrayList A0V = this.A01.A03.A1s.A0V(Drawable.class);
            if (AnonymousClass3S1.A04(A0V)) {
                drawable = null;
            } else {
                drawable = (Drawable) A0V.get(0);
            }
            if (A022.A0F()) {
                if (A022 instanceof C387529mM) {
                    C387529mM r3 = (C387529mM) A022;
                    AnonymousClass87H r1 = r3.A08;
                    r1.A08(r3.A03);
                    r1.A08(r3.A02);
                } else if (A022 instanceof C387499mJ) {
                    C387499mJ r32 = (C387499mJ) A022;
                    AnonymousClass87H r23 = r32.A09;
                    r23.A08(drawable);
                    r23.A08(r32.A01);
                    r23.A08(r32.A03);
                    r23.A0E(AnonymousClass87I.MENTIONS, (1Xj) r32.A04.get(r32.A00));
                } else {
                    if (A022 instanceof C387509mK) {
                        C387509mK r33 = (C387509mK) A022;
                        r2 = r33.A0A;
                        r2.A0E(AnonymousClass87I.MEMORIES, r33.A05);
                    } else if (A022 instanceof C387559mP) {
                        r2 = ((C387559mP) A022).A06;
                    }
                    AnonymousClass8S4 r24 = r2.A00.A01;
                    r24.A08.A0u(new AWF(r24, true));
                }
            } else if (A022.A0I()) {
                this.A0F.A00();
                A02(r22.A01()).A0C(((AnonymousClass80T) this.A0K).A01);
                return;
            } else if (A022.A0J(drawable, ((AnonymousClass80T) this.A0K).A01)) {
                this.A01.A00();
                return;
            } else {
                return;
            }
        }
        this.A0K.E3H(new Object());
    }
}
