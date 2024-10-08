package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.Ov9  reason: case insensitive filesystem */
public final /* synthetic */ class C72034Ov9 implements AnonymousClass68Z {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ MsysThreadId A03;

    public /* synthetic */ C72034Ov9(MsysThreadId msysThreadId, int i, int i2, long j) {
        this.A03 = msysThreadId;
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
    }

    public final Object apply(Object obj) {
        MsysThreadId msysThreadId = this.A03;
        long j = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        MYb mYb = MYb.A0M;
        return 1aU.A07(new C72154OxE((AnonymousClass67N) obj, msysThreadId, i, i2, j), AnonymousClass6F9.A00("load_secure_message_attachment_list"));
    }
}
