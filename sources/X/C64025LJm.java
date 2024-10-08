package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.LJm  reason: case insensitive filesystem */
public abstract class C64025LJm {
    public static final void A00(Activity activity, DialogInterface.OnClickListener onClickListener) {
        C358248ab A0X = DbS.A0X(activity);
        DbT.A19(activity, A0X, 2131968390);
        DbU.A17(activity, A0X, 2131968389);
        A0X.A0H(onClickListener, 2131968772);
        DbT.A1V(A0X);
    }

    public static final void A01(Context context, FragmentActivity fragmentActivity, UserSession userSession, ArrayList arrayList, boolean z) {
        C51974G9v.A1L(fragmentActivity, userSession, arrayList);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("enableGeoGating", z);
        A0a.putStringArrayList("selectedRegions", arrayList);
        A0a.putString("settingType", "reel");
        1WM.getInstance();
        T8B t8b = new T8B(userSession, "IgMediaGeoGatingSettingsApp");
        t8b.A07 = context.getString(2131973426);
        t8b.A00(A0a);
        t8b.F08(fragmentActivity).A04();
    }
}
