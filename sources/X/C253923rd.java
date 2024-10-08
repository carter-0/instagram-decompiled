package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.listview.StickyHeaderListView;

/* renamed from: X.3rd  reason: invalid class name and case insensitive filesystem */
public final class C253923rd {
    public static final Rect A00 = new Rect();
    public static final C253923rd A01 = new Object();
    public static final Rect A02 = new Rect();

    public static final int A00(Rect rect, View view, StickyHeaderListView stickyHeaderListView, int i) {
        Rect rect2;
        0qQ.A0B(rect, 0);
        Rect rect3 = A00;
        if (!view.getGlobalVisibleRect(rect3)) {
            return 0;
        }
        if (stickyHeaderListView != null) {
            rect2 = stickyHeaderListView.getTopChromeArea();
        } else {
            rect2 = new Rect();
        }
        int max = Math.max(i, Math.max(Math.max(rect3.top, rect.top), rect2.bottom));
        return Math.max(max, Math.min(rect3.bottom, rect.bottom)) - max;
    }

    public static final AnonymousClass3V3 A0A(1Xj r3, Object obj) {
        if (r3 == null || !(obj instanceof C254143s0)) {
            return null;
        }
        Object BDh = ((C254143s0) obj).BDh(r3);
        if (BDh instanceof AnonymousClass3V3) {
            return (AnonymousClass3V3) BDh;
        }
        return null;
    }

    public static final int A01(View view, View view2, StickyHeaderListView stickyHeaderListView) {
        Rect rect;
        Rect rect2 = A00;
        if (!view2.getGlobalVisibleRect(rect2)) {
            return 0;
        }
        Rect rect3 = A02;
        view.getGlobalVisibleRect(rect3);
        if (stickyHeaderListView != null) {
            rect = stickyHeaderListView.getTopChromeArea();
        } else {
            rect = new Rect();
        }
        int max = Math.max(Math.max(rect2.top, rect3.top), rect.bottom);
        return Math.max(max, Math.min(rect2.bottom, rect3.bottom)) - max;
    }

