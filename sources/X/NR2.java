package X;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

public final class NR2 extends C310586bI {
    public int A00;
    public C67969Mxt A01;
    public OTG A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final C62320sa A04;

    public final void A00(int i, int i2) {
        List list = this.A03;
        if (i < list.size()) {
            ((C68172N3n) list.get(i)).A00 = R.color.badge_color;
        }
        if (i2 >= 0 && i2 < list.size()) {
            ((C68172N3n) list.get(i2)).A00 = R.color.blue_5_60_transparent;
        }
        0fE.A00(this, 1318761992);
    }

    public final int getCount() {
        return this.A03.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A03.get(i);
    }

    public final long getItemId(int i) {
        String str = ((C68172N3n) this.A03.get(i)).A03;
        if (str != null) {
            return (long) str.hashCode();
        }
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C355148Ov r5;
        View view2 = view;
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 2);
        if (view == null) {
            view2 = DbV.A0D(viewGroup2).inflate(R.layout.rewrite_text_cell, viewGroup2, false);
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            0qQ.A0A(view2);
            view2.setTag(R.id.rewrite_text_view_holder_key, new C67969Mxt(view2, this.A02, this.A04));
        }
        Object tag = view2.getTag(R.id.rewrite_text_view_holder_key);
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.direct.fragment.writewithai.RewriteTextViewHolder");
        C67969Mxt mxt = (C67969Mxt) tag;
        this.A01 = mxt;
        if (mxt != null) {
            mxt.A00.setMaxHeight(this.A00);
        }
        C67969Mxt mxt2 = this.A01;
        if (mxt2 != null) {
            C68172N3n n3n = (C68172N3n) this.A03.get(i);
            0qQ.A0B(n3n, 0);
            OTG otg = mxt2.A01;
            if (otg != null) {
                String str = n3n.A03;
                Context context = otg.A00;
                r5 = new C355148Ov(context, otg.A02, (Integer) null, false);
                ArrayList A1C = AnonymousClass7TE.A1C();
                A1C.add(OTG.A00(context, new C73669Phi(str, otg, 42), 2131958806, R.drawable.instagram_thumb_up_pano_outline_24));
                A1C.add(OTG.A00(context, new C73669Phi(str, otg, 43), 2131958805, R.drawable.instagram_thumb_down_pano_outline_24));
                r5.A02(A1C);
            } else {
                r5 = null;
            }
            TextView textView = mxt2.A00;
            textView.setText(n3n.A05);
            textView.setMovementMethod(new ScrollingMovementMethod());
            textView.setOnTouchListener(new C71435Oka(0, new GestureDetector(DbS.A07(mxt2), new C67673Ms9(0, n3n, mxt2, r5)), mxt2, new Object(), new Object()));
            DbT.A16(DbS.A07(mxt2), textView, n3n.A00);
        }
        return view2;
    }

    public NR2(C62320sa r2) {
        this.A04 = r2;
    }
}
