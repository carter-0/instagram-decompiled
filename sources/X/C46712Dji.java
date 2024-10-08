package X;

import android.content.Context;
import android.content.IntentSender;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.XFBFXIGPCEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Dji  reason: case insensitive filesystem */
public final class C46712Dji extends BaseAdapter implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {
    public User A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final E6S A03;
    public final C51943G8m A04;
    public final List A05;
    public final Map A06 = AnonymousClass7TE.A1E();
    public final boolean A07;
    public final boolean A08;
    public final Integer A09;
    public final List A0A;
    public final List A0B;
    public final List A0C;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getViewTypeCount() {
        return 5;
    }

    public final int getCount() {
        int A012 = DbT.A01(this.A0C, DbT.A01(this.A0B, DbT.A01(this.A0A, this.A05.size())));
        int i = 0;
        if (this.A09 != AnonymousClass05K.A00) {
            i = 1;
        }
        return A012 + i;
    }

    public final int getItemViewType(int i) {
        int size = this.A05.size();
        int size2 = this.A0A.size();
        int size3 = this.A0B.size();
        int size4 = this.A0C.size();
        if (i < size) {
            return 0;
        }
        int i2 = size + size2;
        if (i < i2) {
            return 1;
        }
        int i3 = i2 + size3;
        if (i < i3) {
            return 2;
        }
        if (i < i3 + size4) {
            return 3;
        }
        if (1 - this.A09.intValue() == 0) {
            return 4;
        }
        throw AnonymousClass7TE.A1B("The add account button is hidden.");
    }

