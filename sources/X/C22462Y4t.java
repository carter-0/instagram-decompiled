package X;

import java.io.IOException;

/* renamed from: X.Y4t  reason: case insensitive filesystem */
public abstract class C22462Y4t implements C13970TmY {
    public boolean A00;
    public final Y7X A01;
    public final /* synthetic */ C22456Y4n A02;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.Y7X] */
    public C22462Y4t(C22456Y4n y4n) {
        this.A02 = y4n;
        C11291SJy sJy = C11291SJy.A03;
        C11291SJy Ezn = y4n.A06.Ezn();
        ? obj = new Object();
        if (Ezn != null) {
            obj.A00 = Ezn;
            this.A01 = obj;
            return;
        }
        throw AnonymousClass7TE.A0w("delegate == null");
    }

    public final void A00() {
        C22456Y4n y4n = this.A02;
        int i = y4n.A00;
        if (i == 6) {
            return;
        }
        if (i == 5) {
            Y7X y7x = this.A01;
            C11291SJy sJy = y7x.A00;
            y7x.A00 = C11291SJy.A03;
            sJy.A02();
            sJy.A03();
            y4n.A00 = 6;
            return;
        }
        throw DbW.A0b("state: ", i);
    }

    public long E6C(C13198TPe tPe, long j) {
        try {
            return this.A02.A06.E6C(tPe, j);
        } catch (IOException e) {
            this.A02.A04.A01();
            A00();
            throw e;
        }
    }

    public final C11291SJy Ezn() {
        return this.A01;
    }
}
