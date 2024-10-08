package X;

import com.facebook.systrace.Systrace;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;

@Deprecated(message = "Do not use UserDetailRequestCallback as we are migrating to reactive paradigm")
/* renamed from: X.6wv  reason: invalid class name and case insensitive filesystem */
public final class C323086wv extends 1P0 {
    public static final /* synthetic */ AnonymousClass0YZ[] A05 = {new 01B(C323086wv.class, "view", "getView()Lcom/instagram/profile/fragment/UserDetailRequestCallback$UserDetailView;", 0)};
    public int A00;
    public int A01;
    public final Dda A02;
    public final C323066wt A03;
    public final 0w6 A04;

    private final C267604bt A00() {
        return (C267604bt) this.A04.CDM(this, A05[0]);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A032 = AnonymousClass0fD.A03(-1616605628);
        C3727892k r4 = (C3727892k) obj;
        int A033 = AnonymousClass0fD.A03(-146085892);
        0qQ.A0B(r4, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("UserDetailRequestCallback.onSuccess", 1870436538);
        }
        try {
            this.A02.A0E(002.A0O("fetch_user_on_data_flush", this.A01));
            this.A01++;
            C267604bt A002 = A00();
            if (A002 == null || !A002.isValid()) {
                if (Systrace.A0E(1)) {
                    0fS.A00(1938005707);
                }
                i = -1876936995;
            } else {
                C267604bt A003 = A00();
                if (A003 != null) {
                    A003.EaM(false);
                }
                User A004 = C324696zk.A00(r4);
                if (A004 != null) {
                    C267604bt A005 = A00();
                    if (A005 != null) {
                        A005.Dwc(new C324706zl(this.A03.A03), A004, C324696zk.A01(r4), r4.mServerElapsedTime, r4.CPt());
                    }
                    C267604bt A006 = A00();
                    if (A006 != null) {
                        A006.Ehu(((C298935uH) r4.FH3()).BkJ());
                    }
                } else {
                    C267604bt A007 = A00();
                    if (A007 != null) {
                        A007.DFR(false, true, AnonymousClass000.A00(487));
                    }
                }
                if (Systrace.A0E(1)) {
                    0fS.A00(-1278139061);
                }
                i = -1900763014;
            }
            AnonymousClass0fD.A0A(i, A033);
            AnonymousClass0fD.A0A(1605952138, A032);
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(-249840448);
            }
            AnonymousClass0fD.A0A(-1589886429, A033);
            throw th;
        }
    }

    public C323086wv(C267604bt r3, Dda dda, C323066wt r5) {
        this.A03 = r5;
        this.A02 = dda;
        this.A04 = new C323096ww(new WeakReference(r3));
    }

    public final void onFail(C268654dm r8) {
        int i;
        String str;
        C3727892k r0;
        int A032 = AnonymousClass0fD.A03(-1740016749);
        0qQ.A0B(r8, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("UserDetailRequestCallback.onFail", 524101976);
        }
        try {
            C267604bt A002 = A00();
            if (A002 != null) {
                A002.Cl8();
            }
            C267604bt A003 = A00();
            boolean z = false;
            if (A003 == null || !A003.isValid()) {
                if (Systrace.A0E(1)) {
                    0fS.A00(2037986134);
                }
                i = -514411380;
            } else {
                C267604bt A004 = A00();
                if (A004 != null) {
                    A004.EaM(false);
                }
                boolean z2 = r8 instanceof C268674do;
                if (!z2 || ((r0 = (C3727892k) ((C268674do) r8).A00) != null && r0.getStatusCode() == 404)) {
                    z = true;
                }
                C267604bt A005 = A00();
                if (A005 != null) {
                    Throwable A012 = r8.A01();
                    if (A012 != null) {
                        str = A012.getMessage();
                    } else {
                        str = null;
                    }
                    A005.DFR(z2, z, str);
                }
                if (Systrace.A0E(1)) {
                    0fS.A00(830686245);
                }
                i = 332438052;
            }
            AnonymousClass0fD.A0A(i, A032);
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(-1491355620);
            }
            AnonymousClass0fD.A0A(-1428257078, A032);
            throw th;
        }
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-264816045);
        if (Systrace.A0E(1)) {
            0fS.A01("UserDetailRequestCallback.onFinish", 460619922);
        }
        try {
            this.A02.A0E("fetch_user_network_end");
            C267604bt A002 = A00();
            if (A002 != null) {
                A002.Dw9();
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1846925229);
            }
            AnonymousClass0fD.A0A(-471797819, A032);
        }
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(1062193399);
        int A033 = AnonymousClass0fD.A03(1004494501);
        if (Systrace.A0E(1)) {
            0fS.A01("UserDetailRequestCallback.onSuccessInBackground", 1006272634);
        }
        try {
            this.A02.A0E(002.A0O("fetch_user_on_data_bg_flush", this.A00));
            this.A00++;
            if (Systrace.A0E(1)) {
                0fS.A00(904819173);
            }
            AnonymousClass0fD.A0A(-1444504616, A033);
            AnonymousClass0fD.A0A(512463556, A032);
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(1564610577);
            }
            AnonymousClass0fD.A0A(-236284751, A033);
            throw th;
        }
    }
}
