package X;

import com.instagram.api.schemas.NoteEmojiReactionInfo;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.PeL  reason: case insensitive filesystem */
public final class C73529PeL implements 02o {
    public final int A00;
    public final Object A01;

    public C73529PeL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        User user;
        NoteEmojiReactionInfo noteEmojiReactionInfo = (NoteEmojiReactionInfo) it.next();
        String str = noteEmojiReactionInfo.A02;
        if (str != null && (user = noteEmojiReactionInfo.A00) != null) {
            abstractCollection.add(new C68198N5n(user, AnonymousClass05K.A00, str));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v395, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v407, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r1v115, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: type inference failed for: r6v49, types: [X.MDv, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v45, types: [X.NVv] */
    /* JADX WARNING: type inference failed for: r4v84, types: [X.NVu] */
    /* JADX WARNING: type inference failed for: r4v106 */
    /* JADX WARNING: type inference failed for: r4v107 */
    /* JADX WARNING: type inference failed for: r1v397 */
    /* JADX WARNING: type inference failed for: r1v399 */
    /* JADX WARNING: type inference failed for: r6v95 */
    /* JADX WARNING: type inference failed for: r6v96 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:1004:0x1388, code lost:
        r0.setEnabled(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1010:0x139f, code lost:
        X.0qQ.A0F(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1017:0x13be, code lost:
        if (r2.getString("CONTENT_NOTE_ID_ARGUMENT") == null) goto L_0x13c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1024:0x13f5, code lost:
        if (r0 != null) goto L_0x13f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1025:0x13f7, code lost:
        r0.setVisibility(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1033:0x145d, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1152:0x16a6, code lost:
        r6 = new X.C61078JwG((java.util.List) r4, r0);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1175:0x1745, code lost:
        X.0eS.A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1177:0x1755, code lost:
        if (r6 != null) goto L_0x1757;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1178:0x1757, code lost:
        r1.A00 = r5;
        r0 = r3.emit(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1179:0x175d, code lost:
        if (r2 != r0) goto L_0x1e97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1180:0x175f, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1210:0x1864, code lost:
        if (r0 != null) goto L_0x18e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1230:0x18e5, code lost:
        r0.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1390:0x1e24, code lost:
        r1 = r0.A02;
        r0 = X.0sn.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1391:0x1e28, code lost:
        r1.Epw(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1412:0x1e94, code lost:
        X.C67754Mu9.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1414:0x1e99, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0321, code lost:
        if (r1 != null) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x05cc, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x05db, code lost:
        if (r0.isEmpty() != false) goto L_0x05dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x065a, code lost:
        if (r0 == null) goto L_0x065c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x065c, code lost:
        X.0qQ.A0F(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0823, code lost:
        if (r10 != null) goto L_0x0825;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0840, code lost:
        if (X.C68449NIn.A0b(X.AnonymousClass7TE.A0l(r5.A1T)) != false) goto L_0x0842;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x09fb, code lost:
        X.0qQ.A0F("noteEditText");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0a00, code lost:
        r12 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0a6c, code lost:
        if (r1 == null) goto L_0x139f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0afc, code lost:
        if (X.C68449NIn.A0d(r7) != false) goto L_0x0afe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        X.0qQ.A0F(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:662:0x0d27, code lost:
        r4 = X.DbS.A0R();
        r1 = (java.util.List) r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x0d31, code lost:
        r3 = "recyclerAdapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:709:0x0e03, code lost:
        if (r5 == X.C69318NjJ.DISCOVERY_INVITES_SECTION) goto L_0x0e05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0185, code lost:
        if (r0.length() == 0) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:878:0x1117, code lost:
        if (X.C69318NjJ.A00.A00(r11) != false) goto L_0x1119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:953:0x12b4, code lost:
        if (r0 != null) goto L_0x12b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:975:0x1306, code lost:
        X.0qQ.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:976:0x130d, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:985:0x132a, code lost:
        if (r0 == null) goto L_0x1306;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1124:0x1616  */
    /* JADX WARNING: Removed duplicated region for block: B:1128:0x1623  */
    /* JADX WARNING: Removed duplicated region for block: B:1134:0x1649  */
    /* JADX WARNING: Removed duplicated region for block: B:1138:0x1658 A[LOOP:8: B:1136:0x1652->B:1138:0x1658, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:1171:0x1738  */
    /* JADX WARNING: Removed duplicated region for block: B:1176:0x174a  */
    /* JADX WARNING: Removed duplicated region for block: B:647:0x0cdf  */
    /* JADX WARNING: Removed duplicated region for block: B:651:0x0cec  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0151 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:690:0x0dab  */
    /* JADX WARNING: Removed duplicated region for block: B:692:0x0db2  */
    /* JADX WARNING: Removed duplicated region for block: B:704:0x0df4  */
    /* JADX WARNING: Removed duplicated region for block: B:716:0x0e25  */
    /* JADX WARNING: Removed duplicated region for block: B:719:0x0e4d  */
    /* JADX WARNING: Removed duplicated region for block: B:740:0x0ee6  */
    /* JADX WARNING: Removed duplicated region for block: B:763:0x0f4f  */
    /* JADX WARNING: Removed duplicated region for block: B:771:0x0f65  */
    /* JADX WARNING: Removed duplicated region for block: B:774:0x0f6d  */
    /* JADX WARNING: Removed duplicated region for block: B:783:0x0f9d  */
    /* JADX WARNING: Removed duplicated region for block: B:790:0x0fb7  */
    /* JADX WARNING: Removed duplicated region for block: B:807:0x0fff  */
    /* JADX WARNING: Removed duplicated region for block: B:809:0x1006  */
    /* JADX WARNING: Removed duplicated region for block: B:813:0x1014  */
    /* JADX WARNING: Removed duplicated region for block: B:816:0x101d  */
    /* JADX WARNING: Removed duplicated region for block: B:826:0x103a  */
    /* JADX WARNING: Removed duplicated region for block: B:835:0x106a  */
    /* JADX WARNING: Removed duplicated region for block: B:841:0x1081  */
    /* JADX WARNING: Removed duplicated region for block: B:843:0x1088  */
    /* JADX WARNING: Removed duplicated region for block: B:844:0x108b  */
    /* JADX WARNING: Removed duplicated region for block: B:922:0x1213  */
    /* JADX WARNING: Removed duplicated region for block: B:926:0x1220  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r28, X.AnonymousClass4D7 r29) {
        /*
            r27 = this;
            r3 = r27
            r0 = r28
            int r1 = r3.A00
            r5 = r29
            switch(r1) {
                case 0: goto L_0x1e4d;
                case 1: goto L_0x12a2;
                case 2: goto L_0x1e80;
                case 3: goto L_0x1e2c;
                case 4: goto L_0x11f4;
                case 5: goto L_0x1da7;
                case 6: goto L_0x1d1c;
                case 7: goto L_0x11bd;
                case 8: goto L_0x1d0f;
                case 9: goto L_0x171a;
                case 10: goto L_0x16ad;
                case 11: goto L_0x1cf8;
                case 12: goto L_0x1ce1;
                case 13: goto L_0x12c8;
                case 14: goto L_0x0d35;
                case 15: goto L_0x1ccf;
                case 16: goto L_0x0d0d;
                case 17: goto L_0x0cc0;
                case 18: goto L_0x0d1b;
                case 19: goto L_0x15f7;
                case 20: goto L_0x1c2e;
                case 21: goto L_0x1bf0;
                case 22: goto L_0x1bd9;
                case 23: goto L_0x1bc7;
                case 24: goto L_0x1bb5;
                case 25: goto L_0x1ba3;
                case 26: goto L_0x1b95;
                case 27: goto L_0x1b85;
                case 28: goto L_0x1e97;
                case 29: goto L_0x1b73;
                case 30: goto L_0x0c42;
                case 31: goto L_0x0aa7;
                case 32: goto L_0x0a70;
                case 33: goto L_0x0a21;
                case 34: goto L_0x0a03;
                case 35: goto L_0x063e;
                case 36: goto L_0x05d1;
                case 37: goto L_0x0401;
                case 38: goto L_0x03dd;
                case 39: goto L_0x1af1;
                case 40: goto L_0x1acd;
                case 41: goto L_0x1a88;
                case 42: goto L_0x1a63;
                case 43: goto L_0x18ea;
                case 44: goto L_0x05c0;
                case 45: goto L_0x18cb;
                case 46: goto L_0x1867;
                case 47: goto L_0x039d;
                case 48: goto L_0x00e0;
                case 49: goto L_0x0090;
                case 50: goto L_0x1848;
                case 51: goto L_0x15c1;
                case 52: goto L_0x17db;
                case 53: goto L_0x17be;
                case 54: goto L_0x1760;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.JwG r0 = (X.C61078JwG) r0
            java.lang.Object r5 = r0.A00
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r3.A01
            X.NJ9 r4 = (X.NJ9) r4
            com.instagram.ui.widget.spinner.SpinnerImageView r3 = r4.A04
            if (r3 != 0) goto L_0x0023
            java.lang.String r3 = "loadingSpinner"
        L_0x001b:
            X.0qQ.A0F(r3)
        L_0x001e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0023:
            r2 = 1
            r1 = 0
            if (r5 == 0) goto L_0x008d
            boolean r0 = r5.isEmpty()
            if (r0 != r2) goto L_0x008d
        L_0x002d:
            r3.setVisibility(r1)
            X.2t9 r2 = r4.A02
            if (r2 == 0) goto L_0x0d31
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = X.DbS.A0R()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.recyclerview.model.RecyclerViewModel<*, *>>"
            X.0qQ.A0C(r5, r0)
            r1.A01(r5)
            r2.A05(r1)
            int r0 = r5.size()
            long r0 = (long) r0
            r4.A00 = r0
            boolean r0 = X.AnonymousClass7TE.A1b(r5)
            if (r0 == 0) goto L_0x1e97
            X.0eM r0 = r4.A06
            java.lang.Object r1 = r0.getValue()
            X.OKs r1 = (X.C70772OKs) r1
            X.0eM r0 = r4.A0C
            java.lang.String r5 = X.DbS.A0t(r0)
            X.0eM r0 = r4.A05
            java.lang.Object r4 = r0.getValue()
            java.lang.String r3 = X.DbS.A0k()
            if (r3 == 0) goto L_0x1e97
            X.0eM r0 = r1.A02
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            java.lang.String r0 = "igye_prompts_surface_load_success"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "nav_chain"
            X.C66584MXp.A0w(r2, r0, r3, r5)
            if (r4 == 0) goto L_0x0088
            java.lang.String r1 = r4.toString()
            java.lang.String r0 = "entrypoint"
            r2.AAJ(r0, r1)
        L_0x0088:
            r2.Cgf()
            goto L_0x1e97
        L_0x008d:
            r1 = 8
            goto L_0x002d
        L_0x0090:
            X.Noc r0 = (X.C69594Noc) r0
            boolean r1 = r0 instanceof X.NWZ
            if (r1 == 0) goto L_0x1e97
            java.lang.Object r1 = r3.A01
            X.NKL r1 = (X.NKL) r1
            X.0eM r1 = r1.A0R
            java.lang.Object r4 = r1.getValue()
            X.OLu r4 = (X.C70799OLu) r4
            X.NWZ r0 = (X.NWZ) r0
            java.util.List r3 = r0.A00
            r0 = 0
            X.0qQ.A0B(r3, r0)
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x00c1
            java.util.Set r2 = r4.A0A
            androidx.fragment.app.Fragment r1 = r4.A05
            r0 = 2131954062(0x7f13098e, float:1.9544613E38)
            java.lang.String r1 = X.DbU.A0m(r1, r0)
            X.NPH r0 = new X.NPH
            r0.<init>(r1)
            r2.add(r0)
        L_0x00c1:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r3.iterator()
        L_0x00c9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d3
            A00(r2, r1)
            goto L_0x00c9
        L_0x00d3:
            java.util.Set r1 = r4.A0A
            r1.addAll(r2)
            X.PIF r0 = r4.A01
            if (r0 != 0) goto L_0x1e6f
            java.lang.String r12 = "userRowsAdapter"
            goto L_0x139f
        L_0x00e0:
            X.Nob r0 = (X.C69593Nob) r0
            boolean r1 = r0 instanceof X.NWW
            if (r1 == 0) goto L_0x1e97
            X.NWW r0 = (X.NWW) r0
            java.util.List r2 = r0.A04
            if (r2 == 0) goto L_0x00f2
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0103
        L_0x00f2:
            java.lang.Object r0 = r3.A01
            X.NKE r0 = (X.NKE) r0
            X.0eM r1 = r0.A0P
            java.lang.Object r0 = X.C67755MuA.A01(r1)
            boolean r0 = r0 instanceof X.C68770NWf
            if (r0 == 0) goto L_0x0103
            X.C69985NvP.A00(r1)
        L_0x0103:
            java.lang.Object r4 = r3.A01
            X.NKE r4 = (X.NKE) r4
            r3 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0134
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0134
            int r0 = r2.size()
            if (r0 > r8) goto L_0x0134
            java.lang.Object r0 = X.00k.A0O(r2, r3)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x1e97
            long r6 = r0.longValue()
            com.instagram.direct.inbox.notes.NotesRepository r5 = r4.A0B
            r2 = 0
            if (r5 != 0) goto L_0x012c
            java.lang.String r12 = "notesRepository"
            goto L_0x139f
        L_0x012c:
            java.lang.String r1 = r4.A0H
            if (r1 != 0) goto L_0x0274
            java.lang.String r12 = "promptId"
            goto L_0x139f
        L_0x0134:
            com.instagram.common.ui.base.IgLinearLayout r1 = r4.A05
            if (r1 != 0) goto L_0x013c
            java.lang.String r15 = "promptContextView"
            goto L_0x0336
        L_0x013c:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x01ae
        L_0x0142:
            android.view.View r1 = r4.A02
            if (r1 == 0) goto L_0x014b
            r0 = 8
        L_0x0148:
            r1.setVisibility(r0)
        L_0x014b:
            com.instagram.common.ui.base.IgTextView r11 = r4.A08
            java.lang.String r12 = "promptContextContent"
            if (r11 == 0) goto L_0x139f
            if (r5 == 0) goto L_0x0157
            java.lang.String r10 = r5.A0J
            if (r10 != 0) goto L_0x0159
        L_0x0157:
            java.lang.String r10 = ""
        L_0x0159:
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.0eM r9 = r4.A0R
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r9)
            java.lang.String r7 = r4.A0N
            java.lang.CharSequence r0 = X.C66889MeU.A03(r1, r0, r10, r7)
            r11.setText(r0)
            com.instagram.common.ui.base.IgTextView r0 = r4.A08
            if (r0 == 0) goto L_0x139f
            X.DbT.A1H(r0)
            com.instagram.common.ui.base.IgLinearLayout r0 = r4.A05
            if (r0 == 0) goto L_0x0398
            r0.setVisibility(r3)
            if (r5 == 0) goto L_0x0187
            java.lang.String r0 = r5.A0J
            if (r0 == 0) goto L_0x0187
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L_0x0188
        L_0x0187:
            r1 = 1
        L_0x0188:
            r11 = 8
            com.instagram.common.ui.base.IgTextView r0 = r4.A08
            if (r1 == 0) goto L_0x0391
            if (r0 == 0) goto L_0x139f
            r0.setVisibility(r11)
        L_0x0193:
            if (r5 == 0) goto L_0x038e
            int r0 = r5.A01
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
        L_0x019b:
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.TEXT
            int r1 = r0.A00
            if (r10 == 0) goto L_0x01c9
            int r0 = r10.intValue()
            if (r0 != r1) goto L_0x01c9
            android.view.View r0 = r4.A00
            if (r0 == 0) goto L_0x01ae
            r0.setVisibility(r11)
        L_0x01ae:
            X.OZy r0 = r4.A0E
            if (r0 == 0) goto L_0x1e97
            X.2xy r0 = r0.A00
            if (r0 == 0) goto L_0x1e97
            boolean r0 = r0.isPlaying()
            if (r0 != r8) goto L_0x1e97
            X.OZy r0 = r4.A0E
            if (r0 == 0) goto L_0x1e97
            X.2xy r0 = r0.A00
            if (r0 == 0) goto L_0x1e97
            r0.pause()
            goto L_0x1e97
        L_0x01c9:
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.MUSIC
            int r1 = r0.A00
            if (r10 == 0) goto L_0x1e97
            int r0 = r10.intValue()
            if (r0 != r1) goto L_0x1e97
            android.view.View r1 = r4.A00
            if (r1 != 0) goto L_0x01e6
            com.instagram.common.ui.base.IgLinearLayout r1 = r4.A06
            if (r1 == 0) goto L_0x0270
            r0 = 2131436678(0x7f0b2486, float:1.8495233E38)
            android.view.View r1 = X.JTR.A0V(r1, r0)
            r4.A00 = r1
        L_0x01e6:
            if (r1 == 0) goto L_0x1e97
            X.5y2 r0 = r5.A0A
            if (r0 == 0) goto L_0x01f2
            com.instagram.api.schemas.MusicNoteResponseInfo r0 = r0.A07
            if (r0 == 0) goto L_0x01f2
            com.instagram.api.schemas.MusicInfo r2 = r0.A00
        L_0x01f2:
            X.OZy r15 = r4.A0E
            if (r15 != 0) goto L_0x020f
            com.instagram.common.session.UserSession r20 = X.AnonymousClass7TE.A0l(r9)
            androidx.fragment.app.FragmentActivity r16 = r4.requireActivity()
            android.content.Context r17 = r4.requireContext()
            X.OZy r15 = new X.OZy
            r18 = r1
            r19 = r4
            r21 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r4.A0E = r15
        L_0x020f:
            if (r2 == 0) goto L_0x0267
            if (r15 == 0) goto L_0x023a
            com.instagram.api.schemas.TrackData r0 = r2.BUk()
            java.lang.String r7 = r0.getTitle()
            java.lang.String r5 = ""
            if (r7 != 0) goto L_0x0220
            r7 = r5
        L_0x0220:
            com.instagram.api.schemas.TrackData r0 = r2.BUk()
            java.lang.String r0 = r0.getDisplayArtist()
            if (r0 == 0) goto L_0x022b
            r5 = r0
        L_0x022b:
            com.instagram.api.schemas.TrackData r0 = r2.BUk()
            boolean r1 = r0.isExplicit()
            com.instagram.api.schemas.TrackData r0 = r2.BUk()
            r15.A03(r0, r7, r5, r1)
        L_0x023a:
            java.lang.Object r1 = X.C67755MuA.A01(r6)
            X.NvP r1 = (X.C69985NvP) r1
            boolean r0 = r1 instanceof X.C68770NWf
            if (r0 == 0) goto L_0x0267
            X.NWf r1 = (X.C68770NWf) r1
            X.N3C r6 = r1.A07
            if (r6 == 0) goto L_0x0267
            X.OZy r5 = r4.A0E
            if (r5 == 0) goto L_0x0267
            X.2xy r0 = r5.A00
            if (r0 == 0) goto L_0x0255
            r0.AHY()
        L_0x0255:
            com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView r2 = r5.A06
            r1 = 15
            X.Ok7 r0 = new X.Ok7
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r6)
            r2.A01 = r0
            r0 = 0
            r5.A05(r6, r0)
            X.C71036OZy.A00(r5, r6)
        L_0x0267:
            com.instagram.common.ui.base.IgLinearLayout r0 = r4.A05
            if (r0 == 0) goto L_0x0398
            r0.setVisibility(r3)
            goto L_0x1e97
        L_0x0270:
            java.lang.String r15 = "rootView"
            goto L_0x0336
        L_0x0274:
            java.lang.String r0 = java.lang.String.valueOf(r6)
            X.4zZ r5 = r5.A07(r1, r0)
            java.lang.String r14 = "promptContextView"
            if (r5 == 0) goto L_0x02fe
            com.instagram.user.model.User r0 = r5.A0D
            if (r0 == 0) goto L_0x02fe
            java.lang.String r9 = r0.getId()
            com.instagram.common.ui.base.IgTextView r11 = r4.A09
            java.lang.String r15 = "promptContextTitle"
            if (r11 == 0) goto L_0x0336
            java.lang.String r13 = r0.B8Q()
            android.text.SpannableStringBuilder r10 = X.DbS.A0C(r13)
            X.0eM r0 = r4.A0P
            java.lang.Object r1 = X.C67755MuA.A01(r0)
            X.NvP r1 = (X.C69985NvP) r1
            boolean r0 = r1 instanceof X.C68770NWf
            if (r0 == 0) goto L_0x02c2
            r12 = 32
            r7 = 2131968616(0x7f134268, float:1.9574132E38)
            X.NWf r1 = (X.C68770NWf) r1
            java.lang.String r0 = r1.A0F
            long r0 = java.lang.Long.parseLong(r0)
            android.content.Context r6 = r4.requireContext()
            java.lang.String r0 = X.C66889MeU.A05(r6, r0)
            java.lang.String r0 = X.DbV.A0z(r4, r0, r7)
            java.lang.String r0 = X.002.A0D(r0, r12)
            r10.append(r0)
        L_0x02c2:
            int r0 = X.Dbb.A05(r4)
            android.text.style.ForegroundColorSpan r7 = X.C66580MXl.A0E(r0)
            int r6 = X.DbX.A05(r13)
            java.lang.String r0 = r10.toString()
            int r1 = X.DbX.A05(r0)
            r0 = 18
            r10.setSpan(r7, r6, r1, r0)
            r11.setText(r10)
            com.instagram.common.ui.base.IgTextView r6 = r4.A09
            if (r6 == 0) goto L_0x0336
            r1 = 2
            X.Oib r0 = new X.Oib
            r0.<init>(r9, r4, r1)
            X.AnonymousClass0fU.A00(r0, r6)
            com.instagram.common.ui.base.IgLinearLayout r0 = r4.A05
            if (r0 == 0) goto L_0x0398
            r1 = 2131438760(0x7f0b2ca8, float:1.8499456E38)
            android.view.View r1 = X.AnonymousClass7TE.A0b(r0, r1)
            r0 = 10
            X.C71408Ok7.A00(r1, r0, r4, r5)
            r1.setVisibility(r3)
        L_0x02fe:
            X.0eM r6 = r4.A0P
            java.lang.Object r11 = X.C67755MuA.A01(r6)
            X.NvP r11 = (X.C69985NvP) r11
            boolean r0 = r11 instanceof X.C68770NWf
            if (r0 == 0) goto L_0x0142
            X.NWf r11 = (X.C68770NWf) r11
            boolean r0 = r11.A0J
            if (r0 == 0) goto L_0x0142
            android.view.View r1 = r4.A02
            if (r1 != 0) goto L_0x0323
            com.instagram.common.ui.base.IgLinearLayout r1 = r4.A06
            if (r1 == 0) goto L_0x0270
            r0 = 2131437114(0x7f0b263a, float:1.8496118E38)
            android.view.View r1 = X.JTR.A0V(r1, r0)
            r4.A02 = r1
            if (r1 == 0) goto L_0x0387
        L_0x0323:
            r0 = 2131437116(0x7f0b263c, float:1.8496122E38)
            com.instagram.common.ui.base.IgTextView r10 = X.JTO.A0X(r1, r0)
            r0 = 2131954894(0x7f130cce, float:1.95463E38)
            X.DbU.A1G(r10, r4, r0)
            com.instagram.common.ui.base.IgTextView r0 = r4.A08
            if (r0 != 0) goto L_0x033b
            java.lang.String r15 = "promptContextContent"
        L_0x0336:
            X.0qQ.A0F(r15)
            goto L_0x001e
        L_0x033b:
            X.C66889MeU.A07(r10, r0, r11)
            java.lang.String r0 = r11.A0A
            long r0 = java.lang.Long.parseLong(r0)
            X.NvQ r13 = X.C69065Ne2.A02
            X.0eM r7 = r4.A0R
            X.0lg r12 = X.DbT.A0X(r7)
            monitor-enter(r13)
            X.0qQ.A0B(r12, r3)     // Catch:{ all -> 0x13a4 }
            r7 = 38
            X.Pm4 r9 = X.C73924Pm4.A01(r12, r7)     // Catch:{ all -> 0x13a4 }
            java.lang.Class<X.Ne2> r7 = X.C69065Ne2.class
            java.lang.Object r9 = r12.A01(r7, r9)     // Catch:{ all -> 0x13a4 }
            X.Ne2 r9 = (X.C69065Ne2) r9     // Catch:{ all -> 0x13a4 }
            monitor-exit(r13)
            X.OLa r7 = new X.OLa
            r7.<init>(r4, r9, r0)
            r0 = 9
            X.C71408Ok7.A00(r10, r0, r4, r7)
            r21 = 32
            X.MHF r15 = new X.MHF
            r18 = r7
            r19 = r4
            r20 = r2
            r16 = r10
            r17 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21)
            X.0xx r7 = X.DbW.A0E(r4)
            r1 = 3
            X.MGe r0 = new X.MGe
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r15, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r7)
        L_0x0387:
            android.view.View r1 = r4.A02
            if (r1 == 0) goto L_0x014b
            r0 = 0
            goto L_0x0148
        L_0x038e:
            r10 = r2
            goto L_0x019b
        L_0x0391:
            if (r0 == 0) goto L_0x139f
            r0.setVisibility(r3)
            goto L_0x0193
        L_0x0398:
            X.0qQ.A0F(r14)
            goto L_0x001e
        L_0x039d:
            X.NvP r0 = (X.C69985NvP) r0
            boolean r1 = r0 instanceof X.C68770NWf
            if (r1 == 0) goto L_0x03b2
            java.lang.Object r1 = r3.A01
            X.NKE r1 = (X.NKE) r1
            X.OdL r1 = r1.A0F
            if (r1 == 0) goto L_0x1e97
            X.NWf r0 = (X.C68770NWf) r0
            r1.A06(r0)
            goto L_0x1e97
        L_0x03b2:
            boolean r0 = r0 instanceof X.C68773NWi
            if (r0 == 0) goto L_0x1e97
            java.lang.Object r4 = r3.A01
            X.NKE r4 = (X.NKE) r4
            X.OdL r1 = r4.A0F
            if (r1 == 0) goto L_0x03c2
            r0 = 0
            r1.A07(r0)
        L_0x03c2:
            X.0eM r0 = r4.A0R
            X.0lg r3 = X.DbY.A0R(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329028118003449(0x81110f00023ef9, double:3.0379618948553854E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x1e97
            android.widget.FrameLayout r1 = r4.A03
            if (r1 != 0) goto L_0x145d
            java.lang.String r9 = "composerBar"
            goto L_0x05cc
        L_0x03dd:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x1e97
            java.lang.Object r2 = r3.A01
            X.NIn r2 = (X.C68449NIn) r2
            com.instagram.common.ui.base.IgEditText r1 = r2.A0I
            java.lang.String r3 = "promptEditText"
            if (r1 == 0) goto L_0x001b
            r1.setText(r0)
            com.instagram.common.ui.base.IgEditText r0 = r2.A0I
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.isFocused()
            if (r0 == 0) goto L_0x1e97
            com.instagram.common.ui.base.IgEditText r0 = r2.A0I
            if (r0 == 0) goto L_0x001b
            X.C66580MXl.A1E(r0)
            goto L_0x1e97
        L_0x0401:
            X.JwJ r0 = (X.C61081JwJ) r0
            r7 = 0
            if (r0 == 0) goto L_0x04ba
            java.lang.Object r1 = r0.A00
            com.instagram.music.common.model.AudioOverlayTrack r1 = (com.instagram.music.common.model.AudioOverlayTrack) r1
            if (r1 == 0) goto L_0x04ba
            com.instagram.music.common.model.MusicAssetModel r5 = r1.A08
            if (r5 == 0) goto L_0x04ba
            java.lang.Object r8 = r3.A01
            X.NIn r8 = (X.C68449NIn) r8
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x04e9
            int r1 = X.DbZ.A02(r8)
            r0 = 1065353216(0x3f800000, float:1.0)
            r4 = 1
            X.6KL r3 = X.AnonymousClass6KK.A00(r0, r1, r4)
            int r1 = X.C66584MXp.A05(r8)
            android.graphics.Paint r0 = r3.A0A
            r0.setColor(r1)
            android.content.Context r1 = r8.requireContext()
            r0 = 1094713344(0x41400000, float:12.0)
            float r0 = X.C61380mr.A00(r1, r0)
            int r0 = (int) r0
            r3.setBounds(r7, r7, r0, r0)
            r0 = 32
            java.lang.String r0 = X.002.A0D(r2, r0)
            android.text.SpannableString r5 = X.C66580MXl.A0D(r0)
            X.46l r2 = new X.46l
            r2.<init>(r3)
            X.OgL r0 = new X.OgL
            r0.<init>(r8)
            r3.setCallback(r0)
            android.content.Context r1 = r8.requireContext()
            r0 = 1082130432(0x40800000, float:4.0)
            float r0 = X.C61380mr.A00(r1, r0)
            int r0 = (int) r0
            r2.A01 = r0
            r0 = 33
            r5.setSpan(r2, r7, r4, r0)
            android.os.Handler r1 = r8.A19
            X.PVp r0 = r8.A1C
            r1.post(r0)
            com.instagram.common.ui.base.IgEditText r0 = r8.A0H
            java.lang.String r6 = "noteEditText"
            r3 = 0
            if (r0 == 0) goto L_0x05a7
            r0.setText(r5)
            X.6rA r2 = X.C319756rA.A00
            com.instagram.common.ui.base.IgEditText r1 = r8.A0H
            if (r1 == 0) goto L_0x05a7
            X.PjM r0 = X.C73761PjM.A00
            r2.A04(r1, r0, r7, r4)
            com.instagram.common.ui.base.IgEditText r0 = r8.A0H
            if (r0 == 0) goto L_0x05a7
            r0.setEnabled(r7)
            com.instagram.common.ui.base.IgEditText r0 = r8.A0H
            if (r0 == 0) goto L_0x05a7
            r0.setLayerType(r4, r3)
        L_0x048d:
            X.0eM r0 = r8.A1T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1Av r6 = X.1Au.A00(r0)
            X.0s0 r5 = r6.A2T
            X.0YZ[] r4 = X.1Av.A8a
            r3 = 403(0x193, float:5.65E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r6, r5, r4, r3)
            if (r0 != 0) goto L_0x1e97
            com.instagram.common.ui.base.IgTextView r2 = r8.A0L
            if (r2 == 0) goto L_0x04b1
            android.content.res.Resources r1 = X.DbV.A05(r8)
            r0 = 2131967780(0x7f133f24, float:1.9572436E38)
            X.DbU.A1A(r1, r2, r0)
        L_0x04b1:
            X.C66581MXm.A1K(r8, r7)
            r0 = 1
            X.AnonymousClass7TF.A1J(r6, r5, r4, r3, r0)
            goto L_0x1e97
        L_0x04ba:
            java.lang.Object r5 = r3.A01
            X.NIn r5 = (X.C68449NIn) r5
            com.instagram.common.ui.base.IgTextView r0 = r5.A0P
            if (r0 != 0) goto L_0x04c6
            java.lang.String r6 = "musicNoteSongTitle"
            goto L_0x05a7
        L_0x04c6:
            r4 = 8
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgTextView r0 = r5.A0O
            if (r0 != 0) goto L_0x04d3
            java.lang.String r6 = "musicNoteArtistName"
            goto L_0x05a7
        L_0x04d3:
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgEditText r0 = r5.A0H
            if (r0 != 0) goto L_0x04de
            java.lang.String r6 = "noteEditText"
            goto L_0x05a7
        L_0x04de:
            r0.setVisibility(r7)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r5.A0R
            if (r3 != 0) goto L_0x13e1
            java.lang.String r6 = "musicButtonImageView"
            goto L_0x05a7
        L_0x04e9:
            com.instagram.common.ui.base.IgTextView r0 = r8.A0P
            java.lang.String r9 = "musicNoteSongTitle"
            r4 = 0
            if (r0 == 0) goto L_0x05cc
            r0.setVisibility(r7)
            com.instagram.common.ui.base.IgTextView r0 = r8.A0O
            java.lang.String r6 = "musicNoteArtistName"
            if (r0 == 0) goto L_0x05a7
            r0.setVisibility(r7)
            com.instagram.music.common.model.AudioOverlayTrack r0 = r8.A0f
            com.instagram.common.ui.base.IgTextView r1 = r8.A0P
            if (r0 == 0) goto L_0x05ac
            if (r1 == 0) goto L_0x05cc
            r0 = 19
            X.C71397Ojw.A00(r1, r0, r8)
            com.instagram.common.ui.base.IgTextView r1 = r8.A0O
            if (r1 == 0) goto L_0x05a7
            r0 = 20
        L_0x050f:
            X.C71397Ojw.A00(r1, r0, r8)
            com.instagram.common.ui.base.IgTextView r3 = r8.A0P
            if (r3 == 0) goto L_0x05cc
            java.lang.String r1 = r5.A0I
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x051d
            r1 = r2
        L_0x051d:
            boolean r0 = r5.A0S
            android.text.SpannableStringBuilder r0 = X.C68449NIn.A00(r8, r1, r0)
            r3.setText(r0)
            com.instagram.common.ui.base.IgTextView r1 = r8.A0O
            if (r1 == 0) goto L_0x05a7
            java.lang.String r0 = r5.A0D
            if (r0 == 0) goto L_0x052f
            r2 = r0
        L_0x052f:
            r1.setText(r2)
            int r1 = X.DbZ.A02(r8)
            r0 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            X.6KL r2 = X.AnonymousClass6KK.A00(r0, r1, r3)
            r2.A05 = r3
            r2.invalidateSelf()
            int r1 = X.C66584MXp.A05(r8)
            android.graphics.Paint r0 = r2.A0A
            r0.setColor(r1)
            com.instagram.common.ui.base.IgTextView r0 = r8.A0P
            if (r0 == 0) goto L_0x05cc
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r2, r4, r4, r4)
            com.instagram.common.ui.base.IgTextView r0 = r8.A0P
            if (r0 == 0) goto L_0x05cc
            r0.setSelected(r3)
            com.instagram.common.ui.base.IgTextView r2 = r8.A0P
            if (r2 == 0) goto L_0x05cc
            r1 = 1093664768(0x41300000, float:11.0)
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            r2.setTextSize(r1)
            com.instagram.common.ui.base.IgTextView r0 = r8.A0O
            if (r0 == 0) goto L_0x05a7
            r0.setTextSize(r1)
            com.instagram.common.ui.base.IgEditText r0 = r8.A0H
            java.lang.String r9 = "noteEditText"
            if (r0 == 0) goto L_0x05cc
            r0.setTextSize(r1)
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r0 = r8.A0a
            java.lang.String r6 = "bubbleView"
            if (r0 == 0) goto L_0x05a7
            float r0 = X.C66584MXp.A00(r8, r0)
            com.instagram.common.ui.base.IgEditText r1 = r8.A0H
            if (r1 == 0) goto L_0x05cc
            int r0 = X.C66583MXo.A04(r8, r0)
            r1.setMaxWidth(r0)
            boolean r0 = r8.A0s
            if (r0 != 0) goto L_0x059d
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r2 = r8.A0a
            if (r2 == 0) goto L_0x05a7
            r0 = 1119092736(0x42b40000, float:90.0)
            int r1 = X.C66583MXo.A04(r8, r0)
            androidx.cardview.widget.CardView r0 = r2.A00
            X.C66580MXl.A1B(r0, r1)
        L_0x059d:
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r1 = r8.A0a
            if (r1 == 0) goto L_0x05a7
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r8.A0b
            if (r0 != 0) goto L_0x05bb
            java.lang.String r6 = "pogViewContainer"
        L_0x05a7:
            X.0qQ.A0F(r6)
            goto L_0x001e
        L_0x05ac:
            if (r1 == 0) goto L_0x05cc
            r0 = 21
            X.C71397Ojw.A00(r1, r0, r8)
            com.instagram.common.ui.base.IgTextView r1 = r8.A0O
            if (r1 == 0) goto L_0x05a7
            r0 = 22
            goto L_0x050f
        L_0x05bb:
            X.C319756rA.A01(r1, r0)
            goto L_0x048d
        L_0x05c0:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = r3.A01
            X.NIu r2 = (X.C68456NIu) r2
            X.PIF r1 = r2.A01
            if (r1 != 0) goto L_0x13a7
            java.lang.String r9 = "reactionAdapter"
        L_0x05cc:
            X.0qQ.A0F(r9)
            goto L_0x001e
        L_0x05d1:
            java.util.List r0 = (java.util.List) r0
            r7 = 0
            if (r0 == 0) goto L_0x05dd
            boolean r2 = r0.isEmpty()
            r1 = 0
            if (r2 == 0) goto L_0x05de
        L_0x05dd:
            r1 = 1
        L_0x05de:
            java.lang.String r12 = "pogViewContainer"
            r2 = 0
            java.lang.Object r6 = r3.A01
            X.NIn r6 = (X.C68449NIn) r6
            if (r1 == 0) goto L_0x0602
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r6.A0b
            if (r0 == 0) goto L_0x139f
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r1 = r0.A07
            com.instagram.common.typedurl.ImageUrl r0 = X.C68449NIn.A01(r6)
            r1.A04(r0, r6)
            com.instagram.common.ui.base.IgTextView r0 = r6.A0L
            X.AnonymousClass7TH.A0R(r0)
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r6.A0b
            if (r0 == 0) goto L_0x139f
            r0.setOnClickListener(r2)
            goto L_0x1e97
        L_0x0602:
            com.instagram.common.typedurl.ImageUrl r5 = X.C68449NIn.A01(r6)
            if (r5 == 0) goto L_0x062b
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r1 = r6.A0b
            if (r1 == 0) goto L_0x139f
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r4 = r1.A07
            com.instagram.user.model.User r1 = X.DbS.A0g(r0, r7)
            com.instagram.common.typedurl.ImageUrl r3 = r1.Bh3()
            android.content.res.Resources r2 = X.DbV.A05(r6)
            r1 = 2131165281(0x7f070061, float:1.7944775E38)
            int r1 = r2.getDimensionPixelSize(r1)
            r4.A03(r6, r5, r3, r1)
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r1 = r6.A0b
            if (r1 == 0) goto L_0x139f
            X.C71408Ok7.A00(r1, r7, r6, r0)
        L_0x062b:
            com.instagram.common.ui.base.IgTextView r2 = r6.A0L
            if (r2 == 0) goto L_0x0639
            android.content.res.Resources r1 = X.DbV.A05(r6)
            r0 = 2131956246(0x7f131216, float:1.9549042E38)
            X.DbU.A1A(r1, r2, r0)
        L_0x0639:
            X.C66581MXm.A1K(r6, r7)
            goto L_0x1e97
        L_0x063e:
            X.NjF r0 = (X.C69314NjF) r0
            int r0 = r0.ordinal()
            java.lang.String r13 = "noteEditText"
            java.lang.String r12 = "videoNoteCardEntrypointButton"
            r6 = 8
            r4 = 0
            java.lang.String r10 = "selectedNoteXButton"
            r14 = r10
            java.lang.Object r5 = r3.A01
            X.NIn r5 = (X.C68449NIn) r5
            switch(r0) {
                case 0: goto L_0x0661;
                case 1: goto L_0x06d0;
                case 2: goto L_0x0655;
                case 3: goto L_0x072e;
                case 4: goto L_0x0655;
                case 5: goto L_0x090a;
                case 6: goto L_0x0655;
                case 7: goto L_0x13fc;
                default: goto L_0x0655;
            }
        L_0x0655:
            X.C68449NIn.A0F(r5)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A0U
            if (r0 != 0) goto L_0x13f7
        L_0x065c:
            X.0qQ.A0F(r10)
            goto L_0x001e
        L_0x0661:
            java.lang.Object r0 = X.C67761MuH.A00(r5)
            if (r0 != 0) goto L_0x06a4
            java.lang.Object r0 = X.C67761MuH.A01(r5)
            if (r0 != 0) goto L_0x06a4
            java.util.List r0 = r5.A1D
            java.util.List r4 = X.00k.A0a(r0)
        L_0x0673:
            X.C68449NIn.A0T(r5, r4)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A0U
            if (r0 == 0) goto L_0x065c
            r0.setVisibility(r6)
            X.0eM r0 = r5.A1T
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327344490953055(0x810f870004395f, double:3.036897162329294E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x069b
            com.instagram.common.ui.base.IgEditText r1 = r5.A0H
            if (r1 == 0) goto L_0x09fb
            java.lang.String r0 = X.C68449NIn.A04(r5)
            r1.setHint(r0)
        L_0x069b:
            android.view.View r0 = r5.A06
            if (r0 == 0) goto L_0x1e97
            r0.setVisibility(r6)
            goto L_0x1e97
        L_0x06a4:
            java.util.List r1 = r5.A1D
            androidx.cardview.widget.CardView r0 = r5.A0A
            if (r0 == 0) goto L_0x139f
            java.util.List r4 = X.00k.A0f(r1, r0)
            com.instagram.common.session.UserSession r3 = X.C66580MXl.A0Q(r5)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329577873752269(0x81118f000140cd, double:3.038309562604628E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0673
            X.3oV r0 = r5.A0V
            if (r0 != 0) goto L_0x06c7
            java.lang.String r12 = "collabNoteEntryPointButton"
            goto L_0x139f
        L_0x06c7:
            android.view.View r0 = r0.getView()
            java.util.List r4 = X.00k.A0f(r4, r0)
            goto L_0x0673
        L_0x06d0:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A0U
            if (r1 == 0) goto L_0x065c
            com.instagram.music.common.model.AudioOverlayTrack r0 = r5.A0f
            if (r0 != 0) goto L_0x06d9
            r6 = 0
        L_0x06d9:
            r1.setVisibility(r6)
            java.lang.Object r0 = X.C67761MuH.A00(r5)
            if (r0 != 0) goto L_0x072a
            java.lang.Object r0 = X.C67761MuH.A01(r5)
            if (r0 != 0) goto L_0x072a
            com.instagram.music.common.model.AudioOverlayTrack r0 = r5.A0f
            if (r0 != 0) goto L_0x072a
            androidx.cardview.widget.CardView r1 = r5.A09
            androidx.cardview.widget.CardView r0 = r5.A0A
            if (r0 == 0) goto L_0x139f
            androidx.cardview.widget.CardView[] r0 = new androidx.cardview.widget.CardView[]{r1, r0}
            X.0qQ.A0B(r0, r4)
            java.util.List r0 = X.03t.A0I(r0)
            X.C68449NIn.A0T(r5, r0)
        L_0x0700:
            X.0eM r0 = r5.A1T
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327344490953055(0x810f870004395f, double:3.036897162329294E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0725
            com.instagram.common.ui.base.IgEditText r2 = r5.A0H
            if (r2 == 0) goto L_0x09fb
            android.content.res.Resources r1 = X.DbV.A05(r5)
            r0 = 2131968565(0x7f134235, float:1.9574028E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setHint(r0)
        L_0x0725:
            X.C68449NIn.A0J(r5)
            goto L_0x1e97
        L_0x072a:
            X.C68449NIn.A0F(r5)
            goto L_0x0700
        L_0x072e:
            r8 = 1
            r5.A0u = r8
            com.instagram.common.session.UserSession r2 = X.C66580MXl.A0Q(r5)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36321310061896958(0x810a0a000424fe, double:3.033080965095523E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            java.lang.String r10 = "pogViewContainer"
            r7 = 0
            if (r0 != 0) goto L_0x0769
            boolean r0 = X.C68449NIn.A0f(r5)
            if (r0 != 0) goto L_0x0766
            X.C68449NIn.A0H(r5)
            X.MuH r1 = X.C68449NIn.A02(r5)
            X.05G r0 = r1.A0R
            r0.Epw(r7)
            X.05G r0 = r1.A0S
            r0.Epw(r7)
            X.C67761MuH.A02(r1)
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r5.A0b
            if (r0 == 0) goto L_0x065c
            r0.setOnClickListener(r7)
        L_0x0766:
            X.C68449NIn.A0F(r5)
        L_0x0769:
            com.instagram.common.ui.base.IgEditText r0 = r5.A0I
            java.lang.String r12 = "promptEditText"
            if (r0 == 0) goto L_0x139f
            r1 = 0
            r0.setScaleX(r1)
            com.instagram.common.ui.base.IgEditText r0 = r5.A0I
            if (r0 == 0) goto L_0x139f
            r0.setScaleY(r1)
            com.instagram.common.ui.base.IgEditText r0 = r5.A0I
            if (r0 == 0) goto L_0x139f
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgEditText r2 = r5.A0I
            if (r2 == 0) goto L_0x139f
            r1 = 47
            X.PmE r0 = new X.PmE
            r0.<init>(r5, r1)
            X.C68449NIn.A08(r2, r7, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A0T
            if (r0 != 0) goto L_0x0797
            java.lang.String r12 = "promptXButton"
            goto L_0x139f
        L_0x0797:
            r9 = 24
            X.C71397Ojw.A00(r0, r9, r5)
            android.view.View r1 = r5.A03
            if (r1 != 0) goto L_0x07a4
            java.lang.String r12 = "avatarContainer"
            goto L_0x139f
        L_0x07a4:
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C68449NIn.A08(r1, r0, r7)
            com.instagram.common.ui.base.IgEditText r2 = r5.A0H
            if (r2 == 0) goto L_0x09fb
            android.content.Context r1 = r5.requireContext()
            r0 = 2131968620(0x7f13426c, float:1.957414E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setHint(r0)
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r1 = r5.A0a
            if (r1 != 0) goto L_0x07c8
            java.lang.String r12 = "bubbleView"
            goto L_0x139f
        L_0x07c8:
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r5.A0b
            if (r0 == 0) goto L_0x065c
            X.C319756rA.A01(r1, r0)
            X.MuH r0 = X.C68449NIn.A02(r5)
            java.lang.String r7 = r0.A07
            if (r7 == 0) goto L_0x08a8
            com.instagram.direct.inbox.notes.NotesRepository r0 = r0.A0O
            X.0Ud r0 = r0.A0r
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r0)
        L_0x07e5:
            boolean r0 = r2.hasNext()
            r10 = 0
            if (r0 == 0) goto L_0x08a5
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 == 0) goto L_0x07e5
        L_0x07fd:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 == 0) goto L_0x080b
            java.lang.Object r0 = r1.getValue()
            X.4zc r0 = (X.C279894zc) r0
            if (r0 == 0) goto L_0x080b
            java.lang.String r10 = r0.A02
        L_0x080b:
            com.instagram.common.ui.base.IgTextView r11 = r5.A0L
            if (r11 == 0) goto L_0x0815
            if (r10 == 0) goto L_0x0886
            r0 = r10
        L_0x0812:
            r11.setText(r0)
        L_0x0815:
            com.instagram.common.ui.base.IgTextView r1 = r5.A0L
            if (r1 == 0) goto L_0x0829
            X.0eM r0 = r5.A1L
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0825
            r0 = 8
            if (r10 == 0) goto L_0x0826
        L_0x0825:
            r0 = 0
        L_0x0826:
            r1.setVisibility(r0)
        L_0x0829:
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r5.A0U
            if (r7 == 0) goto L_0x0a00
            X.0eM r2 = r5.A1L
            boolean r0 = X.AnonymousClass7TF.A1Z(r2)
            if (r0 != 0) goto L_0x0842
            X.0eM r0 = r5.A1T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r1 = X.C68449NIn.A0b(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0844
        L_0x0842:
            r0 = 8
        L_0x0844:
            r7.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0B
            if (r0 == 0) goto L_0x084e
            r0.setVisibility(r6)
        L_0x084e:
            boolean r0 = X.AnonymousClass7TF.A1Z(r2)
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x08ab
            com.instagram.common.ui.base.IgEditText r0 = r5.A0H
            if (r0 == 0) goto L_0x09fb
            X.C69979NvJ.A00(r0)
            com.instagram.common.ui.base.IgEditText r0 = r5.A0I
            if (r0 == 0) goto L_0x139f
            r0.setScaleX(r7)
            com.instagram.common.ui.base.IgEditText r0 = r5.A0I
            if (r0 == 0) goto L_0x139f
            r0.setScaleY(r7)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A0S
            if (r0 == 0) goto L_0x0872
            r0.setVisibility(r6)
        L_0x0872:
            X.0eM r0 = r5.A1T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = X.AnonymousClass4AJ.A0B(r0)
            if (r0 == 0) goto L_0x1408
            androidx.cardview.widget.CardView r0 = r5.A07
            if (r0 != 0) goto L_0x1401
            java.lang.String r12 = "musicNoteEntryPointButton"
            goto L_0x139f
        L_0x0886:
            android.content.Context r7 = r5.requireContext()
            com.instagram.common.session.UserSession r2 = X.C66580MXl.A0Q(r5)
            r0 = 36325879906841923(0x810e3200003543, double:3.0359709534400075E-306)
            boolean r1 = X.182.A06(r3, r2, r0)
            r0 = 2131970851(0x7f134b23, float:1.9578665E38)
            if (r1 == 0) goto L_0x089f
            r0 = 2131970852(0x7f134b24, float:1.9578667E38)
        L_0x089f:
            java.lang.String r0 = X.AnonymousClass7TE.A16(r7, r0)
            goto L_0x0812
        L_0x08a5:
            r1 = r10
            goto L_0x07fd
        L_0x08a8:
            r10 = 0
            goto L_0x080b
        L_0x08ab:
            com.instagram.common.ui.base.IgEditText r1 = r5.A0I
            r10 = r12
            if (r1 == 0) goto L_0x065c
            android.text.TextWatcher r0 = r5.A1A
            r1.addTextChangedListener(r0)
            com.instagram.common.ui.base.IgEditText r2 = r5.A0H
            if (r2 != 0) goto L_0x08bc
            r10 = r13
            goto L_0x065c
        L_0x08bc:
            X.Pm8 r1 = new X.Pm8
            r1.<init>(r5, r9)
            X.OkA r0 = new X.OkA
            r0.<init>(r1, r8)
            r2.setOnFocusChangeListener(r0)
            com.instagram.common.ui.base.IgEditText r2 = r5.A0I
            if (r2 == 0) goto L_0x065c
            r0 = 25
            X.Pm8 r1 = new X.Pm8
            r1.<init>(r5, r0)
            X.OkA r0 = new X.OkA
            r0.<init>(r1, r8)
            r2.setOnFocusChangeListener(r0)
            com.instagram.common.ui.base.IgEditText r0 = r5.A0I
            if (r0 == 0) goto L_0x139f
            X.C69979NvJ.A00(r0)
            com.instagram.common.ui.base.IgEditText r0 = r5.A0I
            if (r0 == 0) goto L_0x139f
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r1 = X.C66581MXm.A0E(r0, r7)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            android.view.ViewPropertyAnimator r2 = r1.setInterpolator(r0)
            r0 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.start()
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A0S
            if (r0 == 0) goto L_0x1408
            r0.setVisibility(r4)
            goto L_0x1408
        L_0x090a:
            boolean r0 = X.C68449NIn.A0f(r5)
            java.lang.String r10 = "pogViewContainer"
            r2 = 0
            if (r0 == 0) goto L_0x092e
            X.C68449NIn.A0H(r5)
            X.MuH r1 = X.C68449NIn.A02(r5)
            X.05G r0 = r1.A0R
            r0.Epw(r2)
            X.05G r0 = r1.A0S
            r0.Epw(r2)
            X.C67761MuH.A02(r1)
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r5.A0b
            if (r0 == 0) goto L_0x065c
            r0.setOnClickListener(r2)
        L_0x092e:
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r2 = r5.A0b
            if (r2 == 0) goto L_0x065c
            X.0eE r1 = X.AnonymousClass0t1.A01
            X.0eM r0 = r5.A1T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.user.model.User r0 = r1.A01(r0)
            com.instagram.common.typedurl.ImageUrl r1 = r0.Bh3()
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView.A00(r2)
            com.instagram.common.ui.base.IgFrameLayout r0 = r2.A01
            r0.setVisibility(r4)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r2.A03
            r0.setVisibility(r4)
            r0.setUrl(r1, r5)
            androidx.cardview.widget.CardView r0 = r5.A08
            if (r0 != 0) goto L_0x095a
            java.lang.String r12 = "noteChatPillCard"
            goto L_0x139f
        L_0x095a:
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgTextView r1 = r5.A0Q
            if (r1 != 0) goto L_0x0965
            java.lang.String r12 = "noteChatPillText"
            goto L_0x139f
        L_0x0965:
            android.content.Context r0 = r5.requireContext()
            android.text.SpannableString r0 = X.C69989NvT.A00(r0)
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r2 = r5.A0L
            if (r2 == 0) goto L_0x097e
            android.content.Context r1 = r5.requireContext()
            r0 = 2131968531(0x7f134213, float:1.957396E38)
            X.DbT.A18(r1, r2, r0)
        L_0x097e:
            X.C66581MXm.A1K(r5, r4)
            X.C68449NIn.A0F(r5)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A0U
            if (r0 == 0) goto L_0x0a00
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgEditText r0 = r5.A0H
            if (r0 == 0) goto L_0x09fb
            X.C66580MXl.A1E(r0)
            com.instagram.common.ui.base.IgEditText r1 = r5.A0H
            if (r1 == 0) goto L_0x09fb
            java.lang.String r0 = X.C68449NIn.A04(r5)
            r1.setHint(r0)
            com.instagram.common.ui.base.IgEditText r0 = r5.A0H
            if (r0 == 0) goto L_0x09fb
            X.C69979NvJ.A00(r0)
            com.instagram.common.ui.base.IgEditText r2 = r5.A0H
            if (r2 == 0) goto L_0x09fb
            r1 = 1093664768(0x41300000, float:11.0)
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            r2.setTextSize(r1)
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r0 = r5.A0a
            java.lang.String r12 = "bubbleView"
            if (r0 == 0) goto L_0x139f
            float r0 = X.C66584MXp.A00(r5, r0)
            com.instagram.common.ui.base.IgEditText r1 = r5.A0H
            if (r1 == 0) goto L_0x09fb
            int r0 = X.C66583MXo.A04(r5, r0)
            r1.setMaxWidth(r0)
            com.instagram.common.ui.base.IgEditText r0 = r5.A0H
            if (r0 == 0) goto L_0x09fb
            android.text.Editable r0 = r0.getText()
            X.0qQ.A07(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x09ee
            boolean r0 = r5.A0s
            if (r0 != 0) goto L_0x09ee
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r2 = r5.A0a
            if (r2 == 0) goto L_0x139f
            android.content.res.Resources r1 = X.DbV.A05(r5)
            r0 = 2131165286(0x7f070066, float:1.7944785E38)
            int r1 = r1.getDimensionPixelSize(r0)
            androidx.cardview.widget.CardView r0 = r2.A00
            X.C66580MXl.A1B(r0, r1)
        L_0x09ee:
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r1 = r5.A0a
            if (r1 == 0) goto L_0x139f
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r5.A0b
            if (r0 == 0) goto L_0x065c
            X.C319756rA.A01(r1, r0)
            goto L_0x1e97
        L_0x09fb:
            X.0qQ.A0F(r13)
            goto L_0x001e
        L_0x0a00:
            r12 = r14
            goto L_0x139f
        L_0x0a03:
            boolean r2 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r1 = r3.A01
            X.NIn r1 = (X.C68449NIn) r1
            com.instagram.common.ui.base.IgTextView r0 = r1.A0N
            if (r0 != 0) goto L_0x0a13
            java.lang.String r12 = "mentionsDisclaimerTextView"
            goto L_0x139f
        L_0x0a13:
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x1e97
            com.instagram.common.ui.base.IgTextView r1 = r1.A0K
            if (r1 != 0) goto L_0x1454
            java.lang.String r12 = "characterCounterTextView"
            goto L_0x139f
        L_0x0a21:
            int r6 = X.AnonymousClass7TE.A0M(r0)
            java.lang.String r12 = "characterCounterTextView"
            r1 = 0
            r0 = 5
            java.lang.Object r5 = r3.A01
            X.NIn r5 = (X.C68449NIn) r5
            if (r6 > r0) goto L_0x0a6a
            com.instagram.common.ui.base.IgTextView r4 = r5.A0K
            if (r4 == 0) goto L_0x139f
            android.content.Context r3 = r5.getContext()
            if (r3 == 0) goto L_0x0a52
            r2 = 2131968554(0x7f13422a, float:1.9574006E38)
            java.lang.Integer r1 = X.JTO.A0w(r6)
            X.0eM r0 = r5.A1T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            int r0 = X.AnonymousClass4AJ.A00(r0)
            java.lang.Integer r0 = X.JTO.A0w(r0)
            java.lang.String r1 = X.DbV.A0u(r3, r1, r0, r2)
        L_0x0a52:
            r4.setText(r1)
            com.instagram.common.ui.base.IgTextView r2 = r5.A0K
            if (r2 == 0) goto L_0x139f
            android.content.Context r1 = r5.requireContext()
            android.content.Context r0 = r5.getContext()
            int r0 = X.2Yu.A03(r0)
            X.DbT.A17(r1, r2, r0)
            goto L_0x1e97
        L_0x0a6a:
            com.instagram.common.ui.base.IgTextView r1 = r5.A0K
            if (r1 != 0) goto L_0x145d
            goto L_0x139f
        L_0x0a70:
            java.lang.Object r5 = r3.A01
            X.NIn r5 = (X.C68449NIn) r5
            X.MuH r0 = X.C68449NIn.A02(r5)
            X.0Ud r0 = r0.A0e
            java.lang.Object r6 = r0.getValue()
            X.Nio r6 = (X.C69288Nio) r6
            int r1 = r6.ordinal()
            java.lang.String r12 = "actionBarService"
            r4 = 0
            r3 = 1
            r0 = 2
            if (r1 == r0) goto L_0x1348
            r0 = 3
            if (r1 == r0) goto L_0x1348
            X.2dZ r2 = r5.A0D
            if (r2 == 0) goto L_0x139f
            android.content.Context r0 = r5.getContext()
            int r1 = X.2Yu.A09(r0)
            android.content.Context r0 = r5.getContext()
            int r0 = X.2Yu.A09(r0)
            r2.A0W(r1, r0, r3)
            goto L_0x1e97
        L_0x0aa7:
            com.instagram.direct.inbox.notes.models.NoteAudienceItem r0 = (com.instagram.direct.inbox.notes.models.NoteAudienceItem) r0
            java.lang.Object r7 = r3.A01
            X.NIn r7 = (X.C68449NIn) r7
            r7.A0c = r0
            X.0eM r0 = r7.A1L
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            java.lang.String r12 = "audiencePickerContainer"
            if (r0 == 0) goto L_0x0ae4
            X.0eM r0 = r7.A1T
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            r3 = 0
            X.0Tu r2 = X.DbS.A0J(r4, r3)
            r0 = 36321310062880013(0x810a0a0013250d, double:3.033080965717211E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0ae4
            android.view.View r1 = r7.A02
            if (r1 == 0) goto L_0x139f
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.direct.inbox.notes.models.NoteAudience r2 = com.instagram.direct.inbox.notes.models.NoteAudience.MUTUAL_FOLLOWERS
            r1 = 0
            com.instagram.direct.inbox.notes.models.NoteAudienceItem r0 = new com.instagram.direct.inbox.notes.models.NoteAudienceItem
            r0.<init>(r2, r1, r1, r3)
            r7.A0c = r0
            goto L_0x1e97
        L_0x0ae4:
            android.view.View r1 = r7.A02
            if (r1 == 0) goto L_0x139f
            r0 = 2131437086(0x7f0b261e, float:1.849606E38)
            android.widget.TextView r6 = X.AnonymousClass7TE.A0d(r1, r0)
            boolean r0 = X.C68449NIn.A0e(r7)
            r5 = 0
            r9 = 1
            if (r0 != 0) goto L_0x0afe
            boolean r0 = X.C68449NIn.A0d(r7)
            r4 = 0
            if (r0 == 0) goto L_0x0aff
        L_0x0afe:
            r4 = 1
        L_0x0aff:
            com.instagram.direct.inbox.notes.models.NoteAudienceItem r0 = r7.A0c
            if (r0 == 0) goto L_0x0c3e
            com.instagram.direct.inbox.notes.models.NoteAudience r0 = r0.A00
            int r1 = r0.ordinal()
            if (r1 == r9) goto L_0x0c35
            r0 = 2
            if (r1 == r0) goto L_0x0c2c
            r0 = 4
            if (r1 == r0) goto L_0x0c23
            r0 = 3
            if (r1 == r0) goto L_0x0c11
            android.content.res.Resources r2 = X.DbV.A05(r7)
            r1 = 2131954056(0x7f130988, float:1.95446E38)
        L_0x0b1b:
            java.lang.String r3 = r2.getString(r1)
            X.0qQ.A0A(r3)
            r8 = 2131956919(0x7f1314b7, float:1.9550407E38)
            if (r4 == 0) goto L_0x0b2a
            r8 = 2131956918(0x7f1314b6, float:1.9550405E38)
        L_0x0b2a:
            com.instagram.direct.inbox.notes.models.NoteAudienceItem r0 = r7.A0c
            if (r0 == 0) goto L_0x0c3e
            com.instagram.direct.inbox.notes.models.NoteAudience r0 = r0.A00
            int r2 = r0.ordinal()
            android.content.res.Resources r1 = X.DbV.A05(r7)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            if (r2 != r9) goto L_0x0b42
            if (r4 != 0) goto L_0x0b42
            java.lang.String r3 = X.AnonymousClass7TF.A0j(r3)
        L_0x0b42:
            r0[r5] = r3
            java.lang.String r5 = r1.getString(r8, r0)
            X.0qQ.A0A(r5)
            android.text.SpannableString r4 = X.C66580MXl.A0D(r5)
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r9)
            android.content.res.Resources r1 = X.DbV.A05(r7)
            java.lang.String r0 = ""
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r1, r0, r8)
            int r2 = X.DbX.A05(r0)
            int r1 = X.DbX.A05(r5)
            r0 = 33
            r4.setSpan(r3, r2, r1, r0)
            r6.setText(r4)
            android.content.Context r3 = r7.requireContext()
            android.content.Context r2 = r7.getContext()
            boolean r1 = r7.A0t
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            if (r1 == 0) goto L_0x0b80
            r0 = 2130970279(0x7f0406a7, float:1.7549264E38)
        L_0x0b80:
            int r0 = X.2Yu.A0H(r2, r0)
            X.DbT.A17(r3, r6, r0)
            boolean r0 = X.C68449NIn.A0e(r7)
            if (r0 != 0) goto L_0x0bb6
            boolean r0 = X.C68449NIn.A0d(r7)
            if (r0 != 0) goto L_0x0bb6
            com.instagram.direct.inbox.notes.models.NoteAudienceItem r0 = r7.A0c
            if (r0 == 0) goto L_0x0c3e
            com.instagram.direct.inbox.notes.models.NoteAudience r0 = r0.A00
            int r1 = r0.ordinal()
            r0 = 2
            android.content.Context r5 = r7.requireContext()
            if (r1 != r0) goto L_0x0bf3
            android.graphics.drawable.LayerDrawable r2 = X.C346697vb.A00(r5)
        L_0x0ba8:
            android.view.View r1 = r7.A02
            if (r1 == 0) goto L_0x139f
            r0 = 2131428216(0x7f0b0378, float:1.847807E38)
            android.widget.ImageView r0 = X.DbS.A0G(r1, r0)
            r0.setImageDrawable(r2)
        L_0x0bb6:
            android.view.View r1 = r7.A02
            if (r1 == 0) goto L_0x139f
            r0 = 2131437085(0x7f0b261d, float:1.8496059E38)
            android.widget.ImageView r6 = X.DbS.A0G(r1, r0)
            android.content.Context r1 = r7.requireContext()
            r0 = 2131238074(0x7f081cba, float:1.8092416E38)
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r0)
            if (r5 != 0) goto L_0x0bd4
            r0 = 0
        L_0x0bcf:
            r6.setImageDrawable(r0)
            goto L_0x1e97
        L_0x0bd4:
            android.content.Context r4 = r7.requireContext()
            android.content.Context r3 = r7.requireContext()
            android.content.Context r2 = r7.requireContext()
            boolean r1 = r7.A0t
            r0 = 2130970273(0x7f0406a1, float:1.7549251E38)
            if (r1 == 0) goto L_0x0bea
            r0 = 2130970272(0x7f0406a0, float:1.754925E38)
        L_0x0bea:
            int r0 = X.JTP.A02(r2, r3, r0)
            android.graphics.drawable.BitmapDrawable r0 = X.AnonymousClass3JT.A01(r4, r5, r0)
            goto L_0x0bcf
        L_0x0bf3:
            r4 = 2131238964(0x7f082034, float:1.8094222E38)
            android.content.Context r3 = r7.requireContext()
            android.content.Context r2 = r7.requireContext()
            boolean r1 = r7.A0t
            r0 = 2130970273(0x7f0406a1, float:1.7549251E38)
            if (r1 == 0) goto L_0x0c08
            r0 = 2130970272(0x7f0406a0, float:1.754925E38)
        L_0x0c08:
            int r0 = X.JTP.A02(r2, r3, r0)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass3JT.A05(r5, r4, r0)
            goto L_0x0ba8
        L_0x0c11:
            boolean r0 = X.C68449NIn.A0g(r7)
            android.content.res.Resources r2 = X.DbV.A05(r7)
            r1 = 2131954055(0x7f130987, float:1.9544598E38)
            if (r0 == 0) goto L_0x0b1b
            r1 = 2131954054(0x7f130986, float:1.9544596E38)
            goto L_0x0b1b
        L_0x0c23:
            android.content.res.Resources r2 = X.DbV.A05(r7)
            r1 = 2131968562(0x7f134232, float:1.9574022E38)
            goto L_0x0b1b
        L_0x0c2c:
            android.content.res.Resources r2 = X.DbV.A05(r7)
            r1 = 2131956916(0x7f1314b4, float:1.9550401E38)
            goto L_0x0b1b
        L_0x0c35:
            android.content.res.Resources r2 = X.DbV.A05(r7)
            r1 = 2131956917(0x7f1314b5, float:1.9550403E38)
            goto L_0x0b1b
        L_0x0c3e:
            java.lang.String r12 = "currentAudience"
            goto L_0x139f
        L_0x0c42:
            com.instagram.model.venue.Venue r0 = (com.instagram.model.venue.Venue) r0
            java.lang.String r12 = "locationNoteTitle"
            r5 = 0
            java.lang.Object r3 = r3.A01
            X.NIn r3 = (X.C68449NIn) r3
            if (r0 == 0) goto L_0x138d
            android.content.Context r2 = r3.requireContext()
            r1 = 2131238501(0x7f081e65, float:1.8093282E38)
            android.graphics.drawable.Drawable r6 = r2.getDrawable(r1)
            if (r6 == 0) goto L_0x0c70
            android.graphics.drawable.Drawable r4 = r6.mutate()
            if (r4 == 0) goto L_0x0c70
            android.content.Context r2 = r3.requireContext()
            r1 = 2131100354(0x7f0602c2, float:1.7813087E38)
            int r2 = r2.getColor(r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            X.C51969G9p.A12(r1, r4, r2)
        L_0x0c70:
            int r1 = X.DbZ.A02(r3)
            r4 = 0
            if (r6 == 0) goto L_0x0c7a
            r6.setBounds(r4, r4, r1, r1)
        L_0x0c7a:
            r1 = 32
            com.instagram.model.venue.LocationDictIntf r0 = r0.A00
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = X.002.A0D(r0, r1)
            android.text.SpannableString r2 = X.C66580MXl.A0D(r0)
            if (r6 == 0) goto L_0x0c99
            X.46l r5 = new X.46l
            r5.<init>(r6)
            r0 = 1082130432(0x40800000, float:4.0)
            int r0 = X.C66583MXo.A04(r3, r0)
            r5.A01 = r0
        L_0x0c99:
            r1 = 1
            r0 = 33
            r2.setSpan(r5, r4, r1, r0)
            com.instagram.common.ui.base.IgTextView r0 = r3.A0M
            if (r0 == 0) goto L_0x139f
            r0.setText(r2)
            com.instagram.common.ui.base.IgTextView r0 = r3.A0M
            if (r0 == 0) goto L_0x139f
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgTextView r2 = r3.A0L
            if (r2 == 0) goto L_0x0cbb
            android.content.res.Resources r1 = X.DbV.A05(r3)
            r0 = 2131965503(0x7f13363f, float:1.9567818E38)
            X.DbU.A1A(r1, r2, r0)
        L_0x0cbb:
            X.C66581MXm.A1K(r3, r4)
            goto L_0x1e97
        L_0x0cc0:
            r7 = 10
            boolean r1 = X.ME7.A02(r7, r5)
            if (r1 == 0) goto L_0x0ce6
            r1 = r5
            X.ME7 r1 = (X.ME7) r1
            int r6 = r1.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r6 & r4
            if (r2 == 0) goto L_0x0ce6
            int r6 = r6 - r4
            r1.A00 = r6
        L_0x0cd6:
            java.lang.Object r7 = r1.A02
            X.1Hj r2 = X.1Hj.A02
            int r4 = r1.A00
            r5 = 1
            if (r4 == 0) goto L_0x0cec
            if (r4 == r5) goto L_0x1745
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ce6:
            X.ME7 r1 = new X.ME7
            r1.<init>(r3, r5, r7)
            goto L_0x0cd6
        L_0x0cec:
            X.0eS.A00(r7)
            java.lang.Object r3 = r3.A01
            X.02o r3 = (X.02o) r3
            X.MQ0 r0 = (X.MQ0) r0
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            boolean r6 = X.C59678JTj.A01(r5, r0)
            if (r6 == 0) goto L_0x1699
            X.JTj r0 = (X.C59678JTj) r0
            java.lang.Object r0 = r0.A01
            X.NGp r0 = (X.NGp) r0
            X.N2N r0 = r0.A00
            if (r0 != 0) goto L_0x1464
            java.lang.String r6 = "response"
            goto L_0x1306
        L_0x0d0d:
            X.JwG r0 = (X.C61078JwG) r0
            java.lang.Object r1 = r3.A01
            X.NIt r1 = (X.C68455NIt) r1
            X.2t9 r5 = r1.A00
            if (r5 != 0) goto L_0x0d27
            java.lang.String r3 = "adapter"
            goto L_0x001b
        L_0x0d1b:
            X.JwG r0 = (X.C61078JwG) r0
            java.lang.Object r1 = r3.A01
            X.NIz r1 = (X.C68461NIz) r1
            X.PIE r1 = r1.A01
            if (r1 == 0) goto L_0x0d31
            X.2t9 r5 = r1.A00
        L_0x0d27:
            com.instagram.common.recyclerview.ViewModelListUpdate r4 = X.DbS.A0R()
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            goto L_0x1e79
        L_0x0d31:
            java.lang.String r3 = "recyclerAdapter"
            goto L_0x001b
        L_0x0d35:
            X.NoU r0 = (X.C69586NoU) r0
            boolean r1 = r0 instanceof X.C68756NVr
            if (r1 == 0) goto L_0x11af
            java.lang.Object r1 = r3.A01
            X.Mu2 r1 = (X.C67749Mu2) r1
            X.NVr r0 = (X.C68756NVr) r0
            X.Pri r0 = r0.A00
        L_0x0d43:
            boolean r2 = r0 instanceof com.instagram.direct.request.response.GroupLinkPreviewResponse$Success
            if (r2 == 0) goto L_0x1515
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r0 = (com.instagram.direct.request.response.GroupLinkPreviewResponse$Success) r0
            java.lang.String r4 = r0.A08
            r25 = 0
            if (r4 == 0) goto L_0x11ab
            java.lang.String r3 = r1.A05
            r2 = 32
            X.N49 r11 = new X.N49
            r11.<init>(r4, r3, r2)
        L_0x0d58:
            r1.A00 = r11
            com.instagram.common.session.UserSession r7 = r1.A08
            X.Ne1 r10 = r1.A09
            X.NjJ r9 = r1.A03
            X.N49 r8 = r1.A02
            X.N49 r12 = r1.A01
            java.lang.String r6 = r1.A06
            java.lang.String r5 = r1.A07
            X.OMD r4 = r1.A0A
            r2 = 3
            X.0qQ.A0B(r9, r2)
            int r2 = r0.A01
            r3 = 28
            if (r2 == r3) goto L_0x1192
            r3 = 29
            if (r2 == r3) goto L_0x117d
            r3 = 32
            if (r2 == r3) goto L_0x1166
            r3 = 61
            if (r2 == r3) goto L_0x1192
            r3 = 62
            if (r2 == r3) goto L_0x1166
            X.NVi r15 = new X.NVi
            r16 = r11
            r17 = r8
            r18 = r7
            r19 = r9
            r20 = r10
            r21 = r4
            r22 = r0
            r23 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0d99:
            X.05G r6 = r1.A0E
        L_0x0d9b:
            java.lang.Object r3 = r6.getValue()
            boolean r4 = r0.A0J
            if (r4 != 0) goto L_0x0f61
            boolean r4 = r0.A0K
            if (r4 != 0) goto L_0x0f61
            boolean r5 = r15 instanceof X.C68750NVk
            if (r5 == 0) goto L_0x0f4f
            r4 = r15
            X.NVk r4 = (X.C68750NVk) r4
            boolean r4 = r4.A0C
        L_0x0db0:
            if (r4 == 0) goto L_0x0f61
            if (r5 == 0) goto L_0x0eef
            r4 = r15
            X.NVk r4 = (X.C68750NVk) r4
            X.0eM r4 = r4.A0A
            java.lang.Object r4 = r4.getValue()
            X.FYu r4 = (X.C50337FYu) r4
            X.C50337FYu.A02(r4)
            X.EZo r21 = X.C48146EZo.STORY
            X.EZp r20 = X.C48147EZp.JOIN_CHAT_STICKER
            java.lang.String r23 = "subscribe_to_join_chat_sheet_rendered"
            java.lang.String r24 = "tap"
            r22 = r4
            X.C50337FYu.A01(r20, r21, r22, r23, r24, r25)
        L_0x0dcf:
            java.lang.Long r4 = r0.A04
            java.lang.String r5 = java.lang.String.valueOf(r4)
            X.NVu r4 = new X.NVu
            r4.<init>(r5)
        L_0x0dda:
            boolean r3 = r6.AIY(r3, r4)
            if (r3 == 0) goto L_0x0d9b
            X.05G r8 = r1.A0D
        L_0x0de2:
            java.lang.Object r9 = r8.getValue()
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r4 = r15.A02
            boolean r3 = r4.A0K
            if (r3 != 0) goto L_0x0ee6
            boolean r3 = r4.A0J
            if (r3 != 0) goto L_0x0ee6
            boolean r3 = r4.A0F
            if (r3 != 0) goto L_0x0ee6
            java.lang.String r6 = r4.A05
            X.NjJ r5 = r15.A01
            X.NjJ r3 = X.C69318NjJ.NOTIFICATION
            if (r5 == r3) goto L_0x0e05
            X.NjJ r3 = X.C69318NjJ.INVITES_SECTION
            if (r5 == r3) goto L_0x0e05
            X.NjJ r4 = X.C69318NjJ.DISCOVERY_INVITES_SECTION
            r3 = 0
            if (r5 != r4) goto L_0x0e06
        L_0x0e05:
            r3 = 1
        L_0x0e06:
            X.NVn r4 = new X.NVn
            r4.<init>(r6, r3)
        L_0x0e0b:
            boolean r3 = r8.AIY(r9, r4)
            if (r3 == 0) goto L_0x0de2
            r1.A04 = r15
            java.lang.Long r3 = r0.A04
            long r3 = X.DbY.A04(r3)
            java.lang.String r8 = java.lang.String.valueOf(r3)
            X.6ud r6 = X.C321706uc.A00(r7)
            java.lang.String r4 = r0.A0A
            if (r4 != 0) goto L_0x0e27
            java.lang.String r4 = ""
        L_0x0e27:
            X.NjJ r1 = r1.A03
            java.lang.String r11 = r1.name()
            boolean r5 = r0.A0I
            boolean r13 = X.C66580MXl.A1X(r7, r8)
            boolean r9 = r0.A0D
            boolean r7 = r0.A0H
            boolean r12 = X.DbW.A1X(r11)
            X.0wc r1 = r6.A01
            r0 = 307(0x133, float:4.3E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x1e97
            X.C321716ud.A03(r6)
            java.lang.String r1 = "instagram"
            r0 = 1668(0x684, float:2.337E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.AAJ(r0, r1)
            java.lang.String r0 = "profile"
            X.DbS.A1M(r3, r0)
            r0 = 93
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
            boolean r0 = r11.equals(r10)
            java.lang.String r1 = "channel_link_bottom_sheet"
            if (r0 != 0) goto L_0x0e75
            boolean r0 = r11.equals(r1)
            if (r0 == 0) goto L_0x0ee3
            r10 = r1
        L_0x0e75:
            java.lang.String r0 = "source"
            X.Dba.A1B(r3, r0, r10)
            java.lang.String r0 = "join_bottom_sheet_rendered"
            X.DbS.A1I(r3, r0)
            java.lang.String r1 = r6.A02
            java.lang.String r0 = "actor_id"
            r3.AAJ(r0, r1)
            if (r13 == 0) goto L_0x0ed7
            java.lang.String r1 = "self"
        L_0x0e8a:
            r0 = 702(0x2be, float:9.84E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.AAJ(r0, r1)
            if (r13 == 0) goto L_0x0ecb
            java.lang.String r1 = "self"
        L_0x0e97:
            r0 = 980(0x3d4, float:1.373E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.AAJ(r0, r1)
            java.lang.Long r1 = X.DbV.A0q(r8)
            r0 = 901(0x385, float:1.263E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.A9F(r0, r1)
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "extra"
            r3.A9H(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            r0 = 2948(0xb84, float:4.131E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.A7p(r0, r1)
            java.lang.String r1 = r6.A00
            if (r1 != 0) goto L_0x14ed
            java.lang.String r6 = "sessionId"
            goto L_0x1306
        L_0x0ecb:
            if (r7 == 0) goto L_0x0ed0
            java.lang.String r1 = "subscriber"
            goto L_0x0e97
        L_0x0ed0:
            r0 = 841(0x349, float:1.178E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            goto L_0x0e97
        L_0x0ed7:
            if (r9 == 0) goto L_0x0edc
            java.lang.String r1 = "follower"
            goto L_0x0e8a
        L_0x0edc:
            r0 = 840(0x348, float:1.177E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            goto L_0x0e8a
        L_0x0ee3:
            java.lang.String r10 = "default"
            goto L_0x0e75
        L_0x0ee6:
            java.lang.String r3 = r4.A05
            X.NVm r4 = new X.NVm
            r4.<init>(r3)
            goto L_0x0e0b
        L_0x0eef:
            boolean r4 = r15 instanceof X.C68749NVj
            if (r4 != 0) goto L_0x0dcf
            boolean r4 = r15 instanceof X.C68748NVi
            if (r4 != 0) goto L_0x0dcf
            r5 = r15
            X.NVl r5 = (X.C68751NVl) r5
            X.0eM r4 = r5.A07
            X.6gx r11 = X.DbZ.A0R(r4)
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r4 = r5.A05
            java.lang.String r9 = r4.A0A
            X.NjJ r10 = r5.A01
            com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo r4 = r5.A04
            if (r4 == 0) goto L_0x0f4d
            int r8 = r4.A00
        L_0x0f0c:
            r12 = 1
            X.1Ln r5 = X.DbT.A0J(r11)
            boolean r4 = X.DbT.A1Y(r5)
            if (r4 == 0) goto L_0x0dcf
            X.DbW.A17(r5, r11)
            java.lang.String r4 = "subscribe_to_join_chat_sheet_rendered"
            X.DbV.A1M(r5, r4)
            int r11 = r10.ordinal()
            r4 = 0
            if (r11 == r4) goto L_0x0f4a
            if (r11 == r12) goto L_0x0f4a
            r4 = 8
            if (r11 == r4) goto L_0x0f47
            r4 = 9
            if (r11 == r4) goto L_0x0f44
            java.lang.String r4 = "invite_link_join_chat_button"
        L_0x0f32:
            r5.A0p(r4)
            java.lang.String r4 = X.C313756gx.A02(r10)
            X.DbZ.A1L(r5, r4, r8)
            r5.A0s(r9)
            r5.Cgf()
            goto L_0x0dcf
        L_0x0f44:
            java.lang.String r4 = "channel_name"
            goto L_0x0f32
        L_0x0f47:
            java.lang.String r4 = "see_channel_tooltip"
            goto L_0x0f32
        L_0x0f4a:
            java.lang.String r4 = "broadcast_jcs_join_chat_button"
            goto L_0x0f32
        L_0x0f4d:
            r8 = 1
            goto L_0x0f0c
        L_0x0f4f:
            boolean r4 = r15 instanceof X.C68749NVj
            if (r4 != 0) goto L_0x0f5e
            boolean r4 = r15 instanceof X.C68748NVi
            if (r4 != 0) goto L_0x0f5e
            r4 = r15
            X.NVl r4 = (X.C68751NVl) r4
            boolean r4 = r4.A0A
            goto L_0x0db0
        L_0x0f5e:
            r4 = 0
            goto L_0x0db0
        L_0x0f61:
            boolean r4 = r15 instanceof X.C68750NVk
            if (r4 == 0) goto L_0x0f9d
            r5 = r15
            X.NVk r5 = (X.C68750NVk) r5
            boolean r5 = r5.A0B
        L_0x0f6a:
            r10 = r15
            if (r5 == 0) goto L_0x0fb7
            if (r4 == 0) goto L_0x0f8c
            X.NVk r10 = (X.C68750NVk) r10
            X.NjJ r5 = r10.A04
            X.NjJ r4 = X.C69318NjJ.SSC_LIST
            if (r5 != r4) goto L_0x0f8c
            X.0eM r4 = r10.A0A
            java.lang.Object r4 = r4.getValue()
            X.FYu r4 = (X.C50337FYu) r4
            X.EZo r21 = X.C48146EZo.SSC_LIST_IN_SUBSCRIPTION_SETTINGS
            X.EZp r20 = X.C48147EZp.CHANNEL_ROW
            java.lang.String r23 = "thread_open"
            java.lang.String r24 = "tap"
            r22 = r4
            X.C50337FYu.A01(r20, r21, r22, r23, r24, r25)
        L_0x0f8c:
            java.lang.String r8 = r0.A0A
            com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo r4 = r0.A02
            if (r4 == 0) goto L_0x0f9b
            boolean r5 = r4.A03
        L_0x0f94:
            X.NVv r4 = new X.NVv
            r4.<init>(r8, r5)
            goto L_0x0dda
        L_0x0f9b:
            r5 = 1
            goto L_0x0f94
        L_0x0f9d:
            boolean r5 = r15 instanceof X.C68749NVj
            if (r5 == 0) goto L_0x0fa7
            r5 = r15
            X.NVj r5 = (X.C68749NVj) r5
            boolean r5 = r5.A0A
            goto L_0x0f6a
        L_0x0fa7:
            boolean r5 = r15 instanceof X.C68748NVi
            if (r5 == 0) goto L_0x0fb1
            r5 = r15
            X.NVi r5 = (X.C68748NVi) r5
            boolean r5 = r5.A08
            goto L_0x0f6a
        L_0x0fb1:
            r5 = r15
            X.NVl r5 = (X.C68751NVl) r5
            boolean r5 = r5.A08
            goto L_0x0f6a
        L_0x0fb7:
            if (r4 == 0) goto L_0x10db
            X.NVk r10 = (X.C68750NVk) r10
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r5 = r10.A07
            boolean r8 = r5.A0K
            X.0eM r5 = r10.A0A
            java.lang.Object r5 = r5.getValue()
            X.FYu r5 = (X.C50337FYu) r5
            if (r8 == 0) goto L_0x10ae
            X.EZo r21 = X.C48146EZo.STORY
            X.EZp r20 = X.C48147EZp.SUBSCRIBE_TO_JOIN_CHAT_SHEET
            java.lang.String r23 = "thread_full"
            java.lang.String r24 = "tap"
            r22 = r5
            X.C50337FYu.A01(r20, r21, r22, r23, r24, r25)
        L_0x0fd6:
            java.lang.String r9 = r15.A05
            if (r4 != 0) goto L_0x10ab
            boolean r5 = r15 instanceof X.C68749NVj
            if (r5 != 0) goto L_0x10ab
            boolean r5 = r15 instanceof X.C68748NVi
            if (r5 != 0) goto L_0x10ab
            r5 = r15
            X.NVl r5 = (X.C68751NVl) r5
            boolean r8 = r5.A0B
        L_0x0fe7:
            r5 = 9
            X.Jvk r12 = new X.Jvk
            r12.<init>((java.lang.String) r9, (boolean) r8, (int) r5)
            java.lang.String r14 = r15.A03
            java.lang.String r13 = r15.A04
            if (r4 != 0) goto L_0x10a8
            boolean r5 = r15 instanceof X.C68749NVj
            if (r5 == 0) goto L_0x109d
            r5 = r15
            X.NVj r5 = (X.C68749NVj) r5
            java.lang.String r11 = r5.A07
        L_0x0ffd:
            if (r4 == 0) goto L_0x108b
            r5 = r15
            X.NVk r5 = (X.C68750NVk) r5
            java.lang.String r9 = r5.A08
        L_0x1004:
            if (r9 == 0) goto L_0x1088
            if (r4 == 0) goto L_0x1084
            r8 = 2131165276(0x7f07005c, float:1.7944765E38)
        L_0x100b:
            r5 = 13
            X.N4G r10 = new X.N4G
            r10.<init>((java.lang.String) r9, (int) r8, (int) r5)
        L_0x1012:
            if (r4 == 0) goto L_0x1081
            r23 = 1
        L_0x1016:
            boolean r5 = r15.A00()
            r9 = 0
            if (r5 != 0) goto L_0x1044
            if (r4 == 0) goto L_0x1059
            r5 = r15
            X.NVk r5 = (X.C68750NVk) r5
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r8 = r5.A07
            boolean r5 = r8.A0K
            if (r5 != 0) goto L_0x107f
            boolean r5 = r8.A0J
            if (r5 != 0) goto L_0x107f
            int r5 = r8.A00
            int r8 = r5 + -1
            r5 = 0
            if (r8 >= r5) goto L_0x1034
            r8 = 0
        L_0x1034:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
        L_0x1038:
            if (r5 == 0) goto L_0x1044
            int r8 = r5.intValue()
            r5 = 2
            X.MfE r9 = new X.MfE
            r9.<init>((int) r8, (boolean) r4, (int) r5)
        L_0x1044:
            X.NVx r4 = new X.NVx
            r19 = r12
            r20 = r14
            r21 = r13
            r22 = r11
            r17 = r9
            r18 = r10
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0dda
        L_0x1059:
            boolean r5 = r15 instanceof X.C68749NVj
            if (r5 == 0) goto L_0x106d
            r5 = r15
            X.NVj r5 = (X.C68749NVj) r5
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r8 = r5.A06
        L_0x1062:
            boolean r5 = r8.A0J
            if (r5 != 0) goto L_0x107f
            boolean r5 = r8.A0K
        L_0x1068:
            if (r5 != 0) goto L_0x107f
            int r8 = r8.A00
            goto L_0x1034
        L_0x106d:
            boolean r5 = r15 instanceof X.C68748NVi
            if (r5 == 0) goto L_0x1077
            r5 = r15
            X.NVi r5 = (X.C68748NVi) r5
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r8 = r5.A05
            goto L_0x1062
        L_0x1077:
            r5 = r15
            X.NVl r5 = (X.C68751NVl) r5
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r8 = r5.A05
            boolean r5 = r8.A0J
            goto L_0x1068
        L_0x107f:
            r5 = 0
            goto L_0x1038
        L_0x1081:
            r23 = 0
            goto L_0x1016
        L_0x1084:
            r8 = 2131165230(0x7f07002e, float:1.7944671E38)
            goto L_0x100b
        L_0x1088:
            r10 = r25
            goto L_0x1012
        L_0x108b:
            boolean r5 = r15 instanceof X.C68749NVj
            if (r5 != 0) goto L_0x109a
            boolean r5 = r15 instanceof X.C68748NVi
            if (r5 != 0) goto L_0x109a
            r5 = r15
            X.NVl r5 = (X.C68751NVl) r5
            java.lang.String r9 = r5.A06
            goto L_0x1004
        L_0x109a:
            r9 = 0
            goto L_0x1004
        L_0x109d:
            boolean r5 = r15 instanceof X.C68748NVi
            if (r5 == 0) goto L_0x10a8
            r5 = r15
            X.NVi r5 = (X.C68748NVi) r5
            java.lang.String r11 = r5.A07
            goto L_0x0ffd
        L_0x10a8:
            r11 = 0
            goto L_0x0ffd
        L_0x10ab:
            r8 = 0
            goto L_0x0fe7
        L_0x10ae:
            X.NjJ r8 = r10.A04
            r10 = 0
            int r9 = r8.ordinal()
            r8 = 14
            if (r9 == r8) goto L_0x10d6
            if (r9 == r10) goto L_0x10d1
            r8 = 10
            if (r9 != r8) goto L_0x0fd6
            X.EZo r21 = X.C48146EZo.DIRECT_INVITE_NOTIFICATION
            X.EZp r20 = X.C48147EZp.SUBSCRIBER_JOIN_CHAT_SHEET
        L_0x10c3:
            X.C50337FYu.A02(r5)
            java.lang.String r23 = "join_chat_sheet_rendered"
            java.lang.String r24 = "tap"
            r22 = r5
            X.C50337FYu.A01(r20, r21, r22, r23, r24, r25)
            goto L_0x0fd6
        L_0x10d1:
            X.EZo r21 = X.C48146EZo.STORY
            X.EZp r20 = X.C48147EZp.JOIN_CHAT_STICKER
            goto L_0x10c3
        L_0x10d6:
            X.EZo r21 = X.C48146EZo.SSC_LIST_IN_SUBSCRIPTION_SETTINGS
            X.EZp r20 = X.C48147EZp.CHANNEL_ROW
            goto L_0x10c3
        L_0x10db:
            boolean r5 = r15 instanceof X.C68749NVj
            if (r5 != 0) goto L_0x0fd6
            boolean r5 = r15 instanceof X.C68748NVi
            if (r5 != 0) goto L_0x0fd6
            X.NVl r10 = (X.C68751NVl) r10
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r11 = r10.A05
            boolean r9 = r11.A0D
            X.0eM r5 = r10.A07
            X.6gx r8 = X.DbZ.A0R(r5)
            java.lang.String r12 = r11.A0A
            X.NjJ r11 = r10.A01
            com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo r5 = r10.A04
            if (r9 == 0) goto L_0x1133
            if (r5 == 0) goto L_0x1130
            boolean r13 = r5.A03
            int r10 = r5.A00
        L_0x10fd:
            X.1Ln r9 = X.DbT.A0J(r8)
            boolean r5 = X.DbT.A1Y(r9)
            if (r5 == 0) goto L_0x0fd6
            X.DbW.A17(r9, r8)
            if (r13 == 0) goto L_0x112d
            java.lang.String r5 = "see_broadcast_chat_sheet_rendered"
        L_0x110e:
            X.DbV.A1M(r9, r5)
            X.OIo r5 = X.C69318NjJ.A00
            boolean r5 = r5.A00(r11)
            if (r5 == 0) goto L_0x1160
        L_0x1119:
            java.lang.String r5 = "broadcast_jcs_join_chat_button"
        L_0x111b:
            r9.A0p(r5)
            java.lang.String r5 = X.C313756gx.A02(r11)
            X.DbZ.A1L(r9, r5, r10)
            r9.A0s(r12)
            r9.Cgf()
            goto L_0x0fd6
        L_0x112d:
            java.lang.String r5 = "join_broadcast_chat_sheet_rendered"
            goto L_0x110e
        L_0x1130:
            r13 = 0
            r10 = 1
            goto L_0x10fd
        L_0x1133:
            if (r5 == 0) goto L_0x115e
            int r10 = r5.A00
        L_0x1137:
            r13 = 1
            X.1Ln r9 = X.DbT.A0J(r8)
            boolean r5 = X.DbT.A1Y(r9)
            if (r5 == 0) goto L_0x0fd6
            X.DbW.A17(r9, r8)
            java.lang.String r5 = "follow_to_join_chat_sheet_rendered"
            X.DbV.A1M(r9, r5)
            int r8 = r11.ordinal()
            r5 = 0
            if (r8 == r5) goto L_0x1119
            if (r8 == r13) goto L_0x1119
            r5 = 8
            if (r8 == r5) goto L_0x1163
            r5 = 9
            if (r8 != r5) goto L_0x1160
            java.lang.String r5 = "channel_name"
            goto L_0x111b
        L_0x115e:
            r10 = 1
            goto L_0x1137
        L_0x1160:
            java.lang.String r5 = "invite_link_join_chat_button"
            goto L_0x111b
        L_0x1163:
            java.lang.String r5 = "see_channel_tooltip"
            goto L_0x111b
        L_0x1166:
            X.NVj r15 = new X.NVj
            r16 = r11
            r17 = r8
            r18 = r7
            r19 = r9
            r20 = r10
            r21 = r4
            r22 = r0
            r23 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0d99
        L_0x117d:
            X.NVl r15 = new X.NVl
            r16 = r11
            r17 = r8
            r18 = r7
            r19 = r9
            r20 = r10
            r21 = r4
            r22 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0d99
        L_0x1192:
            X.NVk r15 = new X.NVk
            r19 = r7
            r20 = r9
            r21 = r10
            r22 = r4
            r23 = r0
            r24 = r5
            r17 = r8
            r18 = r12
            r16 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0d99
        L_0x11ab:
            r11 = r25
            goto L_0x0d58
        L_0x11af:
            boolean r1 = r0 instanceof X.NVq
            if (r1 == 0) goto L_0x1521
            java.lang.Object r1 = r3.A01
            X.Mu2 r1 = (X.C67749Mu2) r1
            X.NVq r0 = (X.NVq) r0
            X.Pri r0 = r0.A00
            goto L_0x0d43
        L_0x11bd:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r6 = r3.A01
            X.NVX r6 = (X.NVX) r6
            X.2t9 r5 = r6.A00
            if (r5 == 0) goto L_0x11ec
            com.instagram.common.recyclerview.ViewModelListUpdate r4 = X.DbS.A0R()
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x11d3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x11e6
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            X.N5Q r0 = new X.N5Q
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x11d3
        L_0x11e6:
            r4.A01(r3)
            r5.A05(r4)
        L_0x11ec:
            X.3oV r0 = r6.A01
            if (r0 != 0) goto L_0x153e
            java.lang.String r3 = "suggestionRecyclerView"
            goto L_0x001b
        L_0x11f4:
            r7 = 37
            boolean r1 = X.C66143MDv.A02(r7, r5)
            if (r1 == 0) goto L_0x121a
            r6 = r5
            X.MDv r6 = (X.C66143MDv) r6
            int r4 = r6.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r2
            if (r1 == 0) goto L_0x121a
            int r4 = r4 - r2
            r6.A00 = r4
        L_0x120a:
            java.lang.Object r7 = r6.A02
            X.1Hj r2 = X.1Hj.A02
            int r1 = r6.A00
            r5 = 1
            if (r1 == 0) goto L_0x1220
            if (r1 == r5) goto L_0x1745
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x121a:
            X.MDv r6 = new X.MDv
            r6.<init>(r3, r5, r7)
            goto L_0x120a
        L_0x1220:
            X.0eS.A00(r7)
            java.lang.Object r7 = r3.A01
            X.02o r7 = (X.02o) r7
            X.OOB r0 = (X.OOB) r0
            X.Njv r3 = X.C69356Njv.A09
            boolean r1 = r0.A04
            if (r1 == 0) goto L_0x154b
            X.OdW r1 = r0.A01
            X.ObS r10 = X.C71087ObS.A00()
            X.O5P r0 = r1.A01
            X.0sa r0 = r0.A00
            boolean r0 = X.C51971G9r.A1b(r0)
            if (r0 != 0) goto L_0x124d
            com.encryptedbackups.statemanager.model.UserNotAllowedException r0 = new com.encryptedbackups.statemanager.model.UserNotAllowedException
            r0.<init>()
        L_0x1244:
            X.N0J r1 = X.N0J.A00(r0)
        L_0x1248:
            r10.A05(r1)
            goto L_0x1578
        L_0x124d:
            X.OFl r1 = r1.A00
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x1299
            java.util.List r1 = r1.A01
            if (r1 == 0) goto L_0x129f
            boolean r0 = r1 instanceof java.util.Collection
            r4 = 0
            if (r0 == 0) goto L_0x126c
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x126c
        L_0x1262:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            X.N0I r1 = new X.N0I
            r1.<init>(r0)
            goto L_0x1248
        L_0x126c:
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1262
            java.lang.Object r1 = r1.next()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = "virtual_device_type"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.Nkq r0 = X.C69411Nkq.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r0 = com.facebook.graphql.enums.EnumHelper.A00(r1, r0)
            X.Nkq r0 = (X.C69411Nkq) r0
            X.0qQ.A07(r0)
            X.Njv r0 = X.C69684Nq6.A00(r0)
            if (r3 != r0) goto L_0x1262
            r4 = 1
            goto L_0x1262
        L_0x1299:
            com.encryptedbackups.statemanager.model.ApiCacheNotInitializedException r0 = new com.encryptedbackups.statemanager.model.ApiCacheNotInitializedException
            r0.<init>()
            goto L_0x1244
        L_0x129f:
            java.lang.String r6 = "virtualDevicesList"
            goto L_0x1306
        L_0x12a2:
            X.KgD r0 = (X.C62463KgD) r0
            int r2 = r0.ordinal()
            r1 = 1
            r0 = 0
            if (r2 == r0) goto L_0x12bb
            if (r2 != r1) goto L_0x15a7
            java.lang.Object r0 = r3.A01
            X.AE5 r0 = (X.AE5) r0
            com.instagram.igds.components.button.IgdsButton r0 = r0.A08
            if (r0 == 0) goto L_0x12c5
        L_0x12b6:
            r0.setLoading(r1)
            goto L_0x1e97
        L_0x12bb:
            java.lang.Object r0 = r3.A01
            X.AE5 r0 = (X.AE5) r0
            com.instagram.igds.components.button.IgdsButton r0 = r0.A08
            if (r0 == 0) goto L_0x12c5
            r1 = 0
            goto L_0x12b6
        L_0x12c5:
            java.lang.String r6 = "ctaButton"
            goto L_0x1306
        L_0x12c8:
            X.NoT r0 = (X.C69585NoT) r0
            boolean r1 = r0 instanceof X.C68754NVo
            r5 = 1
            java.lang.String r6 = "ctaButton"
            if (r1 == 0) goto L_0x12de
            java.lang.Object r0 = r3.A01
            X.NKN r0 = (X.NKN) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r0.A0G
            if (r0 == 0) goto L_0x1306
            r0.setShowProgressBar(r5)
            goto L_0x1e97
        L_0x12de:
            boolean r1 = r0 instanceof X.C68753NVn
            r4 = 0
            if (r1 == 0) goto L_0x130e
            java.lang.Object r3 = r3.A01
            X.NKN r3 = (X.NKN) r3
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r3.A0G
            if (r1 == 0) goto L_0x1306
            r1.setShowProgressBar(r4)
            com.instagram.ui.widget.progressbutton.ProgressButton r2 = r3.A0G
            if (r2 == 0) goto L_0x1306
            X.NVn r0 = (X.C68753NVn) r0
            java.lang.String r1 = r0.A00
            r2.setText((java.lang.CharSequence) r1)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r3.A0G
            if (r1 == 0) goto L_0x1306
            r1.setEnabled(r5)
            com.instagram.common.ui.base.IgTextView r1 = r3.A03
            if (r1 != 0) goto L_0x15ac
            java.lang.String r6 = "declineButton"
        L_0x1306:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x130e:
            boolean r1 = r0 instanceof X.C68752NVm
            if (r1 == 0) goto L_0x132d
            java.lang.Object r2 = r3.A01
            X.NKN r2 = (X.NKN) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A0G
            if (r1 == 0) goto L_0x1306
            r1.setShowProgressBar(r4)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A0G
            if (r1 == 0) goto L_0x1306
            X.NVm r0 = (X.C68752NVm) r0
            java.lang.String r0 = r0.A00
        L_0x1325:
            r1.setText((java.lang.CharSequence) r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r2.A0G
            if (r0 != 0) goto L_0x1388
            goto L_0x1306
        L_0x132d:
            boolean r0 = r0 instanceof X.C68755NVp
            if (r0 == 0) goto L_0x15bc
            java.lang.Object r2 = r3.A01
            X.NKN r2 = (X.NKN) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r2.A0G
            if (r0 == 0) goto L_0x1306
            r0.setShowProgressBar(r4)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A0G
            if (r1 == 0) goto L_0x1306
            r0 = 2131969281(0x7f134501, float:1.957548E38)
            java.lang.String r0 = r2.getString(r0)
            goto L_0x1325
        L_0x1348:
            X.2dZ r7 = r5.A0D
            if (r7 == 0) goto L_0x139f
            X.Nio r3 = X.C69288Nio.Enabled
            boolean r2 = X.AnonymousClass7TF.A1W(r6, r3)
            android.content.Context r0 = r5.getContext()
            int r0 = X.2Yu.A0D(r0)
            int r1 = X.1QE.A00(r0)
            android.content.Context r0 = r5.getContext()
            int r0 = X.2Yu.A09(r0)
            r7.A0W(r1, r0, r2)
            X.OI6 r2 = r5.A0Z
            if (r2 == 0) goto L_0x137b
            X.0eM r0 = r5.A1K
            r0.getValue()
            boolean r1 = X.AnonymousClass7TF.A1W(r6, r3)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r2.A09
            r0.setEnabled(r1)
        L_0x137b:
            boolean r0 = X.C68449NIn.A0e(r5)
            if (r0 == 0) goto L_0x1e97
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r5.A0e
            if (r0 == 0) goto L_0x1e97
            if (r6 != r3) goto L_0x1388
            r4 = 1
        L_0x1388:
            r0.setEnabled(r4)
            goto L_0x1e97
        L_0x138d:
            com.instagram.common.ui.base.IgTextView r1 = r3.A0M
            if (r1 == 0) goto L_0x139f
            r0 = 8
            r1.setVisibility(r0)
            X.C66581MXm.A1K(r3, r0)
            com.instagram.common.ui.base.IgEditText r0 = r3.A0H
            if (r0 != 0) goto L_0x15b7
            java.lang.String r12 = "noteEditText"
        L_0x139f:
            X.0qQ.A0F(r12)
            goto L_0x001e
        L_0x13a4:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x13a7:
            X.2t9 r5 = r1.A00
            com.instagram.common.recyclerview.ViewModelListUpdate r4 = X.DbS.A0R()
            android.content.res.Resources r3 = X.DbV.A05(r2)
            android.os.Bundle r2 = r2.mArguments
            if (r2 == 0) goto L_0x13c0
            java.lang.String r1 = "CONTENT_NOTE_ID_ARGUMENT"
            java.lang.String r2 = r2.getString(r1)
            r1 = 2131954059(0x7f13098b, float:1.9544607E38)
            if (r2 != 0) goto L_0x13c3
        L_0x13c0:
            r1 = 2131954067(0x7f130993, float:1.9544623E38)
        L_0x13c3:
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r3, r1)
            X.NPG r1 = new X.NPG
            r1.<init>(r2)
            r4.A00(r1)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x13d7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x1e79
            A00(r1, r2)
            goto L_0x13d7
        L_0x13e1:
            android.content.Context r2 = r5.requireContext()
            r1 = 2131238580(0x7f081eb4, float:1.8093443E38)
            int r0 = X.C66584MXp.A05(r5)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3JT.A05(r2, r1, r0)
            r3.setImageDrawable(r0)
            com.instagram.common.ui.base.IgTextView r0 = r5.A0L
            if (r0 == 0) goto L_0x1e97
        L_0x13f7:
            r0.setVisibility(r4)
            goto L_0x1e97
        L_0x13fc:
            X.C68449NIn.A0F(r5)
            goto L_0x1e97
        L_0x1401:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.C68449NIn.A0T(r5, r0)
        L_0x1408:
            com.instagram.common.session.UserSession r2 = X.C66580MXl.A0Q(r5)
            r0 = 36325828367234302(0x810e26000034fe, double:3.0359383595846146E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x1436
            X.MuH r4 = X.C68449NIn.A02(r5)
            X.KWa r3 = r4.A0P
            int r2 = r4.A0L
            java.util.List r0 = r3.A01
            java.util.List r1 = X.00k.A0d(r0, r2)
            java.util.List r0 = r3.A01
            java.util.List r0 = X.00k.A0c(r0, r2)
            java.util.ArrayList r0 = X.00k.A0U(r0)
            r0.addAll(r1)
            r3.A01 = r0
            r4.A08 = r1
        L_0x1436:
            X.0eM r2 = r5.A1T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.60k r1 = X.C3018660j.A01(r0)
            X.NmA r0 = X.C69466NmA.PROMPT
            r1.A09(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.60k r1 = X.C3018660j.A01(r0)
            X.Nmo r0 = X.C69506Nmo.A0B
            r1.A0C(r0)
            goto L_0x1e97
        L_0x1454:
            int r0 = X.DbW.A01(r2)
            r1.setVisibility(r0)
            goto L_0x1e97
        L_0x145d:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x1e97
        L_0x1464:
            java.util.List r0 = r0.A00
            java.util.Iterator r10 = r0.iterator()
        L_0x146a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x16a5
            java.lang.Object r0 = r10.next()
            X.PwE r0 = (X.C74519PwE) r0
            X.N57 r0 = (X.N57) r0
            java.lang.String r14 = r0.A0B
            java.lang.String r15 = r0.A0D
            java.lang.Integer r6 = r0.A07
            if (r14 == 0) goto L_0x146a
            if (r15 == 0) goto L_0x146a
            if (r6 == 0) goto L_0x146a
            int r6 = r6.intValue()
            long r6 = (long) r6
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            java.lang.String r9 = r0.A0C
            java.lang.Integer r13 = r0.A03
            com.instagram.api.schemas.BoostedActionStatus r12 = r0.A00
            java.lang.Integer r8 = r0.A01
            if (r8 == 0) goto L_0x14ea
            int r17 = r8.intValue()
        L_0x149a:
            java.lang.Integer r8 = r0.A02
            if (r8 == 0) goto L_0x14e7
            int r18 = r8.intValue()
        L_0x14a2:
            java.lang.Integer r8 = r0.A04
            if (r8 == 0) goto L_0x14e4
            int r19 = r8.intValue()
        L_0x14aa:
            java.lang.Integer r8 = r0.A05
            int r20 = X.DbX.A02(r8)
            java.lang.Integer r8 = r0.A06
            if (r8 == 0) goto L_0x14e1
            int r21 = r8.intValue()
        L_0x14b8:
            java.lang.Integer r8 = r0.A08
            if (r8 == 0) goto L_0x14de
            int r22 = r8.intValue()
        L_0x14c0:
            java.lang.Integer r8 = r0.A09
            if (r8 == 0) goto L_0x14db
            int r23 = r8.intValue()
        L_0x14c8:
            java.lang.Integer r0 = r0.A0A
            int r24 = X.DbX.A02(r0)
            X.Ou9 r11 = new X.Ou9
            r25 = r6
            r16 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r4.add(r11)
            goto L_0x146a
        L_0x14db:
            r23 = -1
            goto L_0x14c8
        L_0x14de:
            r22 = -1
            goto L_0x14c0
        L_0x14e1:
            r21 = -1
            goto L_0x14b8
        L_0x14e4:
            r19 = -1
            goto L_0x14aa
        L_0x14e7:
            r18 = -1
            goto L_0x14a2
        L_0x14ea:
            r17 = -1
            goto L_0x149a
        L_0x14ed:
            java.lang.String r0 = X.C66654MaN.A00()
            r3.AAJ(r0, r1)
            java.lang.String r0 = "ig_thread_id"
            r3.AAJ(r0, r4)
            java.lang.String r0 = "consistent_thread_fbid"
            r3.AAJ(r0, r4)
            X.Mfe r1 = X.C321716ud.A00(r2, r5)
            java.lang.String r0 = "product"
            r3.A8M(r1, r0)
            java.lang.Long r1 = X.DbS.A0j(r2)
            java.lang.String r0 = "group_thread_subtype"
            r3.A9F(r0, r1)
            r3.Cgf()
            goto L_0x1e97
        L_0x1515:
            boolean r0 = r0 instanceof X.C65278LqX
            if (r0 == 0) goto L_0x1e97
            r0 = 2131963207(0x7f132d47, float:1.956316E38)
            X.C67749Mu2.A00(r1, r0)
            goto L_0x1e97
        L_0x1521:
            boolean r0 = r0 instanceof X.C68757NVs
            if (r0 == 0) goto L_0x1539
            java.lang.Object r0 = r3.A01
            X.Mu2 r0 = (X.C67749Mu2) r0
            X.05G r2 = r0.A0E
        L_0x152b:
            java.lang.Object r1 = r2.getValue()
            X.NVy r0 = X.C68763NVy.A00
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x152b
            goto L_0x1e97
        L_0x1539:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x153e:
            android.view.View r3 = r0.getView()
            java.lang.Runnable r2 = r6.A04
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayed(r2, r0)
            goto L_0x1e97
        L_0x154b:
            X.OZI r1 = r0.A00
            X.ObS r10 = X.C71087ObS.A00()
            X.O5P r0 = r1.A01
            X.0sa r0 = r0.A00
            boolean r0 = X.C51971G9r.A1b(r0)
            if (r0 != 0) goto L_0x155f
            X.OZI.A01(r10)
            goto L_0x1578
        L_0x155f:
            X.NAX r9 = r1.A02
            java.lang.Number r8 = r3.A00
            X.Opg r0 = X.C71722Opg.A00(r10, r5)
            X.68L r4 = X.C66581MXm.A0I(r9)
            com.facebook.msys.mca.MailboxFutureImpl r3 = X.C66581MXm.A0J(r4, r0)
            r1 = 6
            X.OoW r0 = new X.OoW
            r0.<init>(r1, r8, r3, r9)
            X.C66582MXn.A1D(r4, r0, r3)
        L_0x1578:
            java.util.concurrent.CountDownLatch r0 = r10.A01     // Catch:{ InterruptedException -> 0x157d }
            r0.await()     // Catch:{ InterruptedException -> 0x157d }
        L_0x157d:
            java.lang.Object r1 = r10.A00
            X.0qQ.A07(r1)
            X.Nnw r1 = (X.C69552Nnw) r1
            boolean r0 = r1 instanceof X.N0I
            if (r0 == 0) goto L_0x159c
            X.N0I r1 = (X.N0I) r1
            java.lang.Object r0 = r1.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
        L_0x1590:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A00 = r5
            java.lang.Object r0 = r7.emit(r0, r6)
            goto L_0x175d
        L_0x159c:
            boolean r0 = r1 instanceof X.N0J
            if (r0 == 0) goto L_0x15a2
            r0 = 0
            goto L_0x1590
        L_0x15a2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x15a7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x15ac:
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x15b2
            r4 = 8
        L_0x15b2:
            r1.setVisibility(r4)
            goto L_0x1e97
        L_0x15b7:
            X.C69979NvJ.A00(r0)
            goto L_0x1e97
        L_0x15bc:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x15c1:
            X.PrW r0 = (X.PrW) r0
            java.lang.Object r5 = r3.A01
            X.OLa r5 = (X.C70780OLa) r5
            X.05G r4 = r5.A04
            r2 = r0
            r3 = 0
            boolean r1 = r0 instanceof X.N8E
            if (r1 == 0) goto L_0x15e2
            X.N8E r2 = (X.N8E) r2
            int r2 = r2.A00
            if (r2 != r3) goto L_0x15dc
            X.P3q r0 = X.C72377P3q.A00
        L_0x15d7:
            r4.Epw(r0)
            goto L_0x1e97
        L_0x15dc:
            r1 = 1
            if (r2 != r1) goto L_0x15e2
            X.P3r r0 = X.C72378P3r.A00
            goto L_0x15d7
        L_0x15e2:
            boolean r1 = r0 instanceof X.N8F
            if (r1 == 0) goto L_0x15f2
            X.N8F r0 = (X.N8F) r0
            java.lang.String r1 = r0.A00
            r5.A00 = r1
            X.N8D r0 = new X.N8D
            r0.<init>(r1)
            goto L_0x15d7
        L_0x15f2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x15f7:
            r7 = 11
            boolean r1 = X.ME7.A02(r7, r5)
            if (r1 == 0) goto L_0x161d
            r1 = r5
            X.ME7 r1 = (X.ME7) r1
            int r6 = r1.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r6 & r4
            if (r2 == 0) goto L_0x161d
            int r6 = r6 - r4
            r1.A00 = r6
        L_0x160d:
            java.lang.Object r7 = r1.A02
            X.1Hj r2 = X.1Hj.A02
            int r4 = r1.A00
            r5 = 1
            if (r4 == 0) goto L_0x1623
            if (r4 == r5) goto L_0x1745
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x161d:
            X.ME7 r1 = new X.ME7
            r1.<init>(r3, r5, r7)
            goto L_0x160d
        L_0x1623:
            X.0eS.A00(r7)
            java.lang.Object r3 = r3.A01
            X.02o r3 = (X.02o) r3
            X.NoW r0 = (X.C69588NoW) r0
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            boolean r6 = r0 instanceof X.NW1
            if (r6 == 0) goto L_0x167d
            r6 = r0
            X.NW1 r6 = (X.NW1) r6
            java.lang.Object r6 = r6.A00
        L_0x163d:
            X.JwJ r6 = (X.C61081JwJ) r6
            java.lang.Object r7 = r6.A00
            java.util.List r7 = (java.util.List) r7
        L_0x1643:
            int r6 = r7.size()
            if (r6 <= r5) goto L_0x164e
            r6 = 19
            X.C73429PcU.A01(r6, r7)
        L_0x164e:
            java.util.Iterator r8 = r7.iterator()
        L_0x1652:
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto L_0x1687
            java.lang.Object r7 = r8.next()
            X.N2K r7 = (X.N2K) r7
            java.lang.String r11 = r7.A07
            com.instagram.user.model.User r6 = r7.A05
            com.instagram.common.typedurl.ImageUrl r10 = r6.Bh3()
            java.lang.String r12 = r6.getUsername()
            java.lang.String r13 = r7.A01
            java.lang.String r14 = r7.A06
            boolean r6 = r7.A08
            java.lang.String r15 = r7.A00
            X.Ou6 r9 = new X.Ou6
            r16 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r4.add(r9)
            goto L_0x1652
        L_0x167d:
            boolean r6 = r0 instanceof X.NW2
            if (r6 == 0) goto L_0x1643
            r6 = r0
            X.NW2 r6 = (X.NW2) r6
            java.lang.Object r6 = r6.A00
            goto L_0x163d
        L_0x1687:
            boolean r6 = r0 instanceof X.NW4
            if (r6 != 0) goto L_0x168f
            boolean r0 = r0 instanceof X.NW2
            if (r0 == 0) goto L_0x1697
        L_0x168f:
            X.Otf r0 = new X.Otf
            r0.<init>()
            r4.add(r0)
        L_0x1697:
            r0 = 4
            goto L_0x16a6
        L_0x1699:
            boolean r0 = r0 instanceof X.C59702JUj
            if (r0 == 0) goto L_0x16a5
            X.Otf r0 = new X.Otf
            r0.<init>()
            r4.add(r0)
        L_0x16a5:
            r0 = 3
        L_0x16a6:
            X.JwG r6 = new X.JwG
            r6.<init>((java.util.List) r4, (int) r0)
            goto L_0x1757
        L_0x16ad:
            X.JwG r0 = (X.C61078JwG) r0
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r3.A01
            X.Mtg r3 = (X.C67727Mtg) r3
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r4 = r1.iterator()
        L_0x16bf:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x16ed
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = X.C66580MXl.A0k(r4)
            java.lang.Long r1 = r1.A08
            if (r1 == 0) goto L_0x16e8
            long r9 = r1.longValue()
            X.OF2 r8 = r3.A00
            r11 = 0
            r12 = 5
            X.MGF r7 = new X.MGF
            r7.<init>((java.lang.Object) r8, (long) r9, (X.AnonymousClass4D7) r11, (int) r12)
            X.05E r2 = new X.05E
            r2.<init>(r7)
            X.MBw r1 = new X.MBw
            r1.<init>(r2, r9)
            r6.add(r1)
            goto L_0x16bf
        L_0x16e8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x16ed:
            java.util.List r2 = X.00k.A0a(r6)
            r1 = 0
            X.0r6[] r1 = new X.AnonymousClass0r6[r1]
            java.lang.Object[] r6 = r2.toArray(r1)
            X.0r6[] r6 = (X.AnonymousClass0r6[]) r6
            r1 = 7
            X.PeM r4 = new X.PeM
            r4.<init>(r1, r0, r3)
            r0 = 39
            X.PhU r3 = new X.PhU
            r3.<init>(r6, r0)
            r2 = 0
            r1 = 8
            X.JVp r0 = new X.JVp
            r0.<init>(r1, r2)
            java.lang.Object r2 = X.0zv.A00(r5, r3, r0, r4, r6)
            X.1Hj r0 = X.1Hj.A02
            if (r2 == r0) goto L_0x175d
            X.0gF r2 = X.C60340gF.A00
            goto L_0x175d
        L_0x171a:
            r7 = 2
            boolean r1 = X.ME7.A02(r7, r5)
            if (r1 == 0) goto L_0x173f
            r1 = r5
            X.ME7 r1 = (X.ME7) r1
            int r6 = r1.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r6 & r4
            if (r2 == 0) goto L_0x173f
            int r6 = r6 - r4
            r1.A00 = r6
        L_0x172f:
            java.lang.Object r7 = r1.A02
            X.1Hj r2 = X.1Hj.A02
            int r4 = r1.A00
            r5 = 1
            if (r4 == 0) goto L_0x174a
            if (r4 == r5) goto L_0x1745
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x173f:
            X.ME7 r1 = new X.ME7
            r1.<init>(r3, r5, r7)
            goto L_0x172f
        L_0x1745:
            X.0eS.A00(r7)
            goto L_0x1e97
        L_0x174a:
            X.0eS.A00(r7)
            java.lang.Object r3 = r3.A01
            X.02o r3 = (X.02o) r3
            X.Jv5 r0 = (X.C61006Jv5) r0
            java.lang.Object r6 = r0.A02
            if (r6 == 0) goto L_0x1e97
        L_0x1757:
            r1.A00 = r5
            java.lang.Object r0 = r3.emit(r6, r1)
        L_0x175d:
            if (r2 != r0) goto L_0x1e97
            return r2
        L_0x1760:
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x1e97
            java.lang.Object r3 = r3.A01
            X.NdC r3 = (X.NdC) r3
            java.util.List r4 = r3.A05
            r4.clear()
            java.util.List r0 = X.C71130OdT.A06(r0)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r0.iterator()
        L_0x1779:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x1792
            java.lang.Object r2 = r5.next()
            r1 = r2
            X.N4t r1 = (X.N4t) r1
            com.instagram.common.session.UserSession r0 = r3.A01
            boolean r0 = r1.A06(r0)
            if (r0 != 0) goto L_0x1779
            r6.add(r2)
            goto L_0x1779
        L_0x1792:
            com.instagram.common.session.UserSession r2 = r3.A01
            r1 = 10
            X.PcS r0 = new X.PcS
            r0.<init>((java.lang.Object) r2, (int) r1)
            java.util.List r1 = X.00k.A0g(r6, r0)
            r0 = 34
            java.util.List r0 = X.C73429PcU.A00(r1, r0)
            r4.addAll(r0)
            java.lang.String r0 = r3.A00
            int r0 = r0.length()
            if (r0 != 0) goto L_0x1e97
            java.util.List r0 = r3.A04
            r0.clear()
            r0.addAll(r4)
            r0 = 0
            X.NdC.A03(r0, r3)
            goto L_0x1e97
        L_0x17be:
            java.lang.Object r2 = r3.A01
            X.Mpb r2 = (X.C67541Mpb) r2
            r1 = 26
            X.PmD r3 = new X.PmD
            r3.<init>(r0, r1)
            X.05G r2 = r2.A05
        L_0x17cb:
            java.lang.Object r1 = r2.getValue()
            java.lang.Object r0 = r3.invoke(r1)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x17cb
            goto L_0x1e97
        L_0x17db:
            java.util.List r0 = (java.util.List) r0
            boolean r1 = X.AnonymousClass7TE.A1b(r0)
            if (r1 == 0) goto L_0x1e97
            java.lang.Object r3 = r3.A01
            X.Mtw r3 = (X.C67743Mtw) r3
            java.util.Iterator r5 = r0.iterator()
        L_0x17eb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x1844
            java.lang.Object r2 = r5.next()
            X.JvY r2 = (X.C61034JvY) r2
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x17eb
            com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository r4 = r3.A03
            java.lang.String r12 = r2.A05
            r7 = 0
            java.lang.Object r8 = r2.A02
            X.5yB r8 = (X.C300925yB) r8
            java.lang.String r13 = r2.A06
            int r0 = r2.A01
            java.lang.Integer r10 = X.JTO.A0w(r0)
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r3.A01
            com.instagram.user.model.User r9 = r1.A01(r0)
            java.lang.Object r11 = r2.A03
            java.lang.Integer r11 = (java.lang.Integer) r11
            r16 = 0
            X.N3F r6 = new X.N3F
            r14 = r7
            r15 = r7
            r17 = r16
            r18 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.05G r2 = r4.A03
            java.util.List r1 = X.AnonymousClass7TE.A1I(r6)
            java.lang.Object r0 = r2.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)
            r2.Epw(r0)
            X.05G r0 = r4.A02
            X.JTR.A1W(r0)
            goto L_0x17eb
        L_0x1844:
            X.LP4 r0 = r3.A02
            goto L_0x1e24
        L_0x1848:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x1e97
            java.lang.Object r0 = r3.A01
            X.NKL r0 = (X.NKL) r0
            X.0eM r0 = r0.A0R
            java.lang.Object r2 = r0.getValue()
            X.OLu r2 = (X.C70799OLu) r2
            X.3As r1 = r2.A03
            if (r1 == 0) goto L_0x1862
            r0 = 0
            r1.EaP(r0)
        L_0x1862:
            X.JiI r0 = r2.A00
            if (r0 == 0) goto L_0x1e97
            goto L_0x18e5
        L_0x1867:
            X.MpT r0 = (X.C67534MpT) r0
            java.lang.Object r4 = r3.A01
            X.49u r4 = (X.C2614949u) r4
            X.05G r3 = r4.A0D
        L_0x186f:
            java.lang.Object r5 = r3.getValue()
            r6 = r5
            X.4A9 r6 = (X.AnonymousClass4A9) r6
            com.instagram.common.session.UserSession r1 = r4.A01
            boolean r12 = X.AnonymousClass3HF.A02(r1)
            int r11 = r0.A00
            java.util.List r7 = r0.A02
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r7.iterator()
        L_0x1888:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x189c
            java.lang.Object r1 = r2.next()
            X.N3Q r1 = (X.N3Q) r1
            X.4AB r1 = r1.A03
            if (r1 == 0) goto L_0x1888
            r9.add(r1)
            goto L_0x1888
        L_0x189c:
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r2 = r7.iterator()
        L_0x18a4:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x18b6
            java.lang.Object r1 = r2.next()
            X.N3Q r1 = (X.N3Q) r1
            com.instagram.user.model.User r1 = r1.A04
            r10.add(r1)
            goto L_0x18a4
        L_0x18b6:
            java.lang.String r8 = r0.A01
            com.instagram.user.model.User r7 = r6.A04
            r1 = 0
            X.0qQ.A0B(r7, r1)
            X.4A9 r6 = new X.4A9
            r6.<init>(r7, r8, r9, r10, r11, r12)
            boolean r1 = r3.AIY(r5, r6)
            if (r1 == 0) goto L_0x186f
            goto L_0x1e97
        L_0x18cb:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x1e97
            java.lang.Object r2 = r3.A01
            X.NIu r2 = (X.C68456NIu) r2
            X.3As r1 = r2.A02
            if (r1 == 0) goto L_0x18dd
            r0 = 0
            r1.EaP(r0)
        L_0x18dd:
            X.0eM r0 = r2.A04
            java.lang.Object r0 = r0.getValue()
            X.JiI r0 = (X.C60261JiI) r0
        L_0x18e5:
            r0.A01()
            goto L_0x1e97
        L_0x18ea:
            X.9Ij r0 = (X.C376539Ij) r0
            java.lang.Object r1 = r3.A01
            X.MgA r1 = (X.C66976MgA) r1
            X.MjH r5 = r1.A02
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            java.util.HashSet r7 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r2.iterator()
        L_0x1902:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x1924
            java.lang.Object r4 = r6.next()
            r3 = r4
            X.4AB r3 = (X.AnonymousClass4AB) r3
            boolean r2 = r3.A0Q
            if (r2 == 0) goto L_0x1919
            java.lang.String r2 = r3.A0F
        L_0x1915:
            X.C51971G9r.A1O(r2, r4, r7, r11)
            goto L_0x1902
        L_0x1919:
            java.lang.String r2 = r3.A0G
            if (r2 != 0) goto L_0x1915
            com.instagram.user.model.User r2 = r3.A0A
            java.lang.String r2 = r2.getId()
            goto L_0x1915
        L_0x1924:
            java.lang.Object r9 = r0.A03
            X.4AS r9 = (X.AnonymousClass4AS) r9
            java.lang.Object r8 = r0.A04
            X.4A9 r8 = (X.AnonymousClass4A9) r8
            java.lang.Object r10 = r0.A02
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r7 = r0.A06
            X.Jw1 r7 = (X.C61063Jw1) r7
            java.lang.Object r12 = r0.A05
            java.util.List r12 = (java.util.List) r12
            X.MgE r6 = new X.MgE
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.Ma2 r3 = r5.A00
            X.MkX r2 = r3.A0f
            X.MkX r0 = X.C67237MkX.A06
            if (r2 == r0) goto L_0x1947
            if (r2 != 0) goto L_0x194e
        L_0x1947:
            X.Mbh r0 = X.C66581MXm.A0U(r3)
            r0.A06(r6)
        L_0x194e:
            com.instagram.common.session.UserSession r3 = r1.A06
            boolean r5 = X.AnonymousClass3HF.A02(r3)
            X.60k r11 = X.C3018660j.A01(r3)
            X.0eM r4 = r1.A08
            X.49u r0 = X.C66580MXl.A0X(r4)
            com.instagram.direct.inbox.notes.NotesRepository r2 = r0.A03
            com.instagram.common.session.UserSession r0 = r0.A01
            java.lang.String r0 = r0.A06
            int r15 = r2.A05(r0)
            X.49u r0 = X.C66580MXl.A0X(r4)
            X.0eM r0 = r0.A0A
            java.lang.Object r0 = r0.getValue()
            X.0Ud r0 = (X.AnonymousClass0Ud) r0
            java.lang.Object r0 = r0.getValue()
            X.9Ij r0 = (X.C376539Ij) r0
            java.lang.Object r0 = r0.A01
            int r16 = X.DbS.A05(r0)
            int r16 = r16 + r5
            r12 = 0
            r13 = r12
            r14 = r12
            r11.A0P(r12, r13, r14, r15, r16)
            X.49u r0 = X.C66580MXl.A0X(r4)
            X.0eM r0 = r0.A0A
            java.lang.Object r0 = r0.getValue()
            X.0Ud r0 = (X.AnonymousClass0Ud) r0
            java.lang.Object r0 = r0.getValue()
            X.9Ij r0 = (X.C376539Ij) r0
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            X.0qQ.A0B(r0, r5)
            java.util.Iterator r10 = r0.iterator()
        L_0x19a6:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x1a13
            java.lang.Object r6 = r10.next()
            X.4AB r6 = (X.AnonymousClass4AB) r6
            com.instagram.user.model.User r7 = r6.A0A
            if (r7 == 0) goto L_0x19a6
            X.4Cl r0 = r7.A03
            com.instagram.api.schemas.IGAIAgentType r0 = r0.AaX()
            if (r0 == 0) goto L_0x19a6
            int r2 = r0.ordinal()
            r0 = 1
            if (r2 == r0) goto L_0x1a10
            r0 = 2
            if (r2 == r0) goto L_0x1a0d
            r0 = 3
            if (r2 == r0) goto L_0x1a0a
            r0 = 4
            if (r2 != r0) goto L_0x19a6
            X.NmH r9 = X.C69473NmH.USER_GENERATED_CONSUMER_AGENT
        L_0x19d0:
            X.0wc r2 = r11.A05
            java.lang.String r0 = "ig_direct_notes_ai_item_generated"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r2, r0)
            boolean r0 = r8.isSampled()
            if (r0 == 0) goto L_0x19a6
            java.lang.String r0 = X.C3018760k.A02()
            X.C51965G9l.A1K(r8, r0)
            java.lang.String r2 = r7.getId()
            java.lang.String r0 = "target_user_id"
            r8.AAJ(r0, r2)
            java.lang.Integer r0 = r6.A02
            if (r0 == 0) goto L_0x1a07
            int r0 = r0.intValue()
            long r6 = (long) r0
        L_0x19f7:
            X.C66581MXm.A1E(r8, r6)
            r0 = 500(0x1f4, float:7.0E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A8M(r9, r0)
            r8.Cgf()
            goto L_0x19a6
        L_0x1a07:
            r6 = 0
            goto L_0x19f7
        L_0x1a0a:
            X.NmH r9 = X.C69473NmH.OFFICIAL_META_ASSISTANT
            goto L_0x19d0
        L_0x1a0d:
            X.NmH r9 = X.C69473NmH.META_GENERATED_CONSUMER_AGENT
            goto L_0x19d0
        L_0x1a10:
            X.NmH r9 = X.C69473NmH.CREATOR_AGENT
            goto L_0x19d0
        L_0x1a13:
            X.49u r0 = X.C66580MXl.A0X(r4)
            com.instagram.direct.inbox.notes.NotesRepository r2 = r0.A03
            com.instagram.common.session.UserSession r0 = r0.A01
            java.lang.String r0 = r0.A06
            int r0 = r2.A05(r0)
            if (r0 <= 0) goto L_0x1e97
            X.1Av r2 = X.1Au.A00(r3)
            boolean r0 = X.AnonymousClass4AJ.A08(r3)
            if (r0 == 0) goto L_0x1e97
            X.0xa r4 = r2.A01
            java.lang.String r3 = "has_seen_notes_lightweight_feedback_dialog_nux"
            boolean r0 = r4.getBoolean(r3, r5)
            if (r0 != 0) goto L_0x1e97
            androidx.fragment.app.Fragment r0 = r1.A04
            X.8ab r2 = X.DbW.A0U(r0)
            android.content.Context r1 = r0.requireContext()
            r0 = 2131237608(0x7f081ae8, float:1.8091471E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.A0j(r0)
            r2.A0r(r5)
            r0 = 2131964961(0x7f133421, float:1.9566718E38)
            r2.A09(r0)
            r0 = 2131964960(0x7f133420, float:1.9566716E38)
            r2.A08(r0)
            X.Dba.A1L(r2)
            r0 = 1
            X.DbX.A1V(r4, r3, r0)
            goto L_0x1e97
        L_0x1a63:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x1e97
            java.lang.Object r0 = r3.A01
            X.MgA r0 = (X.C66976MgA) r0
            androidx.fragment.app.Fragment r0 = r0.A04
            android.content.Context r0 = r0.requireContext()
            X.1xC r3 = X.1xC.A01
            X.6ap r2 = X.DbS.A0a()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131965112(0x7f1334b8, float:1.9567025E38)
            X.DbT.A1D(r1, r2, r0)
            X.DbY.A1K(r3, r2)
            goto L_0x1e97
        L_0x1a88:
            X.4dn r0 = (X.C268664dn) r0
            java.lang.Throwable r0 = r0.A00
            java.lang.String r4 = r0.getMessage()
            if (r4 == 0) goto L_0x1e97
            java.lang.Object r3 = r3.A01
            X.MgA r3 = (X.C66976MgA) r3
            java.lang.Throwable r0 = r0.getCause()
            r2 = 1
            if (r0 == 0) goto L_0x1e97
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x1e97
            java.lang.String r1 = X.AnonymousClass7TF.A0j(r0)
            java.lang.String r0 = "nonmentionable"
            boolean r0 = r1.equals(r0)
            if (r0 != r2) goto L_0x1e97
            androidx.fragment.app.Fragment r0 = r3.A04
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.8ab r1 = X.DbS.A0X(r2)
            r0 = 2131966156(0x7f1338cc, float:1.9569142E38)
            java.lang.String r0 = X.DbW.A0h(r2, r4, r0)
            r1.A05 = r0
            r0 = 2131966154(0x7f1338ca, float:1.9569138E38)
            X.DbU.A17(r2, r1, r0)
            X.Dba.A1L(r1)
            goto L_0x1e97
        L_0x1acd:
            X.4do r0 = (X.C268674do) r0
            java.lang.Object r0 = r0.A00
            X.1XP r0 = (X.1XP) r0
            java.lang.String r2 = r0.getErrorMessage()
            if (r2 == 0) goto L_0x1e97
            java.lang.Object r0 = r3.A01
            X.MgA r0 = (X.C66976MgA) r0
            androidx.fragment.app.Fragment r0 = r0.A04
            X.8ab r1 = X.DbW.A0U(r0)
            r0 = 2131966155(0x7f1338cb, float:1.956914E38)
            r1.A09(r0)
            r1.A0q(r2)
            X.Dba.A1L(r1)
            goto L_0x1e97
        L_0x1af1:
            X.3lr r0 = (X.C250663lr) r0
            java.lang.Object r5 = r3.A01
            X.MuH r5 = (X.C67761MuH) r5
            if (r0 == 0) goto L_0x1b6e
            X.EWe r3 = X.C48112EWe.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r2 = 1
            java.lang.String r1 = "listening_now_state"
            java.lang.Enum r1 = r0.getRequiredEnumField(r2, r1, r3)
            X.EWe r1 = (X.C48112EWe) r1
            if (r1 == 0) goto L_0x1b6e
            int r3 = r1.ordinal()
            r1 = 4
            if (r3 == r1) goto L_0x1b2e
            r0 = 3
            if (r3 == r0) goto L_0x1b29
            r0 = 5
            X.05G r2 = r5.A0A
            if (r3 == r0) goto L_0x1b26
            X.NWT r1 = X.NWT.A00
        L_0x1b17:
            r2.Epw(r1)
        L_0x1b1a:
            X.05G r1 = r5.A0E
            X.NjF r0 = X.C69314NjF.SPOTIFY_NOTE
            r1.Epw(r0)
            X.C67761MuH.A02(r5)
            goto L_0x1e97
        L_0x1b26:
            X.NWV r1 = X.NWV.A00
            goto L_0x1b17
        L_0x1b29:
            X.05G r2 = r5.A0A
            X.NWU r1 = X.NWU.A00
            goto L_0x1b17
        L_0x1b2e:
            com.instagram.common.session.UserSession r1 = r5.A0M
            X.1E5 r4 = X.1E4.A00(r1)
            java.lang.Class<com.instagram.api.schemas.ImmutablePandoListeningNowResponseInfo> r1 = com.instagram.api.schemas.ImmutablePandoListeningNowResponseInfo.class
            com.facebook.pando.TreeJNI r3 = r0.reinterpret(r1)
            com.instagram.api.schemas.ImmutablePandoListeningNowResponseInfo r3 = (com.instagram.api.schemas.ImmutablePandoListeningNowResponseInfo) r3
            java.util.HashSet r2 = X.AnonymousClass7TE.A1F()
            r0 = 0
            X.1E9 r1 = new X.1E9
            r1.<init>(r4, r2, r0)
            com.instagram.api.schemas.MusicInfo r0 = r3.BUr()
            if (r0 == 0) goto L_0x1b5f
            r0.E7j(r1)
        L_0x1b4f:
            r3.A00 = r0
            com.instagram.api.schemas.MusicInfo r0 = r3.BUr()
            X.05G r2 = r5.A0A
            if (r0 == 0) goto L_0x1b61
            X.NWS r1 = new X.NWS
            r1.<init>(r0)
            goto L_0x1b17
        L_0x1b5f:
            r0 = 0
            goto L_0x1b4f
        L_0x1b61:
            X.NWT r0 = X.NWT.A00
            r2.Epw(r0)
            java.lang.String r1 = "NotesCreationViewModel:updateListeningNowState"
            java.lang.String r0 = "music_info is null when listening_now_state is LISTENING_VALID_SONG"
            X.0wb.A03(r1, r0)
            goto L_0x1b1a
        L_0x1b6e:
            X.05G r1 = r5.A0A
            r0 = 0
            goto L_0x1e28
        L_0x1b73:
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r0 = r3.A01
            com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r0 = (com.instagram.direct.inbox.fragment.DirectSearchInboxFragment) r0
            X.OsH r0 = r0.A07
            if (r0 == 0) goto L_0x1e97
            X.PPc r0 = r0.A02
            r0.A0F = r1
            goto L_0x1e97
        L_0x1b85:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r3.A01
            com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r1 = (com.instagram.direct.inbox.fragment.DirectSearchInboxFragment) r1
            X.OsH r1 = r1.A07
            if (r1 == 0) goto L_0x1e97
            X.PPc r1 = r1.A02
            r1.A09 = r0
            goto L_0x1e97
        L_0x1b95:
            java.lang.Object r1 = r3.A01
            com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r1 = (com.instagram.direct.inbox.fragment.DirectSearchInboxFragment) r1
            X.OsH r1 = r1.A07
            if (r1 == 0) goto L_0x1e97
            X.PPc r1 = r1.A02
            r1.A05 = r0
            goto L_0x1e97
        L_0x1ba3:
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r0 = r3.A01
            com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r0 = (com.instagram.direct.inbox.fragment.DirectSearchInboxFragment) r0
            X.OsH r0 = r0.A07
            if (r0 == 0) goto L_0x1e97
            X.PPc r0 = r0.A02
            r0.A0D = r1
            goto L_0x1e97
        L_0x1bb5:
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r0 = r3.A01
            com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r0 = (com.instagram.direct.inbox.fragment.DirectSearchInboxFragment) r0
            X.OsH r0 = r0.A07
            if (r0 == 0) goto L_0x1e97
            X.PPc r0 = r0.A02
            r0.A0C = r1
            goto L_0x1e97
        L_0x1bc7:
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r0 = r3.A01
            com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r0 = (com.instagram.direct.inbox.fragment.DirectSearchInboxFragment) r0
            X.OsH r0 = r0.A07
            if (r0 == 0) goto L_0x1e97
            X.PPc r0 = r0.A02
            r0.A0E = r1
            goto L_0x1e97
        L_0x1bd9:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r3.A01
            com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r1 = (com.instagram.direct.inbox.fragment.DirectSearchInboxFragment) r1
            X.OsH r3 = r1.A07
            if (r3 == 0) goto L_0x1e97
            X.MtP r1 = X.C66581MXm.A0W(r1)
            java.lang.String r2 = r1.A00
            X.PPc r1 = r3.A02
            r1.A03(r0, r2)
            goto L_0x1e97
        L_0x1bf0:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r3.A01
            X.4mt r1 = (X.C273624mt) r1
            X.Ma2 r2 = r1.A05
            if (r2 == 0) goto L_0x1e97
            r3 = 0
            X.0qQ.A0B(r0, r3)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x1c25
            java.lang.Object r1 = r0.get(r3)
            X.MmB r1 = (X.C67335MmB) r1
            java.util.List r1 = r1.A01
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x1c25
            X.Mbh r2 = X.C66581MXm.A0U(r2)
            java.lang.Object r0 = r0.get(r3)
            X.MmB r0 = (X.C67335MmB) r0
            java.util.List r1 = r0.A01
            boolean r0 = r2.A0L
            r2.A0A(r1, r3, r0, r3)
            goto L_0x1e97
        L_0x1c25:
            X.Mbh r0 = X.C66581MXm.A0U(r2)
            X.C66736Mbh.A03(r0)
            goto L_0x1e97
        L_0x1c2e:
            X.NoY r0 = (X.C69590NoY) r0
            boolean r1 = r0 instanceof X.NW9
            if (r1 == 0) goto L_0x1c92
            java.lang.Object r5 = r3.A01
            X.NJR r5 = (X.NJR) r5
            X.NW9 r0 = (X.NW9) r0
            int r1 = r0.A00
            int r0 = r0.A01
            X.NJR.A02(r5, r1, r0)
            java.lang.Integer r2 = r5.A07
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r2 != r1) goto L_0x1c80
            X.0eM r0 = r5.A0F
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1Av r6 = X.1Au.A00(r0)
            java.lang.String r4 = "business_inbox_customer_details_saved_tooltip_impression"
            r2 = 0
            X.0xa r1 = r6.A01
            int r0 = r1.getInt(r4, r2)
            r3 = 3
            if (r0 >= r3) goto L_0x1c78
            int r0 = r1.getInt(r4, r2)
            int r0 = r0 + 1
            r6.A0z(r4, r0)
            X.12T r1 = X.AnonymousClass12T.A00
            r2 = 0
            r0 = 994363717(0x3b44c945, float:0.0030027193)
            X.0nV r1 = r1.CO6(r0, r3)
            X.GPB r0 = new X.GPB
            r0.<init>(r5, r2)
            X.1ES.A07(r1, r0)
        L_0x1c78:
            r5.onBackPressed()
            X.Dbb.A0z(r5)
            goto L_0x1e97
        L_0x1c80:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r2 != r0) goto L_0x1e97
            android.view.View r0 = r5.A00
            if (r0 == 0) goto L_0x1c8b
            X.0nA.A0N(r0)
        L_0x1c8b:
            r5.A06 = r1
            X.C66582MXn.A16(r5)
            goto L_0x1e97
        L_0x1c92:
            boolean r1 = r0 instanceof X.NWA
            if (r1 == 0) goto L_0x1cac
            java.lang.Object r4 = r3.A01
            X.NJR r4 = (X.NJR) r4
            X.NWA r0 = (X.NWA) r0
            java.lang.String r3 = r0.A01
            java.lang.String r2 = r0.A03
            java.lang.String r1 = r0.A02
            java.lang.String r0 = r0.A00
            X.NJR.A03(r4, r3, r2, r1, r0)
            X.NJR.A01(r4)
            goto L_0x1e97
        L_0x1cac:
            boolean r0 = r0 instanceof X.NWC
            if (r0 == 0) goto L_0x1e97
            java.lang.Object r6 = r3.A01
            X.NJR r6 = (X.NJR) r6
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r6.A06 = r0
            r2 = 1000(0x3e8, double:4.94E-321)
            X.12T r5 = X.AnonymousClass12T.A00
            r4 = 0
            r1 = 994363717(0x3b44c945, float:0.0030027193)
            r0 = 3
            X.0nV r1 = r5.CO6(r1, r0)
            X.MEM r0 = new X.MEM
            r0.<init>(r6, r4, r2)
            X.1ES.A07(r1, r0)
            goto L_0x1e97
        L_0x1ccf:
            X.9Hs r0 = (X.C376369Hs) r0
            java.lang.Object r1 = r3.A01
            X.Ma2 r1 = (X.C66633Ma2) r1
            X.4mt r2 = r1.A1N
            X.Mh5 r1 = new X.Mh5
            r1.<init>(r2, r0)
            X.11Z.A02(r1)
            goto L_0x1e97
        L_0x1ce1:
            X.9Hs r0 = (X.C376369Hs) r0
            java.lang.Object r5 = r3.A01
            X.NKQ r5 = (X.NKQ) r5
            long r3 = r0.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            r5.A0B = r0
            r5.A02()
            goto L_0x1e97
        L_0x1cf8:
            X.9Hs r0 = (X.C376369Hs) r0
            java.lang.Object r5 = r3.A01
            X.NJY r5 = (X.NJY) r5
            long r3 = r0.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            r5.A0m = r0
            X.NJY.A0E(r5)
            goto L_0x1e97
        L_0x1d0f:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r3.A01
            X.OO7 r1 = (X.OO7) r1
            X.LDS r1 = r1.A05
            r1.A00(r0)
            goto L_0x1e97
        L_0x1d1c:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r6 = r3.A01
            X.Mtt r6 = (X.C67740Mtt) r6
            java.util.List r4 = r6.A03
            r4.clear()
            X.0qQ.A0A(r0)
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x1d32:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x1d44
            java.lang.Object r1 = r2.next()
            X.2PM r1 = (X.2PM) r1
            java.lang.String r1 = r1.A06
            r3.add(r1)
            goto L_0x1d32
        L_0x1d44:
            r4.addAll(r3)
            X.05G r5 = r6.A04
        L_0x1d49:
            java.lang.Object r7 = r5.getValue()
            r9 = r7
            X.JV5 r9 = (X.JV5) r9
            boolean r10 = r9.A01
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x1d5a:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x1d95
            java.lang.Object r11 = r12.next()
            X.2PM r11 = (X.2PM) r11
            java.lang.String r15 = r11.A05
            com.instagram.common.session.UserSession r3 = r6.A01
            android.content.Context r2 = X.C51966G9m.A0P(r3)
            X.2EM r1 = r11.A00()
            java.lang.String r16 = X.C66786McX.A00(r2, r3, r1)
            java.lang.String r4 = r11.A06
            X.2EM r14 = r11.A00()
            boolean r3 = r11.A08
            boolean r2 = r11.A09
            boolean r1 = r11.A07
            X.N5x r13 = new X.N5x
            r19 = r2
            r20 = r1
            r21 = r10
            r17 = r4
            r18 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r8.add(r13)
            goto L_0x1d5a
        L_0x1d95:
            boolean r2 = r9.A01
            java.lang.Object r1 = r9.A03
            java.util.List r1 = (java.util.List) r1
            X.JV5 r1 = X.JV5.A00(r8, r1, r2)
            boolean r1 = r5.AIY(r7, r1)
            if (r1 == 0) goto L_0x1d49
            goto L_0x1e97
        L_0x1da7:
            java.util.List r0 = (java.util.List) r0
            boolean r1 = X.AnonymousClass7TE.A1b(r0)
            if (r1 == 0) goto L_0x1e97
            java.lang.Object r2 = r3.A01
            X.MuF r2 = (X.C67759MuF) r2
            java.util.Iterator r5 = r0.iterator()
        L_0x1db7:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x1e22
            java.lang.Object r3 = r5.next()
            X.JvY r3 = (X.C61034JvY) r3
            java.lang.String r1 = r3.A04
            java.lang.String r0 = r2.A0B
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x1db7
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r4 = r2.A06
            java.lang.String r12 = r3.A05
            r7 = 0
            java.lang.Object r8 = r3.A02
            X.5yB r8 = (X.C300925yB) r8
            java.lang.String r13 = r3.A06
            int r0 = r3.A01
            java.lang.Integer r10 = X.JTO.A0w(r0)
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r2.A04
            com.instagram.user.model.User r9 = r1.A01(r0)
            java.lang.Object r11 = r3.A03
            java.lang.Integer r11 = (java.lang.Integer) r11
            r16 = 0
            X.N3F r6 = new X.N3F
            r14 = r7
            r15 = r7
            r17 = r16
            r18 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.05G r3 = r4.A07
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r1.add(r6)
            java.lang.Object r0 = r3.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            r3.Epw(r1)
            X.05G r3 = r4.A05
            java.lang.Object r0 = r3.getValue()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            r1 = 1
            int r0 = r0 + 1
            X.JTP.A1W(r3, r0)
            X.05G r0 = r4.A08
            X.AnonymousClass7TF.A1O(r0, r1)
            goto L_0x1db7
        L_0x1e22:
            X.LP4 r0 = r2.A05
        L_0x1e24:
            X.05G r1 = r0.A02
            X.0sn r0 = X.0sn.A00
        L_0x1e28:
            r1.Epw(r0)
            goto L_0x1e97
        L_0x1e2c:
            boolean r1 = r0 instanceof X.NU4
            if (r1 == 0) goto L_0x1e37
            java.lang.Object r2 = r3.A01
            X.Mu9 r2 = (X.C67754Mu9) r2
            java.lang.String r0 = "restoring"
            goto L_0x1e94
        L_0x1e37:
            boolean r1 = r0 instanceof X.NU5
            if (r1 == 0) goto L_0x1e42
            java.lang.Object r2 = r3.A01
            X.Mu9 r2 = (X.C67754Mu9) r2
            java.lang.String r0 = "restore success"
            goto L_0x1e94
        L_0x1e42:
            boolean r0 = r0 instanceof X.NU2
            if (r0 == 0) goto L_0x1e97
            java.lang.Object r2 = r3.A01
            X.Mu9 r2 = (X.C67754Mu9) r2
            java.lang.String r0 = "restore failed"
            goto L_0x1e94
        L_0x1e4d:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r3.A01
            X.H1g r1 = (X.C54162H1g) r1
            X.PIF r1 = r1.A01
            if (r1 == 0) goto L_0x1e97
            X.2t9 r5 = r1.A00
            com.instagram.common.recyclerview.ViewModelListUpdate r4 = X.DbS.A0R()
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x1e65:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x1e79
            A00(r1, r2)
            goto L_0x1e65
        L_0x1e6f:
            X.2t9 r5 = r0.A00
            com.instagram.common.recyclerview.ViewModelListUpdate r4 = X.DbS.A0R()
            java.util.List r1 = X.00k.A0a(r1)
        L_0x1e79:
            r4.A01(r1)
            r5.A05(r4)
            goto L_0x1e97
        L_0x1e80:
            X.NoM r0 = (X.C69578NoM) r0
            boolean r1 = r0 instanceof X.NU5
            if (r1 == 0) goto L_0x1e9a
            java.lang.Object r2 = r3.A01
            X.Mu9 r2 = (X.C67754Mu9) r2
            java.lang.String r1 = "success: "
            X.NU5 r0 = (X.NU5) r0
            java.lang.String r0 = r0.A00
            java.lang.String r0 = X.002.A0R(r1, r0)
        L_0x1e94:
            X.C67754Mu9.A01(r2, r0)
        L_0x1e97:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x1e9a:
            boolean r0 = r0 instanceof X.NU2
            if (r0 == 0) goto L_0x1e97
            java.lang.Object r2 = r3.A01
            X.Mu9 r2 = (X.C67754Mu9) r2
            java.lang.String r0 = "load failed"
            goto L_0x1e94
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73529PeL.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
