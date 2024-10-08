package X;

/* renamed from: X.OmH  reason: case insensitive filesystem */
public final class C71520OmH implements C74290PsI {
    public final /* synthetic */ C71133OdW A00;
    public final /* synthetic */ C71087ObS A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ int[] A03;

    public C71520OmH(C71133OdW odW, C71087ObS obS, int[] iArr, boolean z) {
        this.A00 = odW;
        this.A03 = iArr;
        this.A02 = z;
        this.A01 = obS;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        C71087ObS obS;
        Object A002;
        C69341Njg njg = (C69341Njg) obj;
        if (njg == null) {
            njg = C69341Njg.FETCH_BACKUP_STATUS_ERROR;
        }
        C71133OdW odW = this.A00;
        int[] iArr = this.A03;
        C71133OdW.A03(odW, "backup_state", njg.name(), iArr);
        if (njg != C69341Njg.FETCH_BACKUP_STATUS_ERROR) {
            boolean z = this.A02;
            int i = 0;
            do {
                int i2 = iArr[i];
                if (i2 != 1021652813 || z) {
                    odW.A03.markerEnd(i2, 0, 2);
                }
                i++;
            } while (i < 2);
            obS = this.A01;
            A002 = new N0I(njg);
        } else {
            C71133OdW.A05(odW, (String) null, iArr, this.A02);
            obS = this.A01;
            A002 = N0J.A00(new Exception());
        }
        obS.A05(A002);
    }
}
