package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

public final class WUW implements AnonymousClass89Y {
    public int A00;
    public int A01;
    public SurfaceTexture A02;
    public TextureView A03;
    public FrameLayout A04;
    public FilmstripTimelineView A05;
    public final Context A06;
    public final View A07;
    public final ViewStub A08;
    public final I09 A09;
    public final AnonymousClass8HT A0A;
    public final TargetViewSizeProvider A0B;
    public final WUJ A0C = new WUJ(this);
    public final C19728WeU A0D = new C19728WeU(this);
    public final C314446iH A0E;
    public final AnonymousClass80U A0F;
    public final C3493580b A0G;
    public final C3493580b A0H;
    public final AnonymousClass8HZ A0I;
    public final AnonymousClass0eM A0J;
    public volatile AnonymousClass8HJ A0K;
    public volatile AnonymousClass8HJ A0L;

    public WUW(Context context, View view, I09 i09, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass8AL r8, C314446iH r9, AnonymousClass80U r10) {
        0qQ.A0B(context, 1);
        C51974G9v.A1S(userSession, r10, i09, r8, view);
        0qQ.A0B(targetViewSizeProvider, 8);
        this.A06 = context;
        this.A0F = r10;
        this.A09 = i09;
        this.A07 = view;
        this.A0E = r9;
        this.A0B = targetViewSizeProvider;
        AnonymousClass8HJ r1 = AnonymousClass8HJ.NORMAL;
        this.A0L = r1;
        this.A08 = (ViewStub) view.findViewById(R.id.boomerang_trimmer_stub);
        this.A0I = new C19729WeV(this);
        this.A0K = r1;
        this.A0A = AnonymousClass8HS.A00(userSession, (C357638Yz) null);
        this.A0G = new C19660WdO(this, 0);
        this.A0H = new C19660WdO(this, 1);
        this.A0J = AnonymousClass0eN.A01(new C41567AwZ(13, r8, this, userSession));
    }

    public static final void A00(WUW wuw) {
        ((C353308Hc) wuw.A0J.getValue()).CL9(true);
        FilmstripTimelineView filmstripTimelineView = wuw.A05;
        if (filmstripTimelineView == null) {
            0qQ.A0F("trimmerTimelineView");
            throw AnonymousClass00P.createAndThrow();
        }
        C294975nL.A05(new View[]{filmstripTimelineView}, false);
        wuw.A0E.D48(wuw);
    }

    public final /* synthetic */ boolean onBackPressed() {
        return false;
    }
}
