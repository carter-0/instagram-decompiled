package X;

import android.os.Looper;
import java.util.HashSet;

/* renamed from: X.QbW  reason: case insensitive filesystem */
public final class C7848QbW extends 2SM {
    public final HashSet A00 = AnonymousClass7TE.A1F();

    public C7848QbW(String[] strArr) {
        super(strArr);
    }

    public final void A00(PzN pzN) {
        Looper myLooper;
        if (this.A00.add(Long.valueOf(Thread.currentThread().getId())) && (myLooper = Looper.myLooper()) != null) {
            C273264mF.A00().A02(myLooper);
        }
    }
}
