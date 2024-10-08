package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.textureview.ScalingTextureView;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.6gP  reason: invalid class name and case insensitive filesystem */
public final class C313416gP implements C313426gQ, C257393xK, TextureView.SurfaceTextureListener, AudioManager.OnAudioFocusChangeListener, C257403xL, C257413xM, C257423xN, View.OnKeyListener {
    public float A00;
    public float A01;
    public int A02 = -1;
    public int A03 = -1;
    public int A04;
    public int A05;
    public int A06 = -1;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public ViewGroup A0G;
    public AnonymousClass4OK A0H;
    public AnonymousClass4MB A0I;
    public C257183wz A0J;
    public AnonymousClass4DU A0K;
    public C255773uh A0L;
    public AnonymousClass4MN A0M;
    public C14721U4j A0N;
    public C316036l0 A0O;
    public Integer A0P;
    public String A0Q;
    public String A0R;
    public boolean A0S = false;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b = false;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f = false;
    public boolean A0g;
    public boolean A0h;
    public long A0i;
    public C257183wz A0j;
    public Runnable A0k;
    public boolean A0l = false;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public final long A0p;
    public final Context A0q;
    public final AudioManager A0r;
    public final Handler A0s = new C313436gR(Looper.getMainLooper(), this);
    public final UserSession A0t;
    public final AnonymousClass4ME A0u;
    public final C252323ov A0v;
    public final AnonymousClass4NX A0w;
    public final AnonymousClass4NY A0x;
    public final AnonymousClass4NW A0y;
    public final AnonymousClass4NT A0z;
    public final AnonymousClass4MI A10;
    public final AnonymousClass4NV A11;
    public final AnonymousClass5MR A12;
    public final ReelViewerFragment A13;
    public final AtomicBoolean A14 = new AtomicBoolean(false);
    public final AtomicBoolean A15 = new AtomicBoolean(false);
    public final boolean A16;
    public final boolean A17;
    public final boolean A18;
    public final long A19;
    public final Handler A1A;
    public final 1vq A1B;
    public final AnonymousClass3BQ A1C;
    public final Runnable A1D;
    public final boolean A1E;
    public final boolean A1F;
    public volatile boolean A1G;
    public volatile boolean A1H;

    public final synchronized View CEZ() {
        AnonymousClass4MN r1 = this.A0M;
        if (r1 == null || !this.A0a) {
            C316036l0 r12 = this.A0O;
            if (r12 == null || this.A0a) {
                return null;
            }
            return r12.C5p();
        }
        return ((AnonymousClass4MM) r1).A09.A04;
    }

    public final void Cwa(int i, int i2) {
        int i3;
        if (i == i2) {
            i3 = 0;
        } else {
            i3 = 25;
            if (i2 > i) {
                i3 = 24;
            }
        }
        this.A15.set(true);
        A0C(this, 1w8.A00().A0C, 100, i3);
        C263834Nn A022 = A02(getCurrentPositionMs());
        this.A0y.A03(i2, i3);
        this.A0u.EGs(A022, this.A0L, i3, false);
    }

    public final void Cwd() {
        this.A1G = true;
        this.A0y.A04(this.A1G);
    }

    public final synchronized void D5H(AnonymousClass4MN r5) {
        if (((AnonymousClass4MM) r5).A09.A0I.A0X) {
            this.A0Y = true;
        } else {
            A09(this.A0H, this.A0L, A04(this), "finished");
            this.A0u.EH1(this.A0L);
            C255773uh r1 = this.A0L;
            if (r1 != null) {
                this.A13.DaM(r1);
            }
        }
    }

    public final void DAP(AnonymousClass4MN r10, String str, String str2, int i, int i2, int i3) {
        String str3 = str2;
        String str4 = str;
        if (r10.equals(this.A0M)) {
            AnonymousClass4ME r2 = this.A0u;
            C255773uh r4 = this.A0L;
            if (str == null) {
                str4 = "";
            }
            if (str2 == null) {
                str3 = "";
            }
            r2.EFo(A03(getCurrentPositionMs(), A00(), i, i2), r4, str4, str3, i3, i);
        }
    }

    public final void DB0(AnonymousClass4MN r1) {
    }

