package X;

import android.util.SparseArray;
import com.instagram.android.R;

/* renamed from: X.Ej6  reason: case insensitive filesystem */
public abstract class C48721Ej6 {
    public static final C307506Qj A00(0lg r3, boolean z) {
        0qQ.A0B(r3, 0);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.bloks_ig_session, r3);
        sparseArray.put(R.id.bloks_ig_use_prelogin_json_parser, Boolean.valueOf(z));
        return new C307506Qj(sparseArray);
    }
}
