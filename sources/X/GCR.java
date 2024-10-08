package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import instagram.features.clips.viewer.recipesheet.RecipeSheetParams;

public final class GCR implements JQ6 {
    public final FragmentActivity A00;
    public final AnonymousClass4DH A01;
    public final ClipsViewerSource A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C273414mX A05 = new C57385IZq(this, 13);
    public final AnonymousClass93U A06;
    public final C55948HqC A07;
    public final GIN A08;
    public final C55684Hlh A09;
    public final C52016GBn A0A;
    public final String A0B;
    public final GCQ A0C;

    public final void Cvk(C267324bN r23, C52058GDe gDe, 2EG r25, String str, float f, float f2, int i, boolean z, boolean z2) {
        C52236GKd gKd;
        long j;
        Long l;
        String attributionAppId;
        Long A10;
        C267324bN r7 = r23;
        0qQ.A0B(r7, 0);
        2EG r10 = r25;
        this.A0C.A00(r7, gDe, (C13823Tht) null, r10, (S6e) null, (C55571Hjr) null, (Boolean) null, (String) null, f, f2, z, z2, false);
        AnonymousClass4DH r1 = this.A01;
        0qQ.A0C(r1, "null cannot be cast to non-null type instagram.features.clips.viewer.ClipsViewerFragment");
        View A0K = ((C227232is) r1).A0K();
        if (A0K != null) {
            UserSession userSession = this.A03;
            AnonymousClass4DU r12 = this.A04;
            new C52046GCs(userSession, r12).A03(A0K, C238863Ds.ATTACHMENT, (C59543JNp) null, r7, (Integer) null, false, false);
            C51967G9n.A0X(userSession).A07(A0K, C238863Ds.ATTRIBUTION_ROW_PILL, new String[0], 0);
            if (r10 == 2EG.A12) {
                gKd = C52236GKd.A07;
            } else {
                gKd = C52236GKd.A05;
            }
            1Xj r13 = r7.A02;
            if (r13 != null) {
                AnonymousClass93U r14 = this.A06;
                String A2n = r13.A2n();
                if (A2n == null || (A10 = AnonymousClass7TE.A10(A2n)) == null) {
                    j = 0;
                } else {
                    j = A10.longValue();
                }
                DUF A0j = C51965G9l.A0j(r13);
                if (A0j == null || (attributionAppId = A0j.getAttributionAppId()) == null) {
                    l = null;
                } else {
                    l = AnonymousClass7TE.A10(attributionAppId);
                }
                C52086GEg.A07(AnonymousClass5OC.ATTRIBUTE_PILLS, gKd, r12, userSession, r14, (Integer) null, l, C51974G9v.A0T(userSession, r13), DbT.A0x(r13), i, j);
            }
        }
    }

