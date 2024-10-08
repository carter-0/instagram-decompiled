package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.PEr  reason: case insensitive filesystem */
public final class C72662PEr implements C74418PuY {
    public final /* synthetic */ SettableFuture A00;

    public C72662PEr(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }

    public final void D61(Throwable th) {
        this.A00.set((Object) null);
    }

    public final void D62(List list, boolean z) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(((C70781OLb) it.next()).A00());
            } catch (JSONException e) {
                0KC.A0F("InstagramContactHelper", "Skip one contact serialization due to error", e);
            }
        }
        this.A00.set(jSONArray);
    }
}
