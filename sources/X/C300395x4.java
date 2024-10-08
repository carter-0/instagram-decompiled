package X;

import android.content.Context;
import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.mci.AppContainerDirectoryPath;
import com.facebook.msys.mci.AppState;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.simplejni.fataljavaexceptiondescriptionhandler.breakpad.BreakpadFatalJavaExceptionDescriptionHandler;
import java.util.UUID;

/* renamed from: X.5x4  reason: invalid class name and case insensitive filesystem */
public final class C300395x4 {
    public static NetworkSession A00(C300185wg r4, NotificationCenter notificationCenter) {
        NetworkSession A00;
        boolean z;
        synchronized (C300395x4.class) {
            A00 = MsysInfraNoSqliteObjectHolder.A00();
            if (A00 == null) {
                NetworkSession networkSession = NetworkSession.$redex_init_class;
                String str = (String) r4.A07.get();
                str.getClass();
                Object obj = r4.A06.get();
                obj.getClass();
                C300195wh r0 = (C300195wh) obj;
                r0.getClass();
                A00 = new NetworkSession(str, notificationCenter, r0);
                synchronized (MsysInfraNoSqliteObjectHolder.class) {
                    MsysInfraNoSqliteObjectHolder.A03.A02 = A00;
                }
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            C300435xB.A00(r4.A08).A0E();
        }
        return A00;
    }

    public static synchronized String A01(C300185wg r6) {
        String obj;
        MsysInfraNoSqliteObjectHolder msysInfraNoSqliteObjectHolder;
        synchronized (C300395x4.class) {
            obj = UUID.randomUUID().toString();
            Class<MsysInfraNoSqliteObjectHolder> cls = MsysInfraNoSqliteObjectHolder.class;
            synchronized (cls) {
                msysInfraNoSqliteObjectHolder = MsysInfraNoSqliteObjectHolder.A03;
                msysInfraNoSqliteObjectHolder.A00.add(obj);
            }
            BreakpadFatalJavaExceptionDescriptionHandler.Companion companion = BreakpadFatalJavaExceptionDescriptionHandler.Companion;
            C300405x8.A00.run();
            A02(r6);
            AppContainerDirectoryPath.setAppContainerDirectoryPath((String) r6.A05.get());
            if (MsysInfraNoSqliteObjectHolder.A00() == null) {
                NotificationCenter A00 = C300465xE.A00();
                C300435xB.A00(r6.A08).A0F();
                A00(r6, A00);
            }
            AppState appState = new AppState();
            appState.setRegularAppStateUpdate(false);
            appState.setDisableAppStatePersistence(false);
            synchronized (cls) {
                msysInfraNoSqliteObjectHolder.A01 = appState;
            }
        }
        return obj;
    }

    public static void A02(C300185wg r7) {
        r7.A0D.run();
        Context context = r7.A01;
        QuickPerformanceLogger quickPerformanceLogger = r7.A08;
        C300415x9.A00(context, r7.A02, r7.A04, r7.A0A, r7.A0B, r7.A0C, r7.A00);
        C300435xB.A00(quickPerformanceLogger).A04();
    }
}