    public final void Cvl(C267324bN r2, C52058GDe gDe, boolean z) {
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C267324bN r15, GCR gcr, int i) {
        long j;
        Long l;
        String attributionAppId;
        Long A10;
        GCR gcr2 = gcr;
        AnonymousClass4DH r1 = gcr2.A01;
        0qQ.A0C(r1, "null cannot be cast to non-null type instagram.features.clips.viewer.ClipsViewerFragment");
        View A0K = ((C227232is) r1).A0K();
        if (A0K != null) {
            UserSession userSession = gcr2.A03;
            AnonymousClass4DU r5 = gcr2.A04;
            C267324bN r13 = r15;
            new C52046GCs(userSession, r5).A03(A0K, C238863Ds.ATTACHMENT, (C59543JNp) null, r13, (Integer) null, false, false);
            C51967G9n.A0X(userSession).A07(A0K, C238863Ds.ATTRIBUTION_ROW_PILL, new String[0], 0);
            1Xj r12 = r13.A02;
            if (r12 != null) {
                AnonymousClass93U r7 = gcr2.A06;
                String A2n = r12.A2n();
                if (A2n == null || (A10 = AnonymousClass7TE.A10(A2n)) == null) {
                    j = 0;
                } else {
                    j = A10.longValue();
                }
                DUF A0j = C51965G9l.A0j(r12);
                if (A0j == null || (attributionAppId = A0j.getAttributionAppId()) == null) {
                    l = null;
                } else {
                    l = AnonymousClass7TE.A10(attributionAppId);
                }
                C52086GEg.A07(AnonymousClass5OC.ATTRIBUTE_PILLS, C52236GKd.A0L, r5, userSession, r7, (Integer) null, l, C51974G9v.A0T(userSession, r12), DbT.A0x(r12), i, j);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.Hjs, java.lang.Object] */
    public final void A01(C267324bN r28, C52058GDe gDe, 1Xj r30, int i, boolean z) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A03;
        int i2 = i;
        long j = (long) i2;
        C267324bN r3 = r28;
        boolean z2 = !this.A0A.A0X(r3);
        String CFD = this.A06.CFD();
        String str = this.A09.A00;
        String str2 = this.A0B;
        ClipsViewerSource clipsViewerSource = this.A02;
        C56760IBj iBj = new C56760IBj(i2, 5, r3, this);
        C273414mX r6 = this.A05;
        1Xj r15 = r30;
        C57693Iew iew = new C57693Iew(r3, gDe, r15, this, i2);
        AnonymousClass7TF.A1F(CFD, 5, clipsViewerSource);
        0qQ.A0B(r6, 10);
        ? obj = new Object();
        I76 i76 = I76.A00;
        String id = r15.getId();
        if (id != null) {
            RecipeSheetParams recipeSheetParams = new RecipeSheetParams(id, CFD, str, str2, clipsViewerSource.ordinal(), 0, j, z2, false);
            C54165H1k h1k = new C54165H1k();
            Bundle A092 = DbY.A09(userSession);
            A092.putParcelable("arg_extra_params", recipeSheetParams);
            h1k.setArguments(A092);
            h1k.A03 = iew;
            C331127Pr A0W = DbS.A0W(userSession);
            A0W.A0d = fragmentActivity.getText(2131971375);
            A0W.A06 = fragmentActivity.getColor(2Yu.A0C(fragmentActivity));
            A0W.A1G = !r15.CcK();
            A0W.A03 = i76.A06(fragmentActivity, userSession, r15, false);
            A0W.A0y = true;
            A0W.A0x = false;
            DbS.A1S(A0W, false);
            A0W.A0T = h1k;
            A0W.A0U = r6;
            if (z) {
                0mM r32 = new 0mM(AnonymousClass7TF.A0D(), new C19304WTm(3, iBj, obj), 300);
                C331137Ps A0h = C51971G9r.A0h(0);
                A0h.A02 = R.drawable.instagram_camera_outline_44;
                A0h.A05 = C56801ICy.A00(r32, 65);
                A0W.A07(A0h.A00());
            }
            C331157Pu A022 = A0W.A00().A02(fragmentActivity, h1k);
            h1k.A02 = A022;
            obj.A00 = A022;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public GCR(FragmentActivity fragmentActivity, AnonymousClass4DH r4, ClipsViewerSource clipsViewerSource, UserSession userSession, AnonymousClass4DU r7, AnonymousClass93U r8, C55948HqC hqC, GCQ gcq, GIN gin, C55684Hlh hlh, C52016GBn gBn, String str) {
        AnonymousClass7TG.A1Q(r7, userSession);
        C51973G9u.A0s(6, gBn, gin, r8);
        0qQ.A0B(hlh, 9);
        0qQ.A0B(hqC, 11);
        this.A00 = fragmentActivity;
        this.A04 = r7;
        this.A03 = userSession;
        this.A01 = r4;
        this.A0B = str;
        this.A0A = gBn;
        this.A08 = gin;
        this.A06 = r8;
        this.A09 = hlh;
        this.A0C = gcq;
        this.A07 = hqC;
        this.A02 = clipsViewerSource;
    }
}
