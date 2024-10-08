package X;

import android.util.Pair;
import java.util.List;

/* renamed from: X.Oux  reason: case insensitive filesystem */
public final /* synthetic */ class C72023Oux implements AnonymousClass68Z {
    public final /* synthetic */ List A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C72023Oux(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public final Object apply(Object obj) {
        List list = this.A00;
        boolean z = this.A01;
        Pair pair = (Pair) obj;
        return 1aU.A07(new C72147Ox7((AnonymousClass67N) pair.first, (C68313NAa) pair.second, list, z), AnonymousClass6F9.A00("get_should_use_secure_thread"));
    }
}
