package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Hto  reason: case insensitive filesystem */
public final class C56160Hto {
    public SpannableStringBuilder A00;
    public XCD A01;
    public CharSequence A02;
    public boolean A03;
    public final 0lg A04;
    public final LinkedList A05 = new LinkedList();
    public final List A06 = new ArrayList();
    public final List A07 = new ArrayList();

    public C56160Hto(0lg r2) {
        0qQ.A0B(r2, 1);
        this.A04 = r2;
    }

    public final void A00(Context context, View.OnClickListener onClickListener, String str, int i) {
        A03(context, onClickListener, str, (String) null, i, true);
    }

    public final void A01(Context context, View.OnClickListener onClickListener, String str, int i) {
        A03(context, onClickListener, str, (String) null, i, false);
    }

    public final void A02(Context context, View.OnClickListener onClickListener, String str, String str2, float f, int i, int i2, boolean z, boolean z2, boolean z3) {
        String str3 = str;
        0qQ.A0B(str, 1);
        int i3 = R.attr.igds_color_primary_text;
        if (z) {
            i3 = R.attr.igds_color_error_or_destructive;
        }
        C67293MlS mlS = new C67293MlS(onClickListener, str3, f, 2Yu.A0H(context, i3), i, i2);
        mlS.A03 = str2;
        mlS.A05 = z3;
        mlS.A06 = z2;
        this.A05.add(mlS);
    }

    public final void A03(Context context, View.OnClickListener onClickListener, String str, String str2, int i, boolean z) {
        AnonymousClass7TF.A1D(str, 1, onClickListener);
        A02(context, onClickListener, str, str2, 1.0f, i, 0, z, false, true);
    }

    public final void A04(Context context, AnonymousClass3NK r14, String str, String str2, float f, int i, boolean z) {
        List list;
        String str3 = str2;
        AnonymousClass7TG.A1O(str, str3);
        C17685VcG vcG = new C17685VcG((Drawable) null, context.getDrawable(i), (ImageUrl) null, r14, str3, str, f, z, true, false);
        if (z) {
            list = this.A06;
        } else {
            list = this.A07;
        }
        list.add(vcG);
    }

    public final void A06(boolean z) {
        LinkedList linkedList = this.A05;
        if (z) {
            linkedList.addFirst(new C70944OSr(true));
        } else {
            DbV.A1W(linkedList, true);
        }
    }

    public final void A05(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, String str, String str2, int i, int i2, int i3, int i4, int i5) {
        View.OnClickListener onClickListener3 = onClickListener;
        View.OnClickListener onClickListener4 = onClickListener2;
        OIM oim = new OIM(onClickListener3, (View.OnClickListener) null, onClickListener4, (C358618bC) null, C69349Njo.TYPE_DISMISS, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), (Integer) null, (Integer) null, str, (String) null, str2, true, true);
        LinkedList linkedList = this.A05;
        linkedList.addFirst(new C70944OSr(true));
        linkedList.addFirst(oim);
    }
}
