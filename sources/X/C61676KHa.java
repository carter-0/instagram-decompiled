package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.model.venue.Venue;

/* renamed from: X.KHa  reason: case insensitive filesystem */
public final class C61676KHa extends IgLinearLayout implements C66510MUo {
    public C64700LgV A00;
    public C66510MUo A01;
    public LOe A02;
    public Venue A03;
    public View A04;

    public final void DOi() {
        C66510MUo mUo = this.A01;
        if (mUo != null) {
            mUo.DOi();
        }
        C64700LgV lgV = this.A00;
        if (lgV != null) {
            lgV.A05.removeLocationUpdates(lgV.A03, lgV);
        }
    }

    public final void DOl() {
        C66510MUo mUo = this.A01;
        if (mUo != null) {
            mUo.DOl();
        }
    }

    public final void DOm(Venue venue) {
        C66510MUo mUo = this.A01;
        if (mUo != null) {
            mUo.DOm(venue);
        }
        C64700LgV lgV = this.A00;
        if (lgV != null) {
            lgV.A05.removeLocationUpdates(lgV.A03, lgV);
        }
    }

    public final LOe getController() {
        return this.A02;
    }

    public final C66510MUo getDelegate() {
        return this.A01;
    }

    public final C64700LgV getLocationSuggestionsRepository() {
        return this.A00;
    }

    public final Venue getVenue() {
        return this.A03;
    }

    public final void setVenue(Venue venue) {
        this.A03 = venue;
        LOe lOe = this.A02;
        if (lOe != null) {
            lOe.A02(venue);
        }
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(1774448709);
        super.onAttachedToWindow();
        if (this.A04 == null) {
            View A0A = DbU.A0A(DbV.A0D(this), this, R.layout.location_suggestions_two_rows, false);
            LOe lOe = new LOe(A0A);
            lOe.A01(this, this.A03);
            this.A02 = lOe;
            addView(A0A);
            this.A04 = A0A;
        }
        C64700LgV lgV = this.A00;
        if (lgV != null) {
            lgV.A00();
        }
        AnonymousClass0fD.A0D(705986945, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(-885332011);
        super.onDetachedFromWindow();
        C64700LgV lgV = this.A00;
        if (lgV != null) {
            lgV.A01();
        }
        AnonymousClass0fD.A0D(-2073586888, A06);
    }

    public final void setController(LOe lOe) {
        this.A02 = lOe;
    }

    public final void setDelegate(C66510MUo mUo) {
        this.A01 = mUo;
    }

    public final void setLocationSuggestionsRepository(C64700LgV lgV) {
        this.A00 = lgV;
    }
}
