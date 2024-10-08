package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8BS  reason: invalid class name */
public final class AnonymousClass8BS extends BaseAdapter {
    public boolean A00;
    public boolean A01;
    public final List A02;
    public final int A03 = R.layout.color_palette;
    public final LayoutInflater A04;
    public final UserSession A05;
    public final AnonymousClass8BL A06;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.A04.inflate(this.A03, viewGroup, false);
        }
        0qQ.A0C(view, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette");
        ColorPalette colorPalette = (ColorPalette) view;
        colorPalette.A05 = this.A06;
        UserSession userSession = this.A05;
        List list = this.A02;
        colorPalette.setColorStops(userSession, (ArrayList) list.get(i));
        if (this.A01 && ((AbstractCollection) list.get(i)).size() < 10) {
            z = true;
        }
        colorPalette.A07 = z;
        colorPalette.setIsItemRectangular(this.A00);
        return colorPalette;
    }

    public final int getCount() {
        return this.A02.size();
    }

    public final Object getItem(int i) {
        return this.A02.get(i);
    }

    public AnonymousClass8BS(Context context, UserSession userSession, AnonymousClass8BL r6, List list) {
        this.A05 = userSession;
        this.A06 = r6;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AnonymousClass8BT.A00((ArrayList) it.next()));
        }
        this.A02 = arrayList;
        LayoutInflater from = LayoutInflater.from(context);
        0qQ.A07(from);
        this.A04 = from;
    }
}
