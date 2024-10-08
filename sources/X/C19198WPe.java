package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.WPe  reason: case insensitive filesystem */
public final class C19198WPe implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "InstagramDevicePermissionLocationPublicAPI";
    public final UserSession A00;
    public final C18595Vum A01 = new Object();

    public final AnonymousClass4OB A00(Context context, AnonymousClass4OA r16, String str, List list) {
        C69499Nmh nmh;
        String str2 = str;
        AnonymousClass7TF.A1C(context, 0, str2);
        AnonymousClass4OA r1 = r16;
        AnonymousClass4OB A002 = C18595Vum.A00(context, r1, DbW.A1X(r1));
        AnonymousClass4O6 A012 = A01(context);
        Long A003 = AnonymousClass4O7.A00(this.A00);
        if (A002.A01) {
            nmh = C69499Nmh.A04;
        } else {
            nmh = C69499Nmh.A02;
        }
        V1R v1r = V1R.APP_STATUS;
        String A0n = C51972G9s.A0n();
        String str3 = r1.A00;
        if (182.A06(0Tu.A05, A012.A01, 36318041591518989L)) {
            1Ln r9 = new 1Ln(AnonymousClass7TE.A0e(A012.A00, "device_permissions"), 139);
            if (DbT.A1Y(r9)) {
                0bb r12 = new 0bb();
                r12.A06("access_level", str3);
                r12.A06("data_type", "LOCATION_FOREGROUND");
                r12.A06("auth_status", (String) null);
                r12.A06("listener", (String) null);
                C13990Tnq.A0z(v1r, nmh, r9, list);
                C13990Tnq.A16(r12, r9, A003, A0n, str2);
            }
        }
        return A002;
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Vum, java.lang.Object] */
    public C19198WPe(UserSession userSession) {
        this.A00 = userSession;
    }

    public final AnonymousClass4O6 A01(Context context) {
        Object A012 = VK6.A00.A01(context);
        UserSession userSession = this.A00;
        if (A012 == null || !(A012 instanceof AnonymousClass0iw)) {
            A012 = this;
        }
        return new AnonymousClass4O6((AnonymousClass0iw) A012, userSession);
    }
}
