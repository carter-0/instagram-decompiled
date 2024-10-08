package X;

import com.facebook.msys.mcf.MsysError;
import java.util.Map;

public final class ODB {
    public final MsysError A00;
    public final Map A01;
    public final boolean A02;

    public ODB(MsysError msysError, Map map, boolean z) {
        this.A01 = map;
        this.A00 = msysError;
        this.A02 = z;
    }
}
