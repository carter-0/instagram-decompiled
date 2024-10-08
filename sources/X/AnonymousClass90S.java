package X;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.90S  reason: invalid class name */
public abstract class AnonymousClass90S {
    public static final Intent A00(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(new Uri.Builder().scheme("instagram").authority(AnonymousClass000.A00(3543)).appendQueryParameter(AnonymousClass000.A00(4475), "true").appendQueryParameter(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str).appendQueryParameter(AnonymousClass9NJ.A00(61, 8, 97), str2).build());
        return intent;
    }

    public static final void A01(Icon icon, String str, String str2) {
        boolean z;
        ShortcutManager shortcutManager = (ShortcutManager) C60960kU.A00.getSystemService(ShortcutManager.class);
        if (shortcutManager != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<ShortcutInfo> it = shortcutManager.getPinnedShortcuts().iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                String id = it.next().getId();
                0qQ.A07(id);
                if (id.equals(002.A0S(AnonymousClass000.A00(1992), str, '\''))) {
                    ShortcutInfo.Builder builder = new ShortcutInfo.Builder(C60960kU.A00, id);
                    if (str2 == null || str2.length() == 0) {
                        z = false;
                    } else {
                        builder.setShortLabel(str2).setLongLabel(str2).setIntent(A00(str, str2));
                        z = true;
                    }
                    if (icon != null) {
                        builder.setIcon(icon);
                    } else {
                        z2 = false;
                    }
                    if (z || z2) {
                        ShortcutInfo build = builder.build();
                        0qQ.A07(build);
                        arrayList.add(build);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                shortcutManager.updateShortcuts(arrayList);
            }
        }
    }
}
