package X;

import android.view.View;
import com.google.common.collect.MapMakerInternalMap;
import com.instagram.android.R;
import java.util.Map;

/* renamed from: X.2zs  reason: invalid class name and case insensitive filesystem */
public abstract class C235412zs extends C235422zt {
    public final Map A00;

    public final void A03(View view, 1Xj r4) {
        int i;
        Map map;
        if (this instanceof AnonymousClass304) {
            AnonymousClass304 r1 = (AnonymousClass304) this;
            if (r4.CeS() && r1.A00) {
                map = r1.A00;
            } else {
                return;
            }
        } else {
            if (this instanceof AnonymousClass306) {
                if (!r4.A5D()) {
                    return;
                }
            } else if ((this instanceof AnonymousClass30A) || (this instanceof AnonymousClass309)) {
                if (r4.A4f()) {
                    i = R.id.showreel_native_media_view;
                } else {
                    C257643xj AsQ = r4.A0C.AsQ();
                    if (AsQ != null && AsQ.Bw9() != null) {
                        i = R.id.showreel_composition_view;
                    } else {
                        return;
                    }
                }
                View findViewById = view.findViewById(i);
                if (findViewById != null) {
                    this.A00.put(r4, findViewById);
                    return;
                }
                return;
            }
            map = this.A00;
        }
        map.put(r4, view);
    }

    public C235412zs(Map map) {
        super(map);
        17j r1 = new 17j();
        r1.A04(MapMakerInternalMap.Strength.A01);
        r1.A01();
        this.A00 = 0Yt.A03(r1.A00());
    }
}
