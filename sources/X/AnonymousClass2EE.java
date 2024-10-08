package X;

import android.content.Context;

/* renamed from: X.2EE  reason: invalid class name */
public final class AnonymousClass2EE implements AnonymousClass0eK {
    public final Context A00;
    public final 0lg A01;
    public final AnonymousClass0eK A02;
    public final AnonymousClass0eK A03;
    public final AnonymousClass0eK A04;

    public final /* bridge */ /* synthetic */ Object get() {
        AnonymousClass0eK r3 = this.A03;
        0lg r2 = this.A01;
        C10633RvS rvS = new C10633RvS(r2);
        SIS sis = new SIS(AnonymousClass2E0.A04(), (AnonymousClass5A3) r3.get(), rvS);
        C12407Stj stj = new C12407Stj(r2);
        C10634RvT rvT = new C10634RvT(stj, r2);
        r3.get();
        C10390RrR rrR = new C10390RrR(rvT);
        Context context = this.A00;
        SSL ssl = new SSL(rrR, stj, new C10301Rpz(context));
        return new S7M(context, ssl, ssl, stj, (SDc) this.A02.get(), sis, (C10987S3z) this.A04.get(), AnonymousClass2E0.A04(), (AnonymousClass5A3) r3.get(), rvT);
    }

    public AnonymousClass2EE(Context context, 0lg r2, AnonymousClass0eK r3, AnonymousClass0eK r4, AnonymousClass0eK r5) {
        this.A00 = context;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r2;
        this.A02 = r5;
    }
}
