package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.RtS  reason: case insensitive filesystem */
public final class C10513RtS {
    public final long A00;
    public final long A01;
    public final ImmutableList A02;

    public C10513RtS(List list, long j, long j2) {
        this.A02 = ImmutableList.copyOf((Collection) list);
        this.A01 = j;
        this.A00 = j2;
    }
}
