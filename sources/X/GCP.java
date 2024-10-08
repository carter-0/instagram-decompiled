package X;

public final class GCP implements 1wn {
    public final /* synthetic */ C227232is A00;

    public GCP(C227232is r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1206075296);
        AnonymousClass3KV r9 = (AnonymousClass3KV) obj;
        int A032 = AnonymousClass0fD.A03(1046056747);
        0qQ.A0B(r9, 0);
        boolean z = r9.A00;
        C227232is r3 = this.A00;
        if (z) {
            C267324bN A002 = GD9.A00(r3);
            if (A002 != null) {
                GBE gbe = r3.A09;
                if (gbe != null) {
                    if (!gbe.A1K.A0Y(A002.getId())) {
                        GBE gbe2 = r3.A09;
                        if (gbe2 != null) {
                            gbe2.A1K.A0R("resume", false);
                        }
                    }
                }
                0qQ.A0F("clipsViewerFragmentViewModel");
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            GBE gbe3 = r3.A09;
            if (gbe3 != null) {
                gbe3.A1K.A0N((C267324bN) null, "end_scene", false, true);
            }
            0qQ.A0F("clipsViewerFragmentViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A0A(1504737013, A032);
        AnonymousClass0fD.A0A(-1092697789, A03);
    }
}
