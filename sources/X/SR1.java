package X;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.video.player.common.PhujiClientDebugDialog$lifecycleCallbacks$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SR1 {
    public static Context A00;
    public static View A01;
    public static WindowManager A02;
    public static final Application.ActivityLifecycleCallbacks A03 = new PhujiClientDebugDialog$lifecycleCallbacks$1();
    public static final SR1 A04 = new Object();
    public static final AtomicBoolean A05 = JTQ.A0k();

    public final void A02(Integer num, Integer num2, Integer num3, Integer num4, String str) {
        A01(AnonymousClass7TE.A1I(AnonymousClass7TE.A1L(str, "")), true);
        ArrayList A1M = 0sr.A1M(Pxg.A1b("Framebased", String.valueOf(num3), AnonymousClass7TE.A1L("Legacy", String.valueOf(num)), AnonymousClass7TE.A1L("SNAPL", String.valueOf(num2))));
        if (num4 != null) {
            AnonymousClass7TF.A1I("VIPER", String.valueOf(num4), A1M);
        }
        A01(A1M, false);
    }

    public static final void A00() {
        View view = A01;
        if (view != null) {
            ((ViewGroup) view.findViewById(R.id.watch_time_table_view)).removeAllViews();
        }
    }

    public static final void A01(List list, boolean z) {
        View view = A01;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.watch_time_table_view);
            Context context = A00;
            if (context != null) {
                TableRow tableRow = new TableRow(context);
                if (z) {
                    tableRow.setBackgroundColor(-256);
                }
                Iterator it = list.iterator();
                while (true) {
                    int i = -1;
                    if (it.hasNext()) {
                        0eP r4 = (0eP) it.next();
                        TextView textView = new TextView(context);
                        textView.setLayoutParams(new TableRow.LayoutParams(-2, -2));
                        textView.setPadding(20, 5, 0, 5);
                        textView.setText(002.A0T((String) r4.A00, (String) r4.A01, 10));
                        if (z) {
                            i = -16777216;
                        }
                        textView.setTextColor(i);
                        tableRow.addView(textView);
                    } else {
                        viewGroup.addView(tableRow, new TableLayout.LayoutParams(-1, -2));
                        return;
                    }
                }
            }
        }
    }
}
