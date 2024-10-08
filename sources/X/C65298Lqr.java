package X;

import android.widget.TextView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.model.direct.DirectShareTarget;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Lqr  reason: case insensitive filesystem */
public final class C65298Lqr implements MV9 {
    public final /* synthetic */ C61483K9o A00;
    public final /* synthetic */ Set A01;

    public final void D8z() {
    }

    public C65298Lqr(C61483K9o k9o, Set set) {
        this.A00 = k9o;
        this.A01 = set;
    }

    public final int BPM(TextView textView) {
        return this.A00.A04.A00.A0H.A05(textView);
    }

    public final void Dj4() {
        C61483K9o k9o = this.A00;
        Set<DirectShareTarget> set = this.A01;
        HashSet hashSet = new HashSet(set.size());
        for (DirectShareTarget directShareTarget : set) {
            C61002Juy juy = C61002Juy.A02;
            C61002Juy A002 = C64010LIx.A00(directShareTarget);
            MTF mtf = k9o.A06;
            Integer num = mtf.AXA().A01(A002).A01;
            if (num == AnonymousClass05K.A0C) {
                mtf.AXA().A07(A002);
            } else if (!(num == AnonymousClass05K.A01 || num == AnonymousClass05K.A00)) {
            }
            hashSet.add(directShareTarget);
        }
        k9o.A06.AXA().A06(new C65290Lqj(k9o.A00, k9o.A01, k9o.A02, k9o.A03, k9o.A05, AnonymousClass7TE.A1D(hashSet)), C61002Juy.A04);
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = k9o.A04.A00;
        directPrivateStoryRecipientController.A02++;
        JTU.A1C(directPrivateStoryRecipientController);
    }

    public final void DuW() {
        C61483K9o k9o = this.A00;
        k9o.A06.AXA().A07(C61002Juy.A04);
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = k9o.A04.A00;
        directPrivateStoryRecipientController.A03++;
        JTU.A1C(directPrivateStoryRecipientController);
    }
}
