package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;

public final class AMF implements View.OnClickListener {
    public final /* synthetic */ WBO A00;

    public AMF(WBO wbo) {
        this.A00 = wbo;
    }

    public final void onClick(View view) {
        UserSession userSession;
        C274674os Bwz;
        SMBPartnerType sMBPartnerType;
        Bundle A0a;
        Class<ModalActivity> cls;
        String A002;
        int A05 = AnonymousClass0fD.A05(-1223349489);
        WBO wbo = this.A00;
        Object A003 = 0mE.A00(wbo.A0N, Activity.class);
        if (A003 != null) {
            Activity activity = (Activity) A003;
            Integer num = wbo.A0G;
            Integer num2 = AnonymousClass05K.A00;
            if (num == num2) {
                0eE r0 = AnonymousClass0t1.A01;
                userSession = wbo.A0Q;
                Bwz = r0.A01(userSession).A03.Bx2();
                sMBPartnerType = SMBPartnerType.GIFT_CARD;
            } else {
                if (num == AnonymousClass05K.A01) {
                    0eE r02 = AnonymousClass0t1.A01;
                    userSession = wbo.A0Q;
                    Bwz = r02.A01(userSession).A03.Bwz();
                    sMBPartnerType = SMBPartnerType.FOOD_DELIVERY;
                }
                AnonymousClass0fD.A0C(1710375274, A05);
                return;
            }
            if (Bwz != null) {
                if (ActionButtonPartnerType.FBE == Bwz.Bap()) {
                    HashMap A1E = AnonymousClass7TE.A1E();
                    A1E.put("entrypoint", "sticker");
                    A1E.put(AnonymousClass000.A00(1252), SMBPartnerType.FOOD_DELIVERY.toString());
                    C46649DiU A04 = C46649DiU.A04(AnonymousClass000.A00(2878), A1E);
                    IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
                    cls = ModalActivity.class;
                    0qQ.A0A(A04);
                    A0a = C49891FBs.A00(igBloksScreenConfig, A04);
                    A002 = "bloks";
                } else {
                    A0a = AnonymousClass7TE.A0a();
                    A0a.putSerializable(C273654mx.A00(1492), sMBPartnerType);
                    A0a.putString("APP_ID", Bwz.Ac5());
                    A0a.putString(C273654mx.A00(1325), Bwz.Bao());
                    A0a.putString(C273654mx.A00(1328), Bwz.getUrl());
                    A0a.putString(C273654mx.A00(1191), Bwz.getUrl());
                    cls = ModalActivity.class;
                    A002 = C273654mx.A00(3354);
                }
                new AnonymousClass6W8(activity, A0a, userSession, cls, A002).A0C(activity);
                AnonymousClass8ME r5 = wbo.A0R;
                Integer num3 = wbo.A0G;
                num3.getClass();
                if (num3 == num2) {
                    r5.A0a = true;
                } else if (num3 == AnonymousClass05K.A01) {
                    r5.A0Y = true;
                } else if (num3 == AnonymousClass05K.A0C) {
                    r5.A0Z = true;
                }
            }
            AnonymousClass0fD.A0C(1710375274, A05);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0C(-1192351542, A05);
        throw A0y;
    }
}
