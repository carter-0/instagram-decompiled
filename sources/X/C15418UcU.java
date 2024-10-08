package X;

/* renamed from: X.UcU  reason: case insensitive filesystem */
public final class C15418UcU extends C15623Ufp {
    public final /* synthetic */ C16176Uq1 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C252683pV A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15418UcU(WGU wgu, C16176Uq1 uq1, String str, String str2, C252683pV r5) {
        super(wgu, str2);
        this.A00 = uq1;
        this.A01 = str;
        this.A02 = r5;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1289406876);
        C43816CEi cEi = (C43816CEi) obj;
        int A0D = AnonymousClass7TG.A0D(cEi, 6618013);
        A03(cEi);
        C15026UKf uKf = cEi.A08;
        if (uKf == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00.A00.put(this.A01, uKf);
        C301205yj.A00(uKf, this.A02);
        AnonymousClass0fD.A0A(-230660728, A0D);
        AnonymousClass0fD.A0A(-1398358110, A03);
    }
}
