package X;

import java.io.File;
import java.util.List;

/* renamed from: X.Qdz  reason: case insensitive filesystem */
public final class C7958Qdz extends C12327SrZ {
    public final C13834Ti9 A00;
    public final C266794aM A01;
    public final /* synthetic */ SRI A02;

    public C7958Qdz(C13834Ti9 ti9, C266794aM r2, SRI sri) {
        this.A02 = sri;
        this.A01 = r2;
        this.A00 = ti9;
    }

    public final /* bridge */ /* synthetic */ void DDE(SJL sjl, Object obj) {
        this.A00.DDE(sjl, obj);
    }

    public final void D5E(List list) {
        File file = ((SRW) AnonymousClass7TE.A13(list)).A0N;
        SRI sri = this.A02;
        sri.A0E.put(this.A01, file);
    }
}
