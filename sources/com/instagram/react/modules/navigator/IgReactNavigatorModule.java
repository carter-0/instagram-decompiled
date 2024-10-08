package com.instagram.react.modules.navigator;

import X.0KC;
import X.0lg;
import X.1WM;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C12935TDy;
import X.C12936TDz;
import X.C13004THm;
import X.C13005THn;
import X.C13006THo;
import X.C13069TJz;
import X.C13071TKb;
import X.C13759TgV;
import X.C13773Tgo;
import X.C13948Tm8;
import X.C18773W0w;
import X.C41845B3m;
import X.Pxe;
import X.Pxg;
import X.QZK;
import X.R8S;
import X.SAW;
import X.SQI;
import X.T8B;
import X.TJH;
import X.TK0;
import X.TKQ;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.fbreact.specs.NativeNavigationSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.react.delegate.IgReactDelegate;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;

@ReactModule(name = "Navigation", needsEagerInit = true)
public class IgReactNavigatorModule extends NativeNavigationSpec implements C13773Tgo {
    public static final String MODULE_NAME = "Navigation";
    public static final String URL = "url";
    public View mCustomActionBarView;
    public boolean mIsHostResumed;
    public Map mRoutesMap;
    public final AnonymousClass0wW mSession;

    public void clearRightBarButton(double d) {
    }

    public String getName() {
        return "Navigation";
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        this.mIsHostResumed = false;
    }

    public void onHostResume() {
        this.mIsHostResumed = true;
    }

