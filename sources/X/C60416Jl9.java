package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.Jl9  reason: case insensitive filesystem */
public final class C60416Jl9 extends 2Rw {
    public final AnonymousClass0iw A00;
    public final L4K A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final 0sL A03;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        View view;
        View.OnClickListener A012;
        C60636Joj joj = (C60636Joj) r7;
        if (JTP.A07(this, joj, 0, i) == 1) {
            TextView textView = joj.A02;
            DbT.A18(textView.getContext(), textView, 2131963453);
            joj.A01.setVisibility(8);
            joj.A03.setVisibility(8);
            view = joj.A00;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Context context = view.getContext();
            layoutParams.height = AnonymousClass7TG.A06(context) + (JTR.A05(context) * 2);
            A012 = new LYB((Object) this, 52);
        } else if (getItemViewType(i) == 0) {
            Reel reel = (Reel) this.A02.get(i);
            joj.A02.setText(reel.A0r);
            joj.A01.setVisibility(8);
            ImageUrl A07 = reel.A07();
            if (A07 != null) {
                IgImageView igImageView = joj.A03;
                igImageView.setVisibility(0);
                igImageView.setUrl(A07, this.A00);
            }
            view = joj.A00;
            A012 = LYG.A01(this, reel, 33);
        } else {
            return;
        }
        AnonymousClass0fU.A00(A012, view);
    }

    public C60416Jl9(AnonymousClass0iw r2, L4K l4k, 0sL r4) {
        this.A03 = r4;
        this.A01 = l4k;
        this.A00 = r2;
    }

    public final int getItemCount() {
        int size;
        int i;
        int A032 = AnonymousClass0fD.A03(1884699617);
        List list = this.A02;
        if (list.size() == 0) {
            size = 0;
            i = 1852090578;
        } else {
            size = list.size() + 1;
            i = 583303336;
        }
        AnonymousClass0fD.A0A(i, A032);
        return size;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r5 != r4.A02.size()) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemViewType(int r5) {
        /*
            r4 = this;
            r0 = 1686857132(0x648b65ac, float:2.057139E22)
            int r3 = X.AnonymousClass0fD.A03(r0)
            if (r5 <= 0) goto L_0x0015
            java.util.List r0 = r4.A02
            int r2 = r0.size()
            r1 = 1
            r0 = 1300512259(0x4d843e03, float:2.77332064E8)
            if (r5 == r2) goto L_0x0019
        L_0x0015:
            r1 = 0
            r0 = 1748709164(0x683b2f2c, float:3.5358108E24)
        L_0x0019:
            X.AnonymousClass0fD.A0A(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60416Jl9.getItemViewType(int):int");
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        DbS.A1W(viewGroup);
        return new C60636Joj(C64005LIl.A00(viewGroup));
    }
}
