package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.util.Collection;
import java.util.List;

/* renamed from: X.JXh  reason: case insensitive filesystem */
public final class C59766JXh implements C355208Pb {
    public final /* synthetic */ C59767JXi A00;

    public final Integer BPR() {
        return null;
    }

    public C59766JXh(C59767JXi jXi) {
        this.A00 = jXi;
    }

    public final int BlP() {
        return C353498Hw.A02(this.A00.A0U.A00);
    }

    public final AnonymousClass51M CEK() {
        C59767JXi jXi = this.A00;
        if (jXi.A0A != jXi.A0X) {
            0kD.A07(C59767JXi.__redex_internal_original_name, "current review mode is not trim mode", (Throwable) null);
        }
        return (AnonymousClass51M) jXi.A0D.A03(jXi.A05);
    }

    public final void D0a() {
        C59767JXi jXi = this.A00;
        29R A0b = JTO.A0b(jXi.A0Q);
        1Ln A0N = JTO.A0N(A0b);
        if (A0b.A0P() && DbT.A1Y(A0N)) {
            JTO.A1V(A0N);
            JTU.A16(A0N, A0b, "GALLERY_TRIM_EDITOR_CANCEL");
            AnonymousClass283 r1 = A0b.A04;
            JTQ.A1B(A0N, r1);
            A0N.A0d(C59725JVj.PRE_CAPTURE);
            JTQ.A1A(A0N);
            JTT.A1E(A0N, r1);
            A0N.Cgf();
        }
        C59767JXi.A0B(jXi, false);
    }

