package X;

import android.util.SparseArray;

public enum RFX {
    MANIFEST_FETCH_END(1),
    PREFETCH_CACHE_EVICT(4),
    QUALITY_CHANGED(5),
    SPAN_CHANGED(6),
    QUALITY_SUMMARY(7),
    CACHE_ERROR(8),
    PREFETCH_START(10),
    DATABASE_FULL(12),
    MANIFEST_PARSE_ERROR(13),
    SUGGEST_UNBIND(14);
    
    public static final SparseArray A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = Pxe.A0L();
        for (RFX rfx : values()) {
            A01.put(rfx.A00, rfx);
        }
    }

    /* access modifiers changed from: public */
    RFX(int i) {
        this.A00 = i;
    }
}
