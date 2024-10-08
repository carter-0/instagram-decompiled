package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.view.TextureView;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.google.common.collect.ImmutableList;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;

/* renamed from: X.AqU  reason: case insensitive filesystem */
public final class C41232AqU implements Runnable {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ C391869to A01;
    public final /* synthetic */ C3510387i A02;
    public final /* synthetic */ C3511387s A03;
    public final /* synthetic */ C3511187q A04;

    public C41232AqU(AnonymousClass4DH r1, C391869to r2, C3510387i r3, C3511387s r4, C3511187q r5) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r19v1, types: [X.Tfu, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r20v1, types: [X.Q1d, java.lang.Object] */
    public final void run() {
        C10425Rs1 rs1;
        A80 A002 = C394249xm.A00();
        C3510387i r2 = this.A02;
        TextureView textureView = r2.A0G;
        textureView.setLayoutParams(A002.A06);
        C3510387i.A04(r2, A002);
        C3510387i.A00(this.A00, r2, this.A03, true);
        C3510387i.A03(r2);
        C3511187q r7 = this.A04;
        Context context = r2.A0F;
        Medium medium = ((C385129iR) this.A01).A00;
        AnonymousClass7TF.A1D(context, 0, medium);
        A7X a7x = r7.A01;
        if (a7x == null) {
            a7x = new A7X(context, r7.A05, new A4Z(r7));
            r7.A01 = a7x;
        }
        C64152LQr lQr = C64152LQr.A00;
        UserSession userSession = a7x.A02;
        SJN A012 = lQr.A01(userSession, false, false, false, false);
        Context context2 = a7x.A01;
        C8775R9b r9b = new C8775R9b(textureView, C64152LQr.A00(userSession), C64152LQr.A00(userSession));
        C40201AVr A003 = C392569v1.A00(context2, (C312136ds) null, (C343967r6) null, false);
        Q1Q q1q = new Q1Q(userSession);
        if (A012.A0q) {
            rs1 = AnonymousClass7TG.A0Z();
        } else {
            rs1 = null;
        }
        Context context3 = context2;
        Q1Q q1q2 = q1q;
        STU stu = new STU(context3, q1q2, new Object(), new Object(), C64443Lby.A00, rs1, (AnonymousClass8MA) null, A003, A012, r9b, "", (String) null, (String) null, C63220KtR.A00("template_landing_page", (String) null), 59008);
        a7x.A00 = stu;
        stu.A06 = new C40257AXw(medium, a7x);
        C349307zv r3 = new C349307zv(medium, medium.A0B, medium.A04, medium.A07);
        int i = medium.A03;
        ArrayList A1L = 0sr.A1L(new AnonymousClass51N[]{new AnonymousClass51M((C53401GnY) null, (0v6) null, (AnonymousClass51S) null, C39821AAs.A01(r3, r3.A06(), 0, i, 0, i, i), (String) null, (String) null, (String) null, (String) null, String.valueOf(medium.A05), 0.0f, 0, 0, 0, 0, 0, 0, 805298174, false, false, false, false)});
        int i2 = medium.A03;
        ADZ adz = ADZ.A00;
        Integer num = AnonymousClass05K.A0C;
        C366518pA r0 = new C366518pA(false);
        AssetManager assets = context2.getAssets();
        0qQ.A07(assets);
        ImmutableList of = ImmutableList.of(adz.A00(new C365998o1(assets, 182.A06(0Tu.A05, userSession, 36316254885122235L)), r0, Float.valueOf(50.0f), Float.valueOf(0.5f), num, "blur_transition", i2, i2, 0, (long) i2, 0tS.A4E.A00().A0a()));
        0qQ.A07(of);
        MediaComposition A004 = ABX.A00(of, userSession, (AudioOverlayTrack) null, A1L, 1.0f);
        0qQ.A0B(A004, 0);
        STU stu2 = a7x.A00;
        if (stu2 != null) {
            CameraSpec cameraSpec = a7x.A03;
            stu2.A0A(A004, cameraSpec.A03, cameraSpec.A02, -1, -1, 0, true);
        }
        STU stu3 = a7x.A00;
        if (stu3 != null) {
            stu3.A06();
        }
    }
}