    public final synchronized void DCm(AnonymousClass4MN r12, String str, String str2, String str3) {
        ReelViewerFragment reelViewerFragment;
        String str4;
        AnonymousClass4MN r1;
        UserSession userSession = this.A0t;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36310959190704520L) && this.A09 < this.A0A) {
            if (182.A06(r2, userSession, 36310959190573446L) && this.A0L != null) {
                this.A0c = true;
                this.A09++;
                int currentPositionMs = getCurrentPositionMs();
                AnonymousClass4MN r0 = this.A0M;
                if (r0 != null) {
                    r0.reset();
                }
                AnonymousClass3OB r13 = AnonymousClass3OB.IDLE;
                AnonymousClass5MR r02 = this.A12;
                if (r02 != null) {
                    r02.A00 = r13;
                }
                C255773uh r03 = this.A0L;
                if (r03 != null) {
                    E47(r03, true);
                }
                A0B(this, currentPositionMs);
            } else if (182.A06(r2, userSession, 36310959190638983L) && (r1 = this.A0M) != null) {
                this.A09++;
                r1.EJE();
            }
        }
        if (this.A0M == r12 && (reelViewerFragment = this.A13) != null) {
            int currentPositionMs2 = getCurrentPositionMs();
            if (currentPositionMs2 > 0) {
                A09(this.A0H, this.A0L, A02(currentPositionMs2), "error");
            }
            if (this.A0L != null) {
                AnonymousClass6VC A002 = AnonymousClass6VB.A00(userSession);
                C255773uh r14 = this.A0L;
                0qQ.A0B(r14, 0);
                A002.A08(r14);
            }
            AnonymousClass4ME r4 = this.A0u;
            r4.EGv(A04(this), this.A0L, str, str2, str3);
            r4.EH1(this.A0L);
            C255773uh r22 = this.A0L;
            if (r22 != null && r22.A1m()) {
                C309966aD r04 = reelViewerFragment.A10;
                r04.getClass();
                r04.DxN();
                if (r22.A0M(reelViewerFragment.getSession()) != null) {
                    str4 = r22.A0M(reelViewerFragment.getSession()).A0L;
                } else {
                    str4 = null;
                }
                String str5 = r22.A0k;
                String moduleName = reelViewerFragment.getModuleName();
                UserSession session = reelViewerFragment.getSession();
                0qQ.A0B(str5, 1);
                0qQ.A0B(moduleName, 2);
                0qQ.A0B(session, 4);
                0qV A042 = C61970qY.A04();
                0wc A012 = AnonymousClass0kN.A01(LS4.A00, session);
                0Aj A003 = A012.A00(A012.A00, "reel_loading_error");
                A003.AAJ("error_type", "reel_video_playback_error");
                A003.AAJ("network_connection_cellular_type", 0qT.A00(A042.A00));
                A003.AAJ("network_connection_state", C61970qY.A06());
                A003.AAJ("network_connection_type", 0qU.A00(A042.A01));
                A003.AAJ("reel_module_source", moduleName);
                A003.AAJ("reel_id", str5);
                A003.AAJ("reel_video_uri", str4);
                A003.A9F(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, 00y.A0n(10, session.A06));
                A003.Cgf();
                AnonymousClass6VB.A00(reelViewerFragment.getSession()).A0A(r22, AnonymousClass05K.A0N);
            }
        }
    }

    public final void DTt(byte[] bArr, long j) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (A0G() == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void DZ2(X.AnonymousClass4MN r9, long r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            X.4MN r0 = r8.A0M     // Catch:{ all -> 0x005f }
            if (r0 != r9) goto L_0x005d
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.FNM()     // Catch:{ all -> 0x005f }
            r8.A0h = r0     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0016
            boolean r1 = r8.A0G()     // Catch:{ all -> 0x005f }
            r0 = 1
            if (r1 != 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r8.A1G = r0     // Catch:{ all -> 0x005f }
            X.4NW r1 = r8.A0y     // Catch:{ all -> 0x005f }
            boolean r0 = r8.A1G     // Catch:{ all -> 0x005f }
            r1.A04(r0)     // Catch:{ all -> 0x005f }
        L_0x0020:
            X.1yG r0 = X.1yG.A00()     // Catch:{ all -> 0x005f }
            boolean r0 = r0.A02     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x005a
            X.3uh r1 = r8.A0L     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x005a
            com.instagram.common.session.UserSession r0 = r8.A0t     // Catch:{ all -> 0x005f }
            X.3WR r2 = r1.A0M(r0)     // Catch:{ all -> 0x005f }
            if (r2 == 0) goto L_0x005a
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x005f }
            long r0 = r8.A0F     // Catch:{ all -> 0x005f }
            long r6 = r6 - r0
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x005a
            X.1yG r0 = X.1yG.A00()     // Catch:{ all -> 0x005f }
            int r0 = r0.A01(r2)     // Catch:{ all -> 0x005f }
            long r2 = (long) r0     // Catch:{ all -> 0x005f }
            long r2 = r2 - r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x005a
            android.os.Handler r1 = r8.A0s     // Catch:{ all -> 0x005f }
            X.M5P r0 = new X.M5P     // Catch:{ all -> 0x005f }
            r0.<init>(r8)     // Catch:{ all -> 0x005f }
            r1.postDelayed(r0, r2)     // Catch:{ all -> 0x005f }
            goto L_0x005d
        L_0x005a:
            A0A(r8)     // Catch:{ all -> 0x005f }
        L_0x005d:
            monitor-exit(r8)
            return
        L_0x005f:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313416gP.DZ2(X.4MN, long):void");
    }

    public final synchronized void DZ4(AnonymousClass4MN r5) {
        if (this.A0M == r5) {
            this.A0u.EH3(A04(this), this.A0L, getCurrentPositionMs());
        }
    }

    public final synchronized void DiU(AnonymousClass4MN r3, long j) {
        this.A01 = ((float) j) / ((float) this.A03);
    }

    public final void Dxh(long j, String str) {
    }

    public final synchronized void Dyi() {
        AnonymousClass4MJ r2 = this.A10.A01;
        if (!(this.A0L == null || CE4() == null)) {
            this.A11.A02(r2, false);
        }
    }

    public final synchronized void E21(String str) {
        if (!this.A0X) {
            this.A0g = false;
            Handler handler = this.A0s;
            handler.removeCallbacksAndMessages((Object) null);
            this.A0e = false;
            C316036l0 r1 = this.A0O;
            if (r1 != null) {
                r1.EqF(8);
            }
            AnonymousClass4MN r0 = this.A0M;
            if (r0 != null && (((AnonymousClass4MM) r0).A09.A0I.A0J() || this.A0V)) {
                this.A0X = true;
                AnonymousClass3OB r12 = AnonymousClass3OB.PAUSED;
                AnonymousClass5MR r02 = this.A12;
                if (r02 != null) {
                    r02.A00 = r12;
                }
                this.A0i = System.currentTimeMillis();
                int currentPositionMs = getCurrentPositionMs();
                int A002 = A00();
                if (((AnonymousClass4MM) this.A0M).A09.A0I.A0J()) {
                    this.A0M.pause();
                }
                AnonymousClass4ME r3 = this.A0u;
                r3.EH0(this.A0L, this.A0M.BdE());
                A09(this.A0H, this.A0L, A03(currentPositionMs, A002, this.A0C, this.A04), str);
                r3.EH1(this.A0L);
                Runnable runnable = this.A1D;
                if (runnable != null && this.A0S) {
                    handler.removeCallbacks(runnable);
                }
            }
            this.A1B.A03(this);
            this.A0b = false;
        }
    }

    public final synchronized void FIQ(String str) {
        boolean z;
        ViewGroup viewGroup;
        this.A0T = false;
        C316036l0 r1 = this.A0O;
        if (r1 != null) {
            r1.EqF(8);
            this.A0O.Cyz(false);
            if (this.A0O.C5p() != null) {
                this.A0O.C5p().A00.A00.remove(this);
                ScalingTextureView C5p = this.A0O.C5p();
                C5p.A02 = 0;
                C5p.A01 = 0;
                ScalingTextureView.A00(C5p);
            }
        }
        AnonymousClass4MN r12 = this.A0M;
        if (r12 != null) {
            r12.AOz(this.A0G);
            this.A0u.EH0(this.A0L, this.A0M.BdE());
        }
        C14721U4j u4j = this.A0N;
        if (!(u4j == null || (viewGroup = (ViewGroup) u4j.getParent()) == null)) {
            viewGroup.removeView(this.A0N);
        }
        AnonymousClass4MN r2 = this.A0M;
        if (r2 != null) {
            if (!this.A0a) {
                AnonymousClass4MM r22 = (AnonymousClass4MM) r2;
                r22.A09.A0D(new AnonymousClass65I(r22, new C305826Js()));
            }
            z = true;
        } else {
            z = false;
        }
        E21(str);
        this.A0P = AnonymousClass05K.A00;
        if (this.A0M != null) {
            this.A0E = 0;
        }
        AnonymousClass3OB r13 = AnonymousClass3OB.STOPPING;
        AnonymousClass5MR r0 = this.A12;
        if (r0 != null) {
            r0.A00 = r13;
        }
        A0E(this, z);
        if (this.A0L != null) {
            UserSession userSession = this.A0t;
            if (182.A06(0Tu.A05, userSession, 36320790370591584L)) {
                C241923Rx.A00(userSession).A00(this.A0L.A0j);
            } else {
                Ky0.A00(userSession).A00(this.A0L.A0j);
            }
        }
        Runnable runnable = this.A1D;
        if (runnable != null) {
            this.A0s.removeCallbacks(runnable);
        }
        if (this.A0f) {
            AnonymousClass4MI r5 = this.A10;
            r5.A07.remove(this);
            AnonymousClass4MI.A0D.removeCallbacks(r5.A06);
            r5.A01 = new AnonymousClass4MJ(-2);
        }
        1w8.A00().A0A.remove(this);
        this.A01 = 0.0f;
        this.A03 = -1;
        this.A07 = 0;
        this.A06 = -1;
        this.A0O = null;
        this.A0L = null;
        this.A02 = -1;
        this.A0U = false;
        this.A05 = 0;
        this.A0n = false;
        this.A1H = false;
        this.A0i = 0;
        this.A09 = 0;
        this.A0h = false;
        this.A1G = false;
        this.A0d = false;
        this.A0b = false;
        this.A08 = 0;
    }

    public final void onAudioFocusChange(int i) {
        float f;
        if (i == -2) {
            A08(0.0f, -8);
            return;
        }
        if (i == -3) {
            f = 0.5f;
        } else if (i == 1 || i == 2 || i == 4 || i == 3) {
            f = 1.0f;
        } else if (i == -1) {
            A08(0.0f, -8);
            this.A1B.A03(this);
            return;
        } else {
            return;
        }
        A08(f, -8);
    }

    private int A00() {
        AnonymousClass4MN r0;
        C255773uh r02 = this.A0L;
        if (r02 == null || !r02.A17() || (r0 = this.A0M) == null) {
            return -1;
        }
        return r0.getCurrentPosition();
    }

    public static int A01(C313416gP r4, boolean z) {
        AnonymousClass4MN r2;
        C250963mL r1;
        C255773uh r12 = r4.A0L;
        if (!(r12 == null || (r2 = r4.A0M) == null)) {
            if (!r12.A17() && (r1 = r12.A0e) != C250963mL.BROADCAST_ARCHIVE) {
                0wb.A03("ReelVideoPlayer#getBroadcastPositionMs", 002.A0g("mCurrentItem type: ", r1.name(), " is not live-related"));
            } else if (z) {
                return (int) ((AnonymousClass4MM) r2).A09.A0I.A06();
            } else {
                return r2.getCurrentPosition();
            }
        }
        return -1;
    }

    private C263834Nn A03(int i, int i2, int i3, int i4) {
        Integer num;
        int i5;
        int i6;
        String BdG;
        String str = null;
        if (this.A0f) {
            num = Integer.valueOf(this.A10.A01.A00);
        } else {
            num = null;
        }
        int i7 = this.A02;
        int i8 = this.A07;
        int i9 = this.A06;
        int i10 = this.A03;
        AnonymousClass4MN r0 = this.A0M;
        if (r0 == null) {
            i5 = 0;
        } else {
            i5 = (int) (((AnonymousClass4MM) r0).A0n / 1000);
        }
        AnonymousClass4MN r1 = this.A0M;
        if (r1 == null) {
            i6 = 0;
        } else {
            AnonymousClass4Yf r12 = ((AnonymousClass4MM) r1).A0E;
            if (r12 != null) {
                i6 = r12.A02;
            } else {
                i6 = 0;
            }
        }
        boolean z = this.A0Z;
        boolean z2 = this.A1G;
        int i11 = this.A08;
        int i12 = this.A09;
        AnonymousClass4MN r3 = this.A0M;
        if (r3 == null) {
            BdG = "";
        } else {
            BdG = r3.BdG();
        }
        AnonymousClass4MN r32 = this.A0M;
        if (r32 != null) {
            AnonymousClass4OI r2 = ((AnonymousClass4MM) r32).A09.A08;
            if (r2 != null) {
                str = r2.A07;
            } else {
                str = null;
            }
        }
        return new C263834Nn(false, (Float) null, (Float) null, num, BdG, str, A05(this), (String) null, (String) null, (String) null, this.A00, i7, i, i8, i2, i9, i10, i3, i4, i5, i6, i11, i12, z, z2, this.A0b, true);
    }

    public static String A05(C313416gP r3) {
        String str;
        C255773uh r2 = r3.A0L;
        if (r2 != null) {
            if (r2.A17()) {
                str = "live_";
            } else if (r2.A0f != null) {
                str = "stories_ad4ad";
            }
            return 002.A0R(str, r3.A1C.A00);
        }
        str = "reel_";
        return 002.A0R(str, r3.A1C.A00);
    }

    private void A07() {
        C255773uh r1 = this.A0L;
        if (r1 != null && !this.A0e && !this.A0X) {
            this.A0e = true;
            String str = r1.A0j;
            if (!2PP.A00(this.A0R, str) && !this.A0g) {
                this.A0g = true;
                this.A0s.postDelayed(new C66964Mfx(this, str), 3000);
            }
            Handler handler = this.A0s;
            handler.sendMessageDelayed(Message.obtain(handler, 1, this.A0L.A0j), this.A0p);
        }
    }

    private void A08(float f, int i) {
        if (this.A0M != null) {
            C263834Nn A022 = A02(getCurrentPositionMs());
            this.A0y.A02(f, i);
            this.A0u.EGs(A022, this.A0L, i, false);
            this.A00 = f;
            this.A0M.Eqq(f);
        }
    }

    private void A09(AnonymousClass4OK r8, C255773uh r9, C263834Nn r10, String str) {
        C255773uh r2 = r9;
        if (r9 != null) {
            String str2 = null;
            if (r8 != null) {
                ArrayList arrayList = new ArrayList();
                r8.A00.drainTo(arrayList);
                str2 = AnonymousClass4OK.A00(arrayList);
            }
            this.A0u.EH2(r10, r2, "autoplay", str, str2, (String) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r5.A0j == r1) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(X.C313416gP r5) {
        /*
            X.3OB r1 = X.AnonymousClass3OB.PREPARED
            X.5MR r0 = r5.A12
            if (r0 == 0) goto L_0x0008
            r0.A00 = r1
        L_0x0008:
            X.3uh r0 = r5.A0L
            r4 = 0
            if (r0 == 0) goto L_0x0038
            com.instagram.common.session.UserSession r3 = r5.A0t
            X.6VC r1 = X.AnonymousClass6VB.A00(r3)
            X.3uh r0 = r5.A0L
            X.0qQ.A0B(r0, r4)
            r1.A0D(r0, r4)
            X.3wz r0 = r5.A0J
            X.3wz r1 = X.C257183wz.CACHED
            if (r0 == r1) goto L_0x0026
            X.3wz r0 = r5.A0j
            r2 = 0
            if (r0 != r1) goto L_0x0027
        L_0x0026:
            r2 = 1
        L_0x0027:
            X.3uh r1 = r5.A0L
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A0G = r0
            X.6VC r1 = X.AnonymousClass6VB.A00(r3)
            X.3uh r0 = r5.A0L
            r1.A0B(r0, r2)
        L_0x0038:
            r5.A0V = r4
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r5.A0F
            long r2 = r2 - r0
            X.JVc r1 = new X.JVc
            r1.<init>(r5, r2)
            r5.A0k = r1
            boolean r0 = r5.A0X
            if (r0 != 0) goto L_0x0052
            r1.run()
            r0 = 0
            r5.A0k = r0
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313416gP.A0A(X.6gP):void");
    }

    public static void A0B(C313416gP r5, int i) {
        int i2;
        if (r5.A0M != null) {
            boolean z = !r5.A0X;
            boolean z2 = r5.A0l;
            if (z2 && z) {
                r5.E21("seek");
            }
            i2 = r5.A0M.getCurrentPosition();
            r5.A0M.seekTo(i);
            if (z2 && z) {
                r5.EIy("resume", true);
            }
        } else {
            i2 = 0;
        }
        r5.A01 = ((float) i) / ((float) r5.A03);
        C263834Nn A022 = r5.A02(i2);
        r5.A0u.EH5(A022, r5.A0L, i);
        if (!r5.A0X && !r5.A0l) {
            r5.A09(r5.A0H, r5.A0L, A022, "seek");
        }
        if (!r5.A1F || r5.A1E) {
            r5.A07 = i;
        }
    }

    public static void A0C(C313416gP r2, int i, int i2, int i3) {
        C255773uh r1 = r2.A0L;
        if (r1 != null) {
            r2.A13.A0R(r1, i, i2);
        }
        boolean z = false;
        if (i > 0) {
            z = true;
        }
        1GE.A00(r2.A0t).A00(z);
        if (r2.A0M != null && r2.A0Z != r2.A0G()) {
            r2.A0F(r2.A0G(), i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r14.A05 <= 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0D(X.C313416gP r14, java.lang.String r15, boolean r16, boolean r17) {
        /*
            X.6l0 r0 = r14.A0O
            r2 = 0
            if (r0 == 0) goto L_0x000b
            com.instagram.ui.widget.textureview.ScalingTextureView r0 = r0.C5p()
            if (r0 == 0) goto L_0x0018
        L_0x000b:
            java.lang.Runnable r0 = r14.A1D
            if (r0 == 0) goto L_0x0018
            boolean r0 = r14.A0S
            if (r0 == 0) goto L_0x0018
            java.util.concurrent.atomic.AtomicBoolean r0 = r14.A14
            r0.set(r2)
        L_0x0018:
            java.lang.String r5 = "resume"
            boolean r0 = r5.equals(r15)
            if (r0 != 0) goto L_0x0022
            java.lang.String r5 = "autoplay"
        L_0x0022:
            r6 = 1
            if (r16 != 0) goto L_0x002a
            int r0 = r14.A05
            r3 = 1
            if (r0 > 0) goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            X.4MN r0 = r14.A0M
            if (r0 == 0) goto L_0x0065
            X.4MM r0 = (X.AnonymousClass4MM) r0
            X.4Ms r0 = r0.A09
            X.4Mt r0 = r0.A0I
            long r0 = r0.A09()
            int r3 = (int) r0
            r14.A03 = r3
            boolean r1 = r14.A0G()
            r0 = -5
            r14.A0F(r1, r0)
            if (r16 != 0) goto L_0x022e
            int r1 = r14.A05
            if (r1 <= 0) goto L_0x022e
            int r0 = r14.A03
            if (r1 >= r0) goto L_0x022e
            r3 = 1
            X.4MN r0 = r14.A0M
            r0.seekTo(r1)
        L_0x0054:
            boolean r0 = r14.A17
            if (r0 == 0) goto L_0x005a
            if (r16 == 0) goto L_0x0065
        L_0x005a:
            boolean r0 = r14.A16
            if (r0 == 0) goto L_0x0060
            r14.A0Q = r5
        L_0x0060:
            X.4MN r0 = r14.A0M
            r0.start()
        L_0x0065:
            X.3uh r0 = r14.A0L
            if (r0 == 0) goto L_0x020f
            boolean r0 = r0.A17()
            if (r0 == 0) goto L_0x020f
            r14.A0o = r6
        L_0x0071:
            int r0 = r14.A05
            if (r0 != 0) goto L_0x0077
            r14.A0m = r2
        L_0x0077:
            r0 = 0
            r14.A01 = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r14.A0D = r0
            r14.A0Y = r2
            r14.A0d = r6
            android.os.Handler r0 = r14.A0s
            r0.sendEmptyMessage(r2)
            X.3OB r1 = X.AnonymousClass3OB.PLAYING
            X.5MR r0 = r14.A12
            if (r0 == 0) goto L_0x0091
            r0.A00 = r1
        L_0x0091:
            r14.A07()
            X.3uh r8 = r14.A0L
            if (r8 == 0) goto L_0x01cf
            X.6l0 r1 = r14.A0O
            if (r1 == 0) goto L_0x01cf
            instagram.features.stories.fragment.ReelViewerFragment r7 = r14.A13
            boolean r13 = r14.A0G()
            boolean r0 = r8.A1m()
            if (r0 == 0) goto L_0x00b0
            X.6aD r0 = r7.A10
            r0.getClass()
            r0.DyN(r8, r1)
        L_0x00b0:
            if (r16 != 0) goto L_0x014e
            com.instagram.common.session.UserSession r0 = r7.getSession()
            X.6K7 r12 = X.AnonymousClass6K6.A00(r0)
            com.instagram.common.session.UserSession r0 = r7.getSession()
            java.lang.Integer r2 = X.C305976Kh.A00(r0, r8)
            com.instagram.common.session.UserSession r4 = r12.A01
            X.0Tu r3 = X.0Tu.A05
            r0 = 36321941421827941(0x810a9d00002765, double:3.033480239658159E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0101
            java.util.Map r10 = r12.A02
            java.lang.String r11 = r8.A0k
            java.lang.String r9 = r8.A0j
            java.lang.String r0 = X.002.A0R(r11, r9)
            java.lang.Object r0 = r10.get(r0)
            X.6K8 r0 = (X.AnonymousClass6K8) r0
            if (r0 == 0) goto L_0x0101
            long r3 = r0.A00
            java.lang.String r1 = r0.A01
            boolean r0 = r0.A02
            X.AnonymousClass6K7.A00(r12, r2, r3)
            if (r0 != r13) goto L_0x01e6
            X.1QP r1 = r12.A00
            X.AE4 r0 = new X.AE4
            r0.<init>(r1)
            r0.A01 = r3
            r0.A02()
        L_0x00fa:
            java.lang.String r0 = X.002.A0R(r11, r9)
            r10.remove(r0)
        L_0x0101:
            X.4gh r0 = r7.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r3 = r0.Bz3(r8)
            boolean r0 = r3.A0l
            r3.A07(r0)
            X.34n r1 = r7.A0q
            X.3mM r0 = r7.A0a
            r0.getClass()
            com.instagram.model.reels.Reel r0 = r0.A0H
            r1.A01(r0)
            com.instagram.common.session.UserSession r0 = r7.getSession()
            X.6VC r2 = X.AnonymousClass6VB.A00(r0)
            java.lang.String r1 = r8.A0k
            X.0qQ.A07(r1)
            java.lang.String r0 = X.AnonymousClass6VC.A02(r8)
            java.lang.Long r0 = X.AnonymousClass6VC.A01(r2, r1, r0)
            if (r0 == 0) goto L_0x013c
            long r0 = r0.longValue()
            X.1QP r2 = r2.A00
            r2.flowEndSuccess(r0)
        L_0x013c:
            r3.A0m = r6
            X.3mM r0 = r7.A0a
            if (r0 == 0) goto L_0x014b
            boolean r0 = r0.A0D
            if (r0 == 0) goto L_0x014b
            java.lang.String r0 = "suggestion_unit_overlay_shown"
            instagram.features.stories.fragment.ReelViewerFragment.A0G(r7, r0)
        L_0x014b:
            instagram.features.stories.fragment.ReelViewerFragment.A09(r8, r7)
        L_0x014e:
            X.4gh r0 = r7.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r0 = r0.Bz3(r8)
            int r2 = r0.A0H
            X.6gQ r0 = r7.mVideoPlayer
            X.6gP r0 = (X.C313416gP) r0
            int r1 = r0.A03
            if (r2 == 0) goto L_0x0165
            int r0 = r2 + 1
            int r1 = r1 * r0
        L_0x0165:
            X.4gh r0 = r7.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r2 = r0.Bz3(r8)
            float r1 = (float) r1
            int r0 = (r1 > r1 ? 1 : (r1 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01e3
            r0 = 2139095040(0x7f800000, float:Infinity)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01e3
            r0 = -8388608(0xffffffffff800000, float:-Infinity)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01e3
        L_0x0180:
            r2.A0A = r1
            X.4gh r0 = r7.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r4 = r0.Bz3(r8)
            X.6gQ r0 = r7.mVideoPlayer
            X.6gP r0 = (X.C313416gP) r0
            long r0 = r0.A0E
            double r2 = (double) r0
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            r4.A03 = r2
            X.6SV r2 = r7.mReelLoadingVisualization
            if (r2 == 0) goto L_0x01a6
            java.lang.String r1 = r8.A0k
            java.lang.String r0 = r8.A0j
            r2.DQr(r1, r0)
        L_0x01a6:
            X.VPs r0 = r7.A1O
            if (r0 == 0) goto L_0x01ba
            X.Vjp r2 = r0.A00
            android.os.Handler r1 = r2.A03
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
            X.Wkv r0 = new X.Wkv
            r0.<init>(r2)
            r1.post(r0)
        L_0x01ba:
            boolean r0 = X.2Y9.A00
            if (r0 == 0) goto L_0x01cf
            X.6kz r2 = r7.Aui()
            if (r2 == 0) goto L_0x01cf
            X.3mM r1 = r7.A0a
            if (r1 == 0) goto L_0x01cf
            android.content.Context r0 = r7.requireContext()
            X.C316216lI.A05(r0, r1, r2)
        L_0x01cf:
            X.3ov r0 = r14.A0v
            if (r0 == 0) goto L_0x01dc
            X.4NT r1 = r14.A0z
            java.lang.String r0 = r0.A04(r5)
            r1.A02(r0)
        L_0x01dc:
            boolean r0 = r14.A16
            if (r0 != 0) goto L_0x01e2
            r14.A0Q = r5
        L_0x01e2:
            return
        L_0x01e3:
            float r1 = r2.A0A
            goto L_0x0180
        L_0x01e6:
            java.lang.String r0 = "STORY_SOUND_ON"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01fe
            if (r2 == 0) goto L_0x01fe
            X.1QP r1 = r12.A00
            X.AE4 r0 = new X.AE4
            r0.<init>(r1)
            r0.A01 = r3
            r0.A02()
            goto L_0x0101
        L_0x01fe:
            X.1QP r0 = r12.A00
            X.AE4 r2 = new X.AE4
            r2.<init>(r0)
            r2.A01 = r3
            r1 = 0
            java.lang.String r0 = "audio state did not match"
            r2.A06(r0, r1)
            goto L_0x00fa
        L_0x020f:
            if (r3 == 0) goto L_0x021f
            boolean r0 = r14.A1F
            if (r0 == 0) goto L_0x0219
            boolean r0 = r14.A1E
            if (r0 == 0) goto L_0x0071
        L_0x0219:
            int r0 = r14.A05
        L_0x021b:
            r14.A07 = r0
            goto L_0x0071
        L_0x021f:
            if (r17 != 0) goto L_0x0071
            boolean r0 = r14.A1F
            if (r0 == 0) goto L_0x0229
            boolean r0 = r14.A1E
            if (r0 == 0) goto L_0x0071
        L_0x0229:
            int r0 = r14.getCurrentPositionMs()
            goto L_0x021b
        L_0x022e:
            r3 = 0
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313416gP.A0D(X.6gP, java.lang.String, boolean, boolean):void");
    }

    public static void A0E(C313416gP r2, boolean z) {
        r2.A0s.removeCallbacksAndMessages((Object) null);
        AnonymousClass4MN r0 = r2.A0M;
        if (r0 != null) {
            r0.ECQ(z);
            ((AnonymousClass4MM) r0).A0M = null;
            r2.A0M = null;
        }
        if (r2.A0k != null) {
            r2.A0V = false;
            r2.A0k = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        if (r13 != r6.A2W) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0F(boolean r13, int r14) {
        /*
            r12 = this;
            r12.A0Z = r13
            if (r13 == 0) goto L_0x008c
            r0 = 1065353216(0x3f800000, float:1.0)
            r12.A08(r0, r14)
            X.1vq r0 = r12.A1B
            r0.A04(r12)
        L_0x000e:
            int r7 = r12.getCurrentPositionMs()
            X.3uh r1 = r12.A0L
            if (r1 == 0) goto L_0x006e
            instagram.features.stories.fragment.ReelViewerFragment r6 = r12.A13
            X.4gh r0 = r6.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r5 = r0.Bz3(r1)
            r5.A0v = r13
            com.instagram.common.session.UserSession r0 = r6.getSession()
            X.6K7 r11 = X.AnonymousClass6K6.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.getSession()
            java.lang.Integer r10 = X.C305976Kh.A00(r0, r1)
            com.instagram.common.session.UserSession r3 = r11.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321941421827941(0x810a9d00002765, double:3.033480239658159E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x006a
            java.util.Map r9 = r11.A02
            java.lang.String r8 = "TOGGLE_STORY_SOUND_FROM_VOLUME_BUTTON"
            java.lang.Object r0 = r9.get(r8)
            X.6K8 r0 = (X.AnonymousClass6K8) r0
            if (r0 == 0) goto L_0x006a
            long r3 = r0.A00
            X.AnonymousClass6K7.A00(r11, r10, r3)
            if (r13 != 0) goto L_0x007f
            if (r10 != 0) goto L_0x007f
            X.1QP r0 = r11.A00
            X.AE4 r2 = new X.AE4
            r2.<init>(r0)
            r2.A01 = r3
            r1 = 0
            java.lang.String r0 = "audio state did not match"
            r2.A06(r0, r1)
        L_0x0067:
            r9.remove(r8)
        L_0x006a:
            if (r7 != 0) goto L_0x0072
            r6.A2W = r13
        L_0x006e:
            r12.A02(r7)
            return
        L_0x0072:
            boolean r0 = r5.A19
            if (r0 != 0) goto L_0x007b
            boolean r1 = r6.A2W
            r0 = 0
            if (r13 == r1) goto L_0x007c
        L_0x007b:
            r0 = 1
        L_0x007c:
            r5.A19 = r0
            goto L_0x006e
        L_0x007f:
            X.1QP r1 = r11.A00
            X.AE4 r0 = new X.AE4
            r0.<init>(r1)
            r0.A01 = r3
            r0.A02()
            goto L_0x0067
        L_0x008c:
            r0 = 0
            r12.A08(r0, r14)
            X.1vq r0 = r12.A1B
            r0.A03(r12)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313416gP.A0F(boolean, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0 == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0G() {
        /*
            r3 = this;
            X.3uh r1 = r3.A0L
            r2 = 1
            if (r1 == 0) goto L_0x000e
            com.instagram.common.session.UserSession r0 = r3.A0t
            boolean r0 = X.C305976Kh.A01(r0, r1)
            r1 = 1
            if (r0 != 0) goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            boolean r0 = r3.Ccy()
            if (r0 == 0) goto L_0x0018
            if (r1 != 0) goto L_0x0018
            return r2
        L_0x0018:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313416gP.A0G():boolean");
    }

    public final /* bridge */ /* synthetic */ Object BdF() {
        C255773uh r0 = this.A0L;
        if (r0 == null) {
            return null;
        }
        return r0.A0b;
    }

    public final String CE4() {
        C255773uh r0 = this.A0L;
        if (r0 == null) {
            return null;
        }
        UserSession userSession = this.A0t;
        if (r0.A0M(userSession) != null) {
            return this.A0L.A0M(userSession).A0G;
        }
        return null;
    }

    public final String CEM() {
        return this.A1C.A00;
    }

    public final boolean CPe(C255773uh r3, C316036l0 r4) {
        if (!this.A0T || r4 != this.A0O || r3 == null || !r3.equals(this.A0L)) {
            return false;
        }
        return true;
    }

    public final boolean CcN() {
        C255773uh r0 = this.A0L;
        if (r0 == null || !r0.CcK()) {
            return false;
        }
        return true;
    }

    public final boolean Ccy() {
        if (this.A0r != null) {
            UserSession userSession = this.A0t;
            boolean z = this.A15.get();
            0qQ.A0B(userSession, 0);
            if (!C255613uQ.A00(userSession, (Integer) null, z, false)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void Csy(C291485hN r2) {
        this.A0u.EFa(r2);
    }

    public final void CzD(AnonymousClass4MN r5, int i) {
        if (r5.equals(this.A0M)) {
            this.A0U = false;
            C255773uh r0 = this.A0L;
            if (r0 != null && r0.A17()) {
                A07();
            }
            this.A0u.EGt(A04(this), this.A0L, i);
        }
        this.A0b = false;
    }

    public final void CzE(AnonymousClass4MN r5) {
        if (r5.equals(this.A0M)) {
            this.A0U = true;
            C255773uh r0 = this.A0L;
            if (r0 != null && r0.A17()) {
                this.A0g = false;
                this.A0s.removeCallbacksAndMessages((Object) null);
                this.A0e = false;
            }
            AnonymousClass4ME r3 = this.A0u;
            C255773uh r2 = this.A0L;
            C263834Nn A042 = A04(this);
            AnonymousClass4MN r02 = this.A0M;
            r02.getClass();
            r3.EGu(A042, r2, r02.BDg());
        }
    }

    public final synchronized void D7P(AnonymousClass4MN r18, List list) {
        C316036l0 r0;
        C256003v4 BQw;
        boolean z;
        1Xj r1;
        synchronized (this) {
            if (!(!r18.equals(this.A0M) || (r0 = this.A0O) == null || (BQw = r0.BQw()) == null)) {
                C255773uh r02 = this.A0L;
                String str = null;
                List list2 = list;
                if (!(r02 == null || (r1 = r02.A0b) == null)) {
                    UserSession userSession = this.A0t;
                    Boolean valueOf = Boolean.valueOf(this.A0Z);
                    boolean CcK = r1.CcK();
                    boolean CeS = r1.CeS();
                    boolean A51 = r1.A51();
                    boolean A4L = r1.A4L();
                    List C9Z = r1.A0C.C9Z();
                    AnonymousClass3WR CEL = r1.CEL();
                    if (r1.A0C.CCd() != null) {
                        str = r1.A0C.CCd().getId();
                    }
                    boolean A092 = AnonymousClass3WP.A09(userSession, CEL, valueOf, str, r1.A0C.CER(), C9Z, false, CcK, CeS, A51, A4L);
                    z = true;
                    if (A092) {
                        if (AnonymousClass3WP.A0B(r1) && !list2.isEmpty() && !this.A0m) {
                            String A0g2 = 002.A0g("[", this.A0q.getString(2131954771), "]");
                            this.A0m = true;
                            list2.add(0, A0g2);
                            AnonymousClass4DU r6 = this.A0K;
                            if (r6 != null) {
                                this.A1A.post(new M9I(r1, r6, this));
                            }
                        }
                        C263164Jj.A02(BQw, list2, z);
                    }
                }
                z = false;
                C263164Jj.A02(BQw, list2, z);
            }
        }
    }

    public final void DPP(AnonymousClass4MN r5) {
        AnonymousClass4MN r0;
        int i = this.A08 + 1;
        this.A08 = i;
        C255773uh r2 = this.A0L;
        if (r2 != null) {
            this.A0b = true;
            ReelViewerFragment reelViewerFragment = this.A13;
            if (reelViewerFragment.mShortVideoDTDController != null) {
                C309426Yf Bz3 = ((C310566bG) reelViewerFragment.A1E).A0B.Bz3(r2);
                Bz3.A0E = i;
                C314896j1 r1 = reelViewerFragment.mShortVideoDTDController;
                if (i == Bz3.A0H && (r0 = ((C313416gP) r1.A01).A0M) != null) {
                    r0.Ech(false);
                }
            }
            this.A0u.EGy(A04(this), this.A0L, "autoplay");
        }
    }

    public final void DPw(2Yz r2) {
        this.A0u.EGA(r2);
    }

    public final void DxR(C257183wz r4, AnonymousClass4MN r5) {
        if (this.A0L != null) {
            boolean z = false;
            if (r4 == C257183wz.CACHED) {
                z = true;
            }
            this.A1H = z;
            this.A0u.EGx(this.A0L, z);
        }
    }

    public final void DxS(C257183wz r3, AnonymousClass4MN r4, long j) {
        if (this.A0L != null && this.A0J == C257183wz.NOT_APPLY) {
            this.A0J = r3;
            this.A0w.A02(r3);
            this.A0u.EFv(r3, this.A0L);
        }
    }

    public final void DxX(C257183wz r3, AnonymousClass4MN r4) {
        C255773uh r1 = this.A0L;
        if (r1 != null) {
            this.A0j = r3;
            this.A0u.EG5(r3, r1);
        }
    }

    public final void DyJ(AnonymousClass4MN r2, float f, int i, int i2) {
        C316036l0 r0 = this.A0O;
        if (r0 != null) {
            if (r0.C5p() != null) {
                ScalingTextureView C5p = this.A0O.C5p();
                C5p.A02 = i;
                C5p.A01 = i2;
                ScalingTextureView.A00(C5p);
            }
            this.A0C = i;
            this.A04 = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r15.A0h != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r15.A0h != false) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DyS(long r16) {
        /*
            r15 = this;
            X.4MN r0 = r15.A0M
            if (r0 == 0) goto L_0x0025
            X.6l0 r0 = r15.A0O
            if (r0 == 0) goto L_0x000e
            com.instagram.ui.widget.textureview.ScalingTextureView r0 = r0.C5p()
            if (r0 == 0) goto L_0x0025
        L_0x000e:
            java.lang.Runnable r3 = r15.A1D
            if (r3 == 0) goto L_0x0025
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.A14
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0025
            boolean r0 = r15.A0S
            if (r0 == 0) goto L_0x0025
            android.os.Handler r2 = r15.A0s
            long r0 = r15.A19
            r2.postDelayed(r3, r0)
        L_0x0025:
            r0 = r16
            int r4 = (int) r0
            X.4Nn r3 = r15.A02(r4)
            X.4NW r2 = r15.A0y
            java.util.concurrent.atomic.AtomicReference r1 = r2.A01
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.set(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A00
            r5 = 0
            r0.set(r5)
            float r0 = r15.A00
            r2.A02(r0, r5)
            X.4ME r6 = r15.A0u
            X.3uh r0 = r15.A0L
            r1 = 1
            r6.EGs(r3, r0, r5, r1)
            boolean r0 = r15.A1F
            if (r0 == 0) goto L_0x0051
            r15.A07 = r4
        L_0x0051:
            X.4NX r3 = r15.A0w
            boolean r4 = r15.A18
            if (r4 == 0) goto L_0x00ac
            X.3wz r2 = r15.A0J
            X.3wz r0 = X.C257183wz.CACHED
            if (r2 == r0) goto L_0x0061
        L_0x005d:
            boolean r0 = r15.A0h
            if (r0 == 0) goto L_0x0062
        L_0x0061:
            r5 = 1
        L_0x0062:
            boolean r0 = r15.A0h
            r3.A03(r5, r0)
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r2 = r15.A0F
            long r10 = r10 - r2
            X.3uh r8 = r15.A0L
            r12 = 0
            if (r4 == 0) goto L_0x00a7
            X.3wz r2 = r15.A0J
            X.3wz r0 = X.C257183wz.CACHED
            if (r2 == r0) goto L_0x007d
        L_0x0079:
            boolean r0 = r15.A0h
            if (r0 == 0) goto L_0x007e
        L_0x007d:
            r12 = 1
        L_0x007e:
            boolean r13 = r15.A0h
            java.lang.String r9 = r15.A0Q
            X.4Nn r7 = A04(r15)
            boolean r14 = r15.A0W
            r6.EH7(r7, r8, r9, r10, r12, r13, r14)
            boolean r0 = r15.A0f
            if (r0 == 0) goto L_0x00a2
            X.4MI r0 = r15.A10
            X.4MJ r2 = r0.A01
            X.3uh r0 = r15.A0L
            if (r0 == 0) goto L_0x00a2
            java.lang.String r0 = r15.CE4()
            if (r0 == 0) goto L_0x00a2
            X.4NV r0 = r15.A11
            r0.A02(r2, r1)
        L_0x00a2:
            java.lang.String r0 = ""
            r15.A0Q = r0
            return
        L_0x00a7:
            boolean r0 = r15.A1H
            if (r0 != 0) goto L_0x007d
            goto L_0x0079
        L_0x00ac:
            boolean r0 = r15.A1H
            if (r0 != 0) goto L_0x0061
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313416gP.DyS(long):void");
    }

    public final void E08(AnonymousClass4MN r3, String str, String str2, String str3) {
        if (this.A0M == r3 && this.A13 != null) {
            this.A0u.EHD(this.A0L, str, str2, str3);
        }
    }

    public final synchronized void EIy(String str, boolean z) {
        if (this.A0T && this.A0X) {
            this.A0X = false;
            AnonymousClass3OB r1 = AnonymousClass3OB.PLAYING;
            AnonymousClass5MR r0 = this.A12;
            if (r0 != null) {
                r0.A00 = r1;
            }
            long j = this.A0i;
            if (j > 0) {
                this.A0E += System.currentTimeMillis() - j;
            }
            Runnable runnable = this.A0k;
            if (runnable != null) {
                runnable.run();
                this.A0k = null;
            } else if (!this.A0V) {
                this.A0u.EH4(A04(this), this.A0L, "resume");
                A0D(this, "resume", true, z);
            }
        }
    }

    public final void EKv(int i) {
        C255773uh r1;
        if (this.A03 > 0 && (r1 = this.A0L) != null && this.A0M != null) {
            17k.A0E(!r1.A17());
            A0B(this, 0mi.A03(this.A0M.getCurrentPosition() + i, 0, this.A03));
        }
    }

    public final int getCurrentPositionMs() {
        AnonymousClass4MN r1;
        C255773uh r0 = this.A0L;
        if (r0 == null || (r1 = this.A0M) == null) {
            return 0;
        }
        if (r0.A17()) {
            return (int) ((AnonymousClass4MM) r1).A09.A0I.A08();
        }
        return r1.getCurrentPosition();
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (keyEvent == null || keyEvent.getAction() != 0) {
            return false;
        }
        if (i != 25 && i != 24) {
            return false;
        }
        int i3 = -1;
        if (i == 24) {
            i3 = 1;
        }
        AudioManager audioManager = this.A0r;
        if (audioManager != null) {
            this.A1A.post(new C73274PZs(audioManager, i3));
        }
        this.A15.set(true);
        int i4 = 0;
        if (audioManager != null) {
            i2 = audioManager.getStreamVolume(3);
            i4 = audioManager.getStreamMaxVolume(3);
        } else {
            i2 = 0;
        }
        if (!this.A0Z && i2 > 0 && this.A0L != null) {
            AnonymousClass6K7 A002 = AnonymousClass6K6.A00(this.A0t);
            if (182.A06(0Tu.A05, A002.A01, 36321941421827941L)) {
                Map map = A002.A02;
                if (!map.containsKey("TOGGLE_STORY_SOUND_FROM_VOLUME_BUTTON")) {
                    map.put("TOGGLE_STORY_SOUND_FROM_VOLUME_BUTTON", new AnonymousClass6K8(A002.A00.A00(AnonymousClass05K.A1F, "TOGGLE_STORY_SOUND_FROM_VOLUME_BUTTON", "stories_viewer"), "TOGGLE_STORY_SOUND_FROM_VOLUME_BUTTON", false));
                }
            }
        }
        A0C(this, i2, i4, i);
        return true;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A0P = AnonymousClass05K.A01;
        AnonymousClass4MN r1 = this.A0M;
        if (r1 != null) {
            r1.setSurface(new Surface(surfaceTexture));
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        C316036l0 r0 = this.A0O;
        if (r0 == null) {
            return true;
        }
        ScalingTextureView C5p = r0.C5p();
        if (C5p != null) {
            C5p.A00.A00.remove(this);
        }
        if (this.A0M == null) {
            return true;
        }
        if (C5p != null) {
            surfaceTexture2 = C5p.getSurfaceTexture();
        } else {
            surfaceTexture2 = null;
        }
        AnonymousClass4MM r2 = (AnonymousClass4MM) this.A0M;
        r2.A09.A0D(new AnonymousClass65I(r2, new C59711JUu(surfaceTexture2, this)));
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.4MB] */
    /* JADX WARNING: type inference failed for: r0v16, types: [X.4NT, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v17, types: [X.4NX, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v18, types: [X.4NY, java.lang.Object] */
    public C313416gP(Context context, UserSession userSession, AnonymousClass3BQ r8, C252323ov r9, ReelViewerFragment reelViewerFragment) {
        C257183wz r0 = C257183wz.NOT_APPLY;
        this.A0j = r0;
        this.A0J = r0;
        this.A09 = 0;
        this.A0c = false;
        this.A0W = false;
        this.A0d = false;
        this.A0Q = "";
        this.A0q = context;
        this.A0t = userSession;
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.A0r = audioManager;
        this.A0I = new Object();
        this.A1B = new 1vq(audioManager, userSession);
        this.A13 = reelViewerFragment;
        this.A0u = AnonymousClass4MC.A00(context, this.A0I, userSession, r9);
        this.A0v = r9;
        this.A0K = r9.A00;
        this.A1C = r8;
        this.A0p = 20000;
        this.A0Z = A0G();
        this.A10 = new AnonymousClass4MI(context, userSession);
        this.A11 = new AnonymousClass4NV();
        this.A0z = new Object();
        this.A0w = new Object();
        this.A0x = new Object();
        this.A0y = new AnonymousClass4NW();
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 2342154531051536940L)) {
            C66801qX A002 = C66791qW.A00(userSession);
            AnonymousClass5MR r4 = new AnonymousClass5MR(A002);
            A002.A02.add(new WeakReference(r4));
            this.A12 = r4;
        } else {
            this.A12 = null;
        }
        this.A0W = 182.A06(r3, userSession, 36311212593512918L);
        this.A0S = 182.A06(r3, userSession, 36311251248218589L);
        this.A0f = 182.A06(r3, userSession, 36324806165082490L);
        this.A0l = 182.A06(r3, userSession, 36314730171861778L);
        1w8.A00().A03 = new WeakReference(this);
        this.A19 = 182.A01(r3, userSession, 36592726224994976L);
        this.A1D = new C313446gS(this);
        this.A1F = 182.A06(r3, userSession, 36314730171730705L);
        this.A17 = 182.A06(r3, userSession, 36320141830856762L);
        this.A16 = 182.A06(r3, userSession, 36328100405132227L);
        this.A1E = 182.A06(r3, userSession, 36314730171992852L);
        this.A18 = 182.A06(r3, userSession, 36318479678183568L);
        this.A1A = new Handler(C64021Cb.A00());
        if (182.A06(r3, userSession, 36315202619444310L)) {
            if (AnonymousClass4NZ.A01 == null) {
                AnonymousClass4NZ.A01 = (C263714Nb) userSession.A01(C263714Nb.class, new MMF(userSession, 38));
            }
            2ew A003 = 2ev.A00(userSession);
            A003.A03.put(this, (Object) null);
            2ew.A03(A003);
        }
    }

    private C263834Nn A02(int i) {
        return A03(i, A00(), this.A0C, this.A04);
    }

    public static C263834Nn A04(C313416gP r4) {
        return r4.A03(r4.getCurrentPositionMs(), r4.A00(), r4.A0C, r4.A04);
    }

    private void A06() {
        C316036l0 r0;
        boolean z;
        C316036l0 r2;
        ScalingTextureView C5p;
        int i;
        View view;
        if (AnonymousClass4NZ.A03()) {
            if (!182.A06(0Tu.A05, this.A0t, 36318960715045650L)) {
                AnonymousClass4NZ.A01(CEZ(), CE4(), (long) getCurrentPositionMs());
            }
        }
        if (this.A0P == AnonymousClass05K.A01 && (r2 = this.A0O) != null) {
            AnonymousClass4MN r02 = this.A0M;
            if (r02 == null || (view = ((AnonymousClass4MM) r02).A09.A04) == null || !this.A0a) {
                if (!this.A0a && (C5p = r2.C5p()) != null && C5p.A02 > 0) {
                    i = C5p.A01;
                }
            } else if (view.getWidth() > 0) {
                i = view.getHeight();
            }
            if (i > 0) {
                this.A0P = AnonymousClass05K.A0C;
                return;
            }
        }
        if (this.A0P == AnonymousClass05K.A0C && (r0 = this.A0O) != null) {
            IgProgressImageView BGP = r0.BGP();
            BGP.getClass();
            BGP.setVisibility(8);
            this.A0O.EqF(8);
            if (this.A0o) {
                this.A0o = false;
                if (!this.A1F || this.A1E) {
                    this.A07 = getCurrentPositionMs();
                }
                this.A06 = A00();
            }
            if (!this.A0n) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.A0F;
                AnonymousClass4MN r03 = this.A0M;
                if (r03 != null) {
                    AnonymousClass4MT r04 = ((AnonymousClass4MM) r03).A0g;
                    this.A0u.EH9(this.A0L, r04.A02, r04.A01, r04.A00, elapsedRealtime);
                }
                this.A0n = true;
            }
            if (this.A0H != null) {
                boolean A0G2 = A0G();
                long currentPositionMs = (long) getCurrentPositionMs();
                long currentTimeMillis = System.currentTimeMillis();
                AnonymousClass4OK r05 = this.A0H;
                C21068XDg xDg = new C21068XDg(currentPositionMs, currentPositionMs, currentTimeMillis);
                if (A0G2) {
                    xDg.A00 = currentPositionMs * 100;
                }
                r05.A03(xDg);
            }
            C255773uh r06 = this.A0L;
            if (r06 != null) {
                ReelViewerFragment reelViewerFragment = this.A13;
                if (r06.A1m()) {
                    C309966aD r07 = reelViewerFragment.A10;
                    r07.getClass();
                    r07.DxU();
                    reelViewerFragment.A0q.A00();
                }
                C17291VPs vPs = reelViewerFragment.A1O;
                if (vPs != null) {
                    C309556Ys r10 = reelViewerFragment.A1N;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j = r10.A01;
                    if (j == -1 || SystemClock.elapsedRealtime() - j < r10.A00) {
                        z = false;
                    } else {
                        r10.A02 += elapsedRealtime2 - j;
                        z = true;
                    }
                    r10.A01 = elapsedRealtime2;
                    if (z) {
                        C18013Vjp vjp = vPs.A00;
                        Handler handler = vjp.A03;
                        handler.removeCallbacksAndMessages((Object) null);
                        handler.post(new C20097Wkv(vjp));
                    }
                }
            }
            AtomicBoolean atomicBoolean = this.A14;
            if (!atomicBoolean.get() && this.A1D != null && this.A0S) {
                atomicBoolean.set(true);
            }
        }
    }

    public final boolean Ce9() {
        return CEZ() instanceof TextureView;
    }

    public final void Dpp() {
        A06();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E47(X.C255773uh r12, boolean r13) {
        /*
            r11 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            r11.A0F = r0
            boolean r0 = r11.A0c
            if (r0 != 0) goto L_0x000d
            r0 = 0
            r11.A08 = r0
        L_0x000d:
            X.4MN r4 = r11.A0M
            if (r4 == 0) goto L_0x00cc
            X.11Z.A00()
            boolean r3 = r12.A17()
            r10 = 0
            if (r3 == 0) goto L_0x002c
            if (r13 == 0) goto L_0x002c
            boolean r0 = r11.A0d
            if (r0 == 0) goto L_0x002c
            X.4ME r2 = r11.A0u
            X.4Nn r1 = A04(r11)
            java.lang.String r0 = "start"
            r2.EH6(r1, r12, r0, r10)
        L_0x002c:
            boolean r0 = r11.A0c
            if (r0 != 0) goto L_0x0032
            r11.A09 = r10
        L_0x0032:
            r11.A0c = r10
            X.3mL r1 = r12.A0e
            X.3mL r0 = X.C250963mL.BROADCAST_ARCHIVE
            if (r1 != r0) goto L_0x0114
            com.instagram.common.session.UserSession r3 = r11.A0t
            X.0Tu r2 = X.0Tu.A05
            r0 = 36592434167742966(0x8200a0000901f6, double:3.204540941361684E-306)
        L_0x0043:
            long r0 = X.182.A01(r2, r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r0 = r0.intValue()
            r11.A0A = r0
        L_0x0051:
            com.instagram.common.session.UserSession r1 = r11.A0t
            X.3WR r0 = r12.A0M(r1)
            r7 = 0
            if (r0 == 0) goto L_0x010d
            X.3WR r0 = r12.A0M(r1)
            java.lang.String r0 = r0.A0I
            if (r0 == 0) goto L_0x010d
            X.3WR r0 = r12.A0M(r1)
            java.lang.String r0 = r0.A0I
            android.net.Uri r0 = X.0cp.A03(r0)
            r4.EnS(r0)
        L_0x006f:
            X.6VC r0 = X.AnonymousClass6VB.A00(r1)
            r0.A0C(r12, r10)
            X.34n r0 = X.C2366334m.A00(r1)
            X.34o r0 = r0.A01
            X.34p r0 = r0.A04
            r0.A08(r7)
            X.3WR r2 = r12.A0M(r1)
            X.6l0 r0 = r11.A0O
            if (r0 == 0) goto L_0x008f
            android.widget.FrameLayout r0 = r0.Bkk()
            r11.A0G = r0
        L_0x008f:
            boolean r0 = r12.A0s()
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = r12.A0R()
            r0.getClass()
            android.net.Uri r5 = X.0cp.A03(r0)
            if (r2 == 0) goto L_0x00d0
            java.lang.Integer r6 = r2.A0E
        L_0x00a4:
            r9 = 1
            java.lang.String r8 = A05(r11)
            r4.ETv(r5, r6, r7, r8, r9, r10)
            android.view.ViewGroup r0 = r11.A0G
            r4.E3n(r0, r7)
            boolean r0 = r11.A0a
            if (r0 == 0) goto L_0x00cd
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x00b7:
            r11.A0P = r0
        L_0x00b9:
            boolean r0 = r11.A16
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = "autoplay"
            r11.A0Q = r0
        L_0x00c1:
            X.4MN r1 = r11.A0M
            if (r1 == 0) goto L_0x00cc
            boolean r0 = r11.A17
            if (r0 == 0) goto L_0x00cc
            r1.start()
        L_0x00cc:
            return
        L_0x00cd:
            java.lang.Integer r0 = r11.A0P
            goto L_0x00b7
        L_0x00d0:
            r6 = r7
            goto L_0x00a4
        L_0x00d2:
            if (r2 == 0) goto L_0x0105
            java.lang.String r1 = A05(r11)
            X.4Lx r0 = new X.4Lx
            r0.<init>()
            r4.ETx(r0, r2, r1, r10)
            boolean r0 = r11.A0G()
            r1 = 0
            if (r0 == 0) goto L_0x00e9
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x00e9:
            r0 = -5
            r11.A08(r1, r0)
            android.view.ViewGroup r0 = r11.A0G
            r4.E3n(r0, r7)
            boolean r0 = r11.A0a
            if (r0 == 0) goto L_0x0102
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x00f8:
            r11.A0P = r0
        L_0x00fa:
            android.os.Handler r2 = r11.A0s
            r0 = 1500(0x5dc, double:7.41E-321)
            r2.sendEmptyMessageDelayed(r10, r0)
            goto L_0x00b9
        L_0x0102:
            java.lang.Integer r0 = r11.A0P
            goto L_0x00f8
        L_0x0105:
            java.lang.String r1 = "REEL_VIDEO_PLAYER_FAILED_TO_START"
            java.lang.String r0 = "Failed to start reel video player because of invalid video source"
            X.0wb.A03(r1, r0)
            goto L_0x00fa
        L_0x010d:
            r0 = r4
            X.4MM r0 = (X.AnonymousClass4MM) r0
            r0.A07 = r7
            goto L_0x006f
        L_0x0114:
            if (r3 != 0) goto L_0x0051
            com.instagram.common.session.UserSession r3 = r11.A0t
            X.0Tu r2 = X.0Tu.A05
            r0 = 36592434167218674(0x8200a0000101f2, double:3.20454094103012E-306)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313416gP.E47(X.3uh, boolean):void");
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        A06();
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
