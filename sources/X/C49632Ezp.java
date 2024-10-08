package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.instagram.android.R;

/* renamed from: X.Ezp  reason: case insensitive filesystem */
public final class C49632Ezp {
    public ArrayAdapter A00;
    public final AutoCompleteTextView A01;
    public final C46713Djj A02;
    public final G61 A03;
    public final C46634DiE A04;

    public C49632Ezp(Context context, AutoCompleteTextView autoCompleteTextView, AnonymousClass0iw r11, 0lg r12, C49366EuU euU, G61 g61, C46634DiE diE, int i, boolean z) {
        this.A01 = autoCompleteTextView;
        autoCompleteTextView.setDropDownHorizontalOffset(context.getResources().getDimensionPixelOffset(R.dimen.menu_popup_panel_shadow_offset));
        autoCompleteTextView.setDropDownBackgroundDrawable(context.getDrawable(2Yu.A0H(context, R.attr.menuPanelBackground)));
        this.A02 = new C46713Djj(context, r11, r12, euU, i, z);
        this.A03 = g61;
        this.A04 = diE;
    }
}
