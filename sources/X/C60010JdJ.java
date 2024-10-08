package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.creation.base.ui.feedcolorfilterpicker.FilterPicker;

/* renamed from: X.JdJ  reason: case insensitive filesystem */
public final class C60010JdJ extends Handler {
    public final /* synthetic */ FilterPicker A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60010JdJ(Looper looper, FilterPicker filterPicker) {
        super(looper);
        this.A00 = filterPicker;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r4 == 2) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            com.instagram.creation.base.ui.feedcolorfilterpicker.FilterPicker r6 = r7.A00
            com.instagram.creation.base.ui.feedcolorfilterpicker.FilterPicker.A00(r6)
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r6.A00
            long r4 = r2 - r0
            int r1 = (int) r4
            int r0 = r6.getWidth()
            int r1 = r1 * r0
            int r5 = r1 / 500
            int r4 = r8.what
            r1 = 0
            r0 = 1
            if (r4 != r0) goto L_0x002b
            int r5 = -r5
        L_0x001c:
            r6.scrollBy(r5, r1)
        L_0x001f:
            r6.A00 = r2
            android.os.Handler r3 = r6.A06
            int r2 = r8.what
            r0 = 10
            r3.sendEmptyMessageDelayed(r2, r0)
            return
        L_0x002b:
            r0 = 2
            if (r4 != r0) goto L_0x001f
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60010JdJ.handleMessage(android.os.Message):void");
    }
}
