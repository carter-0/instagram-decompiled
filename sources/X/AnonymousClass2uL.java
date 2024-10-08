package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import com.instagram.user.model.User;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2uL  reason: invalid class name */
public abstract class AnonymousClass2uL implements C232732uM {
    public void onSeeking(long j) {
    }

    public void onSurfaceTextureDestroyed() {
    }

    public void onCompletion() {
        if (this instanceof C232722uK) {
            for (AnonymousClass2xT DxJ : ((C232722uK) this).A0R) {
                DxJ.DxJ();
            }
        }
    }

    public void onCues(List list) {
        AnonymousClass3V3 r1;
        1Xj r5;
        String str;
        List list2 = list;
        if (this instanceof C232722uK) {
            C232722uK r4 = (C232722uK) this;
            0qQ.A0B(list2, 0);
            C263744Ne r3 = r4.A02;
            if (r3 != null && (r1 = r3.A08) != null && (r5 = (1Xj) r3.A03) != null) {
                UserSession userSession = r4.A0K;
                Boolean valueOf = Boolean.valueOf(r3.A00);
                boolean CcK = r5.CcK();
                boolean CeS = r5.CeS();
                boolean A51 = r5.A51();
                boolean A4L = r5.A4L();
                List C9Z = r5.A0C.C9Z();
                AnonymousClass3WR CEL = r5.CEL();
                User CCd = r5.A0C.CCd();
                if (CCd != null) {
                    str = CCd.getId();
                } else {
                    str = null;
                }
                boolean A09 = AnonymousClass3WP.A09(userSession, CEL, valueOf, str, r5.A0C.CER(), C9Z, true, CcK, CeS, A51, A4L);
                if (A09 && AnonymousClass3WP.A0B((1Xj) r3.A03)) {
                    0qQ.A0B(userSession, 0);
                    1Av A00 = 1Au.A00(userSession);
                    0s0 r6 = A00.A2M;
                    AnonymousClass0YZ[] r10 = 1Av.A8a;
                    if (!((Boolean) r6.CDM(A00, r10[30])).booleanValue() && (!list2.isEmpty())) {
                        list2.add(0, C49937FFq.A00(r4.A0H, userSession));
                        1Av A002 = 1Au.A00(userSession);
                        A002.A2M.Epx(A002, true, r10[30]);
                        r4.A0I.post(new C57839IhI(r3, r4));
                    }
                }
                C247233fz BQv = r1.BQv();
                if (BQv != null) {
                    BQv.Eqk(A09);
                    BQv.ETR(list2);
                }
            }
        } else if (this instanceof C266384Yr) {
            0qQ.A0B(list2, 0);
            GI2 gi2 = ((C266384Yr) this).A00;
            for (C52016GBn gBn : gi2.A0F) {
                C267324bN r32 = gi2.A01;
                if (r32 != null) {
                    for (JRF D7O : gBn.A0I) {
                        D7O.D7O(r32, list2);
                    }
                }
            }
        }
    }

    public final void onDrawnToSurface() {
        if (this instanceof C266384Yr) {
            GI2 gi2 = ((C266384Yr) this).A00;
            if (gi2.A07 != null) {
                for (C52016GBn gBn : gi2.A0F) {
                    for (JRJ DAz : gBn.A0J) {
                        DAz.DAz(C52016GBn.A01(gBn).A03());
                    }
                }
            }
        }
    }

    public final void onLoop(int i) {
        if (this instanceof C232722uK) {
            for (AnonymousClass2xT r0 : ((C232722uK) this).A0R) {
                if (r0 != null) {
                    r0.DxY();
                }
            }
        } else if (this instanceof C266384Yr) {
            GI2 gi2 = ((C266384Yr) this).A00;
            for (C52016GBn gBn : gi2.A0F) {
                C267324bN r02 = gi2.A01;
                if (r02 != null) {
                    gBn.A0J(r02, i);
                }
            }
        }
    }

