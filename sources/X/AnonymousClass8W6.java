package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.8W6  reason: invalid class name */
public final class AnonymousClass8W6 implements AnonymousClass4DR, C352918Fo {
    public C357028Wd A00;
    public AnonymousClass8WX A01;
    public boolean A02;
    public boolean A03;
    public final UserSession A04;
    public final C357638Yz A05;
    public final C3510387i A06;
    public final AnonymousClass8QA A07;
    public final AnonymousClass8K4 A08;
    public final C355948Rz A09;
    public final AnonymousClass8BA A0A;
    public final C352888Fl A0B;
    public final AnonymousClass85X A0C;
    public final C3499582p A0D;
    public final C3509286x A0E;
    public final AnonymousClass80D A0F;
    public final C3496481e A0G;
    public final C356848Vl A0H;
    public final C353398Hl A0I;
    public final C342887pK A0J;
    public final AnonymousClass8E5 A0K;
    public final AnonymousClass80U A0L;
    public final C353508Hx A0M;
    public final AnonymousClass88F A0N;
    public final Activity A0O;
    public final AnonymousClass4DH A0P;
    public final AnonymousClass84E A0Q;
    public final AnonymousClass8S5 A0R;
    public final AnonymousClass8QN A0S;
    public final AnonymousClass8FA A0T;
    public final AnonymousClass8W5 A0U;
    public final AnonymousClass8VZ A0V;
    public final AnonymousClass8AL A0W;
    public final AnonymousClass8DD A0X;
    public final AnonymousClass8DB A0Y;
    public final C356918Vs A0Z;
    public final AnonymousClass8H9 A0a;
    public final C352848Fg A0b;
    public final C3497281m A0c;
    public final AnonymousClass8H3 A0d;
    public final AnonymousClass8H7 A0e;
    public final AnonymousClass8H5 A0f;
    public final AnonymousClass8PZ A0g;
    public final AnonymousClass88B A0h;
    public final C351818An A0i;
    public final C352828Fe A0j;

