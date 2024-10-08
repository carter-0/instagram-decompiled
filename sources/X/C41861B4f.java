package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.api.schemas.ConfirmationTitleStyle;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.api.schemas.UndoStyle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.B4f  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41861B4f {
    public static Map A00(AnonymousClass1eD r5) {
        String str;
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r5.Apv() != null) {
            linkedHashMap.put("confirmation_body", r5.Apv());
        }
        if (r5.Apw() != null) {
            linkedHashMap.put("confirmation_icon", r5.Apw());
        }
        String str4 = null;
        if (r5.Apx() != null) {
            ConfirmationStyle Apx = r5.Apx();
            if (Apx != null) {
                str3 = Apx.A00;
            } else {
                str3 = null;
            }
            linkedHashMap.put("confirmation_style", str3);
        }
        if (r5.Apy() != null) {
            linkedHashMap.put("confirmation_title", r5.Apy());
        }
        if (r5.Apz() != null) {
            ConfirmationTitleStyle Apz = r5.Apz();
            if (Apz != null) {
                str2 = Apz.A00;
            } else {
                str2 = null;
            }
            linkedHashMap.put("confirmation_title_style", str2);
        }
        if (r5.B1L() != null) {
            linkedHashMap.put("enable_word_wrapping", r5.B1L());
        }
        if (r5.B73() != null) {
            List<C246193eB> B73 = r5.B73();
            if (B73 != null) {
                arrayList = new ArrayList();
                for (C246193eB r0 : B73) {
                    if (r0 != null) {
                        arrayList.add(r0.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("followup_options", arrayList);
        }
        if (r5.B74() != null) {
            C246213eD B74 = r5.B74();
            if (B74 != null) {
                treeUpdaterJNI = B74.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("followup_options_set", treeUpdaterJNI);
        }
        if (r5.getTitle() != null) {
            linkedHashMap.put(DialogModule.KEY_TITLE, r5.getTitle());
        }
        if (r5.C7w() != null) {
            MediaOptionStyle C7w = r5.C7w();
            if (C7w != null) {
                str = C7w.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("title_style", str);
        }
        if (r5.CBP() != null) {
            UndoStyle CBP = r5.CBP();
            if (CBP != null) {
                str4 = CBP.A00;
            }
            linkedHashMap.put("undo_style", str4);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
