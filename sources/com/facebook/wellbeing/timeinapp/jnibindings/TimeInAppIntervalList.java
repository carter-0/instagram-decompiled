package com.facebook.wellbeing.timeinapp.jnibindings;

import com.google.common.collect.ImmutableList;

public class TimeInAppIntervalList {
    public final ImmutableList.Builder intervals = new ImmutableList.Builder();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.V3M, java.lang.Object] */
    public void add(long j, long j2, long j3, long j4) {
        ImmutableList.Builder builder = this.intervals;
        ? obj = new Object();
        obj.A01 = j;
        obj.A00 = j3;
        builder.add(obj);
    }
}
