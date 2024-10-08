package X;

import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.EBn  reason: case insensitive filesystem */
public final class C47653EBn extends 1P0 {
    public final /* synthetic */ SupportLinksFragment A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C47653EBn(SupportLinksFragment supportLinksFragment, String str, String str2) {
        this.A00 = supportLinksFragment;
        this.A02 = str;
        this.A01 = str2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        SupportServiceEditUrlFragment A06;
        int A03 = AnonymousClass0fD.A03(384152553);
        C47334Dv1 dv1 = (C47334Dv1) obj;
        int A032 = AnonymousClass0fD.A03(353099871);
        C47653EBn.super.onSuccess(dv1);
        ExP exP = (ExP) dv1.A00.get(0);
        SupportLinksFragment supportLinksFragment = this.A00;
        C49935FFo fFo = supportLinksFragment.A01;
        String str = this.A02;
        0Aj A002 = C49935FFo.A00(fFo);
        DbS.A1H(A002, "fetch_partners");
        C49935FFo.A02(A002, fFo, RealtimeConstants.SEND_SUCCESS, false);
        A002.AAJ("service_type", str);
        A002.Cgf();
        C309516Yo A0H = Dbb.A0H(supportLinksFragment);
        String str2 = this.A01;
        C49730F3v A0R = DbU.A0R();
        String str3 = supportLinksFragment.A04;
        String str4 = exP.A00;
        String str5 = exP.A01;
        String A033 = C324066yY.A03(exP);
        String str6 = supportLinksFragment.A03;
        if (str2 != null) {
            A06 = A0R.A07(str3, str4, str5, A033, (String) null, str6, str2);
        } else {
            A06 = A0R.A06(SMBPartnerType.DONATION, str3, str4, str5, A033, (String) null, str6);
        }
        A0H.A0E(A06);
        A0H.A0A = SupportLinksFragment.A06;
        A0H.A04();
        AnonymousClass0fD.A0A(-1345047269, A032);
        AnonymousClass0fD.A0A(-1639540284, A03);
    }

    public final void onFail(C268654dm r8) {
        int A03 = AnonymousClass0fD.A03(909322792);
        C47653EBn.super.onFail(r8);
        SupportLinksFragment supportLinksFragment = this.A00;
        C59689JTv.A05(supportLinksFragment.getContext());
        String A0b = Dbb.A0b(r8);
        C49935FFo fFo = supportLinksFragment.A01;
        String str = this.A02;
        0Aj A002 = C49935FFo.A00(fFo);
        DbS.A1H(A002, "fetch_partners");
        C49935FFo.A02(A002, fFo, "error", false);
        A002.AAJ("service_type", str);
        A002.AAJ("error_message", A0b);
        A002.Cgf();
        AnonymousClass0fD.A0A(-786544269, A03);
    }
}
