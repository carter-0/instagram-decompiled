package com.facebook.react.views.text;

import X.03v;
import X.0fc;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass3Tj;
import X.C13991Tnr;
import X.C14750U7h;
import X.C17176VLg;
import X.C17664Vbv;
import X.C17763VfZ;
import X.C20831X0g;
import X.C20837X0m;
import X.C245103cK;
import X.C9153RRe;
import X.Dba;
import X.QZK;
import X.QZL;
import X.U2K;
import X.U6K;
import X.W3I;
import X.X2Y;
import X.XCN;
import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.instagram.android.R;
import java.util.Map;

@ReactModule(name = "RCTText")
public class ReactTextViewManager extends ReactTextAnchorViewManager implements X2Y {
    public static final String REACT_CLASS = "RCTText";
    public static final String TAG = "ReactTextViewManager";
    public static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    public static final short TX_STATE_KEY_HASH = 2;
    public static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    public static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    public C20837X0m mReactTextViewManagerCallback;

    public ReactTextViewManager(C20837X0m x0m) {
        super((QZK) null);
        this.mReactTextViewManagerCallback = x0m;
        setupViewRecycling();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0072, code lost:
        if (r1 != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0074, code lost:
        r13 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0045, code lost:
        if (r1 != false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object getReactTextUpdate(X.U6K r17, X.C17763VfZ r18, X.XCN r19) {
        /*
            r16 = this;
            r3 = 0
            r1 = r19
            X.XCN r5 = r1.getMapBuffer(r3)
            r0 = 1
            X.XCN r4 = r1.getMapBuffer(r0)
            r6 = r17
            android.content.Context r0 = r6.getContext()
            android.text.Spannable r7 = X.W3I.A03(r0, r5)
            r6.setSpanned(r7)
            r0 = 6
            double r1 = r4.getDouble(r0)     // Catch:{ IllegalArgumentException -> 0x007c }
            float r0 = (float) r1     // Catch:{ IllegalArgumentException -> 0x007c }
            r6.setMinimumFontSize(r0)     // Catch:{ IllegalArgumentException -> 0x007c }
            r0 = 2
            java.lang.String r0 = r4.getString(r0)
            int r14 = X.C18672VwV.A01(r0)
            int r15 = r6.getJustificationMode()
            int r13 = r6.getGravityHorizontal()
            android.text.Layout$Alignment r2 = X.W3I.A01(r7, r5)
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r0 = r7.length()
            boolean r1 = r1.isRtl(r7, r3, r0)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            if (r2 != r0) goto L_0x006e
            if (r1 == 0) goto L_0x0074
        L_0x0047:
            r13 = 5
        L_0x0048:
            java.lang.String r2 = "textAlign"
            r0 = r18
            com.facebook.react.bridge.ReadableMap r1 = r0.A00
            boolean r0 = r1.hasKey(r2)
            if (r0 == 0) goto L_0x0062
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r0 = "justify"
            boolean r0 = r0.equals(r1)
            boolean r15 = X.AnonymousClass7TF.A1P(r0)
        L_0x0062:
            r12 = -1
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.Vbv r6 = new X.Vbv
            r9 = r8
            r10 = r8
            r11 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r6
        L_0x006e:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            if (r2 != r0) goto L_0x0076
            if (r1 == 0) goto L_0x0047
        L_0x0074:
            r13 = 3
            goto L_0x0048
        L_0x0076:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            if (r2 != r0) goto L_0x0048
            r13 = 1
            goto L_0x0048
        L_0x007c:
            r3 = move-exception
            if (r4 == 0) goto L_0x008f
            java.lang.String r0 = r4.toString()
        L_0x0083:
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "ReactTextViewManager"
            java.lang.String r0 = "Paragraph Attributes: %s"
            X.0I1.A08(r1, r0, r2)
            throw r3
        L_0x008f:
            java.lang.String r0 = "<empty>"
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextViewManager.getReactTextUpdate(X.U6K, X.VfZ, X.XCN):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.U6K, X.3Tj] */
    public U6K createViewInstance(QZL qzl) {
        ? r1 = new AnonymousClass3Tj(qzl, (AttributeSet) null);
        r1.A04 = AnonymousClass05K.A00;
        U6K.A02(r1);
        return r1;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public long measure(Context context, XCN xcn, XCN xcn2, XCN xcn3, float f, C245103cK r14, float f2, C245103cK r16, float[] fArr) {
        return W3I.A00(context, xcn, xcn2, r14, r16, fArr, f, f2);
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public ReactTextShadowNode createShadowNodeInstance(C20837X0m x0m) {
        return new ReactTextShadowNode(x0m);
    }

    public Class getShadowNodeClass() {
        return ReactTextShadowNode.class;
    }

    public void updateExtraData(U6K u6k, Object obj) {
        0fc.A01(8192, "ReactTextViewManager.updateExtraData", 1653250206);
        try {
            C17664Vbv vbv = (C17664Vbv) obj;
            Spannable spannable = vbv.A08;
            u6k.setText(vbv);
            U2K[] u2kArr = (U2K[]) spannable.getSpans(0, spannable.length(), U2K.class);
            if (u2kArr.length > 0) {
                u6k.setTag(R.id.accessibility_links, new C17176VLg(spannable, u2kArr));
                03v.A0B(u6k, new C14750U7h(u6k, u6k.getImportantForAccessibility(), u6k.isFocusable()));
            }
            0fc.A00(8192, 341821114);
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    public Object updateState(U6K u6k, C17763VfZ vfZ, C20831X0g x0g) {
        0fc.A01(8192, "ReactTextViewManager.updateState", 1653250206);
        try {
            throw new NullPointerException("getStateDataMapBuffer");
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        exportedCustomDirectEventTypeConstants.putAll(C13991Tnr.A0p("topTextLayout", Dba.A0f("registrationName", "onTextLayout"), "topInlineViewLayout", Dba.A0f("registrationName", "onInlineViewLayout")));
        return exportedCustomDirectEventTypeConstants;
    }

    public void onAfterUpdateTransaction(U6K u6k) {
        TextUtils.TruncateAt truncateAt;
        super.onAfterUpdateTransaction(u6k);
        if (u6k.A01 == Integer.MAX_VALUE || u6k.A05) {
            truncateAt = null;
        } else {
            truncateAt = u6k.A03;
        }
        u6k.setEllipsize(truncateAt);
    }

    public U6K prepareToRecycleView(QZL qzl, U6K u6k) {
        super.prepareToRecycleView(qzl, u6k);
        if (u6k != null) {
            u6k.A03();
            setSelectionColor(u6k, (Integer) null);
        }
        return u6k;
    }

    @ReactProp(name = "overflow")
    public void setOverflow(U6K u6k, String str) {
        u6k.setOverflow(str);
    }

    public void setPadding(U6K u6k, int i, int i2, int i3, int i4) {
        u6k.setPadding(i, i2, i3, i4);
    }

    public ReactTextViewManager() {
        this((C20837X0m) null);
    }

    public /* bridge */ /* synthetic */ View prepareToRecycleView(QZL qzl, View view) {
        U6K u6k = (U6K) view;
        prepareToRecycleView(qzl, u6k);
        return u6k;
    }

    public /* bridge */ /* synthetic */ void setPadding(View view, int i, int i2, int i3, int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ Object updateState(View view, C17763VfZ vfZ, C20831X0g x0g) {
        updateState((U6K) view, vfZ, x0g);
        throw AnonymousClass00P.createAndThrow();
    }

    public ReactTextShadowNode createShadowNodeInstance() {
        return new ReactTextShadowNode((C20837X0m) null);
    }
}
