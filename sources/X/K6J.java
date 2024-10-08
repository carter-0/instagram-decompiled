package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;
import com.instagram.common.ui.widget.touchimageview.TouchImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediatype.ProductType;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.List;

public final class K6J extends AnonymousClass4DH implements AnonymousClass4DR, C268594df, C74332Pt8, C66524MVc {
    public static final C71392co A0V = C71392co.A00();
    public static final C71392co A0W = C71392co.A03(0.0d, 10.0d);
    public static final String __redex_internal_original_name = "OpenCarouselMediaPickerSheetFragment";
    public float A00;
    public float A01 = 0.8f;
    public int A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public ViewGroup A06;
    public TouchImageView A07;
    public LG7 A08;
    public C63859L9o A09;
    public LEB A0A;
    public IgdsBottomButtonLayout A0B;
    public C14044Tol A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public ViewGroup A0J;
    public Fragment A0K;
    public PunchedOverlayView A0L;
    public AnonymousClass7L0 A0M;
    public OLS A0N;
    public MediaFrameLayout A0O;
    public Integer A0P;
    public final String A0Q = "open_carousel_media_picker_fragment";
    public final AnonymousClass0eM A0R = C227642jf.A02(this);
    public final AnonymousClass9HB A0S = new AnonymousClass9HB();
    public final MVV A0T = new C65771LzP(this);
    public final MT1 A0U = new C65772LzQ(this, 1);

