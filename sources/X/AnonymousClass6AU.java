package X;

import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;

/* renamed from: X.6AU  reason: invalid class name */
public final class AnonymousClass6AU {
    public final long A00;
    public final AnonymousClass1aS A01;
    public final AnonymousClass1aS A02 = 1aF.A00();
    public final 1a8 A03;
    public final UserSession A04;
    public final AnonymousClass6AQ A05;
    public final 2I1 A06;
    public final IGFOAMessagingReadyLogger A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public AnonymousClass6AU(1aU r7, 1a8 r8, UserSession userSession, AnonymousClass68G r10, AnonymousClass6AT r11, AnonymousClass6AQ r12, 2I1 r13, IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger, String str, String str2, String str3, String str4, long j) {
        0qQ.A0B(r13, 1);
        0qQ.A0B(r7, 4);
        String str5 = str4;
        0qQ.A0B(str5, 13);
        this.A06 = r13;
        this.A07 = iGFOAMessagingReadyLogger;
        this.A03 = r8;
        this.A09 = str;
        this.A05 = r12;
        this.A0B = str2;
        this.A00 = j;
        this.A0A = str3;
        this.A04 = userSession;
        this.A08 = str5;
        AnonymousClass1aS A002 = 1aF.A00();
        this.A01 = A002;
        r8.A02(r7, new AnonymousClass6AV(r10, r11, this));
        r8.A02(A002, new C303706Al(this));
        Integer[] numArr = r12.A0I;
        r8.A02(r7.A0E(), new C303726An(r7, this, numArr));
        numArr[1] = 1;
        numArr[2] = 1;
        numArr[3] = 1;
        numArr[4] = 1;
    }
}
