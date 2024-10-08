package X;

import android.net.Uri;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.S4p  reason: case insensitive filesystem */
public final class C10995S4p {
    public final long A00;
    public final Uri A01;
    public final ImmutableList A02;
    public final List A03;
    @Deprecated
    public final List A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10995S4p)) {
            return false;
        }
        C10995S4p s4p = (C10995S4p) obj;
        return this.A01.equals(s4p.A01) && this.A03.equals(s4p.A03) && this.A02.equals(s4p.A02) && Util.A0E(Long.valueOf(this.A00), Long.valueOf(s4p.A00));
    }

    public final int hashCode() {
        return (int) ((((long) AnonymousClass7TF.A07(this.A02, ((AnonymousClass7TE.A0K(this.A01) * 31 * 31 * 31) + this.A03.hashCode()) * 31 * 31)) * 31) + this.A00);
    }

    public C10995S4p(Uri uri, ImmutableList immutableList, List list) {
        this.A01 = uri;
        this.A03 = list;
        this.A02 = immutableList;
        ImmutableList.Builder builder = ImmutableList.builder();
        if (0 < immutableList.size()) {
            immutableList.get(0);
            throw AnonymousClass7TE.A11("buildUpon");
        }
        this.A04 = builder.build();
        this.A00 = -9223372036854775807L;
    }
}
