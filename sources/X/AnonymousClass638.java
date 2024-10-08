package X;

import android.content.Context;
import android.os.Build;
import com.facebook.advancedcryptotransport.ACTRegistrationDeviceIdProvider;
import com.facebook.advancedcryptotransport.PlatformStorageProvider;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.endtoend.EndToEnd;
import com.facebook.messaging.lockbox.LockBoxStorageManager;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.638  reason: invalid class name */
public final class AnonymousClass638 {
    public static final AnonymousClass638 $redex_init_class = null;
    public AnonymousClass66d A00;
    public Set A01;
    public Context A02;
    public AnonymousClass66d A03;
    public AnonymousClass66d A04;
    public String A05;
    public String A06;
    public final AnonymousClass632 A07;
    public final AccountSession A08;
    public final AnonymousClass6AQ A09;
    public final AnonymousClass637 A0A;
    public final AnonymousClass636 A0B;
    public final RealtimeSinceBootClock A0C = RealtimeSinceBootClock.A00;
    public final NotificationCenter A0D;
    public volatile boolean A0E = false;
    public volatile boolean A0F = false;

    public static void A00(AnonymousClass638 r2) {
        AccountSession accountSession;
        AccountSession accountSession2;
        AccountSession accountSession3;
        if (!(r2.A00 == null || (accountSession3 = r2.A08) == null)) {
            accountSession3.getSessionedNotificationCenter().removeEveryObserver(r2.A00);
        }
        if (!(r2.A04 == null || (accountSession2 = r2.A08) == null)) {
            accountSession2.getSessionedNotificationCenter().removeEveryObserver(r2.A04);
        }
        if (r2.A03 != null && (accountSession = r2.A08) != null) {
            accountSession.getSessionedNotificationCenter().removeEveryObserver(r2.A03);
        }
    }

