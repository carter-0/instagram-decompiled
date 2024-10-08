package com.facebook.react.views.swiperefresh;

import X.AnonymousClass7TF;
import X.C13988Tno;
import X.C13991Tnr;
import X.C14913UEw;
import X.C18950WEd;
import X.C19068WIz;
import X.C51967G9n;
import X.Dba;
import X.QZK;
import X.QZL;
import X.X62;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "AndroidSwipeRefreshLayout")
public class SwipeRefreshLayoutManager extends ViewGroupManager {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";
    public final X62 mDelegate = new C19068WIz(this);

    public SwipeRefreshLayoutManager() {
        super((QZK) null);
    }

    public C14913UEw createViewInstance(QZL qzl) {
        SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(qzl, (AttributeSet) null);
        swipeRefreshLayout.A03 = false;
        swipeRefreshLayout.A06 = false;
        swipeRefreshLayout.A01 = 0.0f;
        swipeRefreshLayout.A05 = false;
        swipeRefreshLayout.A02 = ViewConfiguration.get(qzl).getScaledTouchSlop();
        return swipeRefreshLayout;
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View, X.UEw] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.facebook.react.uimanager.annotations.ReactProp(customType = "ColorArray", name = "colors")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setColors(X.C14913UEw r5, com.facebook.react.bridge.ReadableArray r6) {
        /*
            r4 = this;
            r3 = 0
            if (r6 == 0) goto L_0x0031
            int r0 = r6.size()
            int[] r2 = new int[r0]
        L_0x0009:
            int r0 = r6.size()
            if (r3 >= r0) goto L_0x0033
            com.facebook.react.bridge.ReadableType r1 = r6.getType(r3)
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Map
            if (r1 != r0) goto L_0x002c
            com.facebook.react.bridge.ReadableMap r1 = r6.getMap(r3)
            android.content.Context r0 = r5.getContext()
            java.lang.Integer r0 = X.SPt.A00(r0, r1)
            int r0 = r0.intValue()
        L_0x0027:
            r2[r3] = r0
            int r3 = r3 + 1
            goto L_0x0009
        L_0x002c:
            int r0 = r6.getInt(r3)
            goto L_0x0027
        L_0x0031:
            int[] r2 = new int[r3]
        L_0x0033:
            r5.setColorSchemeColors(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager.setColors(X.UEw, com.facebook.react.bridge.ReadableArray):void");
    }

    public void addEventEmitters(QZL qzl, C14913UEw uEw) {
        uEw.A0E = new C18950WEd(qzl, uEw, this);
    }

    public X62 getDelegate() {
        return this.mDelegate;
    }

    public void receiveCommand(C14913UEw uEw, String str, ReadableArray readableArray) {
        if (str.equals("setNativeRefreshing") && readableArray != null) {
            uEw.setRefreshing(readableArray.getBoolean(0));
        }
    }

    public /* bridge */ /* synthetic */ void setNativeRefreshing(View view, boolean z) {
        ((SwipeRefreshLayout) view).setRefreshing(z);
    }

    @ReactProp(customType = "Color", name = "progressBackgroundColor")
    public void setProgressBackgroundColor(C14913UEw uEw, Integer num) {
        int intValue;
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        uEw.setProgressBackgroundColorSchemeColor(intValue);
    }

    @ReactProp(defaultFloat = 0.0f, name = "progressViewOffset")
    public /* bridge */ /* synthetic */ void setProgressViewOffset(View view, float f) {
        ((C14913UEw) view).setProgressViewOffset(f);
    }

    @ReactProp(name = "refreshing")
    public /* bridge */ /* synthetic */ void setRefreshing(View view, boolean z) {
        ((SwipeRefreshLayout) view).setRefreshing(z);
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        HashMap hashMap = new HashMap();
        hashMap.put("topRefresh", Dba.A0f("registrationName", "onRefresh"));
        exportedCustomDirectEventTypeConstants.putAll(hashMap);
        return exportedCustomDirectEventTypeConstants;
    }

    public Map getExportedViewConstants() {
        return Dba.A0f("SIZE", C13991Tnr.A0p("DEFAULT", C13988Tno.A0R(), "LARGE", C51967G9n.A0k()));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, X.UEw] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.facebook.react.uimanager.annotations.ReactProp(defaultBoolean = true, name = "enabled")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setEnabled(X.C14913UEw r1, boolean r2) {
        /*
            r0 = this;
            r1.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager.setEnabled(X.UEw, boolean):void");
    }

    @ReactProp(name = "size")
    public void setSize(C14913UEw uEw, Dynamic dynamic) {
        int asInt;
        if (dynamic.isNull()) {
            asInt = 1;
        } else if (dynamic.getType() == ReadableType.Number) {
            asInt = dynamic.asInt();
        } else if (dynamic.getType() == ReadableType.String) {
            setSize(uEw, dynamic.asString());
            return;
        } else {
            throw new IllegalArgumentException("Size must be 'default' or 'large'");
        }
        uEw.setSize(asInt);
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public /* bridge */ /* synthetic */ void setEnabled(View view, boolean z) {
        view.setEnabled(z);
    }

    public void setNativeRefreshing(C14913UEw uEw, boolean z) {
        uEw.setRefreshing(z);
    }

    @ReactProp(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(C14913UEw uEw, float f) {
        uEw.setProgressViewOffset(f);
    }

    @ReactProp(name = "refreshing")
    public void setRefreshing(C14913UEw uEw, boolean z) {
        uEw.setRefreshing(z);
    }

    public void setSize(C14913UEw uEw, String str) {
        int i;
        if (str == null || str.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)) {
            i = 1;
        } else if (str.equals("large")) {
            i = 0;
        } else {
            throw AnonymousClass7TF.A0W("Size must be 'default' or 'large', received: ", str);
        }
        uEw.setSize(i);
    }

    public void setSize(C14913UEw uEw, int i) {
        uEw.setSize(i);
    }
}
