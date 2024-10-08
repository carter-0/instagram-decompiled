package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

/* renamed from: X.LYp  reason: case insensitive filesystem */
public final class C64289LYp implements View.OnTouchListener, C331117Pq, C252203oj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public 2cv A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final Activity A0B;
    public final Rect A0C = AnonymousClass7TE.A0W();
    public final ViewGroup A0D;
    public final ViewGroup A0E;
    public final ImageView A0F;
    public final 2cs A0G;
    public final SimpleVideoLayout A0H;
    public final SpinnerImageView A0I;
    public final C14044Tol A0J;
    public final Context A0K;
    public final CardView A0L;
    public final C62320sa A0M;

    public C64289LYp(Activity activity, ViewGroup viewGroup, UserSession userSession, C62320sa r14) {
        AnonymousClass7TF.A1B(userSession, 1, viewGroup);
        this.A0E = viewGroup;
        this.A0B = activity;
        this.A0M = r14;
        Context A0S = AnonymousClass7TE.A0S(viewGroup);
        this.A0K = A0S;
        ViewGroup viewGroup2 = (ViewGroup) DbW.A09(LayoutInflater.from(A0S), viewGroup, R.layout.giphy_peek_view, false);
        this.A0D = viewGroup2;
        this.A0A = A0S.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        C3019160o.A01(viewGroup).addView(viewGroup2);
        this.A0H = (SimpleVideoLayout) viewGroup2.requireViewById(R.id.giphy_peek_video);
        this.A0F = DbU.A0F(viewGroup2, R.id.giphy_peek_image);
        this.A0I = DbX.A0k(viewGroup2);
        this.A0L = (CardView) viewGroup2.requireViewById(R.id.giphy_card_view);
        this.A0J = new C14044Tol(A0S, userSession, (C252323ov) null, this, "giphy_peek_video_player");
        2cs A0J2 = AnonymousClass7TF.A0J();
        A0J2.A09(C71392co.A03(8.0d, 13.0d));
        A0J2.A06 = true;
        A0J2.A0A(this);
        this.A0G = A0J2;
    }

    public final void A00() {
        this.A08 = false;
        if (!this.A07) {
            this.A0J.A0A("end_peek");
        }
        this.A0G.A04();
        2cv r1 = this.A05;
        if (r1 != null) {
            r1.CNi((View.OnTouchListener) null);
        }
        this.A0M.invoke();
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DxV(C263754Nf r1) {
    }

    public final void Dxx(C263754Nf r1) {
    }

    public final void Dyj(int i, int i2) {
    }

    public final void onCompletion() {
    }

    public final void onCues(List list) {
    }

    public final void onLoop(int i) {
    }

    public final void onPrepare(C263754Nf r1) {
    }

    public final void onProgressStateChanged(boolean z) {
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
    }

    public final void onStopVideo(String str, boolean z) {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        if (motionEvent.getActionMasked() == 0) {
            this.A09 = true;
        } else if (this.A09 && motionEvent.getActionMasked() == 1) {
            A00();
            this.A09 = false;
            return true;
        }
        return true;
    }

    public final void onVideoDownloading(C263754Nf r1) {
    }

    public final void onVideoPlayerError(C263754Nf r1, String str) {
    }

    public final /* synthetic */ void onVideoStartedPlaying(C263754Nf r1) {
    }

    public final void Dxy(C263754Nf r3) {
        this.A0F.setVisibility(8);
        this.A0I.setVisibility(8);
    }

    public final void onVideoViewPrepared(C263754Nf r3) {
        if (!this.A08 && !this.A07) {
            this.A0J.A0A("end_peek");
        }
    }

    public final void DmE(2cs r9) {
        float A012 = (float) JTR.A01(r9);
        this.A0D.setVisibility(JTQ.A01((A012 > 0.0f ? 1 : (A012 == 0.0f ? 0 : -1))));
        this.A0L.setAlpha(A012);
        float f = (float) this.A03;
        float f2 = 1.0f - 0.0f;
        float f3 = ((float) this.A01) - f;
        float f4 = 0.0f;
        if (f2 != 0.0f) {
            f4 = (A012 - 0.0f) / f2;
        }
        int A013 = AnonymousClass1GB.A01((f4 * f3) + f);
        float f5 = (float) this.A02;
        float f6 = ((float) this.A00) - f5;
        float f7 = 0.0f;
        if (f2 != 0.0f) {
            f7 = (A012 - 0.0f) / f2;
        }
        int A014 = AnonymousClass1GB.A01((f7 * f6) + f5);
        ImageView imageView = this.A0F;
        0nA.A0f(imageView, A013);
        0nA.A0V(imageView, A014);
        SimpleVideoLayout simpleVideoLayout = this.A0H;
        0nA.A0f(simpleVideoLayout, A013);
        0nA.A0V(simpleVideoLayout, A014);
    }
}
