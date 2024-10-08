package X;

import com.google.common.collect.ImmutableMap;
import java.util.Iterator;

/* renamed from: X.Rfx  reason: case insensitive filesystem */
public abstract class C9739Rfx {
    public static ImmutableMap A00(AnonymousClass2hV r2, ImmutableMap.Builder builder, Iterator it) {
        while (it.hasNext()) {
            Object next = it.next();
            builder.put(r2.apply(next), next);
        }
        try {
            return builder.buildOrThrow();
        } catch (IllegalArgumentException e) {
            throw AnonymousClass7TF.A0W(e.getMessage(), ". To index multiple values under a key, use Multimaps.index.");
        }
    }
}
