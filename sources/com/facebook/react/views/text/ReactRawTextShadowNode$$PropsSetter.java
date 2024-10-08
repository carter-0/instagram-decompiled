package com.facebook.react.views.text;

import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ShadowNodeSetter;
import java.util.Map;

public class ReactRawTextShadowNode$$PropsSetter implements ViewManagerPropertyUpdater$ShadowNodeSetter {
    public final void Bhz(Map map) {
        map.put("text", "String");
    }

    public final /* bridge */ /* synthetic */ void EhL(ReactShadowNode reactShadowNode, Object obj, String str) {
        String str2;
        ReactRawTextShadowNode reactRawTextShadowNode = (ReactRawTextShadowNode) reactShadowNode;
        if (str.equals("text")) {
            if (obj instanceof String) {
                str2 = (String) obj;
            } else {
                str2 = null;
            }
            reactRawTextShadowNode.setText(str2);
        }
    }
}
