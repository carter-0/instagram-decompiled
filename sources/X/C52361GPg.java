package X;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import java.util.Map;

/* renamed from: X.GPg  reason: case insensitive filesystem */
public final class C52361GPg implements C253183qL {
    public final C307786Rm A00;

    public final /* synthetic */ String getDescription() {
        return V6I.A00(this);
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        Spanned spanned;
        Object obj4 = obj3;
        View view = (View) obj;
        if (obj4 instanceof C308186Tb) {
            C308186Tb r2 = (C308186Tb) obj4;
            C307786Rm r1 = this.A00;
            AnonymousClass7TG.A1O(r2, view);
            CharSequence charSequence = r2.A04;
            if (!(!(charSequence instanceof Spanned) || (spanned = (Spanned) charSequence) == null || r1.A02.AgE().BGG() == null)) {
                Object[] spans = spanned.getSpans(0, spanned.length(), C299245uo.class);
                0qQ.A07(spans);
                for (Object obj5 : spans) {
                    C299245uo r13 = (C299245uo) obj5;
                    C307786Rm r11 = r13.A05;
                    C276544tV r12 = r13.A06;
                    C226662he A002 = AnonymousClass6QK.A00(AnonymousClass6QD.A00(r11, r12), (Map) null);
                    1U1 A02 = AnonymousClass6QD.A02(r11, r12);
                    0qQ.A0B(r12, 0);
                    C58218IoM ioM = new C58218IoM(1, "BloksRichTextImageSpan", C299245uo.A07, r13, C226722hk.A01().A02(r13.A02, A02, A002, r12.A0R(74, false)), AnonymousClass6QD.A01(r11, r12));
                    r13.A01 = ioM;
                    ioM.invoke();
                    r13.A00 = view;
                }
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        Spanned spanned;
        View view = (View) obj;
        if (obj3 instanceof C308186Tb) {
            C308186Tb r10 = (C308186Tb) obj3;
            view.setContentDescription((CharSequence) null);
            C307786Rm r1 = this.A00;
            0qQ.A0B(r10, 1);
            CharSequence charSequence = r10.A04;
            if ((charSequence instanceof Spanned) && (spanned = (Spanned) charSequence) != null && r1.A02.AgE().BGG() != null) {
                Object[] spans = spanned.getSpans(0, spanned.length(), C299245uo.class);
                0qQ.A07(spans);
                for (Object obj5 : spans) {
                    C299245uo r0 = (C299245uo) obj5;
                    r0.A00 = null;
                    C226722hk.A00().ECf(r0.A03);
                }
            }
        }
    }

    public C52361GPg(C307786Rm r1) {
        this.A00 = r1;
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
