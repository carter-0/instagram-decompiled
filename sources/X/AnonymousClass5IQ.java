package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.5IQ  reason: invalid class name */
public final class AnonymousClass5IQ implements AnonymousClass5IP {
    public final long A00;
    public final long A01;

    public final ImmutableMap AET() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        long j = this.A01;
        builder.put("ttlInMillis", String.valueOf(j));
        long j2 = this.A00;
        builder.put("clientTimeInEpochMillis", String.valueOf(j2));
        builder.put("fetchTimeInEpochMillis", String.valueOf(0));
        builder.put("deltaSinceFetchInMillis", String.valueOf((j2 - 0) - j));
        ImmutableMap build = builder.build();
        0qQ.A07(build);
        return build;
    }

    public AnonymousClass5IQ(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
