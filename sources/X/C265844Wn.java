package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.4Wn  reason: invalid class name and case insensitive filesystem */
public final class C265844Wn extends AnonymousClass3NK implements AnonymousClass3NI, C265854Wo {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ImageView A03;
    public LinearLayout A04;
    public TextView A05;
    public AnonymousClass3NM A06;
    public AnonymousClass3NM A07;
    public C255773uh A08;
    public C255783ui A09;
    public C265834Wm A0A;
    public C309426Yf A0B;
    public String A0C = null;
    public String A0D = null;
    public final ViewStub A0E;

    public final void Cyw(AnonymousClass3NM r1) {
    }

    public final void Cyx(AnonymousClass3NM r1) {
    }

    public final void Df1(AnonymousClass3NM r1) {
    }

    public final boolean Dqe(View view) {
        float f;
        C389529pm r1;
        int i;
        AnonymousClass3NM r12 = this.A06;
        if (r12 != null) {
            r12.A01 = true;
        }
        AnonymousClass3NM r13 = this.A07;
        if (r13 != null) {
            r13.A01 = true;
        }
        ImageView imageView = this.A03;
        if (!(imageView == null || (r1 = (C389529pm) imageView.getDrawable()) == null)) {
            if (view == this.A00) {
                i = 0;
            } else {
                i = 1;
            }
            r1.A0E = i;
            r1.invalidateSelf();
        }
        C309426Yf r14 = this.A0B;
        if (r14 != null) {
            f = (r14.A0A / 1000.0f) * r14.A0B;
        } else {
            f = 0.0f;
        }
        C255783ui r0 = this.A09;
        C265834Wm r3 = this.A0A;
        if (!(r3 == null || r0 == null)) {
            C272024jy A0E2 = r0.A0E();
            A0E2.getClass();
            String str = this.A0D;
            String str2 = this.A0C;
            int i2 = 1;
            if (view == this.A00) {
                i2 = 0;
            }
            r3.DY4(this.A08, A0E2, this, str, str2, f, i2);
        }
        return true;
    }

    public final AnonymousClass3NM A00(View view) {
        AnonymousClass3NG r2 = new AnonymousClass3NG(view);
        List list = r2.A0E;
        list.clear();
        list.add(this);
        r2.A0C = true;
        r2.A07 = true;
        r2.A08 = false;
        r2.A02 = 0.85f;
        C71392co r0 = C265884Wr.A00;
        0qQ.A0B(r0, 0);
        r2.A03 = r0;
        r2.A04 = this;
        return r2.A00();
    }

    public final void A01() {
        ViewGroup viewGroup = this.A02;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    public final void Cyy(AnonymousClass3NM r5) {
        C389529pm r2;
        float f = (float) r5.A07.A09.A00;
        ImageView imageView = this.A03;
        if (imageView != null && (r2 = (C389529pm) imageView.getDrawable()) != null) {
            if (r5.A06 == this.A00) {
                r2.A00 = f;
            } else {
                r2.A01 = f;
            }
            r2.invalidateSelf();
        }
    }

    public final void Ext(UserSession userSession, Runnable runnable) {
        int[] iArr;
        C255783ui r0 = this.A09;
        if (r0 != null) {
            C272024jy A0E2 = r0.A0E();
            A0E2.getClass();
            iArr = C297825sP.A04(userSession, A0E2, true);
        } else {
            iArr = null;
        }
        ImageView imageView = this.A03;
        imageView.getClass();
        Drawable drawable = imageView.getDrawable();
        if (iArr != null) {
            drawable.getClass();
            ((C389529pm) drawable).A0C(iArr);
        }
        drawable.getClass();
        C389529pm r1 = (C389529pm) drawable;
        r1.A0F = runnable;
        r1.A0i.A03();
    }

    public C265844Wn(ViewStub viewStub) {
        this.A0E = viewStub;
    }
}
