package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6ZR  reason: invalid class name */
public final class AnonymousClass6ZR implements 1wn {
    public final /* synthetic */ AnonymousClass6ZO A00;

    public AnonymousClass6ZR(AnonymousClass6ZO r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        Context context;
        int i2;
        String str;
        Object tag;
        String str2;
        int A03 = AnonymousClass0fD.A03(2020743690);
        C317326n5 r6 = (C317326n5) obj;
        int A032 = AnonymousClass0fD.A03(-1820715899);
        0qQ.A0B(r6, 0);
        AnonymousClass6ZO r8 = this.A00;
        Fragment fragment = (Fragment) r8.A08.get();
        if (fragment == null || (context = fragment.getContext()) == null) {
            i = -1691517429;
        } else {
            C273384mU r0 = r8.A06;
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r0;
            C250973mM r12 = reelViewerFragment.A0a;
            if (r12 == null) {
                i = 901965666;
            } else {
                C255773uh Au5 = r0.Au5();
                if (Au5 == null) {
                    i = 1794833743;
                } else {
                    C313056fm r7 = reelViewerFragment.mViewPager;
                    if (r7 == null) {
                        i = -1873809537;
                    } else {
                        int CMG = reelViewerFragment.A1E.CMG(r12.A0H);
                        View view = ((C313046fl) r7).A04.A0F;
                        if (!(view == null || (tag = view.getTag()) == null)) {
                            String str3 = null;
                            if (tag instanceof C316006kx) {
                                1Xj r02 = Au5.A0b;
                                if (r02 != null) {
                                    str3 = r02.getId();
                                }
                                if (0qQ.A0K(str3, r6.A01)) {
                                    UserSession userSession = r8.A00;
                                    if (userSession == null) {
                                        str2 = "userSession";
                                    } else {
                                        C316136lA r72 = ((C316006kx) tag).A1e;
                                        C309426Yf Bz3 = ((C310566bG) reelViewerFragment.A1E).A0B.Bz3(Au5);
                                        ReelViewerConfig reelViewerConfig = r8.A01;
                                        if (reelViewerConfig == null) {
                                            str2 = "reelViewerConfig";
                                        } else {
                                            C317116mk r1 = r8.A07;
                                            AnonymousClass3BQ r14 = r8.A02;
                                            if (r14 == null) {
                                                str2 = "reelViewerSource";
                                            } else {
                                                C317116mk r16 = r1;
                                                C316136lA r17 = r72;
                                                C309196Xh.A01(r8.A05, userSession, Au5, r12, reelViewerConfig, r14, Bz3, r16, r17, CMG, false, r8.A04);
                                            }
                                        }
                                    }
                                    0qQ.A0F(str2);
                                    throw AnonymousClass00P.createAndThrow();
                                }
                            }
                        }
                        if (r6.A02) {
                            if (r6.A00 == C243363Yl.LIKED) {
                                i2 = 2131974445;
                                str = "story_like_like_failed_message";
                            } else {
                                i2 = 2131974446;
                                str = "story_like_unlike_failed_message";
                            }
                            C59689JTv.A01(context, str, i2, 0);
                        }
                        i = 1535836169;
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-1609159880, A03);
    }
}
