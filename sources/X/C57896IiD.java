package X;

import android.graphics.Rect;
import com.facebook.common.callercontext.ContextChain;

/* renamed from: X.IiD  reason: case insensitive filesystem */
public final class C57896IiD implements Runnable {
    public final /* synthetic */ C226742hm A00;
    public final /* synthetic */ C226732hl A01;
    public final /* synthetic */ String A02;

    public C57896IiD(C226742hm r1, C226732hl r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public final void run() {
        1Tq A002 = C226722hk.A00();
        C226742hm r5 = this.A00;
        C226732hl r6 = this.A01;
        String str = this.A02;
        if (str == null) {
            str = "unknown";
        }
        A002.AUi((Rect) null, (ContextChain) null, (AnonymousClass6QN) null, (JLT) null, r5, r6, (C226702hi) null, (AnonymousClass579) null, str);
    }
}
