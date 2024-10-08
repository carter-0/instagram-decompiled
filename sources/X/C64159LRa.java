package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.user.model.User;
import java.text.Collator;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.LRa  reason: case insensitive filesystem */
public final class C64159LRa {
    public View A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public C64125LOw A05;
    public Runnable A06;
    public Runnable A07;
    public String A08;
    public final double A09;
    public final AnonymousClass4DH A0A;
    public final UserSession A0B;
    public final C61841KOf A0C;
    public final Long A0D;
    public final Long A0E;
    public final List A0F = AnonymousClass7TE.A1C();
    public final boolean A0G;

    private View A00(View.OnClickListener onClickListener, Integer num, String str) {
        ViewGroup viewGroup = this.A04;
        if (viewGroup == null) {
            return null;
        }
        int i = 0;
        View inflate = DbV.A0D(viewGroup).inflate(R.layout.suggested_fundraiser_icon_pill, this.A04, false);
        ImageView A0F2 = DbU.A0F(inflate, R.id.fundraiser_suggestion_pill_icon);
        TextView A0G2 = DbU.A0G(inflate, R.id.fundraiser_suggestion_pill_text);
        if (num != null) {
            A0F2.setImageResource(num.intValue());
        } else {
            i = 8;
        }
        A0F2.setVisibility(i);
        A0G2.setText(str);
        AnonymousClass0fU.A00(onClickListener, inflate);
        return inflate;
    }

