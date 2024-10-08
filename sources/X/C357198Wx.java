package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.8Wx  reason: invalid class name and case insensitive filesystem */
public final class C357198Wx implements AnonymousClass88I {
    public float A00;
    public AnonymousClass8WX A01;
    public final int A02;
    public final UserSession A03;
    public final AnonymousClass8WK A04;
    public final ClipsCreationViewModel A05;
    public final boolean A06;
    public final C357638Yz A07;
    public final AnonymousClass8BA A08;
    public final C352888Fl A09;
    public final C3499582p A0A;
    public final AnonymousClass80U A0B;
    public final C357218Wz A0C;
    public final C357218Wz A0D;

    private C362868ic A00() {
        AnonymousClass8WX r0 = this.A01;
        if (r0 == null) {
            return null;
        }
        C362868ic r02 = r0.A00().A01;
        if (r02 != null) {
            return r02;
        }
        this.A01.A00().A08();
        return this.A01.A00().A01;
    }

    private boolean A01() {
        AnonymousClass80V Atr = this.A0B.Atr();
        if (Atr == AnonymousClass80V.CLIPS_EDITOR || Atr == AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE || Atr == AnonymousClass80V.POST_CAPTURE_BOOMERANG_EDIT) {
            return true;
        }
        return false;
    }

