package X;

import android.view.View;
import android.widget.ListView;
import com.instagram.android.R;
import com.instagram.direct.appwidget.DirectRecipientSearchActivity;
import java.util.List;

/* renamed from: X.PYJ  reason: case insensitive filesystem */
public final class C73179PYJ implements Runnable {
    public final /* synthetic */ DirectRecipientSearchActivity A00;
    public final /* synthetic */ List A01;

    public C73179PYJ(DirectRecipientSearchActivity directRecipientSearchActivity, List list) {
        this.A00 = directRecipientSearchActivity;
        this.A01 = list;
    }

    public final void run() {
        String str;
        DirectRecipientSearchActivity directRecipientSearchActivity = this.A00;
        ListView listView = directRecipientSearchActivity.A00;
        if (listView == null) {
            str = "recipientListView";
        } else {
            C67685MsN msN = directRecipientSearchActivity.A01;
            if (msN == null) {
                str = "adapter";
            } else {
                listView.setAdapter(msN);
                View findViewById = directRecipientSearchActivity.findViewById(R.id.no_chats_view);
                0qQ.A0C(findViewById, "null cannot be cast to non-null type android.widget.TextView");
                findViewById.setVisibility(DbW.A01(this.A01.isEmpty() ? 1 : 0));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
