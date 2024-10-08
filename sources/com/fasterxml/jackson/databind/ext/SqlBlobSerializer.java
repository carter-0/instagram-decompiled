package com.fasterxml.jackson.databind.ext;

import X.16L;
import X.17Z;
import X.AnonymousClass4iD;
import X.C10798RyK;
import X.C269494fD;
import X.C269504fE;
import X.SPK;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.sql.Blob;
import java.sql.SQLException;

@JacksonStdImpl
public class SqlBlobSerializer extends StdScalarSerializer {
    public SqlBlobSerializer() {
        super(Blob.class);
    }

    public final /* bridge */ /* synthetic */ void A09(17Z r2, C269504fE r3, SPK spk, Object obj) {
        Blob blob = (Blob) obj;
        C10798RyK A00 = SPK.A00(r2, 16L.A0E, spk, blob);
        A03(r2, r3, blob);
        spk.A04(r2, A00);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r1, C269504fE r2, Object obj) {
        A03(r1, r2, (Blob) obj);
    }

    public static final void A03(17Z r3, C269504fE r4, Blob blob) {
        try {
            r3.A0X(r4.A05.A01.A00, blob.getBinaryStream(), -1);
        } catch (SQLException e) {
            throw new AnonymousClass4iD(((C269494fD) r4).A00, "Failed to access `java.sql.Blob` value to write as binary value", e);
        }
    }
}
