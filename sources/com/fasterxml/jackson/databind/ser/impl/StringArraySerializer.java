package com.fasterxml.jackson.databind.ser.impl;

import X.17Z;
import X.AnonymousClass4eE;
import X.AnonymousClass7TF;
import X.C13901TjO;
import X.C268894eF;
import X.C269504fE;
import X.C269714fZ;
import X.Pxi;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;

@JacksonStdImpl
public class StringArraySerializer extends ArraySerializerBase implements C269714fZ {
    public static final StringArraySerializer A01 = new StringArraySerializer();
    public static final C268894eF A02 = AnonymousClass4eE.A0A.A0C(String.class);
    public final JsonSerializer A00;

    public final void A0E(17Z r5, C269504fE r6, String[] strArr) {
        int length = strArr.length;
        if (length != 0) {
            JsonSerializer jsonSerializer = this.A00;
            int i = 0;
            if (jsonSerializer != null) {
                do {
                    String str = strArr[i];
                    if (str == null) {
                        r6.A0T(r5);
                    } else {
                        jsonSerializer.A0A(r5, r6, str);
                    }
                    i++;
                } while (i < length);
                return;
            }
            do {
                String str2 = strArr[i];
                if (str2 == null) {
                    r5.A0a();
                } else {
                    r5.A0t(str2);
                }
                i++;
            } while (i < length);
        }
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r4, C269504fE r5, Object obj) {
        Boolean bool;
        String[] strArr = (String[]) obj;
        int length = strArr.length;
        if (length != 1 || (((bool = this.A01) != null || !Pxi.A1U(r5)) && bool != Boolean.TRUE)) {
            r4.A0p(strArr, length);
            A0E(r4, r5, strArr);
            r4.A0Y();
            return;
        }
        A0E(r4, r5, strArr);
    }

    public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r2, Object obj) {
        return AnonymousClass7TF.A1Q(((String[]) obj).length);
    }

    public StringArraySerializer(C13901TjO tjO, JsonSerializer jsonSerializer, StringArraySerializer stringArraySerializer, Boolean bool) {
        super(tjO, stringArraySerializer, bool);
        this.A00 = jsonSerializer;
    }

    public StringArraySerializer() {
        super(String[].class);
        this.A00 = null;
    }
}
