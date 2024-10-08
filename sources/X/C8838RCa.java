package X;

import com.facebook.proxygen.HTTPRequestError;
import java.io.IOException;

/* renamed from: X.RCa  reason: case insensitive filesystem */
public final class C8838RCa extends IOException {
    public final HTTPRequestError A00;

    public C8838RCa(HTTPRequestError hTTPRequestError) {
        super(hTTPRequestError.mErrMsg);
        this.A00 = hTTPRequestError;
    }
}
