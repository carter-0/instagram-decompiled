package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.HashMap;
import java.util.List;

public final class FkR implements AnonymousClass6WJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public final void DaE(float f) {
    }

    public FkR(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    public final void Dfo(String str) {
        HashMap hashMap;
        C309416Ye r5;
        List list;
        Fragment fragment;
        String str2;
        AnonymousClass0eM r1;
        ReelViewerFragment A012;
        C309516Yo A0P;
        switch (this.A00) {
            case 0:
                fragment = (C47486E4q) this.A03;
                if (fragment.isAdded()) {
                    hashMap = AnonymousClass7TE.A1E();
                    Reel reel = (Reel) this.A02;
                    hashMap.put(String.valueOf(reel.getId()), this.A01);
                    r5 = DbS.A0i();
                    list = AnonymousClass7TE.A1I(reel);
                    str2 = String.valueOf(reel.getId());
                    r1 = fragment.A07;
                    break;
                } else {
                    return;
                }
            case 1:
                hashMap = AnonymousClass7TE.A1E();
                Reel reel2 = (Reel) this.A02;
                hashMap.put(reel2.getId(), this.A01);
                r5 = DbS.A0i();
                list = AnonymousClass7TE.A1I(reel2);
                str2 = reel2.getId();
                fragment = (C47487E4r) this.A03;
                r1 = fragment.A0B;
                break;
            default:
                HashMap A1E = AnonymousClass7TE.A1E();
                Reel reel3 = (Reel) this.A02;
                A1E.put(reel3.getId(), this.A01);
                C309416Ye A0i = DbS.A0i();
                List A1I = AnonymousClass7TE.A1I(reel3);
                String id = reel3.getId();
                C50572Feh feh = (C50572Feh) this.A03;
                UserSession userSession = feh.A06;
                A0i.A02(userSession, id, A1I);
                A0i.A03(AnonymousClass3BQ.BRANDED_CONTENT);
                A0i.A0T = A1E;
                DbY.A1R(A0i);
                A012 = C18280Vp0.A01(A0i.A00());
                A0P = DbS.A0M(feh.A02, userSession);
                break;
        }
        r5.A02(AnonymousClass7TE.A0l(r1), str2, list);
        r5.A03(AnonymousClass3BQ.BRANDED_CONTENT);
        r5.A0T = hashMap;
        DbY.A1R(r5);
        A012 = C18280Vp0.A01(r5.A00());
        A0P = DbZ.A0P(fragment, r1);
        A0P.A0D(A012);
        A0P.A0A = C273654mx.A00(36);
        A0P.A04();
    }

    public final void onCancel() {
    }
}
