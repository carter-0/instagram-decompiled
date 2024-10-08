package X;

public enum RDI {
    A01(0),
    A02(2),
    A04(3),
    A03(4),
    A06(5),
    A05(6);
    
    public C8956RIv A00;

    /* access modifiers changed from: public */
    static {
        A01 = new RDI(C8956RIv.IDV_DOCUMENT_TYPE, "IDV_DOCUMENT_TYPE", 0);
        new RDI(C8956RIv.IDV_GROUP_ONE, "IDV_GROUP_ONE", 1);
        A02 = new RDI(C8956RIv.IDV_GROUP_TWO, "IDV_GROUP_TWO", 2);
        A04 = new RDI(C8956RIv.IDV_ID_SMART_CAPTURE, "IDV_ID_SMART_CAPTURE", 3);
        A03 = new RDI(C8956RIv.IDV_ID_CONFIRMATION, "IDV_ID_CONFIRMATION", 4);
        A06 = new RDI(C8956RIv.IDV_SELFIE_SMART_CAPTURE, "IDV_SELFIE_SMART_CAPTURE", 5);
        A05 = new RDI(C8956RIv.IDV_SELFIE_CONFIRMATION, "IDV_SELFIE_CONFIRMATION", 6);
    }

    /* access modifiers changed from: public */
    RDI(int i) {
        this.A00 = r1;
    }
}
