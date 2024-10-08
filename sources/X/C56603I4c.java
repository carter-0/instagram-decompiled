package X;

import android.content.Context;
import android.widget.Toast;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.I4c  reason: case insensitive filesystem */
public final class C56603I4c {
    public static C56603I4c A0C;
    public Boolean A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C53221GkV A09;
    public final C53222GkW A0A;
    public final UserSession A0B;

    public final void A03(Context context, String str, String str2) {
        UserSession userSession = this.A0B;
        C307506Qj A002 = C48721Ej6.A00(userSession, false);
        String str3 = str;
        if (A05(str, str2)) {
            boolean A062 = 182.A06(0Tu.A05, userSession, 36326786145073119L);
            A00(this, str);
            A01(context, A002, new C58700Iw9(this, context, A002, str3, 0, A062));
        }
    }

    public final boolean A04(String str, String str2) {
        if (!A05(str, str2)) {
            return false;
        }
        return 182.A06(0Tu.A05, this.A0B, 36326786144942046L);
    }

    public final void A01(Context context, C307506Qj r19, C62320sa r20) {
        UserSession userSession = this.A0B;
        0qQ.A0B(userSession, 1);
        JK1 jk1 = new JK1(0, (Object) this, (Object) r19, (Object) r20);
        C58718IwR iwR = new C58718IwR(40, (Object) context, (Object) this);
        1vn A012 = 1vm.A01(userSession);
        2IS A042 = C41845B3m.A04();
        2IS A043 = C41845B3m.A04();
        C56925IHu.A00(new C45926DFg(jk1, 0), new PandoGraphQLRequest(C41845B3m.A05(), "FetchAEScreenQueryLaunchDataQuery", A042.getParamsCopy(), A043.getParamsCopy(), BSX.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, AnonymousClass000.A00(1952), AnonymousClass7TE.A1C()), A012, iwR, 1);
    }

    public final boolean A05(String str, String str2) {
        int i;
        if (str.equals("ig_edit_profile")) {
            int hashCode = str2.hashCode();
            if (hashCode != -80854192) {
                if (hashCode == 610004705) {
                    i = 638;
                } else if (hashCode == 2055510097) {
                    i = 1435;
                }
                if (!str2.equals(AnonymousClass000.A00(i))) {
                    return false;
                }
                return true;
            } else if (str2.equals(AnonymousClass000.A00(1434))) {
                return true;
            }
        }
        return false;
    }

    public C56603I4c(UserSession userSession) {
        this();
        this.A0B = userSession;
        C53222GkW gkW = C53222GkW.A01;
        if (gkW == null) {
            gkW = new C53222GkW();
            C53222GkW.A01 = gkW;
        }
        this.A0A = gkW;
        C53221GkV gkV = C53221GkV.A03;
        if (gkV == null) {
            gkV = new C53221GkV(userSession);
            C53221GkV.A03 = gkV;
        }
        this.A09 = gkV;
    }

    public static final void A00(C56603I4c i4c, String str) {
        String A0c = AnonymousClass7TF.A0c();
        i4c.A05 = A0c;
        C53222GkW gkW = i4c.A0A;
        0qQ.A0B(A0c, 0);
        QuickPerformanceLogger quickPerformanceLogger = gkW.A00;
        quickPerformanceLogger.markerStart(231933580, 0);
        quickPerformanceLogger.markerPoint(231933580, 0, "editor_native_launch_data_fetch_start");
        quickPerformanceLogger.markerAnnotate(231933580, 0, "prefetch_session_id", A0c);
        quickPerformanceLogger.markerAnnotate(231933580, 0, "surface", str);
    }

    public final void A02(Context context, String str) {
        boolean A1X = DbW.A1X(str);
        if (182.A06(0Tu.A05, this.A0B, 36326786145204192L)) {
            Toast.makeText(context, str, A1X ? 1 : 0).show();
        }
    }

    public C56603I4c() {
        this.A01 = "unknown";
        this.A05 = "";
    }
}
