package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Arrays;

public abstract class SIF {
    public final boolean A00;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        if (r2.A01 == r4) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0056, code lost:
        if (r2.A01 == r4) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        if (r2.A01 == r4) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0066, code lost:
        if (r2.A01 == r4) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer A00(java.lang.Class r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C8247Ql1
            if (r0 == 0) goto L_0x000e
            r1 = r3
            X.Ql1 r1 = (X.C8247Ql1) r1
            java.lang.Class r0 = r1.A01
            if (r4 != r0) goto L_0x0045
            com.fasterxml.jackson.databind.JsonSerializer r0 = r1.A00
            return r0
        L_0x000e:
            boolean r0 = r3 instanceof X.C8245Qkz
            if (r0 != 0) goto L_0x0045
            boolean r0 = r3 instanceof X.C8248Ql2
            if (r0 == 0) goto L_0x0027
            r1 = r3
            X.Ql2 r1 = (X.C8248Ql2) r1
            java.lang.Class r0 = r1.A02
            if (r4 != r0) goto L_0x0020
            com.fasterxml.jackson.databind.JsonSerializer r0 = r1.A00
            return r0
        L_0x0020:
            java.lang.Class r0 = r1.A03
            if (r4 != r0) goto L_0x0045
            com.fasterxml.jackson.databind.JsonSerializer r0 = r1.A01
            return r0
        L_0x0027:
            r0 = r3
            X.Ql0 r0 = (X.C8246Ql0) r0
            X.RsF[] r1 = r0.A00
            r0 = 0
            r2 = r1[r0]
            java.lang.Class r0 = r2.A01
            if (r0 == r4) goto L_0x004e
            r0 = 1
            r2 = r1[r0]
            java.lang.Class r0 = r2.A01
            if (r0 == r4) goto L_0x004e
            r0 = 2
            r2 = r1[r0]
            java.lang.Class r0 = r2.A01
            if (r0 == r4) goto L_0x004e
            int r0 = r1.length
            switch(r0) {
                case 4: goto L_0x0069;
                case 5: goto L_0x0061;
                case 6: goto L_0x0059;
                case 7: goto L_0x0051;
                case 8: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            r0 = 0
            return r0
        L_0x0047:
            r0 = 7
            r2 = r1[r0]
            java.lang.Class r0 = r2.A01
            if (r0 != r4) goto L_0x0051
        L_0x004e:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r2.A00
            return r0
        L_0x0051:
            r0 = 6
            r2 = r1[r0]
            java.lang.Class r0 = r2.A01
            if (r0 != r4) goto L_0x0059
            goto L_0x004e
        L_0x0059:
            r0 = 5
            r2 = r1[r0]
            java.lang.Class r0 = r2.A01
            if (r0 != r4) goto L_0x0061
            goto L_0x004e
        L_0x0061:
            r0 = 4
            r2 = r1[r0]
            java.lang.Class r0 = r2.A01
            if (r0 != r4) goto L_0x0069
            goto L_0x004e
        L_0x0069:
            r0 = 3
            r2 = r1[r0]
            java.lang.Class r0 = r2.A01
            if (r0 != r4) goto L_0x0045
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SIF.A00(java.lang.Class):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public final SIF A01(JsonSerializer jsonSerializer, Class cls) {
        JsonSerializer jsonSerializer2 = jsonSerializer;
        Class cls2 = cls;
        if (this instanceof C8245Qkz) {
            return new C8247Ql1(jsonSerializer, this, cls);
        }
        if (this instanceof C8247Ql1) {
            C8247Ql1 ql1 = (C8247Ql1) this;
            return new C8248Ql2(ql1.A00, jsonSerializer2, ql1, ql1.A01, cls2);
        } else if (this instanceof C8248Ql2) {
            C8248Ql2 ql2 = (C8248Ql2) this;
            return new C8246Ql0(ql2, new C10438RsF[]{new C10438RsF(ql2.A00, ql2.A02), new C10438RsF(ql2.A01, ql2.A03), new C10438RsF(jsonSerializer, cls)});
        } else {
            C8246Ql0 ql0 = (C8246Ql0) this;
            C10438RsF[] rsFArr = ql0.A00;
            int length = rsFArr.length;
            if (length != 8) {
                C10438RsF[] rsFArr2 = (C10438RsF[]) Arrays.copyOf(rsFArr, length + 1);
                rsFArr2[length] = new C10438RsF(jsonSerializer, cls);
                return new C8246Ql0(ql0, rsFArr2);
            } else if (ql0.A00) {
                return new C8247Ql1(jsonSerializer, ql0, cls);
            } else {
                return ql0;
            }
        }
    }

    public SIF(SIF sif) {
        this.A00 = sif.A00;
    }

    public SIF() {
        this.A00 = false;
    }
}
