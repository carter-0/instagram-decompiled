package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;

public final class PQ2 implements C74430Puk {
    public DirectMessageInteropReachabilityOptions A00;
    public DirectMessagesInteropOptionsViewModel A01;
    public C69185Ngf A02;
    public C70962OTj A03;
    public boolean A04;
    public final Context A05;
    public final C71109Ocn A06;
    public final C72197OyI A07;
    public final 16V A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final DirectMessageInteropReachabilityOptions[] A0E;
    public final OR9 A0F;

    public PQ2(Context context, Bundle bundle, C71109Ocn ocn, OR9 or9, C72197OyI oyI, 16V r11, boolean z, boolean z2) {
        0qQ.A0B(oyI, 2);
        this.A05 = context;
        this.A07 = oyI;
        this.A0F = or9;
        this.A06 = ocn;
        this.A08 = r11;
        this.A0C = z;
        this.A0D = z2;
        this.A09 = DbT.A0w(bundle, "DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_DESCRIPTION", "");
        DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr = (DirectMessageInteropReachabilityOptions[]) bundle.getParcelableArray("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_OPTIONS");
        if (directMessageInteropReachabilityOptionsArr != null) {
            this.A0E = directMessageInteropReachabilityOptionsArr;
            String A0w = DbT.A0w(bundle, "DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_OPTION_NAME", "");
            this.A0A = A0w;
            this.A0B = bundle.getBoolean("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_ADD_HEADER_AND_FOOTER");
            this.A01 = (DirectMessagesInteropOptionsViewModel) C320236s2.A00(bundle, DirectMessagesInteropOptionsViewModel.class, "DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_VIEW_MODEL");
            0Aj A0e = AnonymousClass7TE.A0e(ocn.A00, "ig_interop_reachability_setting_client_interaction");
            if (A0e.isSampled()) {
                A0e.AAJ("setting_name", C71109Ocn.A01(A0w));
                AnonymousClass7TE.A1W(A0e, "interaction_type", 0);
                A0e.A9H("extra_data_map", AnonymousClass7TF.A0w("account_type", r11.A01));
                DbV.A1J(A0e, ocn.A01);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0z("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_OPTIONS can't be null, please add DirectMessageInteropReachabilityOptions");
    }

    public final void FKM(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, NHB nhb, String str) {
        C70657OFe oFe;
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel3 = directMessagesInteropOptionsViewModel2;
        0qQ.A0B(directMessagesInteropOptionsViewModel3, 2);
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel4 = directMessagesInteropOptionsViewModel;
        if (directMessagesInteropOptionsViewModel != null) {
            C71109Ocn ocn = this.A06;
            String str2 = this.A0A;
            16V r13 = this.A08;
            boolean z = this.A0C;
            boolean z2 = this.A0D;
            ocn.A06(directMessagesInteropOptionsViewModel4, directMessagesInteropOptionsViewModel3, r13, str2, z, z2, false);
            NHB nhb2 = nhb;
            if (!(nhb == null || (oFe = nhb2.A01) == null || oFe.A03 == null || oFe.A02 == null || oFe.A01 == null || oFe.A00 == null || nhb2.A00 == null)) {
                0qQ.A0B(str2, 0);
                C71109Ocn.A03(ocn, directMessagesInteropOptionsViewModel4, directMessagesInteropOptionsViewModel3, r13, str2, z, z2, false);
                C70657OFe oFe2 = nhb2.A01;
                if (oFe2 != null) {
                    Context context = this.A05;
                    String str3 = (String) C66801Mcn.A00(oFe2.A03, "", "warning_title");
                    String str4 = (String) C66801Mcn.A00(oFe2.A02, "", "warning_message");
                    String str5 = (String) C66801Mcn.A00(oFe2.A01, "", "warning_confirm_button");
                    String str6 = (String) C66801Mcn.A00(oFe2.A00, "", "warning_cancel_button");
                    NHW nhw = nhb2.A00;
                    if (nhw != null) {
                        PQ1 pq1 = new PQ1(directMessagesInteropOptionsViewModel4, this);
                        C51974G9v.A1P(str3, str4, str5, str6);
                        C358248ab A0g = DbX.A0g(context, str4, str3);
                        A0g.A0c(new C71183Of1(29, pq1, nhw), str5);
                        A0g.A0b(new C71182Oey(pq1, 8), str6);
                        A0g.A0B(new C71173Oen(pq1, 3));
                        DbT.A1V(A0g);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        OR9.A00(this.A05);
        A00(this);
    }

    public final void FLk(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, String str) {
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel3 = directMessagesInteropOptionsViewModel;
        0qQ.A0B(directMessagesInteropOptionsViewModel, 1);
        this.A01 = directMessagesInteropOptionsViewModel;
        String str2 = this.A0A;
        this.A00 = directMessagesInteropOptionsViewModel.A00(str2);
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel4 = directMessagesInteropOptionsViewModel2;
        if (directMessagesInteropOptionsViewModel2 != null) {
            this.A06.A06(directMessagesInteropOptionsViewModel4, directMessagesInteropOptionsViewModel3, this.A08, str2, this.A0C, this.A0D, true);
        }
        C70962OTj oTj = this.A03;
        if (oTj != null) {
            oTj.A03 = true;
        }
        C69185Ngf ngf = this.A02;
        if (ngf != null) {
            ngf.A07();
        }
    }

    public static final void A00(PQ2 pq2) {
        String str;
        C70962OTj oTj;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = pq2.A00;
        if (!(directMessageInteropReachabilityOptions == null || (str = directMessageInteropReachabilityOptions.A03) == null || pq2.A02 == null || (oTj = pq2.A03) == null)) {
            oTj.A00 = str;
        }
        C70962OTj oTj2 = pq2.A03;
        if (oTj2 != null) {
            oTj2.A03 = true;
        }
        C69185Ngf ngf = pq2.A02;
        if (ngf != null) {
            ngf.A07();
        }
    }
}
