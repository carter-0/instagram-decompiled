package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.api.LeadGenInfoFieldDataIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class VEO {
    public static LeadForm A00(ImageUrl imageUrl, Boolean bool, String str, String str2, String str3, List list) {
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(((LeadGenInfoFieldDataIntf) it.next()).FER());
        }
        return new LeadForm(imageUrl, bool, str, str2, str3, A0r);
    }
}
