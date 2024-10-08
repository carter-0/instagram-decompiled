package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;

/* renamed from: X.85f  reason: invalid class name and case insensitive filesystem */
public final class C3505685f extends C301515zR {
    public final /* synthetic */ AnonymousClass85X A00;

    public final void D1n(MotionEvent motionEvent, View view) {
        View view2;
        0qQ.A0B(view, 0);
        0qQ.A0B(motionEvent, 1);
        C3505185a r4 = this.A00.A0T;
        if (view == r4.A00) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                r4.A01.A06(1.0d);
            } else if ((actionMasked == 1 || actionMasked == 3) && (view2 = r4.A00) != null) {
                view2.postDelayed(new AnonymousClass9W8(r4), 200);
            }
        }
    }

    public final void DKQ(ReboundHorizontalScrollView reboundHorizontalScrollView, int i, int i2) {
        0qQ.A0B(reboundHorizontalScrollView, 0);
        if (this.A00.A0J) {
            A00(reboundHorizontalScrollView, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
        r1 = r8.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DhW(X.C301495zP r11, X.C301495zP r12, com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView r13) {
        /*
            r10 = this;
            r5 = 0
            r0 = 2
            X.0qQ.A0B(r12, r0)
            X.5zP r0 = X.C301495zP.IDLE
            if (r12 != r0) goto L_0x00ae
            int r0 = r13.getCurrentChildIndex()
            r10.A00(r13, r0)
            X.85X r7 = r10.A00
            X.8Yz r0 = r7.A0S
            X.80m r0 = r0.A08
            java.lang.Object r6 = r0.A00
            X.4yO r6 = (X.C279284yO) r6
            com.instagram.common.session.UserSession r3 = r7.A0R
            X.1Av r9 = X.1Au.A00(r3)
            boolean r0 = r6 instanceof X.AnonymousClass80K
            r2 = 1
            if (r0 == 0) goto L_0x0062
            X.0s0 r8 = r9.A4h
            X.0YZ[] r4 = X.1Av.A8a
            r1 = 523(0x20b, float:7.33E-43)
            r0 = r4[r1]
            java.lang.Object r0 = r8.CDM(r9, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0062
            r1 = r4[r1]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r8.Epx(r9, r0, r1)
            com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView r8 = r7.A0U
            X.0qQ.A0B(r6, r5)
            java.util.List r0 = r8.A01
            int r4 = r0.indexOf(r6)
            r0 = -1
            if (r4 == r0) goto L_0x0062
            com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView r1 = r8.A06
            android.view.View r0 = r1.getChildAt(r4)
            if (r0 == 0) goto L_0x0062
            r1.removeView(r0)
            android.widget.TextView r0 = r8.A02(r6)
            r1.addView(r0, r4)
        L_0x0062:
            X.4yO r0 = r7.A05
            if (r0 == r6) goto L_0x00aa
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0075
            X.27r r0 = X.27p.A01(r3)
            X.29f r1 = r0.A0A
            X.4yO r0 = r7.A05
            r1.A0c(r0)
        L_0x0075:
            float r1 = r7.A00
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x007e
            r2 = 0
        L_0x007e:
            X.C59895JbK.A0G(r3, r6, r2)
            X.8jC r0 = X.C363138jC.A00
            X.JbO r2 = X.JZM.A00(r3)
            if (r6 != r0) goto L_0x00d1
            r0 = 1
            r2.A03 = r0
            X.28D r0 = X.28D.A0h
            r2.A07(r0)
        L_0x0091:
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r6 instanceof X.C363138jC
            if (r0 == 0) goto L_0x00aa
            X.JaN r4 = X.JW1.A00(r3)
            X.29E r3 = r4.A0B
            long r1 = r4.A00
            r0 = 288430453(0x11311975, float:1.3970683E-28)
            long r0 = r3.A02(r0, r1)
            r4.A00 = r0
        L_0x00aa:
            r7.A05 = r6
            r7.A0F = r5
        L_0x00ae:
            X.85X r2 = r10.A00
            X.8Yz r0 = r2.A0S
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            int r1 = X.AnonymousClass85X.A00(r0, r2)
            if (r1 < 0) goto L_0x00c8
            java.util.ArrayList r0 = X.AnonymousClass85X.A01(r2)
            int r0 = r0.size()
            if (r1 < r0) goto L_0x00d0
        L_0x00c8:
            java.lang.String r2 = "CameraDestinationPickerController"
            java.lang.String r1 = "Intended camera destination does not exist in the list of available destinations"
            r0 = 0
            X.0kD.A0A(r2, r1, r0)
        L_0x00d0:
            return
        L_0x00d1:
            r2.A03 = r5
            X.28t r1 = r2.A01
            r0 = 4
            r2.A09(r1, r0)
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3505685f.DhW(X.5zP, X.5zP, com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView):void");
    }

    public C3505685f(AnonymousClass85X r1) {
        this.A00 = r1;
    }

    private final void A00(ReboundHorizontalScrollView reboundHorizontalScrollView, int i) {
        C279284yO r3;
        AnonymousClass85X r4 = this.A00;
        if (r4.A0Q.isAdded()) {
            int i2 = reboundHorizontalScrollView.A03;
            if ((i2 == -1 || i2 == i || reboundHorizontalScrollView.A07 != C301495zP.SETTLING) && i < AnonymousClass85X.A01(r4).size() && (r3 = (C279284yO) 00k.A0O(AnonymousClass85X.A01(r4), i)) != null) {
                Class<?> cls = r3.getClass();
                C357638Yz r1 = r4.A0S;
                if (cls != r1.A08.A00.getClass()) {
                    r4.A0F = true;
                    r1.A0I(r3);
                    r4.A0T.A00 = reboundHorizontalScrollView.getChildAt(i);
                }
            }
        }
    }

    public final void DhI(ReboundHorizontalScrollView reboundHorizontalScrollView, float f, int i, int i2) {
        ReboundHorizontalScrollView reboundHorizontalScrollView2 = reboundHorizontalScrollView;
        int childCount = reboundHorizontalScrollView2.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            reboundHorizontalScrollView2.getChildAt(i3).setAlpha(0.5f);
            View childAt = reboundHorizontalScrollView2.getChildAt(i3);
            0qQ.A07(childAt);
            C340117kj.A00(childAt, 0.5f);
        }
        float f2 = f;
        float A04 = (float) AnonymousClass37Q.A04((double) (1.0f - f), 0.0d, 1.0d, 0.5d, 1.0d);
        float A042 = (float) AnonymousClass37Q.A04((double) f2, 0.0d, 1.0d, 0.5d, 1.0d);
        int i4 = i;
        View childAt2 = reboundHorizontalScrollView2.getChildAt(i4);
        int i5 = i2;
        View childAt3 = reboundHorizontalScrollView2.getChildAt(i5);
        if (!(i4 == i5 || childAt3 == null)) {
            childAt3.setAlpha(A042);
            C340117kj.A00(childAt3, A042);
        }
        if (childAt2 != null) {
            childAt2.setAlpha(A04);
            C340117kj.A00(childAt2, A04);
        }
        for (AnonymousClass8F4 r0 : this.A00.A0Z) {
            AnonymousClass8E8 r3 = r0.A00;
            AnonymousClass8EA r2 = r3.A00;
            if (r2 != null) {
                r2.A06(i4, i5, f2);
                if (f == 0.0f && !r3.A0F) {
                    r3.A0F = true;
                    0nA.A0p(r2, new C340127kk(r3));
                }
            }
        }
    }

    public final void Dqc(View view, int i) {
        ReboundHorizontalScrollView reboundHorizontalScrollView = this.A00.A0U.A06;
        DsU(reboundHorizontalScrollView);
        A00(reboundHorizontalScrollView, i);
    }

    public final void DsU(ReboundHorizontalScrollView reboundHorizontalScrollView) {
        this.A00.A0J = false;
    }

    public final void Dse(ReboundHorizontalScrollView reboundHorizontalScrollView) {
        this.A00.A0J = true;
    }
}
