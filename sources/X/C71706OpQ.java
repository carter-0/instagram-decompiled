package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.notificationengineinstagramintegrator.mca.MailboxNotificationEngineInstagramIntegratorJNI;

/* renamed from: X.OpQ  reason: case insensitive filesystem */
public final class C71706OpQ implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ NAR A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;
    public final /* synthetic */ boolean A0J;
    public final /* synthetic */ boolean A0K;

    public C71706OpQ(MailboxFutureImpl mailboxFutureImpl, NAR nar, Number number, Number number2, Number number3, Number number4, Number number5, Number number6, Number number7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = nar;
        this.A00 = mailboxFutureImpl;
        this.A0A = str;
        this.A0F = str2;
        this.A08 = number;
        this.A0B = str3;
        this.A03 = number2;
        this.A0G = str4;
        this.A07 = number3;
        this.A06 = number4;
        this.A0E = str5;
        this.A0C = str6;
        this.A0D = str7;
        this.A04 = number5;
        this.A09 = str8;
        this.A05 = number6;
        this.A02 = number7;
        this.A0H = z;
        this.A0K = z2;
        this.A0I = z3;
        this.A0J = z4;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(NAR.A00, 0);
        NotificationScope A012 = C71734Opu.A01(C66580MXl.A0H(accountSession), this, A0u, 36);
        this.A00.setNotification(A0u, A012);
        String str = this.A0A;
        String str2 = this.A0F;
        Number number = this.A08;
        String str3 = this.A0B;
        Number number2 = this.A03;
        String str4 = this.A0G;
        Number number3 = this.A07;
        Number number4 = this.A06;
        String str5 = this.A0E;
        String str6 = this.A0C;
        String str7 = this.A0D;
        String str8 = str4;
        Number number5 = number3;
        Number number6 = number4;
        String str9 = str5;
        String str10 = str6;
        String str11 = str7;
        String str12 = str;
        String str13 = str2;
        MailboxNotificationEngineInstagramIntegratorJNI.dispatchVOOOOOOOOOOOOOOOOOOZZZZ(0, accountSession, str12, str13, number, str3, number2, str8, number5, number6, str9, str10, str11, this.A04, this.A09, (Object) null, this.A05, this.A02, A012, this.A0H, this.A0K, this.A0I, this.A0J);
    }
}
