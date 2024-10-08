package X;

import android.graphics.RectF;
import com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;

public final class P3O implements C74456PvB {
    public final /* synthetic */ C68494NKn A00;

    public final void D1R(DirectShareTarget directShareTarget, DirectThreadKey directThreadKey, Integer num) {
        String str;
        C71140Odl odl;
        Integer num2;
        String A02;
        Long A0c;
        String str2;
        Integer num3;
        0qQ.A0B(directThreadKey, 0);
        C68494NKn nKn = this.A00;
        if (nKn instanceof NVN) {
            NVN nvn = (NVN) nKn;
            str = directThreadKey.A00;
            if (str != null) {
                ((ChannelDiscoveryViewModel) nvn.A01.getValue()).A0E(str);
                odl = (C71140Odl) nvn.A04.getValue();
                if (directShareTarget != null) {
                    num3 = Integer.valueOf(directShareTarget.A01);
                } else {
                    num3 = null;
                }
                A02 = C71140Odl.A02(num3);
                A0c = DbZ.A0c(num);
                str2 = "inbox_directory_sheet";
            } else {
                return;
            }
        } else {
            NVM nvm = (NVM) nKn;
            str = directThreadKey.A00;
            if (str != null) {
                ((ChannelDiscoveryViewModel) nvm.A00.getValue()).A0E(str);
                odl = (C71140Odl) nvm.A04.getValue();
                if (directShareTarget != null) {
                    num2 = Integer.valueOf(directShareTarget.A01);
                } else {
                    num2 = null;
                }
                A02 = C71140Odl.A02(num2);
                A0c = DbZ.A0c(num);
                str2 = "inbox_invites_sheet";
            } else {
                return;
            }
        }
        0Aj A002 = C71140Odl.A00(odl);
        if (A002.isSampled()) {
            C71140Odl.A04(A002, odl);
            DbS.A1I(A002, "channel_invitation_removed");
            DbS.A1M(A002, str2);
            Dba.A1B(A002, "source", "channel_invite_item");
            A002.A9F("suggestion_position", A0c);
            A002.AAJ("ig_thread_id", str);
            A002.AAJ("channel_type", A02);
            A002.Cgf();
        }
    }

    public final void E0o(DirectShareTarget directShareTarget, C254743sy r2) {
    }

    public final void EFQ(RectF rectF, DirectThreadKey directThreadKey) {
    }

    public P3O(C68494NKn nKn) {
        this.A00 = nKn;
    }
}
