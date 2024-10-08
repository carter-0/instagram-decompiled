package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.GvC  reason: case insensitive filesystem */
public final class C53845GvC extends C251343mx {
    public final int A00;
    public final ClipsViewerConfig A01;
    public final UserSession A02;
    public final JTB A03;
    public final JTJ A04;
    public final C53579Gqu A05;
    public final int A06;
    public final 2WX A07;
    public final Boolean A08;

    public final C251263mp A0X(AnonymousClass3Y5 r32) {
        MusicAssetModel musicAssetModel;
        Boolean bool;
        Boolean bool2;
        2WX r12;
        boolean z;
        int min;
        Integer num;
        AnonymousClass3Y5 r7 = r32;
        0qQ.A0B(r7, 0);
        C53579Gqu gqu = this.A05;
        C267324bN r5 = gqu.A00;
        C52058GDe gDe = gqu.A01;
        C52058GDe gDe2 = gDe;
        1Xj r2 = r5.A02;
        if (r2 == null) {
            return null;
        }
        AnonymousClass3W1 r13 = gDe.A0E;
        C67231sQ A0n = C51966G9m.A0n(r2);
        ClipsViewerConfig clipsViewerConfig = this.A01;
        AudioOverlayTrack audioOverlayTrack = clipsViewerConfig.A0Q;
        if (audioOverlayTrack != null) {
            musicAssetModel = audioOverlayTrack.A08;
        } else {
            musicAssetModel = null;
        }
        AnonymousClass4Ke r3 = (AnonymousClass4Ke) AnonymousClass3Zw.A00(r7, new C58218IoM(44, A0n, r5, this, r7, r2), new Object[]{r5, r2, A0n, musicAssetModel, this.A02});
        if (r3 == null) {
            return null;
        }
        boolean z2 = r3.A05;
        Object A002 = AnonymousClass3Zw.A00(r7, C58697Iw6.A00(r3, r7, this, 44), new Object[]{r3});
        if (r13 != null) {
            bool = Boolean.valueOf(r13.A1q);
        } else {
            bool = null;
        }
        if (r13 != null) {
            bool2 = Boolean.valueOf(r13.A0n());
        } else {
            bool2 = null;
        }
        GAM gam = (GAM) AnonymousClass3Zw.A00(r7, C58699Iw8.A00(A002, r7, this, r3, 46), new Object[]{r3, bool, bool2});
        C243773a4.A00(r7, C58715IwO.A01(gam, 2), new Object[]{gam});
        if (clipsViewerConfig.A1Q || z2) {
            r12 = null;
        } else {
            AnonymousClass3XV r0 = 2WX.A02;
            r12 = C51971G9r.A0Z(C51965G9l.A0X((2WX) null, new C244253at(AnonymousClass05K.A00, J6F.A00(gam, 21), (String) null)), AnonymousClass05K.A01, J6F.A00(gam, 22), (String) null);
        }
        2WX r20 = 2WX.A02;
        Integer num2 = AnonymousClass05K.A00;
        Integer num3 = AnonymousClass05K.A01;
        GH5 gh5 = new GH5(gam, (ImageView.ScaleType) null, AnonymousClass9JR.A00(C51971G9r.A0X((2WX) null, num2, 100.0f, 0), num3, 0, ((long) gam.getIntrinsicHeight()) | 9221401712017801216L).A00(r12), true);
        2V1 r02 = r7.A05;
        2V1 r23 = r02;
        Resources A0A = AnonymousClass7TF.A0A(r02.A0C);
        int A003 = AnonymousClass3ZC.A00(A0A);
        int dimensionPixelSize = A0A.getDimensionPixelSize(R.dimen.afi_margin_top) * 2;
        Context A004 = C243803a8.A00(r7);
        int A062 = 0nA.A06(A004) - (AnonymousClass7TG.A03(A004) * 2);
        Boolean bool3 = this.A08;
        if (bool3 != null) {
            z = bool3.booleanValue();
        } else {
            z = gqu.A02;
        }
        int i = this.A06;
        C306386Ly r03 = gam.A02;
        if (r03 == null) {
            0qQ.A0F("textDrawableStart");
            throw AnonymousClass00P.createAndThrow();
        }
        int i2 = r03.A0A + gam.A06 + gam.A07 + dimensionPixelSize;
        if (z) {
            min = AnonymousClass1GB.A01(((float) A062) * 0.4f);
        } else {
            min = Math.min(i2, A003);
        }
        boolean z3 = true;
        int i3 = A003 - i;
        if (min >= i3) {
            z3 = false;
        }
        int min2 = Math.min(i2, i3);
        if (z3) {
            num = Integer.valueOf(min);
        } else {
            num = null;
        }
        gam.A02(num, Integer.valueOf(i2));
        if (!z3) {
            min = min2;
        }
        if (((float) min) <= ((float) A003) * 0.25f) {
            return null;
        }
        2WX r122 = this.A07;
        AnonymousClass9JR A0c = C51965G9l.A0c(num2, 0, ((long) min) | 9221401712017801216L);
        if (r122 == r20) {
            r122 = null;
        }
        2WX A0Z = C51971G9r.A0Z(C51971G9r.A0Y(C51972G9s.A0V(C51965G9l.A0X(r122, A0c), J6F.A00(this, 20)), AnonymousClass05K.A04, J6R.A00(this, r7, 44), 4), num2, new C58750Iwx(7, gDe2, this, r5), (String) null);
        String A0w = DbV.A0w(A0A, r3.A04, r3.A03, 2131955231);
        if (A0w != null) {
            A0Z = C51971G9r.A0Y(A0Z, AnonymousClass05K.A0N, A0w, 0);
        }
        2WX A0U = C51972G9s.A0U(A0Z, num3, 0);
        2Wb A0S = AnonymousClass7TG.A0S(r23);
        return C51967G9n.A0P(C243563Zg.A0G(G9t.A0v(gh5, A0S.A00), A0S, C52199GIq.A00(A0S)), A0S, r7, A0U);
    }

    public C53845GvC(2WX r2, ClipsViewerConfig clipsViewerConfig, UserSession userSession, JTB jtb, JTJ jtj, C53579Gqu gqu, Boolean bool, int i, int i2) {
        AnonymousClass7TG.A1O(gqu, userSession);
        AnonymousClass7TF.A1F(jtb, 7, jtj);
        this.A05 = gqu;
        this.A02 = userSession;
        this.A01 = clipsViewerConfig;
        this.A07 = r2;
        this.A06 = i;
        this.A00 = i2;
        this.A03 = jtb;
        this.A04 = jtj;
        this.A08 = bool;
    }
}
