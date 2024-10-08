package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableBiMap;

public final class R0H extends ImmutableMap.Builder {
    public R0H() {
        super(4);
    }

    public final /* bridge */ /* synthetic */ ImmutableMap build() {
        int i = this.size;
        if (i == 0) {
            return RegularImmutableBiMap.A04;
        }
        this.entriesUsed = true;
        return new RegularImmutableBiMap(this.alternatingKeysAndValues, i);
    }

    public final /* bridge */ /* synthetic */ ImmutableMap buildOrThrow() {
        int i = this.size;
        if (i == 0) {
            return RegularImmutableBiMap.A04;
        }
        this.entriesUsed = true;
        return new RegularImmutableBiMap(this.alternatingKeysAndValues, i);
    }

    public final void A00(Object obj, Object obj2) {
        R0H.super.put(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ ImmutableMap.Builder put(Object obj, Object obj2) {
        R0H.super.put(obj, obj2);
        return this;
    }
}
