package X;

import android.widget.ImageView;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashMap;

public final class W0Y {
    public static HashMap A00() {
        HashMap hashMap = new HashMap();
        hashMap.put("topChange", Dba.A0f("phasedRegistrationNames", C13991Tnr.A0p("bubbled", "onChange", "captured", "onChangeCapture")));
        hashMap.put("topSelect", C13992Tns.A0T("onSelect", "onSelectCapture"));
        hashMap.put(S9F.A00(AnonymousClass05K.A00), C13992Tns.A0T("onTouchStart", "onTouchStartCapture"));
        hashMap.put(S9F.A00(AnonymousClass05K.A0C), C13992Tns.A0T("onTouchMove", "onTouchMoveCapture"));
        hashMap.put(S9F.A00(AnonymousClass05K.A01), C13992Tns.A0T("onTouchEnd", "onTouchEndCapture"));
        hashMap.put(S9F.A00(AnonymousClass05K.A0N), C13992Tns.A0T("onTouchCancel", "onTouchCancelCapture"));
        return hashMap;
    }

    public static HashMap A01() {
        HashMap hashMap = new HashMap();
        Integer valueOf = Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal());
        Integer valueOf2 = Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal());
        Integer valueOf3 = Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal());
        HashMap A0p = C13991Tnr.A0p("ScaleAspectFit", valueOf, "ScaleAspectFill", valueOf2);
        A0p.put("ScaleAspectCenter", valueOf3);
        hashMap.put("UIView", Dba.A0f("ContentMode", A0p));
        Integer A0k = C51967G9n.A0k();
        Integer A0R = C13988Tno.A0R();
        Integer A0q = C66580MXl.A0q();
        HashMap A0p2 = C13991Tnr.A0p(NetInfoModule.CONNECTION_TYPE_NONE, A0k, "boxNone", A0R);
        A0p2.put("boxOnly", A0q);
        A0p2.put("unspecified", 3);
        hashMap.put("StyleConstants", Dba.A0f("PointerEventsValues", A0p2));
        HashMap A0p3 = C13991Tnr.A0p("typeWindowStateChanged", 32, "typeViewFocused", 8);
        A0p3.put("typeViewClicked", A0R);
        hashMap.put("AccessibilityEventTypes", A0p3);
        return hashMap;
    }

    public static HashMap A02() {
        HashMap hashMap = new HashMap();
        hashMap.put(Pxd.A00(278), Dba.A0f("registrationName", "onContentSizeChange"));
        hashMap.put("topLayout", Dba.A0f("registrationName", "onLayout"));
        hashMap.put(Pxd.A00(900), Dba.A0f("registrationName", "onLoadingError"));
        hashMap.put(Pxd.A00(901), Dba.A0f("registrationName", "onLoadingFinish"));
        hashMap.put(Pxd.A00(902), Dba.A0f("registrationName", "onLoadingStart"));
        hashMap.put("topSelectionChange", Dba.A0f("registrationName", "onSelectionChange"));
        hashMap.put("topMessage", Dba.A0f("registrationName", "onMessage"));
        hashMap.put("topScrollBeginDrag", Dba.A0f("registrationName", "onScrollBeginDrag"));
        hashMap.put("topScrollEndDrag", Dba.A0f("registrationName", "onScrollEndDrag"));
        hashMap.put("topScroll", Dba.A0f("registrationName", "onScroll"));
        hashMap.put("topMomentumScrollBegin", Dba.A0f("registrationName", "onMomentumScrollBegin"));
        hashMap.put("topMomentumScrollEnd", Dba.A0f("registrationName", "onMomentumScrollEnd"));
        return hashMap;
    }
}
