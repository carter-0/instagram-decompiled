package X;

import com.facebook.locationsharing.core.models.LiveLocationSharer;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Ab  reason: invalid class name and case insensitive filesystem */
public final class C327257Ab implements C327267Ac {
    public final Map A00 = new LinkedHashMap();

    public final void FMc(C13919TlL tlL, LiveLocationSharer liveLocationSharer, String str) {
        0qQ.A0B(liveLocationSharer, 1);
        this.A00.put(liveLocationSharer.A04, liveLocationSharer);
        tlL.onSuccess();
    }

    public final void FMd(C13919TlL tlL, String str, List list) {
        0qQ.A0B(list, 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LiveLocationSharer liveLocationSharer = (LiveLocationSharer) it.next();
            this.A00.put(liveLocationSharer.A04, liveLocationSharer);
        }
        tlL.onSuccess();
    }

    public final void BtW(C13920TlM tlM, String str) {
        tlM.onSuccess(ImmutableList.copyOf(this.A00.values()));
    }
}
