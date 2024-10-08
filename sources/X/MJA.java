package X;

import com.instagram.common.session.UserSession;

public final class MJA extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ 0sL A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJA(UserSession userSession, String str, String str2, 0sL r5, int i) {
        super(0);
        this.A00 = i;
        this.A01 = userSession;
        this.A02 = str;
        this.A04 = r5;
        this.A03 = str2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Integer num;
        String str;
        int i = this.A00;
        if (i == 0) {
            num = AnonymousClass05K.A0N;
        } else if (i != 1) {
            if (i == 2) {
                num = AnonymousClass05K.A0j;
            }
            return C60340gF.A00;
        } else {
            num = AnonymousClass05K.A0Y;
        }
        switch (num.intValue()) {
            case 3:
                str = "icebreaker_prompt_1";
                break;
            case 4:
                str = "icebreaker_prompt_2";
                break;
            default:
                str = "icebreaker_prompt_3";
                break;
        }
        UserSession userSession = this.A01;
        String str2 = this.A02;
        0sL r2 = this.A04;
        String str3 = this.A03;
        new LTH(userSession).A0C(str2, str);
        r2.invoke(str, str3);
        return C60340gF.A00;
    }
}
