package X;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public abstract class SCH {
    public static final HashSet A00 = 0sc.A05(new String[]{"com.facebook.wakizashi", "com.facebook.katana", "com.facebook.lite", "com.facebook.orca", "com.oculus.twilight", "com.instagram.android", "com.instagram.barcelona", "com.instagram.lite", "com.whatsapp"});

    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        String str;
        ApplicationInfo applicationInfo;
        List list = r11.A00;
        String A0t = DbU.A0t(list, 0);
        if (A0t == null) {
            return null;
        }
        String A0t2 = DbU.A0t(list, 1);
        C307786Rm r2 = r10.A03;
        if (r2 == null) {
            return null;
        }
        FragmentActivity A03 = C308206Td.A03(C308206Td.A09(r10));
        Intent intent = new Intent("android.intent.action.VIEW", 0cp.A03(A0t));
        if (!(A0t2 == null || A0t2.length() == 0)) {
            intent.setPackage(DbT.A09(A0t2).getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
        }
        List<ResolveInfo> queryIntentActivities = A03.getPackageManager().queryIntentActivities(intent, Constants.LOAD_RESULT_PGO_ATTEMPTED);
        ArrayList A15 = DbV.A15(queryIntentActivities);
        for (ResolveInfo next : queryIntentActivities) {
            ActivityInfo activityInfo = next.activityInfo;
            HashSet hashSet = A00;
            if (activityInfo == null || (applicationInfo = activityInfo.applicationInfo) == null) {
                str = null;
            } else {
                str = applicationInfo.packageName;
            }
            if (00k.A0u(hashSet, str)) {
                A15.add(next);
            }
        }
        if (DbT.A1b(A15)) {
            0b6.A00().A06().A0G(r2.A00, intent);
        } else if (!(A0t2 == null || A0t2.length() == 0)) {
            0kR.A00(r2.A00, new Intent("android.intent.action.VIEW", 0cp.A03(A0t2)));
            return null;
        }
        return null;
    }
}
