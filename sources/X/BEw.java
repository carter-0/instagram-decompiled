package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.List;

public final class BEw extends AnonymousClass0T0 implements C46238DRt {
    public final List A00;

    public BEw(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final BEw F3X() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BEw) && 0qQ.A0K(this.A00, ((BEw) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        List list = this.A00;
        if (list != null) {
            A0t.put("group_poll_prompt_suggestions", list);
        }
        return C41845B3m.A0T("XDTGroupPollCreateModeInfo", 0Yt.A0B(A0t));
    }
}
