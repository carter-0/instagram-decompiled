package X;

import androidx.paging.AsyncPagingDataDiffer$differBase$1;
import com.instagram.pendingmedia.service.impl.ShareStoryTemplateHelper;

public final class MDN extends C64101El {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;
    public final Object A08;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.4D7, X.MDN] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A07;
        this.A06 = obj;
        this.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        if (i != 0) {
            return ((ShareStoryTemplateHelper) this.A08).A00((LP8) null, this);
        }
        return ((AsyncPagingDataDiffer$differBase$1) this.A08).A01((C22558YAp) null, (C22558YAp) null, this, (C62320sa) null, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDN(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A07 = i;
        this.A08 = obj;
    }
}
