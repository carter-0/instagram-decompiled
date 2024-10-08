package X;

import android.app.Activity;
import android.content.res.Resources;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import com.facebook.common.stringformat.StringFormatUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2in  reason: invalid class name and case insensitive filesystem */
public final class C227192in implements AnonymousClass03Q {
    public int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ Window A02;
    public final /* synthetic */ C226112fe A03;

    public final 04k Cvn(View view, 04k r22) {
        int i;
        02M A012;
        int A07;
        Class<?> cls;
        Method method;
        int dimensionPixelSize;
        View view2 = view;
        0qQ.A0B(view2, 0);
        04k r6 = r22;
        0qQ.A0B(r6, 1);
        04h r8 = r6.A00;
        if (r8.A01().A03 == 0) {
            int i2 = this.A00;
            this.A00 = i2 + 1;
            if (i2 < 4) {
                view2.requestApplyInsets();
                return 03v.A05(view2, r6);
            }
        }
        C226112fe r4 = this.A03;
        r4.A00 = true;
        C226112fe.A04 = r8.A03().A03;
        C226112fe.A03 = r6.A02();
        boolean z = true;
        if (true != C226112fe.A09) {
            z = false;
        }
        if (z) {
            i = r8.A05(7).A03;
            A012 = r8.A05(7);
        } else {
            i = r8.A01().A03;
            A012 = r8.A01();
        }
        int i3 = A012.A00;
        Window window = this.A02;
        int i4 = window.getAttributes().flags;
        boolean z2 = false;
        if ((window.getAttributes().flags & 1024) != 0) {
            z2 = true;
        }
        boolean z3 = false;
        if (C226112fe.A05 != -1) {
            z3 = true;
        }
        int i5 = C226112fe.A06;
        boolean z4 = false;
        if (i5 != i) {
            z4 = true;
        }
        if (z3 && z4) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Status bar height: old=%d new=%d, Activity=%s RetryCount=%d isFullScreenFlagSet=%b windowFlags=0x%X", new Object[]{Integer.valueOf(i5), Integer.valueOf(i), this.A01.getClass().getSimpleName(), Integer.valueOf(this.A00), Boolean.valueOf(z2), Integer.valueOf(i4)});
            String A0R = 002.A0R("WindowInsetsManager", "_status_bar_height_changed");
            0qQ.A0A(formatStrLocaleSafe);
            0wb.A03(A0R, formatStrLocaleSafe);
        }
        boolean z5 = false;
        if (C226112fe.A06 != -1) {
            z5 = true;
        }
        int i6 = C226112fe.A05;
        boolean z6 = false;
        if (i6 != i3) {
            z6 = true;
        }
        if (z5 && z6) {
            String formatStrLocaleSafe2 = StringFormatUtil.formatStrLocaleSafe("Nab bar height: old=%d new=%d, Activity=%s RetryCount=%d isFullScreenFlagSet=%b windowFlags=0x%X", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3), this.A01.getClass().getSimpleName(), Integer.valueOf(this.A00), Boolean.valueOf(z2), Integer.valueOf(i4)});
            String A0R2 = 002.A0R("WindowInsetsManager", "_nab_bar_height_changed");
            0qQ.A0A(formatStrLocaleSafe2);
            0wb.A03(A0R2, formatStrLocaleSafe2);
        }
        if (i <= 0) {
            Resources resources = this.A01.getResources();
            0qQ.A07(resources);
            int i7 = this.A00;
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier <= 0) {
                dimensionPixelSize = 0;
            } else {
                dimensionPixelSize = resources.getDimensionPixelSize(identifier);
                if (dimensionPixelSize > 0) {
                    String formatStrLocaleSafe3 = StringFormatUtil.formatStrLocaleSafe("Status bar %d, status bar from res %d, nav bar %d, retry count %d", Integer.valueOf(i), Integer.valueOf(dimensionPixelSize), Integer.valueOf(i3), Integer.valueOf(i7));
                    String A0R3 = 002.A0R("WindowInsetsManager", "_status_bar_is_zero_v2");
                    0qQ.A0A(formatStrLocaleSafe3);
                    0wb.A03(A0R3, formatStrLocaleSafe3);
                }
            }
            i = dimensionPixelSize;
        }
        if (i3 <= 0) {
            boolean z7 = true;
            if (true != C226112fe.A09) {
                z7 = false;
            }
            if (!z7) {
                Activity activity = this.A01;
                int i8 = this.A00;
                Resources resources2 = activity.getResources();
                0qQ.A07(resources2);
                Boolean bool = C226112fe.A07;
                if (bool == null) {
                    boolean z8 = true;
                    try {
                        Class<?> cls2 = Class.forName("android.os.ServiceManager");
                        Object invoke = cls2.getMethod("getService", new Class[]{String.class}).invoke(cls2, new Object[]{"window"});
                        0qQ.A0C(invoke, "null cannot be cast to non-null type android.os.IBinder");
                        Class<?> cls3 = Class.forName("android.view.IWindowManager$Stub");
                        Object invoke2 = cls3.getMethod("asInterface", new Class[]{IBinder.class}).invoke(cls3, new Object[]{(IBinder) invoke});
                        Object obj = null;
                        if (!(invoke2 == null || (cls = invoke2.getClass()) == null || (method = cls.getMethod("hasNavigationBar", new Class[0])) == null)) {
                            obj = method.invoke(invoke2, new Object[0]);
                        }
                        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        bool = (Boolean) obj;
                        C226112fe.A07 = bool;
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                        0wb.A07(002.A0R("WindowInsetsManager", "_hasNavigationBar_notFound"), e);
                        int identifier2 = resources2.getIdentifier("config_showNavigationBar", "bool", "android");
                        if (identifier2 <= 0 || !resources2.getBoolean(identifier2)) {
                            z8 = false;
                        }
                        bool = Boolean.valueOf(z8);
                        C226112fe.A07 = bool;
                    }
                }
                0qQ.A0A(bool);
                if (!bool.booleanValue()) {
                    A07 = 0;
                } else {
                    A07 = 0nA.A07(activity);
                    String formatStrLocaleSafe4 = StringFormatUtil.formatStrLocaleSafe("Nav bar %d, Nav bar from res %d, status bar %s, retry count %d", Integer.valueOf(i3), Integer.valueOf(A07), Integer.valueOf(i), Integer.valueOf(i8));
                    String A0R4 = 002.A0R("WindowInsetsManager", "_stable_nav_bar_is_zero_v2");
                    0qQ.A0A(formatStrLocaleSafe4);
                    0wb.A03(A0R4, formatStrLocaleSafe4);
                }
                i3 = A07;
            }
        }
        C226112fe.A06 = i;
        C226112fe.A05 = i3;
        02V.A05(r4.A00);
        List list = r4.A01;
        Iterator it = new ArrayList(list).iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            ((C227182im) it.next()).DmH(C226112fe.A06, C226112fe.A05);
        }
        List list2 = r4.A02;
        Iterator it2 = new ArrayList(list2).iterator();
        0qQ.A07(it2);
        while (it2.hasNext()) {
            ((C227182im) it2.next()).DmH(C226112fe.A06, C226112fe.A05);
        }
        if (true != C226112fe.A09) {
            list.clear();
        }
        list2.clear();
        return 03v.A05(view2, r6);
    }

    public C227192in(Activity activity, Window window, C226112fe r3) {
        this.A03 = r3;
        this.A02 = window;
        this.A01 = activity;
    }
}
