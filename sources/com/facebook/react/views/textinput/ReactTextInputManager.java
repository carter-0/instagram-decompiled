package com.facebook.react.views.textinput;

import X.0I1;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass7TF;
import X.C13988Tno;
import X.C13989Tnp;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C13992Tns;
import X.C16615UyB;
import X.C17664Vbv;
import X.C17763VfZ;
import X.C18788W1q;
import X.C20831X0g;
import X.C20837X0m;
import X.C20877X2e;
import X.C51967G9n;
import X.C51968G9o;
import X.C66580MXl;
import X.DbT;
import X.DbW;
import X.Dba;
import X.Pxf;
import X.Q6H;
import X.QZK;
import X.QZL;
import X.SH1;
import X.TSR;
import X.U66;
import X.W0S;
import X.W3s;
import X.W7k;
import X.WBJ;
import X.WDE;
import X.WJd;
import X.WJe;
import X.WJf;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.Constants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;

@ReactModule(name = "AndroidTextInput")
public class ReactTextInputManager extends BaseViewManager {
    public static final int AUTOCAPITALIZE_FLAGS = 28672;
    public static final int BLUR_TEXT_INPUT = 2;
    public static final String[] DRAWABLE_HANDLE_FIELDS = {"mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};
    public static final String[] DRAWABLE_HANDLE_RESOURCES = {"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};
    public static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];
    public static final int FOCUS_TEXT_INPUT = 1;
    public static final int IME_ACTION_ID = 1648;
    public static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    public static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    public static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    public static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    public static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    public static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    public static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    public static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    public static final String KEYBOARD_TYPE_URI = "url";
    public static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    public static final int PASSWORD_VISIBILITY_FLAG = 16;
    public static final String REACT_CLASS = "AndroidTextInput";
    public static final Map REACT_PROPS_AUTOFILL_HINTS_MAP = new TSR(0);
    public static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    public static final int SET_TEXT_AND_SELECTION = 4;
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    public static final String TAG = "ReactTextInputManager";
    public static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    public static final short TX_STATE_KEY_HASH = 2;
    public static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    public static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    public static final int UNSET = -1;
    public C20837X0m mReactTextViewManagerCallback;

    public ReactTextInputManager() {
        super((QZK) null);
    }

    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(defaultBoolean = false, name = "multiline")
    public void setMultiline(U66 u66, boolean z) {
        int i = 0;
        int i2 = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        if (z) {
            i2 = 0;
            i = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        }
        updateStagedInputTypeFlag(u66, i2, i);
    }

    @ReactProp(name = "textAlignVertical")
    public void setTextAlignVertical(U66 u66, String str) {
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
        u66.setGravityVertical(i);
    }

    public static void checkPasswordType(U66 u66) {
        int i = u66.A03;
        if ((i & INPUT_TYPE_KEYBOARD_NUMBERED) != 0 && (i & 128) != 0) {
            updateStagedInputTypeFlag(u66, 128, 16);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.UTA, X.W0S] */
    public static /* synthetic */ void lambda$addEventEmitters$0(QZL qzl, U66 u66, View view, boolean z) {
        W0S w0s;
        int i = qzl.A00;
        C20877X2e A0K = C13990Tnq.A0K(u66, qzl);
        int id = u66.getId();
        if (z) {
            w0s = new W0S(i, id);
        } else {
            A0K.APe(new W0S(i, id));
            int id2 = u66.getId();
            String A0f = AnonymousClass7TF.A0f(u66);
            ? w0s2 = new W0S(i, id2);
            w0s2.A00 = A0f;
            w0s = w0s2;
        }
        A0K.APe(w0s);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.UTC, X.W0S] */
    public static /* synthetic */ boolean lambda$addEventEmitters$1(U66 u66, QZL qzl, TextView textView, int i, KeyEvent keyEvent) {
        boolean equals;
        if ((i & 255) != 0 || i == 0) {
            boolean A06 = u66.A06();
            String str = u66.A0B;
            boolean z = false;
            if (str != null ? str.equals("submit") || str.equals("blurAndSubmit") : !u66.A06()) {
                z = true;
            }
            String str2 = u66.A0B;
            if (str2 == null) {
                equals = AnonymousClass7TF.A1Q(u66.A06() ? 1 : 0);
            } else {
                equals = str2.equals("blurAndSubmit");
            }
            if (z) {
                C20877X2e A0K = C13990Tnq.A0K(u66, qzl);
                int i2 = qzl.A00;
                int id = u66.getId();
                String A0f = AnonymousClass7TF.A0f(u66);
                ? w0s = new W0S(i2, id);
                w0s.A00 = A0f;
                A0K.APe(w0s);
            }
            if (equals) {
                u66.clearFocus();
            } else if (z || !A06 || i == 5 || i == 7) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean shouldHideCursorForEmailTextInput() {
        String lowerCase = Build.MANUFACTURER.toLowerCase(Locale.ROOT);
        if (Build.VERSION.SDK_INT != 29 || !lowerCase.contains("xiaomi")) {
            return false;
        }
        return true;
    }

    public static void updateStagedInputTypeFlag(U66 u66, int i, int i2) {
        u66.A03 = ((i ^ -1) & u66.A03) | i2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.react.uimanager.ReactShadowNodeImpl, X.2T1, com.facebook.react.views.text.ReactBaseTextShadowNode, com.facebook.react.views.textinput.ReactTextInputShadowNode] */
    public ReactBaseTextShadowNode createShadowNodeInstance(C20837X0m x0m) {
        ? reactBaseTextShadowNode = new ReactBaseTextShadowNode(x0m);
        reactBaseTextShadowNode.A00 = -1;
        reactBaseTextShadowNode.A02 = null;
        reactBaseTextShadowNode.A01 = null;
        reactBaseTextShadowNode.A03 = 1;
        reactBaseTextShadowNode.A09(reactBaseTextShadowNode);
        return reactBaseTextShadowNode;
    }

    public U66 createViewInstance(QZL qzl) {
        U66 u66 = new U66(qzl);
        u66.setInputType(u66.getInputType() & -131073);
        u66.setReturnKeyType("done");
        C51968G9o.A1D(u66, -2);
        return u66;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        if (r5 != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        if (r5 != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getReactTextUpdate(X.U66 r16, X.C17763VfZ r17, X.XCN r18) {
        /*
            r15 = this;
            r3 = r18
            int r0 = r3.getCount()
            if (r0 != 0) goto L_0x000a
            r5 = 0
            return r5
        L_0x000a:
            r0 = 0
            X.XCN r2 = r3.getMapBuffer(r0)
            r0 = 1
            X.XCN r1 = r3.getMapBuffer(r0)
            android.content.Context r0 = r16.getContext()
            android.text.Spannable r6 = X.W3I.A03(r0, r2)
            r0 = 2
            java.lang.String r0 = r1.getString(r0)
            int r13 = X.C18672VwV.A01(r0)
            int r14 = r16.getJustificationMode()
            r0 = 3
            int r11 = r3.getInt(r0)
            boolean r5 = X.W3I.A06(r2)
            int r12 = r16.getGravityHorizontal()
            java.lang.String r3 = "textAlign"
            r0 = r17
            com.facebook.react.bridge.ReadableMap r2 = r0.A00
            boolean r0 = r2.hasKey(r3)
            if (r0 == 0) goto L_0x0066
            java.lang.String r1 = r2.getString(r3)
            java.lang.String r0 = "justify"
            boolean r0 = r0.equals(r1)
            r4 = 3
            if (r0 != 0) goto L_0x0065
            r12 = 0
            if (r1 == 0) goto L_0x0066
            java.lang.String r0 = "auto"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "left"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0085
            if (r5 == 0) goto L_0x0065
        L_0x0064:
            r4 = 5
        L_0x0065:
            r12 = r4
        L_0x0066:
            boolean r0 = r2.hasKey(r3)
            if (r0 == 0) goto L_0x007a
            java.lang.String r1 = r2.getString(r3)
            java.lang.String r0 = "justify"
            boolean r0 = r0.equals(r1)
            boolean r14 = X.AnonymousClass7TF.A1P(r0)
        L_0x007a:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.Vbv r5 = new X.Vbv
            r8 = r7
            r9 = r7
            r10 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r5
        L_0x0085:
            java.lang.String r0 = "right"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0090
            if (r5 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0090:
            java.lang.String r0 = "center"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009a
            r4 = 1
            goto L_0x0065
        L_0x009a:
            java.lang.String r0 = "Invalid textAlign: "
            X.C13989Tnp.A1T(r0, r1)
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.getReactTextUpdate(X.U66, X.VfZ, X.XCN):java.lang.Object");
    }

    public Class getShadowNodeClass() {
        return ReactTextInputShadowNode.class;
    }

    @ReactProp(name = "autoCorrect")
    public void setAutoCorrect(U66 u66, Boolean bool) {
        int i;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            i = Constants.LOAD_RESULT_WITH_VDEX_ODEX;
            if (booleanValue) {
                i = Constants.LOAD_RESULT_PGO;
            }
        } else {
            i = 0;
        }
        updateStagedInputTypeFlag(u66, 557056, i);
    }

    public /* bridge */ /* synthetic */ void setBackgroundColor(View view, int i) {
        C13988Tno.A10((U66) view, i);
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(U66 u66, int i, Integer num) {
        W3s.A0A(u66, C16615UyB.A02, num);
    }

    @ReactProp(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(U66 u66, boolean z) {
        if (u66.A03 != 32 || !shouldHideCursorForEmailTextInput()) {
            u66.setCursorVisible(!z);
        }
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(U66 u66, Integer num) {
        if (num == null) {
            Context context = u66.getContext();
            0qQ.A0B(context, 0);
            ColorStateList A0D = C13990Tnq.A0D(context, 16842904);
            if (A0D != null) {
                u66.setTextColor(A0D);
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, DbW.A0c("Could not get default text color from View Context: ", Pxf.A0g(context)));
            }
        } else {
            u66.setTextColor(num.intValue());
        }
    }

    @ReactProp(customType = "Color", name = "cursorColor")
    public void setCursorColor(U66 u66, Integer num) {
        Drawable textCursorDrawable;
        if (Build.VERSION.SDK_INT >= 29 && (textCursorDrawable = u66.getTextCursorDrawable()) != null) {
            if (num != null) {
                textCursorDrawable.setColorFilter(new BlendModeColorFilter(num.intValue(), BlendMode.SRC_IN));
            } else {
                textCursorDrawable.clearColorFilter();
            }
            u66.setTextCursorDrawable(textCursorDrawable);
        }
    }

    @ReactProp(name = "importantForAutofill")
    public void setImportantForAutofill(U66 u66, String str) {
        int i;
        if ("no".equals(str)) {
            i = 2;
        } else if ("noExcludeDescendants".equals(str)) {
            i = 8;
        } else if ("yes".equals(str)) {
            i = 1;
        } else {
            i = 0;
            if ("yesExcludeDescendants".equals(str)) {
                i = 4;
            }
        }
        u66.setImportantForAutofill(i);
    }

    @ReactProp(name = "inlineImageLeft")
    public void setInlineImageLeft(U66 u66, String str) {
        u66.setCompoundDrawablesWithIntrinsicBounds(SH1.A02.A00(u66.getContext(), str), 0, 0, 0);
    }

    @ReactProp(name = "keyboardType")
    public void setKeyboardType(U66 u66, String str) {
        int i;
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str)) {
            i = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str)) {
            i = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str)) {
            i = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str)) {
            i = 33;
            if (shouldHideCursorForEmailTextInput()) {
                u66.setCursorVisible(false);
            }
        } else if (KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str)) {
            i = 3;
        } else if (KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str)) {
            i = 144;
        } else {
            i = 1;
            if ("url".equalsIgnoreCase(str)) {
                i = 16;
            }
        }
        updateStagedInputTypeFlag(u66, 15, i);
        checkPasswordType(u66);
    }

    @ReactProp(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(U66 u66, boolean z) {
        WJd wJd;
        if (z) {
            wJd = new WJd(u66);
        } else {
            wJd = null;
        }
        u66.A07 = wJd;
    }

    @ReactProp(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(U66 u66, boolean z) {
        WJe wJe;
        if (z) {
            wJe = new WJe(u66);
        } else {
            wJe = null;
        }
        u66.A08 = wJe;
    }

    @ReactProp(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(U66 u66, boolean z) {
        WJf wJf;
        if (z) {
            wJf = new WJf(u66);
        } else {
            wJf = null;
        }
        u66.A09 = wJf;
    }

    @ReactProp(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(U66 u66, Integer num) {
        if (num == null) {
            Context context = u66.getContext();
            0qQ.A0B(context, 0);
            u66.setHintTextColor(C13990Tnq.A0D(context, 16842906));
            return;
        }
        u66.setHintTextColor(num.intValue());
    }

    @ReactProp(name = "returnKeyLabel")
    public void setReturnKeyLabel(U66 u66, String str) {
        u66.setImeActionLabel(str, IME_ACTION_ID);
    }

    @ReactProp(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(U66 u66, boolean z) {
        int i = 0;
        if (z) {
            i = 128;
        }
        updateStagedInputTypeFlag(u66, 144, i);
        checkPasswordType(u66);
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public void setSelectionColor(U66 u66, Integer num) {
        int intValue;
        if (num == null) {
            Context context = u66.getContext();
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
        u66.setHighlightColor(intValue);
    }

    @ReactProp(customType = "Color", name = "selectionHandleColor")
    public void setSelectionHandleColor(U66 u66, Integer num) {
        if (Build.VERSION.SDK_INT >= 29) {
            Drawable mutate = u66.getTextSelectHandle().mutate();
            Drawable mutate2 = u66.getTextSelectHandleLeft().mutate();
            Drawable mutate3 = u66.getTextSelectHandleRight().mutate();
            if (num != null) {
                BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(num.intValue(), BlendMode.SRC_IN);
                mutate.setColorFilter(blendModeColorFilter);
                mutate2.setColorFilter(blendModeColorFilter);
                mutate3.setColorFilter(blendModeColorFilter);
            } else {
                mutate.clearColorFilter();
                mutate2.clearColorFilter();
                mutate3.clearColorFilter();
            }
            u66.setTextSelectHandle(mutate);
            u66.setTextSelectHandleLeft(mutate2);
            u66.setTextSelectHandleRight(mutate3);
        }
    }

    @ReactProp(name = "textAlign")
    public void setTextAlign(U66 u66, String str) {
        if ("justify".equals(str)) {
            u66.setJustificationMode(1);
        } else {
            int i = 0;
            u66.setJustificationMode(0);
            if (str != null && !"auto".equals(str)) {
                if (!"left".equals(str)) {
                    if ("right".equals(str)) {
                        i = 5;
                    } else if ("center".equals(str)) {
                        u66.setGravityHorizontal(1);
                        return;
                    } else {
                        C13989Tnp.A1T("Invalid textAlign: ", str);
                    }
                }
            }
            u66.setGravityHorizontal(i);
            return;
        }
        u66.setGravityHorizontal(3);
    }

    @ReactProp(name = "autoComplete")
    public void setTextContentType(U66 u66, String str) {
        if (str != null && !"off".equals(str)) {
            Map map = REACT_PROPS_AUTOFILL_HINTS_MAP;
            if (map.containsKey(str)) {
                u66.setAutofillHints(new String[]{DbT.A11(str, map)});
                return;
            }
            C13989Tnp.A1T("Invalid autoComplete: ", str);
        }
        u66.setImportantForAutofill(2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateExtraData(X.U66 r6, java.lang.Object r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C17664Vbv
            if (r0 == 0) goto L_0x005d
            X.Vbv r7 = (X.C17664Vbv) r7
            float r0 = r7.A01
            int r4 = (int) r0
            float r0 = r7.A03
            int r3 = (int) r0
            float r0 = r7.A02
            int r2 = (int) r0
            float r0 = r7.A00
            int r0 = (int) r0
            r1 = -1
            if (r4 != r1) goto L_0x001f
            if (r3 != r1) goto L_0x001b
            if (r2 != r1) goto L_0x001b
            if (r0 == r1) goto L_0x0034
        L_0x001b:
            int r4 = r6.getPaddingLeft()
        L_0x001f:
            if (r3 != r1) goto L_0x0025
            int r3 = r6.getPaddingTop()
        L_0x0025:
            if (r2 != r1) goto L_0x002b
            int r2 = r6.getPaddingRight()
        L_0x002b:
            if (r0 != r1) goto L_0x0031
            int r0 = r6.getPaddingBottom()
        L_0x0031:
            r6.setPadding(r4, r3, r2, r0)
        L_0x0034:
            int r3 = r6.getSelectionStart()
            int r0 = r6.getSelectionEnd()
            r2 = 0
            if (r3 != r0) goto L_0x0055
            android.text.Editable r0 = r6.getText()
            if (r0 == 0) goto L_0x0049
            int r2 = X.C13988Tno.A0C(r6)
        L_0x0049:
            int r0 = r6.getSelectionStart()
            int r2 = r2 - r0
            android.text.Spannable r0 = r7.A08
            int r1 = r0.length()
            int r1 = r1 - r2
        L_0x0055:
            r6.A05(r7)
            int r0 = r7.A04
            r6.A04(r0, r1, r1)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.updateExtraData(X.U66, java.lang.Object):void");
    }

    public Object updateState(U66 u66, C17763VfZ vfZ, C20831X0g x0g) {
        KeyListener keyListener = U66.A0V;
        u66.setPadding(0, 0, 0, 0);
        u66.A04 = x0g;
        throw new NullPointerException("getStateDataMapBuffer");
    }

    public static C20877X2e getEventDispatcher(Q6H q6h, U66 u66) {
        return C13990Tnq.A0K(u66, q6h);
    }

    private void setAutofillHints(U66 u66, String... strArr) {
        u66.setAutofillHints(strArr);
    }

    public void addEventEmitters(QZL qzl, U66 u66) {
        u66.A05 = C13990Tnq.A0K(u66, qzl);
        u66.addTextChangedListener(new W7k(qzl, u66, this));
        u66.setOnFocusChangeListener(new WBJ(0, u66, qzl));
        u66.setOnEditorActionListener(new WDE(0, qzl, u66));
    }

    public Map getCommandsMap() {
        return C13991Tnr.A0p("focusTextInput", C13988Tno.A0R(), "blurTextInput", C66580MXl.A0q());
    }

    public Map getExportedCustomBubblingEventTypeConstants() {
        Map exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        HashMap hashMap = new HashMap();
        hashMap.put("topSubmitEditing", Dba.A0f("phasedRegistrationNames", C13991Tnr.A0p("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture")));
        hashMap.put("topEndEditing", C13992Tns.A0T("onEndEditing", "onEndEditingCapture"));
        hashMap.put("topFocus", C13992Tns.A0T("onFocus", "onFocusCapture"));
        hashMap.put("topBlur", C13992Tns.A0T("onBlur", "onBlurCapture"));
        hashMap.put("topKeyPress", C13992Tns.A0T("onKeyPress", "onKeyPressCapture"));
        exportedCustomBubblingEventTypeConstants.putAll(hashMap);
        return exportedCustomBubblingEventTypeConstants;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        HashMap hashMap = new HashMap();
        0qQ.A0B(AnonymousClass05K.A0C, 0);
        hashMap.put("topScroll", Dba.A0f("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.putAll(hashMap);
        return exportedCustomDirectEventTypeConstants;
    }

    public Map getExportedViewConstants() {
        Integer A0k = C51967G9n.A0k();
        Integer valueOf = Integer.valueOf(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        HashMap A0p = C13991Tnr.A0p(NetInfoModule.CONNECTION_TYPE_NONE, A0k, "characters", 4096);
        A0p.put("words", 8192);
        A0p.put("sentences", valueOf);
        return Dba.A0f("AutoCapitalizationType", A0p);
    }

    public void onAfterUpdateTransaction(U66 u66) {
        int paintFlags;
        super.onAfterUpdateTransaction(u66);
        if (u66.A0I) {
            u66.A0I = false;
            Typeface typeface = u66.getTypeface();
            int i = u66.A00;
            int i2 = u66.A01;
            u66.setTypeface(C18788W1q.A02(u66.getContext().getAssets(), typeface, u66.A0A, i, i2));
            if (u66.A00 == -1 && u66.A01 == -1 && u66.A0A == null && u66.getFontFeatureSettings() == null) {
                paintFlags = u66.getPaintFlags() & -129;
            } else {
                paintFlags = u66.getPaintFlags() | 128;
            }
            u66.setPaintFlags(paintFlags);
        }
        if (u66.getInputType() != u66.A03) {
            int selectionStart = u66.getSelectionStart();
            int selectionEnd = u66.getSelectionEnd();
            u66.setInputType(u66.A03);
            u66.setSelection(selectionStart, selectionEnd);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r10.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        X.U66.A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r10.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        r9.clearFocus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void receiveCommand(X.U66 r9, java.lang.String r10, com.facebook.react.bridge.ReadableArray r11) {
        /*
            r8 = this;
            int r0 = r10.hashCode()
            r7 = 3
            r1 = 2
            r6 = 0
            r5 = 1
            r4 = -1
            switch(r0) {
                case -1699362314: goto L_0x0051;
                case 3027047: goto L_0x004e;
                case 97604824: goto L_0x0042;
                case 1427010500: goto L_0x0010;
                case 1690703013: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            return
        L_0x000d:
            java.lang.String r0 = "focusTextInput"
            goto L_0x0044
        L_0x0010:
            java.lang.String r0 = "setTextAndSelection"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x000c
            int r3 = r11.getInt(r6)
            if (r3 == r4) goto L_0x000c
            int r2 = r11.getInt(r1)
            int r1 = r11.getInt(r7)
            if (r1 != r4) goto L_0x0029
            r1 = r2
        L_0x0029:
            boolean r0 = r11.isNull(r5)
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = r11.getString(r5)
            X.Vbv r0 = r8.getReactTextUpdate(r0, r3)
            r9.A0G = r5
            r9.A05(r0)
            r9.A0G = r6
        L_0x003e:
            r9.A04(r3, r2, r1)
            return
        L_0x0042:
            java.lang.String r0 = "focus"
        L_0x0044:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x000c
            X.U66.A02(r9)
            return
        L_0x004e:
            java.lang.String r0 = "blur"
            goto L_0x0053
        L_0x0051:
            java.lang.String r0 = "blurTextInput"
        L_0x0053:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x000c
            r9.clearFocus()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.receiveCommand(X.U66, java.lang.String, com.facebook.react.bridge.ReadableArray):void");
    }

    @ReactProp(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(U66 u66, boolean z) {
        u66.setAllowFontScaling(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r0 == false) goto L_0x0026;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "autoCapitalize")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAutoCapitalize(X.U66 r4, com.facebook.react.bridge.Dynamic r5) {
        /*
            r3 = this;
            com.facebook.react.bridge.ReadableType r1 = r5.getType()
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Number
            r2 = 0
            if (r1 != r0) goto L_0x0013
            int r2 = r5.asInt()
        L_0x000d:
            r0 = 28672(0x7000, float:4.0178E-41)
            updateStagedInputTypeFlag(r4, r0, r2)
            return
        L_0x0013:
            com.facebook.react.bridge.ReadableType r1 = r5.getType()
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.String
            if (r1 != r0) goto L_0x0026
            java.lang.String r1 = r5.asString()
            int r0 = r1.hashCode()
            switch(r0) {
                case 3387192: goto L_0x0032;
                case 113318569: goto L_0x0039;
                case 1245424234: goto L_0x0029;
                default: goto L_0x0026;
            }
        L_0x0026:
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x000d
        L_0x0029:
            java.lang.String r0 = "characters"
            boolean r0 = r1.equals(r0)
            r2 = 4096(0x1000, float:5.74E-42)
            goto L_0x0041
        L_0x0032:
            java.lang.String r0 = "none"
            boolean r0 = r1.equals(r0)
            goto L_0x0041
        L_0x0039:
            java.lang.String r0 = "words"
            boolean r0 = r1.equals(r0)
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0041:
            if (r0 != 0) goto L_0x000d
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setAutoCapitalize(X.U66, com.facebook.react.bridge.Dynamic):void");
    }

    @ReactProp(defaultBoolean = false, name = "autoFocus")
    public void setAutoFocus(U66 u66, boolean z) {
        u66.A0D = z;
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(U66 u66, int i, float f) {
        C13988Tno.A13(u66, C13991Tnr.A0J(f), i);
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(U66 u66, String str) {
        W3s.A0C(u66, C13991Tnr.A0X(str));
    }

    @ReactProp(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(U66 u66, ReadableArray readableArray) {
        W3s.A07(u66, readableArray);
    }

    @ReactProp(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(U66 u66, boolean z) {
        u66.A0E = z;
    }

    @ReactProp(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(U66 u66, boolean z) {
        u66.setDisableFullscreenUI(z);
    }

    @ReactProp(defaultBoolean = true, name = "editable")
    public void setEditable(U66 u66, boolean z) {
        u66.setEnabled(z);
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(U66 u66, String str) {
        u66.setFontFamily(str);
    }

    @ReactProp(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(U66 u66, float f) {
        u66.setFontSize(f);
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(U66 u66, String str) {
        u66.setFontStyle(str);
    }

    @ReactProp(name = "fontVariant")
    public void setFontVariant(U66 u66, ReadableArray readableArray) {
        u66.setFontFeatureSettings(C18788W1q.A03(readableArray));
    }

    @ReactProp(name = "fontWeight")
    public void setFontWeight(U66 u66, String str) {
        u66.setFontWeight(str);
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(U66 u66, boolean z) {
        u66.setIncludeFontPadding(z);
    }

    @ReactProp(name = "inlineImagePadding")
    public void setInlineImagePadding(U66 u66, int i) {
        u66.setCompoundDrawablePadding(i);
    }

    @ReactProp(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(U66 u66, float f) {
        u66.setLetterSpacingPt(f);
    }

    @ReactProp(defaultFloat = 0.0f, name = "lineHeight")
    public void setLineHeight(U66 u66, int i) {
        u66.setLineHeight(i);
    }

    @ReactProp(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(U66 u66, float f) {
        u66.setMaxFontSizeMultiplier(f);
    }

    @ReactProp(name = "maxLength")
    public void setMaxLength(U66 u66, Integer num) {
        InputFilter[] filters = u66.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        int i = 0;
        if (num == null) {
            int length = filters.length;
            if (length > 0) {
                LinkedList linkedList = new LinkedList();
                do {
                    InputFilter inputFilter = filters[i];
                    if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                        linkedList.add(inputFilter);
                    }
                    i++;
                } while (i < length);
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else {
            int length2 = filters.length;
            if (length2 > 0) {
                int i2 = 0;
                boolean z = false;
                do {
                    if (filters[i2] instanceof InputFilter.LengthFilter) {
                        filters[i2] = new InputFilter.LengthFilter(num.intValue());
                        z = true;
                    }
                    i2++;
                } while (i2 < length2);
                if (!z) {
                    InputFilter[] inputFilterArr2 = new InputFilter[(length2 + 1)];
                    System.arraycopy(filters, 0, inputFilterArr2, 0, length2);
                    filters[length2] = new InputFilter.LengthFilter(num.intValue());
                    filters = inputFilterArr2;
                }
                inputFilterArr = filters;
            } else {
                inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
            }
        }
        u66.setFilters(inputFilterArr);
    }

    @ReactProp(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(U66 u66, int i) {
        u66.setLines(i);
    }

    @ReactProp(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(U66 u66, boolean z) {
        u66.A0H = z;
    }

    @ReactProp(name = "overflow")
    public void setOverflow(U66 u66, String str) {
        u66.setOverflow(str);
    }

    @ReactProp(name = "placeholder")
    public void setPlaceholder(U66 u66, String str) {
        u66.setPlaceholder(str);
    }

    @ReactProp(name = "returnKeyType")
    public void setReturnKeyType(U66 u66, String str) {
        u66.setReturnKeyType(str);
    }

    @ReactProp(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(U66 u66, boolean z) {
        u66.setSelectTextOnFocus(z);
    }

    @ReactProp(name = "submitBehavior")
    public void setSubmitBehavior(U66 u66, String str) {
        u66.A0B = str;
    }

    @ReactProp(name = "textDecorationLine")
    public void setTextDecorationLine(U66 u66, String str) {
        int paintFlags;
        u66.setPaintFlags(u66.getPaintFlags() & -25);
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if (str2.equals("underline")) {
                    paintFlags = u66.getPaintFlags() | 8;
                } else if (str2.equals("line-through")) {
                    paintFlags = u66.getPaintFlags() | 16;
                }
                u66.setPaintFlags(paintFlags);
            }
        }
    }

    @ReactProp(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(U66 u66, Integer num) {
        Drawable background = u66.getBackground();
        if (background != null) {
            if (background.getConstantState() != null) {
                try {
                    background = background.mutate();
                } catch (NullPointerException e) {
                    0I1.A05(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e);
                }
            }
            C13991Tnr.A0t(background, num);
        }
    }

    @ReactProp(defaultBoolean = true, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(U66 u66, boolean z) {
        u66.setShowSoftInputOnFocus(z);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(U66 u66, int i, float f) {
        C13989Tnp.A18(u66, f, i);
    }

    public void setPadding(U66 u66, int i, int i2, int i3, int i4) {
        u66.setPadding(i, i2, i3, i4);
    }

    private C17664Vbv getReactTextUpdate(String str, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str == null) {
            str = null;
        }
        spannableStringBuilder.append(str);
        return new C17664Vbv(spannableStringBuilder, 0.0f, 0.0f, 0.0f, 0.0f, i, 0, 0, 0);
    }

    private void setImportantForAutofill(U66 u66, int i) {
        u66.setImportantForAutofill(i);
    }

    public void receiveCommand(U66 u66, int i, ReadableArray readableArray) {
        String str;
        if (i == 1) {
            str = "focus";
        } else if (i == 2) {
            str = "blur";
        } else if (i == 4) {
            str = "setTextAndSelection";
        } else {
            return;
        }
        receiveCommand(u66, str, readableArray);
    }

    public void setBackgroundColor(U66 u66, int i) {
        C13988Tno.A10(u66, i);
    }

    public /* bridge */ /* synthetic */ void setPadding(View view, int i, int i2, int i3, int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ Object updateState(View view, C17763VfZ vfZ, C20831X0g x0g) {
        updateState((U66) view, vfZ, x0g);
        throw AnonymousClass00P.createAndThrow();
    }

    public ReactBaseTextShadowNode createShadowNodeInstance() {
        return new ReactTextInputShadowNode();
    }
}
