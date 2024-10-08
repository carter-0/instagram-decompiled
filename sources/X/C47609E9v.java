package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.E9v  reason: case insensitive filesystem */
public final class C47609E9v extends C231632rz {
    public final Context A00;
    public final FAF A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47609E9v(Context context, FAF faf) {
        this.A00 = context;
        this.A01 = faf;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1038010292);
        C49453Evu evu = (C49453Evu) obj;
        TextView textView = (TextView) view;
        Integer num = evu.A00;
        String str = evu.A01;
        FAF faf = this.A01;
        Context context = textView.getContext();
        int intValue = num.intValue();
        Resources resources = context.getResources();
        SpannableString spannableString = new SpannableString(resources.getString(2131969098));
        spannableString.setSpan(new C46691DjK(context, faf, str, 1), 0, spannableString.length(), 18);
        String A0v = DbV.A0v(resources, num, R.plurals.anonymous_likers_message, intValue);
        SpannableStringBuilder A0C = DbS.A0C(A0v);
        int indexOf = A0v.indexOf("{original_post}");
        A0C.replace(indexOf, indexOf + 15, spannableString);
        textView.setText(A0C);
        AnonymousClass0fD.A0A(639240891, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(216419037);
        TextView textView = (TextView) DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.aggregated_engagement_view);
        DbT.A1H(textView);
        AnonymousClass0fD.A0A(-653188946, A03);
        return textView;
    }
}
