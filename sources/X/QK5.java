package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import java.util.Arrays;

public final class QK5 extends C11347SOg {
    public QK5() {
        super("ACTION_OPEN_WITH");
    }

    public static Intent A00(C340027ka r7, C340037kb r8) {
        String str;
        Intent intent = r7.getIntent();
        if (intent == null) {
            return null;
        }
        if (r8.CVN()) {
            str = intent.getStringExtra("BrowserLiteIntent.OPEN_WITH_URL");
        } else {
            str = null;
        }
        QLA C8U = r8.C8U();
        if (C8U == null) {
            return null;
        }
        SPF spf = SPF.A06;
        if (spf != null && spf.A02()) {
            str = spf.A01.A02;
        } else if (str == null) {
            str = C8U.A05();
        }
        if (C8U.A0b) {
            str = C8U.A0M;
        }
        if (str == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra("BrowserLiteIntent.EXTRA_IAB_CLICKID");
        boolean booleanExtra = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOULD_ATTACH_CLICKID", false);
        if (stringExtra != null) {
            String stringExtra2 = intent.getStringExtra("BrowserLiteIntent.EXTRA_BROWSER_APP_SURFACE");
            if (("BrowserLiteIntent.BrowserAppSurfaceExtras.FB4A".equals(stringExtra2) || ("BrowserLiteIntent.BrowserAppSurfaceExtras.IG4A".equals(stringExtra2) && !r8.CVN())) && booleanExtra) {
                str = DbV.A08(0cp.A03(str).buildUpon(), "fbclid", stringExtra).toString();
            }
        }
        SPF spf2 = SPF.A06;
        if (spf2 != null) {
            C61082JwK jwK = spf2.A00;
            if (jwK.A01 && str != null) {
                str = C9229RUg.A00((C10503RtI) jwK.A00, str);
            }
        }
        Intent A09 = DbS.A09();
        A09.setAction("android.intent.action.VIEW");
        A09.setData(Pxg.A0L(str));
        A09.putExtra("click_id", stringExtra);
        A09.putExtra("BrowserLiteIntent.EXTRA_IAB_CLICKID_STATUS", intent.getStringExtra("BrowserLiteIntent.EXTRA_IAB_CLICKID_STATUS"));
        A09.putExtra("BrowserLiteIntent.EXTRA_SHOULD_ATTACH_CLICKID", booleanExtra);
        return A09;
    }

    public static QK5 A01(Context context, C340027ka r6, C340037kb r7, int i) {
        ActivityInfo activityInfo;
        String string;
        Intent A00 = A00(r6, r7);
        if (A00 != null) {
            Boolean bool = SQY.A01;
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(A00, Constants.LOAD_RESULT_PGO_ATTEMPTED);
            if (!(resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null || !activityInfo.exported)) {
                if (activityInfo.packageName.equalsIgnoreCase("android")) {
                    string = context.getString(R.string.f0nameremoved);
                } else {
                    string = context.getString(R.string.f0nameremoved, Arrays.copyOf(new Object[]{resolveActivity.loadLabel(context.getPackageManager())}, 1));
                }
                0qQ.A07(string);
                QK5 qk5 = new QK5();
                qk5.A03 = string;
                if (i < 0) {
                    qk5.A00 = 0;
                } else if (i > 0) {
                    qk5.A00 = i;
                    return qk5;
                }
                return qk5;
            }
        }
        return null;
    }
}
