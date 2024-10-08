package com.facebook.react.modules.intent;

import X.002;
import X.0Sd;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C12215SpF;
import X.C13773Tgo;
import X.C13904TjR;
import X.DbS;
import X.Pxe;
import X.QZK;
import X.SN3;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.fbreact.specs.NativeIntentAndroidSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.List;

@ReactModule(name = "IntentAndroid")
public class IntentModule extends NativeIntentAndroidSpec {
    public static final String EXTRA_MAP_KEY_FOR_VALUE = "value";
    public C13773Tgo mInitialURLListener = null;
    public final List mPendingOpenURLPromises = AnonymousClass7TE.A1C();

    private synchronized void waitForActivityAndGetInitialURL(C13904TjR tjR) {
        this.mPendingOpenURLPromises.add(tjR);
        if (this.mInitialURLListener == null) {
            this.mInitialURLListener = new C12215SpF(this);
            Pxe.A0T(this).A09(this.mInitialURLListener);
        }
    }

    public void invalidate() {
        synchronized (this) {
            this.mPendingOpenURLPromises.clear();
            if (this.mInitialURLListener != null) {
                Pxe.A0T(this).A0A(this.mInitialURLListener);
                this.mInitialURLListener = null;
            }
        }
    }

    public void canOpenURL(String str, C13904TjR tjR) {
        if (str == null || str.isEmpty()) {
            C13904TjR.A01("Invalid URL: ", str, tjR);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            tjR.resolve(Boolean.valueOf(AnonymousClass7TF.A1V(intent.resolveActivity(Pxe.A0T(this).getPackageManager()))));
        } catch (Exception e) {
            C13904TjR.A00(tjR, "Could not check if URL '", str, "' can be opened: ", e);
        }
    }

    public void openURL(String str, C13904TjR tjR) {
        if (str == null || str.isEmpty()) {
            C13904TjR.A01("Invalid URL: ", str, tjR);
            return;
        }
        try {
            sendOSIntent(new Intent("android.intent.action.VIEW", Uri.parse(str).normalizeScheme()), AnonymousClass7TE.A0u());
            tjR.resolve(AnonymousClass7TE.A0v());
        } catch (Exception e) {
            C13904TjR.A00(tjR, "Could not open URL '", str, "': ", e);
        }
    }

    public void sendIntent(String str, ReadableArray readableArray, C13904TjR tjR) {
        if (str == null || str.isEmpty()) {
            tjR.reject(new RuntimeException(002.A0g("Invalid Action: ", str, ".")));
            return;
        }
        Intent A0G = Pxe.A0G(str);
        if (A0G.resolveActivity(Pxe.A0T(this).getPackageManager()) == null) {
            tjR.reject(new RuntimeException(002.A0g("Could not launch Intent with action ", str, ".")));
            return;
        }
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap map = readableArray.getMap(i);
                String string = map.getString("key");
                int ordinal = map.getType(EXTRA_MAP_KEY_FOR_VALUE).ordinal();
                if (ordinal == 3) {
                    A0G.putExtra(string, map.getString(EXTRA_MAP_KEY_FOR_VALUE));
                } else if (ordinal == 2) {
                    A0G.putExtra(string, Double.valueOf(map.getDouble(EXTRA_MAP_KEY_FOR_VALUE)));
                } else if (ordinal != 1) {
                    tjR.reject(new RuntimeException(002.A0g("Extra type for ", string, " not supported.")));
                    return;
                } else {
                    A0G.putExtra(string, map.getBoolean(EXTRA_MAP_KEY_FOR_VALUE));
                }
            }
        }
        sendOSIntent(A0G, true);
    }

    public IntentModule(QZK qzk) {
        super(qzk);
    }

    private void sendOSIntent(Intent intent, Boolean bool) {
        String str;
        Context A00 = Pxe.A0T(this).A00();
        QZK qzk = this.mReactApplicationContext;
        0Sd.A01(qzk, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
        String packageName = qzk.getPackageName();
        QZK qzk2 = this.mReactApplicationContext;
        0Sd.A01(qzk2, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
        ComponentName resolveActivity = intent.resolveActivity(qzk2.getPackageManager());
        if (resolveActivity != null) {
            str = resolveActivity.getPackageName();
        } else {
            str = "";
        }
        if (bool.booleanValue() || A00 == null || !packageName.equals(str)) {
            intent.addFlags(268435456);
            if (A00 == null) {
                A00 = this.mReactApplicationContext;
                0Sd.A01(A00, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
            }
        }
        A00.startActivity(intent);
    }

    public void getInitialURL(C13904TjR tjR) {
        try {
            Activity A00 = Pxe.A0T(this).A00();
            if (A00 == null) {
                waitForActivityAndGetInitialURL(tjR);
                return;
            }
            Intent intent = A00.getIntent();
            String action = intent.getAction();
            Uri data = intent.getData();
            String str = null;
            if (data != null && ("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action))) {
                str = data.toString();
            }
            tjR.resolve(str);
        } catch (Exception e) {
            C13904TjR.A01("Could not get the initial URL : ", e.getMessage(), tjR);
        }
    }

    public void openSettings(C13904TjR tjR) {
        try {
            Intent A09 = DbS.A09();
            Activity A00 = Pxe.A0T(this).A00();
            String packageName = Pxe.A0T(this).getPackageName();
            A09.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            A09.addCategory("android.intent.category.DEFAULT");
            A09.setData(Uri.parse(002.A0R("package:", packageName)));
            A09.addFlags(268435456);
            A09.addFlags(SN3.MAX_SIGNED_POWER_OF_TWO);
            A09.addFlags(DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE);
            A00.startActivity(A09);
            tjR.resolve(AnonymousClass7TE.A0v());
        } catch (Exception e) {
            C13904TjR.A01("Could not open the Settings: ", e.getMessage(), tjR);
        }
    }
}
