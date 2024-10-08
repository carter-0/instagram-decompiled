package X;

import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.Collections;

/* renamed from: X.SqP  reason: case insensitive filesystem */
public final /* synthetic */ class C12270SqP implements C13579Td4 {
    public final /* synthetic */ FbnsServiceDelegate A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C12270SqP(FbnsServiceDelegate fbnsServiceDelegate, String str) {
        this.A00 = fbnsServiceDelegate;
        this.A01 = str;
    }

    public final void Cvf(String str) {
        FbnsServiceDelegate.A02(this.A00, "unreg_called", this.A01, str, (String) null, Collections.emptyMap());
    }
}
