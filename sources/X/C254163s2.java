package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3s2  reason: invalid class name and case insensitive filesystem */
public final class C254163s2 {
    public AnonymousClass4WX A00;
    public AnonymousClass3W1 A01;
    public final Context A02;
    public final View A03;
    public final ViewGroup A04;
    public final C254003rm A05;
    public final AnonymousClass4EA A06;
    public final Map A07 = new LinkedHashMap();

    public C254163s2(ViewGroup viewGroup, C254003rm r3, AnonymousClass4EA r4) {
        this.A04 = viewGroup;
        this.A05 = r3;
        this.A06 = r4;
        Context context = viewGroup.getContext();
        0qQ.A07(context);
        this.A02 = context;
        View requireViewById = viewGroup.requireViewById(R.id.top_legibility_gradient);
        0qQ.A07(requireViewById);
        this.A03 = requireViewById;
    }
}
