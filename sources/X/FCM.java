package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.android.R;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.monetization.api.MonetizationApi;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.react.modules.base.IgReactQEModule;

public abstract class FCM {
    public static final EWH A00(UserMonetizationProductType userMonetizationProductType, boolean z) {
        switch (DbU.A02(userMonetizationProductType, 0)) {
            case 1:
                return EWH.IAC;
            case 2:
            case 10:
                return EWH.IGT;
            case 3:
                throw AnonymousClass7TE.A1B(AnonymousClass7TG.A0m(userMonetizationProductType, "no payout subtype for product ", AnonymousClass7TE.A1A()));
            case 4:
                return EWH.IBB;
            case 5:
                return EWH.IBC;
            case 7:
                return EWH.GTI;
            case 9:
                return EWH.ISI;
            case 11:
                if (z) {
                    return EWH.ITB;
                }
                return EWH.IGF;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return EWH.IGS;
            case 13:
                return EWH.IOO;
            case 15:
                return EWH.LVI;
            default:
                throw AnonymousClass7TE.A1B(AnonymousClass7TG.A0m(userMonetizationProductType, "no payout subtype for product ", AnonymousClass7TE.A1A()));
        }
    }

    public static final void A02(EXJ exj, MonetizationRepository monetizationRepository, 0sK r9) {
        1a8 A00 = 1a8.A00();
        MonetizationApi monetizationApi = monetizationRepository.A08;
        2IS A04 = C41845B3m.A04();
        DbW.A18(C41845B3m.A03(GraphQlCallInput.A02, true, "fe_is_linked_to_taskless"), A04, "input");
        C239113Fa r2 = new C239113Fa(A04, C47110Dqm.class, "IGPayoutGetFinancialEntityError", false);
        C239123Fb A01 = C46479Dfi.A01(monetizationApi.A00);
        A01.A08(r2);
        A01.A08 = AnonymousClass000.A00(65);
        A00.A02(C69818Nsf.A00(A01.A06()), new C51137Fp9(2, exj, r9));
    }

    public static final void A01(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.instagram_bank_pano_outline_24);
        C310336ap A0W = DbV.A0W();
        DbS.A19(context, A0W, 2131969249);
        if (drawable != null) {
            A0W.A02();
            A0W.A08(drawable, context.getColor(2Yu.A05(context)));
        }
        Dbb.A1Q(A0W);
    }
}
