package X;

import org.webrtc.CameraCapturer;

/* renamed from: X.Qnv  reason: case insensitive filesystem */
public final class C8315Qnv extends C9980RkZ {
    public final int A00 = CameraCapturer.OPEN_CAMERA_TIMEOUT;
    public final int A01 = 200;
    public final int A02 = 81920;
    public final long A03 = 604800000;
    public final long A04 = 10485760;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C9980RkZ)) {
                return false;
            }
            C8315Qnv qnv = (C8315Qnv) ((C9980RkZ) obj);
            if (!(this.A04 == qnv.A04 && this.A01 == qnv.A01 && this.A00 == qnv.A00 && this.A03 == qnv.A03 && this.A02 == qnv.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A04;
        long j2 = this.A03;
        return this.A02 ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.A01) * 1000003) ^ this.A00) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EventStoreConfig{maxStorageSizeInBytes=");
        A1A.append(this.A04);
        A1A.append(", loadBatchSize=");
        A1A.append(this.A01);
        A1A.append(", criticalSectionEnterTimeoutMs=");
        A1A.append(this.A00);
        A1A.append(", eventCleanUpAge=");
        A1A.append(this.A03);
        A1A.append(", maxBlobByteSizePerRow=");
        A1A.append(this.A02);
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
