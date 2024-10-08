package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* renamed from: X.Ox0  reason: case insensitive filesystem */
public final class C72141Ox0 implements AnonymousClass67Q {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final String A03;

    public C72141Ox0(Object obj, String str, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
        this.A03 = str;
    }

    public final void Eyr(AnonymousClass67Z r14) {
        AnonymousClass68L ASa;
        MailboxFutureImpl A0J;
        MailboxCallback ooZ;
        switch (this.A00) {
            case 0:
                C68314NAb nAb = (C68314NAb) this.A02;
                String str = this.A03;
                long j = this.A01;
                MYb mYb = MYb.A0M;
                C71722Opg A002 = C71722Opg.A00(r14, 65);
                AnonymousClass68L A0F = C66580MXl.A0F(nAb, 0);
                MailboxFutureImpl A0G = C66580MXl.A0G(A0F);
                int A003 = C3030067a.A00(A0G);
                TraceInfo A0I = C66580MXl.A0I(A002, A0G, "MailboxTam", "mCATamAttachmentManagerResolveContentToken");
                if (!A0F.EJd(new C71720Ope(A0G, nAb, str, A003, 6, j))) {
                    A0G.cancel(false);
                    C3030067a.A02(A003);
                    C3030067a.A03(A0I, "MailboxTam", "mCATamAttachmentManagerResolveContentToken");
                }
                PlatformLogger.platformEventLog(5);
                return;
            case 1:
                NAL nal = (NAL) this.A02;
                String str2 = this.A03;
                long j2 = this.A01;
                MYb mYb2 = MYb.A0M;
                C71722Opg A004 = C71722Opg.A00(r14, 50);
                ASa = nal.mMailboxApiHandleMetaProvider.ASa(0);
                A0J = C66581MXm.A0J(ASa, A004);
                ooZ = new C71654OoZ(A0J, nal, str2, j2);
                break;
            default:
                MailboxFeature mailboxFeature = (MailboxFeature) this.A02;
                long j3 = this.A01;
                long parseLong = Long.parseLong(this.A03);
                PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative((SqliteHolder) null, "FBLegacyBroker", Long.toString(681066249448173L));
                C71626Oo7 oo7 = new C71626Oo7(r14);
                ASa = mailboxFeature.mMailboxApiHandleMetaProvider.ASa(0);
                A0J = C66581MXm.A0J(ASa, oo7);
                ooZ = new C71678Oox(0, j3, parseLong, A0J, newPrivacyContextNative, mailboxFeature);
                break;
        }
        C66582MXn.A1E(ASa, ooZ, A0J);
    }
}
