package X;

import android.os.SystemClock;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textureview.ScalingTextureView;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4M2  reason: invalid class name */
public abstract class AnonymousClass4M2 implements C257393xK {
    public void DTt(byte[] bArr, long j) {
    }

    public void Dxh(long j, String str) {
    }

    public final void Csy(C291485hN r2) {
        if (this instanceof AnonymousClass4M1) {
            ((AnonymousClass4M1) this).A0o.EFa(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (X.AnonymousClass4M1) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cwd() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.AnonymousClass4M1
            if (r0 == 0) goto L_0x0013
            r2 = r3
            X.4M1 r2 = (X.AnonymousClass4M1) r2
            X.4Nl r0 = r2.A0O
            if (r0 == 0) goto L_0x0013
            r1 = 1
            r0.A05 = r1
            X.4NW r0 = r2.A0r
            r0.A04(r1)
        L_0x0013:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4M2.Cwd():void");
    }

    public final void CzD(AnonymousClass4MN r5, int i) {
        if (this instanceof AnonymousClass4M1) {
            AnonymousClass4M1 r3 = (AnonymousClass4M1) this;
            C263814Nl r0 = r3.A0O;
            if (r0 != null) {
                AnonymousClass4MF r2 = r3.A0o;
                C263754Nf r02 = r0.A0B;
                r2.EGt(AnonymousClass4M1.A00(r02, r3), r02.A03, i);
            }
            r3.A0b = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = (X.AnonymousClass4M1) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CzE(X.AnonymousClass4MN r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass4M1
            if (r0 == 0) goto L_0x0029
            r4 = r5
            X.4M1 r4 = (X.AnonymousClass4M1) r4
            X.4Nl r1 = r4.A0O
            if (r1 == 0) goto L_0x0029
            X.4MM r0 = r4.A0K
            if (r0 == 0) goto L_0x0029
            X.4MF r3 = r4.A0o
            X.4Nf r0 = r1.A0B
            java.lang.Object r2 = r0.A03
            X.4Nn r1 = X.AnonymousClass4M1.A00(r0, r4)
            X.4MM r0 = r4.A0K
            java.util.ArrayList r0 = r0.BDg()
            r3.EGu(r1, r2, r0)
            boolean r0 = r4.A15
            if (r0 == 0) goto L_0x0029
            X.AnonymousClass4M1.A0F(r4)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4M2.CzE(X.4MN):void");
    }

    public void D5H(AnonymousClass4MN r6) {
        View view;
        if (this instanceof AnonymousClass4M1) {
            AnonymousClass4M1 r1 = (AnonymousClass4M1) this;
            if (r1.A15) {
                AnonymousClass4M1.A0F(r1);
            }
            r1.A0N.onCompletion();
            AnonymousClass4MI r0 = r1.A0t;
            String CE4 = r1.CE4();
            AnonymousClass4MK r4 = r0.A05;
            if (CE4 != null && r4.A04) {
                String str = (String) 00l.A0R(CE4, new String[]{"_"}, 0).get(0);
                WeakReference weakReference = r4.A03;
                if (!(weakReference == null || (view = (View) weakReference.get()) == null)) {
                    view.setContentDescription(002.A0R("Playback completed ", str));
                }
                r4.A00 = 0;
            }
        }
    }

    public final void D7P(AnonymousClass4MN r2, List list) {
        if (this instanceof AnonymousClass4M1) {
            ((AnonymousClass4M1) this).A0N.onCues(list);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = (X.AnonymousClass4M1) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DAP(X.AnonymousClass4MN r18, java.lang.String r19, java.lang.String r20, int r21, int r22, int r23) {
        /*
            r17 = this;
            r1 = r17
            r14 = r20
            r13 = r19
            boolean r0 = r1 instanceof X.AnonymousClass4M1
            if (r0 == 0) goto L_0x0040
            r3 = r1
            X.4M1 r3 = (X.AnonymousClass4M1) r3
            X.4Nl r0 = r3.A0O
            if (r0 == 0) goto L_0x0040
            X.4MF r10 = r3.A0o
            X.4Nf r2 = r0.A0B
            java.lang.Object r12 = r2.A03
            java.lang.String r1 = ""
            if (r19 != 0) goto L_0x001c
            r13 = r1
        L_0x001c:
            r0 = r23
            float r0 = (float) r0
            int r15 = java.lang.Math.round(r0)
            if (r20 != 0) goto L_0x0026
            r14 = r1
        L_0x0026:
            int r7 = r3.A03
            int r8 = r3.getCurrentPositionMs()
            X.4Nl r0 = r3.A0O
            X.4Nf r0 = r0.A0B
            boolean r9 = r0.A00
            r4 = 0
            r5 = r21
            r6 = r22
            X.4Nn r11 = X.AnonymousClass4M1.A02(r2, r3, r4, r5, r6, r7, r8, r9)
            r16 = r5
            r10.EFo(r11, r12, r13, r14, r15, r16)
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4M2.DAP(X.4MN, java.lang.String, java.lang.String, int, int, int):void");
    }

    public final void DB0(AnonymousClass4MN r4) {
        if (this instanceof AnonymousClass4M1) {
            AnonymousClass4M1 r2 = (AnonymousClass4M1) this;
            C263814Nl r0 = r2.A0O;
            if ((r0 != null && r0.A03.A03) || C263454Mb.A01(r2.A0m, r2.A0Q)) {
                r2.A0V = false;
            }
            if (r2.A0a || C263454Mb.A01(r2.A0m, r2.A0Q)) {
                AnonymousClass4M1.A0H(r2);
            }
            C232732uM r02 = r2.A0N;
            if (r02 != null) {
                r02.onDrawnToSurface();
            }
        }
    }

    public void DCm(AnonymousClass4MN r17, String str, String str2, String str3) {
        int i;
        int i2;
        if (this instanceof AnonymousClass4M1) {
            AnonymousClass4M1 r0 = (AnonymousClass4M1) this;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            0KC.A0O("VideoPlayerImpl", "IgBaseVideoPlayer Error: %s %s %s", new Object[]{str4, str5, str6});
            r0.A0R.set(false);
            if (!str5.equals("RESPONSE_CODE_403") || !r0.A1A) {
                if (!(r0.A0O == null || r0.A0Q == null)) {
                    UserSession userSession = r0.A0m;
                    0Tu r6 = 0Tu.A05;
                    if (182.A06(r6, userSession, 36310959190704520L) && 182.A06(r6, userSession, 36310959190770057L) && (i2 = r0.A08) < r0.A09) {
                        r0.A0c = true;
                        r0.A08 = i2 + 1;
                        C263814Nl r1 = r0.A0O;
                        AnonymousClass3WR r8 = r1.A0A;
                        C242423Ua r62 = r0.A0J;
                        C263754Nf r9 = r1.A0B;
                        float f = r0.A02;
                        boolean z = r1.A0E;
                        String str7 = r0.A0Q;
                        0qQ.A0B(r9, 3);
                        0qQ.A0B(str7, 6);
                        String str8 = r0.A0O.A0C;
                        int currentPositionMs = r0.getCurrentPositionMs();
                        int i3 = r0.A0A;
                        C263414Lx r7 = r0.A0O.A03;
                        0qQ.A0B(r7, 0);
                        r0.E4H(new C263794Nj(r62, r7, r8, r9, str8, str7, f, i3, currentPositionMs, z));
                        return;
                    }
                }
                if (r0.A0K != null) {
                    UserSession userSession2 = r0.A0m;
                    0Tu r4 = 0Tu.A05;
                    if (182.A06(r4, userSession2, 36310959190704520L) && 182.A06(r4, userSession2, 36310959190442373L) && (i = r0.A08) < r0.A09) {
                        r0.A08 = i + 1;
                        r0.A0K.EJE();
                        return;
                    }
                }
                C263814Nl r12 = r0.A0O;
                if (r12 != null) {
                    AnonymousClass4MF r5 = r0.A0o;
                    C263754Nf r13 = r12.A0B;
                    r5.EGv(AnonymousClass4M1.A00(r13, r0), r13.A03, str4, str5, str6);
                    r0.A0N.onVideoPlayerError(r0.A0O.A0B, str6);
                    if (!(r0.A0O.A0B.A03 instanceof C267334bO)) {
                        r0.EyP("error", true);
                        return;
                    }
                    return;
                }
                return;
            }
            r0.A0l.A01(1827799077, new C20103Wl1(r0));
        }
    }

    public void DPP(AnonymousClass4MN r6) {
        AnonymousClass4M1 r4;
        C263814Nl r1;
        View view;
        if ((this instanceof AnonymousClass4M1) && (r1 = r4.A0O) != null) {
            (r4 = (AnonymousClass4M1) this).A0U = true;
            r4.A0b = true;
            r1.A01++;
            AnonymousClass4MF r3 = r4.A0o;
            C263754Nf r0 = r1.A0B;
            r3.EGy(AnonymousClass4M1.A00(r0, r4), r0.A03, r1.A0D);
            AnonymousClass4M1.A0F(r4);
            r4.A0N.onLoop(r4.A0O.A01);
            r4.A0U = false;
            AnonymousClass4MI r02 = r4.A0t;
            String CE4 = r4.CE4();
            AnonymousClass4MK r12 = r02.A05;
            if (CE4 != null && r12.A04) {
                String str = (String) 00l.A0R(CE4, new String[]{"_"}, 0).get(0);
                WeakReference weakReference = r12.A03;
                if (weakReference != null && (view = (View) weakReference.get()) != null) {
                    view.setContentDescription(002.A0R("Playback looping ", str));
                }
            }
        }
    }

    public final void DPw(2Yz r2) {
        if (this instanceof AnonymousClass4M1) {
            ((AnonymousClass4M1) this).A0o.EGA(r2);
        }
    }

    public void DZ2(AnonymousClass4MN r6, long j) {
        C263814Nl r0;
        if (this instanceof AnonymousClass4M1) {
            AnonymousClass4M1 r4 = (AnonymousClass4M1) this;
            boolean z = false;
            r4.A0V = false;
            AnonymousClass4MM r2 = r4.A0K;
            if (!(r2 == null || (r0 = r4.A0O) == null)) {
                r0.A0B.A02.A03 = r2.FNM();
                C263814Nl r22 = r4.A0O;
                C263754Nf r1 = r22.A0B;
                if (r1.A02.A03 && r1.A00) {
                    z = true;
                }
                r22.A05 = z;
                r4.A0r.A04(z);
            }
            AnonymousClass4M1.A0G(r4);
            if (!r4.A17) {
                AnonymousClass4M1.A0E(r4);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = (X.AnonymousClass4M1) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DZ4(X.AnonymousClass4MN r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass4M1
            if (r0 == 0) goto L_0x0020
            r4 = r5
            X.4M1 r4 = (X.AnonymousClass4M1) r4
            X.4Nl r0 = r4.A0O
            if (r0 == 0) goto L_0x0020
            X.4MF r3 = r4.A0o
            X.4Nf r0 = r0.A0B
            java.lang.Object r2 = r0.A03
            int r1 = r4.getCurrentPositionMs()
            X.4Nl r0 = r4.A0O
            X.4Nf r0 = r0.A0B
            X.4Nn r0 = X.AnonymousClass4M1.A00(r0, r4)
            r3.EH3(r0, r2, r1)
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4M2.DZ4(X.4MN):void");
    }

    public void DiU(AnonymousClass4MN r2, long j) {
        if (this instanceof AnonymousClass4M1) {
            ((AnonymousClass4M1) this).A0N.onSeeking(j);
        }
    }

    public final void Dpp() {
        boolean z;
        if (this instanceof AnonymousClass4M1) {
            AnonymousClass4M1 r2 = (AnonymousClass4M1) this;
            long currentPositionMs = (long) r2.getCurrentPositionMs();
            long currentPositionMs2 = (long) r2.getCurrentPositionMs();
            long currentTimeMillis = System.currentTimeMillis();
            AnonymousClass4OK r3 = r2.A0E;
            if (AnonymousClass4NZ.A03()) {
                if (!182.A06(0Tu.A05, r2.A0m, 36318960715045650L)) {
                    AnonymousClass4NZ.A01(r2.CEZ(), r2.CE4(), currentPositionMs2);
                }
            }
            if (r3 != null) {
                C263814Nl r0 = r2.A0O;
                if (r0 == null) {
                    z = false;
                } else {
                    z = r0.A0B.A00;
                }
                C21068XDg xDg = new C21068XDg(currentPositionMs, currentPositionMs2, currentTimeMillis);
                if (z) {
                    xDg.A00 = currentPositionMs2 * 100;
                }
                r3.A03(xDg);
            }
            if (!r2.A0a) {
                AnonymousClass4M1.A0H(r2);
            }
            AtomicBoolean atomicBoolean = r2.A11;
            if (!atomicBoolean.get() && r2.A0w != null && r2.A12) {
                atomicBoolean.set(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = (X.AnonymousClass4M1) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DxR(X.C257183wz r6, X.AnonymousClass4MN r7) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass4M1
            if (r0 == 0) goto L_0x001e
            r4 = r5
            X.4M1 r4 = (X.AnonymousClass4M1) r4
            X.4Nl r1 = r4.A0O
            if (r1 == 0) goto L_0x001e
            X.3wz r0 = X.C257183wz.CACHED
            r3 = 0
            if (r6 != r0) goto L_0x0011
            r3 = 1
        L_0x0011:
            X.4Nf r2 = r1.A0B
            X.4Ng r0 = r2.A02
            r0.A02 = r3
            X.4MF r1 = r4.A0o
            java.lang.Object r0 = r2.A03
            r1.EGx(r0, r3)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4M2.DxR(X.3wz, X.4MN):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = (X.AnonymousClass4M1) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DxS(X.C257183wz r6, X.AnonymousClass4MN r7, long r8) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass4M1
            if (r0 == 0) goto L_0x0023
            r4 = r5
            X.4M1 r4 = (X.AnonymousClass4M1) r4
            X.4Nl r0 = r4.A0O
            if (r0 == 0) goto L_0x0023
            X.4Nf r3 = r0.A0B
            X.4Ng r2 = r3.A02
            X.3wz r1 = r2.A00
            X.3wz r0 = X.C257183wz.NOT_APPLY
            if (r1 != r0) goto L_0x0023
            r2.A00 = r6
            X.4MF r1 = r4.A0o
            java.lang.Object r0 = r3.A03
            r1.EFv(r6, r0)
            X.4NX r0 = r4.A0q
            r0.A02(r6)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4M2.DxS(X.3wz, X.4MN, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = (X.AnonymousClass4M1) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DxX(X.C257183wz r4, X.AnonymousClass4MN r5) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.AnonymousClass4M1
            if (r0 == 0) goto L_0x0018
            r1 = r3
            X.4M1 r1 = (X.AnonymousClass4M1) r1
            X.4Nl r0 = r1.A0O
            if (r0 == 0) goto L_0x0018
            X.4Nf r2 = r0.A0B
            X.4Ng r0 = r2.A02
            r0.A01 = r4
            X.4MF r1 = r1.A0o
            java.lang.Object r0 = r2.A03
            r1.EG5(r4, r0)
        L_0x0018:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4M2.DxX(X.3wz, X.4MN):void");
    }

    public final void DyJ(AnonymousClass4MN r4, float f, int i, int i2) {
        if (this instanceof AnonymousClass4M1) {
            AnonymousClass4M1 r2 = (AnonymousClass4M1) this;
            AnonymousClass4X8 r1 = r2.A0P;
            if (r1 != null && (r1 instanceof AnonymousClass4X7)) {
                ScalingTextureView scalingTextureView = ((AnonymousClass4X7) r1).A02;
                scalingTextureView.A02 = i;
                scalingTextureView.A01 = i2;
                ScalingTextureView.A00(scalingTextureView);
            }
            r2.A0B = i;
            r2.A07 = i2;
        }
    }

    public void DyS(long j) {
        View view;
        boolean z;
        String str;
        String str2;
        Runnable runnable;
        if (this instanceof AnonymousClass4M1) {
            AnonymousClass4M1 r1 = (AnonymousClass4M1) this;
            if (r1.A0K != null && ((r1.A0P == null || r1.Ce9()) && (runnable = r1.A0w) != null && !r1.A11.get() && r1.A12)) {
                1NW r4 = r1.A0l;
                r4.removeCallbacks(runnable);
                r4.A02(runnable, 1827799077, r1.A0j);
            }
            if (r1.A14) {
                AnonymousClass4M1.A0C(AnonymousClass3OB.PLAYING, r1);
                r1.A0u.sendEmptyMessage(2);
            }
            C263814Nl r0 = r1.A0O;
            if (r0 != null) {
                C263834Nn A01 = AnonymousClass4M1.A01(r0.A0B, r1, (int) j);
                AnonymousClass4M1.A0F(r1);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C263824Nm r02 = r1.A0O.A04;
                long j2 = elapsedRealtime - r02.A00;
                r1.A0s.A02(r02.A01);
                r1.A0q.A03(AnonymousClass4M1.A0M(r1), r1.A0O.A0B.A02.A03);
                AnonymousClass4MF r5 = r1.A0o;
                C263814Nl r2 = r1.A0O;
                C263754Nf r03 = r2.A0B;
                Object obj = r03.A03;
                boolean A0M = AnonymousClass4M1.A0M(r1);
                boolean z2 = r03.A02.A03;
                String str3 = r2.A04.A01;
                if (r1.A16 || ((str = r1.A0Q) != null && (str2 = r1.A0z) != null && r1.CcN() && str.equals(str2))) {
                    z = true;
                } else {
                    z = false;
                }
                r5.EH7(A01, obj, str3, j2, A0M, z2, z);
                r1.A0N.onVideoStartedPlaying(r1.A0O.A0B);
                AnonymousClass4NW r42 = r1.A0r;
                r42.A01.set(Float.valueOf(0.0f));
                r42.A00.set(false);
                r42.A02(r1.A02, -5);
                r5.EGs(A01, r1.A0O.A0B.A03, -5, true);
            }
            if (r1.A18) {
                int i = (int) j;
                r1.A03 = i;
                if (r1.A0S) {
                    AnonymousClass4M1.A0J(r1, i - r1.A05);
                }
            }
            AnonymousClass4MI r04 = r1.A0t;
            String CE4 = r1.CE4();
            AnonymousClass4MK r3 = r04.A05;
            if (CE4 != null && r3.A04) {
                String str4 = (String) 00l.A0R(CE4, new String[]{"_"}, 0).get(0);
                WeakReference weakReference = r3.A03;
                if (weakReference != null && (view = (View) weakReference.get()) != null) {
                    view.setContentDescription(002.A0R("Playback started ", str4));
                }
            }
        }
    }

    public final void E08(AnonymousClass4MN r5, String str, String str2, String str3) {
        if (this instanceof AnonymousClass4M1) {
            AnonymousClass4M1 r3 = (AnonymousClass4M1) this;
            0KC.A0O("VideoPlayerImpl", "IgBaseVideoPlayer Warning: %s %s %s", new Object[]{str, str2, str3});
            C263814Nl r0 = r3.A0O;
            if (r0 != null) {
                r3.A0o.EHD(r0.A0B.A03, str, str2, str3);
            }
        }
    }
}
