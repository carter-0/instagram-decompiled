package androidx.window.layout.adapter.sidecar;

import X.0qQ;
import X.AnonymousClass4Vn;
import X.AnonymousClass5J3;
import X.AnonymousClass5J5;
import X.AnonymousClass5J9;
import X.C265674Vs;
import android.app.Activity;
import android.os.IBinder;
import android.util.Log;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;

public final class SidecarCompat$TranslatingCallback implements SidecarInterface.SidecarCallback {
    public final /* synthetic */ AnonymousClass5J3 A00;

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        SidecarInterface A01;
        0qQ.A0B(sidecarDeviceState, 0);
        AnonymousClass5J3 r5 = this.A00;
        for (Activity activity : r5.A04.values()) {
            IBinder A002 = AnonymousClass4Vn.A00(activity);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
            if (!(A002 == null || (A01 = r5.A01()) == null)) {
                sidecarWindowLayoutInfo = A01.getWindowLayoutInfo(A002);
            }
            AnonymousClass5J9 r1 = r5.A00;
            if (r1 != null) {
                r1.E0T(activity, r5.A01.A01(sidecarDeviceState, sidecarWindowLayoutInfo));
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        SidecarDeviceState sidecarDeviceState;
        0qQ.A0B(iBinder, 0);
        0qQ.A0B(sidecarWindowLayoutInfo, 1);
        AnonymousClass5J3 r3 = this.A00;
        Activity activity = (Activity) r3.A04.get(iBinder);
        if (activity == null) {
            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
            return;
        }
        AnonymousClass5J5 r1 = r3.A01;
        SidecarInterface A01 = r3.A01();
        if (A01 == null || (sidecarDeviceState = A01.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        C265674Vs A012 = r1.A01(sidecarDeviceState, sidecarWindowLayoutInfo);
        AnonymousClass5J9 r0 = r3.A00;
        if (r0 != null) {
            r0.E0T(activity, A012);
        }
    }

    public SidecarCompat$TranslatingCallback(AnonymousClass5J3 r1) {
        this.A00 = r1;
    }
}
