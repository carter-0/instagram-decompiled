package X;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;

public final class T6V implements C13966TmT {
    public long A00 = -1;
    public final ContentResolver A01;
    public final Uri A02;
    public final String A03;
    public final String A04;

    public final long Cfu() {
        return this.A00;
    }

    public final InputStream E15() {
        return this.A01.openInputStream(this.A02);
    }

    public final String getContentType() {
        return this.A03;
    }

    public final String getName() {
        return this.A04;
    }

    public T6V(ContentResolver contentResolver, Uri uri, String str, String str2, long j) {
        AnonymousClass7TG.A1O(contentResolver, uri);
        this.A01 = contentResolver;
        this.A02 = uri;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = j;
    }
}
