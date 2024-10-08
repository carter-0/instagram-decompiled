package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public final class U45 extends ArrayAdapter {
    public Integer A00;
    public Integer A01;
    public final LayoutInflater A02;

    public U45(Context context, List list) {
        super(context, 0, list);
        Object systemService = context.getSystemService(AnonymousClass000.A00(318));
        0Sd.A00(systemService);
        this.A02 = (LayoutInflater) systemService;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return A00(view, viewGroup, i, true);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return A00(view, viewGroup, i, false);
    }

    private TextView A00(View view, ViewGroup viewGroup, int i, boolean z) {
        Integer num;
        C17306VQh vQh = (C17306VQh) getItem(i);
        boolean z2 = false;
        if (view == null) {
            int i2 = 17367048;
            if (z) {
                i2 = 17367049;
            }
            view = this.A02.inflate(i2, viewGroup, false);
            view.setTag(((TextView) view).getTextColors());
            z2 = true;
        }
        TextView textView = (TextView) view;
        textView.setText(vQh.A01);
        if ((!z && (num = this.A01) != null) || (num = vQh.A00) != null) {
            textView.setTextColor(num.intValue());
        } else if (textView.getTag() != null && !z2) {
            textView.setTextColor((ColorStateList) textView.getTag());
        }
        Integer num2 = this.A00;
        if (num2 != null) {
            textView.setBackgroundColor(num2.intValue());
        }
        return textView;
    }
}
