package com.facebook.catalyst.views.art;

import X.AnonymousClass7TE;
import X.C13988Tno;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ShadowNodeSetter;
import java.util.Map;

public class ARTGroupShadowNode$$PropsSetter implements ViewManagerPropertyUpdater$ShadowNodeSetter {
    public final void Bhz(Map map) {
        map.put("clipping", "Array");
        map.put("opacity", "number");
        map.put("transform", "Array");
    }

    public final /* bridge */ /* synthetic */ void EhL(ReactShadowNode reactShadowNode, Object obj, String str) {
        float A04;
        ARTGroupShadowNode aRTGroupShadowNode = (ARTGroupShadowNode) reactShadowNode;
        switch (str.hashCode()) {
            case -1267206133:
                if (str.equals("opacity")) {
                    if (!(obj instanceof Double)) {
                        A04 = 1.0f;
                    } else {
                        A04 = AnonymousClass7TE.A04(obj);
                    }
                    aRTGroupShadowNode.setOpacity(A04);
                    return;
                }
                return;
            case 918617282:
                if (str.equals("clipping")) {
                    aRTGroupShadowNode.setClipping(C13988Tno.A0I(obj));
                    return;
                }
                return;
            case 1052666732:
                if (str.equals("transform")) {
                    aRTGroupShadowNode.setTransform(C13988Tno.A0I(obj));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
