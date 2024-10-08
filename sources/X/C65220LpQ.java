package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.LpQ  reason: case insensitive filesystem */
public final class C65220LpQ implements MVS {
    public IgTextView A00;
    public final AnonymousClass80P A01 = AnonymousClass80P.TEMP_CAMERA_TOOL;
    public final AnonymousClass4DH A02;
    public final Integer A03;
    public final boolean A04;

    public C65220LpQ(AnonymousClass4DH r2, Integer num, boolean z) {
        0qQ.A0B(r2, 1);
        this.A02 = r2;
        this.A03 = num;
        this.A04 = z;
    }

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
    }

    public final void A00(Integer num) {
        if (num != null) {
            IgTextView igTextView = this.A00;
            if (igTextView == null) {
                0qQ.A0F("titleView");
                throw AnonymousClass00P.createAndThrow();
            } else {
                igTextView.setText(num.intValue());
            }
        }
    }

    public final View ANH() {
        IgTextView A08 = DbU.A08(DbV.A0E(this.A02), R.layout.layout_share_sheet_row_item_title);
        0qQ.A0C(A08, AnonymousClass000.A00(9));
        this.A00 = A08;
        A00(this.A03);
        if (this.A04) {
            IgTextView igTextView = this.A00;
            if (igTextView != null) {
                igTextView.setTextAppearance(R.style.igds_emphasized_body_1);
            }
            0qQ.A0F("titleView");
            throw AnonymousClass00P.createAndThrow();
        }
        IgTextView igTextView2 = this.A00;
        if (igTextView2 != null) {
            return igTextView2;
        }
        0qQ.A0F("titleView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A01;
    }
}
