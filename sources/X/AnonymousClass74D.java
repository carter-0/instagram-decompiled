package X;

import android.view.MotionEvent;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.74D  reason: invalid class name */
public final class AnonymousClass74D implements AnonymousClass7DS {
    public final C332927Wz A00;

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        AnonymousClass7FU r6 = (AnonymousClass7FU) obj;
        C328007Db r7 = (C328007Db) obj2;
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        boolean BCL = r6.BCL();
        MessageIdentifier BSG = r6.BSG();
        C332927Wz r2 = this.A00;
        if (!C70020Nvy.A00(r2, BSG, BCL)) {
            MessageIdentifier Ar2 = r6.Ar2();
            if (Ar2 == null) {
                return false;
            }
            ((C332887Wv) r2).AUo(r7, Ar2.A01, true);
        }
        return true;
    }

    public AnonymousClass74D(C332927Wz r1) {
        this.A00 = r1;
    }
}
