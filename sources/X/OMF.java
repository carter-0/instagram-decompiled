package X;

import com.instagram.direct.msys.subtype.MsysThreadSubtype;

public final class OMF {
    public final C68332NAt A00;

    public OMF(C68332NAt nAt) {
        0qQ.A0B(nAt, 1);
        this.A00 = nAt;
    }

    public final MsysThreadSubtype A00() {
        return C70116NxW.A00(C66581MXm.A0o(this.A00.mResultSet, 0, 18));
    }

    public final String A01() {
        C68332NAt nAt = this.A00;
        String string = nAt.mResultSet.getString(0, 3);
        if (string == null) {
            return C66581MXm.A0u(nAt, 0);
        }
        return string;
    }
}
