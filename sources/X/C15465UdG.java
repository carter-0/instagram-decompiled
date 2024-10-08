package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.UdG  reason: case insensitive filesystem */
public final class C15465UdG extends C331047Ph implements C231272rL, C231302rO, AnonymousClass71P {
    public final Context A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C60101Jfh A03;
    public final C273674n0 A04;
    public final C15553Ueh A05;
    public final AnonymousClass71U A06;
    public final AnonymousClass71T A07;
    public final C229122ms A08;
    public final C231762sK A09;
    public final C229932oe A0A;
    public final C322186vO A0B;
    public final Map A0C = new HashMap();

    public C15465UdG(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r20, UserSession userSession, C60101Jfh jfh, C322186vO r23, AnonymousClass32Q r24, C229122ms r25) {
        C229122ms r1 = r25;
        0qQ.A0B(r1, 4);
        UserSession userSession2 = userSession;
        AnonymousClass32Q r7 = r24;
        AnonymousClass7TG.A1S(userSession2, r7);
        C60101Jfh jfh2 = jfh;
        0qQ.A0B(jfh2, 8);
        Context context2 = context;
        this.A00 = context2;
        this.A01 = fragmentActivity;
        this.A0B = r23;
        this.A08 = r1;
        this.A02 = userSession2;
        this.A03 = jfh2;
        C231762sK r5 = new C231762sK(context2);
        this.A09 = r5;
        AnonymousClass71U r4 = new AnonymousClass71U(context2);
        this.A06 = r4;
        AnonymousClass0iw r10 = r20;
        C15553Ueh ueh = new C15553Ueh(context2, r10, userSession2, new WX0(this), new WX1(this), false, false, false);
        this.A05 = ueh;
        AnonymousClass71T r3 = new AnonymousClass71T(context2);
        this.A07 = r3;
        this.A04 = new C273674n0((C324266yu) null, r7, AnonymousClass05K.A01);
        this.A0A = new C229932oe();
        A0B(r4, ueh, r5, r3);
    }

    public final AnonymousClass6u8 BQA(String str) {
        0qQ.A0B(str, 0);
        Map map = this.A0C;
        AnonymousClass6u8 r1 = (AnonymousClass6u8) map.get(str);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass6u8 r12 = new AnonymousClass6u8();
        r12.A03 = true;
        map.put(str, r12);
        return r12;
    }

    public final void EZ4(int i) {
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.VNH, java.lang.Object] */
    public final void A0C() {
        C320156rr r6;
        A06();
        this.A0A.A00.clear();
        C273674n0 r62 = this.A04;
        r62.A08(this.A0B);
        ? obj = new Object();
        Context context = this.A00;
        String A16 = AnonymousClass7TE.A16(context, 2131961979);
        SpannableStringBuilder append = DbW.A08(context, 2131961989).append(" ").append(A16);
        0qQ.A07(append);
        AnonymousClass7AV.A03(append, new ESx(this, DbV.A02(context), 16), A16);
        obj.A00 = append;
        A08(this.A06, obj);
        if (AnonymousClass7TE.A1b(r62.A01)) {
            int A022 = r62.A02();
            for (int i = 0; i < A022; i++) {
                C3251571g A0E = r62.A0E(i);
                AnonymousClass6u8 BQA = BQA(AnonymousClass7TF.A0h(A0E));
                boolean z = true;
                if (this.A08.CKB() || i != r62.A02() - 1) {
                    z = false;
                }
                BQA.A00(i, z);
                A09(this.A05, A0E, BQA);
            }
            C229122ms r1 = this.A08;
            if (r1.CKB()) {
                A08(this.A09, r1);
            }
        } else {
            C3253572b r7 = new C3253572b();
            if (this.A08.CT5()) {
                r6 = C320156rr.ERROR;
                r7.A02 = R.drawable.loadmore_icon_refresh_compound;
                r7.A05 = new WB9((Object) this, 5);
            } else {
                r6 = C320156rr.EMPTY;
                r7.A02 = R.drawable.ig_illustrations_illo_exclusive_posts_refresh;
                r7.A0D = context.getResources().getString(2131961988);
                r7.A07 = context.getResources().getString(2131961987);
                String A0d = AnonymousClass7TF.A0d(context.getResources(), 2131961986);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0d);
                AnonymousClass7AV.A05(spannableStringBuilder, new ESx(this, C13988Tno.A08(context), 17), A0d);
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, A0d.length(), 18);
                r7.A08 = spannableStringBuilder;
            }
            A09(this.A07, r7, r6);
        }
        A07();
    }
}
