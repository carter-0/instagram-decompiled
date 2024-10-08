package X;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.WIz  reason: case insensitive filesystem */
public abstract class C19068WIz implements X62 {
    public final BaseViewManager A00;

    public void EhN(View view, Object obj, String str) {
        AnonymousClass7TF.A1H(view, str);
        boolean z = false;
        int i = 0;
        switch (str.hashCode()) {
            case -1721943862:
                if (str.equals("translateX")) {
                    this.A00.setTranslateX(view, A00(obj, 0.0f));
                    return;
                }
                return;
            case -1721943861:
                if (str.equals("translateY")) {
                    this.A00.setTranslateY(view, A00(obj, 0.0f));
                    return;
                }
                return;
            case -1589741021:
                if (str.equals("shadowColor")) {
                    if (obj != null) {
                        i = SPt.A00(view.getContext(), obj);
                    }
                    int A09 = JTP.A09(i);
                    view.setOutlineAmbientShadowColor(A09);
                    view.setOutlineSpotShadowColor(A09);
                    return;
                }
                return;
            case -1267206133:
                if (str.equals("opacity")) {
                    this.A00.setOpacity(view, A00(obj, 1.0f));
                    return;
                }
                return;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    this.A00.setBorderTopLeftRadius(view, A00(obj, Float.NaN));
                    return;
                }
                return;
            case -908189618:
                if (str.equals("scaleX")) {
                    view.setScaleX(A00(obj, 1.0f));
                    return;
                }
                return;
            case -908189617:
                if (str.equals("scaleY")) {
                    view.setScaleY(A00(obj, 1.0f));
                    return;
                }
                return;
            case -877170387:
                if (str.equals("testID")) {
                    this.A00.setTestId(view, (String) obj);
                    return;
                }
                return;
            case -781597262:
                if (str.equals("transformOrigin")) {
                    this.A00.setTransformOrigin(view, (ReadableArray) obj);
                    return;
                }
                return;
            case -731417480:
                if (str.equals("zIndex")) {
                    this.A00.setZIndex(view, A00(obj, 0.0f));
                    return;
                }
                return;
            case -101663499:
                if (str.equals("accessibilityHint")) {
                    this.A00.setAccessibilityHint(view, (String) obj);
                    return;
                }
                return;
            case -101359900:
                if (str.equals("accessibilityRole")) {
                    this.A00.setAccessibilityRole(view, (String) obj);
                    return;
                }
                return;
            case -80891667:
                if (str.equals("renderToHardwareTextureAndroid")) {
                    BaseViewManager baseViewManager = this.A00;
                    Boolean bool = (Boolean) obj;
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                    baseViewManager.setRenderToHardwareTexture(view, z);
                    return;
                }
                return;
            case -40300674:
                if (str.equals("rotation")) {
                    view.setRotation(A00(obj, 0.0f));
                    return;
                }
                return;
            case -4379043:
                if (str.equals("elevation")) {
                    this.A00.setElevation(view, A00(obj, 0.0f));
                    return;
                }
                return;
            case 3506294:
                if (str.equals("role")) {
                    this.A00.setRole(view, (String) obj);
                    return;
                }
                return;
            case 36255470:
                if (str.equals("accessibilityLiveRegion")) {
                    this.A00.setAccessibilityLiveRegion(view, (String) obj);
                    return;
                }
                return;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    this.A00.setBorderTopRightRadius(view, A00(obj, Float.NaN));
                    return;
                }
                return;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    this.A00.setBorderBottomLeftRadius(view, A00(obj, Float.NaN));
                    return;
                }
                return;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    this.A00.setBorderBottomRightRadius(view, A00(obj, Float.NaN));
                    return;
                }
                return;
            case 746986311:
                if (str.equals("importantForAccessibility")) {
                    this.A00.setImportantForAccessibility(view, (String) obj);
                    return;
                }
                return;
            case 1052666732:
                if (str.equals("transform")) {
                    this.A00.setTransform(view, (ReadableArray) obj);
                    return;
                }
                return;
            case 1146842694:
                if (str.equals("accessibilityLabel")) {
                    this.A00.setAccessibilityLabel(view, (String) obj);
                    return;
                }
                return;
            case 1153872867:
                if (str.equals("accessibilityState")) {
                    this.A00.setViewState(view, (ReadableMap) obj);
                    return;
                }
                return;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    BaseViewManager baseViewManager2 = this.A00;
                    if (obj != null) {
                        i = SPt.A00(view.getContext(), obj);
                    }
                    baseViewManager2.setBackgroundColor(view, JTP.A09(i));
                    return;
                }
                return;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    this.A00.setBorderRadius(view, A00(obj, Float.NaN));
                    return;
                }
                return;
            case 1505602511:
                if (str.equals("accessibilityActions")) {
                    this.A00.setAccessibilityActions(view, (ReadableArray) obj);
                    return;
                }
                return;
            case 1761903244:
                if (str.equals("accessibilityCollection")) {
                    this.A00.setAccessibilityCollection(view, (ReadableMap) obj);
                    return;
                }
                return;
            case 1865277756:
                if (str.equals("accessibilityLabelledBy")) {
                    this.A00.setAccessibilityLabelledBy(view, new C19057WIj(obj));
                    return;
                }
                return;
            case 1993034687:
                if (str.equals("accessibilityCollectionItem")) {
                    this.A00.setAccessibilityCollectionItem(view, (ReadableMap) obj);
                    return;
                }
                return;
            case 2045685618:
                if (str.equals("nativeID")) {
                    this.A00.setNativeId(view, (String) obj);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public static float A00(Object obj, float f) {
        Number number = (Number) obj;
        if (number != null) {
            return (float) number.doubleValue();
        }
        return f;
    }

    public void E6x(View view, String str, ReadableArray readableArray) {
        if ((this instanceof USI) && str.equals("setNativeRefreshing")) {
            ((SwipeRefreshLayout) view).setRefreshing(readableArray.getBoolean(0));
        }
    }

    public C19068WIz(BaseViewManager baseViewManager) {
        this.A00 = baseViewManager;
    }
}
