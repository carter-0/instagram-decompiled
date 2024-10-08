package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;

/* renamed from: X.Lkb  reason: case insensitive filesystem */
public final class C64936Lkb implements C66534MVo {
    public int A00;
    public int A01;
    public C353998Kg A02;
    public FilterGroupModel A03;
    public boolean A04;
    public boolean A05;
    public IgEditSeekBar A06;
    public final UserSession A07;

    public final String getTitle() {
        return "Lux";
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public static void A00(C64936Lkb lkb, int i) {
        lkb.A03.getClass();
        FilterModel B5u = lkb.A03.B5u(9);
        B5u.getClass();
        ((ColorFilter) B5u).A00 = ((float) i) / 100.0f;
        lkb.A03.EWl(9, AnonymousClass7TF.A1R(i));
    }

    public final View AZq(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        IgEditSeekBar A0P = JTU.A0P(context, linearLayout);
        int i = this.A01;
        if (i == -1) {
            i = 50;
        }
        A0P.setCurrentValue(i);
        C65761LzF.A01(A0P, this, 6);
        this.A06 = A0P;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        int A062 = AnonymousClass7TG.A06(context);
        layoutParams.setMargins(A062, 0, A062, 0);
        linearLayout.addView(this.A06, layoutParams);
        linearLayout.setContentDescription(AnonymousClass7TF.A0e(linearLayout.getResources(), "Lux", 2131974011));
        return linearLayout;
    }

    public final void CuZ(boolean z) {
        if (z) {
            this.A01 = this.A00;
        }
        A00(this, this.A01);
        this.A03 = null;
        this.A02 = null;
        this.A06 = null;
    }

    public final boolean Dij(View view, ViewGroup viewGroup, C353998Kg r5, FilterGroupModel filterGroupModel) {
        this.A03 = filterGroupModel;
        this.A02 = r5;
        FilterModel B5u = filterGroupModel.B5u(9);
        B5u.getClass();
        int i = (int) (((ColorFilter) B5u).A00 * 100.0f);
        this.A01 = i;
        this.A00 = i;
        this.A04 = this.A03.CTc(19);
        return true;
    }

    public C64936Lkb(UserSession userSession) {
        this.A07 = userSession;
    }

    public final boolean CIj(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A05 = true;
            A00(this, 0);
        } else {
            if (motionEvent.getAction() == 1) {
                this.A05 = false;
                A00(this, this.A00);
            }
            return true;
        }
        C353998Kg r0 = this.A02;
        r0.getClass();
        r0.EEp();
        return true;
    }

    public final /* synthetic */ boolean CNF(C60060Jeb jeb, PhotoFilter photoFilter) {
        return false;
    }

    public final /* synthetic */ boolean CNG(C60060Jeb jeb, FilterGroupModel filterGroupModel) {
        return false;
    }
}
