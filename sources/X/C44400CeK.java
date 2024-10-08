package X;

import com.instagram.api.schemas.StoryGroupMentionTappableDataIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CeK  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44400CeK {
    public static Map A00(StoryGroupMentionTappableDataIntf storyGroupMentionTappableDataIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storyGroupMentionTappableDataIntf.Auy() != null) {
            A1H.put("custom_text_color", storyGroupMentionTappableDataIntf.Auy());
        }
        if (storyGroupMentionTappableDataIntf.getId() != null) {
            C41845B3m.A0x(storyGroupMentionTappableDataIntf.getId(), A1H);
        }
        if (storyGroupMentionTappableDataIntf.BRk() != null) {
            List BRk = storyGroupMentionTappableDataIntf.BRk();
            ArrayList A0r = AnonymousClass7TG.A0r(BRk);
            Iterator it = BRk.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put("mentioned_users", A0r);
        }
        if (storyGroupMentionTappableDataIntf.Bzj() != null) {
            A1H.put("sticker_style_enum", storyGroupMentionTappableDataIntf.Bzj());
        }
        if (storyGroupMentionTappableDataIntf.getText() != null) {
            C41845B3m.A10(storyGroupMentionTappableDataIntf.getText(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
