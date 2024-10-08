package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class H5M extends C252233om implements C2355130d {
    public C55634Hkt A00;
    public C55634Hkt A01;
    public boolean A02 = true;
    public final 1Ng A03;
    public final AnonymousClass4DV A04;
    public final AnonymousClass2rS A05;

    public H5M(UserSession userSession, AnonymousClass2rS r4, AnonymousClass4DV r5) {
        0qQ.A0B(userSession, 1);
        this.A03 = AnonymousClass1Nd.A00(userSession);
        this.A04 = r5;
        this.A05 = r4;
    }

    public final /* bridge */ /* synthetic */ void Cs0(Object obj, int i) {
        0qQ.A0B(obj, 0);
        A00(this.A03, (AnonymousClass3UH) null, AnonymousClass05K.A00);
        this.A00 = new C55634Hkt(this, System.currentTimeMillis());
    }

    public final /* bridge */ /* synthetic */ void Cs1(Object obj, int i) {
        0qQ.A0B(obj, 0);
        this.A01 = new C55634Hkt(this, System.currentTimeMillis());
    }

    public final void FN9(AnonymousClass345 r7, int i) {
        View view;
        0qQ.A0B(r7, 0);
        AnonymousClass2rS r1 = this.A05;
        Object item = r1.getItem(i);
        0qQ.A0C(item, "null cannot be cast to non-null type com.instagram.feed.su.model.SuggestedUsers");
        AnonymousClass3UH r4 = (AnonymousClass3UH) item;
        C266934aa C2r = r1.C2r(r4);
        r7.FNB(r4.getId(), r4, C2r.getPosition());
        View AnE = this.A04.getScrollingViewProxy().AnE(i);
        if (AnE != null) {
            Object tag = AnE.getTag();
            if (tag instanceof C243493Yz) {
                view = ((C243493Yz) tag).A0A;
            } else if (tag instanceof OEG) {
                view = ((OEG) tag).A02;
            } else if (tag instanceof C55867Hoo) {
                view = ((C55867Hoo) tag).A07;
            } else {
                return;
            }
            if (view != null) {
                if (C55005Hac.A00(view, 0.75d)) {
                    r7.FNA(r4.getId(), r4, C2r.getPosition());
                }
                if (this.A02 && C55005Hac.A00(view, 1.0d)) {
                    A00(this.A03, (AnonymousClass3UH) null, AnonymousClass05K.A15);
                    this.A02 = false;
                }
            }
        }
    }

    public static void A00(1Ng r1, AnonymousClass3UH r2, Integer num) {
        r1.A00(new C57071INl(r2, num));
    }

    public final Class C9I() {
        return AnonymousClass3UH.class;
    }

    public final /* bridge */ /* synthetic */ void Cry(Object obj) {
        A00(this.A03, (AnonymousClass3UH) null, AnonymousClass05K.A01);
        this.A00 = null;
    }

    public final /* bridge */ /* synthetic */ void Crz(Object obj) {
        AnonymousClass3UH r3 = (AnonymousClass3UH) obj;
        0qQ.A0B(r3, 0);
        if (this.A01 != null) {
            System.currentTimeMillis();
            this.A01 = null;
        }
        C238133Ar scrollingViewProxy = this.A04.getScrollingViewProxy();
        if (scrollingViewProxy != null && scrollingViewProxy.CTr()) {
            A00(this.A03, r3, AnonymousClass05K.A1F);
        }
    }

    public final void onDestroy() {
        A00(this.A03, (AnonymousClass3UH) null, AnonymousClass05K.A0Y);
        this.A00 = null;
    }

    public final void onDestroyView() {
        A00(this.A03, (AnonymousClass3UH) null, AnonymousClass05K.A0j);
    }

    public final void onPause() {
        A00(this.A03, (AnonymousClass3UH) null, AnonymousClass05K.A0C);
    }

    public final void onResume() {
        A00(this.A03, (AnonymousClass3UH) null, AnonymousClass05K.A0N);
        C55634Hkt hkt = this.A00;
        if (hkt != null) {
            hkt.A00 = System.currentTimeMillis();
        }
    }

    public final /* bridge */ /* synthetic */ void Cs3(View view, Object obj, double d) {
    }
}
