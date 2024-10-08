package X;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.JlC  reason: case insensitive filesystem */
public final class C60419JlC extends 2Rw {
    public C361518gM A00;
    public final C53368Gms A01;
    public final UserSession A02;
    public final C63913LBy A03 = new C63913LBy();
    public final ArrayList A04 = AnonymousClass7TE.A1C();

    public C60419JlC(C53368Gms gms, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = gms;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C249703kE kkv;
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup, 0);
        if (i == 1) {
            kkv = new KKV(viewGroup, this.A03, this.A00);
        } else if (i == 2) {
            kkv = new KKW(viewGroup2, this.A01, this.A02, this.A03, this.A00);
        } else if (i == 3) {
            kkv = new KKT(viewGroup);
        } else if (i == 4) {
            kkv = new KKU(viewGroup, this.A00);
        } else {
            throw new IllegalAccessException("This data type is not defined");
        }
        return kkv;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r9, int i) {
        String str;
        C59948JcE jcE;
        C60536Jn7 jn7 = (C60536Jn7) r9;
        0qQ.A0B(jn7, 0);
        Object A0g = DbZ.A0g(this.A04, i);
        if (jn7 instanceof KKW) {
            KKW kkw = (KKW) jn7;
            KKS kks = (KKS) A0g;
            0qQ.A0B(kks, 0);
            kkw.A01 = kks;
            kkw.A03.setText(KKW.A00(kkw, Integer.valueOf(kks.A00)));
            TextView textView = kkw.A02;
            List list = kks.A02;
            textView.setVisibility(DbW.A01(AnonymousClass7TE.A1b(list) ? 1 : 0));
            AnonymousClass3NG A0m = AnonymousClass7TE.A0m(textView);
            A0m.A06 = false;
            C61685KHt.A00(A0m, kkw, 10);
            int i2 = kks.A01;
            C361518gM r0 = kkw.A05;
            KKL kkl = kkw.A06;
            kkl.A01 = r0;
            kkl.A01(list);
            if (kkw.A00 != i2) {
                kkw.A00 = i2;
                RecyclerView recyclerView = kkw.A04;
                recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), i2, 0, false));
                recyclerView.A0n(0);
                Resources A05 = DbU.A05(kkw.itemView);
                recyclerView.A11(new C60462Jlu(0, kkw.A00, A05.getDimensionPixelOffset(R.dimen.abc_dialog_padding_material), A05.getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material)));
            }
            C63913LBy lBy = kkw.A00;
            if (lBy != null) {
                jcE = lBy.A00(kkw.A04, kkw, kks);
            } else {
                jcE = null;
            }
            kkl.A00 = jcE;
        } else if (jn7 instanceof KKV) {
            KKV kkv = (KKV) jn7;
            KKQ kkq = (KKQ) A0g;
            0qQ.A0B(kkq, 0);
            KKK kkk = kkv.A01;
            List list2 = kkq.A00;
            0qQ.A0B(list2, 0);
            ArrayList arrayList = kkk.A01;
            MPG mpg = MPG.A00;
            MPH mph = MPH.A00;
            DbZ.A0t(0, arrayList, mpg, mph);
            C232362ta A002 = C232332tX.A00(new 0mN(arrayList, list2, mpg, mph));
            arrayList.clear();
            arrayList.addAll(list2);
            A002.A03(kkk);
            C63913LBy lBy2 = kkv.A00;
            if (lBy2 != null) {
                lBy2.A00(kkv.A00, kkv, kkq);
            }
        } else if (jn7 instanceof KKT) {
            KKT kkt = (KKT) jn7;
            KKR kkr = (KKR) A0g;
            0qQ.A0B(kkr, 0);
            TextView textView2 = kkt.A00;
            int i3 = kkr.A00;
            Resources A052 = DbU.A05(kkt.itemView);
            if (i3 == 1) {
                str = AnonymousClass7TF.A0d(A052, 2131964574);
            } else {
                str = "";
            }
            textView2.setText(str);
        } else {
            KKU kku = (KKU) jn7;
            KKP kkp = (KKP) A0g;
            0qQ.A0B(kkp, 0);
            C63945LEl lEl = kkp.A00;
            Integer num = lEl.A00;
            if (num == null) {
                TextView textView3 = kku.A03;
                0qQ.A06(textView3);
                0nA.A0d(textView3, 0);
                kku.A01.setVisibility(8);
            } else {
                ImageView imageView = kku.A01;
                imageView.setVisibility(0);
                imageView.setImageResource(num.intValue());
            }
            TextView textView4 = kku.A03;
            textView4.setText(lEl.A01());
            kku.A02.setVisibility(8);
            LY8.A00(JTO.A0F(kku), 48, kkp, kku);
            if (!kku.A00) {
                kku.A00 = true;
                2el A003 = AnonymousClass2hM.A00(textView4);
                if (A003 != null) {
                    textView4.getId();
                    C2354830a A004 = AnonymousClass30Y.A00(new Object(), new C59671JTb(3), String.valueOf(textView4.getId()));
                    A004.A00(new C59926Jbp(1, kku, kkp));
                    C51967G9n.A0z(textView4, A004, A003);
                }
            }
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1710503255);
        int size = this.A04.size();
        AnonymousClass0fD.A0A(152464276, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(-154031614);
        int A002 = ((C54725HQe) this.A04.get(i)).A00();
        AnonymousClass0fD.A0A(1212926331, A032);
        return A002;
    }
}
