package X;

import android.os.Bundle;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.Hwv  reason: case insensitive filesystem */
public abstract class C56344Hwv {
    public static H15 A00(HMH hmh, SavedCollection savedCollection, HMV hmv, String str, String str2) {
        AnonymousClass7TF.A1C(str, 0, str2);
        H15 h15 = new H15();
        Bundle A0C = DbX.A0C(str);
        A0C.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", hmh);
        A0C.putParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", savedCollection);
        A0C.putString("prior_module", str2);
        if (hmv != null) {
            A0C.putSerializable("SaveFragment.ARGUMENT_SAVED_COLLECTION_STARTING_TAB_TYPE", hmv);
        }
        h15.setArguments(A0C);
        return h15;
    }

    public static H15 A01(HMH hmh, C54665HMw hMw, String str, String str2, String str3) {
        AnonymousClass7TF.A1D(str, 0, str3);
        H15 h15 = new H15();
        Bundle A0C = DbX.A0C(str);
        A0C.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", hmh);
        A0C.putString("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION_ID", str2);
        A0C.putSerializable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION_TYPE", hMw);
        A0C.putString("prior_module", str3);
        h15.setArguments(A0C);
        return h15;
    }
}
