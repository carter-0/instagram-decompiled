package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7WN  reason: invalid class name */
public final class AnonymousClass7WN extends BroadcastReceiver {
    public final AnonymousClass4DH A00;
    public final Map A01 = 0Yt.A06(new 0eP[]{new 0eP(AnonymousClass7WO.A00, new AtomicReference()), new 0eP(AnonymousClass7WO.A01, new AtomicReference()), new 0eP(AnonymousClass7WO.A02, new AtomicReference()), new 0eP(AnonymousClass7WO.A03, new AtomicReference()), new 0eP(AnonymousClass7WO.A04, new AtomicReference()), new 0eP(AnonymousClass7WO.A05, new AtomicReference()), new 0eP(AnonymousClass7WO.A06, new AtomicReference()), new 0eP(AnonymousClass7WO.A07, new AtomicReference())});

    /* JADX WARNING: type inference failed for: r3v0, types: [X.0r1, java.lang.Object] */
    public static final void A00(C239973Ja r4, AnonymousClass7WN r5, 0sP r6) {
        ? obj = new Object();
        C226442gp r2 = C226442gp.A00;
        Object obj2 = r5.A01.get(r4);
        if (obj2 != null) {
            File A02 = r2.A02(r4, new ASU(r6, obj), (AtomicReference) obj2);
            if (A02 != null) {
                r6.invoke(A02);
                obj.A00 = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass7WN(AnonymousClass4DH r11) {
        this.A00 = r11;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        View view;
        View findViewById;
        ViewStub viewStub;
        RecyclerView recyclerView;
        View findViewById2;
        int A012 = AnonymousClass0fD.A01(1404814151);
        AnonymousClass0fQ.A01(this, context, intent);
        0qQ.A0B(context, 0);
        0qQ.A0B(intent, 1);
        AnonymousClass4DH r2 = this.A00;
        FragmentActivity activity = r2.getActivity();
        ViewParent viewParent = null;
        if (!(activity == null || (findViewById2 = activity.findViewById(R.id.thread_toggle_child_fragment_container)) == null)) {
            viewParent = findViewById2.getParent();
        }
        if (!(viewParent instanceof ViewGroup) || (view = (View) viewParent) == null) {
            i = -1341547793;
        } else {
            FragmentActivity activity2 = r2.getActivity();
            if (activity2 == null || (findViewById = activity2.findViewById(R.id.direct_debug_options)) == null) {
                i = 1986391154;
            } else {
                if ((findViewById instanceof ViewStub) && (viewStub = (ViewStub) findViewById) != null && viewStub.getVisibility() != 0) {
                    View inflate = viewStub.inflate();
                    if (!(inflate instanceof RecyclerView) || (recyclerView = (RecyclerView) inflate) == null) {
                        i = 1892678508;
                    } else {
                        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 4));
                        recyclerView.setAdapter(new U9l(0sr.A1P(new C17343VRw[]{new C17343VRw("text", new C73897PlY(this, 9)), new C17343VRw("photo", new C73897PlY(this, 8)), new C17343VRw("close", new C73897PlY(this, 7))})));
                    }
                } else if (findViewById instanceof RecyclerView) {
                    findViewById.setVisibility(0);
                }
                Context context2 = view.getContext();
                0qQ.A07(context2);
                0nA.A0X(view, AnonymousClass1GB.A01(0nA.A04(context2, 80)));
                for (C239973Ja A002 : this.A01.keySet()) {
                    A00(A002, this, C41730AzL.A00);
                }
                i = 474505652;
            }
        }
        AnonymousClass0fD.A0E(i, A012, intent);
    }
}