    public final void DG3(MotionEvent motionEvent, float f, float f2, boolean z, boolean z2) {
        boolean z3;
        C314676if r0;
        C357218Wz r2;
        if (this.A0B.Ats().ordinal() == 2) {
            C3499482o r1 = this.A0A.A02;
            if (r1.A00) {
                return;
            }
            if (z) {
                if (!A01()) {
                    if (r1.A01() == C365758nd.A04) {
                        r2 = this.A0C;
                    } else {
                        r2 = this.A0D;
                    }
                    r2.DG1((double) f);
                }
            } else if (z2) {
                AnonymousClass8BA r22 = this.A08;
                if (!r22.A0a) {
                    boolean CQ0 = r22.A1M.CQ0(AnonymousClass80V.CLIPS_EDITOR);
                    if (!(r22.A0w.A08.A00 instanceof AnonymousClass80O) || !((r0 = r22.A1a) == null || ((C359318cb) r0.get()).A0u.A04 == null)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (CQ0 && z3) {
                        AnonymousClass89Y r12 = r22.A0D;
                        if (r12 instanceof ClipsTimelineEditorDrawerController) {
                            ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = (ClipsTimelineEditorDrawerController) r12;
                            0qQ.A0B(motionEvent, 1);
                            clipsTimelineEditorDrawerController.A0K = true;
                            clipsTimelineEditorDrawerController.A07 = clipsTimelineEditorDrawerController.A08;
                            C19140WMw wMw = clipsTimelineEditorDrawerController.A0C;
                            if (wMw != null) {
                                wMw.A0F.onFling((MotionEvent) null, motionEvent, 0.0f, f2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f0, code lost:
        if (r8 > (((float) r9) / 2.0f)) goto L_0x00f2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DHo(float r11, float r12, float r13, float r14, float r15, boolean r16, boolean r17) {
        /*
            r10 = this;
            X.80U r0 = r10.A0B
            X.80X r0 = r0.Ats()
            int r1 = r0.ordinal()
            r5 = 0
            r4 = 1
            if (r1 == r4) goto L_0x0048
            r0 = 2
            if (r1 != r0) goto L_0x0022
            if (r16 == 0) goto L_0x003f
            X.8BA r1 = r10.A08
            boolean r0 = r1.A23
            if (r0 == 0) goto L_0x0023
            X.8CT r0 = r1.A1A
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0023
        L_0x0021:
            r5 = 1
        L_0x0022:
            return r5
        L_0x0023:
            boolean r0 = r10.A01()
            if (r0 != 0) goto L_0x0021
            X.82p r0 = r10.A0A
            X.82o r0 = r0.A02
            X.8nd r1 = r0.A01()
            X.8nd r0 = X.C365758nd.A04
            if (r1 != r0) goto L_0x003c
            X.8Wz r0 = r10.A0C
        L_0x0037:
            boolean r5 = r0.DHp()
            return r5
        L_0x003c:
            X.8Wz r0 = r10.A0D
            goto L_0x0037
        L_0x003f:
            if (r17 == 0) goto L_0x0022
            X.8BA r0 = r10.A08
            boolean r5 = r0.A0u(r12)
            return r5
        L_0x0048:
            if (r17 == 0) goto L_0x0022
            X.8Yz r1 = r10.A07
            X.8aL r0 = X.C358088aL.A0C
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x0061
            X.8BA r0 = r10.A08
            boolean r0 = r0.A0u(r12)
            if (r0 == 0) goto L_0x0061
            goto L_0x0021
        L_0x0061:
            X.80m r0 = r1.A08
            java.lang.Object r1 = r0.A00
            X.80L r0 = X.AnonymousClass80L.A00
            if (r1 == r0) goto L_0x0022
            boolean r2 = r10.A06
            if (r2 == 0) goto L_0x008e
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r10.A05
            boolean r0 = r0.A0s()
            if (r0 == 0) goto L_0x008e
            int r0 = r10.A02
            float r0 = (float) r0
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008e
            float r1 = r10.A00
            r0 = 1000593162(0x3ba3d70a, float:0.005)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x008e
            X.8WK r2 = r10.A04
            java.lang.String r1 = "SWIPE"
            r0 = 0
            r2.DDT(r0, r1, r4)
            goto L_0x0021
        L_0x008e:
            X.8ic r0 = r10.A00()
            if (r0 == 0) goto L_0x00ab
            X.8ic r0 = r10.A00()
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00ab
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r10.A05
            boolean r0 = r0.A0s()
            if (r0 == 0) goto L_0x0021
            if (r2 != 0) goto L_0x00ab
            goto L_0x0021
        L_0x00ab:
            X.8ic r0 = r10.A00()
            if (r0 == 0) goto L_0x0022
            X.8ic r2 = r10.A00()
            X.8hI r0 = r2.A0G
            boolean r0 = r0.CUA()
            if (r0 == 0) goto L_0x0022
            float r3 = -r12
            X.2cs r7 = r2.A0E
            X.2ct r0 = r7.A09
            double r0 = r0.A00
            float r8 = (float) r0
            double r0 = (double) r3
            r7.A07(r0)
            android.view.ViewGroup r0 = r2.A09
            int r9 = r0.getHeight()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 0
            if (r0 <= 0) goto L_0x00d6
            r2 = 1
        L_0x00d6:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r6 = 0
            if (r0 >= 0) goto L_0x00dc
            r6 = 1
        L_0x00dc:
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x00e2
            r0 = 1
        L_0x00e2:
            if (r2 != 0) goto L_0x00f2
            r2 = 0
            if (r6 != 0) goto L_0x010d
            if (r0 != 0) goto L_0x0022
            float r1 = (float) r9
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x010d
        L_0x00f2:
            double r0 = (double) r9
            r7.A06(r0)
        L_0x00f6:
            com.instagram.common.session.UserSession r2 = r10.A03
            X.0qQ.A0B(r2, r5)
            r0 = 30
            X.MMT r1 = new X.MMT
            r1.<init>(r2, r0)
            java.lang.Class<X.8id> r0 = X.C362878id.class
            java.lang.Object r0 = r2.A01(r0, r1)
            X.8id r0 = (X.C362878id) r0
            r0.A00 = r4
            return r5
        L_0x010d:
            r7.A06(r2)
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357198Wx.DHo(float, float, float, float, float, boolean, boolean):boolean");
    }

    public final void DhL(float f, float f2, float f3, float f4, boolean z, boolean z2) {
        AnonymousClass8WX r0;
        C361948h5 r02;
        C357218Wz r2;
        int ordinal = this.A0B.Ats().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2 && !this.A07.A0V(C358088aL.A0p, C358088aL.A0o)) {
                C3499482o r1 = this.A0A.A02;
                if (r1.A00) {
                    return;
                }
                if (z && !A01()) {
                    if (r1.A01() == C365758nd.A04) {
                        r2 = this.A0C;
                    } else {
                        r2 = this.A0D;
                    }
                    r2.DhF((double) f);
                } else if (z2) {
                    this.A08.A0t(f2);
                }
            }
        } else if (!z2) {
        } else {
            if ((this.A07.A0V(C358088aL.A0C) && this.A08.A0t(f2)) || A00() == null) {
                return;
            }
            if (A00().A00 != 0.0f || f2 >= 0.0f || (this.A05.A0s() && this.A06)) {
                if (f2 > 0.0f && A00().A00 == 0.0f && (r0 = this.A01) != null && (r02 = (C361948h5) r0.A00().A0k.getValue()) != null) {
                    r02.A00("camera_swipe_up");
                }
                C362868ic A002 = A00();
                if (A002.A0G.CUA()) {
                    2cs r4 = A002.A0E;
                    r4.A08(r4.A09.A00 - ((double) (-f2)), true);
                }
                C352888Fl r22 = this.A09;
                if (!r22.A0I && r22.A1C.Ats() == AnonymousClass80X.PRE_CAPTURE) {
                    C352888Fl.A0E(r22, true);
                }
            }
        }
    }

    public C357198Wx(View view, View view2, UserSession userSession, C357638Yz r5, AnonymousClass8BA r6, C352888Fl r7, C3499582p r8, AnonymousClass80D r9, AnonymousClass8WK r10, AnonymousClass8WX r11, AnonymousClass80U r12, ClipsCreationViewModel clipsCreationViewModel, C353858Jp r14, C353858Jp r15, int i) {
        C357218Wz r0;
        C357218Wz r02;
        this.A09 = r7;
        this.A07 = r5;
        this.A05 = clipsCreationViewModel;
        this.A0A = r8;
        this.A0B = r12;
        this.A08 = r6;
        this.A06 = r9.A3h;
        this.A01 = r11;
        this.A02 = i;
        if (r9.A3t) {
            r14.getClass();
            r0 = new C357208Wy(view, r14);
        } else {
            r0 = C40438Ac9.A00;
        }
        this.A0C = r0;
        this.A04 = r10;
        if (r9.A3t) {
            r15.getClass();
            r02 = new C357208Wy(view2, r15);
        } else {
            r02 = C40438Ac9.A00;
        }
        this.A0D = r02;
        this.A03 = userSession;
    }

    public final void DsQ(float f, float f2) {
        float f3;
        if (A00() != null) {
            f3 = A00().A00;
        } else {
            f3 = 0.0f;
        }
        this.A00 = f3;
    }
}
