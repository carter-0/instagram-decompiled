package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.5IO  reason: invalid class name */
public final class AnonymousClass5IO implements AnonymousClass5IP {
    public final long A00;
    public final long A01;
    public final long A02;

    public final ImmutableMap AET() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put("startTimeEpochMillis", String.valueOf(this.A02));
        builder.put("endTimeEpochMillis", String.valueOf(this.A01));
        builder.put("clientTimeInEpochMillis", String.valueOf(this.A00));
        ImmutableMap build = builder.build();
        0qQ.A07(build);
        return build;
    }

    public AnonymousClass5IO(long j, long j2, long j3) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
    }
}
