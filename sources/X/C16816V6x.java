package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;

/* renamed from: X.V6x  reason: case insensitive filesystem */
public abstract class C16816V6x {
    public static final C309516Yo A00(FragmentActivity fragmentActivity, AnalyticsEventDebugInfo analyticsEventDebugInfo, 0lg r5) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(Pxd.A00(484), analyticsEventDebugInfo);
        new AnonymousClass32G().setArguments(bundle);
        if (fragmentActivity != null) {
            C309516Yo r1 = new C309516Yo(fragmentActivity, r5);
            r1.A0B(bundle, new AnonymousClass32G());
            return r1;
        }
        throw AnonymousClass7TE.A0y();
    }
}
