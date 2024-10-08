package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3Ff  reason: invalid class name and case insensitive filesystem */
public final class C239163Ff extends Exception {
    public final ImmutableList A00;

    public C239163Ff(String str, List list) {
        super(str);
        this.A00 = ImmutableList.copyOf((Collection) list);
    }
}
