package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import com.instagram.android.R;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class K9H extends 2Ru {
    public C63870L9z A00;
    public C363008it A01;
    public C46434Dew A02;
    public boolean A03;
    public boolean A04;
    public C3253572b A05;
    public boolean A06;
    public final Context A07;
    public final C61479K9k A08;
    public final C61474K9f A09;
    public final K9R A0A;
    public final C46437Dez A0B;
    public final EAC A0C;
    public final List A0D = AnonymousClass7TE.A1C();
    public final List A0E = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final boolean A0H;
    public final EAB A0I;
    public final C61470K9b A0J;
    public final AnonymousClass71T A0K;
    public final C336947fR A0L;
    public final C231762sK A0M;
    public final Integer A0N;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public K9H(Context context, AnonymousClass0iw r14, K6S k6s, K6S k6s2, K6S k6s3, G6T g6t, Integer num, boolean z, boolean z2) {
        super(false);
        Integer num2 = num;
        0qQ.A0B(num2, 7);
        this.A07 = context;
        this.A0N = num2;
        this.A0H = z;
        C61470K9b k9b = new C61470K9b(context, k6s3);
        this.A0J = k9b;
        C61479K9k k9k = new C61479K9k(context, r14, k6s, z2);
        this.A08 = k9k;
        C61474K9f k9f = new C61474K9f(context, r14, k6s2);
        this.A09 = k9f;
        C231762sK r5 = new C231762sK(context);
        this.A0M = r5;
        EAB eab = new EAB(context, g6t);
        this.A0I = eab;
        C336947fR r7 = new C336947fR(context);
        this.A0L = r7;
        K9R k9r = new K9R(context);
        this.A0A = k9r;
        C46437Dez dez = new C46437Dez(context);
        this.A0B = dez;
        EAC eac = new EAC(context, C65764LzI.A00);
        this.A0C = eac;
        this.A0G = AnonymousClass1YB.A00(MLU.A00);
        this.A0F = AnonymousClass1YB.A00(new C46573DhF(this, 1));
        AnonymousClass71T r11 = new AnonymousClass71T(context);
        this.A0K = r11;
        this.A04 = true;
        init(new C231642s0[]{k9b, k9k, k9f, r5, eab, r7, k9r, dez, eac, r11});
    }

    public static void A00(K6S k6s, C46434Dew dew) {
        dew.A01 = true;
        C59689JTv.A07(k6s.requireContext(), 2131952083);
        k6s.A09().A04(k6s.requireContext(), new LY1(k6s, 45), C320156rr.ERROR);
    }

    public final void A04(Context context, View.OnClickListener onClickListener, C320156rr r10) {
        String str;
        0qQ.A0B(context, 0);
        clear();
        C63870L9z l9z = this.A00;
        if (l9z != null) {
            C320156rr r1 = r10;
            if (l9z.A05 && r10 == C320156rr.EMPTY) {
                r1 = C320156rr.ERROR;
            }
            C3253572b r5 = new C3253572b();
            r5.A00 = DbX.A07(l9z.A04);
            int ordinal = r1.ordinal();
            if (ordinal != 2) {
                if (ordinal == 3) {
                    r5.A05 = onClickListener;
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    String A16 = AnonymousClass7TE.A16(context, 2131972371);
                    String string = context.getString(2131956200);
                    A1A.append(string);
                    A1A.append(" ");
                    A1A.append(A16);
                    SpannableString spannableString = new SpannableString(002.A0g(string, " ", A16));
                    AnonymousClass7AK r3 = new AnonymousClass7AK(Integer.valueOf(DbV.A02(context)));
                    int lastIndexOf = A1A.lastIndexOf(A16);
                    Pattern pattern = 0mp.A00;
                    spannableString.setSpan(r3, lastIndexOf, A16.length() + lastIndexOf, 33);
                    str = spannableString;
                } else if (ordinal != 0) {
                    0wb.A03("Private Story Empty State Bindings", "Tried to bind to an invalid empty state in Private Story adapter.");
                } else {
                    r5.A02 = l9z.A00;
                    r5.A0D = l9z.A03;
                    str = l9z.A02;
                }
                r5.A07 = str;
            }
            this.A05 = r5;
            addModel(r5, r10, this.A0K);
            notifyDataSetChangedSmart();
            return;
        }
        0qQ.A0F("emptyStateController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A05(List list, List list2) {
        0qQ.A0B(list2, 1);
        List list3 = this.A0D;
        list3.clear();
        list3.addAll(list);
        List list4 = this.A0E;
        list4.clear();
        list4.addAll(list2);
    }

    private final void A01(String str, String str2) {
        Object obj;
        C231642s0 r0;
        C46448DfA dfA = new C46448DfA((CharSequence) str);
        if (str2 != null) {
            dfA.A0G = str2;
            obj = null;
            r0 = this.A0I;
        } else {
            obj = new Object();
            r0 = this.A0L;
        }
        addModel(dfA, obj, r0);
    }

    public final void A03(int i) {
        C46448DfA dfA;
        String str;
        if (this.A06 && (dfA = (C46448DfA) getModel(C46448DfA.class, 0)) != null) {
            int intValue = this.A0N.intValue();
            if (intValue == 0) {
                str = DbY.A0d(this.A07.getResources(), i, R.plurals.audience_picker_members_section_title);
            } else if (intValue == 1 || intValue == 2) {
                str = JTS.A0i(this.A07.getResources(), i, 2131953267);
            } else {
                throw AnonymousClass7TE.A1K();
            }
            0qQ.A07(str);
            dfA.A0E = str;
            notifyItemChanged(0);
        }
    }

    public final void A02() {
        String string;
        String string2;
        clear();
        List list = this.A0D;
        if (!list.isEmpty() || !this.A0E.isEmpty()) {
            if (!list.isEmpty()) {
                Integer num = this.A0N;
                if (num == AnonymousClass05K.A00) {
                    int size = list.size();
                    if (this.A0H) {
                        string2 = null;
                    } else {
                        string2 = this.A07.getString(2131955136);
                    }
                    String A0d = DbY.A0d(this.A07.getResources(), size, R.plurals.audience_picker_members_section_title);
                    0qQ.A07(A0d);
                    A01(A0d, string2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C61036Jva.A00(this, it);
                    }
                } else if (num == AnonymousClass05K.A01) {
                    String A0i = JTS.A0i(this.A07.getResources(), list.size(), 2131953267);
                    0qQ.A07(A0i);
                    A01(A0i, (String) null);
                    ArrayList A0r = AnonymousClass7TG.A0r(list);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C61036Jva.A02(A0r, it2);
                    }
                    addModel(new C61078JwG((List) A0r, 42), this.A09);
                } else if (num == AnonymousClass05K.A0C) {
                    int size2 = list.size();
                    if (this.A0H) {
                        string = null;
                    } else {
                        string = this.A07.getString(2131955136);
                    }
                    Context context = this.A07;
                    String A0i2 = JTS.A0i(context.getResources(), size2, 2131953267);
                    0qQ.A07(A0i2);
                    A01(A0i2, string);
                    if (!this.A03) {
                        list = 00k.A0d(list, 3);
                    }
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        C61036Jva.A00(this, it3);
                    }
                    if (!this.A03 && size2 > 3) {
                        addModel(new C61076JwE(new L2Q(this), AnonymousClass7TF.A0d(context.getResources(), 2131973000)), this.A0A);
                    }
                }
                this.A06 = true;
            }
            List<C61036Jva> list2 = this.A0E;
            if (AnonymousClass7TE.A1b(list2)) {
                A01(AnonymousClass7TE.A16(this.A07, 2131974699), (String) null);
                for (C61036Jva jva : list2) {
                    boolean z = this.A04;
                    User user = jva.A02;
                    boolean z2 = jva.A01;
                    0qQ.A0B(user, 0);
                    addModel(new C61036Jva(user, z2, z), this.A08);
                }
                C46434Dew dew = this.A02;
                if (dew != null && dew.CKB()) {
                    addModel(dew, this.A0M);
                }
            }
        } else {
            A04(this.A07, (View.OnClickListener) null, C320156rr.EMPTY);
        }
        notifyDataSetChangedSmart();
    }
}
