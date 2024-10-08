package X;

import androidx.datastore.core.SingleProcessDataStore;
import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.upsell.api.CLNoticeApi;

/* renamed from: X.9Jk  reason: invalid class name and case insensitive filesystem */
public final class C376809Jk extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08;
    public final Object A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376809Jk(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A08 = i;
        this.A09 = obj;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.9Jk, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A08;
        this.A07 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        Object obj2 = this.A09;
        if (i != 0) {
            return ((CLNoticeApi) obj2).A00((AnonymousClass818) null, (C368278sM) null, (AnonymousClass819) null, (UserSession) null, (String) null, this);
        }
        return SingleProcessDataStore.A01((SingleProcessDataStore) obj2, this);
    }
}
