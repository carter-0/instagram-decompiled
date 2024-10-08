package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.AKf  reason: case insensitive filesystem */
public final class C39939AKf implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass8ME A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C39939AKf(AnonymousClass8ME r1, User user, String str, String str2) {
        this.A00 = r1;
        this.A03 = str;
        this.A01 = user;
        this.A02 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass8ME r2 = this.A00;
        UserSession userSession = r2.A0r;
        LTM.A03(r2.A0o, userSession, "STICKER_TRAY", this.A03);
        User user = this.A01;
        String str = this.A02;
        User A012 = AnonymousClass0t1.A01.A01(userSession);
        String B8Q = user.B8Q();
        AE3 ae3 = new AE3(A012.getUsername(), A012.Bh3().getUrl(), A012.isVerified());
        AE3 ae32 = new AE3(user.getUsername(), user.Bh3().getUrl(), user.isVerified());
        0Tu r3 = 0Tu.A06;
        int intValue = AnonymousClass7TF.A0Y(r3, userSession, 36599602467573339L).intValue();
        String A04 = 182.A04(r3, userSession, 36881077444346224L);
        String B8Q2 = user.B8Q();
        boolean A06 = 182.A06(r3, userSession, 36318127490996097L);
        List emptyList = Collections.emptyList();
        AnonymousClass8ME.A0Y(r2, new C3499082j(new NewFundraiserInfo((String) null, A04, B8Q2, "", AnonymousClass000.A00(1026), str, FundraiserCampaignTypeEnum.IG_STANDALONE_FOR_CHARITY.toString(), (String) null, emptyList, intValue, A06), ae32, ae3, (String) null, (String) null, "", (String) null, "", B8Q, 0));
    }
}
