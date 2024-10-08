package X;

import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6cP  reason: invalid class name and case insensitive filesystem */
public final class C311266cP implements AnonymousClass6Z1, AnonymousClass3PN {
    public String A00 = "";
    public final C229392nJ A01;
    public final UserSession A02;
    public final ReelViewerConfig A03;
    public final AnonymousClass3BQ A04;
    public final C2366434n A05;
    public final C270414gh A06;
    public final C309666Zd A07;
    public final ReelViewerFragment A08;
    public final C310236ae A09;
    public final Set A0A = new HashSet();

    public C311266cP(C229392nJ r2, UserSession userSession, ReelViewerConfig reelViewerConfig, AnonymousClass3BQ r5, C2366434n r6, C270414gh r7, C309666Zd r8, ReelViewerFragment reelViewerFragment, C310236ae r10) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r7, 2);
        0qQ.A0B(r5, 4);
        0qQ.A0B(r6, 5);
        0qQ.A0B(r10, 6);
        0qQ.A0B(r8, 7);
        0qQ.A0B(reelViewerConfig, 8);
        0qQ.A0B(r2, 9);
        this.A02 = userSession;
        this.A06 = r7;
        this.A08 = reelViewerFragment;
        this.A04 = r5;
        this.A05 = r6;
        this.A09 = r10;
        this.A07 = r8;
        this.A03 = reelViewerConfig;
        this.A01 = r2;
    }

    public final /* synthetic */ void D7Q(C255773uh r1, C250973mM r2, C316026kz r3, C309426Yf r4) {
    }

    public final /* synthetic */ void DLs(Reel reel) {
    }

    public final /* synthetic */ void DMq(int i) {
    }

    public final /* synthetic */ void DNx() {
    }

    public final /* synthetic */ void DNy() {
    }

    public final void DOJ(String str) {
    }

    public final /* synthetic */ void DVL() {
    }

    public final /* synthetic */ void DWT(String str) {
    }

    public final /* synthetic */ void Dfe() {
    }

    public final /* synthetic */ void DiL(int i) {
    }

    public final /* synthetic */ void DiM(int i, int i2) {
    }

    public final /* synthetic */ void DiO(int i, int i2) {
    }

    public final /* synthetic */ void DiP() {
    }

    public final /* synthetic */ void DxL() {
    }

    public final /* synthetic */ void DxN() {
    }

    public final /* synthetic */ void DxU() {
    }

    public final /* synthetic */ void DyN(C255773uh r1, C316036l0 r2) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ boolean BVb() {
        return false;
    }

    public final /* synthetic */ int BrB() {
        return 0;
    }

    public final /* synthetic */ boolean Bu3() {
        return false;
    }

    public final /* synthetic */ boolean Cau() {
        return false;
    }

    public final void DOW(String str, boolean z) {
        C250973mM Bl0 = this.A06.Bl0(str);
        if (Bl0 != null) {
            UserSession userSession = this.A02;
            Bl0.A0B(userSession);
            if (!Bl0.A0E(userSession)) {
                this.A05.A02(Bl0.A0H, Bl0.A09(userSession), z);
            }
        }
    }

    public final /* synthetic */ boolean Dpr() {
        return false;
    }

    public final /* synthetic */ boolean Dq0() {
        return false;
    }

    public final /* synthetic */ boolean Dqd() {
        return false;
    }

    public final void onDestroyView() {
        UserSession userSession = this.A02;
        AnonymousClass3PO.A00(userSession).A03(this);
        AnonymousClass3PP A002 = AnonymousClass3PO.A00(userSession);
        Set<AnonymousClass3PN> set = this.A0A;
        0qQ.A0B(set, 0);
        for (AnonymousClass3PN A032 : set) {
            A002.A03(A032);
        }
    }
}
