package X;

import android.content.Context;

/* renamed from: X.OmP  reason: case insensitive filesystem */
public final class C71528OmP implements C74290PsI {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ OO6 A01;
    public final /* synthetic */ OBN A02;
    public final /* synthetic */ NUW A03;

    public C71528OmP(Context context, OO6 oo6, OBN obn, NUW nuw) {
        this.A03 = nuw;
        this.A02 = obn;
        this.A01 = oo6;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        boolean A1a = DbX.A1a(obj);
        NUW nuw = this.A03;
        if (A1a) {
            nuw.A0B("FETCH_BACKUP_STATUS");
            OBN obn = this.A02;
            C69901Nu3.A00(obn.A01, AnonymousClass05K.A07).A06(new C59137J7t(13, obn, this.A01, nuw, this.A00));
            return;
        }
        nuw.A0H("BLOCK_STORE_ENCRYPTION_NOT_AVAILABLE");
    }
}
