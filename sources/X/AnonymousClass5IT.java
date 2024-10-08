package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.5IT  reason: invalid class name */
public final class AnonymousClass5IT implements AnonymousClass5IP {
    public AnonymousClass5IV A00;
    public AnonymousClass5IV A01;
    public AnonymousClass5IV A02;
    public AnonymousClass5IV A03;

    public final ImmutableMap AET() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        AnonymousClass5IV r2 = this.A01;
        if (r2 != null) {
            builder.put("impressionCount", String.valueOf(r2.A00));
            builder.put("impressionLimit", String.valueOf(r2.A01));
        }
        AnonymousClass5IV r22 = this.A02;
        if (r22 != null) {
            builder.put("primaryActionCount", String.valueOf(r22.A00));
            builder.put("primaryActionLimit", String.valueOf(r22.A01));
        }
        AnonymousClass5IV r23 = this.A03;
        if (r23 != null) {
            builder.put("secondaryActionCount", String.valueOf(r23.A00));
            builder.put("secondaryActionLimit", String.valueOf(r23.A01));
        }
        AnonymousClass5IV r24 = this.A00;
        if (r24 != null) {
            builder.put("dismissActionCount", String.valueOf(r24.A00));
            builder.put("dismissActionLimit", String.valueOf(r24.A01));
        }
        ImmutableMap build = builder.build();
        0qQ.A07(build);
        return build;
    }
}