    public static final int A03(C238133Ar r4, int i, int i2) {
        C254183s4 r3 = C254183s4.REEL_TRAY;
        boolean z = false;
        if (A02(r3, r4) != -1) {
            z = true;
        }
        if (!z) {
            return 0;
        }
        View AnE = r4.AnE(A02(r3, r4));
        if (AnE == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (i - AnE.getBottom() <= i2) {
            return (AnE.getBottom() - i) + i2;
        } else {
            return 0;
        }
    }

    public static final View A05(1Xj r2, Object obj) {
        View view;
        if (obj instanceof C246403eX) {
            C246663ey A08 = A08(((C245633dE) obj).A00, r2);
            if (A08 != null) {
                return A08.A06;
            }
            return null;
        } else if (obj instanceof AnonymousClass3TR) {
            return ((AnonymousClass3TR) obj).A00();
        } else {
            if (obj instanceof AnonymousClass4EA) {
                return ((AnonymousClass4EA) obj).A0N;
            }
            if (obj instanceof AnonymousClass3V2) {
                return ((AnonymousClass3V2) obj).A01;
            }
            if (!(obj instanceof C254173s3)) {
                return null;
            }
            C254173s3 r3 = (C254173s3) obj;
            if (r2.A4f()) {
                view = r3.A06.A0J;
            } else {
                C257643xj AsQ = r2.A0C.AsQ();
                if (AsQ == null || AsQ.Bw9() == null) {
                    return null;
                }
                AnonymousClass6K2 videoView = r3.A05.getVideoView();
                if (videoView != null) {
                    view = videoView.A00;
                } else {
                    view = null;
                }
            }
            return view;
        }
    }

    public static final C246663ey A08(View view, 1Xj r4) {
        View findViewWithTag = view.findViewWithTag("has-litho-media-view-holder");
        if (findViewWithTag != null) {
            Object tag = findViewWithTag.getTag(R.id.litho_media_content);
            if (tag instanceof C246663ey) {
                C246663ey r2 = (C246663ey) tag;
                if (r4 == null || 0qQ.A0K(r2.A0B, r4.getId())) {
                    return r2;
                }
            }
        }
        return null;
    }

    public static final C254183s4 A0C(Object obj) {
        if (obj instanceof C246403eX) {
            return C254183s4.LITHO_MEDIA_CONTENT;
        }
        if (obj instanceof C253963ri) {
            return C254183s4.CLIPS_UI_IN_FEED;
        }
        if (obj instanceof AnonymousClass3TR) {
            return C254183s4.CAROUSEL;
        }
        if (obj instanceof C253973rj) {
            return C254183s4.GRIDROW;
        }
        if (obj instanceof C253983rk) {
            return C254183s4.HOLDOUT;
        }
        if (obj instanceof C253993rl) {
            return C254183s4.MEDIA_HEADER;
        }
        if (obj instanceof AnonymousClass4EA) {
            return C254183s4.MEDIA_CONTENT;
        }
        if (obj instanceof C254013rn) {
            return C254183s4.MEDIA_UFI;
        }
        if (obj instanceof C254023ro) {
            return C254183s4.MEDIA_FEEDBACK;
        }
        if (obj instanceof C241383Oz) {
            return C254183s4.MEDIA_INLINE_COMPOSER_BUTTON;
        }
        if (obj instanceof C254033rp) {
            return C254183s4.MEDIA_LABEL_BELOW_COMMENTS;
        }
        if (obj instanceof C243823aA) {
            return C254183s4.LOAD_MORE;
        }
        1OP r0 = 1OP.$redex_init_class;
        if (obj instanceof C240733Ma) {
            return C254183s4.REEL_TRAY;
        }
        if (obj instanceof C254043rq) {
            return C254183s4.STORIES_IN_FEED;
        }
        if (obj instanceof C254053rr) {
            return C254183s4.STORIES_IN_FEED_LEGACY;
        }
        if (obj instanceof C254063rs) {
            return C254183s4.REEL_NETEGO;
        }
        if (obj instanceof C254073rt) {
            return C254183s4.AD_CTA;
        }
        if (obj instanceof AnonymousClass3V2) {
            return C254183s4.COLLECTION_TOP_MAIN_BOTTOM_THREE;
        }
        if ((obj instanceof C254083ru) || (obj instanceof C254103rw) || (obj instanceof C254113rx) || (obj instanceof C254123ry)) {
            return C254183s4.MEGAPHONE;
        }
        if ((obj instanceof C254133rz) || (obj instanceof C254153s1)) {
            return C254183s4.MULTI_VIDEO_HSCROLL;
        }
        if (obj instanceof C254163s2) {
            return C254183s4.FULL_HEIGHT_MEDIA;
        }
        if (obj instanceof C254173s3) {
            return C254183s4.SERVER_RENDERED_CONTENT;
        }
        return C254183s4.UNKNOWN;
    }

    public static final int A02(C254183s4 r3, C238133Ar r4) {
        int B6L = r4.B6L();
        int BLQ = r4.BLQ();
        if (B6L <= BLQ) {
            while (A0B(r4, B6L) != r3) {
                int i = B6L;
                B6L++;
                if (i == BLQ) {
                }
            }
            return B6L;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r0 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        return r0.BG1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.View A04(X.1Xj r3, X.C238133Ar r4, int r5) {
        /*
            X.3s4 r0 = A0B(r4, r5)
            android.view.View r2 = r4.AnE(r5)
            if (r2 == 0) goto L_0x006d
            int r0 = r0.ordinal()
            r1 = 0
            switch(r0) {
                case 2: goto L_0x004d;
                case 3: goto L_0x004d;
                case 4: goto L_0x0013;
                case 5: goto L_0x0012;
                case 6: goto L_0x001c;
                case 7: goto L_0x004d;
                case 8: goto L_0x0012;
                case 9: goto L_0x0012;
                case 10: goto L_0x0012;
                case 11: goto L_0x0012;
                case 12: goto L_0x0038;
                case 13: goto L_0x0012;
                case 14: goto L_0x0012;
                case 15: goto L_0x0012;
                case 16: goto L_0x0012;
                case 17: goto L_0x002c;
                case 18: goto L_0x0012;
                case 19: goto L_0x0012;
                case 20: goto L_0x0025;
                case 21: goto L_0x004d;
                case 22: goto L_0x0057;
                default: goto L_0x0012;
            }
        L_0x0012:
            return r1
        L_0x0013:
            java.lang.Object r0 = r2.getTag()
            X.3V3 r0 = A0A(r3, r0)
            goto L_0x0029
        L_0x001c:
            X.3ey r0 = A08(r2, r3)
            if (r0 == 0) goto L_0x0012
            com.instagram.feed.widget.IgProgressImageView r1 = r0.A06
            return r1
        L_0x0025:
            X.4EA r0 = A07(r2)
        L_0x0029:
            if (r0 == 0) goto L_0x0012
            goto L_0x0068
        L_0x002c:
            java.lang.Object r0 = r2.getTag()
            r0.getClass()
            X.3V2 r0 = (X.AnonymousClass3V2) r0
            com.instagram.feed.widget.IgProgressImageView r1 = r0.A0A
            return r1
        L_0x0038:
            java.lang.Object r0 = r2.getTag()
            if (r0 == 0) goto L_0x0045
            X.3TR r0 = (X.AnonymousClass3TR) r0
            android.view.View r1 = r0.A00()
            return r1
        L_0x0045:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x004d:
            java.lang.Object r0 = r2.getTag()
            r0.getClass()
            X.3V3 r0 = (X.AnonymousClass3V3) r0
            goto L_0x0068
        L_0x0057:
            java.lang.Object r1 = r2.getTag()
            r0 = 1631(0x65f, float:2.286E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.3ri r1 = (X.C253963ri) r1
            X.3V3 r0 = r1.A00
        L_0x0068:
            android.view.View r1 = r0.BG1()
            return r1
        L_0x006d:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C253923rd.A04(X.1Xj, X.3Ar, int):android.view.View");
    }

    public static final C254143s0 A06(ViewGroup viewGroup, 1Xj r5, C253923rd r6) {
        C254143s0 A06;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt.getTag() instanceof C254143s0) && A0A(r5, childAt.getTag()) != null) {
                return (C254143s0) childAt.getTag();
            }
            if ((childAt instanceof ViewGroup) && (A06 = A06((ViewGroup) childAt, r5, r6)) != null) {
                return A06;
            }
        }
        return null;
    }

    public static final AnonymousClass4EA A07(View view) {
        Object tag = view.getTag();
        tag.getClass();
        if (!(tag instanceof C254163s2)) {
            return null;
        }
        Object tag2 = view.getTag();
        tag2.getClass();
        return ((C254163s2) tag2).A06;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.4y1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.4y1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: X.3ey} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r1 == true) goto L_0x0065;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass3V3 A09(X.1Xj r2, X.C238133Ar r3, int r4) {
        /*
            X.3s4 r0 = A0B(r3, r4)
            android.view.View r1 = r3.AnE(r4)
            if (r1 == 0) goto L_0x0072
            int r0 = r0.ordinal()
            r3 = 0
            switch(r0) {
                case 2: goto L_0x0036;
                case 3: goto L_0x0036;
                case 4: goto L_0x0069;
                case 5: goto L_0x0012;
                case 6: goto L_0x002a;
                case 7: goto L_0x0036;
                case 8: goto L_0x0012;
                case 9: goto L_0x0012;
                case 10: goto L_0x0012;
                case 11: goto L_0x0012;
                case 12: goto L_0x003b;
                case 13: goto L_0x0012;
                case 14: goto L_0x0012;
                case 15: goto L_0x0012;
                case 16: goto L_0x0012;
                case 17: goto L_0x005f;
                case 18: goto L_0x0012;
                case 19: goto L_0x0012;
                case 20: goto L_0x0025;
                case 21: goto L_0x0036;
                case 22: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            return r3
        L_0x0013:
            java.lang.Object r1 = r1.getTag()
            r0 = 1631(0x65f, float:2.286E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.3ri r1 = (X.C253963ri) r1
            X.3V3 r3 = r1.A00
            return r3
        L_0x0025:
            X.4EA r3 = A07(r1)
            return r3
        L_0x002a:
            X.3ey r0 = A08(r1, r2)
            r2 = 1
            if (r0 == 0) goto L_0x0066
            boolean r1 = r0.A0C
            if (r1 != r2) goto L_0x0066
            goto L_0x0065
        L_0x0036:
            java.lang.Object r0 = r1.getTag()
            goto L_0x0065
        L_0x003b:
            java.lang.Object r0 = r1.getTag()
            if (r0 == 0) goto L_0x0057
            X.3TR r0 = (X.AnonymousClass3TR) r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r0.A09
            android.view.View r0 = r0.A0F
            if (r0 == 0) goto L_0x0055
            java.lang.Object r1 = r0.getTag()
        L_0x004d:
            boolean r0 = r1 instanceof X.C279064y1
            if (r0 == 0) goto L_0x0066
            r3 = r1
            X.4y1 r3 = (X.C279064y1) r3
            goto L_0x0066
        L_0x0055:
            r1 = 0
            goto L_0x004d
        L_0x0057:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x005f:
            java.lang.Object r0 = r1.getTag()
            X.3V2 r0 = (X.AnonymousClass3V2) r0
        L_0x0065:
            r3 = r0
        L_0x0066:
            X.3V3 r3 = (X.AnonymousClass3V3) r3
            return r3
        L_0x0069:
            java.lang.Object r0 = r1.getTag()
            X.3V3 r3 = A0A(r2, r0)
            return r3
        L_0x0072:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C253923rd.A09(X.1Xj, X.3Ar, int):X.3V3");
    }

    public static final C254183s4 A0B(C238133Ar r0, int i) {
        Object obj;
        View AnE = r0.AnE(i);
        if (AnE != null) {
            obj = AnE.getTag();
        } else {
            obj = null;
        }
        return A0C(obj);
    }
}
