package X;

import java.util.Map;
import java.util.concurrent.Callable;

public final class TNF implements Callable {
    public final /* synthetic */ AnonymousClass6R2 A00;
    public final /* synthetic */ String A01;

    public TNF(AnonymousClass6R2 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        AnonymousClass6R2 r2 = this.A00;
        String str = this.A01;
        try {
            1KZ.A01(002.A0T("BloksComponentQueryDiskCache", "removeResponseForKey", ':'));
            r2.A01.A00.remove(str);
            Object obj = r2.A05.get();
            0qQ.A07(obj);
            AnonymousClass6R2.A00(r2, 0Yt.A09(str, 0Yt.A0B((Map) obj)));
            1KZ.A00();
            return C60340gF.A00;
        } catch (Throwable th) {
            1KZ.A00();
            throw th;
        }
    }
}
