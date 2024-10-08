package X;

import android.content.Context;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import com.instagram.direct.appwidget.DirectWidgetConfig;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Iterator;

/* renamed from: X.PPo  reason: case insensitive filesystem */
public final class C72930PPo implements 0Jp {
    public final /* synthetic */ DirectWidgetConfig A00;
    public final /* synthetic */ String A01;

    public C72930PPo(DirectWidgetConfig directWidgetConfig, String str) {
        this.A01 = str;
        this.A00 = directWidgetConfig;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [com.instagram.direct.appwidget.DirectWidgetConfig, android.content.ContextWrapper] */
    public final void ATC(UserSession userSession, 0Jv r9) {
        0qQ.A0B(r9, 1);
        String str = this.A01;
        if (str == null) {
            ? r3 = this.A00;
            Context baseContext = r3.getBaseContext();
            0qQ.A07(baseContext);
            str = C66581MXm.A07(baseContext, r3.A00).getString(002.A0O("current_custom_chat_list", r3.A00), "");
        }
        int i = 0;
        if (!(str == null || str.length() == 0)) {
            Gson gson = new Gson();
            Type type = new C8709R2m().type;
            0qQ.A07(type);
            Object A09 = gson.A09(str, type);
            0qQ.A07(A09);
            Iterator A0s = AnonymousClass7TF.A0s((AbstractMap) A09);
            DirectWidgetConfig directWidgetConfig = this.A00;
            while (A0s.hasNext()) {
                directWidgetConfig.A05.put(Integer.valueOf(i), AnonymousClass7TE.A1J(A0s).getValue());
                i++;
            }
            DirectWidgetConfig.A01(directWidgetConfig);
        }
        r9.AId((Object) null);
    }
}
