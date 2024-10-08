package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8HG  reason: invalid class name */
public abstract class AnonymousClass8HG implements AnonymousClass8HH, AnonymousClass8HI, C352918Fo, AnonymousClass89Y {
    public int A00;
    public int A01;
    public SurfaceTexture A02;
    public TextureView A03;
    public C340297l2 A04;
    public C342917pN A05 = null;
    public AnonymousClass8HT A06;
    public C314446iH A07;
    public AnonymousClass80U A08;
    public FilmstripTimelineView A09 = null;
    public boolean A0A;
    public ViewStub A0B;
    public AnonymousClass8HJ A0C = this.A0T;
    public final Context A0D;
    public final FrameLayout A0E;
    public final UserSession A0F;
    public final C357638Yz A0G;
    public final C353028Fz A0H;
    public final AnonymousClass8AL A0I;
    public final C3493580b A0J = new AnonymousClass8HQ(this);
    public final C3493580b A0K = new AnonymousClass8HR(this);
    public final Map A0L = new HashMap();
    public final AtomicInteger A0M = new AtomicInteger(0);
    public final AnonymousClass0eM A0N = AnonymousClass0eN.A01(new AnonymousClass8HP(this));
    public final boolean A0O;
    public final C3503684j A0P;
    public final C3496881i A0Q;
    public final boolean A0R;
    public final View A0S;
    public volatile AnonymousClass8HJ A0T = AnonymousClass8HJ.NORMAL;
    public volatile AnonymousClass80X A0U;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A08(boolean r7) {
        /*
            r6 = this;
            r5 = r6
            boolean r0 = r6 instanceof X.AnonymousClass8HF
            if (r0 == 0) goto L_0x008a
            r4 = r6
            X.8HF r4 = (X.AnonymousClass8HF) r4
            monitor-enter(r5)
            java.util.concurrent.atomic.AtomicInteger r1 = r4.A0M     // Catch:{ all -> 0x00dd }
            r0 = 2
            r2 = 1
            boolean r0 = r1.compareAndSet(r2, r0)     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x00db
            if (r7 == 0) goto L_0x001b
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00dd }
            r4.A02 = r0     // Catch:{ all -> 0x00dd }
        L_0x001b:
            X.7pN r0 = r4.A05     // Catch:{ all -> 0x00dd }
            r0.getClass()     // Catch:{ all -> 0x00dd }
            if (r7 == 0) goto L_0x0023
            r2 = 0
        L_0x0023:
            X.7tO r0 = X.C342917pN.A00(r0)     // Catch:{ all -> 0x00dd }
            X.7tN r0 = (X.C345367tN) r0     // Catch:{ all -> 0x00dd }
            X.7rl r0 = r0.A00     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x0038
            X.7rk r0 = (X.C344367rk) r0     // Catch:{ all -> 0x00dd }
            X.AJ3 r1 = r0.A02     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x0038
            r1.A0Y = r2     // Catch:{ all -> 0x00dd }
            r0 = 1
            r1.A0I = r0     // Catch:{ all -> 0x00dd }
        L_0x0038:
            X.8Fz r0 = r4.A0H     // Catch:{ all -> 0x00dd }
            r0.A02(r7)     // Catch:{ all -> 0x00dd }
            X.7l2 r2 = r4.A04     // Catch:{ all -> 0x00dd }
            r2.getClass()     // Catch:{ all -> 0x00dd }
            X.8lT r1 = new X.8lT     // Catch:{ all -> 0x00dd }
            r1.<init>(r4)     // Catch:{ all -> 0x00dd }
            r0 = 1
            r2.A0N(r1, r0)     // Catch:{ all -> 0x00dd }
            if (r7 != 0) goto L_0x0052
            X.AnonymousClass8HF.A02(r4)     // Catch:{ all -> 0x00dd }
            goto L_0x00db
        L_0x0052:
            com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView r2 = r4.A04()     // Catch:{ all -> 0x00dd }
            r4.A09 = r2     // Catch:{ all -> 0x00dd }
            if (r2 == 0) goto L_0x00db
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = r4.A03     // Catch:{ all -> 0x00dd }
            r0 = 0
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x00dd }
            boolean r0 = r1.CTv()     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x006e
            X.Amw r0 = new X.Amw     // Catch:{ all -> 0x00dd }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00dd }
            X.0nA.A0p(r2, r0)     // Catch:{ all -> 0x00dd }
        L_0x006e:
            android.content.Context r0 = r4.A0D     // Catch:{ all -> 0x00dd }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ all -> 0x00dd }
            r0 = 2131165266(0x7f070052, float:1.7944744E38)
            int r3 = r1.getDimensionPixelSize(r0)     // Catch:{ all -> 0x00dd }
            r0 = 2131165222(0x7f070026, float:1.7944655E38)
            int r2 = r1.getDimensionPixelSize(r0)     // Catch:{ all -> 0x00dd }
            com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView r1 = r4.A09     // Catch:{ all -> 0x00dd }
            X.8HZ r0 = r4.A08     // Catch:{ all -> 0x00dd }
            r1.A02(r0, r3, r2)     // Catch:{ all -> 0x00dd }
            goto L_0x00db
        L_0x008a:
            r3 = r6
            X.9m8 r3 = (X.C387389m8) r3
            monitor-enter(r5)
            java.util.concurrent.atomic.AtomicInteger r1 = r3.A0M     // Catch:{ all -> 0x00dd }
            r4 = 1
            r0 = 2
            boolean r0 = r1.compareAndSet(r4, r0)     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x00db
            X.7l2 r0 = r3.A04     // Catch:{ all -> 0x00dd }
            r0.getClass()     // Catch:{ all -> 0x00dd }
            boolean r0 = r0.CVP()     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x00af
            X.B17 r1 = r3.A05     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x00af
            X.7l2 r0 = r3.A04     // Catch:{ all -> 0x00dd }
            r0.EEJ(r1)     // Catch:{ all -> 0x00dd }
            r0 = 0
            r3.A05 = r0     // Catch:{ all -> 0x00dd }
        L_0x00af:
            X.Amx r0 = new X.Amx     // Catch:{ all -> 0x00dd }
            r0.<init>(r3, r7)     // Catch:{ all -> 0x00dd }
            X.11Z.A03(r0)     // Catch:{ all -> 0x00dd }
            X.7l2 r2 = r3.A04     // Catch:{ all -> 0x00dd }
            r2.getClass()     // Catch:{ all -> 0x00dd }
            r1 = 7
            X.9du r0 = new X.9du     // Catch:{ all -> 0x00dd }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x00dd }
            r2.A0N(r0, r4)     // Catch:{ all -> 0x00dd }
            if (r7 == 0) goto L_0x00d8
            X.0eM r0 = r3.A0B     // Catch:{ all -> 0x00dd }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x00dd }
            X.0vF r1 = (X.AnonymousClass0vF) r1     // Catch:{ all -> 0x00dd }
            X.9ki r0 = new X.9ki     // Catch:{ all -> 0x00dd }
            r0.<init>(r3)     // Catch:{ all -> 0x00dd }
            r1.ATE(r0)     // Catch:{ all -> 0x00dd }
            goto L_0x00db
        L_0x00d8:
            X.C387389m8.A01(r3)     // Catch:{ all -> 0x00dd }
        L_0x00db:
            monitor-exit(r5)
            return
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8HG.A08(boolean):void");
    }

    public final /* synthetic */ void DNK(float f, float f2) {
    }

    public final void DiR(float f) {
    }

    public final /* synthetic */ void E0X(float f) {
    }

    public final FilmstripTimelineView A04() {
        View findViewById;
        ViewStub viewStub = this.A0B;
        if (viewStub == null || viewStub.getParent() == null) {
            View view = this.A0S;
            if (view.findViewById(R.id.boomerang_trimmer) != null) {
                findViewById = view.findViewById(R.id.boomerang_trimmer);
            }
            return this.A09;
        }
        findViewById = viewStub.inflate();
        this.A09 = (FilmstripTimelineView) findViewById;
        return this.A09;
    }

    public final void A05() {
        C39735A7b a7b = (C39735A7b) this.A0L.get(this.A0T);
        FilmstripTimelineView filmstripTimelineView = this.A09;
        if (!(filmstripTimelineView == null || a7b == null)) {
            filmstripTimelineView.A01(a7b.A00, a7b.A01);
        }
        TextureView textureView = this.A03;
        if (textureView != null) {
            textureView.setVisibility(8);
        }
    }

    public final void A06(SurfaceTexture surfaceTexture, float f, int i, int i2) {
        AJ3 aj3;
        if (this instanceof AnonymousClass8HF) {
            C342917pN r0 = this.A05;
            r0.getClass();
            C344377rl r02 = ((C345367tN) C342917pN.A00(r0)).A00;
            if (r02 != null && (aj3 = ((C344367rk) r02).A02) != null) {
                aj3.A0K.post(new C41226AqO(surfaceTexture, aj3, f, i, i2));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r1 != 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.AnonymousClass8HJ r7) {
        /*
            r6 = this;
            boolean r0 = r6.A0R
            if (r0 == 0) goto L_0x002d
            android.content.Context r1 = r6.A0D
            int r0 = X.ABO.A00(r7)
            java.lang.String r5 = r1.getString(r0)
            X.84j r4 = r6.A0P
            android.widget.TextView r0 = r4.A05
            if (r0 == 0) goto L_0x001b
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r0 = r0 ^ 1
            r2 = 750(0x2ee, double:3.705E-321)
            X.C3503684j.A02(r4, r5, r0)
            android.view.View r1 = r4.A0A
            java.lang.Runnable r0 = r4.A0I
            r1.removeCallbacks(r0)
            r1.postDelayed(r0, r2)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8HG.A07(X.8HJ):void");
    }

    public final AnonymousClass8HJ AuE() {
        return this.A0T;
    }

    public final void D0E() {
        this.A04 = this.A0Q.A02;
    }

    public final void DNM(float f) {
        TextureView textureView = this.A03;
        if (textureView != null) {
            textureView.setVisibility(0);
        }
        SurfaceTexture surfaceTexture = this.A02;
        if (surfaceTexture != null) {
            A06(surfaceTexture, f, this.A01, this.A00);
        }
    }

    public final void DSE(AnonymousClass8HJ r5) {
        if (this.A0G.A0V(C358088aL.A0B)) {
            C340297l2 r1 = this.A04;
            if (r1 != null && r1.CVP()) {
                r1.A07();
            }
            27r A012 = 27p.A01(this.A0F);
            2Ob.A00(this.A0U, AnonymousClass80X.POST_CAPTURE);
            A012.A0I();
            AtomicInteger atomicInteger = this.A0M;
            if (atomicInteger.get() == 1) {
                0kD.A03("boomerang mode update", "Tried to update boomerang mode while recording boomerang");
                return;
            }
            if (atomicInteger.get() == 0) {
                A07(r5);
            }
            0nY.A00().ATE(new C386679kz(r5, this));
        }
    }

    public final void Dfu(float f) {
        TextureView textureView = this.A03;
        if (textureView != null) {
            textureView.setVisibility(0);
        }
        SurfaceTexture surfaceTexture = this.A02;
        if (surfaceTexture != null) {
            A06(surfaceTexture, f, this.A01, this.A00);
        }
    }

    public final void Dsh(boolean z) {
        FilmstripTimelineView filmstripTimelineView;
        if (this.A09 != null) {
            TextureView textureView = this.A03;
            if (textureView != null) {
                textureView.setVisibility(8);
            }
            Map map = this.A0L;
            if (map.containsKey(this.A0T) && (filmstripTimelineView = this.A09) != null) {
                C355368Ps r0 = filmstripTimelineView.A0A;
                float leftTrimmerValue = r0.getLeftTrimmerValue();
                float rightTrimmerValue = r0.getRightTrimmerValue();
                C39735A7b a7b = (C39735A7b) map.get(this.A0T);
                if (a7b != null) {
                    float f = a7b.A00;
                    if (!(f == leftTrimmerValue && a7b.A01 == rightTrimmerValue)) {
                        if (f != leftTrimmerValue) {
                            a7b.A00 = leftTrimmerValue;
                        }
                        if (a7b.A01 != rightTrimmerValue) {
                            a7b.A01 = rightTrimmerValue;
                        }
                        this.A06.A01(AnonymousClass000.A00(2714));
                        C355368Ps r02 = this.A09.A0A;
                        float leftTrimmerValue2 = r02.getLeftTrimmerValue();
                        float rightTrimmerValue2 = r02.getRightTrimmerValue();
                        if (this instanceof AnonymousClass8HF) {
                            AnonymousClass8HF r4 = (AnonymousClass8HF) this;
                            if (r4.A0M.compareAndSet(3, 4)) {
                                C342057ny.A00(new C40790AjM(r4));
                                Integer num = r4.A05;
                                num.getClass();
                                String absolutePath = LIM.A00(num.intValue()).getAbsolutePath();
                                C342917pN r1 = r4.A05;
                                r1.getClass();
                                AnonymousClass8HJ r5 = r4.A0T;
                                AnonymousClass8HW r6 = r4.A06;
                                0qQ.A0B(absolutePath, 0);
                                0qQ.A0B(r5, 1);
                                0qQ.A0B(r6, 4);
                                C342917pN.A00(r1).FJl(r5, r6, absolutePath, leftTrimmerValue2, rightTrimmerValue2);
                            }
                        }
                        C39735A7b a7b2 = (C39735A7b) map.get(this.A0T);
                        if (a7b2 != null) {
                            a7b2.A03++;
                            return;
                        }
                        return;
                    }
                }
            }
            A05();
        }
    }

    public final void Dsj(boolean z) {
        if (this.A03 == null) {
            TextureView textureView = new TextureView(this.A0D);
            this.A03 = textureView;
            this.A0E.addView(textureView);
            this.A03.setSurfaceTextureListener(new ALs(this));
            this.A03.setVisibility(8);
        }
    }

    public final /* synthetic */ boolean onBackPressed() {
        return false;
    }

    public AnonymousClass8HG(Context context, View view, UserSession userSession, C357638Yz r7, C353028Fz r8, AnonymousClass8AL r9, C3503684j r10, C3496881i r11, AnonymousClass80U r12, boolean z) {
        this.A0G = r7;
        this.A0D = context;
        this.A0F = userSession;
        this.A0I = r9;
        this.A0H = r8;
        this.A0P = r10;
        this.A0Q = r11;
        this.A0R = z;
        this.A06 = AnonymousClass8HS.A00(userSession, (C357638Yz) null);
        this.A08 = r12;
        this.A0S = view;
        0qQ.A0B(context, 0);
        boolean A002 = C305756Jk.A00(context);
        this.A0O = A002;
        if (A002 && view.findViewById(R.id.boomerang_trimmer_stub) != null) {
            this.A0B = (ViewStub) view.requireViewById(R.id.boomerang_trimmer_stub);
        }
        this.A0E = (FrameLayout) view.requireViewById(R.id.gl_frame_preview_container);
    }
}
