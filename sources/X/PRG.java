package X;

import android.os.Bundle;
import com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel;
import com.instagram.modal.ModalActivity;
import java.util.ArrayList;

public final class PRG implements C74433Pun {
    public final /* synthetic */ NVN A00;

    public PRG(NVN nvn) {
        this.A00 = nvn;
    }

    public final void CtW(Integer num) {
        NVN nvn = this.A00;
        AnonymousClass0eM r6 = nvn.A05;
        Bundle A0a = AnonymousClass7TE.A0a();
        DbS.A0b(nvn.getActivity(), A0a, AnonymousClass7TE.A0l(r6), ModalActivity.class, C273654mx.A00(656)).A0C(nvn.getContext());
        ChannelDiscoveryViewModel channelDiscoveryViewModel = (ChannelDiscoveryViewModel) nvn.A01.getValue();
        if (channelDiscoveryViewModel.A09) {
            05G A08 = channelDiscoveryViewModel.A08();
            Iterable<Object> iterable = (Iterable) A08.getValue();
            ArrayList A0r = AnonymousClass7TG.A0r(iterable);
            for (Object obj : iterable) {
                if (obj instanceof N64) {
                    N64 n64 = (N64) obj;
                    if (n64.A09) {
                        obj = ChannelDiscoveryViewModel.A00(n64);
                    }
                }
                A0r.add(obj);
            }
            A08.Epw(A0r);
        }
        C71140Odl A002 = OPT.A00(AnonymousClass7TE.A0l(r6));
        0Aj A003 = C71140Odl.A00(A002);
        if (A003.isSampled()) {
            C71140Odl.A04(A003, A002);
            DbS.A1I(A003, "all_channel_invites_sheet_rendered");
            DbS.A1M(A003, "inbox_directory_sheet");
            Dba.A1B(A003, "source", "see_all_button");
            C66580MXl.A1H(A003, A002.A00);
            A003.Cgf();
        }
    }

    public final void DIs() {
        NVN nvn = this.A00;
        AnonymousClass0eM r4 = nvn.A05;
        C331127Pr A0W = DbS.A0W(AnonymousClass7TE.A0l(r4));
        A0W.A17 = true;
        A0W.A00().A02(nvn.requireActivity(), C69913NuF.A00(AnonymousClass7TE.A0l(r4), 0));
    }
}
