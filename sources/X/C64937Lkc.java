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

/* renamed from: X.Lkc  reason: case insensitive filesystem */
public final class C64937Lkc implements C66534MVo {
    public int A00;
    public int A01;
    public C60060Jeb A02;
    public C353998Kg A03;
    public FilterGroupModel A04;
    public boolean A05;
    public boolean A06;
    public final UserSession A07;

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public static void A00(C64937Lkc lkc, int i) {
        FilterGroupModel filterGroupModel = lkc.A04;
        filterGroupModel.getClass();
        FilterModel B5u = filterGroupModel.B5u(10);
        B5u.getClass();
        float f = ((float) i) / 100.0f;
        ((ColorFilter) B5u).A00 = f;
        lkc.A04.EWl(10, AnonymousClass7TF.A1R((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
    }

    public final View AZq(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        IgEditSeekBar A0P = JTU.A0P(context, linearLayout);
        A0P.setCurrentValue(this.A01);
        C65761LzF.A01(A0P, this, 7);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        int A062 = AnonymousClass7TG.A06(context);
        layoutParams.setMargins(A062, 0, A062, 0);
        linearLayout.addView(A0P, layoutParams);
        linearLayout.setContentDescription(AnonymousClass7TF.A0e(linearLayout.getResources(), C66568MWw.A02(this.A02), 2131974011));
        return linearLayout;
    }

    public final boolean CNG(C60060Jeb jeb, FilterGroupModel filterGroupModel) {
        FilterModel B5u = filterGroupModel.B5u(10);
        B5u.getClass();
        jeb.setChecked(AnonymousClass7TF.A1P((((ColorFilter) B5u).A00 > 0.0f ? 1 : (((ColorFilter) B5u).A00 == 0.0f ? 0 : -1))));
        return false;
    }

    public final void CuZ(boolean z) {
        if (z) {
            this.A01 = this.A00;
        }
        C60060Jeb jeb = this.A02;
        jeb.getClass();
        jeb.setChecked(AnonymousClass7TF.A1P(this.A01));
        A00(this, this.A01);
        this.A02 = null;
        this.A04 = null;
        this.A03 = null;
    }

    public final boolean Dij(View view, ViewGroup viewGroup, C353998Kg r5, FilterGroupModel filterGroupModel) {
        this.A02 = (C60060Jeb) view;
        this.A04 = filterGroupModel;
        this.A03 = r5;
        FilterModel B5u = filterGroupModel.B5u(10);
        B5u.getClass();
        int i = (int) (((ColorFilter) B5u).A00 * 100.0f);
        this.A00 = i;
        this.A01 = i;
        this.A05 = this.A04.CTc(19);
        return true;
    }

    public final String getTitle() {
        return C66568MWw.A02(this.A02);
    }

    public C64937Lkc(UserSession userSession) {
        this.A07 = userSession;
    }

    public final boolean CIj(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A06 = true;
            A00(this, 0);
        } else {
            if (motionEvent.getAction() == 1) {
                this.A06 = false;
                A00(this, this.A00);
            }
            return true;
        }
        C353998Kg r0 = this.A03;
        r0.getClass();
        r0.EEp();
        return true;
    }

    public final /* synthetic */ boolean CNF(C60060Jeb jeb, PhotoFilter photoFilter) {
        return false;
    }
}
