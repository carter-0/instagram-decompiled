package X;

import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Af2 implements AnonymousClass3N3, AnonymousClass3N4 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Af2(View view, AnonymousClass3Y5 r3) {
        this.A02 = view;
        this.A01 = r3;
        RectF rectF = 0nA.A01;
        RectF rectF2 = new RectF();
        0nA.A0L(rectF2, view);
        this.A03 = rectF2;
    }

    public final RectF AeG() {
        return (RectF) this.A03;
    }

    public final View AeY() {
        if (this.A00 != 0) {
            return (View) this.A02;
        }
        return new View(((Fragment) this.A01).requireContext());
    }

    public final /* synthetic */ RectF AhX() {
        return (RectF) this.A03;
    }

    public final GradientSpinner Bkt() {
        GradientSpinner gradientSpinner;
        ViewGroup viewGroup;
        if (this.A00 == 0) {
            return (GradientSpinner) this.A02;
        }
        View view = (View) this.A02;
        View view2 = null;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            view2 = viewGroup.getChildAt(0);
        }
        if (!(view2 instanceof GradientSpinner) || (gradientSpinner = (GradientSpinner) view2) == null) {
            return new GradientSpinner(C243803a8.A00((AnonymousClass3Y5) this.A01), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        }
        return gradientSpinner;
    }

    public final void CLE() {
    }

    public final boolean EtJ() {
        if (this.A00 != 0) {
            return true;
        }
        return false;
    }

    public final void Eu3(AnonymousClass0iw r1) {
    }

    public Af2(RectF rectF, MediaMapFragment mediaMapFragment, GradientSpinner gradientSpinner) {
        this.A01 = mediaMapFragment;
        this.A03 = rectF;
        this.A02 = gradientSpinner;
    }
}
