package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.instagram.direct.appwidget.DirectWidgetConfig;
import java.util.List;

/* renamed from: X.Okx  reason: case insensitive filesystem */
public final class C71458Okx implements AdapterView.OnItemClickListener {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ QAL A01;
    public final /* synthetic */ DirectWidgetConfig A02;
    public final /* synthetic */ List A03;

    public C71458Okx(TextView textView, QAL qal, DirectWidgetConfig directWidgetConfig, List list) {
        this.A03 = list;
        this.A00 = textView;
        this.A01 = qal;
        this.A02 = directWidgetConfig;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        List list = this.A03;
        String A0q = DbS.A0q(list.get(i));
        String A0u = DbX.A0u(list, i);
        this.A00.setText(DbX.A0u(list, i));
        this.A01.dismiss();
        DirectWidgetConfig directWidgetConfig = this.A02;
        if (!0qQ.A0K(directWidgetConfig.A03, A0q)) {
            DirectWidgetConfig.A00(directWidgetConfig);
            directWidgetConfig.A03 = A0q;
            directWidgetConfig.A04 = A0u;
        }
    }
}
