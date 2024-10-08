package X;

import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.LinkedHashMap;

/* renamed from: X.Igf  reason: case insensitive filesystem */
public final /* synthetic */ class C57800Igf implements Runnable {
    public final /* synthetic */ ReelViewerFragment A00;

    public /* synthetic */ C57800Igf(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final void run() {
        1Xj r8;
        Integer num;
        String str;
        ReelViewerFragment reelViewerFragment = this.A00;
        C255773uh Au5 = reelViewerFragment.Au5();
        if (Au5 != null && (r8 = Au5.A0b) != null) {
            AnonymousClass6Z5 r4 = reelViewerFragment.A3G;
            UserSession userSession = r4.A09;
            if (userSession == null) {
                str = "userSession";
            } else {
                AnonymousClass4DU r9 = r4.A15;
                HNS hns = HNS.OPEN_BLOKS_APP;
                String A002 = C273654mx.A00(2178);
                hns.A00 = A002;
                HNP hnp = HNP.CENTER_BUTTON;
                if (Au5.CWu()) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = AnonymousClass05K.A0N;
                }
                I2F.A00(hns, hnp, r8, r9, userSession, num);
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                String A2n = r8.A2n();
                if (A2n != null) {
                    A1H.put("media_id", A2n);
                    A1H.put("module", r9.getModuleName());
                    C310226ad r0 = r4.A0r;
                    if (r0 == null) {
                        str = "reelViewerBloksHelper";
                    } else {
                        r0.A00(Au5, A002, A1H);
                        r4.A17.EHY("bloks");
                        return;
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
