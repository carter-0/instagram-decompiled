package X;

import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.util.List;

public final class LOA {
    public static final C62474KgP A05 = C62474KgP.POST;
    public C62474KgP A00 = A05;
    public String A01;
    public final String A02;
    public final String A03;
    public final List A04 = AnonymousClass7TE.A1C();

    public LOA(String str, String str2) {
        0qQ.A0B(str, 1);
        this.A03 = str;
        this.A02 = str2;
    }

    public final void A00() {
        boolean z;
        for (K5x k5x : this.A04) {
            IgdsBottomButtonLayout igdsBottomButtonLayout = k5x.A00;
            if (igdsBottomButtonLayout == null) {
                0qQ.A0F("bottomButtonLayout");
                throw AnonymousClass00P.createAndThrow();
            }
            if (k5x.A00().A01 != null) {
                k5x.A00();
                z = true;
            } else {
                z = false;
            }
            igdsBottomButtonLayout.setPrimaryButtonEnabled(z);
        }
    }
}
