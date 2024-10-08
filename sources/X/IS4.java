package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.SpannedString;
import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import java.util.List;

public final class IS4 implements AnonymousClass3YT {
    public final CharSequence C4o(Context context, UserSession userSession, 1Xj r10, AnonymousClass3W1 r11) {
        FundraiserCampaignTypeEnum B8e;
        Resources resources;
        int i;
        String[] strArr;
        String fundraiserTitle;
        0qQ.A0B(context, 0);
        0qQ.A0B(r10, 1);
        C65231bS B8b = r10.A0C.B8b();
        if (!(B8b == null || (B8e = B8b.B8e()) == null)) {
            int ordinal = B8e.ordinal();
            if (ordinal == 11) {
                resources = context.getResources();
                i = 2131962331;
                if (AnonymousClass7TF.A1Y(B8b.BvT(), true)) {
                    i = 2131962380;
                }
                strArr = new String[1];
                fundraiserTitle = B8b.getFundraiserTitle();
            } else if (ordinal == 9) {
                resources = context.getResources();
                i = 2131962314;
                strArr = new String[1];
                fundraiserTitle = B8b.getBeneficiaryName();
            }
            strArr[0] = fundraiserTitle;
            Spanned A01 = 0bC.A01(resources, strArr, i);
            0qQ.A0A(A01);
            return A01;
        }
        return new SpannedString("");
    }

    public final boolean Et3(1Xj r2, AnonymousClass3W1 r3, int i) {
        return true;
    }

    public final /* synthetic */ Integer BEK() {
        return null;
    }

    public final /* synthetic */ boolean EtS() {
        return false;
    }

    public final /* synthetic */ List Bqk(1Xj r2, AnonymousClass3W1 r3) {
        return null;
    }

    public final /* synthetic */ boolean Et2(UserSession userSession, 1Xj r3) {
        return false;
    }

    public final /* synthetic */ String BSq(Context context, 1Xj r3, AnonymousClass3W1 r4) {
        return null;
    }

    public final /* synthetic */ boolean Et1(UserSession userSession, 1Xj r3, AnonymousClass3W1 r4) {
        return false;
    }

    public final /* synthetic */ CharSequence Bqi(Context context, UserSession userSession, 1Xj r4, AnonymousClass4DU r5, AnonymousClass3W1 r6) {
        return null;
    }
}
