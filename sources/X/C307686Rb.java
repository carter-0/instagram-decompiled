package X;

import android.util.SparseArray;
import com.instagram.android.R;
import java.util.HashMap;

/* renamed from: X.6Rb  reason: invalid class name and case insensitive filesystem */
public final class C307686Rb extends HashMap<String, AnonymousClass6RZ> {
    public final /* synthetic */ C229382nI A00;
    public final /* synthetic */ AnonymousClass6RW A01;

    public C307686Rb(C229382nI r4, AnonymousClass6RW r5) {
        this.A00 = r4;
        this.A01 = r5;
        SparseArray sparseArray = new SparseArray();
        0lg r0 = r4.A06;
        sparseArray.put(R.id.bloks_ig_session, r0);
        put("ig_api", new C307696Rc(r0));
        put("gql", r5.A00);
        put("media_store", new C307706Rd());
    }
}
