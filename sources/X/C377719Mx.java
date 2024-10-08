package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collections;

/* renamed from: X.9Mx  reason: invalid class name and case insensitive filesystem */
public final class C377719Mx extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377719Mx(Object obj, Object obj2, Object obj3, String str, int i) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A04 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            JVM jvm = (JVM) obj;
            C322486vu r1 = ((C322476vt) this.A01).A00;
            if (r1 != null) {
                if (r1.A0B != jvm) {
                    r1.A0B = jvm;
                    r1.A00();
                }
                if (jvm != null) {
                    UserSession userSession = ((C322346vg) this.A03).A04;
                    0qQ.A0B(userSession, 0);
                    ((C46390DeC) userSession.A01(C46390DeC.class, new C51796G2f(userSession, 27))).A00((0wc) this.A02, this.A04, jvm.A02.A0B);
                }
            } else {
                0qQ.A0F("headerAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            C254783t2 r6 = (C254783t2) obj;
            DirectShareTarget directShareTarget = (DirectShareTarget) this.A02;
            boolean z = false;
            if (r6 instanceof AnonymousClass9HR) {
                directShareTarget = new DirectShareTarget(r6, (PendingRecipient) Collections.unmodifiableList(directShareTarget.A0Q).get(0));
            }
            if (!(r6 instanceof PIO)) {
                z = OZA.A00.A01((UserSession) this.A03, directShareTarget);
            }
            OXC.A01((UserSession) this.A03, directShareTarget).EMV((1Xj) this.A01, directShareTarget, this.A04, z);
        }
        return C60340gF.A00;
    }
}
