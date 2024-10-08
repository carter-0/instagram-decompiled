package X;

import android.content.Context;
import android.os.Handler;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2js  reason: invalid class name and case insensitive filesystem */
public final class C227762js extends C249383je implements View.OnTouchListener {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public C240093Jo A06;
    public List A07;
    public List A08;
    public List A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public float A0E;
    public float A0F;
    public final float A0G;
    public final Handler A0H;
    public final float A0I;
    public final C227772jt A0J = new C227772jt(this);
    public final Float A0K;
    public final boolean A0L;

    public C227762js(Context context, Handler handler, Float f, boolean z) {
        this.A0K = f;
        this.A0L = z;
        this.A0H = handler;
        this.A0I = (float) (0nA.A08(context) / 5);
        this.A0G = TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()) / 6.0f;
        0sn r0 = 0sn.A00;
        this.A07 = r0;
        this.A08 = r0;
        this.A0A = r0;
        this.A09 = r0;
        this.A0B = true;
    }

    public static final void A01(C227762js r1, boolean z) {
        r1.A02 = -1;
        r1.A03 = -1;
        r1.A04 = -1;
        if (z) {
            A00(r1, -r1.A01);
        }
        r1.A0H.removeCallbacksAndMessages((Object) null);
    }

    public final void A02() {
        A01(this, true);
    }

    public final void A04(View view, C240093Jo r8, float f) {
        0qQ.A0B(view, 2);
        0sn r2 = 0sn.A00;
        List singletonList = Collections.singletonList(view);
        0qQ.A07(singletonList);
        A05(r8, r2, singletonList, f, true);
    }

    public final void A05(C240093Jo r2, List list, List list2, float f, boolean z) {
        0qQ.A0B(list2, 4);
        this.A06 = r2;
        this.A08 = list2;
        this.A07 = list;
        A03(f);
        A01(this, z);
    }

    public final void A06(C231302rO r3, C238133Ar r4, int i) {
        0qQ.A0B(r3, 1);
        if (r4 != null) {
            r4.CEd().setOnTouchListener(this);
            r3.EZ4(i);
            if (r4.CEd() instanceof RefreshableListView) {
                ViewGroup CEd = r4.CEd();
                0qQ.A0C(CEd, "null cannot be cast to non-null type com.instagram.ui.widget.refresh.RefreshableListView");
                ((RefreshableListView) CEd).A00 = i;
            }
        }
    }

    public final void A07(C231302rO r3, C238133Ar r4, int i, int i2) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r3, 1);
        r3.EZ4(i);
        if (r4.CEd() instanceof RefreshableListView) {
            ViewGroup CEd = r4.CEd();
            0qQ.A0C(CEd, "null cannot be cast to non-null type com.instagram.ui.widget.refresh.RefreshableListView");
            ((RefreshableListView) CEd).A00 = i;
        }
        A03((float) i2);
    }

    public final void A09(C238133Ar r2) {
        ViewGroup CEd;
        A01(this, true);
        if (!(r2 == null || (CEd = r2.CEd()) == null)) {
            CEd.requestLayout();
        }
        0sn r0 = 0sn.A00;
        this.A08 = r0;
        this.A07 = r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if ((r2 - r7.A01) > (r2 / 2.0f)) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.C238133Ar r8, boolean r9) {
        /*
            r7 = this;
            r3 = 0
            if (r9 == 0) goto L_0x0043
            java.util.List r0 = r7.A08
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0017
            java.util.List r0 = r7.A07
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0043
        L_0x0017:
            boolean r0 = r7.A0D
            r5 = 1
            if (r0 != 0) goto L_0x002d
            boolean r0 = r7.A0C
            if (r0 != 0) goto L_0x0066
            float r2 = r7.A00
            float r0 = r7.A01
            float r1 = r2 - r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
        L_0x002d:
            r6 = 1
        L_0x002e:
            r7.A0C = r3
            r7.A0D = r3
            if (r6 == 0) goto L_0x0064
            float r4 = r7.A00
        L_0x0036:
            float r1 = r7.A00
            float r0 = r7.A01
            float r1 = r1 - r0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0044
            float r0 = r7.A0I
            r7.A0F = r0
        L_0x0043:
            return
        L_0x0044:
            X.3Jo r0 = r7.A06
            if (r0 == 0) goto L_0x0043
            boolean r0 = r0.Es8()
            if (r0 != r5) goto L_0x0043
            X.2jt r2 = r7.A0J
            r2.A00 = r4
            r2.A03 = r6
            r2.A02 = r3
            r2.A01 = r8
            long r0 = android.os.SystemClock.uptimeMillis()
            r7.A05 = r0
            android.os.Handler r0 = r7.A0H
            r0.post(r2)
            return
        L_0x0064:
            r4 = 0
            goto L_0x0036
        L_0x0066:
            r6 = 0
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227762js.A0A(X.3Ar, boolean):void");
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
            return false;
        }
        this.A0H.removeCallbacksAndMessages((Object) null);
        return false;
    }

    public static final void A00(C227762js r6, float f) {
        float f2 = r6.A01;
        r6.A01 = Math.max(0.0f, Math.min(r6.A00, f + f2));
        for (View view : r6.A08) {
            float f3 = r6.A01;
            if (view.getVisibility() == 0) {
                view.setTranslationY(-f3);
            }
        }
        for (View view2 : r6.A07) {
            float f4 = -r6.A01;
            if (view2.getVisibility() == 0) {
                view2.setTranslationY(-f4);
            }
        }
        float f5 = r6.A00;
        if (f5 != 0.0f) {
            float min = 1.0f - Math.min((r6.A01 / f5) / 0.7f, 1.0f);
            for (View alpha : r6.A0A) {
                alpha.setAlpha(min);
            }
        }
        for (View view3 : r6.A09) {
            if (r6.A01 >= r6.A00) {
                view3.setVisibility(4);
            } else {
                view3.setVisibility(0);
            }
        }
        C240093Jo r2 = r6.A06;
        if (r2 != null) {
            float f6 = r6.A01;
            if (f2 != f6) {
                r2.Dtt(f6);
            }
        }
    }

    public final void A03(float f) {
        float f2 = this.A00;
        this.A00 = f;
        if (f2 != 0.0f) {
            float f3 = this.A01;
            if (f2 == f3) {
                A00(this, f - f3);
            } else {
                A00(this, 0.0f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        if (X.C227752jr.A02(r5, r0.floatValue()) == false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C238133Ar r5) {
        /*
            r4 = this;
            float r0 = r4.A0E
            X.3Jo r1 = r4.A06
            r3 = 0
            if (r1 == 0) goto L_0x004d
            float r2 = r1.AwJ(r5, r0)
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x004d
            java.util.List r0 = r4.A08
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0023
            java.util.List r0 = r4.A07
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x004d
        L_0x0023:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x004d
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
            float r0 = r4.A0F
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x004e
            boolean r0 = r1.EsJ(r5)
            if (r0 != 0) goto L_0x004e
            float r1 = r4.A00
            float r0 = r4.A01
            float r1 = r1 - r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0048
            float r0 = -r2
            float r1 = r4.A0F
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0067
            float r2 = r2 + r1
        L_0x0048:
            r4.A0F = r3
        L_0x004a:
            A00(r4, r2)
        L_0x004d:
            return
        L_0x004e:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x004a
            boolean r0 = r1.EsI(r5)
            if (r0 != 0) goto L_0x006a
            java.lang.Float r0 = r4.A0K
            if (r0 == 0) goto L_0x004a
            float r0 = r0.floatValue()
            boolean r0 = X.C227752jr.A02(r5, r0)
            if (r0 != 0) goto L_0x004a
            goto L_0x006a
        L_0x0067:
            float r1 = r1 + r2
            r4.A0F = r1
        L_0x006a:
            r2 = 0
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227762js.A08(X.3Ar):void");
    }

    public final void onScroll(C238133Ar r6, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        float f;
        int A032 = AnonymousClass0fD.A03(-903165419);
        0qQ.A0B(r6, 0);
        if (i2 <= 0 || r6.AnH() == 0) {
            i6 = -481183226;
        } else {
            if (r6.CWN() || !this.A0L) {
                View AnE = r6.AnE(r6.B6L());
                if (AnE == null) {
                    f = 0.0f;
                } else {
                    int paddingTop = (-AnE.getTop()) + r6.CEd().getPaddingTop();
                    int height = AnE.getHeight();
                    int i8 = this.A03;
                    if (i8 == -1) {
                        this.A02 = height;
                        this.A03 = i;
                        i8 = i;
                        this.A04 = paddingTop;
                    }
                    if (i > i8) {
                        i7 = (this.A02 - this.A04) + paddingTop;
                    } else if (i < i8) {
                        f = -((float) ((height - paddingTop) + this.A04));
                        this.A02 = height;
                        this.A03 = i;
                        this.A04 = paddingTop;
                    } else {
                        i7 = paddingTop - this.A04;
                    }
                    f = (float) i7;
                    this.A02 = height;
                    this.A03 = i;
                    this.A04 = paddingTop;
                }
            } else {
                f = (float) i5;
            }
            if (this.A0C && f < 0.0f) {
                f = Math.abs(f);
            }
            this.A0E = f;
            A08(r6);
            this.A0E = 0.0f;
            i6 = -1510438306;
        }
        AnonymousClass0fD.A0A(i6, A032);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        int A032 = AnonymousClass0fD.A03(-1996245223);
        boolean z = false;
        0qQ.A0B(r3, 0);
        if (i == 0) {
            z = true;
        }
        A0A(r3, z);
        AnonymousClass0fD.A0A(-1489659014, A032);
    }
}
