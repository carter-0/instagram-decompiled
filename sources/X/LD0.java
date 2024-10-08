package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

public final class LD0 {
    public final String A00;
    public final boolean A01;
    public final List A02;

    public LD0(String str, List list, boolean z) {
        0qQ.A0B(list, 3);
        this.A00 = str;
        this.A01 = z;
        this.A02 = list;
    }

    public final ImmutableList A00() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(this.A02);
        ImmutableList build = builder.build();
        0qQ.A07(build);
        return build;
    }
}
