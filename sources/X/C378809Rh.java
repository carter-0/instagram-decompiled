package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.io.IOException;
import org.webrtc.CameraCapturer;

/* renamed from: X.9Rh  reason: invalid class name and case insensitive filesystem */
public final class C378809Rh extends C378459Pw {
    public float A00 = 1.0f;
    public int A01 = -1;
    public int A02 = -1;
    public int A03;
    public AnonymousClass4MM A04;
    public Integer A05 = AnonymousClass05K.A01;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09 = true;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final UserSession A0D;
    public final AnonymousClass9T0 A0E;
    public final AnonymousClass9R7 A0F;
    public final boolean A0G;
    public final Context A0H;
    public volatile int A0I = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C378809Rh(Context context, UserSession userSession, C39888ADk aDk, AnonymousClass9RG r8, AnonymousClass9R7 r9, boolean z, boolean z2) {
        super(userSession, (C41843B2y) null, aDk);
        AnonymousClass7TF.A1E(context, 1, userSession);
        this.A0H = context;
        this.A0F = r9;
        this.A06 = z;
        this.A07 = z2;
        this.A0D = userSession;
        this.A0G = 182.A06(0Tu.A05, userSession, 36317728059233762L);
        this.A0E = new C388769oM(this, r8, r9);
    }

    public static final void A05(C378809Rh r3, boolean z) {
        View view;
        r3.A02 = -1;
        if (z) {
            r3.A05 = AnonymousClass05K.A01;
            A04(r3, A00(r3), false);
        }
        C39888ADk aDk = r3.A07;
        if (!(aDk == null || (view = aDk.A00) == null)) {
            view.clearAnimation();
            aDk.A00.setVisibility(0);
            View view2 = aDk.A00;
            Animation animation = aDk.A02;
            animation.getClass();
            view2.startAnimation(animation);
        }
        r3.A09 = true;
        C41838B2t b2t = r3.A04;
        if (b2t != null) {
            b2t.DyY();
        }
    }

    public static final int A00(C378809Rh r1) {
        int i = r1.A00;
        if (i > 0) {
            return i;
        }
        ClipInfo clipInfo = r1.A08;
        if (clipInfo != null) {
            return clipInfo.A07;
        }
        return 0;
    }

    public static final void A01(C378809Rh r5) {
        AnonymousClass4MM r1;
        SlideInAndOutIconView slideInAndOutIconView;
        Object obj = r5.A0C;
        0qQ.A06(obj);
        synchronized (obj) {
            if (r5.A0D && (r1 = r5.A04) != null) {
                r5.A07 = false;
                r1.Eqq(0.0f);
                AnonymousClass3Q2 r3 = r5.A09;
                if (r3 == null || !r3.A5C || !AnonymousClass30D.A0K(r5.A0D, true, r3.A12())) {
                    C39888ADk aDk = r5.A07;
                    if (!(aDk == null || (slideInAndOutIconView = aDk.A05) == null)) {
                        C39888ADk.A00(slideInAndOutIconView.getContext().getDrawable(R.drawable.soundoff), aDk, C232822uV.A0B, (String) null);
                    }
                } else {
                    r5.A0F();
                }
            }
        }
    }

    public static final void A02(C378809Rh r4) {
        Object obj = r4.A0C;
        0qQ.A06(obj);
        synchronized (obj) {
            if (r4.A0D) {
                r4.A0D = false;
                r4.A0B = false;
                AnonymousClass4MM r1 = r4.A04;
                if (r1 != null) {
                    r1.A0M = null;
                    r1.ECQ(false);
                }
                r4.A04 = null;
            }
        }
    }

