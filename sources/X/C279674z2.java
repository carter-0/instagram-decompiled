package X;

import android.os.Process;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4z2  reason: invalid class name and case insensitive filesystem */
public final class C279674z2 extends 0Lp {
    public final /* synthetic */ AnonymousClass198 A00;

    public C279674z2(AnonymousClass198 r1) {
        this.A00 = r1;
    }

    public final void DDH(Object obj, String str, Method method, Object[] objArr, long j) {
        AtomicInteger atomicInteger;
        Class<?> cls;
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(str) && obj != null) {
            String name = method.getName();
            if (name.equals("getStreamVolume")) {
                atomicInteger = this.A00.A03;
            } else if (name.equals("getStreamMaxVolume")) {
                atomicInteger = this.A00.A02;
            } else {
                return;
            }
            if (method.getParameterTypes().length == 1 && method.getParameterTypes()[0] == (cls = Integer.TYPE) && method.getReturnType() == cls && objArr != null && objArr[0].intValue() == 3) {
                atomicInteger.set(((Number) obj).intValue());
            }
        }
    }

    public final 0HV AjQ(0HW r6, String str, Method method, Object[] objArr) {
        AtomicInteger atomicInteger;
        int i;
        if (Process.myPid() != Process.myTid() || !MediaStreamTrack.AUDIO_TRACK_KIND.equals(str)) {
            return null;
        }
        String name = method.getName();
        if (name.equals("getStreamVolume")) {
            atomicInteger = this.A00.A03;
        } else if (!name.equals("getStreamMaxVolume")) {
            return null;
        } else {
            atomicInteger = this.A00.A02;
        }
        if (method.getParameterTypes().length == 1 && method.getParameterTypes()[0] == Integer.TYPE && objArr != null && objArr[0].intValue() == 3 && (i = atomicInteger.get()) != -1) {
            return new 0HV(Integer.valueOf(i));
        }
        return null;
    }
}
