package X;

import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "Use LinkAnnotatation.Url(url) instead", replaceWith = @ReplaceWith(expression = "LinkAnnotation.Url(url)", imports = {}))
/* renamed from: X.Hrz  reason: case insensitive filesystem */
public final class C56050Hrz {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C56050Hrz) && 0qQ.A0K(this.A00, ((C56050Hrz) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return G9w.A0k("UrlAnnotation(url=", this.A00);
    }

    public C56050Hrz(String str) {
        this.A00 = str;
    }
}
