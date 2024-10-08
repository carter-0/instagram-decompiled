package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage;
import com.instagram.direct.armadilloexpress.transportpayload.DeleteMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;

/* renamed from: X.OUz  reason: case insensitive filesystem */
public final class C70985OUz {
    public final UserSession A00;

    public C70985OUz(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final void A00(C70985OUz oUz, String str, String str2, byte[] bArr, int i, long j, long j2, long j3) {
        long j4;
        int i2;
        int i3;
        int i4;
        int i5;
        byte[] bArr2;
        String str3;
        String str4;
        UserSession userSession;
        TAP tap;
        C70985OUz oUz2 = oUz;
        int i6 = i;
        long j5 = j;
        long j6 = j2;
        long j7 = j3;
        if (i6 == 1 || i6 == 2) {
            byte[] bArr3 = bArr;
            if (bArr != null) {
                ReverbBackupMessagePayload$BackupMessage reverbBackupMessagePayload$BackupMessage = (ReverbBackupMessagePayload$BackupMessage) R5b.A04(ReverbBackupMessagePayload$BackupMessage.DEFAULT_INSTANCE, bArr3);
                0qQ.A07(reverbBackupMessagePayload$BackupMessage);
                ReverbBackupMessagePayload$BackupMessage.Metadata metadata = reverbBackupMessagePayload$BackupMessage.metadata_;
                if (metadata == null) {
                    metadata = ReverbBackupMessagePayload$BackupMessage.Metadata.DEFAULT_INSTANCE;
                }
                j4 = C66580MXl.A08(metadata.senderId_);
                if (reverbBackupMessagePayload$BackupMessage.payloadCase_ == 2) {
                    tap = (TAP) reverbBackupMessagePayload$BackupMessage.payload_;
                } else {
                    tap = TAP.A01;
                }
                bArr2 = tap.A05();
                ReverbBackupMessagePayload$BackupMessage.Metadata metadata2 = reverbBackupMessagePayload$BackupMessage.metadata_;
                if (metadata2 == null) {
                    metadata2 = ReverbBackupMessagePayload$BackupMessage.Metadata.DEFAULT_INSTANCE;
                }
                i2 = metadata2.payloadVersion_;
                i3 = metadata2.threadTypeTag_;
                userSession = oUz2.A00;
                i5 = 5;
                i4 = 15;
                str3 = null;
                0qQ.A0A(bArr2);
                str4 = str;
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (i6 == 3 || i6 == 4) {
            C68411NFs nFs = (C68411NFs) TransportPayload.DEFAULT_INSTANCE.A0I();
            NFJ nfj = (NFJ) DeleteMessagePayload.DEFAULT_INSTANCE.A0I();
            DeleteMessagePayload deleteMessagePayload = (DeleteMessagePayload) C66580MXl.A0L(nfj);
            String str5 = str2;
            str5.getClass();
            deleteMessagePayload.bitField0_ |= 1;
            deleteMessagePayload.messageOtid_ = str5;
            nFs.A06(nfj);
            bArr2 = nFs.A02().A0H();
            userSession = oUz2.A00;
            i5 = 5;
            i4 = 15;
            i3 = 0;
            Long A0r = C66581MXm.A0r(userSession, AnonymousClass0t1.A01);
            if (A0r != null) {
                j4 = A0r.longValue();
                str3 = null;
                0qQ.A0A(bArr2);
                i2 = 3;
                str4 = "0";
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            return;
        }
        C71074Oat.A01(userSession, str4, str3, bArr2, i5, i4, i3, i2, j5, j6, j4, j7);
    }

    public final void A01(long j) {
        MailboxFeature mailboxFeature = new MailboxFeature(C66845Mdd.A00.A00(this.A00));
        AnonymousClass68L A0I = C66581MXm.A0I(mailboxFeature);
        MailboxFutureImpl A0G = C66580MXl.A0G(A0I);
        C66582MXn.A1D(A0I, new C71718Opc(j, (Object) mailboxFeature, 8, (Object) A0G), A0G);
        A0G.addResultCallback(new C71643OoO(this, j, 1));
    }
}
