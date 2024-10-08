package X;

import com.instagram.autoplay.models.AutoplayOnScreenItemWithMetadata;
import com.instagram.autoplay.models.AutoplayScreenItemWithoutMetadata;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.TpX  reason: case insensitive filesystem */
public final class C14083TpX {
    public final X8M A00;
    public final C14082TpW A01;
    public final Map A02 = new LinkedHashMap();
    public final Map A03 = new LinkedHashMap();
    public final C61410nE A04;

    public C14083TpX(X8M x8m, C14082TpW tpW, C61410nE r4) {
        0qQ.A0B(r4, 2);
        this.A00 = x8m;
        this.A04 = r4;
        this.A01 = tpW;
    }

    public final AutoplayScreenItemWithoutMetadata A00(1Xj r14) {
        AutoplayOnScreenItemWithMetadata autoplayOnScreenItemWithMetadata;
        0qQ.A0B(r14, 0);
        Map map = this.A02;
        boolean containsKey = map.containsKey(r14.getId());
        Object obj = map.get(r14.getId());
        if (containsKey) {
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.autoplay.models.AutoplayScreenItemWithoutMetadata");
            AutoplayScreenItemWithoutMetadata autoplayScreenItemWithoutMetadata = (AutoplayScreenItemWithoutMetadata) obj;
            AutoplayOnScreenItemWithMetadata autoplayOnScreenItemWithMetadata2 = (AutoplayOnScreenItemWithMetadata) this.A03.get(r14.getId());
            AutoplayOnScreenItemWithMetadata autoplayOnScreenItemWithMetadata3 = autoplayOnScreenItemWithMetadata2;
            if (autoplayOnScreenItemWithMetadata2 == null) {
                autoplayOnScreenItemWithMetadata3 = new AutoplayOnScreenItemWithMetadata(autoplayScreenItemWithoutMetadata.media, autoplayScreenItemWithoutMetadata.timeAddedToScreen, 0, 0, 0, 0, 0.0f);
            }
            this.A00.FKw(autoplayOnScreenItemWithMetadata3);
            autoplayOnScreenItemWithMetadata3.timeSinceAddedToScreen = System.currentTimeMillis() - autoplayOnScreenItemWithMetadata3.timeAddedToScreen;
            autoplayOnScreenItemWithMetadata = autoplayOnScreenItemWithMetadata3;
        } else {
            AutoplayScreenItemWithoutMetadata autoplayScreenItemWithoutMetadata2 = (AutoplayScreenItemWithoutMetadata) obj;
            autoplayOnScreenItemWithMetadata = autoplayScreenItemWithoutMetadata2;
            if (autoplayScreenItemWithoutMetadata2 == null) {
                return new AutoplayScreenItemWithoutMetadata(r14, 0);
            }
        }
        return autoplayOnScreenItemWithMetadata;
    }

    public final ArrayList A01() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.A02.entrySet()) {
            entry.getKey();
            AutoplayScreenItemWithoutMetadata A002 = A00(((AutoplayScreenItemWithoutMetadata) entry.getValue()).media);
            0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.autoplay.models.AutoplayOnScreenItemWithMetadata");
            arrayList.add(A002);
        }
        return arrayList;
    }
}
