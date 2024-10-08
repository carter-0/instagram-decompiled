package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.Set;

/* renamed from: X.DHs  reason: case insensitive filesystem */
public final class C45989DHs implements Runnable {
    public final /* synthetic */ 1zJ A00;
    public final /* synthetic */ C43031Bqv A01;

    public C45989DHs(1zJ r1, C43031Bqv bqv) {
        this.A00 = r1;
        this.A01 = bqv;
    }

    public final void run() {
        Integer num;
        String str;
        String str2;
        C270194gL r2;
        String str3;
        C43031Bqv bqv = this.A01;
        if (bqv.A0C("payload") != null) {
            try {
                C45420Cw0 parseFromJson = C45152CrF.parseFromJson(16P.A00(bqv.A0C("payload")));
                switch (parseFromJson.A01.ordinal()) {
                    case 0:
                    case 1:
                        if (parseFromJson.A00 != null) {
                            C2601144i.A00();
                            1zJ r0 = this.A00;
                            UserSession userSession = r0.A01;
                            Context context = r0.A00;
                            String str4 = parseFromJson.A03;
                            String id = parseFromJson.A00.getId();
                            boolean z = parseFromJson.A06;
                            boolean z2 = parseFromJson.A05;
                            C239413Gj A012 = C239403Gi.A01(context, userSession);
                            UserSession userSession2 = A012.A01;
                            if (userSession2 != null) {
                                1OP r02 = 1OP.$redex_init_class;
                                ReelStore A03 = ReelStore.A03(userSession2);
                                0qQ.A07(A03);
                                Reel reel = null;
                                for (Reel reel2 : A03.A0U(false)) {
                                    if (reel2.A0d()) {
                                        1Ns r11 = reel2.A0W;
                                        if (r11 != null) {
                                            num = r11.CAm();
                                        } else {
                                            num = null;
                                        }
                                        if (num == AnonymousClass05K.A01) {
                                            if (r11 != null) {
                                                str = r11.getId();
                                            } else {
                                                str = null;
                                            }
                                            if (0qQ.A0K(str, id)) {
                                                C270194gL r03 = reel2.A0H;
                                                if (r03 != null) {
                                                    str2 = r03.A0X;
                                                    str2.getClass();
                                                } else {
                                                    str2 = null;
                                                }
                                                if (0qQ.A0K(str2, str4)) {
                                                    reel = reel2;
                                                } else {
                                                    C270194gL r04 = reel2.A0H;
                                                    if (r04 != null) {
                                                        C278114wI r05 = r04.A06;
                                                        if (r05 == null) {
                                                            r05 = C278114wI.UNKNOWN;
                                                        }
                                                        if (!r05.A00()) {
                                                            String id2 = reel2.getId();
                                                            0qQ.A07(id2);
                                                            C239403Gi.A03(userSession2, id2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (AnonymousClass920.A00(A012.A00, userSession2)) {
                                    return;
                                }
                                if (reel != null) {
                                    C270194gL r1 = reel.A0H;
                                    if (r1 != null) {
                                        r1.A0N = AnonymousClass05K.A01;
                                    }
                                    C239413Gj.A03(reel, (User) null, A012, "ig_live_broadcast_start_notification_type", z);
                                    return;
                                }
                                C239413Gj.A05(new C45973DHc(A012, z), A012, AnonymousClass05K.A01, str4, z2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        C2601144i.A00();
                        1zJ r06 = this.A00;
                        UserSession userSession3 = r06.A01;
                        Context context2 = r06.A00;
                        String str5 = parseFromJson.A03;
                        C239413Gj A013 = C239403Gi.A01(context2, userSession3);
                        UserSession userSession4 = A013.A01;
                        if (userSession4 != null && A013.A00 != null) {
                            for (Reel reel3 : 1OP.A05(userSession4).A0U(false)) {
                                if (reel3.A0d()) {
                                    C270194gL r07 = reel3.A0H;
                                    if (r07 != null) {
                                        str3 = r07.A0X;
                                        str3.getClass();
                                    } else {
                                        str3 = null;
                                    }
                                    if (0qQ.A0K(str3, str5)) {
                                        String id3 = reel3.getId();
                                        0qQ.A07(id3);
                                        C239403Gi.A03(userSession4, id3);
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        C2601144i.A00();
                        1zJ r08 = this.A00;
                        UserSession userSession5 = r08.A01;
                        Context context3 = r08.A00;
                        String str6 = parseFromJson.A03;
                        0sl r9 = parseFromJson.A04;
                        boolean z3 = parseFromJson.A06;
                        Long l = parseFromJson.A02;
                        C239413Gj A014 = C239403Gi.A01(context3, userSession5);
                        if (r9 == null) {
                            r9 = 0sl.A00;
                        }
                        0qQ.A0B(r9, 1);
                        UserSession userSession6 = A014.A01;
                        if (userSession6 != null && A014.A00 != null) {
                            ReelStore A05 = 1OP.A05(userSession6);
                            Reel A0M = A05.A0M(str6);
                            if (A0M == null || (r2 = A0M.A0H) == null) {
                                C239413Gj.A05(new C45974DHd(A014, r9, z3), A014, AnonymousClass05K.A01, str6, true);
                                return;
                            }
                            if (!r2.A07()) {
                                r2.A06 = C278114wI.HIDDEN;
                            } else {
                                Set set = r2.A0n;
                                if (set == null) {
                                    r2.A0n = AnonymousClass7TE.A1F();
                                } else {
                                    set.clear();
                                }
                                r2.A0n.addAll(r9);
                                if (l != null) {
                                    r2.A0U = l;
                                }
                                if (r9.size() == 1) {
                                    C239413Gj.A03(A0M, (User) r9.iterator().next(), A014, "ig_live_co_broadcast_notification_type", z3);
                                }
                                C278114wI r12 = C278114wI.HIDDEN;
                                C278114wI r09 = r2.A06;
                                if (r09 != null && r12 == r09) {
                                    r2.A06 = C278114wI.ACTIVE;
                                    A05.A0Y(A0M);
                                }
                            }
                            A0M.A0R(userSession6);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } catch (IOException e) {
                0KC.A0G("RequestStreamClientInitializer", "Error deserializing Subscription.xdt_live_notify_subscribe.payload", e);
            }
        }
    }
}