    public static final void A03(C378809Rh r10) {
        IllegalStateException e;
        IllegalStateException illegalStateException;
        AnonymousClass4MM r3 = new AnonymousClass4MM(r10.A0H, r10.A0D, "media_player_manager");
        try {
            ClipInfo clipInfo = r10.A08;
            if (clipInfo != null) {
                String str = clipInfo.A0F;
                if (str != null) {
                    Uri fromFile = Uri.fromFile(AnonymousClass7TE.A0t(str));
                    AnonymousClass3Q2 r0 = r10.A09;
                    if (r0 != null) {
                        r3.ETv(fromFile, (Integer) null, r0.A3t, "", false, false);
                        r3.A0M = new C378829Rj(r10);
                        r10.A04 = r3;
                        Object obj = r10.A0C;
                        0qQ.A06(obj);
                        synchronized (obj) {
                            SurfaceTexture A002 = r10.A0F.A00();
                            if (A002 != null) {
                                r3.setSurface(new Surface(A002));
                                A002.setOnFrameAvailableListener(r10);
                                r3.A0M = new C378829Rj(r10);
                                r3.Eqq(0.0f);
                                try {
                                    r3.E3n((ViewGroup) null, (Integer) null);
                                    r10.A09 = true;
                                    r10.A0D = true;
                                    r10.A08 = false;
                                    r10.A02 = -1;
                                } catch (IllegalStateException e2) {
                                    e = e2;
                                    AnonymousClass7TF.A19(0wj.A01.AEf("MediaPlayerManager", 817901174), DialogModule.KEY_MESSAGE, "Error during MediaPlayer prepare", e);
                                    C41838B2t b2t = r10.A04;
                                    if (b2t != null) {
                                        b2t.DxO("Error during MediaPlayer prepare");
                                    }
                                }
                            } else {
                                e = AnonymousClass7TE.A0y();
                                throw e;
                            }
                        }
                        r10.A0C();
                        return;
                    }
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                } else {
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            }
            throw illegalStateException;
        } catch (IOException unused) {
        }
    }

    public static final void A04(C378809Rh r2, int i, boolean z) {
        if (i != r2.A02) {
            if (z) {
                r2.A01.post(new C378859Rm(r2));
            }
            r2.A08 = false;
            if (A06(r2, i, true)) {
                r2.A02 = i;
                AnonymousClass4MM r1 = r2.A04;
                if (r1 != null) {
                    r1.Eqq(0.0f);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            r2.A01 = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A06(X.C378809Rh r7, int r8, boolean r9) {
        /*
            java.lang.Object r5 = r7.A0C
            X.0qQ.A06(r5)
            monitor-enter(r5)
            boolean r0 = r7.A0D     // Catch:{ all -> 0x004d }
            r1 = 0
            if (r0 == 0) goto L_0x004b
            r6 = 1
            if (r9 == 0) goto L_0x0017
            boolean r0 = r7.A0B     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x004b
            r7.A0B = r6     // Catch:{ all -> 0x004d }
            r0 = 200(0xc8, float:2.8E-43)
            goto L_0x001b
        L_0x0017:
            int r0 = r7.A03     // Catch:{ all -> 0x004d }
            int r0 = r0 + 1000
        L_0x001b:
            r7.A03 = r0     // Catch:{ all -> 0x004d }
            int r8 = r8 - r0
            int r4 = java.lang.Math.max(r8, r1)     // Catch:{ all -> 0x004d }
            com.instagram.common.session.UserSession r3 = r7.A0D     // Catch:{ all -> 0x004d }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x004d }
            r0 = 36312634227688652(0x810226000004cc, double:3.02759433260741E-306)
            boolean r0 = X.182.A06(r2, r3, r0)     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0038
            X.4MM r0 = r7.A04     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0041
            r0.start()     // Catch:{ all -> 0x004d }
        L_0x0038:
            X.4MM r0 = r7.A04     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0046
            r0.seekTo(r4)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            return r6
        L_0x0041:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x004d }
            goto L_0x004a
        L_0x0046:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x004d }
        L_0x004a:
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r5)
            return r1
        L_0x004d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378809Rh.A06(X.9Rh, int, boolean):boolean");
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        IllegalStateException illegalStateException;
        int A002;
        Object obj = this.A0C;
        0qQ.A06(obj);
        synchronized (obj) {
            if (this.A0D) {
                AnonymousClass4MM r0 = this.A04;
                if (r0 != null) {
                    this.A0I = r0.getCurrentPosition();
                    Integer num = this.A05;
                    if ((num == AnonymousClass05K.A01 || num == AnonymousClass05K.A0C) && this.A0I > this.A02 - 500) {
                        int i = this.A0I;
                        int i2 = this.A02;
                        if (i > i2 + CameraCapturer.OPEN_CAMERA_DELAY_MS) {
                            A06(this, i2, false);
                        } else {
                            this.A0B = false;
                            AnonymousClass4MM r02 = this.A04;
                            if (r02 != null) {
                                r02.pause();
                            }
                            if (this.A06) {
                                A0F();
                            }
                            Integer num2 = this.A05;
                            Integer num3 = AnonymousClass05K.A0C;
                            if (num2 != num3 || this.A02 == (A002 = A00(this))) {
                                C342057ny.A00(new AnonymousClass9S2(this));
                            } else {
                                this.A05 = num3;
                                A04(this, A002, false);
                            }
                        }
                    }
                    if (this.A05 == AnonymousClass05K.A00) {
                        int i3 = this.A0I;
                        ClipInfo clipInfo = this.A08;
                        if (clipInfo == null) {
                            illegalStateException = new IllegalStateException("Required value was null.");
                        } else if (i3 >= clipInfo.A05) {
                            AnonymousClass9T2 r03 = this.A06;
                            if (r03 != null) {
                                r03.A01.run();
                            }
                            A06(this, A00(this), true);
                        }
                    }
                    this.A0E.A00.A03((Long) null);
                } else {
                    illegalStateException = new IllegalStateException("Required value was null.");
                }
                throw illegalStateException;
            }
        }
    }
}
