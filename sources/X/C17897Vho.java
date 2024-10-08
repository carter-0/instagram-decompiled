package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Vho  reason: case insensitive filesystem */
public final class C17897Vho {
    public int A00 = -1;
    public View A01;
    public C331157Pu A02;
    public final C56160Hto A03;
    public final UZA A04;
    public final C331127Pr A05;

    public final void A00(Context context) {
        C331127Pr r1 = this.A05;
        C56160Hto hto = this.A03;
        r1.A0d = hto.A02;
        C331157Pu A002 = r1.A00();
        this.A02 = A002;
        UZA uza = this.A04;
        A002.A03(context, uza);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(hto.A07);
        arrayList.addAll(hto.A06);
        SpannableStringBuilder spannableStringBuilder = hto.A00;
        List list = uza.A08;
        list.clear();
        list.addAll(arrayList);
        uza.A00 = spannableStringBuilder;
        UZA.A00(uza);
        LinkedList linkedList = hto.A05;
        C67804Mv8 mv8 = uza.A07;
        0qQ.A0B(linkedList, 0);
        DbW.A0z(mv8, linkedList, mv8.A02);
    }

    public C17897Vho(C56160Hto hto) {
        this.A03 = hto;
        UZA uza = new UZA();
        this.A04 = uza;
        C331127Pr r3 = new C331127Pr(hto.A04);
        r3.A17 = false;
        r3.A0Z = false;
        r3.A07 = 1;
        r3.A1O = hto.A03;
        r3.A0T = hto.A01;
        r3.A0U = new C19686Wdo((Object) this, 1);
        this.A05 = r3;
        uza.A07.A00 = new C17774Vfl(this);
        uza.A02 = false;
    }
}
