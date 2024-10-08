package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.90Z  reason: invalid class name */
public final class AnonymousClass90Z implements Runnable {
    public final /* synthetic */ AnonymousClass07Z A00;
    public final /* synthetic */ AnonymousClass72N A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ List A03;

    public AnonymousClass90Z(AnonymousClass07Z r1, AnonymousClass72N r2, UserSession userSession, List list) {
        this.A03 = list;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = userSession;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.0r1, java.lang.Object] */
    public final void run() {
        String str;
        AnonymousClass3Q2 A032;
        String str2;
        for (AnonymousClass3Q2 r7 : this.A03) {
            if (r7.A5U) {
                AnonymousClass07Z r4 = this.A00;
                AnonymousClass72N r0 = this.A01;
                ? obj = new Object();
                r0.A04.A06(r4, new AnonymousClass90W(new AnonymousClass9LR(obj, 12)));
                if (!obj.A00) {
                    UserSession userSession = this.A02;
                    double hours = (double) (TimeUnit.SECONDS.toHours(System.currentTimeMillis() / 1000) - TimeUnit.MILLISECONDS.toHours(r7.A0Z));
                    0Tu r5 = 0Tu.A05;
                    if (hours > 182.A00(r5, userSession, 37164077134446898L) && hours < 182.A00(r5, userSession, 37164077134512435L) && 182.A06(r5, userSession, 36319652204256817L)) {
                        String str3 = r7.A35;
                        if (r7.A1G == 1iA.A0Q) {
                            str2 = r7.A33;
                        } else {
                            List A0M = r7.A0M();
                            if (A0M != null && (str = (String) 00k.A0J(A0M)) != null && (A032 = 28K.A00(userSession).A03(str)) != null) {
                                str2 = A032.A33;
                            } else {
                                return;
                            }
                        }
                        if (str2 != null) {
                            try {
                                File file = new File(str2);
                                if (file.exists()) {
                                    1NY r2 = new 1NY(userSession, -2);
                                    r2.A04();
                                    r2.A0A("clips/draft_reminder/");
                                    r2.A9m("draft_id", str3);
                                    r2.A9m("thumbnail_uri", C253833rU.A01(file).getUrl());
                                    r2.A0Q(1XP.class, 1XY.class);
                                    1ES.A03(r2.A0M());
                                    return;
                                }
                                return;
                            } catch (SecurityException unused) {
                                0wb.A01(0kg.A09, "FeedDraftNotificationUtil", 002.A0R("Don't have access to read thumbnail file: ", str2));
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
