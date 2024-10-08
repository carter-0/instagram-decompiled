package X;

import com.google.common.collect.ImmutableMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Rz5  reason: case insensitive filesystem */
public abstract class C10845Rz5 {
    public static final C7246Q0s A00;
    public static final C7246Q0s A01;
    public static final ImmutableMap A02;
    public long accessExpirationDuration;
    public TimeUnit accessExpirationTimeUnit;
    public Integer concurrencyLevel;
    public Integer initialCapacity;
    public C367738rU keyStrength;
    public Long maximumSize;
    public Long maximumWeight;
    public Boolean recordStats;
    public long refreshDuration;
    public TimeUnit refreshTimeUnit;
    public C367738rU valueStrength;
    public long writeExpirationDuration;
    public TimeUnit writeExpirationTimeUnit;

    static {
        C7246Q0s A002 = C7246Q0s.A00(',');
        C12614Szy szy = C8640Qyd.A01;
        A00 = new C7246Q0s(szy, A002.A01);
        A01 = new C7246Q0s(szy, C7246Q0s.A00('=').A01);
        ImmutableMap.Builder A0Q = Pxf.A0Q();
        A0Q.put("initialCapacity", new Object());
        A0Q.put("maximumSize", new Object());
        A0Q.put("maximumWeight", new Object());
        A0Q.put("concurrencyLevel", new Object());
        C367738rU r0 = C367738rU.A02;
        A0Q.put("weakKeys", new Object());
        A0Q.put("softValues", new Object());
        A0Q.put("weakValues", new Object());
        A0Q.put("recordStats", new Object());
        A0Q.put("expireAfterAccess", new Object());
        A0Q.put("expireAfterWrite", new Object());
        A0Q.put("refreshAfterWrite", new Object());
        A0Q.put("refreshInterval", new Object());
        A02 = A0Q.buildOrThrow();
    }
}
