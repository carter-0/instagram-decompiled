package X;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3BM  reason: invalid class name */
public final class AnonymousClass3BM extends 0Yg implements C62320sa {
    public static final AnonymousClass3BM A00 = new AnonymousClass3BM();

    public AnonymousClass3BM() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        return Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(new Date().getTime()));
    }
}
