package X;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LkZ  reason: case insensitive filesystem */
public final class C64934LkZ implements C66534MVo {
    public int A00;
    public int A01 = 100;
    public C60060Jeb A02;
    public C353998Kg A03;
    public List A04 = AnonymousClass7TE.A1C();
    public List A05 = AnonymousClass7TE.A1C();
    public final SparseIntArray A06 = new SparseIntArray();
    public final UserSession A07;

    public final boolean CNF(C60060Jeb jeb, PhotoFilter photoFilter) {
        boolean z = false;
        if (photoFilter != null) {
            int i = photoFilter.A08;
            C60070Jez jez = jeb.A05;
            if (i == C66568MWw.A00(jez)) {
                if (i != 0) {
                    z = true;
                }
                jeb.setShouldShowSlidersIcon(z);
                jeb.setChecked(true);
                this.A02 = jeb;
                this.A00 = C66568MWw.A00(jez);
                return true;
            }
        }
        jeb.setChecked(false);
        return false;
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public static void A00(C64934LkZ lkZ, int i) {
        for (FilterGroupModel A002 : lkZ.A04) {
            PhotoFilter A003 = C394999z2.A00(A002, "AlbumEffectAdjustmentController_setFilterStrength()");
            if (A003 != null) {
                A003.A00(i);
            }
        }
        Iterator it = lkZ.A05.iterator();
        while (it.hasNext()) {
            JTO.A0m(it).A1i.A00 = i;
        }
    }

    public final void CuZ(boolean z) {
        if (z) {
            SparseIntArray sparseIntArray = this.A06;
            C60060Jeb jeb = this.A02;
            jeb.getClass();
            sparseIntArray.put(C66568MWw.A00(jeb.A05), this.A01);
            27r A012 = 27p.A01(this.A07);
            if (A012.A0J() != null) {
                27r.A08(C59725JVj.POST_CAPTURE, A012, "FEED_COLOR_FILTER_STRENGTH_ALL_CAROUSEL_DONE_TAP", false);
            }
        } else {
            C60060Jeb jeb2 = this.A02;
            jeb2.getClass();
            C66568MWw mWw = jeb2.A05.A01;
            0qQ.A07(mWw);
            C60060Jeb jeb3 = this.A02;
            jeb3.getClass();
            A00(this, this.A06.get(C66568MWw.A00(jeb3.A05), (int) (((PhotoFilter) ((C61714KJf) mWw).A01.getValue()).A03.A00 * 100.0f)));
            C353998Kg r0 = this.A03;
            r0.getClass();
            r0.EEp();
        }
        this.A04.clear();
        this.A03 = null;
    }

    public final String getTitle() {
        return C66568MWw.A02(this.A02);
    }

    public C64934LkZ(UserSession userSession) {
        this.A07 = userSession;
    }

    public final View AZq(Context context) {
        View A0C = DbT.A0C(LayoutInflater.from(context), (ViewGroup) null, R.layout.filter_strength_adjuster);
        C14724U4o u4o = (C14724U4o) A0C.requireViewById(R.id.filter_strength_seek);
        u4o.setCurrentValue(this.A01);
        C65761LzF.A01(u4o, this, 1);
        return A0C;
    }

    public final /* synthetic */ boolean CIj(View view, MotionEvent motionEvent) {
        return false;
    }

    public final /* synthetic */ boolean CNG(C60060Jeb jeb, FilterGroupModel filterGroupModel) {
        return false;
    }

    public final /* synthetic */ boolean Dij(View view, ViewGroup viewGroup, C353998Kg r4, FilterGroupModel filterGroupModel) {
        return false;
    }
}
