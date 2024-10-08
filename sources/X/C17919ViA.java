package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.ViA  reason: case insensitive filesystem */
public final class C17919ViA {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ImmutableList A01;
    public final /* synthetic */ ImmutableList A02;
    public final /* synthetic */ AnonymousClass67Z A03;
    public final /* synthetic */ C71010OYi A04;
    public final /* synthetic */ OMq A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public C17919ViA(ImmutableList immutableList, ImmutableList immutableList2, AnonymousClass67Z r3, C71010OYi oYi, OMq oMq, String str, String str2, int i) {
        this.A05 = oMq;
        this.A00 = i;
        this.A04 = oYi;
        this.A01 = immutableList;
        this.A06 = str;
        this.A07 = str2;
        this.A02 = immutableList2;
        this.A03 = r3;
    }

    public final void A00(Throwable th) {
        OMq oMq = this.A05;
        if (oMq != null) {
            oMq.A01.markerPoint(20132336, oMq.A00, "deidentified_request_params_fetch_failure");
        }
        AnonymousClass67Z r1 = this.A03;
        0qQ.A0A(r1);
        0qQ.A0A(this.A02);
        C71010OYi.A01(r1, oMq, th);
    }
}
