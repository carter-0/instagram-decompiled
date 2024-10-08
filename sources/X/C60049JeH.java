package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.JeH  reason: case insensitive filesystem */
public final class C60049JeH extends BaseAdapter {
    public final UserSession A00;
    public final LinkedHashMap A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final AnonymousClass0iw A03;
    public final LinkedHashMap A04;
    public final boolean A05;
    public final boolean A06;

    public final long getItemId(int i) {
        return 0;
    }

    public final int getCount() {
        return this.A02.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A02.get(i);
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [java.lang.Object, X.Koo] */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        IgImageView A0b;
        int i2;
        if (view == null) {
            boolean z = this.A05;
            boolean z2 = this.A06;
            LayoutInflater A0D = DbV.A0D(viewGroup);
            if (z2 || z) {
                view = A0D.inflate(R.layout.row_alt_text, viewGroup, false);
                A0b = DbT.A0b(view, R.id.thumbnail);
                i2 = R.id.alt_text_view;
            } else {
                view = A0D.inflate(R.layout.row_updated_alt_text, viewGroup, false);
                A0b = DbT.A0b(view, R.id.alt_image_view);
                i2 = R.id.updated_alt_text_view;
            }
            ? obj = new Object();
            obj.A03 = view;
            obj.A04 = A0b;
            obj.A05 = (IgAutoCompleteTextView) view.requireViewById(i2);
            Context context = view.getContext();
            obj.A01 = 0nA.A09(context);
            obj.A00 = JTR.A09(context);
            view.setTag(obj);
        }
        C62936Koo koo = (C62936Koo) DbT.A0o(view);
        List list = this.A02;
        String A19 = AnonymousClass7TE.A19(list, i);
        W7c w7c = new W7c(this, A19);
        if (this.A05 || this.A06) {
            LinkedHashMap linkedHashMap = this.A04;
            linkedHashMap.getClass();
            Object obj2 = linkedHashMap.get(list.get(i));
            obj2.getClass();
            AnonymousClass0iw r1 = this.A03;
            String A0r = DbS.A0r(A19, this.A01);
            koo.A04.setUrl((ImageUrl) obj2, r1);
            IgAutoCompleteTextView igAutoCompleteTextView = koo.A05;
            int i3 = koo.A00;
            igAutoCompleteTextView.A00 = 2.5f;
            igAutoCompleteTextView.A01 = i3;
            igAutoCompleteTextView.setDropDownVerticalOffset(igAutoCompleteTextView.getTop());
            igAutoCompleteTextView.setText(A0r);
            koo.A02 = w7c;
            igAutoCompleteTextView.addTextChangedListener(w7c);
            return view;
        }
        AnonymousClass3Q2 BbQ = ((C267834cI) view.getContext()).BbQ(AnonymousClass7TE.A19(list, i));
        BbQ.getClass();
        String A0r2 = DbS.A0r(A19, this.A01);
        String str = BbQ.A33;
        int i4 = koo.A01;
        Bitmap A0E = 1MF.A0E(str, i4, (int) ((((float) i4) / BbQ.A01()) + 0.5f));
        IgImageView igImageView = koo.A04;
        igImageView.setImageBitmap(A0E);
        igImageView.setVisibility(0);
        IgAutoCompleteTextView igAutoCompleteTextView2 = koo.A05;
        int i5 = koo.A00;
        igAutoCompleteTextView2.A00 = 2.5f;
        igAutoCompleteTextView2.A01 = i5;
        igAutoCompleteTextView2.setDropDownVerticalOffset(igAutoCompleteTextView2.getTop());
        igAutoCompleteTextView2.setText(A0r2);
        koo.A02 = w7c;
        igAutoCompleteTextView2.addTextChangedListener(w7c);
        koo.A05.setOnFocusChangeListener(new LYM(this, BbQ, A19));
        return view;
    }

    public C60049JeH(AnonymousClass0iw r4, UserSession userSession, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, boolean z, boolean z2) {
        this.A03 = r4;
        this.A00 = userSession;
        Iterator A0s = AnonymousClass7TF.A0s(linkedHashMap);
        while (A0s.hasNext()) {
            this.A02.add(AnonymousClass7TE.A1J(A0s).getKey());
        }
        this.A01 = linkedHashMap;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = linkedHashMap2;
    }
}