    public void reloadReact() {
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C13759TgV configureReactNativeLauncherWithRouteInfo(X.C13759TgV r4, android.os.Bundle r5, com.facebook.react.bridge.ReadableMap r6) {
        /*
            if (r5 == 0) goto L_0x0071
            X.SAW.A01(r5, r6)
            r1 = 0
            java.lang.String r0 = "title"
            java.lang.String r3 = r5.getString(r0, r1)
            java.lang.String r0 = "logoAsTitle"
            r2 = 0
            boolean r1 = r5.getBoolean(r0, r2)
            if (r3 == 0) goto L_0x0018
            if (r1 != 0) goto L_0x0019
        L_0x0018:
            r2 = 1
        L_0x0019:
            java.lang.String r0 = "Screen navigationOptions cannot have both 'title' and 'logoAsTitle'"
            X.17k.A0G(r2, r0)
            X.T8B r4 = (X.T8B) r4
            r4.A07 = r3
            r4.A0A = r1
            java.lang.String r1 = "orientation"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x0033
            int r0 = r5.getInt(r1)
            r4.A00 = r0
        L_0x0033:
            java.lang.String r1 = "analyticsModule"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r5.getString(r1)
            r4.A03 = r0
        L_0x0041:
            java.lang.String r1 = "perfLogger_ttiEventName"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = r5.getString(r1)
            r4.A06 = r0
        L_0x0050:
            java.lang.String r0 = "fb_analyticsExtras"
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0060
            r1 = 0
            X.WNL r0 = new X.WNL
            r0.<init>(r1, r5, r6)
            r4.A01 = r0
        L_0x0060:
            java.lang.String r1 = "navigationBar"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x0071
            boolean r0 = r5.getBoolean(r1)
            r0 = r0 ^ 1
            r4.A09 = r0
        L_0x0071:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.modules.navigator.IgReactNavigatorModule.configureReactNativeLauncherWithRouteInfo(X.TgV, android.os.Bundle, com.facebook.react.bridge.ReadableMap):X.TgV");
    }

    public static int contentDescriptionForIconType(String str) {
        if (str.equals("done")) {
            return 2131960992;
        }
        if (str.equals("next")) {
            return 2131968361;
        }
        if (str.equals("reload")) {
            return 2131971905;
        }
        if (str.equals("cancel")) {
            return 2131954722;
        }
        if (str.equals("back")) {
            return 2131953555;
        }
        if (str.equals("more")) {
            return 2131966723;
        }
        if (str.equals(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING)) {
            return R.string.f0nameremoved;
        }
        if (str.equals("lock")) {
            return 2131965511;
        }
        if (str.equals("loading")) {
            return 2131965491;
        }
        if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
            return 2131954408;
        }
        throw Pxg.A0k("Unsupported IconType: ", str);
    }

    public static int resourceForIconType(String str) {
        if (str.equals("done")) {
            return R.drawable.instagram_check_pano_outline_24;
        }
        if (str.equals("next")) {
            return R.drawable.nav_arrow_next;
        }
        if (str.equals("reload")) {
            return R.drawable.instagram_arrow_cw_pano_outline_24;
        }
        if (str.equals("cancel")) {
            return R.drawable.instagram_x_pano_outline_24;
        }
        if (str.equals("back")) {
            return R.drawable.instagram_arrow_back_24;
        }
        if (str.equals("more")) {
            return R.drawable.instagram_more_vertical_pano_outline_24;
        }
        if (str.equals(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING)) {
            return R.drawable.instagram_direct_pano_outline_24;
        }
        if (str.equals("lock")) {
            return R.drawable.instagram_lock_filled_12;
        }
        if (str.equals("loading") || str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
            return 0;
        }
        throw Pxg.A0k("Unsupported IconType: ", str);
    }

    public void dismiss(double d, ReadableMap readableMap) {
        C18773W0w.A01(new C12936TDz(this));
    }

    public void navigate(double d, String str, ReadableMap readableMap) {
        FragmentActivity A01;
        C13948Tm8 fromBundle;
        C13759TgV createReactNativeLauncherFromRouteName;
        if (str.equals("IgExternalUrlRoute")) {
            openURL(readableMap);
        }
        Map map = this.mRoutesMap;
        if (map != null && map.get(str) != null && (A01 = SQI.A01(this)) != null) {
            Bundle bundle = ((Bundle) this.mRoutesMap.get(str)).getBundle("navigationOptions");
            if (bundle == null) {
                fromBundle = null;
            } else {
                fromBundle = Arguments.fromBundle(bundle);
            }
            boolean containsKey = ((BaseBundle) this.mRoutesMap.get(str)).containsKey("isFromRegistry");
            AnonymousClass0wW r0 = this.mSession;
            if (containsKey) {
                createReactNativeLauncherFromRouteName = createReactNativeLauncherFromAppKey(r0, str, readableMap, fromBundle);
            } else {
                createReactNativeLauncherFromRouteName = createReactNativeLauncherFromRouteName(r0, str, readableMap, fromBundle);
            }
            C18773W0w.A01(new TKQ(A01, fromBundle, createReactNativeLauncherFromRouteName, this, d));
        }
    }

    public void openURL(double d, String str) {
        C18773W0w.A01(new C13004THm(this, str));
    }

    public void pop(double d) {
        C18773W0w.A01(new C12935TDy(this));
    }

    public void popToScreen(double d, double d2) {
        C18773W0w.A01(new C13006THo(this, d2));
    }

    public void setBarLeftAction(double d, ReadableMap readableMap) {
        String str;
        int i;
        if (readableMap.hasKey(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) {
            if (readableMap.hasKey(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) {
                str = readableMap.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
                if (str != null) {
                    i = resourceForIconType(str);
                }
                i = 0;
            } else {
                str = null;
                i = 0;
            }
            C18773W0w.A01(new C13069TJz(this, str, d, i));
        }
    }

    public void setBarTitle(double d, String str) {
        C18773W0w.A01(new TJH(this, str, d));
    }

    public IgReactNavigatorModule(QZK qzk, AnonymousClass0wW r5) {
        super(qzk);
        this.mSession = r5;
        qzk.A09(this);
        try {
            QZK A0T = Pxe.A0T(this);
            this.mRoutesMap = SAW.A00(A0T, A0T.getAssets().open("react_native_routes.json"));
        } catch (IOException unused) {
        }
    }

    private C13759TgV createReactNativeLauncherFromAppKey(0lg r4, String str, ReadableMap readableMap, ReadableMap readableMap2) {
        Bundle bundle = Arguments.toBundle(readableMap2);
        1WM.getInstance();
        T8B A00 = new T8B(r4, str).A00(Arguments.toBundle(readableMap));
        configureReactNativeLauncherWithRouteInfo(A00, bundle, readableMap);
        return A00;
    }

    private C13759TgV createReactNativeLauncherFromRouteName(0lg r4, String str, ReadableMap readableMap, ReadableMap readableMap2) {
        Bundle bundle = Arguments.toBundle(readableMap2);
        1WM.getInstance();
        T8B A01 = new T8B(r4).A01(str);
        A01.A00(Arguments.toBundle(readableMap));
        configureReactNativeLauncherWithRouteInfo(A01, bundle, readableMap);
        return A01;
    }

    private Map createRouteMapFromJson(String str) {
        try {
            return SAW.A00(Pxe.A0T(this), new ByteArrayInputStream(str.getBytes()));
        } catch (IOException e) {
            0KC.A0I("ReactNative", "Failed to create routes map.", e);
            throw C41845B3m.A0j(e);
        }
    }

    public void getSavedInstanceState(double d, String str, Callback callback) {
        Object[] objArr;
        int i;
        FragmentActivity A01 = SQI.A01(this);
        R8S r8s = null;
        if (A01 != null) {
            R8S A0R = A01.getSupportFragmentManager().A0R(str);
            if (A0R instanceof R8S) {
                r8s = A0R;
            }
        }
        if (r8s != null) {
            objArr = new Object[1];
            i = Arguments.fromBundle(((IgReactDelegate) r8s.A00).A01);
        } else {
            objArr = new Object[1];
            i = 0;
        }
        objArr[0] = i;
        callback.invoke(objArr);
    }

    public Map getTypedExportedConstants() {
        return AnonymousClass7TE.A1E();
    }

    public void setBarPrimaryAction(double d, ReadableMap readableMap) {
        String str;
        int i;
        ReadableMap readableMap2 = readableMap;
        String str2 = null;
        if (readableMap.hasKey(DialogModule.KEY_TITLE)) {
            str = readableMap.getString(DialogModule.KEY_TITLE);
        } else {
            str = null;
        }
        if (!readableMap.hasKey(PublicKeyCredentialControllerUtility.JSON_KEY_ICON) || (str2 = readableMap.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) == null) {
            i = 0;
        } else {
            i = resourceForIconType(str2);
        }
        C18773W0w.A01(new C13071TKb(readableMap2, this, str, str2, d, i));
    }

    public void setBarTitleWithConfig(double d, ReadableMap readableMap) {
        String str;
        int i;
        String str2 = null;
        if (readableMap.hasKey(DialogModule.KEY_TITLE)) {
            str = readableMap.getString(DialogModule.KEY_TITLE);
        } else {
            str = null;
        }
        if (!readableMap.hasKey(PublicKeyCredentialControllerUtility.JSON_KEY_ICON) || (str2 = readableMap.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) == null) {
            i = 0;
        } else {
            i = resourceForIconType(str2);
        }
        if (str == null) {
            if (i == 0) {
                return;
            }
        } else if (i == 0) {
            setBarTitle(d, str);
            return;
        }
        C18773W0w.A01(new TK0(SQI.A01(this), this, str, str2));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0016: MOVE  (r1v1 X.R8S) = (r1v0 X.R8S)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public void setInstanceStateToSave(double r4, java.lang.String r6, com.facebook.react.bridge.ReadableMap r7) {
        /*
            r3 = this;
            android.os.Bundle r2 = com.facebook.react.bridge.Arguments.toBundle(r7)
            androidx.fragment.app.FragmentActivity r0 = X.SQI.A01(r3)
            if (r0 == 0) goto L_0x0023
            X.0hq r0 = r0.getSupportFragmentManager()
            androidx.fragment.app.Fragment r1 = r0.A0R(r6)
            boolean r0 = r1 instanceof X.R8S
            if (r0 == 0) goto L_0x0023
            X.R8S r1 = (X.R8S) r1
            if (r1 == 0) goto L_0x0023
            X.RAt r0 = r1.A00
            com.instagram.react.delegate.IgReactDelegate r0 = (com.instagram.react.delegate.IgReactDelegate) r0
            android.os.Bundle r0 = r0.A01
            r0.putAll(r2)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.modules.navigator.IgReactNavigatorModule.setInstanceStateToSave(double, java.lang.String, com.facebook.react.bridge.ReadableMap):void");
    }

    public void updateNativeRoutesConfiguration(String str) {
        this.mRoutesMap = createRouteMapFromJson(str);
    }

    private void openURL(ReadableMap readableMap) {
        String string = readableMap.getString("url");
        string.getClass();
        C18773W0w.A01(new C13005THn(this, string));
    }
}
