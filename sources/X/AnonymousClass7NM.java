package X;

import android.os.Handler;
import android.os.Looper;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7NM  reason: invalid class name */
public final class AnonymousClass7NM {
    public final Handler A00;
    public final HashMap A01;

    public AnonymousClass7NM() {
        this((Handler) null, (DefaultConstructorMarker) null, 1);
    }

    public final void A00(String str, C62320sa r5, long j) {
        0qQ.A0B(str, 0);
        C41164ApO apO = new C41164ApO(this, str, r5);
        HashMap hashMap = this.A01;
        Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new HashSet();
            hashMap.put(str, obj);
        }
        ((AbstractCollection) obj).add(apO);
        this.A00.postDelayed(apO, j);
    }

    public /* synthetic */ AnonymousClass7NM(Handler handler, DefaultConstructorMarker defaultConstructorMarker, int i) {
        this.A00 = new Handler(Looper.getMainLooper());
        this.A01 = new HashMap();
    }
}
