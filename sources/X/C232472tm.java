package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.emptystate.IgdsEmptyState;
import java.util.Arrays;

/* renamed from: X.2tm  reason: invalid class name and case insensitive filesystem */
public final class C232472tm extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final String getBinderGroupName() {
        return "PartialEmptyState";
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        C49648F0f f0f = (C49648F0f) obj;
        return Arrays.hashCode(new Object[]{f0f.A01, Boolean.valueOf(f0f.A06), f0f.A04, f0f.A03, Boolean.valueOf(f0f.A05)});
    }

    public C232472tm(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int intValue;
        int A03 = AnonymousClass0fD.A03(1403186767);
        C49648F0f f0f = (C49648F0f) obj;
        Object tag = view.getTag();
        tag.getClass();
        C70595OCs oCs = (C70595OCs) tag;
        Integer num = f0f.A01;
        if (!(num == null || (intValue = num.intValue()) == -1)) {
            oCs.A01.EZe(intValue, true);
        }
        IgdsEmptyState igdsEmptyState = oCs.A01;
        igdsEmptyState.setHeadline((CharSequence) f0f.A04);
        igdsEmptyState.setBody((CharSequence) f0f.A03);
        igdsEmptyState.setAction(f0f.A02, f0f.A00);
        int i2 = 0;
        igdsEmptyState.setVisibility(0);
        View view2 = oCs.A00;
        if (f0f.A05) {
            i2 = 8;
        }
        view2.setVisibility(i2);
        AnonymousClass0fD.A0A(-1349574229, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-433745923);
        View inflate = LayoutInflater.from(this.A00).inflate(R.layout.layout_listview_partial_empty_state, viewGroup, false);
        inflate.setTag(new C70595OCs(inflate));
        AnonymousClass0fD.A0A(-1358193065, A03);
        return inflate;
    }
}
