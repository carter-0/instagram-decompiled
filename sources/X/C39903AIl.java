package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel.PostCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1;
import java.util.List;

/* renamed from: X.AIl  reason: case insensitive filesystem */
public final class C39903AIl {
    public AnonymousClass9YG A00;
    public final Activity A01;
    public final View A02;
    public final ViewGroup A03;
    public final AnonymousClass07Z A04;
    public final AnonymousClass2gO A05 = new C64317LZr(this, 2);
    public final C587707f A06;
    public final UserSession A07;
    public final C3504384q A08;
    public final AnonymousClass80U A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass86W A0D;

    public C39903AIl(Activity activity, View view, AnonymousClass07Z r18, C587707f r19, AnonymousClass86W r20, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C3504384q r23, AnonymousClass9YG r24, AnonymousClass80U r25) {
        C3504384q r1 = r23;
        AnonymousClass80U r9 = r25;
        AnonymousClass7TG.A1S(r9, r1);
        C587707f r8 = r19;
        0qQ.A0B(r8, 8);
        AnonymousClass86W r3 = r20;
        0qQ.A0B(r3, 10);
        this.A07 = userSession;
        this.A01 = activity;
        View view2 = view;
        this.A02 = view2;
        this.A00 = r24;
        this.A09 = r9;
        this.A08 = r1;
        AnonymousClass07Z r5 = r18;
        this.A04 = r5;
        this.A06 = r8;
        this.A0D = r3;
        0eO r82 = 0eO.A02;
        this.A0B = AnonymousClass0eN.A00(r82, new C66300MMj(this, 42));
        ViewGroup viewGroup = (ViewGroup) AnonymousClass7TF.A0F(view2, R.id.post_capture_effect_mini_gallery_footer_container);
        this.A03 = viewGroup;
        this.A0A = AnonymousClass0eN.A00(r82, new C66300MMj(this, 41));
        this.A0C = AnonymousClass0eN.A00(r82, new MJ9(17, targetViewSizeProvider, this));
        LayoutInflater.from(view2.getContext()).inflate(R.layout.layout_post_capture_effect_mini_gallery_footer_stub, viewGroup, true);
        AnonymousClass9YG r6 = this.A00;
        List A1P = 0sr.A1P(new AnonymousClass80V[]{AnonymousClass80V.POST_CAPTURE_AR_EFFECT_MINI_GALLERY, AnonymousClass80V.STACKED_TIMELINE_AR_EFFECT_MINI_GALLERY});
        AnonymousClass80W r14 = ((AnonymousClass80T) r9).A01;
        0qQ.A0B(r14, 0);
        AnonymousClass0r6 A012 = AnonymousClass11E.A01(new MCA(30, (Object) r6, (Object) 10q.A04(new AnonymousClass0r6[]{new C61860pz(new C66163MGa(r9, r6, (AnonymousClass4D7) null, 21), 10q.A01(new MEQ(7, (AnonymousClass4D7) null), new C366148oG(new C366128oE(A1P, AnonymousClass8DX.A00(r14))))), new C61860pz(new C66163MGa(r9, r6, (AnonymousClass4D7) null, 22), 10q.A01(new MEQ(8, (AnonymousClass4D7) null), new C366178oJ(new C366168oI(A1P, AnonymousClass11E.A01(new C366158oH(AnonymousClass0Zq.A00(new AnonymousClass9K1((Object) r14, (AnonymousClass4D7) null, 33, 42))))))))})));
        19B r62 = 19B.A00;
        A01(r5, C226292g8.A00(r62, A012), this, 7);
        A01(r5, C226292g8.A00(r62, AnonymousClass11E.A01(new MC8(2, (Object) r9, (Object) this.A00, (Object) 10q.A01(new PostCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1((AnonymousClass4D7) null), AnonymousClass8d4.A04)))), this, 8);
        A01(r5, AnonymousClass72Y.A00(C226292g8.A00(r62, A00(this).A02.A0N)), this, 9);
        AnonymousClass86D r32 = A00(this).A02;
        A01(r5, C226292g8.A00(r62, new MCA(13, (Object) r32, (Object) r32.A0O)), this, 10);
    }

    public static final C357358Xo A00(C39903AIl aIl) {
        Object value;
        if (2CC.A00(AnonymousClass05K.A0L)) {
            value = aIl.A0D.A00.A00();
        } else {
            value = aIl.A0B.getValue();
        }
        return (C357358Xo) value;
    }

    public static void A01(AnonymousClass07Z r2, 2Fk r3, Object obj, int i) {
        r3.A06(r2, new C41482Aug(new C66309MMs(obj, i)));
    }

    public static final void A02(CameraAREffect cameraAREffect, C39903AIl aIl) {
        C64994LlX llX = (C64994LlX) aIl.A0A.getValue();
        if (cameraAREffect != null) {
            llX.A00(cameraAREffect);
        } else {
            ((C347487wt) llX.A02.getValue()).A0F();
        }
        A00(aIl).A05(cameraAREffect);
    }

    public static final void A03(C39903AIl aIl) {
        Activity activity;
        int i;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        AnonymousClass849 r5 = AnonymousClass849.A07;
        A00(aIl).A04(r5);
        boolean CQ0 = aIl.A09.CQ0(AnonymousClass80V.CLIPS_EDITOR);
        C357358Xo A002 = A00(aIl);
        if (!CQ0) {
            activity = aIl.A01;
            i = 9;
            f = 0.55f;
            f2 = 1.0f;
            z = false;
            z2 = true;
            z3 = false;
        } else if (A002.A00 == null) {
            A002 = A00(aIl);
            activity = aIl.A01;
            AnonymousClass0Ud r0 = AnonymousClass8d4.A04;
            Float valueOf = Float.valueOf(0.0f);
            Float valueOf2 = Float.valueOf(0.95f);
            z = false;
            f = AnonymousClass7TG.A00(0sr.A1P(new Float[]{valueOf, valueOf2}), 0);
            z2 = true;
            f2 = AnonymousClass7TG.A00(0sr.A1P(new Float[]{valueOf, valueOf2}), 1);
            i = 9;
            z3 = true;
        } else {
            return;
        }
        A002.A03(activity, r5, f, f2, i, z, z2, z3);
    }
}