    public final void D5Y() {
        ImmutableList of;
        ImmutableList immutableList;
        C353498Hw r11;
        C59767JXi jXi = this.A00;
        UserSession userSession = jXi.A0Q;
        AnonymousClass8A1.A01(userSession).A0L(AnonymousClass7TF.A0g(userSession), "gallery_review");
        AnonymousClass51M r8 = (AnonymousClass51M) jXi.A0D.A03(jXi.A05);
        int i = jXi.A02;
        int i2 = jXi.A01;
        if (i < i2) {
            27r A01 = 27p.A01(userSession);
            A01.A0m((double) JTP.A08(r8));
            AnonymousClass8Q2 r1 = jXi.A0X;
            int intValue = r1.A02.intValue();
            if (intValue == 1) {
                29R r4 = A01.A09;
                1Ln A0N = JTO.A0N(r4);
                if (r4.A0P() && DbT.A1Y(A0N)) {
                    JTO.A1V(A0N);
                    JTU.A16(A0N, r4, "GALLERY_TRIM_EDITOR_ADD");
                    AnonymousClass283 r42 = r4.A04;
                    JTQ.A1B(A0N, r42);
                    A0N.A0d(C59725JVj.PRE_CAPTURE);
                    JTQ.A1A(A0N);
                    JTT.A1E(A0N, r42);
                    A0N.Cgf();
                }
                AnonymousClass51S r3 = r8.A0E;
                List list = r3.A03;
                List list2 = r3.A02;
                if (list2 != null) {
                    of = ImmutableList.copyOf((Collection) list2);
                } else {
                    of = ImmutableList.of();
                }
                0qQ.A07(of);
                if (list != null) {
                    immutableList = ImmutableList.copyOf((Collection) list);
                } else {
                    immutableList = null;
                }
                AnonymousClass9QY r5 = jXi.A0U;
                AnonymousClass51R r14 = r8.A0F;
                boolean z = r1.A04;
                0qQ.A0B(r14, 0);
                C353498Hw.A0K(of, immutableList, r5.A00, r14, AnonymousClass05K.A01, r14.A0H, i, i2, z);
                jXi.A0c.A00 = null;
            } else if (intValue != 0) {
                if (intValue == 2) {
                    AnonymousClass9QY r7 = jXi.A0U;
                    AnonymousClass51R r12 = r8.A0F;
                    boolean z2 = r1.A04;
                    int i3 = jXi.A02;
                    int i4 = jXi.A01;
                    0qQ.A0B(r12, 0);
                    int i5 = i4 - i3;
                    r11 = r7.A00;
                    if (r11.CKX() && r11.A0J.A00 > i5) {
                        0kD.A07("ClipsCaptureControllerImpl", "remix original trimmed to shorter than recorded content", (Throwable) null);
                    }
                    ImmutableList of2 = ImmutableList.of();
                    0qQ.A07(of2);
                    C353498Hw.A0K(of2, (ImmutableList) null, r11, r12, AnonymousClass05K.A0C, r12.A0H, i3, i4, z2);
                } else if (intValue == 3) {
                    AnonymousClass9QY r52 = jXi.A0U;
                    AnonymousClass51R r122 = r8.A0F;
                    int i6 = jXi.A02;
                    int i7 = jXi.A01;
                    0qQ.A0B(r122, 0);
                    r11 = r52.A00;
                    ImmutableList of3 = ImmutableList.of();
                    0qQ.A07(of3);
                    C353498Hw.A0K(of3, (ImmutableList) null, r11, r122, AnonymousClass05K.A0N, r122.A0H, i6, i7, true);
                } else if (intValue == 4) {
                    AnonymousClass9QY r72 = jXi.A0U;
                    AnonymousClass51R r6 = r8.A0F;
                    int i8 = jXi.A02;
                    int i9 = jXi.A01;
                    0qQ.A0B(r6, 0);
                    C353498Hw r32 = r72.A00;
                    C353498Hw.A0z(r32, r6, i8, i9 - i8);
                    C353498Hw.A0g(r32);
                    jXi.A0D = (AnonymousClass831) LSY.A04(jXi.A0D).A00;
                }
                C353498Hw.A0g(r11);
            } else if (jXi.A0f == null) {
                0kD.A07(C59767JXi.__redex_internal_original_name, "clipsDirectoryProvider is null", (Throwable) null);
                return;
            } else {
                int i10 = r8.A09;
                int i11 = jXi.A02;
                if (!(i10 == i11 && r8.A08 == jXi.A01)) {
                    AnonymousClass9QY r33 = jXi.A0U;
                    int i12 = jXi.A05;
                    int i13 = jXi.A01;
                    C353498Hw r43 = r33.A00;
                    if (r43.A0E == null) {
                        0kD.A07("ClipsCaptureControllerImpl", AnonymousClass000.A00(4199), (Throwable) null);
                    } else {
                        ClipsCreationViewModel clipsCreationViewModel = r43.A1n;
                        ClipsCreationViewModel.A03(C359548d5.VIDEO_CLIP_TRIM, clipsCreationViewModel, true);
                        ClipsCreationViewModel.A05(clipsCreationViewModel, i12, i11, i13);
                    }
                    jXi.A0D = LSY.A02(r8, jXi.A0D, jXi.A05);
                    27p.A01(userSession).A1F(C59725JVj.PRE_CAPTURE);
                }
            }
            if (jXi.A0A != r1 || r1.A02 == AnonymousClass05K.A00) {
                C59767JXi.A0B(jXi, true);
                return;
            }
            return;
        }
        AnonymousClass8A1.A01(userSession).A0A("Video is too short");
        C59689JTv.A07(jXi.A0L, 2131975540);
    }

    public final void DFU() {
        C66567MWv mWv;
        C59767JXi jXi = this.A00;
        if (jXi.A0H && (mWv = jXi.A0B) != null) {
            if (!jXi.A0I || jXi.A0E == null) {
                mWv.start();
            } else {
                mWv.reset();
                C59767JXi.A05(jXi);
                C59767JXi.A09(jXi, (AnonymousClass51M) jXi.A0D.A03(jXi.A05), jXi.A02);
            }
            jXi.A0G = false;
            jXi.A0I = false;
            27p.A01(jXi.A0Q).A1F(C59725JVj.PRE_CAPTURE);
        }
    }

