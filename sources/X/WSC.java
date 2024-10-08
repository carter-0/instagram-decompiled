package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class WSC implements C232262tL {
    public final UKO A00;
    public final C17471VWy A01;

    public WSC(AnonymousClass0iw r8, ImageUrl imageUrl, String str, String str2, List list, List list2, C62320sa r14, 0sP r15) {
        C51972G9s.A1D(list, list2);
        UKO uko = new UKO(imageUrl, str, str2, list, list2);
        C17471VWy vWy = new C17471VWy(r8, r14, r15);
        this.A00 = uko;
        this.A01 = vWy;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "checker_tile";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        UKO uko;
        WSC wsc = (WSC) obj;
        UKO uko2 = this.A00;
        if (wsc != null) {
            uko = wsc.A00;
        } else {
            uko = null;
        }
        return 0qQ.A0K(uko2, uko);
    }
}
