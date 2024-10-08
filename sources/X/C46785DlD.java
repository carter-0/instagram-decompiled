package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.DlD  reason: case insensitive filesystem */
public final class C46785DlD extends 2YL {
    public AnonymousClass2t9 A00;
    public String A01 = "";
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final Map A04 = 0Yt.A06(new 0eP[]{AnonymousClass7TF.A0x("clips", 2131957069), AnonymousClass7TF.A0x("audios", 2131957064), AnonymousClass7TF.A0x("accounts", 2131957062), AnonymousClass7TF.A0x("trending", 2131957080), AnonymousClass7TF.A0x("popular_with_your_followers", 2131957068), AnonymousClass7TF.A0x("trending_with_similar_accounts", 2131957081), AnonymousClass7TF.A0x("original_audio", 2131957067)});

    /* JADX WARNING: type inference failed for: r0v16, types: [X.3B3, java.lang.Object] */
    public final void A01(Context context, RecyclerView recyclerView, Integer num, String str, List list) {
        C252553pI linearLayoutManager;
        Object obj;
        AnonymousClass7TF.A1D(recyclerView, 1, str);
        if (num == AnonymousClass05K.A00) {
            linearLayoutManager = new GridLayoutManager(context, list.size());
        } else {
            linearLayoutManager = new LinearLayoutManager(context, 0, false);
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        AnonymousClass2t9 A0U = DbU.A0U(AnonymousClass2t9.A00(context), new EH2(num, new J6W(37, context, list, this)));
        this.A00 = A0U;
        recyclerView.setAdapter(A0U);
        AnonymousClass2t9 r2 = this.A00;
        if (r2 != null) {
            ViewModelListUpdate A0R = DbS.A0R();
            this.A01 = str;
            A0R.A01(A00(context, this, str, list));
            r2.A05(A0R);
        }
        if (recyclerView.A12.size() == 0) {
            recyclerView.A11(new Object());
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((C51945G8o) obj).BcR(), str)) {
                break;
            }
        }
        recyclerView.A0o(list.indexOf(obj));
        this.A02.Epw(str);
    }

    public C46785DlD() {
        02z A10 = DbS.A10("");
        this.A02 = A10;
        this.A03 = A10;
    }

    public static final List A00(Context context, C46785DlD dlD, String str, List list) {
        String str2;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String BcR = ((C51945G8o) it.next()).BcR();
            Number number = (Number) dlD.A04.get(BcR);
            if (number != null) {
                str2 = context.getString(number.intValue());
            } else {
                str2 = null;
            }
            A0r.add(new C47236DtN(BcR, str2, 0qQ.A0K(BcR, str)));
        }
        return A0r;
    }
}
