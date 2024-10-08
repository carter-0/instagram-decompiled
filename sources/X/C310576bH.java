package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.6bH  reason: invalid class name and case insensitive filesystem */
public abstract class C310576bH extends C310586bI {
    public final C310546bE A00;

    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        0qQ.A0B(viewGroup, 2);
        int itemViewType = getItemViewType(i);
        C310566bG r5 = (C310566bG) this;
        AnonymousClass6k9 A002 = C315586kA.A00(r5.getItemViewType(i));
        switch (A002.ordinal()) {
            case 0:
                str = "broadcast";
                break;
            case 1:
                str = "story";
                break;
            case 2:
                str = "broadcast_archive";
                break;
            case 3:
                str = "story_ad";
                break;
            case 4:
                str = "netego";
                break;
            case 5:
                str = "story_interstitial";
                break;
            case 6:
                str = "litho_story_ad";
                break;
            default:
                throw new IllegalStateException(002.A0R("Invalid item type: ", A002.name()));
        }
        if (view == null) {
            C310546bE r0 = this.A00;
            QuickPerformanceLogger quickPerformanceLogger = r0.A01;
            quickPerformanceLogger.markerStart(539624923);
            C310546bE.A00(r0, str, 539624923, itemViewType);
            quickPerformanceLogger.markerAnnotate(539624923, "is_prefetching", false);
            0fS.A01(002.A0R("onCreateView: ", str), 1692439988);
            AnonymousClass6k9 A003 = C315586kA.A00(r5.getItemViewType(i));
            if (A003 == AnonymousClass6k9.BROADCAST) {
                UserSession userSession = r5.A06;
                AnonymousClass6ZZ r2 = r5.A0A;
                view = JZP.A00(viewGroup, r5.A05, userSession, r5.A07, r2);
            } else {
                view = r5.A01(viewGroup, A003);
            }
            0fS.A00(513416562);
            quickPerformanceLogger.markerEnd(539624923, 2);
        }
        C310546bE r02 = this.A00;
        QuickPerformanceLogger quickPerformanceLogger2 = r02.A01;
        quickPerformanceLogger2.markerStart(539637512);
        C310546bE.A00(r02, str, 539637512, itemViewType);
        0fS.A01(002.A0R("onBindView: ", str), 1789622837);
        C250973mM r1 = (C250973mM) 00k.A0O(r5.A0B.A02, i);
        if (r1 != null) {
            C310566bG.A00(view, r1.A08(r5.A06), r1, r5, i);
        }
        0fS.A00(986589668);
        quickPerformanceLogger2.markerEnd(539637512, 2);
        return view;
    }

    public C310576bH(C310546bE r1) {
        this.A00 = r1;
    }
}
