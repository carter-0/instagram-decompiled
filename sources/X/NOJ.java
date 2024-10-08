package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.instagram.android.R;

public final class NOJ extends C232222tE {
    public final C74370Ptk A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        NPC npc = (NPC) r8;
        C68008Mya mya = (C68008Mya) r9.itemView.getTag();
        if (mya != null) {
            String str = npc.A02;
            String str2 = npc.A01;
            Drawable drawable = npc.A00;
            boolean z = npc.A03;
            C74370Ptk ptk = this.A00;
            mya.A03.setText(str);
            mya.A02.setText(str2);
            mya.A01.setImageDrawable(drawable);
            if (z) {
                Button button = mya.A00;
                button.setVisibility(0);
                C71396Ojv.A00(button, 69, ptk);
                return;
            }
            mya.A00.setVisibility(8);
        }
    }

    public final Class modelClass() {
        return NPC.class;
    }

    public NOJ(C74370Ptk ptk) {
        this.A00 = ptk;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.search_error_state);
        A0C.setTag(new C68008Mya(A0C));
        return new C68008Mya(A0C);
    }
}
