package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Map;

/* renamed from: X.37x  reason: invalid class name and case insensitive filesystem */
public final class C2374937x extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass12V A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C2373837k A04;
    public final /* synthetic */ C2374537r A05;
    public final /* synthetic */ PendingMediaStore A06;
    public final /* synthetic */ Map A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2374937x(Context context, AnonymousClass12V r3, UserSession userSession, C2373837k r5, C2374537r r6, PendingMediaStore pendingMediaStore, Map map, int i) {
        super(0);
        this.A00 = i;
        this.A01 = context;
        this.A04 = r5;
        this.A06 = pendingMediaStore;
        this.A05 = r6;
        this.A03 = userSession;
        this.A07 = map;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A00;
        Context context = this.A01;
        0qQ.A0A(context);
        C2373837k r4 = this.A04;
        PendingMediaStore pendingMediaStore = this.A06;
        C2374537r r5 = this.A05;
        return new ConcurrentUploadQueueProcessor(context, this.A02, this.A03, r4, r5, pendingMediaStore, this.A07, i);
    }
}
