package X;

import com.instagram.pendingmedia.service.impl.SharePostThreadHelper;

public final class MDM extends C64101El {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;
    public final Object A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDM(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A07 = i;
        this.A08 = obj;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4D7, X.MDM] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A07;
        this.A06 = obj;
        this.A02 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        Object obj2 = this.A08;
        if (i != 0) {
            return ((C73526PeI) obj2).A00((N4R) null, this);
        }
        return ((SharePostThreadHelper) obj2).A00((LP8) null, this, (C249523jv) null);
    }
}
