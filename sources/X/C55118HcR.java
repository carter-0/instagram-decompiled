package X;

import android.os.Bundle;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.HcR  reason: case insensitive filesystem */
public abstract class C55118HcR {
    public static final H15 A00(Bundle bundle) {
        C55115HcO.A00();
        String string = bundle.getString("IgSessionManager.SESSION_TOKEN_KEY");
        if (string == null) {
            string = "";
        }
        HMH hmh = (HMH) bundle.getSerializable("SaveFragment.SAVE_HOME_TAB_MODE", HMH.class);
        if (hmh != null) {
            SavedCollection savedCollection = (SavedCollection) bundle.getParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION");
            if (savedCollection != null) {
                String string2 = bundle.getString("prior_module");
                if (string2 == null) {
                    string2 = "";
                }
                return C56344Hwv.A00(hmh, savedCollection, (HMV) bundle.getSerializable("SaveFragment.ARGUMENT_SAVED_COLLECTION_STARTING_TAB_TYPE", HMV.class), string, string2);
            }
            throw AnonymousClass7TE.A0z("Saved Feed Collection can't be null");
        }
        throw AnonymousClass7TE.A0z("SavedFeedMode can't be null");
    }
}
