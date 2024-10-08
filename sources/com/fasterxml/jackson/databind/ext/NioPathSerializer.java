package com.fasterxml.jackson.databind.ext;

import X.17Z;
import X.C10798RyK;
import X.C269504fE;
import X.SPK;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.nio.file.Path;

public class NioPathSerializer extends StdScalarSerializer {
    public NioPathSerializer() {
        super(Path.class);
    }

    public final /* bridge */ /* synthetic */ void A09(17Z r3, C269504fE r4, SPK spk, Object obj) {
        Path path = (Path) obj;
        C10798RyK A01 = SPK.A01(r3, spk, Path.class, path);
        r3.A0t(path.toUri().toString());
        spk.A04(r3, A01);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r2, C269504fE r3, Object obj) {
        r2.A0t(((Path) obj).toUri().toString());
    }
}
