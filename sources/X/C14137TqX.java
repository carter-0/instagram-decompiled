package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.TqX  reason: case insensitive filesystem */
public final class C14137TqX extends C14138TqY implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SingleSearchTypeaheadTabFragment";
    public int A00;
    public long A01 = 750;
    public 2da A02;
    public Dc2 A03;
    public C52570GXv A04;
    public AnimatedHintsTextLayout A05;
    public SearchEditText A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A = "";
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P = true;
    public C14440TwO A0Q;
    public Boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final C14469Twr A0a = new C14469Twr();
    public final C14137TqX A0b = this;
    public final C14450TwY A0c = new C14450TwY(this);
    public final Integer A0d = AnonymousClass05K.A00;
    public final String A0e = "search_top";
    public final AnonymousClass0eM A0f = C13998To0.A01(this, 6);
    public final AnonymousClass0eM A0g = C13998To0.A01(this, 7);
    public final AnonymousClass0eM A0h = C13998To0.A01(this, 8);
    public final AnonymousClass0eM A0i = C13998To0.A01(this, 9);
    public final AnonymousClass0eM A0j = C13998To0.A01(this, 10);
    public final PRO A0k = new PRO(this, 0);
    public final PRP A0l = new PRP(this, 3);
    public final C252213ok A0m = new WTW(this, 6);

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r27) {
        /*
            r26 = this;
            r8 = 0
            r1 = r27
            X.0qQ.A0B(r1, r8)
            r13 = 1
            r1.Eu4(r13)
            r2 = r26
            boolean r0 = r2.A0O
            if (r0 == 0) goto L_0x00c8
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r7 = r2.A05
            if (r7 == 0) goto L_0x009d
            boolean r0 = r2.A0F
            X.Vzf r6 = X.C18745Vzf.A00
            if (r0 == 0) goto L_0x00bb
            boolean r12 = r2.A0I
            boolean r14 = r2.A0G
            boolean r15 = r2.A0L
            boolean r3 = r2.A0K
            int r9 = r2.A00
            r10 = 0
            boolean r0 = r2.A0H
            r16 = r3
            r17 = r0
            r6.A01(r7, r8, r9, r10, r12, r13, r14, r15, r16, r17)
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r2.A00(r7)
        L_0x0033:
            r7.setVisibility(r8)
            java.lang.String r0 = ""
            r1.setTitle(r0)
        L_0x003b:
            if (r4 == 0) goto L_0x009d
            java.lang.String r0 = r2.A0A
            X.PRP r3 = r2.A0l
            X.AnonymousClass7TF.A1B(r0, r13, r3)
            r4.setSearchIconEnabled(r8)
            r4.setText(r0)
            int r0 = r0.length()
            r4.setSelection(r0)
            r4.A0C = r3
            r4.setSearchIconEnabled(r13)
            r2.A0K()
            boolean r0 = r2.A0P
            if (r0 == 0) goto L_0x0081
            X.0eM r0 = r2.A0t
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Twx r0 = X.C14139TqZ.A00(r0)
            X.Tx0 r7 = X.C14478Tx0.A03
            X.1QP r6 = r0.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A1I
            java.lang.String r3 = "typeahead"
            java.lang.String r0 = "search_bar_typeahead"
            long r5 = r6.A00(r5, r3, r0)
            r7.A00 = r5
            r4.requestFocus()
            X.0nA.A0Q(r4)
            r2.A0P = r8
        L_0x0081:
            boolean r0 = r2.A0L
            if (r0 == 0) goto L_0x008c
            X.WfB r0 = new X.WfB
            r0.<init>(r2)
            r4.A0A = r0
        L_0x008c:
            X.0eM r0 = r2.A0t
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.4v0 r0 = X.AnonymousClass4v0.A00(r0)
            r4.addTextChangedListener(r0)
            r2.A06 = r4
        L_0x009d:
            com.instagram.ui.widget.searchedittext.SearchEditText r6 = r2.A06
            if (r6 == 0) goto L_0x019b
            X.0eM r0 = r2.A0r
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x019b
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x019b
            X.GXv r5 = r2.A04
            if (r5 != 0) goto L_0x0142
            java.lang.String r0 = "metaSearchViewpointHelper"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00bb:
            android.content.Context r0 = r2.requireContext()
            X.C18745Vzf.A00(r0, r7)
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r2.A01(r7)
            goto L_0x0033
        L_0x00c8:
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x0107
            boolean r7 = r2.A0I
            boolean r6 = r2.A0G
            int r5 = r2.A00
            r17 = 0
            boolean r4 = r2.A0L
            boolean r3 = r2.A0K
            boolean r0 = r2.A0H
            r14 = r1
            r15 = r8
            r16 = r5
            r19 = r8
            r20 = r7
            r21 = r13
            r22 = r6
            r23 = r4
            r24 = r3
            r25 = r0
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r0 = r14.ErP(r15, r16, r17, r19, r20, r21, r22, r23, r24, r25)
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r2.A00(r0)
        L_0x00f4:
            X.TwE r3 = r2.A06
            if (r3 == 0) goto L_0x003b
            r3.configureActionBar(r1)
            X.TwZ r0 = new X.TwZ
            r0.<init>(r2)
            r3.A01 = r0
            X.TwE.A00(r3)
            goto L_0x003b
        L_0x0107:
            X.0eM r0 = r2.A0t
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            android.content.Context r4 = r2.requireContext()
            X.0qQ.A0B(r0, r8)
            java.util.LinkedHashMap r0 = X.C67422Mnd.A00(r4, r0)
            java.util.Set r0 = r0.keySet()
            java.util.List r3 = X.00k.A0a(r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0133
            r0 = 2131972815(0x7f1352cf, float:1.9582648E38)
            java.lang.String r0 = r4.getString(r0)
            java.util.List r3 = X.AnonymousClass7TE.A1I(r0)
        L_0x0133:
            r0 = r1
            X.2dZ r0 = (X.2dZ) r0
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r0 = r0.A0S(r8)
            r0.setHints(r3)
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r2.A01(r0)
            goto L_0x00f4
        L_0x0142:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            java.lang.String r3 = r2.A09
            if (r3 == 0) goto L_0x019f
            java.lang.String r0 = r6.getSearchString()
            r5.A00(r6, r4, r3, r0)
            X.Wf9 r0 = new X.Wf9
            r0.<init>(r2, r6)
            r6.A08 = r0
            boolean r0 = r2.A0E
            if (r0 != 0) goto L_0x015e
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x019b
        L_0x015e:
            r2.A02 = r1
            android.content.Context r5 = r2.requireContext()
            r0 = 36
            X.WBD r4 = new X.WBD
            r4.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r6)
            boolean r3 = r2.A0N
            r0 = 2131238746(0x7f081f5a, float:1.809378E38)
            if (r3 == 0) goto L_0x0175
            r0 = 2131238754(0x7f081f62, float:1.8093796E38)
        L_0x0175:
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            X.3JR r3 = new X.3JR
            r3.<init>()
            r3.A0F = r0
            r0 = 2131972797(0x7f1352bd, float:1.9582612E38)
            r3.A05 = r0
            r3.A0G = r4
            r3.A0O = r8
            r0 = 17
            r3.A09 = r0
            android.view.View r1 = X.C51970G9q.A0P(r3, r1)
            r0 = 8
            float r0 = X.0nA.A04(r5, r0)
            int r0 = (int) r0
            X.0nA.A0b(r1, r0)
        L_0x019b:
            A02(r2)
            return
        L_0x019f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14137TqX.configureActionBar(X.2da):void");
    }

    public final String getModuleName() {
        return "search_typeahead";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A0M && (this.A0F || this.A0T)) {
            UserSession A0L2 = C13988Tno.A0L(this);
            0Tu r3 = 0Tu.A05;
            if (!182.A06(r3, A0L2, 36328044571605911L) && !182.A06(r3, C13988Tno.A0L(this), 36320438185632202L)) {
                C49951FGg.A04(requireContext(), (UserSession) this.A0t.getValue(), new WVH(this));
            }
        }
        if (this.A0O) {
            View A0F2 = DbY.A0F(view, R.id.layout_typeahead_bottom_searchbar);
            0qQ.A0C(A0F2, "null cannot be cast to non-null type com.instagram.ui.widget.edittext.AnimatedHintsTextLayout");
            this.A05 = (AnimatedHintsTextLayout) A0F2;
        }
    }

    private final SearchEditText A01(AnimatedHintsTextLayout animatedHintsTextLayout) {
        AnonymousClass0eM r2 = this.A0t;
        LinkedHashMap A002 = C67422Mnd.A00(requireContext(), (UserSession) r2.getValue());
        ((C14444TwS) this.A0g.getValue()).A05.putAll(A002);
        this.A05 = animatedHintsTextLayout;
        animatedHintsTextLayout.A0A = new C14485Tx7(this, A002);
        UserSession userSession = (UserSession) r2.getValue();
        Context requireContext = requireContext();
        0qQ.A0B(userSession, 0);
        List A0a2 = 00k.A0a(C67422Mnd.A00(requireContext, userSession).keySet());
        if (A0a2.isEmpty()) {
            A0a2 = AnonymousClass7TE.A1I(requireContext.getString(2131972815));
        }
        animatedHintsTextLayout.setHints(A0a2);
        EditText editText = animatedHintsTextLayout.getEditText();
        0qQ.A0C(editText, "null cannot be cast to non-null type com.instagram.ui.widget.searchedittext.SearchEditText");
        return (SearchEditText) editText;
    }

    public static final void A02(C14137TqX tqX) {
        boolean z;
        int i;
        SearchEditText searchEditText = tqX.A06;
        if (searchEditText != null) {
            boolean z2 = true;
            if (tqX.A0F) {
                searchEditText.A08(true);
                z = true;
            } else {
                z = false;
            }
            if (!AnonymousClass7TF.A1Z(tqX.A0r) || !tqX.A0M) {
                if (tqX.A0A.length() <= 0) {
                    z2 = false;
                }
                searchEditText.setClearButtonEnabled(z2);
                z2 = z;
            } else if (tqX.A0W || tqX.A0E) {
                searchEditText.A0P = false;
                SearchEditText.A02(searchEditText, false, false);
                SearchEditText.A01(searchEditText);
                searchEditText.setMetaAIClearButtonEnabled(true);
            } else {
                if (tqX.A0B) {
                    searchEditText.A0P = false;
                    SearchEditText.A02(searchEditText, false, false);
                } else {
                    boolean z3 = tqX.A0V;
                    boolean z4 = tqX.A0N;
                    if (z3) {
                        searchEditText.A0O = true;
                        SearchEditText.A02(searchEditText, true, z4);
                        LayerDrawable layerDrawable = searchEditText.A04;
                        if (layerDrawable == null) {
                            layerDrawable = SearchEditText.A00(searchEditText, false);
                            searchEditText.A04 = layerDrawable;
                        }
                        Drawable drawable = searchEditText.A00;
                        Drawable drawable2 = searchEditText.A02;
                        if (!(drawable2 == null || drawable == null || layerDrawable == null)) {
                            int intrinsicWidth = drawable2.getIntrinsicWidth() + drawable.getIntrinsicWidth() + AnonymousClass7TE.A0F(searchEditText.getResources());
                            int intrinsicHeight = drawable2.getIntrinsicHeight();
                            if (searchEditText.getSearchString().length() == 0) {
                                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), intrinsicHeight);
                            } else {
                                layerDrawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                            }
                        }
                        LayerDrawable layerDrawable2 = searchEditText.A03;
                        if (layerDrawable2 == null) {
                            layerDrawable2 = SearchEditText.A00(searchEditText, true);
                            searchEditText.A03 = layerDrawable2;
                        }
                        Drawable drawable3 = searchEditText.A01;
                        if (!(drawable3 == null || drawable == null || layerDrawable2 == null)) {
                            int intrinsicWidth2 = drawable3.getIntrinsicWidth() + drawable.getIntrinsicWidth() + AnonymousClass7TE.A0F(searchEditText.getResources());
                            int intrinsicHeight2 = drawable3.getIntrinsicHeight();
                            if (searchEditText.getSearchString().length() == 0) {
                                drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), intrinsicHeight2);
                            } else {
                                layerDrawable2.setBounds(0, 0, intrinsicWidth2, intrinsicHeight2);
                            }
                        }
                    } else {
                        searchEditText.A0P = true;
                        SearchEditText.A02(searchEditText, true, z4);
                    }
                }
                SearchEditText.A01(searchEditText);
                searchEditText.setMetaAIClearButtonEnabled(false);
            }
            searchEditText.A0B = tqX.A0k;
            if (z2) {
                if (tqX.A0E || tqX.A0B) {
                    Context requireContext = tqX.requireContext();
                    2dZ r6 = tqX.A02;
                    boolean z5 = tqX.A0S;
                    WBD wbd = new WBD(37, (Object) tqX, (Object) searchEditText);
                    boolean z6 = tqX.A0N;
                    if (z5) {
                        i = R.drawable.instagram_search_meta_ai_send_icon_disabled_20;
                        if (z6) {
                            i = R.drawable.instagram_search_meta_ai_sparkle_send_icon_disabled_20;
                        }
                    } else {
                        i = R.drawable.instagram_search_meta_ai_send_icon_20;
                        if (z6) {
                            i = R.drawable.instagram_search_meta_ai_sparkle_send_icon_20;
                        }
                    }
                    Drawable drawable4 = requireContext.getDrawable(i);
                    if (z5) {
                        wbd = null;
                    }
                    if (r6 != null) {
                        2dZ r62 = r6;
                        ViewGroup viewGroup = r62.A0O;
                        View childAt = viewGroup.getChildAt(viewGroup.indexOfChild(r62.A0Q) + 2);
                        if (childAt instanceof ImageView) {
                            ImageView imageView = (ImageView) childAt;
                            imageView.setImageDrawable(drawable4);
                            AnonymousClass0fU.A00(wbd, imageView);
                        }
                    }
                } else {
                    searchEditText.setDisableButtonsForIntegrity(tqX.A0S);
                }
                if (AnonymousClass7TF.A1Y(tqX.A0R, false) && tqX.A0S) {
                    0wc r1 = (0wc) tqX.A0j.getValue();
                    String A0a2 = DbY.A0a();
                    String str = tqX.A09;
                    if (str != null) {
                        String str2 = tqX.A0A;
                        AnonymousClass7TF.A1C(r1, 0, str2);
                        0Aj A0e2 = AnonymousClass7TE.A0e(r1, "instagram_search_meta_ai_airplane_disabled_impression");
                        if (A0e2.isSampled()) {
                            C13988Tno.A1E(A0e2, "search_session_id", str, str2);
                            C51965G9l.A1K(A0e2, A0a2);
                            A0e2.Cgf();
                            return;
                        }
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
    }

    public static final void A03(C14137TqX tqX) {
        if (tqX.A0X || AnonymousClass7TF.A1Z(tqX.A0r)) {
            Boolean CXV = tqX.A0g.CXV(tqX.A0A);
            tqX.A0R = Boolean.valueOf(tqX.A0S);
            String str = tqX.A0A;
            AnonymousClass0eM r0 = 0mp.A09;
            int A052 = DbX.A05(str);
            boolean z = false;
            if (A052 > 2 && (CXV == null ? !tqX.A0I : CXV.equals(false))) {
                z = true;
            }
            tqX.A0S = z;
        }
    }

    public static final void A04(C14137TqX tqX, String str) {
        int length;
        int i;
        0wc r1 = (0wc) tqX.A0j.getValue();
        String A0k2 = DbS.A0k();
        String str2 = "";
        if (A0k2 == null) {
            A0k2 = str2;
        }
        String str3 = tqX.A09;
        if (str3 != null) {
            str2 = str3;
        }
        AnonymousClass7TF.A1C(r1, 0, str);
        0Aj A0e2 = AnonymousClass7TE.A0e(r1, "instagram_search_meta_ai_airplane_tapped");
        if (A0e2.isSampled()) {
            C13988Tno.A1E(A0e2, "search_session_id", str2, str);
            C51965G9l.A1K(A0e2, A0k2);
            A0e2.Cgf();
        }
        if (tqX.A0U) {
            length = str.length();
            if (length > 0) {
                tqX.A07(str, C273654mx.A00(2843));
            }
        } else {
            C14437TwL twL = (C14437TwL) tqX.A0h.getValue();
            length = str.length();
            if (length == 0) {
                i = 631;
            } else {
                i = 634;
            }
            twL.A0A(C273654mx.A00(i), tqX.A01.A01, str, (String) null);
        }
        if (length > 0) {
            tqX.A06(str);
        }
    }

    public static final void A05(C14137TqX tqX, String str, String str2) {
        boolean z;
        Integer num;
        Boolean valueOf;
        Dc2 dc2 = tqX.A03;
        if (dc2 != null) {
            DbX.A1R(dc2);
        }
        SearchEditText searchEditText = tqX.A06;
        boolean z2 = false;
        if (searchEditText != null) {
            searchEditText.setEndEmojiButtonEnabled(false);
        }
        String str3 = str;
        Keyword keyword = new Keyword((String) null, str);
        String E4z = tqX.A0i.E4z();
        String A0j2 = AnonymousClass7TG.A0j();
        AnonymousClass0eM r1 = tqX.A0t;
        C324636ze.A00((UserSession) r1.getValue()).A00 = new SearchContext(tqX.A09, E4z, str3, (String) null, (String) null, A0j2, (String) null, (String) null);
        C14466Two two = tqX.A0n;
        0qQ.A0B(str, 0);
        C14200Trf trf = two.A00.A07;
        if (trf == null) {
            0qQ.A0F("dataSource");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass9P5 BiW = trf.A05.BiW(new C15050ULg(str, "fbsearch/keyword_typeahead/", 8));
        if (BiW.A06 == null || (valueOf = Boolean.valueOf(BiW.A09)) == null ? !tqX.A0Z || !tqX.A0J : !valueOf.equals(true)) {
            z = false;
        } else {
            z = true;
        }
        String str4 = str2;
        if (!str4.equals("keyboard") || !tqX.A0Y || !z) {
            AnonymousClass72K.A00((UserSession) r1.getValue(), (String) null, str, 8);
            C14417Tvm.A00((UserSession) r1.getValue()).A00(keyword);
            tqX.A07(str, C273654mx.A00(2844));
        } else {
            z2 = true;
            tqX.A06(tqX.A0A);
            ((C14437TwL) tqX.A0h.getValue()).A0A(C273654mx.A00(633), tqX.A01.A01, str, (String) null);
        }
        C358448av A0D2 = tqX.A0D();
        if (z2) {
            num = AnonymousClass05K.A0K;
        } else {
            num = tqX.A0d;
        }
        A0D2.Chk(num, str4, E4z, str3, A0j2);
        C320006ra A002 = C319996rZ.A00((UserSession) r1.getValue());
        String str5 = tqX.A09;
        if (str5 != null) {
            A002.A02(str5);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    private final void A06(String str) {
        AnonymousClass0eM r2 = this.A0t;
        String str2 = str;
        AnonymousClass72K.A00((UserSession) r2.getValue(), (String) null, str2, 13);
        C14417Tvm.A00((UserSession) r2.getValue()).A00(new Keyword((Double) null, (String) null, str2, (String) null, (String) null, (String) null, (String) null, "meta_ai_suggestion", 0, false, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r4.A07 != null) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A07(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r4 = r19
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r4.A06
            if (r0 == 0) goto L_0x0009
            r0.A04()
        L_0x0009:
            X.0eM r5 = r4.A0t
            java.lang.Object r0 = r5.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Twx r8 = X.C14139TqZ.A00(r0)
            X.Tx0 r3 = X.C14478Tx0.A03
            r10 = 0
            long r1 = r3.A00
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0027
            X.1QP r0 = r8.A00
            r0.flowEndSuccess(r1)
            r3.A00 = r6
        L_0x0027:
            java.lang.String r0 = r4.A0F
            r9 = r20
            boolean r0 = r9.equals(r0)
            r3 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = r4.A07
            r8 = 1
            if (r0 == 0) goto L_0x0039
        L_0x0038:
            r8 = 0
        L_0x0039:
            com.instagram.common.session.UserSession r7 = X.C13988Tno.A0L(r4)
            X.0Tu r6 = X.0Tu.A05
            r0 = 36317457475966108(0x8106890000149c, double:3.030644574239735E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0081
            r0 = 36317457476031645(0x8106890001149d, double:3.030644574281181E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0081
            if (r8 == 0) goto L_0x0081
            java.lang.String r0 = ""
            r4.A0A = r0
        L_0x005b:
            r4.A0P = r2
        L_0x005d:
            java.lang.String r0 = r4.A0F
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0080
            X.0eM r0 = r4.A0h
            java.lang.Object r8 = r0.getValue()
            X.TwL r8 = (X.C14437TwL) r8
            java.lang.String r11 = "search_typeahead"
            java.lang.String r12 = r4.A07
            java.lang.String r13 = r4.A0F
            java.lang.String r15 = "typeahead"
            java.lang.String r14 = "0"
            r16 = r21
            r17 = r3
            r18 = r3
            r8.A0B(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x0080:
            return
        L_0x0081:
            com.instagram.common.session.UserSession r7 = X.C13988Tno.A0L(r4)
            r0 = 36317457475966108(0x8106890000149c, double:3.030644574239735E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x009e
            r0 = 36317457476031645(0x8106890001149d, double:3.030644574281181E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 != 0) goto L_0x009e
            if (r8 == 0) goto L_0x009e
            goto L_0x005b
        L_0x009e:
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            java.lang.Object r1 = r5.getValue()
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.6Yo r0 = new X.6Yo
            r0.<init>(r2, r1)
            r0.A0G(r10, r3)
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14137TqX.A07(java.lang.String, java.lang.String):void");
    }

    public final C14446TwU A0E() {
        UserSession userSession = (UserSession) this.A0t.getValue();
        0qQ.A0B(userSession, 0);
        C14476Twy twy = C14476Twy.A00;
        Class<C14477Twz> cls = C14477Twz.class;
        C14477Twz twz = (C14477Twz) userSession.A01(cls, twy);
        String str = this.A09;
        if (str != null) {
            C14446TwU twU = (C14446TwU) twz.A00.get(str);
            if (twU == null) {
                twU = super.A0E();
            }
            0qQ.A0C(twU, "null cannot be cast to non-null type com.instagram.search.common.store.SearchResultsProviderStore.ProviderGroup<com.instagram.search.common.model.BaseSearchEntry>");
            C14477Twz twz2 = (C14477Twz) C13988Tno.A0L(this).A01(cls, twy);
            String str2 = this.A09;
            if (str2 != null) {
                0qQ.A0B(twU, 1);
                twz2.A00.put(str2, twU);
                return twU;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0H(UKV ukv) {
        int i;
        C14440TwO twO = this.A0Q;
        if (twO == null) {
            0qQ.A0F("userBootstrapProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        if (ukv.A03) {
            i = ukv.A00;
        } else {
            i = twO.A01;
        }
        twO.A00 = i;
        super.A0H(ukv);
    }

    public final void A0K() {
        A0J(this.A0A, "fbsearch/keyword_typeahead/");
        A03(this);
        A0J(this.A0A, "fbsearch/ig_typeahead/");
        A02(this);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (UserSession) this.A0t.getValue();
    }

    public final boolean onBackPressed() {
        Dc2 dc2 = this.A03;
        if (dc2 != null) {
            DbX.A1R(dc2);
        }
        C14139TqZ.A00((UserSession) this.A0t.getValue()).A00.flowEndCancel(C14478Tx0.A03.A00, "TYPEAHEAD_CANCEL");
        return false;
    }

    private final SearchEditText A00(AnimatedHintsTextLayout animatedHintsTextLayout) {
        EditText editText = animatedHintsTextLayout.getEditText();
        0qQ.A0C(editText, "null cannot be cast to non-null type com.instagram.ui.widget.searchedittext.SearchEditText");
        SearchEditText searchEditText = (SearchEditText) editText;
        AnonymousClass0eM r1 = this.A0t;
        searchEditText.setHint(C14426Tvv.A00((UserSession) r1.getValue()));
        UserSession userSession = (UserSession) r1.getValue();
        if (!182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36328319448399074L)) {
            searchEditText.A07 = new C19767Wf8(this, searchEditText);
        }
        if (this.A0K) {
            searchEditText.A09 = new C19769WfA(this);
        }
        C52570GXv gXv = this.A04;
        if (gXv == null) {
            0qQ.A0F("metaSearchViewpointHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        Integer num = AnonymousClass05K.A00;
        String str = this.A09;
        if (str != null) {
            gXv.A00(searchEditText, num, str, searchEditText.getSearchString());
            return searchEditText;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x015b, code lost:
        if (r6.A0B == false) goto L_0x015d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = -1705338264(0xffffffff9a5a9a68, float:-4.5206072E-23)
            int r3 = X.AnonymousClass0fD.A02(r0)
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = "argument_search_string"
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = ""
        L_0x0015:
            r6.A0F = r0
            java.lang.String r0 = "argument_prior_serp_session_id"
            java.lang.String r0 = r1.getString(r0)
            r6.A07 = r0
            java.lang.String r0 = "argument_search_session_id"
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = X.AnonymousClass7TG.A0j()
        L_0x002b:
            r6.A09 = r0
            java.lang.String r1 = r6.A0F
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r6.A0A = r1
            com.instagram.common.session.UserSession r2 = X.C13988Tno.A0L(r6)
            X.TwM r0 = X.C14439TwN.A00(r2)
            int r1 = r0.A00()
            X.TwO r0 = new X.TwO
            r0.<init>(r2, r1)
            r6.A0Q = r0
            com.instagram.base.activity.BaseFragmentActivity r0 = X.C13989Tnp.A0R(r6)
            X.2el r5 = r0.CFM()
            X.0eM r4 = r6.A0t
            java.lang.Object r2 = r4.getValue()
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.0eM r0 = r6.A0j
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            X.GXv r0 = new X.GXv
            r0.<init>(r1, r2, r5)
            r6.A04 = r0
            com.instagram.common.session.UserSession r5 = X.C13988Tno.A0L(r6)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330737515381492(0x81129d000842f4, double:3.0390429246404505E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r6.A0O = r0
            com.instagram.common.session.UserSession r5 = X.C13988Tno.A0L(r6)
            r0 = 36328297973562569(0x81106500023cc9, double:3.037500148570917E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r6.A0E = r0
            com.instagram.common.session.UserSession r5 = X.C13988Tno.A0L(r6)
            r0 = 36328297973431495(0x81106500003cc7, double:3.0375001484880255E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r6.A0B = r0
            com.instagram.common.session.UserSession r5 = X.C13988Tno.A0L(r6)
            r0 = 36328297973628106(0x81106500033cca, double:3.037500148612363E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r6.A0W = r0
            com.instagram.common.session.UserSession r5 = X.C13988Tno.A0L(r6)
            r0 = 36328297973824717(0x81106500063ccd, double:3.0375001487367006E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r6.A0V = r0
            X.TwQ r1 = X.C14442TwQ.A00
            java.lang.Object r0 = r4.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            boolean r0 = r1.A00(r0)
            r6.A0M = r0
            boolean r0 = X.C13989Tnp.A1X(r6)
            r6.A0F = r0
            boolean r0 = X.C13989Tnp.A1X(r6)
            r6.A0T = r0
            boolean r0 = X.C13989Tnp.A1X(r6)
            r6.A0Z = r0
            com.instagram.common.session.UserSession r5 = X.C13988Tno.A0L(r6)
            r0 = 36328044571212689(0x81102a000d3b91, double:3.037339895904484E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r6.A0Y = r0
            boolean r0 = X.C13989Tnp.A1X(r6)
            r6.A0G = r0
            boolean r0 = X.C13989Tnp.A1X(r6)
            r6.A0I = r0
            com.instagram.common.session.UserSession r5 = X.C13988Tno.A0L(r6)
            r0 = 36328044571343763(0x81102a000f3b93, double:3.0373398959873754E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r6.A0J = r0
            boolean r0 = X.C13989Tnp.A1X(r6)
            r6.A0X = r0
            boolean r1 = X.C13989Tnp.A1X(r6)
            r0 = 0
            if (r1 == 0) goto L_0x010c
            r0 = -1
        L_0x010c:
            r6.A00 = r0
            com.instagram.common.session.UserSession r5 = X.C13988Tno.A0L(r6)
            r0 = 36328044570688394(0x81102a00053b8a, double:3.0373398955729174E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r6.A0N = r0
            com.instagram.common.session.UserSession r5 = X.C13988Tno.A0L(r6)
            r0 = 36330565716165303(0x811275000042b7, double:3.0389342781243527E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r0 = r0 ^ 1
            r6.A0H = r0
            com.instagram.common.session.UserSession r5 = X.C13988Tno.A0L(r6)
            r0 = 36328044570491784(0x81102a00023b88, double:3.0373398954485805E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r6.A0L = r0
            java.lang.Object r0 = r4.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            boolean r0 = X.AnonymousClass9B8.A0A(r0)
            if (r0 == 0) goto L_0x015d
            com.instagram.common.session.UserSession r4 = X.C13988Tno.A0L(r6)
            r0 = 36327447570495940(0x810f9f000939c4, double:3.036962350247283E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x015d
            boolean r1 = r6.A0B
            r0 = 1
            if (r1 != 0) goto L_0x015e
        L_0x015d:
            r0 = 0
        L_0x015e:
            r6.A0K = r0
            com.instagram.common.session.UserSession r4 = X.C13988Tno.A0L(r6)
            r0 = 36328340923890940(0x81106f000c3cfc, double:3.037527310531526E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r6.A0U = r0
            com.instagram.common.session.UserSession r4 = X.C13988Tno.A0L(r6)
            r0 = 36328340924480773(0x81106f00153d05, double:3.037527310904539E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r6.A0D = r0
            com.instagram.common.session.UserSession r4 = X.C13988Tno.A0L(r6)
            r0 = 36328340924611847(0x81106f00173d07, double:3.0375273109874306E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r6.A0C = r0
            boolean r0 = r6.A0O
            if (r0 == 0) goto L_0x019a
            X.TwY r0 = r6.A0c
            X.3ok r1 = r6.A0m
            X.3E6 r0 = r0.A02
            r0.A9Y(r1)
        L_0x019a:
            super.onCreate(r7)
            r0 = -1921156620(0xffffffff8d7d79f4, float:-7.810844E-31)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14137TqX.onCreate(android.os.Bundle):void");
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1126661141);
        super.onPause();
        SearchEditText searchEditText = this.A06;
        if (searchEditText != null) {
            searchEditText.A04();
        }
        AnimatedHintsTextLayout animatedHintsTextLayout = this.A05;
        if (animatedHintsTextLayout != null) {
            animatedHintsTextLayout.A04();
        }
        AnonymousClass0fD.A09(1244559130, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(928085822);
        super.onResume();
        AnimatedHintsTextLayout animatedHintsTextLayout = this.A05;
        if (animatedHintsTextLayout != null) {
            animatedHintsTextLayout.A03();
        }
        A02(this);
        AnonymousClass0fD.A09(-1354646503, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1847680326);
        super.onStart();
        C14450TwY twY = this.A0c;
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass3E6 r1 = twY.A02;
        r1.A9Y(twY.A01);
        r1.DmJ(requireActivity);
        AnonymousClass0fD.A09(778770055, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(2108533762);
        super.onStop();
        C14450TwY twY = this.A0c;
        AnonymousClass3E6 r1 = twY.A02;
        r1.EEH(twY.A01);
        r1.onStop();
        Dc2 dc2 = this.A03;
        if (dc2 != null) {
            DbX.A1R(dc2);
        }
        AnonymousClass0fD.A09(-1446185899, A022);
    }
}
