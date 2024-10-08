package X;

import android.view.View;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;

/* renamed from: X.Loi  reason: case insensitive filesystem */
public abstract class C65179Loi implements MVS {
    public PublishScreenCategoryType A00;
    public C60076JfA A01;
    public final AnonymousClass4DH A02;
    public final C66576MXh A03;
    public final AnonymousClass80P A04 = AnonymousClass80P.TEMP_CAMERA_TOOL;

    public final /* synthetic */ void ADm() {
    }

    public final C60076JfA A02() {
        C60076JfA jfA = this.A01;
        if (jfA != null) {
            return jfA;
        }
        0qQ.A0F("row");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View ANH() {
        this.A01 = C64004LIk.A00(this.A02.requireContext(), LYD.A01(this, 16), Integer.valueOf(LIh.A00(this.A00)), LIh.A01(this.A00));
        return A02();
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        if (this instanceof C61831KNu) {
            return ((C61831KNu) this).A00;
        }
        return this.A04;
    }

    public C65179Loi(AnonymousClass4DH r2, C66576MXh mXh, PublishScreenCategoryType publishScreenCategoryType) {
        this.A02 = r2;
        this.A00 = publishScreenCategoryType;
        this.A03 = mXh;
    }
}
