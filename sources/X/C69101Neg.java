package X;

import android.app.Activity;
import android.view.View;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Neg  reason: case insensitive filesystem */
public final class C69101Neg extends C71135OdY {
    public AnonymousClass86S A00;
    public AnonymousClass86R A01;
    public N9P A02;
    public final Activity A03;
    public final View A04;
    public final C311756dC A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final C71111Ocu A08;
    public final C70753OJz A09;
    public final OLF A0A;
    public final PMV A0B;
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(new C73906Plh(this, 21));
    public final C262224Cq A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C69101Neg(Activity activity, View view, AnonymousClass0iw r44, UserSession userSession, C71111Ocu ocu, OLF olf) {
        super(DbS.A0z(N9P.class));
        UserSession userSession2 = userSession;
        C70753OJz oJz = new C70753OJz(userSession2);
        C71111Ocu ocu2 = ocu;
        OLF olf2 = olf;
        AnonymousClass7TG.A1S(ocu2, olf2);
        View view2 = view;
        this.A04 = view2;
        Activity activity2 = activity;
        this.A03 = activity2;
        this.A07 = userSession2;
        this.A06 = r44;
        this.A08 = ocu2;
        this.A0A = olf2;
        this.A09 = oJz;
        this.A0B = new PMV(activity2, view2, userSession2, olf2);
        List list = 0sn.A00;
        Integer num = AnonymousClass05K.A00;
        this.A02 = new N9P((EffectAttribution) null, (PickerConfiguration) null, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, C69378NkI.EFFECT, num, num, num, 0, (String) null, "simple_gradient_background_0", (String) null, list, list, list, list, list, 0.0f, false, false, false, false, false, false, false, false, false, false, false, false, false);
        AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.AOJ(88, 3).plus(new AnonymousClass19G((C262204Co) null)));
        this.A0D = A022;
        this.A05 = C311746dB.A00(DbT.A05(activity2), userSession2);
        this.A01 = AnonymousClass86R.CLOSED;
        this.A00 = AnonymousClass86S.CLOSED;
        A0J(new C68291N9e((CameraAREffect) null, 0.0f, false, false));
        this.A0B.A01 = new C70520O9t(this);
        1Eo.A03(num, 19B.A00, new C66185MGw(this, (AnonymousClass4D7) null, 33), A022);
    }

    public static final void A00(CameraAREffect cameraAREffect, C69101Neg neg) {
        C74268Prw pp1;
        if (cameraAREffect != null) {
            AnonymousClass87G A002 = C348367yK.A00(cameraAREffect);
            0qQ.A07(A002);
            pp1 = new C72913POx(A002, (String) null, true);
        } else {
            pp1 = new PP1(true, false, false);
        }
        neg.A08.A03(pp1);
    }
}
