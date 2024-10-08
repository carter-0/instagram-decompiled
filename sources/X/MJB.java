package X;

import android.graphics.drawable.GradientDrawable;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import com.instagram.user.model.UnavailableProduct;

public final class MJB extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJB(Object obj, int i, Object obj2, int i2, int i3) {
        super(0);
        this.A00 = i3;
        this.A02 = i;
        this.A04 = obj;
        this.A01 = i2;
        this.A03 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C3254772o r3;
        C60688JpZ jpZ;
        float f;
        switch (this.A00) {
            case 0:
                return ((WJt) this.A04).A00.AEy((C244943c0) this.A03, this.A02, this.A01);
            case 1:
                int i = this.A02;
                int i2 = this.A01;
                r3 = (C3254772o) this.A04;
                C3254772o.A03(r3, i, i2);
                break;
            case 2:
                int i3 = this.A02;
                int i4 = this.A01;
                r3 = (C3254772o) this.A04;
                int i5 = i4 + i3;
                while (i3 < i5) {
                    2Rw r0 = r3.A00;
                    if (r0 != null) {
                        C3254772o.A02(r3, r0.getItemViewType(i3), i3);
                        i3++;
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                break;
            case 3:
                int i6 = this.A02;
                int i7 = this.A01;
                r3 = (C3254772o) this.A04;
                r3.A04.removeViews(i6, i7);
                break;
            case 4:
                int i8 = this.A02;
                KMS kms = (KMS) this.A04;
                Integer[] numArr = kms.A0C.A02;
                int A0A = (JTO.A0A(numArr, 1) + i8) - JTO.A0A(numArr, 0);
                C60108Jfo jfo = kms.A0K;
                int i9 = this.A01;
                jfo.A0Q(i9, i8, A0A, AnonymousClass7TF.A1W(this.A03, AnonymousClass05K.A00));
                C249703kE A0W = kms.A0A.A0W((i9 * 2) + 2);
                if ((A0W instanceof KMZ) && (jpZ = (C60688JpZ) A0W) != null) {
                    C60059Jea jea = jpZ.A01;
                    jea.A0H = i8;
                    jea.A0G = A0A;
                }
                return true;
            case 5:
                int i10 = this.A01;
                FilmstripTimelineView A012 = LTA.A01((RecyclerView) this.A04, i10);
                if (A012 != null) {
                    int i11 = this.A02;
                    AnonymousClass89v r02 = (AnonymousClass89v) this.A03;
                    if (i10 < i11) {
                        f = (float) r02.A02;
                    } else {
                        f = 0.0f;
                    }
                    A012.setPivotX(f);
                    A012.setActivated(false);
                    A012.setShowTrimmer(false);
                    A012.setShowSeekbar(false);
                    A012.A03(false, false, false);
                    break;
                }
                break;
            case 6:
                ((X72) this.A03).DuP((UnavailableProduct) this.A04, this.A02, this.A01);
                break;
            default:
                AnonymousClass3Y5 r5 = (AnonymousClass3Y5) this.A03;
                int i12 = this.A01;
                int i13 = this.A02;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(i12);
                gradientDrawable.setStroke(2Wd.A00(r5.Bnf(), ((C53913GwJ) this.A04).A00), i13);
                gradientDrawable.setCornerRadius((float) 2Wd.A00(r5.Bnf(), Double.doubleToRawLongBits(18.0d)));
                return gradientDrawable;
        }
        C3254772o.A01(r3);
        return C60340gF.A00;
    }
}
