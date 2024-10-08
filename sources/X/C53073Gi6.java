package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gi6  reason: case insensitive filesystem */
public final class C53073Gi6 extends 2Rw {
    public final Activity A00;
    public final AnonymousClass07Z A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final 1Xj A04;
    public final List A05;
    public final 0sP A06;
    public final boolean A07;

    public C53073Gi6(Activity activity, AnonymousClass07Z r3, AnonymousClass0iw r4, UserSession userSession, 1Xj r6, List list, 0sP r8, boolean z) {
        AnonymousClass7TF.A1E(userSession, 2, list);
        this.A00 = activity;
        this.A03 = userSession;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
        this.A07 = z;
        this.A05 = list;
        this.A06 = r8;
    }

    public final void onBindViewHolder(C249703kE r3, int i) {
        C53110Gii gii;
        0qQ.A0B(r3, 0);
        C57088IOc iOc = (C57088IOc) 00k.A0O(this.A05, i);
        if (iOc != null && (r3 instanceof C54593HKc) && (gii = (C53110Gii) r3) != null) {
            gii.A01(iOc);
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.recipe_item_cutout_sticker, viewGroup, false);
        Activity activity = this.A00;
        UserSession userSession = this.A03;
        1Xj r8 = this.A04;
        AnonymousClass0iw r6 = this.A02;
        AnonymousClass07Z r5 = this.A01;
        boolean z = this.A07;
        0sP r9 = this.A06;
        AnonymousClass7TF.A1E(inflate, 0, r9);
        return new C54593HKc(activity, inflate, r5, r6, userSession, r8, r9, z);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(619382886);
        int size = this.A05.size();
        AnonymousClass0fD.A0A(1120668420, A032);
        return size;
    }
}
