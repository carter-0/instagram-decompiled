package X;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class Q5H extends Dialog {
    public UserSession A00;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.android13_permission_mock_dialog);
        setCanceledOnTouchOutside(true);
        TextView textView = (TextView) findViewById(R.id.title);
        View findViewById = findViewById(R.id.accept_button);
        View findViewById2 = findViewById(R.id.deny_button);
        UserSession userSession = this.A00;
        if (textView == null || findViewById == null || findViewById2 == null || userSession == null) {
            0wb.A03("Android13PermissionMockDialog", "screen initial failed");
            return;
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "instagram_android_13_notifications_priming_event");
        if (A0e.isSampled()) {
            A0e.AAJ("experiment_group", "no_in_test");
            A0e.AAJ(TraceFieldType.AdhocEventName, "mock_system_dialog_impression");
            A0e.Cgf();
        }
        textView.setText(Html.fromHtml(getContext().getResources().getString(2131952945)));
        C11495SbI.A00(findViewById, 9, this);
        C11499SbM.A01(findViewById2, 55, this, userSession);
        setOnDismissListener(new SVF(this, 6));
    }

    public final void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
        0xm A002 = AnonymousClass0xl.A00(C61170le.A00);
        long currentTimeMillis = System.currentTimeMillis();
        0xa r2 = A002.A00;
        0xY AR4 = r2.AR4();
        AR4.E5c("mock_system_notification_permission_dialog_last_shown_timestamp", currentTimeMillis);
        AR4.apply();
        JTS.A1S(r2, "eligible_to_mock_notification_dialog_shown_count", 0);
    }
}
