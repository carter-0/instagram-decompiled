package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class V8I {
    public static Map A00(C21045XAz xAz) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xAz.ArZ() != null) {
            linkedHashMap.put("correct_answer", xAz.ArZ());
        }
        if (xAz.Avv() != null) {
            linkedHashMap.put("default_prompt", xAz.Avv());
        }
        if (xAz.getEndBackgroundColor() != null) {
            linkedHashMap.put("end_background_color", xAz.getEndBackgroundColor());
        }
        if (xAz.B60() != null) {
            linkedHashMap.put("finished", xAz.B60());
        }
        if (xAz.getId() != null) {
            C41845B3m.A0x(xAz.getId(), linkedHashMap);
        }
        ArrayList arrayList2 = null;
        if (xAz.BYc() != null) {
            List<C21026XAf> BYc = xAz.BYc();
            if (BYc != null) {
                arrayList = new ArrayList();
                for (C21026XAf xAf : BYc) {
                    if (xAf != null) {
                        arrayList.add(xAf.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("options", arrayList);
        }
        if (xAz.getQuestion() != null) {
            linkedHashMap.put("question", xAz.getQuestion());
        }
        if (xAz.Biw() != null) {
            linkedHashMap.put("quiz_id", xAz.Biw());
        }
        if (xAz.getStartBackgroundColor() != null) {
            linkedHashMap.put("start_background_color", xAz.getStartBackgroundColor());
        }
        if (xAz.C48() != null) {
            List<C21026XAf> C48 = xAz.C48();
            if (C48 != null) {
                arrayList2 = new ArrayList();
                for (C21026XAf xAf2 : C48) {
                    if (xAf2 != null) {
                        arrayList2.add(xAf2.FHC());
                    }
                }
            }
            linkedHashMap.put("tallies", arrayList2);
        }
        if (xAz.getTextColor() != null) {
            linkedHashMap.put("text_color", xAz.getTextColor());
        }
        if (xAz.CEs() != null) {
            linkedHashMap.put("viewer_answer", xAz.CEs());
        }
        if (xAz.CEu() != null) {
            linkedHashMap.put("viewer_can_answer", xAz.CEu());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
