package X;

import android.widget.AbsListView;
import com.instagram.ui.widget.gallery.GalleryView;
import java.util.List;

public final class LZD implements AbsListView.OnScrollListener {
    public final int A00;
    public final Object A01;

    public LZD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A03;
        int i4;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(-1229441559);
                i4 = 2067989133;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(629725379);
                ((C15385Ubk) this.A01).A05.onScroll(absListView, i, i2, i3);
                i4 = -1984983193;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(1515084870);
                List list = ((C14160Tqw) this.A01).A04;
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i4 = -37254775;
                        break;
                    } else {
                        ((C249383je) list.get(size)).onScroll(absListView, i, i2, i3);
                    }
                }
            default:
                A03 = AnonymousClass0fD.A03(-1571081089);
                GalleryView galleryView = (GalleryView) this.A01;
                C60054JeM jeM = galleryView.A0C;
                if (jeM != null) {
                    int AJv = jeM.AJv(i);
                    C361778gm r0 = galleryView.A0B;
                    if (r0 != null) {
                        r0.A07(AJv);
                    }
                    C361778gm r02 = galleryView.A0B;
                    if (r02 != null) {
                        r02.A06();
                    }
                }
                i4 = -639658166;
                break;
        }
        AnonymousClass0fD.A0A(i4, A03);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03;
        int i2;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(-1743868717);
                if (i == 1) {
                    ((E6U) this.A01).A04.A04();
                }
                i2 = -951671187;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(553395663);
                ((C15385Ubk) this.A01).A05.onScrollStateChanged(absListView, i);
                i2 = -75139858;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(1071933151);
                List list = ((C14160Tqw) this.A01).A04;
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i2 = -1935348772;
                        break;
                    } else {
                        ((C249383je) list.get(size)).onScrollStateChanged(absListView, i);
                    }
                }
            default:
                A03 = AnonymousClass0fD.A03(1582236343);
                i2 = 68767407;
                break;
        }
        AnonymousClass0fD.A0A(i2, A03);
    }
}
