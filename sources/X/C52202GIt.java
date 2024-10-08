package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import org.webrtc.CameraCapturer;

/* renamed from: X.GIt  reason: case insensitive filesystem */
public final class C52202GIt extends C251343mx {
    public final int A00;
    public final 2WX A01;
    public final ClipsViewerConfig A02;
    public final UserSession A03;
    public final JTJ A04;
    public final C52201GIs A05;
    public final JQX A06;
    public final Boolean A07;

    public final C251263mp A0X(AnonymousClass3Y5 r35) {
        MusicAssetModel musicAssetModel;
        Boolean bool;
        Boolean bool2;
        2WX r11;
        int dimensionPixelSize;
        boolean z;
        int min;
        boolean z2;
        Integer valueOf;
        2WX A002;
        AnonymousClass3Y5 r7 = r35;
        0qQ.A0B(r7, 0);
        C52201GIs gIs = this.A05;
        C267324bN r8 = gIs.A00;
        C52058GDe gDe = gIs.A01;
        C52058GDe gDe2 = gDe;
        1Xj r3 = r8.A02;
        if (r3 == null) {
            return null;
        }
        AnonymousClass3W1 r112 = gDe.A0E;
        C67231sQ A0n = C51966G9m.A0n(r3);
        ClipsViewerConfig clipsViewerConfig = this.A02;
        AudioOverlayTrack audioOverlayTrack = clipsViewerConfig.A0Q;
        if (audioOverlayTrack != null) {
            musicAssetModel = audioOverlayTrack.A08;
        } else {
            musicAssetModel = null;
        }
        UserSession userSession = this.A03;
        C267324bN r20 = r8;
        AnonymousClass4Ke r32 = (AnonymousClass4Ke) AnonymousClass3Zw.A00(r7, new C58218IoM(43, A0n, r20, this, r7, r3), new Object[]{r8, r3, A0n, musicAssetModel, userSession});
        if (r32 == null) {
            return null;
        }
        boolean z3 = r32.A05;
        2Wa A003 = C243643Zq.A00(r7, new GL3(34, r8, this, z3));
        C243673Zt A004 = C243633Zp.A00(r7, new C58206IoA(7, A003, r20, this, z3));
        JQX jqx = this.A06;
        Object obj = A003.A03;
        C58693Iw2.A00(r7, this, A004, new Object[]{jqx, A004, obj, r8, userSession}, 45);
        C243533Zd r23 = C243533Zd.LOCAL;
        AnonymousClass4Ey A005 = 2Vi.A00(r23, "audio_cta");
        C51966G9m.A1M(A005, CameraCapturer.OPEN_CAMERA_DELAY_MS);
        A005.A03(C246033ds.A00);
        A005.A01(0.0f);
        AnonymousClass4F7.A00(r7, A005);
        Object A006 = AnonymousClass3Zw.A00(r7, C58697Iw6.A00(r32, r7, this, 43), new Object[]{r32});
        if (r112 != null) {
            bool = Boolean.valueOf(r112.A1q);
        } else {
            bool = null;
        }
        if (r112 != null) {
            bool2 = Boolean.valueOf(r112.A0n());
        } else {
            bool2 = null;
        }
        GAM gam = (GAM) AnonymousClass3Zw.A00(r7, new GL6(3, A003, r7, A006, r32, this, z3), new Object[]{r32, obj, bool, bool2});
        C243773a4.A00(r7, C58715IwO.A01(gam, 0), new Object[]{gam});
        if (clipsViewerConfig.A1Q || z3) {
            r11 = null;
        } else {
            AnonymousClass3XV r0 = 2WX.A02;
            r11 = C51971G9r.A0Z(C51965G9l.A0X((2WX) null, new C244253at(AnonymousClass05K.A00, J6F.A00(gam, 16), (String) null)), AnonymousClass05K.A01, J6F.A00(gam, 17), (String) null);
        }
        2WX r21 = 2WX.A02;
        Integer num = AnonymousClass05K.A00;
        Integer num2 = AnonymousClass05K.A01;
        GH5 gh5 = new GH5(gam, (ImageView.ScaleType) null, AnonymousClass9JR.A00(C51971G9r.A0X((2WX) null, num, 100.0f, 0), num2, 0, ((long) gam.getIntrinsicHeight()) | 9221401712017801216L).A00(r11), true);
        2V1 r02 = r7.A05;
        2V1 r31 = r02;
        Resources A0A = AnonymousClass7TF.A0A(r02.A0C);
        int A007 = AnonymousClass3ZC.A00(A0A);
        boolean A1a = AnonymousClass7TE.A1a(obj);
        if (A1a) {
            dimensionPixelSize = A0A.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        } else {
            dimensionPixelSize = A0A.getDimensionPixelSize(R.dimen.afi_margin_top);
        }
        int i = dimensionPixelSize * 2;
        Context A008 = C243803a8.A00(r7);
        int A062 = 0nA.A06(A008) - (AnonymousClass7TG.A03(A008) * 2);
        Boolean bool3 = this.A07;
        if (bool3 != null) {
            z = bool3.booleanValue();
        } else {
            z = gIs.A02;
        }
        C306386Ly r03 = gam.A02;
        if (r03 == null) {
            0qQ.A0F("textDrawableStart");
            throw AnonymousClass00P.createAndThrow();
        }
        int i2 = r03.A0A + gam.A06 + gam.A07 + i;
        if (z) {
            min = AnonymousClass1GB.A01(((float) A062) * 0.4f);
            z2 = false;
            valueOf = null;
        } else {
            min = Math.min(i2, A007);
            z2 = true;
            valueOf = Integer.valueOf(min);
        }
        gam.A02(valueOf, Integer.valueOf(i2));
        if (!z2) {
            min = Math.min(i2, min);
        }
        2WX r10 = this.A01;
        AnonymousClass9JR A0c = C51965G9l.A0c(num, 0, ((long) min) | 9221401712017801216L);
        if (r10 == r21) {
            r10 = null;
        }
        2WX A0V = C51972G9s.A0V(C51965G9l.A0X(r10, A0c), J6R.A00(this, A003, 42));
        C58750Iwx iwx = new C58750Iwx(6, r7, this, A003);
        Integer num3 = AnonymousClass05K.A04;
        2WX A0Z = C51971G9r.A0Z(C51971G9r.A0Y(A0V, num3, iwx, 4), num, new C58768IxF(36, r8, this, gDe2, A003), (String) null);
        String A0w = DbV.A0w(A0A, r32.A04, r32.A03, 2131955231);
        if (A0w != null) {
            A0Z = C51971G9r.A0Y(A0Z, AnonymousClass05K.A0N, A0w, 0);
        }
        2WX A0U = C51972G9s.A0U(A0Z, num2, 0);
        2Wb A0S = AnonymousClass7TG.A0S(r31);
        if (A1a) {
            A002 = C51971G9r.A0V(A0S.Aqq(), C51971G9r.A0Y(C51973G9u.A0Q((2WX) null, C51965G9l.A0c(num3, 0, C244013aV.A0A(A0S)), 0, C244013aV.A07(A0S)), num, C244013aV.A0D(A0S, R.drawable.clips_viewer_pill_invert_background), 4), r23, "audio_cta");
        } else {
            A002 = C52199GIq.A00(A0S);
        }
        return C51967G9n.A0P(C243563Zg.A0G(G9t.A0v(gh5, A0S.A00), A0S, A002), A0S, r7, A0U);
    }

    public /* synthetic */ C52202GIt(2WX r3, ClipsViewerConfig clipsViewerConfig, UserSession userSession, JTJ jtj, C52201GIs gIs, JQX jqx, int i) {
        Boolean A0u = AnonymousClass7TE.A0u();
        C51974G9v.A1P(gIs, jqx, userSession, clipsViewerConfig);
        0qQ.A0B(jtj, 7);
        this.A05 = gIs;
        this.A06 = jqx;
        this.A03 = userSession;
        this.A02 = clipsViewerConfig;
        this.A01 = r3;
        this.A00 = i;
        this.A04 = jtj;
        this.A07 = A0u;
    }
}
