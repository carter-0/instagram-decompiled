package X;

import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import com.instagram.newsfeed.data.ActivityPagedData;

public final class MDI extends C64101El {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDI(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A06 = i;
        this.A07 = obj;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MDI, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A06;
        this.A05 = obj;
        this.A02 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        Object obj2 = this.A07;
        if (i != 0) {
            return ((ActivityPagedData) obj2).A03((AnonymousClass9JK) null, this);
        }
        return ((BringIntoViewRequesterImpl) obj2).AE5((AnonymousClass5VN) null, this);
    }
}
