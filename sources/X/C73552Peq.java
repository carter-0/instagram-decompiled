package X;

import com.instagram.nux.ndx.util.NdxStepsFilterer;
import com.instagram.user.userlist.data.LikesListRemoteDataSource;

/* renamed from: X.Peq  reason: case insensitive filesystem */
public final class C73552Peq extends C64101El {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73552Peq(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A06 = i;
        this.A07 = obj;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.Peq, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A06;
        this.A05 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        if (i != 0) {
            return ((LikesListRemoteDataSource) this.A07).AXI((C72764PJa) null, this);
        }
        return ((NdxStepsFilterer) this.A07).A00((AnonymousClass12V) null, (G62) null, (FB9) null, (0tS) null, (0BQ) null, this);
    }
}
