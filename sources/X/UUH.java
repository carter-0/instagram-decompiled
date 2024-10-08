package X;

import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

public final class UUH extends W8D implements ViewTreeObserver.OnGlobalLayoutListener {
    public Surface A00;
    public SurfaceControl A01;
    public Double A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public final SurfaceView A07;
    public final C20884X2o A08;
    public final XBk A09;

    public final void A02() {
        Surface surface = this.A00;
        if (surface != null) {
            A01(surface);
        }
        this.A00 = null;
        C20884X2o x2o = this.A08;
        if (x2o != null) {
            x2o.setSurface((Surface) null);
        }
        this.A01.release();
        C51967G9n.A0y(this.A07, this);
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        0qQ.A0B(surfaceHolder, 0);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        0qQ.A0B(surfaceHolder, 0);
        AnonymousClass4ND r2 = this.A02;
        if (r2.A05) {
            surfaceHolder.getSurface().release();
        }
        Surface surface = this.A00;
        if (surface == null) {
            surface = new Surface(this.A01);
        }
        this.A00 = surface;
        C20884X2o x2o = this.A08;
        if (x2o != null) {
            x2o.setSurface(surface);
        }
        if (this.A00 == null) {
            this.A00 = surface;
            this.A01.A0I.A0D(surface);
        }
        this.A03.DpW(surface);
        this.A00 = null;
        Double d = r2.A00;
        if (d == null) {
            d = this.A02;
        }
        A00(this, d, r2.A01);
        this.A07.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public static final void A00(UUH uuh, Double d, Integer num) {
        int i;
        int i2;
        Integer num2;
        int[] iArr;
        UUH uuh2 = uuh;
        if (uuh2.A01.isValid()) {
            SurfaceView surfaceView = uuh2.A07;
            SurfaceControl surfaceControl = surfaceView.getSurfaceControl();
            int width = surfaceView.getWidth();
            int height = surfaceView.getHeight();
            AnonymousClass4ND r7 = uuh2.A02;
            if (d != null) {
                uuh2.A02 = Double.valueOf(d.doubleValue());
            }
            boolean z = false;
            if (width <= 0 || height <= 0 || num == null || d == null) {
                i = 0;
                i2 = 0;
            } else {
                double doubleValue = d.doubleValue();
                int intValue = num.intValue();
                int i3 = height;
                int i4 = width;
                if (doubleValue <= 0.0d) {
                    iArr = new int[]{0, 0, 0, 0};
                } else {
                    double d2 = (double) width;
                    double d3 = (double) height;
                    double d4 = (d2 * 1.0d) / d3;
                    if (intValue != 3) {
                        if ((doubleValue >= d4 || intValue != 2) && (doubleValue <= d4 || intValue != 1)) {
                            i3 = JTP.A01(d2, doubleValue);
                        } else {
                            i4 = (int) Math.ceil(d3 * doubleValue);
                        }
                    }
                    iArr = new int[]{i4, i3, height, width};
                }
                i2 = iArr[0];
                i = iArr[1];
            }
            Integer num3 = uuh2.A06;
            if ((num3 != null && i2 == num3.intValue() && (num2 = uuh2.A05) != null && i == num2.intValue()) || i2 == 0 || i == 0) {
                z = true;
            }
            boolean A0K = 0qQ.A0K(surfaceControl, uuh2.A01);
            if (!A0K || !z) {
                0qQ.A0B(r7, 1);
                SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
                boolean z2 = true;
                if (!A0K) {
                    try {
                        transaction.reparent(uuh2.A01, surfaceControl);
                    } catch (Exception e) {
                        e = e;
                        if ((e instanceof NullPointerException) || r7.A04) {
                            z2 = false;
                        }
                        throw e;
                    }
                }
                if (!z) {
                    uuh2.A06 = Integer.valueOf(i2);
                    uuh2.A05 = Integer.valueOf(i);
                    try {
                        transaction.setBufferSize(uuh2.A01, i2, i);
                    } catch (Exception e2) {
                        e = e2;
                        if ((e instanceof NullPointerException) || r7.A04) {
                            z2 = false;
                        }
                        throw e;
                    }
                }
                try {
                    transaction.setVisibility(uuh2.A01, true);
                } catch (Exception e3) {
                    e = e3;
                    if ((e instanceof NullPointerException) || r7.A04) {
                        z2 = false;
                    }
                    throw e;
                }
                SurfaceControl surfaceControl2 = uuh2.A01;
                if (!z2 || !surfaceControl2.isValid()) {
                    transaction.close();
                    return;
                }
                try {
                    transaction.apply();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    transaction.close();
                    throw th;
                }
                transaction.close();
            }
        }
    }

    public final void A03(SurfaceControl surfaceControl) {
        this.A01 = surfaceControl;
    }

    public final void onGlobalLayout() {
        ViewGroup.LayoutParams layoutParams = this.A07.getLayoutParams();
        if (layoutParams != null) {
            Integer num = this.A04;
            Integer num2 = this.A03;
            Double d = this.A02;
            if (d != null) {
                if (!(num == null || num2 == null)) {
                    int intValue = num.intValue();
                    if (C13988Tno.A06(layoutParams.height, num2.intValue()) <= 5 && C13988Tno.A06(layoutParams.width, intValue) <= 5) {
                        return;
                    }
                }
                this.A04 = Integer.valueOf(layoutParams.width);
                this.A03 = Integer.valueOf(layoutParams.height);
                A00(this, d, this.A02.A01);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UUH(SurfaceControl surfaceControl, SurfaceView surfaceView, C263624Ms r3, AnonymousClass4ND r4, C20884X2o x2o, XBk xBk) {
        super(r3, r4, xBk);
        AnonymousClass7TG.A1Q(r4, surfaceView);
        this.A07 = surfaceView;
        this.A01 = surfaceControl;
        this.A09 = xBk;
        this.A08 = x2o;
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        A02();
    }
}
