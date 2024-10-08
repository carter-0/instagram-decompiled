package X;

import com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.List;
import java.util.Set;

/* renamed from: X.63s  reason: invalid class name and case insensitive filesystem */
public final class C3025463s implements MailboxCallback {
    public final /* synthetic */ AnonymousClass632 A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ String A0J;
    public final /* synthetic */ String A0K;
    public final /* synthetic */ String A0L;
    public final /* synthetic */ List A0M;
    public final /* synthetic */ Set A0N;
    public final /* synthetic */ boolean A0O;
    public final /* synthetic */ boolean A0P;
    public final /* synthetic */ boolean A0Q;
    public final /* synthetic */ boolean A0R;
    public final /* synthetic */ boolean A0S;
    public final /* synthetic */ boolean A0T;
    public final /* synthetic */ boolean A0U;

    public C3025463s(AnonymousClass632 r2, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, Number number3, Number number4, Number number5, Number number6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A00 = r2;
        this.A01 = mailboxFutureImpl;
        this.A0M = list;
        this.A06 = number;
        this.A0I = str;
        this.A0C = str2;
        this.A0E = str3;
        this.A0B = str4;
        this.A0K = str5;
        this.A0G = str6;
        this.A0H = str7;
        this.A04 = number2;
        this.A08 = str8;
        this.A0D = str9;
        this.A0J = str10;
        this.A09 = str11;
        this.A02 = number3;
        this.A0L = str12;
        this.A0N = set;
        this.A03 = number4;
        this.A0A = str13;
        this.A07 = number5;
        this.A0F = str14;
        this.A05 = number6;
        this.A0P = z;
        this.A0O = z2;
        this.A0Q = z3;
        this.A0R = z4;
        this.A0S = z5;
        this.A0U = z6;
        this.A0T = z7;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String str = (String) AnonymousClass632.A00.A00(11);
        NotificationScope EBU = accountSession.getSessionedNotificationCenterCallbackManager().EBU(new AnonymousClass63u(this), str, 1);
        this.A01.setNotification(str, EBU);
        List list = this.A0M;
        Number number = this.A06;
        String str2 = this.A0I;
        String str3 = this.A0C;
        String str4 = this.A0E;
        AccountSession accountSession2 = accountSession;
        NotificationScope notificationScope = EBU;
        List list2 = list;
        Number number2 = number;
        String str5 = str2;
        String str6 = str3;
        String str7 = str4;
        MailboxAdvancedCryptoTransportJNI.dispatchVOOOOOOOOOOOOOOOOOOOOOOOOOOOOZZZZZZZZZZZZZZZ(0, accountSession2, notificationScope, list2, "567067343352427", number2, "PROD", str5, str6, str7, this.A0B, this.A0K, this.A0G, this.A0H, this.A04, this.A08, (Object) null, this.A0D, this.A0J, (Object) null, this.A09, this.A02, this.A0L, this.A0N, this.A03, this.A0A, this.A07, this.A0F, this.A05, false, this.A0P, this.A0O, true, false, false, this.A0Q, this.A0R, this.A0S, false, false, true, this.A0U, this.A0T, false);
    }
}
