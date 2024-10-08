package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Vsv  reason: case insensitive filesystem */
public final class C18500Vsv {
    public 1DN A00;
    public final Activity A01;
    public final Context A02;
    public final ViewGroup A03;
    public final ViewGroup A04;
    public final Map A05 = new LinkedHashMap();
    public final Drawable A06;

    public C18500Vsv(Activity activity, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 2);
        this.A01 = activity;
        this.A03 = viewGroup;
        Context context = viewGroup.getContext();
        this.A02 = context;
        this.A04 = (ViewGroup) DbW.A09(LayoutInflater.from(context), viewGroup, R.layout.permission_multiitem_preprompt_view, false);
        0qQ.A07(context);
        Drawable A012 = AnonymousClass4Ed.A01(context, R.drawable.instagram_check_pano_outline_24, 2Yu.A09(activity));
        if (A012 != null) {
            int A042 = (int) 0nA.A04(activity, 12);
            A012.setBounds(0, 0, A042, A042);
        } else {
            A012 = null;
        }
        this.A06 = A012;
    }

    public static final void A00(TextView textView, C18500Vsv vsv, String str) {
        LinearLayout.LayoutParams layoutParams;
        int i;
        Activity activity = vsv.A01;
        boolean A07 = 1DL.A07(activity, str);
        String A002 = AnonymousClass000.A00(6);
        if (A07) {
            DbY.A11(textView, activity);
            textView.setOnClickListener((View.OnClickListener) null);
            textView.setCompoundDrawablePadding((int) 0nA.A04(activity, 8));
            textView.setCompoundDrawablesRelative(vsv.A06, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setTextAlignment(4);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            0qQ.A0C(layoutParams2, A002);
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            i = 8388627;
        } else {
            DbT.A17(textView.getContext(), textView, 2Yu.A0H(activity, R.attr.igds_color_gradient_blue));
            AnonymousClass0fU.A00(new C11486Sb9(textView, vsv, str, 3), textView);
            textView.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            0qQ.A0C(layoutParams3, A002);
            layoutParams = (LinearLayout.LayoutParams) layoutParams3;
            i = 17;
        }
        layoutParams.gravity = i;
        textView.setLayoutParams(layoutParams);
    }
}
