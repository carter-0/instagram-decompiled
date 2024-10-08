package X;

/* renamed from: X.GSz  reason: case insensitive filesystem */
public final class C52447GSz implements C229122ms {
    public final /* synthetic */ AnonymousClass32L A00;

    public C52447GSz(AnonymousClass32L r1) {
        this.A00 = r1;
    }

    public final boolean CJz() {
        C14074TpO tpO = this.A00.A06;
        if (tpO != null) {
            return tpO.A0A();
        }
        0qQ.A0F("grid");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CKB() {
        GXP gxp;
        String str;
        GT0 gt0 = this.A00.A0E;
        if (gt0 == null) {
            str = "dataStore";
        } else {
            if (!gt0.A07) {
                gxp = gt0.A00;
                if (gxp == null) {
                    str = "feedNetworkSource";
                }
            } else {
                gxp = gt0.A01;
                if (gxp == null) {
                    str = "nonprofiledFeedNetworkSource";
                }
            }
            return gxp.A00.A05();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CT5() {
        GT0 gt0 = this.A00.A0E;
        if (gt0 == null || !gt0.A03()) {
            return false;
        }
        return true;
    }

    public final void CgO() {
        GWY gwy = this.A00.A0J;
        if (gwy == null) {
            0qQ.A0F("viewController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            GWY.A00(gwy, AnonymousClass05K.A0N, false, false, gwy.A0I, false, false);
        }
    }

    public final boolean isLoading() {
        GT0 gt0 = this.A00.A0E;
        if (gt0 == null || !gt0.A04()) {
            return false;
        }
        return true;
    }

    public final boolean CWV() {
        if (!isLoading()) {
            return true;
        }
        C14074TpO tpO = this.A00.A06;
        if (tpO != null) {
            return tpO.A0A();
        }
        0qQ.A0F("grid");
        throw AnonymousClass00P.createAndThrow();
    }
}
