package com.instagram.base.activity;

import X.002;
import X.02m;
import X.07U;
import X.0KC;
import X.0LA;
import X.0PS;
import X.0Tu;
import X.0fS;
import X.0hq;
import X.0kR;
import X.0lT;
import X.0lU;
import X.0lz;
import X.0nA;
import X.0qQ;
import X.0xY;
import X.182;
import X.1ES;
import X.1Jk;
import X.2Rs;
import X.2SP;
import X.2X1;
import X.2YK;
import X.2Yn;
import X.2Yu;
import X.2db;
import X.AnonymousClass07i;
import X.AnonymousClass0fD;
import X.AnonymousClass0lf;
import X.AnonymousClass0wW;
import X.AnonymousClass0xl;
import X.AnonymousClass11X;
import X.AnonymousClass14B;
import X.AnonymousClass1GD;
import X.AnonymousClass1Jr;
import X.AnonymousClass1K7;
import X.AnonymousClass2Wn;
import X.AnonymousClass37D;
import X.AnonymousClass37F;
import X.AnonymousClass3GK;
import X.AnonymousClass3GL;
import X.AnonymousClass3GM;
import X.AnonymousClass3QE;
import X.AnonymousClass4DM;
import X.AnonymousClass4DR;
import X.AnonymousClass4v0;
import X.AnonymousClass577;
import X.AnonymousClass5FQ;
import X.AnonymousClass5FR;
import X.C226112fe;
import X.C227562jX;
import X.C249443jn;
import X.C252243on;
import X.C262154Ci;
import X.C273654mx;
import X.C340057kd;
import X.C61170le;
import X.C65806Lzy;
import X.C70942Yw;
import X.C71342cb;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.apiperf.TouchEventProvider;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class IgFragmentActivity extends AppCompatActivity implements C249443jn, AnonymousClass0lf {
    public static final AnonymousClass2Wn Companion = new Object();
    public static final String TAG = "IgFragmentActivity";
    public static final String TOUCH_EVENT_PRIVATE_FLAGS_VARIABLE_NAME = "int android.view.View.mPrivateFlags";
    public Boolean _useVolumeKeyPressController;
    public TouchEventProvider debugHeadTouchListener;
    public AnonymousClass37D mBottomSheetNavigator;
    public final Set onActivityResultListenerMap = new CopyOnWriteArraySet();
    public AnonymousClass577 responsivenessWatcher;
    public boolean subscribedToInsets;
    public C70942Yw trLogger;

    public void attachBaseContext(Context context) {
        0qQ.A0B(context, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("IgFragmentActivity.attachBaseContext", -1312784016);
        }
        try {
            super.attachBaseContext(new 2Rs(context));
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1998430372);
            }
        }
    }

    public boolean canRedirectBackPressToFeedForColdStart() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:51|(2:55|(4:59|60|(1:62)|63))|64|65) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0200, code lost:
        if (X.00l.A0d(r4, TOUCH_EVENT_PRIVATE_FLAGS_VARIABLE_NAME, false) == false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020d, code lost:
        if (X.182.A06(X.0Tu.A05, r0, 36311448816779797L) == false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020f, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("Tried to dispatch a touch event, but got an error. MotionEvent: ");
        r3.append(r1);
        X.0kD.A04("IgFragmentActivity_error_dispatching_touch_event", r3.toString(), 817902720, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x022c, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x022e, code lost:
        X.0fS.A00(1346248655);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0234, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0185 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        /*
            r21 = this;
            r2 = 0
            r1 = r22
            X.0qQ.A0B(r1, r2)
            r10 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)
            if (r0 == 0) goto L_0x0016
            r3 = 192947127(0xb8023b7, float:4.9357544E-32)
            java.lang.String r0 = "IgFragmentActivity.dispatchTouchEvent"
            X.0fS.A01(r0, r3)
        L_0x0016:
            r3 = r21
            X.0wW r0 = r3.getSession()     // Catch:{ all -> 0x024a }
            com.instagram.debug.devoptions.apiperf.TouchEventProvider r4 = r3.debugHeadTouchListener     // Catch:{ all -> 0x024a }
            if (r4 == 0) goto L_0x0023
            r4.onTouchEvent(r1)     // Catch:{ all -> 0x024a }
        L_0x0023:
            X.2Yw r5 = r3.trLogger     // Catch:{ all -> 0x024a }
            if (r5 == 0) goto L_0x0034
            if (r0 == 0) goto L_0x0034
            boolean r4 = r5.A02     // Catch:{ all -> 0x024a }
            if (r4 != 0) goto L_0x0034
            android.content.Context r4 = r3.getApplicationContext()     // Catch:{ all -> 0x024a }
            X.C70942Yw.A00(r4, r0, r5)     // Catch:{ all -> 0x024a }
        L_0x0034:
            X.2Yw r6 = r3.trLogger     // Catch:{ all -> 0x024a }
            if (r6 == 0) goto L_0x0062
            X.4ux r4 = r6.A00     // Catch:{ all -> 0x024a }
            if (r4 == 0) goto L_0x004d
            boolean r5 = r4.A02     // Catch:{ all -> 0x024a }
            if (r5 == 0) goto L_0x004d
            int r7 = r1.getAction()     // Catch:{ all -> 0x024a }
            r5 = 1
            if (r7 == 0) goto L_0x00d0
            int r7 = r1.getAction()     // Catch:{ all -> 0x024a }
            if (r7 == r5) goto L_0x00d0
        L_0x004d:
            X.To6 r4 = r6.A01     // Catch:{ all -> 0x024a }
            if (r4 == 0) goto L_0x0062
            boolean r5 = r4.A01     // Catch:{ all -> 0x024a }
            if (r5 == 0) goto L_0x0062
            int r6 = r1.getAction()     // Catch:{ all -> 0x024a }
            r5 = 1
            if (r6 == 0) goto L_0x0067
            int r6 = r1.getAction()     // Catch:{ all -> 0x024a }
            if (r6 == r5) goto L_0x0067
        L_0x0062:
            X.1Jk.A03(r1)     // Catch:{ all -> 0x024a }
            goto L_0x0132
        L_0x0067:
            int r14 = r4.A00     // Catch:{ all -> 0x024a }
            int r6 = r14 + 1
            r4.A00 = r6     // Catch:{ all -> 0x024a }
            com.facebook.quicklog.QuickPerformanceLogger r12 = r4.A03     // Catch:{ all -> 0x024a }
            long r15 = r12.currentMonotonicTimestamp()     // Catch:{ all -> 0x024a }
            long r19 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x024a }
            long r6 = r1.getEventTime()     // Catch:{ all -> 0x024a }
            long r19 = r19 - r6
            r13 = 566768946(0x21c83532, float:1.3566608E-18)
            long r15 = r15 - r19
            java.util.concurrent.TimeUnit r17 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x024a }
            r12.markerStart(r13, r14, r15, r17)     // Catch:{ all -> 0x024a }
            X.2Yx r6 = r4.A04     // Catch:{ all -> 0x024a }
            if (r6 == 0) goto L_0x0099
            X.1Rm r6 = X.1Rm.A00()     // Catch:{ all -> 0x024a }
            java.lang.String r7 = r6.A00     // Catch:{ all -> 0x024a }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x024a }
            java.lang.String r6 = "endpoint"
            r12.markerAnnotate(r13, r14, r6, r7)     // Catch:{ all -> 0x024a }
        L_0x0099:
            java.lang.String r6 = ""
            int r7 = r1.getAction()     // Catch:{ all -> 0x024a }
            if (r7 == 0) goto L_0x00a4
            if (r7 != r5) goto L_0x00a9
            goto L_0x00a7
        L_0x00a4:
            java.lang.String r6 = "touch_down"
            goto L_0x00a9
        L_0x00a7:
            java.lang.String r6 = "touch_up"
        L_0x00a9:
            java.lang.String r5 = "touch_delivered"
            r12.markerPoint(r13, r14, r5)     // Catch:{ all -> 0x024a }
            java.lang.String r5 = "touch_phase"
            r12.markerAnnotate(r13, r14, r5, r6)     // Catch:{ all -> 0x024a }
            java.lang.String r18 = "ontouch_delay"
            r15 = r12
            r16 = r13
            r17 = r14
            r15.markerAnnotate(r16, r17, r18, r19)     // Catch:{ all -> 0x024a }
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x024a }
            android.os.Handler r6 = r4.A02     // Catch:{ all -> 0x024a }
            X.ToK r5 = new X.ToK     // Catch:{ all -> 0x024a }
            r13 = r4
            r12 = r5
            r17 = r19
            r12.<init>(r13, r14, r15, r17)     // Catch:{ all -> 0x024a }
            r6.post(r5)     // Catch:{ all -> 0x024a }
            goto L_0x0062
        L_0x00d0:
            int r14 = r4.A00     // Catch:{ all -> 0x024a }
            int r7 = r14 + 1
            r4.A00 = r7     // Catch:{ all -> 0x024a }
            com.facebook.quicklog.QuickPerformanceLogger r12 = r4.A05     // Catch:{ all -> 0x024a }
            long r15 = r12.currentMonotonicTimestamp()     // Catch:{ all -> 0x024a }
            long r19 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x024a }
            long r7 = r1.getEventTime()     // Catch:{ all -> 0x024a }
            long r19 = r19 - r7
            r13 = 566762171(0x21c81abb, float:1.3559603E-18)
            long r15 = r15 - r19
            java.util.concurrent.TimeUnit r17 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x024a }
            r12.markerStart(r13, r14, r15, r17)     // Catch:{ all -> 0x024a }
            X.02m r9 = X.02m.A0p     // Catch:{ all -> 0x024a }
            X.1Rm r7 = X.1Rm.A00()     // Catch:{ all -> 0x024a }
            java.lang.String r8 = r7.A00     // Catch:{ all -> 0x024a }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x024a }
            java.lang.String r7 = "module"
            r9.markerAnnotate(r13, r14, r7, r8)     // Catch:{ all -> 0x024a }
            java.lang.String r7 = "touch_delivered"
            r12.markerPoint(r13, r14, r7)     // Catch:{ all -> 0x024a }
            java.lang.String r18 = "ontouch_delay"
            r15 = r12
            r16 = r13
            r17 = r14
            r15.markerAnnotate(r16, r17, r18, r19)     // Catch:{ all -> 0x024a }
            int r8 = r1.getAction()     // Catch:{ all -> 0x024a }
            java.lang.String r7 = "touch_phase"
            if (r8 == 0) goto L_0x011c
            if (r8 != r5) goto L_0x0121
            java.lang.String r5 = "touch_up"
            goto L_0x011e
        L_0x011c:
            java.lang.String r5 = "touch_down"
        L_0x011e:
            r12.markerAnnotate(r13, r14, r7, r5)     // Catch:{ all -> 0x024a }
        L_0x0121:
            X.To9 r7 = new X.To9     // Catch:{ all -> 0x024a }
            r7.<init>(r4, r14)     // Catch:{ all -> 0x024a }
            X.ToA r5 = new X.ToA     // Catch:{ all -> 0x024a }
            r5.<init>(r4, r7)     // Catch:{ all -> 0x024a }
            android.view.Choreographer r4 = r4.A01     // Catch:{ all -> 0x024a }
            r4.postFrameCallback(r5)     // Catch:{ all -> 0x024a }
            goto L_0x004d
        L_0x0132:
            if (r0 == 0) goto L_0x018e
            X.4v0 r7 = X.AnonymousClass4v0.A00(r0)     // Catch:{ all -> 0x024a }
            java.lang.Integer r6 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x024a }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x024a }
            X.AnonymousClass4v0.A01(r7, r6, r4)     // Catch:{ all -> 0x024a }
            boolean r4 = r0 instanceof com.instagram.common.session.UserSession     // Catch:{ all -> 0x024a }
            if (r4 == 0) goto L_0x0185
            boolean r4 = r3.isAttributionTouchListenerEnabled()     // Catch:{ all -> 0x024a }
            if (r4 == 0) goto L_0x0185
            r6 = r0
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6     // Catch:{ all -> 0x024a }
            X.0qQ.A0B(r6, r2)     // Catch:{ all -> 0x024a }
            java.lang.Class<X.4v7> r5 = X.C277404v7.class
            X.4v8 r4 = X.C277414v8.A00     // Catch:{ all -> 0x024a }
            java.lang.Object r6 = r6.A01(r5, r4)     // Catch:{ all -> 0x024a }
            X.4v7 r6 = (X.C277404v7) r6     // Catch:{ all -> 0x024a }
            int r4 = r1.getAction()     // Catch:{ all -> 0x024a }
            if (r4 != 0) goto L_0x0185
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x024a }
            java.lang.Thread r5 = r4.getThread()     // Catch:{ all -> 0x024a }
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x024a }
            boolean r4 = X.0qQ.A0K(r5, r4)     // Catch:{ all -> 0x024a }
            if (r4 == 0) goto L_0x0185
            java.util.concurrent.LinkedBlockingDeque r5 = r6.A00     // Catch:{ NullPointerException -> 0x0185 }
            int r4 = r5.remainingCapacity()     // Catch:{ NullPointerException -> 0x0185 }
            if (r4 != 0) goto L_0x017e
            r5.pollLast()     // Catch:{ NullPointerException -> 0x0185 }
        L_0x017e:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r1)     // Catch:{ NullPointerException -> 0x0185 }
            r5.offerFirst(r4)     // Catch:{ NullPointerException -> 0x0185 }
        L_0x0185:
            X.2Hy r5 = X.2Hy.A04     // Catch:{ all -> 0x024a }
            X.2cb r4 = X.2cc.A0T     // Catch:{ all -> 0x024a }
            java.lang.String r4 = r4.A01(r0)     // Catch:{ all -> 0x024a }
            goto L_0x0199
        L_0x018e:
            X.2Hy r5 = X.2Hy.A04     // Catch:{ all -> 0x024a }
            X.1Rm r4 = X.1Rm.A00()     // Catch:{ all -> 0x024a }
            java.lang.String r4 = r4.A00     // Catch:{ all -> 0x024a }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x024a }
        L_0x0199:
            r5.A01(r1, r4)     // Catch:{ all -> 0x024a }
            X.7kd r4 = r3.getGnvGestureHandler()     // Catch:{ all -> 0x024a }
            if (r4 == 0) goto L_0x01e3
            X.3LT r7 = r4.A01     // Catch:{ all -> 0x024a }
            if (r7 == 0) goto L_0x01e3
            X.A7M r5 = r4.A00     // Catch:{ all -> 0x024a }
            if (r5 == 0) goto L_0x01e3
            X.7ke r4 = r4.A02     // Catch:{ all -> 0x024a }
            X.0eK r4 = r4.A05     // Catch:{ all -> 0x024a }
            java.lang.Object r6 = r4.get()     // Catch:{ all -> 0x024a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x024a }
            X.A8A r5 = r5.A02     // Catch:{ all -> 0x024a }
            boolean r4 = r5.A08     // Catch:{ all -> 0x024a }
            if (r4 == 0) goto L_0x01c4
            if (r6 == 0) goto L_0x01e3
            java.util.List r4 = r5.A01     // Catch:{ all -> 0x024a }
            boolean r4 = r4.contains(r6)     // Catch:{ all -> 0x024a }
            if (r4 == 0) goto L_0x01e3
        L_0x01c4:
            boolean r4 = r5.A09     // Catch:{ all -> 0x024a }
            if (r4 == 0) goto L_0x01d2
            if (r6 == 0) goto L_0x01d2
            java.util.List r4 = r5.A02     // Catch:{ all -> 0x024a }
            boolean r4 = r4.contains(r6)     // Catch:{ all -> 0x024a }
            if (r4 != 0) goto L_0x01e3
        L_0x01d2:
            X.A7M r4 = r7.A08     // Catch:{ all -> 0x024a }
            boolean r4 = r4.A05     // Catch:{ all -> 0x024a }
            if (r4 == 0) goto L_0x01e0
            X.9b3 r4 = r7.A0A     // Catch:{ all -> 0x024a }
            android.view.GestureDetector r4 = r4.A01     // Catch:{ all -> 0x024a }
        L_0x01dc:
            r4.onTouchEvent(r1)     // Catch:{ all -> 0x024a }
            goto L_0x01e3
        L_0x01e0:
            android.view.GestureDetector r4 = r7.A07     // Catch:{ all -> 0x024a }
            goto L_0x01dc
        L_0x01e3:
            r7 = 0
            boolean r7 = com.instagram.base.activity.IgFragmentActivity.super.dispatchTouchEvent(r1)     // Catch:{ Exception -> 0x01e9 }
            goto L_0x0235
        L_0x01e9:
            r6 = move-exception
            boolean r3 = r6 instanceof java.lang.NullPointerException     // Catch:{ all -> 0x024a }
            if (r3 == 0) goto L_0x0202
            java.lang.String r3 = r6.getMessage()     // Catch:{ all -> 0x024a }
            if (r3 == 0) goto L_0x0202
            java.lang.String r4 = r6.getMessage()     // Catch:{ all -> 0x024a }
            if (r4 == 0) goto L_0x0242
            java.lang.String r3 = "int android.view.View.mPrivateFlags"
            boolean r3 = X.00l.A0d(r4, r3, r2)     // Catch:{ all -> 0x024a }
            if (r3 != 0) goto L_0x020f
        L_0x0202:
            X.0Tu r5 = X.0Tu.A05     // Catch:{ all -> 0x024a }
            r3 = 36311448816779797(0x81011200010215, double:3.0268446739753835E-306)
            boolean r0 = X.182.A06(r5, r0, r3)     // Catch:{ all -> 0x024a }
            if (r0 == 0) goto L_0x0235
        L_0x020f:
            r5 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.String r4 = "IgFragmentActivity_error_dispatching_touch_event"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x024a }
            r3.<init>()     // Catch:{ all -> 0x024a }
            java.lang.String r0 = "Tried to dispatch a touch event, but got an error. MotionEvent: "
            r3.append(r0)     // Catch:{ all -> 0x024a }
            r3.append(r1)     // Catch:{ all -> 0x024a }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x024a }
            X.0kD.A04(r4, r0, r5, r6)     // Catch:{ all -> 0x024a }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)
            if (r0 == 0) goto L_0x0234
            r0 = 1346248655(0x503e1fcf, float:1.27590226E10)
            X.0fS.A00(r0)
        L_0x0234:
            return r2
        L_0x0235:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)
            if (r0 == 0) goto L_0x0241
            r0 = 614472679(0x24a01be7, float:6.943621E-17)
            X.0fS.A00(r0)
        L_0x0241:
            return r7
        L_0x0242:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x024a }
            r0.<init>(r1)     // Catch:{ all -> 0x024a }
            throw r0     // Catch:{ all -> 0x024a }
        L_0x024a:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r10)
            if (r0 == 0) goto L_0x0257
            r0 = -937870979(0xffffffffc819397d, float:-156901.95)
            X.0fS.A00(r0)
        L_0x0257:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.base.activity.IgFragmentActivity.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:20|(2:21|(3:23|(1:51)(1:(2:30|(2:50|32)(1:52))(1:48))|47)(1:49))|29|33|34|(4:37|(2:39|55)(1:54)|53|35)|40|41|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006b, code lost:
        if (X.W2D.A03("tracking", r2) == false) goto L_0x006d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0134 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dump(java.lang.String r21, java.io.FileDescriptor r22, java.io.PrintWriter r23, java.lang.String[] r24) {
        /*
            r20 = this;
            r13 = 0
            r3 = r21
            X.0qQ.A0B(r3, r13)
            r0 = 2
            r11 = r23
            X.0qQ.A0B(r11, r0)
            r2 = r24
            if (r24 == 0) goto L_0x0152
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0152
            r1 = r24[r13]
            java.lang.String r0 = "e2e"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0152
            X.W2D r9 = X.W2D.A05
            if (r9 != 0) goto L_0x0028
            X.W2D r9 = new X.W2D
            r9.<init>()
            X.W2D.A05 = r9
        L_0x0028:
            java.lang.String r0 = "JEST_E2E_DUMPSYS_HELPER"
            r11.println(r0)
            java.lang.String r1 = X.0LA.A00()
            java.lang.String r0 = "ENDPOINT "
            java.lang.String r0 = X.002.A0R(r0, r1)
            r11.println(r0)
            r11.print(r3)
            java.lang.String r0 = "Top Level Window View Hierarchy:"
            r11.println(r0)
            java.lang.String r0 = "all-roots"
            boolean r8 = X.W2D.A03(r0, r2)
            java.lang.String r0 = "top-root"
            boolean r7 = X.W2D.A03(r0, r2)
            java.lang.String r0 = "webview"
            boolean r15 = X.W2D.A03(r0, r2)
            java.lang.String r0 = "jpc"
            boolean r18 = X.W2D.A03(r0, r2)
            java.lang.String r0 = "props"
            boolean r16 = X.W2D.A03(r0, r2)
            r0 = 1
            if (r16 == 0) goto L_0x006d
            java.lang.String r1 = "tracking"
            boolean r1 = X.W2D.A03(r1, r2)
            r17 = 1
            if (r1 != 0) goto L_0x006f
        L_0x006d:
            r17 = 0
        L_0x006f:
            java.lang.String r1 = "ignore-cd-for-text"
            boolean r19 = X.W2D.A03(r1, r2)
            X.OL2 r1 = r9.A03     // Catch:{ Exception -> 0x013f }
            java.util.ArrayList r2 = r1.A00()     // Catch:{ Exception -> 0x013f }
            if (r2 == 0) goto L_0x0151
            boolean r1 = r2.isEmpty()     // Catch:{ Exception -> 0x013f }
            if (r1 != 0) goto L_0x0151
            java.util.Collections.reverse(r2)     // Catch:{ Exception -> 0x013f }
            r5 = 0
            java.util.Iterator r6 = r2.iterator()     // Catch:{ Exception -> 0x013f }
        L_0x008b:
            boolean r1 = r6.hasNext()     // Catch:{ Exception -> 0x013f }
            if (r1 == 0) goto L_0x00b0
            java.lang.Object r2 = r6.next()     // Catch:{ Exception -> 0x013f }
            X.OAj r2 = (X.C70535OAj) r2     // Catch:{ Exception -> 0x013f }
            android.view.View r10 = r2.A00     // Catch:{ Exception -> 0x013f }
            int r1 = r10.getVisibility()     // Catch:{ Exception -> 0x013f }
            if (r1 != 0) goto L_0x008b
            if (r8 != 0) goto L_0x00b3
            if (r5 == 0) goto L_0x00b3
            android.view.WindowManager$LayoutParams r1 = r2.A01     // Catch:{ Exception -> 0x013f }
            int r4 = r1.type     // Catch:{ Exception -> 0x013f }
            int r1 = r5.type     // Catch:{ Exception -> 0x013f }
            int r4 = r4 - r1
            int r1 = java.lang.Math.abs(r4)     // Catch:{ Exception -> 0x013f }
            if (r1 == r0) goto L_0x00b3
        L_0x00b0:
            X.VQg r3 = r9.A02     // Catch:{ Exception -> 0x013f }
            goto L_0x00c2
        L_0x00b3:
            java.lang.String r1 = "  "
            java.lang.String r12 = X.002.A0R(r3, r1)     // Catch:{ Exception -> 0x013f }
            r14 = r13
            r9.A04(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x013f }
            android.view.WindowManager$LayoutParams r5 = r2.A01     // Catch:{ Exception -> 0x013f }
            if (r7 == 0) goto L_0x008b
            goto L_0x00b0
        L_0x00c2:
            java.util.Set r1 = r3.A01     // Catch:{ Exception -> 0x0134 }
            java.util.Iterator r6 = r1.iterator()     // Catch:{ Exception -> 0x0134 }
        L_0x00c8:
            boolean r1 = r6.hasNext()     // Catch:{ Exception -> 0x0134 }
            if (r1 == 0) goto L_0x0134
            java.lang.Object r5 = r6.next()     // Catch:{ Exception -> 0x0134 }
            X.Vsk r5 = (X.C18489Vsk) r5     // Catch:{ Exception -> 0x0134 }
            java.util.Map r1 = r3.A00     // Catch:{ Exception -> 0x0134 }
            java.lang.String r12 = r5.A04     // Catch:{ Exception -> 0x0134 }
            java.lang.Object r4 = r1.get(r12)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0134 }
            if (r4 == 0) goto L_0x00c8
            java.lang.String r1 = "WebView HTML for "
            r11.print(r1)     // Catch:{ Exception -> 0x0134 }
            r11.print(r5)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r1 = ":"
            r11.println(r1)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r2 = "\\u003C"
            java.lang.String r1 = "<"
            java.lang.String r4 = r4.replace(r2, r1)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r2 = "\\n"
            java.lang.String r1 = ""
            java.lang.String r4 = r4.replace(r2, r1)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r2 = "\\\""
            java.lang.String r1 = "\""
            java.lang.String r2 = r4.replace(r2, r1)     // Catch:{ Exception -> 0x0134 }
            int r1 = r5.A01     // Catch:{ Exception -> 0x0134 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0134 }
            int r1 = r5.A02     // Catch:{ Exception -> 0x0134 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0134 }
            int r1 = r5.A03     // Catch:{ Exception -> 0x0134 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0134 }
            int r1 = r5.A00     // Catch:{ Exception -> 0x0134 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0134 }
            int r1 = r2.length()     // Catch:{ Exception -> 0x0134 }
            int r1 = r1 - r0
            java.lang.String r17 = r2.substring(r0, r1)     // Catch:{ Exception -> 0x0134 }
            java.lang.Object[] r2 = new java.lang.Object[]{r12, r13, r14, r15, r16, r17}     // Catch:{ Exception -> 0x0134 }
            java.lang.String r1 = "<html id=\"%s\" data-rect=\"%d,%d,%d,%d\">%s</html>"
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ Exception -> 0x0134 }
            r11.println(r1)     // Catch:{ Exception -> 0x0134 }
            goto L_0x00c8
        L_0x0134:
            java.util.Set r0 = r3.A01     // Catch:{ Exception -> 0x013f }
            r0.clear()     // Catch:{ Exception -> 0x013f }
            java.util.Map r0 = r3.A00     // Catch:{ Exception -> 0x013f }
            r0.clear()     // Catch:{ Exception -> 0x013f }
            return
        L_0x013f:
            r2 = move-exception
            r0 = 567(0x237, float:7.95E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            java.lang.String r0 = r2.getMessage()
            java.lang.String r0 = X.002.A0R(r1, r0)
            r11.println(r0)
        L_0x0151:
            return
        L_0x0152:
            r1 = r20
            r0 = r22
            com.instagram.base.activity.IgFragmentActivity.super.dump(r3, r0, r11, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.base.activity.IgFragmentActivity.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.base.activity.IgFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public AnonymousClass37D getBottomSheetNavigator() {
        String A00;
        AnonymousClass0wW session = getSession();
        if (session != null) {
            if (isFinishing()) {
                A00 = "Activity is finishing";
            } else if (isDestroyed()) {
                A00 = "Activity is destroyed";
            }
            0KC.A0D(TAG, A00);
            return null;
        }
        AnonymousClass37D r3 = this.mBottomSheetNavigator;
        if (r3 != null) {
            return r3;
        }
        if (session == null) {
            A00 = C273654mx.A00(1376);
            0KC.A0D(TAG, A00);
            return null;
        }
        Window window = getWindow();
        if (!(window == null || window.getDecorView() == null)) {
            View bottomSheetRootView = getBottomSheetRootView();
            0qQ.A0B(bottomSheetRootView, 0);
            if (!(bottomSheetRootView.findViewById(R.id.bottom_sheet_container) == null && bottomSheetRootView.findViewById(R.id.bottom_sheet_container_stub) == null)) {
                View bottomSheetRootView2 = getBottomSheetRootView();
                0hq supportFragmentManager = getSupportFragmentManager();
                0qQ.A07(supportFragmentManager);
                0qQ.A0B(bottomSheetRootView2, 1);
                AnonymousClass37F r32 = new AnonymousClass37F(this, bottomSheetRootView2, supportFragmentManager, session, R.id.layout_container_bottom_sheet, true);
                this.mBottomSheetNavigator = r32;
                return r32;
            }
        }
        return null;
    }

    public C340057kd getGnvGestureHandler() {
        return null;
    }

    public abstract AnonymousClass0wW getSession();

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity] */
    public void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("IgFragmentActivity.onConfigurationChanged", -714194484);
        }
        try {
            super.onConfigurationChanged(configuration);
            0nA.A00 = null;
            Resources resources = getResources();
            if (resources instanceof C262154Ci) {
                ((C262154Ci) resources).A01(configuration);
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-16603078);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (super.onKeyDown(r5, r6) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            r0 = 1
            X.0qQ.A0B(r6, r0)
            r2 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r2)
            if (r0 == 0) goto L_0x0014
            r1 = -351587966(0xffffffffeb0b3182, float:-1.6827448E26)
            java.lang.String r0 = "IgFragmentActivity.onKeyDown"
            X.0fS.A01(r0, r1)
        L_0x0014:
            boolean r0 = X.1Jk.A07     // Catch:{ all -> 0x0055 }
            boolean r0 = X.AnonymousClass1Jr.A05     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0028
            X.1Jq r0 = X.AnonymousClass1Jr.A00()     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x0055 }
            X.42c r0 = new X.42c     // Catch:{ all -> 0x0055 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x0055 }
            X.AnonymousClass1Jr.A02(r0)     // Catch:{ all -> 0x0055 }
        L_0x0028:
            boolean r0 = X.1Jk.A07     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x003a
            X.1Jq r0 = X.1Jk.A00()     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x0055 }
            X.42c r0 = new X.42c     // Catch:{ all -> 0x0055 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x0055 }
            X.1Jk.A06(r0)     // Catch:{ all -> 0x0055 }
        L_0x003a:
            boolean r0 = r4.handleVolumeKey(r5, r6)     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0047
            boolean r0 = super.onKeyDown(r5, r6)     // Catch:{ all -> 0x0055 }
            r1 = 0
            if (r0 == 0) goto L_0x0048
        L_0x0047:
            r1 = 1
        L_0x0048:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r2)
            if (r0 == 0) goto L_0x0054
            r0 = -465640499(0xffffffffe43ee3cd, float:-1.4085185E22)
            X.0fS.A00(r0)
        L_0x0054:
            return r1
        L_0x0055:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r2)
            if (r0 == 0) goto L_0x0062
            r0 = 347908540(0x14bca9bc, float:1.9050097E-26)
            X.0fS.A00(r0)
        L_0x0062:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.base.activity.IgFragmentActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        0qQ.A0B(keyEvent, 1);
        if (Systrace.A0E(1)) {
            0fS.A01("IgFragmentActivity.onKeyUp", 1875777590);
        }
        try {
            boolean z = 1Jk.A07;
            if (AnonymousClass1Jr.A05) {
                AnonymousClass1Jr.A02(new AnonymousClass5FR(keyEvent, AnonymousClass1Jr.A00().A01));
            }
            if (1Jk.A07) {
                1Jk.A06(new AnonymousClass5FR(keyEvent, 1Jk.A00().A01));
            }
            C227562jX fragment = getFragment();
            boolean z2 = true;
            if (!(fragment instanceof C227562jX) || !fragment.CIn(i, keyEvent)) {
                if (!handleVolumeKey(i, keyEvent) && !IgFragmentActivity.super.onKeyUp(i, keyEvent)) {
                    z2 = false;
                }
            }
            return z2;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1102190875);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public void onRestoreInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("IgFragmentActivity.onRestoreInstanceState", 1754002483);
        }
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            0qQ.A0A(classLoader);
            2YK.A00(bundle, classLoader);
            IgFragmentActivity.super.onRestoreInstanceState(bundle);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-813584398);
            }
        }
    }

    public void registerOnActivityResultListener(C252243on r3) {
        0qQ.A0B(r3, 0);
        synchronized (this.onActivityResultListenerMap) {
            this.onActivityResultListenerMap.add(r3);
        }
    }

    public void unregisterOnActivityResultListener(C252243on r3) {
        0qQ.A0B(r3, 0);
        synchronized (this.onActivityResultListenerMap) {
            this.onActivityResultListenerMap.remove(r3);
        }
    }

    private final void executePendingActions() {
        AnonymousClass3GK r1 = AnonymousClass3GK.A00;
        if (!r1.isEmpty()) {
            r1.removeFirst();
            throw new NullPointerException("execute");
        }
    }

    private final boolean getUseVolumeKeyPressController() {
        Boolean bool = this._useVolumeKeyPressController;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (getSession() == null) {
            return false;
        }
        this._useVolumeKeyPressController = true;
        return true;
    }

    private final void handleRegisteredOnActivityResultListeners(int i, int i2, Intent intent) {
        synchronized (this.onActivityResultListenerMap) {
            for (C252243on onActivityResult : this.onActivityResultListenerMap) {
                onActivityResult.onActivityResult(i, i2, intent);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.instagram.base.activity.IgFragmentActivity] */
    /* access modifiers changed from: private */
    public final boolean isTransparentThemeAndroid15() {
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        getTheme().resolveAttribute(16842836, typedValue, true);
        getTheme().resolveAttribute(16842840, typedValue2, true);
        if (typedValue2.data != 0 || (typedValue.isColorType() && typedValue.data == 0)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.instagram.base.activity.IgFragmentActivity] */
    private final void startMainActivity() {
        0kR.A0B(this, AnonymousClass14B.A03.A00().A03(this, 268566528));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public void configureWindowInsetsAndroid15() {
        if (!this.subscribedToInsets && 0lz.A02(this)) {
            this.subscribedToInsets = true;
            C226112fe.A0B.A04(this, new C65806Lzy(this), false);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (Systrace.A0E(1)) {
            0fS.A01("IgFragmentActivity.onActivityResult", -717160125);
        }
        try {
            IgFragmentActivity.super.onActivityResult(i, i2, intent);
            handleRegisteredOnActivityResultListeners(i, i2, intent);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-664832117);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [androidx.activity.ComponentActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public void onBackPressed() {
        int i;
        if (Systrace.A0E(1)) {
            0fS.A01("IgFragmentActivity.onBackPressed", 1408487883);
        }
        try {
            AnonymousClass37D r0 = this.mBottomSheetNavigator;
            if (r0 == null || !r0.A0X()) {
                AnonymousClass4DR fragment = getFragment();
                if (!(fragment instanceof AnonymousClass4DR) || !fragment.onBackPressed()) {
                    UserSession session = getSession();
                    if (session != null) {
                        C71342cb.A00(session).A0A(this, "back");
                    }
                    if (Build.VERSION.SDK_INT != 29 || getSupportFragmentManager().A0M() != 0 || !isTaskRoot() || getOnBackPressedDispatcher().A01) {
                        if (shouldRedirectBackPressForColdStart()) {
                            startMainActivity();
                        }
                        if (fragment != null && fragment.mLifecycleRegistry.A07().compareTo(07U.A01) < 0 && session != null && (session instanceof UserSession)) {
                            if (182.A06(0Tu.A05, session, 36319123923278765L)) {
                                if (Systrace.A0E(1)) {
                                    i = 2029627774;
                                } else {
                                    return;
                                }
                            }
                        }
                        IgFragmentActivity.super.onBackPressed();
                        if (Systrace.A0E(1)) {
                            i = -1453797639;
                        } else {
                            return;
                        }
                    } else {
                        finishAfterTransition();
                        if (Systrace.A0E(1)) {
                            i = 1968410805;
                        } else {
                            return;
                        }
                    }
                } else if (Systrace.A0E(1)) {
                    i = -20713344;
                } else {
                    return;
                }
            } else if (Systrace.A0E(1)) {
                i = 2052952466;
            } else {
                return;
            }
            0fS.A00(i);
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(-1922839413);
            }
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e9, code lost:
        if (r12 != 2) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e7, code lost:
        if (r5 != 2) goto L_0x01e9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0203 A[Catch:{ all -> 0x0230 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0212 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0105 A[Catch:{ all -> 0x0134, all -> 0x0148 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0114 A[Catch:{ all -> 0x0134, all -> 0x0148 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0120 A[Catch:{ all -> 0x015c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            java.lang.Class<com.instagram.base.activity.IgFragmentActivity> r17 = com.instagram.base.activity.IgFragmentActivity.class
            r0 = -311357174(0xffffffffed71110a, float:-4.6629054E27)
            int r3 = X.AnonymousClass0fD.A00(r0)
            r4 = r18
            java.lang.Class r0 = r4.getClass()
            java.lang.String r13 = r0.getName()
            X.02m r6 = X.02m.A0p
            java.lang.String r8 = ""
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r9 = "Required value was null."
            java.lang.String r1 = "IgFragmentActivity.onCreate"
            r7 = -1
            r11 = r19
            if (r6 == 0) goto L_0x0171
            X.2SP r0 = X.2SP.A01
            int r5 = r0.A03()
            r2 = 694558626(0x29661fa2, float:5.1097696E-14)
            r6.markerStart(r2, r5)
            java.lang.String r12 = X.0LA.A00()
            java.lang.String r0 = "endpoint"
            r6.markerAnnotate(r2, r5, r0, r12)
            java.lang.String r12 = X.0LA.A01()
            java.lang.String r0 = "asl_session_id"
            r6.markerAnnotate(r2, r5, r0, r12)
            java.lang.String r15 = "<cls>"
            java.lang.String r14 = "</cls>"
            java.lang.String r12 = X.002.A0g(r15, r13, r14)
            java.lang.String r0 = "activityClass"
            r6.markerAnnotate(r2, r5, r0, r12)
            java.lang.String r13 = r17.getName()
            java.lang.String r12 = X.002.A0g(r15, r13, r14)
            java.lang.String r0 = "method_class"
            r6.markerAnnotate(r2, r5, r0, r12)
            java.lang.String r0 = "operation_name"
            java.lang.String r12 = "onCreate"
            r6.markerAnnotate(r2, r5, r0, r12)
            r0 = 46
            java.lang.String r12 = X.002.A0T(r13, r12, r0)     // Catch:{ all -> 0x015c }
            r15 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r15)     // Catch:{ all -> 0x015c }
            if (r0 == 0) goto L_0x0075
            r0 = -877367902(0xffffffffcbb46da2, float:-2.3649092E7)
            X.0fS.A01(r12, r0)     // Catch:{ all -> 0x015c }
        L_0x0075:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r15)     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x0081
            r0 = -2102617767(0xffffffff82ac9959, float:-2.5361146E-37)
            X.0fS.A01(r1, r0)     // Catch:{ all -> 0x0148 }
        L_0x0081:
            X.0lU.A00(r4)     // Catch:{ all -> 0x0134 }
            r13 = 0
            r4.responsivenessWatcher = r13     // Catch:{ all -> 0x0134 }
            boolean r0 = com.instagram.debug.devoptions.apiperf.DebugHeadPlugin.isAvailable()     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0095
            com.instagram.debug.devoptions.apiperf.DebugHeadPlugin r0 = com.instagram.debug.devoptions.apiperf.DebugHeadPlugin.sInstance     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0095
            com.instagram.debug.devoptions.debughead.data.provider.DebugHeadTouchListener r0 = com.instagram.debug.devoptions.debughead.data.provider.DebugHeadTouchListener.INSTANCE     // Catch:{ all -> 0x0134 }
            r4.debugHeadTouchListener = r0     // Catch:{ all -> 0x0134 }
        L_0x0095:
            X.0wX r0 = X.C61170le.A00     // Catch:{ all -> 0x0134 }
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)     // Catch:{ all -> 0x0134 }
            int r12 = r0.A00()     // Catch:{ all -> 0x0134 }
            if (r12 != r7) goto L_0x00b5
            X.0xa r1 = X.AnonymousClass1GD.A00()     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = "KEY_CONFIG_CURRENT_SYSTEM_UI_MODE"
            int r14 = r1.getInt(r0, r7)     // Catch:{ all -> 0x0134 }
            r1 = 32
            r0 = 1
            if (r14 != r1) goto L_0x00b1
            r0 = 2
        L_0x00b1:
            X.2X1.A01(r0)     // Catch:{ all -> 0x0134 }
            goto L_0x00b8
        L_0x00b5:
            X.2X1.A01(r12)     // Catch:{ all -> 0x0134 }
        L_0x00b8:
            if (r19 == 0) goto L_0x00c3
            java.lang.ClassLoader r0 = r17.getClassLoader()     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0128
            X.2YK.A00(r11, r0)     // Catch:{ all -> 0x0134 }
        L_0x00c3:
            com.instagram.base.activity.IgFragmentActivity.super.onCreate(r11)     // Catch:{ all -> 0x0134 }
            r4.setupColorTheme()     // Catch:{ all -> 0x0134 }
            X.0lU.A01(r4)     // Catch:{ all -> 0x0134 }
            r4.setVolumeControlStream(r10)     // Catch:{ all -> 0x0134 }
            r0 = 16843857(0x1010451, float:2.3696655E-38)
            int r1 = X.2Yu.A0F(r4, r0)     // Catch:{ all -> 0x0134 }
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 | r0
            android.app.ActivityManager$TaskDescription r0 = new android.app.ActivityManager$TaskDescription     // Catch:{ all -> 0x0134 }
            r0.<init>(r8, r13, r1)     // Catch:{ all -> 0x0134 }
            r4.setTaskDescription(r0)     // Catch:{ all -> 0x0134 }
            if (r12 == r7) goto L_0x00eb
            r0 = 1
            if (r12 == r0) goto L_0x00ed
            r0 = 2
            r1 = 32
            if (r12 == r0) goto L_0x00ef
        L_0x00eb:
            r1 = 0
            goto L_0x00ef
        L_0x00ed:
            r1 = 16
        L_0x00ef:
            X.AnonymousClass2Wn.A00()     // Catch:{ all -> 0x0134 }
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ all -> 0x0134 }
            X.AnonymousClass1GD.A02(r0, r1)     // Catch:{ all -> 0x0134 }
            X.0wW r7 = r4.getSession()     // Catch:{ all -> 0x0134 }
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x0134 }
            X.2Yw r0 = X.C70942Yw.A05     // Catch:{ all -> 0x0134 }
            if (r0 != 0) goto L_0x010c
            X.2Yw r0 = new X.2Yw     // Catch:{ all -> 0x0134 }
            r0.<init>(r1, r7)     // Catch:{ all -> 0x0134 }
            X.C70942Yw.A05 = r0     // Catch:{ all -> 0x0134 }
        L_0x010c:
            r4.trLogger = r0     // Catch:{ all -> 0x0134 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r15)     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x011a
            r0 = 156095380(0x94dd394, float:2.4775461E-33)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0148 }
        L_0x011a:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r15)     // Catch:{ all -> 0x015c }
            if (r0 == 0) goto L_0x0219
            r0 = -1618603700(0xffffffff9f86114c, float:-5.677982E-20)
            X.0fS.A00(r0)     // Catch:{ all -> 0x015c }
            goto L_0x0219
        L_0x0128:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0134 }
            r1.<init>(r9)     // Catch:{ all -> 0x0134 }
            r0 = 1246483589(0x4a4bd485, float:3339553.2)
            X.AnonymousClass0fD.A07(r0, r3)     // Catch:{ all -> 0x0134 }
            throw r1     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r15)     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x0141
            r0 = -2080962450(0xffffffff83f7086e, float:-1.4519291E-36)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0148 }
        L_0x0141:
            r0 = -1991909547(0xffffffff8945df55, float:-2.3818023E-33)
            X.AnonymousClass0fD.A07(r0, r3)     // Catch:{ all -> 0x0148 }
            throw r1     // Catch:{ all -> 0x0148 }
        L_0x0148:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r15)     // Catch:{ all -> 0x015c }
            if (r0 == 0) goto L_0x0155
            r0 = -408632481(0xffffffffe7a4c35f, float:-1.5561441E24)
            X.0fS.A00(r0)     // Catch:{ all -> 0x015c }
        L_0x0155:
            r0 = -1316786574(0xffffffffb1836e72, float:-3.825158E-9)
            X.AnonymousClass0fD.A07(r0, r3)     // Catch:{ all -> 0x015c }
            throw r1     // Catch:{ all -> 0x015c }
        L_0x015c:
            r1 = move-exception
            r0 = 577702468(0x226f0a44, float:3.2395974E-18)
            X.AnonymousClass0fD.A07(r0, r3)     // Catch:{ all -> 0x0164 }
            throw r1     // Catch:{ all -> 0x0164 }
        L_0x0164:
            r1 = move-exception
            r0 = 87
            r6.markerEnd(r2, r5, r0)
            r0 = 1770089109(0x69816a95, float:1.9556844E25)
            X.AnonymousClass0fD.A07(r0, r3)
            throw r1
        L_0x0171:
            r12 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r12)
            if (r0 == 0) goto L_0x017f
            r0 = -85233245(0xfffffffffaeb71a3, float:-6.112473E35)
            X.0fS.A01(r1, r0)
        L_0x017f:
            X.0lU.A00(r4)     // Catch:{ all -> 0x0230 }
            r6 = 0
            r4.responsivenessWatcher = r6     // Catch:{ all -> 0x0230 }
            boolean r0 = com.instagram.debug.devoptions.apiperf.DebugHeadPlugin.isAvailable()     // Catch:{ all -> 0x0230 }
            if (r0 == 0) goto L_0x0193
            com.instagram.debug.devoptions.apiperf.DebugHeadPlugin r0 = com.instagram.debug.devoptions.apiperf.DebugHeadPlugin.sInstance     // Catch:{ all -> 0x0230 }
            if (r0 == 0) goto L_0x0193
            com.instagram.debug.devoptions.debughead.data.provider.DebugHeadTouchListener r0 = com.instagram.debug.devoptions.debughead.data.provider.DebugHeadTouchListener.INSTANCE     // Catch:{ all -> 0x0230 }
            r4.debugHeadTouchListener = r0     // Catch:{ all -> 0x0230 }
        L_0x0193:
            X.0wX r0 = X.C61170le.A00     // Catch:{ all -> 0x0230 }
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)     // Catch:{ all -> 0x0230 }
            int r5 = r0.A00()     // Catch:{ all -> 0x0230 }
            if (r5 != r7) goto L_0x01b3
            X.0xa r1 = X.AnonymousClass1GD.A00()     // Catch:{ all -> 0x0230 }
            java.lang.String r0 = "KEY_CONFIG_CURRENT_SYSTEM_UI_MODE"
            int r2 = r1.getInt(r0, r7)     // Catch:{ all -> 0x0230 }
            r1 = 32
            r0 = 1
            if (r2 != r1) goto L_0x01af
            r0 = 2
        L_0x01af:
            X.2X1.A01(r0)     // Catch:{ all -> 0x0230 }
            goto L_0x01b6
        L_0x01b3:
            X.2X1.A01(r5)     // Catch:{ all -> 0x0230 }
        L_0x01b6:
            if (r19 == 0) goto L_0x01c1
            java.lang.ClassLoader r0 = r17.getClassLoader()     // Catch:{ all -> 0x0230 }
            if (r0 == 0) goto L_0x0224
            X.2YK.A00(r11, r0)     // Catch:{ all -> 0x0230 }
        L_0x01c1:
            com.instagram.base.activity.IgFragmentActivity.super.onCreate(r11)     // Catch:{ all -> 0x0230 }
            r4.setupColorTheme()     // Catch:{ all -> 0x0230 }
            X.0lU.A01(r4)     // Catch:{ all -> 0x0230 }
            r4.setVolumeControlStream(r10)     // Catch:{ all -> 0x0230 }
            r0 = 16843857(0x1010451, float:2.3696655E-38)
            int r1 = X.2Yu.A0F(r4, r0)     // Catch:{ all -> 0x0230 }
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 | r0
            android.app.ActivityManager$TaskDescription r0 = new android.app.ActivityManager$TaskDescription     // Catch:{ all -> 0x0230 }
            r0.<init>(r8, r6, r1)     // Catch:{ all -> 0x0230 }
            r4.setTaskDescription(r0)     // Catch:{ all -> 0x0230 }
            if (r5 == r7) goto L_0x01e9
            r0 = 1
            if (r5 == r0) goto L_0x01eb
            r0 = 2
            r1 = 32
            if (r5 == r0) goto L_0x01ed
        L_0x01e9:
            r1 = 0
            goto L_0x01ed
        L_0x01eb:
            r1 = 16
        L_0x01ed:
            X.AnonymousClass2Wn.A00()     // Catch:{ all -> 0x0230 }
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ all -> 0x0230 }
            X.AnonymousClass1GD.A02(r0, r1)     // Catch:{ all -> 0x0230 }
            X.0wW r2 = r4.getSession()     // Catch:{ all -> 0x0230 }
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x0230 }
            X.2Yw r0 = X.C70942Yw.A05     // Catch:{ all -> 0x0230 }
            if (r0 != 0) goto L_0x020a
            X.2Yw r0 = new X.2Yw     // Catch:{ all -> 0x0230 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0230 }
            X.C70942Yw.A05 = r0     // Catch:{ all -> 0x0230 }
        L_0x020a:
            r4.trLogger = r0     // Catch:{ all -> 0x0230 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r12)
            if (r0 == 0) goto L_0x021d
            r0 = 187387692(0xb2b4f2c, float:3.2992964E-32)
            X.0fS.A00(r0)
            goto L_0x021d
        L_0x0219:
            r0 = 2
            r6.markerEnd(r2, r5, r0)
        L_0x021d:
            r0 = -1413474064(0xffffffffabc018f0, float:-1.3649342E-12)
            X.AnonymousClass0fD.A07(r0, r3)
            return
        L_0x0224:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0230 }
            r1.<init>(r9)     // Catch:{ all -> 0x0230 }
            r0 = 1927663851(0x72e5d0eb, float:9.103953E30)
            X.AnonymousClass0fD.A07(r0, r3)     // Catch:{ all -> 0x0230 }
            throw r1     // Catch:{ all -> 0x0230 }
        L_0x0230:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r12)
            if (r0 == 0) goto L_0x023d
            r0 = 983641209(0x3aa12c79, float:0.0012296579)
            X.0fS.A00(r0)
        L_0x023d:
            r0 = 1028374565(0x3d4bc025, float:0.04974379)
            X.AnonymousClass0fD.A07(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.base.activity.IgFragmentActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.activity.ComponentActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public void onTrimMemory(int i) {
        if (Systrace.A0E(1)) {
            0fS.A01("IgFragmentActivity.onTrimMemory", -1907450718);
        }
        try {
            IgFragmentActivity.super.onTrimMemory(i);
            AnonymousClass1K7.A00().A07(i);
            onLowMemory();
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1339425305);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public void onWindowFocusChanged(boolean z) {
        if (Systrace.A0E(1)) {
            0fS.A01("IgFragmentActivity.onWindowFocusChanged", 302666338);
        }
        try {
            IgFragmentActivity.super.onWindowFocusChanged(z);
            if (Systrace.A0E(1)) {
                0fS.A01("ActivityListenerManager.activityWindowFocusChanged", -956123121);
            }
            Set<0lT> set = 0lU.A00;
            0lU.A0A(new 0PS(this, set, z), "onActivityWindowFocusChanged", set.size());
            for (0lT Ctp : set) {
                Ctp.Ctp(this, z);
            }
            if (Systrace.A0E(1)) {
                0fS.A00(-1375439509);
            }
            if (Systrace.A0E(1)) {
                0fS.A00(-161502499);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(1184645724);
            }
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.07Z, android.content.Context, com.instagram.base.activity.IgFragmentActivity] */
    public void schedule(AnonymousClass11X r3) {
        if (r3 != null) {
            1ES.A00(this, AnonymousClass07i.A00(this), r3);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void setDefaultNightMode(int i) {
        0xY AR4 = AnonymousClass0xl.A00(C61170le.A00).A00.AR4();
        AR4.E5Z("dark_mode_toggle_setting", i);
        AR4.E5Z("dark_mode_toggle_override_previous_value", i);
        AR4.apply();
        int i2 = 2X1.A00;
        2X1.A01(i);
        if (i == -1) {
            int i3 = 1;
            if (AnonymousClass1GD.A00().getInt("KEY_CONFIG_CURRENT_SYSTEM_UI_MODE", -1) == 32) {
                i3 = 2;
            }
            if (i2 != i3) {
                recreate();
            }
        }
    }

    private final Fragment getFragment() {
        return getSupportFragmentManager().A0P(R.id.layout_container_main);
    }

    private final boolean handleVolumeKey(int i, KeyEvent keyEvent, List list) {
        boolean handleVolumeKey;
        AnonymousClass5FQ r0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass4DM r1 = (Fragment) it.next();
            if (r1 instanceof AnonymousClass4DM) {
                AnonymousClass4DM r12 = r1;
                if (i == 25) {
                    r0 = AnonymousClass5FQ.VOLUME_DOWN;
                } else {
                    r0 = AnonymousClass5FQ.VOLUME_UP;
                }
                handleVolumeKey = r12.onVolumeKeyPressed(r0, keyEvent);
                continue;
            } else {
                List A04 = r1.getChildFragmentManager().A0U.A04();
                0qQ.A07(A04);
                handleVolumeKey = handleVolumeKey(i, keyEvent, A04);
                continue;
            }
            if (handleVolumeKey) {
                return true;
            }
        }
        return false;
    }

    private final boolean isAttributionTouchListenerEnabled() {
        return 182.A06(0Tu.A05, getSession(), 36324960783839766L);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.base.activity.IgFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    private final boolean shouldRedirectBackPressForColdStart() {
        if (!182.A06(0Tu.A05, getSession(), 36323045229341462L) || getIntent() == null || getSupportFragmentManager().A0M() > 0 || !isTaskRoot() || !canRedirectBackPressToFeedForColdStart() || getSession() == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public void configureBackgroundColorAndroid15() {
        int color = getColor(2Yu.A0C(this));
        2db.A02(this, color);
        getWindow().getDecorView().setBackgroundColor(color);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public View getBottomSheetRootView() {
        View decorView = getWindow().getDecorView();
        0qQ.A07(decorView);
        return decorView;
    }

    public final AnonymousClass4v0 getInteractionLogger() {
        AnonymousClass0wW session = getSession();
        if (session != null) {
            return AnonymousClass4v0.A00(session);
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r12v0, types: [android.content.Context, java.lang.Object, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    public void onDestroy() {
        int A00 = AnonymousClass0fD.A00(1870482225);
        Class<IgFragmentActivity> cls = IgFragmentActivity.class;
        String name = getClass().getName();
        02m r5 = 02m.A0p;
        if (r5 != null) {
            int A03 = 2SP.A01.A03();
            r5.markerStart(694558626, A03);
            r5.markerAnnotate(694558626, A03, "endpoint", 0LA.A00());
            r5.markerAnnotate(694558626, A03, "asl_session_id", 0LA.A01());
            r5.markerAnnotate(694558626, A03, "activityClass", 002.A0g("<cls>", name, "</cls>"));
            String name2 = cls.getName();
            r5.markerAnnotate(694558626, A03, "method_class", 002.A0g("<cls>", name2, "</cls>"));
            r5.markerAnnotate(694558626, A03, "operation_name", "onDestroy");
            try {
                String A0T = 002.A0T(name2, "onDestroy", '.');
                if (Systrace.A0E(1)) {
                    0fS.A01(A0T, 953750011);
                }
                try {
                    if (Systrace.A0E(1)) {
                        0fS.A01("IgFragmentActivity.onDestroy", -1003582970);
                    }
                    super.onDestroy();
                    if (getSession() != null) {
                        this.mBottomSheetNavigator = null;
                    }
                    this.onActivityResultListenerMap.clear();
                    0lU.A02(this);
                    AnonymousClass3QE.A00(this);
                    if (Systrace.A0E(1)) {
                        0fS.A00(644522438);
                    }
                    if (Systrace.A0E(1)) {
                        0fS.A00(-2043815933);
                    }
                    r5.markerEnd(694558626, A03, 2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1)) {
                        0fS.A00(1981411846);
                    }
                    AnonymousClass0fD.A07(-287244253, A00);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    AnonymousClass0fD.A07(-1966735591, A00);
                    throw th2;
                } catch (Throwable th3) {
                    r5.markerEnd(694558626, A03, 87);
                    AnonymousClass0fD.A07(-2031916391, A00);
                    throw th3;
                }
            }
        } else {
            if (Systrace.A0E(1)) {
                0fS.A01("IgFragmentActivity.onDestroy", 2098005094);
            }
            try {
                super.onDestroy();
                if (getSession() != null) {
                    this.mBottomSheetNavigator = null;
                }
                this.onActivityResultListenerMap.clear();
                0lU.A02(this);
                AnonymousClass3QE.A00(this);
            } finally {
                if (Systrace.A0E(1)) {
                    0fS.A00(928663132);
                }
                AnonymousClass0fD.A07(-1384788485, A00);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, com.instagram.base.activity.IgFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public void onPause() {
        int A00 = AnonymousClass0fD.A00(-2087975887);
        Class<IgFragmentActivity> cls = IgFragmentActivity.class;
        String name = getClass().getName();
        02m r5 = 02m.A0p;
        if (r5 != null) {
            int A03 = 2SP.A01.A03();
            r5.markerStart(694558626, A03);
            r5.markerAnnotate(694558626, A03, "endpoint", 0LA.A00());
            r5.markerAnnotate(694558626, A03, "asl_session_id", 0LA.A01());
            r5.markerAnnotate(694558626, A03, "activityClass", 002.A0g("<cls>", name, "</cls>"));
            String name2 = cls.getName();
            r5.markerAnnotate(694558626, A03, "method_class", 002.A0g("<cls>", name2, "</cls>"));
            r5.markerAnnotate(694558626, A03, "operation_name", "onPause");
            try {
                String A0T = 002.A0T(name2, "onPause", '.');
                if (Systrace.A0E(1)) {
                    0fS.A01(A0T, -1183625969);
                }
                try {
                    if (Systrace.A0E(1)) {
                        0fS.A01("IgFragmentActivity.onPause", -1833696191);
                    }
                    IgFragmentActivity.super.onPause();
                    0lU.A03(this);
                    if (getSession() != null && AnonymousClass3GL.A00(getSession())) {
                        AnonymousClass3GM r0 = AnonymousClass3GM.A01;
                        AnonymousClass3GM.A00 = new WeakReference((Object) null);
                    }
                    C70942Yw r02 = this.trLogger;
                    if (r02 != null) {
                        r02.A01();
                    }
                    1Jk.A08.A0B();
                    if (Systrace.A0E(1)) {
                        0fS.A00(528205332);
                    }
                    if (Systrace.A0E(1)) {
                        0fS.A00(-638365646);
                    }
                    r5.markerEnd(694558626, A03, 2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1)) {
                        0fS.A00(-975544022);
                    }
                    AnonymousClass0fD.A07(-1260921241, A00);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    AnonymousClass0fD.A07(-1416089119, A00);
                    throw th2;
                } catch (Throwable th3) {
                    r5.markerEnd(694558626, A03, 87);
                    AnonymousClass0fD.A07(804198497, A00);
                    throw th3;
                }
            }
        } else {
            if (Systrace.A0E(1)) {
                0fS.A01("IgFragmentActivity.onPause", -15417943);
            }
            try {
                IgFragmentActivity.super.onPause();
                0lU.A03(this);
                if (getSession() != null && AnonymousClass3GL.A00(getSession())) {
                    AnonymousClass3GM r03 = AnonymousClass3GM.A01;
                    AnonymousClass3GM.A00 = new WeakReference((Object) null);
                }
                C70942Yw r04 = this.trLogger;
                if (r04 != null) {
                    r04.A01();
                }
                1Jk.A08.A0B();
            } finally {
                if (Systrace.A0E(1)) {
                    0fS.A00(1241994653);
                }
                AnonymousClass0fD.A07(-1089027443, A00);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, com.instagram.base.activity.IgFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public void onResume() {
        int A00 = AnonymousClass0fD.A00(1127377374);
        Class<IgFragmentActivity> cls = IgFragmentActivity.class;
        String name = getClass().getName();
        02m r5 = 02m.A0p;
        if (r5 != null) {
            int A03 = 2SP.A01.A03();
            r5.markerStart(694558626, A03);
            r5.markerAnnotate(694558626, A03, "endpoint", 0LA.A00());
            r5.markerAnnotate(694558626, A03, "asl_session_id", 0LA.A01());
            r5.markerAnnotate(694558626, A03, "activityClass", 002.A0g("<cls>", name, "</cls>"));
            String name2 = cls.getName();
            r5.markerAnnotate(694558626, A03, "method_class", 002.A0g("<cls>", name2, "</cls>"));
            r5.markerAnnotate(694558626, A03, "operation_name", "onResume");
            try {
                String A0T = 002.A0T(name2, "onResume", '.');
                if (Systrace.A0E(1)) {
                    0fS.A01(A0T, -1456481113);
                }
                try {
                    if (Systrace.A0E(1)) {
                        0fS.A01("IgFragmentActivity.onResume", 1594214439);
                    }
                    IgFragmentActivity.super.onResume();
                    0lU.A04(this);
                    executePendingActions();
                    if (getSession() != null && AnonymousClass3GL.A00(getSession())) {
                        AnonymousClass3GM r0 = AnonymousClass3GM.A01;
                        AnonymousClass3GM.A00 = new WeakReference(this);
                    }
                    C70942Yw r02 = this.trLogger;
                    if (r02 != null) {
                        r02.A02();
                    }
                    configureWindowInsetsAndroid15();
                    if (Systrace.A0E(1)) {
                        0fS.A00(1733459963);
                    }
                    if (Systrace.A0E(1)) {
                        0fS.A00(591409870);
                    }
                    r5.markerEnd(694558626, A03, 2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1)) {
                        0fS.A00(-1837197241);
                    }
                    AnonymousClass0fD.A07(1031856156, A00);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    AnonymousClass0fD.A07(-1343964378, A00);
                    throw th2;
                } catch (Throwable th3) {
                    r5.markerEnd(694558626, A03, 87);
                    AnonymousClass0fD.A07(746151694, A00);
                    throw th3;
                }
            }
        } else {
            if (Systrace.A0E(1)) {
                0fS.A01("IgFragmentActivity.onResume", -569703215);
            }
            try {
                IgFragmentActivity.super.onResume();
                0lU.A04(this);
                executePendingActions();
                if (getSession() != null && AnonymousClass3GL.A00(getSession())) {
                    AnonymousClass3GM r03 = AnonymousClass3GM.A01;
                    AnonymousClass3GM.A00 = new WeakReference(this);
                }
                C70942Yw r04 = this.trLogger;
                if (r04 != null) {
                    r04.A02();
                }
                configureWindowInsetsAndroid15();
            } finally {
                if (Systrace.A0E(1)) {
                    0fS.A00(326332581);
                }
                AnonymousClass0fD.A07(896821635, A00);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    public void onStart() {
        int A00 = AnonymousClass0fD.A00(-1316889764);
        Class<IgFragmentActivity> cls = IgFragmentActivity.class;
        String name = getClass().getName();
        02m r5 = 02m.A0p;
        if (r5 != null) {
            int A03 = 2SP.A01.A03();
            r5.markerStart(694558626, A03);
            r5.markerAnnotate(694558626, A03, "endpoint", 0LA.A00());
            r5.markerAnnotate(694558626, A03, "asl_session_id", 0LA.A01());
            r5.markerAnnotate(694558626, A03, "activityClass", 002.A0g("<cls>", name, "</cls>"));
            String name2 = cls.getName();
            r5.markerAnnotate(694558626, A03, "method_class", 002.A0g("<cls>", name2, "</cls>"));
            r5.markerAnnotate(694558626, A03, "operation_name", "onStart");
            try {
                String A0T = 002.A0T(name2, "onStart", '.');
                if (Systrace.A0E(1)) {
                    0fS.A01(A0T, -1688449042);
                }
                try {
                    if (Systrace.A0E(1)) {
                        0fS.A01("IgFragmentActivity.onStart", -1614079066);
                    }
                    super.onStart();
                    0lU.A05(this);
                    if (Systrace.A0E(1)) {
                        0fS.A00(1099751003);
                    }
                    if (Systrace.A0E(1)) {
                        0fS.A00(-116549452);
                    }
                    r5.markerEnd(694558626, A03, 2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1)) {
                        0fS.A00(-1879479402);
                    }
                    AnonymousClass0fD.A07(1872510837, A00);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    AnonymousClass0fD.A07(-947981473, A00);
                    throw th2;
                } catch (Throwable th3) {
                    r5.markerEnd(694558626, A03, 87);
                    AnonymousClass0fD.A07(1879762050, A00);
                    throw th3;
                }
            }
        } else {
            if (Systrace.A0E(1)) {
                0fS.A01("IgFragmentActivity.onStart", 223567766);
            }
            try {
                super.onStart();
                0lU.A05(this);
            } finally {
                if (Systrace.A0E(1)) {
                    0fS.A00(1609061791);
                }
                AnonymousClass0fD.A07(-2143557386, A00);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    public void onStop() {
        int A00 = AnonymousClass0fD.A00(-1827184599);
        Class<IgFragmentActivity> cls = IgFragmentActivity.class;
        String name = getClass().getName();
        02m r5 = 02m.A0p;
        if (r5 != null) {
            int A03 = 2SP.A01.A03();
            r5.markerStart(694558626, A03);
            r5.markerAnnotate(694558626, A03, "endpoint", 0LA.A00());
            r5.markerAnnotate(694558626, A03, "asl_session_id", 0LA.A01());
            r5.markerAnnotate(694558626, A03, "activityClass", 002.A0g("<cls>", name, "</cls>"));
            String name2 = cls.getName();
            r5.markerAnnotate(694558626, A03, "method_class", 002.A0g("<cls>", name2, "</cls>"));
            r5.markerAnnotate(694558626, A03, "operation_name", "onStop");
            try {
                String A0T = 002.A0T(name2, "onStop", '.');
                if (Systrace.A0E(1)) {
                    0fS.A01(A0T, 193248112);
                }
                try {
                    if (Systrace.A0E(1)) {
                        0fS.A01("IgFragmentActivity.onStop", -1374353684);
                    }
                    super.onStop();
                    0lU.A06(this);
                    if (Systrace.A0E(1)) {
                        0fS.A00(-1270081487);
                    }
                    if (Systrace.A0E(1)) {
                        0fS.A00(-1450843930);
                    }
                    r5.markerEnd(694558626, A03, 2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1)) {
                        0fS.A00(-685922095);
                    }
                    AnonymousClass0fD.A07(1137271518, A00);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    AnonymousClass0fD.A07(-796065155, A00);
                    throw th2;
                } catch (Throwable th3) {
                    r5.markerEnd(694558626, A03, 87);
                    AnonymousClass0fD.A07(-1778596518, A00);
                    throw th3;
                }
            }
        } else {
            if (Systrace.A0E(1)) {
                0fS.A01("IgFragmentActivity.onStop", -443684979);
            }
            try {
                super.onStop();
                0lU.A06(this);
            } finally {
                if (Systrace.A0E(1)) {
                    0fS.A00(-1571730667);
                }
                AnonymousClass0fD.A07(1192150004, A00);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.instagram.base.activity.IgFragmentActivity] */
    public final void setupColorTheme() {
        getTheme().applyStyle(2Yn.A00(), true);
    }

    public final void onUpPressed() {
        onBackPressed();
    }

    private final boolean handleVolumeKey(int i, KeyEvent keyEvent) {
        AnonymousClass5FQ r0;
        if (i == 25 || i == 24) {
            boolean useVolumeKeyPressController = getUseVolumeKeyPressController();
            List<AnonymousClass4DM> A04 = getSupportFragmentManager().A0U.A04();
            if (useVolumeKeyPressController) {
                0qQ.A07(A04);
                return handleVolumeKey(i, keyEvent, A04);
            }
            for (AnonymousClass4DM r1 : A04) {
                if (r1 instanceof AnonymousClass4DM) {
                    AnonymousClass4DM r12 = r1;
                    if (i == 25) {
                        r0 = AnonymousClass5FQ.VOLUME_DOWN;
                    } else {
                        r0 = AnonymousClass5FQ.VOLUME_UP;
                    }
                    if (r12.onVolumeKeyPressed(r0, keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