    public final void ADi(AnonymousClass7L0 r4) {
        0qQ.A0B(r4, 0);
        this.A0M = r4;
        ViewGroup viewGroup = this.A0J;
        if (viewGroup != null) {
            Drawable background = viewGroup.getBackground();
            if (background != null) {
                int i = r4.A09;
                background.setColorFilter(i, PorterDuff.Mode.SRC);
                AnonymousClass2uJ.A04(requireActivity(), i);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        K6G A012 = A01(this);
        if (A012 != null) {
            A012.ADi(r4);
        }
    }

    public final int AqL() {
        return -1;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final boolean DHW(View view, GalleryItem galleryItem) {
        return false;
    }

    public final /* synthetic */ void DIn(boolean z) {
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    /* JADX WARNING: type inference failed for: r19v2, types: [java.lang.Object, X.7Pq] */
    public final boolean Dkq(Medium medium, String str) {
        Integer valueOf;
        float f;
        float f2;
        int i;
        C63859L9o l9o = this.A09;
        if (l9o != null) {
            LRh lRh = new LRh(l9o.A02, l9o.A00);
            Medium medium2 = medium;
            int i2 = 1;
            if (medium2.CeS()) {
                i2 = 2;
            }
            29f A0c = JTO.A0c(lRh.A07);
            C360948fP r16 = C360948fP.NORMAL;
            int i3 = medium2.A0B;
            int i4 = medium2.A04;
            Long valueOf2 = Long.valueOf(medium2.A01());
            String str2 = medium2.A0X;
            Double valueOf3 = Double.valueOf(((double) medium2.A03) / 1000.0d);
            C391579tJ r15 = C391579tJ.UNKNOWN;
            MediaUploadMetadata mediaUploadMetadata = medium2.A0G;
            long j = medium2.A0C;
            if (j <= 0) {
                j = medium2.A0D;
            }
            29f.A05(r15, r16, (C279294yP) null, mediaUploadMetadata, A0c, false, (Boolean) null, valueOf3, Integer.valueOf(i3), Integer.valueOf(i4), valueOf2, (Long) null, str2, i2, i3, i4, j, false);
            Context context = l9o.A01;
            boolean z = l9o.A05;
            if (medium2.CeS()) {
                if (medium2.A03 > 61500) {
                    i = 2131968987;
                } else if (z) {
                    i = 2131968952;
                }
                C56588I2s.A01(context, i);
            }
            Integer num = this.A0P;
            if (num == null || num.intValue() != medium2.A05) {
                AnonymousClass0eM r5 = this.A0R;
                LRh lRh2 = new LRh(AnonymousClass7TE.A0l(r5), requireContext());
                String str3 = this.A0E;
                UserSession userSession = lRh2.A07;
                AnonymousClass0iw r8 = lRh2.A05;
                0Aj A0S2 = C51975G9x.A0S(r8, userSession);
                if (A0S2.isSampled()) {
                    A0S2.A8M(C54689HOu.OPEN_CAROUSEL_SUBMIT_PREVIEW, "action_source");
                    DbW.A16(A0S2, r8);
                    C51965G9l.A1K(A0S2, lRh2.A08);
                    JTQ.A13(A0S2, LRh.A00(str3));
                }
                this.A0H = false;
                boolean z2 = true;
                if (medium2.A05()) {
                    TouchImageView touchImageView = this.A07;
                    if (touchImageView != null) {
                        touchImageView.setVisibility(0);
                    }
                    MediaFrameLayout mediaFrameLayout = this.A0O;
                    if (mediaFrameLayout != null) {
                        mediaFrameLayout.setVisibility(4);
                    }
                    TouchImageView touchImageView2 = this.A07;
                    if (touchImageView2 != null) {
                        String str4 = medium2.A0X;
                        touchImageView2.setImageBitmap(1MF.A0F(str4, medium2.A0B, medium2.A04, 1MF.A00(str4)));
                    }
                    TouchImageView touchImageView3 = this.A07;
                    if (touchImageView3 != null) {
                        touchImageView3.A0G = true;
                    }
                } else {
                    if (medium2.CeS()) {
                        TouchImageView touchImageView4 = this.A07;
                        if (touchImageView4 != null) {
                            touchImageView4.setVisibility(4);
                        }
                        MediaFrameLayout mediaFrameLayout2 = this.A0O;
                        if (mediaFrameLayout2 != null) {
                            mediaFrameLayout2.setVisibility(0);
                        }
                        Integer num2 = AnonymousClass05K.A1F;
                        String A0j = AnonymousClass7TG.A0j();
                        String str5 = medium2.A0X;
                        if (str5.length() <= 0) {
                            z2 = false;
                        }
                        AnonymousClass3WR r13 = new AnonymousClass3WR((C2814057m) null, (ProductType) null, (C255573uM) null, (Boolean) null, (Double) null, num2, (Integer) null, A0j, (String) null, str5, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, -1, -1, -1, false, false, false, true, false, false, z2, false);
                        if (this.A0C == null) {
                            C14044Tol tol = new C14044Tol(requireContext(), AnonymousClass7TE.A0l(r5), (C252323ov) null, new Object(), this.A0Q);
                            this.A0C = tol;
                            tol.A06(AnonymousClass4M7.FILL);
                        }
                        C14044Tol tol2 = this.A0C;
                        0qQ.A0C(tol2, "null cannot be cast to non-null type com.instagram.video.player.media.IgPlayerController<com.instagram.common.gallery.Medium>");
                        AnonymousClass3WR r10 = r13;
                        tol2.A09(this.A0O, r10, new C263754Nf((Object) medium2, 0), medium2.A0X, this.A0Q, 1.0f, -1, 0, true, true);
                    }
                    valueOf = Integer.valueOf(medium2.A05);
                }
                ViewGroup viewGroup = this.A05;
                if (viewGroup == null || viewGroup.getVisibility() != 0) {
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A0B;
                    if (igdsBottomButtonLayout != null) {
                        C71392co r3 = C315596kB.A02;
                        C294975nL A0E2 = JTP.A0c(igdsBottomButtonLayout, 0).A0E(A0V);
                        A0E2.A0T((float) 0nA.A05(AnonymousClass7TE.A0S(igdsBottomButtonLayout)), 0.0f);
                        A0E2.A04 = 0;
                        A0E2.A0H();
                    }
                    View A002 = A00(this);
                    if (A002 != null) {
                        A002.setImportantForAccessibility(4);
                    }
                    ViewGroup viewGroup2 = this.A05;
                    if (viewGroup2 != null) {
                        C71392co r2 = C315596kB.A02;
                        C294975nL A0c2 = JTP.A0c(viewGroup2, 0);
                        A0c2.A04 = 0;
                        C294975nL A0E3 = A0c2.A0E(A0W);
                        View view = this.A03;
                        float f3 = 0.0f;
                        if (view != null) {
                            f = view.getY();
                        } else {
                            f = 0.0f;
                        }
                        View view2 = this.A03;
                        if (view2 != null) {
                            f2 = view2.getY();
                        } else {
                            f2 = 0.0f;
                        }
                        float A032 = f2 - AnonymousClass7TE.A03(viewGroup2);
                        View view3 = this.A03;
                        if (view3 != null) {
                            f3 = AnonymousClass7TE.A03(view3);
                        }
                        A0E3.A0T(f, A032 + f3);
                        A0E3.A0H();
                    }
                }
                valueOf = Integer.valueOf(medium2.A05);
            } else {
                valueOf = null;
            }
            this.A0P = valueOf;
            return false;
        }
        return false;
    }

    public final boolean Erf() {
        return true;
    }

    public final void onAttachFragment(Fragment fragment) {
        0qQ.A0B(fragment, 0);
        AnonymousClass7L0 r2 = this.A0M;
        if (r2 != null) {
            K6G k6g = (K6G) fragment;
            MVV mvv = this.A0T;
            0qQ.A0B(mvv, 0);
            k6g.A03 = mvv;
            LPF lpf = k6g.A02;
            if (lpf != null) {
                lpf.A01 = mvv;
                lpf.A09.A00 = mvv;
            }
            k6g.ADi(r2);
            k6g.A00 = this;
            MT1 mt1 = this.A0U;
            k6g.A04 = mt1;
            LPF lpf2 = k6g.A02;
            if (lpf2 != null) {
                lpf2.A02 = mt1;
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A0J = DbU.A0C(view, R.id.direct_media_picker_root_container);
        this.A05 = DbU.A0C(view, R.id.media_preview_container);
        this.A07 = (TouchImageView) view.requireViewById(R.id.image_media_preview);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) view.requireViewById(R.id.video_media_preview);
        mediaFrameLayout.A00 = JTP.A00(AnonymousClass7TE.A02(mediaFrameLayout), mediaFrameLayout);
        this.A0O = mediaFrameLayout;
        this.A0L = (PunchedOverlayView) view.findViewById(R.id.punched_overlay_view);
        View requireViewById = view.requireViewById(R.id.drag_handle);
        this.A04 = requireViewById;
        if (!(this.mArguments == null || requireViewById == null)) {
            requireViewById.setVisibility(0);
        }
        this.A03 = view.requireViewById(R.id.bottom_container);
        ViewGroup viewGroup = this.A0J;
        if (viewGroup != null) {
            0nA.A0r(viewGroup, new M4L(viewGroup));
        }
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.media_picker_preview_header);
        LYE.A00(AnonymousClass7TF.A0G(A0G2, R.id.action_bar_button_back), 57, this);
        String str = this.A0F;
        if (str != null) {
            TextView A0G3 = DbU.A0G(A0G2, R.id.media_picker_header_subtitle);
            A0G3.setText(str);
            A0G3.setVisibility(0);
        }
        MediaFrameLayout mediaFrameLayout2 = this.A0O;
        if (mediaFrameLayout2 != null) {
            mediaFrameLayout2.A00 = JTP.A00(AnonymousClass7TE.A02(mediaFrameLayout2), mediaFrameLayout2);
        }
        PunchedOverlayView punchedOverlayView = this.A0L;
        if (punchedOverlayView != null) {
            Context context = punchedOverlayView.getContext();
            punchedOverlayView.A01 = context.getColor(2Yu.A02(context));
            punchedOverlayView.addOnLayoutChangeListener(new LYP(0, punchedOverlayView, this));
        }
        TouchImageView touchImageView = this.A07;
        if (touchImageView != null) {
            touchImageView.A06 = new C64880Ljg(this.A00);
            touchImageView.A0F = false;
            C64286LYm.A00(touchImageView, 20, this);
        }
        UserSession A0l = AnonymousClass7TE.A0l(this.A0R);
        int i = this.A02;
        K6G A002 = C63233Kte.A00(A0l, (DirectThreadKey) null, (String) null, (String) null, this.A0F, (List) null, this.A00, i, i, false, false, false, false, false);
        LYE lye = new LYE((Object) this, 56);
        String str2 = this.A0D;
        if (str2 == null) {
            str2 = DbV.A05(this).getQuantityString(R.plurals.direct_media_composer_send_button_description, 1);
            0qQ.A07(str2);
        }
        View view2 = this.A03;
        if (view2 == null || (igdsBottomButtonLayout = (IgdsBottomButtonLayout) view2.findViewById(R.id.send_bottom_button)) == null) {
            igdsBottomButtonLayout = null;
        } else {
            igdsBottomButtonLayout.setPrimaryActionText(str2);
            igdsBottomButtonLayout.setPrimaryActionOnClickListener(lye);
        }
        this.A0B = igdsBottomButtonLayout;
        this.A06 = DbU.A0C(view, R.id.overlay_container);
        0s1 A0C2 = DbW.A0C(this);
        A0C2.A0A(A002, R.id.fragment_container);
        A0C2.A00();
        this.A0K = A002;
        AnonymousClass7L0 r0 = this.A0M;
        if (r0 != null) {
            ADi(r0);
        }
        ViewGroup viewGroup2 = this.A0J;
        if (viewGroup2 != null) {
            this.A0N = new OLS(requireContext(), viewGroup2);
        }
    }

    public static final View A00(K6J k6j) {
        Fragment fragment = k6j.A0K;
        if (fragment == null) {
            0qQ.A0F("currentFragment");
            throw AnonymousClass00P.createAndThrow();
        }
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(R.id.gallery);
        }
        return null;
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final AnonymousClass8XO B8p() {
        C63859L9o l9o = this.A09;
        if (l9o == null || !l9o.A05) {
            return AnonymousClass8XO.PHOTO_AND_VIDEO;
        }
        return AnonymousClass8XO.PHOTO_ONLY;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final float CMx() {
        return this.A01;
    }

    public final boolean CPc() {
        ViewGroup viewGroup;
        MUL mul = this.A0K;
        if (mul == null) {
            0qQ.A0F("currentFragment");
            throw AnonymousClass00P.createAndThrow();
        } else if (!(mul instanceof MUL) || !mul.CPd() || ((viewGroup = this.A05) != null && viewGroup.getVisibility() == 0)) {
            return false;
        } else {
            return true;
        }
    }

    public final /* synthetic */ float CoU() {
        return this.A01;
    }

    public final void D0u() {
        C63859L9o l9o = this.A09;
        if (l9o != null) {
            l9o.A04.A00 = true;
            Activity activity = l9o.A00;
            DbX.A10(activity, AnonymousClass37D.A00);
            UserSession userSession = l9o.A02;
            0eP A1L = AnonymousClass7TE.A1L(C273654mx.A00(22), C358098aM.A00(C363138jC.A00, new C358088aL[0]));
            Dba.A0l(activity, AnonymousClass7TG.A0P(AnonymousClass000.A00(3699), l9o.A03, A1L), userSession, C273654mx.A00(863));
            27p.A01(new LRh(userSession, activity).A07).A0Y();
        }
    }

    public final /* synthetic */ boolean Et9() {
        return false;
    }

    public final String getModuleName() {
        return this.A0Q;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0R);
    }

    public final boolean isScrolledToTop() {
        MUL mul = this.A0K;
        if (mul == null) {
            0qQ.A0F("currentFragment");
            throw AnonymousClass00P.createAndThrow();
        } else if (mul instanceof MUL) {
            return mul.isScrolledToTop();
        } else {
            return true;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0092: MOVE  (r1v1 X.4DR) = (r1v0 X.4DR)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final boolean onBackPressed() {
        /*
            r5 = this;
            boolean r0 = r5.A0I
            r2 = 1
            if (r0 != 0) goto L_0x009d
            X.LG7 r0 = r5.A08
            if (r0 == 0) goto L_0x0014
            X.KKN r0 = r0.A01
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.onBackPressed()
            if (r0 != r2) goto L_0x0014
            return r2
        L_0x0014:
            android.view.ViewGroup r0 = r5.A05
            r4 = 0
            if (r0 == 0) goto L_0x0080
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0080
            com.instagram.common.ui.widget.touchimageview.TouchImageView r1 = r5.A07
            if (r1 == 0) goto L_0x0029
            r1.A0G = r4
            r0 = 0
            r1.setImageBitmap(r0)
        L_0x0029:
            X.Tol r1 = r5.A0C
            if (r1 == 0) goto L_0x0032
            java.lang.String r0 = "finished"
            r1.A0D(r0, r4)
        L_0x0032:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r3 = r5.A0B
            if (r3 == 0) goto L_0x0054
            X.2co r0 = X.C315596kB.A02
            X.5nL r1 = X.JTP.A0c(r3, r4)
            X.2co r0 = A0V
            X.5nL r1 = r1.A0E(r0)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r3)
            int r0 = X.0nA.A05(r0)
            float r0 = (float) r0
            r1.A0K(r0)
            r0 = 4
            r1.A03 = r0
            r1.A0H()
        L_0x0054:
            android.view.ViewGroup r1 = r5.A05
            if (r1 == 0) goto L_0x007b
            X.2co r0 = X.C315596kB.A02
            X.5nL r1 = X.JTP.A0c(r1, r4)
            r0 = 8
            r1.A03 = r0
            X.2co r0 = A0W
            X.5nL r1 = r1.A0E(r0)
            android.view.View r0 = r5.A03
            if (r0 == 0) goto L_0x0079
            float r0 = r0.getY()
        L_0x0070:
            r1.A0K(r0)
            r0 = 17
            X.C65724Lye.A00(r1, r5, r0)
            return r2
        L_0x0079:
            r0 = 0
            goto L_0x0070
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0080:
            androidx.fragment.app.Fragment r1 = r5.A0K
            if (r1 != 0) goto L_0x008e
            java.lang.String r0 = "currentFragment"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x008e:
            boolean r0 = r1 instanceof X.AnonymousClass4DR
            if (r0 == 0) goto L_0x009d
            X.4DR r1 = (X.AnonymousClass4DR) r1
            if (r1 == 0) goto L_0x009d
            boolean r0 = r1.onBackPressed()
            if (r0 != r2) goto L_0x009d
            return r2
        L_0x009d:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6J.onBackPressed():boolean");
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        View view = this.A03;
        if (view != null) {
            view.setTranslationY((float) ((-i) - i2));
        }
        OLS ols = this.A0N;
        if (ols == null) {
            0qQ.A0F("roundedCornerHelper");
            throw AnonymousClass00P.createAndThrow();
        } else {
            ols.A00(i);
        }
    }

    public static final K6G A01(K6J k6j) {
        if (!k6j.isResumed()) {
            return null;
        }
        K6G A0P2 = k6j.getChildFragmentManager().A0P(R.id.fragment_container);
        if (A0P2 instanceof K6G) {
            return A0P2;
        }
        return null;
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final void onBottomSheetClosed() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AnonymousClass2uJ.A04(activity, activity.getColor(R.color.igds_transparent_navigation_bar));
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-880479499);
        K6J.super.onCreate(bundle);
        this.A00 = requireArguments().getFloat("BUNDLE_ASPECT_RATIO", 1.0f);
        AnonymousClass0fD.A09(859737205, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2115445340);
        0qQ.A0B(layoutInflater, 0);
        this.A0S.A02(viewGroup);
        View inflate = layoutInflater.inflate(R.layout.fragment_open_carousel_media_picker, viewGroup, false);
        AnonymousClass0fD.A09(-1498612131, A022);
        return inflate;
    }

    public final void onDestroyView() {
        Context context;
        int A022 = AnonymousClass0fD.A02(1692650146);
        this.A0B = null;
        this.A04 = null;
        this.A03 = null;
        this.A05 = null;
        this.A07 = null;
        this.A0O = null;
        this.A0L = null;
        this.A0J = null;
        this.A06 = null;
        this.A0C = null;
        this.A0S.A01();
        if (this.A0G && (context = getContext()) != null) {
            LRh lRh = new LRh(AnonymousClass7TE.A0l(this.A0R), context);
            String str = this.A0E;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(lRh.A05, lRh.A07), "ig_camera_ui_tool_click");
            if (A0e.isSampled()) {
                JTO.A1O(AnonymousClass80P.CROP, A0e);
                A0e.AAJ("crop_action", "open_carousel_crop");
                JTQ.A13(A0e, LRh.A00(str));
            }
        }
        super.onDestroyView();
        AnonymousClass0fD.A09(1044480370, A022);
    }
}
