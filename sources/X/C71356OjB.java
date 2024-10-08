package X;

import android.view.View;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.LinkedHashMap;

/* renamed from: X.OjB  reason: case insensitive filesystem */
public final class C71356OjB implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NgJ A01;
    public final /* synthetic */ ODO A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C71356OjB(NgJ ngJ, ODO odo, String str, String str2, int i) {
        this.A01 = ngJ;
        this.A02 = odo;
        this.A00 = i;
        this.A03 = str;
        this.A04 = str2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1290776967);
        NgJ ngJ = this.A01;
        String str = this.A02.A02;
        int i = this.A00;
        String str2 = this.A03;
        String str3 = this.A04;
        1Ln A052 = 1Ln.A05(((AnonymousClass7I3) ngJ.A00.getValue()).A01);
        if (DbT.A1Y(A052)) {
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            A1H.put(TraceFieldType.ContentType, "ai_bot_search_plugin");
            A1H.put("surface", "extra_resource");
            A1H.put("selected_item", "ai_bot_search_plugin_view_sources");
            A1H.put("resource_index", String.valueOf(i + 1));
            if (str2 != null) {
                A1H.put("agent_id", str2);
            }
            if (str3 != null) {
                A1H.put("bot_response_id", str3);
            }
            A052.A0Q("index_id", Long.valueOf(((long) i) + 1));
            A052.A0w(A1H);
            A052.Cgf();
        }
        SimpleWebViewActivity.A02.A02(ngJ.requireContext(), DbT.A0X(ngJ.A01), new SimpleWebViewConfig(new C11225SFz(str)));
        AnonymousClass0fD.A0C(1952200490, A05);
    }
}
