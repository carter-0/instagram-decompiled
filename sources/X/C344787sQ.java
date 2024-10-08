package X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.7sQ  reason: invalid class name and case insensitive filesystem */
public abstract class C344787sQ {
    public static C344767sO A00(Context context, Handler handler, C344807sS r9, C344407ro r10, C344037rD r11, C343927r2 r12, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C344807sS r4 = r9;
        C344407ro r5 = r10;
        if (r10 == null) {
            r5 = new C344407ro();
        }
        Handler handler2 = null;
        if (!z7) {
            handler2 = handler;
            if (handler == null) {
                handler2 = r12.BAM("Lite-SurfacePipe-Thread");
                0qQ.A07(handler2);
            }
        }
        Handler BAM = r12.BAM("Lite-CPU-Frames-Thread");
        0qQ.A07(BAM);
        if (r9 == null) {
            r4 = C344797sR.A00;
        }
        return new C344767sO(context, handler2, BAM, r4, r5, r11, z5, z, z2, z8, z4, z3, z6);
    }
}
