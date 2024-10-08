package X;

public final class ITO implements C289875eN {
    public final /* synthetic */ AnonymousClass32L A00;

    public ITO(AnonymousClass32L r1) {
        this.A00 = r1;
    }

    public final void DWX() {
        X9Q x9q = this.A00.A07;
        if (x9q == null) {
            0qQ.A0F("videoPlayerManager");
            throw AnonymousClass00P.createAndThrow();
        } else {
            x9q.E23("peek");
        }
    }

    public final void DWZ() {
        String str;
        AnonymousClass32L r3 = this.A00;
        X9Q x9q = r3.A07;
        if (x9q == null) {
            str = "videoPlayerManager";
        } else {
            x9q.EJ3();
            if (r3.isResumed()) {
                C232692uG r1 = r3.A0L;
                if (r1 instanceof AnonymousClass2uE) {
                    1Xj A07 = ((AnonymousClass2uE) r1).A07();
                    if (A07.A0C.C70() != null) {
                        C14074TpO tpO = r3.A06;
                        if (tpO == null) {
                            str = "grid";
                        } else {
                            String id = A07.getId();
                            if (id != null) {
                                tpO.A08(id);
                                return;
                            }
                            throw AnonymousClass7TE.A0y();
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
