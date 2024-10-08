package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.uimanager.UIManagerHelper;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Q9d  reason: case insensitive filesystem */
public final class C7372Q9d extends FrameLayout implements X61, C13774Tgp {
    public int A00 = View.MeasureSpec.makeMeasureSpec(0, 0);
    public int A01 = 0;
    public int A02 = 1;
    public int A03 = View.MeasureSpec.makeMeasureSpec(0, 0);
    public Bundle A04;
    public SSW A05;
    public C13429TaG A06;
    public C18801W2o A07;
    public C11245SHf A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C = false;
    public int A0D = 0;
    public int A0E = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A0F = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A0G = 0;
    public C11516Sbd A0H;
    public final AtomicInteger A0I = new AtomicInteger(0);
    public final SNM A0J = new SNM(this);

    public ViewGroup getRootViewGroup() {
        return this;
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        A04(motionEvent, false);
        return super.onHoverEvent(motionEvent);
    }

    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        A04(motionEvent, true);
        return super.onInterceptHoverEvent(motionEvent);
    }

    public void setIsFabric(boolean z) {
        int i = 1;
        if (z) {
            i = 2;
        }
        this.A02 = i;
    }

    public static void A00(C7372Q9d q9d) {
        int i;
        0fc.A01(8192, "attachToReactInstanceManager", 1670810863);
        ReactMarker.logMarker(RH1.A1e);
        if (q9d.getId() != -1) {
            ReactSoftExceptionLogger.logSoftException("ReactRootView", new QZA(002.A0c("Trying to attach a ReactRootView with an explicit id already set to [", "]. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID.", q9d.getId())));
        }
        try {
            if (q9d.A0A) {
                ReactMarker.logMarker(RH1.A1d);
                i = -1139695845;
            } else {
                q9d.A0A = true;
                SSW ssw = q9d.A05;
                0Sd.A00(ssw);
                Set set = ssw.A0F;
                synchronized (set) {
                    if (set.add(q9d)) {
                        q9d.A0I.compareAndSet(1, 0);
                        q9d.removeAllViews();
                        q9d.setId(-1);
                    } else {
                        0I1.A03("ReactNative", "ReactRoot was attached multiple times");
                    }
                    Q6H A042 = ssw.A04();
                    if (ssw.A0J == null && A042 != null) {
                        SSW.A02(ssw, q9d);
                    }
                }
                q9d.getViewTreeObserver().addOnGlobalLayoutListener(q9d.getCustomGlobalLayoutListener());
                ReactMarker.logMarker(RH1.A1d);
                i = 1145732479;
            }
            0fc.A00(8192, i);
        } catch (Throwable th) {
            ReactMarker.logMarker(RH1.A1d);
            0fc.A00(8192, 1232167866);
            throw th;
        }
    }

    private void A01(boolean z, int i, int i2) {
        X9N A032;
        int i3;
        int i4;
        ReactMarker.logMarker(RH1.A1i);
        if (!AnonymousClass7TF.A1V(this.A05)) {
            ReactMarker.logMarker(RH1.A1h);
            0I1.A04("ReactRootView", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        boolean A1S = AnonymousClass7TF.A1S(this.A02, 2);
        if (!A1S || !((i4 = this.A01) == 0 || i4 == -1)) {
            Q6H currentReactContext = getCurrentReactContext();
            if (!(currentReactContext == null || (A032 = UIManagerHelper.A03(currentReactContext, this.A02, true)) == null)) {
                int i5 = 0;
                if (A1S) {
                    int[] iArr = new int[2];
                    getLocationInWindow(iArr);
                    Rect A0W = AnonymousClass7TE.A0W();
                    getWindowVisibleDisplayFrame(A0W);
                    iArr[0] = iArr[0] - A0W.left;
                    int i6 = iArr[1] - A0W.top;
                    iArr[1] = i6;
                    Point point = new Point(iArr[0], i6);
                    i5 = point.x;
                    i3 = point.y;
                } else {
                    i3 = 0;
                }
                if (!(!z && i5 == this.A0E && i3 == this.A0F)) {
                    A032.updateRootLayoutSpecs(this.A01, i, i2, i5, i3);
                }
                this.A0E = i5;
                this.A0F = i3;
            }
            ReactMarker.logMarker(RH1.A1h);
            return;
        }
        ReactMarker.logMarker(RH1.A1h);
        0I1.A03("ReactRootView", "Unable to update root layout specs for ReactRootView: no rootViewTag set yet");
    }

    private C11516Sbd getCustomGlobalLayoutListener() {
        C11516Sbd sbd = this.A0H;
        if (sbd != null) {
            return sbd;
        }
        C11516Sbd sbd2 = new C11516Sbd(this);
        this.A0H = sbd2;
        return sbd2;
    }

    public final boolean A05() {
        SSW ssw = this.A05;
        if (ssw == null || ssw.A04() == null) {
            return false;
        }
        return true;
    }

    public final void EJY() {
        int i;
        0fc.A01(8192, "ReactRootView.runApplication", 1856187450);
        try {
            if (this.A05 == null || !this.A0A) {
                i = -239979251;
            } else {
                Q6H currentReactContext = getCurrentReactContext();
                if (currentReactContext == null) {
                    i = -547709653;
                } else {
                    CatalystInstance A012 = currentReactContext.A01();
                    String str = this.A09;
                    0Sd.A00(str);
                    if (this.A0C) {
                        A01(true, this.A03, this.A00);
                    }
                    WritableNativeMap A0U = Pxe.A0U();
                    A0U.putDouble("rootTag", (double) this.A01);
                    Bundle bundle = this.A04;
                    if (bundle != null) {
                        A0U.putMap("initialProps", Arguments.fromBundle(bundle));
                    }
                    this.A0B = true;
                    ((AppRegistry) A012.getJSModule(AppRegistry.class)).runApplication(str, A0U);
                    i = -1644419456;
                }
            }
            0fc.A00(8192, i);
        } catch (Throwable th) {
            0fc.A00(8192, -1731826109);
            throw th;
        }
    }

    public final void finalize() {
        0Sd.A03(!this.A0A, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    public Bundle getAppProperties() {
        return this.A04;
    }

    public Q6H getCurrentReactContext() {
        SSW ssw = this.A05;
        if (ssw == null) {
            return null;
        }
        return ssw.A04();
    }

    public int getHeightMeasureSpec() {
        return this.A00;
    }

    public String getJSModuleName() {
        String str = this.A09;
        0Sd.A00(str);
        return str;
    }

    public SSW getReactInstanceManager() {
        return this.A05;
    }

    public int getRootViewTag() {
        return this.A01;
    }

    public AtomicInteger getState() {
        return this.A0I;
    }

    public String getSurfaceID() {
        Bundle bundle = this.A04;
        if (bundle != null) {
            return bundle.getString("surfaceID");
        }
        return null;
    }

    public int getUIManagerType() {
        return this.A02;
    }

    public int getWidthMeasureSpec() {
        return this.A03;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.A0C && this.A02 == 2) {
            A01(false, this.A03, this.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r13 != r11.A00) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            r1 = 8192(0x2000, double:4.0474E-320)
            java.lang.String r3 = "ReactRootView.onMeasure"
            r0 = -970344232(0xffffffffc629b8d8, float:-10862.211)
            X.0fc.A01(r1, r3, r0)
            X.RH1 r0 = X.RH1.A1g
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r0)
            int r0 = r11.A03     // Catch:{ all -> 0x00b9 }
            r8 = 0
            r4 = 1
            if (r12 != r0) goto L_0x001a
            int r0 = r11.A00     // Catch:{ all -> 0x00b9 }
            r10 = 0
            if (r13 == r0) goto L_0x001b
        L_0x001a:
            r10 = 1
        L_0x001b:
            r11.A03 = r12     // Catch:{ all -> 0x00b9 }
            r11.A00 = r13     // Catch:{ all -> 0x00b9 }
            int r0 = android.view.View.MeasureSpec.getMode(r12)     // Catch:{ all -> 0x00b9 }
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r7) goto L_0x002a
            if (r0 == 0) goto L_0x002a
            goto L_0x0050
        L_0x002a:
            r5 = 0
            r9 = 0
        L_0x002c:
            int r0 = r11.getChildCount()     // Catch:{ all -> 0x00b9 }
            if (r9 >= r0) goto L_0x0054
            android.view.View r6 = r11.getChildAt(r9)     // Catch:{ all -> 0x00b9 }
            int r3 = r6.getLeft()     // Catch:{ all -> 0x00b9 }
            int r0 = r6.getMeasuredWidth()     // Catch:{ all -> 0x00b9 }
            int r3 = r3 + r0
            int r0 = r6.getPaddingLeft()     // Catch:{ all -> 0x00b9 }
            int r3 = r3 + r0
            int r0 = r6.getPaddingRight()     // Catch:{ all -> 0x00b9 }
            int r3 = r3 + r0
            int r5 = java.lang.Math.max(r5, r3)     // Catch:{ all -> 0x00b9 }
            int r9 = r9 + 1
            goto L_0x002c
        L_0x0050:
            int r5 = android.view.View.MeasureSpec.getSize(r12)     // Catch:{ all -> 0x00b9 }
        L_0x0054:
            int r0 = android.view.View.MeasureSpec.getMode(r13)     // Catch:{ all -> 0x00b9 }
            if (r0 == r7) goto L_0x005d
            if (r0 == 0) goto L_0x005d
            goto L_0x0082
        L_0x005d:
            r6 = 0
        L_0x005e:
            int r0 = r11.getChildCount()     // Catch:{ all -> 0x00b9 }
            if (r8 >= r0) goto L_0x0086
            android.view.View r7 = r11.getChildAt(r8)     // Catch:{ all -> 0x00b9 }
            int r3 = r7.getTop()     // Catch:{ all -> 0x00b9 }
            int r0 = r7.getMeasuredHeight()     // Catch:{ all -> 0x00b9 }
            int r3 = r3 + r0
            int r0 = r7.getPaddingTop()     // Catch:{ all -> 0x00b9 }
            int r3 = r3 + r0
            int r0 = r7.getPaddingBottom()     // Catch:{ all -> 0x00b9 }
            int r3 = r3 + r0
            int r6 = java.lang.Math.max(r6, r3)     // Catch:{ all -> 0x00b9 }
            int r8 = r8 + 1
            goto L_0x005e
        L_0x0082:
            int r6 = android.view.View.MeasureSpec.getSize(r13)     // Catch:{ all -> 0x00b9 }
        L_0x0086:
            r11.setMeasuredDimension(r5, r6)     // Catch:{ all -> 0x00b9 }
            r11.A0C = r4     // Catch:{ all -> 0x00b9 }
            X.SSW r0 = r11.A05     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x009b
            boolean r0 = r11.A0A     // Catch:{ all -> 0x00b9 }
            if (r0 != 0) goto L_0x009b
            A00(r11)     // Catch:{ all -> 0x00b9 }
        L_0x0096:
            r11.A0G = r5     // Catch:{ all -> 0x00b9 }
            r11.A0D = r6     // Catch:{ all -> 0x00b9 }
            goto L_0x00ad
        L_0x009b:
            if (r10 != 0) goto L_0x00a5
            int r0 = r11.A0G     // Catch:{ all -> 0x00b9 }
            if (r0 != r5) goto L_0x00a5
            int r0 = r11.A0D     // Catch:{ all -> 0x00b9 }
            if (r0 == r6) goto L_0x0096
        L_0x00a5:
            int r3 = r11.A03     // Catch:{ all -> 0x00b9 }
            int r0 = r11.A00     // Catch:{ all -> 0x00b9 }
            r11.A01(r4, r3, r0)     // Catch:{ all -> 0x00b9 }
            goto L_0x0096
        L_0x00ad:
            X.RH1 r0 = X.RH1.A1f
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r0)
            r0 = 65784164(0x3ebc964, float:1.3858296E-36)
            X.0fc.A00(r1, r0)
            return
        L_0x00b9:
            r3 = move-exception
            X.RH1 r0 = X.RH1.A1f
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r0)
            r0 = 1636178758(0x61861b46, float:3.0922862E20)
            X.0fc.A00(r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7372Q9d.onMeasure(int, int):void");
    }

    public void setAppProperties(Bundle bundle) {
        this.A04 = bundle;
        int i = this.A01;
        if (i != 0 && i != -1) {
            EJY();
        }
    }

    public void setEventListener(C13429TaG taG) {
        this.A06 = taG;
    }

    public void setRootViewTag(int i) {
        this.A01 = i;
    }

    public void setShouldLogContentAppeared(boolean z) {
        this.A0B = z;
    }

    public C7372Q9d(Context context) {
        super(context);
        int i;
        synchronized (C9947Rk0.class) {
            i = C9947Rk0.A00;
            C9947Rk0.A00 = i + 10;
        }
        this.A01 = i;
        setClipChildren(false);
    }

    private boolean A02() {
        String str;
        if (!A05() || !this.A0A) {
            str = "Unable to dispatch touch to JS as the catalyst instance has not been attached";
        } else if (this.A08 == null) {
            str = "Unable to dispatch touch to JS before the dispatcher is available";
        } else if (!ReactFeatureFlags.dispatchPointerEvents || this.A07 != null) {
            return true;
        } else {
            str = "Unable to dispatch pointer events to JS before the dispatcher is available";
        }
        0I1.A04("ReactRootView", str);
        return false;
    }

    public final void A03(MotionEvent motionEvent) {
        String str;
        if (!A05() || !this.A0A) {
            str = "Unable to dispatch touch to JS as the catalyst instance has not been attached";
        } else if (this.A08 == null) {
            str = "Unable to dispatch touch to JS before the dispatcher is available";
        } else {
            C20877X2e A042 = UIManagerHelper.A04(getCurrentReactContext(), this.A02);
            if (A042 != null) {
                this.A08.A01(motionEvent, getCurrentReactContext(), A042);
                return;
            }
            return;
        }
        0I1.A04("ReactRootView", str);
    }

    public final void A04(MotionEvent motionEvent, boolean z) {
        String str;
        if (!A05() || !this.A0A) {
            str = "Unable to dispatch touch to JS as the catalyst instance has not been attached";
        } else if (this.A07 != null) {
            C20877X2e A042 = UIManagerHelper.A04(getCurrentReactContext(), this.A02);
            if (A042 != null) {
                this.A07.A05(motionEvent, A042, z);
                return;
            }
            return;
        } else if (ReactFeatureFlags.dispatchPointerEvents) {
            str = "Unable to dispatch pointer events to JS before the dispatcher is available";
        } else {
            return;
        }
        0I1.A04("ReactRootView", str);
    }

    public final void D1f(MotionEvent motionEvent, View view) {
        if (A02() && UIManagerHelper.A04(getCurrentReactContext(), this.A02) != null) {
            this.A08.A01 = false;
            C18801W2o w2o = this.A07;
            if (w2o != null) {
                w2o.A00 = -1;
            }
        }
    }

    public final void D1k(MotionEvent motionEvent, View view) {
        C20877X2e A042;
        if (A02() && (A042 = UIManagerHelper.A04(getCurrentReactContext(), this.A02)) != null) {
            C11245SHf sHf = this.A08;
            if (!sHf.A01) {
                C11245SHf.A00(motionEvent, sHf, A042);
                sHf.A01 = true;
                sHf.A00 = -1;
            }
            C18801W2o w2o = this.A07;
            if (w2o != null) {
                w2o.A04(motionEvent, view, A042);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.RuntimeException, X.QZA, java.lang.Exception] */
    public final void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e) {
            if (A05()) {
                String message = e.getMessage();
                0qQ.A0B(message, 1);
                ? runtimeException = new RuntimeException(message, e);
                runtimeException.A00 = this;
                getCurrentReactContext().A0C(runtimeException);
                return;
            }
            throw C41845B3m.A0j(e);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!A05() || !this.A0A) {
            0I1.A04("ReactRootView", "Unable to handle key event as the catalyst instance has not been attached");
        } else {
            SNM snm = this.A0J;
            int keyCode = keyEvent.getKeyCode();
            int action = keyEvent.getAction();
            if (action == 1 || action == 0) {
                Map map = SNM.A02;
                Integer valueOf = Integer.valueOf(keyCode);
                if (map.containsKey(valueOf)) {
                    SNM.A00(snm, DbT.A11(valueOf, map), snm.A00, action);
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-1281753175);
        super.onAttachedToWindow();
        if (this.A0A) {
            getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
        AnonymousClass0fD.A0D(-1920771215, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-908014204);
        super.onDetachedFromWindow();
        if (this.A0A) {
            getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
        AnonymousClass0fD.A0D(-1908634875, A062);
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int i2;
        int A062 = AnonymousClass0fD.A06(-148905419);
        if (!A05() || !this.A0A) {
            0I1.A04("ReactRootView", "Unable to handle focus changed event as the catalyst instance has not been attached");
            super.onFocusChanged(z, i, rect);
            i2 = 385704769;
        } else {
            SNM snm = this.A0J;
            int i3 = snm.A00;
            if (i3 != -1) {
                SNM.A00(snm, "blur", i3, -1);
            }
            snm.A00 = -1;
            super.onFocusChanged(z, i, rect);
            i2 = -1587174816;
        }
        AnonymousClass0fD.A0D(i2, A062);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        A03(motionEvent);
        A04(motionEvent, true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(187891562);
        A03(motionEvent);
        A04(motionEvent, false);
        super.onTouchEvent(motionEvent);
        AnonymousClass0fD.A0C(-1058622229, A052);
        return true;
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.A0B) {
            this.A0B = false;
            String str = this.A09;
            0Sd.A00(str);
            ReactMarker.logMarker(RH1.A0B, str, this.A01);
        }
    }

    public final void requestChildFocus(View view, View view2) {
        if (!A05() || !this.A0A) {
            0I1.A04("ReactRootView", "Unable to handle child focus changed event as the catalyst instance has not been attached");
        } else {
            SNM snm = this.A0J;
            if (snm.A00 != view2.getId()) {
                int i = snm.A00;
                if (i != -1) {
                    SNM.A00(snm, "blur", i, -1);
                }
                snm.A00 = view2.getId();
                SNM.A00(snm, "focus", view2.getId(), -1);
            }
        }
        super.requestChildFocus(view, view2);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }
}
