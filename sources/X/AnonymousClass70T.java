package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.ui.text.LinkTextView;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.70T  reason: invalid class name */
public final class AnonymousClass70T {
    public static final AnonymousClass70T A00 = new Object();

    public static final void A00(Context context, View view, TextView textView, UserSession userSession, C322506vw r14, LinkTextView linkTextView, AnonymousClass70J r16, User user, int i, int i2, boolean z, boolean z2, boolean z3) {
        Dda dda;
        C2366634p r0;
        List list;
        int i3;
        LinkTextView linkTextView2 = linkTextView;
        0qQ.A0B(linkTextView, 0);
        TextView textView2 = textView;
        0qQ.A0B(textView, 1);
        0qQ.A0B(view, 2);
        0qQ.A0B(r14, 8);
        User user2 = user;
        String A0O = user2.A0O();
        AnonymousClass70J r6 = r16;
        if (A0O == null || A0O.length() == 0) {
            linkTextView.setVisibility(8);
            textView.setVisibility(8);
            view.setVisibility(8);
            if (r16 != null && (dda = r6.A0B) != null && (r0 = dda.A03) != null) {
                r0.A05();
                return;
            }
            return;
        }
        C253503qt Afr = user2.A03.Afr();
        if (Afr != null) {
            list = Afr.B1p();
        } else {
            list = null;
        }
        Boolean BAg = user2.A03.BAg();
        boolean z4 = z;
        if (BAg == null || !BAg.booleanValue() || z) {
            textView2.setVisibility(8);
        } else {
            if (r14 == C322506vw.Translated) {
                A0O = user2.A03.C9W();
                if (A0O != null) {
                    list = null;
                    i3 = 2131973006;
                    if (z3) {
                        i3 = 2131973007;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                i3 = 2131973013;
                if (z3) {
                    i3 = 2131973014;
                }
            }
            textView2.setText(i3);
            textView2.setVisibility(0);
            AnonymousClass0fU.A00(new C320176rt(r6), textView2);
        }
        if (r14 == C322506vw.Loading) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        linkTextView.setVisibility(0);
        A00.A05(context, userSession, linkTextView2, r6, user2, A0O, list, i, i2, z4, z2);
    }

    public static final void A01(Context context, AnonymousClass0iw r22, UserSession userSession, C71662eb r24, AnonymousClass70J r25, User user, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        String category;
        int length;
        Object djO;
        C71662eb r20 = r24;
        0qQ.A0B(r20, 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        UserSession userSession2 = userSession;
        AnonymousClass70U r12 = new AnonymousClass70U(userSession2);
        0Tu r9 = 0Tu.A05;
        boolean A06 = 182.A06(r9, userSession2, 36327795463568080L);
        int i = R.attr.igds_color_link;
        if (A06) {
            i = R.attr.igds_color_secondary_text;
        }
        User user2 = user;
        Context context2 = context;
        AnonymousClass70J r2 = r25;
        String str2 = str;
        if (AnonymousClass3ZQ.A03(user2)) {
            String id = user2.getId();
            String C9f = user2.A03.C9f();
            if (C9f != null) {
                C8956RIv rIv = C8956RIv.PROFILE;
                AnonymousClass3ZQ.A02(context2, rIv, userSession2, id, C9f);
                String C9e = user2.A03.C9e();
                if (C9e != null) {
                    spannableStringBuilder.append(C9e);
                    spannableStringBuilder.setSpan(new C54488HFu(r2, user2, context2.getColor(2Yu.A0H(context2, i))), 0, spannableStringBuilder.length(), 17);
                    r12.A00(rIv, user2.getId(), user2.A03.C9f(), (String) null, false);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            String AXr = user2.A03.AXr();
            if (AXr != null && AXr.length() != 0) {
                String AXr2 = user2.A03.AXr();
                if (AXr2 != null) {
                    spannableStringBuilder.append(AXr2);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if ((2Ek.A00(user2) || 2Ek.A01(user2)) && user2.A1f() && (category = user2.A03.getCategory()) != null && category.length() != 0) {
                String category2 = user2.A03.getCategory();
                if (category2 != null) {
                    spannableStringBuilder.append(category2);
                    Boolean bool = true;
                    boolean equals = bool.equals(user2.A03.BuZ());
                    boolean equals2 = bool.equals(user2.A03.CQ4());
                    if (spannableStringBuilder.length() > 0 && equals && equals2 && 182.A06(r9, userSession2, 36321692313724565L)) {
                        spannableStringBuilder.setSpan(new AnonymousClass739(context2, r2, user2, i), 0, spannableStringBuilder.length(), 17);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if (str != null) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append(" • ");
                }
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append(str2);
                spannableStringBuilder.setSpan(new C46687DjG(context2, r2, user2), length2, spannableStringBuilder.length(), 17);
            }
            AnonymousClass0iw r21 = r22;
            if (z3) {
                String id2 = user2.getId();
                UserSession userSession3 = userSession2;
                AnonymousClass0iw r122 = r21;
                C319976rX.A06(r122, userSession3, GU2.A00(userSession2, user2.B6o(), user2.A0N(), id2), "business_social_proof_badge_impression", userSession2.A06, "user_profile_header");
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append(" • ");
                }
                length = spannableStringBuilder.length();
                String string = context2.getString(2131954372);
                0qQ.A07(string);
                spannableStringBuilder.append(string);
                djO = new C46695DjO(context2, r21, userSession2, user2);
            } else if (z4 && C271174i4.A01(userSession2)) {
                String pkId = user2.A03.getPkId();
                if (!(pkId == null || r25 == null)) {
                    View A01 = r20.A01();
                    0qQ.A07(A01);
                    C321586uQ r13 = r2.A0C;
                    C49508Ewn ewn = new C49508Ewn(r2.A03.A06, pkId);
                    2el r19 = r13.A01;
                    String A0u = 002.A0u("own_user_id_", ewn.A00, "_target_user_id_", ewn.A01);
                    AnonymousClass30Y r8 = AnonymousClass30Y.A07;
                    C2354830a r82 = new C2354830a(ewn, 0, A0u);
                    r82.A00(new FZT(r13.A00, r13.A02));
                    2el r7 = r19;
                    r7.A05(A01, r82.A01());
                }
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append(" • ");
                }
                length = spannableStringBuilder.length();
                spannableStringBuilder.append(context2.getString(2131956924));
                if (182.A06(r9, userSession2, 36318926354848510L) && (z || 182.A06(r9, userSession2, 36318926354914047L))) {
                    if (r25 != null && 182.A06(r9, userSession2, 36318926354979584L)) {
                        r2.A02().A0E(user2, true);
                    }
                    djO = new C46698DjR(context2, r21, userSession2, r2, user2);
                }
            }
            spannableStringBuilder.setSpan(djO, length, spannableStringBuilder.length(), 17);
        }
        if (spannableStringBuilder.length() > 0) {
            if (z2) {
                spannableStringBuilder.insert(0, " • ");
            }
            r20.A03(0);
            ((TextView) r20.A01()).setText(spannableStringBuilder);
            ((TextView) r20.A01()).setMovementMethod(LinkMovementMethod.getInstance());
            if (r25 != null && str != null) {
                C50672FgX A02 = r2.A02();
                View A012 = r20.A01();
                0qQ.A07(A012);
                UserDetailFragment userDetailFragment = A02.A04;
                userDetailFragment.A1L.A00(A012, QPTooltipAnchor.PROFILE_BOB_LABEL, userDetailFragment.A1I);
                return;
            }
            return;
        }
        r20.A03(8);
    }

    public static final void A02(Context context, C71662eb r9, AnonymousClass70J r10, User user) {
        0qQ.A0B(r9, 0);
        if (!user.isRestricted() || 1YZ.A02 == null) {
            r9.A03(8);
            return;
        }
        r9.A03(0);
        View A01 = r9.A01();
        0qQ.A07(A01);
        TextView textView = (TextView) A01;
        String string = context.getString(2131975971);
        0qQ.A07(string);
        String string2 = context.getString(2131972363, new Object[]{user.getUsername(), string});
        0qQ.A07(string2);
        C51392FtO ftO = new C51392FtO(r10, user);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        C389119ov r3 = new C389119ov(2Yu.A0F(context, R.attr.textColorBoldLink), ftO);
        int A08 = 00l.A08(string2, string, 0, false);
        int length = string.length() + A08;
        if (A08 >= 0 && A08 < length && length <= string2.length()) {
            spannableStringBuilder.setSpan(r3, A08, length, 33);
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static final void A03(AnonymousClass0iw r23, UserSession userSession, C71662eb r25, 1Xj r26, AnonymousClass70J r27, User user, String str, boolean z) {
        String title;
        C71662eb r0 = r25;
        0qQ.A0B(r0, 0);
        View A01 = r0.A01();
        0qQ.A07(A01);
        IgTextView requireViewById = A01.requireViewById(R.id.text_1);
        0qQ.A07(requireViewById);
        IgTextView igTextView = requireViewById;
        IgImageView requireViewById2 = A01.requireViewById(R.id.icon_1);
        0qQ.A07(requireViewById2);
        IgImageView igImageView = requireViewById2;
        IgTextView requireViewById3 = A01.requireViewById(R.id.text_2);
        0qQ.A07(requireViewById3);
        IgTextView igTextView2 = requireViewById3;
        IgImageView requireViewById4 = A01.requireViewById(R.id.icon_2);
        0qQ.A07(requireViewById4);
        IgImageView igImageView2 = requireViewById4;
        View requireViewById5 = A01.requireViewById(R.id.separator);
        0qQ.A07(requireViewById5);
        igTextView.setVisibility(8);
        igImageView.setVisibility(8);
        igTextView2.setVisibility(8);
        igImageView2.setVisibility(8);
        requireViewById5.setVisibility(8);
        User user2 = user;
        C242043Sk BcS = user2.A03.BcS();
        0Tu r13 = 0Tu.A05;
        UserSession userSession2 = userSession;
        AnonymousClass0iw r21 = r23;
        1Xj r12 = r26;
        AnonymousClass70J r11 = r27;
        boolean z2 = z;
        if (!182.A06(r13, userSession2, 36316796051001992L) || 182.A06(r13, userSession2, 36316796051198603L) || BcS == null || !(!BcS.BcT().isEmpty())) {
            A04(r21, userSession2, igTextView, igImageView, r12, r11, user2, z2, false);
        } else {
            List BcT = BcS.BcT();
            Context context = A01.getContext();
            if (BcT.size() > 1) {
                title = context.getString(2131969925, new Object[]{Integer.valueOf(BcT.size())});
                0qQ.A07(title);
                igTextView.setTextColor(context.getColor(2Yu.A07(context)));
                igImageView.setColorFilter(context.getColor(2Yu.A07(context)));
                0oh.A07(context, Typeface.defaultFromStyle(1), igTextView, AnonymousClass05K.A01);
            } else {
                title = ((C2609247o) BcT.get(0)).getTitle();
                igTextView.setTextColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_link)));
                igImageView.setColorFilter(context.getColor(2Yu.A0H(context, R.attr.igds_color_link)));
                0oh.A07(context, Typeface.defaultFromStyle(0), igTextView, AnonymousClass05K.A00);
            }
            igTextView.setText(title);
            igTextView.setVisibility(0);
            igImageView.setVisibility(0);
            igImageView.setImageResource(R.drawable.instagram_channels_pano_outline_24);
            AnonymousClass0fU.A00(new C50082FNx(r21, r12, r11, BcT), igTextView);
            IgTextView igTextView3 = igTextView2;
            IgImageView igImageView3 = igImageView2;
            AnonymousClass0iw r122 = r21;
            UserSession userSession3 = userSession2;
            boolean A04 = A04(r122, userSession3, igTextView3, igImageView3, r12, r11, user2, z2, !BcT.isEmpty());
            View requireViewById6 = A01.requireViewById(R.id.button_2);
            0qQ.A07(requireViewById6);
            A01.setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material), 0, 0);
            if (A04) {
                requireViewById6.setVisibility(0);
                requireViewById5.setVisibility(0);
            } else {
                requireViewById6.setVisibility(8);
                requireViewById5.setVisibility(8);
            }
        }
        if (r11 != null && "profile_bio_user_deep_link_add_fb_link".equals(str)) {
            C50672FgX A02 = r11.A02();
            UserSession userSession4 = A02.A02;
            0xa r4 = 1Au.A00(userSession4).A01;
            if (r4.getBoolean("should_add_fb_biolink_from_deeplink", false)) {
                C48920EmK.A00().A01(A02.A04, userSession4, new C51131Fp3(A01, A02)).A06("fb_profile_link_biolink_delegate", (List) null);
                0xY AR4 = r4.AR4();
                AR4.E5T("should_add_fb_biolink_from_deeplink", false);
                AR4.apply();
            }
        }
    }

    public final void A05(Context context, UserSession userSession, LinkTextView linkTextView, AnonymousClass70J r25, User user, String str, List list, int i, int i2, boolean z, boolean z2) {
        SpannableStringBuilder spannableStringBuilder;
        Dda dda;
        C2366634p r3;
        LinkTextView linkTextView2 = linkTextView;
        0qQ.A0B(linkTextView2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        Context context2 = context;
        AnonymousClass70J r4 = r25;
        User user2 = user;
        String str2 = str;
        List list2 = list;
        boolean z3 = z;
        if (z2) {
            C318726pQ.A01(context2, spannableStringBuilder, userSession2, new C318706pO(r4, user2, z3), list2);
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
            Resources resources = context2.getResources();
            TextPaint textPaint = new TextPaint(1);
            textPaint.density = resources.getDisplayMetrics().density;
            textPaint.linkColor = 2Yu.A0F(context2, R.attr.igds_color_link);
            textPaint.setTextSize(linkTextView2.getTextSize());
            textPaint.setColor(context2.getColor(2Yu.A0H(context2, R.attr.igds_color_primary_text)));
            String A0T = 002.A0T(resources.getString(2131961564), resources.getString(2131954763), ' ');
            CharSequence A01 = C252993q2.A01(new 0rN(Layout.Alignment.ALIGN_NORMAL, textPaint, (String) null, 0.0f, linkTextView2.getLineSpacingMultiplier(), i, false), "", str2, A0T, i2, false);
            0qQ.A07(A01);
            spannableStringBuilder.append(A01);
            C318726pQ.A01(context2, spannableStringBuilder, userSession2, new C318706pO(r4, user2, z3), list2);
            if (!A01.equals(str2)) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append(A0T);
                AnonymousClass0fU.A00(new AnonymousClass70V(r4, user2), linkTextView2);
                spannableStringBuilder.setSpan(new AnonymousClass70W(r4, user2, context2.getColor(2Yu.A0H(context2, R.attr.igds_color_secondary_text))), length, spannableStringBuilder.length(), 33);
            }
        }
        linkTextView2.setText(spannableStringBuilder);
        if (r25 != null && (dda = r4.A0B) != null && (r3 = dda.A03) != null) {
            r3.A01.A0K("is_bio_visible", true);
            r3.A05();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.instagram.common.ui.base.IgTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.instagram.common.ui.base.IgTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.instagram.common.ui.base.IgTextView} */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.view.View$OnClickListener] */
    /* JADX WARNING: type inference failed for: r17v5, types: [X.FOI] */
    /* JADX WARNING: type inference failed for: r17v6, types: [X.737] */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x030d, code lost:
        if (X.182.A06(X.0Tu.A06, r7, 36322821890451921L) == false) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0372, code lost:
        if (r15.size() != 1) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x037e, code lost:
        if (r15.size() != 1) goto L_0x0380;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x038a, code lost:
        if (r15.size() != 1) goto L_0x038c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0100, code lost:
        if (X.C46427Deo.A02(r7, r4) == false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0124, code lost:
        if (r18 != false) goto L_0x0126;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A04(X.AnonymousClass0iw r21, com.instagram.common.session.UserSession r22, com.instagram.common.ui.base.IgTextView r23, com.instagram.common.ui.widget.imageview.IgImageView r24, X.1Xj r25, X.AnonymousClass70J r26, com.instagram.user.model.User r27, boolean r28, boolean r29) {
        /*
            r5 = r24
            r3 = 0
            r2 = 1
            r6 = r23
            android.content.Context r1 = r6.getContext()
            r4 = r27
            X.4Cl r0 = r4.A03
            com.instagram.api.schemas.IGAIAgentType r8 = r0.AaX()
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A05
            r7 = r22
            if (r8 != r0) goto L_0x0050
            X.0qQ.A0A(r1)
            X.1ps r4 = X.AnonymousClass9B9.A00()
            r0 = 2131952576(0x7f1303c0, float:1.9541599E38)
            r6.setText(r0)
            int r0 = X.2Yu.A06(r1)
            int r0 = r1.getColor(r0)
            r6.setTextColor(r0)
            r6.setVisibility(r3)
            int r0 = X.2Yu.A07(r1)
            int r0 = r1.getColor(r0)
            r5.setColorFilter(r0)
            r0 = 2131238496(0x7f081e60, float:1.8093272E38)
            r5.setImageResource(r0)
            r5.setVisibility(r3)
            X.FNN r0 = new X.FNN
            r0.<init>(r1, r7, r4)
            X.AnonymousClass0fU.A00(r0, r6)
            return r2
        L_0x0050:
            X.4Cl r0 = r4.A03
            java.util.List r0 = r0.Afp()
            r8 = r21
            r21 = r25
            r22 = r26
            if (r0 == 0) goto L_0x0294
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0294
            X.736 r20 = X.AnonymousClass736.A00
            r9 = 6
            r0 = r20
            X.0qQ.A0B(r0, r9)
            X.4Cl r0 = r4.A03
            java.util.List r9 = r0.Afp()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            if (r9 == 0) goto L_0x00ce
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00ce
            java.util.Iterator r11 = r9.iterator()
        L_0x0083:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r10 = r11.next()
            X.3qn r10 = (X.C253443qn) r10
            if (r10 != 0) goto L_0x00a7
            X.0wj r10 = X.0wj.A01
            r9 = 817904625(0x30c03bf1, float:1.3986875E-9)
            java.lang.String r0 = "MultipleLinksHeaderUtil"
            X.0f9 r10 = r10.AEf(r0, r9)
            java.lang.String r9 = "null_biolink"
            java.lang.String r0 = "unexpected null for user biolink"
            r10.ABQ(r9, r0)
            r10.report()
            goto L_0x0083
        L_0x00a7:
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r9 = r10.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK_GROUP
            if (r9 == r0) goto L_0x0083
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r9 = r10.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK
            if (r9 != r0) goto L_0x00c1
            boolean r0 = X.C3250170s.A00(r10, r7, r4)
        L_0x00bb:
            if (r0 == 0) goto L_0x0083
        L_0x00bd:
            r15.add(r10)
            goto L_0x0083
        L_0x00c1:
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r9 = r10.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK_PAGE
            if (r9 != r0) goto L_0x00bd
            boolean r0 = X.C46427Deo.A02(r7, r4)
            goto L_0x00bb
        L_0x00ce:
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x021f
            boolean r0 = X.C323926yK.A02(r7, r4)
            if (r0 != 0) goto L_0x021f
            java.lang.Object r0 = X.00k.A0I(r15)
            X.3qn r0 = (X.C253443qn) r0
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = r0.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r12 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK
            r19 = 0
            if (r0 != r12) goto L_0x00ec
            r19 = 1
        L_0x00ec:
            java.lang.Object r0 = X.00k.A0I(r15)
            X.3qn r0 = (X.C253443qn) r0
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = r0.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r9 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK_PAGE
            if (r0 != r9) goto L_0x0102
            boolean r0 = X.C46427Deo.A02(r7, r4)
            r18 = 1
            if (r0 != 0) goto L_0x0104
        L_0x0102:
            r18 = 0
        L_0x0104:
            java.lang.Object r0 = X.00k.A0I(r15)
            X.3qn r0 = (X.C253443qn) r0
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r10 = r0.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.EXTERNAL
            r17 = 0
            if (r10 != r0) goto L_0x0116
            r17 = 1
        L_0x0116:
            X.4Cl r0 = r4.A03
            X.3rB r11 = r0.BMx()
            X.0qQ.A07(r1)
            if (r19 != 0) goto L_0x0126
            r0 = 2131238496(0x7f081e60, float:1.8093272E38)
            if (r18 == 0) goto L_0x0129
        L_0x0126:
            r0 = 2131238293(0x7f081d95, float:1.809286E38)
        L_0x0129:
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r5.setImageDrawable(r0)
            r5.setVisibility(r3)
            android.view.ViewGroup$LayoutParams r10 = r5.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r10, r0)
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            r10.leftMargin = r3
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = ""
        L_0x0148:
            int r10 = r0.length()
            if (r10 != 0) goto L_0x0226
            r5 = r6
        L_0x014f:
            android.view.View r5 = (android.view.View) r5
            r0 = 8
            r5.setVisibility(r0)
            return r3
        L_0x0157:
            if (r19 == 0) goto L_0x0189
            r0 = 2131970023(0x7f1347e7, float:1.9576985E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0160:
            X.0qQ.A0A(r0)
            int r10 = r15.size()
            if (r10 != r2) goto L_0x01bf
            int r10 = r0.length()
            r14 = 38
            if (r10 <= r14) goto L_0x0148
            X.0Tu r13 = X.0Tu.A05
            r10 = 36320120355758105(0x8108f500012019, double:3.03232859014275E-306)
            boolean r10 = X.182.A06(r13, r7, r10)
            if (r10 == 0) goto L_0x0148
            java.lang.String r10 = X.00R.A03(r0, r14)
            r0 = 8230(0x2026, float:1.1533E-41)
            java.lang.String r0 = X.002.A0C(r10, r0)
            goto L_0x0148
        L_0x0189:
            if (r18 == 0) goto L_0x01a4
            if (r11 == 0) goto L_0x0199
            X.5Bm r0 = r11.BMy()
            if (r0 == 0) goto L_0x0199
            java.lang.String r0 = r0.getName()
            if (r0 != 0) goto L_0x0160
        L_0x0199:
            r0 = 2131970022(0x7f1347e6, float:1.9576983E38)
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
            goto L_0x0160
        L_0x01a4:
            java.lang.Object r0 = X.00k.A0I(r15)
            X.3qn r0 = (X.C253443qn) r0
            java.lang.String r11 = r0.getUrl()
            X.0qQ.A0B(r11, r3)
            java.lang.String r0 = "^https?://"
            X.11S r10 = new X.11S
            r10.<init>(r0)
            java.lang.String r0 = ""
            java.lang.String r0 = r10.A01(r11, r0)
            goto L_0x0160
        L_0x01bf:
            if (r29 == 0) goto L_0x01d9
            r10 = 2131970033(0x7f1347f1, float:1.9577006E38)
            int r0 = r15.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r1.getString(r10, r0)
            X.0qQ.A07(r0)
            goto L_0x0148
        L_0x01d9:
            int r10 = r0.length()
            r14 = 25
            if (r10 <= r14) goto L_0x01f8
            X.0Tu r13 = X.0Tu.A05
            r10 = 36320120355758105(0x8108f500012019, double:3.03232859014275E-306)
            boolean r10 = X.182.A06(r13, r7, r10)
            if (r10 == 0) goto L_0x01f8
            java.lang.String r10 = X.00R.A03(r0, r14)
            r0 = 8230(0x2026, float:1.1533E-41)
            java.lang.String r0 = X.002.A0C(r10, r0)
        L_0x01f8:
            r13 = 2131820895(0x7f11015f, float:1.9274518E38)
            if (r19 == 0) goto L_0x0200
            r13 = 2131820894(0x7f11015e, float:1.9274516E38)
        L_0x0200:
            int r11 = r15.size()
            int r11 = r11 - r2
            r10 = 2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r14 = new java.lang.Object[]{r0, r14}
            android.content.res.Resources r0 = r1.getResources()
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r14, r10)
            java.lang.String r0 = r0.getQuantityString(r13, r11, r10)
            X.0qQ.A0A(r0)
            goto L_0x0148
        L_0x021f:
            r0 = 8
            r6.setVisibility(r0)
            goto L_0x014f
        L_0x0226:
            r6.setVisibility(r3)
            if (r25 == 0) goto L_0x0237
            boolean r10 = r8 instanceof X.AnonymousClass4DU
            if (r10 == 0) goto L_0x0237
            r11 = r8
            X.4DU r11 = (X.AnonymousClass4DU) r11
            r10 = r21
            X.C267154b3.A01(r6, r7, r10, r11, r3)
        L_0x0237:
            if (r28 != 0) goto L_0x035d
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.util.Iterator r16 = r15.iterator()
        L_0x0242:
            boolean r10 = r16.hasNext()
            if (r10 == 0) goto L_0x02ea
            java.lang.Object r10 = r16.next()
            X.3qn r10 = (X.C253443qn) r10
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r13 = r10.BMt()
            if (r13 == r9) goto L_0x025a
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r13 = r10.BMt()
            if (r13 != r12) goto L_0x027d
        L_0x025a:
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r13 = r10.BMt()
            if (r13 != r9) goto L_0x0291
            X.De0 r25 = X.De0.FACEBOOK_PAGE
        L_0x0262:
            java.lang.String r27 = r4.getId()
            X.4Cl r13 = r4.A03
            X.3rB r13 = r13.BMx()
            r28 = 0
            if (r13 == 0) goto L_0x0272
            r28 = 1
        L_0x0272:
            r23 = r20
            r24 = r1
            r26 = r7
            r29 = r3
            r23.A0A(r24, r25, r26, r27, r28, r29)
        L_0x027d:
            java.lang.String r13 = "has_"
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r10 = r10.BMt()
            java.lang.String r14 = r10.A00
            java.lang.String r10 = "_link"
            java.lang.String r13 = X.002.A0g(r13, r14, r10)
            java.lang.String r10 = "1"
            r11.put(r13, r10)
            goto L_0x0242
        L_0x0291:
            X.De0 r25 = X.De0.FACEBOOK
            goto L_0x0262
        L_0x0294:
            r2 = 8
            X.4Cl r0 = r4.A03
            java.lang.String r0 = r0.getExternalUrl()
            if (r0 == 0) goto L_0x0404
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0404
            X.4Cl r0 = r4.A03
            java.lang.String r5 = r0.getExternalUrl()
            if (r5 == 0) goto L_0x03ce
            int r0 = r5.length()
            if (r0 == 0) goto L_0x03ce
            boolean r0 = X.C323926yK.A02(r7, r4)
            if (r0 != 0) goto L_0x03ce
            java.lang.String r0 = "^https?://"
            X.11S r2 = new X.11S
            r2.<init>(r0)
            java.lang.String r0 = ""
            java.lang.String r0 = r2.A01(r5, r0)
            r6.setText(r0)
            r6.setVisibility(r3)
            r0 = 2130970246(0x7f040686, float:1.7549197E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = r1.getColor(r0)
            r6.setTextColor(r0)
            X.FOI r0 = new X.FOI
            r23 = r4
            r17 = r0
            r18 = r6
            r19 = r8
            r20 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23)
            goto L_0x03ca
        L_0x02ea:
            int r14 = r15.size()
            java.lang.String r12 = r4.getId()
            X.4Cl r9 = r4.A03
            java.lang.Boolean r9 = r9.CS7()
            if (r9 == 0) goto L_0x030f
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x030f
            X.0Tu r13 = X.0Tu.A06
            r9 = 36322821890451921(0x810b6a000529d1, double:3.0340370515613266E-306)
            boolean r9 = X.182.A06(r13, r7, r9)
            r16 = 1
            if (r9 != 0) goto L_0x0311
        L_0x030f:
            r16 = 0
        L_0x0311:
            X.0wc r13 = X.AnonymousClass0kN.A01(r8, r7)
            java.lang.String r10 = "multiple_links_viewed_in_bio"
            X.0kJ r9 = r13.A00
            X.0Aj r13 = r13.A00(r9, r10)
            boolean r9 = r13.isSampled()
            if (r9 == 0) goto L_0x035d
            java.lang.String r10 = r8.getModuleName()
            java.lang.String r9 = "container_module"
            r13.AAJ(r9, r10)
            X.1QJ r9 = X.AnonymousClass1QI.A00
            X.1QM r9 = r9.A02
            java.lang.String r10 = r9.A00
            java.lang.String r9 = "nav_chain"
            r13.AAJ(r9, r10)
            long r9 = (long) r14
            java.lang.Long r10 = java.lang.Long.valueOf(r9)
            java.lang.String r9 = "num_of_link"
            r13.A9F(r9, r10)
            r9 = 10
            java.lang.Long r10 = X.00y.A0n(r9, r12)
            java.lang.String r9 = "profile_owner_id"
            r13.A9F(r9, r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r16)
            java.lang.String r9 = "is_enhanced"
            r13.A7p(r9, r10)
            java.lang.String r9 = "extra_data_map"
            r13.A9H(r9, r11)
            r13.Cgf()
        L_0x035d:
            X.0Tu r11 = X.0Tu.A05
            r9 = 36320120357199911(0x8108f500172027, double:3.032328591054554E-306)
            boolean r9 = X.182.A06(r11, r7, r9)
            r10 = r9 ^ 1
            if (r19 == 0) goto L_0x0374
            int r9 = r15.size()
            r26 = 1
            if (r9 == r2) goto L_0x0376
        L_0x0374:
            r26 = 0
        L_0x0376:
            if (r18 == 0) goto L_0x0380
            int r9 = r15.size()
            r27 = 1
            if (r9 == r2) goto L_0x0382
        L_0x0380:
            r27 = 0
        L_0x0382:
            if (r17 == 0) goto L_0x038c
            int r9 = r15.size()
            r28 = 1
            if (r9 == r2) goto L_0x03cf
        L_0x038c:
            r28 = 0
            if (r26 == 0) goto L_0x0392
            if (r10 != 0) goto L_0x03cf
        L_0x0392:
            if (r27 != 0) goto L_0x03cf
            r9 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r3 = X.2Yu.A0H(r1, r9)
            int r3 = r1.getColor(r3)
            r6.setTextColor(r3)
            int r3 = X.2Yu.A0H(r1, r9)
            int r1 = r1.getColor(r3)
            r5.setColorFilter(r1)
            android.graphics.Typeface r1 = android.graphics.Typeface.defaultFromStyle(r2)
            r6.setTypeface(r1)
        L_0x03b4:
            r6.setText(r0)
            X.737 r0 = new X.737
            r23 = r20
            r24 = r4
            r25 = r15
            r17 = r0
            r18 = r6
            r19 = r8
            r20 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x03ca:
            X.AnonymousClass0fU.A00(r0, r6)
            r3 = 1
        L_0x03ce:
            return r3
        L_0x03cf:
            r9 = 2130970246(0x7f040686, float:1.7549197E38)
            int r2 = X.2Yu.A0H(r1, r9)
            int r2 = r1.getColor(r2)
            r6.setTextColor(r2)
            int r2 = X.2Yu.A0H(r1, r9)
            int r2 = r1.getColor(r2)
            r5.setColorFilter(r2)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            android.graphics.Typeface r2 = android.graphics.Typeface.defaultFromStyle(r3)
            X.0oh.A07(r1, r2, r6, r5)
            if (r26 == 0) goto L_0x03fa
            java.lang.String r1 = r4.getId()
            X.AnonymousClass736.A06(r8, r7, r1)
        L_0x03fa:
            if (r27 == 0) goto L_0x03b4
            java.lang.String r1 = r4.getId()
            X.AnonymousClass736.A06(r8, r7, r1)
            goto L_0x03b4
        L_0x0404:
            r6.setVisibility(r2)
            r5.setVisibility(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70T.A04(X.0iw, com.instagram.common.session.UserSession, com.instagram.common.ui.base.IgTextView, com.instagram.common.ui.widget.imageview.IgImageView, X.1Xj, X.70J, com.instagram.user.model.User, boolean, boolean):boolean");
    }
}
