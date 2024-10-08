package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.AnonymousClass5EG;
import X.C13782Tgx;
import X.C13901TjO;
import X.C268894eF;
import X.C269504fE;
import X.C269574fL;
import X.C269714fZ;
import X.SPK;
import com.fasterxml.jackson.databind.JsonSerializer;

public class StdDelegatingSerializer extends StdSerializer implements C269714fZ, AnonymousClass5EG {
    public final C13782Tgx A00;
    public final C268894eF A01;
    public final JsonSerializer A02;

    public final void A09(17Z r3, C269504fE r4, SPK spk, Object obj) {
        Object AJt = this.A00.AJt(obj);
        JsonSerializer jsonSerializer = this.A02;
        if (jsonSerializer == null) {
            jsonSerializer = r4.A0N(obj.getClass());
        }
        jsonSerializer.A09(r3, r4, spk, AJt);
    }

    public final void A0A(17Z r3, C269504fE r4, Object obj) {
        Object AJt = this.A00.AJt(obj);
        if (AJt == null) {
            r4.A0T(r3);
            return;
        }
        JsonSerializer jsonSerializer = this.A02;
        if (jsonSerializer == null) {
            jsonSerializer = r4.A0N(AJt.getClass());
        }
        jsonSerializer.A0A(r3, r4, AJt);
    }

    public final boolean A0B(C269504fE r4, Object obj) {
        Object AJt = this.A00.AJt(obj);
        if (AJt == null) {
            return true;
        }
        JsonSerializer jsonSerializer = this.A02;
        if (jsonSerializer != null) {
            return jsonSerializer.A0B(r4, AJt);
        }
        if (obj != null) {
            return false;
        }
        return true;
    }

    public final JsonSerializer ALi(C13901TjO tjO, C269504fE r8) {
        JsonSerializer jsonSerializer = this.A02;
        JsonSerializer jsonSerializer2 = jsonSerializer;
        C268894eF r3 = this.A01;
        C268894eF r2 = r3;
        if (jsonSerializer == null) {
            if (r3 == null) {
                r3 = this.A00.BZZ(r8.A05());
            }
            if (r3.A00 != Object.class) {
                jsonSerializer = r8.A0K(r3);
            }
        }
        if (jsonSerializer instanceof C269714fZ) {
            jsonSerializer = r8.A0F(tjO, jsonSerializer);
        }
        if (jsonSerializer == jsonSerializer2 && r3 == r2) {
            return this;
        }
        C13782Tgx tgx = this.A00;
        C269574fL.A0E(StdDelegatingSerializer.class, this, "withDelegate");
        return new StdDelegatingSerializer(r3, jsonSerializer, tgx);
    }

    public final void EIT(C269504fE r3) {
        JsonSerializer jsonSerializer = this.A02;
        if (jsonSerializer != null && (jsonSerializer instanceof AnonymousClass5EG)) {
            ((AnonymousClass5EG) jsonSerializer).EIT(r3);
        }
    }

    public StdDelegatingSerializer(C268894eF r1, JsonSerializer jsonSerializer, C13782Tgx tgx) {
        super(r1);
        this.A00 = tgx;
        this.A01 = r1;
        this.A02 = jsonSerializer;
    }
}
