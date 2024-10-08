package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class LEI {
    public BrandedContentGatingInfoIntf A00;
    public BrandedContentProjectMetadataIntf A01;
    public MediaGenAIDetectionMethod A02;
    public List A03 = AnonymousClass7TE.A1C();
    public boolean A04;
    public final Context A05;
    public final Handler A06 = AnonymousClass7TF.A0D();
    public final 0hq A07;
    public final UserSession A08;
    public final 1Xj A09;
    public final AnonymousClass07i A0A;
    public final List A0B = AnonymousClass7TE.A1C();

    public final void A00(DialogInterface.OnDismissListener onDismissListener, AnonymousClass6Z6 r10) {
        boolean A1U = AnonymousClass7TF.A1U(0, onDismissListener, r10);
        UserSession userSession = this.A08;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        1Xj r2 = this.A09;
        DbU.A1P(A0a, "media/%s/edit_media/?media_type=%s", new Object[]{r2.getId(), r2.BR7()});
        JTO.A1W(A0a, r2.getId());
        Context context = this.A05;
        A0a.A9m(Dd6.A02(0, 9, 40), 0qv.A00(context));
        A0a.A0Q(C61290K1b.class, C64024LJl.class);
        A0a.A0R = A1U;
        LSV.A04(A0a, userSession, this.A0B, this.A03, this.A04);
        LSV.A03(A0a, this.A01);
        LSV.A02(A0a, this.A00);
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = this.A02;
        if (mediaGenAIDetectionMethod != null) {
            A0a.A9m("gen_ai_detection_method", mediaGenAIDetectionMethod.A00);
        }
        1OC A0M = A0a.A0M();
        A0M.A00 = new C61496KAb(onDismissListener, this, r10);
        if (this.A01 != null) {
            1ES.A03(A0M);
        } else {
            1ES.A00(context, this.A0A, A0M);
        }
    }

    public LEI(Context context, 0hq r11, AnonymousClass07i r12, UserSession userSession, 1Xj r14) {
        AnonymousClass7TG.A1U(context, userSession, r11);
        this.A05 = context;
        this.A08 = userSession;
        this.A07 = r11;
        this.A0A = r12;
        this.A09 = r14;
        List<AnonymousClass536> A3j = r14.A3j();
        ArrayList<AnonymousClass59G> A0r = AnonymousClass7TG.A0r(A3j);
        for (AnonymousClass536 r0 : A3j) {
            A0r.add(new AnonymousClass59G(r0.CYy(), r0.Bbh(), r0.ByI()));
        }
        for (AnonymousClass59G r02 : A0r) {
            Boolean bool = (Boolean) r02.A00;
            Boolean bool2 = (Boolean) r02.A01;
            User user = (User) r02.A02;
            boolean z = false;
            this.A0B.add(new BrandedContentTag(user, AnonymousClass7TG.A1X(bool2), AnonymousClass7TG.A1X(bool)));
            List list = this.A03;
            boolean A1X = AnonymousClass7TG.A1X(bool2);
            if (bool != null) {
                z = bool.booleanValue();
            }
            list.add(new BrandedContentTag(user, A1X, z));
        }
        this.A00 = this.A09.A0C.BQ3();
        this.A04 = this.A09.A5l();
        this.A02 = this.A09.A1I();
    }
}
