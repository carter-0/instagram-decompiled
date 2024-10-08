package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.google.common.collect.ImmutableList;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.FEs  reason: case insensitive filesystem */
public final class C49918FEs {
    public int A00;
    public String A01;
    public List A02;
    public List A03;
    public boolean A04;
    public final Context A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final C49416EvI A08 = new C49416EvI(this);
    public final FAI A09;
    public final F34 A0A;
    public final C49683F1s A0B;

    /* JADX WARNING: type inference failed for: r1v2, types: [X.1P0, java.lang.Object, X.EB5] */
    public final void A02() {
        FAI fai = this.A09;
        fai.A01.clear();
        fai.A02.clear();
        1NY A0M = DbZ.A0M(this.A07);
        A0M.A0A("direct_v2/suggested_blocks/");
        1OC A0S = DbU.A0S(A0M, DvU.class, F8E.class);
        ? obj = new Object();
        obj.A00 = new WeakReference(this);
        A0S.A00 = obj;
        1ES.A03(A0S);
    }

    public C49918FEs(Context context, AnonymousClass0iw r3, UserSession userSession, F34 f34) {
        this.A05 = context;
        this.A07 = userSession;
        this.A09 = FYq.A00(userSession);
        this.A0A = f34;
        this.A06 = r3;
        this.A0B = new C49683F1s(context);
        this.A01 = AnonymousClass7TF.A0b();
        this.A02 = AnonymousClass7TE.A1C();
        this.A03 = AnonymousClass7TE.A1C();
    }

    public static ViewModelListUpdate A00(C49918FEs fEs, List list) {
        SpannableStringBuilder A0D;
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            builder.add(fEs.A0B.A00((C47326Dut) it.next()));
        }
        ViewModelListUpdate A0R = DbS.A0R();
        DbT.A0j(fEs.A07).getUsername();
        if (DbU.A0K(fEs.A09.A01).isEmpty()) {
            A0D = new SpannableStringBuilder();
            Context context = fEs.A05;
            String string = context.getResources().getString(2131974671);
            SpannableStringBuilder append = A0D.append(context.getResources().getString(2131974671));
            StyleSpan styleSpan = new StyleSpan(1);
            Pattern pattern = 0mp.A01;
            append.setSpan(styleSpan, 0, DbX.A05(string), 33);
            String property = System.getProperty("line.separator");
            property.getClass();
            A0D.append(property).append(context.getResources().getString(2131974673));
        } else {
            Context context2 = fEs.A05;
            ESx eSx = new ESx(Integer.valueOf(DbV.A02(context2)), (Object) fEs, 54);
            String string2 = context2.getString(2131962881);
            A0D = DbY.A0D(context2, string2, 2131974672);
            AnonymousClass7AV.A04(A0D, eSx, string2);
        }
        A0R.A00(new EGZ(A0D));
        A0R.A01(builder.build());
        return A0R;
    }

    public static HashMap A01(List list) {
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C47326Dut dut = (C47326Dut) it.next();
            hashMap.put(DbV.A0q(dut.A04), DbS.A0j(dut.A00));
        }
        return hashMap;
    }
}
