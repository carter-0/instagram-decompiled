package X;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.viewer.common.ReelViewGroup;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Or  reason: invalid class name and case insensitive filesystem */
public final class C307066Or {
    public static final C307066Or A00 = new Object();

    public static final ViewGroup A00(ViewGroup viewGroup, C247833gz r10, UserSession userSession, C226642hc r12, AnonymousClass3BQ r13) {
        ViewGroup viewGroup2;
        Object obj;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(viewGroup, 1);
        Context context = viewGroup.getContext();
        C313136fw A08 = 1OP.A08(context, userSession);
        0qQ.A07(A08);
        LayoutInflater from = LayoutInflater.from(context);
        0qQ.A07(from);
        if (!182.A06(0Tu.A05, userSession, 36323320106462281L)) {
            View view = (View) A08.A08.poll();
            if (view == null) {
                view = from.inflate(R.layout.layout_sponsored_reel_item, viewGroup, false);
            }
            0qQ.A0C(view, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) view;
            viewGroup2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            View A002 = 2Su.A00(from, new ViewGroup.LayoutParams(-1, -1), viewGroup, R.layout.layout_sponsored_reel_item);
            0qQ.A0C(A002, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) A002;
        }
        try {
            C309406Yd r4 = new C309406Yd(viewGroup2, userSession, A08);
            if (r12 != null) {
                r4.A0K.setPostProcessor(r12);
            }
            if (r10 != null) {
                r4.A0K.setProgressiveImageConfig(r10);
            }
            r4.A0Y.A00.setLayerType(1, (Paint) null);
            viewGroup2.setTag(r4);
            return viewGroup2;
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(e.getMessage());
            sb.append("\n|- Sponsored item View Hierarchy on ");
            if (r13 == null || (obj = r13.name()) == null) {
                obj = AnonymousClass3BQ.UNKNOWN;
            }
            sb.append(obj);
            sb.append(" -|\n");
            0qQ.A0B(viewGroup2, 0);
            StringBuilder sb2 = new StringBuilder();
            C49106EpV.A00(viewGroup2, sb2, 0);
            String obj2 = sb2.toString();
            0qQ.A07(obj2);
            sb.append(obj2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static final void A01(Context context, C229392nJ r19, UserSession userSession, AnonymousClass4DU r21, C255773uh r22, C250973mM r23, ReelViewerConfig reelViewerConfig, AnonymousClass3BQ r25, C309426Yf r26, C310246af r27, C309406Yd r28, C309666Zd r29, int i, int i2) {
        IgImageView igImageView;
        C309406Yd r4 = r28;
        0qQ.A0B(r4, 0);
        Context context2 = context;
        0qQ.A0B(context2, 1);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        C255773uh r7 = r22;
        0qQ.A0B(r7, 4);
        C309666Zd r3 = r29;
        0qQ.A0B(r3, 8);
        C310246af r9 = r27;
        0qQ.A0B(r9, 9);
        ReelViewerConfig reelViewerConfig2 = reelViewerConfig;
        0qQ.A0B(reelViewerConfig2, 10);
        AnonymousClass3BQ r5 = r25;
        0qQ.A0B(r5, 11);
        AnonymousClass4DU r10 = r21;
        0qQ.A0B(r10, 12);
        C229392nJ r15 = r19;
        0qQ.A0B(r15, 13);
        r4.A0j.A09.A05 = C307096Ou.A00(context2, userSession2, r7);
        r4.A06.A0A.A05 = C307096Ou.A00(context2, userSession2, r7);
        C250973mM r6 = r23;
        int i3 = i;
        int i4 = i2;
        C309426Yf r13 = r26;
        AnonymousClass4DU r17 = r10;
        C255773uh r18 = r7;
        UserSession userSession3 = userSession2;
        A00.A02(r15, userSession3, r17, r18, r6, reelViewerConfig2, r5, r13, r9, r4, r3, i3, i4, false, A04(userSession2, r7, r6, r4));
        r3.Dm8(context2, r7, r6, r4, false);
        C238833Dp A002 = C238833Dp.A00(userSession2);
        0qQ.A07(A002);
        ReelViewGroup reelViewGroup = r4.A0R;
        C238863Ds r92 = C238863Ds.ATTACHMENT;
        int i5 = -1;
        if (i3 > 1) {
            i5 = i4;
        }
        A002.A06(reelViewGroup, r92, i5);
        1Xj r93 = r7.A0b;
        C258033yM r11 = null;
        if (r93 != null) {
            Context context3 = r4.A0p.getContext();
            A002.A0A(reelViewGroup, new C246153e7(new AnonymousClass6Q1(context3, userSession2, r93), userSession2, r93, r10));
            if (!A04(userSession2, r7, r6, r4) || C2803051e.A03(userSession2)) {
                C246153e7 r12 = new C246153e7((AnonymousClass4HI) null, userSession2, r93, r10);
                AnonymousClass6PB r1 = r4.A0X;
                A002.A0A(r1.A07, r12);
                A002.A0A(r1.A0F, r12);
            } else {
                C246153e7 r14 = new C246153e7(new AnonymousClass6Q1(context3, userSession2, r93), userSession2, r93, r10, "in_app_browser_v2", 0sl.A00);
                boolean A06 = 182.A06(0Tu.A05, userSession2, 36320481132945902L);
                AnonymousClass6PB r0 = r4.A0X;
                if (A06) {
                    A002.A0A(r0.A03, r14);
                } else {
                    A002.A0A(r0.A04, r14);
                }
            }
        }
        String str = r7.A0j;
        0qQ.A07(str);
        ArrayList A003 = AnonymousClass6Q2.A00(userSession2, r7, r6, r5, r13);
        Map A0P = r6.A0H.A0P(r6.A04(userSession2, str));
        0qQ.A07(A0P);
        if (r93 != null) {
            r11 = r93.A0C.C0R();
        }
        List list = r7.A0M;
        Map map = AnonymousClass59A.A01;
        if (!map.containsKey(str)) {
            map.put(str, new HashMap());
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : A0P.entrySet()) {
            Object key = entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            if (key == C250953mK.END_SCENE_TYPE) {
                if (!map.containsKey(str)) {
                    map.put(str, new HashMap());
                }
                AbstractMap abstractMap = (AbstractMap) map.get(str);
                if (abstractMap != null) {
                    abstractMap.put("is_end_scene_in_server_options", true);
                }
            }
            if (key == C250953mK.VIDEO_TO_CAROUSEL_TYPE) {
                if (!map.containsKey(str)) {
                    map.put(str, new HashMap());
                }
                AbstractMap abstractMap2 = (AbstractMap) map.get(str);
                if (abstractMap2 != null) {
                    abstractMap2.put("is_v2c_in_server_options", true);
                }
            }
            arrayList.add(String.valueOf(intValue));
        }
        AbstractMap abstractMap3 = (AbstractMap) map.get(str);
        if (abstractMap3 != null) {
            abstractMap3.put("server_cop_options", arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = A003.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            0qQ.A07(next);
            Object obj = ((AbstractMap) next).get("option_value");
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        if (!map.containsKey(str)) {
            map.put(str, new HashMap());
        }
        AbstractMap abstractMap4 = (AbstractMap) map.get(str);
        if (abstractMap4 != null) {
            abstractMap4.put("client_cop_options", arrayList2);
        }
        if (!(r11 == null || r11.B1a() == null)) {
            if (!map.containsKey(str)) {
                map.put(str, new HashMap());
            }
            Integer B1a = r11.B1a();
            0qQ.A0C(B1a, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = B1a.intValue();
            AbstractMap abstractMap5 = (AbstractMap) map.get(str);
            if (abstractMap5 != null) {
                abstractMap5.put("end_scene_duration", Double.valueOf((double) intValue2));
            }
        }
        if (list != null) {
            if (!map.containsKey(str)) {
                map.put(str, new HashMap());
            }
            AbstractMap abstractMap6 = (AbstractMap) map.get(str);
            if (abstractMap6 != null) {
                abstractMap6.put("video_to_carousel_start_times", list);
            }
        }
        if (C297785sK.A0L(userSession2, r7, r6)) {
            IgProgressImageView igProgressImageView = r4.A0T.A02;
            if (igProgressImageView != null) {
                igImageView = igProgressImageView.getIgImageView();
            } else {
                return;
            }
        } else if (!r7.A1m()) {
            if (C297785sK.A0d(r6.A08(userSession2))) {
                igImageView = r4.A0m.A01.getView().getRootView();
            } else {
                igImageView = r4.A0K.getIgImageView();
            }
            0qQ.A0A(igImageView);
        } else {
            return;
        }
        C244083ac.A05(igImageView, C244063aa.MEDIA);
    }

    public static final void A03(C229392nJ r16, UserSession userSession, C255773uh r18, C250973mM r19, ReelViewerConfig reelViewerConfig, AnonymousClass3BQ r21, C309406Yd r22, int i, int i2) {
        C309406Yd r10 = r22;
        0qQ.A0B(r10, 0);
        C229392nJ r1 = r16;
        0qQ.A0B(r1, 2);
        C255773uh r4 = r18;
        0qQ.A0B(r4, 5);
        AnonymousClass3BQ r7 = r21;
        0qQ.A0B(r7, 6);
        C307066Or r0 = A00;
        C309426Yf r8 = new C309426Yf(true);
        C309666Zd r11 = C56483HzF.A00;
        UserSession userSession2 = userSession;
        r0.A02(r1, userSession2, new PG2(), r4, r19, reelViewerConfig, r7, r8, C310246af.A01, r10, r11, i, i2, true, false);
    }

    public static final boolean A04(UserSession userSession, C255773uh r5, C250973mM r6, C309406Yd r7) {
        int i;
        1Xj r2 = r5.A0b;
        if (r2 == null) {
            return false;
        }
        User user = r5.A0i;
        if (user == null || !user.A2Q()) {
            return C2803051e.A01(r2.A0C.Aq4(), userSession);
        }
        if (C309456Yi.A02(r6)) {
            i = r6.A01();
        } else {
            i = -1;
            if (r2.A5D()) {
                i = 0;
            }
        }
        Context context = r7.A0p.getContext();
        0qQ.A07(context);
        if (!AnonymousClass6L4.A01(context, userSession, r2, i) || 182.A06(0Tu.A05, userSession, 36318849045961218L)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v26, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v27, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v29, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: com.instagram.common.ui.widget.imageview.RoundedCornerImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v117, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v125, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v253, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v130, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v135, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v140, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v141, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v256, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v148, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v169, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v179, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v191, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v197, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v2, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v84, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v277, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v287, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v313, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v431, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v107, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v109, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout} */
    /* JADX WARNING: type inference failed for: r9v452, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r9v466, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r9v467, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v47, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r5v7, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r11v61, types: [java.lang.Object, X.6MT] */
    /* JADX WARNING: type inference failed for: r3v364 */
    /* JADX WARNING: type inference failed for: r10v313, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r9v767, types: [java.lang.Object, X.6MT] */
    /* JADX WARNING: type inference failed for: r3v886 */
    /* JADX WARNING: type inference failed for: r37v55, types: [X.TxX] */
    /* JADX WARNING: type inference failed for: r37v56, types: [X.TxX] */
    /* JADX WARNING: type inference failed for: r37v57, types: [X.TxY] */
    /* JADX WARNING: type inference failed for: r37v58, types: [X.6ML] */
    /* JADX WARNING: type inference failed for: r37v59, types: [X.6MF] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x16d1: MOVE  (r9v153 X.3mL) = (r60v0 X.3mL)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1086:0x1b9b  */
    /* JADX WARNING: Removed duplicated region for block: B:1095:0x1bd3  */
    /* JADX WARNING: Removed duplicated region for block: B:1097:0x1be4  */
    /* JADX WARNING: Removed duplicated region for block: B:1102:0x1bf0  */
    /* JADX WARNING: Removed duplicated region for block: B:1110:0x1caa  */
    /* JADX WARNING: Removed duplicated region for block: B:1142:0x1d3d  */
    /* JADX WARNING: Removed duplicated region for block: B:1178:0x1df5  */
    /* JADX WARNING: Removed duplicated region for block: B:1181:0x1e0c  */
    /* JADX WARNING: Removed duplicated region for block: B:1488:0x2670  */
    /* JADX WARNING: Removed duplicated region for block: B:1763:0x2d42  */
    /* JADX WARNING: Removed duplicated region for block: B:1766:0x2d4f  */
    /* JADX WARNING: Removed duplicated region for block: B:1779:0x2d91  */
    /* JADX WARNING: Removed duplicated region for block: B:1914:0x2ff5  */
    /* JADX WARNING: Removed duplicated region for block: B:1923:0x305c  */
    /* JADX WARNING: Removed duplicated region for block: B:1926:0x3074  */
    /* JADX WARNING: Removed duplicated region for block: B:1961:0x313b  */
    /* JADX WARNING: Removed duplicated region for block: B:1968:0x3150  */
    /* JADX WARNING: Removed duplicated region for block: B:2059:0x341d  */
    /* JADX WARNING: Removed duplicated region for block: B:2062:0x3426  */
    /* JADX WARNING: Removed duplicated region for block: B:2066:0x3440  */
    /* JADX WARNING: Removed duplicated region for block: B:2070:0x34a7  */
    /* JADX WARNING: Removed duplicated region for block: B:2073:0x34ec  */
    /* JADX WARNING: Removed duplicated region for block: B:2076:0x34f9  */
    /* JADX WARNING: Removed duplicated region for block: B:2079:0x3520  */
    /* JADX WARNING: Removed duplicated region for block: B:2090:0x354d  */
    /* JADX WARNING: Removed duplicated region for block: B:2095:0x356e  */
    /* JADX WARNING: Removed duplicated region for block: B:2109:0x3645  */
    /* JADX WARNING: Removed duplicated region for block: B:2111:0x365c  */
    /* JADX WARNING: Removed duplicated region for block: B:2117:0x3677  */
    /* JADX WARNING: Removed duplicated region for block: B:2120:0x36ae  */
    /* JADX WARNING: Removed duplicated region for block: B:2146:0x372d  */
    /* JADX WARNING: Removed duplicated region for block: B:2147:0x3738  */
    /* JADX WARNING: Removed duplicated region for block: B:2156:0x37b0  */
    /* JADX WARNING: Removed duplicated region for block: B:2158:0x37be  */
    /* JADX WARNING: Removed duplicated region for block: B:2200:0x38a0  */
    /* JADX WARNING: Removed duplicated region for block: B:2202:0x38a8  */
    /* JADX WARNING: Removed duplicated region for block: B:2229:0x396d  */
    /* JADX WARNING: Removed duplicated region for block: B:2387:0x3d50  */
    /* JADX WARNING: Removed duplicated region for block: B:2394:0x3d71  */
    /* JADX WARNING: Removed duplicated region for block: B:2511:0x400b  */
    /* JADX WARNING: Removed duplicated region for block: B:2531:0x405d  */
    /* JADX WARNING: Removed duplicated region for block: B:2566:0x4122 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:2570:0x41cb  */
    /* JADX WARNING: Removed duplicated region for block: B:2577:0x4209  */
    /* JADX WARNING: Removed duplicated region for block: B:2583:0x4219  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x086d  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0890  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x08a7  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x08da  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x09e3  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x0b71  */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x0c13  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0c25  */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x0c2e  */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0c31  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:534:0x0d92  */
    /* JADX WARNING: Removed duplicated region for block: B:551:0x0e58  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:666:0x11bd  */
    /* JADX WARNING: Removed duplicated region for block: B:671:0x11d7  */
    /* JADX WARNING: Removed duplicated region for block: B:674:0x11f8  */
    /* JADX WARNING: Removed duplicated region for block: B:675:0x1223  */
    /* JADX WARNING: Removed duplicated region for block: B:684:0x129d  */
    /* JADX WARNING: Removed duplicated region for block: B:687:0x12a8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:704:0x1303  */
    /* JADX WARNING: Removed duplicated region for block: B:707:0x1308  */
    /* JADX WARNING: Removed duplicated region for block: B:718:0x1325  */
    /* JADX WARNING: Removed duplicated region for block: B:721:0x1330  */
    /* JADX WARNING: Removed duplicated region for block: B:748:0x13dd  */
    /* JADX WARNING: Removed duplicated region for block: B:859:0x1628  */
    /* JADX WARNING: Removed duplicated region for block: B:862:0x162d  */
    /* JADX WARNING: Removed duplicated region for block: B:869:0x165d  */
    /* JADX WARNING: Removed duplicated region for block: B:890:0x16d9  */
    /* JADX WARNING: Removed duplicated region for block: B:892:0x16e0  */
    /* JADX WARNING: Removed duplicated region for block: B:908:0x1736  */
    /* JADX WARNING: Removed duplicated region for block: B:910:0x174f  */
    /* JADX WARNING: Removed duplicated region for block: B:911:0x1756  */
    private final void A02(X.C229392nJ r71, com.instagram.common.session.UserSession r72, X.AnonymousClass4DU r73, X.C255773uh r74, X.C250973mM r75, com.instagram.model.reels.ReelViewerConfig r76, X.AnonymousClass3BQ r77, X.C309426Yf r78, X.C310246af r79, X.C309406Yd r80, X.C309666Zd r81, int r82, int r83, boolean r84, boolean r85) {
        /*
            r70 = this;
            r17 = r82
            r22 = r83
            r1 = r74
            X.3mL r0 = r1.A0e
            r60 = r0
            X.3mL r29 = X.C250963mL.MEDIA
            r2 = r0
            r0 = r29
            if (r2 != r0) goto L_0x0016
            X.3OA r2 = r1.A0g
            r0 = 1
            if (r2 != 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            java.lang.String r31 = "Required value was null."
            r5 = r72
            if (r0 == 0) goto L_0x0028
            X.1wP r2 = X.1wN.A00(r5)
            X.3OA r0 = r1.A0g
            if (r0 == 0) goto L_0x4297
            r2.A01(r0)
        L_0x0028:
            X.0Tu r34 = X.0Tu.A05
            r2 = 36316400916828481(0x810593002b1141, double:3.0299764019866776E-306)
            r0 = r34
            boolean r4 = X.182.A06(r0, r5, r2)
            r6 = r80
            android.view.View r2 = r6.A0D
            r36 = 4
            r0 = r36
            r2.setVisibility(r0)
            r68 = r75
            r0 = r68
            r6.A01 = r0
            r65 = r81
            r0 = r65
            r6.A05 = r0
            r61 = r77
            r0 = r61
            r6.A02 = r0
            com.instagram.reels.viewer.common.ReelViewGroup r0 = r6.A0R
            r48 = r0
            r0 = 0
            r3 = r48
            r2 = r65
            r3.A92(r2)
            if (r4 == 0) goto L_0x1be7
            android.content.Context r4 = r48.getContext()
            X.0qQ.A07(r4)
            X.6YS r3 = new X.6YS
            r3.<init>(r4, r5, r2)
        L_0x006c:
            r2 = r48
            r2.A00 = r3
            r30 = 0
            r27 = 0
            r4 = r30
            r3 = r2
            r2 = r27
            r3.A08(r2, r4)
            X.6Yf r3 = r6.A04
            r67 = r78
            r2 = r67
            if (r3 == r2) goto L_0x0089
            if (r3 == 0) goto L_0x0089
            r3.A04(r6)
        L_0x0089:
            X.1Xj r4 = r1.A0b
            r69 = r73
            if (r4 == 0) goto L_0x0096
            com.instagram.ui.widget.framelayout.MediaFrameLayout r3 = r6.A0o
            r2 = r69
            r3.setVideoSource(r4, r2)
        L_0x0096:
            X.3uh r2 = r6.A00
            boolean r16 = r1.equals(r2)
            r6.A00 = r1
            r2 = r67
            r6.A04 = r2
            r2.A03(r6)
            X.6Pl r8 = r6.A0S
            X.0qQ.A0B(r8, r0)
            X.3oV r2 = r8.A0B
            r52 = r2
            r7 = 8
            r2.setVisibility(r7)
            boolean r2 = r52.CVM()
            if (r2 == 0) goto L_0x00d2
            android.view.View r2 = r8.A01
            if (r2 == 0) goto L_0x428a
            r3 = r30
            r2.setTranslationY(r3)
            android.widget.TextView r2 = r8.A05
            if (r2 == 0) goto L_0x4287
            java.lang.String r3 = ""
            r2.setText(r3)
            android.widget.TextView r2 = r8.A00()
            r2.setText(r3)
        L_0x00d2:
            X.6Pn r2 = r6.A0V
            r59 = r2
            X.0qQ.A0B(r2, r0)
            X.3oV r2 = r2.A04
            r2.setVisibility(r7)
            com.instagram.feed.widget.IgProgressImageView r2 = r6.A0K
            r58 = r2
            android.content.Context r32 = r58.getContext()
            X.0qQ.A0A(r32)
            r3 = r32
            r2 = r68
            X.C316216lI.A05(r3, r2, r6)
            X.4Wn r2 = r6.A0N
            r47 = r2
            r47.A01()
            X.4Wp r2 = r6.A0M
            r46 = r2
            r46.A01()
            X.6m5 r2 = r6.A0L
            r35 = r2
            X.3oV r2 = r2.A02
            r2.setVisibility(r7)
            X.6mN r2 = r6.A0Q
            r33 = r2
            X.3oV r2 = r2.A00
            r2.setVisibility(r7)
            X.6lH r2 = r6.A0n
            X.3oV r2 = r2.A00
            r2.setVisibility(r7)
            if (r16 != 0) goto L_0x014b
            X.6PJ r2 = r6.A0m
            r2.hashCode()
            X.3oV r2 = r2.A01
            r2.setVisibility(r7)
            boolean r3 = r2.CVM()
            if (r3 == 0) goto L_0x0132
            android.view.View r2 = r2.getView()
            com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView r2 = (com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView) r2
            r2.reset()
        L_0x0132:
            X.6PK r2 = r6.A0l
            r2.hashCode()
            X.3oV r2 = r2.A02
            r2.setVisibility(r7)
            boolean r3 = r2.CVM()
            if (r3 == 0) goto L_0x014b
            android.view.View r2 = r2.getView()
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r2 = (com.instagram.showreel.composition.ui.IgShowreelCompositionView) r2
            r2.reset()
        L_0x014b:
            X.3oV r10 = r6.A0J
            com.instagram.common.session.UserSession r2 = r6.A0F
            X.3kW r3 = X.AnonymousClass1Qz.A00(r2)
            X.1R7 r3 = r3.C82()
            java.lang.String r9 = "ig_zero_rating_data_banner"
            java.util.Set r3 = r3.A0C
            boolean r9 = r3.contains(r9)
            r3 = 8
            if (r9 == 0) goto L_0x0164
            r3 = 0
        L_0x0164:
            r10.setVisibility(r3)
            X.6PB r3 = r6.A0X
            X.34Y r15 = new X.34Y
            r15.<init>()
            r25 = r27
            X.0qQ.A0B(r2, r0)
            r19 = 1
            r9 = r19
            X.0qQ.A0B(r3, r9)
            android.view.View r9 = r3.A08
            r9.setVisibility(r7)
            com.instagram.user.model.User r9 = r1.A0i
            r20 = r9
            if (r9 != 0) goto L_0x1503
            boolean r9 = r1.A1p(r2)
            if (r9 != 0) goto L_0x1503
            android.view.View r9 = r3.A04
        L_0x018d:
            r9.setVisibility(r7)
        L_0x0190:
            boolean r26 = X.C297785sK.A0d(r1)
            boolean r24 = X.C297785sK.A0c(r1)
            X.3IB r9 = r1.mBrandResearchSurvey
            r18 = 0
            if (r9 == 0) goto L_0x01a0
            r18 = 1
        L_0x01a0:
            r9 = r68
            com.instagram.model.reels.Reel r9 = r9.A0H
            r57 = r9
            int r14 = r9.A00
            java.lang.String r9 = r1.A0j
            r28 = r9
            boolean r9 = X.C297785sK.A0d(r1)
            r12 = 0
            if (r9 == 0) goto L_0x14de
            if (r84 != 0) goto L_0x14de
            if (r4 == 0) goto L_0x01c9
            X.1Xy r9 = r4.A0C
            com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf r9 = r9.BwB()
            if (r9 == 0) goto L_0x01c9
            X.GVk r9 = X.B7C.A00(r9)
            java.lang.String r12 = r9.A05
            if (r12 != 0) goto L_0x01c9
            java.lang.String r12 = ""
        L_0x01c9:
            if (r28 == 0) goto L_0x01ea
            java.util.Map r11 = X.AnonymousClass59A.A07
            r9 = r28
            java.lang.Object r10 = r11.get(r9)
            X.0bb r10 = (X.0bb) r10
            if (r10 != 0) goto L_0x01dc
            X.6Px r10 = new X.6Px
            r10.<init>()
        L_0x01dc:
            if (r12 != 0) goto L_0x01e0
            java.lang.String r12 = ""
        L_0x01e0:
            java.lang.String r9 = "template_name"
            r10.A06(r9, r12)
            r9 = r28
            r11.put(r9, r10)
        L_0x01ea:
            boolean r21 = r1.A1N()
            r66 = r79
            if (r21 == 0) goto L_0x0e58
            r3 = r27
            r6.A00 = r3
            r6.A04 = r3
            r3 = r58
            r3.setVisibility(r0)
            r58.A04()
            X.6PA r3 = r6.A0Y
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r9 = r3.A00
            r3 = r30
            r9.setProgress(r3)
            r9.setVisibility(r7)
            X.6PI r3 = r6.A0T
            r3.A01()
        L_0x0211:
            X.3mM r3 = r6.A01
            if (r3 == 0) goto L_0x400b
            java.util.List r3 = X.C250973mM.A00(r2, r3)
            boolean r9 = r3.isEmpty()
            r22 = 1
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r3 = r6.A0G
            if (r9 == 0) goto L_0x0e37
            r3.setVisibility(r0)
            r3 = r58
            r3.setEnableProgressBar(r0)
            X.6PJ r3 = r6.A0m
            X.3oV r3 = r3.A01
            boolean r9 = r3.CVM()
            if (r9 == 0) goto L_0x023e
            android.view.View r3 = r3.getView()
            com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView r3 = (com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView) r3
            r3.setEnableProgressBar(r0)
        L_0x023e:
            X.6Os r3 = r6.A06
            r9 = r32
            X.0qQ.A0B(r9, r0)
            r23 = 2
            r9 = r23
            X.0qQ.A0B(r3, r9)
            r9 = r57
            X.3IB r9 = r9.A0I
            if (r9 == 0) goto L_0x061a
            X.6lB r9 = r3.A05
            android.view.View r9 = r9.A04
            r9.setVisibility(r7)
            X.C307396Py.A00(r3)
        L_0x025c:
            java.lang.String r37 = r69.getModuleName()
            r19 = 5
            r17 = 6
            r9 = r37
            r3 = r17
            X.0qQ.A0B(r9, r3)
            r33 = 7
            X.3yM r35 = r1.A0F()
            if (r35 == 0) goto L_0x0541
            r10 = r68
            r9 = r61
            r3 = r67
            boolean r3 = X.C297785sK.A0k(r1, r10, r9, r3)
            if (r3 == 0) goto L_0x0541
            r3 = r67
            java.lang.Integer r9 = r3.A0V
            android.view.View r3 = r52.getView()
            if (r9 == 0) goto L_0x0293
            r3.setVisibility(r0)
            android.view.View r3 = r8.A0A
            r3.bringToFront()
            android.view.View r3 = r8.A09
        L_0x0293:
            r3.setVisibility(r7)
            android.view.View r3 = r8.A01
            if (r3 == 0) goto L_0x428a
            android.content.Context r14 = r3.getContext()
            r9 = 36330892133679941(0x8112c100004345, double:3.0391407058749876E-306)
            r3 = r34
            boolean r21 = X.182.A06(r3, r2, r9)
            if (r21 == 0) goto L_0x0397
            X.6Ln r11 = r8.A06
            if (r11 == 0) goto L_0x3fc7
            r10 = r68
            r9 = r61
            r3 = r67
            boolean r3 = X.C297785sK.A0k(r1, r10, r9, r3)
            if (r3 == 0) goto L_0x0385
            android.view.View r3 = r11.A00
            if (r3 == 0) goto L_0x0385
            r3 = r67
            java.lang.Integer r9 = r3.A0V
            X.3oV r3 = r11.A01
            android.view.View r3 = r3.getView()
            if (r9 == 0) goto L_0x0615
            r3.setVisibility(r0)
        L_0x02ce:
            android.view.View r11 = r11.A00
            if (r11 == 0) goto L_0x0385
            android.content.Context r3 = r11.getContext()
            if (r3 == 0) goto L_0x0385
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            java.lang.Boolean r50 = java.lang.Boolean.valueOf(r0)
            java.lang.CharSequence r9 = X.AnonymousClass4EQ.A05(r3, r2, r1)
            java.lang.String r45 = r9.toString()
            java.lang.String r47 = ""
            com.instagram.api.schemas.StoryLinkInfoDict r10 = new com.instagram.api.schemas.StoryLinkInfoDict
            r38 = r10
            r39 = r27
            r40 = r27
            r41 = r27
            r42 = r27
            r43 = r27
            r44 = r27
            r46 = r27
            r48 = r47
            r49 = r47
            r38.<init>(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            X.6MT r9 = new X.6MT
            r9.<init>()
            r9.A00 = r10
            int r10 = X.AnonymousClass4EQ.A02(r3)
            boolean r12 = X.C316216lI.A0C(r3)
            if (r12 == 0) goto L_0x060f
            float r10 = (float) r10
            r12 = 1058013184(0x3f100000, float:0.5625)
            float r10 = r10 * r12
            int r12 = (int) r10
        L_0x0317:
            r4.getClass()
            X.1Xy r10 = r4.A0C
            java.lang.String r10 = r10.getDominantColor()
            java.lang.Integer r51 = X.0nH.A0D(r10)
            r46 = r3
            r47 = r2
            r48 = r9
            r49 = r1
            r52 = r27
            r53 = r27
            r54 = r12
            r55 = r0
            r56 = r0
            X.5xX r13 = X.C309506Yn.A00(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            r11.setImageDrawable(r13)
            r9 = 36603575312978879(0x820ac2000a13bf, double:3.2115866464706666E-306)
            r15 = r34
            long r9 = X.182.A01(r15, r2, r9)
            int r15 = (int) r9
            float r9 = X.0nA.A04(r3, r15)
            int r3 = r13.A04
            float r3 = (float) r3
            float r9 = r9 / r3
            float r10 = (float) r12
            r12 = 1058642330(0x3f19999a, float:0.6)
            float r10 = r10 * r12
            int r12 = r13.A08
            float r12 = (float) r12
            float r10 = r10 / r12
            float r9 = java.lang.Math.min(r9, r10)
            float r12 = r12 * r9
            float r3 = r3 * r9
            int r3 = (int) r3
            X.0nA.A0V(r11, r3)
            int r3 = (int) r12
            X.0nA.A0f(r11, r3)
            java.lang.String r12 = r1.A0k
            r10 = 9
            X.PqS r9 = new X.PqS
            r3 = r65
            r9.<init>((int) r10, (java.lang.Object) r1, (java.lang.Object) r3)
            X.3aW r3 = new X.3aW
            r38 = r3
            r39 = r2
            r40 = r12
            r42 = r9
            r43 = r22
            r38.<init>(r39, r40, r41, r42, r43)
            X.AnonymousClass0fU.A00(r3, r11)
        L_0x0385:
            android.view.View r3 = r8.A00
            if (r3 == 0) goto L_0x3fc3
            r3.setVisibility(r7)
            X.6Ln r3 = r8.A06
            if (r3 == 0) goto L_0x3fc7
            android.view.View r3 = r3.A00
            if (r3 == 0) goto L_0x0397
            r3.setVisibility(r0)
        L_0x0397:
            X.3Dp r10 = X.C238833Dp.A00(r2)
            android.widget.TextView r9 = r8.A05
            if (r9 == 0) goto L_0x4287
            X.3Ds r3 = X.C238863Ds.TITLE
            r10.A05(r9, r3)
            java.lang.String r3 = r1.A0k
            X.PqS r10 = new X.PqS
            r11 = r17
            r9 = r65
            r10.<init>((int) r11, (java.lang.Object) r1, (java.lang.Object) r9)
            X.3aW r11 = new X.3aW
            r38 = r11
            r39 = r2
            r40 = r3
            r41 = r27
            r42 = r10
            r43 = r22
            r38.<init>(r39, r40, r41, r42, r43)
            android.widget.TextView r12 = r8.A05
            if (r12 == 0) goto L_0x4287
            r9 = r57
            X.1Ns r10 = r9.A0W
            r9 = 0
            if (r10 == 0) goto L_0x03e3
            com.instagram.user.model.User r15 = r10.CCd()
            if (r15 == 0) goto L_0x0609
            java.lang.String r9 = r15.getFullName()
            if (r9 == 0) goto L_0x0609
            int r13 = r9.length()
            if (r13 == 0) goto L_0x0609
            boolean r13 = r15.A2Q()
            if (r13 != 0) goto L_0x0609
        L_0x03e3:
            r12.setText(r9)
            if (r21 == 0) goto L_0x05e6
            r9 = 36330892133942088(0x8112c100044348, double:3.0391407060407704E-306)
            r11 = r34
            boolean r12 = X.182.A06(r11, r2, r9)
            r9 = 36330892134007625(0x8112c100054349, double:3.039140706082216E-306)
            boolean r11 = X.182.A06(r11, r2, r9)
            if (r12 == 0) goto L_0x0415
            X.PqS r10 = new X.PqS
            r9 = r65
            r10.<init>((int) r7, (java.lang.Object) r1, (java.lang.Object) r9)
            X.3aW r9 = new X.3aW
            r38 = r9
            r42 = r10
            r38.<init>(r39, r40, r41, r42, r43)
            android.widget.TextView r10 = r8.A05
            if (r10 == 0) goto L_0x4287
            X.AnonymousClass0fU.A00(r9, r10)
        L_0x0415:
            if (r11 == 0) goto L_0x0430
            X.PqS r11 = new X.PqS
            r10 = r33
            r9 = r65
            r11.<init>((int) r10, (java.lang.Object) r1, (java.lang.Object) r9)
            X.3aW r9 = new X.3aW
            r38 = r9
            r42 = r11
            r38.<init>(r39, r40, r41, r42, r43)
            android.widget.TextView r3 = r8.A00()
            X.AnonymousClass0fU.A00(r9, r3)
        L_0x0430:
            android.widget.TextView r9 = r8.A05
            if (r9 == 0) goto L_0x4287
            X.3aa r3 = X.C244063aa.END_SCENE_TITLE
            X.C244083ac.A05(r9, r3)
            android.widget.TextView r9 = r8.A03
            if (r9 == 0) goto L_0x3fbf
            X.3aa r3 = X.C244063aa.END_SCENE_CTA
            X.C244083ac.A05(r9, r3)
            r9 = 36320884860068780(0x8109a7000323ac, double:3.032812065747233E-306)
            r3 = r34
            boolean r3 = X.182.A06(r3, r2, r9)
            if (r3 == 0) goto L_0x05b3
            X.6PD r3 = r8.A08
            if (r3 == 0) goto L_0x3fb7
            r38 = r2
            r39 = r1
            r40 = r68
            r41 = r65
            r42 = r3
            r43 = r37
            X.AnonymousClass6LZ.A00(r38, r39, r40, r41, r42, r43)
        L_0x0462:
            if (r4 == 0) goto L_0x049a
            android.widget.TextView r11 = r8.A00()
            X.1Xy r3 = r4.A0C
            java.util.List r3 = r3.BxO()
            if (r3 == 0) goto L_0x047f
            java.lang.Object r3 = X.00k.A0J(r3)
            if (r3 == 0) goto L_0x047f
            r3 = r34
            boolean r3 = X.182.A06(r3, r2, r9)
            r9 = 1
            if (r3 != 0) goto L_0x0480
        L_0x047f:
            r9 = 0
        L_0x0480:
            boolean r3 = X.C297785sK.A0E(r2, r1)
            if (r9 != 0) goto L_0x05a6
            if (r3 != 0) goto L_0x05a6
            android.content.Context r3 = r11.getContext()
            android.content.res.Resources r9 = r3.getResources()
            r3 = 2131165204(0x7f070014, float:1.7944619E38)
        L_0x0493:
            int r3 = r9.getDimensionPixelSize(r3)
            X.0nA.A0T(r11, r3)
        L_0x049a:
            java.lang.String r9 = r35.getSubtitle()
            r3 = r67
            r3.A0Y = r9
            if (r9 == 0) goto L_0x059d
            int r3 = r9.length()
            if (r3 == 0) goto L_0x059d
            android.widget.TextView r3 = r8.A00()
            r3.setText(r9)
            android.widget.TextView r3 = r8.A00()
            r3.setVisibility(r0)
            android.widget.TextView r9 = r8.A00()
            X.3aa r3 = X.C244063aa.END_SCENE_SUBTITLE
            X.C244083ac.A05(r9, r3)
        L_0x04c1:
            android.view.View r11 = r8.A02
            if (r11 == 0) goto L_0x3fb3
            android.graphics.drawable.GradientDrawable$Orientation r10 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r3 = 2131099782(0x7f060086, float:1.7811927E38)
            int r9 = r14.getColor(r3)
            r3 = 2131099799(0x7f060097, float:1.7811961E38)
            int r3 = r14.getColor(r3)
            int[] r9 = new int[]{r9, r3}
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>(r10, r9)
            r11.setBackground(r3)
            android.widget.TextView r14 = r8.A05
            if (r14 == 0) goto L_0x4287
            java.lang.String r13 = "end_scene_title_tap"
            android.content.Context r12 = r14.getContext()
            X.6Lo r11 = new X.6Lo
            r10 = r68
            r9 = r67
            r3 = r65
            r11.<init>(r10, r9, r3, r13)
            android.view.GestureDetector r3 = new android.view.GestureDetector
            r3.<init>(r12, r11)
            X.6Lp r9 = new X.6Lp
            r9.<init>(r3)
            r14.setOnTouchListener(r9)
            android.widget.TextView r14 = r8.A00()
            java.lang.String r13 = "end_scene_subtitle_tap"
            android.content.Context r12 = r14.getContext()
            X.6Lo r11 = new X.6Lo
            r9 = r67
            r3 = r65
            r11.<init>(r10, r9, r3, r13)
            android.view.GestureDetector r3 = new android.view.GestureDetector
            r3.<init>(r12, r11)
            X.6Lp r9 = new X.6Lp
            r9.<init>(r3)
            r14.setOnTouchListener(r9)
            android.view.View r9 = r8.A02
            if (r9 == 0) goto L_0x3fb3
            android.content.Context r10 = r9.getContext()
            X.6Lq r3 = new X.6Lq
            r8 = r65
            r3.<init>(r8)
            android.view.GestureDetector r8 = new android.view.GestureDetector
            r8.<init>(r10, r3)
            X.6Lr r10 = new X.6Lr
            r3 = r65
            r10.<init>(r8, r3)
            r9.setOnTouchListener(r10)
        L_0x0541:
            X.6Pp r10 = r6.A0U
            X.0qQ.A0B(r10, r0)
            if (r4 == 0) goto L_0x0593
            X.1Xy r3 = r4.A0C
            X.3lZ r3 = r3.getInjected()
            if (r3 == 0) goto L_0x0593
            java.lang.String r9 = r3.AZ4()
        L_0x0554:
            X.1Xy r3 = r4.A0C
            X.3lZ r3 = r3.getInjected()
            if (r3 == 0) goto L_0x0598
            java.lang.String r11 = r3.C9L()
        L_0x0560:
            X.1Xy r3 = r4.A0C
            X.3lZ r3 = r3.getInjected()
            if (r3 == 0) goto L_0x1bea
            X.3yH r3 = r3.C5I()
            if (r3 == 0) goto L_0x1bea
            java.util.List r3 = r3.BVS()
            if (r3 == 0) goto L_0x1bea
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r12 = r3.iterator()
        L_0x057d:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x1bec
            java.lang.Object r3 = r12.next()
            X.XAn r3 = (X.C21034XAn) r3
            X.9JF r3 = X.C16815V6w.A00(r3)
            if (r3 == 0) goto L_0x057d
            r8.add(r3)
            goto L_0x057d
        L_0x0593:
            r9 = r27
            if (r4 == 0) goto L_0x0598
            goto L_0x0554
        L_0x0598:
            r11 = r27
            if (r4 == 0) goto L_0x1bea
            goto L_0x0560
        L_0x059d:
            android.widget.TextView r3 = r8.A00()
            r3.setVisibility(r7)
            goto L_0x04c1
        L_0x05a6:
            android.content.Context r3 = r11.getContext()
            android.content.res.Resources r9 = r3.getResources()
            r3 = 2131165196(0x7f07000c, float:1.7944602E38)
            goto L_0x0493
        L_0x05b3:
            boolean r3 = X.C297785sK.A0E(r2, r1)
            if (r3 == 0) goto L_0x0462
            X.ADV r37 = X.ADV.A00
            X.0qQ.A0A(r14)
            if (r4 == 0) goto L_0x05e3
            X.1Xy r3 = r4.A0C
            X.41Z r3 = r3.BUC()
            if (r3 == 0) goto L_0x05e3
            X.4hQ r39 = r3.B1Z()
        L_0x05cc:
            X.6P0 r3 = r8.A07
            if (r3 == 0) goto L_0x3fbb
            r38 = r14
            r40 = r2
            r41 = r1
            r42 = r68
            r43 = r65
            r44 = r3
            r45 = r0
            r37.A00(r38, r39, r40, r41, r42, r43, r44, r45)
            goto L_0x0462
        L_0x05e3:
            r39 = 0
            goto L_0x05cc
        L_0x05e6:
            X.0qQ.A0A(r14)
            java.lang.Boolean r41 = java.lang.Boolean.valueOf(r0)
            r38 = r14
            r40 = r1
            r42 = r27
            r43 = r27
            java.lang.CharSequence r9 = X.AnonymousClass4EQ.A06(r38, r39, r40, r41, r42, r43)
            android.widget.TextView r3 = r8.A03
            if (r3 == 0) goto L_0x3fbf
            r3.setText(r9)
            android.view.View r3 = r8.A00
            if (r3 == 0) goto L_0x3fc3
            X.AnonymousClass0fU.A00(r11, r3)
            goto L_0x0430
        L_0x0609:
            java.lang.String r9 = X.C297785sK.A06(r2, r1, r10)
            goto L_0x03e3
        L_0x060f:
            int r12 = X.AnonymousClass0nB.A01(r3)
            goto L_0x0317
        L_0x0615:
            r3.setVisibility(r7)
            goto L_0x02ce
        L_0x061a:
            r9 = r67
            r3.A00 = r9
            X.C307396Py.A00(r3)
            if (r21 != 0) goto L_0x025c
            android.widget.LinearLayout r9 = r3.A01
            r9.setVisibility(r0)
            r10 = r32
            r9 = r68
            boolean r9 = X.C307096Ou.A01(r10, r2, r1, r9)
            if (r9 == 0) goto L_0x063f
            boolean r9 = X.C309506Yn.A08(r2, r1)
            if (r9 != 0) goto L_0x063f
            X.6Ot r10 = r3.A0A
            r9 = r65
            X.C307406Pz.A00(r2, r1, r9, r10)
        L_0x063f:
            r10 = r32
            r9 = r68
            boolean r9 = X.C309506Yn.A06(r10, r2, r1, r9)
            if (r9 == 0) goto L_0x067c
            X.3Dp r11 = X.C238833Dp.A00(r2)
            X.0qQ.A07(r11)
            X.6lB r13 = r3.A05
            android.view.View r10 = r13.A04
            X.3Ds r9 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            r11.A05(r10, r9)
            java.lang.String r12 = r1.A0k
            r11 = 34
            X.9Lv r10 = new X.9Lv
            r9 = r65
            r10.<init>(r11, r1, r9)
            X.3aW r9 = new X.3aW
            r37 = r9
            r38 = r2
            r39 = r12
            r40 = r27
            r41 = r10
            r42 = r22
            r37.<init>(r38, r39, r40, r41, r42)
            X.Pvu r10 = r3.AjF()
            X.AnonymousClass6YT.A00(r9, r1, r10, r13)
        L_0x067c:
            r9 = r68
            boolean r9 = X.C297785sK.A0J(r2, r1, r9)
            if (r9 == 0) goto L_0x0e33
            java.lang.Integer r9 = X.AnonymousClass05K.A01
        L_0x0686:
            X.6Oy r13 = r3.A07
            X.6Yf r10 = r3.A00
            r21 = r10
            r11 = r32
            r10 = r68
            boolean r10 = X.C309506Yn.A06(r11, r2, r1, r10)
            if (r10 != 0) goto L_0x06a2
            r10 = r57
            boolean r10 = r10.A1C
            if (r10 == 0) goto L_0x0e2f
            boolean r10 = r1.CWu()
            if (r10 == 0) goto L_0x0e2f
        L_0x06a2:
            r19 = 1
        L_0x06a4:
            r10 = r61
            boolean r17 = X.C297785sK.A0N(r2, r1, r10)
            r10 = r22
            X.0qQ.A0B(r13, r10)
            r10 = r36
            X.0qQ.A0B(r9, r10)
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            if (r9 == r10) goto L_0x080d
            if (r21 == 0) goto L_0x080d
            android.view.View r10 = r13.A04
            r35 = r10
            android.content.Context r12 = r35.getContext()
            X.3oV r10 = r13.A05
            r33 = r10
            android.view.View r14 = r33.getView()
            android.widget.TextView r14 = (android.widget.TextView) r14
            X.AnonymousClass6Q0.A00(r13)
            r10 = r22
            r14.setClickable(r10)
            r14.setLongClickable(r10)
            int r9 = r9.intValue()
            if (r9 != r10) goto L_0x080d
            android.content.Context r11 = r14.getContext()
            X.0qQ.A07(r11)
            r9 = 36880763911864678(0x8306dc00030166, double:3.386881832554945E-306)
            r15 = r34
            java.lang.String r10 = X.182.A04(r15, r2, r9)
            java.util.Map r9 = X.C69333NjY.A01
            java.lang.Object r15 = r9.get(r10)
            X.NjY r15 = (X.C69333NjY) r15
            if (r15 != 0) goto L_0x06fb
            X.NjY r15 = X.C69333NjY.A04
        L_0x06fb:
            int r10 = r15.ordinal()
            r9 = r23
            if (r10 == r9) goto L_0x0e0a
            r9 = r22
            if (r10 != r9) goto L_0x3fef
            r9 = 2131973860(0x7f1356e4, float:1.9584768E38)
            java.lang.String r10 = r11.getString(r9)
            X.0qQ.A07(r10)
        L_0x0711:
            X.AP9 r9 = new X.AP9
            r37 = r9
            r38 = r14
            r39 = r1
            r40 = r21
            r41 = r6
            r42 = r65
            r43 = r13
            r37.<init>(r38, r39, r40, r41, r42, r43)
            r14.setText(r10)
            r14.setOnTouchListener(r9)
            X.0qQ.A0A(r12)
            android.view.View r15 = r33.getView()
            android.widget.TextView r15 = (android.widget.TextView) r15
            X.0qQ.A0B(r12, r0)
            r9 = r22
            X.0qQ.A0B(r15, r9)
            android.graphics.RectF r9 = X.0nA.A01
            r14 = r27
            r15.setCompoundDrawablesRelativeWithIntrinsicBounds(r14, r14, r14, r14)
            r9 = 8388693(0x800055, float:1.1755063E-38)
            r10 = 2131240020(0x7f082454, float:1.8096363E38)
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r10)
            r10 = 2131239741(0x7f08233d, float:1.8095798E38)
            android.graphics.drawable.Drawable r10 = r12.getDrawable(r10)
            android.graphics.drawable.Drawable[] r11 = new android.graphics.drawable.Drawable[]{r11, r10}
            android.graphics.drawable.TransitionDrawable r10 = new android.graphics.drawable.TransitionDrawable
            r10.<init>(r11)
            r15.setBackground(r10)
            r11 = 2131100661(0x7f0603f5, float:1.781371E38)
            int r10 = r12.getColor(r11)
            r15.setTextColor(r10)
            int r10 = r12.getColor(r11)
            android.content.res.ColorStateList r10 = android.content.res.ColorStateList.valueOf(r10)
            r15.setCompoundDrawableTintList(r10)
            android.view.ViewGroup$LayoutParams r11 = r15.getLayoutParams()
            java.lang.String r14 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            X.0qQ.A0C(r11, r14)
            android.widget.FrameLayout$LayoutParams r11 = (android.widget.FrameLayout.LayoutParams) r11
            r11.gravity = r9
            android.content.res.Resources r9 = r12.getResources()
            r10 = 2131165184(0x7f070000, float:1.7944578E38)
            int r9 = r9.getDimensionPixelSize(r10)
            r11.setMarginEnd(r9)
            android.content.res.Resources r9 = r12.getResources()
            int r9 = r9.getDimensionPixelSize(r10)
            r11.bottomMargin = r9
            android.content.res.Resources r10 = r12.getResources()
            r9 = 2131165205(0x7f070015, float:1.794462E38)
            int r9 = r10.getDimensionPixelSize(r9)
            r11.height = r9
            r15.setLayoutParams(r11)
            android.content.res.Resources r9 = r12.getResources()
            r11 = 2131165184(0x7f070000, float:1.7944578E38)
            int r10 = r9.getDimensionPixelSize(r11)
            android.content.res.Resources r9 = r12.getResources()
            int r9 = r9.getDimensionPixelSize(r11)
            r15.setPaddingRelative(r10, r0, r9, r0)
            android.view.View r9 = r33.getView()
            android.graphics.drawable.Drawable r11 = r9.getBackground()
            boolean r9 = r11 instanceof android.graphics.drawable.TransitionDrawable
            r10 = 0
            if (r9 == 0) goto L_0x0e07
            android.graphics.drawable.TransitionDrawable r11 = (android.graphics.drawable.TransitionDrawable) r11
        L_0x07cc:
            boolean r9 = r13.A06
            if (r9 == 0) goto L_0x07d8
            if (r11 == 0) goto L_0x07d8
            r9 = r22
            r11.setCrossFadeEnabled(r9)
            r10 = r11
        L_0x07d8:
            r13.A02 = r10
            if (r17 != 0) goto L_0x07e4
            boolean r9 = X.C316216lI.A0A(r12)
            r9 = r9 ^ 1
            if (r9 == 0) goto L_0x0808
        L_0x07e4:
            if (r19 == 0) goto L_0x0df5
            android.view.View r9 = r33.getView()
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            X.0qQ.A0C(r9, r14)
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            android.content.res.Resources r11 = r12.getResources()
            r10 = 2131165207(0x7f070017, float:1.7944625E38)
            float r10 = r11.getDimension(r10)
            int r10 = (int) r10
            r9.bottomMargin = r10
            android.view.View r10 = r33.getView()
            r10.setLayoutParams(r9)
        L_0x0808:
            r9 = r35
            r9.setVisibility(r0)
        L_0x080d:
            r9 = r57
            boolean r9 = r9.A1C
            if (r9 == 0) goto L_0x082e
            boolean r9 = r1.CWu()
            if (r9 == 0) goto L_0x082e
            X.3oV r13 = r3.A03
            android.view.View r12 = r13.getView()
            X.6LV r11 = new X.6LV
            r10 = r68
            r9 = r65
            r11.<init>(r1, r10, r9)
            X.AnonymousClass0fU.A00(r11, r12)
            r13.setVisibility(r0)
        L_0x082e:
            X.6Ox r10 = r3.A06
            r9 = r22
            X.0qQ.A0B(r10, r9)
            r9 = r61
            boolean r9 = X.C297785sK.A0N(r2, r1, r9)
            X.3oV r13 = r10.A00
            if (r9 != 0) goto L_0x0cd4
            r13.setVisibility(r7)
        L_0x0842:
            r10 = r32
            r9 = r68
            boolean r9 = X.C309506Yn.A06(r10, r2, r1, r9)
            if (r9 != 0) goto L_0x0af2
            X.6Oz r11 = r3.A09
            r9 = r23
            X.0qQ.A0B(r11, r9)
            X.6PD r9 = r11.A00
            if (r9 == 0) goto L_0x0c3e
            if (r4 == 0) goto L_0x0cd0
        L_0x0859:
            X.1Xy r9 = r4.A0C
            X.3lZ r9 = r9.getInjected()
            if (r9 == 0) goto L_0x0cd0
            X.3l2 r19 = r9.AaH()
        L_0x0865:
            boolean r10 = X.C297785sK.A0G(r2, r1)
            X.6PD r9 = r11.A00
            if (r10 == 0) goto L_0x0c31
            if (r9 == 0) goto L_0x0880
            java.lang.String r42 = r69.getModuleName()
            r37 = r2
            r38 = r1
            r39 = r68
            r40 = r65
            r41 = r9
            X.AnonymousClass6LZ.A00(r37, r38, r39, r40, r41, r42)
        L_0x0880:
            if (r4 == 0) goto L_0x0c2e
            X.1Xy r9 = r4.A0C
            X.41Z r9 = r9.BUC()
            if (r9 == 0) goto L_0x0c2e
            X.4hQ r9 = r9.B7C()
            if (r9 == 0) goto L_0x0c2e
            com.instagram.api.schemas.MoreInfoType r9 = r9.BUD()
        L_0x0894:
            boolean r9 = X.C297785sK.A09(r9)
            if (r9 == 0) goto L_0x0c25
            r9 = 36321683723855502(0x810a610001268e, double:3.033317270422722E-306)
            r12 = r34
            boolean r9 = X.182.A06(r12, r2, r9)
            if (r9 == 0) goto L_0x0c25
            X.ADV r37 = X.ADV.A00
            if (r4 == 0) goto L_0x0c21
            X.1Xy r9 = r4.A0C
            X.41Z r9 = r9.BUC()
            if (r9 == 0) goto L_0x0c21
            X.4hQ r39 = r9.B7C()
        L_0x08b7:
            X.6P0 r9 = r11.A03
            r38 = r32
            r40 = r2
            r41 = r1
            r42 = r68
            r43 = r65
            r44 = r9
            r45 = r0
            r37.A00(r38, r39, r40, r41, r42, r43, r44, r45)
        L_0x08ca:
            boolean r9 = X.C316216lI.A0B(r32)
            if (r9 == 0) goto L_0x0c13
            java.lang.Boolean r9 = r1.A0N()
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0c13
            boolean r9 = X.C297785sK.A0S(r4)
            if (r9 == 0) goto L_0x0b9b
            X.6P2 r14 = r11.A05
            X.0qQ.A0B(r14, r0)
            r14.A00()
            if (r4 == 0) goto L_0x09b3
            r9 = r22
            java.util.ArrayList r9 = r4.A3K(r9)
            if (r9 == 0) goto L_0x09b3
            java.lang.Object r13 = X.00k.A0J(r9)
            com.instagram.user.model.Product r13 = (com.instagram.user.model.Product) r13
            if (r13 == 0) goto L_0x09b3
            r9 = r22
            java.util.ArrayList r9 = r4.A3K(r9)
            if (r9 == 0) goto L_0x09b3
            int r9 = r9.size()
            X.3oV r10 = r14.A08
            android.view.View r10 = r10.getView()
            r10.setVisibility(r0)
            com.instagram.model.mediasize.ImageInfo r12 = r13.A07
            r17 = 0
            if (r12 == 0) goto L_0x0b97
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            com.instagram.model.mediasize.ExtendedImageUrl r12 = X.1iI.A04(r12, r10)
        L_0x091b:
            r10 = r22
            if (r9 <= r10) goto L_0x0b7a
            android.widget.TextView r10 = r14.A03
            if (r10 == 0) goto L_0x3feb
            int r9 = r9 - r22
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            r15 = r22
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r9, r15)
            java.lang.String r9 = "+%d"
            java.lang.String r9 = java.lang.String.format(r9, r15)
            X.0qQ.A07(r9)
            r10.setText(r9)
            if (r12 == 0) goto L_0x094a
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r10 = r14.A07
            if (r10 == 0) goto L_0x3fdf
            r9 = r69
            r10.setUrl(r12, r9)
        L_0x094a:
            r9 = r22
            java.util.ArrayList r9 = r4.A3K(r9)
            if (r9 == 0) goto L_0x0971
            r10 = r22
            java.lang.Object r9 = r9.get(r10)
            com.instagram.user.model.Product r9 = (com.instagram.user.model.Product) r9
            if (r9 == 0) goto L_0x0971
            com.instagram.model.mediasize.ImageInfo r10 = r9.A07
            if (r10 == 0) goto L_0x0971
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            com.instagram.model.mediasize.ExtendedImageUrl r12 = X.1iI.A04(r10, r9)
            if (r12 == 0) goto L_0x0971
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r10 = r14.A06
            if (r10 == 0) goto L_0x3fdb
            r9 = r69
            r10.setUrl(r12, r9)
        L_0x0971:
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r9 = r14.A07
            if (r9 == 0) goto L_0x3fdf
            r9.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r9 = r14.A06
            if (r9 == 0) goto L_0x3fdb
            r9.setVisibility(r0)
        L_0x097f:
            android.widget.TextView r10 = r14.A04
            if (r10 == 0) goto L_0x3fe7
            java.lang.String r9 = r13.A0J
            r10.setText(r9)
            android.widget.TextView r9 = r14.A02
            if (r9 == 0) goto L_0x3fd7
            com.instagram.user.model.User r10 = r13.A0B
            if (r10 == 0) goto L_0x0994
            java.lang.String r17 = r10.getUsername()
        L_0x0994:
            r10 = r17
            r9.setText(r10)
            java.util.List r10 = r1.A0b()
            X.3WT r9 = X.AnonymousClass3WT.MULTI_PRODUCT
            X.3ui r12 = X.C289745e8.A00(r9, r10)
            if (r12 == 0) goto L_0x09b3
            android.view.View r13 = r14.A01
            if (r13 == 0) goto L_0x3fd3
            X.FNg r10 = new X.FNg
            r9 = r65
            r10.<init>(r12, r9, r14)
        L_0x09b0:
            X.AnonymousClass0fU.A00(r10, r13)
        L_0x09b3:
            boolean r9 = X.C297785sK.A0l(r68)
            if (r9 != 0) goto L_0x0b71
            r10 = r32
            r9 = r68
            boolean r9 = X.C309506Yn.A06(r10, r2, r1, r9)
            if (r9 != 0) goto L_0x0b71
            boolean r9 = X.C316216lI.A0B(r32)
            if (r9 == 0) goto L_0x0b71
            boolean r9 = X.C297785sK.A0G(r2, r1)
            if (r9 != 0) goto L_0x0b71
            java.lang.Boolean r9 = r1.A0N()
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0b71
            r10 = r65
            r9 = r19
            boolean r9 = r10.Esy(r9)
            if (r9 == 0) goto L_0x0b71
            X.6P6 r9 = r11.A02
            r10 = r23
            X.0qQ.A0B(r9, r10)
            X.3oV r13 = r9.A05
            r13.setVisibility(r7)
            r10 = r32
            r9.A00 = r10
            r10 = r65
            r9.A04 = r10
            java.lang.String r11 = r1.A0U(r2)
            if (r11 == 0) goto L_0x0af2
            if (r4 == 0) goto L_0x0b6e
            X.1Xy r10 = r4.A0C
            X.3lZ r10 = r10.getInjected()
            if (r10 == 0) goto L_0x0b6e
            X.3l2 r12 = r10.AaH()
        L_0x0a0b:
            r10 = r65
            boolean r10 = r10.Esy(r12)
            if (r10 == 0) goto L_0x0af2
            boolean r10 = r65.CKa()
            if (r10 != 0) goto L_0x0af2
            if (r12 == 0) goto L_0x0af2
            X.4ft r15 = r12.C0O()
            if (r15 == 0) goto L_0x0af2
            java.lang.String r38 = r15.Br0()
            if (r38 != 0) goto L_0x0a33
            r12 = 2131964435(0x7f133213, float:1.9565652E38)
            r10 = r32
            java.lang.String r38 = r10.getString(r12)
            X.0qQ.A07(r38)
        L_0x0a33:
            java.lang.String r39 = r15.Bqz()
            if (r39 != 0) goto L_0x0a3b
            java.lang.String r39 = "check_pano_filled_12"
        L_0x0a3b:
            java.lang.String r40 = r15.Bqx()
            if (r40 != 0) goto L_0x0a4d
            r12 = 2131973001(0x7f135389, float:1.9583025E38)
            r10 = r32
            java.lang.String r40 = r10.getString(r12)
            X.0qQ.A07(r40)
        L_0x0a4d:
            java.lang.String r42 = r15.Bqy()
            java.lang.String r14 = "circle_check_pano_outline_24"
            if (r42 != 0) goto L_0x0a57
            r42 = r14
        L_0x0a57:
            java.lang.String r43 = r15.CBO()
            if (r43 != 0) goto L_0x0a69
            r12 = 2131975851(0x7f135eab, float:1.9588806E38)
            r10 = r32
            java.lang.String r43 = r10.getString(r12)
            X.0qQ.A07(r43)
        L_0x0a69:
            java.lang.String r44 = r15.CBN()
            if (r44 != 0) goto L_0x0a7b
            r12 = 2131975852(0x7f135eac, float:1.9588808E38)
            r10 = r32
            java.lang.String r44 = r10.getString(r12)
            X.0qQ.A07(r44)
        L_0x0a7b:
            X.9JO r10 = new X.9JO
            r37 = r10
            r41 = r22
            r37.<init>(r38, r39, r40, r41, r42, r43, r44)
            r9.A02 = r10
            java.lang.String r38 = r15.Bqw()
            if (r38 != 0) goto L_0x0a98
            r12 = 2131968512(0x7f134200, float:1.957392E38)
            r10 = r32
            java.lang.String r38 = r10.getString(r12)
            X.0qQ.A07(r38)
        L_0x0a98:
            java.lang.String r39 = r15.Bqv()
            if (r39 != 0) goto L_0x0aa0
            java.lang.String r39 = "x_pano_filled_12"
        L_0x0aa0:
            java.lang.String r40 = r15.Bqt()
            if (r40 != 0) goto L_0x0ab2
            r12 = 2131972994(0x7f135382, float:1.9583011E38)
            r10 = r32
            java.lang.String r40 = r10.getString(r12)
            X.0qQ.A07(r40)
        L_0x0ab2:
            java.lang.String r42 = r15.Bqu()
            if (r42 != 0) goto L_0x0aba
            r42 = r14
        L_0x0aba:
            java.lang.String r43 = r15.CBO()
            if (r43 != 0) goto L_0x0acc
            r12 = 2131975851(0x7f135eab, float:1.9588806E38)
            r10 = r32
            java.lang.String r43 = r10.getString(r12)
            X.0qQ.A07(r43)
        L_0x0acc:
            java.lang.String r44 = r15.CBN()
            if (r44 != 0) goto L_0x0ade
            r12 = 2131975852(0x7f135eac, float:1.9588808E38)
            r10 = r32
            java.lang.String r44 = r10.getString(r12)
            X.0qQ.A07(r44)
        L_0x0ade:
            X.9JO r10 = new X.9JO
            r37 = r10
            r37.<init>(r38, r39, r40, r41, r42, r43, r44)
            r9.A01 = r10
            r10 = r65
            boolean r10 = r10.CQy(r11)
            if (r10 == 0) goto L_0x0b52
            r13.setVisibility(r0)
        L_0x0af2:
            X.6P8 r12 = r3.A08
            r3 = r23
            X.0qQ.A0B(r12, r3)
            X.2wp r3 = new X.2wp
            r3.<init>(r2)
            boolean r9 = r3.A04()
            if (r9 == 0) goto L_0x0b4b
            boolean r3 = r3.A05(r4)
            if (r3 == 0) goto L_0x0b4b
            X.3oV r3 = r12.A07
            r3.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r11 = r12.A03
            if (r11 == 0) goto L_0x3fcf
            r10 = 2131974401(0x7f135901, float:1.9585865E38)
            X.2wp r3 = new X.2wp
            r3.<init>(r2)
            int r3 = r3.A00(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r9 = new java.lang.Object[]{r3}
            r3 = r32
            java.lang.String r3 = r3.getString(r10, r9)
            r11.setText(r3)
            com.instagram.common.ui.base.IgTextView r10 = r12.A04
            if (r10 == 0) goto L_0x3fcb
            boolean r3 = X.C316216lI.A0B(r32)
            r3 = r3 ^ 1
            r9 = 2131974402(0x7f135902, float:1.9585867E38)
            if (r3 == 0) goto L_0x0b42
            r9 = 2131974403(0x7f135903, float:1.958587E38)
        L_0x0b42:
            r3 = r32
            java.lang.String r3 = r3.getString(r9)
            r10.setText(r3)
        L_0x0b4b:
            X.3oV r3 = r12.A07
            r3.setVisibility(r7)
            goto L_0x025c
        L_0x0b52:
            boolean r10 = r65.CSU()
            if (r10 != 0) goto L_0x0af2
            X.IO2 r12 = new X.IO2
            r10 = r65
            r12.<init>(r10, r9, r11)
            X.1Ng r10 = X.AnonymousClass1Nd.A00(r2)
            java.lang.Class<X.INa> r9 = X.C57060INa.class
            r10.A01(r12, r9)
            r9 = r65
            r9.EUb(r12)
            goto L_0x0af2
        L_0x0b6e:
            r12 = 0
            goto L_0x0a0b
        L_0x0b71:
            X.6P6 r9 = r11.A02
            X.3oV r9 = r9.A05
            r9.setVisibility(r7)
            goto L_0x0af2
        L_0x0b7a:
            if (r12 == 0) goto L_0x0b85
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r10 = r14.A05
            if (r10 == 0) goto L_0x3fe3
            r9 = r69
            r10.setUrl(r12, r9)
        L_0x0b85:
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r9 = r14.A05
            if (r9 == 0) goto L_0x3fe3
            r9.setVisibility(r0)
            android.widget.TextView r10 = r14.A03
            if (r10 == 0) goto L_0x3feb
            java.lang.String r9 = ""
            r10.setText(r9)
            goto L_0x097f
        L_0x0b97:
            r12 = r27
            goto L_0x091b
        L_0x0b9b:
            boolean r9 = X.C297785sK.A0R(r4)
            if (r9 == 0) goto L_0x09b3
            X.6P4 r14 = r11.A04
            android.view.View r13 = r11.A01
            X.0qQ.A0B(r14, r0)
            X.3oV r9 = r14.A03
            r9.setVisibility(r7)
            if (r4 == 0) goto L_0x09b3
            r10 = r22
            java.util.ArrayList r10 = r4.A3K(r10)
            if (r10 == 0) goto L_0x09b3
            java.lang.Object r12 = X.00k.A0J(r10)
            com.instagram.user.model.Product r12 = (com.instagram.user.model.Product) r12
            if (r12 == 0) goto L_0x09b3
            r10 = r22
            java.util.ArrayList r10 = r4.A3K(r10)
            if (r10 == 0) goto L_0x09b3
            int r15 = r10.size()
            r9.setVisibility(r0)
            android.widget.TextView r10 = r14.A01
            if (r10 == 0) goto L_0x3feb
            r9 = r22
            if (r15 <= r9) goto L_0x0c10
            int r15 = r15 - r22
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r15 = new java.lang.Object[]{r9}
            r9 = r22
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r9)
            java.lang.String r9 = " + %d"
            java.lang.String r9 = java.lang.String.format(r9, r15)
            X.0qQ.A07(r9)
        L_0x0bef:
            r10.setText(r9)
            android.widget.TextView r9 = r14.A02
            if (r9 == 0) goto L_0x3fe7
            java.lang.String r10 = r12.A0J
            r9.setText(r10)
            java.util.List r10 = r1.A0b()
            X.3WT r9 = X.AnonymousClass3WT.MULTI_PRODUCT
            X.3ui r12 = X.C289745e8.A00(r9, r10)
            if (r12 == 0) goto L_0x09b3
            X.FNf r10 = new X.FNf
            r9 = r65
            r10.<init>(r13, r12, r9)
            goto L_0x09b0
        L_0x0c10:
            java.lang.String r9 = ""
            goto L_0x0bef
        L_0x0c13:
            X.6P4 r9 = r11.A04
            X.3oV r9 = r9.A03
            r9.setVisibility(r7)
            X.6P2 r9 = r11.A05
            r9.A00()
            goto L_0x09b3
        L_0x0c21:
            r39 = r27
            goto L_0x08b7
        L_0x0c25:
            X.6P0 r9 = r11.A03
            X.3oV r9 = r9.A04
            r9.setVisibility(r7)
            goto L_0x08ca
        L_0x0c2e:
            r9 = 0
            goto L_0x0894
        L_0x0c31:
            if (r9 == 0) goto L_0x0880
            X.3oV r9 = r9.A03
            android.view.View r9 = r9.getView()
            r9.setVisibility(r7)
            goto L_0x0880
        L_0x0c3e:
            if (r4 == 0) goto L_0x0cd0
            X.1Xy r9 = r4.A0C
            X.41Z r9 = r9.BUC()
            if (r9 == 0) goto L_0x0859
            X.4hQ r9 = r9.B7C()
            if (r9 == 0) goto L_0x0859
            X.4rk r13 = r9.B3b()
            if (r13 == 0) goto L_0x0859
            com.instagram.api.schemas.MoreInfoFacepileSizeType r9 = r13.Bwd()
            com.instagram.api.schemas.MoreInfoFacepileSizeType r12 = com.instagram.api.schemas.MoreInfoFacepileSizeType.LARGE
            if (r9 != r12) goto L_0x0c98
            com.instagram.api.schemas.MoreInfoFacepilePositionType r10 = r13.Bdn()
            com.instagram.api.schemas.MoreInfoFacepilePositionType r9 = com.instagram.api.schemas.MoreInfoFacepilePositionType.BEFORE_TEXT
            if (r10 != r9) goto L_0x0c98
            java.lang.Integer r13 = X.AnonymousClass05K.A0u
        L_0x0c66:
            java.lang.Integer r9 = X.AnonymousClass05K.A15
            if (r13 == r9) goto L_0x0859
            int r12 = r13.intValue()
            r9 = 3
            if (r12 == r9) goto L_0x0c94
            r9 = r36
            if (r12 == r9) goto L_0x0c94
            r9 = 5
            if (r12 == r9) goto L_0x0c7e
            r10 = 6
            r9 = 2131441536(0x7f0b3780, float:1.8505086E38)
            if (r12 != r10) goto L_0x0c81
        L_0x0c7e:
            r9 = 2131441534(0x7f0b377e, float:1.8505082E38)
        L_0x0c81:
            android.view.View r10 = r11.A01
            android.view.View r9 = r10.requireViewById(r9)
            X.3oV r10 = X.2b1.A01(r9, r0, r0)
            X.6PD r9 = new X.6PD
            r9.<init>(r10, r13)
            r11.A00 = r9
            goto L_0x0859
        L_0x0c94:
            r9 = 2131441538(0x7f0b3782, float:1.850509E38)
            goto L_0x0c81
        L_0x0c98:
            com.instagram.api.schemas.MoreInfoFacepileSizeType r9 = r13.Bwd()
            if (r9 != r12) goto L_0x0ca9
            com.instagram.api.schemas.MoreInfoFacepilePositionType r10 = r13.Bdn()
            com.instagram.api.schemas.MoreInfoFacepilePositionType r9 = com.instagram.api.schemas.MoreInfoFacepilePositionType.BELOW_TEXT
            if (r10 != r9) goto L_0x0ca9
            java.lang.Integer r13 = X.AnonymousClass05K.A0Y
            goto L_0x0c66
        L_0x0ca9:
            com.instagram.api.schemas.MoreInfoFacepileSizeType r9 = r13.Bwd()
            com.instagram.api.schemas.MoreInfoFacepileSizeType r12 = com.instagram.api.schemas.MoreInfoFacepileSizeType.SMALL
            if (r9 != r12) goto L_0x0cbc
            com.instagram.api.schemas.MoreInfoFacepilePositionType r10 = r13.Bdn()
            com.instagram.api.schemas.MoreInfoFacepilePositionType r9 = com.instagram.api.schemas.MoreInfoFacepilePositionType.BEFORE_TEXT
            if (r10 != r9) goto L_0x0cbc
            java.lang.Integer r13 = X.AnonymousClass05K.A0j
            goto L_0x0c66
        L_0x0cbc:
            com.instagram.api.schemas.MoreInfoFacepileSizeType r9 = r13.Bwd()
            if (r9 != r12) goto L_0x0ccd
            com.instagram.api.schemas.MoreInfoFacepilePositionType r10 = r13.Bdn()
            com.instagram.api.schemas.MoreInfoFacepilePositionType r9 = com.instagram.api.schemas.MoreInfoFacepilePositionType.BELOW_TEXT
            if (r10 != r9) goto L_0x0ccd
            java.lang.Integer r13 = X.AnonymousClass05K.A0N
            goto L_0x0c66
        L_0x0ccd:
            java.lang.Integer r13 = X.AnonymousClass05K.A15
            goto L_0x0c66
        L_0x0cd0:
            r19 = r27
            goto L_0x0865
        L_0x0cd4:
            android.view.View r12 = r13.getView()
            android.content.Context r9 = r12.getContext()
            X.0qQ.A07(r9)
            int r9 = X.C316216lI.A00(r9)
            X.0nA.A0V(r12, r9)
            r9 = 36324037365935820(0x810c8500012ecc, double:3.034805723151671E-306)
            r11 = r34
            boolean r9 = X.182.A06(r11, r2, r9)
            if (r9 == 0) goto L_0x0def
            java.lang.String r9 = r1.A0V(r2)
        L_0x0cf7:
            if (r9 == 0) goto L_0x0da2
            int r10 = r9.length()
            if (r10 == 0) goto L_0x0da2
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r9)
            X.6Jl r10 = new X.6Jl
            r10.<init>()
            int r9 = r11.length()
            r11.setSpan(r10, r0, r9, r0)
            android.view.View r9 = r13.getView()
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setText(r11)
            android.view.View r14 = r13.getView()
            X.DEV r11 = new X.DEV
            r10 = r68
            r9 = r65
            r11.<init>(r1, r10, r9)
            X.AnonymousClass0fU.A00(r11, r14)
            android.view.View r10 = r13.getView()
            android.widget.TextView r10 = (android.widget.TextView) r10
            int r9 = X.C55164HdG.A00(r2)
            r10.setMaxLines(r9)
        L_0x0d36:
            r13.setVisibility(r0)
            r10 = 0
        L_0x0d3a:
            java.lang.String r15 = r1.A0W(r2)
            boolean r9 = r1.A1r(r2)
            if (r9 == 0) goto L_0x0d90
            if (r15 == 0) goto L_0x0d90
            int r9 = r15.length()
            if (r9 == 0) goto L_0x0d90
            android.view.View r14 = r13.getView()
            android.widget.TextView r14 = (android.widget.TextView) r14
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r15)
            X.6Jl r10 = new X.6Jl
            r10.<init>()
            int r9 = r11.length()
            r11.setSpan(r10, r0, r9, r0)
            java.lang.CharSequence r9 = r14.getText()
            X.0qQ.A07(r9)
            int r9 = r9.length()
            if (r9 == 0) goto L_0x0d83
            java.lang.CharSequence r9 = r14.getText()
            java.lang.String r9 = r9.toString()
            boolean r9 = X.00l.A0d(r9, r15, r0)
            if (r9 != 0) goto L_0x0d86
            java.lang.String r9 = " • "
            r14.append(r9)
        L_0x0d83:
            r14.append(r11)
        L_0x0d86:
            r13.setVisibility(r0)
        L_0x0d89:
            X.3aa r9 = X.C244063aa.DISCLAIMER
            X.C244083ac.A05(r12, r9)
            goto L_0x0842
        L_0x0d90:
            if (r10 == 0) goto L_0x0d89
            java.lang.String r2 = "ReelItem with ID "
            java.lang.String r1 = " should show a bottom banner but has no valid banner text!"
            r0 = r28
            java.lang.String r1 = X.002.A0g(r2, r0, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0da2:
            java.lang.String r9 = r1.A0X(r2)
            if (r9 == 0) goto L_0x0dec
            int r9 = r9.length()
            if (r9 == 0) goto L_0x0dec
            java.lang.String r14 = r1.A0X(r2)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.String"
            X.0qQ.A0C(r14, r9)
            android.view.View r11 = r13.getView()
            android.widget.TextView r11 = (android.widget.TextView) r11
            android.content.Context r10 = r11.getContext()
            X.0qQ.A07(r10)
            r9 = r22
            java.lang.String r9 = X.C270804hK.A00(r10, r14, r9)
            android.text.SpannableString r14 = new android.text.SpannableString
            r14.<init>(r9)
            X.6Jl r10 = new X.6Jl
            r10.<init>()
            int r9 = r14.length()
            r14.setSpan(r10, r0, r9, r0)
            r11.setText(r14)
            X.DEU r14 = new X.DEU
            r10 = r68
            r9 = r65
            r14.<init>(r1, r10, r9)
            X.AnonymousClass0fU.A00(r14, r11)
            goto L_0x0d36
        L_0x0dec:
            r10 = 1
            goto L_0x0d3a
        L_0x0def:
            java.lang.String r9 = r1.A0Y(r2)
            goto L_0x0cf7
        L_0x0df5:
            android.view.ViewGroup$LayoutParams r9 = r35.getLayoutParams()
            X.0qQ.A0C(r9, r14)
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            r9.bottomMargin = r0
            r10 = r35
            r10.setLayoutParams(r9)
            goto L_0x0808
        L_0x0e07:
            r11 = r10
            goto L_0x07cc
        L_0x0e0a:
            r10 = 2131973876(0x7f1356f4, float:1.95848E38)
            r9 = r57
            java.util.List r9 = r9.A0O(r2)
            int r15 = r9.size()
            r9 = r57
            int r9 = r9.A00
            int r15 = r15 - r9
            int r15 = r15 - r22
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = r11.getString(r10, r9)
            X.0qQ.A0A(r10)
            goto L_0x0711
        L_0x0e2f:
            r19 = 0
            goto L_0x06a4
        L_0x0e33:
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            goto L_0x0686
        L_0x0e37:
            r3.setVisibility(r7)
            r3 = r58
            r9 = r22
            r3.setEnableProgressBar(r9)
            X.6PJ r3 = r6.A0m
            X.3oV r3 = r3.A01
            boolean r9 = r3.CVM()
            if (r9 == 0) goto L_0x023e
            android.view.View r3 = r3.getView()
            com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView r3 = (com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView) r3
            r9 = r22
            r3.setEnableProgressBar(r9)
            goto L_0x023e
        L_0x0e58:
            if (r26 == 0) goto L_0x105b
            if (r84 != 0) goto L_0x0f58
            X.6PJ r11 = r6.A0m
            r3 = r19
            X.0qQ.A0B(r11, r3)
            r11.hashCode()
            r3 = r61
            X.AnonymousClass4EQ.A0D(r2, r1, r3)
            X.1vk r3 = X.C67671vk.A01
            r3.A00 = r2
            X.3oV r3 = r11.A01
            android.view.View r3 = r3.getView()
            com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView r3 = (com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView) r3
            android.content.Context r10 = r3.getContext()
            r9 = 2131100285(0x7f06027d, float:1.7812947E38)
            int r9 = r10.getColor(r9)
            r3.setPlaceHolderColor(r9)
            if (r4 == 0) goto L_0x4025
            X.1Xy r9 = r4.A0C
            com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf r9 = r9.BwB()
            if (r9 == 0) goto L_0x401d
            X.GVk r44 = X.B7C.A00(r9)
            X.6NK r42 = new X.6NK
            r42.<init>()
            android.widget.ImageView$ScaleType r9 = android.widget.ImageView.ScaleType.CENTER_CROP
            r3.setScaleType(r9)
            r3.setVisibility(r0)
            r9 = 18305455558237879(0x4108b700001eb7, double:1.895100117821944E-307)
            r12 = r34
            boolean r10 = X.1AW.A06(r12, r9)
            X.GyD r9 = r3.A04
            if (r9 == 0) goto L_0x4013
            X.62I r9 = r9.A0G
            r9.A00(r10)
            X.62E r13 = r11.A00
            r9 = 36310778806010141(0x8100760040011d, double:3.026420956466736E-306)
            boolean r9 = X.182.A06(r12, r2, r9)
            if (r9 == 0) goto L_0x1047
            int r10 = X.C56484HzG.A01
            X.IKp r9 = new X.IKp
            r9.<init>(r13)
            r3.A03(r9, r10)
            X.IKi r9 = new X.IKi
            r37 = r9
            r38 = r13
            r39 = r1
            r40 = r68
            r41 = r65
            r43 = r3
            r37.<init>(r38, r39, r40, r41, r42, r43)
            r3.setInteractivityListener((X.JQA) r9)
        L_0x0edf:
            r9 = r68
            java.util.List r48 = X.C250973mM.A00(r2, r9)
            if (r16 == 0) goto L_0x0fec
            boolean r9 = r3.CWX()
            if (r9 == 0) goto L_0x0fec
            int r10 = r48.size()
            r9 = r19
            if (r10 <= r9) goto L_0x0f49
            X.625 r9 = X.AnonymousClass624.A03
            X.624 r9 = r9.A00(r2)
            com.instagram.common.session.UserSession r12 = X.AnonymousClass624.A00(r9)
            r9 = 36310778805682458(0x810076003b011a, double:3.026420956259508E-306)
            r11 = r34
            boolean r9 = X.182.A06(r11, r12, r9)
            if (r9 == 0) goto L_0x0f49
            java.lang.String r11 = r1.A0U(r2)
            java.lang.String r9 = r1.ByO(r2)
            X.6Q6 r10 = new X.6Q6
            r10.<init>(r11, r9)
            r9 = r67
            int r9 = r9.A0I
            X.6Nn r43 = new X.6Nn
            r37 = r43
            r38 = r10
            r39 = r9
            r40 = r22
            r41 = r17
            r42 = r14
            r37.<init>(r38, r39, r40, r41, r42)
            X.GyD r9 = r3.A04
            if (r9 == 0) goto L_0x4013
            X.621 r3 = r9.A0H
            boolean r3 = r3.CVg()
            if (r3 == 0) goto L_0x0f49
            X.62H r3 = r9.A0K
            if (r3 == 0) goto L_0x0f49
            r42 = r3
            r45 = r9
            r46 = r9
            r47 = r1
            r42.A00(r43, r44, r45, r46, r47, r48)
        L_0x0f49:
            r3 = r65
            r3.DzQ(r1)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r3 = r6.A0o
            r3.setVisibility(r7)
            X.6PI r3 = r6.A0T
            r3.A01()
        L_0x0f58:
            X.6PA r11 = r6.A0Y
            r3 = r57
            boolean r3 = r3.A17(r5)
            if (r3 == 0) goto L_0x0f90
            r3 = r68
            boolean r3 = r3.A07
            if (r3 != 0) goto L_0x0f90
            r3 = r68
            java.util.List r3 = X.C250973mM.A00(r5, r3)
            int r9 = r3.size()
            r3 = r57
            int r3 = r3.A00
            int r3 = r3 + 1
            if (r9 <= r3) goto L_0x0f90
            boolean r3 = X.C297785sK.A0C(r5, r1)
            if (r3 == 0) goto L_0x0f90
            r9 = 36880763911864678(0x8306dc00030166, double:3.386881832554945E-306)
            r3 = r34
            java.lang.String r9 = X.182.A04(r3, r5, r9)
            java.util.Map r3 = X.C69333NjY.A01
            r3.get(r9)
        L_0x0f90:
            r3 = 1
            X.0qQ.A0B(r11, r3)
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r9 = r11.A00
            r3 = -1
            r9.A06 = r3
            boolean r3 = r61.A01()
            if (r3 == 0) goto L_0x0fb9
            r3 = r57
            boolean r3 = r3.A17(r2)
            if (r3 == 0) goto L_0x0fd2
            r3 = r68
            boolean r3 = r3.A07
            if (r3 != 0) goto L_0x0fb9
            r3 = r57
            int r3 = r3.A00
            int r10 = r3 + 1
            r3 = r17
            int r17 = java.lang.Math.min(r10, r3)
        L_0x0fb9:
            r3 = r17
            r9.setSegments(r3)
            boolean r3 = X.C309456Yi.A02(r68)
            if (r3 == 0) goto L_0x0fc8
            int r22 = r68.A01()
        L_0x0fc8:
            r3 = r22
            r9.A06(r3, r0)
            r9.setVisibility(r0)
            goto L_0x0211
        L_0x0fd2:
            boolean r3 = X.C309456Yi.A02(r68)
            if (r3 == 0) goto L_0x0fb9
            r3 = r57
            java.util.List r3 = r3.A17
            if (r3 == 0) goto L_0x0fe9
            boolean r10 = r3.isEmpty()
            if (r10 != 0) goto L_0x0fe9
            int r17 = r3.size()
            goto L_0x0fb9
        L_0x0fe9:
            r17 = -1
            goto L_0x0fb9
        L_0x0fec:
            r9 = r67
            r9.A0l = r0
            if (r16 == 0) goto L_0x100e
            X.GyD r10 = r3.A04
            if (r10 == 0) goto L_0x4013
            com.google.common.util.concurrent.ListenableFuture r9 = r10.A07
            if (r9 == 0) goto L_0x1002
            boolean r9 = r9.isCancelled()
            if (r9 != 0) goto L_0x1002
            goto L_0x0f49
        L_0x1002:
            com.google.common.util.concurrent.ListenableFuture r9 = r10.A07
            if (r9 == 0) goto L_0x100e
            boolean r9 = r9.isDone()
            if (r9 != 0) goto L_0x100e
            goto L_0x0f49
        L_0x100e:
            int r10 = X.C56484HzG.A00
            X.UU1 r9 = new X.UU1
            r9.<init>(r11)
            r3.A03(r9, r10)
            java.lang.String r11 = r1.A0U(r2)
            java.lang.String r9 = r1.ByO(r2)
            X.6Q6 r10 = new X.6Q6
            r10.<init>(r11, r9)
            r9 = r67
            int r9 = r9.A0I
            X.6Nn r37 = new X.6Nn
            r38 = r10
            r39 = r9
            r40 = r22
            r41 = r17
            r42 = r14
            r37.<init>(r38, r39, r40, r41, r42)
            r46 = r3
            r47 = r2
            r49 = r1
            r50 = r44
            r51 = r37
            r46.setShowreelAnimation(r47, r48, r49, r50, r51)
            goto L_0x0f49
        L_0x1047:
            X.IKn r9 = new X.IKn
            r38 = r9
            r39 = r1
            r40 = r68
            r41 = r65
            r43 = r3
            r38.<init>(r39, r40, r41, r42, r43)
            r3.setInteractivityListener((X.C59669JSo) r9)
            goto L_0x0edf
        L_0x105b:
            if (r24 == 0) goto L_0x1141
            if (r84 == 0) goto L_0x106c
            r9 = 2342155742226023650(0x2081023d000604e2, double:4.059424091134231E-152)
            r11 = r34
            boolean r9 = X.182.A06(r11, r5, r9)
            if (r9 == 0) goto L_0x0f58
        L_0x106c:
            X.6PK r9 = r6.A0l
            android.view.View r15 = r3.A04
            X.6Os r3 = r6.A06
            android.widget.LinearLayout r14 = r3.A01
            r3 = 2
            X.0qQ.A0B(r9, r3)
            java.lang.String r10 = r9.A01
            if (r10 != 0) goto L_0x108a
            java.lang.String r10 = "video_id:"
            java.util.concurrent.atomic.AtomicInteger r3 = X.C276604tb.A00
            int r3 = r3.incrementAndGet()
            java.lang.String r10 = X.002.A0O(r10, r3)
            r9.A01 = r10
        L_0x108a:
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.lang.String r3 = "showreel:video-id:prop"
            r12.put(r3, r10)
            X.3oV r3 = r9.A02
            android.view.View r11 = r3.getView()
            com.instagram.showreel.composition.ui.reels.IgReelsShowreelCompositionView r11 = (com.instagram.showreel.composition.ui.reels.IgReelsShowreelCompositionView) r11
            android.content.Context r13 = r11.getContext()
            r3 = 2131100285(0x7f06027d, float:1.7812947E38)
            int r3 = r13.getColor(r3)
            r11.setPlaceHolderColor(r3)
            if (r4 == 0) goto L_0x4035
            X.1Xy r3 = r4.A0C
            com.instagram.model.showreel.IgShowreelComposition r39 = r3.BwC()
            if (r39 == 0) goto L_0x402d
            X.6NK r45 = new X.6NK
            r45.<init>()
            r11.setVisibility(r0)
            r9 = 18305455558237879(0x4108b700001eb7, double:1.895100117821944E-307)
            r3 = r34
            boolean r3 = X.1AW.A06(r3, r9)
            X.6Q5 r9 = new X.6Q5
            r9.<init>(r3)
            X.JSn r3 = r11.getCompositionController()
            r3.ClL(r9)
            X.6NL r3 = new X.6NL
            r40 = r3
            r41 = r13
            r42 = r1
            r43 = r68
            r44 = r65
            r40.<init>(r41, r42, r43, r44, r45)
            r11.A02 = r3
            if (r16 == 0) goto L_0x10f0
            X.JSn r3 = r11.getCompositionController()
            boolean r3 = r3.CWX()
            if (r3 != 0) goto L_0x10fc
        L_0x10f0:
            r3 = r67
            r3.A0l = r0
            if (r16 == 0) goto L_0x110d
            int r9 = r11.A00
            r3 = r19
            if (r9 != r3) goto L_0x110d
        L_0x10fc:
            r3 = r65
            r3.DzQ(r1)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r3 = r6.A0o
            r3.setVisibility(r7)
            X.6PI r3 = r6.A0T
            r3.A01()
            goto L_0x0f58
        L_0x110d:
            java.lang.String r10 = r1.A0U(r2)
            java.lang.String r3 = r1.ByO(r2)
            X.6Q6 r9 = new X.6Q6
            r9.<init>(r10, r3)
            r3 = r67
            int r3 = r3.A0I
            X.6Nn r40 = new X.6Nn
            r41 = r9
            r42 = r3
            r43 = r0
            r44 = r19
            r45 = r0
            r40.<init>(r41, r42, r43, r44, r45)
            r41 = r71
            r37 = r11
            r38 = r2
            r42 = r12
            r43 = r1
            r44 = r15
            r45 = r14
            r46 = r69
            r37.setShowreelAnimation(r38, r39, r40, r41, r42, r43, r44, r45, r46)
            goto L_0x10fc
        L_0x1141:
            X.3IB r3 = r1.mBrandResearchSurvey
            if (r3 == 0) goto L_0x114c
            r3 = r58
            r3.setVisibility(r7)
            goto L_0x0f58
        L_0x114c:
            X.3v4 r13 = r6.A0H
            if (r13 == 0) goto L_0x1153
            X.C263164Jj.A00(r13)
        L_0x1153:
            X.0qQ.A0A(r32)
            r3 = r32
            X.0qQ.A0B(r3, r0)
            r9 = r3
            r3 = r68
            boolean r3 = X.C309506Yn.A05(r9, r2, r1, r3)
            r12 = 0
            if (r3 == 0) goto L_0x14bd
            r3 = r68
            boolean r3 = X.C309506Yn.A0B(r2, r1, r3)
            if (r3 != 0) goto L_0x14bd
            boolean r3 = X.C297785sK.A0Z(r1)
            if (r3 != 0) goto L_0x11af
            if (r4 == 0) goto L_0x11af
            X.1Xy r3 = r4.A0C
            X.3lx r3 = r3.C05()
            if (r3 == 0) goto L_0x11af
            X.3lv r3 = r3.Auw()
            if (r3 == 0) goto L_0x11af
            java.lang.Float r3 = r3.CHS()
            if (r3 == 0) goto L_0x11af
            float r11 = r3.floatValue()
            int r3 = X.C316216lI.A02(r32)
            r9 = 36603575312978879(0x820ac2000a13bf, double:3.2115866464706666E-306)
            r14 = r34
            long r9 = X.182.A01(r14, r2, r9)
            int r14 = (int) r9
            float r10 = (float) r3
            float r11 = r11 * r10
            int r14 = r14 / 2
            float r9 = (float) r14
            float r11 = r11 - r9
            r9 = 1063675494(0x3f666666, float:0.9)
            float r10 = r10 * r9
            int r9 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x11af
            int r9 = (int) r11
            int r3 = r3 - r9
            int r3 = r3 + r14
            r12 = r3
        L_0x11af:
            android.content.res.Resources r9 = r32.getResources()
            r3 = 2131165218(0x7f070022, float:1.7944647E38)
            int r3 = r9.getDimensionPixelSize(r3)
        L_0x11ba:
            int r12 = r12 + r3
        L_0x11bb:
            if (r13 == 0) goto L_0x11c3
            r13.A00 = r12
            r3 = r65
            r13.A01 = r3
        L_0x11c3:
            r3 = r58
            r3.setVisibility(r0)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r9 = r6.A0o
            X.3aa r3 = X.C244063aa.MEDIA
            X.C244083ac.A05(r9, r3)
            if (r16 == 0) goto L_0x1223
            r3 = r67
            boolean r3 = r3.A0f
            if (r3 != 0) goto L_0x1223
            r9 = r65
            r3 = r67
            r10 = r19
            r9.DzS(r1, r3, r10)
        L_0x11e0:
            r3 = r65
            r3.DzQ(r1)
            float r10 = r1.A00()
            java.util.List r9 = r1.A0b()
            r3 = r48
            r3.A08(r9, r10)
            boolean r3 = r1.CWu()
            if (r3 == 0) goto L_0x0f58
            r9 = r2
            r10 = r1
            r11 = r68
            r12 = r46
            r13 = r47
            r14 = r66
            r15 = r67
            X.C265884Wr.A00(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r9 = "null cannot be cast to non-null type com.instagram.reels.countdown.binder.ReelCountdownStickerViewBinder.Delegate"
            r3 = r14
            X.0qQ.A0C(r14, r9)
            java.lang.String r14 = r69.getModuleName()
            r11 = r76
            r9 = r2
            r12 = r3
            r13 = r35
            X.AnonymousClass6YH.A00(r9, r10, r11, r12, r13, r14)
            r10 = r16 ^ 1
            r9 = r33
            X.AnonymousClass6YI.A00(r2, r1, r9, r3, r10)
            goto L_0x0f58
        L_0x1223:
            r3 = r67
            r3.A0l = r0
            r3 = r68
            boolean r3 = X.C297785sK.A0L(r2, r1, r3)
            if (r3 == 0) goto L_0x140e
            r9.setVisibility(r7)
            X.6PI r11 = r6.A0T
            X.0qQ.A0B(r11, r0)
            boolean r19 = X.C297785sK.A0a(r1)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r3 = r11.A03
            if (r19 == 0) goto L_0x1408
            if (r3 != 0) goto L_0x1290
            X.3oV r3 = r11.A05
        L_0x1243:
            android.view.View r3 = r3.getView()
            com.instagram.ui.widget.framelayout.MediaFrameLayout r3 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r3
            X.0qQ.A0B(r3, r0)
            r11.A03 = r3
            com.instagram.ui.widget.framelayout.MediaFrameLayout r9 = r11.A00()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9.A00 = r3
            com.instagram.ui.widget.framelayout.MediaFrameLayout r9 = r11.A00()
            r3 = 2131435890(0x7f0b2172, float:1.8493635E38)
            android.view.View r3 = r9.requireViewById(r3)
            com.instagram.feed.widget.IgProgressImageView r3 = (com.instagram.feed.widget.IgProgressImageView) r3
            r11.A02 = r3
            com.instagram.ui.widget.framelayout.MediaFrameLayout r3 = r11.A00()
            X.C70317O1v.A00(r3)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r9 = r11.A00()
            r3 = 2131435892(0x7f0b2174, float:1.849364E38)
            android.view.View r3 = r9.requireViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            X.0qQ.A0B(r3, r0)
            r11.A01 = r3
            com.instagram.ui.widget.framelayout.MediaFrameLayout r9 = r11.A00()
            r3 = 2131435891(0x7f0b2173, float:1.8493637E38)
            android.view.View r3 = r9.requireViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            X.0qQ.A0B(r3, r0)
            r11.A00 = r3
        L_0x1290:
            r11.A00()
            com.instagram.ui.widget.framelayout.MediaFrameLayout r3 = r11.A00()
            int r3 = r3.getVisibility()
            if (r3 == 0) goto L_0x12a4
            com.instagram.ui.widget.framelayout.MediaFrameLayout r3 = r11.A00()
            r3.setVisibility(r0)
        L_0x12a4:
            com.instagram.feed.widget.IgProgressImageView r12 = r11.A02
            if (r12 == 0) goto L_0x405d
            float r3 = r1.A00()
            r12.setAspectRatio(r3)
            java.lang.String r3 = r1.A0S()
            r12.setMiniPreviewPayload(r3)
            r13 = 2131435566(0x7f0b202e, float:1.8492978E38)
            X.IUy r10 = new X.IUy
            r9 = r67
            r3 = r65
            r10.<init>(r1, r9, r3)
            r12.A0A(r10, r13)
            android.content.Context r13 = r12.getContext()
            if (r4 == 0) goto L_0x4055
            boolean r3 = r1.CWu()
            if (r3 == 0) goto L_0x13fa
            boolean r3 = r4.A4o()
            if (r3 == 0) goto L_0x13e0
            android.net.Uri r9 = r4.A05
            if (r9 == 0) goto L_0x12e5
            r3 = -1
            com.instagram.common.typedurl.SimpleImageUrl r9 = X.C253833rU.A00(r9, r3, r3)
        L_0x12e0:
            r3 = r69
            r12.setUrl(r9, r3)
        L_0x12e5:
            boolean r3 = r4.A5H()
            if (r3 == 0) goto L_0x12fc
            X.1Xj r3 = r4.A1b()
            boolean r3 = r3.A66()
            if (r3 == 0) goto L_0x12fc
            com.instagram.ui.widget.framelayout.MediaFrameLayout r3 = r11.A00()
            r3.setVisibility(r7)
        L_0x12fc:
            X.6LR r9 = r4.A1x()
            r10 = 0
            if (r9 == 0) goto L_0x13dd
            java.lang.String r3 = r9.A06
        L_0x1305:
            r15 = 1
            if (r3 == 0) goto L_0x130f
            int r12 = r3.length()
            r14 = 0
            if (r12 != 0) goto L_0x1310
        L_0x130f:
            r14 = 1
        L_0x1310:
            if (r9 == 0) goto L_0x131d
            java.lang.String r10 = r9.A05
            if (r10 == 0) goto L_0x131d
            int r9 = r10.length()
            if (r9 == 0) goto L_0x131d
            r15 = 0
        L_0x131d:
            android.content.res.Resources r12 = r13.getResources()
            r9 = 2131165184(0x7f070000, float:1.7944578E38)
            if (r19 == 0) goto L_0x1328
            r9 = 2131165218(0x7f070022, float:1.7944647E38)
        L_0x1328:
            int r12 = r12.getDimensionPixelSize(r9)
            android.widget.TextView r9 = r11.A01
            if (r9 == 0) goto L_0x4041
            if (r14 == 0) goto L_0x13c6
            r9.setVisibility(r7)
        L_0x1335:
            android.widget.TextView r3 = r11.A00
            if (r15 == 0) goto L_0x13ae
            if (r3 == 0) goto L_0x403d
            r3.setVisibility(r7)
        L_0x133e:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r3 = r11.A00()
            android.content.Context r10 = r3.getContext()
            X.3ui r9 = new X.3ui
            r9.<init>()
            X.3WT r3 = X.AnonymousClass3WT.DPA
            r9.A11 = r3
            boolean r3 = X.C297785sK.A0l(r68)
            if (r3 == 0) goto L_0x13a7
            r9.A06 = r0
        L_0x1357:
            X.0qQ.A0A(r10)
            java.lang.Boolean r40 = java.lang.Boolean.valueOf(r0)
            r37 = r10
            r38 = r2
            r39 = r1
            r41 = r27
            r42 = r27
            java.lang.CharSequence r3 = X.AnonymousClass4EQ.A06(r37, r38, r39, r40, r41, r42)
            java.lang.String r3 = r3.toString()
            r9.A1R = r3
            java.lang.String r3 = r1.A0k
            r9.A1d = r3
            java.lang.String r3 = r4.A33(r0)
            r9.A1a = r3
            int r3 = X.0nA.A09(r10)
            float r12 = (float) r3
            X.GdS r3 = new X.GdS
            r37 = r3
            r38 = r10
            r39 = r9
            r40 = r65
            r41 = r11
            r42 = r12
            r37.<init>(r38, r39, r40, r41, r42)
            android.view.GestureDetector r9 = new android.view.GestureDetector
            r9.<init>(r10, r3)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r11 = r11.A00()
            X.IDR r10 = new X.IDR
            r3 = r65
            r10.<init>(r9, r3)
            r11.setOnTouchListener(r10)
            goto L_0x11e0
        L_0x13a7:
            r3 = r68
            int r3 = r3.A01
            r9.A06 = r3
            goto L_0x1357
        L_0x13ae:
            if (r3 == 0) goto L_0x403d
            r3.setText(r10)
            android.widget.TextView r3 = r11.A00
            if (r3 == 0) goto L_0x403d
            if (r14 != 0) goto L_0x13ba
            r12 = 0
        L_0x13ba:
            X.0nA.A0e(r3, r12)
            android.widget.TextView r3 = r11.A00
            if (r3 == 0) goto L_0x403d
            r3.setVisibility(r0)
            goto L_0x133e
        L_0x13c6:
            r9.setText(r3)
            android.widget.TextView r9 = r11.A01
            if (r9 == 0) goto L_0x4041
            r3 = 0
            if (r15 == 0) goto L_0x13d1
            r3 = r12
        L_0x13d1:
            X.0nA.A0T(r9, r3)
            android.widget.TextView r3 = r11.A01
            if (r3 == 0) goto L_0x4041
            r3.setVisibility(r0)
            goto L_0x1335
        L_0x13dd:
            r3 = r10
            goto L_0x1305
        L_0x13e0:
            long r9 = r4.A17()
            r12.setExpiration(r9)
            com.instagram.common.typedurl.ImageUrl r10 = r1.A08(r13)
            if (r10 == 0) goto L_0x404d
            com.instagram.common.typedurl.ImageUrl r9 = r1.A06()
            if (r9 == 0) goto L_0x4045
            r3 = r69
            r12.setUrlWithFallback(r10, r9, r3)
            goto L_0x12e5
        L_0x13fa:
            com.instagram.common.typedurl.ImageUrl r9 = r1.A08(r13)
            if (r9 != 0) goto L_0x12e0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x1408:
            if (r3 != 0) goto L_0x1290
            X.3oV r3 = r11.A06
            goto L_0x1243
        L_0x140e:
            X.6PI r3 = r6.A0T
            r3.A01()
            r9.setVisibility(r0)
            java.lang.String r9 = r1.A0S()
            r3 = r58
            r3.setMiniPreviewPayload(r9)
            boolean r3 = X.C297785sK.A0Y(r1)
            r9 = 0
            if (r3 == 0) goto L_0x1436
            r4.getClass()
            X.1Xy r3 = r4.A0C
            X.DUI r3 = r3.BKT()
            if (r3 == 0) goto L_0x4232
            X.AZQ r9 = new X.AZQ
            r9.<init>(r3)
        L_0x1436:
            r3 = r58
            r3.setPostProcessor(r9)
            r10 = 2131435566(0x7f0b202e, float:1.8492978E38)
            X.6Ls r9 = new X.6Ls
            r37 = r9
            r38 = r69
            r39 = r2
            r40 = r1
            r41 = r68
            r42 = r67
            r43 = r65
            r37.<init>(r38, r39, r40, r41, r42, r43)
            r3.A0A(r9, r10)
            boolean r9 = r1.CWu()
            if (r9 == 0) goto L_0x1462
            r4.getClass()
            r3 = r69
            X.AnonymousClass6YF.A03(r3, r2, r4)
        L_0x1462:
            boolean r3 = X.C309456Yi.A02(r68)
            if (r3 == 0) goto L_0x1484
            com.instagram.common.typedurl.ImageUrl r3 = r68.A06()
            if (r3 == 0) goto L_0x1484
            X.6VC r3 = X.AnonymousClass6VB.A00(r2)
            r3.A0C(r1, r0)
            com.instagram.common.typedurl.ImageUrl r10 = r68.A06()
            if (r10 == 0) goto L_0x4065
            r9 = r58
            r3 = r69
            r9.setUrl(r10, r3)
            goto L_0x11e0
        L_0x1484:
            r3 = r32
            com.instagram.common.typedurl.ImageUrl r11 = r1.A08(r3)     // Catch:{ Exception -> 0x407d }
            if (r11 == 0) goto L_0x406d
            if (r9 == 0) goto L_0x14ad
            long r9 = r1.A02()     // Catch:{ Exception -> 0x407d }
            r3 = r58
            r3.setExpiration(r9)     // Catch:{ Exception -> 0x407d }
            X.6VC r3 = X.AnonymousClass6VB.A00(r2)     // Catch:{ Exception -> 0x407d }
            r3.A0C(r1, r0)     // Catch:{ Exception -> 0x407d }
            com.instagram.common.typedurl.ImageUrl r10 = r1.A06()     // Catch:{ Exception -> 0x407d }
            if (r10 == 0) goto L_0x4075
            r9 = r58
            r3 = r69
            r9.setUrlWithFallback(r11, r10, r3)     // Catch:{ Exception -> 0x407d }
            goto L_0x11e0
        L_0x14ad:
            X.6VC r3 = X.AnonymousClass6VB.A00(r2)     // Catch:{ Exception -> 0x407d }
            r3.A0C(r1, r0)     // Catch:{ Exception -> 0x407d }
            r9 = r58
            r3 = r69
            r9.setUrl(r11, r3)     // Catch:{ Exception -> 0x407d }
            goto L_0x11e0
        L_0x14bd:
            r3 = r61
            boolean r3 = X.AnonymousClass4EQ.A0D(r2, r1, r3)
            if (r3 == 0) goto L_0x14d0
            android.content.res.Resources r9 = r32.getResources()
            r3 = 2131165235(0x7f070033, float:1.7944681E38)
            int r12 = r9.getDimensionPixelSize(r3)
        L_0x14d0:
            r3 = r61
            boolean r3 = X.C297785sK.A0N(r2, r1, r3)
            if (r3 == 0) goto L_0x11bb
            int r3 = X.C316216lI.A00(r32)
            goto L_0x11ba
        L_0x14de:
            boolean r9 = X.C297785sK.A0c(r1)
            if (r9 == 0) goto L_0x01c9
            if (r84 == 0) goto L_0x14f3
            r9 = 2342155742226023650(0x2081023d000604e2, double:4.059424091134231E-152)
            r11 = r34
            boolean r9 = X.182.A06(r11, r5, r9)
            if (r9 == 0) goto L_0x01c9
        L_0x14f3:
            if (r4 == 0) goto L_0x01c9
            X.1Xy r9 = r4.A0C
            com.instagram.model.showreel.IgShowreelComposition r9 = r9.BwC()
            if (r9 == 0) goto L_0x01c9
            java.lang.String r12 = r9.C4b()
            goto L_0x01c9
        L_0x1503:
            boolean r9 = X.C297785sK.A0m(r68)
            if (r9 == 0) goto L_0x1ab6
            android.view.View r12 = r3.A04
            X.IBe r11 = new X.IBe
            r10 = r68
            r9 = r65
            r11.<init>(r1, r10, r9)
            X.AnonymousClass0fU.A00(r11, r12)
        L_0x1517:
            r9 = r68
            com.instagram.model.reels.Reel r11 = r9.A0H
            X.3IB r9 = r11.A0I
            if (r9 != 0) goto L_0x1a95
            boolean r9 = X.C297785sK.A0m(r68)
            if (r9 != 0) goto L_0x1a95
            com.instagram.common.ui.base.IgSimpleImageView r9 = r3.A0E
            r9.setVisibility(r7)
            r4.getClass()
            boolean r9 = X.C231122qu.A0Z(r4)
            if (r9 == 0) goto L_0x1a7d
            boolean r9 = X.C297785sK.A0l(r68)
            if (r9 != 0) goto L_0x1a7d
            android.widget.ImageView r14 = r3.A00
            if (r14 != 0) goto L_0x154c
            android.view.ViewStub r9 = r3.A0A
            android.view.View r14 = r9.inflate()
            java.lang.String r9 = "null cannot be cast to non-null type android.widget.ImageView"
            X.0qQ.A0C(r14, r9)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r3.A00 = r14
        L_0x154c:
            com.instagram.common.ui.widget.imageview.IgImageView r13 = r3.A0F
            android.content.Context r12 = r13.getContext()
            if (r14 == 0) goto L_0x4277
            X.0Pk r9 = X.0Pl.A0n
            X.0qQ.A0A(r12)
            X.0Pl r10 = r9.A00(r12, r2)
            java.lang.String r9 = r69.getModuleName()
            android.graphics.drawable.Drawable r9 = r10.A06(r12, r4, r9)
            r14.setImageDrawable(r9)
            r14.setVisibility(r0)
            r9 = r13
        L_0x156c:
            r9.setVisibility(r7)
        L_0x156f:
            X.3aa r9 = X.C244063aa.PROFILE_IMAGE
            X.C244083ac.A05(r13, r9)
            android.widget.ImageView r10 = r3.A00
            if (r10 == 0) goto L_0x157b
            X.C244083ac.A05(r10, r9)
        L_0x157b:
            boolean r9 = X.C297785sK.A0n(r68)
            if (r9 == 0) goto L_0x15ab
            X.1Ns r9 = r11.A0W
            if (r9 == 0) goto L_0x15ab
            boolean r9 = X.C297785sK.A0V(r11)
            if (r9 == 0) goto L_0x1598
            X.0Tu r12 = X.0Tu.A06
            r9 = 36317818254923339(0x8106dd001a164b, double:3.030872732305028E-306)
            boolean r9 = X.182.A06(r12, r2, r9)
            if (r9 != 0) goto L_0x15ab
        L_0x1598:
            boolean r9 = X.C297785sK.A0W(r11)
            if (r9 == 0) goto L_0x1a1e
            X.0Tu r12 = X.0Tu.A06
            r9 = 36317818255447635(0x8106dd00221653, double:3.030872732636595E-306)
            boolean r9 = X.182.A06(r12, r2, r9)
            if (r9 == 0) goto L_0x1a1e
        L_0x15ab:
            boolean r9 = X.C297785sK.A0l(r68)
            if (r9 != 0) goto L_0x1a01
            if (r4 == 0) goto L_0x1a01
            boolean r9 = X.AnonymousClass3ZN.A03(r2, r4, r0)
            if (r9 == 0) goto L_0x1a01
            boolean r18 = X.C49104EpT.A00(r3)
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r13 = r3.A01
            if (r13 == 0) goto L_0x1623
            X.OCf r9 = r3.A02
            if (r9 != 0) goto L_0x15ce
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            X.OCf r9 = new X.OCf
            r9.<init>(r15, r13, r10)
            r3.A02 = r9
        L_0x15ce:
            r14 = 1073741824(0x40000000, float:2.0)
            if (r9 == 0) goto L_0x15ec
            X.PEo r10 = r9.A01
            X.TtN r12 = r10.A00
            float r9 = r12.A00
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x15de
            r12.A00 = r14
        L_0x15de:
            r10.A00()
            r10 = 1076258406(0x40266666, float:2.6)
            float r9 = r12.A00
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x15ec
            r12.A00 = r10
        L_0x15ec:
            r13.setTranslationXFactor(r14)
            r9 = 1097859072(0x41700000, float:15.0)
            r13.setRadius(r9)
            r9 = 1067450368(0x3fa00000, float:1.25)
            r13.setIconSizeFactor(r9)
            r13.setBorderWidth(r14)
        L_0x15fc:
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r10 = r3.A01
            if (r10 == 0) goto L_0x426f
            if (r18 != 0) goto L_0x1608
            int r9 = r10.getVisibility()
            if (r9 == 0) goto L_0x1623
        L_0x1608:
            r10.setVisibility(r0)
            r9 = r30
            r10.setAlpha(r9)
            android.view.ViewPropertyAnimator r10 = r10.animate()
            r9 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r12 = r10.alpha(r9)
            r9 = 100
            android.view.ViewPropertyAnimator r9 = r12.setDuration(r9)
            r9.start()
        L_0x1623:
            X.3IB r9 = r11.A0I
            r10 = 0
            if (r9 == 0) goto L_0x1629
            r10 = 1
        L_0x1629:
            android.widget.TextView r12 = r3.A0C
            if (r10 == 0) goto L_0x1756
            r12.setVisibility(r7)
            android.widget.TextView r9 = r3.A0B
            r9.setVisibility(r7)
            android.widget.TextView r10 = r3.A0D
            r10.setVisibility(r0)
            android.content.Context r12 = r12.getContext()
            r9 = 2131954111(0x7f1309bf, float:1.9544712E38)
            java.lang.String r9 = r12.getString(r9)
            r10.setText(r9)
        L_0x1648:
            X.6PC r13 = r3.A0G
            X.0qQ.A0B(r13, r0)
            boolean r9 = r61.A01()
            if (r9 == 0) goto L_0x174f
            boolean r9 = r1.A1N()
            if (r9 != 0) goto L_0x174f
            X.3IB r9 = r11.A0I
            if (r9 != 0) goto L_0x174f
            android.widget.TextView r11 = r13.A00
            r11.setVisibility(r0)
            X.3aa r9 = X.C244063aa.SPONSORED_LABEL
            X.C244083ac.A05(r11, r9)
            boolean r9 = X.C307366Pv.A05(r2, r1)
            if (r9 == 0) goto L_0x1748
            android.text.method.MovementMethod r9 = android.text.method.LinkMovementMethod.getInstance()
            r11.setMovementMethod(r9)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r11.setMaxLines(r9)
            if (r4 == 0) goto L_0x1694
            X.3Dp r14 = X.C238833Dp.A00(r2)
            X.0qQ.A07(r14)
            X.3Ds r9 = X.C238863Ds.USER_MESSAGE
            r14.A05(r11, r9)
            X.3e7 r12 = new X.3e7
            r10 = r27
            r9 = r69
            r12.<init>(r10, r2, r4, r9)
            r14.A0A(r11, r12)
        L_0x1694:
            r37 = r2
            r38 = r1
            r39 = r68
            r40 = r61
            r41 = r67
            r42 = r6
            r43 = r65
            r44 = r13
            X.C307366Pv.A03(r37, r38, r39, r40, r41, r42, r43, r44)
        L_0x16a7:
            int r9 = r11.getVisibility()
            if (r9 != 0) goto L_0x16bd
            boolean r9 = r11.isClickable()
            if (r9 == 0) goto L_0x16bd
            android.view.View r10 = r3.A04
            X.6L6 r9 = new X.6L6
            r9.<init>(r3)
            r10.post(r9)
        L_0x16bd:
            boolean r9 = r1.CcK()
            if (r9 != 0) goto L_0x1736
            boolean r9 = r1.A1o(r2)
            if (r9 != 0) goto L_0x1736
            boolean r9 = r1.A1P()
            if (r9 == 0) goto L_0x16d9
            X.3mL r10 = X.C250963mL.NETEGO_BAKEOFF
            r9 = r60
            if (r9 == r10) goto L_0x16d9
            X.3mL r10 = X.C250963mL.NETEGO_BLOKS
            if (r9 != r10) goto L_0x1736
        L_0x16d9:
            android.view.View r9 = r3.A05
            r9.setVisibility(r7)
        L_0x16de:
            if (r4 == 0) goto L_0x1b7d
            X.1Xy r9 = r4.A0C
            X.41Z r9 = r9.BUC()
            if (r9 == 0) goto L_0x1b6a
            X.4hQ r9 = r9.BCd()
            if (r9 == 0) goto L_0x1b6a
            r9 = 36320884859937707(0x8109a7000123ab, double:3.032812065664342E-306)
            r12 = r34
            boolean r9 = X.182.A06(r12, r2, r9)
            if (r9 == 0) goto L_0x1b6a
            X.6PD r12 = r3.A0I
            java.lang.String r42 = r69.getModuleName()
            r37 = r2
            r38 = r1
            r39 = r68
            r40 = r65
            r41 = r12
            X.AnonymousClass6LZ.A00(r37, r38, r39, r40, r41, r42)
            android.widget.TextView r9 = r12.A02
            if (r9 == 0) goto L_0x423a
            java.lang.CharSequence r13 = r9.getText()
            if (r13 == 0) goto L_0x1b2c
            int r9 = r13.length()
            if (r9 == 0) goto L_0x1b2c
            char r10 = r13.charAt(r0)
            java.lang.String r11 = " • "
            int r9 = r11.length()
            if (r9 != 0) goto L_0x1b14
            r0 = 887(0x377, float:1.243E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r0)
            throw r1
        L_0x1736:
            android.view.View r13 = r3.A05
            r13.setVisibility(r0)
            X.6Pw r12 = new X.6Pw
            r10 = r68
            r9 = r65
            r12.<init>(r1, r10, r9)
            X.AnonymousClass0fU.A00(r12, r13)
            goto L_0x16de
        L_0x1748:
            r9 = r19
            r11.setMaxLines(r9)
            goto L_0x1694
        L_0x174f:
            android.widget.TextView r11 = r13.A00
            r11.setVisibility(r7)
            goto L_0x16a7
        L_0x1756:
            r12.setVisibility(r0)
            android.widget.TextView r9 = r3.A0D
            r9.setVisibility(r7)
            android.content.res.Resources r24 = r12.getResources()
            X.1Ns r9 = r11.A0W
            r23 = r9
            if (r9 == 0) goto L_0x1648
            X.3aa r9 = X.C244063aa.TITLE
            X.C244083ac.A05(r12, r9)
            r4.getClass()
            r9 = r27
            boolean r21 = X.C231122qu.A0P(r9, r4)
            boolean r9 = r1.A0z()
            if (r9 == 0) goto L_0x1912
            if (r21 == 0) goto L_0x1912
            boolean r9 = X.C297785sK.A0l(r68)
            if (r9 != 0) goto L_0x1912
            android.view.View r9 = r3.A04
            android.content.Context r14 = r9.getContext()
            X.1Ns r9 = r11.A0W
            if (r9 == 0) goto L_0x4267
            java.lang.String r10 = X.C297785sK.A06(r2, r1, r9)
            if (r10 == 0) goto L_0x425f
            com.instagram.user.model.User r9 = r9.CCd()
            if (r9 == 0) goto L_0x4257
            boolean r9 = r9.A2Q()
            if (r9 == 0) goto L_0x17a4
            java.lang.String r10 = X.C231122qu.A0J(r10)
        L_0x17a4:
            com.instagram.user.model.User r13 = r1.A0L()
            if (r13 == 0) goto L_0x424f
            boolean r9 = r13.A2Q()
            if (r9 == 0) goto L_0x190c
            java.lang.String r9 = r13.getFullName()
            if (r9 == 0) goto L_0x4247
            java.lang.String r13 = X.C231122qu.A0J(r9)
        L_0x17ba:
            boolean r15 = X.C231122qu.A0a(r4)
            r9 = 2131953743(0x7f13084f, float:1.9543966E38)
            if (r15 == 0) goto L_0x17c6
            r9 = 2131953753(0x7f130859, float:1.9543986E38)
        L_0x17c6:
            java.lang.String r9 = r14.getString(r9)
            X.0qQ.A0A(r9)
            android.text.SpannableStringBuilder r10 = X.1sx.A02(r10, r13, r9)
            r9 = 2130970279(0x7f0406a7, float:1.7549264E38)
            int r9 = X.2Yu.A0H(r14, r9)
            int r43 = r14.getColor(r9)
            X.6LJ r9 = new X.6LJ
            r37 = r9
            r38 = r2
            r39 = r1
            r40 = r68
            r41 = r67
            r42 = r65
            r37.<init>(r38, r39, r40, r41, r42, r43)
            X.AnonymousClass7AV.A03(r10, r9, r13)
            r12.setText(r10)
            X.6LK r9 = X.AnonymousClass6LK.A00
            r12.setMovementMethod(r9)
            r12.setClickable(r0)
            r12.setLongClickable(r0)
        L_0x17fe:
            java.lang.Integer r10 = r23.CAm()
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            if (r10 != r9) goto L_0x1813
            com.instagram.user.model.User r9 = r23.CCd()
            if (r9 == 0) goto L_0x1813
            boolean r10 = r9.isVerified()
            r14 = 1
            if (r10 == r14) goto L_0x1814
        L_0x1813:
            r14 = 0
        L_0x1814:
            java.lang.Integer r10 = r23.CAm()
            java.lang.Integer r9 = X.AnonymousClass05K.A04
            if (r10 != r9) goto L_0x1825
            if (r20 == 0) goto L_0x1825
            boolean r10 = r20.isVerified()
            r13 = 1
            if (r10 == r13) goto L_0x1826
        L_0x1825:
            r13 = 0
        L_0x1826:
            if (r21 != 0) goto L_0x1909
            boolean r9 = r61.A00()
            if (r9 == 0) goto L_0x1909
            if (r14 != 0) goto L_0x1832
            if (r13 == 0) goto L_0x1909
        L_0x1832:
            r13 = 1
        L_0x1833:
            r10 = 2131165190(0x7f070006, float:1.794459E38)
            r9 = r24
            int r10 = r9.getDimensionPixelSize(r10)
            r9 = -1
            X.C244273av.A09(r12, r0, r10, r9, r13)
            java.lang.CharSequence r9 = r12.getText()
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            r14.<init>(r9)
            if (r13 == 0) goto L_0x185e
            java.lang.String r9 = " "
            r14.append(r9)
            android.content.Context r10 = r12.getContext()
            r9 = 2131976380(0x7f1360bc, float:1.9589879E38)
            java.lang.String r9 = r10.getString(r9)
            r14.append(r9)
        L_0x185e:
            java.lang.String r9 = r14.toString()
            r12.setContentDescription(r9)
            boolean r9 = X.C297785sK.A0n(r68)
            if (r9 == 0) goto L_0x19fa
            boolean r9 = X.C297785sK.A0A(r2, r11)
            if (r9 == 0) goto L_0x19fa
            boolean r9 = X.C297785sK.A0V(r11)
            if (r9 == 0) goto L_0x1902
            X.0Tu r14 = X.0Tu.A06
            r9 = 36317818255906394(0x8106dd0029165a, double:3.030872732926716E-306)
            boolean r9 = X.182.A06(r14, r2, r9)
            if (r9 == 0) goto L_0x1902
            java.lang.String r10 = r1.A0j
            X.0qQ.A07(r10)
            r9 = r68
            int r9 = r9.A04(r2, r10)
            int r10 = r9 + 1
            r9 = r68
            java.util.List r9 = X.C250973mM.A00(r2, r9)
            int r9 = r9.size()
            r14 = r19
            if (r14 > r10) goto L_0x18ff
            if (r10 > r9) goto L_0x18ff
            android.view.View r14 = r3.A04
            android.content.Context r14 = r14.getContext()
            android.content.res.Resources r15 = r14.getResources()
            r14 = 2131967692(0x7f133ecc, float:1.9572258E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r10, r9}
            java.lang.String r14 = r15.getString(r14, r9)
        L_0x18be:
            if (r20 == 0) goto L_0x18cc
            java.lang.String r9 = r20.getUsername()
            int r9 = r9.length()
            r18 = 0
            if (r9 != 0) goto L_0x18ce
        L_0x18cc:
            r18 = 1
        L_0x18ce:
            android.widget.TextView r10 = r3.A0B
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>()
            if (r18 != 0) goto L_0x18e4
            if (r14 == 0) goto L_0x18e4
            int r15 = r14.length()
            if (r15 <= 0) goto L_0x18e4
            java.lang.String r15 = " • "
            r9.append(r15)
        L_0x18e4:
            r9.append(r14)
            r10.setText(r9)
            r10.setVisibility(r0)
            if (r13 != 0) goto L_0x19f3
            if (r18 != 0) goto L_0x19f5
            r10 = 2131165200(0x7f070010, float:1.794461E38)
            r9 = r24
            int r9 = r9.getDimensionPixelSize(r10)
            X.0nA.A0b(r12, r9)
            goto L_0x1648
        L_0x18ff:
            java.lang.String r14 = ""
            goto L_0x18be
        L_0x1902:
            r9 = r23
            java.lang.String r14 = X.C297785sK.A06(r2, r1, r9)
            goto L_0x18be
        L_0x1909:
            r13 = 0
            goto L_0x1833
        L_0x190c:
            java.lang.String r13 = r13.getUsername()
            goto L_0x17ba
        L_0x1912:
            boolean r9 = X.C297785sK.A0n(r68)
            if (r9 == 0) goto L_0x19d3
            android.text.SpannableStringBuilder r13 = new android.text.SpannableStringBuilder
            r13.<init>()
            boolean r9 = X.C297785sK.A0V(r11)
            if (r9 == 0) goto L_0x1930
            X.0Tu r14 = X.0Tu.A06
            r9 = 36317818254988876(0x8106dd001b164c, double:3.030872732346474E-306)
            boolean r9 = X.182.A06(r14, r2, r9)
            if (r9 != 0) goto L_0x1943
        L_0x1930:
            boolean r9 = X.C297785sK.A0W(r11)
            if (r9 == 0) goto L_0x19d0
            X.0Tu r14 = X.0Tu.A06
            r9 = 36317818255185487(0x8106dd001e164f, double:3.030872732470812E-306)
            boolean r9 = X.182.A06(r14, r2, r9)
            if (r9 == 0) goto L_0x19d0
        L_0x1943:
            r9 = 1
        L_0x1944:
            r14 = 17
            if (r9 != 0) goto L_0x19ba
            boolean r9 = X.C297785sK.A0A(r2, r11)
            if (r9 != 0) goto L_0x19ba
            r9 = r23
            java.lang.String r9 = X.C297785sK.A06(r2, r1, r9)
            java.util.EnumSet r10 = X.1sx.A01
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>(r9)
            X.3a9 r15 = new X.3a9
            r15.<init>()
            int r9 = r10.length()
            r10.setSpan(r15, r0, r9, r14)
            r13.append(r10)
            if (r20 == 0) goto L_0x19b0
            java.lang.String r10 = r20.getUsername()
            java.lang.String r9 = " • "
            r13.append(r9)
            int r18 = r13.length()
            r13.append(r10)
            boolean r9 = X.C297785sK.A0V(r11)
            if (r9 == 0) goto L_0x198f
            X.0Tu r15 = X.0Tu.A06
            r9 = 36317818255054413(0x8106dd001c164d, double:3.03087273238792E-306)
            boolean r9 = X.182.A06(r15, r2, r9)
            if (r9 != 0) goto L_0x19a2
        L_0x198f:
            boolean r9 = X.C297785sK.A0W(r11)
            if (r9 == 0) goto L_0x19b0
            X.0Tu r15 = X.0Tu.A06
            r9 = 2342160827468944976(0x208106dd001f1650, double:4.0637359457624635E-152)
            boolean r9 = X.182.A06(r15, r2, r9)
            if (r9 == 0) goto L_0x19b0
        L_0x19a2:
            X.6Jl r15 = new X.6Jl
            r15.<init>()
            int r10 = r13.length()
            r9 = r18
            r13.setSpan(r15, r9, r10, r14)
        L_0x19b0:
            r12.setText(r13)
            r9 = r19
            r12.setMaxLines(r9)
            goto L_0x17fe
        L_0x19ba:
            if (r20 == 0) goto L_0x19b0
            java.lang.String r9 = r20.getUsername()
            r13.append(r9)
            X.6Jl r10 = new X.6Jl
            r10.<init>()
            int r9 = r13.length()
            r13.setSpan(r10, r0, r9, r14)
            goto L_0x19b0
        L_0x19d0:
            r9 = 0
            goto L_0x1944
        L_0x19d3:
            r9 = r23
            java.lang.String r9 = X.C297785sK.A06(r2, r1, r9)
            java.util.EnumSet r10 = X.1sx.A01
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            r14.<init>(r9)
            X.3a9 r13 = new X.3a9
            r13.<init>()
            int r10 = r14.length()
            r9 = 17
            r14.setSpan(r13, r0, r10, r9)
            r12.setText(r14)
            goto L_0x17fe
        L_0x19f3:
            if (r18 == 0) goto L_0x1648
        L_0x19f5:
            X.0nA.A0b(r12, r0)
            goto L_0x1648
        L_0x19fa:
            android.widget.TextView r9 = r3.A0B
            r9.setVisibility(r7)
            goto L_0x1648
        L_0x1a01:
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r10 = r3.A01
            if (r10 == 0) goto L_0x1a13
            r9 = r27
            r10.setIconDrawable((android.graphics.drawable.Drawable) r9)
            r9 = r30
            r10.setBorderWidth(r9)
            int[] r9 = new int[r0]
            r10.A00 = r9
        L_0x1a13:
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r10 = r3.A01
            if (r10 == 0) goto L_0x1623
            r9 = r36
            r10.setVisibility(r9)
            goto L_0x1623
        L_0x1a1e:
            boolean r18 = X.C49104EpT.A00(r3)
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r14 = r3.A01
            if (r14 == 0) goto L_0x1623
            r9 = 1073741824(0x40000000, float:2.0)
            r14.setTranslationXFactor(r9)
            r9 = r30
            r14.setRadius(r9)
            r14.setBorderWidth(r9)
            android.content.Context r13 = r14.getContext()
            r14.setDefaultBackgroundGradient(r13)
            boolean r9 = X.C297785sK.A0V(r11)
            if (r9 == 0) goto L_0x1a50
            X.0Tu r12 = X.0Tu.A06
            r9 = 36317818255840857(0x8106dd00281659, double:3.0308727328852703E-306)
            boolean r9 = X.182.A06(r12, r2, r9)
            r10 = 2132017414(0x7f140106, float:1.9673106E38)
            if (r9 != 0) goto L_0x1a53
        L_0x1a50:
            r10 = 2132017754(0x7f14025a, float:1.9673795E38)
        L_0x1a53:
            r9 = 2131237855(0x7f081bdf, float:1.8091972E38)
            r14.setIconDrawable((int) r9)
            r9 = 2131100036(0x7f060184, float:1.7812442E38)
            r14.setIconTintColorResource(r9)
            int[] r10 = com.instagram.reels.ui.badge.ReelBrandingBadgeView.A00(r13, r10)
            r14.A00 = r10
            r14.setBackgroundColorGradient(r10)
            r10 = 1057803469(0x3f0ccccd, float:0.55)
            r14.setIconSizeFactor(r10)
            r10 = 1048576000(0x3e800000, float:0.25)
            r14.setTranslationYFactor(r10)
            int r10 = r14.A07
            r14.setBackgroundBorderColor(r10)
            r14.setIconTintColorResource(r9)
            goto L_0x15fc
        L_0x1a7d:
            com.instagram.common.ui.widget.imageview.IgImageView r13 = r3.A0F
            r13.setVisibility(r0)
            r9 = r68
            com.instagram.common.typedurl.ImageUrl r10 = r9.A07(r2)
            if (r10 == 0) goto L_0x427f
            r9 = r69
            r13.setUrl(r10, r9)
            android.widget.ImageView r9 = r3.A00
            if (r9 == 0) goto L_0x156f
            goto L_0x156c
        L_0x1a95:
            com.instagram.common.ui.widget.imageview.IgImageView r9 = r3.A0F
            r9.setVisibility(r7)
            com.instagram.common.ui.base.IgSimpleImageView r13 = r3.A0E
            r13.setVisibility(r0)
            android.content.Context r12 = r9.getContext()
            X.3IB r10 = r11.A0I
            r9 = 2131238007(0x7f081c77, float:1.809228E38)
            if (r10 == 0) goto L_0x1aad
            r9 = 2131237883(0x7f081bfb, float:1.809203E38)
        L_0x1aad:
            android.graphics.drawable.Drawable r9 = r12.getDrawable(r9)
            r13.setImageDrawable(r9)
            goto L_0x157b
        L_0x1ab6:
            boolean r9 = r1.A1p(r2)
            if (r9 != 0) goto L_0x1517
            X.3Dp r10 = X.C238833Dp.A00(r2)
            android.view.View r11 = r3.A04
            X.3Ds r9 = X.C238863Ds.TITLE
            r10.A05(r11, r9)
            java.lang.String r9 = r1.A0k
            r38 = 18
            X.IxD r37 = new X.IxD
            r42 = r85
            r39 = r68
            r40 = r1
            r41 = r65
            r37.<init>(r38, r39, r40, r41, r42)
            X.3aW r12 = new X.3aW
            r38 = r12
            r39 = r2
            r40 = r9
            r41 = r27
            r42 = r37
            r43 = r19
            r38.<init>(r39, r40, r41, r42, r43)
            r9 = 36320481132945902(0x810949000021ee, double:3.032556747089046E-306)
            r13 = r34
            boolean r9 = X.182.A06(r13, r2, r9)
            if (r9 == 0) goto L_0x1b12
            android.view.View r9 = r3.A03
        L_0x1af8:
            X.AnonymousClass0fU.A00(r12, r9)
            android.content.Context r12 = r11.getContext()
            X.0qQ.A07(r12)
            if (r20 == 0) goto L_0x1517
            java.lang.String r10 = r20.getUsername()
            X.6Pu r9 = new X.6Pu
            r9.<init>(r12, r10)
            X.03v.A0B(r11, r9)
            goto L_0x1517
        L_0x1b12:
            r9 = r11
            goto L_0x1af8
        L_0x1b14:
            char r9 = r11.charAt(r0)
            if (r10 == r9) goto L_0x1b2c
            android.widget.TextView r10 = r12.A02
            if (r10 == 0) goto L_0x423a
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>()
            r9.append(r11)
            r9.append(r13)
            r10.setText(r9)
        L_0x1b2c:
            r9 = r67
            boolean r9 = r9.A1A
            if (r9 != 0) goto L_0x1b39
            X.Eut r9 = new X.Eut
            r9.<init>(r3)
            X.C307366Pv.A00 = r9
        L_0x1b39:
            r9 = r68
            boolean r9 = X.C297785sK.A0i(r1, r9)
            if (r9 != 0) goto L_0x1b5c
            r9 = r68
            boolean r9 = X.C297785sK.A0K(r2, r1, r9)
            if (r9 == 0) goto L_0x1b51
            r9 = r68
            boolean r9 = X.C297785sK.A0J(r2, r1, r9)
            if (r9 == 0) goto L_0x1b5c
        L_0x1b51:
            X.3oV r9 = r12.A03
            android.view.View r9 = r9.getView()
            r9.setVisibility(r0)
            goto L_0x0190
        L_0x1b5c:
            r9 = r67
            boolean r9 = r9.A1A
            if (r9 != 0) goto L_0x1b51
            X.3oV r9 = r12.A03
            android.view.View r9 = r9.getView()
            goto L_0x018d
        L_0x1b6a:
            X.1Xy r9 = r4.A0C
            X.41Z r9 = r9.BUC()
            if (r9 == 0) goto L_0x1b7d
            X.4hQ r9 = r9.BCd()
            if (r9 == 0) goto L_0x1b7d
            com.instagram.api.schemas.MoreInfoType r9 = r9.BUD()
            goto L_0x1b7e
        L_0x1b7d:
            r9 = 0
        L_0x1b7e:
            boolean r9 = X.C297785sK.A09(r9)
            if (r9 == 0) goto L_0x0190
            r9 = 36321683723921039(0x810a610002268f, double:3.033317270464168E-306)
            r12 = r34
            boolean r9 = X.182.A06(r12, r2, r9)
            if (r9 == 0) goto L_0x0190
            if (r4 == 0) goto L_0x1be4
            X.1Xy r9 = r4.A0C
            X.41Z r9 = r9.BUC()
            if (r9 == 0) goto L_0x1be4
            X.4hQ r39 = r9.BCd()
        L_0x1b9f:
            r9 = r68
            boolean r9 = X.C297785sK.A0i(r1, r9)
            if (r9 != 0) goto L_0x0190
            r9 = r68
            boolean r9 = X.C297785sK.A0K(r2, r1, r9)
            if (r9 == 0) goto L_0x1bb7
            r9 = r68
            boolean r9 = X.C297785sK.A0J(r2, r1, r9)
            if (r9 == 0) goto L_0x0190
        L_0x1bb7:
            X.ADV r37 = X.ADV.A00
            android.view.View r9 = r3.A04
            android.content.Context r38 = r9.getContext()
            X.0qQ.A07(r38)
            X.6P0 r9 = r3.A0H
            java.lang.CharSequence r10 = r11.getText()
            X.0qQ.A07(r10)
            int r10 = r10.length()
            r45 = 0
            if (r10 <= 0) goto L_0x1bd5
            r45 = 1
        L_0x1bd5:
            r40 = r2
            r41 = r1
            r42 = r68
            r43 = r65
            r44 = r9
            r37.A00(r38, r39, r40, r41, r42, r43, r44, r45)
            goto L_0x0190
        L_0x1be4:
            r39 = 0
            goto L_0x1b9f
        L_0x1be7:
            r3 = 0
            goto L_0x006c
        L_0x1bea:
            X.0sn r8 = X.0sn.A00
        L_0x1bec:
            X.6Pt r3 = r10.A01
            if (r3 == 0) goto L_0x1bf3
            r3.A01(r9, r11, r8)
        L_0x1bf3:
            r43 = 17
            X.Pmh r3 = new X.Pmh
            r37 = r3
            r38 = r65
            r39 = r68
            r40 = r1
            r41 = r10
            r42 = r9
            r37.<init>(r38, r39, r40, r41, r42, r43)
            r10.A00 = r3
            if (r16 == 0) goto L_0x1c10
            r3 = r67
            boolean r3 = r3.A0f
            if (r3 == 0) goto L_0x1c9f
        L_0x1c10:
            r6.A04()
            r6.A03()
            X.6PH r8 = r6.A0k
            com.instagram.common.ui.base.IgFrameLayout r3 = r8.A01
            r3.setVisibility(r7)
            r3.setBackgroundColor(r0)
            X.3oV r3 = r8.A03
            r3.setVisibility(r7)
            X.3oV r3 = r8.A02
            r3.setVisibility(r7)
            X.3oV r3 = r8.A05
            r3.setVisibility(r7)
            X.3oV r3 = r8.A07
            r3.setVisibility(r7)
            X.3oV r3 = r8.A08
            r3.setVisibility(r7)
            X.3oV r3 = r8.A09
            r3.setVisibility(r7)
            X.6PZ r3 = r6.A0b
            X.6Pa r3 = r3.A00
            X.3oV r3 = r3.A09
            r3.setVisibility(r7)
            X.6Pd r3 = r6.A0c
            X.6Pe r3 = r3.A00
            X.3oV r3 = r3.A0B
            r3.setVisibility(r7)
            X.6PL r3 = r6.A0d
            X.3oV r3 = r3.A09
            r3.setVisibility(r7)
            X.6PN r3 = r6.A0f
            X.3oV r3 = r3.A0F
            r3.setVisibility(r7)
            X.6PP r3 = r6.A0g
            X.3oV r3 = r3.A0A
            r3.setVisibility(r7)
            X.6PR r3 = r6.A0e
            X.3oV r3 = r3.A08
            r3.setVisibility(r7)
            X.6PT r3 = r6.A0h
            X.3oV r3 = r3.A0C
            r3.setVisibility(r7)
            X.6PV r3 = r6.A0a
            X.3oV r3 = r3.A0D
            r3.setVisibility(r7)
            X.6PX r3 = r6.A0Z
            X.3oV r3 = r3.A06
            r3.setVisibility(r7)
            X.6Pg r3 = r6.A0i
            X.3oV r3 = r3.A08
            r3.setVisibility(r7)
            X.6Pi r3 = r6.A0j
            r3.A00()
            X.6mO r3 = r6.A0P
            android.view.ViewStub r3 = r3.A04
            r3.setVisibility(r7)
            X.6mP r3 = r6.A0O
            android.view.ViewStub r3 = r3.A03
            r3.setVisibility(r7)
            r6.A07 = r0
            r6.A0B = r0
        L_0x1c9f:
            X.6PZ r10 = r6.A0b
            X.0qQ.A0B(r10, r0)
            boolean r3 = r1.A1I()
            if (r3 == 0) goto L_0x1d32
            X.4gI r8 = r1.A0D()
            if (r8 == 0) goto L_0x3fab
            java.lang.Boolean r9 = r8.Bui()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r22)
            boolean r3 = X.0qQ.A0K(r9, r3)
            if (r3 == 0) goto L_0x1d32
            X.6Pa r10 = r10.A00
            X.3oV r3 = r10.A09
            r3.setVisibility(r0)
            android.view.View r9 = r10.A00
            if (r9 == 0) goto L_0x3fa7
            android.view.View r3 = r10.A02
            if (r3 == 0) goto L_0x3fa3
            X.I7N.A08(r9, r3, r1, r8)
            com.instagram.common.ui.widget.imageview.IgImageView r11 = r10.A08
            if (r11 == 0) goto L_0x3f9f
            if (r20 == 0) goto L_0x3f97
            com.instagram.common.typedurl.ImageUrl r9 = r20.Bh3()
            r3 = r69
            r11.setUrl(r9, r3)
            android.widget.TextView r3 = r10.A04
            if (r3 == 0) goto L_0x3f93
            X.I7N.A0B(r3, r5, r1)
            com.instagram.common.ui.widget.imageview.IgImageView r11 = r10.A08
            if (r11 == 0) goto L_0x3f9f
            android.widget.TextView r9 = r10.A04
            if (r9 == 0) goto L_0x3f93
            r3 = r69
            X.I7N.A0A(r9, r3, r11, r1)
            android.view.View r3 = r10.A00
            if (r3 == 0) goto L_0x3fa7
            android.content.Context r11 = r3.getContext()
            if (r11 == 0) goto L_0x3f8b
            X.I7N.A06(r11, r8, r10)
            android.widget.TextView r9 = r10.A07
            if (r9 == 0) goto L_0x3f87
            android.view.View r3 = r10.A03
            if (r3 == 0) goto L_0x3f83
            r37 = r11
            r38 = r3
            r39 = r9
            r40 = r5
            r41 = r1
            r42 = r8
            r43 = r67
            r44 = r65
            X.3ui r11 = X.I7N.A01(r37, r38, r39, r40, r41, r42, r43, r44)
            X.0Tu r3 = X.0Tu.A06
            r8 = 36328538491600287(0x81109d00003d9f, double:3.0376522531464584E-306)
            boolean r3 = X.182.A06(r3, r5, r8)
            if (r3 == 0) goto L_0x1d32
            android.view.View r8 = r10.A02
            if (r8 == 0) goto L_0x3fa3
            r3 = r65
            X.I7N.A09(r8, r11, r3)
        L_0x1d32:
            X.6Pd r9 = r6.A0c
            X.0qQ.A0B(r9, r0)
            boolean r3 = r1.A1I()
            if (r3 == 0) goto L_0x1dc2
            X.4gI r10 = r1.A0D()
            if (r10 == 0) goto L_0x3f7b
            java.lang.Boolean r8 = r10.Bui()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            boolean r3 = X.0qQ.A0K(r8, r3)
            if (r3 == 0) goto L_0x1dc2
            X.6Pe r9 = r9.A00
            X.3oV r3 = r9.A0B
            r3.setVisibility(r0)
            android.view.View r8 = r9.A00
            if (r8 == 0) goto L_0x3fa7
            android.view.View r3 = r9.A02
            if (r3 == 0) goto L_0x3fa3
            X.I7N.A08(r8, r3, r1, r10)
            com.instagram.common.ui.widget.imageview.IgImageView r11 = r9.A0A
            if (r11 == 0) goto L_0x3f9f
            if (r20 == 0) goto L_0x3f73
            com.instagram.common.typedurl.ImageUrl r8 = r20.Bh3()
            r3 = r69
            r11.setUrl(r8, r3)
            android.widget.TextView r3 = r9.A05
            if (r3 == 0) goto L_0x3f93
            X.I7N.A0B(r3, r5, r1)
            com.instagram.common.ui.widget.imageview.IgImageView r11 = r9.A0A
            if (r11 == 0) goto L_0x3f9f
            android.widget.TextView r8 = r9.A05
            if (r8 == 0) goto L_0x3f93
            r3 = r69
            X.I7N.A0A(r8, r3, r11, r1)
            android.widget.TextView r8 = r9.A06
            if (r8 == 0) goto L_0x3f6f
            java.lang.String r3 = r10.CGM()
            r8.setText(r3)
            android.widget.TextView r8 = r9.A06
            if (r8 == 0) goto L_0x3f6f
            X.3aa r3 = X.C244063aa.CARD_OVERLAY_SUBTITLE
            X.C244083ac.A05(r8, r3)
            android.view.View r3 = r9.A00
            if (r3 == 0) goto L_0x3fa7
            android.content.Context r8 = r3.getContext()
            if (r8 == 0) goto L_0x3f67
            X.I7N.A06(r8, r10, r9)
            android.widget.TextView r3 = r9.A09
            if (r3 == 0) goto L_0x3f87
            android.view.View r9 = r9.A04
            if (r9 == 0) goto L_0x3f83
            r37 = r8
            r38 = r9
            r39 = r3
            r40 = r5
            r41 = r1
            r42 = r10
            r43 = r67
            r44 = r65
            X.I7N.A01(r37, r38, r39, r40, r41, r42, r43, r44)
        L_0x1dc2:
            X.6PL r10 = r6.A0d
            X.0qQ.A0B(r10, r0)
            boolean r3 = r1.A1M()
            if (r3 == 0) goto L_0x20e0
            X.JSN r37 = r1.A0E()
            if (r37 == 0) goto L_0x20e0
            X.3oV r3 = r10.A09
            r3.setVisibility(r0)
            android.view.View r9 = r10.A00()
            android.view.View r3 = r10.A00()
            android.content.Context r8 = r3.getContext()
            X.0qQ.A07(r8)
            java.lang.Boolean r3 = r37.Bui()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r22)
            boolean r3 = X.0qQ.A0K(r3, r13)
            if (r3 == 0) goto L_0x1e06
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            android.content.res.Resources r8 = r8.getResources()
            r3 = 2131165413(0x7f0700e5, float:1.7945042E38)
            int r3 = r8.getDimensionPixelSize(r3)
            r9.width = r3
        L_0x1e06:
            com.instagram.api.schemas.IGAdsCardStickerSizeEnum r9 = r37.Bzg()
            if (r9 == 0) goto L_0x1e1d
            int r8 = r9.ordinal()
            r3 = 3
            if (r8 == r3) goto L_0x1e41
            r3 = r22
            if (r8 == r3) goto L_0x1e4d
            r1 = r23
            if (r8 == r1) goto L_0x1e25
            if (r8 == r0) goto L_0x1e25
        L_0x1e1d:
            java.lang.String r1 = "Null stickerSize on AdsLeadGenCardInfo is passed from server on lead gen card"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x1e25:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "IGAdsCardStickerSizeEnum."
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " on AdsLeadGenCardInfo is passed from server on lead gen card"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x1e41:
            android.view.View r3 = r10.A00()
            android.content.res.Resources r8 = r3.getResources()
            r3 = 2131165411(0x7f0700e3, float:1.7945038E38)
            goto L_0x1e58
        L_0x1e4d:
            android.view.View r3 = r10.A00()
            android.content.res.Resources r8 = r3.getResources()
            r3 = 2131165374(0x7f0700be, float:1.7944963E38)
        L_0x1e58:
            int r8 = r8.getDimensionPixelSize(r3)
            android.view.View r3 = r10.A00()
            X.0nA.A0f(r3, r8)
            com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum r8 = r37.Aes()
            com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum r3 = com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum.DIMMED_IMAGE
            if (r8 != r3) goto L_0x1f6f
            android.view.View r3 = r10.A01
            if (r3 == 0) goto L_0x3fa7
            android.view.View r9 = r10.A02
            if (r9 == 0) goto L_0x3fa3
            android.content.Context r8 = r3.getContext()
            r3 = 2131099930(0x7f06011a, float:1.7812227E38)
            int r3 = r8.getColor(r3)
            r9.setBackgroundColor(r3)
        L_0x1e81:
            java.lang.Boolean r3 = r37.Bui()
            boolean r3 = X.0qQ.A0K(r3, r13)
            if (r3 == 0) goto L_0x1f69
            android.widget.TextView r14 = r10.A06
            if (r14 == 0) goto L_0x3f53
        L_0x1e8f:
            android.view.View r3 = r10.A00()
            android.content.Context r15 = r3.getContext()
            X.0qQ.A07(r15)
            r4.getClass()
            java.lang.String r3 = X.C231122qu.A08(r5, r4)
            r14.setText(r3)
            java.lang.Boolean r3 = r37.Bui()
            boolean r3 = X.0qQ.A0K(r3, r13)
            if (r3 == 0) goto L_0x1edd
            android.view.ViewGroup$LayoutParams r12 = r14.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r12, r3)
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            android.content.res.Resources r8 = r15.getResources()
            r3 = 2131165259(0x7f07004b, float:1.794473E38)
            r11 = 2131165259(0x7f07004b, float:1.794473E38)
            int r9 = r8.getDimensionPixelSize(r3)
            android.content.res.Resources r8 = r15.getResources()
            r3 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r8 = r8.getDimensionPixelSize(r3)
            android.content.res.Resources r3 = r15.getResources()
            int r3 = r3.getDimensionPixelSize(r11)
            r12.setMargins(r9, r8, r3, r0)
        L_0x1edd:
            r14.setVisibility(r0)
            android.widget.TextView r14 = r10.A05
            if (r14 == 0) goto L_0x3f5b
            android.view.View r3 = r10.A00()
            android.content.Context r15 = r3.getContext()
            X.0qQ.A07(r15)
            android.view.ViewGroup$LayoutParams r12 = r14.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r12, r3)
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            java.lang.Boolean r3 = r37.Bui()
            boolean r3 = X.0qQ.A0K(r3, r13)
            android.content.res.Resources r8 = r15.getResources()
            if (r3 == 0) goto L_0x1f55
            r3 = 2131165259(0x7f07004b, float:1.794473E38)
            r11 = 2131165259(0x7f07004b, float:1.794473E38)
            int r9 = r8.getDimensionPixelSize(r3)
            android.content.res.Resources r8 = r15.getResources()
            r3 = 2131165218(0x7f070022, float:1.7944647E38)
            int r8 = r8.getDimensionPixelSize(r3)
        L_0x1f1d:
            android.content.res.Resources r3 = r15.getResources()
            int r3 = r3.getDimensionPixelSize(r11)
            r12.setMargins(r9, r8, r3, r0)
            r14.setLayoutParams(r12)
            java.lang.String r3 = r37.Aqz()
            r14.setText(r3)
            r37.Bzg()
            android.view.View r3 = r10.A01
            if (r3 == 0) goto L_0x3fa7
            android.content.Context r12 = r3.getContext()
            if (r12 == 0) goto L_0x1fcb
            java.lang.CharSequence r3 = X.AnonymousClass4EQ.A05(r12, r5, r1)
            java.lang.String r3 = r3.toString()
            int r8 = r3.length()
            if (r8 != 0) goto L_0x1f7c
            java.lang.String r1 = "Unsupported empty CTA text on LeadGenCardInfo"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x1f55:
            r3 = 2131165184(0x7f070000, float:1.7944578E38)
            r11 = 2131165184(0x7f070000, float:1.7944578E38)
            int r9 = r8.getDimensionPixelSize(r3)
            android.content.res.Resources r8 = r15.getResources()
            r3 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r8 = r8.getDimensionPixelSize(r3)
            goto L_0x1f1d
        L_0x1f69:
            android.widget.TextView r14 = r10.A07
            if (r14 == 0) goto L_0x3f57
            goto L_0x1e8f
        L_0x1f6f:
            android.view.View r8 = r10.A01
            if (r8 == 0) goto L_0x3fa7
            android.view.View r3 = r10.A02
            if (r3 == 0) goto L_0x3fa3
            X.I7N.A07(r8, r3, r1)
            goto L_0x1e81
        L_0x1f7c:
            java.util.Locale r8 = X.AnonymousClass1Q2.A02()
            java.lang.String r9 = r3.toLowerCase(r8)
            X.0qQ.A07(r9)
            r8 = r22
            java.lang.String r8 = r3.substring(r0, r8)
            X.0qQ.A07(r8)
            java.util.Locale r3 = X.AnonymousClass1Q2.A02()
            java.lang.String r3 = r8.toUpperCase(r3)
            X.0qQ.A07(r3)
            r8 = r22
            java.lang.String r8 = r9.substring(r8)
            X.0qQ.A07(r8)
            java.lang.String r35 = X.002.A0R(r3, r8)
            com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum r3 = r37.AtS()
            if (r3 == 0) goto L_0x1fc3
            int r8 = r3.ordinal()
            r11 = 3
            if (r8 == r11) goto L_0x1fd3
            r3 = r36
            if (r8 == r3) goto L_0x1fd3
            if (r8 != r0) goto L_0x1fc3
            java.lang.String r1 = "IGAdsCardStickerCTATypeEnum.UNRECOGNIZED on AdsLeadGenCardInfo is passed from server on lead gen card"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x1fc3:
            java.lang.String r1 = "Null ctaType on AdsLeadGenCardInfo is passed from server on lead gen card"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x1fcb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x1fd3:
            android.view.View r3 = r10.A03
            if (r3 == 0) goto L_0x3f63
            r3.setVisibility(r0)
            android.widget.TextView r8 = r10.A04
            if (r8 == 0) goto L_0x3f5f
            r3 = r35
            r8.setText(r3)
            java.lang.Boolean r3 = r37.Bui()
            boolean r3 = X.0qQ.A0K(r3, r13)
            android.widget.TextView r15 = r10.A04
            if (r15 == 0) goto L_0x3f5f
            android.content.res.Resources r8 = r12.getResources()
            if (r3 == 0) goto L_0x21e3
            r9 = 2131165259(0x7f07004b, float:1.794473E38)
            r3 = 2131165259(0x7f07004b, float:1.794473E38)
            int r21 = r8.getDimensionPixelSize(r9)
            android.content.res.Resources r9 = r12.getResources()
            r8 = 2131165218(0x7f070022, float:1.7944647E38)
            int r14 = r9.getDimensionPixelSize(r8)
            android.content.res.Resources r8 = r12.getResources()
            int r9 = r8.getDimensionPixelSize(r3)
            android.content.res.Resources r8 = r12.getResources()
            r3 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r8 = r8.getDimensionPixelSize(r3)
            r3 = r21
            r15.setPadding(r3, r14, r9, r8)
        L_0x2022:
            android.widget.TextView r9 = r10.A04
            if (r9 == 0) goto L_0x3f5f
            com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum r8 = r37.AtS()
            com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum r3 = com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum.STICKER_CTA_BG_HIGHLIGHT
            if (r8 != r3) goto L_0x2042
            r3 = 2131100348(0x7f0602bc, float:1.7813075E38)
            int r3 = r12.getColor(r3)
            r9.setTextColor(r3)
            r3 = 2131239737(0x7f082339, float:1.809579E38)
            android.graphics.drawable.Drawable r3 = r12.getDrawable(r3)
            r9.setBackground(r3)
        L_0x2042:
            android.widget.TextView r8 = r10.A04
            if (r8 == 0) goto L_0x3f5f
            r3 = r65
            X.I7N.A05(r12, r8, r5, r1, r3)
            android.widget.TextView r3 = r10.A04
            if (r3 == 0) goto L_0x3f5f
            r3.setVisibility(r0)
            android.view.View r39 = r10.A00()
            java.lang.String r44 = "sticker_lead_gen_card_interactive_tooltip"
            r38 = r12
            r40 = r5
            r41 = r1
            r42 = r67
            r43 = r65
            r45 = r35
            r46 = r27
            X.3ui r35 = X.I7N.A02(r38, r39, r40, r41, r42, r43, r44, r45, r46)
            android.widget.TextView r3 = r10.A05
            r21 = r3
            if (r3 == 0) goto L_0x3f5b
            java.lang.Boolean r3 = r37.Bui()
            boolean r3 = X.0qQ.A0K(r3, r13)
            if (r3 == 0) goto L_0x21dd
            android.widget.TextView r3 = r10.A06
            if (r3 == 0) goto L_0x3f53
        L_0x207e:
            android.view.View r14 = r10.A03
            if (r14 == 0) goto L_0x3f63
            android.widget.TextView r13 = r10.A04
            if (r13 == 0) goto L_0x3f5f
            X.4gb r12 = new X.4gb
            r12.<init>()
            android.view.ViewParent r8 = r21.getParent()
            java.lang.String r9 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
            X.0qQ.A0C(r8, r9)
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r12.A0I(r8)
            int r15 = r21.getId()
            int r8 = r3.getId()
            r3 = r36
            r12.A0C(r15, r11, r8, r3)
            int r15 = r14.getId()
            int r8 = r21.getId()
            r12.A0C(r15, r11, r8, r3)
            int r8 = r13.getId()
            int r13 = r14.getId()
            r12.A0C(r8, r11, r13, r3)
            android.view.ViewParent r3 = r21.getParent()
            X.0qQ.A0C(r3, r9)
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r12.A0G(r3)
            X.0Tu r3 = X.0Tu.A06
            r8 = 36328538491600287(0x81109d00003d9f, double:3.0376522531464584E-306)
            boolean r3 = X.182.A06(r3, r5, r8)
            if (r3 == 0) goto L_0x20e0
            android.view.View r9 = r10.A02
            if (r9 == 0) goto L_0x3fa3
            r8 = r35
            r3 = r65
            X.I7N.A09(r9, r8, r3)
        L_0x20e0:
            X.6PN r3 = r6.A0f
            X.0qQ.A0B(r3, r0)
            boolean r8 = r1.A1F()
            if (r8 == 0) goto L_0x2312
            X.54k r21 = r1.A04()
            if (r21 == 0) goto L_0x2312
            r8 = r69
            X.Gak r10 = X.I5R.A00(r8, r5, r1)
            X.3oV r8 = r3.A0F
            r8.setVisibility(r0)
            android.view.View r9 = r3.A00()
            android.view.View r8 = r3.A02
            if (r8 == 0) goto L_0x3fa3
            X.I7N.A07(r9, r8, r1)
            if (r20 == 0) goto L_0x211b
            com.instagram.common.typedurl.ImageUrl r12 = r20.Bh3()
            com.instagram.common.ui.widget.imageview.CircularImageView r11 = r3.A09
            if (r11 == 0) goto L_0x3f9f
            java.lang.String r9 = "LeadGenFirstQuestionCardWithMcqViewBinder"
            X.0xG r8 = new X.0xG
            r8.<init>(r9)
            r11.setUrl(r12, r8)
        L_0x211b:
            android.widget.TextView r9 = r3.A04
            if (r9 == 0) goto L_0x3f57
            java.lang.String r8 = r21.BKL()
            r9.setText(r8)
            X.3OA r14 = r1.A0g
            r12 = 0
            if (r14 == 0) goto L_0x21da
            X.3y0 r8 = r14.A0B
            if (r8 == 0) goto L_0x21da
            com.instagram.api.schemas.IGLeadGenSubheaderTrustSignalDataDict r8 = r8.CA2()
            if (r8 == 0) goto L_0x21da
            java.lang.String r15 = r8.CA3()
        L_0x2139:
            android.widget.TextView r13 = r3.A03
            if (r13 == 0) goto L_0x3f4f
            if (r15 == 0) goto L_0x21d4
            int r8 = r15.length()
            if (r8 == 0) goto L_0x21d4
            r8 = 36329092542381868(0x81111e00003f2c, double:3.038002637091714E-306)
            r11 = r34
            boolean r8 = X.182.A06(r11, r5, r8)
            if (r8 == 0) goto L_0x21d4
            r12 = r15
        L_0x2153:
            r13.setText(r12)
            com.instagram.common.ui.base.IgLinearLayout r8 = r3.A08
            if (r8 == 0) goto L_0x2734
            r8.removeAllViews()
            java.util.List r8 = r21.BYc()
            if (r8 == 0) goto L_0x21fa
            java.util.Iterator r13 = r8.iterator()
        L_0x2167:
            boolean r8 = r13.hasNext()
            if (r8 == 0) goto L_0x21fa
            java.lang.Object r12 = r13.next()
            java.lang.String r12 = (java.lang.String) r12
            android.view.View r8 = r3.A00()
            android.content.Context r8 = r8.getContext()
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r8)
            r9 = 2131627208(0x7f0e0cc8, float:1.8881674E38)
            com.instagram.common.ui.base.IgLinearLayout r8 = r3.A08
            if (r8 == 0) goto L_0x2734
            android.view.View r11 = r11.inflate(r9, r8, r0)
            java.lang.String r8 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgFrameLayout"
            X.0qQ.A0C(r11, r8)
            com.instagram.common.ui.base.IgFrameLayout r11 = (com.instagram.common.ui.base.IgFrameLayout) r11
            r8 = 2131437351(0x7f0b2727, float:1.8496598E38)
            android.view.View r9 = r11.requireViewById(r8)
            X.0qQ.A07(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setText(r12)
            java.lang.String r8 = r3.A0C
            boolean r8 = X.0qQ.A0K(r12, r8)
            if (r8 == 0) goto L_0x21ad
            r8 = r22
            r11.setSelected(r8)
        L_0x21ad:
            X.ICb r8 = new X.ICb
            r37 = r8
            r38 = r5
            r39 = r11
            r40 = r10
            r41 = r1
            r42 = r65
            r43 = r3
            r44 = r12
            r37.<init>(r38, r39, r40, r41, r42, r43, r44)
            X.AnonymousClass0fU.A00(r8, r9)
            int r8 = android.view.View.generateViewId()
            r11.setId(r8)
            com.instagram.common.ui.base.IgLinearLayout r8 = r3.A08
            if (r8 == 0) goto L_0x2734
            r8.addView(r11)
            goto L_0x2167
        L_0x21d4:
            if (r14 == 0) goto L_0x2153
            java.lang.String r12 = r14.A0d
            goto L_0x2153
        L_0x21da:
            r15 = r12
            goto L_0x2139
        L_0x21dd:
            android.widget.TextView r3 = r10.A07
            if (r3 == 0) goto L_0x3f57
            goto L_0x207e
        L_0x21e3:
            r3 = 2131165493(0x7f070135, float:1.7945205E38)
            r9 = 2131165493(0x7f070135, float:1.7945205E38)
            int r8 = r8.getDimensionPixelSize(r3)
            android.content.res.Resources r3 = r12.getResources()
            int r3 = r3.getDimensionPixelSize(r9)
            r15.setPadding(r0, r8, r0, r3)
            goto L_0x2022
        L_0x21fa:
            java.lang.String r8 = r3.A0C
            int r8 = r8.length()
            if (r8 != 0) goto L_0x230d
            com.instagram.common.ui.base.IgButton r9 = r3.A01()
            r8 = r36
            r9.setVisibility(r8)
            androidx.constraintlayout.widget.ConstraintLayout r9 = r3.A06
            if (r9 == 0) goto L_0x3f43
            r9.setVisibility(r8)
        L_0x2212:
            android.view.View r8 = r3.A00()
            android.content.Context r11 = r8.getContext()
            X.0qQ.A07(r11)
            com.instagram.common.ui.base.IgButton r9 = r3.A01()
            r8 = r65
            X.I7N.A05(r11, r9, r5, r1, r8)
            r8 = 36327662318271075(0x810fd100003a63, double:3.037098157604998E-306)
            r11 = r34
            boolean r8 = X.182.A06(r11, r5, r8)
            if (r8 == 0) goto L_0x2262
            r8 = 36609137295103783(0x820fd100021727, double:3.21510406636276E-306)
            long r43 = X.182.A01(r11, r5, r8)
            r8 = 36609137295169320(0x820fd100031728, double:3.215104066404206E-306)
            long r41 = X.182.A01(r11, r5, r8)
            com.instagram.common.ui.base.IgButton r39 = r3.A01()
            android.view.ViewParent r9 = r39.getParent()
            java.lang.String r8 = "null cannot be cast to non-null type android.view.View"
            X.0qQ.A0C(r9, r8)
            android.view.View r9 = (android.view.View) r9
            X.IjP r8 = new X.IjP
            r37 = r8
            r38 = r9
            r40 = r3
            r37.<init>(r38, r39, r40, r41, r43)
            r9.post(r8)
        L_0x2262:
            com.instagram.common.ui.base.IgButton r11 = r3.A01()
            X.IC5 r9 = new X.IC5
            r8 = r65
            r9.<init>(r10, r1, r8, r3)
            X.AnonymousClass0fU.A00(r9, r11)
            java.lang.String r11 = "lead_ads_stories_first_question"
            java.lang.String r12 = "lead_ads_first_question_impression"
            java.lang.String r9 = "impression"
            r8 = r27
            X.1Ln r8 = X.C52672Gak.A00(r10, r8, r11, r12, r9)
            r8.Cgf()
            boolean r8 = r3.A0D
            if (r8 == 0) goto L_0x228d
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r3.A0B = r8
        L_0x228d:
            android.view.View r8 = r3.A00()
            android.content.Context r13 = r8.getContext()
            X.0qQ.A07(r13)
            com.instagram.common.ui.base.IgButton r12 = r3.A01()
            r8 = 36329869931463020(0x8111d30000416c, double:3.038494261076929E-306)
            r10 = r34
            boolean r8 = X.182.A06(r10, r5, r8)
            if (r8 == 0) goto L_0x22b5
            r8 = 2131239756(0x7f08234c, float:1.8095828E38)
            android.graphics.drawable.Drawable r8 = r13.getDrawable(r8)
            if (r8 == 0) goto L_0x22b5
            r12.setBackground(r8)
        L_0x22b5:
            r8 = 36315155374279724(0x810471000c0c2c, double:3.0291887158634464E-306)
            boolean r8 = X.182.A06(r10, r5, r8)
            if (r8 == 0) goto L_0x2312
            X.Uy6 r8 = X.C16610Uy6.A0B
            X.0qQ.A07(r28)
            X.59A r10 = X.AnonymousClass59A.A00
            java.lang.String r9 = r8.A02
            r8 = r28
            r10.A09(r8, r11, r9)
            android.widget.TextView r11 = r3.A04
            if (r11 == 0) goto L_0x3f57
            com.instagram.common.ui.widget.imageview.CircularImageView r10 = r3.A09
            if (r10 == 0) goto L_0x3f9f
            com.instagram.common.ui.base.IgButton r9 = r3.A01()
            android.widget.TextView r8 = r3.A03
            if (r8 == 0) goto L_0x3f4f
            com.instagram.common.ui.base.IgLinearLayout r12 = r3.A08
            if (r12 == 0) goto L_0x2734
            X.3aa r3 = X.C244063aa.LEADGEN_CARD_QUESTION_LABEL
            X.C244083ac.A05(r11, r3)
            X.3aa r3 = X.C244063aa.LEADGEN_CARD_ADVERTISER_PROFILE_IMAGE
            X.C244083ac.A05(r10, r3)
            X.3aa r3 = X.C244063aa.LEADGEN_CARD_CONTINUE_BUTTON
            X.C244083ac.A05(r9, r3)
            X.3aa r3 = X.C244063aa.LEADGEN_CARD_ADVERTISER_SUBTITLE
            X.C244083ac.A05(r8, r3)
            X.0kx r8 = new X.0kx
            r8.<init>(r12)
        L_0x22fb:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x2312
            java.lang.Object r9 = r8.next()
            android.view.View r9 = (android.view.View) r9
            X.3aa r3 = X.C244063aa.LEADGEN_CARD_MULTIPLE_CHOICE_OPTION
            X.C244083ac.A05(r9, r3)
            goto L_0x22fb
        L_0x230d:
            r3.A02(r0)
            goto L_0x2212
        L_0x2312:
            X.6PP r12 = r6.A0g
            X.0qQ.A0B(r12, r0)
            boolean r3 = r1.A1G()
            if (r3 == 0) goto L_0x2431
            X.54k r13 = r1.A04()
            if (r13 == 0) goto L_0x2431
            r3 = r69
            X.Gak r11 = X.I5R.A00(r3, r5, r1)
            X.3oV r3 = r12.A0A
            r3.setVisibility(r0)
            r12.A03()
            if (r20 == 0) goto L_0x2345
            com.instagram.common.typedurl.ImageUrl r10 = r20.Bh3()
            com.instagram.common.ui.widget.imageview.CircularImageView r9 = r12.A09
            if (r9 == 0) goto L_0x3f9f
            java.lang.String r8 = "LeadGenFirstQuestionCardWithSaqViewBinder"
            X.0xG r3 = new X.0xG
            r3.<init>(r8)
            r9.setUrl(r10, r3)
        L_0x2345:
            android.widget.TextView r8 = r12.A04
            if (r8 == 0) goto L_0x3f57
            java.lang.String r3 = r13.BKL()
            r8.setText(r3)
            android.widget.TextView r8 = r12.A03
            if (r8 == 0) goto L_0x3f4f
            X.3OA r3 = r1.A0g
            if (r3 == 0) goto L_0x2575
            java.lang.String r3 = r3.A0d
        L_0x235a:
            r8.setText(r3)
            com.instagram.common.ui.base.IgButton r9 = r12.A01()
            java.lang.String r3 = r13.getCtaText()
            if (r3 != 0) goto L_0x2379
            android.view.View r3 = r12.A00()
            android.content.Context r8 = r3.getContext()
            r3 = 2131964816(0x7f133390, float:1.9566424E38)
            java.lang.String r3 = r8.getString(r3)
            X.0qQ.A07(r3)
        L_0x2379:
            r9.setText(r3)
            com.instagram.common.ui.base.IgEditText r8 = r12.A02()
            X.IDd r3 = new X.IDd
            r37 = r3
            r38 = r58
            r39 = r11
            r40 = r1
            r41 = r65
            r42 = r12
            r37.<init>(r38, r39, r40, r41, r42)
            r8.setOnTouchListener(r3)
            androidx.constraintlayout.widget.ConstraintLayout r8 = r12.A05
            if (r8 == 0) goto L_0x3f4b
            X.ICO r3 = new X.ICO
            r37 = r3
            r37.<init>(r38, r39, r40, r41, r42)
            X.AnonymousClass0fU.A00(r3, r8)
            com.instagram.common.ui.base.IgEditText r8 = r12.A02()
            X.ID4 r3 = new X.ID4
            r3.<init>(r12)
            r8.setOnFocusChangeListener(r3)
            com.instagram.common.ui.base.IgEditText r8 = r12.A02()
            X.I9k r3 = new X.I9k
            r3.<init>(r12)
            r8.addTextChangedListener(r3)
            android.view.View r3 = r12.A00()
            android.content.Context r9 = r3.getContext()
            X.0qQ.A07(r9)
            com.instagram.common.ui.base.IgButton r8 = r12.A01()
            r3 = r65
            X.I7N.A05(r9, r8, r5, r1, r3)
            com.instagram.common.ui.base.IgButton r9 = r12.A01()
            X.IC6 r8 = new X.IC6
            r8.<init>(r11, r1, r3, r12)
            X.AnonymousClass0fU.A00(r8, r9)
            android.widget.TextView r10 = r12.A02
            if (r10 == 0) goto L_0x3f47
            android.view.View r3 = r12.A00()
            android.content.Context r9 = r3.getContext()
            r8 = 2131964817(0x7f133391, float:1.9566426E38)
            if (r20 == 0) goto L_0x2572
            java.lang.String r3 = r20.getUsername()
        L_0x23ef:
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r3 = r9.getString(r8, r3)
            r10.setText(r3)
            java.lang.String r10 = "lead_ads_stories_first_question_with_saq"
            java.lang.String r9 = "lead_ads_first_question_with_saq_impression"
            java.lang.String r8 = "impression"
            r3 = r27
            X.1Ln r3 = X.C52672Gak.A00(r11, r3, r10, r9, r8)
            r3.Cgf()
            android.view.View r3 = r12.A00()
            android.content.Context r10 = r3.getContext()
            X.0qQ.A07(r10)
            com.instagram.common.ui.base.IgButton r11 = r12.A01()
            r8 = 36326240684226196(0x810e8600023694, double:3.0361991105105557E-306)
            r3 = r34
            boolean r3 = X.182.A06(r3, r5, r8)
            if (r3 == 0) goto L_0x2431
            r3 = 2131239756(0x7f08234c, float:1.8095828E38)
            android.graphics.drawable.Drawable r3 = r10.getDrawable(r3)
            if (r3 == 0) goto L_0x2431
            r11.setBackground(r3)
        L_0x2431:
            X.6PR r3 = r6.A0e
            X.0qQ.A0B(r3, r0)
            r8 = r60
            r3 = r29
            if (r8 != r3) goto L_0x2441
            r4.getClass()
            X.1Xv r3 = X.1Xj.A0h
        L_0x2441:
            X.6PT r11 = r6.A0h
            X.0qQ.A0B(r11, r0)
            boolean r3 = r1.A1X()
            if (r3 == 0) goto L_0x25f0
            r3 = r29
            if (r8 != r3) goto L_0x25f0
            r4.getClass()
            X.1Xy r3 = r4.A0C
            X.DSe r13 = r3.BXw()
            if (r13 == 0) goto L_0x25f0
            r3 = r69
            X.Gak r10 = X.I5R.A00(r3, r5, r1)
            X.3oV r3 = r11.A0C
            r3.setVisibility(r0)
            android.view.View r8 = r11.A00()
            android.view.View r3 = r11.A02
            if (r3 == 0) goto L_0x2568
            X.I7N.A07(r8, r3, r1)
            boolean r3 = X.C297785sK.A0D(r5, r1)
            if (r3 != 0) goto L_0x2564
            r8 = 36330655910478552(0x81128a000042d8, double:3.038991317371235E-306)
            r3 = r34
            boolean r46 = X.182.A06(r3, r5, r8)
        L_0x2482:
            if (r20 == 0) goto L_0x2496
            com.instagram.common.typedurl.ImageUrl r12 = r20.Bh3()
            com.instagram.common.ui.widget.imageview.CircularImageView r9 = r11.A09
            if (r9 == 0) goto L_0x2561
            java.lang.String r8 = "OffsiteLeadGenCardViewBinder"
            X.0xG r3 = new X.0xG
            r3.<init>(r8)
            r9.setUrl(r12, r3)
        L_0x2496:
            android.widget.TextView r9 = r11.A04
            if (r9 == 0) goto L_0x255e
            X.54k r8 = r13.Bia()
            r3 = 0
            if (r8 == 0) goto L_0x255b
            java.lang.String r8 = r8.BKL()
        L_0x24a5:
            r9.setText(r8)
            android.widget.TextView r9 = r11.A03
            if (r9 == 0) goto L_0x256b
            X.54k r8 = r13.Bia()
            if (r8 == 0) goto L_0x2552
            java.lang.String r8 = r8.AYw()
            if (r8 == 0) goto L_0x2552
        L_0x24b8:
            r9.setText(r8)
            com.instagram.common.ui.base.IgLinearLayout r3 = r11.A08
            if (r3 == 0) goto L_0x254f
            r3.removeAllViews()
            X.54k r3 = r13.Bia()
            if (r3 == 0) goto L_0x2578
            java.util.List r3 = r3.BYc()
            if (r3 == 0) goto L_0x2578
            java.util.Iterator r14 = r3.iterator()
            r45 = 0
        L_0x24d4:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x2578
            java.lang.Object r9 = r14.next()
            int r13 = r45 + 1
            if (r45 >= 0) goto L_0x24ea
            X.0sr.A1T()
        L_0x24e5:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x24ea:
            java.lang.String r9 = (java.lang.String) r9
            android.view.View r3 = r11.A00()
            android.content.Context r3 = r3.getContext()
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r3)
            r8 = 2131627208(0x7f0e0cc8, float:1.8881674E38)
            com.instagram.common.ui.base.IgLinearLayout r3 = r11.A08
            if (r3 == 0) goto L_0x254f
            android.view.View r8 = r12.inflate(r8, r3, r0)
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgFrameLayout"
            X.0qQ.A0C(r8, r3)
            com.instagram.common.ui.base.IgFrameLayout r8 = (com.instagram.common.ui.base.IgFrameLayout) r8
            r12 = 2131437351(0x7f0b2727, float:1.8496598E38)
            android.view.View r3 = r8.requireViewById(r12)
            X.0qQ.A07(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setText(r9)
            java.lang.String r3 = r11.A0B
            boolean r3 = X.0qQ.A0K(r9, r3)
            if (r3 == 0) goto L_0x2526
            r3 = r22
            r8.setSelected(r3)
        L_0x2526:
            android.view.View r12 = r8.requireViewById(r12)
            X.0qQ.A07(r12)
            X.ICf r3 = new X.ICf
            r37 = r3
            r38 = r5
            r39 = r8
            r40 = r10
            r41 = r1
            r42 = r65
            r43 = r11
            r44 = r9
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46)
            X.AnonymousClass0fU.A00(r3, r12)
            com.instagram.common.ui.base.IgLinearLayout r3 = r11.A08
            if (r3 == 0) goto L_0x254f
            r3.addView(r8)
            r45 = r13
            goto L_0x24d4
        L_0x254f:
            java.lang.String r0 = "optionsListView"
            goto L_0x256d
        L_0x2552:
            X.3OA r8 = r1.A0g
            if (r8 == 0) goto L_0x2558
            java.lang.String r3 = r8.A0d
        L_0x2558:
            r8 = r3
            goto L_0x24b8
        L_0x255b:
            r8 = r3
            goto L_0x24a5
        L_0x255e:
            java.lang.String r0 = "subtitleView"
            goto L_0x256d
        L_0x2561:
            java.lang.String r0 = "avatarImageView"
            goto L_0x256d
        L_0x2564:
            r46 = 0
            goto L_0x2482
        L_0x2568:
            java.lang.String r0 = "dimmerOverlay"
            goto L_0x256d
        L_0x256b:
            java.lang.String r0 = "subtitleCtaView"
        L_0x256d:
            X.0qQ.A0F(r0)
            goto L_0x24e5
        L_0x2572:
            r3 = 0
            goto L_0x23ef
        L_0x2575:
            r3 = 0
            goto L_0x235a
        L_0x2578:
            com.instagram.common.ui.base.IgButton r9 = r11.A01()
            android.view.View r3 = r11.A00()
            android.content.Context r8 = r3.getContext()
            r3 = 2131964838(0x7f1333a6, float:1.9566469E38)
            java.lang.String r3 = r8.getString(r3)
            r9.setText(r3)
            java.lang.String r3 = r11.A0B
            int r3 = r3.length()
            if (r3 != 0) goto L_0x272f
            r11.A02()
        L_0x2599:
            android.view.View r3 = r11.A00()
            android.content.Context r9 = r3.getContext()
            X.0qQ.A07(r9)
            com.instagram.common.ui.base.IgButton r8 = r11.A01()
            r3 = r65
            X.I7N.A05(r9, r8, r5, r1, r3)
            com.instagram.common.ui.base.IgButton r9 = r11.A01()
            X.IC7 r8 = new X.IC7
            r8.<init>(r10, r1, r3, r11)
            X.AnonymousClass0fU.A00(r8, r9)
            java.lang.String r12 = "lead_ads_stories_offsite_generic_question"
            java.lang.String r9 = "lead_ads_stories_offsite_generic_question_impression"
            java.lang.String r8 = "impression"
            r3 = r27
            X.1Ln r3 = X.C52672Gak.A00(r10, r3, r12, r9, r8)
            r3.Cgf()
            android.view.View r3 = r11.A00()
            android.content.Context r10 = r3.getContext()
            X.0qQ.A07(r10)
            com.instagram.common.ui.base.IgButton r11 = r11.A01()
            r8 = 36326240684226196(0x810e8600023694, double:3.0361991105105557E-306)
            r3 = r34
            boolean r3 = X.182.A06(r3, r5, r8)
            if (r3 == 0) goto L_0x25f0
            r3 = 2131239756(0x7f08234c, float:1.8095828E38)
            android.graphics.drawable.Drawable r3 = r10.getDrawable(r3)
            if (r3 == 0) goto L_0x25f0
            r11.setBackground(r3)
        L_0x25f0:
            X.6PV r11 = r6.A0a
            X.0qQ.A0B(r11, r0)
            boolean r3 = r1.A18()
            if (r3 == 0) goto L_0x27c0
            r12 = 0
            if (r4 == 0) goto L_0x272c
            X.1Xy r3 = r4.A0C
            X.DSc r3 = r3.AnV()
            if (r3 == 0) goto L_0x272c
            com.instagram.api.schemas.IGClickToMessagingCardTypeEnum r8 = r3.Alj()
        L_0x260a:
            com.instagram.api.schemas.IGClickToMessagingCardTypeEnum r3 = com.instagram.api.schemas.IGClickToMessagingCardTypeEnum.A04
            if (r8 != r3) goto L_0x27c0
            X.XSH r8 = X.XSH.PAGE_INSTAGRAM_STORY
            X.Gal r10 = new X.Gal
            r3 = r69
            r10.<init>(r8, r3, r5)
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r38 = X.C231122qu.A00(r5, r4)
            X.3OA r13 = r1.A0g
            if (r13 == 0) goto L_0x2729
            java.lang.String r9 = r13.A0S
        L_0x2621:
            if (r38 == 0) goto L_0x2726
            long r14 = X.C16947VBz.A00(r38)
            java.lang.Long r8 = java.lang.Long.valueOf(r14)
            com.instagram.api.schemas.OnFeedMessagesIntf r12 = r38.BTY()
        L_0x262f:
            java.lang.String r3 = X.AnonymousClass3ZN.A00(r12)
            r10.A05(r8, r9, r3)
            X.3oV r3 = r11.A0D
            r3.setVisibility(r0)
            if (r4 == 0) goto L_0x2715
            boolean r3 = X.C247643gg.A05(r5, r4)
            if (r3 == 0) goto L_0x2715
            com.instagram.user.model.User r9 = X.C247643gg.A00(r5, r4)
            android.widget.TextView r8 = r11.A06
            if (r8 == 0) goto L_0x428d
            if (r9 == 0) goto L_0x2712
            java.lang.String r3 = r9.getUsername()
        L_0x2651:
            r8.setText(r3)
            if (r9 == 0) goto L_0x2668
        L_0x2656:
            com.instagram.common.typedurl.ImageUrl r12 = r9.Bh3()
            com.instagram.common.ui.widget.imageview.CircularImageView r9 = r11.A0A
            if (r9 == 0) goto L_0x3f9f
            java.lang.String r8 = "FrequentlyAskedQuestionsCardViewBinder"
            X.0xG r3 = new X.0xG
            r3.<init>(r8)
            r9.setUrl(r12, r3)
        L_0x2668:
            android.view.View r8 = r11.A00()
            android.view.View r3 = r11.A02
            if (r3 == 0) goto L_0x3fa3
            X.I7N.A07(r8, r3, r1)
            com.instagram.common.ui.base.IgLinearLayout r3 = r11.A09
            if (r3 == 0) goto L_0x2734
            r3.removeAllViews()
            if (r13 == 0) goto L_0x2738
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r3 = r13.A09
            if (r3 == 0) goto L_0x2738
            com.instagram.api.schemas.OnFeedMessagesIntf r3 = r3.BTY()
            if (r3 == 0) goto L_0x2738
            java.util.List r8 = r3.BE6()
            if (r8 == 0) goto L_0x2738
            r3 = 3
            java.util.List r3 = X.00k.A0d(r8, r3)
            if (r3 == 0) goto L_0x2738
            java.util.Iterator r14 = r3.iterator()
        L_0x2697:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x2738
            java.lang.Object r13 = r14.next()
            com.instagram.api.schemas.IceBreakerMessageIntf r13 = (com.instagram.api.schemas.IceBreakerMessageIntf) r13
            java.lang.String r3 = r13.getMessage()
            if (r3 == 0) goto L_0x26b0
            int r3 = r3.length()
            if (r3 != 0) goto L_0x26b0
            goto L_0x2697
        L_0x26b0:
            android.view.View r3 = r11.A00()
            android.content.Context r3 = r3.getContext()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r3)
            r8 = 2131627387(0x7f0e0d7b, float:1.8882037E38)
            com.instagram.common.ui.base.IgLinearLayout r3 = r11.A09
            if (r3 == 0) goto L_0x2734
            android.view.View r12 = r9.inflate(r8, r3, r0)
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgFrameLayout"
            X.0qQ.A0C(r12, r3)
            com.instagram.common.ui.base.IgFrameLayout r12 = (com.instagram.common.ui.base.IgFrameLayout) r12
            r3 = 2131437351(0x7f0b2727, float:1.8496598E38)
            android.view.View r9 = r12.requireViewById(r3)
            X.0qQ.A07(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.String r3 = r13.getMessage()
            r9.setText(r3)
            java.lang.String r8 = r13.getMessage()
            java.lang.String r3 = r11.A0B
            boolean r3 = X.0qQ.A0K(r8, r3)
            if (r3 == 0) goto L_0x26f2
            r3 = r22
            r12.setSelected(r3)
        L_0x26f2:
            X.ICe r3 = new X.ICe
            r37 = r3
            r39 = r13
            r40 = r5
            r41 = r12
            r42 = r10
            r43 = r1
            r44 = r11
            r45 = r65
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45)
            X.AnonymousClass0fU.A00(r3, r9)
            com.instagram.common.ui.base.IgLinearLayout r3 = r11.A09
            if (r3 == 0) goto L_0x2734
            r3.addView(r12)
            goto L_0x2697
        L_0x2712:
            r3 = 0
            goto L_0x2651
        L_0x2715:
            r9 = r20
            if (r20 == 0) goto L_0x2668
            java.lang.String r8 = r20.getUsername()
            android.widget.TextView r3 = r11.A06
            if (r3 == 0) goto L_0x428d
            r3.setText(r8)
            goto L_0x2656
        L_0x2726:
            r8 = r12
            goto L_0x262f
        L_0x2729:
            r9 = r12
            goto L_0x2621
        L_0x272c:
            r8 = r12
            goto L_0x260a
        L_0x272f:
            r11.A03()
            goto L_0x2599
        L_0x2734:
            java.lang.String r0 = "optionsListView"
            goto L_0x428f
        L_0x2738:
            androidx.constraintlayout.widget.ConstraintLayout r9 = r11.A07
            if (r9 == 0) goto L_0x3f4b
            X.IAc r8 = new X.IAc
            r3 = r65
            r8.<init>(r3)
            X.AnonymousClass0fU.A00(r8, r9)
            java.lang.String r3 = r11.A0B
            int r3 = r3.length()
            if (r3 != 0) goto L_0x2a1d
            android.widget.TextView r8 = r11.A01()
            r3 = r36
            r8.setVisibility(r3)
            androidx.constraintlayout.widget.ConstraintLayout r8 = r11.A08
            if (r8 == 0) goto L_0x3f43
            r8.setVisibility(r3)
        L_0x275e:
            if (r4 == 0) goto L_0x2a14
            X.1Xy r3 = r4.A0C
            X.DSc r3 = r3.AnV()
            if (r3 == 0) goto L_0x2a14
            java.lang.String r8 = r3.BE4()
            if (r8 == 0) goto L_0x2a14
            android.widget.TextView r3 = r11.A04
            if (r3 == 0) goto L_0x3f47
            r3.setText(r8)
        L_0x2775:
            if (r38 == 0) goto L_0x2a09
            com.instagram.api.schemas.PrivacyDisclosureInfo r3 = r38.Bfm()
            if (r3 == 0) goto L_0x2a09
            java.lang.String r12 = r3.Bfo()
            if (r12 == 0) goto L_0x2a09
            r8 = 36320743126213424(0x81098600042330, double:3.0327224326863894E-306)
            r3 = r34
            boolean r3 = X.182.A06(r3, r5, r8)
            if (r3 == 0) goto L_0x2a09
            android.widget.TextView r3 = r11.A05
            if (r3 == 0) goto L_0x3f3f
            r3.setText(r12)
        L_0x2797:
            com.instagram.api.schemas.OnFeedMessagesIntf r3 = r38.BTY()
            if (r3 == 0) goto L_0x27a8
            java.lang.Boolean r8 = r3.BuX()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r22)
            X.0qQ.A0K(r8, r3)
        L_0x27a8:
            android.widget.TextView r8 = r11.A01()
            X.ICW r3 = new X.ICW
            r37 = r3
            r39 = r5
            r40 = r10
            r41 = r1
            r42 = r11
            r43 = r65
            r37.<init>(r38, r39, r40, r41, r42, r43)
            X.AnonymousClass0fU.A00(r3, r8)
        L_0x27c0:
            X.6PX r13 = r6.A0Z
            X.0qQ.A0B(r13, r0)
            boolean r3 = r1.A19()
            if (r3 == 0) goto L_0x28bd
            X.XSH r8 = X.XSH.PAGE_INSTAGRAM_STORY
            X.Gal r12 = new X.Gal
            r3 = r69
            r12.<init>(r8, r3, r5)
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r10 = X.C231122qu.A00(r5, r4)
            X.3OA r3 = r1.A0g
            r8 = 0
            if (r3 == 0) goto L_0x2a06
            java.lang.String r11 = r3.A0S
        L_0x27df:
            if (r10 == 0) goto L_0x2a02
            long r8 = X.C16947VBz.A00(r10)
            java.lang.Long r21 = java.lang.Long.valueOf(r8)
            com.instagram.api.schemas.OnFeedMessagesIntf r8 = r10.BTY()
        L_0x27ed:
            java.lang.String r10 = X.AnonymousClass3ZN.A00(r8)
            X.0wc r9 = r12.A01
            java.lang.String r8 = "whatsapp_sticker_impression"
            X.0kJ r3 = r9.A00
            X.0Aj r8 = r9.A00(r3, r8)
            boolean r3 = r8.isSampled()
            if (r3 == 0) goto L_0x2841
            r28 = 0
            if (r11 == 0) goto L_0x29fe
            r3 = 10
            java.lang.Long r3 = X.00y.A0n(r3, r11)
            if (r3 == 0) goto L_0x29fe
            long r14 = r3.longValue()
        L_0x2811:
            java.lang.Long r9 = java.lang.Long.valueOf(r14)
            java.lang.String r3 = "ad_id"
            r8.A9F(r3, r9)
            if (r21 == 0) goto L_0x2820
            long r28 = r21.longValue()
        L_0x2820:
            java.lang.Long r9 = java.lang.Long.valueOf(r28)
            java.lang.String r3 = "page_id"
            r8.A9F(r3, r9)
            java.lang.String r9 = r12.A02
            java.lang.String r3 = X.Dd6.A01()
            r8.AAJ(r3, r9)
            X.XSH r9 = r12.A00
            java.lang.String r3 = "on_feed_messaging_surface"
            r8.A8M(r9, r3)
            java.lang.String r3 = "message_destination"
            r8.AAJ(r3, r10)
            r8.Cgf()
        L_0x2841:
            X.3oV r3 = r13.A06
            r3.setVisibility(r0)
            android.view.View r3 = r13.A01
            if (r3 == 0) goto L_0x3fa7
            android.view.View r9 = r13.A02
            if (r9 == 0) goto L_0x3fa3
            android.content.Context r8 = r3.getContext()
            r3 = 2131099930(0x7f06011a, float:1.7812227E38)
            int r3 = r8.getColor(r3)
            r9.setBackgroundColor(r3)
            if (r4 == 0) goto L_0x29fa
            boolean r3 = X.C247643gg.A05(r5, r4)
            if (r3 == 0) goto L_0x29fa
            com.instagram.user.model.User r11 = X.C247643gg.A00(r5, r4)
        L_0x2868:
            android.widget.TextView r10 = r13.A04
            if (r10 == 0) goto L_0x3f5b
            android.view.View r3 = r13.A01
            if (r3 == 0) goto L_0x3fa7
            android.content.Context r9 = r3.getContext()
            r8 = 2131957209(0x7f1315d9, float:1.9550995E38)
            if (r11 == 0) goto L_0x29f7
            java.lang.String r3 = r11.getUsername()
        L_0x287d:
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r3 = r9.getString(r8, r3)
            r10.setText(r3)
            android.view.View r3 = r13.A01
            if (r3 == 0) goto L_0x3fa7
            android.content.Context r8 = r3.getContext()
            X.0qQ.A07(r8)
            android.widget.TextView r9 = r13.A03
            if (r9 == 0) goto L_0x3f3b
            android.view.View r3 = r13.A00
            if (r3 == 0) goto L_0x3f37
            r10 = 2131957208(0x7f1315d8, float:1.9550993E38)
            java.lang.String r44 = r8.getString(r10)
            X.0qQ.A07(r44)
            r10 = r65
            X.I7N.A05(r8, r9, r5, r1, r10)
            java.lang.String r43 = "sticker_whatsapp_messaging_card_interactive_tooltip"
            r37 = r8
            r38 = r3
            r39 = r5
            r40 = r1
            r41 = r67
            r42 = r10
            r45 = r27
            X.I7N.A02(r37, r38, r39, r40, r41, r42, r43, r44, r45)
        L_0x28bd:
            if (r18 == 0) goto L_0x290b
            r6.A03()
            com.instagram.ui.widget.framelayout.MediaFrameLayout r3 = r6.A0o
            r3.setVisibility(r7)
            X.6PI r3 = r6.A0T
            r3.A01()
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r8 = r6.A0p
            r3 = 2131231183(0x7f0801cf, float:1.807844E38)
            r8.setBackgroundResource(r3)
            r8 = r5
            r9 = r69
            r10 = r1
            r11 = r68
            r12 = r67
            r13 = r59
            r14 = r22
            X.C307976Sf.A02(r8, r9, r10, r11, r12, r13, r14)
            r3 = r57
            X.3IB r11 = r3.A0I
            if (r11 == 0) goto L_0x290b
            java.lang.String r10 = r11.A06
            if (r10 == 0) goto L_0x290b
            java.lang.String r8 = "in_feed_survey_impression"
            java.lang.String r3 = "instagram_ad_"
            java.lang.String r9 = X.002.A0R(r3, r8)
            X.3sc r8 = new X.3sc
            r3 = r69
            r8.<init>(r3, r9)
            r8.A78 = r10
            java.lang.String r3 = r11.A08
            r8.A7J = r3
            java.lang.String r3 = "in_feed_survey"
            r8.A79 = r3
            r3 = r69
            X.C233822wX.A0H(r5, r8, r3)
        L_0x290b:
            boolean r3 = X.C297785sK.A0Z(r1)
            if (r3 != 0) goto L_0x2923
            boolean r3 = X.C297785sK.A0f(r1)
            if (r3 != 0) goto L_0x2923
            boolean r3 = X.C297785sK.A0h(r1)
            if (r3 != 0) goto L_0x2923
            boolean r3 = r1.A14()
            if (r3 == 0) goto L_0x2c24
        L_0x2923:
            if (r26 != 0) goto L_0x2c24
            if (r24 != 0) goto L_0x2c24
            if (r16 == 0) goto L_0x292f
            r3 = r67
            boolean r3 = r3.A0f
            if (r3 == 0) goto L_0x2caa
        L_0x292f:
            boolean r3 = r1.A14()
            if (r3 == 0) goto L_0x2a22
            X.6PH r10 = r6.A0k
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r8 = r6.A0p
            X.0qQ.A0B(r10, r0)
            r3 = r22
            X.0qQ.A0B(r8, r3)
            com.instagram.common.ui.base.IgFrameLayout r9 = r10.A01
            android.content.Context r14 = r9.getContext()
            r3 = 2131099791(0x7f06008f, float:1.7811945E38)
            int r3 = r14.getColor(r3)
            r9.setBackgroundColor(r3)
            r9.setVisibility(r0)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r9 = r10.A0A
            float r3 = r1.A00()
            r9.A00 = r3
            r3 = 16
            X.0nA.A0W(r9, r3)
            X.6M7 r3 = X.AnonymousClass6M6.A0O
            X.6M6 r13 = r3.A00(r14)
            X.6M8 r15 = new X.6M8
            r3 = r68
            r15.<init>(r2, r1, r3)
            X.6M9 r12 = new X.6M9
            r3 = r65
            r12.<init>(r8, r1, r3)
            X.6MA r11 = new X.6MA
            r11.<init>(r14, r13)
            r3 = r67
            r3.A0S = r11
            java.util.ArrayList r25 = new java.util.ArrayList
            r25.<init>()
            X.3oV r9 = r10.A03
            X.3oV r8 = r10.A02
            X.6MF r3 = new X.6MF
            r37 = r3
            r38 = r2
            r39 = r9
            r40 = r8
            r41 = r1
            r42 = r68
            r43 = r12
            r44 = r67
            r45 = r15
            r46 = r13
            r47 = r65
            r48 = r11
            r49 = r0
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            r8 = r25
            r8.add(r3)
            X.6MJ r37 = X.AnonymousClass6MJ.A00
            r38 = r14
            r39 = r2
            r40 = r1
            r41 = r68
            r42 = r61
            r43 = r67
            r44 = r13
            r45 = r8
            X.6MK r9 = r37.A00(r38, r39, r40, r41, r42, r43, r44, r45)
            java.util.Iterator r11 = r25.iterator()
            X.0qQ.A07(r11)
        L_0x29c8:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x2c1d
            java.lang.Object r8 = r11.next()
            X.0qQ.A07(r8)
            X.6MD r8 = (X.AnonymousClass6MD) r8
            X.6ME r3 = r8.A04
            X.0qQ.A0B(r3, r0)
            java.util.HashMap r2 = r9.A00
            java.lang.Object r2 = r2.get(r3)
            X.6MH r2 = (X.AnonymousClass6MH) r2
            if (r2 == 0) goto L_0x29c8
            r8.A07(r2)
            boolean r3 = r8 instanceof X.AnonymousClass6MF
            if (r3 == 0) goto L_0x29c8
            r3 = 1
            boolean r2 = r2.A04
            if (r2 == r3) goto L_0x29f3
            r3 = 0
        L_0x29f3:
            X.AnonymousClass6KO.A00(r1, r3)
            goto L_0x29c8
        L_0x29f7:
            r3 = 0
            goto L_0x287d
        L_0x29fa:
            r11 = r20
            goto L_0x2868
        L_0x29fe:
            r14 = 0
            goto L_0x2811
        L_0x2a02:
            r21 = r8
            goto L_0x27ed
        L_0x2a06:
            r11 = r8
            goto L_0x27df
        L_0x2a09:
            android.widget.TextView r3 = r11.A05
            if (r3 == 0) goto L_0x3f3f
            r3.setVisibility(r7)
            if (r38 == 0) goto L_0x27a8
            goto L_0x2797
        L_0x2a14:
            android.widget.TextView r3 = r11.A04
            if (r3 == 0) goto L_0x3f47
            r3.setVisibility(r7)
            goto L_0x2775
        L_0x2a1d:
            r11.A02()
            goto L_0x275e
        L_0x2a22:
            boolean r12 = X.C297785sK.A0Z(r1)
            boolean r11 = X.C297785sK.A0Y(r1)
            boolean r10 = X.C297785sK.A0f(r1)
            boolean r3 = X.C297785sK.A0h(r1)
            if (r3 == 0) goto L_0x2a42
            r8 = 36326940763764824(0x810f2900003858, double:3.036641843629778E-306)
            r3 = r34
            boolean r8 = X.182.A06(r3, r2, r8)
            r3 = 1
            if (r8 != 0) goto L_0x2a43
        L_0x2a42:
            r3 = 0
        L_0x2a43:
            if (r12 == 0) goto L_0x2c28
            if (r11 != 0) goto L_0x2c28
            X.6PH r10 = r6.A0k
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r8 = r6.A0p
            r3 = r22
            X.0qQ.A0B(r10, r3)
            r3 = r23
            X.0qQ.A0B(r8, r3)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r12 = r10.A0A
            android.content.Context r11 = r12.getContext()
            X.6M7 r3 = X.AnonymousClass6M6.A0O
            X.0qQ.A0A(r11)
            X.6M6 r9 = r3.A00(r11)
            X.6M8 r24 = new X.6M8
            r13 = r24
            r3 = r68
            r13.<init>(r2, r1, r3)
            X.6M9 r15 = new X.6M9
            r3 = r65
            r15.<init>(r8, r1, r3)
            X.6MA r8 = new X.6MA
            r8.<init>(r11, r9)
            r3 = r67
            r3.A0S = r8
            java.util.ArrayList r25 = new java.util.ArrayList
            r25.<init>()
            boolean r14 = X.C297785sK.A0O(r4)
            java.util.List r13 = r1.A0b()
            X.3WT r3 = X.AnonymousClass3WT.PRODUCT
            X.3ui r3 = X.C289745e8.A00(r3, r13)
            r13 = 0
            if (r3 == 0) goto L_0x2a9a
            com.instagram.user.model.Product r3 = r3.A0H()
            if (r3 == 0) goto L_0x2a9a
            r13 = 1
        L_0x2a9a:
            r21 = 1
            if (r13 == 0) goto L_0x2aa2
            r18 = 1
            if (r14 == 0) goto L_0x2aa4
        L_0x2aa2:
            r18 = 0
        L_0x2aa4:
            java.util.List r13 = r1.A0b()
            X.3WT r3 = X.AnonymousClass3WT.MULTI_PRODUCT
            X.3ui r3 = X.C289745e8.A00(r3, r13)
            if (r3 == 0) goto L_0x2ac0
            java.util.List r3 = r3.A0N()
            if (r3 == 0) goto L_0x2ac0
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x2ac0
            r16 = 1
            if (r14 == 0) goto L_0x2ac2
        L_0x2ac0:
            r16 = 0
        L_0x2ac2:
            boolean r49 = X.C297785sK.A0a(r1)
            if (r16 != 0) goto L_0x2c07
            if (r18 != 0) goto L_0x2c07
            X.6LR r13 = r1.A0H()
            if (r13 == 0) goto L_0x2c07
            java.lang.String r3 = r13.A06
            if (r3 == 0) goto L_0x2c07
            int r3 = r3.length()
            if (r3 == 0) goto L_0x2c07
            boolean r3 = r13.A09
            if (r3 == 0) goto L_0x2c07
            r14 = 1
            X.3oV r3 = r10.A05
            X.Upy r13 = new X.Upy
            r37 = r13
            r38 = r2
            r39 = r3
            r40 = r1
            r41 = r15
            r42 = r24
            r43 = r9
            r44 = r8
            r37.<init>(r38, r39, r40, r41, r42, r43, r44)
            r3 = r25
            r3.add(r13)
        L_0x2afb:
            r3 = r68
            boolean r43 = X.C297785sK.A0L(r2, r1, r3)
            if (r43 == 0) goto L_0x2b0d
            if (r49 == 0) goto L_0x2c03
            X.3oV r3 = r10.A04
        L_0x2b07:
            android.view.View r12 = r3.getView()
            com.instagram.ui.widget.framelayout.MediaFrameLayout r12 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r12
        L_0x2b0d:
            X.6MC r3 = new X.6MC
            r37 = r3
            r38 = r11
            r39 = r1
            r40 = r9
            r41 = r8
            r42 = r12
            r44 = r49
            r37.<init>(r38, r39, r40, r41, r42, r43, r44)
            if (r14 != 0) goto L_0x2bdd
            if (r18 != 0) goto L_0x2bdd
            if (r16 != 0) goto L_0x2bdd
            r12 = 36328018800556911(0x81102400003b6f, double:3.0373235984379996E-306)
            r14 = r34
            boolean r12 = X.182.A06(r14, r2, r12)
            if (r12 == 0) goto L_0x2bdd
            boolean r12 = r1.A1m()
            if (r12 != 0) goto L_0x2bdd
            boolean r12 = X.C297785sK.A0Z(r1)
            if (r12 == 0) goto L_0x2bdd
            boolean r12 = X.C297785sK.A0D(r2, r1)
            if (r12 != 0) goto L_0x2bdd
            r21 = 0
        L_0x2b47:
            r12 = r68
            boolean r12 = X.C297785sK.A0j(r1, r12)
            if (r12 == 0) goto L_0x2b75
            X.3oV r14 = r10.A03
            X.3oV r13 = r10.A02
            X.6MF r12 = new X.6MF
            r37 = r12
            r38 = r2
            r39 = r14
            r40 = r13
            r41 = r1
            r42 = r68
            r43 = r15
            r44 = r67
            r45 = r24
            r46 = r9
            r47 = r65
            r48 = r8
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            r8 = r25
            r8.add(r12)
        L_0x2b75:
            if (r21 != 0) goto L_0x2b7c
            r8 = r25
            r8.add(r3)
        L_0x2b7c:
            boolean r3 = X.C297785sK.A0m(r68)
            if (r3 == 0) goto L_0x2b8c
            X.Upz r3 = new X.Upz
            r3.<init>(r9)
            r8 = r25
            r8.add(r3)
        L_0x2b8c:
            X.6MJ r37 = X.AnonymousClass6MJ.A00
            r38 = r11
            r39 = r2
            r40 = r1
            r41 = r68
            r42 = r61
            r43 = r67
            r44 = r9
            r45 = r25
            X.6MK r9 = r37.A00(r38, r39, r40, r41, r42, r43, r44, r45)
            com.instagram.common.ui.base.IgFrameLayout r2 = r10.A01
            r2.setVisibility(r0)
            java.util.Iterator r11 = r25.iterator()
            X.0qQ.A07(r11)
        L_0x2bae:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x2c0a
            java.lang.Object r8 = r11.next()
            X.0qQ.A07(r8)
            X.6MD r8 = (X.AnonymousClass6MD) r8
            X.6ME r3 = r8.A04
            X.0qQ.A0B(r3, r0)
            java.util.HashMap r2 = r9.A00
            java.lang.Object r2 = r2.get(r3)
            X.6MH r2 = (X.AnonymousClass6MH) r2
            if (r2 == 0) goto L_0x2bae
            r8.A07(r2)
            boolean r3 = r8 instanceof X.AnonymousClass6MF
            if (r3 == 0) goto L_0x2bae
            r3 = 1
            boolean r2 = r2.A04
            if (r2 == r3) goto L_0x2bd9
            r3 = 0
        L_0x2bd9:
            X.AnonymousClass6KO.A00(r1, r3)
            goto L_0x2bae
        L_0x2bdd:
            r12 = r25
            r12.add(r3)
            if (r18 == 0) goto L_0x2bfc
            X.3oV r13 = r10.A07
            java.lang.Integer r43 = X.AnonymousClass05K.A00
        L_0x2be8:
            X.Uq0 r12 = new X.Uq0
            r37 = r12
            r38 = r13
            r41 = r65
            r42 = r8
            r37.<init>(r38, r39, r40, r41, r42, r43)
            r13 = r25
            r13.add(r12)
            goto L_0x2b47
        L_0x2bfc:
            if (r16 == 0) goto L_0x2b47
            X.3oV r13 = r10.A07
            java.lang.Integer r43 = X.AnonymousClass05K.A01
            goto L_0x2be8
        L_0x2c03:
            X.3oV r3 = r10.A06
            goto L_0x2b07
        L_0x2c07:
            r14 = 0
            goto L_0x2afb
        L_0x2c0a:
            boolean r2 = X.C297785sK.A0g(r1)
            if (r2 == 0) goto L_0x2c1d
            X.3oV r3 = r10.A03
            int r2 = r3.CFV()
            if (r2 != 0) goto L_0x2c1d
            r2 = r36
            r3.setVisibility(r2)
        L_0x2c1d:
            android.view.ViewGroup r2 = r10.A00
            X.C297785sK.A08(r2, r1)
            goto L_0x2caa
        L_0x2c24:
            r22 = 0
            goto L_0x2caa
        L_0x2c28:
            if (r10 == 0) goto L_0x3ce9
            X.6PH r14 = r6.A0k
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r9 = r6.A0p
            X.0qQ.A0B(r14, r0)
            r3 = r22
            X.0qQ.A0B(r9, r3)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r3 = r14.A0A
            android.content.Context r8 = r3.getContext()
            X.6M7 r3 = X.AnonymousClass6M6.A0O
            X.0qQ.A0A(r8)
            X.6M6 r13 = r3.A00(r8)
            X.6M8 r12 = new X.6M8
            r3 = r68
            r12.<init>(r2, r1, r3)
            X.6M9 r11 = new X.6M9
            r3 = r65
            r11.<init>(r9, r1, r3)
            X.6MA r10 = new X.6MA
            r10.<init>(r8, r13)
            r3 = r67
            r3.A0S = r10
            java.util.ArrayList r25 = new java.util.ArrayList
            r25.<init>()
            X.3oV r9 = r14.A08
            X.3oV r8 = r14.A02
            X.6MF r3 = new X.6MF
            r37 = r3
            r38 = r2
            r39 = r9
            r40 = r8
            r41 = r1
            r42 = r68
            r43 = r11
            r44 = r67
            r45 = r12
            r46 = r13
            r47 = r65
            r48 = r10
            r49 = r0
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            com.instagram.common.ui.base.IgTextView r9 = r3.A0E
            r9.setVisibility(r0)
            X.6MH r8 = r3.A06
            int r2 = r8.A02
            float r2 = (float) r2
            r9.setTranslationX(r2)
            int r2 = r8.A03
            float r2 = (float) r2
            r9.setTranslationY(r2)
            X.AnonymousClass6MF.A00(r3)
            X.AnonymousClass6MF.A02(r3, r8)
            com.instagram.common.ui.base.IgFrameLayout r2 = r14.A01
            r2.setVisibility(r0)
            X.AnonymousClass6KO.A00(r1, r0)
        L_0x2ca5:
            r2 = r25
            r2.add(r3)
        L_0x2caa:
            boolean r2 = r1.A1A()
            if (r2 == 0) goto L_0x2e9a
            X.6Pg r13 = r6.A0i
            r37 = 1
            r2 = r37
            X.0qQ.A0B(r13, r2)
            r9 = 9
            com.instagram.ui.widget.framelayout.MediaFrameLayout r2 = r13.A09
            r38 = r2
            android.content.Context r12 = r38.getContext()
            X.3oV r2 = r13.A08
            r2.setVisibility(r0)
            android.view.ViewGroup r11 = r13.A06
            if (r11 == 0) goto L_0x3f33
            if (r4 == 0) goto L_0x3cc6
            X.HMq r2 = r4.A1s()
            if (r2 == 0) goto L_0x3cc6
            int r3 = r2.ordinal()
            r8 = 4
            if (r3 == r8) goto L_0x3cbe
            r2 = r19
            if (r3 == r2) goto L_0x3ccc
            r2 = r17
            if (r3 == r2) goto L_0x3cd8
            if (r3 == r7) goto L_0x3ca0
            if (r3 != r9) goto L_0x3cc6
            android.view.ViewGroup r11 = r13.A04
            if (r11 == 0) goto L_0x3f1b
            r19 = 0
            r35 = 1
            r29 = 1
        L_0x2cf1:
            r28 = 0
        L_0x2cf3:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r3 = r13.A0A
            r2 = 2131100285(0x7f06027d, float:1.7812947E38)
            int r2 = r12.getColor(r2)
            r3.setBackgroundColor(r2)
        L_0x2cff:
            X.0qQ.A0A(r12)
            r2 = r37
            X.0qQ.A0B(r12, r2)
            int r9 = X.AnonymousClass0nB.A01(r12)
            int r14 = X.C316216lI.A02(r12)
            int r10 = r9 / r8
            int r10 = r10 + r19
            if (r29 == 0) goto L_0x2d21
            android.content.res.Resources r3 = r12.getResources()
            r2 = 2131165287(0x7f070067, float:1.7944787E38)
            int r2 = r3.getDimensionPixelSize(r2)
            int r10 = r10 + r2
        L_0x2d21:
            float r3 = r1.A00()
            float r2 = (float) r9
            float r2 = r2 / r3
            int r9 = (int) r2
            int r2 = r9 + r10
            if (r2 <= r14) goto L_0x3c97
            int r9 = r14 - r10
        L_0x2d2e:
            r3 = 0
        L_0x2d2f:
            int r26 = r3 + r9
            android.content.res.Resources r15 = r12.getResources()
            r2 = 2131165251(0x7f070043, float:1.7944714E38)
            int r18 = r15.getDimensionPixelSize(r2)
            int r2 = r18 / 2
            int r24 = r26 - r2
            if (r35 == 0) goto L_0x2d44
            int r24 = r26 - r18
        L_0x2d44:
            float r15 = r1.A00()
            r2 = 1066192077(0x3f8ccccd, float:1.1)
            int r2 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x3c93
            X.6LR r2 = r1.A0H()
            if (r2 == 0) goto L_0x3c90
            java.lang.String r2 = r2.A06
        L_0x2d57:
            boolean r2 = X.0mp.A0B(r2)
            if (r2 != 0) goto L_0x3c93
            boolean r2 = X.C316216lI.A0B(r12)
            if (r2 == 0) goto L_0x3c83
            r17 = 0
        L_0x2d65:
            android.content.res.Resources r15 = r12.getResources()
            r2 = 2131165213(0x7f07001d, float:1.7944637E38)
            int r16 = r15.getDimensionPixelSize(r2)
            int r2 = r9 + r10
            int r2 = r2 - r19
            int r2 = r2 + r18
            int r2 = r2 + r17
            int r15 = r16 * 2
            int r2 = r2 + r15
            if (r2 > r14) goto L_0x3c93
            int r14 = r14 - r2
            int r3 = r14 / 2
            int r26 = r3 + r9
            int r24 = r26 + r10
            int r24 = r24 + r16
            r21 = 1
        L_0x2d88:
            r2 = r38
            r2.setVisibility(r7)
            android.view.ViewGroup r2 = r13.A06
            if (r2 == 0) goto L_0x3f33
            r2.setVisibility(r7)
            android.view.ViewGroup r2 = r13.A01
            if (r2 == 0) goto L_0x3f27
            r2.setVisibility(r7)
            android.view.ViewGroup r2 = r13.A02
            if (r2 == 0) goto L_0x3f2b
            r2.setVisibility(r7)
            android.view.ViewGroup r2 = r13.A00
            if (r2 == 0) goto L_0x3f2f
            r2.setVisibility(r7)
            com.instagram.common.ui.base.IgTextView r2 = r13.A07
            if (r2 == 0) goto L_0x423d
            r2.setVisibility(r7)
            android.view.ViewGroup r2 = r13.A05
            if (r2 == 0) goto L_0x3f23
            r2.setVisibility(r7)
            android.view.ViewGroup r2 = r13.A04
            if (r2 == 0) goto L_0x3f1b
            r2.setVisibility(r7)
            android.view.ViewGroup r2 = r13.A03
            if (r2 == 0) goto L_0x3f1f
            r2.setVisibility(r7)
            if (r28 == 0) goto L_0x2ddb
            r2 = r67
            r2.A0C = r3
            r2 = r38
            r2.setVisibility(r0)
            X.0nA.A0V(r2, r9)
            X.0nA.A0e(r2, r3)
            X.3aa r3 = X.C244063aa.MEDIA
            X.C244083ac.A05(r2, r3)
        L_0x2ddb:
            if (r4 == 0) goto L_0x3f13
            java.util.List r19 = r4.A3W()
            int r2 = r19.size()
            if (r2 >= r8) goto L_0x3ac3
            X.0wj r9 = X.0wj.A01
            r3 = 817903741(0x30c0387d, float:1.3985894E-9)
            java.lang.String r2 = "AD_NEED_MORE_THUMBNAIL_COUNT"
            X.0f9 r9 = r9.AEf(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "Need at least "
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = " thumbnails for a collection ad "
            r3.append(r2)
            java.lang.String r2 = r1.A0U(r5)
            r3.append(r2)
            java.lang.String r2 = " but had "
            r3.append(r2)
            int r2 = r19.size()
            r3.append(r2)
            java.lang.String r2 = " thumbnails"
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = "message"
            r9.ABQ(r2, r3)
            r9.report()
        L_0x2e28:
            r2 = r68
            boolean r2 = X.C309506Yn.A05(r12, r5, r1, r2)
            if (r2 != 0) goto L_0x2e9a
            X.6LR r8 = r1.A0H()
            if (r8 == 0) goto L_0x2e9a
            java.lang.String r2 = r8.A06
            boolean r2 = X.0mp.A0B(r2)
            if (r2 != 0) goto L_0x2e9a
            com.instagram.common.ui.base.IgTextView r2 = r13.A07
            if (r2 == 0) goto L_0x423d
            r2.setVisibility(r0)
            if (r21 == 0) goto L_0x3aa6
            r2 = 2130970335(0x7f0406df, float:1.7549377E38)
            int r2 = X.2Yu.A0H(r12, r2)
            int r2 = r12.getColor(r2)
            r3 = 2130970321(0x7f0406d1, float:1.7549349E38)
            int r3 = X.2Yu.A0H(r12, r3)
            int r9 = r12.getColor(r3)
        L_0x2e5d:
            com.instagram.common.ui.base.IgTextView r3 = r13.A07
            if (r3 == 0) goto L_0x423d
            r3.setTextColor(r2)
            com.instagram.common.ui.base.IgTextView r10 = r13.A07
            if (r10 == 0) goto L_0x423d
            java.lang.Integer r2 = r8.A02
            if (r2 == 0) goto L_0x3aa2
            int r2 = r2.intValue()
        L_0x2e70:
            float r3 = (float) r2
            r2 = r37
            r10.setTextSize(r2, r3)
            com.instagram.common.ui.base.IgTextView r3 = r13.A07
            if (r3 == 0) goto L_0x423d
            r2 = r24
            X.0nA.A0e(r3, r2)
            java.lang.String r2 = r8.A06
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>(r2)
            com.instagram.common.ui.base.IgTextView r8 = r13.A07
            if (r8 == 0) goto L_0x423d
            r3 = 1065353216(0x3f800000, float:1.0)
            r2 = r37
            X.C306496Mj.A05(r10, r8, r3, r9, r2)
            com.instagram.common.ui.base.IgTextView r3 = r13.A07
            if (r3 == 0) goto L_0x423d
            X.3aa r2 = X.C244063aa.CAPTION
            X.C244083ac.A05(r3, r2)
        L_0x2e9a:
            r2 = r68
            boolean r2 = X.C297785sK.A0I(r5, r1, r2)
            if (r2 == 0) goto L_0x2ecf
            r12 = 1
            com.instagram.common.ui.widget.imageview.IgImageView r11 = r58.getIgImageView()
            android.content.Context r10 = r11.getContext()
            X.0qQ.A07(r10)
            X.6Lb r9 = new X.6Lb
            r13 = r9
            r14 = r10
            r15 = r5
            r16 = r57
            r17 = r1
            r18 = r67
            r19 = r65
            r13.<init>(r14, r15, r16, r17, r18, r19)
            boolean r2 = r1.A1m()
            if (r2 == 0) goto L_0x3a3d
            com.instagram.ui.widget.textureview.ScalingTextureView r2 = r6.C5p()
            if (r2 == 0) goto L_0x2ecf
            r2.setOnTouchListener(r9)
            r6.A09 = r12
        L_0x2ecf:
            r3 = r32
            r2 = r68
            boolean r2 = X.C309506Yn.A05(r3, r5, r1, r2)
            if (r2 == 0) goto L_0x3d75
            r32 = 1
            r2 = r32
            r6.A07 = r2
            X.6Pi r2 = r6.A0j
            r64 = r2
            r2 = r61
            boolean r14 = X.C297785sK.A0N(r5, r1, r2)
            r2 = r64
            r3 = r32
            X.0qQ.A0B(r2, r3)
            r2 = 36313909835860275(0x81034f002c0933, double:3.028401032351606E-306)
            r8 = r34
            boolean r3 = X.182.A06(r8, r5, r2)
            r2 = r64
            X.3oV r2 = r2.A07
            r55 = r2
            android.view.View r21 = r55.getView()
            if (r3 == 0) goto L_0x3a34
            r2 = 2131431129(0x7f0b0ed9, float:1.8483978E38)
            r3 = r21
            android.view.View r21 = r3.findViewById(r2)
        L_0x2f10:
            r2 = r21
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r21 = r2
            android.content.Context r31 = r21.getContext()
            r3 = r67
            r2 = r64
            r2.A00 = r3
            r16 = 0
            if (r4 == 0) goto L_0x2f37
            boolean r2 = X.C243213Xw.A06(r4)
            if (r2 == 0) goto L_0x2f37
            r2 = 36328486952058231(0x81109100013d77, double:3.037619659332529E-306)
            boolean r2 = X.182.A06(r8, r5, r2)
            if (r2 == 0) goto L_0x2f37
            r16 = 1
        L_0x2f37:
            if (r16 == 0) goto L_0x2f45
            r2 = 36327619369646657(0x810fc700103a41, double:3.037070996721976E-306)
            boolean r2 = X.182.A06(r8, r5, r2)
            r11 = 1
            if (r2 != 0) goto L_0x2f46
        L_0x2f45:
            r11 = 0
        L_0x2f46:
            if (r4 == 0) goto L_0x3a2e
            com.instagram.user.model.UpcomingEvent r18 = r4.A27(r5)
            if (r18 == 0) goto L_0x3a30
            boolean r2 = X.C309506Yn.A07(r5, r1)
            if (r2 == 0) goto L_0x3a30
            r17 = 1
            boolean r2 = X.C309506Yn.A07(r5, r1)
            if (r2 == 0) goto L_0x2f7c
            boolean r2 = X.C243213Xw.A07(r4)
            if (r2 == 0) goto L_0x3a0c
            com.instagram.user.model.UpcomingEvent r2 = r4.A27(r5)
            if (r2 == 0) goto L_0x3a05
            java.lang.Integer r3 = X.C18810W3l.A03(r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r3 != r2) goto L_0x3a05
            r2 = 36327619369712194(0x810fc700113a42, double:3.0370709967634217E-306)
        L_0x2f75:
            boolean r2 = X.182.A06(r8, r5, r2)
            r10 = 1
            if (r2 != 0) goto L_0x2f7d
        L_0x2f7c:
            r10 = 0
        L_0x2f7d:
            if (r16 == 0) goto L_0x39e2
            if (r11 == 0) goto L_0x39e8
        L_0x2f81:
            com.instagram.api.schemas.MoreInfoStickerCTAType r8 = com.instagram.api.schemas.MoreInfoStickerCTAType.ONE_LINE
        L_0x2f83:
            com.instagram.api.schemas.MoreInfoStickerCTAType r2 = com.instagram.api.schemas.MoreInfoStickerCTAType.EXPANDED
            if (r8 != r2) goto L_0x39de
            if (r4 == 0) goto L_0x39de
            java.lang.String r50 = r4.A2l()
        L_0x2f8d:
            com.instagram.api.schemas.MoreInfoStickerCTAType r2 = com.instagram.api.schemas.MoreInfoStickerCTAType.TWO_LINE
            if (r8 != r2) goto L_0x39da
            if (r4 == 0) goto L_0x39da
            java.lang.String r49 = r4.A2l()
            if (r49 != 0) goto L_0x39d7
        L_0x2f99:
            com.instagram.api.schemas.MoreInfoStickerCTAType r2 = com.instagram.api.schemas.MoreInfoStickerCTAType.ONE_LINE
            if (r8 == r2) goto L_0x2fa1
            com.instagram.api.schemas.MoreInfoStickerCTAType r2 = com.instagram.api.schemas.MoreInfoStickerCTAType.ONE_LINE_RESIZABLE
            if (r8 != r2) goto L_0x39d7
        L_0x2fa1:
            r9 = 1
        L_0x2fa2:
            if (r16 != 0) goto L_0x2fad
            if (r4 == 0) goto L_0x2fad
            java.lang.String r3 = r4.A2l()
            r2 = 1
            if (r3 != 0) goto L_0x2fae
        L_0x2fad:
            r2 = 0
        L_0x2fae:
            if (r9 == 0) goto L_0x39d3
            if (r2 != 0) goto L_0x2fb6
            if (r11 != 0) goto L_0x2fb6
            if (r10 == 0) goto L_0x39d3
        L_0x2fb6:
            r62 = 1
        L_0x2fb8:
            if (r17 != 0) goto L_0x39cb
            if (r16 != 0) goto L_0x39cb
            if (r4 == 0) goto L_0x2fca
            java.lang.String r2 = r4.A2l()
            if (r2 == 0) goto L_0x2fca
            int r2 = r2.length()
            if (r2 != 0) goto L_0x39cb
        L_0x2fca:
            r60 = 0
        L_0x2fcc:
            boolean r2 = X.C297785sK.A0Q(r4)
            if (r2 != 0) goto L_0x2fd8
            boolean r2 = X.C297785sK.A0P(r4)
            if (r2 == 0) goto L_0x2fea
        L_0x2fd8:
            if (r4 == 0) goto L_0x2fea
            r2 = r32
            java.util.ArrayList r2 = r4.A3K(r2)
            if (r2 == 0) goto L_0x2fea
            boolean r2 = r2.isEmpty()
            r52 = 1
            if (r2 == 0) goto L_0x3998
        L_0x2fea:
            r52 = 0
            if (r4 != 0) goto L_0x3998
            r2 = 0
            r3 = 0
        L_0x2ff0:
            X.0qQ.A0A(r31)
            if (r62 == 0) goto L_0x3989
            if (r11 == 0) goto L_0x3973
            if (r4 == 0) goto L_0x3989
            X.1Xy r9 = r4.A0C
            X.3lZ r9 = r9.getInjected()
            if (r9 == 0) goto L_0x3989
            java.lang.String r42 = r9.BF3()
        L_0x3005:
            r10 = 36609094346610465(0x820fc700141721, double:3.215076905562646E-306)
            r9 = r34
            long r9 = X.182.A01(r9, r5, r10)
            int r11 = (int) r9
            java.lang.Integer r27 = java.lang.Integer.valueOf(r11)
        L_0x3015:
            java.lang.Boolean r40 = java.lang.Boolean.valueOf(r52)
            r37 = r31
            r38 = r5
            r39 = r1
            r41 = r27
            java.lang.CharSequence r9 = X.AnonymousClass4EQ.A06(r37, r38, r39, r40, r41, r42)
            java.lang.String r10 = r9.toString()
        L_0x3029:
            r29 = 0
            java.lang.String r46 = ""
            com.instagram.api.schemas.StoryLinkInfoDict r9 = new com.instagram.api.schemas.StoryLinkInfoDict
            r37 = r9
            r38 = r29
            r39 = r29
            r40 = r29
            r41 = r29
            r42 = r29
            r43 = r29
            r44 = r10
            r45 = r29
            r47 = r46
            r48 = r46
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            X.6MT r11 = new X.6MT
            r11.<init>()
            r11.A00 = r9
            X.0qQ.A0A(r31)
            int r26 = X.AnonymousClass4EQ.A02(r31)
            boolean r9 = X.C316216lI.A0C(r31)
            if (r9 == 0) goto L_0x396d
            r9 = r26
            float r9 = (float) r9
            r12 = 1058013184(0x3f100000, float:0.5625)
            float r9 = r9 * r12
            int r9 = (int) r9
            r27 = r9
        L_0x3065:
            r4.getClass()
            X.1Xy r9 = r4.A0C
            java.lang.String r9 = r9.getDominantColor()
            java.lang.Integer r48 = X.0nH.A0D(r9)
            if (r2 == 0) goto L_0x307c
            int r9 = X.00l.A08(r10, r2, r0, r0)
            r63 = 1
            if (r9 == 0) goto L_0x307e
        L_0x307c:
            r63 = 0
        L_0x307e:
            if (r62 != 0) goto L_0x3085
            if (r52 != 0) goto L_0x3085
            r9 = 0
            if (r63 == 0) goto L_0x3086
        L_0x3085:
            r9 = 1
        L_0x3086:
            java.lang.Boolean r47 = java.lang.Boolean.valueOf(r9)
            if (r2 == 0) goto L_0x3098
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r32)
            boolean r2 = X.0qQ.A0K(r3, r2)
            r53 = 1
            if (r2 != 0) goto L_0x309a
        L_0x3098:
            r53 = 0
        L_0x309a:
            r43 = r31
            r44 = r5
            r45 = r11
            r46 = r1
            r51 = r27
            X.5xX r12 = X.C309506Yn.A00(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r2 = r67
            r2.A0z = r0
            r2 = r68
            int r3 = r2.A01
            r2 = r67
            r2.A0D = r3
            r2 = r21
            r2.setImageDrawable(r12)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            X.2eS.A04(r2, r3)
            if (r60 != 0) goto L_0x3965
            r2 = r68
            int r2 = r2.A01
            boolean r2 = X.C309506Yn.A09(r5, r1, r2)
            if (r2 == 0) goto L_0x3962
            r9 = 36313909835860275(0x81034f002c0933, double:3.028401032351606E-306)
            r2 = r34
            boolean r2 = X.182.A06(r2, r5, r9)
            if (r2 == 0) goto L_0x3959
            android.view.View r3 = r55.getView()
            X.6MY r2 = new X.6MY
            r2.<init>(r3, r5)
        L_0x30e0:
            r3 = r64
            r3.A01 = r2
            if (r2 == 0) goto L_0x3153
            r3 = r68
            int r3 = r3.A01
            r13 = 0
            if (r3 <= 0) goto L_0x30ee
            r13 = 1
        L_0x30ee:
            r3 = r67
            r2.A02 = r3
            r2.A01 = r12
            if (r48 == 0) goto L_0x3953
            int r11 = r48.intValue()
        L_0x30fa:
            X.0s0 r10 = r2.A07
            X.0YZ[] r3 = X.AnonymousClass6MY.A08
            r9 = r3[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r10.Epx(r2, r3, r9)
            com.instagram.common.session.UserSession r11 = r2.A06
            r9 = 36610022058563545(0x82109f000517d9, double:3.21566359433737E-306)
            r3 = r34
            long r37 = X.182.A01(r3, r11, r9)
            r9 = 1
            int r3 = (r37 > r9 ? 1 : (r37 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x38b2
            X.5xX r10 = r2.A01
            int r3 = X.AnonymousClass6MY.A00(r2)
            java.lang.Integer r41 = java.lang.Integer.valueOf(r3)
            android.view.View r9 = r2.A05
            r42 = 0
        L_0x3128:
            X.TxY r3 = new X.TxY
            r37 = r3
            r38 = r9
            r39 = r11
            r40 = r10
            r37.<init>(r38, r39, r40, r41, r42)
        L_0x3135:
            X.6O7 r3 = (X.AnonymousClass6O7) r3
        L_0x3137:
            r2.A03 = r3
            if (r13 != 0) goto L_0x38a8
            if (r3 == 0) goto L_0x38a5
            android.animation.AnimatorSet r3 = r3.Abm()
        L_0x3141:
            r2.A00 = r3
            if (r3 == 0) goto L_0x314a
            android.animation.Animator$AnimatorListener r9 = r2.A04
            r3.addListener(r9)
        L_0x314a:
            r3 = r67
            boolean r3 = r3.A0k
            if (r3 == 0) goto L_0x38a0
            r2.Eqh()
        L_0x3153:
            X.0rh r28 = new X.0rh
            r28.<init>()
            if (r49 == 0) goto L_0x3892
            r9 = 61
        L_0x315c:
            r2 = r31
            float r3 = X.0nA.A04(r2, r9)
            r2 = r28
            r2.A00 = r3
            r58 = r5
            r59 = r1
            r61 = r52
            boolean r2 = X.AnonymousClass6MZ.A01(r58, r59, r60, r61, r62, r63)
            if (r2 != 0) goto L_0x319d
            boolean r2 = X.C297785sK.A0T(r4)
            if (r2 == 0) goto L_0x3186
            r2 = r32
            java.util.ArrayList r2 = r4.A3K(r2)
            if (r2 == 0) goto L_0x3186
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x319d
        L_0x3186:
            X.1Xy r2 = r4.A0C
            X.41Z r2 = r2.BUC()
            if (r2 == 0) goto L_0x388f
            X.4hQ r2 = r2.At8()
            if (r2 == 0) goto L_0x388f
            com.instagram.api.schemas.MoreInfoStickerCTAType r3 = r2.AtM()
        L_0x3198:
            com.instagram.api.schemas.MoreInfoStickerCTAType r2 = com.instagram.api.schemas.MoreInfoStickerCTAType.WIDE_CTA
            r15 = 0
            if (r3 != r2) goto L_0x319e
        L_0x319d:
            r15 = 1
        L_0x319e:
            com.instagram.api.schemas.MoreInfoStickerCTAType r2 = com.instagram.api.schemas.MoreInfoStickerCTAType.ONE_LINE
            r41 = 0
            if (r8 != r2) goto L_0x31a6
            r41 = 1
        L_0x31a6:
            r37 = r5
            r38 = r1
            r39 = r60
            r40 = r52
            r42 = r63
            boolean r2 = X.AnonymousClass6MZ.A01(r37, r38, r39, r40, r41, r42)
            r10 = 1061158912(0x3f400000, float:0.75)
            if (r2 == 0) goto L_0x386a
            X.0Tu r9 = X.0Tu.A06
            r2 = 37158334766186576(0x84034f002f0050, double:3.5624187585162315E-306)
            double r2 = X.182.A00(r9, r5, r2)
            float r9 = (float) r2
            float r10 = java.lang.Math.min(r10, r9)
        L_0x31c8:
            r3 = 1061158912(0x3f400000, float:0.75)
            if (r52 != 0) goto L_0x31d3
            if (r62 != 0) goto L_0x31d3
            if (r63 != 0) goto L_0x31d3
            r3 = 1058642330(0x3f19999a, float:0.6)
        L_0x31d3:
            r2 = r28
            float r13 = r2.A00
            int r2 = r12.A04
            float r11 = (float) r2
            float r13 = r13 / r11
            r2 = r27
            float r2 = (float) r2
            r35 = r2
            float r3 = r3 * r2
            int r2 = r12.A08
            float r9 = (float) r2
            float r3 = r3 / r9
            float r19 = java.lang.Math.min(r13, r3)
            float r9 = r9 * r19
            float r11 = r11 * r19
            r3 = r28
            r3.A00 = r11
            r3 = 0
            if (r15 != 0) goto L_0x31fc
            if (r8 == 0) goto L_0x3214
            if (r60 != 0) goto L_0x3214
            if (r52 != 0) goto L_0x3214
            if (r62 != 0) goto L_0x3214
        L_0x31fc:
            float r10 = r10 * r35
            float r10 = r10 - r9
            int r8 = (r10 > r30 ? 1 : (r10 == r30 ? 0 : -1))
            if (r8 <= 0) goto L_0x3214
            float r8 = r10 / r19
            int r13 = (int) r8
            int r11 = r12.A06
            int r8 = r13 / 2
            int r11 = r11 + r8
            r12.A06 = r11
            int r2 = r2 + r13
            r12.A08 = r2
            r12.invalidateSelf()
            float r9 = r9 + r10
        L_0x3214:
            r2 = r28
            float r2 = r2.A00
            int r8 = (int) r2
            r2 = r21
            X.0nA.A0V(r2, r8)
            int r2 = (int) r9
            r46 = r2
            r8 = r2
            r2 = r21
            X.0nA.A0f(r2, r8)
            r2 = r28
            float r8 = r2.A00
            r2 = r31
            float r8 = X.0nA.A01(r2, r8)
            r2 = r67
            r2.A08 = r8
            r2 = r31
            float r8 = X.0nA.A01(r2, r9)
            r2 = r67
            r2.A09 = r8
            r2 = r28
            float r15 = r2.A00
            if (r60 == 0) goto L_0x3253
            android.content.res.Resources r3 = r31.getResources()
            r2 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r2 = r3.getDimensionPixelSize(r2)
            float r3 = (float) r2
            float r3 = r3 * r19
        L_0x3253:
            r2 = r28
            float r2 = r2.A00
            float r2 = r2 + r3
            r3 = r28
            r3.A00 = r2
            X.1Xy r2 = r4.A0C
            X.3lx r2 = r2.C05()
            if (r2 == 0) goto L_0x3866
            X.3lv r2 = r2.Auw()
            if (r2 == 0) goto L_0x3866
            java.lang.Float r2 = r2.CGt()
            if (r2 == 0) goto L_0x3866
            float r11 = r2.floatValue()
        L_0x3274:
            float r11 = r11 * r35
            r10 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 * r9
            r2 = 36313909836253495(0x81034f00320937, double:3.02840103260028E-306)
            r8 = r34
            boolean r2 = X.182.A06(r8, r5, r2)
            float r45 = r11 - r10
            if (r2 == 0) goto L_0x32a2
            float r11 = r11 + r10
            r8 = 1045220557(0x3e4ccccd, float:0.2)
            float r8 = r8 * r35
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r3 = r3 * r35
            r2 = 1058642330(0x3f19999a, float:0.6)
            float r2 = r35 * r2
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x32a2
            int r2 = (r45 > r8 ? 1 : (r45 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x385e
            r45 = r8
        L_0x32a2:
            r11 = 1056964608(0x3f000000, float:0.5)
            float r24 = r45 + r10
            r2 = r28
            float r10 = r2.A00
            r3 = r31
            r2 = r32
            X.0qQ.A0B(r3, r2)
            int r2 = X.C316216lI.A02(r31)
            X.1Xy r3 = r4.A0C
            X.3lx r3 = r3.C05()
            if (r3 == 0) goto L_0x380c
            X.3lv r3 = r3.Auw()
            if (r3 == 0) goto L_0x380c
            java.lang.Float r3 = r3.CHS()
            if (r3 == 0) goto L_0x380c
            float r8 = r3.floatValue()
            float r2 = (float) r2
            float r8 = r8 * r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r10 / r3
            float r8 = r8 - r3
            int r3 = (r8 > r30 ? 1 : (r8 == r30 ? 0 : -1))
            if (r3 >= 0) goto L_0x3804
            r8 = 0
        L_0x32d9:
            r2 = r28
            float r3 = r2.A00
            float r2 = r3 * r11
            float r44 = r8 + r2
            r2 = r67
            r2.A07 = r8
            float r3 = r3 + r8
            r2.A06 = r3
            r42 = 36313909835860275(0x81034f002c0933, double:3.028401032351606E-306)
            r10 = r34
            r2 = r42
            boolean r2 = X.182.A06(r10, r5, r2)
            if (r2 == 0) goto L_0x3800
            android.view.View r14 = r55.getView()
            boolean r2 = r1.A1Z()
            if (r2 != 0) goto L_0x338a
            r38 = 2131100126(0x7f0601de, float:1.7812625E38)
            r37 = 2131100175(0x7f06020f, float:1.7812724E38)
            r11 = 2131165218(0x7f070022, float:1.7944647E38)
            r2 = 2131165200(0x7f070010, float:1.794461E38)
            r12 = 2131165190(0x7f070006, float:1.794459E38)
            X.0qQ.A0B(r14, r0)
            android.content.Context r3 = r14.getContext()
            android.content.res.Resources r10 = r3.getResources()
            float r13 = r10.getDimension(r11)
            float r2 = r10.getDimension(r2)
            int r2 = (int) r2
            r41 = r2
            r2 = r38
            int r40 = r3.getColor(r2)
            float r2 = r10.getDimension(r12)
            int r12 = (int) r2
            r2 = r37
            int r3 = r3.getColor(r2)
            float[] r2 = new float[r7]
            r39 = r2
            r2 = 0
        L_0x333c:
            r39[r2] = r13
            int r2 = r2 + 1
            if (r2 < r7) goto L_0x333c
            android.graphics.drawable.ShapeDrawable r38 = new android.graphics.drawable.ShapeDrawable
            r38.<init>()
            android.graphics.Paint r2 = r38.getPaint()
            r2.setColor(r3)
            android.graphics.Paint r37 = r38.getPaint()
            r2 = 1077936128(0x40400000, float:3.0)
            float r13 = r13 / r2
            r11 = r30
            r3 = r40
            r2 = r37
            r2.setShadowLayer(r13, r11, r11, r3)
            android.graphics.drawable.shapes.RoundRectShape r11 = new android.graphics.drawable.shapes.RoundRectShape
            r10 = r29
            r2 = r39
            r11.<init>(r2, r10, r10)
            r2 = r38
            r2.setShape(r11)
            android.graphics.drawable.ShapeDrawable[] r3 = new android.graphics.drawable.ShapeDrawable[]{r38}
            android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
            r2.<init>(r3)
            int r52 = r41 * 2
            r49 = r2
            r50 = r0
            r51 = r41
            r53 = r41
            r54 = r52
            r49.setLayerInset(r50, r51, r52, r53, r54)
            r14.setPadding(r12, r12, r12, r12)
            r14.setBackground(r2)
        L_0x338a:
            r2 = r45
            X.C306406Ma.A02(r14, r2, r8, r0)
            boolean r2 = r1.A1Z()
            if (r2 != 0) goto L_0x37fd
            r10 = r34
            r2 = r42
            boolean r2 = X.182.A06(r10, r5, r2)
            if (r2 == 0) goto L_0x37fd
            android.content.res.Resources r3 = r31.getResources()
            r2 = 2131165190(0x7f070006, float:1.794459E38)
            int r10 = r3.getDimensionPixelSize(r2)
        L_0x33aa:
            boolean r2 = r1.A1Z()
            if (r2 != 0) goto L_0x37f9
            r11 = r34
            r2 = r42
            boolean r2 = X.182.A06(r11, r5, r2)
            if (r2 == 0) goto L_0x37f9
            r2 = 36313909835925812(0x81034f002d0934, double:3.028401032393052E-306)
            boolean r2 = X.182.A06(r11, r5, r2)
            if (r2 == 0) goto L_0x37f9
            android.view.View r11 = r55.getView()
        L_0x33c9:
            X.0rm r42 = new X.0rm
            r42.<init>()
            r2 = 36324269294104500(0x810cbb00002fb4, double:3.034952395459444E-306)
            r12 = r34
            boolean r2 = X.182.A06(r12, r5, r2)
            if (r2 != 0) goto L_0x33dd
            if (r60 == 0) goto L_0x3494
        L_0x33dd:
            r2 = r64
            X.3oV r2 = r2.A08
            android.view.View r41 = r2.getView()
            r3 = r41
            r2 = r42
            r2.A00 = r3
            float r2 = (float) r10
            float r40 = r45 + r2
            float r39 = r8 + r2
            r3 = r23
            r2 = r41
            X.0qQ.A0B(r2, r3)
            X.0Tu r10 = X.0Tu.A06
            r2 = 37168694224880097(0x840cbb000a01e1, double:3.568970121908206E-306)
            double r2 = X.182.A00(r10, r5, r2)
            float r11 = (float) r2
            float r3 = r35 * r11
            float r3 = r3 - r9
            r2 = r30
            float r13 = java.lang.Math.max(r3, r2)
            r2 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r2
            r11 = 37168694224290268(0x840cbb000101dc, double:3.568970121535196E-306)
            double r2 = X.182.A00(r10, r5, r11)
            float r12 = (float) r2
            int r2 = (r12 > r30 ? 1 : (r12 == r30 ? 0 : -1))
            if (r2 <= 0) goto L_0x37be
            android.graphics.RectF r11 = new android.graphics.RectF
            r11.<init>(r12, r12, r12, r12)
        L_0x3422:
            int r2 = (r13 > r30 ? 1 : (r13 == r30 ? 0 : -1))
            if (r2 > 0) goto L_0x343e
            r37 = 36324269294825399(0x810cbb000b2fb7, double:3.0349523959153437E-306)
            r2 = r37
            boolean r2 = X.182.A06(r10, r5, r2)
            if (r2 == 0) goto L_0x37b5
            float r12 = r11.top
            float r10 = r11.bottom
            android.graphics.RectF r11 = new android.graphics.RectF
            r3 = r30
            r11.<init>(r3, r12, r3, r10)
        L_0x343e:
            if (r60 == 0) goto L_0x37b0
            android.content.res.Resources r3 = r31.getResources()
            r2 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r2 = r3.getDimensionPixelSize(r2)
            float r3 = (float) r2
        L_0x344c:
            r2 = r26
            float r2 = (float) r2
            float r10 = r39 + r15
            float r2 = r2 - r10
            float r14 = java.lang.Math.min(r3, r2)
            float r3 = r11.top
            float r3 = r3 * r15
            float r2 = r11.left
            float r2 = r2 * r15
            float r12 = java.lang.Math.min(r2, r13)
            float r2 = r11.right
            float r2 = r2 * r15
            float r2 = java.lang.Math.min(r2, r13)
            float r15 = r15 + r3
            float r15 = r15 + r14
            float r10 = r9 + r12
            float r10 = r10 + r2
            int r11 = (int) r15
            r2 = r41
            X.0nA.A0V(r2, r11)
            int r10 = (int) r10
            X.0nA.A0f(r2, r10)
            float r40 = r40 - r12
            float r39 = r39 - r3
            r11 = r2
            r10 = r40
            r2 = r39
            X.C306406Ma.A02(r11, r10, r2, r0)
            r2 = r67
            float r10 = r2.A07
            float r10 = r10 - r3
            r2.A07 = r10
            float r3 = r2.A06
            float r3 = r3 + r14
            r2.A06 = r3
            r2 = r42
            java.lang.Object r11 = r2.A00
            android.view.View r11 = (android.view.View) r11
        L_0x3494:
            r2 = r28
            float r2 = r2.A00
            float r12 = r8 - r2
            r2 = r64
            X.6Ot r10 = r2.A09
            X.C307406Pz.A01(r10)
            boolean r2 = X.C309506Yn.A08(r5, r1)
            if (r2 == 0) goto L_0x34c2
            r3 = r67
            r2 = r64
            r2.A00 = r3
            r2 = r65
            X.C307406Pz.A00(r5, r1, r2, r10)
            X.3oV r2 = r10.A07
            android.view.View r3 = r2.getView()
            r2 = r46
            X.0nA.A0f(r3, r2)
            r2 = r45
            X.C306406Ma.A02(r3, r2, r12, r0)
        L_0x34c2:
            X.3Dp r3 = X.C238833Dp.A00(r5)
            X.0qQ.A07(r3)
            X.3Ds r2 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            r3.A05(r11, r2)
            X.6Md r12 = new X.6Md
            r49 = r12
            r50 = r5
            r51 = r1
            r52 = r65
            r53 = r24
            r54 = r44
            r49.<init>(r50, r51, r52, r53, r54)
            r2 = 36313909835335984(0x81034f00240930, double:3.0284010320200425E-306)
            r10 = r34
            boolean r2 = X.182.A06(r10, r5, r2)
            if (r2 == 0) goto L_0x34f1
            r2 = r29
            r11.setOnTouchListener(r2)
        L_0x34f1:
            r2 = r67
            boolean r2 = X.C309506Yn.A0C(r5, r2)
            if (r2 == 0) goto L_0x3738
            r2 = r42
            java.lang.Object r9 = r2.A00
            android.view.View r9 = (android.view.View) r9
            r3 = 40
            X.9LZ r2 = new X.9LZ
            r2.<init>(r12, r3)
            r37 = r31
            r38 = r11
            r39 = r21
            r40 = r9
            r41 = r5
            r42 = r67
            r43 = r2
            X.AnonymousClass6MZ.A00(r37, r38, r39, r40, r41, r42, r43)
        L_0x3517:
            X.3aa r2 = X.C244063aa.CTA
            r3 = r21
            X.C244083ac.A05(r3, r2)
            if (r60 == 0) goto L_0x372d
            r2 = 36327619369515583(0x810fc7000e3a3f, double:3.037070996639084E-306)
            r9 = r34
            boolean r2 = X.182.A06(r9, r5, r2)
            if (r2 == 0) goto L_0x36e8
            X.1Xy r2 = r4.A0C
            X.41Z r2 = r2.BUC()
            if (r2 == 0) goto L_0x3729
            X.4hQ r2 = r2.At8()
            if (r2 == 0) goto L_0x3729
            com.instagram.api.schemas.MoreInfoStickerCTAType r3 = r2.AtM()
            com.instagram.api.schemas.MoreInfoStickerCTAType r2 = com.instagram.api.schemas.MoreInfoStickerCTAType.CHIP
            if (r3 != r2) goto L_0x3729
        L_0x3543:
            r21 = 1
        L_0x3545:
            r2 = r64
            X.6Pj r2 = r2.A02
            r26 = r2
            if (r16 == 0) goto L_0x36ae
            X.1Xy r2 = r4.A0C
            X.3lZ r2 = r2.getInjected()
            if (r2 == 0) goto L_0x36aa
            java.lang.String r9 = r2.BF3()
        L_0x3559:
            r3 = r32
            r2 = r26
            X.0qQ.A0B(r2, r3)
            X.3oV r14 = r2.A02
            android.view.View r2 = r14.getView()
            r2.setBackgroundColor(r0)
            r14.setVisibility(r7)
            if (r9 == 0) goto L_0x3604
            r3 = r31
            r10 = r19
            r2 = r26
            r2.A00(r3, r9, r10)
            if (r48 == 0) goto L_0x369b
            int r3 = r48.intValue()
        L_0x357d:
            android.view.View r2 = r14.getView()
            r2.setBackgroundColor(r3)
            android.content.res.Resources r10 = r31.getResources()
            r2 = 2131165259(0x7f07004b, float:1.794473E38)
            float r16 = r10.getDimension(r2)
            r9 = 2131165200(0x7f070010, float:1.794461E38)
            float r2 = r10.getDimension(r9)
            int r2 = (int) r2
            r23 = r2
            r11 = 2131099788(0x7f06008c, float:1.781194E38)
            r2 = r31
            int r17 = r2.getColor(r11)
            float r2 = r10.getDimension(r9)
            int r15 = (int) r2
            float r2 = r10.getDimension(r9)
            int r13 = (int) r2
            float[] r12 = new float[r7]
            r2 = 0
        L_0x35af:
            r12[r2] = r16
            int r2 = r2 + 1
            if (r2 < r7) goto L_0x35af
            android.graphics.drawable.ShapeDrawable r16 = new android.graphics.drawable.ShapeDrawable
            r16.<init>()
            android.graphics.Paint r2 = r16.getPaint()
            r2.setColor(r3)
            android.graphics.Paint r3 = r16.getPaint()
            r2 = r23
            float r2 = (float) r2
            r11 = r30
            r9 = r17
            r3.setShadowLayer(r2, r11, r11, r9)
            android.graphics.drawable.shapes.RoundRectShape r9 = new android.graphics.drawable.shapes.RoundRectShape
            r3 = r29
            r9.<init>(r12, r3, r3)
            r2 = r16
            r2.setShape(r9)
            android.graphics.drawable.ShapeDrawable[] r2 = new android.graphics.drawable.ShapeDrawable[]{r16}
            android.graphics.drawable.LayerDrawable r3 = new android.graphics.drawable.LayerDrawable
            r3.<init>(r2)
            r37 = r3
            r38 = r0
            r39 = r23
            r40 = r23
            r41 = r23
            r42 = r23
            r37.setLayerInset(r38, r39, r40, r41, r42)
            android.view.View r2 = r14.getView()
            r2.setPadding(r13, r15, r13, r15)
            android.view.View r2 = r14.getView()
            r2.setBackground(r3)
            r14.setVisibility(r0)
        L_0x3604:
            android.view.View r3 = r14.getView()
            X.IjZ r2 = new X.IjZ
            r9 = r2
            r10 = r31
            r11 = r64
            r12 = r28
            r13 = r24
            r14 = r19
            r15 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.0nA.A0q(r3, r2)
            if (r21 == 0) goto L_0x365a
            if (r18 == 0) goto L_0x365a
            long r2 = X.C18810W3l.A01(r18)
            java.util.Date r8 = new java.util.Date
            r8.<init>(r2)
            long r14 = r8.getTime()
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            long r2 = r2.getTime()
            long r14 = r14 - r2
            X.5F4 r2 = X.C70383O4k.A00
            long r8 = r2.A00
            long r2 = r2.A01
            int r10 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r10 > 0) goto L_0x3677
            int r2 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r2 > 0) goto L_0x3677
            X.Gcz r2 = new X.Gcz
            r8 = r2
            r9 = r31
            r10 = r5
            r12 = r18
            r13 = r19
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r3 = r65
            r3.AAb(r2)
            r2.start()
        L_0x365a:
            if (r25 == 0) goto L_0x3d50
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r25.iterator()
        L_0x3665:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x3d49
            java.lang.Object r3 = r9.next()
            boolean r2 = r3 instanceof X.AnonymousClass6ML
            if (r2 == 0) goto L_0x3665
            r8.add(r3)
            goto L_0x3665
        L_0x3677:
            X.0nE r2 = X.C61410nE.A00
            X.Hq9 r9 = new X.Hq9
            r3 = r31
            r9.<init>(r3, r2)
            long r2 = X.C18810W3l.A01(r18)
            java.util.Date r8 = new java.util.Date
            r8.<init>(r2)
            java.lang.Integer r2 = X.C18810W3l.A03(r18)
            java.lang.String r3 = r9.A00(r2, r8)
            r8 = r31
            r9 = r19
            r2 = r26
            r2.A00(r8, r3, r9)
            goto L_0x365a
        L_0x369b:
            r3 = 2130970169(0x7f040639, float:1.754904E38)
            r2 = r31
            int r3 = X.2Yu.A0H(r2, r3)
            int r3 = r2.getColor(r3)
            goto L_0x357d
        L_0x36aa:
            r9 = r29
            goto L_0x3559
        L_0x36ae:
            if (r17 == 0) goto L_0x36e2
            if (r18 == 0) goto L_0x36e2
            if (r21 == 0) goto L_0x36d0
            X.0nE r3 = X.C61410nE.A00
            X.Hq9 r10 = new X.Hq9
            r2 = r31
            r10.<init>(r2, r3)
            long r2 = X.C18810W3l.A01(r18)
            java.util.Date r9 = new java.util.Date
            r9.<init>(r2)
            java.lang.Integer r2 = X.C18810W3l.A03(r18)
            java.lang.String r9 = r10.A00(r2, r9)
            goto L_0x3559
        L_0x36d0:
            X.0nE r2 = X.C61410nE.A00
            r3 = r18
            X.Vkq r9 = X.C17116VIm.A00(r5, r2, r3)
            X.Uy1 r3 = X.Uy1.A0B
            r2 = r31
            java.lang.String r9 = r9.A00(r2, r3)
            goto L_0x3559
        L_0x36e2:
            java.lang.String r9 = r4.A2l()
            goto L_0x3559
        L_0x36e8:
            if (r17 == 0) goto L_0x3729
            com.instagram.user.model.UpcomingEvent r2 = r4.A27(r5)
            if (r2 == 0) goto L_0x3729
            boolean r2 = X.C18810W3l.A0C(r2)
            if (r2 == 0) goto L_0x3727
            r2 = 36327619369318972(0x810fc7000b3a3c, double:3.0370709965147465E-306)
            boolean r2 = X.182.A06(r9, r5, r2)
            if (r2 != 0) goto L_0x3718
            boolean r2 = X.C243213Xw.A08(r4)
            if (r2 == 0) goto L_0x3727
            boolean r2 = X.C243213Xw.A07(r4)
            if (r2 != 0) goto L_0x3727
            r2 = 36327619369450046(0x810fc7000d3a3e, double:3.037070996597638E-306)
            boolean r2 = X.182.A06(r9, r5, r2)
            if (r2 == 0) goto L_0x3727
        L_0x3718:
            r2 = 1
        L_0x3719:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            if (r2 == 0) goto L_0x3729
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x3729
            goto L_0x3543
        L_0x3727:
            r2 = 0
            goto L_0x3719
        L_0x3729:
            r21 = 0
            goto L_0x3545
        L_0x372d:
            r2 = r64
            X.6Pj r2 = r2.A02
            X.3oV r2 = r2.A02
            r2.setVisibility(r7)
            goto L_0x365a
        L_0x3738:
            X.3ui r10 = new X.3ui
            r10.<init>()
            X.3WT r2 = X.AnonymousClass3WT.CTA
            r10.A11 = r2
            r2 = r24
            r10.A03 = r2
            r2 = r44
            r10.A04 = r2
            float r9 = r9 / r35
            r10.A02 = r9
            r2 = r28
            float r3 = r2.A00
            r2 = r64
            int r2 = r2.A04
            float r2 = (float) r2
            float r3 = r3 / r2
            r10.A00 = r3
            boolean r2 = X.C297785sK.A0b(r1)
            if (r2 != 0) goto L_0x376d
            boolean r2 = X.C297785sK.A0Q(r4)
            if (r2 != 0) goto L_0x376d
            r2 = r31
            java.lang.String r2 = X.C309506Yn.A03(r2, r5, r1)
            r10.A1N = r2
        L_0x376d:
            boolean r2 = X.C297785sK.A0D(r5, r1)
            if (r2 != 0) goto L_0x3781
            r2 = 36605744271594810(0x820cbb000c153a, double:3.212958304633077E-306)
            r9 = r34
            long r2 = X.182.A01(r9, r5, r2)
            int r9 = (int) r2
            r10.A08 = r9
        L_0x3781:
            r2 = r42
            java.lang.Object r2 = r2.A00
            android.view.View r2 = (android.view.View) r2
            X.JB8 r49 = new X.JB8
            r50 = r31
            r51 = r21
            r52 = r5
            r53 = r1
            r54 = r10
            r55 = r67
            r56 = r65
            r57 = r12
            r58 = r42
            r59 = r27
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            r9 = r31
            r10 = r11
            r11 = r21
            r12 = r2
            r13 = r5
            r14 = r67
            r15 = r49
            X.AnonymousClass6MZ.A00(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x3517
        L_0x37b0:
            float r3 = r11.bottom
            float r3 = r3 * r15
            goto L_0x344c
        L_0x37b5:
            android.graphics.RectF r11 = new android.graphics.RectF
            r12 = r30
            r11.<init>(r12, r12, r12, r12)
            goto L_0x343e
        L_0x37be:
            r11 = 37168694224421341(0x840cbb000301dd, double:3.568970121618087E-306)
            double r2 = X.182.A00(r10, r5, r11)
            float r11 = (float) r2
            r38 = r11
            r11 = 37168694224486878(0x840cbb000401de, double:3.568970121659533E-306)
            double r2 = X.182.A00(r10, r5, r11)
            float r11 = (float) r2
            r37 = r11
            r11 = 37168694224552415(0x840cbb000501df, double:3.568970121700979E-306)
            double r2 = X.182.A00(r10, r5, r11)
            float r11 = (float) r2
            r23 = r11
            r11 = 37168694224617952(0x840cbb000601e0, double:3.5689701217424246E-306)
            double r2 = X.182.A00(r10, r5, r11)
            float r14 = (float) r2
            android.graphics.RectF r11 = new android.graphics.RectF
            r12 = r38
            r3 = r37
            r2 = r23
            r11.<init>(r12, r2, r3, r14)
            goto L_0x3422
        L_0x37f9:
            r11 = r21
            goto L_0x33c9
        L_0x37fd:
            r10 = 0
            goto L_0x33aa
        L_0x3800:
            r14 = r21
            goto L_0x338a
        L_0x3804:
            float r2 = r2 - r10
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x32d9
            r8 = r2
            goto L_0x32d9
        L_0x380c:
            r2 = r68
            boolean r2 = X.C309506Yn.A0B(r5, r1, r2)
            if (r2 == 0) goto L_0x3859
            boolean r2 = X.C297785sK.A0a(r1)
            if (r2 == 0) goto L_0x3845
            android.content.res.Resources r3 = r31.getResources()
            r2 = 2131165184(0x7f070000, float:1.7944578E38)
            int r2 = r3.getDimensionPixelSize(r2)
        L_0x3824:
            if (r14 == 0) goto L_0x3831
            r3 = r64
            boolean r3 = r3.A0B
            if (r3 != 0) goto L_0x3831
            r3 = r64
            int r3 = r3.A03
            int r2 = r2 + r3
        L_0x3831:
            r3 = r68
            boolean r3 = X.C297785sK.A0H(r5, r1, r3)
            if (r3 == 0) goto L_0x383b
            int r3 = (int) r10
            int r2 = r2 - r3
        L_0x383b:
            int r3 = X.C316216lI.A02(r31)
            float r8 = (float) r3
            float r2 = (float) r2
            float r8 = r8 - r2
            float r8 = r8 - r10
            goto L_0x32d9
        L_0x3845:
            r2 = 36595384810342535(0x82034f000a0887, double:3.206406939622936E-306)
            r8 = r34
            long r2 = X.182.A01(r8, r5, r2)
            int r8 = (int) r2
            r2 = r31
            float r2 = X.0nA.A04(r2, r8)
            int r2 = (int) r2
            goto L_0x3824
        L_0x3859:
            r2 = r64
            int r2 = r2.A05
            goto L_0x3824
        L_0x385e:
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x32a2
            float r45 = r3 - r9
            goto L_0x32a2
        L_0x3866:
            r11 = 1056964608(0x3f000000, float:0.5)
            goto L_0x3274
        L_0x386a:
            if (r15 != 0) goto L_0x31c8
            if (r52 != 0) goto L_0x31c8
            if (r63 != 0) goto L_0x31c8
            if (r8 == 0) goto L_0x3885
            int r3 = r8.ordinal()
            r2 = r32
            if (r3 == r2) goto L_0x388a
            r2 = r23
            if (r3 == r2) goto L_0x31c8
            r2 = 3
            if (r3 == r2) goto L_0x31c8
            r2 = r36
            if (r3 == r2) goto L_0x31c8
        L_0x3885:
            r10 = 1058642330(0x3f19999a, float:0.6)
            goto L_0x31c8
        L_0x388a:
            r10 = 1060320051(0x3f333333, float:0.7)
            goto L_0x31c8
        L_0x388f:
            r3 = 0
            goto L_0x3198
        L_0x3892:
            r2 = 36603575312978879(0x820ac2000a13bf, double:3.2115866464706666E-306)
            r9 = r34
            long r2 = X.182.A01(r9, r5, r2)
            int r9 = (int) r2
            goto L_0x315c
        L_0x38a0:
            r2.EIN()
            goto L_0x3153
        L_0x38a5:
            r3 = 0
            goto L_0x3141
        L_0x38a8:
            r9 = r32
            r3 = r67
            r3.A0k = r9
            r3.A0j = r9
            goto L_0x314a
        L_0x38b2:
            r9 = 2
            int r3 = (r37 > r9 ? 1 : (r37 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x38c8
            X.5xX r10 = r2.A01
            int r3 = X.AnonymousClass6MY.A00(r2)
            java.lang.Integer r41 = java.lang.Integer.valueOf(r3)
            android.view.View r9 = r2.A05
            r42 = 1
            goto L_0x3128
        L_0x38c8:
            r9 = 5
            int r3 = (r37 > r9 ? 1 : (r37 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x38f5
            X.5xX r10 = r2.A01
            android.view.View r9 = r2.A05
            int r3 = X.AnonymousClass6MY.A00(r2)
            java.lang.Integer r41 = java.lang.Integer.valueOf(r3)
            r43 = 1
            r44 = 0
        L_0x38de:
            if (r13 != 0) goto L_0x38e6
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            java.lang.Integer r42 = java.lang.Integer.valueOf(r3)
        L_0x38e6:
            X.TxX r3 = new X.TxX
            r37 = r3
            r38 = r9
            r39 = r11
            r40 = r10
            r37.<init>(r38, r39, r40, r41, r42, r43, r44)
            goto L_0x3135
        L_0x38f5:
            r9 = 4
            int r3 = (r37 > r9 ? 1 : (r37 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x390c
            X.5xX r10 = r2.A01
            android.view.View r9 = r2.A05
            int r3 = X.AnonymousClass6MY.A00(r2)
            java.lang.Integer r41 = java.lang.Integer.valueOf(r3)
            r43 = 0
            r44 = 1
            goto L_0x38de
        L_0x390c:
            r9 = 3
            int r3 = (r37 > r9 ? 1 : (r37 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x3939
            X.5xX r10 = r2.A01
            android.view.View r9 = r2.A05
            int r3 = X.AnonymousClass6MY.A00(r2)
            java.lang.Integer r41 = java.lang.Integer.valueOf(r3)
            if (r13 != 0) goto L_0x3926
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            java.lang.Integer r42 = java.lang.Integer.valueOf(r3)
        L_0x3926:
            X.TxX r3 = new X.TxX
            r37 = r3
            r38 = r9
            r39 = r11
            r40 = r10
            r43 = r32
            r44 = r32
            r37.<init>(r38, r39, r40, r41, r42, r43, r44)
            goto L_0x3135
        L_0x3939:
            r9 = 6
            int r3 = (r37 > r9 ? 1 : (r37 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x3950
            X.5xX r10 = r2.A01
            int r3 = X.AnonymousClass6MY.A00(r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            X.WbC r3 = new X.WbC
            r3.<init>(r11, r10, r9)
            goto L_0x3135
        L_0x3950:
            r3 = 0
            goto L_0x3137
        L_0x3953:
            int[] r3 = X.AnonymousClass6LW.A08
            r11 = r3[r0]
            goto L_0x30fa
        L_0x3959:
            X.6MY r2 = new X.6MY
            r3 = r21
            r2.<init>(r3, r5)
            goto L_0x30e0
        L_0x3962:
            r2 = 0
            goto L_0x30e0
        L_0x3965:
            r3 = r29
            r2 = r64
            r2.A01 = r3
            goto L_0x3153
        L_0x396d:
            int r27 = X.AnonymousClass0nB.A01(r31)
            goto L_0x3065
        L_0x3973:
            if (r10 == 0) goto L_0x398e
            if (r18 == 0) goto L_0x398e
            X.0nE r10 = X.C61410nE.A00
            r9 = r18
            X.Vkq r11 = X.C17116VIm.A00(r5, r10, r9)
            X.Uy1 r10 = X.Uy1.A0B
            r9 = r31
            java.lang.String r42 = r11.A00(r9, r10)
            goto L_0x3005
        L_0x3989:
            r42 = 0
            if (r11 != 0) goto L_0x3005
            goto L_0x3994
        L_0x398e:
            if (r4 == 0) goto L_0x3989
            java.lang.String r42 = r4.A2l()
        L_0x3994:
            if (r10 == 0) goto L_0x3015
            goto L_0x3005
        L_0x3998:
            X.1Xy r2 = r4.A0C
            X.3lZ r2 = r2.getInjected()
            if (r2 == 0) goto L_0x39c9
            com.instagram.api.schemas.IGCTATextVariant r2 = r2.BF0()
            if (r2 == 0) goto L_0x39c9
            java.lang.String r2 = r2.AtR()
        L_0x39aa:
            X.1Xy r3 = r4.A0C
            X.3lZ r3 = r3.getInjected()
            if (r3 == 0) goto L_0x39c7
            com.instagram.api.schemas.IGCTATextVariant r3 = r3.BF0()
            if (r3 == 0) goto L_0x39c7
            java.lang.Boolean r3 = r3.BAz()
        L_0x39bc:
            if (r2 == 0) goto L_0x2ff0
            int r9 = r2.length()
            if (r9 == 0) goto L_0x2ff0
            r10 = r2
            goto L_0x3029
        L_0x39c7:
            r3 = 0
            goto L_0x39bc
        L_0x39c9:
            r2 = 0
            goto L_0x39aa
        L_0x39cb:
            com.instagram.api.schemas.MoreInfoStickerCTAType r2 = com.instagram.api.schemas.MoreInfoStickerCTAType.CHIP
            r60 = 1
            if (r8 == r2) goto L_0x2fcc
            goto L_0x2fca
        L_0x39d3:
            r62 = 0
            goto L_0x2fb8
        L_0x39d7:
            r9 = 0
            goto L_0x2fa2
        L_0x39da:
            r49 = 0
            goto L_0x2f99
        L_0x39de:
            r50 = 0
            goto L_0x2f8d
        L_0x39e2:
            if (r17 == 0) goto L_0x39ec
            if (r10 == 0) goto L_0x39e8
            goto L_0x2f81
        L_0x39e8:
            com.instagram.api.schemas.MoreInfoStickerCTAType r8 = com.instagram.api.schemas.MoreInfoStickerCTAType.CHIP
            goto L_0x2f83
        L_0x39ec:
            if (r4 == 0) goto L_0x3a02
            X.1Xy r2 = r4.A0C
            X.41Z r2 = r2.BUC()
            if (r2 == 0) goto L_0x3a02
            X.4hQ r2 = r2.At8()
            if (r2 == 0) goto L_0x3a02
            com.instagram.api.schemas.MoreInfoStickerCTAType r8 = r2.AtM()
            goto L_0x2f83
        L_0x3a02:
            r8 = 0
            goto L_0x2f83
        L_0x3a05:
            r2 = 36327619369843268(0x810fc700133a44, double:3.0370709968463134E-306)
            goto L_0x2f75
        L_0x3a0c:
            boolean r2 = X.C243213Xw.A08(r4)
            if (r2 == 0) goto L_0x2f7c
            com.instagram.user.model.UpcomingEvent r2 = r4.A27(r5)
            if (r2 == 0) goto L_0x3a27
            java.lang.Integer r3 = X.C18810W3l.A03(r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r3 != r2) goto L_0x3a27
            r2 = 36327619369777731(0x810fc700123a43, double:3.0370709968048675E-306)
            goto L_0x2f75
        L_0x3a27:
            r2 = 36327619369581120(0x810fc7000f3a40, double:3.03707099668053E-306)
            goto L_0x2f75
        L_0x3a2e:
            r18 = 0
        L_0x3a30:
            r17 = 0
            goto L_0x2f7c
        L_0x3a34:
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.ImageView"
            r3 = r21
            X.0qQ.A0C(r3, r2)
            goto L_0x2f10
        L_0x3a3d:
            X.0Tu r8 = X.0Tu.A06
            r2 = 36319059499424654(0x8107fe000a1b8e, double:3.03165770032575E-306)
            boolean r2 = X.182.A06(r8, r5, r2)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x3a9b
            boolean r2 = X.C297785sK.A0Z(r1)
            if (r2 == 0) goto L_0x3a9b
            r6.A0A = r12
            X.Gdp r2 = new X.Gdp
            r2.<init>(r11)
            r11.setOutlineProvider(r2)
            r11.setClipToOutline(r12)
            android.view.ViewGroup$LayoutParams r2 = r58.getLayoutParams()
            boolean r2 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x3a7c
            android.view.ViewGroup$LayoutParams r3 = r58.getLayoutParams()
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r3, r2)
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            r2 = 12
            float r2 = X.0nA.A04(r10, r2)
            int r2 = (int) r2
            r3.setMargins(r2, r2, r2, r2)
        L_0x3a7c:
            r2 = r57
            X.3Hx r2 = r2.A0A
            if (r2 == 0) goto L_0x3a86
            com.instagram.api.schemas.IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum r3 = r2.A00
            if (r3 != 0) goto L_0x3a88
        L_0x3a86:
            com.instagram.api.schemas.IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum r3 = com.instagram.api.schemas.IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum.UNRECOGNIZED
        L_0x3a88:
            com.instagram.api.schemas.IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum r2 = com.instagram.api.schemas.IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum.IMAGE_WITH_ICON
            if (r3 != r2) goto L_0x3a9b
            android.widget.ImageView r8 = r6.A0E
            X.IDS r3 = new X.IDS
            r2 = r65
            r3.<init>(r1, r2)
            r8.setOnTouchListener(r3)
            r8.setVisibility(r0)
        L_0x3a9b:
            r11.setOnTouchListener(r9)
            r6.A08 = r12
            goto L_0x2ecf
        L_0x3aa2:
            r2 = 18
            goto L_0x2e70
        L_0x3aa6:
            X.1P7.A02(r5)
            java.lang.String r3 = r8.A07
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r2 = X.0nH.A0C(r3, r2)
            boolean r3 = X.1P7.A02(r5)
            if (r3 == 0) goto L_0x3abd
            int r9 = X.W1z.A00(r8)
            goto L_0x2e5d
        L_0x3abd:
            int r9 = X.AnonymousClass6MG.A00(r8)
            goto L_0x2e5d
        L_0x3ac3:
            r11.setVisibility(r0)
            if (r28 == 0) goto L_0x3c24
            X.0nA.A0V(r11, r10)
            r2 = r26
            X.0nA.A0e(r11, r2)
        L_0x3ad0:
            r10 = 0
        L_0x3ad1:
            int r2 = r11.getChildCount()
            if (r10 >= r2) goto L_0x2e28
            r2 = r19
            java.lang.Object r2 = r2.get(r10)
            X.1Xj r2 = (X.1Xj) r2
            com.instagram.model.mediasize.ExtendedImageUrl r18 = r2.A1n(r12)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r2 = r13.A0A
            r16 = r2
            X.3ui r9 = new X.3ui
            r9.<init>()
            X.3WT r2 = X.AnonymousClass3WT.COLLECTION_AD_THUMBNAIL
            r9.A11 = r2
            java.lang.String r2 = r1.A0k
            r9.A1d = r2
            r9.A05 = r10
            X.1Xy r2 = r4.A0C
            java.util.List r3 = r2.Aok()
            if (r3 == 0) goto L_0x3c20
            int r2 = r10 + 1
            java.lang.Object r2 = r3.get(r2)
            X.1Xj r2 = (X.1Xj) r2
            if (r2 == 0) goto L_0x3c20
            X.1Xy r2 = r2.A0C
            X.56P r2 = r2.C4I()
            if (r2 == 0) goto L_0x3c20
            java.util.List r2 = r2.BN4()
        L_0x3b14:
            com.instagram.model.androidlink.AndroidLink r3 = X.AnonymousClass47K.A03(r12, r5, r2, r0)
            if (r3 == 0) goto L_0x3b26
            X.47L r2 = X.C271714jT.A01(r3)
            if (r2 == 0) goto L_0x3b26
            java.lang.String r2 = r3.CGH()
            r9.A1N = r2
        L_0x3b26:
            int r2 = X.0nA.A09(r12)
            float r2 = (float) r2
            r15 = r2
            X.0Tu r14 = X.0Tu.A06
            r2 = 37162535241187566(0x840721000100ee, double:3.565075155820813E-306)
            double r2 = X.182.A00(r14, r5, r2)
            float r14 = (float) r2
            if (r28 == 0) goto L_0x3c1c
            java.lang.Integer r43 = X.AnonymousClass05K.A0C
        L_0x3b3c:
            X.9Xm r2 = new X.9Xm
            r38 = r2
            r39 = r12
            r40 = r16
            r41 = r9
            r42 = r65
            r44 = r15
            r45 = r14
            r38.<init>(r39, r40, r41, r42, r43, r44, r45)
            android.view.GestureDetector r17 = new android.view.GestureDetector
            r3 = r17
            r3.<init>(r12, r2)
            android.view.View r3 = r11.getChildAt(r10)
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r3, r2)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r29 == 0) goto L_0x3bbe
            android.view.View r9 = r3.getChildAt(r0)
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.LinearLayout"
            X.0qQ.A0C(r9, r2)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            android.view.View r15 = r9.getChildAt(r0)
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r15, r2)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r2 = r37
            android.view.View r3 = r9.getChildAt(r2)
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.IgImageView"
            X.0qQ.A0C(r3, r2)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            X.1Xy r2 = r4.A0C
            java.util.List r14 = r2.Aok()
            if (r14 == 0) goto L_0x3bfe
            int r2 = r10 + 1
            java.lang.Object r2 = r14.get(r2)
            X.1Xj r2 = (X.1Xj) r2
            if (r2 == 0) goto L_0x3bfe
            X.1Xy r2 = r2.A0C
            X.56P r2 = r2.C4I()
            if (r2 == 0) goto L_0x3bfe
            java.lang.String r16 = r2.BgN()
            if (r16 == 0) goto L_0x3bfe
            android.content.res.Resources r14 = r12.getResources()     // Catch:{ NotFoundException -> 0x3bdf }
            r2 = 2131165287(0x7f070067, float:1.7944787E38)
            int r2 = r14.getDimensionPixelSize(r2)     // Catch:{ NotFoundException -> 0x3bdf }
            X.0nA.A0V(r15, r2)     // Catch:{ NotFoundException -> 0x3bdf }
            r2 = r16
            r15.setText(r2)     // Catch:{ NotFoundException -> 0x3bdf }
            r2 = -1
            r15.setBackgroundColor(r2)     // Catch:{ NotFoundException -> 0x3bdf }
            goto L_0x3bfe
        L_0x3bbe:
            android.view.View r3 = r3.getChildAt(r0)
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.IgImageView"
            X.0qQ.A0C(r3, r2)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            if (r18 == 0) goto L_0x3bd2
            r9 = r69
            r2 = r18
            r3.setUrl(r2, r9)
        L_0x3bd2:
            if (r35 == 0) goto L_0x3c11
            X.OkW r9 = new X.OkW
            r2 = r17
            r9.<init>(r2)
            r3.setOnTouchListener(r9)
            goto L_0x3c11
        L_0x3bdf:
            X.0wj r2 = X.0wj.A01
            r15 = 817903741(0x30c0387d, float:1.3985894E-9)
            java.lang.String r14 = "STRING_RESOURCE_ERROR"
            X.0f9 r16 = r2.AEf(r14, r15)
            java.lang.String r14 = "String resource not found for"
            java.lang.String r2 = r1.A0U(r5)
            java.lang.String r15 = X.002.A0R(r14, r2)
            java.lang.String r14 = "message"
            r2 = r16
            r2.ABQ(r14, r15)
            r16.report()
        L_0x3bfe:
            if (r18 == 0) goto L_0x3c07
            r14 = r69
            r2 = r18
            r3.setUrl(r2, r14)
        L_0x3c07:
            X.OkV r14 = new X.OkV
            r2 = r17
            r14.<init>(r2)
            r9.setOnTouchListener(r14)
        L_0x3c11:
            X.3aa r2 = X.C244063aa.MEDIA_THUMBNAIL
            X.C244083ac.A05(r3, r2)
            int r10 = r10 + 1
            if (r10 >= r8) goto L_0x2e28
            goto L_0x3ad1
        L_0x3c1c:
            java.lang.Integer r43 = X.AnonymousClass05K.A0N
            goto L_0x3b3c
        L_0x3c20:
            r2 = r27
            goto L_0x3b14
        L_0x3c24:
            int r14 = r8 / r23
            int r10 = X.AnonymousClass0nB.A01(r12)
            int r9 = X.C316216lI.A02(r12)
            int r2 = r10 / r23
            float r2 = (float) r2
            r3 = 1062551421(0x3f553f7d, float:0.833)
            float r3 = r3 * r2
            int r16 = X.AnonymousClass1GB.A01(r3)
            r3 = 1028443341(0x3d4ccccd, float:0.05)
            float r2 = r2 * r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r3
            int r15 = X.AnonymousClass1GB.A01(r2)
            int r2 = r16 * 2
            int r2 = r2 + r15
            int r10 = r10 - r2
            int r10 = r10 / r23
            if (r29 == 0) goto L_0x3c59
            android.content.res.Resources r3 = r12.getResources()
            r2 = 2131165287(0x7f070067, float:1.7944787E38)
            int r2 = r3.getDimensionPixelSize(r2)
            int r16 = r16 + r2
        L_0x3c59:
            int r16 = r16 * r14
            int r2 = r14 + -1
            int r15 = r15 * r2
            int r16 = r16 + r15
            r2 = r23
            if (r14 != r2) goto L_0x3c71
            android.content.res.Resources r3 = r12.getResources()
            r2 = 2131165287(0x7f070067, float:1.7944787E38)
            int r2 = r3.getDimensionPixelSize(r2)
            int r16 = r16 + r2
        L_0x3c71:
            int r9 = r9 - r16
            int r9 = r9 / r23
            X.0nA.A0d(r11, r10)
            X.0nA.A0U(r11, r10)
            X.0nA.A0e(r11, r9)
            X.0nA.A0T(r11, r9)
            goto L_0x3ad0
        L_0x3c83:
            android.content.res.Resources r15 = r12.getResources()
            r2 = 2131165235(0x7f070033, float:1.7944681E38)
            int r17 = r15.getDimensionPixelSize(r2)
            goto L_0x2d65
        L_0x3c90:
            r2 = 0
            goto L_0x2d57
        L_0x3c93:
            r21 = 0
            goto L_0x2d88
        L_0x3c97:
            if (r35 != 0) goto L_0x2d2e
            int r2 = r14 - r9
            int r2 = r2 - r10
            int r3 = r2 / 2
            goto L_0x2d2f
        L_0x3ca0:
            android.view.ViewGroup r11 = r13.A05
            if (r11 == 0) goto L_0x3f23
            java.util.List r2 = r4.A3W()
            int r3 = r2.size()
            r2 = r17
            if (r3 >= r2) goto L_0x3cbc
            android.view.ViewGroup r11 = r13.A03
            if (r11 == 0) goto L_0x3f1f
        L_0x3cb4:
            r19 = 0
            r35 = 1
            r29 = 0
            goto L_0x2cf1
        L_0x3cbc:
            r8 = 6
            goto L_0x3cb4
        L_0x3cbe:
            android.view.ViewGroup r11 = r13.A01
            if (r11 == 0) goto L_0x3f27
            r19 = 56
            r8 = 2
            goto L_0x3cd3
        L_0x3cc6:
            r19 = 0
            r8 = 2
            r35 = 0
            goto L_0x3cd5
        L_0x3ccc:
            android.view.ViewGroup r11 = r13.A00
            if (r11 == 0) goto L_0x3f2f
            r19 = 48
            r8 = 3
        L_0x3cd3:
            r35 = 1
        L_0x3cd5:
            r29 = 0
            goto L_0x3ce3
        L_0x3cd8:
            android.view.ViewGroup r11 = r13.A02
            if (r11 == 0) goto L_0x3f2b
            r19 = 56
            r8 = 2
            r35 = 1
            r29 = 1
        L_0x3ce3:
            r28 = 1
            if (r35 == 0) goto L_0x2cff
            goto L_0x2cf3
        L_0x3ce9:
            if (r3 == 0) goto L_0x2caa
            X.6PH r12 = r6.A0k
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r13 = r6.A0p
            X.0qQ.A0B(r12, r0)
            r3 = r22
            X.0qQ.A0B(r13, r3)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r3 = r12.A0A
            android.content.Context r8 = r3.getContext()
            X.6M7 r3 = X.AnonymousClass6M6.A0O
            X.0qQ.A0A(r8)
            X.6M6 r11 = r3.A00(r8)
            X.6M8 r10 = new X.6M8
            r3 = r68
            r10.<init>(r2, r1, r3)
            X.6M9 r9 = new X.6M9
            r3 = r65
            r9.<init>(r13, r1, r3)
            X.6MA r13 = new X.6MA
            r13.<init>(r8, r11)
            r3 = r67
            r3.A0S = r13
            java.util.ArrayList r25 = new java.util.ArrayList
            r25.<init>()
            X.3oV r8 = r12.A09
            X.6ML r3 = new X.6ML
            r37 = r3
            r38 = r2
            r39 = r8
            r40 = r1
            r41 = r68
            r42 = r9
            r43 = r67
            r44 = r10
            r45 = r11
            r46 = r65
            r47 = r13
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r3.A09()
            com.instagram.common.ui.base.IgFrameLayout r2 = r12.A01
            r2.setVisibility(r0)
            goto L_0x2ca5
        L_0x3d49:
            java.lang.Object r9 = X.00k.A0J(r8)
            X.6ML r9 = (X.AnonymousClass6ML) r9
            goto L_0x3d51
        L_0x3d50:
            r9 = 0
        L_0x3d51:
            r2 = 36326940763764824(0x810f2900003858, double:3.036641843629778E-306)
            r8 = r34
            boolean r2 = X.182.A06(r8, r5, r2)
            if (r2 == 0) goto L_0x3d63
            if (r9 == 0) goto L_0x3d63
            r9.A08()
        L_0x3d63:
            r64.A01()
            r2 = 36313909835073836(0x81034f0020092c, double:3.028401031854259E-306)
            boolean r2 = X.182.A06(r8, r5, r2)
            if (r2 == 0) goto L_0x3d75
            r2 = r32
            r6.A0B = r2
        L_0x3d75:
            if (r22 == 0) goto L_0x3d7e
            boolean r2 = X.C297785sK.A0Y(r1)
            r3 = 0
            if (r2 == 0) goto L_0x3d7f
        L_0x3d7e:
            r3 = 1
        L_0x3d7f:
            boolean r2 = X.C297785sK.A0O(r4)
            if (r3 == 0) goto L_0x3db9
            if (r2 != 0) goto L_0x3db9
            X.3WT r2 = X.AnonymousClass3WT.PRODUCT
            java.util.List r2 = r1.Bkd(r2)
            if (r2 == 0) goto L_0x3d96
            boolean r3 = r2.isEmpty()
            r2 = 1
            if (r3 == 0) goto L_0x3d97
        L_0x3d96:
            r2 = 0
        L_0x3d97:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x3da8
            X.6mO r3 = r6.A0P
            r2 = r66
            X.AnonymousClass6WX.A00(r1, r3, r2)
        L_0x3da8:
            java.lang.Boolean r2 = r1.A0N()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x3db9
            X.6mP r3 = r6.A0O
            r2 = r65
            X.AnonymousClass6WY.A00(r5, r1, r3, r2)
        L_0x3db9:
            boolean r2 = X.C297785sK.A0m(r68)
            X.6PF r8 = r6.A0W
            if (r2 == 0) goto L_0x3efb
            android.widget.FrameLayout r4 = r6.Bkk()
            java.lang.String r2 = "null cannot be cast to non-null type android.view.View"
            X.0qQ.A0C(r4, r2)
            X.0qQ.A0B(r8, r0)
            r9 = 1
            r3 = 3
            r2 = r33
            X.0qQ.A0B(r4, r2)
            if (r20 == 0) goto L_0x3f03
            X.3oV r2 = r8.A05
            android.view.View r2 = r2.getView()
            r2.setVisibility(r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r2 = r8.A01()
            r2.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r2 = r8.A00()
            r2.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r10 = r8.A00()
            com.instagram.common.typedurl.ImageUrl r6 = r20.Bh3()
            r2 = r69
            r10.setUrl(r6, r2)
            com.instagram.common.ui.base.IgTextView r2 = r8.A01
            if (r2 == 0) goto L_0x3f0f
            r2.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r6 = r8.A01
            if (r6 == 0) goto L_0x3f0f
            java.lang.String r2 = r20.getUsername()
            r6.setText(r2)
            com.instagram.common.ui.base.IgTextView r2 = r8.A01
            if (r2 == 0) goto L_0x3f0f
            android.content.Context r6 = r2.getContext()
            X.4gb r11 = new X.4gb
            r11.<init>()
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r2 = r8.A01()
            r11.A0I(r2)
            java.lang.String r2 = r20.getFullName()
            if (r2 == 0) goto L_0x3ed1
            int r2 = r2.length()
            if (r2 == 0) goto L_0x3ed1
            r12 = 2131441611(0x7f0b37cb, float:1.8505239E38)
            r10 = 2131441612(0x7f0b37cc, float:1.850524E38)
            r2 = r36
            r11.A0C(r12, r2, r10, r3)
            r2 = 2131441610(0x7f0b37ca, float:1.8505236E38)
            r11.A0C(r12, r3, r2, r3)
            com.instagram.common.ui.base.IgTextView r2 = r8.A02
            if (r2 == 0) goto L_0x3f0b
            r2.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r10 = r8.A02
            if (r10 == 0) goto L_0x3f0b
            java.lang.String r2 = r20.getFullName()
        L_0x3e4c:
            r10.setText(r2)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r2 = r8.A01()
            r11.A0G(r2)
            boolean r10 = X.AnonymousClass4EQ.A0G(r1)
            com.instagram.common.ui.base.IgTextView r2 = r8.A00
            if (r10 == 0) goto L_0x3ea7
            if (r2 == 0) goto L_0x3f07
            r2.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r7 = r8.A00
            if (r7 == 0) goto L_0x3f07
            X.0qQ.A0A(r6)
            java.lang.CharSequence r2 = X.AnonymousClass4EQ.A05(r6, r5, r1)
            r7.setText(r2)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r7 = r8.A01()
            r11 = 21
            X.Ixb r2 = new X.Ixb
            r10 = r2
            r12 = r68
            r13 = r65
            r14 = r1
            r15 = r6
            r16 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.C70901OQt.A00(r7, r2, r9)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r5 = r8.A00()
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r9 = r8.A00()
        L_0x3e90:
            X.Ixv r2 = new X.Ixv
            r7 = r2
            r8 = r3
            r10 = r6
            r11 = r13
            r12 = r4
            r13 = r68
            r14 = r1
            r15 = r67
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            X.C70901OQt.A00(r5, r2, r0)
        L_0x3ea2:
            r1 = r67
            r1.A0f = r0
            return
        L_0x3ea7:
            if (r2 == 0) goto L_0x3f07
            r2.setVisibility(r7)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r5 = r8.A00()
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r11 = r8.A00()
            X.Ixv r2 = new X.Ixv
            r9 = r2
            r10 = r3
            r12 = r6
            r13 = r65
            r14 = r4
            r15 = r68
            r16 = r1
            r17 = r67
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            X.C70901OQt.A00(r5, r2, r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r5 = r8.A01()
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r9 = r8.A01()
            goto L_0x3e90
        L_0x3ed1:
            r12 = 2131441611(0x7f0b37cb, float:1.8505239E38)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r2 = r8.A01()
            int r13 = r2.getId()
            r10 = r36
            r11.A0C(r12, r10, r13, r10)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r2 = r8.A01()
            int r2 = r2.getId()
            r11.A0C(r12, r3, r2, r3)
            com.instagram.common.ui.base.IgTextView r2 = r8.A02
            if (r2 == 0) goto L_0x3f0b
            r2.setVisibility(r7)
            com.instagram.common.ui.base.IgTextView r10 = r8.A02
            if (r10 == 0) goto L_0x3f0b
            java.lang.String r2 = ""
            goto L_0x3e4c
        L_0x3efb:
            X.3oV r1 = r8.A05
            boolean r1 = r1.CVM()
            if (r1 == 0) goto L_0x3ea2
        L_0x3f03:
            X.C70901OQt.A01(r8)
            goto L_0x3ea2
        L_0x3f07:
            java.lang.String r0 = "cta"
            goto L_0x428f
        L_0x3f0b:
            java.lang.String r0 = "secondaryText"
            goto L_0x428f
        L_0x3f0f:
            java.lang.String r0 = "primaryText"
            goto L_0x428f
        L_0x3f13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x3f1b:
            java.lang.String r0 = "secondCardFourThumbnailWithTitleContainer"
            goto L_0x423f
        L_0x3f1f:
            java.lang.String r0 = "secondCardFourThumbnailContainer"
            goto L_0x423f
        L_0x3f23:
            java.lang.String r0 = "secondCardSixThumbnailContainer"
            goto L_0x423f
        L_0x3f27:
            java.lang.String r0 = "roundedThumbnailContainer"
            goto L_0x423f
        L_0x3f2b:
            java.lang.String r0 = "roundedThumbnailWithTitleContainer"
            goto L_0x423f
        L_0x3f2f:
            java.lang.String r0 = "roundedThreeThumbnailContainer"
            goto L_0x423f
        L_0x3f33:
            java.lang.String r0 = "thumbnailContainer"
            goto L_0x423f
        L_0x3f37:
            java.lang.String r0 = "cardView"
            goto L_0x428f
        L_0x3f3b:
            java.lang.String r0 = "ctaView"
            goto L_0x428f
        L_0x3f3f:
            java.lang.String r0 = "disclosureTextView"
            goto L_0x428f
        L_0x3f43:
            java.lang.String r0 = "ctaButtonLayout"
            goto L_0x428f
        L_0x3f47:
            java.lang.String r0 = "disclaimerTextView"
            goto L_0x428f
        L_0x3f4b:
            java.lang.String r0 = "cardViewWithoutCta"
            goto L_0x428f
        L_0x3f4f:
            java.lang.String r0 = "subtitleCtaView"
            goto L_0x428f
        L_0x3f53:
            java.lang.String r0 = "subtitleEnlargedView"
            goto L_0x428f
        L_0x3f57:
            java.lang.String r0 = "subtitleView"
            goto L_0x428f
        L_0x3f5b:
            java.lang.String r0 = "infoView"
            goto L_0x428f
        L_0x3f5f:
            java.lang.String r0 = "ctaTextView"
            goto L_0x428f
        L_0x3f63:
            java.lang.String r0 = "divider"
            goto L_0x428f
        L_0x3f67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x3f6f:
            java.lang.String r0 = "avatarUrlView"
            goto L_0x428f
        L_0x3f73:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x3f7b:
            java.lang.String r1 = "adsGenericCardInfo is null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x3f83:
            java.lang.String r0 = "stickerView"
            goto L_0x428f
        L_0x3f87:
            java.lang.String r0 = "ctaSectionTextView"
            goto L_0x428f
        L_0x3f8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x3f93:
            java.lang.String r0 = "avatarSubtitleView"
            goto L_0x428f
        L_0x3f97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x3f9f:
            java.lang.String r0 = "avatarImageView"
            goto L_0x428f
        L_0x3fa3:
            java.lang.String r0 = "dimmerOverlay"
            goto L_0x428f
        L_0x3fa7:
            java.lang.String r0 = "containerView"
            goto L_0x428f
        L_0x3fab:
            java.lang.String r1 = "adsGenericCardInfo is null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x3fb3:
            java.lang.String r0 = "endSceneOverlay"
            goto L_0x428f
        L_0x3fb7:
            java.lang.String r0 = "socialContextHolder"
            goto L_0x428f
        L_0x3fbb:
            java.lang.String r0 = "popularityProofHolder"
            goto L_0x428f
        L_0x3fbf:
            java.lang.String r0 = "ctaText"
            goto L_0x428f
        L_0x3fc3:
            java.lang.String r0 = "ctaButton"
            goto L_0x428f
        L_0x3fc7:
            java.lang.String r0 = "ctaStickerHolder"
            goto L_0x428f
        L_0x3fcb:
            java.lang.String r0 = "delayedSkipAdTimerDescriptionView"
            goto L_0x428f
        L_0x3fcf:
            java.lang.String r0 = "delayedSkipAdTimerCountdownView"
            goto L_0x428f
        L_0x3fd3:
            java.lang.String r0 = "productThumbnailTappableArea"
            goto L_0x428f
        L_0x3fd7:
            java.lang.String r0 = "merchantName"
            goto L_0x428f
        L_0x3fdb:
            java.lang.String r0 = "productImageBottom"
            goto L_0x428f
        L_0x3fdf:
            java.lang.String r0 = "productImageTop"
            goto L_0x428f
        L_0x3fe3:
            java.lang.String r0 = "productImage"
            goto L_0x428f
        L_0x3fe7:
            java.lang.String r0 = "productName"
            goto L_0x428f
        L_0x3feb:
            java.lang.String r0 = "moreProductsText"
            goto L_0x428f
        L_0x3fef:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Story carousel ad expand button does not support the type \""
            r1.append(r0)
            r1.append(r15)
            r0 = 34
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x400b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x4013:
            java.lang.String r0 = "mediaView"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x401d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x4025:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x402d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x4035:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x403d:
            java.lang.String r0 = "subtitleTextView"
            goto L_0x428f
        L_0x4041:
            java.lang.String r0 = "titleTextView"
            goto L_0x428f
        L_0x4045:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x404d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x4055:
            java.lang.String r1 = "Need a media to render a media card!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x405d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x4065:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x406d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x407d }
            r3 = r31
            r5.<init>(r3)     // Catch:{ Exception -> 0x407d }
            goto L_0x407c
        L_0x4075:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x407d }
            r3 = r31
            r5.<init>(r3)     // Catch:{ Exception -> 0x407d }
        L_0x407c:
            throw r5     // Catch:{ Exception -> 0x407d }
        L_0x407d:
            r22 = move-exception
            if (r4 == 0) goto L_0x422e
            java.lang.String r21 = X.C231122qu.A07(r2, r4)
        L_0x4084:
            com.instagram.common.typedurl.ImageUrl r20 = r1.A06()
            if (r4 == 0) goto L_0x4227
            X.1Xv r2 = X.1Xj.A0h
            r2 = 36324380963319863(0x810cd500013037, double:3.0350230155208957E-306)
            X.0tM r2 = X.AnonymousClass0yP.A00(r2)
            boolean r2 = X.0yU.A07(r2)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r2)
            com.instagram.model.mediasize.ImageInfo r11 = r4.A1p()
            if (r11 == 0) goto L_0x422a
            com.instagram.model.mediasize.ExtendedImageUrl r2 = X.1iI.A03(r11)
            java.lang.String r17 = java.lang.String.valueOf(r2)
        L_0x40ab:
            r2 = r32
            com.instagram.common.typedurl.ImageUrl r16 = r1.A08(r2)
            if (r4 == 0) goto L_0x4223
            boolean r1 = r4.A4o()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
            android.net.Uri r10 = r4.A05
        L_0x40bd:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r19)
            boolean r1 = X.0qQ.A0K(r12, r1)
            if (r1 == 0) goto L_0x421f
            if (r10 == 0) goto L_0x421f
            r1 = -1
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.C253833rU.A00(r10, r1, r1)
            java.lang.String r13 = r1.toString()
        L_0x40d2:
            if (r4 == 0) goto L_0x4212
            com.instagram.model.mediasize.ExtendedImageUrl r9 = r4.A1n(r2)
            r1 = 36324380963254326(0x810cd500003036, double:3.03502301547945E-306)
            X.0tM r1 = X.AnonymousClass0yP.A00(r1)
            boolean r1 = X.0yU.A07(r1)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            com.instagram.model.mediasize.ExtendedImageUrl r7 = r4.A0E
            X.1Xy r1 = r4.A0C
            com.instagram.model.mediasize.ImageInfo r1 = r1.BGO()
            if (r1 == 0) goto L_0x420f
            java.util.List r6 = r1.ByG()
        L_0x40f7:
            if (r6 == 0) goto L_0x4216
            boolean r1 = r6.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x4216
            java.lang.Object r14 = r6.get(r0)
        L_0x4105:
            com.instagram.common.typedurl.SimpleImageUrl r0 = r4.A1R()
            r27 = r14
            r14 = r0
            java.lang.Integer r15 = r4.A2H()
            if (r0 == 0) goto L_0x421a
            java.lang.String r5 = r0.A02
            int r1 = r0.A01
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r0 = r0.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x4120:
            if (r11 == 0) goto L_0x420c
            if (r15 == 0) goto L_0x420c
            r0 = r32
            com.instagram.model.mediasize.ExtendedImageUrl r2 = X.1iI.A02(r0, r11, r15)
        L_0x412a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r22.getMessage()
            r1.append(r0)
            java.lang.String r0 = " | ReelItem Type is: "
            r1.append(r0)
            r0 = r60
            r1.append(r0)
            java.lang.String r0 = " | ad id = "
            r1.append(r0)
            r0 = r21
            r1.append(r0)
            java.lang.String r0 = " | thumbnailUrl = "
            r1.append(r0)
            r0 = r20
            r1.append(r0)
            java.lang.String r0 = " | shouldUseFirstFrameOnThumbnail = "
            r1.append(r0)
            r0 = r18
            r1.append(r0)
            java.lang.String r0 = " | imageInfo = "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " | thumbnailTypedUrlFromImageInfo = "
            r1.append(r0)
            r0 = r17
            r1.append(r0)
            java.lang.String r0 = " | imageUrl = "
            r1.append(r0)
            r0 = r16
            r1.append(r0)
            java.lang.String r0 = " | hasLocalBitmap = "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " | localBitmapUrl = "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " | imageUrlCreatedFromUri = "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " | sizedImageTypedUrl = "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " | shouldUseFirstFrame = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " | fullSizeImageUrl = "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " | clipsSpinsUnderlyingCoverMedia = "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " | spinsUnderlyingCoverMedia = "
            r1.append(r0)
            r0 = r27
            r1.append(r0)
            java.lang.String r0 = " | selfieStickerMediaUrlsPhotoUrl = "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = " | aspectRatio = "
            r1.append(r0)
            if (r15 == 0) goto L_0x4209
            int r0 = r15.intValue()
            switch(r0) {
                case 1: goto L_0x4203;
                case 2: goto L_0x4206;
                default: goto L_0x41d2;
            }
        L_0x41d2:
            java.lang.String r0 = "ANY"
        L_0x41d4:
            r1.append(r0)
            java.lang.String r0 = " | selfieStickerMediaUrlsPhotoUrl_url = "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " | selfieStickerMediaUrlsPhotoUrl_width = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " | selfieStickerMediaUrlsPhotoUrl_height = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " | fullSizeImageTypedUrlFromImageInfo = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r22
            r1.<init>(r2, r0)
            throw r1
        L_0x4203:
            java.lang.String r0 = "RECTANGULAR"
            goto L_0x41d4
        L_0x4206:
            java.lang.String r0 = "SQUARE"
            goto L_0x41d4
        L_0x4209:
            java.lang.String r0 = "null"
            goto L_0x41d4
        L_0x420c:
            r2 = 0
            goto L_0x412a
        L_0x420f:
            r6 = 0
            goto L_0x40f7
        L_0x4212:
            r9 = 0
            r8 = 0
            r7 = 0
            r6 = 0
        L_0x4216:
            r14 = 0
            if (r4 != 0) goto L_0x4105
            r15 = 0
        L_0x421a:
            r5 = 0
            r4 = 0
            r3 = 0
            goto L_0x4120
        L_0x421f:
            java.lang.String r13 = "didn't go this path"
            goto L_0x40d2
        L_0x4223:
            r12 = 0
            r10 = 0
            goto L_0x40bd
        L_0x4227:
            r18 = 0
            r11 = 0
        L_0x422a:
            r17 = 0
            goto L_0x40ab
        L_0x422e:
            java.lang.String r21 = "media is null"
            goto L_0x4084
        L_0x4232:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x423a:
            java.lang.String r0 = "socialContextSummary"
            goto L_0x423f
        L_0x423d:
            java.lang.String r0 = "headlineTextView"
        L_0x423f:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x4247:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x424f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x4257:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x425f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x4267:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x426f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x4277:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x427f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        L_0x4287:
            java.lang.String r0 = "title"
            goto L_0x428f
        L_0x428a:
            java.lang.String r0 = "endSceneContainer"
            goto L_0x428f
        L_0x428d:
            java.lang.String r0 = "usernameView"
        L_0x428f:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x4297:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r31
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C307066Or.A02(X.2nJ, com.instagram.common.session.UserSession, X.4DU, X.3uh, X.3mM, com.instagram.model.reels.ReelViewerConfig, X.3BQ, X.6Yf, X.6af, X.6Yd, X.6Zd, int, int, boolean, boolean):void");
    }
}
