package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;

/* renamed from: X.5yO  reason: invalid class name and case insensitive filesystem */
public final class C301055yO {
    public static final C301055yO A02;
    public static final C301055yO A03;
    public static final C301055yO A04;
    public static final C301055yO A05;
    public static final C301055yO A06;
    public static final C301055yO A07;
    public static final C301055yO A08;
    public static final C301055yO A09;
    public static final C301055yO A0A;
    public final Integer A00;
    public final Integer A01;

    static {
        Integer num = AnonymousClass05K.A0j;
        Integer num2 = AnonymousClass05K.A00;
        A09 = new C301055yO(num, num2);
        Integer num3 = AnonymousClass05K.A01;
        A07 = new C301055yO(num, num3);
        Integer num4 = AnonymousClass05K.A0C;
        A08 = new C301055yO(num, num4);
        Integer num5 = AnonymousClass05K.A0Y;
        Integer num6 = AnonymousClass05K.A0N;
        A06 = new C301055yO(num5, num6);
        A05 = new C301055yO(num2, num6);
        A0A = new C301055yO(num6, num6);
        A02 = new C301055yO(num3, num6);
        A04 = new C301055yO(AnonymousClass05K.A0u, num6);
        A03 = new C301055yO(num4, num6);
    }

    public final String toString() {
        String str;
        String str2;
        switch (this.A00.intValue()) {
            case 0:
                str = "ALREADY_LOGGED_IN";
                break;
            case 1:
                str = "INVALID";
                break;
            case 2:
                str = "MAILBOX_INVALID";
                break;
            case 3:
                str = "USING_MEM_LOGIN";
                break;
            case 4:
                str = "PREVIOUSLY_REGISTERED";
                break;
            case 5:
                str = "NEW_REGISTRATION_HAPPENED";
                break;
            default:
                str = MessageAvailabilityResponseId$Companion.NOT_SUPPORTED;
                break;
        }
        switch (this.A01.intValue()) {
            case 0:
                str2 = "SUCCESS";
                break;
            case 1:
                str2 = "FAILURE";
                break;
            case 2:
                str2 = MessageAvailabilityResponseId$Companion.NOT_AVAILABLE;
                break;
            default:
                str2 = "NOT_APPLICABLE";
                break;
        }
        return 002.A0u("loginType=", str, " registrationResult=", str2);
    }

    public C301055yO(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }
}
