package X;

import com.instagram.creation.photo.edit.ui.FilterFragmentLayout;

/* renamed from: X.LlS  reason: case insensitive filesystem */
public final class C64989LlS implements C41830B2l {
    public final /* synthetic */ FilterFragmentLayout A00;
    public final /* synthetic */ C59962JcV A01;
    public final /* synthetic */ JVX A02;

    public C64989LlS(FilterFragmentLayout filterFragmentLayout, C59962JcV jcV, JVX jvx) {
        this.A01 = jcV;
        this.A02 = jvx;
        this.A00 = filterFragmentLayout;
    }

    public final void DnG() {
        C59962JcV jcV = this.A01;
        jcV.A0Z = true;
        C234502xy r0 = jcV.A0R;
        if (r0 != null) {
            r0.release();
        }
    }

    public final void DnH() {
        LPP.A00(AnonymousClass7TE.A0l(this.A01.A0i));
    }

    public final void DnI() {
        FilterFragmentLayout filterFragmentLayout = this.A00;
        C59962JcV jcV = this.A01;
        filterFragmentLayout.A00 = jcV.A0H;
        AnonymousClass0eM r0 = jcV.A0i;
        LPP.A01(AnonymousClass7TE.A0l(r0), this.A02, JZM.A01(AnonymousClass7TE.A0l(r0)));
    }

    public final void DnJ() {
        C59962JcV jcV = this.A01;
        LG9 lg9 = jcV.A0L;
        if (lg9 != null) {
            lg9.A01(C62642Kk4.A02, this.A02);
        }
        C357318Xk r1 = jcV.A0H;
        if (r1 != null) {
            r1.A04(false);
        }
        AnonymousClass0eM r0 = jcV.A0i;
        LPP.A02(AnonymousClass7TE.A0l(r0), this.A02, JZM.A01(AnonymousClass7TE.A0l(r0)), "photo_filter", false);
    }
}
