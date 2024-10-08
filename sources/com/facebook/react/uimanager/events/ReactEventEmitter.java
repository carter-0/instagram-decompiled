package com.facebook.react.uimanager.events;

import X.0Sd;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13947Tm7;
import X.C13948Tm8;
import X.QZK;
import com.facebook.react.bridge.ReactSoftExceptionLogger;

public class ReactEventEmitter implements RCTModernEventEmitter {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TAG = "ReactEventEmitter";
    public RCTEventEmitter mDefaultEventEmitter = null;
    public RCTModernEventEmitter mFabricEventEmitter = null;
    public final QZK mReactContext;

    public void receiveEvent(int i, String str, C13948Tm8 tm8) {
        receiveEvent(-1, i, str, tm8);
    }

    public void unregister(int i) {
        if (i == 1) {
            this.mDefaultEventEmitter = null;
        } else {
            this.mFabricEventEmitter = null;
        }
    }

    private RCTEventEmitter getDefaultEventEmitter() {
        if (this.mDefaultEventEmitter == null) {
            if (this.mReactContext.A0F()) {
                this.mDefaultEventEmitter = (RCTEventEmitter) this.mReactContext.A02(RCTEventEmitter.class);
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, new RuntimeException("Cannot get RCTEventEmitter from Context, no active Catalyst instance!"));
            }
        }
        return this.mDefaultEventEmitter;
    }

    public ReactEventEmitter(QZK qzk) {
        this.mReactContext = qzk;
    }

    public void receiveTouches(String str, C13947Tm7 tm7, C13947Tm7 tm72) {
        0Sd.A02(AnonymousClass7TF.A1R(tm7.size()));
        if (tm7.getMap(0).getInt("target") % 2 != 0 && getDefaultEventEmitter() != null) {
            this.mDefaultEventEmitter.receiveTouches(str, tm7, tm72);
        }
    }

    public void register(int i, RCTEventEmitter rCTEventEmitter) {
        this.mDefaultEventEmitter = rCTEventEmitter;
    }

    public void receiveEvent(int i, int i2, String str, boolean z, int i3, C13948Tm8 tm8, int i4) {
        int i5 = i;
        int i6 = i2;
        String str2 = str;
        C13948Tm8 tm82 = tm8;
        if (i != -1 || (i2 % 10 != 1 && i2 % 2 == 0)) {
            RCTModernEventEmitter rCTModernEventEmitter = this.mFabricEventEmitter;
            if (rCTModernEventEmitter != null) {
                rCTModernEventEmitter.receiveEvent(i5, i6, str2, z, i3, tm82, i4);
                return;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Cannot find EventEmitter for receiveEvent: SurfaceId[");
            A1A.append(i);
            A1A.append("] ReactTag[");
            A1A.append(i2);
            A1A.append("] UIManagerType[");
            A1A.append(2);
            A1A.append("] EventName[");
            A1A.append(str);
            ReactSoftExceptionLogger.logSoftException(TAG, new RuntimeException(AnonymousClass7TF.A0l("]", A1A)));
            return;
        }
        RCTEventEmitter defaultEventEmitter = getDefaultEventEmitter();
        if (defaultEventEmitter != null) {
            defaultEventEmitter.receiveEvent(i2, str, tm82);
        }
    }

    public void register(int i, RCTModernEventEmitter rCTModernEventEmitter) {
        this.mFabricEventEmitter = rCTModernEventEmitter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if ((r4 % 2) != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void receiveTouches(X.C7842QbP r22) {
        /*
            r21 = this;
            r2 = r22
            int r4 = r2.A02
            int r3 = r2.A00
            r9 = 2
            r0 = -1
            r1 = 2
            r5 = r21
            if (r3 != r0) goto L_0x0017
            r1 = 1
            int r0 = r4 % 10
            if (r0 == r1) goto L_0x0017
            int r0 = r4 % r9
            r3 = 2
            if (r0 == 0) goto L_0x0026
        L_0x0017:
            r3 = r1
            if (r1 == r9) goto L_0x0026
            com.facebook.react.uimanager.events.RCTEventEmitter r0 = r5.getDefaultEventEmitter()
            if (r0 == 0) goto L_0x0100
            com.facebook.react.uimanager.events.RCTEventEmitter r0 = r5.mDefaultEventEmitter
            X.SKV.A00(r0, r2)
            return
        L_0x0026:
            com.facebook.react.uimanager.events.RCTModernEventEmitter r13 = r5.mFabricEventEmitter
            if (r13 == 0) goto L_0x0100
            java.lang.String r3 = "TouchesHelper.sentTouchEventModern("
            java.lang.String r1 = r2.A07()
            java.lang.String r0 = ")"
            java.lang.String r4 = X.002.A0g(r3, r1, r0)
            r0 = 8192(0x2000, double:4.0474E-320)
            r3 = -409644044(0xffffffffe79553f4, float:-1.4103625E24)
            X.0fc.A01(r0, r4, r3)
            java.lang.Integer r3 = r2.A03     // Catch:{ all -> 0x00f8 }
            X.0Sd.A00(r3)     // Catch:{ all -> 0x00f8 }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x00f8 }
            android.view.MotionEvent r8 = r2.A02     // Catch:{ all -> 0x00f8 }
            X.0Sd.A00(r8)     // Catch:{ all -> 0x00f8 }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x00f8 }
            X.Tm8[] r6 = X.SKV.A01(r2)     // Catch:{ all -> 0x00f8 }
            int r4 = r3.intValue()     // Catch:{ all -> 0x00f8 }
            r7 = 0
            r5 = 0
            r3 = 1
            r18 = 0
            if (r4 == r5) goto L_0x0085
            if (r4 == r3) goto L_0x0076
            if (r4 == r9) goto L_0x0065
            r3 = 3
            if (r4 != r3) goto L_0x00f1
            goto L_0x0096
        L_0x0065:
            int r8 = r6.length     // Catch:{ all -> 0x00f8 }
            X.Tm8[] r7 = new X.C13948Tm8[r8]     // Catch:{ all -> 0x00f8 }
            r4 = 0
        L_0x0069:
            if (r4 >= r8) goto L_0x0082
            r3 = r6[r4]     // Catch:{ all -> 0x00f8 }
            X.Tm8 r3 = r3.copy()     // Catch:{ all -> 0x00f8 }
            r7[r4] = r3     // Catch:{ all -> 0x00f8 }
            int r4 = r4 + 1
            goto L_0x0069
        L_0x0076:
            int r4 = r8.getActionIndex()     // Catch:{ all -> 0x00f8 }
            r3 = r6[r4]     // Catch:{ all -> 0x00f8 }
            r6[r4] = r7     // Catch:{ all -> 0x00f8 }
            X.Tm8[] r7 = new X.C13948Tm8[]{r3}     // Catch:{ all -> 0x00f8 }
        L_0x0082:
            r3 = r6
            r6 = r7
            goto L_0x0098
        L_0x0085:
            int r3 = r8.getActionIndex()     // Catch:{ all -> 0x00f8 }
            r3 = r6[r3]     // Catch:{ all -> 0x00f8 }
            X.Tm8 r3 = r3.copy()     // Catch:{ all -> 0x00f8 }
            X.Tm8[] r4 = new X.C13948Tm8[]{r3}     // Catch:{ all -> 0x00f8 }
            r3 = r6
            r6 = r4
            goto L_0x0098
        L_0x0096:
            X.Tm8[] r3 = new X.C13948Tm8[r5]     // Catch:{ all -> 0x00f8 }
        L_0x0098:
            int r8 = r6.length     // Catch:{ all -> 0x00f8 }
        L_0x0099:
            if (r5 >= r8) goto L_0x00f1
            r4 = r6[r5]     // Catch:{ all -> 0x00f8 }
            X.Tm8 r7 = r4.copy()     // Catch:{ all -> 0x00f8 }
            com.facebook.react.bridge.WritableNativeArray r11 = new com.facebook.react.bridge.WritableNativeArray     // Catch:{ all -> 0x00f8 }
            r11.<init>()     // Catch:{ all -> 0x00f8 }
            r9 = 0
        L_0x00a7:
            if (r9 >= r8) goto L_0x00b7
            r4 = r6[r9]     // Catch:{ all -> 0x00f8 }
            if (r4 == 0) goto L_0x00b4
            X.Tm8 r4 = r4.copy()     // Catch:{ all -> 0x00f8 }
            r11.pushMap(r4)     // Catch:{ all -> 0x00f8 }
        L_0x00b4:
            int r9 = r9 + 1
            goto L_0x00a7
        L_0x00b7:
            com.facebook.react.bridge.WritableNativeArray r10 = new com.facebook.react.bridge.WritableNativeArray     // Catch:{ all -> 0x00f8 }
            r10.<init>()     // Catch:{ all -> 0x00f8 }
            int r12 = r3.length     // Catch:{ all -> 0x00f8 }
            r9 = 0
        L_0x00be:
            if (r9 >= r12) goto L_0x00ce
            r4 = r3[r9]     // Catch:{ all -> 0x00f8 }
            if (r4 == 0) goto L_0x00cb
            X.Tm8 r4 = r4.copy()     // Catch:{ all -> 0x00f8 }
            r10.pushMap(r4)     // Catch:{ all -> 0x00f8 }
        L_0x00cb:
            int r9 = r9 + 1
            goto L_0x00be
        L_0x00ce:
            java.lang.String r4 = "changedTouches"
            r7.putArray(r4, r11)     // Catch:{ all -> 0x00f8 }
            java.lang.String r4 = "touches"
            r7.putArray(r4, r10)     // Catch:{ all -> 0x00f8 }
            int r14 = r2.A00     // Catch:{ all -> 0x00f8 }
            int r15 = r2.A02     // Catch:{ all -> 0x00f8 }
            java.lang.String r16 = r2.A07()     // Catch:{ all -> 0x00f8 }
            boolean r17 = r2.A0D()     // Catch:{ all -> 0x00f8 }
            int r20 = r2.A04()     // Catch:{ all -> 0x00f8 }
            r19 = r7
            r13.receiveEvent(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00f8 }
            int r5 = r5 + 1
            goto L_0x0099
        L_0x00f1:
            r2 = -193562264(0xfffffffff4767968, float:-7.8110806E31)
            X.0fc.A00(r0, r2)
            return
        L_0x00f8:
            r3 = move-exception
            r2 = -774220593(0xffffffffd1da54cf, float:-1.17215715E11)
            X.0fc.A00(r0, r2)
            throw r3
        L_0x0100:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Cannot find EventEmitter for receivedTouches: ReactTag["
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "] UIManagerType["
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "] EventName["
            r1.append(r0)
            java.lang.String r0 = r2.A07()
            r1.append(r0)
            java.lang.String r0 = "]"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            X.TQR r1 = new X.TQR
            r1.<init>(r0)
            java.lang.String r0 = "ReactEventEmitter"
            com.facebook.react.bridge.ReactSoftExceptionLogger.logSoftException(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.events.ReactEventEmitter.receiveTouches(X.QbP):void");
    }

    public void receiveEvent(int i, int i2, String str, C13948Tm8 tm8) {
        receiveEvent(i, i2, str, false, 0, tm8, 2);
    }
}
