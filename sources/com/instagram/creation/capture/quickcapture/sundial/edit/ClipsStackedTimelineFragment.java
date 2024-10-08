package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.002;
import X.00k;
import X.018;
import X.05G;
import X.0eO;
import X.0eP;
import X.0kD;
import X.0mM;
import X.0qQ;
import X.0sr;
import X.182;
import X.1Ln;
import X.1QP;
import X.27r;
import X.29I;
import X.29R;
import X.2Rw;
import X.AE4;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass030;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass1YB;
import X.AnonymousClass4DR;
import X.AnonymousClass51M;
import X.AnonymousClass5MI;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass831;
import X.AnonymousClass83A;
import X.AnonymousClass861;
import X.AnonymousClass863;
import X.AnonymousClass88B;
import X.AnonymousClass89Z;
import X.AnonymousClass89v;
import X.AnonymousClass89x;
import X.AnonymousClass8A1;
import X.AnonymousClass8A2;
import X.AnonymousClass8II;
import X.AnonymousClass8M1;
import X.AnonymousClass8RF;
import X.AnonymousClass8RH;
import X.AnonymousClass8RL;
import X.AnonymousClass8RM;
import X.AnonymousClass8RN;
import X.AnonymousClass8RR;
import X.AnonymousClass8RT;
import X.AnonymousClass8RU;
import X.AnonymousClass8RV;
import X.AnonymousClass8RW;
import X.AnonymousClass8RX;
import X.AnonymousClass8RY;
import X.AnonymousClass8YU;
import X.AnonymousClass9IF;
import X.B2K;
import X.B3d;
import X.B3f;
import X.C240383Kr;
import X.C253913rc;
import X.C268714ds;
import X.C273914nO;
import X.C2802350v;
import X.C293505kq;
import X.C3493880e;
import X.C3507185x;
import X.C3516489r;
import X.C3516889w;
import X.C351888Av;
import X.C353548Ib;
import X.C354388Lv;
import X.C355708Ra;
import X.C355718Rb;
import X.C355748Rf;
import X.C355808Rl;
import X.C355828Rn;
import X.C355838Ro;
import X.C355858Rq;
import X.C355868Rr;
import X.C355878Rs;
import X.C357638Yz;
import X.C358248ab;
import X.C359548d5;
import X.C361348g5;
import X.C378669Qs;
import X.C390059qf;
import X.C390919s3;
import X.C51969G9p;
import X.C51970G9q;
import X.C53368Gms;
import X.C56673I7c;
import X.C59689JTv;
import X.C60090JfW;
import X.C60099Jff;
import X.C60105Jfl;
import X.C60107Jfn;
import X.C60108Jfo;
import X.C60109Jfp;
import X.C60237Jhu;
import X.C60241Jhy;
import X.C60320JjO;
import X.C60414Jl7;
import X.C60428JlL;
import X.C60433JlQ;
import X.C61191Jyk;
import X.C61193Jym;
import X.C61805KMt;
import X.C61806KMu;
import X.C62517Kh8;
import X.C62529KhL;
import X.C63117Krl;
import X.C63715L3z;
import X.C63848L9d;
import X.C64166LRi;
import X.C64205LTv;
import X.C64291LYr;
import X.C64703LgY;
import X.C64704Lga;
import X.C64707Lgf;
import X.C64708Lgg;
import X.C65072Lms;
import X.C65073Lmt;
import X.C65074Lmu;
import X.C65075Lmv;
import X.C65088Ln9;
import X.C65089LnA;
import X.C65092LnD;
import X.C66291MMa;
import X.C66472MTa;
import X.DbS;
import X.DbT;
import X.JTO;
import X.JTP;
import X.JTQ;
import X.JTR;
import X.JTS;
import X.JTT;
import X.K5U;
import X.KM7;
import X.KMS;
import X.KMU;
import X.L41;
import X.LGg;
import X.LRJ;
import X.LSO;
import X.LTA;
import X.LTY;
import X.LV0;
import X.MKJ;
import X.MKL;
import X.MMB;
import X.MP5;
import X.MXK;
import X.MXL;
import X.U9O;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.creation.capture.quickcapture.sundial.widget.alignmentguideview.AlignmentGuideView;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.webrtc.CameraCapturer;

public final class ClipsStackedTimelineFragment extends K5U implements DialogInterface.OnDismissListener, AnonymousClass4DR {
    public int A00;
    public int A01;
    public Dialog A02;
    public Dialog A03;
    public MediaPlayer A04;
    public Toast A05;
    public AnonymousClass030 A06;
    public 0mM A07;
    public C65075Lmv A08;
    public AnonymousClass8RN A09;
    public AnonymousClass8II A0A;
    public C64166LRi A0B;
    public MXL A0C;
    public LGg A0D;
    public KMS A0E;
    public ClipsStackedTimelineViewController A0F;
    public ClipsTimelineActionBarViewController A0G;
    public C65072Lms A0H;
    public C65072Lms A0I;
    public C65072Lms A0J;
    public C65072Lms A0K;
    public ClipsTimelineBottomSheetViewController A0L;
    public C64704Lga A0M;
    public C64703LgY A0N;
    public LSO A0O;
    public C64708Lgg A0P;
    public C64707Lgf A0Q;
    public C390919s3 A0R;
    public C65074Lmu A0S;
    public C65073Lmt A0T;
    public L41 A0U;
    public C60237Jhu A0V;
    public C60099Jff A0W;
    public C3507185x A0X;
    public C354388Lv A0Y;
    public ClipsCreationViewModel A0Z;
    public C60109Jfp A0a;
    public AnonymousClass8RL A0b;
    public AnonymousClass8RL A0c;
    public AnonymousClass8RF A0d;
    public AnonymousClass8M1 A0e;
    public C61805KMt A0f;
    public C61805KMt A0g;
    public C60108Jfo A0h;
    public C61806KMu A0i;
    public AnonymousClass861 A0j;
    public C253913rc A0k;
    public C3516889w A0l;
    public Float A0m;
    public String A0n;
    public String A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public C60428JlL A0v;
    public C60107Jfn A0w;
    public C60241Jhy A0x;
    public C60320JjO A0y;
    public AnonymousClass88B A0z;
    public String A10;
    public final AnonymousClass0eM A11;
    public final AnonymousClass0eM A12 = DbS.A0I(MMB.A00(this, 24), MKJ.A00, C66291MMa.A00((Object) null, this, 7), DbS.A0z(C353548Ib.class));
    public final AnonymousClass0eM A13;
    public final AnonymousClass0eM A14;
    public final AnonymousClass0eM A15;
    public final AnonymousClass0eM A16;
    public final AnonymousClass0eM A17;

    public static final int A01(AnonymousClass831 r7, int i) {
        if (r7 == null) {
            return 0;
        }
        int A082 = JTO.A08(r7);
        int i2 = 0;
        for (int i3 = 0; i3 < A082; i3++) {
            AnonymousClass51M r5 = (AnonymousClass51M) r7.A03(i3);
            i2 += (((int) (((float) r5.A0B()) * new BigDecimal((double) Math.abs(r5.A00)).setScale(1, RoundingMode.HALF_UP).floatValue())) / i) + 1;
        }
        return i2;
    }

