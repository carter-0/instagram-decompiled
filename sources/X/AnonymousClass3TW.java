package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3TW  reason: invalid class name */
public final class AnonymousClass3TW implements AnonymousClass2xU {
    public Activity A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public View A03;
    public AnonymousClass9J0 A04;
    public UserSession A05;
    public AnonymousClass4DU A06;
    public C17717Vcm A07;
    public AnonymousClass3W1 A08;
    public Runnable A09;
    public final float A0A;
    public final Handler A0B = new Handler(Looper.getMainLooper());
    public final ViewStub A0C;
    public final AnonymousClass0iw A0D;

    public final View A00() {
        View view = this.A03;
        if (view == null) {
            view = this.A0C.inflate();
            if (view != null) {
                this.A03 = view;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        View.OnClickListener onClickListener = this.A01;
        View.OnClickListener onClickListener2 = this.A02;
        C17717Vcm vcm = this.A07;
        if (!(vcm != null || onClickListener == null || onClickListener2 == null)) {
            View findViewById = view.findViewById(R.id.row_feed_cta_redesign);
            0qQ.A07(findViewById);
            vcm = new C17717Vcm(onClickListener, onClickListener2, (ViewStub) findViewById);
            this.A07 = vcm;
        }
        AnonymousClass9J0 r0 = this.A04;
        if (!(r0 == null || vcm == null)) {
            vcm.A00 = (ImageUrl) r0.A04;
            vcm.A07.setText(2131972581);
            vcm.A06.setVisibility(8);
            vcm.A05.setText(2131972582);
        }
        return view;
    }

    public final void A01(int i) {
        C17717Vcm vcm;
        if (this.A03 != null && (vcm = this.A07) != null) {
            vcm.A04.setVisibility(i);
        }
    }

    public final void DQp(AnonymousClass3W1 r8, int i) {
        AnonymousClass3W1 r0;
        if (i == 9 && (r0 = this.A08) != null && !r0.A2Y) {
            AnonymousClass0iw r5 = this.A0D;
            UserSession userSession = this.A05;
            Activity activity = this.A00;
            View A002 = A00();
            A01(0);
            AnonymousClass3W1 r02 = this.A08;
            if (r02 != null) {
                r02.A2Y = true;
            }
            C71392co r03 = C315596kB.A02;
            C294975nL A0F = C294975nL.A01(A002, 0).A0F(true);
            A0F.A0T(this.A0A, 0.0f);
            A0F.A05 = new IZS(activity, A002, userSession, this);
            A0F.A0H();
            C17717Vcm vcm = this.A07;
            if (vcm != null) {
                ImageUrl imageUrl = vcm.A00;
                if (imageUrl != null) {
                    vcm.A0A.setUrl(imageUrl, r5);
                }
                View view = vcm.A02;
                if (view != null) {
                    view.setVisibility(8);
                    View view2 = vcm.A03;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C244083ac.A05(A002, C244063aa.SAVE_TO_COLLECTION);
        }
    }

    public AnonymousClass3TW(ViewStub viewStub, AnonymousClass0iw r4) {
        float f;
        this.A0C = viewStub;
        this.A0D = r4;
        C17717Vcm vcm = this.A07;
        if (vcm != null) {
            f = (float) vcm.A01;
        } else {
            f = 0.0f;
        }
        this.A0A = f;
    }
}
