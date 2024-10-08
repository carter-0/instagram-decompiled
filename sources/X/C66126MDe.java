package X;

import androidx.paging.PageEvent$StaticList;
import androidx.paging.SeparatorState;
import androidx.paging.SeparatorsKt;

/* renamed from: X.MDe  reason: case insensitive filesystem */
public final class C66126MDe extends C64101El {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public final int A09 = 1;

    public C66126MDe(AnonymousClass4D7 r2) {
        super(r2);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.MDe, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        if (this.A09 != 0) {
            this.A08 = obj;
            this.A02 |= AnonymousClass972.MUTABLE_FLAG_MASK;
            return SeparatorsKt.A00((LRX) null, this, (0sK) null);
        }
        this.A07 = obj;
        this.A02 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return ((SeparatorState) this.A08).A03((PageEvent$StaticList) null, this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66126MDe(SeparatorState separatorState, AnonymousClass4D7 r3) {
        super(r3);
        this.A08 = separatorState;
    }
}
