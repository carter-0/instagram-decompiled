package X;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.T5k  reason: case insensitive filesystem */
public final class C12750T5k implements TeY {
    public final /* synthetic */ R8O A00;

    public final void Cwy(String str, boolean z) {
        AnonymousClass1WN A002 = AnonymousClass1WN.A02.A00();
        R8O r8o = this.A00;
        Q6H A04 = A002.A00(DbS.A0T(r8o.A05)).A01().A04();
        if (A04 != null) {
            WritableNativeMap A0U = Pxe.A0U();
            if (AnonymousClass7TF.A1Q(str.length()) || z) {
                A0U.putBoolean(RealtimeConstants.SEND_SUCCESS, false);
            } else {
                A0U.putBoolean(RealtimeConstants.SEND_SUCCESS, true);
                A0U.putString("returnUrl", str);
            }
            ((RCTNativeAppEventEmitter) A04.A02(RCTNativeAppEventEmitter.class)).emit("trustly_authentication_close_event", A0U);
            C50320FYa fYa = r8o.A00;
            if (fYa == null) {
                0qQ.A0F("callbackManager");
                throw AnonymousClass00P.createAndThrow();
            } else {
                fYa.A00 = null;
            }
        }
    }

    public C12750T5k(R8O r8o) {
        this.A00 = r8o;
    }
}
