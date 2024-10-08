package com.fasterxml.jackson.databind.ser.std;

import X.16L;
import X.17Z;
import X.AnonymousClass7TF;
import X.C10798RyK;
import X.C269424f6;
import X.C269504fE;
import X.SPK;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class StdArraySerializers$CharArraySerializer extends StdSerializer {
    public StdArraySerializers$CharArraySerializer() {
        super(char[].class);
    }

    public final /* bridge */ /* synthetic */ void A09(17Z r5, C269504fE r6, SPK spk, Object obj) {
        C10798RyK ryK;
        char[] cArr = (char[]) obj;
        if (r6.A05.A0D(C269424f6.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
            ryK = SPK.A00(r5, 16L.A0C, spk, cArr);
            int length = cArr.length;
            for (int i = 0; i < length; i++) {
                r5.A0z(cArr, i, 1);
            }
        } else {
            ryK = SPK.A00(r5, 16L.A0J, spk, cArr);
            r5.A0z(cArr, 0, cArr.length);
        }
        spk.A04(r5, ryK);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r4, C269504fE r5, Object obj) {
        char[] cArr = (char[]) obj;
        if (r5.A05.A0D(C269424f6.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
            int length = cArr.length;
            r4.A0p(cArr, length);
            for (int i = 0; i < length; i++) {
                r4.A0z(cArr, i, 1);
            }
            r4.A0Y();
            return;
        }
        r4.A0z(cArr, 0, cArr.length);
    }

    public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r2, Object obj) {
        return AnonymousClass7TF.A1Q(((char[]) obj).length);
    }
}
