package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.instagram.android.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.70u  reason: invalid class name and case insensitive filesystem */
public final class C3250370u {
    public int A00;
    public boolean A01;
    public final ViewGroup A02;
    public final LinearLayout A03;
    public final LinearLayout A04;
    public final C71662eb A05;
    public final C71662eb A06;
    public final Map A07 = new HashMap();
    public final Map A08;

    public C3250370u(View view, boolean z) {
        HashMap hashMap = new HashMap();
        this.A08 = hashMap;
        ViewGroup viewGroup = (ViewGroup) view;
        this.A02 = viewGroup;
        this.A04 = (LinearLayout) view.requireViewById(R.id.profile_header_actions_top_row);
        this.A06 = new C71662eb((ViewStub) view.findViewById(R.id.profile_header_actions_prominent_messaging_row));
        this.A05 = new C71662eb((ViewStub) view.findViewById(R.id.profile_header_actions_bottom_row_stub));
        this.A03 = (LinearLayout) view.requireViewById(R.id.similar_accounts_container);
        this.A01 = z;
        Context context = viewGroup.getContext();
        int A012 = AnonymousClass0nB.A01(context);
        this.A00 = A012;
        C3250470v.A01(context, hashMap, A012);
    }
}
