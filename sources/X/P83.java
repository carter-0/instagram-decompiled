package X;

import android.view.MotionEvent;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

public final class P83 implements AnonymousClass7DS {
    public final C74545Pwe A00;

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        String str;
        NYJ nyj = (NYJ) obj;
        C68071Mzc mzc = (C68071Mzc) obj2;
        AnonymousClass7TG.A1N(nyj, mzc);
        C328667Fr r0 = nyj.A00;
        DirectMessageIdentifier directMessageIdentifier = r0.A0L;
        AnonymousClass9J0 r02 = r0.A05;
        if (r02 == null || (str = r02.A01) == null) {
            return false;
        }
        C74545Pwe pwe = this.A00;
        if (pwe.CR1(directMessageIdentifier)) {
            pwe.stop();
            return true;
        }
        pwe.E2r(mzc, directMessageIdentifier, str);
        return true;
    }

    public P83(C74545Pwe pwe) {
        this.A00 = pwe;
    }
}
