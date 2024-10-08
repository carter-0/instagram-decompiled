package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.avatar.expresso.odr.ODRController;
import com.facebook.browser.lite.extensions.autofill.base.actionhandler.vault.VaultActionHandler;
import com.fbpay.w3c.CardDetails;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import com.instagram.repository.common.IgBaseRepository;
import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;
import com.meta.vault.service.base.DefaultVaultService;
import java.util.Map;
import java.util.Set;

/* renamed from: X.MDt  reason: case insensitive filesystem */
public final class C66141MDt extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public final int A09;
    public final Object A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66141MDt(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A09 = i;
        this.A0A = obj;
    }

    public static void A00(Object obj, Object obj2, Object obj3, Object obj4, C66141MDt mDt) {
        mDt.A01 = obj;
        mDt.A02 = obj2;
        mDt.A03 = obj3;
        mDt.A04 = obj4;
    }

    public static void A01(Object obj, C66141MDt mDt) {
        mDt.A08 = obj;
        mDt.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof C66141MDt) || ((C66141MDt) obj).A09 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.MDt, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A09;
        A01(obj, this);
        switch (i) {
            case 0:
                return ODRController.A08((ODRController) this.A0A, (Map) null, this);
            case 1:
                return ((ODRController) this.A0A).A0B((String) null, this);
            case 2:
                return ((ODRController) this.A0A).A09((C64122LOq) null, this, (C262224Cq) null);
            case 3:
                return ((VaultActionHandler) this.A0A).A00((Bundle) null, (FragmentActivity) null, (AnonymousClass07Z) null, (S0E) null, (C270254gR) null, (CardDetails) null, (S33) null, (DefaultVaultService) null, this);
            case 4:
                return FanClubConsiderationViewModel.A04((Context) null, (FanClubConsiderationViewModel) this.A0A, (String) null, (Set) null, this);
            case 5:
                return IgBaseRepository.A00((IgBaseRepository) this.A0A, (C324516zR) null, (C66457MSl) null, this);
            case 6:
                return ((LimitsPlusRepository) this.A0A).A02(this);
            default:
                return I7H.A02((Context) null, (C53452Gok) null, (UserSession) null, (I7H) this.A0A, this);
        }
    }
}
