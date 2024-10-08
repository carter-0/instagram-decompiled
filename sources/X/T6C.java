package X;

import android.content.ContentResolver;
import android.net.Uri;

public final class T6C implements 1Fq {
    public final long A00;
    public final ContentResolver A01;
    public final Uri A02;
    public final String A03;
    public final String A04;

    public final boolean isStreaming() {
        return true;
    }

    public final void AAW(C7250Q0x q0x, String str) {
        q0x.A00(new T6V(this.A01, this.A02, this.A04, this.A03, this.A00), str);
    }

    public T6C(ContentResolver contentResolver, Uri uri, String str, String str2, long j) {
        this.A01 = contentResolver;
        this.A02 = uri;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = j;
    }
}