    public void onPrepare(C263754Nf r5) {
        if (this instanceof C232722uK) {
            0qQ.A0B(r5, 0);
            for (C232702uH DYx : ((C232722uK) this).A0P) {
                DYx.DYx((1Xj) r5.A03, r5.A01);
            }
        } else if (this instanceof C266384Yr) {
            GI2 gi2 = ((C266384Yr) this).A00;
            for (C52016GBn gBn : gi2.A0F) {
                C267324bN r0 = gi2.A01;
                if (r0 != null) {
                    gBn.A0G(r0);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r4 = (X.C232722uK) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onProgressStateChanged(boolean r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C266384Yr
            if (r0 == 0) goto L_0x001f
            r0 = r7
            X.4Yr r0 = (X.C266384Yr) r0
            X.GI2 r2 = r0.A00
            java.util.Set r0 = r2.A0F
            java.util.Iterator r1 = r0.iterator()
        L_0x000f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r1.next()
            X.GBn r0 = (X.C52016GBn) r0
            r0.A0P(r2, r8)
            goto L_0x000f
        L_0x001f:
            boolean r0 = r7 instanceof X.C232722uK
            if (r0 == 0) goto L_0x005a
            r4 = r7
            X.2uK r4 = (X.C232722uK) r4
            X.4Ne r6 = r4.A02
            if (r6 == 0) goto L_0x005a
            X.3V3 r0 = r6.A08
            if (r0 == 0) goto L_0x005a
            X.3TN r2 = r0.B5Y()
            if (r2 == 0) goto L_0x005a
            r5 = 0
            X.4M3 r3 = r4.A05
            if (r8 == 0) goto L_0x005b
            boolean r0 = r4.A0W
            if (r0 == 0) goto L_0x009e
            if (r3 == 0) goto L_0x009e
            int r1 = r3.AzN()
            int r0 = r3.getCurrentPositionMs()
            int r1 = r1 - r0
            r2.EiM(r1, r5)
            java.lang.Object r1 = r6.A03
            X.1Xj r1 = (X.1Xj) r1
            X.3TO r0 = X.AnonymousClass3TO.LOADING_ANIMATE_TIMER
            X.C232722uK.A04(r1, r4, r2, r0)
            int r0 = r3.getCurrentPositionMs()
        L_0x0058:
            r6.A04 = r0
        L_0x005a:
            return
        L_0x005b:
            if (r3 == 0) goto L_0x0091
            int r3 = r3.getCurrentPositionMs()
        L_0x0061:
            boolean r0 = r4.A0W
            r1 = 3000(0xbb8, float:4.204E-42)
            if (r0 == 0) goto L_0x006f
            int r0 = r6.A04
            if (r0 < 0) goto L_0x006f
            int r0 = r3 - r0
            if (r0 < r1) goto L_0x0075
        L_0x006f:
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x0093
            if (r3 >= r1) goto L_0x0093
        L_0x0075:
            java.lang.Object r1 = r6.A03
            X.1Xj r1 = (X.1Xj) r1
            X.3TO r0 = X.AnonymousClass3TO.TIMER
            X.C232722uK.A04(r1, r4, r2, r0)
            X.4M3 r0 = r4.A05
            if (r0 == 0) goto L_0x008f
            int r1 = r0.AzN()
            int r0 = r0.getCurrentPositionMs()
            int r1 = r1 - r0
        L_0x008b:
            r2.EiM(r1, r5)
            return
        L_0x008f:
            r1 = 0
            goto L_0x008b
        L_0x0091:
            r3 = 0
            goto L_0x0061
        L_0x0093:
            java.lang.Object r1 = r6.A03
            X.1Xj r1 = (X.1Xj) r1
            X.3TO r0 = X.AnonymousClass3TO.HIDDEN
            X.C232722uK.A04(r1, r4, r2, r0)
            r0 = -1
            goto L_0x0058
        L_0x009e:
            java.lang.Object r1 = r6.A03
            X.1Xj r1 = (X.1Xj) r1
            X.3TO r0 = X.AnonymousClass3TO.LOADING
            X.C232722uK.A04(r1, r4, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2uL.onProgressStateChanged(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r0.booleanValue() == false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onProgressUpdate(int r20, int r21, boolean r22) {
        /*
            r19 = this;
            r1 = r19
            r7 = r20
            boolean r0 = r1 instanceof X.C266384Yr
            r4 = r21
            if (r0 == 0) goto L_0x002b
            r0 = r1
            X.4Yr r0 = (X.C266384Yr) r0
            X.GI2 r3 = r0.A00
            java.util.Set r0 = r3.A0F
            java.util.Iterator r2 = r0.iterator()
        L_0x0015:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r1 = r2.next()
            X.GBn r1 = (X.C52016GBn) r1
            X.4bN r0 = r3.A01
            if (r0 == 0) goto L_0x0015
            r5 = r22
            r1.A0K(r0, r7, r4, r5)
            goto L_0x0015
        L_0x002b:
            boolean r0 = r1 instanceof X.C232722uK
            if (r0 == 0) goto L_0x01c3
            r6 = r1
            X.2uK r6 = (X.C232722uK) r6
            X.4Ne r5 = r6.A02
            if (r5 == 0) goto L_0x01c3
            X.3V3 r3 = r5.A08
            if (r3 == 0) goto L_0x01c3
            java.lang.Object r13 = r5.A03
            X.1Xj r13 = (X.1Xj) r13
            if (r13 == 0) goto L_0x01c3
            r1 = r4
            X.1Xy r0 = r13.A0C
            java.lang.Boolean r0 = r0.BuV()
            if (r0 == 0) goto L_0x0051
            boolean r0 = r0.booleanValue()
            r2 = 15000(0x3a98, float:2.102E-41)
            if (r0 != 0) goto L_0x0054
        L_0x0051:
            r2 = 60000(0xea60, float:8.4078E-41)
        L_0x0054:
            boolean r0 = r13.A5I()
            if (r0 == 0) goto L_0x005e
            if (r2 <= r4) goto L_0x005d
            r2 = r4
        L_0x005d:
            r1 = r2
        L_0x005e:
            X.3TN r0 = r3.B5Y()
            if (r0 == 0) goto L_0x0067
            r0.FLB(r7, r1)
        L_0x0067:
            java.util.List r0 = r6.A0R
            java.util.Iterator r2 = r0.iterator()
        L_0x006d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007d
            java.lang.Object r0 = r2.next()
            X.2xT r0 = (X.AnonymousClass2xT) r0
            r0.Dy1(r13, r3, r7, r4)
            goto L_0x006d
        L_0x007d:
            X.3yi r2 = r3.BRL()
            if (r2 == 0) goto L_0x00a2
            X.3oV r0 = r2.A00
            if (r0 != 0) goto L_0x0091
            java.lang.String r0 = "stubHolder"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0091:
            boolean r0 = r0.CVM()
            if (r0 == 0) goto L_0x00a2
            X.0eM r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r0.setProgress(r7)
        L_0x00a2:
            X.3v8 r8 = r3.B5X()
            if (r8 == 0) goto L_0x01c3
            int r0 = r5.A05
            r14 = r7
            if (r7 < r0) goto L_0x00af
            int r14 = r20 - r0
        L_0x00af:
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0122
            com.instagram.common.session.UserSession r4 = r6.A0K
            X.4DU r0 = r5.A0E
            r0.getModuleName()
            int r0 = r5.A05
            int r1 = r1 - r0
            long r2 = (long) r1
            long r9 = (long) r14
            r12 = 0
            X.0qQ.A0B(r4, r12)
            X.0Tu r11 = X.0Tu.A06
            r0 = 36594611717998381(0x82029b0025072d, double:3.2059180329115E-306)
            long r17 = X.182.A01(r11, r4, r0)
            r15 = 1000(0x3e8, double:4.94E-321)
            long r17 = r17 * r15
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x0122
            r0 = 36594611717932844(0x82029b0024072c, double:3.205918032870054E-306)
            long r1 = X.182.A01(r11, r4, r0)
            long r1 = r1 * r15
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0122
            boolean r0 = r13.A5h()
            if (r0 != 0) goto L_0x0122
            X.1Av r0 = X.1Au.A00(r4)
            X.0xa r3 = r0.A01
            java.lang.String r0 = "fullscreen_video_hint_num_views"
            int r1 = r3.getInt(r0, r12)
            r0 = 3
            if (r1 >= r0) goto L_0x0122
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "fullscreen_video_hint_last_opened_time"
            r0 = 0
            long r0 = r3.getLong(r2, r0)
            long r9 = r9 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 7
            long r1 = r2.toMillis(r0)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0122
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313136741156652(0x81029b0023072c, double:3.0279121241480325E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0122
            r0 = 1
            r5.A0B = r0
        L_0x0122:
            X.4Ne r10 = r6.A02
            r4 = 0
            if (r10 == 0) goto L_0x0198
            boolean r0 = r10.A0B
            if (r0 == 0) goto L_0x0198
            boolean r0 = r10.A0A
            if (r0 != 0) goto L_0x0198
            long r2 = (long) r14
            com.instagram.common.session.UserSession r9 = r6.A0K
            X.0qQ.A0B(r9, r4)
            X.0Tu r11 = X.0Tu.A06
            r0 = 36594611717932844(0x82029b0024072c, double:3.205918032870054E-306)
            long r11 = X.182.A01(r11, r9, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0198
            int r0 = r10.A01
            if (r0 != 0) goto L_0x0198
            X.1Av r2 = X.1Au.A00(r9)
            long r0 = java.lang.System.currentTimeMillis()
            X.0xa r9 = r2.A01
            X.0xY r3 = r9.AR4()
            java.lang.String r2 = "fullscreen_video_hint_last_seen_time"
            r3.E5c(r2, r0)
            r3.apply()
            X.0xY r2 = r9.AR4()
            java.lang.String r1 = "fullscreen_video_hint_num_views"
            int r0 = r9.getInt(r1, r4)
            int r0 = r0 + 1
            r2.E5Z(r1, r0)
            r2.apply()
            r3 = 1
            r5.A0A = r3
            int r0 = r5.A01
            int r0 = r0 + 1
            r5.A01 = r0
            r5.A00 = r7
            r2 = 2131238302(0x7f081d9e, float:1.8092879E38)
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r1 = r8.A01()
            android.content.Context r0 = r8.A00
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            r1.setIcon(r0)
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = r8.A01()
            r0.setVisibility(r4)
            X.C256043v8.A00(r8, r3)
        L_0x0198:
            X.4Ne r1 = r6.A02
            if (r1 == 0) goto L_0x01c3
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x01c3
            int r0 = r1.A00
            if (r0 < 0) goto L_0x01c3
            int r7 = r20 - r0
            long r1 = (long) r7
            com.instagram.common.session.UserSession r3 = r6.A0K
            X.0qQ.A0B(r3, r4)
            X.0Tu r0 = X.0Tu.A06
            r6 = 36594611717801771(0x82029b0022072b, double:3.205918032787163E-306)
            long r9 = X.182.A01(r0, r3, r6)
            r6 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r6
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c3
            r5.A0A = r4
            X.C256043v8.A00(r8, r4)
        L_0x01c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2uL.onProgressUpdate(int, int, boolean):void");
    }

    public void onStopVideo(String str, boolean z) {
        1Xj r1;
        AnonymousClass3TO r0;
        int i;
        AnonymousClass4UR r02;
        SlideInAndOutIconView A01;
        SlideInAndOutIconView A012;
        if (this instanceof C266384Yr) {
            0qQ.A0B(str, 0);
            GI2 gi2 = ((C266384Yr) this).A00;
            Runnable runnable = gi2.A09;
            if (runnable != null) {
                runnable.run();
            }
            gi2.A09 = null;
            if (gi2.A05 != null && str.equals("fragment_paused")) {
                Iterator it = gi2.A0F.iterator();
                while (it.hasNext()) {
                    it.next();
                    AnonymousClass4M3 r03 = gi2.A06;
                    if (r03 != null) {
                        r03.getCurrentPositionMs();
                    }
                }
            }
        } else if (this instanceof C232722uK) {
            C232722uK r4 = (C232722uK) this;
            0qQ.A0B(str, 0);
            0nY.A00().ATE(new C292695jN(r4));
            C263744Ne r7 = r4.A02;
            if (r7 != null) {
                AnonymousClass3V3 r5 = r7.A08;
                if (r5 != null) {
                    AnonymousClass3TS Adf = r5.Adf();
                    if (!(Adf == null || (A012 = Adf.A01()) == null)) {
                        A012.A01();
                    }
                    C256043v8 B5X = r5.B5X();
                    if (!(B5X == null || (A01 = B5X.A01()) == null)) {
                        A01.A01();
                    }
                    AnonymousClass3W1 BQq = r5.BQq();
                    if (!(BQq == null || (r02 = BQq.A0s) == null)) {
                        r02.A01();
                    }
                    if (z) {
                        AnonymousClass3TN B5Y = r5.B5Y();
                        if (B5Y != null) {
                            if (r4.A0T) {
                                r1 = (1Xj) r7.A03;
                                if ("error".equals(str)) {
                                    r0 = AnonymousClass3TO.RETRY;
                                } else if (r4.A0W) {
                                    r0 = AnonymousClass3TO.AUTOPLAY_USING_TIMER;
                                } else {
                                    r0 = AnonymousClass3TO.AUTOPLAY;
                                }
                            } else {
                                boolean z2 = r4.A0W;
                                if (z2) {
                                    AnonymousClass4M3 r04 = r4.A05;
                                    if (r04 != null) {
                                        i = r04.AzN() - r04.getCurrentPositionMs();
                                    } else {
                                        i = 0;
                                    }
                                    B5Y.EiM(i, false);
                                }
                                r1 = (1Xj) r7.A03;
                                if (z2) {
                                    r0 = AnonymousClass3TO.LOADING_ANIMATE_TIMER;
                                } else {
                                    r0 = AnonymousClass3TO.LOADING;
                                }
                            }
                            C232722uK.A04(r1, r4, B5Y, r0);
                        }
                        View BG1 = r5.BG1();
                        if (BG1 != null) {
                            BG1.clearAnimation();
                            BG1.setVisibility(0);
                        }
                    }
                }
                for (C232702uH r6 : r4.A0P) {
                    AnonymousClass4M3 r52 = r4.A05;
                    if (r52 != null) {
                        r6.DnU(C232722uK.A00(r4), r52.getCurrentPositionMs(), ((AnonymousClass4M1) r52).A03, r52.AzN());
                    }
                }
                r4.A02 = null;
            }
        }
    }

    public void onStopped(C263754Nf r11, int i) {
        File A01;
        if (this instanceof C266384Yr) {
            for (C52016GBn A0C : ((C266384Yr) this).A00.A0F) {
                A0C.A0C();
            }
        } else if (this instanceof C232722uK) {
            C232722uK r5 = (C232722uK) this;
            0qQ.A0B(r11, 0);
            C263744Ne r112 = (C263744Ne) r11;
            1Xj r7 = (1Xj) r112.A03;
            AnonymousClass3V3 r6 = r112.A08;
            UserSession userSession = r5.A0K;
            boolean z = !182.A06(0Tu.A05, userSession, 36319325786741888L);
            if (!(r7 == null || r6 == null || !z)) {
                View BG1 = r6.BG1();
                String A02 = AnonymousClass4WY.A02(userSession, r7);
                if (!(!r112.A0C || BG1 == null || A02 == null)) {
                    String id = r7.getId();
                    Object tag = BG1.getTag(R.id.key_media_id);
                    Object obj = null;
                    if (tag instanceof String) {
                        obj = tag;
                    }
                    if (0qQ.A0K(id, obj) && (A01 = AnonymousClass4WY.A01(r5.A0H, userSession, A02)) != null) {
                        Uri fromFile = Uri.fromFile(A01);
                        0qQ.A07(fromFile);
                        r6.Epi(r112.A0E, C253833rU.A00(fromFile, -1, -1), true);
                    }
                }
            }
            Runnable runnable = r5.A07;
            if (runnable != null) {
                runnable.run();
            }
            r5.A07 = null;
        }
    }

    public void onSurfaceTextureUpdated(C263754Nf r6) {
        C52058GDe gDe;
        if (this instanceof C266384Yr) {
            GI2 gi2 = ((C266384Yr) this).A00;
            if (gi2.A07 != null) {
                Integer num = gi2.A08;
                if (num == AnonymousClass05K.A01) {
                    gi2.A08 = AnonymousClass05K.A0C;
                } else if (num == AnonymousClass05K.A0C) {
                    for (C52016GBn gBn : gi2.A0F) {
                        C267324bN r1 = gi2.A01;
                        if (!(r1 == null || (gDe = gi2.A02) == null)) {
                            gBn.A0L(r1, gDe, gi2);
                        }
                    }
                }
            }
        }
    }

    public final void onVideoDownloading(C263754Nf r6) {
        if (this instanceof C232722uK) {
            C232722uK r4 = (C232722uK) this;
            0qQ.A0B(r6, 0);
            C263744Ne r62 = (C263744Ne) r6;
            AnonymousClass3V3 r0 = r62.A08;
            if (r0 != null) {
                AnonymousClass3TN B5Y = r0.B5Y();
                if (r4.A0W) {
                    AnonymousClass4M3 r02 = r4.A05;
                    if (r02 != null) {
                        if (B5Y != null) {
                            B5Y.EiM(r02.AzN() - r02.getCurrentPositionMs(), false);
                            C232722uK.A04((1Xj) r62.A03, r4, B5Y, AnonymousClass3TO.LOADING_ANIMATE_TIMER);
                        }
                        r62.A04 = r62.A05;
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                } else if (B5Y != null) {
                    C232722uK.A04((1Xj) r62.A03, r4, B5Y, AnonymousClass3TO.LOADING);
                }
            }
        }
    }

    public void onVideoPlayerError(C263754Nf r5, String str) {
        if (this instanceof C232722uK) {
            C232722uK r3 = (C232722uK) this;
            0qQ.A0B(r5, 0);
            1Xj r2 = (1Xj) r5.A03;
            if (r2 != null) {
                if (r2.A4p()) {
                    0KC.A03(C232722uK.class, AnonymousClass000.A00(2353));
                    r2.A0M = null;
                }
                for (C232702uH Dxf : r3.A0P) {
                    Dxf.Dxf(r2, str);
                }
            }
        } else if (this instanceof C266384Yr) {
            for (C52016GBn A0Q : ((C266384Yr) this).A00.A0F) {
                A0Q.A0Q(str);
            }
        }
    }

    public void onVideoPrepared(C263754Nf r10, boolean z) {
        FrameLayout A00;
        View BQB;
        AnonymousClass3TS Adf;
        C263744Ne r2;
        if (this instanceof C266384Yr) {
            GI2 gi2 = ((C266384Yr) this).A00;
            for (C52016GBn gBn : gi2.A0F) {
                C267324bN r0 = gi2.A01;
                if (r0 != null) {
                    gBn.A0M(r0, gi2, z);
                }
            }
        } else if (this instanceof C232722uK) {
            C232722uK r5 = (C232722uK) this;
            0qQ.A0B(r10, 0);
            AnonymousClass4M3 r3 = r5.A05;
            if (!(r3 == null || (r2 = r5.A02) == null)) {
                C232722uK.A06(r5, -5, r2.A00);
                if (r5.A0D) {
                    r2.A07 = r3.getCurrentPositionMs();
                }
            }
            for (C232702uH Dxw : r5.A0P) {
                Dxw.Dxw((1Xj) r10.A03, z);
            }
            AnonymousClass3V3 r7 = ((C263744Ne) r10).A08;
            1Xj A002 = C232722uK.A00(r5);
            AnonymousClass3W1 A0H = r5.A0H();
            SlideInAndOutIconView slideInAndOutIconView = null;
            if (!(r7 == null || (Adf = r7.Adf()) == null)) {
                slideInAndOutIconView = Adf.A01();
            }
            if (!(A002 == null || slideInAndOutIconView == null || slideInAndOutIconView.getVisibility() == 0 || !C232722uK.A0E(A002, r5))) {
                C232722uK.A03(A002, A0H, r5);
            }
            if (r7 != null) {
                if (A0H != null && A0H.A0o == 1sy.A0U) {
                    Context context = r5.A0H;
                    if (2eO.A00(context) && (BQB = r7.BQB()) != null) {
                        2eQ.A08(BQB, context.getString(2131971756));
                    }
                }
                AnonymousClass3TS Adf2 = r7.Adf();
                if (!(Adf2 == null || (A00 = Adf2.A00()) == null)) {
                    if (!A00.hasOnClickListeners()) {
                        r5.A0P(A00, A0H);
                    }
                    2eS.A04(A00, AnonymousClass05K.A01);
                    if (A002 != null) {
                        Context context2 = A00.getContext();
                        if (context2 instanceof Activity) {
                            Resources resources = A00.getResources();
                            if (A002.A5I() && !1Au.A00(r5.A0K).A01.getBoolean(AnonymousClass000.A00(3317), false)) {
                                int i = 2131964030;
                                if (r5.A0X()) {
                                    i = 2131964029;
                                }
                                String string = resources.getString(i);
                                0qQ.A07(string);
                                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.igtv_feed_preview_sound_tooltip_above_anchor_point_y);
                                C226262fy r32 = C226262fy.ABOVE_ANCHOR;
                                C54391HBi hBi = new C54391HBi(r5);
                                0qQ.A0C(context2, "null cannot be cast to non-null type android.app.Activity");
                                AnonymousClass5Gt r1 = new AnonymousClass5Gt((Activity) context2, new C315476jx((CharSequence) string));
                                r1.A04(A00, 0, dimensionPixelSize, true);
                                r1.A0B = true;
                                r1.A06(r32);
                                r1.A0A = false;
                                r1.A04 = hBi;
                                r1.A00().A07((UserSession) null);
                            }
                        }
                    }
                }
            }
            UserSession userSession = r5.A0K;
            0qQ.A0B(userSession, 0);
            r5.A09 = AnonymousClass3WS.A06(userSession);
        }
    }

    public void onVideoStartedPlaying(C263754Nf r12) {
        AnonymousClass3V3 r0;
        View BG1;
        Integer num;
        if (this instanceof C266384Yr) {
            0qQ.A0B(r12, 0);
            C263764Ng r02 = r12.A02;
            boolean z = r02.A02;
            C257183wz r5 = r02.A01;
            0qQ.A06(r5);
            C257183wz r4 = r02.A00;
            0qQ.A06(r4);
            boolean z2 = r02.A03;
            for (C52016GBn gBn : ((C266384Yr) this).A00.A0F) {
                synchronized (gBn) {
                    C376449Ia r8 = new C376449Ia(r5, r4, z, z2);
                    for (JRJ DyX : gBn.A0J) {
                        DyX.DyX(r8, C52016GBn.A01(gBn).A03());
                    }
                    C52019GBq A01 = C52016GBn.A01(gBn);
                    C267324bN A03 = A01.A03.A03(C52016GBn.A01(gBn).A03());
                    if (A03 != null) {
                        if (A03.A02 != null) {
                            C267324bN A00 = C52016GBn.A00(gBn);
                            if (A00 != null) {
                                num = C52016GBn.A01(gBn).A04(A00).A0H;
                            } else {
                                num = null;
                            }
                            for (JRF Dxm : gBn.A0I) {
                                Dxm.Dxm(A03, num, C52016GBn.A01(gBn).A03());
                            }
                        }
                        I4M i4m = gBn.A02;
                        if (i4m != null) {
                            i4m.A02(A03.getId());
                        }
                        C66902Mel A002 = C66903Mem.A00(gBn.A0E);
                        1Xv r03 = 1Xj.A0h;
                        A002.A00(1Xv.A06(A03.getId()));
                    }
                }
            }
        } else if (this instanceof C232722uK) {
            C232722uK r6 = (C232722uK) this;
            0qQ.A0B(r12, 0);
            if (r6.A0V && (r12 instanceof C263744Ne) && (r0 = ((C263744Ne) r12).A08) != null && (BG1 = r0.BG1()) != null) {
                BG1.setVisibility(8);
            }
            1Xj r3 = (1Xj) r12.A03;
            if (r3 != null) {
                1Xj A1c = r3.A1c(r3.A0w());
                if (A1c != null) {
                    r3 = A1c;
                }
                for (C232702uH DyO : r6.A0P) {
                    C257183wz r04 = r12.A02.A00;
                    0qQ.A06(r04);
                    DyO.DyO(r04, r3);
                }
                String id = r3.getId();
                if (id != null) {
                    UserSession userSession = r6.A0K;
                    AnonymousClass4DU r2 = r6.A0L.A00;
                    0qQ.A0B(userSession, 0);
                    ClipsViewerSource A003 = AnonymousClass5M0.A00(r2);
                    if (A003 == ClipsViewerSource.FEED_TIMELINE || A003 == ClipsViewerSource.FEED_TIMELINE_FOLLOWING) {
                        C270754hF A012 = C243473Yx.A01(A003, userSession, r2.getModuleName());
                        if (A012 instanceof C270744hE) {
                            ((C270744hE) A012).Cn2(userSession, id);
                        }
                    }
                }
            }
        }
    }

    public final void onVideoSwitchToWarmupPlayer(C263754Nf r6) {
        if (this instanceof C266384Yr) {
            for (C52016GBn gBn : ((C266384Yr) this).A00.A0F) {
                for (JRJ Dya : gBn.A0J) {
                    Dya.Dya(C52016GBn.A01(gBn).A03());
                }
            }
        }
    }

    public void onVideoViewPrepared(C263754Nf r10) {
        AnonymousClass3W1 r2;
        AnonymousClass3TO r0;
        AnonymousClass3TN B5Y;
        if (this instanceof C232722uK) {
            C232722uK r3 = (C232722uK) this;
            0qQ.A0B(r10, 0);
            C263744Ne r102 = (C263744Ne) r10;
            AnonymousClass3V3 r8 = r102.A08;
            if (r8 != null) {
                r2 = r8.BQq();
            } else {
                r2 = null;
            }
            boolean z = false;
            if (r2 != r102.A09) {
                z = true;
            }
            if (!z) {
                AnonymousClass4M3 r6 = r3.A05;
                C263744Ne r5 = r3.A02;
                if (!(r5 == null || r6 == null)) {
                    boolean z2 = false;
                    if (r6.AzN() - r5.A05 > 15500) {
                        z2 = true;
                    }
                    r3.A0F = z2;
                }
                if (r8 != null) {
                    View BG1 = r8.BG1();
                    1Xj A00 = C232722uK.A00(r3);
                    if (BG1 != null && (A00 == null || !C232722uK.A0D(A00, r3))) {
                        BG1.setVisibility(8);
                    }
                    r8.EEI(R.id.listener_id_for_media_video_binder);
                    AnonymousClass3TN B5Y2 = r8.B5Y();
                    if (B5Y2 == null) {
                        return;
                    }
                    if (!r3.A0F || r6 == null || r5 == null) {
                        if (A00 == null || !A00.A5G() || A00.CcK() || !C243223Xx.A02(A00)) {
                            r0 = AnonymousClass3TO.HIDDEN;
                        } else {
                            r0 = AnonymousClass3TO.CLIPS;
                        }
                        C232722uK.A04(A00, r3, B5Y2, r0);
                        return;
                    }
                    C232722uK.A04(A00, r3, B5Y2, AnonymousClass3TO.TIMER);
                    B5Y2.EiM(r6.AzN() - r5.A05, false);
                }
            } else if (r8 != null && (B5Y = r8.B5Y()) != null) {
                B5Y.setVisibility(8);
            }
        } else if (this instanceof C266384Yr) {
            ((C266384Yr) this).A00.A08 = AnonymousClass05K.A01;
        }
    }
}
