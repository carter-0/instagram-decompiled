package X;

import android.content.Context;
import android.view.ViewConfiguration;

/* renamed from: X.6kl  reason: invalid class name and case insensitive filesystem */
public final class C315896kl {
    public C315926ko A00;
    public boolean A01;
    public final C315986ku A02;
    public final C315936kp A03;
    public final C315906km A04;
    public final C315886kk A05;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.6km] */
    public C315896kl(Context context, C315886kk r5) {
        this.A05 = r5;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ? obj = new Object();
        obj.A00 = 90.0f;
        obj.A01 = scaledTouchSlop;
        this.A04 = obj;
        this.A00 = new C315926ko(obj, r5);
        this.A03 = new C315936kp(context, r5);
        this.A02 = new C315986ku(context, r5);
    }
}
