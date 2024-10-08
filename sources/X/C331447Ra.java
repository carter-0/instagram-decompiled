package X;

import android.graphics.RectF;
import android.view.MotionEvent;
import com.google.common.collect.ImmutableList;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* renamed from: X.7Ra  reason: invalid class name and case insensitive filesystem */
public final class C331447Ra implements AnonymousClass7DS {
    public final /* synthetic */ AnonymousClass7RY A00;

    public C331447Ra(AnonymousClass7RY r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        ImmutableList A01;
        C68819NYd nYd = (C68819NYd) obj;
        AnonymousClass90H r6 = (AnonymousClass90H) obj2;
        if (nYd.A08) {
            return false;
        }
        AnonymousClass7RY r0 = this.A00;
        0qQ.A0A(r6);
        AnonymousClass7FU r3 = nYd.A00;
        boolean BCL = r3.BCL();
        MessageIdentifier BSG = nYd.BSG();
        AnonymousClass7XR r4 = r0.A02;
        if (C70020Nvy.A00((C332927Wz) r4, BSG, BCL)) {
            return true;
        }
        if (r6.A0B.getVisibility() == 0) {
            return false;
        }
        if (!C70051NwT.A00(r3.CU2(), nYd.A09).A00()) {
            return true;
        }
        AnonymousClass7XE r42 = (AnonymousClass7XE) r4;
        MessageIdentifier BSG2 = nYd.BSG();
        RectF A0F = 0nA.A0F(r6.A0A);
        C61063Jw1 jw1 = nYd.A01.A01;
        if (jw1 == null) {
            A01 = null;
        } else {
            int i = jw1.A01;
            MessagingUser messagingUser = (MessagingUser) jw1.A02;
            A01 = O4Y.A00.A01(messagingUser, (C74552Pwl) jw1.A03, i);
        }
        r42.Cpe(A0F, r6, BSG2, A01, (List) null, false, true, false);
        return true;
    }
}
