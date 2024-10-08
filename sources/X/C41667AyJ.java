package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.AyJ  reason: case insensitive filesystem */
public final class C41667AyJ extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ C376429Hy A03;
    public final /* synthetic */ AnonymousClass80G A04;
    public final /* synthetic */ C354428Lz A05;
    public final /* synthetic */ C354188Kz A06;
    public final /* synthetic */ C380379Xt A07;
    public final /* synthetic */ ClipsCreationViewModel A08;
    public final /* synthetic */ AnonymousClass8M1 A09;
    public final /* synthetic */ AnonymousClass861 A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41667AyJ(ViewGroup viewGroup, C376429Hy r3, AnonymousClass80G r4, C354428Lz r5, C354188Kz r6, C380379Xt r7, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8M1 r9, AnonymousClass861 r10, float f, float f2) {
        super(1);
        this.A07 = r7;
        this.A02 = viewGroup;
        this.A04 = r4;
        this.A05 = r5;
        this.A0A = r10;
        this.A06 = r6;
        this.A03 = r3;
        this.A00 = f;
        this.A09 = r9;
        this.A08 = clipsCreationViewModel;
        this.A01 = f2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        Integer A012;
        Bitmap bitmap = (Bitmap) obj;
        0qQ.A0B(bitmap, 0);
        C380379Xt r7 = this.A07;
        ViewGroup viewGroup = this.A02;
        r7.setBackground(new BitmapDrawable(viewGroup.getContext().getResources(), bitmap));
        r7.setVisibility(0);
        AnonymousClass80G r11 = this.A04;
        boolean z = false;
        if (r11.A0D != null) {
            z = true;
            r11.A05().setVisibility(4);
        }
        C354428Lz r10 = this.A05;
        r10.A05 = true;
        AnonymousClass861 r3 = this.A0A;
        if (r3.A0A.A02() == AnonymousClass8YU.PLAYING) {
            r10.A03 = -1;
        }
        C354188Kz r12 = this.A06;
        C376429Hy A002 = AnonymousClass9T9.A00(r12.A05, 1.0f);
        r10.A01 = A002;
        C376429Hy A032 = C39899AIg.A03(this.A03, A002);
        r10.A04 = false;
        float f2 = A032.A02;
        float f3 = A032.A00;
        float f4 = this.A00;
        r12.A09(A032.A03 / 3.0f, f2, f3 / f4, A032.A01 / f4);
        r10.A04 = true;
        if (z) {
            MultiListenerTextureView A062 = r11.A06();
            Matrix A0U = AnonymousClass7TE.A0U();
            A0U.setScale(f4, f4, AnonymousClass7TE.A02(r11.A05()) / 2.0f, AnonymousClass7TE.A03(r11.A05()) / 2.0f);
            A062.setTransform(A0U);
        } else {
            r11.A05().setScaleX(f4);
            r11.A05().setScaleY(f4);
        }
        r10.A00 = f4;
        AnonymousClass8M1 r2 = this.A09;
        int A003 = r3.A00();
        C381529bu A004 = AnonymousClass8M1.A00(r2);
        if (!(A004 == null || (A012 = AnonymousClass8M1.A01(r2.A0E(A004.A02), A003)) == null)) {
            A003 = A012.intValue();
        }
        r3.A07(A003);
        C381529bu A005 = AnonymousClass8M1.A00(r2);
        if (A005 != null) {
            0eP A0E = r2.A0E(A005.A02);
            r3.A08(AnonymousClass7TE.A0M(A0E.A00), AnonymousClass7TE.A0M(A0E.A01));
        }
        ClipsCreationViewModel clipsCreationViewModel = this.A08;
        float f5 = this.A01;
        if (f5 < 0.5625f) {
            f = 0.5625f / f5;
        } else {
            f = 1.0f;
        }
        AnonymousClass7TE.A1Z(new C59714JUx(clipsCreationViewModel, (AnonymousClass4D7) null, f, 10), C318116oQ.A00(clipsCreationViewModel));
        viewGroup.removeView(r7);
        viewGroup.addView(r7);
        return C60340gF.A00;
    }
}