    public static void A01(AnonymousClass638 r2, C301055yO r3, SettableFuture settableFuture) {
        Integer num = r3.A00;
        if (num == AnonymousClass05K.A0Y || (num == AnonymousClass05K.A0j && r3.A01 == AnonymousClass05K.A00)) {
            r2.A0F = true;
        }
        settableFuture.set(r3);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final SettableFuture A02() {
        String str;
        String str2;
        boolean z;
        int i;
        JSONObject jSONObject;
        String optString;
        C301055yO r1;
        ? obj = new Object();
        if (this.A0F) {
            r1 = C301055yO.A06;
        } else if (this.A0E) {
            r1 = C301055yO.A05;
        } else {
            String A002 = EndToEnd.A00("e2e_android_messenger_wa_sandbox.ports.regfb", false, false);
            if (A002 == null) {
                A002 = "22222";
            }
            String A003 = EndToEnd.A00("e2e_android_messenger_wa_sandbox.protocol.regfb", false, false);
            if (A003 == null) {
                A003 = "http";
            }
            String A004 = EndToEnd.A00("e2e_android_messenger_wa_sandbox.hostname", false, false);
            String A005 = EndToEnd.A00("e2e_android_messenger_wa_sandbox.ports.chatd", false, false);
            int i2 = 0;
            if (A004 == null || A005 == null) {
                str = null;
                str2 = null;
                z = false;
                i = 0;
            } else {
                i = Integer.parseInt(A005);
                str2 = 002.A13(A003, "://", A004, ":", A002, "/v2/fb_register_v2?");
                str = "mme-test.whatsapp.net";
                z = true;
            }
            if (EndToEnd.A00("ig.e2e.e2e_igid", false, false) != null) {
                String A006 = AnonymousClass000.A00(2065);
                Map A012 = EndToEnd.A01();
                if (!(A012 == null || (jSONObject = (JSONObject) A012.get(A006)) == null || (optString = jSONObject.optString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) == null)) {
                    NetworkUtils.setSandboxDomain(optString);
                }
            }
            this.A0E = true;
            this.A04 = new C3025163p(this);
            AnonymousClass636 r2 = this.A0B;
            this.A03 = new C3025263q(this);
            AccountSession accountSession = this.A08;
            if (accountSession != null) {
                accountSession.getSessionedNotificationCenter().addObserver(this.A03, "MEMContextConnectionStateChangeNotification", 5, (AnonymousClass2Lq) null);
                accountSession.getSessionedNotificationCenter().addObserver(this.A04, "MEMContextLoginFailureNotRegisteredNotification", 5, (AnonymousClass2Lq) null);
            }
            String str3 = Build.MODEL;
            String str4 = "unknown";
            if (str3 == null) {
                str3 = str4;
            }
            AnonymousClass632 r5 = this.A07;
            List list = this.A0A.A00;
            String str5 = Build.MANUFACTURER;
            if (str5 == null) {
                str5 = str4;
            }
            String str6 = Build.DISPLAY;
            if (str6 == null) {
                str6 = str4;
            }
            String str7 = Build.BOARD;
            if (str7 == null) {
                str7 = str4;
            }
            String str8 = Build.VERSION.RELEASE;
            if (str8 != null) {
                str4 = str8;
            }
            Locale locale = Locale.getDefault();
            if (locale == null) {
                locale = C70362O3o.A00;
            }
            String country = locale.getCountry();
            Locale locale2 = Locale.getDefault();
            if (locale2 == null) {
                locale2 = C70362O3o.A00;
            }
            String language = locale2.getLanguage();
            boolean z2 = r2.A04;
            boolean z3 = r2.A05;
            boolean z4 = true;
            if (!z) {
                z4 = false;
            }
            if (str == null) {
                str = null;
            }
            boolean isRunningEndToEndTest = EndToEnd.isRunningEndToEndTest();
            String str9 = r2.A03;
            String str10 = r2.A02;
            Integer valueOf = Integer.valueOf(i);
            Set set = this.A01;
            if (!0JC.A00().A04()) {
                i2 = 4;
            }
            Integer valueOf2 = Integer.valueOf(i2);
            String str11 = this.A05;
            Long valueOf3 = Long.valueOf(r2.A00);
            boolean z5 = r2.A07;
            boolean z6 = r2.A06;
            String str12 = this.A06;
            Integer valueOf4 = Integer.valueOf(r2.A01);
            C3025363r r4 = new C3025363r(this, obj);
            AnonymousClass68L ASa = r5.mMailboxApiHandleMetaProvider.ASa(2);
            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
            mailboxFutureImpl.Eiu(r4);
            if (!ASa.EJd(new C3025463s(r5, mailboxFutureImpl, 11, 0L, valueOf, valueOf2, valueOf3, valueOf4, str5, str3, str6, str7, str4, country, language, str, str9, str10, A004, str2, str11, str12, list, set, z2, z3, z, z4, isRunningEndToEndTest, z5, z6))) {
                mailboxFutureImpl.cancel(false);
                return obj;
            }
            return obj;
        }
        A01(this, r1, obj);
        return obj;
    }

    static {
        MZ7.A00();
    }

    public AnonymousClass638(Context context, AnonymousClass637 r5, AnonymousClass636 r6, AnonymousClass632 r7, AccountSession accountSession, NotificationCenter notificationCenter, AnonymousClass6AQ r10, String str, String str2) {
        this.A08 = accountSession;
        this.A0A = r5;
        this.A0B = r6;
        this.A07 = r7;
        this.A0D = notificationCenter;
        this.A09 = r10;
        synchronized (AnonymousClass639.class) {
            if (AnonymousClass639.A00 == null) {
                C64791Ub r1 = new C64791Ub(context);
                r1.A00 = 1;
                AnonymousClass639.A00 = r1.A00().A00("AdvancedCryptoTransportPrefs");
            }
        }
        ACTRegistrationDeviceIdProvider.initialize(context);
        PlatformStorageProvider.initialize(context);
        LockBoxStorageManager.initialize(context);
        this.A02 = context;
        this.A05 = str;
        this.A06 = str2;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final SettableFuture A03() {
        A00(this);
        ? obj = new Object();
        AnonymousClass632 r4 = this.A07;
        C71629OoA ooA = new C71629OoA(this, obj);
        AnonymousClass68L ASa = r4.mMailboxApiHandleMetaProvider.ASa(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
        mailboxFutureImpl.Eiu(ooA);
        if (!ASa.EJd(new C71630OoB(r4, mailboxFutureImpl))) {
            mailboxFutureImpl.cancel(false);
        }
        return obj;
    }
}
