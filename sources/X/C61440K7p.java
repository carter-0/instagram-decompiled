package X;

import android.animation.Animator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

/* renamed from: X.K7p  reason: case insensitive filesystem */
public final class C61440K7p extends AnonymousClass4DH implements AnonymousClass8HH {
    public static final String __redex_internal_original_name = "IGTVUploadCanvasTrimFragment";
    public FilmstripTimelineView A00;
    public float A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C66306MMp.A00(this, C66306MMp.A02(this, 27), new C73666Phf(5, (Object) null, this), DbS.A0z(IGTVUploadViewModel.class), 28);

    public final /* synthetic */ void DNK(float f, float f2) {
    }

    public final void E0X(float f) {
    }

    public final String getModuleName() {
        return "igtv_upload_canvas_trim_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FilmstripTimelineView filmstripTimelineView = (FilmstripTimelineView) view.requireViewById(R.id.trim_filmstrip_view);
        filmstripTimelineView.A00 = this;
        filmstripTimelineView.setAllowSeekbarTouch(true);
        filmstripTimelineView.setShowTrimmer(true);
        filmstripTimelineView.setTrimmerMaximumRange(1.0f);
        filmstripTimelineView.setScrollXMargin(AnonymousClass7TE.A0B(filmstripTimelineView.getResources()));
        AnonymousClass0eM r6 = this.A04;
        filmstripTimelineView.A01(((float) JTR.A0o(r6).A02.A1N.A07) / ((float) JTR.A0o(r6).A00()), ((float) JTR.A0o(r6).A02.A1N.A05) / ((float) JTR.A0o(r6).A00()));
        this.A00 = filmstripTimelineView;
        0nA.A0m(filmstripTimelineView, view);
        FilmstripTimelineView filmstripTimelineView2 = this.A00;
        if (filmstripTimelineView2 == null) {
            0qQ.A0F("filmstripView");
            throw AnonymousClass00P.createAndThrow();
        }
        0nA.A0p(filmstripTimelineView2, new M4Q(this));
        Dba.A15(getViewLifecycleOwner(), JTT.A0V(this.A02).A05, MPA.A00(this, 20), 65);
    }

    public final void DNM(float f) {
        AnonymousClass0eM r3 = this.A04;
        int A002 = (int) (f * ((float) JTR.A0o(r3).A00()));
        JTP.A1W(JTT.A0V(this.A02).A07, A002);
        JTR.A0o(r3).A02.A1N.A07 = A002;
    }

    public final void Dfu(float f) {
        AnonymousClass0eM r3 = this.A04;
        int A002 = (int) (f * ((float) JTR.A0o(r3).A00()));
        JTP.A1W(JTT.A0V(this.A02).A07, A002);
        JTR.A0o(r3).A02.A1N.A05 = A002;
    }

    public final void DiR(float f) {
        FilmstripTimelineView filmstripTimelineView = this.A00;
        if (filmstripTimelineView != null) {
            float A022 = C229632nm.A02(f, filmstripTimelineView.A0A.getLeftTrimmerValue(), filmstripTimelineView.getRightTrimmerPosition());
            FilmstripTimelineView filmstripTimelineView2 = this.A00;
            if (filmstripTimelineView2 != null) {
                filmstripTimelineView2.setSeekPosition(A022);
                JTP.A1W(JTT.A0V(this.A02).A07, (int) (A022 * ((float) JTR.A0o(this.A04).A00())));
                return;
            }
        }
        0qQ.A0F("filmstripView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dsh(boolean z) {
        if (z) {
            float f = this.A01;
            FilmstripTimelineView filmstripTimelineView = this.A00;
            if (filmstripTimelineView != null) {
                float A022 = C229632nm.A02(f, filmstripTimelineView.A0A.getLeftTrimmerValue(), filmstripTimelineView.getRightTrimmerPosition());
                C60206JhP A0V = JTT.A0V(this.A02);
                JTP.A1W(A0V.A07, (int) (((float) JTR.A0o(this.A04).A00()) * A022));
                FilmstripTimelineView filmstripTimelineView2 = this.A00;
                if (filmstripTimelineView2 != null) {
                    filmstripTimelineView2.setSeekPosition(A022);
                    FilmstripTimelineView filmstripTimelineView3 = this.A00;
                    if (filmstripTimelineView3 != null) {
                        C355428Py r0 = filmstripTimelineView3.A09;
                        r0.setAlpha(0.0f);
                        r0.setVisibility(0);
                        0qQ.A0A(r0.animate().alpha(1.0f).setDuration(100).setListener((Animator.AnimatorListener) null));
                        this.A01 = -1.0f;
                    }
                }
            }
            0qQ.A0F("filmstripView");
            throw AnonymousClass00P.createAndThrow();
        }
        JTT.A0V(this.A02).A04 = false;
    }

    public final void Dsj(boolean z) {
        JTT.A0V(this.A02).A04 = true;
        if (z) {
            FilmstripTimelineView filmstripTimelineView = this.A00;
            if (filmstripTimelineView == null) {
                0qQ.A0F("filmstripView");
                throw AnonymousClass00P.createAndThrow();
            }
            C355428Py r5 = filmstripTimelineView.A09;
            this.A01 = r5.A02;
            r5.setAlpha(1.0f);
            r5.setVisibility(0);
            0qQ.A0A(r5.animate().alpha(0.0f).setDuration(100).setListener(new C59969Jce(filmstripTimelineView, 2)));
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public C61440K7p() {
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, C66306MMp.A02(C66306MMp.A02(this, 26), 29));
        0Yh A0z = DbS.A0z(C60206JhP.class);
        this.A02 = DbS.A0I(C66306MMp.A02(A002, 30), new C73666Phf(7, A002, this), new C73666Phf(6, (Object) null, A002), A0z);
        this.A01 = -1.0f;
        this.A03 = C227642jf.A02(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1206160009);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.igtv_upload_canvas_trim_fragment, false);
        AnonymousClass0fD.A09(-134192366, A022);
        return A0D;
    }
}