    /* JADX WARNING: type inference failed for: r2v22, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x027a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r15, android.view.View r16, android.view.ViewGroup r17) {
        /*
            r14 = this;
            if (r16 != 0) goto L_0x0017
            int r1 = r14.getItemViewType(r15)
            r2 = r17
            if (r1 == 0) goto L_0x0293
            r0 = 1
            if (r1 == r0) goto L_0x0293
            r0 = 2
            if (r1 == r0) goto L_0x0293
            r0 = 3
            if (r1 != r0) goto L_0x0293
            android.view.View r16 = X.C49006Eni.A00(r2)
        L_0x0017:
            int r1 = r14.getItemViewType(r15)
            if (r1 == 0) goto L_0x00cd
            r0 = 1
            if (r1 == r0) goto L_0x02d3
            r0 = 2
            if (r1 == r0) goto L_0x02af
            r0 = 3
            if (r1 == r0) goto L_0x0073
            java.lang.Object r6 = X.DbT.A0o(r16)
            X.F0r r6 = (X.C49660F0r) r6
            r5 = 0
            X.0qQ.A0B(r6, r5)
            android.view.View r3 = r6.A02
            android.content.Context r4 = r3.getContext()
            android.widget.TextView r1 = r6.A06
            r0 = 2131952260(0x7f130284, float:1.9540958E38)
            r1.setText(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r6.A07
            r0 = 2131239505(0x7f082251, float:1.8095319E38)
            X.DbU.A13(r4, r2, r0)
            r2.setStrokeAlpha(r5)
            int r0 = X.2Yu.A0B(r4)
            X.DbX.A12(r4, r2, r0)
            r0 = 2130970865(0x7f0408f1, float:1.7550452E38)
            int r0 = X.2Yu.A0H(r4, r0)
            X.DbU.A11(r4, r2, r0)
            android.widget.ImageView r1 = r6.A03
            r0 = 8
            r1.setVisibility(r0)
            r2.setVisibility(r5)
        L_0x0064:
            android.content.Context r1 = r3.getContext()
            r0 = 16843534(0x101030e, float:2.369575E-38)
            int r0 = X.2Yu.A0H(r1, r0)
            r3.setBackgroundResource(r0)
        L_0x0072:
            return r16
        L_0x0073:
            java.lang.Object r4 = r14.getItem(r15)
            X.JwH r4 = (X.C61079JwH) r4
            java.lang.Object r8 = r16.getTag()
            X.F0r r8 = (X.C49660F0r) r8
            X.E6S r3 = r14.A03
            X.0iw r5 = r14.A01
            if (r4 == 0) goto L_0x0072
            if (r8 == 0) goto L_0x0072
            java.lang.String r2 = r4.A02
            java.lang.Object r1 = r4.A01
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            android.widget.TextView r0 = r8.A06
            r0.setText(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r8.A07
            r0 = 51
            r2.setStrokeAlpha(r0)
            if (r1 == 0) goto L_0x00c2
            r2.setUrl(r1, r5)
        L_0x009e:
            r9 = 0
            r2.setVisibility(r9)
            android.widget.TextView r0 = r8.A04
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r8.A05
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r8.A03
            r0.setVisibility(r1)
            com.instagram.igds.components.button.IgdsButton r1 = r8.A08
            X.0Sd.A00(r1)
            r1.setVisibility(r9)
            r0 = 61
            X.FPF.A00(r1, r0, r4, r3)
            goto L_0x0276
        L_0x00c2:
            android.content.Context r1 = r2.getContext()
            r0 = 2131239607(0x7f0822b7, float:1.8095526E38)
            X.DbU.A13(r1, r2, r0)
            goto L_0x009e
        L_0x00cd:
            java.lang.Object r10 = r14.getItem(r15)
            r10.getClass()
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            if (r10 == 0) goto L_0x0193
            java.util.Map r1 = r14.A06
            java.lang.String r0 = r10.getId()
            java.lang.Object r2 = r1.get(r0)
            X.2aX r2 = (X.2aX) r2
        L_0x00e4:
            com.instagram.common.session.UserSession r9 = r14.A02
            X.0iw r6 = r14.A01
            java.lang.Object r8 = X.DbT.A0o(r16)
            X.F0r r8 = (X.C49660F0r) r8
            boolean r12 = r14.A07
            boolean r3 = r14.A08
            X.G8m r11 = r14.A04
            android.widget.TextView r1 = r8.A06
            android.content.Context r4 = r1.getContext()
            java.lang.String r0 = r10.getUsername()
            com.instagram.common.typedurl.ImageUrl r5 = r10.Bh3()
            r1.setText(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r8.A07
            r0 = 51
            r1.setStrokeAlpha(r0)
            r1.setUrl(r5, r6)
            r7 = 0
            r1.setVisibility(r7)
            android.widget.TextView r0 = r8.A04
            r6 = 8
            r0.setVisibility(r6)
            com.instagram.user.model.User r0 = X.DbT.A0j(r9)
            boolean r9 = r10.equals(r0)
            if (r12 != 0) goto L_0x018d
            if (r9 == 0) goto L_0x018d
            android.view.View r1 = r8.A02
            X.U7D r0 = new X.U7D
            r0.<init>(r7)
            X.03v.A0B(r1, r0)
            android.widget.ImageView r1 = r8.A03
            android.graphics.drawable.Drawable r0 = r8.A00
            r1.setImageDrawable(r0)
            r1.setVisibility(r7)
        L_0x013a:
            java.lang.String r5 = ""
            if (r12 != 0) goto L_0x023d
            if (r9 != 0) goto L_0x023d
            if (r3 == 0) goto L_0x0214
            android.content.res.Resources r4 = r4.getResources()
            X.Ff5 r11 = (X.Ff5) r11
            X.0qQ.A0B(r4, r7)
            r3 = r5
            if (r2 == 0) goto L_0x0268
            java.util.List r1 = r2.A04
            if (r1 == 0) goto L_0x0268
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            int r0 = X.AnonymousClass7TG.A01(r0)
            java.util.LinkedHashMap r10 = X.DbS.A0x(r0)
            java.util.Iterator r13 = r1.iterator()
        L_0x0164:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0196
            java.lang.Object r12 = r13.next()
            X.2aX r12 = (X.2aX) r12
            X.2aE r1 = r12.A03
            boolean r0 = r1 instanceof X.AnonymousClass4DE
            if (r0 == 0) goto L_0x017e
            X.4DE r1 = (X.AnonymousClass4DE) r1
            if (r1 == 0) goto L_0x017e
            X.2aD r2 = r1.A01
            if (r2 != 0) goto L_0x0180
        L_0x017e:
            X.2aD r2 = X.2aD.A0Y
        L_0x0180:
            int r1 = r12.A01
            int r0 = r12.A00
            int r1 = r1 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r10.put(r2, r0)
            goto L_0x0164
        L_0x018d:
            android.widget.ImageView r0 = r8.A03
            r0.setVisibility(r6)
            goto L_0x013a
        L_0x0193:
            r2 = 0
            goto L_0x00e4
        L_0x0196:
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r12 = X.AnonymousClass7TF.A0s(r10)
        L_0x019e:
            boolean r0 = r12.hasNext()
            r13 = 1
            if (r0 == 0) goto L_0x01c3
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r12)
            java.util.Map r10 = r11.A02
            java.lang.Object r0 = r1.getKey()
            boolean r0 = r10.containsKey(r0)
            if (r0 == 0) goto L_0x019e
            java.lang.Object r0 = r1.getValue()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            if (r0 <= 0) goto L_0x019e
            X.Dbb.A1V(r1, r2)
            goto L_0x019e
        L_0x01c3:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0268
            java.util.List r0 = r11.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x01cf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0268
            java.lang.Object r12 = r1.next()
            boolean r0 = r2.containsKey(r12)
            if (r0 == 0) goto L_0x01cf
            if (r12 == 0) goto L_0x0268
            java.lang.Object r10 = r2.get(r12)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L_0x0268
            int r1 = r10.intValue()
            java.util.Map r0 = r11.A02
            java.lang.Object r0 = r0.get(r12)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0268
            int r3 = r0.intValue()
            java.util.Collection r0 = r2.values()
            int r2 = -r1
            java.util.Iterator r12 = r0.iterator()
        L_0x0204:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x023f
            java.lang.Object r0 = r12.next()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r2 = r2 + r0
            goto L_0x0204
        L_0x0214:
            int r0 = r10.A02()
            r3 = r5
            if (r0 <= 0) goto L_0x0268
            java.util.Map r0 = r10.A05
            com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ImmutableMap.copyOf(r0)
            X.0qQ.A07(r2)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0268
            X.2aE r1 = X.FFg.A01(r2)
            int r0 = r10.A02()
            java.lang.String r0 = X.FFg.A02(r4, r1, r2, r0)
            if (r0 == 0) goto L_0x0268
            java.lang.String r3 = r0.toString()
            goto L_0x0268
        L_0x023d:
            r3 = r5
            goto L_0x0268
        L_0x023f:
            java.lang.String r3 = X.DbY.A0e(r4, r10, r3, r1)
            if (r2 <= 0) goto L_0x0268
            java.lang.Integer r0 = r11.A00
            int r0 = r0.intValue()
            if (r0 == r7) goto L_0x0286
            r0 = 2131820882(0x7f110152, float:1.9274491E38)
            java.lang.String r2 = X.DbY.A0d(r4, r2, r0)
            X.0qQ.A07(r2)
            r1 = 2131952942(0x7f13052e, float:1.954234E38)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r7] = r3
        L_0x025f:
            r0[r13] = r2
            java.lang.String r3 = r4.getString(r1, r0)
            X.0qQ.A07(r3)
        L_0x0268:
            boolean r1 = X.0mp.A0B(r3)
            android.widget.TextView r0 = r8.A05
            if (r1 == 0) goto L_0x027f
            r0.setText(r5)
            r0.setVisibility(r6)
        L_0x0276:
            android.view.View r3 = r8.A02
            if (r9 == 0) goto L_0x0064
            r0 = 0
            r3.setBackground(r0)
            return r16
        L_0x027f:
            r0.setText(r3)
            r0.setVisibility(r7)
            goto L_0x0276
        L_0x0286:
            r1 = 2131952941(0x7f13052d, float:1.9542339E38)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r7] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x025f
        L_0x0293:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            android.view.View r16 = X.C49006Eni.A00(r2)
            java.lang.Object r1 = r16.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.multipleaccounts.adapter.UserAccountsRowViewHolder"
            X.0qQ.A0C(r1, r0)
            X.F0r r1 = (X.C49660F0r) r1
            com.instagram.igds.components.button.IgdsButton r1 = r1.A08
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0017
        L_0x02af:
            java.lang.Object r2 = r14.getItem(r15)
            r2.getClass()
            X.Exs r2 = (X.C49557Exs) r2
            java.lang.Object r3 = X.DbT.A0o(r16)
            X.F0r r3 = (X.C49660F0r) r3
            X.0iw r5 = r14.A01
            boolean r4 = r14.A07
            android.widget.TextView r1 = r3.A06
            com.instagram.user.model.User r0 = r2.A00
            X.DbU.A1H(r1, r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r3.A07
            r0 = 51
            r1.setStrokeAlpha(r0)
            com.instagram.user.model.User r0 = r2.A00
            goto L_0x02fa
        L_0x02d3:
            java.lang.Object r2 = r14.getItem(r15)
            r2.getClass()
            X.ExJ r2 = (X.C49537ExJ) r2
            java.lang.Object r3 = X.DbT.A0o(r16)
            X.F0r r3 = (X.C49660F0r) r3
            X.0iw r5 = r14.A01
            boolean r4 = r14.A07
            android.widget.TextView r1 = r3.A06
            X.9GU r0 = r2.A00
            com.instagram.user.model.User r0 = r0.A01
            X.DbU.A1H(r1, r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r3.A07
            r0 = 51
            r1.setStrokeAlpha(r0)
            X.9GU r0 = r2.A00
            com.instagram.user.model.User r0 = r0.A01
        L_0x02fa:
            X.DbU.A1S(r5, r1, r0)
            r2 = 0
            r1.setVisibility(r2)
            if (r4 == 0) goto L_0x030b
            android.widget.ImageView r1 = r3.A03
            r0 = 8
            r1.setVisibility(r0)
            return r16
        L_0x030b:
            android.widget.TextView r1 = r3.A04
            r0 = 8
            r1.setVisibility(r0)
            android.widget.ImageView r1 = r3.A03
            r1.setVisibility(r2)
            android.graphics.drawable.Drawable r0 = r3.A01
            r1.setImageDrawable(r0)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46712Dji.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AnonymousClass0aP r10;
        C47906EMa eMa;
        Context context;
        String str;
        User user;
        int i2 = i;
        int itemViewType = getItemViewType(i2);
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                C49537ExJ exJ = (C49537ExJ) getItem(i2);
                if (exJ != null) {
                    Fragment fragment = this.A03;
                    E6S.A02(fragment, exJ.A00.A01.getUsername(), true, false);
                    E6S.A01(fragment);
                    r10 = 09i.A0A.A03(fragment);
                    eMa = new C47906EMa(fragment, fragment, r10, new C50515Fdb(fragment.getRootActivity()), C46634DiE.A0Z, exJ, fragment, exJ.A00.A01.getUsername(), exJ.A00.A01.getId(), 0);
                    UserSession userSession = fragment.A02;
                    String id = exJ.A00.A01.getId();
                    0qQ.A0B(userSession, 0);
                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_one_login_deferred_login_initiated");
                    A0e.AAJ("containermodule", "account_switch_fragment");
                    A0e.A9F("account_id", AnonymousClass7TE.A10(id));
                    A0e.Cgf();
                    context = fragment.A00;
                    str = exJ.A02;
                    user = exJ.A00.A01;
                } else {
                    return;
                }
            } else if (itemViewType == 2) {
                C49557Exs exs = (C49557Exs) getItem(i2);
                if (exs != null) {
                    E6S e6s = this.A03;
                    E6S.A01(e6s);
                    r10 = 09i.A0A.A03(e6s);
                    eMa = new C47906EMa(e6s, e6s, r10, new C50515Fdb(e6s.getRootActivity()), C46634DiE.A0Z, exs, e6s, exs.A00.getUsername(), exs.A00.getId(), 1);
                    context = e6s.A00;
                    str = exs.A01;
                    user = exs.A00;
                } else {
                    return;
                }
            } else if (itemViewType != 3) {
                E6S e6s2 = this.A03;
                FragmentActivity activity = e6s2.getActivity();
                if (activity != null) {
                    0B7 AEO = AnonymousClass0BO.A00(e6s2.A02).AEO(activity, (Uri) null, e6s2.A02, e6s2.A04, false);
                    if (AEO.A01) {
                        if (FCQ.A02(e6s2.A02)) {
                            AnonymousClass37D A0i = DbT.A0i(activity);
                            if (A0i != null) {
                                0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(e6s2.A02), "account_switch_add_account_tapped");
                                if (A0e2.isSampled()) {
                                    DbV.A1J(A0e2, e6s2.A04);
                                }
                                A0i.A0Q(new NgC(1, e6s2, activity, DbV.A05(e6s2)));
                            }
                        } else {
                            FFQ.A00().A01(activity, AEO.A00, e6s2.A02, false);
                        }
                    } else if (!FFT.A02(e6s2.A02)) {
                        0Aj A0e3 = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(e6s2.A02), "account_switcher_max_limit_reached");
                        if (A0e3.isSampled()) {
                            DbS.A1N(A0e3, e6s2.A04);
                            A0e3.AAJ("containermodule", "account_switch_fragment");
                            A0e3.Cgf();
                        }
                    }
                }
                E6S.A01(e6s2);
                return;
            } else {
                return;
            }
            1OC A032 = FHA.A03(context, r10, str, user.getId(), (String) null);
            A032.A00 = eMa;
            1ES.A03(A032);
            return;
        }
        Object item = getItem(i2);
        item.getClass();
        User user2 = (User) item;
        if (user2.equals(this.A00)) {
            E6S.A02(this.A03, user2.getUsername(), true, true);
            return;
        }
        UserSession userSession2 = this.A02;
        2aT A0c = DbU.A0c(userSession2);
        2aX r3 = new 2aX(2aD.A07, user2.A02());
        AnonymousClass2g1 r2 = AnonymousClass2g1.ACCOUNT_SWITCHER;
        C226252fx r12 = C226252fx.NUMBERED;
        A0c.A05(r12, r2, r3, Collections.singletonMap("badge_user_id", user2.getId()));
        2aV A0a = DbV.A0a(userSession2);
        2aD r9 = 2aD.A0p;
        2aX r1 = new 2aX(r9, user2.A02());
        AnonymousClass2g1 r32 = AnonymousClass2g1.BOTTOM_SHEET;
        0qQ.A0B(r32, 0);
        A0a.A03(new C239993Jd(r12, r32, (C71062aE) null, (Set) null), r1, false);
        E6S e6s3 = this.A03;
        E6S.A02(e6s3, user2.getUsername(), false, true);
        UserSession userSession3 = e6s3.A02;
        boolean z = C46400DeN.A04;
        0qQ.A0B(userSession3, 0);
        DbU.A0c(userSession3).A00.AHZ();
        int A022 = user2.A02();
        2aT.A00(DbU.A0c(userSession3), r12, AnonymousClass2g1.BOTTOM_SHEET_VERTICAL, new 2aX(2aD.A06, (List) null, A022, A022), AnonymousClass05K.A0C, "click", (Map) null, 0, 0, 0, 0);
        DbV.A0a(userSession3).A03(new C239993Jd(r12, r32, (C71062aE) null, (Set) null), new 2aX(r9, (List) null, A022, A022), false);
        0BQ A002 = AnonymousClass0BO.A00(e6s3.A02);
        Context context2 = e6s3.A00;
        if (context2 != null && A002.AG1(context2, e6s3.A02, user2)) {
            UserSession userSession4 = e6s3.A02;
            String str2 = e6s3.A04;
            A002.E2S(context2, e6s3.A01, userSession4, user2, str2);
            this.A00 = user2;
            0qQ.A0B(userSession2, 1);
            XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint = XFBFXIGPCEntryPoint.SWITCHER_NOTIFICATION;
            try {
                1ES.A03(C48320Ecd.A00(new C61080JwI(xFBFXIGPCEntryPoint), userSession2));
            } catch (Exception e) {
                Dbc.A0w(userSession2, xFBFXIGPCEntryPoint, e);
            }
        }
    }

    public C46712Dji(AnonymousClass0iw r3, UserSession userSession, E6S e6s, Integer num, List list, List list2, List list3, List list4, boolean z, boolean z2, boolean z3) {
        Integer num2;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = e6s;
        this.A05 = list;
        this.A09 = num;
        this.A0A = list2;
        this.A0B = list3;
        this.A0C = list4;
        this.A00 = DbT.A0j(userSession);
        this.A07 = z;
        this.A08 = z2;
        if (z3) {
            num2 = AnonymousClass05K.A01;
        } else {
            num2 = AnonymousClass05K.A00;
        }
        this.A04 = new Ff5(num2);
    }

    public final Object getItem(int i) {
        List list;
        int i2;
        int i3;
        List list2;
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType == 2) {
                    list = this.A0B;
                    i3 = this.A05.size();
                    list2 = this.A0A;
                } else if (itemViewType != 3) {
                    return null;
                } else {
                    list = this.A0C;
                    i3 = DbT.A01(this.A0A, this.A05.size());
                    list2 = this.A0B;
                }
                i2 = DbT.A01(list2, i3);
            } else {
                list = this.A0A;
                i2 = this.A05.size();
            }
            i -= i2;
        } else {
            list = this.A05;
        }
        return list.get(i);
    }

    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        Bitmap createBitmap;
        Icon createWithResource;
        if (getItem(i) == null) {
            return false;
        }
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            E6S e6s = this.A03;
            User user = (User) getItem(i);
            View requireViewById = view.requireViewById(R.id.row_user_imageview);
            requireViewById.setDrawingCacheEnabled(true);
            if (requireViewById.getDrawingCache() == null) {
                createBitmap = null;
            } else {
                Bitmap drawingCache = requireViewById.getDrawingCache();
                0fO.A03(drawingCache);
                createBitmap = Bitmap.createBitmap(drawingCache);
            }
            requireViewById.setDrawingCacheEnabled(false);
            Context context = e6s.A00;
            String id = user.getId();
            String username = user.getUsername();
            0qQ.A0B(context, 0);
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager != null) {
                ShortcutInfo.Builder builder = new ShortcutInfo.Builder(context, 002.A0S(AnonymousClass000.A00(1992), id, '\''));
                if (createBitmap != null) {
                    createWithResource = Icon.createWithAdaptiveBitmap(createBitmap);
                } else {
                    createWithResource = Icon.createWithResource(context, R.drawable.profile_anonymous_user);
                }
                ShortcutInfo build = builder.setIcon(createWithResource).setIntent(AnonymousClass90S.A00(id, username)).setShortLabel(username).setLongLabel(username).build();
                0qQ.A07(build);
                try {
                    shortcutManager.requestPinShortcut(build, (IntentSender) null);
                } catch (IllegalStateException unused) {
                    0wb.A04("DedicatedPinnedShortcut", "IllegalStateException when requestPinShortcut", 1);
                }
            }
            0xm A0e = DbS.A0e();
            long currentTimeMillis = System.currentTimeMillis();
            0xY A0d = DbS.A0d(A0e);
            A0d.E5c("long_press_account_switcher_row_to_create_shortcut_last_timestamp", currentTimeMillis);
            A0d.apply();
            return true;
        } else if (itemViewType != 1 && itemViewType != 2) {
            return false;
        } else {
            E6S e6s2 = this.A03;
            C59689JTv.A09(e6s2.A00, DbV.A05(e6s2).getText(2131956892));
            return true;
        }
    }
}
