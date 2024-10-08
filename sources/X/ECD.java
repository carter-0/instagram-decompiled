package X;

import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class ECD extends 1P0 {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ ITV A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public ECD(AnonymousClass4DH r1, AnonymousClass0iw r2, UserSession userSession, 1Xj r4, ITV itv, String str, String str2) {
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = itv;
        this.A02 = userSession;
        this.A05 = str;
        this.A01 = r2;
        this.A06 = str2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1157505271);
        DvJ dvJ = (DvJ) obj;
        int A033 = AnonymousClass0fD.A03(691747689);
        0qQ.A0B(dvJ, 0);
        String str = dvJ.A00;
        Bundle A0a = AnonymousClass7TE.A0a();
        1Xj r11 = this.A03;
        UserSession userSession = this.A02;
        A0a.putString("android.intent.extra.TEXT", C46395DeI.A01(userSession, r11, str));
        C46395DeI.A0O(this.A00.requireActivity(), (Uri) null, A0a, this.A04, userSession, r11, (String) null, "share_to_system_sheet", str, AnonymousClass000.A00(1446), true, false);
        if (!182.A06(0Tu.A05, userSession, 36323942876589693L)) {
            String str2 = this.A05;
            C22031Xty.A0K(this.A01, userSession, str2, this.A06, "system_share_sheet", dvJ.A00, "system_share_sheet", DbT.A0x(r11), (String) null);
        }
        AnonymousClass0fD.A0A(-2045155246, A033);
        AnonymousClass0fD.A0A(-728103169, A032);
    }

    public final void onFail(C268654dm r9) {
        int A0D = AnonymousClass7TG.A0D(r9, 239691154);
        ECD.super.onFail(r9);
        C22031Xty.A0H(this.A01, this.A02, this.A05, this.A06, "system_share_sheet", r9.A01());
        AnonymousClass0fD.A0A(605234584, A0D);
    }
}
