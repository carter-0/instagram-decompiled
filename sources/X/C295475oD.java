package X;

import com.facebook.advancedcryptotransport.DnsResolverImpl;

/* renamed from: X.5oD  reason: invalid class name and case insensitive filesystem */
public final class C295475oD extends AnonymousClass45Y {
    public final /* synthetic */ C301075yQ A00;
    public final /* synthetic */ C295465oC A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C295475oD(C301075yQ r2, C295465oC r3) {
        super("dnsResolverImplCallNativeCompletion");
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void run() {
        0fh.A01("dnsResolveAsync:dnsResolverImplCallNativeCompletion:run", -2130266282);
        C295465oC r0 = this.A01;
        DnsResolverImpl.dnsResolveAsyncCompletionHandler(r0.A01, r0.A00, this.A00.A01);
        0fh.A00(-1991956619);
    }
}
