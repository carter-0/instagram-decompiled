package X;

import com.facebook.locationsharing.core.models.LiveLocationSharer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.RVc  reason: case insensitive filesystem */
public abstract class C9251RVc {
    public static ImmutableMap A00(ImmutableList immutableList) {
        int size = immutableList.size();
        1J2.A00(size, "expectedSize");
        ImmutableMap.Builder builder = new ImmutableMap.Builder(size);
        C249803kO it = immutableList.iterator();
        while (it.hasNext()) {
            LiveLocationSharer liveLocationSharer = (LiveLocationSharer) it.next();
            builder.put(liveLocationSharer.A04, liveLocationSharer);
        }
        return builder.build();
    }
}
