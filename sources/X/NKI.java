package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableMap;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class NKI extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "DirectThreadColorPickerFragment";
    public int A00;
    public int A01;
    public 0wc A02;
    public AnonymousClass2t9 A03;
    public C70696OGr A04;
    public C74318Psu A05;
    public C70610ODh A06;
    public ThemeViewModelDelegate A07;
    public C254743sy A08;
    public Integer A09 = AnonymousClass05K.A01;
    public String A0A;
    public String A0B;
    public Map A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public RecyclerView A0H;
    public C228602lw A0I;
    public EmptyStateView A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final ArrayList A0N = AnonymousClass7TE.A1C();
    public final ArrayList A0O = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A0P = AnonymousClass1YB.A00(new C73897PlY(this, 27));
    public final AnonymousClass0eM A0Q = C227642jf.A02(this);
    public final C70446O6x A0R = new C70446O6x(this);
    public final C70447O6y A0S = new C70447O6y(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "direct_thread_color_picker_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            r4 = 0
            X.0qQ.A0B(r14, r4)
            r6 = r13
            super.onViewCreated(r14, r15)
            androidx.recyclerview.widget.RecyclerView r0 = X.DbX.A0K(r14)
            r13.A0H = r0
            android.content.Context r0 = r14.getContext()
            boolean r0 = X.AnonymousClass3HA.A00(r0)
            r13.A0G = r0
            boolean r0 = r13.A0F
            java.lang.String r5 = "recyclerView"
            if (r0 == 0) goto L_0x00b1
            android.content.Context r0 = r13.requireContext()
            int r1 = X.AnonymousClass7TG.A02(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r13.A0H
            if (r0 == 0) goto L_0x00a4
            r0.setPadding(r1, r4, r1, r4)
            androidx.recyclerview.widget.RecyclerView r3 = r13.A0H
            if (r3 == 0) goto L_0x00a4
            android.content.Context r2 = r13.requireContext()
            r1 = 3
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            r0.<init>(r2, r1)
            r3.setLayoutManager(r0)
        L_0x003e:
            X.2tC r2 = X.DbV.A0S(r13)
            X.NPa r0 = new X.NPa
            r0.<init>()
            r2.A01(r0)
            boolean r1 = r13.A0F
            X.NPv r0 = new X.NPv
            r0.<init>(r13, r13, r1)
            r2.A01(r0)
            X.O6x r1 = r13.A0R
            X.NPk r0 = new X.NPk
            r0.<init>(r1)
            X.2t9 r1 = X.DbU.A0U(r2, r0)
            r13.A03 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r13.A0H
            if (r0 == 0) goto L_0x00a4
            r0.setAdapter(r1)
            r0 = 16908292(0x1020004, float:2.387724E-38)
            android.view.View r2 = r14.requireViewById(r0)
            com.instagram.ui.emptystaterow.EmptyStateView r2 = (com.instagram.ui.emptystaterow.EmptyStateView) r2
            r13.A0J = r2
            boolean r0 = r13.A0E
            if (r0 != 0) goto L_0x00ac
            X.3sy r1 = r13.A08
            if (r1 == 0) goto L_0x010b
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A04(r1)
            if (r0 != 0) goto L_0x00ac
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = X.C66647MaG.A07(r1)
            if (r0 == 0) goto L_0x010b
            boolean r0 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 == 0) goto L_0x0108
            X.0eM r0 = r13.A0Q
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317298562634719(0x810664000713df, double:3.030544076809072E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0108
            X.ODh r5 = r13.A06
            if (r5 != 0) goto L_0x00be
            java.lang.String r5 = "themeVariantsMsysController"
        L_0x00a4:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00ac:
            if (r2 != 0) goto L_0x00e0
            java.lang.String r5 = "emptyStateView"
            goto L_0x00a4
        L_0x00b1:
            androidx.recyclerview.widget.RecyclerView r2 = r13.A0H
            if (r2 == 0) goto L_0x00a4
            android.content.Context r1 = r13.requireContext()
            r0 = 1
            X.DbU.A15(r1, r2, r0, r4)
            goto L_0x003e
        L_0x00be:
            X.1a8 r3 = r5.A00
            X.0eM r0 = r5.A02
            java.lang.Object r0 = r0.getValue()
            X.MYb r0 = (X.MYb) r0
            X.1aU r2 = r0.A0D
            r1 = 1
            X.Owd r0 = new X.Owd
            r0.<init>(r1)
            X.1aU r1 = r2.A0M(r0)
            X.Ovt r0 = X.C72080Ovt.A00
            X.1aU r1 = r1.A0L(r0)
            r0 = 17
            X.PU8.A00(r1, r3, r5, r0)
            goto L_0x010b
        L_0x00e0:
            r0 = 2131239153(0x7f0820f1, float:1.8094605E38)
            X.6rr r1 = X.C320156rr.ERROR
            r2.A0R(r1, r0)
            r0 = 47
            X.Ok0 r0 = X.C71401Ok0.A00(r13, r0)
            r2.A0N(r0, r1)
            android.content.Context r1 = r13.requireContext()
            android.content.Context r0 = r13.requireContext()
            int r0 = X.2Yu.A02(r0)
            int r0 = r1.getColor(r0)
            r2.A0M(r0)
            A04(r13)
            goto L_0x010b
        L_0x0108:
            A05(r13)
        L_0x010b:
            int r0 = r13.A01
            boolean r0 = X.AnonymousClass48O.A04(r0)
            if (r0 == 0) goto L_0x0120
            r0 = 2131442698(0x7f0b3c0a, float:1.8507443E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r14, r0)
            r0 = 2131960580(0x7f132304, float:1.9557833E38)
            r1.setText(r0)
        L_0x0120:
            boolean r0 = r13.A0L
            if (r0 == 0) goto L_0x0149
            X.3sy r0 = r13.A08
            if (r0 == 0) goto L_0x0149
            java.lang.String r0 = X.C66647MaG.A0A(r0)
            if (r0 == 0) goto L_0x0149
            X.0eM r0 = r13.A0P
            X.6gx r3 = X.DbZ.A0R(r0)
            int r2 = r13.A00
            X.3sy r0 = r13.A08
            if (r0 == 0) goto L_0x0163
            java.lang.String r1 = X.C66647MaG.A0A(r0)
        L_0x013e:
            X.3sy r0 = r13.A08
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r0)
            java.lang.String r0 = r0.A01
            r3.A0A(r2, r1, r0)
        L_0x0149:
            boolean r0 = r13.A0E
            if (r0 == 0) goto L_0x0162
            X.0eM r0 = r13.A0Q
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r11 = r13.A0A
            X.0qQ.A0B(r7, r4)
            java.lang.String r8 = "branded_chat_theme_picker"
            java.lang.String r9 = "impression"
            java.lang.String r10 = "theme"
            r12 = 0
            X.C48823Ekl.A00(r6, r7, r8, r9, r10, r11, r12)
        L_0x0162:
            return
        L_0x0163:
            r1 = 0
            goto L_0x013e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKI.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if ("2694600510862302".equals(r0.A09) != false) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.Ou8 A01(com.instagram.direct.model.DirectThreadThemeInfo r6) {
        /*
            r5 = this;
            java.lang.String r4 = r6.A0o
            java.lang.String r2 = r6.A0f
            if (r2 != 0) goto L_0x0010
            android.content.Context r1 = r5.requireContext()
            int r0 = r6.A00
            java.lang.String r2 = X.AnonymousClass7TE.A16(r1, r0)
        L_0x0010:
            java.lang.String r3 = r6.A0o
            com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate r0 = r5.A07
            java.lang.String r1 = "currentTheme"
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = r0.A09
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "1652456634878319"
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x0083
            com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate r0 = r5.A07
            if (r0 == 0) goto L_0x0085
            java.lang.String r1 = r0.A09
            java.lang.String r0 = "2694600510862302"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0083
        L_0x0036:
            r0 = 1
        L_0x0037:
            X.Ou8 r3 = new X.Ou8
            r3.<init>(r4, r2, r0)
            boolean r2 = r5.A0G
            if (r2 == 0) goto L_0x007e
            int r1 = r6.A03
            java.lang.String r0 = r6.A0j
        L_0x0044:
            if (r1 == 0) goto L_0x0063
            r3.A01 = r1
        L_0x0048:
            java.lang.String r1 = r6.A0k
            if (r1 == 0) goto L_0x0052
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0060
        L_0x0052:
            int r0 = r6.A04
            if (r0 == 0) goto L_0x0062
            android.content.Context r1 = r5.requireContext()
            int r0 = r6.A04
            java.lang.String r1 = r1.getString(r0)
        L_0x0060:
            r3.A05 = r1
        L_0x0062:
            return r3
        L_0x0063:
            if (r0 == 0) goto L_0x0068
            r3.A04 = r0
            goto L_0x0048
        L_0x0068:
            int[] r0 = X.C329957Kw.A07(r6, r2)
            r3.A06 = r0
            boolean r0 = r5.A0G
            if (r0 == 0) goto L_0x0079
            int r0 = r6.A01()
        L_0x0076:
            r3.A00 = r0
            goto L_0x0048
        L_0x0079:
            int r0 = r6.A02()
            goto L_0x0076
        L_0x007e:
            int r1 = r6.A07
            java.lang.String r0 = r6.A0n
            goto L_0x0044
        L_0x0083:
            r0 = 0
            goto L_0x0037
        L_0x0085:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKI.A01(com.instagram.direct.model.DirectThreadThemeInfo):X.Ou8");
    }

    public static final Integer A02(NKI nki, String str) {
        if ("3259963564026002".equals(str)) {
            return AnonymousClass05K.A0N;
        }
        if ("ai_theme_creation_dummy_theme_id".equals(str)) {
            return AnonymousClass05K.A0C;
        }
        ArrayList arrayList = nki.A0O;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (0qQ.A0K(((DirectThreadThemeInfo) it.next()).A0o, str)) {
                    return AnonymousClass05K.A00;
                }
            }
        }
        ArrayList arrayList2 = nki.A0N;
        if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
            return null;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (0qQ.A0K(((DirectThreadThemeInfo) it2.next()).A0o, str)) {
                return AnonymousClass05K.A01;
            }
        }
        return null;
    }

    public static final void A04(NKI nki) {
        1NY A0M2 = DbZ.A0M(DbT.A0X(nki.A0Q));
        A0M2.A02();
        A0M2.A0A("api/v1/direct_v2/selectable_themes/");
        1OC A0S2 = DbU.A0S(A0M2, CDN.class, C45624Cza.class);
        0qQ.A0C(A0S2, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.SelectableThemesResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.SelectableThemesResponse>>");
        NMI.A00(A0S2, nki, 12);
        C228602lw r0 = nki.A0I;
        if (r0 == null) {
            0qQ.A0F("loaderScheduler");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.schedule(A0S2);
        }
    }

    public static final void A05(NKI nki) {
        ImmutableMap copyOf;
        Map map = nki.A0C;
        if (map != null) {
            0lg A0X = DbT.A0X(nki.A0Q);
            String A042 = 182.A04(DbS.A0J(A0X, 0), A0X, 36875734505422924L);
            if (0qQ.A0K(O5H.A03, A042)) {
                copyOf = O5H.A01;
            } else {
                O5H.A03 = A042;
                ImmutableMap immutableMap = AnonymousClass6BI.A00;
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                List A0x = DbX.A0x(A042);
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : A0x) {
                    if (immutableMap.get(next) != null) {
                        A1C.add(next);
                    }
                }
                for (Object next2 : A1C) {
                    Object obj = immutableMap.get(next2);
                    if (obj != null) {
                        A1H.put(next2, obj);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                copyOf = ImmutableMap.copyOf(A1H);
                O5H.A01 = copyOf;
            }
            map.putAll(copyOf);
            ArrayList arrayList = nki.A0O;
            arrayList.clear();
            ArrayList arrayList2 = nki.A0N;
            arrayList2.clear();
            Map map2 = nki.A0C;
            if (map2 != null) {
                Iterator A0v = AnonymousClass7TF.A0v(map2);
                while (A0v.hasNext()) {
                    DirectThreadThemeInfo directThreadThemeInfo = (DirectThreadThemeInfo) A0v.next();
                    if (directThreadThemeInfo.A09 == AnonymousClass05K.A00) {
                        arrayList2.add(directThreadThemeInfo);
                    } else {
                        arrayList.add(directThreadThemeInfo);
                    }
                }
                AnonymousClass2t9 r1 = nki.A03;
                if (r1 != null) {
                    r1.A05(A00(nki));
                    return;
                }
                return;
            }
        }
        0qQ.A0F("themesMap");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A06(NKI nki, DirectThreadThemeInfo directThreadThemeInfo, boolean z) {
        C54670HOb hOb;
        String str;
        String str2;
        NKI nki2 = nki;
        C74318Psu psu = nki2.A05;
        DirectThreadThemeInfo directThreadThemeInfo2 = directThreadThemeInfo;
        if (psu != null) {
            psu.D4W(directThreadThemeInfo2);
        }
        C254743sy r1 = nki2.A08;
        if (nki2.A0E) {
            Context requireContext = nki2.requireContext();
            UserSession A0l = AnonymousClass7TE.A0l(nki2.A0Q);
            String str3 = directThreadThemeInfo2.A0o;
            String str4 = nki2.A0A;
            C74188PqU pqU = new C74188PqU(5, (Object) directThreadThemeInfo2, (Object) requireContext, (Object) nki2);
            boolean A1U = AnonymousClass7TF.A1U(0, A0l, str3);
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            A042.A04("theme_id", str3);
            if (str4 == null) {
                str4 = "UNKNOWN";
            }
            C71567On2.A00(new C45926DFg(pqU, 13), new PandoGraphQLRequest(DbU.A0J(A042, "surface", str4), "NMEIGBrandedThreadsConfigMutation", A042.getParamsCopy(), A043.getParamsCopy(), Bi3.class, A1U, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_nme_branded_chat_thread_config_mutation", AnonymousClass7TE.A1C()), 1vm.A01(A0l), pqU, 15);
        }
        if (r1 != null) {
            AnonymousClass0eM r4 = nki2.A0Q;
            C66671Mae.A0G(AnonymousClass7TE.A0l(r4), r1, directThreadThemeInfo2.A0o, nki2.A0K);
            String str5 = directThreadThemeInfo2.A0o;
            C254743sy r5 = nki2.A08;
            if (r5 != null && C66647MaG.A0A(r5) != null) {
                0wc r2 = nki2.A02;
                if (r2 == null) {
                    str2 = "typedLogger";
                } else {
                    ThemeViewModelDelegate themeViewModelDelegate = nki2.A07;
                    if (themeViewModelDelegate == null) {
                        str2 = "currentTheme";
                    } else {
                        String str6 = themeViewModelDelegate.A09;
                        String str7 = nki2.A0B;
                        if (str7 == null) {
                            str2 = "entryPoint";
                        } else {
                            Integer num = nki2.A09;
                            Integer A022 = A02(nki2, str5);
                            if (A022 == null) {
                                A022 = AnonymousClass05K.A0Y;
                            }
                            DbW.A1O(str5, 2, num);
                            if (z) {
                                hOb = C54670HOb.THEME_PICKER;
                            } else {
                                hOb = C54670HOb.THEME_PREVIEW;
                            }
                            0Aj A0e = AnonymousClass7TE.A0e(r2, "direct_thread_change_theme");
                            A0e.AAJ("new_theme_id", str5);
                            C66580MXl.A1J(A0e, C66647MaG.A0A(r5));
                            A0e.AAJ("old_theme_id", str6);
                            C66581MXm.A1H(A0e, C66647MaG.A0E(r5));
                            C66580MXl.A1K(A0e, str5);
                            A0e.A9F("occamadillo_thread_id", C67003Mgb.A00(r5));
                            DbS.A1F(OX5.A00(str7), A0e);
                            A0e.A8M(hOb, "minor_entry_point");
                            OX5.A01(A0e, A022, num);
                            if (nki2.A01 == 29 && C66647MaG.A04(r5) != null) {
                                String str8 = C66647MaG.A03(r5).A01;
                                C313756gx A0P2 = C66583MXo.A0P(r4);
                                int i = nki2.A00;
                                C254743sy r0 = nki2.A08;
                                if (r0 != null) {
                                    str = C66647MaG.A0A(r0);
                                } else {
                                    str = null;
                                }
                                1Ln A0J2 = DbT.A0J(A0P2);
                                if (DbT.A1Y(A0J2)) {
                                    DbW.A17(A0J2, A0P2);
                                    DbV.A1M(A0J2, "thread_update_theme");
                                    A0J2.A0p("theme_selector");
                                    A0J2.A0i(DbZ.A0b(A0J2, "thread_details", str, str8, i));
                                    A0J2.Cgf();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public static final void A07(NKI nki, C320156rr r3) {
        int i;
        EmptyStateView emptyStateView = nki.A0J;
        if (emptyStateView == null) {
            0qQ.A0F("emptyStateView");
            throw AnonymousClass00P.createAndThrow();
        }
        emptyStateView.A0P(r3);
        if (r3.ordinal() == 4) {
            i = 8;
        } else {
            Object obj = emptyStateView.A01.get(r3);
            obj.getClass();
            ((C3253572b) obj).A0H = true;
            emptyStateView.A0H();
            i = 0;
        }
        emptyStateView.setVisibility(i);
    }

    public static final void A08(NKI nki, boolean z) {
        RecyclerView recyclerView;
        int i;
        if (182.A06(0Tu.A05, DbT.A0X(nki.A0Q), 36314575553039034L)) {
            if (z) {
                A07(nki, C320156rr.LOADING);
                recyclerView = nki.A0H;
                if (recyclerView != null) {
                    i = 8;
                }
                0qQ.A0F("recyclerView");
                throw AnonymousClass00P.createAndThrow();
            }
            A07(nki, C320156rr.GONE);
            recyclerView = nki.A0H;
            if (recyclerView != null) {
                i = 0;
            }
            0qQ.A0F("recyclerView");
            throw AnonymousClass00P.createAndThrow();
            recyclerView.setVisibility(i);
        }
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0Q);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A0H;
        if (recyclerView != null) {
            if (recyclerView.getChildCount() != 0) {
                RecyclerView recyclerView2 = this.A0H;
                if (recyclerView2 != null) {
                    if (recyclerView2.computeVerticalScrollOffset() == 0) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [X.Otc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v22, types: [X.Otc, java.lang.Object] */
    public static final ViewModelListUpdate A00(NKI nki) {
        String str;
        int i;
        ViewModelListUpdate A0R2 = DbS.A0R();
        if (nki.A0F && !nki.A0E) {
            if (182.A06(0Tu.A05, DbT.A0X(nki.A0Q), 36326687360694181L)) {
                Ou8 ou8 = new Ou8("ai_theme_creation_dummy_theme_id", AnonymousClass7TE.A16(nki.requireContext(), 2131975225), false);
                ou8.A01 = R.drawable.instagram_gen_ai_pano_outline_24;
                ou8.A02 = ImageView.ScaleType.CENTER_INSIDE;
                if (nki.A0G) {
                    ou8.A03 = -1;
                }
                A0R2.A00(ou8);
            }
        }
        ThemeViewModelDelegate themeViewModelDelegate = nki.A07;
        String str2 = null;
        if (themeViewModelDelegate != null) {
            Integer A022 = A02(nki, themeViewModelDelegate.A09);
            if (A022 == null) {
                ThemeViewModelDelegate themeViewModelDelegate2 = nki.A07;
                if (themeViewModelDelegate2 != null) {
                    String str3 = themeViewModelDelegate2.A0A;
                    if (str3 != null) {
                        str2 = DbV.A12(str3);
                    }
                    if ("AI theme".equalsIgnoreCase(str2)) {
                        A022 = AnonymousClass05K.A0C;
                    } else {
                        A022 = AnonymousClass05K.A0Y;
                    }
                }
            }
            nki.A09 = A022;
            if (nki.A0F && !nki.A0E && A022 == AnonymousClass05K.A0C) {
                if (182.A06(0Tu.A05, DbT.A0X(nki.A0Q), 36326687360759718L)) {
                    nki.A0D = true;
                    ThemeViewModelDelegate themeViewModelDelegate3 = nki.A07;
                    if (themeViewModelDelegate3 != null) {
                        String str4 = themeViewModelDelegate3.A09;
                        String str5 = themeViewModelDelegate3.A0A;
                        if (str5 == null) {
                            str5 = "";
                        }
                        Ou8 ou82 = new Ou8(str4, str5, true);
                        boolean z = nki.A0G;
                        ThemeViewModelDelegate themeViewModelDelegate4 = nki.A07;
                        if (z) {
                            if (themeViewModelDelegate4 != null) {
                                str = themeViewModelDelegate4.A05;
                                if (str == null) {
                                    str = themeViewModelDelegate4.A06;
                                }
                            }
                        } else if (themeViewModelDelegate4 != null) {
                            str = themeViewModelDelegate4.A07;
                            if (str == null) {
                                str = themeViewModelDelegate4.A08;
                            }
                        }
                        ou82.A04 = str;
                        if (z) {
                            i = themeViewModelDelegate4.A00;
                        } else {
                            i = themeViewModelDelegate4.A02;
                        }
                        ou82.A00 = i;
                        A0R2.A00(ou82);
                    }
                }
            }
            01N A1H = 0jo.A1H();
            if (nki.A0L) {
                A1H.add(new Object());
            }
            ArrayList arrayList = nki.A0O;
            if (!arrayList.isEmpty()) {
                if (!nki.A0F) {
                    String A16 = AnonymousClass7TE.A16(nki.requireContext(), 2131960582);
                    ? obj = new Object();
                    obj.A00 = A16;
                    A1H.add(obj);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    A1H.add(nki.A01((DirectThreadThemeInfo) it.next()));
                }
                if (!nki.A0F) {
                    String A162 = AnonymousClass7TE.A16(nki.requireContext(), 2131960581);
                    ? obj2 = new Object();
                    obj2.A00 = A162;
                    A1H.add(obj2);
                }
            }
            Iterator it2 = nki.A0N.iterator();
            while (it2.hasNext()) {
                A1H.add(nki.A01((DirectThreadThemeInfo) it2.next()));
            }
            A0R2.A01(0jo.A1I(A1H));
            return A0R2;
        }
        0qQ.A0F("currentTheme");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r2.length() != 0) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        r2 = r7.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0075, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0080, code lost:
        if (r6 > 240) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A03(X.N3D r7, X.NKI r8) {
        /*
            android.content.res.Resources r0 = X.DbV.A05(r8)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r6 = r0.densityDpi
            r4 = 240(0xf0, float:3.36E-43)
            r3 = 320(0x140, float:4.48E-43)
            r5 = 0
            if (r6 <= r3) goto L_0x0044
            X.9JL r2 = r7.A01
            if (r2 == 0) goto L_0x007d
            java.lang.String r1 = r2.A06
            if (r1 == 0) goto L_0x007d
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0021
            java.lang.String r1 = r7.A03
        L_0x0021:
            if (r2 == 0) goto L_0x0030
            java.lang.String r2 = r2.A04
            if (r2 == 0) goto L_0x0030
        L_0x0027:
            int r0 = r2.length()
            if (r0 != 0) goto L_0x002f
            java.lang.String r2 = r7.A03
        L_0x002f:
            r5 = r2
        L_0x0030:
            X.0eM r0 = r8.A0Q
            X.0lg r4 = X.DbT.A0X(r0)
            X.0Tu r0 = X.0Tu.A05
            r2 = 36324222050316176(0x810cb0000d2f90, double:3.034922518297473E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 == 0) goto L_0x0083
            return r5
        L_0x0044:
            if (r6 <= r4) goto L_0x005d
            X.9JL r2 = r7.A01
            if (r2 == 0) goto L_0x007d
            java.lang.String r1 = r2.A04
            if (r1 == 0) goto L_0x007d
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0056
            java.lang.String r1 = r7.A03
        L_0x0056:
            if (r2 == 0) goto L_0x0030
            java.lang.String r2 = r2.A05
            if (r2 == 0) goto L_0x0030
            goto L_0x0027
        L_0x005d:
            r0 = 160(0xa0, float:2.24E-43)
            X.9JL r2 = r7.A01
            if (r6 <= r0) goto L_0x0078
            if (r2 == 0) goto L_0x007d
            java.lang.String r1 = r2.A05
        L_0x0067:
            if (r1 == 0) goto L_0x007d
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0071
            java.lang.String r1 = r7.A03
        L_0x0071:
            if (r2 == 0) goto L_0x0030
            java.lang.String r2 = r2.A03
            if (r2 == 0) goto L_0x0030
            goto L_0x0027
        L_0x0078:
            if (r2 == 0) goto L_0x007d
            java.lang.String r1 = r2.A03
            goto L_0x0067
        L_0x007d:
            r1 = r5
            if (r6 > r3) goto L_0x0021
            if (r6 <= r4) goto L_0x0071
            goto L_0x0056
        L_0x0083:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKI.A03(X.N3D, X.NKI):java.lang.String");
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 100) {
            C70696OGr oGr = this.A04;
            if (oGr != null && i == 1 && intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    AnonymousClass0fN.A00(oGr.A05);
                    try {
                        InputStream openInputStream = oGr.A01.getContentResolver().openInputStream(data);
                        if (openInputStream != null) {
                            C290815g0 r2 = new C290815g0(new C73438Pcg(2, openInputStream, oGr), 457);
                            r2.A00 = new NQT(oGr, 6);
                            1ES.A05(r2, 457, 2, false, false);
                        }
                    } catch (FileNotFoundException unused) {
                        C59689JTv.A01(oGr.A01, "disk_error", 2131963032, 0);
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        } else if (i2 == -1) {
            DbZ.A15(this);
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, X.0iw, X.NKI, androidx.fragment.app.Fragment] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ff, code lost:
        if (X.C66647MaG.A0E(r0) == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0112, code lost:
        if (X.182.A06(r5, X.DbT.A0X(r6), 36324222050054031L) != false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0125, code lost:
        if (X.182.A06(r5, X.DbT.A0X(r6), 36324222049791886L) != false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x00cc, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbT.A0X(r6), 36320910629675978L) == false) goto L_0x00ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = -287269809(0xffffffffeee09c4f, float:-3.4756804E28)
            int r3 = X.AnonymousClass0fD.A02(r0)
            X.NKI.super.onCreate(r8)
            android.os.Bundle r2 = r7.requireArguments()
            X.0eM r6 = r7.A0Q
            X.0lg r0 = X.DbT.A0X(r6)
            X.0wc r0 = X.AnonymousClass0kN.A01(r7, r0)
            r7.A02 = r0
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r6)
            X.O6y r1 = r7.A0S
            X.ODh r0 = new X.ODh
            r0.<init>(r4, r1)
            r7.A06 = r0
            java.lang.Class<com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate> r1 = com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate.class
            r0 = 2199(0x897, float:3.081E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = X.C320236s2.A00(r2, r1, r0)
            com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate r0 = (com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate) r0
            r7.A07 = r0
            r0 = 15
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r2.getParcelable(r0)
            X.3sy r0 = (X.C254743sy) r0
            r7.A08 = r0
            r0 = 105(0x69, float:1.47E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r0 = r2.getInt(r0)
            r7.A01 = r0
            r0 = 32
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r0 = r2.getInt(r0)
            r7.A00 = r0
            r0 = 218(0xda, float:3.05E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0)
            r7.A0K = r0
            r0 = 2202(0x89a, float:3.086E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0)
            r7.A0M = r0
            r0 = 904(0x388, float:1.267E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4 = 0
            boolean r0 = r2.getBoolean(r0, r4)
            r7.A0E = r0
            r0 = 902(0x386, float:1.264E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r2.getString(r0)
            r7.A0A = r0
            r0 = 219(0xdb, float:3.07E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "undefined"
            java.lang.String r0 = r2.getString(r1, r0)
            r7.A0B = r0
            X.0gy r5 = X.AnonymousClass07i.A00(r7)
            android.content.Context r2 = r7.requireContext()
            r1 = 0
            X.2lw r0 = new X.2lw
            r0.<init>(r2, r5, r1)
            r7.A0I = r0
            java.util.LinkedHashMap r0 = X.AnonymousClass7TE.A1H()
            r7.A0C = r0
            boolean r0 = r7.A0E
            if (r0 != 0) goto L_0x00ce
            int r1 = r7.A01
            r0 = 29
            if (r1 != r0) goto L_0x00ce
            X.0lg r5 = X.DbT.A0X(r6)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320910629675978(0x8109ad000023ca, double:3.032828362550591E-306)
            boolean r1 = X.182.A06(r2, r5, r0)
            r0 = 1
            if (r1 != 0) goto L_0x00cf
        L_0x00ce:
            r0 = 0
        L_0x00cf:
            r7.A0L = r0
            if (r0 == 0) goto L_0x00e2
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            android.content.Context r1 = r7.requireContext()
            X.OGr r0 = new X.OGr
            r0.<init>(r1, r7, r2, r7)
            r7.A04 = r0
        L_0x00e2:
            boolean r0 = r7.A0E
            if (r0 != 0) goto L_0x0127
            X.0lg r2 = X.DbT.A0X(r6)
            X.0Tu r5 = X.0Tu.A05
            r0 = 36324222049464204(0x810cb000002f8c, double:3.034922517758682E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x0128
            X.3sy r0 = r7.A08
            if (r0 == 0) goto L_0x0101
            boolean r0 = X.C66647MaG.A0E(r0)
            if (r0 != 0) goto L_0x0128
        L_0x0101:
            boolean r0 = r7.A0M
            if (r0 == 0) goto L_0x0114
            X.0lg r2 = X.DbT.A0X(r6)
            r0 = 36324222050054031(0x810cb000092f8f, double:3.034922518131691E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x0128
        L_0x0114:
            boolean r0 = r7.A0L
            if (r0 == 0) goto L_0x0127
            X.0lg r2 = X.DbT.A0X(r6)
            r0 = 36324222049791886(0x810cb000052f8e, double:3.0349225179659096E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x0128
        L_0x0127:
            r4 = 1
        L_0x0128:
            r7.A0F = r4
            r0 = -1133207722(0xffffffffbc749f56, float:-0.014930567)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKI.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1638442500);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.direct_thread_color_picker_fragment, false);
        AnonymousClass0fD.A09(1832979248, A022);
        return A0D2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1554681381);
        super.onDestroyView();
        this.A03 = null;
        C70610ODh oDh = this.A06;
        if (oDh == null) {
            0qQ.A0F("themeVariantsMsysController");
            throw AnonymousClass00P.createAndThrow();
        }
        oDh.A00.A01();
        AnonymousClass0fD.A09(1383609417, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(668480186);
        RecyclerView recyclerView = this.A0H;
        if (recyclerView == null) {
            C66580MXl.A19();
            throw AnonymousClass00P.createAndThrow();
        }
        recyclerView.requestFocus();
        super.onResume();
        AnonymousClass0fD.A09(824277915, A022);
    }
}
