package X;

import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.ui.widget.expanding.ExpandingListView;

/* renamed from: X.Uo9  reason: case insensitive filesystem */
public final class C16082Uo9 extends AnonymousClass1GX {
    public final int A00;
    public final Object A01;

    public C16082Uo9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onScrollStateChanged(C238133Ar r5, int i) {
        int A03;
        int i2;
        if (this.A00 != 0) {
            A03 = AnonymousClass0fD.A03(-1708167874);
            ExpandingListView expandingListView = (ExpandingListView) this.A01;
            if (expandingListView.A00) {
                expandingListView.A01 = AnonymousClass7TF.A1Q(i);
            }
            i2 = 939223258;
        } else {
            A03 = AnonymousClass0fD.A03(-626958013);
            VYI vyi = (VYI) this.A01;
            IgdsInlineSearchBox igdsInlineSearchBox = vyi.A03;
            if (i == 1) {
                igdsInlineSearchBox.A03();
                vyi.A01 = false;
            }
            i2 = -831925132;
        }
        AnonymousClass0fD.A0A(i2, A03);
    }
}
