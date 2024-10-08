package com.fasterxml.jackson.databind.ser.std;

import X.16L;
import X.17Z;
import X.AnonymousClass7TF;
import X.C10798RyK;
import X.C269504fE;
import X.SPK;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class ByteArraySerializer extends StdSerializer {
    public ByteArraySerializer() {
        super(byte[].class);
    }

    public final /* bridge */ /* synthetic */ void A09(17Z r5, C269504fE r6, SPK spk, Object obj) {
        byte[] bArr = (byte[]) obj;
        C10798RyK A00 = SPK.A00(r5, 16L.A0E, spk, bArr);
        r5.A0i(r6.A05.A01.A00, bArr, 0, bArr.length);
        spk.A04(r5, A00);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r4, C269504fE r5, Object obj) {
        byte[] bArr = (byte[]) obj;
        r4.A0i(r5.A05.A01.A00, bArr, 0, bArr.length);
    }

    public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r2, Object obj) {
        return AnonymousClass7TF.A1Q(((byte[]) obj).length);
    }
}
