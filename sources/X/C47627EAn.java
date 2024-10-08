package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.EAn  reason: case insensitive filesystem */
public final class C47627EAn extends C231632rz {
    public final Context A00;

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return obj.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return ((C49414EvG) obj).A00;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47627EAn(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-547222947);
        AnonymousClass7TG.A1O(view, obj);
        Object tag = view.getTag();
        if (tag != null) {
            C49413EvF evF = (C49413EvF) tag;
            int i2 = ((C49414EvG) obj).A00;
            0qQ.A0B(evF, 0);
            TextView textView = evF.A00;
            Context context = textView.getContext();
            int i3 = R.attr.igds_color_primary_text;
            if (i2 == 0) {
                i3 = R.attr.igds_color_secondary_icon;
            }
            DbT.A17(context, textView, 2Yu.A0H(context, i3));
            textView.setText(AnonymousClass3f0.A03(AnonymousClass7TF.A0A(context), Integer.valueOf(i2), 2131968488));
            AnonymousClass0fD.A0A(1120885074, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-265153022, A03);
        throw A0y;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -738995748);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.video_view_count_header_row);
        0qQ.A0A(A0C);
        A0C.setTag(new C49413EvF(A0C));
        AnonymousClass0fD.A0A(-1685697751, A04);
        return A0C;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
