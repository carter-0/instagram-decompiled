package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.instagram.android.R;
import com.instagram.phonenumber.model.CountryCodeData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Djc  reason: case insensitive filesystem */
public final class C46706Djc extends ArrayAdapter {
    public final ArrayList A00;
    public final List A01;
    public final Context A02;

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            Context context = this.A02;
            view = DbU.A08(LayoutInflater.from(context), R.layout.row_menu_item);
            view.setBackgroundResource(2Yu.A0H(context, R.attr.elevatedBackgroundDrawable));
            view.setPadding(0, 0, 0, 0);
        }
        DbU.A0G(view, R.id.row_simple_text_textview).setText(((CountryCodeData) getItem(i)).A01());
        return view;
    }

    public C46706Djc(Context context, List list) {
        super(context, R.layout.row_menu_item, list);
        this.A02 = context;
        this.A01 = list;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A00 = A1C;
        A1C.addAll(list);
    }
}
