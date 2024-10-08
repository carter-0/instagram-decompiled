package X;

import android.content.Context;
import android.media.AudioManager;
import android.view.View;
import com.instagram.android.R;
import com.instagram.autoplay.models.AutoplayPlaybackState;
import com.instagram.common.session.UserSession;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Ttm  reason: case insensitive filesystem */
public class C14312Ttm implements Comparable, C331117Pq, AudioManager.OnAudioFocusChangeListener, View.OnKeyListener {
    public int A00;
    public long A01;
    public long A02;
    public X8S A03;
    public C14339TuM A04;
    public C14044Tol A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final 1vq A09;
    public final UserSession A0A;
    public final Context A0B;
    public final AudioManager A0C;
    public final C14335TuI A0D;
    public final AnonymousClass4DU A0E;
    public final boolean A0F;

    public static final void A05(C14312Ttm ttm, int i) {
        1GE.A00(ttm.A0A).A00(false);
        C14339TuM tuM = ttm.A04;
        if (tuM != null) {
            tuM.A00 = false;
            C14044Tol tol = ttm.A05;
            if (tol != null) {
                tol.A03(0.0f, i);
                ttm.A09.A03(ttm);
                ttm.A02();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A06(C14312Ttm ttm, int i) {
        1GE.A00(ttm.A0A).A00(true);
        C14339TuM tuM = ttm.A04;
        if (tuM != null) {
            tuM.A00 = true;
            C14044Tol tol = ttm.A05;
            if (tol != null) {
                tol.A03(1.0f, i);
                ttm.A09.A04(ttm);
                ttm.A03();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A09() {
        this.A03 = null;
        A0E(false);
        A0D(false);
        C14044Tol tol = this.A05;
        if (tol != null) {
            this.A00 = tol.A06.getCurrentPositionMs();
            tol.A0B("fragment_paused");
            this.A05 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.C14339TuM r21) {
        /*
            r20 = this;
            r6 = 0
            r0 = r20
            X.Tol r1 = r0.A05
            if (r1 != 0) goto L_0x001b
            android.content.Context r8 = r0.A0B
            com.instagram.common.session.UserSession r9 = r0.A0A
            X.TuI r10 = r0.A0D
            X.4DU r1 = r0.A0E
            java.lang.String r12 = r1.getModuleName()
            X.Tol r7 = new X.Tol
            r11 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A05 = r7
        L_0x001b:
            long r1 = java.lang.System.currentTimeMillis()
            r0.A01 = r1
            r7 = r0
            boolean r5 = r0 instanceof X.C14319Ttt
            r12 = r21
            if (r5 == 0) goto L_0x00d7
            r1 = r7
            X.Ttt r1 = (X.C14319Ttt) r1
            com.instagram.common.session.UserSession r4 = r1.A01
            X.0Tu r3 = X.0Tu.A05
            r1 = 36320777486213980(0x81098e0008235c, double:3.0327441620890976E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x00d7
            boolean r1 = r12.A05
            if (r1 != 0) goto L_0x00d7
            r1 = 0
        L_0x003f:
            r0.A00 = r1
            r0.A04 = r12
            boolean r1 = r0.A06
            r4 = 0
            if (r1 == 0) goto L_0x0059
            com.instagram.common.session.UserSession r1 = r0.A0A
            X.1GF r1 = X.1GE.A00(r1)
            java.lang.Boolean r1 = r1.A01
            if (r1 == 0) goto L_0x0059
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0059
            r4 = 1
        L_0x0059:
            X.TuM r1 = r0.A04
            if (r1 == 0) goto L_0x005f
            r1.A00 = r4
        L_0x005f:
            java.lang.Object r8 = r12.A03
            java.lang.String r1 = "Required value was null."
            if (r8 == 0) goto L_0x00db
            X.1Xj r8 = (X.1Xj) r8
            X.3WR r11 = r8.CEL()
            java.lang.Integer r3 = r12.A06
            if (r3 == 0) goto L_0x00d3
            int r9 = r3.intValue()
            if (r9 == 0) goto L_0x00d3
        L_0x0075:
            if (r9 <= 0) goto L_0x0089
            boolean r1 = r0.A0F
            if (r1 == 0) goto L_0x0089
            r11.A01 = r6
            r11.A00 = r9
            X.Tol r1 = r0.A05
            if (r1 == 0) goto L_0x0089
            r2 = 1
            X.4M3 r1 = r1.A06
            r1.ERk(r2)
        L_0x0089:
            X.Tol r9 = r0.A05
            if (r9 == 0) goto L_0x00c4
            java.lang.String r13 = r8.A0M
            X.X7p r1 = r12.A05
            com.instagram.discovery.ui.FixedAspectRatioVideoLayout r10 = r1.BLn()
            r16 = -1
            if (r5 == 0) goto L_0x00d0
            X.Ttt r7 = (X.C14319Ttt) r7
            com.instagram.common.session.UserSession r6 = r7.A01
            X.0Tu r5 = X.0Tu.A05
            r1 = 36320777486213980(0x81098e0008235c, double:3.0327441620890976E-306)
            boolean r1 = X.182.A06(r5, r6, r1)
            if (r1 == 0) goto L_0x00d0
            boolean r1 = r12.A05
            if (r1 != 0) goto L_0x00d0
            r5 = 0
        L_0x00af:
            boolean r2 = r12.A07
            r19 = 1
            float r15 = X.C51971G9r.A00(r4)
            X.4DU r1 = r0.A0E
            java.lang.String r14 = r1.getModuleName()
            r17 = r5
            r18 = r2
            r9.A09(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x00c4:
            if (r3 == 0) goto L_0x00cf
            int r1 = r3.intValue()
            if (r1 == 0) goto L_0x00cf
            long r1 = (long) r1
            r0.A02 = r1
        L_0x00cf:
            return
        L_0x00d0:
            int r5 = r12.A02
            goto L_0x00af
        L_0x00d3:
            long r1 = r0.A02
            int r9 = (int) r1
            goto L_0x0075
        L_0x00d7:
            int r1 = r12.A02
            goto L_0x003f
        L_0x00db:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14312Ttm.A0B(X.TuM):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r5.equals(r0.A05) == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0H(X.C20976X7p r5, X.1Xj r6) {
        /*
            r4 = this;
            r3 = 0
            X.TuM r0 = r4.A04
            r2 = 1
            if (r0 == 0) goto L_0x000f
            X.X7p r0 = r0.A05
            boolean r0 = r5.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            X.TuM r0 = r4.A04
            if (r0 == 0) goto L_0x003a
            java.lang.Object r0 = r0.A03
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x003a
        L_0x001c:
            if (r1 == 0) goto L_0x0026
            if (r2 != 0) goto L_0x0025
            java.lang.String r0 = "media_mismatch"
            r4.A0C(r0, r3)
        L_0x0025:
            return r2
        L_0x0026:
            if (r2 == 0) goto L_0x0025
            X.TuM r0 = r4.A04
            if (r0 == 0) goto L_0x003c
            r0.A05 = r5
            X.Tol r1 = r4.A05
            if (r1 == 0) goto L_0x0025
            com.instagram.discovery.ui.FixedAspectRatioVideoLayout r0 = r5.BLn()
            r1.A08(r0)
            return r2
        L_0x003a:
            r2 = 0
            goto L_0x001c
        L_0x003c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14312Ttm.A0H(X.X7p, X.1Xj):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r0 = r3.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0I(X.1Xj r4) {
        /*
            r3 = this;
            r2 = 1
            if (r4 == 0) goto L_0x0022
            X.1iA r1 = r4.BR7()
            X.1iA r0 = X.1iA.A0a
            if (r1 != r0) goto L_0x0022
            X.TuM r0 = r3.A04
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r0.A03
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0022
            X.Tol r0 = r3.A05
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.A0G()
            if (r0 != r2) goto L_0x0022
            return r2
        L_0x0022:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14312Ttm.A0I(X.1Xj):boolean");
    }

    public final void DxV(C263754Nf r1) {
    }

    public final void Dxx(C263754Nf r4) {
        0qQ.A0B(r4, 0);
        X8S x8s = this.A03;
        Object obj = r4.A03;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.Media");
        1Xj r1 = (1Xj) obj;
        if (x8s != null) {
            x8s.Dxv(r1);
        }
    }

    public final void Dyj(int i, int i2) {
    }

    public final void onCues(List list) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r2.A00 != true) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        if (r10 != 25) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        if (r10 != 24) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        r1 = r8.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        if (r1 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        r1.adjustStreamVolume(3, r2, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
        if (r3 == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004b, code lost:
        if (r1.getStreamVolume(3) != 0) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
        A05(r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0050, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0079, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKey(android.view.View r9, int r10, android.view.KeyEvent r11) {
        /*
            r8 = this;
            r0 = 2
            X.0qQ.A0B(r11, r0)
            boolean r0 = r8.A06
            r2 = 0
            if (r0 == 0) goto L_0x0026
            X.Tol r1 = r8.A05
            if (r1 == 0) goto L_0x0026
            X.TuM r0 = r8.A04
            if (r0 == 0) goto L_0x0026
            r5 = 1
            boolean r0 = r1.A0F()
            if (r0 != r5) goto L_0x0026
            int r0 = r11.getAction()
            if (r0 != 0) goto L_0x0026
            r7 = 25
            r6 = 24
            if (r10 == r7) goto L_0x0027
            if (r10 == r6) goto L_0x0027
        L_0x0026:
            return r2
        L_0x0027:
            X.TuM r2 = r8.A04
            if (r2 == 0) goto L_0x0030
            boolean r1 = r2.A00
            r0 = 1
            if (r1 == r5) goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            java.lang.String r4 = "Required value was null."
            if (r0 == 0) goto L_0x0051
            r3 = 1
            if (r10 == r7) goto L_0x003c
        L_0x0038:
            r3 = 0
            r2 = 1
            if (r10 == r6) goto L_0x003d
        L_0x003c:
            r2 = -1
        L_0x003d:
            android.media.AudioManager r1 = r8.A0C
            if (r1 == 0) goto L_0x0074
            r0 = 3
            r1.adjustStreamVolume(r0, r2, r5)
            if (r3 == 0) goto L_0x0050
            int r0 = r1.getStreamVolume(r0)
            if (r0 != 0) goto L_0x0050
            A05(r8, r10)
        L_0x0050:
            return r5
        L_0x0051:
            if (r2 == 0) goto L_0x007a
            java.lang.Object r0 = r2.A03
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x007a
            boolean r0 = r0.A4Y()
            if (r0 == 0) goto L_0x0070
            if (r10 == r6) goto L_0x006c
            android.media.AudioManager r1 = r8.A0C
            if (r1 == 0) goto L_0x0038
            r0 = 3
            int r0 = r1.getStreamVolume(r0)
            if (r0 <= 0) goto L_0x0038
        L_0x006c:
            A06(r8, r10)
            return r5
        L_0x0070:
            r8.A04()
            goto L_0x0038
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x007a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14312Ttm.onKey(android.view.View, int, android.view.KeyEvent):boolean");
    }

    public final void onPrepare(C263754Nf r3) {
        0qQ.A0B(r3, 0);
        X8S x8s = this.A03;
        1Xj r0 = (1Xj) r3.A03;
        if (x8s != null && r0 != null) {
            x8s.DYl(r0);
        }
    }

    public final void onVideoDownloading(C263754Nf r1) {
    }

    public void onVideoPlayerError(C263754Nf r4, String str) {
        0qQ.A0B(r4, 0);
        1Xj r2 = (1Xj) r4.A03;
        if (r2 != null && r2.A4p()) {
            0KC.A03(C14312Ttm.class, AnonymousClass000.A00(2353));
            r2.A0M = null;
        }
    }

    public void onVideoStartedPlaying(C263754Nf r4) {
        0qQ.A0B(r4, 0);
        X8S x8s = this.A03;
        Object obj = r4.A03;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.Media");
        1Xj r1 = (1Xj) obj;
        if (x8s != null) {
            x8s.DyT(r1);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public final void onVideoViewPrepared(C263754Nf r2) {
        0qQ.A0B(r2, 0);
        C14339TuM tuM = (C14339TuM) r2;
        AnonymousClass7TH.A0R(tuM.A05.BGE());
        if (this.A06) {
            C14339TuM tuM2 = this.A04;
            if (tuM2 != null) {
                1Xj r0 = (1Xj) tuM2.A03;
                if (r0 == null) {
                    throw AnonymousClass7TE.A0y();
                } else if (r0.A4Y()) {
                    if (tuM.A00) {
                        A03();
                        return;
                    } else {
                        A02();
                        return;
                    }
                }
            }
            A04();
        }
    }

    private final void A00() {
        C14044Tol tol;
        1Xj A072;
        if (this.A04 != null && (tol = this.A05) != null && (A072 = A07()) != null) {
            UserSession userSession = this.A0A;
            Context context = this.A0B;
            int currentPositionMs = tol.A06.getCurrentPositionMs();
            C14339TuM tuM = this.A04;
            if (tuM != null) {
                int i = tuM.A01;
                C14044Tol tol2 = this.A05;
                if (tol2 != null) {
                    int AzN = tol2.A06.AzN();
                    C14339TuM tuM2 = this.A04;
                    if (tuM2 != null) {
                        int i2 = tuM2.A01;
                        C14044Tol tol3 = this.A05;
                        if (tol3 != null) {
                            boolean z = tuM2.A00;
                            C296625qN.A00(context, userSession, A072, this.A0E, currentPositionMs, i, AzN, i2, 0, C14044Tol.A00(tol3) - tuM2.A00, z);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private final void A01() {
        C14044Tol tol;
        1Xj A072;
        if (this.A04 != null && (tol = this.A05) != null && (A072 = A07()) != null) {
            UserSession userSession = this.A0A;
            Context context = this.A0B;
            int currentPositionMs = tol.A06.getCurrentPositionMs();
            C14339TuM tuM = this.A04;
            if (tuM != null) {
                int i = tuM.A04;
                C14044Tol tol2 = this.A05;
                if (tol2 != null) {
                    int AzN = tol2.A06.AzN();
                    C14339TuM tuM2 = this.A04;
                    if (tuM2 != null) {
                        int i2 = tuM2.A01;
                        C14044Tol tol3 = this.A05;
                        if (tol3 != null) {
                            boolean z = tuM2.A00;
                            C296625qN.A01(context, userSession, A072, this.A0E, currentPositionMs, i, AzN, i2, 0, C14044Tol.A00(tol3) - tuM2.A03, z);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private final void A02() {
        C232822uV r0;
        C14339TuM tuM = this.A04;
        if (tuM != null) {
            C20976X7p x7p = tuM.A05;
            1Xj A072 = A07();
            if (A072 == null || !C243223Xx.A02(A072)) {
                r0 = C232822uV.A0B;
            } else {
                r0 = C232822uV.A0C;
            }
            0qQ.A0A(r0);
            x7p.ABK(r0, R.drawable.instagram_volume_off_pano_filled_24);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    private final void A03() {
        C232822uV r0;
        C14339TuM tuM = this.A04;
        if (tuM != null) {
            C20976X7p x7p = tuM.A05;
            1Xj A072 = A07();
            if (A072 == null || !C243223Xx.A02(A072)) {
                r0 = C232822uV.A0B;
            } else {
                r0 = C232822uV.A0C;
            }
            0qQ.A0A(r0);
            x7p.ABK(r0, R.drawable.instagram_volume_pano_filled_24);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    private final void A04() {
        C232822uV r0;
        C14339TuM tuM = this.A04;
        if (tuM != null) {
            C20976X7p x7p = tuM.A05;
            1Xj A072 = A07();
            if (A072 == null || !C243223Xx.A02(A072)) {
                r0 = C232822uV.A07;
            } else {
                r0 = C232822uV.A08;
            }
            0qQ.A0A(r0);
            x7p.ABK(r0, R.drawable.instagram_volume_none_pano_filled_24);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final 1Xj A07() {
        C14339TuM tuM = this.A04;
        if (tuM != null) {
            return (1Xj) tuM.A03;
        }
        return null;
    }

    public final void A08() {
        C14044Tol tol = this.A05;
        if (!(tol == null || this.A04 == null)) {
            tol.A0A("peek");
            1Xj A072 = A07();
            if (A072 != null) {
                A072.CcK();
            }
        }
        if (this.A06) {
            this.A09.A03(this);
        }
    }

    public final void A0A() {
        C14339TuM tuM = this.A04;
        C14044Tol tol = this.A05;
        if (tol != null && tuM != null) {
            tol.A0C("resume", false);
            if (this.A06) {
                boolean z = false;
                Boolean bool = 1GE.A00(this.A0A).A01;
                if (bool != null && bool.booleanValue()) {
                    z = true;
                }
                tuM.A00 = z;
                this.A09.A04(this);
            }
        }
    }

    public void A0C(String str, boolean z) {
        C14044Tol tol = this.A05;
        if (tol != null) {
            1Xj A072 = A07();
            if (A072 != null && A072.CcK()) {
                if (this.A08) {
                    A01();
                }
                if (this.A07) {
                    A00();
                }
            }
            this.A00 = tol.A06.getCurrentPositionMs();
            tol.A0D(str, z);
        }
    }

    public final void A0D(boolean z) {
        int i;
        C14044Tol tol = this.A05;
        C14339TuM tuM = this.A04;
        if (!(tuM == null || tol == null)) {
            1Xj A072 = A07();
            if (A072 != null && A072.CcK() && this.A07 && !z && tol.A0G()) {
                A00();
            } else if (!this.A07 && z) {
                C14044Tol tol2 = this.A05;
                if (tol2 != null) {
                    i = tol2.A06.getCurrentPositionMs();
                } else {
                    i = this.A00;
                }
                tuM.A01 = i;
                tuM.A00 = C14044Tol.A00(tol);
            }
        }
        this.A07 = z;
    }

    public final void A0E(boolean z) {
        int i;
        C14044Tol tol = this.A05;
        C14339TuM tuM = this.A04;
        if (!(tuM == null || tol == null)) {
            1Xj A072 = A07();
            if (A072 != null && A072.CcK() && this.A08 && !z && tol.A0F()) {
                A01();
            } else if (!this.A08 && z) {
                C14044Tol tol2 = this.A05;
                if (tol2 != null) {
                    i = tol2.A06.getCurrentPositionMs();
                } else {
                    i = this.A00;
                }
                tuM.A04 = i;
                tuM.A03 = C14044Tol.A00(tol);
            }
        }
        this.A08 = z;
    }

    public final boolean A0F() {
        C14044Tol tol = this.A05;
        if (tol != null) {
            AnonymousClass3OB r1 = ((AnonymousClass4M1) tol.A06).A0M;
            0qQ.A07(r1);
            if (r1 == AnonymousClass3OB.IDLE) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A0G() {
        C14044Tol tol = this.A05;
        if (tol == null || tol.A0F()) {
            return true;
        }
        return false;
    }

    public final void Dxy(C263754Nf r5) {
        if (this instanceof C14319Ttt) {
            0qQ.A0B(r5, 0);
            C14319Ttt.A00((C14319Ttt) this, AutoplayPlaybackState.PLAYING, (1Xj) r5.A03, "onVideoPreparedAndStarted");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C14312Ttm ttm = (C14312Ttm) obj;
        0qQ.A0B(ttm, 0);
        boolean A0F2 = A0F();
        boolean A0F3 = ttm.A0F();
        if (A0F2) {
            if (!A0F3) {
                return 1;
            }
            return 0;
        } else if (A0F3) {
            return -1;
        } else {
            return 0;
        }
    }

    public final void onAudioFocusChange(int i) {
        float f;
        if (this.A06) {
            if (i == -3) {
                f = 0.5f;
            } else if (i == -2) {
                f = 0.0f;
            } else if (i == -1) {
                A05(this, 0);
                return;
            } else if (i == 1 || i == 2 || i == 3 || i == 4) {
                f = 1.0f;
            } else {
                return;
            }
            C14044Tol tol = this.A05;
            if (tol != null) {
                tol.A03(f, 0);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void onCompletion() {
        X8S x8s = this.A03;
        if (x8s != null) {
            x8s.onCompletion();
        }
    }

    public final void onLoop(int i) {
        if (this instanceof C14319Ttt) {
            C14319Ttt ttt = (C14319Ttt) this;
            C14319Ttt.A00(ttt, AutoplayPlaybackState.PLAYING_AND_LOOPED_ONCE, ttt.A07(), "onLoop");
        }
    }

    public final void onProgressStateChanged(boolean z) {
        if (this instanceof C14319Ttt) {
            C14319Ttt ttt = (C14319Ttt) this;
            if (z && !ttt.A0G()) {
                C14319Ttt.A00(ttt, AutoplayPlaybackState.BUFFERING, ttt.A07(), "onProgressStateChanged (buffering)");
            }
        }
    }

    public void onProgressUpdate(int i, int i2, boolean z) {
        C14044Tol tol = this.A05;
        if (tol != null) {
            long j = this.A02;
            if (j > 0 && ((long) i) > j && !this.A0F) {
                tol.A05(0, false);
                onLoop(-1);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public void onStopVideo(String str, boolean z) {
        if (this.A06) {
            0nY.A00().ATE(new C15859Ujj(this));
        }
        C14339TuM tuM = this.A04;
        if (tuM != null) {
            C20976X7p x7p = tuM.A05;
            if (z) {
                x7p.BGE().clearAnimation();
                x7p.BGE().setVisibility(0);
            }
        }
        this.A04 = null;
    }

    public C14312Ttm(Context context, UserSession userSession, AnonymousClass4DU r12, String str, long j) {
        this.A0B = context;
        this.A0A = userSession;
        this.A0E = r12;
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.A0C = audioManager;
        this.A09 = new 1vq(audioManager, userSession);
        this.A0D = new C14335TuI(userSession, r12, str, new C73459Pd1(this, 13), new MBH(this, 12), new MBH(this, 13));
        this.A0F = 182.A06(0Tu.A05, userSession, 36320141830725688L);
        this.A02 = j;
    }
}
