package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.6cb  reason: invalid class name and case insensitive filesystem */
public final class C311386cb implements C311396cc {
    public final /* synthetic */ C311296cS A00;

    public C311386cb(C311296cS r1) {
        this.A00 = r1;
    }

    public final void D5S() {
        Fragment fragment;
        Context context;
        C311296cS r1 = this.A00;
        if (r1.A01 && (fragment = (Fragment) r1.A0B.get()) != null && (context = fragment.getContext()) != null) {
            CallerContext callerContext = C62052KYa.A02;
            LRS.A01(context, AnonymousClass05K.A0j, 0);
        }
    }

    public final void onDismiss() {
        Fragment fragment;
        Context context;
        C311296cS r1 = this.A00;
        if (r1.A01 && (fragment = (Fragment) r1.A0B.get()) != null && (context = fragment.getContext()) != null) {
            CallerContext callerContext = C62052KYa.A02;
            LRS.A01(context, AnonymousClass05K.A00, 0);
        }
    }
}