    private void A01(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, String str, String str2) {
        if (this.A03 != null) {
            AnonymousClass4DH r4 = this.A0A;
            r4.requireActivity();
            int A032 = Dbb.A03(this.A03, R.id.create_fundraiser_container);
            this.A03.requireViewById(R.id.fundraiser_info_container).setVisibility(0);
            TextView A0G2 = DbU.A0G(this.A03, R.id.fundraiser_title);
            CharSequence charSequence = str;
            if (str == null) {
                charSequence = r4.getText(2131962857);
            }
            A0G2.setText(charSequence);
            TextView A0G3 = DbU.A0G(this.A03, R.id.fundraiser_subtitle);
            if (str2 != null) {
                A0G3.setText(str2);
                A0G3.setVisibility(0);
            } else {
                A0G3.setVisibility(A032);
            }
            View requireViewById = this.A03.requireViewById(R.id.fundraiser_text_container);
            if (onClickListener != null) {
                AnonymousClass0fU.A00(onClickListener, requireViewById);
            } else {
                requireViewById.setOnClickListener((View.OnClickListener) null);
            }
            View requireViewById2 = this.A03.requireViewById(R.id.fundraiser_row_cross);
            requireViewById2.setVisibility(0);
            AnonymousClass0fU.A00(onClickListener2, requireViewById2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c7, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36318522627856604L) == false) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r8 = this;
            X.KOf r5 = r8.A0C
            com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r1 = r5.A04
            if (r1 == 0) goto L_0x0073
            java.lang.String r0 = r1.A00
            java.lang.String r3 = r1.A01
            if (r0 == 0) goto L_0x0071
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0071
            java.util.ArrayList r2 = X.DbV.A14(r0)
            r0 = 30
            if (r1 > r0) goto L_0x001d
            r2.add(r3)
        L_0x001d:
            java.lang.String r1 = " · "
            r0 = 0
            java.lang.String r0 = X.DbT.A0z(r1, r2, r0)
        L_0x0024:
            r1 = 11
            X.LY3 r2 = new X.LY3
            r2.<init>((java.lang.Object) r8, (int) r1)
            r1 = 0
            r8.A01(r1, r2, r1, r0)
            com.instagram.common.session.UserSession r7 = r8.A0B
            com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r0 = r5.A04
            java.lang.String r6 = r0.A03
            java.lang.String r5 = r5.A0E
            X.4DH r2 = r8.A0A
            java.lang.String r4 = "FEED_COMPOSER"
            r1 = 1
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = X.MYP.A00()
            r3.put(r0, r5)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "pre_attached"
            r3.put(r0, r1)
            X.0wc r1 = X.AnonymousClass0kN.A01(r2, r7)
            java.lang.String r0 = "ig_cg_composer_show_existing_fundraiser"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r6)
            java.lang.String r0 = "fundraiser_id"
            r2.A9F(r0, r1)
            java.lang.String r0 = "attributes"
            r2.A9H(r0, r3)
            java.lang.String r0 = "source_name"
            r2.AAJ(r0, r4)
            r2.Cgf()
            return
        L_0x0071:
            r0 = 0
            goto L_0x0024
        L_0x0073:
            com.instagram.model.fundraiser.NewFundraiserInfo r0 = r5.A02
            if (r0 == 0) goto L_0x007b
            r8.A04(r0)
            return
        L_0x007b:
            android.view.ViewGroup r1 = r8.A03
            if (r1 == 0) goto L_0x00cf
            r0 = 2131430937(0x7f0b0e19, float:1.848359E38)
            X.JTR.A1D(r1, r0)
            android.view.ViewGroup r1 = r8.A03
            r0 = 2131433265(0x7f0b1731, float:1.848831E38)
            int r2 = X.Dbb.A03(r1, r0)
            android.view.ViewGroup r1 = r8.A03
            r0 = 2131433278(0x7f0b173e, float:1.8488337E38)
            X.DbT.A1F(r1, r0, r2)
            android.view.ViewGroup r1 = r8.A03
            r0 = 2131430939(0x7f0b0e1b, float:1.8483593E38)
            android.view.View r1 = r1.requireViewById(r0)
            r0 = 15
            X.LY3.A00(r1, r0, r8)
            android.view.ViewGroup r1 = r8.A03
            r0 = 2131430938(0x7f0b0e1a, float:1.8483591E38)
            android.widget.TextView r4 = X.DbU.A0G(r1, r0)
            com.instagram.common.session.UserSession r3 = r8.A0B
            com.instagram.user.model.User r0 = X.DbT.A0j(r3)
            boolean r0 = r0.A21()
            if (r0 == 0) goto L_0x00c9
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318522627856604(0x810781000018dc, double:3.031318180584307E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 2131971297(0x7f134ce1, float:1.957957E38)
            if (r1 != 0) goto L_0x00cc
        L_0x00c9:
            r0 = 2131956858(0x7f13147a, float:1.9550284E38)
        L_0x00cc:
            r4.setText(r0)
        L_0x00cf:
            com.instagram.common.session.UserSession r3 = r8.A0B
            java.lang.String r2 = r5.A0E
            X.4DH r1 = r8.A0A
            java.lang.String r0 = "FEED_COMPOSER"
            X.LKP.A00(r1, r3, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64159LRa.A02():void");
    }

    public final void A03() {
        List list;
        C253353qe r0;
        View A002;
        if (this.A02 != null && this.A04 != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            UserSession userSession = this.A0B;
            C61841KOf kOf = this.A0C;
            LinkedHashSet linkedHashSet = new LinkedHashSet(kOf.A07);
            LinkedHashSet linkedHashSet2 = kOf.A08;
            linkedHashSet.addAll(linkedHashSet2);
            ArrayList A003 = LKR.A00(userSession, linkedHashSet);
            Collections.sort(A003, new C51566FwC((Object) Collator.getInstance(), 13));
            Iterator it = A003.iterator();
            while (it.hasNext()) {
                User A0k = DbT.A0k(it);
                if (!kOf.A06.contains(A0k.getUsername()) && (A002 = A00(new LY2(20, this, A0k), (Integer) null, A0k.B8Q())) != null) {
                    A1C.add(A002);
                    DbU.A1V(A0k, A1C2);
                    A1C3.add(A0k.getUsername());
                    if (A1C.size() == 5) {
                        break;
                    }
                }
            }
            if (A1C.isEmpty() || !182.A06(0Tu.A05, userSession, 36317985756944088L)) {
                list = this.A0F;
                if (!list.isEmpty() && A1C2.isEmpty()) {
                    list.clear();
                    LTM.A08(this.A0A, userSession, "FEED_COMPOSER", A1C2);
                }
                A1C = AnonymousClass7TE.A1C();
            } else {
                list = this.A0F;
                if (!A1C3.equals(list)) {
                    list.clear();
                    list.addAll(A1C3);
                    LTM.A08(this.A0A, userSession, "FEED_COMPOSER", A1C2);
                }
            }
            if (!A1C.isEmpty() && !kOf.A0B && this.A06 == null && this.A00 != null) {
                1Av A004 = 1Au.A00(userSession);
                int i = A004.A01.getInt("feed_mentioned_tagged_nudge_nux_shown_count", 0);
                if (i < AnonymousClass7TF.A0Y(0Tu.A06, userSession, 36599602467769948L).intValue() && !list.isEmpty()) {
                    int i2 = 2131966145;
                    if (linkedHashSet2.contains(list.get(0))) {
                        i2 = 2131974966;
                    }
                    AnonymousClass4DH r9 = this.A0A;
                    String string = r9.getString(i2);
                    if (string != null && 182.A06(0Tu.A05, userSession, 36317985757402842L)) {
                        AnonymousClass5Gt r1 = new AnonymousClass5Gt(r9.requireActivity(), new C315476jx((CharSequence) string));
                        r1.A03(this.A00);
                        r1.A02();
                        C66052M9l m9l = new C66052M9l(r1.A00(), A004, this, i);
                        this.A06 = m9l;
                        C64125LOw lOw = this.A05;
                        if (lOw != null) {
                            lOw.A02(m9l);
                        }
                    }
                }
            }
            if (A1C.isEmpty() && (r0 = kOf.A00) != null && r0.C8h() > 0) {
                C253353qe r02 = kOf.A00;
                A1C = AnonymousClass7TE.A1C();
                if (r02 != null) {
                    ArrayList A1C4 = AnonymousClass7TE.A1C();
                    for (C46322DUz dUz : r02.B8h()) {
                        View A005 = A00(new LY2(22, this, dUz), (Integer) null, dUz.getFundraiserTitle());
                        if (A005 != null) {
                            A1C.add(A005);
                            A1C4.add(dUz.getFundraiserId());
                        }
                        if (A1C.size() == 5) {
                            break;
                        }
                    }
                    AnonymousClass4DH r10 = this.A0A;
                    String string2 = r10.getString(2131962820);
                    View A006 = A00(new LY3((Object) this, 14), Integer.valueOf(R.drawable.search_location_small), string2);
                    if (A006 != null) {
                        A1C.add(A006);
                    }
                    if (!A1C.isEmpty() && !kOf.A09.equals(A1C4)) {
                        kOf.A09 = A1C4;
                        HashMap A1E = AnonymousClass7TE.A1E();
                        A1E.put("suggested_fundraiser_ids", TextUtils.join(",", A1C4));
                        LTM.A06(r10, userSession, "suggested_fundraiser_pills", "FEED_COMPOSER", (String) null, (String) null, A1E);
                    }
                }
            }
            boolean A1b = DbT.A1b(A1C);
            this.A02.setVisibility(DbW.A01(A1b ? 1 : 0));
            this.A04.removeAllViews();
            if (A1b) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 0, AnonymousClass7TE.A0D(this.A04.getResources()), 0);
                if (DbT.A0j(userSession).A21() && 182.A06(0Tu.A05, userSession, 36318522627856604L)) {
                    ViewGroup viewGroup = this.A04;
                    View A007 = A00(new LY3((Object) this, 10), (Integer) null, this.A0A.getString(2131960987));
                    A007.getClass();
                    viewGroup.addView(A007, layoutParams);
                }
                Iterator it2 = A1C.iterator();
                while (it2.hasNext()) {
                    this.A04.addView(JTO.A0H(it2), layoutParams);
                }
            }
        }
    }

    public final void A04(NewFundraiserInfo newFundraiserInfo) {
        String str;
        int length;
        NewFundraiserInfo newFundraiserInfo2 = newFundraiserInfo;
        String str2 = newFundraiserInfo2.A04;
        if (str2 != null) {
            if (JTQ.A1Y(FundraiserCampaignTypeEnum.IG_STANDALONE_FOR_CHARITY, str2)) {
                C61841KOf kOf = this.A0C;
                kOf.A02 = newFundraiserInfo2;
                kOf.A0A = true;
                UserSession userSession = this.A0B;
                AnonymousClass4DH r3 = this.A0A;
                FragmentActivity requireActivity = r3.requireActivity();
                String str3 = newFundraiserInfo2.A01;
                str3.getClass();
                String str4 = newFundraiserInfo2.A07;
                Integer valueOf = Integer.valueOf(newFundraiserInfo2.A00);
                String str5 = newFundraiserInfo2.A05;
                List list = newFundraiserInfo2.A08;
                String str6 = newFundraiserInfo2.A03;
                String str7 = kOf.A0E;
                0qQ.A0B(userSession, 0);
                C55175HdR.A00(DbT.A05(requireActivity), userSession, "com.instagram.social_impact.fundraiser.nonprofit_creation_details_for_feed.component.view", LTV.A00(valueOf, str3, "FEED_COMPOSER", str4, str5, str6, str7, list), 60);
                String string = r3.getString(2131962821);
                LY2 ly2 = new LY2(21, this, newFundraiserInfo2);
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                currencyInstance.setMaximumFractionDigits(0);
                currencyInstance.setCurrency(Currency.getInstance(str5));
                String format = currencyInstance.format(valueOf);
                0qQ.A07(format);
                if (str4 == null || (length = str4.length()) == 0) {
                    str = null;
                } else {
                    ArrayList A14 = DbV.A14(str4);
                    if (length <= 30) {
                        A14.add(format);
                    }
                    str = DbT.A0z(" · ", A14, (0sP) null);
                }
                A01(ly2, new LY3((Object) this, 12), string, str);
            } else if (JTQ.A1Y(FundraiserCampaignTypeEnum.IG_CHARITY_BUSINESS_PROFILE, str2)) {
                AnonymousClass4DH r32 = this.A0A;
                A01((View.OnClickListener) null, new LY3((Object) this, 13), r32.getString(2131960987), DbV.A0z(r32, newFundraiserInfo2.A07, 2131960986));
            }
        }
    }

    public C64159LRa(AnonymousClass4DH r4, UserSession userSession, C61841KOf kOf) {
        this.A0B = userSession;
        this.A0A = r4;
        this.A0C = kOf;
        0Tu r2 = 0Tu.A06;
        this.A09 = 182.A00(r2, userSession, 37162410687594720L);
        this.A0G = 182.A06(r2, userSession, 36317985757796060L);
        this.A0D = AnonymousClass7TF.A0Y(r2, userSession, 36599460734307866L);
        this.A0E = AnonymousClass7TF.A0Y(r2, userSession, 36599602467835485L);
    }
}
