package X;

import android.os.Bundle;

/* renamed from: X.Elq  reason: case insensitive filesystem */
public abstract class C48890Elq {
    public static final C47523E6j A00(Bundle bundle) {
        C47523E6j e6j = new C47523E6j();
        if (!bundle.containsKey("ExplorePeopleFragment.ARGUMENT_TYPE")) {
            bundle.putString("ExplorePeopleFragment.ARGUMENT_TYPE", "discover_people");
        }
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", bundle.getString("IgSessionManager.SESSION_TOKEN_KEY"));
        e6j.setArguments(bundle);
        return e6j;
    }
}
