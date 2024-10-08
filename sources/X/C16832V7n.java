package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.V7n  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16832V7n {
    public static Map A00(C21036XAp xAp) {
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (xAp.Aeh() != null) {
            C21024XAd Aeh = xAp.Aeh();
            if (Aeh != null) {
                treeUpdaterJNI2 = Aeh.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put(AppStateModule.APP_STATE_BACKGROUND, treeUpdaterJNI2);
        }
        if (xAp.getDescription() != null) {
            linkedHashMap.put(DevServerEntity.COLUMN_DESCRIPTION, xAp.getDescription());
        }
        if (xAp.BSk() != null) {
            List<C21032XAl> BSk = xAp.BSk();
            if (BSk != null) {
                arrayList = new ArrayList();
                for (C21032XAl xAl : BSk) {
                    if (xAl != null) {
                        arrayList.add(xAl.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("metadata_items", arrayList);
        }
        if (xAp.BsT() != null) {
            linkedHashMap.put("separator_color", xAp.BsT());
        }
        if (xAp.getTextColor() != null) {
            linkedHashMap.put("text_color", xAp.getTextColor());
        }
        if (xAp.C6r() != null) {
            XAX C6r = xAp.C6r();
            if (C6r != null) {
                treeUpdaterJNI = C6r.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("thumbnail", treeUpdaterJNI);
        }
        if (xAp.C7f() != null) {
            C21032XAl C7f = xAp.C7f();
            if (C7f != null) {
                treeUpdaterJNI3 = C7f.FHC();
            }
            linkedHashMap.put(DialogModule.KEY_TITLE, treeUpdaterJNI3);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
