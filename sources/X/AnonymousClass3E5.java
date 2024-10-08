package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.3E5  reason: invalid class name */
public final class AnonymousClass3E5 implements AnonymousClass3E6 {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public int A04 = -1;
    public View A05;
    public View A06;
    public WindowManager A07;
    public WeakReference A08;
    public boolean A09;
    public boolean A0A;
    public int A0B;
    public View.OnAttachStateChangeListener A0C;
    public ViewTreeObserver.OnGlobalLayoutListener A0D;
    public Integer A0E = AnonymousClass05K.A00;
    public boolean A0F;
    public final Set A0G = new CopyOnWriteArraySet();
    public final AnonymousClass0eM A0H = AnonymousClass0eN.A00(0eO.A03, new AnonymousClass9LM(this, 23));
    public final AnonymousClass03Q A0I = new AnonymousClass3E7(this);
    public final String A0J;

    public AnonymousClass3E5(String str, boolean z) {
        0qQ.A0B(str, 1);
        this.A0J = str;
        this.A0F = z;
    }

    public final void Dh2() {
        this.A03 = -1;
        this.A0A = true;
    }

    public final void EkY(boolean z) {
        this.A09 = true;
    }

    private final void A00() {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        View view = this.A06;
        if (!(view == null || (onAttachStateChangeListener = this.A0C) == null)) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.A0C = null;
        View view2 = this.A05;
        if (view2 != null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.A0D;
            if (onGlobalLayoutListener != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                AnonymousClass03j.A00(view2, (AnonymousClass03Q) null);
                if (view2.getParent() != null) {
                    WindowManager windowManager = this.A07;
                    if (C62000qj.A02.A0T) {
                        0nY.A00().ATE(new C15862Ujm(this.A05, this));
                    } else if (C62000qj.A02.A0U) {
                        this.A07 = null;
                        this.A05 = null;
                    } else if (windowManager != null) {
                        windowManager.removeView(view2);
                        this.A07 = null;
                        this.A05 = null;
                    }
                }
                this.A0B = 0;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private final void A01(Activity activity) {
        ViewTreeObserver.OnGlobalLayoutListener r0;
        if (this.A0F) {
            r0 = new C337347gC(activity, this);
        } else {
            r0 = new C240663Lt(this);
        }
        this.A0D = r0;
        View view = this.A05;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.A0D);
            AnonymousClass03j.A00(view, this.A0I);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:(4:43|45|46|(7:48|49|(1:51)|52|(1:54)|55|56))|44|49|(0)|52|(0)|55|56) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x010e */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fc A[Catch:{ all -> 0x010e }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010b A[Catch:{ all -> 0x010e }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x014c A[Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0163 A[Catch:{ all -> 0x018d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.app.Activity r17, X.AnonymousClass3E5 r18) {
        /*
            r3 = r18
            java.lang.Integer r0 = r3.A0E
            int r1 = r0.intValue()
            r14 = 1
            r8 = 0
            if (r1 == r8) goto L_0x0013
            r0 = 3
            if (r1 == r0) goto L_0x0013
            r0 = 2
            if (r1 == r0) goto L_0x0013
        L_0x0012:
            return
        L_0x0013:
            r3.A00()
            android.view.View r0 = r3.A06
            if (r0 == 0) goto L_0x0012
            r7 = 0
            android.os.IBinder r6 = r0.getWindowToken()
            r4 = r17
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x0012
            boolean r0 = r4.isDestroyed()
            if (r0 != 0) goto L_0x0012
            if (r6 == 0) goto L_0x0012
            android.view.Window r0 = r4.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r5 = r0.type
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r2 = "KeyboardHeightChangeDetectorImpl"
            if (r5 < r0) goto L_0x004d
            r0 = 1999(0x7cf, float:2.801E-42)
            if (r5 > r0) goto L_0x004d
            java.lang.String r0 = "Attempted to add window with token that is a sub-window of type: "
            java.lang.String r0 = X.002.A0O(r0, r5)
            X.0wb.A04(r2, r0, r14)
            return
        L_0x004d:
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L_0x0096
            android.view.Window r0 = r4.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r0 = r0.softInputMode
            r0 = r0 & 240(0xf0, float:3.36E-43)
        L_0x005f:
            r3.A0B = r0
            java.lang.String r0 = "window"
            java.lang.Object r1 = r4.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.WindowManager"
            X.0qQ.A0C(r1, r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            r3.A07 = r1
            android.view.View r0 = new android.view.View
            r0.<init>(r4)
            r3.A05 = r0
            r15 = -1
            r16 = 1003(0x3eb, float:1.406E-42)
            r17 = 131096(0x20018, float:1.83705E-40)
            r18 = -3
            android.view.WindowManager$LayoutParams r13 = new android.view.WindowManager$LayoutParams
            r13.<init>(r14, r15, r16, r17, r18)
            r0 = 16
            r13.softInputMode = r0
            java.lang.String r1 = "KHCD."
            java.lang.String r0 = r3.A0J
            java.lang.String r0 = X.002.A0R(r1, r0)
            r13.setTitle(r0)
            r13.token = r6
            goto L_0x0098
        L_0x0096:
            r0 = 0
            goto L_0x005f
        L_0x0098:
            android.view.WindowManager r0 = r3.A07     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            if (r0 == 0) goto L_0x018d
            X.0qi r0 = X.C62000qj.A02     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            X.0sa r0 = r0.A0J     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            java.lang.Object r0 = r0.invoke()     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            boolean r0 = r0.booleanValue()     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            if (r0 == 0) goto L_0x00d8
            java.lang.ref.WeakReference r1 = r3.A08     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            if (r1 == 0) goto L_0x00c6
            java.lang.Object r0 = r1.get()     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            if (r0 == 0) goto L_0x00c6
            boolean r0 = r1.equals(r4)     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            if (r0 != 0) goto L_0x00c6
            java.lang.String r1 = "attempting to overwrite activity"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            r0.<init>(r1)     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            throw r0     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
        L_0x00c6:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            r0.<init>(r4)     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            r3.A08 = r0     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            X.0eM r0 = r3.A0H     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            X.9jC r0 = (X.C385579jC) r0     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            X.0lU.A07(r0)     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
        L_0x00d8:
            X.0qi r0 = X.C62000qj.A02     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            boolean r0 = r0.A0Z     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            if (r0 == 0) goto L_0x0167
            android.view.WindowManager r10 = r3.A07     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            r12 = 0
            r11 = 0
            r9 = 0
            boolean r1 = X.RQA.A02     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            if (r1 != 0) goto L_0x0111
            if (r10 == 0) goto L_0x00ea
            goto L_0x00ec
        L_0x00ea:
            r0 = r7
            goto L_0x00f8
        L_0x00ec:
            java.lang.Class r1 = r10.getClass()     // Catch:{ all -> 0x010e }
            if (r1 == 0) goto L_0x00ea
            java.lang.String r0 = "mParentWindow"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x010e }
        L_0x00f8:
            X.RQA.A01 = r0     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x00ff
            r0.setAccessible(r14)     // Catch:{ all -> 0x010e }
        L_0x00ff:
            java.lang.Class<android.view.Window> r1 = android.view.Window.class
            java.lang.String r0 = "mHardwareAccelerated"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x010e }
            X.RQA.A00 = r0     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x010e
            r0.setAccessible(r14)     // Catch:{ all -> 0x010e }
        L_0x010e:
            X.RQA.A02 = r14     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            r1 = 1
        L_0x0111:
            java.lang.reflect.Field r0 = X.RQA.A01     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            if (r1 == 0) goto L_0x0123
            if (r0 == 0) goto L_0x0123
            java.lang.Object r10 = r0.get(r10)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "null cannot be cast to non-null type android.view.Window"
            X.0qQ.A0C(r10, r0)     // Catch:{ all -> 0x0123 }
            android.view.Window r10 = (android.view.Window) r10     // Catch:{ all -> 0x0123 }
            goto L_0x0124
        L_0x0123:
            r10 = r7
        L_0x0124:
            java.lang.reflect.Field r1 = X.RQA.A00     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            if (r1 == 0) goto L_0x0148
            if (r10 == 0) goto L_0x0148
            boolean r9 = r1.getBoolean(r10)     // Catch:{ all -> 0x0147 }
            android.view.WindowManager$LayoutParams r0 = r10.getAttributes()     // Catch:{ all -> 0x0147 }
            int r11 = r0.flags     // Catch:{ all -> 0x0147 }
            r1.setBoolean(r10, r8)     // Catch:{ all -> 0x0147 }
            android.view.WindowManager$LayoutParams r12 = r10.getAttributes()     // Catch:{ all -> 0x0147 }
            android.view.WindowManager$LayoutParams r0 = r10.getAttributes()     // Catch:{ all -> 0x0147 }
            int r1 = r0.flags     // Catch:{ all -> 0x0147 }
            r0 = -16777217(0xfffffffffeffffff, float:-1.7014117E38)
            r1 = r1 & r0
            r12.flags = r1     // Catch:{ all -> 0x0147 }
        L_0x0147:
            r12 = 1
        L_0x0148:
            android.view.WindowManager r1 = r3.A07     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            if (r1 == 0) goto L_0x0151
            android.view.View r0 = r3.A05     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            r1.addView(r0, r13)     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
        L_0x0151:
            if (r12 == 0) goto L_0x018d
            if (r10 == 0) goto L_0x018d
            java.lang.reflect.Field r0 = X.RQA.A00     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            if (r0 == 0) goto L_0x018d
            android.view.WindowManager$LayoutParams r0 = r10.getAttributes()     // Catch:{ all -> 0x018d }
            r0.flags = r11     // Catch:{ all -> 0x018d }
            java.lang.reflect.Field r0 = X.RQA.A00     // Catch:{ all -> 0x018d }
            if (r0 == 0) goto L_0x018d
            r0.setBoolean(r10, r9)     // Catch:{ all -> 0x018d }
            goto L_0x018d
        L_0x0167:
            android.view.WindowManager r1 = r3.A07     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            if (r1 == 0) goto L_0x018d
            android.view.View r0 = r3.A05     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            r1.addView(r0, r13)     // Catch:{ BadTokenException -> 0x01a3, RuntimeException -> 0x0171 }
            goto L_0x018d
        L_0x0171:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Cannot add mResizeDetectingView to WindowManager, with WindowType "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " and token "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            X.0wb.A03(r2, r0)
        L_0x018d:
            android.view.View r2 = r3.A05
            if (r2 == 0) goto L_0x019b
            r1 = 2131432951(0x7f0b15f7, float:1.8487674E38)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            r2.setTag(r1, r0)
        L_0x019b:
            r3.A01(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3.A0E = r0
            return
        L_0x01a3:
            r1 = move-exception
            java.lang.String r0 = "BadTokenException when trying to add window"
            X.0wb.A05(r2, r0, r14, r1)
            r3.A07 = r7
            r3.A05 = r7
            r3.A0B = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3E5.A02(android.app.Activity, X.3E5):void");
    }

    public static final void A03(AnonymousClass3E5 r5, int i) {
        for (C252213ok r3 : r5.A0G) {
            boolean z = false;
            if (r5.A0B == 48) {
                z = true;
            }
            r3.DMr(i, z);
        }
    }

    public static final void A04(AnonymousClass3E5 r7, int i, boolean z) {
        int i2;
        int i3;
        04k A002;
        int i4;
        int i5;
        View view = r7.A06;
        int i6 = Build.VERSION.SDK_INT;
        WindowMetrics windowMetrics = null;
        int i7 = 0;
        if (i6 >= 30) {
            WindowManager windowManager = r7.A07;
            if (windowManager != null) {
                windowMetrics = windowManager.getCurrentWindowMetrics();
                i2 = windowMetrics.getBounds().height();
            }
            i2 = 0;
        } else {
            if (view != null) {
                Context context = view.getContext();
                0qQ.A07(context);
                i2 = 0nA.A05(context);
            }
            i2 = 0;
        }
        if (z) {
            if (1AW.A06(0Tu.A05, 18303591542494941L) || view == null) {
                i5 = 0;
            } else {
                Context context2 = view.getContext();
                0qQ.A07(context2);
                i5 = 0nA.A07(context2);
            }
            i4 = (i2 - i) - i5;
            if (i4 < 0) {
                i4 = 0;
            }
        } else {
            if (i6 >= 30 && windowMetrics != null) {
                WindowInsets windowInsets = windowMetrics.getWindowInsets();
                0qQ.A07(windowInsets);
                i3 = windowInsets.getInsets(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout()).bottom;
                i7 = windowInsets.getInsets(WindowInsets.Type.statusBars()).top;
            } else if (view == null || (A002 = C586203k.A00(view)) == null) {
                i3 = 0;
            } else {
                04h r1 = A002.A00;
                i7 = r1.A05(1).A03;
                i3 = r1.A05(2).A00;
            }
            View view2 = r7.A06;
            0qQ.A0A(view2);
            Context context3 = view2.getContext();
            0qQ.A07(context3);
            int A022 = C61290mR.A02(context3);
            if (i7 == 0 && A022 > 0) {
                i7 = A022;
            }
            i4 = ((i2 - i3) - i) - i7;
        }
        A03(r7, i4);
    }

    public final void A9Y(C252213ok r2) {
        if (r2 != null) {
            this.A0G.add(r2);
        }
    }

    public final void DmJ(Activity activity) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            View decorView = window.getDecorView();
            this.A06 = decorView;
            if (decorView != null && decorView.getWindowToken() != null) {
                A02(activity, this);
            } else if (this.A0C == null) {
                AnonymousClass3E8 r1 = new AnonymousClass3E8(activity, this);
                this.A0C = r1;
                View view = this.A06;
                if (view != null) {
                    view.addOnAttachStateChangeListener(r1);
                }
            }
        }
    }

    public final void EEH(C252213ok r2) {
        if (r2 != null) {
            this.A0G.remove(r2);
        }
    }

    public final void EzL(Activity activity) {
        if (!this.A0F) {
            this.A0F = true;
            View view = this.A05;
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.A0D;
            if (!(view == null || onGlobalLayoutListener == null)) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            A01(activity);
        }
    }

    public final boolean isStarted() {
        if (this.A06 != null) {
            return true;
        }
        return false;
    }

    public final void onDestroy() {
        this.A0G.clear();
        if (((Boolean) C62000qj.A02.A0J.invoke()).booleanValue()) {
            this.A08 = null;
            0lU.A08((0wY) this.A0H.getValue());
        }
        this.A0E = AnonymousClass05K.A0N;
    }

    public final void onStop() {
        if (this.A0E.intValue() == 1) {
            A00();
            this.A06 = null;
            this.A0E = AnonymousClass05K.A0C;
        }
    }
}
