package X;

import java.util.concurrent.ExecutorService;

public final class RR8 {
    public int A00;
    public C66498MUb A01;
    public S31 A02;
    public C10864RzP A03;
    public ExecutorService A04;

    public final STT A00(C10542Rtw rtw, C7232Q0d q0d, C13828Thz thz, C11187SEn sEn, C10746RxQ rxQ, REA rea) {
        S31 s31 = this.A02;
        int i = this.A00;
        C10864RzP rzP = this.A03;
        0qQ.A0B(rzP, 0);
        C10690RwU rwU = rzP.A0L;
        C12385SsZ ssZ = new C12385SsZ(rwU.A00, rwU.A01, rwU.A02, rwU.A03);
        REA rea2 = rea;
        if (rea2 == REA.RAW || rea2 == REA.NON_SEGMENTED_TRANSCODE) {
            ssZ.A02 = true;
            ssZ.A01 = true;
            ssZ.A00 = true;
        }
        C66498MUb mUb = this.A01;
        ExecutorService executorService = this.A04;
        return new STT(mUb, q0d, s31, rzP, ssZ, new C10747RxR(rtw, thz, sEn, rxQ, rzP.A02), executorService, i);
    }
}
