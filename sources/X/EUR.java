package X;

public final class EUR extends C50916Fkv {
    public final /* synthetic */ C46430Der A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EUR(C46430Der der) {
        super(der);
        this.A00 = der;
    }

    public final /* bridge */ /* synthetic */ void Dev(AnonymousClass1XT r7, String str) {
        C22360Y0o y0o = (C22360Y0o) r7;
        AnonymousClass7TG.A1N(str, y0o);
        C46430Der der = this.A00;
        F28 f28 = der.A0G;
        if (f28 == null) {
            0qQ.A0F("tailLoadPerfLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        int size = y0o.getItems().size();
        int i = f28.A00;
        if (i != 0) {
            02m r2 = f28.A01;
            r2.markerPoint(i, AnonymousClass000.A00(3886));
            r2.markerAnnotate(f28.A00, C273654mx.A00(3268), size);
        }
        C46430Der.A0G(der, y0o, str);
    }
}