    /* JADX WARNING: type inference failed for: r10v6, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public final void A04(C352218Cl r46) {
        Activity activity;
        UserSession userSession;
        Medium A032;
        AnonymousClass8Fi r2;
        AnonymousClass87G A0D2;
        boolean z;
        AnonymousClass8Ho r3;
        C353438Hq r8;
        C352218Cl r1 = r46;
        this.A0K.A00().Cme(r1);
        if (this.A05.A08.A00 instanceof AnonymousClass9QA) {
            C353398Hl r4 = this.A0I;
            C352888Fl r9 = this.A0B;
            C340297l2 r32 = r9.A06;
            if (r32 != null) {
                z = r32.A0U();
            } else {
                z = false;
            }
            C41832B2n b2n = r4.A01;
            AnonymousClass8Ho r82 = null;
            if (b2n != null) {
                r3 = b2n.BN9();
            } else {
                r3 = null;
            }
            if (r3 instanceof C353438Hq) {
                if (b2n != null) {
                    r82 = b2n.BN9();
                }
                if ((r82 instanceof C353438Hq) && (r8 = (C353438Hq) r82) != null) {
                    UserSession userSession2 = r8.A08;
                    Context context = r8.A07;
                    if (C362988ir.A01(context.getApplicationContext(), userSession2)) {
                        1pd.A00(C362988ir.A00()).A00(context, userSession2, new C40620Afi(r8, z), "GlassesStoryViewListener_SEND_STREAM_ENDING_LIFECYCLE_EVENT_ON_VIDEO_END_CALLBACK");
                    }
                }
            }
            C340297l2 r33 = r9.A06;
            if (r33 != null && r33.A0U()) {
                r1.A01().A03 = AnonymousClass000.A00(2844);
            }
        }
        AnonymousClass80D r7 = this.A0F;
        boolean z2 = false;
        if (r7.A3R) {
            this.A0V.A02(this.A0i, r1);
        } else {
            AnonymousClass8H3 r6 = this.A0d;
            if (r6.A08.A0V(C358088aL.A0p)) {
                AnonymousClass8H3.A02(new C365798nh(r1), r6);
            } else {
                AnonymousClass8H5 r42 = this.A0f;
                if (r42.A0B) {
                    AnonymousClass8H5.A00(new C365798nh(r1), r42);
                } else {
                    AnonymousClass8H7 r34 = this.A0e;
                    if (r34.A09) {
                        String A062 = r1.A06();
                        int i = (int) r34.A03;
                        Bitmap A0G2 = 1MF.A0G(A062, i, i, i, i, r1.A07, r1.A13);
                        if (A0G2 != null) {
                            activity = r34.A04;
                            0qQ.A06(activity);
                            File file = new File(r1.A06());
                            0qQ.A0B(file, 0);
                            C369908vW r16 = new C369908vW(activity, A0G2, C282665Eg.A03(file, 1, 0), (ImageUrl) null, C354668Mx.ROLL_CALL, (Integer) null, i, i, true, false, false, false);
                            AnonymousClass8BA r11 = r34.A06;
                            AnonymousClass8BA r39 = r11;
                            C369908vW r40 = r16;
                            r39.A0f(r40, AnonymousClass57C.ASSET_PICKER, new C310416b1((AnonymousClass8BH) new AnonymousClass8BG(0.5f, 0.0f), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) new ArrayList(0sr.A1P(new Float[]{Float.valueOf(0.0f), Float.valueOf(activity.getResources().getDimension(R.dimen.birthday_selfie_preview_margin_top))})), 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 0, false, true, false, false, true, false, false, false, false, true, true, false, false, false), "rollcall_v2_photo_sticker", 0sr.A1M(new String[]{"rollcall_v2_photo_sticker"}));
                            ? circularImageView = new CircularImageView(activity, (AttributeSet) null, 0);
                            r34.A08.addView(circularImageView);
                            ViewGroup.LayoutParams layoutParams = circularImageView.getLayoutParams();
                            0qQ.A0C(layoutParams, AnonymousClass000.A00(1));
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                            layoutParams2.setMargins(0, AnonymousClass8H7.A00(activity, R.dimen.birthday_selfie_preview_margin_top), 0, 0);
                            layoutParams2.width = AnonymousClass8H7.A00(activity, R.dimen.birthday_selfie_preview_size);
                            layoutParams2.height = AnonymousClass8H7.A00(activity, R.dimen.birthday_selfie_preview_size);
                            layoutParams2.gravity = 1;
                            C240943Ng.A00(activity, circularImageView);
                            C240943Ng.A01(circularImageView.getDrawable());
                            r34.A00 = r16;
                            File file2 = new File(2RR.A01(), r1.A03().getName());
                            r34.A02 = file2;
                            1MF.A0M(A0G2, file2);
                            userSession = r34.A05;
                            0qQ.A06(userSession);
                            File file3 = r34.A02;
                            if (file3 != null) {
                                A032 = C282665Eg.A03(file3, 1, 0);
                                r2 = r34.A07;
                            }
                            0qQ.A0F("photoBitmapFile");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    } else if (r7.A3m) {
                        AnonymousClass8H9 r35 = this.A0a;
                        String A063 = r1.A06();
                        int i2 = (int) r35.A03;
                        Bitmap A0G3 = 1MF.A0G(A063, i2, i2, i2, i2, r1.A07, r1.A13);
                        if (A0G3 != null) {
                            activity = r35.A04;
                            0qQ.A06(activity);
                            File file4 = new File(r1.A06());
                            0qQ.A0B(file4, 0);
                            C369908vW r162 = new C369908vW(activity, A0G3, C282665Eg.A03(file4, 1, 0), (ImageUrl) null, C354668Mx.CIRCLE, (Integer) null, i2, i2, true, false, false, false);
                            AnonymousClass8BA r112 = r35.A06;
                            String A002 = C273654mx.A00(711);
                            AnonymousClass8BA r392 = r112;
                            C369908vW r402 = r162;
                            r392.A0f(r402, AnonymousClass57C.ASSET_PICKER, new C310416b1((AnonymousClass8BH) new AnonymousClass8BG(0.5f, 0.0f), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) new ArrayList(0sr.A1P(new Float[]{Float.valueOf(0.0f), Float.valueOf(activity.getResources().getDimension(R.dimen.effect_mini_gallery_saved_state_subtitle_margin_top))})), 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 0, false, true, false, false, true, false, false, false, false, true, true, false, false, false), A002, 0sr.A1M(new String[]{A002}));
                            r35.A00 = r162;
                            File file5 = new File(2RR.A01(), r1.A03().getName());
                            r35.A02 = file5;
                            1MF.A0M(A0G3, file5);
                            userSession = r35.A05;
                            0qQ.A06(userSession);
                            File file6 = r35.A02;
                            if (file6 != null) {
                                A032 = C282665Eg.A03(file6, 1, 0);
                                r2 = r35.A07;
                            }
                            0qQ.A0F("photoBitmapFile");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    } else if (r7.A3Z) {
                        C352848Fg r36 = this.A0b;
                        String A064 = r1.A06();
                        int i3 = (int) r36.A03;
                        Bitmap A0G4 = 1MF.A0G(A064, i3, i3, i3, i3, r1.A07, r1.A13);
                        if (A0G4 != null) {
                            activity = r36.A04;
                            0qQ.A06(activity);
                            File file7 = new File(r1.A06());
                            0qQ.A0B(file7, 0);
                            C369908vW r163 = new C369908vW(activity, A0G4, C282665Eg.A03(file7, 1, 0), (ImageUrl) null, C354668Mx.POTATO, (Integer) null, i3, i3, true, false, false, false);
                            AnonymousClass8BA r113 = r36.A07;
                            String A003 = C273654mx.A00(712);
                            AnonymousClass8BA r393 = r113;
                            C369908vW r403 = r163;
                            r393.A0f(r403, AnonymousClass57C.ASSET_PICKER, new C310416b1((AnonymousClass8BH) new AnonymousClass8BG(0.5f, 0.0f), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) new ArrayList(0sr.A1P(new Float[]{Float.valueOf(0.0f), Float.valueOf(activity.getResources().getDimension(R.dimen.clips_editor_stacked_timeline_reorder_mode_thumbnail_height))})), 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 0, false, true, false, false, true, false, false, false, false, true, true, false, false, false), A003, 0sr.A1M(new String[]{A003}));
                            r36.A00 = r163;
                            File file8 = new File(2RR.A01(), r1.A03().getName());
                            r36.A02 = file8;
                            1MF.A0M(A0G4, file8);
                            userSession = r36.A05;
                            0qQ.A06(userSession);
                            File file9 = r36.A02;
                            if (file9 != null) {
                                A032 = C282665Eg.A03(file9, 1, 0);
                                r2 = r36.A08;
                            }
                            0qQ.A0F("photoBitmapFile");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    } else {
                        C352828Fe r5 = this.A0j;
                        if (r5.A06.A08.A00 == AnonymousClass80K.A00) {
                            int A004 = ((C359028br) r5.A0D.getValue()).A00();
                            r5.A01(1MF.A0G(r1.A06(), A004, A004, A004, A004, r1.A07, r1.A13));
                        } else {
                            this.A0V.A03(r1, false);
                        }
                    }
                    LI5.A00(activity, A032, userSession, r2);
                }
            }
        }
        int i4 = r1.A07;
        int i5 = r1.A09;
        int i6 = r1.A06;
        String str = r1.A0a;
        int i7 = i4 % 90;
        int i8 = i6;
        if (i7 != 0) {
            i8 = i5;
            i5 = i6;
        }
        float f = ((float) i8) / ((float) i5);
        if (f != 0.5625f) {
            String format = String.format("Camera position: %s, %dx%d - %f ", Arrays.copyOf(new Object[]{str, Integer.valueOf(i8), Integer.valueOf(i5), Float.valueOf(f)}, 4));
            0qQ.A07(format);
            0kD.A07(002.A0R("CameraAspectRatioUtil", "_capture_aspect_ratio"), format, (Throwable) null);
        }
        C3499482o r62 = this.A0D.A02;
        if (r62.A0H()) {
            C67000MgY.A01(new C40239AXd(this), this.A04, "remix_compose", "tap", "remix_reply_pre_capture");
        }
        if (r62.A01.A0S) {
            AnonymousClass8DD r12 = this.A0X;
            if (!(r12 == null || (A0D2 = r12.A0D()) == null || A0D2.A04 == AnonymousClass87I.EMPTY)) {
                z2 = true;
            }
            C67000MgY.A00(new C40239AXd(this), this.A04, (Long) null, "selfie_reply_compose", "tap", "selfie_reply_pre_capture", (String) null, Collections.singletonMap("effect_used", String.valueOf(z2)));
        }
    }

    public final void A06(C349307zv r13) {
        AnonymousClass87G A0D2;
        C366678pU A002;
        C39891ADp aDp = C39891ADp.A00;
        02m r0 = 02m.A0p;
        0qQ.A07(r0);
        r0.markerStart(51249153);
        aDp.A01("source", "camera");
        int i = r13.A07;
        02m r02 = 02m.A0p;
        0qQ.A07(r02);
        r02.markerAnnotate(51249153, "video_duration", i);
        C357638Yz r3 = this.A05;
        Object obj = r3.A08.A00;
        if (obj instanceof AnonymousClass80O) {
            this.A0M.DxE(r13);
            return;
        }
        boolean z = true;
        if (obj instanceof AnonymousClass9QA) {
            C340297l2 r03 = this.A0B.A06;
            if (r03 != null && r03.A0A) {
                r13.A02().A03 = AnonymousClass000.A00(2844);
            }
        } else {
            AnonymousClass8H3 r2 = this.A0d;
            if (r2.A08.A0V(C358088aL.A0p)) {
                this.A0L.E3H(new Object());
                AnonymousClass8H3.A02(new C365798nh(r13), r2);
                return;
            }
            C352888Fl r1 = this.A0B;
            if (r1.A0W()) {
                this.A0K.A00().DxE(r13);
                return;
            } else if (r1.A18.A00().CVH()) {
                this.A0K.A00().DxE(r13);
            } else {
                AnonymousClass8H5 r22 = this.A0f;
                if (r22.A0B) {
                    AnonymousClass8DD r04 = this.A0X;
                    if (r04 == null || (A0D2 = r04.A0D()) == null || A0D2.A04 == AnonymousClass87I.EMPTY) {
                        z = false;
                    }
                    UserSession userSession = this.A04;
                    C67000MgY.A00(new C40239AXd(this), userSession, Long.valueOf(((long) r13.A07) / 1000), "selfie_reply_compose", "tap_and_hold", "selfie_reply_pre_capture", (String) null, Collections.singletonMap("effect_used", String.valueOf(z)));
                    AnonymousClass8H5.A00(new C365798nh(r13), r22);
                    this.A0L.E3H(new Object());
                    return;
                }
            }
        }
        AnonymousClass80U r23 = this.A0L;
        AnonymousClass80X Ats = r23.Ats();
        AnonymousClass80X r12 = AnonymousClass80X.POST_CAPTURE;
        if (Ats != r12 || !r3.A0V(C358088aL.A0B)) {
            if (r23.Ats() == r12 && r3.A0V(C358088aL.A0D)) {
                this.A0R.A06(new C365798nh(r13));
            }
            this.A0V.A04(r13);
            if (this.A0D.A02.A0H()) {
                C67000MgY.A00(new C40239AXd(this), this.A04, Long.valueOf(((long) r13.A07) / 1000), "remix_compose", "tap_and_hold", "remix_reply_pre_capture", (String) null, (Map) null);
                return;
            }
            return;
        }
        if (C305756Jk.A00(this.A0P.requireContext())) {
            AnonymousClass8QA r5 = this.A07;
            String A072 = r13.A07();
            0qQ.A0B(A072, 0);
            if (r5.A03) {
                C365758nd A012 = r5.A0F.A02.A01();
                int ordinal = A012.ordinal();
                if (ordinal == 0) {
                    A002 = AnonymousClass9U9.A00(r5.A0B.A0P(), r5.A0A.A0G(), r5.A0I.EK0());
                } else if (ordinal == 1) {
                    A002 = new C366678pU(r5.A0B.A0P(), (C364758lx) null, r5.A0D.A00(), r5.A0I.EK0(), true);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown captured media type ");
                    sb.append(A012);
                    throw new UnsupportedOperationException(sb.toString());
                }
                AnonymousClass8QE r05 = r5.A0H;
                0qQ.A0B(A002, 1);
                r05.A00.put(A072, A002);
            }
        }
        this.A0R.A06(new C365798nh(r13));
    }

    public static final C362868ic A00(AnonymousClass8W6 r0) {
        AnonymousClass8WX r02 = r0.A01;
        if (r02 != null) {
            return r02.A00().A01;
        }
        0qQ.A0F("creationGallerySurfaceControllerProvider");
        throw AnonymousClass00P.createAndThrow();
    }

    private final boolean A01() {
        C362868ic A002;
        if ((this.A05.A08.A00 instanceof AnonymousClass9QA) && (A002 = A00(this)) != null && A002.A00 == 0.0f) {
            UserSession userSession = this.A04;
            if (C3505585e.A00(this.A0G.A00.A01, userSession) == AnonymousClass05K.A00 && 182.A06(0Tu.A05, userSession, 36330707450086115L)) {
                C362868ic A003 = A00(this);
                if (A003 != null) {
                    A003.A02(true);
                }
                return true;
            }
        }
        return false;
    }

    public final void A03() {
        AnonymousClass87G A0D2;
        C357638Yz r4 = this.A05;
        if (r4.A08.A00 instanceof AnonymousClass80O) {
            this.A0M.Dy3();
            C3510387i.A01(this.A06);
        }
        C355948Rz r2 = this.A09;
        if (r2.A02) {
            r2.A0N.E3H(new Object());
            r2.A02 = false;
        }
        AnonymousClass85X r0 = this.A0C;
        r0.A0K = false;
        AnonymousClass85X.A06(r0);
        this.A0I.A08(false);
        AnonymousClass8DD r02 = this.A0X;
        if (r02 == null || (A0D2 = r02.A0D()) == null || A0D2.A04 == AnonymousClass87I.EMPTY) {
            boolean A0V2 = r4.A0V(C358088aL.A0B);
            AnonymousClass8AL r03 = this.A0W;
            if (A0V2) {
                r03.A0C(false);
            } else {
                r03.A0B(false);
            }
        } else {
            this.A0W.A0C(false);
            ((C353318Hd) this.A0Y.A00.A00()).Etn(true, true);
        }
    }

    public final void A05(C352218Cl r3) {
        this.A0D.A02.A07(new C365798nh(r3));
        AnonymousClass8QA r1 = this.A07;
        r1.A0E(false);
        AnonymousClass8K4 r0 = this.A08;
        r0.A0H();
        r0.A0I(r1);
    }

    public final boolean A07() {
        if (this.A0H.A00().A02 == 3) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01e5, code lost:
        if (r0 == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e7, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x021a, code lost:
        if (r5.A0Q() != false) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0309, code lost:
        if (r1 != 58) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010b, code lost:
        if ((r2 instanceof X.AnonymousClass80M) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0113, code lost:
        if (r1 != X.AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0127 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r13 = this;
            X.8Hl r3 = r13.A0I
            r6 = 1
            r8 = 11
            r3.A09(r6)
            X.80U r9 = r13.A0L
            X.80V r0 = X.AnonymousClass80V.MEDIA_EDIT
            boolean r0 = r9.CQ0(r0)
            if (r0 != 0) goto L_0x001a
            X.80V r0 = X.AnonymousClass80V.VIDEO_RECORDING
            boolean r0 = r9.CQ0(r0)
            if (r0 == 0) goto L_0x002f
        L_0x001a:
            X.8Yz r0 = r3.A0A
            X.80m r2 = r0.A08
            java.lang.Object r1 = r2.A00
            X.9QA r0 = X.AnonymousClass9QA.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r2.A00
            X.4yO r0 = (X.C279284yO) r0
            X.C353398Hl.A02(r0, r3)
        L_0x002f:
            boolean r7 = r13.A03
            r2 = 0
            r13.A03 = r2
            X.8Vl r0 = r13.A0H
            X.8Vm r0 = r0.A00()
            int r0 = r0.A02
            if (r0 != r6) goto L_0x003f
            return r2
        L_0x003f:
            X.8PZ r1 = r13.A0g
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x0049
            X.AnonymousClass8PZ.A00(r1, r2)
        L_0x0048:
            return r6
        L_0x0049:
            X.8Vs r0 = r13.A0Z
            boolean r0 = r0.onBackPressed()
            if (r0 != 0) goto L_0x0048
            X.80V r0 = X.AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE
            boolean r0 = r9.CQ0(r0)
            if (r0 != 0) goto L_0x0089
            X.8W5 r0 = r13.A0U
            X.80R r0 = r0.A00
            X.6if r1 = r0.A1y
            if (r1 == 0) goto L_0x0089
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0089
            java.lang.Object r5 = r1.get()
            X.8cb r5 = (X.C359318cb) r5
            X.8ZP r0 = r5.A0q
            X.1QP r4 = r0.A02
            long r0 = r0.A01
            java.lang.String r3 = "REELS_POST_CAPTURE_BACK_TAPPED"
            r4.flowMarkPoint(r0, r3)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r5.A0s
            X.2Fk r0 = r0.A0C
            java.lang.Object r0 = r0.A02()
            X.8fx r0 = (X.C361278fx) r0
            if (r0 == 0) goto L_0x0089
            boolean r0 = r0.A01()
            if (r0 != r6) goto L_0x0089
            return r6
        L_0x0089:
            X.8QN r1 = r13.A0S
            X.8QZ r0 = r1.A0c
            X.8Qe r0 = r0.A06
            boolean r0 = r0.CLA()
            if (r0 != 0) goto L_0x0048
            int r0 = r1.A00
            if (r0 > 0) goto L_0x0048
            X.8BA r0 = r13.A0A
            boolean r0 = r0.A0r()
            if (r0 != 0) goto L_0x0048
            X.8Fl r3 = r13.A0B
            X.8HG r0 = r3.A08
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0M
            int r0 = r0.get()
            if (r0 == r6) goto L_0x0048
            X.80U r10 = r3.A1C
            X.80V r0 = X.AnonymousClass80V.PHOTO_CAPTURING
            boolean r0 = r10.CQ0(r0)
            if (r0 != 0) goto L_0x0048
            X.8Gi r4 = r3.A0m
            com.instagram.ui.widget.shutterbutton.ShutterButton r0 = r4.A0V
            X.5zl r0 = r0.A0i
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x0442
            X.80U r1 = r4.A0S
            X.80V r0 = X.AnonymousClass80V.VIDEO_RECORDING
            boolean r0 = r1.CQ0(r0)
            if (r0 != 0) goto L_0x0442
            X.JYD r5 = r3.A0C
            X.80X r1 = r10.Ats()
            X.80X r0 = X.AnonymousClass80X.PRE_CAPTURE
            if (r1 != r0) goto L_0x0128
            if (r5 == 0) goto L_0x0128
            X.8Yz r1 = r3.A0g
            X.8aL r0 = X.C358088aL.A0T
            X.8aL r10 = X.C358088aL.A0z
            X.8aL[] r0 = new X.C358088aL[]{r0, r10}
            boolean r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x0128
            float r1 = r3.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0115
            X.JYl r4 = r5.A0M
            int r0 = r4.getItemCount()
            if (r0 != 0) goto L_0x03b4
            X.8Yz r0 = r5.A0J
            r0.A0M(r10)
            X.80m r0 = r0.A08
            java.lang.Object r2 = r0.A00
            X.80U r0 = r5.A0R
            X.80V r1 = r0.Atr()
            boolean r0 = r2 instanceof X.AnonymousClass9QA
            if (r0 != 0) goto L_0x010d
            boolean r0 = r2 instanceof X.AnonymousClass80M
            if (r0 == 0) goto L_0x0048
        L_0x010d:
            X.80V r0 = X.AnonymousClass80V.CAPTURE
            if (r1 == r0) goto L_0x0115
            X.80V r0 = X.AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY
            if (r1 != r0) goto L_0x0048
        L_0x0115:
            X.8Hx r3 = r13.A0M
            X.8IY r0 = r3.AuT()
            X.8IX r1 = r0.A01
            X.8IX r0 = X.AnonymousClass8IX.BLOCKED_TOAST
            if (r1 != r0) goto L_0x0163
            boolean r0 = r3.onBackPressed()
            if (r0 == 0) goto L_0x0163
            return r6
        L_0x0128:
            X.82W r0 = r3.A0Z
            X.82X r0 = r0.A00()
            com.instagram.camera.effect.mq.IgCameraEffectsController r0 = r0.A05
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A09
            if (r0 == 0) goto L_0x0115
            java.util.Map r1 = r0.A0Z
            java.lang.String r0 = "nativeUIControlEditableText"
            java.lang.Object r0 = r1.get(r0)
            if (r0 != 0) goto L_0x0146
            java.lang.String r0 = "nativeUIControlRawTextInput"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0115
        L_0x0146:
            X.8G2 r2 = r3.A12
            X.8yk r0 = r2.A00
            if (r0 != 0) goto L_0x0150
            X.B1r r0 = r2.A02
            if (r0 == 0) goto L_0x0115
        L_0x0150:
            r2.DDS()
            java.lang.String r1 = ""
            X.8yk r0 = r2.A00
            if (r0 == 0) goto L_0x015c
            r0.onTextEditComplete(r1)
        L_0x015c:
            r0 = 0
            r2.A00 = r0
            X.AnonymousClass8G2.A00(r2)
            return r6
        L_0x0163:
            X.8WX r0 = r13.A01
            if (r0 == 0) goto L_0x03b1
            X.8XA r0 = r0.A00()
            X.8hG r4 = r0.A02
            if (r4 == 0) goto L_0x0228
            X.87s r2 = r4.A13
            X.4gw r0 = r2.A04
            if (r0 == 0) goto L_0x0178
            X.C362048hG.A0C(r4)
        L_0x0178:
            X.0eM r0 = r4.A1L
            java.lang.Object r1 = r0.getValue()
            X.7jJ r1 = (X.C339257jJ) r1
            X.LOZ r0 = r1.A00
            if (r0 == 0) goto L_0x018b
            r0.A01()
            r0 = 0
            r1.A00 = r0
            return r6
        L_0x018b:
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x0226
            X.8XA r5 = r4.A0w
            X.8Yz r0 = r5.A0G
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x021d
            com.instagram.common.session.UserSession r0 = r5.A0F
            boolean r0 = X.AnonymousClass8IK.A06(r0)
            if (r0 == 0) goto L_0x021d
            X.4DH r10 = r5.A0B
            X.0hq r1 = r10.getChildFragmentManager()
            r0 = 2131431251(0x7f0b0f53, float:1.8484226E38)
            androidx.fragment.app.Fragment r11 = r1.A0P(r0)
            X.0hq r1 = r10.getChildFragmentManager()
            r0 = 2131430030(0x7f0b0a8e, float:1.848175E38)
            androidx.fragment.app.Fragment r10 = r1.A0P(r0)
            if (r11 == 0) goto L_0x01fc
            boolean r0 = r11.isVisible()
            if (r0 == 0) goto L_0x01fc
            java.lang.String r1 = r11.mTag
            r0 = 4330(0x10ea, float:6.068E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x01df
            java.lang.String r1 = r11.mTag
            r0 = 4332(0x10ec, float:6.07E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01fc
        L_0x01df:
            X.4DR r11 = (X.AnonymousClass4DR) r11
        L_0x01e1:
            boolean r0 = r11.onBackPressed()
        L_0x01e5:
            if (r0 == 0) goto L_0x0226
        L_0x01e7:
            r1 = 1
        L_0x01e8:
            X.8QZ r0 = r4.A16
            X.8Qe r0 = r0.A06
            boolean r0 = r0.CLA()
            if (r1 != 0) goto L_0x01f4
            if (r0 == 0) goto L_0x0228
        L_0x01f4:
            X.4gw r0 = r2.A04
            if (r0 == 0) goto L_0x0048
            r2.A0F()
            return r6
        L_0x01fc:
            if (r10 == 0) goto L_0x0216
            boolean r0 = r10.isVisible()
            if (r0 == 0) goto L_0x0216
            java.lang.String r1 = r10.mTag
            r0 = 4331(0x10eb, float:6.069E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0216
            r11 = r10
            X.4DR r11 = (X.AnonymousClass4DR) r11
            goto L_0x01e1
        L_0x0216:
            boolean r0 = r5.A0Q()
            if (r0 == 0) goto L_0x021d
            goto L_0x01e7
        L_0x021d:
            X.8W6 r0 = r5.A0L
            X.8Hx r0 = r0.A0M
            boolean r0 = r0.DHN()
            goto L_0x01e5
        L_0x0226:
            r1 = 0
            goto L_0x01e8
        L_0x0228:
            X.8ic r0 = A00(r13)
            if (r0 == 0) goto L_0x0239
            X.2gO r1 = r0.A02
            if (r1 == 0) goto L_0x0239
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.onChanged(r0)
        L_0x0239:
            X.8ic r0 = A00(r13)
            if (r0 == 0) goto L_0x02c7
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x02c7
            X.81e r0 = r13.A0G
            X.80R r5 = r0.A00
            X.28D r2 = r5.A01
            X.8Yz r4 = r13.A05
            X.80m r0 = r4.A08
            java.lang.Object r1 = r0.A00
            X.80N r0 = X.AnonymousClass80N.A00
            r12 = 0
            if (r1 != r0) goto L_0x0258
            r12 = 1
        L_0x0258:
            com.instagram.common.session.UserSession r1 = r13.A04
            boolean r11 = X.C3505485d.A01(r2, r1)
            X.28D r10 = r5.A01
            X.4yO r5 = r5.A02
            X.8WX r0 = r13.A01
            if (r0 == 0) goto L_0x03b1
            X.8XA r0 = r0.A00()
            X.8Hx r0 = r0.A0a
            boolean r0 = r0.CKX()
            boolean r0 = X.AnonymousClass8X8.A02(r10, r1, r5, r0)
            if (r0 == 0) goto L_0x028c
            if (r12 == 0) goto L_0x027a
            if (r11 == 0) goto L_0x028c
        L_0x027a:
            X.8aL r0 = X.C358088aL.A0z
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r4.A0V(r0)
            if (r0 != 0) goto L_0x028c
            boolean r0 = r3.CVJ()
            if (r0 == 0) goto L_0x02c7
        L_0x028c:
            X.27r r4 = X.27p.A01(r1)
            java.lang.String r0 = "ig_camera_gallery_exit_with_back_button"
            X.0xI r3 = X.27r.A01(r4, r0)
            com.instagram.common.session.UserSession r0 = r4.A03
            X.0xN r0 = X.C60510iO.A00(r0)
            r0.EFq(r3)
            X.8WX r0 = r13.A01
            if (r0 == 0) goto L_0x03b1
            X.8XA r0 = r0.A00()
            r0.A0M(r6)
            X.28D r0 = X.28D.A0t
            if (r2 == r0) goto L_0x02ba
            X.28D r0 = X.28D.A1M
            if (r2 == r0) goto L_0x02ba
            X.28D r0 = X.28D.A3U
            if (r2 == r0) goto L_0x02ba
            X.28D r0 = X.28D.A3T
            if (r2 != r0) goto L_0x0048
        L_0x02ba:
            android.app.Activity r0 = r13.A0O
            r0.finish()
            X.27r r0 = X.27p.A01(r1)
            r0.A0W()
            return r6
        L_0x02c7:
            X.84E r0 = r13.A0Q
            if (r0 == 0) goto L_0x02d9
            X.WJp r1 = r0.A07
            if (r1 == 0) goto L_0x02d9
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x02d9
            r1.A01()
            return r6
        L_0x02d9:
            X.4DH r2 = r13.A0P
            X.0hq r1 = r2.getChildFragmentManager()
            r0 = 2131432761(0x7f0b1539, float:1.8487289E38)
            androidx.fragment.app.Fragment r1 = r1.A0P(r0)
            boolean r0 = r1 instanceof X.AnonymousClass8ZV
            if (r0 == 0) goto L_0x02f3
            X.8ZV r1 = (X.AnonymousClass8ZV) r1
            boolean r0 = r1.onBackPressed()
            if (r0 == 0) goto L_0x02f3
            return r6
        L_0x02f3:
            X.80V r0 = r9.Atr()
            int r1 = r0.ordinal()
            if (r1 == r8) goto L_0x036a
            r0 = 39
            if (r1 == r0) goto L_0x0048
            r0 = 2
            if (r1 == r0) goto L_0x0337
            r0 = 3
            if (r1 == r0) goto L_0x0337
            r0 = 58
            if (r1 == r0) goto L_0x0048
        L_0x030b:
            if (r7 != 0) goto L_0x034d
            X.80D r0 = r13.A0F
            boolean r0 = r0.A3k
            if (r0 != 0) goto L_0x034d
            X.86x r3 = r13.A0E
            boolean r0 = r3.A0A()
            if (r0 == 0) goto L_0x034d
            X.876 r0 = r3.A0H
            X.87G r1 = r0.A01()
            java.lang.String r0 = "If a specific create mode was selected, the current dial element should not be null."
            X.17k.A07(r1, r0)
            X.AA8 r1 = r3.A02(r1)
            X.80U r0 = r3.A0K
            X.80T r0 = (X.AnonymousClass80T) r0
            X.80W r0 = r0.A01
            boolean r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x034d
            return r6
        L_0x0337:
            if (r7 != 0) goto L_0x0346
            X.8E5 r0 = r13.A0K
            X.8Zl r0 = r0.A00()
            boolean r0 = r0.onBackPressed()
            if (r0 == 0) goto L_0x0346
            return r6
        L_0x0346:
            boolean r0 = r3.onBackPressed()
            if (r0 == 0) goto L_0x030b
            return r6
        L_0x034d:
            X.80D r0 = r13.A0F
            boolean r0 = r0.A3X
            if (r0 == 0) goto L_0x035b
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            r0.finish()
            return r6
        L_0x035b:
            boolean r0 = r13.A01()
            if (r0 != 0) goto L_0x0048
            X.8Wd r0 = r13.A00
            if (r0 == 0) goto L_0x03c3
            boolean r6 = r0.A01()
            return r6
        L_0x036a:
            X.82p r0 = r13.A0D
            X.82o r2 = r0.A02
            X.8Yz r0 = r13.A05
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.80N r0 = X.AnonymousClass80N.A00
            if (r1 != r0) goto L_0x038d
            boolean r0 = r3.CTi()
            if (r0 != 0) goto L_0x038d
            boolean r0 = r2.A0C()
            if (r0 != 0) goto L_0x038d
        L_0x0384:
            X.AjQ r0 = new X.AjQ
            r0.<init>(r13)
            r3.CnU(r0)
            return r6
        L_0x038d:
            X.88B r0 = r13.A0h
            X.82i r0 = r0.A00
            if (r0 == 0) goto L_0x03af
            X.8JI r1 = r0.A00
        L_0x0395:
            X.8JI r0 = X.AnonymousClass8JI.REMIX
            if (r1 == r0) goto L_0x0384
            X.8Wd r0 = r13.A00
            if (r0 == 0) goto L_0x03c3
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0048
            X.8Wd r0 = r13.A00
            if (r0 == 0) goto L_0x03c3
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0048
            r6 = 0
            return r6
        L_0x03af:
            r1 = 0
            goto L_0x0395
        L_0x03b1:
            java.lang.String r0 = "creationGallerySurfaceControllerProvider"
            goto L_0x03c5
        L_0x03b4:
            X.8Gz r7 = r5.A0Q
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x03f0
            r7.A01 = r2
            X.S3Z r3 = r7.A00
            if (r3 != 0) goto L_0x03cd
            java.lang.String r0 = "multipleVideoMerger"
            goto L_0x03c5
        L_0x03c3:
            java.lang.String r0 = "backPressDelegate"
        L_0x03c5:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03cd:
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x03e5
            r3.A05 = r6
        L_0x03d3:
            X.2Fj r1 = r7.A02
            X.0gF r0 = X.C60340gF.A00
            r1.A0A(r0)
            X.9cL r1 = X.C381799cL.A02
            X.0qQ.A0B(r1, r2)
            X.2Fj r0 = r7.A03
            r0.A0A(r1)
            return r6
        L_0x03e5:
            android.os.Handler r1 = r3.A08
            X.AlC r0 = new X.AlC
            r0.<init>(r3)
            r1.post(r0)
            goto L_0x03d3
        L_0x03f0:
            java.util.LinkedList r7 = r4.A08
            java.lang.Object r8 = r7.removeLast()
            X.LAc r8 = (X.C63873LAc) r8
            java.lang.String r1 = r8.A06
            if (r1 == 0) goto L_0x0401
            java.util.Map r0 = r4.A09
            r0.remove(r1)
        L_0x0401:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0430
            X.8Gz r3 = r4.A07
            java.util.Iterator r1 = r7.iterator()
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x0410:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0427
            java.lang.Object r0 = r1.next()
            X.LAc r0 = (X.C63873LAc) r0
            X.7zv r0 = r0.A05
            if (r0 == 0) goto L_0x0410
            int r0 = r0.A07
            int r2 = java.lang.Math.min(r2, r0)
            goto L_0x0410
        L_0x0427:
            X.05G r1 = r3.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.Epw(r0)
        L_0x0430:
            android.graphics.Bitmap r0 = r8.A00
            if (r0 == 0) goto L_0x0437
            r0.recycle()
        L_0x0437:
            int r0 = r7.size()
            r4.notifyItemRemoved(r0)
            X.JYD.A07(r5)
            return r6
        L_0x0442:
            java.lang.String r0 = "onBackPressed"
            X.C353118Gi.A02(r4, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8W6.onBackPressed():boolean");
    }

    public final void A02() {
        if (!A01()) {
            this.A03 = true;
            Integer A0N2 = this.A0B.A0N();
            int i = 1;
            if (A0N2 == null || A0N2.intValue() != 1) {
                i = 2;
            }
            UserSession userSession = this.A04;
            AnonymousClass29T r5 = 27p.A01(userSession).A0B;
            AnonymousClass283 r4 = r5.A04;
            if (r4.A0L == null) {
                0kD.A07("IgCameraBaseFalcoLoggerImpl", "logTapCameraExitButton() cameraSession is null", (Throwable) null);
            } else {
                0wc r2 = r5.A01;
                0Aj A002 = r2.A00(r2.A00, "ig_camera_navigation");
                if (A002.isSampled()) {
                    A002.AAJ("step", "CAMERA_EXIT_BUTTON");
                    A002.AAJ("legacy_falco_event_name", "IG_CAMERA_TAP_CAMERA_EXIT_BUTTON");
                    String str = r4.A0L;
                    if (str == null) {
                        str = "";
                    }
                    A002.AAJ("camera_session_id", str);
                    A002.A8k("camera_position", Integer.valueOf(i));
                    A002.A8M(r5.A0I(), "capture_type");
                    A002.A8M(r4.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A002.A8k("event_type", 2);
                    A002.A8M(r4.A0A, "media_type");
                    A002.AAJ("module", 27x.A08.getModuleName());
                    C59725JVj jVj = r4.A0B;
                    if (jVj == null) {
                        jVj = C59725JVj.PRE_CAPTURE;
                    }
                    A002.A8M(jVj, "surface");
                    A002.A9F("capture_format_index", 0L);
                    A002.AAJ("discovery_session_id", r4.A0O);
                    A002.AAJ("search_session_id", r4.A0P);
                    A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                    A002.Cgf();
                }
            }
            if (this.A05.A08.A00 instanceof AnonymousClass80O) {
                C394779yg.A00(userSession).A00(this.A0O, userSession, AnonymousClass05K.A00);
            }
            if (this.A0F.A0b != null) {
                new LRh(userSession, this.A0O).A03();
            }
            this.A0O.onBackPressed();
        }
    }

    public final void D0E() {
        C362868ic A002 = A00(this);
        if (A002 != null) {
            A002.A0E.A0A(A002);
        }
        AnonymousClass8WX r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("creationGallerySurfaceControllerProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        C362048hG r02 = r0.A00().A02;
        if (r02 != null) {
            r02.A0V();
        }
        AnonymousClass8S5 r03 = this.A0R;
        1Wr r3 = 1Wr.A00;
        if (r3 != null) {
            r3.requestLocationUpdates(r03.A09, r03.A0h, "CaptureStateCoordinator");
            this.A0T.A02.Epw(true);
            this.A0c.A00().Ety(this.A0F.A3D);
            this.A0W.A0P.setVisibility(0);
            this.A0M.D0E();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass8W6(AnonymousClass84E r5, C357638Yz r6, C3510387i r7, AnonymousClass8S5 r8, AnonymousClass8QA r9, AnonymousClass8QN r10, AnonymousClass8K4 r11, C355948Rz r12, AnonymousClass8BA r13, C352888Fl r14, AnonymousClass85X r15, C3499582p r16, AnonymousClass8FA r17, C3509286x r18, AnonymousClass80D r19, AnonymousClass8W5 r20, C3496481e r21, AnonymousClass8VZ r22, C356848Vl r23, AnonymousClass8AL r24, AnonymousClass8DD r25, AnonymousClass8DB r26, C356918Vs r27, C353398Hl r28, C342887pK r29, AnonymousClass8E5 r30, AnonymousClass8H9 r31, C352848Fg r32, C3497281m r33, AnonymousClass8H3 r34, AnonymousClass8H7 r35, AnonymousClass8H5 r36, AnonymousClass80U r37, C353508Hx r38, AnonymousClass8PZ r39, AnonymousClass88F r40, AnonymousClass88B r41, C351818An r42, C352828Fe r43) {
        0qQ.A0B(r6, 22);
        C351818An r2 = r42;
        0qQ.A0B(r2, 35);
        AnonymousClass88B r3 = r41;
        0qQ.A0B(r3, 36);
        this.A0R = r8;
        this.A0T = r17;
        this.A0c = r33;
        AnonymousClass80D r1 = r19;
        this.A0F = r1;
        this.A0W = r24;
        this.A0M = r38;
        this.A0E = r18;
        this.A0d = r34;
        this.A0B = r14;
        this.A0H = r23;
        this.A0g = r39;
        this.A0Z = r27;
        this.A0S = r10;
        this.A0A = r13;
        this.A0G = r21;
        this.A0Q = r5;
        this.A0L = r37;
        this.A0K = r30;
        this.A0J = r29;
        this.A0I = r28;
        this.A0D = r16;
        this.A05 = r6;
        this.A0N = r40;
        this.A06 = r7;
        this.A09 = r12;
        this.A0C = r15;
        this.A0X = r25;
        this.A0Y = r26;
        this.A0V = r22;
        this.A07 = r9;
        this.A08 = r11;
        this.A0f = r36;
        this.A0e = r35;
        this.A0b = r32;
        this.A0i = r2;
        this.A0h = r3;
        this.A0U = r20;
        this.A0a = r31;
        this.A0j = r43;
        UserSession userSession = r1.A0S;
        0qQ.A07(userSession);
        this.A04 = userSession;
        Activity activity = r1.A05;
        0qQ.A07(activity);
        this.A0O = activity;
        r1.A0M.getClass();
        AnonymousClass4DH r0 = r1.A0M;
        0qQ.A07(r0);
        this.A0P = r0;
    }
}
