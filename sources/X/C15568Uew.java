package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Uew  reason: case insensitive filesystem */
public final class C15568Uew extends C336937fQ {
    public VYA A00;
    public final Context A01;
    public final VOR A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, X.V3T] */
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1899120828);
        this.A00 = (VYA) obj;
        if (view == null) {
            view = DbT.A0C(LayoutInflater.from(this.A01), viewGroup, R.layout.location_page_info_page_stacked_title_row);
            TextView A0G = DbU.A0G(view, R.id.super_title);
            TextView A06 = Dba.A06(view);
            ? obj3 = new Object();
            obj3.A00 = A0G;
            obj3.A01 = A06;
            view.setTag(obj3);
        }
        Context context = this.A01;
        V3T v3t = (V3T) DbT.A0o(view);
        VYA vya = this.A00;
        VOR vor = this.A02;
        TextView textView = v3t.A01;
        CharSequence charSequence = vya.A00;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = charSequence.charAt(i2);
            sb.append(charAt);
            if (charAt == 10) {
                while (i3 < length && C13988Tno.A1Z(charSequence, i3)) {
                    i3++;
                }
            }
            i2 = i3;
        }
        textView.setText(sb);
        if (vya.A03) {
            DbT.A17(context, textView, 2Yu.A06(context));
            WBG.A01(textView, 62, vor, vya);
        }
        v3t.A00.setText(vya.A02);
        AnonymousClass0fD.A0A(603244638, A03);
        return view;
    }

    public C15568Uew(Context context, VOR vor) {
        this.A01 = context;
        this.A02 = vor;
    }
}
