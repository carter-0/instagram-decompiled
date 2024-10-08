package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.widget.progressbar.ClipsReviewProgressBar;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.ui.LoadingSpinnerView;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: X.JXi  reason: case insensitive filesystem */
public final class C59767JXi implements AnonymousClass0iw, AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ClipsReviewController";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Surface A06;
    public TextureView A07;
    public AnonymousClass2gO A08;
    public L92 A09;
    public AnonymousClass8Q3 A0A;
    public C66567MWv A0B;
    public C380359Xr A0C;
    public AnonymousClass831 A0D;
    public AudioOverlayTrack A0E;
    public GIH A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final int A0K;
    public final Context A0L;
    public final View A0M;
    public final ViewGroup A0N;
    public final TextView A0O;
    public final Fragment A0P;
    public final UserSession A0Q;
    public final IgImageView A0R;
    public final TargetViewSizeProvider A0S;
    public final AnonymousClass85O A0T;
    public final AnonymousClass9QY A0U;
    public final C59770JXl A0V = new C59770JXl(this);
    public final C59772JXp A0W;
    public final AnonymousClass8Q2 A0X;
    public final AnonymousClass8A5 A0Y;
    public final C3515789k A0Z;
    public final ClipsCreationViewModel A0a;
    public final C353488Hv A0b;
    public final C352328Cx A0c;
    public final ClipsReviewProgressBar A0d;
    public final LoadingSpinnerView A0e;
    public final 2Nn A0f;
    public final Runnable A0g = new C59768JXj(this);
    public final ConstraintLayout A0h;
    public final AnonymousClass0iw A0i;
    public final CameraToolMenuItem A0j;
    public final C66505MUj A0k;
    public final C355208Pb A0l;
    public final C59771JXo A0m;
    public final AnonymousClass8QO A0n;
    public final AnonymousClass8QW A0o;
    public final AnonymousClass8QZ A0p;
    public final ExecutorService A0q;

    public static final int A00(C59767JXi jXi, int i) {
        if (i != -1) {
            return C63161KsU.A00(jXi.A0V, i);
        }
        return C51966G9m.A06(jXi.A0D.A01);
    }

    public static final void A0A(C59767JXi jXi, boolean z) {
        jXi.A09 = null;
        2Fk r2 = jXi.A0a.A0C;
        AnonymousClass2gO r1 = jXi.A08;
        if (r1 == null) {
            r1 = new C64317LZr(jXi, 7);
            jXi.A08 = r1;
        }
        r2.A08(r1);
        jXi.A0N.removeCallbacks(jXi.A0g);
        C66567MWv mWv = jXi.A0B;
        if (mWv != null) {
            mWv.reset();
        }
        jXi.A0R.setImageDrawable((Drawable) null);
        jXi.A0A.CL9(z);
    }

    public final String getModuleName() {
        return "trim_editor";
    }

    public C59767JXi(Context context, ViewGroup viewGroup, Fragment fragment, AnonymousClass0iw r46, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass85O r49, AnonymousClass9QY r50, AnonymousClass8A5 r51, C3515789k r52, C353488Hv r53, C352328Cx r54, 2Nn r55, ExecutorService executorService) {
        ExecutorService executorService2 = executorService;
        AnonymousClass8A5 r3 = r51;
        AnonymousClass7TF.A1E(r3, 5, executorService2);
        C3515789k r2 = r52;
        0qQ.A0B(r2, 13);
        Context context2 = context;
        this.A0L = context2;
        Fragment fragment2 = fragment;
        this.A0P = fragment2;
        UserSession userSession2 = userSession;
        this.A0Q = userSession2;
        ViewGroup viewGroup2 = viewGroup;
        this.A0N = viewGroup2;
        this.A0Y = r3;
        2Nn r13 = r55;
        this.A0f = r13;
        this.A0q = executorService2;
        this.A0c = r54;
        this.A0U = r50;
        AnonymousClass0iw r12 = r46;
        this.A0i = r12;
        this.A0S = targetViewSizeProvider;
        C353488Hv r14 = r53;
        this.A0b = r14;
        this.A0Z = r2;
        this.A0T = r49;
        C59769JXk jXk = new C59769JXk(this);
        this.A0k = jXk;
        C59766JXh jXh = new C59766JXh(this);
        this.A0l = jXh;
        JXm jXm = new JXm(this);
        this.A0n = jXm;
        JXn jXn = new JXn(this);
        this.A0o = jXn;
        ConstraintLayout constraintLayout = (ConstraintLayout) AnonymousClass7TF.A0G(viewGroup2, R.id.video_review_trim_mode);
        this.A0h = constraintLayout;
        this.A0j = (CameraToolMenuItem) AnonymousClass7TF.A0F(constraintLayout, R.id.trim_music_button);
        this.A0e = (LoadingSpinnerView) AnonymousClass7TF.A0F(viewGroup2, R.id.clips_review_spinner);
        this.A0R = DbX.A0b(viewGroup2, R.id.clips_review_loading_thumbnail);
        this.A0d = (ClipsReviewProgressBar) AnonymousClass7TF.A0F(viewGroup2, R.id.clips_review_progress_bar);
        this.A0O = AnonymousClass7TG.A0R(viewGroup2, R.id.clips_count);
        C59772JXp jXp = new C59772JXp(DbX.A0I(viewGroup2, R.id.clips_review_play_mode), jXk);
        this.A0W = jXp;
        this.A0X = new AnonymousClass8Q2(constraintLayout, fragment2, userSession2, jXh, r14, r13);
        this.A0K = context2.getResources().getInteger(17694720);
        C59771JXo jXo = new C59771JXo();
        this.A0m = jXo;
        FragmentActivity requireActivity = fragment2.requireActivity();
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size);
        int A052 = AnonymousClass7TG.A05(context2);
        this.A0p = new AnonymousClass8QZ(requireActivity, (View) null, r12, userSession2, AnonymousClass7TF.A0F(viewGroup2, R.id.clips_edit_thumbnail_tray), (C355458Qb) null, jXo, jXn, (C355468Qc) null, (AnonymousClass7SL) null, JYJ.A00, AnonymousClass8QY.A00, 0.5625f, 2131960992, 1, dimensionPixelSize, A052, R.color.black_60_transparent, R.dimen.abc_button_inset_vertical_material, false, true, true, false, false, false);
        this.A0M = AnonymousClass7TF.A0G(viewGroup2, R.id.clips_play_button);
        this.A0a = JTS.A0E(fragment2, fragment2.requireActivity(), userSession2);
        this.A0A = jXp;
        this.A0D = new AnonymousClass831(0sn.A00, false);
        this.A03 = -1;
        this.A01 = Integer.MAX_VALUE;
        this.A04 = -1;
        viewGroup2.setOnTouchListener(new C59773JXq(this));
        2Fk r5 = this.A0a.A0K.A06;
        Fragment fragment3 = this.A0P;
        Dba.A16(fragment3, r5, MP5.A00(this, 7), 66);
        this.A0F = new GIH(context2, (GJO) null, context2.getResources().getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding), context2.getResources().getDimensionPixelSize(R.dimen.clips_control_music_button_radius), context2.getResources().getDimensionPixelSize(R.dimen.clips_control_music_button_stroke_width), AnonymousClass7TE.A09(context2), AnonymousClass7TG.A03(context2), 0, false);
        this.A0b.A0D.A06(fragment3, new C64317LZr(this, 6));
        jXo.A91(jXm);
        C64317LZr.A00(fragment2, JTS.A0N(fragment2).A00("trim").A09, this, 5);
    }

    public static final int A01(C59767JXi jXi, C66567MWv mWv) {
        if (!jXi.A0H) {
            0kD.A07(__redex_internal_original_name, "getCurrentPositionInMs called while isShowing is false", (Throwable) null);
        } else if (mWv != null) {
            int currentPosition = mWv.getCurrentPosition();
            if (Integer.valueOf(currentPosition) == null || currentPosition <= 0) {
                return -1;
            }
            return currentPosition;
        }
        return -1;
    }

    private final MediaComposition A02(AnonymousClass51M r25, int i) {
        DownloadedTrack downloadedTrack;
        ImmutableList of;
        AnonymousClass51M r1 = r25;
        AnonymousClass51M A002 = LIO.A00(r1.A0E());
        boolean z = false;
        A002.A09 = 0;
        A002.A08 = r1.A0F.A04;
        AnonymousClass8Q2 r2 = this.A0X;
        if (r2.A02 != AnonymousClass05K.A00) {
            A002.A0N = r2.A04;
        }
        AudioOverlayTrack audioOverlayTrack = this.A0E;
        if (audioOverlayTrack != null) {
            downloadedTrack = audioOverlayTrack.A06;
        } else {
            downloadedTrack = null;
        }
        AnonymousClass51R r22 = A002.A0F;
        float f = 0.5625f;
        if (((float) r22.A09) / ((float) r22.A05) <= 0.5625f) {
            z = true;
        }
        ImmutableList of2 = ImmutableList.of(AnonymousClass51Q.A03(A002));
        0qQ.A07(of2);
        if (downloadedTrack == null) {
            of = ImmutableList.of();
        } else {
            of = ImmutableList.of(new C39799A9u((MediaEffect) null, (Float) null, downloadedTrack.A02, (String) null, 1.0f, 1.0f, downloadedTrack.A00(audioOverlayTrack.A03 + this.A0D.A01(this.A05)), -1, i));
        }
        0qQ.A0A(of);
        float f2 = 0.0f;
        if (audioOverlayTrack == null) {
            f2 = 1.0f;
        }
        0sn r23 = 0sn.A00;
        ImmutableList of3 = ImmutableList.of();
        0qQ.A0B(of, 2);
        AnonymousClass7TG.A1S(r23, of3);
        if (z) {
            AnonymousClass51R r12 = A002.A0F;
            f = ((float) r12.A09) / ((float) r12.A05);
        }
        C66328MNl mNl = C66328MNl.A00;
        0qQ.A0B(mNl, 2);
        return new MediaComposition(AHK.A00((C365998o1) null, (C366518pA) null, of, of2, of3, (C357608Yw) null, r23, r23, mNl, f2, f, 0, true, false));
    }

    public static final void A03(ImageUrl imageUrl, C59767JXi jXi) {
        CameraToolMenuItem cameraToolMenuItem;
        GIH gih;
        if (imageUrl == null || (gih = jXi.A0F) == null) {
            cameraToolMenuItem = jXi.A0j;
            gih = null;
        } else {
            gih.A04(imageUrl);
            cameraToolMenuItem = jXi.A0j;
        }
        cameraToolMenuItem.A05 = gih;
        cameraToolMenuItem.A06 = null;
        cameraToolMenuItem.invalidate();
    }

    public static final void A04(L92 l92, C59767JXi jXi) {
        int i;
        if (jXi.A0H) {
            boolean z = true;
            if (jXi.A0B == null) {
                jXi.A0E();
            } else {
                jXi.A09 = l92;
                AnonymousClass8Q2 r8 = jXi.A0X;
                Integer num = r8.A02;
                Integer num2 = AnonymousClass05K.A01;
                if (num == num2 && A0D(jXi)) {
                    if (!182.A06(0Tu.A05, jXi.A0Q, 36320433889812907L)) {
                        jXi.A0C = null;
                        jXi.A0N.setOnTouchListener((View.OnTouchListener) null);
                    }
                }
                if (l92.A03 == num2 && !r8.A04) {
                    z = false;
                }
                int i2 = l92.A01;
                int i3 = l92.A00;
                if (jXi.A07 == null) {
                    0kD.A07(__redex_internal_original_name, "textureView is null", (Throwable) null);
                } else {
                    0nA.A0p(jXi.A0N, new C41214AqC(jXi, i2, i3, z));
                }
                int i4 = jXi.A04;
                if (i4 != -1) {
                    i = jXi.A0V.BrU(i4);
                    jXi.A04 = -1;
                } else {
                    i = jXi.A02;
                }
                C66567MWv mWv = jXi.A0B;
                if (mWv != null) {
                    mWv.ETr(l92, i);
                }
                C66567MWv mWv2 = jXi.A0B;
                if (mWv2 != null) {
                    mWv2.EcI(new C65056Lma(jXi));
                }
                jXi.A0M.setVisibility(8);
                C66567MWv mWv3 = jXi.A0B;
                if (mWv3 != null) {
                    mWv3.start();
                    return;
                }
                return;
            }
        }
        jXi.A04 = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C59767JXi r4) {
        /*
            boolean r0 = r4.A0H
            if (r0 == 0) goto L_0x002c
            android.view.View r1 = r4.A0M
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.music.common.ui.LoadingSpinnerView r1 = r4.A0e
            X.JY5 r0 = X.JY5.LOADING
            r1.setLoadingStatus(r0)
            android.view.TextureView r1 = r4.A07
            if (r1 == 0) goto L_0x001a
            r0 = 0
            r1.setAlpha(r0)
        L_0x001a:
            X.831 r0 = r4.A0D
            java.util.List r0 = r0.A01
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 == 0) goto L_0x002d
            java.lang.String r1 = "ClipsReviewController"
            java.lang.String r0 = "segment store cannot be empty"
            X.0kD.A07(r1, r0, r2)
        L_0x002c:
            return
        L_0x002d:
            X.8Q3 r1 = r4.A0A
            X.JXp r0 = r4.A0W
            if (r1 != r0) goto L_0x005a
            X.831 r1 = r4.A0D
            java.util.List r0 = r1.A01
            int r0 = X.C51966G9m.A06(r0)
        L_0x003b:
            X.51O r3 = r1.A03(r0)
        L_0x003f:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r4.A0R
            r0 = 0
            r1.setVisibility(r0)
            r1.setImageDrawable(r2)
            if (r3 == 0) goto L_0x002c
            android.view.ViewGroup r0 = r4.A0N
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r1 = 1
            X.LYs r0 = new X.LYs
            r0.<init>(r1, r3, r4)
            r2.addOnGlobalLayoutListener(r0)
            return
        L_0x005a:
            X.8Q2 r0 = r4.A0X
            if (r1 != r0) goto L_0x0063
            X.831 r1 = r4.A0D
            int r0 = r4.A05
            goto L_0x003b
        L_0x0063:
            r3 = r2
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59767JXi.A05(X.JXi):void");
    }

    public static final void A06(C59767JXi jXi, int i) {
        if (jXi.A0H && jXi.A0B != null && jXi.A09 != null) {
            int A062 = C51966G9m.A06(jXi.A0D.A01);
            int A002 = A00(jXi, A01(jXi, jXi.A0B));
            int A032 = 0mi.A03(i + A002, 0, A062);
            if (A032 != A002 || A032 == 0 || A032 == A062) {
                C66567MWv mWv = jXi.A0B;
                if (mWv != null) {
                    mWv.seekTo(jXi.A0V.BrU(A032));
                }
                AnonymousClass2S0.A01.A05(5);
                C59772JXp jXp = jXi.A0W;
                int A082 = JTO.A08(jXi.A0D);
                jXp.A00 = A032;
                jXp.A01 = A082;
                C59772JXp.A00(jXp);
            }
        }
    }

    public static final void A07(C59767JXi jXi, int i) {
        C59771JXo jXo = jXi.A0m;
        jXo.A00(jXi.A0D);
        AnonymousClass8QZ r3 = jXi.A0p;
        AnonymousClass8Q3 r0 = jXi.A0A;
        C59772JXp jXp = jXi.A0W;
        r3.A0C(AnonymousClass7TF.A1W(r0, jXp), false);
        r3.A09(i);
        int size = jXo.A01.size();
        jXp.A00 = i;
        jXp.A01 = size;
        C59772JXp.A00(jXp);
    }

    public static final void A08(C59767JXi jXi, int i, int i2, int i3) {
        jXi.A0d.setPlaybackPosition(i);
        JTR.A18(jXi.A0L, jXi.A0O, Integer.valueOf(i2 + 1), Integer.valueOf(i3), 2131955720);
        AnonymousClass8Q3 r0 = jXi.A0A;
        C59772JXp jXp = jXi.A0W;
        if (r0 == jXp) {
            C59771JXo jXo = jXi.A0m;
            if (i2 != jXo.A00 && i2 < jXo.A01.size()) {
                jXi.A0p.A09(i2);
                jXp.A00 = i2;
                jXp.A01 = i3;
                C59772JXp.A00(jXp);
            }
        }
    }

    public static final void A09(C59767JXi jXi, AnonymousClass51M r13, int i) {
        2Nn r7;
        AudioOverlayTrack audioOverlayTrack;
        AnonymousClass51R r2 = r13.A0F;
        int i2 = i;
        if (jXi.A0J && (audioOverlayTrack = jXi.A0E) != null) {
            audioOverlayTrack.A03 = jXi.A00 + i;
        }
        if (A0D(jXi)) {
            A04(C63160KsT.A00(jXi.A02(r13, i), r2, jXi.A0X.A02, r13.A0F.A0F), jXi);
            return;
        }
        AudioOverlayTrack audioOverlayTrack2 = jXi.A0E;
        if (audioOverlayTrack2 != null && (r7 = jXi.A0f) != null) {
            try {
                boolean z = false;
                if (jXi.A0X.A02 != AnonymousClass05K.A00) {
                    z = true;
                }
                File A022 = C348947zL.A02(r13, r7, z);
                Context context = jXi.A0L;
                UserSession userSession = jXi.A0Q;
                ExecutorService executorService = jXi.A0q;
                int BrU = jXi.A0V.BrU(jXi.A05);
                C65119Lnh lnh = new C65119Lnh(jXi, r2);
                C51972G9s.A1D(executorService, A022);
                0nY.A00().ATE(new KJJ(context, userSession, lnh, audioOverlayTrack2, r7, A022, executorService, BrU, i2));
            } catch (IOException unused) {
                C64169LRs.A02(jXi.A0L, AnonymousClass05K.A0j, AnonymousClass000.A00(948), 2131955554);
                A0B(jXi, false);
            }
        }
    }

    public static final void A0B(C59767JXi jXi, boolean z) {
        AnonymousClass8XA A002;
        jXi.A0b.A00();
        AnonymousClass8Q2 r2 = jXi.A0X;
        if (r2.A02 != AnonymousClass05K.A00) {
            if (z) {
                C353498Hw.A0g(jXi.A0U.A00);
            }
            int intValue = r2.A02.intValue();
            if (intValue == 2) {
                C353498Hw.A0g(jXi.A0U.A00);
            } else if (intValue != 3) {
                AnonymousClass9QY r0 = jXi.A0U;
                if (intValue != 4) {
                    C353498Hw r22 = r0.A00;
                    C353498Hw.A0g(r22);
                    AnonymousClass8WX r02 = r22.A0B;
                    if (!(r02 == null || (A002 = r02.A00()) == null)) {
                        A002.A0O(false);
                    }
                    if (!C353498Hw.A1R(r22)) {
                        C353498Hw.A0q(r22);
                        return;
                    }
                    return;
                }
                C353498Hw r3 = r0.A00;
                C353498Hw.A0g(r3);
                C353498Hw.A10(r3, (AudioOverlayTrack) null, MusicOverlaySearchTab.A07, false);
            } else {
                DbT.A1K(jXi.A0U.A00.A1B);
            }
        } else {
            jXi.A04 = jXi.A05;
            C59772JXp jXp = jXi.A0W;
            if (jXi.A0H) {
                A0A(jXi, true);
                jXi.A0A = jXp;
                A0C(jXi, true, true);
            }
        }
    }

    public static final boolean A0D(C59767JXi jXi) {
        if (jXi.A0X.A02 != AnonymousClass05K.A00) {
            if (182.A06(0Tu.A05, jXi.A0Q, 36320433889812907L)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void A0E() {
        if (this.A0H) {
            this.A0H = false;
            A0G();
            C294975nL A0C2 = C294975nL.A01(this.A0N, 1).A0C((long) this.A0K);
            A0C2.A0I(0.0f);
            C65724Lye.A00(A0C2, this, 11);
        }
    }

    public final void A0F() {
        if (this.A0D.A01.isEmpty()) {
            A0B(this, false);
            return;
        }
        AnonymousClass8Q3 r1 = this.A0A;
        if (r1 == this.A0W) {
            AnonymousClass831 r12 = this.A0D;
            this.A02 = r12.A01(C51966G9m.A06(r12.A01));
            this.A01 = Integer.MAX_VALUE;
            2Fk r3 = this.A0a.A0C;
            Fragment fragment = this.A0P;
            AnonymousClass2gO r13 = this.A08;
            if (r13 == null) {
                r13 = new C64317LZr(this, 7);
                this.A08 = r13;
            }
            r3.A06(fragment, r13);
            return;
        }
        AnonymousClass8Q2 r5 = this.A0X;
        if (r1 == r5) {
            2Nn r6 = this.A0f;
            if (r6 == null) {
                0kD.A07(__redex_internal_original_name, "clipsDirectoryProvider is null", (Throwable) null);
                return;
            }
            AnonymousClass51M r4 = (AnonymousClass51M) this.A0D.A03(this.A05);
            AnonymousClass51R r32 = r4.A0F;
            try {
                boolean z = false;
                if (r5.A02 != AnonymousClass05K.A00) {
                    z = true;
                }
                File A022 = C348947zL.A02(r4, r6, z);
                int i = r4.A09;
                this.A02 = i;
                this.A01 = r4.A08;
                if (this.A0E == null) {
                    A04(C63160KsT.A00(A02(r4, this.A02), r32, r5.A02, JTP.A0t(A022)), this);
                    return;
                }
                A09(this, r4, i);
            } catch (IOException unused) {
                A0B(this, false);
            }
        }
    }

    public final void A0G() {
        this.A0N.removeCallbacks(this.A0g);
        C66567MWv mWv = this.A0B;
        if (mWv != null) {
            mWv.release();
            this.A0B = null;
        }
    }

    public final void A0H() {
        C66567MWv abK;
        if (this.A07 == null) {
            TextureView textureView = new TextureView(this.A0L);
            this.A07 = textureView;
            textureView.setSurfaceTextureListener(new LWb(this));
            TextureView textureView2 = this.A07;
            if (textureView2 != null) {
                JTT.A12(textureView2);
            }
            this.A0N.addView(this.A07, 0);
        }
        A0G();
        Context context = this.A0L;
        UserSession userSession = this.A0Q;
        AnonymousClass81W r0 = ((NineSixteenLayoutConfigImpl) this.A0S).A0K;
        int width = r0.getWidth();
        int height = r0.getHeight();
        if (JTP.A0j(A0D(this) ? 1 : 0).intValue() != 0) {
            abK = new C40386AbJ(context, userSession);
        } else {
            abK = new C40387AbK(context, userSession, width, height);
        }
        C66567MWv mWv = abK;
        this.A0B = mWv;
        Surface surface = this.A06;
        if (surface != null && mWv != null) {
            mWv.setSurface(surface);
        }
    }

    public final boolean onBackPressed() {
        if (!this.A0H) {
            return false;
        }
        if (this.A0A == this.A0X) {
            A0B(this, false);
            return true;
        }
        C353498Hw.A0g(this.A0U.A00);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        if (r5 >= r6) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0C(X.C59767JXi r7, boolean r8, boolean r9) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.831 r0 = r7.A0D
            int r2 = X.JTO.A08(r0)
            r1 = 0
        L_0x000b:
            if (r1 >= r2) goto L_0x001f
            X.831 r0 = r7.A0D
            X.51O r0 = r0.A03(r1)
            X.51M r0 = (X.AnonymousClass51M) r0
            int r0 = X.JTP.A08(r0)
            X.AnonymousClass7TF.A1M(r3, r0)
            int r1 = r1 + 1
            goto L_0x000b
        L_0x001f:
            com.instagram.creation.capture.quickcapture.sundial.widget.progressbar.ClipsReviewProgressBar r1 = r7.A0d
            int r0 = r7.A03
            r1.A02(r3, r0)
            X.831 r0 = r7.A0D
            int r6 = X.JTO.A08(r0)
            int r5 = r7.A04
            r3 = 1
            r4 = 0
            r0 = -1
            if (r5 == r0) goto L_0x0038
            if (r5 < 0) goto L_0x0038
            r2 = 1
            if (r5 < r6) goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            X.8Q3 r1 = r7.A0A
            X.JXp r0 = r7.A0W
            if (r1 != r0) goto L_0x006b
            if (r2 != 0) goto L_0x0043
            int r5 = r6 + -1
        L_0x0043:
            X.8QZ r0 = r7.A0p
            r0.A0B(r8)
            r4 = r5
        L_0x0049:
            X.JXl r0 = r7.A0V
            int r0 = r0.BrU(r4)
            A08(r7, r0, r4, r6)
            r7.A0F()
            X.8Q3 r2 = r7.A0A
            X.831 r1 = r7.A0D
            java.util.List r0 = r1.A01
            int r0 = X.DbT.A02(r0, r3)
            X.51O r0 = r1.A03(r0)
            X.51M r0 = (X.AnonymousClass51M) r0
            X.51R r0 = r0.A0F
            r2.Eto(r0, r8, r9)
            return
        L_0x006b:
            X.8Q2 r0 = r7.A0X
            if (r1 != r0) goto L_0x0049
            int r4 = r7.A05
            X.8QZ r0 = r7.A0p
            r0.A0A(r8)
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59767JXi.A0C(X.JXi, boolean, boolean):void");
    }
}
