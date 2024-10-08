package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineIntegrator;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueType;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.DatabaseConnection;
import com.facebook.msys.mci.NotificationCenter;

/* renamed from: X.NBl  reason: case insensitive filesystem */
public final class C68349NBl extends AnonymousClass45Y {
    public final /* synthetic */ Mailbox A00;
    public final /* synthetic */ C72212Oyd A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68349NBl(Mailbox mailbox, C72212Oyd oyd) {
        super("Integrator Start");
        this.A01 = oyd;
        this.A00 = mailbox;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [com.facebook.messenger.notification.engine.MSGNotificationEngineIntegrator, java.lang.Object] */
    public final void run() {
        Database database;
        C72212Oyd oyd = this.A01;
        OFM ofm = oyd.A03;
        MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider = oyd.A00;
        0qQ.A0B(mSGNotificationEngineValueProvider, 0);
        NotificationEngineValueType notificationEngineValueType = NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_BOOLEAN;
        mSGNotificationEngineValueProvider.registerGetter("isNotificationMuted", notificationEngineValueType, new C71602Ond(ofm));
        mSGNotificationEngineValueProvider.registerSetter("suppressNotification", notificationEngineValueType, C71610Onl.A00);
        mSGNotificationEngineValueProvider.registerGetter("context.enableEngineAnnotation", notificationEngineValueType, new C71603One(ofm));
        mSGNotificationEngineValueProvider.registerSetter("handleNotificationUnsend", NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_STRING, ofm.A02);
        OOR oor = MSGNotificationEngineIntegrator.Companion;
        Mailbox mailbox = this.A00;
        NotificationCenter notificationCenter = mailbox.getSlimMailbox().getNotificationCenter();
        if (notificationCenter != null) {
            synchronized (mailbox) {
                database = mailbox.mDatabase;
                String A002 = C273654mx.A00(2997);
                if (database == null) {
                    throw AnonymousClass7TE.A11(A002);
                }
            }
            DatabaseConnection databaseConnection = database.mReadWriteConnection;
            if (databaseConnection != null) {
                C68310N9x n9x = oyd.A02;
                0qQ.A0B(n9x, 5);
                ? obj = new Object();
                obj.mNativeHolder = MSGNotificationEngineIntegrator.initNativeHolder(mSGNotificationEngineValueProvider, notificationCenter, databaseConnection, mailbox, n9x);
                oyd.integrator = obj;
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
