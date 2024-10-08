package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;

public final class WA8 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public WA8(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A04 = obj5;
        this.A01 = obj;
        this.A05 = obj3;
        this.A02 = obj2;
        this.A03 = obj4;
    }

    public final void onClick(View view) {
        int A052;
        XIGIGBoostDestination xIGIGBoostDestination;
        int i;
        String str;
        X9V x9v;
        switch (this.A00) {
            case 0:
                AnonymousClass0fD.A05(-612774973);
                0qQ.A0F("instance");
                throw AnonymousClass00P.createAndThrow();
            case 1:
                A052 = AnonymousClass0fD.A05(1538765800);
                PromoteData promoteData = (PromoteData) this.A03;
                UserSession userSession = (UserSession) this.A05;
                W3T.A03(promoteData);
                U5O u5o = (U5O) this.A02;
                if (u5o.isChecked() || promoteData.A2B || 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36326489792198436L)) {
                    PromoteState promoteState = (PromoteState) this.A04;
                    if (PromoteState.A03(promoteData)) {
                        xIGIGBoostDestination = promoteData.A0i;
                        if (xIGIGBoostDestination == null) {
                            IllegalStateException A0y = AnonymousClass7TE.A0y();
                            AnonymousClass0fD.A0C(-1698894405, A052);
                            throw A0y;
                        }
                    } else if (!promoteData.A1p.contains(XIGIGBoostDestination.WHATSAPP_MESSAGE) || !AnonymousClass9F0.A04(promoteData) || promoteState.A07 || 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36326489792198436L)) {
                        if (!promoteState.A07) {
                            xIGIGBoostDestination = XIGIGBoostDestination.DIRECT_MESSAGE;
                        }
                        u5o.setChecked(true);
                        i = -139976435;
                        break;
                    } else {
                        u5o.setChecked(false);
                    }
                    promoteState.A05(xIGIGBoostDestination, promoteData);
                    u5o.setChecked(true);
                    i = -139976435;
                } else {
                    promoteData.A2B = true;
                }
                promoteData.A2m = false;
                C13990Tnq.A0h();
                DbY.A14(new C15274UZc(), (FragmentActivity) this.A01, promoteData.A0y);
                i = -139976435;
                break;
            case 2:
                A052 = AnonymousClass0fD.A05(1956572040);
                if (((C17997VjZ) this.A03).A01()) {
                    UE4 ue4 = (UE4) this.A02;
                    int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                    String str2 = ue4.A01;
                    if (str2.equals("v2") || str2.equals("v3")) {
                        ue4.A06.setEnabled(false);
                        W2c.A00 = true;
                    } else {
                        ue4.A02.setVisibility(8);
                    }
                    ((C230202p9) this.A01).DFo(this.A05, this.A04);
                }
                i = -1671706639;
                break;
            case 3:
                A052 = AnonymousClass0fD.A05(1649186461);
                String id = ((User) this.A04).getId();
                String moduleName = ((AnonymousClass0iw) this.A02).getModuleName();
                C17035VFj.A00((Activity) this.A01, ((C17727Vcw) this.A03).A01, (UserSession) this.A05, id, moduleName);
                i = -1826641451;
                break;
            default:
                A052 = AnonymousClass0fD.A05(1974889785);
                WSZ wsz = (WSZ) this.A04;
                Integer num = wsz.A00;
                switch (num.intValue()) {
                    case 1:
                    case 4:
                        X9V x9v2 = (X9V) this.A02;
                        if (x9v2 != null) {
                            x9v2.DdZ(wsz.A01);
                            break;
                        }
                        break;
                    case 2:
                        if (wsz.A04) {
                            wsz.A00 = AnonymousClass05K.A15;
                            ((C14899UEd) this.A05).A04((AnonymousClass0iw) this.A01, (G7P) this.A03, (X9V) this.A02, wsz);
                        }
                        X9V x9v3 = (X9V) this.A02;
                        if (x9v3 != null) {
                            x9v3.D0X(wsz.A01);
                            break;
                        }
                        break;
                    case 3:
                        break;
                    case 6:
                        if (wsz.A03 && (x9v = (X9V) this.A02) != null) {
                            x9v.Ct1(wsz.A01);
                            break;
                        }
                    case 7:
                        if (wsz.A03) {
                            if (wsz.A04) {
                                wsz.A00 = AnonymousClass05K.A0C;
                                ((C14899UEd) this.A05).A04((AnonymousClass0iw) this.A01, (G7P) this.A03, (X9V) this.A02, wsz);
                            }
                            X9V x9v4 = (X9V) this.A02;
                            if (x9v4 != null) {
                                x9v4.DLc(wsz.A01, C14899UEd.A00((AnonymousClass0iw) this.A01));
                                break;
                            }
                        }
                        break;
                    case 9:
                        X9V x9v5 = (X9V) this.A02;
                        if (x9v5 != null) {
                            User user = wsz.A01;
                            AnonymousClass0iw r2 = (AnonymousClass0iw) this.A01;
                            int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                            if (0qQ.A0K(r2.getModuleName(), AnonymousClass000.A00(2323))) {
                                str = AnonymousClass000.A00(5351);
                            } else if (0qQ.A0K(r2.getModuleName(), AnonymousClass000.A00(2322))) {
                                str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
                            } else {
                                str = "";
                            }
                            x9v5.Cu9(user, str);
                            break;
                        }
                        break;
                    default:
                        C13991Tnr.A1G(num, "Illegal participant role: ");
                        break;
                }
                i = 1631678387;
                break;
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}
