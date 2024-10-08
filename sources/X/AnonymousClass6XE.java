package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.api.schemas.CreateModeType;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.model.shopping.ProductItemWithAR;

/* renamed from: X.6XE  reason: invalid class name */
public final class AnonymousClass6XE extends C308916We {
    public final Context A00;
    public final ReelHeaderAttributionType A01 = ReelHeaderAttributionType.CANVAS_ATTRIBUTION;
    public final C255773uh A02;
    public final C316276lO A03;
    public final C317126ml A04;

    public static final AnonymousClass87G A00(AnonymousClass6XE r10) {
        AnonymousClass5OL r1;
        AnonymousClass87I A002;
        1Xj r0 = r10.A02.A0b;
        r0.getClass();
        AnonymousClass5OM As9 = r0.A0C.As9();
        if (As9 != null) {
            r1 = As9.F2D(1E4.A00(r10.A01));
        } else {
            r1 = null;
        }
        AnonymousClass87G r02 = AnonymousClass87G.A0T;
        if (r1 == null) {
            return null;
        }
        CreateModeType createModeType = r1.A00;
        if (createModeType == null) {
            A002 = AnonymousClass87I.EMPTY;
        } else {
            A002 = C393699wr.A00(createModeType.toString());
        }
        AnonymousClass87G r3 = new AnonymousClass87G(new AnonymousClass8YE((Drawable) null, (CameraAREffect) null, A002, (ImageUrl) null, (ProductItemWithAR) null, (AnonymousClass8YF) null, r1.A05, r1.A04));
        r3.A0C = r1.A03;
        return r3;
    }

    public AnonymousClass6XE(Context context, AnonymousClass0iw r3, UserSession userSession, C255773uh r5, C316276lO r6, C317126ml r7) {
        super(r3, userSession, r5);
        this.A00 = context;
        this.A03 = r6;
        this.A02 = r5;
        this.A04 = r7;
    }
}
