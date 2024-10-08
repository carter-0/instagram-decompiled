package X;

/* renamed from: X.UOz  reason: case insensitive filesystem */
public final class C15099UOz extends AnonymousClass8GD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C15099UOz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.U7w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.U7x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.U7w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.U7w} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.Exception r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0038;
                case 1: goto L_0x0013;
                case 2: goto L_0x0006;
                case 3: goto L_0x002c;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r3 = r4.A02
            X.U7x r3 = (X.U7x) r3
            X.0s0 r2 = r3.A09
            X.0YZ[] r1 = X.U7x.A0B
            goto L_0x001f
        L_0x0013:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r3 = r4.A02
            X.U7w r3 = (X.U7w) r3
            X.0s0 r2 = r3.A05
            X.0YZ[] r1 = X.U7w.A06
        L_0x001f:
            r0 = 1
            java.lang.Object r0 = X.Pxe.A0s(r3, r2, r1, r0)
            X.81l r0 = (X.C3497181l) r0
            if (r0 == 0) goto L_0x0005
            r0.DDD(r5)
            return
        L_0x002c:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r0 = r4.A01
            X.Vul r0 = (X.C18594Vul) r0
            r0.A03(r5)
            return
        L_0x0038:
            java.lang.Object r1 = r4.A01
            X.9RJ r1 = (X.AnonymousClass9RJ) r1
            r0 = 0
            r1.A0d = r0
            java.lang.Object r0 = r4.A02
            X.8GD r0 = (X.AnonymousClass8GD) r0
            r0.A01(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15099UOz.A01(java.lang.Exception):void");
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        C380369Xs r1;
        switch (this.A00) {
            case 0:
                ((AnonymousClass8GD) this.A02).A02(obj);
                return;
            case 1:
                r1 = ((U7w) this.A02).A02;
                break;
            case 2:
                r1 = ((U7x) this.A02).A02;
                break;
            case 3:
                C343367q6 r5 = (C343367q6) obj;
                0qQ.A0B(r5, 0);
                C64112LOa lOa = (C64112LOa) this.A02;
                Object A022 = r5.A03.A02(C342717p3.A0q);
                if (A022 != null) {
                    C64112LOa.A00((C343047pa) A022, (C18594Vul) this.A01, lOa);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            default:
                C340307l3 r3 = (C340307l3) this.A01;
                r3.EWw(new UP0(1, r3, obj, this.A02));
                return;
        }
        if (r1 == null) {
            0qQ.A0F("cameraPreview");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r1.A04((C364018kj) this.A01);
        }
    }
}
