package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.LwJ  reason: case insensitive filesystem */
public final class C65585LwJ implements C311396cc {
    public final /* synthetic */ LQh A00;

    public C65585LwJ(LQh lQh) {
        this.A00 = lQh;
    }

    public final void D5S() {
        Context context = this.A00.A03.getContext();
        if (context != null) {
            CallerContext callerContext = C62052KYa.A02;
            LRS.A01(context, AnonymousClass05K.A0j, 0);
        }
    }

    public final void onDismiss() {
        Context context = this.A00.A03.getContext();
        if (context != null) {
            CallerContext callerContext = C62052KYa.A02;
            LRS.A01(context, AnonymousClass05K.A00, 0);
        }
    }
}
