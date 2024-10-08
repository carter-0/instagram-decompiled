package com.instagram.rtc.presentation.arsidebar;

import X.0mi;
import X.0qQ;
import X.2eO;
import X.AnonymousClass0fD;
import X.AnonymousClass1GB;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass972;
import X.C51965G9l;
import X.C67705MtJ;
import X.C68290N9d;
import X.C69105Nek;
import X.C70511O9k;
import X.C72912POw;
import X.C74273Ps1;
import X.DbU;
import X.DbW;
import X.PMT;
import X.POU;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

public final class RtcCallArSidebarTouchUpSlider extends View {
    public float A00;
    public C74273Ps1 A01;
    public boolean A02;
    public float A03;
    public final int A04 = 99;
    public final int A05 = 1;
    public final int A06;
    public final Paint A07;
    public final Paint A08;
    public final Path A09 = C51965G9l.A0C();
    public final RectF A0A = AnonymousClass7TE.A0Y();
    public final VelocityTracker A0B = VelocityTracker.obtain();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcCallArSidebarTouchUpSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass7TF.A1B(context, 1, attributeSet);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A08 = A0V;
        Paint A0V2 = AnonymousClass7TE.A0V(1);
        this.A07 = A0V2;
        Resources A052 = DbU.A05(this);
        A0V2.setColor(-1);
        A0V.setColor(AnonymousClass972.MUTABLE_FLAG_MASK);
        this.A06 = A052.getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
        setSeekValue(1);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        RectF rectF = this.A0A;
        rectF.set(0.0f, 0.0f, AnonymousClass7TE.A02(this), (float) getHeight());
        Path path = this.A09;
        path.reset();
        float f = (float) this.A06;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        rectF.bottom = ((float) getHeight()) * this.A03;
        canvas.drawRect(rectF, this.A08);
        rectF.top = ((float) getHeight()) * this.A03;
        rectF.bottom = (float) getHeight();
        canvas.drawRect(rectF, this.A07);
        super.onDraw(canvas);
    }

    private final void A00(boolean z, float f) {
        C74273Ps1 ps1;
        Integer num;
        AccessibilityManager accessibilityManager;
        int i = this.A04;
        float f2 = (float) i;
        int i2 = this.A05;
        float f3 = (float) (i - i2);
        int A032 = 0mi.A03(AnonymousClass1GB.A01(f2 - (f * f3)), i2, i);
        if ((!z || A032 != 0mi.A03(AnonymousClass1GB.A01(f2 - (this.A03 * f3)), i2, i)) && (ps1 = this.A01) != null) {
            PMT pmt = ((POU) ps1).A00;
            C69105Nek nek = pmt.A05().A00;
            if (nek.A01.A0F) {
                nek.A0D.A03(new C72912POw(((float) A032) / 100.0f, false, true));
            }
            C67705MtJ mtJ = (C67705MtJ) pmt.A0K.getValue();
            int i3 = 0;
            if (A032 >= 0) {
                if (A032 >= 2) {
                    if (24 <= A032) {
                        if (A032 < 27) {
                            i3 = 25;
                        } else if (49 <= A032) {
                            if (A032 < 52) {
                                i3 = 50;
                            } else if (74 <= A032) {
                                if (A032 < 77) {
                                    i3 = 75;
                                } else if (99 <= A032 && A032 < 101) {
                                    i3 = 100;
                                }
                            }
                        }
                    }
                }
                num = Integer.valueOf(i3);
                if (!0qQ.A0K(mtJ.A01, num) && num != null) {
                    accessibilityManager = mtJ.A00;
                    if (2eO.A02(accessibilityManager, true) && accessibilityManager != null) {
                        accessibilityManager.interrupt();
                    }
                    RtcCallArSidebarTouchUpSlider rtcCallArSidebarTouchUpSlider = mtJ.A02;
                    rtcCallArSidebarTouchUpSlider.announceForAccessibility(DbW.A0h(rtcCallArSidebarTouchUpSlider.getContext(), num, 2131976454));
                }
                mtJ.A01 = num;
            }
            num = null;
            accessibilityManager = mtJ.A00;
            accessibilityManager.interrupt();
            RtcCallArSidebarTouchUpSlider rtcCallArSidebarTouchUpSlider2 = mtJ.A02;
            rtcCallArSidebarTouchUpSlider2.announceForAccessibility(DbW.A0h(rtcCallArSidebarTouchUpSlider2.getContext(), num, 2131976454));
            mtJ.A01 = num;
        }
        this.A03 = f;
        invalidate();
    }

    private final int getSeekSnapValue() {
        return (this.A04 + this.A05) / 2;
    }

    private final int getSeekValueRange() {
        return this.A04 - this.A05;
    }

    public final void setSeekValue(int i) {
        int i2 = this.A05;
        int i3 = this.A04;
        A00(false, 1.0f - ((((float) 0mi.A03(i, i2, i3)) - ((float) i2)) / ((float) (i3 - i2))));
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        C68290N9d n9d;
        int A052 = AnonymousClass0fD.A05(-956921185);
        MotionEvent motionEvent2 = motionEvent;
        0qQ.A0B(motionEvent2, 0);
        getParent().requestDisallowInterceptTouchEvent(true);
        int action = motionEvent2.getAction();
        if (action == 0) {
            this.A0B.clear();
            this.A02 = false;
            i = -807284431;
        } else if (action == 1) {
            C74273Ps1 ps1 = this.A01;
            if (ps1 != null) {
                PMT pmt = ((POU) ps1).A00;
                C70511O9k A053 = pmt.A05();
                if (!AnonymousClass7TF.A1Y(Boolean.valueOf(2eO.A02(((C67705MtJ) pmt.A0K.getValue()).A00, true)), true)) {
                    C69105Nek nek = A053.A00;
                    C68290N9d n9d2 = (C68290N9d) nek.A01;
                    if (n9d2 != null) {
                        boolean z = n9d2.A0X;
                        boolean z2 = n9d2.A0E;
                        boolean z3 = n9d2.A0P;
                        boolean z4 = n9d2.A0I;
                        int i2 = n9d2.A00;
                        boolean z5 = n9d2.A07;
                        boolean z6 = n9d2.A0A;
                        boolean z7 = n9d2.A08;
                        boolean z8 = n9d2.A0B;
                        boolean z9 = n9d2.A05;
                        boolean z10 = n9d2.A04;
                        boolean z11 = n9d2.A0N;
                        boolean z12 = n9d2.A0S;
                        boolean z13 = n9d2.A0T;
                        boolean z14 = n9d2.A0O;
                        boolean z15 = n9d2.A0Q;
                        boolean z16 = n9d2.A0K;
                        boolean z17 = n9d2.A0G;
                        boolean z18 = n9d2.A0F;
                        boolean z19 = n9d2.A0U;
                        boolean z20 = n9d2.A0R;
                        boolean z21 = n9d2.A0M;
                        boolean z22 = n9d2.A0W;
                        boolean z23 = n9d2.A0C;
                        boolean z24 = n9d2.A09;
                        int i3 = n9d2.A01;
                        boolean z25 = n9d2.A0J;
                        ImageUrl imageUrl = n9d2.A02;
                        boolean z26 = n9d2.A06;
                        boolean z27 = n9d2.A0H;
                        n9d = new C68290N9d(imageUrl, n9d2.A03, i2, i3, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, false, z20, n9d2.A0L, z21, z22, z23, z24, z25, z26, z27, n9d2.A0D);
                    } else {
                        n9d = null;
                    }
                    nek.A0J(n9d);
                }
            }
            i = -1415825399;
        } else if (action != 2) {
            AnonymousClass0fD.A0C(1735322030, A052);
            return false;
        } else {
            VelocityTracker velocityTracker = this.A0B;
            velocityTracker.addMovement(motionEvent2);
            velocityTracker.computeCurrentVelocity(IgNetworkConsentStorage.MAX_ENTRIES);
            float y = motionEvent2.getY();
            if (this.A02) {
                if (AnonymousClass7TE.A00(y, this.A00) > 14.0f) {
                    this.A02 = false;
                }
                i = 68515888;
            }
            float abs = Math.abs(velocityTracker.getYVelocity());
            float y2 = motionEvent2.getY();
            float A002 = 0mi.A00(y2 / ((float) getHeight()), 0.0f, 1.0f);
            int i4 = this.A04;
            int i5 = this.A05;
            if (0mi.A03(AnonymousClass1GB.A01(((float) i4) - (((float) (i4 - i5)) * A002)), i5, i4) == (i4 + i5) / 2 && abs <= 180.0f) {
                this.A00 = y2;
                this.A02 = true;
            }
            A00(true, A002);
            i = 68515888;
        }
        AnonymousClass0fD.A0C(i, A052);
        return true;
    }

    public final void setListener(C74273Ps1 ps1) {
        this.A01 = ps1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcCallArSidebarTouchUpSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass7TF.A1B(context, 1, attributeSet);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A08 = A0V;
        Paint A0V2 = AnonymousClass7TE.A0V(1);
        this.A07 = A0V2;
        Resources A052 = DbU.A05(this);
        A0V2.setColor(-1);
        A0V.setColor(AnonymousClass972.MUTABLE_FLAG_MASK);
        this.A06 = A052.getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
        setSeekValue(1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcCallArSidebarTouchUpSlider(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A08 = A0V;
        Paint A0V2 = AnonymousClass7TE.A0V(1);
        this.A07 = A0V2;
        Resources A052 = DbU.A05(this);
        A0V2.setColor(-1);
        A0V.setColor(AnonymousClass972.MUTABLE_FLAG_MASK);
        this.A06 = A052.getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
        setSeekValue(1);
    }
}
