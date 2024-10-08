package X;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableBiMap;

/* renamed from: X.Rm3  reason: case insensitive filesystem */
public abstract class C10066Rm3 {
    public static final ImmutableBiMap A00;
    public static final ImmutableBiMap A01;

    static {
        RegularImmutableBiMap regularImmutableBiMap;
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.A00(RFQ.NORMAL, C51967G9n.A0k());
        builder.A00(RFQ.ROTATE_90, 90);
        builder.A00(RFQ.ROTATE_180, 180);
        builder.A00(RFQ.ROTATE_270, 270);
        int i = builder.size;
        if (i == 0) {
            regularImmutableBiMap = RegularImmutableBiMap.A04;
        } else {
            builder.entriesUsed = true;
            regularImmutableBiMap = new RegularImmutableBiMap(builder.alternatingKeysAndValues, i);
        }
        A00 = regularImmutableBiMap;
        A01 = regularImmutableBiMap.A00;
    }
}
