package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MmI  reason: case insensitive filesystem */
public final class C67342MmI extends C310586bI {
    public int A00;
    public List A01 = 0sn.A00;
    public C355638Qt A02 = new C355638Qt();
    public final Context A03;
    public final C67341MmH A04;
    public final String A05;

    public final int A00(C255773uh r7) {
        if (r7 != null) {
            Iterator it = this.A01.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!0qQ.A0K(((C52088GEi) it.next()).A04, r7.A0j)) {
                    i++;
                } else if (i != -1) {
                    return i;
                }
            }
        }
        return 0;
    }

    public final int getCount() {
        return this.A01.size();
    }

    public final Object getItem(int i) {
        return this.A01.get(i);
    }

    public final long getItemId(int i) {
        return this.A02.A00(((C52088GEi) this.A01.get(i)).A04);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = DbT.A0C(LayoutInflater.from(this.A03), (ViewGroup) null, R.layout.layout_story_viewer_scrubber_item);
            0qQ.A0A(view);
            view.setTag(new C70581OCe(view));
        }
        C52088GEi gEi = (C52088GEi) this.A01.get(i);
        Object tag = view.getTag();
        if (tag instanceof C70581OCe) {
            ImageUrl imageUrl = (ImageUrl) gEi.A02;
            if (imageUrl != null) {
                ((C60005JdE) ((C70581OCe) tag).A01.getValue()).A02(imageUrl, this.A05);
            }
            view.setLayoutParams(new FrameLayout.LayoutParams(this.A00, -1));
            AnonymousClass0fU.A00(new C71344Oit(i, 8, gEi, this), view);
        }
        return view;
    }

    public C67342MmI(Context context, C67341MmH mmH, String str) {
        this.A03 = context;
        this.A05 = str;
        this.A04 = mmH;
    }
}
