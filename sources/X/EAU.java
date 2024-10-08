package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class EAU extends C231632rz {
    public final Context A00;
    public final E9F A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public EAU(Context context, E9F e9f, AnonymousClass0iw r3, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = context;
        this.A02 = r3;
        this.A01 = e9f;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(-413219306);
        if (view.getTag() == null) {
            AnonymousClass0fD.A0A(798105432, A032);
        } else {
            view.getTag();
            throw AnonymousClass7TE.A11("getPagePhotoRowData");
        }
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(134369530);
        Context context = this.A00;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        linearLayout.setOrientation(1);
        View A0C = DbT.A0C(LayoutInflater.from(context), linearLayout, R.layout.page_row_with_preview);
        A0C.setTag(new F09(A0C));
        linearLayout.addView(A0C);
        F09 f09 = (F09) A0C.getTag();
        if (f09 != null) {
            linearLayout.setTag(new EtR(f09));
        }
        AnonymousClass0fD.A0A(139403945, A032);
        return linearLayout;
    }
}