    public final void DFV() {
        C66567MWv mWv;
        C59767JXi jXi = this.A00;
        if (jXi.A0H && (mWv = jXi.A0B) != null) {
            jXi.A0G = true;
            mWv.pause();
        }
    }

    public final void DSn() {
        AudioOverlayTrack audioOverlayTrack;
        C59767JXi jXi = this.A00;
        ClipsCreationViewModel clipsCreationViewModel = jXi.A0a;
        C361278fx r1 = (C361278fx) clipsCreationViewModel.A0K.A06.A02();
        C3515789k r4 = jXi.A0Z;
        if ((r1 instanceof AnonymousClass8Y4) || (r1 instanceof AnonymousClass8RJ)) {
            audioOverlayTrack = (AudioOverlayTrack) r1.A00();
        } else {
            audioOverlayTrack = null;
        }
        r4.A0A(audioOverlayTrack, (MusicOverlaySearchTab) null, true, false);
        clipsCreationViewModel.A0L.A05.Epw(MusicProduct.CLIPS_CAMERA_FORMAT_V2);
        C66567MWv mWv = jXi.A0B;
        if (mWv != null) {
            mWv.pause();
        }
    }

    public final void Dgq() {
        C59767JXi jXi = this.A00;
        L92 l92 = jXi.A09;
        if (l92 != null) {
            27p.A01(jXi.A0Q).A27(false, false);
            int i = l92.A01;
            int i2 = l92.A00;
            boolean z = jXi.A0X.A04;
            if (jXi.A07 == null) {
                0kD.A07(C59767JXi.__redex_internal_original_name, "textureView is null", (Throwable) null);
            } else {
                0nA.A0p(jXi.A0N, new C41214AqC(jXi, i, i2, z));
            }
            if (jXi.A0B != null) {
                jXi.A0M.setVisibility(8);
                C66567MWv mWv = jXi.A0B;
                if (mWv != null) {
                    mWv.start();
                }
            }
        }
    }

    public final void DiT(int i) {
        C59767JXi jXi = this.A00;
        C66567MWv mWv = jXi.A0B;
        if (mWv == null) {
            C64169LRs.A02(jXi.A0L, AnonymousClass05K.A0Y, A00(jXi, "Failure user trimming video: startTimeInMs=", AnonymousClass7TE.A1A(), i), 2131974093);
            C59767JXi.A0B(jXi, false);
            return;
        }
        mWv.seekTo(i);
    }

    public final void DuD(int i) {
        C59767JXi jXi = this.A00;
        if (!jXi.A0H) {
            return;
        }
        if (jXi.A0B == null) {
            C64169LRs.A02(jXi.A0L, AnonymousClass05K.A0Y, A00(jXi, "Failure user trimming video: endTimeInMs=", AnonymousClass7TE.A1A(), i), 2131974093);
            C59767JXi.A0B(jXi, false);
            return;
        }
        jXi.A0I = false;
        jXi.A01 = i;
        jXi.A0d.A01(jXi.A05, i - jXi.A02);
        C66567MWv mWv = jXi.A0B;
        if (mWv != null) {
            mWv.seekTo(i);
        }
    }

    public final void DuF(int i) {
        C59767JXi jXi = this.A00;
        if (!jXi.A0H) {
            return;
        }
        if (jXi.A0B == null) {
            C64169LRs.A02(jXi.A0L, AnonymousClass05K.A0Y, A00(jXi, "Failure user trimming video: startTimeInMs=", AnonymousClass7TE.A1A(), i), 2131974093);
            C59767JXi.A0B(jXi, false);
            return;
        }
        jXi.A0I = true;
        jXi.A02 = i;
        jXi.A0d.A01(jXi.A05, jXi.A01 - i);
        C66567MWv mWv = jXi.A0B;
        if (mWv != null) {
            mWv.seekTo(i);
        }
    }

    public static String A00(C59767JXi jXi, String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        sb.append(" mSurface=");
        sb.append(jXi.A06);
        sb.append(" mIsShowing= ");
        sb.append(jXi.A0H);
        return sb.toString();
    }
}
