package X;

import com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8g1  reason: invalid class name and case insensitive filesystem */
public final class C361308g1 implements AnonymousClass0lh {
    public final ClipsDraftLocalDataSource A00;
    public final Map A01 = new LinkedHashMap();

    public C361308g1(ClipsDraftLocalDataSource clipsDraftLocalDataSource) {
        0qQ.A0B(clipsDraftLocalDataSource, 1);
        this.A00 = clipsDraftLocalDataSource;
    }

    public final C293505kq A00(String str) {
        0qQ.A0B(str, 0);
        Map map = this.A01;
        if (map.containsKey(str)) {
            return (C293505kq) map.get(str);
        }
        C293505kq r0 = (C293505kq) C67351tA.A00(19B.A00, new AnonymousClass9KX(this, str, (AnonymousClass4D7) null, 0));
        if (r0 == null) {
            return null;
        }
        map.put(str, r0);
        return r0;
    }

    public final void onSessionWillEnd() {
        this.A01.clear();
    }
}
