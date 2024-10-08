package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import java.util.List;

/* renamed from: X.8hg  reason: invalid class name and case insensitive filesystem */
public final class C362308hg extends C232232tF {
    public final C362218hX A00;

    public C362308hg(C362218hX r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        AnonymousClass8XA.A01(this.A00.A00.A0A).A0A(2);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.redesigned_layout_tool_destination_item, viewGroup, false);
        0qQ.A07(inflate);
        C394439y7.A00(inflate);
        return new C380469Yh(inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        C362278hd r62 = (C362278hd) r6;
        C380469Yh r72 = (C380469Yh) r7;
        0qQ.A0B(r62, 0);
        0qQ.A0B(r72, 1);
        AnonymousClass3NG r1 = new AnonymousClass3NG(r72.A00);
        r1.A04 = new C386109k4(this);
        r1.A07 = true;
        r1.A05 = AnonymousClass05K.A01;
        r1.A00();
        List list = r62.A00;
        if (list != null) {
            Medium medium = (Medium) 00k.A0O(list, 0);
            if (medium != null) {
                r72.A02.setImageURI(medium.A02());
            }
            Medium medium2 = (Medium) 00k.A0O(list, 1);
            if (medium2 != null) {
                r72.A01.setImageURI(medium2.A02());
            }
        }
    }

    public final Class modelClass() {
        return C362278hd.class;
    }
}
