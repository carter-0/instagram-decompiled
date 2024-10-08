package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.5Ia  reason: invalid class name and case insensitive filesystem */
public final class C283525Ia implements AnonymousClass5IP {
    public final ImmutableList A00;

    public final ImmutableMap AET() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        ImmutableList immutableList = this.A00;
        if (immutableList != null && !immutableList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            C249803kO it = immutableList.iterator();
            0qQ.A07(it);
            while (it.hasNext()) {
                AnonymousClass4VV r1 = (AnonymousClass4VV) it.next();
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(r1.A00.A00.name());
            }
            builder.put("filterNames", sb.toString());
        }
        ImmutableMap build = builder.build();
        0qQ.A07(build);
        return build;
    }

    public C283525Ia(ImmutableList immutableList) {
        this.A00 = immutableList;
    }
}
