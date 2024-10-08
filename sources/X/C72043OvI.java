package X;

import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.OvI  reason: case insensitive filesystem */
public final class C72043OvI implements AnonymousClass68Z {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass6AH A01;
    public final /* synthetic */ MsysThreadSubtype A02;
    public final /* synthetic */ MsysThreadId A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ boolean A05;

    public C72043OvI(AnonymousClass6AH r1, MsysThreadSubtype msysThreadSubtype, MsysThreadId msysThreadId, Integer num, int i, boolean z) {
        this.A03 = msysThreadId;
        this.A05 = z;
        this.A01 = r1;
        this.A00 = i;
        this.A02 = msysThreadSubtype;
        this.A04 = num;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        MsysThreadId msysThreadId = this.A03;
        boolean z = this.A05;
        AnonymousClass6AH r0 = this.A01;
        return new N4E(this.A02, msysThreadId, C66581MXm.A0q(r0.mResultSet, this.A00, 2), (String) ((C257443xP) obj).A04(), DbX.A01(this.A04), z);
    }
}
