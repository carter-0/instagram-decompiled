package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.Phl  reason: case insensitive filesystem */
public final class C73672Phl extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73672Phl(Object obj, String str, int i, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        String str2;
        switch (this.A00) {
            case 2:
                C68496NKp nKp = (C68496NKp) this.A01;
                boolean z = this.A03;
                String str3 = this.A02;
                C358248ab A0H = Dba.A0H(nKp);
                int i = 2131958879;
                if (z) {
                    i = 2131958885;
                }
                A0H.A09(i);
                A0H.A08(2131958880);
                A0H.A0L(new C50022FJh(nKp, str3, 3), 2131960643);
                A0H.A0C(new C50022FJh(nKp, str3, 4));
                AnonymousClass7TH.A0a(A0H, true);
                C66930MfP mfP = nKp.A02;
                if (mfP != null) {
                    String str4 = nKp.A0C;
                    if (str4 != null) {
                        DirectThreadKey directThreadKey = nKp.A08;
                        if (directThreadKey != null) {
                            String str5 = directThreadKey.A01;
                            int i2 = nKp.A00;
                            String str6 = nKp.A0D;
                            if (str6 != null) {
                                boolean z2 = nKp.A0H;
                                0eP A1L = AnonymousClass7TE.A1L("user_type", str6);
                                if (z2) {
                                    str = "ACTIVE";
                                } else {
                                    str = "ENDED";
                                }
                                C66930MfP.A02(mfP, str4, str5, "delete_daily_prompt_response_dialog_rendered", "tap", "delete_button", "daily_prompt_responses_sheet", DbY.A0q("daily_prompt_submission_id", str3, A1L, AnonymousClass7TE.A1L("daily_prompt_status", str)), i2);
                                break;
                            } else {
                                str2 = "userType";
                            }
                        } else {
                            str2 = "threadKey";
                        }
                    } else {
                        str2 = "threadId";
                    }
                } else {
                    str2 = "dailyPromptsLogger";
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            case 3:
                boolean z3 = this.A03;
                C70808OMd oMd = (C70808OMd) this.A01;
                String str7 = this.A02;
                if (!z3) {
                    oMd.A00(str7, (List) null, 85, 0);
                    break;
                } else {
                    oMd.A00(str7, (List) null, 99, 0);
                    oMd.A00(str7, (List) null, 84, 0);
                    break;
                }
            case 4:
                C67573Mq7 mq7 = (C67573Mq7) this.A01;
                mq7.A01.flowAnnotate(mq7.A00, this.A02, this.A03);
                break;
            case 5:
                C310336ap A0X = DbV.A0X();
                String str8 = this.A02;
                if (str8 == null) {
                    str8 = AnonymousClass7TE.A16((Context) this.A01, 2131953303);
                }
                A0X.A0D = str8;
                A0X.A0J = true;
                if (this.A03) {
                    A0X.A06();
                }
                Dbb.A1Q(A0X);
                break;
            case 6:
                UserSession userSession = (UserSession) this.A01;
                boolean z4 = this.A03;
                C367288qV.A0A(userSession, this.A02, z4, false);
                AnonymousClass1Nd.A00(userSession).A05(new C50275FWg(AnonymousClass05K.A01, z4, false));
                break;
            case 7:
                String str9 = this.A02;
                C64141LQd.A01((C64141LQd) this.A01, str9, new C74187PqT(str9, this.A03, 5));
                break;
            case 8:
                C73672Phl.super.A0w(this.A02, this.A03);
                break;
            case 9:
                C73672Phl.super.CiA(this.A02, this.A03);
                break;
            case 10:
                C73672Phl.super.CiB(this.A02, this.A03);
                break;
            case 11:
                C73672Phl.super.CiC(this.A02, this.A03);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C73672Phl.super.Ciz(this.A02, this.A03);
                break;
            case 13:
                C73672Phl.super.Cj0(this.A02, this.A03);
                break;
            default:
                C73672Phl.super.Cj1(this.A02, this.A03);
                break;
        }
        return C60340gF.A00;
    }
}
