package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Jkq  reason: case insensitive filesystem */
public final class C60397Jkq extends 2Rw {
    public List A00;
    public final C251383n1 A01;
    public final C62320sa A02;
    public final 0sP A03;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.3kE, X.Jmk] */
    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0D = DbT.A0D(LayoutInflater.from(this.A01), viewGroup, R.layout.sticker_tray_search_history_pill, false);
        ? r1 = new C249703kE(A0D);
        r1.A01 = AnonymousClass7TG.A0R(A0D, R.id.title);
        r1.A00 = DbX.A0J(A0D, R.id.icon);
        return r1;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        String A1G;
        View view;
        View.OnClickListener lxk;
        C60513Jmk jmk = (C60513Jmk) r5;
        0qQ.A0B(jmk, 0);
        if (i < 1) {
            jmk.A00.setImageResource(R.drawable.instagram_delete_pano_filled_24);
            DbT.A18(DbS.A07(jmk), jmk.A01, 2131955136);
            view = jmk.itemView;
            lxk = new LY1(this, 68);
        } else {
            List list = this.A00;
            if (list != null && (A1G = C51966G9m.A1G(list, i - 1)) != null) {
                jmk.A01.setText(A1G);
                view = jmk.itemView;
                lxk = new LXK(A1G, this, 8);
            } else {
                return;
            }
        }
        AnonymousClass0fU.A00(lxk, view);
    }

    public C60397Jkq(C251383n1 r1, C62320sa r2, 0sP r3) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1730851196);
        List list = this.A00;
        int i = 0;
        if (list != null && !list.isEmpty()) {
            List list2 = this.A00;
            if (list2 != null) {
                i = list2.size();
            }
            i++;
        }
        AnonymousClass0fD.A0A(-1041025607, A032);
        return i;
    }
}
