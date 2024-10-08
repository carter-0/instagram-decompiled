package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.7HM  reason: invalid class name */
public final class AnonymousClass7HM implements C252293os, C256103vE {
    public final /* synthetic */ AnonymousClass7H6 A00;

    public final /* synthetic */ void DW9(int i, int i2, boolean z) {
    }

    public final /* synthetic */ void DhK(AnonymousClass3TF r1, float f, float f2) {
    }

    public final void DhS(AnonymousClass3TF r4, AnonymousClass3TF r5) {
        0qQ.A0B(r4, 0);
        if (r4 == AnonymousClass3TF.DRAGGING) {
            AnonymousClass7H6 r1 = this.A00;
            NR3 nr3 = r1.A0H;
            if (nr3 == null) {
                0qQ.A0F("pagerAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            nr3.A04 = false;
            C74508Pw3 pw3 = r1.A0L;
            if (pw3 != null) {
                pw3.Eic(false);
            }
            OVY ovy = r1.A0K;
            if (ovy != null) {
                0nA.A0u(ovy.A02, false);
            }
        } else if (r4 == AnonymousClass3TF.IDLE) {
            AnonymousClass7H6 r2 = this.A00;
            C74508Pw3 pw32 = r2.A0L;
            if (pw32 != null) {
                pw32.Eic(true);
            }
            OVY ovy2 = r2.A0K;
            if (ovy2 != null) {
                0nA.A0u(ovy2.A02, true);
            }
            AnonymousClass7H6.A0L(r2);
        }
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final void DzE(View view) {
        OIL oil;
        0qQ.A0B(view, 0);
        Object tag = view.getTag();
        if ((tag instanceof OIL) && (oil = (OIL) tag) != null) {
            C69226Nhg nhg = oil.A0A;
            C14044Tol tol = nhg.A01;
            if (tol != null) {
                tol.A0B("finished");
            }
            nhg.A01 = null;
        }
    }

    public AnonymousClass7HM(AnonymousClass7H6 r1) {
        this.A00 = r1;
    }

    public final /* synthetic */ boolean CsC() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        r1 = r0.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r2 = r0.A0A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DVx(int r7, int r8) {
        /*
            r6 = this;
            X.7H6 r5 = r6.A00
            X.77B r0 = X.AnonymousClass7H6.A06(r5, r8)
            r4 = 1
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.A0s
            if (r0 != r4) goto L_0x0021
            X.OIL r0 = X.AnonymousClass7H6.A04(r5, r8)
            if (r0 == 0) goto L_0x0021
            X.Nhg r2 = r0.A0A
            X.Tol r1 = r2.A01
            if (r1 == 0) goto L_0x0021
            java.lang.String r0 = "horizontal_scroll"
            r1.A0A(r0)
            X.C69226Nhg.A01(r2)
        L_0x0021:
            X.77B r3 = X.AnonymousClass7H6.A06(r5, r7)
            if (r3 == 0) goto L_0x0058
            boolean r0 = r3.A0s
            if (r0 != r4) goto L_0x0055
            X.OIL r0 = X.AnonymousClass7H6.A04(r5, r7)
            if (r0 == 0) goto L_0x003d
            X.Nhg r1 = r0.A0A
            java.lang.Runnable r0 = r1.A03
            if (r0 == 0) goto L_0x003d
            r0.run()
            r0 = 0
            r1.A03 = r0
        L_0x003d:
            boolean r1 = X.AnonymousClass7H6.A0f(r5)
            X.OIL r0 = X.AnonymousClass7H6.A04(r5, r7)
            if (r1 == 0) goto L_0x006d
            if (r0 == 0) goto L_0x0055
            X.Nhg r0 = r0.A0A
            X.Tol r2 = r0.A01
            if (r2 == 0) goto L_0x0055
            java.lang.String r1 = "fragment_resumed"
            r0 = 0
            r2.A0C(r1, r0)
        L_0x0055:
            X.AnonymousClass7H6.A0P(r5, r3)
        L_0x0058:
            X.OHk r3 = r5.A0I
            if (r3 != 0) goto L_0x0066
            java.lang.String r0 = "mediaFetchController"
        L_0x005e:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0066:
            X.NR3 r0 = r5.A0H
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = "pagerAdapter"
            goto L_0x005e
        L_0x006d:
            if (r0 == 0) goto L_0x0055
            X.Nhg r0 = r0.A0A
            X.Tol r2 = r0.A01
            if (r2 == 0) goto L_0x0055
            r1 = 0
            r2.A05(r1, r1)
            java.lang.String r0 = "horizontal_scroll"
            r2.A0C(r0, r1)
            goto L_0x0055
        L_0x007f:
            int r1 = r0.getCount()
            X.3sy r2 = r3.A00
            if (r2 == 0) goto L_0x00a1
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x00a1
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x00a1
            int r1 = r1 - r4
            int r1 = r1 - r7
            r0 = 2
            if (r1 >= r0) goto L_0x00a1
            r3.A03 = r4
            X.NcJ r1 = r3.A06
            r0 = 20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B(r2, r0)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HM.DVx(int, int):void");
    }

    public final void DVz(int i) {
        boolean z;
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel;
        Integer num;
        AnonymousClass7H6 r5 = this.A00;
        AnonymousClass77B A06 = AnonymousClass7H6.A06(r5, i);
        UserSession userSession = r5.A0w;
        if (A06 != null) {
            z = 0qQ.A0K(A06.A0J, true);
        } else {
            z = false;
        }
        if (C66797Mcj.A02(userSession, z)) {
            Integer num2 = r5.A0W;
            RoundedCornerFrameLayout roundedCornerFrameLayout = null;
            if (num2 == null) {
                ReboundViewPager reboundViewPager = r5.A0C;
                if (reboundViewPager == null) {
                    0qQ.A0F("viewPager");
                    throw AnonymousClass00P.createAndThrow();
                }
                num2 = Integer.valueOf(reboundViewPager.getCurrentDataIndex());
            }
            r5.A0W = num2;
            AnonymousClass759 A08 = AnonymousClass7H6.A08(r5, i);
            if (A06 != null && (privacyMediaOverlayViewModel = A06.A01) != null && ((num = r5.A0W) == null || i != num.intValue() || r5.A0V == AnonymousClass05K.A00)) {
                if (A08 != null) {
                    A08.A04(privacyMediaOverlayViewModel, new C41567AwZ(43, A06, r5, privacyMediaOverlayViewModel), 1);
                }
                if (r5.A0h) {
                    OIL A04 = AnonymousClass7H6.A04(r5, i);
                    if (A04 != null) {
                        roundedCornerFrameLayout = A04.A0E;
                    }
                    AnonymousClass7H6.A0S(r5, roundedCornerFrameLayout);
                }
            } else if (A08 != null) {
                A08.A02();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r1 = r0.A0A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DW0(int r6) {
        /*
            r5 = this;
            X.7H6 r2 = r5.A00
            X.77B r0 = X.AnonymousClass7H6.A06(r2, r6)
            r1 = 1
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.A0s
            if (r0 != r1) goto L_0x0030
            X.OIL r0 = X.AnonymousClass7H6.A04(r2, r6)
            if (r0 == 0) goto L_0x0030
            X.Nhg r1 = r0.A0A
            X.Tol r0 = r1.A01
            if (r0 == 0) goto L_0x0030
            r4 = 0
            r0.A05(r4, r4)
            com.instagram.common.ui.base.IgTextView r3 = r1.A0E
            android.widget.SeekBar r2 = r1.A0C
            int r0 = r2.getMax()
            long r0 = (long) r0
            java.lang.String r0 = X.1G0.A02(r0)
            r3.setText(r0)
            r2.setProgress(r4)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HM.DW0(int):void");
    }

    public final void Dpz(int i, int i2) {
        IgdsMediaButton igdsMediaButton;
        String str;
        Integer num;
        AnonymousClass7H6 r4 = this.A00;
        AnonymousClass77B A06 = AnonymousClass7H6.A06(r4, i2);
        String A0A = AnonymousClass7H6.A0A(r4);
        if (!(A0A == null || A06 == null || (str = A06.A0S) == null)) {
            UserSession userSession = r4.A0w;
            1iA r0 = A06.A0I;
            if (r0 != null) {
                num = Integer.valueOf(r0.A00);
            } else {
                num = null;
            }
            String valueOf = String.valueOf(num);
            0qQ.A0B(valueOf, 3);
            0wc A02 = AnonymousClass0kN.A02(userSession);
            0Aj A002 = A02.A00(A02.A00, "direct_permanent_media_viewer_swipe");
            if (A002.isSampled()) {
                A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A0A);
                A002.AAJ("media_id", str);
                A002.AAJ("media_type", valueOf);
                A002.Cgf();
            }
        }
        OIL A04 = AnonymousClass7H6.A04(r4, i2);
        if (A04 != null && (igdsMediaButton = A04.A0D) != null) {
            igdsMediaButton.setVisibility(8);
        }
    }
}
