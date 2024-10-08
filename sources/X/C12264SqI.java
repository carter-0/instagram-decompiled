package X;

import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.Map;

/* renamed from: X.SqI  reason: case insensitive filesystem */
public final class C12264SqI implements C13719Tfk {
    public final /* synthetic */ FbnsServiceDelegate A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;

    public C12264SqI(FbnsServiceDelegate fbnsServiceDelegate, String str, String str2, Map map) {
        this.A00 = fbnsServiceDelegate;
        this.A02 = str;
        this.A03 = map;
        this.A01 = str2;
    }

    public final void DEe(Integer num) {
        FbnsServiceDelegate fbnsServiceDelegate = FbnsServiceDelegate.A0D;
        FbnsServiceDelegate.A02(this.A00, "reg_sent_fail", this.A02, this.A01, S9M.A01(num), this.A03);
    }

    public final void DoA(long j) {
        FbnsServiceDelegate.A02(this.A00, "reg_sent_success", this.A02, this.A01, (String) null, this.A03);
    }
}
