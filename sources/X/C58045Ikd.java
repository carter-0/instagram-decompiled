package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Ikd  reason: case insensitive filesystem */
public final class C58045Ikd extends LinkedHashMap<JPR, C54485HFr> implements C252243on {
    public final int A00;
    public final FrameLayout A01;
    public final AnonymousClass4DJ A02;
    public final UserSession A03;
    public final 01W A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58045Ikd(FrameLayout frameLayout, AnonymousClass4DJ r4, UserSession userSession, int i) {
        super(i);
        Object[] objArr;
        0qQ.A0B(userSession, 3);
        this.A00 = i;
        this.A01 = frameLayout;
        this.A03 = userSession;
        this.A02 = r4;
        04J r1 = new 04J();
        if (i == 0) {
            objArr = 01W.A03;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw DbW.A0a("Illegal Capacity: ", i);
        }
        r1.A01 = objArr;
        this.A04 = r1;
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
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

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof JPR)) {
            return false;
        }
        return super.containsKey(obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C54485HFr)) {
            return false;
        }
        return super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof JPR)) {
            return null;
        }
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof JPR)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof JPR) || !(obj2 instanceof C54485HFr)) {
            return false;
        }
        return super.remove(obj, obj2);
    }

    public static final Object A00(C62320sa r2) {
        try {
            return r2.invoke();
        } catch (ClassCastException | IllegalArgumentException | IllegalStateException | NullPointerException e) {
            0kg r22 = 0kg.A0A;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            0wb.A01(r22, "MapAnnotationPlaybackManager", message);
            return null;
        }
    }

    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public final void onDestroyView() {
        Iterator A0s = AnonymousClass7TF.A0s(this);
        while (A0s.hasNext()) {
            ((C54485HFr) C51971G9r.A0p(A0s)).A02();
        }
        this.A04.clear();
        clear();
    }

    public final void onStart() {
        Iterator A0s = AnonymousClass7TF.A0s(this);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            ((C54485HFr) A1J.getValue()).A03((JPR) A1J.getKey(), false);
        }
    }

    public final void onStop() {
        Iterator A0s = AnonymousClass7TF.A0s(this);
        while (A0s.hasNext()) {
            ((C54485HFr) C51971G9r.A0p(A0s)).A02();
        }
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public final /* bridge */ Collection values() {
        return super.values();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof JPR)) {
            return null;
        }
        return super.remove(obj);
    }
}
