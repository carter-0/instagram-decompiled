package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mapquery.MapQuery;

/* renamed from: X.UZz  reason: case insensitive filesystem */
public abstract class C15293UZz extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "LocationSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final UserSession A07() {
        return AnonymousClass7TE.A0l(this.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A00);
    }

    public static void A00(C15293UZz uZz, MapQuery mapQuery, C66942Mfb mfb) {
        C18646Vvr A002 = VGC.A00(uZz.A07());
        synchronized (A002) {
            0qQ.A0B(mapQuery, 0);
            A002.A01.A04(mapQuery);
        }
        C18373VqZ.A00(uZz.A07(), mfb);
    }
}
