package X;

import android.view.ViewStructure;
import java.util.List;

public final class Q8l extends ViewStructure.HtmlInfo.Builder {
    public final List A00 = AnonymousClass7TE.A1C();

    public final ViewStructure.HtmlInfo.Builder addAttribute(String str, String str2) {
        if (str != null) {
            List list = this.A00;
            if (str2 == null) {
                str2 = "";
            }
            list.add(Pxe.A0K(str, str2));
        }
        return this;
    }

    public final ViewStructure.HtmlInfo build() {
        return new Q8m(this.A00);
    }
}
