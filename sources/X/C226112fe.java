package X;

import android.app.Activity;
import android.app.Application;
import android.view.Window;
import com.instagram.ui.windowinsets.WindowInsetsManager$Companion$REMOVE_ENTRY_LISTENER$1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.2fe  reason: invalid class name and case insensitive filesystem */
public final class C226112fe {
    public static int A03 = -1;
    public static int A04 = -1;
    public static int A05 = -1;
    public static int A06 = -1;
    public static Boolean A07;
    public static boolean A08;
    public static boolean A09;
    public static final Application.ActivityLifecycleCallbacks A0A = new WindowInsetsManager$Companion$REMOVE_ENTRY_LISTENER$1();
    public static final C226122ff A0B = new Object();
    public static final WeakHashMap A0C = new WeakHashMap();
    public boolean A00;
    public final List A01 = Collections.synchronizedList(new ArrayList());
    public final List A02 = Collections.synchronizedList(new ArrayList());

    public static final void A00(Activity activity, C227182im r2, boolean z) {
        A0B.A04(activity, r2, z);
    }

    public C226112fe(Activity activity) {
        Window window = activity.getWindow();
        window.getClass();
        AnonymousClass03j.A00(window.getDecorView(), new C227192in(activity, window, this));
        window.getDecorView().requestApplyInsets();
    }
}
