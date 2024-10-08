package com.instagram.creation.video.ui;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.C378369Pn;
import X.C378459Pw;
import X.C61870KPj;
import X.DbT;
import X.DbX;
import X.L16;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.instagram.pendingmedia.model.ClipInfo;

public class FilmstripScrollView extends HorizontalScrollView {
    public L16 A00;
    public boolean A01;

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        C378459Pw r0;
        Integer num;
        L16 l16 = this.A00;
        if (l16 != null) {
            int i5 = i - i3;
            C61870KPj kPj = l16.A00;
            if (kPj.A07 != null) {
                if (i5 >= 0) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A00;
                }
                C61870KPj.A09(kPj, num);
            }
            if (!DbT.A1a(AnonymousClass7TE.A0q(kPj.A0A()), "import_scroll_education")) {
                DbX.A1V(AnonymousClass7TE.A0q(kPj.A0A()), "import_scroll_education", true);
            }
            ClipInfo clipInfo = kPj.A0H;
            if (clipInfo != null) {
                FilmstripScrollView filmstripScrollView = kPj.A0F;
                if (filmstripScrollView != null) {
                    clipInfo.A08 = filmstripScrollView.getScrollX();
                    ClipInfo clipInfo2 = kPj.A0H;
                    if (clipInfo2 != null) {
                        clipInfo2.A07 = (int) C61870KPj.A02(kPj);
                        ClipInfo clipInfo3 = kPj.A0H;
                        if (clipInfo3 != null) {
                            clipInfo3.A05 = (int) C61870KPj.A01(kPj);
                            ClipInfo clipInfo4 = kPj.A0H;
                            if (clipInfo4 != null) {
                                clipInfo4.A0H = true;
                                C378369Pn r02 = kPj.A0G;
                                if (!(r02 == null || (r0 = r02.A08) == null)) {
                                    r0.A0C();
                                }
                            }
                        }
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            0qQ.A0F("clipInfo");
            throw AnonymousClass00P.createAndThrow();
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r1 != 3) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r0 = -1028381742(0xffffffffc2b423d2, float:-90.06996)
            int r3 = X.AnonymousClass0fD.A05(r0)
            int r1 = r5.getAction()
            r2 = 0
            if (r1 == 0) goto L_0x005d
            r2 = 1
            if (r1 == r2) goto L_0x0022
            r0 = 2
            if (r1 == r0) goto L_0x0049
            r0 = 3
            if (r1 == r0) goto L_0x0022
        L_0x0017:
            boolean r1 = super.onTouchEvent(r5)
            r0 = -512609737(0xffffffffe1723237, float:-2.7923315E20)
            X.AnonymousClass0fD.A0C(r0, r3)
            return r1
        L_0x0022:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0017
            X.L16 r0 = r4.A00
            if (r0 == 0) goto L_0x0017
            X.KPj r2 = r0.A00
            android.view.View r0 = r2.A0A
            if (r0 == 0) goto L_0x0033
            r0.clearAnimation()
        L_0x0033:
            android.view.View r1 = r2.A0A
            if (r1 == 0) goto L_0x0017
            android.view.animation.Animation r0 = r2.A0D
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "playIndicatorFadeOutAnimation"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0045:
            r1.startAnimation(r0)
            goto L_0x0017
        L_0x0049:
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0017
            X.L16 r0 = r4.A00
            if (r0 == 0) goto L_0x0017
            X.KPj r1 = r0.A00
            X.9Pn r0 = r1.A0G
            if (r0 == 0) goto L_0x0060
            r0.A09(r2)
            X.C61870KPj.A06(r1)
        L_0x005d:
            r4.A01 = r2
            goto L_0x0017
        L_0x0060:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.video.ui.FilmstripScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public FilmstripScrollView(Context context) {
        super(context);
    }

    public FilmstripScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FilmstripScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
