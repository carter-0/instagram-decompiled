package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.Op6  reason: case insensitive filesystem */
public final class C71687Op6 implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        NotificationScope notificationScope;
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        int i2;
        AccountSession accountSession = (AccountSession) obj;
        switch (this.A00) {
            case 0:
                String A0u = C66580MXl.A0u(NAY.A00, 39);
                notificationScope = C71734Opu.A01(C66580MXl.A0H(accountSession), this, A0u, 19);
                C66580MXl.A1N(notificationScope, this.A03, A0u);
                i = this.A01;
                obj4 = this.A04;
                obj3 = this.A05;
                obj2 = this.A06;
                i2 = 3;
                break;
            case 1:
                String A0u2 = C66580MXl.A0u(NAY.A00, 57);
                notificationScope = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u2, 28);
                C66580MXl.A1N(notificationScope, this.A03, A0u2);
                i = this.A01;
                obj4 = this.A05;
                obj3 = this.A06;
                obj2 = this.A04;
                i2 = 5;
                break;
            default:
                C3030067a.A04("MailboxInstagramReverb", "deleteSeenShhMessages", this.A01);
                String A0u3 = C66580MXl.A0u(NAZ.A00, 3);
                NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u3, 36);
                C66580MXl.A1N(A002, this.A04, A0u3);
                MailboxInstagramReverbJNI.dispatchVOOOOO(3, accountSession, this.A06, this.A05, this.A03, A002);
                return;
        }
        MailboxInstagramMemJNI.dispatchVIOOOOO(i2, i, accountSession, obj4, obj3, obj2, notificationScope);
    }

    public C71687Op6(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A01 = i;
        this.A04 = obj;
        this.A05 = obj2;
        this.A06 = str;
    }
}
