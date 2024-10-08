package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.search.common.analytics.SearchContext;

public final class GNH extends C52050GCw implements AnonymousClass32U {
    public int A00 = -1;
    public View A01;
    public View A02;
    public IgdsMediaButton A03;
    public C227232is A04;
    public boolean A05;
    public final FragmentActivity A06;
    public final 28D A07;
    public final ClipsViewerSource A08;
    public final AnonymousClass0iw A09;
    public final UserSession A0A;
    public final AnonymousClass93U A0B;
    public final GD6 A0C;
    public final C55684Hlh A0D;
    public final Boolean A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;
    public final SearchContext A0J;
    public final Integer A0K;
    public final boolean A0L;

    public GNH(FragmentActivity fragmentActivity, 28D r3, ClipsViewerSource clipsViewerSource, AnonymousClass0iw r5, UserSession userSession, SearchContext searchContext, AnonymousClass93U r8, GD6 gd6, C55684Hlh hlh, Boolean bool, Integer num, String str, String str2, String str3, boolean z, boolean z2) {
        DbW.A1O(r3, 4, gd6);
        C51974G9v.A1Q(r5, userSession, r8, hlh);
        C51969G9p.A1P(clipsViewerSource, 13, fragmentActivity);
        this.A0F = str;
        this.A0E = bool;
        this.A07 = r3;
        this.A0J = searchContext;
        this.A0C = gd6;
        this.A09 = r5;
        this.A0A = userSession;
        this.A0B = r8;
        this.A0D = hlh;
        this.A0G = str2;
        this.A0H = str3;
        this.A08 = clipsViewerSource;
        this.A06 = fragmentActivity;
        this.A0L = z;
        this.A0K = num;
        this.A0I = z2;
    }

