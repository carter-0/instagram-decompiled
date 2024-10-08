package X;

import android.os.Build;
import android.view.View;
import com.instagram.creation.genai.themes.domain.AiThemesViewModel$onExamplePromptClicked$1;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.util.Iterator;

/* renamed from: X.GhN  reason: case insensitive filesystem */
public final class C53032GhN extends 2YL {
    public int A00;
    public C53368Gms A01;
    public C65364Ls5 A02;
    public C55619Hke A03;
    public String A04;
    public Iterator A05;
    public C262204Co A06;
    public boolean A07;
    public C262204Co A08;
    public final C284945Oz A09 = C51970G9q.A0S(C51967G9n.A0L(""));
    public final AnonymousClass4HW A0A;
    public final C389799qE A0B;
    public final C56496HzS A0C;
    public final I6F A0D;
    public final 1Av A0E;
    public final AnonymousClass0r6 A0F;
    public final AnonymousClass0r6 A0G;
    public final 05G A0H;
    public final AnonymousClass0Ud A0I;
    public final boolean A0J;

    public C53032GhN(C389799qE r19, C56496HzS hzS, I6F i6f, 1Av r22, boolean z) {
        Iterator it;
        I6F i6f2 = i6f;
        1Av r6 = r22;
        int A082 = C51970G9q.A08(3, r6, i6f2);
        C56496HzS hzS2 = hzS;
        0qQ.A0B(hzS2, 5);
        this.A0B = r19;
        this.A0J = z;
        this.A0E = r6;
        this.A0D = i6f2;
        this.A0C = hzS2;
        HM3 hm3 = HM3.Initial;
        0sn r10 = 0sn.A00;
        02z A10 = DbS.A10(new C53390GnN(hm3, (Integer) null, r10, 0.0f, true));
        this.A0H = A10;
        double A002 = 182.A00(0Tu.A05, hzS2.A00, 37170300542190086L);
        this.A0I = 10b.A03(A10);
        this.A07 = DbT.A1a(r6.A01, "has_seen_ai_themes_disclaimer");
        this.A04 = "";
        AnonymousClass30J r62 = AnonymousClass30J.SECONDS;
        this.A0G = new C58028IkL(6, this, new AnonymousClass05E(new MGH((AnonymousClass4D7) null, C58357Iqc.A00, 0, AnonymousClass30K.A03(r62, 5))));
        this.A05 = r10.iterator();
        this.A0F = new C58028IkL(7, this, new AnonymousClass05E(new MGH((AnonymousClass4D7) null, new C58672Ivh(this, 37), 0, AnonymousClass30K.A02(r62, A002))));
        this.A00 = 2SP.A01.A05(A082);
        this.A0A = C335967dq.A00(C59822JZw.A00);
        if (C55409HhF.A00.hasNext()) {
            it = C55409HhF.A00;
        } else {
            it = C55409HhF.A01.iterator();
            C55409HhF.A00 = it;
        }
        this.A01 = (C53368Gms) it.next();
    }

    public static final String A00(C53032GhN ghN) {
        return new 11S("\\s+").A00(DbV.A12(C51971G9r.A0q(ghN.A09)), " ");
    }

    public final String A01() {
        DirectThreadThemeInfo directThreadThemeInfo;
        AnonymousClass0Ud r1 = this.A0I;
        Integer num = ((C53390GnN) r1.getValue()).A02;
        if (num == null || (directThreadThemeInfo = (DirectThreadThemeInfo) C53390GnN.A00(r1, num.intValue()).A01) == null) {
            return null;
        }
        return directThreadThemeInfo.A0o;
    }

    public final void A02() {
        I6F i6f = this.A0D;
        0Aj A0e = AnonymousClass7TE.A0e(i6f.A01, "direct_custom_theme_submit_prompt");
        if (A0e.isSampled()) {
            A0e.AAJ("set_theme_id", i6f.A04);
            I6F.A01(I6F.A00(i6f.A03), A0e, i6f, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0e.A8M(C54670HOb.CUSTOM_THEME_COMPOSER, "minor_entry_point");
            I6F.A02(A0e, i6f);
        }
        AnonymousClass7TE.A1Z(new MHN(this, (AnonymousClass4D7) null, 32), C318116oQ.A00(this));
    }

    public final void A03(View view, C53368Gms gms) {
        boolean A1Z = AnonymousClass7TG.A1Z(gms, view);
        if (Build.VERSION.SDK_INT >= 30) {
            if (182.A06(0Tu.A05, this.A0C.A00, 36326687361021865L)) {
                view.performHapticFeedback(A1Z ? 1 : 0);
            }
        }
        String A16 = AnonymousClass7TE.A16(view.getContext(), gms.A01);
        AnonymousClass4D7 A0t = C51975G9x.A0t(this.A08);
        this.A08 = C51966G9m.A1L(new AiThemesViewModel$onExamplePromptClicked$1(this, A16, A0t), C318116oQ.A00(this));
    }
}
