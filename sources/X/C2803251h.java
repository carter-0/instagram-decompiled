package X;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: X.51h  reason: invalid class name and case insensitive filesystem */
public final class C2803251h {
    public final int A00;
    public final ColorStateList A01;
    public final Configuration A02;

    public C2803251h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.A01 = colorStateList;
        this.A02 = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.A00 = hashCode;
    }
}
