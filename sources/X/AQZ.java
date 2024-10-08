package X;

public final class AQZ implements C22555YAe {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AQX A01;

    public final void D7i(Y1G y1g, int i) {
    }

    public final void D7j(byte[] bArr, int i) {
        AQX aqx = this.A01;
        C341747nS r4 = aqx.A01;
        if (r4 != null) {
            r4.A02(bArr, i, aqx.A02.get());
        }
        C343487qI r5 = aqx.A00;
        if (r5 != null) {
            int i2 = this.A00;
            aqx.A02.addAndGet(C39902AIk.A01(r5.A02, Integer.bitCount(r5.A01), (long) i, (long) i2));
            short s = 0;
            byte[] A0W = 0Yw.A0W(bArr, 0, i);
            int length = A0W.length / 2;
            short[] sArr = new short[length];
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = i3 * 2;
                sArr[i3] = (short) ((A0W[i4] & 255) + (A0W[i4 + 1] << 8));
            }
            int i5 = 1;
            if (length != 0) {
                short s2 = sArr[0];
                int i6 = length - 1;
                if (1 <= i6) {
                    while (true) {
                        short s3 = sArr[i5];
                        if (s2 < s3) {
                            s2 = s3;
                        }
                        if (i5 == i6) {
                            break;
                        }
                        i5++;
                    }
                }
                Short valueOf = Short.valueOf(s2);
                if (valueOf != null) {
                    s = valueOf.shortValue();
                }
            }
            aqx.A07 = C229632nm.A01((float) Math.abs((Math.log((double) s) * 0.25d) - 1.5807000398635864d));
        }
    }

    public AQZ(AQX aqx, int i) {
        this.A01 = aqx;
        this.A00 = i;
    }

    public final void DCe(C382299dT r3) {
        0KC.A0C("IGDAudioPipelineRecorder", AnonymousClass7TF.A0m("Error in audio recorder: ", r3));
    }

    public final void DFw() {
    }
}
