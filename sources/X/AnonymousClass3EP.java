package X;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.3EP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3EP implements C62320sa {
    public final /* synthetic */ 0lg A00;

    public /* synthetic */ AnonymousClass3EP(0lg r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.3EO] */
    public final Object invoke() {
        0lg r0 = this.A00;
        ? obj = new Object();
        obj.A00 = r0;
        obj.A01 = new HashMap();
        obj.A02 = new HashMap();
        C62880wX r5 = C61170le.A00;
        String string = AnonymousClass0xl.A00(r5).A00.getString("deferred_account_data", "");
        0qQ.A0A(string);
        String string2 = AnonymousClass0xl.A00(r5).A00.getString("deferred_recovered_account_data", "");
        0qQ.A0A(string2);
        try {
            if (!TextUtils.isEmpty(string)) {
                ImmutableList copyOf = ImmutableList.copyOf((Collection) AnonymousClass9GM.parseFromJson(16P.A00(string)).A00);
                0qQ.A07(copyOf);
                AnonymousClass3EO.A01(obj, copyOf);
            }
            if (!TextUtils.isEmpty(string2)) {
                Iterator it = ImmutableList.copyOf((Collection) C49022Eny.parseFromJson(16P.A00(string2)).A00).iterator();
                while (it.hasNext()) {
                    C49557Exs exs = (C49557Exs) it.next();
                    obj.A02.put(exs.A00.getId(), exs);
                }
            }
        } catch (IOException e) {
            0wb.A03("DeferredAccountHelper", 002.A0R("Malformed cached deferred accounts. Error:", e.getMessage()));
        }
        return obj;
    }
}
