package X;

import android.os.Bundle;
import android.os.Parcelable;

public final class F1R {
    public final E4O A00(Parcelable parcelable, 0lg r5, EVV evv, Integer num, String str, String str2) {
        Bundle A0a = AnonymousClass7TE.A0a();
        DbW.A0w(A0a, r5);
        A0a.putParcelable("argument_content", parcelable);
        A0a.putString("argument_flow", C49778F6l.A00(num));
        A0a.putSerializable("argument_entry_point", evv);
        A0a.putSerializable("argument_selected_age_account_id", str);
        A0a.putSerializable("argument_selected_age_account_type", str2);
        A0a.putSerializable("argument_disclosure_version", EVU.NO_SPLIT);
        A0a.putSerializable("argument_force_disclosure_reading", AnonymousClass7TE.A0u());
        E4O e4o = new E4O();
        e4o.setArguments(A0a);
        return e4o;
    }
}
