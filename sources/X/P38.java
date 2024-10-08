package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;

public final class P38 implements AnonymousClass7IA {
    public final /* synthetic */ NV6 A00;
    public final /* synthetic */ AnonymousClass7L7 A01;

    public final boolean CbZ(int i) {
        return true;
    }

    public final void DX3(C53401GnY gnY, C381779cJ r2, AnonymousClass3Q2 r3, C352218Cl r4, Long l, int i, boolean z) {
    }

    public final void DjA(C53401GnY gnY, Long l, List list) {
    }

    public final void Dxz(C53401GnY gnY, C381779cJ r2, ClipInfo clipInfo, Long l, String str, int i, boolean z) {
    }

    public P38(NV6 nv6, AnonymousClass7L7 r2) {
        this.A01 = r2;
        this.A00 = nv6;
    }

    public final void Dj8(MessageIdentifier messageIdentifier, List list) {
        AnonymousClass7L7 r2 = this.A01;
        NV6 nv6 = this.A00;
        r2.A01(nv6.requireContext(), messageIdentifier, list);
        OMC omc = nv6.A00;
        if (omc == null) {
            0qQ.A0F("sharedStacksLogger");
            throw AnonymousClass00P.createAndThrow();
        } else {
            omc.A01("stack_grid_view");
        }
    }
}
