package X;

import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.Collections;

/* renamed from: X.SqO  reason: case insensitive filesystem */
public final /* synthetic */ class C12269SqO implements C13579Td4 {
    public final /* synthetic */ FbnsServiceDelegate A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C12269SqO(FbnsServiceDelegate fbnsServiceDelegate, String str) {
        this.A00 = fbnsServiceDelegate;
        this.A01 = str;
    }

    public final void Cvf(String str) {
        FbnsServiceDelegate.A02(this.A00, "invalid_receiver", this.A01, str, (String) null, Collections.emptyMap());
        0KC.A0D("FbnsServiceDelegate", "service/sendFBNSBroadcast/invalid_receiver");
    }
}
