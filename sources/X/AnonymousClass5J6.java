package X;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: X.5J6  reason: invalid class name */
public final class AnonymousClass5J6 {
    public static final List A00(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        try {
            List list = sidecarWindowLayoutInfo.displayFeatures;
            if (list == null) {
                return 0sn.A00;
            }
            return list;
        } catch (NoSuchFieldError unused) {
            try {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                0qQ.A0C(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) invoke;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0sn.A00;
            }
        }
    }

    public final int A02(SidecarDeviceState sidecarDeviceState) {
        int i;
        try {
            i = sidecarDeviceState.posture;
        } catch (NoSuchFieldError unused) {
            try {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                0qQ.A0C(invoke, "null cannot be cast to non-null type kotlin.Int");
                i = ((Number) invoke).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }
        if (i < 0 || i > 4) {
            return 0;
        }
        return i;
    }

    public static final void A01(SidecarDeviceState sidecarDeviceState, int i) {
        try {
            sidecarDeviceState.posture = i;
        } catch (NoSuchFieldError unused) {
            try {
                SidecarDeviceState.class.getMethod("setPosture", new Class[]{Integer.TYPE}).invoke(sidecarDeviceState, new Object[]{Integer.valueOf(i)});
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }
}
