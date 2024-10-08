package X;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.QDc  reason: case insensitive filesystem */
public final class C7437QDc extends XQX {
    public final Uri A00;
    public final ImmutableList A01;

    public C7437QDc(Uri uri, String str, List list) {
        super(str, (Throwable) null, 1, false);
        this.A00 = uri;
        this.A01 = ImmutableList.copyOf((Collection) list);
    }
}
