package X;

import android.content.Context;

/* renamed from: X.SeZ  reason: case insensitive filesystem */
public final class C11676SeZ implements YCJ {
    public C13508TbZ A00;
    public C13890TjD A01;
    public final C10718Rww A02;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.TjD, java.lang.Object] */
    public C11676SeZ(Context context, TZY tzy) {
        C13508TbZ seW = new C11673SeW(context);
        this.A00 = seW;
        ? obj = new Object();
        this.A01 = obj;
        C10718Rww rww = new C10718Rww(tzy, obj);
        this.A02 = rww;
        if (seW != rww.A00) {
            rww.A00 = seW;
            rww.A03.clear();
            rww.A02.clear();
        }
    }
}
