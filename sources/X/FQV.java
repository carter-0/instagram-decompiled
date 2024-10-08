package X;

import android.widget.RadioGroup;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.IceBreakerMessageIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.api.schemas.UserCallSettings;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class FQV implements RadioGroup.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FQV(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        String str;
        String str2;
        0wc A0P;
        String str3;
        switch (this.A00) {
            case 0:
                C15366UbJ ubJ = (C15366UbJ) this.A02;
                ubJ.A00 = i;
                C52673Gal gal = ubJ.A06;
                IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = ubJ.A01;
                OnFeedMessagesIntf onFeedMessagesIntf = ubJ.A02;
                if (gal != null && iGCTMessagingAdsInfoDict != null && onFeedMessagesIntf != null) {
                    String str4 = "-1";
                    String str5 = ubJ.A09;
                    if (i == Integer.MAX_VALUE) {
                        if (str5 != null) {
                            str4 = str5;
                        }
                        gal.A07(str4, C16947VBz.A00(iGCTMessagingAdsInfoDict), AnonymousClass3ZN.A00(onFeedMessagesIntf));
                        return;
                    }
                    if (str5 == null) {
                        str5 = str4;
                    }
                    long A002 = C16947VBz.A00(iGCTMessagingAdsInfoDict);
                    int i2 = ubJ.A00;
                    gal.A08(str5, ((IceBreakerMessageIntf) ((List) this.A01).get(i2)).BSH(), AnonymousClass3ZN.A00(onFeedMessagesIntf), A002, (long) i2);
                    return;
                }
                return;
            case 1:
                2YL A0H = DbS.A0H(((ES9) this.A02).A07);
                String str6 = ((C70953OTa) ((List) this.A01).get(i)).A02;
                0qQ.A07(str6);
                DbX.A1W(A0H, str6, C318116oQ.A00(A0H), 26);
                return;
            case 2:
                ESH esh = (ESH) this.A02;
                String str7 = ((C70953OTa) ((List) this.A01).get(i)).A02;
                esh.A03 = str7;
                if (str7 == null) {
                    str2 = "selectedAudienceId";
                } else {
                    if (str7.equals(EWN.CLOSE_FRIENDS.A01)) {
                        str = "selected_close_friends";
                    } else if (str7.equals(EWN.RECIPROCAL_FOLLOWS.A01)) {
                        str = "selected_reciprocal_follows";
                    } else {
                        str = "selected_off";
                    }
                    C3726091o r1 = esh.A01;
                    if (r1 == null) {
                        str2 = "birthdayLogger";
                    } else {
                        AnonymousClass0eM r0 = esh.A04;
                        r1.A02("caa", "visibility", str, Dbb.A08(r0), Dbb.A08(r0));
                        return;
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            default:
                String str8 = ((C70953OTa) ((List) this.A01).get(i)).A02;
                C48034ERz eRz = (C48034ERz) this.A02;
                0qQ.A0A(str8);
                AnonymousClass0eM r2 = eRz.A02;
                UserSession A0l = AnonymousClass7TE.A0l(r2);
                AnonymousClass7TG.A1N(A0l, str8);
                1NY A0a = AnonymousClass7TG.A0a(A0l);
                A0a.A0A("video_call/change_user_call_settings/");
                DbX.A1M(A0a, "setting_type", str8);
                1ES.A03(A0a.A0M());
                if (0qQ.A0K(str8, UserCallSettings.PEOPLE_YOU_FOLLOW.A00)) {
                    A0P = DbX.A0P(eRz, r2);
                    str3 = "call_settings_turn_on_tapped";
                } else if (0qQ.A0K(str8, UserCallSettings.OFF.A00)) {
                    A0P = DbX.A0P(eRz, r2);
                    str3 = "call_settings_turn_off_tapped";
                } else {
                    return;
                }
                Dba.A1I(A0P, str3);
                return;
        }
    }
}
