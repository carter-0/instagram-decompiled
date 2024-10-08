package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class V8M {
    public static Map A00(C21041XAu xAu) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = null;
        if (xAu.Abw() != null) {
            List<C21033XAm> Abw = xAu.Abw();
            if (Abw != null) {
                arrayList = new ArrayList();
                for (C21033XAm xAm : Abw) {
                    if (xAm != null) {
                        arrayList.add(xAm.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("answers", arrayList);
        }
        if (xAu.Axp() != null) {
            linkedHashMap.put("disclaimer_text", xAu.Axp());
        }
        if (xAu.getId() != null) {
            C41845B3m.A0x(xAu.getId(), linkedHashMap);
        }
        if (xAu.BWJ() != null) {
            linkedHashMap.put("next_question_id_on_skip", xAu.BWJ());
        }
        if (xAu.Bcp() != null) {
            linkedHashMap.put("placeholder", xAu.Bcp());
        }
        if (xAu.C2H() != null) {
            linkedHashMap.put("submit_optional", xAu.C2H());
        }
        if (xAu.C2J() != null) {
            linkedHashMap.put("submit_text", xAu.C2J());
        }
        if (xAu.getTitle() != null) {
            linkedHashMap.put(DialogModule.KEY_TITLE, xAu.getTitle());
        }
        if (xAu.CAP() != null) {
            INLINE_SURVEY_QUESTION_TYPES CAP = xAu.CAP();
            if (CAP != null) {
                str = CAP.A00;
            }
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
