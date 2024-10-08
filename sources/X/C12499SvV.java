package X;

import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.SvV  reason: case insensitive filesystem */
public final class C12499SvV implements C13739TgB {
    public final /* synthetic */ C8608Qxp A00;
    public final /* synthetic */ TK1 A01;

    public C12499SvV(C8608Qxp qxp, TK1 tk1) {
        this.A01 = tk1;
        this.A00 = qxp;
    }

    public final void D0U() {
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putBoolean(RealtimeConstants.SEND_SUCCESS, false);
        this.A01.A00.resolve(A0U);
        this.A00.A07();
    }

    public final void D6J() {
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putBoolean(RealtimeConstants.SEND_SUCCESS, true);
        this.A01.A00.resolve(A0U);
        this.A00.A07();
    }
}
