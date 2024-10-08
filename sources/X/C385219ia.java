package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;

/* renamed from: X.9ia  reason: invalid class name and case insensitive filesystem */
public final class C385219ia extends C231632rz {
    public final int A00 = 3;
    public final UserSession A01;
    public final AnonymousClass8MJ A02;

    public C385219ia(UserSession userSession, AnonymousClass8MJ r3) {
        this.A01 = userSession;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 0);
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1289497599);
        0qQ.A0B(view, 1);
        AnonymousClass9YM r1 = ((RecyclerView) view).A0A;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.HorizontalScrollingStickerAdapter");
        AnonymousClass9YM r12 = r1;
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.creation.capture.assetpicker.model.StaticSticker>");
        Collection collection = (Collection) obj;
        0qQ.A0B(collection, 0);
        List list = r12.A00;
        list.clear();
        list.addAll(collection);
        r12.notifyDataSetChanged();
        AnonymousClass0fD.A0A(182795031, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-820604114);
        0qQ.A0B(viewGroup, 1);
        Context context = viewGroup.getContext();
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        int A07 = AnonymousClass7TG.A07(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ad_stories_more_info_footer_width) / this.A00;
        recyclerView.setAdapter(new AnonymousClass9YM(this.A01, this.A02));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        0nA.A0k(recyclerView, 0, A07, 0, A07);
        recyclerView.A11(new AnonymousClass3V7(dimensionPixelSize, (-dimensionPixelSize) / 2));
        AnonymousClass0fD.A0A(607694201, A03);
        return recyclerView;
    }
}
