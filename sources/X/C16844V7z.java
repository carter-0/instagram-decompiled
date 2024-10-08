package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GreetingAttachmentIntf;
import com.instagram.api.schemas.IceBreakerMessageIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.V7z  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16844V7z {
    public static Map A00(OnFeedMessagesIntf onFeedMessagesIntf) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (onFeedMessagesIntf.Awj() != null) {
            linkedHashMap.put("destinationType", onFeedMessagesIntf.Awj());
        }
        if (onFeedMessagesIntf.B96() != null) {
            linkedHashMap.put("genericUrl", onFeedMessagesIntf.B96());
        }
        if (onFeedMessagesIntf.B9l() != null) {
            linkedHashMap.put("greetingText", onFeedMessagesIntf.B9l());
        }
        if (onFeedMessagesIntf.BCi() != null) {
            linkedHashMap.put("headerText", onFeedMessagesIntf.BCi());
        }
        if (onFeedMessagesIntf.BE4() != null) {
            linkedHashMap.put(AnonymousClass000.A00(3269), onFeedMessagesIntf.BE4());
        }
        if (onFeedMessagesIntf.BE5() != null) {
            linkedHashMap.put("icebreakerDisclaimerTextFAQsSticker", onFeedMessagesIntf.BE5());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (onFeedMessagesIntf.BE6() != null) {
            List<IceBreakerMessageIntf> BE6 = onFeedMessagesIntf.BE6();
            if (BE6 != null) {
                arrayList = new ArrayList();
                for (IceBreakerMessageIntf iceBreakerMessageIntf : BE6) {
                    if (iceBreakerMessageIntf != null) {
                        arrayList.add(iceBreakerMessageIntf.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("icebreakerMessages", arrayList);
        }
        if (onFeedMessagesIntf.BFz() != null) {
            GreetingAttachmentIntf BFz = onFeedMessagesIntf.BFz();
            if (BFz != null) {
                treeUpdaterJNI = BFz.FHC();
            }
            linkedHashMap.put("imageAttachment", treeUpdaterJNI);
        }
        if (onFeedMessagesIntf.BuX() != null) {
            linkedHashMap.put("shouldSendAttachment", onFeedMessagesIntf.BuX());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
