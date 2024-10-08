package X;

import com.instagram.model.reels.Reel;
import java.util.Map;

/* renamed from: X.WaQ  reason: case insensitive filesystem */
public final class C19478WaQ implements C279314yR {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C19478WaQ(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void Dok(Map map) {
        Reel reel;
        Reel reel2;
        if (this.A00 != 0) {
            if (map != null && (reel2 = (Reel) map.get(this.A02)) != null) {
                ((C60308Jj7) this.A01).A06(reel2);
            }
        } else if (map == null || (reel = (Reel) map.get(this.A02)) == null) {
            C59689JTv.A0E(DbT.A08(this.A01), "ReelLoad_network_error");
        } else {
            C15386Ubl.A01((C15386Ubl) this.A01, reel);
        }
    }

    public final void onFailure() {
        if (this.A00 == 0) {
            C59689JTv.A0E(DbT.A08(this.A01), "ReelLoad_network_error");
        }
    }
}
