package com.facebook.react.views.text;

import X.0qQ;
import X.AnonymousClass000;
import X.C13988Tno;
import X.C13989Tnp;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C16615UyB;
import X.QZK;
import X.U6K;
import X.W3s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;

public abstract class ReactTextAnchorViewManager extends BaseViewManager {
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};
    public static final String TAG = "ReactTextAnchorViewManager";

    public ReactTextAnchorViewManager() {
        super((QZK) null);
    }

    @ReactProp(name = "android_hyphenationFrequency")
    public void setAndroidHyphenationFrequency(U6K u6k, String str) {
        int i = 0;
        if (str != null && !str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
            if (str.equals(AnonymousClass000.A00(290))) {
                i = 2;
            } else if (str.equals("normal")) {
                i = 1;
            } else {
                C13989Tnp.A1T("Invalid android_hyphenationFrequency: ", str);
            }
        }
        u6k.setHyphenationFrequency(i);
    }

    @ReactProp(name = "textAlignVertical")
    public void setTextAlignVertical(U6K u6k, String str) {
        int i = 0;
        if (str != null && !"auto".equals(str)) {
            if ("top".equals(str)) {
                i = 48;
            } else if ("bottom".equals(str)) {
                i = 80;
            } else if ("center".equals(str)) {
                i = 16;
            } else {
                C13989Tnp.A1T("Invalid textAlignVertical: ", str);
            }
        }
        u6k.setGravityVertical(i);
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(U6K u6k, int i, Integer num) {
        W3s.A0A(u6k, C16615UyB.A02, num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r0 == false) goto L_0x0009;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "dataDetectorType")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDataDetectorType(X.U6K r3, java.lang.String r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L_0x0009
            int r0 = r4.hashCode()
            switch(r0) {
                case -1192969641: goto L_0x0026;
                case 96673: goto L_0x001d;
                case 3321850: goto L_0x0015;
                case 96619420: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 0
        L_0x000a:
            r3.A00 = r1
            return
        L_0x000d:
            java.lang.String r0 = "email"
            boolean r0 = r4.equals(r0)
            r1 = 2
            goto L_0x002d
        L_0x0015:
            java.lang.String r0 = "link"
            boolean r0 = r4.equals(r0)
            r1 = 1
            goto L_0x002d
        L_0x001d:
            java.lang.String r0 = "all"
            boolean r0 = r4.equals(r0)
            r1 = 15
            goto L_0x002d
        L_0x0026:
            java.lang.String r0 = "phoneNumber"
            boolean r0 = r4.equals(r0)
            r1 = 4
        L_0x002d:
            if (r0 != 0) goto L_0x000a
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextAnchorViewManager.setDataDetectorType(X.U6K, java.lang.String):void");
    }

    @ReactProp(defaultBoolean = false, name = "disabled")
    public void setDisabled(U6K u6k, boolean z) {
        u6k.setEnabled(!z);
    }

    @ReactProp(name = "ellipsizeMode")
    public void setEllipsizeMode(U6K u6k, String str) {
        TextUtils.TruncateAt truncateAt;
        if (str == null || str.equals("tail")) {
            truncateAt = TextUtils.TruncateAt.END;
        } else if (str.equals("head")) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (str.equals("middle")) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else if (str.equals("clip")) {
            truncateAt = null;
        } else {
            C13989Tnp.A1T("Invalid ellipsizeMode: ", str);
            truncateAt = TextUtils.TruncateAt.END;
        }
        u6k.A03 = truncateAt;
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public void setSelectionColor(U6K u6k, Integer num) {
        int intValue;
        if (num == null) {
            Context context = u6k.getContext();
            0qQ.A0B(context, 0);
            ColorStateList A0D = C13990Tnq.A0D(context, 16842905);
            if (A0D != null) {
                intValue = A0D.getDefaultColor();
            } else {
                intValue = 0;
            }
        } else {
            intValue = num.intValue();
        }
        u6k.setHighlightColor(intValue);
    }

    @ReactProp(name = "accessible")
    public void setAccessible(U6K u6k, boolean z) {
        u6k.setFocusable(z);
    }

    @ReactProp(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(U6K u6k, boolean z) {
        u6k.A05 = z;
    }

    public void setBackgroundColor(View view, int i) {
        C13988Tno.A10(view, i);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(U6K u6k, int i, float f) {
        C13988Tno.A13(u6k, C13991Tnr.A0J(f), i);
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(U6K u6k, String str) {
        W3s.A0C(u6k, C13991Tnr.A0X(str));
    }

    @ReactProp(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(U6K u6k, ReadableArray readableArray) {
        W3s.A07(u6k, readableArray);
    }

    @ReactProp(name = "fontSize")
    public void setFontSize(U6K u6k, float f) {
        u6k.setFontSize(f);
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(U6K u6k, boolean z) {
        u6k.setIncludeFontPadding(z);
    }

    @ReactProp(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(U6K u6k, float f) {
        u6k.setLetterSpacing(f);
    }

    @ReactProp(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(U6K u6k, boolean z) {
        u6k.A06 = z;
    }

    @ReactProp(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public void setNumberOfLines(U6K u6k, int i) {
        u6k.setNumberOfLines(i);
    }

    @ReactProp(name = "selectable")
    public void setSelectable(U6K u6k, boolean z) {
        u6k.setTextIsSelectable(z);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(U6K u6k, int i, float f) {
        C13989Tnp.A18(u6k, f, i);
    }
}
