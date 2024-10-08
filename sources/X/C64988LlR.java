package X;

import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.creation.photo.edit.ui.FilterFragmentLayout;

/* renamed from: X.LlR  reason: case insensitive filesystem */
public final class C64988LlR implements C41830B2l {
    public final /* synthetic */ AlbumEditFragment A00;
    public final /* synthetic */ FilterFragmentLayout A01;
    public final /* synthetic */ JVX A02;

    public C64988LlR(AlbumEditFragment albumEditFragment, FilterFragmentLayout filterFragmentLayout, JVX jvx) {
        this.A00 = albumEditFragment;
        this.A02 = jvx;
        this.A01 = filterFragmentLayout;
    }

    public final void DnG() {
        AlbumEditFragment albumEditFragment = this.A00;
        albumEditFragment.A0V = true;
        C234502xy r0 = albumEditFragment.A0P;
        if (r0 != null) {
            r0.release();
        }
    }

    public final void DnH() {
        LPP.A00(AnonymousClass7TE.A0l(this.A00.A0d));
    }

    public final void DnI() {
        FilterFragmentLayout filterFragmentLayout = this.A01;
        AlbumEditFragment albumEditFragment = this.A00;
        filterFragmentLayout.A00 = albumEditFragment.A0I;
        AnonymousClass0eM r0 = albumEditFragment.A0d;
        LPP.A01(AnonymousClass7TE.A0l(r0), this.A02, JZM.A01(AnonymousClass7TE.A0l(r0)));
    }

    public final void DnJ() {
        AlbumEditFragment albumEditFragment = this.A00;
        LG9 lg9 = albumEditFragment.A0K;
        if (lg9 != null) {
            lg9.A01(C62642Kk4.A02, this.A02);
        }
        C357318Xk r1 = albumEditFragment.A0I;
        if (r1 != null) {
            r1.A04(false);
        }
        AnonymousClass0eM r5 = albumEditFragment.A0d;
        LPP.A02(AnonymousClass7TE.A0l(r5), this.A02, JZM.A01(AnonymousClass7TE.A0l(r5)), albumEditFragment.A0Z, AnonymousClass30D.A0F(AnonymousClass7TE.A0l(r5)));
    }
}
