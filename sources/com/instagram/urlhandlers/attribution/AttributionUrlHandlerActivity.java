package com.instagram.urlhandlers.attribution;

import X.08y;
import X.09i;
import X.0Gl;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C16857V8m;
import X.C17890Vhh;
import X.C18724Vyy;
import X.C20115WlD;
import X.DbT;
import X.DbX;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.base.activity.BaseFragmentActivity;
import org.json.JSONObject;

public final class AttributionUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.attribution.AttributionUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.attribution.AttributionUrlHandlerActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(-1556058898);
        super.onCreate(bundle);
        C17890Vhh A002 = C16857V8m.A00(this, 0Gl.A00(getSession()));
        C18724Vyy vyy = A002.A04;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TraceFieldType.AdhocEventName, "flush");
        C18724Vyy.A01(DbT.A10(jSONObject), "info", vyy);
        A002.A03.execute(new C20115WlD(A002));
        finish();
        AnonymousClass0fD.A07(-1336508980, A00);
    }
}
