package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.7fO  reason: invalid class name and case insensitive filesystem */
public final class C336917fO implements C253023q5 {
    public final /* synthetic */ Map A00;
    public final /* synthetic */ 0sL A01;

    public final void D2o(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        Object obj;
        0sL r0;
        0qQ.A0B(str, 1);
        Map map = this.A00;
        if (map != null && map.containsKey(str) && (obj = map.get(str)) != null && (r0 = this.A01) != null) {
            r0.invoke(str, obj);
        }
    }

    public C336917fO(Map map, 0sL r2) {
        this.A00 = map;
        this.A01 = r2;
    }
}
