package X;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.2ui  reason: invalid class name and case insensitive filesystem */
public final class C232952ui implements View.OnTouchListener {
    public static final int A0I = ViewConfiguration.getTapTimeout();
    public static final C71392co A0J = C71392co.A03(10.0d, 13.0d);
    public static final int A0K = ViewConfiguration.getTapTimeout();
    public int A00;
    public long A01 = ((long) A0I);
    public MotionEvent A02;
    public MotionEvent A03;
    public 2cs A04;
    public 2cs A05;
    public UserSession A06;
    public C232962uj A07;
    public C232942uh A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D = true;
    public float A0E;
    public float A0F;
    public float A0G;
    public float A0H;

    static {
        ViewConfiguration.getTapTimeout();
    }

    public final void A00() {
        this.A07.removeCallbacksAndMessages((Object) null);
        2cs r4 = this.A05;
        r4.A06(0.0d);
        2cs r1 = this.A04;
        r1.A06(0.0d);
        r4.A08(0.0d, true);
        r1.A08(0.0d, true);
        this.A09 = false;
    }

    public final void A01() {
        2cs r5 = this.A05;
        r5.A06(0.0d);
        if (r5.A09.A00 == 0.0d) {
            this.A08.A05(this.A02, r5);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.Handler, X.2uj] */
    public C232952ui(Context context, UserSession userSession, C232942uh r8) {
        WeakReference weakReference = new WeakReference(this);
        ? handler = new Handler();
        handler.A00 = weakReference;
        this.A07 = handler;
        this.A06 = userSession;
        this.A08 = r8;
        if (r8 != null) {
            int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.A00 = scaledTouchSlop * scaledTouchSlop * 2;
            2cp A002 = C61340me.A00();
            2cs A022 = A002.A02();
            A022.A00 = 0.019999999552965164d;
            A022.A09(C232972uk.A00);
            A022.A0A(new C232982ul(this));
            this.A05 = A022;
            2cs A023 = A002.A02();
            A023.A09(A0J);
            A023.A00 = 0.019999999552965164d;
            A023.A0A(new C232992um(this));
            this.A04 = A023;
            return;
        }
        throw new IllegalStateException("OnGestureListener must not be null");
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        int i;
        boolean z2 = false;
        if (motionEvent.getActionMasked() == 6) {
            z = true;
            i = motionEvent.getActionIndex();
        } else {
            z = false;
            i = -1;
        }
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (i != i2) {
                f += motionEvent.getX(i2);
                f2 += motionEvent.getY(i2);
            }
        }
        if (z) {
            pointerCount--;
        }
        float f3 = (float) pointerCount;
        float f4 = f / f3;
        float f5 = f2 / f3;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                AnonymousClass1Nd.A00(this.A06).A05(new C52451GTd(false));
                this.A0C = false;
                C232962uj r0 = this.A07;
                r0.removeMessages(1);
                r0.removeMessages(2);
                if (!this.A09) {
                    z2 = this.A08.A09(motionEvent);
                    this.A04.A06(0.0d);
                }
                if (this.A0D) {
                    A01();
                    return z2;
                }
            } else if (actionMasked == 2) {
                float f6 = this.A0G - f4;
                float f7 = this.A0H - f5;
                if (this.A09) {
                    int i3 = (int) (f4 - this.A0E);
                    int i4 = (int) (f5 - this.A0F);
                    if ((i3 * i3) + (i4 * i4) > this.A00) {
                        C232942uh r1 = this.A08;
                        this.A0G = f4;
                        this.A0H = f5;
                        this.A09 = false;
                        if (!this.A0C) {
                            C232962uj r02 = this.A07;
                            r02.removeMessages(1);
                            r02.removeMessages(2);
                            return false;
                        }
                        this.A0B = false;
                        r1.A02(motionEvent);
                        this.A05.A04();
                        return false;
                    }
                } else if (Math.abs(f6) >= 1.0f || Math.abs(f7) >= 1.0f) {
                    if (!this.A0C) {
                        MotionEvent motionEvent2 = this.A03;
                        if (motionEvent2 != null) {
                            int x = (int) (f4 - motionEvent2.getX());
                            int y = (int) (f5 - this.A03.getY());
                            int i5 = (x * x) + (y * y);
                            if (!this.A0A && !this.A0B && i5 > this.A00) {
                                C232962uj r5 = this.A07;
                                r5.removeMessages(2);
                                this.A04.A01();
                                this.A03.recycle();
                                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                                this.A03 = obtain;
                                r5.sendEmptyMessageAtTime(2, obtain.getEventTime() + this.A01);
                            }
                        } else {
                            this.A03 = MotionEvent.obtain(motionEvent);
                        }
                        if ((this.A0A || this.A0B) && !this.A08.A0B(this.A03, motionEvent, f6, f7)) {
                            this.A04.A04();
                        }
                    }
                    this.A0G = f4;
                    this.A0H = f5;
                    return false;
                }
            } else if (actionMasked == 3) {
                this.A07.removeCallbacksAndMessages((Object) null);
                this.A05.A06(0.0d);
                this.A04.A06(0.0d);
                this.A09 = false;
                this.A08.A00(motionEvent);
            }
            return z2;
        }
        2cs r3 = this.A05;
        if (r3.A01 == 1.0d) {
            this.A07.removeCallbacksAndMessages((Object) null);
            r3.A04();
            this.A04.A04();
            this.A09 = false;
            this.A08.A00(motionEvent);
        }
        this.A0G = f4;
        this.A0E = f4;
        this.A0H = f5;
        this.A0F = f5;
        MotionEvent motionEvent3 = this.A02;
        if (motionEvent3 != null) {
            motionEvent3.recycle();
        }
        this.A02 = MotionEvent.obtain(motionEvent);
        this.A09 = true;
        C232962uj r4 = this.A07;
        r4.removeMessages(1);
        r4.sendEmptyMessageAtTime(1, this.A02.getDownTime() + ((long) (A0K * 2)));
        return this.A08.A08(motionEvent);
    }
}
