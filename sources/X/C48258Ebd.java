package X;

import android.os.Bundle;

/* renamed from: X.Ebd  reason: case insensitive filesystem */
public final class C48258Ebd {
    public final E3O A00(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        Bundle A0a = AnonymousClass7TE.A0a();
        if (!(str == null || str.length() == 0)) {
            A0a.putString("ExplorePeopleFragment.ARGUMENT_ENTRY_POINT", str);
        }
        if (!(str4 == null || str4.length() == 0)) {
            A0a.putString("ExplorePeopleFragment.ARGUMENT_ENTRY_FEED_ITEM_TYPE", str4);
        }
        if (!(str2 == null || str2.length() == 0)) {
            A0a.putString("ExplorePeopleFragment.ARGUMENT_FRAGMENT_TITLE", str2);
        }
        if (!(str3 == null || str3.length() == 0)) {
            A0a.putString("ExplorePeopleFragment.ARGUMENT_TYPE", str3);
        }
        if (bool != null) {
            A0a.putBoolean("ExplorePeopleFragment.ARGUMENT_SHOULD_SHOW_NEW_HEADER", bool.booleanValue());
        }
        if (str5 != null) {
            A0a.putString(C66579MXk.A00(29), str5);
        }
        if (str6 != null) {
            A0a.putString("ExplorePeopleFragment.ARGUMENT_SURFACE", str6);
        }
        A0a.putBoolean(C273654mx.A00(35), false);
        E3O e3o = new E3O();
        e3o.setArguments(A0a);
        return e3o;
    }

    public final E3O A01(String str, String str2) {
        return A00((Boolean) null, str, str2, (String) null, (String) null, (String) null, (String) null);
    }
}