    public final void A0X() {
        int i;
        int i2;
        int i3;
        Object obj;
        String str;
        C351888Av r0;
        0eP A012;
        AnonymousClass861 r02 = this.A0j;
        if (r02 == null) {
            str = "videoPlaybackViewModel";
        } else {
            AnonymousClass863 A0Z2 = JTP.A0Z(r02);
            boolean z = false;
            if (A0Z2 != null) {
                i = A0Z2.CEG();
            } else {
                i = 0;
            }
            ClipsCreationViewModel clipsCreationViewModel = this.A0Z;
            String str2 = "clipsCreationViewModel";
            if (clipsCreationViewModel != null) {
                AnonymousClass831 A0K2 = JTQ.A0K(clipsCreationViewModel);
                if (A0K2 != null) {
                    i2 = JTO.A08(A0K2);
                } else {
                    i2 = 0;
                }
                ClipsCreationViewModel clipsCreationViewModel2 = this.A0Z;
                if (clipsCreationViewModel2 != null) {
                    int A072 = JTO.A07(clipsCreationViewModel2);
                    AnonymousClass8RL r1 = this.A0c;
                    if (r1 == null) {
                        str2 = "clipsTimelineButtonEventProvider";
                    } else {
                        r1.A0F(C65092LnD.A00);
                        ClipsCreationViewModel clipsCreationViewModel3 = this.A0Z;
                        if (clipsCreationViewModel3 != null) {
                            0eP r5 = null;
                            if (!(clipsCreationViewModel3.A09 || (r0 = clipsCreationViewModel3.A02) == null || (A012 = r0.A01(true)) == null)) {
                                ClipsCreationViewModel.A04(clipsCreationViewModel3, (C293505kq) A012.A01);
                                r5 = A012;
                                Context context = getContext();
                                if (context != null) {
                                    Object obj2 = A012.A00;
                                    String A0T2 = 002.A0T(context.getString(2131952147), context.getString(((C359548d5) obj2).A00), ' ');
                                    0qQ.A0B(A0T2, 1);
                                    C59689JTv.A03(context, A0T2, (String) null, 0);
                                    if (obj2 == C359548d5.TEXT_TO_SPEECH_CHANGE) {
                                        ClipsCreationViewModel clipsCreationViewModel4 = this.A0Z;
                                        if (clipsCreationViewModel4 != null) {
                                            AnonymousClass83A r03 = clipsCreationViewModel4.A0K.A0A;
                                            String str3 = r03.A00;
                                            if (str3 != null) {
                                                try {
                                                    JTR.A1O(r03.A01.A00(str3));
                                                } catch (IOException | SecurityException unused) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            ClipsCreationViewModel clipsCreationViewModel5 = this.A0Z;
                            if (clipsCreationViewModel5 != null) {
                                AnonymousClass831 A0K3 = JTQ.A0K(clipsCreationViewModel5);
                                if (A0K3 != null) {
                                    i3 = JTO.A08(A0K3);
                                } else {
                                    i3 = 0;
                                }
                                int i4 = i3 - i2;
                                A04(i4);
                                A05(A072, i);
                                C60108Jfo jfo = this.A0h;
                                if (jfo == null) {
                                    str = "stackedTimelineViewModel";
                                } else {
                                    jfo.A0L();
                                    if (r5 != null && ((obj = r5.A00) == C359548d5.AUDIO_ADD || obj == C359548d5.AUDIO_REMOVE || obj == C359548d5.AUDIO_REPLACE)) {
                                        if (obj != C359548d5.AUDIO_REMOVE) {
                                            z = true;
                                        }
                                        A0J((C293505kq) r5.A01, z);
                                    }
                                    if (i4 < 0) {
                                        LGg lGg = this.A0D;
                                        if (lGg == null) {
                                            str2 = "timedElementTracksManager";
                                        } else {
                                            ClipsCreationViewModel clipsCreationViewModel6 = this.A0Z;
                                            if (clipsCreationViewModel6 != null) {
                                                int A073 = JTO.A07(clipsCreationViewModel6);
                                                ClipsCreationViewModel clipsCreationViewModel7 = this.A0Z;
                                                if (clipsCreationViewModel7 != null) {
                                                    int A074 = JTO.A07(clipsCreationViewModel7) - A072;
                                                    lGg.A03(A073);
                                                    lGg.A0A.A0V(A074, A073 - A074, false, false, false);
                                                }
                                            }
                                        }
                                    }
                                    27r A0I2 = JTQ.A0I(this);
                                    if (A0I2.A0J() != null) {
                                        27r.A0C(A0I2, "TIMELINE_UNDO_TAP");
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v3, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0568, code lost:
        if (r14 == 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x056a, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x08df, code lost:
        if (X.JTO.A08(r6) != 1) goto L_0x08e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0905, code lost:
        if (r6.A08 != 0) goto L_0x0907;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0917, code lost:
        if (r6 == false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0923, code lost:
        if (r37 != X.AnonymousClass8JI.REMIX) goto L_0x056b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r49, android.os.Bundle r50) {
        /*
            r48 = this;
            r2 = 0
            r3 = r49
            X.0qQ.A0B(r3, r2)
            r0 = r48
            r1 = r50
            super.onViewCreated(r3, r1)
            X.AE4 r4 = A02(r0)
            java.lang.String r1 = "on_view_created"
            r4.A04(r1)
            X.0eM r1 = r0.A05
            r47 = r1
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r47)
            X.0Tu r7 = X.DbS.A0J(r1, r2)
            r4 = 36320043046608786(0x8108e300051f92, double:3.032279699525422E-306)
            X.182.A06(r7, r1, r4)
            r4 = 2131430094(0x7f0b0ace, float:1.848188E38)
            android.view.View r1 = X.AnonymousClass7TE.A0b(r3, r4)
            r17 = 1
            X.0nA.A0m(r1, r3)
            android.view.View r6 = X.AnonymousClass7TF.A0F(r3, r4)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r6 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r6
            android.content.Context r1 = r0.requireContext()
            boolean r1 = X.0mk.A02(r1)
            if (r1 == 0) goto L_0x0049
            r6.setLayoutDirection(r2)
        L_0x0049:
            r1 = r17
            r6.setKeepObservingAfterRequestDisallowTouchEvent(r1)
            X.0r1 r5 = new X.0r1
            r5.<init>()
            X.0r1 r4 = new X.0r1
            r4.<init>()
            X.LYl r1 = new X.LYl
            r1.<init>(r6, r0, r5, r4)
            r6.CNi(r1)
            X.87s r1 = r0.A0P()
            X.4gw r1 = r1.A04
            boolean r24 = X.AnonymousClass7TF.A1V(r1)
            X.8RF r4 = r0.A0d
            java.lang.String r33 = "clipsTimelineEditorViewModel"
            r1 = 0
            if (r4 == 0) goto L_0x097c
            X.2Fj r6 = r4.A06
            X.07Z r5 = r0.getViewLifecycleOwner()
            r4 = 8
            X.C64317LZr.A00(r5, r6, r0, r4)
            X.KMt r4 = r0.A0f
            java.lang.String r16 = "stackedTimelineAudioTrackViewModel"
            if (r4 == 0) goto L_0x011b
            X.0r6 r6 = r4.A0B
            r32 = 14
            X.MG9 r5 = new X.MG9
            r4 = r32
            r5.<init>(r0, r1, r4)
            X.DbZ.A1C(r0, r5, r6)
            X.861 r4 = r0.A0j
            java.lang.String r30 = "videoPlaybackViewModel"
            if (r4 == 0) goto L_0x0977
            X.05G r5 = r4.A0J
            r15 = 15
            X.MG9 r4 = new X.MG9
            r4.<init>(r0, r1, r15)
            X.DbZ.A1C(r0, r4, r5)
            X.KMt r4 = r0.A0f
            if (r4 == 0) goto L_0x011b
            X.0r6 r5 = r4.A0C
            r18 = 24
            r4 = r18
            X.MGV r4 = X.MGV.A01(r0, r1, r4)
            X.DbZ.A1C(r0, r4, r5)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r47)
            X.0qQ.A0B(r6, r2)
            r4 = 36324539877109899(0x810cfa0001308b, double:3.035123513241609E-306)
            boolean r4 = X.182.A06(r7, r6, r4)
            if (r4 == 0) goto L_0x00df
            X.0eM r4 = r0.A12
            java.lang.Object r5 = r4.getValue()
            X.8Ib r5 = (X.C353548Ib) r5
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r47)
            com.instagram.api.schemas.MusicProduct r6 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
            java.lang.String r4 = "clips_browse"
            com.instagram.music.common.model.MusicBrowseCategory r9 = X.C64181LSn.A01(r4)
            r7 = r0
            r10 = r1
            r11 = r1
            r5.A00(r6, r7, r8, r9, r10, r11)
        L_0x00df:
            X.Jhu r9 = r0.A0V
            java.lang.String r10 = "audioEnhancementViewModel"
            if (r9 == 0) goto L_0x0972
            com.instagram.common.session.UserSession r7 = r9.A02
            X.0Tu r19 = X.0Tu.A06
            r4 = 36330432572179069(0x8112560000427d, double:3.0388500773313305E-306)
            r6 = r19
            boolean r6 = X.182.A06(r6, r7, r4)
            if (r6 == 0) goto L_0x0102
            X.8CO r8 = r9.A00
            X.LaI r7 = new X.LaI
            r6 = r17
            r7.<init>(r9, r6)
            r8.AUy(r7, r6)
        L_0x0102:
            X.Jhu r8 = r0.A0V
            if (r8 == 0) goto L_0x0972
            com.instagram.common.session.UserSession r7 = r8.A02
            r6 = r19
            boolean r4 = X.182.A06(r6, r7, r4)
            if (r4 == 0) goto L_0x0115
            X.S0L r4 = r8.A01
            r4.A00()
        L_0x0115:
            X.JjO r4 = r0.A0y
            if (r4 != 0) goto L_0x0123
            java.lang.String r16 = "clipsVideoSavedViewModel"
        L_0x011b:
            X.0qQ.A0F(r16)
        L_0x011e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0123:
            X.0pa r6 = r4.A00
            r22 = 23
            X.MG0 r5 = new X.MG0
            r4 = r22
            r5.<init>(r0, r1, r4)
            X.DbZ.A1C(r0, r5, r6)
            r4 = 2131430101(0x7f0b0ad5, float:1.8481893E38)
            androidx.recyclerview.widget.RecyclerView r9 = X.JTR.A0c(r3, r4)
            r4 = 2131430075(0x7f0b0abb, float:1.848184E38)
            android.view.View r8 = X.AnonymousClass7TF.A0F(r3, r4)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            android.content.Context r4 = r0.requireContext()
            boolean r4 = X.0mk.A02(r4)
            if (r4 == 0) goto L_0x0151
            r9.setLayoutDirection(r2)
            r8.setLayoutDirection(r2)
        L_0x0151:
            X.07U r4 = X.07U.A05
            X.07Z r6 = r0.getViewLifecycleOwner()
            X.0xx r7 = X.AnonymousClass07a.A00(r6)
            r5 = r32
            X.MHJ r5 = X.MHJ.A02(r6, r4, r0, r1, r5)
            X.19B r6 = X.19B.A00
            X.1Eo.A05(r6, r5, r7)
            com.instagram.common.session.UserSession r37 = X.AnonymousClass7TE.A0l(r47)
            android.content.Context r35 = r0.requireContext()
            X.8RF r13 = r0.A0d
            if (r13 == 0) goto L_0x097c
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r12 = r0.A0Z
            java.lang.String r23 = "clipsCreationViewModel"
            if (r12 == 0) goto L_0x096d
            X.88B r11 = r0.A0z
            java.lang.String r31 = "clipsSourceMediaViewModel"
            if (r11 == 0) goto L_0x0968
            X.Jfo r10 = r0.A0h
            java.lang.String r29 = "stackedTimelineViewModel"
            if (r10 == 0) goto L_0x0963
            X.JlL r7 = r0.A0v
            if (r7 != 0) goto L_0x018b
            java.lang.String r16 = "videoTrackAdapter"
            goto L_0x011b
        L_0x018b:
            X.89w r5 = r0.A0l
            if (r5 != 0) goto L_0x0192
            java.lang.String r16 = "bitmapTimelineViewModel"
            goto L_0x011b
        L_0x0192:
            X.89v r39 = r5.A00()
            int r14 = r0.A00
            X.KMS r5 = new X.KMS
            r34 = r5
            r36 = r9
            r38 = r7
            r40 = r12
            r41 = r13
            r42 = r10
            r43 = r11
            r44 = r14
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r0.A0E = r5
            X.Jfo r5 = r0.A0h
            if (r5 == 0) goto L_0x0963
            X.0r6 r7 = r5.A0R
            r5 = 28
            X.MGV r5 = X.MGV.A01(r0, r1, r5)
            X.DbZ.A1C(r0, r5, r7)
            com.instagram.common.session.UserSession r37 = X.AnonymousClass7TE.A0l(r47)
            android.content.Context r35 = r0.requireContext()
            X.Jfo r12 = r0.A0h
            if (r12 == 0) goto L_0x0963
            X.KMt r11 = r0.A0f
            if (r11 == 0) goto L_0x011b
            X.KMt r10 = r0.A0g
            java.lang.String r28 = "stackedTimelineVoiceoverViewModel"
            if (r10 == 0) goto L_0x095e
            X.8RF r7 = r0.A0d
            if (r7 == 0) goto L_0x097c
            X.87s r38 = r0.A0P()
            int r14 = r0.A00
            com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig r5 = r0.A02
            boolean r13 = r5.hasPinnedMusic
            X.LRi r5 = new X.LRi
            r34 = r5
            r36 = r8
            r39 = r7
            r40 = r11
            r41 = r10
            r42 = r12
            r43 = r14
            r44 = r13
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r0.A0B = r5
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r5 = r0.A0F
            java.lang.String r26 = "viewController"
            if (r5 == 0) goto L_0x0959
            android.view.ViewGroup r11 = r5.container
            if (r11 == 0) goto L_0x094f
            androidx.core.widget.NestedScrollView r10 = r5.nestedScrollView
            android.view.View r7 = r5.draggableViewCopy
            android.view.View r5 = r5.transparentView
            r20 = 2
            android.view.ViewGroup[] r8 = new android.view.ViewGroup[]{r9, r8}
            java.util.List r44 = X.0sr.A1P(r8)
            r8 = 2131430079(0x7f0b0abf, float:1.8481849E38)
            android.view.View r8 = r3.requireViewById(r8)
            java.util.List r45 = X.AnonymousClass7TE.A1I(r8)
            X.LBF r39 = new X.LBF
            r40 = r11
            r41 = r10
            r42 = r7
            r43 = r5
            r39.<init>(r40, r41, r42, r43, r44, r45)
            com.instagram.common.session.UserSession r38 = X.AnonymousClass7TE.A0l(r47)
            android.content.Context r35 = r0.requireContext()
            X.Jfo r12 = r0.A0h
            if (r12 == 0) goto L_0x0963
            X.8RF r11 = r0.A0d
            if (r11 == 0) goto L_0x097c
            X.8RL r10 = r0.A0c
            if (r10 != 0) goto L_0x0243
            java.lang.String r16 = "clipsTimelineButtonEventProvider"
            goto L_0x011b
        L_0x0243:
            X.KMu r9 = r0.A0i
            java.lang.String r27 = "timedElementsViewModel"
            if (r9 == 0) goto L_0x094a
            r5 = 2131430084(0x7f0b0ac4, float:1.8481859E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r3, r5)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r5 = 2131430091(0x7f0b0acb, float:1.8481873E38)
            android.view.View r7 = X.AnonymousClass7TF.A0G(r3, r5)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            int r13 = r0.A00
            X.LGg r5 = new X.LGg
            r34 = r5
            r36 = r8
            r37 = r7
            r40 = r10
            r41 = r11
            r42 = r12
            r43 = r9
            r44 = r13
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r0.A0D = r5
            com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig r5 = r0.A02
            boolean r5 = r5.isSlipEnabled
            java.lang.String r25 = "timedElementTracksManager"
            if (r5 == 0) goto L_0x02cf
            com.instagram.common.session.UserSession r37 = X.AnonymousClass7TE.A0l(r47)
            android.content.Context r35 = r0.requireContext()
            X.07Z r36 = r0.getViewLifecycleOwner()
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r14 = r0.A0F
            if (r14 == 0) goto L_0x0959
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r13 = r0.A0Z
            if (r13 == 0) goto L_0x096d
            X.8RF r12 = r0.A0d
            if (r12 == 0) goto L_0x097c
            X.861 r11 = r0.A0j
            if (r11 == 0) goto L_0x0977
            X.LRi r10 = r0.A0B
            if (r10 != 0) goto L_0x02a0
            java.lang.String r16 = "audioElementTracksManager"
            goto L_0x011b
        L_0x02a0:
            X.KMS r9 = r0.A0E
            if (r9 != 0) goto L_0x02a8
            java.lang.String r16 = "videoTrackViewController"
            goto L_0x011b
        L_0x02a8:
            X.LGg r8 = r0.A0D
            if (r8 == 0) goto L_0x0945
            X.Jfo r7 = r0.A0h
            if (r7 == 0) goto L_0x0963
            r5 = 32
            X.MId r46 = X.JTO.A1C(r0, r5)
            X.LSO r5 = new X.LSO
            r34 = r5
            r38 = r10
            r39 = r8
            r40 = r9
            r41 = r14
            r42 = r13
            r43 = r12
            r44 = r7
            r45 = r11
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r0.A0O = r5
        L_0x02cf:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r0.A0Z
            if (r5 == 0) goto L_0x096d
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r5 = r5.A0K
            X.0Ud r8 = r5.A0k
            X.MG0 r7 = new X.MG0
            r5 = r18
            r7.<init>(r0, r1, r5)
            X.DbZ.A1C(r0, r7, r8)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r0.A0Z
            if (r5 == 0) goto L_0x096d
            X.0pa r8 = r5.A0a
            r21 = 43
            X.MH1 r7 = new X.MH1
            r5 = r21
            r7.<init>(r0, r1, r5)
            X.DbZ.A1C(r0, r7, r8)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r0.A0Z
            if (r5 == 0) goto L_0x096d
            X.0pa r7 = r5.A0b
            r5 = 10
            X.MGV r5 = X.MGV.A01(r0, r1, r5)
            X.DbZ.A1C(r0, r5, r7)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r0.A0Z
            if (r5 == 0) goto L_0x096d
            X.83d r5 = r5.A0N
            X.0V2 r7 = r5.A05
            r5 = 11
            X.MGV r5 = X.MGV.A01(r0, r1, r5)
            X.DbZ.A1C(r0, r5, r7)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r0.A0Z
            if (r5 == 0) goto L_0x096d
            X.83d r5 = r5.A0N
            X.0V2 r7 = r5.A06
            r5 = 12
            X.MGV r5 = X.MGV.A01(r0, r1, r5)
            X.DbZ.A1C(r0, r5, r7)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r0.A0Z
            if (r5 == 0) goto L_0x096d
            X.83d r5 = r5.A0N
            X.0V2 r7 = r5.A07
            r5 = 13
            X.MGV r5 = X.MGV.A01(r0, r1, r5)
            X.DbZ.A1C(r0, r5, r7)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r0.A0Z
            if (r5 == 0) goto L_0x096d
            X.83d r5 = r5.A0N
            X.0V2 r7 = r5.A08
            r5 = r32
            X.MGV r5 = X.MGV.A01(r0, r1, r5)
            X.DbZ.A1C(r0, r5, r7)
            X.8RF r5 = r0.A0d
            if (r5 == 0) goto L_0x097c
            X.0Ud r7 = r5.A0A
            X.MGV r5 = X.MGV.A01(r0, r1, r15)
            X.DbZ.A1C(r0, r5, r7)
            X.07Z r5 = r0.getViewLifecycleOwner()
            X.0xx r7 = X.AnonymousClass07a.A00(r5)
            r37 = 0
            X.MHJ r5 = X.MHJ.A02(r5, r4, r0, r1, r15)
            X.1Eo.A05(r6, r5, r7)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r0.A0Z
            if (r5 == 0) goto L_0x096d
            X.2gB r7 = r5.A0G
            X.07Z r5 = r0.getViewLifecycleOwner()
            X.MP5 r8 = X.MP5.A00(r0, r15)
            r10 = 69
            X.Dba.A16(r5, r7, r8, r10)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r0.A0Z
            if (r5 == 0) goto L_0x096d
            X.2Fk r9 = r5.A0C
            X.07Z r7 = r0.getViewLifecycleOwner()
            r8 = 16
            X.MP5 r5 = X.MP5.A00(r0, r8)
            X.Dba.A16(r7, r9, r5, r10)
            X.85x r5 = r0.A0X
            java.lang.String r12 = "clipsAudioVolumeViewModel"
            if (r5 == 0) goto L_0x0940
            X.2Fj r5 = r5.A00
            java.lang.Object r5 = r5.A02()
            X.88W r5 = (X.AnonymousClass88W) r5
            if (r5 == 0) goto L_0x03a6
            java.lang.Object r5 = r5.A01
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L_0x03a6
            boolean r5 = r5.booleanValue()
            r0.A0r = r5
        L_0x03a6:
            X.KMt r5 = r0.A0g
            if (r5 == 0) goto L_0x095e
            X.0pa r7 = r5.A0E
            X.MGV r5 = X.MGV.A01(r0, r1, r8)
            X.DbZ.A1C(r0, r5, r7)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r0.A0Z
            if (r5 == 0) goto L_0x096d
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r5 = r5.A0K
            X.0r6 r7 = r5.A0F
            r11 = 17
            X.MGV r5 = X.MGV.A01(r0, r1, r11)
            X.DbZ.A1C(r0, r5, r7)
            X.0eM r5 = r0.A17
            boolean r5 = X.AnonymousClass7TF.A1Z(r5)
            if (r5 == 0) goto L_0x03db
            X.07Z r5 = r0.getViewLifecycleOwner()
            X.0xx r7 = X.AnonymousClass07a.A00(r5)
            X.MHJ r5 = X.MHJ.A02(r5, r4, r0, r1, r8)
            X.1Eo.A05(r6, r5, r7)
        L_0x03db:
            X.07Z r40 = r0.getViewLifecycleOwner()
            X.0xx r7 = X.AnonymousClass07a.A00(r40)
            X.MHF r5 = new X.MHF
            r38 = r5
            r39 = r3
            r41 = r4
            r42 = r0
            r43 = r1
            r44 = r2
            r38.<init>(r39, r40, r41, r42, r43, r44)
            X.07Z r7 = X.JTP.A0I(r0, r6, r5, r7)
            X.0xx r5 = X.AnonymousClass07a.A00(r7)
            X.MHJ r4 = X.MHJ.A02(r7, r4, r0, r1, r11)
            X.1Eo.A05(r6, r4, r5)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r4 = r0.A0Z
            if (r4 == 0) goto L_0x096d
            X.2Fk r7 = r4.A0E
            X.07Z r5 = r0.getViewLifecycleOwner()
            X.KMu r4 = r0.A0i
            if (r4 == 0) goto L_0x094a
            r9 = 31
            X.MId r4 = X.JTO.A1C(r4, r9)
            X.Dba.A16(r5, r7, r4, r10)
            X.861 r4 = r0.A0j
            if (r4 == 0) goto L_0x0977
            X.2Fj r7 = r4.A0A
            X.07Z r5 = r0.getViewLifecycleOwner()
            X.MP5 r4 = X.MP5.A00(r0, r11)
            X.Dba.A16(r5, r7, r4, r10)
            X.861 r4 = r0.A0j
            if (r4 == 0) goto L_0x0977
            X.2Fj r7 = r4.A0G
            X.07Z r5 = r0.getViewLifecycleOwner()
            r4 = 18
            X.MP5 r4 = X.MP5.A00(r0, r4)
            X.Dba.A16(r5, r7, r4, r10)
            X.85x r4 = r0.A0X
            if (r4 == 0) goto L_0x0940
            X.2Fj r7 = r4.A00
            X.07Z r5 = r0.getViewLifecycleOwner()
            r4 = 9
            X.C64317LZr.A00(r5, r7, r0, r4)
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r47)
            X.0qQ.A0B(r11, r2)
            r4 = 36323715243453867(0x810c3a00022dab, double:3.034602011597001E-306)
            r7 = r19
            boolean r7 = X.182.A06(r7, r11, r4)
            if (r7 == 0) goto L_0x047a
            X.85x r7 = r0.A0X
            if (r7 == 0) goto L_0x0940
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r7 = r7.A01
            X.0Ud r7 = r7.A0k
            androidx.lifecycle.CoroutineLiveData r11 = X.C226292g8.A00(r6, r7)
            X.07Z r7 = r0.getViewLifecycleOwner()
            r6 = 19
            X.MP5 r6 = X.MP5.A00(r0, r6)
            X.Dba.A16(r7, r11, r6, r10)
        L_0x047a:
            X.Jfo r6 = r0.A0h
            if (r6 == 0) goto L_0x0963
            X.0pa r7 = r6.A0f
            r33 = 19
            r6 = r33
            X.MGV r6 = X.MGV.A01(r0, r1, r6)
            X.DbZ.A1C(r0, r6, r7)
            X.Jfo r6 = r0.A0h
            if (r6 == 0) goto L_0x0963
            X.0r6 r7 = r6.A0P
            r32 = 20
            r6 = r32
            X.MGV r6 = X.MGV.A01(r0, r1, r6)
            X.DbZ.A1C(r0, r6, r7)
            X.Jfo r6 = r0.A0h
            if (r6 == 0) goto L_0x0963
            X.0pa r10 = r6.A0g
            r30 = 38
            X.MGu r7 = new X.MGu
            r6 = r30
            r7.<init>(r0, r1, r6)
            X.DbZ.A1C(r0, r7, r10)
            X.Jfo r6 = r0.A0h
            if (r6 == 0) goto L_0x0963
            X.0r6 r7 = r6.A0S
            r12 = 21
            X.MGV r6 = X.MGV.A01(r0, r1, r12)
            X.DbZ.A1C(r0, r6, r7)
            X.Jfo r6 = r0.A0h
            if (r6 == 0) goto L_0x0963
            X.0r6 r7 = r6.A0O
            r11 = 22
            X.MGV r6 = X.MGV.A01(r0, r1, r11)
            X.DbZ.A1C(r0, r6, r7)
            X.Jfo r6 = r0.A0h
            if (r6 == 0) goto L_0x0963
            X.0r6 r7 = r6.A0N
            r10 = 39
            X.MGu r6 = new X.MGu
            r6.<init>(r0, r1, r10)
            X.0pz r13 = X.JTO.A1I(r6, r7)
            r6 = 100
            X.0r6 r7 = X.AnonymousClass11F.A00(r13, r6)
            X.MG0 r6 = new X.MG0
            r6.<init>(r0, r1, r12)
            X.DbZ.A1C(r0, r6, r7)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r6 = r0.A0F
            if (r6 == 0) goto L_0x0959
            androidx.coordinatorlayout.widget.CoordinatorLayout r7 = r6.tracksContainer
            if (r7 == 0) goto L_0x04f7
            r6 = 6
            X.LYT.A00(r7, r6, r0)
        L_0x04f7:
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r6 = r0.A0G
            java.lang.String r35 = "actionBarViewController"
            if (r6 == 0) goto L_0x0954
            X.LYS r7 = X.LYS.A00
            X.0qQ.A0B(r7, r2)
            com.instagram.creation.capture.quickcapture.sundial.edit.views.ClipsTimelineConstraintLayout r6 = r6.actionBarContainer
            if (r6 == 0) goto L_0x0509
            r6.addOnLayoutChangeListener(r7)
        L_0x0509:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r6 = r0.A0Z
            if (r6 == 0) goto L_0x096d
            X.8Av r6 = r6.A02
            if (r6 == 0) goto L_0x0934
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r6 = r6.A00
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r6 = r6.A0H
            X.8g5 r6 = r6.A05
            X.0Ud r13 = r6.A05
        L_0x0519:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r6 = r0.A0Z
            if (r6 == 0) goto L_0x096d
            X.8Av r6 = r6.A02
            if (r6 == 0) goto L_0x092e
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r6 = r6.A00
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r6 = r6.A0H
            X.8g5 r6 = r6.A05
            X.0Ud r7 = r6.A04
        L_0x0529:
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment$onViewCreated$40 r6 = new com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment$onViewCreated$40
            r6.<init>(r0, r1)
            X.0pm r7 = X.AnonymousClass10H.A03(r6, r13, r7)
            X.0xx r6 = X.DbV.A0J(r0)
            X.AnonymousClass11O.A03(r6, r7)
            X.Jfo r6 = r0.A0h
            if (r6 == 0) goto L_0x0963
            X.0pa r7 = r6.A0h
            r6 = r22
            X.MGV r6 = X.MGV.A01(r0, r1, r6)
            X.DbZ.A1C(r0, r6, r7)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r13 = r0.A0F
            if (r13 == 0) goto L_0x0959
            X.Jfo r6 = r0.A0h
            if (r6 == 0) goto L_0x0963
            java.lang.Integer r7 = r6.A0G()
            if (r7 == 0) goto L_0x0885
            int r14 = r7.intValue()
            X.8JI r7 = X.AnonymousClass8JI.SEQUENTIAL_REMIX
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r6 = r6.A0E
            X.83H r6 = r6.A0L
            X.8J0 r6 = r6.A00
            if (r6 == 0) goto L_0x0885
            X.8JI r6 = r6.A03
            if (r7 != r6) goto L_0x0885
            if (r14 != 0) goto L_0x0885
        L_0x056a:
            r14 = 0
        L_0x056b:
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r6 = r13.A0C
            android.view.ViewGroup r6 = r6.A03()
            r6.setEnabled(r14)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r7 = r0.A0F
            if (r7 == 0) goto L_0x0959
            X.LXJ r14 = new X.LXJ
            r6 = r24
            r14.<init>(r2, r0, r6)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r15 = r7.A0C
            r7 = 17
            X.LYG r13 = X.LYG.A01(r15, r14, r7)
            android.view.ViewGroup r6 = r15.A03()
            X.AnonymousClass0fU.A00(r13, r6)
            X.KjH r6 = X.C62636KjH.A0J
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r14, r6, r15)
            X.Jfo r6 = r0.A0h
            if (r6 == 0) goto L_0x0963
            X.0Ud r13 = r6.A0k
            X.MG0 r6 = new X.MG0
            r6.<init>(r0, r1, r11)
            X.DbZ.A1C(r0, r6, r13)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r14 = r0.A0F
            if (r14 == 0) goto L_0x0959
            r6 = r32
            X.LY4 r15 = X.LY4.A00(r0, r6)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r13 = r14.A0C
            X.KjH r6 = X.C62636KjH.A03
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r15, r6, r13)
            com.instagram.common.ui.widget.imageview.IgImageView r6 = r14.addClipsFloatingButton
            if (r6 == 0) goto L_0x05b9
            X.AnonymousClass0fU.A00(r15, r6)
        L_0x05b9:
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r6 = r0.A0F
            if (r6 == 0) goto L_0x0959
            X.LY4 r13 = X.LY4.A00(r0, r12)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r12 = r6.A0C
            X.KjH r6 = X.C62636KjH.A0B
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r13, r6, r12)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r6 = r0.A0F
            if (r6 == 0) goto L_0x0959
            X.LY4 r12 = X.LY4.A00(r0, r11)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r11 = r6.A0C
            X.KjH r6 = X.C62636KjH.A02
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r12, r6, r11)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r11 = r0.A0F
            if (r11 == 0) goto L_0x0959
            r6 = r22
            X.LY4 r12 = X.LY4.A00(r0, r6)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r11 = r11.A0C
            X.KjH r6 = X.C62636KjH.A0O
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r12, r6, r11)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r11 = r0.A0F
            if (r11 == 0) goto L_0x0959
            r6 = r18
            X.LY4 r12 = X.LY4.A00(r0, r6)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r11 = r11.A0C
            X.KjH r6 = X.C62636KjH.A06
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r12, r6, r11)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r47)
            X.0qQ.A0B(r6, r2)
            r2 = r19
            boolean r2 = X.182.A06(r2, r6, r4)
            if (r2 == 0) goto L_0x0619
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r0.A0F
            if (r2 == 0) goto L_0x0959
            r4 = 25
            X.LY4 r5 = X.LY4.A00(r0, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r2.A0C
            X.KjH r2 = X.C62636KjH.A0F
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r5, r2, r4)
        L_0x0619:
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r0.A0F
            if (r2 == 0) goto L_0x0959
            r11 = 26
            X.LY4 r5 = X.LY4.A00(r0, r11)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r2.A0C
            X.KjH r2 = X.C62636KjH.A05
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r5, r2, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r4 = r0.A0F
            if (r4 == 0) goto L_0x0959
            r6 = 27
            X.LY4 r2 = X.LY4.A00(r0, r6)
            r4.EiY(r2)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r0.A0F
            if (r2 == 0) goto L_0x0959
            r4 = 28
            X.LY4 r5 = X.LY4.A00(r0, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r2.A0C
            r2 = r33
            X.LYG r2 = X.LYG.A01(r4, r5, r2)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r4 = r4.reorderDoneButton
            if (r4 == 0) goto L_0x093d
            X.AnonymousClass0fU.A00(r2, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r0.A0F
            if (r2 == 0) goto L_0x0959
            r12 = 29
            X.LY4 r5 = X.LY4.A00(r0, r12)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r2.A0C
            X.KjH r2 = X.C62636KjH.A0W
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r5, r2, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r4 = r0.A0F
            if (r4 == 0) goto L_0x0959
            r5 = 30
            X.LY4 r2 = X.LY4.A00(r0, r5)
            r4.ET9(r2)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r0.A0F
            if (r2 == 0) goto L_0x0959
            X.AOX r13 = new X.AOX
            r13.<init>((java.lang.Object) r0, (int) r8)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r2.A0C
            X.KjH r2 = X.C62636KjH.A0Q
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r13, r2, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r14 = r0.A0F
            if (r14 == 0) goto L_0x0959
            X.LXJ r13 = new X.LXJ
            r4 = r24
            r2 = r17
            r13.<init>(r2, r0, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r14.A0C
            X.KjH r2 = X.C62636KjH.A09
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r13, r2, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r14 = r0.A0F
            if (r14 == 0) goto L_0x0959
            X.LXJ r13 = new X.LXJ
            r4 = r20
            r2 = r24
            r13.<init>(r4, r0, r2)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r14.A0C
            X.KjH r2 = X.C62636KjH.A0C
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r13, r2, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r0.A0F
            if (r2 == 0) goto L_0x0959
            X.LY4 r13 = X.LY4.A00(r0, r9)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r2.A0C
            X.KjH r2 = X.C62636KjH.A0A
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r13, r2, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r0.A0F
            if (r2 == 0) goto L_0x0959
            r13 = 32
            X.LY4 r14 = X.LY4.A00(r0, r13)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r2.A0C
            com.instagram.igds.components.mediabutton.IgdsMediaButton r2 = r4.addGifButton
            if (r2 == 0) goto L_0x093a
            X.AnonymousClass0fU.A00(r14, r2)
            X.KjH r2 = X.C62636KjH.A04
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r14, r2, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r0.A0F
            if (r2 == 0) goto L_0x0959
            r4 = 33
            X.LY4 r14 = X.LY4.A00(r0, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r2.A0C
            r2 = 14
            X.LYG r2 = X.LYG.A01(r4, r14, r2)
            android.view.ViewGroup r4 = r4.backButton
            if (r4 == 0) goto L_0x06e6
            X.AnonymousClass0fU.A00(r2, r4)
        L_0x06e6:
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r0.A0F
            if (r2 == 0) goto L_0x0959
            r4 = 34
            X.LY4 r14 = X.LY4.A00(r0, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r2.A0C
            r2 = 15
            X.LYG r2 = X.LYG.A01(r4, r14, r2)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r4 = r4.cancelButton
            if (r4 == 0) goto L_0x0952
            X.AnonymousClass0fU.A00(r2, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r0.A0F
            if (r2 == 0) goto L_0x0959
            r4 = 35
            X.LY4 r14 = X.LY4.A00(r0, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r2.A0C
            X.KjH r2 = X.C62636KjH.A0U
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r14, r2, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r0.A0F
            if (r2 == 0) goto L_0x0959
            r4 = 36
            X.LY4 r14 = X.LY4.A00(r0, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r2.A0C
            X.KjH r2 = X.C62636KjH.A0c
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r14, r2, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r0.A0F
            if (r2 == 0) goto L_0x0959
            r4 = 37
            X.LY4 r14 = X.LY4.A00(r0, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r2.A0C
            X.KjH r2 = X.C62636KjH.A0d
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r14, r2, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r0.A0F
            if (r2 == 0) goto L_0x0959
            r4 = r30
            X.LY4 r14 = X.LY4.A00(r0, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r2.A0C
            X.KjH r2 = X.C62636KjH.A0L
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r14, r2, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r0.A0F
            if (r2 == 0) goto L_0x0959
            X.LY4 r10 = X.LY4.A00(r0, r10)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r2.A0C
            X.KjH r2 = X.C62636KjH.A0M
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r10, r2, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r10 = r0.A0G
            if (r10 == 0) goto L_0x0954
            r14 = 40
            X.LY4 r4 = X.LY4.A00(r0, r14)
            X.KjH r2 = X.C62636KjH.A0h
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r4, r2, r10)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r10 = r0.A0G
            if (r10 == 0) goto L_0x0954
            r2 = 41
            X.LY4 r4 = X.LY4.A00(r0, r2)
            X.KjH r2 = X.C62636KjH.A0g
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r4, r2, r10)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r0.A0F
            if (r2 == 0) goto L_0x0959
            r4 = 42
            X.LY4 r10 = X.LY4.A00(r0, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r2.A0C
            X.KjH r2 = X.C62636KjH.A0N
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r10, r2, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r0.A0G
            if (r4 == 0) goto L_0x0954
            r2 = r21
            X.LY4 r10 = X.LY4.A00(r0, r2)
            X.KjH r2 = X.C62636KjH.A0G
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r10, r2, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r10 = r0.A0G
            if (r10 == 0) goto L_0x0954
            r2 = 44
            X.LY4 r4 = X.LY4.A00(r0, r2)
            X.KjH r2 = X.C62636KjH.A0f
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r4, r2, r10)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = r0.A0G
            if (r4 == 0) goto L_0x0954
            X.AOX r2 = new X.AOX
            r2.<init>((java.lang.Object) r0, (int) r7)
            X.KjH r7 = X.C62636KjH.A0I
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r2, r7, r4)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r7 = r0.A0G
            if (r7 == 0) goto L_0x0954
            r2 = 45
            X.LY4 r4 = X.LY4.A00(r0, r2)
            X.KjH r2 = X.C62636KjH.A0b
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r4, r2, r7)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r7 = r0.A0G
            if (r7 == 0) goto L_0x0954
            r2 = 46
            X.LY4 r4 = X.LY4.A00(r0, r2)
            X.KjH r2 = X.C62636KjH.A0V
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController.A01(r4, r2, r7)
            X.KMu r2 = r0.A0i
            if (r2 == 0) goto L_0x094a
            X.0pa r4 = r2.A0H
            r2 = 25
            X.MGV r2 = X.MGV.A01(r0, r1, r2)
            X.DbZ.A1C(r0, r2, r4)
            X.KMu r2 = r0.A0i
            if (r2 == 0) goto L_0x094a
            X.0pa r2 = r2.A0G
            X.MGV r4 = X.MGV.A01(r0, r1, r11)
            X.DbZ.A1C(r0, r4, r2)
            X.KMu r2 = r0.A0i
            if (r2 == 0) goto L_0x094a
            X.0pa r4 = r2.A0F
            X.MGu r2 = new X.MGu
            r2.<init>(r0, r1, r14)
            X.DbZ.A1C(r0, r2, r4)
            A0A(r0)
            X.KMu r2 = r0.A0i
            if (r2 == 0) goto L_0x094a
            X.0pa r4 = r2.A0I
            X.MGV r2 = X.MGV.A01(r0, r1, r6)
            X.DbZ.A1C(r0, r2, r4)
            android.media.MediaPlayer r4 = r0.A04
            if (r4 == 0) goto L_0x080e
            X.LVD r2 = X.LVD.A00
            r4.setOnCompletionListener(r2)
        L_0x080e:
            X.KMu r2 = r0.A0i
            if (r2 == 0) goto L_0x094a
            X.0Ud r4 = r2.A0J
            X.MGV r2 = X.MGV.A01(r0, r1, r12)
            X.DbZ.A1C(r0, r2, r4)
            X.KMu r2 = r0.A0i
            if (r2 == 0) goto L_0x094a
            X.0pa r4 = r2.A05
            X.MGV r2 = X.MGV.A01(r0, r1, r5)
            X.DbZ.A1C(r0, r2, r4)
            X.KMt r2 = r0.A0f
            if (r2 == 0) goto L_0x011b
            X.0pa r4 = r2.A05
            X.MGV r2 = X.MGV.A01(r0, r1, r9)
            X.DbZ.A1C(r0, r2, r4)
            X.KMt r2 = r0.A0g
            if (r2 == 0) goto L_0x095e
            X.0pa r4 = r2.A05
            X.MGV r2 = X.MGV.A01(r0, r1, r13)
            X.DbZ.A1C(r0, r2, r4)
            java.lang.String r2 = r0.A10
            if (r2 == 0) goto L_0x0868
            X.LGg r2 = r0.A0D
            if (r2 == 0) goto L_0x0945
            r2.A01()
            X.KMu r2 = r0.A0i
            if (r2 == 0) goto L_0x094a
            X.LTY r2 = r2.A01
            X.Jyn r2 = r2.A0F()
            if (r2 == 0) goto L_0x0883
            int r4 = r2.A05
        L_0x085b:
            X.M6r r2 = new X.M6r
            r2.<init>(r0, r4)
            r3.post(r2)
            A06(r0)
            r0.A10 = r1
        L_0x0868:
            boolean r2 = r0.A0u
            if (r2 == 0) goto L_0x0874
            X.M2y r2 = new X.M2y
            r2.<init>(r0)
            r3.post(r2)
        L_0x0874:
            X.Jfo r2 = r0.A0h
            if (r2 == 0) goto L_0x0963
            X.0Ud r3 = r2.A0j
            X.MG9 r2 = new X.MG9
            r2.<init>(r0, r1, r8)
            X.DbZ.A1C(r0, r2, r3)
            return
        L_0x0883:
            r4 = 0
            goto L_0x085b
        L_0x0885:
            com.instagram.common.session.UserSession r38 = X.AnonymousClass7TE.A0l(r47)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r7 = r0.A0Z
            if (r7 == 0) goto L_0x096d
            X.83H r6 = r7.A0L
            X.8J0 r6 = r6.A00
            if (r6 == 0) goto L_0x0897
            X.8JI r6 = r6.A03
            r37 = r6
        L_0x0897:
            boolean r6 = r7.A0r()
            r36 = r6 ^ 1
            X.88B r6 = r0.A0z
            if (r6 == 0) goto L_0x0968
            java.io.File r6 = r6.A01
            if (r6 == 0) goto L_0x092b
            java.lang.String r15 = r6.getPath()
        L_0x08a9:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r6 = r0.A0Z
            if (r6 == 0) goto L_0x096d
            X.2gB r6 = r6.A0F
            X.831 r6 = X.JTO.A0h(r6)
            if (r6 == 0) goto L_0x0929
            X.51O r6 = r6.A04(r2)
            X.51N r6 = (X.AnonymousClass51N) r6
            if (r6 == 0) goto L_0x0929
            java.lang.String r7 = r6.A08()
        L_0x08c1:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r6 = r0.A0Z
            if (r6 == 0) goto L_0x096d
            boolean r6 = r6.A0s()
            r34 = r6 ^ 1
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r6 = r0.A0Z
            if (r6 == 0) goto L_0x096d
            X.2gB r6 = r6.A0F
            X.831 r6 = X.JTO.A0h(r6)
            if (r6 == 0) goto L_0x08e1
            int r14 = X.JTO.A08(r6)
            r31 = 1
            r6 = r17
            if (r14 == r6) goto L_0x08e3
        L_0x08e1:
            r31 = 0
        L_0x08e3:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r6 = r0.A0Z
            if (r6 == 0) goto L_0x096d
            X.2gB r6 = r6.A0F
            X.831 r6 = X.JTO.A0h(r6)
            if (r6 == 0) goto L_0x0927
            X.51O r14 = r6.A04(r2)
            X.51N r14 = (X.AnonymousClass51N) r14
        L_0x08f5:
            boolean r6 = r14 instanceof X.AnonymousClass51M
            if (r6 == 0) goto L_0x0907
            X.51M r14 = (X.AnonymousClass51M) r14
            if (r14 == 0) goto L_0x0907
            X.51R r6 = r14.A0F
            if (r6 == 0) goto L_0x0907
            int r6 = r6.A08
            r23 = 1
            if (r6 == 0) goto L_0x0909
        L_0x0907:
            r23 = 0
        L_0x0909:
            r14 = 1
            r23 = r23 ^ 1
            r6 = r38
            X.0qQ.A0B(r6, r2)
            boolean r6 = X.0qQ.A0K(r15, r7)
            if (r36 != 0) goto L_0x0919
            if (r6 == 0) goto L_0x056b
        L_0x0919:
            if (r34 == 0) goto L_0x056b
            if (r31 == 0) goto L_0x056b
            if (r23 == 0) goto L_0x056b
            X.8JI r7 = X.AnonymousClass8JI.REMIX
            r6 = r37
            if (r6 != r7) goto L_0x056b
            goto L_0x056a
        L_0x0927:
            r14 = 0
            goto L_0x08f5
        L_0x0929:
            r7 = 0
            goto L_0x08c1
        L_0x092b:
            r15 = 0
            goto L_0x08a9
        L_0x092e:
            X.02z r7 = X.JTQ.A0r(r2)
            goto L_0x0529
        L_0x0934:
            X.02z r13 = X.JTQ.A0r(r2)
            goto L_0x0519
        L_0x093a:
            java.lang.String r35 = "addGifButton"
            goto L_0x0954
        L_0x093d:
            java.lang.String r35 = "reorderDoneButton"
            goto L_0x0954
        L_0x0940:
            X.0qQ.A0F(r12)
            goto L_0x011e
        L_0x0945:
            X.0qQ.A0F(r25)
            goto L_0x011e
        L_0x094a:
            X.0qQ.A0F(r27)
            goto L_0x011e
        L_0x094f:
            java.lang.String r35 = "container"
            goto L_0x0954
        L_0x0952:
            java.lang.String r35 = "cancelButton"
        L_0x0954:
            X.0qQ.A0F(r35)
            goto L_0x011e
        L_0x0959:
            X.0qQ.A0F(r26)
            goto L_0x011e
        L_0x095e:
            X.0qQ.A0F(r28)
            goto L_0x011e
        L_0x0963:
            X.0qQ.A0F(r29)
            goto L_0x011e
        L_0x0968:
            X.0qQ.A0F(r31)
            goto L_0x011e
        L_0x096d:
            X.0qQ.A0F(r23)
            goto L_0x011e
        L_0x0972:
            X.0qQ.A0F(r10)
            goto L_0x011e
        L_0x0977:
            X.0qQ.A0F(r30)
            goto L_0x011e
        L_0x097c:
            X.0qQ.A0F(r33)
            goto L_0x011e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r5, X.AnonymousClass4D7 r6) {
        /*
            r3 = 41
            boolean r0 = X.C66128MDg.A01(r3, r6)
            if (r0 == 0) goto L_0x006b
            r4 = r6
            X.MDg r4 = (X.C66128MDg) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006b
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x005b
            if (r0 != r2) goto L_0x0093
            java.lang.Object r5 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r5 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r5
            X.0eS.A00(r1)
        L_0x0028:
            X.LgY r0 = r5.A0N
            r3 = 0
            if (r0 == 0) goto L_0x0059
            java.lang.Integer r1 = r0.A07
        L_0x002f:
            X.LgY r0 = r5.A0N
            if (r0 == 0) goto L_0x0035
            java.lang.Integer r3 = r0.A09
        L_0x0035:
            com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig r0 = r5.A02
            boolean r0 = r0.isSlipEnabled
            if (r0 == 0) goto L_0x008e
            X.0eM r0 = r5.A16
            boolean r0 = X.G9t.A1b(r0)
            if (r0 == 0) goto L_0x008e
            if (r1 == 0) goto L_0x008e
            if (r3 == 0) goto L_0x008e
            int r2 = r1.intValue()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r5.A0Z
            if (r0 != 0) goto L_0x0071
            java.lang.String r0 = "clipsCreationViewModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0059:
            r1 = r3
            goto L_0x002f
        L_0x005b:
            X.0eS.A00(r1)
            r0 = 80
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r0 = X.C241603Pv.A01(r4, r0)
            if (r0 != r3) goto L_0x0028
            return r3
        L_0x006b:
            X.MDg r4 = new X.MDg
            r4.<init>(r5, r6, r3)
            goto L_0x0016
        L_0x0071:
            X.831 r1 = X.JTQ.A0K(r0)
            if (r1 == 0) goto L_0x0091
            int r0 = r3.intValue()
            X.51M r0 = X.JTO.A0f(r1, r0)
            if (r0 == 0) goto L_0x0091
            X.51R r0 = r0.A0F
            int r0 = r0.A04
        L_0x0085:
            if (r2 >= r0) goto L_0x008e
            X.LSO r0 = r5.A0O
            if (r0 == 0) goto L_0x008e
            r0.A04()
        L_0x008e:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0091:
            r0 = 0
            goto L_0x0085
        L_0x0093:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A03(com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04(int r4) {
        /*
            r3 = this;
            X.8RF r0 = r3.A0d
            java.lang.String r2 = "clipsTimelineEditorViewModel"
            if (r0 == 0) goto L_0x0022
            X.8RH r1 = r0.A0E()
            boolean r0 = r1 instanceof X.C355868Rr
            if (r0 != 0) goto L_0x0018
            boolean r0 = r1 instanceof X.AnonymousClass8Rc
            if (r0 != 0) goto L_0x001a
            boolean r0 = r1 instanceof X.C355738Re
            if (r0 != 0) goto L_0x001a
            boolean r4 = r1 instanceof X.C355748Rf
        L_0x0018:
            if (r4 == 0) goto L_0x0021
        L_0x001a:
            X.8RF r0 = r3.A0d
            if (r0 == 0) goto L_0x0022
            X.JTR.A1M(r0)
        L_0x0021:
            return
        L_0x0022:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A04(int):void");
    }

    public static final void A06(ClipsStackedTimelineFragment clipsStackedTimelineFragment) {
        String str;
        LGg lGg = clipsStackedTimelineFragment.A0D;
        if (lGg == null) {
            str = "timedElementTracksManager";
        } else {
            int A022 = JTT.A02(lGg.A02) * JTR.A0E(lGg.A0A.A01);
            ClipsStackedTimelineViewController clipsStackedTimelineViewController = clipsStackedTimelineFragment.A0F;
            if (clipsStackedTimelineViewController == null) {
                str = "viewController";
            } else {
                NestedScrollView nestedScrollView = clipsStackedTimelineViewController.nestedScrollView;
                if (nestedScrollView != null) {
                    nestedScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new C64291LYr(nestedScrollView, A022, 1));
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A07(ClipsStackedTimelineFragment clipsStackedTimelineFragment) {
        String str;
        if (AnonymousClass7TF.A1Z(clipsStackedTimelineFragment.A17)) {
            ClipsCreationViewModel clipsCreationViewModel = clipsStackedTimelineFragment.A0Z;
            if (clipsCreationViewModel == null) {
                str = "clipsCreationViewModel";
            } else if (!clipsCreationViewModel.A0r()) {
                C61806KMu kMu = clipsStackedTimelineFragment.A0i;
                if (kMu == null) {
                    str = "timedElementsViewModel";
                } else {
                    kMu.A0N();
                    return;
                }
            } else {
                return;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A08(ClipsStackedTimelineFragment clipsStackedTimelineFragment) {
        String str;
        int i = clipsStackedTimelineFragment.A00 / 2;
        C60108Jfo jfo = clipsStackedTimelineFragment.A0h;
        if (jfo == null) {
            str = "stackedTimelineViewModel";
        } else {
            Integer valueOf = Integer.valueOf(i);
            jfo.A0V(valueOf, valueOf);
            ClipsCreationViewModel clipsCreationViewModel = clipsStackedTimelineFragment.A0Z;
            if (clipsCreationViewModel == null) {
                str = "clipsCreationViewModel";
            } else {
                int A072 = JTO.A07(clipsCreationViewModel);
                ClipsStackedTimelineViewController clipsStackedTimelineViewController = clipsStackedTimelineFragment.A0F;
                if (clipsStackedTimelineViewController != null) {
                    clipsStackedTimelineViewController.A0V(A072, false);
                    C64166LRi lRi = clipsStackedTimelineFragment.A0B;
                    if (lRi != null) {
                        lRi.A04(i);
                        LGg lGg = clipsStackedTimelineFragment.A0D;
                        if (lGg != null) {
                            lGg.A03(A072);
                            LGg lGg2 = clipsStackedTimelineFragment.A0D;
                            if (lGg2 != null) {
                                lGg2.A00();
                                AnonymousClass861 r0 = clipsStackedTimelineFragment.A0j;
                                str = "videoPlaybackViewModel";
                                if (r0 != null) {
                                    int A002 = r0.A00();
                                    int A003 = C63117Krl.A00(clipsStackedTimelineFragment.requireContext(), A002);
                                    ClipsStackedTimelineViewController clipsStackedTimelineViewController2 = clipsStackedTimelineFragment.A0F;
                                    if (clipsStackedTimelineViewController2 != null) {
                                        clipsStackedTimelineViewController2.A0J(A003);
                                        C64166LRi lRi2 = clipsStackedTimelineFragment.A0B;
                                        if (lRi2 != null) {
                                            Iterator A012 = C64166LRi.A01(lRi2);
                                            while (A012.hasNext()) {
                                                JTO.A0e(A012).A0J(A003);
                                            }
                                            Iterator A004 = C64166LRi.A00(lRi2);
                                            while (A004.hasNext()) {
                                                JTO.A0e(A004).A0J(A003);
                                            }
                                            KMS kms = clipsStackedTimelineFragment.A0E;
                                            if (kms == null) {
                                                str = "videoTrackViewController";
                                            } else {
                                                kms.A0J(A003);
                                                LGg lGg3 = clipsStackedTimelineFragment.A0D;
                                                if (lGg3 != null) {
                                                    Iterator it = lGg3.A0C.iterator();
                                                    while (it.hasNext()) {
                                                        JTO.A0e(it).A0J(A003);
                                                    }
                                                    Iterator it2 = lGg3.A0B.iterator();
                                                    while (it2.hasNext()) {
                                                        JTO.A0e(it2).A0J(A003);
                                                    }
                                                    AnonymousClass861 r02 = clipsStackedTimelineFragment.A0j;
                                                    if (r02 != null) {
                                                        r02.A06(A002);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        0qQ.A0F("timedElementTracksManager");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F("audioElementTracksManager");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("viewController");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A09(ClipsStackedTimelineFragment clipsStackedTimelineFragment) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        String str;
        ClipsStackedTimelineViewController clipsStackedTimelineViewController = clipsStackedTimelineFragment.A0F;
        if (clipsStackedTimelineViewController == null) {
            str = "viewController";
        } else {
            LTA.A03(clipsStackedTimelineViewController.A0O(), 8);
            LTA.A03(clipsStackedTimelineViewController.A0N(), 8);
            LGg lGg = clipsStackedTimelineFragment.A0D;
            if (lGg == null) {
                str = "timedElementTracksManager";
            } else {
                lGg.A04(4);
                AnonymousClass8RF r0 = clipsStackedTimelineFragment.A0d;
                if (r0 == null) {
                    str = "clipsTimelineEditorViewModel";
                } else {
                    JTT.A1L(r0, false);
                    AnonymousClass8RL r1 = clipsStackedTimelineFragment.A0c;
                    if (r1 == null) {
                        str = "clipsTimelineButtonEventProvider";
                    } else {
                        r1.A0F(C65089LnA.A00);
                        KMS kms = clipsStackedTimelineFragment.A0E;
                        if (kms == null) {
                            str = "videoTrackViewController";
                        } else {
                            MMB A002 = MMB.A00(clipsStackedTimelineFragment, 22);
                            MKL mkl = MKL.A00;
                            0qQ.A0B(mkl, 0);
                            C63848L9d l9d = kms.A02;
                            KMS.A01(kms, l9d.A01, 100, true);
                            RecyclerView recyclerView3 = kms.A0A;
                            int i = l9d.A05;
                            ValueAnimator A052 = JTQ.A05(i, (int) (((double) i) * 2.5d));
                            C64205LTv.A01(A052, recyclerView3, 7);
                            A052.addListener(new C56673I7c(2, A052, A002, mkl));
                            A052.setDuration(100);
                            A052.start();
                            C64166LRi lRi = clipsStackedTimelineFragment.A0B;
                            if (lRi == null) {
                                str = "audioElementTracksManager";
                            } else {
                                Iterator A012 = C64166LRi.A01(lRi);
                                while (A012.hasNext()) {
                                    KMU A0d2 = JTO.A0d(A012);
                                    if (A0d2.A0J && (recyclerView2 = A0d2.A08) != null) {
                                        LTA.A03(recyclerView2, 8);
                                    }
                                }
                                Iterator A003 = C64166LRi.A00(lRi);
                                while (A003.hasNext()) {
                                    KMU A0d3 = JTO.A0d(A003);
                                    if (A0d3.A0J && (recyclerView = A0d3.A08) != null) {
                                        LTA.A03(recyclerView, 8);
                                    }
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0A(ClipsStackedTimelineFragment clipsStackedTimelineFragment) {
        boolean z;
        0eP A0L2;
        C273914nO BkW;
        C61806KMu kMu = clipsStackedTimelineFragment.A0i;
        if (kMu != null) {
            ClipsCreationViewModel clipsCreationViewModel = clipsStackedTimelineFragment.A0Z;
            String str = "clipsCreationViewModel";
            if (clipsCreationViewModel != null) {
                List<C268714ds> A172 = JTO.A17(clipsCreationViewModel.A0N.A0D);
                String str2 = clipsStackedTimelineFragment.A10;
                0qQ.A0B(A172, 0);
                LTY lty = kMu.A01;
                Context context = kMu.A05;
                0qQ.A0B(context, 0);
                LTY.A06(lty);
                ArrayList A0m2 = C51970G9q.A0m(A172);
                for (C268714ds A012 : A172) {
                    A0m2.add(LTY.A01(context, A012));
                }
                lty.A07.Epw(A0m2);
                if (str2 != null) {
                    Iterator A152 = JTR.A15(lty.A09);
                    int i = 0;
                    while (true) {
                        String str3 = null;
                        if (!A152.hasNext()) {
                            break;
                        }
                        Object next = A152.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            0sr.A1T();
                            break;
                        }
                        C268714ds r0 = ((C61193Jym) next).A00;
                        if (r0 != null) {
                            C2802350v BzV = r0.BzV();
                            if (!(BzV == null || (BkW = BzV.BkW()) == null)) {
                                str3 = BkW.A00();
                            }
                            if (0qQ.A0K(str3, str2)) {
                                Integer valueOf = Integer.valueOf(i);
                                if (valueOf != null) {
                                    lty.A0T(valueOf.intValue(), true);
                                }
                            }
                        }
                        i = i2;
                    }
                    throw AnonymousClass00P.createAndThrow();
                }
                C61806KMu.A00(kMu);
                C61806KMu kMu2 = clipsStackedTimelineFragment.A0i;
                if (kMu2 != null) {
                    ClipsCreationViewModel clipsCreationViewModel2 = clipsStackedTimelineFragment.A0Z;
                    if (clipsCreationViewModel2 != null) {
                        List A173 = JTO.A17(clipsCreationViewModel2.A0N.A0E);
                        String str4 = clipsStackedTimelineFragment.A10;
                        0qQ.A0B(A173, 0);
                        if (!(A173 instanceof Collection) || !A173.isEmpty()) {
                            Iterator it = A173.iterator();
                            while (it.hasNext()) {
                                Object next2 = it.next();
                                if (!(next2 instanceof AnonymousClass5MI)) {
                                    if (next2 instanceof B3f) {
                                        next2 = ((C378669Qs) ((B2K) next2)).A0B;
                                    } else {
                                        next2 = null;
                                    }
                                }
                                if ((next2 instanceof AnonymousClass5MI) && ((AnonymousClass5MI) next2).CAX() == C62529KhL.STICKER) {
                                    break;
                                }
                            }
                        }
                        LTY lty2 = kMu2.A01;
                        Context context2 = kMu2.A05;
                        0qQ.A0B(context2, 0);
                        LTY.A07(lty2);
                        do {
                        } while (!JTS.A1Z(lty2.A08));
                        Iterator it2 = A173.iterator();
                        loop3:
                        while (true) {
                            z = true;
                            while (true) {
                                if (!it2.hasNext()) {
                                    break loop3;
                                }
                                AnonymousClass5MI r1 = (AnonymousClass5MI) it2.next();
                                if (!(r1.AfT() instanceof B3d)) {
                                    if (!lty2.A0W(context2, r1) || !z) {
                                        z = false;
                                    }
                                }
                            }
                        }
                        if (z) {
                            if (!(str4 == null || (A0L2 = lty2.A0L(str4)) == null)) {
                                lty2.A0R(C51970G9q.A0B(A0L2), C51969G9p.A0A(A0L2), true);
                            }
                            kMu2.A0G();
                        }
                        C357638Yz r02 = clipsStackedTimelineFragment.A00;
                        if (r02 == null) {
                            str = "cameraConfigurationViewModel";
                        } else if (0qQ.A0K(r02.A08.A00, C3493880e.A00)) {
                            C61806KMu kMu3 = clipsStackedTimelineFragment.A0i;
                            if (kMu3 != null) {
                                LTY lty3 = kMu3.A01;
                                Context context3 = kMu3.A05;
                                0qQ.A0B(context3, 0);
                                LTY.A06(lty3);
                                05G r2 = lty3.A07;
                                ArrayList A1C = AnonymousClass7TE.A1C();
                                A1C.add(new C61193Jym(C62529KhL.TEMPLATE, (C268714ds) null, AnonymousClass05K.A00, AnonymousClass7TE.A16(context3, 2131955849), 0, false));
                                A1C.addAll(JTO.A13(r2));
                                r2.Epw(A1C);
                                C61806KMu.A00(kMu3);
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
        0qQ.A0F("timedElementsViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0C(ClipsStackedTimelineFragment clipsStackedTimelineFragment) {
        ClipsStackedTimelineViewController clipsStackedTimelineViewController = clipsStackedTimelineFragment.A0F;
        String str = "viewController";
        if (clipsStackedTimelineViewController != null) {
            C60108Jfo jfo = clipsStackedTimelineFragment.A0h;
            if (jfo == null) {
                str = "stackedTimelineViewModel";
            } else {
                Iterable iterable = (Iterable) jfo.A0k.getValue();
                ArrayList<Object> A0p2 = AnonymousClass7TF.A0p(iterable);
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    float A002 = (float) C63117Krl.A00(clipsStackedTimelineFragment.requireContext(), AnonymousClass7TG.A0F(it));
                    ClipsStackedTimelineViewController clipsStackedTimelineViewController2 = clipsStackedTimelineFragment.A0F;
                    if (clipsStackedTimelineViewController2 != null) {
                        JTP.A1V(A0p2, A002 - ((float) clipsStackedTimelineViewController2.A00));
                    }
                }
                AlignmentGuideView alignmentGuideView = clipsStackedTimelineViewController.alignmentGuideView;
                if (alignmentGuideView != null) {
                    ArrayList A0p3 = AnonymousClass7TF.A0p(A0p2);
                    for (Object A042 : A0p2) {
                        JTP.A1V(A0p3, AnonymousClass7TE.A04(A042) + ((float) (clipsStackedTimelineViewController.A06 / 2)));
                    }
                    alignmentGuideView.setVerticalPositionsList(A0p3);
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0E(ClipsStackedTimelineFragment clipsStackedTimelineFragment, int i) {
        String str;
        KMS kms = clipsStackedTimelineFragment.A0E;
        if (kms == null) {
            str = "videoTrackViewController";
        } else {
            kms.A0A.setVisibility(i);
            C64166LRi lRi = clipsStackedTimelineFragment.A0B;
            if (lRi == null) {
                str = "audioElementTracksManager";
            } else {
                Iterator A012 = C64166LRi.A01(lRi);
                while (A012.hasNext()) {
                    IgFrameLayout igFrameLayout = JTO.A0d(A012).A0A;
                    if (igFrameLayout != null) {
                        igFrameLayout.setVisibility(i);
                    }
                }
                LGg lGg = clipsStackedTimelineFragment.A0D;
                if (lGg == null) {
                    str = "timedElementTracksManager";
                } else {
                    lGg.A04(i);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0G(ClipsStackedTimelineFragment clipsStackedTimelineFragment, Object obj) {
        String str = "clipsCreationViewModel";
        if (obj instanceof AnonymousClass5MI) {
            ClipsCreationViewModel clipsCreationViewModel = clipsStackedTimelineFragment.A0Z;
            if (clipsCreationViewModel != null) {
                clipsCreationViewModel.A0c((AnonymousClass5MI) obj);
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        } else if (obj instanceof C268714ds) {
            ClipsCreationViewModel clipsCreationViewModel2 = clipsStackedTimelineFragment.A0Z;
            if (clipsCreationViewModel2 != null) {
                clipsCreationViewModel2.A0f((C268714ds) obj);
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        if (obj instanceof Drawable) {
            AnonymousClass8RL r2 = clipsStackedTimelineFragment.A0c;
            if (r2 == null) {
                str = "clipsTimelineButtonEventProvider";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            r2.A0F(new AnonymousClass9IF((Drawable) obj, 5));
        }
        A07(clipsStackedTimelineFragment);
    }

    public static final void A0H(ClipsStackedTimelineFragment clipsStackedTimelineFragment, String str, boolean z) {
        C65072Lms lms;
        C66472MTa A002;
        C61191Jyk jyk;
        C60414Jl7 jl7;
        ClipsTimelineBottomSheetViewController clipsTimelineBottomSheetViewController = clipsStackedTimelineFragment.A0L;
        MXK mxk = null;
        if (clipsTimelineBottomSheetViewController != null) {
            mxk = clipsTimelineBottomSheetViewController.A07;
        }
        if ((mxk instanceof C65072Lms) && (lms = (C65072Lms) mxk) != null && (A002 = lms.A00(str)) != null && (A002 instanceof C61191Jyk) && (jyk = (C61191Jyk) A002) != null) {
            C61191Jyk jyk2 = new C61191Jyk(jyk.A01, jyk.A00, jyk.A03, z);
            RecyclerView recyclerView = lms.A00;
            2Rw r5 = null;
            if (recyclerView != null) {
                r5 = recyclerView.A0A;
            }
            if ((r5 instanceof C60414Jl7) && (jl7 = (C60414Jl7) r5) != null) {
                int i = 0;
                for (C66472MTa mTa : jl7.A00) {
                    if (!(mTa instanceof C61191Jyk) || !0qQ.A0K(((C61191Jyk) mTa).A01, jyk2.A01)) {
                        i++;
                    } else if (i != -1) {
                        ArrayList A0U2 = 00k.A0U(jl7.A00);
                        A0U2.set(i, jyk2);
                        List list = jl7.A00;
                        jl7.A00 = A0U2;
                        JTP.A1C(new U9O(2, list, A0U2), jl7);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static final void A0I(ClipsStackedTimelineFragment clipsStackedTimelineFragment, boolean z) {
        String str;
        ClipsStackedTimelineViewController clipsStackedTimelineViewController = clipsStackedTimelineFragment.A0F;
        if (clipsStackedTimelineViewController == null) {
            str = "viewController";
        } else {
            clipsStackedTimelineViewController.A02 = z;
            C64166LRi lRi = clipsStackedTimelineFragment.A0B;
            if (lRi == null) {
                str = "audioElementTracksManager";
            } else {
                Iterator A012 = C64166LRi.A01(lRi);
                while (A012.hasNext()) {
                    JTO.A0e(A012).A02 = z;
                }
                Iterator A002 = C64166LRi.A00(lRi);
                while (A002.hasNext()) {
                    JTO.A0e(A002).A02 = z;
                }
                LGg lGg = clipsStackedTimelineFragment.A0D;
                if (lGg == null) {
                    str = "timedElementTracksManager";
                } else {
                    Iterator it = lGg.A0C.iterator();
                    while (it.hasNext()) {
                        JTO.A0e(it).A02 = z;
                    }
                    Iterator it2 = lGg.A0B.iterator();
                    while (it2.hasNext()) {
                        JTO.A0e(it2).A02 = z;
                    }
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A0J(C293505kq r13, boolean z) {
        String str;
        String str2;
        AudioOverlayTrack audioOverlayTrack = r13.A0N;
        String str3 = null;
        if (audioOverlayTrack == null) {
            List list = r13.A0p;
            if (list != null) {
                audioOverlayTrack = (AudioOverlayTrack) 00k.A0L(list);
            } else {
                audioOverlayTrack = null;
            }
        }
        if (z) {
            List list2 = r13.A0p;
            if (list2 == null || list2.size() <= 0) {
                JTQ.A0I(this).A02.A06("undo_redo", true);
            } else {
                JTQ.A0I(this).A02.A02();
            }
        } else {
            29I r2 = JTQ.A0I(this).A02;
            if (audioOverlayTrack != null) {
                str = audioOverlayTrack.A0A;
                str2 = audioOverlayTrack.A0B;
                MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                if (musicAssetModel != null) {
                    str3 = musicAssetModel.A0I;
                }
            } else {
                str = null;
                str2 = null;
            }
            AnonymousClass7TG.A1K(r2);
            29I.A01(r2, "user_post_capture_undo_redo_restored_music", str, str2, str3, (String) null, (String) null, (String) null, (String) null, (String) null);
        }
    }

    public static final boolean A0K(ClipsStackedTimelineFragment clipsStackedTimelineFragment) {
        AnonymousClass8RF r0 = clipsStackedTimelineFragment.A0d;
        if (r0 != null) {
            if (!(r0.A0E() instanceof C355718Rb)) {
                AnonymousClass8RF r02 = clipsStackedTimelineFragment.A0d;
                if (r02 != null) {
                    if (r02.A0E() instanceof C355708Ra) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }
        0qQ.A0F("clipsTimelineEditorViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final boolean A0L(ClipsStackedTimelineFragment clipsStackedTimelineFragment) {
        AnonymousClass8RF r0 = clipsStackedTimelineFragment.A0d;
        if (r0 != null) {
            if (!(r0.A0E() instanceof AnonymousClass8RX)) {
                AnonymousClass8RF r02 = clipsStackedTimelineFragment.A0d;
                if (r02 != null) {
                    if (!(r02.A0E() instanceof AnonymousClass8RU)) {
                        AnonymousClass8RF r03 = clipsStackedTimelineFragment.A0d;
                        if (r03 != null) {
                            if (r03.A0E() instanceof AnonymousClass8RV) {
                                return true;
                            }
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        0qQ.A0F("clipsTimelineEditorViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final boolean A0M(ClipsStackedTimelineFragment clipsStackedTimelineFragment, AnonymousClass8RH r3) {
        if ((r3 instanceof C355808Rl) || (r3 instanceof C355838Ro)) {
            return true;
        }
        if (!(r3 instanceof AnonymousClass8RR)) {
            return false;
        }
        UserSession A0l2 = AnonymousClass7TE.A0l(clipsStackedTimelineFragment.A05);
        if (182.A06(AnonymousClass7TF.A0H(A0l2), A0l2, 36320094586413014L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0N(ClipsStackedTimelineFragment clipsStackedTimelineFragment, AnonymousClass8YU r5) {
        String str;
        AnonymousClass8RF r0 = clipsStackedTimelineFragment.A0d;
        if (r0 == null) {
            str = "clipsTimelineEditorViewModel";
        } else {
            AnonymousClass8RH A0E2 = r0.A0E();
            if (!(A0E2 instanceof C355868Rr) || r5 != AnonymousClass8YU.PAUSED) {
                return false;
            }
            ClipsCreationViewModel clipsCreationViewModel = clipsStackedTimelineFragment.A0Z;
            if (clipsCreationViewModel == null) {
                str = "clipsCreationViewModel";
            } else {
                Integer A0I2 = clipsCreationViewModel.A0I(((C355868Rr) A0E2).A00);
                if (A0I2 == null) {
                    return true;
                }
                int intValue = A0I2.intValue();
                ClipsStackedTimelineViewController clipsStackedTimelineViewController = clipsStackedTimelineFragment.A0F;
                if (clipsStackedTimelineViewController == null) {
                    str = "viewController";
                } else {
                    clipsStackedTimelineViewController.A0B.Eoh(intValue, true, 0);
                    return true;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0Q() {
        int i;
        AnonymousClass8RX r1;
        KMS kms = this.A0E;
        String str = "videoTrackViewController";
        if (kms != null) {
            if (kms.A02) {
                ClipsStackedTimelineViewController clipsStackedTimelineViewController = this.A0F;
                if (clipsStackedTimelineViewController == null) {
                    str = "viewController";
                } else {
                    TextView textView = clipsStackedTimelineViewController.transitionEffectLabel;
                    if (textView != null) {
                        textView.setVisibility(8);
                        ClipsTimelineActionBarViewController clipsTimelineActionBarViewController = this.A0G;
                        if (clipsTimelineActionBarViewController == null) {
                            str = "actionBarViewController";
                        } else {
                            C63715L3z l3z = clipsTimelineActionBarViewController.A00;
                            if (l3z == null) {
                                str = "buttonDebouncer";
                            } else {
                                l3z.A01 = true;
                                KMS kms2 = this.A0E;
                                if (kms2 != null) {
                                    MMB A002 = MMB.A00(this, 17);
                                    C63848L9d l9d = kms2.A02;
                                    KMS.A01(kms2, l9d.A04, 0, false);
                                    AnonymousClass861 r12 = kms2.A0K.A0K;
                                    r12.A04();
                                    JTP.A1B(r12.A08, true);
                                    r12.A01();
                                    JTP.A1B(r12.A05, false);
                                    kms2.A02 = false;
                                    kms2.A0E.A01 = true;
                                    RecyclerView recyclerView = kms2.A0A;
                                    AnonymousClass8RH A0E2 = kms2.A0J.A0E();
                                    if (!(A0E2 instanceof AnonymousClass8RX) || (r1 = (AnonymousClass8RX) A0E2) == null) {
                                        i = 0;
                                    } else {
                                        i = r1.A00;
                                    }
                                    int i2 = kms2.A06;
                                    AnonymousClass89v r6 = kms2.A0H;
                                    int i3 = kms2.A01;
                                    int i4 = l9d.A05;
                                    LTA.A06(recyclerView, r6, C66291MMa.A00(A002, kms2, 12), MP5.A00(kms2, 25), i, i2, i3, i4, false);
                                    C64166LRi lRi = this.A0B;
                                    if (lRi == null) {
                                        str = "audioElementTracksManager";
                                    } else {
                                        Iterator A012 = C64166LRi.A01(lRi);
                                        while (A012.hasNext()) {
                                            KMU.A06(A012, 0);
                                        }
                                        Iterator A003 = C64166LRi.A00(lRi);
                                        while (A003.hasNext()) {
                                            KMU.A06(A003, 0);
                                        }
                                        LGg lGg = this.A0D;
                                        if (lGg == null) {
                                            str = "timedElementTracksManager";
                                        } else {
                                            lGg.A04(0);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        str = "transitionEffectLabel";
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R() {
        /*
            r12 = this;
            X.8RF r0 = r12.A0d
            if (r0 == 0) goto L_0x00f6
            X.8RH r0 = r0.A0E()
            boolean r0 = r0 instanceof X.AnonymousClass8RU
            if (r0 == 0) goto L_0x00ff
            X.Jfo r1 = r12.A0h
            if (r1 != 0) goto L_0x001a
            java.lang.String r0 = "stackedTimelineViewModel"
        L_0x0012:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001a:
            r0 = 1
            r1.A06 = r0
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r1 = r12.A0F
            if (r1 != 0) goto L_0x0024
            java.lang.String r0 = "viewController"
            goto L_0x0012
        L_0x0024:
            androidx.recyclerview.widget.RecyclerView r0 = r1.A0O()
            X.LTA.A02(r0)
            android.view.View r0 = r1.A0N()
            X.LTA.A02(r0)
            X.LGg r0 = r12.A0D
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "timedElementTracksManager"
            goto L_0x0012
        L_0x0039:
            r6 = 0
            r0.A04(r6)
            int r0 = r12.A01
            r4 = -1
            if (r0 == r4) goto L_0x0049
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r12.A0Z
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "clipsCreationViewModel"
            goto L_0x0012
        L_0x0049:
            X.861 r0 = r12.A0j
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "videoPlaybackViewModel"
            goto L_0x0012
        L_0x0050:
            X.863 r0 = X.JTP.A0Z(r0)
            if (r0 == 0) goto L_0x005b
            int r1 = r0.CEG()
            goto L_0x0069
        L_0x005b:
            r1 = 0
            goto L_0x0069
        L_0x005d:
            X.831 r1 = X.JTQ.A0K(r0)
            if (r1 == 0) goto L_0x005b
            int r0 = r12.A01
            int r1 = r1.A01(r0)
        L_0x0069:
            X.KMS r5 = r12.A0E
            if (r5 != 0) goto L_0x0070
            java.lang.String r0 = "videoTrackViewController"
            goto L_0x0012
        L_0x0070:
            r0 = 23
            X.MMB r10 = X.MMB.A00(r12, r0)
            r0 = 17
            X.MJ3 r9 = new X.MJ3
            r9.<init>(r1, r0, r12)
            X.L9d r3 = r5.A02
            int r0 = r3.A01
            r1 = 100
            X.KMS.A01(r5, r0, r1, r6)
            androidx.recyclerview.widget.RecyclerView r11 = r5.A0A
            int r3 = r3.A05
            r7 = 4612811918334230528(0x4004000000000000, double:2.5)
            double r5 = (double) r3
            double r5 = r5 * r7
            int r0 = (int) r5
            r5 = 2
            android.animation.ValueAnimator r3 = X.JTQ.A05(r0, r3)
            r0 = 7
            X.C64205LTv.A01(r3, r11, r0)
            X.I7c r0 = new X.I7c
            r0.<init>(r5, r3, r9, r10)
            r3.addListener(r0)
            r3.setDuration(r1)
            r3.start()
            X.LRi r3 = r12.A0B
            if (r3 != 0) goto L_0x00ae
            java.lang.String r0 = "audioElementTracksManager"
            goto L_0x0012
        L_0x00ae:
            java.util.Iterator r2 = X.C64166LRi.A01(r3)
        L_0x00b2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c8
            X.KMU r1 = X.JTO.A0d(r2)
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x00b2
            androidx.recyclerview.widget.RecyclerView r0 = r1.A08
            if (r0 == 0) goto L_0x00b2
            X.LTA.A02(r0)
            goto L_0x00b2
        L_0x00c8:
            java.util.Iterator r2 = X.C64166LRi.A00(r3)
        L_0x00cc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00e2
            X.KMU r1 = X.JTO.A0d(r2)
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x00cc
            androidx.recyclerview.widget.RecyclerView r0 = r1.A08
            if (r0 == 0) goto L_0x00cc
            X.LTA.A02(r0)
            goto L_0x00cc
        L_0x00e2:
            X.8RF r1 = r12.A0d
            if (r1 == 0) goto L_0x00f6
            X.8Rs r0 = new X.8Rs
            r0.<init>(r4)
            r1.A0G(r0)
            X.8RL r1 = r12.A0c
            if (r1 != 0) goto L_0x00fa
            java.lang.String r0 = "clipsTimelineButtonEventProvider"
            goto L_0x0012
        L_0x00f6:
            java.lang.String r0 = "clipsTimelineEditorViewModel"
            goto L_0x0012
        L_0x00fa:
            X.LnB r0 = X.C65090LnB.A00
            r1.A0F(r0)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0R():void");
    }

    public final void A0S() {
        Dialog dialog;
        String str;
        C3516889w r0 = this.A0l;
        if (r0 == null) {
            str = "bitmapTimelineViewModel";
        } else {
            JTR.A1V(r0.A0A);
            C64166LRi lRi = this.A0B;
            if (lRi == null) {
                str = "audioElementTracksManager";
            } else {
                Iterator A012 = C64166LRi.A01(lRi);
                while (A012.hasNext()) {
                    C60433JlQ jlQ = JTO.A0d(A012).A0D;
                    JTO.A0E(jlQ.A05).removeCallbacks(jlQ.A04);
                }
                Iterator A002 = C64166LRi.A00(lRi);
                while (A002.hasNext()) {
                    C60433JlQ jlQ2 = JTO.A0d(A002).A0D;
                    JTO.A0E(jlQ2.A05).removeCallbacks(jlQ2.A04);
                }
                MediaPlayer mediaPlayer = this.A04;
                if (mediaPlayer != null) {
                    mediaPlayer.reset();
                }
                ClipsTimelineBottomSheetViewController clipsTimelineBottomSheetViewController = this.A0L;
                if (clipsTimelineBottomSheetViewController != null) {
                    clipsTimelineBottomSheetViewController.onPause();
                }
                LRJ.A00();
                ClipsStackedTimelineViewController clipsStackedTimelineViewController = this.A0F;
                String str2 = "viewController";
                if (clipsStackedTimelineViewController != null) {
                    C240383Kr r02 = clipsStackedTimelineViewController.educationNuxFragment;
                    if (!(r02 == null || (dialog = r02.A01) == null || !dialog.isShowing())) {
                        ClipsStackedTimelineViewController clipsStackedTimelineViewController2 = this.A0F;
                        if (clipsStackedTimelineViewController2 != null) {
                            C240383Kr r03 = clipsStackedTimelineViewController2.educationNuxFragment;
                            if (r03 != null) {
                                r03.A08();
                            }
                            AnonymousClass861 r04 = this.A0j;
                            if (r04 == null) {
                                str = "videoPlaybackViewModel";
                            } else {
                                r04.A03();
                            }
                        }
                    }
                    AnonymousClass8RF r05 = this.A0d;
                    str2 = "clipsTimelineEditorViewModel";
                    if (r05 != null) {
                        AnonymousClass8RH A0E2 = r05.A0E();
                        if (A0E2 instanceof AnonymousClass8RR) {
                            AnonymousClass8RF r1 = this.A0d;
                            if (r1 != null) {
                                JTP.A1N(r1, ((AnonymousClass8RR) A0E2).A00);
                                29R r12 = JTQ.A0I(this).A09;
                                1Ln A0N2 = JTO.A0N(r12);
                                if (r12.A0P() && DbT.A1Y(A0N2)) {
                                    JTO.A1V(A0N2);
                                    A0N2.A0r("TIMELINE_SCALE_TAP");
                                    29R.A00(A0N2, r12);
                                    JTT.A1D(A0N2, r12.A0J(), r12);
                                    A0N2.A0O("is_timeline", true);
                                    A0N2.Cgf();
                                    return;
                                }
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0T() {
        C60108Jfo jfo = this.A0h;
        String str = "stackedTimelineViewModel";
        AnonymousClass8RM r3 = null;
        if (jfo != null) {
            jfo.A0K();
            AnonymousClass8RL r2 = this.A0b;
            if (r2 == null) {
                str = "clipsStackedTimelineVideoPreviewSizeProvider";
            } else {
                C60108Jfo jfo2 = this.A0h;
                if (jfo2 != null) {
                    int A0K2 = JTR.A0K(jfo2.A0Y);
                    if (this.A0r) {
                        r3 = AnonymousClass8RM.A0C;
                    }
                    r2.A0E(r3, A0K2);
                    C3516889w r0 = this.A0l;
                    if (r0 == null) {
                        str = "bitmapTimelineViewModel";
                    } else {
                        JTR.A1W(r0.A0A);
                        ClipsTimelineActionBarViewController clipsTimelineActionBarViewController = this.A0G;
                        if (clipsTimelineActionBarViewController == null) {
                            str = "actionBarViewController";
                        } else {
                            Integer num = clipsTimelineActionBarViewController.A01;
                            if (num != null) {
                                int intValue = num.intValue();
                                LinearLayoutManager linearLayoutManager = clipsTimelineActionBarViewController.linearLayoutManager;
                                if (linearLayoutManager != null) {
                                    linearLayoutManager.A1O(intValue);
                                }
                            }
                            MediaPlayer mediaPlayer = this.A04;
                            if (mediaPlayer != null) {
                                mediaPlayer.reset();
                            }
                            ClipsTimelineBottomSheetViewController clipsTimelineBottomSheetViewController = this.A0L;
                            if (clipsTimelineBottomSheetViewController != null) {
                                clipsTimelineBottomSheetViewController.onResume();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0U() {
        AnonymousClass8RF r1 = this.A0d;
        if (r1 == null) {
            0qQ.A0F("clipsTimelineEditorViewModel");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r1.A0G(KM7.A00);
        }
    }

    public final void A0V() {
        AnonymousClass8RF r0 = this.A0d;
        if (r0 == null) {
            0qQ.A0F("clipsTimelineEditorViewModel");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A0G(new C355828Rn((C53368Gms) null, (C53368Gms) null, (C53368Gms) null, -1, false));
        }
    }

    public final void A0W() {
        int i;
        int i2;
        int i3;
        Object obj;
        String str;
        C351888Av r0;
        AnonymousClass861 r02 = this.A0j;
        if (r02 == null) {
            str = "videoPlaybackViewModel";
        } else {
            AnonymousClass863 A0Z2 = JTP.A0Z(r02);
            boolean z = false;
            if (A0Z2 != null) {
                i = A0Z2.CEG();
            } else {
                i = 0;
            }
            ClipsCreationViewModel clipsCreationViewModel = this.A0Z;
            String str2 = "clipsCreationViewModel";
            if (clipsCreationViewModel != null) {
                AnonymousClass831 A0K2 = JTQ.A0K(clipsCreationViewModel);
                if (A0K2 != null) {
                    i2 = JTO.A08(A0K2);
                } else {
                    i2 = 0;
                }
                ClipsCreationViewModel clipsCreationViewModel2 = this.A0Z;
                if (clipsCreationViewModel2 != null) {
                    int A072 = JTO.A07(clipsCreationViewModel2);
                    AnonymousClass8RL r1 = this.A0c;
                    if (r1 == null) {
                        str2 = "clipsTimelineButtonEventProvider";
                    } else {
                        r1.A0F(C65088Ln9.A00);
                        ClipsCreationViewModel clipsCreationViewModel3 = this.A0Z;
                        if (clipsCreationViewModel3 != null) {
                            0eP r3 = null;
                            if (!clipsCreationViewModel3.A09 && (r0 = clipsCreationViewModel3.A02) != null) {
                                ClipsCreationDraftViewModel clipsCreationDraftViewModel = r0.A00;
                                ClipsDraftRepository clipsDraftRepository = clipsCreationDraftViewModel.A0H;
                                C361348g5 r10 = clipsDraftRepository.A05;
                                ArrayList arrayList = r10.A00;
                                if (!arrayList.isEmpty()) {
                                    0eP r6 = (0eP) 018.A15(arrayList);
                                    05G r12 = r10.A02;
                                    JTP.A1W(r12, JTR.A0K(r12) - 1);
                                    if (r6 != null) {
                                        C293505kq A012 = ClipsCreationDraftViewModel.A01(clipsCreationDraftViewModel);
                                        if (A012 == null) {
                                            0kD.A07("ClipsCreationDraftViewModel", "Draft Snapshot is null when redo triggers undo snapshot", (Throwable) null);
                                        } else {
                                            Object obj2 = r6.A00;
                                            C359548d5 r13 = (C359548d5) obj2;
                                            r10.A01(r13, A012);
                                            C293505kq r03 = (C293505kq) r6.A01;
                                            clipsDraftRepository.A0N(r03);
                                            ClipsCreationViewModel.A04(clipsCreationViewModel3, r03);
                                            r3 = r6;
                                            Context context = getContext();
                                            if (context != null) {
                                                String A0T2 = 002.A0T(context.getString(2131952143), context.getString(r13.A00), ' ');
                                                0qQ.A0B(A0T2, 1);
                                                C59689JTv.A03(context, A0T2, (String) null, 0);
                                                if (obj2 == C359548d5.TEXT_TO_SPEECH_CHANGE) {
                                                    ClipsCreationViewModel clipsCreationViewModel4 = this.A0Z;
                                                    if (clipsCreationViewModel4 != null) {
                                                        AnonymousClass83A r04 = clipsCreationViewModel4.A0K.A0A;
                                                        String str3 = r04.A00;
                                                        if (str3 != null) {
                                                            try {
                                                                JTR.A1O(r04.A01.A00(str3));
                                                            } catch (IOException | SecurityException unused) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            ClipsCreationViewModel clipsCreationViewModel5 = this.A0Z;
                            if (clipsCreationViewModel5 != null) {
                                AnonymousClass831 A0K3 = JTQ.A0K(clipsCreationViewModel5);
                                if (A0K3 != null) {
                                    i3 = JTO.A08(A0K3);
                                } else {
                                    i3 = 0;
                                }
                                A04(i3 - i2);
                                A05(A072, i);
                                C60108Jfo jfo = this.A0h;
                                if (jfo == null) {
                                    str = "stackedTimelineViewModel";
                                } else {
                                    jfo.A0L();
                                    if (r3 != null && ((obj = r3.A00) == C359548d5.AUDIO_ADD || obj == C359548d5.AUDIO_REMOVE || obj == C359548d5.AUDIO_REPLACE)) {
                                        if (obj == C359548d5.AUDIO_REMOVE) {
                                            z = true;
                                        }
                                        A0J((C293505kq) r3.A01, z);
                                    }
                                    27r A0I2 = JTQ.A0I(this);
                                    if (A0I2.A0J() != null) {
                                        27r.A0C(A0I2, "TIMELINE_REDO_TAP");
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        if (this.A0r) {
            return AnonymousClass000.A00(2805);
        }
        return "clips_timeline_editor";
    }

    public final boolean onBackPressed() {
        AnonymousClass8RF r2;
        AnonymousClass8RH r1;
        int i;
        AnonymousClass51M r22;
        AnonymousClass8RF r0 = this.A0d;
        String str = "clipsTimelineEditorViewModel";
        if (r0 != null) {
            AnonymousClass8RH A0E2 = r0.A0E();
            if (A0E2 instanceof AnonymousClass8RX) {
                A0Q();
                return true;
            } else if (A0E2 instanceof C355808Rl) {
                ClipsTimelineBottomSheetViewController clipsTimelineBottomSheetViewController = this.A0L;
                if (clipsTimelineBottomSheetViewController == null) {
                    return true;
                }
                clipsTimelineBottomSheetViewController.A03(true);
                return true;
            } else if (A0E2 instanceof AnonymousClass8RY) {
                ClipsStackedTimelineViewController clipsStackedTimelineViewController = this.A0F;
                if (clipsStackedTimelineViewController == null) {
                    str = "viewController";
                } else {
                    clipsStackedTimelineViewController.A0R();
                    C64166LRi lRi = this.A0B;
                    if (lRi == null) {
                        str = "audioElementTracksManager";
                    } else {
                        AnonymousClass8RY r3 = (AnonymousClass8RY) A0E2;
                        int i2 = r3.A01;
                        lRi.A02(i2);
                        AnonymousClass8RF r23 = this.A0d;
                        if (r23 != null) {
                            r23.A0G(new C355748Rf(r3.A00, i2));
                            KMS kms = this.A0E;
                            if (kms == null) {
                                str = "videoTrackViewController";
                            } else {
                                kms.A0A.setAlpha(1.0f);
                                LGg lGg = this.A0D;
                                if (lGg == null) {
                                    str = "timedElementTracksManager";
                                } else {
                                    lGg.A02(1.0f);
                                    A0F(this, C62517Kh8.A03);
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else if (A0E2 instanceof AnonymousClass8RU) {
                A0R();
                return true;
            } else {
                if (!(A0E2 instanceof C355858Rq)) {
                    if (A0E2 instanceof AnonymousClass8RW) {
                        C64708Lgg lgg = this.A0P;
                        if (lgg == null) {
                            return true;
                        }
                        AnonymousClass8RW r32 = (AnonymousClass8RW) A0E2;
                        0qQ.A0B(r32, 0);
                        AnonymousClass831 A0K2 = JTQ.A0K(lgg.A08);
                        HashMap hashMap = lgg.A0B;
                        Set<Number> keySet = hashMap.keySet();
                        0qQ.A07(keySet);
                        for (Number number : keySet) {
                            Float f = null;
                            if (A0K2 != null) {
                                r22 = JTO.A0f(A0K2, JTP.A09(number));
                            } else {
                                r22 = null;
                            }
                            Number A0z2 = JTO.A0z(number, hashMap);
                            if (A0z2 != null) {
                                float floatValue = A0z2.floatValue();
                                if (r22 != null) {
                                    f = Float.valueOf(Math.abs(r22.A00));
                                }
                                if (!0qQ.A0I(f, floatValue)) {
                                    LRJ.A00();
                                    lgg.A01 = 0;
                                    lgg.A0A.A0K.A01();
                                    C358248ab A0Y2 = DbS.A0Y(lgg.A04);
                                    A0Y2.A09(2131955779);
                                    A0Y2.A08(2131955778);
                                    A0Y2.A04();
                                    A0Y2.A0K(LV0.A00(r32, lgg, 21), 2131955777);
                                    A0Y2.A0G(LV0.A00(r32, lgg, 22), 2131955781);
                                    DbT.A1V(A0Y2);
                                    return true;
                                }
                            }
                        }
                        r2 = lgg.A09;
                        i = r32.A00;
                    } else if (A0E2 instanceof AnonymousClass8RV) {
                        LSO lso = this.A0O;
                        if (lso == null) {
                            return true;
                        }
                        lso.A03();
                        return true;
                    } else if (A0E2 instanceof AnonymousClass8RT) {
                        AnonymousClass8RT r33 = (AnonymousClass8RT) A0E2;
                        if (r33 == null) {
                            return true;
                        }
                        r2 = this.A0d;
                        if (r2 != null) {
                            i = r33.getSegmentIndex();
                        }
                    } else if (A0E2 instanceof C355878Rs) {
                        LRJ.A00();
                        JTQ.A0I(this).A0h();
                        return false;
                    }
                    r1 = new C355868Rr(i);
                    r2.A0G(r1);
                    return true;
                }
                r2 = this.A0d;
                if (r2 != null) {
                    r1 = JTQ.A0J();
                    r2.A0G(r1);
                    return true;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public ClipsStackedTimelineFragment() {
        MMB A002 = MMB.A00(this, 16);
        MMB A003 = MMB.A00(this, 27);
        0eO r2 = 0eO.A02;
        AnonymousClass0eM A004 = AnonymousClass0eN.A00(r2, MMB.A00(A003, 28));
        this.A15 = DbS.A0I(MMB.A00(A004, 29), A002, C66291MMa.A00((Object) null, A004, 9), DbS.A0z(C60105Jfl.class));
        this.A11 = AnonymousClass0eN.A01(MMB.A00(this, 13));
        this.A01 = -1;
        this.A14 = DbS.A0I(MMB.A00(this, 26), MMB.A00(this, 15), C66291MMa.A00((Object) null, this, 8), DbS.A0z(AnonymousClass89Z.class));
        this.A16 = AnonymousClass1YB.A00(MMB.A00(this, 18));
        this.A17 = AnonymousClass1YB.A00(MMB.A00(this, 19));
        MMB A005 = MMB.A00(this, 14);
        AnonymousClass0eM A006 = AnonymousClass0eN.A00(r2, MMB.A00(MMB.A00(this, 30), 31));
        this.A13 = DbS.A0I(MMB.A00(A006, 32), A005, C66291MMa.A00((Object) null, A006, 10), DbS.A0z(C60090JfW.class));
    }

    public static AE4 A02(K5U k5u) {
        AnonymousClass8A2 A012 = AnonymousClass8A1.A01(k5u.A0O());
        1QP r3 = A012.A0J;
        long j = A012.A0A;
        AE4 ae4 = new AE4(r3);
        ae4.A01 = j;
        return ae4;
    }

    private final void A05(int i, int i2) {
        if (isAdded() && getContext() != null) {
            ClipsStackedTimelineViewController clipsStackedTimelineViewController = this.A0F;
            if (clipsStackedTimelineViewController != null) {
                ClipsCreationViewModel clipsCreationViewModel = this.A0Z;
                if (clipsCreationViewModel != null) {
                    clipsStackedTimelineViewController.A0V(JTO.A07(clipsCreationViewModel), false);
                    ClipsCreationViewModel clipsCreationViewModel2 = this.A0Z;
                    if (clipsCreationViewModel2 != null) {
                        if (i - JTO.A07(clipsCreationViewModel2) != 0) {
                            ClipsStackedTimelineViewController clipsStackedTimelineViewController2 = this.A0F;
                            if (clipsStackedTimelineViewController2 != null) {
                                clipsStackedTimelineViewController2.A0E();
                                A0D(this, i2);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                0qQ.A0F("clipsCreationViewModel");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("viewController");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A0B(ClipsStackedTimelineFragment clipsStackedTimelineFragment) {
        String str;
        int i;
        AnonymousClass89v A032 = C3516489r.A03(clipsStackedTimelineFragment.requireContext(), CameraCapturer.OPEN_CAMERA_DELAY_MS);
        ClipsCreationViewModel clipsCreationViewModel = clipsStackedTimelineFragment.A0Z;
        String str2 = "clipsCreationViewModel";
        if (clipsCreationViewModel != null) {
            AnonymousClass831 A0K2 = JTQ.A0K(clipsCreationViewModel);
            if (A0K2 != null) {
                int A002 = AnonymousClass89x.A00();
                int i2 = 1;
                while (true) {
                    i = i2 * CameraCapturer.OPEN_CAMERA_DELAY_MS;
                    int A012 = A01(A0K2, i);
                    if (clipsStackedTimelineFragment.A0l != null) {
                        if (A002 < A032.A00 * A012) {
                            i2++;
                            if (i2 >= 11) {
                                i = CameraCapturer.OPEN_CAMERA_TIMEOUT;
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        str = "bitmapTimelineViewModel";
                        break;
                    }
                }
            } else {
                i = CameraCapturer.OPEN_CAMERA_DELAY_MS;
            }
            ClipsCreationViewModel clipsCreationViewModel2 = clipsStackedTimelineFragment.A0Z;
            if (clipsCreationViewModel2 != null) {
                int A013 = A01(JTQ.A0K(clipsCreationViewModel2), i);
                C3516889w r2 = clipsStackedTimelineFragment.A0l;
                str = "bitmapTimelineViewModel";
                if (r2 != null) {
                    r2.A02(C3516489r.A03(clipsStackedTimelineFragment.requireContext(), i), C3516489r.A02(clipsStackedTimelineFragment.requireContext()));
                    C3516889w r22 = clipsStackedTimelineFragment.A0l;
                    if (r22 != null) {
                        int min = Math.min(A032.A00 * A013, AnonymousClass89x.A00());
                        if (min > 0) {
                            r22.A08.resize(min);
                        }
                        C60428JlL jlL = clipsStackedTimelineFragment.A0v;
                        if (jlL == null) {
                            str2 = "videoTrackAdapter";
                        } else {
                            jlL.A00 = i;
                            return;
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0D(ClipsStackedTimelineFragment clipsStackedTimelineFragment, int i) {
        Context context = clipsStackedTimelineFragment.getContext();
        if (context != null) {
            int A002 = C63117Krl.A00(context, i);
            ClipsStackedTimelineViewController clipsStackedTimelineViewController = clipsStackedTimelineFragment.A0F;
            String str = "viewController";
            if (clipsStackedTimelineViewController != null) {
                clipsStackedTimelineViewController.A0I(A002 - clipsStackedTimelineViewController.A00);
                KMS kms = clipsStackedTimelineFragment.A0E;
                str = "videoTrackViewController";
                if (kms != null) {
                    kms.A0I(A002 - kms.A00);
                    C64166LRi lRi = clipsStackedTimelineFragment.A0B;
                    if (lRi == null) {
                        str = "audioElementTracksManager";
                    } else {
                        C62517Kh8 kh8 = C62517Kh8.A03;
                        lRi.A05(kh8, A002, -1, true);
                        LGg lGg = clipsStackedTimelineFragment.A0D;
                        if (lGg == null) {
                            str = "timedElementTracksManager";
                        } else {
                            lGg.A05(kh8, A002, -1, true);
                            A0C(clipsStackedTimelineFragment);
                            return;
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        X.0qQ.A0F("videoTrackViewController");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        X.0qQ.A0F("timedElementTracksManager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        X.0qQ.A0F("audioElementTracksManager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        X.0qQ.A0F("viewController");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0082, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0F(com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r6, X.C62517Kh8 r7) {
        /*
            int r0 = r7.ordinal()
            java.lang.String r5 = "viewController"
            java.lang.String r4 = "timedElementTracksManager"
            java.lang.String r1 = "videoTrackViewController"
            java.lang.String r3 = "audioElementTracksManager"
            r2 = 0
            switch(r0) {
                case 0: goto L_0x003b;
                case 1: goto L_0x005d;
                default: goto L_0x0010;
            }
        L_0x0010:
            X.KMS r0 = r6.A0E
            if (r0 == 0) goto L_0x0059
            r0.A0L(r2)
            X.LGg r0 = r6.A0D
            if (r0 == 0) goto L_0x0073
            r0.A06(r2)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r0 = r6.A0F
            if (r0 == 0) goto L_0x007b
            r0.A0L(r2)
            X.LRi r0 = r6.A0B
            if (r0 == 0) goto L_0x0077
            java.util.Iterator r1 = X.C64166LRi.A00(r0)
        L_0x002d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0058
            X.LPJ r0 = X.JTO.A0e(r1)
            r0.A0L(r2)
            goto L_0x002d
        L_0x003b:
            X.KMS r0 = r6.A0E
            if (r0 == 0) goto L_0x0059
            r1 = 1
            r0.A0L(r1)
            X.LRi r0 = r6.A0B
            if (r0 == 0) goto L_0x0077
            r0.A07(r1)
            X.LGg r0 = r6.A0D
            if (r0 == 0) goto L_0x0073
            r0.A06(r1)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r0 = r6.A0F
            if (r0 == 0) goto L_0x007b
            r0.A0L(r1)
        L_0x0058:
            return
        L_0x0059:
            X.0qQ.A0F(r1)
            goto L_0x007e
        L_0x005d:
            X.LRi r0 = r6.A0B
            if (r0 == 0) goto L_0x0077
            r0.A07(r2)
            X.LGg r0 = r6.A0D
            if (r0 == 0) goto L_0x0073
            r0.A06(r2)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r0 = r6.A0F
            if (r0 == 0) goto L_0x007b
            r0.A0L(r2)
            return
        L_0x0073:
            X.0qQ.A0F(r4)
            goto L_0x007e
        L_0x0077:
            X.0qQ.A0F(r3)
            goto L_0x007e
        L_0x007b:
            X.0qQ.A0F(r5)
        L_0x007e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0F(com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment, X.Kh8):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: X.4DH} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r39) {
        /*
            r38 = this;
            r0 = 747084410(0x2c879a7a, float:3.854081E-12)
            int r14 = X.AnonymousClass0fD.A02(r0)
            r0 = r38
            r1 = r39
            super.onCreate(r1)
            X.AE4 r2 = A02(r0)
            java.lang.String r1 = "on_create"
            r2.A04(r1)
            android.os.Bundle r5 = r0.requireArguments()
            java.lang.String r1 = "ARG_SELECTED_STICKER_ID"
            java.lang.String r1 = r5.getString(r1)
            if (r1 == 0) goto L_0x0025
            r0.A10 = r1
        L_0x0025:
            java.lang.String r1 = "ARG_SWIPE_TO_ENTER_TIMELINE"
            boolean r1 = r5.getBoolean(r1)
            r0.A0u = r1
            java.lang.String r1 = "ARG_SELECTED_AUDIO_ID"
            java.lang.String r1 = r5.getString(r1)
            if (r1 == 0) goto L_0x0037
            r0.A0o = r1
        L_0x0037:
            java.lang.String r1 = "ARG_OPEN_TIMELINE_STATE"
            java.io.Serializable r3 = r5.getSerializable(r1)
            boolean r2 = r3 instanceof X.C390919s3
            r1 = 0
            if (r2 == 0) goto L_0x005a
            X.9s3 r3 = (X.C390919s3) r3
        L_0x0044:
            r0.A0R = r3
            java.lang.String r1 = "ARG_CLIPS_DRAFT_SESSION_ID"
            java.lang.String r1 = r5.getString(r1)
            if (r1 == 0) goto L_0x0050
            r0.A0n = r1
        L_0x0050:
            java.lang.Class<com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider> r4 = com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider.class
            java.lang.ClassLoader r1 = r4.getClassLoader()
            r5.setClassLoader(r1)
            goto L_0x005c
        L_0x005a:
            r3 = r1
            goto L_0x0044
        L_0x005c:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalStateException -> 0x0092 }
            r2 = 33
            java.lang.String r1 = "ARG_TARGET_VIEW_SIZE_PROVIDER"
            if (r3 < r2) goto L_0x007b
            java.lang.Object r1 = r5.getParcelable(r1, r4)     // Catch:{ IllegalStateException -> 0x0092 }
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = (com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider) r1     // Catch:{ IllegalStateException -> 0x0092 }
            if (r1 != 0) goto L_0x00ab
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()     // Catch:{ IllegalStateException -> 0x0092 }
            X.0eM r1 = r0.A05     // Catch:{ IllegalStateException -> 0x0092 }
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)     // Catch:{ IllegalStateException -> 0x0092 }
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = X.C226132fh.A00(r2, r1)     // Catch:{ IllegalStateException -> 0x0092 }
            goto L_0x00ab
        L_0x007b:
            android.os.Parcelable r1 = r5.getParcelable(r1)     // Catch:{ IllegalStateException -> 0x0092 }
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = (com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider) r1     // Catch:{ IllegalStateException -> 0x0092 }
            if (r1 != 0) goto L_0x00ab
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()     // Catch:{ IllegalStateException -> 0x0092 }
            X.0eM r1 = r0.A05     // Catch:{ IllegalStateException -> 0x0092 }
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)     // Catch:{ IllegalStateException -> 0x0092 }
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = X.C226132fh.A00(r2, r1)     // Catch:{ IllegalStateException -> 0x0092 }
            goto L_0x00ab
        L_0x0092:
            r4 = move-exception
            X.0wj r3 = X.0wj.A01
            r2 = 613296938(0x248e2b2a, float:6.1655806E-17)
            java.lang.String r1 = "ARG_TARGET_VIEW_SIZE_PROVIDER IllegalStateException"
            X.AnonymousClass7TG.A1I(r3, r1, r4, r2)
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.0eM r1 = r0.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = X.C226132fh.A00(r2, r1)
        L_0x00ab:
            java.lang.String r3 = "ARG_IS_BASEL"
            r2 = 0
            boolean r3 = r5.getBoolean(r3, r2)
            r0.A0q = r3
            r3 = r1
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r3 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r3
            int r3 = r3.A06
            r0.A00 = r3
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            X.0eM r15 = r0.A05
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r15)
            X.2YL r3 = X.JTS.A0E(r0, r4, r3)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r3 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r3
            r0.A0Z = r3
            X.2YN r4 = X.DbW.A0F(r0)
            java.lang.Class<X.88B> r3 = X.AnonymousClass88B.class
            X.2YL r3 = r4.A00(r3)
            X.88B r3 = (X.AnonymousClass88B) r3
            r0.A0z = r3
            X.2YN r3 = X.DbW.A0F(r0)
            java.lang.Class<X.860> r5 = X.AnonymousClass860.class
            X.2YL r3 = r3.A00(r5)
            X.860 r3 = (X.AnonymousClass860) r3
            java.lang.String r4 = "post_capture"
            X.861 r3 = r3.A00(r4)
            r0.A0j = r3
            X.2YN r3 = X.DbW.A0F(r0)
            X.2YL r3 = r3.A00(r5)
            X.860 r3 = (X.AnonymousClass860) r3
            X.89w r3 = r3.A01(r4)
            r0.A0l = r3
            androidx.fragment.app.FragmentActivity r8 = r0.requireActivity()
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r15)
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r3 = r0.A0Z
            java.lang.String r24 = "clipsCreationViewModel"
            if (r3 == 0) goto L_0x064a
            X.2Fk r5 = r3.A0C
            X.861 r3 = r0.A0j
            java.lang.String r23 = "videoPlaybackViewModel"
            if (r3 == 0) goto L_0x0243
            X.2Fj r4 = r3.A0G
            X.8RE r3 = new X.8RE
            r3.<init>(r6, r5, r4, r7)
            X.2YN r4 = X.JTO.A0L(r3, r8)
            java.lang.Class<X.8RF> r3 = X.AnonymousClass8RF.class
            X.2YL r3 = r4.A00(r3)
            X.8RF r3 = (X.AnonymousClass8RF) r3
            r0.A0d = r3
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r15)
            X.8RK r3 = new X.8RK
            r3.<init>(r5, r4)
            X.2YN r4 = X.JTO.A0L(r3, r6)
            java.lang.Class<X.8RL> r3 = X.AnonymousClass8RL.class
            X.2YL r3 = r4.A00(r3)
            X.8RL r3 = (X.AnonymousClass8RL) r3
            r0.A0c = r3
            r0.A0b = r3
            X.8RF r4 = r0.A0d
            java.lang.String r22 = "clipsTimelineEditorViewModel"
            if (r4 == 0) goto L_0x0645
            r3 = 1
            r4.A03 = r3
            X.JTR.A1M(r4)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r15)
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            X.8RF r8 = r0.A0d
            if (r8 == 0) goto L_0x0645
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r7 = r0.A0Z
            if (r7 == 0) goto L_0x064a
            int r10 = r0.A00
            r4 = 20
            X.MMB r9 = X.MMB.A00(r0, r4)
            X.KEP r4 = new X.KEP
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.2YN r5 = X.JTO.A0L(r4, r0)
            java.lang.Class<X.KMu> r4 = X.C61806KMu.class
            X.2YL r4 = r5.A00(r4)
            X.KMu r4 = (X.C61806KMu) r4
            r0.A0i = r4
            java.lang.String r21 = "timedElementsViewModel"
            if (r4 == 0) goto L_0x0640
            r4.A0O()
            X.KMu r5 = r0.A0i
            if (r5 == 0) goto L_0x0640
            int r4 = r0.A00
            int r4 = r4 / 2
            r5.A02 = r4
            r5.A0G()
            X.C61806KMu.A00(r5)
            X.KMu r5 = r0.A0i
            if (r5 == 0) goto L_0x0640
            int r4 = r0.A00
            int r4 = r4 / 2
            X.C61806KMu.A02(r5, r4)
            android.media.MediaPlayer r4 = new android.media.MediaPlayer
            r4.<init>()
            r0.A04 = r4
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r15)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r7 = r0.A0Z
            if (r7 == 0) goto L_0x064a
            X.8RF r9 = r0.A0d
            if (r9 == 0) goto L_0x0645
            X.8RL r8 = r0.A0c
            java.lang.String r20 = "clipsTimelineButtonEventProvider"
            if (r8 == 0) goto L_0x063b
            int r11 = r0.A00
            boolean r12 = r0.A0q
            r4 = 21
            X.MMB r10 = X.MMB.A00(r0, r4)
            X.KEb r4 = new X.KEb
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            X.2YN r5 = X.JTO.A0L(r4, r0)
            java.lang.Class<X.Jhy> r4 = X.C60241Jhy.class
            X.2YL r5 = r5.A00(r4)
            X.Jhy r5 = (X.C60241Jhy) r5
            r0.A0x = r5
            java.lang.String r6 = "audioTrackViewModelContainer"
            if (r5 == 0) goto L_0x0636
            java.lang.String r4 = "audio"
            X.KMt r4 = r5.A00(r4)
            r0.A0f = r4
            X.Jhy r5 = r0.A0x
            if (r5 == 0) goto L_0x0636
            java.lang.String r4 = "voice_over"
            X.KMt r4 = r5.A00(r4)
            r0.A0g = r4
            androidx.fragment.app.FragmentActivity r8 = r0.requireActivity()
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r15)
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r0.A0Z
            if (r5 == 0) goto L_0x064a
            X.8M0 r4 = new X.8M0
            r4.<init>(r6, r7, r5)
            X.2YN r5 = X.JTO.A0L(r4, r8)
            java.lang.Class<X.8M1> r4 = X.AnonymousClass8M1.class
            X.2YL r4 = r5.A00(r4)
            X.8M1 r4 = (X.AnonymousClass8M1) r4
            r0.A0e = r4
            com.instagram.common.session.UserSession r27 = X.AnonymousClass7TE.A0l(r15)
            androidx.fragment.app.FragmentActivity r26 = r0.requireActivity()
            X.8RF r13 = r0.A0d
            if (r13 == 0) goto L_0x0645
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r12 = r0.A0Z
            if (r12 == 0) goto L_0x064a
            X.861 r11 = r0.A0j
            if (r11 == 0) goto L_0x0243
            X.89w r10 = r0.A0l
            java.lang.String r19 = "bitmapTimelineViewModel"
            if (r10 == 0) goto L_0x0631
            X.KMt r9 = r0.A0f
            java.lang.String r18 = "stackedTimelineAudioTrackViewModel"
            if (r9 == 0) goto L_0x0392
            X.KMt r8 = r0.A0g
            if (r8 != 0) goto L_0x024b
            java.lang.String r23 = "stackedTimelineVoiceoverViewModel"
        L_0x0243:
            X.0qQ.A0F(r23)
        L_0x0246:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x024b:
            X.KMu r7 = r0.A0i
            if (r7 == 0) goto L_0x0640
            X.8M1 r6 = r0.A0e
            if (r6 != 0) goto L_0x0256
            java.lang.String r23 = "clipsTransformViewModel"
            goto L_0x0243
        L_0x0256:
            boolean r5 = r0.A0q
            X.KEg r4 = new X.KEg
            r25 = r4
            r28 = r1
            r29 = r12
            r30 = r13
            r31 = r6
            r32 = r9
            r33 = r8
            r34 = r7
            r35 = r11
            r36 = r10
            r37 = r5
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.2YN r5 = X.JTO.A0L(r4, r0)
            java.lang.Class<X.Jfo> r4 = X.C60108Jfo.class
            X.2YL r4 = r5.A00(r4)
            X.Jfo r4 = (X.C60108Jfo) r4
            r0.A0h = r4
            r0.A0t = r3
            androidx.fragment.app.FragmentActivity r7 = r0.requireActivity()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r15)
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            X.85w r4 = new X.85w
            r4.<init>(r6, r5)
            X.2YN r5 = X.JTO.A0L(r4, r7)
            java.lang.Class<X.85x> r4 = X.C3507185x.class
            X.2YL r4 = r5.A00(r4)
            X.85x r4 = (X.C3507185x) r4
            r0.A0X = r4
            androidx.fragment.app.FragmentActivity r7 = r0.requireActivity()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r15)
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            X.8IH r4 = new X.8IH
            r4.<init>(r6, r5)
            X.2YN r5 = X.JTO.A0L(r4, r7)
            java.lang.Class<X.8II> r4 = X.AnonymousClass8II.class
            X.2YL r4 = r5.A00(r4)
            X.8II r4 = (X.AnonymousClass8II) r4
            r0.A0A = r4
            androidx.fragment.app.FragmentActivity r7 = r0.requireActivity()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r15)
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            X.KCc r4 = new X.KCc
            r4.<init>(r6, r5)
            X.2YN r5 = X.JTO.A0L(r4, r7)
            java.lang.Class<X.Jfn> r4 = X.C60107Jfn.class
            X.2YL r4 = r5.A00(r4)
            X.Jfn r4 = (X.C60107Jfn) r4
            r0.A0w = r4
            androidx.fragment.app.FragmentActivity r8 = r0.requireActivity()
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r15)
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r4 = r0.A0Z
            if (r4 == 0) goto L_0x064a
            java.lang.String r5 = r4.A0S
            X.KDL r4 = new X.KDL
            r4.<init>(r6, r7, r5)
            X.2YN r5 = X.JTO.A0L(r4, r8)
            java.lang.Class<X.Jhu> r4 = X.C60237Jhu.class
            X.2YL r4 = r5.A00(r4)
            X.Jhu r4 = (X.C60237Jhu) r4
            r0.A0V = r4
            androidx.fragment.app.FragmentActivity r8 = r0.requireActivity()
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r15)
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r0.A0Z
            if (r5 == 0) goto L_0x064a
            X.KDM r4 = new X.KDM
            r4.<init>(r6, r7, r5)
            X.2YN r5 = X.JTO.A0L(r4, r8)
            java.lang.Class<X.Jff> r4 = X.C60099Jff.class
            X.2YL r4 = r5.A00(r4)
            X.Jff r4 = (X.C60099Jff) r4
            r0.A0W = r4
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r15)
            X.KBh r4 = new X.KBh
            r4.<init>(r5)
            X.2YN r5 = X.JTO.A0L(r4, r6)
            java.lang.Class<X.JjO> r4 = X.C60320JjO.class
            X.2YL r4 = r5.A00(r4)
            X.JjO r4 = (X.C60320JjO) r4
            r0.A0y = r4
            androidx.fragment.app.FragmentActivity r8 = r0.requireActivity()
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r15)
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r4 = r0.A0Z
            if (r4 == 0) goto L_0x064a
            X.83m r5 = r4.A0Q
            X.8Lu r4 = new X.8Lu
            r4.<init>(r6, r7, r5)
            X.2YN r5 = X.JTO.A0L(r4, r8)
            java.lang.Class<X.8Lv> r4 = X.C354388Lv.class
            X.2YL r4 = r5.A00(r4)
            X.8Lv r4 = (X.C354388Lv) r4
            r0.A0Y = r4
            androidx.fragment.app.FragmentActivity r26 = r0.requireActivity()
            com.instagram.common.session.UserSession r27 = X.AnonymousClass7TE.A0l(r15)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r11 = r0.A0Z
            if (r11 == 0) goto L_0x064a
            X.88B r10 = r0.A0z
            java.lang.String r17 = "clipsSourceMediaViewModel"
            if (r10 == 0) goto L_0x062c
            X.8RF r9 = r0.A0d
            if (r9 == 0) goto L_0x0645
            X.Jfo r8 = r0.A0h
            java.lang.String r16 = "stackedTimelineViewModel"
            if (r8 == 0) goto L_0x0627
            X.KMt r7 = r0.A0f
            if (r7 == 0) goto L_0x0392
            X.87s r31 = r0.A0P()
            X.8Lv r6 = r0.A0Y
            if (r6 != 0) goto L_0x0397
            java.lang.String r18 = "clipsColorFilterViewModel"
        L_0x0392:
            X.0qQ.A0F(r18)
            goto L_0x0246
        L_0x0397:
            com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig r5 = r0.A02
            X.KEd r4 = new X.KEd
            r25 = r4
            r28 = r5
            r29 = r6
            r30 = r11
            r32 = r9
            r33 = r7
            r34 = r8
            r35 = r10
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.2YN r5 = X.JTO.A0L(r4, r0)
            java.lang.Class<X.Jfp> r4 = X.C60109Jfp.class
            X.2YL r4 = r5.A00(r4)
            X.Jfp r4 = (X.C60109Jfp) r4
            r0.A0a = r4
            android.content.Context r5 = r0.requireContext()
            X.3rc r4 = new X.3rc
            r4.<init>(r5)
            r0.A0k = r4
            com.instagram.common.session.UserSession r27 = X.AnonymousClass7TE.A0l(r15)
            int r9 = r0.A00
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r8 = r0.A0Z
            if (r8 == 0) goto L_0x064a
            X.8RF r7 = r0.A0d
            if (r7 == 0) goto L_0x0645
            X.8RL r6 = r0.A0c
            if (r6 == 0) goto L_0x063b
            X.Jfp r5 = r0.A0a
            java.lang.String r13 = "clipsTimelineActionBarViewModel"
            if (r5 == 0) goto L_0x0622
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = new com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController
            r25 = r4
            r26 = r0
            r28 = r8
            r29 = r5
            r30 = r6
            r31 = r7
            r32 = r9
            r33 = r3
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r0.A0G = r4
            android.content.Context r4 = r0.requireContext()
            X.KMQ r3 = new X.KMQ
            r3.<init>(r0)
            X.030 r12 = new X.030
            r12.<init>(r4, r3)
            boolean r3 = r0.A0q
            if (r3 == 0) goto L_0x052a
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r0.A0Z
            if (r5 == 0) goto L_0x064a
            int r3 = r0.A00
            com.instagram.creation.capture.quickcapture.sundial.edit.BaselStackedTimelineMiddleActionViewControllerImpl r4 = new com.instagram.creation.capture.quickcapture.sundial.edit.BaselStackedTimelineMiddleActionViewControllerImpl
            r4.<init>(r0, r5, r3)
        L_0x0413:
            X.MXL r4 = (X.MXL) r4
            r0.A0C = r4
            com.instagram.common.session.UserSession r28 = X.AnonymousClass7TE.A0l(r15)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r11 = r0.A0Z
            if (r11 == 0) goto L_0x064a
            X.8RF r10 = r0.A0d
            if (r10 == 0) goto L_0x0645
            X.8RL r9 = r0.A0c
            if (r9 == 0) goto L_0x063b
            X.Jfo r8 = r0.A0h
            if (r8 == 0) goto L_0x0627
            X.88B r7 = r0.A0z
            if (r7 == 0) goto L_0x062c
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r6 = r0.A0G
            java.lang.String r17 = "actionBarViewController"
            if (r6 == 0) goto L_0x062c
            X.MXL r5 = r0.A0C
            java.lang.String r18 = "middleActionBarViewController"
            if (r5 == 0) goto L_0x0392
            int r4 = r0.A00
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r3 = new com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController
            r25 = r3
            r26 = r12
            r27 = r0
            r29 = r5
            r30 = r6
            r31 = r11
            r32 = r9
            r33 = r10
            r34 = r8
            r35 = r7
            r36 = r4
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r0.A0F = r3
            com.instagram.common.session.UserSession r27 = X.AnonymousClass7TE.A0l(r15)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r8 = r0.A0F
            java.lang.String r10 = "viewController"
            if (r8 == 0) goto L_0x061d
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r7 = r0.A0Z
            if (r7 == 0) goto L_0x064a
            X.8RF r6 = r0.A0d
            if (r6 == 0) goto L_0x0645
            X.861 r5 = r0.A0j
            if (r5 == 0) goto L_0x0243
            X.Jfo r4 = r0.A0h
            if (r4 == 0) goto L_0x0627
            android.content.Context r26 = r0.requireContext()
            X.Lgg r3 = new X.Lgg
            r25 = r3
            r28 = r1
            r29 = r8
            r30 = r7
            r31 = r6
            r32 = r4
            r33 = r5
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r0.A0P = r3
            r0.registerLifecycleListener(r3)
            com.instagram.common.session.UserSession r26 = X.AnonymousClass7TE.A0l(r15)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r7 = r0.A0F
            if (r7 == 0) goto L_0x061d
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r6 = r0.A0Z
            if (r6 == 0) goto L_0x064a
            X.8RF r5 = r0.A0d
            if (r5 == 0) goto L_0x0645
            X.8RL r4 = r0.A0c
            if (r4 == 0) goto L_0x063b
            X.861 r3 = r0.A0j
            if (r3 == 0) goto L_0x0243
            X.LgY r1 = new X.LgY
            r25 = r1
            r27 = r7
            r28 = r6
            r29 = r4
            r30 = r5
            r31 = r3
            r25.<init>(r26, r27, r28, r29, r30, r31)
            r0.A0N = r1
            r0.registerLifecycleListener(r1)
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r15)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r4 = r0.A0F
            if (r4 == 0) goto L_0x061d
            X.50r r3 = r0.A04
            X.LgX r1 = new X.LgX
            r1.<init>(r0, r5, r4, r3)
            r0.registerLifecycleListener(r1)
            com.instagram.common.session.UserSession r26 = X.AnonymousClass7TE.A0l(r15)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r9 = r0.A0F
            if (r9 == 0) goto L_0x061d
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r8 = r0.A0Z
            if (r8 == 0) goto L_0x064a
            X.8RF r7 = r0.A0d
            if (r7 == 0) goto L_0x0645
            X.8RL r6 = r0.A0c
            if (r6 == 0) goto L_0x063b
            X.Jfp r5 = r0.A0a
            if (r5 == 0) goto L_0x0622
            X.KMu r4 = r0.A0i
            if (r4 == 0) goto L_0x0640
            X.861 r3 = r0.A0j
            if (r3 == 0) goto L_0x0243
            X.Lgf r1 = new X.Lgf
            r25 = r1
            r27 = r9
            r28 = r8
            r29 = r5
            r30 = r6
            r31 = r7
            r32 = r4
            r33 = r3
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r0.A0Q = r1
            r0.registerLifecycleListener(r1)
            com.instagram.common.session.UserSession r27 = X.AnonymousClass7TE.A0l(r15)
            android.content.Context r26 = r0.requireContext()
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r8 = r0.A0F
            if (r8 == 0) goto L_0x061d
            X.8RL r7 = r0.A0c
            if (r7 == 0) goto L_0x063b
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r6 = r0.A0Z
            if (r6 == 0) goto L_0x064a
            X.8RF r5 = r0.A0d
            if (r5 == 0) goto L_0x0645
            X.Jfn r4 = r0.A0w
            if (r4 != 0) goto L_0x0539
            java.lang.String r18 = "jumpCutViewModel"
            goto L_0x0392
        L_0x052a:
            X.8RF r5 = r0.A0d
            if (r5 == 0) goto L_0x0645
            X.Jfo r3 = r0.A0h
            if (r3 == 0) goto L_0x0627
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineMiddleActionBarViewControllerImpl r4 = new com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineMiddleActionBarViewControllerImpl
            r4.<init>(r0, r5, r3)
            goto L_0x0413
        L_0x0539:
            X.861 r3 = r0.A0j
            if (r3 == 0) goto L_0x0243
            X.Lga r1 = new X.Lga
            r25 = r1
            r28 = r8
            r29 = r4
            r30 = r6
            r31 = r7
            r32 = r5
            r33 = r3
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r0.A0M = r1
            r0.registerLifecycleListener(r1)
            com.instagram.common.session.UserSession r26 = X.AnonymousClass7TE.A0l(r15)
            X.89w r8 = r0.A0l
            if (r8 == 0) goto L_0x0631
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r7 = r0.A0Z
            if (r7 == 0) goto L_0x064a
            X.8RF r6 = r0.A0d
            if (r6 == 0) goto L_0x0645
            int r5 = r0.A00
            X.Jfo r3 = r0.A0h
            if (r3 == 0) goto L_0x0627
            r1 = 67
            X.MIW r4 = new X.MIW
            r4.<init>(r3, r1)
            X.85x r1 = r0.A0X
            if (r1 != 0) goto L_0x057a
            java.lang.String r23 = "clipsAudioVolumeViewModel"
            goto L_0x0243
        L_0x057a:
            X.9NK r3 = new X.9NK
            r3.<init>(r1, r2)
            X.JlL r1 = new X.JlL
            r25 = r1
            r27 = r7
            r28 = r6
            r29 = r8
            r30 = r4
            r31 = r3
            r32 = r5
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r0.A0v = r1
            A0B(r0)
            X.MXL r1 = r0.A0C
            if (r1 == 0) goto L_0x0392
            r0.registerLifecycleListener(r1)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r1 = r0.A0G
            if (r1 == 0) goto L_0x062c
            r0.registerLifecycleListener(r1)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r1 = r0.A0F
            if (r1 == 0) goto L_0x061d
            r0.registerLifecycleListener(r1)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r0.A0Z
            if (r1 == 0) goto L_0x064a
            int r7 = X.JTO.A07(r1)
            int r1 = r0.A00
            int r6 = r1 / 2
            android.content.Context r4 = r0.requireContext()
            X.LQO.A04 = r7
            X.LQO.A02 = r7
            r1 = 15000(0x3a98, float:2.102E-41)
            if (r7 >= r1) goto L_0x060b
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x05c6:
            X.LQO.A00 = r5
            r1 = 15000(0x3a98, float:2.102E-41)
            if (r7 >= r1) goto L_0x0600
            r3 = 1148846080(0x447a0000, float:1000.0)
        L_0x05ce:
            int r1 = (int) r3
            X.LQO.A03 = r1
            X.LQO.A01 = r5
            float r4 = X.JTS.A01(r4, r5)
            float r1 = (float) r7
            float r4 = r4 * r1
            float r3 = (float) r6
            int r1 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x05e1
            float r3 = r3 * r5
            float r5 = r3 / r4
        L_0x05e1:
            X.LQO.A01 = r5
            android.content.Context r4 = r0.requireContext()
            X.KMR r3 = new X.KMR
            r3.<init>(r0)
            X.030 r1 = new X.030
            r1.<init>(r4, r3)
            r0.A06 = r1
            android.view.GestureDetector r1 = r1.A00
            r1.setIsLongpressEnabled(r2)
            X.3rc r1 = r0.A0k
            if (r1 != 0) goto L_0x064f
            java.lang.String r23 = "scaleGestureDetector"
            goto L_0x0243
        L_0x0600:
            r1 = 30000(0x7530, float:4.2039E-41)
            r3 = 1176256512(0x461c4000, float:10000.0)
            if (r7 >= r1) goto L_0x05ce
            r3 = 1167867904(0x459c4000, float:5000.0)
            goto L_0x05ce
        L_0x060b:
            r1 = 30000(0x7530, float:4.2039E-41)
            if (r7 >= r1) goto L_0x0612
            r5 = 1056964608(0x3f000000, float:0.5)
            goto L_0x05c6
        L_0x0612:
            r1 = 60000(0xea60, float:8.4078E-41)
            r5 = 1042983594(0x3e2aaaaa, float:0.16666666)
            if (r7 >= r1) goto L_0x05c6
            r5 = 1048576000(0x3e800000, float:0.25)
            goto L_0x05c6
        L_0x061d:
            X.0qQ.A0F(r10)
            goto L_0x0246
        L_0x0622:
            X.0qQ.A0F(r13)
            goto L_0x0246
        L_0x0627:
            X.0qQ.A0F(r16)
            goto L_0x0246
        L_0x062c:
            X.0qQ.A0F(r17)
            goto L_0x0246
        L_0x0631:
            X.0qQ.A0F(r19)
            goto L_0x0246
        L_0x0636:
            X.0qQ.A0F(r6)
            goto L_0x0246
        L_0x063b:
            X.0qQ.A0F(r20)
            goto L_0x0246
        L_0x0640:
            X.0qQ.A0F(r21)
            goto L_0x0246
        L_0x0645:
            X.0qQ.A0F(r22)
            goto L_0x0246
        L_0x064a:
            X.0qQ.A0F(r24)
            goto L_0x0246
        L_0x064f:
            X.LzC r2 = new X.LzC
            r2.<init>(r0)
            java.util.Set r1 = r1.A01
            r1.add(r2)
            android.os.Handler r5 = X.AnonymousClass7TF.A0D()
            r1 = 4
            X.Ljp r4 = new X.Ljp
            r4.<init>(r0, r1)
            r2 = 300(0x12c, double:1.48E-321)
            X.0mM r1 = new X.0mM
            r1.<init>(r5, r4, r2)
            r0.A07 = r1
            X.L0Q r2 = new X.L0Q
            r2.<init>(r0)
            X.L41 r1 = new X.L41
            r1.<init>(r2)
            r0.A0U = r1
            r0 = 2016169029(0x782c4c45, float:1.3978469E34)
            X.AnonymousClass0fD.A09(r0, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1645244828);
        0qQ.A0B(layoutInflater, 0);
        A02(this).A04("on_create_view");
        ClipsStackedTimelineViewController clipsStackedTimelineViewController = this.A0F;
        if (clipsStackedTimelineViewController == null) {
            0qQ.A0F("viewController");
            throw AnonymousClass00P.createAndThrow();
        }
        View inflate = layoutInflater.inflate(clipsStackedTimelineViewController.A07, viewGroup, false);
        AnonymousClass0fD.A09(1663537168, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(151332492);
        super.onDestroy();
        MediaPlayer mediaPlayer = this.A04;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            mediaPlayer.release();
        }
        this.A04 = null;
        AnonymousClass0fD.A09(201721965, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1313975579);
        super.onDestroyView();
        C3516889w r0 = this.A0l;
        if (r0 == null) {
            0qQ.A0F("bitmapTimelineViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        JTP.A1A(r0.A05, C390059qf.A00);
        Dialog dialog = this.A02;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.A02 = null;
        Dialog dialog2 = this.A03;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        this.A03 = null;
        this.A0s = false;
        this.A0R = null;
        AnonymousClass0fD.A09(-1607237263, A022);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        LRJ.A00();
        AnonymousClass861 r0 = this.A0j;
        if (r0 == null) {
            0qQ.A0F("videoPlaybackViewModel");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A03();
        }
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-712778490);
        ClipsStackedTimelineFragment.super.onPause();
        A0S();
        AnonymousClass0fD.A09(767727620, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1751111658);
        super.onResume();
        A0T();
        AnonymousClass8A2 A012 = AnonymousClass8A1.A01(AnonymousClass7TE.A0l(this.A05));
        1QP r4 = A012.A0J;
        long j = A012.A0A;
        AE4 ae4 = new AE4(r4);
        ae4.A01 = j;
        ae4.A04("on_resume");
        long j2 = A012.A0A;
        AE4 ae42 = new AE4(r4);
        ae42.A01 = j2;
        ae42.A02();
        A012.A0A = 0;
        AnonymousClass0fD.A09(167616104, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1543156819);
        ClipsStackedTimelineFragment.super.onStart();
        A02(this).A04("on_start");
        AnonymousClass0fD.A09(-1309994703, A022);
    }
}
