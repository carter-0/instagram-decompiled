package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.ArmadilloExpressEncryptedBackupDatabase;
import com.instagram.roomdb.IgRoomDatabase;

/* renamed from: X.MmU  reason: case insensitive filesystem */
public final class C67353MmU {
    public final UserSession A00;
    public final C67355MmW A01;
    public final ArmadilloExpressEncryptedBackupDatabase A02;
    public final C69850NtE A03;

    public C67353MmU(UserSession userSession, C69850NtE ntE) {
        this.A00 = userSession;
        this.A03 = ntE;
        C67352MmT mmT = ArmadilloExpressEncryptedBackupDatabase.A00;
        Class<ArmadilloExpressEncryptedBackupDatabase> cls = ArmadilloExpressEncryptedBackupDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase == null) {
            synchronized (mmT) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
                if (igRoomDatabase == null) {
                    1VA A0F = JTS.A0F(userSession, mmT, cls);
                    1VC.A00(A0F, 484173884, 297777620, true);
                    A0F.A02(new int[]{5, 6, 7, 8, 9, 10, 11});
                    A0F.A03(new AnonymousClass1VF[]{C67356MmY.A00, C67356MmY.A01, C67356MmY.A02, C67356MmY.A03, C67356MmY.A04, C67356MmY.A05, C67356MmY.A06, C67356MmY.A07, C67356MmY.A08, C67356MmY.A09});
                    A0F.A05 = true;
                    A0F.A03 = true;
                    igRoomDatabase = (IgRoomDatabase) A0F.A00();
                    userSession.A04(cls, igRoomDatabase);
                }
            }
        }
        ArmadilloExpressEncryptedBackupDatabase armadilloExpressEncryptedBackupDatabase = (ArmadilloExpressEncryptedBackupDatabase) igRoomDatabase;
        this.A02 = armadilloExpressEncryptedBackupDatabase;
        this.A01 = new C67355MmW(armadilloExpressEncryptedBackupDatabase);
    }
}
