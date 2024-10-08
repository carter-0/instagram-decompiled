package X;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7kS  reason: invalid class name and case insensitive filesystem */
public final class C339957kS extends 02Z {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C358088aL A01;
    public final /* synthetic */ AnonymousClass8EP A02;

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C347117wI r0;
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityNodeInfoCompat, 1);
        C339957kS.super.A0Y(view, accessibilityNodeInfoCompat);
        AnonymousClass8EP r1 = this.A02;
        Context context = r1.A05.getContext();
        0qQ.A07(context);
        UserSession userSession = r1.A07;
        C358088aL r12 = this.A01;
        int i = this.A00;
        0qQ.A0B(r12, 2);
        List A012 = C347067wD.A01(userSession, r12);
        String str = null;
        if ((!A012.isEmpty()) && i >= 0 && i < A012.size() && (r0 = (C347117wI) 00k.A0O(A012, i)) != null) {
            str = context.getString(r0.A00);
        }
        accessibilityNodeInfoCompat.setContentDescription(str);
    }

    public C339957kS(C358088aL r1, AnonymousClass8EP r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }
}
