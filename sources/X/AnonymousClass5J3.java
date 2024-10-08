package X;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.5J3  reason: invalid class name */
public final class AnonymousClass5J3 implements AnonymousClass5J4 {
    public AnonymousClass5J9 A00;
    public final AnonymousClass5J5 A01;
    public final SidecarInterface A02;
    public final Map A03 = new LinkedHashMap();
    public final Map A04 = new LinkedHashMap();

    public final void A02(Activity activity, IBinder iBinder) {
        Map map = this.A04;
        map.put(iBinder, activity);
        SidecarInterface sidecarInterface = this.A02;
        if (sidecarInterface != null) {
            sidecarInterface.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (map.size() == 1 && sidecarInterface != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        AnonymousClass5J9 r1 = this.A00;
        if (r1 != null) {
            r1.E0T(activity, A00(activity));
        }
        Map map2 = this.A03;
        if (map2.get(activity) == null && (activity instanceof AnonymousClass4D2)) {
            AnonymousClass5JE r0 = new AnonymousClass5JE(activity, this);
            map2.put(activity, r0);
            ((AnonymousClass4D2) activity).addOnConfigurationChangedListener(r0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055 A[Catch:{ NoSuchFieldError -> 0x00a3, all -> 0x0156 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0111 A[Catch:{ NoSuchFieldError -> 0x00a3, all -> 0x0156 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03() {
        /*
            r8 = this;
            r2 = 1
            r6 = 0
            androidx.window.sidecar.SidecarInterface r7 = r8.A02     // Catch:{ all -> 0x0156 }
            r5 = 0
            if (r7 == 0) goto L_0x0028
            java.lang.Class r3 = r7.getClass()     // Catch:{ all -> 0x0156 }
            if (r3 == 0) goto L_0x0028
            java.lang.String r1 = "setSidecarCallback"
            java.lang.Class<androidx.window.sidecar.SidecarInterface$SidecarCallback> r0 = androidx.window.sidecar.SidecarInterface.SidecarCallback.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x0156 }
            java.lang.reflect.Method r0 = r3.getMethod(r1, r0)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x0028
            java.lang.Class r3 = r0.getReturnType()     // Catch:{ all -> 0x0156 }
        L_0x001f:
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ all -> 0x0156 }
            boolean r0 = X.0qQ.A0K(r3, r0)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x0128
            goto L_0x002a
        L_0x0028:
            r3 = r5
            goto L_0x001f
        L_0x002a:
            if (r7 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r3 = r5
            goto L_0x004d
        L_0x002f:
            r7.getDeviceState()     // Catch:{ all -> 0x0156 }
            r7.onDeviceStateListenersChanged(r2)     // Catch:{ all -> 0x0156 }
            java.lang.Class r3 = r7.getClass()     // Catch:{ all -> 0x0156 }
            if (r3 == 0) goto L_0x002d
            java.lang.String r1 = "getWindowLayoutInfo"
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x0156 }
            java.lang.reflect.Method r0 = r3.getMethod(r1, r0)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x002d
            java.lang.Class r3 = r0.getReturnType()     // Catch:{ all -> 0x0156 }
        L_0x004d:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r0 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            boolean r0 = X.0qQ.A0K(r3, r0)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x0111
            if (r7 == 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r3 = r5
            goto L_0x0072
        L_0x005a:
            java.lang.Class r3 = r7.getClass()     // Catch:{ all -> 0x0156 }
            if (r3 == 0) goto L_0x0058
            java.lang.String r1 = "onWindowLayoutChangeListenerAdded"
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x0156 }
            java.lang.reflect.Method r0 = r3.getMethod(r1, r0)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x0058
            java.lang.Class r3 = r0.getReturnType()     // Catch:{ all -> 0x0156 }
        L_0x0072:
            java.lang.Class r4 = java.lang.Void.TYPE     // Catch:{ all -> 0x0156 }
            boolean r0 = X.0qQ.A0K(r3, r4)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x00fa
            if (r7 == 0) goto L_0x0094
            java.lang.Class r3 = r7.getClass()     // Catch:{ all -> 0x0156 }
            if (r3 == 0) goto L_0x0094
            java.lang.String r1 = "onWindowLayoutChangeListenerRemoved"
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x0156 }
            java.lang.reflect.Method r0 = r3.getMethod(r1, r0)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x0094
            java.lang.Class r5 = r0.getReturnType()     // Catch:{ all -> 0x0156 }
        L_0x0094:
            boolean r0 = X.0qQ.A0K(r5, r4)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x013f
            androidx.window.sidecar.SidecarDeviceState r5 = new androidx.window.sidecar.SidecarDeviceState     // Catch:{ all -> 0x0156 }
            r5.<init>()     // Catch:{ all -> 0x0156 }
            r3 = 3
            r5.posture = r3     // Catch:{ NoSuchFieldError -> 0x00a3 }
            goto L_0x00df
        L_0x00a3:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r4 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r1 = "setPosture"
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0156 }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x0156 }
            java.lang.reflect.Method r1 = r4.getMethod(r1, r0)     // Catch:{ all -> 0x0156 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0156 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0156 }
            r1.invoke(r5, r0)     // Catch:{ all -> 0x0156 }
            java.lang.String r1 = "getPosture"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ all -> 0x0156 }
            java.lang.reflect.Method r1 = r4.getMethod(r1, r0)     // Catch:{ all -> 0x0156 }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0156 }
            java.lang.Object r1 = r1.invoke(r5, r0)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x0156 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0156 }
            int r0 = r1.intValue()     // Catch:{ all -> 0x0156 }
            if (r0 == r3) goto L_0x00df
            java.lang.String r0 = "Invalid device posture getter/setter"
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x0156 }
            r1.<init>(r0)     // Catch:{ all -> 0x0156 }
            goto L_0x0155
        L_0x00df:
            androidx.window.sidecar.SidecarDisplayFeature r1 = new androidx.window.sidecar.SidecarDisplayFeature     // Catch:{ all -> 0x0156 }
            r1.<init>()     // Catch:{ all -> 0x0156 }
            android.graphics.Rect r0 = r1.getRect()     // Catch:{ all -> 0x0156 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0156 }
            r1.setRect(r0)     // Catch:{ all -> 0x0156 }
            r1.getType()     // Catch:{ all -> 0x0156 }
            r1.setType(r2)     // Catch:{ all -> 0x0156 }
            androidx.window.sidecar.SidecarWindowLayoutInfo r0 = new androidx.window.sidecar.SidecarWindowLayoutInfo     // Catch:{ all -> 0x0156 }
            r0.<init>()     // Catch:{ all -> 0x0156 }
            return r2
        L_0x00fa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0156 }
            r1.<init>()     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
            r1.append(r0)     // Catch:{ all -> 0x0156 }
            r1.append(r3)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0156 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0156 }
            r1.<init>(r0)     // Catch:{ all -> 0x0156 }
            goto L_0x0155
        L_0x0111:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0156 }
            r1.<init>()     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "Illegal return type for 'getWindowLayoutInfo': "
            r1.append(r0)     // Catch:{ all -> 0x0156 }
            r1.append(r3)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0156 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0156 }
            r1.<init>(r0)     // Catch:{ all -> 0x0156 }
            goto L_0x0155
        L_0x0128:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0156 }
            r1.<init>()     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "Illegal return type for 'setSidecarCallback': "
            r1.append(r0)     // Catch:{ all -> 0x0156 }
            r1.append(r3)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0156 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0156 }
            r1.<init>(r0)     // Catch:{ all -> 0x0156 }
            goto L_0x0155
        L_0x013f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0156 }
            r1.<init>()     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
            r1.append(r0)     // Catch:{ all -> 0x0156 }
            r1.append(r5)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0156 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0156 }
            r1.<init>(r0)     // Catch:{ all -> 0x0156 }
        L_0x0155:
            throw r1     // Catch:{ all -> 0x0156 }
        L_0x0156:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5J3.A03():boolean");
    }

    public final SidecarInterface A01() {
        return this.A02;
    }

    public final void EVl(AnonymousClass5J8 r5) {
        this.A00 = new AnonymousClass5J9(r5);
        SidecarInterface sidecarInterface = this.A02;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.A01, new SidecarCompat$TranslatingCallback(this)));
        }
    }

    public AnonymousClass5J3(Context context) {
        SidecarInterface A022 = AnonymousClass4Vn.A02(context);
        AnonymousClass5J5 r0 = new AnonymousClass5J5(AnonymousClass05K.A0C);
        this.A02 = A022;
        this.A01 = r0;
    }

    public final C265674Vs A00(Activity activity) {
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo;
        SidecarDeviceState sidecarDeviceState;
        IBinder A002 = AnonymousClass4Vn.A00(activity);
        if (A002 == null) {
            return new C265674Vs(0sn.A00);
        }
        SidecarInterface sidecarInterface = this.A02;
        if (sidecarInterface != null) {
            sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(A002);
        } else {
            sidecarWindowLayoutInfo = null;
        }
        AnonymousClass5J5 r1 = this.A01;
        if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return r1.A01(sidecarDeviceState, sidecarWindowLayoutInfo);
    }

    public final void E0S(Activity activity) {
        IBinder A002 = AnonymousClass4Vn.A00(activity);
        if (A002 != null) {
            SidecarInterface sidecarInterface = this.A02;
            if (sidecarInterface != null) {
                sidecarInterface.onWindowLayoutChangeListenerRemoved(A002);
            }
            Map map = this.A03;
            02R r1 = (02R) map.get(activity);
            if (r1 != null) {
                if (activity instanceof AnonymousClass4D2) {
                    ((AnonymousClass4D2) activity).removeOnConfigurationChangedListener(r1);
                }
                map.remove(activity);
            }
            AnonymousClass5J9 r0 = this.A00;
            if (r0 != null) {
                ReentrantLock reentrantLock = r0.A01;
                reentrantLock.lock();
                try {
                    r0.A00.put(activity, (Object) null);
                } finally {
                    reentrantLock.unlock();
                }
            }
            Map map2 = this.A04;
            boolean z = false;
            if (map2.size() == 1) {
                z = true;
            }
            map2.remove(A002);
            if (z && sidecarInterface != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }
}
