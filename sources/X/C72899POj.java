package X;

import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.POj  reason: case insensitive filesystem */
public final class C72899POj implements C74465PvK {
    public final /* synthetic */ C69106Nel A00;

    public C72899POj(C69106Nel nel) {
        this.A00 = nel;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Prw, java.lang.Object] */
    public final void Dgz() {
        C69106Nel nel = this.A00;
        nel.A0F.A00.A00(new PJg());
        nel.A0D.A03(new Object());
    }

    public final void Dh0() {
        C69106Nel nel = this.A00;
        nel.A0G.A02(0);
        nel.A0F.A00.A00(new PK5(AnonymousClass05K.A01));
    }

    public final void Dh1() {
        Integer num;
        OK7 ok7;
        String str;
        C69106Nel nel = this.A00;
        String str2 = nel.A06;
        if (str2 != null) {
            N9U n9u = (N9U) nel.A01;
            Integer num2 = null;
            if (n9u != null) {
                num = n9u.A01;
            } else {
                num = null;
            }
            if (num == AnonymousClass05K.A00) {
                nel.A0D.A03(new C72823PLl(nel.A0B, nel.A09, str2));
                ok7 = nel.A0F;
                str = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
            } else {
                if (n9u != null) {
                    num2 = n9u.A01;
                }
                if (num2 == AnonymousClass05K.A01) {
                    C70906OQy.A00(nel.A09, nel.A0B, (DirectCameraViewModel) null, str2, true);
                    ok7 = nel.A0F;
                    str = "story";
                }
            }
            ok7.A00.A00(new C72772PJm(str));
        }
        nel.A0G.A01();
        nel.A0F.A00.A00(new PK6(AnonymousClass05K.A01));
        nel.A07 = AnonymousClass7TE.A1C();
        C71111Ocu.A01(nel.A0D, true);
        C69106Nel.A02(nel);
    }
}
