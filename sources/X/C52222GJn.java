package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.SeekBar;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.GJn  reason: case insensitive filesystem */
public final class C52222GJn extends C243963aQ {
    public static final 2WU A0F = G9t.A16(GK9.A00);
    public static final C55910HpX A0G = new Object();
    public final long A00;
    public final 2V5 A01;
    public final 2V5 A02;
    public final 2V5 A03;
    public final 2V5 A04;
    public final C267324bN A05;
    public final UserSession A06;
    public final WeakReference A07;
    public final WeakReference A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final C244523bK A0X(C244463bE r5) {
        0qQ.A0B(r5, 0);
        return C51974G9v.A07(r5, A0F, C52223GJo.A00, C52224GJp.A00, J6Q.A00(r5, this, 8));
    }

    public static final ValueAnimator A00(ViewGroup viewGroup, SeekBar seekBar, C52222GJn gJn, int i, int i2) {
        TimeInterpolator linearInterpolator;
        if (i != i2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
            ofInt.setDuration(150);
            if (!gJn.A0B || !gJn.A0E) {
                linearInterpolator = new LinearInterpolator();
            } else {
                linearInterpolator = new PathInterpolator(0.17f, 0.17f, 0.0f, 1.0f);
            }
            ofInt.setInterpolator(linearInterpolator);
            ofInt.addUpdateListener(new GKT(viewGroup, seekBar, gJn));
            ofInt.start();
            return ofInt;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            seekBar.setMaxHeight(i2);
            seekBar.setMinHeight(i2);
        }
        seekBar.getLayoutParams().height = i2;
        return null;
    }

    public C52222GJn(2V5 r2, 2V5 r3, 2V5 r4, 2V5 r5, C267324bN r6, UserSession userSession, WeakReference weakReference, WeakReference weakReference2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AnonymousClass7TG.A1O(r2, r3);
        0qQ.A0B(r5, 13);
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A08 = weakReference;
        this.A09 = z;
        this.A0D = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A0B = z5;
        this.A0E = z6;
        this.A00 = j;
        this.A04 = r5;
        this.A07 = weakReference2;
        this.A06 = userSession;
        this.A05 = r6;
    }

    public static final void A04(ViewGroup viewGroup, Object obj, Object obj2, boolean z) {
        ViewStub A0F2;
        AnonymousClass7TF.A0G(viewGroup, R.id.scrubber_preview_thumbnail_view).setTag(obj);
        if (z) {
            View findViewById = viewGroup.findViewById(R.id.scrubber_thumbnail_highlights_text);
            if (findViewById != null || ((A0F2 = DbS.A0F(viewGroup, R.id.scrubber_thumbnail_highlights_stub)) != null && (findViewById = A0F2.inflate()) != null)) {
                findViewById.setTag(obj2);
            }
        }
    }
}
