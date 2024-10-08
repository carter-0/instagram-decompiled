package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IeY  reason: case insensitive filesystem */
public final class C57669IeY implements C59619JQn {
    public 0sL A00;
    public 0sJ A01;

    public final C62320sa Aiq(C53451Goj goj, AnonymousClass0iw r13, UserSession userSession, Long l, String str, String str2, List list, C62320sa r19) {
        AnonymousClass7TF.A1H(r13, userSession);
        String str3 = str;
        String str4 = str2;
        C51972G9s.A1E(str3, str4);
        return new C58236Ioe(goj, r13, userSession, this, l, str3, str4, list, r19, 0);
    }

    public final C62320sa BZo(C53451Goj goj, AnonymousClass0iw r13, UserSession userSession, Long l, String str, String str2, List list, C62320sa r19) {
        boolean A1Z = AnonymousClass7TG.A1Z(r13, userSession);
        String str3 = str;
        String str4 = str2;
        C51972G9s.A1E(str3, str4);
        return new C58236Ioe(goj, r13, userSession, this, l, str3, str4, list, r19, A1Z ? 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        if (X.182.A06(X.0Tu.A05, r8, 36330295133225523L) != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
        if (r7 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d2, code lost:
        if (r7 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d4, code lost:
        r4 = r7.AmX();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d8, code lost:
        r5.A0o = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CJO(com.instagram.api.schemas.MidCardClipsClickedAction r16, X.JSG r17, X.AnonymousClass0iw r18, com.instagram.common.session.UserSession r19, java.lang.Long r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.util.List r25, java.util.List r26, boolean r27) {
        /*
            r15 = this;
            r3 = 0
            r7 = r18
            X.0qQ.A0B(r7, r3)
            r0 = 1
            r1 = 2
            r8 = r19
            r2 = r22
            X.DbW.A1O(r8, r0, r2)
            r10 = r23
            r11 = r24
            X.C51972G9s.A1F(r10, r11)
            r4 = r16
            if (r16 == 0) goto L_0x0092
            int r0 = r4.ordinal()
            if (r0 != r1) goto L_0x0092
            r12 = r25
            if (r25 == 0) goto L_0x002f
            if (r20 == 0) goto L_0x002f
            long r13 = r20.longValue()
            java.lang.String r9 = r4.A00
            X.C52086GEg.A0f(r7, r8, r9, r10, r11, r12, r13)
        L_0x002f:
            if (r17 == 0) goto L_0x00e5
            X.JSH r0 = r17.BYQ()
            if (r0 == 0) goto L_0x00e5
            X.JSH r7 = r17.BYQ()
            com.instagram.api.schemas.ClipsMidCardType r0 = com.instagram.api.schemas.ClipsMidCardType.TRENDING_TRACK_WITH_SIMILAR_ACCOUNTS
            java.lang.String r0 = r0.A00
            boolean r5 = r11.equals(r0)
            if (r5 != 0) goto L_0x0053
            X.0Tu r4 = X.0Tu.A05
            r0 = 36330295133225523(0x81123600004233, double:3.038763160383686E-306)
            boolean r1 = X.182.A06(r4, r8, r0)
            r0 = 0
            if (r1 == 0) goto L_0x00e1
        L_0x0053:
            r0 = 1
            if (r5 == 0) goto L_0x00e1
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.MID_CARD_CONTEXTUAL_CHAIN_WITH_RECIPE_SHEET_TRENDING_TRACK_WITH_SIMILAR_ACCOUNTS
        L_0x0058:
            java.lang.String r6 = ","
            r4 = 0
            if (r0 == 0) goto L_0x00ae
            if (r7 == 0) goto L_0x0093
            java.util.List r0 = r7.Bfe()
            if (r0 == 0) goto L_0x0093
            X.4h3 r5 = X.C51965G9l.A0i(r1, r8)
            java.util.List r1 = r7.Bfe()
            if (r1 == 0) goto L_0x0075
            X.J64 r0 = X.J64.A00
            java.lang.String r4 = X.DbT.A0z(r6, r1, r0)
        L_0x0075:
            r5.A0s = r4
            java.lang.String r0 = r7.AmW()
            r5.A0n = r0
            java.lang.String r0 = r7.AmX()
            r5.A0o = r0
        L_0x0083:
            r5.A1l = r3
        L_0x0085:
            X.0sJ r1 = r15.A01
            if (r1 == 0) goto L_0x0092
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r27)
            r3 = r21
            r1.invoke(r5, r3, r2, r0)
        L_0x0092:
            return
        L_0x0093:
            X.4h3 r5 = X.C51965G9l.A0i(r1, r8)
            if (r26 == 0) goto L_0x00ac
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r26)
        L_0x009d:
            r5.A0B = r0
            if (r7 == 0) goto L_0x00aa
            java.lang.String r0 = r7.AmW()
        L_0x00a5:
            r5.A0n = r0
            if (r7 == 0) goto L_0x00d8
            goto L_0x00d4
        L_0x00aa:
            r0 = r4
            goto L_0x00a5
        L_0x00ac:
            r0 = r4
            goto L_0x009d
        L_0x00ae:
            X.4h3 r5 = X.C51965G9l.A0i(r1, r8)
            if (r26 == 0) goto L_0x00df
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r26)
        L_0x00b8:
            r5.A0B = r0
            if (r7 == 0) goto L_0x00dd
            java.util.List r1 = r7.Bfe()
            if (r1 == 0) goto L_0x00dd
            X.J65 r0 = X.J65.A00
            java.lang.String r0 = X.DbT.A0z(r6, r1, r0)
        L_0x00c8:
            r5.A0s = r0
            if (r7 == 0) goto L_0x00db
            java.lang.String r0 = r7.AmW()
        L_0x00d0:
            r5.A0n = r0
            if (r7 == 0) goto L_0x00d8
        L_0x00d4:
            java.lang.String r4 = r7.AmX()
        L_0x00d8:
            r5.A0o = r4
            goto L_0x0083
        L_0x00db:
            r0 = r4
            goto L_0x00d0
        L_0x00dd:
            r0 = r4
            goto L_0x00c8
        L_0x00df:
            r0 = r4
            goto L_0x00b8
        L_0x00e1:
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.MID_CARD_OPEN_REELS_CHAIN
            goto L_0x0058
        L_0x00e5:
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.MID_CARD
            X.4h3 r5 = X.C51965G9l.A0i(r0, r8)
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57669IeY.CJO(com.instagram.api.schemas.MidCardClipsClickedAction, X.JSG, X.0iw, com.instagram.common.session.UserSession, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean):void");
    }

    public static final String A00(C53451Goj goj) {
        if (goj.A00 != null) {
            return "open_audio_page";
        }
        if (goj.A01 != null) {
            return "open_clips_camera";
        }
        if (goj.A02 != null) {
            return "open_creation_tool";
        }
        if (goj.A03 != null) {
            return "open_draft";
        }
        if (goj.A04 != null) {
            return "open_draft_gallery";
        }
        if (goj.A05 != null) {
            return "open_insights_page";
        }
        if (goj.A06 != null) {
            return "open_inspiration_hub";
        }
        if (goj.A07 != null) {
            return "open_reels_chain";
        }
        if (goj.A0A != null) {
            return "open_url_in_iab";
        }
        if (goj.A08 != null) {
            return "save_audio";
        }
        0f9 AEf = 0wj.A01.AEf("onMidcardOverlayOrButtonClick", 817902720);
        AEf.ABQ(DialogModule.KEY_MESSAGE, "Element or button tap info not found");
        AEf.report();
        return "";
    }

    public final void CIf(28D r2, String str) {
        0sL r0 = this.A00;
        if (r0 != null) {
            r0.invoke(r2, str);
        }
    }
}
