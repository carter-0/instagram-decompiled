package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UdW  reason: case insensitive filesystem */
public final class C15481UdW extends 2Ru implements X7k {
    public int A00;
    public C3253572b A01;
    public final int A02;
    public final C39695A5l A03;
    public final C336947fR A04;
    public final C46437Dez A05;
    public final EAC A06;
    public final TwD A07;
    public final C17962Viv A08;
    public final C46457DfL A09;
    public final String A0A;
    public final String A0B;
    public final C17205VMj A0C;
    public final NLX A0D;
    public final C355638Qt A0E = new C355638Qt(7);
    public final AnonymousClass71T A0F;
    public final C66971Mg4 A0G;
    public final FGF A0H;
    public final Integer A0I;
    public final String A0J;

    public final void A02(String str, List list, List list2, boolean z) {
        0qQ.A0B(list, 0);
        clear();
        this.A00 = 0;
        if (!list.isEmpty()) {
            int i = 2131962081;
            if (this.A0I == AnonymousClass05K.A01) {
                i = 2131956191;
            }
            String str2 = this.A0J;
            C46448DfA dfA = new C46448DfA(i);
            if (str2 != null) {
                dfA.A0G = str2;
                addModel(dfA, this.A09);
            } else {
                addModel(dfA, this.A03, this.A04);
            }
            this.A00++;
            if (z) {
                addModel(this.A0H, this.A0G);
                this.A00++;
            }
            A00(this, str, list);
        }
        if (!list2.isEmpty()) {
            addModel(new C46448DfA(2131956202), this.A03, this.A04);
            this.A00++;
            A00(this, (String) null, list2);
        }
        notifyDataSetChanged();
    }

    public final void Cxp() {
    }

    public final void DNk() {
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.Viv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, X.A5l] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15481UdW(Context context, C18783W1j w1j, AnonymousClass0iw r13, UserSession userSession, G6T g6t, Integer num) {
        super(false);
        boolean A1Y = DbW.A1Y(userSession);
        Integer num2 = num;
        this.A0I = num2;
        FGF fgf = new FGF(2131962323);
        this.A0H = fgf;
        this.A0A = AnonymousClass7TE.A16(context, 2131968486);
        this.A0B = AnonymousClass7TE.A16(context, 2131972868);
        this.A02 = DbV.A01(context);
        this.A0J = AnonymousClass7TE.A16(context, 2131971980);
        fgf.A01 = R.style.PrivacyTextStyle;
        NLX nlx = new NLX(w1j, r13, num2);
        this.A0D = nlx;
        C336947fR r4 = new C336947fR(context);
        this.A04 = r4;
        C66971Mg4 mg4 = new C66971Mg4(context);
        this.A0G = mg4;
        C46437Dez dez = new C46437Dez(context);
        this.A05 = dez;
        C46457DfL dfL = new C46457DfL(context, g6t);
        this.A09 = dfL;
        EAC eac = new EAC(context, C19709WeB.A00);
        this.A06 = eac;
        this.A08 = new Object();
        this.A07 = new TwD();
        ? obj = new Object();
        this.A03 = obj;
        obj.A00 = A1Y;
        AnonymousClass71T r8 = new AnonymousClass71T(context);
        this.A0F = r8;
        this.A01 = new C3253572b();
        this.A0C = new C17205VMj(context);
        init(new C231642s0[]{nlx, r4, mg4, dez, eac, r8, dfL});
    }

    public static final void A00(C15481UdW udW, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17966Vj0 vj0 = (C17966Vj0) it.next();
            int i = udW.A00;
            String str2 = null;
            if (vj0.A00) {
                str2 = str;
            }
            udW.addModel(vj0, new OBE(i, str2), udW.A0D);
            udW.A00++;
        }
    }

    public final void A01(Context context, View.OnClickListener onClickListener, C320156rr r10) {
        clear();
        C17205VMj vMj = this.A0C;
        C3253572b r5 = new C3253572b();
        r5.A00 = vMj.A00;
        if (r10.ordinal() != 2) {
            r5.A05 = onClickListener;
            StringBuilder sb = new StringBuilder();
            String A16 = AnonymousClass7TE.A16(context, 2131972371);
            String string = context.getString(2131956200);
            sb.append(string);
            sb.append(" ");
            sb.append(A16);
            SpannableString spannableString = new SpannableString(002.A0g(string, " ", A16));
            AnonymousClass7AK r3 = new AnonymousClass7AK(Integer.valueOf(DbV.A02(context)));
            int lastIndexOf = sb.lastIndexOf(A16);
            AnonymousClass0eM r0 = 0mp.A09;
            spannableString.setSpan(r3, lastIndexOf, A16.length() + lastIndexOf, 33);
            r5.A07 = spannableString;
        }
        this.A01 = r5;
        addModel(r5, r10, this.A0F);
        notifyDataSetChanged();
    }

    public final long getItemId(int i) {
        IllegalStateException illegalStateException;
        int i2;
        long A002;
        int i3;
        int A032 = AnonymousClass0fD.A03(1564027109);
        Object item = getItem(i);
        if (0qQ.A0K(this.A0A, item)) {
            A002 = 0;
        } else if (0qQ.A0K(this.A07, item)) {
            A002 = 1;
        } else {
            if (item instanceof C46448DfA) {
                int i4 = ((C46448DfA) item).A05;
                if (i4 == 2131956191) {
                    A002 = 2;
                    i3 = -749095659;
                } else if (i4 == 2131962081) {
                    A002 = 3;
                    i3 = 1644855038;
                } else if (i4 == 2131956202) {
                    A002 = 4;
                    i3 = 2140782070;
                } else {
                    illegalStateException = new IllegalStateException("unexpected header string resource");
                    i2 = -1926575444;
                }
                AnonymousClass0fD.A0A(i3, A032);
                return A002;
            } else if (item instanceof FGF) {
                A002 = 5;
            } else if (0qQ.A0K(item, this.A01)) {
                A002 = 6;
            } else if (item instanceof C17966Vj0) {
                User user = ((C17966Vj0) item).A01;
                0qQ.A07(user);
                A002 = this.A0E.A00(user.getId());
            } else {
                illegalStateException = new IllegalStateException(AnonymousClass000.A00(4139));
                i2 = 469264240;
            }
            AnonymousClass0fD.A0A(i2, A032);
            throw illegalStateException;
        }
        i3 = -1220195156;
        AnonymousClass0fD.A0A(i3, A032);
        return A002;
    }

    public final void DNl(int i) {
        notifyItemChanged(i);
    }
}
