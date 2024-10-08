package X;

import androidx.fragment.app.FragmentActivity;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import java.io.File;

/* renamed from: X.Pfl  reason: case insensitive filesystem */
public final class C73564Pfl extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 0;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73564Pfl(UserSession userSession, DirectAnimatedMedia directAnimatedMedia, AnonymousClass9HR r4, File file, String str, String str2, String str3, AnonymousClass4D7 r9) {
        super(2, r9);
        this.A07 = userSession;
        this.A06 = r4;
        this.A05 = file;
        this.A04 = directAnimatedMedia;
        this.A0A = str;
        this.A09 = str2;
        this.A08 = str3;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4D7, X.Pfl] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.Pfl] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r16) {
        AnonymousClass4D7 r12 = r16;
        if (this.A03 != 0) {
            return new C73564Pfl((UserSession) this.A07, (DirectAnimatedMedia) this.A04, (AnonymousClass9HR) this.A06, (File) this.A05, this.A0A, this.A09, this.A08, r12);
        }
        String str = this.A0A;
        String str2 = this.A09;
        String str3 = this.A08;
        SNA sna = (SNA) this.A02;
        EcpUIConfiguration ecpUIConfiguration = (EcpUIConfiguration) this.A05;
        return new C73564Pfl((FragmentActivity) this.A07, sna, ecpUIConfiguration, (PaymentReceiverInfo) this.A04, (TransactionInfo) this.A01, str, str2, str3, r12, (C62320sa) this.A06);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, X.Pfl] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0112 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c A[PHI: r1 
      PHI: (r1v29 java.lang.Object) = (r1v19 java.lang.Object), (r1v0 java.lang.Object) binds: [B:28:0x0110, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            int r2 = r0.A03
            if (r2 == 0) goto L_0x0116
            X.1Hj r2 = X.1Hj.A02
            int r3 = r0.A00
            r7 = 4
            r10 = 2
            r9 = 3
            r11 = 1
            r4 = 0
            if (r3 == 0) goto L_0x001d
            if (r3 == r11) goto L_0x0055
            if (r3 == r10) goto L_0x0070
            if (r3 == r9) goto L_0x008a
            X.0eS.A00(r1)
        L_0x001c:
            return r1
        L_0x001d:
            X.0eS.A00(r1)
            java.lang.Object r12 = r0.A07
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            X.67N r3 = X.OUC.A00(r12)
            java.lang.Object r1 = r0.A06
            X.9HR r1 = (X.AnonymousClass9HR) r1
            com.google.common.util.concurrent.ListenableFuture r8 = X.C70881OPy.A01(r3, r12, r1)
            java.lang.Object r5 = r0.A05
            java.io.File r5 = (java.io.File) r5
            java.lang.String r3 = X.JTP.A0t(r5)
            r1 = 0
            X.0qQ.A0B(r12, r1)
            com.facebook.msys.mca.MailboxFutureImpl r6 = X.C71031OZi.A00(r12, r3, r4)
            java.lang.String r1 = X.JTP.A0t(r5)
            com.facebook.msys.mca.MailboxFutureImpl r5 = X.C71031OZi.A00(r12, r1, r4)
            r0.A01 = r6
            r0.A02 = r5
            r0.A00 = r11
            java.lang.Object r1 = X.C70357O3j.A00(r8, r0)
            if (r1 != r2) goto L_0x0060
            return r2
        L_0x0055:
            java.lang.Object r5 = r0.A02
            X.685 r5 = (X.AnonymousClass685) r5
            java.lang.Object r6 = r0.A01
            X.685 r6 = (X.AnonymousClass685) r6
            X.0eS.A00(r1)
        L_0x0060:
            r3 = r1
            com.instagram.model.direct.threadkey.impl.MsysThreadId r3 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r3
            r0.A01 = r5
            r0.A02 = r3
            r0.A00 = r10
            java.lang.Object r1 = X.C303606Aa.A01(r6, r0)
            if (r1 != r2) goto L_0x007b
            return r2
        L_0x0070:
            java.lang.Object r3 = r0.A02
            com.instagram.model.direct.threadkey.impl.MsysThreadId r3 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r3
            java.lang.Object r5 = r0.A01
            X.685 r5 = (X.AnonymousClass685) r5
            X.0eS.A00(r1)
        L_0x007b:
            java.lang.String r1 = (java.lang.String) r1
            r0.A01 = r3
            r0.A02 = r1
            r0.A00 = r9
            java.lang.Object r5 = X.C303606Aa.A01(r5, r0)
            if (r5 != r2) goto L_0x0097
            return r2
        L_0x008a:
            java.lang.Object r6 = r0.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r0.A01
            com.instagram.model.direct.threadkey.impl.MsysThreadId r3 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r3
            X.0eS.A00(r1)
            r5 = r1
            r1 = r6
        L_0x0097:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r10 = r0.A04
            com.instagram.model.direct.gifs.DirectAnimatedMedia r10 = (com.instagram.model.direct.gifs.DirectAnimatedMedia) r10
            com.instagram.model.mediasize.GifUrlImpl r9 = r10.A02
            java.lang.Float r6 = r9.A02
            float r8 = r6.floatValue()
            java.lang.Float r6 = r9.A03
            float r11 = r6.floatValue()
            boolean r6 = r10.A06
            r29 = 3
            if (r6 == 0) goto L_0x00b3
            r29 = 1
        L_0x00b3:
            X.OUC r12 = X.C70947OSu.A01
            java.lang.Object r13 = r0.A07
            com.instagram.common.session.UserSession r13 = (com.instagram.common.session.UserSession) r13
            long r9 = r3.A00
            int r8 = (int) r8
            java.lang.Integer r14 = X.JTO.A0w(r8)
            int r6 = (int) r11
            java.lang.Integer r15 = X.JTO.A0w(r6)
            java.lang.Integer r16 = X.JTO.A0w(r8)
            java.lang.Integer r17 = X.JTO.A0w(r6)
            java.lang.Object r6 = r0.A05
            java.io.File r6 = (java.io.File) r6
            java.lang.String r23 = r6.getName()
            X.0qQ.A07(r23)
            long r33 = r6.length()
            r30 = 0
            java.lang.String r6 = r0.A0A
            if (r6 == 0) goto L_0x0113
            java.lang.Long r19 = X.AnonymousClass7TE.A10(r6)
        L_0x00e6:
            java.lang.String r8 = r0.A09
            java.lang.String r6 = r0.A08
            java.lang.Long r20 = X.AnonymousClass4KK.A01(r3)
            java.lang.String r21 = "image/gif"
            r22 = r21
            r24 = r1
            r25 = r5
            r26 = r4
            r27 = r8
            r28 = r6
            r31 = r9
            r35 = r30
            r18 = r4
            com.facebook.msys.mca.MailboxFutureImpl r1 = r12.A01(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r35)
            r0.A01 = r4
            r0.A02 = r4
            r0.A00 = r7
            java.lang.Object r1 = X.C303606Aa.A01(r1, r0)
            if (r1 != r2) goto L_0x001c
            return r2
        L_0x0113:
            r19 = r4
            goto L_0x00e6
        L_0x0116:
            X.1Hj r2 = X.1Hj.A02
            int r4 = r0.A00
            r3 = 1
            if (r4 == 0) goto L_0x0176
            if (r4 != r3) goto L_0x0199
            X.0eS.A00(r1)
        L_0x0122:
            X.SUj r1 = (X.SUj) r1
            boolean r2 = X.SUj.A0S(r1)
            if (r2 != 0) goto L_0x0173
            java.lang.Object r1 = r1.A01
            com.facebookpay.expresscheckout.models.CheckoutAvailability r1 = (com.facebookpay.expresscheckout.models.CheckoutAvailability) r1
            if (r1 == 0) goto L_0x0173
            X.RyJ r1 = r1.A00
            X.QSl r4 = r1.A01
            r2 = 0
            r1 = 233(0xe9, float:3.27E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            boolean r1 = r4.getCoercedBooleanField(r2, r1)
            if (r1 != r3) goto L_0x0173
            X.SOm r1 = X.AnonymousClass2E0.A01()
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r1 = r1.A08
            java.util.ArrayList r1 = r1.A02
            X.2gB r1 = X.SQB.A00(r1)
            java.lang.Object r4 = r0.A02
            X.SNA r4 = (X.SNA) r4
            java.lang.String r8 = r0.A0A
            java.lang.String r9 = r0.A09
            java.lang.Object r5 = r0.A05
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r5 = (com.facebookpay.expresscheckout.models.EcpUIConfiguration) r5
            java.lang.String r10 = r0.A08
            java.lang.Object r6 = r0.A04
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r6 = (com.facebookpay.expresscheckout.models.PaymentReceiverInfo) r6
            java.lang.Object r7 = r0.A01
            com.facebookpay.expresscheckout.models.TransactionInfo r7 = (com.facebookpay.expresscheckout.models.TransactionInfo) r7
            java.lang.Object r3 = r0.A07
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            java.lang.Object r11 = r0.A06
            X.0sa r11 = (X.C62320sa) r11
            X.Sdo r2 = new X.Sdo
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.SQB.A03(r1, r2)
        L_0x0173:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0176:
            X.0eS.A00(r1)
            java.lang.String r7 = r0.A0A
            java.lang.String r8 = r0.A09
            java.lang.String r9 = r0.A08
            java.lang.Object r1 = r0.A04
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r1 = (com.facebookpay.expresscheckout.models.PaymentReceiverInfo) r1
            java.lang.String r10 = r1.A02
            X.0sn r11 = X.0sn.A00
            r5 = 0
            r0.A00 = r3
            X.SOm r1 = X.AnonymousClass2E0.A01()
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r4 = r1.A08
            r6 = r5
            r12 = r0
            java.lang.Object r1 = r4.A04(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r1 != r2) goto L_0x0122
            return r2
        L_0x0199:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73564Pfl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C73564Pfl) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73564Pfl(FragmentActivity fragmentActivity, SNA sna, EcpUIConfiguration ecpUIConfiguration, PaymentReceiverInfo paymentReceiverInfo, TransactionInfo transactionInfo, String str, String str2, String str3, AnonymousClass4D7 r10, C62320sa r11) {
        super(2, r10);
        this.A0A = str;
        this.A09 = str2;
        this.A08 = str3;
        this.A04 = paymentReceiverInfo;
        this.A02 = sna;
        this.A05 = ecpUIConfiguration;
        this.A01 = transactionInfo;
        this.A07 = fragmentActivity;
        this.A06 = r11;
    }
}