    public static final boolean A01(C267324bN r3) {
        C295365o2 r1;
        C295365o2 r12;
        C295365o2 r2 = null;
        if (r3 != null) {
            r1 = r3.A01;
        } else {
            r1 = null;
        }
        if (r1 != C295365o2.PREVIEW) {
            if (r3 != null) {
                r12 = r3.A01;
            } else {
                r12 = null;
            }
            if (r12 != C295365o2.GHOST && !AnonymousClass3ZC.A0B(r3)) {
                if (r3 != null) {
                    r2 = r3.A01;
                }
                if (r2 == C295365o2.MIDCARD) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r2.getContentDescription() == null) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.C267324bN r4, boolean r5) {
        /*
            r3 = this;
            r1 = 0
            if (r4 == 0) goto L_0x003a
            X.1Xj r0 = r4.A02
            if (r0 == 0) goto L_0x003a
            X.46h r0 = r0.A1O()
            if (r0 == 0) goto L_0x003a
            com.instagram.api.schemas.MusicInfo r0 = r0.A00
            com.instagram.music.common.model.MusicConsumptionModel r0 = r0.BUp()
            if (r0 == 0) goto L_0x003a
            java.lang.Boolean r0 = r0.Ab6()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r1)
        L_0x001d:
            r0 = r0 ^ 1
            com.instagram.igds.components.mediabutton.IgdsMediaButton r2 = r3.A03
            if (r2 == 0) goto L_0x0033
            if (r0 == 0) goto L_0x002e
            if (r5 == 0) goto L_0x002e
            java.lang.CharSequence r1 = r2.getContentDescription()
            r0 = 0
            if (r1 != 0) goto L_0x0030
        L_0x002e:
            r0 = 8
        L_0x0030:
            r2.setVisibility(r0)
        L_0x0033:
            r3.A0C()
            A00(r3)
            return
        L_0x003a:
            r0 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GNH.A0E(X.4bN, boolean):void");
    }

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final /* synthetic */ void DhU(Integer num) {
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.GNH r5) {
        /*
            com.instagram.clips.intf.ClipsViewerSource r0 = r5.A08
            int r0 = r0.ordinal()
            r3 = 8
            r2 = 0
            switch(r0) {
                case 3: goto L_0x0059;
                case 5: goto L_0x004e;
                case 8: goto L_0x0064;
                case 11: goto L_0x0064;
                case 13: goto L_0x0064;
                case 26: goto L_0x0064;
                case 46: goto L_0x007a;
                case 56: goto L_0x006f;
                case 67: goto L_0x0064;
                case 79: goto L_0x004e;
                case 81: goto L_0x0064;
                case 129: goto L_0x0094;
                case 131: goto L_0x004e;
                case 136: goto L_0x0085;
                default: goto L_0x000c;
            }
        L_0x000c:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r5.A03
            if (r0 == 0) goto L_0x0013
            r0.setVisibility(r3)
        L_0x0013:
            r1 = r2
            r4 = r2
        L_0x0015:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r3 = r5.A03
            if (r3 == 0) goto L_0x0030
            if (r1 == 0) goto L_0x004c
            int r1 = r1.intValue()
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L_0x004c
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = r0.getString(r1)
        L_0x002d:
            r3.setLabel(r0)
        L_0x0030:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r3 = r5.A03
            if (r3 == 0) goto L_0x004b
            if (r4 == 0) goto L_0x0048
            int r1 = r4.intValue()
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L_0x0048
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x0048
            java.lang.String r2 = r0.getString(r1)
        L_0x0048:
            r3.setContentDescription(r2)
        L_0x004b:
            return
        L_0x004c:
            r0 = r2
            goto L_0x002d
        L_0x004e:
            r0 = 2131976201(0x7f136009, float:1.9589516E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131956112(0x7f131190, float:1.954877E38)
            goto L_0x008f
        L_0x0059:
            r0 = 2131976205(0x7f13600d, float:1.9589524E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131956113(0x7f131191, float:1.9548773E38)
            goto L_0x008f
        L_0x0064:
            r0 = 2131956116(0x7f131194, float:1.9548779E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131956115(0x7f131193, float:1.9548777E38)
            goto L_0x008f
        L_0x006f:
            r0 = 2131971961(0x7f134f79, float:1.9580916E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131956114(0x7f131192, float:1.9548775E38)
            goto L_0x008f
        L_0x007a:
            r0 = 2131976209(0x7f136011, float:1.9589532E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131976210(0x7f136012, float:1.9589534E38)
            goto L_0x008f
        L_0x0085:
            r0 = 2131956079(0x7f13116f, float:1.9548704E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131956080(0x7f131170, float:1.9548706E38)
        L_0x008f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L_0x0015
        L_0x0094:
            java.lang.Integer r1 = r5.A0K
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x000c
            r0 = 2131963566(0x7f132eae, float:1.956389E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r4 = r1
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GNH.A00(X.GNH):void");
    }

    public final void A0D() {
        C52012GBj gBj;
        Integer valueOf;
        C52012GBj gBj2;
        Integer valueOf2;
        C52012GBj gBj3;
        Integer valueOf3;
        if (this.A0I) {
            return;
        }
        if (this.A00 == -1 || (gBj3 = this.A02) == null || (valueOf3 = Integer.valueOf(gBj3.A06())) == null || valueOf3.intValue() < this.A00) {
            C267324bN A0C2 = A0C();
            boolean A012 = A01(A0C2);
            if (!A012 || ((this.A0L && (gBj2 = this.A02) != null && (valueOf2 = Integer.valueOf(gBj2.A06())) != null && valueOf2.intValue() == 0) || (this.A05 && (gBj = this.A02) != null && (valueOf = Integer.valueOf(gBj.A06())) != null && valueOf.intValue() == 0))) {
                AnonymousClass7TH.A0R(this.A02);
            } else {
                AnonymousClass7TF.A16(this.A02);
            }
            A0E(A0C2, A012);
            return;
        }
        AnonymousClass7TH.A0R(this.A02);
    }

    public final C267324bN A0C() {
        int intValue;
        Integer A082 = C52050GCw.A08(this);
        if (A082 == null || (intValue = A082.intValue()) < 0) {
            return null;
        }
        C52009GBg gBg = this.A0C.A0A;
        if (intValue < gBg.A0A()) {
            return gBg.A0E(intValue);
        }
        return null;
    }

    public final void DW8(int i, int i2) {
        A0D();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.A02 = null;
        this.A01 = null;
        this.A03 = null;
    }
}
