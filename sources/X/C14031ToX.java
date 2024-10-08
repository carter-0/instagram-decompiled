package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.ToX  reason: case insensitive filesystem */
public final class C14031ToX extends 2Rw {
    public RecyclerView A00;
    public 0xF A01;
    public C311496cm A02;
    public C320216s0 A03;
    public C14029ToV A04 = new C14029ToV(new ArrayList());
    public final Context A05;
    public final FragmentActivity A06;
    public final AnonymousClass0iw A07;
    public final UserSession A08;
    public final AnonymousClass3BQ A09;
    public final AnonymousClass32A A0A;
    public final User A0B;
    public final Runnable A0C;
    public final String A0D;
    public final C14034Toa A0E;

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        this.A00 = recyclerView;
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            View A0D2 = DbT.A0D(LayoutInflater.from(this.A05), viewGroup, R.layout.suggested_entity_card, false);
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C14032ToY(A0D2, this.A08, new C14146Tqi(this));
        } else if (i == 1) {
            View A0D3 = DbT.A0D(LayoutInflater.from(this.A05), viewGroup, R.layout.suggested_entity_card, false);
            int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new UE7(A0D3, new VNM(this));
        } else if (i == 2) {
            View A0D4 = DbT.A0D(LayoutInflater.from(this.A05), viewGroup, R.layout.card_recommend_accounts_header, false);
            int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new UD8(A0D4, new VNN(this));
        } else if (i == 4) {
            View A0D5 = DbT.A0D(LayoutInflater.from(this.A05), viewGroup, R.layout.find_more_card, false);
            C320216s0 r1 = this.A03;
            if (r1 != null) {
                r1.A0F("see_all_card");
            }
            int i5 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C14881UDj(A0D5, this.A08, new VNL(this), this.A0B);
        } else if (i == 5) {
            View A0D6 = DbT.A0D(LayoutInflater.from(this.A05), viewGroup, R.layout.contact_import_card, false);
            0xG r3 = this.A07;
            if (!0qQ.A0K(r3.getModuleName(), "profile")) {
                r3 = new 0xG("self_profile_su");
            }
            C311496cm r2 = this.A02;
            if (r2 == null) {
                r2 = new C311496cm(r3, this.A08);
            }
            if (this.A02 == null) {
                this.A02 = r2;
            }
            int i6 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new UEN(A0D6, this.A08, r2, new VNK(this));
        } else {
            throw DbW.A0b("viewType invalid and unrecognized: ", i);
        }
    }

    public final void onViewAttachedToWindow(C249703kE r10) {
        0qQ.A0B(r10, 0);
        int bindingAdapterPosition = r10.getBindingAdapterPosition();
        int itemViewType = getItemViewType(bindingAdapterPosition);
        Object obj = this.A04.A00.get(bindingAdapterPosition);
        if (itemViewType == 0) {
            GradientSpinner gradientSpinner = ((C14032ToY) r10).A03.A0O;
            User user = this.A0B;
            if (user != null && gradientSpinner.getVisibility() == 0) {
                C293005js r1 = new C293005js(this.A07, this.A08);
                String id = user.getId();
                Integer valueOf = Integer.valueOf(bindingAdapterPosition);
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.user.model.User");
                String id2 = ((User) obj).getId();
                Boolean valueOf2 = Boolean.valueOf(user.A1L());
                String moduleName = r1.A00.getModuleName();
                0Aj A0e = AnonymousClass7TE.A0e(r1.A06, "similar_user_story_ring_impression");
                A0e.AAJ("target_id", id);
                A0e.AAJ("view_module", "user_profile");
                A0e.AAJ("containermodule", moduleName);
                A0e.A8k("position", valueOf);
                A0e.AAJ("chaining_profile_id", id2);
                A0e.AAJ("algorithm", "business_profile_chaining_nebula");
                A0e.A7p("is_auto_expand", valueOf2);
                A0e.Cgf();
            }
        } else if (itemViewType != 1 && itemViewType != 2 && itemViewType == 3) {
            0xI A012 = 0xI.A01("ig_ra_chaining_unit_impression", AnonymousClass000.A00(5169));
            A012.A08(Integer.valueOf(bindingAdapterPosition), "pos");
            UserSession userSession = this.A08;
            A012.A0C(AnonymousClass000.A00(1739), userSession.A06);
            C14029ToV toV = this.A04;
            if (toV.A00()) {
                Object obj2 = toV.A00.get(0);
                0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.follow.chaining.RecommendAccountsHeader");
                A012.A0C("receiver_id", ((PG7) obj2).A00.getId());
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.user.model.User");
                A012.A0C("target_id", ((User) obj).getId());
                DbU.A1R(A012, userSession);
                return;
            }
            throw DbT.A0m();
        }
    }

    public static final void A00(C14031ToX toX, int i) {
        C320216s0 r0;
        toX.A04.A00.remove(i);
        if (toX.A04.A00.isEmpty() && (r0 = toX.A03) != null) {
            r0.A02();
        }
        toX.notifyItemRemoved(i);
    }

    public final Object A01(int i) {
        Object obj = this.A04.A00.get(i);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: X.UD8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: X.UEN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: X.UD8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: X.UD8} */
    /* JADX WARNING: type inference failed for: r5v3, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v35, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r17, int r18) {
        /*
            r16 = this;
            r10 = r17
            r2 = 0
            r5 = r16
            r4 = r18
            int r3 = X.JTP.A07(r5, r10, r2, r4)
            X.ToV r0 = r5.A04
            java.util.List r0 = r0.A00
            java.lang.Object r14 = r0.get(r4)
            java.lang.String r1 = "viewType invalid and unrecognized: "
            if (r3 == 0) goto L_0x0171
            r6 = 1
            if (r3 == r6) goto L_0x00ea
            r0 = 2
            if (r3 == r0) goto L_0x00b4
            r0 = 4
            if (r3 == r0) goto L_0x0088
            r0 = 5
            if (r3 != r0) goto L_0x00e5
            X.UEN r10 = (X.UEN) r10
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.follow.chaining.ContactImportCardType"
            X.0qQ.A0C(r14, r0)
            X.VNJ r14 = (X.VNJ) r14
            X.JSL r3 = r14.A00
            X.0rm r5 = new X.0rm
            r5.<init>()
            if (r3 == 0) goto L_0x0085
            android.widget.TextView r1 = r10.A02
            java.lang.String r0 = r3.CCG()
            r1.setText(r0)
            android.widget.TextView r1 = r10.A01
            java.lang.String r0 = r3.CCF()
            r1.setText(r0)
            android.widget.TextView r1 = r10.A00
            java.lang.String r0 = r3.CCC()
            r1.setText(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r10.A05
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.A06
            r0.setVisibility(r2)
            X.EX9 r0 = X.EX9.OTHERS_PROFILE_CHAINING
        L_0x005e:
            r5.A00 = r0
            X.6cm r4 = r10.A07
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0071
            r4.A00()
            r1 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.A01(r0, r1, r1)
        L_0x0071:
            com.instagram.common.ui.base.IgLinearLayout r1 = r10.A03
            r0 = 31
            X.WBG.A01(r1, r0, r10, r5)
            com.instagram.common.ui.base.IgSimpleImageView r2 = r10.A04
            r0 = 32
        L_0x007c:
            X.WBG r1 = new X.WBG
            r1.<init>(r0, r10, r3)
        L_0x0081:
            X.AnonymousClass0fU.A00(r1, r2)
            return
        L_0x0085:
            X.EX9 r0 = X.EX9.PROFILE_DISCOVER_PEOPLE_CI_UPSELL
            goto L_0x005e
        L_0x0088:
            X.UDj r10 = (X.C14881UDj) r10
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.follow.chaining.FindMorePeopleUpsellData"
            X.0qQ.A0C(r14, r0)
            X.N4R r14 = (X.N4R) r14
            X.0iw r3 = r5.A07
            X.0qQ.A0B(r14, r2)
            com.instagram.ui.widget.stackedavatar.StackedAvatarView r2 = r10.A02
            java.lang.Object r1 = r14.A02
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            java.lang.Object r0 = r14.A00
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r2.setUrls(r1, r0, r3)
            android.view.View r1 = r10.itemView
            r0 = 22
            X.WB9.A00(r1, r0, r10)
            com.instagram.igds.components.button.IgdsButton r2 = r10.A01
            r0 = 23
            X.WB9 r1 = new X.WB9
            r1.<init>((java.lang.Object) r10, (int) r0)
            goto L_0x0081
        L_0x00b4:
            X.UD8 r10 = (X.UD8) r10
            X.ToV r0 = r5.A04
            java.util.List r0 = r0.A00
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.follow.chaining.RecommendAccountsHeader"
            X.0qQ.A0C(r1, r0)
            X.PG7 r1 = (X.PG7) r1
            com.instagram.user.model.User r3 = r1.A00
            android.view.View r0 = r10.itemView
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131971409(0x7f134d51, float:1.9579797E38)
            java.lang.String r0 = r3.getUsername()
            android.text.Spanned r1 = X.DbU.A07(r2, r0, r1)
            X.0qQ.A07(r1)
            android.widget.TextView r0 = r10.A01
            r0.setText(r1)
            android.view.View r2 = r10.A00
            r0 = 35
            goto L_0x007c
        L_0x00e5:
            java.lang.IllegalStateException r0 = X.DbW.A0b(r1, r3)
            throw r0
        L_0x00ea:
            X.UE7 r10 = (X.UE7) r10
            X.ToV r0 = r5.A04
            java.util.List r0 = r0.A00
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.interestrecs.model.InterestRecommendationWrapper"
            X.0qQ.A0C(r1, r0)
            X.Vc5 r1 = (X.C17674Vc5) r1
            X.0iw r4 = r5.A07
            X.0qQ.A0B(r1, r2)
            com.instagram.model.hashtag.Hashtag r3 = r1.A00
            java.lang.String r8 = "Required value was null."
            if (r3 == 0) goto L_0x016b
            java.lang.String r7 = r1.A06
            java.lang.String r5 = r1.A05
            android.view.View r1 = r10.A00
            r0 = 33
            X.WBG.A01(r1, r0, r10, r3)
            com.instagram.common.typedurl.ImageUrl r0 = r3.Bh3()
            if (r0 == 0) goto L_0x0122
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r10.A04
            com.instagram.common.typedurl.ImageUrl r0 = r3.Bh3()
            if (r0 == 0) goto L_0x0165
            r1.setUrl(r0, r4)
        L_0x0122:
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r1 = r10.A07
            r0 = 2131239739(0x7f08233b, float:1.8095793E38)
            r1.setIconDrawable((int) r0)
            r1.setVisibility(r2)
            android.widget.TextView r0 = r10.A03
            r0.setText(r7)
            android.widget.TextView r1 = r10.A02
            boolean r0 = r1 instanceof com.instagram.common.ui.text.TightTextView
            if (r0 == 0) goto L_0x013d
            r0 = r1
            com.instagram.common.ui.text.TightTextView r0 = (com.instagram.common.ui.text.TightTextView) r0
            r0.A00 = r6
        L_0x013d:
            int r0 = r5.length()
            if (r0 != 0) goto L_0x015d
            r0 = 8
            r1.setVisibility(r0)
        L_0x0148:
            android.view.View r1 = r10.A01
            r0 = 34
            X.WBG.A01(r1, r0, r10, r3)
            com.instagram.hashtag.ui.HashtagFollowButton r1 = r10.A06
            r1.setVisibility(r2)
            X.WXf r0 = new X.WXf
            r0.<init>(r10, r2)
            r1.A01(r4, r0, r3)
            return
        L_0x015d:
            r0 = 2
            r1.setLines(r0)
            r1.setText(r5)
            goto L_0x0148
        L_0x0165:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x016b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x0171:
            boolean r0 = r14 instanceof com.instagram.user.model.User
            if (r0 == 0) goto L_0x01f5
            X.Toa r7 = r5.A0E
            if (r7 == 0) goto L_0x01dd
            X.ToV r9 = r5.A04
            r6 = r14
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            r0 = 1
            X.0qQ.A0B(r6, r0)
            java.util.List r4 = r9.A00
            int r3 = r4.size()
            r8 = 0
        L_0x0189:
            if (r8 >= r3) goto L_0x01f3
            java.lang.Object r2 = r4.get(r8)
            boolean r0 = r2 instanceof com.instagram.user.model.User
            if (r0 == 0) goto L_0x01f0
            java.lang.String r1 = r6.getId()
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.String r0 = r2.getId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01f0
        L_0x01a3:
            X.2oe r4 = r7.A01
            java.lang.String r0 = r6.getId()
            X.30Y r1 = r4.A00(r0)
            X.30Y r0 = X.AnonymousClass30Y.A07
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01cf
            java.lang.String r3 = r6.getId()
            X.0eP r2 = new X.0eP
            r2.<init>(r9, r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = r6.getId()
            X.30a r1 = X.AnonymousClass30Y.A00(r2, r1, r0)
            X.GAO r0 = r7.A02
            X.C13989Tnp.A1Q(r0, r1, r4, r3)
        L_0x01cf:
            android.view.View r2 = r10.itemView
            X.0qQ.A06(r2)
            X.2el r1 = r7.A00
            java.lang.String r0 = r6.getId()
            X.C13988Tno.A14(r2, r1, r4, r0)
        L_0x01dd:
            X.ToY r10 = (X.C14032ToY) r10
            com.instagram.user.model.User r13 = r5.A0B
            com.instagram.user.model.User r14 = (com.instagram.user.model.User) r14
        L_0x01e3:
            X.0iw r11 = r5.A07
            X.0xF r12 = r5.A01
            r0 = 1
            X.0qQ.A0B(r14, r0)
            r15 = 0
            r10.A00(r11, r12, r13, r14, r15)
            return
        L_0x01f0:
            int r8 = r8 + 1
            goto L_0x0189
        L_0x01f3:
            r8 = -1
            goto L_0x01a3
        L_0x01f5:
            boolean r0 = r14 instanceof X.C17674Vc5
            if (r0 == 0) goto L_0x0208
            X.ToY r10 = (X.C14032ToY) r10
            com.instagram.user.model.User r13 = r5.A0B
            X.Vc5 r14 = (X.C17674Vc5) r14
            com.instagram.user.model.User r14 = r14.A02
            if (r14 != 0) goto L_0x01e3
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0208:
            boolean r0 = r14 instanceof X.AnonymousClass3UL
            if (r0 == 0) goto L_0x0297
            X.Toa r7 = r5.A0E
            if (r7 == 0) goto L_0x027a
            X.ToV r9 = r5.A04
            r6 = r14
            X.3UL r6 = (X.AnonymousClass3UL) r6
            r0 = 1
            X.0qQ.A0B(r6, r0)
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x026a
            java.util.List r4 = r9.A00
            int r3 = r4.size()
            r8 = 0
        L_0x0224:
            if (r8 >= r3) goto L_0x0295
            java.lang.Object r2 = r4.get(r8)
            boolean r0 = r2 instanceof X.AnonymousClass3UL
            if (r0 == 0) goto L_0x0292
            java.lang.String r1 = r6.getId()
            X.3UL r2 = (X.AnonymousClass3UL) r2
            java.lang.String r0 = r2.getId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0292
        L_0x023e:
            X.2oe r4 = r7.A01
            java.lang.String r0 = r6.getId()
            X.30Y r1 = r4.A00(r0)
            X.30Y r0 = X.AnonymousClass30Y.A07
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x026a
            java.lang.String r3 = r6.getId()
            X.0eP r2 = new X.0eP
            r2.<init>(r9, r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = r6.getId()
            X.30a r1 = X.AnonymousClass30Y.A00(r2, r1, r0)
            X.GAU r0 = r7.A03
            X.C13989Tnp.A1Q(r0, r1, r4, r3)
        L_0x026a:
            android.view.View r3 = r10.itemView
            X.0qQ.A06(r3)
            X.2el r2 = r7.A00
            X.2oe r1 = r7.A01
            java.lang.String r0 = r6.getId()
            X.C13988Tno.A14(r3, r2, r1, r0)
        L_0x027a:
            X.ToY r10 = (X.C14032ToY) r10
            com.instagram.user.model.User r4 = r5.A0B
            X.3UL r14 = (X.AnonymousClass3UL) r14
            com.instagram.user.model.User r3 = r14.A03
            java.lang.String r2 = r14.A05
            X.0iw r1 = r5.A07
            X.0xF r0 = r5.A01
            r5 = r10
            r6 = r1
            r7 = r0
            r8 = r4
            r9 = r3
            r10 = r2
            r5.A00(r6, r7, r8, r9, r10)
            return
        L_0x0292:
            int r8 = r8 + 1
            goto L_0x0224
        L_0x0295:
            r8 = -1
            goto L_0x023e
        L_0x0297:
            if (r14 == 0) goto L_0x02a8
            java.lang.Class r0 = r14.getClass()
            if (r0 == 0) goto L_0x02a8
            java.lang.String r0 = r0.getCanonicalName()
        L_0x02a3:
            java.lang.IllegalStateException r0 = X.DbW.A0c(r1, r0)
            throw r0
        L_0x02a8:
            r0 = 0
            goto L_0x02a3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14031ToX.onBindViewHolder(X.3kE, int):void");
    }

    public C14031ToX(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r5, UserSession userSession, C14034Toa toa, User user, Runnable runnable) {
        this.A05 = context;
        this.A08 = userSession;
        this.A0B = user;
        this.A06 = fragmentActivity;
        this.A07 = r5;
        this.A0C = runnable;
        this.A0E = toa;
        this.A09 = AnonymousClass3BQ.SUGGESTED_USER_CHAINING;
        this.A0D = AnonymousClass7TG.A0j();
        if (fragmentActivity != null) {
            this.A0A = new AnonymousClass32A(r5, userSession, new C52437GSp(context, fragmentActivity));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1481282531);
        int size = this.A04.A00.size();
        AnonymousClass0fD.A0A(1701536777, A032);
        return size;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r5.A04.A00() == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemViewType(int r6) {
        /*
            r5 = this;
            r0 = 943861722(0x38422fda, float:4.629777E-5)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.ToV r0 = r5.A04
            java.util.List r0 = r0.A00
            java.lang.Object r3 = r0.get(r6)
            boolean r0 = r3 instanceof X.PG7
            r4 = 1
            r1 = 0
            if (r0 == 0) goto L_0x001d
            r4 = 2
        L_0x0016:
            r0 = -982291749(0xffffffffc5736adb, float:-3894.6785)
            X.AnonymousClass0fD.A0A(r0, r2)
            return r4
        L_0x001d:
            boolean r0 = r3 instanceof com.instagram.user.model.User
            if (r0 == 0) goto L_0x002c
            X.ToV r0 = r5.A04
            boolean r0 = r0.A00()
            r4 = 3
            if (r0 != 0) goto L_0x0016
        L_0x002a:
            r4 = 0
            goto L_0x0016
        L_0x002c:
            boolean r0 = r3 instanceof X.AnonymousClass3UL
            if (r0 != 0) goto L_0x002a
            boolean r0 = r3 instanceof X.C17674Vc5
            if (r0 == 0) goto L_0x0065
            X.Vc5 r3 = (X.C17674Vc5) r3
            java.lang.Integer r3 = X.C18214Vne.A00(r3)
            if (r3 == 0) goto L_0x005a
            int r0 = r3.intValue()
            if (r0 == r4) goto L_0x002a
            if (r0 == r1) goto L_0x0016
            java.lang.String r1 = "Invalid recommendationType "
            java.lang.String r0 = X.VEL.A00(r3)
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = -288190053(0xffffffffeed2919b, float:-3.258394E28)
        L_0x0056:
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        L_0x005a:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = 704529704(0x29fe4528, float:1.12918626E-13)
            goto L_0x0056
        L_0x0065:
            r0 = 30
            boolean r0 = X.N4R.A02(r0, r3)
            if (r0 == 0) goto L_0x006f
            r4 = 4
            goto L_0x0016
        L_0x006f:
            boolean r0 = r3 instanceof X.VNJ
            if (r0 == 0) goto L_0x0075
            r4 = 5
            goto L_0x0016
        L_0x0075:
            java.lang.String r1 = "FollowChainingAdapter does not currently process: "
            if (r3 == 0) goto L_0x0090
            java.lang.Class r0 = r3.getClass()
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = r0.getCanonicalName()
        L_0x0083:
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = -2046926489(0xffffffff85fe6167, float:-2.3921825E-35)
            goto L_0x0056
        L_0x0090:
            r0 = 0
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14031ToX.getItemViewType(int):int");
    }
}
