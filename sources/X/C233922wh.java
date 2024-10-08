package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2wh  reason: invalid class name and case insensitive filesystem */
public final class C233922wh extends AnonymousClass1GX implements C252243on {
    public C238643Cr A00;
    public int A01 = 0;
    public final AnonymousClass0iw A02;
    public final 0Pl A03;
    public final List A04;
    public final Map A05;
    public final UserSession A06;

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void onDestroyView() {
        C238643Cr r1 = this.A00;
        if (r1 != null) {
            r1.A02.clear();
            C226952iF r0 = r1.A00;
            if (r0 != null) {
                r0.AGE();
            }
            r1.A00 = null;
        }
        this.A05.clear();
        this.A00 = null;
    }

    public C233922wh(Context context, AnonymousClass0iw r4, UserSession userSession, 0Pl r6, boolean z) {
        Object r0;
        this.A02 = r4;
        this.A03 = r6;
        this.A06 = userSession;
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A05 = new HashMap();
        if (z) {
            r0 = new C233932wi(context, this);
        } else {
            r0 = new C322266vW(context, this);
        }
        arrayList.add(r0);
    }

    public static void A00(Context context, Adapter adapter, C233922wh r5, int i) {
        Object item = adapter.getItem(i);
        if (item instanceof 1Xj) {
            1Xj r2 = (1Xj) item;
            C238643Cr r1 = r5.A00;
            if (r2.A4w() && r1 != null) {
                r1.A01(r2.A1n(context));
                User A2A = r2.A2A(r5.A06);
                if (A2A != null) {
                    1OO A0J = 1NK.A00().A0J(A2A.Bh3(), r5.A02.getModuleName());
                    A0J.A0I = true;
                    A0J.A01();
                }
            }
        }
    }

    public final void D6z(View view) {
        C238643Cr r1 = new C238643Cr(view.getContext());
        this.A00 = r1;
        r1.A01 = this.A02.getModuleName();
        ((ViewGroup) view).addView(this.A00, new ViewGroup.LayoutParams(1, 1));
        this.A00.setVisibility(8);
    }

    public final void onScrollStateChanged(C238133Ar r10, int i) {
        Adapter adapter;
        int A032 = AnonymousClass0fD.A03(-598830410);
        ViewGroup CEd = r10.CEd();
        if (r10.CWN()) {
            adapter = ((AdapterView) CEd).getAdapter();
        } else {
            adapter = ((RecyclerView) CEd).A0A;
        }
        adapter.getClass();
        Adapter adapter2 = adapter;
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        int B6L = r10.B6L();
        int i2 = this.A01;
        if (B6L > i2) {
            int i3 = 0;
            while (true) {
                List list = this.A04;
                if (i3 >= list.size()) {
                    break;
                }
                ((C233952wk) list.get(i3)).A02(adapter2, r10.BLQ());
                i3++;
            }
        } else if (B6L < i2) {
            int i4 = 0;
            while (true) {
                List list2 = this.A04;
                if (i4 >= list2.size()) {
                    break;
                }
                ((C233952wk) list2.get(i4)).A03(adapter2, B6L);
                i4++;
            }
        }
        this.A01 = B6L;
        C238643Cr r0 = this.A00;
        if (r0 != null) {
            if (z) {
                r0.setEnabled(true);
                r0.A00();
            } else {
                r0.setEnabled(false);
            }
        }
        AnonymousClass0fD.A0A(1699123546, A032);
    }
}
