package X;

import com.instagram.model.rtc.RtcCallKey;
import com.instagram.rtc.rsys.models.EngineModel;

public abstract class OTZ {
    public RtcCallKey A00;
    public C262224Cq A01;
    public final POS A02;
    public final O9R A03;

    public static EngineModel A0K(N4R n4r) {
        return (EngineModel) n4r.A00;
    }

    public OTZ(O9R o9r) {
        this.A03 = o9r;
        POS pos = new POS(this);
        this.A02 = pos;
        o9r.A00.add(pos);
    }
}
