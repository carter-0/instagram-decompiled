package X;

/* renamed from: X.Ozx  reason: case insensitive filesystem */
public final class C72288Ozx implements AnonymousClass8DF {
    public final /* synthetic */ C69112Ner A00;

    public final /* synthetic */ void DBh(AnonymousClass87G r1) {
    }

    public final /* synthetic */ void DMF(AnonymousClass518 r1, int i) {
    }

    public C72288Ozx(C69112Ner ner) {
        this.A00 = ner;
    }

    public final /* bridge */ /* synthetic */ void DBj(AnonymousClass518 r5, String str, int i, boolean z) {
        AnonymousClass87G r52 = (AnonymousClass87G) r5;
        0qQ.A0B(r52, 0);
        boolean z2 = r52.A0N;
        C69112Ner ner = this.A00;
        if (!z2) {
            C71139Odj A0l = C66580MXl.A0l(ner.A0S);
            if (r52.equals(A0l.A0I.get(A0l.A02))) {
                return;
            }
            if (ner.A03.A06 != null && 0qQ.A0K(r52.A00(), ner.A03.A06)) {
                return;
            }
        }
        C69112Ner.A01(r52, ner, false);
    }
}
