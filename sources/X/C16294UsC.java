package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import java.util.List;

/* renamed from: X.UsC  reason: case insensitive filesystem */
public abstract class C16294UsC extends UFN implements C74372Ptm {
    public List A00;
    public final XBP A01;

    public View A04(int i) {
        return (View) ((C16343UtG) this).A01.A07.get(i);
    }

    public ViewPager A05() {
        return ((C16343UtG) this).A00;
    }

    public final void A03(Object obj) {
        setMode(this.A00.indexOf(obj));
    }

    public final Fragment createItem(int i) {
        return this.A01.ALb(this.A00.get(i));
    }

    public final int getCount() {
        return this.A00.size();
    }

    public C16294UsC(0hq r1, XBP xbp, List list) {
        super(r1);
        this.A01 = xbp;
        this.A00 = list;
    }

    public final Fragment A01() {
        Fragment item = getItem(A05().getCurrentItem());
        0qQ.A07(item);
        return item;
    }

    public final Object A02() {
        return this.A00.get(A05().getCurrentItem());
    }

    public void setMode(int i) {
        A05().setCurrentItem(i);
    }
}
