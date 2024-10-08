package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.79Q  reason: invalid class name */
public final class AnonymousClass79Q implements AnonymousClass7DY {
    public final /* synthetic */ C332767Wh A00;

    public AnonymousClass79Q(C332767Wh r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void Cy2(Object obj, Object obj2) {
        C328667Fr r10 = (C328667Fr) obj2;
        if (r10 != null) {
            DirectMessageIdentifier directMessageIdentifier = r10.A0L;
            String str = directMessageIdentifier.A01;
            String str2 = r10.A0Y;
            if (str2 == null && (str2 = r10.A0T) == null) {
                2FW Aqm = r10.A00.Aqm();
                if (Aqm != null) {
                    str2 = Aqm.toString();
                } else {
                    return;
                }
            }
            if (str2 != null) {
                this.A00.AFb(str, str2, r10.A00.Aqm().A00, directMessageIdentifier.A00, true);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void D77(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void DuS(Object obj) {
    }
}
