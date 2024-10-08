package X;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import com.facebook.quickpromotion.sdk.devtool.QPCheckBoxPreference;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Vu2  reason: case insensitive filesystem */
public final class C18550Vu2 {
    public final C268544da A00 = C268554db.A02();
    public final Integer[] A01 = AnonymousClass05K.A00(4);

    public final void A01(Context context, PreferenceScreen preferenceScreen, 2cW r22) {
        Context context2 = context;
        PreferenceScreen preferenceScreen2 = preferenceScreen;
        boolean A1U = AnonymousClass7TF.A1U(0, preferenceScreen2, context2);
        Enum[] values = QuickPromotionSurface.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Enum enumR : values) {
            linkedHashMap.put(enumR.name(), String.valueOf(enumR.A00));
        }
        Preference preference = new Preference(context2, (AttributeSet) null);
        preference.A0H("/QP/reset_promotion_setting/");
        preference.A0F("Reset Quick Promotion Data");
        2cW r6 = r22;
        preference.A08 = new WEP(context2, preferenceScreen2, this, r6, linkedHashMap);
        A00(preference, preferenceScreen2);
        QPCheckBoxPreference qPCheckBoxPreference = new QPCheckBoxPreference(context2, r6);
        qPCheckBoxPreference.A0H("/shared/qp/dev_mode");
        qPCheckBoxPreference.A0F("Enable Dev Mode");
        qPCheckBoxPreference.A0E("Disables hardcoded interstitial delays");
        qPCheckBoxPreference.A0D = false;
        A00(qPCheckBoxPreference, preferenceScreen2);
        Iterator A0s = AnonymousClass7TF.A0s(linkedHashMap);
        while (A0s.hasNext()) {
            Map.Entry entry = (Map.Entry) A0s.next();
            PreferenceCategory preferenceCategory = new PreferenceCategory(context2, (AttributeSet) null);
            0qQ.A0B(entry, A1U ? 1 : 0);
            preferenceCategory.A0H(DbT.A13(entry));
            A00(preferenceCategory, preferenceScreen2);
            preferenceCategory.A0F((CharSequence) entry.getKey());
            AnonymousClass7TE.A1Z(new JVZ(entry, r6, this, context2, new HashMap(), preferenceScreen2, preferenceCategory, (AnonymousClass4D7) null, 3), 19E.A02(AnonymousClass12W.A01));
        }
        Preference preference2 = new Preference(context2, (AttributeSet) null);
        preference2.A0H("/QP/reset_delays/");
        preference2.A0F("Reset Impression and Dismissal Delays");
        preference2.A08 = new WEN(A1U, context2, r6);
        A00(preference2, preferenceScreen2);
        Preference preference3 = new Preference(context2, (AttributeSet) null);
        preference3.A0H("/QP/reset_force_modes/");
        preference3.A0F("Reset All Force Modes to Default");
        preference3.A08 = new WEO(context2, preferenceScreen2, this, r6);
        A00(preference3, preferenceScreen2);
    }

    public static final void A00(Preference preference, PreferenceScreen preferenceScreen) {
        long j;
        Preference A0N = preferenceScreen.A0N(preference.A0G);
        if (A0N != null) {
            PreferenceGroup preferenceGroup = A0N.A0A;
            synchronized (preferenceGroup) {
                Preference.A02(A0N);
                if (A0N.A0A == preferenceGroup) {
                    A0N.A0A = null;
                }
                if (preferenceGroup.A07.remove(A0N)) {
                    String str = A0N.A0G;
                    if (str != null) {
                        01r r2 = preferenceGroup.A05;
                        if (A0N instanceof U9A) {
                            j = ((U9A) A0N).A00;
                        } else {
                            j = A0N.A04;
                        }
                        r2.put(str, Long.valueOf(j));
                        Handler handler = preferenceGroup.A04;
                        Runnable runnable = preferenceGroup.A06;
                        handler.removeCallbacks(runnable);
                        handler.post(runnable);
                    }
                    if (preferenceGroup.A01) {
                        A0N.A06();
                    }
                }
            }
            preferenceGroup.A07();
        }
        preferenceScreen.A0O(preference);
    }
}
