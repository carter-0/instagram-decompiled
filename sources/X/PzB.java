package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class PzB {
    public Set A00;
    public final PzA A01;

    public final PzA A00() {
        PzA pzA = this.A01;
        if (!TextUtils.isEmpty(pzA.A0B)) {
            Intent[] intentArr = pzA.A0P;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            Set set = this.A00;
            if (set != null) {
                Set set2 = pzA.A0F;
                if (set2 == null) {
                    set2 = new HashSet();
                    pzA.A0F = set2;
                }
                set2.addAll(set);
            }
            return pzA;
        }
        throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }

    public PzB(Context context, ShortcutInfo shortcutInfo) {
        AH5[] ah5Arr;
        PzA pzA = new PzA();
        this.A01 = pzA;
        pzA.A05 = context;
        pzA.A0D = shortcutInfo.getId();
        pzA.A0E = shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        pzA.A0P = (Intent[]) Arrays.copyOf(intents, intents.length);
        pzA.A04 = shortcutInfo.getActivity();
        pzA.A0B = shortcutInfo.getShortLabel();
        pzA.A0C = shortcutInfo.getLongLabel();
        pzA.A0A = shortcutInfo.getDisabledMessage();
        pzA.A00 = shortcutInfo.getDisabledReason();
        pzA.A0F = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            ah5Arr = null;
        } else {
            int i = extras.getInt("extraPersonCount");
            ah5Arr = new AH5[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                PersistableBundle persistableBundle = extras.getPersistableBundle(002.A0O("extraPerson_", i3));
                ah5Arr[i2] = new AH5((IconCompat) null, persistableBundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), persistableBundle.getString("key"), persistableBundle.getString("uri"), persistableBundle.getBoolean("isBot"), persistableBundle.getBoolean("isImportant"));
                i2 = i3;
            }
        }
        pzA.A0Q = ah5Arr;
        pzA.A07 = shortcutInfo.getUserHandle();
        pzA.A03 = shortcutInfo.getLastChangedTimestamp();
        if (Build.VERSION.SDK_INT >= 30) {
            pzA.A0I = shortcutInfo.isCached();
        }
        pzA.A0K = shortcutInfo.isDynamic();
        pzA.A0O = shortcutInfo.isPinned();
        pzA.A0J = shortcutInfo.isDeclaredInManifest();
        pzA.A0M = shortcutInfo.isImmutable();
        pzA.A0L = shortcutInfo.isEnabled();
        pzA.A0G = shortcutInfo.hasKeyFieldsOnly();
        pzA.A08 = PzA.A00(shortcutInfo);
        pzA.A02 = shortcutInfo.getRank();
        pzA.A06 = shortcutInfo.getExtras();
    }

    public PzB(Context context, String str) {
        PzA pzA = new PzA();
        this.A01 = pzA;
        pzA.A05 = context;
        pzA.A0D = str;
    }

    public PzB(PzA pzA) {
        PzA pzA2 = new PzA();
        this.A01 = pzA2;
        pzA2.A05 = pzA.A05;
        pzA2.A0D = pzA.A0D;
        pzA2.A0E = pzA.A0E;
        Intent[] intentArr = pzA.A0P;
        pzA2.A0P = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
        pzA2.A04 = pzA.A04;
        pzA2.A0B = pzA.A0B;
        pzA2.A0C = pzA.A0C;
        pzA2.A0A = pzA.A0A;
        pzA2.A00 = pzA.A00;
        pzA2.A09 = pzA.A09;
        pzA2.A0H = pzA.A0H;
        pzA2.A07 = pzA.A07;
        pzA2.A03 = pzA.A03;
        pzA2.A0I = pzA.A0I;
        pzA2.A0K = pzA.A0K;
        pzA2.A0O = pzA.A0O;
        pzA2.A0J = pzA.A0J;
        pzA2.A0M = pzA.A0M;
        pzA2.A0L = pzA.A0L;
        pzA2.A08 = pzA.A08;
        pzA2.A0N = pzA.A0N;
        pzA2.A0G = pzA.A0G;
        pzA2.A02 = pzA.A02;
        AH5[] ah5Arr = pzA.A0Q;
        if (ah5Arr != null) {
            pzA2.A0Q = (AH5[]) Arrays.copyOf(ah5Arr, ah5Arr.length);
        }
        Set set = pzA.A0F;
        if (set != null) {
            pzA2.A0F = new HashSet(set);
        }
        PersistableBundle persistableBundle = pzA.A06;
        if (persistableBundle != null) {
            pzA2.A06 = persistableBundle;
        }
        pzA2.A01 = pzA.A01;
    }
}
