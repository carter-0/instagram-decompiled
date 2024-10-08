package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.Wev  reason: case insensitive filesystem */
public final class C19754Wev implements X5E {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ PromoteData A01;
    public final /* synthetic */ PromoteState A02;
    public final /* synthetic */ U5O A03;
    public final /* synthetic */ U5O A04;
    public final /* synthetic */ UserSession A05;

    public C19754Wev(FragmentActivity fragmentActivity, PromoteData promoteData, PromoteState promoteState, U5O u5o, U5O u5o2, UserSession userSession) {
        this.A01 = promoteData;
        this.A05 = userSession;
        this.A04 = u5o;
        this.A00 = fragmentActivity;
        this.A02 = promoteState;
        this.A03 = u5o2;
    }

    public final void D1Z(IgRadioGroup igRadioGroup, int i) {
        XIGIGBoostDestination xIGIGBoostDestination;
        String str;
        if (i != -1) {
            PromoteData promoteData = this.A01;
            Object tag = igRadioGroup.findViewById(i).getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.api.schemas.XIGIGBoostDestination");
            if (tag == XIGIGBoostDestination.DIRECT_MESSAGE) {
                xIGIGBoostDestination = W3T.A00(promoteData);
            } else {
                Object tag2 = igRadioGroup.findViewById(i).getTag();
                0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.api.schemas.XIGIGBoostDestination");
                xIGIGBoostDestination = (XIGIGBoostDestination) tag2;
            }
            WGU A002 = WGU.A00(this.A05);
            C16678UzE uzE = C16678UzE.OBJECTIVE;
            switch (xIGIGBoostDestination.ordinal()) {
                case 1:
                    str = "destination_direct";
                    break;
                case 4:
                    str = "destination_leadgen";
                    break;
                case 5:
                    str = "destination_ctx";
                    break;
                case 7:
                    str = "destination_engagement";
                    break;
                case 8:
                    str = "destination_profile";
                    break;
                case 10:
                    str = "destination_website";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str = "destination_whatsapp";
                    break;
                default:
                    str = "null";
                    break;
            }
            A002.A0F(uzE, str);
            XIGIGBoostDestination xIGIGBoostDestination2 = XIGIGBoostDestination.WEBSITE_CLICK;
            if (xIGIGBoostDestination == xIGIGBoostDestination2) {
                String str2 = promoteData.A1I;
                XIGIGBoostCallToAction xIGIGBoostCallToAction = promoteData.A0b;
                if (promoteData.A2K) {
                    U5O u5o = this.A04;
                    FragmentActivity fragmentActivity = this.A00;
                    W3T.A01(fragmentActivity, promoteData, u5o);
                    String A032 = WGS.A00.A03(fragmentActivity, xIGIGBoostCallToAction, promoteData, u5o, str2);
                    if (A032 != null) {
                        u5o.setSecondaryText(A032);
                        if (xIGIGBoostCallToAction == null || str2 == null || str2.length() == 0) {
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else if (xIGIGBoostCallToAction == null || str2 == null || str2.length() == 0) {
                    this.A04.setChecked(false);
                    this.A02.A04((XIGIGBoostDestination) null, promoteData);
                    C13990Tnq.A0h();
                    C15273UZb uZb = new C15273UZb();
                    C309516Yo r0 = new C309516Yo(this.A00, promoteData.A0y);
                    r0.A0B((Bundle) null, uZb);
                    r0.A07();
                    return;
                } else {
                    U5O u5o2 = this.A04;
                    FragmentActivity fragmentActivity2 = this.A00;
                    W3T.A01(fragmentActivity2, promoteData, u5o2);
                    String A042 = WGS.A00.A04(fragmentActivity2, xIGIGBoostCallToAction, promoteData, u5o2, str2);
                    if (A042 != null) {
                        u5o2.setSecondaryText(A042);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                xIGIGBoostDestination2 = XIGIGBoostDestination.LEAD_GENERATION;
                if (xIGIGBoostDestination != xIGIGBoostDestination2) {
                    this.A02.A04(xIGIGBoostDestination, promoteData);
                    return;
                } else if (promoteData.A16 == null || promoteData.A0d == null) {
                    this.A03.setChecked(false);
                    this.A02.A04((XIGIGBoostDestination) null, promoteData);
                    FragmentActivity fragmentActivity3 = this.A00;
                    UserSession userSession = promoteData.A0y;
                    C309516Yo r1 = new C309516Yo(fragmentActivity3, userSession);
                    C18079Vl8 A0N = C13990Tnq.A0N();
                    0qQ.A06(userSession);
                    r1.A0B((Bundle) null, A0N.A05(false));
                    r1.A0A = C16678UzE.MANAGE_LEAD_ADS.toString();
                    r1.A04();
                    return;
                }
            }
            this.A02.A04(xIGIGBoostDestination2, promoteData);
        }
    }
}
