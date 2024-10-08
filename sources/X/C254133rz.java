package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3rz  reason: invalid class name and case insensitive filesystem */
public final class C254133rz implements C254143s0 {
    public final ViewGroup A00;
    public final RecyclerView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgTextView A04;

    public C254133rz(View view) {
        0qQ.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.clips_container);
        0qQ.A07(requireViewById);
        this.A00 = (ViewGroup) requireViewById;
        IgTextView requireViewById2 = view.requireViewById(R.id.clips_header_title);
        0qQ.A07(requireViewById2);
        this.A04 = requireViewById2;
        IgTextView requireViewById3 = view.requireViewById(R.id.clips_header_subtitle);
        0qQ.A07(requireViewById3);
        this.A03 = requireViewById3;
        IgTextView requireViewById4 = view.requireViewById(R.id.clips_header_cta);
        0qQ.A07(requireViewById4);
        this.A02 = requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.clips_items_view);
        0qQ.A07(requireViewById5);
        this.A01 = (RecyclerView) requireViewById5;
    }

    public final Object BDh(1Xj r6) {
        RecyclerView recyclerView = this.A01;
        AnonymousClass49P r1 = recyclerView.A0A;
        C252553pI r4 = recyclerView.A0D;
        if (!(r1 instanceof AnonymousClass49P) || r4 == null || !(r4 instanceof LinearLayoutManager)) {
            return null;
        }
        C294585mh r0 = r1.A02;
        if (r0 == null) {
            0qQ.A0F("clipsNetegoItemsToRender");
            throw AnonymousClass00P.createAndThrow();
        }
        int i = 0;
        Iterator it = r0.A00.iterator();
        while (true) {
            if (it.hasNext()) {
                if (0qQ.A0K(((C267324bN) it.next()).A02, r6)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        View A1D = r4.A1D(i);
        if (A1D != null) {
            return A1D.getTag();
        }
        return null;
    }

    public final Map BR4() {
        Object obj;
        RecyclerView recyclerView = this.A01;
        AnonymousClass49P r7 = recyclerView.A0A;
        C252553pI r6 = recyclerView.A0D;
        if (!(r7 instanceof AnonymousClass49P) || r6 == null || !(r6 instanceof LinearLayoutManager)) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnonymousClass49P r72 = r7;
        int itemCount = r72.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            View A1D = r6.A1D(i);
            if (A1D != null) {
                obj = A1D.getTag();
            } else {
                obj = null;
            }
            C294585mh r1 = r72.A02;
            1Xj r0 = null;
            if (r1 == null) {
                0qQ.A0F("clipsNetegoItemsToRender");
                throw AnonymousClass00P.createAndThrow();
            }
            C267324bN r12 = (C267324bN) 00k.A0O(r1.A00, i);
            if (r12 != null) {
                r0 = r12.A02;
            }
            if (!(obj == null || r0 == null)) {
                linkedHashMap.put(r0, obj);
            }
        }
        return linkedHashMap;
    }
}
