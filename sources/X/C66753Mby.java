package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mby  reason: case insensitive filesystem */
public final class C66753Mby {
    public static volatile C69674Npw A00;
    public static volatile List A01;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.Npw, java.lang.Object] */
    public static C69674Npw A00(Context context) {
        if (A00 == null) {
            try {
                A00 = (C69674Npw) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C66753Mby.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            } catch (Exception unused) {
            }
            if (A00 == null) {
                A00 = new Object();
            }
        }
        return A00;
    }

    public static List A01(Context context) {
        Bundle bundle;
        String string;
        if (A01 == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!(activityInfo == null || (bundle = activityInfo.metaData) == null || (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) == null)) {
                    try {
                        Class.forName(string, false, C66753Mby.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
                        arrayList.add((Object) null);
                    } catch (Exception unused) {
                    }
                }
            }
            if (A01 == null) {
                A01 = arrayList;
            }
        }
        return A01;
    }

    public static void A04(Context context, List<PzA> list) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 32) {
            ArrayList A1D = AnonymousClass7TE.A1D(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PzA pzA = (PzA) it.next();
                if ((pzA.A01 & 1) != 0) {
                    A1D.remove(pzA);
                }
            }
            list = A1D;
            if (i <= 29) {
                Iterator it2 = AnonymousClass7TE.A1D(A1D).iterator();
                while (it2.hasNext()) {
                    PzA pzA2 = (PzA) it2.next();
                    if (!A05(context, pzA2)) {
                        A1D.remove(pzA2);
                    }
                }
            }
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (PzA A012 : list) {
            A1C.add(A012.A01());
        }
        if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(A1C)) {
            A00(context).A00(list);
            Iterator it3 = A01(context).iterator();
            if (it3.hasNext()) {
                it3.next();
                throw AnonymousClass7TE.A11("onShortcutAdded");
            }
        }
    }

    public static boolean A05(Context context, PzA pzA) {
        Bitmap decodeStream;
        IconCompat A02;
        IconCompat iconCompat = pzA.A09;
        if (iconCompat != null) {
            int i = iconCompat.A02;
            if (i != 6 && i != 4) {
                return true;
            }
            InputStream A07 = iconCompat.A07(context);
            if (!(A07 == null || (decodeStream = BitmapFactory.decodeStream(A07)) == null)) {
                if (i == 6) {
                    A02 = new IconCompat(5);
                    A02.A06 = decodeStream;
                } else {
                    A02 = IconCompat.A02(decodeStream);
                }
                pzA.A09 = A02;
                return true;
            }
        }
        return false;
    }

    public static void A02(Context context, PzA pzA) {
        pzA.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i > 32 || (pzA.A01 & 1) == 0) {
            Class cls = ShortcutManager.class;
            int maxShortcutCountPerActivity = ((ShortcutManager) context.getSystemService(cls)).getMaxShortcutCountPerActivity();
            if (maxShortcutCountPerActivity != 0) {
                if (i <= 29) {
                    A05(context, pzA);
                }
                ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(cls);
                if (i >= 30) {
                    shortcutManager.pushDynamicShortcut(pzA.A01());
                } else if (!shortcutManager.isRateLimitingActive()) {
                    List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
                    if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                        int i2 = -1;
                        String str = null;
                        for (ShortcutInfo next : dynamicShortcuts) {
                            if (next.getRank() > i2) {
                                str = next.getId();
                                i2 = next.getRank();
                            }
                        }
                        shortcutManager.removeDynamicShortcuts(Arrays.asList(new String[]{str}));
                    }
                    shortcutManager.addDynamicShortcuts(Arrays.asList(new ShortcutInfo[]{pzA.A01()}));
                } else {
                    return;
                }
                C69674Npw A002 = A00(context);
                try {
                    List<PzA> A02 = A002.A02();
                    if (A02.size() >= maxShortcutCountPerActivity) {
                        int i3 = -1;
                        String str2 = null;
                        for (PzA pzA2 : A02) {
                            int i4 = pzA2.A02;
                            if (i4 > i3) {
                                str2 = pzA2.A0D;
                                i3 = i4;
                            }
                        }
                        A002.A01(Arrays.asList(new String[]{str2}));
                    }
                    A002.A00(Arrays.asList(new PzA[]{pzA}));
                    Iterator it = A01(context).iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw AnonymousClass7TE.A11("onShortcutAdded");
                    }
                } catch (Exception unused) {
                    Iterator it2 = A01(context).iterator();
                    if (it2.hasNext()) {
                        it2.next();
                        throw AnonymousClass7TE.A11("onShortcutAdded");
                    }
                } catch (Throwable th) {
                    Iterator it3 = A01(context).iterator();
                    if (it3.hasNext()) {
                        it3.next();
                        throw AnonymousClass7TE.A11("onShortcutAdded");
                    } else {
                        A03(context, pzA.A0D);
                        throw th;
                    }
                }
                A03(context, pzA.A0D);
                return;
            }
            return;
        }
        Iterator it4 = A01(context).iterator();
        if (it4.hasNext()) {
            it4.next();
            throw AnonymousClass7TE.A11("onShortcutAdded");
        }
    }

    public static void A03(Context context, String str) {
        str.getClass();
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator it = A01(context).iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("onShortcutUsageReported");
        }
    }
}
