package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.widget.progressbar.ClipsReviewProgressBar;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.ui.LoadingSpinnerView;

public final class K5W extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ClipsTrimFragment";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Surface A05;
    public TextureView A06;
    public View A07;
    public ViewGroup A08;
    public C61009Jv9 A09;
    public IgImageView A0A;
    public L92 A0B;
    public AnonymousClass8Q3 A0C;
    public C59772JXp A0D;
    public C66567MWv A0E;
    public C355208Pb A0F;
    public AnonymousClass8Q2 A0G;
    public C380359Xr A0H;
    public ClipsReviewProgressBar A0I;
    public AnonymousClass8QZ A0J;
    public LoadingSpinnerView A0K;
    public 2Nn A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public ConstraintLayout A0P;
    public AnonymousClass8A5 A0Q;
    public final int A0R;
    public final C59771JXo A0S;
    public final C65067Lml A0T;
    public final Runnable A0U;
    public final AnonymousClass0eM A0V;
    public final AnonymousClass0eM A0W;
    public final AnonymousClass0eM A0X;
    public final AnonymousClass0eM A0Y = C227642jf.A02(this);
    public final C66505MUj A0Z;
    public final AnonymousClass8QO A0a;
    public final AnonymousClass8QW A0b;

    public final String getModuleName() {
        return "clips_trim_fragment";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: X.K5W} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r33, android.os.Bundle r34) {
        /*
            r32 = this;
            r1 = 0
            r5 = r33
            X.0qQ.A0B(r5, r1)
            r9 = r32
            r0 = r34
            super.onViewCreated(r5, r0)
            X.0eM r2 = r9.A0X
            java.lang.Object r0 = r2.getValue()
            X.Jit r0 = (X.C60295Jit) r0
            X.KgU r3 = X.C62479KgU.LOADING
            X.05G r0 = r0.A01
            r0.Epw(r3)
            android.content.Context r3 = r9.requireContext()
            X.0eM r4 = r9.A0Y
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.8A5 r0 = X.AnonymousClass8A4.A00(r3, r0)
            r9.A0Q = r0
            android.content.Context r3 = r9.requireContext()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.2Nn r0 = X.AnonymousClass830.A00(r3, r0)
            r9.A0L = r0
            r0 = 2131430211(0x7f0b0b43, float:1.8482117E38)
            android.view.ViewGroup r3 = X.DbS.A0E(r5, r0)
            r9.A08 = r3
            java.lang.String r6 = "clipsReviewContainer"
            r8 = 0
            if (r3 == 0) goto L_0x01c2
            r0 = 2131430213(0x7f0b0b45, float:1.848212E38)
            android.view.View r0 = r3.findViewById(r0)
            com.instagram.creation.capture.quickcapture.sundial.widget.progressbar.ClipsReviewProgressBar r0 = (com.instagram.creation.capture.quickcapture.sundial.widget.progressbar.ClipsReviewProgressBar) r0
            r9.A0I = r0
            android.view.ViewGroup r3 = r9.A08
            if (r3 == 0) goto L_0x01c2
            r0 = 2131430170(0x7f0b0b1a, float:1.8482033E38)
            android.view.View r0 = r3.findViewById(r0)
            r9.A07 = r0
            android.view.ViewGroup r3 = r9.A08
            if (r3 == 0) goto L_0x01c2
            r0 = 2131430214(0x7f0b0b46, float:1.8482123E38)
            android.view.View r0 = r3.findViewById(r0)
            com.instagram.music.common.ui.LoadingSpinnerView r0 = (com.instagram.music.common.ui.LoadingSpinnerView) r0
            r9.A0K = r0
            android.view.ViewGroup r3 = r9.A08
            if (r3 == 0) goto L_0x01c2
            r0 = 2131430210(0x7f0b0b42, float:1.8482115E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.JTO.A0Y(r3, r0)
            r9.A0A = r0
            android.view.ViewGroup r3 = r9.A08
            if (r3 == 0) goto L_0x01c2
            r0 = 2131430212(0x7f0b0b44, float:1.8482119E38)
            android.view.ViewGroup r5 = X.DbX.A0I(r3, r0)
            X.MUj r3 = r9.A0Z
            X.JXp r0 = new X.JXp
            r0.<init>(r5, r3)
            r9.A0D = r0
            android.view.ViewGroup r3 = r9.A08
            if (r3 == 0) goto L_0x01c2
            r0 = 2131443749(0x7f0b4025, float:1.8509575E38)
            android.view.View r0 = r3.requireViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r9.A0P = r0
            X.Lmc r14 = new X.Lmc
            r14.<init>(r9)
            r9.A0F = r14
            androidx.constraintlayout.widget.ConstraintLayout r11 = r9.A0P
            if (r11 != 0) goto L_0x00b4
            java.lang.String r7 = "reviewTrimModeView"
        L_0x00ac:
            X.0qQ.A0F(r7)
        L_0x00af:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b4:
            X.2Nn r3 = r9.A0L
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r4)
            X.0eM r0 = r9.A0V
            java.lang.Object r15 = r0.getValue()
            X.8Hv r15 = (X.C353488Hv) r15
            X.8Q2 r10 = new X.8Q2
            r12 = r9
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r9.A0G = r10
            X.JXp r0 = r9.A0D
            if (r0 != 0) goto L_0x00d3
            java.lang.String r7 = "clipsReviewPlayMode"
            goto L_0x00ac
        L_0x00d3:
            r9.A0C = r0
            androidx.fragment.app.FragmentActivity r7 = r9.requireActivity()
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r4)
            android.view.ViewGroup r3 = r9.A08
            if (r3 == 0) goto L_0x01c2
            r0 = 2131430069(0x7f0b0ab5, float:1.8481829E38)
            android.view.View r11 = X.AnonymousClass7TF.A0G(r3, r0)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r11 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r11
            X.JXo r13 = r9.A0S
            X.8QW r14 = r9.A0b
            android.content.res.Resources r3 = X.DbV.A05(r9)
            r0 = 2131165295(0x7f07006f, float:1.7944803E38)
            int r22 = r3.getDimensionPixelSize(r0)
            android.content.Context r0 = r9.requireContext()
            int r23 = X.AnonymousClass7TG.A05(r0)
            r20 = 2131960992(0x7f1324a0, float:1.9558668E38)
            r0 = 1
            r19 = 1058013184(0x3f100000, float:0.5625)
            r24 = 2131099791(0x7f06008f, float:1.7811945E38)
            r25 = 2131165195(0x7f07000b, float:1.79446E38)
            X.JYJ r17 = X.JYJ.A00
            X.8QY r18 = X.AnonymousClass8QY.A00
            X.8QZ r6 = new X.8QZ
            r12 = r8
            r15 = r8
            r16 = r8
            r21 = r0
            r26 = r1
            r27 = r0
            r28 = r0
            r29 = r1
            r30 = r1
            r31 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r9.A0J = r6
            X.Jv9 r6 = r9.A09
            if (r6 != 0) goto L_0x0132
            java.lang.String r7 = "trimData"
            goto L_0x00ac
        L_0x0132:
            X.8Q2 r4 = r9.A0G
            java.lang.String r7 = "clipsReviewTrimMode"
            if (r4 == 0) goto L_0x00ac
            java.lang.Object r3 = r6.A05
            java.lang.Integer r3 = (java.lang.Integer) r3
            X.0qQ.A0B(r3, r1)
            r4.A02 = r3
            java.lang.Object r3 = r6.A07
            X.7zv r3 = (X.C349307zv) r3
            if (r3 == 0) goto L_0x0173
            java.lang.Object r1 = r6.A05
            int r4 = X.AnonymousClass7TE.A0M(r1)
            r1 = 4
            if (r4 != r1) goto L_0x0173
            java.lang.Object r5 = r2.getValue()
            X.Jit r5 = (X.C60295Jit) r5
            X.831 r4 = X.C60295Jit.A01(r2)
            int r1 = r9.A0R
            X.51M r1 = X.C39820AAr.A00(r3, r1, r0)
            X.831 r1 = X.LSY.A00(r1, r4)
            r5.A00 = r1
            int r1 = X.C60295Jit.A00(r2)
            int r1 = r1 - r0
            r9.A04 = r1
            X.8Q2 r0 = r9.A0G
            if (r0 == 0) goto L_0x00ac
            r9.A0C = r0
        L_0x0173:
            int r0 = r6.A01
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            int r0 = r9.A04
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            X.8Q2 r0 = r9.A0G
            if (r0 == 0) goto L_0x00ac
            r14 = r0
            r15 = r9
            r16 = r3
            r18 = r8
            r19 = r8
            A02(r14, r15, r16, r17, r18, r19, r20)
            X.8QO r0 = r9.A0a
            r13.A91(r0)
            X.860 r1 = X.JTS.A0N(r9)
            java.lang.String r0 = "trim"
            X.861 r0 = r1.A00(r0)
            X.2Fj r2 = r0.A09
            r0 = 10
            X.LZr r1 = new X.LZr
            r1.<init>(r9, r0)
            X.6q2 r0 = new X.6q2
            r0.<init>(r1)
            r2.A06(r9, r0)
            X.07U r3 = X.07U.A05
            X.07Z r2 = r9.getViewLifecycleOwner()
            X.0xx r1 = X.AnonymousClass07a.A00(r2)
            r0 = 24
            X.MHJ r0 = X.MHJ.A02(r2, r3, r9, r8, r0)
            X.AnonymousClass7TE.A1Z(r0, r1)
            return
        L_0x01c2:
            X.0qQ.A0F(r6)
            goto L_0x00af
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5W.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final TargetViewSizeProvider A00(K5W k5w) {
        C61009Jv9 jv9 = k5w.A09;
        if (jv9 != null) {
            return (TargetViewSizeProvider) jv9.A06;
        }
        0qQ.A0F("trimData");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(L92 l92, K5W k5w) {
        int i;
        String str;
        if (k5w.A0E == null) {
            k5w.A03 = -1;
            return;
        }
        k5w.A0B = l92;
        int i2 = l92.A01;
        int i3 = l92.A00;
        if (k5w.A06 != null) {
            ViewGroup viewGroup = k5w.A08;
            if (viewGroup == null) {
                str = "clipsReviewContainer";
            } else {
                0nA.A0p(viewGroup, new C66029M8o(k5w, i2, i3));
                int i4 = k5w.A03;
                if (i4 != -1) {
                    i = k5w.A0T.BrU(i4);
                    k5w.A03 = -1;
                } else {
                    i = k5w.A01;
                }
                C66567MWv mWv = k5w.A0E;
                if (mWv != null) {
                    L92 l922 = k5w.A0B;
                    if (l922 != null) {
                        mWv.ETr(l922, i);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                C66567MWv mWv2 = k5w.A0E;
                if (mWv2 != null) {
                    mWv2.EcI(new C65057Lmb(k5w));
                }
                View view = k5w.A07;
                if (view == null) {
                    str = "playButton";
                } else {
                    view.setVisibility(8);
                    C66567MWv mWv3 = k5w.A0E;
                    if (mWv3 != null) {
                        mWv3.start();
                        return;
                    }
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A02(AnonymousClass8Q2 r10, K5W k5w, C349307zv r12, Integer num, Integer num2, Integer num3, Integer num4) {
        Object value;
        int i;
        int i2;
        int i3;
        int i4;
        AnonymousClass8Q2 r4;
        05G r2 = ((C60295Jit) k5w.A0X.getValue()).A02;
        do {
            value = r2.getValue();
            C60947Ju5 ju5 = (C60947Ju5) value;
            if (num != null) {
                i = num.intValue();
            } else {
                i = ju5.A02;
            }
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = ju5.A01;
            }
            if (num3 != null) {
                i3 = num3.intValue();
            } else {
                i3 = ju5.A00;
            }
            if (num4 != null) {
                i4 = num4.intValue();
            } else {
                i4 = ju5.A03;
            }
            if (r10 == null) {
                r4 = ju5.A04;
            } else {
                r4 = r10;
            }
        } while (!r2.AIY(value, new C60947Ju5(r4, r12, i, i2, i3, i4)));
    }

    public static final void A03(K5W k5w, int i) {
        int A002;
        if (k5w.A0E != null && k5w.A0B != null) {
            AnonymousClass0eM r4 = k5w.A0X;
            int A003 = C60295Jit.A00(r4) - 1;
            C66567MWv mWv = k5w.A0E;
            if (mWv != null) {
                int currentPosition = mWv.getCurrentPosition();
                if (currentPosition <= 0) {
                    A002 = C60295Jit.A00(r4) - 1;
                } else {
                    A002 = C63161KsU.A00(k5w.A0T, currentPosition);
                }
                int A032 = 0mi.A03(i + A002, 0, A003);
                if (A032 != A002 || A032 == 0 || A032 == A003) {
                    C66567MWv mWv2 = k5w.A0E;
                    if (mWv2 != null) {
                        mWv2.seekTo(k5w.A0T.BrU(A032));
                    }
                    AnonymousClass2S0.A01.A05(5);
                    C59772JXp jXp = k5w.A0D;
                    if (jXp == null) {
                        0qQ.A0F("clipsReviewPlayMode");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    int A004 = C60295Jit.A00(r4);
                    jXp.A00 = A032;
                    jXp.A01 = A004;
                    C59772JXp.A00(jXp);
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final void A04(K5W k5w, int i, int i2, int i3) {
        String str;
        ClipsReviewProgressBar clipsReviewProgressBar = k5w.A0I;
        if (clipsReviewProgressBar == null) {
            str = "reviewProgressBar";
        } else {
            clipsReviewProgressBar.setPlaybackPosition(i);
            AnonymousClass8Q3 r1 = k5w.A0C;
            if (r1 == null) {
                str = "currentReviewMode";
            } else {
                C59772JXp jXp = k5w.A0D;
                str = "clipsReviewPlayMode";
                if (jXp != null) {
                    if (r1 == jXp) {
                        C59771JXo jXo = k5w.A0S;
                        if (i2 != jXo.A00 && i2 < jXo.A01.size()) {
                            AnonymousClass8QZ r0 = k5w.A0J;
                            if (r0 == null) {
                                str = "thumbnailTrayController";
                            } else {
                                r0.A09(i2);
                                C59772JXp jXp2 = k5w.A0D;
                                if (jXp2 != null) {
                                    jXp2.A00 = i2;
                                    jXp2.A01 = i3;
                                    C59772JXp.A00(jXp2);
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A05() {
        ViewGroup viewGroup = this.A08;
        if (viewGroup == null) {
            0qQ.A0F("clipsReviewContainer");
            throw AnonymousClass00P.createAndThrow();
        }
        viewGroup.removeCallbacks(this.A0U);
        C66567MWv mWv = this.A0E;
        if (mWv != null) {
            mWv.release();
            this.A0E = null;
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0Y);
    }

    public K5W() {
        0Yh A0z = DbS.A0z(C60295Jit.class);
        this.A0X = DbS.A0I(new MMR(this, 36), new MMR(this, 37), C66291MMa.A00((Object) null, this, 27), A0z);
        this.A0W = DbS.A0I(new MMR(this, 38), MKR.A00, C66291MMa.A00((Object) null, this, 28), DbS.A0z(AnonymousClass8IT.class));
        this.A0V = DbS.A0I(new MMR(this, 40), new MMR(this, 35), C66291MMa.A00((Object) null, this, 29), DbS.A0z(C353488Hv.class));
        this.A0U = new M39(this);
        this.A0T = new C65067Lml(this);
        this.A0S = new C59771JXo();
        this.A0R = 90000;
        this.A03 = -1;
        this.A00 = Integer.MAX_VALUE;
        this.A0a = new C65125Lnn(this);
        this.A0b = new C65127Lnp();
        this.A0Z = new C65055LmZ();
    }

    public final boolean onBackPressed() {
        A05();
        AnonymousClass0eM r1 = this.A0X;
        if (!C60295Jit.A01(r1).A01.isEmpty()) {
            AnonymousClass831 r12 = (AnonymousClass831) LSY.A04(C60295Jit.A01(r1)).A00;
            0qQ.A0B(r12, 0);
            ((C60295Jit) r1.getValue()).A00 = r12;
        }
        DbV.A0I(this).A0c();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-2137249705);
        K5W.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Medium medium = (Medium) requireArguments.getParcelable(AnonymousClass000.A00(3331));
        int i2 = requireArguments.getInt(AnonymousClass000.A00(3334));
        int i3 = requireArguments.getInt(AnonymousClass000.A00(3330));
        int i4 = requireArguments.getInt(AnonymousClass000.A00(3332));
        if (medium != null) {
            boolean z = requireArguments.getBoolean(AnonymousClass000.A00(3333));
            String string = requireArguments.getString(C273654mx.A00(3359));
            C349307zv r9 = new C349307zv(medium, i2, i3, i4);
            r9.A1L = z;
            r9.A0r = string;
            r9.A07 = requireArguments.getInt(AnonymousClass000.A00(3170));
            TargetViewSizeProvider targetViewSizeProvider = (TargetViewSizeProvider) requireArguments.getParcelable(AnonymousClass000.A00(4089));
            AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) requireArguments.getParcelable(C273654mx.A00(237));
            if (targetViewSizeProvider != null) {
                this.A09 = new C61009Jv9(targetViewSizeProvider, audioOverlayTrack, r9, AnonymousClass05K.A0Y, requireArguments.getInt(AnonymousClass000.A00(3547)), requireArguments.getInt(AnonymousClass000.A00(3939)), requireArguments.getInt(AnonymousClass000.A00(3874)));
                AnonymousClass0fD.A09(317554338, A022);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 1777077915;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -1516895351;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1324298381);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_clips_review_container, false);
        AnonymousClass0fD.A09(1341879706, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(777256462);
        ((C60295Jit) this.A0X.getValue()).A01.Epw(C62479KgU.A03);
        super.onDestroy();
        AnonymousClass0fD.A09(-1689262525, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1733831340);
        K5W.super.onPause();
        C66567MWv mWv = this.A0E;
        if (mWv != null) {
            mWv.pause();
        }
        AnonymousClass0fD.A09(-1952815195, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(953123523);
        super.onResume();
        C66567MWv mWv = this.A0E;
        if (mWv != null) {
            mWv.start();
        }
        AnonymousClass0fD.A09(-1750382223, A022);
    }
}
