package X;

import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6UL  reason: invalid class name */
public final class AnonymousClass6UL implements AnonymousClass6VG {
    public final /* synthetic */ C2365134a A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ AnonymousClass3BQ A02;
    public final /* synthetic */ AnonymousClass3N2 A03;

    public AnonymousClass6UL(C2365134a r1, Reel reel, AnonymousClass3BQ r3, AnonymousClass3N2 r4) {
        this.A00 = r1;
        this.A01 = reel;
        this.A03 = r4;
        this.A02 = r3;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.6Ye, java.lang.Object] */
    public final void CfR(long j, boolean z) {
        int i;
        RectF rectF;
        ArrayList A0S;
        C2365134a r11 = this.A00;
        Reel reel = this.A01;
        AnonymousClass3N2 r3 = this.A03;
        AnonymousClass3BQ r13 = this.A02;
        if (Systrace.A0E(1)) {
            0fS.A01("MainFeedReelTrayController.launchAfterPreload", -1373100911);
        }
        try {
            C227812jx r5 = r11.A0D;
            if (r5.isResumed() && C2365134a.A06(r5, r11)) {
                if (r11.A04 == null) {
                    UserSession userSession = r11.A0F;
                    1OP r0 = 1OP.$redex_init_class;
                    r11.A04 = new C315656kI(userSession);
                }
                r3.CLE();
                RectF AeG = r3.AeG();
                if (r3 instanceof C241103Nw) {
                    rectF = ((C241103Nw) r3).BG0();
                } else {
                    rectF = new RectF(AeG.centerX(), AeG.centerY(), AeG.centerX(), AeG.centerY());
                }
                0qQ.A0A(rectF);
                FragmentActivity requireActivity = r5.requireActivity();
                UserSession userSession2 = r11.A0F;
                AnonymousClass3K2 A07 = 1OP.A07(requireActivity, userSession2);
                if (C2365134a.A01(r11).contains(reel)) {
                    A0S = C2365134a.A01(r11);
                } else {
                    List singletonList = Collections.singletonList(reel);
                    0qQ.A07(singletonList);
                    A0S = 00k.A0S(C2365134a.A01(r11), singletonList);
                }
                ? obj = new Object();
                obj.A02(userSession2, reel.getId(), A0S);
                obj.A03(r13);
                obj.A08(r11.A03.A04);
                obj.A01(userSession2);
                obj.A0M = r11.A03.A03;
                obj.A01 = j;
                obj.A0d = z;
                C317766nn r02 = r11.A04;
                if (r02 != null) {
                    obj.A06(r02.A02);
                    AnonymousClass32D r4 = new AnonymousClass32D();
                    A07.A0G = new ReelViewerConfig(r4);
                    r5.mShouldRestoreDefaultTheme = true;
                    AnonymousClass6UM r18 = new AnonymousClass6UM(r11, reel, r4, A07, r3, obj);
                    Collections.emptySet();
                    A07.A0U(AeG, rectF, r11, reel, r13, r18, (String) null, (List) null, -1, false);
                    if (Systrace.A0E(1)) {
                        i = -61232498;
                    } else {
                        return;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (Systrace.A0E(1)) {
                i = -1356009076;
            } else {
                return;
            }
            0fS.A00(i);
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(1922432196);
            }
            throw th;
        }
    }
}
