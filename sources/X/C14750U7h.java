package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.instagram.android.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.U7h  reason: case insensitive filesystem */
public class C14750U7h extends 2Vy {
    public static int A05 = 1056964608;
    public static final HashMap A06;
    public Handler A00 = new C14697U1x(this);
    public View A01;
    public final View A02;
    public final C17176VLg A03;
    public final HashMap A04 = new HashMap();

    public static boolean A03(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int importantForAccessibility = view.getImportantForAccessibility();
        if (importantForAccessibility != 4 && (importantForAccessibility != 2 || accessibilityNodeInfoCompat.mInfo.getChildCount() > 0)) {
            if ((accessibilityNodeInfoCompat.mInfo.getCollectionInfo() == null && (!TextUtils.isEmpty(accessibilityNodeInfoCompat.getText()) || !TextUtils.isEmpty(accessibilityNodeInfoCompat.mInfo.getContentDescription()) || !TextUtils.isEmpty(accessibilityNodeInfoCompat.mInfo.getHintText()))) || !TextUtils.isEmpty(accessibilityNodeInfoCompat.getStateDescription()) || accessibilityNodeInfoCompat.mInfo.isCheckable()) {
                return true;
            }
            AccessibilityNodeInfo.RangeInfo rangeInfo = accessibilityNodeInfoCompat.mInfo.getRangeInfo();
            if (rangeInfo != null) {
                float max = rangeInfo.getMax();
                float min = rangeInfo.getMin();
                float current = rangeInfo.getCurrent();
                if (max - min > 0.0f && current >= min && current <= max) {
                    return true;
                }
            }
            if (accessibilityNodeInfoCompat.mInfo.isCheckable()) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
                        childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat2.mInfo);
                        if (accessibilityNodeInfoCompat2.mInfo.isVisibleToUser() && !A04(accessibilityNodeInfoCompat2) && A03(childAt, accessibilityNodeInfoCompat2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean A04(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!accessibilityNodeInfoCompat.mInfo.isVisibleToUser()) {
            return false;
        }
        if (!accessibilityNodeInfoCompat.mInfo.isScreenReaderFocusable() && !accessibilityNodeInfoCompat.mInfo.isClickable() && !accessibilityNodeInfoCompat.mInfo.isLongClickable() && !accessibilityNodeInfoCompat.mInfo.isFocusable()) {
            List actionList = accessibilityNodeInfoCompat.getActionList();
            return C66581MXm.A1W(16, actionList) || C66581MXm.A1W(32, actionList) || C66581MXm.A1W(1, actionList);
        }
    }

    public final boolean A0m(int i, int i2, Bundle bundle) {
        return false;
    }

    static {
        HashMap hashMap = new HashMap();
        A06 = hashMap;
        hashMap.put("activate", Integer.valueOf(04x.A08.A00()));
        hashMap.put("longpress", Integer.valueOf(04x.A0L.A00()));
        hashMap.put("increment", Integer.valueOf(04x.A0Z.A00()));
        hashMap.put("decrement", Integer.valueOf(04x.A0X.A00()));
        hashMap.put("expand", Integer.valueOf(04x.A0H.A00()));
        hashMap.put("collapse", Integer.valueOf(04x.A09.A00()));
    }

    public static CharSequence A00(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat3;
        if (accessibilityNodeInfoCompat == null) {
            accessibilityNodeInfoCompat2 = null;
            accessibilityNodeInfoCompat3 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
            try {
                view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat3.mInfo);
            } catch (NullPointerException unused) {
            }
        } else {
            accessibilityNodeInfoCompat3 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.mInfo));
        }
        accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat3;
        if (accessibilityNodeInfoCompat2 != null) {
            CharSequence contentDescription = accessibilityNodeInfoCompat2.mInfo.getContentDescription();
            CharSequence text = accessibilityNodeInfoCompat2.getText();
            boolean A1Q = AnonymousClass7TF.A1Q(TextUtils.isEmpty(text) ? 1 : 0);
            boolean z = view instanceof EditText;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(contentDescription) && (!z || !A1Q)) {
                sb.append(contentDescription);
                return sb;
            } else if (A1Q) {
                sb.append(text);
                return sb;
            } else if (view instanceof ViewGroup) {
                StringBuilder sb2 = new StringBuilder();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompat4 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
                    childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat4.mInfo);
                    if (A03(childAt, accessibilityNodeInfoCompat4) && !A04(accessibilityNodeInfoCompat4)) {
                        CharSequence A002 = A00(childAt, (AccessibilityNodeInfoCompat) null);
                        if (!TextUtils.isEmpty(A002)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(A002);
                            sb3.append(", ");
                            Pxf.A1O(sb2, sb3);
                        }
                    }
                }
                int length = sb2.length();
                if (length > 0) {
                    sb2.delete(length - 2, length);
                }
                return sb2.toString();
            }
        }
        return null;
    }

    public boolean A0V(View view, int i, Bundle bundle) {
        if (i == 524288) {
            view.setTag(R.id.accessibility_state_expanded, AnonymousClass7TE.A0u());
        }
        if (i == 262144) {
            view.setTag(R.id.accessibility_state_expanded, true);
        }
        HashMap hashMap = this.A04;
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf)) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("actionName", (String) hashMap.get(valueOf));
            Q6H q6h = (Q6H) view.getContext();
            if (q6h.A0F()) {
                int id = view.getId();
                int A002 = UIManagerHelper.A00(q6h);
                int i2 = 2;
                if (id % 2 != 0) {
                    i2 = 1;
                }
                X9N A032 = UIManagerHelper.A03(q6h, i2, true);
                if (A032 != null) {
                    ((UIManagerModule) A032).mEventDispatcher.APe(new UTK(writableNativeMap, this, A002, id));
                }
            } else {
                ReactSoftExceptionLogger.logSoftException("ReactAccessibilityDelegate", new RuntimeException("Cannot get RCTEventEmitter, no CatalystInstance"));
            }
            Object tag = view.getTag(R.id.accessibility_role);
            ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
            if (tag != C16684Uze.ADJUSTABLE || (i != 04x.A0Z.A00() && i != 04x.A0X.A00())) {
                return true;
            }
            if (readableMap != null && !readableMap.hasKey("text")) {
                Handler handler = this.A00;
                if (handler.hasMessages(1, view)) {
                    handler.removeMessages(1, view);
                }
                handler.sendMessageDelayed(handler.obtainMessage(1, view), 200);
            }
        }
        return C14750U7h.super.A0V(view, i, bundle);
    }

    public final 057 A0Z(View view) {
        if (this.A03 != null) {
            return C14750U7h.super.A0Z(view);
        }
        return null;
    }

    public final int A0a(float f, float f2) {
        Layout layout;
        C17176VLg vLg = this.A03;
        if (vLg == null) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        List<C17474VXb> list = vLg.A00;
        if (list.size() == 0) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        View view = this.A02;
        if (!(view instanceof TextView)) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        TextView textView = (TextView) view;
        if (!(textView.getText() instanceof Spanned) || (layout = textView.getLayout()) == null) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        float totalPaddingLeft = f - ((float) textView.getTotalPaddingLeft());
        float totalPaddingTop = f2 - ((float) textView.getTotalPaddingTop());
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) (totalPaddingTop + ((float) textView.getScrollY()))), totalPaddingLeft + ((float) textView.getScrollX()));
        Object A0p = A0p(ClickableSpan.class, offsetForHorizontal, offsetForHorizontal);
        if (A0p == null) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        Spanned spanned = (Spanned) textView.getText();
        int spanStart = spanned.getSpanStart(A0p);
        int spanEnd = spanned.getSpanEnd(A0p);
        for (C17474VXb vXb : list) {
            if (vXb.A02 == spanStart && vXb.A00 == spanEnd) {
                return vXb.A01;
            }
        }
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final void A0h(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        float textSize;
        int i2;
        Rect rect;
        int width;
        int height;
        C17176VLg vLg = this.A03;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
        if (vLg != null) {
            Iterator it = vLg.A00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C17474VXb vXb = (C17474VXb) it.next();
                if (vXb.A01 == i) {
                    View view = this.A02;
                    boolean z = false;
                    if (!(view instanceof TextView)) {
                        width = view.getWidth();
                        height = view.getHeight();
                    } else {
                        TextView textView = (TextView) view;
                        Layout layout = textView.getLayout();
                        if (layout == null) {
                            width = textView.getWidth();
                            height = textView.getHeight();
                        } else {
                            double d = (double) vXb.A02;
                            double d2 = (double) vXb.A00;
                            int i3 = (int) d;
                            int lineForOffset = layout.getLineForOffset(i3);
                            if (d <= ((double) layout.getLineEnd(lineForOffset))) {
                                Rect rect2 = new Rect();
                                double primaryHorizontal = (double) layout.getPrimaryHorizontal(i3);
                                Paint paint = new Paint();
                                AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) A0p(AbsoluteSizeSpan.class, vXb.A02, vXb.A00);
                                if (absoluteSizeSpan != null) {
                                    textSize = (float) absoluteSizeSpan.getSize();
                                } else {
                                    textSize = textView.getTextSize();
                                }
                                paint.setTextSize(textSize);
                                int ceil = (int) Math.ceil((double) paint.measureText(vXb.A03));
                                if (lineForOffset != layout.getLineForOffset((int) d2)) {
                                    z = true;
                                }
                                layout.getLineBounds(lineForOffset, rect2);
                                int scrollY = textView.getScrollY() + textView.getTotalPaddingTop();
                                rect2.top += scrollY;
                                rect2.bottom += scrollY;
                                int totalPaddingLeft = (int) (((double) rect2.left) + ((primaryHorizontal + ((double) textView.getTotalPaddingLeft())) - ((double) textView.getScrollX())));
                                rect2.left = totalPaddingLeft;
                                int i4 = rect2.top;
                                if (z) {
                                    i2 = rect2.right;
                                } else {
                                    i2 = totalPaddingLeft + ceil;
                                }
                                rect = new Rect(totalPaddingLeft, i4, i2, rect2.bottom);
                                accessibilityNodeInfoCompat2.setContentDescription(vXb.A03);
                                accessibilityNodeInfoCompat2.addAction(16);
                                accessibilityNodeInfoCompat2.mInfo.setBoundsInParent(rect);
                                accessibilityNodeInfoCompat2.setRoleDescription(view.getResources().getString(2131965059));
                                accessibilityNodeInfoCompat2.setClassName(C16684Uze.A02(C16684Uze.BUTTON));
                                return;
                            }
                        }
                    }
                    rect = new Rect(0, 0, width, height);
                    accessibilityNodeInfoCompat2.setContentDescription(vXb.A03);
                    accessibilityNodeInfoCompat2.addAction(16);
                    accessibilityNodeInfoCompat2.mInfo.setBoundsInParent(rect);
                    accessibilityNodeInfoCompat2.setRoleDescription(view.getResources().getString(2131965059));
                    accessibilityNodeInfoCompat2.setClassName(C16684Uze.A02(C16684Uze.BUTTON));
                    return;
                }
            }
        }
        accessibilityNodeInfoCompat2.setContentDescription("");
        accessibilityNodeInfoCompat2.mInfo.setBoundsInParent(new Rect(0, 0, 1, 1));
    }

    public final void A0i(List list) {
        C17176VLg vLg = this.A03;
        if (vLg != null) {
            for (int i = 0; i < vLg.A00.size(); i++) {
                G9w.A0x(i, list);
            }
        }
    }

    public final Object A0p(Class cls, int i, int i2) {
        View view = this.A02;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        if (!(textView.getText() instanceof Spanned)) {
            return null;
        }
        Object[] spans = ((Spanned) textView.getText()).getSpans(i, i2, cls);
        if (spans.length > 0) {
            return spans[0];
        }
        return null;
    }

    public C14750U7h(View view, int i, boolean z) {
        super(view);
        this.A02 = view;
        view.setFocusable(z);
        view.setImportantForAccessibility(i);
        this.A03 = (C17176VLg) view.getTag(R.id.accessibility_links);
    }

    public static void A01(Context context, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, C16684Uze uze) {
        int i;
        accessibilityNodeInfoCompat.setClassName(C16684Uze.A02(uze));
        if (uze.equals(C16684Uze.LINK)) {
            i = 2131965059;
        } else if (uze.equals(C16684Uze.IMAGE)) {
            i = 2131964118;
        } else {
            if (uze.equals(C16684Uze.IMAGEBUTTON)) {
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(2131964132));
            } else if (!uze.equals(C16684Uze.BUTTON)) {
                if (uze.equals(C16684Uze.TOGGLEBUTTON)) {
                    accessibilityNodeInfoCompat.setClickable(true);
                    accessibilityNodeInfoCompat.mInfo.setCheckable(true);
                    return;
                } else if (uze.equals(C16684Uze.SUMMARY)) {
                    i = 2131974750;
                } else if (uze.equals(C16684Uze.HEADER)) {
                    accessibilityNodeInfoCompat.mInfo.setHeading(true);
                    return;
                } else if (uze.equals(C16684Uze.ALERT)) {
                    i = 2131952874;
                } else if (uze.equals(C16684Uze.COMBOBOX)) {
                    i = 2131956341;
                } else if (uze.equals(C16684Uze.MENU)) {
                    i = 2131966158;
                } else if (uze.equals(C16684Uze.MENUBAR)) {
                    i = 2131966174;
                } else if (uze.equals(C16684Uze.MENUITEM)) {
                    i = 2131966175;
                } else if (uze.equals(C16684Uze.PROGRESSBAR)) {
                    i = 2131970090;
                } else if (uze.equals(C16684Uze.RADIOGROUP)) {
                    i = 2131971254;
                } else if (uze.equals(C16684Uze.SCROLLBAR)) {
                    i = 2131972796;
                } else if (uze.equals(C16684Uze.SPINBUTTON)) {
                    i = 2131974122;
                } else if (uze.equals(C16684Uze.TAB)) {
                    i = 2131972404;
                } else if (uze.equals(C16684Uze.TABLIST)) {
                    i = 2131974930;
                } else if (uze.equals(C16684Uze.TIMER)) {
                    i = 2131975404;
                } else if (uze.equals(C16684Uze.TOOLBAR)) {
                    i = 2131975478;
                } else {
                    return;
                }
            }
            accessibilityNodeInfoCompat.setClickable(true);
            return;
        }
        accessibilityNodeInfoCompat.setRoleDescription(context.getString(i));
    }

    public static void A02(View view, int i, boolean z) {
        if (03v.A00(view) != null) {
            return;
        }
        if (view.getTag(R.id.accessibility_role) != null || view.getTag(R.id.accessibility_state) != null || view.getTag(R.id.accessibility_actions) != null || view.getTag(R.id.react_test_id) != null || view.getTag(R.id.accessibility_collection_item) != null || view.getTag(R.id.accessibility_links) != null || view.getTag(R.id.role) != null) {
            03v.A0B(view, new C14750U7h(view, i, z));
        }
    }

    public final void A0S(View view, AccessibilityEvent accessibilityEvent) {
        ReadableType readableType;
        C14750U7h.super.A0S(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            if (dynamic != null && dynamic.getType() == (readableType = ReadableType.Number) && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                int asInt = dynamic.asInt();
                int asInt2 = dynamic2.asInt();
                int asInt3 = dynamic3.asInt();
                if (asInt3 > asInt && asInt2 >= asInt && asInt3 >= asInt2) {
                    accessibilityEvent.setItemCount(asInt3 - asInt);
                    accessibilityEvent.setCurrentItemIndex(asInt2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f9, code lost:
        if (r1 == false) goto L_0x01fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Y(android.view.View r14, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r15) {
        /*
            r13 = this;
            X.C14750U7h.super.A0Y(r14, r15)
            r1 = 2131427425(0x7f0b0061, float:1.8476466E38)
            java.lang.Object r0 = r14.getTag(r1)
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r14.getTag(r1)
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r1 == 0) goto L_0x001a
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x001a:
            r15.addAction(r0)
        L_0x001d:
            X.Uze r5 = X.C16684Uze.A00(r14)
            r0 = 2131427418(0x7f0b005a, float:1.8476452E38)
            java.lang.Object r1 = r14.getTag(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r5 == 0) goto L_0x0033
            android.content.Context r0 = r14.getContext()
            A01(r0, r15, r5)
        L_0x0033:
            if (r1 == 0) goto L_0x003a
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setTooltipText(r1)
        L_0x003a:
            r0 = 2131435140(0x7f0b1e84, float:1.8492114E38)
            java.lang.Object r12 = r14.getTag(r0)
            if (r12 == 0) goto L_0x0057
            android.view.View r1 = r14.getRootView()
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            android.view.View r1 = X.C18716Vym.A00(r1, r0)
            r13.A01 = r1
            if (r1 == 0) goto L_0x0057
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setLabeledBy(r1)
        L_0x0057:
            r0 = 2131427424(0x7f0b0060, float:1.8476464E38)
            java.lang.Object r4 = r14.getTag(r0)
            com.facebook.react.bridge.ReadableMap r4 = (com.facebook.react.bridge.ReadableMap) r4
            if (r4 == 0) goto L_0x00c8
            com.facebook.react.bridge.ReadableMapKeySetIterator r6 = r4.keySetIterator()
        L_0x0066:
            boolean r0 = r6.CKI()
            if (r0 == 0) goto L_0x00c8
            java.lang.String r3 = r6.Crc()
            com.facebook.react.bridge.Dynamic r2 = r4.getDynamic(r3)
            java.lang.String r0 = "selected"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x008e
            com.facebook.react.bridge.ReadableType r1 = r2.getType()
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Boolean
            if (r1 != r0) goto L_0x008e
            boolean r1 = r2.asBoolean()
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setSelected(r1)
            goto L_0x0066
        L_0x008e:
            java.lang.String r0 = "disabled"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00a8
            com.facebook.react.bridge.ReadableType r1 = r2.getType()
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Boolean
            if (r1 != r0) goto L_0x00a8
            boolean r0 = r2.asBoolean()
            r0 = r0 ^ 1
            r15.setEnabled(r0)
            goto L_0x0066
        L_0x00a8:
            java.lang.String r0 = "checked"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0066
            com.facebook.react.bridge.ReadableType r1 = r2.getType()
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Boolean
            if (r1 != r0) goto L_0x0066
            boolean r2 = r2.asBoolean()
            r1 = 1
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setCheckable(r1)
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setChecked(r2)
            goto L_0x0066
        L_0x00c8:
            r0 = 2131427383(0x7f0b0037, float:1.847638E38)
            java.lang.Object r3 = r14.getTag(r0)
            com.facebook.react.bridge.ReadableArray r3 = (com.facebook.react.bridge.ReadableArray) r3
            r0 = 2131427385(0x7f0b0039, float:1.8476385E38)
            java.lang.Object r8 = r14.getTag(r0)
            com.facebook.react.bridge.ReadableMap r8 = (com.facebook.react.bridge.ReadableMap) r8
            if (r8 == 0) goto L_0x0107
            java.lang.String r0 = "rowIndex"
            int r7 = r8.getInt(r0)
            java.lang.String r0 = "columnIndex"
            int r6 = r8.getInt(r0)
            java.lang.String r0 = "rowSpan"
            int r2 = r8.getInt(r0)
            java.lang.String r0 = "columnSpan"
            int r1 = r8.getInt(r0)
            r0 = 724(0x2d4, float:1.015E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r8.getBoolean(r0)
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r7, r2, r6, r1, r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setCollectionItemInfo(r1)
        L_0x0107:
            r11 = 1
            if (r3 == 0) goto L_0x016c
            r8 = 0
        L_0x010b:
            int r0 = r3.size()
            if (r8 >= r0) goto L_0x016c
            com.facebook.react.bridge.ReadableMap r10 = r3.getMap(r8)
            java.lang.String r9 = "name"
            boolean r0 = r10.hasKey(r9)
            if (r0 == 0) goto L_0x0164
            int r7 = A05
            java.lang.String r1 = "label"
            boolean r0 = r10.hasKey(r1)
            if (r0 == 0) goto L_0x0162
            java.lang.String r6 = r10.getString(r1)
        L_0x012b:
            java.util.HashMap r1 = A06
            java.lang.String r0 = r10.getString(r9)
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x015b
            java.lang.String r0 = r10.getString(r9)
            java.lang.Object r0 = r1.get(r0)
            int r7 = X.AnonymousClass7TE.A0M(r0)
        L_0x0143:
            java.util.HashMap r2 = r13.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.String r0 = r10.getString(r9)
            r2.put(r1, r0)
            X.04x r0 = new X.04x
            r0.<init>(r7, r6)
            r15.addAction(r0)
            int r8 = r8 + 1
            goto L_0x010b
        L_0x015b:
            int r0 = A05
            int r0 = r0 + 1
            A05 = r0
            goto L_0x0143
        L_0x0162:
            r6 = 0
            goto L_0x012b
        L_0x0164:
            java.lang.String r1 = "Unknown accessibility action."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x016c:
            r0 = 2131427426(0x7f0b0062, float:1.8476468E38)
            java.lang.Object r8 = r14.getTag(r0)
            com.facebook.react.bridge.ReadableMap r8 = (com.facebook.react.bridge.ReadableMap) r8
            if (r8 == 0) goto L_0x01d4
            java.lang.String r2 = "min"
            boolean r0 = r8.hasKey(r2)
            if (r0 == 0) goto L_0x01d4
            java.lang.String r6 = "now"
            boolean r0 = r8.hasKey(r6)
            if (r0 == 0) goto L_0x01d4
            java.lang.String r1 = "max"
            boolean r0 = r8.hasKey(r1)
            if (r0 == 0) goto L_0x01d4
            com.facebook.react.bridge.Dynamic r2 = r8.getDynamic(r2)
            com.facebook.react.bridge.Dynamic r7 = r8.getDynamic(r6)
            com.facebook.react.bridge.Dynamic r6 = r8.getDynamic(r1)
            if (r2 == 0) goto L_0x01d4
            com.facebook.react.bridge.ReadableType r0 = r2.getType()
            com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number
            if (r0 != r1) goto L_0x01d4
            if (r7 == 0) goto L_0x01d4
            com.facebook.react.bridge.ReadableType r0 = r7.getType()
            if (r0 != r1) goto L_0x01d4
            if (r6 == 0) goto L_0x01d4
            com.facebook.react.bridge.ReadableType r0 = r6.getType()
            if (r0 != r1) goto L_0x01d4
            int r2 = r2.asInt()
            int r1 = r7.asInt()
            int r0 = r6.asInt()
            if (r0 <= r2) goto L_0x01d4
            if (r1 < r2) goto L_0x01d4
            if (r0 < r1) goto L_0x01d4
            float r6 = (float) r2
            float r2 = (float) r0
            float r1 = (float) r1
            r0 = 0
            android.view.accessibility.AccessibilityNodeInfo$RangeInfo r1 = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(r0, r6, r2, r1)
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setRangeInfo(r1)
        L_0x01d4:
            r0 = 2131439231(0x7f0b2e7f, float:1.8500411E38)
            java.lang.Object r1 = r14.getTag(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x01e4
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setViewIdResourceName(r1)
        L_0x01e4:
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            java.lang.CharSequence r0 = r0.getContentDescription()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.CharSequence r0 = r15.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x01fb
            r0 = 1
            if (r1 != 0) goto L_0x01fc
        L_0x01fb:
            r0 = 0
        L_0x01fc:
            if (r3 != 0) goto L_0x0205
            if (r4 != 0) goto L_0x0205
            if (r12 != 0) goto L_0x0205
            if (r5 != 0) goto L_0x0205
            r11 = 0
        L_0x0205:
            if (r0 == 0) goto L_0x0210
            if (r11 == 0) goto L_0x0210
            java.lang.CharSequence r0 = A00(r14, r15)
            r15.setContentDescription(r0)
        L_0x0210:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14750U7h.A0Y(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
    }
}
