package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.K9f  reason: case insensitive filesystem */
public final class C61474K9f extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final K6S A02;

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3 = obj;
        View view2 = view;
        int A04 = DbX.A04(view2, 1481839642);
        0qQ.A0B(obj3, 2);
        if (view2.getTag() != null) {
            Object tag = view2.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.settings.common.audiencepicker.AudiencePickerFacepileViewBinder.Holder");
            L73 l73 = (L73) tag;
            C61078JwG jwG = (C61078JwG) obj3;
            AnonymousClass0iw r0 = this.A01;
            K6S k6s = this.A02;
            boolean A1U = AnonymousClass7TF.A1U(0, l73, jwG);
            AnonymousClass7TF.A1C(r0, 2, k6s);
            View view3 = l73.A00;
            Context context = view3.getContext();
            int A042 = JTR.A04(context);
            String moduleName = r0.getModuleName();
            l73.A01.setImageDrawable(C244283aw.A00(context, (Drawable) null, (Float) null, AnonymousClass05K.A00, 5, (Integer) null, (Integer) null, (Integer) null, moduleName, (List) jwG.A00, A042, false, false, false, A1U, false));
            DbT.A18(context, l73.A02, 2131972971);
            C64273LXz.A00(view3, 38, k6s);
        }
        AnonymousClass0fD.A0A(1962530680, A04);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C61474K9f(Context context, AnonymousClass0iw r2, K6S k6s) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = k6s;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(484899515);
        View A0D = DbT.A0D(LayoutInflater.from(this.A00), viewGroup, R.layout.layout_audience_picker_facepile, false);
        A0D.setTag(new L73(A0D));
        AnonymousClass0fD.A0A(504491934, A03);
        return A0D;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
