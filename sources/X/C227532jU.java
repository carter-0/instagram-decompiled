package X;

import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.io.Serializable;
import kotlin.Deprecated;

/* renamed from: X.2jU  reason: invalid class name and case insensitive filesystem */
public final class C227532jU extends C227542jV implements AnonymousClass4DU, AnonymousClass4DR, C227252iu, C227262iv, AnonymousClass4DS, AnonymousClass4DT, C227562jX, C227302iz, C227312j0, AnonymousClass4DO {
    public static final String __redex_internal_original_name = "IgTabHostFragment";
    public C227782ju A00;
    public String A01;
    public Bundle A02;
    public C227762js A03;
    public boolean A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass06Q A06 = new C227652jg(this);

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    @Deprecated(message = "Deprecated in Android")
    public final void onAttachFragment(Fragment fragment) {
        Bundle bundle;
        0qQ.A0B(fragment, 0);
        this.A00 = C227782ju.ATTACHED;
        String str = this.A01;
        if (str != null && str.equals(fragment.mTag) && (fragment instanceof C227262iv) && (bundle = this.A02) != null) {
            ((C227262iv) fragment).EVp(bundle);
            this.A02 = null;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C227782ju r1 = this.A00;
        if (r1 != null) {
            bundle.putSerializable("KEY_TAB_HOST_FRAGMENT_LOADING_STATE", r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01f7, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r1 = new java.lang.RuntimeException("Unknown starting fragment.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.fragment.app.Fragment A00(java.lang.String r15) {
        /*
            r14 = this;
            r12 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r12)
            if (r0 == 0) goto L_0x0010
            r1 = 2083744956(0x7c336cbc, float:3.726506E36)
            java.lang.String r0 = "IgTabHostFragment.loadTabFragment"
            X.0fS.A01(r0, r1)
        L_0x0010:
            java.lang.String r5 = "ig_tab_host"
            int r0 = r15.hashCode()     // Catch:{ all -> 0x01f8 }
            switch(r0) {
                case -869920652: goto L_0x010f;
                case -859263443: goto L_0x00f5;
                case -859024542: goto L_0x00db;
                case -746371465: goto L_0x00c0;
                case 354534074: goto L_0x0088;
                case 1600254799: goto L_0x006b;
                case 1636420627: goto L_0x004c;
                case 1926909838: goto L_0x0021;
                default: goto L_0x0019;
            }     // Catch:{ all -> 0x01f8 }
        L_0x0019:
            java.lang.String r0 = "Unknown starting fragment."
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x01f8 }
            r1.<init>(r0)     // Catch:{ all -> 0x01f8 }
        L_0x0020:
            throw r1     // Catch:{ all -> 0x01f8 }
        L_0x0021:
            java.lang.String r0 = "fragment_direct_tab"
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x0019
            X.1as r0 = X.1as.A04     // Catch:{ all -> 0x01f8 }
            X.1ap r4 = r0.A02     // Catch:{ all -> 0x01f8 }
            X.0eM r3 = r14.A05     // Catch:{ all -> 0x01f8 }
            java.lang.Object r1 = r3.getValue()     // Catch:{ all -> 0x01f8 }
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1     // Catch:{ all -> 0x01f8 }
            r0 = 0
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x01f8 }
            java.lang.String r2 = r1.A05     // Catch:{ all -> 0x01f8 }
            r1 = 0
            r0 = 1
            X.4mt r5 = r4.A09(r1, r2, r0)     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x01f8 }
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0     // Catch:{ all -> 0x01f8 }
            X.AnonymousClass2kI.A00(r5, r0)     // Catch:{ all -> 0x01f8 }
            goto L_0x01eb
        L_0x004c:
            java.lang.String r0 = "fragment_panel_direct"
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x0019
            X.1as r0 = X.1as.A04     // Catch:{ all -> 0x01f8 }
            X.1ap r2 = r0.A02     // Catch:{ all -> 0x01f8 }
            r1 = 0
            r0 = 0
            X.4mt r5 = r2.A09(r1, r1, r0)     // Catch:{ all -> 0x01f8 }
            X.0eM r0 = r14.A05     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01f8 }
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0     // Catch:{ all -> 0x01f8 }
            X.AnonymousClass2kI.A00(r5, r0)     // Catch:{ all -> 0x01f8 }
            goto L_0x01eb
        L_0x006b:
            java.lang.String r0 = "fragment_panel_camera"
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x0019
            X.AnonymousClass36R.A01()     // Catch:{ all -> 0x01f8 }
            X.9PE r5 = new X.9PE     // Catch:{ all -> 0x01f8 }
            r5.<init>()     // Catch:{ all -> 0x01f8 }
            X.0eM r0 = r14.A05     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01f8 }
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0     // Catch:{ all -> 0x01f8 }
            X.AnonymousClass2kI.A00(r5, r0)     // Catch:{ all -> 0x01f8 }
            goto L_0x01eb
        L_0x0088:
            java.lang.String r0 = "fragment_profile"
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x0019
            X.1a0 r0 = X.C46447Df9.A03()     // Catch:{ all -> 0x01f8 }
            X.1a1 r4 = r0.A01     // Catch:{ all -> 0x01f8 }
            X.0eM r3 = r14.A05     // Catch:{ all -> 0x01f8 }
            java.lang.Object r2 = r3.getValue()     // Catch:{ all -> 0x01f8 }
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2     // Catch:{ all -> 0x01f8 }
            java.lang.Object r1 = r3.getValue()     // Catch:{ all -> 0x01f8 }
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1     // Catch:{ all -> 0x01f8 }
            java.lang.String r0 = "tab_button"
            X.Dfc r1 = X.C46548Dgp.A00(r1, r0, r5)     // Catch:{ all -> 0x01f8 }
            r0 = 1
            r1.A0V = r0     // Catch:{ all -> 0x01f8 }
            com.instagram.profile.intf.UserDetailLaunchConfig r0 = r1.A04()     // Catch:{ all -> 0x01f8 }
            androidx.fragment.app.Fragment r5 = r4.A02(r2, r0)     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x01f8 }
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0     // Catch:{ all -> 0x01f8 }
            X.AnonymousClass2kI.A00(r5, r0)     // Catch:{ all -> 0x01f8 }
            goto L_0x01eb
        L_0x00c0:
            java.lang.String r0 = "fragment_search"
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x0019
            X.1pN r1 = X.1pN.A04     // Catch:{ all -> 0x01f8 }
            r0 = 0
            if (r1 == 0) goto L_0x00ce
            r0 = 1
        L_0x00ce:
            if (r0 == 0) goto L_0x00d2
            goto L_0x01c6
        L_0x00d2:
            java.lang.String r0 = "Explore fragment not available!"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x01f8 }
            r1.<init>(r0)     // Catch:{ all -> 0x01f8 }
            goto L_0x0020
        L_0x00db:
            java.lang.String r0 = "fragment_news"
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x0019
            com.instagram.newsfeed.fragment.NewsfeedFragment r5 = new com.instagram.newsfeed.fragment.NewsfeedFragment     // Catch:{ all -> 0x01f8 }
            r5.<init>()     // Catch:{ all -> 0x01f8 }
            X.0eM r0 = r14.A05     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01f8 }
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0     // Catch:{ all -> 0x01f8 }
            X.AnonymousClass2kI.A00(r5, r0)     // Catch:{ all -> 0x01f8 }
            goto L_0x01eb
        L_0x00f5:
            java.lang.String r0 = "fragment_feed"
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x0019
            X.2jw r5 = new X.2jw     // Catch:{ all -> 0x01f8 }
            r5.<init>()     // Catch:{ all -> 0x01f8 }
            X.0eM r0 = r14.A05     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01f8 }
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0     // Catch:{ all -> 0x01f8 }
            X.AnonymousClass2kI.A00(r5, r0)     // Catch:{ all -> 0x01f8 }
            goto L_0x01eb
        L_0x010f:
            java.lang.String r0 = "fragment_clips"
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x0019
            android.content.Context r1 = r14.requireContext()     // Catch:{ all -> 0x01f8 }
            X.0eM r4 = r14.A05     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x01f8 }
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0     // Catch:{ all -> 0x01f8 }
            r6 = 1
            X.0qQ.A0B(r0, r6)     // Catch:{ all -> 0x01f8 }
            X.9FT r2 = new X.9FT     // Catch:{ all -> 0x01f8 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x01f8 }
            com.instagram.common.session.UserSession r5 = r2.A01     // Catch:{ all -> 0x01f8 }
            X.4hI r9 = X.C270774hH.A00(r5)     // Catch:{ all -> 0x01f8 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01f8 }
            long r0 = r9.A00     // Catch:{ all -> 0x01f8 }
            long r10 = r10 - r0
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x01f8 }
            com.instagram.common.session.UserSession r0 = r9.A02     // Catch:{ all -> 0x01f8 }
            long r0 = X.AnonymousClass93Q.A00(r0)     // Catch:{ all -> 0x01f8 }
            long r7 = r3.toMillis(r0)     // Catch:{ all -> 0x01f8 }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b3
            X.1Xj r1 = r9.A01     // Catch:{ all -> 0x01f8 }
            if (r1 == 0) goto L_0x01b3
            boolean r0 = r1.A50()     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x01b3
            X.93Q r0 = X.AnonymousClass93Q.A00     // Catch:{ all -> 0x01f8 }
            boolean r0 = r0.A09(r5)     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x01b3
        L_0x015b:
            android.content.Context r3 = r2.A00     // Catch:{ all -> 0x01f8 }
            java.lang.String r2 = " ReelsViewerVideoPreWarmer"
            X.3WR r1 = r1.CEL()     // Catch:{ all -> 0x01f8 }
            X.4U8 r0 = new X.4U8     // Catch:{ all -> 0x01f8 }
            r0.<init>(r3, r5, r1, r2)     // Catch:{ all -> 0x01f8 }
            r0.A04 = r6     // Catch:{ all -> 0x01f8 }
            r0.A02 = r6     // Catch:{ all -> 0x01f8 }
            X.4U9 r0 = r0.A00()     // Catch:{ all -> 0x01f8 }
            X.AnonymousClass4UA.A00(r0)     // Catch:{ all -> 0x01f8 }
        L_0x0173:
            java.lang.Object r3 = r4.getValue()     // Catch:{ all -> 0x01f8 }
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3     // Catch:{ all -> 0x01f8 }
            r0 = 0
            X.0qQ.A0B(r3, r0)     // Catch:{ all -> 0x01f8 }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x01f8 }
            r2.<init>()     // Catch:{ all -> 0x01f8 }
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_TAB     // Catch:{ all -> 0x01f8 }
            X.4h3 r1 = new X.4h3     // Catch:{ all -> 0x01f8 }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x01f8 }
            X.2gm r0 = X.C226412gl.A00(r3)     // Catch:{ all -> 0x01f8 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x01f8 }
            r1.A1M = r0     // Catch:{ all -> 0x01f8 }
            com.instagram.clips.intf.ClipsViewerConfig r1 = r1.A00()     // Catch:{ all -> 0x01f8 }
            java.lang.String r0 = "ClipsViewerLauncher.KEY_CONFIG"
            r2.putParcelable(r0, r1)     // Catch:{ all -> 0x01f8 }
            X.2is r5 = new X.2is     // Catch:{ all -> 0x01f8 }
            r5.<init>()     // Catch:{ all -> 0x01f8 }
            java.lang.String r1 = r3.A05     // Catch:{ all -> 0x01f8 }
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r2.putString(r0, r1)     // Catch:{ all -> 0x01f8 }
            r5.setArguments(r2)     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x01f8 }
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0     // Catch:{ all -> 0x01f8 }
            X.AnonymousClass2kI.A00(r5, r0)     // Catch:{ all -> 0x01f8 }
            goto L_0x01eb
        L_0x01b3:
            X.93C r1 = X.AnonymousClass93C.A04     // Catch:{ all -> 0x01f8 }
            X.93F r0 = X.AnonymousClass93D.A00(r5, r1)     // Catch:{ all -> 0x01f8 }
            X.1Xj r1 = r0.E2E(r1)     // Catch:{ all -> 0x01f8 }
            if (r1 == 0) goto L_0x0173
            boolean r0 = r1.A50()     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x0173
            goto L_0x015b
        L_0x01c6:
            X.1pN r0 = X.C243443Yu.A00()     // Catch:{ all -> 0x01f8 }
            X.0eM r0 = r0.A01     // Catch:{ all -> 0x01f8 }
            java.lang.Object r3 = r0.getValue()     // Catch:{ all -> 0x01f8 }
            X.HpU r3 = (X.C55907HpU) r3     // Catch:{ all -> 0x01f8 }
            X.0eM r2 = r14.A05     // Catch:{ all -> 0x01f8 }
            java.lang.Object r1 = r2.getValue()     // Catch:{ all -> 0x01f8 }
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1     // Catch:{ all -> 0x01f8 }
            r0 = 0
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x01f8 }
            X.32L r5 = r3.A00(r0)     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x01f8 }
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0     // Catch:{ all -> 0x01f8 }
            X.AnonymousClass2kI.A00(r5, r0)     // Catch:{ all -> 0x01f8 }
        L_0x01eb:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r12)
            if (r0 == 0) goto L_0x01f7
            r0 = -383240891(0xffffffffe9283545, float:-1.2709443E25)
            X.0fS.A00(r0)
        L_0x01f7:
            return r5
        L_0x01f8:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r12)
            if (r0 == 0) goto L_0x0205
            r0 = 437285882(0x1a1073fa, float:2.9872187E-23)
            X.0fS.A00(r0)
        L_0x0205:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227532jU.A00(java.lang.String):androidx.fragment.app.Fragment");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        if (X.182.A06(X.0Tu.A05, (com.instagram.common.session.UserSession) r3.A05.getValue(), 36327829822257894L) != false) goto L_0x003b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(boolean r18) {
        /*
            r17 = this;
            r8 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L_0x0010
            r1 = -104766265(0xfffffffff9c164c7, float:-1.2551966E35)
            java.lang.String r0 = "IgTabHostFragment.loadFragment"
            X.0fS.A01(r0, r1)
        L_0x0010:
            X.2ju r0 = X.C227782ju.LOADED     // Catch:{ all -> 0x010e }
            r3 = r17
            r3.A00 = r0     // Catch:{ all -> 0x010e }
            androidx.fragment.app.Fragment r0 = r3.A02()     // Catch:{ all -> 0x010e }
            if (r0 != 0) goto L_0x0101
            java.lang.String r1 = "fragment_feed"
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x010e }
            boolean r5 = r1.equals(r0)     // Catch:{ all -> 0x010e }
            if (r18 == 0) goto L_0x007f
            X.0eM r0 = r3.A05     // Catch:{ all -> 0x010e }
            java.lang.Object r4 = r0.getValue()     // Catch:{ all -> 0x010e }
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4     // Catch:{ all -> 0x010e }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x010e }
            r0 = 36327829822257894(0x810ff800043ae6, double:3.037204087800747E-306)
            boolean r0 = X.182.A06(r2, r4, r0)     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x007f
        L_0x003b:
            X.0hq r6 = r3.getChildFragmentManager()     // Catch:{ all -> 0x010e }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x010e }
            X.0s1 r5 = new X.0s1     // Catch:{ all -> 0x010e }
            r5.<init>(r6)     // Catch:{ all -> 0x010e }
            X.0eM r4 = r3.A05     // Catch:{ all -> 0x010e }
            java.lang.Object r1 = r4.getValue()     // Catch:{ all -> 0x010e }
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1     // Catch:{ all -> 0x010e }
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x010e }
            r0.getClass()     // Catch:{ all -> 0x010e }
            androidx.fragment.app.Fragment r0 = r3.A00(r0)     // Catch:{ all -> 0x010e }
            androidx.fragment.app.Fragment r2 = X.C227912kJ.A00(r0, r1)     // Catch:{ all -> 0x010e }
            r1 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x010e }
            r5.A0C(r2, r0, r1)     // Catch:{ all -> 0x010e }
            r5.A00()     // Catch:{ all -> 0x010e }
            java.lang.Object r3 = r4.getValue()     // Catch:{ all -> 0x010e }
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3     // Catch:{ all -> 0x010e }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x010e }
            r0 = 36330131924468187(0x811210000041db, double:3.0386599465083576E-306)
            boolean r0 = X.182.A06(r2, r3, r0)     // Catch:{ all -> 0x010e }
            if (r0 != 0) goto L_0x0101
            r6.A0a()     // Catch:{ all -> 0x010e }
            goto L_0x0101
        L_0x007f:
            if (r5 == 0) goto L_0x003b
            X.0eM r7 = r3.A05     // Catch:{ all -> 0x010e }
            java.lang.Object r2 = r7.getValue()     // Catch:{ all -> 0x010e }
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2     // Catch:{ all -> 0x010e }
            X.0Tu r6 = X.0Tu.A05     // Catch:{ all -> 0x010e }
            r0 = 36327829821995746(0x810ff800003ae2, double:3.037204087634963E-306)
            boolean r0 = X.182.A06(r6, r2, r0)     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x010e }
            r0.getClass()     // Catch:{ all -> 0x010e }
            androidx.fragment.app.Fragment r5 = r3.A00(r0)     // Catch:{ all -> 0x010e }
            X.VeX r0 = X.AD2.A02     // Catch:{ all -> 0x010e }
            X.AD2 r1 = r0.A00()     // Catch:{ all -> 0x010e }
            boolean r0 = r1.A00     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x00b7
            X.02m r4 = r1.A01     // Catch:{ all -> 0x010e }
            r2 = 77666176(0x4a11780, float:3.78725E-36)
            r4.markerStart(r2)     // Catch:{ all -> 0x010e }
            r1 = 1
            java.lang.String r0 = "logger_version"
            r4.markerAnnotate(r2, r0, r1)     // Catch:{ all -> 0x010e }
        L_0x00b7:
            java.lang.Object r13 = r7.getValue()     // Catch:{ all -> 0x010e }
            com.instagram.common.session.UserSession r13 = (com.instagram.common.session.UserSession) r13     // Catch:{ all -> 0x010e }
            java.lang.Object r2 = r7.getValue()     // Catch:{ all -> 0x010e }
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2     // Catch:{ all -> 0x010e }
            r0 = 36327829822061283(0x810ff800013ae3, double:3.037204087676409E-306)
            boolean r16 = X.182.A06(r6, r2, r0)     // Catch:{ all -> 0x010e }
            r0 = 12
            X.9Lt r11 = new X.9Lt     // Catch:{ all -> 0x010e }
            r11.<init>(r0, r5, r3)     // Catch:{ all -> 0x010e }
            r0 = 13
            X.9Lt r12 = new X.9Lt     // Catch:{ all -> 0x010e }
            r12.<init>(r0, r5, r3)     // Catch:{ all -> 0x010e }
            X.0nV r0 = X.C63532Kyh.A00     // Catch:{ all -> 0x010e }
            r0 = 0
            X.0qQ.A0B(r13, r0)     // Catch:{ all -> 0x010e }
            X.07V r0 = r3.getLifecycle()     // Catch:{ all -> 0x010e }
            X.0xx r2 = X.C71772f0.A00(r0)     // Catch:{ all -> 0x010e }
            r14 = 0
            r15 = 10
            X.JTf r10 = new X.JTf     // Catch:{ all -> 0x010e }
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x010e }
            X.19B r1 = X.19B.A00     // Catch:{ all -> 0x010e }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x010e }
            X.1Eo.A03(r0, r1, r10, r2)     // Catch:{ all -> 0x010e }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L_0x010d
            r0 = -1247230284(0xffffffffb5a8c6b4, float:-1.2574806E-6)
            goto L_0x010a
        L_0x0101:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L_0x010d
            r0 = -1332716378(0xffffffffb0905ca6, float:-1.0503711E-9)
        L_0x010a:
            X.0fS.A00(r0)
        L_0x010d:
            return
        L_0x010e:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L_0x011b
            r0 = 1979934708(0x760367f4, float:6.663079E32)
            X.0fS.A00(r0)
        L_0x011b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227532jU.A01(boolean):void");
    }

    public final C227762js BD0() {
        C227762js r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("scrollableNavigationHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        0lg r5 = (0lg) this.A05.getValue();
        FragmentActivity activity = getActivity();
        0hq childFragmentManager = getChildFragmentManager();
        AnonymousClass4DR A0P = childFragmentManager.A0P(R.id.layout_container_main);
        if (((A0P instanceof AnonymousClass4DR) && A0P.onBackPressed()) || !AnonymousClass06S.A01(childFragmentManager)) {
            return true;
        }
        C71342cb.A00(r5).A0A(activity, "back");
        return childFragmentManager.A13();
    }

    public final Fragment A02() {
        if (!isAdded()) {
            return null;
        }
        return getChildFragmentManager().A0P(R.id.layout_container_main);
    }

    public final boolean A03() {
        C227532jU A022 = A02();
        if (A022 instanceof C227532jU) {
            return A022.A03();
        }
        return false;
    }

    public final boolean CIn(int i, KeyEvent keyEvent) {
        C227562jX A0P = getChildFragmentManager().A0P(R.id.layout_container_main);
        if (!(A0P instanceof C227562jX) || !A0P.CIn(i, keyEvent)) {
            return false;
        }
        return true;
    }

    public final boolean CbJ() {
        AnonymousClass4DT A002 = C227672jj.A00(getChildFragmentManager());
        if (!(A002 instanceof AnonymousClass4DT) || !A002.CbJ()) {
            return false;
        }
        return true;
    }

    public final boolean EBF() {
        C227302iz A022 = A02();
        if (A022 instanceof C227302iz) {
            return A022.EBF();
        }
        return false;
    }

    public final void EKl() {
        C227252iu A022 = A02();
        if (A022 instanceof C227252iu) {
            A022.EKl();
        }
    }

    public final void EVp(Bundle bundle) {
        C227262iv A0R = getChildFragmentManager().A0R(this.A01);
        this.A02 = bundle;
        if (A0R instanceof C227262iv) {
            A0R.EVp(bundle);
        } else if (this.A00 != C227782ju.ATTACHED) {
            return;
        }
        this.A02 = null;
    }

    public final void FHu() {
        C227312j0 A022 = A02();
        if (A022 instanceof C227312j0) {
            A022.FHu();
        }
    }

    public final void configureActionBar(2da r4) {
        Fragment A022 = A02();
        if (A022 != null && A022.isVisible()) {
            C227672jj.A02(requireActivity(), getChildFragmentManager());
            this.A04 = true;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0008: MOVE  (r1v1 X.4DO) = (r1v0 X.4DO)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final boolean getCanShowVoiceMessageBar() {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r1 = r2.A02()
            boolean r0 = r1 instanceof X.AnonymousClass4DO
            if (r0 == 0) goto L_0x0011
            X.4DO r1 = (X.AnonymousClass4DO) r1
            if (r1 == 0) goto L_0x0011
            boolean r0 = r1.getCanShowVoiceMessageBar()
            return r0
        L_0x0011:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227532jU.getCanShowVoiceMessageBar():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        switch(r0.intValue()) {
            case 1: goto L_0x0080;
            case 2: goto L_0x006d;
            case 3: goto L_0x006d;
            case 4: goto L_0x007d;
            case 5: goto L_0x007a;
            case 6: goto L_0x0077;
            case 7: goto L_0x0074;
            default: goto L_0x006d;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        return X.AnonymousClass000.A00(3542);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        return "main_clips";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0077, code lost:
        return "shopping";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        return "main_profile";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
        return "main_search";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        return "main_inbox";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        throw new java.lang.IllegalStateException(X.002.A0R("Should call on instantiated fragment instead: ", r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getModuleName() {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.A02()
            if (r0 == 0) goto L_0x000d
            X.0iw r0 = (X.AnonymousClass0iw) r0
            java.lang.String r0 = r0.getModuleName()
            return r0
        L_0x000d:
            java.lang.String r1 = r2.A01
            r1.getClass()
            int r0 = r1.hashCode()
            switch(r0) {
                case -869920652: goto L_0x005c;
                case -859263443: goto L_0x0051;
                case -859024542: goto L_0x0046;
                case -746371465: goto L_0x003b;
                case 354534074: goto L_0x0030;
                case 1926909838: goto L_0x0025;
                default: goto L_0x0019;
            }
        L_0x0019:
            java.lang.String r0 = "Should call on instantiated fragment instead: "
            java.lang.String r1 = X.002.A0R(r0, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0025:
            java.lang.String r0 = "fragment_direct_tab"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = "direct_inbox"
            return r0
        L_0x0030:
            java.lang.String r0 = "fragment_profile"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0019
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            goto L_0x0066
        L_0x003b:
            java.lang.String r0 = "fragment_search"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0019
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x0066
        L_0x0046:
            java.lang.String r0 = "fragment_news"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0019
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0066
        L_0x0051:
            java.lang.String r0 = "fragment_feed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = "feed_timeline"
            return r0
        L_0x005c:
            java.lang.String r0 = "fragment_clips"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0019
            java.lang.Integer r0 = X.AnonymousClass05K.A15
        L_0x0066:
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x0080;
                case 2: goto L_0x006d;
                case 3: goto L_0x006d;
                case 4: goto L_0x007d;
                case 5: goto L_0x007a;
                case 6: goto L_0x0077;
                case 7: goto L_0x0074;
                default: goto L_0x006d;
            }
        L_0x006d:
            r0 = 3542(0xdd6, float:4.963E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            return r0
        L_0x0074:
            java.lang.String r0 = "main_clips"
            return r0
        L_0x0077:
            java.lang.String r0 = "shopping"
            return r0
        L_0x007a:
            java.lang.String r0 = "main_profile"
            return r0
        L_0x007d:
            java.lang.String r0 = "main_search"
            return r0
        L_0x0080:
            java.lang.String r0 = "main_inbox"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227532jU.getModuleName():java.lang.String");
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException th;
        int i;
        Serializable serializable;
        int A022 = AnonymousClass0fD.A02(300193358);
        if (Systrace.A0E(1)) {
            0fS.A01("IgTabHostFragment.onCreate", -1067439695);
        }
        try {
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                if (bundle2.containsKey("TAB_FRAGMENT_TAG")) {
                    this.A01 = requireArguments().getString("TAB_FRAGMENT_TAG");
                }
            }
            if (this.A01 != null) {
                if (Systrace.A0E(1)) {
                    0fS.A01("IgTabHostFragment.super.onCreate", 1150412741);
                }
                C227532jU.super.onCreate(bundle);
                if (Systrace.A0E(1)) {
                    0fS.A00(-1810779294);
                }
                int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                this.A03 = C227752jr.A00(requireContext(), (Float) null, false);
                getChildFragmentManager().A0s(this.A06);
                Bundle bundle3 = this.mArguments;
                if (bundle != null) {
                    serializable = bundle.getSerializable("KEY_TAB_HOST_FRAGMENT_LOADING_STATE");
                } else {
                    serializable = null;
                }
                C227782ju r1 = (C227782ju) serializable;
                if (r1 == null) {
                    if (bundle3 == null || !bundle3.getBoolean("DELAY_FRAGMENT_LOADING")) {
                        r1 = C227782ju.READY_TO_LOAD_ON_CREATE;
                    } else {
                        r1 = C227782ju.DELAY_LOADING_UNTIL_NEXT_ON_RESUME;
                    }
                }
                this.A00 = r1;
                if (r1 == C227782ju.READY_TO_LOAD_ON_CREATE) {
                    A01(false);
                }
                if (Systrace.A0E(1)) {
                    0fS.A00(1160451869);
                }
                AnonymousClass0fD.A09(-605862155, A022);
                return;
            }
            th = new IllegalStateException("Unknown starting fragment.");
            i = 376110890;
            AnonymousClass0fD.A09(i, A022);
            throw th;
        } catch (Throwable th2) {
            if (Systrace.A0E(1)) {
                0fS.A00(-1985292770);
            }
            AnonymousClass0fD.A09(-217755263, A022);
            throw th2;
        }
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(2133770767);
        super.onDestroy();
        0hq childFragmentManager = getChildFragmentManager();
        childFragmentManager.A0F.remove(this.A06);
        AnonymousClass0fD.A09(-1632351873, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1956949513);
        if (Systrace.A0E(1)) {
            0fS.A01("IgTabHostFragment.onResume", 1668549896);
        }
        try {
            super.onResume();
            C227782ju r1 = this.A00;
            if (r1 == C227782ju.DELAY_LOADING_UNTIL_NEXT_ON_RESUME) {
                this.A00 = C227782ju.READY_TO_LOAD_ON_RESUME;
            } else if (r1 == C227782ju.READY_TO_LOAD_ON_RESUME) {
                A01(true);
                C227672jj.A04(requireActivity(), getChildFragmentManager(), (UserSession) this.A05.getValue());
            }
            if (!182.A06(0Tu.A05, (UserSession) this.A05.getValue(), 36326691655792560L) && !this.A04) {
                C227672jj.A02(requireActivity(), getChildFragmentManager());
                this.A04 = true;
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1330989948);
            }
            AnonymousClass0fD.A09(1363833229, A022);
        }
    }
}
